# PacketFixer-ver-1.21.11

Khai báo Java có cú pháp public/protected. Không bao gồm API kế thừa/tổng hợp bởi compiler; xem kiểm tra bytecode riêng.

## dev.tonimatas.packetfixer.PacketFixerCommon

Nguồn: `upstream/PacketFixer-ver-1.21.11/common/src/main/java/dev/tonimatas/packetfixer/PacketFixerCommon.java:7`

```java
public class PacketFixerCommon
```

## dev.tonimatas.packetfixer.PacketFixerCommon.MOD_ID

Nguồn: `upstream/PacketFixer-ver-1.21.11/common/src/main/java/dev/tonimatas/packetfixer/PacketFixerCommon.java:8`

```java
public static final String MOD_ID = "packetfixer"
```

## dev.tonimatas.packetfixer.PacketFixerCommon.LOGGER

Nguồn: `upstream/PacketFixer-ver-1.21.11/common/src/main/java/dev/tonimatas/packetfixer/PacketFixerCommon.java:9`

```java
public static final Logger LOGGER = LoggerFactory.getLogger("Packet Fixer")
```

## dev.tonimatas.packetfixer.PacketFixerCommon.init

Nguồn: `upstream/PacketFixer-ver-1.21.11/common/src/main/java/dev/tonimatas/packetfixer/PacketFixerCommon.java:11`

```java
public static void init()
```

## dev.tonimatas.packetfixer.mixins.ClientboundCustomQueryPacketMixin

Nguồn: `upstream/PacketFixer-ver-1.21.11/common/src/main/java/dev/tonimatas/packetfixer/mixins/ClientboundCustomQueryPacketMixin.java:10`

```java
@Mixin(ClientboundCustomQueryPacket.class) public class ClientboundCustomQueryPacketMixin
```

## dev.tonimatas.packetfixer.mixins.ClientboundLevelChunkPacketDataMixin

Nguồn: `upstream/PacketFixer-ver-1.21.11/common/src/main/java/dev/tonimatas/packetfixer/mixins/ClientboundLevelChunkPacketDataMixin.java:9`

```java
@Mixin(ClientboundLevelChunkPacketData.class) public class ClientboundLevelChunkPacketDataMixin
```

## dev.tonimatas.packetfixer.mixins.CompressionDecoderMixin

Nguồn: `upstream/PacketFixer-ver-1.21.11/common/src/main/java/dev/tonimatas/packetfixer/mixins/CompressionDecoderMixin.java:9`

```java
@Mixin(CompressionDecoder.class) public class CompressionDecoderMixin
```

## dev.tonimatas.packetfixer.mixins.CompressionEncoderMixin

Nguồn: `upstream/PacketFixer-ver-1.21.11/common/src/main/java/dev/tonimatas/packetfixer/mixins/CompressionEncoderMixin.java:9`

```java
@Mixin(CompressionEncoder.class) public class CompressionEncoderMixin
```

## dev.tonimatas.packetfixer.mixins.ConnectionMixin

Nguồn: `upstream/PacketFixer-ver-1.21.11/common/src/main/java/dev/tonimatas/packetfixer/mixins/ConnectionMixin.java:8`

```java
@Mixin(targets = "net.minecraft.network.Connection$1") public class ConnectionMixin
```

## dev.tonimatas.packetfixer.mixins.FriendlyByteBufMixin

Nguồn: `upstream/PacketFixer-ver-1.21.11/common/src/main/java/dev/tonimatas/packetfixer/mixins/FriendlyByteBufMixin.java:9`

```java
@Mixin(FriendlyByteBuf.class) public abstract class FriendlyByteBufMixin
```

## dev.tonimatas.packetfixer.mixins.MinecraftServerMixin

Nguồn: `upstream/PacketFixer-ver-1.21.11/common/src/main/java/dev/tonimatas/packetfixer/mixins/MinecraftServerMixin.java:10`

```java
@Mixin(MinecraftServer.class) public class MinecraftServerMixin
```

## dev.tonimatas.packetfixer.mixins.NbtAccounterMixin

