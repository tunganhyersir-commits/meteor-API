# mixin

Khai báo Java có cú pháp public/protected. Không bao gồm API kế thừa/tổng hợp bởi compiler; xem kiểm tra bytecode riêng.

## meteordevelopment.meteorclient.mixin.AbstractBlockAccessor

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/AbstractBlockAccessor.java:12`

```java
@Mixin(AbstractBlock.class) public interface AbstractBlockAccessor
```

## meteordevelopment.meteorclient.mixin.AbstractBlockAccessor.meteor$isCollidable

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/AbstractBlockAccessor.java:14`

```java
@Accessor("collidable") boolean meteor$isCollidable()
```

## meteordevelopment.meteorclient.mixin.AbstractBlockMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/AbstractBlockMixin.java:21`

```java
@Mixin(AbstractBlock.class) public abstract class AbstractBlockMixin
```

## meteordevelopment.meteorclient.mixin.AbstractBlockStateMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/AbstractBlockStateMixin.java:18`

```java
@Mixin(AbstractBlock.AbstractBlockState.class) public abstract class AbstractBlockStateMixin
```

## meteordevelopment.meteorclient.mixin.AbstractBoatEntityMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/AbstractBoatEntityMixin.java:16`

```java
@Mixin(AbstractBoatEntity.class) public abstract class AbstractBoatEntityMixin
```

## meteordevelopment.meteorclient.mixin.AbstractClientPlayerEntityAccessor

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/AbstractClientPlayerEntityAccessor.java:13`

```java
@Mixin(AbstractClientPlayerEntity.class) public interface AbstractClientPlayerEntityAccessor
```

## meteordevelopment.meteorclient.mixin.AbstractClientPlayerEntityAccessor.meteor$setPlayerListEntry

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/AbstractClientPlayerEntityAccessor.java:15`

```java
@Accessor("playerListEntry") void meteor$setPlayerListEntry(PlayerListEntry entry)
```

## meteordevelopment.meteorclient.mixin.AbstractClientPlayerEntityMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/AbstractClientPlayerEntityMixin.java:18`

```java
@Mixin(AbstractClientPlayerEntity.class) public abstract class AbstractClientPlayerEntityMixin
```

## meteordevelopment.meteorclient.mixin.AbstractFurnaceScreenHandlerMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/AbstractFurnaceScreenHandlerMixin.java:14`

```java
@Mixin(AbstractFurnaceScreenHandler.class) public abstract class AbstractFurnaceScreenHandlerMixin implements IAbstractFurnaceScreenHandler
```

## meteordevelopment.meteorclient.mixin.AbstractFurnaceScreenHandlerMixin.isSmeltable

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/AbstractFurnaceScreenHandlerMixin.java:16`

```java
@Shadow protected abstract boolean isSmeltable(ItemStack itemStack)
```

## meteordevelopment.meteorclient.mixin.AbstractFurnaceScreenHandlerMixin.meteor$isItemSmeltable

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/AbstractFurnaceScreenHandlerMixin.java:19`

```java
@Override public boolean meteor$isItemSmeltable(ItemStack itemStack)
```

## meteordevelopment.meteorclient.mixin.AbstractFurnaceScreenMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/AbstractFurnaceScreenMixin.java:18`

```java
@Mixin(AbstractFurnaceScreen.class) public abstract class AbstractFurnaceScreenMixin<T extends AbstractFurnaceScreenHandler> extends HandledScreen<T> implements RecipeBookProvider
```

## meteordevelopment.meteorclient.mixin.AbstractFurnaceScreenMixin.AbstractFurnaceScreenMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/AbstractFurnaceScreenMixin.java:20`

```java
public AbstractFurnaceScreenMixin(T container, PlayerInventory playerInventory, Text name)
```

## meteordevelopment.meteorclient.mixin.AbstractFurnaceScreenMixin.handledScreenTick

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/AbstractFurnaceScreenMixin.java:24`

```java
@Override public void handledScreenTick()
```

## meteordevelopment.meteorclient.mixin.AbstractSignBlockEntityRendererMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/AbstractSignBlockEntityRendererMixin.java:15`

```java
@Mixin(AbstractSignBlockEntityRenderer.class) public abstract class AbstractSignBlockEntityRendererMixin
```

## meteordevelopment.meteorclient.mixin.AbstractSignEditScreenAccessor

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/AbstractSignEditScreenAccessor.java:13`

```java
@Mixin(AbstractSignEditScreen.class) public interface AbstractSignEditScreenAccessor
```

## meteordevelopment.meteorclient.mixin.AbstractSignEditScreenAccessor.meteor$getSign

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/AbstractSignEditScreenAccessor.java:15`

```java
@Accessor("blockEntity") SignBlockEntity meteor$getSign()
```

## meteordevelopment.meteorclient.mixin.ArmorFeatureRendererMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/ArmorFeatureRendererMixin.java:21`

```java
@Mixin(ArmorFeatureRenderer.class) public abstract class ArmorFeatureRendererMixin<S extends BipedEntityRenderState, M extends BipedEntityModel<S>, A extends BipedEntityModel<S>>
```

## meteordevelopment.meteorclient.mixin.ArmorStandEntityRendererMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/ArmorStandEntityRendererMixin.java:18`

```java
@Mixin(ArmorStandEntityRenderer.class) public class ArmorStandEntityRendererMixin
```

## meteordevelopment.meteorclient.mixin.AttackRangeComponentMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/AttackRangeComponentMixin.java:20`

```java
@Mixin(AttackRangeComponent.class) public class AttackRangeComponentMixin
```

## meteordevelopment.meteorclient.mixin.BannerBlockEntityRendererMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/BannerBlockEntityRendererMixin.java:33`

```java
@Mixin(BannerBlockEntityRenderer.class) public abstract class BannerBlockEntityRendererMixin
```

## meteordevelopment.meteorclient.mixin.BeaconBlockEntityRendererMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/BeaconBlockEntityRendererMixin.java:23`

```java
@Mixin(BeaconBlockEntityRenderer.class) public abstract class BeaconBlockEntityRendererMixin<T extends BlockEntity & BeamEmitter> implements BlockEntityRenderer<T, BeaconBlockEntityRenderState>
```

## meteordevelopment.meteorclient.mixin.BeaconScreenMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/BeaconScreenMixin.java:30`

```java
@Mixin(BeaconScreen.class) public abstract class BeaconScreenMixin extends HandledScreen<BeaconScreenHandler>
```

## meteordevelopment.meteorclient.mixin.BeaconScreenMixin.addButton

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/BeaconScreenMixin.java:32`

```java
@Shadow protected abstract <T extends ClickableWidget> void addButton(T button)
```

## meteordevelopment.meteorclient.mixin.BeaconScreenMixin.BeaconScreenMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/BeaconScreenMixin.java:35`

```java
public BeaconScreenMixin(BeaconScreenHandler handler, PlayerInventory inventory, Text title)
```

## meteordevelopment.meteorclient.mixin.BiomeColorsMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/BiomeColorsMixin.java:18`

```java
@Mixin(BiomeColors.class) public abstract class BiomeColorsMixin
```

## meteordevelopment.meteorclient.mixin.BlockCollisionSpliteratorMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/BlockCollisionSpliteratorMixin.java:23`

```java
@Mixin(BlockCollisionSpliterator.class) public abstract class BlockCollisionSpliteratorMixin
```

## meteordevelopment.meteorclient.mixin.BlockColorsMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/BlockColorsMixin.java:17`

```java
@Mixin(BlockColors.class) public abstract class BlockColorsMixin
```

## meteordevelopment.meteorclient.mixin.BlockEntityRenderManagerAccessor

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/BlockEntityRenderManagerAccessor.java:13`

```java
@Mixin(BlockEntityRenderManager.class) public interface BlockEntityRenderManagerAccessor
```

## meteordevelopment.meteorclient.mixin.BlockEntityRenderManagerAccessor.getSpriteHolder

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/BlockEntityRenderManagerAccessor.java:15`

```java
@Accessor("spriteHolder") SpriteHolder getSpriteHolder()
```

## meteordevelopment.meteorclient.mixin.BlockEntityRenderManagerMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/BlockEntityRenderManagerMixin.java:20`

```java
@Mixin(BlockEntityRenderManager.class) public abstract class BlockEntityRenderManagerMixin
```

## meteordevelopment.meteorclient.mixin.BlockHitResultAccessor

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/BlockHitResultAccessor.java:14`

```java
@Mixin(BlockHitResult.class) public interface BlockHitResultAccessor
```

## meteordevelopment.meteorclient.mixin.BlockHitResultAccessor.meteor$setSide

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/BlockHitResultAccessor.java:16`

```java
@Mutable @Accessor("side") void meteor$setSide(Direction direction)
```

## meteordevelopment.meteorclient.mixin.BlockItemMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/BlockItemMixin.java:22`

```java
@Mixin(BlockItem.class) public abstract class BlockItemMixin
```

## meteordevelopment.meteorclient.mixin.BlockItemMixin.getPlacementState

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/BlockItemMixin.java:24`

```java
@Shadow protected abstract BlockState getPlacementState(ItemPlacementContext context)
```

## meteordevelopment.meteorclient.mixin.BlockListCheckerMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/BlockListCheckerMixin.java:17`

```java
@NullMarked @Mixin(BlockListChecker.class) public interface BlockListCheckerMixin
```

## meteordevelopment.meteorclient.mixin.BlockMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/BlockMixin.java:24`

```java
@Mixin(Block.class) public abstract class BlockMixin extends AbstractBlock implements ItemConvertible
```

## meteordevelopment.meteorclient.mixin.BlockMixin.BlockMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/BlockMixin.java:26`

```java
public BlockMixin(Settings settings)
```

## meteordevelopment.meteorclient.mixin.BlockMixin.getSlipperiness

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/BlockMixin.java:30`

```java
@ModifyReturnValue(method = "getSlipperiness", at = @At("RETURN")) public float getSlipperiness(float original)
```

## meteordevelopment.meteorclient.mixin.BlockModelRendererMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/BlockModelRendererMixin.java:29`

```java
@Mixin(BlockModelRenderer.class) public abstract class BlockModelRendererMixin
```

## meteordevelopment.meteorclient.mixin.BlockRenderLayersMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/BlockRenderLayersMixin.java:20`

```java
@Mixin(BlockRenderLayers.class) public class BlockRenderLayersMixin
```

## meteordevelopment.meteorclient.mixin.BlockRenderManagerMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/BlockRenderManagerMixin.java:22`

```java
@Mixin(BlockRenderManager.class) public abstract class BlockRenderManagerMixin
```

## meteordevelopment.meteorclient.mixin.BlockStateMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/BlockStateMixin.java:22`

```java
@Mixin(BlockState.class) public abstract class BlockStateMixin extends AbstractBlock.AbstractBlockState
```

## meteordevelopment.meteorclient.mixin.BlockStateMixin.BlockStateMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/BlockStateMixin.java:24`

```java
public BlockStateMixin(Block block, Reference2ObjectArrayMap<Property<?>, Comparable<?>> propertyMap, MapCodec<BlockState> mapCodec)
```

## meteordevelopment.meteorclient.mixin.BlockStateMixin.onUse

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/BlockStateMixin.java:28`

```java
@Override public ActionResult onUse(World world, PlayerEntity player, BlockHitResult hit)
```

## meteordevelopment.meteorclient.mixin.BookEditScreenMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/BookEditScreenMixin.java:32`

```java
@Mixin(BookEditScreen.class) public abstract class BookEditScreenMixin extends Screen
```

## meteordevelopment.meteorclient.mixin.BookEditScreenMixin.updatePage

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/BookEditScreenMixin.java:37`

```java
@Shadow protected abstract void updatePage()
```

## meteordevelopment.meteorclient.mixin.BookEditScreenMixin.openNextPage

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/BookEditScreenMixin.java:40`

```java
@Shadow protected abstract void openNextPage()
```

## meteordevelopment.meteorclient.mixin.BookEditScreenMixin.openPreviousPage

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/BookEditScreenMixin.java:43`

```java
@Shadow protected abstract void openPreviousPage()
```

## meteordevelopment.meteorclient.mixin.BookEditScreenMixin.BookEditScreenMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/BookEditScreenMixin.java:46`

```java
public BookEditScreenMixin(Text title)
```

## meteordevelopment.meteorclient.mixin.BookEditScreenMixin.mouseScrolled

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/BookEditScreenMixin.java:120`

```java
@Override public boolean mouseScrolled(double mouseX, double mouseY, double horizontalAmount, double verticalAmount)
```

## meteordevelopment.meteorclient.mixin.BookScreenMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/BookScreenMixin.java:39`

```java
@Mixin(BookScreen.class) public abstract class BookScreenMixin extends Screen
```

## meteordevelopment.meteorclient.mixin.BookScreenMixin.goToNextPage

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/BookScreenMixin.java:47`

```java
@Shadow protected abstract void goToNextPage()
```

## meteordevelopment.meteorclient.mixin.BookScreenMixin.goToPreviousPage

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/BookScreenMixin.java:50`

```java
@Shadow protected abstract void goToPreviousPage()
```

## meteordevelopment.meteorclient.mixin.BookScreenMixin.BookScreenMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/BookScreenMixin.java:53`

