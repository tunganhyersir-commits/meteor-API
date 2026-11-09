/* SPDX-License-Identifier: GPL-3.0-only */
package dev.meteorlib.foundation;

import java.util.Objects;
import java.util.regex.Pattern;

/** Stable lower-case identifier; independent of Minecraft mappings. */
public record NamespacedId(String namespace, String path) {
    private static final Pattern NAMESPACE = Pattern.compile("[a-z0-9_.-]+");
    private static final Pattern PATH = Pattern.compile("[a-z0-9_./-]+");

    public NamespacedId {
        Objects.requireNonNull(namespace, "namespace");
        Objects.requireNonNull(path, "path");
        if (!NAMESPACE.matcher(namespace).matches() || !PATH.matcher(path).matches())
            throw new IllegalArgumentException("Invalid id: " + namespace + ":" + path);
    }

    public static NamespacedId parse(String input) {
        Objects.requireNonNull(input, "input");
        int colon = input.indexOf(':');
        if (colon <= 0 || colon != input.lastIndexOf(':'))
            throw new IllegalArgumentException("Expected namespace:path");
        return new NamespacedId(input.substring(0, colon), input.substring(colon + 1));
    }

    @Override
    public String toString() { return namespace + ":" + path; }
}
