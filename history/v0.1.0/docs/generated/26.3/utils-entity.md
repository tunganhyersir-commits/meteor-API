# utils/entity

Khai báo Java có cú pháp public/protected. Không bao gồm API kế thừa/tổng hợp bởi compiler; xem kiểm tra bytecode riêng.

## meteordevelopment.meteorclient.utils.entity.DamageUtils

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/entity/DamageUtils.java:53`

```java
public class DamageUtils
```

## meteordevelopment.meteorclient.utils.entity.DamageUtils.HIT_FACTORY

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/entity/DamageUtils.java:65`

```java
public static final RaycastFactory HIT_FACTORY = (context, blockPos) -> { BlockState blockState = mc.level.getBlockState(blockPos); if (blockState.getBlock().getExplosionResistance() < 600) return null; return blockState.getCollisionShape(mc.level, blockPos).clip(context.start(), context.end(), blockPos); }
```

## meteordevelopment.meteorclient.utils.entity.DamageUtils.crystalDamage

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/entity/DamageUtils.java:72`

```java
public static float crystalDamage(LivingEntity target, Vec3 targetPos, AABB targetBox, Vec3 explosionPos, RaycastFactory raycastFactory)
```

## meteordevelopment.meteorclient.utils.entity.DamageUtils.bedDamage

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/entity/DamageUtils.java:76`

```java
public static float bedDamage(LivingEntity target, Vec3 targetPos, AABB targetBox, Vec3 explosionPos, RaycastFactory raycastFactory)
```

## meteordevelopment.meteorclient.utils.entity.DamageUtils.anchorDamage

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/entity/DamageUtils.java:80`

```java
public static float anchorDamage(LivingEntity target, Vec3 targetPos, AABB targetBox, Vec3 explosionPos, RaycastFactory raycastFactory)
```

## meteordevelopment.meteorclient.utils.entity.DamageUtils.explosionDamage

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/entity/DamageUtils.java:90`

```java
public static float explosionDamage(LivingEntity target, Vec3 targetPos, AABB targetBox, Vec3 explosionPos, float power, RaycastFactory raycastFactory)
```

## meteordevelopment.meteorclient.utils.entity.DamageUtils.crystalDamage

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/entity/DamageUtils.java:105`

```java
public static float crystalDamage(LivingEntity target, Vec3 crystal, boolean predictMovement, BlockPos obsidianPos)
```

## meteordevelopment.meteorclient.utils.entity.DamageUtils.crystalDamage

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/entity/DamageUtils.java:109`

```java
public static float crystalDamage(LivingEntity target, Vec3 crystal)
```

## meteordevelopment.meteorclient.utils.entity.DamageUtils.bedDamage

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/entity/DamageUtils.java:113`

```java
public static float bedDamage(LivingEntity target, Vec3 bed)
```

## meteordevelopment.meteorclient.utils.entity.DamageUtils.anchorDamage

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/entity/DamageUtils.java:117`

```java
public static float anchorDamage(LivingEntity target, Vec3 anchor)
```

## meteordevelopment.meteorclient.utils.entity.DamageUtils.getOverridingHitFactory

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/entity/DamageUtils.java:142`

```java
public static RaycastFactory getOverridingHitFactory(BlockPos overridePos, BlockState overrideState)
```

## meteordevelopment.meteorclient.utils.entity.DamageUtils.getAttackDamage

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/entity/DamageUtils.java:160`

```java
public static float getAttackDamage(LivingEntity attacker, Entity target)
```

## meteordevelopment.meteorclient.utils.entity.DamageUtils.getAttackDamage

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/entity/DamageUtils.java:168`

```java
public static float getAttackDamage(LivingEntity attacker, Entity target, ItemStack weapon)
```

## meteordevelopment.meteorclient.utils.entity.DamageUtils.fallDamage

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/entity/DamageUtils.java:248`

```java
public static float fallDamage(LivingEntity entity)
```

## meteordevelopment.meteorclient.utils.entity.DamageUtils.calculateReductions

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/entity/DamageUtils.java:276`

```java
public static float calculateReductions(float damage, Entity entity, DamageSource damageSource)
```

## meteordevelopment.meteorclient.utils.entity.DamageUtils.ExposureRaycastContext

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/entity/DamageUtils.java:412`

```java
public record ExposureRaycastContext(Vec3 start, Vec3 end)
```

## meteordevelopment.meteorclient.utils.entity.DamageUtils.RaycastFactory

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/entity/DamageUtils.java:415`

```java
@FunctionalInterface public interface RaycastFactory extends BiFunction<ExposureRaycastContext, BlockPos, BlockHitResult>
```

## meteordevelopment.meteorclient.utils.entity.EntityAgeTest

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/entity/EntityAgeTest.java:14`

