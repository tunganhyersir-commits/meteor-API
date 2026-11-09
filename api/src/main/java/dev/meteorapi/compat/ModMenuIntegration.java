/* SPDX-License-Identifier: GPL-3.0-only */
package dev.meteorapi.compat;
import com.terraformersmc.modmenu.api.ConfigScreenFactory;
import com.terraformersmc.modmenu.api.ModMenuApi;
import dev.meteorapi.MeteorApi;
/** Fabric only requests this optional entrypoint when Mod Menu is installed. */
public final class ModMenuIntegration implements ModMenuApi {
    @Override public ConfigScreenFactory<?> getModConfigScreenFactory() { return MeteorApi::screen; }
}
