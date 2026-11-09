# utils/player

Khai báo Java có cú pháp public/protected. Không bao gồm API kế thừa/tổng hợp bởi compiler; xem kiểm tra bytecode riêng.

## meteordevelopment.meteorclient.utils.player.ChatUtils

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/ChatUtils.java:25`

```java
public class ChatUtils
```

## meteordevelopment.meteorclient.utils.player.ChatUtils.init

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/ChatUtils.java:34`

```java
@PostInit public static void init()
```

## meteordevelopment.meteorclient.utils.player.ChatUtils.getMeteorPrefix

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/ChatUtils.java:43`

```java
public static Component getMeteorPrefix()
```

## meteordevelopment.meteorclient.utils.player.ChatUtils.registerCustomPrefix

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/ChatUtils.java:50`

```java
@SuppressWarnings("unused") public static void registerCustomPrefix(String packageName, Supplier<Component> supplier)
```

## meteordevelopment.meteorclient.utils.player.ChatUtils.unregisterCustomPrefix

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/ChatUtils.java:58`

```java
@SuppressWarnings("unused") public static void unregisterCustomPrefix(String packageName)
```

## meteordevelopment.meteorclient.utils.player.ChatUtils.forceNextPrefixClass

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/ChatUtils.java:63`

```java
public static void forceNextPrefixClass(Class<?> klass)
```

## meteordevelopment.meteorclient.utils.player.ChatUtils.sendPlayerMsg

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/ChatUtils.java:72`

```java
public static void sendPlayerMsg(String message)
```

## meteordevelopment.meteorclient.utils.player.ChatUtils.sendPlayerMsg

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/ChatUtils.java:79`

```java
public static void sendPlayerMsg(String message, boolean addToHistory)
```

## meteordevelopment.meteorclient.utils.player.ChatUtils.info

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/ChatUtils.java:88`

```java
public static void info(String message, Object... args)
```

## meteordevelopment.meteorclient.utils.player.ChatUtils.infoPrefix

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/ChatUtils.java:92`

```java
public static void infoPrefix(String prefix, String message, Object... args)
```

## meteordevelopment.meteorclient.utils.player.ChatUtils.warning

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/ChatUtils.java:98`

```java
public static void warning(String message, Object... args)
```

## meteordevelopment.meteorclient.utils.player.ChatUtils.warningPrefix

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/ChatUtils.java:102`

```java
public static void warningPrefix(String prefix, String message, Object... args)
```

## meteordevelopment.meteorclient.utils.player.ChatUtils.error

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/ChatUtils.java:108`

```java
public static void error(String message, Object... args)
```

## meteordevelopment.meteorclient.utils.player.ChatUtils.errorPrefix

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/ChatUtils.java:112`

```java
public static void errorPrefix(String prefix, String message, Object... args)
```

## meteordevelopment.meteorclient.utils.player.ChatUtils.sendMsg

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/ChatUtils.java:118`

```java
public static void sendMsg(Component message)
```

## meteordevelopment.meteorclient.utils.player.ChatUtils.sendMsg

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/ChatUtils.java:122`

```java
public static void sendMsg(String prefix, Component message)
```

## meteordevelopment.meteorclient.utils.player.ChatUtils.sendMsg

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/ChatUtils.java:126`

```java
public static void sendMsg(ChatFormatting color, String message, Object... args)
```

## meteordevelopment.meteorclient.utils.player.ChatUtils.sendMsg

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/ChatUtils.java:130`

```java
public static void sendMsg(int id, ChatFormatting color, String message, Object... args)
```

## meteordevelopment.meteorclient.utils.player.ChatUtils.sendMsg

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/ChatUtils.java:134`

```java
public static void sendMsg(int id, @Nullable String prefixTitle, @Nullable ChatFormatting prefixColor, ChatFormatting messageColor, String messageContent, Object... args)
```

## meteordevelopment.meteorclient.utils.player.ChatUtils.sendMsg

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/ChatUtils.java:139`

```java
public static void sendMsg(int id, @Nullable String prefixTitle, @Nullable ChatFormatting prefixColor, String messageContent, ChatFormatting messageColor)
```

## meteordevelopment.meteorclient.utils.player.ChatUtils.sendMsg

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/ChatUtils.java:144`

```java
public static void sendMsg(int id, @Nullable String prefixTitle, @Nullable ChatFormatting prefixColor, Component msg)
```

## meteordevelopment.meteorclient.utils.player.ChatUtils.formatCoords

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/ChatUtils.java:255`