```java
@NullMarked public enum EntityAgeTest implements Predicate<LivingEntity>
```

## meteordevelopment.meteorclient.utils.entity.EntityAgeTest.test

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/entity/EntityAgeTest.java:21`

```java
@Override public boolean test(LivingEntity livingEntity)
```

## meteordevelopment.meteorclient.utils.entity.EntityAgeTest.negate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/entity/EntityAgeTest.java:30`

```java
@Override public Predicate<LivingEntity> negate()
```

## meteordevelopment.meteorclient.utils.entity.EntityUtils

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/entity/EntityUtils.java:42`

```java
public class EntityUtils
```

## meteordevelopment.meteorclient.utils.entity.EntityUtils.isAttackable

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/entity/EntityUtils.java:48`

```java
public static boolean isAttackable(EntityType<?> type)
```

## meteordevelopment.meteorclient.utils.entity.EntityUtils.isRideable

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/entity/EntityUtils.java:52`

```java
public static boolean isRideable(EntityType<?> type)
```

## meteordevelopment.meteorclient.utils.entity.EntityUtils.getTotalHealth

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/entity/EntityUtils.java:90`

```java
public static float getTotalHealth(LivingEntity target)
```

## meteordevelopment.meteorclient.utils.entity.EntityUtils.getPing

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/entity/EntityUtils.java:94`

```java
public static int getPing(Player player)
```

## meteordevelopment.meteorclient.utils.entity.EntityUtils.getGameMode

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/entity/EntityUtils.java:102`

```java
public static GameType getGameMode(Player player)
```

## meteordevelopment.meteorclient.utils.entity.EntityUtils.isAboveWater

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/entity/EntityUtils.java:109`

```java
public static boolean isAboveWater(Entity entity)
```

## meteordevelopment.meteorclient.utils.entity.EntityUtils.isInCobweb

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/entity/EntityUtils.java:131`

```java
public static boolean isInCobweb(Entity entity)
```

## meteordevelopment.meteorclient.utils.entity.EntityUtils.isInRenderDistance

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/entity/EntityUtils.java:135`

```java
public static boolean isInRenderDistance(Entity entity)
```

## meteordevelopment.meteorclient.utils.entity.EntityUtils.isInRenderDistance

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/entity/EntityUtils.java:140`

```java
public static boolean isInRenderDistance(BlockEntity entity)
```

## meteordevelopment.meteorclient.utils.entity.EntityUtils.isInRenderDistance

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/entity/EntityUtils.java:145`

```java
public static boolean isInRenderDistance(BlockPos pos)
```

## meteordevelopment.meteorclient.utils.entity.EntityUtils.isInRenderDistance

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/entity/EntityUtils.java:150`

```java
public static boolean isInRenderDistance(double posX, double posZ)
```

## meteordevelopment.meteorclient.utils.entity.EntityUtils.getCityBlock

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/entity/EntityUtils.java:158`

```java
public static BlockPos getCityBlock(Player player)
```

## meteordevelopment.meteorclient.utils.entity.EntityUtils.getName

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/entity/EntityUtils.java:182`

```java
public static String getName(Entity entity)
```

## meteordevelopment.meteorclient.utils.entity.EntityUtils.getColorFromDistance

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/entity/EntityUtils.java:188`

```java
public static Color getColorFromDistance(Entity entity)
```

## meteordevelopment.meteorclient.utils.entity.EntityUtils.getColorFromHealth

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/entity/EntityUtils.java:213`

```java
public static Color getColorFromHealth(Entity entity, Color nonLivingEntityColor)
```

## meteordevelopment.meteorclient.utils.entity.EntityUtils.intersectsWithEntity

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/entity/EntityUtils.java:245`

```java
public static boolean intersectsWithEntity(AABB box, Predicate<Entity> predicate)
```

## meteordevelopment.meteorclient.utils.entity.EntityUtils.getGroup

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/entity/EntityUtils.java:296`

```java
public static EntityType<?> getGroup(Entity entity)
```

## meteordevelopment.meteorclient.utils.entity.EntityUtils.isOnAir

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/entity/EntityUtils.java:301`

```java
public static boolean isOnAir(Entity entity)
```

## meteordevelopment.meteorclient.utils.entity.SortPriority

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/entity/SortPriority.java:17`

```java
public enum SortPriority implements Comparator<Entity>
```

