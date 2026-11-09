# utils/render

Khai báo Java có cú pháp public/protected. Không bao gồm API kế thừa/tổng hợp bởi compiler; xem kiểm tra bytecode riêng.

## meteordevelopment.meteorclient.utils.render.AlignmentX

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/AlignmentX.java:8`

```java
public enum AlignmentX
```

## meteordevelopment.meteorclient.utils.render.AlignmentY

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/AlignmentY.java:8`

```java
public enum AlignmentY
```

## meteordevelopment.meteorclient.utils.render.Box

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/Box.java:10`

```java
public class Box
```

## meteordevelopment.meteorclient.utils.render.Box.x

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/Box.java:11`

```java
public double x, y
```

## meteordevelopment.meteorclient.utils.render.Box.y

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/Box.java:11`

```java
public double x, y
```

## meteordevelopment.meteorclient.utils.render.Box.width

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/Box.java:12`

```java
public double width, height
```

## meteordevelopment.meteorclient.utils.render.Box.height

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/Box.java:12`

```java
public double width, height
```

## meteordevelopment.meteorclient.utils.render.Box.Box

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/Box.java:14`

```java
public Box(double x, double y, double width, double height)
```

## meteordevelopment.meteorclient.utils.render.Box.Box

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/Box.java:21`

```java
public Box()
```

## meteordevelopment.meteorclient.utils.render.Box.equals

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/Box.java:25`

```java
@Override public boolean equals(Object o)
```

## meteordevelopment.meteorclient.utils.render.Box.hashCode

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/Box.java:36`

```java
@Override public int hashCode()
```

## meteordevelopment.meteorclient.utils.render.CustomBannerGuiElementRenderState

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/CustomBannerGuiElementRenderState.java:15`

```java
public record CustomBannerGuiElementRenderState( BannerFlagModel flag, DyeColor baseColor, BannerPatternLayers resultBannerPatterns, int x0, int y0, int x1, int y1, @Nullable ScreenRectangle scissorArea, @Nullable ScreenRectangle bounds, float scale ) implements PictureInPictureRenderState
```

## meteordevelopment.meteorclient.utils.render.CustomBannerGuiElementRenderState.CustomBannerGuiElementRenderState

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/CustomBannerGuiElementRenderState.java:27`

```java
public CustomBannerGuiElementRenderState( BannerFlagModel bannerFlagBlockModel, DyeColor color, BannerPatternLayers bannerPatterns, int x0, int y0, int x1, int y1, @Nullable ScreenRectangle scissorArea, float scale )
```

## meteordevelopment.meteorclient.utils.render.CustomBannerGuiElementRenderer

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/CustomBannerGuiElementRenderer.java:18`

```java
public class CustomBannerGuiElementRenderer extends PictureInPictureRenderer<CustomBannerGuiElementRenderState>
```

## meteordevelopment.meteorclient.utils.render.CustomBannerGuiElementRenderer.CustomBannerGuiElementRenderer

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/CustomBannerGuiElementRenderer.java:21`

```java
public CustomBannerGuiElementRenderer(SpriteGetter sprites)
```

## meteordevelopment.meteorclient.utils.render.CustomBannerGuiElementRenderer.getRenderStateClass

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/CustomBannerGuiElementRenderer.java:25`

```java
@Override public @NonNull Class<CustomBannerGuiElementRenderState> getRenderStateClass()
```

## meteordevelopment.meteorclient.utils.render.CustomBannerGuiElementRenderer.renderToTexture

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/CustomBannerGuiElementRenderer.java:30`

```java
protected void renderToTexture(CustomBannerGuiElementRenderState state, PoseStack poseStack, @NonNull SubmitNodeCollector submitNodeCollector)
```

## meteordevelopment.meteorclient.utils.render.CustomBannerGuiElementRenderer.getTextureLabel

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/CustomBannerGuiElementRenderer.java:47`

```java
@Override protected @NonNull String getTextureLabel()
```

## meteordevelopment.meteorclient.utils.render.DisplayItemUtils

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/DisplayItemUtils.java:21`

```java
public class DisplayItemUtils
```

## meteordevelopment.meteorclient.utils.render.DisplayItemUtils.toStack

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/DisplayItemUtils.java:24`

```java
public static ItemStack toStack(Item item)
```

## meteordevelopment.meteorclient.utils.render.DisplayItemUtils.toStack

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/DisplayItemUtils.java:29`

```java
public static ItemStack toStack(Block block)
```

## meteordevelopment.meteorclient.utils.render.DisplayItemUtils.toStack

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/DisplayItemUtils.java:33`

```java
public static ItemStack toStack(Item item, int count)
```

## meteordevelopment.meteorclient.utils.render.FontUtils

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/FontUtils.java:28`

```java
@NullMarked public final class FontUtils
```

## meteordevelopment.meteorclient.utils.render.FontUtils.getSysFontInfo

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/FontUtils.java:33`

```java
public static @Nullable FontInfo getSysFontInfo(File file)
```

## meteordevelopment.meteorclient.utils.render.FontUtils.getBuiltinFontInfo

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/FontUtils.java:37`

```java
public static @Nullable FontInfo getBuiltinFontInfo(String builtin)
```

## meteordevelopment.meteorclient.utils.render.FontUtils.getFontInfo

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/FontUtils.java:58`

```java
public static @Nullable FontInfo getFontInfo(@Nullable InputStream stream)
```

## meteordevelopment.meteorclient.utils.render.FontUtils.getSearchPaths

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/FontUtils.java:99`

```java
public static Set<String> getSearchPaths()
```

## meteordevelopment.meteorclient.utils.render.FontUtils.getUFontDirs

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/FontUtils.java:114`

```java
public static List<File> getUFontDirs()
```

## meteordevelopment.meteorclient.utils.render.FontUtils.getSFontDirs

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/FontUtils.java:124`

```java
public static List<File> getSFontDirs()
```

## meteordevelopment.meteorclient.utils.render.FontUtils.loadBuiltin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/FontUtils.java:132`

```java
public static void loadBuiltin(List<FontFamily> fontList, String builtin)
```

## meteordevelopment.meteorclient.utils.render.FontUtils.loadSystem

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/FontUtils.java:142`

```java
public static void loadSystem(List<FontFamily> fontList, File dir)
```

## meteordevelopment.meteorclient.utils.render.FontUtils.builtinFontStream

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/FontUtils.java:189`

```java
public static @Nullable InputStream builtinFontStream(String name)
```

## meteordevelopment.meteorclient.utils.render.IVertexConsumerProvider

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/IVertexConsumerProvider.java:11`

```java
public interface IVertexConsumerProvider
```

## meteordevelopment.meteorclient.utils.render.IVertexConsumerProvider.getBuffer

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/IVertexConsumerProvider.java:12`

```java
VertexConsumer getBuffer(RenderType layer)
```

## meteordevelopment.meteorclient.utils.render.IVertexConsumerProvider.setOffset

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/IVertexConsumerProvider.java:14`

```java
void setOffset(int offsetX, int offsetY, int offsetZ)
```

## meteordevelopment.meteorclient.utils.render.MeshBuilderVertexConsumerProvider

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/MeshBuilderVertexConsumerProvider.java:15`

