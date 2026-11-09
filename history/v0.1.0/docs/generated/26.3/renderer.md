# renderer

Khai báo Java có cú pháp public/protected. Không bao gồm API kế thừa/tổng hợp bởi compiler; xem kiểm tra bytecode riêng.

## meteordevelopment.meteorclient.renderer.ExtendedRenderPipelineBuilder

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/ExtendedRenderPipelineBuilder.java:12`

```java
public class ExtendedRenderPipelineBuilder extends RenderPipeline.Builder
```

## meteordevelopment.meteorclient.renderer.ExtendedRenderPipelineBuilder.ExtendedRenderPipelineBuilder

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/ExtendedRenderPipelineBuilder.java:15`

```java
public ExtendedRenderPipelineBuilder(RenderPipeline.Snippet... snippets)
```

## meteordevelopment.meteorclient.renderer.ExtendedRenderPipelineBuilder.withLineSmooth

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/ExtendedRenderPipelineBuilder.java:21`

```java
public ExtendedRenderPipelineBuilder withLineSmooth()
```

## meteordevelopment.meteorclient.renderer.ExtendedRenderPipelineBuilder.build

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/ExtendedRenderPipelineBuilder.java:26`

```java
@Override public @NonNull RenderPipeline build()
```

## meteordevelopment.meteorclient.renderer.FixedUniformStorage

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/FixedUniformStorage.java:24`

```java
public class FixedUniformStorage<T extends DynamicGpuDataStorage.DynamicGpuData>
```

## meteordevelopment.meteorclient.renderer.FixedUniformStorage.FixedUniformStorage

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/FixedUniformStorage.java:30`

```java
public FixedUniformStorage(String name, int blockSize, int capacity)
```

## meteordevelopment.meteorclient.renderer.FixedUniformStorage.write

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/FixedUniformStorage.java:40`

```java
public GpuBufferSlice write(T value)
```

## meteordevelopment.meteorclient.renderer.FixedUniformStorage.writeAll

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/FixedUniformStorage.java:56`

```java
public GpuBufferSlice[] writeAll(T[] values)
```

## meteordevelopment.meteorclient.renderer.FixedUniformStorage.clear

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/FixedUniformStorage.java:83`

```java
public void clear()
```

## meteordevelopment.meteorclient.renderer.FixedUniformStorage.close

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/FixedUniformStorage.java:88`

```java
public void close()
```

## meteordevelopment.meteorclient.renderer.Fonts

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/Fonts.java:26`

```java
public class Fonts
```

## meteordevelopment.meteorclient.renderer.Fonts.BUILTIN_FONTS

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/Fonts.java:27`

```java
public static final String[] BUILTIN_FONTS = {"JetBrains Mono", "Comfortaa", "Tw Cen MT", "Pixelation"}
```

## meteordevelopment.meteorclient.renderer.Fonts.DEFAULT_FONT_FAMILY

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/Fonts.java:29`

```java
public static String DEFAULT_FONT_FAMILY
```

## meteordevelopment.meteorclient.renderer.Fonts.DEFAULT_FONT

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/Fonts.java:30`

```java
public static FontFace DEFAULT_FONT
```

## meteordevelopment.meteorclient.renderer.Fonts.FONT_FAMILIES

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/Fonts.java:32`

```java
public static final List<FontFamily> FONT_FAMILIES = new ArrayList<>()
```

## meteordevelopment.meteorclient.renderer.Fonts.RENDERER

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/Fonts.java:33`

```java
public static CustomTextRenderer RENDERER
```

## meteordevelopment.meteorclient.renderer.Fonts.refresh

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/Fonts.java:38`

```java
@PreInit public static void refresh()
```

## meteordevelopment.meteorclient.renderer.Fonts.load

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/Fonts.java:61`

```java
public static void load(FontFace fontFace)
```

## meteordevelopment.meteorclient.renderer.Fonts.getFamily

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/Fonts.java:84`

```java
public static FontFamily getFamily(String name)
```

## meteordevelopment.meteorclient.renderer.FullScreenRenderer

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/FullScreenRenderer.java:12`

```java
public class FullScreenRenderer
```

## meteordevelopment.meteorclient.renderer.FullScreenRenderer.vbo

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/FullScreenRenderer.java:13`

```java
public static GpuBuffer vbo
```

## meteordevelopment.meteorclient.renderer.FullScreenRenderer.ibo

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/FullScreenRenderer.java:14`

```java
public static GpuBuffer ibo
```

## meteordevelopment.meteorclient.renderer.FullScreenRenderer.mesh

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/FullScreenRenderer.java:20`

```java
@Deprecated(forRemoval = true) public static MeshBuilder mesh
```

## meteordevelopment.meteorclient.renderer.FullScreenRenderer.init

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/FullScreenRenderer.java:26`

```java
@PreInit public static void init()
```

## meteordevelopment.meteorclient.renderer.MeshBuilder

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/MeshBuilder.java:28`

```java
public class MeshBuilder
```

## meteordevelopment.meteorclient.renderer.MeshBuilder.alpha

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/MeshBuilder.java:31`

```java
public double alpha = 1
```

## meteordevelopment.meteorclient.renderer.MeshBuilder.MeshBuilder

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/MeshBuilder.java:48`

```java
public MeshBuilder(RenderPipeline pipeline)
```

## meteordevelopment.meteorclient.renderer.MeshBuilder.MeshBuilder

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/MeshBuilder.java:58`

```java
public MeshBuilder(VertexFormat format, PrimitiveTopology drawMode)
```

## meteordevelopment.meteorclient.renderer.MeshBuilder.MeshBuilder

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/MeshBuilder.java:63`

```java
public MeshBuilder(VertexFormat format, PrimitiveTopology drawMode, int vertexCount, int indexCount)
```

## meteordevelopment.meteorclient.renderer.MeshBuilder.begin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/MeshBuilder.java:68`

```java
public void begin()
```

## meteordevelopment.meteorclient.renderer.MeshBuilder.vec3

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/MeshBuilder.java:88`

```java
public MeshBuilder vec3(double x, double y, double z)
```

## meteordevelopment.meteorclient.renderer.MeshBuilder.vec2

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/MeshBuilder.java:101`

```java
public MeshBuilder vec2(double x, double y)
```

## meteordevelopment.meteorclient.renderer.MeshBuilder.color

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/MeshBuilder.java:113`

```java
public MeshBuilder color(Color c)
```

## meteordevelopment.meteorclient.renderer.MeshBuilder.next

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/MeshBuilder.java:127`