```java
public BookScreenMixin(Text title)
```

## meteordevelopment.meteorclient.mixin.BookScreenMixin.mouseScrolled

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/BookScreenMixin.java:116`

```java
@Override public boolean mouseScrolled(double mouseX, double mouseY, double horizontalAmount, double verticalAmount)
```

## meteordevelopment.meteorclient.mixin.BossBarHudMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/BossBarHudMixin.java:26`

```java
@Mixin(BossBarHud.class) public abstract class BossBarHudMixin
```

## meteordevelopment.meteorclient.mixin.BossBarHudMixin.modifyBossBarIterator

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/BossBarHudMixin.java:33`

```java
@ModifyExpressionValue(method = "render", at = @At(value = "INVOKE", target = "Ljava/util/Collection;iterator()Ljava/util/Iterator;")) public Iterator<ClientBossBar> modifyBossBarIterator(Iterator<ClientBossBar> original)
```

## meteordevelopment.meteorclient.mixin.BossBarHudMixin.modifyBossBarName

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/BossBarHudMixin.java:39`

```java
@ModifyExpressionValue(method = "render", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/gui/hud/ClientBossBar;getName()Lnet/minecraft/text/Text;")) public Text modifyBossBarName(Text original, @Local ClientBossBar clientBossBar)
```

## meteordevelopment.meteorclient.mixin.BossBarHudMixin.modifySpacingConstant

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/BossBarHudMixin.java:45`

```java
@ModifyConstant(method = "render", constant = @Constant(intValue = 9, ordinal = 1)) public int modifySpacingConstant(int j)
```

## meteordevelopment.meteorclient.mixin.BoxMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/BoxMixin.java:15`

```java
@Mixin(Box.class) public abstract class BoxMixin implements IBox
```

## meteordevelopment.meteorclient.mixin.BoxMixin.minX

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/BoxMixin.java:17`

```java
@Shadow @Final @Mutable public double minX
```

## meteordevelopment.meteorclient.mixin.BoxMixin.minY

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/BoxMixin.java:18`

```java
@Shadow @Final @Mutable public double minY
```

## meteordevelopment.meteorclient.mixin.BoxMixin.minZ

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/BoxMixin.java:19`

```java
@Shadow @Final @Mutable public double minZ
```

## meteordevelopment.meteorclient.mixin.BoxMixin.maxX

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/BoxMixin.java:21`

```java
@Shadow @Final @Mutable public double maxX
```

## meteordevelopment.meteorclient.mixin.BoxMixin.maxY

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/BoxMixin.java:22`

```java
@Shadow @Final @Mutable public double maxY
```

## meteordevelopment.meteorclient.mixin.BoxMixin.maxZ

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/BoxMixin.java:23`

```java
@Shadow @Final @Mutable public double maxZ
```

## meteordevelopment.meteorclient.mixin.BoxMixin.meteor$expand

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/BoxMixin.java:25`

```java
@Override public void meteor$expand(double v)
```

## meteordevelopment.meteorclient.mixin.BoxMixin.meteor$set

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/BoxMixin.java:35`

```java
@Override public void meteor$set(double x1, double y1, double z1, double x2, double y2, double z2)
```

## meteordevelopment.meteorclient.mixin.BrewingStandScreenMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/BrewingStandScreenMixin.java:17`

```java
@Mixin(BrewingStandScreen.class) public abstract class BrewingStandScreenMixin extends HandledScreen<BrewingStandScreenHandler>
```

## meteordevelopment.meteorclient.mixin.BrewingStandScreenMixin.BrewingStandScreenMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/BrewingStandScreenMixin.java:19`

```java
public BrewingStandScreenMixin(BrewingStandScreenHandler container, PlayerInventory playerInventory, Text name)
```

## meteordevelopment.meteorclient.mixin.BrewingStandScreenMixin.handledScreenTick

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/BrewingStandScreenMixin.java:23`

```java
@Override public void handledScreenTick()
```

## meteordevelopment.meteorclient.mixin.BrewingStandScreenMixin.close

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/BrewingStandScreenMixin.java:30`

```java
@Override public void close()
```

## meteordevelopment.meteorclient.mixin.BrightnessGetterMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/BrightnessGetterMixin.java:16`

```java
@Mixin(WorldRenderer.BrightnessGetter.class) public interface BrightnessGetterMixin
```

## meteordevelopment.meteorclient.mixin.BundleItemMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/BundleItemMixin.java:20`

```java
@Mixin(BundleItem.class) public class BundleItemMixin
```

## meteordevelopment.meteorclient.mixin.BundleTooltipSubmenuHandlerMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/BundleTooltipSubmenuHandlerMixin.java:18`

```java
@Mixin(BundleTooltipSubmenuHandler.class) public class BundleTooltipSubmenuHandlerMixin
```

## meteordevelopment.meteorclient.mixin.CameraMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/CameraMixin.java:31`

```java
@Mixin(Camera.class) public abstract class CameraMixin implements ICamera
```

## meteordevelopment.meteorclient.mixin.CameraMixin.setRotation

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/CameraMixin.java:38`

```java
@Shadow protected abstract void setRotation(float yaw, float pitch)
```

## meteordevelopment.meteorclient.mixin.CameraMixin.meteor$setRot

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/CameraMixin.java:97`

```java
@Override public void meteor$setRot(double yaw, double pitch)
```

## meteordevelopment.meteorclient.mixin.CapabilityTrackerMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/CapabilityTrackerMixin.java:13`

```java
@Mixin(GlStateManager.CapabilityTracker.class) public abstract class CapabilityTrackerMixin implements ICapabilityTracker
```

## meteordevelopment.meteorclient.mixin.CapabilityTrackerMixin.setState

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/CapabilityTrackerMixin.java:18`

```java
@Shadow public abstract void setState(boolean state)
```

## meteordevelopment.meteorclient.mixin.CapabilityTrackerMixin.meteor$get

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/CapabilityTrackerMixin.java:21`

```java
@Override public boolean meteor$get()
```

## meteordevelopment.meteorclient.mixin.CapabilityTrackerMixin.meteor$set

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/CapabilityTrackerMixin.java:26`

```java
@Override public void meteor$set(boolean state)
```

## meteordevelopment.meteorclient.mixin.CapeFeatureRendererMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/CapeFeatureRendererMixin.java:21`

```java
@Mixin(CapeFeatureRenderer.class) public abstract class CapeFeatureRendererMixin
```

## meteordevelopment.meteorclient.mixin.ChatHudAccessor

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/ChatHudAccessor.java:15`

```java
@Mixin(ChatHud.class) public interface ChatHudAccessor
```

## meteordevelopment.meteorclient.mixin.ChatHudAccessor.meteor$getVisibleMessages

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/ChatHudAccessor.java:17`

```java
@Accessor("visibleMessages") List<ChatHudLine.Visible> meteor$getVisibleMessages()
```

## meteordevelopment.meteorclient.mixin.ChatHudAccessor.meteor$getMessages

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/ChatHudAccessor.java:20`

```java
@Accessor("messages") List<ChatHudLine> meteor$getMessages()
```

## meteordevelopment.meteorclient.mixin.ChatHudInteractableMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/ChatHudInteractableMixin.java:25`

```java
@Mixin(targets = "net.minecraft.client.gui.hud.ChatHud$Interactable", remap = false) public class ChatHudInteractableMixin
```

## meteordevelopment.meteorclient.mixin.ChatHudLineConsumerMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/ChatHudLineConsumerMixin.java:19`

```java
@Mixin(targets = "net.minecraft.client.gui.hud.ChatHud$1", remap = false) public class ChatHudLineConsumerMixin
```

## meteordevelopment.meteorclient.mixin.ChatHudLineMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/ChatHudLineMixin.java:17`

```java
@Mixin(value = ChatHudLine.class) public abstract class ChatHudLineMixin implements IChatHudLine
```

## meteordevelopment.meteorclient.mixin.ChatHudLineMixin.meteor$getText

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/ChatHudLineMixin.java:23`

```java
@Override public String meteor$getText()
```

## meteordevelopment.meteorclient.mixin.ChatHudLineMixin.meteor$getId

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/ChatHudLineMixin.java:28`

```java
@Override public int meteor$getId()
```

## meteordevelopment.meteorclient.mixin.ChatHudLineMixin.meteor$setId

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/ChatHudLineMixin.java:33`

```java
@Override public void meteor$setId(int id)
```

## meteordevelopment.meteorclient.mixin.ChatHudLineMixin.meteor$getSender

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/ChatHudLineMixin.java:38`

```java
@Override public GameProfile meteor$getSender()
```

## meteordevelopment.meteorclient.mixin.ChatHudLineMixin.meteor$setSender

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/ChatHudLineMixin.java:43`

```java
@Override public void meteor$setSender(GameProfile profile)
```

## meteordevelopment.meteorclient.mixin.ChatHudLineVisibleMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/ChatHudLineVisibleMixin.java:17`

```java
@Mixin(ChatHudLine.Visible.class) public abstract class ChatHudLineVisibleMixin implements IChatHudLineVisible
```

## meteordevelopment.meteorclient.mixin.ChatHudLineVisibleMixin.meteor$getText

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/ChatHudLineVisibleMixin.java:24`

```java
@Override public String meteor$getText()
```

## meteordevelopment.meteorclient.mixin.ChatHudLineVisibleMixin.meteor$getId

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/ChatHudLineVisibleMixin.java:36`

```java
@Override public int meteor$getId()
```

## meteordevelopment.meteorclient.mixin.ChatHudLineVisibleMixin.meteor$setId

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/ChatHudLineVisibleMixin.java:41`

```java
@Override public void meteor$setId(int id)
```

## meteordevelopment.meteorclient.mixin.ChatHudLineVisibleMixin.meteor$getSender

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/ChatHudLineVisibleMixin.java:46`

```java
@Override public GameProfile meteor$getSender()
```

## meteordevelopment.meteorclient.mixin.ChatHudLineVisibleMixin.meteor$setSender

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/ChatHudLineVisibleMixin.java:51`

```java
@Override public void meteor$setSender(GameProfile profile)
```

## meteordevelopment.meteorclient.mixin.ChatHudLineVisibleMixin.meteor$isStartOfEntry

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/ChatHudLineVisibleMixin.java:56`

```java
@Override public boolean meteor$isStartOfEntry()
```

## meteordevelopment.meteorclient.mixin.ChatHudLineVisibleMixin.meteor$setStartOfEntry

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/ChatHudLineVisibleMixin.java:61`

```java
@Override public void meteor$setStartOfEntry(boolean start)
```

## meteordevelopment.meteorclient.mixin.ChatHudMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/ChatHudMixin.java:36`

```java
@Mixin(ChatHud.class) public abstract class ChatHudMixin implements IChatHud
```

## meteordevelopment.meteorclient.mixin.ChatHudMixin.addMessage

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/ChatHudMixin.java:53`

```java
@Shadow public abstract void addMessage(Text message)
```

## meteordevelopment.meteorclient.mixin.ChatHudMixin.meteor$add

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/ChatHudMixin.java:56`

```java
@Override public void meteor$add(Text message, int id)
```

## meteordevelopment.meteorclient.mixin.ChatHudUnfocusedMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/ChatHudUnfocusedMixin.java:26`

```java
@Mixin(targets = "net.minecraft.client.gui.hud.ChatHud$Hud", remap = false) public class ChatHudUnfocusedMixin
```

## meteordevelopment.meteorclient.mixin.ChatInputSuggestorMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/ChatInputSuggestorMixin.java:28`

```java
@Mixin(ChatInputSuggestor.class) public abstract class ChatInputSuggestorMixin
```

## meteordevelopment.meteorclient.mixin.ChatInputSuggestorMixin.showCommandSuggestions

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/ChatInputSuggestorMixin.java:36`

```java
@Shadow protected abstract void showCommandSuggestions()
```

## meteordevelopment.meteorclient.mixin.ChatInputSuggestorMixin.onRefresh

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/ChatInputSuggestorMixin.java:39`

```java
@Inject(method = "refresh", at = @At(value = "INVOKE", target = "Lcom/mojang/brigadier/StringReader;canRead()Z", remap = false), cancellable = true ) public void onRefresh(CallbackInfo ci, @Local StringReader reader)
```

## meteordevelopment.meteorclient.mixin.ChatScreenMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/ChatScreenMixin.java:18`

```java
@Mixin(value = ChatScreen.class, priority = 1001) public abstract class ChatScreenMixin
```

## meteordevelopment.meteorclient.mixin.ChatScreenMixin.chatField

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/ChatScreenMixin.java:20`

```java
@Shadow protected TextFieldWidget chatField
```

## meteordevelopment.meteorclient.mixin.ChunkAccessor

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/ChunkAccessor.java:16`

```java
@Mixin(Chunk.class) public interface ChunkAccessor
```

## meteordevelopment.meteorclient.mixin.ChunkAccessor.getBlockEntities

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/ChunkAccessor.java:18`

```java
@Accessor("blockEntities") Map<BlockPos, BlockEntity> getBlockEntities()
```

## meteordevelopment.meteorclient.mixin.ChunkBorderDebugRendererMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/ChunkBorderDebugRendererMixin.java:20`

```java
@Mixin(ChunkBorderDebugRenderer.class) public abstract class ChunkBorderDebugRendererMixin
```

