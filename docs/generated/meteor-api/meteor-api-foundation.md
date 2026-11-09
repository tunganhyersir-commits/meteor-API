# meteor-api/foundation

Khai báo Java có cú pháp public/protected. Không bao gồm API kế thừa/tổng hợp bởi compiler; xem kiểm tra bytecode riêng.

## dev.meteorapi.client.CommandLine

Nguồn: `foundation/src/main/java/dev/meteorapi/client/CommandLine.java:6`

```java
public final class CommandLine
```

## dev.meteorapi.client.CommandLine.parse

Nguồn: `foundation/src/main/java/dev/meteorapi/client/CommandLine.java:8`

```java
public static List<String> parse(String input)
```

## dev.meteorapi.client.FeatureLifecycle

Nguồn: `foundation/src/main/java/dev/meteorapi/client/FeatureLifecycle.java:8`

```java
public abstract class FeatureLifecycle implements AutoCloseable
```

## dev.meteorapi.client.FeatureLifecycle.State

Nguồn: `foundation/src/main/java/dev/meteorapi/client/FeatureLifecycle.java:9`

```java
public enum State
```

## dev.meteorapi.client.FeatureLifecycle.FeatureLifecycle

Nguồn: `foundation/src/main/java/dev/meteorapi/client/FeatureLifecycle.java:15`

```java
protected FeatureLifecycle(NamespacedId id, BiConsumer<NamespacedId, RuntimeException> errors)
```

## dev.meteorapi.client.FeatureLifecycle.id

Nguồn: `foundation/src/main/java/dev/meteorapi/client/FeatureLifecycle.java:18`

```java
public final NamespacedId id()
```

## dev.meteorapi.client.FeatureLifecycle.state

Nguồn: `foundation/src/main/java/dev/meteorapi/client/FeatureLifecycle.java:19`

```java
public final State state()
```

## dev.meteorapi.client.FeatureLifecycle.active

Nguồn: `foundation/src/main/java/dev/meteorapi/client/FeatureLifecycle.java:20`

```java
public final boolean active()
```

## dev.meteorapi.client.FeatureLifecycle.enable

Nguồn: `foundation/src/main/java/dev/meteorapi/client/FeatureLifecycle.java:21`

```java
public final boolean enable()
```

## dev.meteorapi.client.FeatureLifecycle.disable

Nguồn: `foundation/src/main/java/dev/meteorapi/client/FeatureLifecycle.java:33`

```java
public final boolean disable()
```

## dev.meteorapi.client.FeatureLifecycle.toggle

Nguồn: `foundation/src/main/java/dev/meteorapi/client/FeatureLifecycle.java:44`

```java
public final boolean toggle()
```

## dev.meteorapi.client.FeatureLifecycle.close

Nguồn: `foundation/src/main/java/dev/meteorapi/client/FeatureLifecycle.java:45`

```java
@Override public final void close()
```

## dev.meteorapi.client.FeatureLifecycle.onEnable

Nguồn: `foundation/src/main/java/dev/meteorapi/client/FeatureLifecycle.java:46`

```java
protected abstract void onEnable(ResourceScope scope)
```

## dev.meteorapi.client.FeatureLifecycle.onDisable

Nguồn: `foundation/src/main/java/dev/meteorapi/client/FeatureLifecycle.java:47`

```java
protected void onDisable()
```

## dev.meteorapi.event.BoundedMailbox

Nguồn: `foundation/src/main/java/dev/meteorapi/event/BoundedMailbox.java:9`

```java
public final class BoundedMailbox<E>
```

## dev.meteorapi.event.BoundedMailbox.BoundedMailbox

Nguồn: `foundation/src/main/java/dev/meteorapi/event/BoundedMailbox.java:13`

```java
public BoundedMailbox(int capacity)
```

## dev.meteorapi.event.BoundedMailbox.offer

Nguồn: `foundation/src/main/java/dev/meteorapi/event/BoundedMailbox.java:17`

```java
public synchronized boolean offer(E event)
```

## dev.meteorapi.event.BoundedMailbox.drain

Nguồn: `foundation/src/main/java/dev/meteorapi/event/BoundedMailbox.java:22`

```java
public int drain(int limit, Consumer<? super E> receiver)
```

## dev.meteorapi.event.BoundedMailbox.pending

Nguồn: `foundation/src/main/java/dev/meteorapi/event/BoundedMailbox.java:33`

