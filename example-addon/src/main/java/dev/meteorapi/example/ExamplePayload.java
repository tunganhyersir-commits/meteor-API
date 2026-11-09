/* SPDX-License-Identifier: GPL-3.0-only */
package dev.meteorapi.example;
import net.minecraft.network.RegistryByteBuf;
import net.minecraft.network.codec.PacketCodec;
import net.minecraft.network.packet.CustomPayload;
import net.minecraft.util.Identifier;
/** Illustrative schema: register on BOTH peers before use. Not automatically sent to arbitrary servers. */
public record ExamplePayload(String text) implements CustomPayload {
    public static final Id<ExamplePayload> ID = new Id<>(Identifier.of("meteor-api-example", "message"));
    public static final PacketCodec<RegistryByteBuf, ExamplePayload> CODEC = PacketCodec.of(
        (payload, buffer) -> buffer.writeString(payload.text(), 256),
        buffer -> new ExamplePayload(buffer.readString(256)));
    @Override public Id<? extends CustomPayload> getId() { return ID; }
}
