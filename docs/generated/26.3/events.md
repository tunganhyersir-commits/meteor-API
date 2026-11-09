# events

Khai báo Java có cú pháp public/protected. Không bao gồm API kế thừa/tổng hợp bởi compiler; xem kiểm tra bytecode riêng.

## meteordevelopment.meteorclient.events.Cancellable

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/Cancellable.java:10`

```java
public class Cancellable implements ICancellable
```

## meteordevelopment.meteorclient.events.Cancellable.setCancelled

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/Cancellable.java:13`

```java
@Override public void setCancelled(boolean cancelled)
```

## meteordevelopment.meteorclient.events.Cancellable.isCancelled

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/Cancellable.java:18`

```java
@Override public boolean isCancelled()
```

## meteordevelopment.meteorclient.events.entity.BoatMoveEvent

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/entity/BoatMoveEvent.java:10`

```java
public class BoatMoveEvent
```

## meteordevelopment.meteorclient.events.entity.BoatMoveEvent.boat

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/entity/BoatMoveEvent.java:13`

```java
public AbstractBoat boat
```

## meteordevelopment.meteorclient.events.entity.BoatMoveEvent.get

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/entity/BoatMoveEvent.java:15`

```java
public static BoatMoveEvent get(AbstractBoat entity)
```

## meteordevelopment.meteorclient.events.entity.DropItemsEvent

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/entity/DropItemsEvent.java:11`

```java
public class DropItemsEvent extends Cancellable
```

## meteordevelopment.meteorclient.events.entity.DropItemsEvent.itemStack

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/entity/DropItemsEvent.java:14`

```java
public ItemStack itemStack
```

## meteordevelopment.meteorclient.events.entity.DropItemsEvent.get

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/entity/DropItemsEvent.java:16`

```java
public static DropItemsEvent get(ItemStack itemStack)
```

## meteordevelopment.meteorclient.events.entity.EntityAddedEvent

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/entity/EntityAddedEvent.java:10`

```java
public class EntityAddedEvent
```

## meteordevelopment.meteorclient.events.entity.EntityAddedEvent.entity

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/entity/EntityAddedEvent.java:13`

```java
public Entity entity
```

## meteordevelopment.meteorclient.events.entity.EntityAddedEvent.get

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/entity/EntityAddedEvent.java:15`

```java
public static EntityAddedEvent get(Entity entity)
```

## meteordevelopment.meteorclient.events.entity.EntityDestroyEvent

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/entity/EntityDestroyEvent.java:10`

```java
public class EntityDestroyEvent
```

## meteordevelopment.meteorclient.events.entity.EntityDestroyEvent.entity

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/entity/EntityDestroyEvent.java:13`

```java
public Entity entity
```

## meteordevelopment.meteorclient.events.entity.EntityDestroyEvent.get

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/entity/EntityDestroyEvent.java:15`

```java
public static EntityDestroyEvent get(Entity entity)
```

## meteordevelopment.meteorclient.events.entity.EntityMoveEvent

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/entity/EntityMoveEvent.java:11`

```java
public class EntityMoveEvent
```

## meteordevelopment.meteorclient.events.entity.EntityMoveEvent.entity

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/entity/EntityMoveEvent.java:14`

```java
public Entity entity
```

## meteordevelopment.meteorclient.events.entity.EntityMoveEvent.movement

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/entity/EntityMoveEvent.java:15`

```java
public Vec3 movement
```

## meteordevelopment.meteorclient.events.entity.EntityMoveEvent.get

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/entity/EntityMoveEvent.java:17`

```java
public static EntityMoveEvent get(Entity entity, Vec3 movement)
```

## meteordevelopment.meteorclient.events.entity.EntityRemovedEvent

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/entity/EntityRemovedEvent.java:10`

```java
public class EntityRemovedEvent
```

## meteordevelopment.meteorclient.events.entity.EntityRemovedEvent.entity

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/entity/EntityRemovedEvent.java:13`

```java
public Entity entity
```

## meteordevelopment.meteorclient.events.entity.EntityRemovedEvent.get

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/entity/EntityRemovedEvent.java:15`

```java
public static EntityRemovedEvent get(Entity entity)
```

## meteordevelopment.meteorclient.events.entity.player.AttackEntityEvent

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/entity/player/AttackEntityEvent.java:11`

```java
public class AttackEntityEvent extends Cancellable
```

## meteordevelopment.meteorclient.events.entity.player.AttackEntityEvent.entity

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/entity/player/AttackEntityEvent.java:14`

```java
public Entity entity
```

## meteordevelopment.meteorclient.events.entity.player.AttackEntityEvent.get

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/entity/player/AttackEntityEvent.java:16`

```java
public static AttackEntityEvent get(Entity entity)
```

## meteordevelopment.meteorclient.events.entity.player.BlockBreakingCooldownEvent

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/entity/player/BlockBreakingCooldownEvent.java:8`

```java
public class BlockBreakingCooldownEvent
```

## meteordevelopment.meteorclient.events.entity.player.BlockBreakingCooldownEvent.cooldown

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/entity/player/BlockBreakingCooldownEvent.java:11`

```java
public int cooldown
```

## meteordevelopment.meteorclient.events.entity.player.BlockBreakingCooldownEvent.get

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/entity/player/BlockBreakingCooldownEvent.java:13`

```java
public static BlockBreakingCooldownEvent get(int cooldown)
```

## meteordevelopment.meteorclient.events.entity.player.BreakBlockEvent

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/entity/player/BreakBlockEvent.java:11`

```java
public class BreakBlockEvent extends Cancellable
```

## meteordevelopment.meteorclient.events.entity.player.BreakBlockEvent.blockPos

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/entity/player/BreakBlockEvent.java:14`

```java
public BlockPos blockPos
```

## meteordevelopment.meteorclient.events.entity.player.BreakBlockEvent.get

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/entity/player/BreakBlockEvent.java:16`

```java
public static BreakBlockEvent get(BlockPos blockPos)
```

## meteordevelopment.meteorclient.events.entity.player.CanWalkOnFluidEvent

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/entity/player/CanWalkOnFluidEvent.java:22`

```java
public class CanWalkOnFluidEvent
```

## meteordevelopment.meteorclient.events.entity.player.CanWalkOnFluidEvent.fluidState

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/entity/player/CanWalkOnFluidEvent.java:25`

```java
public FluidState fluidState
```

## meteordevelopment.meteorclient.events.entity.player.CanWalkOnFluidEvent.walkOnFluid

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/entity/player/CanWalkOnFluidEvent.java:26`

