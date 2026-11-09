# utils/render

Khai báo Java có cú pháp public/protected. Không bao gồm API kế thừa/tổng hợp bởi compiler; xem kiểm tra bytecode riêng.

## meteordevelopment.meteorclient.utils.render.AlignmentX

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/AlignmentX.java:8`

```java
public enum AlignmentX
```

## meteordevelopment.meteorclient.utils.render.AlignmentY

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/AlignmentY.java:8`

```java
public enum AlignmentY
```

## meteordevelopment.meteorclient.utils.render.Box

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/Box.java:10`

```java
public class Box
```

## meteordevelopment.meteorclient.utils.render.Box.x

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/Box.java:11`

```java
public double x, y
```

## meteordevelopment.meteorclient.utils.render.Box.y

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/Box.java:11`

```java
public double x, y
```

## meteordevelopment.meteorclient.utils.render.Box.width

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/Box.java:12`

```java
public double width, height
```

## meteordevelopment.meteorclient.utils.render.Box.height

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/Box.java:12`

```java
public double width, height
```

## meteordevelopment.meteorclient.utils.render.Box.Box

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/Box.java:14`

```java
public Box(double x, double y, double width, double height)
```

## meteordevelopment.meteorclient.utils.render.Box.Box

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/Box.java:21`

```java
public Box()
```

## meteordevelopment.meteorclient.utils.render.Box.equals

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/Box.java:25`

```java
@Override public boolean equals(Object o)
```

## meteordevelopment.meteorclient.utils.render.Box.hashCode

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/Box.java:36`

```java
@Override public int hashCode()
```

## meteordevelopment.meteorclient.utils.render.CustomBannerGuiElementRenderState

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/CustomBannerGuiElementRenderState.java:15`

```java
public record CustomBannerGuiElementRenderState( BannerFlagBlockModel flag, DyeColor baseColor, BannerPatternsComponent resultBannerPatterns, int x1, int y1, int x2, int y2, @Nullable ScreenRect scissorArea, @Nullable ScreenRect bounds, float scale ) implements SpecialGuiElementRenderState
```

## meteordevelopment.meteorclient.utils.render.CustomBannerGuiElementRenderState.CustomBannerGuiElementRenderState

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/CustomBannerGuiElementRenderState.java:27`

```java
public CustomBannerGuiElementRenderState( BannerFlagBlockModel bannerFlagBlockModel, DyeColor color, BannerPatternsComponent bannerPatterns, int x1, int y1, int x2, int y2, @Nullable ScreenRect scissorArea, float scale )
```

## meteordevelopment.meteorclient.utils.render.CustomBannerGuiElementRenderer

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/CustomBannerGuiElementRenderer.java:21`

```java
public class CustomBannerGuiElementRenderer extends SpecialGuiElementRenderer<CustomBannerGuiElementRenderState>
```

## meteordevelopment.meteorclient.utils.render.CustomBannerGuiElementRenderer.CustomBannerGuiElementRenderer

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/CustomBannerGuiElementRenderer.java:24`

```java
public CustomBannerGuiElementRenderer(VertexConsumerProvider.Immediate immediate, SpriteHolder sprite)
```

## meteordevelopment.meteorclient.utils.render.CustomBannerGuiElementRenderer.getElementClass

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/CustomBannerGuiElementRenderer.java:29`

```java
@Override public Class<CustomBannerGuiElementRenderState> getElementClass()
```

## meteordevelopment.meteorclient.utils.render.CustomBannerGuiElementRenderer.render

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/CustomBannerGuiElementRenderer.java:34`

```java
protected void render(CustomBannerGuiElementRenderState state, MatrixStack matrixStack)
```

## meteordevelopment.meteorclient.utils.render.CustomBannerGuiElementRenderer.getName

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/CustomBannerGuiElementRenderer.java:58`

```java
@Override protected String getName()
```

## meteordevelopment.meteorclient.utils.render.CustomOutlineVertexConsumerProvider

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/CustomOutlineVertexConsumerProvider.java:13`

```java
public class CustomOutlineVertexConsumerProvider implements VertexConsumerProvider
```

## meteordevelopment.meteorclient.utils.render.CustomOutlineVertexConsumerProvider.getBuffer

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/CustomOutlineVertexConsumerProvider.java:16`

```java
@Override public VertexConsumer getBuffer(RenderLayer layer)
```

## meteordevelopment.meteorclient.utils.render.CustomOutlineVertexConsumerProvider.draw

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/CustomOutlineVertexConsumerProvider.java:30`

```java
public void draw()
```

## meteordevelopment.meteorclient.utils.render.FontUtils

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/FontUtils.java:28`

```java
@NullMarked public final class FontUtils
```

## meteordevelopment.meteorclient.utils.render.FontUtils.getSysFontInfo

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/FontUtils.java:32`

```java
public static @Nullable FontInfo getSysFontInfo(File file)
```

## meteordevelopment.meteorclient.utils.render.FontUtils.getBuiltinFontInfo

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/FontUtils.java:36`

```java
public static @Nullable FontInfo getBuiltinFontInfo(String builtin)
```

## meteordevelopment.meteorclient.utils.render.FontUtils.getFontInfo

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/FontUtils.java:57`

```java
public static @Nullable FontInfo getFontInfo(@Nullable InputStream stream)
```

## meteordevelopment.meteorclient.utils.render.FontUtils.getSearchPaths

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/FontUtils.java:98`

```java
public static Set<String> getSearchPaths()
```

## meteordevelopment.meteorclient.utils.render.FontUtils.getUFontDirs

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/FontUtils.java:113`

```java
public static List<File> getUFontDirs()
```

## meteordevelopment.meteorclient.utils.render.FontUtils.getSFontDirs

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/FontUtils.java:121`

```java
public static List<File> getSFontDirs()
```

## meteordevelopment.meteorclient.utils.render.FontUtils.loadBuiltin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/FontUtils.java:129`

```java
public static void loadBuiltin(List<FontFamily> fontList, String builtin)
```

## meteordevelopment.meteorclient.utils.render.FontUtils.loadSystem

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/FontUtils.java:139`

```java
public static void loadSystem(List<FontFamily> fontList, File dir)
```

## meteordevelopment.meteorclient.utils.render.FontUtils.builtinFontStream

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/FontUtils.java:186`

```java
public static @Nullable InputStream builtinFontStream(String name)
```

## meteordevelopment.meteorclient.utils.render.IVertexConsumerProvider

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/IVertexConsumerProvider.java:10`

```java
public interface IVertexConsumerProvider extends VertexConsumerProvider
```

## meteordevelopment.meteorclient.utils.render.IVertexConsumerProvider.setOffset

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/IVertexConsumerProvider.java:11`

```java
void setOffset(int offsetX, int offsetY, int offsetZ)
```

## meteordevelopment.meteorclient.utils.render.MeshBuilderVertexConsumerProvider

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/MeshBuilderVertexConsumerProvider.java:13`

```java
public class MeshBuilderVertexConsumerProvider implements IVertexConsumerProvider
```

## meteordevelopment.meteorclient.utils.render.MeshBuilderVertexConsumerProvider.MeshBuilderVertexConsumerProvider

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/MeshBuilderVertexConsumerProvider.java:16`

```java
public MeshBuilderVertexConsumerProvider(MeshBuilder mesh)
```

## meteordevelopment.meteorclient.utils.render.MeshBuilderVertexConsumerProvider.getBuffer

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/MeshBuilderVertexConsumerProvider.java:20`

```java
@Override public VertexConsumer getBuffer(RenderLayer layer)
```

## meteordevelopment.meteorclient.utils.render.MeshBuilderVertexConsumerProvider.setColor

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/MeshBuilderVertexConsumerProvider.java:60`

