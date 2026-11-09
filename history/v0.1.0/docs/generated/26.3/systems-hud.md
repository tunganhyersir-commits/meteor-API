# systems/hud

Khai báo Java có cú pháp public/protected. Không bao gồm API kế thừa/tổng hợp bởi compiler; xem kiểm tra bytecode riêng.

## meteordevelopment.meteorclient.systems.hud.Alignment

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/Alignment.java:8`

```java
public enum Alignment
```

## meteordevelopment.meteorclient.systems.hud.Hud

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/Hud.java:31`

```java
public class Hud extends System<Hud> implements Iterable<HudElement>
```

## meteordevelopment.meteorclient.systems.hud.Hud.GROUP

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/Hud.java:32`

```java
public static final HudGroup GROUP = new HudGroup("Meteor")
```

## meteordevelopment.meteorclient.systems.hud.Hud.active

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/Hud.java:34`

```java
public boolean active
```

## meteordevelopment.meteorclient.systems.hud.Hud.settings

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/Hud.java:35`

```java
public Settings settings = new Settings()
```

## meteordevelopment.meteorclient.systems.hud.Hud.infos

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/Hud.java:37`

```java
public final Map<String, HudElementInfo<?>> infos = new TreeMap<>()
```

## meteordevelopment.meteorclient.systems.hud.Hud.textColors

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/Hud.java:72`

```java
public final Setting<List<SettingColor>> textColors = sgGeneral.add(new ColorListSetting.Builder() .name("text-colors") .description("Colors used for the Text element.") .defaultValue(List.of(new SettingColor(), new SettingColor(175, 175, 175), new SettingColor(25, 225, 25), new SettingColor(225, 25, 25))) .build() )
```

## meteordevelopment.meteorclient.systems.hud.Hud.border

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/Hud.java:81`

```java
public final Setting<Integer> border = sgEditor.add(new IntSetting.Builder() .name("border") .description("Space around the edges of the screen.") .defaultValue(4) .sliderMax(20) .build() )
```

## meteordevelopment.meteorclient.systems.hud.Hud.snappingRange

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/Hud.java:89`

```java
public final Setting<Integer> snappingRange = sgEditor.add(new IntSetting.Builder() .name("snapping-range") .description("Snapping range in editor.") .defaultValue(10) .sliderMax(20) .build() )
```

## meteordevelopment.meteorclient.systems.hud.Hud.Hud

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/Hud.java:108`

```java
public Hud()
```

## meteordevelopment.meteorclient.systems.hud.Hud.get

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/Hud.java:112`

```java
public static Hud get()
```

## meteordevelopment.meteorclient.systems.hud.Hud.init

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/Hud.java:116`

```java
@Override public void init()
```

## meteordevelopment.meteorclient.systems.hud.Hud.register

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/Hud.java:140`

```java
public void register(HudElementInfo<?> info)
```

## meteordevelopment.meteorclient.systems.hud.Hud.add

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/Hud.java:158`

```java
public void add(HudElementInfo<?> info, int x, int y, XAnchor xAnchor, YAnchor yAnchor)
```

## meteordevelopment.meteorclient.systems.hud.Hud.add

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/Hud.java:162`

```java
public void add(HudElementInfo<?> info, int x, int y)
```

## meteordevelopment.meteorclient.systems.hud.Hud.add

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/Hud.java:166`

```java
@SuppressWarnings({"unchecked", "rawtypes"}) public void add(HudElementInfo.@NonNull Preset preset, int x, int y, XAnchor xAnchor, YAnchor yAnchor)
```

## meteordevelopment.meteorclient.systems.hud.Hud.add

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/Hud.java:173`

```java
public void add(HudElementInfo<?>.@NonNull Preset preset, int x, int y)
```

## meteordevelopment.meteorclient.systems.hud.Hud.clear

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/Hud.java:182`

```java
public void clear()
```

## meteordevelopment.meteorclient.systems.hud.Hud.resetToDefaultElements

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/Hud.java:186`

```java
public void resetToDefaultElements()
```

## meteordevelopment.meteorclient.systems.hud.Hud.hasCustomFont

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/Hud.java:261`

```java
public boolean hasCustomFont()
```

## meteordevelopment.meteorclient.systems.hud.Hud.getTextScale

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/Hud.java:265`

```java
public double getTextScale()
```

## meteordevelopment.meteorclient.systems.hud.Hud.iterator

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/Hud.java:269`

```java
@NonNull @Override public Iterator<HudElement> iterator()
```

## meteordevelopment.meteorclient.systems.hud.Hud.toTag

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/Hud.java:277`

```java
@Override public CompoundTag toTag()
```

## meteordevelopment.meteorclient.systems.hud.Hud.fromTag

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/Hud.java:290`

```java
@Override public Hud fromTag(CompoundTag tag)
```

## meteordevelopment.meteorclient.systems.hud.HudBox

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/HudBox.java:12`

```java
public class HudBox implements ISerializable<HudBox>
```

## meteordevelopment.meteorclient.systems.hud.HudBox.xAnchor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/HudBox.java:15`

```java
public XAnchor xAnchor = XAnchor.Left
```

## meteordevelopment.meteorclient.systems.hud.HudBox.yAnchor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/HudBox.java:16`

```java
public YAnchor yAnchor = YAnchor.Top
```

## meteordevelopment.meteorclient.systems.hud.HudBox.x

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/HudBox.java:18`

```java
public int x, y
```

## meteordevelopment.meteorclient.systems.hud.HudBox.y

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/HudBox.java:18`

```java
public int x, y
```

## meteordevelopment.meteorclient.systems.hud.HudBox.HudBox

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/HudBox.java:21`

```java
public HudBox(HudElement element)
```

## meteordevelopment.meteorclient.systems.hud.HudBox.setSize

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/HudBox.java:25`

```java
public void setSize(double width, double height)
```

## meteordevelopment.meteorclient.systems.hud.HudBox.setPos

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/HudBox.java:30`

```java
public void setPos(int x, int y)
```

## meteordevelopment.meteorclient.systems.hud.HudBox.setXAnchor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/HudBox.java:35`

```java
public void setXAnchor(XAnchor anchor)
```

## meteordevelopment.meteorclient.systems.hud.HudBox.setYAnchor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/HudBox.java:49`

```java
public void setYAnchor(YAnchor anchor)
```

## meteordevelopment.meteorclient.systems.hud.HudBox.updateAnchors

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/HudBox.java:63`

```java
public void updateAnchors()
```

## meteordevelopment.meteorclient.systems.hud.HudBox.move

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/HudBox.java:68`

```java
public void move(int deltaX, int deltaY)
```

## meteordevelopment.meteorclient.systems.hud.HudBox.getXAnchor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/HudBox.java:85`

```java
public XAnchor getXAnchor(double x)
```

## meteordevelopment.meteorclient.systems.hud.HudBox.getYAnchor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/HudBox.java:96`

```java
public YAnchor getYAnchor(double y)
```

## meteordevelopment.meteorclient.systems.hud.HudBox.getRenderX

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/HudBox.java:107`

```java
public int getRenderX()
```

## meteordevelopment.meteorclient.systems.hud.HudBox.getRenderY

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/HudBox.java:115`

```java
public int getRenderY()
```

## meteordevelopment.meteorclient.systems.hud.HudBox.alignX

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/HudBox.java:123`

```java
public double alignX(double selfWidth, double width, Alignment alignment)
```

## meteordevelopment.meteorclient.systems.hud.HudBox.toTag

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/HudBox.java:139`

```java
@Override public CompoundTag toTag()
```

## meteordevelopment.meteorclient.systems.hud.HudBox.fromTag

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/HudBox.java:151`

```java
@Override public HudBox fromTag(CompoundTag tag)
```

## meteordevelopment.meteorclient.systems.hud.HudElement

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/HudElement.java:17`

```java
public abstract class HudElement implements Snapper.Element, ISerializable<HudElement>
```

## meteordevelopment.meteorclient.systems.hud.HudElement.info

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/HudElement.java:18`

```java
public final HudElementInfo<?> info
```

## meteordevelopment.meteorclient.systems.hud.HudElement.settings

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/HudElement.java:21`

```java
public final Settings settings = new Settings()
```

## meteordevelopment.meteorclient.systems.hud.HudElement.box

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/HudElement.java:22`

```java
public final HudBox box = new HudBox(this)
```

## meteordevelopment.meteorclient.systems.hud.HudElement.autoAnchors

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/HudElement.java:24`