Nguồn: `upstream/PacketFixer-ver-1.21.11/common/src/main/java/dev/tonimatas/packetfixer/mixins/NbtAccounterMixin.java:13`

```java
@Mixin(NbtAccounter.class) public class NbtAccounterMixin
```

## dev.tonimatas.packetfixer.mixins.ServerCommonPacketListenerImplMixin

Nguồn: `upstream/PacketFixer-ver-1.21.11/common/src/main/java/dev/tonimatas/packetfixer/mixins/ServerCommonPacketListenerImplMixin.java:9`

```java
@Mixin(ServerCommonPacketListenerImpl.class) public class ServerCommonPacketListenerImplMixin
```

## dev.tonimatas.packetfixer.mixins.ServerConnectionListenerMixin

Nguồn: `upstream/PacketFixer-ver-1.21.11/common/src/main/java/dev/tonimatas/packetfixer/mixins/ServerConnectionListenerMixin.java:8`

```java
@Mixin(targets = "net.minecraft.server.network.ServerConnectionListener$1") public class ServerConnectionListenerMixin
```

## dev.tonimatas.packetfixer.mixins.ServerLoginPacketListenerImplMixin

Nguồn: `upstream/PacketFixer-ver-1.21.11/common/src/main/java/dev/tonimatas/packetfixer/mixins/ServerLoginPacketListenerImplMixin.java:9`

```java
@Mixin(ServerLoginPacketListenerImpl.class) public class ServerLoginPacketListenerImplMixin
```

## dev.tonimatas.packetfixer.mixins.ServerboundCustomQueryPacketMixin

Nguồn: `upstream/PacketFixer-ver-1.21.11/common/src/main/java/dev/tonimatas/packetfixer/mixins/ServerboundCustomQueryPacketMixin.java:10`

```java
@Mixin(ServerboundCustomQueryAnswerPacket.class) public class ServerboundCustomQueryPacketMixin
```

## dev.tonimatas.packetfixer.mixins.VarIntMixin

Nguồn: `upstream/PacketFixer-ver-1.21.11/common/src/main/java/dev/tonimatas/packetfixer/mixins/VarIntMixin.java:9`

```java
@Mixin(VarInt.class) public class VarIntMixin
```

## dev.tonimatas.packetfixer.mixins.VarLongMixin

Nguồn: `upstream/PacketFixer-ver-1.21.11/common/src/main/java/dev/tonimatas/packetfixer/mixins/VarLongMixin.java:9`

```java
@Mixin(VarLong.class) public class VarLongMixin
```

## dev.tonimatas.packetfixer.mixins.Varint21FrameDecoderMixin

Nguồn: `upstream/PacketFixer-ver-1.21.11/common/src/main/java/dev/tonimatas/packetfixer/mixins/Varint21FrameDecoderMixin.java:20`

```java
@Mixin(Varint21FrameDecoder.class) public abstract class Varint21FrameDecoderMixin
```

## dev.tonimatas.packetfixer.mixins.Varint21LengthFieldPrependerMixin

Nguồn: `upstream/PacketFixer-ver-1.21.11/common/src/main/java/dev/tonimatas/packetfixer/mixins/Varint21LengthFieldPrependerMixin.java:9`

```java
@Mixin(Varint21LengthFieldPrepender.class) public class Varint21LengthFieldPrependerMixin
```

## dev.tonimatas.packetfixer.platform.Services

Nguồn: `upstream/PacketFixer-ver-1.21.11/common/src/main/java/dev/tonimatas/packetfixer/platform/Services.java:8`

```java
public class Services
```

## dev.tonimatas.packetfixer.platform.Services.PLATFORM

Nguồn: `upstream/PacketFixer-ver-1.21.11/common/src/main/java/dev/tonimatas/packetfixer/platform/Services.java:9`

```java
public static final IPlatformHelper PLATFORM = load(IPlatformHelper.class)
```

## dev.tonimatas.packetfixer.platform.Services.load

Nguồn: `upstream/PacketFixer-ver-1.21.11/common/src/main/java/dev/tonimatas/packetfixer/platform/Services.java:11`

```java
public static <T> T load(Class<T> clazz)
```