```java
public synchronized int pending()
```

## dev.meteorapi.event.BoundedMailbox.dropped

Nguồn: `foundation/src/main/java/dev/meteorapi/event/BoundedMailbox.java:34`

```java
public synchronized long dropped()
```

## dev.meteorapi.event.BoundedMailbox.clear

Nguồn: `foundation/src/main/java/dev/meteorapi/event/BoundedMailbox.java:35`

```java
public synchronized void clear()
```

## dev.meteorapi.event.EventChannel

Nguồn: `foundation/src/main/java/dev/meteorapi/event/EventChannel.java:21`

```java
public final class EventChannel<E>
```

## dev.meteorapi.event.EventChannel.EventChannel

Nguồn: `foundation/src/main/java/dev/meteorapi/event/EventChannel.java:28`

```java
public EventChannel(int failureLimit, BiConsumer<NamespacedId, RuntimeException> errors)
```

## dev.meteorapi.event.EventChannel.listen

Nguồn: `foundation/src/main/java/dev/meteorapi/event/EventChannel.java:34`

```java
public RegistrationResult<Registration> listen(NamespacedId id, Consumer<? super E> listener)
```

## dev.meteorapi.event.EventChannel.listen

Nguồn: `foundation/src/main/java/dev/meteorapi/event/EventChannel.java:38`

```java
public synchronized RegistrationResult<Registration> listen(NamespacedId id, int priority, Predicate<? super E> filter, Consumer<? super E> listener)
```

## dev.meteorapi.event.EventChannel.post

Nguồn: `foundation/src/main/java/dev/meteorapi/event/EventChannel.java:50`

```java
public void post(E event)
```

## dev.meteorapi.event.EventChannel.size

Nguồn: `foundation/src/main/java/dev/meteorapi/event/EventChannel.java:66`

```java
public int size()
```

## dev.meteorapi.performance.Profiler

Nguồn: `foundation/src/main/java/dev/meteorapi/performance/Profiler.java:10`

```java
public final class Profiler
```

## dev.meteorapi.performance.Profiler.Sample

Nguồn: `foundation/src/main/java/dev/meteorapi/performance/Profiler.java:11`

```java
public record Sample(long count, long totalNanoseconds, long maximumNanoseconds)
```

## dev.meteorapi.performance.Profiler.Sample.averageNanoseconds

Nguồn: `foundation/src/main/java/dev/meteorapi/performance/Profiler.java:12`

```java
public double averageNanoseconds()
```

## dev.meteorapi.performance.Profiler.measure

Nguồn: `foundation/src/main/java/dev/meteorapi/performance/Profiler.java:15`

```java
public Registration measure(NamespacedId id)
```

## dev.meteorapi.performance.Profiler.snapshot

Nguồn: `foundation/src/main/java/dev/meteorapi/performance/Profiler.java:23`

```java
public Map<NamespacedId, Sample> snapshot()
```

## dev.meteorapi.performance.Profiler.clear

Nguồn: `foundation/src/main/java/dev/meteorapi/performance/Profiler.java:28`

```java
public void clear()
```

## dev.meteorapi.performance.WorkBudget

Nguồn: `foundation/src/main/java/dev/meteorapi/performance/WorkBudget.java:4`

```java
public final class WorkBudget
```

## dev.meteorapi.performance.WorkBudget.WorkBudget

Nguồn: `foundation/src/main/java/dev/meteorapi/performance/WorkBudget.java:9`

```java
public WorkBudget(long nanoseconds, int maximum)
```

## dev.meteorapi.performance.WorkBudget.tryRun

Nguồn: `foundation/src/main/java/dev/meteorapi/performance/WorkBudget.java:13`

```java
public boolean tryRun(Runnable action)
```

## dev.meteorapi.performance.WorkBudget.spent

Nguồn: `foundation/src/main/java/dev/meteorapi/performance/WorkBudget.java:17`

```java
public int spent()
```

## dev.meteorapi.setting.ConfigStore

Nguồn: `foundation/src/main/java/dev/meteorapi/setting/ConfigStore.java:22`

```java
public final class ConfigStore
```

## dev.meteorapi.setting.ConfigStore.ConfigStore

Nguồn: `foundation/src/main/java/dev/meteorapi/setting/ConfigStore.java:26`

```java
public ConfigStore(Path file)
```