## meteordevelopment.meteorclient.mixin.ChunkOcclusionDataBuilderMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/ChunkOcclusionDataBuilderMixin.java:17`

```java
@Mixin(ChunkOcclusionDataBuilder.class) public abstract class ChunkOcclusionDataBuilderMixin
```

## meteordevelopment.meteorclient.mixin.ClientChunkManagerAccessor

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/ClientChunkManagerAccessor.java:12`

```java
@Mixin(ClientChunkManager.class) public interface ClientChunkManagerAccessor
```

## meteordevelopment.meteorclient.mixin.ClientChunkManagerAccessor.meteor$getChunks

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/ClientChunkManagerAccessor.java:14`

```java
@Accessor("chunks") ClientChunkManager.ClientChunkMap meteor$getChunks()
```

## meteordevelopment.meteorclient.mixin.ClientChunkMapAccessor

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/ClientChunkMapAccessor.java:15`

```java
@Mixin(ClientChunkManager.ClientChunkMap.class) public interface ClientChunkMapAccessor
```

## meteordevelopment.meteorclient.mixin.ClientChunkMapAccessor.meteor$getChunks

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/ClientChunkMapAccessor.java:17`

```java
@Accessor("chunks") AtomicReferenceArray<WorldChunk> meteor$getChunks()
```

## meteordevelopment.meteorclient.mixin.ClientConnectionAccessor

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/ClientConnectionAccessor.java:13`

```java
@Mixin(ClientConnection.class) public interface ClientConnectionAccessor
```

## meteordevelopment.meteorclient.mixin.ClientConnectionAccessor.meteor$getChannel

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/ClientConnectionAccessor.java:15`

```java
@Accessor("channel") Channel meteor$getChannel()
```

## meteordevelopment.meteorclient.mixin.ClientConnectionMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/ClientConnectionMixin.java:44`

```java
@Mixin(ClientConnection.class) public abstract class ClientConnectionMixin
```

## meteordevelopment.meteorclient.mixin.ClientPlayNetworkHandlerAccessor

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/ClientPlayNetworkHandlerAccessor.java:18`

```java
@Mixin(ClientPlayNetworkHandler.class) public interface ClientPlayNetworkHandlerAccessor
```

## meteordevelopment.meteorclient.mixin.ClientPlayNetworkHandlerAccessor.meteor$getChunkLoadDistance

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/ClientPlayNetworkHandlerAccessor.java:20`

```java
@Accessor("chunkLoadDistance") int meteor$getChunkLoadDistance()
```

## meteordevelopment.meteorclient.mixin.ClientPlayNetworkHandlerAccessor.meteor$getMessagePacker

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/ClientPlayNetworkHandlerAccessor.java:23`

```java
@Accessor("messagePacker") MessageChain.Packer meteor$getMessagePacker()
```

## meteordevelopment.meteorclient.mixin.ClientPlayNetworkHandlerAccessor.meteor$getLastSeenMessagesCollector

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/ClientPlayNetworkHandlerAccessor.java:26`

```java
@Accessor("lastSeenMessagesCollector") LastSeenMessagesCollector meteor$getLastSeenMessagesCollector()
```

## meteordevelopment.meteorclient.mixin.ClientPlayNetworkHandlerAccessor.meteor$getCombinedDynamicRegistries

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/ClientPlayNetworkHandlerAccessor.java:29`

```java
@Accessor("combinedDynamicRegistries") DynamicRegistryManager.Immutable meteor$getCombinedDynamicRegistries()
```

## meteordevelopment.meteorclient.mixin.ClientPlayNetworkHandlerAccessor.meteor$getEnabledFeatures

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/ClientPlayNetworkHandlerAccessor.java:32`

```java
@Accessor("enabledFeatures") FeatureSet meteor$getEnabledFeatures()
```

## meteordevelopment.meteorclient.mixin.ClientPlayNetworkHandlerAccessor.meteor$getCommandNodeFactory

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/ClientPlayNetworkHandlerAccessor.java:35`

```java
@Accessor("COMMAND_NODE_FACTORY") static CommandTreeS2CPacket.NodeFactory<ClientCommandSource> meteor$getCommandNodeFactory()
```

## meteordevelopment.meteorclient.mixin.ClientPlayNetworkHandlerMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/ClientPlayNetworkHandlerMixin.java:51`

```java
@Mixin(ClientPlayNetworkHandler.class) public abstract class ClientPlayNetworkHandlerMixin extends ClientCommonNetworkHandler
```

## meteordevelopment.meteorclient.mixin.ClientPlayNetworkHandlerMixin.ClientPlayNetworkHandlerMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/ClientPlayNetworkHandlerMixin.java:56`

```java
protected ClientPlayNetworkHandlerMixin(MinecraftClient client, ClientConnection connection, ClientConnectionState connectionState)
```

## meteordevelopment.meteorclient.mixin.ClientPlayerEntityAccessor

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/ClientPlayerEntityAccessor.java:12`

```java
@Mixin(ClientPlayerEntity.class) public interface ClientPlayerEntityAccessor
```

## meteordevelopment.meteorclient.mixin.ClientPlayerEntityAccessor.meteor$setTicksSinceLastPositionPacketSent

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/ClientPlayerEntityAccessor.java:14`

```java
@Accessor("ticksSinceLastPositionPacketSent") void meteor$setTicksSinceLastPositionPacketSent(int ticks)
```

## meteordevelopment.meteorclient.mixin.ClientPlayerEntityMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/ClientPlayerEntityMixin.java:41`

```java
@Mixin(ClientPlayerEntity.class) public abstract class ClientPlayerEntityMixin extends AbstractClientPlayerEntity
```

## meteordevelopment.meteorclient.mixin.ClientPlayerEntityMixin.input

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/ClientPlayerEntityMixin.java:43`

```java
@Shadow public Input input
```

## meteordevelopment.meteorclient.mixin.ClientPlayerEntityMixin.ClientPlayerEntityMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/ClientPlayerEntityMixin.java:46`

```java
public ClientPlayerEntityMixin(ClientWorld world, GameProfile profile)
```

## meteordevelopment.meteorclient.mixin.ClientPlayerInteractionManagerAccessor

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/ClientPlayerInteractionManagerAccessor.java:13`

```java
@Mixin(ClientPlayerInteractionManager.class) public interface ClientPlayerInteractionManagerAccessor
```

## meteordevelopment.meteorclient.mixin.ClientPlayerInteractionManagerAccessor.meteor$getBreakingProgress

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/ClientPlayerInteractionManagerAccessor.java:15`

```java
@Accessor("currentBreakingProgress") float meteor$getBreakingProgress()
```

## meteordevelopment.meteorclient.mixin.ClientPlayerInteractionManagerAccessor.meteor$setCurrentBreakingProgress

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/ClientPlayerInteractionManagerAccessor.java:18`

```java
@Accessor("currentBreakingProgress") void meteor$setCurrentBreakingProgress(float progress)
```

## meteordevelopment.meteorclient.mixin.ClientPlayerInteractionManagerAccessor.meteor$getCurrentBreakingBlockPos

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/ClientPlayerInteractionManagerAccessor.java:21`

```java
@Accessor("currentBreakingPos") BlockPos meteor$getCurrentBreakingBlockPos()
```

## meteordevelopment.meteorclient.mixin.ClientPlayerInteractionManagerMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/ClientPlayerInteractionManagerMixin.java:43`

```java
@Mixin(ClientPlayerInteractionManager.class) public abstract class ClientPlayerInteractionManagerMixin implements IClientPlayerInteractionManager
```

## meteordevelopment.meteorclient.mixin.ClientPlayerInteractionManagerMixin.syncSelectedSlot

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/ClientPlayerInteractionManagerMixin.java:47`

```java
@Shadow protected abstract void syncSelectedSlot()
```

## meteordevelopment.meteorclient.mixin.ClientPlayerInteractionManagerMixin.breakBlock

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/ClientPlayerInteractionManagerMixin.java:49`

```java
@Shadow public abstract boolean breakBlock(BlockPos pos)
```

## meteordevelopment.meteorclient.mixin.ClientPlayerInteractionManagerMixin.sendSequencedPacket

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/ClientPlayerInteractionManagerMixin.java:52`

```java
@Shadow public abstract void sendSequencedPacket(ClientWorld world, SequencedPacketCreator packetCreator)
```

## meteordevelopment.meteorclient.mixin.ClientPlayerInteractionManagerMixin.interactBlock

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/ClientPlayerInteractionManagerMixin.java:84`

```java
@Inject(method = "interactBlock", at = @At("HEAD"), cancellable = true) public void interactBlock(ClientPlayerEntity player, Hand hand, BlockHitResult hitResult, CallbackInfoReturnable<ActionResult> cir)
```

## meteordevelopment.meteorclient.mixin.ClientPlayerInteractionManagerMixin.meteor$syncSelected

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/ClientPlayerInteractionManagerMixin.java:148`

```java
@Override public void meteor$syncSelected()
```

## meteordevelopment.meteorclient.mixin.ClientWorldMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/ClientWorldMixin.java:28`

```java
@Mixin(ClientWorld.class) public abstract class ClientWorldMixin
```

## meteordevelopment.meteorclient.mixin.ClientWorldMixin.getEntityById

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/ClientWorldMixin.java:30`

```java
@Shadow @Nullable public abstract Entity getEntityById(int id)
```

## meteordevelopment.meteorclient.mixin.CobwebBlockMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/CobwebBlockMixin.java:21`

```java
@Mixin(CobwebBlock.class) public abstract class CobwebBlockMixin
```

## meteordevelopment.meteorclient.mixin.CompassStateMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/CompassStateMixin.java:22`

```java
@Mixin(CompassState.class) public abstract class CompassStateMixin
```

## meteordevelopment.meteorclient.mixin.ConnectScreenMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/ConnectScreenMixin.java:20`

```java
@Mixin(ConnectScreen.class) public abstract class ConnectScreenMixin
```

## meteordevelopment.meteorclient.mixin.ContainerComponentAccessor

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/ContainerComponentAccessor.java:14`

```java
@Mixin(ContainerComponent.class) public interface ContainerComponentAccessor
```

## meteordevelopment.meteorclient.mixin.ContainerComponentAccessor.meteor$getStacks

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/ContainerComponentAccessor.java:16`

```java
@Accessor("stacks") DefaultedList<ItemStack> meteor$getStacks()
```

## meteordevelopment.meteorclient.mixin.ContainerComponentMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/ContainerComponentMixin.java:26`

```java
@Mixin(ContainerComponent.class) public abstract class ContainerComponentMixin
```

## meteordevelopment.meteorclient.mixin.CrashReportMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/CrashReportMixin.java:23`

```java
@Mixin(CrashReport.class) public abstract class CrashReportMixin
```

## meteordevelopment.meteorclient.mixin.CreativeInventoryScreenAccessor

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/CreativeInventoryScreenAccessor.java:13`

```java
@Mixin(CreativeInventoryScreen.class) public interface CreativeInventoryScreenAccessor
```

## meteordevelopment.meteorclient.mixin.CreativeInventoryScreenAccessor.meteor$getSelectedTab

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/CreativeInventoryScreenAccessor.java:15`

```java
@Accessor("selectedTab") static ItemGroup meteor$getSelectedTab()
```

## meteordevelopment.meteorclient.mixin.CreativeSlotMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/CreativeSlotMixin.java:14`

```java
@Mixin(targets = "net.minecraft.client.gui.screen.ingame.CreativeInventoryScreen$CreativeSlot") public abstract class CreativeSlotMixin implements ISlot
```

## meteordevelopment.meteorclient.mixin.CreativeSlotMixin.meteor$getId

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/CreativeSlotMixin.java:18`

```java
@Override public int meteor$getId()
```

## meteordevelopment.meteorclient.mixin.CreativeSlotMixin.meteor$getIndex

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/CreativeSlotMixin.java:23`

```java
@Override public int meteor$getIndex()
```

## meteordevelopment.meteorclient.mixin.CrossbowItemAccessor

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/CrossbowItemAccessor.java:13`

```java
@Mixin(CrossbowItem.class) public interface CrossbowItemAccessor
```

## meteordevelopment.meteorclient.mixin.CrossbowItemAccessor.meteor$getSpeed

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/CrossbowItemAccessor.java:15`

```java
@Invoker("getSpeed") static float meteor$getSpeed(ChargedProjectilesComponent itemStack)
```

## meteordevelopment.meteorclient.mixin.DirectionAccessor

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/DirectionAccessor.java:12`

```java
@Mixin(Direction.class) public interface DirectionAccessor
```

## meteordevelopment.meteorclient.mixin.DirectionAccessor.meteor$getHorizontal

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/DirectionAccessor.java:14`

```java
@Accessor("HORIZONTAL") static Direction[] meteor$getHorizontal()
```

## meteordevelopment.meteorclient.mixin.DisconnectedScreenMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/DisconnectedScreenMixin.java:27`

```java
@Mixin(DisconnectedScreen.class) public abstract class DisconnectedScreenMixin extends Screen
```

## meteordevelopment.meteorclient.mixin.DisconnectedScreenMixin.DisconnectedScreenMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/DisconnectedScreenMixin.java:35`

```java
protected DisconnectedScreenMixin(Text title)
```

