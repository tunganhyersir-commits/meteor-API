/* SPDX-License-Identifier: GPL-3.0-only */
package dev.meteorapi.compat.client;

import net.fabricmc.loader.api.FabricLoader;

import java.util.LinkedHashMap;
import java.util.Map;

/** Local environment facts only; does not collect player, server, token or account data. */
public final class Diagnostics {
    private Diagnostics() {}

    public static Map<String, String> snapshot() {
        MeteorClientApi.requireClientThread();
        Map<String, String> info = new LinkedHashMap<>();
        info.put("meteorlib", MeteorClientApi.VERSION);
        info.put("upstreamCommit", MeteorClientApi.UPSTREAM_COMMIT);
        info.put("java", java.lang.System.getProperty("java.version"));
        for (String id : new String[]{"minecraft", "fabricloader", "meteor-client", "meteor-api"}) {
            info.put(id, FabricLoader.getInstance().getModContainer(id)
                .map(mod -> mod.getMetadata().getVersion().getFriendlyString()).orElse("absent"));
        }
        info.put("modules", Integer.toString(MeteorClientApi.modules().getCount()));
        info.put("commands", Integer.toString(MeteorClientApi.commands().size()));
        info.put("hudTypes", Integer.toString(MeteorClientApi.hud().infos.size()));
        info.put("pendingTasks", Integer.toString(MeteorClientApi.scheduler().pending()));
        return java.util.Collections.unmodifiableMap(info);
    }
}