```java
public static MutableComponent formatCoords(Vec3 pos)
```

## meteordevelopment.meteorclient.utils.player.CustomPlayerInput

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/CustomPlayerInput.java:12`

```java
public class CustomPlayerInput extends ClientInput
```

## meteordevelopment.meteorclient.utils.player.CustomPlayerInput.tick

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/CustomPlayerInput.java:13`

```java
@Override public void tick()
```

## meteordevelopment.meteorclient.utils.player.CustomPlayerInput.stop

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/CustomPlayerInput.java:20`

```java
public void stop()
```

## meteordevelopment.meteorclient.utils.player.CustomPlayerInput.forward

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/CustomPlayerInput.java:24`

```java
public void forward(boolean bool)
```

## meteordevelopment.meteorclient.utils.player.CustomPlayerInput.backward

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/CustomPlayerInput.java:36`

```java
public void backward(boolean bool)
```

## meteordevelopment.meteorclient.utils.player.CustomPlayerInput.left

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/CustomPlayerInput.java:48`

```java
public void left(boolean bool)
```

## meteordevelopment.meteorclient.utils.player.CustomPlayerInput.right

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/CustomPlayerInput.java:60`

```java
public void right(boolean bool)
```

## meteordevelopment.meteorclient.utils.player.CustomPlayerInput.jump

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/CustomPlayerInput.java:72`

```java
public void jump(boolean bool)
```

## meteordevelopment.meteorclient.utils.player.CustomPlayerInput.sneak

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/CustomPlayerInput.java:84`

```java
public void sneak(boolean bool)
```

## meteordevelopment.meteorclient.utils.player.CustomPlayerInput.sprint

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/CustomPlayerInput.java:96`

```java
public void sprint(boolean bool)
```

## meteordevelopment.meteorclient.utils.player.EChestMemory

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/EChestMemory.java:23`

```java
public class EChestMemory
```

## meteordevelopment.meteorclient.utils.player.EChestMemory.ITEMS

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/EChestMemory.java:24`

```java
public static final NonNullList<ItemStack> ITEMS = NonNullList.withSize(27, ItemStack.EMPTY)
```

## meteordevelopment.meteorclient.utils.player.EChestMemory.init

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/EChestMemory.java:31`

```java
@PreInit public static void init()
```

## meteordevelopment.meteorclient.utils.player.EChestMemory.isKnown

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/EChestMemory.java:68`

```java
public static boolean isKnown()
```

## meteordevelopment.meteorclient.utils.player.FindItemResult

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/FindItemResult.java:16`

```java
public record FindItemResult(int slot, int count)
```

## meteordevelopment.meteorclient.utils.player.FindItemResult.found

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/FindItemResult.java:17`

```java
public boolean found()
```

## meteordevelopment.meteorclient.utils.player.FindItemResult.getHand

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/FindItemResult.java:21`

```java
public InteractionHand getHand()
```

## meteordevelopment.meteorclient.utils.player.FindItemResult.isMainHand

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/FindItemResult.java:27`

```java
public boolean isMainHand()
```

## meteordevelopment.meteorclient.utils.player.FindItemResult.isOffhand

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/FindItemResult.java:31`

```java
public boolean isOffhand()
```

## meteordevelopment.meteorclient.utils.player.FindItemResult.isHotbar

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/FindItemResult.java:35`

```java
public boolean isHotbar()
```

## meteordevelopment.meteorclient.utils.player.FindItemResult.isMain

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/FindItemResult.java:39`

```java
public boolean isMain()
```

## meteordevelopment.meteorclient.utils.player.FindItemResult.isArmor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/FindItemResult.java:43`

```java
public boolean isArmor()
```

## meteordevelopment.meteorclient.utils.player.InvUtils

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/InvUtils.java:25`

```java
public class InvUtils
```

## meteordevelopment.meteorclient.utils.player.InvUtils.previousSlot

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/InvUtils.java:27`

```java
public static int previousSlot = -1
```

## meteordevelopment.meteorclient.utils.player.InvUtils.testInMainHand

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/InvUtils.java:41`

```java
public static boolean testInMainHand(Predicate<ItemStack> predicate)
```

## meteordevelopment.meteorclient.utils.player.InvUtils.testInMainHand

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/InvUtils.java:45`

