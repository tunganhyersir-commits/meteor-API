/* SPDX-License-Identifier: GPL-3.0-only */
package dev.meteorlib.foundation;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/** A revocable action that executes at most once, including under concurrent close calls. */
@FunctionalInterface
public interface Registration extends AutoCloseable {
    @Override
    void close();

    static Registration once(Runnable action) {
        Objects.requireNonNull(action, "action");
        AtomicBoolean closed = new AtomicBoolean();
        return () -> {
            if (closed.compareAndSet(false, true)) action.run();
        };
    }
}