```java
public void setColor(Color color)
```

## meteordevelopment.meteorclient.utils.render.MeshBuilderVertexConsumerProvider.setOffset

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/MeshBuilderVertexConsumerProvider.java:64`

```java
@Override public void setOffset(int offsetX, int offsetY, int offsetZ)
```

## meteordevelopment.meteorclient.utils.render.MeshBuilderVertexConsumerProvider.MeshBuilderVertexConsumer

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/MeshBuilderVertexConsumerProvider.java:69`

```java
public static class MeshBuilderVertexConsumer implements VertexConsumer
```

## meteordevelopment.meteorclient.utils.render.MeshBuilderVertexConsumerProvider.MeshBuilderVertexConsumer.MeshBuilderVertexConsumer

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/MeshBuilderVertexConsumerProvider.java:81`

```java
public MeshBuilderVertexConsumer(MeshBuilder mesh)
```

## meteordevelopment.meteorclient.utils.render.MeshBuilderVertexConsumerProvider.MeshBuilderVertexConsumer.setOffset

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/MeshBuilderVertexConsumerProvider.java:85`

```java
public void setOffset(int offsetX, int offsetY, int offsetZ)
```

## meteordevelopment.meteorclient.utils.render.MeshBuilderVertexConsumerProvider.MeshBuilderVertexConsumer.vertex

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/MeshBuilderVertexConsumerProvider.java:91`

```java
@Override public VertexConsumer vertex(float x, float y, float z)
```

## meteordevelopment.meteorclient.utils.render.MeshBuilderVertexConsumerProvider.MeshBuilderVertexConsumer.color

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/MeshBuilderVertexConsumerProvider.java:113`

```java
@Override public VertexConsumer color(int red, int green, int blue, int alpha)
```

## meteordevelopment.meteorclient.utils.render.MeshBuilderVertexConsumerProvider.MeshBuilderVertexConsumer.color

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/MeshBuilderVertexConsumerProvider.java:118`

```java
@Override public VertexConsumer color(int argb)
```

## meteordevelopment.meteorclient.utils.render.MeshBuilderVertexConsumerProvider.MeshBuilderVertexConsumer.texture

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/MeshBuilderVertexConsumerProvider.java:123`

```java
@Override public VertexConsumer texture(float u, float v)
```

## meteordevelopment.meteorclient.utils.render.MeshBuilderVertexConsumerProvider.MeshBuilderVertexConsumer.overlay

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/MeshBuilderVertexConsumerProvider.java:128`

```java
@Override public VertexConsumer overlay(int u, int v)
```

## meteordevelopment.meteorclient.utils.render.MeshBuilderVertexConsumerProvider.MeshBuilderVertexConsumer.light

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/MeshBuilderVertexConsumerProvider.java:133`

```java
@Override public VertexConsumer light(int u, int v)
```

## meteordevelopment.meteorclient.utils.render.MeshBuilderVertexConsumerProvider.MeshBuilderVertexConsumer.normal

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/MeshBuilderVertexConsumerProvider.java:138`

```java
@Override public VertexConsumer normal(float x, float y, float z)
```

## meteordevelopment.meteorclient.utils.render.MeshBuilderVertexConsumerProvider.MeshBuilderVertexConsumer.lineWidth

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/MeshBuilderVertexConsumerProvider.java:143`

```java
@Override public VertexConsumer lineWidth(float width)
```

## meteordevelopment.meteorclient.utils.render.MeshBuilderVertexConsumerProvider.MeshBuilderVertexConsumer.fixedColor

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/MeshBuilderVertexConsumerProvider.java:148`

```java
public void fixedColor(int red, int green, int blue, int alpha)
```

## meteordevelopment.meteorclient.utils.render.MeteorToast

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/MeteorToast.java:28`

```java
public class MeteorToast implements Toast
```

## meteordevelopment.meteorclient.utils.render.MeteorToast.Builder

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/MeteorToast.java:55`

```java
public static class Builder
```

## meteordevelopment.meteorclient.utils.render.MeteorToast.Builder.Builder

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/MeteorToast.java:62`

```java
public Builder(@NotNull String title)
```

## meteordevelopment.meteorclient.utils.render.MeteorToast.Builder.text

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/MeteorToast.java:66`

```java
public Builder text(@Nullable String text)
```

## meteordevelopment.meteorclient.utils.render.MeteorToast.Builder.icon

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/MeteorToast.java:73`

```java
public Builder icon(@Nullable Item item)
```

## meteordevelopment.meteorclient.utils.render.MeteorToast.Builder.sound

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/MeteorToast.java:78`

```java
public Builder sound(@Nullable SoundInstance sound)
```

## meteordevelopment.meteorclient.utils.render.MeteorToast.Builder.duration

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/MeteorToast.java:83`

```java
public Builder duration(long duration)
```

## meteordevelopment.meteorclient.utils.render.MeteorToast.Builder.build

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/MeteorToast.java:88`

```java
public MeteorToast build()
```

## meteordevelopment.meteorclient.utils.render.MeteorToast.getVisibility

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/MeteorToast.java:93`

```java
@Override public Visibility getVisibility()
```

## meteordevelopment.meteorclient.utils.render.MeteorToast.update

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/MeteorToast.java:98`

```java
@Override public void update(ToastManager manager, long time)
```

## meteordevelopment.meteorclient.utils.render.MeteorToast.draw

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/MeteorToast.java:110`

```java
@Override public void draw(DrawContext context, TextRenderer textRenderer, long startTime)
```

## meteordevelopment.meteorclient.utils.render.NametagUtils

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/NametagUtils.java:18`

```java
public class NametagUtils
```

## meteordevelopment.meteorclient.utils.render.NametagUtils.scale

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/NametagUtils.java:28`

```java
public static double scale
```

## meteordevelopment.meteorclient.utils.render.NametagUtils.onRender

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/NametagUtils.java:33`

```java
public static void onRender(Matrix4f modelView)
```

## meteordevelopment.meteorclient.utils.render.NametagUtils.to2D

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/NametagUtils.java:44`

```java
public static boolean to2D(Vector3d pos, double scale)
```

## meteordevelopment.meteorclient.utils.render.NametagUtils.to2D

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/NametagUtils.java:48`

```java
public static boolean to2D(Vector3d pos, double scale, boolean distanceScaling)
```

## meteordevelopment.meteorclient.utils.render.NametagUtils.to2D

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/NametagUtils.java:52`

```java
public static boolean to2D(Vector3d pos, double scale, boolean distanceScaling, boolean allowBehind)
```

## meteordevelopment.meteorclient.utils.render.NametagUtils.begin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/NametagUtils.java:83`

```java
public static void begin(Vector3d pos)
```

## meteordevelopment.meteorclient.utils.render.NametagUtils.begin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/NametagUtils.java:88`

```java
public static void begin(Vector3d pos, DrawContext drawContext)
```

## meteordevelopment.meteorclient.utils.render.NametagUtils.end

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/NametagUtils.java:104`

```java
public static void end()
```

## meteordevelopment.meteorclient.utils.render.NametagUtils.end

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/NametagUtils.java:108`

```java
public static void end(DrawContext drawContext)
```

