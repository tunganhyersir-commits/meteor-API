/* SPDX-License-Identifier: GPL-3.0-only */
package dev.meteorapi.game;
import dev.meteorapi.MeteorApi;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.network.ClientPlayNetworkHandler;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.entity.player.PlayerInventory;
import java.util.Optional;
/** Typed access to the real game objects, with explicit world availability and thread requirements. */
public final class GameAccess {
    private GameAccess() {}
    public static MinecraftClient client() { MeteorApi.requireClientThread(); return MinecraftClient.getInstance(); }
    public static Optional<ClientPlayerEntity> player() { return Optional.ofNullable(client().player); }
    public static Optional<ClientWorld> world() { return Optional.ofNullable(client().world); }
    public static Optional<ClientPlayNetworkHandler> network() { return Optional.ofNullable(client().getNetworkHandler()); }
    public static Optional<PlayerInventory> inventory() { return player().map(ClientPlayerEntity::getInventory); }
    public static boolean inWorld() { var game = client(); return game.world != null && game.player != null; }
    public static void requireWorld() { if (!inWorld()) throw new IllegalStateException("A loaded client world and player are required"); }
}
