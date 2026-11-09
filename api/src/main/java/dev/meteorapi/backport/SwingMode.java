/* SPDX-License-Identifier: GPL-3.0-only */
package dev.meteorapi.backport;
import dev.meteorapi.MeteorApi;
import net.minecraft.client.MinecraftClient;
import net.minecraft.network.packet.c2s.play.HandSwingC2SPacket;
import net.minecraft.util.Hand;
/** Both/Packet/Client/None are mapped to 1.21.11's swing packet and client animation. */
public enum SwingMode {
    Both, Packet, Client, None;
    public static SwingMode of(boolean client) { return client ? Client : Packet; }
    public boolean client() { return this == Client || this == Both; }
    public void attackSwing(Hand hand) {
        MeteorApi.requireClientThread();
        var client = MinecraftClient.getInstance();
        if (client.player == null || client.getNetworkHandler() == null) return;
        if (client()) client.player.swingHand(hand, false);
        if (this == Both || this == Packet) client.getNetworkHandler().sendPacket(new HandSwingC2SPacket(hand));
    }
    public void interactSwing(Hand hand) {
        MeteorApi.requireClientThread();
        var player = MinecraftClient.getInstance().player;
        if (client() && player != null) player.swingHand(hand, false);
    }
}