## dev.meteorapi.setting.ConfigStore.add

Nguồn: `foundation/src/main/java/dev/meteorapi/setting/ConfigStore.java:27`

```java
public synchronized <T> RegistrationResult<Setting<T>> add(Setting<T> setting)
```

## dev.meteorapi.setting.ConfigStore.settings

Nguồn: `foundation/src/main/java/dev/meteorapi/setting/ConfigStore.java:34`

```java
public synchronized List<Setting<?>> settings()
```

## dev.meteorapi.setting.ConfigStore.load

Nguồn: `foundation/src/main/java/dev/meteorapi/setting/ConfigStore.java:35`

```java
public synchronized List<String> load() throws IOException
```

## dev.meteorapi.setting.ConfigStore.save

Nguồn: `foundation/src/main/java/dev/meteorapi/setting/ConfigStore.java:48`

```java
public synchronized void save() throws IOException
```

## dev.meteorapi.setting.ConfigStore.file

Nguồn: `foundation/src/main/java/dev/meteorapi/setting/ConfigStore.java:60`

```java
public Path file()
```

## dev.meteorapi.setting.Setting

Nguồn: `foundation/src/main/java/dev/meteorapi/setting/Setting.java:17`

```java
public final class Setting<T>
```

## dev.meteorapi.setting.Setting.Change

Nguồn: `foundation/src/main/java/dev/meteorapi/setting/Setting.java:18`

```java
public record Change<T>(T previous, T value)
```

## dev.meteorapi.setting.Setting.Setting

Nguồn: `foundation/src/main/java/dev/meteorapi/setting/Setting.java:31`

```java
public Setting( NamespacedId id, String description, T defaultValue, ValueCodec<T> codec, Predicate<T> validator, BooleanSupplier visible)
```

## dev.meteorapi.setting.Setting.Setting

Nguồn: `foundation/src/main/java/dev/meteorapi/setting/Setting.java:41`

```java
public Setting( NamespacedId id, String description, T defaultValue, ValueCodec<T> codec, Predicate<T> validator, BooleanSupplier visible, UnaryOperator<T> snapshot)
```

## dev.meteorapi.setting.Setting.id

Nguồn: `foundation/src/main/java/dev/meteorapi/setting/Setting.java:71`

```java
public NamespacedId id()
```

## dev.meteorapi.setting.Setting.label

Nguồn: `foundation/src/main/java/dev/meteorapi/setting/Setting.java:76`

```java
public String label()
```

## dev.meteorapi.setting.Setting.label

Nguồn: `foundation/src/main/java/dev/meteorapi/setting/Setting.java:80`

```java
public Setting<T> label(String label)
```

## dev.meteorapi.setting.Setting.description

Nguồn: `foundation/src/main/java/dev/meteorapi/setting/Setting.java:87`

```java
public String description()
```

## dev.meteorapi.setting.Setting.get

Nguồn: `foundation/src/main/java/dev/meteorapi/setting/Setting.java:91`

```java
public T get()
```

## dev.meteorapi.setting.Setting.defaultValue

Nguồn: `foundation/src/main/java/dev/meteorapi/setting/Setting.java:95`

```java
public T defaultValue()
```

## dev.meteorapi.setting.Setting.isVisible

Nguồn: `foundation/src/main/java/dev/meteorapi/setting/Setting.java:99`

```java
public boolean isVisible()
```

## dev.meteorapi.setting.Setting.changed

Nguồn: `foundation/src/main/java/dev/meteorapi/setting/Setting.java:103`

```java
public boolean changed()
```

## dev.meteorapi.setting.Setting.codec

Nguồn: `foundation/src/main/java/dev/meteorapi/setting/Setting.java:107`

```java
public ValueCodec<T> codec()
```

## dev.meteorapi.setting.Setting.set

Nguồn: `foundation/src/main/java/dev/meteorapi/setting/Setting.java:111`

```java
public boolean set(T next)
```

## dev.meteorapi.setting.Setting.parse

Nguồn: `foundation/src/main/java/dev/meteorapi/setting/Setting.java:124`

```java
public boolean parse(String text)
```

## dev.meteorapi.setting.Setting.reset

Nguồn: `foundation/src/main/java/dev/meteorapi/setting/Setting.java:132`

```java
public void reset()
```

## dev.meteorapi.setting.Setting.encode

