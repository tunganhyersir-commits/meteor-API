# utils/entity

Khai báo Java có cú pháp public/protected. Không bao gồm API kế thừa/tổng hợp bởi compiler; xem kiểm tra bytecode riêng.

## meteordevelopment.meteorclient.utils.entity.DamageUtils

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/entity/DamageUtils.java:54`

```java
public class DamageUtils
```

## meteordevelopment.meteorclient.utils.entity.DamageUtils.HIT_FACTORY

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/entity/DamageUtils.java:65`

```java
public static final RaycastFactory HIT_FACTORY = (context, blockPos) -> { BlockState blockState = mc.world.getBlockState(blockPos); if (blockState.getBlock().getBlastResistance() < 600) return null; return blockState.getCollisionShape(mc.world, blockPos).raycast(context.start(), context.end(), blockPos); }
```

## meteordevelopment.meteorclient.utils.entity.DamageUtils.crystalDamage

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/entity/DamageUtils.java:72`

```java
public static float crystalDamage(LivingEntity target, Vec3d targetPos, Box targetBox, Vec3d explosionPos, RaycastFactory raycastFactory)
```

## meteordevelopment.meteorclient.utils.entity.DamageUtils.bedDamage

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/entity/DamageUtils.java:76`

```java
public static float bedDamage(LivingEntity target, Vec3d targetPos, Box targetBox, Vec3d explosionPos, RaycastFactory raycastFactory)
```

## meteordevelopment.meteorclient.utils.entity.DamageUtils.anchorDamage

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/entity/DamageUtils.java:80`

```java
public static float anchorDamage(LivingEntity target, Vec3d targetPos, Box targetBox, Vec3d explosionPos, RaycastFactory raycastFactory)
```

## meteordevelopment.meteorclient.utils.entity.DamageUtils.explosionDamage

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/entity/DamageUtils.java:89`

```java
public static float explosionDamage(LivingEntity target, Vec3d targetPos, Box targetBox, Vec3d explosionPos, float power, RaycastFactory raycastFactory)
```

## meteordevelopment.meteorclient.utils.entity.DamageUtils.crystalDamage

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/entity/DamageUtils.java:102`

```java
public static float crystalDamage(LivingEntity target, Vec3d crystal, boolean predictMovement, BlockPos obsidianPos)
```

## meteordevelopment.meteorclient.utils.entity.DamageUtils.crystalDamage

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/entity/DamageUtils.java:106`

```java
public static float crystalDamage(LivingEntity target, Vec3d crystal)
```

## meteordevelopment.meteorclient.utils.entity.DamageUtils.bedDamage

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/entity/DamageUtils.java:110`

```java
public static float bedDamage(LivingEntity target, Vec3d bed)
```

## meteordevelopment.meteorclient.utils.entity.DamageUtils.anchorDamage

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/entity/DamageUtils.java:114`

```java
public static float anchorDamage(LivingEntity target, Vec3d anchor)
```

## meteordevelopment.meteorclient.utils.entity.DamageUtils.getOverridingHitFactory

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/entity/DamageUtils.java:138`

```java
public static RaycastFactory getOverridingHitFactory(BlockPos overridePos, BlockState overrideState)
```

## meteordevelopment.meteorclient.utils.entity.DamageUtils.getAttackDamage

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/entity/DamageUtils.java:156`

```java
public static float getAttackDamage(LivingEntity attacker, Entity target)
```

## meteordevelopment.meteorclient.utils.entity.DamageUtils.getAttackDamage

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/entity/DamageUtils.java:164`

```java
public static float getAttackDamage(LivingEntity attacker, Entity target, ItemStack weapon)
```

## meteordevelopment.meteorclient.utils.entity.DamageUtils.fallDamage

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/entity/DamageUtils.java:243`

```java
public static float fallDamage(LivingEntity entity)
```

## meteordevelopment.meteorclient.utils.entity.DamageUtils.calculateReductions

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/entity/DamageUtils.java:271`

```java
public static float calculateReductions(float damage, Entity entity, DamageSource damageSource)
```

## meteordevelopment.meteorclient.utils.entity.DamageUtils.ExposureRaycastContext

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/entity/DamageUtils.java:406`

```java
public record ExposureRaycastContext(Vec3d start, Vec3d end)
```

