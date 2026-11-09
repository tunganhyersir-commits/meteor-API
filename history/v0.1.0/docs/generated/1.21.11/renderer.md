# renderer

Khai báo Java có cú pháp public/protected. Không bao gồm API kế thừa/tổng hợp bởi compiler; xem kiểm tra bytecode riêng.

## meteordevelopment.meteorclient.renderer.ExtendedRenderPipelineBuilder

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/ExtendedRenderPipelineBuilder.java:11`

```java
public class ExtendedRenderPipelineBuilder extends RenderPipeline.Builder
```

## meteordevelopment.meteorclient.renderer.ExtendedRenderPipelineBuilder.ExtendedRenderPipelineBuilder

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/ExtendedRenderPipelineBuilder.java:14`

```java
public ExtendedRenderPipelineBuilder(RenderPipeline.Snippet... snippets)
```

## meteordevelopment.meteorclient.renderer.ExtendedRenderPipelineBuilder.withLineSmooth

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/ExtendedRenderPipelineBuilder.java:20`

```java
public ExtendedRenderPipelineBuilder withLineSmooth()
```

## meteordevelopment.meteorclient.renderer.ExtendedRenderPipelineBuilder.build

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/ExtendedRenderPipelineBuilder.java:25`

```java
@Override public RenderPipeline build()
```

## meteordevelopment.meteorclient.renderer.FixedUniformStorage

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/FixedUniformStorage.java:24`

```java
public class FixedUniformStorage<T extends DynamicUniformStorage.Uploadable>
```

## meteordevelopment.meteorclient.renderer.FixedUniformStorage.FixedUniformStorage

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/FixedUniformStorage.java:30`

```java
public FixedUniformStorage(String name, int blockSize, int capacity)
```

## meteordevelopment.meteorclient.renderer.FixedUniformStorage.write

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/FixedUniformStorage.java:39`

```java
public GpuBufferSlice write(T value)
```

## meteordevelopment.meteorclient.renderer.FixedUniformStorage.writeAll

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/FixedUniformStorage.java:57`

```java
public GpuBufferSlice[] writeAll(T[] values)
```

## meteordevelopment.meteorclient.renderer.FixedUniformStorage.clear

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/FixedUniformStorage.java:85`

```java
public void clear()
```

## meteordevelopment.meteorclient.renderer.FixedUniformStorage.close

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/FixedUniformStorage.java:90`

```java
public void close()
```

## meteordevelopment.meteorclient.renderer.Fonts

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/Fonts.java:26`

```java
public class Fonts
```

## meteordevelopment.meteorclient.renderer.Fonts.BUILTIN_FONTS

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/Fonts.java:27`

```java
public static final String[] BUILTIN_FONTS = { "JetBrains Mono", "Comfortaa", "Tw Cen MT", "Pixelation" }
```

## meteordevelopment.meteorclient.renderer.Fonts.DEFAULT_FONT_FAMILY

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/Fonts.java:29`

```java
public static String DEFAULT_FONT_FAMILY
```

## meteordevelopment.meteorclient.renderer.Fonts.DEFAULT_FONT

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/Fonts.java:30`

```java
public static FontFace DEFAULT_FONT
```

## meteordevelopment.meteorclient.renderer.Fonts.FONT_FAMILIES

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/Fonts.java:32`

```java
public static final List<FontFamily> FONT_FAMILIES = new ArrayList<>()
```

## meteordevelopment.meteorclient.renderer.Fonts.RENDERER

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/Fonts.java:33`

```java
public static CustomTextRenderer RENDERER
```

## meteordevelopment.meteorclient.renderer.Fonts.refresh

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/Fonts.java:38`

```java
@PreInit public static void refresh()
```

## meteordevelopment.meteorclient.renderer.Fonts.load

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/Fonts.java:61`

```java
public static void load(FontFace fontFace)
```

## meteordevelopment.meteorclient.renderer.Fonts.getFamily

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/Fonts.java:85`

```java
public static FontFamily getFamily(String name)
```

## meteordevelopment.meteorclient.renderer.FullScreenRenderer

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/FullScreenRenderer.java:12`

```java
public class FullScreenRenderer
```

## meteordevelopment.meteorclient.renderer.FullScreenRenderer.vbo

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/FullScreenRenderer.java:13`

```java
public static GpuBuffer vbo
```

## meteordevelopment.meteorclient.renderer.FullScreenRenderer.ibo

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/FullScreenRenderer.java:14`

```java
public static GpuBuffer ibo
```

## meteordevelopment.meteorclient.renderer.FullScreenRenderer.mesh

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/FullScreenRenderer.java:20`

```java
@Deprecated(forRemoval = true) public static MeshBuilder mesh
```

## meteordevelopment.meteorclient.renderer.FullScreenRenderer.init

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/FullScreenRenderer.java:25`

```java
@PreInit public static void init()
```

## meteordevelopment.meteorclient.renderer.MeshBuilder

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/MeshBuilder.java:22`

```java
public class MeshBuilder
```

## meteordevelopment.meteorclient.renderer.MeshBuilder.alpha

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/MeshBuilder.java:25`

```java
public double alpha = 1
```

## meteordevelopment.meteorclient.renderer.MeshBuilder.MeshBuilder

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/MeshBuilder.java:42`

```java
public MeshBuilder(RenderPipeline pipeline)
```

## meteordevelopment.meteorclient.renderer.MeshBuilder.MeshBuilder

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/MeshBuilder.java:46`

```java
public MeshBuilder(VertexFormat format, VertexFormat.DrawMode drawMode)
```

## meteordevelopment.meteorclient.renderer.MeshBuilder.MeshBuilder

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/MeshBuilder.java:52`

```java
public MeshBuilder(VertexFormat format, VertexFormat.DrawMode drawMode, int vertexCount, int indexCount)
```

## meteordevelopment.meteorclient.renderer.MeshBuilder.begin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/MeshBuilder.java:57`

```java
public void begin()
```

