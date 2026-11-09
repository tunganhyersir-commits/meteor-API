# systems/waypoints

Khai báo Java có cú pháp public/protected. Không bao gồm API kế thừa/tổng hợp bởi compiler; xem kiểm tra bytecode riêng.

## meteordevelopment.meteorclient.systems.waypoints.Waypoint

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/waypoints/Waypoint.java:25`

```java
public class Waypoint implements ISerializable<Waypoint>
```

## meteordevelopment.meteorclient.systems.waypoints.Waypoint.settings

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/waypoints/Waypoint.java:26`

```java
public final Settings settings = new Settings()
```

## meteordevelopment.meteorclient.systems.waypoints.Waypoint.NearAction

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/waypoints/Waypoint.java:31`

```java
public enum NearAction
```

## meteordevelopment.meteorclient.systems.waypoints.Waypoint.name

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/waypoints/Waypoint.java:35`

```java
public Setting<String> name = sgVisual.add(new StringSetting.Builder() .name("name") .description("The name of the waypoint.") .defaultValue("Home") .build() )
```

## meteordevelopment.meteorclient.systems.waypoints.Waypoint.icon

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/waypoints/Waypoint.java:42`

```java
public Setting<String> icon = sgVisual.add(new ProvidedStringSetting.Builder() .name("icon") .description("The icon of the waypoint.") .defaultValue("Square") .supplier(() -> Waypoints.BUILTIN_ICONS) .onChanged(_ -> validateIcon()) .build() )
```

## meteordevelopment.meteorclient.systems.waypoints.Waypoint.color

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/waypoints/Waypoint.java:51`

```java
public Setting<SettingColor> color = sgVisual.add(new ColorSetting.Builder() .name("color") .description("The color of the waypoint.") .defaultValue(MeteorClient.ADDON.color.toSetting()) .build() )
```

## meteordevelopment.meteorclient.systems.waypoints.Waypoint.visible

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/waypoints/Waypoint.java:58`

```java
public Setting<Boolean> visible = sgVisual.add(new BoolSetting.Builder() .name("visible") .description("Whether to show the waypoint.") .defaultValue(true) .build() )
```

## meteordevelopment.meteorclient.systems.waypoints.Waypoint.maxVisible

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/waypoints/Waypoint.java:65`

```java
public Setting<Integer> maxVisible = sgVisual.add(new IntSetting.Builder() .name("max-visible-distance") .description("How far away to render the waypoint.") .defaultValue(5000) .build() )
```

## meteordevelopment.meteorclient.systems.waypoints.Waypoint.scale

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/waypoints/Waypoint.java:72`

```java
public Setting<Double> scale = sgVisual.add(new DoubleSetting.Builder() .name("scale") .description("The scale of the waypoint.") .defaultValue(1.5) .build() )
```

## meteordevelopment.meteorclient.systems.waypoints.Waypoint.pos

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/waypoints/Waypoint.java:79`

```java
public Setting<BlockPos> pos = sgPosition.add(new BlockPosSetting.Builder() .name("location") .description("The location of the waypoint.") .defaultValue(BlockPos.ZERO) .build() )
```

## meteordevelopment.meteorclient.systems.waypoints.Waypoint.dimension

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/waypoints/Waypoint.java:86`

```java
public Setting<Dimension> dimension = sgPosition.add(new EnumSetting.Builder<Dimension>() .name("dimension") .description("Which dimension the waypoint is in.") .defaultValue(Dimension.Overworld) .build() )
```

## meteordevelopment.meteorclient.systems.waypoints.Waypoint.opposite

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/waypoints/Waypoint.java:93`

```java
public Setting<Boolean> opposite = sgPosition.add(new BoolSetting.Builder() .name("opposite-dimension") .description("Whether to show the waypoint in the opposite dimension.") .defaultValue(true) .visible(() -> dimension.get() != Dimension.End) .build() )
```

## meteordevelopment.meteorclient.systems.waypoints.Waypoint.actionWhenNear

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/waypoints/Waypoint.java:101`

```java
public Setting<NearAction> actionWhenNear = sgPosition.add(new EnumSetting.Builder<NearAction>() .name("action-when-near") .description("Action to be performed when the player is near.") .defaultValue(NearAction.Disabled) .build() )
```

## meteordevelopment.meteorclient.systems.waypoints.Waypoint.actionWhenNearDistance

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/waypoints/Waypoint.java:108`

```java
public Setting<Integer> actionWhenNearDistance = sgPosition.add(new IntSetting.Builder() .name("action-when-near-distance") .description("How close (in blocks) the player has to be for the near action to be performed.") .defaultValue(8) .sliderRange(0, 32) .visible(() -> actionWhenNear.get() != NearAction.Disabled) .build() )
```

## meteordevelopment.meteorclient.systems.waypoints.Waypoint.uuid

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/waypoints/Waypoint.java:117`

```java
public final UUID uuid
```

## meteordevelopment.meteorclient.systems.waypoints.Waypoint.createdAt

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/waypoints/Waypoint.java:118`

```java
public final long createdAt
```

## meteordevelopment.meteorclient.systems.waypoints.Waypoint.Waypoint

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/waypoints/Waypoint.java:128`

```java
public Waypoint(Tag tag)
```

## meteordevelopment.meteorclient.systems.waypoints.Waypoint.renderIcon

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/waypoints/Waypoint.java:137`

```java
public void renderIcon(double x, double y, double a, double size)
```

## meteordevelopment.meteorclient.systems.waypoints.Waypoint.getPos

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/waypoints/Waypoint.java:151`

```java
public BlockPos getPos()
```

## meteordevelopment.meteorclient.systems.waypoints.Waypoint.actionWhenNearCheck

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/waypoints/Waypoint.java:165`

