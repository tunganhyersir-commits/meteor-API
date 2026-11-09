/*
 * Uses Meteor Client source, Copyright (c) Meteor Development.
 * Adapted to Minecraft 1.21.11 under GPL-3.0-only.
 */
package dev.meteorapi.backport;
import net.minecraft.client.gui.render.GuiRenderer;
import net.minecraft.client.gui.render.SpecialGuiElementRenderer;
import net.minecraft.client.gui.render.state.GuiRenderState;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.command.OrderedRenderCommandQueue;
import net.minecraft.client.render.command.RenderDispatcher;
import java.util.List;
/** 26.3 subclass adapted to the complete 1.21.11 constructor; no renderer arguments are silently dropped. */
public class MeteorMcGuiRenderer extends GuiRenderer {
    public MeteorMcGuiRenderer(GuiRenderState state, VertexConsumerProvider.Immediate vertices,
            OrderedRenderCommandQueue commands, RenderDispatcher dispatcher, List<SpecialGuiElementRenderer<?>> renderers) {
        super(state, vertices, commands, dispatcher, renderers);
    }
}
