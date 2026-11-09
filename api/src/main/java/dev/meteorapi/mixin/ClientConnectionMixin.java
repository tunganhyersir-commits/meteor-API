/* SPDX-License-Identifier: GPL-3.0-only */
package dev.meteorapi.mixin;

import dev.meteorapi.network.Packets;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.network.ClientConnection;
import net.minecraft.network.DisconnectionInfo;
import net.minecraft.network.packet.Packet;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

/** Additive hooks only: no redirects, cancellation, size changes, or exception suppression. */
@Mixin(value = ClientConnection.class, priority = 900)
abstract class ClientConnectionMixin {
    @Inject(method = "send(Lnet/minecraft/network/packet/Packet;Lio/netty/channel/ChannelFutureListener;Z)V", at = @At("HEAD"))
    private void meteorapi$send(Packet<?> packet, ChannelFutureListener listener, boolean flush, CallbackInfo ci) {
        Packets.observe(Packets.Phase.SEND, packet, (ClientConnection) (Object) this, null);
    }
    @Inject(method = "send(Lnet/minecraft/network/packet/Packet;Lio/netty/channel/ChannelFutureListener;Z)V", at = @At("RETURN"))
    private void meteorapi$enqueued(Packet<?> packet, ChannelFutureListener listener, boolean flush, CallbackInfo ci) {
        Packets.observe(Packets.Phase.ENQUEUED, packet, (ClientConnection) (Object) this, null);
    }
    @Inject(method = "channelRead0(Lio/netty/channel/ChannelHandlerContext;Lnet/minecraft/network/packet/Packet;)V", at = @At("HEAD"))
    private void meteorapi$receive(ChannelHandlerContext context, Packet<?> packet, CallbackInfo ci) {
        Packets.observe(Packets.Phase.RECEIVE, packet, (ClientConnection) (Object) this, null);
    }
    @Inject(method = "exceptionCaught", at = @At("HEAD"))
    private void meteorapi$error(ChannelHandlerContext context, Throwable error, CallbackInfo ci) {
        Packets.observe(Packets.Phase.ERROR, null, (ClientConnection) (Object) this, error);
    }
    @Inject(method = "disconnect(Lnet/minecraft/network/DisconnectionInfo;)V", at = @At("HEAD"))
    private void meteorapi$disconnect(DisconnectionInfo info, CallbackInfo ci) {
        Packets.observe(Packets.Phase.DISCONNECT, null, (ClientConnection) (Object) this, null);
    }
}
