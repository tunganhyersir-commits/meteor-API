# mixininterface

Khai báo Java có cú pháp public/protected. Không bao gồm API kế thừa/tổng hợp bởi compiler; xem kiểm tra bytecode riêng.

## meteordevelopment.meteorclient.mixininterface.IAABB

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixininterface/IAABB.java:10`

```java
public interface IAABB
```

## meteordevelopment.meteorclient.mixininterface.IAABB.meteor$expand

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixininterface/IAABB.java:11`

```java
void meteor$expand(double v)
```

## meteordevelopment.meteorclient.mixininterface.IAABB.meteor$set

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixininterface/IAABB.java:13`

```java
void meteor$set(double x1, double y1, double z1, double x2, double y2, double z2)
```

## meteordevelopment.meteorclient.mixininterface.IAABB.meteor$set

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixininterface/IAABB.java:15`

```java
default void meteor$set(BlockPos pos)
```

## meteordevelopment.meteorclient.mixininterface.IAbstractFurnaceMenu

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixininterface/IAbstractFurnaceMenu.java:10`

```java
public interface IAbstractFurnaceMenu
```

## meteordevelopment.meteorclient.mixininterface.IAbstractFurnaceMenu.meteor$canSmelt

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixininterface/IAbstractFurnaceMenu.java:11`

```java
boolean meteor$canSmelt(ItemStack itemStack)
```

## meteordevelopment.meteorclient.mixininterface.ICamera

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixininterface/ICamera.java:8`

```java
public interface ICamera
```

## meteordevelopment.meteorclient.mixininterface.ICamera.meteor$setRot

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixininterface/ICamera.java:9`

```java
void meteor$setRot(double yaw, double pitch)
```

## meteordevelopment.meteorclient.mixininterface.IChatHud

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixininterface/IChatHud.java:10`

```java
public interface IChatHud
```

## meteordevelopment.meteorclient.mixininterface.IChatHud.meteor$add

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixininterface/IChatHud.java:11`

```java
void meteor$add(Component message, int id)
```

## meteordevelopment.meteorclient.mixininterface.IChatListener

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixininterface/IChatListener.java:14`

```java
public interface IChatListener
```

## meteordevelopment.meteorclient.mixininterface.IChatListener.meteor$getSender

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixininterface/IChatListener.java:18`

```java
GameProfile meteor$getSender()
```

## meteordevelopment.meteorclient.mixininterface.IClientboundExplodePacket

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixininterface/IClientboundExplodePacket.java:8`

```java
public interface IClientboundExplodePacket
```

## meteordevelopment.meteorclient.mixininterface.IClientboundExplodePacket.meteor$setVelocityX

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixininterface/IClientboundExplodePacket.java:9`

```java
void meteor$setVelocityX(float velocity)
```

## meteordevelopment.meteorclient.mixininterface.IClientboundExplodePacket.meteor$setVelocityY

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixininterface/IClientboundExplodePacket.java:11`

```java
void meteor$setVelocityY(float velocity)
```

## meteordevelopment.meteorclient.mixininterface.IClientboundExplodePacket.meteor$setVelocityZ

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixininterface/IClientboundExplodePacket.java:13`

```java
void meteor$setVelocityZ(float velocity)
```

## meteordevelopment.meteorclient.mixininterface.IClipContext

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixininterface/IClipContext.java:12`

```java
public interface IClipContext
```

## meteordevelopment.meteorclient.mixininterface.IClipContext.meteor$set

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixininterface/IClipContext.java:13`

```java
void meteor$set(Vec3 start, Vec3 end, ClipContext.Block shapeType, ClipContext.Fluid fluidHandling, Entity entity)
```

## meteordevelopment.meteorclient.mixininterface.IComponent

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixininterface/IComponent.java:8`

```java
public interface IComponent
```

## meteordevelopment.meteorclient.mixininterface.IComponent.meteor$invalidateCache

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixininterface/IComponent.java:9`

```java
void meteor$invalidateCache()
```