## meteordevelopment.meteorclient.utils.entity.DamageUtils.RaycastFactory

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/entity/DamageUtils.java:408`

```java
@FunctionalInterface public interface RaycastFactory extends BiFunction<ExposureRaycastContext, BlockPos, BlockHitResult>
```

## meteordevelopment.meteorclient.utils.entity.EntityUtils

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/entity/EntityUtils.java:41`

```java
public class EntityUtils
```

## meteordevelopment.meteorclient.utils.entity.EntityUtils.isAttackable

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/entity/EntityUtils.java:47`

```java
public static boolean isAttackable(EntityType<?> type)
```

## meteordevelopment.meteorclient.utils.entity.EntityUtils.isRideable

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/entity/EntityUtils.java:51`

```java
public static boolean isRideable(EntityType<?> type)
```

## meteordevelopment.meteorclient.utils.entity.EntityUtils.getTotalHealth

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/entity/EntityUtils.java:89`

```java
public static float getTotalHealth(LivingEntity target)
```

## meteordevelopment.meteorclient.utils.entity.EntityUtils.getPing

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/entity/EntityUtils.java:93`

```java
public static int getPing(PlayerEntity player)
```

## meteordevelopment.meteorclient.utils.entity.EntityUtils.getGameMode

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/entity/EntityUtils.java:101`

```java
public static GameMode getGameMode(PlayerEntity player)
```

## meteordevelopment.meteorclient.utils.entity.EntityUtils.isAboveWater

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/entity/EntityUtils.java:108`

```java
@SuppressWarnings("deprecation") // Use of AbstractBlock.AbstractBlockState#blocksMovement public static boolean isAboveWater(Entity entity)
```

## meteordevelopment.meteorclient.utils.entity.EntityUtils.isInCobweb

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/entity/EntityUtils.java:129`

```java
public static boolean isInCobweb(Entity entity)
```

## meteordevelopment.meteorclient.utils.entity.EntityUtils.isInRenderDistance

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/entity/EntityUtils.java:133`

```java
public static boolean isInRenderDistance(Entity entity)
```

## meteordevelopment.meteorclient.utils.entity.EntityUtils.isInRenderDistance

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/entity/EntityUtils.java:138`

```java
public static boolean isInRenderDistance(BlockEntity entity)
```

## meteordevelopment.meteorclient.utils.entity.EntityUtils.isInRenderDistance

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/entity/EntityUtils.java:143`

```java
public static boolean isInRenderDistance(BlockPos pos)
```

## meteordevelopment.meteorclient.utils.entity.EntityUtils.isInRenderDistance

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/entity/EntityUtils.java:148`

```java
public static boolean isInRenderDistance(double posX, double posZ)
```

## meteordevelopment.meteorclient.utils.entity.EntityUtils.getCityBlock

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/entity/EntityUtils.java:156`

```java
public static BlockPos getCityBlock(PlayerEntity player)
```

## meteordevelopment.meteorclient.utils.entity.EntityUtils.getName

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/entity/EntityUtils.java:180`

```java
public static String getName(Entity entity)
```

## meteordevelopment.meteorclient.utils.entity.EntityUtils.getColorFromDistance

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/entity/EntityUtils.java:186`

```java
public static Color getColorFromDistance(Entity entity)
```

## meteordevelopment.meteorclient.utils.entity.EntityUtils.getColorFromHealth

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/entity/EntityUtils.java:211`

```java
public static Color getColorFromHealth(Entity entity, Color nonLivingEntityColor)
```

## meteordevelopment.meteorclient.utils.entity.EntityUtils.intersectsWithEntity

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/entity/EntityUtils.java:243`

```java
public static boolean intersectsWithEntity(Box box, Predicate<Entity> predicate)
```

## meteordevelopment.meteorclient.utils.entity.EntityUtils.getGroup

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/entity/EntityUtils.java:294`

```java
public static EntityType<?> getGroup(Entity entity)
```

## meteordevelopment.meteorclient.utils.entity.EntityUtils.isOnAir

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/entity/EntityUtils.java:299`

```java
public static boolean isOnAir(Entity entity)
```

## meteordevelopment.meteorclient.utils.entity.SortPriority

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/entity/SortPriority.java:17`

```java
public enum SortPriority implements Comparator<Entity>
```

## meteordevelopment.meteorclient.utils.entity.SortPriority.compare

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/entity/SortPriority.java:30`

```java
@Override public int compare(Entity o1, Entity o2)
```

## meteordevelopment.meteorclient.utils.entity.Target

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/entity/Target.java:8`

```java
public enum Target
```

## meteordevelopment.meteorclient.utils.entity.TargetUtils

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/entity/TargetUtils.java:24`