```java
public static boolean testInMainHand(Item... items)
```

## meteordevelopment.meteorclient.utils.player.InvUtils.testInOffHand

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/InvUtils.java:49`

```java
public static boolean testInOffHand(Predicate<ItemStack> predicate)
```

## meteordevelopment.meteorclient.utils.player.InvUtils.testInOffHand

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/InvUtils.java:53`

```java
public static boolean testInOffHand(Item... items)
```

## meteordevelopment.meteorclient.utils.player.InvUtils.testInHands

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/InvUtils.java:57`

```java
public static boolean testInHands(Predicate<ItemStack> predicate)
```

## meteordevelopment.meteorclient.utils.player.InvUtils.testInHands

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/InvUtils.java:61`

```java
public static boolean testInHands(Item... items)
```

## meteordevelopment.meteorclient.utils.player.InvUtils.testInHotbar

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/InvUtils.java:65`

```java
public static boolean testInHotbar(Predicate<ItemStack> predicate)
```

## meteordevelopment.meteorclient.utils.player.InvUtils.testInHotbar

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/InvUtils.java:76`

```java
public static boolean testInHotbar(Item... items)
```

## meteordevelopment.meteorclient.utils.player.InvUtils.findEmpty

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/InvUtils.java:82`

```java
public static FindItemResult findEmpty()
```

## meteordevelopment.meteorclient.utils.player.InvUtils.findInHotbar

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/InvUtils.java:86`

```java
public static FindItemResult findInHotbar(Item... items)
```

## meteordevelopment.meteorclient.utils.player.InvUtils.findInHotbar

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/InvUtils.java:90`

```java
public static FindItemResult findInHotbar(Predicate<ItemStack> isGood)
```

## meteordevelopment.meteorclient.utils.player.InvUtils.find

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/InvUtils.java:102`

```java
public static FindItemResult find(Item... items)
```

## meteordevelopment.meteorclient.utils.player.InvUtils.find

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/InvUtils.java:106`

```java
public static FindItemResult find(Predicate<ItemStack> isGood)
```

## meteordevelopment.meteorclient.utils.player.InvUtils.find

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/InvUtils.java:111`

```java
public static FindItemResult find(Predicate<ItemStack> isGood, int start, int end)
```

## meteordevelopment.meteorclient.utils.player.InvUtils.findFastestTool

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/InvUtils.java:128`

```java
public static FindItemResult findFastestTool(BlockState state)
```

## meteordevelopment.meteorclient.utils.player.InvUtils.swap

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/InvUtils.java:148`

```java
public static boolean swap(int slot, boolean swapBack)
```

## meteordevelopment.meteorclient.utils.player.InvUtils.swapBack

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/InvUtils.java:159`

```java
public static boolean swapBack()
```

## meteordevelopment.meteorclient.utils.player.InvUtils.move

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/InvUtils.java:167`

```java
public static Action move()
```

## meteordevelopment.meteorclient.utils.player.InvUtils.click

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/InvUtils.java:173`

```java
public static Action click()
```

## meteordevelopment.meteorclient.utils.player.InvUtils.quickSwap

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/InvUtils.java:182`

```java
public static Action quickSwap()
```

## meteordevelopment.meteorclient.utils.player.InvUtils.shiftClick

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/InvUtils.java:187`

```java
public static Action shiftClick()
```

## meteordevelopment.meteorclient.utils.player.InvUtils.drop

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/InvUtils.java:192`

```java
public static Action drop()
```

## meteordevelopment.meteorclient.utils.player.InvUtils.dropOne

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/InvUtils.java:198`

```java
public static Action dropOne()
```

## meteordevelopment.meteorclient.utils.player.InvUtils.dropHand

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/InvUtils.java:204`

```java
public static void dropHand()
```

## meteordevelopment.meteorclient.utils.player.InvUtils.Action

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/InvUtils.java:209`

```java
public static class Action
```

## meteordevelopment.meteorclient.utils.player.InvUtils.Action.fromId

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/InvUtils.java:223`

```java
public Action fromId(int id)
```

## meteordevelopment.meteorclient.utils.player.InvUtils.Action.from

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/InvUtils.java:231`

```java
public Action from(int index)
```

## meteordevelopment.meteorclient.utils.player.InvUtils.Action.fromHotbar

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/InvUtils.java:235`

