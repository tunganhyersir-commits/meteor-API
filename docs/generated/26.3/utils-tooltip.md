# utils/tooltip

Khai báo Java có cú pháp public/protected. Không bao gồm API kế thừa/tổng hợp bởi compiler; xem kiểm tra bytecode riêng.

## meteordevelopment.meteorclient.utils.tooltip.BannerTooltipComponent

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/tooltip/BannerTooltipComponent.java:25`

```java
public class BannerTooltipComponent implements MeteorTooltipData, ClientTooltipComponent
```

## meteordevelopment.meteorclient.utils.tooltip.BannerTooltipComponent.BannerTooltipComponent

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/tooltip/BannerTooltipComponent.java:33`

```java
public BannerTooltipComponent(ItemStack banner)
```

## meteordevelopment.meteorclient.utils.tooltip.BannerTooltipComponent.BannerTooltipComponent

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/tooltip/BannerTooltipComponent.java:40`

```java
public BannerTooltipComponent(DyeColor color, BannerPatternLayers patterns)
```

## meteordevelopment.meteorclient.utils.tooltip.BannerTooltipComponent.getComponent

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/tooltip/BannerTooltipComponent.java:47`

```java
@Override public ClientTooltipComponent getComponent()
```

## meteordevelopment.meteorclient.utils.tooltip.BannerTooltipComponent.getHeight

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/tooltip/BannerTooltipComponent.java:52`

```java
@Override public int getHeight(@NonNull Font textRenderer)
```

## meteordevelopment.meteorclient.utils.tooltip.BannerTooltipComponent.getWidth

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/tooltip/BannerTooltipComponent.java:57`

```java
@Override public int getWidth(@NonNull Font textRenderer)
```

## meteordevelopment.meteorclient.utils.tooltip.BannerTooltipComponent.extractImage

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/tooltip/BannerTooltipComponent.java:62`

```java
@Override public void extractImage(@NonNull Font textRenderer, int x, int y, int width, int height, @NonNull GuiGraphicsExtractor graphics)
```

## meteordevelopment.meteorclient.utils.tooltip.BookTooltipComponent

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/tooltip/BookTooltipComponent.java:18`

```java
public class BookTooltipComponent implements ClientTooltipComponent, MeteorTooltipData
```

## meteordevelopment.meteorclient.utils.tooltip.BookTooltipComponent.BookTooltipComponent

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/tooltip/BookTooltipComponent.java:23`

```java
public BookTooltipComponent(Component page)
```

## meteordevelopment.meteorclient.utils.tooltip.BookTooltipComponent.getComponent

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/tooltip/BookTooltipComponent.java:27`

```java
@Override public ClientTooltipComponent getComponent()
```

## meteordevelopment.meteorclient.utils.tooltip.BookTooltipComponent.getHeight

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/tooltip/BookTooltipComponent.java:32`

```java
@Override public int getHeight(@NonNull Font textRenderer)
```

## meteordevelopment.meteorclient.utils.tooltip.BookTooltipComponent.getWidth

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/tooltip/BookTooltipComponent.java:37`

```java
@Override public int getWidth(@NonNull Font textRenderer)
```

## meteordevelopment.meteorclient.utils.tooltip.BookTooltipComponent.extractImage

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/tooltip/BookTooltipComponent.java:42`

```java
@Override public void extractImage(Font font, int x, int y, int width, int height, GuiGraphicsExtractor graphics)
```

## meteordevelopment.meteorclient.utils.tooltip.BundleTooltipComponent

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/tooltip/BundleTooltipComponent.java:25`

```java
public class BundleTooltipComponent implements ClientTooltipComponent, MeteorTooltipData
```

## meteordevelopment.meteorclient.utils.tooltip.BundleTooltipComponent.BundleTooltipComponent

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/tooltip/BundleTooltipComponent.java:45`

```java
public BundleTooltipComponent(ItemStack[] items, BundleContents bundleContents)
```

## meteordevelopment.meteorclient.utils.tooltip.BundleTooltipComponent.getComponent

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/tooltip/BundleTooltipComponent.java:54`

```java
@Override public ClientTooltipComponent getComponent()
```

## meteordevelopment.meteorclient.utils.tooltip.BundleTooltipComponent.getHeight

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/tooltip/BundleTooltipComponent.java:59`

```java
@Override public int getHeight(@NonNull Font textRenderer)
```

## meteordevelopment.meteorclient.utils.tooltip.BundleTooltipComponent.getWidth

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/tooltip/BundleTooltipComponent.java:64`

```java
@Override public int getWidth(@NonNull Font textRenderer)
```

## meteordevelopment.meteorclient.utils.tooltip.BundleTooltipComponent.showTooltipWithItemInHand

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/tooltip/BundleTooltipComponent.java:69`

```java
@Override public boolean showTooltipWithItemInHand()
```

## meteordevelopment.meteorclient.utils.tooltip.BundleTooltipComponent.extractImage

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/tooltip/BundleTooltipComponent.java:74`

```java
@Override public void extractImage(@NonNull Font font, int x, int y, int width, int height, @NonNull GuiGraphicsExtractor graphics)
```

## meteordevelopment.meteorclient.utils.tooltip.ContainerTooltipComponent

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/tooltip/ContainerTooltipComponent.java:19`

```java
public class ContainerTooltipComponent implements ClientTooltipComponent, MeteorTooltipData
```

## meteordevelopment.meteorclient.utils.tooltip.ContainerTooltipComponent.ContainerTooltipComponent

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/tooltip/ContainerTooltipComponent.java:25`