```java
public class MeshBuilderVertexConsumerProvider implements IVertexConsumerProvider
```

## meteordevelopment.meteorclient.utils.render.MeshBuilderVertexConsumerProvider.MeshBuilderVertexConsumerProvider

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/MeshBuilderVertexConsumerProvider.java:18`

```java
public MeshBuilderVertexConsumerProvider(MeshBuilder mesh)
```

## meteordevelopment.meteorclient.utils.render.MeshBuilderVertexConsumerProvider.getBuffer

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/MeshBuilderVertexConsumerProvider.java:22`

```java
@Override public VertexConsumer getBuffer(RenderType layer)
```

## meteordevelopment.meteorclient.utils.render.MeshBuilderVertexConsumerProvider.setColor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/MeshBuilderVertexConsumerProvider.java:77`

```java
public void setColor(Color color)
```

## meteordevelopment.meteorclient.utils.render.MeshBuilderVertexConsumerProvider.setOffset

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/MeshBuilderVertexConsumerProvider.java:81`

```java
@Override public void setOffset(int offsetX, int offsetY, int offsetZ)
```

## meteordevelopment.meteorclient.utils.render.MeshBuilderVertexConsumerProvider.MeshBuilderVertexConsumer

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/MeshBuilderVertexConsumerProvider.java:86`

```java
public static class MeshBuilderVertexConsumer implements VertexConsumer
```

## meteordevelopment.meteorclient.utils.render.MeshBuilderVertexConsumerProvider.MeshBuilderVertexConsumer.MeshBuilderVertexConsumer

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/MeshBuilderVertexConsumerProvider.java:98`

```java
public MeshBuilderVertexConsumer(MeshBuilder mesh)
```

## meteordevelopment.meteorclient.utils.render.MeshBuilderVertexConsumerProvider.MeshBuilderVertexConsumer.setOffset

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/MeshBuilderVertexConsumerProvider.java:102`

```java
public void setOffset(int offsetX, int offsetY, int offsetZ)
```

## meteordevelopment.meteorclient.utils.render.MeshBuilderVertexConsumerProvider.MeshBuilderVertexConsumer.addVertex

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/MeshBuilderVertexConsumerProvider.java:108`

```java
@Override public @NonNull VertexConsumer addVertex(float x, float y, float z)
```

## meteordevelopment.meteorclient.utils.render.MeshBuilderVertexConsumerProvider.MeshBuilderVertexConsumer.setColor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/MeshBuilderVertexConsumerProvider.java:130`

```java
@Override public @NonNull VertexConsumer setColor(int red, int green, int blue, int alpha)
```

## meteordevelopment.meteorclient.utils.render.MeshBuilderVertexConsumerProvider.MeshBuilderVertexConsumer.setColor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/MeshBuilderVertexConsumerProvider.java:135`

```java
@Override public @NonNull VertexConsumer setColor(int argb)
```

## meteordevelopment.meteorclient.utils.render.MeshBuilderVertexConsumerProvider.MeshBuilderVertexConsumer.setUv

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/MeshBuilderVertexConsumerProvider.java:143`

```java
@Override public @NonNull VertexConsumer setUv(float u, float v)
```

## meteordevelopment.meteorclient.utils.render.MeshBuilderVertexConsumerProvider.MeshBuilderVertexConsumer.setUv1

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/MeshBuilderVertexConsumerProvider.java:151`

```java
@Override public @NonNull VertexConsumer setUv1(int u, int v)
```

## meteordevelopment.meteorclient.utils.render.MeshBuilderVertexConsumerProvider.MeshBuilderVertexConsumer.setUv2

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/MeshBuilderVertexConsumerProvider.java:159`

```java
@Override public @NonNull VertexConsumer setUv2(int u, int v)
```

## meteordevelopment.meteorclient.utils.render.MeshBuilderVertexConsumerProvider.MeshBuilderVertexConsumer.setUv3

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/MeshBuilderVertexConsumerProvider.java:164`

```java
@Override public @NonNull VertexConsumer setUv3(float u, float v)
```

## meteordevelopment.meteorclient.utils.render.MeshBuilderVertexConsumerProvider.MeshBuilderVertexConsumer.setNormal

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/MeshBuilderVertexConsumerProvider.java:169`

```java
@Override public @NonNull VertexConsumer setNormal(float x, float y, float z)
```

## meteordevelopment.meteorclient.utils.render.MeshBuilderVertexConsumerProvider.MeshBuilderVertexConsumer.setLineWidth

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/MeshBuilderVertexConsumerProvider.java:174`

```java
@Override public @NonNull VertexConsumer setLineWidth(float width)
```

## meteordevelopment.meteorclient.utils.render.MeshBuilderVertexConsumerProvider.MeshBuilderVertexConsumer.fixedColor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/MeshBuilderVertexConsumerProvider.java:179`

```java
public void fixedColor(int red, int green, int blue, int alpha)
```

## meteordevelopment.meteorclient.utils.render.MeteorMcGuiRenderer

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/MeteorMcGuiRenderer.java:15`

```java
public class MeteorMcGuiRenderer extends GuiRenderer
```

## meteordevelopment.meteorclient.utils.render.MeteorMcGuiRenderer.MeteorMcGuiRenderer

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/MeteorMcGuiRenderer.java:16`

```java
public MeteorMcGuiRenderer(GuiRenderState renderState, FeatureRenderDispatcher featureRenderDispatcher, List<PictureInPictureRenderer<?>> pictureInPictureRenderers)
```

## meteordevelopment.meteorclient.utils.render.MeteorToast

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/MeteorToast.java:27`

```java
public class MeteorToast implements Toast
```

## meteordevelopment.meteorclient.utils.render.MeteorToast.Builder

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/MeteorToast.java:54`

```java
public static class Builder
```

## meteordevelopment.meteorclient.utils.render.MeteorToast.Builder.Builder

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/MeteorToast.java:61`

```java
public Builder(@NonNull String title)
```

## meteordevelopment.meteorclient.utils.render.MeteorToast.Builder.text

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/MeteorToast.java:65`

```java
public Builder text(@Nullable String text)
```

## meteordevelopment.meteorclient.utils.render.MeteorToast.Builder.icon

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/MeteorToast.java:72`

```java
public Builder icon(@Nullable Item item)
```

## meteordevelopment.meteorclient.utils.render.MeteorToast.Builder.sound

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/MeteorToast.java:77`

```java
public Builder sound(@Nullable SimpleSoundInstance sound)
```

## meteordevelopment.meteorclient.utils.render.MeteorToast.Builder.duration

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/MeteorToast.java:82`

```java
public Builder duration(long duration)
```

## meteordevelopment.meteorclient.utils.render.MeteorToast.Builder.build

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/MeteorToast.java:87`

```java
public MeteorToast build()
```