## meteordevelopment.meteorclient.renderer.MeshBuilder.vec3

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/MeshBuilder.java:78`

```java
public MeshBuilder vec3(double x, double y, double z)
```

## meteordevelopment.meteorclient.renderer.MeshBuilder.vec2

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/MeshBuilder.java:91`

```java
public MeshBuilder vec2(double x, double y)
```

## meteordevelopment.meteorclient.renderer.MeshBuilder.color

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/MeshBuilder.java:103`

```java
public MeshBuilder color(Color c)
```

## meteordevelopment.meteorclient.renderer.MeshBuilder.next

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/MeshBuilder.java:117`

```java
public int next()
```

## meteordevelopment.meteorclient.renderer.MeshBuilder.line

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/MeshBuilder.java:121`

```java
public void line(int i1, int i2)
```

## meteordevelopment.meteorclient.renderer.MeshBuilder.quad

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/MeshBuilder.java:132`

```java
public void quad(int i1, int i2, int i3, int i4)
```

## meteordevelopment.meteorclient.renderer.MeshBuilder.triangle

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/MeshBuilder.java:148`

```java
public void triangle(int i1, int i2, int i3)
```

## meteordevelopment.meteorclient.renderer.MeshBuilder.ensureQuadCapacity

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/MeshBuilder.java:160`

```java
public void ensureQuadCapacity()
```

## meteordevelopment.meteorclient.renderer.MeshBuilder.ensureTriCapacity

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/MeshBuilder.java:164`

```java
public void ensureTriCapacity()
```

## meteordevelopment.meteorclient.renderer.MeshBuilder.ensureLineCapacity

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/MeshBuilder.java:168`

```java
public void ensureLineCapacity()
```

## meteordevelopment.meteorclient.renderer.MeshBuilder.ensureCapacity

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/MeshBuilder.java:172`

```java
public void ensureCapacity(int vertexCount, int indexCount)
```

## meteordevelopment.meteorclient.renderer.MeshBuilder.end

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/MeshBuilder.java:212`

```java
public void end()
```

## meteordevelopment.meteorclient.renderer.MeshBuilder.isBuilding

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/MeshBuilder.java:218`

```java
public boolean isBuilding()
```

## meteordevelopment.meteorclient.renderer.MeshBuilder.getVertexBuffer

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/MeshBuilder.java:222`

```java
public GpuBuffer getVertexBuffer()
```

## meteordevelopment.meteorclient.renderer.MeshBuilder.getIndexBuffer

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/MeshBuilder.java:227`

```java
public GpuBuffer getIndexBuffer()
```

## meteordevelopment.meteorclient.renderer.MeshBuilder.getIndicesCount

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/MeshBuilder.java:232`

```java
public int getIndicesCount()
```

## meteordevelopment.meteorclient.renderer.MeshRenderer

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/MeshRenderer.java:33`

```java
public class MeshRenderer
```

## meteordevelopment.meteorclient.renderer.MeshRenderer.begin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/MeshRenderer.java:51`

```java
public static MeshRenderer begin()
```

## meteordevelopment.meteorclient.renderer.MeshRenderer.attachments

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/MeshRenderer.java:59`

```java
public MeshRenderer attachments(GpuTextureView color, GpuTextureView depth)
```

## meteordevelopment.meteorclient.renderer.MeshRenderer.attachments

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/MeshRenderer.java:65`

```java
public MeshRenderer attachments(Framebuffer framebuffer)
```

## meteordevelopment.meteorclient.renderer.MeshRenderer.clearColor

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/MeshRenderer.java:71`

```java
public MeshRenderer clearColor(Color color)
```

## meteordevelopment.meteorclient.renderer.MeshRenderer.pipeline

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/MeshRenderer.java:76`

```java
public MeshRenderer pipeline(RenderPipeline pipeline)
```

## meteordevelopment.meteorclient.renderer.MeshRenderer.mesh

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/MeshRenderer.java:81`

```java
public MeshRenderer mesh(GpuBuffer vertices, GpuBuffer indices)
```

## meteordevelopment.meteorclient.renderer.MeshRenderer.mesh

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/MeshRenderer.java:87`

```java
public MeshRenderer mesh(MeshBuilder mesh)
```

## meteordevelopment.meteorclient.renderer.MeshRenderer.mesh

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/MeshRenderer.java:92`

```java
public MeshRenderer mesh(MeshBuilder mesh, Matrix4f matrix)
```

## meteordevelopment.meteorclient.renderer.MeshRenderer.mesh

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/MeshRenderer.java:97`

```java
public MeshRenderer mesh(MeshBuilder mesh, MatrixStack matrices)
```

## meteordevelopment.meteorclient.renderer.MeshRenderer.transform

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/MeshRenderer.java:102`

```java
public MeshRenderer transform(Matrix4f matrix)
```

## meteordevelopment.meteorclient.renderer.MeshRenderer.transform

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/MeshRenderer.java:107`

```java
public MeshRenderer transform(MatrixStack matrices)
```

## meteordevelopment.meteorclient.renderer.MeshRenderer.fullscreen

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/MeshRenderer.java:112`

```java
public MeshRenderer fullscreen()
```

## meteordevelopment.meteorclient.renderer.MeshRenderer.uniform

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/MeshRenderer.java:116`

```java
public MeshRenderer uniform(String name, GpuBufferSlice slice)
```

## meteordevelopment.meteorclient.renderer.MeshRenderer.sampler

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/MeshRenderer.java:121`

```java
public MeshRenderer sampler(String name, GpuTextureView view, GpuSampler sampler)
```

## meteordevelopment.meteorclient.renderer.MeshRenderer.end

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/MeshRenderer.java:129`

```java
public void end()
```

## meteordevelopment.meteorclient.renderer.MeshUniforms

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/MeshUniforms.java:16`

```java
public class MeshUniforms
```

## meteordevelopment.meteorclient.renderer.MeshUniforms.SIZE

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/MeshUniforms.java:17`

```java
public static final int SIZE = new Std140SizeCalculator() .putMat4f() .putMat4f() .get()
```

## meteordevelopment.meteorclient.renderer.MeshUniforms.flipFrame

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/MeshUniforms.java:26`

```java
public static void flipFrame()
```

## meteordevelopment.meteorclient.renderer.MeshUniforms.write

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/MeshUniforms.java:30`