## meteordevelopment.meteorclient.utils.render.NoopImmediateVertexConsumerProvider

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/NoopImmediateVertexConsumerProvider.java:12`

```java
public class NoopImmediateVertexConsumerProvider extends VertexConsumerProvider.Immediate
```

## meteordevelopment.meteorclient.utils.render.NoopImmediateVertexConsumerProvider.INSTANCE

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/NoopImmediateVertexConsumerProvider.java:13`

```java
public static final NoopImmediateVertexConsumerProvider INSTANCE = new NoopImmediateVertexConsumerProvider()
```

## meteordevelopment.meteorclient.utils.render.NoopImmediateVertexConsumerProvider.getBuffer

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/NoopImmediateVertexConsumerProvider.java:19`

```java
@Override public VertexConsumer getBuffer(RenderLayer layer)
```

## meteordevelopment.meteorclient.utils.render.NoopImmediateVertexConsumerProvider.draw

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/NoopImmediateVertexConsumerProvider.java:24`

```java
@Override public void draw()
```

## meteordevelopment.meteorclient.utils.render.NoopImmediateVertexConsumerProvider.draw

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/NoopImmediateVertexConsumerProvider.java:28`

```java
@Override public void draw(RenderLayer layer)
```

## meteordevelopment.meteorclient.utils.render.NoopOutlineVertexConsumerProvider

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/NoopOutlineVertexConsumerProvider.java:12`

```java
public class NoopOutlineVertexConsumerProvider extends OutlineVertexConsumerProvider
```

## meteordevelopment.meteorclient.utils.render.NoopOutlineVertexConsumerProvider.INSTANCE

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/NoopOutlineVertexConsumerProvider.java:13`

```java
public static final NoopOutlineVertexConsumerProvider INSTANCE = new NoopOutlineVertexConsumerProvider()
```

## meteordevelopment.meteorclient.utils.render.NoopOutlineVertexConsumerProvider.getBuffer

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/NoopOutlineVertexConsumerProvider.java:18`

```java
@Override public VertexConsumer getBuffer(RenderLayer layer)
```

## meteordevelopment.meteorclient.utils.render.NoopOutlineVertexConsumerProvider.draw

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/NoopOutlineVertexConsumerProvider.java:23`

```java
@Override public void draw()
```

## meteordevelopment.meteorclient.utils.render.NoopVertexConsumer

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/NoopVertexConsumer.java:10`

```java
public class NoopVertexConsumer implements VertexConsumer
```

## meteordevelopment.meteorclient.utils.render.NoopVertexConsumer.INSTANCE

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/NoopVertexConsumer.java:11`

```java
public static final NoopVertexConsumer INSTANCE = new NoopVertexConsumer()
```

## meteordevelopment.meteorclient.utils.render.NoopVertexConsumer.vertex

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/NoopVertexConsumer.java:16`

```java
@Override public VertexConsumer vertex(float x, float y, float z)
```

## meteordevelopment.meteorclient.utils.render.NoopVertexConsumer.color

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/NoopVertexConsumer.java:21`

```java
@Override public VertexConsumer color(int red, int green, int blue, int alpha)
```

## meteordevelopment.meteorclient.utils.render.NoopVertexConsumer.color

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/NoopVertexConsumer.java:26`

```java
@Override public VertexConsumer color(int argb)
```

## meteordevelopment.meteorclient.utils.render.NoopVertexConsumer.texture

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/NoopVertexConsumer.java:31`

```java
@Override public VertexConsumer texture(float u, float v)
```

## meteordevelopment.meteorclient.utils.render.NoopVertexConsumer.overlay

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/NoopVertexConsumer.java:36`

```java
@Override public VertexConsumer overlay(int u, int v)
```

## meteordevelopment.meteorclient.utils.render.NoopVertexConsumer.light

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/NoopVertexConsumer.java:41`

```java
@Override public VertexConsumer light(int u, int v)
```

## meteordevelopment.meteorclient.utils.render.NoopVertexConsumer.normal

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/NoopVertexConsumer.java:46`

```java
@Override public VertexConsumer normal(float x, float y, float z)
```

## meteordevelopment.meteorclient.utils.render.NoopVertexConsumer.lineWidth

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/NoopVertexConsumer.java:51`

```java
@Override public VertexConsumer lineWidth(float width)
```

## meteordevelopment.meteorclient.utils.render.PeekScreen

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/PeekScreen.java:26`

```java
public class PeekScreen extends ShulkerBoxScreen
```

## meteordevelopment.meteorclient.utils.render.PeekScreen.PeekScreen

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/PeekScreen.java:30`

```java
public PeekScreen(ItemStack storageBlock, ItemStack[] contents)
```

## meteordevelopment.meteorclient.utils.render.PeekScreen.mouseClicked

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/PeekScreen.java:35`

```java
@Override public boolean mouseClicked(Click click, boolean doubled)
```

## meteordevelopment.meteorclient.utils.render.PeekScreen.mouseReleased

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/PeekScreen.java:47`

```java
@Override public boolean mouseReleased(Click click)
```

## meteordevelopment.meteorclient.utils.render.PeekScreen.keyPressed

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/PeekScreen.java:52`

```java
@Override public boolean keyPressed(KeyInput input)
```

## meteordevelopment.meteorclient.utils.render.PeekScreen.drawBackground

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/PeekScreen.java:71`

```java
@Override protected void drawBackground(DrawContext context, float delta, int mouseX, int mouseY)
```

## meteordevelopment.meteorclient.utils.render.PlayerHeadTexture

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/PlayerHeadTexture.java:23`

```java
public class PlayerHeadTexture extends Texture
```

## meteordevelopment.meteorclient.utils.render.PlayerHeadTexture.PlayerHeadTexture

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/PlayerHeadTexture.java:26`

```java
public PlayerHeadTexture(byte[] head, boolean needsRotate)
```

## meteordevelopment.meteorclient.utils.render.PlayerHeadTexture.PlayerHeadTexture

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/PlayerHeadTexture.java:33`

```java
public PlayerHeadTexture()
```

## meteordevelopment.meteorclient.utils.render.PlayerHeadTexture.needsRotate

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/PlayerHeadTexture.java:56`

```java
public boolean needsRotate()
```

## meteordevelopment.meteorclient.utils.render.PlayerHeadTexture.downloadHead

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/PlayerHeadTexture.java:60`

```java
public static byte[] downloadHead(String url) throws IOException
```

## meteordevelopment.meteorclient.utils.render.PlayerHeadUtils

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/PlayerHeadUtils.java:13`

```java
public class PlayerHeadUtils
```

## meteordevelopment.meteorclient.utils.render.PlayerHeadUtils.STEVE_HEAD

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/PlayerHeadUtils.java:14`

```java
public static PlayerHeadTexture STEVE_HEAD
```

## meteordevelopment.meteorclient.utils.render.PlayerHeadUtils.init

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/PlayerHeadUtils.java:19`

```java
@PostInit public static void init()
```

## meteordevelopment.meteorclient.utils.render.PlayerHeadUtils.fetchHead

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/PlayerHeadUtils.java:24`

```java
public static byte[] fetchHead(UUID id)
```

## meteordevelopment.meteorclient.utils.render.PlayerHeadUtils.getSkinUrl

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/PlayerHeadUtils.java:38`

```java
public static String getSkinUrl(UUID id)
```

## meteordevelopment.meteorclient.utils.render.RenderUtils

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/RenderUtils.java:30`

```java
public class RenderUtils
```

## meteordevelopment.meteorclient.utils.render.RenderUtils.center

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/RenderUtils.java:31`

```java
public static Vec3d center
```

## meteordevelopment.meteorclient.utils.render.RenderUtils.projection

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/RenderUtils.java:32`

