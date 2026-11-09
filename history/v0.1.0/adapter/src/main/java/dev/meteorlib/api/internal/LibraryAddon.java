/* SPDX-License-Identifier: GPL-3.0-only */
package dev.meteorlib.api.internal;

import dev.meteorlib.api.MeteorLib;
import meteordevelopment.meteorclient.addons.MeteorAddon;
import meteordevelopment.meteorclient.events.world.TickEvent;
import meteordevelopment.orbit.EventHandler;

public final class LibraryAddon extends MeteorAddon {
    private boolean initialized;
    @Override
    public void onInitialize() {
        if (initialized) return;
        MeteorLib.scheduler();
        MeteorLib.events().subscribe(this);
        initialized = true;
    }

    @EventHandler
    private void onTick(TickEvent.Post event) { MeteorLib.scheduler().tick(); }

    @Override
    public String getPackage() { return "dev.meteorlib.api"; }
}
