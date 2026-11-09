# systems/profiles

Khai báo Java có cú pháp public/protected. Không bao gồm API kế thừa/tổng hợp bởi compiler; xem kiểm tra bytecode riêng.

## meteordevelopment.meteorclient.systems.profiles.Profile

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/profiles/Profile.java:25`

```java
public class Profile implements ISerializable<Profile>
```

## meteordevelopment.meteorclient.systems.profiles.Profile.settings

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/profiles/Profile.java:26`

```java
public final Settings settings = new Settings()
```

## meteordevelopment.meteorclient.systems.profiles.Profile.name

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/profiles/Profile.java:31`

```java
public Setting<String> name = sgGeneral.add(new StringSetting.Builder() .name("name") .description("The name of the profile.") .filter(Utils::nameFilter) .build() )
```

## meteordevelopment.meteorclient.systems.profiles.Profile.loadOnJoin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/profiles/Profile.java:38`

```java
public Setting<List<String>> loadOnJoin = sgGeneral.add(new StringListSetting.Builder() .name("load-on-join") .description("Which servers to set this profile as active when joining.") .filter(Utils::ipFilter) .build() )
```

## meteordevelopment.meteorclient.systems.profiles.Profile.hud

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/profiles/Profile.java:45`

```java
public Setting<Boolean> hud = sgSave.add(new BoolSetting.Builder() .name("hud") .description("Whether the profile should save hud.") .defaultValue(false) .build() )
```

## meteordevelopment.meteorclient.systems.profiles.Profile.macros

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/profiles/Profile.java:52`

```java
public Setting<Boolean> macros = sgSave.add(new BoolSetting.Builder() .name("macros") .description("Whether the profile should save macros.") .defaultValue(false) .build() )
```

## meteordevelopment.meteorclient.systems.profiles.Profile.modules

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/profiles/Profile.java:59`

```java
public Setting<Boolean> modules = sgSave.add(new BoolSetting.Builder() .name("modules") .description("Whether the profile should save modules.") .defaultValue(false) .build() )
```

## meteordevelopment.meteorclient.systems.profiles.Profile.waypoints

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/profiles/Profile.java:66`

```java
public Setting<Boolean> waypoints = sgSave.add(new BoolSetting.Builder() .name("waypoints") .description("Whether the profile should save waypoints.") .defaultValue(false) .build() )
```

## meteordevelopment.meteorclient.systems.profiles.Profile.Profile

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/profiles/Profile.java:73`

```java
public Profile()
```

## meteordevelopment.meteorclient.systems.profiles.Profile.Profile

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/profiles/Profile.java:74`

```java
public Profile(NbtElement tag)
```

## meteordevelopment.meteorclient.systems.profiles.Profile.load

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/profiles/Profile.java:78`

```java
public void load()
```

## meteordevelopment.meteorclient.systems.profiles.Profile.save

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/profiles/Profile.java:88`

```java
public void save()
```

## meteordevelopment.meteorclient.systems.profiles.Profile.delete

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/profiles/Profile.java:98`

```java
public void delete()
```

## meteordevelopment.meteorclient.systems.profiles.Profile.getFile

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/profiles/Profile.java:107`

```java
public File getFile()
```

## meteordevelopment.meteorclient.systems.profiles.Profile.getSafeFile

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/profiles/Profile.java:111`

```java
public File getSafeFile()
```

## meteordevelopment.meteorclient.systems.profiles.Profile.toTag

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/profiles/Profile.java:125`

```java
@Override public NbtCompound toTag()
```

## meteordevelopment.meteorclient.systems.profiles.Profile.fromTag

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/profiles/Profile.java:134`

```java
@Override public Profile fromTag(NbtCompound tag)
```

## meteordevelopment.meteorclient.systems.profiles.Profile.equals

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/profiles/Profile.java:143`

```java
@Override public boolean equals(Object o)
```

## meteordevelopment.meteorclient.systems.profiles.Profiles

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/profiles/Profiles.java:23`

```java
public class Profiles extends System<Profiles> implements Iterable<Profile>
```

## meteordevelopment.meteorclient.systems.profiles.Profiles.FOLDER

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/profiles/Profiles.java:24`

```java
public static final File FOLDER = new File(MeteorClient.FOLDER, "profiles")
```

## meteordevelopment.meteorclient.systems.profiles.Profiles.Profiles

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/profiles/Profiles.java:28`

```java
public Profiles()
```

## meteordevelopment.meteorclient.systems.profiles.Profiles.get

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/profiles/Profiles.java:32`

```java
public static Profiles get()
```

## meteordevelopment.meteorclient.systems.profiles.Profiles.add

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/profiles/Profiles.java:36`

```java
public void add(Profile profile)
```

## meteordevelopment.meteorclient.systems.profiles.Profiles.remove

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/profiles/Profiles.java:42`

```java
public void remove(Profile profile)
```

## meteordevelopment.meteorclient.systems.profiles.Profiles.get

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/profiles/Profiles.java:47`

```java
public Profile get(String name)
```

## meteordevelopment.meteorclient.systems.profiles.Profiles.getAll

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/profiles/Profiles.java:57`

```java
public List<Profile> getAll()
```

## meteordevelopment.meteorclient.systems.profiles.Profiles.getFile

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/profiles/Profiles.java:61`

```java
@Override public File getFile()
```

## meteordevelopment.meteorclient.systems.profiles.Profiles.isEmpty

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/profiles/Profiles.java:75`

```java
public boolean isEmpty()
```

## meteordevelopment.meteorclient.systems.profiles.Profiles.iterator

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/profiles/Profiles.java:79`

```java
@Override public @NotNull Iterator<Profile> iterator()
```

## meteordevelopment.meteorclient.systems.profiles.Profiles.toTag

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/profiles/Profiles.java:84`

```java
@Override public NbtCompound toTag()
```

## meteordevelopment.meteorclient.systems.profiles.Profiles.fromTag

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/profiles/Profiles.java:91`

```java
@Override public Profiles fromTag(NbtCompound tag)
```
