# systems/accounts

Khai báo Java có cú pháp public/protected. Không bao gồm API kế thừa/tổng hợp bởi compiler; xem kiểm tra bytecode riêng.

## meteordevelopment.meteorclient.systems.accounts.Account

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/accounts/Account.java:35`

```java
public abstract class Account<T extends Account<?>> implements ISerializable<T>
```

## meteordevelopment.meteorclient.systems.accounts.Account.type

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/accounts/Account.java:36`

```java
protected AccountType type
```

## meteordevelopment.meteorclient.systems.accounts.Account.name

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/accounts/Account.java:37`

```java
protected String name
```

## meteordevelopment.meteorclient.systems.accounts.Account.cache

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/accounts/Account.java:39`

```java
protected final AccountCache cache
```

## meteordevelopment.meteorclient.systems.accounts.Account.Account

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/accounts/Account.java:41`

```java
protected Account(AccountType type, String name)
```

## meteordevelopment.meteorclient.systems.accounts.Account.fetchInfo

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/accounts/Account.java:47`

```java
public abstract boolean fetchInfo()
```

## meteordevelopment.meteorclient.systems.accounts.Account.login

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/accounts/Account.java:49`

```java
public boolean login()
```

## meteordevelopment.meteorclient.systems.accounts.Account.getUsername

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/accounts/Account.java:56`

```java
public String getUsername()
```

## meteordevelopment.meteorclient.systems.accounts.Account.getType

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/accounts/Account.java:61`

```java
public AccountType getType()
```

## meteordevelopment.meteorclient.systems.accounts.Account.getCache

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/accounts/Account.java:65`

```java
public AccountCache getCache()
```

## meteordevelopment.meteorclient.systems.accounts.Account.setSession

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/accounts/Account.java:69`

```java
public static void setSession(User session)
```

## meteordevelopment.meteorclient.systems.accounts.Account.applyLoginEnvironment

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/accounts/Account.java:85`

```java
public static void applyLoginEnvironment(MinecraftServicesDiscoveryService authService)
```

## meteordevelopment.meteorclient.systems.accounts.Account.toTag

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/accounts/Account.java:94`

```java
@Override public CompoundTag toTag()
```

## meteordevelopment.meteorclient.systems.accounts.Account.fromTag

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/accounts/Account.java:105`

```java
@SuppressWarnings("unchecked") @Override public T fromTag(CompoundTag tag)
```

## meteordevelopment.meteorclient.systems.accounts.AccountCache

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/accounts/AccountCache.java:18`

```java
public class AccountCache implements ISerializable<AccountCache>
```

## meteordevelopment.meteorclient.systems.accounts.AccountCache.username

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/accounts/AccountCache.java:19`

```java
public String username = ""
```

## meteordevelopment.meteorclient.systems.accounts.AccountCache.uuid

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/accounts/AccountCache.java:20`

```java
public String uuid = ""
```

## meteordevelopment.meteorclient.systems.accounts.AccountCache.getHeadTexture

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/accounts/AccountCache.java:24`

```java
public PlayerHeadTexture getHeadTexture()
```

## meteordevelopment.meteorclient.systems.accounts.AccountCache.loadHead

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/accounts/AccountCache.java:28`

```java
public void loadHead()
```

## meteordevelopment.meteorclient.systems.accounts.AccountCache.loadHead

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/accounts/AccountCache.java:32`

```java
public void loadHead(Runnable callback)
```

## meteordevelopment.meteorclient.systems.accounts.AccountCache.toTag

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/accounts/AccountCache.java:53`

```java
@Override public CompoundTag toTag()
```

## meteordevelopment.meteorclient.systems.accounts.AccountCache.fromTag

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/accounts/AccountCache.java:63`

```java
@Override public AccountCache fromTag(CompoundTag tag)
```

## meteordevelopment.meteorclient.systems.accounts.AccountType

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/accounts/AccountType.java:8`

```java
public enum AccountType
```

## meteordevelopment.meteorclient.systems.accounts.Accounts

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/accounts/Accounts.java:24`

```java
public class Accounts extends System<Accounts> implements Iterable<Account<?>>
```

## meteordevelopment.meteorclient.systems.accounts.Accounts.Accounts

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/accounts/Accounts.java:27`

```java
public Accounts()
```

## meteordevelopment.meteorclient.systems.accounts.Accounts.get

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/accounts/Accounts.java:31`

```java
public static Accounts get()
```

## meteordevelopment.meteorclient.systems.accounts.Accounts.add

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/accounts/Accounts.java:35`

```java
public void add(Account<?> account)
```

## meteordevelopment.meteorclient.systems.accounts.Accounts.exists

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/accounts/Accounts.java:40`