```java
public boolean actionWhenNearCheck(int distance)
```

## meteordevelopment.meteorclient.systems.waypoints.Waypoint.Builder

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/waypoints/Waypoint.java:181`

```java
public static class Builder
```

## meteordevelopment.meteorclient.systems.waypoints.Waypoint.Builder.name

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/waypoints/Waypoint.java:186`

```java
public Builder name(String name)
```

## meteordevelopment.meteorclient.systems.waypoints.Waypoint.Builder.icon

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/waypoints/Waypoint.java:191`

```java
public Builder icon(String icon)
```

## meteordevelopment.meteorclient.systems.waypoints.Waypoint.Builder.pos

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/waypoints/Waypoint.java:196`

```java
public Builder pos(BlockPos pos)
```

## meteordevelopment.meteorclient.systems.waypoints.Waypoint.Builder.dimension

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/waypoints/Waypoint.java:201`

```java
public Builder dimension(Dimension dimension)
```

## meteordevelopment.meteorclient.systems.waypoints.Waypoint.Builder.build

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/waypoints/Waypoint.java:206`

```java
public Waypoint build()
```

## meteordevelopment.meteorclient.systems.waypoints.Waypoint.toTag

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/waypoints/Waypoint.java:218`

```java
@Override public CompoundTag toTag()
```

## meteordevelopment.meteorclient.systems.waypoints.Waypoint.fromTag

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/waypoints/Waypoint.java:228`

```java
@Override public Waypoint fromTag(CompoundTag tag)
```

## meteordevelopment.meteorclient.systems.waypoints.Waypoint.equals

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/waypoints/Waypoint.java:237`

```java
@Override public boolean equals(Object o)
```

## meteordevelopment.meteorclient.systems.waypoints.Waypoint.hashCode

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/waypoints/Waypoint.java:245`

```java
@Override public int hashCode()
```

## meteordevelopment.meteorclient.systems.waypoints.Waypoint.toString

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/waypoints/Waypoint.java:250`

```java
@Override public String toString()
```

## meteordevelopment.meteorclient.systems.waypoints.Waypoints

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/waypoints/Waypoints.java:40`

```java
public class Waypoints extends System<Waypoints> implements Iterable<Waypoint>
```

## meteordevelopment.meteorclient.systems.waypoints.Waypoints.BUILTIN_ICONS

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/waypoints/Waypoints.java:43`

```java
public static final String[] BUILTIN_ICONS = {"square", "circle", "triangle", "star", "diamond", "skull"}
```

## meteordevelopment.meteorclient.systems.waypoints.Waypoints.icons

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/waypoints/Waypoints.java:45`

```java
public final Map<String, AbstractTexture> icons = new ConcurrentHashMap<>()
```

## meteordevelopment.meteorclient.systems.waypoints.Waypoints.Waypoints

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/waypoints/Waypoints.java:49`

```java
public Waypoints()
```

## meteordevelopment.meteorclient.systems.waypoints.Waypoints.get

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/waypoints/Waypoints.java:53`

```java
public static Waypoints get()
```

## meteordevelopment.meteorclient.systems.waypoints.Waypoints.init

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/waypoints/Waypoints.java:57`

```java
@Override public void init()
```

## meteordevelopment.meteorclient.systems.waypoints.Waypoints.add

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/waypoints/Waypoints.java:88`

```java
public boolean add(Waypoint waypoint)
```

## meteordevelopment.meteorclient.systems.waypoints.Waypoints.remove

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/waypoints/Waypoints.java:102`

```java
public boolean remove(Waypoint waypoint)
```

## meteordevelopment.meteorclient.systems.waypoints.Waypoints.removeAll

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/waypoints/Waypoints.java:112`

```java
public void removeAll(Collection<Waypoint> c)
```

## meteordevelopment.meteorclient.systems.waypoints.Waypoints.get

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/waypoints/Waypoints.java:117`

```java
public Waypoint get(String name)
```

## meteordevelopment.meteorclient.systems.waypoints.Waypoints.checkDimension

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/waypoints/Waypoints.java:135`

```java
public static boolean checkDimension(Waypoint waypoint)
```

## meteordevelopment.meteorclient.systems.waypoints.Waypoints.getFile

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/waypoints/Waypoints.java:148`

```java
@Override public File getFile()
```

## meteordevelopment.meteorclient.systems.waypoints.Waypoints.isEmpty

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/waypoints/Waypoints.java:154`

```java
public boolean isEmpty()
```

## meteordevelopment.meteorclient.systems.waypoints.Waypoints.iterator

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/waypoints/Waypoints.java:158`

```java
@Override public @NonNull Iterator<Waypoint> iterator()
```

## meteordevelopment.meteorclient.systems.waypoints.Waypoints.toTag

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/waypoints/Waypoints.java:175`

```java
@Override public CompoundTag toTag()
```

## meteordevelopment.meteorclient.systems.waypoints.Waypoints.fromTag

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/waypoints/Waypoints.java:182`

```java
@Override public Waypoints fromTag(CompoundTag tag)
```

## meteordevelopment.meteorclient.systems.waypoints.events.WaypointAddedEvent

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/waypoints/events/WaypointAddedEvent.java:10`

```java
public record WaypointAddedEvent(Waypoint waypoint)
```

## meteordevelopment.meteorclient.systems.waypoints.events.WaypointRemovedEvent

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/waypoints/events/WaypointRemovedEvent.java:10`

```java
public record WaypointRemovedEvent(Waypoint waypoint)
```
