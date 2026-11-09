# utils/files

Khai báo Java có cú pháp public/protected. Không bao gồm API kế thừa/tổng hợp bởi compiler; xem kiểm tra bytecode riêng.

## meteordevelopment.meteorclient.utils.files.ByteBufferUtils

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/files/ByteBufferUtils.java:21`

```java
@NullMarked public final class ByteBufferUtils
```

## meteordevelopment.meteorclient.utils.files.ByteBufferUtils.readFully

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/files/ByteBufferUtils.java:25`

```java
public static ByteBuffer readFully(Path path, IntFunction<ByteBuffer> allocator) throws IOException
```

## meteordevelopment.meteorclient.utils.files.ByteBufferUtils.readFully

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/files/ByteBufferUtils.java:41`

```java
public static ByteBuffer readFully(ReadableByteChannel channel, IntFunction<ByteBuffer> allocator) throws IOException
```

## meteordevelopment.meteorclient.utils.files.StreamUtils

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/files/StreamUtils.java:13`

```java
public class StreamUtils
```

## meteordevelopment.meteorclient.utils.files.StreamUtils.copy

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/files/StreamUtils.java:17`

```java
public static void copy(File from, File to)
```

## meteordevelopment.meteorclient.utils.files.StreamUtils.copy

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/files/StreamUtils.java:26`

```java
public static void copy(InputStream in, File to)
```