```java
public int next()
```

## meteordevelopment.meteorclient.renderer.MeshBuilder.line

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/MeshBuilder.java:131`

```java
public void line(int i1, int i2)
```

## meteordevelopment.meteorclient.renderer.MeshBuilder.quad

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/MeshBuilder.java:142`

```java
public void quad(int i1, int i2, int i3, int i4)
```

## meteordevelopment.meteorclient.renderer.MeshBuilder.triangle

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/MeshBuilder.java:158`

```java
public void triangle(int i1, int i2, int i3)
```

## meteordevelopment.meteorclient.renderer.MeshBuilder.ensureQuadCapacity

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/MeshBuilder.java:170`

```java
public void ensureQuadCapacity()
```

## meteordevelopment.meteorclient.renderer.MeshBuilder.ensureTriCapacity

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/MeshBuilder.java:174`

```java
public void ensureTriCapacity()
```

## meteordevelopment.meteorclient.renderer.MeshBuilder.ensureLineCapacity

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/MeshBuilder.java:178`

```java
public void ensureLineCapacity()
```

## meteordevelopment.meteorclient.renderer.MeshBuilder.ensureCapacity

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/MeshBuilder.java:182`

```java
public void ensureCapacity(int vertexCount, int indexCount)
```

## meteordevelopment.meteorclient.renderer.MeshBuilder.end

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/MeshBuilder.java:222`

```java
public void end()
```

## meteordevelopment.meteorclient.renderer.MeshBuilder.isBuilding

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/MeshBuilder.java:228`

```java
public boolean isBuilding()
```

## meteordevelopment.meteorclient.renderer.MeshBuilder.getVertexBuffer

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/MeshBuilder.java:232`

```java
public GpuBuffer getVertexBuffer()
```

## meteordevelopment.meteorclient.renderer.MeshBuilder.uploadVertexBuffer

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/MeshBuilder.java:237`

```java
public GpuBufferSlice uploadVertexBuffer(CommandEncoder encoder)
```

## meteordevelopment.meteorclient.renderer.MeshBuilder.getIndexBuffer

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/MeshBuilder.java:242`

```java
public GpuBuffer getIndexBuffer()
```

## meteordevelopment.meteorclient.renderer.MeshBuilder.uploadIndexBuffer

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/MeshBuilder.java:247`

```java
public GpuBufferSlice uploadIndexBuffer(CommandEncoder encoder)
```

## meteordevelopment.meteorclient.renderer.MeshBuilder.getIndicesCount

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/MeshBuilder.java:252`

```java
public int getIndicesCount()
```

## meteordevelopment.meteorclient.renderer.MeshBuilder.getIndexType

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/MeshBuilder.java:256`

```java
public IndexType getIndexType()
```

## meteordevelopment.meteorclient.renderer.MeshRenderer

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/MeshRenderer.java:34`

```java
public class MeshRenderer
```

## meteordevelopment.meteorclient.renderer.MeshRenderer.begin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/MeshRenderer.java:57`

```java
public static MeshRenderer begin()
```

## meteordevelopment.meteorclient.renderer.MeshRenderer.attachments

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/MeshRenderer.java:65`

```java
public MeshRenderer attachments(GpuTextureView color, GpuTextureView depth)
```

## meteordevelopment.meteorclient.renderer.MeshRenderer.attachments

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/MeshRenderer.java:71`

```java
public MeshRenderer attachments(RenderTarget framebuffer)
```

## meteordevelopment.meteorclient.renderer.MeshRenderer.clearColor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/MeshRenderer.java:77`

```java
public MeshRenderer clearColor(Color color)
```

## meteordevelopment.meteorclient.renderer.MeshRenderer.pipeline

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/MeshRenderer.java:82`

```java
public MeshRenderer pipeline(RenderPipeline pipeline)
```

## meteordevelopment.meteorclient.renderer.MeshRenderer.mesh

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/MeshRenderer.java:87`

```java
public MeshRenderer mesh(GpuBufferSlice vertices, GpuBufferSlice indices)
```

## meteordevelopment.meteorclient.renderer.MeshRenderer.mesh

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/MeshRenderer.java:91`

```java
public MeshRenderer mesh(GpuBufferSlice vertices, GpuBufferSlice indices, IndexType indexType)
```

## meteordevelopment.meteorclient.renderer.MeshRenderer.mesh

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/MeshRenderer.java:98`

```java
public MeshRenderer mesh(MeshBuilder mesh)
```

## meteordevelopment.meteorclient.renderer.MeshRenderer.mesh

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/MeshRenderer.java:104`

```java
public MeshRenderer mesh(MeshBuilder mesh, Matrix4f matrix)
```

## meteordevelopment.meteorclient.renderer.MeshRenderer.mesh

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/MeshRenderer.java:109`

```java
public MeshRenderer mesh(MeshBuilder mesh, PoseStack matrices)
```

## meteordevelopment.meteorclient.renderer.MeshRenderer.transform

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/MeshRenderer.java:114`

```java
public MeshRenderer transform(Matrix4f matrix)
```

## meteordevelopment.meteorclient.renderer.MeshRenderer.transform

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/MeshRenderer.java:119`

```java
public MeshRenderer transform(PoseStack matrices)
```

## meteordevelopment.meteorclient.renderer.MeshRenderer.fullscreen

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/MeshRenderer.java:124`

```java
public MeshRenderer fullscreen()
```

## meteordevelopment.meteorclient.renderer.MeshRenderer.uniform

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/MeshRenderer.java:128`

```java
public MeshRenderer uniform(String name, GpuBufferSlice slice)
```

## meteordevelopment.meteorclient.renderer.MeshRenderer.sampler

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/MeshRenderer.java:133`

```java
public MeshRenderer sampler(String name, GpuTextureView view, GpuSampler sampler)
```

## meteordevelopment.meteorclient.renderer.MeshRenderer.end

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/MeshRenderer.java:141`

```java
public void end()
```

## meteordevelopment.meteorclient.renderer.MeshUniforms

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/MeshUniforms.java:19`

```java
public class MeshUniforms
```

## meteordevelopment.meteorclient.renderer.MeshUniforms.SIZE

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/MeshUniforms.java:20`

```java
public static final int SIZE = new Std140SizeCalculator() .putMat4f() .putMat4f() .get()
```

## meteordevelopment.meteorclient.renderer.MeshUniforms.flipFrame

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/MeshUniforms.java:29`

```java
public static void flipFrame()
```

## meteordevelopment.meteorclient.renderer.MeshUniforms.write

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/MeshUniforms.java:33`

