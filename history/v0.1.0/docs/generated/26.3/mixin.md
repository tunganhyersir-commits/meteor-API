# mixin

Khai báo Java có cú pháp public/protected. Không bao gồm API kế thừa/tổng hợp bởi compiler; xem kiểm tra bytecode riêng.

## meteordevelopment.meteorclient.mixin.AABBMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/AABBMixin.java:15`

```java
@Mixin(AABB.class) public abstract class AABBMixin implements IAABB
```

## meteordevelopment.meteorclient.mixin.AABBMixin.minX

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/AABBMixin.java:17`

```java
@Shadow @Final @Mutable public double minX
```

## meteordevelopment.meteorclient.mixin.AABBMixin.minY

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/AABBMixin.java:21`

```java
@Shadow @Final @Mutable public double minY
```

## meteordevelopment.meteorclient.mixin.AABBMixin.minZ

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/AABBMixin.java:25`

```java
@Shadow @Final @Mutable public double minZ
```

## meteordevelopment.meteorclient.mixin.AABBMixin.maxX

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/AABBMixin.java:30`

```java
@Shadow @Final @Mutable public double maxX
```

## meteordevelopment.meteorclient.mixin.AABBMixin.maxY

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/AABBMixin.java:34`

```java
@Shadow @Final @Mutable public double maxY
```

## meteordevelopment.meteorclient.mixin.AABBMixin.maxZ

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/AABBMixin.java:38`

```java
@Shadow @Final @Mutable public double maxZ
```

## meteordevelopment.meteorclient.mixin.AABBMixin.meteor$expand

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/AABBMixin.java:43`

```java
@Override public void meteor$expand(double v)
```

## meteordevelopment.meteorclient.mixin.AABBMixin.meteor$set

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/AABBMixin.java:53`

```java
@Override public void meteor$set(double x1, double y1, double z1, double x2, double y2, double z2)
```

## meteordevelopment.meteorclient.mixin.AbstractBlockStateMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/AbstractBlockStateMixin.java:18`

```java
@Mixin(BlockBehaviour.BlockStateBase.class) public abstract class AbstractBlockStateMixin
```

## meteordevelopment.meteorclient.mixin.AbstractBoatMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/AbstractBoatMixin.java:16`

```java
@Mixin(AbstractBoat.class) public abstract class AbstractBoatMixin
```

## meteordevelopment.meteorclient.mixin.AbstractClientPlayerAccessor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/AbstractClientPlayerAccessor.java:13`

```java
@Mixin(AbstractClientPlayer.class) public interface AbstractClientPlayerAccessor
```

## meteordevelopment.meteorclient.mixin.AbstractClientPlayerAccessor.meteor$setPlayerInfo

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/AbstractClientPlayerAccessor.java:15`

```java
@Accessor("playerInfo") void meteor$setPlayerInfo(PlayerInfo entry)
```

## meteordevelopment.meteorclient.mixin.AbstractClientPlayerMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/AbstractClientPlayerMixin.java:18`

```java
@Mixin(AbstractClientPlayer.class) public abstract class AbstractClientPlayerMixin
```

## meteordevelopment.meteorclient.mixin.AbstractContainerScreenAccessor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/AbstractContainerScreenAccessor.java:13`

```java
@Mixin(AbstractContainerScreen.class) public interface AbstractContainerScreenAccessor
```

## meteordevelopment.meteorclient.mixin.AbstractContainerScreenAccessor.meteor$getHoveredSlot

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/AbstractContainerScreenAccessor.java:15`

```java
@Accessor("hoveredSlot") Slot meteor$getHoveredSlot()
```

## meteordevelopment.meteorclient.mixin.AbstractContainerScreenMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/AbstractContainerScreenMixin.java:38`

```java
@Mixin(AbstractContainerScreen.class) public abstract class AbstractContainerScreenMixin<T extends AbstractContainerMenu> extends Screen implements MenuAccess<T>
```

## meteordevelopment.meteorclient.mixin.AbstractContainerScreenMixin.hoveredSlot

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/AbstractContainerScreenMixin.java:40`

```java
@Shadow protected Slot hoveredSlot
```

## meteordevelopment.meteorclient.mixin.AbstractContainerScreenMixin.leftPos

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/AbstractContainerScreenMixin.java:43`

```java
@Shadow protected int leftPos
```

## meteordevelopment.meteorclient.mixin.AbstractContainerScreenMixin.topPos

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/AbstractContainerScreenMixin.java:45`

```java
@Shadow protected int topPos
```

## meteordevelopment.meteorclient.mixin.AbstractContainerScreenMixin.getHoveredSlot

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/AbstractContainerScreenMixin.java:48`

```java
@Shadow @Nullable protected abstract Slot getHoveredSlot(double x, double y)
```

## meteordevelopment.meteorclient.mixin.AbstractContainerScreenMixin.getMenu

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/AbstractContainerScreenMixin.java:52`

```java
@Shadow public abstract @NonNull T getMenu()
```

## meteordevelopment.meteorclient.mixin.AbstractContainerScreenMixin.slotClicked

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/AbstractContainerScreenMixin.java:58`

```java
@Shadow protected abstract void slotClicked(Slot slot, int slotId, int buttonNum, ContainerInput containerInput)
```

## meteordevelopment.meteorclient.mixin.AbstractContainerScreenMixin.onClose

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/AbstractContainerScreenMixin.java:61`

```java
@Shadow public abstract void onClose()
```

## meteordevelopment.meteorclient.mixin.AbstractContainerScreenMixin.AbstractContainerScreenMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/AbstractContainerScreenMixin.java:64`

```java
public AbstractContainerScreenMixin(Component title)
```

## meteordevelopment.meteorclient.mixin.AbstractFurnaceMenuMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/AbstractFurnaceMenuMixin.java:14`

```java
@Mixin(AbstractFurnaceMenu.class) public abstract class AbstractFurnaceMenuMixin implements IAbstractFurnaceMenu
```

## meteordevelopment.meteorclient.mixin.AbstractFurnaceMenuMixin.canSmelt

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/AbstractFurnaceMenuMixin.java:16`

```java
@Shadow protected abstract boolean canSmelt(ItemStack itemStack)
```

## meteordevelopment.meteorclient.mixin.AbstractFurnaceMenuMixin.meteor$canSmelt

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/AbstractFurnaceMenuMixin.java:19`

```java
@Override public boolean meteor$canSmelt(ItemStack itemStack)
```

## meteordevelopment.meteorclient.mixin.AbstractFurnaceScreenMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/AbstractFurnaceScreenMixin.java:18`

```java
@Mixin(AbstractFurnaceScreen.class) public abstract class AbstractFurnaceScreenMixin<T extends AbstractFurnaceMenu> extends AbstractContainerScreen<T> implements RecipeUpdateListener
```

## meteordevelopment.meteorclient.mixin.AbstractFurnaceScreenMixin.AbstractFurnaceScreenMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/AbstractFurnaceScreenMixin.java:20`

```java
public AbstractFurnaceScreenMixin(T container, Inventory playerInventory, Component name)
```

## meteordevelopment.meteorclient.mixin.AbstractFurnaceScreenMixin.containerTick

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/AbstractFurnaceScreenMixin.java:24`

```java
@Override public void containerTick()
```

## meteordevelopment.meteorclient.mixin.AbstractMountInventoryMenuAccessor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/AbstractMountInventoryMenuAccessor.java:13`

```java
@Mixin(AbstractMountInventoryMenu.class) public interface AbstractMountInventoryMenuAccessor
```

## meteordevelopment.meteorclient.mixin.AbstractMountInventoryMenuAccessor.meteor$getMount

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/AbstractMountInventoryMenuAccessor.java:15`

```java
@Accessor("mount") LivingEntity meteor$getMount()
```

## meteordevelopment.meteorclient.mixin.AbstractSignEditScreenAccessor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/AbstractSignEditScreenAccessor.java:13`

```java
@Mixin(AbstractSignEditScreen.class) public interface AbstractSignEditScreenAccessor
```

## meteordevelopment.meteorclient.mixin.AbstractSignEditScreenAccessor.meteor$getSign

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/AbstractSignEditScreenAccessor.java:15`

```java
@Accessor("sign") SignBlockEntity meteor$getSign()
```

## meteordevelopment.meteorclient.mixin.AbstractSignRendererMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/AbstractSignRendererMixin.java:15`

```java
@Mixin(AbstractSignRenderer.class) public abstract class AbstractSignRendererMixin
```

## meteordevelopment.meteorclient.mixin.AddressCheckMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/AddressCheckMixin.java:17`

```java
@NullMarked @Mixin(AddressCheck.class) public interface AddressCheckMixin
```

## meteordevelopment.meteorclient.mixin.ArmorStandRendererMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/ArmorStandRendererMixin.java:18`

```java
@Mixin(ArmorStandRenderer.class) public abstract class ArmorStandRendererMixin
```

## meteordevelopment.meteorclient.mixin.AttackRangeMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/AttackRangeMixin.java:20`

```java
@Mixin(AttackRange.class) public abstract class AttackRangeMixin
```

## meteordevelopment.meteorclient.mixin.AvatarRendererMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/AvatarRendererMixin.java:36`

```java
@Mixin(AvatarRenderer.class) public abstract class AvatarRendererMixin extends LivingEntityRenderer<Avatar, AvatarRenderState, PlayerModel>
```

## meteordevelopment.meteorclient.mixin.AvatarRendererMixin.AvatarRendererMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/AvatarRendererMixin.java:44`

```java
public AvatarRendererMixin(EntityRendererProvider.Context ctx, PlayerModel model, float shadowRadius)
```

## meteordevelopment.meteorclient.mixin.BannerRendererMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/BannerRendererMixin.java:31`

```java
@Mixin(BannerRenderer.class) public abstract class BannerRendererMixin
```

## meteordevelopment.meteorclient.mixin.BannerRendererMixin.bannerModel

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/BannerRendererMixin.java:37`

```java
@Shadow protected abstract BannerModel bannerModel(final BannerBlock.AttachmentType type)
```

## meteordevelopment.meteorclient.mixin.BeaconRendererMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/BeaconRendererMixin.java:24`

```java
@Mixin(BeaconRenderer.class) public abstract class BeaconRendererMixin<T extends BlockEntity & BeaconBeamOwner> implements BlockEntityRenderer<@NonNull T, BeaconRenderState>
```

## meteordevelopment.meteorclient.mixin.BeaconScreenMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/BeaconScreenMixin.java:30`

```java
@Mixin(BeaconScreen.class) public abstract class BeaconScreenMixin extends AbstractContainerScreen<BeaconMenu>
```

## meteordevelopment.meteorclient.mixin.BeaconScreenMixin.addBeaconButton

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/BeaconScreenMixin.java:32`

```java
@Shadow protected abstract <T extends AbstractWidget> void addBeaconButton(T beaconButton)
```

## meteordevelopment.meteorclient.mixin.BeaconScreenMixin.BeaconScreenMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/BeaconScreenMixin.java:35`

```java
public BeaconScreenMixin(BeaconMenu handler, Inventory inventory, Component title)
```

## meteordevelopment.meteorclient.mixin.BiomeColorsMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/BiomeColorsMixin.java:18`

```java
@Mixin(BiomeColors.class) public abstract class BiomeColorsMixin
```

## meteordevelopment.meteorclient.mixin.BlockBehaviourAccessor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/BlockBehaviourAccessor.java:12`

```java
@Mixin(BlockBehaviour.class) public interface BlockBehaviourAccessor
```

## meteordevelopment.meteorclient.mixin.BlockBehaviourAccessor.meteor$isHasCollision

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/BlockBehaviourAccessor.java:14`

```java
@Accessor("hasCollision") boolean meteor$isHasCollision()
```

## meteordevelopment.meteorclient.mixin.BlockBehaviourMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/BlockBehaviourMixin.java:21`

```java
@Mixin(BlockBehaviour.class) public abstract class BlockBehaviourMixin
```

## meteordevelopment.meteorclient.mixin.BlockCollisionsMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/BlockCollisionsMixin.java:23`

```java
@Mixin(BlockCollisions.class) public abstract class BlockCollisionsMixin
```

## meteordevelopment.meteorclient.mixin.BlockColorsMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/BlockColorsMixin.java:19`

```java
@Mixin(BlockColors.class) public abstract class BlockColorsMixin
```

## meteordevelopment.meteorclient.mixin.BlockEntityRenderDispatcherMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/BlockEntityRenderDispatcherMixin.java:20`

```java
@Mixin(BlockEntityRenderDispatcher.class) public abstract class BlockEntityRenderDispatcherMixin
```

## meteordevelopment.meteorclient.mixin.BlockEntityRenderStateAccessor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/BlockEntityRenderStateAccessor.java:13`

```java
@Mixin(BlockEntityRenderState.class) public interface BlockEntityRenderStateAccessor
```

