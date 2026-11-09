# systems/modules

Khai báo Java có cú pháp public/protected. Không bao gồm API kế thừa/tổng hợp bởi compiler; xem kiểm tra bytecode riêng.

## meteordevelopment.meteorclient.systems.modules.Categories

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/Categories.java:13`

```java
public class Categories
```

## meteordevelopment.meteorclient.systems.modules.Categories.Combat

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/Categories.java:14`

```java
public static final Category Combat = new Category("Combat", () -> DisplayItemUtils.toStack(Items.GOLDEN_SWORD))
```

## meteordevelopment.meteorclient.systems.modules.Categories.Player

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/Categories.java:15`

```java
public static final Category Player = new Category("Player", () -> DisplayItemUtils.toStack(Items.ARMOR_STAND))
```

## meteordevelopment.meteorclient.systems.modules.Categories.Movement

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/Categories.java:16`

```java
public static final Category Movement = new Category("Movement", () -> DisplayItemUtils.toStack(Items.DIAMOND_BOOTS))
```

## meteordevelopment.meteorclient.systems.modules.Categories.Render

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/Categories.java:17`

```java
public static final Category Render = new Category("Render", () -> DisplayItemUtils.toStack(Items.GLASS))
```

## meteordevelopment.meteorclient.systems.modules.Categories.World

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/Categories.java:18`

```java
public static final Category World = new Category("World", () -> DisplayItemUtils.toStack(Items.GRASS_BLOCK))
```

## meteordevelopment.meteorclient.systems.modules.Categories.Misc

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/Categories.java:19`

```java
public static final Category Misc = new Category("Misc", () -> DisplayItemUtils.toStack(Items.LAVA_BUCKET))
```

## meteordevelopment.meteorclient.systems.modules.Categories.REGISTERING

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/Categories.java:21`

```java
public static boolean REGISTERING
```

## meteordevelopment.meteorclient.systems.modules.Categories.init

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/Categories.java:23`

```java
public static void init()
```

## meteordevelopment.meteorclient.systems.modules.Category

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/Category.java:12`

```java
public class Category
```

## meteordevelopment.meteorclient.systems.modules.Category.name

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/Category.java:13`

```java
public final String name
```

## meteordevelopment.meteorclient.systems.modules.Category.icon

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/Category.java:14`

```java
public final Supplier<ItemStack> icon
```

## meteordevelopment.meteorclient.systems.modules.Category.Category

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/Category.java:17`

```java
public Category(String name, Supplier<ItemStack> icon)
```

## meteordevelopment.meteorclient.systems.modules.Category.Category

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/Category.java:23`

```java
public Category(String name)
```

## meteordevelopment.meteorclient.systems.modules.Category.toString

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/Category.java:27`

```java
@Override public String toString()
```

## meteordevelopment.meteorclient.systems.modules.Category.equals

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/Category.java:32`

```java
@Override public boolean equals(Object o)
```

## meteordevelopment.meteorclient.systems.modules.Category.hashCode

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/Category.java:40`

```java
@Override public int hashCode()
```

## meteordevelopment.meteorclient.systems.modules.Module

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/Module.java:29`

```java
public abstract class Module implements ISerializable<Module>, Comparable<Module>
```

## meteordevelopment.meteorclient.systems.modules.Module.mc

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/Module.java:30`

```java
protected final Minecraft mc
```

## meteordevelopment.meteorclient.systems.modules.Module.category

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/Module.java:32`

```java
public final Category category
```

## meteordevelopment.meteorclient.systems.modules.Module.name

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/Module.java:33`

```java
public final String name
```

## meteordevelopment.meteorclient.systems.modules.Module.title

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/Module.java:34`

```java
public final String title
```

## meteordevelopment.meteorclient.systems.modules.Module.description

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/Module.java:35`

```java
public final String description
```

## meteordevelopment.meteorclient.systems.modules.Module.aliases

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/Module.java:36`

```java
public final String[] aliases
```

## meteordevelopment.meteorclient.systems.modules.Module.color

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/Module.java:37`

```java
public final Color color
```

## meteordevelopment.meteorclient.systems.modules.Module.addon

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/Module.java:39`

```java
public final MeteorAddon addon
```

## meteordevelopment.meteorclient.systems.modules.Module.settings

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/Module.java:40`

```java
public final Settings settings = new Settings()
```

## meteordevelopment.meteorclient.systems.modules.Module.serialize

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/Module.java:44`

```java
public boolean serialize = true
```

## meteordevelopment.meteorclient.systems.modules.Module.runInMainMenu

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/Module.java:45`

```java
public boolean runInMainMenu = false
```

## meteordevelopment.meteorclient.systems.modules.Module.autoSubscribe

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/Module.java:46`

```java
public boolean autoSubscribe = true
```

## meteordevelopment.meteorclient.systems.modules.Module.keybind

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/Module.java:48`

```java
public final Keybind keybind = Keybind.none()
```

## meteordevelopment.meteorclient.systems.modules.Module.toggleOnBindRelease

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/Module.java:49`

```java
public boolean toggleOnBindRelease = false
```

## meteordevelopment.meteorclient.systems.modules.Module.chatFeedback

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/Module.java:50`

```java
public boolean chatFeedback = true
```

## meteordevelopment.meteorclient.systems.modules.Module.favorite

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/Module.java:51`

```java
public boolean favorite = false
```

## meteordevelopment.meteorclient.systems.modules.Module.Module

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/Module.java:53`

```java
public Module(Category category, String name, String description, String... aliases)
```

## meteordevelopment.meteorclient.systems.modules.Module.Module

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/Module.java:76`

```java
public Module(Category category, String name, String desc)
```

## meteordevelopment.meteorclient.systems.modules.Module.getWidget

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/Module.java:80`

```java
public WWidget getWidget(GuiTheme theme)
```

## meteordevelopment.meteorclient.systems.modules.Module.onActivate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/Module.java:84`

```java
public void onActivate()
```

## meteordevelopment.meteorclient.systems.modules.Module.onDeactivate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/Module.java:87`

```java
public void onDeactivate()
```

## meteordevelopment.meteorclient.systems.modules.Module.toggle

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/Module.java:90`

```java
public void toggle()
```

## meteordevelopment.meteorclient.systems.modules.Module.enable

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/Module.java:112`

```java
public void enable()
```

## meteordevelopment.meteorclient.systems.modules.Module.disable

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/Module.java:116`

```java
public void disable()
```

## meteordevelopment.meteorclient.systems.modules.Module.sendToggledMsg

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/Module.java:120`

```java
public void sendToggledMsg()
```

## meteordevelopment.meteorclient.systems.modules.Module.info

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/Module.java:127`

```java
public void info(Component message)
```

## meteordevelopment.meteorclient.systems.modules.Module.info

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/Module.java:132`

```java
public void info(String message, Object... args)
```

## meteordevelopment.meteorclient.systems.modules.Module.warning

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/Module.java:137`

```java
public void warning(String message, Object... args)
```

## meteordevelopment.meteorclient.systems.modules.Module.error

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/Module.java:142`

```java
public void error(String message, Object... args)
```

## meteordevelopment.meteorclient.systems.modules.Module.isActive

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/Module.java:147`

```java
public boolean isActive()
```

## meteordevelopment.meteorclient.systems.modules.Module.getInfoString

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/Module.java:151`

```java
public String getInfoString()
```

## meteordevelopment.meteorclient.systems.modules.Module.toTag

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/Module.java:155`

```java
@Override public CompoundTag toTag()
```

## meteordevelopment.meteorclient.systems.modules.Module.fromTag

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/Module.java:171`

```java
@Override public Module fromTag(CompoundTag tag)
```

## meteordevelopment.meteorclient.systems.modules.Module.equals

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/Module.java:189`

```java
@Override public boolean equals(Object o)
```

## meteordevelopment.meteorclient.systems.modules.Module.hashCode

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/Module.java:197`

```java
@Override public int hashCode()
```

## meteordevelopment.meteorclient.systems.modules.Module.compareTo

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/Module.java:202`

```java
@Override public int compareTo(@NonNull Module o)
```

## meteordevelopment.meteorclient.systems.modules.Modules

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/Modules.java:58`

```java
public class Modules extends System<Modules>
```

## meteordevelopment.meteorclient.systems.modules.Modules.Modules

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/Modules.java:68`

```java
public Modules()
```

## meteordevelopment.meteorclient.systems.modules.Modules.get

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/Modules.java:72`

```java
public static Modules get()
```

## meteordevelopment.meteorclient.systems.modules.Modules.init

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/Modules.java:76`

```java
@Override public void init()
```

## meteordevelopment.meteorclient.systems.modules.Modules.load

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/Modules.java:86`

```java
@Override public void load(File folder)
```

## meteordevelopment.meteorclient.systems.modules.Modules.sortModules

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/Modules.java:97`

```java
public void sortModules()
```

## meteordevelopment.meteorclient.systems.modules.Modules.registerCategory

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/Modules.java:103`

```java
public static void registerCategory(Category category)
```

## meteordevelopment.meteorclient.systems.modules.Modules.loopCategories

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/Modules.java:110`

```java
public static Iterable<Category> loopCategories()
```

## meteordevelopment.meteorclient.systems.modules.Modules.get

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/Modules.java:114`

```java
@SuppressWarnings("unchecked") @Nullable public <T extends Module> T get(Class<T> klass)
```

## meteordevelopment.meteorclient.systems.modules.Modules.getOptional

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/Modules.java:120`

```java
@SuppressWarnings("unused") public <T extends Module> Optional<T> getOptional(Class<T> klass)
```

## meteordevelopment.meteorclient.systems.modules.Modules.get

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/Modules.java:125`

```java
@Nullable public Module get(String name)
```

## meteordevelopment.meteorclient.systems.modules.Modules.isActive

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/Modules.java:134`

```java
public boolean isActive(Class<? extends Module> klass)
```

## meteordevelopment.meteorclient.systems.modules.Modules.getGroup

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/Modules.java:139`

```java
public List<Module> getGroup(Category category)
```

## meteordevelopment.meteorclient.systems.modules.Modules.getAll

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/Modules.java:143`

```java
public Collection<Module> getAll()
```

## meteordevelopment.meteorclient.systems.modules.Modules.getCount

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/Modules.java:148`

```java
public int getCount()
```

## meteordevelopment.meteorclient.systems.modules.Modules.getActive

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/Modules.java:152`

```java
public Collection<Module> getActive()
```

## meteordevelopment.meteorclient.systems.modules.Modules.searchTitles

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/Modules.java:156`

```java
public List<Pair<Module, String>> searchTitles(String text)
```

## meteordevelopment.meteorclient.systems.modules.Modules.searchSettingTitles

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/Modules.java:182`

```java
public Set<Module> searchSettingTitles(String text)
```

## meteordevelopment.meteorclient.systems.modules.Modules.setModuleToBind

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/Modules.java:217`

```java
public void setModuleToBind(@Nullable Module moduleToBind)
```

## meteordevelopment.meteorclient.systems.modules.Modules.awaitKeyRelease

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/Modules.java:225`

```java
public void awaitKeyRelease()
```

## meteordevelopment.meteorclient.systems.modules.Modules.isBinding

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/Modules.java:229`

```java
public boolean isBinding()
```

## meteordevelopment.meteorclient.systems.modules.Modules.disableAll

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/Modules.java:341`

```java
public void disableAll()
```

## meteordevelopment.meteorclient.systems.modules.Modules.toTag

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/Modules.java:349`

```java
@Override public CompoundTag toTag()
```

## meteordevelopment.meteorclient.systems.modules.Modules.fromTag

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/Modules.java:363`

```java
@Override public Modules fromTag(CompoundTag tag)
```

## meteordevelopment.meteorclient.systems.modules.Modules.add

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/Modules.java:379`

```java
public void add(Module module)
```

## meteordevelopment.meteorclient.systems.modules.combat.AnchorAura

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/combat/AnchorAura.java:40`

```java
public class AnchorAura extends Module
```

## meteordevelopment.meteorclient.systems.modules.combat.AnchorAura.AnchorAura

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/combat/AnchorAura.java:257`

```java
public AnchorAura()
```

## meteordevelopment.meteorclient.systems.modules.combat.AnchorAura.onActivate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/combat/AnchorAura.java:261`

```java
@Override public void onActivate()
```

## meteordevelopment.meteorclient.systems.modules.combat.AnchorAura.onDeactivate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/combat/AnchorAura.java:270`

```java
@Override public void onDeactivate()
```

## meteordevelopment.meteorclient.systems.modules.combat.AnchorAura.getInfoString

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/combat/AnchorAura.java:446`

```java
@Override public String getInfoString()
```

## meteordevelopment.meteorclient.systems.modules.combat.AntiAnchor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/combat/AntiAnchor.java:21`

```java
public class AntiAnchor extends Module
```

## meteordevelopment.meteorclient.systems.modules.combat.AntiAnchor.AntiAnchor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/combat/AntiAnchor.java:38`

```java
public AntiAnchor()
```

## meteordevelopment.meteorclient.systems.modules.combat.AntiAnvil

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/combat/AntiAnvil.java:21`

```java
public class AntiAnvil extends Module
```

## meteordevelopment.meteorclient.systems.modules.combat.AntiAnvil.AntiAnvil

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/combat/AntiAnvil.java:38`

```java
public AntiAnvil()
```

## meteordevelopment.meteorclient.systems.modules.combat.AntiBed

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/combat/AntiBed.java:26`

```java
public class AntiBed extends Module
```

## meteordevelopment.meteorclient.systems.modules.combat.AntiBed.AntiBed

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/combat/AntiBed.java:59`

```java
public AntiBed()
```

## meteordevelopment.meteorclient.systems.modules.combat.ArrowDodge

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/combat/ArrowDodge.java:29`

```java
public class ArrowDodge extends Module
```

## meteordevelopment.meteorclient.systems.modules.combat.ArrowDodge.simulationSteps

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/combat/ArrowDodge.java:79`

```java
public final Setting<Integer> simulationSteps = sgGeneral.add(new IntSetting.Builder() .name("simulation-steps") .description("How many steps to simulate projectiles. Zero for no limit.") .defaultValue(500) .sliderMax(5000) .build() )
```

## meteordevelopment.meteorclient.systems.modules.combat.ArrowDodge.ArrowDodge

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/combat/ArrowDodge.java:102`

```java
public ArrowDodge()
```

## meteordevelopment.meteorclient.systems.modules.combat.ArrowDodge.MoveType

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/combat/ArrowDodge.java:190`

```java
public enum MoveType
```

## meteordevelopment.meteorclient.systems.modules.combat.AttributeSwap

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/combat/AttributeSwap.java:36`

```java
public class AttributeSwap extends Module
```

## meteordevelopment.meteorclient.systems.modules.combat.AttributeSwap.AttributeSwap

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/combat/AttributeSwap.java:321`

```java
public AttributeSwap()
```

## meteordevelopment.meteorclient.systems.modules.combat.AttributeSwap.onDeactivate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/combat/AttributeSwap.java:325`

```java
@Override public void onDeactivate()
```

## meteordevelopment.meteorclient.systems.modules.combat.AttributeSwap.Mode

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/combat/AttributeSwap.java:672`

```java
public enum Mode
```

## meteordevelopment.meteorclient.systems.modules.combat.AutoAnvil

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/combat/AutoAnvil.java:29`

```java
public class AutoAnvil extends Module
```

## meteordevelopment.meteorclient.systems.modules.combat.AutoAnvil.AutoAnvil

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/combat/AutoAnvil.java:99`

```java
public AutoAnvil()
```

## meteordevelopment.meteorclient.systems.modules.combat.AutoAnvil.onActivate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/combat/AutoAnvil.java:103`

```java
@Override public void onActivate()
```

## meteordevelopment.meteorclient.systems.modules.combat.AutoAnvil.getInfoString

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/combat/AutoAnvil.java:156`

```java
@Override public String getInfoString()
```

## meteordevelopment.meteorclient.systems.modules.combat.AutoArmor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/combat/AutoArmor.java:35`

```java
public class AutoArmor extends Module
```

## meteordevelopment.meteorclient.systems.modules.combat.AutoArmor.AutoArmor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/combat/AutoArmor.java:90`

```java
public AutoArmor()
```

## meteordevelopment.meteorclient.systems.modules.combat.AutoArmor.onActivate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/combat/AutoArmor.java:99`

```java
@Override public void onActivate()
```

## meteordevelopment.meteorclient.systems.modules.combat.AutoArmor.Protection

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/combat/AutoArmor.java:227`

```java
public enum Protection
```

## meteordevelopment.meteorclient.systems.modules.combat.AutoCity

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/combat/AutoCity.java:32`

```java
public class AutoCity extends Module
```

## meteordevelopment.meteorclient.systems.modules.combat.AutoCity.AutoCity

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/combat/AutoCity.java:138`

```java
public AutoCity()
```

## meteordevelopment.meteorclient.systems.modules.combat.AutoCity.onActivate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/combat/AutoCity.java:142`

```java
@Override public void onActivate()
```

## meteordevelopment.meteorclient.systems.modules.combat.AutoCity.onDeactivate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/combat/AutoCity.java:176`

```java
@Override public void onDeactivate()
```

## meteordevelopment.meteorclient.systems.modules.combat.AutoCity.mine

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/combat/AutoCity.java:210`

```java
public void mine(boolean done)
```

## meteordevelopment.meteorclient.systems.modules.combat.AutoCity.getInfoString

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/combat/AutoCity.java:230`

```java
@Override public String getInfoString()
```

## meteordevelopment.meteorclient.systems.modules.combat.AutoCity.SwitchMode

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/combat/AutoCity.java:235`

```java
public enum SwitchMode
```

## meteordevelopment.meteorclient.systems.modules.combat.AutoEXP

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/combat/AutoEXP.java:25`

```java
public class AutoEXP extends Module
```

## meteordevelopment.meteorclient.systems.modules.combat.AutoEXP.AutoEXP

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/combat/AutoEXP.java:79`

```java
public AutoEXP()
```

## meteordevelopment.meteorclient.systems.modules.combat.AutoEXP.onActivate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/combat/AutoEXP.java:83`

```java
@Override public void onActivate()
```

## meteordevelopment.meteorclient.systems.modules.combat.AutoEXP.Mode

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/combat/AutoEXP.java:147`

```java
public enum Mode
```

## meteordevelopment.meteorclient.systems.modules.combat.AutoLog

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/combat/AutoLog.java:37`

```java
public class AutoLog extends Module
```

## meteordevelopment.meteorclient.systems.modules.combat.AutoLog.AutoLog

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/combat/AutoLog.java:153`

```java
public AutoLog()
```

## meteordevelopment.meteorclient.systems.modules.combat.AutoLog.onActivate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/combat/AutoLog.java:157`

```java
@Override public void onActivate()
```

## meteordevelopment.meteorclient.systems.modules.combat.AutoTotem

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/combat/AutoTotem.java:24`

```java
public class AutoTotem extends Module
```

## meteordevelopment.meteorclient.systems.modules.combat.AutoTotem.locked

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/combat/AutoTotem.java:76`

```java
public boolean locked
```

## meteordevelopment.meteorclient.systems.modules.combat.AutoTotem.AutoTotem

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/combat/AutoTotem.java:79`

```java
public AutoTotem()
```

## meteordevelopment.meteorclient.systems.modules.combat.AutoTotem.isLocked

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/combat/AutoTotem.java:117`

```java
public boolean isLocked()
```

## meteordevelopment.meteorclient.systems.modules.combat.AutoTotem.getInfoString

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/combat/AutoTotem.java:121`

```java
@Override public String getInfoString()
```

## meteordevelopment.meteorclient.systems.modules.combat.AutoTotem.Mode

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/combat/AutoTotem.java:126`

```java
public enum Mode
```

## meteordevelopment.meteorclient.systems.modules.combat.AutoTrap

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/combat/AutoTrap.java:36`

```java
public class AutoTrap extends Module
```

## meteordevelopment.meteorclient.systems.modules.combat.AutoTrap.AutoTrap

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/combat/AutoTrap.java:180`

```java
public AutoTrap()
```

## meteordevelopment.meteorclient.systems.modules.combat.AutoTrap.onActivate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/combat/AutoTrap.java:184`

```java
@Override public void onActivate()
```

## meteordevelopment.meteorclient.systems.modules.combat.AutoTrap.onDeactivate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/combat/AutoTrap.java:192`

```java
@Override public void onDeactivate()
```

## meteordevelopment.meteorclient.systems.modules.combat.AutoTrap.getInfoString

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/combat/AutoTrap.java:331`

```java
@Override public String getInfoString()
```

## meteordevelopment.meteorclient.systems.modules.combat.AutoTrap.TopMode

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/combat/AutoTrap.java:336`

```java
public enum TopMode
```

## meteordevelopment.meteorclient.systems.modules.combat.AutoTrap.BottomMode

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/combat/AutoTrap.java:343`

```java
public enum BottomMode
```

## meteordevelopment.meteorclient.systems.modules.combat.AutoWeapon

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/combat/AutoWeapon.java:19`

```java
public class AutoWeapon extends Module
```

## meteordevelopment.meteorclient.systems.modules.combat.AutoWeapon.AutoWeapon

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/combat/AutoWeapon.java:43`

```java
public AutoWeapon()
```

## meteordevelopment.meteorclient.systems.modules.combat.AutoWeapon.Weapon

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/combat/AutoWeapon.java:86`

```java
public enum Weapon
```

## meteordevelopment.meteorclient.systems.modules.combat.AutoWeb

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/combat/AutoWeb.java:32`

```java
public class AutoWeb extends Module
```

## meteordevelopment.meteorclient.systems.modules.combat.AutoWeb.AutoWeb

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/combat/AutoWeb.java:137`

```java
public AutoWeb()
```

## meteordevelopment.meteorclient.systems.modules.combat.AutoWeb.onActivate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/combat/AutoWeb.java:141`

```java
@Override public void onActivate()
```

## meteordevelopment.meteorclient.systems.modules.combat.AutoWeb.onDeactivate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/combat/AutoWeb.java:146`

```java
@Override public void onDeactivate()
```

## meteordevelopment.meteorclient.systems.modules.combat.BedAura

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/combat/BedAura.java:37`

```java
public class BedAura extends Module
```

## meteordevelopment.meteorclient.systems.modules.combat.BedAura.BedAura

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/combat/BedAura.java:196`

```java
public BedAura()
```

## meteordevelopment.meteorclient.systems.modules.combat.BedAura.onActivate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/combat/BedAura.java:200`

```java
@Override public void onActivate()
```

## meteordevelopment.meteorclient.systems.modules.combat.BedAura.getInfoString

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/combat/BedAura.java:351`

```java
@Override public String getInfoString()
```

## meteordevelopment.meteorclient.systems.modules.combat.BowAimbot

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/combat/BowAimbot.java:33`

```java
public class BowAimbot extends Module
```

## meteordevelopment.meteorclient.systems.modules.combat.BowAimbot.BowAimbot

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/combat/BowAimbot.java:84`

```java
public BowAimbot()
```

## meteordevelopment.meteorclient.systems.modules.combat.BowAimbot.onDeactivate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/combat/BowAimbot.java:88`

```java
@Override public void onDeactivate()
```

## meteordevelopment.meteorclient.systems.modules.combat.BowAimbot.getInfoString

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/combat/BowAimbot.java:163`

```java
@Override public String getInfoString()
```

## meteordevelopment.meteorclient.systems.modules.combat.BowSpam

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/combat/BowSpam.java:24`

```java
public class BowSpam extends Module
```

## meteordevelopment.meteorclient.systems.modules.combat.BowSpam.BowSpam

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/combat/BowSpam.java:71`

```java
public BowSpam()
```

## meteordevelopment.meteorclient.systems.modules.combat.BowSpam.onActivate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/combat/BowSpam.java:75`

```java
@Override public void onActivate()
```

## meteordevelopment.meteorclient.systems.modules.combat.BowSpam.onDeactivate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/combat/BowSpam.java:81`

```java
@Override public void onDeactivate()
```

## meteordevelopment.meteorclient.systems.modules.combat.Burrow

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/combat/Burrow.java:36`

```java
public class Burrow extends Module
```

## meteordevelopment.meteorclient.systems.modules.combat.Burrow.Burrow

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/combat/Burrow.java:111`

```java
public Burrow()
```

## meteordevelopment.meteorclient.systems.modules.combat.Burrow.onActivate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/combat/Burrow.java:115`

```java
@Override public void onActivate()
```

## meteordevelopment.meteorclient.systems.modules.combat.Burrow.onDeactivate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/combat/Burrow.java:157`

```java
@Override public void onDeactivate()
```

## meteordevelopment.meteorclient.systems.modules.combat.Burrow.Block

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/combat/Burrow.java:236`

```java
public enum Block
```

## meteordevelopment.meteorclient.systems.modules.combat.Criticals

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/combat/Criticals.java:26`

```java
public class Criticals extends Module
```

## meteordevelopment.meteorclient.systems.modules.combat.Criticals.Criticals

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/combat/Criticals.java:70`

```java
public Criticals()
```

## meteordevelopment.meteorclient.systems.modules.combat.Criticals.onActivate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/combat/Criticals.java:74`

```java
@Override public void onActivate()
```

## meteordevelopment.meteorclient.systems.modules.combat.Criticals.getInfoString

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/combat/Criticals.java:191`

```java
@Override public String getInfoString()
```

## meteordevelopment.meteorclient.systems.modules.combat.Criticals.Mode

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/combat/Criticals.java:196`

```java
public enum Mode
```

## meteordevelopment.meteorclient.systems.modules.combat.CrystalAura

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/combat/CrystalAura.java:66`

```java
public class CrystalAura extends Module
```

## meteordevelopment.meteorclient.systems.modules.combat.CrystalAura.placeDelay

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/combat/CrystalAura.java:204`

```java
public final Setting<Integer> placeDelay = sgPlace.add(new IntSetting.Builder() .name("place-delay") .description("The delay in ticks to wait to place a crystal after it's exploded.") .defaultValue(0) .min(0) .sliderMax(20) .build() )
```

## meteordevelopment.meteorclient.systems.modules.combat.CrystalAura.pauseOnUse

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/combat/CrystalAura.java:385`

```java
public final Setting<PauseMode> pauseOnUse = sgPause.add(new EnumSetting.Builder<PauseMode>() .name("pause-on-use") .description("Which processes should be paused while using an item.") .defaultValue(PauseMode.Place) .build() )
```

## meteordevelopment.meteorclient.systems.modules.combat.CrystalAura.pauseOnMine

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/combat/CrystalAura.java:392`

```java
public final Setting<PauseMode> pauseOnMine = sgPause.add(new EnumSetting.Builder<PauseMode>() .name("pause-on-mine") .description("Which processes should be paused while mining a block.") .defaultValue(PauseMode.None) .build() )
```

## meteordevelopment.meteorclient.systems.modules.combat.CrystalAura.pauseModules

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/combat/CrystalAura.java:406`

```java
public final Setting<List<Module>> pauseModules = sgPause.add(new ModuleListSetting.Builder() .name("pause-modules") .description("Pauses while any of the selected modules are active.") .defaultValue(BedAura.class) .build() )
```

## meteordevelopment.meteorclient.systems.modules.combat.CrystalAura.pauseHealth

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/combat/CrystalAura.java:413`

```java
public final Setting<Double> pauseHealth = sgPause.add(new DoubleSetting.Builder() .name("pause-health") .description("Pauses when you go below a certain health.") .defaultValue(5) .range(0, 36) .sliderRange(0, 36) .build() )
```

## meteordevelopment.meteorclient.systems.modules.combat.CrystalAura.swingMode

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/combat/CrystalAura.java:424`

```java
public final Setting<SwingMode> swingMode = sgRender.add(new EnumSetting.Builder<SwingMode>() .name("swing-mode") .description("How to swing when placing.") .defaultValue(SwingMode.Both) .build() )
```

## meteordevelopment.meteorclient.systems.modules.combat.CrystalAura.kaTimer

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/combat/CrystalAura.java:573`

```java
public int kaTimer
```

## meteordevelopment.meteorclient.systems.modules.combat.CrystalAura.CrystalAura

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/combat/CrystalAura.java:600`

```java
public CrystalAura()
```

## meteordevelopment.meteorclient.systems.modules.combat.CrystalAura.onActivate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/combat/CrystalAura.java:604`

```java
@Override public void onActivate()
```

## meteordevelopment.meteorclient.systems.modules.combat.CrystalAura.onDeactivate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/combat/CrystalAura.java:629`

```java
@Override public void onDeactivate()
```

## meteordevelopment.meteorclient.systems.modules.combat.CrystalAura.doYawSteps

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/combat/CrystalAura.java:1077`

```java
public boolean doYawSteps(double targetYaw, double targetPitch)
```

## meteordevelopment.meteorclient.systems.modules.combat.CrystalAura.getInfoString

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/combat/CrystalAura.java:1196`

```java
@Override public String getInfoString()
```

## meteordevelopment.meteorclient.systems.modules.combat.CrystalAura.YawStepMode

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/combat/CrystalAura.java:1333`

```java
public enum YawStepMode
```

## meteordevelopment.meteorclient.systems.modules.combat.CrystalAura.AutoSwitchMode

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/combat/CrystalAura.java:1338`

```java
public enum AutoSwitchMode
```

## meteordevelopment.meteorclient.systems.modules.combat.CrystalAura.SupportMode

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/combat/CrystalAura.java:1344`

```java
public enum SupportMode
```

## meteordevelopment.meteorclient.systems.modules.combat.CrystalAura.PauseMode

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/combat/CrystalAura.java:1350`

```java
public enum PauseMode
```

## meteordevelopment.meteorclient.systems.modules.combat.CrystalAura.PauseMode.matches

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/combat/CrystalAura.java:1356`

```java
public boolean matches(PauseMode process)
```

## meteordevelopment.meteorclient.systems.modules.combat.CrystalAura.RenderMode

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/combat/CrystalAura.java:1361`

```java
public enum RenderMode
```

## meteordevelopment.meteorclient.systems.modules.combat.Hitboxes

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/combat/Hitboxes.java:23`

```java
public class Hitboxes extends Module
```

## meteordevelopment.meteorclient.systems.modules.combat.Hitboxes.Hitboxes

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/combat/Hitboxes.java:119`

```java
public Hitboxes()
```

## meteordevelopment.meteorclient.systems.modules.combat.Hitboxes.getEntityValue

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/combat/Hitboxes.java:123`

```java
public double getEntityValue(Entity entity)
```

## meteordevelopment.meteorclient.systems.modules.combat.HoleFiller

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/combat/HoleFiller.java:40`

```java
public class HoleFiller extends Module
```

## meteordevelopment.meteorclient.systems.modules.combat.HoleFiller.forceFill

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/combat/HoleFiller.java:124`

```java
public final Setting<Keybind> forceFill = sgSmart.add(new KeybindSetting.Builder() .name("force-fill") .description("Fills all holes around you regardless of target checks.") .defaultValue(Keybind.none()) .visible(smart::get) .build() )
```

## meteordevelopment.meteorclient.systems.modules.combat.HoleFiller.HoleFiller

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/combat/HoleFiller.java:247`

```java
public HoleFiller()
```

## meteordevelopment.meteorclient.systems.modules.combat.HoleFiller.onActivate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/combat/HoleFiller.java:251`

```java
@Override public void onActivate()
```

## meteordevelopment.meteorclient.systems.modules.combat.KillAura

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/combat/KillAura.java:48`

```java
public class KillAura extends Module
```

## meteordevelopment.meteorclient.systems.modules.combat.KillAura.attacking

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/combat/KillAura.java:266`

```java
public boolean attacking, swapped
```

## meteordevelopment.meteorclient.systems.modules.combat.KillAura.swapped

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/combat/KillAura.java:266`

```java
public boolean attacking, swapped
```

## meteordevelopment.meteorclient.systems.modules.combat.KillAura.previousSlot

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/combat/KillAura.java:267`

```java
public static int previousSlot
```

## meteordevelopment.meteorclient.systems.modules.combat.KillAura.KillAura

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/combat/KillAura.java:269`

```java
public KillAura()
```

## meteordevelopment.meteorclient.systems.modules.combat.KillAura.onActivate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/combat/KillAura.java:273`

```java
@Override public void onActivate()
```

## meteordevelopment.meteorclient.systems.modules.combat.KillAura.onDeactivate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/combat/KillAura.java:279`

```java
@Override public void onDeactivate()
```

## meteordevelopment.meteorclient.systems.modules.combat.KillAura.getTarget

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/combat/KillAura.java:484`

```java
public Entity getTarget()
```

## meteordevelopment.meteorclient.systems.modules.combat.KillAura.getInfoString

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/combat/KillAura.java:489`

```java
@Override public String getInfoString()
```

## meteordevelopment.meteorclient.systems.modules.combat.KillAura.AttackItems

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/combat/KillAura.java:495`

```java
public enum AttackItems
```

## meteordevelopment.meteorclient.systems.modules.combat.KillAura.RotationMode

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/combat/KillAura.java:500`

```java
public enum RotationMode
```

## meteordevelopment.meteorclient.systems.modules.combat.KillAura.ShieldMode

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/combat/KillAura.java:506`

```java
public enum ShieldMode
```

## meteordevelopment.meteorclient.systems.modules.combat.Offhand

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/combat/Offhand.java:27`

```java
public class Offhand extends Module
```

## meteordevelopment.meteorclient.systems.modules.combat.Offhand.locked

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/combat/Offhand.java:132`

```java
public boolean locked
```

## meteordevelopment.meteorclient.systems.modules.combat.Offhand.Offhand

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/combat/Offhand.java:136`

```java
public Offhand()
```

## meteordevelopment.meteorclient.systems.modules.combat.Offhand.onActivate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/combat/Offhand.java:140`

```java
@Override public void onActivate()
```

## meteordevelopment.meteorclient.systems.modules.combat.Offhand.getInfoString

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/combat/Offhand.java:255`

```java
@Override public String getInfoString()
```

## meteordevelopment.meteorclient.systems.modules.combat.Offhand.Item

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/combat/Offhand.java:260`

```java
public enum Item
```

## meteordevelopment.meteorclient.systems.modules.combat.Quiver

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/combat/Quiver.java:41`

```java
public class Quiver extends Module
```

## meteordevelopment.meteorclient.systems.modules.combat.Quiver.Quiver

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/combat/Quiver.java:114`

```java
public Quiver()
```

## meteordevelopment.meteorclient.systems.modules.combat.Quiver.onActivate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/combat/Quiver.java:118`

```java
@Override public void onActivate()
```

## meteordevelopment.meteorclient.systems.modules.combat.Quiver.onDeactivate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/combat/Quiver.java:165`

```java
@Override public void onDeactivate()
```

## meteordevelopment.meteorclient.systems.modules.combat.SelfAnvil

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/combat/SelfAnvil.java:19`

```java
public class SelfAnvil extends Module
```

## meteordevelopment.meteorclient.systems.modules.combat.SelfAnvil.SelfAnvil

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/combat/SelfAnvil.java:20`

```java
public SelfAnvil()
```

## meteordevelopment.meteorclient.systems.modules.combat.SelfTrap

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/combat/SelfTrap.java:28`

```java
public class SelfTrap extends Module
```

## meteordevelopment.meteorclient.systems.modules.combat.SelfTrap.TopMode

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/combat/SelfTrap.java:29`