```java
public static GpuBufferSlice write(Matrix4f proj, Matrix4f modelView)
```

## meteordevelopment.meteorclient.renderer.MeteorRenderPipelines

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/MeteorRenderPipelines.java:30`

```java
public abstract class MeteorRenderPipelines
```

## meteordevelopment.meteorclient.renderer.MeteorRenderPipelines.WORLD_COLORED

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/MeteorRenderPipelines.java:45`

```java
public static final RenderPipeline WORLD_COLORED = add(new ExtendedRenderPipelineBuilder(MESH_UNIFORMS) .withLocation(MeteorClient.identifier("pipeline/world_colored")) .withVertexBinding(0, DefaultVertexFormat.POSITION_COLOR).withPrimitiveTopology(PrimitiveTopology.TRIANGLES) .withVertexShader(MeteorClient.identifier("shaders/pos_color.vsh")) .withFragmentShader(MeteorClient.identifier("shaders/pos_color.fsh")) .withDepthStencilState(new DepthStencilState(CompareOp.ALWAYS_PASS, false)) .withColorTargetState(new ColorTargetState(BlendFunction.TRANSLUCENT)) .withCull(false) .build() )
```

## meteordevelopment.meteorclient.renderer.MeteorRenderPipelines.WORLD_COLORED_LINES

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/MeteorRenderPipelines.java:56`

```java
public static final RenderPipeline WORLD_COLORED_LINES = add(new ExtendedRenderPipelineBuilder(MESH_UNIFORMS) .withLineSmooth() .withLocation(MeteorClient.identifier("pipeline/world_colored_lines")) .withVertexBinding(0, DefaultVertexFormat.POSITION_COLOR).withPrimitiveTopology(PrimitiveTopology.DEBUG_LINES) .withVertexShader(MeteorClient.identifier("shaders/pos_color.vsh")) .withFragmentShader(MeteorClient.identifier("shaders/pos_color.fsh")) .withDepthStencilState(new DepthStencilState(CompareOp.ALWAYS_PASS, false)) .withColorTargetState(new ColorTargetState(BlendFunction.TRANSLUCENT)) .withCull(false) .build() )
```

## meteordevelopment.meteorclient.renderer.MeteorRenderPipelines.WORLD_COLORED_DEPTH

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/MeteorRenderPipelines.java:68`

```java
public static final RenderPipeline WORLD_COLORED_DEPTH = add(new ExtendedRenderPipelineBuilder(MESH_UNIFORMS) .withLocation(MeteorClient.identifier("pipeline/world_colored_depth")) .withVertexBinding(0, DefaultVertexFormat.POSITION_COLOR).withPrimitiveTopology(PrimitiveTopology.TRIANGLES) .withVertexShader(MeteorClient.identifier("shaders/pos_color.vsh")) .withFragmentShader(MeteorClient.identifier("shaders/pos_color.fsh")) .withDepthStencilState(new DepthStencilState(DepthStencilState.DEFAULT.depthTest(), false)) .withColorTargetState(new ColorTargetState(BlendFunction.TRANSLUCENT)) .withCull(false) .build() )
```

## meteordevelopment.meteorclient.renderer.MeteorRenderPipelines.WORLD_COLORED_LINES_DEPTH

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/MeteorRenderPipelines.java:79`

```java
public static final RenderPipeline WORLD_COLORED_LINES_DEPTH = add(new ExtendedRenderPipelineBuilder(MESH_UNIFORMS) .withLineSmooth() .withLocation(MeteorClient.identifier("pipeline/world_colored_lines_depth")) .withVertexBinding(0, DefaultVertexFormat.POSITION_COLOR).withPrimitiveTopology(PrimitiveTopology.DEBUG_LINES) .withVertexShader(MeteorClient.identifier("shaders/pos_color.vsh")) .withFragmentShader(MeteorClient.identifier("shaders/pos_color.fsh")) .withDepthStencilState(new DepthStencilState(DepthStencilState.DEFAULT.depthTest(), false)) .withColorTargetState(new ColorTargetState(BlendFunction.TRANSLUCENT)) .withCull(false) .build() )
```

## meteordevelopment.meteorclient.renderer.MeteorRenderPipelines.UI_COLORED

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/MeteorRenderPipelines.java:93`

```java
public static final RenderPipeline UI_COLORED = add(new ExtendedRenderPipelineBuilder(MESH_UNIFORMS) .withLocation(MeteorClient.identifier("pipeline/ui_colored")) .withVertexBinding(0, MeteorVertexFormats.POS2_COLOR).withPrimitiveTopology(PrimitiveTopology.TRIANGLES) .withVertexShader(MeteorClient.identifier("shaders/pos_color.vsh")) .withFragmentShader(MeteorClient.identifier("shaders/pos_color.fsh")) .withShaderDefine("UI") .withDepthStencilState(new DepthStencilState(CompareOp.ALWAYS_PASS, false)) .withColorTargetState(new ColorTargetState(BlendFunction.TRANSLUCENT)) .withCull(true) .build() )
```

## meteordevelopment.meteorclient.renderer.MeteorRenderPipelines.UI_COLORED_LINES

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/MeteorRenderPipelines.java:105`

```java
public static final RenderPipeline UI_COLORED_LINES = add(new ExtendedRenderPipelineBuilder(MESH_UNIFORMS) .withLocation(MeteorClient.identifier("pipeline/ui_colored_lines")) .withVertexBinding(0, MeteorVertexFormats.POS2_COLOR).withPrimitiveTopology(PrimitiveTopology.DEBUG_LINES) .withVertexShader(MeteorClient.identifier("shaders/pos_color.vsh")) .withFragmentShader(MeteorClient.identifier("shaders/pos_color.fsh")) .withShaderDefine("UI") .withDepthStencilState(new DepthStencilState(CompareOp.ALWAYS_PASS, false)) .withColorTargetState(new ColorTargetState(BlendFunction.TRANSLUCENT)) .withCull(true) .build() )
```

## meteordevelopment.meteorclient.renderer.MeteorRenderPipelines.UI_TEXTURED

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/MeteorRenderPipelines.java:117`

