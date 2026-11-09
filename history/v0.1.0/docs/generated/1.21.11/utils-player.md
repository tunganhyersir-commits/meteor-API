# utils/player

Khai báo Java có cú pháp public/protected. Không bao gồm API kế thừa/tổng hợp bởi compiler; xem kiểm tra bytecode riêng.

## meteordevelopment.meteorclient.utils.player.ChatUtils

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/ChatUtils.java:27`

```java
public class ChatUtils
```

## meteordevelopment.meteorclient.utils.player.ChatUtils.init

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/ChatUtils.java:36`

```java
@PostInit public static void init()
```

## meteordevelopment.meteorclient.utils.player.ChatUtils.getMeteorPrefix

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/ChatUtils.java:45`

```java
public static Text getMeteorPrefix()
```

## meteordevelopment.meteorclient.utils.player.ChatUtils.registerCustomPrefix

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/ChatUtils.java:52`

```java
@SuppressWarnings("unused") public static void registerCustomPrefix(String packageName, Supplier<Text> supplier)
```

## meteordevelopment.meteorclient.utils.player.ChatUtils.unregisterCustomPrefix

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/ChatUtils.java:67`

```java
@SuppressWarnings("unused") public static void unregisterCustomPrefix(String packageName)
```

## meteordevelopment.meteorclient.utils.player.ChatUtils.forceNextPrefixClass

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/ChatUtils.java:72`

```java
public static void forceNextPrefixClass(Class<?> klass)
```

## meteordevelopment.meteorclient.utils.player.ChatUtils.sendPlayerMsg

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/ChatUtils.java:81`

```java
public static void sendPlayerMsg(String message)
```

## meteordevelopment.meteorclient.utils.player.ChatUtils.sendPlayerMsg

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/ChatUtils.java:88`

```java
public static void sendPlayerMsg(String message, boolean addToHistory)
```

## meteordevelopment.meteorclient.utils.player.ChatUtils.info

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/ChatUtils.java:97`

```java
public static void info(String message, Object... args)
```

## meteordevelopment.meteorclient.utils.player.ChatUtils.infoPrefix

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/ChatUtils.java:101`

```java
public static void infoPrefix(String prefix, String message, Object... args)
```

## meteordevelopment.meteorclient.utils.player.ChatUtils.warning

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/ChatUtils.java:107`

```java
public static void warning(String message, Object... args)
```

## meteordevelopment.meteorclient.utils.player.ChatUtils.warningPrefix

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/ChatUtils.java:111`

```java
public static void warningPrefix(String prefix, String message, Object... args)
```

## meteordevelopment.meteorclient.utils.player.ChatUtils.error

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/ChatUtils.java:117`

```java
public static void error(String message, Object... args)
```

## meteordevelopment.meteorclient.utils.player.ChatUtils.errorPrefix

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/ChatUtils.java:121`

```java
public static void errorPrefix(String prefix, String message, Object... args)
```

## meteordevelopment.meteorclient.utils.player.ChatUtils.sendMsg

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/ChatUtils.java:127`

```java
public static void sendMsg(Text message)
```

## meteordevelopment.meteorclient.utils.player.ChatUtils.sendMsg

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/ChatUtils.java:131`

```java
public static void sendMsg(String prefix, Text message)
```

## meteordevelopment.meteorclient.utils.player.ChatUtils.sendMsg

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/ChatUtils.java:135`

```java
public static void sendMsg(Formatting color, String message, Object... args)
```

## meteordevelopment.meteorclient.utils.player.ChatUtils.sendMsg

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/ChatUtils.java:139`

```java
public static void sendMsg(int id, Formatting color, String message, Object... args)
```

## meteordevelopment.meteorclient.utils.player.ChatUtils.sendMsg

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/ChatUtils.java:143`

```java
public static void sendMsg(int id, @Nullable String prefixTitle, @Nullable Formatting prefixColor, Formatting messageColor, String messageContent, Object... args)
```

## meteordevelopment.meteorclient.utils.player.ChatUtils.sendMsg

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/ChatUtils.java:148`

```java
public static void sendMsg(int id, @Nullable String prefixTitle, @Nullable Formatting prefixColor, String messageContent, Formatting messageColor)
```

