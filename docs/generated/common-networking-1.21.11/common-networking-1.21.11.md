# common-networking-1.21.11

Khai báo Java có cú pháp public/protected. Không bao gồm API kế thừa/tổng hợp bởi compiler; xem kiểm tra bytecode riêng.

## commonnetwork.CommonNetworkMod

Nguồn: `upstream/common-networking-1.21.11/common/src/main/java/commonnetwork/CommonNetworkMod.java:16`

```java
public class CommonNetworkMod
```

## commonnetwork.CommonNetworkMod.INSTANCE

Nguồn: `upstream/common-networking-1.21.11/common/src/main/java/commonnetwork/CommonNetworkMod.java:20`

```java
public static CommonNetworkMod INSTANCE
```

## commonnetwork.CommonNetworkMod.CommonNetworkMod

Nguồn: `upstream/common-networking-1.21.11/common/src/main/java/commonnetwork/CommonNetworkMod.java:22`

```java
public CommonNetworkMod(PacketRegistrationHandler packetRegistration)
```

## commonnetwork.CommonNetworkMod.registerPacket

Nguồn: `upstream/common-networking-1.21.11/common/src/main/java/commonnetwork/CommonNetworkMod.java:43`

```java
@Deprecated(forRemoval = true) public static <T> PacketRegistrar registerPacket(Identifier packetIdentifier, Class<T> packetClass, BiConsumer<T, FriendlyByteBuf> encoder, Function<FriendlyByteBuf, T> decoder, Consumer<PacketContext<T>> handler)
```

## commonnetwork.CommonNetworkMod.registerPacket

Nguồn: `upstream/common-networking-1.21.11/common/src/main/java/commonnetwork/CommonNetworkMod.java:56`

```java
public static <T> PacketRegistrar registerPacket(CustomPacketPayload.Type<? extends CustomPacketPayload> type, Class<T> packetClass, StreamCodec<? extends FriendlyByteBuf, T> codec, Consumer<PacketContext<T>> handler)
```

## commonnetwork.CommonNetworkMod.registerConfigurationPacket

Nguồn: `upstream/common-networking-1.21.11/common/src/main/java/commonnetwork/CommonNetworkMod.java:68`

```java
public static <T> PacketRegistrar registerConfigurationPacket(CustomPacketPayload.Type<? extends CustomPacketPayload> type, Class<T> packetClass, StreamCodec<? extends FriendlyByteBuf, T> codec, Consumer<PacketContext<T>> handler)
```

## commonnetwork.CommonNetworkMod.getPacketRegistration

Nguồn: `upstream/common-networking-1.21.11/common/src/main/java/commonnetwork/CommonNetworkMod.java:80`

```java
public PacketRegistrationHandler getPacketRegistration()
```

## commonnetwork.Constants

Nguồn: `upstream/common-networking-1.21.11/common/src/main/java/commonnetwork/Constants.java:6`

```java
public class Constants
```

## commonnetwork.Constants.MOD_ID

Nguồn: `upstream/common-networking-1.21.11/common/src/main/java/commonnetwork/Constants.java:9`

```java
public static final String MOD_ID = "commonnetworking"
```

## commonnetwork.Constants.MOD_NAME

Nguồn: `upstream/common-networking-1.21.11/common/src/main/java/commonnetwork/Constants.java:10`

```java
public static final String MOD_NAME = "Common Networking"
```

## commonnetwork.Constants.LOG

Nguồn: `upstream/common-networking-1.21.11/common/src/main/java/commonnetwork/Constants.java:11`

```java
public static final Logger LOG = LoggerFactory.getLogger(MOD_NAME)
```

## commonnetwork.api.Dispatcher

Nguồn: `upstream/common-networking-1.21.11/common/src/main/java/commonnetwork/api/Dispatcher.java:14`

```java
public class Dispatcher
```

## commonnetwork.api.Dispatcher.sendToServer

Nguồn: `upstream/common-networking-1.21.11/common/src/main/java/commonnetwork/api/Dispatcher.java:22`

```java
public static <T> void sendToServer(T packet)
```

## commonnetwork.api.Dispatcher.sendToServer

Nguồn: `upstream/common-networking-1.21.11/common/src/main/java/commonnetwork/api/Dispatcher.java:35`

```java
public static <T> void sendToServer(T packet, boolean ignoreCheck)
```

## commonnetwork.api.Dispatcher.send

Nguồn: `upstream/common-networking-1.21.11/common/src/main/java/commonnetwork/api/Dispatcher.java:47`

```java
public static <T> void send(T packet, Connection connection)
```

## commonnetwork.api.Dispatcher.sendToClient

Nguồn: `upstream/common-networking-1.21.11/common/src/main/java/commonnetwork/api/Dispatcher.java:59`

```java
public static <T> void sendToClient(T packet, ServerPlayer player)
```

## commonnetwork.api.Dispatcher.sendToClients

Nguồn: `upstream/common-networking-1.21.11/common/src/main/java/commonnetwork/api/Dispatcher.java:71`

```java
public static <T> void sendToClients(T packet, List<ServerPlayer> players)
```

## commonnetwork.api.Dispatcher.sendToAllClients

Nguồn: `upstream/common-networking-1.21.11/common/src/main/java/commonnetwork/api/Dispatcher.java:86`

```java
public static <T> void sendToAllClients(T packet, MinecraftServer server)
```

## commonnetwork.api.Dispatcher.sendToClientsInLevel

Nguồn: `upstream/common-networking-1.21.11/common/src/main/java/commonnetwork/api/Dispatcher.java:98`

```java
public static <T> void sendToClientsInLevel(T packet, ServerLevel level)
```

## commonnetwork.api.Dispatcher.sendToClientsLoadingChunk

Nguồn: `upstream/common-networking-1.21.11/common/src/main/java/commonnetwork/api/Dispatcher.java:110`