```java
public static final RenderPipeline UI_TEXTURED = add(new ExtendedRenderPipelineBuilder(MESH_UNIFORMS) .withLocation(MeteorClient.identifier("pipeline/ui_textured")) .withVertexBinding(0, MeteorVertexFormats.POS2_TEXTURE_COLOR).withPrimitiveTopology(PrimitiveTopology.TRIANGLES) .withVertexShader(MeteorClient.identifier("shaders/pos_tex_color.vsh")) .withFragmentShader(MeteorClient.identifier("shaders/pos_tex_color.fsh")) .withBindGroupLayout(BindGroupLayout.builder() .withUniform("u_Texture", UniformType.COMBINED_IMAGE_SAMPLER) .build()) .withDepthStencilState(new DepthStencilState(CompareOp.ALWAYS_PASS, false)) .withColorTargetState(new ColorTargetState(BlendFunction.TRANSLUCENT)) .withCull(true) .build() )
```

## meteordevelopment.meteorclient.renderer.MeteorRenderPipelines.UI_TEXT

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/MeteorRenderPipelines.java:131`

```java
public static final RenderPipeline UI_TEXT = add(new ExtendedRenderPipelineBuilder(MESH_UNIFORMS) .withLocation(MeteorClient.identifier("pipeline/ui_text")) .withVertexBinding(0, MeteorVertexFormats.POS2_TEXTURE_COLOR).withPrimitiveTopology(PrimitiveTopology.TRIANGLES) .withVertexShader(MeteorClient.identifier("shaders/text.vsh")) .withFragmentShader(MeteorClient.identifier("shaders/text.fsh")) .withBindGroupLayout(BindGroupLayout.builder() .withUniform("u_Texture", UniformType.COMBINED_IMAGE_SAMPLER) .build()) .withDepthStencilState(new DepthStencilState(CompareOp.ALWAYS_PASS, false)) .withColorTargetState(new ColorTargetState(BlendFunction.TRANSLUCENT)) .withCull(true) .build() )
```

## meteordevelopment.meteorclient.renderer.MeteorRenderPipelines.POST_OUTLINE

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/MeteorRenderPipelines.java:147`

```java
public static final RenderPipeline POST_OUTLINE = add(new ExtendedRenderPipelineBuilder() .withLocation(MeteorClient.identifier("pipeline/post/outline")) .withVertexBinding(0, MeteorVertexFormats.POS2).withPrimitiveTopology(PrimitiveTopology.TRIANGLES) .withVertexShader(MeteorClient.identifier("shaders/post-process/base.vsh")) .withFragmentShader(MeteorClient.identifier("shaders/post-process/outline.fsh")) .withBindGroupLayout(BindGroupLayout.builder() .withUniform("u_Texture", UniformType.COMBINED_IMAGE_SAMPLER) .withUniform("PostData", UniformType.UNIFORM_BUFFER) .withUniform("OutlineData", UniformType.UNIFORM_BUFFER) .build()) .withDepthStencilState(new DepthStencilState(CompareOp.ALWAYS_PASS, false)) .withColorTargetState(new ColorTargetState(BlendFunction.TRANSLUCENT)) .withCull(false) .build() )
```

## meteordevelopment.meteorclient.renderer.MeteorRenderPipelines.POST_IMAGE

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/MeteorRenderPipelines.java:163`

```java
public static final RenderPipeline POST_IMAGE = add(new ExtendedRenderPipelineBuilder(MESH_UNIFORMS) .withLocation(MeteorClient.identifier("pipeline/post/image")) .withVertexBinding(0, MeteorVertexFormats.POS2).withPrimitiveTopology(PrimitiveTopology.TRIANGLES) .withVertexShader(MeteorClient.identifier("shaders/post-process/base.vsh")) .withFragmentShader(MeteorClient.identifier("shaders/post-process/image.fsh")) .withBindGroupLayout(BindGroupLayout.builder() .withUniform("u_Texture", UniformType.COMBINED_IMAGE_SAMPLER) .withUniform("u_TextureI", UniformType.COMBINED_IMAGE_SAMPLER) .withUniform("PostData", UniformType.UNIFORM_BUFFER) .withUniform("ImageData", UniformType.UNIFORM_BUFFER) .build()) .withDepthStencilState(new DepthStencilState(CompareOp.ALWAYS_PASS, false)) .withColorTargetState(new ColorTargetState(BlendFunction.TRANSLUCENT)) .withCull(false) .build() )
```

## meteordevelopment.meteorclient.renderer.MeteorRenderPipelines.BLUR_DOWN

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/MeteorRenderPipelines.java:182`

```java
public static final RenderPipeline BLUR_DOWN = add(new ExtendedRenderPipelineBuilder(MESH_UNIFORMS) .withLocation(MeteorClient.identifier("pipeline/blur/down")) .withVertexBinding(0, MeteorVertexFormats.POS2).withPrimitiveTopology(PrimitiveTopology.TRIANGLES) .withVertexShader(MeteorClient.identifier("shaders/blur.vsh")) .withFragmentShader(MeteorClient.identifier("shaders/blur_down.fsh")) .withBindGroupLayout(BindGroupLayout.builder() .withUniform("u_Texture", UniformType.COMBINED_IMAGE_SAMPLER) .withUniform("BlurData", UniformType.UNIFORM_BUFFER) .build()) .withDepthStencilState(new DepthStencilState(CompareOp.ALWAYS_PASS, false)) .withColorTargetState(new ColorTargetState(BlendFunction.TRANSLUCENT)) .withCull(false) .build() )
```

## meteordevelopment.meteorclient.renderer.MeteorRenderPipelines.BLUR_UP

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/MeteorRenderPipelines.java:197`

```java
public static final RenderPipeline BLUR_UP = add(new ExtendedRenderPipelineBuilder(MESH_UNIFORMS) .withLocation(MeteorClient.identifier("pipeline/blur/up")) .withVertexBinding(0, MeteorVertexFormats.POS2).withPrimitiveTopology(PrimitiveTopology.TRIANGLES) .withVertexShader(MeteorClient.identifier("shaders/blur.vsh")) .withFragmentShader(MeteorClient.identifier("shaders/blur_up.fsh")) .withBindGroupLayout(BindGroupLayout.builder() .withUniform("u_Texture", UniformType.COMBINED_IMAGE_SAMPLER) .withUniform("BlurData", UniformType.UNIFORM_BUFFER) .build()) .withDepthStencilState(new DepthStencilState(CompareOp.ALWAYS_PASS, false)) .withColorTargetState(new ColorTargetState(BlendFunction.TRANSLUCENT)) .withCull(false) .build() )
```

## meteordevelopment.meteorclient.renderer.MeteorRenderPipelines.BLUR_PASSTHROUGH

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/MeteorRenderPipelines.java:212`