```java
public boolean exists(Account<?> account)
```

## meteordevelopment.meteorclient.systems.accounts.Accounts.remove

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/accounts/Accounts.java:44`

```java
public void remove(Account<?> account)
```

## meteordevelopment.meteorclient.systems.accounts.Accounts.size

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/accounts/Accounts.java:50`

```java
public int size()
```

## meteordevelopment.meteorclient.systems.accounts.Accounts.iterator

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/accounts/Accounts.java:54`

```java
@Override public @NonNull Iterator<Account<?>> iterator()
```

## meteordevelopment.meteorclient.systems.accounts.Accounts.toTag

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/accounts/Accounts.java:59`

```java
@Override public CompoundTag toTag()
```

## meteordevelopment.meteorclient.systems.accounts.Accounts.fromTag

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/accounts/Accounts.java:68`

```java
@Override public Accounts fromTag(CompoundTag tag)
```

## meteordevelopment.meteorclient.systems.accounts.MicrosoftLogin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/accounts/MicrosoftLogin.java:30`

```java
public class MicrosoftLogin
```

## meteordevelopment.meteorclient.systems.accounts.MicrosoftLogin.LoginData

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/accounts/MicrosoftLogin.java:42`

```java
public record LoginData(String mcToken, String newRefreshToken, String uuid, String username)
```

## meteordevelopment.meteorclient.systems.accounts.MicrosoftLogin.getRefreshToken

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/accounts/MicrosoftLogin.java:45`

```java
public static String getRefreshToken(Consumer<String> callback)
```

## meteordevelopment.meteorclient.systems.accounts.MicrosoftLogin.login

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/accounts/MicrosoftLogin.java:90`

```java
public static @Nullable LoginData login(String refreshToken)
```

## meteordevelopment.meteorclient.systems.accounts.MicrosoftLogin.cancelLogin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/accounts/MicrosoftLogin.java:112`

```java
public static void cancelLogin()
```

## meteordevelopment.meteorclient.systems.accounts.TexturesJson

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/accounts/TexturesJson.java:8`

```java
public class TexturesJson
```

## meteordevelopment.meteorclient.systems.accounts.TexturesJson.textures

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/accounts/TexturesJson.java:9`

```java
public Textures textures
```

## meteordevelopment.meteorclient.systems.accounts.TexturesJson.Textures

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/accounts/TexturesJson.java:11`

```java
public static class Textures
```

## meteordevelopment.meteorclient.systems.accounts.TexturesJson.Textures.SKIN

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/accounts/TexturesJson.java:12`

```java
public Texture SKIN
```

## meteordevelopment.meteorclient.systems.accounts.TexturesJson.Texture

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/accounts/TexturesJson.java:15`

```java
public static class Texture
```

## meteordevelopment.meteorclient.systems.accounts.TexturesJson.Texture.url

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/accounts/TexturesJson.java:16`

```java
public String url
```

## meteordevelopment.meteorclient.systems.accounts.TokenAccount

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/accounts/TokenAccount.java:8`

```java
public interface TokenAccount
```

## meteordevelopment.meteorclient.systems.accounts.TokenAccount.getToken

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/accounts/TokenAccount.java:9`

```java
String getToken()
```

## meteordevelopment.meteorclient.systems.accounts.UuidToProfileResponse

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/accounts/UuidToProfileResponse.java:8`

```java
public class UuidToProfileResponse
```

## meteordevelopment.meteorclient.systems.accounts.UuidToProfileResponse.properties

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/accounts/UuidToProfileResponse.java:9`

```java
public Property[] properties
```

## meteordevelopment.meteorclient.systems.accounts.UuidToProfileResponse.getPropertyValue

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/accounts/UuidToProfileResponse.java:11`

```java
public String getPropertyValue(String name)
```

## meteordevelopment.meteorclient.systems.accounts.UuidToProfileResponse.Property

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/accounts/UuidToProfileResponse.java:19`

```java
public static class Property
```

## meteordevelopment.meteorclient.systems.accounts.UuidToProfileResponse.Property.name

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/accounts/UuidToProfileResponse.java:20`

```java
public String name
```

## meteordevelopment.meteorclient.systems.accounts.UuidToProfileResponse.Property.value

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/accounts/UuidToProfileResponse.java:21`

```java
public String value
```

## meteordevelopment.meteorclient.systems.accounts.types.CrackedAccount

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/accounts/types/CrackedAccount.java:15`

```java
public class CrackedAccount extends Account<CrackedAccount>
```

## meteordevelopment.meteorclient.systems.accounts.types.CrackedAccount.CrackedAccount

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/accounts/types/CrackedAccount.java:16`