```java
public static GpuBufferSlice write(Matrix4f proj, Matrix4f modelView)
```

## meteordevelopment.meteorclient.renderer.MeteorRenderPipelines

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/MeteorRenderPipelines.java:26`

```java
public abstract class MeteorRenderPipelines
```

## meteordevelopment.meteorclient.renderer.MeteorRenderPipelines.WORLD_COLORED

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/MeteorRenderPipelines.java:37`

```java
public static final RenderPipeline WORLD_COLORED = add(new ExtendedRenderPipelineBuilder(MESH_UNIFORMS) .withLocation(MeteorClient.identifier("pipeline/world_colored")) .withVertexFormat(VertexFormats.POSITION_COLOR, VertexFormat.DrawMode.TRIANGLES) .withVertexShader(MeteorClient.identifier("shaders/pos_color.vert")) .withFragmentShader(MeteorClient.identifier("shaders/pos_color.frag")) .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST) .withDepthWrite(false) .withBlend(BlendFunction.TRANSLUCENT) .withCull(false) .build() )
```

## meteordevelopment.meteorclient.renderer.MeteorRenderPipelines.WORLD_COLORED_LINES

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/MeteorRenderPipelines.java:49`

```java
public static final RenderPipeline WORLD_COLORED_LINES = add(new ExtendedRenderPipelineBuilder(MESH_UNIFORMS) .withLineSmooth() .withLocation(MeteorClient.identifier("pipeline/world_colored_lines")) .withVertexFormat(VertexFormats.POSITION_COLOR, VertexFormat.DrawMode.DEBUG_LINES) .withVertexShader(MeteorClient.identifier("shaders/pos_color.vert")) .withFragmentShader(MeteorClient.identifier("shaders/pos_color.frag")) .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST) .withDepthWrite(false) .withBlend(BlendFunction.TRANSLUCENT) .withCull(false) .build() )
```

## meteordevelopment.meteorclient.renderer.MeteorRenderPipelines.WORLD_COLORED_DEPTH

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/MeteorRenderPipelines.java:62`

```java
public static final RenderPipeline WORLD_COLORED_DEPTH = add(new ExtendedRenderPipelineBuilder(MESH_UNIFORMS) .withLocation(MeteorClient.identifier("pipeline/world_colored_depth")) .withVertexFormat(VertexFormats.POSITION_COLOR, VertexFormat.DrawMode.TRIANGLES) .withVertexShader(MeteorClient.identifier("shaders/pos_color.vert")) .withFragmentShader(MeteorClient.identifier("shaders/pos_color.frag")) .withDepthTestFunction(DepthTestFunction.LEQUAL_DEPTH_TEST) .withDepthWrite(false) .withBlend(BlendFunction.TRANSLUCENT) .withCull(false) .build() )
```

## meteordevelopment.meteorclient.renderer.MeteorRenderPipelines.WORLD_COLORED_LINES_DEPTH

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/MeteorRenderPipelines.java:74`

```java
public static final RenderPipeline WORLD_COLORED_LINES_DEPTH = add(new ExtendedRenderPipelineBuilder(MESH_UNIFORMS) .withLineSmooth() .withLocation(MeteorClient.identifier("pipeline/world_colored_lines_depth")) .withVertexFormat(VertexFormats.POSITION_COLOR, VertexFormat.DrawMode.DEBUG_LINES) .withVertexShader(MeteorClient.identifier("shaders/pos_color.vert")) .withFragmentShader(MeteorClient.identifier("shaders/pos_color.frag")) .withDepthTestFunction(DepthTestFunction.LEQUAL_DEPTH_TEST) .withDepthWrite(false) .withBlend(BlendFunction.TRANSLUCENT) .withCull(false) .build() )
```

## meteordevelopment.meteorclient.renderer.MeteorRenderPipelines.UI_COLORED

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/MeteorRenderPipelines.java:89`

```java
public static final RenderPipeline UI_COLORED = add(new ExtendedRenderPipelineBuilder(MESH_UNIFORMS) .withLocation(MeteorClient.identifier("pipeline/ui_colored")) .withVertexFormat(MeteorVertexFormats.POS2_COLOR, VertexFormat.DrawMode.TRIANGLES) .withVertexShader(MeteorClient.identifier("shaders/pos_color.vert")) .withFragmentShader(MeteorClient.identifier("shaders/pos_color.frag")) .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST) .withDepthWrite(false) .withBlend(BlendFunction.TRANSLUCENT) .withCull(true) .build() )
```

## meteordevelopment.meteorclient.renderer.MeteorRenderPipelines.UI_COLORED_LINES

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/MeteorRenderPipelines.java:101`

```java
public static final RenderPipeline UI_COLORED_LINES = add(new ExtendedRenderPipelineBuilder(MESH_UNIFORMS) .withLocation(MeteorClient.identifier("pipeline/ui_colored_lines")) .withVertexFormat(MeteorVertexFormats.POS2_COLOR, VertexFormat.DrawMode.DEBUG_LINES) .withVertexShader(MeteorClient.identifier("shaders/pos_color.vert")) .withFragmentShader(MeteorClient.identifier("shaders/pos_color.frag")) .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST) .withDepthWrite(false) .withBlend(BlendFunction.TRANSLUCENT) .withCull(true) .build() )
```

## meteordevelopment.meteorclient.renderer.MeteorRenderPipelines.UI_TEXTURED

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/MeteorRenderPipelines.java:113`

```java
public static final RenderPipeline UI_TEXTURED = add(new ExtendedRenderPipelineBuilder(MESH_UNIFORMS) .withLocation(MeteorClient.identifier("pipeline/ui_textured")) .withVertexFormat(MeteorVertexFormats.POS2_TEXTURE_COLOR, VertexFormat.DrawMode.TRIANGLES) .withVertexShader(MeteorClient.identifier("shaders/pos_tex_color.vert")) .withFragmentShader(MeteorClient.identifier("shaders/pos_tex_color.frag")) .withSampler("u_Texture") .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST) .withDepthWrite(false) .withBlend(BlendFunction.TRANSLUCENT) .withCull(true) .build() )
```