```java
public class TargetUtils
```

## meteordevelopment.meteorclient.utils.entity.TargetUtils.get

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/entity/TargetUtils.java:30`

```java
@Nullable public static Entity get(Predicate<Entity> isGood, SortPriority sortPriority)
```

## meteordevelopment.meteorclient.utils.entity.TargetUtils.getList

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/entity/TargetUtils.java:41`

```java
public static void getList(List<Entity> targetList, Predicate<Entity> isGood, SortPriority sortPriority, int maxCount)
```

## meteordevelopment.meteorclient.utils.entity.TargetUtils.getPlayerTarget

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/entity/TargetUtils.java:59`

```java
@Nullable public static PlayerEntity getPlayerTarget(double range, SortPriority priority)
```

## meteordevelopment.meteorclient.utils.entity.TargetUtils.isBadTarget

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/entity/TargetUtils.java:72`

```java
public static boolean isBadTarget(PlayerEntity target, double range)
```

## meteordevelopment.meteorclient.utils.entity.fakeplayer.FakePlayerEntity

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/entity/fakeplayer/FakePlayerEntity.java:19`

```java
public class FakePlayerEntity extends OtherClientPlayerEntity
```

## meteordevelopment.meteorclient.utils.entity.fakeplayer.FakePlayerEntity.doNotPush

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/entity/fakeplayer/FakePlayerEntity.java:21`

```java
public boolean doNotPush
```

## meteordevelopment.meteorclient.utils.entity.fakeplayer.FakePlayerEntity.hideWhenInsideCamera

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/entity/fakeplayer/FakePlayerEntity.java:23`

```java
public boolean hideWhenInsideCamera
```

## meteordevelopment.meteorclient.utils.entity.fakeplayer.FakePlayerEntity.noHit

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/entity/fakeplayer/FakePlayerEntity.java:25`

```java
public boolean noHit
```

## meteordevelopment.meteorclient.utils.entity.fakeplayer.FakePlayerEntity.FakePlayerEntity

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/entity/fakeplayer/FakePlayerEntity.java:27`

```java
public FakePlayerEntity(PlayerEntity player, String name, float health, boolean copyInv)
```

## meteordevelopment.meteorclient.utils.entity.fakeplayer.FakePlayerEntity.spawn

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/entity/fakeplayer/FakePlayerEntity.java:52`

```java
public void spawn()
```

## meteordevelopment.meteorclient.utils.entity.fakeplayer.FakePlayerEntity.despawn

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/entity/fakeplayer/FakePlayerEntity.java:57`

```java
public void despawn()
```

## meteordevelopment.meteorclient.utils.entity.fakeplayer.FakePlayerEntity.getPlayerListEntry

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/entity/fakeplayer/FakePlayerEntity.java:62`

```java
@Nullable @Override protected PlayerListEntry getPlayerListEntry()
```

## meteordevelopment.meteorclient.utils.entity.fakeplayer.FakePlayerManager

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/entity/fakeplayer/FakePlayerManager.java:17`

```java
public class FakePlayerManager
```

## meteordevelopment.meteorclient.utils.entity.fakeplayer.FakePlayerManager.getFakePlayers

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/entity/fakeplayer/FakePlayerManager.java:23`

```java
public static List<FakePlayerEntity> getFakePlayers()
```

## meteordevelopment.meteorclient.utils.entity.fakeplayer.FakePlayerManager.get

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/entity/fakeplayer/FakePlayerManager.java:27`

```java
public static FakePlayerEntity get(String name)
```

## meteordevelopment.meteorclient.utils.entity.fakeplayer.FakePlayerManager.add

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/entity/fakeplayer/FakePlayerManager.java:35`

```java
public static void add(String name, float health, boolean copyInv)
```

## meteordevelopment.meteorclient.utils.entity.fakeplayer.FakePlayerManager.remove

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/entity/fakeplayer/FakePlayerManager.java:43`

```java
public static void remove(FakePlayerEntity fp)
```

## meteordevelopment.meteorclient.utils.entity.fakeplayer.FakePlayerManager.clear

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/entity/fakeplayer/FakePlayerManager.java:54`

```java
public static void clear()
```