## meteordevelopment.meteorclient.mixin.BlockEntityRenderStateAccessor.meteor$getBlockState

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/BlockEntityRenderStateAccessor.java:15`

```java
@Accessor("blockState") BlockState meteor$getBlockState()
```

## meteordevelopment.meteorclient.mixin.BlockHitResultAccessor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/BlockHitResultAccessor.java:14`

```java
@Mixin(BlockHitResult.class) public interface BlockHitResultAccessor
```

## meteordevelopment.meteorclient.mixin.BlockHitResultAccessor.meteor$setDirection

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/BlockHitResultAccessor.java:16`

```java
@Mutable @Accessor("direction") void meteor$setDirection(Direction direction)
```

## meteordevelopment.meteorclient.mixin.BlockItemMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/BlockItemMixin.java:22`

```java
@Mixin(BlockItem.class) public abstract class BlockItemMixin
```

## meteordevelopment.meteorclient.mixin.BlockItemMixin.getPlacementState

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/BlockItemMixin.java:24`

```java
@Shadow protected abstract BlockState getPlacementState(BlockPlaceContext context)
```

## meteordevelopment.meteorclient.mixin.BlockMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/BlockMixin.java:25`

```java
@Mixin(Block.class) public abstract class BlockMixin extends BlockBehaviour implements ItemLike
```

## meteordevelopment.meteorclient.mixin.BlockMixin.BlockMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/BlockMixin.java:27`

```java
public BlockMixin(Properties properties)
```

## meteordevelopment.meteorclient.mixin.BlockMixin.getFriction

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/BlockMixin.java:31`

```java
@ModifyReturnValue(method = "getFriction", at = @At("RETURN")) public float getFriction(float original)
```

## meteordevelopment.meteorclient.mixin.BlockStateMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/BlockStateMixin.java:21`

```java
@Mixin(BlockState.class) public abstract class BlockStateMixin extends BlockBehaviour.BlockStateBase
```

## meteordevelopment.meteorclient.mixin.BlockStateMixin.BlockStateMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/BlockStateMixin.java:23`

```java
protected BlockStateMixin(Block owner, Property<?>[] propertyKeys, Comparable<?>[] propertyValues)
```

## meteordevelopment.meteorclient.mixin.BlockStateMixin.useWithoutItem

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/BlockStateMixin.java:27`

```java
@Override public @NonNull InteractionResult useWithoutItem(@NonNull Level level, @NonNull Player player, @NonNull BlockHitResult hitResult)
```

## meteordevelopment.meteorclient.mixin.BookEditScreenMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/BookEditScreenMixin.java:30`

```java
@Mixin(BookEditScreen.class) public abstract class BookEditScreenMixin extends Screen
```

## meteordevelopment.meteorclient.mixin.BookEditScreenMixin.updatePageContent

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/BookEditScreenMixin.java:38`

```java
@Shadow protected abstract void updatePageContent()
```

## meteordevelopment.meteorclient.mixin.BookEditScreenMixin.pageForward

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/BookEditScreenMixin.java:41`

```java
@Shadow protected abstract void pageForward()
```

## meteordevelopment.meteorclient.mixin.BookEditScreenMixin.pageBack

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/BookEditScreenMixin.java:44`

```java
@Shadow protected abstract void pageBack()
```

## meteordevelopment.meteorclient.mixin.BookEditScreenMixin.BookEditScreenMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/BookEditScreenMixin.java:47`

```java
public BookEditScreenMixin(Component title)
```

## meteordevelopment.meteorclient.mixin.BookEditScreenMixin.mouseScrolled

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/BookEditScreenMixin.java:121`

```java
@Override public boolean mouseScrolled(double mouseX, double mouseY, double horizontalAmount, double verticalAmount)
```

## meteordevelopment.meteorclient.mixin.BookViewScreenMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/BookViewScreenMixin.java:38`

```java
@Mixin(BookViewScreen.class) public abstract class BookViewScreenMixin extends Screen
```

## meteordevelopment.meteorclient.mixin.BookViewScreenMixin.pageForward

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/BookViewScreenMixin.java:46`

```java
@Shadow protected abstract void pageForward()
```

## meteordevelopment.meteorclient.mixin.BookViewScreenMixin.pageBack

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/BookViewScreenMixin.java:49`

```java
@Shadow protected abstract void pageBack()
```

## meteordevelopment.meteorclient.mixin.BookViewScreenMixin.BookViewScreenMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/BookViewScreenMixin.java:52`

```java
public BookViewScreenMixin(Component title)
```

## meteordevelopment.meteorclient.mixin.BookViewScreenMixin.mouseScrolled

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/BookViewScreenMixin.java:114`

```java
@Override public boolean mouseScrolled(double mouseX, double mouseY, double horizontalAmount, double verticalAmount)
```

## meteordevelopment.meteorclient.mixin.BossHealthOverlayMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/BossHealthOverlayMixin.java:26`

```java
@Mixin(BossHealthOverlay.class) public abstract class BossHealthOverlayMixin
```

## meteordevelopment.meteorclient.mixin.BossHealthOverlayMixin.modifyBossBarIterator

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/BossHealthOverlayMixin.java:33`

```java
@ModifyExpressionValue(method = "extractRenderState", at = @At(value = "INVOKE", target = "Ljava/util/Collection;iterator()Ljava/util/Iterator;")) public Iterator<LerpingBossEvent> modifyBossBarIterator(Iterator<LerpingBossEvent> original)
```

## meteordevelopment.meteorclient.mixin.BossHealthOverlayMixin.modifyBossBarName

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/BossHealthOverlayMixin.java:39`

```java
@ModifyExpressionValue(method = "extractRenderState", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/gui/components/LerpingBossEvent;getName()Lnet/minecraft/network/chat/Component;")) public Component modifyBossBarName(Component original, @Local(name = "event") LerpingBossEvent event)
```

## meteordevelopment.meteorclient.mixin.BossHealthOverlayMixin.modifySpacingConstant

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/BossHealthOverlayMixin.java:45`

```java
@ModifyConstant(method = "extractRenderState", constant = @Constant(intValue = 9, ordinal = 1)) public int modifySpacingConstant(int j)
```

## meteordevelopment.meteorclient.mixin.BrewingStandScreenMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/BrewingStandScreenMixin.java:17`

```java
@Mixin(BrewingStandScreen.class) public abstract class BrewingStandScreenMixin extends AbstractContainerScreen<BrewingStandMenu>
```

## meteordevelopment.meteorclient.mixin.BrewingStandScreenMixin.BrewingStandScreenMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/BrewingStandScreenMixin.java:19`

```java
public BrewingStandScreenMixin(BrewingStandMenu container, Inventory playerInventory, Component name)
```

## meteordevelopment.meteorclient.mixin.BrewingStandScreenMixin.containerTick

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/BrewingStandScreenMixin.java:23`

```java
@Override public void containerTick()
```

## meteordevelopment.meteorclient.mixin.BrewingStandScreenMixin.onClose

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/BrewingStandScreenMixin.java:30`

```java
@Override public void onClose()
```

## meteordevelopment.meteorclient.mixin.BrightnessGetterMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/BrightnessGetterMixin.java:16`

```java
@Mixin(LightCoordsUtil.BrightnessGetter.class) public interface BrightnessGetterMixin
```

## meteordevelopment.meteorclient.mixin.BuiltInRegistriesMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/BuiltInRegistriesMixin.java:15`

```java
@Mixin(BuiltInRegistries.class) public abstract class BuiltInRegistriesMixin
```

## meteordevelopment.meteorclient.mixin.BundleItemMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/BundleItemMixin.java:20`

```java
@Mixin(BundleItem.class) public abstract class BundleItemMixin
```

## meteordevelopment.meteorclient.mixin.BundleMouseActionsMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/BundleMouseActionsMixin.java:18`

```java
@Mixin(BundleMouseActions.class) public abstract class BundleMouseActionsMixin
```

## meteordevelopment.meteorclient.mixin.CameraMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/CameraMixin.java:33`

```java
@Mixin(Camera.class) public abstract class CameraMixin implements ICamera
```

## meteordevelopment.meteorclient.mixin.CameraMixin.setRotation

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/CameraMixin.java:43`

```java
@Shadow protected abstract void setRotation(float yRot, float xRot)
```

## meteordevelopment.meteorclient.mixin.CameraMixin.meteor$setRot

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/CameraMixin.java:114`

```java
@Override public void meteor$setRot(double yaw, double pitch)
```

## meteordevelopment.meteorclient.mixin.CapeLayerMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/CapeLayerMixin.java:21`

```java
@Mixin(CapeLayer.class) public abstract class CapeLayerMixin
```

## meteordevelopment.meteorclient.mixin.ChatComponentAccessor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/ChatComponentAccessor.java:15`

```java
@Mixin(ChatComponent.class) public interface ChatComponentAccessor
```

## meteordevelopment.meteorclient.mixin.ChatComponentAccessor.meteor$getTrimmedMessages

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/ChatComponentAccessor.java:17`

```java
@Accessor("trimmedMessages") List<GuiMessage.Line> meteor$getTrimmedMessages()
```

## meteordevelopment.meteorclient.mixin.ChatComponentAccessor.meteor$getAllMessages

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/ChatComponentAccessor.java:20`

```java
@Accessor("allMessages") List<GuiMessage> meteor$getAllMessages()
```

## meteordevelopment.meteorclient.mixin.ChatComponentMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/ChatComponentMixin.java:37`

```java
@Mixin(ChatComponent.class) public abstract class ChatComponentMixin implements IChatHud
```

## meteordevelopment.meteorclient.mixin.ChatComponentMixin.addClientSystemMessage

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/ChatComponentMixin.java:55`

```java
@Shadow public abstract void addClientSystemMessage(Component message)
```

## meteordevelopment.meteorclient.mixin.ChatComponentMixin.meteor$add

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/ChatComponentMixin.java:58`

```java
@Override public void meteor$add(Component message, int id)
```

## meteordevelopment.meteorclient.mixin.ChatHudInteractableMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/ChatHudInteractableMixin.java:25`

```java
@Mixin(targets = "net.minecraft.client.gui.components.ChatComponent$DrawingFocusedGraphicsAccess", remap = false) public abstract class ChatHudInteractableMixin
```

## meteordevelopment.meteorclient.mixin.ChatHudLineConsumerMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/ChatHudLineConsumerMixin.java:19`

```java
@Mixin(targets = "net.minecraft.client.gui.components.ChatComponent$1", remap = false) public abstract class ChatHudLineConsumerMixin
```

## meteordevelopment.meteorclient.mixin.ChatHudUnfocusedMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/ChatHudUnfocusedMixin.java:26`

```java
@Mixin(targets = "net.minecraft.client.gui.components.ChatComponent$DrawingBackgroundGraphicsAccess", remap = false) public abstract class ChatHudUnfocusedMixin
```

## meteordevelopment.meteorclient.mixin.ChatListenerMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/ChatListenerMixin.java:22`

```java
@Mixin(ChatListener.class) public abstract class ChatListenerMixin implements IChatListener
```

## meteordevelopment.meteorclient.mixin.ChatListenerMixin.meteor$getSender

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/ChatListenerMixin.java:37`

```java
@Override public GameProfile meteor$getSender()
```

## meteordevelopment.meteorclient.mixin.ChatScreenMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/ChatScreenMixin.java:18`

```java
@Mixin(value = ChatScreen.class, priority = 1001) public abstract class ChatScreenMixin
```

## meteordevelopment.meteorclient.mixin.ChatScreenMixin.input

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/ChatScreenMixin.java:20`

```java
@Shadow protected EditBox input
```

## meteordevelopment.meteorclient.mixin.ChunkAccessAccessor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/ChunkAccessAccessor.java:16`

```java
@Mixin(ChunkAccess.class) public interface ChunkAccessAccessor
```

## meteordevelopment.meteorclient.mixin.ChunkAccessAccessor.getBlockEntities

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/ChunkAccessAccessor.java:18`

```java
@Accessor("blockEntities") Map<BlockPos, BlockEntity> getBlockEntities()
```

## meteordevelopment.meteorclient.mixin.ChunkBorderRendererMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/ChunkBorderRendererMixin.java:20`

```java
@Mixin(ChunkBorderRenderer.class) public abstract class ChunkBorderRendererMixin
```

## meteordevelopment.meteorclient.mixin.ClientChunkCacheAccessor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/ClientChunkCacheAccessor.java:12`

```java
@Mixin(ClientChunkCache.class) public interface ClientChunkCacheAccessor
```

## meteordevelopment.meteorclient.mixin.ClientChunkCacheAccessor.meteor$getStorage

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/ClientChunkCacheAccessor.java:14`

```java
@Accessor("storage") ClientChunkCache.Storage meteor$getStorage()
```

## meteordevelopment.meteorclient.mixin.ClientChunkMapAccessor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/ClientChunkMapAccessor.java:15`

```java
@Mixin(ClientChunkCache.Storage.class) public interface ClientChunkMapAccessor
```

