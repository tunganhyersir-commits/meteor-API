/* Uses Meteor Client's public fill operation. Copyright (c) Meteor Development. GPL-3.0-only. */
package dev.meteorapi.compat26.gui;
import meteordevelopment.meteorclient.gui.widgets.WWidget;
import meteordevelopment.meteorclient.utils.render.color.Color;
import net.minecraft.client.gui.DrawContext;
public final class RenderApi {
    private RenderApi() {}
    public static void fill(DrawContext graphics, WWidget widget, Color color) {
        graphics.fill((int) widget.x, (int) widget.y, (int) (widget.x + widget.width), (int) (widget.y + widget.height), color.getPacked());
    }
}