## meteordevelopment.meteorclient.mixin.DisconnectedScreenMixin.tick

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/DisconnectedScreenMixin.java:57`

```java
@Override public void tick()
```

## meteordevelopment.meteorclient.mixin.DownloaderMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/DownloaderMixin.java:30`

```java
@Mixin(Downloader.class) public class DownloaderMixin
```

## meteordevelopment.meteorclient.mixin.DrawContextAccessor

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/DrawContextAccessor.java:13`

```java
@Mixin(DrawContext.class) public interface DrawContextAccessor
```

## meteordevelopment.meteorclient.mixin.DrawContextAccessor.getState

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/DrawContextAccessor.java:15`

```java
@Accessor("state") GuiRenderState getState()
```

## meteordevelopment.meteorclient.mixin.DrawContextAccessor.getScissorStack

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/DrawContextAccessor.java:18`

```java
@Accessor("scissorStack") DrawContext.ScissorStack getScissorStack()
```

## meteordevelopment.meteorclient.mixin.DrawContextMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/DrawContextMixin.java:27`

```java
@Mixin(value = DrawContext.class) public abstract class DrawContextMixin
```

## meteordevelopment.meteorclient.mixin.ElytraFeatureRendererMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/ElytraFeatureRendererMixin.java:23`

```java
@Mixin(ElytraFeatureRenderer.class) public abstract class ElytraFeatureRendererMixin<S extends BipedEntityRenderState, M extends EntityModel<S>> extends FeatureRenderer<S, M>
```

## meteordevelopment.meteorclient.mixin.ElytraFeatureRendererMixin.ElytraFeatureRendererMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/ElytraFeatureRendererMixin.java:25`

```java
public ElytraFeatureRendererMixin(FeatureRendererContext<S, M> context)
```

## meteordevelopment.meteorclient.mixin.EnchantingTableBlockEntityRendererMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/EnchantingTableBlockEntityRendererMixin.java:21`

```java
@Mixin(EnchantingTableBlockEntityRenderer.class) public abstract class EnchantingTableBlockEntityRendererMixin
```

## meteordevelopment.meteorclient.mixin.EndCrystalEntityModelMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/EndCrystalEntityModelMixin.java:17`

```java
@Mixin(EndCrystalEntityModel.class) public abstract class EndCrystalEntityModelMixin
```

## meteordevelopment.meteorclient.mixin.EndCrystalEntityRendererMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/EndCrystalEntityRendererMixin.java:26`

```java
@Mixin(EndCrystalEntityRenderer.class) public abstract class EndCrystalEntityRendererMixin
```

## meteordevelopment.meteorclient.mixin.EntityAccessor

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/EntityAccessor.java:12`

```java
@Mixin(Entity.class) public interface EntityAccessor
```

## meteordevelopment.meteorclient.mixin.EntityAccessor.meteor$setInWater

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/EntityAccessor.java:14`

```java
@Accessor("touchingWater") void meteor$setInWater(boolean touchingWater)
```

## meteordevelopment.meteorclient.mixin.EntityBucketItemAccessor

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/EntityBucketItemAccessor.java:13`

```java
@Mixin(EntityBucketItem.class) public interface EntityBucketItemAccessor
```

## meteordevelopment.meteorclient.mixin.EntityBucketItemAccessor.meteor$getEntityType

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/EntityBucketItemAccessor.java:15`

```java
@Accessor("entityType") EntityType<?> meteor$getEntityType()
```

## meteordevelopment.meteorclient.mixin.EntityHitboxDebugRendererMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/EntityHitboxDebugRendererMixin.java:17`

```java
@Mixin(EntityHitboxDebugRenderer.class) public class EntityHitboxDebugRendererMixin
```

## meteordevelopment.meteorclient.mixin.EntityMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/EntityMixin.java:44`

```java
@Mixin(Entity.class) public abstract class EntityMixin
```

## meteordevelopment.meteorclient.mixin.EntityRenderManagerMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/EntityRenderManagerMixin.java:25`

```java
@Mixin(EntityRenderManager.class) public abstract class EntityRenderManagerMixin
```

## meteordevelopment.meteorclient.mixin.EntityRenderManagerMixin.camera

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/EntityRenderManagerMixin.java:27`

```java
@Shadow public Camera camera
```

## meteordevelopment.meteorclient.mixin.EntityRenderStateMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/EntityRenderStateMixin.java:15`

```java
@Mixin(EntityRenderState.class) public abstract class EntityRenderStateMixin implements IEntityRenderState
```

## meteordevelopment.meteorclient.mixin.EntityRenderStateMixin.meteor$getEntity

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/EntityRenderStateMixin.java:20`

```java
@Override @Nullable(value = "EntityCulling mod can prevent the code that sets the entity from running") public Entity meteor$getEntity()
```

## meteordevelopment.meteorclient.mixin.EntityRenderStateMixin.meteor$setEntity

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/EntityRenderStateMixin.java:26`

```java
@Override public void meteor$setEntity(Entity entity)
```

## meteordevelopment.meteorclient.mixin.EntityRendererMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/EntityRendererMixin.java:36`

```java
@Mixin(EntityRenderer.class) public abstract class EntityRendererMixin<T extends Entity, S extends EntityRenderState>
```

## meteordevelopment.meteorclient.mixin.EntityTrackingSectionAccessor

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/EntityTrackingSectionAccessor.java:13`

```java
@Mixin(EntityTrackingSection.class) public interface EntityTrackingSectionAccessor
```

## meteordevelopment.meteorclient.mixin.EntityTrackingSectionAccessor.meteor$getCollection

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/EntityTrackingSectionAccessor.java:15`

```java
@Accessor("collection") <T> TypeFilterableList<T> meteor$getCollection()
```

## meteordevelopment.meteorclient.mixin.EntityVelocityUpdateS2CPacketAccessor

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/EntityVelocityUpdateS2CPacketAccessor.java:14`

```java
@Mixin(EntityVelocityUpdateS2CPacket.class) public interface EntityVelocityUpdateS2CPacketAccessor
```

## meteordevelopment.meteorclient.mixin.EntityVelocityUpdateS2CPacketAccessor.meteor$setVelocity

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/EntityVelocityUpdateS2CPacketAccessor.java:16`

```java
@Mutable @Accessor("velocity") void meteor$setVelocity(Vec3d velocity)
```

## meteordevelopment.meteorclient.mixin.ExplosionS2CPacketMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/ExplosionS2CPacketMixin.java:18`

```java
@Mixin(ExplosionS2CPacket.class) public abstract class ExplosionS2CPacketMixin implements IExplosionS2CPacket
```

## meteordevelopment.meteorclient.mixin.ExplosionS2CPacketMixin.meteor$setVelocityX

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/ExplosionS2CPacketMixin.java:25`

```java
@Override public void meteor$setVelocityX(float velocity)
```

## meteordevelopment.meteorclient.mixin.ExplosionS2CPacketMixin.meteor$setVelocityY

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/ExplosionS2CPacketMixin.java:35`

```java
@Override public void meteor$setVelocityY(float velocity)
```

## meteordevelopment.meteorclient.mixin.ExplosionS2CPacketMixin.meteor$setVelocityZ

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/ExplosionS2CPacketMixin.java:45`

```java
@Override public void meteor$setVelocityZ(float velocity)
```

## meteordevelopment.meteorclient.mixin.FileCacheAccessor

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/FileCacheAccessor.java:14`

```java
@Mixin(PlayerSkinProvider.FileCache.class) public interface FileCacheAccessor
```

## meteordevelopment.meteorclient.mixin.FileCacheAccessor.meteor$getDirectory

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/FileCacheAccessor.java:16`

```java
@Accessor("directory") Path meteor$getDirectory()
```

## meteordevelopment.meteorclient.mixin.FireworkRocketEntityMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/FireworkRocketEntityMixin.java:19`

```java
@Mixin(FireworkRocketEntity.class) public abstract class FireworkRocketEntityMixin
```

## meteordevelopment.meteorclient.mixin.FireworksSparkParticleMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/FireworksSparkParticleMixin.java:16`

```java
@Mixin(FireworksSparkParticle.FireworkParticle.class) public abstract class FireworksSparkParticleMixin
```

## meteordevelopment.meteorclient.mixin.FireworksSparkParticleSubMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/FireworksSparkParticleSubMixin.java:18`

```java
@Mixin(value = {FireworksSparkParticle.Explosion.class, FireworksSparkParticle.Flash.class}) public abstract class FireworksSparkParticleSubMixin
```

## meteordevelopment.meteorclient.mixin.FishingBobberEntityAccessor

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/FishingBobberEntityAccessor.java:12`

```java
@Mixin(FishingBobberEntity.class) public interface FishingBobberEntityAccessor
```

## meteordevelopment.meteorclient.mixin.FishingBobberEntityAccessor.meteor$hasCaughtFish

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/FishingBobberEntityAccessor.java:14`

```java
@Accessor("caughtFish") boolean meteor$hasCaughtFish()
```

## meteordevelopment.meteorclient.mixin.FishingBobberEntityMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/FishingBobberEntityMixin.java:19`

```java
@Mixin(FishingBobberEntity.class) public abstract class FishingBobberEntityMixin
```

## meteordevelopment.meteorclient.mixin.FluidRendererMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/FluidRendererMixin.java:25`

```java
@Mixin(FluidRenderer.class) public abstract class FluidRendererMixin
```

## meteordevelopment.meteorclient.mixin.FogRendererMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/FogRendererMixin.java:18`

```java
@Mixin(FogRenderer.class) public abstract class FogRendererMixin
```

## meteordevelopment.meteorclient.mixin.GameOptionsMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/GameOptionsMixin.java:28`

```java
@Mixin(GameOptions.class) public abstract class GameOptionsMixin
```

## meteordevelopment.meteorclient.mixin.GameOptionsMixin.allKeys

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/GameOptionsMixin.java:30`

```java
@Shadow @Final @Mutable public KeyBinding[] allKeys
```

## meteordevelopment.meteorclient.mixin.GameRendererMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/GameRendererMixin.java:59`

```java
@Mixin(GameRenderer.class) public abstract class GameRendererMixin implements IGameRenderer
```

## meteordevelopment.meteorclient.mixin.GameRendererMixin.updateCrosshairTarget

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/GameRendererMixin.java:65`

```java
@Shadow public abstract void updateCrosshairTarget(float tickDelta)
```

## meteordevelopment.meteorclient.mixin.GameRendererMixin.reset

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/GameRendererMixin.java:68`

```java
@Shadow public abstract void reset()
```

## meteordevelopment.meteorclient.mixin.GameRendererMixin.bobView

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/GameRendererMixin.java:84`

```java
@Shadow protected abstract void bobView(MatrixStack matrices, float tickDelta)
```

## meteordevelopment.meteorclient.mixin.GameRendererMixin.tiltViewWhenHurt

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/GameRendererMixin.java:87`

```java
@Shadow protected abstract void tiltViewWhenHurt(MatrixStack matrices, float tickDelta)
```

## meteordevelopment.meteorclient.mixin.GameRendererMixin.meteor$flushGuiState

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/GameRendererMixin.java:259`

```java
@Override public void meteor$flushGuiState()
```

## meteordevelopment.meteorclient.mixin.GlBackendMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/GlBackendMixin.java:14`

```java
@Mixin(GlBackend.class) public abstract class GlBackendMixin implements IGpuDevice
```

## meteordevelopment.meteorclient.mixin.GlBackendMixin.meteor$pushScissor

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/GlBackendMixin.java:22`

```java
@Override public void meteor$pushScissor(int x, int y, int width, int height)
```

## meteordevelopment.meteorclient.mixin.GlBackendMixin.meteor$popScissor

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/GlBackendMixin.java:35`

```java
@Override public void meteor$popScissor()
```

## meteordevelopment.meteorclient.mixin.GlBackendMixin.meteor$onCreateRenderPass

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/GlBackendMixin.java:43`

```java
@Deprecated @Override public void meteor$onCreateRenderPass(RenderPass pass)
```

## meteordevelopment.meteorclient.mixin.GlCommandEncoderMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/GlCommandEncoderMixin.java:24`

```java
@Mixin(GlCommandEncoder.class) public abstract class GlCommandEncoderMixin
```

## meteordevelopment.meteorclient.mixin.HandledScreenAccessor

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/HandledScreenAccessor.java:13`

```java
@Mixin(HandledScreen.class) public interface HandledScreenAccessor
```

## meteordevelopment.meteorclient.mixin.HandledScreenAccessor.meteor$getFocusedSlot

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/HandledScreenAccessor.java:15`

```java
@Accessor("focusedSlot") Slot meteor$getFocusedSlot()
```

## meteordevelopment.meteorclient.mixin.HandledScreenMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/HandledScreenMixin.java:37`

```java
@Mixin(HandledScreen.class) public abstract class HandledScreenMixin<T extends ScreenHandler> extends Screen implements ScreenHandlerProvider<T>
```

## meteordevelopment.meteorclient.mixin.HandledScreenMixin.focusedSlot

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/HandledScreenMixin.java:39`

```java
@Shadow protected Slot focusedSlot
```

## meteordevelopment.meteorclient.mixin.HandledScreenMixin.x

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/HandledScreenMixin.java:42`

```java
@Shadow protected int x
```