## meteordevelopment.meteorclient.utils.render.MeteorToast.getWantedVisibility

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/MeteorToast.java:92`

```java
@Override public @NonNull Visibility getWantedVisibility()
```

## meteordevelopment.meteorclient.utils.render.MeteorToast.update

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/MeteorToast.java:97`

```java
@Override public void update(@NonNull ToastManager manager, long time)
```

## meteordevelopment.meteorclient.utils.render.MeteorToast.extractRenderState

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/MeteorToast.java:109`

```java
@Override public void extractRenderState(GuiGraphicsExtractor graphics, @NonNull Font font, long fullyVisibleForMs)
```

## meteordevelopment.meteorclient.utils.render.NametagUtils

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/NametagUtils.java:18`

```java
public class NametagUtils
```

## meteordevelopment.meteorclient.utils.render.NametagUtils.scale

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/NametagUtils.java:28`

```java
public static double scale
```

## meteordevelopment.meteorclient.utils.render.NametagUtils.onRender

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/NametagUtils.java:33`

```java
public static void onRender(Matrix4fc modelView)
```

## meteordevelopment.meteorclient.utils.render.NametagUtils.to2D

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/NametagUtils.java:44`

```java
public static boolean to2D(Vector3d pos, double scale)
```

## meteordevelopment.meteorclient.utils.render.NametagUtils.to2D

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/NametagUtils.java:48`

```java
public static boolean to2D(Vector3d pos, double scale, boolean distanceScaling)
```

## meteordevelopment.meteorclient.utils.render.NametagUtils.to2D

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/NametagUtils.java:52`

```java
public static boolean to2D(Vector3d pos, double scale, boolean distanceScaling, boolean allowBehind)
```

## meteordevelopment.meteorclient.utils.render.NametagUtils.begin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/NametagUtils.java:83`

```java
public static void begin(Vector3d pos)
```

## meteordevelopment.meteorclient.utils.render.NametagUtils.begin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/NametagUtils.java:88`

```java
public static void begin(Vector3d pos, GuiGraphicsExtractor graphics)
```

## meteordevelopment.meteorclient.utils.render.NametagUtils.end

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/NametagUtils.java:104`

```java
public static void end()
```

## meteordevelopment.meteorclient.utils.render.NametagUtils.end

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/NametagUtils.java:108`

```java
public static void end(GuiGraphicsExtractor graphics)
```

## meteordevelopment.meteorclient.utils.render.PeekScreen

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/PeekScreen.java:27`

```java
public class PeekScreen extends ShulkerBoxScreen
```

## meteordevelopment.meteorclient.utils.render.PeekScreen.PeekScreen

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/PeekScreen.java:31`

```java
public PeekScreen(ItemStack storageBlock, ItemStack[] contents)
```

## meteordevelopment.meteorclient.utils.render.PeekScreen.mouseClicked

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/PeekScreen.java:36`

```java
@Override public boolean mouseClicked(@NonNull MouseButtonEvent click, boolean doubled)
```

## meteordevelopment.meteorclient.utils.render.PeekScreen.mouseReleased

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/PeekScreen.java:48`

```java
@Override public boolean mouseReleased(@NonNull MouseButtonEvent click)
```

## meteordevelopment.meteorclient.utils.render.PeekScreen.keyPressed

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/PeekScreen.java:53`

```java
@Override public boolean keyPressed(@NonNull KeyEvent input)
```

## meteordevelopment.meteorclient.utils.render.PeekScreen.extractBackground

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/PeekScreen.java:72`

```java
@Override public void extractBackground(GuiGraphicsExtractor graphics, int mouseX, int mouseY, float delta)
```

## meteordevelopment.meteorclient.utils.render.PlayerHeadTexture

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/PlayerHeadTexture.java:23`

```java
public class PlayerHeadTexture extends Texture
```

## meteordevelopment.meteorclient.utils.render.PlayerHeadTexture.PlayerHeadTexture

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/PlayerHeadTexture.java:26`

```java
public PlayerHeadTexture(byte[] head, boolean needsRotate)
```

## meteordevelopment.meteorclient.utils.render.PlayerHeadTexture.PlayerHeadTexture

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/PlayerHeadTexture.java:33`

```java
public PlayerHeadTexture()
```

## meteordevelopment.meteorclient.utils.render.PlayerHeadTexture.needsRotate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/PlayerHeadTexture.java:55`

```java
public boolean needsRotate()
```

## meteordevelopment.meteorclient.utils.render.PlayerHeadTexture.downloadHead

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/PlayerHeadTexture.java:59`

```java
public static byte[] downloadHead(String url) throws IOException
```

## meteordevelopment.meteorclient.utils.render.PlayerHeadUtils

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/PlayerHeadUtils.java:13`

```java
public class PlayerHeadUtils
```

## meteordevelopment.meteorclient.utils.render.PlayerHeadUtils.STEVE_HEAD

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/PlayerHeadUtils.java:14`

```java
public static PlayerHeadTexture STEVE_HEAD
```

## meteordevelopment.meteorclient.utils.render.PlayerHeadUtils.init

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/PlayerHeadUtils.java:19`

```java
@PostInit public static void init()
```

## meteordevelopment.meteorclient.utils.render.PlayerHeadUtils.fetchHead

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/PlayerHeadUtils.java:24`

```java
public static byte[] fetchHead(UUID id)
```

## meteordevelopment.meteorclient.utils.render.PlayerHeadUtils.getSkinUrl

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/PlayerHeadUtils.java:38`

```java
public static String getSkinUrl(UUID id)
```

## meteordevelopment.meteorclient.utils.render.RenderUtils

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/RenderUtils.java:31`

```java
public class RenderUtils
```

## meteordevelopment.meteorclient.utils.render.RenderUtils.center

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/RenderUtils.java:32`

```java
public static Vec3 center
```

## meteordevelopment.meteorclient.utils.render.RenderUtils.projection

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/RenderUtils.java:33`

```java
public static final Matrix4f projection = new Matrix4f()
```

## meteordevelopment.meteorclient.utils.render.RenderUtils.init

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/RenderUtils.java:41`

```java
@PostInit public static void init()
```

## meteordevelopment.meteorclient.utils.render.RenderUtils.isShaderPackInUse

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/RenderUtils.java:46`

```java
public static boolean isShaderPackInUse()
```

## meteordevelopment.meteorclient.utils.render.RenderUtils.drawItem

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/RenderUtils.java:51`

```java
public static void drawItem(GuiGraphicsExtractor graphics, ItemStack itemStack, int x, int y, float scale, boolean overlay, String countOverride, boolean disableGuiScale)
```

## meteordevelopment.meteorclient.utils.render.RenderUtils.drawItem

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/RenderUtils.java:70`

```java
public static void drawItem(GuiGraphicsExtractor graphics, ItemStack itemStack, int x, int y, float scale, boolean overlay)
```

## meteordevelopment.meteorclient.utils.render.RenderUtils.updateScreenCenter

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/RenderUtils.java:74`

```java
public static void updateScreenCenter(Matrix4fc projection, Matrix4fc view)
```