```java
public boolean autoAnchors = true
```

## meteordevelopment.meteorclient.systems.hud.HudElement.x

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/HudElement.java:25`

```java
public int x, y
```

## meteordevelopment.meteorclient.systems.hud.HudElement.y

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/HudElement.java:25`

```java
public int x, y
```

## meteordevelopment.meteorclient.systems.hud.HudElement.HudElement

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/HudElement.java:27`

```java
public HudElement(HudElementInfo<?> info)
```

## meteordevelopment.meteorclient.systems.hud.HudElement.isActive

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/HudElement.java:32`

```java
public boolean isActive()
```

## meteordevelopment.meteorclient.systems.hud.HudElement.toggle

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/HudElement.java:36`

```java
public void toggle()
```

## meteordevelopment.meteorclient.systems.hud.HudElement.setSize

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/HudElement.java:40`

```java
public void setSize(double width, double height)
```

## meteordevelopment.meteorclient.systems.hud.HudElement.setPos

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/HudElement.java:44`

```java
@Override public void setPos(int x, int y)
```

## meteordevelopment.meteorclient.systems.hud.HudElement.move

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/HudElement.java:58`

```java
@Override public void move(int deltaX, int deltaY)
```

## meteordevelopment.meteorclient.systems.hud.HudElement.updatePos

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/HudElement.java:64`

```java
public void updatePos()
```

## meteordevelopment.meteorclient.systems.hud.HudElement.alignX

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/HudElement.java:69`

```java
protected double alignX(double width, Alignment alignment)
```

## meteordevelopment.meteorclient.systems.hud.HudElement.getX

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/HudElement.java:73`

```java
@Override public int getX()
```

## meteordevelopment.meteorclient.systems.hud.HudElement.getY

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/HudElement.java:78`

```java
@Override public int getY()
```

## meteordevelopment.meteorclient.systems.hud.HudElement.getWidth

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/HudElement.java:83`

```java
@Override public int getWidth()
```

## meteordevelopment.meteorclient.systems.hud.HudElement.getHeight

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/HudElement.java:88`

```java
@Override public int getHeight()
```

## meteordevelopment.meteorclient.systems.hud.HudElement.isInEditor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/HudElement.java:93`

```java
protected boolean isInEditor()
```

## meteordevelopment.meteorclient.systems.hud.HudElement.remove

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/HudElement.java:97`

```java
public void remove()
```

## meteordevelopment.meteorclient.systems.hud.HudElement.tick

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/HudElement.java:101`

```java
public void tick(HudRenderer renderer)
```

## meteordevelopment.meteorclient.systems.hud.HudElement.render

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/HudElement.java:104`

```java
public void render(HudRenderer renderer)
```

## meteordevelopment.meteorclient.systems.hud.HudElement.onFontChanged

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/HudElement.java:107`

```java
public void onFontChanged()
```

## meteordevelopment.meteorclient.systems.hud.HudElement.getWidget

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/HudElement.java:110`

```java
public WWidget getWidget(GuiTheme theme)
```

## meteordevelopment.meteorclient.systems.hud.HudElement.toTag

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/HudElement.java:116`

```java
@Override public CompoundTag toTag()
```

## meteordevelopment.meteorclient.systems.hud.HudElement.fromTag

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/HudElement.java:131`

```java
@Override public HudElement fromTag(CompoundTag tag)
```

## meteordevelopment.meteorclient.systems.hud.HudElementInfo

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/HudElementInfo.java:16`

```java
public class HudElementInfo<T extends HudElement>
```

## meteordevelopment.meteorclient.systems.hud.HudElementInfo.group

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/HudElementInfo.java:17`

```java
public final HudGroup group
```

## meteordevelopment.meteorclient.systems.hud.HudElementInfo.name

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/HudElementInfo.java:18`

```java
public final String name
```

## meteordevelopment.meteorclient.systems.hud.HudElementInfo.title

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/HudElementInfo.java:19`

```java
public final String title
```

## meteordevelopment.meteorclient.systems.hud.HudElementInfo.description

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/HudElementInfo.java:20`

```java
public final String description
```

## meteordevelopment.meteorclient.systems.hud.HudElementInfo.factory

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/HudElementInfo.java:22`

```java
public final Supplier<T> factory
```

## meteordevelopment.meteorclient.systems.hud.HudElementInfo.presets

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/HudElementInfo.java:23`

```java
public final List<Preset> presets
```

## meteordevelopment.meteorclient.systems.hud.HudElementInfo.HudElementInfo

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/HudElementInfo.java:25`

```java
public HudElementInfo(HudGroup group, String name, String title, String description, Supplier<T> factory)
```

## meteordevelopment.meteorclient.systems.hud.HudElementInfo.HudElementInfo

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/HudElementInfo.java:35`

```java
public HudElementInfo(HudGroup group, String name, String description, Supplier<T> factory)
```

## meteordevelopment.meteorclient.systems.hud.HudElementInfo.addPreset

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/HudElementInfo.java:39`

```java
public Preset addPreset(String title, Consumer<T> callback)
```

## meteordevelopment.meteorclient.systems.hud.HudElementInfo.hasPresets

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/HudElementInfo.java:48`

```java
public boolean hasPresets()
```

## meteordevelopment.meteorclient.systems.hud.HudElementInfo.create

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/HudElementInfo.java:52`

```java
public HudElement create()
```

## meteordevelopment.meteorclient.systems.hud.HudElementInfo.Preset

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/HudElementInfo.java:56`

```java
public class Preset
```

## meteordevelopment.meteorclient.systems.hud.HudElementInfo.Preset.info

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/HudElementInfo.java:57`

```java
public final HudElementInfo<?> info
```

## meteordevelopment.meteorclient.systems.hud.HudElementInfo.Preset.title

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/HudElementInfo.java:58`

```java
public final String title
```

## meteordevelopment.meteorclient.systems.hud.HudElementInfo.Preset.callback

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/HudElementInfo.java:59`

```java
public final Consumer<T> callback
```

## meteordevelopment.meteorclient.systems.hud.HudElementInfo.Preset.Preset

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/HudElementInfo.java:61`

```java
public Preset(HudElementInfo<?> info, String title, Consumer<T> callback)
```

## meteordevelopment.meteorclient.systems.hud.HudGroup

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/HudGroup.java:8`

```java
public record HudGroup(String title)
```

## meteordevelopment.meteorclient.systems.hud.HudRenderer

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/HudRenderer.java:40`

```java
public class HudRenderer
```

## meteordevelopment.meteorclient.systems.hud.HudRenderer.INSTANCE

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/HudRenderer.java:41`

```java
public static final HudRenderer INSTANCE = new HudRenderer()
```

## meteordevelopment.meteorclient.systems.hud.HudRenderer.graphics

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/HudRenderer.java:58`

```java
public GuiGraphicsExtractor graphics
```

## meteordevelopment.meteorclient.systems.hud.HudRenderer.delta

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/HudRenderer.java:59`

```java
public double delta
```

## meteordevelopment.meteorclient.systems.hud.HudRenderer.begin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/HudRenderer.java:65`

```java
public void begin(GuiGraphicsExtractor graphics)
```

## meteordevelopment.meteorclient.systems.hud.HudRenderer.end

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/HudRenderer.java:81`

```java
public void end()
```

## meteordevelopment.meteorclient.systems.hud.HudRenderer.line

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/HudRenderer.java:118`

```java
public void line(double x1, double y1, double x2, double y2, Color color)
```

## meteordevelopment.meteorclient.systems.hud.HudRenderer.quad

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/HudRenderer.java:122`

```java
public void quad(double x, double y, double width, double height, Color color)
```

## meteordevelopment.meteorclient.systems.hud.HudRenderer.quad

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/HudRenderer.java:126`

```java
public void quad(double x, double y, double width, double height, Color cTopLeft, Color cTopRight, Color cBottomRight, Color cBottomLeft)
```

## meteordevelopment.meteorclient.systems.hud.HudRenderer.triangle

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/HudRenderer.java:130`

```java
public void triangle(double x1, double y1, double x2, double y2, double x3, double y3, Color color)
```

## meteordevelopment.meteorclient.systems.hud.HudRenderer.texture

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/HudRenderer.java:134`

```java
public void texture(Identifier id, double x, double y, double width, double height, Color color)
```

## meteordevelopment.meteorclient.systems.hud.HudRenderer.text

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/HudRenderer.java:140`

```java
public double text(String text, double x, double y, Color color, boolean shadow, double scale)
```

## meteordevelopment.meteorclient.systems.hud.HudRenderer.text

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/HudRenderer.java:170`