```java
public Action fromHotbar(@Range(from = 0, to = 8) int i)
```

## meteordevelopment.meteorclient.utils.player.InvUtils.Action.fromOffhand

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/InvUtils.java:239`

```java
public Action fromOffhand()
```

## meteordevelopment.meteorclient.utils.player.InvUtils.Action.fromMain

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/InvUtils.java:243`

```java
public Action fromMain(@Range(from = 0, to = 26) int i)
```

## meteordevelopment.meteorclient.utils.player.InvUtils.Action.fromArmor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/InvUtils.java:250`

```java
public Action fromArmor(int i)
```

## meteordevelopment.meteorclient.utils.player.InvUtils.Action.toId

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/InvUtils.java:256`

```java
public void toId(int id)
```

## meteordevelopment.meteorclient.utils.player.InvUtils.Action.to

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/InvUtils.java:264`

```java
public void to(int index)
```

## meteordevelopment.meteorclient.utils.player.InvUtils.Action.toHotbar

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/InvUtils.java:268`

```java
public void toHotbar(@Range(from = 0, to = 8) int i)
```

## meteordevelopment.meteorclient.utils.player.InvUtils.Action.toOffhand

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/InvUtils.java:272`

```java
public void toOffhand()
```

## meteordevelopment.meteorclient.utils.player.InvUtils.Action.toMain

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/InvUtils.java:276`

```java
public void toMain(@Range(from = 0, to = 26) int i)
```

## meteordevelopment.meteorclient.utils.player.InvUtils.Action.toArmor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/InvUtils.java:283`

```java
public void toArmor(int i)
```

## meteordevelopment.meteorclient.utils.player.InvUtils.Action.slotId

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/InvUtils.java:289`

```java
public void slotId(int id)
```

## meteordevelopment.meteorclient.utils.player.InvUtils.Action.slot

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/InvUtils.java:297`

```java
public void slot(int index)
```

## meteordevelopment.meteorclient.utils.player.InvUtils.Action.slotHotbar

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/InvUtils.java:301`

```java
public void slotHotbar(@Range(from = 0, to = 8) int i)
```

## meteordevelopment.meteorclient.utils.player.InvUtils.Action.slotOffhand

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/InvUtils.java:305`

```java
public void slotOffhand()
```

## meteordevelopment.meteorclient.utils.player.InvUtils.Action.slotMain

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/InvUtils.java:309`

```java
public void slotMain(@Range(from = 0, to = 26) int i)
```

## meteordevelopment.meteorclient.utils.player.InvUtils.Action.slotArmor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/InvUtils.java:316`

```java
public void slotArmor(int i)
```

## meteordevelopment.meteorclient.utils.player.InventorySorter

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/InventorySorter.java:25`

```java
public class InventorySorter
```

## meteordevelopment.meteorclient.utils.player.InventorySorter.InventorySorter

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/InventorySorter.java:33`

```java
public InventorySorter(AbstractContainerScreen<?> screen, Slot originSlot)
```

## meteordevelopment.meteorclient.utils.player.InventorySorter.tick

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/InventorySorter.java:46`

```java
public boolean tick(int delay)
```

## meteordevelopment.meteorclient.utils.player.PathFinder

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/PathFinder.java:23`

```java
public class PathFinder
```

## meteordevelopment.meteorclient.utils.player.PathFinder.getNextPathBlock

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/PathFinder.java:30`

```java
public PathBlock getNextPathBlock()
```

## meteordevelopment.meteorclient.utils.player.PathFinder.getDrop

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/PathFinder.java:44`

```java
public int getDrop(BlockPos pos)
```

## meteordevelopment.meteorclient.utils.player.PathFinder.isAirAbove

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/PathFinder.java:53`

```java
public boolean isAirAbove(BlockPos blockPos)
```

## meteordevelopment.meteorclient.utils.player.PathFinder.getNextStraightPos

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/PathFinder.java:59`

```java
public Vec3 getNextStraightPos()
```

## meteordevelopment.meteorclient.utils.player.PathFinder.getYawToTarget

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/PathFinder.java:69`

```java
public int getYawToTarget()
```

## meteordevelopment.meteorclient.utils.player.PathFinder.getDirection

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/PathFinder.java:86`

```java
public int getDirection()
```