## meteordevelopment.meteorclient.utils.player.ChatUtils.sendMsg

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/ChatUtils.java:153`

```java
public static void sendMsg(int id, @Nullable String prefixTitle, @Nullable Formatting prefixColor, Text msg)
```

## meteordevelopment.meteorclient.utils.player.ChatUtils.formatCoords

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/ChatUtils.java:264`

```java
public static MutableText formatCoords(Vec3d pos)
```

## meteordevelopment.meteorclient.utils.player.CustomPlayerInput

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/CustomPlayerInput.java:12`

```java
public class CustomPlayerInput extends Input
```

## meteordevelopment.meteorclient.utils.player.CustomPlayerInput.tick

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/CustomPlayerInput.java:13`

```java
@Override public void tick()
```

## meteordevelopment.meteorclient.utils.player.CustomPlayerInput.stop

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/CustomPlayerInput.java:20`

```java
public void stop()
```

## meteordevelopment.meteorclient.utils.player.CustomPlayerInput.forward

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/CustomPlayerInput.java:24`

```java
public void forward(boolean bool)
```

## meteordevelopment.meteorclient.utils.player.CustomPlayerInput.backward

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/CustomPlayerInput.java:36`

```java
public void backward(boolean bool)
```

## meteordevelopment.meteorclient.utils.player.CustomPlayerInput.left

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/CustomPlayerInput.java:48`

```java
public void left(boolean bool)
```

## meteordevelopment.meteorclient.utils.player.CustomPlayerInput.right

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/CustomPlayerInput.java:60`

```java
public void right(boolean bool)
```

## meteordevelopment.meteorclient.utils.player.CustomPlayerInput.jump

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/CustomPlayerInput.java:72`

```java
public void jump(boolean bool)
```

## meteordevelopment.meteorclient.utils.player.CustomPlayerInput.sneak

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/CustomPlayerInput.java:84`

```java
public void sneak(boolean bool)
```

## meteordevelopment.meteorclient.utils.player.CustomPlayerInput.sprint

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/CustomPlayerInput.java:96`

```java
public void sprint(boolean bool)
```

## meteordevelopment.meteorclient.utils.player.EChestMemory

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/EChestMemory.java:23`

```java
public class EChestMemory
```

## meteordevelopment.meteorclient.utils.player.EChestMemory.ITEMS

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/EChestMemory.java:24`

```java
public static final DefaultedList<ItemStack> ITEMS = DefaultedList.ofSize(27, ItemStack.EMPTY)
```

## meteordevelopment.meteorclient.utils.player.EChestMemory.init

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/EChestMemory.java:31`

```java
@PreInit public static void init()
```

## meteordevelopment.meteorclient.utils.player.EChestMemory.isKnown

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/EChestMemory.java:68`

```java
public static boolean isKnown()
```

## meteordevelopment.meteorclient.utils.player.FindItemResult

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/FindItemResult.java:16`

```java
public record FindItemResult(int slot, int count)
```

## meteordevelopment.meteorclient.utils.player.FindItemResult.found

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/FindItemResult.java:17`

```java
public boolean found()
```

## meteordevelopment.meteorclient.utils.player.FindItemResult.getHand

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/FindItemResult.java:21`

```java
public Hand getHand()
```

## meteordevelopment.meteorclient.utils.player.FindItemResult.isMainHand

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/FindItemResult.java:27`

```java
public boolean isMainHand()
```

## meteordevelopment.meteorclient.utils.player.FindItemResult.isOffhand

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/FindItemResult.java:31`

```java
public boolean isOffhand()
```

## meteordevelopment.meteorclient.utils.player.FindItemResult.isHotbar

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/FindItemResult.java:35`

```java
public boolean isHotbar()
```

## meteordevelopment.meteorclient.utils.player.FindItemResult.isMain

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/FindItemResult.java:39`

```java
public boolean isMain()
```

## meteordevelopment.meteorclient.utils.player.FindItemResult.isArmor

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/FindItemResult.java:43`

```java
public boolean isArmor()
```

## meteordevelopment.meteorclient.utils.player.InvUtils

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/InvUtils.java:25`

```java
public class InvUtils
```

## meteordevelopment.meteorclient.utils.player.InvUtils.previousSlot

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/InvUtils.java:27`

```java
public static int previousSlot = -1
```

