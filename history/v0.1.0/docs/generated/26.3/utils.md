# utils

Khai báo Java có cú pháp public/protected. Không bao gồm API kế thừa/tổng hợp bởi compiler; xem kiểm tra bytecode riêng.

## meteordevelopment.meteorclient.utils.OutlineRenderCommandQueue

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/OutlineRenderCommandQueue.java:37`

```java
public class OutlineRenderCommandQueue extends SubmitNodeStorage
```

## meteordevelopment.meteorclient.utils.OutlineRenderCommandQueue.setColor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/OutlineRenderCommandQueue.java:41`

```java
public void setColor(Color color)
```

## meteordevelopment.meteorclient.utils.OutlineRenderCommandQueue.order

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/OutlineRenderCommandQueue.java:45`

```java
@Override public @NonNull SubmitNodeCollection order(int i)
```

## meteordevelopment.meteorclient.utils.PostInit

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/PostInit.java:13`

```java
@Retention(RetentionPolicy.RUNTIME) @Target(ElementType.METHOD) public @interface PostInit
```

## meteordevelopment.meteorclient.utils.PostInit.dependencies

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/PostInit.java:16`

```java
Class<?>[] dependencies() default { }
```

## meteordevelopment.meteorclient.utils.PreInit

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/PreInit.java:13`

```java
@Retention(RetentionPolicy.RUNTIME) @Target(ElementType.METHOD) public @interface PreInit
```

## meteordevelopment.meteorclient.utils.PreInit.dependencies

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/PreInit.java:16`

```java
Class<?>[] dependencies() default { }
```

## meteordevelopment.meteorclient.utils.ReflectInit

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/ReflectInit.java:19`

```java
public class ReflectInit
```

## meteordevelopment.meteorclient.utils.ReflectInit.registerPackages

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/ReflectInit.java:25`

```java
public static void registerPackages()
```

## meteordevelopment.meteorclient.utils.ReflectInit.init

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/ReflectInit.java:41`

```java
public static void init(Class<? extends Annotation> annotation)
```

## meteordevelopment.meteorclient.utils.Utils

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/Utils.java:77`

```java
public class Utils
```

## meteordevelopment.meteorclient.utils.Utils.FILE_NAME_INVALID_CHARS_PATTERN

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/Utils.java:78`

```java
public static final Pattern FILE_NAME_INVALID_CHARS_PATTERN = Pattern.compile("[\\s\\\\/:*?\"<>|]")
```

## meteordevelopment.meteorclient.utils.Utils.WHITE

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/Utils.java:79`

```java
public static final Color WHITE = new Color(255, 255, 255)
```

## meteordevelopment.meteorclient.utils.Utils.isReleasingTrident

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/Utils.java:82`

```java
public static boolean isReleasingTrident
```

## meteordevelopment.meteorclient.utils.Utils.rendering3D

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/Utils.java:83`

```java
public static boolean rendering3D = true
```

## meteordevelopment.meteorclient.utils.Utils.frameTime

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/Utils.java:84`

```java
public static double frameTime
```

## meteordevelopment.meteorclient.utils.Utils.screenToOpen

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/Utils.java:85`

```java
public static Screen screenToOpen
```

## meteordevelopment.meteorclient.utils.Utils.init

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/Utils.java:92`

```java
@PreInit public static void init()
```

## meteordevelopment.meteorclient.utils.Utils.getPlayerSpeed

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/Utils.java:105`

```java
public static Vec3 getPlayerSpeed()
```

## meteordevelopment.meteorclient.utils.Utils.getWorldTime

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/Utils.java:126`

```java
public static String getWorldTime()
```

## meteordevelopment.meteorclient.utils.Utils.chunks

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/Utils.java:134`

```java
public static Iterable<ChunkAccess> chunks(boolean onlyWithLoadedNeighbours)
```

## meteordevelopment.meteorclient.utils.Utils.chunks

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/Utils.java:138`

```java
public static Iterable<ChunkAccess> chunks()
```

## meteordevelopment.meteorclient.utils.Utils.blockEntities

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/Utils.java:142`

```java
public static Iterable<BlockEntity> blockEntities()
```

## meteordevelopment.meteorclient.utils.Utils.getEnchantments

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/Utils.java:146`

```java
public static void getEnchantments(ItemStack itemStack, Object2IntMap<Holder<Enchantment>> enchantments)
```

