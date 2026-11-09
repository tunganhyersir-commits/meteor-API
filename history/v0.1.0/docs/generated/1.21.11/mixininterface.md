# mixininterface

Khai báo Java có cú pháp public/protected. Không bao gồm API kế thừa/tổng hợp bởi compiler; xem kiểm tra bytecode riêng.

## meteordevelopment.meteorclient.mixininterface.IAbstractFurnaceScreenHandler

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixininterface/IAbstractFurnaceScreenHandler.java:10`

```java
public interface IAbstractFurnaceScreenHandler
```

## meteordevelopment.meteorclient.mixininterface.IAbstractFurnaceScreenHandler.meteor$isItemSmeltable

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixininterface/IAbstractFurnaceScreenHandler.java:11`

```java
boolean meteor$isItemSmeltable(ItemStack itemStack)
```

## meteordevelopment.meteorclient.mixininterface.IBox

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixininterface/IBox.java:10`

```java
public interface IBox
```

## meteordevelopment.meteorclient.mixininterface.IBox.meteor$expand

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixininterface/IBox.java:11`

```java
void meteor$expand(double v)
```

## meteordevelopment.meteorclient.mixininterface.IBox.meteor$set

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixininterface/IBox.java:13`

```java
void meteor$set(double x1, double y1, double z1, double x2, double y2, double z2)
```

## meteordevelopment.meteorclient.mixininterface.IBox.meteor$set

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixininterface/IBox.java:15`

```java
default void meteor$set(BlockPos pos)
```

## meteordevelopment.meteorclient.mixininterface.ICamera

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixininterface/ICamera.java:8`

```java
public interface ICamera
```

## meteordevelopment.meteorclient.mixininterface.ICamera.meteor$setRot

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixininterface/ICamera.java:9`

```java
void meteor$setRot(double yaw, double pitch)
```

## meteordevelopment.meteorclient.mixininterface.ICapabilityTracker

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixininterface/ICapabilityTracker.java:8`

```java
public interface ICapabilityTracker
```

## meteordevelopment.meteorclient.mixininterface.ICapabilityTracker.meteor$get

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixininterface/ICapabilityTracker.java:9`

```java
boolean meteor$get()
```

## meteordevelopment.meteorclient.mixininterface.ICapabilityTracker.meteor$set

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixininterface/ICapabilityTracker.java:11`

```java
void meteor$set(boolean state)
```

## meteordevelopment.meteorclient.mixininterface.IChatHud

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixininterface/IChatHud.java:10`

```java
public interface IChatHud
```

## meteordevelopment.meteorclient.mixininterface.IChatHud.meteor$add

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixininterface/IChatHud.java:11`

```java
void meteor$add(Text message, int id)
```

## meteordevelopment.meteorclient.mixininterface.IChatHudLine

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixininterface/IChatHudLine.java:10`

```java
public interface IChatHudLine
```

## meteordevelopment.meteorclient.mixininterface.IChatHudLine.meteor$getText

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixininterface/IChatHudLine.java:11`

```java
String meteor$getText()
```

## meteordevelopment.meteorclient.mixininterface.IChatHudLine.meteor$getId

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixininterface/IChatHudLine.java:13`

```java
int meteor$getId()
```

## meteordevelopment.meteorclient.mixininterface.IChatHudLine.meteor$setId

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixininterface/IChatHudLine.java:15`

```java
void meteor$setId(int id)
```

## meteordevelopment.meteorclient.mixininterface.IChatHudLine.meteor$getSender

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixininterface/IChatHudLine.java:17`

```java
GameProfile meteor$getSender()
```

## meteordevelopment.meteorclient.mixininterface.IChatHudLine.meteor$setSender

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixininterface/IChatHudLine.java:19`

```java
void meteor$setSender(GameProfile profile)
```

## meteordevelopment.meteorclient.mixininterface.IChatHudLineVisible

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixininterface/IChatHudLineVisible.java:8`

```java
public interface IChatHudLineVisible extends IChatHudLine
```

## meteordevelopment.meteorclient.mixininterface.IChatHudLineVisible.meteor$isStartOfEntry

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixininterface/IChatHudLineVisible.java:9`

```java
boolean meteor$isStartOfEntry()
```

## meteordevelopment.meteorclient.mixininterface.IChatHudLineVisible.meteor$setStartOfEntry

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixininterface/IChatHudLineVisible.java:10`

```java
void meteor$setStartOfEntry(boolean start)
```

## meteordevelopment.meteorclient.mixininterface.IClientPlayerInteractionManager

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixininterface/IClientPlayerInteractionManager.java:8`

```java
public interface IClientPlayerInteractionManager
```

## meteordevelopment.meteorclient.mixininterface.IClientPlayerInteractionManager.meteor$syncSelected

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixininterface/IClientPlayerInteractionManager.java:9`

