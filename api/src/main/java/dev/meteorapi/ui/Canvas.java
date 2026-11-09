/* SPDX-License-Identifier: GPL-3.0-only */
package dev.meteorapi.ui;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
/** Convenience drawing helpers; raw DrawContext exposes all original rendering features. */
public record Canvas(DrawContext context) {
    public void rectangle(int x, int y, int width, int height, int argb) { context.fill(x, y, x + width, y + height, argb); }
    public void text(String text, int x, int y, int argb) { context.drawTextWithShadow(MinecraftClient.getInstance().textRenderer, text, x, y, argb); }
    public void text(Text text, int x, int y, int argb) { context.drawTextWithShadow(MinecraftClient.getInstance().textRenderer, text, x, y, argb); }
    public void item(ItemStack item, int x, int y, boolean overlay) {
        context.drawItem(item, x, y);
        if (overlay) context.drawStackOverlay(MinecraftClient.getInstance().textRenderer, item, x, y);
    }
    public void clip(int x, int y, int width, int height, Runnable draw) {
        context.enableScissor(x, y, x + width, y + height);
        try { draw.run(); } finally { context.disableScissor(); }
    }
    public void transformed(float x, float y, float scale, Runnable draw) {
        context.getMatrices().pushMatrix();
        try { context.getMatrices().translate(x, y).scale(scale); draw.run(); }
        finally { context.getMatrices().popMatrix(); }
    }
}
