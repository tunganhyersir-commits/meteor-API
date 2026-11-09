/* SPDX-License-Identifier: GPL-3.0-only */
package dev.meteorlib.api;

import net.fabricmc.loader.api.FabricLoader;

import java.util.LinkedHashMap;
import java.util.Map;

/** Local environment facts only; does not collect player, server, token or account data. */
public final class Diagnostics {
    private Diagnostics() {}

    public static Map<String, String> snapshot() {
        MeteorLib.requireClientThread();
        Map<String, String> info = new LinkedHashMap<>();
        info.put("meteorlib", MeteorLib.VERSION);
        info.put("upstreamCommit", MeteorLib.UPSTREAM_COMMIT);
        info.put("java", java.lang.System.getProperty("java.version"));
        for (String id : new String[]{"minecraft", "fabricloader", "meteor-client", "meteor-lib-api"}) {
            info.put(id, FabricLoader.getInstance().getModContainer(id)
                .map(mod -> mod.getMetadata().getVersion().getFriendlyString()).orElse("absent"));
        }
        info.put("modules", Integer.toString(MeteorLib.modules().getCount()));
        info.put("commands", Integer.toString(MeteorLib.commands().size()));
        info.put("hudTypes", Integer.toString(MeteorLib.hud().infos.size()));
        info.put("pendingTasks", Integer.toString(MeteorLib.scheduler().pending()));
        return java.util.Collections.unmodifiableMap(info);
    }
}