## meteordevelopment.meteorclient.utils.render.RenderUtils.renderTickingBlock

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/RenderUtils.java:87`

```java
public static void renderTickingBlock(BlockPos blockPos, Color sideColor, Color lineColor, ShapeMode shapeMode, int excludeDir, int duration, boolean fade, boolean shrink)
```

## meteordevelopment.meteorclient.utils.render.RenderUtils.RenderBlock

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/RenderUtils.java:122`

```java
public static class RenderBlock
```

## meteordevelopment.meteorclient.utils.render.RenderUtils.RenderBlock.pos

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/RenderUtils.java:123`

```java
public BlockPos.MutableBlockPos pos = new BlockPos.MutableBlockPos()
```

## meteordevelopment.meteorclient.utils.render.RenderUtils.RenderBlock.sideColor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/RenderUtils.java:125`

```java
public Color sideColor, lineColor
```

## meteordevelopment.meteorclient.utils.render.RenderUtils.RenderBlock.lineColor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/RenderUtils.java:125`

```java
public Color sideColor, lineColor
```

## meteordevelopment.meteorclient.utils.render.RenderUtils.RenderBlock.shapeMode

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/RenderUtils.java:126`

```java
public ShapeMode shapeMode
```

## meteordevelopment.meteorclient.utils.render.RenderUtils.RenderBlock.excludeDir

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/RenderUtils.java:127`

```java
public int excludeDir
```

## meteordevelopment.meteorclient.utils.render.RenderUtils.RenderBlock.ticks

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/RenderUtils.java:129`

```java
public int ticks, duration
```

## meteordevelopment.meteorclient.utils.render.RenderUtils.RenderBlock.duration

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/RenderUtils.java:129`

```java
public int ticks, duration
```

## meteordevelopment.meteorclient.utils.render.RenderUtils.RenderBlock.fade

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/RenderUtils.java:130`

```java
public boolean fade, shrink
```

## meteordevelopment.meteorclient.utils.render.RenderUtils.RenderBlock.shrink

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/RenderUtils.java:130`

```java
public boolean fade, shrink
```

## meteordevelopment.meteorclient.utils.render.RenderUtils.RenderBlock.set

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/RenderUtils.java:132`

```java
public RenderBlock set(BlockPos blockPos, Color sideColor, Color lineColor, ShapeMode shapeMode, int excludeDir, int duration, boolean fade, boolean shrink)
```

## meteordevelopment.meteorclient.utils.render.RenderUtils.RenderBlock.tick

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/RenderUtils.java:146`

```java
public void tick()
```

## meteordevelopment.meteorclient.utils.render.RenderUtils.RenderBlock.render

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/RenderUtils.java:150`

```java
public void render(Render3DEvent event)
```

## meteordevelopment.meteorclient.utils.render.SimpleBlockRenderer

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/SimpleBlockRenderer.java:41`

```java
@NullMarked public abstract class SimpleBlockRenderer
```

## meteordevelopment.meteorclient.utils.render.SimpleBlockRenderer.renderWithBlockEntity

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/SimpleBlockRenderer.java:74`

```java
public static void renderWithBlockEntity(BlockEntity blockEntity, float tickDelta, IVertexConsumerProvider vertexConsumerProvider)
```

## meteordevelopment.meteorclient.utils.render.SimpleBlockRenderer.render

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/SimpleBlockRenderer.java:91`

```java
public static void render(BlockPos pos, BlockState state, IVertexConsumerProvider consumerProvider)
```

## meteordevelopment.meteorclient.utils.render.WireframeEntityRenderer

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/WireframeEntityRenderer.java:29`

```java
public class WireframeEntityRenderer
```

## meteordevelopment.meteorclient.utils.render.WireframeEntityRenderer.render

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/WireframeEntityRenderer.java:42`

```java
@SuppressWarnings("unchecked") public static void render(Render3DEvent event, Entity entity, double scale, Color sideColor, Color lineColor, ShapeMode shapeMode)
```

## meteordevelopment.meteorclient.utils.render.color.Color

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/color/Color.java:18`

```java
@SuppressWarnings("unused") public class Color implements ICopyable<Color>, ISerializable<Color>
```

## meteordevelopment.meteorclient.utils.render.color.Color.CLEAR

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/color/Color.java:20`

```java
public static final Color CLEAR = new Color(0, 0, 0, 0)
```

## meteordevelopment.meteorclient.utils.render.color.Color.WHITE

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/color/Color.java:21`

```java
public static final Color WHITE = new Color(java.awt.Color.WHITE)
```

## meteordevelopment.meteorclient.utils.render.color.Color.LIGHT_GRAY

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/color/Color.java:22`

```java
public static final Color LIGHT_GRAY = new Color(java.awt.Color.LIGHT_GRAY)
```

## meteordevelopment.meteorclient.utils.render.color.Color.GRAY

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/color/Color.java:23`

```java
public static final Color GRAY = new Color(java.awt.Color.GRAY)
```

## meteordevelopment.meteorclient.utils.render.color.Color.DARK_GRAY

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/color/Color.java:24`

```java
public static final Color DARK_GRAY = new Color(java.awt.Color.DARK_GRAY)
```

## meteordevelopment.meteorclient.utils.render.color.Color.BLACK

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/color/Color.java:25`

```java
public static final Color BLACK = new Color(java.awt.Color.BLACK)
```

## meteordevelopment.meteorclient.utils.render.color.Color.RED

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/color/Color.java:26`

```java
public static final Color RED = new Color(java.awt.Color.RED)
```

## meteordevelopment.meteorclient.utils.render.color.Color.PINK

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/color/Color.java:27`

```java
public static final Color PINK = new Color(java.awt.Color.PINK)
```

## meteordevelopment.meteorclient.utils.render.color.Color.ORANGE

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/color/Color.java:28`

```java
public static final Color ORANGE = new Color(java.awt.Color.ORANGE)
```

## meteordevelopment.meteorclient.utils.render.color.Color.YELLOW

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/color/Color.java:29`

```java
public static final Color YELLOW = new Color(java.awt.Color.YELLOW)
```

## meteordevelopment.meteorclient.utils.render.color.Color.GREEN

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/color/Color.java:30`

```java
public static final Color GREEN = new Color(java.awt.Color.GREEN)
```

## meteordevelopment.meteorclient.utils.render.color.Color.MAGENTA

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/color/Color.java:31`

```java
public static final Color MAGENTA = new Color(java.awt.Color.MAGENTA)
```

## meteordevelopment.meteorclient.utils.render.color.Color.CYAN

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/color/Color.java:32`

```java
public static final Color CYAN = new Color(java.awt.Color.CYAN)
```

## meteordevelopment.meteorclient.utils.render.color.Color.BLUE

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/color/Color.java:33`

```java
public static final Color BLUE = new Color(java.awt.Color.BLUE)
```

## meteordevelopment.meteorclient.utils.render.color.Color.r

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/color/Color.java:35`

```java
public int r, g, b, a
```