```java
public double text(String text, double x, double y, Color color, boolean shadow)
```

## meteordevelopment.meteorclient.systems.hud.HudRenderer.textWidth

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/HudRenderer.java:174`

```java
public double textWidth(String text, boolean shadow, double scale)
```

## meteordevelopment.meteorclient.systems.hud.HudRenderer.textWidth

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/HudRenderer.java:186`

```java
public double textWidth(String text, boolean shadow)
```

## meteordevelopment.meteorclient.systems.hud.HudRenderer.textWidth

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/HudRenderer.java:190`

```java
public double textWidth(String text, double scale)
```

## meteordevelopment.meteorclient.systems.hud.HudRenderer.textWidth

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/HudRenderer.java:194`

```java
public double textWidth(String text)
```

## meteordevelopment.meteorclient.systems.hud.HudRenderer.textHeight

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/HudRenderer.java:198`

```java
public double textHeight(boolean shadow, double scale)
```

## meteordevelopment.meteorclient.systems.hud.HudRenderer.textHeight

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/HudRenderer.java:208`

```java
public double textHeight(boolean shadow)
```

## meteordevelopment.meteorclient.systems.hud.HudRenderer.textHeight

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/HudRenderer.java:212`

```java
public double textHeight()
```

## meteordevelopment.meteorclient.systems.hud.HudRenderer.post

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/HudRenderer.java:216`

```java
public void post(Runnable task)
```

## meteordevelopment.meteorclient.systems.hud.HudRenderer.item

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/HudRenderer.java:220`

```java
public void item(ItemStack itemStack, int x, int y, float scale, boolean overlay, String countOverlay)
```

## meteordevelopment.meteorclient.systems.hud.HudRenderer.item

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/HudRenderer.java:224`

```java
public void item(ItemStack itemStack, int x, int y, float scale, boolean overlay)
```

## meteordevelopment.meteorclient.systems.hud.HudRenderer.entity

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/HudRenderer.java:228`

```java
public void entity(LivingEntity entity, int x, int y, int width, int height, float yaw, float pitch)
```

## meteordevelopment.meteorclient.systems.hud.XAnchor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/XAnchor.java:8`

```java
public enum XAnchor
```

## meteordevelopment.meteorclient.systems.hud.YAnchor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/YAnchor.java:8`

```java
public enum YAnchor
```

## meteordevelopment.meteorclient.systems.hud.elements.ActiveModulesHud

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/ActiveModulesHud.java:18`

```java
public class ActiveModulesHud extends HudElement
```

## meteordevelopment.meteorclient.systems.hud.elements.ActiveModulesHud.INFO

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/ActiveModulesHud.java:19`

```java
public static final HudElementInfo<ActiveModulesHud> INFO = new HudElementInfo<>(Hud.GROUP, "active-modules", "Displays your active modules.", ActiveModulesHud::new)
```

## meteordevelopment.meteorclient.systems.hud.elements.ActiveModulesHud.ActiveModulesHud

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/ActiveModulesHud.java:196`

```java
public ActiveModulesHud()
```

## meteordevelopment.meteorclient.systems.hud.elements.ActiveModulesHud.tick

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/ActiveModulesHud.java:200`

```java
@Override public void tick(HudRenderer renderer)
```

## meteordevelopment.meteorclient.systems.hud.elements.ActiveModulesHud.render

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/ActiveModulesHud.java:232`

```java
@Override public void render(HudRenderer renderer)
```

## meteordevelopment.meteorclient.systems.hud.elements.ActiveModulesHud.Sort

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/ActiveModulesHud.java:362`

```java
public enum Sort
```

## meteordevelopment.meteorclient.systems.hud.elements.ActiveModulesHud.ColorMode

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/ActiveModulesHud.java:368`

```java
public enum ColorMode
```

## meteordevelopment.meteorclient.systems.hud.elements.ActiveModulesHud.Background

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/ActiveModulesHud.java:374`

```java
public enum Background
```

## meteordevelopment.meteorclient.systems.hud.elements.ArmorHud

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/ArmorHud.java:22`

```java
public class ArmorHud extends HudElement
```

## meteordevelopment.meteorclient.systems.hud.elements.ArmorHud.INFO

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/ArmorHud.java:23`

```java
public static final HudElementInfo<ArmorHud> INFO = new HudElementInfo<>(Hud.GROUP, "armor", "Displays your armor.", ArmorHud::new)
```

## meteordevelopment.meteorclient.systems.hud.elements.ArmorHud.ArmorHud

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/ArmorHud.java:118`

```java
public ArmorHud()
```

## meteordevelopment.meteorclient.systems.hud.elements.ArmorHud.render

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/ArmorHud.java:132`

```java
@Override public void render(HudRenderer renderer)
```

## meteordevelopment.meteorclient.systems.hud.elements.ArmorHud.Durability

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/ArmorHud.java:210`

```java
public enum Durability
```

## meteordevelopment.meteorclient.systems.hud.elements.ArmorHud.Orientation

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/ArmorHud.java:217`

```java
public enum Orientation
```

## meteordevelopment.meteorclient.systems.hud.elements.CombatHud

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/CombatHud.java:50`

```java
public class CombatHud extends HudElement
```

## meteordevelopment.meteorclient.systems.hud.elements.CombatHud.INFO

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/CombatHud.java:55`

```java
public static final HudElementInfo<CombatHud> INFO = new HudElementInfo<>(Hud.GROUP, "combat", "Displays information about your combat target.", CombatHud::new)
```

## meteordevelopment.meteorclient.systems.hud.elements.CombatHud.customScale

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/CombatHud.java:181`

```java
public final Setting<Boolean> customScale = sgScale.add(new BoolSetting.Builder() .name("custom-scale") .description("Applies a custom scale to this hud element.") .defaultValue(false) .onChanged(_ -> calculateSize()) .build() )
```

## meteordevelopment.meteorclient.systems.hud.elements.CombatHud.scale

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/CombatHud.java:189`

```java
public final Setting<Double> scale = sgScale.add(new DoubleSetting.Builder() .name("scale") .description("Custom scale.") .visible(customScale::get) .defaultValue(2) .onChanged(_ -> calculateSize()) .min(0.5) .sliderRange(0.5, 3) .build() )
```

## meteordevelopment.meteorclient.systems.hud.elements.CombatHud.background

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/CombatHud.java:202`

```java
public final Setting<Boolean> background = sgBackground.add(new BoolSetting.Builder() .name("background") .description("Displays background.") .defaultValue(false) .build() )
```

## meteordevelopment.meteorclient.systems.hud.elements.CombatHud.backgroundColor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/CombatHud.java:209`

```java
public final Setting<SettingColor> backgroundColor = sgBackground.add(new ColorSetting.Builder() .name("background-color") .description("Color used for the background.") .visible(background::get) .defaultValue(new SettingColor(25, 25, 25, 50)) .build() )
```

## meteordevelopment.meteorclient.systems.hud.elements.CombatHud.CombatHud

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/CombatHud.java:219`

```java
public CombatHud()
```

## meteordevelopment.meteorclient.systems.hud.elements.CombatHud.render

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/CombatHud.java:229`

```java
@Override public void render(HudRenderer renderer)
```

## meteordevelopment.meteorclient.systems.hud.elements.CompassHud

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/CompassHud.java:18`

```java
public class CompassHud extends HudElement
```

## meteordevelopment.meteorclient.systems.hud.elements.CompassHud.INFO

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/CompassHud.java:19`

```java
public static final HudElementInfo<CompassHud> INFO = new HudElementInfo<>(Hud.GROUP, "compass", "Displays a compass.", CompassHud::new)
```

## meteordevelopment.meteorclient.systems.hud.elements.CompassHud.CompassHud

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/CompassHud.java:103`

```java
public CompassHud()
```

## meteordevelopment.meteorclient.systems.hud.elements.CompassHud.render

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/CompassHud.java:113`

```java
@Override public void render(HudRenderer renderer)
```

## meteordevelopment.meteorclient.systems.hud.elements.CompassHud.Mode

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/CompassHud.java:179`

```java
public enum Mode
```

## meteordevelopment.meteorclient.systems.hud.elements.HoleHud

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/HoleHud.java:27`

```java
public class HoleHud extends HudElement
```

