# utils

Khai báo Java có cú pháp public/protected. Không bao gồm API kế thừa/tổng hợp bởi compiler; xem kiểm tra bytecode riêng.

## meteordevelopment.meteorclient.utils.OutlineRenderCommandQueue

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/OutlineRenderCommandQueue.java:34`

```java
public class OutlineRenderCommandQueue extends OrderedRenderCommandQueueImpl
```

## meteordevelopment.meteorclient.utils.OutlineRenderCommandQueue.setColor

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/OutlineRenderCommandQueue.java:38`

```java
public void setColor(Color color)
```

## meteordevelopment.meteorclient.utils.OutlineRenderCommandQueue.getBatchingQueue

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/OutlineRenderCommandQueue.java:42`

```java
@Override public BatchingRenderCommandQueue getBatchingQueue(int i)
```

## meteordevelopment.meteorclient.utils.PostInit

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/PostInit.java:13`

```java
@Retention(RetentionPolicy.RUNTIME) @Target(ElementType.METHOD) public @interface PostInit
```

## meteordevelopment.meteorclient.utils.PostInit.dependencies

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/PostInit.java:16`

```java
Class<?>[] dependencies() default { }
```

## meteordevelopment.meteorclient.utils.PreInit

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/PreInit.java:13`

```java
@Retention(RetentionPolicy.RUNTIME) @Target(ElementType.METHOD) public @interface PreInit
```

## meteordevelopment.meteorclient.utils.PreInit.dependencies

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/PreInit.java:16`

```java
Class<?>[] dependencies() default { }
```

## meteordevelopment.meteorclient.utils.ReflectInit

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/ReflectInit.java:19`

```java
public class ReflectInit
```

## meteordevelopment.meteorclient.utils.ReflectInit.registerPackages

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/ReflectInit.java:25`

```java
public static void registerPackages()
```

## meteordevelopment.meteorclient.utils.ReflectInit.init

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/ReflectInit.java:41`

```java
public static void init(Class<? extends Annotation> annotation)
```

## meteordevelopment.meteorclient.utils.Utils

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/Utils.java:77`

```java
public class Utils
```

## meteordevelopment.meteorclient.utils.Utils.FILE_NAME_INVALID_CHARS_PATTERN

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/Utils.java:78`

```java
public static final Pattern FILE_NAME_INVALID_CHARS_PATTERN = Pattern.compile("[\\s\\\\/:*?\"<>|]")
```

## meteordevelopment.meteorclient.utils.Utils.WHITE

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/Utils.java:79`

```java
public static final Color WHITE = new Color(255, 255, 255)
```

## meteordevelopment.meteorclient.utils.Utils.isReleasingTrident

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/Utils.java:82`

```java
public static boolean isReleasingTrident
```

## meteordevelopment.meteorclient.utils.Utils.rendering3D

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/Utils.java:83`

```java
public static boolean rendering3D = true
```

## meteordevelopment.meteorclient.utils.Utils.frameTime

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/Utils.java:84`

```java
public static double frameTime
```

## meteordevelopment.meteorclient.utils.Utils.screenToOpen

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/Utils.java:85`

```java
public static Screen screenToOpen
```

## meteordevelopment.meteorclient.utils.Utils.init

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/Utils.java:92`

```java
@PreInit public static void init()
```

## meteordevelopment.meteorclient.utils.Utils.getPlayerSpeed

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/Utils.java:105`

```java
public static Vec3d getPlayerSpeed()
```

## meteordevelopment.meteorclient.utils.Utils.getWorldTime

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/Utils.java:126`

```java
public static String getWorldTime()
```

## meteordevelopment.meteorclient.utils.Utils.chunks

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/Utils.java:136`

```java
public static Iterable<Chunk> chunks(boolean onlyWithLoadedNeighbours)
```

## meteordevelopment.meteorclient.utils.Utils.chunks

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/Utils.java:140`

```java
public static Iterable<Chunk> chunks()
```

## meteordevelopment.meteorclient.utils.Utils.blockEntities

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/Utils.java:144`

```java
public static Iterable<BlockEntity> blockEntities()
```

## meteordevelopment.meteorclient.utils.Utils.getEnchantments

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/Utils.java:148`

```java
public static void getEnchantments(ItemStack itemStack, Object2IntMap<RegistryEntry<Enchantment>> enchantments)
```