```java
public boolean walkOnFluid
```

## meteordevelopment.meteorclient.events.entity.player.CanWalkOnFluidEvent.get

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/entity/player/CanWalkOnFluidEvent.java:28`

```java
public static CanWalkOnFluidEvent get(FluidState fluid)
```

## meteordevelopment.meteorclient.events.entity.player.ClipAtLedgeEvent

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/entity/player/ClipAtLedgeEvent.java:8`

```java
public class ClipAtLedgeEvent
```

## meteordevelopment.meteorclient.events.entity.player.ClipAtLedgeEvent.reset

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/entity/player/ClipAtLedgeEvent.java:13`

```java
public void reset()
```

## meteordevelopment.meteorclient.events.entity.player.ClipAtLedgeEvent.setClip

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/entity/player/ClipAtLedgeEvent.java:17`

```java
public void setClip(boolean clip)
```

## meteordevelopment.meteorclient.events.entity.player.ClipAtLedgeEvent.isSet

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/entity/player/ClipAtLedgeEvent.java:22`

```java
public boolean isSet()
```

## meteordevelopment.meteorclient.events.entity.player.ClipAtLedgeEvent.isClip

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/entity/player/ClipAtLedgeEvent.java:25`

```java
public boolean isClip()
```

## meteordevelopment.meteorclient.events.entity.player.ClipAtLedgeEvent.get

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/entity/player/ClipAtLedgeEvent.java:29`

```java
public static ClipAtLedgeEvent get()
```

## meteordevelopment.meteorclient.events.entity.player.DoAttackEvent

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/entity/player/DoAttackEvent.java:10`

```java
public class DoAttackEvent extends Cancellable
```

## meteordevelopment.meteorclient.events.entity.player.DoAttackEvent.get

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/entity/player/DoAttackEvent.java:13`

```java
public static DoAttackEvent get()
```

## meteordevelopment.meteorclient.events.entity.player.DoItemUseEvent

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/entity/player/DoItemUseEvent.java:15`

```java
public class DoItemUseEvent extends Cancellable
```

## meteordevelopment.meteorclient.events.entity.player.DoItemUseEvent.get

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/entity/player/DoItemUseEvent.java:18`

```java
public static DoItemUseEvent get()
```

## meteordevelopment.meteorclient.events.entity.player.FinishUsingItemEvent

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/entity/player/FinishUsingItemEvent.java:10`

```java
public class FinishUsingItemEvent
```

## meteordevelopment.meteorclient.events.entity.player.FinishUsingItemEvent.itemStack

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/entity/player/FinishUsingItemEvent.java:13`

```java
public ItemStack itemStack
```

## meteordevelopment.meteorclient.events.entity.player.FinishUsingItemEvent.get

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/entity/player/FinishUsingItemEvent.java:15`

```java
public static FinishUsingItemEvent get(ItemStack itemStack)
```

## meteordevelopment.meteorclient.events.entity.player.InteractBlockEvent

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/entity/player/InteractBlockEvent.java:12`

```java
public class InteractBlockEvent extends Cancellable
```

## meteordevelopment.meteorclient.events.entity.player.InteractBlockEvent.hand

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/entity/player/InteractBlockEvent.java:15`

```java
public InteractionHand hand
```

## meteordevelopment.meteorclient.events.entity.player.InteractBlockEvent.result

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/entity/player/InteractBlockEvent.java:16`

```java
public BlockHitResult result
```

## meteordevelopment.meteorclient.events.entity.player.InteractBlockEvent.get

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/entity/player/InteractBlockEvent.java:18`

```java
public static InteractBlockEvent get(InteractionHand hand, BlockHitResult result)
```

## meteordevelopment.meteorclient.events.entity.player.InteractEntityEvent

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/entity/player/InteractEntityEvent.java:12`

```java
public class InteractEntityEvent extends Cancellable
```

## meteordevelopment.meteorclient.events.entity.player.InteractEntityEvent.entity

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/entity/player/InteractEntityEvent.java:15`

```java
public Entity entity
```

## meteordevelopment.meteorclient.events.entity.player.InteractEntityEvent.hand

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/entity/player/InteractEntityEvent.java:16`

```java
public InteractionHand hand
```

## meteordevelopment.meteorclient.events.entity.player.InteractEntityEvent.get

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/entity/player/InteractEntityEvent.java:18`

```java
public static InteractEntityEvent get(Entity entity, InteractionHand hand)
```

## meteordevelopment.meteorclient.events.entity.player.InteractItemEvent

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/entity/player/InteractItemEvent.java:11`

```java
public class InteractItemEvent
```

## meteordevelopment.meteorclient.events.entity.player.InteractItemEvent.hand

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/entity/player/InteractItemEvent.java:14`

```java
public InteractionHand hand
```

## meteordevelopment.meteorclient.events.entity.player.InteractItemEvent.toReturn

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/entity/player/InteractItemEvent.java:15`

```java
public InteractionResult toReturn
```

## meteordevelopment.meteorclient.events.entity.player.InteractItemEvent.get

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/entity/player/InteractItemEvent.java:17`

```java
public static InteractItemEvent get(InteractionHand hand)
```

## meteordevelopment.meteorclient.events.entity.player.ItemUseCrosshairTargetEvent

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/entity/player/ItemUseCrosshairTargetEvent.java:10`

```java
public class ItemUseCrosshairTargetEvent
```

## meteordevelopment.meteorclient.events.entity.player.ItemUseCrosshairTargetEvent.target

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/entity/player/ItemUseCrosshairTargetEvent.java:13`

```java
public HitResult target
```

## meteordevelopment.meteorclient.events.entity.player.ItemUseCrosshairTargetEvent.get

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/entity/player/ItemUseCrosshairTargetEvent.java:15`

```java
public static ItemUseCrosshairTargetEvent get(HitResult target)
```

## meteordevelopment.meteorclient.events.entity.player.JumpVelocityMultiplierEvent

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/entity/player/JumpVelocityMultiplierEvent.java:8`

```java
public class JumpVelocityMultiplierEvent
```

## meteordevelopment.meteorclient.events.entity.player.JumpVelocityMultiplierEvent.multiplier

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/entity/player/JumpVelocityMultiplierEvent.java:11`

```java
public float multiplier = 1
```

## meteordevelopment.meteorclient.events.entity.player.JumpVelocityMultiplierEvent.get

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/entity/player/JumpVelocityMultiplierEvent.java:13`