```java
public static <T> void sendToClientsLoadingChunk(T packet, LevelChunk chunk)
```

## commonnetwork.api.Dispatcher.sendToClientsLoadingPos

Nguồn: `upstream/common-networking-1.21.11/common/src/main/java/commonnetwork/api/Dispatcher.java:125`

```java
public static <T> void sendToClientsLoadingPos(T packet, ServerLevel level, ChunkPos pos)
```

## commonnetwork.api.Dispatcher.sendToClientsLoadingPos

Nguồn: `upstream/common-networking-1.21.11/common/src/main/java/commonnetwork/api/Dispatcher.java:138`

```java
public static <T> void sendToClientsLoadingPos(T packet, ServerLevel level, BlockPos pos)
```

## commonnetwork.api.Dispatcher.sendToClientsInRange

Nguồn: `upstream/common-networking-1.21.11/common/src/main/java/commonnetwork/api/Dispatcher.java:152`

```java
public static <T> void sendToClientsInRange(T packet, ServerLevel level, BlockPos pos, double range)
```

## commonnetwork.api.Network

Nguồn: `upstream/common-networking-1.21.11/common/src/main/java/commonnetwork/api/Network.java:15`

```java
public class Network
```

## commonnetwork.api.Network.registerPacket

Nguồn: `upstream/common-networking-1.21.11/common/src/main/java/commonnetwork/api/Network.java:29`

```java
@Deprecated(forRemoval = true) public static <T> PacketRegistrar registerPacket(Identifier packetIdentifier, Class<T> packetClass, BiConsumer<T, FriendlyByteBuf> encoder, Function<FriendlyByteBuf, T> decoder, Consumer<PacketContext<T>> handler)
```

## commonnetwork.api.Network.registerPacket

Nguồn: `upstream/common-networking-1.21.11/common/src/main/java/commonnetwork/api/Network.java:45`

```java
public static <T> PacketRegistrar registerPacket(CustomPacketPayload.Type<? extends CustomPacketPayload> type, Class<T> packetClass, StreamCodec<? extends FriendlyByteBuf, T> codec, Consumer<PacketContext<T>> handler)
```

## commonnetwork.api.Network.registerConfigurationPacket

Nguồn: `upstream/common-networking-1.21.11/common/src/main/java/commonnetwork/api/Network.java:60`

```java
public static <T> PacketRegistrar registerConfigurationPacket(CustomPacketPayload.Type<? extends CustomPacketPayload> type, Class<T> packetClass, StreamCodec<? extends FriendlyByteBuf, T> codec, Consumer<PacketContext<T>> handler)
```

## commonnetwork.api.Network.getNetworkHandler

Nguồn: `upstream/common-networking-1.21.11/common/src/main/java/commonnetwork/api/Network.java:70`

```java
public static NetworkHandler getNetworkHandler()
```

## commonnetwork.api.NetworkHandler

Nguồn: `upstream/common-networking-1.21.11/common/src/main/java/commonnetwork/api/NetworkHandler.java:17`

```java
public interface NetworkHandler
```

## commonnetwork.api.NetworkHandler.sendToServer

Nguồn: `upstream/common-networking-1.21.11/common/src/main/java/commonnetwork/api/NetworkHandler.java:25`

```java
default <T> void sendToServer(T packet)
```

## commonnetwork.api.NetworkHandler.sendToServer

Nguồn: `upstream/common-networking-1.21.11/common/src/main/java/commonnetwork/api/NetworkHandler.java:38`

```java
<T> void sendToServer(T packet, boolean ignoreCheck)
```

## commonnetwork.api.NetworkHandler.sendToClient

Nguồn: `upstream/common-networking-1.21.11/common/src/main/java/commonnetwork/api/NetworkHandler.java:48`

```java
default <T> void sendToClient(T packet, ServerPlayer player)
```

## commonnetwork.api.NetworkHandler.sendToClient

Nguồn: `upstream/common-networking-1.21.11/common/src/main/java/commonnetwork/api/NetworkHandler.java:61`

```java
<T> void sendToClient(T packet, ServerPlayer player, boolean ignoreCheck)
```

## commonnetwork.api.NetworkHandler.send

Nguồn: `upstream/common-networking-1.21.11/common/src/main/java/commonnetwork/api/NetworkHandler.java:70`

```java
<T> void send(T packet, Connection connection)
```

## commonnetwork.api.NetworkHandler.getRawClientboundPacket

Nguồn: `upstream/common-networking-1.21.11/common/src/main/java/commonnetwork/api/NetworkHandler.java:79`

```java
<T> @Nullable ClientboundCustomPayloadPacket getRawClientboundPacket(T packet)
```

## commonnetwork.api.NetworkHandler.getRawServerboundPacket

Nguồn: `upstream/common-networking-1.21.11/common/src/main/java/commonnetwork/api/NetworkHandler.java:88`

```java
<T> @Nullable ServerboundCustomPayloadPacket getRawServerboundPacket(T packet)
```

## commonnetwork.api.NetworkHandler.sendToClients

Nguồn: `upstream/common-networking-1.21.11/common/src/main/java/commonnetwork/api/NetworkHandler.java:97`

```java
default <T> void sendToClients(T packet, List<ServerPlayer> players)
```

## commonnetwork.api.NetworkHandler.sendToClients

Nguồn: `upstream/common-networking-1.21.11/common/src/main/java/commonnetwork/api/NetworkHandler.java:110`

```java
default <T> void sendToClients(T packet, List<ServerPlayer> players, boolean ignoreCheck)
```

## commonnetwork.api.NetworkHandler.sendToAllClients

Nguồn: `upstream/common-networking-1.21.11/common/src/main/java/commonnetwork/api/NetworkHandler.java:125`

```java
default <T> void sendToAllClients(T packet, MinecraftServer server)
```

## commonnetwork.api.NetworkHandler.sendToAllClients