## meteordevelopment.meteorclient.mixin.HandledScreenMixin.y

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/HandledScreenMixin.java:44`

```java
@Shadow protected int y
```

## meteordevelopment.meteorclient.mixin.HandledScreenMixin.getSlotAt

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/HandledScreenMixin.java:47`

```java
@Shadow @Nullable protected abstract Slot getSlotAt(double xPosition, double yPosition)
```

## meteordevelopment.meteorclient.mixin.HandledScreenMixin.getScreenHandler

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/HandledScreenMixin.java:51`

```java
@Shadow public abstract T getScreenHandler()
```

## meteordevelopment.meteorclient.mixin.HandledScreenMixin.onMouseClick

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/HandledScreenMixin.java:57`

```java
@Shadow protected abstract void onMouseClick(Slot slot, int invSlot, int clickData, SlotActionType actionType)
```

## meteordevelopment.meteorclient.mixin.HandledScreenMixin.close

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/HandledScreenMixin.java:60`

```java
@Shadow public abstract void close()
```

## meteordevelopment.meteorclient.mixin.HandledScreenMixin.HandledScreenMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/HandledScreenMixin.java:63`

```java
public HandledScreenMixin(Text title)
```

## meteordevelopment.meteorclient.mixin.HeadFeatureRendererMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/HeadFeatureRendererMixin.java:22`

```java
@Mixin(HeadFeatureRenderer.class) public abstract class HeadFeatureRendererMixin<S extends LivingEntityRenderState, M extends EntityModel<S> & ModelWithHead>
```

## meteordevelopment.meteorclient.mixin.HeldItemRendererMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/HeldItemRendererMixin.java:35`

```java
@Mixin(HeldItemRenderer.class) public abstract class HeldItemRendererMixin
```

## meteordevelopment.meteorclient.mixin.HeldItemRendererMixin.shouldSkipHandAnimationOnSwap

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/HeldItemRendererMixin.java:49`

```java
@Shadow protected abstract boolean shouldSkipHandAnimationOnSwap(ItemStack from, ItemStack to)
```

## meteordevelopment.meteorclient.mixin.HungerManagerMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/HungerManagerMixin.java:15`

```java
@Mixin(HungerManager.class) public class HungerManagerMixin
```

## meteordevelopment.meteorclient.mixin.InGameHudMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/InGameHudMixin.java:33`

```java
@Mixin(InGameHud.class) public abstract class InGameHudMixin
```

## meteordevelopment.meteorclient.mixin.InGameHudMixin.clear

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/InGameHudMixin.java:35`

```java
@Shadow public abstract void clear()
```

## meteordevelopment.meteorclient.mixin.InGameOverlayRendererMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/InGameOverlayRendererMixin.java:20`

```java
@Mixin(InGameOverlayRenderer.class) public abstract class InGameOverlayRendererMixin
```

## meteordevelopment.meteorclient.mixin.ItemEntityRendererMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/ItemEntityRendererMixin.java:25`

```java
@Mixin(ItemEntityRenderer.class) public abstract class ItemEntityRendererMixin
```

## meteordevelopment.meteorclient.mixin.ItemGroupsAccessor

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/ItemGroupsAccessor.java:14`

```java
@Mixin(ItemGroups.class) public interface ItemGroupsAccessor
```

## meteordevelopment.meteorclient.mixin.ItemGroupsAccessor.meteor$getInventory

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/ItemGroupsAccessor.java:16`

```java
@Accessor("INVENTORY") static RegistryKey<ItemGroup> meteor$getInventory()
```

## meteordevelopment.meteorclient.mixin.ItemGroupsMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/ItemGroupsMixin.java:15`

```java
@Mixin(ItemGroups.class) public abstract class ItemGroupsMixin
```

## meteordevelopment.meteorclient.mixin.ItemMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/ItemMixin.java:20`

```java
@Mixin(Item.class) public abstract class ItemMixin
```

## meteordevelopment.meteorclient.mixin.ItemRenderStateAccessor

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/ItemRenderStateAccessor.java:12`

```java
@Mixin(ItemRenderState.class) public interface ItemRenderStateAccessor
```

## meteordevelopment.meteorclient.mixin.ItemRenderStateAccessor.meteor$getLayerCount

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/ItemRenderStateAccessor.java:14`

```java
@Accessor("layerCount") int meteor$getLayerCount()
```

## meteordevelopment.meteorclient.mixin.ItemRenderStateAccessor.meteor$getLayers

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/ItemRenderStateAccessor.java:17`

```java
@Accessor("layers") ItemRenderState.LayerRenderState[] meteor$getLayers()
```

## meteordevelopment.meteorclient.mixin.ItemRendererMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/ItemRendererMixin.java:16`

```java
@Mixin(ItemRenderer.class) public abstract class ItemRendererMixin
```

## meteordevelopment.meteorclient.mixin.ItemStackMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/ItemStackMixin.java:28`

```java
@Mixin(ItemStack.class) public abstract class ItemStackMixin
```

## meteordevelopment.meteorclient.mixin.KeyBindingAccessor

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/KeyBindingAccessor.java:16`

```java
@Mixin(KeyBinding.class) public interface KeyBindingAccessor
```

## meteordevelopment.meteorclient.mixin.KeyBindingAccessor.getKeysById

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/KeyBindingAccessor.java:18`

```java
@Accessor("KEYS_BY_ID") static Map<String, KeyBinding> getKeysById()
```

## meteordevelopment.meteorclient.mixin.KeyBindingAccessor.meteor$getKey

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/KeyBindingAccessor.java:21`

```java
@Accessor("boundKey") InputUtil.Key meteor$getKey()
```

## meteordevelopment.meteorclient.mixin.KeyBindingAccessor.meteor$getTimesPressed

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/KeyBindingAccessor.java:24`

```java
@Accessor("timesPressed") int meteor$getTimesPressed()
```

## meteordevelopment.meteorclient.mixin.KeyBindingAccessor.meteor$setTimesPressed

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/KeyBindingAccessor.java:27`

```java
@Accessor("timesPressed") void meteor$setTimesPressed(int timesPressed)
```

## meteordevelopment.meteorclient.mixin.KeyBindingAccessor.meteor$invokeReset

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/KeyBindingAccessor.java:30`

```java
@Invoker("reset") void meteor$invokeReset()
```

## meteordevelopment.meteorclient.mixin.KeyboardInputMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/KeyboardInputMixin.java:19`

```java
@Mixin(KeyboardInput.class) public abstract class KeyboardInputMixin extends Input
```

## meteordevelopment.meteorclient.mixin.KeyboardMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/KeyboardMixin.java:28`

```java
@Mixin(Keyboard.class) public abstract class KeyboardMixin
```

## meteordevelopment.meteorclient.mixin.KeyboardMixin.onKey

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/KeyboardMixin.java:32`

```java
@Inject(method = "onKey", at = @At("HEAD"), cancellable = true) public void onKey(long window, int action, KeyInput input, CallbackInfo ci)
```

## meteordevelopment.meteorclient.mixin.LayerRenderStateAccessor

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/LayerRenderStateAccessor.java:13`

```java
@Mixin(ItemRenderState.LayerRenderState.class) public interface LayerRenderStateAccessor
```

## meteordevelopment.meteorclient.mixin.LayerRenderStateAccessor.meteor$getTransform

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/LayerRenderStateAccessor.java:15`

```java
@Accessor("transform") Transformation meteor$getTransform()
```

## meteordevelopment.meteorclient.mixin.LightmapTextureManagerMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/LightmapTextureManagerMixin.java:27`

```java
@Mixin(LightmapTextureManager.class) public abstract class LightmapTextureManagerMixin
```

## meteordevelopment.meteorclient.mixin.LightningEntityRendererMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/LightningEntityRendererMixin.java:19`

```java
@Mixin(LightningEntityRenderer.class) public abstract class LightningEntityRendererMixin
```

## meteordevelopment.meteorclient.mixin.LivingEntityAccessor

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/LivingEntityAccessor.java:15`

```java
@Mixin(LivingEntity.class) public interface LivingEntityAccessor
```

## meteordevelopment.meteorclient.mixin.LivingEntityAccessor.meteor$swimUpwards

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/LivingEntityAccessor.java:17`

```java
@Invoker("swimUpward") void meteor$swimUpwards(TagKey<Fluid> fluid)
```

## meteordevelopment.meteorclient.mixin.LivingEntityAccessor.meteor$isJumping

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/LivingEntityAccessor.java:20`

```java
@Accessor("jumping") boolean meteor$isJumping()
```

## meteordevelopment.meteorclient.mixin.LivingEntityAccessor.meteor$getJumpCooldown

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/LivingEntityAccessor.java:23`

```java
@Accessor("jumpingCooldown") int meteor$getJumpCooldown()
```

## meteordevelopment.meteorclient.mixin.LivingEntityAccessor.meteor$setJumpCooldown

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/LivingEntityAccessor.java:26`

```java
@Accessor("jumpingCooldown") void meteor$setJumpCooldown(int cooldown)
```

## meteordevelopment.meteorclient.mixin.LivingEntityMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/LivingEntityMixin.java:41`

```java
@Mixin(LivingEntity.class) public abstract class LivingEntityMixin extends Entity
```

## meteordevelopment.meteorclient.mixin.LivingEntityMixin.LivingEntityMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/LivingEntityMixin.java:43`

```java
public LivingEntityMixin(EntityType<?> type, World world)
```

## meteordevelopment.meteorclient.mixin.LivingEntityMixin.recastOnLand

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/LivingEntityMixin.java:104`

```java
@Inject(method = "isGliding", at = @At("TAIL"), cancellable = true) public void recastOnLand(CallbackInfoReturnable<Boolean> cir)
```

## meteordevelopment.meteorclient.mixin.LivingEntityRendererMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/LivingEntityRendererMixin.java:41`

```java
@Mixin(LivingEntityRenderer.class) public abstract class LivingEntityRendererMixin<T extends LivingEntity, S extends LivingEntityRenderState, M extends EntityModel<? super S>>
```

## meteordevelopment.meteorclient.mixin.MapRendererMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/MapRendererMixin.java:23`

```java
@Mixin(MapRenderer.class) public abstract class MapRendererMixin
```

## meteordevelopment.meteorclient.mixin.MapTextureManagerAccessor

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/MapTextureManagerAccessor.java:14`

```java
@Mixin(MapTextureManager.class) public interface MapTextureManagerAccessor
```

## meteordevelopment.meteorclient.mixin.MapTextureManagerAccessor.meteor$invokeGetMapTexture

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/MapTextureManagerAccessor.java:16`

```java
@Invoker("getMapTexture") MapTextureManager.MapTexture meteor$invokeGetMapTexture(MapIdComponent id, MapState state)
```

## meteordevelopment.meteorclient.mixin.MessageHandlerMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/MessageHandlerMixin.java:22`

```java
@Mixin(MessageHandler.class) public abstract class MessageHandlerMixin implements IMessageHandler
```

## meteordevelopment.meteorclient.mixin.MessageHandlerMixin.meteor$getSender

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/MessageHandlerMixin.java:37`

```java
@Override public GameProfile meteor$getSender()
```

## meteordevelopment.meteorclient.mixin.MinecraftClientAccessor

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/MinecraftClientAccessor.java:25`

```java
@Mixin(MinecraftClient.class) public interface MinecraftClientAccessor
```

## meteordevelopment.meteorclient.mixin.MinecraftClientAccessor.meteor$getFps

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/MinecraftClientAccessor.java:27`

```java
@Accessor("currentFps") static int meteor$getFps()
```

## meteordevelopment.meteorclient.mixin.MinecraftClientAccessor.meteor$setSession

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/MinecraftClientAccessor.java:32`

```java
@Mutable @Accessor("session") void meteor$setSession(Session session)
```

## meteordevelopment.meteorclient.mixin.MinecraftClientAccessor.meteor$getResourceReloadLogger

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/MinecraftClientAccessor.java:36`

```java
@Accessor("resourceReloadLogger") ResourceReloadLogger meteor$getResourceReloadLogger()
```

## meteordevelopment.meteorclient.mixin.MinecraftClientAccessor.meteor$getAttackCooldown

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/MinecraftClientAccessor.java:39`

```java
@Accessor("attackCooldown") int meteor$getAttackCooldown()
```

## meteordevelopment.meteorclient.mixin.MinecraftClientAccessor.meteor$setAttackCooldown

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/MinecraftClientAccessor.java:42`

```java
@Accessor("attackCooldown") void meteor$setAttackCooldown(int attackCooldown)
```

## meteordevelopment.meteorclient.mixin.MinecraftClientAccessor.meteor$leftClick

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/MinecraftClientAccessor.java:45`

```java
@Invoker("doAttack") boolean meteor$leftClick()
```

## meteordevelopment.meteorclient.mixin.MinecraftClientAccessor.meteor$setProfileKeys

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/MinecraftClientAccessor.java:48`

```java
@Mutable @Accessor("profileKeys") void meteor$setProfileKeys(ProfileKeys keys)
```

## meteordevelopment.meteorclient.mixin.MinecraftClientAccessor.meteor$setUserApiService

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/MinecraftClientAccessor.java:52`

```java
@Mutable @Accessor("userApiService") void meteor$setUserApiService(UserApiService apiService)
```