## meteordevelopment.meteorclient.systems.hud.elements.HoleHud.INFO

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/HoleHud.java:28`

```java
public static final HudElementInfo<HoleHud> INFO = new HudElementInfo<>(Hud.GROUP, "hole", "Displays information about the hole you are standing in.", HoleHud::new)
```

## meteordevelopment.meteorclient.systems.hud.elements.HoleHud.safe

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/HoleHud.java:36`

```java
public final Setting<List<Block>> safe = sgGeneral.add(new BlockListSetting.Builder() .name("safe-blocks") .description("Which blocks to consider safe.") .defaultValue(Blocks.OBSIDIAN, Blocks.BEDROCK, Blocks.CRYING_OBSIDIAN, Blocks.NETHERITE_BLOCK) .build() )
```

## meteordevelopment.meteorclient.systems.hud.elements.HoleHud.customScale

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/HoleHud.java:45`

```java
public final Setting<Boolean> customScale = sgScale.add(new BoolSetting.Builder() .name("custom-scale") .description("Applies a custom scale to this hud element.") .defaultValue(false) .onChanged(_ -> calculateSize()) .build() )
```

## meteordevelopment.meteorclient.systems.hud.elements.HoleHud.scale

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/HoleHud.java:53`

```java
public final Setting<Double> scale = sgScale.add(new DoubleSetting.Builder() .name("scale") .description("Custom scale.") .visible(customScale::get) .defaultValue(2) .onChanged(_ -> calculateSize()) .min(0.5) .sliderRange(0.5, 3) .build() )
```

## meteordevelopment.meteorclient.systems.hud.elements.HoleHud.background

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/HoleHud.java:66`

```java
public final Setting<Boolean> background = sgBackground.add(new BoolSetting.Builder() .name("background") .description("Displays background.") .defaultValue(false) .build() )
```

## meteordevelopment.meteorclient.systems.hud.elements.HoleHud.backgroundColor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/HoleHud.java:73`

```java
public final Setting<SettingColor> backgroundColor = sgBackground.add(new ColorSetting.Builder() .name("background-color") .description("Color used for the background.") .visible(background::get) .defaultValue(new SettingColor(25, 25, 25, 50)) .build() )
```

## meteordevelopment.meteorclient.systems.hud.elements.HoleHud.HoleHud

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/HoleHud.java:84`

```java
public HoleHud()
```

## meteordevelopment.meteorclient.systems.hud.elements.HoleHud.render

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/HoleHud.java:94`

```java
@Override public void render(HudRenderer renderer)
```

## meteordevelopment.meteorclient.systems.hud.elements.InventoryHud

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/InventoryHud.java:24`

```java
public class InventoryHud extends HudElement
```

## meteordevelopment.meteorclient.systems.hud.elements.InventoryHud.INFO

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/InventoryHud.java:25`

```java
public static final HudElementInfo<InventoryHud> INFO = new HudElementInfo<>(Hud.GROUP, "inventory", "Displays your inventory.", InventoryHud::new)
```

## meteordevelopment.meteorclient.systems.hud.elements.InventoryHud.customScale

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/InventoryHud.java:43`

```java
public final Setting<Boolean> customScale = sgScale.add(new BoolSetting.Builder() .name("custom-scale") .description("Applies a custom scale to this hud element.") .defaultValue(false) .onChanged(_ -> calculateSize()) .build() )
```

## meteordevelopment.meteorclient.systems.hud.elements.InventoryHud.scale

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/InventoryHud.java:51`

```java
public final Setting<Double> scale = sgScale.add(new DoubleSetting.Builder() .name("scale") .description("Custom scale.") .visible(customScale::get) .defaultValue(2) .onChanged(_ -> calculateSize()) .min(0.5) .sliderRange(0.5, 3) .build() )
```

## meteordevelopment.meteorclient.systems.hud.elements.InventoryHud.backgroundColor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/InventoryHud.java:72`

```java
public final Setting<SettingColor> backgroundColor = sgBackground.add(new ColorSetting.Builder() .name("background-color") .description("Color used for the background.") .visible(() -> background.get() != Background.None) .defaultValue(new SettingColor(255, 255, 255)) .build() )
```

## meteordevelopment.meteorclient.systems.hud.elements.InventoryHud.render

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/InventoryHud.java:94`

```java
@Override public void render(HudRenderer renderer)
```

## meteordevelopment.meteorclient.systems.hud.elements.InventoryHud.Background

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/InventoryHud.java:161`

```java
public enum Background
```

## meteordevelopment.meteorclient.systems.hud.elements.ItemHud

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/ItemHud.java:21`

```java
public class ItemHud extends HudElement
```

## meteordevelopment.meteorclient.systems.hud.elements.ItemHud.INFO

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/ItemHud.java:22`

```java
public static final HudElementInfo<ItemHud> INFO = new HudElementInfo<>(Hud.GROUP, "item", "Displays the item count.", ItemHud::new)
```

## meteordevelopment.meteorclient.systems.hud.elements.ItemHud.customScale

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/ItemHud.java:46`

```java
public final Setting<Boolean> customScale = sgScale.add(new BoolSetting.Builder() .name("custom-scale") .description("Applies a custom scale to this hud element.") .defaultValue(false) .onChanged(_ -> calculateSize()) .build() )
```

## meteordevelopment.meteorclient.systems.hud.elements.ItemHud.scale

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/ItemHud.java:54`

```java
public final Setting<Double> scale = sgScale.add(new DoubleSetting.Builder() .name("scale") .description("Custom scale.") .visible(customScale::get) .defaultValue(2) .onChanged(_ -> calculateSize()) .min(0.5) .sliderRange(0.5, 3) .build() )
```

## meteordevelopment.meteorclient.systems.hud.elements.ItemHud.background

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/ItemHud.java:67`

```java
public final Setting<Boolean> background = sgBackground.add(new BoolSetting.Builder() .name("background") .description("Displays background.") .defaultValue(false) .build() )
```

## meteordevelopment.meteorclient.systems.hud.elements.ItemHud.backgroundColor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/ItemHud.java:74`

```java
public final Setting<SettingColor> backgroundColor = sgBackground.add(new ColorSetting.Builder() .name("background-color") .description("Color used for the background.") .visible(background::get) .defaultValue(new SettingColor(25, 25, 25, 50)) .build() )
```

## meteordevelopment.meteorclient.systems.hud.elements.ItemHud.render

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/ItemHud.java:92`

```java
@Override public void render(HudRenderer renderer)
```

## meteordevelopment.meteorclient.systems.hud.elements.ItemHud.NoneMode

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/ItemHud.java:135`

```java
public enum NoneMode
```

## meteordevelopment.meteorclient.systems.hud.elements.ItemHud.NoneMode.toString

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/ItemHud.java:140`

```java
@Override public String toString()
```

## meteordevelopment.meteorclient.systems.hud.elements.LagNotifierHud

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/LagNotifierHud.java:17`

```java
public class LagNotifierHud extends HudElement
```

## meteordevelopment.meteorclient.systems.hud.elements.LagNotifierHud.INFO

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/LagNotifierHud.java:18`

```java
public static final HudElementInfo<LagNotifierHud> INFO = new HudElementInfo<>(Hud.GROUP, "lag-notifier", "Displays if the server is lagging in ticks.", LagNotifierHud::new)
```

## meteordevelopment.meteorclient.systems.hud.elements.LagNotifierHud.LagNotifierHud

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/LagNotifierHud.java:97`

```java
public LagNotifierHud()
```

## meteordevelopment.meteorclient.systems.hud.elements.LagNotifierHud.render

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/LagNotifierHud.java:101`

```java
@Override public void render(HudRenderer renderer)
```

## meteordevelopment.meteorclient.systems.hud.elements.MapHud

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/MapHud.java:30`

```java
public class MapHud extends HudElement
```

## meteordevelopment.meteorclient.systems.hud.elements.MapHud.INFO

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/MapHud.java:31`

```java
public static final HudElementInfo<MapHud> INFO = new HudElementInfo<>(Hud.GROUP, "map", "Displays the contents of a map on your Hud.", MapHud::new)
```

## meteordevelopment.meteorclient.systems.hud.elements.MapHud.MapHud

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/MapHud.java:93`

```java
public MapHud()
```

## meteordevelopment.meteorclient.systems.hud.elements.MapHud.tick

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/MapHud.java:97`

```java
@Override public void tick(HudRenderer renderer)
```

## meteordevelopment.meteorclient.systems.hud.elements.MapHud.render

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/MapHud.java:134`

```java
@Override public void render(HudRenderer renderer)
```