```java
public static JumpVelocityMultiplierEvent get()
```

## meteordevelopment.meteorclient.events.entity.player.PickItemsEvent

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/entity/player/PickItemsEvent.java:10`

```java
public class PickItemsEvent
```

## meteordevelopment.meteorclient.events.entity.player.PickItemsEvent.itemStack

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/entity/player/PickItemsEvent.java:13`

```java
public ItemStack itemStack
```

## meteordevelopment.meteorclient.events.entity.player.PickItemsEvent.count

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/entity/player/PickItemsEvent.java:14`

```java
public int count
```

## meteordevelopment.meteorclient.events.entity.player.PickItemsEvent.get

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/entity/player/PickItemsEvent.java:16`

```java
public static PickItemsEvent get(ItemStack itemStack, int count)
```

## meteordevelopment.meteorclient.events.entity.player.PlaceBlockEvent

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/entity/player/PlaceBlockEvent.java:12`

```java
public class PlaceBlockEvent extends Cancellable
```

## meteordevelopment.meteorclient.events.entity.player.PlaceBlockEvent.blockPos

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/entity/player/PlaceBlockEvent.java:15`

```java
public BlockPos blockPos
```

## meteordevelopment.meteorclient.events.entity.player.PlaceBlockEvent.block

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/entity/player/PlaceBlockEvent.java:16`

```java
public Block block
```

## meteordevelopment.meteorclient.events.entity.player.PlaceBlockEvent.get

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/entity/player/PlaceBlockEvent.java:18`

```java
public static PlaceBlockEvent get(BlockPos blockPos, Block block)
```

## meteordevelopment.meteorclient.events.entity.player.PlayerMoveEvent

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/entity/player/PlayerMoveEvent.java:11`

```java
public class PlayerMoveEvent
```

## meteordevelopment.meteorclient.events.entity.player.PlayerMoveEvent.type

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/entity/player/PlayerMoveEvent.java:14`

```java
public MoverType type
```

## meteordevelopment.meteorclient.events.entity.player.PlayerMoveEvent.movement

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/entity/player/PlayerMoveEvent.java:15`

```java
public Vec3 movement
```

## meteordevelopment.meteorclient.events.entity.player.PlayerMoveEvent.get

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/entity/player/PlayerMoveEvent.java:17`

```java
public static PlayerMoveEvent get(MoverType type, Vec3 movement)
```

## meteordevelopment.meteorclient.events.entity.player.PlayerTickMovementEvent

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/entity/player/PlayerTickMovementEvent.java:11`

```java
public class PlayerTickMovementEvent
```

## meteordevelopment.meteorclient.events.entity.player.PlayerTickMovementEvent.get

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/entity/player/PlayerTickMovementEvent.java:14`

```java
public static PlayerTickMovementEvent get()
```

## meteordevelopment.meteorclient.events.entity.player.SendMovementPacketsEvent

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/entity/player/SendMovementPacketsEvent.java:8`

```java
public class SendMovementPacketsEvent
```

## meteordevelopment.meteorclient.events.entity.player.SendMovementPacketsEvent.Pre

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/entity/player/SendMovementPacketsEvent.java:9`

```java
public static class Pre
```

## meteordevelopment.meteorclient.events.entity.player.SendMovementPacketsEvent.Pre.get

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/entity/player/SendMovementPacketsEvent.java:12`

```java
public static Pre get()
```

## meteordevelopment.meteorclient.events.entity.player.SendMovementPacketsEvent.Post

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/entity/player/SendMovementPacketsEvent.java:17`

```java
public static class Post
```

## meteordevelopment.meteorclient.events.entity.player.SendMovementPacketsEvent.Post.get

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/entity/player/SendMovementPacketsEvent.java:20`

```java
public static Post get()
```

## meteordevelopment.meteorclient.events.entity.player.StartBreakingBlockEvent

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/entity/player/StartBreakingBlockEvent.java:12`

```java
public class StartBreakingBlockEvent extends Cancellable
```

## meteordevelopment.meteorclient.events.entity.player.StartBreakingBlockEvent.blockPos

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/entity/player/StartBreakingBlockEvent.java:15`

```java
public BlockPos blockPos
```

## meteordevelopment.meteorclient.events.entity.player.StartBreakingBlockEvent.direction

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/entity/player/StartBreakingBlockEvent.java:16`

```java
public Direction direction
```

## meteordevelopment.meteorclient.events.entity.player.StartBreakingBlockEvent.get

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/entity/player/StartBreakingBlockEvent.java:18`

```java
public static StartBreakingBlockEvent get(BlockPos blockPos, Direction direction)
```

## meteordevelopment.meteorclient.events.entity.player.StoppedUsingItemEvent

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/entity/player/StoppedUsingItemEvent.java:10`

```java
public class StoppedUsingItemEvent
```

## meteordevelopment.meteorclient.events.entity.player.StoppedUsingItemEvent.itemStack

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/entity/player/StoppedUsingItemEvent.java:13`

```java
public ItemStack itemStack
```

## meteordevelopment.meteorclient.events.entity.player.StoppedUsingItemEvent.get

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/entity/player/StoppedUsingItemEvent.java:15`

```java
public static StoppedUsingItemEvent get(ItemStack itemStack)
```

## meteordevelopment.meteorclient.events.game.ChangePerspectiveEvent

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/game/ChangePerspectiveEvent.java:11`

```java
public class ChangePerspectiveEvent extends Cancellable
```

## meteordevelopment.meteorclient.events.game.ChangePerspectiveEvent.perspective

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/game/ChangePerspectiveEvent.java:14`

```java
public CameraType perspective
```

## meteordevelopment.meteorclient.events.game.ChangePerspectiveEvent.get

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/game/ChangePerspectiveEvent.java:16`

```java
public static ChangePerspectiveEvent get(CameraType perspective)
```

## meteordevelopment.meteorclient.events.game.GameJoinedEvent

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/game/GameJoinedEvent.java:8`

```java
public class GameJoinedEvent
```

## meteordevelopment.meteorclient.events.game.GameJoinedEvent.get

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/game/GameJoinedEvent.java:11`

```java
public static GameJoinedEvent get()
```

## meteordevelopment.meteorclient.events.game.GameLeftEvent

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/game/GameLeftEvent.java:8`

```java
public class GameLeftEvent
```

