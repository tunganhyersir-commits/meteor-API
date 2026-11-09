# meteorlib/foundation

Khai báo Java có cú pháp public/protected. Không bao gồm API kế thừa/tổng hợp bởi compiler; xem kiểm tra bytecode riêng.

## dev.meteorlib.foundation.NameRules

Nguồn: `foundation/src/main/java/dev/meteorlib/foundation/NameRules.java:11`

```java
public final class NameRules
```

## dev.meteorlib.foundation.NameRules.scoped

Nguồn: `foundation/src/main/java/dev/meteorlib/foundation/NameRules.java:14`

```java
public static String scoped(String namespace, String localName)
```

## dev.meteorlib.foundation.NameRules.requireDistinct

Nguồn: `foundation/src/main/java/dev/meteorlib/foundation/NameRules.java:22`

```java
public static void requireDistinct(Collection<String> names)
```

## dev.meteorlib.foundation.NameRules.rejectOverlap

Nguồn: `foundation/src/main/java/dev/meteorlib/foundation/NameRules.java:33`

```java
public static void rejectOverlap(Collection<String> proposed, Collection<String> existing, String kind)
```

## dev.meteorlib.foundation.NameRules.requireCategoryDistinct

Nguồn: `foundation/src/main/java/dev/meteorlib/foundation/NameRules.java:43`

```java
public static void requireCategoryDistinct(String proposed, Collection<String> existing)
```

## dev.meteorlib.foundation.NamespacedId

Nguồn: `foundation/src/main/java/dev/meteorlib/foundation/NamespacedId.java:8`

```java
public record NamespacedId(String namespace, String path)
```

## dev.meteorlib.foundation.NamespacedId.NamespacedId

Nguồn: `foundation/src/main/java/dev/meteorlib/foundation/NamespacedId.java:12`

```java
public NamespacedId
```

## dev.meteorlib.foundation.NamespacedId.parse

Nguồn: `foundation/src/main/java/dev/meteorlib/foundation/NamespacedId.java:19`

```java
public static NamespacedId parse(String input)
```

## dev.meteorlib.foundation.NamespacedId.toString

Nguồn: `foundation/src/main/java/dev/meteorlib/foundation/NamespacedId.java:27`

```java
@Override public String toString()
```

## dev.meteorlib.foundation.Registration

Nguồn: `foundation/src/main/java/dev/meteorlib/foundation/Registration.java:8`

```java
@FunctionalInterface public interface Registration extends AutoCloseable
```

## dev.meteorlib.foundation.Registration.close

Nguồn: `foundation/src/main/java/dev/meteorlib/foundation/Registration.java:10`

```java
@Override void close()
```

## dev.meteorlib.foundation.Registration.once

Nguồn: `foundation/src/main/java/dev/meteorlib/foundation/Registration.java:13`

```java
static Registration once(Runnable action)
```

## dev.meteorlib.foundation.RegistrationConflictException

Nguồn: `foundation/src/main/java/dev/meteorlib/foundation/RegistrationConflictException.java:5`

```java
public final class RegistrationConflictException extends IllegalStateException
```

## dev.meteorlib.foundation.RegistrationConflictException.RegistrationConflictException

Nguồn: `foundation/src/main/java/dev/meteorlib/foundation/RegistrationConflictException.java:6`

```java
public RegistrationConflictException(String message)
```

## dev.meteorlib.foundation.RegistrationResult

Nguồn: `foundation/src/main/java/dev/meteorlib/foundation/RegistrationResult.java:9`

```java
public record RegistrationResult<T>(Status status, Optional<T> value, String message)
```

## dev.meteorlib.foundation.RegistrationResult.Status

Nguồn: `foundation/src/main/java/dev/meteorlib/foundation/RegistrationResult.java:10`

```java
public enum Status
```

## dev.meteorlib.foundation.RegistrationResult.RegistrationResult

Nguồn: `foundation/src/main/java/dev/meteorlib/foundation/RegistrationResult.java:12`

```java
public RegistrationResult
```

## dev.meteorlib.foundation.RegistrationResult.success

Nguồn: `foundation/src/main/java/dev/meteorlib/foundation/RegistrationResult.java:18`

```java
public boolean success()
```

