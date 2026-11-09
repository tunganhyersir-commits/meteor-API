# meteorlib/adapter

Khai báo Java có cú pháp public/protected. Không bao gồm API kế thừa/tổng hợp bởi compiler; xem kiểm tra bytecode riêng.

## dev.meteorlib.api.AddonRegistry

Nguồn: `adapter/src/main/java/dev/meteorlib/api/AddonRegistry.java:16`

```java
public final class AddonRegistry
```

## dev.meteorlib.api.AddonRegistry.AddonRegistry

Nguồn: `adapter/src/main/java/dev/meteorlib/api/AddonRegistry.java:19`

```java
public AddonRegistry(String namespace)
```

## dev.meteorlib.api.AddonRegistry.name

Nguồn: `adapter/src/main/java/dev/meteorlib/api/AddonRegistry.java:24`

```java
public String name(String localName)
```

## dev.meteorlib.api.AddonRegistry.module

Nguồn: `adapter/src/main/java/dev/meteorlib/api/AddonRegistry.java:26`

```java
public <T extends Module> RegistrationResult<T> module(String localName, Function<String, T> factory)
```

## dev.meteorlib.api.AddonRegistry.command

Nguồn: `adapter/src/main/java/dev/meteorlib/api/AddonRegistry.java:37`

```java
public <T extends Command> RegistrationResult<T> command(String localName, Function<String, T> factory)
```

## dev.meteorlib.api.AddonRegistry.hud

Nguồn: `adapter/src/main/java/dev/meteorlib/api/AddonRegistry.java:48`

```java
public <T extends HudElementInfo<?>> RegistrationResult<T> hud(String localName, Function<String, T> factory)
```

## dev.meteorlib.api.AddonRegistry.category

Nguồn: `adapter/src/main/java/dev/meteorlib/api/AddonRegistry.java:58`

```java
public RegistrationResult<Category> category(String localName)
```

## dev.meteorlib.api.Diagnostics

Nguồn: `adapter/src/main/java/dev/meteorlib/api/Diagnostics.java:10`

```java
public final class Diagnostics
```

## dev.meteorlib.api.Diagnostics.snapshot

Nguồn: `adapter/src/main/java/dev/meteorlib/api/Diagnostics.java:13`

```java
public static Map<String, String> snapshot()
```

## dev.meteorlib.api.ManagedModule

Nguồn: `adapter/src/main/java/dev/meteorlib/api/ManagedModule.java:9`

```java
public abstract class ManagedModule extends Module
```

## dev.meteorlib.api.ManagedModule.ManagedModule

Nguồn: `adapter/src/main/java/dev/meteorlib/api/ManagedModule.java:12`

```java
protected ManagedModule(Category category, String name, String description)
```

## dev.meteorlib.api.ManagedModule.onActivate

Nguồn: `adapter/src/main/java/dev/meteorlib/api/ManagedModule.java:16`

```java
@Override public final void onActivate()
```

## dev.meteorlib.api.ManagedModule.onDeactivate

Nguồn: `adapter/src/main/java/dev/meteorlib/api/ManagedModule.java:29`

```java
@Override public final void onDeactivate()
```

## dev.meteorlib.api.ManagedModule.onStart

Nguồn: `adapter/src/main/java/dev/meteorlib/api/ManagedModule.java:47`

```java
protected abstract void onStart(ResourceScope resources)
```

## dev.meteorlib.api.ManagedModule.onStop

Nguồn: `adapter/src/main/java/dev/meteorlib/api/ManagedModule.java:48`

```java
protected void onStop()
```

## dev.meteorlib.api.MeteorLib

Nguồn: `adapter/src/main/java/dev/meteorlib/api/MeteorLib.java:24`

```java
public final class MeteorLib
```

## dev.meteorlib.api.MeteorLib.VERSION

Nguồn: `adapter/src/main/java/dev/meteorlib/api/MeteorLib.java:25`

```java
public static final String VERSION = "0.1.0"
```

## dev.meteorlib.api.MeteorLib.MINECRAFT

Nguồn: `adapter/src/main/java/dev/meteorlib/api/MeteorLib.java:26`

```java
public static final String MINECRAFT = "1.21.11"
```

## dev.meteorlib.api.MeteorLib.MIN_LOADER

Nguồn: `adapter/src/main/java/dev/meteorlib/api/MeteorLib.java:27`

```java
public static final String MIN_LOADER = "0.19.5"
```

## dev.meteorlib.api.MeteorLib.UPSTREAM_COMMIT