## meteordevelopment.meteorclient.systems.hud.elements.MeteorTextHud

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/MeteorTextHud.java:11`

```java
public class MeteorTextHud
```

## meteordevelopment.meteorclient.systems.hud.elements.MeteorTextHud.INFO

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/MeteorTextHud.java:12`

```java
public static final HudElementInfo<TextHud> INFO = new HudElementInfo<>(Hud.GROUP, "text", "Displays arbitrary text with Starscript.", MeteorTextHud::create)
```

## meteordevelopment.meteorclient.systems.hud.elements.MeteorTextHud.FPS

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/MeteorTextHud.java:14`

```java
public static final HudElementInfo<TextHud>.Preset FPS
```

## meteordevelopment.meteorclient.systems.hud.elements.MeteorTextHud.TPS

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/MeteorTextHud.java:15`

```java
public static final HudElementInfo<TextHud>.Preset TPS
```

## meteordevelopment.meteorclient.systems.hud.elements.MeteorTextHud.PING

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/MeteorTextHud.java:16`

```java
public static final HudElementInfo<TextHud>.Preset PING
```

## meteordevelopment.meteorclient.systems.hud.elements.MeteorTextHud.SPEED

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/MeteorTextHud.java:17`

```java
public static final HudElementInfo<TextHud>.Preset SPEED
```

## meteordevelopment.meteorclient.systems.hud.elements.MeteorTextHud.GAME_MODE

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/MeteorTextHud.java:18`

```java
public static final HudElementInfo<TextHud>.Preset GAME_MODE
```

## meteordevelopment.meteorclient.systems.hud.elements.MeteorTextHud.DURABILITY

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/MeteorTextHud.java:19`

```java
public static final HudElementInfo<TextHud>.Preset DURABILITY
```

## meteordevelopment.meteorclient.systems.hud.elements.MeteorTextHud.POSITION

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/MeteorTextHud.java:20`

```java
public static final HudElementInfo<TextHud>.Preset POSITION
```

## meteordevelopment.meteorclient.systems.hud.elements.MeteorTextHud.OPPOSITE_POSITION

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/MeteorTextHud.java:21`

```java
public static final HudElementInfo<TextHud>.Preset OPPOSITE_POSITION
```

## meteordevelopment.meteorclient.systems.hud.elements.MeteorTextHud.LOOKING_AT

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/MeteorTextHud.java:22`

```java
public static final HudElementInfo<TextHud>.Preset LOOKING_AT
```

## meteordevelopment.meteorclient.systems.hud.elements.MeteorTextHud.LOOKING_AT_WITH_POSITION

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/MeteorTextHud.java:23`

```java
public static final HudElementInfo<TextHud>.Preset LOOKING_AT_WITH_POSITION
```

## meteordevelopment.meteorclient.systems.hud.elements.MeteorTextHud.BREAKING_PROGRESS

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/MeteorTextHud.java:24`

```java
public static final HudElementInfo<TextHud>.Preset BREAKING_PROGRESS
```

## meteordevelopment.meteorclient.systems.hud.elements.MeteorTextHud.SERVER

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/MeteorTextHud.java:25`

```java
public static final HudElementInfo<TextHud>.Preset SERVER
```

## meteordevelopment.meteorclient.systems.hud.elements.MeteorTextHud.WEATHER

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/MeteorTextHud.java:26`

```java
public static final HudElementInfo<TextHud>.Preset WEATHER
```

## meteordevelopment.meteorclient.systems.hud.elements.MeteorTextHud.BIOME

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/MeteorTextHud.java:27`

```java
public static final HudElementInfo<TextHud>.Preset BIOME
```

## meteordevelopment.meteorclient.systems.hud.elements.MeteorTextHud.WORLD_TIME

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/MeteorTextHud.java:28`

```java
public static final HudElementInfo<TextHud>.Preset WORLD_TIME
```

## meteordevelopment.meteorclient.systems.hud.elements.MeteorTextHud.REAL_TIME

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/MeteorTextHud.java:29`

```java
public static final HudElementInfo<TextHud>.Preset REAL_TIME
```

## meteordevelopment.meteorclient.systems.hud.elements.MeteorTextHud.ROTATION

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/MeteorTextHud.java:30`

```java
public static final HudElementInfo<TextHud>.Preset ROTATION
```

## meteordevelopment.meteorclient.systems.hud.elements.MeteorTextHud.MODULE_ENABLED

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/MeteorTextHud.java:31`

```java
public static final HudElementInfo<TextHud>.Preset MODULE_ENABLED
```

## meteordevelopment.meteorclient.systems.hud.elements.MeteorTextHud.MODULE_ENABLED_WITH_INFO

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/MeteorTextHud.java:32`

```java
public static final HudElementInfo<TextHud>.Preset MODULE_ENABLED_WITH_INFO
```

## meteordevelopment.meteorclient.systems.hud.elements.MeteorTextHud.WATERMARK

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/MeteorTextHud.java:33`

```java
public static final HudElementInfo<TextHud>.Preset WATERMARK
```

## meteordevelopment.meteorclient.systems.hud.elements.MeteorTextHud.BARITONE

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/MeteorTextHud.java:34`

```java
public static final HudElementInfo<TextHud>.Preset BARITONE
```

## meteordevelopment.meteorclient.systems.hud.elements.ModuleInfosHud

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/ModuleInfosHud.java:17`

```java
public class ModuleInfosHud extends HudElement
```

## meteordevelopment.meteorclient.systems.hud.elements.ModuleInfosHud.INFO

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/ModuleInfosHud.java:18`

```java
public static final HudElementInfo<ModuleInfosHud> INFO = new HudElementInfo<>(Hud.GROUP, "module-infos", "Displays if selected modules are enabled or disabled.", ModuleInfosHud::new)
```

## meteordevelopment.meteorclient.systems.hud.elements.ModuleInfosHud.ModuleInfosHud

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/ModuleInfosHud.java:71`

```java
public ModuleInfosHud()
```

## meteordevelopment.meteorclient.systems.hud.elements.ModuleInfosHud.render

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/ModuleInfosHud.java:75`

```java
@Override public void render(HudRenderer renderer)
```

## meteordevelopment.meteorclient.systems.hud.elements.PlayerModelHud

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/PlayerModelHud.java:20`

```java
public class PlayerModelHud extends HudElement
```

## meteordevelopment.meteorclient.systems.hud.elements.PlayerModelHud.INFO

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/PlayerModelHud.java:21`

```java
public static final HudElementInfo<PlayerModelHud> INFO = new HudElementInfo<>(Hud.GROUP, "player-model", "Displays a model of your player.", PlayerModelHud::new)
```

## meteordevelopment.meteorclient.systems.hud.elements.PlayerModelHud.customScale

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/PlayerModelHud.java:71`

```java
public final Setting<Boolean> customScale = sgScale.add(new BoolSetting.Builder() .name("custom-scale") .description("Applies a custom scale to this hud element.") .defaultValue(false) .onChanged(_ -> calculateSize()) .build() )
```

## meteordevelopment.meteorclient.systems.hud.elements.PlayerModelHud.scale

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/PlayerModelHud.java:79`

```java
public final Setting<Double> scale = sgScale.add(new DoubleSetting.Builder() .name("scale") .description("Custom scale.") .visible(customScale::get) .defaultValue(2) .onChanged(_ -> calculateSize()) .min(0.5) .sliderRange(0.5, 3) .build() )
```

## meteordevelopment.meteorclient.systems.hud.elements.PlayerModelHud.PlayerModelHud

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/PlayerModelHud.java:107`

```java
public PlayerModelHud()
```

## meteordevelopment.meteorclient.systems.hud.elements.PlayerModelHud.render

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/PlayerModelHud.java:113`

```java
@Override public void render(HudRenderer renderer)
```

## meteordevelopment.meteorclient.systems.hud.elements.PlayerRadarHud

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/PlayerRadarHud.java:23`

```java
public class PlayerRadarHud extends HudElement
```

## meteordevelopment.meteorclient.systems.hud.elements.PlayerRadarHud.INFO

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/PlayerRadarHud.java:24`

```java
public static final HudElementInfo<PlayerRadarHud> INFO = new HudElementInfo<>(Hud.GROUP, "player-radar", "Displays players in your visual range.", PlayerRadarHud::new)
```

## meteordevelopment.meteorclient.systems.hud.elements.PlayerRadarHud.PlayerRadarHud

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/PlayerRadarHud.java:128`

```java
public PlayerRadarHud()
```