## dev.meteorlib.foundation.RegistrationResult.attempt

Nguồn: `foundation/src/main/java/dev/meteorlib/foundation/RegistrationResult.java:20`

```java
public static <T> RegistrationResult<T> attempt(Supplier<T> action)
```

## dev.meteorlib.foundation.ResourceScope

Nguồn: `foundation/src/main/java/dev/meteorlib/foundation/ResourceScope.java:9`

```java
public final class ResourceScope implements AutoCloseable
```

## dev.meteorlib.foundation.ResourceScope.own

Nguồn: `foundation/src/main/java/dev/meteorlib/foundation/ResourceScope.java:14`

```java
public <T extends AutoCloseable> T own(T resource)
```

## dev.meteorlib.foundation.ResourceScope.defer

Nguồn: `foundation/src/main/java/dev/meteorlib/foundation/ResourceScope.java:21`

```java
public Registration defer(Runnable cleanup)
```

## dev.meteorlib.foundation.ResourceScope.isClosed

Nguồn: `foundation/src/main/java/dev/meteorlib/foundation/ResourceScope.java:25`

```java
public boolean isClosed()
```

## dev.meteorlib.foundation.ResourceScope.close

Nguồn: `foundation/src/main/java/dev/meteorlib/foundation/ResourceScope.java:30`

```java
@Override public void close()
```

## dev.meteorlib.foundation.ServiceRegistry

Nguồn: `foundation/src/main/java/dev/meteorlib/foundation/ServiceRegistry.java:10`

```java
public final class ServiceRegistry
```

## dev.meteorlib.foundation.ServiceRegistry.register

Nguồn: `foundation/src/main/java/dev/meteorlib/foundation/ServiceRegistry.java:13`

```java
public synchronized <T> Registration register(Class<T> type, T service)
```

## dev.meteorlib.foundation.ServiceRegistry.find

Nguồn: `foundation/src/main/java/dev/meteorlib/foundation/ServiceRegistry.java:22`

```java
public synchronized <T> Optional<T> find(Class<T> type)
```

## dev.meteorlib.foundation.ServiceRegistry.require

Nguồn: `foundation/src/main/java/dev/meteorlib/foundation/ServiceRegistry.java:26`

```java
public <T> T require(Class<T> type)
```

## dev.meteorlib.foundation.TickScheduler

Nguồn: `foundation/src/main/java/dev/meteorlib/foundation/TickScheduler.java:10`

```java
public final class TickScheduler implements AutoCloseable
```

## dev.meteorlib.foundation.TickScheduler.TickScheduler

Nguồn: `foundation/src/main/java/dev/meteorlib/foundation/TickScheduler.java:22`

```java
public TickScheduler(int capacity, int perTick, Consumer<RuntimeException> errors)
```

## dev.meteorlib.foundation.TickScheduler.schedule

Nguồn: `foundation/src/main/java/dev/meteorlib/foundation/TickScheduler.java:29`

```java
public Registration schedule(long delayTicks, Runnable action)
```

## dev.meteorlib.foundation.TickScheduler.pending

Nguồn: `foundation/src/main/java/dev/meteorlib/foundation/TickScheduler.java:40`

```java
public int pending()
```

## dev.meteorlib.foundation.TickScheduler.currentTick

Nguồn: `foundation/src/main/java/dev/meteorlib/foundation/TickScheduler.java:41`

```java
public long currentTick()
```

## dev.meteorlib.foundation.TickScheduler.tick

Nguồn: `foundation/src/main/java/dev/meteorlib/foundation/TickScheduler.java:43`

```java
public void tick()
```

## dev.meteorlib.foundation.TickScheduler.close

Nguồn: `foundation/src/main/java/dev/meteorlib/foundation/TickScheduler.java:59`

```java
@Override public void close()
```

## dev.meteorlib.foundation.FoundationTest

Nguồn: `foundation/src/test/java/dev/meteorlib/foundation/FoundationTest.java:10`

```java
public final class FoundationTest
```

## dev.meteorlib.foundation.FoundationTest.main

Nguồn: `foundation/src/test/java/dev/meteorlib/foundation/FoundationTest.java:13`

```java
public static void main(String[] args) throws Exception
```