## meteordevelopment.meteorclient.utils.entity.SortPriority.compare

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/entity/SortPriority.java:30`

```java
@Override public int compare(Entity o1, Entity o2)
```

## meteordevelopment.meteorclient.utils.entity.Target

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/entity/Target.java:8`

```java
public enum Target
```

## meteordevelopment.meteorclient.utils.entity.TargetUtils

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/entity/TargetUtils.java:24`

```java
public class TargetUtils
```

## meteordevelopment.meteorclient.utils.entity.TargetUtils.get

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/entity/TargetUtils.java:30`

```java
@Nullable public static Entity get(Predicate<Entity> isGood, SortPriority sortPriority)
```

## meteordevelopment.meteorclient.utils.entity.TargetUtils.getList

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/entity/TargetUtils.java:41`

```java
public static void getList(List<Entity> targetList, Predicate<Entity> isGood, SortPriority sortPriority, int maxCount)
```

## meteordevelopment.meteorclient.utils.entity.TargetUtils.getPlayerTarget

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/entity/TargetUtils.java:59`

```java
@Nullable public static Player getPlayerTarget(double range, SortPriority priority)
```

## meteordevelopment.meteorclient.utils.entity.TargetUtils.isBadTarget

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/entity/TargetUtils.java:72`

```java
public static boolean isBadTarget(Player target, double range)
```

## meteordevelopment.meteorclient.utils.entity.fakeplayer.FakePlayerEntity

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/entity/fakeplayer/FakePlayerEntity.java:20`

```java
public class FakePlayerEntity extends RemotePlayer
```

## meteordevelopment.meteorclient.utils.entity.fakeplayer.FakePlayerEntity.doNotPush

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/entity/fakeplayer/FakePlayerEntity.java:24`

```java
public boolean doNotPush
```

## meteordevelopment.meteorclient.utils.entity.fakeplayer.FakePlayerEntity.hideWhenInsideCamera

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/entity/fakeplayer/FakePlayerEntity.java:28`

```java
public boolean hideWhenInsideCamera
```

## meteordevelopment.meteorclient.utils.entity.fakeplayer.FakePlayerEntity.noHit

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/entity/fakeplayer/FakePlayerEntity.java:32`

```java
public boolean noHit
```

## meteordevelopment.meteorclient.utils.entity.fakeplayer.FakePlayerEntity.FakePlayerEntity

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/entity/fakeplayer/FakePlayerEntity.java:34`

```java
public FakePlayerEntity(Player player, String name, float health, boolean copyInv)
```

## meteordevelopment.meteorclient.utils.entity.fakeplayer.FakePlayerEntity.getId

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/entity/fakeplayer/FakePlayerEntity.java:59`

```java
@Override public int getId()
```

## meteordevelopment.meteorclient.utils.entity.fakeplayer.FakePlayerEntity.spawn

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/entity/fakeplayer/FakePlayerEntity.java:64`

```java
public void spawn()
```

## meteordevelopment.meteorclient.utils.entity.fakeplayer.FakePlayerEntity.despawn

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/entity/fakeplayer/FakePlayerEntity.java:69`

```java
public void despawn()
```

## meteordevelopment.meteorclient.utils.entity.fakeplayer.FakePlayerEntity.getPlayerInfo

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/entity/fakeplayer/FakePlayerEntity.java:74`

```java
@Nullable @Override protected PlayerInfo getPlayerInfo()
```

## meteordevelopment.meteorclient.utils.entity.fakeplayer.FakePlayerManager

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/entity/fakeplayer/FakePlayerManager.java:17`

```java
public class FakePlayerManager
```

## meteordevelopment.meteorclient.utils.entity.fakeplayer.FakePlayerManager.getFakePlayers

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/entity/fakeplayer/FakePlayerManager.java:23`

```java
public static List<FakePlayerEntity> getFakePlayers()
```

## meteordevelopment.meteorclient.utils.entity.fakeplayer.FakePlayerManager.get

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/entity/fakeplayer/FakePlayerManager.java:27`

```java
public static FakePlayerEntity get(String name)
```

## meteordevelopment.meteorclient.utils.entity.fakeplayer.FakePlayerManager.add

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/entity/fakeplayer/FakePlayerManager.java:35`

```java
public static void add(String name, float health, boolean copyInv)
```

## meteordevelopment.meteorclient.utils.entity.fakeplayer.FakePlayerManager.remove

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/entity/fakeplayer/FakePlayerManager.java:43`

```java
public static void remove(FakePlayerEntity fp)
```

## meteordevelopment.meteorclient.utils.entity.fakeplayer.FakePlayerManager.clear

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/entity/fakeplayer/FakePlayerManager.java:54`