```java
public enum TopMode
```

## meteordevelopment.meteorclient.systems.modules.combat.SelfTrap.BottomMode

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/combat/SelfTrap.java:36`

```java
public enum BottomMode
```

## meteordevelopment.meteorclient.systems.modules.combat.SelfTrap.SelfTrap

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/combat/SelfTrap.java:129`

```java
public SelfTrap()
```

## meteordevelopment.meteorclient.systems.modules.combat.SelfTrap.onActivate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/combat/SelfTrap.java:133`

```java
@Override public void onActivate()
```

## meteordevelopment.meteorclient.systems.modules.combat.SelfWeb

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/combat/SelfWeb.java:20`

```java
public class SelfWeb extends Module
```

## meteordevelopment.meteorclient.systems.modules.combat.SelfWeb.SelfWeb

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/combat/SelfWeb.java:61`

```java
public SelfWeb()
```

## meteordevelopment.meteorclient.systems.modules.combat.SelfWeb.Mode

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/combat/SelfWeb.java:87`

```java
public enum Mode
```

## meteordevelopment.meteorclient.systems.modules.combat.Surround

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/combat/Surround.java:44`

```java
public class Surround extends Module
```

## meteordevelopment.meteorclient.systems.modules.combat.Surround.toActivate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/combat/Surround.java:240`

```java
public ArrayList<Module> toActivate = new ArrayList<>()
```

## meteordevelopment.meteorclient.systems.modules.combat.Surround.Surround

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/combat/Surround.java:243`

```java
public Surround()
```

## meteordevelopment.meteorclient.systems.modules.combat.Surround.onActivate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/combat/Surround.java:277`

```java
@Override public void onActivate()
```

## meteordevelopment.meteorclient.systems.modules.combat.Surround.onDeactivate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/combat/Surround.java:295`

```java
@Override public void onDeactivate()
```

## meteordevelopment.meteorclient.systems.modules.combat.Surround.Center

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/combat/Surround.java:459`

```java
public enum Center
```

## meteordevelopment.meteorclient.systems.modules.combat.Surround.BlockType

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/combat/Surround.java:466`

```java
public enum BlockType
```

## meteordevelopment.meteorclient.systems.modules.misc.AntiPacketKick

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/AntiPacketKick.java:14`

```java
public class AntiPacketKick extends Module
```

## meteordevelopment.meteorclient.systems.modules.misc.AntiPacketKick.catchExceptions

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/AntiPacketKick.java:17`

```java
public final Setting<Boolean> catchExceptions = sgGeneral.add(new BoolSetting.Builder() .name("catch-exceptions") .description("Drops corrupted packets.") .defaultValue(false) .build() )
```

## meteordevelopment.meteorclient.systems.modules.misc.AntiPacketKick.logExceptions

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/AntiPacketKick.java:24`

```java
public final Setting<Boolean> logExceptions = sgGeneral.add(new BoolSetting.Builder() .name("log-exceptions") .description("Logs caught exceptions.") .defaultValue(true) .visible(catchExceptions::get) .build() )
```

## meteordevelopment.meteorclient.systems.modules.misc.AntiPacketKick.AntiPacketKick

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/AntiPacketKick.java:32`

```java
public AntiPacketKick()
```

## meteordevelopment.meteorclient.systems.modules.misc.AntiPacketKick.catchExceptions

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/AntiPacketKick.java:36`

```java
public boolean catchExceptions()
```

## meteordevelopment.meteorclient.systems.modules.misc.AutoReconnect

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/AutoReconnect.java:22`

```java
public class AutoReconnect extends Module
```

## meteordevelopment.meteorclient.systems.modules.misc.AutoReconnect.time

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/AutoReconnect.java:25`

```java
public final Setting<Double> time = sgGeneral.add(new DoubleSetting.Builder() .name("delay") .description("The amount of seconds to wait before reconnecting to the server.") .defaultValue(3.5) .min(0) .decimalPlaces(1) .build() )
```

## meteordevelopment.meteorclient.systems.modules.misc.AutoReconnect.button

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/AutoReconnect.java:34`

```java
public final Setting<Boolean> button = sgGeneral.add(new BoolSetting.Builder() .name("hide-buttons") .description("Will hide the buttons related to Auto Reconnect.") .defaultValue(false) .build() )
```

## meteordevelopment.meteorclient.systems.modules.misc.AutoReconnect.lastServerConnection

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/AutoReconnect.java:41`

```java
public Pair<ServerAddress, ServerData> lastServerConnection
```

## meteordevelopment.meteorclient.systems.modules.misc.AutoReconnect.AutoReconnect

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/AutoReconnect.java:43`

```java
public AutoReconnect()
```

## meteordevelopment.meteorclient.systems.modules.misc.BetterBeacons

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/BetterBeacons.java:11`

```java
public class BetterBeacons extends Module
```

## meteordevelopment.meteorclient.systems.modules.misc.BetterBeacons.BetterBeacons

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/BetterBeacons.java:12`

```java
public BetterBeacons()
```

## meteordevelopment.meteorclient.systems.modules.misc.BetterChat

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/BetterChat.java:49`

```java
public class BetterChat extends Module
```

## meteordevelopment.meteorclient.systems.modules.misc.BetterChat.lines

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/BetterChat.java:245`

```java
public final IntList lines = new IntArrayList()
```

## meteordevelopment.meteorclient.systems.modules.misc.BetterChat.BetterChat

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/BetterChat.java:247`

```java
public BetterChat()
```

## meteordevelopment.meteorclient.systems.modules.misc.BetterChat.removeLine

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/BetterChat.java:386`

```java
public void removeLine(int index)
```

## meteordevelopment.meteorclient.systems.modules.misc.BetterChat.line

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/BetterChat.java:408`

```java
public GuiMessage.Line line
```

## meteordevelopment.meteorclient.systems.modules.misc.BetterChat.registerCustomHead

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/BetterChat.java:414`

```java
public static void registerCustomHead(String prefix, Identifier texture)
```

## meteordevelopment.meteorclient.systems.modules.misc.BetterChat.modifyChatWidth

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/BetterChat.java:423`

```java
public int modifyChatWidth(int width)
```

## meteordevelopment.meteorclient.systems.modules.misc.BetterChat.beforeDrawMessage

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/BetterChat.java:429`

```java
public void beforeDrawMessage(GuiGraphicsExtractor graphics, int y, int color)
```

## meteordevelopment.meteorclient.systems.modules.misc.BetterChat.afterDrawMessage

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/BetterChat.java:438`

```java
public void afterDrawMessage()
```

## meteordevelopment.meteorclient.systems.modules.misc.BetterChat.isInfiniteChatBox

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/BetterChat.java:588`

```java
public boolean isInfiniteChatBox()
```

## meteordevelopment.meteorclient.systems.modules.misc.BetterChat.isLongerChat

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/BetterChat.java:592`

```java
public boolean isLongerChat()
```

## meteordevelopment.meteorclient.systems.modules.misc.BetterChat.keepHistory

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/BetterChat.java:596`

```java
public boolean keepHistory()
```

## meteordevelopment.meteorclient.systems.modules.misc.BetterChat.getExtraChatLines

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/BetterChat.java:600`

```java
public int getExtraChatLines()
```

## meteordevelopment.meteorclient.systems.modules.misc.BookBot

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/BookBot.java:34`

```java
public class BookBot extends Module
```

## meteordevelopment.meteorclient.systems.modules.misc.BookBot.BookBot

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/BookBot.java:127`

```java
public BookBot()
```

## meteordevelopment.meteorclient.systems.modules.misc.BookBot.onActivate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/BookBot.java:131`

```java
@Override public void onActivate()
```

## meteordevelopment.meteorclient.systems.modules.misc.BookBot.Mode

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/BookBot.java:349`

```java
public enum Mode
```

## meteordevelopment.meteorclient.systems.modules.misc.BookBot.RandomType

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/BookBot.java:354`

```java
public enum RandomType
```

## meteordevelopment.meteorclient.systems.modules.misc.DiscordPresence

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/DiscordPresence.java:44`

```java
public class DiscordPresence extends Module
```

## meteordevelopment.meteorclient.systems.modules.misc.DiscordPresence.SelectMode

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/DiscordPresence.java:45`

```java
public enum SelectMode
```

## meteordevelopment.meteorclient.systems.modules.misc.DiscordPresence.customStates

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/DiscordPresence.java:118`

```java
public static final Object2ObjectLinkedOpenHashMap<String, String> customStates = new Object2ObjectLinkedOpenHashMap<>()
```

## meteordevelopment.meteorclient.systems.modules.misc.DiscordPresence.DiscordPresence

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/DiscordPresence.java:125`

```java
public DiscordPresence()
```

## meteordevelopment.meteorclient.systems.modules.misc.DiscordPresence.registerCustomState

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/DiscordPresence.java:134`

```java
public static void registerCustomState(String packageName, String state)
```

## meteordevelopment.meteorclient.systems.modules.misc.DiscordPresence.unregisterCustomState

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/DiscordPresence.java:141`

```java
public static void unregisterCustomState(String packageName)
```

## meteordevelopment.meteorclient.systems.modules.misc.DiscordPresence.onActivate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/DiscordPresence.java:145`

```java
@Override public void onActivate()
```

## meteordevelopment.meteorclient.systems.modules.misc.DiscordPresence.onDeactivate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/DiscordPresence.java:169`

```java
@Override public void onDeactivate()
```

## meteordevelopment.meteorclient.systems.modules.misc.DiscordPresence.getWidget

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/DiscordPresence.java:289`

```java
@Override public WWidget getWidget(GuiTheme theme)
```

## meteordevelopment.meteorclient.systems.modules.misc.InventoryTweaks

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/InventoryTweaks.java:45`

```java
public class InventoryTweaks extends Module
```

## meteordevelopment.meteorclient.systems.modules.misc.InventoryTweaks.stealScreens

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/InventoryTweaks.java:175`

```java
public final Setting<List<MenuType<?>>> stealScreens = sgStealDump.add(new ScreenHandlerListSetting.Builder() .name("steal-screens") .description("Select the screens to display buttons and auto steal.") .defaultValue(List.of(MenuType.GENERIC_9x3, MenuType.GENERIC_9x6)) .build() )
```

## meteordevelopment.meteorclient.systems.modules.misc.InventoryTweaks.InventoryTweaks

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/InventoryTweaks.java:276`

```java
public InventoryTweaks()
```

## meteordevelopment.meteorclient.systems.modules.misc.InventoryTweaks.onActivate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/InventoryTweaks.java:280`

```java
@Override public void onActivate()
```

## meteordevelopment.meteorclient.systems.modules.misc.InventoryTweaks.onDeactivate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/InventoryTweaks.java:285`

```java
@Override public void onDeactivate()
```

## meteordevelopment.meteorclient.systems.modules.misc.InventoryTweaks.steal

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/InventoryTweaks.java:458`

```java
public void steal(AbstractContainerMenu handler)
```

## meteordevelopment.meteorclient.systems.modules.misc.InventoryTweaks.dump

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/InventoryTweaks.java:462`

```java
public void dump(AbstractContainerMenu handler)
```

## meteordevelopment.meteorclient.systems.modules.misc.InventoryTweaks.showButtons

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/InventoryTweaks.java:467`

```java
public boolean showButtons()
```

## meteordevelopment.meteorclient.systems.modules.misc.InventoryTweaks.mouseDragItemMove

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/InventoryTweaks.java:471`

```java
public boolean mouseDragItemMove()
```

## meteordevelopment.meteorclient.systems.modules.misc.InventoryTweaks.uncapBundleScrolling

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/InventoryTweaks.java:475`

```java
public boolean uncapBundleScrolling()
```

## meteordevelopment.meteorclient.systems.modules.misc.InventoryTweaks.frameInput

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/InventoryTweaks.java:479`

```java
public boolean frameInput()
```

## meteordevelopment.meteorclient.systems.modules.misc.InventoryTweaks.canSteal

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/InventoryTweaks.java:483`

```java
public boolean canSteal(AbstractContainerMenu handler)
```

## meteordevelopment.meteorclient.systems.modules.misc.InventoryTweaks.ListMode

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/InventoryTweaks.java:503`

```java
public enum ListMode
```

## meteordevelopment.meteorclient.systems.modules.misc.MessageAura

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/MessageAura.java:20`

```java
public class MessageAura extends Module
```

## meteordevelopment.meteorclient.systems.modules.misc.MessageAura.MessageAura

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/MessageAura.java:37`

```java
public MessageAura()
```

## meteordevelopment.meteorclient.systems.modules.misc.Notebot

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/Notebot.java:63`

```java
public class Notebot extends Module
```

## meteordevelopment.meteorclient.systems.modules.misc.Notebot.tickDelay

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/Notebot.java:69`

```java
public final Setting<Integer> tickDelay = sgGeneral.add(new IntSetting.Builder() .name("tick-delay") .description("The delay when loading a song.") .defaultValue(1) .sliderRange(1, 20) .min(1) .build() )
```

## meteordevelopment.meteorclient.systems.modules.misc.Notebot.concurrentTuneBlocks

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/Notebot.java:78`

```java
public final Setting<Integer> concurrentTuneBlocks = sgGeneral.add(new IntSetting.Builder() .name("concurrent-tune-blocks") .description("How many noteblocks can be tuned at the same time. On Paper it is recommended to set it to 1 to avoid bugs.") .defaultValue(1) .min(1) .sliderRange(1, 20) .build() )
```

## meteordevelopment.meteorclient.systems.modules.misc.Notebot.mode

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/Notebot.java:87`

```java
public final Setting<NotebotUtils.NotebotMode> mode = sgGeneral.add(new EnumSetting.Builder<NotebotUtils.NotebotMode>() .name("mode") .description("Select mode of notebot") .defaultValue(NotebotUtils.NotebotMode.ExactInstruments) .build() )
```

## meteordevelopment.meteorclient.systems.modules.misc.Notebot.instrumentDetectMode

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/Notebot.java:94`

```java
public final Setting<InstrumentDetectMode> instrumentDetectMode = sgGeneral.add(new EnumSetting.Builder<InstrumentDetectMode>() .name("instrument-detect-mode") .description("Select an instrument detect mode. Can be useful when server has a plugin that modifies noteblock state (e.g ItemsAdder) but noteblock can still play the right note") .defaultValue(InstrumentDetectMode.BlockState) .build() )
```

## meteordevelopment.meteorclient.systems.modules.misc.Notebot.polyphonic

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/Notebot.java:101`

```java
public final Setting<Boolean> polyphonic = sgGeneral.add(new BoolSetting.Builder() .name("polyphonic") .description("Whether or not to allow multiple notes to be played at the same time") .defaultValue(true) .build() )
```

## meteordevelopment.meteorclient.systems.modules.misc.Notebot.autoRotate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/Notebot.java:108`

```java
public final Setting<Boolean> autoRotate = sgGeneral.add(new BoolSetting.Builder() .name("auto-rotate") .description("Should client look at note block when it wants to hit it") .defaultValue(true) .build() )
```

## meteordevelopment.meteorclient.systems.modules.misc.Notebot.autoPlay

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/Notebot.java:115`

```java
public final Setting<Boolean> autoPlay = sgGeneral.add(new BoolSetting.Builder() .name("auto-play") .description("Auto plays random songs") .defaultValue(false) .build() )
```

## meteordevelopment.meteorclient.systems.modules.misc.Notebot.transposeOutOfRange

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/Notebot.java:122`

```java
public final Setting<Boolean> transposeOutOfRange = sgGeneral.add(new BoolSetting.Builder() .name("transpose-out-of-range") .description("Transposes out of range notes") .defaultValue(false) .build() )
```

## meteordevelopment.meteorclient.systems.modules.misc.Notebot.swingArm

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/Notebot.java:129`

```java
public final Setting<Boolean> swingArm = sgGeneral.add(new BoolSetting.Builder() .name("swing-arm") .description("Should swing arm on hit") .defaultValue(true) .build() )
```

## meteordevelopment.meteorclient.systems.modules.misc.Notebot.checkNoteblocksAgainDelay

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/Notebot.java:136`

```java
public final Setting<Integer> checkNoteblocksAgainDelay = sgGeneral.add(new IntSetting.Builder() .name("check-noteblocks-again-delay") .description("How much delay should be between end of tuning and checking again") .defaultValue(10) .min(1) .sliderRange(1, 20) .build() )
```

## meteordevelopment.meteorclient.systems.modules.misc.Notebot.renderText

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/Notebot.java:145`

```java
public final Setting<Boolean> renderText = sgRender.add(new BoolSetting.Builder() .name("render-text") .description("Whether or not to render the text above noteblocks.") .defaultValue(true) .build() )
```

## meteordevelopment.meteorclient.systems.modules.misc.Notebot.renderBoxes

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/Notebot.java:152`

```java
public final Setting<Boolean> renderBoxes = sgRender.add(new BoolSetting.Builder() .name("render-boxes") .description("Whether or not to render the outline around the noteblocks.") .defaultValue(true) .build() )
```

## meteordevelopment.meteorclient.systems.modules.misc.Notebot.shapeMode

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/Notebot.java:159`

```java
public final Setting<ShapeMode> shapeMode = sgRender.add(new EnumSetting.Builder<ShapeMode>() .name("shape-mode") .description("How the shapes are rendered.") .defaultValue(ShapeMode.Both) .build() )
```

## meteordevelopment.meteorclient.systems.modules.misc.Notebot.untunedSideColor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/Notebot.java:166`

```java
public final Setting<SettingColor> untunedSideColor = sgRender.add(new ColorSetting.Builder() .name("untuned-side-color") .description("The color of the sides of the untuned blocks being rendered.") .defaultValue(new SettingColor(204, 0, 0, 10)) .build() )
```

## meteordevelopment.meteorclient.systems.modules.misc.Notebot.untunedLineColor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/Notebot.java:173`

```java
public final Setting<SettingColor> untunedLineColor = sgRender.add(new ColorSetting.Builder() .name("untuned-line-color") .description("The color of the lines of the untuned blocks being rendered.") .defaultValue(new SettingColor(204, 0, 0, 255)) .build() )
```

## meteordevelopment.meteorclient.systems.modules.misc.Notebot.tunedSideColor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/Notebot.java:180`

```java
public final Setting<SettingColor> tunedSideColor = sgRender.add(new ColorSetting.Builder() .name("tuned-side-color") .description("The color of the sides of the tuned blocks being rendered.") .defaultValue(new SettingColor(0, 204, 0, 10)) .build() )
```

## meteordevelopment.meteorclient.systems.modules.misc.Notebot.tunedLineColor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/Notebot.java:187`

```java
public final Setting<SettingColor> tunedLineColor = sgRender.add(new ColorSetting.Builder() .name("tuned-line-color") .description("The color of the lines of the tuned blocks being rendered.") .defaultValue(new SettingColor(0, 204, 0, 255)) .build() )
```

## meteordevelopment.meteorclient.systems.modules.misc.Notebot.tuneHitSideColor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/Notebot.java:194`

```java
public final Setting<SettingColor> tuneHitSideColor = sgRender.add(new ColorSetting.Builder() .name("hit-side-color") .description("The color of the sides being rendered on noteblock tune hit.") .defaultValue(new SettingColor(255, 153, 0, 10)) .build() )
```

## meteordevelopment.meteorclient.systems.modules.misc.Notebot.scannedNoteblockSideColor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/Notebot.java:208`

```java
public final Setting<SettingColor> scannedNoteblockSideColor = sgRender.add(new ColorSetting.Builder() .name("scanned-noteblock-side-color") .description("The color of the sides of the scanned noteblocks being rendered.") .defaultValue(new SettingColor(255, 255, 0, 30)) .build() )
```

## meteordevelopment.meteorclient.systems.modules.misc.Notebot.noteTextScale

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/Notebot.java:222`

```java
public final Setting<Double> noteTextScale = sgRender.add(new DoubleSetting.Builder() .name("note-text-scale") .description("The scale.") .defaultValue(1.5) .min(0) .build() )
```

## meteordevelopment.meteorclient.systems.modules.misc.Notebot.showScannedNoteblocks

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/Notebot.java:230`

```java
public final Setting<Boolean> showScannedNoteblocks = sgRender.add(new BoolSetting.Builder() .name("show-scanned-noteblocks") .description("Show scanned Noteblocks") .defaultValue(false) .build() )
```

## meteordevelopment.meteorclient.systems.modules.misc.Notebot.Notebot

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/Notebot.java:256`

```java
public Notebot()
```

## meteordevelopment.meteorclient.systems.modules.misc.Notebot.getInfoString

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/Notebot.java:272`

```java
@Override public String getInfoString()
```

## meteordevelopment.meteorclient.systems.modules.misc.Notebot.onActivate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/Notebot.java:281`

```java
@Override public void onActivate()
```

## meteordevelopment.meteorclient.systems.modules.misc.Notebot.getWidget

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/Notebot.java:561`

```java
@Override public WWidget getWidget(GuiTheme theme)
```

## meteordevelopment.meteorclient.systems.modules.misc.Notebot.getStatus

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/Notebot.java:604`

```java
public String getStatus()
```

## meteordevelopment.meteorclient.systems.modules.misc.Notebot.play

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/Notebot.java:617`

```java
public void play()
```

## meteordevelopment.meteorclient.systems.modules.misc.Notebot.pause

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/Notebot.java:629`

```java
public void pause()
```

## meteordevelopment.meteorclient.systems.modules.misc.Notebot.stop

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/Notebot.java:640`

```java
public void stop()
```

## meteordevelopment.meteorclient.systems.modules.misc.Notebot.onSongEnd

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/Notebot.java:646`

```java
public void onSongEnd()
```

## meteordevelopment.meteorclient.systems.modules.misc.Notebot.playRandomSong

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/Notebot.java:654`

```java
public void playRandomSong()
```

## meteordevelopment.meteorclient.systems.modules.misc.Notebot.disableNotebot

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/Notebot.java:666`

```java
public void disableNotebot()
```

## meteordevelopment.meteorclient.systems.modules.misc.Notebot.loadSong

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/Notebot.java:676`

```java
public void loadSong(File file)
```

## meteordevelopment.meteorclient.systems.modules.misc.Notebot.previewSong

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/Notebot.java:693`

```java
public void previewSong(File file)
```

## meteordevelopment.meteorclient.systems.modules.misc.Notebot.loadFileToMap

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/Notebot.java:712`

```java
public boolean loadFileToMap(File file, Runnable callback)
```

## meteordevelopment.meteorclient.systems.modules.misc.Notebot.updateStatus

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/Notebot.java:880`

```java
public void updateStatus()
```

## meteordevelopment.meteorclient.systems.modules.misc.Notebot.getMappedInstrument

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/Notebot.java:948`

```java
@Nullable public NoteBlockInstrument getMappedInstrument(@NonNull NoteBlockInstrument inst)
```

## meteordevelopment.meteorclient.systems.modules.misc.Notebot.Stage

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/Notebot.java:971`

```java
public enum Stage
```

## meteordevelopment.meteorclient.systems.modules.misc.Notebot.PlayingMode

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/Notebot.java:980`

```java
public enum PlayingMode
```

## meteordevelopment.meteorclient.systems.modules.misc.Notifier

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/Notifier.java:48`

```java
public class Notifier extends Module
```

## meteordevelopment.meteorclient.systems.modules.misc.Notifier.Notifier

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/Notifier.java:203`

```java
public Notifier()
```

## meteordevelopment.meteorclient.systems.modules.misc.Notifier.onActivate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/Notifier.java:270`

```java
@Override public void onActivate()
```

## meteordevelopment.meteorclient.systems.modules.misc.Notifier.onDeactivate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/Notifier.java:277`

```java
@Override public void onDeactivate()
```

## meteordevelopment.meteorclient.systems.modules.misc.Notifier.Event

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/Notifier.java:415`

```java
public enum Event
```

## meteordevelopment.meteorclient.systems.modules.misc.Notifier.JoinLeaveModes

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/Notifier.java:421`

```java
public enum JoinLeaveModes
```

## meteordevelopment.meteorclient.systems.modules.misc.PacketCanceller

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/PacketCanceller.java:22`

```java
public class PacketCanceller extends Module
```

## meteordevelopment.meteorclient.systems.modules.misc.PacketCanceller.PacketCanceller

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/PacketCanceller.java:39`

```java
public PacketCanceller()
```

## meteordevelopment.meteorclient.systems.modules.misc.PacketLogger

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/PacketLogger.java:34`

```java
@NullMarked public class PacketLogger extends Module
```

## meteordevelopment.meteorclient.systems.modules.misc.PacketLogger.PacketLogger

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/PacketLogger.java:138`

```java
public PacketLogger()
```

## meteordevelopment.meteorclient.systems.modules.misc.PacketLogger.onActivate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/PacketLogger.java:143`

```java
@Override public void onActivate()
```

## meteordevelopment.meteorclient.systems.modules.misc.PacketLogger.onDeactivate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/PacketLogger.java:165`

```java
@Override public void onDeactivate()
```

## meteordevelopment.meteorclient.systems.modules.misc.ServerSpoof

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/ServerSpoof.java:35`

```java
public class ServerSpoof extends Module
```

## meteordevelopment.meteorclient.systems.modules.misc.ServerSpoof.silentAcceptResourcePack

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/ServerSpoof.java:76`

```java
public boolean silentAcceptResourcePack = false
```

## meteordevelopment.meteorclient.systems.modules.misc.ServerSpoof.ServerSpoof

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/ServerSpoof.java:78`

```java
public ServerSpoof()
```

## meteordevelopment.meteorclient.systems.modules.misc.SoundBlocker

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/SoundBlocker.java:21`

```java
public class SoundBlocker extends Module
```

## meteordevelopment.meteorclient.systems.modules.misc.SoundBlocker.SoundBlocker

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/SoundBlocker.java:30`

```java
public SoundBlocker()
```

## meteordevelopment.meteorclient.systems.modules.misc.SoundBlocker.shouldBlock

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/SoundBlocker.java:44`

```java
public boolean shouldBlock(SoundInstance soundInstance)
```

## meteordevelopment.meteorclient.systems.modules.misc.Spam

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/Spam.java:22`

```java
public class Spam extends Module
```

## meteordevelopment.meteorclient.systems.modules.misc.Spam.Spam

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/Spam.java:116`

```java
public Spam()
```

## meteordevelopment.meteorclient.systems.modules.misc.Spam.onActivate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/Spam.java:120`

```java
@Override public void onActivate()
```

## meteordevelopment.meteorclient.systems.modules.misc.swarm.Swarm

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/swarm/Swarm.java:24`

```java
public class Swarm extends Module
```

## meteordevelopment.meteorclient.systems.modules.misc.swarm.Swarm.mode

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/swarm/Swarm.java:27`

```java
public final Setting<Mode> mode = sgGeneral.add(new EnumSetting.Builder<Mode>() .name("mode") .description("What type of client to run.") .defaultValue(Mode.Host) .build() )
```

## meteordevelopment.meteorclient.systems.modules.misc.swarm.Swarm.host

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/swarm/Swarm.java:51`

```java
public SwarmHost host
```

## meteordevelopment.meteorclient.systems.modules.misc.swarm.Swarm.worker

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/swarm/Swarm.java:52`

```java
public SwarmWorker worker
```

## meteordevelopment.meteorclient.systems.modules.misc.swarm.Swarm.Swarm

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/swarm/Swarm.java:54`

```java
public Swarm()
```

## meteordevelopment.meteorclient.systems.modules.misc.swarm.Swarm.getWidget

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/swarm/Swarm.java:58`

```java
@Override public WWidget getWidget(GuiTheme theme)
```

## meteordevelopment.meteorclient.systems.modules.misc.swarm.Swarm.getInfoString

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/swarm/Swarm.java:82`

```java
@Override public String getInfoString()
```

## meteordevelopment.meteorclient.systems.modules.misc.swarm.Swarm.onActivate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/swarm/Swarm.java:87`

```java
@Override public void onActivate()
```

## meteordevelopment.meteorclient.systems.modules.misc.swarm.Swarm.onDeactivate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/swarm/Swarm.java:92`

```java
@Override public void onDeactivate()
```

## meteordevelopment.meteorclient.systems.modules.misc.swarm.Swarm.close

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/swarm/Swarm.java:97`

```java
public void close()
```

## meteordevelopment.meteorclient.systems.modules.misc.swarm.Swarm.toggle

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/swarm/Swarm.java:121`

```java
@Override public void toggle()
```

## meteordevelopment.meteorclient.systems.modules.misc.swarm.Swarm.isHost

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/swarm/Swarm.java:127`

```java
public boolean isHost()
```

## meteordevelopment.meteorclient.systems.modules.misc.swarm.Swarm.isWorker

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/swarm/Swarm.java:131`

```java
public boolean isWorker()
```

## meteordevelopment.meteorclient.systems.modules.misc.swarm.Swarm.Mode

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/swarm/Swarm.java:140`

```java
public enum Mode
```

## meteordevelopment.meteorclient.systems.modules.misc.swarm.SwarmConnection

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/swarm/SwarmConnection.java:14`

```java
public class SwarmConnection extends Thread
```

## meteordevelopment.meteorclient.systems.modules.misc.swarm.SwarmConnection.socket

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/swarm/SwarmConnection.java:15`

```java
public final Socket socket
```

## meteordevelopment.meteorclient.systems.modules.misc.swarm.SwarmConnection.messageToSend

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/swarm/SwarmConnection.java:16`

```java
public String messageToSend
```

## meteordevelopment.meteorclient.systems.modules.misc.swarm.SwarmConnection.SwarmConnection

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/swarm/SwarmConnection.java:18`

```java
public SwarmConnection(Socket socket)
```

## meteordevelopment.meteorclient.systems.modules.misc.swarm.SwarmConnection.run

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/swarm/SwarmConnection.java:23`

```java
@Override public void run()
```

## meteordevelopment.meteorclient.systems.modules.misc.swarm.SwarmConnection.disconnect

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/swarm/SwarmConnection.java:51`

```java
public void disconnect()
```

## meteordevelopment.meteorclient.systems.modules.misc.swarm.SwarmConnection.getConnection

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/swarm/SwarmConnection.java:63`

```java
public String getConnection()
```

## meteordevelopment.meteorclient.systems.modules.misc.swarm.SwarmHost

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/swarm/SwarmHost.java:15`

```java
public class SwarmHost extends Thread
```

## meteordevelopment.meteorclient.systems.modules.misc.swarm.SwarmHost.SwarmHost

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/swarm/SwarmHost.java:19`

```java
public SwarmHost(int port)
```

## meteordevelopment.meteorclient.systems.modules.misc.swarm.SwarmHost.run

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/swarm/SwarmHost.java:31`

```java
@Override public void run()
```

## meteordevelopment.meteorclient.systems.modules.misc.swarm.SwarmHost.assignConnectionToSubServer

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/swarm/SwarmHost.java:46`

```java
public void assignConnectionToSubServer(Socket connection)
```

## meteordevelopment.meteorclient.systems.modules.misc.swarm.SwarmHost.disconnect

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/swarm/SwarmHost.java:55`

```java
public void disconnect()
```

## meteordevelopment.meteorclient.systems.modules.misc.swarm.SwarmHost.sendMessage

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/swarm/SwarmHost.java:71`

```java
public void sendMessage(String s)
```

## meteordevelopment.meteorclient.systems.modules.misc.swarm.SwarmHost.getConnections

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/swarm/SwarmHost.java:81`

```java
public SwarmConnection[] getConnections()
```

## meteordevelopment.meteorclient.systems.modules.misc.swarm.SwarmHost.getConnectionCount

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/swarm/SwarmHost.java:85`

```java
public int getConnectionCount()
```

## meteordevelopment.meteorclient.systems.modules.misc.swarm.SwarmWorker

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/swarm/SwarmWorker.java:17`

```java
public class SwarmWorker extends Thread
```

## meteordevelopment.meteorclient.systems.modules.misc.swarm.SwarmWorker.target

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/swarm/SwarmWorker.java:19`

```java
public Block target
```

## meteordevelopment.meteorclient.systems.modules.misc.swarm.SwarmWorker.SwarmWorker

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/swarm/SwarmWorker.java:21`

```java
public SwarmWorker(String ip, int port)
```

## meteordevelopment.meteorclient.systems.modules.misc.swarm.SwarmWorker.run

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/swarm/SwarmWorker.java:33`

```java
@Override public void run()
```

## meteordevelopment.meteorclient.systems.modules.misc.swarm.SwarmWorker.disconnect

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/swarm/SwarmWorker.java:64`

```java
public void disconnect()
```

## meteordevelopment.meteorclient.systems.modules.misc.swarm.SwarmWorker.tick

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/swarm/SwarmWorker.java:78`

```java
public void tick()
```

## meteordevelopment.meteorclient.systems.modules.misc.swarm.SwarmWorker.getConnection

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/swarm/SwarmWorker.java:87`

```java
public String getConnection()
```

## meteordevelopment.meteorclient.systems.modules.movement.AirJump

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/AirJump.java:20`

```java
public class AirJump extends Module
```

## meteordevelopment.meteorclient.systems.modules.movement.AirJump.AirJump

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/AirJump.java:32`

```java
public AirJump()
```

## meteordevelopment.meteorclient.systems.modules.movement.AirJump.onActivate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/AirJump.java:36`

```java
@Override public void onActivate()
```

## meteordevelopment.meteorclient.systems.modules.movement.Anchor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/Anchor.java:20`

```java
public class Anchor extends Module
```

## meteordevelopment.meteorclient.systems.modules.movement.Anchor.cancelJump

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/Anchor.java:69`

```java
public boolean cancelJump
```

## meteordevelopment.meteorclient.systems.modules.movement.Anchor.controlMovement

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/Anchor.java:71`

```java
public boolean controlMovement
```

## meteordevelopment.meteorclient.systems.modules.movement.Anchor.deltaX

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/Anchor.java:72`

```java
public double deltaX, deltaZ
```

## meteordevelopment.meteorclient.systems.modules.movement.Anchor.deltaZ

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/Anchor.java:72`

```java
public double deltaX, deltaZ
```

## meteordevelopment.meteorclient.systems.modules.movement.Anchor.Anchor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/Anchor.java:74`

```java
public Anchor()
```

## meteordevelopment.meteorclient.systems.modules.movement.Anchor.onActivate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/Anchor.java:78`

```java
@Override public void onActivate()
```

## meteordevelopment.meteorclient.systems.modules.movement.AntiVoid

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/AntiVoid.java:18`

```java
public class AntiVoid extends Module
```

## meteordevelopment.meteorclient.systems.modules.movement.AntiVoid.AntiVoid

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/AntiVoid.java:31`

```java
public AntiVoid()
```

## meteordevelopment.meteorclient.systems.modules.movement.AntiVoid.onActivate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/AntiVoid.java:35`

```java
@Override public void onActivate()
```

## meteordevelopment.meteorclient.systems.modules.movement.AntiVoid.onDeactivate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/AntiVoid.java:40`

```java
@Override public void onDeactivate()
```

## meteordevelopment.meteorclient.systems.modules.movement.AntiVoid.Mode

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/AntiVoid.java:68`

```java
public enum Mode
```

## meteordevelopment.meteorclient.systems.modules.movement.AutoJump

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/AutoJump.java:18`

```java
public class AutoJump extends Module
```

