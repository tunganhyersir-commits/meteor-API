/* SPDX-License-Identifier: GPL-3.0-only */
package dev.meteorlib.api;

import dev.meteorlib.foundation.Registration;
import dev.meteorlib.foundation.ServiceRegistry;
import dev.meteorlib.foundation.TickScheduler;
import meteordevelopment.meteorclient.MeteorClient;
import meteordevelopment.meteorclient.commands.Command;
import meteordevelopment.meteorclient.commands.Commands;
import meteordevelopment.meteorclient.gui.GuiTheme;
import meteordevelopment.meteorclient.gui.GuiThemes;
import meteordevelopment.meteorclient.systems.System;
import meteordevelopment.meteorclient.systems.Systems;
import meteordevelopment.meteorclient.systems.hud.Hud;
import meteordevelopment.meteorclient.systems.modules.Modules;
import meteordevelopment.orbit.IEventBus;
import net.minecraft.client.MinecraftClient;

import java.util.List;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;

/** Additive conveniences. All original meteordevelopment.* classes remain directly available. */
public final class MeteorLib {
    public static final String VERSION = "0.1.0";
    public static final String MINECRAFT = "1.21.11";
    public static final String MIN_LOADER = "0.19.5";
    public static final String UPSTREAM_COMMIT = "48030717dc0d4898a195a713fb048bf597fc5b54";

    private MeteorLib() {}

    private static final class State {
        private static final ServiceRegistry SERVICES = new ServiceRegistry();
        private static final TickScheduler SCHEDULER = new TickScheduler(4096, 256,
            exception -> MeteorClient.LOG.error("MeteorLib scheduled action failed", exception));
        private static final java.util.IdentityHashMap<Object, Integer> LISTENERS = new java.util.IdentityHashMap<>();
    }

    public static void requireClientThread() {
        if (!MinecraftClient.getInstance().isOnThread())
            throw new IllegalStateException("Call this API on the Minecraft client thread");
    }

    public static MinecraftClient client() { requireClientThread(); return MinecraftClient.getInstance(); }
    public static IEventBus events() { requireClientThread(); return MeteorClient.EVENT_BUS; }
    public static Modules modules() { return system(Modules.class); }
    public static Hud hud() { return system(Hud.class); }

    public static <T extends System<?>> T system(Class<T> type) {
        requireClientThread();
        T system = Systems.get(Objects.requireNonNull(type, "type"));
        if (system == null) throw new IllegalStateException("Meteor system is not initialized: " + type.getName());
        return system;
    }

    public static GuiTheme theme() {
        requireClientThread();
        return Objects.requireNonNull(GuiThemes.get(), "Meteor themes have not initialized");
    }

    public static List<Command> commands() { requireClientThread(); return List.copyOf(Commands.COMMANDS); }
    public static ServiceRegistry services() { requireClientThread(); return State.SERVICES; }
    public static TickScheduler scheduler() { requireClientThread(); return State.SCHEDULER; }

    /** Listener must belong to a package registered by MeteorAddon.getPackage(). */
    public static Registration listen(Object listener) {
        requireClientThread();
        Objects.requireNonNull(listener, "listener");
        int count = State.LISTENERS.getOrDefault(listener, 0);
        if (count == 0) events().subscribe(listener);
        State.LISTENERS.put(listener, count + 1);
        return Registration.once(() -> {
            requireClientThread();
            int remaining = State.LISTENERS.getOrDefault(listener, 1) - 1;
            if (remaining == 0) {
                State.LISTENERS.remove(listener);
                events().unsubscribe(listener);
            } else State.LISTENERS.put(listener, remaining);
        });
    }

    public static void requireWorld() {
        MinecraftClient client = client();
        if (client.world == null || client.player == null)
            throw new IllegalStateException("This operation requires a loaded client world and player");
    }

    /** Marshal work to Minecraft; completion, including failure, is observable by the caller. */
    public static CompletableFuture<Void> execute(Runnable action) {
        Objects.requireNonNull(action, "action");
        CompletableFuture<Void> result = new CompletableFuture<>();
        try {
            MinecraftClient.getInstance().execute(() -> {
                if (result.isCancelled()) return;
                try { action.run(); result.complete(null); }
                catch (RuntimeException exception) { result.completeExceptionally(exception); }
            });
        } catch (RuntimeException exception) { result.completeExceptionally(exception); }
        return result;
    }
}
