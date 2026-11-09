# bootstrap

Khai báo Java có cú pháp public/protected. Không bao gồm API kế thừa/tổng hợp bởi compiler; xem kiểm tra bytecode riêng.

## meteordevelopment.meteorclient.MeteorClient

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/MeteorClient.java:48`

```java
public class MeteorClient implements ClientModInitializer
```

## meteordevelopment.meteorclient.MeteorClient.MOD_ID

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/MeteorClient.java:49`

```java
public static final String MOD_ID = "meteor-client"
```

## meteordevelopment.meteorclient.MeteorClient.MOD_META

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/MeteorClient.java:50`

```java
public static final ModMetadata MOD_META
```

## meteordevelopment.meteorclient.MeteorClient.NAME

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/MeteorClient.java:51`

```java
public static final String NAME
```

## meteordevelopment.meteorclient.MeteorClient.VERSION

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/MeteorClient.java:52`

```java
public static final Version VERSION
```

## meteordevelopment.meteorclient.MeteorClient.BUILD_NUMBER

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/MeteorClient.java:53`

```java
public static final String BUILD_NUMBER
```

## meteordevelopment.meteorclient.MeteorClient.INSTANCE

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/MeteorClient.java:55`

```java
public static MeteorClient INSTANCE
```

## meteordevelopment.meteorclient.MeteorClient.ADDON

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/MeteorClient.java:56`

```java
public static MeteorAddon ADDON
```

## meteordevelopment.meteorclient.MeteorClient.mc

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/MeteorClient.java:58`

```java
public static MinecraftClient mc
```

## meteordevelopment.meteorclient.MeteorClient.EVENT_BUS

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/MeteorClient.java:59`

```java
public static final IEventBus EVENT_BUS = new EventBus()
```

## meteordevelopment.meteorclient.MeteorClient.FOLDER

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/MeteorClient.java:60`

```java
public static final File FOLDER = FabricLoader.getInstance().getGameDir().resolve(MOD_ID).toFile()
```

## meteordevelopment.meteorclient.MeteorClient.LOG

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/MeteorClient.java:61`

```java
public static final Logger LOG
```

## meteordevelopment.meteorclient.MeteorClient.onInitializeClient

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/MeteorClient.java:79`

```java
@Override public void onInitializeClient()
```

## meteordevelopment.meteorclient.MeteorClient.identifier

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/MeteorClient.java:197`

```java
public static Identifier identifier(String path)
```

## meteordevelopment.meteorclient.MixinPlugin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/MixinPlugin.java:19`

```java
public class MixinPlugin implements IMixinConfigPlugin
```

## meteordevelopment.meteorclient.MixinPlugin.isSodiumPresent

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/MixinPlugin.java:26`

```java
public static boolean isSodiumPresent
```

## meteordevelopment.meteorclient.MixinPlugin.isIrisPresent

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/MixinPlugin.java:28`

```java
public static boolean isIrisPresent
```

## meteordevelopment.meteorclient.MixinPlugin.onLoad

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/MixinPlugin.java:31`

```java
@Override public void onLoad(String mixinPackage)
```

## meteordevelopment.meteorclient.MixinPlugin.getRefMapperConfig

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/MixinPlugin.java:72`

```java
@Override public String getRefMapperConfig()
```

## meteordevelopment.meteorclient.MixinPlugin.shouldApplyMixin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/MixinPlugin.java:77`

```java
@Override public boolean shouldApplyMixin(String targetClassName, String mixinClassName)
```

## meteordevelopment.meteorclient.MixinPlugin.acceptTargets

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/MixinPlugin.java:102`

```java
@Override public void acceptTargets(Set<String> myTargets, Set<String> otherTargets)
```

## meteordevelopment.meteorclient.MixinPlugin.getMixins

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/MixinPlugin.java:105`

```java
@Override public List<String> getMixins()
```

## meteordevelopment.meteorclient.MixinPlugin.preApply

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/MixinPlugin.java:110`

```java
@Override public void preApply(String targetClassName, ClassNode targetClass, String mixinClassName, IMixinInfo mixinInfo)
```

## meteordevelopment.meteorclient.MixinPlugin.postApply

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/MixinPlugin.java:113`

```java
@Override public void postApply(String targetClassName, ClassNode targetClass, String mixinClassName, IMixinInfo mixinInfo)
```