## meteordevelopment.meteorclient.events.game.GameLeftEvent.get

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/game/GameLeftEvent.java:11`

```java
public static GameLeftEvent get()
```

## meteordevelopment.meteorclient.events.game.ItemStackTooltipEvent

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/game/ItemStackTooltipEvent.java:14`

```java
public class ItemStackTooltipEvent
```

## meteordevelopment.meteorclient.events.game.ItemStackTooltipEvent.ItemStackTooltipEvent

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/game/ItemStackTooltipEvent.java:18`

```java
public ItemStackTooltipEvent(ItemStack itemStack, List<Component> list)
```

## meteordevelopment.meteorclient.events.game.ItemStackTooltipEvent.list

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/game/ItemStackTooltipEvent.java:23`

```java
public List<Component> list()
```

## meteordevelopment.meteorclient.events.game.ItemStackTooltipEvent.itemStack

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/game/ItemStackTooltipEvent.java:27`

```java
public ItemStack itemStack()
```

## meteordevelopment.meteorclient.events.game.ItemStackTooltipEvent.appendStart

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/game/ItemStackTooltipEvent.java:31`

```java
public void appendStart(Component text)
```

## meteordevelopment.meteorclient.events.game.ItemStackTooltipEvent.appendEnd

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/game/ItemStackTooltipEvent.java:37`

```java
public void appendEnd(Component text)
```

## meteordevelopment.meteorclient.events.game.ItemStackTooltipEvent.append

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/game/ItemStackTooltipEvent.java:42`

```java
public void append(int index, Component text)
```

## meteordevelopment.meteorclient.events.game.ItemStackTooltipEvent.set

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/game/ItemStackTooltipEvent.java:47`

```java
public void set(int index, Component text)
```

## meteordevelopment.meteorclient.events.game.OpenScreenEvent

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/game/OpenScreenEvent.java:11`

```java
public class OpenScreenEvent extends Cancellable
```

## meteordevelopment.meteorclient.events.game.OpenScreenEvent.screen

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/game/OpenScreenEvent.java:14`

```java
public Screen screen
```

## meteordevelopment.meteorclient.events.game.OpenScreenEvent.get

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/game/OpenScreenEvent.java:16`

```java
public static OpenScreenEvent get(Screen screen)
```

## meteordevelopment.meteorclient.events.game.ReceiveMessageEvent

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/game/ReceiveMessageEvent.java:12`

```java
public class ReceiveMessageEvent extends Cancellable
```

## meteordevelopment.meteorclient.events.game.ReceiveMessageEvent.id

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/game/ReceiveMessageEvent.java:18`

```java
public int id
```

## meteordevelopment.meteorclient.events.game.ReceiveMessageEvent.get

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/game/ReceiveMessageEvent.java:20`

```java
public static ReceiveMessageEvent get(Component message, GuiMessageTag indicator, int id)
```

## meteordevelopment.meteorclient.events.game.ReceiveMessageEvent.getMessage

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/game/ReceiveMessageEvent.java:29`

```java
public Component getMessage()
```

## meteordevelopment.meteorclient.events.game.ReceiveMessageEvent.getIndicator

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/game/ReceiveMessageEvent.java:33`

```java
public GuiMessageTag getIndicator()
```

## meteordevelopment.meteorclient.events.game.ReceiveMessageEvent.setMessage

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/game/ReceiveMessageEvent.java:37`

```java
public void setMessage(Component message)
```

## meteordevelopment.meteorclient.events.game.ReceiveMessageEvent.setIndicator

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/game/ReceiveMessageEvent.java:42`

```java
public void setIndicator(GuiMessageTag indicator)
```

## meteordevelopment.meteorclient.events.game.ReceiveMessageEvent.isModified

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/game/ReceiveMessageEvent.java:47`

```java
public boolean isModified()
```

## meteordevelopment.meteorclient.events.game.ResolutionChangedEvent

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/game/ResolutionChangedEvent.java:8`

```java
public class ResolutionChangedEvent
```

## meteordevelopment.meteorclient.events.game.ResolutionChangedEvent.get

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/game/ResolutionChangedEvent.java:11`

```java
public static ResolutionChangedEvent get()
```

## meteordevelopment.meteorclient.events.game.ResourcePacksReloadedEvent

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/game/ResourcePacksReloadedEvent.java:8`

```java
public class ResourcePacksReloadedEvent
```

## meteordevelopment.meteorclient.events.game.ResourcePacksReloadedEvent.get

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/game/ResourcePacksReloadedEvent.java:11`

```java
public static ResourcePacksReloadedEvent get()
```

## meteordevelopment.meteorclient.events.game.SendMessageEvent

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/game/SendMessageEvent.java:10`

```java
public class SendMessageEvent extends Cancellable
```

## meteordevelopment.meteorclient.events.game.SendMessageEvent.message

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/game/SendMessageEvent.java:13`

```java
public String message
```

## meteordevelopment.meteorclient.events.game.SendMessageEvent.get

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/game/SendMessageEvent.java:15`

```java
public static SendMessageEvent get(String message)
```

## meteordevelopment.meteorclient.events.meteor.ActiveModulesChangedEvent

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/meteor/ActiveModulesChangedEvent.java:8`

```java
public class ActiveModulesChangedEvent
```

## meteordevelopment.meteorclient.events.meteor.ActiveModulesChangedEvent.get

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/meteor/ActiveModulesChangedEvent.java:11`

```java
public static ActiveModulesChangedEvent get()
```

## meteordevelopment.meteorclient.events.meteor.CharTypedEvent

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/meteor/CharTypedEvent.java:10`

```java
public class CharTypedEvent extends Cancellable
```

## meteordevelopment.meteorclient.events.meteor.CharTypedEvent.c

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/meteor/CharTypedEvent.java:13`

```java
public char c
```

## meteordevelopment.meteorclient.events.meteor.CharTypedEvent.get

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/meteor/CharTypedEvent.java:15`

```java
public static CharTypedEvent get(char c)
```

## meteordevelopment.meteorclient.events.meteor.CustomFontChangedEvent

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/meteor/CustomFontChangedEvent.java:8`

```java
@SuppressWarnings("InstantiationOfUtilityClass") public class CustomFontChangedEvent
```

## meteordevelopment.meteorclient.events.meteor.CustomFontChangedEvent.get

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/meteor/CustomFontChangedEvent.java:12`

```java
public static CustomFontChangedEvent get()
```