Nguồn: `upstream/common-networking-1.21.11/common/src/main/java/commonnetwork/api/NetworkHandler.java:138`

```java
default <T> void sendToAllClients(T packet, MinecraftServer server, boolean ignoreCheck)
```

## commonnetwork.api.NetworkHandler.sendToClientsInLevel

Nguồn: `upstream/common-networking-1.21.11/common/src/main/java/commonnetwork/api/NetworkHandler.java:150`

```java
default <T> void sendToClientsInLevel(T packet, ServerLevel level)
```

## commonnetwork.api.NetworkHandler.sendToClientsInLevel

Nguồn: `upstream/common-networking-1.21.11/common/src/main/java/commonnetwork/api/NetworkHandler.java:163`

```java
default <T> void sendToClientsInLevel(T packet, ServerLevel level, boolean ignoreCheck)
```

## commonnetwork.api.NetworkHandler.sendToClientsLoadingChunk

Nguồn: `upstream/common-networking-1.21.11/common/src/main/java/commonnetwork/api/NetworkHandler.java:176`

```java
default <T> void sendToClientsLoadingChunk(T packet, LevelChunk chunk)
```

## commonnetwork.api.NetworkHandler.sendToClientsLoadingChunk

Nguồn: `upstream/common-networking-1.21.11/common/src/main/java/commonnetwork/api/NetworkHandler.java:189`

```java
default <T> void sendToClientsLoadingChunk(T packet, LevelChunk chunk, boolean ignoreCheck)
```

## commonnetwork.api.NetworkHandler.sendToClientsLoadingPos

Nguồn: `upstream/common-networking-1.21.11/common/src/main/java/commonnetwork/api/NetworkHandler.java:203`

```java
default <T> void sendToClientsLoadingPos(T packet, ServerLevel level, ChunkPos pos)
```

## commonnetwork.api.NetworkHandler.sendToClientsLoadingPos

Nguồn: `upstream/common-networking-1.21.11/common/src/main/java/commonnetwork/api/NetworkHandler.java:217`

```java
default <T> void sendToClientsLoadingPos(T packet, ServerLevel level, ChunkPos pos, boolean ignoreCheck)
```

## commonnetwork.api.NetworkHandler.sendToClientsLoadingPos

Nguồn: `upstream/common-networking-1.21.11/common/src/main/java/commonnetwork/api/NetworkHandler.java:230`

```java
default <T> void sendToClientsLoadingPos(T packet, ServerLevel level, BlockPos pos)
```

## commonnetwork.api.NetworkHandler.sendToClientsLoadingPos

Nguồn: `upstream/common-networking-1.21.11/common/src/main/java/commonnetwork/api/NetworkHandler.java:244`

```java
default <T> void sendToClientsLoadingPos(T packet, ServerLevel level, BlockPos pos, boolean ignoreCheck)
```

## commonnetwork.api.NetworkHandler.sendToClientsInRange

Nguồn: `upstream/common-networking-1.21.11/common/src/main/java/commonnetwork/api/NetworkHandler.java:258`

```java
default <T> void sendToClientsInRange(T packet, ServerLevel level, BlockPos pos, double range)
```

## commonnetwork.api.NetworkHandler.sendToClientsInRange

Nguồn: `upstream/common-networking-1.21.11/common/src/main/java/commonnetwork/api/NetworkHandler.java:273`

```java
default <T> void sendToClientsInRange(T packet, ServerLevel level, BlockPos pos, double range, boolean ignoreCheck)
```

## commonnetwork.networking.DelayedPacketRegistrationHandler

Nguồn: `upstream/common-networking-1.21.11/common/src/main/java/commonnetwork/networking/DelayedPacketRegistrationHandler.java:17`

```java
public class DelayedPacketRegistrationHandler implements PacketRegistrar
```

## commonnetwork.networking.DelayedPacketRegistrationHandler.DelayedPacketRegistrationHandler

Nguồn: `upstream/common-networking-1.21.11/common/src/main/java/commonnetwork/networking/DelayedPacketRegistrationHandler.java:22`

```java
public DelayedPacketRegistrationHandler()
```

## commonnetwork.networking.DelayedPacketRegistrationHandler.getSide

Nguồn: `upstream/common-networking-1.21.11/common/src/main/java/commonnetwork/networking/DelayedPacketRegistrationHandler.java:27`

```java
@Override public Side getSide()
```

## commonnetwork.networking.DelayedPacketRegistrationHandler.registerPacket

Nguồn: `upstream/common-networking-1.21.11/common/src/main/java/commonnetwork/networking/DelayedPacketRegistrationHandler.java:33`

```java
@Override public <T> PacketRegistrar registerPacket(Identifier id, Class<T> packetClass, BiConsumer<T, FriendlyByteBuf> encoder, Function<FriendlyByteBuf, T> decoder, Consumer<PacketContext<T>> handler)
```

## commonnetwork.networking.DelayedPacketRegistrationHandler.registerPacket

Nguồn: `upstream/common-networking-1.21.11/common/src/main/java/commonnetwork/networking/DelayedPacketRegistrationHandler.java:41`

```java
@Override public <T> PacketRegistrar registerPacket(CustomPacketPayload.Type<? extends CustomPacketPayload> type, Class<T> packetClass, StreamCodec<? extends FriendlyByteBuf, T> codec, Consumer<PacketContext<T>> handler)
```

## commonnetwork.networking.DelayedPacketRegistrationHandler.registerConfigurationPacket

Nguồn: `upstream/common-networking-1.21.11/common/src/main/java/commonnetwork/networking/DelayedPacketRegistrationHandler.java:49`

```java
@Override public <T> PacketRegistrar registerConfigurationPacket(CustomPacketPayload.Type<? extends CustomPacketPayload> type, Class<T> packetClass, StreamCodec<? extends FriendlyByteBuf, T> codec, Consumer<PacketContext<T>> handler)
```

