# bootstrap

Khai báo Java có cú pháp public/protected. Không bao gồm API kế thừa/tổng hợp bởi compiler; xem kiểm tra bytecode riêng.

## meteordevelopment.meteorclient.MeteorClient

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/MeteorClient.java:50`

```java
public class MeteorClient implements ClientModInitializer
```

## meteordevelopment.meteorclient.MeteorClient.MOD_ID

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/MeteorClient.java:51`

```java
public static final String MOD_ID = "meteor-client"
```

## meteordevelopment.meteorclient.MeteorClient.MOD_META

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/MeteorClient.java:52`

```java
public static final ModMetadata MOD_META
```

## meteordevelopment.meteorclient.MeteorClient.NAME

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/MeteorClient.java:53`

```java
public static final String NAME
```

## meteordevelopment.meteorclient.MeteorClient.VERSION

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/MeteorClient.java:54`

```java
public static final Version VERSION
```

## meteordevelopment.meteorclient.MeteorClient.BUILD_NUMBER

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/MeteorClient.java:55`

```java
public static final String BUILD_NUMBER
```

## meteordevelopment.meteorclient.MeteorClient.INSTANCE

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/MeteorClient.java:57`

```java
public static MeteorClient INSTANCE
```

## meteordevelopment.meteorclient.MeteorClient.ADDON

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/MeteorClient.java:58`

```java
public static MeteorAddon ADDON
```

## meteordevelopment.meteorclient.MeteorClient.mc

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/MeteorClient.java:60`

```java
public static Minecraft mc
```

## meteordevelopment.meteorclient.MeteorClient.EVENT_BUS

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/MeteorClient.java:61`

```java
public static final IEventBus EVENT_BUS = new EventBus()
```

## meteordevelopment.meteorclient.MeteorClient.FOLDER

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/MeteorClient.java:62`

```java
public static final File FOLDER = FabricLoader.getInstance().getGameDir().resolve(MOD_ID).toFile()
```

## meteordevelopment.meteorclient.MeteorClient.LOG

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/MeteorClient.java:63`

```java
public static final Logger LOG
```

## meteordevelopment.meteorclient.MeteorClient.onInitializeClient

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/MeteorClient.java:80`

```java
@Override public void onInitializeClient()
```

## meteordevelopment.meteorclient.MeteorClient.shouldHideHud

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/MeteorClient.java:179`

```java
public static boolean shouldHideHud()
```

## meteordevelopment.meteorclient.MeteorClient.identifier

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/MeteorClient.java:191`

```java
public static Identifier identifier(String path)
```

## meteordevelopment.meteorclient.MixinPlugin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/MixinPlugin.java:16`

```java
public class MixinPlugin implements IMixinConfigPlugin
```

## meteordevelopment.meteorclient.MixinPlugin.isSodiumPresent

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/MixinPlugin.java:23`

```java
public static boolean isSodiumPresent
```

## meteordevelopment.meteorclient.MixinPlugin.isIrisPresent

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/MixinPlugin.java:25`

```java
public static boolean isIrisPresent
```

## meteordevelopment.meteorclient.MixinPlugin.onLoad

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/MixinPlugin.java:29`

```java
@Override public void onLoad(String mixinPackage)
```

## meteordevelopment.meteorclient.MixinPlugin.getRefMapperConfig

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/MixinPlugin.java:44`

```java
@Override public String getRefMapperConfig()
```

## meteordevelopment.meteorclient.MixinPlugin.shouldApplyMixin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/MixinPlugin.java:49`

```java
@Override public boolean shouldApplyMixin(String targetClassName, String mixinClassName)
```

## meteordevelopment.meteorclient.MixinPlugin.acceptTargets

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/MixinPlugin.java:71`

```java
@Override public void acceptTargets(Set<String> myTargets, Set<String> otherTargets)
```

## meteordevelopment.meteorclient.MixinPlugin.getMixins

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/MixinPlugin.java:75`

```java
@Override public List<String> getMixins()
```

## meteordevelopment.meteorclient.MixinPlugin.preApply

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/MixinPlugin.java:80`

```java
@Override public void preApply(String targetClassName, ClassNode targetClass, String mixinClassName, IMixinInfo mixinInfo)
```

## meteordevelopment.meteorclient.MixinPlugin.postApply

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/MixinPlugin.java:84`

```java
@Override public void postApply(String targetClassName, ClassNode targetClass, String mixinClassName, IMixinInfo mixinInfo)
```