```java
public ContainerTooltipComponent(ItemStack[] items, Color color)
```

## meteordevelopment.meteorclient.utils.tooltip.ContainerTooltipComponent.getComponent

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/tooltip/ContainerTooltipComponent.java:30`

```java
@Override public ClientTooltipComponent getComponent()
```

## meteordevelopment.meteorclient.utils.tooltip.ContainerTooltipComponent.getHeight

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/tooltip/ContainerTooltipComponent.java:35`

```java
@Override public int getHeight(@NonNull Font textRenderer)
```

## meteordevelopment.meteorclient.utils.tooltip.ContainerTooltipComponent.getWidth

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/tooltip/ContainerTooltipComponent.java:40`

```java
@Override public int getWidth(@NonNull Font textRenderer)
```

## meteordevelopment.meteorclient.utils.tooltip.ContainerTooltipComponent.extractImage

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/tooltip/ContainerTooltipComponent.java:45`

```java
@Override public void extractImage(@NonNull Font font, int x, int y, int width, int height, GuiGraphicsExtractor graphics)
```

## meteordevelopment.meteorclient.utils.tooltip.EntityTooltipComponent

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/tooltip/EntityTooltipComponent.java:19`

```java
public class EntityTooltipComponent implements MeteorTooltipData, ClientTooltipComponent
```

## meteordevelopment.meteorclient.utils.tooltip.EntityTooltipComponent.entity

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/tooltip/EntityTooltipComponent.java:20`

```java
protected final LivingEntity entity
```

## meteordevelopment.meteorclient.utils.tooltip.EntityTooltipComponent.EntityTooltipComponent

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/tooltip/EntityTooltipComponent.java:23`

```java
public EntityTooltipComponent(LivingEntity entity)
```

## meteordevelopment.meteorclient.utils.tooltip.EntityTooltipComponent.getComponent

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/tooltip/EntityTooltipComponent.java:27`

```java
@Override public ClientTooltipComponent getComponent()
```

## meteordevelopment.meteorclient.utils.tooltip.EntityTooltipComponent.getHeight

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/tooltip/EntityTooltipComponent.java:32`

```java
@Override public int getHeight(@NonNull Font textRenderer)
```

## meteordevelopment.meteorclient.utils.tooltip.EntityTooltipComponent.getWidth

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/tooltip/EntityTooltipComponent.java:37`

```java
@Override public int getWidth(@NonNull Font textRenderer)
```

## meteordevelopment.meteorclient.utils.tooltip.EntityTooltipComponent.extractImage

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/tooltip/EntityTooltipComponent.java:42`

```java
@Override public void extractImage(@NonNull Font textRenderer, int x, int y, int width, int height, GuiGraphicsExtractor graphics)
```

## meteordevelopment.meteorclient.utils.tooltip.MapTooltipComponent

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/tooltip/MapTooltipComponent.java:23`

```java
public class MapTooltipComponent implements ClientTooltipComponent, MeteorTooltipData
```

## meteordevelopment.meteorclient.utils.tooltip.MapTooltipComponent.MapTooltipComponent

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/tooltip/MapTooltipComponent.java:28`

```java
public MapTooltipComponent(int mapId)
```

## meteordevelopment.meteorclient.utils.tooltip.MapTooltipComponent.getHeight

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/tooltip/MapTooltipComponent.java:32`

```java
@Override public int getHeight(@NonNull Font textRenderer)
```

## meteordevelopment.meteorclient.utils.tooltip.MapTooltipComponent.getWidth

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/tooltip/MapTooltipComponent.java:38`

```java
@Override public int getWidth(@NonNull Font textRenderer)
```

## meteordevelopment.meteorclient.utils.tooltip.MapTooltipComponent.getComponent

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/tooltip/MapTooltipComponent.java:44`

```java
@Override public ClientTooltipComponent getComponent()
```

## meteordevelopment.meteorclient.utils.tooltip.MapTooltipComponent.extractImage

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/tooltip/MapTooltipComponent.java:49`

```java
@Override public void extractImage(@NonNull Font font, int x, int y, int width, int height, GuiGraphicsExtractor graphics)
```

## meteordevelopment.meteorclient.utils.tooltip.MeteorTooltipData

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/tooltip/MeteorTooltipData.java:11`

```java
public interface MeteorTooltipData extends TooltipComponent
```

## meteordevelopment.meteorclient.utils.tooltip.MeteorTooltipData.getComponent

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/tooltip/MeteorTooltipData.java:12`

```java
ClientTooltipComponent getComponent()
```

## meteordevelopment.meteorclient.utils.tooltip.TextTooltipComponent

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/tooltip/TextTooltipComponent.java:12`

```java
public class TextTooltipComponent extends ClientTextTooltip implements MeteorTooltipData
```

## meteordevelopment.meteorclient.utils.tooltip.TextTooltipComponent.TextTooltipComponent

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/tooltip/TextTooltipComponent.java:13`

```java
public TextTooltipComponent(FormattedCharSequence text)
```

## meteordevelopment.meteorclient.utils.tooltip.TextTooltipComponent.TextTooltipComponent

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/tooltip/TextTooltipComponent.java:17`

```java
public TextTooltipComponent(Component text)
```

## meteordevelopment.meteorclient.utils.tooltip.TextTooltipComponent.getComponent

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/tooltip/TextTooltipComponent.java:21`

```java
@Override public ClientTextTooltip getComponent()
```
