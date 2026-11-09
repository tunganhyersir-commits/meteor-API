/* SPDX-License-Identifier: GPL-3.0-only */
package dev.meteorapi.client;
import dev.meteorlib.foundation.NamespacedId;
import dev.meteorlib.foundation.ResourceScope;
import java.util.Objects;
import java.util.function.BiConsumer;
/** Reentrant-safe, thread-confined module lifecycle with complete cleanup on failed activation. */
public abstract class FeatureLifecycle implements AutoCloseable {
    public enum State { INACTIVE, ENABLING, ACTIVE, DISABLING }
    private final Thread owner = Thread.currentThread();
    private final NamespacedId id;
    private final BiConsumer<NamespacedId, RuntimeException> errors;
    private State state = State.INACTIVE;
    private ResourceScope resources;
    protected FeatureLifecycle(NamespacedId id, BiConsumer<NamespacedId, RuntimeException> errors) {
        this.id = Objects.requireNonNull(id); this.errors = Objects.requireNonNull(errors);
    }
    public final NamespacedId id() { return id; }
    public final State state() { requireOwner(); return state; }
    public final boolean active() { return state() == State.ACTIVE; }
    public final boolean enable() {
        requireOwner();
        if (state == State.ACTIVE) return true;
        if (state != State.INACTIVE) return false;
        state = State.ENABLING; ResourceScope created = new ResourceScope();
        try {
            onEnable(created); resources = created; state = State.ACTIVE; return true;
        } catch (RuntimeException error) {
            try { created.close(); } catch (RuntimeException cleanup) { error.addSuppressed(cleanup); }
            state = State.INACTIVE; report(error); return false;
        }
    }
    public final boolean disable() {
        requireOwner();
        if (state == State.INACTIVE) return true;
        if (state != State.ACTIVE) return false;
        state = State.DISABLING; boolean clean = true;
        try { onDisable(); } catch (RuntimeException error) { report(error); clean = false; }
        try { if (resources != null) resources.close(); }
        catch (RuntimeException error) { report(error); clean = false; }
        finally { resources = null; state = State.INACTIVE; }
        return clean;
    }
    public final boolean toggle() { return active() ? disable() : enable(); }
    @Override public final void close() { disable(); }
    protected abstract void onEnable(ResourceScope scope);
    protected void onDisable() {}
    private void report(RuntimeException error) { try { errors.accept(id, error); } catch (RuntimeException ignored) {} }
    private void requireOwner() { if (Thread.currentThread() != owner) throw new IllegalStateException("Module lifecycle requires its owner thread"); }
}