## meteordevelopment.meteorclient.systems.hud.elements.PlayerRadarHud.setSize

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/PlayerRadarHud.java:132`

```java
@Override public void setSize(double width, double height)
```

## meteordevelopment.meteorclient.systems.hud.elements.PlayerRadarHud.alignX

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/PlayerRadarHud.java:137`

```java
@Override protected double alignX(double width, Alignment alignment)
```

## meteordevelopment.meteorclient.systems.hud.elements.PlayerRadarHud.tick

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/PlayerRadarHud.java:142`

```java
@Override public void tick(HudRenderer renderer)
```

## meteordevelopment.meteorclient.systems.hud.elements.PlayerRadarHud.render

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/PlayerRadarHud.java:166`

```java
@Override public void render(HudRenderer renderer)
```

## meteordevelopment.meteorclient.systems.hud.elements.PotionTimersHud

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/PotionTimersHud.java:24`

```java
public class PotionTimersHud extends HudElement
```

## meteordevelopment.meteorclient.systems.hud.elements.PotionTimersHud.INFO

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/PotionTimersHud.java:25`

```java
public static final HudElementInfo<PotionTimersHud> INFO = new HudElementInfo<>(Hud.GROUP, "potion-timers", "Displays active potion effects with timers.", PotionTimersHud::new)
```

## meteordevelopment.meteorclient.systems.hud.elements.PotionTimersHud.PotionTimersHud

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/PotionTimersHud.java:161`

```java
public PotionTimersHud()
```

## meteordevelopment.meteorclient.systems.hud.elements.PotionTimersHud.setSize

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/PotionTimersHud.java:165`

```java
@Override public void setSize(double width, double height)
```

## meteordevelopment.meteorclient.systems.hud.elements.PotionTimersHud.alignX

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/PotionTimersHud.java:170`

```java
@Override protected double alignX(double width, Alignment alignment)
```

## meteordevelopment.meteorclient.systems.hud.elements.PotionTimersHud.tick

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/PotionTimersHud.java:175`

```java
@Override public void tick(HudRenderer renderer)
```

## meteordevelopment.meteorclient.systems.hud.elements.PotionTimersHud.render

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/PotionTimersHud.java:199`

```java
@Override public void render(HudRenderer renderer)
```

## meteordevelopment.meteorclient.systems.hud.elements.PotionTimersHud.ColorMode

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/PotionTimersHud.java:261`

```java
public enum ColorMode
```

## meteordevelopment.meteorclient.systems.hud.elements.TextHud

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/TextHud.java:26`

```java
public class TextHud extends HudElement
```

## meteordevelopment.meteorclient.systems.hud.elements.TextHud.text

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/TextHud.java:41`

```java
public final Setting<String> text = sgGeneral.add(new StringSetting.Builder() .name("text") .description("Text to display with Starscript.") .defaultValue(MeteorClient.NAME) .onChanged(_ -> recompile()) .wide() .renderer(StarscriptTextBoxRenderer.class) .build() )
```

## meteordevelopment.meteorclient.systems.hud.elements.TextHud.updateDelay

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/TextHud.java:51`

```java
public final Setting<Integer> updateDelay = sgGeneral.add(new IntSetting.Builder() .name("update-delay") .description("Update delay in ticks") .defaultValue(4) .onChanged(integer -> { if (timer > integer) timer = integer; }) .min(0) .build() )
```

## meteordevelopment.meteorclient.systems.hud.elements.TextHud.shadow

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/TextHud.java:62`

```java
public final Setting<Boolean> shadow = sgGeneral.add(new BoolSetting.Builder() .name("shadow") .description("Renders shadow behind text.") .defaultValue(true) .onChanged(_ -> recalculateSize = true) .build() )
```

## meteordevelopment.meteorclient.systems.hud.elements.TextHud.border

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/TextHud.java:70`

```java
public final Setting<Integer> border = sgGeneral.add(new IntSetting.Builder() .name("border") .description("How much space to add around the text.") .defaultValue(0) .onChanged(integer -> super.setSize(originalWidth + integer * 2, originalHeight + integer * 2)) .build() )
```

## meteordevelopment.meteorclient.systems.hud.elements.TextHud.shown

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/TextHud.java:80`

```java
public final Setting<Shown> shown = sgShown.add(new EnumSetting.Builder<Shown>() .name("shown") .description("When this text element is shown.") .defaultValue(Shown.Always) .onChanged(_ -> recompile()) .build() )
```

## meteordevelopment.meteorclient.systems.hud.elements.TextHud.condition

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/TextHud.java:88`

```java
public final Setting<String> condition = sgShown.add(new StringSetting.Builder() .name("condition") .description("Condition to check when shown is not Always.") .visible(() -> shown.get() != Shown.Always) .onChanged(_ -> recompile()) .renderer(StarscriptTextBoxRenderer.class) .build() )
```

## meteordevelopment.meteorclient.systems.hud.elements.TextHud.customScale

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/TextHud.java:99`

```java
public final Setting<Boolean> customScale = sgScale.add(new BoolSetting.Builder() .name("custom-scale") .description("Applies a custom scale to this hud element.") .defaultValue(false) .onChanged(_ -> recalculateSize = true) .build() )
```

## meteordevelopment.meteorclient.systems.hud.elements.TextHud.scale

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/TextHud.java:107`

```java
public final Setting<Double> scale = sgScale.add(new DoubleSetting.Builder() .name("scale") .description("Custom scale.") .visible(customScale::get) .defaultValue(1) .onChanged(_ -> recalculateSize = true) .min(0.5) .sliderRange(0.5, 3) .build() )
```

## meteordevelopment.meteorclient.systems.hud.elements.TextHud.background

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/TextHud.java:120`

```java
public final Setting<Boolean> background = sgBackground.add(new BoolSetting.Builder() .name("background") .description("Displays background.") .defaultValue(false) .build() )
```

## meteordevelopment.meteorclient.systems.hud.elements.TextHud.backgroundColor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/TextHud.java:127`

```java
public final Setting<SettingColor> backgroundColor = sgBackground.add(new ColorSetting.Builder() .name("background-color") .description("Color used for the background.") .visible(background::get) .defaultValue(new SettingColor(25, 25, 25, 50)) .build() )
```

## meteordevelopment.meteorclient.systems.hud.elements.TextHud.TextHud

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/TextHud.java:142`

```java
public TextHud(HudElementInfo<TextHud> info)
```

## meteordevelopment.meteorclient.systems.hud.elements.TextHud.setSize

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/TextHud.java:153`

```java
@Override public void setSize(double width, double height)
```

## meteordevelopment.meteorclient.systems.hud.elements.TextHud.tick

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/TextHud.java:177`

```java
@Override public void tick(HudRenderer renderer)
```

## meteordevelopment.meteorclient.systems.hud.elements.TextHud.render

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/TextHud.java:227`

```java
@Override public void render(HudRenderer renderer)
```

## meteordevelopment.meteorclient.systems.hud.elements.TextHud.onFontChanged

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/TextHud.java:253`

```java
@Override public void onFontChanged()
```

## meteordevelopment.meteorclient.systems.hud.elements.TextHud.getSectionColor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/TextHud.java:262`

```java
public static Color getSectionColor(int i)
```

## meteordevelopment.meteorclient.systems.hud.elements.TextHud.Shown

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/TextHud.java:267`

```java
public enum Shown
```

## meteordevelopment.meteorclient.systems.hud.elements.TextHud.Shown.toString

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/TextHud.java:272`

```java
@Override public String toString()
```

## meteordevelopment.meteorclient.systems.hud.elements.keyboard.KeyDimensions.units

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/keyboard/KeyDimensions.java:19`

```java
public final double units
```

## meteordevelopment.meteorclient.systems.hud.elements.keyboard.KeyDimensions.toPixels

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/keyboard/KeyDimensions.java:29`

```java
public double toPixels(double baseUnit, double gap)
```

## meteordevelopment.meteorclient.systems.hud.elements.keyboard.KeyDimensions.toPixels

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/keyboard/KeyDimensions.java:33`

```java
public double toPixels(double baseUnit)
```

## meteordevelopment.meteorclient.systems.hud.elements.keyboard.KeyDimensions.STANDARD

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/keyboard/KeyDimensions.java:38`

```java
public static final KeyDimensions STANDARD = UNIT_1U
```

## meteordevelopment.meteorclient.systems.hud.elements.keyboard.KeyDimensions.TAB

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/keyboard/KeyDimensions.java:39`

```java
public static final KeyDimensions TAB = UNIT_1_5U
```

## meteordevelopment.meteorclient.systems.hud.elements.keyboard.KeyDimensions.CAPS_LOCK

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/keyboard/KeyDimensions.java:40`