## dev.tonimatas.packetfixer.platform.services.IPlatformHelper

Nguồn: `upstream/PacketFixer-ver-1.21.11/common/src/main/java/dev/tonimatas/packetfixer/platform/services/IPlatformHelper.java:3`

```java
public interface IPlatformHelper
```

## dev.tonimatas.packetfixer.platform.services.IPlatformHelper.getPlatformName

Nguồn: `upstream/PacketFixer-ver-1.21.11/common/src/main/java/dev/tonimatas/packetfixer/platform/services/IPlatformHelper.java:10`

```java
String getPlatformName()
```

## dev.tonimatas.packetfixer.platform.services.IPlatformHelper.getModVersion

Nguồn: `upstream/PacketFixer-ver-1.21.11/common/src/main/java/dev/tonimatas/packetfixer/platform/services/IPlatformHelper.java:17`

```java
String getModVersion()
```

## dev.tonimatas.packetfixer.util.Config

Nguồn: `upstream/PacketFixer-ver-1.21.11/common/src/main/java/dev/tonimatas/packetfixer/util/Config.java:8`

```java
public class Config
```

## dev.tonimatas.packetfixer.util.Config.runProperties

Nguồn: `upstream/PacketFixer-ver-1.21.11/common/src/main/java/dev/tonimatas/packetfixer/util/Config.java:24`

```java
@SuppressWarnings("ResultOfMethodCallIgnored") public static void runProperties()
```

## dev.tonimatas.packetfixer.util.Config.getNbtMaxSize

Nguồn: `upstream/PacketFixer-ver-1.21.11/common/src/main/java/dev/tonimatas/packetfixer/util/Config.java:62`

```java
public static long getNbtMaxSize()
```

## dev.tonimatas.packetfixer.util.Config.getPacketSize

Nguồn: `upstream/PacketFixer-ver-1.21.11/common/src/main/java/dev/tonimatas/packetfixer/util/Config.java:66`

```java
public static int getPacketSize()
```

## dev.tonimatas.packetfixer.util.Config.getDecoderSize

Nguồn: `upstream/PacketFixer-ver-1.21.11/common/src/main/java/dev/tonimatas/packetfixer/util/Config.java:70`

```java
public static int getDecoderSize()
```

## dev.tonimatas.packetfixer.util.Config.getVarInt21Size

Nguồn: `upstream/PacketFixer-ver-1.21.11/common/src/main/java/dev/tonimatas/packetfixer/util/Config.java:74`

```java
public static int getVarInt21Size()
```

## dev.tonimatas.packetfixer.util.Config.getVarIntSize

Nguồn: `upstream/PacketFixer-ver-1.21.11/common/src/main/java/dev/tonimatas/packetfixer/util/Config.java:78`

```java
public static int getVarIntSize()
```

## dev.tonimatas.packetfixer.util.Config.getVarLong

Nguồn: `upstream/PacketFixer-ver-1.21.11/common/src/main/java/dev/tonimatas/packetfixer/util/Config.java:82`

```java
public static int getVarLong()
```

## dev.tonimatas.packetfixer.util.Config.getStringSize

Nguồn: `upstream/PacketFixer-ver-1.21.11/common/src/main/java/dev/tonimatas/packetfixer/util/Config.java:86`

```java
public static int getStringSize()
```

## dev.tonimatas.packetfixer.util.Config.getChunkPacketData

Nguồn: `upstream/PacketFixer-ver-1.21.11/common/src/main/java/dev/tonimatas/packetfixer/util/Config.java:90`

```java
public static int getChunkPacketData()
```

## dev.tonimatas.packetfixer.util.Config.getReadTimeout

Nguồn: `upstream/PacketFixer-ver-1.21.11/common/src/main/java/dev/tonimatas/packetfixer/util/Config.java:94`

```java
public static int getReadTimeout()
```

## dev.tonimatas.packetfixer.util.Config.getLoginTimeout

Nguồn: `upstream/PacketFixer-ver-1.21.11/common/src/main/java/dev/tonimatas/packetfixer/util/Config.java:98`

```java
public static int getLoginTimeout()
```

## dev.tonimatas.packetfixer.util.Config.getKeepAliveTimeout