## meteordevelopment.meteorclient.mixininterface.IEntityRenderState

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixininterface/IEntityRenderState.java:13`

```java
public interface IEntityRenderState
```

## meteordevelopment.meteorclient.mixininterface.IEntityRenderState.meteor$getEntity

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixininterface/IEntityRenderState.java:25`

```java
@Nullable // "EntityCulling mod can prevent the code that sets the entity from running" Entity meteor$getEntity()
```

## meteordevelopment.meteorclient.mixininterface.IEntityRenderState.meteor$setEntity

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixininterface/IEntityRenderState.java:28`

```java
void meteor$setEntity(Entity entity)
```

## meteordevelopment.meteorclient.mixininterface.IGpuDevice

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixininterface/IGpuDevice.java:11`

```java
public interface IGpuDevice
```

## meteordevelopment.meteorclient.mixininterface.IGpuDevice.meteor$pushScissor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixininterface/IGpuDevice.java:15`

```java
void meteor$pushScissor(int x, int y, int width, int height)
```

## meteordevelopment.meteorclient.mixininterface.IGpuDevice.meteor$popScissor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixininterface/IGpuDevice.java:17`

```java
void meteor$popScissor()
```

## meteordevelopment.meteorclient.mixininterface.IGpuDevice.meteor$onCreateRenderPass

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixininterface/IGpuDevice.java:22`

```java
@Deprecated @SuppressWarnings("DeprecatedIsStillUsed") void meteor$onCreateRenderPass(RenderPassBackend backend)
```

## meteordevelopment.meteorclient.mixininterface.IGuiMessage

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixininterface/IGuiMessage.java:10`

```java
public interface IGuiMessage
```

## meteordevelopment.meteorclient.mixininterface.IGuiMessage.meteor$getText

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixininterface/IGuiMessage.java:11`

```java
String meteor$getText()
```

## meteordevelopment.meteorclient.mixininterface.IGuiMessage.meteor$getId

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixininterface/IGuiMessage.java:13`

```java
int meteor$getId()
```

## meteordevelopment.meteorclient.mixininterface.IGuiMessage.meteor$setId

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixininterface/IGuiMessage.java:15`

```java
void meteor$setId(int id)
```

## meteordevelopment.meteorclient.mixininterface.IGuiMessage.meteor$getSender

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixininterface/IGuiMessage.java:17`

```java
GameProfile meteor$getSender()
```

## meteordevelopment.meteorclient.mixininterface.IGuiMessage.meteor$setSender

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixininterface/IGuiMessage.java:19`

```java
void meteor$setSender(GameProfile profile)
```

## meteordevelopment.meteorclient.mixininterface.IGuiMessageVisible

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixininterface/IGuiMessageVisible.java:8`

```java
public interface IGuiMessageVisible extends IGuiMessage
```

## meteordevelopment.meteorclient.mixininterface.IGuiMessageVisible.meteor$isStartOfEntry

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixininterface/IGuiMessageVisible.java:9`

```java
boolean meteor$isStartOfEntry()
```

## meteordevelopment.meteorclient.mixininterface.IGuiMessageVisible.meteor$setStartOfEntry

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixininterface/IGuiMessageVisible.java:11`

```java
void meteor$setStartOfEntry(boolean start)
```

## meteordevelopment.meteorclient.mixininterface.ILevelRenderer

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixininterface/ILevelRenderer.java:10`

```java
public interface ILevelRenderer
```

## meteordevelopment.meteorclient.mixininterface.ILevelRenderer.meteor$pushEntityOutlineFramebuffer

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixininterface/ILevelRenderer.java:11`

```java
void meteor$pushEntityOutlineFramebuffer(RenderTarget framebuffer)
```

## meteordevelopment.meteorclient.mixininterface.ILevelRenderer.meteor$popEntityOutlineFramebuffer

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixininterface/ILevelRenderer.java:13`

```java
void meteor$popEntityOutlineFramebuffer()
```

## meteordevelopment.meteorclient.mixininterface.IMinecraft

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixininterface/IMinecraft.java:8`