```java
public static void clear()
```

## meteordevelopment.meteorclient.utils.entity.fakeplayer.FakePlayerManager.forEach

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/entity/fakeplayer/FakePlayerManager.java:60`

```java
public static void forEach(Consumer<FakePlayerEntity> action)
```

## meteordevelopment.meteorclient.utils.entity.fakeplayer.FakePlayerManager.count

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/entity/fakeplayer/FakePlayerManager.java:66`

```java
public static int count()
```

## meteordevelopment.meteorclient.utils.entity.fakeplayer.FakePlayerManager.stream

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/entity/fakeplayer/FakePlayerManager.java:70`

```java
public static Stream<FakePlayerEntity> stream()
```

## meteordevelopment.meteorclient.utils.entity.fakeplayer.FakePlayerManager.contains

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/entity/fakeplayer/FakePlayerManager.java:74`

```java
public static boolean contains(FakePlayerEntity fp)
```

## meteordevelopment.meteorclient.utils.entity.simulator.ProjectileEntitySimulator

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/entity/simulator/ProjectileEntitySimulator.java:45`

```java
public class ProjectileEntitySimulator
```

## meteordevelopment.meteorclient.utils.entity.simulator.ProjectileEntitySimulator.pos

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/entity/simulator/ProjectileEntitySimulator.java:51`

```java
public final Vector3d pos = new Vector3d()
```

## meteordevelopment.meteorclient.utils.entity.simulator.ProjectileEntitySimulator.MotionData

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/entity/simulator/ProjectileEntitySimulator.java:61`

```java
public record MotionData( float power, float roll, double gravity, float airDrag, float waterDrag, EntityType<?> entity )
```

## meteordevelopment.meteorclient.utils.entity.simulator.ProjectileEntitySimulator.MotionData.withPower

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/entity/simulator/ProjectileEntitySimulator.java:69`

```java
public MotionData withPower(float power)
```

## meteordevelopment.meteorclient.utils.entity.simulator.ProjectileEntitySimulator.set

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/entity/simulator/ProjectileEntitySimulator.java:101`

```java
public boolean set(Entity user, ItemStack itemStack, double angleOffset, boolean accurate, float tickDelta)
```

## meteordevelopment.meteorclient.utils.entity.simulator.ProjectileEntitySimulator.set

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/entity/simulator/ProjectileEntitySimulator.java:144`

```java
public void set(Entity user, double angleOffset, boolean accurate, float tickDelta, MotionData data)
```

## meteordevelopment.meteorclient.utils.entity.simulator.ProjectileEntitySimulator.setFishingBobber

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/entity/simulator/ProjectileEntitySimulator.java:191`

```java
public void setFishingBobber(Entity user, float tickDelta, MotionData data)
```

## meteordevelopment.meteorclient.utils.entity.simulator.ProjectileEntitySimulator.set

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/entity/simulator/ProjectileEntitySimulator.java:224`

```java
public boolean set(Entity entity)
```

## meteordevelopment.meteorclient.utils.entity.simulator.ProjectileEntitySimulator.set

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/entity/simulator/ProjectileEntitySimulator.java:253`

```java
public void set(Projectile entity, MotionData data)
```

## meteordevelopment.meteorclient.utils.entity.simulator.ProjectileEntitySimulator.tick

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/entity/simulator/ProjectileEntitySimulator.java:273`

```java
public SimulationStep tick()
```

## meteordevelopment.meteorclient.utils.entity.simulator.ProjectileEntitySimulator.tickIsTouchingWater

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/entity/simulator/ProjectileEntitySimulator.java:318`

```java
public void tickIsTouchingWater()
```

## meteordevelopment.meteorclient.utils.entity.simulator.SimulationStep

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/entity/simulator/SimulationStep.java:10`

```java
public class SimulationStep
```

## meteordevelopment.meteorclient.utils.entity.simulator.SimulationStep.MISS

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/entity/simulator/SimulationStep.java:11`

```java
public static final SimulationStep MISS = new SimulationStep(true)
```

## meteordevelopment.meteorclient.utils.entity.simulator.SimulationStep.shouldStop

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/entity/simulator/SimulationStep.java:13`

```java
public boolean shouldStop
```

## meteordevelopment.meteorclient.utils.entity.simulator.SimulationStep.hitResults

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/entity/simulator/SimulationStep.java:14`

```java
public HitResult[] hitResults
```

## meteordevelopment.meteorclient.utils.entity.simulator.SimulationStep.SimulationStep

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/entity/simulator/SimulationStep.java:16`

```java
public SimulationStep(boolean stop, HitResult... hitResults)
```