## meteordevelopment.meteorclient.mixin.ClientChunkMapAccessor.meteor$getChunks

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/ClientChunkMapAccessor.java:17`

```java
@Accessor("chunks") AtomicReferenceArray<LevelChunk> meteor$getChunks()
```

## meteordevelopment.meteorclient.mixin.ClientLevelMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/ClientLevelMixin.java:38`

```java
@Mixin(ClientLevel.class) public abstract class ClientLevelMixin extends Level
```

## meteordevelopment.meteorclient.mixin.ClientLevelMixin.ClientLevelMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/ClientLevelMixin.java:43`

```java
protected ClientLevelMixin(WritableLevelData levelData, ResourceKey<Level> dimension, RegistryAccess registryAccess, Holder<DimensionType> dimensionTypeRegistration, boolean isClientSide, boolean isDebug, long biomeZoomSeed, int maxChainedNeighborUpdates)
```

## meteordevelopment.meteorclient.mixin.ClientLevelMixin.getEntity

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/ClientLevelMixin.java:47`

```java
@Shadow @Nullable public abstract Entity getEntity(int id)
```

## meteordevelopment.meteorclient.mixin.ClientLevelMixin.getNextEntityId

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/ClientLevelMixin.java:79`

```java
@Override public int getNextEntityId()
```

## meteordevelopment.meteorclient.mixin.ClientPacketListenerAccessor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/ClientPacketListenerAccessor.java:18`

```java
@Mixin(ClientPacketListener.class) public interface ClientPacketListenerAccessor
```

## meteordevelopment.meteorclient.mixin.ClientPacketListenerAccessor.meteor$getServerChunkRadius

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/ClientPacketListenerAccessor.java:20`

```java
@Accessor("serverChunkRadius") int meteor$getServerChunkRadius()
```

## meteordevelopment.meteorclient.mixin.ClientPacketListenerAccessor.meteor$getSignedMessageEncoder

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/ClientPacketListenerAccessor.java:23`

```java
@Accessor("signedMessageEncoder") SignedMessageChain.Encoder meteor$getSignedMessageEncoder()
```

## meteordevelopment.meteorclient.mixin.ClientPacketListenerAccessor.meteor$getLastSeenMessages

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/ClientPacketListenerAccessor.java:26`

```java
@Accessor("lastSeenMessages") LastSeenMessagesTracker meteor$getLastSeenMessages()
```

## meteordevelopment.meteorclient.mixin.ClientPacketListenerAccessor.meteor$getRegistryAccess

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/ClientPacketListenerAccessor.java:29`

```java
@Accessor("registryAccess") RegistryAccess.Frozen meteor$getRegistryAccess()
```

## meteordevelopment.meteorclient.mixin.ClientPacketListenerAccessor.meteor$getEnabledFeatures

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/ClientPacketListenerAccessor.java:32`

```java
@Accessor("enabledFeatures") FeatureFlagSet meteor$getEnabledFeatures()
```

## meteordevelopment.meteorclient.mixin.ClientPacketListenerAccessor.meteor$getCommandNodeFactory

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/ClientPacketListenerAccessor.java:35`

```java
@Accessor("COMMAND_NODE_BUILDER") static ClientboundCommandsPacket.NodeBuilder<ClientSuggestionProvider> meteor$getCommandNodeFactory()
```

## meteordevelopment.meteorclient.mixin.ClientPacketListenerMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/ClientPacketListenerMixin.java:50`

```java
@Mixin(ClientPacketListener.class) public abstract class ClientPacketListenerMixin extends ClientCommonPacketListenerImpl
```

## meteordevelopment.meteorclient.mixin.ClientPacketListenerMixin.ClientPacketListenerMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/ClientPacketListenerMixin.java:55`

```java
protected ClientPacketListenerMixin(Minecraft client, Connection connection, CommonListenerCookie connectionState)
```

## meteordevelopment.meteorclient.mixin.ClientTooltipComponentMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/ClientTooltipComponentMixin.java:16`

```java
@Mixin(ClientTooltipComponent.class) public interface ClientTooltipComponentMixin
```

## meteordevelopment.meteorclient.mixin.ClientboundExplodePacketMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/ClientboundExplodePacketMixin.java:18`

```java
@Mixin(ClientboundExplodePacket.class) public abstract class ClientboundExplodePacketMixin implements IClientboundExplodePacket
```

## meteordevelopment.meteorclient.mixin.ClientboundExplodePacketMixin.meteor$setVelocityX

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/ClientboundExplodePacketMixin.java:25`

```java
@Override public void meteor$setVelocityX(float velocity)
```

## meteordevelopment.meteorclient.mixin.ClientboundExplodePacketMixin.meteor$setVelocityY

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/ClientboundExplodePacketMixin.java:35`

```java
@Override public void meteor$setVelocityY(float velocity)
```

## meteordevelopment.meteorclient.mixin.ClientboundExplodePacketMixin.meteor$setVelocityZ

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/ClientboundExplodePacketMixin.java:45`

```java
@Override public void meteor$setVelocityZ(float velocity)
```

## meteordevelopment.meteorclient.mixin.ClientboundSetEntityMotionPacketAccessor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/ClientboundSetEntityMotionPacketAccessor.java:14`

```java
@Mixin(ClientboundSetEntityMotionPacket.class) public interface ClientboundSetEntityMotionPacketAccessor
```

## meteordevelopment.meteorclient.mixin.ClientboundSetEntityMotionPacketAccessor.meteor$setMovement

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/ClientboundSetEntityMotionPacketAccessor.java:16`

```java
@Mutable @Accessor("movement") void meteor$setMovement(Vec3 velocity)
```

## meteordevelopment.meteorclient.mixin.ClipContextMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/ClipContextMixin.java:18`

```java
@Mixin(ClipContext.class) public abstract class ClipContextMixin implements IClipContext
```

## meteordevelopment.meteorclient.mixin.ClipContextMixin.meteor$set

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/ClipContextMixin.java:41`

```java
@Override public void meteor$set(Vec3 start, Vec3 end, ClipContext.Block shapeType, ClipContext.Fluid fluidHandling, Entity entity)
```

## meteordevelopment.meteorclient.mixin.CloudRendererMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/CloudRendererMixin.java:18`

```java
@Mixin(CloudRenderer.class) public abstract class CloudRendererMixin
```

## meteordevelopment.meteorclient.mixin.CommandSuggestionsMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/CommandSuggestionsMixin.java:29`

```java
@Mixin(CommandSuggestions.class) public abstract class CommandSuggestionsMixin
```

## meteordevelopment.meteorclient.mixin.CommandSuggestionsMixin.updateUsageInfo

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/CommandSuggestionsMixin.java:47`

```java
@Shadow protected abstract void updateUsageInfo(ParseResults<ClientSuggestionProvider> currentParse, Suggestions suggestions)
```

## meteordevelopment.meteorclient.mixin.CommandSuggestionsMixin.onRefresh

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/CommandSuggestionsMixin.java:50`

```java
@Inject(method = "updateCommandInfo", at = @At(value = "INVOKE", target = "Lcom/mojang/brigadier/StringReader;canRead()Z", remap = false), cancellable = true ) public void onRefresh(CallbackInfo ci, @Local(name = "reader") StringReader reader)
```

## meteordevelopment.meteorclient.mixin.CompassAngleStateMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/CompassAngleStateMixin.java:22`

```java
@Mixin(CompassAngleState.class) public abstract class CompassAngleStateMixin
```

## meteordevelopment.meteorclient.mixin.ComponentMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/ComponentMixin.java:12`

```java
@Mixin(Component.class) public interface ComponentMixin extends IComponent
```

## meteordevelopment.meteorclient.mixin.ComponentMixin.meteor$invalidateCache

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/ComponentMixin.java:14`

```java
@Override default void meteor$invalidateCache()
```

## meteordevelopment.meteorclient.mixin.CompressionDecoderMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/CompressionDecoderMixin.java:15`

```java
@Mixin(CompressionDecoder.class) public abstract class CompressionDecoderMixin
```

## meteordevelopment.meteorclient.mixin.ConnectScreenMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/ConnectScreenMixin.java:20`

```java
@Mixin(ConnectScreen.class) public abstract class ConnectScreenMixin
```

## meteordevelopment.meteorclient.mixin.ConnectionMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/ConnectionMixin.java:44`

```java
@Mixin(Connection.class) public abstract class ConnectionMixin
```

## meteordevelopment.meteorclient.mixin.CrashReportMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/CrashReportMixin.java:23`

```java
@Mixin(CrashReport.class) public abstract class CrashReportMixin
```

## meteordevelopment.meteorclient.mixin.CreativeModeInventoryScreenAccessor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/CreativeModeInventoryScreenAccessor.java:13`

```java
@Mixin(CreativeModeInventoryScreen.class) public interface CreativeModeInventoryScreenAccessor
```

## meteordevelopment.meteorclient.mixin.CreativeModeInventoryScreenAccessor.meteor$getSelectedTab

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/CreativeModeInventoryScreenAccessor.java:15`

```java
@Accessor("selectedTab") static CreativeModeTab meteor$getSelectedTab()
```

## meteordevelopment.meteorclient.mixin.CreativeModeTabsAccessor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/CreativeModeTabsAccessor.java:14`

```java
@Mixin(CreativeModeTabs.class) public interface CreativeModeTabsAccessor
```

## meteordevelopment.meteorclient.mixin.CreativeModeTabsAccessor.meteor$getInventory

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/CreativeModeTabsAccessor.java:16`

```java
@Accessor("INVENTORY") static ResourceKey<CreativeModeTab> meteor$getInventory()
```

## meteordevelopment.meteorclient.mixin.CreativeModeTabsMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/CreativeModeTabsMixin.java:15`

```java
@Mixin(CreativeModeTabs.class) public abstract class CreativeModeTabsMixin
```

## meteordevelopment.meteorclient.mixin.CreativeSlotMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/CreativeSlotMixin.java:14`

```java
@Mixin(targets = "net.minecraft.client.gui.screens.inventory.CreativeModeInventoryScreen$SlotWrapper") public abstract class CreativeSlotMixin implements ISlot
```

## meteordevelopment.meteorclient.mixin.CreativeSlotMixin.meteor$getIndex

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/CreativeSlotMixin.java:20`

```java
@Override public int meteor$getIndex()
```

## meteordevelopment.meteorclient.mixin.CreativeSlotMixin.meteor$getSlot

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/CreativeSlotMixin.java:25`

```java
@Override public int meteor$getSlot()
```

## meteordevelopment.meteorclient.mixin.CrossbowItemAccessor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/CrossbowItemAccessor.java:13`

```java
@Mixin(CrossbowItem.class) public interface CrossbowItemAccessor
```

## meteordevelopment.meteorclient.mixin.CrossbowItemAccessor.meteor$getSpeed

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/CrossbowItemAccessor.java:15`

```java
@Invoker("getShootingPower") static float meteor$getSpeed(ChargedProjectiles itemStack)
```

## meteordevelopment.meteorclient.mixin.CustomHeadLayerMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/CustomHeadLayerMixin.java:22`

```java
@Mixin(CustomHeadLayer.class) public abstract class CustomHeadLayerMixin<S extends LivingEntityRenderState, M extends EntityModel<S> & HeadedModel>
```

## meteordevelopment.meteorclient.mixin.DirectionAccessor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/DirectionAccessor.java:12`

```java
@Mixin(Direction.class) public interface DirectionAccessor
```

## meteordevelopment.meteorclient.mixin.DirectionAccessor.meteor$getHorizontal

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/DirectionAccessor.java:14`

```java
@Accessor("BY_2D_DATA") static Direction[] meteor$getHorizontal()
```

## meteordevelopment.meteorclient.mixin.DisconnectedScreenMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/DisconnectedScreenMixin.java:27`

```java
@Mixin(DisconnectedScreen.class) public abstract class DisconnectedScreenMixin extends Screen
```

## meteordevelopment.meteorclient.mixin.DisconnectedScreenMixin.DisconnectedScreenMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/DisconnectedScreenMixin.java:37`

```java
protected DisconnectedScreenMixin(Component title)
```

## meteordevelopment.meteorclient.mixin.DisconnectedScreenMixin.tick

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/DisconnectedScreenMixin.java:59`

```java
@Override public void tick()
```

## meteordevelopment.meteorclient.mixin.DownloadQueueMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/DownloadQueueMixin.java:30`

```java
@Mixin(DownloadQueue.class) public abstract class DownloadQueueMixin
```

## meteordevelopment.meteorclient.mixin.DownloadedPackSourceMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/DownloadedPackSourceMixin.java:16`

```java
@Mixin(DownloadedPackSource.class) public abstract class DownloadedPackSourceMixin
```

## meteordevelopment.meteorclient.mixin.EnchantTableRendererMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/EnchantTableRendererMixin.java:20`

```java
@Mixin(EnchantTableRenderer.class) public abstract class EnchantTableRendererMixin
```

## meteordevelopment.meteorclient.mixin.EndCrystalModelMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/EndCrystalModelMixin.java:18`