## meteordevelopment.meteorclient.utils.Utils.getEnchantmentLevel

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/Utils.java:160`

```java
public static int getEnchantmentLevel(ItemStack itemStack, ResourceKey<Enchantment> enchantment)
```

## meteordevelopment.meteorclient.utils.Utils.getEnchantmentLevel

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/Utils.java:167`

```java
public static int getEnchantmentLevel(Object2IntMap<Holder<Enchantment>> itemEnchantments, ResourceKey<Enchantment> enchantment)
```

## meteordevelopment.meteorclient.utils.Utils.hasEnchantments

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/Utils.java:174`

```java
@SafeVarargs public static boolean hasEnchantments(ItemStack itemStack, ResourceKey<Enchantment>... enchantments)
```

## meteordevelopment.meteorclient.utils.Utils.hasEnchantment

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/Utils.java:186`

```java
public static boolean hasEnchantment(ItemStack itemStack, ResourceKey<Enchantment> enchantmentKey)
```

## meteordevelopment.meteorclient.utils.Utils.isFood

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/Utils.java:200`

```java
public static boolean isFood(ItemStack stack)
```

## meteordevelopment.meteorclient.utils.Utils.isFood

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/Utils.java:205`

```java
public static boolean isFood(Item item)
```

## meteordevelopment.meteorclient.utils.Utils.getRenderDistance

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/Utils.java:209`

```java
public static int getRenderDistance()
```

## meteordevelopment.meteorclient.utils.Utils.getWindowWidth

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/Utils.java:213`

```java
public static int getWindowWidth()
```

## meteordevelopment.meteorclient.utils.Utils.getWindowHeight

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/Utils.java:217`

```java
public static int getWindowHeight()
```

## meteordevelopment.meteorclient.utils.Utils.unscaledProjection

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/Utils.java:221`

```java
public static void unscaledProjection()
```

## meteordevelopment.meteorclient.utils.Utils.scaledProjection

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/Utils.java:235`

```java
public static void scaledProjection()
```

## meteordevelopment.meteorclient.utils.Utils.vec3

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/Utils.java:249`

```java
public static Vec3 vec3(BlockPos pos)
```

## meteordevelopment.meteorclient.utils.Utils.openContainer

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/Utils.java:253`

```java
public static boolean openContainer(ItemStack itemStack, ItemStack[] contents, boolean pause)
```

## meteordevelopment.meteorclient.utils.Utils.getItemsInContainerItem

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/Utils.java:264`

```java
public static void getItemsInContainerItem(ItemStack itemStack, ItemStack[] items)
```

## meteordevelopment.meteorclient.utils.Utils.getShulkerColor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/Utils.java:307`

```java
public static Color getShulkerColor(ItemStack shulkerItem)
```

## meteordevelopment.meteorclient.utils.Utils.hasItems

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/Utils.java:324`

```java
public static boolean hasItems(ItemStack itemStack)
```

## meteordevelopment.meteorclient.utils.Utils.createStatusEffectMap

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/Utils.java:336`

```java
public static Reference2IntMap<MobEffect> createStatusEffectMap()
```

## meteordevelopment.meteorclient.utils.Utils.getEnchantSimpleName

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/Utils.java:340`

```java
public static String getEnchantSimpleName(Holder<Enchantment> enchantment, int length)
```

## meteordevelopment.meteorclient.utils.Utils.searchTextDefault

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/Utils.java:345`

```java
public static boolean searchTextDefault(String text, String filter, boolean caseSensitive)
```

## meteordevelopment.meteorclient.utils.Utils.searchLevenshteinDefault

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/Utils.java:349`

```java
public static int searchLevenshteinDefault(String text, String filter, boolean caseSensitive)
```

## meteordevelopment.meteorclient.utils.Utils.searchInWords

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/Utils.java:353`

```java
public static int searchInWords(String text, String filter)
```

## meteordevelopment.meteorclient.utils.Utils.levenshteinDistance

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/Utils.java:368`

```java
public static int levenshteinDistance(String from, String to, int insCost, int subCost, int delCost)
```

## meteordevelopment.meteorclient.utils.Utils.squaredDistance

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/Utils.java:399`

```java
public static double squaredDistance(double x1, double y1, double z1, double x2, double y2, double z2)
```

## meteordevelopment.meteorclient.utils.Utils.distance

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/Utils.java:406`

```java
public static double distance(double x1, double y1, double z1, double x2, double y2, double z2)
```

## meteordevelopment.meteorclient.utils.Utils.getFileWorldName

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/Utils.java:413`