## meteordevelopment.meteorclient.utils.render.color.Color.g

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/color/Color.java:35`

```java
public int r, g, b, a
```

## meteordevelopment.meteorclient.utils.render.color.Color.b

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/color/Color.java:35`

```java
public int r, g, b, a
```

## meteordevelopment.meteorclient.utils.render.color.Color.a

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/color/Color.java:35`

```java
public int r, g, b, a
```

## meteordevelopment.meteorclient.utils.render.color.Color.Color

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/color/Color.java:37`

```java
public Color()
```

## meteordevelopment.meteorclient.utils.render.color.Color.Color

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/color/Color.java:41`

```java
public Color(int r, int g, int b)
```

## meteordevelopment.meteorclient.utils.render.color.Color.Color

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/color/Color.java:50`

```java
public Color(int r, int g, int b, int a)
```

## meteordevelopment.meteorclient.utils.render.color.Color.Color

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/color/Color.java:59`

```java
public Color(float r, float g, float b, float a)
```

## meteordevelopment.meteorclient.utils.render.color.Color.Color

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/color/Color.java:68`

```java
public Color(int packed)
```

## meteordevelopment.meteorclient.utils.render.color.Color.Color

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/color/Color.java:75`

```java
public Color(Color color)
```

## meteordevelopment.meteorclient.utils.render.color.Color.Color

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/color/Color.java:82`

```java
public Color(java.awt.Color color)
```

## meteordevelopment.meteorclient.utils.render.color.Color.Color

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/color/Color.java:89`

```java
public Color(ChatFormatting formatting)
```

## meteordevelopment.meteorclient.utils.render.color.Color.Color

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/color/Color.java:104`

```java
public Color(TextColor textColor)
```

## meteordevelopment.meteorclient.utils.render.color.Color.Color

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/color/Color.java:111`

```java
public Color(Style style)
```

## meteordevelopment.meteorclient.utils.render.color.Color.fromRGBA

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/color/Color.java:126`

```java
public static int fromRGBA(int r, int g, int b, int a)
```

## meteordevelopment.meteorclient.utils.render.color.Color.toRGBAR

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/color/Color.java:130`

```java
public static int toRGBAR(int color)
```

## meteordevelopment.meteorclient.utils.render.color.Color.toRGBAG

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/color/Color.java:134`

```java
public static int toRGBAG(int color)
```

## meteordevelopment.meteorclient.utils.render.color.Color.toRGBAB

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/color/Color.java:138`

```java
public static int toRGBAB(int color)
```

## meteordevelopment.meteorclient.utils.render.color.Color.toRGBAA

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/color/Color.java:142`

```java
public static int toRGBAA(int color)
```

## meteordevelopment.meteorclient.utils.render.color.Color.fromHsv

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/color/Color.java:146`

```java
public static Color fromHsv(double h, double s, double v)
```

## meteordevelopment.meteorclient.utils.render.color.Color.set

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/color/Color.java:203`

```java
public Color set(int r, int g, int b, int a)
```

## meteordevelopment.meteorclient.utils.render.color.Color.r

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/color/Color.java:214`

```java
public Color r(int r)
```

## meteordevelopment.meteorclient.utils.render.color.Color.g

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/color/Color.java:220`

```java
public Color g(int g)
```

## meteordevelopment.meteorclient.utils.render.color.Color.b

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/color/Color.java:226`

```java
public Color b(int b)
```

## meteordevelopment.meteorclient.utils.render.color.Color.a

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/color/Color.java:232`

```java
public Color a(int a)
```

## meteordevelopment.meteorclient.utils.render.color.Color.set

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/color/Color.java:238`

```java
@Override public Color set(Color value)
```

## meteordevelopment.meteorclient.utils.render.color.Color.parse

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/color/Color.java:250`

```java
public boolean parse(String text)
```

## meteordevelopment.meteorclient.utils.render.color.Color.copy

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/color/Color.java:272`

```java
@Override public Color copy()
```

## meteordevelopment.meteorclient.utils.render.color.Color.toSetting

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/color/Color.java:277`

```java
public SettingColor toSetting()
```

## meteordevelopment.meteorclient.utils.render.color.Color.toTextColor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/color/Color.java:281`

```java
public TextColor toTextColor()
```

## meteordevelopment.meteorclient.utils.render.color.Color.toStyle

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/color/Color.java:285`

```java
public Style toStyle()
```

## meteordevelopment.meteorclient.utils.render.color.Color.styleWith

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/color/Color.java:289`

```java
public Style styleWith(Style style)
```

## meteordevelopment.meteorclient.utils.render.color.Color.validate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/color/Color.java:293`

```java
public void validate()
```

## meteordevelopment.meteorclient.utils.render.color.Color.getVec3d

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/color/Color.java:307`

```java
public Vec3 getVec3d()
```

## meteordevelopment.meteorclient.utils.render.color.Color.getVec3f

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/color/Color.java:311`

```java
public Vector3f getVec3f()
```

## meteordevelopment.meteorclient.utils.render.color.Color.getVec4f

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/color/Color.java:315`

```java
public Vector4f getVec4f()
```

## meteordevelopment.meteorclient.utils.render.color.Color.getVec4f

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/color/Color.java:319`

```java
public Vector4f getVec4f(Vector4f dest)
```

## meteordevelopment.meteorclient.utils.render.color.Color.getPacked

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/color/Color.java:323`

```java
public int getPacked()
```

## meteordevelopment.meteorclient.utils.render.color.Color.toTag

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/color/Color.java:327`

```java
@Override public CompoundTag toTag()
```

## meteordevelopment.meteorclient.utils.render.color.Color.fromTag

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/color/Color.java:339`

```java
@Override public Color fromTag(CompoundTag tag)
```

## meteordevelopment.meteorclient.utils.render.color.Color.toString

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/color/Color.java:350`

```java
@Override public String toString()
```

## meteordevelopment.meteorclient.utils.render.color.Color.equals

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/color/Color.java:355`

```java
@Override public boolean equals(Object o)
```

## meteordevelopment.meteorclient.utils.render.color.Color.hashCode

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/color/Color.java:365`

```java
@Override public int hashCode()
```

## meteordevelopment.meteorclient.utils.render.color.RainbowColor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/color/RainbowColor.java:8`

```java
public class RainbowColor extends Color
```

## meteordevelopment.meteorclient.utils.render.color.RainbowColor.RainbowColor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/color/RainbowColor.java:12`

```java
public RainbowColor()
```

## meteordevelopment.meteorclient.utils.render.color.RainbowColor.getSpeed

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/color/RainbowColor.java:16`

```java
public double getSpeed()
```

## meteordevelopment.meteorclient.utils.render.color.RainbowColor.setSpeed

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/color/RainbowColor.java:20`

```java
public RainbowColor setSpeed(double speed)
```

## meteordevelopment.meteorclient.utils.render.color.RainbowColor.getNext

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/color/RainbowColor.java:25`

```java
public RainbowColor getNext()
```

## meteordevelopment.meteorclient.utils.render.color.RainbowColor.getNext

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/color/RainbowColor.java:29`

