/* SPDX-License-Identifier: GPL-3.0-only */
package dev.meteorapi.internal;
import dev.meteorapi.MeteorApi;
import net.fabricmc.api.ClientModInitializer;
import java.io.IOException;
public final class ApiInitializer implements ClientModInitializer {
    @Override public void onInitializeClient() {
        dev.meteorapi.render.WorldRendering.initialize();
        net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientLifecycleEvents.CLIENT_STOPPING.register(game -> {
            for (var client : dev.meteorapi.client.Clients.all()) client.close();
        });
        MeteorApi.config().add(MeteorApi.OPEN_KEY);
        try { MeteorApi.config().load().forEach(MeteorApi.LOG::warn); }
        catch (IOException | IllegalArgumentException e) { MeteorApi.LOG.warn("Cannot load Meteor API config", e); }
        MeteorApi.LOG.info("Meteor API {} · independent library; Meteor Client installed: {}", MeteorApi.VERSION, MeteorApi.hasMeteorClient());
    }
}
