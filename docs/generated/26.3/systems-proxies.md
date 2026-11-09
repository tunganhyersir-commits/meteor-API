# systems/proxies

Khai báo Java có cú pháp public/protected. Không bao gồm API kế thừa/tổng hợp bởi compiler; xem kiểm tra bytecode riêng.

## meteordevelopment.meteorclient.systems.proxies.Proxies

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/proxies/Proxies.java:20`

```java
public class Proxies extends System<Proxies> implements Iterable<Proxy>
```

## meteordevelopment.meteorclient.systems.proxies.Proxies.settings

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/proxies/Proxies.java:21`

```java
public final Settings settings = new Settings()
```

## meteordevelopment.meteorclient.systems.proxies.Proxies.timeout

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/proxies/Proxies.java:34`

```java
public final Setting<Integer> timeout = sgRefreshing.add(new IntSetting.Builder() .name("timeout") .description("The timeout in milliseconds for checking proxies.") .defaultValue(5000) .min(0) .sliderRange(0, 15000) .build() )
```

## meteordevelopment.meteorclient.systems.proxies.Proxies.PROXY_PATTERN

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/proxies/Proxies.java:84`

```java
public static final Pattern PROXY_PATTERN = Pattern.compile("^(?:([\\w\\s]+)=)?((?:0*(?:\\d|[1-9]\\d|1\\d\\d|2[0-4]\\d|25[0-5])(?:\\.(?!:)|)){4}):(?!0)(\\d{1,4}|[1-5]\\d{4}|6[0-4]\\d{3}|65[0-4]\\d{2}|655[0-2]\\d|6553[0-5])(?i:@(socks[45]))?$", Pattern.MULTILINE)
```

## meteordevelopment.meteorclient.systems.proxies.Proxies.PROXY_PATTERN_WEBSHARE

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/proxies/Proxies.java:86`

```java
public static final Pattern PROXY_PATTERN_WEBSHARE = Pattern.compile("^((?:0*(?:\\d|[1-9]\\d|1\\d\\d|2[0-4]\\d|25[0-5])(?:\\.(?!:)|)){4}):(?!0)(\\d{1,4}|[1-5]\\d{4}|6[0-4]\\d{3}|65[0-4]\\d{2}|655[0-2]\\d|6553[0-5]):([^:]+)(?::(.+))?$", Pattern.MULTILINE)
```

## meteordevelopment.meteorclient.systems.proxies.Proxies.PROXY_PATTERN_URI

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/proxies/Proxies.java:88`

```java
public static final Pattern PROXY_PATTERN_URI = Pattern.compile("^(?:(socks|socks4|socks5)://)?(?:(?<user>[\\w~-]+)(:(?<pass>[\\w~-]+))?@)?(?<addr>(?:0*(?:\\d|[1-9]\\d|1\\d\\d|2[0-4]\\d|25[0-5])(?:\\.(?!:)|)){4}):(?!0)(?<port>\\d{1,4}|[1-5]\\d{4}|6[0-4]\\d{3}|65[0-4]\\d{2}|655[0-2]\\d|6553[0-5])$", Pattern.MULTILINE)
```

## meteordevelopment.meteorclient.systems.proxies.Proxies.refreshing

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/proxies/Proxies.java:91`

```java
public boolean refreshing
```

## meteordevelopment.meteorclient.systems.proxies.Proxies.Proxies

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/proxies/Proxies.java:93`

```java
public Proxies()
```

## meteordevelopment.meteorclient.systems.proxies.Proxies.get

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/proxies/Proxies.java:97`

```java
public static Proxies get()
```

## meteordevelopment.meteorclient.systems.proxies.Proxies.add

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/proxies/Proxies.java:101`

```java
public boolean add(Proxy proxy)
```

## meteordevelopment.meteorclient.systems.proxies.Proxies.remove

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/proxies/Proxies.java:115`

```java
public void remove(Proxy proxy)
```

## meteordevelopment.meteorclient.systems.proxies.Proxies.getEnabled

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/proxies/Proxies.java:121`

```java
public Proxy getEnabled()
```

