# utils/network

Khai báo Java có cú pháp public/protected. Không bao gồm API kế thừa/tổng hợp bởi compiler; xem kiểm tra bytecode riêng.

## meteordevelopment.meteorclient.utils.network.Capes

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/network/Capes.java:24`

```java
public class Capes
```

## meteordevelopment.meteorclient.utils.network.Capes.init

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/network/Capes.java:39`

```java
@PreInit(dependencies = MeteorExecutor.class) public static void init()
```

## meteordevelopment.meteorclient.utils.network.Capes.get

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/network/Capes.java:101`

```java
public static Identifier get(PlayerEntity player)
```

## meteordevelopment.meteorclient.utils.network.FailedHttpResponse

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/network/FailedHttpResponse.java:26`

```java
public record FailedHttpResponse<T>(HttpRequest request, Exception exception) implements HttpResponse<T>
```

## meteordevelopment.meteorclient.utils.network.FailedHttpResponse.statusCode

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/network/FailedHttpResponse.java:27`

```java
@Override public int statusCode()
```

## meteordevelopment.meteorclient.utils.network.FailedHttpResponse.previousResponse

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/network/FailedHttpResponse.java:32`

```java
@Override public Optional<HttpResponse<T>> previousResponse()
```

## meteordevelopment.meteorclient.utils.network.FailedHttpResponse.headers

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/network/FailedHttpResponse.java:37`

```java
@Override public HttpHeaders headers()
```

## meteordevelopment.meteorclient.utils.network.FailedHttpResponse.body

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/network/FailedHttpResponse.java:42`

```java
@Override public T body()
```

## meteordevelopment.meteorclient.utils.network.FailedHttpResponse.sslSession

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/network/FailedHttpResponse.java:47`

```java
@Override public Optional<SSLSession> sslSession()
```

## meteordevelopment.meteorclient.utils.network.FailedHttpResponse.uri

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/network/FailedHttpResponse.java:52`

```java
@Override public URI uri()
```

## meteordevelopment.meteorclient.utils.network.FailedHttpResponse.version

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/network/FailedHttpResponse.java:57`

```java
@Nullable @Override public HttpClient.Version version()
```

## meteordevelopment.meteorclient.utils.network.Http

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/network/Http.java:26`

```java
public class Http
```

## meteordevelopment.meteorclient.utils.network.Http.SUCCESS

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/network/Http.java:27`

```java
public static final int SUCCESS = 200
```

## meteordevelopment.meteorclient.utils.network.Http.BAD_REQUEST

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/network/Http.java:28`

```java
public static final int BAD_REQUEST = 400
```

## meteordevelopment.meteorclient.utils.network.Http.UNAUTHORIZED

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/network/Http.java:29`

```java
public static final int UNAUTHORIZED = 401
```

## meteordevelopment.meteorclient.utils.network.Http.FORBIDDEN

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/network/Http.java:30`

```java
public static final int FORBIDDEN = 403
```

## meteordevelopment.meteorclient.utils.network.Http.NOT_FOUND

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/network/Http.java:31`

```java
public static final int NOT_FOUND = 404
```

## meteordevelopment.meteorclient.utils.network.Http.Request

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/network/Http.java:46`

```java
public static class Request
```

## meteordevelopment.meteorclient.utils.network.Http.Request.header

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/network/Http.java:60`

```java
public Request header(String name, String value)
```

## meteordevelopment.meteorclient.utils.network.Http.Request.bearer

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/network/Http.java:66`

```java
public Request bearer(String token)
```

## meteordevelopment.meteorclient.utils.network.Http.Request.bodyString

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/network/Http.java:72`

```java
public Request bodyString(String string)
```

## meteordevelopment.meteorclient.utils.network.Http.Request.bodyForm

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/network/Http.java:80`

```java
public Request bodyForm(String string)
```

## meteordevelopment.meteorclient.utils.network.Http.Request.bodyJson

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/network/Http.java:88`

```java
public Request bodyJson(String string)
```

## meteordevelopment.meteorclient.utils.network.Http.Request.bodyJson

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/network/Http.java:96`

```java
public Request bodyJson(Object object)
```

## meteordevelopment.meteorclient.utils.network.Http.Request.ignoreExceptions

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/network/Http.java:104`

```java
public Request ignoreExceptions()
```

## meteordevelopment.meteorclient.utils.network.Http.Request.exceptionHandler

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/network/Http.java:109`

```java
public Request exceptionHandler(Consumer<Exception> exceptionHandler)
```

## meteordevelopment.meteorclient.utils.network.Http.Request.send

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/network/Http.java:134`

```java
public void send()
```

## meteordevelopment.meteorclient.utils.network.Http.Request.sendResponse

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/network/Http.java:138`

```java
public HttpResponse<Void> sendResponse()
```

## meteordevelopment.meteorclient.utils.network.Http.Request.sendInputStream

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/network/Http.java:142`

```java
@Nullable public InputStream sendInputStream()
```

## meteordevelopment.meteorclient.utils.network.Http.Request.sendInputStreamResponse

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/network/Http.java:147`

```java
public HttpResponse<InputStream> sendInputStreamResponse()
```

## meteordevelopment.meteorclient.utils.network.Http.Request.sendString

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/network/Http.java:151`

```java
@Nullable public String sendString()
```

## meteordevelopment.meteorclient.utils.network.Http.Request.sendStringResponse

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/network/Http.java:156`