## meteordevelopment.meteorclient.utils.Utils.getEnchantmentLevel

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/Utils.java:162`

```java
public static int getEnchantmentLevel(ItemStack itemStack, RegistryKey<Enchantment> enchantment)
```

## meteordevelopment.meteorclient.utils.Utils.getEnchantmentLevel

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/Utils.java:169`

```java
public static int getEnchantmentLevel(Object2IntMap<RegistryEntry<Enchantment>> itemEnchantments, RegistryKey<Enchantment> enchantment)
```

## meteordevelopment.meteorclient.utils.Utils.hasEnchantments

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/Utils.java:176`

```java
@SafeVarargs public static boolean hasEnchantments(ItemStack itemStack, RegistryKey<Enchantment>... enchantments)
```

## meteordevelopment.meteorclient.utils.Utils.hasEnchantment

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/Utils.java:188`

```java
public static boolean hasEnchantment(ItemStack itemStack, RegistryKey<Enchantment> enchantmentKey)
```

## meteordevelopment.meteorclient.utils.Utils.getRenderDistance

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/Utils.java:202`

```java
public static int getRenderDistance()
```

## meteordevelopment.meteorclient.utils.Utils.getWindowWidth

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/Utils.java:206`

```java
public static int getWindowWidth()
```

## meteordevelopment.meteorclient.utils.Utils.getWindowHeight

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/Utils.java:210`

```java
public static int getWindowHeight()
```

## meteordevelopment.meteorclient.utils.Utils.unscaledProjection

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/Utils.java:214`

```java
public static void unscaledProjection()
```

## meteordevelopment.meteorclient.utils.Utils.scaledProjection

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/Utils.java:224`

```java
public static void scaledProjection()
```

## meteordevelopment.meteorclient.utils.Utils.vec3d

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/Utils.java:234`

```java
public static Vec3d vec3d(BlockPos pos)
```

## meteordevelopment.meteorclient.utils.Utils.openContainer

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/Utils.java:238`

```java
public static boolean openContainer(ItemStack itemStack, ItemStack[] contents, boolean pause)
```

## meteordevelopment.meteorclient.utils.Utils.getItemsInContainerItem

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/Utils.java:249`

```java
public static void getItemsInContainerItem(ItemStack itemStack, ItemStack[] items)
```

## meteordevelopment.meteorclient.utils.Utils.getShulkerColor

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/Utils.java:293`

```java
public static Color getShulkerColor(ItemStack shulkerItem)
```

## meteordevelopment.meteorclient.utils.Utils.hasItems

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/Utils.java:310`

```java
public static boolean hasItems(ItemStack itemStack)
```

## meteordevelopment.meteorclient.utils.Utils.createStatusEffectMap

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/Utils.java:318`

```java
public static Reference2IntMap<StatusEffect> createStatusEffectMap()
```

## meteordevelopment.meteorclient.utils.Utils.getEnchantSimpleName

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/Utils.java:322`

```java
public static String getEnchantSimpleName(RegistryEntry<Enchantment> enchantment, int length)
```

## meteordevelopment.meteorclient.utils.Utils.searchTextDefault

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/Utils.java:327`

```java
public static boolean searchTextDefault(String text, String filter, boolean caseSensitive)
```

## meteordevelopment.meteorclient.utils.Utils.searchLevenshteinDefault

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/Utils.java:331`

```java
public static int searchLevenshteinDefault(String text, String filter, boolean caseSensitive)
```

## meteordevelopment.meteorclient.utils.Utils.searchInWords

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/Utils.java:335`

```java
public static int searchInWords(String text, String filter)
```

## meteordevelopment.meteorclient.utils.Utils.levenshteinDistance

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/Utils.java:350`

```java
public static int levenshteinDistance(String from, String to, int insCost, int subCost, int delCost)
```

## meteordevelopment.meteorclient.utils.Utils.squaredDistance

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/Utils.java:381`

```java
public static double squaredDistance(double x1, double y1, double z1, double x2, double y2, double z2)
```

## meteordevelopment.meteorclient.utils.Utils.distance

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/Utils.java:388`

```java
public static double distance(double x1, double y1, double z1, double x2, double y2, double z2)
```