## meteordevelopment.meteorclient.systems.proxies.Proxies.setEnabled

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/proxies/Proxies.java:129`

```java
public void setEnabled(Proxy proxy, boolean enabled)
```

## meteordevelopment.meteorclient.systems.proxies.Proxies.checkProxies

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/proxies/Proxies.java:138`

```java
public void checkProxies(boolean all)
```

## meteordevelopment.meteorclient.systems.proxies.Proxies.clean

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/proxies/Proxies.java:183`

```java
public void clean()
```

## meteordevelopment.meteorclient.systems.proxies.Proxies.isEmpty

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/proxies/Proxies.java:199`

```java
public boolean isEmpty()
```

## meteordevelopment.meteorclient.systems.proxies.Proxies.size

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/proxies/Proxies.java:203`

```java
public int size()
```

## meteordevelopment.meteorclient.systems.proxies.Proxies.iterator

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/proxies/Proxies.java:207`

```java
@NonNull @Override public Iterator<Proxy> iterator()
```

## meteordevelopment.meteorclient.systems.proxies.Proxies.toTag

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/proxies/Proxies.java:213`

```java
@Override public CompoundTag toTag()
```

## meteordevelopment.meteorclient.systems.proxies.Proxies.fromTag

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/proxies/Proxies.java:223`

```java
@Override public Proxies fromTag(CompoundTag tag)
```

## meteordevelopment.meteorclient.systems.proxies.Proxy

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/proxies/Proxy.java:27`

```java
public class Proxy implements ISerializable<Proxy>
```

## meteordevelopment.meteorclient.systems.proxies.Proxy.settings

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/proxies/Proxy.java:28`

```java
public final Settings settings = new Settings()
```

## meteordevelopment.meteorclient.systems.proxies.Proxy.name

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/proxies/Proxy.java:33`

```java
public Setting<String> name = sgGeneral.add(new StringSetting.Builder() .name("name") .description("The name of the proxy.") .build() )
```

## meteordevelopment.meteorclient.systems.proxies.Proxy.type

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/proxies/Proxy.java:39`

```java
public Setting<ProxyType> type = sgGeneral.add(new EnumSetting.Builder<ProxyType>() .name("type") .description("The type of proxy.") .defaultValue(ProxyType.Socks5) .build() )
```

## meteordevelopment.meteorclient.systems.proxies.Proxy.address

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/proxies/Proxy.java:46`

```java
public Setting<String> address = sgGeneral.add(new StringSetting.Builder() .name("address") .description("The ip address of the proxy.") .filter(Utils::ipFilter) .build() )
```

## meteordevelopment.meteorclient.systems.proxies.Proxy.port

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/proxies/Proxy.java:53`

```java
public Setting<Integer> port = sgGeneral.add(new IntSetting.Builder() .name("port") .description("The port of the proxy.") .defaultValue(0) .range(0, 65535) .sliderMax(65535) .noSlider() .build() )
```

## meteordevelopment.meteorclient.systems.proxies.Proxy.enabled

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/proxies/Proxy.java:63`

```java
public Setting<Boolean> enabled = sgGeneral.add(new BoolSetting.Builder() .name("enabled") .description("Whether the proxy is enabled.") .defaultValue(true) .build() )
```

## meteordevelopment.meteorclient.systems.proxies.Proxy.username

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/proxies/Proxy.java:72`

```java
public Setting<String> username = sgOptional.add(new StringSetting.Builder() .name("username") .description("The username of the proxy.") .build() )
```

## meteordevelopment.meteorclient.systems.proxies.Proxy.password

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/proxies/Proxy.java:78`

```java
public Setting<String> password = sgOptional.add(new StringSetting.Builder() .name("password") .description("The password of the proxy.") .visible(() -> type.get().equals(ProxyType.Socks5)) .build() )
```

## meteordevelopment.meteorclient.systems.proxies.Proxy.status

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/proxies/Proxy.java:85`

```java
public Status status = Status.UNCHECKED
```

## meteordevelopment.meteorclient.systems.proxies.Proxy.latency

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/proxies/Proxy.java:86`

```java
public long latency
```

## meteordevelopment.meteorclient.systems.proxies.Proxy.Proxy

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/proxies/Proxy.java:96`

```java
public Proxy(Tag tag)
```

