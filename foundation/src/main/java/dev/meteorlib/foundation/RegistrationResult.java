/* SPDX-License-Identifier: GPL-3.0-only */
package dev.meteorlib.foundation;

import java.util.Objects;
import java.util.Optional;
import java.util.function.Supplier;

/** Non-throwing result for normal registration failures; no swallowed JVM fatal errors. */
public record RegistrationResult<T>(Status status, Optional<T> value, String message) {
    public enum Status { REGISTERED, ALREADY_PRESENT, CONFLICT, INVALID, FAILED }

    public RegistrationResult {
        Objects.requireNonNull(status); Objects.requireNonNull(value); Objects.requireNonNull(message);
        if ((status == Status.REGISTERED || status == Status.ALREADY_PRESENT) != value.isPresent())
            throw new IllegalArgumentException("Successful result must have a value; failed result must not");
    }

    public boolean success() { return value.isPresent(); }

    public static <T> RegistrationResult<T> attempt(Supplier<T> action) {
        Objects.requireNonNull(action, "action");
        try { return new RegistrationResult<>(Status.REGISTERED, Optional.of(action.get()), "registered"); }
        catch (RegistrationConflictException conflict) {
            return new RegistrationResult<>(Status.CONFLICT, Optional.empty(), conflict.getMessage());
        } catch (IllegalArgumentException invalid) {
            return new RegistrationResult<>(Status.INVALID, Optional.empty(), Objects.toString(invalid.getMessage(), "invalid registration"));
        } catch (RuntimeException failure) {
            return new RegistrationResult<>(Status.FAILED, Optional.empty(), failure.toString());
        }
    }
}