```java
public static final Matrix4f projection = new Matrix4f()
```

## meteordevelopment.meteorclient.utils.render.RenderUtils.init

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/RenderUtils.java:40`

```java
@PostInit public static void init()
```

## meteordevelopment.meteorclient.utils.render.RenderUtils.isShaderPackInUse

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/RenderUtils.java:45`

```java
public static boolean isShaderPackInUse()
```

## meteordevelopment.meteorclient.utils.render.RenderUtils.drawItem

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/RenderUtils.java:50`

```java
public static void drawItem(DrawContext drawContext, ItemStack itemStack, int x, int y, float scale, boolean overlay, String countOverride, boolean disableGuiScale)
```

## meteordevelopment.meteorclient.utils.render.RenderUtils.drawItem

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/RenderUtils.java:69`

```java
public static void drawItem(DrawContext drawContext, ItemStack itemStack, int x, int y, float scale, boolean overlay)
```

## meteordevelopment.meteorclient.utils.render.RenderUtils.updateScreenCenter

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/RenderUtils.java:73`

```java
public static void updateScreenCenter(Matrix4f projection, Matrix4f view)
```

## meteordevelopment.meteorclient.utils.render.RenderUtils.renderTickingBlock

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/RenderUtils.java:86`

```java
public static void renderTickingBlock(BlockPos blockPos, Color sideColor, Color lineColor, ShapeMode shapeMode, int excludeDir, int duration, boolean fade, boolean shrink)
```

## meteordevelopment.meteorclient.utils.render.RenderUtils.RenderBlock

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/RenderUtils.java:121`

```java
public static class RenderBlock
```

## meteordevelopment.meteorclient.utils.render.RenderUtils.RenderBlock.pos

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/RenderUtils.java:122`

```java
public BlockPos.Mutable pos = new BlockPos.Mutable()
```

## meteordevelopment.meteorclient.utils.render.RenderUtils.RenderBlock.sideColor

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/RenderUtils.java:124`

```java
public Color sideColor, lineColor
```

## meteordevelopment.meteorclient.utils.render.RenderUtils.RenderBlock.lineColor

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/RenderUtils.java:124`

```java
public Color sideColor, lineColor
```

## meteordevelopment.meteorclient.utils.render.RenderUtils.RenderBlock.shapeMode

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/RenderUtils.java:125`

```java
public ShapeMode shapeMode
```

## meteordevelopment.meteorclient.utils.render.RenderUtils.RenderBlock.excludeDir

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/RenderUtils.java:126`

```java
public int excludeDir
```

## meteordevelopment.meteorclient.utils.render.RenderUtils.RenderBlock.ticks

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/RenderUtils.java:128`

```java
public int ticks, duration
```

## meteordevelopment.meteorclient.utils.render.RenderUtils.RenderBlock.duration

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/RenderUtils.java:128`

```java
public int ticks, duration
```

## meteordevelopment.meteorclient.utils.render.RenderUtils.RenderBlock.fade

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/RenderUtils.java:129`

```java
public boolean fade, shrink
```

## meteordevelopment.meteorclient.utils.render.RenderUtils.RenderBlock.shrink

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/RenderUtils.java:129`

```java
public boolean fade, shrink
```

## meteordevelopment.meteorclient.utils.render.RenderUtils.RenderBlock.set

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/RenderUtils.java:131`

```java
public RenderBlock set(BlockPos blockPos, Color sideColor, Color lineColor, ShapeMode shapeMode, int excludeDir, int duration, boolean fade, boolean shrink)
```

## meteordevelopment.meteorclient.utils.render.RenderUtils.RenderBlock.tick

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/RenderUtils.java:145`

```java
public void tick()
```

## meteordevelopment.meteorclient.utils.render.RenderUtils.RenderBlock.render

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/RenderUtils.java:149`

```java
public void render(Render3DEvent event)
```

## meteordevelopment.meteorclient.utils.render.SimpleBlockRenderer

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/SimpleBlockRenderer.java:33`

```java
public abstract class SimpleBlockRenderer
```

## meteordevelopment.meteorclient.utils.render.SimpleBlockRenderer.renderWithBlockEntity

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/SimpleBlockRenderer.java:55`

```java
public static void renderWithBlockEntity(BlockEntity blockEntity, float tickDelta, IVertexConsumerProvider vertexConsumerProvider)
```

## meteordevelopment.meteorclient.utils.render.SimpleBlockRenderer.render

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/SimpleBlockRenderer.java:77`

```java
public static void render(BlockPos pos, BlockState state, VertexConsumerProvider consumerProvider)
```

## meteordevelopment.meteorclient.utils.render.WireframeEntityRenderer

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/WireframeEntityRenderer.java:29`

```java
public class WireframeEntityRenderer
```

## meteordevelopment.meteorclient.utils.render.WireframeEntityRenderer.render

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/WireframeEntityRenderer.java:57`

```java
@SuppressWarnings("unchecked") public static void render(Render3DEvent event, Entity entity, double scale, Color sideColor, Color lineColor, ShapeMode shapeMode)
```

## meteordevelopment.meteorclient.utils.render.WrapperImmediateVertexConsumerProvider

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/WrapperImmediateVertexConsumerProvider.java:14`

```java
public class WrapperImmediateVertexConsumerProvider extends VertexConsumerProvider.Immediate
```

## meteordevelopment.meteorclient.utils.render.WrapperImmediateVertexConsumerProvider.WrapperImmediateVertexConsumerProvider

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/WrapperImmediateVertexConsumerProvider.java:17`

```java
public WrapperImmediateVertexConsumerProvider(Supplier<VertexConsumerProvider> supplier)
```

## meteordevelopment.meteorclient.utils.render.WrapperImmediateVertexConsumerProvider.getBuffer

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/WrapperImmediateVertexConsumerProvider.java:22`

```java
@Override public VertexConsumer getBuffer(RenderLayer layer)
```

## meteordevelopment.meteorclient.utils.render.WrapperImmediateVertexConsumerProvider.draw

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/WrapperImmediateVertexConsumerProvider.java:27`

```java
@Override public void draw()
```

## meteordevelopment.meteorclient.utils.render.WrapperImmediateVertexConsumerProvider.draw

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/WrapperImmediateVertexConsumerProvider.java:31`

```java
@Override public void draw(RenderLayer layer)
```

## meteordevelopment.meteorclient.utils.render.color.Color

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/color/Color.java:18`

```java
@SuppressWarnings("unused") public class Color implements ICopyable<Color>, ISerializable<Color>
```

## meteordevelopment.meteorclient.utils.render.color.Color.CLEAR

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/color/Color.java:20`

```java
public static final Color CLEAR = new Color(0, 0, 0, 0)
```

## meteordevelopment.meteorclient.utils.render.color.Color.WHITE

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/color/Color.java:21`

```java
public static final Color WHITE = new Color(java.awt.Color.WHITE)
```

## meteordevelopment.meteorclient.utils.render.color.Color.LIGHT_GRAY

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/color/Color.java:22`

```java
public static final Color LIGHT_GRAY = new Color(java.awt.Color.LIGHT_GRAY)
```

## meteordevelopment.meteorclient.utils.render.color.Color.GRAY

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/color/Color.java:23`

```java
public static final Color GRAY = new Color(java.awt.Color.GRAY)
```

## meteordevelopment.meteorclient.utils.render.color.Color.DARK_GRAY

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/color/Color.java:24`

```java
public static final Color DARK_GRAY = new Color(java.awt.Color.DARK_GRAY)
```

## meteordevelopment.meteorclient.utils.render.color.Color.BLACK

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/color/Color.java:25`