## meteordevelopment.meteorclient.events.meteor.KeyInputEvent

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/meteor/KeyInputEvent.java:11`

```java
public class KeyInputEvent extends Cancellable
```

## meteordevelopment.meteorclient.events.meteor.KeyInputEvent.input

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/meteor/KeyInputEvent.java:14`

```java
public net.minecraft.client.input.KeyEvent input
```

## meteordevelopment.meteorclient.events.meteor.KeyInputEvent.action

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/meteor/KeyInputEvent.java:15`

```java
public KeyAction action
```

## meteordevelopment.meteorclient.events.meteor.KeyInputEvent.get

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/meteor/KeyInputEvent.java:17`

```java
public static KeyInputEvent get(net.minecraft.client.input.KeyEvent input, KeyAction action)
```

## meteordevelopment.meteorclient.events.meteor.KeyInputEvent.key

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/meteor/KeyInputEvent.java:24`

```java
public int key()
```

## meteordevelopment.meteorclient.events.meteor.KeyInputEvent.modifiers

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/meteor/KeyInputEvent.java:28`

```java
public int modifiers()
```

## meteordevelopment.meteorclient.events.meteor.ModuleBindChangedEvent

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/meteor/ModuleBindChangedEvent.java:10`

```java
public class ModuleBindChangedEvent
```

## meteordevelopment.meteorclient.events.meteor.ModuleBindChangedEvent.module

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/meteor/ModuleBindChangedEvent.java:13`

```java
public Module module
```

## meteordevelopment.meteorclient.events.meteor.ModuleBindChangedEvent.get

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/meteor/ModuleBindChangedEvent.java:15`

```java
public static ModuleBindChangedEvent get(Module module)
```

## meteordevelopment.meteorclient.events.meteor.MouseClickEvent

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/meteor/MouseClickEvent.java:13`

```java
public class MouseClickEvent extends Cancellable
```

## meteordevelopment.meteorclient.events.meteor.MouseClickEvent.click

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/meteor/MouseClickEvent.java:16`

```java
public MouseButtonEvent click
```

## meteordevelopment.meteorclient.events.meteor.MouseClickEvent.input

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/meteor/MouseClickEvent.java:17`

```java
public MouseButtonInfo input
```

## meteordevelopment.meteorclient.events.meteor.MouseClickEvent.action

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/meteor/MouseClickEvent.java:18`

```java
public KeyAction action
```

## meteordevelopment.meteorclient.events.meteor.MouseClickEvent.get

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/meteor/MouseClickEvent.java:20`

```java
public static MouseClickEvent get(MouseButtonEvent click, KeyAction action)
```

## meteordevelopment.meteorclient.events.meteor.MouseClickEvent.button

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/meteor/MouseClickEvent.java:28`

```java
public int button()
```

## meteordevelopment.meteorclient.events.meteor.MouseScrollEvent

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/meteor/MouseScrollEvent.java:10`

```java
public class MouseScrollEvent extends Cancellable
```

## meteordevelopment.meteorclient.events.meteor.MouseScrollEvent.value

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/meteor/MouseScrollEvent.java:13`

```java
public double value
```

## meteordevelopment.meteorclient.events.meteor.MouseScrollEvent.get

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/meteor/MouseScrollEvent.java:15`

```java
public static MouseScrollEvent get(double value)
```

## meteordevelopment.meteorclient.events.packets.ContainerSlotUpdateEvent

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/packets/ContainerSlotUpdateEvent.java:10`

```java
public class ContainerSlotUpdateEvent
```

## meteordevelopment.meteorclient.events.packets.ContainerSlotUpdateEvent.packet

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/packets/ContainerSlotUpdateEvent.java:13`

```java
public ClientboundContainerSetSlotPacket packet
```

## meteordevelopment.meteorclient.events.packets.ContainerSlotUpdateEvent.get

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/packets/ContainerSlotUpdateEvent.java:15`

```java
public static ContainerSlotUpdateEvent get(ClientboundContainerSetSlotPacket packet)
```

## meteordevelopment.meteorclient.events.packets.InventoryEvent

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/packets/InventoryEvent.java:10`

```java
public class InventoryEvent
```

## meteordevelopment.meteorclient.events.packets.InventoryEvent.packet

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/packets/InventoryEvent.java:13`

```java
public ClientboundContainerSetContentPacket packet
```

## meteordevelopment.meteorclient.events.packets.InventoryEvent.get

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/packets/InventoryEvent.java:15`

```java
public static InventoryEvent get(ClientboundContainerSetContentPacket packet)
```

## meteordevelopment.meteorclient.events.packets.PacketEvent

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/packets/PacketEvent.java:12`

```java
public class PacketEvent
```

## meteordevelopment.meteorclient.events.packets.PacketEvent.Receive

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/packets/PacketEvent.java:13`

```java
public static class Receive extends Cancellable
```

## meteordevelopment.meteorclient.events.packets.PacketEvent.Receive.packet

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/packets/PacketEvent.java:14`

```java
public Packet<?> packet
```

## meteordevelopment.meteorclient.events.packets.PacketEvent.Receive.connection

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/packets/PacketEvent.java:15`

```java
public Connection connection
```

## meteordevelopment.meteorclient.events.packets.PacketEvent.Receive.Receive

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/packets/PacketEvent.java:17`

```java
public Receive(Packet<?> packet, Connection connection)
```

## meteordevelopment.meteorclient.events.packets.PacketEvent.Send

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/packets/PacketEvent.java:24`

```java
public static class Send extends Cancellable
```

## meteordevelopment.meteorclient.events.packets.PacketEvent.Send.packet

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/packets/PacketEvent.java:25`

```java
public Packet<?> packet
```

## meteordevelopment.meteorclient.events.packets.PacketEvent.Send.connection

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/packets/PacketEvent.java:26`

```java
public Connection connection
```

## meteordevelopment.meteorclient.events.packets.PacketEvent.Send.Send

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/packets/PacketEvent.java:28`

```java
public Send(Packet<?> packet, Connection connection)
```

## meteordevelopment.meteorclient.events.packets.PacketEvent.Send.sendSilently

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/packets/PacketEvent.java:40`

```java
public void sendSilently(Packet<?> packet)
```

## meteordevelopment.meteorclient.events.packets.PacketEvent.Sent

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/packets/PacketEvent.java:45`

```java
public static class Sent
```

## meteordevelopment.meteorclient.events.packets.PacketEvent.Sent.packet

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/packets/PacketEvent.java:46`

```java
public Packet<?> packet
```