## meteordevelopment.meteorclient.utils.player.InvUtils.testInMainHand

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/InvUtils.java:34`

```java
public static boolean testInMainHand(Predicate<ItemStack> predicate)
```

## meteordevelopment.meteorclient.utils.player.InvUtils.testInMainHand

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/InvUtils.java:38`

```java
public static boolean testInMainHand(Item... items)
```

## meteordevelopment.meteorclient.utils.player.InvUtils.testInOffHand

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/InvUtils.java:45`

```java
public static boolean testInOffHand(Predicate<ItemStack> predicate)
```

## meteordevelopment.meteorclient.utils.player.InvUtils.testInOffHand

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/InvUtils.java:49`

```java
public static boolean testInOffHand(Item... items)
```

## meteordevelopment.meteorclient.utils.player.InvUtils.testInHands

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/InvUtils.java:56`

```java
public static boolean testInHands(Predicate<ItemStack> predicate)
```

## meteordevelopment.meteorclient.utils.player.InvUtils.testInHands

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/InvUtils.java:60`

```java
public static boolean testInHands(Item... items)
```

## meteordevelopment.meteorclient.utils.player.InvUtils.testInHotbar

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/InvUtils.java:64`

```java
public static boolean testInHotbar(Predicate<ItemStack> predicate)
```

## meteordevelopment.meteorclient.utils.player.InvUtils.testInHotbar

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/InvUtils.java:75`

```java
public static boolean testInHotbar(Item... items)
```

## meteordevelopment.meteorclient.utils.player.InvUtils.findEmpty

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/InvUtils.java:84`

```java
public static FindItemResult findEmpty()
```

## meteordevelopment.meteorclient.utils.player.InvUtils.findInHotbar

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/InvUtils.java:88`

```java
public static FindItemResult findInHotbar(Item... items)
```

## meteordevelopment.meteorclient.utils.player.InvUtils.findInHotbar

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/InvUtils.java:97`

```java
public static FindItemResult findInHotbar(Predicate<ItemStack> isGood)
```

## meteordevelopment.meteorclient.utils.player.InvUtils.find

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/InvUtils.java:109`

```java
public static FindItemResult find(Item... items)
```

## meteordevelopment.meteorclient.utils.player.InvUtils.find

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/InvUtils.java:118`

```java
public static FindItemResult find(Predicate<ItemStack> isGood)
```

## meteordevelopment.meteorclient.utils.player.InvUtils.find

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/InvUtils.java:123`

```java
public static FindItemResult find(Predicate<ItemStack> isGood, int start, int end)
```

## meteordevelopment.meteorclient.utils.player.InvUtils.findFastestTool

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/InvUtils.java:140`

```java
public static FindItemResult findFastestTool(BlockState state)
```

## meteordevelopment.meteorclient.utils.player.InvUtils.swap

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/InvUtils.java:160`

```java
public static boolean swap(int slot, boolean swapBack)
```

## meteordevelopment.meteorclient.utils.player.InvUtils.swapBack

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/InvUtils.java:171`

```java
public static boolean swapBack()
```

## meteordevelopment.meteorclient.utils.player.InvUtils.move

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/InvUtils.java:179`

```java
public static Action move()
```

## meteordevelopment.meteorclient.utils.player.InvUtils.click

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/InvUtils.java:185`

```java
public static Action click()
```

## meteordevelopment.meteorclient.utils.player.InvUtils.quickSwap

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/InvUtils.java:194`

```java
public static Action quickSwap()
```

## meteordevelopment.meteorclient.utils.player.InvUtils.shiftClick

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/InvUtils.java:199`

```java
public static Action shiftClick()
```

## meteordevelopment.meteorclient.utils.player.InvUtils.drop

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/InvUtils.java:204`

```java
public static Action drop()
```

## meteordevelopment.meteorclient.utils.player.InvUtils.dropOne

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/InvUtils.java:210`

```java
public static Action dropOne()
```

## meteordevelopment.meteorclient.utils.player.InvUtils.dropHand

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/InvUtils.java:216`

```java
public static void dropHand()
```

## meteordevelopment.meteorclient.utils.player.InvUtils.Action

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/InvUtils.java:220`

```java
public static class Action
```

## meteordevelopment.meteorclient.utils.player.InvUtils.Action.fromId

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/InvUtils.java:234`