```java
public static final Color BLACK = new Color(java.awt.Color.BLACK)
```

## meteordevelopment.meteorclient.utils.render.color.Color.RED

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/color/Color.java:26`

```java
public static final Color RED = new Color(java.awt.Color.RED)
```

## meteordevelopment.meteorclient.utils.render.color.Color.PINK

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/color/Color.java:27`

```java
public static final Color PINK = new Color(java.awt.Color.PINK)
```

## meteordevelopment.meteorclient.utils.render.color.Color.ORANGE

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/color/Color.java:28`

```java
public static final Color ORANGE = new Color(java.awt.Color.ORANGE)
```

## meteordevelopment.meteorclient.utils.render.color.Color.YELLOW

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/color/Color.java:29`

```java
public static final Color YELLOW = new Color(java.awt.Color.YELLOW)
```

## meteordevelopment.meteorclient.utils.render.color.Color.GREEN

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/color/Color.java:30`

```java
public static final Color GREEN = new Color(java.awt.Color.GREEN)
```

## meteordevelopment.meteorclient.utils.render.color.Color.MAGENTA

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/color/Color.java:31`

```java
public static final Color MAGENTA = new Color(java.awt.Color.MAGENTA)
```

## meteordevelopment.meteorclient.utils.render.color.Color.CYAN

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/color/Color.java:32`

```java
public static final Color CYAN = new Color(java.awt.Color.CYAN)
```

## meteordevelopment.meteorclient.utils.render.color.Color.BLUE

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/color/Color.java:33`

```java
public static final Color BLUE = new Color(java.awt.Color.BLUE)
```

## meteordevelopment.meteorclient.utils.render.color.Color.r

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/color/Color.java:35`

```java
public int r, g, b, a
```

## meteordevelopment.meteorclient.utils.render.color.Color.g

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/color/Color.java:35`

```java
public int r, g, b, a
```

## meteordevelopment.meteorclient.utils.render.color.Color.b

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/color/Color.java:35`

```java
public int r, g, b, a
```

## meteordevelopment.meteorclient.utils.render.color.Color.a

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/color/Color.java:35`

```java
public int r, g, b, a
```

## meteordevelopment.meteorclient.utils.render.color.Color.Color

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/color/Color.java:37`

```java
public Color()
```

## meteordevelopment.meteorclient.utils.render.color.Color.Color

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/color/Color.java:41`

```java
public Color(int r, int g, int b)
```

## meteordevelopment.meteorclient.utils.render.color.Color.Color

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/color/Color.java:50`

```java
public Color(int r, int g, int b, int a)
```

## meteordevelopment.meteorclient.utils.render.color.Color.Color

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/color/Color.java:59`

```java
public Color(float r, float g, float b, float a)
```

## meteordevelopment.meteorclient.utils.render.color.Color.Color

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/color/Color.java:68`

```java
public Color(int packed)
```

## meteordevelopment.meteorclient.utils.render.color.Color.Color

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/color/Color.java:75`

```java
public Color(Color color)
```

## meteordevelopment.meteorclient.utils.render.color.Color.Color

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/color/Color.java:82`

```java
public Color(java.awt.Color color)
```

## meteordevelopment.meteorclient.utils.render.color.Color.Color

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/color/Color.java:89`

```java
public Color(Formatting formatting)
```

## meteordevelopment.meteorclient.utils.render.color.Color.Color

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/color/Color.java:103`

```java
public Color(TextColor textColor)
```

## meteordevelopment.meteorclient.utils.render.color.Color.Color

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/color/Color.java:110`

```java
public Color(Style style)
```

## meteordevelopment.meteorclient.utils.render.color.Color.fromRGBA

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/color/Color.java:125`

```java
public static int fromRGBA(int r, int g, int b, int a)
```

## meteordevelopment.meteorclient.utils.render.color.Color.toRGBAR

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/color/Color.java:129`

```java
public static int toRGBAR(int color)
```

## meteordevelopment.meteorclient.utils.render.color.Color.toRGBAG

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/color/Color.java:133`

```java
public static int toRGBAG(int color)
```

## meteordevelopment.meteorclient.utils.render.color.Color.toRGBAB

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/color/Color.java:137`

```java
public static int toRGBAB(int color)
```

## meteordevelopment.meteorclient.utils.render.color.Color.toRGBAA

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/color/Color.java:141`

```java
public static int toRGBAA(int color)
```

## meteordevelopment.meteorclient.utils.render.color.Color.fromHsv

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/color/Color.java:145`

```java
public static Color fromHsv(double h, double s, double v)
```

## meteordevelopment.meteorclient.utils.render.color.Color.set

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/color/Color.java:202`

```java
public Color set(int r, int g, int b, int a)
```

## meteordevelopment.meteorclient.utils.render.color.Color.r

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/color/Color.java:213`

```java
public Color r(int r)
```

## meteordevelopment.meteorclient.utils.render.color.Color.g

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/color/Color.java:219`

```java
public Color g(int g)
```

## meteordevelopment.meteorclient.utils.render.color.Color.b

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/color/Color.java:225`

```java
public Color b(int b)
```

## meteordevelopment.meteorclient.utils.render.color.Color.a

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/color/Color.java:231`

```java
public Color a(int a)
```

## meteordevelopment.meteorclient.utils.render.color.Color.set

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/color/Color.java:237`

```java
@Override public Color set(Color value)
```

## meteordevelopment.meteorclient.utils.render.color.Color.parse

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/color/Color.java:249`

```java
public boolean parse(String text)
```

## meteordevelopment.meteorclient.utils.render.color.Color.copy

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/color/Color.java:271`

```java
@Override public Color copy()
```

## meteordevelopment.meteorclient.utils.render.color.Color.toSetting

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/color/Color.java:276`

```java
public SettingColor toSetting()
```

## meteordevelopment.meteorclient.utils.render.color.Color.toTextColor

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/color/Color.java:280`

```java
public TextColor toTextColor()
```

## meteordevelopment.meteorclient.utils.render.color.Color.toStyle

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/color/Color.java:284`

```java
public Style toStyle()
```

## meteordevelopment.meteorclient.utils.render.color.Color.styleWith

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/color/Color.java:288`

```java
public Style styleWith(Style style)
```

## meteordevelopment.meteorclient.utils.render.color.Color.validate

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/color/Color.java:292`

```java
public void validate()
```

## meteordevelopment.meteorclient.utils.render.color.Color.getVec3d

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/color/Color.java:306`

```java
public Vec3d getVec3d()
```

## meteordevelopment.meteorclient.utils.render.color.Color.getVec3f

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/color/Color.java:310`

```java
public Vector3f getVec3f()
```

## meteordevelopment.meteorclient.utils.render.color.Color.getVec4f

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/color/Color.java:314`

```java
public Vector4f getVec4f()
```

## meteordevelopment.meteorclient.utils.render.color.Color.getPacked

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/color/Color.java:318`

```java
public int getPacked()
```

## meteordevelopment.meteorclient.utils.render.color.Color.toTag

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/color/Color.java:322`

```java
@Override public NbtCompound toTag()
```

## meteordevelopment.meteorclient.utils.render.color.Color.fromTag

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/color/Color.java:334`

```java
@Override public Color fromTag(NbtCompound tag)
```

## meteordevelopment.meteorclient.utils.render.color.Color.toString

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/color/Color.java:345`

```java
@Override public String toString()
```

