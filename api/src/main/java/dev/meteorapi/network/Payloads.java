/* SPDX-License-Identifier: GPL-3.0-only */
package dev.meteorapi.network;

import dev.meteorapi.MeteorApi;
import dev.meteorlib.foundation.Registration;
import dev.meteorlib.foundation.RegistrationResult;
import net.fabricmc.fabric.api.client.networking.v1.ClientConfigurationNetworking;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.fabricmc.fabric.api.networking.v1.PayloadTypeRegistry;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.RegistryByteBuf;
import net.minecraft.network.codec.PacketCodec;
import net.minecraft.network.packet.CustomPayload;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;

/** Typed client payload API with explicit protocol phase/direction and collision checks. */
public final class Payloads {
    public enum SendResult { SENT, NOT_CONNECTED, CHANNEL_UNAVAILABLE }
    private static final Map<String, Slot<?>> RECEIVERS = new HashMap<>();
    private static final Map<String, Object> SENDERS = new HashMap<>();
    private Payloads() {}

    public static <T extends CustomPayload> RegistrationResult<Registration> playReceiver(
            CustomPayload.Id<T> type, PacketCodec<? super RegistryByteBuf, T> codec, Consumer<T> handler) {
        MeteorApi.requireClientThread();
        return receiver("play:" + type.id(), codec, handler, slot -> {
            if (ClientPlayNetworking.getGlobalReceivers().contains(type.id()))
                throw new dev.meteorlib.foundation.RegistrationConflictException("Existing play receiver: " + type.id());
            PayloadTypeRegistry.playS2C().register(type, codec);
            if (!ClientPlayNetworking.registerGlobalReceiver(type, (payload, context) -> deliver(slot, payload)))
                throw new dev.meteorlib.foundation.RegistrationConflictException("Play receiver registration was refused: " + type.id());
        });
    }

    public static <T extends CustomPayload> RegistrationResult<Registration> configurationReceiver(
            CustomPayload.Id<T> type, PacketCodec<? super PacketByteBuf, T> codec, Consumer<T> handler) {
        MeteorApi.requireClientThread();
        return receiver("configuration:" + type.id(), codec, handler, slot -> {
            if (ClientConfigurationNetworking.getGlobalReceivers().contains(type.id()))
                throw new dev.meteorlib.foundation.RegistrationConflictException("Existing configuration receiver: " + type.id());
            PayloadTypeRegistry.configurationS2C().register(type, codec);
            if (!ClientConfigurationNetworking.registerGlobalReceiver(type, (payload, context) -> deliver(slot, payload)))
                throw new dev.meteorlib.foundation.RegistrationConflictException("Configuration receiver registration was refused: " + type.id());
        });
    }

    public static <T extends CustomPayload> RegistrationResult<CustomPayload.Id<T>> playSender(
            CustomPayload.Id<T> type, PacketCodec<? super RegistryByteBuf, T> codec) {
        return sender("play:" + type.id(), type, codec, () -> PayloadTypeRegistry.playC2S().register(type, codec));
    }
    public static <T extends CustomPayload> RegistrationResult<CustomPayload.Id<T>> configurationSender(
            CustomPayload.Id<T> type, PacketCodec<? super PacketByteBuf, T> codec) {
        return sender("configuration:" + type.id(), type, codec, () -> PayloadTypeRegistry.configurationC2S().register(type, codec));
    }
    private static <T extends CustomPayload> RegistrationResult<CustomPayload.Id<T>> sender(
            String key, CustomPayload.Id<T> type, Object codec, Runnable register) {
        MeteorApi.requireClientThread();
        if (SENDERS.get(key) == codec) return new RegistrationResult<>(RegistrationResult.Status.ALREADY_PRESENT, Optional.of(type), "already registered");
        if (SENDERS.containsKey(key)) return conflict("Different codec already owns " + key);
        RegistrationResult<CustomPayload.Id<T>> result = RegistrationResult.attempt(() -> { register.run(); SENDERS.put(key, codec); return type; });
        return result;
    }

    @SuppressWarnings("unchecked")
    private static <T extends CustomPayload> RegistrationResult<Registration> receiver(
            String key, Object codec, Consumer<T> handler, Consumer<Slot<T>> register) {
        java.util.Objects.requireNonNull(handler);
        Slot<T> slot = (Slot<T>) RECEIVERS.get(key);
        if (slot != null && (slot.codec != codec || slot.handler.get() != null)) return conflict("Receiver ID/codec already owned: " + key);
        if (slot == null) {
            slot = new Slot<>(codec);
            Slot<T> created = slot;
            var result = RegistrationResult.attempt(() -> { register.accept(created); return created; });
            if (!result.success()) return new RegistrationResult<>(result.status(), Optional.empty(), result.message());
            RECEIVERS.put(key, created);
        }
        Slot<T> owned = slot;
        owned.handler.set(handler);
        return new RegistrationResult<>(RegistrationResult.Status.REGISTERED,
            Optional.of(Registration.once(() -> owned.handler.compareAndSet(handler, null))), "registered");
    }
    private static <T extends CustomPayload> void deliver(Slot<T> slot, T payload) {
        Consumer<T> expected = slot.handler.get();
        if (expected == null) return;
        MeteorApi.execute(() -> {
            if (slot.handler.get() != expected) return;
            try { expected.accept(payload); }
            catch (RuntimeException e) { MeteorApi.LOG.warn("Custom payload handler failed", e); }
        });
    }
    private static <T> RegistrationResult<T> conflict(String message) {
        return new RegistrationResult<>(RegistrationResult.Status.CONFLICT, Optional.empty(), message);
    }
    private static final class Slot<T> {
        final Object codec;
        final AtomicReference<Consumer<T>> handler = new AtomicReference<>();
        Slot(Object codec) { this.codec = codec; }
    }
    public static SendResult sendPlay(CustomPayload payload) {
        MeteorApi.requireClientThread();
        if (net.minecraft.client.MinecraftClient.getInstance().getNetworkHandler() == null) return SendResult.NOT_CONNECTED;
        if (!ClientPlayNetworking.canSend(payload.getId())) return SendResult.CHANNEL_UNAVAILABLE;
        ClientPlayNetworking.send(payload); return SendResult.SENT;
    }
    public static SendResult sendConfiguration(CustomPayload payload) {
        MeteorApi.requireClientThread();
        try {
            if (!ClientConfigurationNetworking.canSend(payload.getId())) return SendResult.CHANNEL_UNAVAILABLE;
            ClientConfigurationNetworking.send(payload); return SendResult.SENT;
        } catch (IllegalStateException unavailable) { return SendResult.NOT_CONNECTED; }
    }
}
