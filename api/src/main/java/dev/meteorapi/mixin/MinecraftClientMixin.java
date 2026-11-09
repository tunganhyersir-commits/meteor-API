/* SPDX-License-Identifier: GPL-3.0-only */
package dev.meteorapi.mixin;
import dev.meteorapi.MeteorApi;
import net.minecraft.client.MinecraftClient;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
@Mixin(MinecraftClient.class)
abstract class MinecraftClientMixin {
    @Inject(method = "tick", at = @At("TAIL"))
    private void meteorapi$tick(CallbackInfo ci) { MeteorApi.onTick(); }
}