## meteordevelopment.meteorclient.events.packets.PacketEvent.Sent.connection

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/packets/PacketEvent.java:47`

```java
public Connection connection
```

## meteordevelopment.meteorclient.events.packets.PacketEvent.Sent.Sent

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/packets/PacketEvent.java:49`

```java
public Sent(Packet<?> packet, Connection connection)
```

## meteordevelopment.meteorclient.events.packets.PacketEvent.Sent.sendSilently

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/packets/PacketEvent.java:60`

```java
public void sendSilently(Packet<?> packet)
```

## meteordevelopment.meteorclient.events.packets.PlaySoundPacketEvent

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/packets/PlaySoundPacketEvent.java:10`

```java
public class PlaySoundPacketEvent
```

## meteordevelopment.meteorclient.events.packets.PlaySoundPacketEvent.packet

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/packets/PlaySoundPacketEvent.java:14`

```java
public ClientboundSoundPacket packet
```

## meteordevelopment.meteorclient.events.packets.PlaySoundPacketEvent.get

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/packets/PlaySoundPacketEvent.java:16`

```java
public static PlaySoundPacketEvent get(ClientboundSoundPacket packet)
```

## meteordevelopment.meteorclient.events.render.ApplyTransformationEvent

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/render/ApplyTransformationEvent.java:11`

```java
public class ApplyTransformationEvent extends Cancellable
```

## meteordevelopment.meteorclient.events.render.ApplyTransformationEvent.transformation

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/render/ApplyTransformationEvent.java:14`

```java
public ItemTransform transformation
```

## meteordevelopment.meteorclient.events.render.ApplyTransformationEvent.leftHanded

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/render/ApplyTransformationEvent.java:15`

```java
public boolean leftHanded
```

## meteordevelopment.meteorclient.events.render.ApplyTransformationEvent.get

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/render/ApplyTransformationEvent.java:17`

```java
public static ApplyTransformationEvent get(ItemTransform transformation, boolean leftHanded)
```

## meteordevelopment.meteorclient.events.render.ArmRenderEvent

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/render/ArmRenderEvent.java:12`

```java
public class ArmRenderEvent
```

## meteordevelopment.meteorclient.events.render.ArmRenderEvent.INSTANCE

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/render/ArmRenderEvent.java:13`

```java
public static ArmRenderEvent INSTANCE = new ArmRenderEvent()
```

## meteordevelopment.meteorclient.events.render.ArmRenderEvent.matrix

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/render/ArmRenderEvent.java:15`

```java
public PoseStack matrix
```

## meteordevelopment.meteorclient.events.render.ArmRenderEvent.hand

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/render/ArmRenderEvent.java:16`

```java
public InteractionHand hand
```

## meteordevelopment.meteorclient.events.render.ArmRenderEvent.get

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/render/ArmRenderEvent.java:18`

```java
public static ArmRenderEvent get(InteractionHand hand, PoseStack matrices)
```

## meteordevelopment.meteorclient.events.render.GetFovEvent

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/render/GetFovEvent.java:8`

```java
public class GetFovEvent
```

## meteordevelopment.meteorclient.events.render.GetFovEvent.fov

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/render/GetFovEvent.java:11`

```java
public float fov
```

## meteordevelopment.meteorclient.events.render.GetFovEvent.get

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/render/GetFovEvent.java:13`

```java
public static GetFovEvent get(float fov)
```

## meteordevelopment.meteorclient.events.render.HeldItemRendererEvent

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/render/HeldItemRendererEvent.java:11`

```java
public class HeldItemRendererEvent
```

## meteordevelopment.meteorclient.events.render.HeldItemRendererEvent.hand

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/render/HeldItemRendererEvent.java:14`

```java
public InteractionHand hand
```

## meteordevelopment.meteorclient.events.render.HeldItemRendererEvent.matrix

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/render/HeldItemRendererEvent.java:15`

```java
public PoseStack matrix
```

## meteordevelopment.meteorclient.events.render.HeldItemRendererEvent.get

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/render/HeldItemRendererEvent.java:17`

```java
public static HeldItemRendererEvent get(InteractionHand hand, PoseStack matrices)
```

## meteordevelopment.meteorclient.events.render.Render2DEvent

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/render/Render2DEvent.java:11`

```java
public class Render2DEvent
```

## meteordevelopment.meteorclient.events.render.Render2DEvent.graphics

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/render/Render2DEvent.java:14`

```java
public GuiGraphicsExtractor graphics
```

## meteordevelopment.meteorclient.events.render.Render2DEvent.screenWidth

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/render/Render2DEvent.java:15`

```java
public int screenWidth, screenHeight
```

## meteordevelopment.meteorclient.events.render.Render2DEvent.screenHeight

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/render/Render2DEvent.java:15`

```java
public int screenWidth, screenHeight
```

## meteordevelopment.meteorclient.events.render.Render2DEvent.frameTime

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/render/Render2DEvent.java:16`

```java
public double frameTime
```

## meteordevelopment.meteorclient.events.render.Render2DEvent.tickDelta

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/render/Render2DEvent.java:17`

```java
public float tickDelta
```

## meteordevelopment.meteorclient.events.render.Render2DEvent.get

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/render/Render2DEvent.java:19`

```java
public static Render2DEvent get(GuiGraphicsExtractor graphics, int screenWidth, int screenHeight, float tickDelta)
```

## meteordevelopment.meteorclient.events.render.Render3DEvent

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/render/Render3DEvent.java:12`

```java
public class Render3DEvent
```

## meteordevelopment.meteorclient.events.render.Render3DEvent.matrices

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/render/Render3DEvent.java:15`

```java
public PoseStack matrices
```

## meteordevelopment.meteorclient.events.render.Render3DEvent.renderer

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/render/Render3DEvent.java:16`

```java
public Renderer3D renderer
```

## meteordevelopment.meteorclient.events.render.Render3DEvent.depthRenderer

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/render/Render3DEvent.java:17`

```java
public Renderer3D depthRenderer
```

## meteordevelopment.meteorclient.events.render.Render3DEvent.frameTime

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/render/Render3DEvent.java:18`

```java
public double frameTime
```

## meteordevelopment.meteorclient.events.render.Render3DEvent.tickDelta

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/render/Render3DEvent.java:19`

```java
public float tickDelta
```

## meteordevelopment.meteorclient.events.render.Render3DEvent.offsetX

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/render/Render3DEvent.java:20`

```java
public double offsetX, offsetY, offsetZ
```