## meteordevelopment.meteorclient.systems.modules.movement.AutoJump.AutoJump

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/AutoJump.java:44`

```java
public AutoJump()
```

## meteordevelopment.meteorclient.systems.modules.movement.AutoJump.JumpWhen

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/AutoJump.java:64`

```java
public enum JumpWhen
```

## meteordevelopment.meteorclient.systems.modules.movement.AutoJump.Mode

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/AutoJump.java:70`

```java
public enum Mode
```

## meteordevelopment.meteorclient.systems.modules.movement.AutoWalk

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/AutoWalk.java:29`

```java
public class AutoWalk extends Module
```

## meteordevelopment.meteorclient.systems.modules.movement.AutoWalk.AutoWalk

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/AutoWalk.java:84`

```java
public AutoWalk()
```

## meteordevelopment.meteorclient.systems.modules.movement.AutoWalk.onActivate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/AutoWalk.java:88`

```java
@Override public void onActivate()
```

## meteordevelopment.meteorclient.systems.modules.movement.AutoWalk.onDeactivate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/AutoWalk.java:93`

```java
@Override public void onDeactivate()
```

## meteordevelopment.meteorclient.systems.modules.movement.AutoWalk.Mode

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/AutoWalk.java:181`

```java
public enum Mode
```

## meteordevelopment.meteorclient.systems.modules.movement.AutoWalk.Direction

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/AutoWalk.java:186`

```java
public enum Direction
```

## meteordevelopment.meteorclient.systems.modules.movement.AutoWasp

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/AutoWasp.java:33`

```java
public class AutoWasp extends Module
```

## meteordevelopment.meteorclient.systems.modules.movement.AutoWasp.target

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/AutoWasp.java:85`

```java
public Player target
```

## meteordevelopment.meteorclient.systems.modules.movement.AutoWasp.AutoWasp

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/AutoWasp.java:89`

```java
public AutoWasp()
```

## meteordevelopment.meteorclient.systems.modules.movement.AutoWasp.onActivate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/AutoWasp.java:93`

```java
@Override public void onActivate()
```

## meteordevelopment.meteorclient.systems.modules.movement.AutoWasp.onDeactivate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/AutoWasp.java:113`

```java
@Override public void onDeactivate()
```

## meteordevelopment.meteorclient.systems.modules.movement.AutoWasp.Action

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/AutoWasp.java:216`

```java
public enum Action
```

## meteordevelopment.meteorclient.systems.modules.movement.AutoWasp.Action.toString

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/AutoWasp.java:221`

```java
@Override public String toString()
```

## meteordevelopment.meteorclient.systems.modules.movement.Blink

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/Blink.java:26`

```java
public class Blink extends Module
```

## meteordevelopment.meteorclient.systems.modules.movement.Blink.Blink

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/Blink.java:64`

```java
public Blink()
```

## meteordevelopment.meteorclient.systems.modules.movement.Blink.onActivate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/Blink.java:70`

```java
@Override public void onActivate()
```

## meteordevelopment.meteorclient.systems.modules.movement.Blink.onDeactivate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/Blink.java:85`

```java
@Override public void onDeactivate()
```

## meteordevelopment.meteorclient.systems.modules.movement.Blink.getInfoString

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/Blink.java:146`

```java
@Override public String getInfoString()
```

## meteordevelopment.meteorclient.systems.modules.movement.ClickTP

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/ClickTP.java:28`

```java
public class ClickTP extends Module
```

## meteordevelopment.meteorclient.systems.modules.movement.ClickTP.ClickTP

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/ClickTP.java:30`

```java
public ClickTP()
```

## meteordevelopment.meteorclient.systems.modules.movement.ElytraBoost

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/ElytraBoost.java:30`

```java
public class ElytraBoost extends Module
```

## meteordevelopment.meteorclient.systems.modules.movement.ElytraBoost.ElytraBoost

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/ElytraBoost.java:66`

```java
public ElytraBoost()
```

## meteordevelopment.meteorclient.systems.modules.movement.ElytraBoost.onDeactivate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/ElytraBoost.java:70`

```java
@Override public void onDeactivate()
```

## meteordevelopment.meteorclient.systems.modules.movement.ElytraBoost.isFirework

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/ElytraBoost.java:106`

```java
public boolean isFirework(FireworkRocketEntity firework)
```

## meteordevelopment.meteorclient.systems.modules.movement.EntityControl

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/EntityControl.java:31`

```java
public class EntityControl extends Module
```

## meteordevelopment.meteorclient.systems.modules.movement.EntityControl.lockYaw

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/EntityControl.java:67`

```java
public final Setting<Boolean> lockYaw = sgControl.add(new BoolSetting.Builder() .name("lock-yaw") .description("Locks the Entity's yaw.") .defaultValue(true) .build() )
```

## meteordevelopment.meteorclient.systems.modules.movement.EntityControl.EntityControl

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/EntityControl.java:158`

```java
public EntityControl()
```

## meteordevelopment.meteorclient.systems.modules.movement.EntityControl.onActivate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/EntityControl.java:166`

```java
@Override public void onActivate()
```

## meteordevelopment.meteorclient.systems.modules.movement.EntityControl.spoofSaddle

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/EntityControl.java:239`

```java
public boolean spoofSaddle()
```

## meteordevelopment.meteorclient.systems.modules.movement.EntityControl.maxJump

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/EntityControl.java:243`

```java
public boolean maxJump()
```

## meteordevelopment.meteorclient.systems.modules.movement.EntityControl.cancelJump

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/EntityControl.java:247`

```java
public boolean cancelJump()
```

## meteordevelopment.meteorclient.systems.modules.movement.FastClimb

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/FastClimb.java:23`

```java
public class FastClimb extends Module
```

## meteordevelopment.meteorclient.systems.modules.movement.FastClimb.FastClimb

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/FastClimb.java:54`

```java
public FastClimb()
```

## meteordevelopment.meteorclient.systems.modules.movement.FastClimb.onActivate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/FastClimb.java:58`

```java
@Override public void onActivate()
```

## meteordevelopment.meteorclient.systems.modules.movement.Flight

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/Flight.java:22`

```java
public class Flight extends Module
```

## meteordevelopment.meteorclient.systems.modules.movement.Flight.Flight

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/Flight.java:92`

```java
public Flight()
```

## meteordevelopment.meteorclient.systems.modules.movement.Flight.onActivate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/Flight.java:96`

```java
@Override public void onActivate()
```

## meteordevelopment.meteorclient.systems.modules.movement.Flight.onDeactivate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/Flight.java:105`

```java
@Override public void onDeactivate()
```

## meteordevelopment.meteorclient.systems.modules.movement.Flight.getFlyingSpeed

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/Flight.java:253`

```java
public float getFlyingSpeed()
```

## meteordevelopment.meteorclient.systems.modules.movement.Flight.noSneak

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/Flight.java:260`

```java
public boolean noSneak()
```

## meteordevelopment.meteorclient.systems.modules.movement.Flight.Mode

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/Flight.java:264`

```java
public enum Mode
```

## meteordevelopment.meteorclient.systems.modules.movement.Flight.AntiKickMode

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/Flight.java:269`

```java
public enum AntiKickMode
```

## meteordevelopment.meteorclient.systems.modules.movement.GUIMove

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/GUIMove.java:32`

```java
public class GUIMove extends Module
```

## meteordevelopment.meteorclient.systems.modules.movement.GUIMove.Screens

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/GUIMove.java:33`

```java
public enum Screens
```

## meteordevelopment.meteorclient.systems.modules.movement.GUIMove.jump

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/GUIMove.java:48`

```java
public final Setting<Boolean> jump = sgGeneral.add(new BoolSetting.Builder() .name("jump") .description("Allows you to jump while in GUIs.") .defaultValue(true) .onChanged(aBoolean -> { if (isActive() && !aBoolean) mc.options.keyJump.setDown(false); }) .build() )
```

## meteordevelopment.meteorclient.systems.modules.movement.GUIMove.sneak

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/GUIMove.java:58`

```java
public final Setting<Boolean> sneak = sgGeneral.add(new BoolSetting.Builder() .name("sneak") .description("Allows you to sneak while in GUIs.") .defaultValue(true) .onChanged(aBoolean -> { if (isActive() && !aBoolean) mc.options.keyShift.setDown(false); }) .build() )
```

## meteordevelopment.meteorclient.systems.modules.movement.GUIMove.sprint

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/GUIMove.java:68`

```java
public final Setting<Boolean> sprint = sgGeneral.add(new BoolSetting.Builder() .name("sprint") .description("Allows you to sprint while in GUIs.") .defaultValue(true) .onChanged(aBoolean -> { if (isActive() && !aBoolean) mc.options.keySprint.setDown(false); }) .build() )
```

## meteordevelopment.meteorclient.systems.modules.movement.GUIMove.GUIMove

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/GUIMove.java:95`

```java
public GUIMove()
```

## meteordevelopment.meteorclient.systems.modules.movement.GUIMove.onActivate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/GUIMove.java:99`

```java
@Override public void onActivate()
```

## meteordevelopment.meteorclient.systems.modules.movement.GUIMove.onDeactivate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/GUIMove.java:104`

```java
@Override public void onDeactivate()
```

## meteordevelopment.meteorclient.systems.modules.movement.GUIMove.disableSpace

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/GUIMove.java:123`

```java
public boolean disableSpace()
```

## meteordevelopment.meteorclient.systems.modules.movement.GUIMove.disableArrows

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/GUIMove.java:127`

```java
public boolean disableArrows()
```

## meteordevelopment.meteorclient.systems.modules.movement.GUIMove.skip

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/GUIMove.java:208`

```java
public boolean skip()
```

## meteordevelopment.meteorclient.systems.modules.movement.GUIMove.skip

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/GUIMove.java:212`

```java
public boolean skip(Screen screen)
```

## meteordevelopment.meteorclient.systems.modules.movement.HighJump

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/HighJump.java:16`

```java
public class HighJump extends Module
```

## meteordevelopment.meteorclient.systems.modules.movement.HighJump.HighJump

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/HighJump.java:27`

```java
public HighJump()
```

## meteordevelopment.meteorclient.systems.modules.movement.Jesus

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/Jesus.java:42`

```java
public class Jesus extends Module
```

## meteordevelopment.meteorclient.systems.modules.movement.Jesus.isInBubbleColumn

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/Jesus.java:172`

```java
public boolean isInBubbleColumn = false
```

## meteordevelopment.meteorclient.systems.modules.movement.Jesus.Jesus

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/Jesus.java:174`

```java
public Jesus()
```

## meteordevelopment.meteorclient.systems.modules.movement.Jesus.onActivate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/Jesus.java:178`

```java
@Override public void onActivate()
```

## meteordevelopment.meteorclient.systems.modules.movement.Jesus.onDeactivate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/Jesus.java:187`

```java
@Override public void onDeactivate()
```

## meteordevelopment.meteorclient.systems.modules.movement.Jesus.Mode

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/Jesus.java:352`

```java
public enum Mode
```

## meteordevelopment.meteorclient.systems.modules.movement.Jesus.canWalkOnPowderSnow

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/Jesus.java:357`

```java
public boolean canWalkOnPowderSnow()
```

## meteordevelopment.meteorclient.systems.modules.movement.LongJump

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/LongJump.java:23`

```java
public class LongJump extends Module
```

## meteordevelopment.meteorclient.systems.modules.movement.LongJump.jumpMode

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/LongJump.java:26`

```java
public final Setting<JumpMode> jumpMode = sgGeneral.add(new EnumSetting.Builder<JumpMode>() .name("mode") .description("The method of jumping.") .defaultValue(JumpMode.Vanilla) .build() )
```

## meteordevelopment.meteorclient.systems.modules.movement.LongJump.timer

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/LongJump.java:89`

```java
public final Setting<Double> timer = sgGeneral.add(new DoubleSetting.Builder() .name("timer") .description("Timer override.") .defaultValue(1) .min(0.01) .sliderMin(0.01) .build() )
```

## meteordevelopment.meteorclient.systems.modules.movement.LongJump.LongJump

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/LongJump.java:113`

```java
public LongJump()
```

## meteordevelopment.meteorclient.systems.modules.movement.LongJump.onActivate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/LongJump.java:124`

```java
@Override public void onActivate()
```

## meteordevelopment.meteorclient.systems.modules.movement.LongJump.onDeactivate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/LongJump.java:132`

```java
@Override public void onDeactivate()
```

## meteordevelopment.meteorclient.systems.modules.movement.LongJump.JumpMode

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/LongJump.java:303`

```java
public enum JumpMode
```

## meteordevelopment.meteorclient.systems.modules.movement.NoFall

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/NoFall.java:58`

```java
public class NoFall extends Module
```

## meteordevelopment.meteorclient.systems.modules.movement.NoFall.NoFall

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/NoFall.java:138`

```java
public NoFall()
```

## meteordevelopment.meteorclient.systems.modules.movement.NoFall.onActivate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/NoFall.java:142`

```java
@Override public void onActivate()
```

## meteordevelopment.meteorclient.systems.modules.movement.NoFall.onDeactivate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/NoFall.java:151`

```java
@Override public void onDeactivate()
```

## meteordevelopment.meteorclient.systems.modules.movement.NoFall.cancelBounce

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/NoFall.java:337`

```java
public boolean cancelBounce()
```

## meteordevelopment.meteorclient.systems.modules.movement.NoFall.getInfoString

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/NoFall.java:465`

```java
@Override public String getInfoString()
```

## meteordevelopment.meteorclient.systems.modules.movement.NoFall.Mode

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/NoFall.java:470`

```java
public enum Mode
```

## meteordevelopment.meteorclient.systems.modules.movement.NoFall.PlacedItem

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/NoFall.java:477`

```java
public enum PlacedItem
```

## meteordevelopment.meteorclient.systems.modules.movement.NoFall.PlaceMode

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/NoFall.java:491`

```java
public enum PlaceMode
```

## meteordevelopment.meteorclient.systems.modules.movement.NoFall.PlaceMode.test

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/NoFall.java:501`

```java
public boolean test(float fallHeight)
```

## meteordevelopment.meteorclient.systems.modules.movement.NoSlow

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/NoSlow.java:17`

```java
public class NoSlow extends Module
```

## meteordevelopment.meteorclient.systems.modules.movement.NoSlow.NoSlow

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/NoSlow.java:109`

```java
public NoSlow()
```

## meteordevelopment.meteorclient.systems.modules.movement.NoSlow.onActivate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/NoSlow.java:113`

```java
@Override public void onActivate()
```

## meteordevelopment.meteorclient.systems.modules.movement.NoSlow.airStrict

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/NoSlow.java:118`

```java
public boolean airStrict()
```

## meteordevelopment.meteorclient.systems.modules.movement.NoSlow.items

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/NoSlow.java:122`

```java
public boolean items()
```

## meteordevelopment.meteorclient.systems.modules.movement.NoSlow.honeyBlock

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/NoSlow.java:126`

```java
public boolean honeyBlock()
```

## meteordevelopment.meteorclient.systems.modules.movement.NoSlow.soulSand

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/NoSlow.java:130`

```java
public boolean soulSand()
```

## meteordevelopment.meteorclient.systems.modules.movement.NoSlow.slimeBlock

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/NoSlow.java:134`

```java
public boolean slimeBlock()
```

## meteordevelopment.meteorclient.systems.modules.movement.NoSlow.cobweb

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/NoSlow.java:138`

```java
public boolean cobweb()
```

## meteordevelopment.meteorclient.systems.modules.movement.NoSlow.berryBush

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/NoSlow.java:142`

```java
public boolean berryBush()
```

## meteordevelopment.meteorclient.systems.modules.movement.NoSlow.fluidDrag

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/NoSlow.java:146`

```java
public boolean fluidDrag()
```

## meteordevelopment.meteorclient.systems.modules.movement.NoSlow.sneaking

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/NoSlow.java:150`

```java
public boolean sneaking()
```

## meteordevelopment.meteorclient.systems.modules.movement.NoSlow.hunger

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/NoSlow.java:154`

```java
public boolean hunger()
```

## meteordevelopment.meteorclient.systems.modules.movement.NoSlow.slowness

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/NoSlow.java:158`

```java
public boolean slowness()
```

## meteordevelopment.meteorclient.systems.modules.movement.NoSlow.WebMode

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/NoSlow.java:175`

```java
public enum WebMode
```

## meteordevelopment.meteorclient.systems.modules.movement.Parkour

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/Parkour.java:21`

```java
public class Parkour extends Module
```

## meteordevelopment.meteorclient.systems.modules.movement.Parkour.Parkour

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/Parkour.java:33`

```java
public Parkour()
```

## meteordevelopment.meteorclient.systems.modules.movement.ReverseStep

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/ReverseStep.java:21`

```java
public class ReverseStep extends Module
```

## meteordevelopment.meteorclient.systems.modules.movement.ReverseStep.ReverseStep

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/ReverseStep.java:47`

```java
public ReverseStep()
```

## meteordevelopment.meteorclient.systems.modules.movement.SafeWalk

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/SafeWalk.java:24`

```java
public class SafeWalk extends Module
```

## meteordevelopment.meteorclient.systems.modules.movement.SafeWalk.SafeWalk

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/SafeWalk.java:85`

```java
public SafeWalk()
```

## meteordevelopment.meteorclient.systems.modules.movement.Scaffold

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/Scaffold.java:34`

```java
public class Scaffold extends Module
```

## meteordevelopment.meteorclient.systems.modules.movement.Scaffold.Scaffold

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/Scaffold.java:185`

```java
public Scaffold()
```

## meteordevelopment.meteorclient.systems.modules.movement.Scaffold.scaffolding

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/Scaffold.java:287`

```java
public boolean scaffolding()
```

## meteordevelopment.meteorclient.systems.modules.movement.Scaffold.towering

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/Scaffold.java:291`

```java
public boolean towering()
```

## meteordevelopment.meteorclient.systems.modules.movement.Slippy

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/Slippy.java:16`

```java
public class Slippy extends Module
```

## meteordevelopment.meteorclient.systems.modules.movement.Slippy.friction

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/Slippy.java:19`

```java
public final Setting<Double> friction = sgGeneral.add(new DoubleSetting.Builder() .name("friction") .description("The base friction level.") .range(0.01, 1.10) .sliderRange(0.01, 1.10) .defaultValue(1) .build() )
```

## meteordevelopment.meteorclient.systems.modules.movement.Slippy.listMode

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/Slippy.java:28`

```java
public final Setting<ListMode> listMode = sgGeneral.add(new EnumSetting.Builder<ListMode>() .name("list-mode") .description("The mode to select blocks.") .defaultValue(ListMode.Blacklist) .build() )
```

## meteordevelopment.meteorclient.systems.modules.movement.Slippy.ignoredBlocks

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/Slippy.java:35`

```java
public final Setting<List<Block>> ignoredBlocks = sgGeneral.add(new BlockListSetting.Builder() .name("ignored-blocks") .description("Decide which blocks not to slip on") .visible(() -> listMode.get() == ListMode.Blacklist) .build() )
```

## meteordevelopment.meteorclient.systems.modules.movement.Slippy.allowedBlocks

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/Slippy.java:42`

```java
public final Setting<List<Block>> allowedBlocks = sgGeneral.add(new BlockListSetting.Builder() .name("allowed-blocks") .description("Decide which blocks to slip on") .visible(() -> listMode.get() == ListMode.Whitelist) .build() )
```

## meteordevelopment.meteorclient.systems.modules.movement.Slippy.Slippy

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/Slippy.java:49`

```java
public Slippy()
```

## meteordevelopment.meteorclient.systems.modules.movement.Sneak

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/Sneak.java:14`

```java
public class Sneak extends Module
```

## meteordevelopment.meteorclient.systems.modules.movement.Sneak.Sneak

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/Sneak.java:24`

```java
public Sneak()
```

## meteordevelopment.meteorclient.systems.modules.movement.Sneak.doPacket

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/Sneak.java:28`

```java
public boolean doPacket()
```

## meteordevelopment.meteorclient.systems.modules.movement.Sneak.doVanilla

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/Sneak.java:32`

```java
public boolean doVanilla()
```

## meteordevelopment.meteorclient.systems.modules.movement.Sneak.Mode

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/Sneak.java:36`

```java
public enum Mode
```

## meteordevelopment.meteorclient.systems.modules.movement.Spider

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/Spider.java:17`

```java
public class Spider extends Module
```

## meteordevelopment.meteorclient.systems.modules.movement.Spider.Spider

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/Spider.java:28`

```java
public Spider()
```

## meteordevelopment.meteorclient.systems.modules.movement.Sprint

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/Sprint.java:22`

```java
public class Sprint extends Module
```

## meteordevelopment.meteorclient.systems.modules.movement.Sprint.Mode

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/Sprint.java:25`

```java
public enum Mode
```

## meteordevelopment.meteorclient.systems.modules.movement.Sprint.mode

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/Sprint.java:30`

```java
public final Setting<Mode> mode = sgGeneral.add(new EnumSetting.Builder<Mode>() .name("sprint-mode") .description("What mode of sprinting.") .defaultValue(Mode.Strict) .build() )
```

## meteordevelopment.meteorclient.systems.modules.movement.Sprint.unsprintInWater

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/Sprint.java:51`

```java
public final Setting<Boolean> unsprintInWater = sgGeneral.add(new BoolSetting.Builder() .name("unsprint-in-water") .description("Whether to stop sprinting when in water.") .defaultValue(true) .visible(() -> mode.get() == Mode.Rage) .build() )
```

## meteordevelopment.meteorclient.systems.modules.movement.Sprint.Sprint

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/Sprint.java:67`

```java
public Sprint()
```

## meteordevelopment.meteorclient.systems.modules.movement.Sprint.shouldSprint

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/Sprint.java:97`

```java
public boolean shouldSprint()
```

## meteordevelopment.meteorclient.systems.modules.movement.Sprint.rageSprint

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/Sprint.java:116`

```java
public boolean rageSprint()
```

## meteordevelopment.meteorclient.systems.modules.movement.Sprint.unsprintInWater

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/Sprint.java:120`

```java
public boolean unsprintInWater()
```

## meteordevelopment.meteorclient.systems.modules.movement.Sprint.stopSprinting

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/Sprint.java:124`

```java
public boolean stopSprinting()
```

## meteordevelopment.meteorclient.systems.modules.movement.Step

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/Step.java:26`

```java
public class Step extends Module
```

## meteordevelopment.meteorclient.systems.modules.movement.Step.height

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/Step.java:29`

```java
public final Setting<Double> height = sgGeneral.add(new DoubleSetting.Builder() .name("height") .description("Step height.") .defaultValue(1.25) .min(0) .build() )
```

## meteordevelopment.meteorclient.systems.modules.movement.Step.Step

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/Step.java:64`

```java
public Step()
```

## meteordevelopment.meteorclient.systems.modules.movement.Step.onActivate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/Step.java:68`

```java
@Override public void onActivate()
```

## meteordevelopment.meteorclient.systems.modules.movement.Step.onDeactivate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/Step.java:87`

```java
@Override public void onDeactivate()
```

## meteordevelopment.meteorclient.systems.modules.movement.Step.ActiveWhen

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/Step.java:157`

```java
public enum ActiveWhen
```

## meteordevelopment.meteorclient.systems.modules.movement.TridentBoost

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/TridentBoost.java:15`

```java
public class TridentBoost extends Module
```

## meteordevelopment.meteorclient.systems.modules.movement.TridentBoost.TridentBoost

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/TridentBoost.java:34`

```java
public TridentBoost()
```

## meteordevelopment.meteorclient.systems.modules.movement.TridentBoost.getMultiplier

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/TridentBoost.java:38`

```java
public double getMultiplier()
```

## meteordevelopment.meteorclient.systems.modules.movement.TridentBoost.allowOutOfWater

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/TridentBoost.java:42`

```java
public boolean allowOutOfWater()
```

## meteordevelopment.meteorclient.systems.modules.movement.Velocity

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/Velocity.java:22`

```java
public class Velocity extends Module
```

## meteordevelopment.meteorclient.systems.modules.movement.Velocity.knockback

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/Velocity.java:25`

```java
public final Setting<Boolean> knockback = sgGeneral.add(new BoolSetting.Builder() .name("knockback") .description("Modifies the amount of knockback you take from attacks.") .defaultValue(true) .build() )
```

## meteordevelopment.meteorclient.systems.modules.movement.Velocity.knockbackHorizontal

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/Velocity.java:32`

```java
public final Setting<Double> knockbackHorizontal = sgGeneral.add(new DoubleSetting.Builder() .name("knockback-horizontal") .description("How much horizontal knockback you will take.") .defaultValue(0) .sliderMax(1) .visible(knockback::get) .build() )
```

## meteordevelopment.meteorclient.systems.modules.movement.Velocity.knockbackVertical

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/Velocity.java:41`

```java
public final Setting<Double> knockbackVertical = sgGeneral.add(new DoubleSetting.Builder() .name("knockback-vertical") .description("How much vertical knockback you will take.") .defaultValue(0) .sliderMax(1) .visible(knockback::get) .build() )
```

## meteordevelopment.meteorclient.systems.modules.movement.Velocity.explosions

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/Velocity.java:50`

```java
public final Setting<Boolean> explosions = sgGeneral.add(new BoolSetting.Builder() .name("explosions") .description("Modifies your knockback from explosions.") .defaultValue(true) .build() )
```

## meteordevelopment.meteorclient.systems.modules.movement.Velocity.explosionsHorizontal

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/Velocity.java:57`

```java
public final Setting<Double> explosionsHorizontal = sgGeneral.add(new DoubleSetting.Builder() .name("explosions-horizontal") .description("How much velocity you will take from explosions horizontally.") .defaultValue(0) .sliderMax(1) .visible(explosions::get) .build() )
```

## meteordevelopment.meteorclient.systems.modules.movement.Velocity.explosionsVertical

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/Velocity.java:66`

```java
public final Setting<Double> explosionsVertical = sgGeneral.add(new DoubleSetting.Builder() .name("explosions-vertical") .description("How much velocity you will take from explosions vertically.") .defaultValue(0) .sliderMax(1) .visible(explosions::get) .build() )
```

## meteordevelopment.meteorclient.systems.modules.movement.Velocity.liquids

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/Velocity.java:75`

```java
public final Setting<Boolean> liquids = sgGeneral.add(new BoolSetting.Builder() .name("liquids") .description("Modifies the amount you are pushed by flowing liquids.") .defaultValue(true) .build() )
```

## meteordevelopment.meteorclient.systems.modules.movement.Velocity.liquidsHorizontal

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/Velocity.java:82`

```java
public final Setting<Double> liquidsHorizontal = sgGeneral.add(new DoubleSetting.Builder() .name("liquids-horizontal") .description("How much velocity you will take from liquids horizontally.") .defaultValue(0) .sliderMax(1) .visible(liquids::get) .build() )
```

## meteordevelopment.meteorclient.systems.modules.movement.Velocity.liquidsVertical

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/Velocity.java:91`

```java
public final Setting<Double> liquidsVertical = sgGeneral.add(new DoubleSetting.Builder() .name("liquids-vertical") .description("How much velocity you will take from liquids vertically.") .defaultValue(0) .sliderMax(1) .visible(liquids::get) .build() )
```

## meteordevelopment.meteorclient.systems.modules.movement.Velocity.entityPush

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/Velocity.java:100`

```java
public final Setting<Boolean> entityPush = sgGeneral.add(new BoolSetting.Builder() .name("entity-push") .description("Modifies the amount you are pushed by entities.") .defaultValue(true) .build() )
```

## meteordevelopment.meteorclient.systems.modules.movement.Velocity.entityPushAmount

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/Velocity.java:107`

```java
public final Setting<Double> entityPushAmount = sgGeneral.add(new DoubleSetting.Builder() .name("entity-push-amount") .description("How much you will be pushed.") .defaultValue(0) .sliderMax(1) .visible(entityPush::get) .build() )
```

## meteordevelopment.meteorclient.systems.modules.movement.Velocity.blocks

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/Velocity.java:116`

```java
public final Setting<Boolean> blocks = sgGeneral.add(new BoolSetting.Builder() .name("blocks") .description("Prevents you from being pushed out of blocks.") .defaultValue(true) .build() )
```

## meteordevelopment.meteorclient.systems.modules.movement.Velocity.sinking

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/Velocity.java:123`

```java
public final Setting<Boolean> sinking = sgGeneral.add(new BoolSetting.Builder() .name("sinking") .description("Prevents you from sinking in liquids.") .defaultValue(false) .build() )
```

## meteordevelopment.meteorclient.systems.modules.movement.Velocity.fishing

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/Velocity.java:130`

```java
public final Setting<Boolean> fishing = sgGeneral.add(new BoolSetting.Builder() .name("fishing") .description("Prevents you from being pulled by fishing rods.") .defaultValue(false) .build() )
```

## meteordevelopment.meteorclient.systems.modules.movement.Velocity.Velocity

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/Velocity.java:137`

```java
public Velocity()
```

## meteordevelopment.meteorclient.systems.modules.movement.Velocity.getHorizontal

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/Velocity.java:164`

```java
public double getHorizontal(Setting<Double> setting)
```

## meteordevelopment.meteorclient.systems.modules.movement.Velocity.getVertical

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/Velocity.java:168`

```java
public double getVertical(Setting<Double> setting)
```

## meteordevelopment.meteorclient.systems.modules.movement.elytrafly.ElytraFlightMode

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/elytrafly/ElytraFlightMode.java:22`

```java
public class ElytraFlightMode
```

## meteordevelopment.meteorclient.systems.modules.movement.elytrafly.ElytraFlightMode.mc

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/elytrafly/ElytraFlightMode.java:23`

```java
protected final Minecraft mc
```

## meteordevelopment.meteorclient.systems.modules.movement.elytrafly.ElytraFlightMode.elytraFly

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/elytrafly/ElytraFlightMode.java:24`

```java
protected final ElytraFly elytraFly
```

## meteordevelopment.meteorclient.systems.modules.movement.elytrafly.ElytraFlightMode.lastJumpPressed

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/elytrafly/ElytraFlightMode.java:27`

```java
protected boolean lastJumpPressed
```

## meteordevelopment.meteorclient.systems.modules.movement.elytrafly.ElytraFlightMode.incrementJumpTimer

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/elytrafly/ElytraFlightMode.java:28`

```java
protected boolean incrementJumpTimer
```

## meteordevelopment.meteorclient.systems.modules.movement.elytrafly.ElytraFlightMode.lastForwardPressed

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/elytrafly/ElytraFlightMode.java:29`

```java
protected boolean lastForwardPressed
```

## meteordevelopment.meteorclient.systems.modules.movement.elytrafly.ElytraFlightMode.jumpTimer

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/elytrafly/ElytraFlightMode.java:30`

```java
protected int jumpTimer
```

## meteordevelopment.meteorclient.systems.modules.movement.elytrafly.ElytraFlightMode.velX

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/elytrafly/ElytraFlightMode.java:31`

```java
protected double velX, velY, velZ
```

## meteordevelopment.meteorclient.systems.modules.movement.elytrafly.ElytraFlightMode.velY

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/elytrafly/ElytraFlightMode.java:31`

```java
protected double velX, velY, velZ
```

## meteordevelopment.meteorclient.systems.modules.movement.elytrafly.ElytraFlightMode.velZ

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/elytrafly/ElytraFlightMode.java:31`

```java
protected double velX, velY, velZ
```

## meteordevelopment.meteorclient.systems.modules.movement.elytrafly.ElytraFlightMode.ticksLeft

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/elytrafly/ElytraFlightMode.java:32`

```java
protected double ticksLeft
```

## meteordevelopment.meteorclient.systems.modules.movement.elytrafly.ElytraFlightMode.forward

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/elytrafly/ElytraFlightMode.java:33`

```java
protected Vec3 forward, right
```

## meteordevelopment.meteorclient.systems.modules.movement.elytrafly.ElytraFlightMode.right

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/elytrafly/ElytraFlightMode.java:33`

```java
protected Vec3 forward, right
```

## meteordevelopment.meteorclient.systems.modules.movement.elytrafly.ElytraFlightMode.acceleration

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/elytrafly/ElytraFlightMode.java:34`

```java
protected double acceleration
```

## meteordevelopment.meteorclient.systems.modules.movement.elytrafly.ElytraFlightMode.ElytraFlightMode

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/elytrafly/ElytraFlightMode.java:36`

```java
public ElytraFlightMode(ElytraFlightModes type)
```

## meteordevelopment.meteorclient.systems.modules.movement.elytrafly.ElytraFlightMode.onTick

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/elytrafly/ElytraFlightMode.java:42`

```java
public void onTick()
```

## meteordevelopment.meteorclient.systems.modules.movement.elytrafly.ElytraFlightMode.onPreTick

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/elytrafly/ElytraFlightMode.java:64`

```java
public void onPreTick()
```

## meteordevelopment.meteorclient.systems.modules.movement.elytrafly.ElytraFlightMode.onPacketSend

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/elytrafly/ElytraFlightMode.java:67`

```java
public void onPacketSend(PacketEvent.Send event)
```

## meteordevelopment.meteorclient.systems.modules.movement.elytrafly.ElytraFlightMode.onPacketReceive

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/elytrafly/ElytraFlightMode.java:70`

```java
public void onPacketReceive(PacketEvent.Receive event)
```

## meteordevelopment.meteorclient.systems.modules.movement.elytrafly.ElytraFlightMode.onPlayerMove

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/elytrafly/ElytraFlightMode.java:73`

```java
public void onPlayerMove()
```

## meteordevelopment.meteorclient.systems.modules.movement.elytrafly.ElytraFlightMode.onActivate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/elytrafly/ElytraFlightMode.java:76`

```java
public void onActivate()
```

## meteordevelopment.meteorclient.systems.modules.movement.elytrafly.ElytraFlightMode.onDeactivate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/elytrafly/ElytraFlightMode.java:83`

```java
public void onDeactivate()
```

## meteordevelopment.meteorclient.systems.modules.movement.elytrafly.ElytraFlightMode.autoTakeoff

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/elytrafly/ElytraFlightMode.java:86`

```java
public void autoTakeoff()
```

## meteordevelopment.meteorclient.systems.modules.movement.elytrafly.ElytraFlightMode.handleAutopilot

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/elytrafly/ElytraFlightMode.java:111`

```java
public void handleAutopilot()
```

## meteordevelopment.meteorclient.systems.modules.movement.elytrafly.ElytraFlightMode.handleHorizontalSpeed

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/elytrafly/ElytraFlightMode.java:142`

```java
public void handleHorizontalSpeed(PlayerMoveEvent event)
```

## meteordevelopment.meteorclient.systems.modules.movement.elytrafly.ElytraFlightMode.handleVerticalSpeed

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/elytrafly/ElytraFlightMode.java:173`

```java
public void handleVerticalSpeed(PlayerMoveEvent event)
```

## meteordevelopment.meteorclient.systems.modules.movement.elytrafly.ElytraFlightMode.handleFallMultiplier

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/elytrafly/ElytraFlightMode.java:178`

```java
public void handleFallMultiplier()
```

## meteordevelopment.meteorclient.systems.modules.movement.elytrafly.ElytraFlightMode.handleAcceleration

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/elytrafly/ElytraFlightMode.java:183`

```java
public void handleAcceleration()
```

## meteordevelopment.meteorclient.systems.modules.movement.elytrafly.ElytraFlightMode.zeroAcceleration

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/elytrafly/ElytraFlightMode.java:195`

```java
public void zeroAcceleration()
```

## meteordevelopment.meteorclient.systems.modules.movement.elytrafly.ElytraFlightMode.getSpeed

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/elytrafly/ElytraFlightMode.java:199`