Nguồn: `adapter/src/main/java/dev/meteorlib/api/MeteorLib.java:28`

```java
public static final String UPSTREAM_COMMIT = "48030717dc0d4898a195a713fb048bf597fc5b54"
```

## dev.meteorlib.api.MeteorLib.requireClientThread

Nguồn: `adapter/src/main/java/dev/meteorlib/api/MeteorLib.java:39`

```java
public static void requireClientThread()
```

## dev.meteorlib.api.MeteorLib.client

Nguồn: `adapter/src/main/java/dev/meteorlib/api/MeteorLib.java:44`

```java
public static MinecraftClient client()
```

## dev.meteorlib.api.MeteorLib.events

Nguồn: `adapter/src/main/java/dev/meteorlib/api/MeteorLib.java:45`

```java
public static IEventBus events()
```

## dev.meteorlib.api.MeteorLib.modules

Nguồn: `adapter/src/main/java/dev/meteorlib/api/MeteorLib.java:46`

```java
public static Modules modules()
```

## dev.meteorlib.api.MeteorLib.hud

Nguồn: `adapter/src/main/java/dev/meteorlib/api/MeteorLib.java:47`

```java
public static Hud hud()
```

## dev.meteorlib.api.MeteorLib.system

Nguồn: `adapter/src/main/java/dev/meteorlib/api/MeteorLib.java:49`

```java
public static <T extends System<?>> T system(Class<T> type)
```

## dev.meteorlib.api.MeteorLib.theme

Nguồn: `adapter/src/main/java/dev/meteorlib/api/MeteorLib.java:56`

```java
public static GuiTheme theme()
```

## dev.meteorlib.api.MeteorLib.commands

Nguồn: `adapter/src/main/java/dev/meteorlib/api/MeteorLib.java:61`

```java
public static List<Command> commands()
```

## dev.meteorlib.api.MeteorLib.services

Nguồn: `adapter/src/main/java/dev/meteorlib/api/MeteorLib.java:62`

```java
public static ServiceRegistry services()
```

## dev.meteorlib.api.MeteorLib.scheduler

Nguồn: `adapter/src/main/java/dev/meteorlib/api/MeteorLib.java:63`

```java
public static TickScheduler scheduler()
```

## dev.meteorlib.api.MeteorLib.listen

Nguồn: `adapter/src/main/java/dev/meteorlib/api/MeteorLib.java:66`

```java
public static Registration listen(Object listener)
```

## dev.meteorlib.api.MeteorLib.requireWorld

Nguồn: `adapter/src/main/java/dev/meteorlib/api/MeteorLib.java:82`

```java
public static void requireWorld()
```

## dev.meteorlib.api.MeteorLib.execute

Nguồn: `adapter/src/main/java/dev/meteorlib/api/MeteorLib.java:89`

```java
public static CompletableFuture<Void> execute(Runnable action)
```

## dev.meteorlib.api.Registry

Nguồn: `adapter/src/main/java/dev/meteorlib/api/Registry.java:14`

```java
public final class Registry
```

## dev.meteorlib.api.Registry.category

Nguồn: `adapter/src/main/java/dev/meteorlib/api/Registry.java:18`

```java
public static void category(Category category)
```

## dev.meteorlib.api.Registry.module

Nguồn: `adapter/src/main/java/dev/meteorlib/api/Registry.java:30`

```java
public static <T extends Module> T module(T module)
```

## dev.meteorlib.api.Registry.command

Nguồn: `adapter/src/main/java/dev/meteorlib/api/Registry.java:48`

```java
public static <T extends Command> T command(T command)
```

## dev.meteorlib.api.Registry.hud

Nguồn: `adapter/src/main/java/dev/meteorlib/api/Registry.java:66`

```java
public static <T extends HudElementInfo<?>> T hud(T info)
```

## dev.meteorlib.api.internal.LibraryAddon

Nguồn: `adapter/src/main/java/dev/meteorlib/api/internal/LibraryAddon.java:9`

```java
public final class LibraryAddon extends MeteorAddon
```

## dev.meteorlib.api.internal.LibraryAddon.onInitialize

Nguồn: `adapter/src/main/java/dev/meteorlib/api/internal/LibraryAddon.java:11`

```java
@Override public void onInitialize()
```

## dev.meteorlib.api.internal.LibraryAddon.getPackage

Nguồn: `adapter/src/main/java/dev/meteorlib/api/internal/LibraryAddon.java:22`

```java
@Override public String getPackage()
```
