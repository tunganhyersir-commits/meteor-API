# utils/world

Khai báo Java có cú pháp public/protected. Không bao gồm API kế thừa/tổng hợp bởi compiler; xem kiểm tra bytecode riêng.

## meteordevelopment.meteorclient.utils.world.BlockEntityIterator

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/world/BlockEntityIterator.java:16`

```java
public class BlockEntityIterator implements Iterator<BlockEntity>
```

## meteordevelopment.meteorclient.utils.world.BlockEntityIterator.BlockEntityIterator

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/world/BlockEntityIterator.java:20`

```java
public BlockEntityIterator()
```

## meteordevelopment.meteorclient.utils.world.BlockEntityIterator.hasNext

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/world/BlockEntityIterator.java:39`

```java
@Override public boolean hasNext()
```

## meteordevelopment.meteorclient.utils.world.BlockEntityIterator.next

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/world/BlockEntityIterator.java:49`

```java
@Override public BlockEntity next()
```

## meteordevelopment.meteorclient.utils.world.BlockIterator

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/world/BlockIterator.java:24`

```java
public class BlockIterator
```

## meteordevelopment.meteorclient.utils.world.BlockIterator.init

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/world/BlockIterator.java:38`

```java
@PreInit public static void init()
```

## meteordevelopment.meteorclient.utils.world.BlockIterator.register

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/world/BlockIterator.java:85`

```java
public static void register(int horizontalRadius, int verticalRadius, BiConsumer<BlockPos, BlockState> function)
```

## meteordevelopment.meteorclient.utils.world.BlockIterator.disableCurrent

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/world/BlockIterator.java:98`

```java
public static void disableCurrent()
```

## meteordevelopment.meteorclient.utils.world.BlockIterator.after

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/world/BlockIterator.java:102`

```java
public static void after(Runnable callback)
```

## meteordevelopment.meteorclient.utils.world.BlockUtils

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/world/BlockUtils.java:44`

```java
@SuppressWarnings("ConstantConditions") public class BlockUtils
```

## meteordevelopment.meteorclient.utils.world.BlockUtils.breaking

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/world/BlockUtils.java:46`

```java
public static boolean breaking
```

## meteordevelopment.meteorclient.utils.world.BlockUtils.init

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/world/BlockUtils.java:52`

```java
@PreInit public static void init()
```

## meteordevelopment.meteorclient.utils.world.BlockUtils.place

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/world/BlockUtils.java:59`

```java
public static boolean place(BlockPos blockPos, FindItemResult findItemResult, int rotationPriority)
```

## meteordevelopment.meteorclient.utils.world.BlockUtils.place

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/world/BlockUtils.java:63`

```java
public static boolean place(BlockPos blockPos, FindItemResult findItemResult, boolean rotate, int rotationPriority)
```

## meteordevelopment.meteorclient.utils.world.BlockUtils.place

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/world/BlockUtils.java:67`

```java
public static boolean place(BlockPos blockPos, FindItemResult findItemResult, boolean rotate, int rotationPriority, boolean checkEntities)
```

## meteordevelopment.meteorclient.utils.world.BlockUtils.place

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/world/BlockUtils.java:71`

```java
public static boolean place(BlockPos blockPos, FindItemResult findItemResult, int rotationPriority, boolean checkEntities)
```

## meteordevelopment.meteorclient.utils.world.BlockUtils.place

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/world/BlockUtils.java:75`

```java
public static boolean place(BlockPos blockPos, FindItemResult findItemResult, boolean rotate, int rotationPriority, boolean swingHand, boolean checkEntities)
```

## meteordevelopment.meteorclient.utils.world.BlockUtils.place

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/world/BlockUtils.java:79`

```java
public static boolean place(BlockPos blockPos, FindItemResult findItemResult, boolean rotate, int rotationPriority, boolean swingHand, boolean checkEntities, boolean swapBack)
```

## meteordevelopment.meteorclient.utils.world.BlockUtils.place

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/world/BlockUtils.java:88`

```java
public static boolean place(BlockPos blockPos, Hand hand, int slot, boolean rotate, int rotationPriority, boolean swingHand, boolean checkEntities, boolean swapBack)
```

## meteordevelopment.meteorclient.utils.world.BlockUtils.interact

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/world/BlockUtils.java:131`