```java
public Action fromId(int id)
```

## meteordevelopment.meteorclient.utils.player.InvUtils.Action.from

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/InvUtils.java:242`

```java
public Action from(int index)
```

## meteordevelopment.meteorclient.utils.player.InvUtils.Action.fromHotbar

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/InvUtils.java:246`

```java
public Action fromHotbar(@Range(from = 0, to = 8) int i)
```

## meteordevelopment.meteorclient.utils.player.InvUtils.Action.fromOffhand

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/InvUtils.java:250`

```java
public Action fromOffhand()
```

## meteordevelopment.meteorclient.utils.player.InvUtils.Action.fromMain

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/InvUtils.java:254`

```java
public Action fromMain(@Range(from = 0, to = 26) int i)
```

## meteordevelopment.meteorclient.utils.player.InvUtils.Action.fromArmor

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/InvUtils.java:261`

```java
public Action fromArmor(int i)
```

## meteordevelopment.meteorclient.utils.player.InvUtils.Action.toId

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/InvUtils.java:267`

```java
public void toId(int id)
```

## meteordevelopment.meteorclient.utils.player.InvUtils.Action.to

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/InvUtils.java:275`

```java
public void to(int index)
```

## meteordevelopment.meteorclient.utils.player.InvUtils.Action.toHotbar

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/InvUtils.java:279`

```java
public void toHotbar(@Range(from = 0, to = 8) int i)
```

## meteordevelopment.meteorclient.utils.player.InvUtils.Action.toOffhand

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/InvUtils.java:283`

```java
public void toOffhand()
```

## meteordevelopment.meteorclient.utils.player.InvUtils.Action.toMain

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/InvUtils.java:287`

```java
public void toMain(@Range(from = 0, to = 26) int i)
```

## meteordevelopment.meteorclient.utils.player.InvUtils.Action.toArmor

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/InvUtils.java:294`

```java
public void toArmor(int i)
```

## meteordevelopment.meteorclient.utils.player.InvUtils.Action.slotId

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/InvUtils.java:300`

```java
public void slotId(int id)
```

## meteordevelopment.meteorclient.utils.player.InvUtils.Action.slot

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/InvUtils.java:308`

```java
public void slot(int index)
```

## meteordevelopment.meteorclient.utils.player.InvUtils.Action.slotHotbar

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/InvUtils.java:312`

```java
public void slotHotbar(@Range(from = 0, to = 8) int i)
```

## meteordevelopment.meteorclient.utils.player.InvUtils.Action.slotOffhand

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/InvUtils.java:316`

```java
public void slotOffhand()
```

## meteordevelopment.meteorclient.utils.player.InvUtils.Action.slotMain

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/InvUtils.java:320`

```java
public void slotMain(@Range(from = 0, to = 26) int i)
```

## meteordevelopment.meteorclient.utils.player.InvUtils.Action.slotArmor

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/InvUtils.java:327`

```java
public void slotArmor(int i)
```

## meteordevelopment.meteorclient.utils.player.InventorySorter

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/InventorySorter.java:25`

```java
public class InventorySorter
```

## meteordevelopment.meteorclient.utils.player.InventorySorter.InventorySorter

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/InventorySorter.java:33`

```java
public InventorySorter(HandledScreen<?> screen, Slot originSlot)
```

## meteordevelopment.meteorclient.utils.player.InventorySorter.tick

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/InventorySorter.java:46`

```java
public boolean tick(int delay)
```

## meteordevelopment.meteorclient.utils.player.PathFinder

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/PathFinder.java:23`

```java
public class PathFinder
```

## meteordevelopment.meteorclient.utils.player.PathFinder.getNextPathBlock

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/PathFinder.java:30`

```java
public PathBlock getNextPathBlock()
```

## meteordevelopment.meteorclient.utils.player.PathFinder.getDrop

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/PathFinder.java:44`

```java
public int getDrop(BlockPos pos)
```

## meteordevelopment.meteorclient.utils.player.PathFinder.isAirAbove

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/PathFinder.java:53`

```java
public boolean isAirAbove(BlockPos blockPos)
```