```java
@Mixin(EndCrystalModel.class) public abstract class EndCrystalModelMixin
```

## meteordevelopment.meteorclient.mixin.EndCrystalRendererMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/EndCrystalRendererMixin.java:27`

```java
@Mixin(EndCrystalRenderer.class) public abstract class EndCrystalRendererMixin
```

## meteordevelopment.meteorclient.mixin.EntityAccessor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/EntityAccessor.java:12`

```java
@Mixin(Entity.class) public interface EntityAccessor
```

## meteordevelopment.meteorclient.mixin.EntityAccessor.meteor$setInWater

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/EntityAccessor.java:14`

```java
@Accessor("wasTouchingWater") void meteor$setInWater(boolean touchingWater)
```

## meteordevelopment.meteorclient.mixin.EntityAccessor.meteor$getId

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/EntityAccessor.java:17`

```java
@Accessor("id") int meteor$getId()
```

## meteordevelopment.meteorclient.mixin.EntityAccessor.meteor$setId

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/EntityAccessor.java:20`

```java
@Accessor("id") void meteor$setId(int id)
```

## meteordevelopment.meteorclient.mixin.EntityFluidInteractionMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/EntityFluidInteractionMixin.java:19`

```java
@Mixin(EntityFluidInteraction.class) public abstract class EntityFluidInteractionMixin
```

## meteordevelopment.meteorclient.mixin.EntityHitboxDebugRendererMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/EntityHitboxDebugRendererMixin.java:17`

```java
@Mixin(EntityHitboxDebugRenderer.class) public abstract class EntityHitboxDebugRendererMixin
```

## meteordevelopment.meteorclient.mixin.EntityMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/EntityMixin.java:44`

```java
@Mixin(Entity.class) public abstract class EntityMixin
```

## meteordevelopment.meteorclient.mixin.EntityRenderDispatcherMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/EntityRenderDispatcherMixin.java:25`

```java
@Mixin(EntityRenderDispatcher.class) public abstract class EntityRenderDispatcherMixin
```

## meteordevelopment.meteorclient.mixin.EntityRenderDispatcherMixin.camera

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/EntityRenderDispatcherMixin.java:27`

```java
@Shadow public Camera camera
```

## meteordevelopment.meteorclient.mixin.EntityRenderStateMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/EntityRenderStateMixin.java:15`

```java
@Mixin(EntityRenderState.class) public abstract class EntityRenderStateMixin implements IEntityRenderState
```

## meteordevelopment.meteorclient.mixin.EntityRenderStateMixin.meteor$getEntity

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/EntityRenderStateMixin.java:20`

```java
@Override @Nullable // "EntityCulling mod can prevent the code that sets the entity from running" public Entity meteor$getEntity()
```

## meteordevelopment.meteorclient.mixin.EntityRenderStateMixin.meteor$setEntity

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/EntityRenderStateMixin.java:26`

```java
@Override public void meteor$setEntity(Entity entity)
```

## meteordevelopment.meteorclient.mixin.EntityRendererMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/EntityRendererMixin.java:36`

```java
@Mixin(EntityRenderer.class) public abstract class EntityRendererMixin<T extends Entity, S extends EntityRenderState>
```

## meteordevelopment.meteorclient.mixin.EntitySectionAccessor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/EntitySectionAccessor.java:13`

```java
@Mixin(EntitySection.class) public interface EntitySectionAccessor
```

## meteordevelopment.meteorclient.mixin.EntitySectionAccessor.meteor$getStorage

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/EntitySectionAccessor.java:15`

```java
@Accessor("storage") <T> ClassInstanceMultiMap<T> meteor$getStorage()
```

## meteordevelopment.meteorclient.mixin.EntitySectionStorageAccessor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/EntitySectionStorageAccessor.java:16`

```java
@Mixin(EntitySectionStorage.class) public interface EntitySectionStorageAccessor
```

## meteordevelopment.meteorclient.mixin.EntitySectionStorageAccessor.meteor$getSectionIds

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/EntitySectionStorageAccessor.java:18`

```java
@Accessor("sectionIds") LongSortedSet meteor$getSectionIds()
```

## meteordevelopment.meteorclient.mixin.EntitySectionStorageAccessor.meteor$getSections

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/EntitySectionStorageAccessor.java:21`

```java
@Accessor("sections") <T extends EntityAccess> Long2ObjectMap<EntitySection<T>> meteor$getSections()
```

## meteordevelopment.meteorclient.mixin.FileCacheAccessor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/FileCacheAccessor.java:14`

```java
@Mixin(SkinManager.TextureCache.class) public interface FileCacheAccessor
```

## meteordevelopment.meteorclient.mixin.FileCacheAccessor.meteor$getRoot

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/FileCacheAccessor.java:16`

```java
@Accessor("root") Path meteor$getRoot()
```

## meteordevelopment.meteorclient.mixin.FireworkRocketEntityMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/FireworkRocketEntityMixin.java:19`

```java
@Mixin(FireworkRocketEntity.class) public abstract class FireworkRocketEntityMixin
```

## meteordevelopment.meteorclient.mixin.FireworksSparkParticleMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/FireworksSparkParticleMixin.java:16`

```java
@Mixin(FireworkParticles.Starter.class) public abstract class FireworksSparkParticleMixin
```

## meteordevelopment.meteorclient.mixin.FireworksSparkParticleSubMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/FireworksSparkParticleSubMixin.java:18`

```java
@Mixin(value = {FireworkParticles.SparkParticle.class, FireworkParticles.OverlayParticle.class}) public abstract class FireworksSparkParticleSubMixin
```

## meteordevelopment.meteorclient.mixin.FirstPersonHandsAndItemsMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/FirstPersonHandsAndItemsMixin.java:23`

```java
@Mixin(FirstPersonHandsAndItems.class) public abstract class FirstPersonHandsAndItemsMixin
```

## meteordevelopment.meteorclient.mixin.FirstPersonHandsAndItemsMixin.shouldInstantlyReplaceVisibleItem

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/FirstPersonHandsAndItemsMixin.java:25`

```java
@Shadow protected abstract boolean shouldInstantlyReplaceVisibleItem(ItemStack currentlyVisibleItem, ItemStack expectedItem, LocalPlayer player)
```

## meteordevelopment.meteorclient.mixin.FirstPersonHandsAndItemsRendererMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/FirstPersonHandsAndItemsRendererMixin.java:29`

```java
@Mixin(FirstPersonHandsAndItemsRenderer.class) public abstract class FirstPersonHandsAndItemsRendererMixin
```

## meteordevelopment.meteorclient.mixin.FishingHookAccessor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/FishingHookAccessor.java:12`

```java
@Mixin(FishingHook.class) public interface FishingHookAccessor
```

## meteordevelopment.meteorclient.mixin.FishingHookAccessor.meteor$hasCaughtFish

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/FishingHookAccessor.java:14`

```java
@Accessor("biting") boolean meteor$hasCaughtFish()
```

## meteordevelopment.meteorclient.mixin.FishingHookMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/FishingHookMixin.java:19`

```java
@Mixin(FishingHook.class) public abstract class FishingHookMixin
```

## meteordevelopment.meteorclient.mixin.FluidRendererMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/FluidRendererMixin.java:31`

```java
@Mixin(FluidRenderer.class) public abstract class FluidRendererMixin
```

## meteordevelopment.meteorclient.mixin.FogRendererMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/FogRendererMixin.java:19`

```java
@Mixin(FogRenderer.class) public abstract class FogRendererMixin
```

## meteordevelopment.meteorclient.mixin.FontMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/FontMixin.java:15`

```java
@Mixin(Font.class) public abstract class FontMixin
```

## meteordevelopment.meteorclient.mixin.FoodDataMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/FoodDataMixin.java:15`

```java
@Mixin(FoodData.class) public abstract class FoodDataMixin
```

## meteordevelopment.meteorclient.mixin.FriendlyByteBufMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/FriendlyByteBufMixin.java:16`

```java
@Mixin(FriendlyByteBuf.class) public abstract class FriendlyByteBufMixin
```

## meteordevelopment.meteorclient.mixin.FrontendGpuDeviceMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/FrontendGpuDeviceMixin.java:16`

```java
@Mixin(FrontendGpuDevice.class) public abstract class FrontendGpuDeviceMixin implements IGpuDevice
```

## meteordevelopment.meteorclient.mixin.FrontendGpuDeviceMixin.meteor$pushScissor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/FrontendGpuDeviceMixin.java:22`

```java
@Override public void meteor$pushScissor(int x, int y, int width, int height)
```

## meteordevelopment.meteorclient.mixin.FrontendGpuDeviceMixin.meteor$popScissor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/FrontendGpuDeviceMixin.java:27`

```java
@Override public void meteor$popScissor()
```

## meteordevelopment.meteorclient.mixin.FrontendGpuDeviceMixin.meteor$onCreateRenderPass

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/FrontendGpuDeviceMixin.java:32`

```java
@SuppressWarnings("deprecation") @Override public void meteor$onCreateRenderPass(RenderPassBackend backend)
```

## meteordevelopment.meteorclient.mixin.GameRendererMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/GameRendererMixin.java:50`

```java
@Mixin(GameRenderer.class) public abstract class GameRendererMixin
```

## meteordevelopment.meteorclient.mixin.GameRendererMixin.bobView

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/GameRendererMixin.java:69`

```java
@Shadow protected abstract void bobView(final CameraRenderState cameraState, final PoseStack poseStack)
```

## meteordevelopment.meteorclient.mixin.GameRendererMixin.bobHurt

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/GameRendererMixin.java:72`

```java
@Shadow protected abstract void bobHurt(final CameraRenderState cameraState, final PoseStack poseStack)
```

## meteordevelopment.meteorclient.mixin.GlCommandEncoderMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/GlCommandEncoderMixin.java:19`

```java
@Mixin(GlCommandEncoder.class) public abstract class GlCommandEncoderMixin
```

## meteordevelopment.meteorclient.mixin.GlDeviceMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/GlDeviceMixin.java:14`

```java
@Mixin(GlDevice.class) public abstract class GlDeviceMixin implements IGpuDevice
```

## meteordevelopment.meteorclient.mixin.GlDeviceMixin.meteor$pushScissor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/GlDeviceMixin.java:22`

```java
@Override public void meteor$pushScissor(int x, int y, int width, int height)
```

## meteordevelopment.meteorclient.mixin.GlDeviceMixin.meteor$popScissor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/GlDeviceMixin.java:35`

```java
@Override public void meteor$popScissor()
```

## meteordevelopment.meteorclient.mixin.GlDeviceMixin.meteor$onCreateRenderPass

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/GlDeviceMixin.java:43`

```java
@Deprecated @Override public void meteor$onCreateRenderPass(RenderPassBackend backend)
```

## meteordevelopment.meteorclient.mixin.GlRenderPipelineMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/GlRenderPipelineMixin.java:17`

```java
@Mixin(GlRenderPipeline.class) public abstract class GlRenderPipelineMixin implements IRenderPipeline
```

## meteordevelopment.meteorclient.mixin.GlRenderPipelineMixin.meteor$setLineSmooth

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/GlRenderPipelineMixin.java:22`

```java
@Override public void meteor$setLineSmooth(boolean lineSmooth)
```

## meteordevelopment.meteorclient.mixin.GlRenderPipelineMixin.meteor$getLineSmooth

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/GlRenderPipelineMixin.java:27`

```java
@Override public boolean meteor$getLineSmooth()
```

## meteordevelopment.meteorclient.mixin.GuiGraphicsExtractorAccessor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/GuiGraphicsExtractorAccessor.java:13`

```java
@Mixin(GuiGraphicsExtractor.class) public interface GuiGraphicsExtractorAccessor
```

## meteordevelopment.meteorclient.mixin.GuiGraphicsExtractorAccessor.getGuiRenderState

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/GuiGraphicsExtractorAccessor.java:15`

```java
@Accessor("guiRenderState") GuiRenderState getGuiRenderState()
```

## meteordevelopment.meteorclient.mixin.GuiGraphicsExtractorAccessor.getScissorStack

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/GuiGraphicsExtractorAccessor.java:18`

```java
@Accessor("scissorStack") GuiGraphicsExtractor.ScissorStack getScissorStack()
```

## meteordevelopment.meteorclient.mixin.GuiMessageMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/GuiMessageMixin.java:17`

```java
@Mixin(GuiMessage.class) public abstract class GuiMessageMixin implements IGuiMessage
```

## meteordevelopment.meteorclient.mixin.GuiMessageMixin.meteor$getText

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/GuiMessageMixin.java:27`

```java
@Override public String meteor$getText()
```

## meteordevelopment.meteorclient.mixin.GuiMessageMixin.meteor$getId

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/GuiMessageMixin.java:32`

```java
@Override public int meteor$getId()
```