## meteordevelopment.meteorclient.renderer.MeteorRenderPipelines.UI_TEXT

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/MeteorRenderPipelines.java:126`

```java
public static final RenderPipeline UI_TEXT = add(new ExtendedRenderPipelineBuilder(MESH_UNIFORMS) .withLocation(MeteorClient.identifier("pipeline/ui_text")) .withVertexFormat(MeteorVertexFormats.POS2_TEXTURE_COLOR, VertexFormat.DrawMode.TRIANGLES) .withVertexShader(MeteorClient.identifier("shaders/text.vert")) .withFragmentShader(MeteorClient.identifier("shaders/text.frag")) .withSampler("u_Texture") .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST) .withDepthWrite(false) .withBlend(BlendFunction.TRANSLUCENT) .withCull(true) .build() )
```

## meteordevelopment.meteorclient.renderer.MeteorRenderPipelines.POST_OUTLINE

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/MeteorRenderPipelines.java:141`

```java
public static final RenderPipeline POST_OUTLINE = add(new ExtendedRenderPipelineBuilder() .withLocation(MeteorClient.identifier("pipeline/post/outline")) .withVertexFormat(MeteorVertexFormats.POS2, VertexFormat.DrawMode.TRIANGLES) .withVertexShader(MeteorClient.identifier("shaders/post-process/base.vert")) .withFragmentShader(MeteorClient.identifier("shaders/post-process/outline.frag")) .withSampler("u_Texture") .withUniform("PostData", UniformType.UNIFORM_BUFFER) .withUniform("OutlineData", UniformType.UNIFORM_BUFFER) .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST) .withDepthWrite(false) .withBlend(BlendFunction.TRANSLUCENT) .withCull(false) .build() )
```

## meteordevelopment.meteorclient.renderer.MeteorRenderPipelines.POST_IMAGE

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/MeteorRenderPipelines.java:156`

```java
public static final RenderPipeline POST_IMAGE = add(new ExtendedRenderPipelineBuilder(MESH_UNIFORMS) .withLocation(MeteorClient.identifier("pipeline/post/image")) .withVertexFormat(MeteorVertexFormats.POS2, VertexFormat.DrawMode.TRIANGLES) .withVertexShader(MeteorClient.identifier("shaders/post-process/base.vert")) .withFragmentShader(MeteorClient.identifier("shaders/post-process/image.frag")) .withSampler("u_Texture") .withSampler("u_TextureI") .withUniform("PostData", UniformType.UNIFORM_BUFFER) .withUniform("ImageData", UniformType.UNIFORM_BUFFER) .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST) .withDepthWrite(false) .withBlend(BlendFunction.TRANSLUCENT) .withCull(false) .build() )
```

## meteordevelopment.meteorclient.renderer.MeteorRenderPipelines.BLUR_DOWN

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/MeteorRenderPipelines.java:174`

```java
public static final RenderPipeline BLUR_DOWN = add(new ExtendedRenderPipelineBuilder(MESH_UNIFORMS) .withLocation(MeteorClient.identifier("pipeline/blur/down")) .withVertexFormat(MeteorVertexFormats.POS2, VertexFormat.DrawMode.TRIANGLES) .withVertexShader(MeteorClient.identifier("shaders/blur.vert")) .withFragmentShader(MeteorClient.identifier("shaders/blur_down.frag")) .withSampler("u_Texture") .withUniform("BlurData", UniformType.UNIFORM_BUFFER) .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST) .withDepthWrite(false) .withBlend(BlendFunction.TRANSLUCENT) .withCull(false) .build() )
```

## meteordevelopment.meteorclient.renderer.MeteorRenderPipelines.BLUR_UP

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/MeteorRenderPipelines.java:188`

```java
public static final RenderPipeline BLUR_UP = add(new ExtendedRenderPipelineBuilder(MESH_UNIFORMS) .withLocation(MeteorClient.identifier("pipeline/blur/up")) .withVertexFormat(MeteorVertexFormats.POS2, VertexFormat.DrawMode.TRIANGLES) .withVertexShader(MeteorClient.identifier("shaders/blur.vert")) .withFragmentShader(MeteorClient.identifier("shaders/blur_up.frag")) .withSampler("u_Texture") .withUniform("BlurData", UniformType.UNIFORM_BUFFER) .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST) .withDepthWrite(false) .withBlend(BlendFunction.TRANSLUCENT) .withCull(false) .build() )
```

## meteordevelopment.meteorclient.renderer.MeteorRenderPipelines.BLUR_PASSTHROUGH

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/MeteorRenderPipelines.java:202`

```java
public static final RenderPipeline BLUR_PASSTHROUGH = add(new ExtendedRenderPipelineBuilder(MESH_UNIFORMS) .withLocation(MeteorClient.identifier("pipeline/blur/up")) .withVertexFormat(MeteorVertexFormats.POS2, VertexFormat.DrawMode.TRIANGLES) .withVertexShader(MeteorClient.identifier("shaders/passthrough.vert")) .withFragmentShader(MeteorClient.identifier("shaders/passthrough.frag")) .withSampler("u_Texture") .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST) .withDepthWrite(false) .withBlend(BlendFunction.TRANSLUCENT) .withCull(false) .build() )
```

## meteordevelopment.meteorclient.renderer.MeteorRenderPipelines.precompile

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/MeteorRenderPipelines.java:220`

```java
public static void precompile()
```

## meteordevelopment.meteorclient.renderer.MeteorVertexFormatElements

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/MeteorVertexFormatElements.java:10`

```java
public abstract class MeteorVertexFormatElements
```

## meteordevelopment.meteorclient.renderer.MeteorVertexFormatElements.POS2

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/MeteorVertexFormatElements.java:11`

```java
public static final VertexFormatElement POS2 = VertexFormatElement.register(getNextVertexFormatElementId(), 0, VertexFormatElement.Type.FLOAT, VertexFormatElement.Usage.POSITION, 2)
```

## meteordevelopment.meteorclient.renderer.MeteorVertexFormats

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/MeteorVertexFormats.java:11`