## meteordevelopment.meteorclient.utils.player.PathFinder.getBlockStateAtPos

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/PathFinder.java:101`

```java
public BlockState getBlockStateAtPos(BlockPos pos)
```

## meteordevelopment.meteorclient.utils.player.PathFinder.getBlockStateAtPos

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/PathFinder.java:107`

```java
public BlockState getBlockStateAtPos(int x, int y, int z)
```

## meteordevelopment.meteorclient.utils.player.PathFinder.getBlockAtPos

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/PathFinder.java:113`

```java
public Block getBlockAtPos(BlockPos pos)
```

## meteordevelopment.meteorclient.utils.player.PathFinder.isSolidFloor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/PathFinder.java:119`

```java
public boolean isSolidFloor(BlockPos blockPos)
```

## meteordevelopment.meteorclient.utils.player.PathFinder.isAir

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/PathFinder.java:123`

```java
public boolean isAir(Block block)
```

## meteordevelopment.meteorclient.utils.player.PathFinder.isWater

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/PathFinder.java:127`

```java
public boolean isWater(Block block)
```

## meteordevelopment.meteorclient.utils.player.PathFinder.lookAtDestination

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/PathFinder.java:131`

```java
public void lookAtDestination(PathBlock pathBlock)
```

## meteordevelopment.meteorclient.utils.player.PathFinder.initiate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/PathFinder.java:156`

```java
public void initiate(Entity entity)
```

## meteordevelopment.meteorclient.utils.player.PathFinder.disable

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/PathFinder.java:162`

```java
public void disable()
```

## meteordevelopment.meteorclient.utils.player.PathFinder.PathBlock

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/PathFinder.java:169`

```java
public class PathBlock
```

## meteordevelopment.meteorclient.utils.player.PathFinder.PathBlock.block

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/PathFinder.java:170`

```java
public final Block block
```

## meteordevelopment.meteorclient.utils.player.PathFinder.PathBlock.blockPos

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/PathFinder.java:171`

```java
public final BlockPos blockPos
```

## meteordevelopment.meteorclient.utils.player.PathFinder.PathBlock.blockState

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/PathFinder.java:172`

```java
public final BlockState blockState
```

## meteordevelopment.meteorclient.utils.player.PathFinder.PathBlock.yaw

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/PathFinder.java:173`

```java
public double yaw
```

## meteordevelopment.meteorclient.utils.player.PathFinder.PathBlock.PathBlock

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/PathFinder.java:175`

```java
public PathBlock(Block b, BlockPos pos, BlockState state)
```

## meteordevelopment.meteorclient.utils.player.PathFinder.PathBlock.PathBlock

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/PathFinder.java:181`

```java
public PathBlock(Block b, BlockPos pos)
```

## meteordevelopment.meteorclient.utils.player.PathFinder.PathBlock.PathBlock

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/PathFinder.java:187`

```java
public PathBlock(BlockPos pos)
```

## meteordevelopment.meteorclient.utils.player.PlayerUtils

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/PlayerUtils.java:41`

```java
public class PlayerUtils
```

## meteordevelopment.meteorclient.utils.player.PlayerUtils.getPlayerColor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/PlayerUtils.java:50`

```java
public static Color getPlayerColor(Player entity, Color defaultColor)
```

## meteordevelopment.meteorclient.utils.player.PlayerUtils.getHorizontalVelocity

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/PlayerUtils.java:62`

```java
public static Vec3 getHorizontalVelocity(double bps)
```

## meteordevelopment.meteorclient.utils.player.PlayerUtils.centerPlayer

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/PlayerUtils.java:107`

```java
public static void centerPlayer()
```

## meteordevelopment.meteorclient.utils.player.PlayerUtils.canSeeEntity

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/PlayerUtils.java:114`

```java
@SuppressWarnings("DataFlowIssue") public static boolean canSeeEntity(Entity entity)
```

## meteordevelopment.meteorclient.utils.player.PlayerUtils.calculateAngle

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/PlayerUtils.java:129`

```java
public static float[] calculateAngle(Vec3 target)
```

## meteordevelopment.meteorclient.utils.player.PlayerUtils.shouldPause

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/PlayerUtils.java:141`

```java
public static boolean shouldPause(boolean ifBreaking, boolean ifEating, boolean ifDrinking)
```

## meteordevelopment.meteorclient.utils.player.PlayerUtils.isMoving

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/PlayerUtils.java:148`