```java
public HttpResponse<String> sendStringResponse()
```

## meteordevelopment.meteorclient.utils.network.Http.Request.sendLines

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/network/Http.java:160`

```java
@Nullable public Stream<String> sendLines()
```

## meteordevelopment.meteorclient.utils.network.Http.Request.sendLinesResponse

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/network/Http.java:165`

```java
public HttpResponse<Stream<String>> sendLinesResponse()
```

## meteordevelopment.meteorclient.utils.network.Http.Request.sendJson

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/network/Http.java:169`

```java
@Nullable public <T> T sendJson(Type type)
```

## meteordevelopment.meteorclient.utils.network.Http.Request.sendJsonResponse

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/network/Http.java:174`

```java
public <T> HttpResponse<T> sendJsonResponse(Type type)
```

## meteordevelopment.meteorclient.utils.network.Http.get

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/network/Http.java:179`

```java
public static Request get(String url)
```

## meteordevelopment.meteorclient.utils.network.Http.post

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/network/Http.java:183`

```java
public static Request post(String url)
```

## meteordevelopment.meteorclient.utils.network.JsonBodyHandler

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/network/JsonBodyHandler.java:19`

```java
public record JsonBodyHandler<T>(HttpResponse.BodySubscriber<InputStream> delegate, Gson gson, Type type) implements HttpResponse.BodySubscriber<T>
```

## meteordevelopment.meteorclient.utils.network.JsonBodyHandler.ofJson

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/network/JsonBodyHandler.java:20`

```java
public static <T> HttpResponse.BodyHandler<T> ofJson(Gson gson, Type type)
```

## meteordevelopment.meteorclient.utils.network.JsonBodyHandler.getBody

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/network/JsonBodyHandler.java:24`

```java
@Override public CompletionStage<T> getBody()
```

## meteordevelopment.meteorclient.utils.network.JsonBodyHandler.onSubscribe

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/network/JsonBodyHandler.java:29`

```java
@Override public void onSubscribe(Flow.Subscription subscription)
```

## meteordevelopment.meteorclient.utils.network.JsonBodyHandler.onNext

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/network/JsonBodyHandler.java:34`

```java
@Override public void onNext(List<ByteBuffer> item)
```

## meteordevelopment.meteorclient.utils.network.JsonBodyHandler.onError

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/network/JsonBodyHandler.java:39`

```java
@Override public void onError(Throwable throwable)
```

## meteordevelopment.meteorclient.utils.network.JsonBodyHandler.onComplete

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/network/JsonBodyHandler.java:44`

```java
@Override public void onComplete()
```

## meteordevelopment.meteorclient.utils.network.MeteorExecutor

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/network/MeteorExecutor.java:14`

```java
public class MeteorExecutor
```

## meteordevelopment.meteorclient.utils.network.MeteorExecutor.executor

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/network/MeteorExecutor.java:15`

```java
public static ExecutorService executor
```

## meteordevelopment.meteorclient.utils.network.MeteorExecutor.init

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/network/MeteorExecutor.java:20`

```java
@PreInit public static void init()
```

## meteordevelopment.meteorclient.utils.network.MeteorExecutor.execute

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/network/MeteorExecutor.java:32`

```java
public static void execute(Runnable task)
```

## meteordevelopment.meteorclient.utils.network.OnlinePlayers

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/network/OnlinePlayers.java:8`

```java
public class OnlinePlayers
```

## meteordevelopment.meteorclient.utils.network.OnlinePlayers.update

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/network/OnlinePlayers.java:14`

```java
public static void update()
```

## meteordevelopment.meteorclient.utils.network.OnlinePlayers.leave

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/network/OnlinePlayers.java:24`

```java
public static void leave()
```

## meteordevelopment.meteorclient.utils.network.PacketUtils

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/network/PacketUtils.java:16`

```java
public class PacketUtils
```

## meteordevelopment.meteorclient.utils.network.PacketUtils.PACKETS

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/network/PacketUtils.java:23`

```java
public static final Set<Class<? extends Packet<?>>> PACKETS = Sets.union(getC2SPackets(), getS2CPackets())
```

## meteordevelopment.meteorclient.utils.network.PacketUtils.getName

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/network/PacketUtils.java:486`

```java
public static String getName(Class<? extends Packet<?>> packetClass)
```

## meteordevelopment.meteorclient.utils.network.PacketUtils.getPacket

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/network/PacketUtils.java:492`

```java
public static Class<? extends Packet<?>> getPacket(String name)
```

## meteordevelopment.meteorclient.utils.network.PacketUtils.getS2CPackets

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/network/PacketUtils.java:498`

```java
public static Set<Class<? extends Packet<?>>> getS2CPackets()
```

## meteordevelopment.meteorclient.utils.network.PacketUtils.getC2SPackets

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/network/PacketUtils.java:502`

```java
public static Set<Class<? extends Packet<?>>> getC2SPackets()
```

## meteordevelopment.meteorclient.utils.network.PacketUtilsUtil

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/network/PacketUtilsUtil.java:24`

```java
public class PacketUtilsUtil
```

## meteordevelopment.meteorclient.utils.network.PacketUtilsUtil.main

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/network/PacketUtilsUtil.java:28`

```java
public static void main(String[] args)
```

## meteordevelopment.meteorclient.utils.network.PacketUtilsUtil.init

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/network/PacketUtilsUtil.java:36`

```java
public static void init() throws IOException
```
