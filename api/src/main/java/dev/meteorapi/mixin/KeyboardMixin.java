/* SPDX-License-Identifier: GPL-3.0-only */
package dev.meteorapi.mixin;
import dev.meteorapi.MeteorApi;
import net.minecraft.client.Keyboard;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.input.KeyInput;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
@Mixin(Keyboard.class)
abstract class KeyboardMixin {
    @Inject(method = "onKey", at = @At("TAIL"))
    private void meteorapi$key(long window, int action, KeyInput input, CallbackInfo ci) {
        MeteorApi.keys().post(new MeteorApi.KeyInputEvent(input.key(), input.scancode(), input.modifiers(), action));
        MinecraftClient client = MinecraftClient.getInstance();
        if (action == 1 && MeteorApi.OPEN_KEY.get() >= 0 && input.key() == MeteorApi.OPEN_KEY.get()) {
            if (client.currentScreen instanceof dev.meteorapi.ui.PanelScreen) client.currentScreen.close();
            else client.setScreen(MeteorApi.screen(client.currentScreen));
        }
    }
}
