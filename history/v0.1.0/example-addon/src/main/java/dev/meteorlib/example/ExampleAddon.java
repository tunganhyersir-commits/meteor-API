/* SPDX-License-Identifier: GPL-3.0-only */
package dev.meteorlib.example;

import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import dev.meteorlib.api.Diagnostics;
import dev.meteorlib.api.ManagedModule;
import dev.meteorlib.api.MeteorLib;
import dev.meteorlib.api.Registry;
import dev.meteorlib.api.AddonRegistry;
import dev.meteorlib.foundation.ResourceScope;
import meteordevelopment.meteorclient.addons.MeteorAddon;
import meteordevelopment.meteorclient.commands.Command;
import meteordevelopment.meteorclient.settings.IntSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.systems.hud.HudElement;
import meteordevelopment.meteorclient.systems.hud.HudElementInfo;
import meteordevelopment.meteorclient.systems.hud.HudGroup;
import meteordevelopment.meteorclient.systems.hud.HudRenderer;
import meteordevelopment.meteorclient.systems.modules.Category;
import meteordevelopment.meteorclient.utils.render.color.Color;
import net.minecraft.command.CommandSource;

/** Optional integration example, kept out of the library distribution by default. */
public final class ExampleAddon extends MeteorAddon {
    private static final AddonRegistry REGISTRY = new AddonRegistry("meteor-lib-example");
    public static Category CATEGORY;
    public static final HudGroup HUD_GROUP = new HudGroup("MeteorLib");

    @Override
    public void onRegisterCategories() { CATEGORY = REGISTRY.category("tools").value().orElse(null); }

    @Override
    public void onInitialize() {
        if (CATEGORY == null) return;
        REGISTRY.module("reminder", ReminderModule::new);
        REGISTRY.command("doctor", DoctorCommand::new);
        REGISTRY.hud("status", name -> StatusHud.INFO);
    }

    @Override
    public String getPackage() { return "dev.meteorlib.example"; }

    public static final class ReminderModule extends ManagedModule {
        private final Setting<Integer> ticks = settings.getDefaultGroup().add(new IntSetting.Builder()
            .name("delay-ticks").description("Ticks before the local reminder.")
            .defaultValue(40).min(1).sliderRange(1, 200).build());

        public ReminderModule(String name) { super(CATEGORY, name, "Shows a local message after a configurable number of ticks."); }

        @Override
        protected void onStart(ResourceScope resources) {
            resources.own(MeteorLib.scheduler().schedule(ticks.get(), () -> info("MeteorLib scheduler is working.")));
        }
    }

    public static final class DoctorCommand extends Command {
        public DoctorCommand(String name) { super(name, "Displays local MeteorLib version and registration counts."); }

        @Override
        public void build(LiteralArgumentBuilder<CommandSource> builder) {
            builder.executes(context -> {
                Diagnostics.snapshot().forEach((key, value) -> info("%s: %s", key, value));
                return SINGLE_SUCCESS;
            });
        }
    }

    public static final class StatusHud extends HudElement {
        public static final HudElementInfo<StatusHud> INFO = new HudElementInfo<>(
            HUD_GROUP, REGISTRY.name("status"), "Shows queued MeteorLib tasks.", StatusHud::new);

        public StatusHud() { super(INFO); }

        @Override
        public void render(HudRenderer renderer) {
            String text = "MeteorLib | queued: " + MeteorLib.scheduler().pending();
            setSize(renderer.textWidth(text, true), renderer.textHeight(true));
            renderer.text(text, x, y, Color.WHITE, true);
        }
    }
}