## meteordevelopment.meteorclient.mixin.MinecraftClientAccessor.meteor$setSkinProvider

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/MinecraftClientAccessor.java:56`

```java
@Mutable @Accessor("skinProvider") void meteor$setSkinProvider(PlayerSkinProvider skinProvider)
```

## meteordevelopment.meteorclient.mixin.MinecraftClientAccessor.meteor$setSocialInteractionsManager

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/MinecraftClientAccessor.java:60`

```java
@Mutable @Accessor("socialInteractionsManager") void meteor$setSocialInteractionsManager(SocialInteractionsManager socialInteractionsManager)
```

## meteordevelopment.meteorclient.mixin.MinecraftClientAccessor.meteor$setAbuseReportContext

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/MinecraftClientAccessor.java:64`

```java
@Mutable @Accessor("abuseReportContext") void meteor$setAbuseReportContext(AbuseReportContext abuseReportContext)
```

## meteordevelopment.meteorclient.mixin.MinecraftClientAccessor.meteor$setGameProfileFuture

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/MinecraftClientAccessor.java:68`

```java
@Mutable @Accessor("gameProfileFuture") void meteor$setGameProfileFuture(CompletableFuture<ProfileResult> future)
```

## meteordevelopment.meteorclient.mixin.MinecraftClientAccessor.meteor$setApiServices

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/MinecraftClientAccessor.java:72`

```java
@Mutable @Accessor("apiServices") void meteor$setApiServices(ApiServices apiServices)
```

## meteordevelopment.meteorclient.mixin.MinecraftClientAccessor.meteor$handleInputEvents

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/MinecraftClientAccessor.java:76`

```java
@Invoker("handleInputEvents") void meteor$handleInputEvents()
```

## meteordevelopment.meteorclient.mixin.MinecraftClientMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/MinecraftClientMixin.java:63`

```java
@Mixin(value = MinecraftClient.class, priority = 1001) public abstract class MinecraftClientMixin implements IMinecraftClient
```

## meteordevelopment.meteorclient.mixin.MinecraftClientMixin.world

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/MinecraftClientMixin.java:70`

```java
@Shadow public ClientWorld world
```

## meteordevelopment.meteorclient.mixin.MinecraftClientMixin.mouse

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/MinecraftClientMixin.java:71`

```java
@Shadow @Final public Mouse mouse
```

## meteordevelopment.meteorclient.mixin.MinecraftClientMixin.currentScreen

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/MinecraftClientMixin.java:73`

```java
@Shadow public Screen currentScreen
```

## meteordevelopment.meteorclient.mixin.MinecraftClientMixin.options

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/MinecraftClientMixin.java:74`

```java
@Shadow @Final public GameOptions options
```

## meteordevelopment.meteorclient.mixin.MinecraftClientMixin.doItemUse

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/MinecraftClientMixin.java:76`

```java
@Shadow protected abstract void doItemUse()
```

## meteordevelopment.meteorclient.mixin.MinecraftClientMixin.interactionManager

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/MinecraftClientMixin.java:78`

```java
@Shadow @Nullable public ClientPlayerInteractionManager interactionManager
```

## meteordevelopment.meteorclient.mixin.MinecraftClientMixin.player

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/MinecraftClientMixin.java:85`

```java
@Shadow @Nullable public ClientPlayerEntity player
```

## meteordevelopment.meteorclient.mixin.MinecraftClientMixin.handleBlockBreaking

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/MinecraftClientMixin.java:94`

```java
@Shadow protected abstract void handleBlockBreaking(boolean breaking)
```

## meteordevelopment.meteorclient.mixin.MinecraftClientMixin.meteor$rightClick

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/MinecraftClientMixin.java:313`

```java
@Override public void meteor$rightClick()
```

## meteordevelopment.meteorclient.mixin.MinecraftClientMixin.meteor$setFramebuffer

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/MinecraftClientMixin.java:318`

```java
@Override public void meteor$setFramebuffer(Framebuffer framebuffer)
```

## meteordevelopment.meteorclient.mixin.MinecraftServerAccessor

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/MinecraftServerAccessor.java:13`

```java
@Mixin(MinecraftServer.class) public interface MinecraftServerAccessor
```

## meteordevelopment.meteorclient.mixin.MinecraftServerAccessor.meteor$getSession

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/MinecraftServerAccessor.java:15`

```java
@Accessor("session") LevelStorage.Session meteor$getSession()
```

## meteordevelopment.meteorclient.mixin.MobEntityMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/MobEntityMixin.java:15`

```java
@Mixin(MobEntity.class) public abstract class MobEntityMixin
```

## meteordevelopment.meteorclient.mixin.MobSpawnerBlockEntityRendererMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/MobSpawnerBlockEntityRendererMixin.java:19`

```java
@Mixin(MobSpawnerBlockEntityRenderer.class) public abstract class MobSpawnerBlockEntityRendererMixin implements BlockEntityRenderer<MobSpawnerBlockEntity, MobSpawnerBlockEntityRenderState>
```

## meteordevelopment.meteorclient.mixin.MountScreenHandlerAccessor

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/MountScreenHandlerAccessor.java:13`

```java
@Mixin(MountScreenHandler.class) public interface MountScreenHandlerAccessor
```

## meteordevelopment.meteorclient.mixin.MountScreenHandlerAccessor.meteor$getMount

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/MountScreenHandlerAccessor.java:15`

```java
@Accessor("mount") LivingEntity meteor$getMount()
```

## meteordevelopment.meteorclient.mixin.MouseMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/MouseMixin.java:27`

```java
@Mixin(Mouse.class) public abstract class MouseMixin
```

## meteordevelopment.meteorclient.mixin.MouseMixin.getScaledX

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/MouseMixin.java:29`

```java
@Shadow public abstract double getScaledX(Window window)
```

## meteordevelopment.meteorclient.mixin.MouseMixin.getScaledY

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/MouseMixin.java:32`

```java
@Shadow public abstract double getScaledY(Window window)
```

## meteordevelopment.meteorclient.mixin.MultiplayerScreenMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/MultiplayerScreenMixin.java:28`

```java
@Mixin(MultiplayerScreen.class) public abstract class MultiplayerScreenMixin extends Screen
```

## meteordevelopment.meteorclient.mixin.MultiplayerScreenMixin.MultiplayerScreenMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/MultiplayerScreenMixin.java:55`

```java
public MultiplayerScreenMixin(Text title)
```

## meteordevelopment.meteorclient.mixin.MultiplayerScreenMixin.render

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/MultiplayerScreenMixin.java:110`

```java
@Override public void render(DrawContext context, int mouseX, int mouseY, float deltaTicks)
```

## meteordevelopment.meteorclient.mixin.MutableTextMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/MutableTextMixin.java:15`

```java
@Mixin(MutableText.class) public abstract class MutableTextMixin implements IText
```

## meteordevelopment.meteorclient.mixin.MutableTextMixin.meteor$invalidateCache

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/MutableTextMixin.java:20`

```java
@Override public void meteor$invalidateCache()
```

## meteordevelopment.meteorclient.mixin.PacketBundlingMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/PacketBundlingMixin.java:17`

```java
@Mixin(targets = "net/minecraft/network/handler/PacketBundleHandler$1$1") public class PacketBundlingMixin
```

## meteordevelopment.meteorclient.mixin.PacketByteBufMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/PacketByteBufMixin.java:16`

```java
@Mixin(PacketByteBuf.class) public abstract class PacketByteBufMixin
```

## meteordevelopment.meteorclient.mixin.ParticleManagerMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/ParticleManagerMixin.java:21`

```java
@Mixin(ParticleManager.class) public abstract class ParticleManagerMixin
```

## meteordevelopment.meteorclient.mixin.ParticleManagerMixin.createParticle

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/ParticleManagerMixin.java:23`

```java
@Shadow @Nullable protected abstract <T extends ParticleEffect> Particle createParticle(T parameters, double x, double y, double z, double velocityX, double velocityY, double velocityZ)
```

## meteordevelopment.meteorclient.mixin.PlayerEntityAccessor

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/PlayerEntityAccessor.java:13`

```java
@Mixin(PlayerEntity.class) public interface PlayerEntityAccessor
```

## meteordevelopment.meteorclient.mixin.PlayerEntityAccessor.meteor$canChangeIntoPose

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/PlayerEntityAccessor.java:15`

```java
@Invoker("canChangeIntoPose") boolean meteor$canChangeIntoPose(EntityPose pose)
```

## meteordevelopment.meteorclient.mixin.PlayerEntityMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/PlayerEntityMixin.java:39`

```java
@Mixin(PlayerEntity.class) public abstract class PlayerEntityMixin extends LivingEntity
```

## meteordevelopment.meteorclient.mixin.PlayerEntityMixin.getAbilities

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/PlayerEntityMixin.java:41`

```java
@Shadow public abstract PlayerAbilities getAbilities()
```

## meteordevelopment.meteorclient.mixin.PlayerEntityMixin.PlayerEntityMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/PlayerEntityMixin.java:44`

```java
protected PlayerEntityMixin(EntityType<? extends LivingEntity> entityType, World world)
```

## meteordevelopment.meteorclient.mixin.PlayerEntityMixin.clipAtLedge

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/PlayerEntityMixin.java:48`

```java
@Inject(method = "clipAtLedge", at = @At("HEAD"), cancellable = true) protected void clipAtLedge(CallbackInfoReturnable<Boolean> info)
```

## meteordevelopment.meteorclient.mixin.PlayerEntityMixin.onGetBlockBreakingSpeed

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/PlayerEntityMixin.java:73`

```java
@ModifyReturnValue(method = "getBlockBreakingSpeed", at = @At(value = "RETURN")) public float onGetBlockBreakingSpeed(float breakSpeed, BlockState block)
```

## meteordevelopment.meteorclient.mixin.PlayerEntityRendererMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/PlayerEntityRendererMixin.java:36`

```java
@Mixin(PlayerEntityRenderer.class) public abstract class PlayerEntityRendererMixin<AvatarlikeEntity extends PlayerLikeEntity & ClientPlayerLikeEntity> extends LivingEntityRenderer<AvatarlikeEntity, PlayerEntityRenderState, PlayerEntityModel>
```

## meteordevelopment.meteorclient.mixin.PlayerEntityRendererMixin.PlayerEntityRendererMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/PlayerEntityRendererMixin.java:44`

```java
public PlayerEntityRendererMixin(EntityRendererFactory.Context ctx, PlayerEntityModel model, float shadowRadius)
```

## meteordevelopment.meteorclient.mixin.PlayerInteractEntityC2SPacketMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/PlayerInteractEntityC2SPacketMixin.java:22`

```java
@Mixin(PlayerInteractEntityC2SPacket.class) public abstract class PlayerInteractEntityC2SPacketMixin implements IPlayerInteractEntityC2SPacket
```

## meteordevelopment.meteorclient.mixin.PlayerInteractEntityC2SPacketMixin.meteor$getType

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/PlayerInteractEntityC2SPacketMixin.java:27`

```java
@Override public PlayerInteractEntityC2SPacket.InteractType meteor$getType()
```

## meteordevelopment.meteorclient.mixin.PlayerInteractEntityC2SPacketMixin.meteor$getEntity

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/PlayerInteractEntityC2SPacketMixin.java:32`

```java
@Override public Entity meteor$getEntity()
```

## meteordevelopment.meteorclient.mixin.PlayerListEntryMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/PlayerListEntryMixin.java:21`

```java
@Mixin(PlayerListEntry.class) public abstract class PlayerListEntryMixin
```

## meteordevelopment.meteorclient.mixin.PlayerListEntryMixin.getProfile

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/PlayerListEntryMixin.java:23`

```java
@Shadow public abstract GameProfile getProfile()
```

## meteordevelopment.meteorclient.mixin.PlayerListHudMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/PlayerListHudMixin.java:27`

```java
@Mixin(PlayerListHud.class) public abstract class PlayerListHudMixin
```

## meteordevelopment.meteorclient.mixin.PlayerListHudMixin.collectPlayerEntries

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/PlayerListHudMixin.java:29`

```java
@Shadow protected abstract List<PlayerListEntry> collectPlayerEntries()
```

## meteordevelopment.meteorclient.mixin.PlayerListHudMixin.getPlayerName

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/PlayerListHudMixin.java:39`

```java
@Inject(method = "getPlayerName", at = @At("HEAD"), cancellable = true) public void getPlayerName(PlayerListEntry playerListEntry, CallbackInfoReturnable<Text> info)
```

## meteordevelopment.meteorclient.mixin.PlayerMoveC2SPacketAccessor

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/PlayerMoveC2SPacketAccessor.java:13`

```java
@Mixin(PlayerMoveC2SPacket.class) public interface PlayerMoveC2SPacketAccessor
```

## meteordevelopment.meteorclient.mixin.PlayerMoveC2SPacketAccessor.meteor$setY

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/PlayerMoveC2SPacketAccessor.java:15`

```java
@Mutable @Accessor("y") void meteor$setY(double y)
```

## meteordevelopment.meteorclient.mixin.PlayerMoveC2SPacketAccessor.meteor$setOnGround

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/PlayerMoveC2SPacketAccessor.java:19`

```java
@Mutable @Accessor("onGround") void meteor$setOnGround(boolean onGround)
```

## meteordevelopment.meteorclient.mixin.PlayerMoveC2SPacketMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/PlayerMoveC2SPacketMixin.java:13`

