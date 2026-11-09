# systems

Khai báo Java có cú pháp public/protected. Không bao gồm API kế thừa/tổng hợp bởi compiler; xem kiểm tra bytecode riêng.

## meteordevelopment.meteorclient.systems.System

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/System.java:25`

```java
public abstract class System<T> implements ISerializable<T>
```

## meteordevelopment.meteorclient.systems.System.isFirstInit

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/System.java:29`

```java
protected boolean isFirstInit
```

## meteordevelopment.meteorclient.systems.System.System

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/System.java:32`

```java
public System(String name)
```

## meteordevelopment.meteorclient.systems.System.init

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/System.java:41`

```java
public void init()
```

## meteordevelopment.meteorclient.systems.System.save

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/System.java:43`

```java
public void save(File folder)
```

## meteordevelopment.meteorclient.systems.System.save

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/System.java:70`

```java
public void save()
```

## meteordevelopment.meteorclient.systems.System.load

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/System.java:74`

```java
public void load(File folder)
```

## meteordevelopment.meteorclient.systems.System.load

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/System.java:103`

```java
public void load()
```

## meteordevelopment.meteorclient.systems.System.getFile

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/System.java:107`

```java
public File getFile()
```

## meteordevelopment.meteorclient.systems.System.getName

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/System.java:111`

```java
public String getName()
```

## meteordevelopment.meteorclient.systems.System.toTag

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/System.java:115`

```java
@Override public NbtCompound toTag()
```

## meteordevelopment.meteorclient.systems.System.fromTag

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/System.java:120`

```java
@Override public T fromTag(NbtCompound tag)
```

## meteordevelopment.meteorclient.systems.Systems

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/Systems.java:27`

```java
public class Systems
```

## meteordevelopment.meteorclient.systems.Systems.addPreLoadTask

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/Systems.java:32`

```java
public static void addPreLoadTask(Runnable task)
```

## meteordevelopment.meteorclient.systems.Systems.init

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/Systems.java:36`

```java
public static void init()
```

## meteordevelopment.meteorclient.systems.Systems.add

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/Systems.java:59`

```java
public static System<?> add(System<?> system)
```

## meteordevelopment.meteorclient.systems.Systems.save

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/Systems.java:74`

```java
public static void save(File folder)
```

## meteordevelopment.meteorclient.systems.Systems.save

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/Systems.java:83`

```java
public static void save()
```

## meteordevelopment.meteorclient.systems.Systems.load

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/Systems.java:87`

```java
public static void load(File folder)
```

## meteordevelopment.meteorclient.systems.Systems.load

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/Systems.java:97`

```java
public static void load()
```

## meteordevelopment.meteorclient.systems.Systems.get

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/Systems.java:101`

```java
@SuppressWarnings("unchecked") public static <T extends System<?>> T get(Class<T> klass)
```
