# utils/tooltip

Khai báo Java có cú pháp public/protected. Không bao gồm API kế thừa/tổng hợp bởi compiler; xem kiểm tra bytecode riêng.

## meteordevelopment.meteorclient.utils.tooltip.BannerTooltipComponent

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/tooltip/BannerTooltipComponent.java:24`

```java
public class BannerTooltipComponent implements MeteorTooltipData, TooltipComponent
```

## meteordevelopment.meteorclient.utils.tooltip.BannerTooltipComponent.BannerTooltipComponent

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/tooltip/BannerTooltipComponent.java:30`

```java
public BannerTooltipComponent(ItemStack banner)
```

## meteordevelopment.meteorclient.utils.tooltip.BannerTooltipComponent.BannerTooltipComponent

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/tooltip/BannerTooltipComponent.java:37`

```java
public BannerTooltipComponent(DyeColor color, BannerPatternsComponent patterns)
```

## meteordevelopment.meteorclient.utils.tooltip.BannerTooltipComponent.getComponent

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/tooltip/BannerTooltipComponent.java:44`

```java
@Override public TooltipComponent getComponent()
```

## meteordevelopment.meteorclient.utils.tooltip.BannerTooltipComponent.getHeight

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/tooltip/BannerTooltipComponent.java:49`

```java
@Override public int getHeight(TextRenderer textRenderer)
```

## meteordevelopment.meteorclient.utils.tooltip.BannerTooltipComponent.getWidth

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/tooltip/BannerTooltipComponent.java:54`

```java
@Override public int getWidth(TextRenderer textRenderer)
```

## meteordevelopment.meteorclient.utils.tooltip.BannerTooltipComponent.drawItems

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/tooltip/BannerTooltipComponent.java:59`

```java
@Override public void drawItems(TextRenderer textRenderer, int x, int y, int width, int height, DrawContext context)
```

## meteordevelopment.meteorclient.utils.tooltip.BookTooltipComponent

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/tooltip/BookTooltipComponent.java:17`

```java
public class BookTooltipComponent implements TooltipComponent, MeteorTooltipData
```

## meteordevelopment.meteorclient.utils.tooltip.BookTooltipComponent.BookTooltipComponent

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/tooltip/BookTooltipComponent.java:22`

```java
public BookTooltipComponent(Text page)
```

## meteordevelopment.meteorclient.utils.tooltip.BookTooltipComponent.getComponent

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/tooltip/BookTooltipComponent.java:26`

```java
@Override public TooltipComponent getComponent()
```

## meteordevelopment.meteorclient.utils.tooltip.BookTooltipComponent.getHeight

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/tooltip/BookTooltipComponent.java:31`

```java
@Override public int getHeight(TextRenderer textRenderer)
```

## meteordevelopment.meteorclient.utils.tooltip.BookTooltipComponent.getWidth

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/tooltip/BookTooltipComponent.java:36`

```java
@Override public int getWidth(TextRenderer textRenderer)
```

## meteordevelopment.meteorclient.utils.tooltip.BookTooltipComponent.drawItems

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/tooltip/BookTooltipComponent.java:41`

```java
@Override public void drawItems(TextRenderer textRenderer, int x, int y, int width, int height, DrawContext context)
```

## meteordevelopment.meteorclient.utils.tooltip.BundleTooltipComponent

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/tooltip/BundleTooltipComponent.java:24`

```java
public class BundleTooltipComponent implements TooltipComponent, MeteorTooltipData
```

## meteordevelopment.meteorclient.utils.tooltip.BundleTooltipComponent.BundleTooltipComponent

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/tooltip/BundleTooltipComponent.java:44`

```java
public BundleTooltipComponent(ItemStack[] items, BundleContentsComponent bundleContents)
```

## meteordevelopment.meteorclient.utils.tooltip.BundleTooltipComponent.getComponent

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/tooltip/BundleTooltipComponent.java:53`

```java
@Override public TooltipComponent getComponent()
```

## meteordevelopment.meteorclient.utils.tooltip.BundleTooltipComponent.getHeight

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/tooltip/BundleTooltipComponent.java:58`

```java
@Override public int getHeight(TextRenderer textRenderer)
```

## meteordevelopment.meteorclient.utils.tooltip.BundleTooltipComponent.getWidth

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/tooltip/BundleTooltipComponent.java:63`

```java
@Override public int getWidth(TextRenderer textRenderer)
```

## meteordevelopment.meteorclient.utils.tooltip.BundleTooltipComponent.isSticky

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/tooltip/BundleTooltipComponent.java:68`

```java
@Override public boolean isSticky()
```

## meteordevelopment.meteorclient.utils.tooltip.BundleTooltipComponent.drawItems

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/tooltip/BundleTooltipComponent.java:73`

```java
@Override public void drawItems(TextRenderer textRenderer, int x, int y, int width, int height, DrawContext context)
```

## meteordevelopment.meteorclient.utils.tooltip.ContainerTooltipComponent

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/tooltip/ContainerTooltipComponent.java:18`

```java
public class ContainerTooltipComponent implements TooltipComponent, MeteorTooltipData
```

## meteordevelopment.meteorclient.utils.tooltip.ContainerTooltipComponent.ContainerTooltipComponent

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/tooltip/ContainerTooltipComponent.java:24`