```java
protected double getSpeed()
```

## meteordevelopment.meteorclient.systems.modules.movement.elytrafly.ElytraFlightMode.getHudString

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/elytrafly/ElytraFlightMode.java:203`

```java
public String getHudString()
```

## meteordevelopment.meteorclient.systems.modules.movement.elytrafly.ElytraFlightModes

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/elytrafly/ElytraFlightModes.java:8`

```java
public enum ElytraFlightModes
```

## meteordevelopment.meteorclient.systems.modules.movement.elytrafly.ElytraFly

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/elytrafly/ElytraFly.java:40`

```java
public class ElytraFly extends Module
```

## meteordevelopment.meteorclient.systems.modules.movement.elytrafly.ElytraFly.flightMode

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/elytrafly/ElytraFly.java:47`

```java
public final Setting<ElytraFlightModes> flightMode = sgGeneral.add(new EnumSetting.Builder<ElytraFlightModes>() .name("mode") .description("The mode of flying.") .defaultValue(ElytraFlightModes.Vanilla) .onModuleActivated(flightModesSetting -> onModeChanged(flightModesSetting.get())) .onChanged(this::onModeChanged) .build() )
```

## meteordevelopment.meteorclient.systems.modules.movement.elytrafly.ElytraFly.autoTakeOff

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/elytrafly/ElytraFly.java:56`

```java
public final Setting<Boolean> autoTakeOff = sgGeneral.add(new BoolSetting.Builder() .name("auto-take-off") .description("Automatically takes off when you hold jump without needing to double jump.") .defaultValue(false) .visible(() -> flightMode.get() != ElytraFlightModes.Pitch40 && flightMode.get() != ElytraFlightModes.Bounce) .build() )
```

## meteordevelopment.meteorclient.systems.modules.movement.elytrafly.ElytraFly.fallMultiplier

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/elytrafly/ElytraFly.java:64`

```java
public final Setting<Double> fallMultiplier = sgGeneral.add(new DoubleSetting.Builder() .name("fall-multiplier") .description("Controls how fast will you go down naturally.") .defaultValue(0.01) .min(0) .visible(() -> flightMode.get() != ElytraFlightModes.Pitch40 && flightMode.get() != ElytraFlightModes.Bounce) .build() )
```

## meteordevelopment.meteorclient.systems.modules.movement.elytrafly.ElytraFly.horizontalSpeed

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/elytrafly/ElytraFly.java:73`

```java
public final Setting<Double> horizontalSpeed = sgGeneral.add(new DoubleSetting.Builder() .name("horizontal-speed") .description("How fast you go forward and backward.") .defaultValue(1) .min(0) .visible(() -> flightMode.get() != ElytraFlightModes.Pitch40 && flightMode.get() != ElytraFlightModes.Bounce) .build() )
```

## meteordevelopment.meteorclient.systems.modules.movement.elytrafly.ElytraFly.verticalSpeed

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/elytrafly/ElytraFly.java:82`

```java
public final Setting<Double> verticalSpeed = sgGeneral.add(new DoubleSetting.Builder() .name("vertical-speed") .description("How fast you go up and down.") .defaultValue(1) .min(0) .visible(() -> flightMode.get() != ElytraFlightModes.Pitch40 && flightMode.get() != ElytraFlightModes.Bounce) .build() )
```

## meteordevelopment.meteorclient.systems.modules.movement.elytrafly.ElytraFly.acceleration

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/elytrafly/ElytraFly.java:91`

```java
public final Setting<Boolean> acceleration = sgGeneral.add(new BoolSetting.Builder() .name("acceleration") .defaultValue(false) .visible(() -> flightMode.get() != ElytraFlightModes.Pitch40 && flightMode.get() != ElytraFlightModes.Bounce) .build() )
```

## meteordevelopment.meteorclient.systems.modules.movement.elytrafly.ElytraFly.accelerationStep

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/elytrafly/ElytraFly.java:98`

```java
public final Setting<Double> accelerationStep = sgGeneral.add(new DoubleSetting.Builder() .name("acceleration-step") .min(0.1) .max(5) .defaultValue(1) .visible(() -> flightMode.get() != ElytraFlightModes.Pitch40 && acceleration.get() && flightMode.get() != ElytraFlightModes.Bounce) .build() )
```

## meteordevelopment.meteorclient.systems.modules.movement.elytrafly.ElytraFly.accelerationMin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/elytrafly/ElytraFly.java:107`

```java
public final Setting<Double> accelerationMin = sgGeneral.add(new DoubleSetting.Builder() .name("acceleration-start") .min(0.1) .defaultValue(0) .visible(() -> flightMode.get() != ElytraFlightModes.Pitch40 && acceleration.get() && flightMode.get() != ElytraFlightModes.Bounce) .build() )
```

## meteordevelopment.meteorclient.systems.modules.movement.elytrafly.ElytraFly.stopInWater

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/elytrafly/ElytraFly.java:115`

```java
public final Setting<Boolean> stopInWater = sgGeneral.add(new BoolSetting.Builder() .name("stop-in-water") .description("Stops flying in water.") .defaultValue(true) .visible(() -> flightMode.get() != ElytraFlightModes.Bounce) .build() )
```

## meteordevelopment.meteorclient.systems.modules.movement.elytrafly.ElytraFly.dontGoIntoUnloadedChunks

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/elytrafly/ElytraFly.java:123`

```java
public final Setting<Boolean> dontGoIntoUnloadedChunks = sgGeneral.add(new BoolSetting.Builder() .name("no-unloaded-chunks") .description("Stops you from going into unloaded chunks.") .defaultValue(true) .build() )
```

## meteordevelopment.meteorclient.systems.modules.movement.elytrafly.ElytraFly.autoHover

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/elytrafly/ElytraFly.java:130`

```java
public final Setting<Boolean> autoHover = sgGeneral.add(new BoolSetting.Builder() .name("auto-hover") .description("Automatically hover .3 blocks off ground when holding shift.") .defaultValue(false) .visible(() -> flightMode.get() != ElytraFlightModes.Bounce) .build() )
```

## meteordevelopment.meteorclient.systems.modules.movement.elytrafly.ElytraFly.noCrash

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/elytrafly/ElytraFly.java:138`

```java
public final Setting<Boolean> noCrash = sgGeneral.add(new BoolSetting.Builder() .name("no-crash") .description("Stops you from going into walls.") .defaultValue(false) .visible(() -> flightMode.get() != ElytraFlightModes.Bounce) .build() )
```

## meteordevelopment.meteorclient.systems.modules.movement.elytrafly.ElytraFly.crashLookAhead

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/elytrafly/ElytraFly.java:146`

```java
public final Setting<Integer> crashLookAhead = sgGeneral.add(new IntSetting.Builder() .name("crash-look-ahead") .description("Distance to look ahead when flying.") .defaultValue(5) .range(1, 15) .sliderMin(1) .visible(() -> noCrash.get() && flightMode.get() != ElytraFlightModes.Bounce) .build() )
```

## meteordevelopment.meteorclient.systems.modules.movement.elytrafly.ElytraFly.pitch40lowerBounds

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/elytrafly/ElytraFly.java:164`

```java
public final Setting<Double> pitch40lowerBounds = sgGeneral.add(new DoubleSetting.Builder() .name("pitch40-lower-bounds") .description( "The bottom height boundary for pitch40. You must be at least 40 blocks above this boundary when starting the module.\n" + "After descending below this boundary you will start pitching upwards." ) .defaultValue(180) .min(-128) .sliderMax(360) .visible(() -> flightMode.get() == ElytraFlightModes.Pitch40) .build() )
```

## meteordevelopment.meteorclient.systems.modules.movement.elytrafly.ElytraFly.pitch40upperBounds

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/elytrafly/ElytraFly.java:177`

```java
public final Setting<Double> pitch40upperBounds = sgGeneral.add(new DoubleSetting.Builder() .name("pitch40-upper-bounds") .description( "The upper height boundary for pitch40. You must be above this boundary when starting the module.\n" + "When ascending above this boundary, if you are not already, you will start pitching downwards." ) .defaultValue(220) .min(-128) .sliderMax(360) .visible(() -> flightMode.get() == ElytraFlightModes.Pitch40) .build() )
```

## meteordevelopment.meteorclient.systems.modules.movement.elytrafly.ElytraFly.pitch40rotationSpeedUp

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/elytrafly/ElytraFly.java:190`

```java
public final Setting<Double> pitch40rotationSpeedUp = sgGeneral.add(new DoubleSetting.Builder() .name("pitch40-rotate-speed-up") .description("The speed for pitch rotation upwards (degrees per tick).") .defaultValue(5.45) .min(1) .sliderMax(20) .visible(() -> flightMode.get() == ElytraFlightModes.Pitch40) .build() )
```

## meteordevelopment.meteorclient.systems.modules.movement.elytrafly.ElytraFly.pitch40rotationSpeedDown

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/elytrafly/ElytraFly.java:200`

```java
public final Setting<Double> pitch40rotationSpeedDown = sgGeneral.add(new DoubleSetting.Builder() .name("pitch40-rotate-speed-down") .description("The speed for pitch rotation downwards (degrees per tick).") .defaultValue(0.90) .min(0.5) .sliderMax(2) .visible(() -> flightMode.get() == ElytraFlightModes.Pitch40) .build() )
```

## meteordevelopment.meteorclient.systems.modules.movement.elytrafly.ElytraFly.autoJump

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/elytrafly/ElytraFly.java:210`

```java
public final Setting<Boolean> autoJump = sgGeneral.add(new BoolSetting.Builder() .name("auto-jump") .description("Automatically jumps for you.") .defaultValue(true) .visible(() -> flightMode.get() == ElytraFlightModes.Bounce) .build() )
```

## meteordevelopment.meteorclient.systems.modules.movement.elytrafly.ElytraFly.yawLockMode

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/elytrafly/ElytraFly.java:218`

```java
public final Setting<Rotation.LockMode> yawLockMode = sgGeneral.add(new EnumSetting.Builder<Rotation.LockMode>() .name("yaw-lock") .description("Whether to enable yaw lock or not") .defaultValue(Rotation.LockMode.Smart) .visible(() -> flightMode.get() == ElytraFlightModes.Bounce) .build() )
```

## meteordevelopment.meteorclient.systems.modules.movement.elytrafly.ElytraFly.yaw

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/elytrafly/ElytraFly.java:226`

```java
public final Setting<Double> yaw = sgGeneral.add(new DoubleSetting.Builder() .name("yaw") .description("The yaw angle to look at when using simple rotation lock in bounce mode.") .defaultValue(0) .range(0, 360) .sliderRange(0, 360) .visible(() -> flightMode.get() == ElytraFlightModes.Bounce && yawLockMode.get() == Rotation.LockMode.Simple) .build() )
```

## meteordevelopment.meteorclient.systems.modules.movement.elytrafly.ElytraFly.lockPitch

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/elytrafly/ElytraFly.java:236`

```java
public final Setting<Boolean> lockPitch = sgGeneral.add(new BoolSetting.Builder() .name("pitch-lock") .description("Whether to lock your pitch angle.") .defaultValue(true) .visible(() -> flightMode.get() == ElytraFlightModes.Bounce) .build() )
```

## meteordevelopment.meteorclient.systems.modules.movement.elytrafly.ElytraFly.pitch

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/elytrafly/ElytraFly.java:244`

```java
public final Setting<Double> pitch = sgGeneral.add(new DoubleSetting.Builder() .name("pitch") .description("The pitch angle to look at when using the bounce mode.") .defaultValue(85) .range(0, 90) .sliderRange(0, 90) .visible(() -> flightMode.get() == ElytraFlightModes.Bounce && lockPitch.get()) .build() )
```

## meteordevelopment.meteorclient.systems.modules.movement.elytrafly.ElytraFly.restart

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/elytrafly/ElytraFly.java:254`

```java
public final Setting<Boolean> restart = sgGeneral.add(new BoolSetting.Builder() .name("restart") .description("Restarts flying with the elytra when rubberbanding.") .defaultValue(true) .visible(() -> flightMode.get() == ElytraFlightModes.Bounce) .build() )
```

## meteordevelopment.meteorclient.systems.modules.movement.elytrafly.ElytraFly.restartDelay

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/elytrafly/ElytraFly.java:262`

```java
public final Setting<Integer> restartDelay = sgGeneral.add(new IntSetting.Builder() .name("restart-delay") .description("How many ticks to wait before restarting the elytra again after rubberbanding.") .defaultValue(7) .min(0) .sliderRange(0, 20) .visible(() -> flightMode.get() == ElytraFlightModes.Bounce && restart.get()) .build() )
```

## meteordevelopment.meteorclient.systems.modules.movement.elytrafly.ElytraFly.sprint

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/elytrafly/ElytraFly.java:272`

```java
public final Setting<Boolean> sprint = sgGeneral.add(new BoolSetting.Builder() .name("sprint-constantly") .description("Sprints all the time. If turned off, it will only sprint when the player is touching the ground.") .defaultValue(true) .visible(() -> flightMode.get() == ElytraFlightModes.Bounce) .build() )
```

## meteordevelopment.meteorclient.systems.modules.movement.elytrafly.ElytraFly.manualTakeoff

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/elytrafly/ElytraFly.java:280`

```java
public final Setting<Boolean> manualTakeoff = sgGeneral.add(new BoolSetting.Builder() .name("manual-takeoff") .description("Does not automatically take off.") .defaultValue(false) .visible(() -> flightMode.get() == ElytraFlightModes.Bounce) .build() )
```

## meteordevelopment.meteorclient.systems.modules.movement.elytrafly.ElytraFly.replace

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/elytrafly/ElytraFly.java:290`

```java
public final Setting<Boolean> replace = sgInventory.add(new BoolSetting.Builder() .name("elytra-replace") .description("Replaces broken elytra with a new elytra.") .defaultValue(false) .build() )
```

## meteordevelopment.meteorclient.systems.modules.movement.elytrafly.ElytraFly.replaceDurability

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/elytrafly/ElytraFly.java:297`

```java
public final Setting<Integer> replaceDurability = sgInventory.add(new IntSetting.Builder() .name("replace-durability") .description("The durability threshold your elytra will be replaced at.") .defaultValue(2) .sliderRange(1, 500) .visible(replace::get) .build() )
```

## meteordevelopment.meteorclient.systems.modules.movement.elytrafly.ElytraFly.chestSwap

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/elytrafly/ElytraFly.java:306`

```java
public final Setting<ChestSwapMode> chestSwap = sgInventory.add(new EnumSetting.Builder<ChestSwapMode>() .name("chest-swap") .description("Enables ChestSwap when toggling this module.") .defaultValue(ChestSwapMode.Never) .build() )
```

## meteordevelopment.meteorclient.systems.modules.movement.elytrafly.ElytraFly.autoReplenish

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/elytrafly/ElytraFly.java:313`

```java
public final Setting<Boolean> autoReplenish = sgInventory.add(new BoolSetting.Builder() .name("replenish-fireworks") .description("Moves fireworks into a selected hotbar slot.") .defaultValue(false) .build() )
```

## meteordevelopment.meteorclient.systems.modules.movement.elytrafly.ElytraFly.replenishSlot

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/elytrafly/ElytraFly.java:320`

```java
public final Setting<Integer> replenishSlot = sgInventory.add(new IntSetting.Builder() .name("replenish-slot") .description("The slot auto move moves fireworks to.") .defaultValue(9) .range(1, 9) .sliderRange(1, 9) .visible(autoReplenish::get) .build() )
```

## meteordevelopment.meteorclient.systems.modules.movement.elytrafly.ElytraFly.autoPilot

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/elytrafly/ElytraFly.java:332`

```java
public final Setting<Boolean> autoPilot = sgAutopilot.add(new BoolSetting.Builder() .name("auto-pilot") .description("Moves forward while elytra flying.") .defaultValue(false) .visible(() -> flightMode.get() != ElytraFlightModes.Pitch40 && flightMode.get() != ElytraFlightModes.Bounce) .build() )
```

## meteordevelopment.meteorclient.systems.modules.movement.elytrafly.ElytraFly.useFireworks

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/elytrafly/ElytraFly.java:340`

```java
public final Setting<Boolean> useFireworks = sgAutopilot.add(new BoolSetting.Builder() .name("use-fireworks") .description("Uses firework rockets every second of your choice.") .defaultValue(false) .visible(() -> autoPilot.get() && flightMode.get() != ElytraFlightModes.Pitch40 && flightMode.get() != ElytraFlightModes.Bounce) .build() )
```

## meteordevelopment.meteorclient.systems.modules.movement.elytrafly.ElytraFly.autoPilotFireworkDelay

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/elytrafly/ElytraFly.java:348`

```java
public final Setting<Double> autoPilotFireworkDelay = sgAutopilot.add(new DoubleSetting.Builder() .name("firework-delay") .description("The delay in seconds in between using fireworks if \"Use Fireworks\" is enabled.") .min(1) .defaultValue(8) .sliderMax(20) .visible(() -> useFireworks.get() && flightMode.get() != ElytraFlightModes.Pitch40 && flightMode.get() != ElytraFlightModes.Bounce) .build() )
```

## meteordevelopment.meteorclient.systems.modules.movement.elytrafly.ElytraFly.autoPilotMinimumHeight

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/elytrafly/ElytraFly.java:358`

```java
public final Setting<Double> autoPilotMinimumHeight = sgAutopilot.add(new DoubleSetting.Builder() .name("minimum-height") .description("The minimum height for autopilot.") .defaultValue(120) .min(-128) .sliderMax(260) .visible(() -> autoPilot.get() && flightMode.get() != ElytraFlightModes.Pitch40 && flightMode.get() != ElytraFlightModes.Bounce) .build() )
```

## meteordevelopment.meteorclient.systems.modules.movement.elytrafly.ElytraFly.ElytraFly

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/elytrafly/ElytraFly.java:370`

```java
public ElytraFly()
```

## meteordevelopment.meteorclient.systems.modules.movement.elytrafly.ElytraFly.onActivate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/elytrafly/ElytraFly.java:374`

```java
@Override public void onActivate()
```

## meteordevelopment.meteorclient.systems.modules.movement.elytrafly.ElytraFly.onDeactivate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/elytrafly/ElytraFly.java:383`

```java
@Override public void onDeactivate()
```

## meteordevelopment.meteorclient.systems.modules.movement.elytrafly.ElytraFly.canPacketEfly

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/elytrafly/ElytraFly.java:487`

```java
public boolean canPacketEfly()
```

## meteordevelopment.meteorclient.systems.modules.movement.elytrafly.ElytraFly.enableGroundListener

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/elytrafly/ElytraFly.java:540`

```java
protected void enableGroundListener()
```

## meteordevelopment.meteorclient.systems.modules.movement.elytrafly.ElytraFly.disableGroundListener

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/elytrafly/ElytraFly.java:544`

```java
protected void disableGroundListener()
```

## meteordevelopment.meteorclient.systems.modules.movement.elytrafly.ElytraFly.enableInstaDropListener

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/elytrafly/ElytraFly.java:563`

```java
protected void enableInstaDropListener()
```

## meteordevelopment.meteorclient.systems.modules.movement.elytrafly.ElytraFly.disableInstaDropListener

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/elytrafly/ElytraFly.java:567`

```java
protected void disableInstaDropListener()
```

## meteordevelopment.meteorclient.systems.modules.movement.elytrafly.ElytraFly.getInfoString

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/elytrafly/ElytraFly.java:571`

```java
@Override public String getInfoString()
```

## meteordevelopment.meteorclient.systems.modules.movement.elytrafly.ElytraFly.ChestSwapMode

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/elytrafly/ElytraFly.java:576`

```java
public enum ChestSwapMode
```

## meteordevelopment.meteorclient.systems.modules.movement.elytrafly.ElytraFly.AutoPilotMode

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/elytrafly/ElytraFly.java:582`

```java
public enum AutoPilotMode
```

## meteordevelopment.meteorclient.systems.modules.movement.elytrafly.modes.Bounce

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/elytrafly/modes/Bounce.java:25`

```java
public class Bounce extends ElytraFlightMode
```

## meteordevelopment.meteorclient.systems.modules.movement.elytrafly.modes.Bounce.Bounce

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/elytrafly/modes/Bounce.java:27`

```java
public Bounce()
```

## meteordevelopment.meteorclient.systems.modules.movement.elytrafly.modes.Bounce.onTick

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/elytrafly/modes/Bounce.java:36`

```java
@Override public void onTick()
```

## meteordevelopment.meteorclient.systems.modules.movement.elytrafly.modes.Bounce.onPreTick

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/elytrafly/modes/Bounce.java:73`

```java
@Override public void onPreTick()
```

## meteordevelopment.meteorclient.systems.modules.movement.elytrafly.modes.Bounce.onPacketReceive

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/elytrafly/modes/Bounce.java:85`

```java
@Override public void onPacketReceive(PacketEvent.Receive event)
```

## meteordevelopment.meteorclient.systems.modules.movement.elytrafly.modes.Bounce.onPacketSend

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/elytrafly/modes/Bounce.java:93`

```java
@Override public void onPacketSend(PacketEvent.Send event)
```

## meteordevelopment.meteorclient.systems.modules.movement.elytrafly.modes.Bounce.recastElytra

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/elytrafly/modes/Bounce.java:100`

```java
public static boolean recastElytra(LocalPlayer player)
```

## meteordevelopment.meteorclient.systems.modules.movement.elytrafly.modes.Bounce.checkConditions

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/elytrafly/modes/Bounce.java:107`

```java
public static boolean checkConditions(LocalPlayer player)
```

## meteordevelopment.meteorclient.systems.modules.movement.elytrafly.modes.Bounce.onActivate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/elytrafly/modes/Bounce.java:133`

```java
@Override public void onActivate()
```

## meteordevelopment.meteorclient.systems.modules.movement.elytrafly.modes.Bounce.onDeactivate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/elytrafly/modes/Bounce.java:138`

```java
@Override public void onDeactivate()
```

## meteordevelopment.meteorclient.systems.modules.movement.elytrafly.modes.Packet

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/elytrafly/modes/Packet.java:17`

```java
public class Packet extends ElytraFlightMode
```

## meteordevelopment.meteorclient.systems.modules.movement.elytrafly.modes.Packet.Packet

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/elytrafly/modes/Packet.java:21`

```java
public Packet()
```

## meteordevelopment.meteorclient.systems.modules.movement.elytrafly.modes.Packet.onDeactivate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/elytrafly/modes/Packet.java:25`

```java
@Override public void onDeactivate()
```

## meteordevelopment.meteorclient.systems.modules.movement.elytrafly.modes.Packet.onTick

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/elytrafly/modes/Packet.java:31`

```java
@Override public void onTick()
```

## meteordevelopment.meteorclient.systems.modules.movement.elytrafly.modes.Packet.onPacketSend

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/elytrafly/modes/Packet.java:58`

```java
@Override public void onPacketSend(PacketEvent.Send event)
```

## meteordevelopment.meteorclient.systems.modules.movement.elytrafly.modes.Packet.onPlayerMove

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/elytrafly/modes/Packet.java:65`

```java
@Override public void onPlayerMove()
```

## meteordevelopment.meteorclient.systems.modules.movement.elytrafly.modes.Pitch40

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/elytrafly/modes/Pitch40.java:12`

```java
public class Pitch40 extends ElytraFlightMode
```

## meteordevelopment.meteorclient.systems.modules.movement.elytrafly.modes.Pitch40.Pitch40

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/elytrafly/modes/Pitch40.java:16`

```java
public Pitch40()
```

## meteordevelopment.meteorclient.systems.modules.movement.elytrafly.modes.Pitch40.onActivate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/elytrafly/modes/Pitch40.java:20`

```java
@Override public void onActivate()
```

## meteordevelopment.meteorclient.systems.modules.movement.elytrafly.modes.Pitch40.onTick

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/elytrafly/modes/Pitch40.java:44`

```java
@Override public void onTick()
```

## meteordevelopment.meteorclient.systems.modules.movement.elytrafly.modes.Pitch40.autoTakeoff

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/elytrafly/modes/Pitch40.java:75`

```java
@Override public void autoTakeoff()
```

## meteordevelopment.meteorclient.systems.modules.movement.elytrafly.modes.Pitch40.handleHorizontalSpeed

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/elytrafly/modes/Pitch40.java:79`

```java
@Override public void handleHorizontalSpeed(PlayerMoveEvent event)
```

## meteordevelopment.meteorclient.systems.modules.movement.elytrafly.modes.Pitch40.handleVerticalSpeed

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/elytrafly/modes/Pitch40.java:85`

```java
@Override public void handleVerticalSpeed(PlayerMoveEvent event)
```

## meteordevelopment.meteorclient.systems.modules.movement.elytrafly.modes.Pitch40.handleFallMultiplier

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/elytrafly/modes/Pitch40.java:89`

```java
@Override public void handleFallMultiplier()
```

## meteordevelopment.meteorclient.systems.modules.movement.elytrafly.modes.Pitch40.handleAutopilot

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/elytrafly/modes/Pitch40.java:93`

```java
@Override public void handleAutopilot()
```

## meteordevelopment.meteorclient.systems.modules.movement.elytrafly.modes.Vanilla

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/elytrafly/modes/Vanilla.java:11`

```java
public class Vanilla extends ElytraFlightMode
```

## meteordevelopment.meteorclient.systems.modules.movement.elytrafly.modes.Vanilla.Vanilla

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/elytrafly/modes/Vanilla.java:12`

```java
public Vanilla()
```

## meteordevelopment.meteorclient.systems.modules.movement.speed.Speed

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/speed/Speed.java:23`

```java
public class Speed extends Module
```

## meteordevelopment.meteorclient.systems.modules.movement.speed.Speed.speedMode

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/speed/Speed.java:26`

```java
public final Setting<SpeedModes> speedMode = sgGeneral.add(new EnumSetting.Builder<SpeedModes>() .name("mode") .description("The method of applying speed.") .defaultValue(SpeedModes.Vanilla) .onModuleActivated(speedModesSetting -> onSpeedModeChanged(speedModesSetting.get())) .onChanged(this::onSpeedModeChanged) .build() )
```

## meteordevelopment.meteorclient.systems.modules.movement.speed.Speed.vanillaSpeed

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/speed/Speed.java:35`

```java
public final Setting<Double> vanillaSpeed = sgGeneral.add(new DoubleSetting.Builder() .name("vanilla-speed") .description("The speed in blocks per second.") .defaultValue(5.6) .min(0) .sliderMax(20) .visible(() -> speedMode.get() == SpeedModes.Vanilla) .build() )
```

## meteordevelopment.meteorclient.systems.modules.movement.speed.Speed.ncpSpeed

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/speed/Speed.java:45`

```java
public final Setting<Double> ncpSpeed = sgGeneral.add(new DoubleSetting.Builder() .name("strafe-speed") .description("The speed.") .visible(() -> speedMode.get() == SpeedModes.Strafe) .defaultValue(1.6) .min(0) .sliderMax(3) .build() )
```

## meteordevelopment.meteorclient.systems.modules.movement.speed.Speed.ncpSpeedLimit

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/speed/Speed.java:55`

```java
public final Setting<Boolean> ncpSpeedLimit = sgGeneral.add(new BoolSetting.Builder() .name("speed-limit") .description("Limits your speed on servers with very strict anticheats.") .visible(() -> speedMode.get() == SpeedModes.Strafe) .defaultValue(false) .build() )
```

## meteordevelopment.meteorclient.systems.modules.movement.speed.Speed.timer

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/speed/Speed.java:63`

```java
public final Setting<Double> timer = sgGeneral.add(new DoubleSetting.Builder() .name("timer") .description("Timer override.") .defaultValue(1) .min(0.01) .sliderMin(0.01) .sliderMax(10) .build() )
```

## meteordevelopment.meteorclient.systems.modules.movement.speed.Speed.inLiquids

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/speed/Speed.java:73`

```java
public final Setting<Boolean> inLiquids = sgGeneral.add(new BoolSetting.Builder() .name("in-liquids") .description("Uses speed when in lava or water.") .defaultValue(false) .build() )
```

## meteordevelopment.meteorclient.systems.modules.movement.speed.Speed.whenSneaking

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/speed/Speed.java:80`

```java
public final Setting<Boolean> whenSneaking = sgGeneral.add(new BoolSetting.Builder() .name("when-sneaking") .description("Uses speed when sneaking.") .defaultValue(false) .build() )
```

## meteordevelopment.meteorclient.systems.modules.movement.speed.Speed.vanillaOnGround

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/speed/Speed.java:87`

```java
public final Setting<Boolean> vanillaOnGround = sgGeneral.add(new BoolSetting.Builder() .name("only-on-ground") .description("Uses speed only when standing on a block.") .visible(() -> speedMode.get() == SpeedModes.Vanilla) .defaultValue(false) .build() )
```

## meteordevelopment.meteorclient.systems.modules.movement.speed.Speed.Speed

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/speed/Speed.java:97`

```java
public Speed()
```

## meteordevelopment.meteorclient.systems.modules.movement.speed.Speed.onActivate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/speed/Speed.java:103`

```java
@Override public void onActivate()
```

## meteordevelopment.meteorclient.systems.modules.movement.speed.Speed.onDeactivate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/speed/Speed.java:108`

```java
@Override public void onDeactivate()
```

## meteordevelopment.meteorclient.systems.modules.movement.speed.Speed.getInfoString

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/speed/Speed.java:151`

```java
@Override public String getInfoString()
```

## meteordevelopment.meteorclient.systems.modules.movement.speed.SpeedMode

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/speed/SpeedMode.java:14`

```java
public class SpeedMode
```

## meteordevelopment.meteorclient.systems.modules.movement.speed.SpeedMode.mc

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/speed/SpeedMode.java:15`

```java
protected final Minecraft mc
```

## meteordevelopment.meteorclient.systems.modules.movement.speed.SpeedMode.settings

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/speed/SpeedMode.java:16`

```java
protected final Speed settings
```

## meteordevelopment.meteorclient.systems.modules.movement.speed.SpeedMode.stage

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/speed/SpeedMode.java:19`

```java
protected int stage
```

## meteordevelopment.meteorclient.systems.modules.movement.speed.SpeedMode.distance

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/speed/SpeedMode.java:20`

```java
protected double distance, speed
```

## meteordevelopment.meteorclient.systems.modules.movement.speed.SpeedMode.speed

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/speed/SpeedMode.java:20`

```java
protected double distance, speed
```

## meteordevelopment.meteorclient.systems.modules.movement.speed.SpeedMode.SpeedMode

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/speed/SpeedMode.java:22`

```java
public SpeedMode(SpeedModes type)
```

## meteordevelopment.meteorclient.systems.modules.movement.speed.SpeedMode.onTick

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/speed/SpeedMode.java:29`

```java
public void onTick()
```

## meteordevelopment.meteorclient.systems.modules.movement.speed.SpeedMode.onMove

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/speed/SpeedMode.java:32`

```java
public void onMove(PlayerMoveEvent event)
```

## meteordevelopment.meteorclient.systems.modules.movement.speed.SpeedMode.onRubberband

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/speed/SpeedMode.java:35`

```java
public void onRubberband()
```

## meteordevelopment.meteorclient.systems.modules.movement.speed.SpeedMode.onActivate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/speed/SpeedMode.java:39`

```java
public void onActivate()
```

## meteordevelopment.meteorclient.systems.modules.movement.speed.SpeedMode.onDeactivate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/speed/SpeedMode.java:42`

```java
public void onDeactivate()
```

## meteordevelopment.meteorclient.systems.modules.movement.speed.SpeedMode.getDefaultSpeed

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/speed/SpeedMode.java:45`

```java
protected double getDefaultSpeed()
```

## meteordevelopment.meteorclient.systems.modules.movement.speed.SpeedMode.reset

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/speed/SpeedMode.java:58`

```java
protected void reset()
```

## meteordevelopment.meteorclient.systems.modules.movement.speed.SpeedMode.getHop

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/speed/SpeedMode.java:64`

```java
protected double getHop(double height)
```

## meteordevelopment.meteorclient.systems.modules.movement.speed.SpeedMode.getHudString

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/speed/SpeedMode.java:70`

```java
public String getHudString()
```

## meteordevelopment.meteorclient.systems.modules.movement.speed.SpeedModes

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/speed/SpeedModes.java:8`

```java
public enum SpeedModes
```

## meteordevelopment.meteorclient.systems.modules.movement.speed.modes.Strafe

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/speed/modes/Strafe.java:18`

```java
public class Strafe extends SpeedMode
```

## meteordevelopment.meteorclient.systems.modules.movement.speed.modes.Strafe.Strafe

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/speed/modes/Strafe.java:20`

```java
public Strafe()
```

## meteordevelopment.meteorclient.systems.modules.movement.speed.modes.Strafe.onMove

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/speed/modes/Strafe.java:26`

```java
@Override public void onMove(PlayerMoveEvent event)
```

## meteordevelopment.meteorclient.systems.modules.movement.speed.modes.Strafe.transformStrafe

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/speed/modes/Strafe.java:75`

```java
public static Vector2d transformStrafe(double speed)
```

## meteordevelopment.meteorclient.systems.modules.movement.speed.modes.Strafe.onTick

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/speed/modes/Strafe.java:92`

```java
@Override public void onTick()
```

## meteordevelopment.meteorclient.systems.modules.movement.speed.modes.Vanilla

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/speed/modes/Vanilla.java:18`

```java
public class Vanilla extends SpeedMode
```

## meteordevelopment.meteorclient.systems.modules.movement.speed.modes.Vanilla.Vanilla

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/speed/modes/Vanilla.java:19`

```java
public Vanilla()
```

## meteordevelopment.meteorclient.systems.modules.movement.speed.modes.Vanilla.onMove

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/movement/speed/modes/Vanilla.java:23`

```java
@Override public void onMove(PlayerMoveEvent event)
```

## meteordevelopment.meteorclient.systems.modules.player.AirPlace

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/player/AirPlace.java:27`

```java
public class AirPlace extends Module
```

## meteordevelopment.meteorclient.systems.modules.player.AirPlace.AirPlace

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/player/AirPlace.java:82`

```java
public AirPlace()
```

## meteordevelopment.meteorclient.systems.modules.player.AntiAFK

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/player/AntiAFK.java:21`

```java
public class AntiAFK extends Module
```

## meteordevelopment.meteorclient.systems.modules.player.AntiAFK.AntiAFK

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/player/AntiAFK.java:146`

```java
public AntiAFK()
```

## meteordevelopment.meteorclient.systems.modules.player.AntiAFK.onActivate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/player/AntiAFK.java:158`

```java
@Override public void onActivate()
```

## meteordevelopment.meteorclient.systems.modules.player.AntiAFK.onDeactivate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/player/AntiAFK.java:169`

```java
@Override public void onDeactivate()
```

## meteordevelopment.meteorclient.systems.modules.player.AntiAFK.SpinMode

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/player/AntiAFK.java:227`

```java
public enum SpinMode
```

## meteordevelopment.meteorclient.systems.modules.player.AntiHunger

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/player/AntiHunger.java:20`

```java
public class AntiHunger extends Module
```

