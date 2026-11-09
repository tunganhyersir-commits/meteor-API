# utils/network

Khai báo Java có cú pháp public/protected. Không bao gồm API kế thừa/tổng hợp bởi compiler; xem kiểm tra bytecode riêng.

## meteordevelopment.meteorclient.utils.network.Capes

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/network/Capes.java:24`

```java
public class Capes
```

## meteordevelopment.meteorclient.utils.network.Capes.init

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/network/Capes.java:39`

```java
@PreInit(dependencies = MeteorExecutor.class) public static void init()
```

## meteordevelopment.meteorclient.utils.network.Capes.get

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/network/Capes.java:101`

```java
public static Identifier get(Player player)
```

## meteordevelopment.meteorclient.utils.network.FailedHttpResponse

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/network/FailedHttpResponse.java:27`

```java
public record FailedHttpResponse<T>(HttpRequest request, Exception exception) implements HttpResponse<T>
```

## meteordevelopment.meteorclient.utils.network.FailedHttpResponse.statusCode

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/network/FailedHttpResponse.java:28`

```java
@Override public int statusCode()
```

## meteordevelopment.meteorclient.utils.network.FailedHttpResponse.previousResponse

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/network/FailedHttpResponse.java:33`

```java
@Override public Optional<HttpResponse<T>> previousResponse()
```

## meteordevelopment.meteorclient.utils.network.FailedHttpResponse.headers

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/network/FailedHttpResponse.java:38`

```java
@Override public HttpHeaders headers()
```

## meteordevelopment.meteorclient.utils.network.FailedHttpResponse.body

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/network/FailedHttpResponse.java:43`

```java
@Override public T body()
```

## meteordevelopment.meteorclient.utils.network.FailedHttpResponse.sslSession

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/network/FailedHttpResponse.java:48`

```java
@Override public Optional<SSLSession> sslSession()
```

## meteordevelopment.meteorclient.utils.network.FailedHttpResponse.uri

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/network/FailedHttpResponse.java:53`

```java
@Override public URI uri()
```

## meteordevelopment.meteorclient.utils.network.FailedHttpResponse.version

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/network/FailedHttpResponse.java:58`

```java
@Override public HttpClient.@Nullable Version version()
```

## meteordevelopment.meteorclient.utils.network.Http

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/network/Http.java:26`

```java
public class Http
```

## meteordevelopment.meteorclient.utils.network.Http.SUCCESS

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/network/Http.java:27`

```java
public static final int SUCCESS = 200
```

## meteordevelopment.meteorclient.utils.network.Http.BAD_REQUEST

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/network/Http.java:28`

```java
public static final int BAD_REQUEST = 400
```

## meteordevelopment.meteorclient.utils.network.Http.UNAUTHORIZED

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/network/Http.java:29`

```java
public static final int UNAUTHORIZED = 401
```

## meteordevelopment.meteorclient.utils.network.Http.FORBIDDEN

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/network/Http.java:30`

```java
public static final int FORBIDDEN = 403
```

## meteordevelopment.meteorclient.utils.network.Http.NOT_FOUND

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/network/Http.java:31`

```java
public static final int NOT_FOUND = 404
```

## meteordevelopment.meteorclient.utils.network.Http.Request

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/network/Http.java:46`

```java
public static class Request
```

## meteordevelopment.meteorclient.utils.network.Http.Request.header

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/network/Http.java:60`

```java
public Request header(String name, String value)
```

## meteordevelopment.meteorclient.utils.network.Http.Request.bearer

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/network/Http.java:66`

```java
public Request bearer(String token)
```

## meteordevelopment.meteorclient.utils.network.Http.Request.bodyString

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/network/Http.java:72`

```java
public Request bodyString(String string)
```

## meteordevelopment.meteorclient.utils.network.Http.Request.bodyForm

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/network/Http.java:80`

```java
public Request bodyForm(String string)
```

## meteordevelopment.meteorclient.utils.network.Http.Request.bodyJson

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/network/Http.java:88`

```java
public Request bodyJson(String string)
```

## meteordevelopment.meteorclient.utils.network.Http.Request.bodyJson

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/network/Http.java:96`

```java
public Request bodyJson(Object object)
```

## meteordevelopment.meteorclient.utils.network.Http.Request.ignoreExceptions

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/network/Http.java:104`

```java
public Request ignoreExceptions()
```

## meteordevelopment.meteorclient.utils.network.Http.Request.exceptionHandler

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/network/Http.java:110`

```java
public Request exceptionHandler(Consumer<Exception> exceptionHandler)
```

## meteordevelopment.meteorclient.utils.network.Http.Request.send

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/network/Http.java:135`

```java
public void send()
```

## meteordevelopment.meteorclient.utils.network.Http.Request.sendResponse

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/network/Http.java:139`

```java
public HttpResponse<Void> sendResponse()
```

## meteordevelopment.meteorclient.utils.network.Http.Request.sendInputStream

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/network/Http.java:143`

```java
@Nullable public InputStream sendInputStream()
```

## meteordevelopment.meteorclient.utils.network.Http.Request.sendInputStreamResponse

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/network/Http.java:148`

```java
public HttpResponse<InputStream> sendInputStreamResponse()
```

## meteordevelopment.meteorclient.utils.network.Http.Request.sendString

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/network/Http.java:152`

```java
@Nullable public String sendString()
```

## meteordevelopment.meteorclient.utils.network.Http.Request.sendStringResponse

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/network/Http.java:157`