```java
public static final RenderPipeline BLUR_PASSTHROUGH = add(new ExtendedRenderPipelineBuilder(MESH_UNIFORMS) .withLocation(MeteorClient.identifier("pipeline/blur/up")) .withVertexBinding(0, MeteorVertexFormats.POS2).withPrimitiveTopology(PrimitiveTopology.TRIANGLES) .withVertexShader(MeteorClient.identifier("shaders/passthrough.vsh")) .withFragmentShader(MeteorClient.identifier("shaders/passthrough.fsh")) .withBindGroupLayout(BindGroupLayout.builder().withUniform("u_Texture", UniformType.COMBINED_IMAGE_SAMPLER).build()) .withDepthStencilState(new DepthStencilState(CompareOp.ALWAYS_PASS, false)) .withColorTargetState(new ColorTargetState(BlendFunction.TRANSLUCENT)) .withCull(false) .build() )
```

## meteordevelopment.meteorclient.renderer.MeteorRenderPipelines.precompile

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/MeteorRenderPipelines.java:229`

```java
public static void precompile(PipelineCache cache)
```

## meteordevelopment.meteorclient.renderer.MeteorVertexFormats

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/MeteorVertexFormats.java:12`

```java
public abstract class MeteorVertexFormats
```

## meteordevelopment.meteorclient.renderer.MeteorVertexFormats.POS2

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/MeteorVertexFormats.java:17`

```java
public static final VertexFormat POS2 = VertexFormat.builder(STEP_RATE) .addAttribute("Position", GpuFormat.RG32_FLOAT) // 2 floats (x, y) .build()
```

## meteordevelopment.meteorclient.renderer.MeteorVertexFormats.POS2_COLOR

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/MeteorVertexFormats.java:22`

```java
public static final VertexFormat POS2_COLOR = VertexFormat.builder(STEP_RATE) .addAttribute("Position", GpuFormat.RG32_FLOAT) // 2 floats (x, y) .addAttribute("Color", GpuFormat.RGBA8_UNORM) // 4 bytes (RGBA, 0-255) .build()
```

## meteordevelopment.meteorclient.renderer.MeteorVertexFormats.POS2_TEXTURE_COLOR

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/MeteorVertexFormats.java:28`

```java
public static final VertexFormat POS2_TEXTURE_COLOR = VertexFormat.builder(STEP_RATE) .addAttribute("Position", GpuFormat.RG32_FLOAT) // 2 floats (x, y) .addAttribute("Texture", GpuFormat.RG32_FLOAT) // 2 floats (u, v) .addAttribute("Color", GpuFormat.RGBA8_UNORM) // 4 bytes (RGBA, 0-255) .build()
```

## meteordevelopment.meteorclient.renderer.Renderer2D

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/Renderer2D.java:15`

```java
public class Renderer2D
```

## meteordevelopment.meteorclient.renderer.Renderer2D.COLOR

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/Renderer2D.java:16`

```java
public static Renderer2D COLOR
```

## meteordevelopment.meteorclient.renderer.Renderer2D.TEXTURE

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/Renderer2D.java:17`

```java
public static Renderer2D TEXTURE
```

## meteordevelopment.meteorclient.renderer.Renderer2D.triangles

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/Renderer2D.java:21`

```java
public final MeshBuilder triangles
```

## meteordevelopment.meteorclient.renderer.Renderer2D.lines

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/Renderer2D.java:22`

```java
public final MeshBuilder lines
```

## meteordevelopment.meteorclient.renderer.Renderer2D.Renderer2D

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/Renderer2D.java:24`

```java
public Renderer2D(boolean textured)
```

## meteordevelopment.meteorclient.renderer.Renderer2D.init

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/Renderer2D.java:31`

```java
@PreInit public static void init()
```

## meteordevelopment.meteorclient.renderer.Renderer2D.setAlpha

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/Renderer2D.java:37`

```java
public void setAlpha(double alpha)
```

## meteordevelopment.meteorclient.renderer.Renderer2D.begin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/Renderer2D.java:41`

```java
public void begin()
```

## meteordevelopment.meteorclient.renderer.Renderer2D.end

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/Renderer2D.java:46`

```java
public void end()
```

## meteordevelopment.meteorclient.renderer.Renderer2D.render

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/Renderer2D.java:51`

```java
public void render()
```

## meteordevelopment.meteorclient.renderer.Renderer2D.render

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/Renderer2D.java:55`

```java
public void render(GpuTextureView textureView, GpuSampler sampler)
```

## meteordevelopment.meteorclient.renderer.Renderer2D.render

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/Renderer2D.java:62`

```java
public void render(String samplerName, GpuTextureView samplerView, GpuSampler sampler)
```

## meteordevelopment.meteorclient.renderer.Renderer2D.triangle

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/Renderer2D.java:81`

```java
public void triangle(double x1, double y1, double x2, double y2, double x3, double y3, Color color)
```

## meteordevelopment.meteorclient.renderer.Renderer2D.line

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/Renderer2D.java:93`

```java
public void line(double x1, double y1, double x2, double y2, Color color)
```

## meteordevelopment.meteorclient.renderer.Renderer2D.boxLines

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/Renderer2D.java:102`

```java
public void boxLines(double x, double y, double width, double height, Color color)
```

## meteordevelopment.meteorclient.renderer.Renderer2D.quad

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/Renderer2D.java:118`

```java
public void quad(double x, double y, double width, double height, Color cTopLeft, Color cTopRight, Color cBottomRight, Color cBottomLeft)
```

## meteordevelopment.meteorclient.renderer.Renderer2D.quad

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/Renderer2D.java:129`

```java
public void quad(double x, double y, double width, double height, Color color)
```

## meteordevelopment.meteorclient.renderer.Renderer2D.texQuad

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/Renderer2D.java:135`

```java
public void texQuad(double x, double y, double width, double height, Color color)
```

## meteordevelopment.meteorclient.renderer.Renderer2D.texQuad

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/Renderer2D.java:146`

```java
public void texQuad(double x, double y, double width, double height, TextureRegion texture, Color color)
```

## meteordevelopment.meteorclient.renderer.Renderer2D.texQuad

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/Renderer2D.java:157`

```java
public void texQuad(double x, double y, double width, double height, double rotation, double texX1, double texY1, double texX2, double texY2, Color color)
```

## meteordevelopment.meteorclient.renderer.Renderer2D.texQuad

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/Renderer2D.java:186`

```java
public void texQuad(double x, double y, double width, double height, double rotation, TextureRegion region, Color color)
```

## meteordevelopment.meteorclient.renderer.Renderer3D

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/Renderer3D.java:16`