```java
public static final KeyDimensions CAPS_LOCK = UNIT_1_75U
```

## meteordevelopment.meteorclient.systems.hud.elements.keyboard.KeyDimensions.ENTER_ANSI

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/keyboard/KeyDimensions.java:41`

```java
public static final KeyDimensions ENTER_ANSI = UNIT_2_25U
```

## meteordevelopment.meteorclient.systems.hud.elements.keyboard.KeyDimensions.LEFT_SHIFT_ANSI

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/keyboard/KeyDimensions.java:42`

```java
public static final KeyDimensions LEFT_SHIFT_ANSI = UNIT_2_25U
```

## meteordevelopment.meteorclient.systems.hud.elements.keyboard.KeyDimensions.RIGHT_SHIFT

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/keyboard/KeyDimensions.java:43`

```java
public static final KeyDimensions RIGHT_SHIFT = UNIT_2_75U
```

## meteordevelopment.meteorclient.systems.hud.elements.keyboard.KeyDimensions.BACKSPACE

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/keyboard/KeyDimensions.java:44`

```java
public static final KeyDimensions BACKSPACE = UNIT_2U
```

## meteordevelopment.meteorclient.systems.hud.elements.keyboard.KeyDimensions.LEFT_SHIFT_ISO

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/keyboard/KeyDimensions.java:45`

```java
public static final KeyDimensions LEFT_SHIFT_ISO = UNIT_1_25U
```

## meteordevelopment.meteorclient.systems.hud.elements.keyboard.KeyDimensions.ENTER_ISO_WIDTH

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/keyboard/KeyDimensions.java:46`

```java
public static final KeyDimensions ENTER_ISO_WIDTH = UNIT_1_25U
```

## meteordevelopment.meteorclient.systems.hud.elements.keyboard.KeyDimensions.ENTER_ISO_HEIGHT

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/keyboard/KeyDimensions.java:47`

```java
public static final KeyDimensions ENTER_ISO_HEIGHT = UNIT_2U
```

## meteordevelopment.meteorclient.systems.hud.elements.keyboard.KeyDimensions.CTRL

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/keyboard/KeyDimensions.java:48`

```java
public static final KeyDimensions CTRL = UNIT_1_25U
```

## meteordevelopment.meteorclient.systems.hud.elements.keyboard.KeyDimensions.ALT

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/keyboard/KeyDimensions.java:49`

```java
public static final KeyDimensions ALT = UNIT_1_25U
```

## meteordevelopment.meteorclient.systems.hud.elements.keyboard.KeyDimensions.GUI

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/keyboard/KeyDimensions.java:50`

```java
public static final KeyDimensions GUI = UNIT_1_25U
```

## meteordevelopment.meteorclient.systems.hud.elements.keyboard.KeyDimensions.MENU

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/keyboard/KeyDimensions.java:51`

```java
public static final KeyDimensions MENU = UNIT_1_25U
```

## meteordevelopment.meteorclient.systems.hud.elements.keyboard.KeyDimensions.SPACEBAR

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/keyboard/KeyDimensions.java:52`

```java
public static final KeyDimensions SPACEBAR = UNIT_6_25U
```

## meteordevelopment.meteorclient.systems.hud.elements.keyboard.KeyboardHud

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/keyboard/KeyboardHud.java:51`

```java
public class KeyboardHud extends HudElement
```

## meteordevelopment.meteorclient.systems.hud.elements.keyboard.KeyboardHud.INFO

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/keyboard/KeyboardHud.java:52`

```java
public static final HudElementInfo<KeyboardHud> INFO = new HudElementInfo<>(Hud.GROUP, "keyboard", "Displays pressed keys.", KeyboardHud::new)
```

## meteordevelopment.meteorclient.systems.hud.elements.keyboard.KeyboardHud.Alignment

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/keyboard/KeyboardHud.java:54`

```java
public enum Alignment
```

## meteordevelopment.meteorclient.systems.hud.elements.keyboard.KeyboardHud.KeyboardHud

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/keyboard/KeyboardHud.java:279`

```java
public KeyboardHud()
```

## meteordevelopment.meteorclient.systems.hud.elements.keyboard.KeyboardHud.render

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/keyboard/KeyboardHud.java:543`

```java
@Override public void render(HudRenderer renderer)
```

## meteordevelopment.meteorclient.systems.hud.elements.keyboard.KeyboardHud.Preset

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/keyboard/KeyboardHud.java:639`

```java
public enum Preset
```

## meteordevelopment.meteorclient.systems.hud.elements.keyboard.KeyboardHud.KeyboardLayout

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/keyboard/KeyboardHud.java:648`

```java
public enum KeyboardLayout
```

## meteordevelopment.meteorclient.systems.hud.elements.keyboard.KeyboardHud.Key

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/keyboard/KeyboardHud.java:653`

```java
public static class Key
```

## meteordevelopment.meteorclient.systems.hud.elements.keyboard.KeyboardHud.Key.name

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/keyboard/KeyboardHud.java:654`

```java
public String name = ""
```

## meteordevelopment.meteorclient.systems.hud.elements.keyboard.KeyboardHud.Key.binding

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/keyboard/KeyboardHud.java:655`

```java
public KeyMapping binding
```

## meteordevelopment.meteorclient.systems.hud.elements.keyboard.KeyboardHud.Key.keybind

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/keyboard/KeyboardHud.java:656`

```java
public Keybind keybind
```

## meteordevelopment.meteorclient.systems.hud.elements.keyboard.KeyboardHud.Key.x

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/keyboard/KeyboardHud.java:657`

```java
public double x, y, width, height
```

## meteordevelopment.meteorclient.systems.hud.elements.keyboard.KeyboardHud.Key.y

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/keyboard/KeyboardHud.java:657`

```java
public double x, y, width, height
```

## meteordevelopment.meteorclient.systems.hud.elements.keyboard.KeyboardHud.Key.width

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/keyboard/KeyboardHud.java:657`

```java
public double x, y, width, height
```

## meteordevelopment.meteorclient.systems.hud.elements.keyboard.KeyboardHud.Key.height

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/keyboard/KeyboardHud.java:657`

```java
public double x, y, width, height
```

## meteordevelopment.meteorclient.systems.hud.elements.keyboard.KeyboardHud.Key.showCps

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/keyboard/KeyboardHud.java:658`

```java
public boolean showCps = false
```

## meteordevelopment.meteorclient.systems.hud.elements.keyboard.KeyboardHud.Key.Key

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/keyboard/KeyboardHud.java:664`

```java
public Key()
```

## meteordevelopment.meteorclient.systems.hud.elements.keyboard.KeyboardHud.Key.Key

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/keyboard/KeyboardHud.java:670`

```java
public Key(CompoundTag compound)
```

## meteordevelopment.meteorclient.systems.hud.elements.keyboard.KeyboardHud.Key.setShowCps

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/keyboard/KeyboardHud.java:698`

```java
public Key setShowCps(boolean show)
```

## meteordevelopment.meteorclient.systems.hud.elements.keyboard.KeyboardHud.Key.getName

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/keyboard/KeyboardHud.java:703`

```java
public String getName()
```

## meteordevelopment.meteorclient.systems.hud.elements.keyboard.KeyboardHud.Key.matches

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/keyboard/KeyboardHud.java:710`

```java
public boolean matches(int input, int keycode, boolean key)
```

## meteordevelopment.meteorclient.systems.hud.elements.keyboard.KeyboardHud.Key.update

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/keyboard/KeyboardHud.java:722`

```java
public void update(KeyAction action)
```

## meteordevelopment.meteorclient.systems.hud.elements.keyboard.KeyboardHud.Key.isNativelyPressed

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/keyboard/KeyboardHud.java:733`

```java
public boolean isNativelyPressed()
```

## meteordevelopment.meteorclient.systems.hud.elements.keyboard.KeyboardHud.Key.getCps

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/keyboard/KeyboardHud.java:747`

```java
public int getCps()
```

## meteordevelopment.meteorclient.systems.hud.elements.keyboard.KeyboardHud.Key.serialize

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/keyboard/KeyboardHud.java:751`

```java
public CompoundTag serialize()
```

## meteordevelopment.meteorclient.systems.hud.elements.keyboard.KeyboardHud.IsoEnterKey

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/keyboard/KeyboardHud.java:764`

