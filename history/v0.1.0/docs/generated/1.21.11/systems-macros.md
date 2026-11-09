# systems/macros

Khai báo Java có cú pháp public/protected. Không bao gồm API kế thừa/tổng hợp bởi compiler; xem kiểm tra bytecode riêng.

## meteordevelopment.meteorclient.systems.macros.Macro

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/macros/Macro.java:24`

```java
public class Macro implements ISerializable<Macro>
```

## meteordevelopment.meteorclient.systems.macros.Macro.settings

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/macros/Macro.java:25`

```java
public final Settings settings = new Settings()
```

## meteordevelopment.meteorclient.systems.macros.Macro.name

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/macros/Macro.java:29`

```java
public Setting<String> name = sgGeneral.add(new StringSetting.Builder() .name("name") .description("The name of the macro.") .build() )
```

## meteordevelopment.meteorclient.systems.macros.Macro.messages

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/macros/Macro.java:35`

```java
public Setting<List<String>> messages = sgGeneral.add(new StringListSetting.Builder() .name("messages") .description("The messages for the macro to send.") .onChanged(v -> dirty = true) .renderer(StarscriptTextBoxRenderer.class) .build() )
```

## meteordevelopment.meteorclient.systems.macros.Macro.keybind

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/macros/Macro.java:43`

```java
public Setting<Keybind> keybind = sgGeneral.add(new KeybindSetting.Builder() .name("keybind") .description("The bind to run the macro.") .build() )
```

## meteordevelopment.meteorclient.systems.macros.Macro.Macro

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/macros/Macro.java:52`

```java
public Macro()
```

## meteordevelopment.meteorclient.systems.macros.Macro.Macro

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/macros/Macro.java:53`

```java
public Macro(NbtElement tag)
```

## meteordevelopment.meteorclient.systems.macros.Macro.onAction

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/macros/Macro.java:57`

```java
public boolean onAction(boolean isKey, int value, int modifiers)
```

## meteordevelopment.meteorclient.systems.macros.Macro.onAction

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/macros/Macro.java:62`

```java
public boolean onAction()
```

## meteordevelopment.meteorclient.systems.macros.Macro.toTag

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/macros/Macro.java:85`

```java
@Override public NbtCompound toTag()
```

## meteordevelopment.meteorclient.systems.macros.Macro.fromTag

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/macros/Macro.java:94`

```java
@Override public Macro fromTag(NbtCompound tag)
```

## meteordevelopment.meteorclient.systems.macros.Macro.equals

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/macros/Macro.java:103`

```java
@Override public boolean equals(Object o)
```

## meteordevelopment.meteorclient.systems.macros.Macros

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/macros/Macros.java:24`

```java
public class Macros extends System<Macros> implements Iterable<Macro>
```

## meteordevelopment.meteorclient.systems.macros.Macros.Macros

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/macros/Macros.java:27`

```java
public Macros()
```

## meteordevelopment.meteorclient.systems.macros.Macros.get

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/macros/Macros.java:31`

```java
public static Macros get()
```

## meteordevelopment.meteorclient.systems.macros.Macros.add

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/macros/Macros.java:35`

```java
public void add(Macro macro)
```

## meteordevelopment.meteorclient.systems.macros.Macros.get

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/macros/Macros.java:41`

```java
public Macro get(String name)
```

## meteordevelopment.meteorclient.systems.macros.Macros.getAll

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/macros/Macros.java:49`

```java
public List<Macro> getAll()
```

## meteordevelopment.meteorclient.systems.macros.Macros.remove

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/macros/Macros.java:53`

```java
public void remove(Macro macro)
```

## meteordevelopment.meteorclient.systems.macros.Macros.isEmpty

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/macros/Macros.java:78`

```java
public boolean isEmpty()
```

## meteordevelopment.meteorclient.systems.macros.Macros.iterator

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/macros/Macros.java:82`

```java
@Override public @NotNull Iterator<Macro> iterator()
```

## meteordevelopment.meteorclient.systems.macros.Macros.toTag

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/macros/Macros.java:87`

```java
@Override public NbtCompound toTag()
```

## meteordevelopment.meteorclient.systems.macros.Macros.fromTag

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/macros/Macros.java:94`

```java
@Override public Macros fromTag(NbtCompound tag)
```