## meteordevelopment.meteorclient.events.render.Render3DEvent.offsetY

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/render/Render3DEvent.java:20`

```java
public double offsetX, offsetY, offsetZ
```

## meteordevelopment.meteorclient.events.render.Render3DEvent.offsetZ

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/render/Render3DEvent.java:20`

```java
public double offsetX, offsetY, offsetZ
```

## meteordevelopment.meteorclient.events.render.Render3DEvent.get

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/render/Render3DEvent.java:22`

```java
public static Render3DEvent get(PoseStack matrices, Renderer3D renderer, Renderer3D depthRenderer, float tickDelta, double offsetX, double offsetY, double offsetZ)
```

## meteordevelopment.meteorclient.events.render.RenderAfterWorldEvent

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/render/RenderAfterWorldEvent.java:8`

```java
public class RenderAfterWorldEvent
```

## meteordevelopment.meteorclient.events.render.RenderAfterWorldEvent.get

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/render/RenderAfterWorldEvent.java:11`

```java
public static RenderAfterWorldEvent get()
```

## meteordevelopment.meteorclient.events.render.RenderBlockEntityEvent

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/render/RenderBlockEntityEvent.java:11`

```java
public class RenderBlockEntityEvent extends Cancellable
```

## meteordevelopment.meteorclient.events.render.RenderBlockEntityEvent.blockEntityState

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/render/RenderBlockEntityEvent.java:14`

```java
public BlockEntityRenderState blockEntityState
```

## meteordevelopment.meteorclient.events.render.RenderBlockEntityEvent.get

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/render/RenderBlockEntityEvent.java:16`

```java
public static RenderBlockEntityEvent get(BlockEntityRenderState blockEntityState)
```

## meteordevelopment.meteorclient.events.render.RenderBossBarEvent

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/render/RenderBossBarEvent.java:13`

```java
public class RenderBossBarEvent
```

## meteordevelopment.meteorclient.events.render.RenderBossBarEvent.BossText

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/render/RenderBossBarEvent.java:14`

```java
public static class BossText
```

## meteordevelopment.meteorclient.events.render.RenderBossBarEvent.BossText.bossBar

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/render/RenderBossBarEvent.java:17`

```java
public LerpingBossEvent bossBar
```

## meteordevelopment.meteorclient.events.render.RenderBossBarEvent.BossText.name

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/render/RenderBossBarEvent.java:18`

```java
public Component name
```

## meteordevelopment.meteorclient.events.render.RenderBossBarEvent.BossText.get

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/render/RenderBossBarEvent.java:20`

```java
public static BossText get(LerpingBossEvent bossBar, Component name)
```

## meteordevelopment.meteorclient.events.render.RenderBossBarEvent.BossSpacing

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/render/RenderBossBarEvent.java:27`

```java
public static class BossSpacing
```

## meteordevelopment.meteorclient.events.render.RenderBossBarEvent.BossSpacing.spacing

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/render/RenderBossBarEvent.java:30`

```java
public int spacing
```

## meteordevelopment.meteorclient.events.render.RenderBossBarEvent.BossSpacing.get

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/render/RenderBossBarEvent.java:32`

```java
public static BossSpacing get(int spacing)
```

## meteordevelopment.meteorclient.events.render.RenderBossBarEvent.BossIterator

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/render/RenderBossBarEvent.java:38`

```java
public static class BossIterator
```

## meteordevelopment.meteorclient.events.render.RenderBossBarEvent.BossIterator.iterator

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/render/RenderBossBarEvent.java:41`

```java
public Iterator<LerpingBossEvent> iterator
```

## meteordevelopment.meteorclient.events.render.RenderBossBarEvent.BossIterator.get

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/render/RenderBossBarEvent.java:43`

```java
public static BossIterator get(Iterator<LerpingBossEvent> iterator)
```

## meteordevelopment.meteorclient.events.render.RenderItemEntityEvent

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/render/RenderItemEntityEvent.java:17`

```java
public class RenderItemEntityEvent extends Cancellable
```

## meteordevelopment.meteorclient.events.render.RenderItemEntityEvent.itemEntity

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/render/RenderItemEntityEvent.java:20`

```java
@Nullable public ItemEntity itemEntity
```

## meteordevelopment.meteorclient.events.render.RenderItemEntityEvent.renderState

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/render/RenderItemEntityEvent.java:22`

```java
public ItemEntityRenderState renderState
```

## meteordevelopment.meteorclient.events.render.RenderItemEntityEvent.tickDelta

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/render/RenderItemEntityEvent.java:23`

```java
public float tickDelta
```

## meteordevelopment.meteorclient.events.render.RenderItemEntityEvent.matrixStack

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/render/RenderItemEntityEvent.java:24`

```java
public PoseStack matrixStack
```

## meteordevelopment.meteorclient.events.render.RenderItemEntityEvent.light

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/render/RenderItemEntityEvent.java:25`

```java
public int light
```

## meteordevelopment.meteorclient.events.render.RenderItemEntityEvent.itemModelManager

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/render/RenderItemEntityEvent.java:26`

```java
public ItemModelResolver itemModelManager
```

## meteordevelopment.meteorclient.events.render.RenderItemEntityEvent.renderCommandQueue

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/render/RenderItemEntityEvent.java:27`

```java
public SubmitNodeCollector renderCommandQueue
```

## meteordevelopment.meteorclient.events.render.RenderItemEntityEvent.get

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/render/RenderItemEntityEvent.java:29`

```java
public static RenderItemEntityEvent get(ItemEntityRenderState renderState, float tickDelta, PoseStack matrixStack, int light, ItemModelResolver itemModelManager, SubmitNodeCollector renderCommandQueue)
```

## meteordevelopment.meteorclient.events.render.TooltipDataEvent

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/render/TooltipDataEvent.java:12`

```java
public class TooltipDataEvent
```

## meteordevelopment.meteorclient.events.render.TooltipDataEvent.tooltipData

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/render/TooltipDataEvent.java:15`

```java
public TooltipComponent tooltipData
```

## meteordevelopment.meteorclient.events.render.TooltipDataEvent.itemStack

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/render/TooltipDataEvent.java:16`

```java
public ItemStack itemStack
```

## meteordevelopment.meteorclient.events.render.TooltipDataEvent.get

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/render/TooltipDataEvent.java:18`

```java
public static TooltipDataEvent get(ItemStack itemStack)
```

## meteordevelopment.meteorclient.events.world.AmbientOcclusionEvent

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/world/AmbientOcclusionEvent.java:8`

```java
public class AmbientOcclusionEvent
```

## meteordevelopment.meteorclient.events.world.AmbientOcclusionEvent.lightLevel

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/world/AmbientOcclusionEvent.java:11`