```java
public static boolean isMoving()
```

## meteordevelopment.meteorclient.utils.player.PlayerUtils.isSprinting

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/PlayerUtils.java:152`

```java
public static boolean isSprinting()
```

## meteordevelopment.meteorclient.utils.player.PlayerUtils.isInHole

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/PlayerUtils.java:156`

```java
public static boolean isInHole(boolean doubles)
```

## meteordevelopment.meteorclient.utils.player.PlayerUtils.possibleHealthReductions

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/PlayerUtils.java:187`

```java
public static float possibleHealthReductions()
```

## meteordevelopment.meteorclient.utils.player.PlayerUtils.possibleHealthReductions

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/PlayerUtils.java:191`

```java
public static float possibleHealthReductions(boolean entities, boolean fall)
```

## meteordevelopment.meteorclient.utils.player.PlayerUtils.distance

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/PlayerUtils.java:237`

```java
public static double distance(double x1, double y1, double z1, double x2, double y2, double z2)
```

## meteordevelopment.meteorclient.utils.player.PlayerUtils.distanceTo

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/PlayerUtils.java:241`

```java
public static double distanceTo(Entity entity)
```

## meteordevelopment.meteorclient.utils.player.PlayerUtils.distanceTo

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/PlayerUtils.java:245`

```java
public static double distanceTo(BlockPos blockPos)
```

## meteordevelopment.meteorclient.utils.player.PlayerUtils.distanceTo

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/PlayerUtils.java:249`

```java
public static double distanceTo(Vec3 vec3d)
```

## meteordevelopment.meteorclient.utils.player.PlayerUtils.distanceTo

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/PlayerUtils.java:253`

```java
public static double distanceTo(double x, double y, double z)
```

## meteordevelopment.meteorclient.utils.player.PlayerUtils.squaredDistanceTo

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/PlayerUtils.java:257`

```java
public static double squaredDistanceTo(Entity entity)
```

## meteordevelopment.meteorclient.utils.player.PlayerUtils.squaredDistanceTo

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/PlayerUtils.java:261`

```java
public static double squaredDistanceTo(BlockPos blockPos)
```

## meteordevelopment.meteorclient.utils.player.PlayerUtils.squaredDistanceTo

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/PlayerUtils.java:265`

```java
public static double squaredDistanceTo(double x, double y, double z)
```

## meteordevelopment.meteorclient.utils.player.PlayerUtils.squaredDistance

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/PlayerUtils.java:269`

```java
public static double squaredDistance(double x1, double y1, double z1, double x2, double y2, double z2)
```

## meteordevelopment.meteorclient.utils.player.PlayerUtils.isWithin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/PlayerUtils.java:276`

```java
public static boolean isWithin(Entity entity, double r)
```

## meteordevelopment.meteorclient.utils.player.PlayerUtils.isWithin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/PlayerUtils.java:280`

```java
public static boolean isWithin(Vec3 vec3d, double r)
```

## meteordevelopment.meteorclient.utils.player.PlayerUtils.isWithin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/PlayerUtils.java:284`

```java
public static boolean isWithin(BlockPos blockPos, double r)
```

## meteordevelopment.meteorclient.utils.player.PlayerUtils.isWithin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/PlayerUtils.java:288`

```java
public static boolean isWithin(double x, double y, double z, double r)
```

## meteordevelopment.meteorclient.utils.player.PlayerUtils.distanceToCamera

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/PlayerUtils.java:292`

```java
public static double distanceToCamera(double x, double y, double z)
```

## meteordevelopment.meteorclient.utils.player.PlayerUtils.distanceToCamera

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/PlayerUtils.java:296`

```java
public static double distanceToCamera(Entity entity)
```

## meteordevelopment.meteorclient.utils.player.PlayerUtils.squaredDistanceToCamera

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/PlayerUtils.java:300`

```java
public static double squaredDistanceToCamera(double x, double y, double z)
```

## meteordevelopment.meteorclient.utils.player.PlayerUtils.squaredDistanceToCamera

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/PlayerUtils.java:305`

```java
public static double squaredDistanceToCamera(Entity entity)
```

## meteordevelopment.meteorclient.utils.player.PlayerUtils.isWithinCamera

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/PlayerUtils.java:309`

```java
public static boolean isWithinCamera(Entity entity, double r)
```

## meteordevelopment.meteorclient.utils.player.PlayerUtils.isWithinCamera

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/PlayerUtils.java:313`