```java
public static void interact(BlockHitResult blockHitResult, Hand hand, boolean swing)
```

## meteordevelopment.meteorclient.utils.world.BlockUtils.canPlaceBlock

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/world/BlockUtils.java:145`

```java
public static boolean canPlaceBlock(BlockPos blockPos, boolean checkEntities, Block block)
```

## meteordevelopment.meteorclient.utils.world.BlockUtils.canPlace

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/world/BlockUtils.java:158`

```java
public static boolean canPlace(BlockPos blockPos, boolean checkEntities)
```

## meteordevelopment.meteorclient.utils.world.BlockUtils.canPlace

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/world/BlockUtils.java:162`

```java
public static boolean canPlace(BlockPos blockPos)
```

## meteordevelopment.meteorclient.utils.world.BlockUtils.getPlaceSide

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/world/BlockUtils.java:166`

```java
public static Direction getPlaceSide(BlockPos blockPos)
```

## meteordevelopment.meteorclient.utils.world.BlockUtils.getClosestPlaceSide

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/world/BlockUtils.java:191`

```java
public static Direction getClosestPlaceSide(BlockPos blockPos)
```

## meteordevelopment.meteorclient.utils.world.BlockUtils.getClosestPlaceSide

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/world/BlockUtils.java:195`

```java
public static Direction getClosestPlaceSide(BlockPos blockPos, Vec3d pos)
```

## meteordevelopment.meteorclient.utils.world.BlockUtils.breakBlock

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/world/BlockUtils.java:237`

```java
public static boolean breakBlock(BlockPos blockPos, boolean swing)
```

## meteordevelopment.meteorclient.utils.world.BlockUtils.canBreak

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/world/BlockUtils.java:262`

```java
public static boolean canBreak(BlockPos blockPos, BlockState state)
```

## meteordevelopment.meteorclient.utils.world.BlockUtils.canBreak

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/world/BlockUtils.java:267`

```java
public static boolean canBreak(BlockPos blockPos)
```

## meteordevelopment.meteorclient.utils.world.BlockUtils.canInstaBreak

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/world/BlockUtils.java:271`

```java
public static boolean canInstaBreak(BlockPos blockPos, float breakSpeed)
```

## meteordevelopment.meteorclient.utils.world.BlockUtils.canInstaBreak

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/world/BlockUtils.java:275`

```java
public static boolean canInstaBreak(BlockPos blockPos)
```

## meteordevelopment.meteorclient.utils.world.BlockUtils.calcBlockBreakingDelta2

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/world/BlockUtils.java:280`

```java
public static float calcBlockBreakingDelta2(BlockPos blockPos, float breakSpeed)
```

## meteordevelopment.meteorclient.utils.world.BlockUtils.isClickable

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/world/BlockUtils.java:293`

```java
public static boolean isClickable(Block block)
```

## meteordevelopment.meteorclient.utils.world.BlockUtils.isValidMobSpawn

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/world/BlockUtils.java:311`

```java
public static MobSpawn isValidMobSpawn(BlockPos blockPos, BlockState blockState, int spawnLightLimit)
```

## meteordevelopment.meteorclient.utils.world.BlockUtils.isValidSpawnBlock

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/world/BlockUtils.java:323`

```java
public static boolean isValidSpawnBlock(BlockState blockState)
```

## meteordevelopment.meteorclient.utils.world.BlockUtils.getDirection

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/world/BlockUtils.java:339`

```java
public static Direction getDirection(BlockPos pos)
```

## meteordevelopment.meteorclient.utils.world.BlockUtils.MobSpawn

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/world/BlockUtils.java:358`

```java
public enum MobSpawn
```

## meteordevelopment.meteorclient.utils.world.BlockUtils.isExposed

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/world/BlockUtils.java:366`

```java
public static boolean isExposed(BlockPos blockPos)
```