```java
public abstract class MeteorVertexFormats
```

## meteordevelopment.meteorclient.renderer.MeteorVertexFormats.POS2

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/MeteorVertexFormats.java:12`

```java
public static final VertexFormat POS2 = VertexFormat.builder() .add("Position", MeteorVertexFormatElements.POS2) .build()
```

## meteordevelopment.meteorclient.renderer.MeteorVertexFormats.POS2_COLOR

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/MeteorVertexFormats.java:16`

```java
public static final VertexFormat POS2_COLOR = VertexFormat.builder() .add("Position", MeteorVertexFormatElements.POS2) .add("Color", VertexFormatElement.COLOR) .build()
```

## meteordevelopment.meteorclient.renderer.MeteorVertexFormats.POS2_TEXTURE_COLOR

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/MeteorVertexFormats.java:21`

```java
public static final VertexFormat POS2_TEXTURE_COLOR = VertexFormat.builder() .add("Position", MeteorVertexFormatElements.POS2) .add("Texture", VertexFormatElement.UV) .add("Color", VertexFormatElement.COLOR) .build()
```

## meteordevelopment.meteorclient.renderer.Renderer2D

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/Renderer2D.java:15`

```java
public class Renderer2D
```

## meteordevelopment.meteorclient.renderer.Renderer2D.COLOR

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/Renderer2D.java:16`

```java
public static Renderer2D COLOR
```

## meteordevelopment.meteorclient.renderer.Renderer2D.TEXTURE

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/Renderer2D.java:17`

```java
public static Renderer2D TEXTURE
```

## meteordevelopment.meteorclient.renderer.Renderer2D.triangles

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/Renderer2D.java:21`

```java
public final MeshBuilder triangles
```

## meteordevelopment.meteorclient.renderer.Renderer2D.lines

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/Renderer2D.java:22`

```java
public final MeshBuilder lines
```

## meteordevelopment.meteorclient.renderer.Renderer2D.Renderer2D

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/Renderer2D.java:24`

```java
public Renderer2D(boolean textured)
```

## meteordevelopment.meteorclient.renderer.Renderer2D.init

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/Renderer2D.java:31`

```java
@PreInit public static void init()
```

## meteordevelopment.meteorclient.renderer.Renderer2D.setAlpha

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/Renderer2D.java:37`

```java
public void setAlpha(double alpha)
```

## meteordevelopment.meteorclient.renderer.Renderer2D.begin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/Renderer2D.java:41`

```java
public void begin()
```

## meteordevelopment.meteorclient.renderer.Renderer2D.end

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/Renderer2D.java:46`

```java
public void end()
```

## meteordevelopment.meteorclient.renderer.Renderer2D.render

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/Renderer2D.java:51`

```java
public void render()
```

## meteordevelopment.meteorclient.renderer.Renderer2D.render

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/Renderer2D.java:55`

```java
public void render(GpuTextureView textureView, GpuSampler sampler)
```

## meteordevelopment.meteorclient.renderer.Renderer2D.render

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/Renderer2D.java:62`

```java
public void render(String samplerName, GpuTextureView samplerView, GpuSampler sampler)
```

## meteordevelopment.meteorclient.renderer.Renderer2D.triangle

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/Renderer2D.java:81`

```java
public void triangle(double x1, double y1, double x2, double y2, double x3, double y3, Color color)
```

## meteordevelopment.meteorclient.renderer.Renderer2D.line

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/Renderer2D.java:93`

```java
public void line(double x1, double y1, double x2, double y2, Color color)
```

## meteordevelopment.meteorclient.renderer.Renderer2D.boxLines

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/Renderer2D.java:102`

```java
public void boxLines(double x, double y, double width, double height, Color color)
```

## meteordevelopment.meteorclient.renderer.Renderer2D.quad

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/Renderer2D.java:118`

```java
public void quad(double x, double y, double width, double height, Color cTopLeft, Color cTopRight, Color cBottomRight, Color cBottomLeft)
```

## meteordevelopment.meteorclient.renderer.Renderer2D.quad

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/Renderer2D.java:129`

```java
public void quad(double x, double y, double width, double height, Color color)
```

## meteordevelopment.meteorclient.renderer.Renderer2D.texQuad

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/Renderer2D.java:135`

```java
public void texQuad(double x, double y, double width, double height, Color color)
```

## meteordevelopment.meteorclient.renderer.Renderer2D.texQuad

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/Renderer2D.java:146`

```java
public void texQuad(double x, double y, double width, double height, TextureRegion texture, Color color)
```

## meteordevelopment.meteorclient.renderer.Renderer2D.texQuad

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/Renderer2D.java:157`

```java
public void texQuad(double x, double y, double width, double height, double rotation, double texX1, double texY1, double texX2, double texY2, Color color)
```

## meteordevelopment.meteorclient.renderer.Renderer2D.texQuad

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/Renderer2D.java:186`

```java
public void texQuad(double x, double y, double width, double height, double rotation, TextureRegion region, Color color)
```

## meteordevelopment.meteorclient.renderer.Renderer3D

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/Renderer3D.java:16`

```java
public class Renderer3D
```

## meteordevelopment.meteorclient.renderer.Renderer3D.lines

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/Renderer3D.java:17`

```java
public final MeshBuilder lines
```

## meteordevelopment.meteorclient.renderer.Renderer3D.triangles

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/Renderer3D.java:18`

```java
public final MeshBuilder triangles
```

## meteordevelopment.meteorclient.renderer.Renderer3D.Renderer3D

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/Renderer3D.java:22`

```java
public Renderer3D(RenderPipeline lines, RenderPipeline triangles)
```

## meteordevelopment.meteorclient.renderer.Renderer3D.begin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/Renderer3D.java:29`

```java
public void begin()
```

## meteordevelopment.meteorclient.renderer.Renderer3D.render

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/Renderer3D.java:34`

```java
public void render(MatrixStack matrices)
```

## meteordevelopment.meteorclient.renderer.Renderer3D.line

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/Renderer3D.java:50`