```java
public static boolean isWithinCamera(Vec3 vec3d, double r)
```

## meteordevelopment.meteorclient.utils.player.PlayerUtils.isWithinCamera

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/PlayerUtils.java:317`

```java
public static boolean isWithinCamera(BlockPos blockPos, double r)
```

## meteordevelopment.meteorclient.utils.player.PlayerUtils.isWithinCamera

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/PlayerUtils.java:321`

```java
public static boolean isWithinCamera(double x, double y, double z, double r)
```

## meteordevelopment.meteorclient.utils.player.PlayerUtils.isWithinReach

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/PlayerUtils.java:325`

```java
public static boolean isWithinReach(Entity entity)
```

## meteordevelopment.meteorclient.utils.player.PlayerUtils.isWithinReach

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/PlayerUtils.java:329`

```java
public static boolean isWithinReach(Vec3 vec3d)
```

## meteordevelopment.meteorclient.utils.player.PlayerUtils.isWithinReach

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/PlayerUtils.java:333`

```java
public static boolean isWithinReach(BlockPos blockPos)
```

## meteordevelopment.meteorclient.utils.player.PlayerUtils.isWithinReach

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/PlayerUtils.java:337`

```java
public static boolean isWithinReach(double x, double y, double z)
```

## meteordevelopment.meteorclient.utils.player.PlayerUtils.getDimension

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/PlayerUtils.java:341`

```java
public static Dimension getDimension()
```

## meteordevelopment.meteorclient.utils.player.PlayerUtils.getGameMode

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/PlayerUtils.java:351`

```java
public static GameType getGameMode()
```

## meteordevelopment.meteorclient.utils.player.PlayerUtils.getTotalHealth

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/PlayerUtils.java:358`

```java
public static float getTotalHealth()
```

## meteordevelopment.meteorclient.utils.player.PlayerUtils.isAlive

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/PlayerUtils.java:362`

```java
public static boolean isAlive()
```

## meteordevelopment.meteorclient.utils.player.PlayerUtils.getPing

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/PlayerUtils.java:366`

```java
public static int getPing()
```

## meteordevelopment.meteorclient.utils.player.Rotations

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/Rotations.java:27`

```java
public class Rotations
```

## meteordevelopment.meteorclient.utils.player.Rotations.serverYaw

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/Rotations.java:30`

```java
public static float serverYaw
```

## meteordevelopment.meteorclient.utils.player.Rotations.serverPitch

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/Rotations.java:31`

```java
public static float serverPitch
```

## meteordevelopment.meteorclient.utils.player.Rotations.rotationTimer

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/Rotations.java:32`

```java
public static int rotationTimer
```

## meteordevelopment.meteorclient.utils.player.Rotations.rotating

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/Rotations.java:39`

```java
public static boolean rotating = false
```

## meteordevelopment.meteorclient.utils.player.Rotations.init

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/Rotations.java:44`

```java
@PreInit public static void init()
```

## meteordevelopment.meteorclient.utils.player.Rotations.rotate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/Rotations.java:49`

```java
public static void rotate(double yaw, double pitch, int priority, boolean clientSide, Runnable callback)
```

## meteordevelopment.meteorclient.utils.player.Rotations.rotate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/Rotations.java:61`

```java
public static void rotate(double yaw, double pitch, int priority, Runnable callback)
```

## meteordevelopment.meteorclient.utils.player.Rotations.rotate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/Rotations.java:65`

```java
public static void rotate(double yaw, double pitch, Runnable callback)
```

## meteordevelopment.meteorclient.utils.player.Rotations.rotate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/Rotations.java:69`

```java
public static void rotate(double yaw, double pitch, int priority)
```

## meteordevelopment.meteorclient.utils.player.Rotations.rotate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/Rotations.java:73`

```java
public static void rotate(double yaw, double pitch)
```

## meteordevelopment.meteorclient.utils.player.Rotations.getYaw

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/Rotations.java:167`

```java
public static double getYaw(Entity entity)
```

## meteordevelopment.meteorclient.utils.player.Rotations.getYaw

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/Rotations.java:171`

```java
public static double getYaw(Vec3 pos)
```