## meteordevelopment.meteorclient.utils.Utils.getFileWorldName

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/Utils.java:395`

```java
public static String getFileWorldName()
```

## meteordevelopment.meteorclient.utils.Utils.getWorldName

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/Utils.java:402`

```java
public static String getWorldName()
```

## meteordevelopment.meteorclient.utils.Utils.nameToTitle

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/Utils.java:423`

```java
public static String nameToTitle(String name)
```

## meteordevelopment.meteorclient.utils.Utils.titleToName

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/Utils.java:427`

```java
public static String titleToName(String title)
```

## meteordevelopment.meteorclient.utils.Utils.getKeyName

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/Utils.java:431`

```java
public static String getKeyName(int key)
```

## meteordevelopment.meteorclient.utils.Utils.getButtonName

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/Utils.java:500`

```java
public static String getButtonName(int button)
```

## meteordevelopment.meteorclient.utils.Utils.readBytes

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/Utils.java:510`

```java
public static byte[] readBytes(InputStream in)
```

## meteordevelopment.meteorclient.utils.Utils.canUpdate

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/Utils.java:521`

```java
public static boolean canUpdate()
```

## meteordevelopment.meteorclient.utils.Utils.canOpenGui

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/Utils.java:525`

```java
public static boolean canOpenGui()
```

## meteordevelopment.meteorclient.utils.Utils.canCloseGui

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/Utils.java:531`

```java
public static boolean canCloseGui()
```

## meteordevelopment.meteorclient.utils.Utils.random

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/Utils.java:535`

```java
public static int random(int min, int max)
```

## meteordevelopment.meteorclient.utils.Utils.random

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/Utils.java:539`

```java
public static double random(double min, double max)
```

## meteordevelopment.meteorclient.utils.Utils.leftClick

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/Utils.java:543`

```java
public static void leftClick()
```

## meteordevelopment.meteorclient.utils.Utils.rightClick

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/Utils.java:557`

```java
public static void rightClick()
```

## meteordevelopment.meteorclient.utils.Utils.isShulker

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/Utils.java:561`

```java
public static boolean isShulker(Item item)
```

## meteordevelopment.meteorclient.utils.Utils.isThrowable

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/Utils.java:565`

```java
public static boolean isThrowable(Item item)
```

## meteordevelopment.meteorclient.utils.Utils.addEnchantment

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/Utils.java:569`

```java
public static void addEnchantment(ItemStack itemStack, RegistryEntry<Enchantment> enchantment, int level)
```

## meteordevelopment.meteorclient.utils.Utils.clearEnchantments

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/Utils.java:576`

```java
public static void clearEnchantments(ItemStack itemStack)
```

## meteordevelopment.meteorclient.utils.Utils.removeEnchantment

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/Utils.java:580`

```java
public static void removeEnchantment(ItemStack itemStack, Enchantment enchantment)
```

## meteordevelopment.meteorclient.utils.Utils.lerp

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/Utils.java:584`

```java
public static Color lerp(Color first, Color second, @Range(from = 0, to = 1) float v)
```

## meteordevelopment.meteorclient.utils.Utils.isLoading

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/Utils.java:592`

```java
public static boolean isLoading()
```

## meteordevelopment.meteorclient.utils.Utils.parsePort

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/Utils.java:597`

```java
public static int parsePort(String full)
```

## meteordevelopment.meteorclient.utils.Utils.parseAddress

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/Utils.java:611`

```java
public static String parseAddress(String full)
```

## meteordevelopment.meteorclient.utils.Utils.resolveAddress

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/Utils.java:616`

```java
public static boolean resolveAddress(String address)
```

## meteordevelopment.meteorclient.utils.Utils.resolveAddress

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/Utils.java:626`

```java
public static boolean resolveAddress(String address, int port)
```

## meteordevelopment.meteorclient.utils.Utils.set

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/Utils.java:632`

```java
public static Vector3d set(Vector3d vec, Vec3d v)
```

## meteordevelopment.meteorclient.utils.Utils.set

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/Utils.java:640`

```java
public static Vector3d set(Vector3d vec, Entity entity, double tickDelta)
```

## meteordevelopment.meteorclient.utils.Utils.nameFilter

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/Utils.java:650`

```java
public static boolean nameFilter(String text, char character)
```

## meteordevelopment.meteorclient.utils.Utils.ipFilter

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/Utils.java:654`

```java
public static boolean ipFilter(String text, char character)
```