```java
public CrackedAccount(String name)
```

## meteordevelopment.meteorclient.systems.accounts.types.CrackedAccount.fetchInfo

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/accounts/types/CrackedAccount.java:20`

```java
@Override public boolean fetchInfo()
```

## meteordevelopment.meteorclient.systems.accounts.types.CrackedAccount.login

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/accounts/types/CrackedAccount.java:26`

```java
@Override public boolean login()
```

## meteordevelopment.meteorclient.systems.accounts.types.CrackedAccount.equals

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/accounts/types/CrackedAccount.java:34`

```java
@Override public boolean equals(Object o)
```

## meteordevelopment.meteorclient.systems.accounts.types.MicrosoftAccount

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/accounts/types/MicrosoftAccount.java:17`

```java
public class MicrosoftAccount extends Account<MicrosoftAccount>
```

## meteordevelopment.meteorclient.systems.accounts.types.MicrosoftAccount.MicrosoftAccount

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/accounts/types/MicrosoftAccount.java:20`

```java
public MicrosoftAccount(String refreshToken)
```

## meteordevelopment.meteorclient.systems.accounts.types.MicrosoftAccount.fetchInfo

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/accounts/types/MicrosoftAccount.java:24`

```java
@Override public boolean fetchInfo()
```

## meteordevelopment.meteorclient.systems.accounts.types.MicrosoftAccount.login

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/accounts/types/MicrosoftAccount.java:30`

```java
@Override public boolean login()
```

## meteordevelopment.meteorclient.systems.accounts.types.MicrosoftAccount.equals

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/accounts/types/MicrosoftAccount.java:51`

```java
@Override public boolean equals(Object o)
```

## meteordevelopment.meteorclient.systems.accounts.types.SessionAccount

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/accounts/types/SessionAccount.java:19`

```java
public class SessionAccount extends Account<SessionAccount> implements TokenAccount
```

## meteordevelopment.meteorclient.systems.accounts.types.SessionAccount.SessionAccount

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/accounts/types/SessionAccount.java:22`

```java
public SessionAccount(String label)
```

## meteordevelopment.meteorclient.systems.accounts.types.SessionAccount.fromTag

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/accounts/types/SessionAccount.java:27`

```java
@Override public SessionAccount fromTag(CompoundTag tag)
```

## meteordevelopment.meteorclient.systems.accounts.types.SessionAccount.toTag

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/accounts/types/SessionAccount.java:35`

```java
@Override public CompoundTag toTag()
```

## meteordevelopment.meteorclient.systems.accounts.types.SessionAccount.fetchInfo

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/accounts/types/SessionAccount.java:42`

```java
@Override public boolean fetchInfo()
```

## meteordevelopment.meteorclient.systems.accounts.types.SessionAccount.login

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/accounts/types/SessionAccount.java:64`

```java
@Override public boolean login()
```

## meteordevelopment.meteorclient.systems.accounts.types.SessionAccount.getToken

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/accounts/types/SessionAccount.java:74`

```java
@Override public String getToken()
```

## meteordevelopment.meteorclient.systems.accounts.types.SessionAccount.equals

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/accounts/types/SessionAccount.java:79`

```java
@Override public boolean equals(Object o)
```

## meteordevelopment.meteorclient.systems.accounts.types.TheAlteningAccount

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/accounts/types/TheAlteningAccount.java:25`

```java
public class TheAlteningAccount extends Account<TheAlteningAccount> implements TokenAccount
```

## meteordevelopment.meteorclient.systems.accounts.types.TheAlteningAccount.TheAlteningAccount

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/accounts/types/TheAlteningAccount.java:31`

```java
public TheAlteningAccount(String token)
```

## meteordevelopment.meteorclient.systems.accounts.types.TheAlteningAccount.fetchInfo

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/accounts/types/TheAlteningAccount.java:36`

```java
@Override public boolean fetchInfo()
```

## meteordevelopment.meteorclient.systems.accounts.types.TheAlteningAccount.login

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/accounts/types/TheAlteningAccount.java:57`

```java
@Override public boolean login()
```

## meteordevelopment.meteorclient.systems.accounts.types.TheAlteningAccount.getToken

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/accounts/types/TheAlteningAccount.java:77`

```java
@Override public String getToken()
```

## meteordevelopment.meteorclient.systems.accounts.types.TheAlteningAccount.toTag

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/accounts/types/TheAlteningAccount.java:82`

```java
@Override public CompoundTag toTag()
```

## meteordevelopment.meteorclient.systems.accounts.types.TheAlteningAccount.fromTag

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/accounts/types/TheAlteningAccount.java:94`

```java
@Override public TheAlteningAccount fromTag(CompoundTag tag)
```
