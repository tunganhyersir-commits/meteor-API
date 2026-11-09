# pathing

Khai báo Java có cú pháp public/protected. Không bao gồm API kế thừa/tổng hợp bởi compiler; xem kiểm tra bytecode riêng.

## meteordevelopment.meteorclient.pathing.BaritonePathManager

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/pathing/BaritonePathManager.java:30`

```java
public class BaritonePathManager implements IPathManager
```

## meteordevelopment.meteorclient.pathing.BaritonePathManager.BaritonePathManager

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/pathing/BaritonePathManager.java:36`

```java
public BaritonePathManager()
```

## meteordevelopment.meteorclient.pathing.BaritonePathManager.getName

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/pathing/BaritonePathManager.java:47`

```java
@Override public String getName()
```

## meteordevelopment.meteorclient.pathing.BaritonePathManager.isPathing

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/pathing/BaritonePathManager.java:52`

```java
@Override public boolean isPathing()
```

## meteordevelopment.meteorclient.pathing.BaritonePathManager.pause

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/pathing/BaritonePathManager.java:57`

```java
@Override public void pause()
```

## meteordevelopment.meteorclient.pathing.BaritonePathManager.resume

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/pathing/BaritonePathManager.java:62`

```java
@Override public void resume()
```

## meteordevelopment.meteorclient.pathing.BaritonePathManager.stop

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/pathing/BaritonePathManager.java:67`

```java
@Override public void stop()
```

## meteordevelopment.meteorclient.pathing.BaritonePathManager.moveTo

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/pathing/BaritonePathManager.java:72`

```java
@Override public void moveTo(BlockPos pos, boolean ignoreY)
```

## meteordevelopment.meteorclient.pathing.BaritonePathManager.moveInDirection

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/pathing/BaritonePathManager.java:82`

```java
@Override public void moveInDirection(float yaw)
```

## meteordevelopment.meteorclient.pathing.BaritonePathManager.mine

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/pathing/BaritonePathManager.java:88`

```java
@Override public void mine(Block... blocks)
```

## meteordevelopment.meteorclient.pathing.BaritonePathManager.follow

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/pathing/BaritonePathManager.java:93`

```java
@Override public void follow(Predicate<Entity> entity)
```

## meteordevelopment.meteorclient.pathing.BaritonePathManager.getTargetYaw

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/pathing/BaritonePathManager.java:98`

```java
@Override public float getTargetYaw()
```

## meteordevelopment.meteorclient.pathing.BaritonePathManager.getTargetPitch

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/pathing/BaritonePathManager.java:103`

```java
@Override public float getTargetPitch()
```

## meteordevelopment.meteorclient.pathing.BaritonePathManager.getSettings

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/pathing/BaritonePathManager.java:108`

```java
@Override public ISettings getSettings()
```

## meteordevelopment.meteorclient.pathing.BaritoneSettings

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/pathing/BaritoneSettings.java:21`

```java
public class BaritoneSettings implements IPathManager.ISettings
```

## meteordevelopment.meteorclient.pathing.BaritoneSettings.BaritoneSettings

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/pathing/BaritoneSettings.java:29`

```java
public BaritoneSettings()
```

## meteordevelopment.meteorclient.pathing.BaritoneSettings.get

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/pathing/BaritoneSettings.java:33`

```java
@Override public Settings get()
```

## meteordevelopment.meteorclient.pathing.BaritoneSettings.getWalkOnWater

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/pathing/BaritoneSettings.java:38`

```java
@Override public Setting<Boolean> getWalkOnWater()
```

## meteordevelopment.meteorclient.pathing.BaritoneSettings.getWalkOnLava

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/pathing/BaritoneSettings.java:43`

```java
@Override public Setting<Boolean> getWalkOnLava()
```

## meteordevelopment.meteorclient.pathing.BaritoneSettings.getStep

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/pathing/BaritoneSettings.java:48`

```java
@Override public Setting<Boolean> getStep()
```

## meteordevelopment.meteorclient.pathing.BaritoneSettings.getNoFall

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/pathing/BaritoneSettings.java:53`

```java
@Override public Setting<Boolean> getNoFall()
```

## meteordevelopment.meteorclient.pathing.BaritoneSettings.save

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/pathing/BaritoneSettings.java:58`

```java
@Override public void save()
```

## meteordevelopment.meteorclient.pathing.BaritoneUtils

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/pathing/BaritoneUtils.java:10`

```java
public class BaritoneUtils
```

## meteordevelopment.meteorclient.pathing.BaritoneUtils.IS_AVAILABLE

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/pathing/BaritoneUtils.java:11`

```java
public static boolean IS_AVAILABLE = false
```

## meteordevelopment.meteorclient.pathing.BaritoneUtils.getPrefix

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/pathing/BaritoneUtils.java:16`

```java
public static String getPrefix()
```

## meteordevelopment.meteorclient.pathing.IPathManager

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/pathing/IPathManager.java:16`

```java
public interface IPathManager
```

## meteordevelopment.meteorclient.pathing.IPathManager.getName

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/pathing/IPathManager.java:17`

```java
String getName()
```

## meteordevelopment.meteorclient.pathing.IPathManager.isPathing

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/pathing/IPathManager.java:19`

```java
boolean isPathing()
```

## meteordevelopment.meteorclient.pathing.IPathManager.pause

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/pathing/IPathManager.java:21`

```java
void pause()
```

## meteordevelopment.meteorclient.pathing.IPathManager.resume

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/pathing/IPathManager.java:22`