## meteordevelopment.meteorclient.utils.player.PathFinder.getNextStraightPos

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/PathFinder.java:59`

```java
public Vec3d getNextStraightPos()
```

## meteordevelopment.meteorclient.utils.player.PathFinder.getYawToTarget

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/PathFinder.java:69`

```java
public int getYawToTarget()
```

## meteordevelopment.meteorclient.utils.player.PathFinder.getDirection

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/PathFinder.java:84`

```java
public int getDirection()
```

## meteordevelopment.meteorclient.utils.player.PathFinder.getBlockStateAtPos

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/PathFinder.java:99`

```java
public BlockState getBlockStateAtPos(BlockPos pos)
```

## meteordevelopment.meteorclient.utils.player.PathFinder.getBlockStateAtPos

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/PathFinder.java:105`

```java
public BlockState getBlockStateAtPos(int x, int y, int z)
```

## meteordevelopment.meteorclient.utils.player.PathFinder.getBlockAtPos

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/PathFinder.java:111`

```java
public Block getBlockAtPos(BlockPos pos)
```

## meteordevelopment.meteorclient.utils.player.PathFinder.isSolidFloor

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/PathFinder.java:117`

```java
public boolean isSolidFloor(BlockPos blockPos)
```

## meteordevelopment.meteorclient.utils.player.PathFinder.isAir

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/PathFinder.java:121`

```java
public boolean isAir(Block block)
```

## meteordevelopment.meteorclient.utils.player.PathFinder.isWater

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/PathFinder.java:125`

```java
public boolean isWater(Block block)
```

## meteordevelopment.meteorclient.utils.player.PathFinder.lookAtDestination

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/PathFinder.java:129`

```java
public void lookAtDestination(PathBlock pathBlock)
```

## meteordevelopment.meteorclient.utils.player.PathFinder.initiate

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/PathFinder.java:154`

```java
public void initiate(Entity entity)
```

## meteordevelopment.meteorclient.utils.player.PathFinder.disable

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/PathFinder.java:160`

```java
public void disable()
```

## meteordevelopment.meteorclient.utils.player.PathFinder.PathBlock

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/PathFinder.java:167`

```java
public class PathBlock
```

## meteordevelopment.meteorclient.utils.player.PathFinder.PathBlock.block

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/PathFinder.java:168`

```java
public final Block block
```

## meteordevelopment.meteorclient.utils.player.PathFinder.PathBlock.blockPos

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/PathFinder.java:169`

```java
public final BlockPos blockPos
```

## meteordevelopment.meteorclient.utils.player.PathFinder.PathBlock.blockState

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/PathFinder.java:170`

```java
public final BlockState blockState
```

## meteordevelopment.meteorclient.utils.player.PathFinder.PathBlock.yaw

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/PathFinder.java:171`

```java
public double yaw
```

## meteordevelopment.meteorclient.utils.player.PathFinder.PathBlock.PathBlock

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/PathFinder.java:173`

```java
public PathBlock(Block b, BlockPos pos, BlockState state)
```

## meteordevelopment.meteorclient.utils.player.PathFinder.PathBlock.PathBlock

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/PathFinder.java:179`

```java
public PathBlock(Block b, BlockPos pos)
```

## meteordevelopment.meteorclient.utils.player.PathFinder.PathBlock.PathBlock

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/PathFinder.java:185`

```java
public PathBlock(BlockPos pos)
```

## meteordevelopment.meteorclient.utils.player.PlayerUtils

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/PlayerUtils.java:42`

```java
public class PlayerUtils
```

## meteordevelopment.meteorclient.utils.player.PlayerUtils.getPlayerColor

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/PlayerUtils.java:51`

```java
public static Color getPlayerColor(PlayerEntity entity, Color defaultColor)
```

## meteordevelopment.meteorclient.utils.player.PlayerUtils.getHorizontalVelocity

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/PlayerUtils.java:63`

```java
public static Vec3d getHorizontalVelocity(double bps)
```

## meteordevelopment.meteorclient.utils.player.PlayerUtils.centerPlayer

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/PlayerUtils.java:108`

```java
public static void centerPlayer()
```

## meteordevelopment.meteorclient.utils.player.PlayerUtils.canSeeEntity

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/PlayerUtils.java:115`

```java
@SuppressWarnings("DataFlowIssue") public static boolean canSeeEntity(Entity entity)
```

## meteordevelopment.meteorclient.utils.player.PlayerUtils.calculateAngle

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/PlayerUtils.java:130`