```java
public class Renderer3D
```

## meteordevelopment.meteorclient.renderer.Renderer3D.lines

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/Renderer3D.java:17`

```java
public final MeshBuilder lines
```

## meteordevelopment.meteorclient.renderer.Renderer3D.triangles

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/Renderer3D.java:18`

```java
public final MeshBuilder triangles
```

## meteordevelopment.meteorclient.renderer.Renderer3D.Renderer3D

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/Renderer3D.java:22`

```java
public Renderer3D(RenderPipeline lines, RenderPipeline triangles)
```

## meteordevelopment.meteorclient.renderer.Renderer3D.begin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/Renderer3D.java:29`

```java
public void begin()
```

## meteordevelopment.meteorclient.renderer.Renderer3D.render

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/Renderer3D.java:34`

```java
public void render(PoseStack matrices)
```

## meteordevelopment.meteorclient.renderer.Renderer3D.line

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/Renderer3D.java:50`

```java
public void line(double x1, double y1, double z1, double x2, double y2, double z2, Color color1, Color color2)
```

## meteordevelopment.meteorclient.renderer.Renderer3D.line

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/Renderer3D.java:59`

```java
public void line(double x1, double y1, double z1, double x2, double y2, double z2, Color color)
```

## meteordevelopment.meteorclient.renderer.Renderer3D.boxLines

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/Renderer3D.java:63`

```java
@SuppressWarnings("Duplicates") public void boxLines(double x1, double y1, double z1, double x2, double y2, double z2, Color color, int excludeDir)
```

## meteordevelopment.meteorclient.renderer.Renderer3D.blockLines

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/Renderer3D.java:115`

```java
public void blockLines(int x, int y, int z, Color color, int excludeDir)
```

## meteordevelopment.meteorclient.renderer.Renderer3D.quad

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/Renderer3D.java:121`

```java
public void quad(double x1, double y1, double z1, double x2, double y2, double z2, double x3, double y3, double z3, double x4, double y4, double z4, Color topLeft, Color topRight, Color bottomRight, Color bottomLeft)
```

## meteordevelopment.meteorclient.renderer.Renderer3D.quad

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/Renderer3D.java:132`

```java
public void quad(double x1, double y1, double z1, double x2, double y2, double z2, double x3, double y3, double z3, double x4, double y4, double z4, Color color)
```

## meteordevelopment.meteorclient.renderer.Renderer3D.quadVertical

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/Renderer3D.java:136`

```java
public void quadVertical(double x1, double y1, double z1, double x2, double y2, double z2, Color color)
```

## meteordevelopment.meteorclient.renderer.Renderer3D.quadHorizontal

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/Renderer3D.java:140`

```java
public void quadHorizontal(double x1, double y, double z1, double x2, double z2, Color color)
```

## meteordevelopment.meteorclient.renderer.Renderer3D.gradientQuadVertical

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/Renderer3D.java:144`

```java
public void gradientQuadVertical(double x1, double y1, double z1, double x2, double y2, double z2, Color topColor, Color bottomColor)
```

## meteordevelopment.meteorclient.renderer.Renderer3D.side

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/Renderer3D.java:150`

```java
@SuppressWarnings("Duplicates") public void side(double x1, double y1, double z1, double x2, double y2, double z2, double x3, double y3, double z3, double x4, double y4, double z4, Color sideColor, Color lineColor, ShapeMode mode)
```

## meteordevelopment.meteorclient.renderer.Renderer3D.sideVertical

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/Renderer3D.java:171`

```java
public void sideVertical(double x1, double y1, double z1, double x2, double y2, double z2, Color sideColor, Color lineColor, ShapeMode mode)
```

## meteordevelopment.meteorclient.renderer.Renderer3D.sideHorizontal

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/Renderer3D.java:175`

```java
public void sideHorizontal(double x1, double y, double z1, double x2, double z2, Color sideColor, Color lineColor, ShapeMode mode)
```

## meteordevelopment.meteorclient.renderer.Renderer3D.boxSides

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/Renderer3D.java:181`

```java
@SuppressWarnings("Duplicates") public void boxSides(double x1, double y1, double z1, double x2, double y2, double z2, Color color, int excludeDir)
```

## meteordevelopment.meteorclient.renderer.Renderer3D.blockSides

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/Renderer3D.java:221`

```java
public void blockSides(int x, int y, int z, Color color, int excludeDir)
```

## meteordevelopment.meteorclient.renderer.Renderer3D.box

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/Renderer3D.java:225`

```java
public void box(double x1, double y1, double z1, double x2, double y2, double z2, Color sideColor, Color lineColor, ShapeMode mode, int excludeDir)
```

## meteordevelopment.meteorclient.renderer.Renderer3D.box

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/Renderer3D.java:230`

```java
public void box(BlockPos pos, Color sideColor, Color lineColor, ShapeMode mode, int excludeDir)
```

## meteordevelopment.meteorclient.renderer.Renderer3D.box

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/Renderer3D.java:237`

```java
public void box(AABB box, Color sideColor, Color lineColor, ShapeMode mode, int excludeDir)
```

## meteordevelopment.meteorclient.renderer.ShapeMode

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/ShapeMode.java:8`

```java
public enum ShapeMode
```

## meteordevelopment.meteorclient.renderer.ShapeMode.lines

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/ShapeMode.java:13`

```java
public boolean lines()
```

## meteordevelopment.meteorclient.renderer.ShapeMode.sides

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/ShapeMode.java:17`

```java
public boolean sides()
```

## meteordevelopment.meteorclient.renderer.Texture

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/Texture.java:25`

```java
public class Texture extends AbstractTexture
```

## meteordevelopment.meteorclient.renderer.Texture.Texture

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/Texture.java:26`

```java
public Texture(int width, int height, GpuFormat format, FilterMode min, FilterMode mag)
```

## meteordevelopment.meteorclient.renderer.Texture.getWidth

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/Texture.java:33`

```java
public int getWidth()
```

## meteordevelopment.meteorclient.renderer.Texture.getHeight

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/Texture.java:37`

```java
public int getHeight()
```

## meteordevelopment.meteorclient.renderer.Texture.upload

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/Texture.java:41`

```java
public void upload(byte[] bytes)
```

## meteordevelopment.meteorclient.renderer.Texture.upload

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/Texture.java:45`

```java
public void upload(ByteBuffer buffer)
```

## meteordevelopment.meteorclient.renderer.Texture.readResource

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/Texture.java:68`