Nguồn: `foundation/src/main/java/dev/meteorapi/setting/Setting.java:136`

```java
public String encode()
```

## dev.meteorapi.setting.Setting.onChanged

Nguồn: `foundation/src/main/java/dev/meteorapi/setting/Setting.java:140`

```java
public RegistrationResult<Registration> onChanged( NamespacedId listener, Consumer<Change<T>> callback)
```

## dev.meteorapi.setting.Settings

Nguồn: `foundation/src/main/java/dev/meteorapi/setting/Settings.java:13`

```java
public final class Settings
```

## dev.meteorapi.setting.Settings.codec

Nguồn: `foundation/src/main/java/dev/meteorapi/setting/Settings.java:15`

```java
public static <T> ValueCodec<T> codec(Function<String, T> decode, Function<T, String> encode)
```

## dev.meteorapi.setting.Settings.longValue

Nguồn: `foundation/src/main/java/dev/meteorapi/setting/Settings.java:21`

```java
public static Setting<Long> longValue(NamespacedId id, long initial, long min, long max)
```

## dev.meteorapi.setting.Settings.doubleValue

Nguồn: `foundation/src/main/java/dev/meteorapi/setting/Settings.java:26`

```java
public static Setting<Double> doubleValue(NamespacedId id, double initial, double min, double max)
```

## dev.meteorapi.setting.Settings.bool

Nguồn: `foundation/src/main/java/dev/meteorapi/setting/Settings.java:31`

```java
public static Setting<Boolean> bool(NamespacedId id, boolean initial)
```

## dev.meteorapi.setting.Settings.text

Nguồn: `foundation/src/main/java/dev/meteorapi/setting/Settings.java:37`

```java
public static Setting<String> text(NamespacedId id, String initial, int maxLength)
```

## dev.meteorapi.setting.Settings.enumeration

Nguồn: `foundation/src/main/java/dev/meteorapi/setting/Settings.java:41`

```java
public static <E extends Enum<E>> Setting<E> enumeration(NamespacedId id, E initial, Class<E> type)
```

## dev.meteorapi.setting.Settings.file

Nguồn: `foundation/src/main/java/dev/meteorapi/setting/Settings.java:46`

```java
public static Setting<Path> file(NamespacedId id, Path initial)
```

## dev.meteorapi.setting.Settings.strings

Nguồn: `foundation/src/main/java/dev/meteorapi/setting/Settings.java:51`

```java
public static Setting<List<String>> strings(NamespacedId id, List<String> initial, int maxEntries)
```

## dev.meteorapi.setting.ValueCodec

Nguồn: `foundation/src/main/java/dev/meteorapi/setting/ValueCodec.java:4`

```java
public interface ValueCodec<T>
```

## dev.meteorapi.setting.ValueCodec.decode

Nguồn: `foundation/src/main/java/dev/meteorapi/setting/ValueCodec.java:5`

```java
T decode(String text)
```

## dev.meteorapi.setting.ValueCodec.encode

Nguồn: `foundation/src/main/java/dev/meteorapi/setting/ValueCodec.java:6`

```java
String encode(T value)
```

## dev.meteorapi.task.Tasks

Nguồn: `foundation/src/main/java/dev/meteorapi/task/Tasks.java:8`

```java
public final class Tasks
```

## dev.meteorapi.task.Tasks.submit

Nguồn: `foundation/src/main/java/dev/meteorapi/task/Tasks.java:15`

```java
public static <T> CompletableFuture<T> submit(Callable<T> action, ResourceScope scope)
```

## dev.meteorapi.task.Tasks.queued

Nguồn: `foundation/src/main/java/dev/meteorapi/task/Tasks.java:30`

```java
public static int queued()
```

## dev.meteorapi.ui.MenuRegistry

Nguồn: `foundation/src/main/java/dev/meteorapi/ui/MenuRegistry.java:18`

```java
public final class MenuRegistry<S>
```

## dev.meteorapi.ui.MenuRegistry.Entry

Nguồn: `foundation/src/main/java/dev/meteorapi/ui/MenuRegistry.java:19`

```java
public record Entry<S>(NamespacedId id, String title, Function<S, S> factory)
```

## dev.meteorapi.ui.MenuRegistry.Entry.Entry

Nguồn: `foundation/src/main/java/dev/meteorapi/ui/MenuRegistry.java:20`

```java
public Entry
```