```java
public interface IMinecraft
```

## meteordevelopment.meteorclient.mixininterface.IMinecraft.meteor$rightClick

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixininterface/IMinecraft.java:9`

```java
void meteor$rightClick()
```

## meteordevelopment.meteorclient.mixininterface.IMultiPlayerGameMode

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixininterface/IMultiPlayerGameMode.java:8`

```java
public interface IMultiPlayerGameMode
```

## meteordevelopment.meteorclient.mixininterface.IMultiPlayerGameMode.meteor$syncSelected

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixininterface/IMultiPlayerGameMode.java:9`

```java
void meteor$syncSelected()
```

## meteordevelopment.meteorclient.mixininterface.IOptionInstance

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixininterface/IOptionInstance.java:8`

```java
public interface IOptionInstance
```

## meteordevelopment.meteorclient.mixininterface.IOptionInstance.meteor$set

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixininterface/IOptionInstance.java:9`

```java
void meteor$set(Object value)
```

## meteordevelopment.meteorclient.mixininterface.IRenderPipeline

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixininterface/IRenderPipeline.java:8`

```java
public interface IRenderPipeline
```

## meteordevelopment.meteorclient.mixininterface.IRenderPipeline.meteor$setLineSmooth

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixininterface/IRenderPipeline.java:9`

```java
void meteor$setLineSmooth(boolean lineSmooth)
```

## meteordevelopment.meteorclient.mixininterface.IRenderPipeline.meteor$getLineSmooth

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixininterface/IRenderPipeline.java:11`

```java
boolean meteor$getLineSmooth()
```

## meteordevelopment.meteorclient.mixininterface.IServerboundMovePlayerPacket

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixininterface/IServerboundMovePlayerPacket.java:8`

```java
public interface IServerboundMovePlayerPacket
```

## meteordevelopment.meteorclient.mixininterface.IServerboundMovePlayerPacket.meteor$getTag

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixininterface/IServerboundMovePlayerPacket.java:9`

```java
int meteor$getTag()
```

## meteordevelopment.meteorclient.mixininterface.IServerboundMovePlayerPacket.meteor$setTag

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixininterface/IServerboundMovePlayerPacket.java:11`

```java
void meteor$setTag(int tag)
```

## meteordevelopment.meteorclient.mixininterface.ISlot

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixininterface/ISlot.java:8`

```java
public interface ISlot
```

## meteordevelopment.meteorclient.mixininterface.ISlot.meteor$getIndex

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixininterface/ISlot.java:9`

```java
int meteor$getIndex()
```

## meteordevelopment.meteorclient.mixininterface.ISlot.meteor$getSlot

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixininterface/ISlot.java:11`

```java
int meteor$getSlot()
```

## meteordevelopment.meteorclient.mixininterface.IVec3

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixininterface/IVec3.java:12`

```java
@SuppressWarnings("UnusedReturnValue") public interface IVec3
```

## meteordevelopment.meteorclient.mixininterface.IVec3.meteor$set

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixininterface/IVec3.java:14`

```java
Vec3 meteor$set(double x, double y, double z)
```

## meteordevelopment.meteorclient.mixininterface.IVec3.meteor$set

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixininterface/IVec3.java:16`

```java
default Vec3 meteor$set(Vec3i vec)
```

## meteordevelopment.meteorclient.mixininterface.IVec3.meteor$set

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixininterface/IVec3.java:20`

```java
default Vec3 meteor$set(Vector3d vec)
```

## meteordevelopment.meteorclient.mixininterface.IVec3.meteor$set

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixininterface/IVec3.java:24`

```java
default Vec3 meteor$set(Vec3 pos)
```

## meteordevelopment.meteorclient.mixininterface.IVec3.meteor$setXZ

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixininterface/IVec3.java:28`

```java
Vec3 meteor$setXZ(double x, double z)
```

## meteordevelopment.meteorclient.mixininterface.IVec3.meteor$setY

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixininterface/IVec3.java:30`

```java
Vec3 meteor$setY(double y)
```
