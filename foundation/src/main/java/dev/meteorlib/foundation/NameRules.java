/* SPDX-License-Identifier: GPL-3.0-only */
package dev.meteorlib.foundation;

import java.util.Collection;
import java.util.HashSet;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;

/** Shared, testable name policy used before any upstream registry mutation. */
public final class NameRules {
  private NameRules() {}

  /** Human-readable fallback only; never use a display label as a registry identity. */
  public static String displayName(String identifier) {
    Objects.requireNonNull(identifier, "identifier");
    String local =
        identifier
            .substring(identifier.lastIndexOf('/') + 1)
            .replaceAll("(?<=[a-z0-9])(?=[A-Z])", " ")
            .replaceAll("[-_.]+", " ")
            .strip()
            .replaceAll("\\s+", " ");
    if (local.isEmpty()) return "Option";
    int end = local.offsetByCodePoints(0, 1);
    return local.substring(0, end).toUpperCase(Locale.ROOT) + local.substring(end);
  }

  public static String scoped(String namespace, String localName) {
    NamespacedId id = new NamespacedId(namespace, localName);
    // A single separator and restricted components make encoding unambiguous.
    if (!namespace.matches("[a-z][a-z0-9_-]*") || !localName.matches("[a-z][a-z0-9_-]*"))
      throw new IllegalArgumentException("Use [a-z][a-z0-9_-]* for owner and local name: " + id);
    return namespace + "." + localName;
  }

  public static void requireDistinct(Collection<String> names) {
    Set<String> normalized = new HashSet<>();
    for (String name : names) {
      Objects.requireNonNull(name, "name");
      if (name.isBlank() || name.chars().anyMatch(Character::isWhitespace))
        throw new IllegalArgumentException("Registry names cannot be blank or contain whitespace");
      if (!normalized.add(name.toLowerCase(Locale.ROOT)))
        throw new RegistrationConflictException(
            "Duplicate name/alias in the same registration: " + name);
    }
  }

  public static void rejectOverlap(
      Collection<String> proposed, Collection<String> existing, String kind) {
    Set<String> oldNames = new HashSet<>();
    for (String name : existing) oldNames.add(name.toLowerCase(Locale.ROOT));
    for (String name : proposed) {
      if (oldNames.contains(name.toLowerCase(Locale.ROOT)))
        throw new RegistrationConflictException("Conflicting " + kind + " name/alias: " + name);
    }
  }

  /** Meteor 1.21.11 Category.equals compares only the Java String hash. */
  public static void requireCategoryDistinct(String proposed, Collection<String> existing) {
    requireDistinct(java.util.List.of(proposed));
    for (String name : existing) {
      if (name.equalsIgnoreCase(proposed) || name.hashCode() == proposed.hashCode())
        throw new RegistrationConflictException(
            "Category name or hash collision: " + proposed + " / " + name);
    }
  }
}