```java
public static String getFileWorldName()
```

## meteordevelopment.meteorclient.utils.Utils.getWorldName

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/Utils.java:420`

```java
public static String getWorldName()
```

## meteordevelopment.meteorclient.utils.Utils.nameToTitle

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/Utils.java:441`

```java
public static String nameToTitle(String name)
```

## meteordevelopment.meteorclient.utils.Utils.titleToName

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/Utils.java:445`

```java
public static String titleToName(String title)
```

## meteordevelopment.meteorclient.utils.Utils.readBytes

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/Utils.java:449`

```java
public static byte[] readBytes(InputStream in)
```

## meteordevelopment.meteorclient.utils.Utils.canUpdate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/Utils.java:460`

```java
public static boolean canUpdate()
```

## meteordevelopment.meteorclient.utils.Utils.canOpenGui

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/Utils.java:464`

```java
public static boolean canOpenGui()
```

## meteordevelopment.meteorclient.utils.Utils.canCloseGui

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/Utils.java:471`

```java
public static boolean canCloseGui()
```

## meteordevelopment.meteorclient.utils.Utils.random

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/Utils.java:475`

```java
public static int random(int min, int max)
```

## meteordevelopment.meteorclient.utils.Utils.random

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/Utils.java:479`

```java
public static double random(double min, double max)
```

## meteordevelopment.meteorclient.utils.Utils.leftClick

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/Utils.java:483`

```java
public static void leftClick()
```

## meteordevelopment.meteorclient.utils.Utils.rightClick

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/Utils.java:497`

```java
public static void rightClick()
```

## meteordevelopment.meteorclient.utils.Utils.isShulker

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/Utils.java:501`

```java
public static boolean isShulker(Item item)
```

## meteordevelopment.meteorclient.utils.Utils.contains

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/Utils.java:505`

```java
public static <T> boolean contains(ColorCollection<T> collection, T value)
```

## meteordevelopment.meteorclient.utils.Utils.isThrowable

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/Utils.java:524`

```java
public static boolean isThrowable(Item item)
```

## meteordevelopment.meteorclient.utils.Utils.addEnchantment

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/Utils.java:528`

```java
public static void addEnchantment(ItemStack itemStack, Holder<Enchantment> enchantment, int level)
```

## meteordevelopment.meteorclient.utils.Utils.clearEnchantments

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/Utils.java:535`

```java
public static void clearEnchantments(ItemStack itemStack)
```

## meteordevelopment.meteorclient.utils.Utils.removeEnchantment

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/Utils.java:539`

```java
public static void removeEnchantment(ItemStack itemStack, Enchantment enchantment)
```

## meteordevelopment.meteorclient.utils.Utils.lerp

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/Utils.java:543`

```java
public static Color lerp(Color first, Color second, @Range(from = 0, to = 1) float v)
```

## meteordevelopment.meteorclient.utils.Utils.isLoading

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/Utils.java:551`

```java
public static boolean isLoading()
```

## meteordevelopment.meteorclient.utils.Utils.parsePort

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/Utils.java:556`

```java
public static int parsePort(String full)
```

## meteordevelopment.meteorclient.utils.Utils.parseAddress

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/Utils.java:570`

```java
public static String parseAddress(String full)
```

## meteordevelopment.meteorclient.utils.Utils.resolveAddress

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/Utils.java:575`

```java
public static boolean resolveAddress(String address)
```

## meteordevelopment.meteorclient.utils.Utils.resolveAddress

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/Utils.java:585`

```java
public static boolean resolveAddress(String address, int port)
```

## meteordevelopment.meteorclient.utils.Utils.set

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/Utils.java:591`

```java
public static Vector3d set(Vector3d vec, Vec3 v)
```

## meteordevelopment.meteorclient.utils.Utils.set

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/Utils.java:599`

```java
public static Vector3d set(Vector3d vec, Entity entity, double tickDelta)
```

## meteordevelopment.meteorclient.utils.Utils.nameFilter

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/Utils.java:609`

```java
public static boolean nameFilter(String text, char character)
```

## meteordevelopment.meteorclient.utils.Utils.fileNameFilter

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/Utils.java:613`

```java
public static boolean fileNameFilter(String text, char character)
```

## meteordevelopment.meteorclient.utils.Utils.ipFilter

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/Utils.java:617`

```java
public static boolean ipFilter(String text, char character)
```