```java
@Mixin(PlayerMoveC2SPacket.class) public abstract class PlayerMoveC2SPacketMixin implements IPlayerMoveC2SPacket
```

## meteordevelopment.meteorclient.mixin.PlayerMoveC2SPacketMixin.meteor$setTag

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/PlayerMoveC2SPacketMixin.java:17`

```java
@Override public void meteor$setTag(int tag)
```

## meteordevelopment.meteorclient.mixin.PlayerMoveC2SPacketMixin.meteor$getTag

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/PlayerMoveC2SPacketMixin.java:20`

```java
@Override public int meteor$getTag()
```

## meteordevelopment.meteorclient.mixin.PlayerSkinProviderAccessor

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/PlayerSkinProviderAccessor.java:12`

```java
@Mixin(PlayerSkinProvider.class) public interface PlayerSkinProviderAccessor
```

## meteordevelopment.meteorclient.mixin.PlayerSkinProviderAccessor.meteor$getSkinCache

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/PlayerSkinProviderAccessor.java:14`

```java
@Accessor("skinCache") PlayerSkinProvider.FileCache meteor$getSkinCache()
```

## meteordevelopment.meteorclient.mixin.PowderSnowBlockMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/PowderSnowBlockMixin.java:18`

```java
@Mixin(PowderSnowBlock.class) public abstract class PowderSnowBlockMixin
```

## meteordevelopment.meteorclient.mixin.ProjectileInGroundAccessor

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/ProjectileInGroundAccessor.java:12`

```java
@Mixin(PersistentProjectileEntity.class) public interface ProjectileInGroundAccessor
```

## meteordevelopment.meteorclient.mixin.ProjectileInGroundAccessor.meteor$invokeIsInGround

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/ProjectileInGroundAccessor.java:14`

```java
@Invoker("isInGround") boolean meteor$invokeIsInGround()
```

## meteordevelopment.meteorclient.mixin.ProjectileUtilMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/ProjectileUtilMixin.java:18`

```java
@Mixin(ProjectileUtil.class) public class ProjectileUtilMixin
```

## meteordevelopment.meteorclient.mixin.ProjectionMatrix2Accessor

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/ProjectionMatrix2Accessor.java:13`

```java
@Mixin(ProjectionMatrix2.class) public interface ProjectionMatrix2Accessor
```

## meteordevelopment.meteorclient.mixin.ProjectionMatrix2Accessor.meteor$callGetMatrix

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/ProjectionMatrix2Accessor.java:15`

```java
@Invoker("getMatrix") Matrix4f meteor$callGetMatrix(float width, float height)
```

## meteordevelopment.meteorclient.mixin.RaycastContextMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/RaycastContextMixin.java:18`

```java
@Mixin(RaycastContext.class) public abstract class RaycastContextMixin implements IRaycastContext
```

## meteordevelopment.meteorclient.mixin.RaycastContextMixin.meteor$set

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/RaycastContextMixin.java:26`

```java
@Override public void meteor$set(Vec3d start, Vec3d end, RaycastContext.ShapeType shapeType, RaycastContext.FluidHandling fluidHandling, Entity entity)
```

## meteordevelopment.meteorclient.mixin.RegistriesMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/RegistriesMixin.java:15`

```java
@Mixin(Registries.class) public abstract class RegistriesMixin
```

## meteordevelopment.meteorclient.mixin.ReloadStateAccessor

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/ReloadStateAccessor.java:12`

```java
@Mixin(ResourceReloadLogger.ReloadState.class) public interface ReloadStateAccessor
```

## meteordevelopment.meteorclient.mixin.ReloadStateAccessor.meteor$isFinished

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/ReloadStateAccessor.java:14`

```java
@Accessor("finished") boolean meteor$isFinished()
```

## meteordevelopment.meteorclient.mixin.RenderLayerAccessor

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/RenderLayerAccessor.java:13`

```java
@Mixin(RenderLayer.class) public interface RenderLayerAccessor
```

## meteordevelopment.meteorclient.mixin.RenderLayerAccessor.getRenderSetup

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/RenderLayerAccessor.java:15`

```java
@Accessor("renderSetup") RenderSetup getRenderSetup()
```

## meteordevelopment.meteorclient.mixin.RenderPipelineMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/RenderPipelineMixin.java:13`

```java
@Mixin(RenderPipeline.class) public abstract class RenderPipelineMixin implements IRenderPipeline
```

## meteordevelopment.meteorclient.mixin.RenderPipelineMixin.meteor$setLineSmooth

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/RenderPipelineMixin.java:18`

```java
@Override public void meteor$setLineSmooth(boolean lineSmooth)
```

## meteordevelopment.meteorclient.mixin.RenderPipelineMixin.meteor$getLineSmooth

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/RenderPipelineMixin.java:23`

```java
@Override public boolean meteor$getLineSmooth()
```

## meteordevelopment.meteorclient.mixin.RenderSystemMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/RenderSystemMixin.java:22`

```java
@Mixin(RenderSystem.class) public abstract class RenderSystemMixin
```

## meteordevelopment.meteorclient.mixin.RenderTickCounterDynamicMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/RenderTickCounterDynamicMixin.java:18`

```java
@Mixin(RenderTickCounter.Dynamic.class) public abstract class RenderTickCounterDynamicMixin
```

## meteordevelopment.meteorclient.mixin.ResourceReloadLoggerAccessor

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/ResourceReloadLoggerAccessor.java:12`

```java
@Mixin(ResourceReloadLogger.class) public interface ResourceReloadLoggerAccessor
```

## meteordevelopment.meteorclient.mixin.ResourceReloadLoggerAccessor.meteor$getReloadState

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/ResourceReloadLoggerAccessor.java:14`

```java
@Accessor("reloadState") ResourceReloadLogger.ReloadState meteor$getReloadState()
```

## meteordevelopment.meteorclient.mixin.ScreenMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/ScreenMixin.java:33`

```java
@Mixin(value = Screen.class, priority = 500) // needs to be before baritone public abstract class ScreenMixin
```

## meteordevelopment.meteorclient.mixin.SectionedEntityCacheAccessor

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/SectionedEntityCacheAccessor.java:16`

```java
@Mixin(SectionedEntityCache.class) public interface SectionedEntityCacheAccessor
```

## meteordevelopment.meteorclient.mixin.SectionedEntityCacheAccessor.meteor$getTrackedPositions

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/SectionedEntityCacheAccessor.java:18`

```java
@Accessor("trackedPositions") LongSortedSet meteor$getTrackedPositions()
```

## meteordevelopment.meteorclient.mixin.SectionedEntityCacheAccessor.meteor$getTrackingSections

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/SectionedEntityCacheAccessor.java:21`

```java
@Accessor("trackingSections") <T extends EntityLike> Long2ObjectMap<EntityTrackingSection<T>> meteor$getTrackingSections()
```

## meteordevelopment.meteorclient.mixin.ServerPlayerEntityMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/ServerPlayerEntityMixin.java:20`

```java
@Mixin(ServerPlayerEntity.class) public abstract class ServerPlayerEntityMixin extends LivingEntity
```

## meteordevelopment.meteorclient.mixin.ServerPlayerEntityMixin.ServerPlayerEntityMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/ServerPlayerEntityMixin.java:22`

```java
protected ServerPlayerEntityMixin(EntityType<? extends LivingEntity> entityType, World world)
```

## meteordevelopment.meteorclient.mixin.ServerPlayerEntityMixin.dontJump

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/ServerPlayerEntityMixin.java:26`

```java
@Inject(method = "jump", at = @At("HEAD"), cancellable = true) public void dontJump(CallbackInfo ci)
```

## meteordevelopment.meteorclient.mixin.ServerResourcePackLoaderMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/ServerResourcePackLoaderMixin.java:16`

```java
@Mixin(ServerResourcePackLoader.class) public abstract class ServerResourcePackLoaderMixin
```

## meteordevelopment.meteorclient.mixin.ShaderLoaderMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/ShaderLoaderMixin.java:15`

```java
@Mixin(ShaderLoader.class) public abstract class ShaderLoaderMixin
```

## meteordevelopment.meteorclient.mixin.ShadowPiecesCommandRendererMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/ShadowPiecesCommandRendererMixin.java:16`

```java
@Mixin(ShadowPiecesCommandRenderer.class) public abstract class ShadowPiecesCommandRendererMixin
```

## meteordevelopment.meteorclient.mixin.ShulkerBoxScreenHandlerAccessor

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/ShulkerBoxScreenHandlerAccessor.java:13`

```java
@Mixin(ShulkerBoxScreenHandler.class) public interface ShulkerBoxScreenHandlerAccessor
```

## meteordevelopment.meteorclient.mixin.ShulkerBoxScreenHandlerAccessor.meteor$getInventory

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/ShulkerBoxScreenHandlerAccessor.java:15`

```java
@Accessor("inventory") Inventory meteor$getInventory()
```

## meteordevelopment.meteorclient.mixin.SimpleEntityLookupAccessor

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/SimpleEntityLookupAccessor.java:14`

```java
@Mixin(SimpleEntityLookup.class) public interface SimpleEntityLookupAccessor
```

## meteordevelopment.meteorclient.mixin.SimpleEntityLookupAccessor.meteor$getCache

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/SimpleEntityLookupAccessor.java:16`

```java
@Accessor("cache") <T extends EntityLike> SectionedEntityCache<T> meteor$getCache()
```

## meteordevelopment.meteorclient.mixin.SimpleOptionMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/SimpleOptionMixin.java:18`

```java
@Mixin(SimpleOption.class) public abstract class SimpleOptionMixin implements ISimpleOption
```

## meteordevelopment.meteorclient.mixin.SimpleOptionMixin.meteor$set

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/SimpleOptionMixin.java:23`

```java
@Override public void meteor$set(Object value)
```

## meteordevelopment.meteorclient.mixin.SkyRenderingMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/SkyRenderingMixin.java:22`

```java
@Mixin(SkyRendering.class) public class SkyRenderingMixin
```

## meteordevelopment.meteorclient.mixin.SlimeBlockMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/SlimeBlockMixin.java:22`

```java
@Mixin(SlimeBlock.class) public abstract class SlimeBlockMixin
```

## meteordevelopment.meteorclient.mixin.SlotMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/SlotMixin.java:14`

```java
@Mixin(Slot.class) public abstract class SlotMixin implements ISlot
```

## meteordevelopment.meteorclient.mixin.SlotMixin.id

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/SlotMixin.java:16`

```java
@Shadow public int id
```

## meteordevelopment.meteorclient.mixin.SlotMixin.meteor$getId

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/SlotMixin.java:19`

```java
@Override public int meteor$getId()
```

## meteordevelopment.meteorclient.mixin.SlotMixin.meteor$getIndex

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/SlotMixin.java:24`

```java
@Override public int meteor$getIndex()
```

## meteordevelopment.meteorclient.mixin.SoundSystemMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/SoundSystemMixin.java:23`

```java
@Mixin(SoundSystem.class) public abstract class SoundSystemMixin
```

## meteordevelopment.meteorclient.mixin.SoundSystemMixin.stop

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/SoundSystemMixin.java:25`

```java
@Shadow public abstract void stop(SoundInstance sound)
```

## meteordevelopment.meteorclient.mixin.SplashTextResourceSupplierMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/SplashTextResourceSupplierMixin.java:21`

```java
@Mixin(SplashTextResourceSupplier.class) public abstract class SplashTextResourceSupplierMixin
```

## meteordevelopment.meteorclient.mixin.StatusEffectFogModifierMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/StatusEffectFogModifierMixin.java:19`

```java
@Mixin(StatusEffectFogModifier.class) public abstract class StatusEffectFogModifierMixin
```

## meteordevelopment.meteorclient.mixin.StatusEffectFogModifierMixin.getStatusEffect

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/StatusEffectFogModifierMixin.java:21`

```java
@Shadow public abstract RegistryEntry<StatusEffect> getStatusEffect()
```

## meteordevelopment.meteorclient.mixin.StatusEffectInstanceAccessor

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/StatusEffectInstanceAccessor.java:12`

```java
@Mixin(StatusEffectInstance.class) public interface StatusEffectInstanceAccessor
```

## meteordevelopment.meteorclient.mixin.StatusEffectInstanceAccessor.meteor$setDuration

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/StatusEffectInstanceAccessor.java:14`

```java
@Accessor("duration") void meteor$setDuration(int duration)
```

## meteordevelopment.meteorclient.mixin.StatusEffectInstanceMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/StatusEffectInstanceMixin.java:17`

```java
@Mixin(StatusEffectInstance.class) public abstract class StatusEffectInstanceMixin
```

## meteordevelopment.meteorclient.mixin.StringHelperMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/StringHelperMixin.java:15`

```java
@Mixin(StringHelper.class) public abstract class StringHelperMixin
```

## meteordevelopment.meteorclient.mixin.SweetBerryBushBlockMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/SweetBerryBushBlockMixin.java:21`

```java
@Mixin(SweetBerryBushBlock.class) public abstract class SweetBerryBushBlockMixin
```

