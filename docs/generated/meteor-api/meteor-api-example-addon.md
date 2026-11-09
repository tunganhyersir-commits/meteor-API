# meteor-api/example-addon

Khai báo Java có cú pháp public/protected. Không bao gồm API kế thừa/tổng hợp bởi compiler; xem kiểm tra bytecode riêng.

## dev.meteorapi.example.ExampleAddon

Nguồn: `example-addon/src/main/java/dev/meteorapi/example/ExampleAddon.java:19`

```java
public final class ExampleAddon implements ClientModInitializer
```

## dev.meteorapi.example.ExampleAddon.onInitializeClient

Nguồn: `example-addon/src/main/java/dev/meteorapi/example/ExampleAddon.java:35`

```java
@Override public void onInitializeClient()
```

## dev.meteorapi.example.ExampleClient

Nguồn: `example-addon/src/main/java/dev/meteorapi/example/ExampleClient.java:13`

```java
public final class ExampleClient
```

## dev.meteorapi.example.ExampleClient.register

Nguồn: `example-addon/src/main/java/dev/meteorapi/example/ExampleClient.java:16`

```java
public static void register()
```

## dev.meteorapi.example.ExamplePayload

Nguồn: `example-addon/src/main/java/dev/meteorapi/example/ExamplePayload.java:8`

```java
public record ExamplePayload(String text) implements CustomPayload
```

## dev.meteorapi.example.ExamplePayload.ID

Nguồn: `example-addon/src/main/java/dev/meteorapi/example/ExamplePayload.java:9`

```java
public static final Id<ExamplePayload> ID = new Id<>(Identifier.of("meteor-api-example", "message"))
```

## dev.meteorapi.example.ExamplePayload.CODEC

Nguồn: `example-addon/src/main/java/dev/meteorapi/example/ExamplePayload.java:10`

```java
public static final PacketCodec<RegistryByteBuf, ExamplePayload> CODEC = PacketCodec.of( (payload, buffer) -> buffer.writeString(payload.text(), 256), buffer -> new ExamplePayload(buffer.readString(256)))
```

## dev.meteorapi.example.ExamplePayload.getId

Nguồn: `example-addon/src/main/java/dev/meteorapi/example/ExamplePayload.java:13`

```java
@Override public Id<? extends CustomPayload> getId()
```