## meteordevelopment.meteorclient.systems.modules.player.AntiHunger.AntiHunger

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/player/AntiHunger.java:39`

```java
public AntiHunger()
```

## meteordevelopment.meteorclient.systems.modules.player.AntiHunger.onActivate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/player/AntiHunger.java:43`

```java
@Override public void onActivate()
```

## meteordevelopment.meteorclient.systems.modules.player.AutoClicker

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/player/AutoClicker.java:15`

```java
public class AutoClicker extends Module
```

## meteordevelopment.meteorclient.systems.modules.player.AutoClicker.AutoClicker

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/player/AutoClicker.java:61`

```java
public AutoClicker()
```

## meteordevelopment.meteorclient.systems.modules.player.AutoClicker.onActivate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/player/AutoClicker.java:65`

```java
@Override public void onActivate()
```

## meteordevelopment.meteorclient.systems.modules.player.AutoClicker.onDeactivate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/player/AutoClicker.java:73`

```java
@Override public void onDeactivate()
```

## meteordevelopment.meteorclient.systems.modules.player.AutoClicker.Mode

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/player/AutoClicker.java:110`

```java
public enum Mode
```

## meteordevelopment.meteorclient.systems.modules.player.AutoEat

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/player/AutoEat.java:34`

```java
public class AutoEat extends Module
```

## meteordevelopment.meteorclient.systems.modules.player.AutoEat.blacklist

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/player/AutoEat.java:43`

```java
public final Setting<List<Item>> blacklist = sgGeneral.add(new ItemListSetting.Builder() .name("blacklist") .description("Which items to not eat.") .defaultValue( Items.ENCHANTED_GOLDEN_APPLE, Items.GOLDEN_APPLE, Items.CHORUS_FRUIT, Items.POISONOUS_POTATO, Items.PUFFERFISH, Items.CHICKEN, Items.ROTTEN_FLESH, Items.SPIDER_EYE, Items.SUSPICIOUS_STEW ) .filter(Utils::isFood) .bypassFilterWhenSavingAndLoading() .build() )
```

## meteordevelopment.meteorclient.systems.modules.player.AutoEat.eating

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/player/AutoEat.java:119`

```java
public boolean eating
```

## meteordevelopment.meteorclient.systems.modules.player.AutoEat.AutoEat

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/player/AutoEat.java:125`

```java
public AutoEat()
```

## meteordevelopment.meteorclient.systems.modules.player.AutoEat.onDeactivate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/player/AutoEat.java:129`

```java
@Override public void onDeactivate()
```

## meteordevelopment.meteorclient.systems.modules.player.AutoEat.shouldEat

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/player/AutoEat.java:267`

```java
public boolean shouldEat()
```

## meteordevelopment.meteorclient.systems.modules.player.AutoEat.ThresholdMode

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/player/AutoEat.java:325`

```java
public enum ThresholdMode
```

## meteordevelopment.meteorclient.systems.modules.player.AutoEat.ThresholdMode.test

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/player/AutoEat.java:337`

```java
public boolean test(boolean health, boolean hunger)
```

## meteordevelopment.meteorclient.systems.modules.player.AutoEat.Priority

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/player/AutoEat.java:342`

```java
public enum Priority
```

## meteordevelopment.meteorclient.systems.modules.player.AutoEat.Priority.value

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/player/AutoEat.java:347`

```java
public float value(FoodProperties food)
```

## meteordevelopment.meteorclient.systems.modules.player.AutoFish

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/player/AutoFish.java:28`

```java
@NullMarked public class AutoFish extends Module
```

## meteordevelopment.meteorclient.systems.modules.player.AutoFish.AutoFish

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/player/AutoFish.java:99`

```java
public AutoFish()
```

## meteordevelopment.meteorclient.systems.modules.player.AutoFish.onActivate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/player/AutoFish.java:103`

```java
@Override public void onActivate()
```

## meteordevelopment.meteorclient.systems.modules.player.AutoFish.onDeactivate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/player/AutoFish.java:110`

```java
@Override public void onDeactivate()
```

## meteordevelopment.meteorclient.systems.modules.player.AutoGap

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/player/AutoGap.java:37`

```java
public class AutoGap extends Module
```

## meteordevelopment.meteorclient.systems.modules.player.AutoGap.AutoGap

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/player/AutoGap.java:142`

```java
public AutoGap()
```

## meteordevelopment.meteorclient.systems.modules.player.AutoGap.onDeactivate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/player/AutoGap.java:146`

```java
@Override public void onDeactivate()
```

## meteordevelopment.meteorclient.systems.modules.player.AutoGap.isEating

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/player/AutoGap.java:332`

```java
public boolean isEating()
```

## meteordevelopment.meteorclient.systems.modules.player.AutoMend

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/player/AutoMend.java:26`

```java
public class AutoMend extends Module
```

## meteordevelopment.meteorclient.systems.modules.player.AutoMend.AutoMend

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/player/AutoMend.java:53`

```java
public AutoMend()
```

## meteordevelopment.meteorclient.systems.modules.player.AutoMend.onActivate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/player/AutoMend.java:57`

```java
@Override public void onActivate()
```

## meteordevelopment.meteorclient.systems.modules.player.AutoReplenish

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/player/AutoReplenish.java:22`

```java
public class AutoReplenish extends Module
```

## meteordevelopment.meteorclient.systems.modules.player.AutoReplenish.AutoReplenish

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/player/AutoReplenish.java:85`

```java
public AutoReplenish()
```

## meteordevelopment.meteorclient.systems.modules.player.AutoReplenish.onActivate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/player/AutoReplenish.java:89`

```java
@Override public void onActivate()
```

## meteordevelopment.meteorclient.systems.modules.player.AutoRespawn

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/player/AutoRespawn.java:17`

```java
public class AutoRespawn extends Module
```

## meteordevelopment.meteorclient.systems.modules.player.AutoRespawn.AutoRespawn

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/player/AutoRespawn.java:18`

```java
public AutoRespawn()
```

## meteordevelopment.meteorclient.systems.modules.player.AutoTool

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/player/AutoTool.java:36`

```java
public class AutoTool extends Module
```

## meteordevelopment.meteorclient.systems.modules.player.AutoTool.AutoTool

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/player/AutoTool.java:124`

```java
public AutoTool()
```

## meteordevelopment.meteorclient.systems.modules.player.AutoTool.getScore

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/player/AutoTool.java:198`

```java
public static double getScore(ItemStack itemStack, BlockState state, boolean silkTouchEnderChest, boolean fortuneOre, EnchantPreference enchantPreference, Predicate<ItemStack> good)
```

## meteordevelopment.meteorclient.systems.modules.player.AutoTool.isTool

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/player/AutoTool.java:235`

```java
public static boolean isTool(Item item)
```

## meteordevelopment.meteorclient.systems.modules.player.AutoTool.isTool

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/player/AutoTool.java:239`

```java
public static boolean isTool(ItemStack itemStack)
```

## meteordevelopment.meteorclient.systems.modules.player.AutoTool.EnchantPreference

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/player/AutoTool.java:248`

```java
public enum EnchantPreference
```

## meteordevelopment.meteorclient.systems.modules.player.BreakDelay

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/player/BreakDelay.java:19`

```java
public class BreakDelay extends Module
```

## meteordevelopment.meteorclient.systems.modules.player.BreakDelay.BreakDelay

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/player/BreakDelay.java:40`

```java
public BreakDelay()
```

## meteordevelopment.meteorclient.systems.modules.player.BreakDelay.preventInstaBreak

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/player/BreakDelay.java:61`

```java
public boolean preventInstaBreak()
```

## meteordevelopment.meteorclient.systems.modules.player.ChestSwap

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/player/ChestSwap.java:23`

```java
public class ChestSwap extends Module
```

## meteordevelopment.meteorclient.systems.modules.player.ChestSwap.ChestSwap

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/player/ChestSwap.java:47`

```java
public ChestSwap()
```

## meteordevelopment.meteorclient.systems.modules.player.ChestSwap.onActivate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/player/ChestSwap.java:51`

```java
@Override public void onActivate()
```

## meteordevelopment.meteorclient.systems.modules.player.ChestSwap.onDeactivate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/player/ChestSwap.java:57`

```java
@Override public void onDeactivate()
```

## meteordevelopment.meteorclient.systems.modules.player.ChestSwap.swap

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/player/ChestSwap.java:62`

```java
public void swap()
```

## meteordevelopment.meteorclient.systems.modules.player.ChestSwap.sendToggledMsg

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/player/ChestSwap.java:138`

```java
@Override public void sendToggledMsg()
```

## meteordevelopment.meteorclient.systems.modules.player.ChestSwap.Chestplate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/player/ChestSwap.java:144`

```java
public enum Chestplate
```

## meteordevelopment.meteorclient.systems.modules.player.EXPThrower

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/player/EXPThrower.java:17`

```java
public class EXPThrower extends Module
```

## meteordevelopment.meteorclient.systems.modules.player.EXPThrower.EXPThrower

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/player/EXPThrower.java:18`

```java
public EXPThrower()
```

## meteordevelopment.meteorclient.systems.modules.player.FakePlayer

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/player/FakePlayer.java:19`

```java
public class FakePlayer extends Module
```

## meteordevelopment.meteorclient.systems.modules.player.FakePlayer.name

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/player/FakePlayer.java:22`

```java
public final Setting<String> name = sgGeneral.add(new StringSetting.Builder() .name("name") .description("The name of the fake player.") .defaultValue("seasnail8169") .build() )
```

## meteordevelopment.meteorclient.systems.modules.player.FakePlayer.copyInv

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/player/FakePlayer.java:29`

```java
public final Setting<Boolean> copyInv = sgGeneral.add(new BoolSetting.Builder() .name("copy-inv") .description("Copies your inventory to the fake player.") .defaultValue(true) .build() )
```

## meteordevelopment.meteorclient.systems.modules.player.FakePlayer.health

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/player/FakePlayer.java:36`

```java
public final Setting<Integer> health = sgGeneral.add(new IntSetting.Builder() .name("health") .description("The fake player's default health.") .defaultValue(20) .min(1) .sliderRange(1, 100) .build() )
```

## meteordevelopment.meteorclient.systems.modules.player.FakePlayer.FakePlayer

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/player/FakePlayer.java:47`

```java
public FakePlayer()
```

## meteordevelopment.meteorclient.systems.modules.player.FakePlayer.onDeactivate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/player/FakePlayer.java:51`

```java
@Override public void onDeactivate()
```

## meteordevelopment.meteorclient.systems.modules.player.FakePlayer.getWidget

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/player/FakePlayer.java:57`

```java
@Override public WWidget getWidget(GuiTheme theme)
```

## meteordevelopment.meteorclient.systems.modules.player.FakePlayer.getInfoString

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/player/FakePlayer.java:92`

```java
@Override public String getInfoString()
```

## meteordevelopment.meteorclient.systems.modules.player.FastUse

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/player/FastUse.java:17`

```java
public class FastUse extends Module
```

## meteordevelopment.meteorclient.systems.modules.player.FastUse.Mode

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/player/FastUse.java:18`

```java
public enum Mode
```

## meteordevelopment.meteorclient.systems.modules.player.FastUse.FastUse

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/player/FastUse.java:56`

```java
public FastUse()
```

## meteordevelopment.meteorclient.systems.modules.player.FastUse.getItemUseCooldown

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/player/FastUse.java:60`

```java
public int getItemUseCooldown(ItemStack itemStack)
```

## meteordevelopment.meteorclient.systems.modules.player.GhostHand

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/player/GhostHand.java:23`

```java
public class GhostHand extends Module
```

## meteordevelopment.meteorclient.systems.modules.player.GhostHand.GhostHand

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/player/GhostHand.java:26`

```java
public GhostHand()
```

## meteordevelopment.meteorclient.systems.modules.player.InstantRebreak

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/player/InstantRebreak.java:25`

```java
public class InstantRebreak extends Module
```

## meteordevelopment.meteorclient.systems.modules.player.InstantRebreak.blockPos

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/player/InstantRebreak.java:82`

```java
public final BlockPos.MutableBlockPos blockPos = new BlockPos.MutableBlockPos(0, Integer.MIN_VALUE, 0)
```

## meteordevelopment.meteorclient.systems.modules.player.InstantRebreak.InstantRebreak

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/player/InstantRebreak.java:86`

```java
public InstantRebreak()
```

## meteordevelopment.meteorclient.systems.modules.player.InstantRebreak.onActivate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/player/InstantRebreak.java:90`

```java
@Override public void onActivate()
```

## meteordevelopment.meteorclient.systems.modules.player.InstantRebreak.sendPacket

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/player/InstantRebreak.java:119`

```java
public void sendPacket()
```

## meteordevelopment.meteorclient.systems.modules.player.InstantRebreak.shouldMine

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/player/InstantRebreak.java:125`

```java
public boolean shouldMine()
```

## meteordevelopment.meteorclient.systems.modules.player.LiquidInteract

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/player/LiquidInteract.java:11`

```java
public class LiquidInteract extends Module
```

## meteordevelopment.meteorclient.systems.modules.player.LiquidInteract.LiquidInteract

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/player/LiquidInteract.java:12`

```java
public LiquidInteract()
```

## meteordevelopment.meteorclient.systems.modules.player.MiddleClickExtra

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/player/MiddleClickExtra.java:33`

```java
public class MiddleClickExtra extends Module
```

## meteordevelopment.meteorclient.systems.modules.player.MiddleClickExtra.MiddleClickExtra

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/player/MiddleClickExtra.java:90`

```java
public MiddleClickExtra()
```

## meteordevelopment.meteorclient.systems.modules.player.MiddleClickExtra.onDeactivate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/player/MiddleClickExtra.java:99`

```java
@Override public void onDeactivate()
```

## meteordevelopment.meteorclient.systems.modules.player.MiddleClickExtra.Mode

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/player/MiddleClickExtra.java:209`

```java
public enum Mode
```

## meteordevelopment.meteorclient.systems.modules.player.Multitask

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/player/Multitask.java:14`

```java
public class Multitask extends Module
```

## meteordevelopment.meteorclient.systems.modules.player.Multitask.Multitask

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/player/Multitask.java:24`

```java
public Multitask()
```

## meteordevelopment.meteorclient.systems.modules.player.Multitask.attackingEntities

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/player/Multitask.java:28`

```java
public boolean attackingEntities()
```

## meteordevelopment.meteorclient.systems.modules.player.NameProtect

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/player/NameProtect.java:15`

```java
public class NameProtect extends Module
```

## meteordevelopment.meteorclient.systems.modules.player.NameProtect.NameProtect

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/player/NameProtect.java:42`

```java
public NameProtect()
```

## meteordevelopment.meteorclient.systems.modules.player.NameProtect.onActivate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/player/NameProtect.java:46`

```java
@Override public void onActivate()
```

## meteordevelopment.meteorclient.systems.modules.player.NameProtect.replaceName

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/player/NameProtect.java:51`

```java
public String replaceName(String string)
```

## meteordevelopment.meteorclient.systems.modules.player.NameProtect.getName

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/player/NameProtect.java:59`

```java
public String getName(String original)
```

## meteordevelopment.meteorclient.systems.modules.player.NameProtect.skinProtect

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/player/NameProtect.java:67`

```java
public boolean skinProtect()
```

## meteordevelopment.meteorclient.systems.modules.player.NoInteract

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/player/NoInteract.java:31`

```java
public class NoInteract extends Module
```

## meteordevelopment.meteorclient.systems.modules.player.NoInteract.NoInteract

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/player/NoInteract.java:128`

```java
public NoInteract()
```

## meteordevelopment.meteorclient.systems.modules.player.NoInteract.HandMode

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/player/NoInteract.java:219`

```java
public enum HandMode
```

## meteordevelopment.meteorclient.systems.modules.player.NoInteract.InteractMode

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/player/NoInteract.java:226`

```java
public enum InteractMode
```

## meteordevelopment.meteorclient.systems.modules.player.NoMiningTrace

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/player/NoMiningTrace.java:20`

```java
public class NoMiningTrace extends Module
```

## meteordevelopment.meteorclient.systems.modules.player.NoMiningTrace.NoMiningTrace

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/player/NoMiningTrace.java:37`

```java
public NoMiningTrace()
```

## meteordevelopment.meteorclient.systems.modules.player.NoMiningTrace.canWork

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/player/NoMiningTrace.java:41`

```java
public boolean canWork(Entity entity)
```

## meteordevelopment.meteorclient.systems.modules.player.NoRotate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/player/NoRotate.java:18`

```java
public class NoRotate extends Module
```

## meteordevelopment.meteorclient.systems.modules.player.NoRotate.NoRotate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/player/NoRotate.java:19`

```java
public NoRotate()
```

## meteordevelopment.meteorclient.systems.modules.player.NoStatusEffects

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/player/NoStatusEffects.java:19`

```java
public class NoStatusEffects extends Module
```

## meteordevelopment.meteorclient.systems.modules.player.NoStatusEffects.NoStatusEffects

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/player/NoStatusEffects.java:34`

```java
public NoStatusEffects()
```

## meteordevelopment.meteorclient.systems.modules.player.NoStatusEffects.shouldBlock

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/player/NoStatusEffects.java:38`

```java
public boolean shouldBlock(MobEffect effect)
```

## meteordevelopment.meteorclient.systems.modules.player.Portals

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/player/Portals.java:11`

```java
public class Portals extends Module
```

## meteordevelopment.meteorclient.systems.modules.player.Portals.Portals

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/player/Portals.java:12`

```java
public Portals()
```

## meteordevelopment.meteorclient.systems.modules.player.PotionSaver

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/player/PotionSaver.java:21`

```java
public class PotionSaver extends Module
```

## meteordevelopment.meteorclient.systems.modules.player.PotionSaver.onlyWhenStationary

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/player/PotionSaver.java:46`

```java
public final Setting<Boolean> onlyWhenStationary = sgGeneral.add(new BoolSetting.Builder() .name("only-when-stationary") .description("Only freezes effects when you aren't moving.") .defaultValue(false) .build() )
```

## meteordevelopment.meteorclient.systems.modules.player.PotionSaver.PotionSaver

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/player/PotionSaver.java:53`

```java
public PotionSaver()
```

## meteordevelopment.meteorclient.systems.modules.player.PotionSaver.shouldFreeze

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/player/PotionSaver.java:57`

```java
public boolean shouldFreeze(MobEffect effect)
```

## meteordevelopment.meteorclient.systems.modules.player.Reach

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/player/Reach.java:17`

```java
public class Reach extends Module
```

## meteordevelopment.meteorclient.systems.modules.player.Reach.Reach

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/player/Reach.java:34`

```java
public Reach()
```

## meteordevelopment.meteorclient.systems.modules.player.Reach.getWidget

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/player/Reach.java:38`

```java
@Override public WWidget getWidget(GuiTheme theme)
```

## meteordevelopment.meteorclient.systems.modules.player.Reach.blockReach

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/player/Reach.java:44`

```java
public double blockReach()
```

## meteordevelopment.meteorclient.systems.modules.player.Reach.entityReach

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/player/Reach.java:48`

```java
public double entityReach()
```

## meteordevelopment.meteorclient.systems.modules.player.Rotation

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/player/Rotation.java:17`

```java
public class Rotation extends Module
```

## meteordevelopment.meteorclient.systems.modules.player.Rotation.Rotation

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/player/Rotation.java:59`

```java
public Rotation()
```

## meteordevelopment.meteorclient.systems.modules.player.Rotation.onActivate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/player/Rotation.java:63`

```java
@Override public void onActivate()
```

## meteordevelopment.meteorclient.systems.modules.player.Rotation.LockMode

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/player/Rotation.java:95`

```java
public enum LockMode
```

## meteordevelopment.meteorclient.systems.modules.player.SpeedMine

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/player/SpeedMine.java:26`

```java
public class SpeedMine extends Module
```

## meteordevelopment.meteorclient.systems.modules.player.SpeedMine.mode

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/player/SpeedMine.java:29`

```java
public final Setting<Mode> mode = sgGeneral.add(new EnumSetting.Builder<Mode>() .name("mode") .defaultValue(Mode.Damage) .onChanged(_ -> removeHaste()) .build() )
```

## meteordevelopment.meteorclient.systems.modules.player.SpeedMine.modifier

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/player/SpeedMine.java:52`

```java
public final Setting<Double> modifier = sgGeneral.add(new DoubleSetting.Builder() .name("modifier") .description("Mining speed modifier. An additional value of 0.2 is equivalent to one haste level (1.2 = haste 1).") .defaultValue(1.4) .visible(() -> mode.get() == Mode.Normal) .min(0) .build() )
```

## meteordevelopment.meteorclient.systems.modules.player.SpeedMine.SpeedMine

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/player/SpeedMine.java:87`

```java
public SpeedMine()
```

## meteordevelopment.meteorclient.systems.modules.player.SpeedMine.onDeactivate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/player/SpeedMine.java:91`

```java
@Override public void onDeactivate()
```

## meteordevelopment.meteorclient.systems.modules.player.SpeedMine.filter

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/player/SpeedMine.java:134`

```java
public boolean filter(Block block)
```

## meteordevelopment.meteorclient.systems.modules.player.SpeedMine.instamine

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/player/SpeedMine.java:138`

```java
public boolean instamine()
```

## meteordevelopment.meteorclient.systems.modules.player.SpeedMine.Mode

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/player/SpeedMine.java:142`

```java
public enum Mode
```

## meteordevelopment.meteorclient.systems.modules.render.BetterTab

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/BetterTab.java:23`

```java
public class BetterTab extends Module
```

## meteordevelopment.meteorclient.systems.modules.render.BetterTab.tabSize

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/BetterTab.java:27`

```java
public final Setting<Integer> tabSize = sgGeneral.add(new IntSetting.Builder() .name("tablist-size") .description("How many players in total to display in the tablist.") .defaultValue(100) .min(1) .sliderRange(1, 1000) .build() )
```

## meteordevelopment.meteorclient.systems.modules.render.BetterTab.tabHeight

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/BetterTab.java:36`

```java
public final Setting<Integer> tabHeight = sgGeneral.add(new IntSetting.Builder() .name("column-height") .description("How many players to display in each column.") .defaultValue(20) .min(1) .sliderRange(1, 1000) .build() )
```

## meteordevelopment.meteorclient.systems.modules.render.BetterTab.accurateLatency

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/BetterTab.java:67`

```java
public final Setting<Boolean> accurateLatency = sgGeneral.add(new BoolSetting.Builder() .name("accurate-latency") .description("Shows latency as a number in the tablist.") .defaultValue(true) .build() )
```

## meteordevelopment.meteorclient.systems.modules.render.BetterTab.BetterTab

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/BetterTab.java:82`

```java
public BetterTab()
```

## meteordevelopment.meteorclient.systems.modules.render.BetterTab.getPlayerName

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/BetterTab.java:86`

```java
public Component getPlayerName(PlayerInfo playerListEntry)
```

## meteordevelopment.meteorclient.systems.modules.render.BetterTooltips

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/BetterTooltips.java:65`

```java
public class BetterTooltips extends Module
```

## meteordevelopment.meteorclient.systems.modules.render.BetterTooltips.ECHEST_COLOR

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/BetterTooltips.java:66`

```java
public static final Color ECHEST_COLOR = new Color(0, 50, 50)
```

## meteordevelopment.meteorclient.systems.modules.render.BetterTooltips.mapsScale

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/BetterTooltips.java:147`

```java
public final Setting<Double> mapsScale = sgPreviews.add(new DoubleSetting.Builder() .name("map-scale") .description("The scale of the map preview.") .defaultValue(1) .min(0.001) .sliderMax(1) .visible(maps::get) .build() )
```

## meteordevelopment.meteorclient.systems.modules.render.BetterTooltips.byteSize

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/BetterTooltips.java:199`

```java
public final Setting<Boolean> byteSize = sgOther.add(new BoolSetting.Builder() .name("byte-size") .description("Displays an item's size in bytes in the tooltip.") .defaultValue(true) .onChanged(_ -> updateTooltips = true) .build() )
```

## meteordevelopment.meteorclient.systems.modules.render.BetterTooltips.tooltip

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/BetterTooltips.java:225`

```java
public final Setting<Boolean> tooltip = sgHideFlags.add(new BoolSetting.Builder() .name("tooltip") .description("Show the tooltip when it's hidden.") .defaultValue(false) .build() )
```

## meteordevelopment.meteorclient.systems.modules.render.BetterTooltips.additional

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/BetterTooltips.java:232`

```java
public final Setting<Boolean> additional = sgHideFlags.add(new BoolSetting.Builder() .name("tooltip-components") .description("Shows tooltip components when they're hidden - e.g. enchantments, attributes, lore, etc.") .defaultValue(false) .build() )
```

## meteordevelopment.meteorclient.systems.modules.render.BetterTooltips.BetterTooltips

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/BetterTooltips.java:243`

```java
public BetterTooltips()
```

## meteordevelopment.meteorclient.systems.modules.render.BetterTooltips.applyCompactShulkerTooltip

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/BetterTooltips.java:397`

```java
public void applyCompactShulkerTooltip(List<Optional<ItemStackTemplate>> stacks, Consumer<Component> textConsumer)
```

## meteordevelopment.meteorclient.systems.modules.render.BetterTooltips.openContents

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/BetterTooltips.java:498`

```java
public boolean openContents()
```

## meteordevelopment.meteorclient.systems.modules.render.BetterTooltips.shouldOpenContents

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/BetterTooltips.java:502`

```java
public boolean shouldOpenContents(InputWithModifiers input)
```

## meteordevelopment.meteorclient.systems.modules.render.BetterTooltips.openContent

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/BetterTooltips.java:510`

```java
public boolean openContent(ItemStack itemStack)
```

## meteordevelopment.meteorclient.systems.modules.render.BetterTooltips.previewShulkers

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/BetterTooltips.java:529`

```java
public boolean previewShulkers()
```

## meteordevelopment.meteorclient.systems.modules.render.BetterTooltips.shulkerCompactTooltip

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/BetterTooltips.java:533`

```java
public boolean shulkerCompactTooltip()
```

## meteordevelopment.meteorclient.systems.modules.render.BetterTooltips.previewBundles

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/BetterTooltips.java:557`

```java
public boolean previewBundles()
```

## meteordevelopment.meteorclient.systems.modules.render.BetterTooltips.updateTooltips

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/BetterTooltips.java:565`

```java
public boolean updateTooltips()
```

## meteordevelopment.meteorclient.systems.modules.render.BetterTooltips.DisplayWhen

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/BetterTooltips.java:574`

```java
public enum DisplayWhen
```

## meteordevelopment.meteorclient.systems.modules.render.BetterTooltips.SortSize

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/BetterTooltips.java:579`

```java
public enum SortSize
```

## meteordevelopment.meteorclient.systems.modules.render.BlockSelection

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/BlockSelection.java:22`

```java
public class BlockSelection extends Module
```

## meteordevelopment.meteorclient.systems.modules.render.BlockSelection.BlockSelection

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/BlockSelection.java:67`

```java
public BlockSelection()
```

## meteordevelopment.meteorclient.systems.modules.render.Blur

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/Blur.java:39`

```java
public class Blur extends Module
```

## meteordevelopment.meteorclient.systems.modules.render.Blur.Blur

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/Blur.java:123`

```java
public Blur()
```

## meteordevelopment.meteorclient.systems.modules.render.BossStack

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/BossStack.java:23`

```java
public class BossStack extends Module
```

## meteordevelopment.meteorclient.systems.modules.render.BossStack.stack

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/BossStack.java:26`

```java
public final Setting<Boolean> stack = sgGeneral.add(new BoolSetting.Builder() .name("stack") .description("Stacks boss bars and adds a counter to the text.") .defaultValue(true) .build() )
```

## meteordevelopment.meteorclient.systems.modules.render.BossStack.hideName

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/BossStack.java:33`

```java
public final Setting<Boolean> hideName = sgGeneral.add(new BoolSetting.Builder() .name("hide-name") .description("Hides the names of boss bars.") .defaultValue(false) .build() )
```

## meteordevelopment.meteorclient.systems.modules.render.BossStack.barMap

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/BossStack.java:48`

```java
public static final Map<LerpingBossEvent, Integer> barMap = new WeakHashMap<>()
```

## meteordevelopment.meteorclient.systems.modules.render.BossStack.BossStack

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/BossStack.java:50`

```java
public BossStack()
```

## meteordevelopment.meteorclient.systems.modules.render.Breadcrumbs

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/Breadcrumbs.java:21`

```java
public class Breadcrumbs extends Module
```

## meteordevelopment.meteorclient.systems.modules.render.Breadcrumbs.Breadcrumbs

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/Breadcrumbs.java:56`

```java
public Breadcrumbs()
```

## meteordevelopment.meteorclient.systems.modules.render.Breadcrumbs.onActivate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/Breadcrumbs.java:60`

```java
@Override public void onActivate()
```

## meteordevelopment.meteorclient.systems.modules.render.Breadcrumbs.onDeactivate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/Breadcrumbs.java:68`

```java
@Override public void onDeactivate()
```

## meteordevelopment.meteorclient.systems.modules.render.BreakIndicators

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/BreakIndicators.java:29`

```java
public class BreakIndicators extends Module
```

## meteordevelopment.meteorclient.systems.modules.render.BreakIndicators.packetMine

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/BreakIndicators.java:39`

```java
public final Setting<Boolean> packetMine = sgGeneral.add(new BoolSetting.Builder() .name("packet-mine") .description("Whether or not to render blocks being packet mined.") .defaultValue(true) .build() )
```

## meteordevelopment.meteorclient.systems.modules.render.BreakIndicators.BreakIndicators

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/BreakIndicators.java:81`

```java
public BreakIndicators()
```

## meteordevelopment.meteorclient.systems.modules.render.CameraTweaks

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/CameraTweaks.java:18`

```java
public class CameraTweaks extends Module
```

## meteordevelopment.meteorclient.systems.modules.render.CameraTweaks.distance

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/CameraTweaks.java:66`

```java
public double distance
```

## meteordevelopment.meteorclient.systems.modules.render.CameraTweaks.CameraTweaks

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/CameraTweaks.java:68`

```java
public CameraTweaks()
```

## meteordevelopment.meteorclient.systems.modules.render.CameraTweaks.onActivate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/CameraTweaks.java:72`

```java
@Override public void onActivate()
```

## meteordevelopment.meteorclient.systems.modules.render.CameraTweaks.clip

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/CameraTweaks.java:94`

```java
public boolean clip()
```

## meteordevelopment.meteorclient.systems.modules.render.Chams

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/Chams.java:19`

```java
public class Chams extends Module
```

## meteordevelopment.meteorclient.systems.modules.render.Chams.entities

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/Chams.java:27`

```java
public final Setting<Set<EntityType<?>>> entities = sgThroughWalls.add(new EntityTypeListSetting.Builder() .name("entities") .description("Select entities to show through walls.") .onlyAttackable() .build() )
```

## meteordevelopment.meteorclient.systems.modules.render.Chams.shader

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/Chams.java:34`

```java
public final Setting<Shader> shader = sgThroughWalls.add(new EnumSetting.Builder<Shader>() .name("shader") .description("Renders a shader over of the entities.") .defaultValue(Shader.Image) .build() )
```

## meteordevelopment.meteorclient.systems.modules.render.Chams.shaderColor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/Chams.java:41`

```java
public final Setting<SettingColor> shaderColor = sgThroughWalls.add(new ColorSetting.Builder() .name("color") .description("The color that the shader is drawn with.") .defaultValue(new SettingColor(255, 255, 255, 150)) .visible(() -> shader.get() != Shader.None) .build() )
```

## meteordevelopment.meteorclient.systems.modules.render.Chams.ignoreSelfDepth

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/Chams.java:49`

```java
public final Setting<Boolean> ignoreSelfDepth = sgThroughWalls.add(new BoolSetting.Builder() .name("ignore-self") .description("Ignores yourself drawing the player.") .defaultValue(true) .build() )
```

## meteordevelopment.meteorclient.systems.modules.render.Chams.players

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/Chams.java:58`

```java
public final Setting<Boolean> players = sgPlayers.add(new BoolSetting.Builder() .name("players") .description("Enables model tweaks for players.") .defaultValue(false) .build() )
```

## meteordevelopment.meteorclient.systems.modules.render.Chams.ignoreSelf

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/Chams.java:65`

```java
public final Setting<Boolean> ignoreSelf = sgPlayers.add(new BoolSetting.Builder() .name("ignore-self") .description("Ignores yourself when tweaking player models.") .defaultValue(false) .visible(players::get) .build() )
```

## meteordevelopment.meteorclient.systems.modules.render.Chams.playersTexture

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/Chams.java:73`

```java
public final Setting<Boolean> playersTexture = sgPlayers.add(new BoolSetting.Builder() .name("texture") .description("Enables player model textures.") .defaultValue(false) .visible(players::get) .build() )
```

## meteordevelopment.meteorclient.systems.modules.render.Chams.playersColor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/Chams.java:81`

```java
public final Setting<SettingColor> playersColor = sgPlayers.add(new ColorSetting.Builder() .name("color") .description("The color of player models.") .defaultValue(new SettingColor(198, 135, 254, 150)) .visible(players::get) .build() )
```

## meteordevelopment.meteorclient.systems.modules.render.Chams.playersScale

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/Chams.java:89`

```java
public final Setting<Double> playersScale = sgPlayers.add(new DoubleSetting.Builder() .name("scale") .description("Players scale.") .defaultValue(1.0) .min(0.0) .visible(players::get) .build() )
```

## meteordevelopment.meteorclient.systems.modules.render.Chams.crystals

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/Chams.java:100`

```java
public final Setting<Boolean> crystals = sgCrystals.add(new BoolSetting.Builder() .name("crystals") .description("Enables model tweaks for end crystals.") .defaultValue(false) .build() )
```

## meteordevelopment.meteorclient.systems.modules.render.Chams.crystalsScale

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/Chams.java:107`

```java
public final Setting<Double> crystalsScale = sgCrystals.add(new DoubleSetting.Builder() .name("scale") .description("Crystal scale.") .defaultValue(0.6) .min(0) .visible(crystals::get) .build() )
```

## meteordevelopment.meteorclient.systems.modules.render.Chams.crystalsBounce

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/Chams.java:116`

```java
public final Setting<Double> crystalsBounce = sgCrystals.add(new DoubleSetting.Builder() .name("bounce") .description("How high crystals bounce.") .defaultValue(0.6) .min(0.0) .visible(crystals::get) .build() )
```

## meteordevelopment.meteorclient.systems.modules.render.Chams.crystalsRotationSpeed

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/Chams.java:125`

```java
public final Setting<Double> crystalsRotationSpeed = sgCrystals.add(new DoubleSetting.Builder() .name("rotation-speed") .description("Multiplies the rotation speed of the crystal.") .defaultValue(0.3) .min(0) .visible(crystals::get) .build() )
```

## meteordevelopment.meteorclient.systems.modules.render.Chams.crystalsTexture

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/Chams.java:134`

```java
public final Setting<Boolean> crystalsTexture = sgCrystals.add(new BoolSetting.Builder() .name("texture") .description("Whether to render crystal model textures.") .defaultValue(true) .visible(crystals::get) .build() )
```

## meteordevelopment.meteorclient.systems.modules.render.Chams.crystalsColor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/Chams.java:142`

