/* SPDX-License-Identifier: GPL-3.0-only */
package dev.meteorapi.compat.client;

import dev.meteorlib.foundation.ResourceScope;
import meteordevelopment.meteorclient.systems.modules.Category;
import meteordevelopment.meteorclient.systems.modules.Module;

/** Each activation receives a fresh scope. Tasks/listeners owned by it are released on deactivation. */
public abstract class ManagedModule extends Module {
    private ResourceScope scope;

    protected ManagedModule(Category category, String name, String description) {
        super(category, name, description);
    }

    @Override
    public final void onActivate() {
        MeteorClientApi.requireClientThread();
        if (scope != null) throw new IllegalStateException("Already activated");
        scope = new ResourceScope();
        try { onStart(scope); }
        catch (RuntimeException exception) {
            try { disable(); }
            catch (RuntimeException cleanup) { exception.addSuppressed(cleanup); }
            throw exception;
        }
    }

    @Override
    public final void onDeactivate() {
        MeteorClientApi.requireClientThread();
        ResourceScope old = scope;
        scope = null;
        RuntimeException failure = null;
        try { onStop(); }
        catch (RuntimeException exception) { failure = exception; }
        try { if (old != null) old.close(); }
        catch (RuntimeException exception) {
            if (failure == null) failure = exception;
            else failure.addSuppressed(exception);
        }
        // Module.toggle() must reach its final active=false update, even if cleanup fails.
        if (failure != null) meteordevelopment.meteorclient.MeteorClient.LOG.error(
            "MeteorClientApi module cleanup failed: {}", name, failure);
    }

    protected abstract void onStart(ResourceScope resources);
    protected void onStop() {}
}