## meteordevelopment.meteorclient.mixin.TextHandlerAccessor

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/TextHandlerAccessor.java:12`

```java
@Mixin(TextHandler.class) public interface TextHandlerAccessor
```

## meteordevelopment.meteorclient.mixin.TextHandlerAccessor.meteor$getWidthRetriever

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/TextHandlerAccessor.java:14`

```java
@Accessor("widthRetriever") TextHandler.WidthRetriever meteor$getWidthRetriever()
```

## meteordevelopment.meteorclient.mixin.TextMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/TextMixin.java:12`

```java
@Mixin(Text.class) public interface TextMixin extends IText
```

## meteordevelopment.meteorclient.mixin.TextMixin.meteor$invalidateCache

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/TextMixin.java:14`

```java
@Override default void meteor$invalidateCache()
```

## meteordevelopment.meteorclient.mixin.TextRendererMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/TextRendererMixin.java:15`

```java
@Mixin(TextRenderer.class) public abstract class TextRendererMixin
```

## meteordevelopment.meteorclient.mixin.TextVisitFactoryMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/TextVisitFactoryMixin.java:15`

```java
@Mixin(TextVisitFactory.class) public abstract class TextVisitFactoryMixin
```

## meteordevelopment.meteorclient.mixin.TitleScreenMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/TitleScreenMixin.java:22`

```java
@Mixin(TitleScreen.class) public abstract class TitleScreenMixin extends Screen
```

## meteordevelopment.meteorclient.mixin.TitleScreenMixin.TitleScreenMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/TitleScreenMixin.java:24`

```java
public TitleScreenMixin(Text title)
```

## meteordevelopment.meteorclient.mixin.TooltipComponentMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/TooltipComponentMixin.java:16`

```java
@Mixin(TooltipComponent.class) public interface TooltipComponentMixin
```

## meteordevelopment.meteorclient.mixin.TooltipDisplayComponentMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/TooltipDisplayComponentMixin.java:15`

```java
@Mixin(TooltipDisplayComponent.class) public abstract class TooltipDisplayComponentMixin
```

## meteordevelopment.meteorclient.mixin.TransformationMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/TransformationMixin.java:17`

```java
@Mixin(Transformation.class) public abstract class TransformationMixin
```

## meteordevelopment.meteorclient.mixin.TridentItemMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/TridentItemMixin.java:25`

```java
@Mixin(TridentItem.class) public abstract class TridentItemMixin
```

## meteordevelopment.meteorclient.mixin.Vec3dMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/Vec3dMixin.java:15`

```java
@Mixin(Vec3d.class) public abstract class Vec3dMixin implements IVec3d
```

## meteordevelopment.meteorclient.mixin.Vec3dMixin.x

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/Vec3dMixin.java:17`

```java
@Shadow @Final @Mutable public double x
```

## meteordevelopment.meteorclient.mixin.Vec3dMixin.y

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/Vec3dMixin.java:18`

```java
@Shadow @Final @Mutable public double y
```

## meteordevelopment.meteorclient.mixin.Vec3dMixin.z

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/Vec3dMixin.java:19`

```java
@Shadow @Final @Mutable public double z
```

## meteordevelopment.meteorclient.mixin.Vec3dMixin.meteor$set

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/Vec3dMixin.java:21`

```java
@Override public Vec3d meteor$set(double x, double y, double z)
```

## meteordevelopment.meteorclient.mixin.Vec3dMixin.meteor$setXZ

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/Vec3dMixin.java:30`

```java
@Override public Vec3d meteor$setXZ(double x, double z)
```

## meteordevelopment.meteorclient.mixin.Vec3dMixin.meteor$setY

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/Vec3dMixin.java:38`

```java
@Override public Vec3d meteor$setY(double y)
```

## meteordevelopment.meteorclient.mixin.WorldAccessor

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/WorldAccessor.java:14`

```java
@Mixin(World.class) public interface WorldAccessor
```

## meteordevelopment.meteorclient.mixin.WorldAccessor.meteor$getEntityLookup

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/WorldAccessor.java:16`

```java
@Invoker("getEntityLookup") EntityLookup<Entity> meteor$getEntityLookup()
```

## meteordevelopment.meteorclient.mixin.WorldBorderMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/WorldBorderMixin.java:16`

```java
@Mixin(WorldBorder.class) public abstract class WorldBorderMixin
```

## meteordevelopment.meteorclient.mixin.WorldChunkMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/WorldChunkMixin.java:21`

```java
@Mixin(WorldChunk.class) public abstract class WorldChunkMixin
```

## meteordevelopment.meteorclient.mixin.WorldRendererAccessor

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/WorldRendererAccessor.java:15`

```java
@Mixin(WorldRenderer.class) public interface WorldRendererAccessor
```

## meteordevelopment.meteorclient.mixin.WorldRendererAccessor.meteor$getBlockBreakingInfos

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/WorldRendererAccessor.java:17`

```java
@Accessor("blockBreakingInfos") Int2ObjectMap<BlockBreakingInfo> meteor$getBlockBreakingInfos()
```

## meteordevelopment.meteorclient.mixin.WorldRendererMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/WorldRendererMixin.java:59`

```java
@Mixin(WorldRenderer.class) public abstract class WorldRendererMixin implements IWorldRenderer
```

## meteordevelopment.meteorclient.mixin.WorldRendererMixin.meteor$pushEntityOutlineFramebuffer

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/WorldRendererMixin.java:237`

```java
@Override public void meteor$pushEntityOutlineFramebuffer(Framebuffer framebuffer)
```

## meteordevelopment.meteorclient.mixin.WorldRendererMixin.meteor$popEntityOutlineFramebuffer

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/WorldRendererMixin.java:246`

```java
@Override public void meteor$popEntityOutlineFramebuffer()
```

## meteordevelopment.meteorclient.mixin.YggdrasilMinecraftSessionServiceAccessor

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/YggdrasilMinecraftSessionServiceAccessor.java:16`

```java
@Mixin(YggdrasilMinecraftSessionService.class) public interface YggdrasilMinecraftSessionServiceAccessor
```

## meteordevelopment.meteorclient.mixin.YggdrasilMinecraftSessionServiceAccessor.meteor$createYggdrasilMinecraftSessionService

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/YggdrasilMinecraftSessionServiceAccessor.java:18`

```java
@Invoker("<init>") static YggdrasilMinecraftSessionService meteor$createYggdrasilMinecraftSessionService(final ServicesKeySet servicesKeySet, final Proxy proxy, final Environment env)
```

## meteordevelopment.meteorclient.mixin.baritone.ComeCommandMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/baritone/ComeCommandMixin.java:19`

```java
@Mixin(ComeCommand.class) public abstract class ComeCommandMixin
```

## meteordevelopment.meteorclient.mixin.indigo.AbstractTerrainRenderContextMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/indigo/AbstractTerrainRenderContextMixin.java:20`

```java
@Mixin(AbstractTerrainRenderContext.class) public abstract class AbstractTerrainRenderContextMixin
```

## meteordevelopment.meteorclient.mixin.indigo.AbstractTerrainRenderContextMixin.blockInfo

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/indigo/AbstractTerrainRenderContextMixin.java:22`

```java
@Final @Shadow(remap = false) protected BlockRenderInfo blockInfo
```

## meteordevelopment.meteorclient.mixin.indigo.BlockRenderInfoMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/indigo/BlockRenderInfoMixin.java:20`

```java
@Mixin(BlockRenderInfo.class) public abstract class BlockRenderInfoMixin
```

## meteordevelopment.meteorclient.mixin.indigo.BlockRenderInfoMixin.blockState

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/indigo/BlockRenderInfoMixin.java:22`

```java
@Shadow public BlockState blockState
```

## meteordevelopment.meteorclient.mixin.indigo.BlockRenderInfoMixin.blockView

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/indigo/BlockRenderInfoMixin.java:25`

```java
@Shadow public BlockRenderView blockView
```

## meteordevelopment.meteorclient.mixin.indigo.BlockRenderInfoMixin.blockPos

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/indigo/BlockRenderInfoMixin.java:28`

```java
@Shadow public BlockPos blockPos
```

## meteordevelopment.meteorclient.mixin.lithium.ChunkAwareBlockCollisionSweeperMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/lithium/ChunkAwareBlockCollisionSweeperMixin.java:25`

```java
@Mixin(value = ChunkAwareBlockCollisionSweeperVoxelShape.class) public abstract class ChunkAwareBlockCollisionSweeperMixin extends ChunkAwareBlockCollisionSweeper<VoxelShape>
```

## meteordevelopment.meteorclient.mixin.lithium.ChunkAwareBlockCollisionSweeperMixin.ChunkAwareBlockCollisionSweeperMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/lithium/ChunkAwareBlockCollisionSweeperMixin.java:27`

```java
public ChunkAwareBlockCollisionSweeperMixin(World world, @Nullable Entity entity, Box box, boolean hideLastCollision)
```

## meteordevelopment.meteorclient.mixin.lithium.LithiumEntityCollisionsMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/lithium/LithiumEntityCollisionsMixin.java:18`

```java
@Mixin(value = LithiumEntityCollisions.class) public abstract class LithiumEntityCollisionsMixin
```

## meteordevelopment.meteorclient.mixin.sodium.MeshVertexConsumerMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/sodium/MeshVertexConsumerMixin.java:17`

```java
@Mixin(value = MeshBuilderVertexConsumerProvider.MeshBuilderVertexConsumer.class, remap = false) public abstract class MeshVertexConsumerMixin implements VertexConsumer, VertexBufferWriter
```

## meteordevelopment.meteorclient.mixin.sodium.MeshVertexConsumerMixin.push

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/sodium/MeshVertexConsumerMixin.java:19`

```java
@Override public void push(MemoryStack stack, long ptr, int count, VertexFormat format)
```

## meteordevelopment.meteorclient.mixin.sodium.SodiumBlockOcclusionCacheMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/sodium/SodiumBlockOcclusionCacheMixin.java:24`

```java
@Mixin(value = AbstractBlockRenderContext.class, remap = false) public abstract class SodiumBlockOcclusionCacheMixin
```

## meteordevelopment.meteorclient.mixin.sodium.SodiumBlockOcclusionCacheMixin.state

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/sodium/SodiumBlockOcclusionCacheMixin.java:27`

```java
@Shadow protected BlockState state
```

## meteordevelopment.meteorclient.mixin.sodium.SodiumBlockOcclusionCacheMixin.pos

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/sodium/SodiumBlockOcclusionCacheMixin.java:28`

```java
@Shadow protected BlockPos pos
```

## meteordevelopment.meteorclient.mixin.sodium.SodiumBlockOcclusionCacheMixin.slice

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/sodium/SodiumBlockOcclusionCacheMixin.java:29`

```java
@Shadow protected LevelSlice slice
```

## meteordevelopment.meteorclient.mixin.sodium.SodiumBlockRendererMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/sodium/SodiumBlockRendererMixin.java:23`

```java
@Mixin(value = BlockRenderer.class, remap = false) public class SodiumBlockRendererMixin
```

## meteordevelopment.meteorclient.mixin.sodium.SodiumDefaultFluidRendererMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/sodium/SodiumDefaultFluidRendererMixin.java:32`

```java
@Mixin(value = DefaultFluidRenderer.class, remap = false) public abstract class SodiumDefaultFluidRendererMixin
```

## meteordevelopment.meteorclient.mixin.sodium.SodiumFluidRendererImplDefaultRenderContextMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/sodium/SodiumFluidRendererImplDefaultRenderContextMixin.java:28`

```java
@Mixin(targets = "net.caffeinemc.mods.sodium.fabric.render.FluidRendererImpl$DefaultRenderContext", remap = false) public abstract class SodiumFluidRendererImplDefaultRenderContextMixin
```

## meteordevelopment.meteorclient.mixin.sodium.SodiumFluidRendererImplMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/sodium/SodiumFluidRendererImplMixin.java:21`

```java
@Mixin(value = FluidRendererImpl.class, remap = false) public abstract class SodiumFluidRendererImplMixin
```

## meteordevelopment.meteorclient.mixin.sodium.SodiumInnerPartitionBSPNodeMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/sodium/SodiumInnerPartitionBSPNodeMixin.java:18`

```java
@Mixin(targets = "net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.bsp_tree.InnerPartitionBSPNode", remap = false) public class SodiumInnerPartitionBSPNodeMixin
```

## meteordevelopment.meteorclient.mixin.sodium.SodiumLightDataAccessMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/sodium/SodiumLightDataAccessMixin.java:25`

```java
@Mixin(value = LightDataAccess.class, remap = false) public abstract class SodiumLightDataAccessMixin
```

## meteordevelopment.meteorclient.mixin.sodium.SodiumLightDataAccessMixin.level

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/sodium/SodiumLightDataAccessMixin.java:30`

```java
@Shadow protected BlockRenderView level
```

## meteordevelopment.meteorclient.mixin.sodium.SodiumWorldRendererMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/sodium/SodiumWorldRendererMixin.java:17`

```java
@Mixin(SodiumWorldRenderer.class) public class SodiumWorldRendererMixin
```

## meteordevelopment.meteorclient.mixin.viafabricplus.GeneralSettingsMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixin/viafabricplus/GeneralSettingsMixin.java:13`

```java
@Mixin(GeneralSettings.class) public abstract class GeneralSettingsMixin
```