```java
public static float[] calculateAngle(Vec3d target)
```

## meteordevelopment.meteorclient.utils.player.PlayerUtils.shouldPause

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/PlayerUtils.java:142`

```java
public static boolean shouldPause(boolean ifBreaking, boolean ifEating, boolean ifDrinking)
```

## meteordevelopment.meteorclient.utils.player.PlayerUtils.isMoving

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/PlayerUtils.java:148`

```java
public static boolean isMoving()
```

## meteordevelopment.meteorclient.utils.player.PlayerUtils.isSprinting

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/PlayerUtils.java:152`

```java
public static boolean isSprinting()
```

## meteordevelopment.meteorclient.utils.player.PlayerUtils.isInHole

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/PlayerUtils.java:156`

```java
public static boolean isInHole(boolean doubles)
```

## meteordevelopment.meteorclient.utils.player.PlayerUtils.possibleHealthReductions

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/PlayerUtils.java:187`

```java
public static float possibleHealthReductions()
```

## meteordevelopment.meteorclient.utils.player.PlayerUtils.possibleHealthReductions

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/PlayerUtils.java:191`

```java
public static float possibleHealthReductions(boolean entities, boolean fall)
```

## meteordevelopment.meteorclient.utils.player.PlayerUtils.distance

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/PlayerUtils.java:236`

```java
public static double distance(double x1, double y1, double z1, double x2, double y2, double z2)
```

## meteordevelopment.meteorclient.utils.player.PlayerUtils.distanceTo

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/PlayerUtils.java:240`

```java
public static double distanceTo(Entity entity)
```

## meteordevelopment.meteorclient.utils.player.PlayerUtils.distanceTo

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/PlayerUtils.java:244`

```java
public static double distanceTo(BlockPos blockPos)
```

## meteordevelopment.meteorclient.utils.player.PlayerUtils.distanceTo

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/PlayerUtils.java:248`

```java
public static double distanceTo(Vec3d vec3d)
```

## meteordevelopment.meteorclient.utils.player.PlayerUtils.distanceTo

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/PlayerUtils.java:252`

```java
public static double distanceTo(double x, double y, double z)
```

## meteordevelopment.meteorclient.utils.player.PlayerUtils.squaredDistanceTo

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/PlayerUtils.java:256`

```java
public static double squaredDistanceTo(Entity entity)
```

## meteordevelopment.meteorclient.utils.player.PlayerUtils.squaredDistanceTo

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/PlayerUtils.java:260`

```java
public static double squaredDistanceTo(BlockPos blockPos)
```

## meteordevelopment.meteorclient.utils.player.PlayerUtils.squaredDistanceTo

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/PlayerUtils.java:264`

```java
public static double squaredDistanceTo(double x, double y, double z)
```

## meteordevelopment.meteorclient.utils.player.PlayerUtils.squaredDistance

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/PlayerUtils.java:268`

```java
public static double squaredDistance(double x1, double y1, double z1, double x2, double y2, double z2)
```

## meteordevelopment.meteorclient.utils.player.PlayerUtils.isWithin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/PlayerUtils.java:275`

```java
public static boolean isWithin(Entity entity, double r)
```

## meteordevelopment.meteorclient.utils.player.PlayerUtils.isWithin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/PlayerUtils.java:279`

```java
public static boolean isWithin(Vec3d vec3d, double r)
```

## meteordevelopment.meteorclient.utils.player.PlayerUtils.isWithin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/PlayerUtils.java:283`

```java
public static boolean isWithin(BlockPos blockPos, double r)
```

## meteordevelopment.meteorclient.utils.player.PlayerUtils.isWithin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/PlayerUtils.java:287`

```java
public static boolean isWithin(double x, double y, double z, double r)
```

## meteordevelopment.meteorclient.utils.player.PlayerUtils.distanceToCamera

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/PlayerUtils.java:291`

```java
public static double distanceToCamera(double x, double y, double z)
```

## meteordevelopment.meteorclient.utils.player.PlayerUtils.distanceToCamera

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/PlayerUtils.java:295`

```java
public static double distanceToCamera(Entity entity)
```