## meteordevelopment.meteorclient.mixin.GuiMessageMixin.meteor$setId

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/GuiMessageMixin.java:37`

```java
@Override public void meteor$setId(int id)
```

## meteordevelopment.meteorclient.mixin.GuiMessageMixin.meteor$getSender

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/GuiMessageMixin.java:42`

```java
@Override public GameProfile meteor$getSender()
```

## meteordevelopment.meteorclient.mixin.GuiMessageMixin.meteor$setSender

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/GuiMessageMixin.java:47`

```java
@Override public void meteor$setSender(GameProfile profile)
```

## meteordevelopment.meteorclient.mixin.GuiMessageVisibleMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/GuiMessageVisibleMixin.java:17`

```java
@Mixin(GuiMessage.Line.class) public abstract class GuiMessageVisibleMixin implements IGuiMessageVisible
```

## meteordevelopment.meteorclient.mixin.GuiMessageVisibleMixin.meteor$getText

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/GuiMessageVisibleMixin.java:29`

```java
@Override public String meteor$getText()
```

## meteordevelopment.meteorclient.mixin.GuiMessageVisibleMixin.meteor$getId

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/GuiMessageVisibleMixin.java:41`

```java
@Override public int meteor$getId()
```

## meteordevelopment.meteorclient.mixin.GuiMessageVisibleMixin.meteor$setId

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/GuiMessageVisibleMixin.java:46`

```java
@Override public void meteor$setId(int id)
```

## meteordevelopment.meteorclient.mixin.GuiMessageVisibleMixin.meteor$getSender

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/GuiMessageVisibleMixin.java:51`

```java
@Override public GameProfile meteor$getSender()
```

## meteordevelopment.meteorclient.mixin.GuiMessageVisibleMixin.meteor$setSender

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/GuiMessageVisibleMixin.java:56`

```java
@Override public void meteor$setSender(GameProfile profile)
```

## meteordevelopment.meteorclient.mixin.GuiMessageVisibleMixin.meteor$isStartOfEntry

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/GuiMessageVisibleMixin.java:61`

```java
@Override public boolean meteor$isStartOfEntry()
```

## meteordevelopment.meteorclient.mixin.GuiMessageVisibleMixin.meteor$setStartOfEntry

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/GuiMessageVisibleMixin.java:66`

```java
@Override public void meteor$setStartOfEntry(boolean start)
```

## meteordevelopment.meteorclient.mixin.GuiMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/GuiMixin.java:27`

```java
@Mixin(Gui.class) public abstract class GuiMixin
```

## meteordevelopment.meteorclient.mixin.GuiRendererMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/GuiRendererMixin.java:30`

```java
@Mixin(GuiRenderer.class) public abstract class GuiRendererMixin
```

## meteordevelopment.meteorclient.mixin.HudMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/HudMixin.java:30`

```java
@Mixin(Hud.class) public abstract class HudMixin
```

## meteordevelopment.meteorclient.mixin.HumanoidArmorLayerMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/HumanoidArmorLayerMixin.java:21`

```java
@Mixin(HumanoidArmorLayer.class) public abstract class HumanoidArmorLayerMixin<S extends HumanoidRenderState, M extends HumanoidModel<S>, A extends HumanoidModel<S>>
```

## meteordevelopment.meteorclient.mixin.ItemContainerContentsMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/ItemContainerContentsMixin.java:27`

```java
@Mixin(ItemContainerContents.class) public abstract class ItemContainerContentsMixin
```

## meteordevelopment.meteorclient.mixin.ItemEntityRendererMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/ItemEntityRendererMixin.java:25`

```java
@Mixin(ItemEntityRenderer.class) public abstract class ItemEntityRendererMixin
```

## meteordevelopment.meteorclient.mixin.ItemMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/ItemMixin.java:20`

```java
@Mixin(Item.class) public abstract class ItemMixin
```

## meteordevelopment.meteorclient.mixin.ItemRendererMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/ItemRendererMixin.java:16`

```java
@Mixin(ItemFeatureRenderer.class) public abstract class ItemRendererMixin
```

## meteordevelopment.meteorclient.mixin.ItemStackMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/ItemStackMixin.java:28`

```java
@Mixin(ItemStack.class) public abstract class ItemStackMixin
```

## meteordevelopment.meteorclient.mixin.ItemStackRenderStateAccessor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/ItemStackRenderStateAccessor.java:12`

```java
@Mixin(ItemStackRenderState.class) public interface ItemStackRenderStateAccessor
```

## meteordevelopment.meteorclient.mixin.ItemStackRenderStateAccessor.meteor$getActiveLayerCount

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/ItemStackRenderStateAccessor.java:14`

```java
@Accessor("activeLayerCount") int meteor$getActiveLayerCount()
```

## meteordevelopment.meteorclient.mixin.ItemStackRenderStateAccessor.meteor$getLayers

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/ItemStackRenderStateAccessor.java:17`

```java
@Accessor("layers") ItemStackRenderState.LayerRenderState[] meteor$getLayers()
```

## meteordevelopment.meteorclient.mixin.ItemTransformMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/ItemTransformMixin.java:17`

```java
@Mixin(ItemTransform.class) public abstract class ItemTransformMixin
```

## meteordevelopment.meteorclient.mixin.JoinMultiplayerScreenMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/JoinMultiplayerScreenMixin.java:29`

```java
@Mixin(JoinMultiplayerScreen.class) public abstract class JoinMultiplayerScreenMixin extends Screen
```

## meteordevelopment.meteorclient.mixin.JoinMultiplayerScreenMixin.JoinMultiplayerScreenMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/JoinMultiplayerScreenMixin.java:56`

```java
public JoinMultiplayerScreenMixin(Component title)
```

## meteordevelopment.meteorclient.mixin.JoinMultiplayerScreenMixin.extractRenderState

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/JoinMultiplayerScreenMixin.java:111`

```java
@Override public void extractRenderState(@NonNull GuiGraphicsExtractor graphics, int mouseX, int mouseY, float deltaTicks)
```

## meteordevelopment.meteorclient.mixin.KeyMappingAccessor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/KeyMappingAccessor.java:16`

```java
@Mixin(KeyMapping.class) public interface KeyMappingAccessor
```

## meteordevelopment.meteorclient.mixin.KeyMappingAccessor.getKeysById

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/KeyMappingAccessor.java:18`

```java
@Accessor("ALL") static Map<String, KeyMapping> getKeysById()
```

## meteordevelopment.meteorclient.mixin.KeyMappingAccessor.meteor$getKey

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/KeyMappingAccessor.java:23`

```java
@Accessor("key") InputConstants.Key meteor$getKey()
```

## meteordevelopment.meteorclient.mixin.KeyMappingAccessor.meteor$getClickCount

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/KeyMappingAccessor.java:26`

```java
@Accessor("clickCount") int meteor$getClickCount()
```

## meteordevelopment.meteorclient.mixin.KeyMappingAccessor.meteor$setClickCount

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/KeyMappingAccessor.java:29`

```java
@Accessor("clickCount") void meteor$setClickCount(int timesPressed)
```

## meteordevelopment.meteorclient.mixin.KeyMappingAccessor.meteor$invokeRelease

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/KeyMappingAccessor.java:32`

```java
@Invoker("release") void meteor$invokeRelease()
```

## meteordevelopment.meteorclient.mixin.KeyboardHandlerMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/KeyboardHandlerMixin.java:28`

```java
@Mixin(KeyboardHandler.class) public abstract class KeyboardHandlerMixin
```

## meteordevelopment.meteorclient.mixin.KeyboardHandlerMixin.onKey

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/KeyboardHandlerMixin.java:34`

```java
@Inject(method = "keyPress", at = @At("HEAD"), cancellable = true) public void onKey(long handle, int action, KeyEvent event, CallbackInfo ci)
```

## meteordevelopment.meteorclient.mixin.KeyboardInputMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/KeyboardInputMixin.java:19`

```java
@Mixin(KeyboardInput.class) public abstract class KeyboardInputMixin extends ClientInput
```

## meteordevelopment.meteorclient.mixin.LayerRenderStateAccessor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/LayerRenderStateAccessor.java:13`

```java
@Mixin(ItemStackRenderState.LayerRenderState.class) public interface LayerRenderStateAccessor
```

## meteordevelopment.meteorclient.mixin.LayerRenderStateAccessor.meteor$getTransform

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/LayerRenderStateAccessor.java:15`

```java
@Accessor("itemTransform") ItemTransform meteor$getTransform()
```

## meteordevelopment.meteorclient.mixin.LevelAccessor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/LevelAccessor.java:14`

```java
@Mixin(Level.class) public interface LevelAccessor
```

## meteordevelopment.meteorclient.mixin.LevelAccessor.meteor$getEntityLookup

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/LevelAccessor.java:16`

```java
@Invoker("getEntities") LevelEntityGetter<Entity> meteor$getEntityLookup()
```

## meteordevelopment.meteorclient.mixin.LevelChunkMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/LevelChunkMixin.java:21`

```java
@Mixin(LevelChunk.class) public abstract class LevelChunkMixin
```

## meteordevelopment.meteorclient.mixin.LevelEntityGetterAdapterAccessor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/LevelEntityGetterAdapterAccessor.java:14`

```java
@Mixin(LevelEntityGetterAdapter.class) public interface LevelEntityGetterAdapterAccessor
```

## meteordevelopment.meteorclient.mixin.LevelEntityGetterAdapterAccessor.meteor$getSectionStorage

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/LevelEntityGetterAdapterAccessor.java:16`

```java
@Accessor("sectionStorage") <T extends EntityAccess> EntitySectionStorage<T> meteor$getSectionStorage()
```

## meteordevelopment.meteorclient.mixin.LevelExtractorMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/LevelExtractorMixin.java:32`

```java
@Mixin(LevelExtractor.class) public abstract class LevelExtractorMixin
```

## meteordevelopment.meteorclient.mixin.LevelRendererMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/LevelRendererMixin.java:46`

```java
@Mixin(LevelRenderer.class) public abstract class LevelRendererMixin implements ILevelRenderer
```

## meteordevelopment.meteorclient.mixin.LevelRendererMixin.executeOutline

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/LevelRendererMixin.java:163`

```java
@Shadow protected abstract void executeOutline(FeatureRenderDispatcher.PreparedFrame featureFrame)
```

## meteordevelopment.meteorclient.mixin.LevelRendererMixin.meteor$pushEntityOutlineFramebuffer

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/LevelRendererMixin.java:178`

```java
@Override public void meteor$pushEntityOutlineFramebuffer(RenderTarget framebuffer)
```

## meteordevelopment.meteorclient.mixin.LevelRendererMixin.meteor$popEntityOutlineFramebuffer

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/LevelRendererMixin.java:187`

```java
@Override public void meteor$popEntityOutlineFramebuffer()
```

## meteordevelopment.meteorclient.mixin.LightmapMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/LightmapMixin.java:24`

```java
@Mixin(Lightmap.class) public abstract class LightmapMixin
```

## meteordevelopment.meteorclient.mixin.LightningBoltRendererMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/LightningBoltRendererMixin.java:19`

```java
@Mixin(LightningBoltRenderer.class) public abstract class LightningBoltRendererMixin
```

## meteordevelopment.meteorclient.mixin.LivingEntityAccessor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/LivingEntityAccessor.java:15`

```java
@Mixin(LivingEntity.class) public interface LivingEntityAccessor
```

## meteordevelopment.meteorclient.mixin.LivingEntityAccessor.meteor$swimUpwards

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/LivingEntityAccessor.java:17`

```java
@Invoker("jumpInLiquid") void meteor$swimUpwards(TagKey<Fluid> fluid)
```

## meteordevelopment.meteorclient.mixin.LivingEntityAccessor.meteor$isJumping

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/LivingEntityAccessor.java:20`

```java
@Accessor("jumping") boolean meteor$isJumping()
```

## meteordevelopment.meteorclient.mixin.LivingEntityAccessor.meteor$getJumpCooldown

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/LivingEntityAccessor.java:23`

```java
@Accessor("noJumpDelay") int meteor$getJumpCooldown()
```

## meteordevelopment.meteorclient.mixin.LivingEntityAccessor.meteor$setJumpCooldown

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/LivingEntityAccessor.java:26`

```java
@Accessor("noJumpDelay") void meteor$setJumpCooldown(int cooldown)
```

## meteordevelopment.meteorclient.mixin.LivingEntityMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/LivingEntityMixin.java:42`

```java
@Mixin(LivingEntity.class) public abstract class LivingEntityMixin extends Entity
```

## meteordevelopment.meteorclient.mixin.LivingEntityMixin.LivingEntityMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/LivingEntityMixin.java:44`

```java
public LivingEntityMixin(EntityType<?> type, Level world)
```

## meteordevelopment.meteorclient.mixin.LivingEntityMixin.recastOnLand

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/LivingEntityMixin.java:89`

```java
@Inject(method = "isFallFlying", at = @At("TAIL"), cancellable = true) public void recastOnLand(CallbackInfoReturnable<Boolean> cir)
```

## meteordevelopment.meteorclient.mixin.LivingEntityRendererMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/LivingEntityRendererMixin.java:40`