## commonnetwork.networking.DelayedPacketRegistrationHandler.registerQueuedPackets

Nguồn: `upstream/common-networking-1.21.11/common/src/main/java/commonnetwork/networking/DelayedPacketRegistrationHandler.java:57`

```java
public void registerQueuedPackets(PacketRegistrationHandler packetRegistration)
```

## commonnetwork.networking.PacketRegistrar

Nguồn: `upstream/common-networking-1.21.11/common/src/main/java/commonnetwork/networking/PacketRegistrar.java:14`

```java
public interface PacketRegistrar
```

## commonnetwork.networking.PacketRegistrar.getSide

Nguồn: `upstream/common-networking-1.21.11/common/src/main/java/commonnetwork/networking/PacketRegistrar.java:19`

```java
Side getSide()
```

## commonnetwork.networking.PacketRegistrar.registerPacket

Nguồn: `upstream/common-networking-1.21.11/common/src/main/java/commonnetwork/networking/PacketRegistrar.java:33`

```java
@Deprecated(forRemoval = true) <T> PacketRegistrar registerPacket(Identifier packetIdentifier, Class<T> packetClass, BiConsumer<T, FriendlyByteBuf> encoder, Function<FriendlyByteBuf, T> decoder, Consumer<PacketContext<T>> handler)
```

## commonnetwork.networking.PacketRegistrar.registerPacket

Nguồn: `upstream/common-networking-1.21.11/common/src/main/java/commonnetwork/networking/PacketRegistrar.java:46`

```java
<T> PacketRegistrar registerPacket(CustomPacketPayload.Type<? extends CustomPacketPayload> type, Class<T> packetClass, StreamCodec<? extends FriendlyByteBuf, T> codec, Consumer<PacketContext<T>> handler)
```

## commonnetwork.networking.PacketRegistrar.registerConfigurationPacket

Nguồn: `upstream/common-networking-1.21.11/common/src/main/java/commonnetwork/networking/PacketRegistrar.java:58`

```java
<T> PacketRegistrar registerConfigurationPacket(CustomPacketPayload.Type<? extends CustomPacketPayload> type, Class<T> packetClass, StreamCodec<? extends FriendlyByteBuf, T> codec, Consumer<PacketContext<T>> handler)
```

## commonnetwork.networking.PacketRegistrationHandler

Nguồn: `upstream/common-networking-1.21.11/common/src/main/java/commonnetwork/networking/PacketRegistrationHandler.java:19`

```java
public abstract class PacketRegistrationHandler implements NetworkHandler, PacketRegistrar
```

## commonnetwork.networking.PacketRegistrationHandler.side

Nguồn: `upstream/common-networking-1.21.11/common/src/main/java/commonnetwork/networking/PacketRegistrationHandler.java:23`

```java
protected final Side side
```

## commonnetwork.networking.PacketRegistrationHandler.PacketRegistrationHandler

Nguồn: `upstream/common-networking-1.21.11/common/src/main/java/commonnetwork/networking/PacketRegistrationHandler.java:30`

```java
public PacketRegistrationHandler(Side side)
```

## commonnetwork.networking.PacketRegistrationHandler.registerPacket

Nguồn: `upstream/common-networking-1.21.11/common/src/main/java/commonnetwork/networking/PacketRegistrationHandler.java:35`

```java
@Override public <T> PacketRegistrar registerPacket(Identifier packetIdentifier, Class<T> packetClass, BiConsumer<T, FriendlyByteBuf> encoder, Function<FriendlyByteBuf, T> decoder, Consumer<PacketContext<T>> handler)
```

## commonnetwork.networking.PacketRegistrationHandler.registerConfigurationPacket

Nguồn: `upstream/common-networking-1.21.11/common/src/main/java/commonnetwork/networking/PacketRegistrationHandler.java:44`

```java
@Override public <T> PacketRegistrar registerConfigurationPacket(CustomPacketPayload.Type<? extends CustomPacketPayload> type, Class<T> packetClass, StreamCodec<? extends FriendlyByteBuf, T> codec, Consumer<PacketContext<T>> handler)
```

## commonnetwork.networking.PacketRegistrationHandler.registerPacket

Nguồn: `upstream/common-networking-1.21.11/common/src/main/java/commonnetwork/networking/PacketRegistrationHandler.java:53`

```java
@Override public <T> PacketRegistrar registerPacket(CustomPacketPayload.Type<? extends CustomPacketPayload> type, Class<T> packetClass, StreamCodec<? extends FriendlyByteBuf, T> codec, Consumer<PacketContext<T>> handler)
```

## commonnetwork.networking.PacketRegistrationHandler.getSide

Nguồn: `upstream/common-networking-1.21.11/common/src/main/java/commonnetwork/networking/PacketRegistrationHandler.java:62`

```java
public Side getSide()
```

## commonnetwork.networking.data.CommonPacketWrapper

Nguồn: `upstream/common-networking-1.21.11/common/src/main/java/commonnetwork/networking/data/CommonPacketWrapper.java:6`

```java
@Deprecated(forRemoval = true) public record CommonPacketWrapper<T>(PacketContainer<T> container, T packet) implements CustomPacketPayload
```

## commonnetwork.networking.data.CommonPacketWrapper.type

Nguồn: `upstream/common-networking-1.21.11/common/src/main/java/commonnetwork/networking/data/CommonPacketWrapper.java:9`

```java
@Override public Type<? extends CustomPacketPayload> type()
```

## commonnetwork.networking.data.PacketContainer

Nguồn: `upstream/common-networking-1.21.11/common/src/main/java/commonnetwork/networking/data/PacketContainer.java:12`

```java
public record PacketContainer<T>( CustomPacketPayload.Type<? extends CustomPacketPayload> type, Class<T> classType, BiConsumer<T, FriendlyByteBuf> encoder, Function<FriendlyByteBuf, T> decoder, StreamCodec<? super FriendlyByteBuf, T> codec, Consumer<PacketContext<T>> handler, PacketType packetType)
```