## meteordevelopment.meteorclient.utils.player.PlayerUtils.squaredDistanceToCamera

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/PlayerUtils.java:299`

```java
public static double squaredDistanceToCamera(double x, double y, double z)
```

## meteordevelopment.meteorclient.utils.player.PlayerUtils.squaredDistanceToCamera

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/PlayerUtils.java:304`

```java
public static double squaredDistanceToCamera(Entity entity)
```

## meteordevelopment.meteorclient.utils.player.PlayerUtils.isWithinCamera

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/PlayerUtils.java:308`

```java
public static boolean isWithinCamera(Entity entity, double r)
```

## meteordevelopment.meteorclient.utils.player.PlayerUtils.isWithinCamera

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/PlayerUtils.java:312`

```java
public static boolean isWithinCamera(Vec3d vec3d, double r)
```

## meteordevelopment.meteorclient.utils.player.PlayerUtils.isWithinCamera

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/PlayerUtils.java:316`

```java
public static boolean isWithinCamera(BlockPos blockPos, double r)
```

## meteordevelopment.meteorclient.utils.player.PlayerUtils.isWithinCamera

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/PlayerUtils.java:320`

```java
public static boolean isWithinCamera(double x, double y, double z, double r)
```

## meteordevelopment.meteorclient.utils.player.PlayerUtils.isWithinReach

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/PlayerUtils.java:324`

```java
public static boolean isWithinReach(Entity entity)
```

## meteordevelopment.meteorclient.utils.player.PlayerUtils.isWithinReach

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/PlayerUtils.java:328`

```java
public static boolean isWithinReach(Vec3d vec3d)
```

## meteordevelopment.meteorclient.utils.player.PlayerUtils.isWithinReach

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/PlayerUtils.java:332`

```java
public static boolean isWithinReach(BlockPos blockPos)
```

## meteordevelopment.meteorclient.utils.player.PlayerUtils.isWithinReach

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/PlayerUtils.java:336`

```java
public static boolean isWithinReach(double x, double y, double z)
```

## meteordevelopment.meteorclient.utils.player.PlayerUtils.getDimension

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/PlayerUtils.java:340`

```java
public static Dimension getDimension()
```

## meteordevelopment.meteorclient.utils.player.PlayerUtils.getGameMode

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/PlayerUtils.java:350`

```java
public static GameMode getGameMode()
```

## meteordevelopment.meteorclient.utils.player.PlayerUtils.getTotalHealth

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/PlayerUtils.java:357`

```java
public static float getTotalHealth()
```

## meteordevelopment.meteorclient.utils.player.PlayerUtils.isAlive

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/PlayerUtils.java:361`

```java
public static boolean isAlive()
```

## meteordevelopment.meteorclient.utils.player.PlayerUtils.getPing

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/PlayerUtils.java:365`

```java
public static int getPing()
```

## meteordevelopment.meteorclient.utils.player.Rotations

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/Rotations.java:27`

```java
public class Rotations
```

## meteordevelopment.meteorclient.utils.player.Rotations.serverYaw

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/Rotations.java:30`

```java
public static float serverYaw
```

## meteordevelopment.meteorclient.utils.player.Rotations.serverPitch

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/Rotations.java:31`

```java
public static float serverPitch
```

## meteordevelopment.meteorclient.utils.player.Rotations.rotationTimer

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/Rotations.java:32`

```java
public static int rotationTimer
```

## meteordevelopment.meteorclient.utils.player.Rotations.rotating

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/Rotations.java:39`

```java
public static boolean rotating = false
```

## meteordevelopment.meteorclient.utils.player.Rotations.init

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/Rotations.java:44`

```java
@PreInit public static void init()
```

## meteordevelopment.meteorclient.utils.player.Rotations.rotate

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/Rotations.java:49`

```java
public static void rotate(double yaw, double pitch, int priority, boolean clientSide, Runnable callback)
```

## meteordevelopment.meteorclient.utils.player.Rotations.rotate

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/Rotations.java:61`

```java
public static void rotate(double yaw, double pitch, int priority, Runnable callback)
```

## meteordevelopment.meteorclient.utils.player.Rotations.rotate

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/Rotations.java:65`

```java
public static void rotate(double yaw, double pitch, Runnable callback)
```

