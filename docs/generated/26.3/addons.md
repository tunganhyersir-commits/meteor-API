# addons

Khai báo Java có cú pháp public/protected. Không bao gồm API kế thừa/tổng hợp bởi compiler; xem kiểm tra bytecode riêng.

## meteordevelopment.meteorclient.addons.AddonManager

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/addons/AddonManager.java:17`

```java
public class AddonManager
```

## meteordevelopment.meteorclient.addons.AddonManager.ADDONS

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/addons/AddonManager.java:18`

```java
public static final List<MeteorAddon> ADDONS = new ArrayList<>()
```

## meteordevelopment.meteorclient.addons.AddonManager.init

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/addons/AddonManager.java:20`

```java
public static void init()
```

## meteordevelopment.meteorclient.addons.GithubRepo

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/addons/GithubRepo.java:12`

```java
public record GithubRepo(String owner, String name, String branch, @Nullable String accessToken)
```

## meteordevelopment.meteorclient.addons.GithubRepo.GithubRepo

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/addons/GithubRepo.java:13`

```java
public GithubRepo(String owner, String name, @Nullable String accessToken)
```

## meteordevelopment.meteorclient.addons.GithubRepo.GithubRepo

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/addons/GithubRepo.java:17`

```java
public GithubRepo(String owner, String name)
```

## meteordevelopment.meteorclient.addons.GithubRepo.getOwnerName

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/addons/GithubRepo.java:21`

```java
public String getOwnerName()
```

## meteordevelopment.meteorclient.addons.GithubRepo.authenticate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/addons/GithubRepo.java:25`

```java
public void authenticate(Http.Request request)
```

## meteordevelopment.meteorclient.addons.MeteorAddon

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/addons/MeteorAddon.java:10`

```java
public abstract class MeteorAddon
```

## meteordevelopment.meteorclient.addons.MeteorAddon.name

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/addons/MeteorAddon.java:12`

```java
public String name
```

## meteordevelopment.meteorclient.addons.MeteorAddon.authors

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/addons/MeteorAddon.java:15`

```java
public String[] authors
```

## meteordevelopment.meteorclient.addons.MeteorAddon.color

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/addons/MeteorAddon.java:18`

```java
public final Color color = new Color(255, 255, 255)
```

## meteordevelopment.meteorclient.addons.MeteorAddon.onInitialize

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/addons/MeteorAddon.java:20`

```java
public abstract void onInitialize()
```

## meteordevelopment.meteorclient.addons.MeteorAddon.onRegisterCategories

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/addons/MeteorAddon.java:22`

```java
public void onRegisterCategories()
```

## meteordevelopment.meteorclient.addons.MeteorAddon.getPackage

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/addons/MeteorAddon.java:24`

```java
public abstract String getPackage()
```

## meteordevelopment.meteorclient.addons.MeteorAddon.getWebsite

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/addons/MeteorAddon.java:26`

```java
public String getWebsite()
```

## meteordevelopment.meteorclient.addons.MeteorAddon.getRepo

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/addons/MeteorAddon.java:30`

```java
public GithubRepo getRepo()
```

## meteordevelopment.meteorclient.addons.MeteorAddon.getCommit

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/addons/MeteorAddon.java:34`

```java
public String getCommit()
```