```java
public HttpResponse<String> sendStringResponse()
```

## meteordevelopment.meteorclient.utils.network.Http.Request.sendLines

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/network/Http.java:161`

```java
@Nullable public Stream<String> sendLines()
```

## meteordevelopment.meteorclient.utils.network.Http.Request.sendLinesResponse

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/network/Http.java:166`

```java
public HttpResponse<Stream<String>> sendLinesResponse()
```

## meteordevelopment.meteorclient.utils.network.Http.Request.sendJson

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/network/Http.java:170`

```java
@Nullable public <T> T sendJson(Type type)
```

## meteordevelopment.meteorclient.utils.network.Http.Request.sendJsonResponse

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/network/Http.java:175`

```java
public <T> HttpResponse<T> sendJsonResponse(Type type)
```

## meteordevelopment.meteorclient.utils.network.Http.get

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/network/Http.java:180`

```java
public static Request get(String url)
```

## meteordevelopment.meteorclient.utils.network.Http.post

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/network/Http.java:184`

```java
public static Request post(String url)
```

## meteordevelopment.meteorclient.utils.network.JsonBodyHandler

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/network/JsonBodyHandler.java:19`

```java
public record JsonBodyHandler<T>(HttpResponse.BodySubscriber<InputStream> delegate, Gson gson, Type type) implements HttpResponse.BodySubscriber<T>
```

## meteordevelopment.meteorclient.utils.network.JsonBodyHandler.ofJson

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/network/JsonBodyHandler.java:20`

```java
public static <T> HttpResponse.BodyHandler<T> ofJson(Gson gson, Type type)
```

## meteordevelopment.meteorclient.utils.network.JsonBodyHandler.getBody

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/network/JsonBodyHandler.java:24`

```java
@Override public CompletionStage<T> getBody()
```

## meteordevelopment.meteorclient.utils.network.JsonBodyHandler.onSubscribe

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/network/JsonBodyHandler.java:29`

```java
@Override public void onSubscribe(Flow.Subscription subscription)
```

## meteordevelopment.meteorclient.utils.network.JsonBodyHandler.onNext

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/network/JsonBodyHandler.java:34`

```java
@Override public void onNext(List<ByteBuffer> item)
```

## meteordevelopment.meteorclient.utils.network.JsonBodyHandler.onError

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/network/JsonBodyHandler.java:39`

```java
@Override public void onError(Throwable throwable)
```

## meteordevelopment.meteorclient.utils.network.JsonBodyHandler.onComplete

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/network/JsonBodyHandler.java:44`

```java
@Override public void onComplete()
```

## meteordevelopment.meteorclient.utils.network.MeteorExecutor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/network/MeteorExecutor.java:14`

```java
public class MeteorExecutor
```

## meteordevelopment.meteorclient.utils.network.MeteorExecutor.executor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/network/MeteorExecutor.java:15`

```java
public static ExecutorService executor
```

## meteordevelopment.meteorclient.utils.network.MeteorExecutor.init

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/network/MeteorExecutor.java:20`

```java
@PreInit public static void init()
```

## meteordevelopment.meteorclient.utils.network.MeteorExecutor.execute

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/network/MeteorExecutor.java:32`

```java
public static void execute(Runnable task)
```

## meteordevelopment.meteorclient.utils.network.OnlinePlayers

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/network/OnlinePlayers.java:8`

```java
public class OnlinePlayers
```

## meteordevelopment.meteorclient.utils.network.OnlinePlayers.update

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/network/OnlinePlayers.java:14`

```java
public static void update()
```

## meteordevelopment.meteorclient.utils.network.OnlinePlayers.leave

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/network/OnlinePlayers.java:24`

```java
public static void leave()
```

## meteordevelopment.meteorclient.utils.network.PacketUtils

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/network/PacketUtils.java:34`

```java
@SuppressWarnings("unused") public class PacketUtils
```

## meteordevelopment.meteorclient.utils.network.PacketUtils.getPackets

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/network/PacketUtils.java:41`

```java
public static Set<PacketType<? extends @NonNull Packet<?>>> getPackets()
```

## meteordevelopment.meteorclient.utils.network.PacketUtils.getClientboundPackets

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/network/PacketUtils.java:45`

```java
public static Set<PacketType<? extends @NonNull Packet<?>>> getClientboundPackets()
```

## meteordevelopment.meteorclient.utils.network.PacketUtils.getServerboundPackets

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/network/PacketUtils.java:49`

```java
public static Set<PacketType<? extends @NonNull Packet<?>>> getServerboundPackets()
```

## meteordevelopment.meteorclient.utils.network.PacketUtils.getClientboundPacket

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/network/PacketUtils.java:53`

```java
public static @Nullable PacketType<? extends @NonNull Packet<?>> getClientboundPacket(Identifier id)
```

## meteordevelopment.meteorclient.utils.network.PacketUtils.getServerboundPacket

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/network/PacketUtils.java:57`

```java
public static @Nullable PacketType<? extends @NonNull Packet<?>> getServerboundPacket(Identifier id)
```

## meteordevelopment.meteorclient.utils.network.PacketUtils.getPacket

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/network/PacketUtils.java:61`

```java
public static @Nullable PacketType<? extends @NonNull Packet<?>> getPacket(Identifier id)
```

## meteordevelopment.meteorclient.utils.network.PacketUtils.getPacket

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/network/PacketUtils.java:66`

```java
public static @Nullable PacketType<? extends @NonNull Packet<?>> getPacket(String name)
```
