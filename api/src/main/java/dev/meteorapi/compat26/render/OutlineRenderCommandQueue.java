/* SPDX-License-Identifier: GPL-3.0-only */
package dev.meteorapi.compat26.render;
import net.minecraft.client.render.command.BatchingRenderCommandQueue;
/** Retains all original outline commands and supplies the 26.3 method name. */
public class OutlineRenderCommandQueue extends meteordevelopment.meteorclient.utils.OutlineRenderCommandQueue {
    public BatchingRenderCommandQueue order(int order) { return getBatchingQueue(order); }
}