```java
public void line(double x1, double y1, double z1, double x2, double y2, double z2, Color color1, Color color2)
```

## meteordevelopment.meteorclient.renderer.Renderer3D.line

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/Renderer3D.java:59`

```java
public void line(double x1, double y1, double z1, double x2, double y2, double z2, Color color)
```

## meteordevelopment.meteorclient.renderer.Renderer3D.boxLines

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/Renderer3D.java:63`

```java
@SuppressWarnings("Duplicates") public void boxLines(double x1, double y1, double z1, double x2, double y2, double z2, Color color, int excludeDir)
```

## meteordevelopment.meteorclient.renderer.Renderer3D.blockLines

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/Renderer3D.java:116`

```java
public void blockLines(int x, int y, int z, Color color, int excludeDir)
```

## meteordevelopment.meteorclient.renderer.Renderer3D.quad

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/Renderer3D.java:122`

```java
public void quad(double x1, double y1, double z1, double x2, double y2, double z2, double x3, double y3, double z3, double x4, double y4, double z4, Color topLeft, Color topRight, Color bottomRight, Color bottomLeft)
```

## meteordevelopment.meteorclient.renderer.Renderer3D.quad

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/Renderer3D.java:133`

```java
public void quad(double x1, double y1, double z1, double x2, double y2, double z2, double x3, double y3, double z3, double x4, double y4, double z4, Color color)
```

## meteordevelopment.meteorclient.renderer.Renderer3D.quadVertical

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/Renderer3D.java:137`

```java
public void quadVertical(double x1, double y1, double z1, double x2, double y2, double z2, Color color)
```

## meteordevelopment.meteorclient.renderer.Renderer3D.quadHorizontal

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/Renderer3D.java:141`

```java
public void quadHorizontal(double x1, double y, double z1, double x2, double z2, Color color)
```

## meteordevelopment.meteorclient.renderer.Renderer3D.gradientQuadVertical

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/Renderer3D.java:145`

```java
public void gradientQuadVertical(double x1, double y1, double z1, double x2, double y2, double z2, Color topColor, Color bottomColor)
```

## meteordevelopment.meteorclient.renderer.Renderer3D.side

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/Renderer3D.java:151`

```java
@SuppressWarnings("Duplicates") public void side(double x1, double y1, double z1, double x2, double y2, double z2, double x3, double y3, double z3, double x4, double y4, double z4, Color sideColor, Color lineColor, ShapeMode mode)
```

## meteordevelopment.meteorclient.renderer.Renderer3D.sideVertical

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/Renderer3D.java:172`

```java
public void sideVertical(double x1, double y1, double z1, double x2, double y2, double z2, Color sideColor, Color lineColor, ShapeMode mode)
```

## meteordevelopment.meteorclient.renderer.Renderer3D.sideHorizontal

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/Renderer3D.java:176`

```java
public void sideHorizontal(double x1, double y, double z1, double x2, double z2, Color sideColor, Color lineColor, ShapeMode mode)
```

## meteordevelopment.meteorclient.renderer.Renderer3D.boxSides

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/Renderer3D.java:182`

```java
@SuppressWarnings("Duplicates") public void boxSides(double x1, double y1, double z1, double x2, double y2, double z2, Color color, int excludeDir)
```

## meteordevelopment.meteorclient.renderer.Renderer3D.blockSides

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/Renderer3D.java:223`

```java
public void blockSides(int x, int y, int z, Color color, int excludeDir)
```

## meteordevelopment.meteorclient.renderer.Renderer3D.box

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/Renderer3D.java:227`

```java
public void box(double x1, double y1, double z1, double x2, double y2, double z2, Color sideColor, Color lineColor, ShapeMode mode, int excludeDir)
```

## meteordevelopment.meteorclient.renderer.Renderer3D.box

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/Renderer3D.java:232`

```java
public void box(BlockPos pos, Color sideColor, Color lineColor, ShapeMode mode, int excludeDir)
```

## meteordevelopment.meteorclient.renderer.Renderer3D.box

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/Renderer3D.java:237`

```java
public void box(Box box, Color sideColor, Color lineColor, ShapeMode mode, int excludeDir)
```

## meteordevelopment.meteorclient.renderer.ShapeMode

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/ShapeMode.java:8`

```java
public enum ShapeMode
```

## meteordevelopment.meteorclient.renderer.ShapeMode.lines

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/ShapeMode.java:13`

```java
public boolean lines()
```

## meteordevelopment.meteorclient.renderer.ShapeMode.sides

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/ShapeMode.java:17`

```java
public boolean sides()
```

## meteordevelopment.meteorclient.renderer.Texture

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/Texture.java:25`

```java
public class Texture extends AbstractTexture
```

## meteordevelopment.meteorclient.renderer.Texture.Texture

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/Texture.java:26`

```java
public Texture(int width, int height, TextureFormat format, FilterMode min, FilterMode mag)
```

## meteordevelopment.meteorclient.renderer.Texture.getWidth

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/Texture.java:33`

```java
public int getWidth()
```

## meteordevelopment.meteorclient.renderer.Texture.getHeight

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/Texture.java:37`

```java
public int getHeight()
```

## meteordevelopment.meteorclient.renderer.Texture.upload

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/Texture.java:41`

```java
public void upload(byte[] bytes)
```

## meteordevelopment.meteorclient.renderer.Texture.upload

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/Texture.java:45`

```java
public void upload(ByteBuffer buffer)
```

## meteordevelopment.meteorclient.renderer.Texture.readResource

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/Texture.java:68`

```java
public static Texture readResource(String path, boolean flipY, FilterMode filter)
```

## meteordevelopment.meteorclient.renderer.text.BuiltinFontFace

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/text/BuiltinFontFace.java:10`

```java
@NullMarked public non-sealed class BuiltinFontFace extends FontFace
```

## meteordevelopment.meteorclient.renderer.text.BuiltinFontFace.BuiltinFontFace

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/text/BuiltinFontFace.java:14`

```java
public BuiltinFontFace(FontInfo info, String name)
```