## meteordevelopment.meteorclient.utils.world.BlockUtils.getBreakDelta

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/world/BlockUtils.java:374`

```java
public static double getBreakDelta(int slot, BlockState state)
```

## meteordevelopment.meteorclient.utils.world.BlockUtils.mutateAround

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/world/BlockUtils.java:425`

```java
public static BlockPos.Mutable mutateAround(BlockPos.Mutable mutable, BlockPos origin, int xOffset, int yOffset, int zOffset)
```

## meteordevelopment.meteorclient.utils.world.CardinalDirection

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/world/CardinalDirection.java:10`

```java
public enum CardinalDirection
```

## meteordevelopment.meteorclient.utils.world.CardinalDirection.toDirection

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/world/CardinalDirection.java:16`

```java
public Direction toDirection()
```

## meteordevelopment.meteorclient.utils.world.CardinalDirection.fromDirection

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/world/CardinalDirection.java:25`

```java
public static CardinalDirection fromDirection(Direction direction)
```

## meteordevelopment.meteorclient.utils.world.ChunkIterator

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/world/ChunkIterator.java:16`

```java
public class ChunkIterator implements Iterator<Chunk>
```

## meteordevelopment.meteorclient.utils.world.ChunkIterator.ChunkIterator

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/world/ChunkIterator.java:23`

```java
public ChunkIterator(boolean onlyWithLoadedNeighbours)
```

## meteordevelopment.meteorclient.utils.world.ChunkIterator.hasNext

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/world/ChunkIterator.java:48`

```java
@Override public boolean hasNext()
```

## meteordevelopment.meteorclient.utils.world.ChunkIterator.next

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/world/ChunkIterator.java:53`

```java
@Override public Chunk next()
```

## meteordevelopment.meteorclient.utils.world.Dimension

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/world/Dimension.java:8`

```java
public enum Dimension
```

## meteordevelopment.meteorclient.utils.world.Dimension.opposite

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/world/Dimension.java:13`

```java
public Dimension opposite()
```

## meteordevelopment.meteorclient.utils.world.Dir

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/world/Dir.java:10`

```java
public class Dir
```

## meteordevelopment.meteorclient.utils.world.Dir.UP

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/world/Dir.java:11`

```java
public static final byte UP = 1 << 1
```

## meteordevelopment.meteorclient.utils.world.Dir.DOWN

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/world/Dir.java:12`

```java
public static final byte DOWN = 1 << 2
```

## meteordevelopment.meteorclient.utils.world.Dir.NORTH

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/world/Dir.java:13`

```java
public static final byte NORTH = 1 << 3
```

## meteordevelopment.meteorclient.utils.world.Dir.SOUTH

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/world/Dir.java:14`

```java
public static final byte SOUTH = 1 << 4
```

## meteordevelopment.meteorclient.utils.world.Dir.WEST

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/world/Dir.java:15`

```java
public static final byte WEST = 1 << 5
```

## meteordevelopment.meteorclient.utils.world.Dir.EAST

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/world/Dir.java:16`

```java
public static final byte EAST = 1 << 6
```

## meteordevelopment.meteorclient.utils.world.Dir.get

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/world/Dir.java:21`

```java
public static byte get(Direction dir)
```

## meteordevelopment.meteorclient.utils.world.Dir.is

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/world/Dir.java:32`

```java
public static boolean is(int dir, byte idk)
```

## meteordevelopment.meteorclient.utils.world.Dir.isNot

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/world/Dir.java:36`

```java
public static boolean isNot(int dir, byte idk)
```

## meteordevelopment.meteorclient.utils.world.TickRate

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/world/TickRate.java:21`

```java
public class TickRate
```

## meteordevelopment.meteorclient.utils.world.TickRate.INSTANCE

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/world/TickRate.java:22`

```java
public static TickRate INSTANCE = new TickRate()
```

## meteordevelopment.meteorclient.utils.world.TickRate.getTickRate

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/world/TickRate.java:51`

```java
public float getTickRate()
```

## meteordevelopment.meteorclient.utils.world.TickRate.getTimeSinceLastTick

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/world/TickRate.java:66`

```java
public float getTimeSinceLastTick()
```
