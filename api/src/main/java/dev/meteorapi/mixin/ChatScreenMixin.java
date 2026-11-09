/* SPDX-License-Identifier: GPL-3.0-only */
package dev.meteorapi.mixin;
import dev.meteorapi.client.Clients;
import net.minecraft.client.gui.screen.ChatScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
@Mixin(value = ChatScreen.class, priority = 1100)
abstract class ChatScreenMixin {
    @Inject(method = "sendMessage", at = @At("HEAD"), cancellable = true)
    private void meteorapi$command(String text, boolean addToHistory, CallbackInfo ci) {
        if (Clients.dispatchChat(text)) {
            if (addToHistory) net.minecraft.client.MinecraftClient.getInstance().inGameHud.getChatHud().addToMessageHistory(text);
            ci.cancel();
        }
    }
}
