# systems

Khai báo Java có cú pháp public/protected. Không bao gồm API kế thừa/tổng hợp bởi compiler; xem kiểm tra bytecode riêng.

## meteordevelopment.meteorclient.systems.System

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/System.java:26`

```java
public abstract class System<T> implements ISerializable<T>
```

## meteordevelopment.meteorclient.systems.System.isFirstInit

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/System.java:30`

```java
protected boolean isFirstInit
```

## meteordevelopment.meteorclient.systems.System.System

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/System.java:33`

```java
public System(String name)
```

## meteordevelopment.meteorclient.systems.System.init

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/System.java:42`

```java
public void init()
```

## meteordevelopment.meteorclient.systems.System.save

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/System.java:45`

```java
public void save(File folder)
```

## meteordevelopment.meteorclient.systems.System.save

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/System.java:79`

```java
public void save()
```

## meteordevelopment.meteorclient.systems.System.load

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/System.java:83`

```java
public void load(File folder)
```

## meteordevelopment.meteorclient.systems.System.load

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/System.java:112`

```java
public void load()
```

## meteordevelopment.meteorclient.systems.System.getFile

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/System.java:116`

```java
public File getFile()
```

## meteordevelopment.meteorclient.systems.System.getName

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/System.java:120`

```java
public String getName()
```

## meteordevelopment.meteorclient.systems.System.toTag

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/System.java:124`

```java
@Override public CompoundTag toTag()
```

## meteordevelopment.meteorclient.systems.System.fromTag

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/System.java:129`

```java
@Override public T fromTag(CompoundTag tag)
```

## meteordevelopment.meteorclient.systems.Systems

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/Systems.java:27`

```java
public class Systems
```

## meteordevelopment.meteorclient.systems.Systems.addPreLoadTask

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/Systems.java:32`

```java
public static void addPreLoadTask(Runnable task)
```

## meteordevelopment.meteorclient.systems.Systems.init

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/Systems.java:36`

```java
public static void init()
```

## meteordevelopment.meteorclient.systems.Systems.add

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/Systems.java:59`

```java
public static System<?> add(System<?> system)
```

## meteordevelopment.meteorclient.systems.Systems.save

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/Systems.java:74`

```java
public static void save(File folder)
```

## meteordevelopment.meteorclient.systems.Systems.save

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/Systems.java:83`

```java
public static void save()
```

## meteordevelopment.meteorclient.systems.Systems.load

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/Systems.java:87`

```java
public static void load(File folder)
```

## meteordevelopment.meteorclient.systems.Systems.load

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/Systems.java:97`

```java
public static void load()
```

## meteordevelopment.meteorclient.systems.Systems.get

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/Systems.java:101`

```java
@SuppressWarnings("unchecked") public static <T extends System<?>> T get(Class<T> klass)
```