## commonnetwork.networking.data.PacketContainer.PacketContainer

Nguồn: `upstream/common-networking-1.21.11/common/src/main/java/commonnetwork/networking/data/PacketContainer.java:22`

```java
@Deprecated(forRemoval = true) public PacketContainer(Identifier id, Class<T> classType, BiConsumer<T, FriendlyByteBuf> encoder, Function<FriendlyByteBuf, T> decoder, Consumer<PacketContext<T>> handle)
```

## commonnetwork.networking.data.PacketContainer.PacketContainer

Nguồn: `upstream/common-networking-1.21.11/common/src/main/java/commonnetwork/networking/data/PacketContainer.java:32`

```java
@SuppressWarnings("unchecked") public <B extends FriendlyByteBuf> PacketContainer(CustomPacketPayload.Type<? extends CustomPacketPayload> type, Class<T> classType, StreamCodec<? super B, T> codec, Consumer<PacketContext<T>> handle, PacketType packetType)
```

## commonnetwork.networking.data.PacketContainer.getType

Nguồn: `upstream/common-networking-1.21.11/common/src/main/java/commonnetwork/networking/data/PacketContainer.java:42`

```java
@SuppressWarnings("unchecked") public <K extends CustomPacketPayload> CustomPacketPayload.Type<K> getType()
```

## commonnetwork.networking.data.PacketContainer.getCodec

Nguồn: `upstream/common-networking-1.21.11/common/src/main/java/commonnetwork/networking/data/PacketContainer.java:49`

```java
@SuppressWarnings("unchecked") public <K extends FriendlyByteBuf> StreamCodec<K, CommonPacketWrapper> getCodec()
```

## commonnetwork.networking.data.PacketContainer.PacketType

Nguồn: `upstream/common-networking-1.21.11/common/src/main/java/commonnetwork/networking/data/PacketContainer.java:68`

```java
public enum PacketType
```

## commonnetwork.networking.data.PacketContext

Nguồn: `upstream/common-networking-1.21.11/common/src/main/java/commonnetwork/networking/data/PacketContext.java:5`

```java
public record PacketContext<T>(ServerPlayer sender, T message, Side side)
```

## commonnetwork.networking.data.PacketContext.PacketContext

Nguồn: `upstream/common-networking-1.21.11/common/src/main/java/commonnetwork/networking/data/PacketContext.java:7`

```java
public PacketContext(T message, Side side)
```

## commonnetwork.networking.data.Side

Nguồn: `upstream/common-networking-1.21.11/common/src/main/java/commonnetwork/networking/data/Side.java:3`

```java
public enum Side
```

## commonnetwork.networking.data.Side.opposite

Nguồn: `upstream/common-networking-1.21.11/common/src/main/java/commonnetwork/networking/data/Side.java:19`

```java
public Side opposite()
```

## commonnetwork.networking.exceptions.RegistrationException

Nguồn: `upstream/common-networking-1.21.11/common/src/main/java/commonnetwork/networking/exceptions/RegistrationException.java:3`

```java
public class RegistrationException extends RuntimeException
```

## commonnetwork.networking.exceptions.RegistrationException.RegistrationException

Nguồn: `upstream/common-networking-1.21.11/common/src/main/java/commonnetwork/networking/exceptions/RegistrationException.java:5`

```java
public RegistrationException()
```

## commonnetwork.networking.exceptions.RegistrationException.RegistrationException

Nguồn: `upstream/common-networking-1.21.11/common/src/main/java/commonnetwork/networking/exceptions/RegistrationException.java:9`

```java
public RegistrationException(String message)
```

## commonnetwork.networking.exceptions.RegistrationException.RegistrationException

Nguồn: `upstream/common-networking-1.21.11/common/src/main/java/commonnetwork/networking/exceptions/RegistrationException.java:14`

```java
public RegistrationException(String message, Throwable cause)
```

## commonnetwork.networking.exceptions.RegistrationException.RegistrationException

Nguồn: `upstream/common-networking-1.21.11/common/src/main/java/commonnetwork/networking/exceptions/RegistrationException.java:19`

```java
public RegistrationException(Throwable cause)
```

## commonnetwork.networking.exceptions.RegistrationException.RegistrationException

Nguồn: `upstream/common-networking-1.21.11/common/src/main/java/commonnetwork/networking/exceptions/RegistrationException.java:24`

```java
public RegistrationException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace)
```

## example.common.ExampleModCommon

Nguồn: `upstream/common-networking-1.21.11/example/common/ExampleModCommon.java:9`

```java
public class ExampleModCommon
```

## example.common.ExampleModCommon.ExampleModCommon

Nguồn: `upstream/common-networking-1.21.11/example/common/ExampleModCommon.java:11`

```java
public ExampleModCommon()
```

## example.common.ExampleModCommon.onPlayerJoinServer

Nguồn: `upstream/common-networking-1.21.11/example/common/ExampleModCommon.java:17`

```java
public void onPlayerJoinServer(ServerPlayer player)
```

## example.client.ExampleModCommonClient

Nguồn: `upstream/common-networking-1.21.11/example/common/client/ExampleModCommonClient.java:7`

```java
public class ExampleModCommonClient
```

## example.client.ExampleModCommonClient.ExampleModCommonClient

Nguồn: `upstream/common-networking-1.21.11/example/common/client/ExampleModCommonClient.java:9`

```java
public ExampleModCommonClient()
```

## example.client.ExampleModCommonClient.onJoinWorld

Nguồn: `upstream/common-networking-1.21.11/example/common/client/ExampleModCommonClient.java:13`

```java
public void onJoinWorld()
```

## example.network.ExamplePacketOne

Nguồn: `upstream/common-networking-1.21.11/example/common/network/ExamplePacketOne.java:10`