Nguồn: `upstream/PacketFixer-ver-1.21.11/common/src/main/java/dev/tonimatas/packetfixer/util/Config.java:102`

```java
public static int getKeepAliveTimeout()
```

## dev.tonimatas.packetfixer.util.Config.getPlayerIdleTimeout

Nguồn: `upstream/PacketFixer-ver-1.21.11/common/src/main/java/dev/tonimatas/packetfixer/util/Config.java:106`

```java
public static int getPlayerIdleTimeout()
```

## dev.tonimatas.packetfixer.util.Config.isForceUnlimitedNbtEnabled

Nguồn: `upstream/PacketFixer-ver-1.21.11/common/src/main/java/dev/tonimatas/packetfixer/util/Config.java:110`

```java
public static boolean isForceUnlimitedNbtEnabled()
```

## dev.tonimatas.packetfixer.util.Messages

Nguồn: `upstream/PacketFixer-ver-1.21.11/common/src/main/java/dev/tonimatas/packetfixer/util/Messages.java:3`

```java
public class Messages
```

## dev.tonimatas.packetfixer.util.Messages.getPayloadMessage

Nguồn: `upstream/PacketFixer-ver-1.21.11/common/src/main/java/dev/tonimatas/packetfixer/util/Messages.java:4`

```java
public static String getPayloadMessage()
```

## dev.tonimatas.packetfixer.PacketFixer

Nguồn: `upstream/PacketFixer-ver-1.21.11/fabric/src/main/java/dev/tonimatas/packetfixer/PacketFixer.java:5`

```java
public class PacketFixer implements ModInitializer
```

## dev.tonimatas.packetfixer.PacketFixer.onInitialize

Nguồn: `upstream/PacketFixer-ver-1.21.11/fabric/src/main/java/dev/tonimatas/packetfixer/PacketFixer.java:7`

```java
@Override public void onInitialize()
```

## dev.tonimatas.packetfixer.mixins.ClientboundCustomPayloadPacketMixin

Nguồn: `upstream/PacketFixer-ver-1.21.11/fabric/src/main/java/dev/tonimatas/packetfixer/mixins/ClientboundCustomPayloadPacketMixin.java:9`

```java
@Mixin(ClientboundCustomPayloadPacket.class) public class ClientboundCustomPayloadPacketMixin
```

## dev.tonimatas.packetfixer.mixins.FabricMixinPlugin

Nguồn: `upstream/PacketFixer-ver-1.21.11/fabric/src/main/java/dev/tonimatas/packetfixer/mixins/FabricMixinPlugin.java:11`

```java
public class FabricMixinPlugin implements IMixinConfigPlugin
```

## dev.tonimatas.packetfixer.mixins.FabricMixinPlugin.onLoad

Nguồn: `upstream/PacketFixer-ver-1.21.11/fabric/src/main/java/dev/tonimatas/packetfixer/mixins/FabricMixinPlugin.java:12`

```java
@Override public void onLoad(String s)
```

## dev.tonimatas.packetfixer.mixins.FabricMixinPlugin.getRefMapperConfig

Nguồn: `upstream/PacketFixer-ver-1.21.11/fabric/src/main/java/dev/tonimatas/packetfixer/mixins/FabricMixinPlugin.java:17`

```java
@Override public String getRefMapperConfig()
```

## dev.tonimatas.packetfixer.mixins.FabricMixinPlugin.shouldApplyMixin

Nguồn: `upstream/PacketFixer-ver-1.21.11/fabric/src/main/java/dev/tonimatas/packetfixer/mixins/FabricMixinPlugin.java:22`

```java
@Override public boolean shouldApplyMixin(String s, String s1)
```

## dev.tonimatas.packetfixer.mixins.FabricMixinPlugin.acceptTargets

Nguồn: `upstream/PacketFixer-ver-1.21.11/fabric/src/main/java/dev/tonimatas/packetfixer/mixins/FabricMixinPlugin.java:33`

```java
@Override public void acceptTargets(Set<String> set, Set<String> set1)
```

## dev.tonimatas.packetfixer.mixins.FabricMixinPlugin.getMixins