```java
public float lightLevel = -1
```

## meteordevelopment.meteorclient.events.world.AmbientOcclusionEvent.get

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/world/AmbientOcclusionEvent.java:13`

```java
public static AmbientOcclusionEvent get()
```

## meteordevelopment.meteorclient.events.world.BlockActivateEvent

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/world/BlockActivateEvent.java:10`

```java
public class BlockActivateEvent
```

## meteordevelopment.meteorclient.events.world.BlockActivateEvent.blockState

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/world/BlockActivateEvent.java:13`

```java
public BlockState blockState
```

## meteordevelopment.meteorclient.events.world.BlockActivateEvent.get

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/world/BlockActivateEvent.java:15`

```java
public static BlockActivateEvent get(BlockState blockState)
```

## meteordevelopment.meteorclient.events.world.BlockUpdateEvent

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/world/BlockUpdateEvent.java:11`

```java
public class BlockUpdateEvent
```

## meteordevelopment.meteorclient.events.world.BlockUpdateEvent.pos

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/world/BlockUpdateEvent.java:14`

```java
public BlockPos pos
```

## meteordevelopment.meteorclient.events.world.BlockUpdateEvent.oldState

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/world/BlockUpdateEvent.java:15`

```java
public BlockState oldState, newState
```

## meteordevelopment.meteorclient.events.world.BlockUpdateEvent.newState

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/world/BlockUpdateEvent.java:15`

```java
public BlockState oldState, newState
```

## meteordevelopment.meteorclient.events.world.BlockUpdateEvent.get

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/world/BlockUpdateEvent.java:17`

```java
public static BlockUpdateEvent get(BlockPos pos, BlockState oldState, BlockState newState)
```

## meteordevelopment.meteorclient.events.world.ChunkDataEvent

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/world/ChunkDataEvent.java:14`

```java
public record ChunkDataEvent(LevelChunk chunk)
```

## meteordevelopment.meteorclient.events.world.ChunkOcclusionEvent

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/world/ChunkOcclusionEvent.java:10`

```java
public class ChunkOcclusionEvent extends Cancellable
```

## meteordevelopment.meteorclient.events.world.ChunkOcclusionEvent.get

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/world/ChunkOcclusionEvent.java:13`

```java
public static ChunkOcclusionEvent get()
```

## meteordevelopment.meteorclient.events.world.CollisionShapeEvent

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/world/CollisionShapeEvent.java:14`

```java
public class CollisionShapeEvent extends Cancellable
```

## meteordevelopment.meteorclient.events.world.CollisionShapeEvent.state

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/world/CollisionShapeEvent.java:17`

```java
public BlockState state
```

## meteordevelopment.meteorclient.events.world.CollisionShapeEvent.pos

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/world/CollisionShapeEvent.java:18`

```java
public BlockPos pos
```

## meteordevelopment.meteorclient.events.world.CollisionShapeEvent.shape

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/world/CollisionShapeEvent.java:19`

```java
public VoxelShape shape
```

## meteordevelopment.meteorclient.events.world.CollisionShapeEvent.get

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/world/CollisionShapeEvent.java:21`

```java
public static CollisionShapeEvent get(BlockState state, BlockPos pos, VoxelShape shape)
```

## meteordevelopment.meteorclient.events.world.ParticleEvent

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/world/ParticleEvent.java:11`

```java
public class ParticleEvent extends Cancellable
```

## meteordevelopment.meteorclient.events.world.ParticleEvent.particle

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/world/ParticleEvent.java:14`

```java
public ParticleOptions particle
```

## meteordevelopment.meteorclient.events.world.ParticleEvent.get

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/world/ParticleEvent.java:16`

```java
public static ParticleEvent get(ParticleOptions particle)
```

## meteordevelopment.meteorclient.events.world.PlaySoundEvent

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/world/PlaySoundEvent.java:11`

```java
public class PlaySoundEvent extends Cancellable
```

## meteordevelopment.meteorclient.events.world.PlaySoundEvent.sound

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/world/PlaySoundEvent.java:14`

```java
public SoundInstance sound
```

## meteordevelopment.meteorclient.events.world.PlaySoundEvent.get

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/world/PlaySoundEvent.java:16`

```java
public static PlaySoundEvent get(SoundInstance sound)
```

## meteordevelopment.meteorclient.events.world.ServerConnectBeginEvent

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/world/ServerConnectBeginEvent.java:11`

```java
public class ServerConnectBeginEvent
```

## meteordevelopment.meteorclient.events.world.ServerConnectBeginEvent.address

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/world/ServerConnectBeginEvent.java:13`

```java
public ServerAddress address
```

## meteordevelopment.meteorclient.events.world.ServerConnectBeginEvent.info

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/world/ServerConnectBeginEvent.java:14`

```java
public ServerData info
```

## meteordevelopment.meteorclient.events.world.ServerConnectBeginEvent.get

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/world/ServerConnectBeginEvent.java:16`

```java
public static ServerConnectBeginEvent get(ServerAddress address, ServerData info)
```

## meteordevelopment.meteorclient.events.world.ServerConnectEndEvent

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/world/ServerConnectEndEvent.java:10`

```java
public class ServerConnectEndEvent
```

## meteordevelopment.meteorclient.events.world.ServerConnectEndEvent.address

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/world/ServerConnectEndEvent.java:12`

```java
public InetSocketAddress address
```

## meteordevelopment.meteorclient.events.world.ServerConnectEndEvent.get

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/world/ServerConnectEndEvent.java:14`

```java
public static ServerConnectEndEvent get(InetSocketAddress address)
```

## meteordevelopment.meteorclient.events.world.TickEvent

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/world/TickEvent.java:8`

```java
public class TickEvent
```

## meteordevelopment.meteorclient.events.world.TickEvent.Pre

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/world/TickEvent.java:9`

```java
public static class Pre extends TickEvent
```

## meteordevelopment.meteorclient.events.world.TickEvent.Pre.get

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/world/TickEvent.java:12`

```java
public static Pre get()
```

## meteordevelopment.meteorclient.events.world.TickEvent.Post

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/world/TickEvent.java:17`

```java
public static class Post extends TickEvent
```

## meteordevelopment.meteorclient.events.world.TickEvent.Post.get

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/events/world/TickEvent.java:20`

```java
public static Post get()
```