```java
public static Texture readResource(String path, boolean flipY, FilterMode filter)
```

## meteordevelopment.meteorclient.renderer.text.BuiltinFontFace

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/text/BuiltinFontFace.java:10`

```java
@NullMarked public final class BuiltinFontFace extends FontFace
```

## meteordevelopment.meteorclient.renderer.text.BuiltinFontFace.BuiltinFontFace

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/text/BuiltinFontFace.java:14`

```java
public BuiltinFontFace(FontInfo info, String name)
```

## meteordevelopment.meteorclient.renderer.text.BuiltinFontFace.byteChannelForRead

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/text/BuiltinFontFace.java:20`

```java
@Override public ReadableByteChannel byteChannelForRead()
```

## meteordevelopment.meteorclient.renderer.text.BuiltinFontFace.toString

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/text/BuiltinFontFace.java:29`

```java
@Override public String toString()
```

## meteordevelopment.meteorclient.renderer.text.CustomTextRenderer

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/text/CustomTextRenderer.java:18`

```java
public class CustomTextRenderer implements TextRenderer
```

## meteordevelopment.meteorclient.renderer.text.CustomTextRenderer.SHADOW_COLOR

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/text/CustomTextRenderer.java:19`

```java
public static final Color SHADOW_COLOR = new Color(60, 60, 60, 180)
```

## meteordevelopment.meteorclient.renderer.text.CustomTextRenderer.fontFace

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/text/CustomTextRenderer.java:23`

```java
public final FontFace fontFace
```

## meteordevelopment.meteorclient.renderer.text.CustomTextRenderer.CustomTextRenderer

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/text/CustomTextRenderer.java:33`

```java
public CustomTextRenderer(FontFace fontFace) throws IOException
```

## meteordevelopment.meteorclient.renderer.text.CustomTextRenderer.setAlpha

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/text/CustomTextRenderer.java:44`

```java
@Override public void setAlpha(double a)
```

## meteordevelopment.meteorclient.renderer.text.CustomTextRenderer.begin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/text/CustomTextRenderer.java:49`

```java
@Override public void begin(GuiGraphicsExtractor graphics, double scale, boolean scaleOnly, boolean big)
```

## meteordevelopment.meteorclient.renderer.text.CustomTextRenderer.getWidth

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/text/CustomTextRenderer.java:77`

```java
@Override public double getWidth(String text, int length, boolean shadow)
```

## meteordevelopment.meteorclient.renderer.text.CustomTextRenderer.getHeight

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/text/CustomTextRenderer.java:85`

```java
@Override public double getHeight(boolean shadow)
```

## meteordevelopment.meteorclient.renderer.text.CustomTextRenderer.render

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/text/CustomTextRenderer.java:91`

```java
@Override public double render(String text, double x, double y, Color color, boolean shadow)
```

## meteordevelopment.meteorclient.renderer.text.CustomTextRenderer.isBuilding

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/text/CustomTextRenderer.java:111`

```java
@Override public boolean isBuilding()
```

## meteordevelopment.meteorclient.renderer.text.CustomTextRenderer.end

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/text/CustomTextRenderer.java:116`

```java
@Override public void end()
```

## meteordevelopment.meteorclient.renderer.text.CustomTextRenderer.destroy

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/text/CustomTextRenderer.java:135`

```java
public void destroy()
```

## meteordevelopment.meteorclient.renderer.text.Font

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/text/Font.java:21`

```java
public class Font
```

## meteordevelopment.meteorclient.renderer.text.Font.texture

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/text/Font.java:22`

```java
public final Texture texture
```

## meteordevelopment.meteorclient.renderer.text.Font.Font

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/text/Font.java:29`

```java
public Font(ByteBuffer buffer, int height)
```

## meteordevelopment.meteorclient.renderer.text.Font.getWidth

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/text/Font.java:102`

```java
public double getWidth(String string, int length)
```

## meteordevelopment.meteorclient.renderer.text.Font.getHeight

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/text/Font.java:116`

```java
public int getHeight()
```

## meteordevelopment.meteorclient.renderer.text.Font.render

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/text/Font.java:120`

```java
public double render(MeshBuilder mesh, String string, double x, double y, Color color, double scale)
```

## meteordevelopment.meteorclient.renderer.text.FontFace

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/text/FontFace.java:11`

```java
@NullMarked public abstract sealed class FontFace permits BuiltinFontFace, SystemFontFace
```

## meteordevelopment.meteorclient.renderer.text.FontFace.info

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/text/FontFace.java:13`

```java
public final FontInfo info
```

## meteordevelopment.meteorclient.renderer.text.FontFace.FontFace

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/text/FontFace.java:15`

```java
protected FontFace(FontInfo info)
```

## meteordevelopment.meteorclient.renderer.text.FontFace.byteChannelForRead

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/text/FontFace.java:19`

```java
public abstract ReadableByteChannel byteChannelForRead() throws IOException
```

## meteordevelopment.meteorclient.renderer.text.FontFace.readToDirectByteBuffer

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/text/FontFace.java:21`

```java
public final ByteBuffer readToDirectByteBuffer() throws IOException
```

## meteordevelopment.meteorclient.renderer.text.FontFace.toString

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/text/FontFace.java:27`

```java
@Override public String toString()
```

## meteordevelopment.meteorclient.renderer.text.FontFamily

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/text/FontFamily.java:11`

```java
public class FontFamily
```

## meteordevelopment.meteorclient.renderer.text.FontFamily.FontFamily

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/text/FontFamily.java:15`

```java
public FontFamily(String name)
```

## meteordevelopment.meteorclient.renderer.text.FontFamily.addFont

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/text/FontFamily.java:19`

```java
public boolean addFont(FontFace font)
```

## meteordevelopment.meteorclient.renderer.text.FontFamily.hasType

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/text/FontFamily.java:23`

```java
public boolean hasType(FontInfo.Type type)
```

## meteordevelopment.meteorclient.renderer.text.FontFamily.get

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/text/FontFamily.java:27`

```java
public FontFace get(FontInfo.Type type)
```

## meteordevelopment.meteorclient.renderer.text.FontFamily.getName

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/text/FontFamily.java:39`

```java
public String getName()
```

## meteordevelopment.meteorclient.renderer.text.FontInfo

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/text/FontInfo.java:10`

```java
public record FontInfo(String family, Type type)
```

## meteordevelopment.meteorclient.renderer.text.FontInfo.toString

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/text/FontInfo.java:11`