```java
public class ExamplePacketOne
```

## example.network.ExamplePacketOne.CHANNEL

Nguồn: `upstream/common-networking-1.21.11/example/common/network/ExamplePacketOne.java:12`

```java
public static final Identifier CHANNEL = new Identifier(Constants.MOD_ID, "example_packet_one")
```

## example.network.ExamplePacketOne.STREAM_CODEC

Nguồn: `upstream/common-networking-1.21.11/example/common/network/ExamplePacketOne.java:13`

```java
public static final StreamCodec<FriendlyByteBuf, ExamplePacketOne> STREAM_CODEC = StreamCodec.ofMember(ExamplePacketOne::encode, ExamplePacketTwo::new)
```

## example.network.ExamplePacketOne.ExamplePacketOne

Nguồn: `upstream/common-networking-1.21.11/example/common/network/ExamplePacketOne.java:15`

```java
public ExamplePacketOne()
```

## example.network.ExamplePacketOne.type

Nguồn: `upstream/common-networking-1.21.11/example/common/network/ExamplePacketOne.java:19`

```java
public static CustomPacketPayload.Type<CustomPacketPayload> type()
```

## example.network.ExamplePacketOne.ExamplePacketOne

Nguồn: `upstream/common-networking-1.21.11/example/common/network/ExamplePacketOne.java:24`

```java
public ExamplePacketOne(FriendlyByteBuf buf)
```

## example.network.ExamplePacketOne.encode

Nguồn: `upstream/common-networking-1.21.11/example/common/network/ExamplePacketOne.java:28`

```java
public void encode(FriendlyByteBuf buf)
```

## example.network.ExamplePacketOne.handle

Nguồn: `upstream/common-networking-1.21.11/example/common/network/ExamplePacketOne.java:33`

```java
public static void handle(PacketContext<ExamplePacketOne> ctx)
```

## example.network.TestRegistration

Nguồn: `upstream/common-networking-1.21.11/example/common/network/ExamplePacketRegistration.java:5`

```java
public class TestRegistration
```

## example.network.TestRegistration.init

Nguồn: `upstream/common-networking-1.21.11/example/common/network/ExamplePacketRegistration.java:8`

```java
public void init()
```

## example.network.ExamplePacketTwo

Nguồn: `upstream/common-networking-1.21.11/example/common/network/ExamplePacketTwo.java:10`

```java
public class ExamplePacketTwo
```

## example.network.ExamplePacketTwo.CHANNEL

Nguồn: `upstream/common-networking-1.21.11/example/common/network/ExamplePacketTwo.java:12`

```java
public static final Identifier CHANNEL = new Identifier(Constants.MOD_ID, "example_packet_two")
```

## example.network.ExamplePacketTwo.STREAM_CODEC

Nguồn: `upstream/common-networking-1.21.11/example/common/network/ExamplePacketTwo.java:14`

```java
public static final StreamCodec<RegistryFriendlyByteBuf, ExamplePacketTwo> STREAM_CODEC = StreamCodec.ofMember(ExamplePacketTwo::encode, ExamplePacketTwo::new)
```

## example.network.ExamplePacketTwo.ExamplePacketTwo

Nguồn: `upstream/common-networking-1.21.11/example/common/network/ExamplePacketTwo.java:16`

```java
public ExamplePacketTwo()
```

## example.network.ExamplePacketTwo.type

Nguồn: `upstream/common-networking-1.21.11/example/common/network/ExamplePacketTwo.java:20`

```java
public static CustomPacketPayload.Type<CustomPacketPayload> type()
```

## example.network.ExamplePacketTwo.ExamplePacketTwo

Nguồn: `upstream/common-networking-1.21.11/example/common/network/ExamplePacketTwo.java:25`

```java
public ExamplePacketTwo(RegistryFriendlyByteBuf buf)
```

## example.network.ExamplePacketTwo.encode

Nguồn: `upstream/common-networking-1.21.11/example/common/network/ExamplePacketTwo.java:29`

```java
public void encode(FriendlyByteBuf buf)
```

## example.network.ExamplePacketTwo.handle

Nguồn: `upstream/common-networking-1.21.11/example/common/network/ExamplePacketTwo.java:34`

```java
public static void handle(PacketContext<ExamplePacketTwo> ctx)
```

## example.fabric.ExampleModFabric

Nguồn: `upstream/common-networking-1.21.11/example/fabric/ExampleModFabric.java:9`

```java
public class ExampleModFabric implements ModInitializer, ClientModInitializer
```

## example.fabric.ExampleModFabric.onInitializeClient

Nguồn: `upstream/common-networking-1.21.11/example/fabric/ExampleModFabric.java:11`

```java
@Override public void onInitializeClient()
```

## example.fabric.ExampleModFabric.onInitialize

Nguồn: `upstream/common-networking-1.21.11/example/fabric/ExampleModFabric.java:19`

```java
@Override public void onInitialize()
```

## example.forge.ExampleModForge

Nguồn: `upstream/common-networking-1.21.11/example/forge/ExampleModForge.java:11`

```java
@Mod(Constants.MOD_ID) @Mod.EventBusSubscriber(modid = Constants.MOD_ID) public class ExampleModForge
```

## example.forge.ExampleModForge.ExampleModForge

Nguồn: `upstream/common-networking-1.21.11/example/forge/ExampleModForge.java:18`

```java
public ExampleModForge()
```

## example.forge.ExampleModForge.onPlayerLoggedInEvent

Nguồn: `upstream/common-networking-1.21.11/example/forge/ExampleModForge.java:26`

```java
@SubscribeEvent public void onPlayerLoggedInEvent(PlayerEvent.PlayerLoggedInEvent event)
```

## example.forge.ExampleModForge.onClientJoined

Nguồn: `upstream/common-networking-1.21.11/example/forge/ExampleModForge.java:35`