```java
public static class IsoEnterKey extends Key
```

## meteordevelopment.meteorclient.systems.hud.elements.keyboard.KeyboardHud.IsoEnterKey.IsoEnterKey

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/keyboard/KeyboardHud.java:767`

```java
public IsoEnterKey(Keybind keybind, double x, double y, double width, double height, double topBarStartX)
```

## meteordevelopment.meteorclient.systems.hud.elements.keyboard.KeyboardHud.IsoEnterKey.render

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/keyboard/KeyboardHud.java:773`

```java
public void render(KeyboardHud hud, HudRenderer renderer, double s, SettingColor mutableColor)
```

## meteordevelopment.meteorclient.systems.hud.elements.keyboard.KeyboardHud.CustomKeyListSetting

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/keyboard/KeyboardHud.java:847`

```java
public class CustomKeyListSetting extends Setting<List<Key>>
```

## meteordevelopment.meteorclient.systems.hud.elements.keyboard.KeyboardHud.CustomKeyListSetting.CustomKeyListSetting

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/keyboard/KeyboardHud.java:848`

```java
public CustomKeyListSetting()
```

## meteordevelopment.meteorclient.systems.hud.elements.keyboard.KeyboardHud.CustomKeyListSetting.resetImpl

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/keyboard/KeyboardHud.java:853`

```java
@Override protected void resetImpl()
```

## meteordevelopment.meteorclient.systems.hud.elements.keyboard.KeyboardHud.CustomKeyListSetting.parseImpl

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/keyboard/KeyboardHud.java:859`

```java
@Override protected List<Key> parseImpl(String str)
```

## meteordevelopment.meteorclient.systems.hud.elements.keyboard.KeyboardHud.CustomKeyListSetting.isValueValid

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/keyboard/KeyboardHud.java:864`

```java
@Override protected boolean isValueValid(List<Key> value)
```

## meteordevelopment.meteorclient.systems.hud.elements.keyboard.KeyboardHud.CustomKeyListSetting.save

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/keyboard/KeyboardHud.java:869`

```java
@Override protected CompoundTag save(CompoundTag tag)
```

## meteordevelopment.meteorclient.systems.hud.elements.keyboard.KeyboardHud.CustomKeyListSetting.load

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/keyboard/KeyboardHud.java:880`

```java
@Override protected List<Key> load(CompoundTag tag)
```

## meteordevelopment.meteorclient.systems.hud.elements.keyboard.KeyboardHud.CustomKeySettingScreen

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/keyboard/KeyboardHud.java:892`

```java
public static class CustomKeySettingScreen extends WindowScreen
```

## meteordevelopment.meteorclient.systems.hud.elements.keyboard.KeyboardHud.CustomKeySettingScreen.CustomKeySettingScreen

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/keyboard/KeyboardHud.java:897`

```java
public CustomKeySettingScreen(GuiTheme theme, CustomKeyListSetting setting, Key key, WidgetScreen screen)
```

## meteordevelopment.meteorclient.systems.hud.elements.keyboard.KeyboardHud.CustomKeySettingScreen.initWidgets

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/keyboard/KeyboardHud.java:904`

```java
@Override public void initWidgets()
```

## meteordevelopment.meteorclient.systems.hud.elements.keyboard.KeyboardHud.fillTable

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/keyboard/KeyboardHud.java:1003`

```java
public static void fillTable(GuiTheme theme, WTable table, CustomKeyListSetting setting)
```

## meteordevelopment.meteorclient.systems.hud.screens.AddHudElementScreen

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/screens/AddHudElementScreen.java:28`

```java
public class AddHudElementScreen extends WindowScreen
```

## meteordevelopment.meteorclient.systems.hud.screens.AddHudElementScreen.AddHudElementScreen

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/screens/AddHudElementScreen.java:34`

```java
public AddHudElementScreen(GuiTheme theme, int x, int y)
```

## meteordevelopment.meteorclient.systems.hud.screens.AddHudElementScreen.initWidgets

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/screens/AddHudElementScreen.java:49`

```java
@Override public void initWidgets()
```

## meteordevelopment.meteorclient.systems.hud.screens.HudEditorScreen

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/screens/HudEditorScreen.java:32`

```java
public class HudEditorScreen extends WidgetScreen implements Snapper.Container
```

## meteordevelopment.meteorclient.systems.hud.screens.HudEditorScreen.HudEditorScreen

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/screens/HudEditorScreen.java:59`

```java
public HudEditorScreen(GuiTheme theme)
```

## meteordevelopment.meteorclient.systems.hud.screens.HudEditorScreen.initWidgets

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/screens/HudEditorScreen.java:66`

```java
@Override public void initWidgets()
```

## meteordevelopment.meteorclient.systems.hud.screens.HudEditorScreen.mouseClicked

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/screens/HudEditorScreen.java:70`

```java
@Override public boolean mouseClicked(@NonNull MouseButtonEvent click, boolean doubled)
```

## meteordevelopment.meteorclient.systems.hud.screens.HudEditorScreen.mouseMoved

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/screens/HudEditorScreen.java:101`

```java
@Override public void mouseMoved(double mouseX, double mouseY)
```

## meteordevelopment.meteorclient.systems.hud.screens.HudEditorScreen.mouseReleased

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/screens/HudEditorScreen.java:119`

```java
@Override public boolean mouseReleased(@NonNull MouseButtonEvent click)
```

## meteordevelopment.meteorclient.systems.hud.screens.HudEditorScreen.keyPressed

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/screens/HudEditorScreen.java:158`

```java
@Override public boolean keyPressed(@NonNull KeyEvent input)
```

## meteordevelopment.meteorclient.systems.hud.screens.HudEditorScreen.getElements

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/screens/HudEditorScreen.java:205`

```java
@Override public Iterable<Snapper.Element> getElements()
```

## meteordevelopment.meteorclient.systems.hud.screens.HudEditorScreen.shouldNotSnapTo

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/screens/HudEditorScreen.java:222`

```java
@Override public boolean shouldNotSnapTo(Snapper.Element element)
```

## meteordevelopment.meteorclient.systems.hud.screens.HudEditorScreen.getSnappingRange

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/screens/HudEditorScreen.java:227`

```java
@Override public int getSnappingRange()
```

## meteordevelopment.meteorclient.systems.hud.screens.HudEditorScreen.onRenderBefore

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/screens/HudEditorScreen.java:283`

```java
@Override protected void onRenderBefore(GuiGraphicsExtractor graphics, int mouseX, int mouseY, float delta)
```

## meteordevelopment.meteorclient.systems.hud.screens.HudEditorScreen.isOpen

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/screens/HudEditorScreen.java:338`

```java
public static boolean isOpen()
```

## meteordevelopment.meteorclient.systems.hud.screens.HudElementPresetsScreen

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/screens/HudElementPresetsScreen.java:18`

```java
public class HudElementPresetsScreen extends WindowScreen
```

## meteordevelopment.meteorclient.systems.hud.screens.HudElementPresetsScreen.HudElementPresetsScreen

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/screens/HudElementPresetsScreen.java:25`

```java
public HudElementPresetsScreen(GuiTheme theme, HudElementInfo<?> info, int x, int y)
```

## meteordevelopment.meteorclient.systems.hud.screens.HudElementPresetsScreen.initWidgets

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/screens/HudElementPresetsScreen.java:45`

```java
@Override public void initWidgets()
```

## meteordevelopment.meteorclient.systems.hud.screens.HudElementScreen

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/screens/HudElementScreen.java:27`

```java
public class HudElementScreen extends WindowScreen
```

## meteordevelopment.meteorclient.systems.hud.screens.HudElementScreen.HudElementScreen

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/screens/HudElementScreen.java:33`

```java
public HudElementScreen(GuiTheme theme, HudElement element)
```

## meteordevelopment.meteorclient.systems.hud.screens.HudElementScreen.initWidgets

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/screens/HudElementScreen.java:71`

```java
@Override public void initWidgets()
```

## meteordevelopment.meteorclient.systems.hud.screens.HudElementScreen.tick

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/screens/HudElementScreen.java:119`

```java
@Override public void tick()
```

## meteordevelopment.meteorclient.systems.hud.screens.HudElementScreen.toClipboard

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/screens/HudElementScreen.java:130`

```java
@Override public boolean toClipboard()
```

## meteordevelopment.meteorclient.systems.hud.screens.HudElementScreen.fromClipboard

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/screens/HudElementScreen.java:135`

```java
@Override public boolean fromClipboard()
```