Nguồn: `upstream/PacketFixer-ver-1.21.11/fabric/src/main/java/dev/tonimatas/packetfixer/mixins/FabricMixinPlugin.java:38`

```java
@Override public List<String> getMixins()
```

## dev.tonimatas.packetfixer.mixins.FabricMixinPlugin.preApply

Nguồn: `upstream/PacketFixer-ver-1.21.11/fabric/src/main/java/dev/tonimatas/packetfixer/mixins/FabricMixinPlugin.java:43`

```java
@Override public void preApply(String s, org.objectweb.asm.tree.ClassNode classNode, String s1, IMixinInfo iMixinInfo)
```

## dev.tonimatas.packetfixer.mixins.FabricMixinPlugin.postApply

Nguồn: `upstream/PacketFixer-ver-1.21.11/fabric/src/main/java/dev/tonimatas/packetfixer/mixins/FabricMixinPlugin.java:48`

```java
@Override public void postApply(String s, org.objectweb.asm.tree.ClassNode classNode, String s1, IMixinInfo iMixinInfo)
```

## dev.tonimatas.packetfixer.mixins.PayloadHelperMixin

Nguồn: `upstream/PacketFixer-ver-1.21.11/fabric/src/main/java/dev/tonimatas/packetfixer/mixins/PayloadHelperMixin.java:10`

```java
@Mixin(PayloadHelper.class) public class PayloadHelperMixin
```

## dev.tonimatas.packetfixer.mixins.ServerboundCustomPayloadPacketMixin

Nguồn: `upstream/PacketFixer-ver-1.21.11/fabric/src/main/java/dev/tonimatas/packetfixer/mixins/ServerboundCustomPayloadPacketMixin.java:9`

```java
@Mixin(ServerboundCustomPayloadPacket.class) public class ServerboundCustomPayloadPacketMixin
```

## dev.tonimatas.packetfixer.platform.FabricPlatformHelper

Nguồn: `upstream/PacketFixer-ver-1.21.11/fabric/src/main/java/dev/tonimatas/packetfixer/platform/FabricPlatformHelper.java:9`

```java
public class FabricPlatformHelper implements IPlatformHelper
```

## dev.tonimatas.packetfixer.platform.FabricPlatformHelper.getPlatformName

Nguồn: `upstream/PacketFixer-ver-1.21.11/fabric/src/main/java/dev/tonimatas/packetfixer/platform/FabricPlatformHelper.java:11`

```java
@Override public String getPlatformName()
```

## dev.tonimatas.packetfixer.platform.FabricPlatformHelper.getModVersion

Nguồn: `upstream/PacketFixer-ver-1.21.11/fabric/src/main/java/dev/tonimatas/packetfixer/platform/FabricPlatformHelper.java:16`

```java
@Override public String getModVersion()
```

## dev.tonimatas.packetfixer.PacketFixer

Nguồn: `upstream/PacketFixer-ver-1.21.11/neoforge/src/main/java/dev/tonimatas/packetfixer/PacketFixer.java:7`

```java
@Mod(PacketFixerCommon.MOD_ID) public class PacketFixer
```

## dev.tonimatas.packetfixer.PacketFixer.PacketFixer

Nguồn: `upstream/PacketFixer-ver-1.21.11/neoforge/src/main/java/dev/tonimatas/packetfixer/PacketFixer.java:9`

```java
@SuppressWarnings("unused") public PacketFixer(IEventBus eventBus)
```

## dev.tonimatas.packetfixer.mixins.ClientboundCustomPayloadPacketMixin

Nguồn: `upstream/PacketFixer-ver-1.21.11/neoforge/src/main/java/dev/tonimatas/packetfixer/mixins/ClientboundCustomPayloadPacketMixin.java:9`

```java
@Mixin(ClientboundCustomPayloadPacket.class) public class ClientboundCustomPayloadPacketMixin
```

## dev.tonimatas.packetfixer.mixins.NeoForgeMixinPlugin

Nguồn: `upstream/PacketFixer-ver-1.21.11/neoforge/src/main/java/dev/tonimatas/packetfixer/mixins/NeoForgeMixinPlugin.java:12`