```java
public RainbowColor getNext(double delta)
```

## meteordevelopment.meteorclient.utils.render.color.RainbowColor.set

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/color/RainbowColor.java:41`

```java
public RainbowColor set(RainbowColor color)
```

## meteordevelopment.meteorclient.utils.render.color.RainbowColor.equals

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/color/RainbowColor.java:50`

```java
@Override public boolean equals(Object o)
```

## meteordevelopment.meteorclient.utils.render.color.RainbowColor.hashCode

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/color/RainbowColor.java:59`

```java
@Override public int hashCode()
```

## meteordevelopment.meteorclient.utils.render.color.RainbowColors

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/color/RainbowColors.java:26`

```java
public class RainbowColors
```

## meteordevelopment.meteorclient.utils.render.color.RainbowColors.GLOBAL

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/color/RainbowColors.java:33`

```java
public static final RainbowColor GLOBAL = new RainbowColor()
```

## meteordevelopment.meteorclient.utils.render.color.RainbowColors.init

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/color/RainbowColors.java:38`

```java
@PostInit public static void init()
```

## meteordevelopment.meteorclient.utils.render.color.RainbowColors.addSetting

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/color/RainbowColors.java:43`

```java
public static void addSetting(Setting<SettingColor> setting)
```

## meteordevelopment.meteorclient.utils.render.color.RainbowColors.addSettingList

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/color/RainbowColors.java:47`

```java
public static void addSettingList(Setting<List<SettingColor>> setting)
```

## meteordevelopment.meteorclient.utils.render.color.RainbowColors.removeSetting

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/color/RainbowColors.java:51`

```java
public static void removeSetting(Setting<SettingColor> setting)
```

## meteordevelopment.meteorclient.utils.render.color.RainbowColors.removeSettingList

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/color/RainbowColors.java:55`

```java
public static void removeSettingList(Setting<List<SettingColor>> setting)
```

## meteordevelopment.meteorclient.utils.render.color.RainbowColors.add

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/color/RainbowColors.java:59`

```java
public static void add(SettingColor color)
```

## meteordevelopment.meteorclient.utils.render.color.RainbowColors.register

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/color/RainbowColors.java:63`

```java
public static void register(Runnable runnable)
```

## meteordevelopment.meteorclient.utils.render.color.SettingColor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/color/SettingColor.java:13`

```java
public class SettingColor extends Color
```

## meteordevelopment.meteorclient.utils.render.color.SettingColor.rainbow

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/color/SettingColor.java:14`

```java
public boolean rainbow
```

## meteordevelopment.meteorclient.utils.render.color.SettingColor.SettingColor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/color/SettingColor.java:16`

```java
public SettingColor()
```

## meteordevelopment.meteorclient.utils.render.color.SettingColor.SettingColor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/color/SettingColor.java:20`

```java
public SettingColor(int packed)
```

## meteordevelopment.meteorclient.utils.render.color.SettingColor.SettingColor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/color/SettingColor.java:24`

```java
public SettingColor(int r, int g, int b)
```

## meteordevelopment.meteorclient.utils.render.color.SettingColor.SettingColor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/color/SettingColor.java:28`

```java
public SettingColor(int r, int g, int b, boolean rainbow)
```

## meteordevelopment.meteorclient.utils.render.color.SettingColor.SettingColor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/color/SettingColor.java:32`

```java
public SettingColor(int r, int g, int b, int a)
```

## meteordevelopment.meteorclient.utils.render.color.SettingColor.SettingColor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/color/SettingColor.java:36`

```java
public SettingColor(float r, float g, float b, float a)
```

## meteordevelopment.meteorclient.utils.render.color.SettingColor.SettingColor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/color/SettingColor.java:40`

```java
public SettingColor(int r, int g, int b, int a, boolean rainbow)
```

## meteordevelopment.meteorclient.utils.render.color.SettingColor.SettingColor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/color/SettingColor.java:45`

```java
public SettingColor(SettingColor color)
```

## meteordevelopment.meteorclient.utils.render.color.SettingColor.SettingColor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/color/SettingColor.java:50`

```java
public SettingColor(java.awt.Color color)
```

## meteordevelopment.meteorclient.utils.render.color.SettingColor.SettingColor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/color/SettingColor.java:54`

```java
public SettingColor(ChatFormatting formatting)
```

## meteordevelopment.meteorclient.utils.render.color.SettingColor.SettingColor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/color/SettingColor.java:58`

```java
public SettingColor(TextColor textColor)
```

## meteordevelopment.meteorclient.utils.render.color.SettingColor.SettingColor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/color/SettingColor.java:62`

```java
public SettingColor(Style style)
```

## meteordevelopment.meteorclient.utils.render.color.SettingColor.rainbow

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/color/SettingColor.java:66`

```java
public SettingColor rainbow(boolean rainbow)
```

## meteordevelopment.meteorclient.utils.render.color.SettingColor.update

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/color/SettingColor.java:71`

```java
public void update()
```

## meteordevelopment.meteorclient.utils.render.color.SettingColor.set

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/color/SettingColor.java:75`

```java
@Override public SettingColor set(Color value)
```

## meteordevelopment.meteorclient.utils.render.color.SettingColor.copy

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/color/SettingColor.java:83`

```java
@Override public Color copy()
```

## meteordevelopment.meteorclient.utils.render.color.SettingColor.toTag

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/color/SettingColor.java:88`

```java
@Override public CompoundTag toTag()
```

## meteordevelopment.meteorclient.utils.render.color.SettingColor.fromTag

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/color/SettingColor.java:95`

```java
@Override public SettingColor fromTag(CompoundTag tag)
```

## meteordevelopment.meteorclient.utils.render.color.SettingColor.equals

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/color/SettingColor.java:102`

```java
@Override public boolean equals(Object o)
```

## meteordevelopment.meteorclient.utils.render.color.SettingColor.hashCode

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/color/SettingColor.java:111`

```java
@Override public int hashCode()
```

## meteordevelopment.meteorclient.utils.render.postprocess.ChamsShader

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/postprocess/ChamsShader.java:39`

```java
public class ChamsShader extends EntityShader
```

## meteordevelopment.meteorclient.utils.render.postprocess.ChamsShader.ChamsShader

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/postprocess/ChamsShader.java:45`

```java
public ChamsShader()
```

## meteordevelopment.meteorclient.utils.render.postprocess.ChamsShader.load

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/postprocess/ChamsShader.java:50`

```java
@PostInit public static void load()
```

## meteordevelopment.meteorclient.utils.render.postprocess.ChamsShader.setupPass

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/postprocess/ChamsShader.java:91`

```java
@Override protected void setupPass(MeshRenderer renderer)
```

## meteordevelopment.meteorclient.utils.render.postprocess.ChamsShader.shouldDraw

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/postprocess/ChamsShader.java:104`

```java
@Override protected boolean shouldDraw()
```

## meteordevelopment.meteorclient.utils.render.postprocess.ChamsShader.shouldDraw

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/postprocess/ChamsShader.java:110`