## meteordevelopment.meteorclient.renderer.text.BuiltinFontFace.byteChannelForRead

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/text/BuiltinFontFace.java:20`

```java
@Override public ReadableByteChannel byteChannelForRead()
```

## meteordevelopment.meteorclient.renderer.text.BuiltinFontFace.toString

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/text/BuiltinFontFace.java:29`

```java
@Override public String toString()
```

## meteordevelopment.meteorclient.renderer.text.CustomTextRenderer

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/text/CustomTextRenderer.java:17`

```java
public class CustomTextRenderer implements TextRenderer
```

## meteordevelopment.meteorclient.renderer.text.CustomTextRenderer.SHADOW_COLOR

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/text/CustomTextRenderer.java:18`

```java
public static final Color SHADOW_COLOR = new Color(60, 60, 60, 180)
```

## meteordevelopment.meteorclient.renderer.text.CustomTextRenderer.fontFace

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/text/CustomTextRenderer.java:22`

```java
public final FontFace fontFace
```

## meteordevelopment.meteorclient.renderer.text.CustomTextRenderer.CustomTextRenderer

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/text/CustomTextRenderer.java:32`

```java
public CustomTextRenderer(FontFace fontFace) throws IOException
```

## meteordevelopment.meteorclient.renderer.text.CustomTextRenderer.setAlpha

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/text/CustomTextRenderer.java:43`

```java
@Override public void setAlpha(double a)
```

## meteordevelopment.meteorclient.renderer.text.CustomTextRenderer.begin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/text/CustomTextRenderer.java:48`

```java
@Override public void begin(double scale, boolean scaleOnly, boolean big)
```

## meteordevelopment.meteorclient.renderer.text.CustomTextRenderer.getWidth

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/text/CustomTextRenderer.java:77`

```java
@Override public double getWidth(String text, int length, boolean shadow)
```

## meteordevelopment.meteorclient.renderer.text.CustomTextRenderer.getHeight

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/text/CustomTextRenderer.java:85`

```java
@Override public double getHeight(boolean shadow)
```

## meteordevelopment.meteorclient.renderer.text.CustomTextRenderer.render

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/text/CustomTextRenderer.java:91`

```java
@Override public double render(String text, double x, double y, Color color, boolean shadow)
```

## meteordevelopment.meteorclient.renderer.text.CustomTextRenderer.isBuilding

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/text/CustomTextRenderer.java:114`

```java
@Override public boolean isBuilding()
```

## meteordevelopment.meteorclient.renderer.text.CustomTextRenderer.end

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/text/CustomTextRenderer.java:119`

```java
@Override public void end()
```

## meteordevelopment.meteorclient.renderer.text.CustomTextRenderer.destroy

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/text/CustomTextRenderer.java:138`

```java
public void destroy()
```

## meteordevelopment.meteorclient.renderer.text.Font

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/text/Font.java:21`

```java
public class Font
```

## meteordevelopment.meteorclient.renderer.text.Font.texture

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/text/Font.java:22`

```java
public final Texture texture
```

## meteordevelopment.meteorclient.renderer.text.Font.Font

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/text/Font.java:29`

```java
public Font(ByteBuffer buffer, int height)
```

## meteordevelopment.meteorclient.renderer.text.Font.getWidth

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/text/Font.java:102`

```java
public double getWidth(String string, int length)
```

## meteordevelopment.meteorclient.renderer.text.Font.getHeight

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/text/Font.java:116`

```java
public int getHeight()
```

## meteordevelopment.meteorclient.renderer.text.Font.render

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/text/Font.java:120`

```java
public double render(MeshBuilder mesh, String string, double x, double y, Color color, double scale)
```

## meteordevelopment.meteorclient.renderer.text.FontFace

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/text/FontFace.java:11`

```java
@NullMarked public abstract sealed class FontFace permits BuiltinFontFace, SystemFontFace
```

## meteordevelopment.meteorclient.renderer.text.FontFace.info

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/text/FontFace.java:13`

```java
public final FontInfo info
```

## meteordevelopment.meteorclient.renderer.text.FontFace.FontFace

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/text/FontFace.java:15`

```java
protected FontFace(FontInfo info)
```

## meteordevelopment.meteorclient.renderer.text.FontFace.byteChannelForRead

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/text/FontFace.java:19`

```java
public abstract ReadableByteChannel byteChannelForRead() throws IOException
```

## meteordevelopment.meteorclient.renderer.text.FontFace.readToDirectByteBuffer

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/text/FontFace.java:21`

```java
public final ByteBuffer readToDirectByteBuffer() throws IOException
```

## meteordevelopment.meteorclient.renderer.text.FontFace.toString

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/text/FontFace.java:27`

```java
@Override public String toString()
```

## meteordevelopment.meteorclient.renderer.text.FontFamily

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/text/FontFamily.java:11`

```java
public class FontFamily
```

## meteordevelopment.meteorclient.renderer.text.FontFamily.FontFamily

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/text/FontFamily.java:15`

```java
public FontFamily(String name)
```

## meteordevelopment.meteorclient.renderer.text.FontFamily.addFont

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/text/FontFamily.java:19`

```java
public boolean addFont(FontFace font)
```

## meteordevelopment.meteorclient.renderer.text.FontFamily.hasType

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/text/FontFamily.java:23`

```java
public boolean hasType(FontInfo.Type type)
```

## meteordevelopment.meteorclient.renderer.text.FontFamily.get

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/text/FontFamily.java:27`

```java
public FontFace get(FontInfo.Type type)
```

## meteordevelopment.meteorclient.renderer.text.FontFamily.getName

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/text/FontFamily.java:39`

```java
public String getName()
```

## meteordevelopment.meteorclient.renderer.text.FontInfo

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/text/FontInfo.java:8`

```java
public record FontInfo(String family, Type type)
```

## meteordevelopment.meteorclient.renderer.text.FontInfo.toString

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/text/FontInfo.java:9`

```java
@Override public String toString()
```

