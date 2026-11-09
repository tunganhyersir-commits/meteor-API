# utils/world

Khai báo Java có cú pháp public/protected. Không bao gồm API kế thừa/tổng hợp bởi compiler; xem kiểm tra bytecode riêng.

## meteordevelopment.meteorclient.utils.world.BlockEntityIterator

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/world/BlockEntityIterator.java:16`

```java
public class BlockEntityIterator implements Iterator<BlockEntity>
```

## meteordevelopment.meteorclient.utils.world.BlockEntityIterator.BlockEntityIterator

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/world/BlockEntityIterator.java:20`

```java
public BlockEntityIterator()
```

## meteordevelopment.meteorclient.utils.world.BlockEntityIterator.hasNext

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/world/BlockEntityIterator.java:39`

```java
@Override public boolean hasNext()
```

## meteordevelopment.meteorclient.utils.world.BlockEntityIterator.next

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/world/BlockEntityIterator.java:49`

```java
@Override public BlockEntity next()
```

## meteordevelopment.meteorclient.utils.world.BlockIterator

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/world/BlockIterator.java:24`

```java
public class BlockIterator
```

## meteordevelopment.meteorclient.utils.world.BlockIterator.init

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/world/BlockIterator.java:38`

```java
@PreInit public static void init()
```

## meteordevelopment.meteorclient.utils.world.BlockIterator.register

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/world/BlockIterator.java:85`

```java
public static void register(int horizontalRadius, int verticalRadius, BiConsumer<BlockPos, BlockState> function)
```

## meteordevelopment.meteorclient.utils.world.BlockIterator.disableCurrent

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/world/BlockIterator.java:98`

```java
public static void disableCurrent()
```

## meteordevelopment.meteorclient.utils.world.BlockIterator.after

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/world/BlockIterator.java:102`

```java
public static void after(Runnable callback)
```

## meteordevelopment.meteorclient.utils.world.BlockUtils

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/world/BlockUtils.java:46`

```java
@SuppressWarnings("ConstantConditions") public class BlockUtils
```

## meteordevelopment.meteorclient.utils.world.BlockUtils.breaking

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/world/BlockUtils.java:48`

```java
public static boolean breaking
```

## meteordevelopment.meteorclient.utils.world.BlockUtils.init

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/world/BlockUtils.java:54`

```java
@PreInit public static void init()
```

## meteordevelopment.meteorclient.utils.world.BlockUtils.place

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/world/BlockUtils.java:61`

```java
public static boolean place(BlockPos blockPos, FindItemResult findItemResult, int rotationPriority)
```

## meteordevelopment.meteorclient.utils.world.BlockUtils.place

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/world/BlockUtils.java:65`

```java
public static boolean place(BlockPos blockPos, FindItemResult findItemResult, boolean rotate, int rotationPriority)
```

## meteordevelopment.meteorclient.utils.world.BlockUtils.place

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/world/BlockUtils.java:69`

```java
public static boolean place(BlockPos blockPos, FindItemResult findItemResult, boolean rotate, int rotationPriority, boolean checkEntities)
```

## meteordevelopment.meteorclient.utils.world.BlockUtils.place

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/world/BlockUtils.java:73`

```java
public static boolean place(BlockPos blockPos, FindItemResult findItemResult, int rotationPriority, boolean checkEntities)
```

## meteordevelopment.meteorclient.utils.world.BlockUtils.place

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/world/BlockUtils.java:77`

```java
public static boolean place(BlockPos blockPos, FindItemResult findItemResult, boolean rotate, int rotationPriority, boolean swingHand, boolean checkEntities)
```

## meteordevelopment.meteorclient.utils.world.BlockUtils.place

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/world/BlockUtils.java:81`

```java
public static boolean place(BlockPos blockPos, FindItemResult findItemResult, boolean rotate, int rotationPriority, boolean swingHand, boolean checkEntities, boolean swapBack)
```

## meteordevelopment.meteorclient.utils.world.BlockUtils.place

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/world/BlockUtils.java:90`

```java
public static boolean place(BlockPos blockPos, InteractionHand hand, int slot, boolean rotate, int rotationPriority, boolean swingHand, boolean checkEntities, boolean swapBack)
```

## meteordevelopment.meteorclient.utils.world.BlockUtils.interact

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/world/BlockUtils.java:133`