```java
public final Setting<SettingColor> crystalsColor = sgCrystals.add(new ColorSetting.Builder() .name("crystal-color") .description("The color of the of the crystal.") .defaultValue(new SettingColor(198, 135, 254, 255)) .visible(crystals::get) .build() )
```

## meteordevelopment.meteorclient.systems.modules.render.Chams.hand

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/Chams.java:152`

```java
public final Setting<Boolean> hand = sgHand.add(new BoolSetting.Builder() .name("enabled") .description("Enables tweaks of hand rendering.") .defaultValue(false) .build() )
```

## meteordevelopment.meteorclient.systems.modules.render.Chams.handTexture

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/Chams.java:159`

```java
public final Setting<Boolean> handTexture = sgHand.add(new BoolSetting.Builder() .name("texture") .description("Whether to render hand textures.") .defaultValue(false) .visible(hand::get) .build() )
```

## meteordevelopment.meteorclient.systems.modules.render.Chams.handColor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/Chams.java:167`

```java
public final Setting<SettingColor> handColor = sgHand.add(new ColorSetting.Builder() .name("hand-color") .description("The color of your hand.") .defaultValue(new SettingColor(198, 135, 254, 150)) .visible(hand::get) .build() )
```

## meteordevelopment.meteorclient.systems.modules.render.Chams.BLANK

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/Chams.java:175`

```java
public static final Identifier BLANK = MeteorClient.identifier("textures/blank.png")
```

## meteordevelopment.meteorclient.systems.modules.render.Chams.Chams

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/Chams.java:177`

```java
public Chams()
```

## meteordevelopment.meteorclient.systems.modules.render.Chams.shouldRender

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/Chams.java:181`

```java
public boolean shouldRender(Entity entity)
```

## meteordevelopment.meteorclient.systems.modules.render.Chams.isShader

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/Chams.java:185`

```java
public boolean isShader()
```

## meteordevelopment.meteorclient.systems.modules.render.Chams.Shader

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/Chams.java:189`

```java
public enum Shader
```

## meteordevelopment.meteorclient.systems.modules.render.CityESP

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/CityESP.java:25`

```java
public class CityESP extends Module
```

## meteordevelopment.meteorclient.systems.modules.render.CityESP.CityESP

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/CityESP.java:53`

```java
public CityESP()
```

## meteordevelopment.meteorclient.systems.modules.render.ESP

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/ESP.java:35`

```java
public class ESP extends Module
```

## meteordevelopment.meteorclient.systems.modules.render.ESP.mode

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/ESP.java:41`

```java
public final Setting<Mode> mode = sgGeneral.add(new EnumSetting.Builder<Mode>() .name("mode") .description("Rendering mode.") .defaultValue(Mode.Shader) .build() )
```

## meteordevelopment.meteorclient.systems.modules.render.ESP.highlightTarget

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/ESP.java:48`

```java
public final Setting<Boolean> highlightTarget = sgGeneral.add(new BoolSetting.Builder() .name("highlight-target") .description("highlights the currently targeted entity differently") .defaultValue(false) .build() )
```

## meteordevelopment.meteorclient.systems.modules.render.ESP.targetHitbox

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/ESP.java:55`

```java
public final Setting<Boolean> targetHitbox = sgGeneral.add(new BoolSetting.Builder() .name("target-hitbox") .description("draw the hitbox of the target entity") .defaultValue(true) .visible(highlightTarget::get) .build() )
```

## meteordevelopment.meteorclient.systems.modules.render.ESP.outlineWidth

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/ESP.java:63`

```java
public final Setting<Integer> outlineWidth = sgGeneral.add(new IntSetting.Builder() .name("outline-width") .description("The width of the shader outline.") .visible(() -> mode.get() == Mode.Shader) .defaultValue(2) .range(1, 10) .sliderRange(1, 5) .build() )
```

## meteordevelopment.meteorclient.systems.modules.render.ESP.glowMultiplier

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/ESP.java:73`

```java
public final Setting<Double> glowMultiplier = sgGeneral.add(new DoubleSetting.Builder() .name("glow-multiplier") .description("Multiplier for glow effect") .visible(() -> mode.get() == Mode.Shader) .decimalPlaces(3) .defaultValue(3.5) .min(0) .sliderMax(10) .build() )
```

## meteordevelopment.meteorclient.systems.modules.render.ESP.ignoreSelf

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/ESP.java:84`

```java
public final Setting<Boolean> ignoreSelf = sgGeneral.add(new BoolSetting.Builder() .name("ignore-self") .description("Ignores yourself drawing the shader.") .defaultValue(true) .build() )
```

## meteordevelopment.meteorclient.systems.modules.render.ESP.shapeMode

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/ESP.java:91`

```java
public final Setting<ShapeMode> shapeMode = sgGeneral.add(new EnumSetting.Builder<ShapeMode>() .name("shape-mode") .description("How the shapes are rendered.") .visible(() -> mode.get() != Mode.Glow) .defaultValue(ShapeMode.Both) .build() )
```

## meteordevelopment.meteorclient.systems.modules.render.ESP.fillOpacity

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/ESP.java:99`

```java
public final Setting<Double> fillOpacity = sgGeneral.add(new DoubleSetting.Builder() .name("fill-opacity") .description("The opacity of the shape fill.") .visible(() -> shapeMode.get() != ShapeMode.Lines && mode.get() != Mode.Glow) .defaultValue(0.3) .range(0, 1) .sliderMax(1) .build() )
```

## meteordevelopment.meteorclient.systems.modules.render.ESP.colorMode

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/ESP.java:127`

```java
public final Setting<ESPColorMode> colorMode = sgColors.add(new EnumSetting.Builder<ESPColorMode>() .name("color-mode") .description("Determines the colors used for entities.") .defaultValue(ESPColorMode.EntityType) .build() )
```

## meteordevelopment.meteorclient.systems.modules.render.ESP.friendOverride

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/ESP.java:134`

```java
public final Setting<Boolean> friendOverride = sgColors.add(new BoolSetting.Builder() .name("show-friend-colors") .description("Whether or not to override the distance/health color of friends with the friend color.") .defaultValue(true) .visible(() -> colorMode.get() == ESPColorMode.Distance || colorMode.get() == ESPColorMode.Health) .build() )
```

## meteordevelopment.meteorclient.systems.modules.render.ESP.ESP

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/ESP.java:224`

```java
public ESP()
```

## meteordevelopment.meteorclient.systems.modules.render.ESP.forceRender

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/ESP.java:334`

```java
public boolean forceRender()
```

## meteordevelopment.meteorclient.systems.modules.render.ESP.drawAsTarget

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/ESP.java:357`

```java
public boolean drawAsTarget(Entity entity)
```

## meteordevelopment.meteorclient.systems.modules.render.ESP.shouldSkip

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/ESP.java:361`

```java
public boolean shouldSkip(Entity entity)
```

## meteordevelopment.meteorclient.systems.modules.render.ESP.shouldSkip

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/ESP.java:369`

```java
public boolean shouldSkip(EntityType<?> entityType)
```

## meteordevelopment.meteorclient.systems.modules.render.ESP.getColor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/ESP.java:373`

```java
public Color getColor(Entity entity)
```

## meteordevelopment.meteorclient.systems.modules.render.ESP.getEntityTypeColor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/ESP.java:400`

```java
public Color getEntityTypeColor(Entity entity)
```

## meteordevelopment.meteorclient.systems.modules.render.ESP.getInfoString

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/ESP.java:425`

```java
@Override public String getInfoString()
```

## meteordevelopment.meteorclient.systems.modules.render.ESP.isShader

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/ESP.java:430`

```java
public boolean isShader()
```

## meteordevelopment.meteorclient.systems.modules.render.ESP.isGlow

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/ESP.java:434`

```java
public boolean isGlow()
```

## meteordevelopment.meteorclient.systems.modules.render.ESP.ESPColorMode

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/ESP.java:438`

```java
public enum ESPColorMode
```

## meteordevelopment.meteorclient.systems.modules.render.ESP.ESPColorMode.toString

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/ESP.java:443`

```java
@Override public String toString()
```

## meteordevelopment.meteorclient.systems.modules.render.ESP.Mode

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/ESP.java:449`

```java
public enum Mode
```

## meteordevelopment.meteorclient.systems.modules.render.ESP.Mode.toString

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/ESP.java:456`

```java
@Override public String toString()
```

## meteordevelopment.meteorclient.systems.modules.render.EntityOwner

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/EntityOwner.java:36`

```java
public class EntityOwner extends Module
```

## meteordevelopment.meteorclient.systems.modules.render.EntityOwner.EntityOwner

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/EntityOwner.java:53`

```java
public EntityOwner()
```

## meteordevelopment.meteorclient.systems.modules.render.EntityOwner.onDeactivate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/EntityOwner.java:57`

```java
@Override public void onDeactivate()
```

## meteordevelopment.meteorclient.systems.modules.render.FreeLook

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/FreeLook.java:18`

```java
public class FreeLook extends Module
```

## meteordevelopment.meteorclient.systems.modules.render.FreeLook.mode

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/FreeLook.java:24`

```java
public final Setting<Mode> mode = sgGeneral.add(new EnumSetting.Builder<Mode>() .name("mode") .description("Which entity to rotate.") .defaultValue(Mode.Player) .build() )
```

## meteordevelopment.meteorclient.systems.modules.render.FreeLook.togglePerspective

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/FreeLook.java:31`

```java
public final Setting<Boolean> togglePerspective = sgGeneral.add(new BoolSetting.Builder() .name("toggle-perspective") .description("Changes your perspective on toggle.") .defaultValue(true) .build() )
```

## meteordevelopment.meteorclient.systems.modules.render.FreeLook.sensitivity

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/FreeLook.java:38`

```java
public final Setting<Double> sensitivity = sgGeneral.add(new DoubleSetting.Builder() .name("camera-sensitivity") .description("How fast the camera moves in camera mode.") .defaultValue(8) .min(0) .sliderMax(10) .build() )
```

## meteordevelopment.meteorclient.systems.modules.render.FreeLook.arrows

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/FreeLook.java:49`

```java
public final Setting<Boolean> arrows = sgArrows.add(new BoolSetting.Builder() .name("arrows-control-opposite") .description("Allows you to control the other entities rotation with the arrow keys.") .defaultValue(true) .build() )
```

## meteordevelopment.meteorclient.systems.modules.render.FreeLook.cameraYaw

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/FreeLook.java:64`

```java
public float cameraYaw
```

## meteordevelopment.meteorclient.systems.modules.render.FreeLook.cameraPitch

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/FreeLook.java:65`

```java
public float cameraPitch
```

## meteordevelopment.meteorclient.systems.modules.render.FreeLook.FreeLook

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/FreeLook.java:69`

```java
public FreeLook()
```

## meteordevelopment.meteorclient.systems.modules.render.FreeLook.onActivate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/FreeLook.java:73`

```java
@Override public void onActivate()
```

## meteordevelopment.meteorclient.systems.modules.render.FreeLook.onDeactivate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/FreeLook.java:83`

```java
@Override public void onDeactivate()
```

## meteordevelopment.meteorclient.systems.modules.render.FreeLook.playerMode

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/FreeLook.java:88`

```java
public boolean playerMode()
```

## meteordevelopment.meteorclient.systems.modules.render.FreeLook.cameraMode

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/FreeLook.java:92`

```java
public boolean cameraMode()
```

## meteordevelopment.meteorclient.systems.modules.render.FreeLook.Mode

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/FreeLook.java:127`

```java
public enum Mode
```

## meteordevelopment.meteorclient.systems.modules.render.Freecam

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/Freecam.java:49`

```java
public class Freecam extends Module
```

## meteordevelopment.meteorclient.systems.modules.render.Freecam.pos

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/Freecam.java:141`

```java
public final Vector3d pos = new Vector3d()
```

## meteordevelopment.meteorclient.systems.modules.render.Freecam.prevPos

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/Freecam.java:142`

```java
public final Vector3d prevPos = new Vector3d()
```

## meteordevelopment.meteorclient.systems.modules.render.Freecam.yaw

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/Freecam.java:147`

```java
public float yaw, pitch
```

## meteordevelopment.meteorclient.systems.modules.render.Freecam.pitch

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/Freecam.java:147`

```java
public float yaw, pitch
```

## meteordevelopment.meteorclient.systems.modules.render.Freecam.lastYaw

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/Freecam.java:148`

```java
public float lastYaw, lastPitch
```

## meteordevelopment.meteorclient.systems.modules.render.Freecam.lastPitch

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/Freecam.java:148`

```java
public float lastYaw, lastPitch
```

## meteordevelopment.meteorclient.systems.modules.render.Freecam.Freecam

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/Freecam.java:157`

```java
public Freecam()
```

## meteordevelopment.meteorclient.systems.modules.render.Freecam.onActivate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/Freecam.java:161`

```java
@Override public void onActivate()
```

## meteordevelopment.meteorclient.systems.modules.render.Freecam.onDeactivate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/Freecam.java:201`

```java
@Override public void onDeactivate()
```

## meteordevelopment.meteorclient.systems.modules.render.Freecam.onKey

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/Freecam.java:307`

```java
@EventHandler(priority = EventPriority.HIGH) public void onKey(KeyInputEvent event)
```

## meteordevelopment.meteorclient.systems.modules.render.Freecam.changeLookDirection

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/Freecam.java:458`

```java
public void changeLookDirection(double deltaX, double deltaY)
```

## meteordevelopment.meteorclient.systems.modules.render.Freecam.renderHands

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/Freecam.java:468`

```java
public boolean renderHands()
```

## meteordevelopment.meteorclient.systems.modules.render.Freecam.staySneaking

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/Freecam.java:472`

```java
public boolean staySneaking()
```

## meteordevelopment.meteorclient.systems.modules.render.Freecam.getX

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/Freecam.java:476`

```java
public double getX(float tickDelta)
```

## meteordevelopment.meteorclient.systems.modules.render.Freecam.getY

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/Freecam.java:480`

```java
public double getY(float tickDelta)
```

## meteordevelopment.meteorclient.systems.modules.render.Freecam.getZ

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/Freecam.java:484`

```java
public double getZ(float tickDelta)
```

## meteordevelopment.meteorclient.systems.modules.render.Freecam.getYaw

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/Freecam.java:488`

```java
public double getYaw(float tickDelta)
```

## meteordevelopment.meteorclient.systems.modules.render.Freecam.getPitch

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/Freecam.java:492`

```java
public double getPitch(float tickDelta)
```

## meteordevelopment.meteorclient.systems.modules.render.Fullbright

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/Fullbright.java:22`

```java
public class Fullbright extends Module
```

## meteordevelopment.meteorclient.systems.modules.render.Fullbright.mode

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/Fullbright.java:25`

```java
public final Setting<Mode> mode = sgGeneral.add(new EnumSetting.Builder<Mode>() .name("mode") .description("The mode to use for Fullbright.") .defaultValue(Mode.Gamma) .onChanged(mode -> { if (isActive()) { if (mode != Mode.Potion) disableNightVision(); if (mc.levelRenderer != null) { mc.levelExtractor.allChanged(); } } }) .build() )
```

## meteordevelopment.meteorclient.systems.modules.render.Fullbright.lightType

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/Fullbright.java:40`

```java
public final Setting<LightLayer> lightType = sgGeneral.add(new EnumSetting.Builder<LightLayer>() .name("light-type") .description("Which type of light to use for Luminance mode.") .defaultValue(LightLayer.BLOCK) .visible(() -> mode.get() == Mode.Luminance) .onChanged(_ -> { if (mc.levelRenderer != null && isActive()) { mc.levelExtractor.allChanged(); } }) .build() )
```

## meteordevelopment.meteorclient.systems.modules.render.Fullbright.Fullbright

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/Fullbright.java:68`

```java
public Fullbright()
```

## meteordevelopment.meteorclient.systems.modules.render.Fullbright.onActivate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/Fullbright.java:72`

```java
@Override public void onActivate()
```

## meteordevelopment.meteorclient.systems.modules.render.Fullbright.onDeactivate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/Fullbright.java:79`

```java
@Override public void onDeactivate()
```

## meteordevelopment.meteorclient.systems.modules.render.Fullbright.getLuminance

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/Fullbright.java:86`

```java
public int getLuminance(LightLayer type)
```

## meteordevelopment.meteorclient.systems.modules.render.Fullbright.getGamma

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/Fullbright.java:91`

```java
public boolean getGamma()
```

## meteordevelopment.meteorclient.systems.modules.render.Fullbright.Mode

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/Fullbright.java:114`

```java
public enum Mode
```

## meteordevelopment.meteorclient.systems.modules.render.HandView

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/HandView.java:21`

```java
public class HandView extends Module
```

## meteordevelopment.meteorclient.systems.modules.render.HandView.oldAnimations

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/HandView.java:36`

```java
public final Setting<Boolean> oldAnimations = sgGeneral.add(new BoolSetting.Builder() .name("old-animations") .description("Changes hit animations to those like 1.8") .defaultValue(false) .build() )
```

## meteordevelopment.meteorclient.systems.modules.render.HandView.skipSwapping

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/HandView.java:43`

```java
public final Setting<Boolean> skipSwapping = sgGeneral.add(new BoolSetting.Builder() .name("skip-swapping-animation") .description("Whether or not to skip the item swapping animation") .defaultValue(false) .build() )
```

## meteordevelopment.meteorclient.systems.modules.render.HandView.swordSlash

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/HandView.java:57`

```java
public final Setting<Boolean> swordSlash = sgGeneral.add(new BoolSetting.Builder() .name("sword-slash") .description("Replaces the sword swing animation with the offhand idle animation.") .defaultValue(false) .build() )
```

## meteordevelopment.meteorclient.systems.modules.render.HandView.swingMode

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/HandView.java:64`

```java
public final Setting<SwingMode> swingMode = sgGeneral.add(new EnumSetting.Builder<SwingMode>() .name("swing-mode") .description("Modifies your client & server hand swinging.") .defaultValue(SwingMode.None) .build() )
```

## meteordevelopment.meteorclient.systems.modules.render.HandView.swingSpeed

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/HandView.java:71`

```java
public final Setting<Double> swingSpeed = sgGeneral.add(new DoubleSetting.Builder() .name("swing-speed") .description("The swing speed of your hands.") .defaultValue(6) .range(0, 20) .sliderMax(20) .build() )
```

## meteordevelopment.meteorclient.systems.modules.render.HandView.mainSwing

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/HandView.java:80`

```java
public final Setting<Double> mainSwing = sgGeneral.add(new DoubleSetting.Builder() .name("main-hand-progress") .description("The swing progress of your main hand.") .defaultValue(0) .range(0, 1) .sliderMax(1) .build() )
```

## meteordevelopment.meteorclient.systems.modules.render.HandView.offSwing

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/HandView.java:89`

```java
public final Setting<Double> offSwing = sgGeneral.add(new DoubleSetting.Builder() .name("off-hand-progress") .description("The swing progress of your off hand.") .defaultValue(0) .range(0, 1) .sliderMax(1) .build() )
```

## meteordevelopment.meteorclient.systems.modules.render.HandView.HandView

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/HandView.java:184`

```java
public HandView()
```

## meteordevelopment.meteorclient.systems.modules.render.HandView.oldAnimations

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/HandView.java:231`

```java
public boolean oldAnimations()
```

## meteordevelopment.meteorclient.systems.modules.render.HandView.skipSwapping

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/HandView.java:235`

```java
public boolean skipSwapping()
```

## meteordevelopment.meteorclient.systems.modules.render.HandView.disableFoodAnimation

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/HandView.java:239`

```java
public boolean disableFoodAnimation()
```

## meteordevelopment.meteorclient.systems.modules.render.HandView.swordSlash

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/HandView.java:243`

```java
public boolean swordSlash()
```

## meteordevelopment.meteorclient.systems.modules.render.HandView.SwingMode

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/HandView.java:247`

```java
public enum SwingMode
```

## meteordevelopment.meteorclient.systems.modules.render.HoleESP

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/HoleESP.java:33`

```java
public class HoleESP extends Module
```

## meteordevelopment.meteorclient.systems.modules.render.HoleESP.HoleESP

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/HoleESP.java:165`

```java
public HoleESP()
```

## meteordevelopment.meteorclient.systems.modules.render.ItemHighlight

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/ItemHighlight.java:20`

```java
public class ItemHighlight extends Module
```

## meteordevelopment.meteorclient.systems.modules.render.ItemHighlight.ItemHighlight

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/ItemHighlight.java:36`

```java
public ItemHighlight()
```

## meteordevelopment.meteorclient.systems.modules.render.ItemHighlight.getColor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/ItemHighlight.java:40`

```java
public int getColor(ItemStack stack)
```

## meteordevelopment.meteorclient.systems.modules.render.ItemPhysics

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/ItemPhysics.java:32`

```java
public class ItemPhysics extends Module
```

## meteordevelopment.meteorclient.systems.modules.render.ItemPhysics.ItemPhysics

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/ItemPhysics.java:49`

```java
public ItemPhysics()
```

## meteordevelopment.meteorclient.systems.modules.render.LightOverlay

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/LightOverlay.java:25`

```java
public class LightOverlay extends Module
```

## meteordevelopment.meteorclient.systems.modules.render.LightOverlay.LightOverlay

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/LightOverlay.java:82`

```java
public LightOverlay()
```

## meteordevelopment.meteorclient.systems.modules.render.LightOverlay.Spawn

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/LightOverlay.java:132`

```java
public enum Spawn
```

## meteordevelopment.meteorclient.systems.modules.render.LogoutSpots

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/LogoutSpots.java:34`

```java
public class LogoutSpots extends Module
```

## meteordevelopment.meteorclient.systems.modules.render.LogoutSpots.LogoutSpots

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/LogoutSpots.java:104`

```java
public LogoutSpots()
```

## meteordevelopment.meteorclient.systems.modules.render.LogoutSpots.onActivate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/LogoutSpots.java:109`

```java
@Override public void onActivate()
```

## meteordevelopment.meteorclient.systems.modules.render.LogoutSpots.onDeactivate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/LogoutSpots.java:118`

```java
@Override public void onDeactivate()
```

## meteordevelopment.meteorclient.systems.modules.render.LogoutSpots.getInfoString

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/LogoutSpots.java:195`

```java
@Override public String getInfoString()
```

## meteordevelopment.meteorclient.systems.modules.render.Nametags

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/Nametags.java:53`

```java
public class Nametags extends Module
```

## meteordevelopment.meteorclient.systems.modules.render.Nametags.Nametags

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/Nametags.java:310`

```java
public Nametags()
```

## meteordevelopment.meteorclient.systems.modules.render.Nametags.getInfoString

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/Nametags.java:386`

```java
@Override public String getInfoString()
```

## meteordevelopment.meteorclient.systems.modules.render.Nametags.Position

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/Nametags.java:729`

```java
public enum Position
```

## meteordevelopment.meteorclient.systems.modules.render.Nametags.Durability

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/Nametags.java:734`

```java
public enum Durability
```

## meteordevelopment.meteorclient.systems.modules.render.Nametags.DistanceColorMode

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/Nametags.java:740`

```java
public enum DistanceColorMode
```

## meteordevelopment.meteorclient.systems.modules.render.Nametags.excludeBots

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/Nametags.java:745`

```java
public boolean excludeBots()
```

## meteordevelopment.meteorclient.systems.modules.render.Nametags.playerNametags

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/Nametags.java:749`

```java
public boolean playerNametags()
```

## meteordevelopment.meteorclient.systems.modules.render.NoRender

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/NoRender.java:27`

```java
public class NoRender extends Module
```

## meteordevelopment.meteorclient.systems.modules.render.NoRender.NoRender

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/NoRender.java:376`

```java
public NoRender()
```

## meteordevelopment.meteorclient.systems.modules.render.NoRender.onActivate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/NoRender.java:380`

```java
@Override public void onActivate()
```

## meteordevelopment.meteorclient.systems.modules.render.NoRender.onDeactivate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/NoRender.java:387`

```java
@Override public void onDeactivate()
```

## meteordevelopment.meteorclient.systems.modules.render.NoRender.noPortalOverlay

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/NoRender.java:396`

```java
public boolean noPortalOverlay()
```

## meteordevelopment.meteorclient.systems.modules.render.NoRender.noSpyglassOverlay

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/NoRender.java:400`

```java
public boolean noSpyglassOverlay()
```

## meteordevelopment.meteorclient.systems.modules.render.NoRender.noNausea

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/NoRender.java:404`

```java
public boolean noNausea()
```

## meteordevelopment.meteorclient.systems.modules.render.NoRender.noPumpkinOverlay

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/NoRender.java:408`

```java
public boolean noPumpkinOverlay()
```

## meteordevelopment.meteorclient.systems.modules.render.NoRender.noFireOverlay

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/NoRender.java:412`

```java
public boolean noFireOverlay()
```

## meteordevelopment.meteorclient.systems.modules.render.NoRender.noLiquidOverlay

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/NoRender.java:416`

```java
public boolean noLiquidOverlay()
```

## meteordevelopment.meteorclient.systems.modules.render.NoRender.noPowderedSnowOverlay

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/NoRender.java:420`

```java
public boolean noPowderedSnowOverlay()
```

## meteordevelopment.meteorclient.systems.modules.render.NoRender.noInWallOverlay

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/NoRender.java:424`

```java
public boolean noInWallOverlay()
```

## meteordevelopment.meteorclient.systems.modules.render.NoRender.noVignette

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/NoRender.java:428`

```java
public boolean noVignette()
```

## meteordevelopment.meteorclient.systems.modules.render.NoRender.noGuiBackground

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/NoRender.java:432`

```java
public boolean noGuiBackground()
```

## meteordevelopment.meteorclient.systems.modules.render.NoRender.noTotemAnimation

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/NoRender.java:436`

```java
public boolean noTotemAnimation()
```

## meteordevelopment.meteorclient.systems.modules.render.NoRender.noEatParticles

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/NoRender.java:440`

```java
public boolean noEatParticles()
```

## meteordevelopment.meteorclient.systems.modules.render.NoRender.noEnchantGlint

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/NoRender.java:444`

```java
public boolean noEnchantGlint()
```

## meteordevelopment.meteorclient.systems.modules.render.NoRender.noBossBar

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/NoRender.java:450`

```java
public boolean noBossBar()
```

## meteordevelopment.meteorclient.systems.modules.render.NoRender.noScoreboard

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/NoRender.java:454`

```java
public boolean noScoreboard()
```

## meteordevelopment.meteorclient.systems.modules.render.NoRender.noCrosshair

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/NoRender.java:458`

```java
public boolean noCrosshair()
```

## meteordevelopment.meteorclient.systems.modules.render.NoRender.noTitle

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/NoRender.java:462`

```java
public boolean noTitle()
```

## meteordevelopment.meteorclient.systems.modules.render.NoRender.noHeldItemName

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/NoRender.java:466`

```java
public boolean noHeldItemName()
```

## meteordevelopment.meteorclient.systems.modules.render.NoRender.noObfuscation

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/NoRender.java:470`

```java
public boolean noObfuscation()
```

## meteordevelopment.meteorclient.systems.modules.render.NoRender.noPotionIcons

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/NoRender.java:474`

```java
public boolean noPotionIcons()
```

## meteordevelopment.meteorclient.systems.modules.render.NoRender.noMessageSignatureIndicator

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/NoRender.java:478`

```java
public boolean noMessageSignatureIndicator()
```

## meteordevelopment.meteorclient.systems.modules.render.NoRender.noWeather

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/NoRender.java:484`

```java
public boolean noWeather()
```

## meteordevelopment.meteorclient.systems.modules.render.NoRender.noWorldBorder

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/NoRender.java:488`

```java
public boolean noWorldBorder()
```

## meteordevelopment.meteorclient.systems.modules.render.NoRender.noBlindness

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/NoRender.java:492`

```java
public boolean noBlindness()
```

## meteordevelopment.meteorclient.systems.modules.render.NoRender.noDarkness

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/NoRender.java:496`

```java
public boolean noDarkness()
```

## meteordevelopment.meteorclient.systems.modules.render.NoRender.noFog

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/NoRender.java:500`

```java
public boolean noFog()
```

## meteordevelopment.meteorclient.systems.modules.render.NoRender.noEnchTableBook

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/NoRender.java:504`

```java
public boolean noEnchTableBook()
```

## meteordevelopment.meteorclient.systems.modules.render.NoRender.noSignText

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/NoRender.java:508`

```java
public boolean noSignText()
```

## meteordevelopment.meteorclient.systems.modules.render.NoRender.noParticle

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/NoRender.java:512`

```java
public boolean noParticle(ParticleType<?> type)
```

## meteordevelopment.meteorclient.systems.modules.render.NoRender.noBlockBreakOverlay

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/NoRender.java:516`

```java
public boolean noBlockBreakOverlay()
```

## meteordevelopment.meteorclient.systems.modules.render.NoRender.noBeaconBeams

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/NoRender.java:520`

```java
public boolean noBeaconBeams()
```

## meteordevelopment.meteorclient.systems.modules.render.NoRender.noFallingBlocks

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/NoRender.java:524`

```java
public boolean noFallingBlocks()
```

## meteordevelopment.meteorclient.systems.modules.render.NoRender.noMapMarkers

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/NoRender.java:533`

```java
public boolean noMapMarkers()
```

## meteordevelopment.meteorclient.systems.modules.render.NoRender.noMapContents

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/NoRender.java:537`

```java
public boolean noMapContents()
```

## meteordevelopment.meteorclient.systems.modules.render.NoRender.getBannerRenderMode

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/NoRender.java:541`

```java
public BannerRenderMode getBannerRenderMode()
```

## meteordevelopment.meteorclient.systems.modules.render.NoRender.noFireworkExplosions

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/NoRender.java:546`

```java
public boolean noFireworkExplosions()
```

## meteordevelopment.meteorclient.systems.modules.render.NoRender.noBarrierInvis

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/NoRender.java:557`

```java
public boolean noBarrierInvis()
```

## meteordevelopment.meteorclient.systems.modules.render.NoRender.noTextureRotations

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/NoRender.java:561`

```java
public boolean noTextureRotations()
```

## meteordevelopment.meteorclient.systems.modules.render.NoRender.noEntity

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/NoRender.java:572`

```java
public boolean noEntity(Entity entity)
```

## meteordevelopment.meteorclient.systems.modules.render.NoRender.noEntity

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/NoRender.java:576`

```java
public boolean noEntity(EntityType<?> entity)
```

## meteordevelopment.meteorclient.systems.modules.render.NoRender.getDropSpawnPacket

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/NoRender.java:580`

```java
public boolean getDropSpawnPacket()
```

## meteordevelopment.meteorclient.systems.modules.render.NoRender.noArmor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/NoRender.java:584`

```java
public boolean noArmor()
```

## meteordevelopment.meteorclient.systems.modules.render.NoRender.noInvisibility

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/NoRender.java:588`

```java
public boolean noInvisibility()
```

## meteordevelopment.meteorclient.systems.modules.render.NoRender.noGlowing

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/NoRender.java:592`

```java
public boolean noGlowing()
```

## meteordevelopment.meteorclient.systems.modules.render.NoRender.noMobInSpawner

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/NoRender.java:596`

```java
public boolean noMobInSpawner()
```

## meteordevelopment.meteorclient.systems.modules.render.NoRender.noDeadEntities

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/NoRender.java:600`

```java
public boolean noDeadEntities()
```

## meteordevelopment.meteorclient.systems.modules.render.NoRender.noNametags

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/NoRender.java:604`

```java
public boolean noNametags()
```

## meteordevelopment.meteorclient.systems.modules.render.NoRender.BannerRenderMode

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/NoRender.java:608`

```java
public enum BannerRenderMode
```

## meteordevelopment.meteorclient.systems.modules.render.PopChams

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/PopChams.java:28`

```java
public class PopChams extends Module
```

## meteordevelopment.meteorclient.systems.modules.render.PopChams.PopChams

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/PopChams.java:93`

```java
public PopChams()
```

## meteordevelopment.meteorclient.systems.modules.render.PopChams.onDeactivate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/PopChams.java:97`

```java
@Override public void onDeactivate()
```

## meteordevelopment.meteorclient.systems.modules.render.StorageESP

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/StorageESP.java:43`

```java
public class StorageESP extends Module
```

## meteordevelopment.meteorclient.systems.modules.render.StorageESP.shapeMode

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/StorageESP.java:69`

```java
public final Setting<ShapeMode> shapeMode = sgGeneral.add(new EnumSetting.Builder<ShapeMode>() .name("shape-mode") .description("How the shapes are rendered.") .defaultValue(ShapeMode.Both) .build() )
```

## meteordevelopment.meteorclient.systems.modules.render.StorageESP.fillOpacity

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/StorageESP.java:76`

```java
public final Setting<Integer> fillOpacity = sgGeneral.add(new IntSetting.Builder() .name("fill-opacity") .description("The opacity of the shape fill.") .visible(() -> shapeMode.get() != ShapeMode.Lines) .defaultValue(50) .range(0, 255) .sliderMax(255) .build() )
```

## meteordevelopment.meteorclient.systems.modules.render.StorageESP.outlineWidth

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/StorageESP.java:86`

```java
public final Setting<Integer> outlineWidth = sgGeneral.add(new IntSetting.Builder() .name("width") .description("The width of the shader outline.") .visible(() -> mode.get() == Mode.Shader) .defaultValue(1) .range(1, 10) .sliderRange(1, 5) .build() )
```

## meteordevelopment.meteorclient.systems.modules.render.StorageESP.glowMultiplier

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/StorageESP.java:96`

```java
public final Setting<Double> glowMultiplier = sgGeneral.add(new DoubleSetting.Builder() .name("glow-multiplier") .description("Multiplier for glow effect") .visible(() -> mode.get() == Mode.Shader) .decimalPlaces(3) .defaultValue(3.5) .min(0) .sliderMax(10) .build() )
```

## meteordevelopment.meteorclient.systems.modules.render.StorageESP.StorageESP

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/StorageESP.java:181`

```java
public StorageESP()
```

## meteordevelopment.meteorclient.systems.modules.render.StorageESP.getWidget

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/StorageESP.java:211`

```java
@Override public WWidget getWidget(GuiTheme theme)
```

## meteordevelopment.meteorclient.systems.modules.render.StorageESP.getInfoString

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/StorageESP.java:351`

```java
@Override public String getInfoString()
```

## meteordevelopment.meteorclient.systems.modules.render.StorageESP.isShader

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/StorageESP.java:356`

```java
public boolean isShader()
```

## meteordevelopment.meteorclient.systems.modules.render.StorageESP.Mode

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/StorageESP.java:360`

```java
public enum Mode
```

## meteordevelopment.meteorclient.systems.modules.render.TimeChanger

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/TimeChanger.java:21`

```java
public class TimeChanger extends Module
```

## meteordevelopment.meteorclient.systems.modules.render.TimeChanger.TimeChanger

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/TimeChanger.java:34`

```java
public TimeChanger()
```

## meteordevelopment.meteorclient.systems.modules.render.TimeChanger.onActivate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/TimeChanger.java:38`

```java
@Override public void onActivate()
```

## meteordevelopment.meteorclient.systems.modules.render.TimeChanger.onDeactivate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/TimeChanger.java:43`

```java
@Override public void onDeactivate()
```

## meteordevelopment.meteorclient.systems.modules.render.Tracers

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/Tracers.java:37`

```java
public class Tracers extends Module
```

## meteordevelopment.meteorclient.systems.modules.render.Tracers.TracerStyle

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/Tracers.java:42`