```java
@SubscribeEvent public void onClientJoined(ClientPlayerNetworkEvent.LoggingIn event)
```

## ExampleModForge

Nguồn: `upstream/common-networking-1.21.11/example/neoforge/ExampleModNeoForge.java:10`

```java
@Mod(Constants.MOD_ID) @EventBusSubscriber(modid = Constants.MOD_ID) public class ExampleModForge
```

## ExampleModForge.ExampleModForge

Nguồn: `upstream/common-networking-1.21.11/example/neoforge/ExampleModNeoForge.java:17`

```java
public ExampleModForge(IEventBus eventBus)
```

## ExampleModForge.onPlayerLoggedInEvent

Nguồn: `upstream/common-networking-1.21.11/example/neoforge/ExampleModNeoForge.java:25`

```java
@SubscribeEvent public void onPlayerLoggedInEvent(PlayerEvent.PlayerLoggedInEvent event)
```

## ExampleModForge.onClientJoined

Nguồn: `upstream/common-networking-1.21.11/example/neoforge/ExampleModNeoForge.java:34`

```java
@SubscribeEvent public void onClientJoined(ClientPlayerNetworkEvent.LoggingIn event)
```

## commonnetwork.CommonNetworkFabric

Nguồn: `upstream/common-networking-1.21.11/fabric/src/main/java/commonnetwork/CommonNetworkFabric.java:10`

```java
public class CommonNetworkFabric implements ModInitializer
```

## commonnetwork.CommonNetworkFabric.CommonNetworkFabric

Nguồn: `upstream/common-networking-1.21.11/fabric/src/main/java/commonnetwork/CommonNetworkFabric.java:13`

```java
public CommonNetworkFabric()
```

## commonnetwork.CommonNetworkFabric.onInitialize

Nguồn: `upstream/common-networking-1.21.11/fabric/src/main/java/commonnetwork/CommonNetworkFabric.java:17`

```java
@Override public void onInitialize()
```

## commonnetwork.networking.FabricNetworkHandler

Nguồn: `upstream/common-networking-1.21.11/fabric/src/main/java/commonnetwork/networking/FabricNetworkHandler.java:20`

```java
public class FabricNetworkHandler extends PacketRegistrationHandler
```

## commonnetwork.networking.FabricNetworkHandler.FabricNetworkHandler

Nguồn: `upstream/common-networking-1.21.11/fabric/src/main/java/commonnetwork/networking/FabricNetworkHandler.java:23`

```java
public FabricNetworkHandler(Side side)
```

## commonnetwork.networking.FabricNetworkHandler.registerPacket

Nguồn: `upstream/common-networking-1.21.11/fabric/src/main/java/commonnetwork/networking/FabricNetworkHandler.java:28`

```java
@SuppressWarnings("unchecked") protected <T> void registerPacket(PacketContainer<T> container)
```

## commonnetwork.networking.FabricNetworkHandler.send

Nguồn: `upstream/common-networking-1.21.11/fabric/src/main/java/commonnetwork/networking/FabricNetworkHandler.java:91`

```java
@Override public <T> void send(T packet, Connection connection)
```

## commonnetwork.networking.FabricNetworkHandler.getRawClientboundPacket

Nguồn: `upstream/common-networking-1.21.11/fabric/src/main/java/commonnetwork/networking/FabricNetworkHandler.java:108`

```java
@Override public <T> @Nullable ClientboundCustomPayloadPacket getRawClientboundPacket(T packet)
```

## commonnetwork.networking.FabricNetworkHandler.getRawServerboundPacket

Nguồn: `upstream/common-networking-1.21.11/fabric/src/main/java/commonnetwork/networking/FabricNetworkHandler.java:117`

```java
@Override public <T> @Nullable ServerboundCustomPayloadPacket getRawServerboundPacket(T packet)
```

## commonnetwork.networking.FabricNetworkHandler.sendToServer

Nguồn: `upstream/common-networking-1.21.11/fabric/src/main/java/commonnetwork/networking/FabricNetworkHandler.java:126`

```java
@SuppressWarnings("unchecked") public <T> void sendToServer(T packet, boolean ignoreCheck)
```

## commonnetwork.networking.FabricNetworkHandler.sendToClient

Nguồn: `upstream/common-networking-1.21.11/fabric/src/main/java/commonnetwork/networking/FabricNetworkHandler.java:143`

```java
@SuppressWarnings("unchecked") public <T> void sendToClient(T packet, ServerPlayer player, boolean ignoreCheck)
```

## commonnetwork.CommonNetworkForge

Nguồn: `upstream/common-networking-1.21.11/forge/src/main/java/commonnetwork/CommonNetworkForge.java:11`

```java
@Mod(Constants.MOD_ID) public class CommonNetworkForge
```

## commonnetwork.CommonNetworkForge.CommonNetworkForge

Nguồn: `upstream/common-networking-1.21.11/forge/src/main/java/commonnetwork/CommonNetworkForge.java:14`

```java
public CommonNetworkForge(FMLJavaModLoadingContext context)
```

## commonnetwork.CommonNetworkForge.commonSetupEvent

Nguồn: `upstream/common-networking-1.21.11/forge/src/main/java/commonnetwork/CommonNetworkForge.java:19`

```java
public void commonSetupEvent(FMLCommonSetupEvent event)
```

## commonnetwork.networking.ForgeNetworkHandler

Nguồn: `upstream/common-networking-1.21.11/forge/src/main/java/commonnetwork/networking/ForgeNetworkHandler.java:27`

```java
public class ForgeNetworkHandler extends PacketRegistrationHandler
```

## commonnetwork.networking.ForgeNetworkHandler.ForgeNetworkHandler

Nguồn: `upstream/common-networking-1.21.11/forge/src/main/java/commonnetwork/networking/ForgeNetworkHandler.java:32`