## meteordevelopment.meteorclient.utils.player.Rotations.rotate

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/Rotations.java:69`

```java
public static void rotate(double yaw, double pitch, int priority)
```

## meteordevelopment.meteorclient.utils.player.Rotations.rotate

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/Rotations.java:73`

```java
public static void rotate(double yaw, double pitch)
```

## meteordevelopment.meteorclient.utils.player.Rotations.getYaw

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/Rotations.java:167`

```java
public static double getYaw(Entity entity)
```

## meteordevelopment.meteorclient.utils.player.Rotations.getYaw

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/Rotations.java:171`

```java
public static double getYaw(Vec3d pos)
```

## meteordevelopment.meteorclient.utils.player.Rotations.getPitch

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/Rotations.java:175`

```java
public static double getPitch(Vec3d pos)
```

## meteordevelopment.meteorclient.utils.player.Rotations.getPitch

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/Rotations.java:185`

```java
public static double getPitch(Entity entity, Target target)
```

## meteordevelopment.meteorclient.utils.player.Rotations.getPitch

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/Rotations.java:200`

```java
public static double getPitch(Entity entity)
```

## meteordevelopment.meteorclient.utils.player.Rotations.getYaw

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/Rotations.java:204`

```java
public static double getYaw(BlockPos pos)
```

## meteordevelopment.meteorclient.utils.player.Rotations.getPitch

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/Rotations.java:208`

```java
public static double getPitch(BlockPos pos)
```

## meteordevelopment.meteorclient.utils.player.Rotations.setCamRotation

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/Rotations.java:218`

```java
public static void setCamRotation(double yaw, double pitch)
```

## meteordevelopment.meteorclient.utils.player.Safety

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/Safety.java:8`

```java
public enum Safety
```

## meteordevelopment.meteorclient.utils.player.SlotUtils

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/SlotUtils.java:28`

```java
public class SlotUtils
```

## meteordevelopment.meteorclient.utils.player.SlotUtils.HOTBAR_START

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/SlotUtils.java:37`

```java
public static final int HOTBAR_START = 0
```

## meteordevelopment.meteorclient.utils.player.SlotUtils.HOTBAR_END

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/SlotUtils.java:38`

```java
public static final int HOTBAR_END = 8
```

## meteordevelopment.meteorclient.utils.player.SlotUtils.MAIN_START

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/SlotUtils.java:39`

```java
public static final int MAIN_START = 9
```

## meteordevelopment.meteorclient.utils.player.SlotUtils.MAIN_END

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/SlotUtils.java:40`

```java
public static final int MAIN_END = 35
```

## meteordevelopment.meteorclient.utils.player.SlotUtils.ARMOR_START

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/SlotUtils.java:41`

```java
public static final int ARMOR_START = 36
```

## meteordevelopment.meteorclient.utils.player.SlotUtils.ARMOR_END

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/SlotUtils.java:42`

```java
public static final int ARMOR_END = 39
```

## meteordevelopment.meteorclient.utils.player.SlotUtils.OFFHAND

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/SlotUtils.java:43`

```java
public static final int OFFHAND = 40
```

## meteordevelopment.meteorclient.utils.player.SlotUtils.indexToId

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/SlotUtils.java:58`

```java
public static int indexToId(int i)
```

## meteordevelopment.meteorclient.utils.player.SlotUtils.isHotbar

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/SlotUtils.java:224`

```java
public static boolean isHotbar(int slotIndex)
```

## meteordevelopment.meteorclient.utils.player.SlotUtils.isMain

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/SlotUtils.java:228`

```java
public static boolean isMain(int slotIndex)
```

## meteordevelopment.meteorclient.utils.player.SlotUtils.isArmor

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/SlotUtils.java:232`

```java
public static boolean isArmor(int slotIndex)
```

## meteordevelopment.meteorclient.utils.player.TitleScreenCredits

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/TitleScreenCredits.java:31`

```java
public class TitleScreenCredits
```

## meteordevelopment.meteorclient.utils.player.TitleScreenCredits.render

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/TitleScreenCredits.java:99`

```java
public static void render(DrawContext context)
```

## meteordevelopment.meteorclient.utils.player.TitleScreenCredits.onClicked

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/TitleScreenCredits.java:114`

```java
public static boolean onClicked(double mouseX, double mouseY)
```