```java
public enum TracerStyle
```

## meteordevelopment.meteorclient.systems.modules.render.Tracers.ignoreFriends

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/Tracers.java:63`

```java
public final Setting<Boolean> ignoreFriends = sgGeneral.add(new BoolSetting.Builder() .name("ignore-friends") .description("Doesn't draw tracers to friends.") .defaultValue(false) .build() )
```

## meteordevelopment.meteorclient.systems.modules.render.Tracers.showInvis

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/Tracers.java:70`

```java
public final Setting<Boolean> showInvis = sgGeneral.add(new BoolSetting.Builder() .name("show-invisible") .description("Shows invisible entities.") .defaultValue(true) .build() )
```

## meteordevelopment.meteorclient.systems.modules.render.Tracers.distance

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/Tracers.java:151`

```java
public final Setting<Boolean> distance = sgColors.add(new BoolSetting.Builder() .name("distance-colors") .description("Changes the color of tracers depending on distance.") .defaultValue(false) .build() )
```

## meteordevelopment.meteorclient.systems.modules.render.Tracers.friendOverride

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/Tracers.java:158`

```java
public final Setting<Boolean> friendOverride = sgColors.add(new BoolSetting.Builder() .name("show-friend-colors") .description("Whether or not to override the distance color of friends with the friend color.") .defaultValue(true) .visible(() -> distance.get() && !ignoreFriends.get()) .build() )
```

## meteordevelopment.meteorclient.systems.modules.render.Tracers.Tracers

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/Tracers.java:217`

```java
public Tracers()
```

## meteordevelopment.meteorclient.systems.modules.render.Tracers.onRender2D

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/Tracers.java:273`

```java
@EventHandler public void onRender2D(Render2DEvent event)
```

## meteordevelopment.meteorclient.systems.modules.render.Tracers.getInfoString

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/Tracers.java:377`

```java
@Override public String getInfoString()
```

## meteordevelopment.meteorclient.systems.modules.render.Trail

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/Trail.java:22`

```java
public class Trail extends Module
```

## meteordevelopment.meteorclient.systems.modules.render.Trail.Trail

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/Trail.java:39`

```java
public Trail()
```

## meteordevelopment.meteorclient.systems.modules.render.Trajectories

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/Trajectories.java:38`

```java
public class Trajectories extends Module
```

## meteordevelopment.meteorclient.systems.modules.render.Trajectories.simulationSteps

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/Trajectories.java:81`

```java
public final Setting<Integer> simulationSteps = sgGeneral.add(new IntSetting.Builder() .name("simulation-steps") .description("How many steps to simulate projectiles. Zero for no limit") .defaultValue(500) .sliderMax(5000) .build() )
```

## meteordevelopment.meteorclient.systems.modules.render.Trajectories.Trajectories

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/Trajectories.java:159`

```java
public Trajectories()
```

## meteordevelopment.meteorclient.systems.modules.render.TunnelESP

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/TunnelESP.java:37`

```java
public class TunnelESP extends Module
```

## meteordevelopment.meteorclient.systems.modules.render.TunnelESP.TunnelESP

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/TunnelESP.java:81`

```java
public TunnelESP()
```

## meteordevelopment.meteorclient.systems.modules.render.TunnelESP.onDeactivate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/TunnelESP.java:85`

```java
@Override public void onDeactivate()
```

## meteordevelopment.meteorclient.systems.modules.render.VoidESP

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/VoidESP.java:29`

```java
public class VoidESP extends Module
```

## meteordevelopment.meteorclient.systems.modules.render.VoidESP.VoidESP

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/VoidESP.java:97`

```java
public VoidESP()
```

## meteordevelopment.meteorclient.systems.modules.render.WallHack

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/WallHack.java:21`

```java
public class WallHack extends Module
```

## meteordevelopment.meteorclient.systems.modules.render.WallHack.opacity

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/WallHack.java:24`

```java
public final Setting<Integer> opacity = sgGeneral.add(new IntSetting.Builder() .name("opacity") .description("The opacity for rendered blocks.") .defaultValue(0) .range(0, 255) .sliderMax(255) .onChanged(_ -> { if (this.isActive()) { mc.levelExtractor.allChanged(); } }) .build() )
```

## meteordevelopment.meteorclient.systems.modules.render.WallHack.blocks

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/WallHack.java:38`

```java
public final Setting<List<Block>> blocks = sgGeneral.add(new BlockListSetting.Builder() .name("blocks") .description("What blocks should be targeted for Wall Hack.") .defaultValue() .onChanged(_ -> { if (isActive()) { mc.levelExtractor.allChanged(); } }) .build() )
```

## meteordevelopment.meteorclient.systems.modules.render.WallHack.occludeChunks

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/WallHack.java:50`

```java
public final Setting<Boolean> occludeChunks = sgGeneral.add(new BoolSetting.Builder() .name("occlude-chunks") .description("Whether caves should occlude underground (may look wonky when on).") .defaultValue(false) .build() )
```

## meteordevelopment.meteorclient.systems.modules.render.WallHack.WallHack

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/WallHack.java:57`

```java
public WallHack()
```

## meteordevelopment.meteorclient.systems.modules.render.WallHack.onActivate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/WallHack.java:61`

```java
@Override public void onActivate()
```

## meteordevelopment.meteorclient.systems.modules.render.WallHack.onDeactivate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/WallHack.java:66`

```java
@Override public void onDeactivate()
```

## meteordevelopment.meteorclient.systems.modules.render.WallHack.getWidget

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/WallHack.java:71`

```java
@Override public WWidget getWidget(GuiTheme theme)
```

## meteordevelopment.meteorclient.systems.modules.render.WaypointsModule

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/WaypointsModule.java:48`

```java
public class WaypointsModule extends Module
```

## meteordevelopment.meteorclient.systems.modules.render.WaypointsModule.textRenderDistance

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/WaypointsModule.java:55`

```java
public final Setting<Integer> textRenderDistance = sgGeneral.add(new IntSetting.Builder() .name("text-render-distance") .description("Maximum distance from the center of the screen at which text will be rendered.") .defaultValue(100) .min(0) .sliderMax(200) .build() )
```

## meteordevelopment.meteorclient.systems.modules.render.WaypointsModule.WaypointsModule

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/WaypointsModule.java:90`

```java
public WaypointsModule()
```

## meteordevelopment.meteorclient.systems.modules.render.WaypointsModule.addDeath

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/WaypointsModule.java:177`

```java
public void addDeath(Vec3 deathPos)
```

## meteordevelopment.meteorclient.systems.modules.render.WaypointsModule.getWidget

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/WaypointsModule.java:220`

```java
@Override public WWidget getWidget(GuiTheme theme)
```

## meteordevelopment.meteorclient.systems.modules.render.WeatherChanger

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/WeatherChanger.java:18`

```java
public class WeatherChanger extends Module
```

## meteordevelopment.meteorclient.systems.modules.render.WeatherChanger.WeatherChanger

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/WeatherChanger.java:40`

```java
public WeatherChanger()
```

## meteordevelopment.meteorclient.systems.modules.render.WeatherChanger.onActivate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/WeatherChanger.java:44`

```java
@Override public void onActivate()
```

## meteordevelopment.meteorclient.systems.modules.render.WeatherChanger.onDeactivate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/WeatherChanger.java:52`

```java
@Override public void onDeactivate()
```

## meteordevelopment.meteorclient.systems.modules.render.Xray

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/Xray.java:34`

```java
public class Xray extends Module
```

## meteordevelopment.meteorclient.systems.modules.render.Xray.ORES

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/Xray.java:37`

```java
public static final List<Block> ORES = List.of(Blocks.COAL_ORE, Blocks.DEEPSLATE_COAL_ORE, Blocks.IRON_ORE, Blocks.DEEPSLATE_IRON_ORE, Blocks.GOLD_ORE, Blocks.DEEPSLATE_GOLD_ORE, Blocks.LAPIS_ORE, Blocks.DEEPSLATE_LAPIS_ORE, Blocks.REDSTONE_ORE, Blocks.DEEPSLATE_REDSTONE_ORE, Blocks.DIAMOND_ORE, Blocks.DEEPSLATE_DIAMOND_ORE, Blocks.EMERALD_ORE, Blocks.DEEPSLATE_EMERALD_ORE, Blocks.COPPER_ORE, Blocks.DEEPSLATE_COPPER_ORE, Blocks.NETHER_GOLD_ORE, Blocks.NETHER_QUARTZ_ORE, Blocks.ANCIENT_DEBRIS)
```

## meteordevelopment.meteorclient.systems.modules.render.Xray.opacity

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/Xray.java:51`

```java
public final Setting<Integer> opacity = sgGeneral.add(new IntSetting.Builder() .name("opacity") .description("The opacity for all other blocks.") .defaultValue(25) .range(0, 255) .sliderMax(255) .onChanged(_ -> { if (isActive()) { mc.levelExtractor.allChanged(); } }) .build() )
```

## meteordevelopment.meteorclient.systems.modules.render.Xray.Xray

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/Xray.java:88`

```java
public Xray()
```

## meteordevelopment.meteorclient.systems.modules.render.Xray.onActivate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/Xray.java:92`

```java
@Override public void onActivate()
```

## meteordevelopment.meteorclient.systems.modules.render.Xray.onDeactivate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/Xray.java:97`

```java
@Override public void onDeactivate()
```

## meteordevelopment.meteorclient.systems.modules.render.Xray.getWidget

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/Xray.java:102`

```java
@Override public WWidget getWidget(GuiTheme theme)
```

## meteordevelopment.meteorclient.systems.modules.render.Xray.modifyDrawSide

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/Xray.java:126`

```java
public boolean modifyDrawSide(BlockState state, BlockGetter view, BlockPos pos, Direction facing, boolean returns)
```

## meteordevelopment.meteorclient.systems.modules.render.Xray.isBlocked

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/Xray.java:136`

```java
public boolean isBlocked(Block block, BlockPos blockPos)
```

## meteordevelopment.meteorclient.systems.modules.render.Xray.getAlpha

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/Xray.java:140`

```java
public static int getAlpha(BlockState state, BlockPos pos)
```

## meteordevelopment.meteorclient.systems.modules.render.Xray.getFluidAlpha

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/Xray.java:161`

```java
public static int getFluidAlpha(FluidState state, BlockPos pos)
```

## meteordevelopment.meteorclient.systems.modules.render.Xray.FluidOpacity

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/Xray.java:186`

```java
public enum FluidOpacity
```

## meteordevelopment.meteorclient.systems.modules.render.Zoom

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/Zoom.java:22`

```java
public class Zoom extends Module
```

## meteordevelopment.meteorclient.systems.modules.render.Zoom.Zoom

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/Zoom.java:76`

```java
public Zoom()
```

## meteordevelopment.meteorclient.systems.modules.render.Zoom.onActivate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/Zoom.java:81`

```java
@Override public void onActivate()
```

## meteordevelopment.meteorclient.systems.modules.render.Zoom.onStop

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/Zoom.java:94`

```java
public void onStop()
```

## meteordevelopment.meteorclient.systems.modules.render.Zoom.getScaling

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/Zoom.java:144`

```java
public double getScaling()
```

## meteordevelopment.meteorclient.systems.modules.render.Zoom.renderHands

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/Zoom.java:149`

```java
public boolean renderHands()
```

## meteordevelopment.meteorclient.systems.modules.render.Zoom.shouldHideHud

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/Zoom.java:153`

```java
public boolean shouldHideHud()
```

## meteordevelopment.meteorclient.systems.modules.render.blockesp.BlockESP

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/blockesp/BlockESP.java:36`

```java
public class BlockESP extends Module
```

## meteordevelopment.meteorclient.systems.modules.render.blockesp.BlockESP.BlockESP

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/blockesp/BlockESP.java:91`

```java
public BlockESP()
```

## meteordevelopment.meteorclient.systems.modules.render.blockesp.BlockESP.onActivate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/blockesp/BlockESP.java:97`

```java
@Override public void onActivate()
```

## meteordevelopment.meteorclient.systems.modules.render.blockesp.BlockESP.onDeactivate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/blockesp/BlockESP.java:111`

```java
@Override public void onDeactivate()
```

## meteordevelopment.meteorclient.systems.modules.render.blockesp.BlockESP.getBlock

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/blockesp/BlockESP.java:141`

```java
public ESPBlock getBlock(int x, int y, int z)
```

## meteordevelopment.meteorclient.systems.modules.render.blockesp.BlockESP.newGroup

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/blockesp/BlockESP.java:146`

```java
public ESPGroup newGroup(Block block)
```

## meteordevelopment.meteorclient.systems.modules.render.blockesp.BlockESP.removeGroup

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/blockesp/BlockESP.java:154`

```java
public void removeGroup(ESPGroup group)
```

## meteordevelopment.meteorclient.systems.modules.render.blockesp.BlockESP.getInfoString

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/blockesp/BlockESP.java:265`

```java
@Override public String getInfoString()
```

## meteordevelopment.meteorclient.systems.modules.render.blockesp.ESPBlock

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/blockesp/ESPBlock.java:20`

```java
public class ESPBlock
```

## meteordevelopment.meteorclient.systems.modules.render.blockesp.ESPBlock.FO

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/blockesp/ESPBlock.java:25`

```java
public static final int FO = 1 << 1
```

## meteordevelopment.meteorclient.systems.modules.render.blockesp.ESPBlock.FO_RI

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/blockesp/ESPBlock.java:26`

```java
public static final int FO_RI = 1 << 2
```

## meteordevelopment.meteorclient.systems.modules.render.blockesp.ESPBlock.RI

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/blockesp/ESPBlock.java:27`

```java
public static final int RI = 1 << 3
```

## meteordevelopment.meteorclient.systems.modules.render.blockesp.ESPBlock.BA_RI

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/blockesp/ESPBlock.java:28`

```java
public static final int BA_RI = 1 << 4
```

## meteordevelopment.meteorclient.systems.modules.render.blockesp.ESPBlock.BA

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/blockesp/ESPBlock.java:29`

```java
public static final int BA = 1 << 5
```

## meteordevelopment.meteorclient.systems.modules.render.blockesp.ESPBlock.BA_LE

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/blockesp/ESPBlock.java:30`

```java
public static final int BA_LE = 1 << 6
```

## meteordevelopment.meteorclient.systems.modules.render.blockesp.ESPBlock.LE

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/blockesp/ESPBlock.java:31`

```java
public static final int LE = 1 << 7
```

## meteordevelopment.meteorclient.systems.modules.render.blockesp.ESPBlock.FO_LE

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/blockesp/ESPBlock.java:32`

```java
public static final int FO_LE = 1 << 8
```

## meteordevelopment.meteorclient.systems.modules.render.blockesp.ESPBlock.TO

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/blockesp/ESPBlock.java:34`

```java
public static final int TO = 1 << 9
```

## meteordevelopment.meteorclient.systems.modules.render.blockesp.ESPBlock.TO_FO

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/blockesp/ESPBlock.java:35`

```java
public static final int TO_FO = 1 << 10
```

## meteordevelopment.meteorclient.systems.modules.render.blockesp.ESPBlock.TO_BA

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/blockesp/ESPBlock.java:36`

```java
public static final int TO_BA = 1 << 11
```

## meteordevelopment.meteorclient.systems.modules.render.blockesp.ESPBlock.TO_RI

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/blockesp/ESPBlock.java:37`

```java
public static final int TO_RI = 1 << 12
```

## meteordevelopment.meteorclient.systems.modules.render.blockesp.ESPBlock.TO_LE

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/blockesp/ESPBlock.java:38`

```java
public static final int TO_LE = 1 << 13
```

## meteordevelopment.meteorclient.systems.modules.render.blockesp.ESPBlock.BO

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/blockesp/ESPBlock.java:39`

```java
public static final int BO = 1 << 14
```

## meteordevelopment.meteorclient.systems.modules.render.blockesp.ESPBlock.BO_FO

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/blockesp/ESPBlock.java:40`

```java
public static final int BO_FO = 1 << 15
```

## meteordevelopment.meteorclient.systems.modules.render.blockesp.ESPBlock.BO_BA

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/blockesp/ESPBlock.java:41`

```java
public static final int BO_BA = 1 << 16
```

## meteordevelopment.meteorclient.systems.modules.render.blockesp.ESPBlock.BO_RI

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/blockesp/ESPBlock.java:42`

```java
public static final int BO_RI = 1 << 17
```

## meteordevelopment.meteorclient.systems.modules.render.blockesp.ESPBlock.BO_LE

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/blockesp/ESPBlock.java:43`

```java
public static final int BO_LE = 1 << 18
```

## meteordevelopment.meteorclient.systems.modules.render.blockesp.ESPBlock.SIDES

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/blockesp/ESPBlock.java:45`

```java
public static final int[] SIDES = {FO, BA, LE, RI, TO, BO}
```

## meteordevelopment.meteorclient.systems.modules.render.blockesp.ESPBlock.x

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/blockesp/ESPBlock.java:47`

```java
public final int x, y, z
```

## meteordevelopment.meteorclient.systems.modules.render.blockesp.ESPBlock.y

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/blockesp/ESPBlock.java:47`

```java
public final int x, y, z
```

## meteordevelopment.meteorclient.systems.modules.render.blockesp.ESPBlock.z

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/blockesp/ESPBlock.java:47`

```java
public final int x, y, z
```

## meteordevelopment.meteorclient.systems.modules.render.blockesp.ESPBlock.neighbours

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/blockesp/ESPBlock.java:49`

```java
public int neighbours
```

## meteordevelopment.meteorclient.systems.modules.render.blockesp.ESPBlock.group

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/blockesp/ESPBlock.java:51`

```java
public ESPGroup group
```

## meteordevelopment.meteorclient.systems.modules.render.blockesp.ESPBlock.loaded

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/blockesp/ESPBlock.java:53`

```java
public boolean loaded = true
```

## meteordevelopment.meteorclient.systems.modules.render.blockesp.ESPBlock.ESPBlock

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/blockesp/ESPBlock.java:55`

```java
public ESPBlock(int x, int y, int z)
```

## meteordevelopment.meteorclient.systems.modules.render.blockesp.ESPBlock.getSideBlock

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/blockesp/ESPBlock.java:61`

```java
public ESPBlock getSideBlock(int side)
```

## meteordevelopment.meteorclient.systems.modules.render.blockesp.ESPBlock.update

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/blockesp/ESPBlock.java:96`

```java
public void update()
```

## meteordevelopment.meteorclient.systems.modules.render.blockesp.ESPBlock.render

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/blockesp/ESPBlock.java:170`

```java
public void render(Render3DEvent event)
```

## meteordevelopment.meteorclient.systems.modules.render.blockesp.ESPBlock.getKey

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/blockesp/ESPBlock.java:283`

```java
public static long getKey(int x, int y, int z)
```

## meteordevelopment.meteorclient.systems.modules.render.blockesp.ESPBlock.getKey

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/blockesp/ESPBlock.java:287`

```java
public static long getKey(BlockPos blockPos)
```

## meteordevelopment.meteorclient.systems.modules.render.blockesp.ESPBlockData

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/blockesp/ESPBlockData.java:20`

```java
public class ESPBlockData implements IGeneric<ESPBlockData>, IChangeable, IBlockData<ESPBlockData>
```

## meteordevelopment.meteorclient.systems.modules.render.blockesp.ESPBlockData.shapeMode

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/blockesp/ESPBlockData.java:21`

```java
public ShapeMode shapeMode
```

## meteordevelopment.meteorclient.systems.modules.render.blockesp.ESPBlockData.lineColor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/blockesp/ESPBlockData.java:22`

```java
public SettingColor lineColor
```

## meteordevelopment.meteorclient.systems.modules.render.blockesp.ESPBlockData.sideColor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/blockesp/ESPBlockData.java:23`

```java
public SettingColor sideColor
```

## meteordevelopment.meteorclient.systems.modules.render.blockesp.ESPBlockData.tracer

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/blockesp/ESPBlockData.java:25`

```java
public boolean tracer
```

## meteordevelopment.meteorclient.systems.modules.render.blockesp.ESPBlockData.tracerColor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/blockesp/ESPBlockData.java:26`

```java
public SettingColor tracerColor
```

## meteordevelopment.meteorclient.systems.modules.render.blockesp.ESPBlockData.ESPBlockData

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/blockesp/ESPBlockData.java:30`

```java
public ESPBlockData(ShapeMode shapeMode, SettingColor lineColor, SettingColor sideColor, boolean tracer, SettingColor tracerColor)
```

## meteordevelopment.meteorclient.systems.modules.render.blockesp.ESPBlockData.createScreen

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/blockesp/ESPBlockData.java:39`

```java
@Override public WidgetScreen createScreen(GuiTheme theme, Block block, BlockDataSetting<ESPBlockData> setting)
```

## meteordevelopment.meteorclient.systems.modules.render.blockesp.ESPBlockData.createScreen

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/blockesp/ESPBlockData.java:44`

```java
@Override public WidgetScreen createScreen(GuiTheme theme, GenericSetting<ESPBlockData> setting)
```

## meteordevelopment.meteorclient.systems.modules.render.blockesp.ESPBlockData.isChanged

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/blockesp/ESPBlockData.java:49`

```java
@Override public boolean isChanged()
```

## meteordevelopment.meteorclient.systems.modules.render.blockesp.ESPBlockData.changed

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/blockesp/ESPBlockData.java:54`

```java
public void changed()
```

## meteordevelopment.meteorclient.systems.modules.render.blockesp.ESPBlockData.tickRainbow

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/blockesp/ESPBlockData.java:58`

```java
public void tickRainbow()
```

## meteordevelopment.meteorclient.systems.modules.render.blockesp.ESPBlockData.set

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/blockesp/ESPBlockData.java:64`

```java
@Override public ESPBlockData set(ESPBlockData value)
```

## meteordevelopment.meteorclient.systems.modules.render.blockesp.ESPBlockData.copy

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/blockesp/ESPBlockData.java:78`

```java
@Override public ESPBlockData copy()
```

## meteordevelopment.meteorclient.systems.modules.render.blockesp.ESPBlockData.toTag

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/blockesp/ESPBlockData.java:83`

```java
@Override public CompoundTag toTag()
```

## meteordevelopment.meteorclient.systems.modules.render.blockesp.ESPBlockData.fromTag

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/blockesp/ESPBlockData.java:99`

```java
@Override public ESPBlockData fromTag(CompoundTag tag)
```

## meteordevelopment.meteorclient.systems.modules.render.blockesp.ESPBlockDataScreen

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/blockesp/ESPBlockDataScreen.java:16`

```java
public class ESPBlockDataScreen extends WindowScreen
```

## meteordevelopment.meteorclient.systems.modules.render.blockesp.ESPBlockDataScreen.ESPBlockDataScreen

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/blockesp/ESPBlockDataScreen.java:21`

```java
public ESPBlockDataScreen(GuiTheme theme, ESPBlockData blockData, Block block, BlockDataSetting<ESPBlockData> setting)
```

## meteordevelopment.meteorclient.systems.modules.render.blockesp.ESPBlockDataScreen.ESPBlockDataScreen

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/blockesp/ESPBlockDataScreen.java:25`

```java
public ESPBlockDataScreen(GuiTheme theme, ESPBlockData blockData, GenericSetting<ESPBlockData> setting)
```

## meteordevelopment.meteorclient.systems.modules.render.blockesp.ESPBlockDataScreen.initWidgets

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/blockesp/ESPBlockDataScreen.java:37`

```java
@Override public void initWidgets()
```

## meteordevelopment.meteorclient.systems.modules.render.blockesp.ESPChunk

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/blockesp/ESPChunk.java:23`

```java
public class ESPChunk
```

## meteordevelopment.meteorclient.systems.modules.render.blockesp.ESPChunk.blocks

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/blockesp/ESPChunk.java:26`

```java
public Long2ObjectMap<ESPBlock> blocks
```

## meteordevelopment.meteorclient.systems.modules.render.blockesp.ESPChunk.ESPChunk

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/blockesp/ESPChunk.java:28`

```java
public ESPChunk(int x, int z)
```

## meteordevelopment.meteorclient.systems.modules.render.blockesp.ESPChunk.get

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/blockesp/ESPChunk.java:33`

```java
public ESPBlock get(int x, int y, int z)
```

## meteordevelopment.meteorclient.systems.modules.render.blockesp.ESPChunk.add

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/blockesp/ESPChunk.java:37`

```java
public void add(BlockPos blockPos, boolean update)
```

## meteordevelopment.meteorclient.systems.modules.render.blockesp.ESPChunk.add

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/blockesp/ESPChunk.java:46`

```java
public void add(BlockPos blockPos)
```

## meteordevelopment.meteorclient.systems.modules.render.blockesp.ESPChunk.remove

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/blockesp/ESPChunk.java:50`

```java
public void remove(BlockPos blockPos)
```

## meteordevelopment.meteorclient.systems.modules.render.blockesp.ESPChunk.update

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/blockesp/ESPChunk.java:57`

```java
public void update()
```

## meteordevelopment.meteorclient.systems.modules.render.blockesp.ESPChunk.update

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/blockesp/ESPChunk.java:63`

```java
public void update(int x, int y, int z)
```

## meteordevelopment.meteorclient.systems.modules.render.blockesp.ESPChunk.size

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/blockesp/ESPChunk.java:70`

```java
public int size()
```

## meteordevelopment.meteorclient.systems.modules.render.blockesp.ESPChunk.shouldBeDeleted

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/blockesp/ESPChunk.java:74`

```java
public boolean shouldBeDeleted()
```

## meteordevelopment.meteorclient.systems.modules.render.blockesp.ESPChunk.render

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/blockesp/ESPChunk.java:82`

```java
public void render(Render3DEvent event)
```

## meteordevelopment.meteorclient.systems.modules.render.blockesp.ESPChunk.searchChunk

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/blockesp/ESPChunk.java:89`

```java
public static ESPChunk searchChunk(ChunkAccess chunk, List<Block> blocks)
```

## meteordevelopment.meteorclient.systems.modules.render.blockesp.ESPGroup

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/blockesp/ESPGroup.java:19`

```java
public class ESPGroup
```

## meteordevelopment.meteorclient.systems.modules.render.blockesp.ESPGroup.blocks

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/blockesp/ESPGroup.java:24`

```java
public final UnorderedArrayList<ESPBlock> blocks = new UnorderedArrayList<>()
```

## meteordevelopment.meteorclient.systems.modules.render.blockesp.ESPGroup.ESPGroup

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/blockesp/ESPGroup.java:28`

```java
public ESPGroup(Block block)
```

## meteordevelopment.meteorclient.systems.modules.render.blockesp.ESPGroup.add

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/blockesp/ESPGroup.java:32`

```java
public void add(ESPBlock block, boolean removeFromOld, boolean splitGroup)
```

## meteordevelopment.meteorclient.systems.modules.render.blockesp.ESPGroup.add

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/blockesp/ESPGroup.java:42`

```java
public void add(ESPBlock block)
```

## meteordevelopment.meteorclient.systems.modules.render.blockesp.ESPGroup.remove

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/blockesp/ESPGroup.java:46`

```java
public void remove(ESPBlock block, boolean splitGroup)
```

## meteordevelopment.meteorclient.systems.modules.render.blockesp.ESPGroup.remove

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/blockesp/ESPGroup.java:58`

```java
public void remove(ESPBlock block)
```

## meteordevelopment.meteorclient.systems.modules.render.blockesp.ESPGroup.merge

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/blockesp/ESPGroup.java:136`

```java
public void merge(ESPGroup group)
```

## meteordevelopment.meteorclient.systems.modules.render.blockesp.ESPGroup.render

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/blockesp/ESPGroup.java:142`

```java
public void render(Render3DEvent event)
```

## meteordevelopment.meteorclient.systems.modules.render.marker.BaseMarker

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/marker/BaseMarker.java:19`

```java
public abstract class BaseMarker implements ISerializable<BaseMarker>
```

## meteordevelopment.meteorclient.systems.modules.render.marker.BaseMarker.settings

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/marker/BaseMarker.java:20`

```java
public final Settings settings = new Settings()
```

## meteordevelopment.meteorclient.systems.modules.render.marker.BaseMarker.sgBase

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/marker/BaseMarker.java:22`

```java
protected final SettingGroup sgBase = settings.createGroup("Base")
```

## meteordevelopment.meteorclient.systems.modules.render.marker.BaseMarker.name

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/marker/BaseMarker.java:24`

```java
public final Setting<String> name = sgBase.add(new StringSetting.Builder() .name("name") .description("Custom name for this marker.") .build() )
```

## meteordevelopment.meteorclient.systems.modules.render.marker.BaseMarker.description

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/marker/BaseMarker.java:30`

```java
protected final Setting<String> description = sgBase.add(new StringSetting.Builder() .name("description") .description("Custom description for this marker.") .build() )
```

## meteordevelopment.meteorclient.systems.modules.render.marker.BaseMarker.BaseMarker

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/marker/BaseMarker.java:50`

```java
public BaseMarker(String name)
```

## meteordevelopment.meteorclient.systems.modules.render.marker.BaseMarker.render

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/marker/BaseMarker.java:56`

```java
protected void render(Render3DEvent event)
```

## meteordevelopment.meteorclient.systems.modules.render.marker.BaseMarker.tick

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/marker/BaseMarker.java:59`

```java
protected void tick()
```

## meteordevelopment.meteorclient.systems.modules.render.marker.BaseMarker.getScreen

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/marker/BaseMarker.java:62`

```java
public Screen getScreen(GuiTheme theme)
```

## meteordevelopment.meteorclient.systems.modules.render.marker.BaseMarker.getWidget

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/marker/BaseMarker.java:66`

```java
public WWidget getWidget(GuiTheme theme)
```

## meteordevelopment.meteorclient.systems.modules.render.marker.BaseMarker.getName

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/marker/BaseMarker.java:70`

```java
public String getName()
```

## meteordevelopment.meteorclient.systems.modules.render.marker.BaseMarker.getTypeName

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/marker/BaseMarker.java:74`

```java
public String getTypeName()
```

## meteordevelopment.meteorclient.systems.modules.render.marker.BaseMarker.isActive

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/marker/BaseMarker.java:78`

```java
public boolean isActive()
```

## meteordevelopment.meteorclient.systems.modules.render.marker.BaseMarker.isVisible

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/marker/BaseMarker.java:82`

```java
public boolean isVisible()
```

## meteordevelopment.meteorclient.systems.modules.render.marker.BaseMarker.getDimension

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/marker/BaseMarker.java:86`

```java
public Dimension getDimension()
```

## meteordevelopment.meteorclient.systems.modules.render.marker.BaseMarker.toggle

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/marker/BaseMarker.java:90`

```java
public void toggle()
```

## meteordevelopment.meteorclient.systems.modules.render.marker.BaseMarker.toTag

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/marker/BaseMarker.java:94`

```java
@Override public CompoundTag toTag()
```

## meteordevelopment.meteorclient.systems.modules.render.marker.BaseMarker.fromTag

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/marker/BaseMarker.java:101`

```java
@Override public BaseMarker fromTag(CompoundTag tag)
```

## meteordevelopment.meteorclient.systems.modules.render.marker.CuboidMarker

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/marker/CuboidMarker.java:15`

```java
public class CuboidMarker extends BaseMarker
```

## meteordevelopment.meteorclient.systems.modules.render.marker.CuboidMarker.type

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/marker/CuboidMarker.java:16`

```java
public static final String type = "Cuboid"
```

## meteordevelopment.meteorclient.systems.modules.render.marker.CuboidMarker.Mode

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/marker/CuboidMarker.java:18`

```java
public enum Mode
```

## meteordevelopment.meteorclient.systems.modules.render.marker.CuboidMarker.CuboidMarker

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/marker/CuboidMarker.java:69`

```java
public CuboidMarker()
```

## meteordevelopment.meteorclient.systems.modules.render.marker.CuboidMarker.getTypeName

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/marker/CuboidMarker.java:73`

```java
@Override public String getTypeName()
```

## meteordevelopment.meteorclient.systems.modules.render.marker.CuboidMarker.render

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/marker/CuboidMarker.java:78`

```java
@Override protected void render(Render3DEvent event)
```

## meteordevelopment.meteorclient.systems.modules.render.marker.Marker

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/marker/Marker.java:29`

```java
public class Marker extends Module
```

## meteordevelopment.meteorclient.systems.modules.render.marker.Marker.Marker

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/marker/Marker.java:33`

```java
public Marker()
```

## meteordevelopment.meteorclient.systems.modules.render.marker.Marker.toTag

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/marker/Marker.java:51`

```java
@Override public CompoundTag toTag()
```

## meteordevelopment.meteorclient.systems.modules.render.marker.Marker.fromTag

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/marker/Marker.java:68`

```java
@Override public Module fromTag(CompoundTag tag)
```

## meteordevelopment.meteorclient.systems.modules.render.marker.Marker.getWidget

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/marker/Marker.java:92`

```java
@Override public WWidget getWidget(GuiTheme theme)
```

## meteordevelopment.meteorclient.systems.modules.render.marker.Marker.fillList

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/marker/Marker.java:99`

```java
protected void fillList(GuiTheme theme, WVerticalList list)
```

## meteordevelopment.meteorclient.systems.modules.render.marker.MarkerFactory

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/marker/MarkerFactory.java:13`

```java
public class MarkerFactory
```

## meteordevelopment.meteorclient.systems.modules.render.marker.MarkerFactory.MarkerFactory

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/marker/MarkerFactory.java:21`

```java
public MarkerFactory()
```

## meteordevelopment.meteorclient.systems.modules.render.marker.MarkerFactory.getNames

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/marker/MarkerFactory.java:31`

```java
public String[] getNames()
```

## meteordevelopment.meteorclient.systems.modules.render.marker.MarkerFactory.createMarker

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/marker/MarkerFactory.java:35`

```java
public BaseMarker createMarker(String name)
```

## meteordevelopment.meteorclient.systems.modules.render.marker.Sphere2dMarker

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/marker/Sphere2dMarker.java:21`

```java
public class Sphere2dMarker extends BaseMarker
```

## meteordevelopment.meteorclient.systems.modules.render.marker.Sphere2dMarker.type

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/marker/Sphere2dMarker.java:33`

```java
public static final String type = "Sphere-2D"
```

## meteordevelopment.meteorclient.systems.modules.render.marker.Sphere2dMarker.Sphere2dMarker

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/marker/Sphere2dMarker.java:131`

```java
public Sphere2dMarker()
```

## meteordevelopment.meteorclient.systems.modules.render.marker.Sphere2dMarker.render

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/marker/Sphere2dMarker.java:135`

```java
@Override protected void render(Render3DEvent event)
```

## meteordevelopment.meteorclient.systems.modules.render.marker.Sphere2dMarker.getTypeName

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/marker/Sphere2dMarker.java:148`

```java
@Override public String getTypeName()
```

## meteordevelopment.meteorclient.systems.modules.world.Ambience

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/Ambience.java:20`

```java
public class Ambience extends Module
```

## meteordevelopment.meteorclient.systems.modules.world.Ambience.endSky

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/Ambience.java:26`

```java
public final Setting<Boolean> endSky = sgSky.add(new BoolSetting.Builder() .name("end-sky") .description("Makes the sky like the end.") .defaultValue(false) .build() )
```

## meteordevelopment.meteorclient.systems.modules.world.Ambience.customSkyColor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/Ambience.java:33`