## meteordevelopment.meteorclient.systems.proxies.Proxy.resolveAddress

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/proxies/Proxy.java:100`

```java
public boolean resolveAddress()
```

## meteordevelopment.meteorclient.systems.proxies.Proxy.checkStatus

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/proxies/Proxy.java:111`

```java
public int checkStatus()
```

## meteordevelopment.meteorclient.systems.proxies.Proxy.Builder

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/proxies/Proxy.java:205`

```java
public static class Builder
```

## meteordevelopment.meteorclient.systems.proxies.Proxy.Builder.type

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/proxies/Proxy.java:206`

```java
protected ProxyType type = ProxyType.Socks5
```

## meteordevelopment.meteorclient.systems.proxies.Proxy.Builder.address

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/proxies/Proxy.java:207`

```java
protected String address = ""
```

## meteordevelopment.meteorclient.systems.proxies.Proxy.Builder.port

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/proxies/Proxy.java:208`

```java
protected int port = 0
```

## meteordevelopment.meteorclient.systems.proxies.Proxy.Builder.name

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/proxies/Proxy.java:209`

```java
protected String name = ""
```

## meteordevelopment.meteorclient.systems.proxies.Proxy.Builder.username

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/proxies/Proxy.java:210`

```java
protected String username = ""
```

## meteordevelopment.meteorclient.systems.proxies.Proxy.Builder.password

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/proxies/Proxy.java:211`

```java
protected String password = ""
```

## meteordevelopment.meteorclient.systems.proxies.Proxy.Builder.enabled

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/proxies/Proxy.java:212`

```java
protected boolean enabled = false
```

## meteordevelopment.meteorclient.systems.proxies.Proxy.Builder.type

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/proxies/Proxy.java:214`

```java
public Builder type(ProxyType type)
```

## meteordevelopment.meteorclient.systems.proxies.Proxy.Builder.address

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/proxies/Proxy.java:219`

```java
public Builder address(String address)
```

## meteordevelopment.meteorclient.systems.proxies.Proxy.Builder.port

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/proxies/Proxy.java:224`

```java
public Builder port(int port)
```

## meteordevelopment.meteorclient.systems.proxies.Proxy.Builder.name

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/proxies/Proxy.java:229`

```java
public Builder name(String name)
```

## meteordevelopment.meteorclient.systems.proxies.Proxy.Builder.username

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/proxies/Proxy.java:234`

```java
public Builder username(String username)
```

## meteordevelopment.meteorclient.systems.proxies.Proxy.Builder.password

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/proxies/Proxy.java:239`

```java
public Builder password(String password)
```

## meteordevelopment.meteorclient.systems.proxies.Proxy.Builder.enabled

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/proxies/Proxy.java:244`

```java
public Builder enabled(boolean enabled)
```

## meteordevelopment.meteorclient.systems.proxies.Proxy.Builder.build

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/proxies/Proxy.java:249`

```java
public Proxy build()
```

## meteordevelopment.meteorclient.systems.proxies.Proxy.toTag

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/proxies/Proxy.java:264`

```java
@Override public CompoundTag toTag()
```

## meteordevelopment.meteorclient.systems.proxies.Proxy.fromTag

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/proxies/Proxy.java:273`

```java
@Override public Proxy fromTag(CompoundTag tag)
```

## meteordevelopment.meteorclient.systems.proxies.Proxy.equals

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/proxies/Proxy.java:280`

```java
@Override public boolean equals(Object o)
```

## meteordevelopment.meteorclient.systems.proxies.Proxy.Status

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/proxies/Proxy.java:288`

```java
public enum Status
```

## meteordevelopment.meteorclient.systems.proxies.Proxy.Status.toString

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/proxies/Proxy.java:294`

```java
@Override public String toString()
```

## meteordevelopment.meteorclient.systems.proxies.Proxy.Status.getColor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/proxies/Proxy.java:304`

```java
public Color getColor()
```

## meteordevelopment.meteorclient.systems.proxies.ProxyType

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/proxies/ProxyType.java:10`

```java
public enum ProxyType
```

## meteordevelopment.meteorclient.systems.proxies.ProxyType.parse

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/proxies/ProxyType.java:14`

```java
@Nullable public static ProxyType parse(String group)
```