```java
@Override public boolean shouldDraw(Entity entity)
```

## meteordevelopment.meteorclient.utils.render.postprocess.ChamsShader.flipFrame

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/postprocess/ChamsShader.java:124`

```java
public static void flipFrame()
```

## meteordevelopment.meteorclient.utils.render.postprocess.EntityOutlineShader

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/postprocess/EntityOutlineShader.java:9`

```java
public class EntityOutlineShader extends EntityShader
```

## meteordevelopment.meteorclient.utils.render.postprocess.EntityOutlineShader.EntityOutlineShader

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/postprocess/EntityOutlineShader.java:12`

```java
public EntityOutlineShader()
```

## meteordevelopment.meteorclient.utils.render.postprocess.EntityOutlineShader.shouldDraw

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/postprocess/EntityOutlineShader.java:16`

```java
@Override protected boolean shouldDraw()
```

## meteordevelopment.meteorclient.utils.render.postprocess.EntityOutlineShader.shouldDraw

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/postprocess/EntityOutlineShader.java:22`

```java
@Override public boolean shouldDraw(Entity entity)
```

## meteordevelopment.meteorclient.utils.render.postprocess.EntityOutlineShader.setupPass

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/postprocess/EntityOutlineShader.java:28`

```java
@Override protected void setupPass(MeshRenderer renderer)
```

## meteordevelopment.meteorclient.utils.render.postprocess.EntityShader

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/postprocess/EntityShader.java:9`

```java
public abstract class EntityShader extends PostProcessShader
```

## meteordevelopment.meteorclient.utils.render.postprocess.EntityShader.EntityShader

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/postprocess/EntityShader.java:10`

```java
protected EntityShader(RenderPipeline pipeline)
```

## meteordevelopment.meteorclient.utils.render.postprocess.EntityShader.shouldDraw

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/postprocess/EntityShader.java:14`

```java
public abstract boolean shouldDraw(Entity entity)
```

## meteordevelopment.meteorclient.utils.render.postprocess.EntityShader.preDraw

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/postprocess/EntityShader.java:16`

```java
@Override protected void preDraw()
```

## meteordevelopment.meteorclient.utils.render.postprocess.EntityShader.postDraw

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/postprocess/EntityShader.java:21`

```java
@Override protected void postDraw()
```

## meteordevelopment.meteorclient.utils.render.postprocess.EntityShader.submitVertices

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/postprocess/EntityShader.java:26`

```java
public void submitVertices()
```

## meteordevelopment.meteorclient.utils.render.postprocess.OutlineUniforms

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/postprocess/OutlineUniforms.java:18`

```java
public class OutlineUniforms
```

## meteordevelopment.meteorclient.utils.render.postprocess.OutlineUniforms.flipFrame

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/postprocess/OutlineUniforms.java:28`

```java
public static void flipFrame()
```

## meteordevelopment.meteorclient.utils.render.postprocess.OutlineUniforms.write

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/postprocess/OutlineUniforms.java:32`

```java
public static GpuBufferSlice write(int width, float fillOpacity, int shapeMode, float glowMultiplier)
```

## meteordevelopment.meteorclient.utils.render.postprocess.PostProcessShader

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/postprocess/PostProcessShader.java:24`

```java
public abstract class PostProcessShader
```

## meteordevelopment.meteorclient.utils.render.postprocess.PostProcessShader.pipeline

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/postprocess/PostProcessShader.java:25`

```java
protected final RenderPipeline pipeline
```

## meteordevelopment.meteorclient.utils.render.postprocess.PostProcessShader.framebuffer

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/postprocess/PostProcessShader.java:26`

```java
public final RenderTarget framebuffer
```

## meteordevelopment.meteorclient.utils.render.postprocess.PostProcessShader.PostProcessShader

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/postprocess/PostProcessShader.java:28`

```java
protected PostProcessShader(RenderPipeline pipeline)
```

## meteordevelopment.meteorclient.utils.render.postprocess.PostProcessShader.shouldDraw

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/postprocess/PostProcessShader.java:34`

```java
protected abstract boolean shouldDraw()
```

## meteordevelopment.meteorclient.utils.render.postprocess.PostProcessShader.preDraw

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/postprocess/PostProcessShader.java:36`

```java
protected void preDraw()
```

## meteordevelopment.meteorclient.utils.render.postprocess.PostProcessShader.postDraw

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/postprocess/PostProcessShader.java:39`

```java
protected void postDraw()
```

## meteordevelopment.meteorclient.utils.render.postprocess.PostProcessShader.setupPass

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/postprocess/PostProcessShader.java:42`

```java
protected abstract void setupPass(MeshRenderer renderer)
```

## meteordevelopment.meteorclient.utils.render.postprocess.PostProcessShader.clearTexture

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/postprocess/PostProcessShader.java:44`

```java
public void clearTexture()
```

## meteordevelopment.meteorclient.utils.render.postprocess.PostProcessShader.submitVertices

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/postprocess/PostProcessShader.java:51`

```java
public void submitVertices(Runnable draw)
```

## meteordevelopment.meteorclient.utils.render.postprocess.PostProcessShader.render

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/postprocess/PostProcessShader.java:59`

```java
public void render()
```

## meteordevelopment.meteorclient.utils.render.postprocess.PostProcessShader.onResized

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/postprocess/PostProcessShader.java:77`

```java
public void onResized(int width, int height)
```

## meteordevelopment.meteorclient.utils.render.postprocess.PostProcessShader.flipFrame

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/postprocess/PostProcessShader.java:92`

```java
public static void flipFrame()
```

## meteordevelopment.meteorclient.utils.render.postprocess.PostProcessShaders

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/postprocess/PostProcessShaders.java:10`

```java
public class PostProcessShaders
```

## meteordevelopment.meteorclient.utils.render.postprocess.PostProcessShaders.CHAMS

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/postprocess/PostProcessShaders.java:11`

```java
public static EntityShader CHAMS
```

## meteordevelopment.meteorclient.utils.render.postprocess.PostProcessShaders.ENTITY_OUTLINE

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/postprocess/PostProcessShaders.java:12`

```java
public static EntityShader ENTITY_OUTLINE
```

## meteordevelopment.meteorclient.utils.render.postprocess.PostProcessShaders.STORAGE_OUTLINE

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/postprocess/PostProcessShaders.java:13`

```java
public static PostProcessShader STORAGE_OUTLINE
```

## meteordevelopment.meteorclient.utils.render.postprocess.PostProcessShaders.init

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/postprocess/PostProcessShaders.java:17`

```java
@PreInit public static void init()
```

## meteordevelopment.meteorclient.utils.render.postprocess.PostProcessShaders.beginRender

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/postprocess/PostProcessShaders.java:26`

```java
public static void beginRender()
```

## meteordevelopment.meteorclient.utils.render.postprocess.PostProcessShaders.submitEntityVertices

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/postprocess/PostProcessShaders.java:32`

```java
public static void submitEntityVertices()
```

## meteordevelopment.meteorclient.utils.render.postprocess.PostProcessShaders.onResized

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/postprocess/PostProcessShaders.java:43`