## meteordevelopment.meteorclient.renderer.text.FontInfo.equals

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/text/FontInfo.java:14`

```java
public boolean equals(FontInfo info)
```

## meteordevelopment.meteorclient.renderer.text.FontInfo.Type

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/text/FontInfo.java:20`

```java
public enum Type
```

## meteordevelopment.meteorclient.renderer.text.FontInfo.Type.fromString

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/text/FontInfo.java:26`

```java
public static Type fromString(String str)
```

## meteordevelopment.meteorclient.renderer.text.FontInfo.Type.toString

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/text/FontInfo.java:35`

```java
@Override public String toString()
```

## meteordevelopment.meteorclient.renderer.text.SystemFontFace

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/text/SystemFontFace.java:11`

```java
@NullMarked public final class SystemFontFace extends FontFace
```

## meteordevelopment.meteorclient.renderer.text.SystemFontFace.SystemFontFace

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/text/SystemFontFace.java:15`

```java
public SystemFontFace(FontInfo info, Path path)
```

## meteordevelopment.meteorclient.renderer.text.SystemFontFace.byteChannelForRead

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/text/SystemFontFace.java:21`

```java
@Override public ReadableByteChannel byteChannelForRead() throws IOException
```

## meteordevelopment.meteorclient.renderer.text.SystemFontFace.toString

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/text/SystemFontFace.java:26`

```java
@Override public String toString()
```

## meteordevelopment.meteorclient.renderer.text.TextRenderer

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/text/TextRenderer.java:12`

```java
public interface TextRenderer
```

## meteordevelopment.meteorclient.renderer.text.TextRenderer.get

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/text/TextRenderer.java:13`

```java
static TextRenderer get()
```

## meteordevelopment.meteorclient.renderer.text.TextRenderer.setAlpha

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/text/TextRenderer.java:17`

```java
void setAlpha(double a)
```

## meteordevelopment.meteorclient.renderer.text.TextRenderer.begin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/text/TextRenderer.java:19`

```java
void begin(double scale, boolean scaleOnly, boolean big)
```

## meteordevelopment.meteorclient.renderer.text.TextRenderer.begin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/text/TextRenderer.java:20`

```java
default void begin(double scale)
```

## meteordevelopment.meteorclient.renderer.text.TextRenderer.begin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/text/TextRenderer.java:21`

```java
default void begin()
```

## meteordevelopment.meteorclient.renderer.text.TextRenderer.beginBig

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/text/TextRenderer.java:23`

```java
default void beginBig()
```

## meteordevelopment.meteorclient.renderer.text.TextRenderer.getWidth

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/text/TextRenderer.java:25`

```java
double getWidth(String text, int length, boolean shadow)
```

## meteordevelopment.meteorclient.renderer.text.TextRenderer.getWidth

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/text/TextRenderer.java:26`

```java
default double getWidth(String text, boolean shadow)
```

## meteordevelopment.meteorclient.renderer.text.TextRenderer.getWidth

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/text/TextRenderer.java:27`

```java
default double getWidth(String text)
```

## meteordevelopment.meteorclient.renderer.text.TextRenderer.getHeight

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/text/TextRenderer.java:29`

```java
double getHeight(boolean shadow)
```

## meteordevelopment.meteorclient.renderer.text.TextRenderer.getHeight

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/text/TextRenderer.java:30`

```java
default double getHeight()
```

## meteordevelopment.meteorclient.renderer.text.TextRenderer.render

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/text/TextRenderer.java:32`

```java
double render(String text, double x, double y, Color color, boolean shadow)
```

## meteordevelopment.meteorclient.renderer.text.TextRenderer.render

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/text/TextRenderer.java:33`

```java
default double render(String text, double x, double y, Color color)
```

## meteordevelopment.meteorclient.renderer.text.TextRenderer.isBuilding

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/text/TextRenderer.java:35`

```java
boolean isBuilding()
```

## meteordevelopment.meteorclient.renderer.text.TextRenderer.end

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/text/TextRenderer.java:37`

```java
void end()
```

## meteordevelopment.meteorclient.renderer.text.VanillaTextRenderer

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/text/VanillaTextRenderer.java:20`

```java
public class VanillaTextRenderer implements TextRenderer
```

## meteordevelopment.meteorclient.renderer.text.VanillaTextRenderer.INSTANCE

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/text/VanillaTextRenderer.java:21`

```java
public static final VanillaTextRenderer INSTANCE = new VanillaTextRenderer()
```

## meteordevelopment.meteorclient.renderer.text.VanillaTextRenderer.scale

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/text/VanillaTextRenderer.java:29`

```java
public double scale = 2
```

## meteordevelopment.meteorclient.renderer.text.VanillaTextRenderer.scaleIndividually

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/text/VanillaTextRenderer.java:30`

```java
public boolean scaleIndividually
```

## meteordevelopment.meteorclient.renderer.text.VanillaTextRenderer.setAlpha

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/text/VanillaTextRenderer.java:39`

```java
@Override public void setAlpha(double a)
```

## meteordevelopment.meteorclient.renderer.text.VanillaTextRenderer.getWidth

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/text/VanillaTextRenderer.java:44`

```java
@Override public double getWidth(String text, int length, boolean shadow)
```

## meteordevelopment.meteorclient.renderer.text.VanillaTextRenderer.getHeight

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/text/VanillaTextRenderer.java:52`

```java
@Override public double getHeight(boolean shadow)
```

## meteordevelopment.meteorclient.renderer.text.VanillaTextRenderer.begin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/text/VanillaTextRenderer.java:57`

```java
@Override public void begin(double scale, boolean scaleOnly, boolean big)
```

## meteordevelopment.meteorclient.renderer.text.VanillaTextRenderer.render

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/text/VanillaTextRenderer.java:65`

```java
@Override public double render(String text, double x, double y, Color color, boolean shadow)
```

## meteordevelopment.meteorclient.renderer.text.VanillaTextRenderer.isBuilding

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/text/VanillaTextRenderer.java:94`

```java
@Override public boolean isBuilding()
```

## meteordevelopment.meteorclient.renderer.text.VanillaTextRenderer.end

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/text/VanillaTextRenderer.java:99`

```java
@Override public void end()
```