```java
@Mixin(LivingEntityRenderer.class) public abstract class LivingEntityRendererMixin<T extends LivingEntity, S extends LivingEntityRenderState, M extends EntityModel<? super S>>
```

## meteordevelopment.meteorclient.mixin.LivingEntitySwingStateMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/LivingEntitySwingStateMixin.java:18`

```java
@Mixin(LivingEntity.SwingState.class) public abstract class LivingEntitySwingStateMixin
```

## meteordevelopment.meteorclient.mixin.LocalPlayerAccessor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/LocalPlayerAccessor.java:12`

```java
@Mixin(LocalPlayer.class) public interface LocalPlayerAccessor
```

## meteordevelopment.meteorclient.mixin.LocalPlayerAccessor.meteor$setPositionReminder

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/LocalPlayerAccessor.java:14`

```java
@Accessor("positionReminder") void meteor$setPositionReminder(int ticks)
```

## meteordevelopment.meteorclient.mixin.LocalPlayerMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/LocalPlayerMixin.java:43`

```java
@Mixin(LocalPlayer.class) public abstract class LocalPlayerMixin extends AbstractClientPlayer
```

## meteordevelopment.meteorclient.mixin.LocalPlayerMixin.input

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/LocalPlayerMixin.java:45`

```java
@Shadow public ClientInput input
```

## meteordevelopment.meteorclient.mixin.LocalPlayerMixin.LocalPlayerMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/LocalPlayerMixin.java:48`

```java
public LocalPlayerMixin(ClientLevel world, GameProfile profile)
```

## meteordevelopment.meteorclient.mixin.MapRendererMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/MapRendererMixin.java:24`

```java
@Mixin(MapRenderer.class) public abstract class MapRendererMixin
```

## meteordevelopment.meteorclient.mixin.MapTextureManagerAccessor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/MapTextureManagerAccessor.java:14`

```java
@Mixin(MapTextureManager.class) public interface MapTextureManagerAccessor
```

## meteordevelopment.meteorclient.mixin.MapTextureManagerAccessor.meteor$invokeGetOrCreateMapInstance

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/MapTextureManagerAccessor.java:16`

```java
@Invoker("getOrCreateMapInstance") MapTextureManager.MapInstance meteor$invokeGetOrCreateMapInstance(MapId id, MapItemSavedData state)
```

## meteordevelopment.meteorclient.mixin.MinecraftAccessor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/MinecraftAccessor.java:25`

```java
@Mixin(Minecraft.class) public interface MinecraftAccessor
```

## meteordevelopment.meteorclient.mixin.MinecraftAccessor.meteor$getFps

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/MinecraftAccessor.java:27`

```java
@Accessor("fps") static int meteor$getFps()
```

## meteordevelopment.meteorclient.mixin.MinecraftAccessor.meteor$setUser

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/MinecraftAccessor.java:32`

```java
@Mutable @Accessor("user") void meteor$setUser(User session)
```

## meteordevelopment.meteorclient.mixin.MinecraftAccessor.meteor$getReloadStateTracker

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/MinecraftAccessor.java:36`

```java
@Accessor("reloadStateTracker") ResourceLoadStateTracker meteor$getReloadStateTracker()
```

## meteordevelopment.meteorclient.mixin.MinecraftAccessor.meteor$getMissTime

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/MinecraftAccessor.java:39`

```java
@Accessor("missTime") int meteor$getMissTime()
```

## meteordevelopment.meteorclient.mixin.MinecraftAccessor.meteor$setMissTime

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/MinecraftAccessor.java:42`

```java
@Accessor("missTime") void meteor$setMissTime(int attackCooldown)
```

## meteordevelopment.meteorclient.mixin.MinecraftAccessor.meteor$leftClick

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/MinecraftAccessor.java:45`

```java
@Invoker("startAttack") boolean meteor$leftClick()
```

## meteordevelopment.meteorclient.mixin.MinecraftAccessor.meteor$setProfileKeyPairManager

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/MinecraftAccessor.java:48`

```java
@Mutable @Accessor("profileKeyPairManager") void meteor$setProfileKeyPairManager(ProfileKeyPairManager keys)
```

## meteordevelopment.meteorclient.mixin.MinecraftAccessor.meteor$setUserApiService

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/MinecraftAccessor.java:52`

```java
@Mutable @Accessor("userApiService") void meteor$setUserApiService(UserApiService apiService)
```

## meteordevelopment.meteorclient.mixin.MinecraftAccessor.meteor$setSkinManager

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/MinecraftAccessor.java:56`

```java
@Mutable @Accessor("skinManager") void meteor$setSkinManager(SkinManager skinProvider)
```

## meteordevelopment.meteorclient.mixin.MinecraftAccessor.meteor$setPlayerSocialManager

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/MinecraftAccessor.java:60`

```java
@Mutable @Accessor("playerSocialManager") void meteor$setPlayerSocialManager(PlayerSocialManager socialInteractionsManager)
```

## meteordevelopment.meteorclient.mixin.MinecraftAccessor.meteor$setReportingContext

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/MinecraftAccessor.java:64`

```java
@Mutable @Accessor("reportingContext") void meteor$setReportingContext(ReportingContext abuseReportContext)
```

## meteordevelopment.meteorclient.mixin.MinecraftAccessor.meteor$setProfileFuture

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/MinecraftAccessor.java:68`

```java
@Mutable @Accessor("profileFuture") void meteor$setProfileFuture(CompletableFuture<ProfileResult> future)
```

## meteordevelopment.meteorclient.mixin.MinecraftAccessor.meteor$setServices

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/MinecraftAccessor.java:72`

```java
@Mutable @Accessor("services") void meteor$setServices(Services apiServices)
```

## meteordevelopment.meteorclient.mixin.MinecraftAccessor.meteor$handleInputEvents

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/MinecraftAccessor.java:76`

```java
@Invoker("handleKeybinds") void meteor$handleInputEvents()
```

## meteordevelopment.meteorclient.mixin.MinecraftMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/MinecraftMixin.java:61`

```java
@Mixin(value = Minecraft.class, priority = 1001) public abstract class MinecraftMixin implements IMinecraft
```

## meteordevelopment.meteorclient.mixin.MinecraftMixin.level

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/MinecraftMixin.java:72`

```java
@Shadow public ClientLevel level
```

## meteordevelopment.meteorclient.mixin.MinecraftMixin.options

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/MinecraftMixin.java:74`

```java
@Shadow @Final public Options options
```

## meteordevelopment.meteorclient.mixin.MinecraftMixin.startUseItem

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/MinecraftMixin.java:78`

```java
@Shadow protected abstract void startUseItem()
```

## meteordevelopment.meteorclient.mixin.MinecraftMixin.gameMode

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/MinecraftMixin.java:81`

```java
@Shadow @Nullable public MultiPlayerGameMode gameMode
```

## meteordevelopment.meteorclient.mixin.MinecraftMixin.player

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/MinecraftMixin.java:88`

```java
@Shadow @Nullable public LocalPlayer player
```

## meteordevelopment.meteorclient.mixin.MinecraftMixin.continueAttack

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/MinecraftMixin.java:92`

```java
@Shadow protected abstract void continueAttack(boolean down)
```

## meteordevelopment.meteorclient.mixin.MinecraftMixin.gameRenderer

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/MinecraftMixin.java:98`

```java
@Final @Shadow public GameRenderer gameRenderer
```

## meteordevelopment.meteorclient.mixin.MinecraftMixin.pick

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/MinecraftMixin.java:102`

```java
@Shadow protected abstract void pick(float partialTicks)
```

## meteordevelopment.meteorclient.mixin.MinecraftMixin.getCameraEntity

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/MinecraftMixin.java:105`

```java
@Shadow public abstract Entity getCameraEntity()
```

## meteordevelopment.meteorclient.mixin.MinecraftMixin.meteor$rightClick

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/MinecraftMixin.java:287`

```java
@Override public void meteor$rightClick()
```

## meteordevelopment.meteorclient.mixin.MinecraftRenderFrameMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/MinecraftRenderFrameMixin.java:22`

```java
@Mixin(Minecraft.class) public abstract class MinecraftRenderFrameMixin
```

## meteordevelopment.meteorclient.mixin.MinecraftServerAccessor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/MinecraftServerAccessor.java:13`

```java
@Mixin(MinecraftServer.class) public interface MinecraftServerAccessor
```

## meteordevelopment.meteorclient.mixin.MinecraftServerAccessor.meteor$getStorageSource

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/MinecraftServerAccessor.java:15`

```java
@Accessor("storageSource") LevelStorageSource.LevelStorageAccess meteor$getStorageSource()
```

## meteordevelopment.meteorclient.mixin.MobBucketItemAccessor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/MobBucketItemAccessor.java:13`

```java
@Mixin(MobBucketItem.class) public interface MobBucketItemAccessor
```

## meteordevelopment.meteorclient.mixin.MobBucketItemAccessor.meteor$getType

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/MobBucketItemAccessor.java:15`

```java
@Accessor("type") EntityType<?> meteor$getType()
```

## meteordevelopment.meteorclient.mixin.MobEffectFogEnvironmentMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/MobEffectFogEnvironmentMixin.java:19`

```java
@Mixin(MobEffectFogEnvironment.class) public abstract class MobEffectFogEnvironmentMixin
```

## meteordevelopment.meteorclient.mixin.MobEffectFogEnvironmentMixin.getMobEffect

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/MobEffectFogEnvironmentMixin.java:21`

```java
@Shadow public abstract Holder<MobEffect> getMobEffect()
```

## meteordevelopment.meteorclient.mixin.MobEffectInstanceAccessor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/MobEffectInstanceAccessor.java:12`

```java
@Mixin(MobEffectInstance.class) public interface MobEffectInstanceAccessor
```

## meteordevelopment.meteorclient.mixin.MobEffectInstanceAccessor.meteor$setDuration

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/MobEffectInstanceAccessor.java:14`

```java
@Accessor("duration") void meteor$setDuration(int duration)
```

## meteordevelopment.meteorclient.mixin.MobEffectInstanceMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/MobEffectInstanceMixin.java:17`

```java
@Mixin(MobEffectInstance.class) public abstract class MobEffectInstanceMixin
```

## meteordevelopment.meteorclient.mixin.MobMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/MobMixin.java:15`

```java
@Mixin(Mob.class) public abstract class MobMixin
```

## meteordevelopment.meteorclient.mixin.ModelBlockRendererMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/ModelBlockRendererMixin.java:33`

```java
@Mixin(ModelBlockRenderer.class) public abstract class ModelBlockRendererMixin
```

## meteordevelopment.meteorclient.mixin.MouseHandlerMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/MouseHandlerMixin.java:27`

```java
@Mixin(MouseHandler.class) public abstract class MouseHandlerMixin
```

## meteordevelopment.meteorclient.mixin.MouseHandlerMixin.getScaledXPos

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/MouseHandlerMixin.java:29`

```java
@Shadow public abstract double getScaledXPos(Window window)
```

## meteordevelopment.meteorclient.mixin.MouseHandlerMixin.getScaledYPos

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/MouseHandlerMixin.java:32`

```java
@Shadow public abstract double getScaledYPos(Window window)
```

## meteordevelopment.meteorclient.mixin.MultiPlayerGameModeAccessor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/MultiPlayerGameModeAccessor.java:13`

```java
@Mixin(MultiPlayerGameMode.class) public interface MultiPlayerGameModeAccessor
```

## meteordevelopment.meteorclient.mixin.MultiPlayerGameModeAccessor.meteor$getBreakingProgress

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/MultiPlayerGameModeAccessor.java:15`

```java
@Accessor("destroyProgress") float meteor$getBreakingProgress()
```

## meteordevelopment.meteorclient.mixin.MultiPlayerGameModeAccessor.meteor$setDestroyProgress

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/MultiPlayerGameModeAccessor.java:18`

```java
@Accessor("destroyProgress") void meteor$setDestroyProgress(float progress)
```

## meteordevelopment.meteorclient.mixin.MultiPlayerGameModeAccessor.meteor$getCurrentBreakingBlockPos

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/MultiPlayerGameModeAccessor.java:21`

```java
@Accessor("destroyBlockPos") BlockPos meteor$getCurrentBreakingBlockPos()
```

## meteordevelopment.meteorclient.mixin.MultiPlayerGameModeMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/MultiPlayerGameModeMixin.java:45`

```java
@Mixin(MultiPlayerGameMode.class) public abstract class MultiPlayerGameModeMixin implements IMultiPlayerGameMode
```

## meteordevelopment.meteorclient.mixin.MultiPlayerGameModeMixin.ensureHasSentCarriedItem

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/MultiPlayerGameModeMixin.java:50`

```java
@Shadow protected abstract void ensureHasSentCarriedItem()
```

## meteordevelopment.meteorclient.mixin.MultiPlayerGameModeMixin.destroyBlock

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/MultiPlayerGameModeMixin.java:53`