## meteordevelopment.meteorclient.utils.render.color.Color.equals

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/color/Color.java:350`

```java
@Override public boolean equals(Object o)
```

## meteordevelopment.meteorclient.utils.render.color.Color.hashCode

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/color/Color.java:360`

```java
@Override public int hashCode()
```

## meteordevelopment.meteorclient.utils.render.color.RainbowColor

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/color/RainbowColor.java:8`

```java
public class RainbowColor extends Color
```

## meteordevelopment.meteorclient.utils.render.color.RainbowColor.RainbowColor

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/color/RainbowColor.java:12`

```java
public RainbowColor()
```

## meteordevelopment.meteorclient.utils.render.color.RainbowColor.getSpeed

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/color/RainbowColor.java:16`

```java
public double getSpeed()
```

## meteordevelopment.meteorclient.utils.render.color.RainbowColor.setSpeed

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/color/RainbowColor.java:20`

```java
public RainbowColor setSpeed(double speed)
```

## meteordevelopment.meteorclient.utils.render.color.RainbowColor.getNext

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/color/RainbowColor.java:25`

```java
public RainbowColor getNext()
```

## meteordevelopment.meteorclient.utils.render.color.RainbowColor.getNext

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/color/RainbowColor.java:29`

```java
public RainbowColor getNext(double delta)
```

## meteordevelopment.meteorclient.utils.render.color.RainbowColor.set

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/color/RainbowColor.java:41`

```java
public RainbowColor set(RainbowColor color)
```

## meteordevelopment.meteorclient.utils.render.color.RainbowColor.equals

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/color/RainbowColor.java:50`

```java
@Override public boolean equals(Object o)
```

## meteordevelopment.meteorclient.utils.render.color.RainbowColor.hashCode

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/color/RainbowColor.java:59`

```java
@Override public int hashCode()
```

## meteordevelopment.meteorclient.utils.render.color.RainbowColors

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/color/RainbowColors.java:26`

```java
public class RainbowColors
```

## meteordevelopment.meteorclient.utils.render.color.RainbowColors.GLOBAL

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/color/RainbowColors.java:33`

```java
public static final RainbowColor GLOBAL = new RainbowColor()
```

## meteordevelopment.meteorclient.utils.render.color.RainbowColors.init

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/color/RainbowColors.java:38`

```java
@PostInit public static void init()
```

## meteordevelopment.meteorclient.utils.render.color.RainbowColors.addSetting

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/color/RainbowColors.java:43`

```java
public static void addSetting(Setting<SettingColor> setting)
```

## meteordevelopment.meteorclient.utils.render.color.RainbowColors.addSettingList

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/color/RainbowColors.java:47`

```java
public static void addSettingList(Setting<List<SettingColor>> setting)
```

## meteordevelopment.meteorclient.utils.render.color.RainbowColors.removeSetting

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/color/RainbowColors.java:51`

```java
public static void removeSetting(Setting<SettingColor> setting)
```

## meteordevelopment.meteorclient.utils.render.color.RainbowColors.removeSettingList

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/color/RainbowColors.java:55`

```java
public static void removeSettingList(Setting<List<SettingColor>> setting)
```

## meteordevelopment.meteorclient.utils.render.color.RainbowColors.add

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/color/RainbowColors.java:59`

```java
public static void add(SettingColor color)
```

## meteordevelopment.meteorclient.utils.render.color.RainbowColors.register

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/color/RainbowColors.java:63`

```java
public static void register(Runnable runnable)
```

## meteordevelopment.meteorclient.utils.render.color.SettingColor

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/color/SettingColor.java:13`

```java
public class SettingColor extends Color
```

## meteordevelopment.meteorclient.utils.render.color.SettingColor.rainbow

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/color/SettingColor.java:14`

```java
public boolean rainbow
```

## meteordevelopment.meteorclient.utils.render.color.SettingColor.SettingColor

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/color/SettingColor.java:16`

```java
public SettingColor()
```

## meteordevelopment.meteorclient.utils.render.color.SettingColor.SettingColor

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/color/SettingColor.java:20`

```java
public SettingColor(int packed)
```

## meteordevelopment.meteorclient.utils.render.color.SettingColor.SettingColor

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/color/SettingColor.java:24`

```java
public SettingColor(int r, int g, int b)
```

## meteordevelopment.meteorclient.utils.render.color.SettingColor.SettingColor

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/color/SettingColor.java:28`

```java
public SettingColor(int r, int g, int b, boolean rainbow)
```

## meteordevelopment.meteorclient.utils.render.color.SettingColor.SettingColor

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/color/SettingColor.java:32`

```java
public SettingColor(int r, int g, int b, int a)
```

## meteordevelopment.meteorclient.utils.render.color.SettingColor.SettingColor

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/color/SettingColor.java:36`

```java
public SettingColor(float r, float g, float b, float a)
```

## meteordevelopment.meteorclient.utils.render.color.SettingColor.SettingColor

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/color/SettingColor.java:40`

```java
public SettingColor(int r, int g, int b, int a, boolean rainbow)
```

## meteordevelopment.meteorclient.utils.render.color.SettingColor.SettingColor

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/color/SettingColor.java:45`

```java
public SettingColor(SettingColor color)
```

## meteordevelopment.meteorclient.utils.render.color.SettingColor.SettingColor

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/color/SettingColor.java:50`

```java
public SettingColor(java.awt.Color color)
```

## meteordevelopment.meteorclient.utils.render.color.SettingColor.SettingColor

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/color/SettingColor.java:54`

```java
public SettingColor(Formatting formatting)
```

## meteordevelopment.meteorclient.utils.render.color.SettingColor.SettingColor

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/color/SettingColor.java:58`

```java
public SettingColor(TextColor textColor)
```

## meteordevelopment.meteorclient.utils.render.color.SettingColor.SettingColor

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/color/SettingColor.java:62`

```java
public SettingColor(Style style)
```

## meteordevelopment.meteorclient.utils.render.color.SettingColor.rainbow

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/color/SettingColor.java:66`

```java
public SettingColor rainbow(boolean rainbow)
```

## meteordevelopment.meteorclient.utils.render.color.SettingColor.update

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/color/SettingColor.java:71`

```java
public void update()
```

## meteordevelopment.meteorclient.utils.render.color.SettingColor.set

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/color/SettingColor.java:75`

```java
@Override public SettingColor set(Color value)
```

## meteordevelopment.meteorclient.utils.render.color.SettingColor.copy

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/color/SettingColor.java:83`

```java
@Override public Color copy()
```

## meteordevelopment.meteorclient.utils.render.color.SettingColor.toTag

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/color/SettingColor.java:88`

```java
@Override public NbtCompound toTag()
```

## meteordevelopment.meteorclient.utils.render.color.SettingColor.fromTag

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/color/SettingColor.java:95`

```java
@Override public SettingColor fromTag(NbtCompound tag)
```

## meteordevelopment.meteorclient.utils.render.color.SettingColor.equals

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/color/SettingColor.java:102`

```java
@Override public boolean equals(Object o)
```

## meteordevelopment.meteorclient.utils.render.color.SettingColor.hashCode

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/color/SettingColor.java:111`

```java
@Override public int hashCode()
```

## meteordevelopment.meteorclient.utils.render.postprocess.ChamsShader

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/postprocess/ChamsShader.java:36`

```java
public class ChamsShader extends EntityShader
```

## meteordevelopment.meteorclient.utils.render.postprocess.ChamsShader.ChamsShader

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/postprocess/ChamsShader.java:42`

