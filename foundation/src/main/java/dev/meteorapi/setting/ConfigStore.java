/* SPDX-License-Identifier: GPL-3.0-only */
package dev.meteorapi.setting;

import dev.meteorlib.foundation.NamespacedId;
import dev.meteorlib.foundation.RegistrationResult;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.nio.file.AtomicMoveNotSupportedException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Properties;

/** Unique setting IDs, UTF-8 persistence and atomic replacement; malformed values do not destroy valid ones. */
public final class ConfigStore {
    private final Map<NamespacedId, Setting<?>> values = new LinkedHashMap<>();
    private final Path file;
    private final Properties retained = new Properties();
    public ConfigStore(Path file) { this.file = file.toAbsolutePath(); }
    public synchronized <T> RegistrationResult<Setting<T>> add(Setting<T> setting) {
        Setting<?> existing = values.get(setting.id());
        if (existing == setting) return new RegistrationResult<>(RegistrationResult.Status.ALREADY_PRESENT, Optional.of(setting), "already present");
        if (existing != null) return new RegistrationResult<>(RegistrationResult.Status.CONFLICT, Optional.empty(), "Duplicate setting: " + setting.id());
        values.put(setting.id(), setting);
        return new RegistrationResult<>(RegistrationResult.Status.REGISTERED, Optional.of(setting), "registered");
    }
    public synchronized List<Setting<?>> settings() { return List.copyOf(values.values()); }
    public synchronized List<String> load() throws IOException {
        if (!Files.exists(file)) return List.of();
        if (Files.size(file) > 1_048_576) throw new IOException("Config exceeds 1 MiB");
        Properties properties = new Properties();
        try (Reader reader = Files.newBufferedReader(file, StandardCharsets.UTF_8)) { properties.load(reader); }
        retained.clear(); retained.putAll(properties);
        List<String> errors = new ArrayList<>();
        for (Setting<?> setting : values.values()) {
            String encoded = properties.getProperty(setting.id().toString());
            if (encoded != null && !setting.parse(encoded)) errors.add("Invalid value: " + setting.id());
        }
        return List.copyOf(errors);
    }
    public synchronized void save() throws IOException {
        Properties properties = new Properties();
        properties.putAll(retained);
        for (Setting<?> setting : values.values()) properties.setProperty(setting.id().toString(), setting.encode());
        Files.createDirectories(file.getParent());
        Path temp = Files.createTempFile(file.getParent(), "meteor-api-", ".tmp");
        try {
            try (Writer writer = Files.newBufferedWriter(temp, StandardCharsets.UTF_8)) { properties.store(writer, "Meteor API settings"); }
            try { Files.move(temp, file, StandardCopyOption.REPLACE_EXISTING, StandardCopyOption.ATOMIC_MOVE); }
            catch (AtomicMoveNotSupportedException unsupported) { Files.move(temp, file, StandardCopyOption.REPLACE_EXISTING); }
        } finally { Files.deleteIfExists(temp); }
    }
    public Path file() { return file; }
}
