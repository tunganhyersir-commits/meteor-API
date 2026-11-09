/* SPDX-License-Identifier: GPL-3.0-only */
package dev.meteorapi.compat;

import dev.meteorapi.MeteorApi;
import dev.meteorapi.compat26.gui.WLongEdit;
import dev.meteorapi.compat26.settings.FileSetting;
import dev.meteorapi.compat26.settings.LongSetting;
import meteordevelopment.meteorclient.addons.MeteorAddon;
import meteordevelopment.meteorclient.gui.utils.SettingsWidgetFactory;
import meteordevelopment.meteorclient.gui.widgets.WWidget;
import net.fabricmc.loader.api.FabricLoader;

/** Optional: Meteor itself loads this entrypoint. Fabric does not instantiate it in an API-only profile. */
public final class MeteorBridgeAddon extends MeteorAddon {
    private boolean initialized;
    @Override public void onInitialize() {
        if (initialized) return;
        String version = FabricLoader.getInstance().getModContainer("meteor-client").orElseThrow()
            .getMetadata().getVersion().getFriendlyString();
        if (!version.equals("1.21.11-86")) {
            MeteorApi.LOG.warn("Meteor API bridge not enabled: expected Meteor 1.21.11-86, found {}", version);
            return;
        }
        SettingsWidgetFactory.registerCustomFactory(LongSetting.class, theme -> (table, raw) -> {
            LongSetting setting = (LongSetting) raw;
            WLongEdit editor = new WLongEdit(setting.get(), setting.min, setting.max);
            table.add(editor).expandX();
            editor.action = () -> setting.set(editor.get());
        });
        SettingsWidgetFactory.registerCustomFactory(FileSetting.class, theme -> (table, raw) -> {
            FileSetting setting = (FileSetting) raw;
            var button = table.add(theme.button(setting.get() == null ? "Select file" : setting.get().getName())).expandX().widget();
            button.action = () -> dev.meteorapi.ui.FileDialogs.openFile(setting.filter).whenComplete((file, error) -> MeteorApi.execute(() -> {
                if (error != null) MeteorApi.LOG.warn("Cannot select file", error);
                else file.ifPresent(path -> { setting.set(path.toFile()); button.set(path.getFileName().toString()); });
            }));
        });
        SettingsWidgetFactory.registerCustomFactory(dev.meteorapi.compat26.settings.PacketListSetting.class, theme -> (table, raw) -> {
            var setting = (dev.meteorapi.compat26.settings.PacketListSetting) raw;
            var button = table.add(theme.button("Select packets")).expandX().widget();
            button.action = () -> net.minecraft.client.MinecraftClient.getInstance().setScreen(
                new dev.meteorapi.compat26.gui.PacketBoolSettingScreen(theme, setting));
        });
        initialized = true;
        meteordevelopment.meteorclient.MeteorClient.EVENT_BUS.subscribe(this);
        MeteorApi.LOG.info("Optional Meteor Client API bridge initialized; original client registry remains separate");
    }
    @Override public String getPackage() { return "dev.meteorapi"; }

    @meteordevelopment.orbit.EventHandler
    private void onLegacyKey(meteordevelopment.meteorclient.events.meteor.KeyEvent event) {
        var adapted = meteordevelopment.meteorclient.MeteorClient.EVENT_BUS.post(
            dev.meteorapi.compat26.events.KeyInputEvent.get(event.input, event.action));
        if (adapted.isCancelled()) event.cancel();
    }
}