```java
void meteor$syncSelected()
```

## meteordevelopment.meteorclient.mixininterface.IEntityRenderState

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixininterface/IEntityRenderState.java:13`

```java
public interface IEntityRenderState
```

## meteordevelopment.meteorclient.mixininterface.IEntityRenderState.meteor$getEntity

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixininterface/IEntityRenderState.java:26`

```java
@Nullable(value = "EntityCulling mod can prevent the code that sets the entity from running") Entity meteor$getEntity()
```

## meteordevelopment.meteorclient.mixininterface.IEntityRenderState.meteor$setEntity

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixininterface/IEntityRenderState.java:29`

```java
void meteor$setEntity(Entity entity)
```

## meteordevelopment.meteorclient.mixininterface.IExplosionS2CPacket

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixininterface/IExplosionS2CPacket.java:8`

```java
public interface IExplosionS2CPacket
```

## meteordevelopment.meteorclient.mixininterface.IExplosionS2CPacket.meteor$setVelocityX

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixininterface/IExplosionS2CPacket.java:9`

```java
void meteor$setVelocityX(float velocity)
```

## meteordevelopment.meteorclient.mixininterface.IExplosionS2CPacket.meteor$setVelocityY

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixininterface/IExplosionS2CPacket.java:11`

```java
void meteor$setVelocityY(float velocity)
```

## meteordevelopment.meteorclient.mixininterface.IExplosionS2CPacket.meteor$setVelocityZ

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixininterface/IExplosionS2CPacket.java:13`

```java
void meteor$setVelocityZ(float velocity)
```

## meteordevelopment.meteorclient.mixininterface.IGameRenderer

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixininterface/IGameRenderer.java:8`

```java
public interface IGameRenderer
```

## meteordevelopment.meteorclient.mixininterface.IGameRenderer.meteor$flushGuiState

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixininterface/IGameRenderer.java:9`

```java
void meteor$flushGuiState()
```

## meteordevelopment.meteorclient.mixininterface.IGpuDevice

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixininterface/IGpuDevice.java:10`

```java
public interface IGpuDevice
```

## meteordevelopment.meteorclient.mixininterface.IGpuDevice.meteor$pushScissor

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixininterface/IGpuDevice.java:14`

```java
void meteor$pushScissor(int x, int y, int width, int height)
```

## meteordevelopment.meteorclient.mixininterface.IGpuDevice.meteor$popScissor

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixininterface/IGpuDevice.java:16`

```java
void meteor$popScissor()
```

## meteordevelopment.meteorclient.mixininterface.IGpuDevice.meteor$onCreateRenderPass

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixininterface/IGpuDevice.java:21`

```java
@Deprecated @SuppressWarnings("DeprecatedIsStillUsed") void meteor$onCreateRenderPass(RenderPass pass)
```

## meteordevelopment.meteorclient.mixininterface.IMessageHandler

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixininterface/IMessageHandler.java:13`

```java
public interface IMessageHandler
```

## meteordevelopment.meteorclient.mixininterface.IMessageHandler.meteor$getSender

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixininterface/IMessageHandler.java:15`

```java
GameProfile meteor$getSender()
```

## meteordevelopment.meteorclient.mixininterface.IMinecraftClient

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixininterface/IMinecraftClient.java:10`

```java
public interface IMinecraftClient
```

## meteordevelopment.meteorclient.mixininterface.IMinecraftClient.meteor$rightClick

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixininterface/IMinecraftClient.java:11`

```java
void meteor$rightClick()
```

## meteordevelopment.meteorclient.mixininterface.IMinecraftClient.meteor$setFramebuffer

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixininterface/IMinecraftClient.java:13`

```java
void meteor$setFramebuffer(Framebuffer framebuffer)
```

## meteordevelopment.meteorclient.mixininterface.IPlayerInteractEntityC2SPacket

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixininterface/IPlayerInteractEntityC2SPacket.java:11`

```java
public interface IPlayerInteractEntityC2SPacket
```

## meteordevelopment.meteorclient.mixininterface.IPlayerInteractEntityC2SPacket.meteor$getType

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixininterface/IPlayerInteractEntityC2SPacket.java:12`

```java
PlayerInteractEntityC2SPacket.InteractType meteor$getType()
```

## meteordevelopment.meteorclient.mixininterface.IPlayerInteractEntityC2SPacket.meteor$getEntity

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixininterface/IPlayerInteractEntityC2SPacket.java:14`

```java
Entity meteor$getEntity()
```

## meteordevelopment.meteorclient.mixininterface.IPlayerMoveC2SPacket

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixininterface/IPlayerMoveC2SPacket.java:8`