```java
public final Setting<Boolean> customSkyColor = sgSky.add(new BoolSetting.Builder() .name("custom-sky-color") .description("Whether the sky color should be changed.") .defaultValue(false) .build() )
```

## meteordevelopment.meteorclient.systems.modules.world.Ambience.overworldSkyColor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/Ambience.java:40`

```java
public final Setting<SettingColor> overworldSkyColor = sgSky.add(new ColorSetting.Builder() .name("overworld-sky-color") .description("The color of the overworld sky.") .defaultValue(new SettingColor(0, 125, 255)) .visible(customSkyColor::get) .build() )
```

## meteordevelopment.meteorclient.systems.modules.world.Ambience.netherSkyColor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/Ambience.java:48`

```java
public final Setting<SettingColor> netherSkyColor = sgSky.add(new ColorSetting.Builder() .name("nether-sky-color") .description("The color of the nether sky.") .defaultValue(new SettingColor(102, 0, 0)) .visible(customSkyColor::get) .build() )
```

## meteordevelopment.meteorclient.systems.modules.world.Ambience.endSkyColor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/Ambience.java:56`

```java
public final Setting<SettingColor> endSkyColor = sgSky.add(new ColorSetting.Builder() .name("end-sky-color") .description("The color of the end sky.") .defaultValue(new SettingColor(65, 30, 90)) .visible(customSkyColor::get) .build() )
```

## meteordevelopment.meteorclient.systems.modules.world.Ambience.customCloudColor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/Ambience.java:64`

```java
public final Setting<Boolean> customCloudColor = sgSky.add(new BoolSetting.Builder() .name("custom-cloud-color") .description("Whether the clouds color should be changed.") .defaultValue(false) .build() )
```

## meteordevelopment.meteorclient.systems.modules.world.Ambience.cloudColor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/Ambience.java:71`

```java
public final Setting<SettingColor> cloudColor = sgSky.add(new ColorSetting.Builder() .name("cloud-color") .description("The color of the clouds.") .defaultValue(new SettingColor(102, 0, 0)) .visible(customCloudColor::get) .build() )
```

## meteordevelopment.meteorclient.systems.modules.world.Ambience.changeLightningColor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/Ambience.java:79`

```java
public final Setting<Boolean> changeLightningColor = sgSky.add(new BoolSetting.Builder() .name("custom-lightning-color") .description("Whether the lightning color should be changed.") .defaultValue(false) .build() )
```

## meteordevelopment.meteorclient.systems.modules.world.Ambience.lightningColor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/Ambience.java:86`

```java
public final Setting<SettingColor> lightningColor = sgSky.add(new ColorSetting.Builder() .name("lightning-color") .description("The color of the lightning.") .defaultValue(new SettingColor(102, 0, 0)) .visible(changeLightningColor::get) .build() )
```

## meteordevelopment.meteorclient.systems.modules.world.Ambience.customGrassColor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/Ambience.java:95`

```java
public final Setting<Boolean> customGrassColor = sgWorld.add(new BoolSetting.Builder() .name("custom-grass-color") .description("Whether the grass color should be changed.") .defaultValue(false) .onChanged(_ -> reload()) .build() )
```

## meteordevelopment.meteorclient.systems.modules.world.Ambience.grassColor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/Ambience.java:103`

```java
public final Setting<SettingColor> grassColor = sgWorld.add(new ColorSetting.Builder() .name("grass-color") .description("The color of the grass.") .defaultValue(new SettingColor(102, 0, 0)) .visible(customGrassColor::get) .onChanged(_ -> reload()) .build() )
```

## meteordevelopment.meteorclient.systems.modules.world.Ambience.customFoliageColor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/Ambience.java:112`

```java
public final Setting<Boolean> customFoliageColor = sgWorld.add(new BoolSetting.Builder() .name("custom-foliage-color") .description("Whether the foliage color should be changed.") .defaultValue(false) .onChanged(_ -> reload()) .build() )
```

## meteordevelopment.meteorclient.systems.modules.world.Ambience.foliageColor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/Ambience.java:120`

```java
public final Setting<SettingColor> foliageColor = sgWorld.add(new ColorSetting.Builder() .name("foliage-color") .description("The color of the foliage.") .defaultValue(new SettingColor(102, 0, 0)) .visible(customFoliageColor::get) .onChanged(_ -> reload()) .build() )
```

## meteordevelopment.meteorclient.systems.modules.world.Ambience.customWaterColor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/Ambience.java:129`

```java
public final Setting<Boolean> customWaterColor = sgWorld.add(new BoolSetting.Builder() .name("custom-water-color") .description("Whether the water color should be changed.") .defaultValue(false) .onChanged(_ -> reload()) .build() )
```

## meteordevelopment.meteorclient.systems.modules.world.Ambience.waterColor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/Ambience.java:137`

```java
public final Setting<SettingColor> waterColor = sgWorld.add(new ColorSetting.Builder() .name("water-color") .description("The color of the water.") .defaultValue(new SettingColor(102, 0, 0)) .visible(customWaterColor::get) .onChanged(_ -> reload()) .build() )
```

## meteordevelopment.meteorclient.systems.modules.world.Ambience.customLavaColor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/Ambience.java:146`

```java
public final Setting<Boolean> customLavaColor = sgWorld.add(new BoolSetting.Builder() .name("custom-lava-color") .description("Whether the lava color should be changed.") .defaultValue(false) .onChanged(_ -> reload()) .build() )
```

## meteordevelopment.meteorclient.systems.modules.world.Ambience.lavaColor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/Ambience.java:154`

```java
public final Setting<SettingColor> lavaColor = sgWorld.add(new ColorSetting.Builder() .name("lava-color") .description("The color of the lava.") .defaultValue(new SettingColor(102, 0, 0)) .visible(customLavaColor::get) .onChanged(_ -> reload()) .build() )
```

## meteordevelopment.meteorclient.systems.modules.world.Ambience.customFogColor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/Ambience.java:163`

```java
public final Setting<Boolean> customFogColor = sgWorld.add(new BoolSetting.Builder() .name("custom-fog-color") .description("Whether the fog color should be changed.") .defaultValue(false) .build() )
```

## meteordevelopment.meteorclient.systems.modules.world.Ambience.fogColor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/Ambience.java:170`

```java
public final Setting<SettingColor> fogColor = sgWorld.add(new ColorSetting.Builder() .name("fog-color") .description("The color of the fog.") .defaultValue(new SettingColor(102, 0, 0)) .visible(customFogColor::get) .build() )
```

## meteordevelopment.meteorclient.systems.modules.world.Ambience.Ambience

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/Ambience.java:178`

```java
public Ambience()
```

## meteordevelopment.meteorclient.systems.modules.world.Ambience.onActivate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/Ambience.java:182`

```java
@Override public void onActivate()
```

## meteordevelopment.meteorclient.systems.modules.world.Ambience.onDeactivate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/Ambience.java:187`

```java
@Override public void onDeactivate()
```

## meteordevelopment.meteorclient.systems.modules.world.Ambience.skyColor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/Ambience.java:198`

```java
public SettingColor skyColor()
```

## meteordevelopment.meteorclient.systems.modules.world.AutoBreed

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/AutoBreed.java:26`

```java
public class AutoBreed extends Module
```

## meteordevelopment.meteorclient.systems.modules.world.AutoBreed.AutoBreed

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/AutoBreed.java:82`

```java
public AutoBreed()
```

## meteordevelopment.meteorclient.systems.modules.world.AutoBreed.onActivate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/AutoBreed.java:86`

```java
@Override public void onActivate()
```

## meteordevelopment.meteorclient.systems.modules.world.AutoBrewer

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/AutoBrewer.java:23`

```java
public class AutoBrewer extends Module
```

## meteordevelopment.meteorclient.systems.modules.world.AutoBrewer.AutoBrewer

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/AutoBrewer.java:37`

```java
public AutoBrewer()
```

## meteordevelopment.meteorclient.systems.modules.world.AutoBrewer.onActivate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/AutoBrewer.java:41`

```java
@Override public void onActivate()
```

## meteordevelopment.meteorclient.systems.modules.world.AutoBrewer.onBrewingStandClose

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/AutoBrewer.java:46`

```java
public void onBrewingStandClose()
```

## meteordevelopment.meteorclient.systems.modules.world.AutoBrewer.tick

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/AutoBrewer.java:50`

```java
public void tick(BrewingStandMenu c)
```

## meteordevelopment.meteorclient.systems.modules.world.AutoMount

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/AutoMount.java:35`

```java
public class AutoMount extends Module
```

## meteordevelopment.meteorclient.systems.modules.world.AutoMount.AutoMount

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/AutoMount.java:59`

```java
public AutoMount()
```

## meteordevelopment.meteorclient.systems.modules.world.AutoNametag

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/AutoNametag.java:30`

```java
public class AutoNametag extends Module
```

## meteordevelopment.meteorclient.systems.modules.world.AutoNametag.AutoNametag

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/AutoNametag.java:74`

```java
public AutoNametag()
```

## meteordevelopment.meteorclient.systems.modules.world.AutoNametag.onDeactivate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/AutoNametag.java:78`

```java
@Override public void onDeactivate()
```

## meteordevelopment.meteorclient.systems.modules.world.AutoShearer

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/AutoShearer.java:26`

```java
public class AutoShearer extends Module
```

## meteordevelopment.meteorclient.systems.modules.world.AutoShearer.AutoShearer

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/AutoShearer.java:54`

```java
public AutoShearer()
```

## meteordevelopment.meteorclient.systems.modules.world.AutoShearer.onDeactivate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/AutoShearer.java:58`

```java
@Override public void onDeactivate()
```

## meteordevelopment.meteorclient.systems.modules.world.AutoSign

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/AutoSign.java:27`

```java
public class AutoSign extends Module
```

## meteordevelopment.meteorclient.systems.modules.world.AutoSign.AutoSign

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/AutoSign.java:47`

```java
public AutoSign()
```

## meteordevelopment.meteorclient.systems.modules.world.AutoSign.onDeactivate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/AutoSign.java:51`

```java
@Override public void onDeactivate()
```

## meteordevelopment.meteorclient.systems.modules.world.AutoSmelter

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/AutoSmelter.java:24`

```java
public class AutoSmelter extends Module
```

## meteordevelopment.meteorclient.systems.modules.world.AutoSmelter.AutoSmelter

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/AutoSmelter.java:67`

```java
public AutoSmelter()
```

## meteordevelopment.meteorclient.systems.modules.world.AutoSmelter.tick

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/AutoSmelter.java:81`

```java
public void tick(AbstractFurnaceMenu c)
```

## meteordevelopment.meteorclient.systems.modules.world.BuildHeight

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/BuildHeight.java:16`

```java
public class BuildHeight extends Module
```

## meteordevelopment.meteorclient.systems.modules.world.BuildHeight.BuildHeight

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/BuildHeight.java:17`

```java
public BuildHeight()
```

## meteordevelopment.meteorclient.systems.modules.world.Collisions

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/Collisions.java:26`

```java
public class Collisions extends Module
```

## meteordevelopment.meteorclient.systems.modules.world.Collisions.blocks

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/Collisions.java:29`

```java
public final Setting<List<Block>> blocks = sgGeneral.add(new BlockListSetting.Builder() .name("blocks") .description("What blocks should be added collision box.") .filter(this::blockFilter) .build() )
```

## meteordevelopment.meteorclient.systems.modules.world.Collisions.Collisions

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/Collisions.java:57`

```java
public Collisions()
```

## meteordevelopment.meteorclient.systems.modules.world.Collisions.ignoreBorder

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/Collisions.java:115`

```java
public boolean ignoreBorder()
```

## meteordevelopment.meteorclient.systems.modules.world.EChestFarmer

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/EChestFarmer.java:34`

```java
public class EChestFarmer extends Module
```

## meteordevelopment.meteorclient.systems.modules.world.EChestFarmer.EChestFarmer

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/EChestFarmer.java:106`

```java
public EChestFarmer()
```

## meteordevelopment.meteorclient.systems.modules.world.EChestFarmer.onActivate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/EChestFarmer.java:110`

```java
@Override public void onActivate()
```

## meteordevelopment.meteorclient.systems.modules.world.EChestFarmer.onDeactivate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/EChestFarmer.java:116`

```java
@Override public void onDeactivate()
```

## meteordevelopment.meteorclient.systems.modules.world.EndermanLook

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/EndermanLook.java:25`

```java
public class EndermanLook extends Module
```

## meteordevelopment.meteorclient.systems.modules.world.EndermanLook.EndermanLook

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/EndermanLook.java:43`

```java
public EndermanLook()
```

## meteordevelopment.meteorclient.systems.modules.world.EndermanLook.Mode

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/EndermanLook.java:85`

```java
public enum Mode
```

## meteordevelopment.meteorclient.systems.modules.world.Excavator

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/Excavator.java:25`

```java
public class Excavator extends Module
```

## meteordevelopment.meteorclient.systems.modules.world.Excavator.Excavator

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/Excavator.java:84`

```java
public Excavator()
```

## meteordevelopment.meteorclient.systems.modules.world.Excavator.onDeactivate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/Excavator.java:88`

```java
@Override public void onDeactivate()
```

## meteordevelopment.meteorclient.systems.modules.world.Flamethrower

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/Flamethrower.java:33`

```java
public class Flamethrower extends Module
```

## meteordevelopment.meteorclient.systems.modules.world.Flamethrower.Flamethrower

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/Flamethrower.java:95`

```java
public Flamethrower()
```

## meteordevelopment.meteorclient.systems.modules.world.Flamethrower.onDeactivate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/Flamethrower.java:99`

```java
@Override public void onDeactivate()
```

## meteordevelopment.meteorclient.systems.modules.world.HighwayBuilder

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/HighwayBuilder.java:80`

```java
@SuppressWarnings("ConstantConditions") public class HighwayBuilder extends Module
```

## meteordevelopment.meteorclient.systems.modules.world.HighwayBuilder.Floor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/HighwayBuilder.java:82`

```java
public enum Floor
```

## meteordevelopment.meteorclient.systems.modules.world.HighwayBuilder.Rotation

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/HighwayBuilder.java:87`

```java
public enum Rotation
```

## meteordevelopment.meteorclient.systems.modules.world.HighwayBuilder.Rotation.mine

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/HighwayBuilder.java:93`

```java
public final boolean mine, place
```

## meteordevelopment.meteorclient.systems.modules.world.HighwayBuilder.Rotation.place

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/HighwayBuilder.java:93`

```java
public final boolean mine, place
```

## meteordevelopment.meteorclient.systems.modules.world.HighwayBuilder.BlockadeType

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/HighwayBuilder.java:101`

```java
public enum BlockadeType
```

## meteordevelopment.meteorclient.systems.modules.world.HighwayBuilder.BlockadeType.columns

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/HighwayBuilder.java:106`

```java
public final int columns
```

## meteordevelopment.meteorclient.systems.modules.world.HighwayBuilder.blocksToPlace

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/HighwayBuilder.java:260`

```java
public final Setting<List<Block>> blocksToPlace = sgPaving.add(new BlockListSetting.Builder() .name("blocks-to-place") .description("Blocks it is allowed to place.") .defaultValue(Blocks.OBSIDIAN) .filter(block -> Block.isShapeFullBlock(block.defaultBlockState().getCollisionShape(EmptyBlockGetter.INSTANCE, BlockPos.ZERO))) .build() )
```

## meteordevelopment.meteorclient.systems.modules.world.HighwayBuilder.saveEchests

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/HighwayBuilder.java:358`

```java
public final Setting<Integer> saveEchests = sgInventory.add(new IntSetting.Builder() .name("save-ender-chests") .description("How many ender chests to ensure are saved. Hitting this number in your inventory will trigger a restock or the module toggling off.") .defaultValue(2) .range(0, 64) .sliderRange(0, 64) .visible(mineEnderChests::get) .build() )
```

## meteordevelopment.meteorclient.systems.modules.world.HighwayBuilder.start

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/HighwayBuilder.java:453`

```java
public Vec3 start
```

## meteordevelopment.meteorclient.systems.modules.world.HighwayBuilder.blocksBroken

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/HighwayBuilder.java:454`

```java
public int blocksBroken, blocksPlaced
```

## meteordevelopment.meteorclient.systems.modules.world.HighwayBuilder.blocksPlaced

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/HighwayBuilder.java:454`

```java
public int blocksBroken, blocksPlaced
```

## meteordevelopment.meteorclient.systems.modules.world.HighwayBuilder.drawingBow

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/HighwayBuilder.java:461`

```java
public boolean drawingBow
```

## meteordevelopment.meteorclient.systems.modules.world.HighwayBuilder.normalMining

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/HighwayBuilder.java:462`

```java
public DoubleMineBlock normalMining, packetMining
```

## meteordevelopment.meteorclient.systems.modules.world.HighwayBuilder.packetMining

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/HighwayBuilder.java:462`

```java
public DoubleMineBlock normalMining, packetMining
```

## meteordevelopment.meteorclient.systems.modules.world.HighwayBuilder.HighwayBuilder

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/HighwayBuilder.java:467`

```java
public HighwayBuilder()
```

## meteordevelopment.meteorclient.systems.modules.world.HighwayBuilder.onActivate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/HighwayBuilder.java:479`

```java
@Override public void onActivate()
```

## meteordevelopment.meteorclient.systems.modules.world.HighwayBuilder.onDeactivate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/HighwayBuilder.java:518`

```java
@Override public void onDeactivate()
```

## meteordevelopment.meteorclient.systems.modules.world.HighwayBuilder.error

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/HighwayBuilder.java:533`

```java
@Override public void error(String message, Object... args)
```

## meteordevelopment.meteorclient.systems.modules.world.HighwayBuilder.getStatsText

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/HighwayBuilder.java:741`

```java
public MutableComponent getStatsText()
```

## meteordevelopment.meteorclient.systems.modules.world.HighwayBuilder.DoubleMineBlock

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/HighwayBuilder.java:2797`

```java
public static class DoubleMineBlock
```

## meteordevelopment.meteorclient.systems.modules.world.HighwayBuilder.DoubleMineBlock.rateLimited

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/HighwayBuilder.java:2798`

```java
public static boolean rateLimited = false
```

## meteordevelopment.meteorclient.systems.modules.world.HighwayBuilder.DoubleMineBlock.blockPos

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/HighwayBuilder.java:2799`

```java
public final BlockPos blockPos
```

## meteordevelopment.meteorclient.systems.modules.world.HighwayBuilder.DoubleMineBlock.blockState

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/HighwayBuilder.java:2800`

```java
public final BlockState blockState
```

## meteordevelopment.meteorclient.systems.modules.world.HighwayBuilder.DoubleMineBlock.DoubleMineBlock

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/HighwayBuilder.java:2810`

```java
public DoubleMineBlock(HighwayBuilder b, BlockPos pos)
```

## meteordevelopment.meteorclient.systems.modules.world.HighwayBuilder.DoubleMineBlock.startDestroying

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/HighwayBuilder.java:2819`

```java
public DoubleMineBlock startDestroying()
```

## meteordevelopment.meteorclient.systems.modules.world.HighwayBuilder.DoubleMineBlock.stopDestroying

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/HighwayBuilder.java:2825`

```java
public DoubleMineBlock stopDestroying()
```

## meteordevelopment.meteorclient.systems.modules.world.HighwayBuilder.DoubleMineBlock.packetMine

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/HighwayBuilder.java:2830`

```java
public DoubleMineBlock packetMine()
```

## meteordevelopment.meteorclient.systems.modules.world.HighwayBuilder.DoubleMineBlock.isReady

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/HighwayBuilder.java:2836`

```java
public boolean isReady()
```

## meteordevelopment.meteorclient.systems.modules.world.HighwayBuilder.DoubleMineBlock.shouldRemove

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/HighwayBuilder.java:2840`

```java
public boolean shouldRemove()
```

## meteordevelopment.meteorclient.systems.modules.world.HighwayBuilder.DoubleMineBlock.progress

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/HighwayBuilder.java:2850`

```java
public double progress()
```

## meteordevelopment.meteorclient.systems.modules.world.HighwayBuilder.DoubleMineBlock.renderLetter

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/HighwayBuilder.java:2855`

```java
public void renderLetter(GuiGraphicsExtractor graphics)
```

## meteordevelopment.meteorclient.systems.modules.world.InfinityMiner

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/InfinityMiner.java:37`

```java
public class InfinityMiner extends Module
```

## meteordevelopment.meteorclient.systems.modules.world.InfinityMiner.targetBlocks

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/InfinityMiner.java:43`

```java
public final Setting<List<Block>> targetBlocks = sgGeneral.add(new BlockListSetting.Builder() .name("target-blocks") .description("The target blocks to mine.") .defaultValue(Blocks.DIAMOND_ORE, Blocks.DEEPSLATE_DIAMOND_ORE) .filter(this::filterBlocks) .build() )
```

## meteordevelopment.meteorclient.systems.modules.world.InfinityMiner.targetItems

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/InfinityMiner.java:51`

```java
public final Setting<List<Item>> targetItems = sgGeneral.add(new ItemListSetting.Builder() .name("target-items") .description("The target items to collect.") .defaultValue(Items.DIAMOND) .build() )
```

## meteordevelopment.meteorclient.systems.modules.world.InfinityMiner.repairBlocks

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/InfinityMiner.java:58`

```java
public final Setting<List<Block>> repairBlocks = sgGeneral.add(new BlockListSetting.Builder() .name("repair-blocks") .description("The repair blocks to mine.") .defaultValue(Blocks.COAL_ORE, Blocks.REDSTONE_ORE, Blocks.NETHER_QUARTZ_ORE) .filter(this::filterBlocks) .build() )
```

## meteordevelopment.meteorclient.systems.modules.world.InfinityMiner.startRepairing

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/InfinityMiner.java:66`

```java
public final Setting<Double> startRepairing = sgGeneral.add(new DoubleSetting.Builder() .name("repair-threshold") .description("The durability percentage at which to start repairing.") .defaultValue(20) .range(1, 99) .sliderRange(1, 99) .build() )
```

## meteordevelopment.meteorclient.systems.modules.world.InfinityMiner.startMining

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/InfinityMiner.java:75`

```java
public final Setting<Double> startMining = sgGeneral.add(new DoubleSetting.Builder() .name("mine-threshold") .description("The durability percentage at which to start mining.") .defaultValue(70) .range(1, 99) .sliderRange(1, 99) .build() )
```

## meteordevelopment.meteorclient.systems.modules.world.InfinityMiner.walkHome

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/InfinityMiner.java:86`

```java
public final Setting<Boolean> walkHome = sgWhenFull.add(new BoolSetting.Builder() .name("walk-home") .description("Will walk 'home' when your inventory is full.") .defaultValue(false) .build() )
```

## meteordevelopment.meteorclient.systems.modules.world.InfinityMiner.logOut

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/InfinityMiner.java:93`

```java
public final Setting<Boolean> logOut = sgWhenFull.add(new BoolSetting.Builder() .name("log-out") .description("Logs out when your inventory is full. Will walk home FIRST if walk home is enabled.") .defaultValue(false) .build() )
```

## meteordevelopment.meteorclient.systems.modules.world.InfinityMiner.InfinityMiner

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/InfinityMiner.java:108`

```java
public InfinityMiner()
```

## meteordevelopment.meteorclient.systems.modules.world.InfinityMiner.onActivate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/InfinityMiner.java:112`

```java
@Override public void onActivate()
```

## meteordevelopment.meteorclient.systems.modules.world.InfinityMiner.onDeactivate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/InfinityMiner.java:120`

```java
@Override public void onDeactivate()
```

## meteordevelopment.meteorclient.systems.modules.world.LiquidFiller

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/LiquidFiller.java:34`

```java
public class LiquidFiller extends Module
```

## meteordevelopment.meteorclient.systems.modules.world.LiquidFiller.LiquidFiller

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/LiquidFiller.java:137`

```java
public LiquidFiller()
```

## meteordevelopment.meteorclient.systems.modules.world.LiquidFiller.onActivate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/LiquidFiller.java:141`

```java
@Override public void onActivate()
```

## meteordevelopment.meteorclient.systems.modules.world.LiquidFiller.PlaceIn

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/LiquidFiller.java:209`

```java
public enum PlaceIn
```

## meteordevelopment.meteorclient.systems.modules.world.LiquidFiller.SortMode

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/LiquidFiller.java:215`

```java
public enum SortMode
```

## meteordevelopment.meteorclient.systems.modules.world.LiquidFiller.Shape

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/LiquidFiller.java:223`

```java
public enum Shape
```

## meteordevelopment.meteorclient.systems.modules.world.NoGhostBlocks

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/NoGhostBlocks.java:18`

```java
public class NoGhostBlocks extends Module
```

## meteordevelopment.meteorclient.systems.modules.world.NoGhostBlocks.placing

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/NoGhostBlocks.java:28`

```java
public final Setting<Boolean> placing = sgGeneral.add(new BoolSetting.Builder() .name("placing") .description("Whether to apply for block placement actions.") .defaultValue(true) .build() )
```

## meteordevelopment.meteorclient.systems.modules.world.NoGhostBlocks.NoGhostBlocks

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/NoGhostBlocks.java:35`

```java
public NoGhostBlocks()
```

## meteordevelopment.meteorclient.systems.modules.world.Nuker

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/Nuker.java:48`

```java
public class Nuker extends Module
```

## meteordevelopment.meteorclient.systems.modules.world.Nuker.Nuker

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/Nuker.java:303`

```java
public Nuker()
```

## meteordevelopment.meteorclient.systems.modules.world.Nuker.onActivate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/Nuker.java:307`

```java
@Override public void onActivate()
```

## meteordevelopment.meteorclient.systems.modules.world.Nuker.Mode

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/Nuker.java:566`

```java
public enum Mode
```

## meteordevelopment.meteorclient.systems.modules.world.Nuker.SortMode

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/Nuker.java:572`

```java
public enum SortMode
```

## meteordevelopment.meteorclient.systems.modules.world.Nuker.Shape

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/Nuker.java:579`

```java
public enum Shape
```

## meteordevelopment.meteorclient.systems.modules.world.Nuker.chebyshevDist

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/Nuker.java:585`

```java
public static int chebyshevDist(int x1, int y1, int z1, int x2, int y2, int z2)
```

## meteordevelopment.meteorclient.systems.modules.world.PacketMine

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/PacketMine.java:36`

```java
public class PacketMine extends Module
```

## meteordevelopment.meteorclient.systems.modules.world.PacketMine.blocks

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/PacketMine.java:124`

```java
public final List<MyBlock> blocks = new ArrayList<>()
```

## meteordevelopment.meteorclient.systems.modules.world.PacketMine.PacketMine

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/PacketMine.java:128`

```java
public PacketMine()
```

## meteordevelopment.meteorclient.systems.modules.world.PacketMine.onActivate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/PacketMine.java:132`

```java
@Override public void onActivate()
```

## meteordevelopment.meteorclient.systems.modules.world.PacketMine.onDeactivate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/PacketMine.java:137`

```java
@Override public void onDeactivate()
```

## meteordevelopment.meteorclient.systems.modules.world.PacketMine.isMiningBlock

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/PacketMine.java:160`

```java
public boolean isMiningBlock(BlockPos pos)
```

## meteordevelopment.meteorclient.systems.modules.world.PacketMine.MyBlock

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/PacketMine.java:203`

```java
public class MyBlock
```

## meteordevelopment.meteorclient.systems.modules.world.PacketMine.MyBlock.blockPos

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/PacketMine.java:204`

```java
public BlockPos blockPos
```

## meteordevelopment.meteorclient.systems.modules.world.PacketMine.MyBlock.blockState

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/PacketMine.java:205`

```java
public BlockState blockState
```

## meteordevelopment.meteorclient.systems.modules.world.PacketMine.MyBlock.block

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/PacketMine.java:206`

```java
public Block block
```

## meteordevelopment.meteorclient.systems.modules.world.PacketMine.MyBlock.direction

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/PacketMine.java:208`

```java
public Direction direction
```

## meteordevelopment.meteorclient.systems.modules.world.PacketMine.MyBlock.timer

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/PacketMine.java:210`

```java
public int timer, startTime
```

## meteordevelopment.meteorclient.systems.modules.world.PacketMine.MyBlock.startTime

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/PacketMine.java:210`

```java
public int timer, startTime
```

## meteordevelopment.meteorclient.systems.modules.world.PacketMine.MyBlock.mining

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/PacketMine.java:211`

```java
public boolean mining
```

## meteordevelopment.meteorclient.systems.modules.world.PacketMine.MyBlock.set

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/PacketMine.java:213`

```java
public MyBlock set(StartBreakingBlockEvent event)
```

## meteordevelopment.meteorclient.systems.modules.world.PacketMine.MyBlock.shouldRemove

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/PacketMine.java:224`

```java
public boolean shouldRemove()
```

## meteordevelopment.meteorclient.systems.modules.world.PacketMine.MyBlock.isReady

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/PacketMine.java:232`

```java
public boolean isReady()
```

## meteordevelopment.meteorclient.systems.modules.world.PacketMine.MyBlock.progress

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/PacketMine.java:236`

```java
public double progress()
```

## meteordevelopment.meteorclient.systems.modules.world.PacketMine.MyBlock.mine

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/PacketMine.java:243`

```java
public void mine()
```

## meteordevelopment.meteorclient.systems.modules.world.PacketMine.MyBlock.render

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/PacketMine.java:266`

```java
public void render(Render3DEvent event)
```

## meteordevelopment.meteorclient.systems.modules.world.SpawnProofer

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/SpawnProofer.java:29`

```java
public class SpawnProofer extends Module
```

## meteordevelopment.meteorclient.systems.modules.world.SpawnProofer.SpawnProofer

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/SpawnProofer.java:101`

```java
public SpawnProofer()
```

## meteordevelopment.meteorclient.systems.modules.world.SpawnProofer.Mode

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/SpawnProofer.java:204`

```java
public enum Mode
```

## meteordevelopment.meteorclient.systems.modules.world.StashFinder

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/StashFinder.java:60`

```java
public class StashFinder extends Module
```

## meteordevelopment.meteorclient.systems.modules.world.StashFinder.chunks

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/StashFinder.java:202`

```java
public List<Chunk> chunks = new ArrayList<>()
```

## meteordevelopment.meteorclient.systems.modules.world.StashFinder.StashFinder

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/StashFinder.java:204`

```java
public StashFinder()
```

## meteordevelopment.meteorclient.systems.modules.world.StashFinder.onActivate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/StashFinder.java:208`

```java
@Override public void onActivate()
```

## meteordevelopment.meteorclient.systems.modules.world.StashFinder.getWidget

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/StashFinder.java:284`

```java
@Override public WWidget getWidget(GuiTheme theme)
```

## meteordevelopment.meteorclient.systems.modules.world.StashFinder.getInfoString

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/StashFinder.java:435`

```java
@Override public String getInfoString()
```

## meteordevelopment.meteorclient.systems.modules.world.StashFinder.Mode

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/StashFinder.java:500`

```java
public enum Mode
```

## meteordevelopment.meteorclient.systems.modules.world.StashFinder.Chunk

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/StashFinder.java:506`

```java
public static class Chunk
```

## meteordevelopment.meteorclient.systems.modules.world.StashFinder.Chunk.chunkPos

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/StashFinder.java:507`

```java
public final ChunkPos chunkPos
```

## meteordevelopment.meteorclient.systems.modules.world.StashFinder.Chunk.chests

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/StashFinder.java:508`

```java
public int chests, barrels, shulkers, enderChests, furnaces, dispensersDroppers, hoppers
```

## meteordevelopment.meteorclient.systems.modules.world.StashFinder.Chunk.barrels

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/StashFinder.java:508`

```java
public int chests, barrels, shulkers, enderChests, furnaces, dispensersDroppers, hoppers
```

## meteordevelopment.meteorclient.systems.modules.world.StashFinder.Chunk.shulkers

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/StashFinder.java:508`

```java
public int chests, barrels, shulkers, enderChests, furnaces, dispensersDroppers, hoppers
```

## meteordevelopment.meteorclient.systems.modules.world.StashFinder.Chunk.enderChests

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/StashFinder.java:508`

```java
public int chests, barrels, shulkers, enderChests, furnaces, dispensersDroppers, hoppers
```

## meteordevelopment.meteorclient.systems.modules.world.StashFinder.Chunk.furnaces

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/StashFinder.java:508`

```java
public int chests, barrels, shulkers, enderChests, furnaces, dispensersDroppers, hoppers
```

## meteordevelopment.meteorclient.systems.modules.world.StashFinder.Chunk.dispensersDroppers

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/StashFinder.java:508`

```java
public int chests, barrels, shulkers, enderChests, furnaces, dispensersDroppers, hoppers
```

## meteordevelopment.meteorclient.systems.modules.world.StashFinder.Chunk.hoppers

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/StashFinder.java:508`

```java
public int chests, barrels, shulkers, enderChests, furnaces, dispensersDroppers, hoppers
```

## meteordevelopment.meteorclient.systems.modules.world.StashFinder.Chunk.Chunk

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/StashFinder.java:510`

```java
public Chunk(ChunkPos chunkPos)
```

## meteordevelopment.meteorclient.systems.modules.world.StashFinder.Chunk.getTotal

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/StashFinder.java:514`

```java
public int getTotal()
```

## meteordevelopment.meteorclient.systems.modules.world.StashFinder.Chunk.write

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/StashFinder.java:518`

```java
public void write(BufferedWriter writer) throws IOException
```

## meteordevelopment.meteorclient.systems.modules.world.StashFinder.Chunk.countsEqual

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/StashFinder.java:526`

```java
public boolean countsEqual(Chunk c)
```

## meteordevelopment.meteorclient.systems.modules.world.StashFinder.Chunk.equals

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/StashFinder.java:531`

```java
@Override public boolean equals(Object o)
```

## meteordevelopment.meteorclient.systems.modules.world.StashFinder.Chunk.hashCode

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/StashFinder.java:539`

```java
@Override public int hashCode()
```

## meteordevelopment.meteorclient.systems.modules.world.Timer

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/Timer.java:14`

```java
public class Timer extends Module
```

## meteordevelopment.meteorclient.systems.modules.world.Timer.OFF

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/Timer.java:26`

```java
public static final double OFF = 1
```

## meteordevelopment.meteorclient.systems.modules.world.Timer.Timer

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/Timer.java:29`

```java
public Timer()
```

## meteordevelopment.meteorclient.systems.modules.world.Timer.getMultiplier

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/Timer.java:33`

```java
public double getMultiplier()
```

## meteordevelopment.meteorclient.systems.modules.world.Timer.setOverride

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/Timer.java:37`

```java
public void setOverride(double override)
```

## meteordevelopment.meteorclient.systems.modules.world.VeinMiner

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/VeinMiner.java:38`

```java
public class VeinMiner extends Module
```

## meteordevelopment.meteorclient.systems.modules.world.VeinMiner.VeinMiner

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/VeinMiner.java:140`

```java
public VeinMiner()
```

## meteordevelopment.meteorclient.systems.modules.world.VeinMiner.onDeactivate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/VeinMiner.java:144`

```java
@Override public void onDeactivate()
```

## meteordevelopment.meteorclient.systems.modules.world.VeinMiner.getInfoString

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/VeinMiner.java:276`

```java
@Override public String getInfoString()
```
