/* SPDX-License-Identifier: GPL-3.0-only */
package dev.meteorapi.ui;

import dev.meteorlib.foundation.NamespacedId;
import dev.meteorlib.foundation.Registration;
import dev.meteorlib.foundation.RegistrationResult;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;

/**
 * Owner-thread menu catalog. The screen type is generic so the catalog can be tested without
 * Minecraft.
 */
public final class MenuRegistry<S> {
  public record Entry<S>(NamespacedId id, String title, Function<S, S> factory) {
    public Entry {
      Objects.requireNonNull(id, "id");
      title = Objects.requireNonNull(title, "title").strip();
      if (title.isEmpty()) throw new IllegalArgumentException("Menu title cannot be blank");
      Objects.requireNonNull(factory, "factory");
    }
  }

  private final Thread owner = Thread.currentThread();
  private final Map<NamespacedId, Entry<S>> entries = new LinkedHashMap<>();

  public RegistrationResult<Registration> register(
      NamespacedId id, String title, Function<S, S> factory) {
    requireOwner();
    if (entries.containsKey(id))
      return new RegistrationResult<>(
          RegistrationResult.Status.CONFLICT, Optional.empty(), "Menu ID already exists: " + id);
    return RegistrationResult.attempt(
        () -> {
          Entry<S> entry = new Entry<>(id, title, factory);
          entries.put(id, entry);
          Registration once = Registration.once(() -> entries.remove(id, entry));
          return () -> {
            requireOwner();
            once.close();
          };
        });
  }

  public Optional<Entry<S>> find(NamespacedId id) {
    requireOwner();
    return Optional.ofNullable(entries.get(Objects.requireNonNull(id)));
  }

  public List<Entry<S>> entries() {
    requireOwner();
    return List.copyOf(entries.values());
  }

  public Optional<S> create(NamespacedId id, S parent) {
    requireOwner();
    Entry<S> entry = entries.get(Objects.requireNonNull(id));
    if (entry == null) return Optional.empty();
    S screen =
        Objects.requireNonNull(entry.factory().apply(parent), "Menu factory returned null: " + id);
    if (screen == parent)
      throw new IllegalArgumentException("Menu factory must create a child screen: " + id);
    return Optional.of(screen);
  }

  private void requireOwner() {
    if (Thread.currentThread() != owner)
      throw new IllegalStateException("Menu registry requires its owner thread");
  }
}