```java
void resume()
```

## meteordevelopment.meteorclient.pathing.IPathManager.stop

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/pathing/IPathManager.java:23`

```java
void stop()
```

## meteordevelopment.meteorclient.pathing.IPathManager.moveTo

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/pathing/IPathManager.java:25`

```java
default void moveTo(BlockPos pos)
```

## meteordevelopment.meteorclient.pathing.IPathManager.moveTo

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/pathing/IPathManager.java:26`

```java
void moveTo(BlockPos pos, boolean ignoreY)
```

## meteordevelopment.meteorclient.pathing.IPathManager.moveInDirection

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/pathing/IPathManager.java:27`

```java
void moveInDirection(float yaw)
```

## meteordevelopment.meteorclient.pathing.IPathManager.mine

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/pathing/IPathManager.java:29`

```java
void mine(Block... blocks)
```

## meteordevelopment.meteorclient.pathing.IPathManager.follow

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/pathing/IPathManager.java:31`

```java
void follow(Predicate<Entity> entity)
```

## meteordevelopment.meteorclient.pathing.IPathManager.getTargetYaw

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/pathing/IPathManager.java:33`

```java
float getTargetYaw()
```

## meteordevelopment.meteorclient.pathing.IPathManager.getTargetPitch

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/pathing/IPathManager.java:34`

```java
float getTargetPitch()
```

## meteordevelopment.meteorclient.pathing.IPathManager.getSettings

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/pathing/IPathManager.java:36`

```java
ISettings getSettings()
```

## meteordevelopment.meteorclient.pathing.IPathManager.ISettings

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/pathing/IPathManager.java:38`

```java
interface ISettings
```

## meteordevelopment.meteorclient.pathing.IPathManager.ISettings.get

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/pathing/IPathManager.java:39`

```java
Settings get()
```

## meteordevelopment.meteorclient.pathing.IPathManager.ISettings.getWalkOnWater

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/pathing/IPathManager.java:41`

```java
Setting<Boolean> getWalkOnWater()
```

## meteordevelopment.meteorclient.pathing.IPathManager.ISettings.getWalkOnLava

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/pathing/IPathManager.java:42`

```java
Setting<Boolean> getWalkOnLava()
```

## meteordevelopment.meteorclient.pathing.IPathManager.ISettings.getStep

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/pathing/IPathManager.java:44`

```java
Setting<Boolean> getStep()
```

## meteordevelopment.meteorclient.pathing.IPathManager.ISettings.getNoFall

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/pathing/IPathManager.java:45`

```java
Setting<Boolean> getNoFall()
```

## meteordevelopment.meteorclient.pathing.IPathManager.ISettings.save

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/pathing/IPathManager.java:47`

```java
void save()
```

## meteordevelopment.meteorclient.pathing.NopPathManager

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/pathing/NopPathManager.java:17`

```java
public class NopPathManager implements IPathManager
```

## meteordevelopment.meteorclient.pathing.NopPathManager.getName

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/pathing/NopPathManager.java:20`

```java
@Override public String getName()
```

## meteordevelopment.meteorclient.pathing.NopPathManager.isPathing

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/pathing/NopPathManager.java:25`

```java
@Override public boolean isPathing()
```

## meteordevelopment.meteorclient.pathing.NopPathManager.pause

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/pathing/NopPathManager.java:30`

```java
@Override public void pause()
```

## meteordevelopment.meteorclient.pathing.NopPathManager.resume

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/pathing/NopPathManager.java:33`

```java
@Override public void resume()
```

## meteordevelopment.meteorclient.pathing.NopPathManager.stop

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/pathing/NopPathManager.java:36`

```java
@Override public void stop()
```

## meteordevelopment.meteorclient.pathing.NopPathManager.moveTo

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/pathing/NopPathManager.java:39`

```java
@Override public void moveTo(BlockPos pos, boolean ignoreY)
```

## meteordevelopment.meteorclient.pathing.NopPathManager.moveInDirection

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/pathing/NopPathManager.java:42`

```java
@Override public void moveInDirection(float yaw)
```

## meteordevelopment.meteorclient.pathing.NopPathManager.mine

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/pathing/NopPathManager.java:45`

```java
@Override public void mine(Block... blocks)
```

## meteordevelopment.meteorclient.pathing.NopPathManager.follow

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/pathing/NopPathManager.java:48`

```java
@Override public void follow(Predicate<Entity> entity)
```

## meteordevelopment.meteorclient.pathing.NopPathManager.getTargetYaw

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/pathing/NopPathManager.java:51`

```java
@Override public float getTargetYaw()
```

## meteordevelopment.meteorclient.pathing.NopPathManager.getTargetPitch

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/pathing/NopPathManager.java:56`

```java
@Override public float getTargetPitch()
```

## meteordevelopment.meteorclient.pathing.NopPathManager.getSettings

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/pathing/NopPathManager.java:61`

```java
@Override public ISettings getSettings()
```

## meteordevelopment.meteorclient.pathing.PathManagers

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/pathing/PathManagers.java:13`

```java
public class PathManagers
```

## meteordevelopment.meteorclient.pathing.PathManagers.get

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/pathing/PathManagers.java:16`

```java
public static IPathManager get()
```

## meteordevelopment.meteorclient.pathing.PathManagers.init

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/pathing/PathManagers.java:20`

```java
@PreInit public static void init()
```