```java
public static InteractionResult interact(BlockHitResult blockHitResult, InteractionHand hand, boolean swing)
```

## meteordevelopment.meteorclient.utils.world.BlockUtils.canPlaceBlock

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/world/BlockUtils.java:148`

```java
public static boolean canPlaceBlock(BlockPos blockPos, boolean checkEntities, Block block)
```

## meteordevelopment.meteorclient.utils.world.BlockUtils.canPlace

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/world/BlockUtils.java:161`

```java
public static boolean canPlace(BlockPos blockPos, boolean checkEntities)
```

## meteordevelopment.meteorclient.utils.world.BlockUtils.canPlace

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/world/BlockUtils.java:165`

```java
public static boolean canPlace(BlockPos blockPos)
```

## meteordevelopment.meteorclient.utils.world.BlockUtils.getPlaceSide

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/world/BlockUtils.java:169`

```java
public static Direction getPlaceSide(BlockPos blockPos)
```

## meteordevelopment.meteorclient.utils.world.BlockUtils.getClosestPlaceSide

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/world/BlockUtils.java:194`

```java
public static Direction getClosestPlaceSide(BlockPos blockPos)
```

## meteordevelopment.meteorclient.utils.world.BlockUtils.getClosestPlaceSide

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/world/BlockUtils.java:198`

```java
public static Direction getClosestPlaceSide(BlockPos blockPos, Vec3 pos)
```

## meteordevelopment.meteorclient.utils.world.BlockUtils.breakBlock

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/world/BlockUtils.java:240`

```java
public static boolean breakBlock(BlockPos blockPos, boolean swing)
```

## meteordevelopment.meteorclient.utils.world.BlockUtils.canBreak

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/world/BlockUtils.java:264`

```java
public static boolean canBreak(BlockPos blockPos, BlockState state)
```

## meteordevelopment.meteorclient.utils.world.BlockUtils.canBreak

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/world/BlockUtils.java:269`

```java
public static boolean canBreak(BlockPos blockPos)
```

## meteordevelopment.meteorclient.utils.world.BlockUtils.canInstaBreak

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/world/BlockUtils.java:273`

```java
public static boolean canInstaBreak(BlockPos blockPos, float breakSpeed)
```

## meteordevelopment.meteorclient.utils.world.BlockUtils.canInstaBreak

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/world/BlockUtils.java:277`

```java
public static boolean canInstaBreak(BlockPos blockPos)
```

## meteordevelopment.meteorclient.utils.world.BlockUtils.calcBlockBreakingDelta2

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/world/BlockUtils.java:282`

```java
public static float calcBlockBreakingDelta2(BlockPos blockPos, float breakSpeed)
```

## meteordevelopment.meteorclient.utils.world.BlockUtils.isClickable

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/world/BlockUtils.java:295`

```java
public static boolean isClickable(Block block)
```

## meteordevelopment.meteorclient.utils.world.BlockUtils.isValidMobSpawn

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/world/BlockUtils.java:313`

```java
public static MobSpawn isValidMobSpawn(BlockPos blockPos, BlockState blockState, int spawnLightLimit)
```

## meteordevelopment.meteorclient.utils.world.BlockUtils.isValidSpawnBlock

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/world/BlockUtils.java:325`

```java
public static boolean isValidSpawnBlock(BlockState blockState)
```

## meteordevelopment.meteorclient.utils.world.BlockUtils.getDirection

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/world/BlockUtils.java:341`

```java
public static Direction getDirection(BlockPos pos)
```

## meteordevelopment.meteorclient.utils.world.BlockUtils.MobSpawn

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/world/BlockUtils.java:360`

```java
public enum MobSpawn
```

## meteordevelopment.meteorclient.utils.world.BlockUtils.isExposed

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/world/BlockUtils.java:368`

```java
public static boolean isExposed(BlockPos blockPos)
```

## meteordevelopment.meteorclient.utils.world.BlockUtils.getBreakDelta

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/world/BlockUtils.java:377`

```java
public static double getBreakDelta(int slot, BlockState state)
```

## meteordevelopment.meteorclient.utils.world.BlockUtils.mutateAround

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/world/BlockUtils.java:428`

