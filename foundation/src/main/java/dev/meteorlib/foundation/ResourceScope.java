/* SPDX-License-Identifier: GPL-3.0-only */
package dev.meteorlib.foundation;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Objects;

/** Thread-confined ownership. Closes in reverse order and attempts every cleanup. */
public final class ResourceScope implements AutoCloseable {
    private final Thread owner = Thread.currentThread();
    private final Deque<AutoCloseable> resources = new ArrayDeque<>();
    private boolean closed;

    public <T extends AutoCloseable> T own(T resource) {
        checkOwner();
        if (closed) throw new IllegalStateException("Scope is closed; ownership was not transferred");
        resources.push(Objects.requireNonNull(resource, "resource"));
        return resource;
    }

    public Registration defer(Runnable cleanup) {
        return own(Registration.once(cleanup));
    }

    public boolean isClosed() {
        checkOwner();
        return closed;
    }

    @Override
    public void close() {
        checkOwner();
        if (closed) return;
        closed = true;
        RuntimeException failure = null;
        while (!resources.isEmpty()) {
            try {
                resources.pop().close();
            } catch (Exception exception) {
                if (failure == null) failure = new IllegalStateException("Resource cleanup failed", exception);
                else failure.addSuppressed(exception);
            }
        }
        if (failure != null) throw failure;
    }

    private void checkOwner() {
        if (Thread.currentThread() != owner) throw new IllegalStateException("Use ResourceScope on its owning thread");
    }
}
