# systems/friends

Khai báo Java có cú pháp public/protected. Không bao gồm API kế thừa/tổng hợp bởi compiler; xem kiểm tra bytecode riêng.

## meteordevelopment.meteorclient.systems.friends.Friend

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/friends/Friend.java:26`

```java
public class Friend implements ISerializable<Friend>, Comparable<Friend>
```

## meteordevelopment.meteorclient.systems.friends.Friend.name

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/friends/Friend.java:27`

```java
public volatile String name
```

## meteordevelopment.meteorclient.systems.friends.Friend.Friend

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/friends/Friend.java:32`

```java
public Friend(String name, @Nullable UUID id)
```

## meteordevelopment.meteorclient.systems.friends.Friend.Friend

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/friends/Friend.java:38`

```java
public Friend(PlayerEntity player)
```

## meteordevelopment.meteorclient.systems.friends.Friend.Friend

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/friends/Friend.java:41`

```java
public Friend(String name)
```

## meteordevelopment.meteorclient.systems.friends.Friend.getName

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/friends/Friend.java:45`

```java
public String getName()
```

## meteordevelopment.meteorclient.systems.friends.Friend.getHead

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/friends/Friend.java:49`

```java
public PlayerHeadTexture getHead()
```

## meteordevelopment.meteorclient.systems.friends.Friend.updateInfo

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/friends/Friend.java:53`

```java
public void updateInfo()
```

## meteordevelopment.meteorclient.systems.friends.Friend.headTextureNeedsUpdate

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/friends/Friend.java:88`

```java
public boolean headTextureNeedsUpdate()
```

## meteordevelopment.meteorclient.systems.friends.Friend.toTag

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/friends/Friend.java:92`

```java
@Override public NbtCompound toTag()
```

## meteordevelopment.meteorclient.systems.friends.Friend.fromTag

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/friends/Friend.java:102`

```java
@Override public Friend fromTag(NbtCompound tag)
```

## meteordevelopment.meteorclient.systems.friends.Friend.equals

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/friends/Friend.java:107`

```java
@Override public boolean equals(Object o)
```

## meteordevelopment.meteorclient.systems.friends.Friend.hashCode

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/friends/Friend.java:115`

```java
@Override public int hashCode()
```

## meteordevelopment.meteorclient.systems.friends.Friend.compareTo

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/friends/Friend.java:120`

```java
@Override public int compareTo(@NotNull Friend friend)
```

## meteordevelopment.meteorclient.systems.friends.Friends

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/friends/Friends.java:24`

```java
public class Friends extends System<Friends> implements Iterable<Friend>
```

## meteordevelopment.meteorclient.systems.friends.Friends.Friends

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/friends/Friends.java:27`

```java
public Friends()
```

## meteordevelopment.meteorclient.systems.friends.Friends.get

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/friends/Friends.java:31`

```java
public static Friends get()
```

## meteordevelopment.meteorclient.systems.friends.Friends.add

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/friends/Friends.java:35`

```java
public boolean add(Friend friend)
```

## meteordevelopment.meteorclient.systems.friends.Friends.remove

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/friends/Friends.java:45`

```java
public boolean remove(Friend friend)
```

## meteordevelopment.meteorclient.systems.friends.Friends.get

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/friends/Friends.java:54`

```java
public Friend get(String name)
```

## meteordevelopment.meteorclient.systems.friends.Friends.get

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/friends/Friends.java:64`

```java
public Friend get(PlayerEntity player)
```

## meteordevelopment.meteorclient.systems.friends.Friends.get

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/friends/Friends.java:68`

```java
public Friend get(PlayerListEntry player)
```

## meteordevelopment.meteorclient.systems.friends.Friends.isFriend

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/friends/Friends.java:72`

```java
public boolean isFriend(PlayerEntity player)
```

## meteordevelopment.meteorclient.systems.friends.Friends.isFriend

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/friends/Friends.java:76`

```java
public boolean isFriend(PlayerListEntry player)
```

## meteordevelopment.meteorclient.systems.friends.Friends.shouldAttack

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/friends/Friends.java:80`

```java
public boolean shouldAttack(PlayerEntity player)
```

## meteordevelopment.meteorclient.systems.friends.Friends.count

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/friends/Friends.java:84`

```java
public int count()
```

## meteordevelopment.meteorclient.systems.friends.Friends.isEmpty

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/friends/Friends.java:88`

```java
public boolean isEmpty()
```

## meteordevelopment.meteorclient.systems.friends.Friends.iterator

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/friends/Friends.java:92`

```java
@Override public @NotNull Iterator<Friend> iterator()
```

## meteordevelopment.meteorclient.systems.friends.Friends.toTag

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/friends/Friends.java:97`

```java
@Override public NbtCompound toTag()
```

## meteordevelopment.meteorclient.systems.friends.Friends.fromTag

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/friends/Friends.java:106`

```java
@Override public Friends fromTag(NbtCompound tag)
```