```java
public static BlockPos.MutableBlockPos mutateAround(BlockPos.MutableBlockPos mutable, BlockPos origin, int xOffset, int yOffset, int zOffset)
```

## meteordevelopment.meteorclient.utils.world.CardinalDirection

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/world/CardinalDirection.java:10`

```java
public enum CardinalDirection
```

## meteordevelopment.meteorclient.utils.world.CardinalDirection.toDirection

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/world/CardinalDirection.java:16`

```java
public Direction toDirection()
```

## meteordevelopment.meteorclient.utils.world.CardinalDirection.fromDirection

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/world/CardinalDirection.java:25`

```java
public static CardinalDirection fromDirection(Direction direction)
```

## meteordevelopment.meteorclient.utils.world.ChunkIterator

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/world/ChunkIterator.java:16`

```java
public class ChunkIterator implements Iterator<ChunkAccess>
```

## meteordevelopment.meteorclient.utils.world.ChunkIterator.ChunkIterator

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/world/ChunkIterator.java:23`

```java
public ChunkIterator(boolean onlyWithLoadedNeighbours)
```

## meteordevelopment.meteorclient.utils.world.ChunkIterator.hasNext

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/world/ChunkIterator.java:48`

```java
@Override public boolean hasNext()
```

## meteordevelopment.meteorclient.utils.world.ChunkIterator.next

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/world/ChunkIterator.java:53`

```java
@Override public ChunkAccess next()
```

## meteordevelopment.meteorclient.utils.world.Dimension

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/world/Dimension.java:8`

```java
public enum Dimension
```

## meteordevelopment.meteorclient.utils.world.Dimension.opposite

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/world/Dimension.java:13`

```java
public Dimension opposite()
```

## meteordevelopment.meteorclient.utils.world.Dimension.toString

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/world/Dimension.java:21`

```java
public String toString()
```

## meteordevelopment.meteorclient.utils.world.Dir

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/world/Dir.java:10`

```java
public class Dir
```

## meteordevelopment.meteorclient.utils.world.Dir.UP

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/world/Dir.java:11`

```java
public static final byte UP = 1 << 1
```

## meteordevelopment.meteorclient.utils.world.Dir.DOWN

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/world/Dir.java:12`

```java
public static final byte DOWN = 1 << 2
```

## meteordevelopment.meteorclient.utils.world.Dir.NORTH

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/world/Dir.java:13`

```java
public static final byte NORTH = 1 << 3
```

## meteordevelopment.meteorclient.utils.world.Dir.SOUTH

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/world/Dir.java:14`

```java
public static final byte SOUTH = 1 << 4
```

## meteordevelopment.meteorclient.utils.world.Dir.WEST

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/world/Dir.java:15`

```java
public static final byte WEST = 1 << 5
```

## meteordevelopment.meteorclient.utils.world.Dir.EAST

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/world/Dir.java:16`

```java
public static final byte EAST = 1 << 6
```

## meteordevelopment.meteorclient.utils.world.Dir.get

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/world/Dir.java:21`

```java
public static byte get(Direction dir)
```

## meteordevelopment.meteorclient.utils.world.Dir.is

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/world/Dir.java:32`

```java
public static boolean is(int dir, byte idk)
```

## meteordevelopment.meteorclient.utils.world.Dir.isNot

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/world/Dir.java:36`

```java
public static boolean isNot(int dir, byte idk)
```

## meteordevelopment.meteorclient.utils.world.TickRate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/world/TickRate.java:21`

```java
public class TickRate
```

## meteordevelopment.meteorclient.utils.world.TickRate.INSTANCE

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/world/TickRate.java:22`

```java
public static TickRate INSTANCE = new TickRate()
```

## meteordevelopment.meteorclient.utils.world.TickRate.getTickRate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/world/TickRate.java:51`

```java
public float getTickRate()
```

## meteordevelopment.meteorclient.utils.world.TickRate.getTimeSinceLastTick

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/world/TickRate.java:66`

```java
public float getTimeSinceLastTick()
```
