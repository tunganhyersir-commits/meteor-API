/* SPDX-License-Identifier: GPL-3.0-only */
package dev.meteorapi.mixin;
import dev.meteorapi.MeteorApi;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.hud.InGameHud;
import net.minecraft.client.render.RenderTickCounter;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
@Mixin(InGameHud.class)
abstract class InGameHudMixin {
    @Inject(method = "render", at = @At("TAIL"))
    private void meteorapi$hud(DrawContext context, RenderTickCounter ticks, CallbackInfo ci) {
        MeteorApi.hud().post(new MeteorApi.HudEvent(context, ticks.getTickProgress(false)));
    }
}