```java
public ChamsShader()
```

## meteordevelopment.meteorclient.utils.render.postprocess.ChamsShader.load

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/postprocess/ChamsShader.java:47`

```java
@PostInit public static void load()
```

## meteordevelopment.meteorclient.utils.render.postprocess.ChamsShader.setupPass

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/postprocess/ChamsShader.java:89`

```java
@Override protected void setupPass(MeshRenderer renderer)
```

## meteordevelopment.meteorclient.utils.render.postprocess.ChamsShader.shouldDraw

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/postprocess/ChamsShader.java:102`

```java
@Override protected boolean shouldDraw()
```

## meteordevelopment.meteorclient.utils.render.postprocess.ChamsShader.shouldDraw

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/postprocess/ChamsShader.java:108`

```java
@Override public boolean shouldDraw(Entity entity)
```

## meteordevelopment.meteorclient.utils.render.postprocess.ChamsShader.flipFrame

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/postprocess/ChamsShader.java:122`

```java
public static void flipFrame()
```

## meteordevelopment.meteorclient.utils.render.postprocess.EntityOutlineShader

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/postprocess/EntityOutlineShader.java:9`

```java
public class EntityOutlineShader extends EntityShader
```

## meteordevelopment.meteorclient.utils.render.postprocess.EntityOutlineShader.EntityOutlineShader

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/postprocess/EntityOutlineShader.java:12`

```java
public EntityOutlineShader()
```

## meteordevelopment.meteorclient.utils.render.postprocess.EntityOutlineShader.shouldDraw

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/postprocess/EntityOutlineShader.java:16`

```java
@Override protected boolean shouldDraw()
```

## meteordevelopment.meteorclient.utils.render.postprocess.EntityOutlineShader.shouldDraw

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/postprocess/EntityOutlineShader.java:22`

```java
@Override public boolean shouldDraw(Entity entity)
```

## meteordevelopment.meteorclient.utils.render.postprocess.EntityOutlineShader.setupPass

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/postprocess/EntityOutlineShader.java:28`

```java
@Override protected void setupPass(MeshRenderer renderer)
```

## meteordevelopment.meteorclient.utils.render.postprocess.EntityShader

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/postprocess/EntityShader.java:10`

```java
public abstract class EntityShader extends PostProcessShader
```

## meteordevelopment.meteorclient.utils.render.postprocess.EntityShader.vertexConsumerProvider

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/postprocess/EntityShader.java:11`

```java
public final CustomOutlineVertexConsumerProvider vertexConsumerProvider
```

## meteordevelopment.meteorclient.utils.render.postprocess.EntityShader.EntityShader

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/postprocess/EntityShader.java:13`

```java
protected EntityShader(RenderPipeline pipeline)
```

## meteordevelopment.meteorclient.utils.render.postprocess.EntityShader.shouldDraw

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/postprocess/EntityShader.java:18`

```java
public abstract boolean shouldDraw(Entity entity)
```

## meteordevelopment.meteorclient.utils.render.postprocess.EntityShader.preDraw

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/postprocess/EntityShader.java:20`

```java
@Override protected void preDraw()
```

## meteordevelopment.meteorclient.utils.render.postprocess.EntityShader.postDraw

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/postprocess/EntityShader.java:25`

```java
@Override protected void postDraw()
```

## meteordevelopment.meteorclient.utils.render.postprocess.EntityShader.submitVertices

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/postprocess/EntityShader.java:30`

```java
public void submitVertices()
```

## meteordevelopment.meteorclient.utils.render.postprocess.OutlineUniforms

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/postprocess/OutlineUniforms.java:15`

```java
public class OutlineUniforms
```

## meteordevelopment.meteorclient.utils.render.postprocess.OutlineUniforms.flipFrame

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/postprocess/OutlineUniforms.java:25`

```java
public static void flipFrame()
```

## meteordevelopment.meteorclient.utils.render.postprocess.OutlineUniforms.write

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/postprocess/OutlineUniforms.java:29`

```java
public static GpuBufferSlice write(int width, float fillOpacity, int shapeMode, float glowMultiplier)
```

## meteordevelopment.meteorclient.utils.render.postprocess.PostProcessShader

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/postprocess/PostProcessShader.java:19`

```java
public abstract class PostProcessShader
```

## meteordevelopment.meteorclient.utils.render.postprocess.PostProcessShader.pipeline

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/postprocess/PostProcessShader.java:20`

```java
protected final RenderPipeline pipeline
```

## meteordevelopment.meteorclient.utils.render.postprocess.PostProcessShader.framebuffer

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/postprocess/PostProcessShader.java:21`

```java
public final Framebuffer framebuffer
```

## meteordevelopment.meteorclient.utils.render.postprocess.PostProcessShader.PostProcessShader

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/postprocess/PostProcessShader.java:23`

```java
protected PostProcessShader(RenderPipeline pipeline)
```

## meteordevelopment.meteorclient.utils.render.postprocess.PostProcessShader.shouldDraw

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/postprocess/PostProcessShader.java:28`

```java
protected abstract boolean shouldDraw()
```

## meteordevelopment.meteorclient.utils.render.postprocess.PostProcessShader.preDraw

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/postprocess/PostProcessShader.java:30`

```java
protected void preDraw()
```

## meteordevelopment.meteorclient.utils.render.postprocess.PostProcessShader.postDraw

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/postprocess/PostProcessShader.java:31`

```java
protected void postDraw()
```

## meteordevelopment.meteorclient.utils.render.postprocess.PostProcessShader.setupPass

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/postprocess/PostProcessShader.java:33`

```java
protected abstract void setupPass(MeshRenderer renderer)
```

## meteordevelopment.meteorclient.utils.render.postprocess.PostProcessShader.clearTexture

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/postprocess/PostProcessShader.java:35`

```java
public void clearTexture()
```

## meteordevelopment.meteorclient.utils.render.postprocess.PostProcessShader.submitVertices

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/postprocess/PostProcessShader.java:41`

```java
public void submitVertices(Runnable draw)
```

## meteordevelopment.meteorclient.utils.render.postprocess.PostProcessShader.render

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/postprocess/PostProcessShader.java:49`

```java
public void render()
```

## meteordevelopment.meteorclient.utils.render.postprocess.PostProcessShader.onResized

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/postprocess/PostProcessShader.java:67`

```java
public void onResized(int width, int height)
```

## meteordevelopment.meteorclient.utils.render.postprocess.PostProcessShader.flipFrame

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/postprocess/PostProcessShader.java:81`

```java
public static void flipFrame()
```

## meteordevelopment.meteorclient.utils.render.postprocess.PostProcessShaders

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/postprocess/PostProcessShaders.java:10`

```java
public class PostProcessShaders
```

## meteordevelopment.meteorclient.utils.render.postprocess.PostProcessShaders.CHAMS

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/postprocess/PostProcessShaders.java:11`

```java
public static EntityShader CHAMS
```

## meteordevelopment.meteorclient.utils.render.postprocess.PostProcessShaders.ENTITY_OUTLINE

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/postprocess/PostProcessShaders.java:12`

```java
public static EntityShader ENTITY_OUTLINE
```

## meteordevelopment.meteorclient.utils.render.postprocess.PostProcessShaders.STORAGE_OUTLINE

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/postprocess/PostProcessShaders.java:13`

```java
public static PostProcessShader STORAGE_OUTLINE
```

## meteordevelopment.meteorclient.utils.render.postprocess.PostProcessShaders.init

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/postprocess/PostProcessShaders.java:17`

