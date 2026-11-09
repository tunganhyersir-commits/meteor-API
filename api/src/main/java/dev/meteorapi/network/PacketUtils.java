/* Uses Meteor Client's public packet catalog design. Copyright (c) Meteor Development. GPL-3.0-only. */
package dev.meteorapi.network;

import net.minecraft.network.NetworkSide;
import net.minecraft.network.packet.*;
import net.minecraft.util.Identifier;
import java.lang.reflect.Modifier;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/** 26.3 PacketType-based catalog adapted to the actual constants available in Minecraft 1.21.11. */
public final class PacketUtils {
    private PacketUtils() {}
    private static final Map<Identifier, PacketType<?>> CLIENTBOUND = new LinkedHashMap<>();
    private static final Map<Identifier, PacketType<?>> SERVERBOUND = new LinkedHashMap<>();
    static {
        for (Class<?> source : new Class<?>[]{CommonPackets.class, ConfigPackets.class, CookiePackets.class,
                HandshakePackets.class, LoginPackets.class, PingPackets.class, StatusPackets.class, PlayPackets.class}) {
            for (var field : source.getFields()) {
                if (Modifier.isStatic(field.getModifiers()) && field.getType() == PacketType.class) {
                    try {
                        PacketType<?> type = (PacketType<?>) field.get(null);
                        (type.side() == NetworkSide.CLIENTBOUND ? CLIENTBOUND : SERVERBOUND).put(type.id(), type);
                    } catch (IllegalAccessException exception) { throw new IllegalStateException("Cannot enumerate Minecraft packet types", exception); }
                }
            }
        }
    }
    public static Set<PacketType<?>> getPackets() {
        java.util.Set<PacketType<?>> all = new java.util.HashSet<>(CLIENTBOUND.values());
        all.addAll(SERVERBOUND.values()); return Set.copyOf(all);
    }
    public static Set<PacketType<?>> getClientboundPackets() { return Set.copyOf(CLIENTBOUND.values()); }
    public static Set<PacketType<?>> getServerboundPackets() { return Set.copyOf(SERVERBOUND.values()); }
    public static Map<String, String> getLegacyMappings() { return LegacyPacketNames.NAMES; }
    public static PacketType<?> getClientboundPacket(Identifier id) { return CLIENTBOUND.get(id); }
    public static PacketType<?> getServerboundPacket(Identifier id) { return SERVERBOUND.get(id); }
    public static PacketType<?> getPacket(Identifier id) {
        var packet = getClientboundPacket(id); return packet == null ? getServerboundPacket(id) : packet;
    }
    public static PacketType<?> getPacket(String name) {
        if (name.startsWith("clientbound/")) return CLIENTBOUND.get(Identifier.tryParse(name.substring(12)));
        if (name.startsWith("serverbound/")) return SERVERBOUND.get(Identifier.tryParse(name.substring(12)));
        String alias = LegacyPacketNames.NAMES.get(name);
        if (alias != null) return getPacket(alias);
        Identifier id = Identifier.tryParse(name);
        return id == null ? null : getPacket(id);
    }
}
