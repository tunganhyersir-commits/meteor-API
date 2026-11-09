/* SPDX-License-Identifier: GPL-3.0-only */
package dev.meteorapi.compat;

import net.fabricmc.loader.api.FabricLoader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;

/** Capability/version discovery for optional integrations; no hard references to their classes. */
public final class Integrations {
    private Integrations() {}
    public static Optional<String> version(String modId) {
        return FabricLoader.getInstance().getModContainer(modId).map(mod -> mod.getMetadata().getVersion().getFriendlyString());
    }
    public static Map<String, String> installed() {
        Map<String, String> info = new LinkedHashMap<>();
        for (String id : new String[]{"meteor-api", "meteor-client", "modmenu", "packetfixer", "commonnetworking"})
            info.put(id, version(id).orElse("absent"));
        return Map.copyOf(info);
    }
    /** Read-only PacketFixer configuration adapter, preserving its settings and protocol limits. */
    public static Map<String, String> packetFixerLimits() {
        if (version("packetfixer").isEmpty()) return Map.of();
        Map<String, String> values = new LinkedHashMap<>();
        try {
            Class<?> config = Class.forName("dev.tonimatas.packetfixer.util.Config");
            for (String method : new String[]{"getNbtMaxSize", "getPacketSize", "getDecoderSize", "getVarInt21Size",
                    "getVarIntSize", "getVarLong", "getStringSize", "getChunkPacketData", "getReadTimeout",
                    "getLoginTimeout", "getKeepAliveTimeout", "getPlayerIdleTimeout", "isForceUnlimitedNbtEnabled"})
                values.put(method, String.valueOf(config.getMethod(method).invoke(null)));
        } catch (ReflectiveOperationException | LinkageError e) {
            dev.meteorapi.MeteorApi.LOG.warn("PacketFixer API shape differs from the supplied source", e);
            values.put("status", "unavailable API version");
        }
        return Map.copyOf(values);
    }
    /** Full Common Networking remains usable when installed; return its own handler rather than a lossy copy. */
    public static Optional<Object> commonNetworkHandler() {
        if (version("commonnetworking").isEmpty()) return Optional.empty();
        try {
            return Optional.ofNullable(Class.forName("commonnetwork.api.Network").getMethod("getNetworkHandler").invoke(null));
        } catch (ReflectiveOperationException | LinkageError e) {
            dev.meteorapi.MeteorApi.LOG.warn("Common Networking API is unavailable", e); return Optional.empty();
        }
    }
}