```java
public ContainerTooltipComponent(ItemStack[] items, Color color)
```

## meteordevelopment.meteorclient.utils.tooltip.ContainerTooltipComponent.getComponent

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/tooltip/ContainerTooltipComponent.java:29`

```java
@Override public TooltipComponent getComponent()
```

## meteordevelopment.meteorclient.utils.tooltip.ContainerTooltipComponent.getHeight

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/tooltip/ContainerTooltipComponent.java:34`

```java
@Override public int getHeight(TextRenderer textRenderer)
```

## meteordevelopment.meteorclient.utils.tooltip.ContainerTooltipComponent.getWidth

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/tooltip/ContainerTooltipComponent.java:39`

```java
@Override public int getWidth(TextRenderer textRenderer)
```

## meteordevelopment.meteorclient.utils.tooltip.ContainerTooltipComponent.drawItems

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/tooltip/ContainerTooltipComponent.java:44`

```java
@Override public void drawItems(TextRenderer textRenderer, int x, int y, int width, int height, DrawContext context)
```

## meteordevelopment.meteorclient.utils.tooltip.EntityTooltipComponent

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/tooltip/EntityTooltipComponent.java:18`

```java
public class EntityTooltipComponent implements MeteorTooltipData, TooltipComponent
```

## meteordevelopment.meteorclient.utils.tooltip.EntityTooltipComponent.entity

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/tooltip/EntityTooltipComponent.java:19`

```java
protected final LivingEntity entity
```

## meteordevelopment.meteorclient.utils.tooltip.EntityTooltipComponent.EntityTooltipComponent

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/tooltip/EntityTooltipComponent.java:22`

```java
public EntityTooltipComponent(LivingEntity entity)
```

## meteordevelopment.meteorclient.utils.tooltip.EntityTooltipComponent.getComponent

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/tooltip/EntityTooltipComponent.java:26`

```java
@Override public TooltipComponent getComponent()
```

## meteordevelopment.meteorclient.utils.tooltip.EntityTooltipComponent.getHeight

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/tooltip/EntityTooltipComponent.java:31`

```java
@Override public int getHeight(TextRenderer textRenderer)
```

## meteordevelopment.meteorclient.utils.tooltip.EntityTooltipComponent.getWidth

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/tooltip/EntityTooltipComponent.java:36`

```java
@Override public int getWidth(TextRenderer textRenderer)
```

## meteordevelopment.meteorclient.utils.tooltip.EntityTooltipComponent.drawItems

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/tooltip/EntityTooltipComponent.java:41`

```java
@Override public void drawItems(TextRenderer textRenderer, int x, int y, int width, int height, DrawContext context)
```

## meteordevelopment.meteorclient.utils.tooltip.MapTooltipComponent

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/tooltip/MapTooltipComponent.java:22`

```java
public class MapTooltipComponent implements TooltipComponent, MeteorTooltipData
```

## meteordevelopment.meteorclient.utils.tooltip.MapTooltipComponent.MapTooltipComponent

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/tooltip/MapTooltipComponent.java:27`

```java
public MapTooltipComponent(int mapId)
```

## meteordevelopment.meteorclient.utils.tooltip.MapTooltipComponent.getHeight

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/tooltip/MapTooltipComponent.java:31`

```java
@Override public int getHeight(TextRenderer textRenderer)
```

## meteordevelopment.meteorclient.utils.tooltip.MapTooltipComponent.getWidth

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/tooltip/MapTooltipComponent.java:37`

```java
@Override public int getWidth(TextRenderer textRenderer)
```

## meteordevelopment.meteorclient.utils.tooltip.MapTooltipComponent.getComponent

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/tooltip/MapTooltipComponent.java:43`

```java
@Override public TooltipComponent getComponent()
```

## meteordevelopment.meteorclient.utils.tooltip.MapTooltipComponent.drawItems

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/tooltip/MapTooltipComponent.java:48`

```java
@Override public void drawItems(TextRenderer textRenderer, int x, int y, int width, int height, DrawContext context)
```

## meteordevelopment.meteorclient.utils.tooltip.MeteorTooltipData

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/tooltip/MeteorTooltipData.java:11`

```java
public interface MeteorTooltipData extends TooltipData
```

## meteordevelopment.meteorclient.utils.tooltip.MeteorTooltipData.getComponent

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/tooltip/MeteorTooltipData.java:12`

```java
TooltipComponent getComponent()
```

## meteordevelopment.meteorclient.utils.tooltip.TextTooltipComponent

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/tooltip/TextTooltipComponent.java:13`

```java
public class TextTooltipComponent extends OrderedTextTooltipComponent implements MeteorTooltipData
```

## meteordevelopment.meteorclient.utils.tooltip.TextTooltipComponent.TextTooltipComponent

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/tooltip/TextTooltipComponent.java:14`

```java
public TextTooltipComponent(OrderedText text)
```

## meteordevelopment.meteorclient.utils.tooltip.TextTooltipComponent.TextTooltipComponent

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/tooltip/TextTooltipComponent.java:18`

```java
public TextTooltipComponent(Text text)
```

## meteordevelopment.meteorclient.utils.tooltip.TextTooltipComponent.getComponent

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/tooltip/TextTooltipComponent.java:22`

```java
@Override public TooltipComponent getComponent()
```