```java
@Shadow public abstract boolean destroyBlock(BlockPos pos)
```

## meteordevelopment.meteorclient.mixin.MultiPlayerGameModeMixin.startPrediction

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/MultiPlayerGameModeMixin.java:56`

```java
@Shadow public abstract void startPrediction(ClientLevel level, PredictiveAction predictiveAction)
```

## meteordevelopment.meteorclient.mixin.MultiPlayerGameModeMixin.useItemOn

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/MultiPlayerGameModeMixin.java:95`

```java
@Inject(method = "useItemOn", at = @At("HEAD"), cancellable = true) public void useItemOn(LocalPlayer player, InteractionHand hand, BlockHitResult blockHit, CallbackInfoReturnable<InteractionResult> cir)
```

## meteordevelopment.meteorclient.mixin.MultiPlayerGameModeMixin.meteor$syncSelected

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/MultiPlayerGameModeMixin.java:161`

```java
@Override public void meteor$syncSelected()
```

## meteordevelopment.meteorclient.mixin.MusicManagerMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/MusicManagerMixin.java:19`

```java
@Mixin(MusicManager.class) public abstract class MusicManagerMixin
```

## meteordevelopment.meteorclient.mixin.MusicManagerMixin.stopPlaying

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/MusicManagerMixin.java:24`

```java
@Shadow public abstract void stopPlaying()
```

## meteordevelopment.meteorclient.mixin.MutableComponentMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/MutableComponentMixin.java:15`

```java
@Mixin(MutableComponent.class) public abstract class MutableComponentMixin implements IComponent
```

## meteordevelopment.meteorclient.mixin.MutableComponentMixin.meteor$invalidateCache

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/MutableComponentMixin.java:20`

```java
@Override public void meteor$invalidateCache()
```

## meteordevelopment.meteorclient.mixin.OptionInstanceMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/OptionInstanceMixin.java:17`

```java
@Mixin(OptionInstance.class) public abstract class OptionInstanceMixin<T> implements IOptionInstance
```

## meteordevelopment.meteorclient.mixin.OptionInstanceMixin.meteor$set

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/OptionInstanceMixin.java:27`

```java
@Override public void meteor$set(Object value)
```

## meteordevelopment.meteorclient.mixin.OptionsMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/OptionsMixin.java:28`

```java
@Mixin(Options.class) public abstract class OptionsMixin
```

## meteordevelopment.meteorclient.mixin.OptionsMixin.keyMappings

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/OptionsMixin.java:30`

```java
@Shadow @Final @Mutable public KeyMapping[] keyMappings
```

## meteordevelopment.meteorclient.mixin.PacketBundlingMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/PacketBundlingMixin.java:17`

```java
@Mixin(targets = "net/minecraft/network/protocol/BundlerInfo$1$1") public abstract class PacketBundlingMixin
```

## meteordevelopment.meteorclient.mixin.ParticleEngineMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/ParticleEngineMixin.java:18`

```java
@Mixin(ParticleEngine.class) public abstract class ParticleEngineMixin
```

## meteordevelopment.meteorclient.mixin.PipelineBuilderMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/PipelineBuilderMixin.java:23`

```java
@Mixin(PipelineBuilder.class) public abstract class PipelineBuilderMixin
```

## meteordevelopment.meteorclient.mixin.PlayerAccessor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/PlayerAccessor.java:13`

```java
@Mixin(Player.class) public interface PlayerAccessor
```

## meteordevelopment.meteorclient.mixin.PlayerAccessor.meteor$canChangeIntoPose

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/PlayerAccessor.java:15`

```java
@Invoker("canPlayerFitWithinBlocksAndEntitiesWhen") boolean meteor$canChangeIntoPose(Pose pose)
```

## meteordevelopment.meteorclient.mixin.PlayerInfoMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/PlayerInfoMixin.java:21`

```java
@Mixin(PlayerInfo.class) public abstract class PlayerInfoMixin
```

## meteordevelopment.meteorclient.mixin.PlayerInfoMixin.getProfile

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/PlayerInfoMixin.java:23`

```java
@Shadow public abstract GameProfile getProfile()
```

## meteordevelopment.meteorclient.mixin.PlayerMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/PlayerMixin.java:36`

```java
@Mixin(Player.class) public abstract class PlayerMixin extends LivingEntity
```

## meteordevelopment.meteorclient.mixin.PlayerMixin.getAbilities

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/PlayerMixin.java:38`

```java
@Shadow public abstract Abilities getAbilities()
```

## meteordevelopment.meteorclient.mixin.PlayerMixin.PlayerMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/PlayerMixin.java:41`

```java
protected PlayerMixin(EntityType<? extends LivingEntity> entityType, Level world)
```

## meteordevelopment.meteorclient.mixin.PlayerMixin.clipAtLedge

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/PlayerMixin.java:45`

```java
@Inject(method = "isStayingOnGroundSurface", at = @At("HEAD"), cancellable = true) protected void clipAtLedge(CallbackInfoReturnable<Boolean> cir)
```

## meteordevelopment.meteorclient.mixin.PlayerMixin.onGetBlockBreakingSpeed

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/PlayerMixin.java:63`

```java
@ModifyReturnValue(method = "getDestroySpeed", at = @At(value = "RETURN")) public float onGetBlockBreakingSpeed(float breakSpeed, BlockState state)
```

## meteordevelopment.meteorclient.mixin.PlayerTabOverlayMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/PlayerTabOverlayMixin.java:27`

```java
@Mixin(PlayerTabOverlay.class) public abstract class PlayerTabOverlayMixin
```

## meteordevelopment.meteorclient.mixin.PlayerTabOverlayMixin.getPlayerInfos

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/PlayerTabOverlayMixin.java:29`

```java
@Shadow protected abstract List<PlayerInfo> getPlayerInfos()
```

## meteordevelopment.meteorclient.mixin.PlayerTabOverlayMixin.getNameForDisplay

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/PlayerTabOverlayMixin.java:39`

```java
@Inject(method = "getNameForDisplay", at = @At("HEAD"), cancellable = true) public void getNameForDisplay(PlayerInfo info, CallbackInfoReturnable<Component> cir)
```

## meteordevelopment.meteorclient.mixin.PowderSnowBlockMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/PowderSnowBlockMixin.java:18`

```java
@Mixin(PowderSnowBlock.class) public abstract class PowderSnowBlockMixin
```

## meteordevelopment.meteorclient.mixin.ProjectileInGroundAccessor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/ProjectileInGroundAccessor.java:12`

```java
@Mixin(AbstractArrow.class) public interface ProjectileInGroundAccessor
```

## meteordevelopment.meteorclient.mixin.ProjectileInGroundAccessor.meteor$invokeIsInGround

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/ProjectileInGroundAccessor.java:14`

```java
@Invoker("isInGround") boolean meteor$invokeIsInGround()
```

## meteordevelopment.meteorclient.mixin.ProjectileUtilMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/ProjectileUtilMixin.java:18`

```java
@Mixin(ProjectileUtil.class) public abstract class ProjectileUtilMixin
```

## meteordevelopment.meteorclient.mixin.ReloadStateAccessor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/ReloadStateAccessor.java:12`

```java
@Mixin(ResourceLoadStateTracker.ReloadState.class) public interface ReloadStateAccessor
```

## meteordevelopment.meteorclient.mixin.ReloadStateAccessor.meteor$isFinished

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/ReloadStateAccessor.java:14`

```java
@Accessor("finished") boolean meteor$isFinished()
```

## meteordevelopment.meteorclient.mixin.RenderPipelineMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/RenderPipelineMixin.java:13`

```java
@Mixin(RenderPipeline.class) public abstract class RenderPipelineMixin implements IRenderPipeline
```

## meteordevelopment.meteorclient.mixin.RenderPipelineMixin.meteor$setLineSmooth

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/RenderPipelineMixin.java:18`

```java
@Override public void meteor$setLineSmooth(boolean lineSmooth)
```

## meteordevelopment.meteorclient.mixin.RenderPipelineMixin.meteor$getLineSmooth

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/RenderPipelineMixin.java:23`

```java
@Override public boolean meteor$getLineSmooth()
```

## meteordevelopment.meteorclient.mixin.RenderTickCounterDynamicMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/RenderTickCounterDynamicMixin.java:18`

```java
@Mixin(DeltaTracker.Timer.class) public abstract class RenderTickCounterDynamicMixin
```

## meteordevelopment.meteorclient.mixin.RenderTypeAccessor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/RenderTypeAccessor.java:13`

```java
@Mixin(RenderType.class) public interface RenderTypeAccessor
```

## meteordevelopment.meteorclient.mixin.RenderTypeAccessor.getState

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/RenderTypeAccessor.java:15`

```java
@Accessor("state") RenderSetup getState()
```

## meteordevelopment.meteorclient.mixin.ResourceLoadStateTrackerAccessor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/ResourceLoadStateTrackerAccessor.java:12`

```java
@Mixin(ResourceLoadStateTracker.class) public interface ResourceLoadStateTrackerAccessor
```

## meteordevelopment.meteorclient.mixin.ResourceLoadStateTrackerAccessor.meteor$getReloadState

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/ResourceLoadStateTrackerAccessor.java:14`

```java
@Accessor("reloadState") ResourceLoadStateTracker.ReloadState meteor$getReloadState()
```

## meteordevelopment.meteorclient.mixin.ScreenEffectRendererMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/ScreenEffectRendererMixin.java:21`

```java
@Mixin(ScreenEffectRenderer.class) public abstract class ScreenEffectRendererMixin
```

## meteordevelopment.meteorclient.mixin.ScreenMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/ScreenMixin.java:32`

```java
@Mixin(value = Screen.class, priority = 500) // needs to be before baritone public abstract class ScreenMixin
```

## meteordevelopment.meteorclient.mixin.ServerPlayerMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/ServerPlayerMixin.java:20`

```java
@Mixin(ServerPlayer.class) public abstract class ServerPlayerMixin extends LivingEntity
```

## meteordevelopment.meteorclient.mixin.ServerPlayerMixin.ServerPlayerMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/ServerPlayerMixin.java:22`

```java
protected ServerPlayerMixin(EntityType<? extends LivingEntity> entityType, Level world)
```

## meteordevelopment.meteorclient.mixin.ServerPlayerMixin.dontJump

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/ServerPlayerMixin.java:26`

```java
@Inject(method = "jumpFromGround", at = @At("HEAD"), cancellable = true) public void dontJump(CallbackInfo ci)
```

## meteordevelopment.meteorclient.mixin.ServerboundMovePlayerPacketAccessor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/ServerboundMovePlayerPacketAccessor.java:13`

```java
@Mixin(ServerboundMovePlayerPacket.class) public interface ServerboundMovePlayerPacketAccessor
```

## meteordevelopment.meteorclient.mixin.ServerboundMovePlayerPacketAccessor.meteor$setY

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/ServerboundMovePlayerPacketAccessor.java:15`

```java
@Mutable @Accessor("y") void meteor$setY(double y)
```

## meteordevelopment.meteorclient.mixin.ServerboundMovePlayerPacketAccessor.meteor$setOnGround

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/ServerboundMovePlayerPacketAccessor.java:19`

```java
@Mutable @Accessor("onGround") void meteor$setOnGround(boolean onGround)
```

## meteordevelopment.meteorclient.mixin.ServerboundMovePlayerPacketMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/ServerboundMovePlayerPacketMixin.java:13`

```java
@Mixin(ServerboundMovePlayerPacket.class) public abstract class ServerboundMovePlayerPacketMixin implements IServerboundMovePlayerPacket
```

## meteordevelopment.meteorclient.mixin.ServerboundMovePlayerPacketMixin.meteor$setTag

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/ServerboundMovePlayerPacketMixin.java:18`

```java
@Override public void meteor$setTag(int tag)
```

## meteordevelopment.meteorclient.mixin.ServerboundMovePlayerPacketMixin.meteor$getTag

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/ServerboundMovePlayerPacketMixin.java:23`

```java
@Override public int meteor$getTag()
```

## meteordevelopment.meteorclient.mixin.ShaderManagerMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/ShaderManagerMixin.java:17`

```java
@Mixin(ShaderManager.class) public abstract class ShaderManagerMixin
```

## meteordevelopment.meteorclient.mixin.ShulkerBoxMenuAccessor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/ShulkerBoxMenuAccessor.java:13`

```java
@Mixin(ShulkerBoxMenu.class) public interface ShulkerBoxMenuAccessor
```

## meteordevelopment.meteorclient.mixin.ShulkerBoxMenuAccessor.meteor$getContainer

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/ShulkerBoxMenuAccessor.java:15`

```java
@Accessor("container") Container meteor$getContainer()
```

## meteordevelopment.meteorclient.mixin.SkinManagerAccessor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/SkinManagerAccessor.java:12`

```java
@Mixin(SkinManager.class) public interface SkinManagerAccessor
```

