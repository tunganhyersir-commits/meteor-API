/* SPDX-License-Identifier: GPL-3.0-only */
package dev.meteorlib.foundation;

/** Strict registration conflict, converted to a result by the preferred AddonRegistry API. */
public final class RegistrationConflictException extends IllegalStateException {
    public RegistrationConflictException(String message) { super(message); }
}