```java
@Override public @NonNull String toString()
```

## meteordevelopment.meteorclient.renderer.text.FontInfo.equals

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/text/FontInfo.java:16`

```java
public boolean equals(FontInfo info)
```

## meteordevelopment.meteorclient.renderer.text.FontInfo.Type

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/text/FontInfo.java:22`

```java
public enum Type
```

## meteordevelopment.meteorclient.renderer.text.FontInfo.Type.fromString

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/text/FontInfo.java:28`

```java
public static Type fromString(String str)
```

## meteordevelopment.meteorclient.renderer.text.FontInfo.Type.toString

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/text/FontInfo.java:37`

```java
@Override public String toString()
```

## meteordevelopment.meteorclient.renderer.text.SystemFontFace

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/text/SystemFontFace.java:11`

```java
@NullMarked public final class SystemFontFace extends FontFace
```

## meteordevelopment.meteorclient.renderer.text.SystemFontFace.SystemFontFace

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/text/SystemFontFace.java:15`

```java
public SystemFontFace(FontInfo info, Path path)
```

## meteordevelopment.meteorclient.renderer.text.SystemFontFace.byteChannelForRead

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/text/SystemFontFace.java:21`

```java
@Override public ReadableByteChannel byteChannelForRead() throws IOException
```

## meteordevelopment.meteorclient.renderer.text.SystemFontFace.toString

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/text/SystemFontFace.java:26`

```java
@Override public String toString()
```

## meteordevelopment.meteorclient.renderer.text.TextRenderer

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/text/TextRenderer.java:13`

```java
public interface TextRenderer
```

## meteordevelopment.meteorclient.renderer.text.TextRenderer.get

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/text/TextRenderer.java:14`

```java
static TextRenderer get()
```

## meteordevelopment.meteorclient.renderer.text.TextRenderer.setAlpha

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/text/TextRenderer.java:18`

```java
void setAlpha(double a)
```

## meteordevelopment.meteorclient.renderer.text.TextRenderer.begin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/text/TextRenderer.java:20`

```java
void begin(GuiGraphicsExtractor graphics, double scale, boolean scaleOnly, boolean big)
```

## meteordevelopment.meteorclient.renderer.text.TextRenderer.begin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/text/TextRenderer.java:21`

```java
default void begin(GuiGraphicsExtractor graphics, double scale)
```

## meteordevelopment.meteorclient.renderer.text.TextRenderer.begin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/text/TextRenderer.java:22`

```java
default void begin(GuiGraphicsExtractor graphics)
```

## meteordevelopment.meteorclient.renderer.text.TextRenderer.beginBig

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/text/TextRenderer.java:24`

```java
default void beginBig(GuiGraphicsExtractor graphics)
```

## meteordevelopment.meteorclient.renderer.text.TextRenderer.getWidth

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/text/TextRenderer.java:26`

```java
double getWidth(String text, int length, boolean shadow)
```

## meteordevelopment.meteorclient.renderer.text.TextRenderer.getWidth

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/text/TextRenderer.java:27`

```java
default double getWidth(String text, boolean shadow)
```

## meteordevelopment.meteorclient.renderer.text.TextRenderer.getWidth

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/text/TextRenderer.java:28`

```java
default double getWidth(String text)
```

## meteordevelopment.meteorclient.renderer.text.TextRenderer.getHeight

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/text/TextRenderer.java:30`

```java
double getHeight(boolean shadow)
```

## meteordevelopment.meteorclient.renderer.text.TextRenderer.getHeight

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/text/TextRenderer.java:31`

```java
default double getHeight()
```

## meteordevelopment.meteorclient.renderer.text.TextRenderer.render

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/text/TextRenderer.java:33`

```java
double render(String text, double x, double y, Color color, boolean shadow)
```

## meteordevelopment.meteorclient.renderer.text.TextRenderer.render

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/text/TextRenderer.java:34`

```java
default double render(String text, double x, double y, Color color)
```

## meteordevelopment.meteorclient.renderer.text.TextRenderer.isBuilding

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/text/TextRenderer.java:36`

```java
boolean isBuilding()
```

## meteordevelopment.meteorclient.renderer.text.TextRenderer.end

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/text/TextRenderer.java:38`

```java
void end()
```

## meteordevelopment.meteorclient.renderer.text.VanillaTextRenderer

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/text/VanillaTextRenderer.java:14`

```java
public class VanillaTextRenderer implements TextRenderer
```

## meteordevelopment.meteorclient.renderer.text.VanillaTextRenderer.INSTANCE

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/text/VanillaTextRenderer.java:15`

```java
public static final VanillaTextRenderer INSTANCE = new VanillaTextRenderer()
```

## meteordevelopment.meteorclient.renderer.text.VanillaTextRenderer.scale

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/text/VanillaTextRenderer.java:17`

```java
public double scale = 2
```

## meteordevelopment.meteorclient.renderer.text.VanillaTextRenderer.scaleIndividually

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/text/VanillaTextRenderer.java:19`

```java
public boolean scaleIndividually
```

## meteordevelopment.meteorclient.renderer.text.VanillaTextRenderer.setAlpha

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/text/VanillaTextRenderer.java:29`

```java
@Override public void setAlpha(double a)
```

## meteordevelopment.meteorclient.renderer.text.VanillaTextRenderer.getWidth

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/text/VanillaTextRenderer.java:34`

```java
@Override public double getWidth(String text, int length, boolean shadow)
```

## meteordevelopment.meteorclient.renderer.text.VanillaTextRenderer.getHeight

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/text/VanillaTextRenderer.java:42`

```java
@Override public double getHeight(boolean shadow)
```

## meteordevelopment.meteorclient.renderer.text.VanillaTextRenderer.begin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/text/VanillaTextRenderer.java:47`

```java
@Override public void begin(GuiGraphicsExtractor graphics, double scale, boolean scaleOnly, boolean big)
```

## meteordevelopment.meteorclient.renderer.text.VanillaTextRenderer.render

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/text/VanillaTextRenderer.java:56`

```java
@Override public double render(String text, double x, double y, Color color, boolean shadow)
```

## meteordevelopment.meteorclient.renderer.text.VanillaTextRenderer.isBuilding

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/text/VanillaTextRenderer.java:81`

```java
@Override public boolean isBuilding()
```

## meteordevelopment.meteorclient.renderer.text.VanillaTextRenderer.end

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/text/VanillaTextRenderer.java:86`

```java
@Override public void end()
```