## meteordevelopment.meteorclient.mixin.SkinManagerAccessor.meteor$getSkinTextures

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/SkinManagerAccessor.java:14`

```java
@Accessor("skinTextures") SkinManager.TextureCache meteor$getSkinTextures()
```

## meteordevelopment.meteorclient.mixin.SkyRendererMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/SkyRendererMixin.java:25`

```java
@Mixin(SkyRenderer.class) public abstract class SkyRendererMixin
```

## meteordevelopment.meteorclient.mixin.SlimeBlockMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/SlimeBlockMixin.java:22`

```java
@Mixin(SlimeBlock.class) public abstract class SlimeBlockMixin
```

## meteordevelopment.meteorclient.mixin.SlotMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/SlotMixin.java:14`

```java
@Mixin(Slot.class) public abstract class SlotMixin implements ISlot
```

## meteordevelopment.meteorclient.mixin.SlotMixin.index

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/SlotMixin.java:16`

```java
@Shadow public int index
```

## meteordevelopment.meteorclient.mixin.SlotMixin.meteor$getIndex

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/SlotMixin.java:22`

```java
@Override public int meteor$getIndex()
```

## meteordevelopment.meteorclient.mixin.SlotMixin.meteor$getSlot

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/SlotMixin.java:27`

```java
@Override public int meteor$getSlot()
```

## meteordevelopment.meteorclient.mixin.SoundEngineMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/SoundEngineMixin.java:23`

```java
@Mixin(SoundEngine.class) public abstract class SoundEngineMixin
```

## meteordevelopment.meteorclient.mixin.SoundEngineMixin.stop

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/SoundEngineMixin.java:25`

```java
@Shadow public abstract void stop(SoundInstance soundInstance)
```

## meteordevelopment.meteorclient.mixin.SpawnerRendererMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/SpawnerRendererMixin.java:19`

```java
@Mixin(SpawnerRenderer.class) public abstract class SpawnerRendererMixin implements BlockEntityRenderer<SpawnerBlockEntity, SpawnerRenderState>
```

## meteordevelopment.meteorclient.mixin.SplashManagerMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/SplashManagerMixin.java:21`

```java
@Mixin(SplashManager.class) public abstract class SplashManagerMixin
```

## meteordevelopment.meteorclient.mixin.StringDecomposerMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/StringDecomposerMixin.java:15`

```java
@Mixin(StringDecomposer.class) public abstract class StringDecomposerMixin
```

## meteordevelopment.meteorclient.mixin.StringUtilMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/StringUtilMixin.java:15`

```java
@Mixin(StringUtil.class) public abstract class StringUtilMixin
```

## meteordevelopment.meteorclient.mixin.SweetBerryBushBlockMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/SweetBerryBushBlockMixin.java:23`

```java
@Mixin(SweetBerryBushBlock.class) public abstract class SweetBerryBushBlockMixin
```

## meteordevelopment.meteorclient.mixin.TitleScreenMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/TitleScreenMixin.java:22`

```java
@Mixin(TitleScreen.class) public abstract class TitleScreenMixin extends Screen
```

## meteordevelopment.meteorclient.mixin.TitleScreenMixin.TitleScreenMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/TitleScreenMixin.java:24`

```java
public TitleScreenMixin(Component title)
```

## meteordevelopment.meteorclient.mixin.TooltipDisplayMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/TooltipDisplayMixin.java:16`

```java
@Mixin(TooltipDisplay.class) public abstract class TooltipDisplayMixin
```

## meteordevelopment.meteorclient.mixin.TridentItemMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/TridentItemMixin.java:25`

```java
@Mixin(TridentItem.class) public abstract class TridentItemMixin
```

## meteordevelopment.meteorclient.mixin.Vec3Mixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/Vec3Mixin.java:15`

```java
@Mixin(Vec3.class) public abstract class Vec3Mixin implements IVec3
```

## meteordevelopment.meteorclient.mixin.Vec3Mixin.x

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/Vec3Mixin.java:17`

```java
@Shadow @Final @Mutable public double x
```

## meteordevelopment.meteorclient.mixin.Vec3Mixin.y

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/Vec3Mixin.java:21`

```java
@Shadow @Final @Mutable public double y
```

## meteordevelopment.meteorclient.mixin.Vec3Mixin.z

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/Vec3Mixin.java:25`

```java
@Shadow @Final @Mutable public double z
```

## meteordevelopment.meteorclient.mixin.Vec3Mixin.meteor$set

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/Vec3Mixin.java:30`

```java
@Override public Vec3 meteor$set(double x, double y, double z)
```

## meteordevelopment.meteorclient.mixin.Vec3Mixin.meteor$setXZ

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/Vec3Mixin.java:39`

```java
@Override public Vec3 meteor$setXZ(double x, double z)
```

## meteordevelopment.meteorclient.mixin.Vec3Mixin.meteor$setY

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/Vec3Mixin.java:47`

```java
@Override public Vec3 meteor$setY(double y)
```

## meteordevelopment.meteorclient.mixin.VisGraphMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/VisGraphMixin.java:17`

```java
@Mixin(VisGraph.class) public abstract class VisGraphMixin
```

## meteordevelopment.meteorclient.mixin.VulkanCommandEncoderMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/VulkanCommandEncoderMixin.java:19`

```java
@Mixin(VulkanCommandEncoder.class) public abstract class VulkanCommandEncoderMixin
```

## meteordevelopment.meteorclient.mixin.VulkanDeviceMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/VulkanDeviceMixin.java:14`

```java
@Mixin(VulkanDevice.class) public abstract class VulkanDeviceMixin implements IGpuDevice
```

## meteordevelopment.meteorclient.mixin.VulkanDeviceMixin.meteor$pushScissor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/VulkanDeviceMixin.java:22`

```java
@Override public void meteor$pushScissor(int x, int y, int width, int height)
```

## meteordevelopment.meteorclient.mixin.VulkanDeviceMixin.meteor$popScissor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/VulkanDeviceMixin.java:33`

```java
@Override public void meteor$popScissor()
```

## meteordevelopment.meteorclient.mixin.VulkanDeviceMixin.meteor$onCreateRenderPass

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/VulkanDeviceMixin.java:40`

```java
@Deprecated @Override public void meteor$onCreateRenderPass(RenderPassBackend backend)
```

## meteordevelopment.meteorclient.mixin.WebBlockMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/WebBlockMixin.java:23`

```java
@Mixin(WebBlock.class) public abstract class WebBlockMixin
```

## meteordevelopment.meteorclient.mixin.WingsLayerMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/WingsLayerMixin.java:23`

```java
@Mixin(WingsLayer.class) public abstract class WingsLayerMixin<S extends HumanoidRenderState, M extends EntityModel<S>> extends RenderLayer<S, M>
```

## meteordevelopment.meteorclient.mixin.WingsLayerMixin.WingsLayerMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/WingsLayerMixin.java:25`

```java
public WingsLayerMixin(RenderLayerParent<S, M> context)
```

## meteordevelopment.meteorclient.mixin.WorldBorderMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/WorldBorderMixin.java:16`

```java
@Mixin(WorldBorder.class) public abstract class WorldBorderMixin
```

## meteordevelopment.meteorclient.mixin.baritone.ComeCommandMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/baritone/ComeCommandMixin.java:19`

```java
@Mixin(ComeCommand.class) public abstract class ComeCommandMixin
```

## meteordevelopment.meteorclient.mixin.indigo.AltModelBlockRendererImplMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/indigo/AltModelBlockRendererImplMixin.java:25`

```java
@SuppressWarnings("UnstableApiUsage") @Mixin(AltModelBlockRendererImpl.class) public abstract class AltModelBlockRendererImplMixin
```

## meteordevelopment.meteorclient.mixin.lithium.ChunkAwareBlockCollisionSweeperMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/lithium/ChunkAwareBlockCollisionSweeperMixin.java:25`

```java
@Mixin(value = ChunkAwareBlockCollisionSweeperVoxelShape.class) public abstract class ChunkAwareBlockCollisionSweeperMixin extends ChunkAwareBlockCollisionSweeper<VoxelShape>
```

## meteordevelopment.meteorclient.mixin.lithium.ChunkAwareBlockCollisionSweeperMixin.ChunkAwareBlockCollisionSweeperMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/lithium/ChunkAwareBlockCollisionSweeperMixin.java:27`

```java
public ChunkAwareBlockCollisionSweeperMixin(Level world, @Nullable Entity entity, AABB box, boolean hideLastCollision)
```

## meteordevelopment.meteorclient.mixin.lithium.LithiumEntityCollisionsMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/lithium/LithiumEntityCollisionsMixin.java:18`

```java
@Mixin(value = LithiumEntityCollisions.class) public abstract class LithiumEntityCollisionsMixin
```

## meteordevelopment.meteorclient.mixin.metallum.MetalDeviceMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/metallum/MetalDeviceMixin.java:13`

```java
@Mixin(targets = "com.metallum.render.MetalDevice", remap = false) public abstract class MetalDeviceMixin implements IGpuDevice
```

## meteordevelopment.meteorclient.mixin.metallum.MetalDeviceMixin.meteor$pushScissor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/metallum/MetalDeviceMixin.java:21`

```java
@Override public void meteor$pushScissor(int x, int y, int width, int height)
```

## meteordevelopment.meteorclient.mixin.metallum.MetalDeviceMixin.meteor$popScissor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/metallum/MetalDeviceMixin.java:34`

```java
@Override public void meteor$popScissor()
```

## meteordevelopment.meteorclient.mixin.metallum.MetalDeviceMixin.meteor$onCreateRenderPass

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/metallum/MetalDeviceMixin.java:42`

```java
@Deprecated @Override public void meteor$onCreateRenderPass(RenderPassBackend backend)
```

## meteordevelopment.meteorclient.mixin.sodium.AbstractBlockRenderContextMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/sodium/AbstractBlockRenderContextMixin.java:24`

```java
@Mixin(value = AbstractBlockRenderContext.class, remap = false) public abstract class AbstractBlockRenderContextMixin
```

## meteordevelopment.meteorclient.mixin.sodium.AbstractBlockRenderContextMixin.state

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/sodium/AbstractBlockRenderContextMixin.java:26`

```java
@Shadow protected BlockState state
```

## meteordevelopment.meteorclient.mixin.sodium.AbstractBlockRenderContextMixin.level

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/sodium/AbstractBlockRenderContextMixin.java:28`

```java
@Shadow protected BlockAndTintGetter level
```

## meteordevelopment.meteorclient.mixin.sodium.AbstractBlockRenderContextMixin.pos

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/sodium/AbstractBlockRenderContextMixin.java:30`

```java
@Shadow protected BlockPos pos
```

## meteordevelopment.meteorclient.mixin.sodium.SodiumBlockRendererMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/sodium/SodiumBlockRendererMixin.java:23`

```java
@Mixin(value = BlockRenderer.class, remap = false) public abstract class SodiumBlockRendererMixin
```

## meteordevelopment.meteorclient.mixin.sodium.SodiumChunkBuilderMeshingTaskMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/sodium/SodiumChunkBuilderMeshingTaskMixin.java:16`

```java
@Mixin(value = ChunkBuilderMeshingTask.class, remap = false) public abstract class SodiumChunkBuilderMeshingTaskMixin
```

## meteordevelopment.meteorclient.mixin.sodium.SodiumDefaultFluidRendererMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/sodium/SodiumDefaultFluidRendererMixin.java:39`

```java
@Mixin(value = DefaultFluidRenderer.class, remap = false) public abstract class SodiumDefaultFluidRendererMixin
```

## meteordevelopment.meteorclient.mixin.sodium.SodiumFluidRendererImplDefaultRenderContextMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/sodium/SodiumFluidRendererImplDefaultRenderContextMixin.java:30`

```java
@Mixin(targets = "net.caffeinemc.mods.sodium.fabric.render.FluidRendererImpl$DefaultRenderContext", remap = false) public abstract class SodiumFluidRendererImplDefaultRenderContextMixin
```

## meteordevelopment.meteorclient.mixin.sodium.SodiumFluidRendererImplMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/sodium/SodiumFluidRendererImplMixin.java:25`

```java
@Mixin(value = FluidRendererImpl.class, remap = false) public abstract class SodiumFluidRendererImplMixin
```

## meteordevelopment.meteorclient.mixin.sodium.SodiumLightDataAccessMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/sodium/SodiumLightDataAccessMixin.java:25`

```java
@Mixin(value = LightDataAccess.class, remap = false) public abstract class SodiumLightDataAccessMixin
```

## meteordevelopment.meteorclient.mixin.sodium.SodiumLightDataAccessMixin.level

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/sodium/SodiumLightDataAccessMixin.java:30`

```java
@Shadow protected BlockAndTintGetter level
```

## meteordevelopment.meteorclient.mixin.sodium.SodiumWorldRendererMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/sodium/SodiumWorldRendererMixin.java:18`

```java
@Mixin(SodiumWorldRenderer.class) public abstract class SodiumWorldRendererMixin
```
