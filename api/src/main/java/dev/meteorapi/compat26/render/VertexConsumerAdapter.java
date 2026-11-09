/* Uses Meteor Client source. Copyright (c) Meteor Development. GPL-3.0-only. */
package dev.meteorapi.compat26.render;
import meteordevelopment.meteorclient.renderer.MeshBuilder;
import meteordevelopment.meteorclient.utils.render.MeshBuilderVertexConsumerProvider;
/** 26.3 fluent names over the same 1.21.11 mesh implementation. */
public class VertexConsumerAdapter extends MeshBuilderVertexConsumerProvider.MeshBuilderVertexConsumer {
    public VertexConsumerAdapter(MeshBuilder mesh) { super(mesh); }
    public VertexConsumerAdapter addVertex(float x, float y, float z) { vertex(x, y, z); return this; }
    public VertexConsumerAdapter setColor(int r, int g, int b, int a) { color(r, g, b, a); return this; }
    public VertexConsumerAdapter setColor(int color) { color(color); return this; }
    public VertexConsumerAdapter setUv(float u, float v) { texture(u, v); return this; }
    public VertexConsumerAdapter setUv1(int u, int v) { overlay(u, v); return this; }
    public VertexConsumerAdapter setUv2(int u, int v) { light(u, v); return this; }
    /** The supplied Meteor 26.3 mesh implementation ignores UV3 as well. */
    public VertexConsumerAdapter setUv3(float u, float v) { return this; }
    public VertexConsumerAdapter setNormal(float x, float y, float z) { normal(x, y, z); return this; }
    public VertexConsumerAdapter setLineWidth(float width) { lineWidth(width); return this; }
}