## dev.meteorapi.ui.MenuRegistry.register

Nguồn: `foundation/src/main/java/dev/meteorapi/ui/MenuRegistry.java:31`

```java
public RegistrationResult<Registration> register( NamespacedId id, String title, Function<S, S> factory)
```

## dev.meteorapi.ui.MenuRegistry.find

Nguồn: `foundation/src/main/java/dev/meteorapi/ui/MenuRegistry.java:49`

```java
public Optional<Entry<S>> find(NamespacedId id)
```

## dev.meteorapi.ui.MenuRegistry.entries

Nguồn: `foundation/src/main/java/dev/meteorapi/ui/MenuRegistry.java:54`

```java
public List<Entry<S>> entries()
```

## dev.meteorapi.ui.MenuRegistry.create

Nguồn: `foundation/src/main/java/dev/meteorapi/ui/MenuRegistry.java:59`

```java
public Optional<S> create(NamespacedId id, S parent)
```

## dev.meteorapi.ui.internal.ListViewport

Nguồn: `foundation/src/main/java/dev/meteorapi/ui/internal/ListViewport.java:13`

```java
public final class ListViewport
```

## dev.meteorapi.ui.internal.ListViewport.Page

Nguồn: `foundation/src/main/java/dev/meteorapi/ui/internal/ListViewport.java:14`

```java
public record Page<T>(List<T> items, int total, int offset)
```

## dev.meteorapi.ui.internal.ListViewport.Page.Page

Nguồn: `foundation/src/main/java/dev/meteorapi/ui/internal/ListViewport.java:15`

```java
public Page
```

## dev.meteorapi.ui.internal.ListViewport.select

Nguồn: `foundation/src/main/java/dev/meteorapi/ui/internal/ListViewport.java:22`

```java
public static <T> Page<T> select( List<T> source, Predicate<T> visible, Function<T, String> label, String query, int offset, int pageSize)
```

## dev.meteorlib.foundation.NameRules

Nguồn: `foundation/src/main/java/dev/meteorlib/foundation/NameRules.java:11`

```java
public final class NameRules
```

## dev.meteorlib.foundation.NameRules.displayName

Nguồn: `foundation/src/main/java/dev/meteorlib/foundation/NameRules.java:15`

```java
public static String displayName(String identifier)
```

## dev.meteorlib.foundation.NameRules.scoped

Nguồn: `foundation/src/main/java/dev/meteorlib/foundation/NameRules.java:29`

```java
public static String scoped(String namespace, String localName)
```

## dev.meteorlib.foundation.NameRules.requireDistinct

Nguồn: `foundation/src/main/java/dev/meteorlib/foundation/NameRules.java:37`

```java
public static void requireDistinct(Collection<String> names)
```

## dev.meteorlib.foundation.NameRules.rejectOverlap

Nguồn: `foundation/src/main/java/dev/meteorlib/foundation/NameRules.java:49`

```java
public static void rejectOverlap( Collection<String> proposed, Collection<String> existing, String kind)
```

## dev.meteorlib.foundation.NameRules.requireCategoryDistinct

Nguồn: `foundation/src/main/java/dev/meteorlib/foundation/NameRules.java:60`

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

## dev.meteorapi.ApiCoreTest

Nguồn: `foundation/src/test/java/dev/meteorapi/ApiCoreTest.java:18`

```java
public final class ApiCoreTest
```

## dev.meteorapi.ApiCoreTest.main

Nguồn: `foundation/src/test/java/dev/meteorapi/ApiCoreTest.java:21`

```java
public static void main(String[] args) throws Exception
```

## dev.meteorapi.BetaApiTest

Nguồn: `foundation/src/test/java/dev/meteorapi/BetaApiTest.java:17`

```java
public final class BetaApiTest
```

## dev.meteorapi.BetaApiTest.main

Nguồn: `foundation/src/test/java/dev/meteorapi/BetaApiTest.java:24`

```java
public static void main(String[] args) throws Exception
```

## dev.meteorapi.ClientCoreTest

Nguồn: `foundation/src/test/java/dev/meteorapi/ClientCoreTest.java:16`

```java
public final class ClientCoreTest
```

## dev.meteorapi.ClientCoreTest.main

Nguồn: `foundation/src/test/java/dev/meteorapi/ClientCoreTest.java:18`

```java
public static void main(String[] args) throws Exception
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