```java
public interface IPlayerMoveC2SPacket
```

## meteordevelopment.meteorclient.mixininterface.IPlayerMoveC2SPacket.meteor$getTag

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixininterface/IPlayerMoveC2SPacket.java:9`

```java
int meteor$getTag()
```

## meteordevelopment.meteorclient.mixininterface.IPlayerMoveC2SPacket.meteor$setTag

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixininterface/IPlayerMoveC2SPacket.java:11`

```java
void meteor$setTag(int tag)
```

## meteordevelopment.meteorclient.mixininterface.IRaycastContext

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixininterface/IRaycastContext.java:12`

```java
public interface IRaycastContext
```

## meteordevelopment.meteorclient.mixininterface.IRaycastContext.meteor$set

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixininterface/IRaycastContext.java:13`

```java
void meteor$set(Vec3d start, Vec3d end, RaycastContext.ShapeType shapeType, RaycastContext.FluidHandling fluidHandling, Entity entity)
```

## meteordevelopment.meteorclient.mixininterface.IRenderPipeline

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixininterface/IRenderPipeline.java:8`

```java
public interface IRenderPipeline
```

## meteordevelopment.meteorclient.mixininterface.IRenderPipeline.meteor$setLineSmooth

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixininterface/IRenderPipeline.java:9`

```java
void meteor$setLineSmooth(boolean lineSmooth)
```

## meteordevelopment.meteorclient.mixininterface.IRenderPipeline.meteor$getLineSmooth

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixininterface/IRenderPipeline.java:11`

```java
boolean meteor$getLineSmooth()
```

## meteordevelopment.meteorclient.mixininterface.ISimpleOption

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixininterface/ISimpleOption.java:8`

```java
public interface ISimpleOption
```

## meteordevelopment.meteorclient.mixininterface.ISimpleOption.meteor$set

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixininterface/ISimpleOption.java:9`

```java
void meteor$set(Object value)
```

## meteordevelopment.meteorclient.mixininterface.ISlot

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixininterface/ISlot.java:8`

```java
public interface ISlot
```

## meteordevelopment.meteorclient.mixininterface.ISlot.meteor$getId

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixininterface/ISlot.java:9`

```java
int meteor$getId()
```

## meteordevelopment.meteorclient.mixininterface.ISlot.meteor$getIndex

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixininterface/ISlot.java:11`

```java
int meteor$getIndex()
```

## meteordevelopment.meteorclient.mixininterface.IText

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixininterface/IText.java:8`

```java
public interface IText
```

## meteordevelopment.meteorclient.mixininterface.IText.meteor$invalidateCache

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixininterface/IText.java:9`

```java
void meteor$invalidateCache()
```

## meteordevelopment.meteorclient.mixininterface.IVec3d

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixininterface/IVec3d.java:12`

```java
@SuppressWarnings("UnusedReturnValue") public interface IVec3d
```

## meteordevelopment.meteorclient.mixininterface.IVec3d.meteor$set

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixininterface/IVec3d.java:14`

```java
Vec3d meteor$set(double x, double y, double z)
```

## meteordevelopment.meteorclient.mixininterface.IVec3d.meteor$set

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixininterface/IVec3d.java:16`

```java
default Vec3d meteor$set(Vec3i vec)
```

## meteordevelopment.meteorclient.mixininterface.IVec3d.meteor$set

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixininterface/IVec3d.java:20`

```java
default Vec3d meteor$set(Vector3d vec)
```

## meteordevelopment.meteorclient.mixininterface.IVec3d.meteor$set

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixininterface/IVec3d.java:24`

```java
default Vec3d meteor$set(Vec3d pos)
```

## meteordevelopment.meteorclient.mixininterface.IVec3d.meteor$setXZ

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixininterface/IVec3d.java:28`

```java
Vec3d meteor$setXZ(double x, double z)
```

## meteordevelopment.meteorclient.mixininterface.IVec3d.meteor$setY

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixininterface/IVec3d.java:30`

```java
Vec3d meteor$setY(double y)
```

## meteordevelopment.meteorclient.mixininterface.IWorldRenderer

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixininterface/IWorldRenderer.java:10`

```java
public interface IWorldRenderer
```

## meteordevelopment.meteorclient.mixininterface.IWorldRenderer.meteor$pushEntityOutlineFramebuffer

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixininterface/IWorldRenderer.java:11`

```java
void meteor$pushEntityOutlineFramebuffer(Framebuffer framebuffer)
```

## meteordevelopment.meteorclient.mixininterface.IWorldRenderer.meteor$popEntityOutlineFramebuffer

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/mixininterface/IWorldRenderer.java:13`

```java
void meteor$popEntityOutlineFramebuffer()
```