```java
public ForgeNetworkHandler(Side side)
```

## commonnetwork.networking.ForgeNetworkHandler.registerPacket

Nguồn: `upstream/common-networking-1.21.11/forge/src/main/java/commonnetwork/networking/ForgeNetworkHandler.java:37`

```java
protected <T> void registerPacket(PacketContainer<T> container)
```

## commonnetwork.networking.ForgeNetworkHandler.sendToServer

Nguồn: `upstream/common-networking-1.21.11/forge/src/main/java/commonnetwork/networking/ForgeNetworkHandler.java:71`

```java
public <T> void sendToServer(T packet, boolean ignoreCheck)
```

## commonnetwork.networking.ForgeNetworkHandler.sendToClient

Nguồn: `upstream/common-networking-1.21.11/forge/src/main/java/commonnetwork/networking/ForgeNetworkHandler.java:93`

```java
public <T> void sendToClient(T packet, ServerPlayer player, boolean ignoreCheck)
```

## commonnetwork.networking.ForgeNetworkHandler.send

Nguồn: `upstream/common-networking-1.21.11/forge/src/main/java/commonnetwork/networking/ForgeNetworkHandler.java:115`

```java
@Override public <T> void send(T packet, Connection connection)
```

## commonnetwork.networking.ForgeNetworkHandler.getRawClientboundPacket

Nguồn: `upstream/common-networking-1.21.11/forge/src/main/java/commonnetwork/networking/ForgeNetworkHandler.java:128`

```java
@Override public <T> @Nullable ClientboundCustomPayloadPacket getRawClientboundPacket(T packet)
```

## commonnetwork.networking.ForgeNetworkHandler.getRawServerboundPacket

Nguồn: `upstream/common-networking-1.21.11/forge/src/main/java/commonnetwork/networking/ForgeNetworkHandler.java:138`

```java
@Override public <T> @Nullable ServerboundCustomPayloadPacket getRawServerboundPacket(T packet)
```

## commonnetwork.networking.ForgeNetworkHandler.Message

Nguồn: `upstream/common-networking-1.21.11/forge/src/main/java/commonnetwork/networking/ForgeNetworkHandler.java:171`

```java
public record Message<T>(Channel<CustomPacketPayload> channel, PacketContainer<T> container)
```

## commonnetwork.CommonNetworkNeoForge

Nguồn: `upstream/common-networking-1.21.11/neoforge/src/main/java/commonnetwork/CommonNetworkNeoForge.java:13`

```java
@Mod(Constants.MOD_ID) public class CommonNetworkNeoForge
```

## commonnetwork.CommonNetworkNeoForge.CommonNetworkNeoForge

Nguồn: `upstream/common-networking-1.21.11/neoforge/src/main/java/commonnetwork/CommonNetworkNeoForge.java:18`

```java
public CommonNetworkNeoForge(IEventBus eventBus)
```

## commonnetwork.CommonNetworkNeoForge.commonSetupEvent

Nguồn: `upstream/common-networking-1.21.11/neoforge/src/main/java/commonnetwork/CommonNetworkNeoForge.java:26`

```java
public void commonSetupEvent(FMLCommonSetupEvent event)
```

## commonnetwork.networking.NeoForgeNetworkHandler

Nguồn: `upstream/common-networking-1.21.11/neoforge/src/main/java/commonnetwork/networking/NeoForgeNetworkHandler.java:23`

```java
public class NeoForgeNetworkHandler extends PacketRegistrationHandler
```

## commonnetwork.networking.NeoForgeNetworkHandler.NeoForgeNetworkHandler

Nguồn: `upstream/common-networking-1.21.11/neoforge/src/main/java/commonnetwork/networking/NeoForgeNetworkHandler.java:27`

```java
public NeoForgeNetworkHandler(Side side)
```

## commonnetwork.networking.NeoForgeNetworkHandler.register

Nguồn: `upstream/common-networking-1.21.11/neoforge/src/main/java/commonnetwork/networking/NeoForgeNetworkHandler.java:38`

```java
@SubscribeEvent @SuppressWarnings({"unchecked", "rawtypes"}) public void register(final RegisterPayloadHandlersEvent event)
```

## commonnetwork.networking.NeoForgeNetworkHandler.sendToServer

Nguồn: `upstream/common-networking-1.21.11/neoforge/src/main/java/commonnetwork/networking/NeoForgeNetworkHandler.java:62`

```java
@SuppressWarnings("unchecked") public <T> void sendToServer(T packet, boolean ignoreCheck)
```

## commonnetwork.networking.NeoForgeNetworkHandler.send

Nguồn: `upstream/common-networking-1.21.11/neoforge/src/main/java/commonnetwork/networking/NeoForgeNetworkHandler.java:80`

```java
@Override public <T> void send(T packet, Connection connection)
```

## commonnetwork.networking.NeoForgeNetworkHandler.getRawClientboundPacket

Nguồn: `upstream/common-networking-1.21.11/neoforge/src/main/java/commonnetwork/networking/NeoForgeNetworkHandler.java:97`

```java
@Override public <T> @Nullable ClientboundCustomPayloadPacket getRawClientboundPacket(T packet)
```

## commonnetwork.networking.NeoForgeNetworkHandler.getRawServerboundPacket

Nguồn: `upstream/common-networking-1.21.11/neoforge/src/main/java/commonnetwork/networking/NeoForgeNetworkHandler.java:106`

```java
@Override public <T> @Nullable ServerboundCustomPayloadPacket getRawServerboundPacket(T packet)
```

## commonnetwork.networking.NeoForgeNetworkHandler.sendToClient

Nguồn: `upstream/common-networking-1.21.11/neoforge/src/main/java/commonnetwork/networking/NeoForgeNetworkHandler.java:115`

```java
@SuppressWarnings("unchecked") public <T> void sendToClient(T packet, ServerPlayer player, boolean ignoreCheck)
```
