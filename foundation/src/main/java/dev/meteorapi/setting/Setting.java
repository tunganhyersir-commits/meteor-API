/* SPDX-License-Identifier: GPL-3.0-only */
package dev.meteorapi.setting;

import dev.meteorapi.event.EventChannel;
import dev.meteorlib.foundation.NamespacedId;
import dev.meteorlib.foundation.Registration;
import dev.meteorlib.foundation.RegistrationResult;
import java.util.Objects;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

/**
 * Typed setting with validation, visibility, reset, serialization and revocable change listeners.
 */
public final class Setting<T> {
  public record Change<T>(T previous, T value) {}

  private final NamespacedId id;
  private final String description;
  private volatile String label;
  private final T defaultValue;
  private final ValueCodec<T> codec;
  private final Predicate<T> validator;
  private final BooleanSupplier visible;
  private final EventChannel<Change<T>> changes;
  private final UnaryOperator<T> snapshot;
  private volatile T value;

  public Setting(
      NamespacedId id,
      String description,
      T defaultValue,
      ValueCodec<T> codec,
      Predicate<T> validator,
      BooleanSupplier visible) {
    this(id, description, defaultValue, codec, validator, visible, UnaryOperator.identity());
  }

  public Setting(
      NamespacedId id,
      String description,
      T defaultValue,
      ValueCodec<T> codec,
      Predicate<T> validator,
      BooleanSupplier visible,
      UnaryOperator<T> snapshot) {
    this.id = Objects.requireNonNull(id);
    this.description = Objects.requireNonNull(description);
    this.label = dev.meteorlib.foundation.NameRules.displayName(id.path());
    this.snapshot = Objects.requireNonNull(snapshot);
    this.defaultValue = snapshot.apply(defaultValue);
    this.codec = Objects.requireNonNull(codec);
    this.validator = Objects.requireNonNull(validator);
    this.visible = Objects.requireNonNull(visible);
    if (!validator.test(defaultValue))
      throw new IllegalArgumentException("Invalid default for " + id);
    this.value = this.defaultValue;
    changes =
        new EventChannel<>(
            3,
            (listener, failure) ->
                java.lang.System.getLogger("MeteorAPI")
                    .log(
                        java.lang.System.Logger.Level.WARNING,
                        "Setting listener " + listener,
                        failure));
  }

  public NamespacedId id() {
    return id;
  }

  /** Display label; persistence and registration continue to use id(). */
  public String label() {
    return label;
  }

  public Setting<T> label(String label) {
    String next = Objects.requireNonNull(label, "label").strip();
    if (next.isEmpty()) throw new IllegalArgumentException("Setting label cannot be blank");
    this.label = next;
    return this;
  }

  public String description() {
    return description;
  }

  public T get() {
    return value;
  }

  public T defaultValue() {
    return defaultValue;
  }

  public boolean isVisible() {
    return visible.getAsBoolean();
  }

  public boolean changed() {
    return !Objects.equals(defaultValue, value);
  }

  public ValueCodec<T> codec() {
    return codec;
  }

  public boolean set(T next) {
    if (!validator.test(next)) return false;
    next = snapshot.apply(next);
    T previous;
    synchronized (this) {
      previous = value;
      if (Objects.equals(previous, next)) return true;
      value = next;
    }
    changes.post(new Change<>(previous, next));
    return true;
  }

  public boolean parse(String text) {
    try {
      return set(codec.decode(text));
    } catch (IllegalArgumentException invalid) {
      return false;
    }
  }

  public void reset() {
    set(defaultValue);
  }

  public String encode() {
    return codec.encode(value);
  }

  public RegistrationResult<Registration> onChanged(
      NamespacedId listener, Consumer<Change<T>> callback) {
    return changes.listen(listener, callback);
  }
}