```java
@PreInit public static void init()
```

## meteordevelopment.meteorclient.utils.render.postprocess.PostProcessShaders.beginRender

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/postprocess/PostProcessShaders.java:26`

```java
public static void beginRender()
```

## meteordevelopment.meteorclient.utils.render.postprocess.PostProcessShaders.submitEntityVertices

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/postprocess/PostProcessShaders.java:32`

```java
public static void submitEntityVertices()
```

## meteordevelopment.meteorclient.utils.render.postprocess.PostProcessShaders.onResized

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/postprocess/PostProcessShaders.java:43`

```java
public static void onResized(int width, int height)
```

## meteordevelopment.meteorclient.utils.render.postprocess.StorageOutlineShader

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/postprocess/StorageOutlineShader.java:8`

```java
public class StorageOutlineShader extends PostProcessShader
```

## meteordevelopment.meteorclient.utils.render.postprocess.StorageOutlineShader.StorageOutlineShader

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/postprocess/StorageOutlineShader.java:11`

```java
public StorageOutlineShader()
```

## meteordevelopment.meteorclient.utils.render.postprocess.StorageOutlineShader.shouldDraw

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/postprocess/StorageOutlineShader.java:15`

```java
@Override protected boolean shouldDraw()
```

## meteordevelopment.meteorclient.utils.render.postprocess.StorageOutlineShader.setupPass

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/postprocess/StorageOutlineShader.java:21`

```java
@Override protected void setupPass(MeshRenderer renderer)
```

## meteordevelopment.meteorclient.utils.render.prompts.OkPrompt

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/prompts/OkPrompt.java:15`

```java
public class OkPrompt extends Prompt<OkPrompt>
```

## meteordevelopment.meteorclient.utils.render.prompts.OkPrompt.create

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/prompts/OkPrompt.java:22`

```java
public static OkPrompt create()
```

## meteordevelopment.meteorclient.utils.render.prompts.OkPrompt.create

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/prompts/OkPrompt.java:26`

```java
public static OkPrompt create(GuiTheme theme, Screen parent)
```

## meteordevelopment.meteorclient.utils.render.prompts.OkPrompt.onOk

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/prompts/OkPrompt.java:30`

```java
public OkPrompt onOk(Runnable action)
```

## meteordevelopment.meteorclient.utils.render.prompts.OkPrompt.initialiseWidgets

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/prompts/OkPrompt.java:35`

```java
@Override protected void initialiseWidgets(PromptScreen screen)
```

## meteordevelopment.meteorclient.utils.render.prompts.Prompt

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/prompts/Prompt.java:16`

```java
@SuppressWarnings("unchecked") // cant instantiate a Prompt directly so this is fine public abstract class Prompt<T>
```

## meteordevelopment.meteorclient.utils.render.prompts.Prompt.theme

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/prompts/Prompt.java:18`

```java
protected final GuiTheme theme
```

## meteordevelopment.meteorclient.utils.render.prompts.Prompt.parent

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/prompts/Prompt.java:19`

```java
protected final Screen parent
```

## meteordevelopment.meteorclient.utils.render.prompts.Prompt.title

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/prompts/Prompt.java:21`

```java
protected String title = ""
```

## meteordevelopment.meteorclient.utils.render.prompts.Prompt.messages

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/prompts/Prompt.java:22`

```java
protected final List<String> messages = new ArrayList<>()
```

## meteordevelopment.meteorclient.utils.render.prompts.Prompt.dontShowAgainCheckboxVisible

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/prompts/Prompt.java:23`

```java
protected boolean dontShowAgainCheckboxVisible = true
```

## meteordevelopment.meteorclient.utils.render.prompts.Prompt.id

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/prompts/Prompt.java:24`

```java
protected String id = null
```

## meteordevelopment.meteorclient.utils.render.prompts.Prompt.Prompt

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/prompts/Prompt.java:26`

```java
protected Prompt(GuiTheme theme, Screen parent)
```

## meteordevelopment.meteorclient.utils.render.prompts.Prompt.title

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/prompts/Prompt.java:31`

```java
public T title(String title)
```

## meteordevelopment.meteorclient.utils.render.prompts.Prompt.message

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/prompts/Prompt.java:36`

```java
public T message(String message)
```

## meteordevelopment.meteorclient.utils.render.prompts.Prompt.message

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/prompts/Prompt.java:41`

```java
public T message(String message, Object... args)
```

## meteordevelopment.meteorclient.utils.render.prompts.Prompt.dontShowAgainCheckboxVisible

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/prompts/Prompt.java:46`

```java
public T dontShowAgainCheckboxVisible(boolean visible)
```

## meteordevelopment.meteorclient.utils.render.prompts.Prompt.id

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/prompts/Prompt.java:51`

```java
public T id(String from)
```

## meteordevelopment.meteorclient.utils.render.prompts.Prompt.show

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/prompts/Prompt.java:56`

```java
public boolean show()
```

## meteordevelopment.meteorclient.utils.render.prompts.Prompt.dontShowAgain

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/prompts/Prompt.java:69`

```java
protected void dontShowAgain(PromptScreen screen)
```

## meteordevelopment.meteorclient.utils.render.prompts.Prompt.initialiseWidgets

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/prompts/Prompt.java:75`

```java
protected abstract void initialiseWidgets(PromptScreen screen)
```

## meteordevelopment.meteorclient.utils.render.prompts.Prompt.PromptScreen

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/prompts/Prompt.java:77`

```java
protected class PromptScreen extends WindowScreen
```

## meteordevelopment.meteorclient.utils.render.prompts.Prompt.PromptScreen.dontShowAgainCheckbox

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/prompts/Prompt.java:78`

```java
protected WCheckbox dontShowAgainCheckbox
```

## meteordevelopment.meteorclient.utils.render.prompts.Prompt.PromptScreen.list

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/prompts/Prompt.java:79`

```java
protected WHorizontalList list
```

## meteordevelopment.meteorclient.utils.render.prompts.Prompt.PromptScreen.PromptScreen

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/prompts/Prompt.java:81`

```java
public PromptScreen(GuiTheme theme)
```

## meteordevelopment.meteorclient.utils.render.prompts.Prompt.PromptScreen.initWidgets

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/prompts/Prompt.java:87`

```java
@Override public void initWidgets()
```

## meteordevelopment.meteorclient.utils.render.prompts.YesNoPrompt

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/prompts/YesNoPrompt.java:15`

```java
public class YesNoPrompt extends Prompt<YesNoPrompt>
```

## meteordevelopment.meteorclient.utils.render.prompts.YesNoPrompt.create

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/prompts/YesNoPrompt.java:23`

```java
public static YesNoPrompt create()
```

## meteordevelopment.meteorclient.utils.render.prompts.YesNoPrompt.create

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/prompts/YesNoPrompt.java:27`

```java
public static YesNoPrompt create(GuiTheme theme, Screen parent)
```

## meteordevelopment.meteorclient.utils.render.prompts.YesNoPrompt.onYes

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/prompts/YesNoPrompt.java:31`

```java
public YesNoPrompt onYes(Runnable action)
```

## meteordevelopment.meteorclient.utils.render.prompts.YesNoPrompt.onNo

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/prompts/YesNoPrompt.java:36`

```java
public YesNoPrompt onNo(Runnable action)
```

## meteordevelopment.meteorclient.utils.render.prompts.YesNoPrompt.initialiseWidgets

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/prompts/YesNoPrompt.java:41`

```java
@Override protected void initialiseWidgets(PromptScreen screen)
```