## meteordevelopment.meteorclient.utils.entity.fakeplayer.FakePlayerManager.forEach

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/entity/fakeplayer/FakePlayerManager.java:60`

```java
public static void forEach(Consumer<FakePlayerEntity> action)
```

## meteordevelopment.meteorclient.utils.entity.fakeplayer.FakePlayerManager.count

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/entity/fakeplayer/FakePlayerManager.java:66`

```java
public static int count()
```

## meteordevelopment.meteorclient.utils.entity.fakeplayer.FakePlayerManager.stream

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/entity/fakeplayer/FakePlayerManager.java:70`

```java
public static Stream<FakePlayerEntity> stream()
```

## meteordevelopment.meteorclient.utils.entity.fakeplayer.FakePlayerManager.contains

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/entity/fakeplayer/FakePlayerManager.java:74`

```java
public static boolean contains(FakePlayerEntity fp)
```

## meteordevelopment.meteorclient.utils.entity.simulator.ProjectileEntitySimulator

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/entity/simulator/ProjectileEntitySimulator.java:40`

```java
public class ProjectileEntitySimulator
```

## meteordevelopment.meteorclient.utils.entity.simulator.ProjectileEntitySimulator.pos

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/entity/simulator/ProjectileEntitySimulator.java:46`

```java
public final Vector3d pos = new Vector3d()
```

## meteordevelopment.meteorclient.utils.entity.simulator.ProjectileEntitySimulator.MotionData

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/entity/simulator/ProjectileEntitySimulator.java:56`

```java
public record MotionData(float power, float roll, double gravity, float airDrag, float waterDrag, EntityType<?> entity)
```

## meteordevelopment.meteorclient.utils.entity.simulator.ProjectileEntitySimulator.MotionData.withPower

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/entity/simulator/ProjectileEntitySimulator.java:57`

```java
public MotionData withPower(float power)
```

## meteordevelopment.meteorclient.utils.entity.simulator.ProjectileEntitySimulator.set

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/entity/simulator/ProjectileEntitySimulator.java:89`

```java
public boolean set(Entity user, ItemStack itemStack, double angleOffset, boolean accurate, float tickDelta)
```

## meteordevelopment.meteorclient.utils.entity.simulator.ProjectileEntitySimulator.set

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/entity/simulator/ProjectileEntitySimulator.java:133`

```java
public void set(Entity user, double angleOffset, boolean accurate, float tickDelta, MotionData data)
```

## meteordevelopment.meteorclient.utils.entity.simulator.ProjectileEntitySimulator.setFishingBobber

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/entity/simulator/ProjectileEntitySimulator.java:180`

```java
public void setFishingBobber(Entity user, float tickDelta, MotionData data)
```

## meteordevelopment.meteorclient.utils.entity.simulator.ProjectileEntitySimulator.set

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/entity/simulator/ProjectileEntitySimulator.java:212`

```java
public boolean set(Entity entity)
```

## meteordevelopment.meteorclient.utils.entity.simulator.ProjectileEntitySimulator.set

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/entity/simulator/ProjectileEntitySimulator.java:241`

```java
public void set(ProjectileEntity entity, MotionData data)
```

## meteordevelopment.meteorclient.utils.entity.simulator.ProjectileEntitySimulator.tick

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/entity/simulator/ProjectileEntitySimulator.java:261`

```java
public SimulationStep tick()
```

## meteordevelopment.meteorclient.utils.entity.simulator.ProjectileEntitySimulator.tickIsTouchingWater

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/entity/simulator/ProjectileEntitySimulator.java:306`

```java
public void tickIsTouchingWater()
```

## meteordevelopment.meteorclient.utils.entity.simulator.SimulationStep

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/entity/simulator/SimulationStep.java:10`

```java
public class SimulationStep
```

## meteordevelopment.meteorclient.utils.entity.simulator.SimulationStep.MISS

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/entity/simulator/SimulationStep.java:11`

```java
public static final SimulationStep MISS = new SimulationStep(true)
```

## meteordevelopment.meteorclient.utils.entity.simulator.SimulationStep.shouldStop

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/entity/simulator/SimulationStep.java:13`

```java
public boolean shouldStop
```

## meteordevelopment.meteorclient.utils.entity.simulator.SimulationStep.hitResults

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/entity/simulator/SimulationStep.java:14`

```java
public HitResult[] hitResults
```

## meteordevelopment.meteorclient.utils.entity.simulator.SimulationStep.SimulationStep

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/entity/simulator/SimulationStep.java:16`

```java
public SimulationStep(boolean stop, HitResult... hitResults)
```
