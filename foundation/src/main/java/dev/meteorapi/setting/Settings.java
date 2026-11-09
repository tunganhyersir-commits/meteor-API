/* SPDX-License-Identifier: GPL-3.0-only */
package dev.meteorapi.setting;

import dev.meteorlib.foundation.NamespacedId;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.List;
import java.util.function.Function;

/** Short constructors keep validation and full typed access available. */
public final class Settings {
    private Settings() {}
    public static <T> ValueCodec<T> codec(Function<String, T> decode, Function<T, String> encode) {
        return new ValueCodec<>() {
            public T decode(String text) { return decode.apply(text); }
            public String encode(T value) { return encode.apply(value); }
        };
    }
    public static Setting<Long> longValue(NamespacedId id, long initial, long min, long max) {
        if (min > max) throw new IllegalArgumentException("min exceeds max");
        return new Setting<>(id, "", initial, codec(text -> Long.parseLong(text.trim()), Object::toString),
            value -> value != null && value >= min && value <= max, () -> true);
    }
    public static Setting<Double> doubleValue(NamespacedId id, double initial, double min, double max) {
        if (!Double.isFinite(min) || !Double.isFinite(max) || min > max) throw new IllegalArgumentException("Invalid bounds");
        return new Setting<>(id, "", initial, codec(text -> Double.parseDouble(text.trim()), Object::toString),
            value -> value != null && Double.isFinite(value) && value >= min && value <= max, () -> true);
    }
    public static Setting<Boolean> bool(NamespacedId id, boolean initial) {
        return new Setting<>(id, "", initial, codec(text -> {
            if (!text.equalsIgnoreCase("true") && !text.equalsIgnoreCase("false")) throw new IllegalArgumentException("Expected true/false");
            return Boolean.parseBoolean(text);
        }, Object::toString), value -> value != null, () -> true);
    }
    public static Setting<String> text(NamespacedId id, String initial, int maxLength) {
        return new Setting<>(id, "", initial, codec(Function.identity(), Function.identity()),
            value -> value != null && value.length() <= maxLength, () -> true);
    }
    public static <E extends Enum<E>> Setting<E> enumeration(NamespacedId id, E initial, Class<E> type) {
        return new Setting<>(id, "", initial, codec(text -> Enum.valueOf(type, text.trim()), Enum::name),
            value -> value != null, () -> true);
    }
    /** Null means no selection; existing files are validated without blocking a native-dialog thread. */
    public static Setting<Path> file(NamespacedId id, Path initial) {
        return new Setting<>(id, "", initial, codec(text -> text.isEmpty() ? null : Path.of(text),
            path -> path == null ? "" : path.toAbsolutePath().toString()),
            path -> path == null || Files.isRegularFile(path), () -> true);
    }
    public static Setting<List<String>> strings(NamespacedId id, List<String> initial, int maxEntries) {
        ValueCodec<List<String>> codec = codec(text -> {
            if (text.isEmpty()) return List.of();
            String[] items = text.split(",", -1);
            if (items.length > maxEntries) throw new IllegalArgumentException("Too many entries");
            return java.util.Arrays.stream(items).map(value -> new String(Base64.getUrlDecoder().decode(value), StandardCharsets.UTF_8)).toList();
        }, values -> values.stream().map(value -> Base64.getUrlEncoder().withoutPadding()
            .encodeToString(value.getBytes(StandardCharsets.UTF_8))).collect(java.util.stream.Collectors.joining(",")));
        // Prefix an element marker so an empty list and a one-element empty-string list differ.
        ValueCodec<List<String>> marked = codec(text -> {
            if (text.equals("0:")) return List.of();
            if (!text.startsWith("1:")) throw new IllegalArgumentException("Invalid list format");
            if (text.length() == 2) return List.of("");
            return codec.decode(text.substring(2));
        }, values -> values.isEmpty() ? "0:" : "1:" + codec.encode(values));
        return new Setting<>(id, "", List.copyOf(initial), marked,
            value -> value != null && value.size() <= maxEntries && value.stream().allMatch(java.util.Objects::nonNull), () -> true, List::copyOf);
    }
}