```java
public class NeoForgeMixinPlugin implements IMixinConfigPlugin
```

## dev.tonimatas.packetfixer.mixins.NeoForgeMixinPlugin.onLoad

Nguồn: `upstream/PacketFixer-ver-1.21.11/neoforge/src/main/java/dev/tonimatas/packetfixer/mixins/NeoForgeMixinPlugin.java:13`

```java
@Override public void onLoad(String s)
```

## dev.tonimatas.packetfixer.mixins.NeoForgeMixinPlugin.getRefMapperConfig

Nguồn: `upstream/PacketFixer-ver-1.21.11/neoforge/src/main/java/dev/tonimatas/packetfixer/mixins/NeoForgeMixinPlugin.java:19`

```java
@Override public String getRefMapperConfig()
```

## dev.tonimatas.packetfixer.mixins.NeoForgeMixinPlugin.shouldApplyMixin

Nguồn: `upstream/PacketFixer-ver-1.21.11/neoforge/src/main/java/dev/tonimatas/packetfixer/mixins/NeoForgeMixinPlugin.java:24`

```java
@Override public boolean shouldApplyMixin(String s, String s1)
```

## dev.tonimatas.packetfixer.mixins.NeoForgeMixinPlugin.acceptTargets

Nguồn: `upstream/PacketFixer-ver-1.21.11/neoforge/src/main/java/dev/tonimatas/packetfixer/mixins/NeoForgeMixinPlugin.java:35`

```java
@Override public void acceptTargets(Set<String> set, Set<String> set1)
```

## dev.tonimatas.packetfixer.mixins.NeoForgeMixinPlugin.getMixins

Nguồn: `upstream/PacketFixer-ver-1.21.11/neoforge/src/main/java/dev/tonimatas/packetfixer/mixins/NeoForgeMixinPlugin.java:40`

```java
@Override public List<String> getMixins()
```

## dev.tonimatas.packetfixer.mixins.NeoForgeMixinPlugin.preApply

Nguồn: `upstream/PacketFixer-ver-1.21.11/neoforge/src/main/java/dev/tonimatas/packetfixer/mixins/NeoForgeMixinPlugin.java:45`

```java
@Override public void preApply(String s, ClassNode classNode, String s1, IMixinInfo iMixinInfo)
```

## dev.tonimatas.packetfixer.mixins.NeoForgeMixinPlugin.postApply

Nguồn: `upstream/PacketFixer-ver-1.21.11/neoforge/src/main/java/dev/tonimatas/packetfixer/mixins/NeoForgeMixinPlugin.java:50`

```java
@Override public void postApply(String s, ClassNode classNode, String s1, IMixinInfo iMixinInfo)
```

## dev.tonimatas.packetfixer.mixins.ServerboundCustomPayloadPacketMixin

Nguồn: `upstream/PacketFixer-ver-1.21.11/neoforge/src/main/java/dev/tonimatas/packetfixer/mixins/ServerboundCustomPayloadPacketMixin.java:9`

```java
@Mixin(ServerboundCustomPayloadPacket.class) public class ServerboundCustomPayloadPacketMixin
```

## dev.tonimatas.packetfixer.platform.NeoForgePlatformHelper

Nguồn: `upstream/PacketFixer-ver-1.21.11/neoforge/src/main/java/dev/tonimatas/packetfixer/platform/NeoForgePlatformHelper.java:6`

```java
public class NeoForgePlatformHelper implements IPlatformHelper
```

## dev.tonimatas.packetfixer.platform.NeoForgePlatformHelper.getPlatformName

Nguồn: `upstream/PacketFixer-ver-1.21.11/neoforge/src/main/java/dev/tonimatas/packetfixer/platform/NeoForgePlatformHelper.java:8`

```java
@Override public String getPlatformName()
```

## dev.tonimatas.packetfixer.platform.NeoForgePlatformHelper.getModVersion

Nguồn: `upstream/PacketFixer-ver-1.21.11/neoforge/src/main/java/dev/tonimatas/packetfixer/platform/NeoForgePlatformHelper.java:13`

```java
@Override public String getModVersion()
```