## meteordevelopment.meteorclient.utils.player.Rotations.getPitch

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/Rotations.java:175`

```java
public static double getPitch(Vec3 pos)
```

## meteordevelopment.meteorclient.utils.player.Rotations.getPitch

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/Rotations.java:185`

```java
public static double getPitch(Entity entity, Target target)
```

## meteordevelopment.meteorclient.utils.player.Rotations.getPitch

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/Rotations.java:201`

```java
public static double getPitch(Entity entity)
```

## meteordevelopment.meteorclient.utils.player.Rotations.getYaw

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/Rotations.java:205`

```java
public static double getYaw(BlockPos pos)
```

## meteordevelopment.meteorclient.utils.player.Rotations.getPitch

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/Rotations.java:209`

```java
public static double getPitch(BlockPos pos)
```

## meteordevelopment.meteorclient.utils.player.Rotations.setCamRotation

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/Rotations.java:219`

```java
public static void setCamRotation(double yaw, double pitch)
```

## meteordevelopment.meteorclient.utils.player.Safety

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/Safety.java:8`

```java
public enum Safety
```

## meteordevelopment.meteorclient.utils.player.SlotUtils

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/SlotUtils.java:22`

```java
public class SlotUtils
```

## meteordevelopment.meteorclient.utils.player.SlotUtils.HOTBAR_START

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/SlotUtils.java:31`

```java
public static final int HOTBAR_START = 0
```

## meteordevelopment.meteorclient.utils.player.SlotUtils.HOTBAR_END

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/SlotUtils.java:32`

```java
public static final int HOTBAR_END = 8
```

## meteordevelopment.meteorclient.utils.player.SlotUtils.MAIN_START

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/SlotUtils.java:33`

```java
public static final int MAIN_START = 9
```

## meteordevelopment.meteorclient.utils.player.SlotUtils.MAIN_END

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/SlotUtils.java:34`

```java
public static final int MAIN_END = 35
```

## meteordevelopment.meteorclient.utils.player.SlotUtils.ARMOR_START

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/SlotUtils.java:35`

```java
public static final int ARMOR_START = 36
```

## meteordevelopment.meteorclient.utils.player.SlotUtils.ARMOR_END

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/SlotUtils.java:36`

```java
public static final int ARMOR_END = 39
```

## meteordevelopment.meteorclient.utils.player.SlotUtils.OFFHAND

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/SlotUtils.java:37`

```java
public static final int OFFHAND = 40
```

## meteordevelopment.meteorclient.utils.player.SlotUtils.indexToId

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/SlotUtils.java:52`

```java
public static int indexToId(int i)
```

## meteordevelopment.meteorclient.utils.player.SlotUtils.isHotbar

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/SlotUtils.java:218`

```java
public static boolean isHotbar(int slotIndex)
```

## meteordevelopment.meteorclient.utils.player.SlotUtils.isMain

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/SlotUtils.java:222`

```java
public static boolean isMain(int slotIndex)
```

## meteordevelopment.meteorclient.utils.player.SlotUtils.isArmor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/SlotUtils.java:226`

```java
public static boolean isArmor(int slotIndex)
```

## meteordevelopment.meteorclient.utils.player.SwingMode

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/SwingMode.java:13`

```java
public enum SwingMode
```

## meteordevelopment.meteorclient.utils.player.SwingMode.of

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/SwingMode.java:19`

```java
public static SwingMode of(boolean client)
```

## meteordevelopment.meteorclient.utils.player.SwingMode.client

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/SwingMode.java:23`

```java
public boolean client()
```

## meteordevelopment.meteorclient.utils.player.SwingMode.attackSwing

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/SwingMode.java:31`

```java
public void attackSwing(InteractionHand hand)
```

## meteordevelopment.meteorclient.utils.player.SwingMode.interactSwing

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/SwingMode.java:40`

```java
public void interactSwing(InteractionHand hand)
```

## meteordevelopment.meteorclient.utils.player.TitleScreenCredits

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/TitleScreenCredits.java:31`

```java
public class TitleScreenCredits
```

## meteordevelopment.meteorclient.utils.player.TitleScreenCredits.render

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/TitleScreenCredits.java:101`

```java
public static void render(GuiGraphicsExtractor graphics)
```

## meteordevelopment.meteorclient.utils.player.TitleScreenCredits.onClicked

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/TitleScreenCredits.java:116`

```java
public static boolean onClicked(double mouseX, double mouseY)
```
