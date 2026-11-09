# meteorlib/example-addon

Khai báo Java có cú pháp public/protected. Không bao gồm API kế thừa/tổng hợp bởi compiler; xem kiểm tra bytecode riêng.

## dev.meteorlib.example.ExampleAddon

Nguồn: `example-addon/src/main/java/dev/meteorlib/example/ExampleAddon.java:24`

```java
public final class ExampleAddon extends MeteorAddon
```

## dev.meteorlib.example.ExampleAddon.CATEGORY

Nguồn: `example-addon/src/main/java/dev/meteorlib/example/ExampleAddon.java:26`

```java
public static Category CATEGORY
```

## dev.meteorlib.example.ExampleAddon.HUD_GROUP

Nguồn: `example-addon/src/main/java/dev/meteorlib/example/ExampleAddon.java:27`

```java
public static final HudGroup HUD_GROUP = new HudGroup("MeteorLib")
```

## dev.meteorlib.example.ExampleAddon.onRegisterCategories

Nguồn: `example-addon/src/main/java/dev/meteorlib/example/ExampleAddon.java:29`

```java
@Override public void onRegisterCategories()
```

## dev.meteorlib.example.ExampleAddon.onInitialize

Nguồn: `example-addon/src/main/java/dev/meteorlib/example/ExampleAddon.java:32`

```java
@Override public void onInitialize()
```

## dev.meteorlib.example.ExampleAddon.getPackage

Nguồn: `example-addon/src/main/java/dev/meteorlib/example/ExampleAddon.java:40`

```java
@Override public String getPackage()
```

## dev.meteorlib.example.ExampleAddon.ReminderModule

Nguồn: `example-addon/src/main/java/dev/meteorlib/example/ExampleAddon.java:43`

```java
public static final class ReminderModule extends ManagedModule
```

## dev.meteorlib.example.ExampleAddon.ReminderModule.ReminderModule

Nguồn: `example-addon/src/main/java/dev/meteorlib/example/ExampleAddon.java:48`

```java
public ReminderModule(String name)
```

## dev.meteorlib.example.ExampleAddon.ReminderModule.onStart

Nguồn: `example-addon/src/main/java/dev/meteorlib/example/ExampleAddon.java:50`

```java
@Override protected void onStart(ResourceScope resources)
```

## dev.meteorlib.example.ExampleAddon.DoctorCommand

Nguồn: `example-addon/src/main/java/dev/meteorlib/example/ExampleAddon.java:56`

```java
public static final class DoctorCommand extends Command
```

## dev.meteorlib.example.ExampleAddon.DoctorCommand.DoctorCommand

Nguồn: `example-addon/src/main/java/dev/meteorlib/example/ExampleAddon.java:57`

```java
public DoctorCommand(String name)
```

## dev.meteorlib.example.ExampleAddon.DoctorCommand.build

Nguồn: `example-addon/src/main/java/dev/meteorlib/example/ExampleAddon.java:59`

```java
@Override public void build(LiteralArgumentBuilder<CommandSource> builder)
```

## dev.meteorlib.example.ExampleAddon.StatusHud

Nguồn: `example-addon/src/main/java/dev/meteorlib/example/ExampleAddon.java:68`

```java
public static final class StatusHud extends HudElement
```

## dev.meteorlib.example.ExampleAddon.StatusHud.INFO

Nguồn: `example-addon/src/main/java/dev/meteorlib/example/ExampleAddon.java:69`

```java
public static final HudElementInfo<StatusHud> INFO = new HudElementInfo<>( HUD_GROUP, REGISTRY.name("status"), "Shows queued MeteorLib tasks.", StatusHud::new)
```

## dev.meteorlib.example.ExampleAddon.StatusHud.StatusHud

Nguồn: `example-addon/src/main/java/dev/meteorlib/example/ExampleAddon.java:72`

```java
public StatusHud()
```

## dev.meteorlib.example.ExampleAddon.StatusHud.render

Nguồn: `example-addon/src/main/java/dev/meteorlib/example/ExampleAddon.java:74`

```java
@Override public void render(HudRenderer renderer)
```