```java
public static void onResized(int width, int height)
```

## meteordevelopment.meteorclient.utils.render.postprocess.StorageOutlineShader

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/postprocess/StorageOutlineShader.java:8`

```java
public class StorageOutlineShader extends PostProcessShader
```

## meteordevelopment.meteorclient.utils.render.postprocess.StorageOutlineShader.StorageOutlineShader

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/postprocess/StorageOutlineShader.java:11`

```java
public StorageOutlineShader()
```

## meteordevelopment.meteorclient.utils.render.postprocess.StorageOutlineShader.shouldDraw

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/postprocess/StorageOutlineShader.java:15`

```java
@Override protected boolean shouldDraw()
```

## meteordevelopment.meteorclient.utils.render.postprocess.StorageOutlineShader.setupPass

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/postprocess/StorageOutlineShader.java:21`

```java
@Override protected void setupPass(MeshRenderer renderer)
```

## meteordevelopment.meteorclient.utils.render.prompts.OkPrompt

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/prompts/OkPrompt.java:15`

```java
public class OkPrompt extends Prompt<OkPrompt>
```

## meteordevelopment.meteorclient.utils.render.prompts.OkPrompt.create

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/prompts/OkPrompt.java:23`

```java
public static OkPrompt create()
```

## meteordevelopment.meteorclient.utils.render.prompts.OkPrompt.create

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/prompts/OkPrompt.java:27`

```java
public static OkPrompt create(GuiTheme theme, Screen parent)
```

## meteordevelopment.meteorclient.utils.render.prompts.OkPrompt.onOk

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/prompts/OkPrompt.java:31`

```java
public OkPrompt onOk(Runnable action)
```

## meteordevelopment.meteorclient.utils.render.prompts.OkPrompt.initialiseWidgets

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/prompts/OkPrompt.java:36`

```java
@Override protected void initialiseWidgets(PromptScreen screen)
```

## meteordevelopment.meteorclient.utils.render.prompts.Prompt

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/prompts/Prompt.java:16`

```java
@SuppressWarnings("unchecked") // cant instantiate a Prompt directly so this is fine public abstract class Prompt<T>
```

## meteordevelopment.meteorclient.utils.render.prompts.Prompt.theme

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/prompts/Prompt.java:18`

```java
protected final GuiTheme theme
```

## meteordevelopment.meteorclient.utils.render.prompts.Prompt.parent

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/prompts/Prompt.java:19`

```java
protected final Screen parent
```

## meteordevelopment.meteorclient.utils.render.prompts.Prompt.title

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/prompts/Prompt.java:21`

```java
protected String title = ""
```

## meteordevelopment.meteorclient.utils.render.prompts.Prompt.messages

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/prompts/Prompt.java:22`

```java
protected final List<String> messages = new ArrayList<>()
```

## meteordevelopment.meteorclient.utils.render.prompts.Prompt.dontShowAgainCheckboxVisible

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/prompts/Prompt.java:23`

```java
protected boolean dontShowAgainCheckboxVisible = true
```

## meteordevelopment.meteorclient.utils.render.prompts.Prompt.id

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/prompts/Prompt.java:24`

```java
protected String id = null
```

## meteordevelopment.meteorclient.utils.render.prompts.Prompt.Prompt

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/prompts/Prompt.java:26`

```java
protected Prompt(GuiTheme theme, Screen parent)
```

## meteordevelopment.meteorclient.utils.render.prompts.Prompt.title

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/prompts/Prompt.java:31`

```java
public T title(String title)
```

## meteordevelopment.meteorclient.utils.render.prompts.Prompt.message

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/prompts/Prompt.java:36`

```java
public T message(String message)
```

## meteordevelopment.meteorclient.utils.render.prompts.Prompt.message

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/prompts/Prompt.java:41`

```java
public T message(String message, Object... args)
```

## meteordevelopment.meteorclient.utils.render.prompts.Prompt.dontShowAgainCheckboxVisible

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/prompts/Prompt.java:46`

```java
public T dontShowAgainCheckboxVisible(boolean visible)
```

## meteordevelopment.meteorclient.utils.render.prompts.Prompt.id

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/prompts/Prompt.java:51`

```java
public T id(String from)
```

## meteordevelopment.meteorclient.utils.render.prompts.Prompt.show

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/prompts/Prompt.java:56`

```java
public boolean show()
```

## meteordevelopment.meteorclient.utils.render.prompts.Prompt.dontShowAgain

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/prompts/Prompt.java:68`

```java
protected void dontShowAgain(PromptScreen screen)
```

## meteordevelopment.meteorclient.utils.render.prompts.Prompt.initialiseWidgets

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/prompts/Prompt.java:74`

```java
protected abstract void initialiseWidgets(PromptScreen screen)
```

## meteordevelopment.meteorclient.utils.render.prompts.Prompt.PromptScreen

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/prompts/Prompt.java:76`

```java
protected class PromptScreen extends WindowScreen
```

## meteordevelopment.meteorclient.utils.render.prompts.Prompt.PromptScreen.dontShowAgainCheckbox

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/prompts/Prompt.java:77`

```java
protected WCheckbox dontShowAgainCheckbox
```

## meteordevelopment.meteorclient.utils.render.prompts.Prompt.PromptScreen.list

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/prompts/Prompt.java:78`

```java
protected WHorizontalList list
```

## meteordevelopment.meteorclient.utils.render.prompts.Prompt.PromptScreen.PromptScreen

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/prompts/Prompt.java:80`

```java
public PromptScreen(GuiTheme theme)
```

## meteordevelopment.meteorclient.utils.render.prompts.Prompt.PromptScreen.initWidgets

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/prompts/Prompt.java:86`

```java
@Override public void initWidgets()
```

## meteordevelopment.meteorclient.utils.render.prompts.YesNoPrompt

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/prompts/YesNoPrompt.java:15`

```java
public class YesNoPrompt extends Prompt<YesNoPrompt>
```

## meteordevelopment.meteorclient.utils.render.prompts.YesNoPrompt.create

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/prompts/YesNoPrompt.java:25`

```java
public static YesNoPrompt create()
```

## meteordevelopment.meteorclient.utils.render.prompts.YesNoPrompt.create

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/prompts/YesNoPrompt.java:29`

```java
public static YesNoPrompt create(GuiTheme theme, Screen parent)
```

## meteordevelopment.meteorclient.utils.render.prompts.YesNoPrompt.onYes

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/prompts/YesNoPrompt.java:33`

```java
public YesNoPrompt onYes(Runnable action)
```

## meteordevelopment.meteorclient.utils.render.prompts.YesNoPrompt.onNo

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/prompts/YesNoPrompt.java:38`

```java
public YesNoPrompt onNo(Runnable action)
```

## meteordevelopment.meteorclient.utils.render.prompts.YesNoPrompt.initialiseWidgets

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/prompts/YesNoPrompt.java:43`

```java
@Override protected void initialiseWidgets(PromptScreen screen)
```
