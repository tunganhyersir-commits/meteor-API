# fabric-api-1.21.11

Khai báo Java có cú pháp public/protected. Không bao gồm API kế thừa/tổng hợp bởi compiler; xem kiểm tra bytecode riêng.

## net.fabricmc.fabric.api.event.AutoInvokingEvent

Nguồn: `upstream/fabric-api-1.21.11/fabric-api-base/net/fabricmc/fabric/api/event/AutoInvokingEvent.java:51`

```java
@Documented @Retention(RetentionPolicy.RUNTIME) @Target({ ElementType.FIELD, ElementType.METHOD }) public @interface AutoInvokingEvent
```

## net.fabricmc.fabric.api.event.Event

Nguồn: `upstream/fabric-api-1.21.11/fabric-api-base/net/fabricmc/fabric/api/event/Event.java:28`

```java
@ApiStatus.NonExtendable // Should only be extended by fabric API. public abstract class Event<T>
```

## net.fabricmc.fabric.api.event.Event.invoker

Nguồn: `upstream/fabric-api-1.21.11/fabric-api-base/net/fabricmc/fabric/api/event/Event.java:35`

```java
protected volatile T invoker
```

## net.fabricmc.fabric.api.event.Event.invoker

Nguồn: `upstream/fabric-api-1.21.11/fabric-api-base/net/fabricmc/fabric/api/event/Event.java:46`

```java
public final T invoker()
```

## net.fabricmc.fabric.api.event.Event.register

Nguồn: `upstream/fabric-api-1.21.11/fabric-api-base/net/fabricmc/fabric/api/event/Event.java:56`

```java
public abstract void register(T listener)
```

## net.fabricmc.fabric.api.event.Event.DEFAULT_PHASE

Nguồn: `upstream/fabric-api-1.21.11/fabric-api-base/net/fabricmc/fabric/api/event/Event.java:62`

```java
public static final class_2960 DEFAULT_PHASE = class_2960.method_60655("fabric", "default")
```

## net.fabricmc.fabric.api.event.Event.register

Nguồn: `upstream/fabric-api-1.21.11/fabric-api-base/net/fabricmc/fabric/api/event/Event.java:71`

```java
public void register(class_2960 phase, T listener)
```

## net.fabricmc.fabric.api.event.Event.addPhaseOrdering

Nguồn: `upstream/fabric-api-1.21.11/fabric-api-base/net/fabricmc/fabric/api/event/Event.java:87`

```java
public void addPhaseOrdering(class_2960 firstPhase, class_2960 secondPhase)
```

## net.fabricmc.fabric.api.event.EventFactory

Nguồn: `upstream/fabric-api-1.21.11/fabric-api-base/net/fabricmc/fabric/api/event/EventFactory.java:26`

```java
public final class EventFactory
```

## net.fabricmc.fabric.api.event.EventFactory.createArrayBacked

Nguồn: `upstream/fabric-api-1.21.11/fabric-api-base/net/fabricmc/fabric/api/event/EventFactory.java:41`

```java
public static <T> Event<T> createArrayBacked(Class<? super T> type, Function<T[], T> invokerFactory)
```

## net.fabricmc.fabric.api.event.EventFactory.createArrayBacked

Nguồn: `upstream/fabric-api-1.21.11/fabric-api-base/net/fabricmc/fabric/api/event/EventFactory.java:65`

```java
public static <T> Event<T> createArrayBacked(Class<T> type, T emptyInvoker, Function<T[], T> invokerFactory)
```

## net.fabricmc.fabric.api.event.EventFactory.createWithPhases

Nguồn: `upstream/fabric-api-1.21.11/fabric-api-base/net/fabricmc/fabric/api/event/EventFactory.java:97`

```java
public static <T> Event<T> createWithPhases(Class<? super T> type, Function<T[], T> invokerFactory, class_2960... defaultPhases)
```

## net.fabricmc.fabric.api.event.EventFactory.getHandlerName

Nguồn: `upstream/fabric-api-1.21.11/fabric-api-base/net/fabricmc/fabric/api/event/EventFactory.java:113`

```java
@Deprecated public static String getHandlerName(Object handler)
```

## net.fabricmc.fabric.api.event.EventFactory.isProfilingEnabled

Nguồn: `upstream/fabric-api-1.21.11/fabric-api-base/net/fabricmc/fabric/api/event/EventFactory.java:121`

```java
@Deprecated public static boolean isProfilingEnabled()
```

## net.fabricmc.fabric.api.event.EventFactory.invalidate

Nguồn: `upstream/fabric-api-1.21.11/fabric-api-base/net/fabricmc/fabric/api/event/EventFactory.java:133`

```java
@Deprecated(forRemoval = true) public static void invalidate()
```

## net.fabricmc.fabric.api.util.BooleanFunction

Nguồn: `upstream/fabric-api-1.21.11/fabric-api-base/net/fabricmc/fabric/api/util/BooleanFunction.java:24`

```java
@FunctionalInterface public interface BooleanFunction<R>
```

## net.fabricmc.fabric.api.util.BooleanFunction.apply

Nguồn: `upstream/fabric-api-1.21.11/fabric-api-base/net/fabricmc/fabric/api/util/BooleanFunction.java:32`

```java
R apply(boolean value)
```

## net.fabricmc.fabric.api.util.NbtType

Nguồn: `upstream/fabric-api-1.21.11/fabric-api-base/net/fabricmc/fabric/api/util/NbtType.java:29`

```java
@Deprecated public final class NbtType
```

## net.fabricmc.fabric.api.util.NbtType.END

Nguồn: `upstream/fabric-api-1.21.11/fabric-api-base/net/fabricmc/fabric/api/util/NbtType.java:31`

```java
public static final int END = 0
```

## net.fabricmc.fabric.api.util.NbtType.BYTE

Nguồn: `upstream/fabric-api-1.21.11/fabric-api-base/net/fabricmc/fabric/api/util/NbtType.java:32`

```java
public static final int BYTE = 1
```

## net.fabricmc.fabric.api.util.NbtType.SHORT

Nguồn: `upstream/fabric-api-1.21.11/fabric-api-base/net/fabricmc/fabric/api/util/NbtType.java:33`

```java
public static final int SHORT = 2
```

## net.fabricmc.fabric.api.util.NbtType.INT

Nguồn: `upstream/fabric-api-1.21.11/fabric-api-base/net/fabricmc/fabric/api/util/NbtType.java:34`

```java
public static final int INT = 3
```

## net.fabricmc.fabric.api.util.NbtType.LONG

Nguồn: `upstream/fabric-api-1.21.11/fabric-api-base/net/fabricmc/fabric/api/util/NbtType.java:35`

```java
public static final int LONG = 4
```

## net.fabricmc.fabric.api.util.NbtType.FLOAT

Nguồn: `upstream/fabric-api-1.21.11/fabric-api-base/net/fabricmc/fabric/api/util/NbtType.java:36`

```java
public static final int FLOAT = 5
```

## net.fabricmc.fabric.api.util.NbtType.DOUBLE

Nguồn: `upstream/fabric-api-1.21.11/fabric-api-base/net/fabricmc/fabric/api/util/NbtType.java:37`

```java
public static final int DOUBLE = 6
```

## net.fabricmc.fabric.api.util.NbtType.BYTE_ARRAY

Nguồn: `upstream/fabric-api-1.21.11/fabric-api-base/net/fabricmc/fabric/api/util/NbtType.java:38`

```java
public static final int BYTE_ARRAY = 7
```

## net.fabricmc.fabric.api.util.NbtType.STRING

Nguồn: `upstream/fabric-api-1.21.11/fabric-api-base/net/fabricmc/fabric/api/util/NbtType.java:39`

```java
public static final int STRING = 8
```

## net.fabricmc.fabric.api.util.NbtType.LIST

Nguồn: `upstream/fabric-api-1.21.11/fabric-api-base/net/fabricmc/fabric/api/util/NbtType.java:40`

```java
public static final int LIST = 9
```

## net.fabricmc.fabric.api.util.NbtType.COMPOUND

Nguồn: `upstream/fabric-api-1.21.11/fabric-api-base/net/fabricmc/fabric/api/util/NbtType.java:41`

```java
public static final int COMPOUND = 10
```

## net.fabricmc.fabric.api.util.NbtType.INT_ARRAY

Nguồn: `upstream/fabric-api-1.21.11/fabric-api-base/net/fabricmc/fabric/api/util/NbtType.java:42`

```java
public static final int INT_ARRAY = 11
```

## net.fabricmc.fabric.api.util.NbtType.LONG_ARRAY

Nguồn: `upstream/fabric-api-1.21.11/fabric-api-base/net/fabricmc/fabric/api/util/NbtType.java:43`

```java
public static final int LONG_ARRAY = 12
```

## net.fabricmc.fabric.api.util.TriState

Nguồn: `upstream/fabric-api-1.21.11/fabric-api-base/net/fabricmc/fabric/api/util/TriState.java:30`

```java
public enum TriState implements class_3542
```

## net.fabricmc.fabric.api.util.TriState.CODEC

Nguồn: `upstream/fabric-api-1.21.11/fabric-api-base/net/fabricmc/fabric/api/util/TriState.java:44`

```java
public static final Codec<TriState> CODEC = class_3542.method_28140(TriState::values)
```

## net.fabricmc.fabric.api.util.TriState.of

Nguồn: `upstream/fabric-api-1.21.11/fabric-api-base/net/fabricmc/fabric/api/util/TriState.java:54`

```java
public static TriState of(boolean bool)
```

## net.fabricmc.fabric.api.util.TriState.of

Nguồn: `upstream/fabric-api-1.21.11/fabric-api-base/net/fabricmc/fabric/api/util/TriState.java:65`

```java
public static TriState of(@Nullable Boolean bool)
```

## net.fabricmc.fabric.api.util.TriState.get

Nguồn: `upstream/fabric-api-1.21.11/fabric-api-base/net/fabricmc/fabric/api/util/TriState.java:75`

```java
public boolean get()
```

## net.fabricmc.fabric.api.util.TriState.getBoxed

Nguồn: `upstream/fabric-api-1.21.11/fabric-api-base/net/fabricmc/fabric/api/util/TriState.java:85`

```java
@Nullable public Boolean getBoxed()
```

## net.fabricmc.fabric.api.util.TriState.orElse

Nguồn: `upstream/fabric-api-1.21.11/fabric-api-base/net/fabricmc/fabric/api/util/TriState.java:97`

```java
public boolean orElse(boolean value)
```

## net.fabricmc.fabric.api.util.TriState.orElseGet

Nguồn: `upstream/fabric-api-1.21.11/fabric-api-base/net/fabricmc/fabric/api/util/TriState.java:108`

```java
public boolean orElseGet(BooleanSupplier supplier)
```

## net.fabricmc.fabric.api.util.TriState.map

Nguồn: `upstream/fabric-api-1.21.11/fabric-api-base/net/fabricmc/fabric/api/util/TriState.java:119`

```java
public <T> Optional<T> map(BooleanFunction<@Nullable ? extends T> mapper)
```

## net.fabricmc.fabric.api.util.TriState.orElseThrow

Nguồn: `upstream/fabric-api-1.21.11/fabric-api-base/net/fabricmc/fabric/api/util/TriState.java:137`

```java
public <X extends Throwable> boolean orElseThrow(Supplier<X> exceptionSupplier) throws X
```

## net.fabricmc.fabric.api.util.TriState.fromSystemProperty

Nguồn: `upstream/fabric-api-1.21.11/fabric-api-base/net/fabricmc/fabric/api/util/TriState.java:150`

```java
public static TriState fromSystemProperty(String property)
```

## net.fabricmc.fabric.api.util.TriState.method_15434

Nguồn: `upstream/fabric-api-1.21.11/fabric-api-base/net/fabricmc/fabric/api/util/TriState.java:165`

```java
@Override public String method_15434()
```

## net.fabricmc.fabric.impl.base.event.ArrayBackedEvent.register

Nguồn: `upstream/fabric-api-1.21.11/fabric-api-base/net/fabricmc/fabric/impl/base/event/ArrayBackedEvent.java:55`

```java
@Override public void register(T listener)
```

## net.fabricmc.fabric.impl.base.event.ArrayBackedEvent.register

Nguồn: `upstream/fabric-api-1.21.11/fabric-api-base/net/fabricmc/fabric/impl/base/event/ArrayBackedEvent.java:60`

```java
@Override public void register(class_2960 phaseIdentifier, T listener)
```

## net.fabricmc.fabric.impl.base.event.ArrayBackedEvent.addPhaseOrdering

Nguồn: `upstream/fabric-api-1.21.11/fabric-api-base/net/fabricmc/fabric/impl/base/event/ArrayBackedEvent.java:110`

```java
@Override public void addPhaseOrdering(class_2960 firstPhase, class_2960 secondPhase)
```

## net.fabricmc.fabric.impl.base.event.EventFactoryImpl

Nguồn: `upstream/fabric-api-1.21.11/fabric-api-base/net/fabricmc/fabric/impl/base/event/EventFactoryImpl.java:34`

```java
public final class EventFactoryImpl
```

## net.fabricmc.fabric.impl.base.event.EventFactoryImpl.invalidate

Nguồn: `upstream/fabric-api-1.21.11/fabric-api-base/net/fabricmc/fabric/impl/base/event/EventFactoryImpl.java:40`

```java
public static void invalidate()
```

## net.fabricmc.fabric.impl.base.event.EventFactoryImpl.createArrayBacked

Nguồn: `upstream/fabric-api-1.21.11/fabric-api-base/net/fabricmc/fabric/impl/base/event/EventFactoryImpl.java:44`

```java
public static <T> Event<T> createArrayBacked(Class<? super T> type, Function<T[], T> invokerFactory)
```

## net.fabricmc.fabric.impl.base.event.EventFactoryImpl.ensureContainsDefault

Nguồn: `upstream/fabric-api-1.21.11/fabric-api-base/net/fabricmc/fabric/impl/base/event/EventFactoryImpl.java:50`

```java
public static void ensureContainsDefault(class_2960[] defaultPhases)
```

## net.fabricmc.fabric.impl.base.event.EventFactoryImpl.ensureNoDuplicates

Nguồn: `upstream/fabric-api-1.21.11/fabric-api-base/net/fabricmc/fabric/impl/base/event/EventFactoryImpl.java:60`

```java
public static void ensureNoDuplicates(class_2960[] defaultPhases)
```

## net.fabricmc.fabric.impl.base.event.EventPhaseData.getDescription

Nguồn: `upstream/fabric-api-1.21.11/fabric-api-base/net/fabricmc/fabric/impl/base/event/EventPhaseData.java:43`

```java
@Override protected String getDescription()
```

## net.fabricmc.fabric.impl.base.toposort.NodeSorting

Nguồn: `upstream/fabric-api-1.21.11/fabric-api-base/net/fabricmc/fabric/impl/base/toposort/NodeSorting.java:44`

```java
public class NodeSorting
```

## net.fabricmc.fabric.impl.base.toposort.NodeSorting.ENABLE_CYCLE_WARNING

Nguồn: `upstream/fabric-api-1.21.11/fabric-api-base/net/fabricmc/fabric/impl/base/toposort/NodeSorting.java:47`

```java
@VisibleForTesting public static boolean ENABLE_CYCLE_WARNING = true
```

## net.fabricmc.fabric.impl.base.toposort.NodeSorting.sort

Nguồn: `upstream/fabric-api-1.21.11/fabric-api-base/net/fabricmc/fabric/impl/base/toposort/NodeSorting.java:58`

```java
public static <N extends SortableNode<N>> boolean sort(List<N> sortedNodes, String elementDescription, Comparator<N> comparator)
```

## net.fabricmc.fabric.impl.base.toposort.SortableNode

Nguồn: `upstream/fabric-api-1.21.11/fabric-api-base/net/fabricmc/fabric/impl/base/toposort/SortableNode.java:22`

```java
public abstract class SortableNode<N extends SortableNode<N>>
```

## net.fabricmc.fabric.impl.base.toposort.SortableNode.subsequentNodes

Nguồn: `upstream/fabric-api-1.21.11/fabric-api-base/net/fabricmc/fabric/impl/base/toposort/SortableNode.java:23`

```java
protected final List<N> subsequentNodes = new ArrayList<>()
```

## net.fabricmc.fabric.impl.base.toposort.SortableNode.previousNodes

Nguồn: `upstream/fabric-api-1.21.11/fabric-api-base/net/fabricmc/fabric/impl/base/toposort/SortableNode.java:24`

```java
protected final List<N> previousNodes = new ArrayList<>()
```

## net.fabricmc.fabric.impl.base.toposort.SortableNode.getDescription

Nguồn: `upstream/fabric-api-1.21.11/fabric-api-base/net/fabricmc/fabric/impl/base/toposort/SortableNode.java:30`

```java
protected abstract String getDescription()
```

## net.fabricmc.fabric.impl.base.toposort.SortableNode.addSubsequentNode

Nguồn: `upstream/fabric-api-1.21.11/fabric-api-base/net/fabricmc/fabric/impl/base/toposort/SortableNode.java:32`

```java
protected void addSubsequentNode(N node)
```

## net.fabricmc.fabric.impl.base.toposort.SortableNode.addPreviousNode

Nguồn: `upstream/fabric-api-1.21.11/fabric-api-base/net/fabricmc/fabric/impl/base/toposort/SortableNode.java:36`

```java
protected void addPreviousNode(N node)
```

## net.fabricmc.fabric.impl.base.toposort.SortableNode.link

Nguồn: `upstream/fabric-api-1.21.11/fabric-api-base/net/fabricmc/fabric/impl/base/toposort/SortableNode.java:40`

```java
public static <N extends SortableNode<N>> void link(N first, N second)
```

## net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientBlockEntityEvents

Nguồn: `upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/api/client/event/lifecycle/v1/ClientBlockEntityEvents.java:24`

```java
public final class ClientBlockEntityEvents
```

## net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientBlockEntityEvents.BLOCK_ENTITY_LOAD

Nguồn: `upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/api/client/event/lifecycle/v1/ClientBlockEntityEvents.java:34`

```java
public static final Event<ClientBlockEntityEvents.Load> BLOCK_ENTITY_LOAD = EventFactory.createArrayBacked(ClientBlockEntityEvents.Load.class, callbacks -> (blockEntity, world) -> { for (Load callback : callbacks) { callback.onLoad(blockEntity, world); } })
```

## net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientBlockEntityEvents.BLOCK_ENTITY_UNLOAD

Nguồn: `upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/api/client/event/lifecycle/v1/ClientBlockEntityEvents.java:45`

```java
public static final Event<ClientBlockEntityEvents.Unload> BLOCK_ENTITY_UNLOAD = EventFactory.createArrayBacked(ClientBlockEntityEvents.Unload.class, callbacks -> (blockEntity, world) -> { for (Unload callback : callbacks) { callback.onUnload(blockEntity, world); } })
```

## net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientBlockEntityEvents.Load

Nguồn: `upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/api/client/event/lifecycle/v1/ClientBlockEntityEvents.java:51`

```java
@FunctionalInterface public interface Load
```

## net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientBlockEntityEvents.Load.onLoad

Nguồn: `upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/api/client/event/lifecycle/v1/ClientBlockEntityEvents.java:53`

```java
void onLoad(class_2586 blockEntity, class_638 world)
```

## net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientBlockEntityEvents.Unload

Nguồn: `upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/api/client/event/lifecycle/v1/ClientBlockEntityEvents.java:56`

```java
@FunctionalInterface public interface Unload
```

## net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientBlockEntityEvents.Unload.onUnload

Nguồn: `upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/api/client/event/lifecycle/v1/ClientBlockEntityEvents.java:58`

```java
void onUnload(class_2586 blockEntity, class_638 world)
```

## net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientChunkEvents

Nguồn: `upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/api/client/event/lifecycle/v1/ClientChunkEvents.java:24`

```java
public final class ClientChunkEvents
```

## net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientChunkEvents.CHUNK_LOAD

Nguồn: `upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/api/client/event/lifecycle/v1/ClientChunkEvents.java:33`

```java
public static final Event<ClientChunkEvents.Load> CHUNK_LOAD = EventFactory.createArrayBacked(ClientChunkEvents.Load.class, callbacks -> (clientWorld, chunk) -> { for (Load callback : callbacks) { callback.onChunkLoad(clientWorld, chunk); } })
```

## net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientChunkEvents.CHUNK_UNLOAD

Nguồn: `upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/api/client/event/lifecycle/v1/ClientChunkEvents.java:44`

```java
public static final Event<ClientChunkEvents.Unload> CHUNK_UNLOAD = EventFactory.createArrayBacked(ClientChunkEvents.Unload.class, callbacks -> (clientWorld, chunk) -> { for (Unload callback : callbacks) { callback.onChunkUnload(clientWorld, chunk); } })
```

## net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientChunkEvents.Load

Nguồn: `upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/api/client/event/lifecycle/v1/ClientChunkEvents.java:50`

```java
@FunctionalInterface public interface Load
```

## net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientChunkEvents.Load.onChunkLoad

Nguồn: `upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/api/client/event/lifecycle/v1/ClientChunkEvents.java:52`

```java
void onChunkLoad(class_638 world, class_2818 chunk)
```

## net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientChunkEvents.Unload

Nguồn: `upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/api/client/event/lifecycle/v1/ClientChunkEvents.java:55`

```java
@FunctionalInterface public interface Unload
```

## net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientChunkEvents.Unload.onChunkUnload

Nguồn: `upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/api/client/event/lifecycle/v1/ClientChunkEvents.java:57`

```java
void onChunkUnload(class_638 world, class_2818 chunk)
```

## net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientEntityEvents

Nguồn: `upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/api/client/event/lifecycle/v1/ClientEntityEvents.java:24`

```java
public final class ClientEntityEvents
```

## net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientEntityEvents.ENTITY_LOAD

Nguồn: `upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/api/client/event/lifecycle/v1/ClientEntityEvents.java:33`

```java
public static final Event<ClientEntityEvents.Load> ENTITY_LOAD = EventFactory.createArrayBacked(ClientEntityEvents.Load.class, callbacks -> (entity, world) -> { for (Load callback : callbacks) { callback.onLoad(entity, world); } })
```

## net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientEntityEvents.ENTITY_UNLOAD

Nguồn: `upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/api/client/event/lifecycle/v1/ClientEntityEvents.java:44`

```java
public static final Event<ClientEntityEvents.Unload> ENTITY_UNLOAD = EventFactory.createArrayBacked(ClientEntityEvents.Unload.class, callbacks -> (entity, world) -> { for (Unload callback : callbacks) { callback.onUnload(entity, world); } })
```

## net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientEntityEvents.Load

Nguồn: `upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/api/client/event/lifecycle/v1/ClientEntityEvents.java:50`

```java
@FunctionalInterface public interface Load
```

## net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientEntityEvents.Load.onLoad

Nguồn: `upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/api/client/event/lifecycle/v1/ClientEntityEvents.java:52`

```java
void onLoad(class_1297 entity, class_638 world)
```

## net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientEntityEvents.Unload

Nguồn: `upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/api/client/event/lifecycle/v1/ClientEntityEvents.java:55`

```java
@FunctionalInterface public interface Unload
```

## net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientEntityEvents.Unload.onUnload

Nguồn: `upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/api/client/event/lifecycle/v1/ClientEntityEvents.java:57`

```java
void onUnload(class_1297 entity, class_638 world)
```

## net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientLifecycleEvents

Nguồn: `upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/api/client/event/lifecycle/v1/ClientLifecycleEvents.java:23`

```java
public final class ClientLifecycleEvents
```

## net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientLifecycleEvents.CLIENT_STARTED

Nguồn: `upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/api/client/event/lifecycle/v1/ClientLifecycleEvents.java:32`

```java
public static final Event<ClientStarted> CLIENT_STARTED = EventFactory.createArrayBacked(ClientStarted.class, callbacks -> client -> { for (ClientStarted callback : callbacks) { callback.onClientStarted(client); } })
```

## net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientLifecycleEvents.CLIENT_STOPPING

Nguồn: `upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/api/client/event/lifecycle/v1/ClientLifecycleEvents.java:44`

```java
public static final Event<ClientStopping> CLIENT_STOPPING = EventFactory.createArrayBacked(ClientStopping.class, callbacks -> client -> { for (ClientStopping callback : callbacks) { callback.onClientStopping(client); } })
```

## net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientLifecycleEvents.ClientStarted

Nguồn: `upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/api/client/event/lifecycle/v1/ClientLifecycleEvents.java:50`

```java
@FunctionalInterface public interface ClientStarted
```

## net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientLifecycleEvents.ClientStarted.onClientStarted

Nguồn: `upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/api/client/event/lifecycle/v1/ClientLifecycleEvents.java:52`

```java
void onClientStarted(class_310 client)
```

## net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientLifecycleEvents.ClientStopping

Nguồn: `upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/api/client/event/lifecycle/v1/ClientLifecycleEvents.java:55`

```java
@FunctionalInterface public interface ClientStopping
```

## net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientLifecycleEvents.ClientStopping.onClientStopping

Nguồn: `upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/api/client/event/lifecycle/v1/ClientLifecycleEvents.java:57`

```java
void onClientStopping(class_310 client)
```

## net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents

Nguồn: `upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/api/client/event/lifecycle/v1/ClientTickEvents.java:24`

```java
public final class ClientTickEvents
```

## net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents.START_CLIENT_TICK

Nguồn: `upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/api/client/event/lifecycle/v1/ClientTickEvents.java:31`

```java
public static final Event<StartTick> START_CLIENT_TICK = EventFactory.createArrayBacked(StartTick.class, callbacks -> client -> { for (StartTick event : callbacks) { event.onStartTick(client); } })
```

## net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents.END_CLIENT_TICK

Nguồn: `upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/api/client/event/lifecycle/v1/ClientTickEvents.java:40`

```java
public static final Event<EndTick> END_CLIENT_TICK = EventFactory.createArrayBacked(EndTick.class, callbacks -> client -> { for (EndTick event : callbacks) { event.onEndTick(client); } })
```

## net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents.START_WORLD_TICK

Nguồn: `upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/api/client/event/lifecycle/v1/ClientTickEvents.java:49`

```java
public static final Event<StartWorldTick> START_WORLD_TICK = EventFactory.createArrayBacked(StartWorldTick.class, callbacks -> world -> { for (StartWorldTick callback : callbacks) { callback.onStartTick(world); } })
```

## net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents.END_WORLD_TICK

Nguồn: `upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/api/client/event/lifecycle/v1/ClientTickEvents.java:60`

```java
public static final Event<EndWorldTick> END_WORLD_TICK = EventFactory.createArrayBacked(EndWorldTick.class, callbacks -> world -> { for (EndWorldTick callback : callbacks) { callback.onEndTick(world); } })
```

## net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents.StartTick

Nguồn: `upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/api/client/event/lifecycle/v1/ClientTickEvents.java:66`

```java
@FunctionalInterface public interface StartTick
```

## net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents.StartTick.onStartTick

Nguồn: `upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/api/client/event/lifecycle/v1/ClientTickEvents.java:68`

```java
void onStartTick(class_310 client)
```

## net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents.EndTick

Nguồn: `upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/api/client/event/lifecycle/v1/ClientTickEvents.java:71`

```java
@FunctionalInterface public interface EndTick
```

## net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents.EndTick.onEndTick

Nguồn: `upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/api/client/event/lifecycle/v1/ClientTickEvents.java:73`

```java
void onEndTick(class_310 client)
```

## net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents.StartWorldTick

Nguồn: `upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/api/client/event/lifecycle/v1/ClientTickEvents.java:76`

```java
@FunctionalInterface public interface StartWorldTick
```

## net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents.StartWorldTick.onStartTick

Nguồn: `upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/api/client/event/lifecycle/v1/ClientTickEvents.java:78`

```java
void onStartTick(class_638 world)
```

## net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents.EndWorldTick

Nguồn: `upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/api/client/event/lifecycle/v1/ClientTickEvents.java:81`

```java
@FunctionalInterface public interface EndWorldTick
```

## net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents.EndWorldTick.onEndTick

Nguồn: `upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/api/client/event/lifecycle/v1/ClientTickEvents.java:83`

```java
void onEndTick(class_638 world)
```

## net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientWorldEvents

Nguồn: `upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/api/client/event/lifecycle/v1/ClientWorldEvents.java:24`

```java
public final class ClientWorldEvents
```

## net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientWorldEvents.AFTER_CLIENT_WORLD_CHANGE

Nguồn: `upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/api/client/event/lifecycle/v1/ClientWorldEvents.java:31`

```java
public static final Event<AfterClientWorldChange> AFTER_CLIENT_WORLD_CHANGE = EventFactory.createArrayBacked(AfterClientWorldChange.class, callbacks -> (client, world) -> { for (AfterClientWorldChange callback : callbacks) { callback.afterWorldChange(client, world); } })
```

## net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientWorldEvents.AfterClientWorldChange

Nguồn: `upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/api/client/event/lifecycle/v1/ClientWorldEvents.java:37`

```java
@FunctionalInterface public interface AfterClientWorldChange
```

## net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientWorldEvents.AfterClientWorldChange.afterWorldChange

Nguồn: `upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/api/client/event/lifecycle/v1/ClientWorldEvents.java:45`

```java
void afterWorldChange(class_310 client, class_638 world)
```

## net.fabricmc.fabric.api.event.lifecycle.v1.CommonLifecycleEvents

Nguồn: `upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/api/event/lifecycle/v1/CommonLifecycleEvents.java:23`

```java
public final class CommonLifecycleEvents
```

## net.fabricmc.fabric.api.event.lifecycle.v1.CommonLifecycleEvents.TAGS_LOADED

Nguồn: `upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/api/event/lifecycle/v1/CommonLifecycleEvents.java:30`

```java
public static final Event<TagsLoaded> TAGS_LOADED = EventFactory.createArrayBacked(TagsLoaded.class, callbacks -> (registries, client) -> { for (TagsLoaded callback : callbacks) { callback.onTagsLoaded(registries, client); } })
```

## net.fabricmc.fabric.api.event.lifecycle.v1.CommonLifecycleEvents.TagsLoaded

Nguồn: `upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/api/event/lifecycle/v1/CommonLifecycleEvents.java:36`

```java
public interface TagsLoaded
```

## net.fabricmc.fabric.api.event.lifecycle.v1.CommonLifecycleEvents.TagsLoaded.onTagsLoaded

Nguồn: `upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/api/event/lifecycle/v1/CommonLifecycleEvents.java:41`

```java
void onTagsLoaded(class_5455 registries, boolean client)
```

## net.fabricmc.fabric.api.event.lifecycle.v1.ServerBlockEntityEvents

Nguồn: `upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/api/event/lifecycle/v1/ServerBlockEntityEvents.java:24`

```java
public final class ServerBlockEntityEvents
```

## net.fabricmc.fabric.api.event.lifecycle.v1.ServerBlockEntityEvents.BLOCK_ENTITY_LOAD

Nguồn: `upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/api/event/lifecycle/v1/ServerBlockEntityEvents.java:34`

```java
public static final Event<ServerBlockEntityEvents.Load> BLOCK_ENTITY_LOAD = EventFactory.createArrayBacked(ServerBlockEntityEvents.Load.class, callbacks -> (blockEntity, world) -> { for (Load callback : callbacks) { callback.onLoad(blockEntity, world); } })
```

## net.fabricmc.fabric.api.event.lifecycle.v1.ServerBlockEntityEvents.BLOCK_ENTITY_UNLOAD

Nguồn: `upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/api/event/lifecycle/v1/ServerBlockEntityEvents.java:45`

```java
public static final Event<Unload> BLOCK_ENTITY_UNLOAD = EventFactory.createArrayBacked(ServerBlockEntityEvents.Unload.class, callbacks -> (blockEntity, world) -> { for (Unload callback : callbacks) { callback.onUnload(blockEntity, world); } })
```

## net.fabricmc.fabric.api.event.lifecycle.v1.ServerBlockEntityEvents.Load

Nguồn: `upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/api/event/lifecycle/v1/ServerBlockEntityEvents.java:51`

```java
@FunctionalInterface public interface Load
```

## net.fabricmc.fabric.api.event.lifecycle.v1.ServerBlockEntityEvents.Load.onLoad

Nguồn: `upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/api/event/lifecycle/v1/ServerBlockEntityEvents.java:53`

```java
void onLoad(class_2586 blockEntity, class_3218 world)
```

## net.fabricmc.fabric.api.event.lifecycle.v1.ServerBlockEntityEvents.Unload

Nguồn: `upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/api/event/lifecycle/v1/ServerBlockEntityEvents.java:56`

```java
@FunctionalInterface public interface Unload
```

## net.fabricmc.fabric.api.event.lifecycle.v1.ServerBlockEntityEvents.Unload.onUnload

Nguồn: `upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/api/event/lifecycle/v1/ServerBlockEntityEvents.java:58`

```java
void onUnload(class_2586 blockEntity, class_3218 world)
```

## net.fabricmc.fabric.api.event.lifecycle.v1.ServerChunkEvents

Nguồn: `upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/api/event/lifecycle/v1/ServerChunkEvents.java:28`

```java
public final class ServerChunkEvents
```

## net.fabricmc.fabric.api.event.lifecycle.v1.ServerChunkEvents.CHUNK_LOAD

Nguồn: `upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/api/event/lifecycle/v1/ServerChunkEvents.java:41`

```java
public static final Event<ServerChunkEvents.Load> CHUNK_LOAD = EventFactory.createArrayBacked(ServerChunkEvents.Load.class, callbacks -> (serverWorld, chunk) -> { for (Load callback : callbacks) { callback.onChunkLoad(serverWorld, chunk); } })
```

## net.fabricmc.fabric.api.event.lifecycle.v1.ServerChunkEvents.CHUNK_GENERATE

Nguồn: `upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/api/event/lifecycle/v1/ServerChunkEvents.java:52`

```java
public static final Event<ServerChunkEvents.Generate> CHUNK_GENERATE = EventFactory.createArrayBacked(ServerChunkEvents.Generate.class, callbacks -> (serverWorld, chunk) -> { for (Generate callback : callbacks) { callback.onChunkGenerate(serverWorld, chunk); } })
```

## net.fabricmc.fabric.api.event.lifecycle.v1.ServerChunkEvents.CHUNK_UNLOAD

Nguồn: `upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/api/event/lifecycle/v1/ServerChunkEvents.java:66`

```java
public static final Event<ServerChunkEvents.Unload> CHUNK_UNLOAD = EventFactory.createArrayBacked(ServerChunkEvents.Unload.class, callbacks -> (serverWorld, chunk) -> { for (Unload callback : callbacks) { callback.onChunkUnload(serverWorld, chunk); } })
```

## net.fabricmc.fabric.api.event.lifecycle.v1.ServerChunkEvents.CHUNK_LEVEL_TYPE_CHANGE

Nguồn: `upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/api/event/lifecycle/v1/ServerChunkEvents.java:83`

```java
public static final Event<LevelTypeChange> CHUNK_LEVEL_TYPE_CHANGE = EventFactory.createArrayBacked(LevelTypeChange.class, (world, chunk, oldLevelType, newLevelType) -> { }, callbacks -> (serverWorld, chunk, oldLevelType, newLevelType) -> { for (LevelTypeChange callback : callbacks) { callback.onChunkLevelTypeChange(serverWorld, chunk, oldLevelType, newLevelType); } })
```

## net.fabricmc.fabric.api.event.lifecycle.v1.ServerChunkEvents.Load

Nguồn: `upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/api/event/lifecycle/v1/ServerChunkEvents.java:89`

```java
@FunctionalInterface public interface Load
```

## net.fabricmc.fabric.api.event.lifecycle.v1.ServerChunkEvents.Load.onChunkLoad

Nguồn: `upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/api/event/lifecycle/v1/ServerChunkEvents.java:91`

```java
void onChunkLoad(class_3218 world, class_2818 chunk)
```

## net.fabricmc.fabric.api.event.lifecycle.v1.ServerChunkEvents.Generate

Nguồn: `upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/api/event/lifecycle/v1/ServerChunkEvents.java:94`

```java
@FunctionalInterface public interface Generate
```

## net.fabricmc.fabric.api.event.lifecycle.v1.ServerChunkEvents.Generate.onChunkGenerate

Nguồn: `upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/api/event/lifecycle/v1/ServerChunkEvents.java:96`

```java
void onChunkGenerate(class_3218 world, class_2818 chunk)
```

## net.fabricmc.fabric.api.event.lifecycle.v1.ServerChunkEvents.Unload

Nguồn: `upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/api/event/lifecycle/v1/ServerChunkEvents.java:99`

```java
@FunctionalInterface public interface Unload
```

## net.fabricmc.fabric.api.event.lifecycle.v1.ServerChunkEvents.Unload.onChunkUnload

Nguồn: `upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/api/event/lifecycle/v1/ServerChunkEvents.java:101`

```java
void onChunkUnload(class_3218 world, class_2818 chunk)
```

## net.fabricmc.fabric.api.event.lifecycle.v1.ServerChunkEvents.LevelTypeChange

Nguồn: `upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/api/event/lifecycle/v1/ServerChunkEvents.java:104`

```java
@FunctionalInterface public interface LevelTypeChange
```

## net.fabricmc.fabric.api.event.lifecycle.v1.ServerChunkEvents.LevelTypeChange.onChunkLevelTypeChange

Nguồn: `upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/api/event/lifecycle/v1/ServerChunkEvents.java:106`

```java
void onChunkLevelTypeChange(class_3218 world, class_2818 chunk, class_3194 oldLevelType, class_3194 newLevelType)
```

## net.fabricmc.fabric.api.event.lifecycle.v1.ServerEntityEvents

Nguồn: `upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/api/event/lifecycle/v1/ServerEntityEvents.java:27`

```java
public final class ServerEntityEvents
```

## net.fabricmc.fabric.api.event.lifecycle.v1.ServerEntityEvents.ENTITY_LOAD

Nguồn: `upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/api/event/lifecycle/v1/ServerEntityEvents.java:36`

```java
public static final Event<ServerEntityEvents.Load> ENTITY_LOAD = EventFactory.createArrayBacked(ServerEntityEvents.Load.class, callbacks -> (entity, world) -> { for (Load callback : callbacks) { callback.onLoad(entity, world); } })
```

## net.fabricmc.fabric.api.event.lifecycle.v1.ServerEntityEvents.ENTITY_UNLOAD

Nguồn: `upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/api/event/lifecycle/v1/ServerEntityEvents.java:47`

```java
public static final Event<ServerEntityEvents.Unload> ENTITY_UNLOAD = EventFactory.createArrayBacked(ServerEntityEvents.Unload.class, callbacks -> (entity, world) -> { for (Unload callback : callbacks) { callback.onUnload(entity, world); } })
```

## net.fabricmc.fabric.api.event.lifecycle.v1.ServerEntityEvents.EQUIPMENT_CHANGE

Nguồn: `upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/api/event/lifecycle/v1/ServerEntityEvents.java:59`

```java
public static final Event<EquipmentChange> EQUIPMENT_CHANGE = EventFactory.createArrayBacked(ServerEntityEvents.EquipmentChange.class, callbacks -> (livingEntity, equipmentSlot, previous, next) -> { for (EquipmentChange callback : callbacks) { callback.onChange(livingEntity, equipmentSlot, previous, next); } })
```

## net.fabricmc.fabric.api.event.lifecycle.v1.ServerEntityEvents.Load

Nguồn: `upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/api/event/lifecycle/v1/ServerEntityEvents.java:65`

```java
@FunctionalInterface public interface Load
```

## net.fabricmc.fabric.api.event.lifecycle.v1.ServerEntityEvents.Load.onLoad

Nguồn: `upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/api/event/lifecycle/v1/ServerEntityEvents.java:67`

```java
void onLoad(class_1297 entity, class_3218 world)
```

## net.fabricmc.fabric.api.event.lifecycle.v1.ServerEntityEvents.Unload

Nguồn: `upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/api/event/lifecycle/v1/ServerEntityEvents.java:70`

```java
@FunctionalInterface public interface Unload
```

## net.fabricmc.fabric.api.event.lifecycle.v1.ServerEntityEvents.Unload.onUnload

Nguồn: `upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/api/event/lifecycle/v1/ServerEntityEvents.java:72`

```java
void onUnload(class_1297 entity, class_3218 world)
```

## net.fabricmc.fabric.api.event.lifecycle.v1.ServerEntityEvents.EquipmentChange

Nguồn: `upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/api/event/lifecycle/v1/ServerEntityEvents.java:75`

```java
@FunctionalInterface public interface EquipmentChange
```

## net.fabricmc.fabric.api.event.lifecycle.v1.ServerEntityEvents.EquipmentChange.onChange

Nguồn: `upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/api/event/lifecycle/v1/ServerEntityEvents.java:77`

```java
void onChange(class_1309 livingEntity, class_1304 equipmentSlot, class_1799 previousStack, class_1799 currentStack)
```

## net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents

Nguồn: `upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/api/event/lifecycle/v1/ServerLifecycleEvents.java:26`

```java
public final class ServerLifecycleEvents
```

## net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents.SERVER_STARTING

Nguồn: `upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/api/event/lifecycle/v1/ServerLifecycleEvents.java:35`

```java
public static final Event<ServerStarting> SERVER_STARTING = EventFactory.createArrayBacked(ServerStarting.class, callbacks -> server -> { for (ServerStarting callback : callbacks) { callback.onServerStarting(server); } })
```

## net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents.SERVER_STARTED

Nguồn: `upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/api/event/lifecycle/v1/ServerLifecycleEvents.java:46`

```java
public static final Event<ServerStarted> SERVER_STARTED = EventFactory.createArrayBacked(ServerStarted.class, (callbacks) -> (server) -> { for (ServerStarted callback : callbacks) { callback.onServerStarted(server); } })
```

## net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents.SERVER_STOPPING

Nguồn: `upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/api/event/lifecycle/v1/ServerLifecycleEvents.java:60`

```java
public static final Event<ServerStopping> SERVER_STOPPING = EventFactory.createArrayBacked(ServerStopping.class, (callbacks) -> (server) -> { for (ServerStopping callback : callbacks) { callback.onServerStopping(server); } })
```

## net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents.SERVER_STOPPED

Nguồn: `upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/api/event/lifecycle/v1/ServerLifecycleEvents.java:73`

```java
public static final Event<ServerStopped> SERVER_STOPPED = EventFactory.createArrayBacked(ServerStopped.class, callbacks -> server -> { for (ServerStopped callback : callbacks) { callback.onServerStopped(server); } })
```

## net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents.SYNC_DATA_PACK_CONTENTS

Nguồn: `upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/api/event/lifecycle/v1/ServerLifecycleEvents.java:83`

```java
public static final Event<SyncDataPackContents> SYNC_DATA_PACK_CONTENTS = EventFactory.createArrayBacked(SyncDataPackContents.class, callbacks -> (player, joined) -> { for (SyncDataPackContents callback : callbacks) { callback.onSyncDataPackContents(player, joined); } })
```

## net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents.START_DATA_PACK_RELOAD

Nguồn: `upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/api/event/lifecycle/v1/ServerLifecycleEvents.java:92`

```java
public static final Event<StartDataPackReload> START_DATA_PACK_RELOAD = EventFactory.createArrayBacked(StartDataPackReload.class, callbacks -> (server, serverResourceManager) -> { for (StartDataPackReload callback : callbacks) { callback.startDataPackReload(server, serverResourceManager); } })
```

## net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents.END_DATA_PACK_RELOAD

Nguồn: `upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/api/event/lifecycle/v1/ServerLifecycleEvents.java:103`

```java
public static final Event<EndDataPackReload> END_DATA_PACK_RELOAD = EventFactory.createArrayBacked(EndDataPackReload.class, callbacks -> (server, serverResourceManager, success) -> { for (EndDataPackReload callback : callbacks) { callback.endDataPackReload(server, serverResourceManager, success); } })
```

## net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents.BEFORE_SAVE

Nguồn: `upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/api/event/lifecycle/v1/ServerLifecycleEvents.java:112`

```java
public static final Event<BeforeSave> BEFORE_SAVE = EventFactory.createArrayBacked(BeforeSave.class, callbacks -> (server, flush, force) -> { for (BeforeSave callback : callbacks) { callback.onBeforeSave(server, flush, force); } })
```

## net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents.AFTER_SAVE

Nguồn: `upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/api/event/lifecycle/v1/ServerLifecycleEvents.java:121`

```java
public static final Event<AfterSave> AFTER_SAVE = EventFactory.createArrayBacked(AfterSave.class, callbacks -> (server, flush, force) -> { for (AfterSave callback : callbacks) { callback.onAfterSave(server, flush, force); } })
```

## net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents.ServerStarting

Nguồn: `upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/api/event/lifecycle/v1/ServerLifecycleEvents.java:127`

```java
@FunctionalInterface public interface ServerStarting
```

## net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents.ServerStarting.onServerStarting

Nguồn: `upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/api/event/lifecycle/v1/ServerLifecycleEvents.java:129`

```java
void onServerStarting(MinecraftServer server)
```

## net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents.ServerStarted

Nguồn: `upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/api/event/lifecycle/v1/ServerLifecycleEvents.java:132`

```java
@FunctionalInterface public interface ServerStarted
```

## net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents.ServerStarted.onServerStarted

Nguồn: `upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/api/event/lifecycle/v1/ServerLifecycleEvents.java:134`

```java
void onServerStarted(MinecraftServer server)
```

## net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents.ServerStopping

Nguồn: `upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/api/event/lifecycle/v1/ServerLifecycleEvents.java:137`

```java
@FunctionalInterface public interface ServerStopping
```

## net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents.ServerStopping.onServerStopping

Nguồn: `upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/api/event/lifecycle/v1/ServerLifecycleEvents.java:139`

```java
void onServerStopping(MinecraftServer server)
```

## net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents.ServerStopped

Nguồn: `upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/api/event/lifecycle/v1/ServerLifecycleEvents.java:142`

```java
@FunctionalInterface public interface ServerStopped
```

## net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents.ServerStopped.onServerStopped

Nguồn: `upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/api/event/lifecycle/v1/ServerLifecycleEvents.java:144`

```java
void onServerStopped(MinecraftServer server)
```

## net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents.SyncDataPackContents

Nguồn: `upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/api/event/lifecycle/v1/ServerLifecycleEvents.java:147`

```java
@FunctionalInterface public interface SyncDataPackContents
```

## net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents.SyncDataPackContents.onSyncDataPackContents

Nguồn: `upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/api/event/lifecycle/v1/ServerLifecycleEvents.java:159`

```java
void onSyncDataPackContents(class_3222 player, boolean joined)
```

## net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents.StartDataPackReload

Nguồn: `upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/api/event/lifecycle/v1/ServerLifecycleEvents.java:162`

```java
@FunctionalInterface public interface StartDataPackReload
```

## net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents.StartDataPackReload.startDataPackReload

Nguồn: `upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/api/event/lifecycle/v1/ServerLifecycleEvents.java:164`

```java
void startDataPackReload(MinecraftServer server, class_6860 resourceManager)
```

## net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents.EndDataPackReload

Nguồn: `upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/api/event/lifecycle/v1/ServerLifecycleEvents.java:167`

```java
@FunctionalInterface public interface EndDataPackReload
```

## net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents.EndDataPackReload.endDataPackReload

Nguồn: `upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/api/event/lifecycle/v1/ServerLifecycleEvents.java:178`

```java
void endDataPackReload(MinecraftServer server, class_6860 resourceManager, boolean success)
```

## net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents.BeforeSave

Nguồn: `upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/api/event/lifecycle/v1/ServerLifecycleEvents.java:181`

```java
@FunctionalInterface public interface BeforeSave
```

## net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents.BeforeSave.onBeforeSave

Nguồn: `upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/api/event/lifecycle/v1/ServerLifecycleEvents.java:190`

```java
void onBeforeSave(MinecraftServer server, boolean flush, boolean force)
```

## net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents.AfterSave

Nguồn: `upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/api/event/lifecycle/v1/ServerLifecycleEvents.java:193`

```java
@FunctionalInterface public interface AfterSave
```

## net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents.AfterSave.onAfterSave

Nguồn: `upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/api/event/lifecycle/v1/ServerLifecycleEvents.java:202`

```java
void onAfterSave(MinecraftServer server, boolean flush, boolean force)
```

## net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents

Nguồn: `upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/api/event/lifecycle/v1/ServerTickEvents.java:32`

```java
public final class ServerTickEvents
```

## net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents.START_SERVER_TICK

Nguồn: `upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/api/event/lifecycle/v1/ServerTickEvents.java:41`

```java
public static final Event<StartTick> START_SERVER_TICK = EventFactory.createArrayBacked(StartTick.class, callbacks -> server -> { for (StartTick event : callbacks) { event.onStartTick(server); } })
```

## net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents.END_SERVER_TICK

Nguồn: `upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/api/event/lifecycle/v1/ServerTickEvents.java:52`

```java
public static final Event<EndTick> END_SERVER_TICK = EventFactory.createArrayBacked(EndTick.class, callbacks -> server -> { for (EndTick event : callbacks) { event.onEndTick(server); } })
```

## net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents.START_WORLD_TICK

Nguồn: `upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/api/event/lifecycle/v1/ServerTickEvents.java:63`

```java
public static final Event<StartWorldTick> START_WORLD_TICK = EventFactory.createArrayBacked(StartWorldTick.class, callbacks -> world -> { for (StartWorldTick callback : callbacks) { callback.onStartTick(world); } })
```

## net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents.END_WORLD_TICK

Nguồn: `upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/api/event/lifecycle/v1/ServerTickEvents.java:76`

```java
public static final Event<EndWorldTick> END_WORLD_TICK = EventFactory.createArrayBacked(EndWorldTick.class, callbacks -> world -> { for (EndWorldTick callback : callbacks) { callback.onEndTick(world); } })
```

## net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents.StartTick

Nguồn: `upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/api/event/lifecycle/v1/ServerTickEvents.java:82`

```java
@FunctionalInterface public interface StartTick
```

## net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents.StartTick.onStartTick

Nguồn: `upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/api/event/lifecycle/v1/ServerTickEvents.java:84`

```java
void onStartTick(MinecraftServer server)
```

## net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents.EndTick

Nguồn: `upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/api/event/lifecycle/v1/ServerTickEvents.java:87`

```java
@FunctionalInterface public interface EndTick
```

## net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents.EndTick.onEndTick

Nguồn: `upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/api/event/lifecycle/v1/ServerTickEvents.java:89`

```java
void onEndTick(MinecraftServer server)
```

## net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents.StartWorldTick

Nguồn: `upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/api/event/lifecycle/v1/ServerTickEvents.java:92`

```java
@FunctionalInterface public interface StartWorldTick
```

## net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents.StartWorldTick.onStartTick

Nguồn: `upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/api/event/lifecycle/v1/ServerTickEvents.java:94`

```java
void onStartTick(class_3218 world)
```

## net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents.EndWorldTick

Nguồn: `upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/api/event/lifecycle/v1/ServerTickEvents.java:97`

```java
@FunctionalInterface public interface EndWorldTick
```

## net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents.EndWorldTick.onEndTick

Nguồn: `upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/api/event/lifecycle/v1/ServerTickEvents.java:99`

```java
void onEndTick(class_3218 world)
```

## net.fabricmc.fabric.api.event.lifecycle.v1.ServerWorldEvents

Nguồn: `upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/api/event/lifecycle/v1/ServerWorldEvents.java:25`

```java
public final class ServerWorldEvents
```

## net.fabricmc.fabric.api.event.lifecycle.v1.ServerWorldEvents.LOAD

Nguồn: `upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/api/event/lifecycle/v1/ServerWorldEvents.java:31`

```java
public static final Event<Load> LOAD = EventFactory.createArrayBacked(Load.class, callbacks -> (server, world) -> { for (Load callback : callbacks) { callback.onWorldLoad(server, world); } })
```

## net.fabricmc.fabric.api.event.lifecycle.v1.ServerWorldEvents.UNLOAD

Nguồn: `upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/api/event/lifecycle/v1/ServerWorldEvents.java:43`

```java
public static final Event<Unload> UNLOAD = EventFactory.createArrayBacked(Unload.class, callbacks -> (server, world) -> { for (Unload callback : callbacks) { callback.onWorldUnload(server, world); } })
```

## net.fabricmc.fabric.api.event.lifecycle.v1.ServerWorldEvents.Load

Nguồn: `upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/api/event/lifecycle/v1/ServerWorldEvents.java:49`

```java
@FunctionalInterface public interface Load
```

## net.fabricmc.fabric.api.event.lifecycle.v1.ServerWorldEvents.Load.onWorldLoad

Nguồn: `upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/api/event/lifecycle/v1/ServerWorldEvents.java:51`

```java
void onWorldLoad(MinecraftServer server, class_3218 world)
```

## net.fabricmc.fabric.api.event.lifecycle.v1.ServerWorldEvents.Unload

Nguồn: `upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/api/event/lifecycle/v1/ServerWorldEvents.java:54`

```java
@FunctionalInterface public interface Unload
```

## net.fabricmc.fabric.api.event.lifecycle.v1.ServerWorldEvents.Unload.onWorldUnload

Nguồn: `upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/api/event/lifecycle/v1/ServerWorldEvents.java:56`

```java
void onWorldUnload(MinecraftServer server, class_3218 world)
```

## net.fabricmc.fabric.impl.client.event.lifecycle.ClientLifecycleEventsImpl

Nguồn: `upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/impl/client/event/lifecycle/ClientLifecycleEventsImpl.java:25`

```java
public final class ClientLifecycleEventsImpl implements ClientModInitializer
```

## net.fabricmc.fabric.impl.client.event.lifecycle.ClientLifecycleEventsImpl.onInitializeClient

Nguồn: `upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/impl/client/event/lifecycle/ClientLifecycleEventsImpl.java:26`

```java
@Override public void onInitializeClient()
```

## net.fabricmc.fabric.impl.event.lifecycle.ChunkLevelTypeEventTracker

Nguồn: `upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/impl/event/lifecycle/ChunkLevelTypeEventTracker.java:25`

```java
public interface ChunkLevelTypeEventTracker
```

## net.fabricmc.fabric.impl.event.lifecycle.ChunkLevelTypeEventTracker.fabric_setCurrentEventLevelType

Nguồn: `upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/impl/event/lifecycle/ChunkLevelTypeEventTracker.java:26`

```java
void fabric_setCurrentEventLevelType(class_3194 levelType)
```

## net.fabricmc.fabric.impl.event.lifecycle.ChunkLevelTypeEventTracker.fabric_getCurrentEventLevelType

Nguồn: `upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/impl/event/lifecycle/ChunkLevelTypeEventTracker.java:28`

```java
class_3194 fabric_getCurrentEventLevelType()
```

## net.fabricmc.fabric.impl.event.lifecycle.LifecycleEventsImpl

Nguồn: `upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/impl/event/lifecycle/LifecycleEventsImpl.java:28`

```java
public final class LifecycleEventsImpl implements ModInitializer
```

## net.fabricmc.fabric.impl.event.lifecycle.LifecycleEventsImpl.onInitialize

Nguồn: `upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/impl/event/lifecycle/LifecycleEventsImpl.java:29`

```java
@Override public void onInitialize()
```

## net.fabricmc.fabric.impl.event.lifecycle.LoadedChunksCache

Nguồn: `upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/impl/event/lifecycle/LoadedChunksCache.java:25`

```java
public interface LoadedChunksCache
```

## net.fabricmc.fabric.impl.event.lifecycle.LoadedChunksCache.fabric_getLoadedChunks

Nguồn: `upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/impl/event/lifecycle/LoadedChunksCache.java:26`

```java
Set<class_2818> fabric_getLoadedChunks()
```

## net.fabricmc.fabric.impl.event.lifecycle.LoadedChunksCache.fabric_markLoaded

Nguồn: `upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/impl/event/lifecycle/LoadedChunksCache.java:31`

```java
void fabric_markLoaded(class_2818 chunk)
```

## net.fabricmc.fabric.impl.event.lifecycle.LoadedChunksCache.fabric_markUnloaded

Nguồn: `upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/impl/event/lifecycle/LoadedChunksCache.java:36`

```java
void fabric_markUnloaded(class_2818 chunk)
```

## net.fabricmc.fabric.mixin.event.lifecycle.ChunkHolderMixin

Nguồn: `upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/mixin/event/lifecycle/ChunkHolderMixin.java:46`

```java
@Mixin(class_3193.class) public abstract class ChunkHolderMixin extends class_9761 implements ChunkLevelTypeEventTracker
```

## net.fabricmc.fabric.mixin.event.lifecycle.ChunkHolderMixin.fabric_setCurrentEventLevelType

Nguồn: `upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/mixin/event/lifecycle/ChunkHolderMixin.java:116`

```java
@Override public void fabric_setCurrentEventLevelType(class_3194 levelType)
```

## net.fabricmc.fabric.mixin.event.lifecycle.ChunkHolderMixin.fabric_getCurrentEventLevelType

Nguồn: `upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/mixin/event/lifecycle/ChunkHolderMixin.java:121`

```java
@Override public class_3194 fabric_getCurrentEventLevelType()
```

## net.fabricmc.fabric.mixin.event.lifecycle.ChunkMapMixin

Nguồn: `upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/mixin/event/lifecycle/ChunkMapMixin.java:35`

```java
@Mixin(class_3898.class) public abstract class ChunkMapMixin
```

## net.fabricmc.fabric.mixin.event.lifecycle.LevelMixin

Nguồn: `upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/mixin/event/lifecycle/LevelMixin.java:28`

```java
@Mixin(class_1937.class) public abstract class LevelMixin implements LoadedChunksCache
```

## net.fabricmc.fabric.mixin.event.lifecycle.LevelMixin.fabric_getLoadedChunks

Nguồn: `upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/mixin/event/lifecycle/LevelMixin.java:33`

```java
@Override public Set<class_2818> fabric_getLoadedChunks()
```

## net.fabricmc.fabric.mixin.event.lifecycle.LevelMixin.fabric_markLoaded

Nguồn: `upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/mixin/event/lifecycle/LevelMixin.java:38`

```java
@Override public void fabric_markLoaded(class_2818 chunk)
```

## net.fabricmc.fabric.mixin.event.lifecycle.LevelMixin.fabric_markUnloaded

Nguồn: `upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/mixin/event/lifecycle/LevelMixin.java:43`

```java
@Override public void fabric_markUnloaded(class_2818 chunk)
```

## net.fabricmc.fabric.mixin.event.lifecycle.LivingEntityMixin

Nguồn: `upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/mixin/event/lifecycle/LivingEntityMixin.java:32`

```java
@Mixin(class_1309.class) public abstract class LivingEntityMixin
```

## net.fabricmc.fabric.mixin.event.lifecycle.MinecraftServerMixin

Nguồn: `upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/mixin/event/lifecycle/MinecraftServerMixin.java:39`

```java
@Mixin(MinecraftServer.class) public abstract class MinecraftServerMixin
```

## net.fabricmc.fabric.mixin.event.lifecycle.PlayerListMixin

Nguồn: `upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/mixin/event/lifecycle/PlayerListMixin.java:29`

```java
@Mixin(class_3324.class) public class PlayerListMixin
```

## net.fabricmc.fabric.mixin.event.lifecycle.ReloadableServerResourcesMixin

Nguồn: `upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/mixin/event/lifecycle/ReloadableServerResourcesMixin.java:36`

```java
@Mixin(class_5350.class) public class ReloadableServerResourcesMixin
```

## net.fabricmc.fabric.mixin.event.lifecycle.ServerLevelMixin

Nguồn: `upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/mixin/event/lifecycle/ServerLevelMixin.java:29`

```java
@Mixin(class_3218.class) public abstract class ServerLevelMixin
```

## net.fabricmc.fabric.mixin.event.lifecycle.client.ClientChunkCacheMixin

Nguồn: `upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/mixin/event/lifecycle/client/ClientChunkCacheMixin.java:39`

```java
@Mixin(class_631.class) public abstract class ClientChunkCacheMixin
```

## net.fabricmc.fabric.mixin.event.lifecycle.client.ClientConfigurationPacketListenerImplMixin

Nguồn: `upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/mixin/event/lifecycle/client/ClientConfigurationPacketListenerImplMixin.java:28`

```java
@Mixin(class_8674.class) public class ClientConfigurationPacketListenerImplMixin
```

## net.fabricmc.fabric.mixin.event.lifecycle.client.ClientLevelMixin

Nguồn: `upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/mixin/event/lifecycle/client/ClientLevelMixin.java:26`

```java
@Mixin(class_638.class) public abstract class ClientLevelMixin
```

## net.fabricmc.fabric.mixin.event.lifecycle.client.ClientLevelMixin.tickWorldAfterBlockEntities

Nguồn: `upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/mixin/event/lifecycle/client/ClientLevelMixin.java:28`

```java
@Inject(method = "tickEntities", at = @At("TAIL")) public void tickWorldAfterBlockEntities(CallbackInfo ci)
```

## net.fabricmc.fabric.mixin.event.lifecycle.client.LevelChunkMixin.getLevel

Nguồn: `upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/mixin/event/lifecycle/client/LevelChunkMixin.java:42`

```java
@Shadow public abstract class_1937 getLevel()
```

## net.fabricmc.fabric.mixin.event.lifecycle.client.MinecraftMixin

Nguồn: `upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/mixin/event/lifecycle/client/MinecraftMixin.java:29`

```java
@Mixin(class_310.class) public abstract class MinecraftMixin
```

## net.fabricmc.fabric.mixin.event.lifecycle.server.LevelChunkMixin.getLevel

Nguồn: `upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/mixin/event/lifecycle/server/LevelChunkMixin.java:45`

```java
@Shadow public abstract class_1937 getLevel()
```

## net.fabricmc.fabric.api.client.networking.v1.C2SConfigurationChannelEvents

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/client/networking/v1/C2SConfigurationChannelEvents.java:30`

```java
public final class C2SConfigurationChannelEvents
```

## net.fabricmc.fabric.api.client.networking.v1.C2SConfigurationChannelEvents.REGISTER

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/client/networking/v1/C2SConfigurationChannelEvents.java:35`

```java
public static final Event<Register> REGISTER = EventFactory.createArrayBacked(Register.class, callbacks -> (handler, sender, client, channels) -> { for (Register callback : callbacks) { callback.onChannelRegister(handler, sender, client, channels); } })
```

## net.fabricmc.fabric.api.client.networking.v1.C2SConfigurationChannelEvents.UNREGISTER

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/client/networking/v1/C2SConfigurationChannelEvents.java:45`

```java
public static final Event<Unregister> UNREGISTER = EventFactory.createArrayBacked(Unregister.class, callbacks -> (handler, sender, client, channels) -> { for (Unregister callback : callbacks) { callback.onChannelUnregister(handler, sender, client, channels); } })
```

## net.fabricmc.fabric.api.client.networking.v1.C2SConfigurationChannelEvents.Register

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/client/networking/v1/C2SConfigurationChannelEvents.java:57`

```java
@FunctionalInterface public interface Register
```

## net.fabricmc.fabric.api.client.networking.v1.C2SConfigurationChannelEvents.Register.onChannelRegister

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/client/networking/v1/C2SConfigurationChannelEvents.java:59`

```java
void onChannelRegister(class_8674 handler, PacketSender sender, class_310 client, List<class_2960> channels)
```

## net.fabricmc.fabric.api.client.networking.v1.C2SConfigurationChannelEvents.Unregister

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/client/networking/v1/C2SConfigurationChannelEvents.java:65`

```java
@FunctionalInterface public interface Unregister
```

## net.fabricmc.fabric.api.client.networking.v1.C2SConfigurationChannelEvents.Unregister.onChannelUnregister

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/client/networking/v1/C2SConfigurationChannelEvents.java:67`

```java
void onChannelUnregister(class_8674 handler, PacketSender sender, class_310 client, List<class_2960> channels)
```

## net.fabricmc.fabric.api.client.networking.v1.C2SPlayChannelEvents

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/client/networking/v1/C2SPlayChannelEvents.java:30`

```java
public final class C2SPlayChannelEvents
```

## net.fabricmc.fabric.api.client.networking.v1.C2SPlayChannelEvents.REGISTER

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/client/networking/v1/C2SPlayChannelEvents.java:35`

```java
public static final Event<Register> REGISTER = EventFactory.createArrayBacked(Register.class, callbacks -> (handler, sender, client, channels) -> { for (Register callback : callbacks) { callback.onChannelRegister(handler, sender, client, channels); } })
```

## net.fabricmc.fabric.api.client.networking.v1.C2SPlayChannelEvents.UNREGISTER

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/client/networking/v1/C2SPlayChannelEvents.java:45`

```java
public static final Event<Unregister> UNREGISTER = EventFactory.createArrayBacked(Unregister.class, callbacks -> (handler, sender, client, channels) -> { for (Unregister callback : callbacks) { callback.onChannelUnregister(handler, sender, client, channels); } })
```

## net.fabricmc.fabric.api.client.networking.v1.C2SPlayChannelEvents.Register

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/client/networking/v1/C2SPlayChannelEvents.java:57`

```java
@FunctionalInterface public interface Register
```

## net.fabricmc.fabric.api.client.networking.v1.C2SPlayChannelEvents.Register.onChannelRegister

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/client/networking/v1/C2SPlayChannelEvents.java:59`

```java
void onChannelRegister(class_634 handler, PacketSender sender, class_310 client, List<class_2960> channels)
```

## net.fabricmc.fabric.api.client.networking.v1.C2SPlayChannelEvents.Unregister

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/client/networking/v1/C2SPlayChannelEvents.java:65`

```java
@FunctionalInterface public interface Unregister
```

## net.fabricmc.fabric.api.client.networking.v1.C2SPlayChannelEvents.Unregister.onChannelUnregister

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/client/networking/v1/C2SPlayChannelEvents.java:67`

```java
void onChannelUnregister(class_634 handler, PacketSender sender, class_310 client, List<class_2960> channels)
```

## net.fabricmc.fabric.api.client.networking.v1.ClientConfigurationConnectionEvents

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/client/networking/v1/ClientConfigurationConnectionEvents.java:28`

```java
public final class ClientConfigurationConnectionEvents
```

## net.fabricmc.fabric.api.client.networking.v1.ClientConfigurationConnectionEvents.INIT

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/client/networking/v1/ClientConfigurationConnectionEvents.java:36`

```java
public static final Event<ClientConfigurationConnectionEvents.Init> INIT = EventFactory.createArrayBacked(ClientConfigurationConnectionEvents.Init.class, callbacks -> (handler, client) -> { for (ClientConfigurationConnectionEvents.Init callback : callbacks) { callback.onConfigurationInit(handler, client); } })
```

## net.fabricmc.fabric.api.client.networking.v1.ClientConfigurationConnectionEvents.START

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/client/networking/v1/ClientConfigurationConnectionEvents.java:47`

```java
public static final Event<ClientConfigurationConnectionEvents.Start> START = EventFactory.createArrayBacked(ClientConfigurationConnectionEvents.Start.class, callbacks -> (handler, client) -> { for (ClientConfigurationConnectionEvents.Start callback : callbacks) { callback.onConfigurationStart(handler, client); } })
```

## net.fabricmc.fabric.api.client.networking.v1.ClientConfigurationConnectionEvents.COMPLETE

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/client/networking/v1/ClientConfigurationConnectionEvents.java:58`

```java
public static final Event<ClientConfigurationConnectionEvents.Complete> COMPLETE = EventFactory.createArrayBacked(ClientConfigurationConnectionEvents.Complete.class, callbacks -> (handler, client) -> { for (ClientConfigurationConnectionEvents.Complete callback : callbacks) { callback.onConfigurationComplete(handler, client); } })
```

## net.fabricmc.fabric.api.client.networking.v1.ClientConfigurationConnectionEvents.DISCONNECT

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/client/networking/v1/ClientConfigurationConnectionEvents.java:69`

```java
public static final Event<ClientConfigurationConnectionEvents.Disconnect> DISCONNECT = EventFactory.createArrayBacked(ClientConfigurationConnectionEvents.Disconnect.class, callbacks -> (handler, client) -> { for (ClientConfigurationConnectionEvents.Disconnect callback : callbacks) { callback.onConfigurationDisconnect(handler, client); } })
```

## net.fabricmc.fabric.api.client.networking.v1.ClientConfigurationConnectionEvents.Init

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/client/networking/v1/ClientConfigurationConnectionEvents.java:78`

```java
@FunctionalInterface public interface Init
```

## net.fabricmc.fabric.api.client.networking.v1.ClientConfigurationConnectionEvents.Init.onConfigurationInit

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/client/networking/v1/ClientConfigurationConnectionEvents.java:80`

```java
void onConfigurationInit(class_8674 handler, class_310 client)
```

## net.fabricmc.fabric.api.client.networking.v1.ClientConfigurationConnectionEvents.Start

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/client/networking/v1/ClientConfigurationConnectionEvents.java:83`

```java
@FunctionalInterface public interface Start
```

## net.fabricmc.fabric.api.client.networking.v1.ClientConfigurationConnectionEvents.Start.onConfigurationStart

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/client/networking/v1/ClientConfigurationConnectionEvents.java:85`

```java
void onConfigurationStart(class_8674 handler, class_310 client)
```

## net.fabricmc.fabric.api.client.networking.v1.ClientConfigurationConnectionEvents.Complete

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/client/networking/v1/ClientConfigurationConnectionEvents.java:88`

```java
@FunctionalInterface public interface Complete
```

## net.fabricmc.fabric.api.client.networking.v1.ClientConfigurationConnectionEvents.Complete.onConfigurationComplete

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/client/networking/v1/ClientConfigurationConnectionEvents.java:90`

```java
void onConfigurationComplete(class_8674 handler, class_310 client)
```

## net.fabricmc.fabric.api.client.networking.v1.ClientConfigurationConnectionEvents.Disconnect

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/client/networking/v1/ClientConfigurationConnectionEvents.java:93`

```java
@FunctionalInterface public interface Disconnect
```

## net.fabricmc.fabric.api.client.networking.v1.ClientConfigurationConnectionEvents.Disconnect.onConfigurationDisconnect

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/client/networking/v1/ClientConfigurationConnectionEvents.java:95`

```java
void onConfigurationDisconnect(class_8674 handler, class_310 client)
```

## net.fabricmc.fabric.api.client.networking.v1.ClientConfigurationConnectionEvents.READY

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/client/networking/v1/ClientConfigurationConnectionEvents.java:103`

```java
@Deprecated public static final Event<ClientConfigurationConnectionEvents.Ready> READY = EventFactory.createArrayBacked(ClientConfigurationConnectionEvents.Ready.class, callbacks -> (handler, client) -> { for (ClientConfigurationConnectionEvents.Ready callback : callbacks) { callback.onConfigurationReady(handler, client); } })
```

## net.fabricmc.fabric.api.client.networking.v1.ClientConfigurationConnectionEvents.Ready

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/client/networking/v1/ClientConfigurationConnectionEvents.java:113`

```java
@Deprecated @FunctionalInterface public interface Ready
```

## net.fabricmc.fabric.api.client.networking.v1.ClientConfigurationConnectionEvents.Ready.onConfigurationReady

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/client/networking/v1/ClientConfigurationConnectionEvents.java:116`

```java
void onConfigurationReady(class_8674 handler, class_310 client)
```

## net.fabricmc.fabric.api.client.networking.v1.ClientConfigurationNetworking

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/client/networking/v1/ClientConfigurationNetworking.java:54`

```java
public final class ClientConfigurationNetworking
```

## net.fabricmc.fabric.api.client.networking.v1.ClientConfigurationNetworking.registerGlobalReceiver

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/client/networking/v1/ClientConfigurationNetworking.java:69`

```java
public static <T extends class_8710> boolean registerGlobalReceiver(class_8710.class_9154<T> type, ConfigurationPayloadHandler<T> handler)
```

## net.fabricmc.fabric.api.client.networking.v1.ClientConfigurationNetworking.unregisterGlobalReceiver

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/client/networking/v1/ClientConfigurationNetworking.java:85`

```java
public static ClientConfigurationNetworking.@Nullable ConfigurationPayloadHandler<?> unregisterGlobalReceiver(class_8710.class_9154<?> id)
```

## net.fabricmc.fabric.api.client.networking.v1.ClientConfigurationNetworking.getGlobalReceivers

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/client/networking/v1/ClientConfigurationNetworking.java:95`

```java
public static Set<class_2960> getGlobalReceivers()
```

## net.fabricmc.fabric.api.client.networking.v1.ClientConfigurationNetworking.registerReceiver

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/client/networking/v1/ClientConfigurationNetworking.java:115`

```java
public static <T extends class_8710> boolean registerReceiver(class_8710.class_9154<T> id, ConfigurationPayloadHandler<T> handler)
```

## net.fabricmc.fabric.api.client.networking.v1.ClientConfigurationNetworking.unregisterReceiver

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/client/networking/v1/ClientConfigurationNetworking.java:135`

```java
public static ClientConfigurationNetworking.@Nullable ConfigurationPayloadHandler<?> unregisterReceiver(class_2960 id)
```

## net.fabricmc.fabric.api.client.networking.v1.ClientConfigurationNetworking.getReceived

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/client/networking/v1/ClientConfigurationNetworking.java:151`

```java
public static Set<class_2960> getReceived() throws IllegalStateException
```

## net.fabricmc.fabric.api.client.networking.v1.ClientConfigurationNetworking.getSendable

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/client/networking/v1/ClientConfigurationNetworking.java:167`

```java
public static Set<class_2960> getSendable() throws IllegalStateException
```

## net.fabricmc.fabric.api.client.networking.v1.ClientConfigurationNetworking.canSend

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/client/networking/v1/ClientConfigurationNetworking.java:184`

```java
public static boolean canSend(class_2960 channelName) throws IllegalArgumentException
```

## net.fabricmc.fabric.api.client.networking.v1.ClientConfigurationNetworking.canSend

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/client/networking/v1/ClientConfigurationNetworking.java:201`

```java
public static boolean canSend(class_8710.class_9154<?> type)
```

## net.fabricmc.fabric.api.client.networking.v1.ClientConfigurationNetworking.getSender

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/client/networking/v1/ClientConfigurationNetworking.java:211`

```java
public static PacketSender getSender() throws IllegalStateException
```

## net.fabricmc.fabric.api.client.networking.v1.ClientConfigurationNetworking.send

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/client/networking/v1/ClientConfigurationNetworking.java:229`

```java
public static void send(class_8710 payload)
```

## net.fabricmc.fabric.api.client.networking.v1.ClientConfigurationNetworking.ConfigurationPayloadHandler

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/client/networking/v1/ClientConfigurationNetworking.java:250`

```java
@FunctionalInterface public interface ConfigurationPayloadHandler<T extends class_8710>
```

## net.fabricmc.fabric.api.client.networking.v1.ClientConfigurationNetworking.ConfigurationPayloadHandler.receive

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/client/networking/v1/ClientConfigurationNetworking.java:270`

```java
void receive(T payload, Context context)
```

## net.fabricmc.fabric.api.client.networking.v1.ClientConfigurationNetworking.Context

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/client/networking/v1/ClientConfigurationNetworking.java:273`

```java
@ApiStatus.NonExtendable public interface Context
```

## net.fabricmc.fabric.api.client.networking.v1.ClientConfigurationNetworking.Context.client

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/client/networking/v1/ClientConfigurationNetworking.java:278`

```java
class_310 client()
```

## net.fabricmc.fabric.api.client.networking.v1.ClientConfigurationNetworking.Context.networkHandler

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/client/networking/v1/ClientConfigurationNetworking.java:283`

```java
class_8674 networkHandler()
```

## net.fabricmc.fabric.api.client.networking.v1.ClientConfigurationNetworking.Context.responseSender

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/client/networking/v1/ClientConfigurationNetworking.java:288`

```java
PacketSender responseSender()
```

## net.fabricmc.fabric.api.client.networking.v1.ClientLoginConnectionEvents

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/client/networking/v1/ClientLoginConnectionEvents.java:28`

```java
public final class ClientLoginConnectionEvents
```

## net.fabricmc.fabric.api.client.networking.v1.ClientLoginConnectionEvents.INIT

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/client/networking/v1/ClientLoginConnectionEvents.java:36`

```java
public static final Event<Init> INIT = EventFactory.createArrayBacked(Init.class, callbacks -> (handler, client) -> { for (Init callback : callbacks) { callback.onLoginStart(handler, client); } })
```

## net.fabricmc.fabric.api.client.networking.v1.ClientLoginConnectionEvents.QUERY_START

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/client/networking/v1/ClientLoginConnectionEvents.java:56`

```java
public static final Event<QueryStart> QUERY_START = EventFactory.createArrayBacked(QueryStart.class, callbacks -> (handler, client) -> { for (QueryStart callback : callbacks) { callback.onLoginQueryStart(handler, client); } })
```

## net.fabricmc.fabric.api.client.networking.v1.ClientLoginConnectionEvents.DISCONNECT

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/client/networking/v1/ClientLoginConnectionEvents.java:67`

```java
public static final Event<Disconnect> DISCONNECT = EventFactory.createArrayBacked(Disconnect.class, callbacks -> (handler, client) -> { for (Disconnect callback : callbacks) { callback.onLoginDisconnect(handler, client); } })
```

## net.fabricmc.fabric.api.client.networking.v1.ClientLoginConnectionEvents.Init

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/client/networking/v1/ClientLoginConnectionEvents.java:79`

```java
@FunctionalInterface public interface Init
```

## net.fabricmc.fabric.api.client.networking.v1.ClientLoginConnectionEvents.Init.onLoginStart

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/client/networking/v1/ClientLoginConnectionEvents.java:81`

```java
void onLoginStart(class_635 handler, class_310 client)
```

## net.fabricmc.fabric.api.client.networking.v1.ClientLoginConnectionEvents.QueryStart

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/client/networking/v1/ClientLoginConnectionEvents.java:87`

```java
@FunctionalInterface public interface QueryStart
```

## net.fabricmc.fabric.api.client.networking.v1.ClientLoginConnectionEvents.QueryStart.onLoginQueryStart

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/client/networking/v1/ClientLoginConnectionEvents.java:89`

```java
void onLoginQueryStart(class_635 handler, class_310 client)
```

## net.fabricmc.fabric.api.client.networking.v1.ClientLoginConnectionEvents.Disconnect

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/client/networking/v1/ClientLoginConnectionEvents.java:95`

```java
@FunctionalInterface public interface Disconnect
```

## net.fabricmc.fabric.api.client.networking.v1.ClientLoginConnectionEvents.Disconnect.onLoginDisconnect

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/client/networking/v1/ClientLoginConnectionEvents.java:97`

```java
void onLoginDisconnect(class_635 handler, class_310 client)
```

## net.fabricmc.fabric.api.client.networking.v1.ClientLoginNetworking

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/client/networking/v1/ClientLoginNetworking.java:42`

```java
public final class ClientLoginNetworking
```

## net.fabricmc.fabric.api.client.networking.v1.ClientLoginNetworking.registerGlobalReceiver

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/client/networking/v1/ClientLoginNetworking.java:56`

```java
public static boolean registerGlobalReceiver(class_2960 channelName, LoginQueryRequestHandler queryHandler)
```

## net.fabricmc.fabric.api.client.networking.v1.ClientLoginNetworking.unregisterGlobalReceiver

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/client/networking/v1/ClientLoginNetworking.java:71`

```java
public static ClientLoginNetworking.@Nullable LoginQueryRequestHandler unregisterGlobalReceiver(class_2960 channelName)
```

## net.fabricmc.fabric.api.client.networking.v1.ClientLoginNetworking.getGlobalReceivers

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/client/networking/v1/ClientLoginNetworking.java:81`

```java
public static Set<class_2960> getGlobalReceivers()
```

## net.fabricmc.fabric.api.client.networking.v1.ClientLoginNetworking.registerReceiver

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/client/networking/v1/ClientLoginNetworking.java:96`

```java
public static boolean registerReceiver(class_2960 channelName, LoginQueryRequestHandler queryHandler) throws IllegalStateException
```

## net.fabricmc.fabric.api.client.networking.v1.ClientLoginNetworking.unregisterReceiver

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/client/networking/v1/ClientLoginNetworking.java:119`

```java
@Nullable public static LoginQueryRequestHandler unregisterReceiver(class_2960 channelName) throws IllegalStateException
```

## net.fabricmc.fabric.api.client.networking.v1.ClientLoginNetworking.LoginQueryRequestHandler

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/client/networking/v1/ClientLoginNetworking.java:137`

```java
@FunctionalInterface public interface LoginQueryRequestHandler
```

## net.fabricmc.fabric.api.client.networking.v1.ClientLoginNetworking.LoginQueryRequestHandler.receive

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/client/networking/v1/ClientLoginNetworking.java:156`

```java
CompletableFuture<@Nullable class_2540> receive(class_310 client, class_635 handler, class_2540 buf, Consumer<ChannelFutureListener> callbacksConsumer)
```

## net.fabricmc.fabric.api.client.networking.v1.ClientPlayConnectionEvents

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/client/networking/v1/ClientPlayConnectionEvents.java:29`

```java
public final class ClientPlayConnectionEvents
```

## net.fabricmc.fabric.api.client.networking.v1.ClientPlayConnectionEvents.INIT

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/client/networking/v1/ClientPlayConnectionEvents.java:35`

```java
public static final Event<Init> INIT = EventFactory.createArrayBacked(Init.class, callbacks -> (handler, client) -> { for (Init callback : callbacks) { callback.onPlayInit(handler, client); } })
```

## net.fabricmc.fabric.api.client.networking.v1.ClientPlayConnectionEvents.JOIN

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/client/networking/v1/ClientPlayConnectionEvents.java:47`

```java
public static final Event<Join> JOIN = EventFactory.createArrayBacked(Join.class, callbacks -> (handler, sender, client) -> { for (Join callback : callbacks) { callback.onPlayReady(handler, sender, client); } })
```

## net.fabricmc.fabric.api.client.networking.v1.ClientPlayConnectionEvents.DISCONNECT

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/client/networking/v1/ClientPlayConnectionEvents.java:58`

```java
public static final Event<Disconnect> DISCONNECT = EventFactory.createArrayBacked(Disconnect.class, callbacks -> (handler, client) -> { for (Disconnect callback : callbacks) { callback.onPlayDisconnect(handler, client); } })
```

## net.fabricmc.fabric.api.client.networking.v1.ClientPlayConnectionEvents.Init

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/client/networking/v1/ClientPlayConnectionEvents.java:67`

```java
@FunctionalInterface public interface Init
```

## net.fabricmc.fabric.api.client.networking.v1.ClientPlayConnectionEvents.Init.onPlayInit

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/client/networking/v1/ClientPlayConnectionEvents.java:69`

```java
void onPlayInit(class_634 handler, class_310 client)
```

## net.fabricmc.fabric.api.client.networking.v1.ClientPlayConnectionEvents.Join

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/client/networking/v1/ClientPlayConnectionEvents.java:72`

```java
@FunctionalInterface public interface Join
```

## net.fabricmc.fabric.api.client.networking.v1.ClientPlayConnectionEvents.Join.onPlayReady

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/client/networking/v1/ClientPlayConnectionEvents.java:74`

```java
void onPlayReady(class_634 handler, PacketSender sender, class_310 client)
```

## net.fabricmc.fabric.api.client.networking.v1.ClientPlayConnectionEvents.Disconnect

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/client/networking/v1/ClientPlayConnectionEvents.java:77`

```java
@FunctionalInterface public interface Disconnect
```

## net.fabricmc.fabric.api.client.networking.v1.ClientPlayConnectionEvents.Disconnect.onPlayDisconnect

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/client/networking/v1/ClientPlayConnectionEvents.java:79`

```java
void onPlayDisconnect(class_634 handler, class_310 client)
```

## net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/client/networking/v1/ClientPlayNetworking.java:54`

```java
public final class ClientPlayNetworking
```

## net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking.registerGlobalReceiver

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/client/networking/v1/ClientPlayNetworking.java:69`

```java
public static <T extends class_8710> boolean registerGlobalReceiver(class_8710.class_9154<T> type, PlayPayloadHandler<T> handler)
```

## net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking.unregisterGlobalReceiver

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/client/networking/v1/ClientPlayNetworking.java:85`

```java
public static ClientPlayNetworking.@Nullable PlayPayloadHandler<?> unregisterGlobalReceiver(class_2960 id)
```

## net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking.getGlobalReceivers

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/client/networking/v1/ClientPlayNetworking.java:95`

```java
public static Set<class_2960> getGlobalReceivers()
```

## net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking.registerReceiver

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/client/networking/v1/ClientPlayNetworking.java:115`

```java
public static <T extends class_8710> boolean registerReceiver(class_8710.class_9154<T> type, PlayPayloadHandler<T> handler)
```

## net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking.unregisterReceiver

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/client/networking/v1/ClientPlayNetworking.java:135`

```java
public static ClientPlayNetworking.@Nullable PlayPayloadHandler<?> unregisterReceiver(class_2960 id)
```

## net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking.getReceived

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/client/networking/v1/ClientPlayNetworking.java:151`

```java
public static Set<class_2960> getReceived() throws IllegalStateException
```

## net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking.getSendable

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/client/networking/v1/ClientPlayNetworking.java:167`

```java
public static Set<class_2960> getSendable() throws IllegalStateException
```

## net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking.canSend

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/client/networking/v1/ClientPlayNetworking.java:184`

```java
public static boolean canSend(class_2960 channelName) throws IllegalArgumentException
```

## net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking.canSend

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/client/networking/v1/ClientPlayNetworking.java:200`

```java
public static boolean canSend(class_8710.class_9154<?> type)
```

## net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking.createC2SPacket

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/client/networking/v1/ClientPlayNetworking.java:210`

```java
public static <T extends class_8710> class_2596<class_8706> createC2SPacket(T packet)
```

## net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking.getSender

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/client/networking/v1/ClientPlayNetworking.java:220`

```java
public static PacketSender getSender() throws IllegalStateException
```

## net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking.send

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/client/networking/v1/ClientPlayNetworking.java:237`

```java
public static void send(class_8710 payload)
```

## net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking.PlayPayloadHandler

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/client/networking/v1/ClientPlayNetworking.java:257`

```java
@FunctionalInterface public interface PlayPayloadHandler<T extends class_8710>
```

## net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking.PlayPayloadHandler.receive

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/client/networking/v1/ClientPlayNetworking.java:277`

```java
void receive(T payload, Context context)
```

## net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking.Context

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/client/networking/v1/ClientPlayNetworking.java:280`

```java
@ApiStatus.NonExtendable public interface Context
```

## net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking.Context.client

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/client/networking/v1/ClientPlayNetworking.java:285`

```java
class_310 client()
```

## net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking.Context.player

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/client/networking/v1/ClientPlayNetworking.java:290`

```java
class_746 player()
```

## net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking.Context.responseSender

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/client/networking/v1/ClientPlayNetworking.java:295`

```java
PacketSender responseSender()
```

## net.fabricmc.fabric.api.networking.v1.EntityTrackingEvents

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/networking/v1/EntityTrackingEvents.java:28`

```java
public final class EntityTrackingEvents
```

## net.fabricmc.fabric.api.networking.v1.EntityTrackingEvents.START_TRACKING

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/networking/v1/EntityTrackingEvents.java:34`

```java
public static final Event<StartTracking> START_TRACKING = EventFactory.createArrayBacked(StartTracking.class, callbacks -> (trackedEntity, player) -> { for (StartTracking callback : callbacks) { callback.onStartTracking(trackedEntity, player); } })
```

## net.fabricmc.fabric.api.networking.v1.EntityTrackingEvents.STOP_TRACKING

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/networking/v1/EntityTrackingEvents.java:44`

```java
public static final Event<StopTracking> STOP_TRACKING = EventFactory.createArrayBacked(StopTracking.class, callbacks -> (trackedEntity, player) -> { for (StopTracking callback : callbacks) { callback.onStopTracking(trackedEntity, player); } })
```

## net.fabricmc.fabric.api.networking.v1.EntityTrackingEvents.StartTracking

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/networking/v1/EntityTrackingEvents.java:50`

```java
@FunctionalInterface public interface StartTracking
```

## net.fabricmc.fabric.api.networking.v1.EntityTrackingEvents.StartTracking.onStartTracking

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/networking/v1/EntityTrackingEvents.java:58`

```java
void onStartTracking(class_1297 trackedEntity, class_3222 player)
```

## net.fabricmc.fabric.api.networking.v1.EntityTrackingEvents.StopTracking

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/networking/v1/EntityTrackingEvents.java:61`

```java
@FunctionalInterface public interface StopTracking
```

## net.fabricmc.fabric.api.networking.v1.EntityTrackingEvents.StopTracking.onStopTracking

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/networking/v1/EntityTrackingEvents.java:69`

```java
void onStopTracking(class_1297 trackedEntity, class_3222 player)
```

## net.fabricmc.fabric.api.networking.v1.FabricServerConfigurationNetworkHandler

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/networking/v1/FabricServerConfigurationNetworkHandler.java:27`

```java
public interface FabricServerConfigurationNetworkHandler
```

## net.fabricmc.fabric.api.networking.v1.FabricServerConfigurationNetworkHandler.addTask

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/networking/v1/FabricServerConfigurationNetworkHandler.java:40`

```java
default void addTask(class_8605 task)
```

## net.fabricmc.fabric.api.networking.v1.FabricServerConfigurationNetworkHandler.completeTask

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/networking/v1/FabricServerConfigurationNetworkHandler.java:50`

```java
default void completeTask(class_8605.class_8606 key)
```

## net.fabricmc.fabric.api.networking.v1.LoginPacketSender

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/networking/v1/LoginPacketSender.java:31`

```java
@ApiStatus.NonExtendable public interface LoginPacketSender extends PacketSender
```

## net.fabricmc.fabric.api.networking.v1.LoginPacketSender.createPacket

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/networking/v1/LoginPacketSender.java:40`

```java
class_2596<?> createPacket(class_2960 channelName, class_2540 buf)
```

## net.fabricmc.fabric.api.networking.v1.LoginPacketSender.sendPacket

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/networking/v1/LoginPacketSender.java:48`

```java
default void sendPacket(class_2960 channel, class_2540 buf)
```

## net.fabricmc.fabric.api.networking.v1.LoginPacketSender.sendPacket

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/networking/v1/LoginPacketSender.java:62`

```java
default void sendPacket(class_2960 channel, class_2540 buf, @Nullable ChannelFutureListener callback)
```

## net.fabricmc.fabric.api.networking.v1.PacketByteBufs

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/networking/v1/PacketByteBufs.java:27`

```java
public final class PacketByteBufs
```

## net.fabricmc.fabric.api.networking.v1.PacketByteBufs.empty

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/networking/v1/PacketByteBufs.java:35`

```java
public static class_2540 empty()
```

## net.fabricmc.fabric.api.networking.v1.PacketByteBufs.create

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/networking/v1/PacketByteBufs.java:44`

```java
public static class_2540 create()
```

## net.fabricmc.fabric.api.networking.v1.PacketByteBufs.readBytes

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/networking/v1/PacketByteBufs.java:58`

```java
public static class_2540 readBytes(ByteBuf buf, int length)
```

## net.fabricmc.fabric.api.networking.v1.PacketByteBufs.readSlice

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/networking/v1/PacketByteBufs.java:72`

```java
public static class_2540 readSlice(ByteBuf buf, int length)
```

## net.fabricmc.fabric.api.networking.v1.PacketByteBufs.readRetainedSlice

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/networking/v1/PacketByteBufs.java:86`

```java
public static class_2540 readRetainedSlice(ByteBuf buf, int length)
```

## net.fabricmc.fabric.api.networking.v1.PacketByteBufs.copy

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/networking/v1/PacketByteBufs.java:99`

```java
public static class_2540 copy(ByteBuf buf)
```

## net.fabricmc.fabric.api.networking.v1.PacketByteBufs.copy

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/networking/v1/PacketByteBufs.java:114`

```java
public static class_2540 copy(ByteBuf buf, int index, int length)
```

## net.fabricmc.fabric.api.networking.v1.PacketByteBufs.slice

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/networking/v1/PacketByteBufs.java:127`

```java
public static class_2540 slice(ByteBuf buf)
```

## net.fabricmc.fabric.api.networking.v1.PacketByteBufs.retainedSlice

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/networking/v1/PacketByteBufs.java:140`

```java
public static class_2540 retainedSlice(ByteBuf buf)
```

## net.fabricmc.fabric.api.networking.v1.PacketByteBufs.slice

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/networking/v1/PacketByteBufs.java:155`

```java
public static class_2540 slice(ByteBuf buf, int index, int length)
```

## net.fabricmc.fabric.api.networking.v1.PacketByteBufs.retainedSlice

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/networking/v1/PacketByteBufs.java:170`

```java
public static class_2540 retainedSlice(ByteBuf buf, int index, int length)
```

## net.fabricmc.fabric.api.networking.v1.PacketByteBufs.duplicate

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/networking/v1/PacketByteBufs.java:183`

```java
public static class_2540 duplicate(ByteBuf buf)
```

## net.fabricmc.fabric.api.networking.v1.PacketByteBufs.retainedDuplicate

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/networking/v1/PacketByteBufs.java:196`

```java
public static class_2540 retainedDuplicate(ByteBuf buf)
```

## net.fabricmc.fabric.api.networking.v1.PacketSender

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/networking/v1/PacketSender.java:30`

```java
@ApiStatus.NonExtendable public interface PacketSender
```

## net.fabricmc.fabric.api.networking.v1.PacketSender.createPacket

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/networking/v1/PacketSender.java:37`

```java
class_2596<?> createPacket(class_8710 payload)
```

## net.fabricmc.fabric.api.networking.v1.PacketSender.sendPacket

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/networking/v1/PacketSender.java:44`

```java
default void sendPacket(class_2596<?> packet)
```

## net.fabricmc.fabric.api.networking.v1.PacketSender.sendPacket

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/networking/v1/PacketSender.java:52`

```java
default void sendPacket(class_8710 payload)
```

## net.fabricmc.fabric.api.networking.v1.PacketSender.sendPacket

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/networking/v1/PacketSender.java:62`

```java
void sendPacket(class_2596<?> packet, @Nullable ChannelFutureListener callback)
```

## net.fabricmc.fabric.api.networking.v1.PacketSender.sendPacket

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/networking/v1/PacketSender.java:70`

```java
default void sendPacket(class_8710 payload, @Nullable ChannelFutureListener callback)
```

## net.fabricmc.fabric.api.networking.v1.PacketSender.disconnect

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/networking/v1/PacketSender.java:78`

```java
void disconnect(class_2561 disconnectReason)
```

## net.fabricmc.fabric.api.networking.v1.PayloadTypeRegistry

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/networking/v1/PayloadTypeRegistry.java:29`

```java
@ApiStatus.NonExtendable public interface PayloadTypeRegistry<B extends class_2540>
```

## net.fabricmc.fabric.api.networking.v1.PayloadTypeRegistry.register

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/networking/v1/PayloadTypeRegistry.java:42`

```java
<T extends class_8710> class_8710.class_9155<? super B, T> register(class_8710.class_9154<T> id, class_9139<? super B, T> codec)
```

## net.fabricmc.fabric.api.networking.v1.PayloadTypeRegistry.registerLarge

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/networking/v1/PayloadTypeRegistry.java:59`

```java
<T extends class_8710> class_8710.class_9155<? super B, T> registerLarge(class_8710.class_9154<T> id, class_9139<? super B, T> codec, int maxPacketSize)
```

## net.fabricmc.fabric.api.networking.v1.PayloadTypeRegistry.configurationC2S

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/networking/v1/PayloadTypeRegistry.java:64`

```java
static PayloadTypeRegistry<class_2540> configurationC2S()
```

## net.fabricmc.fabric.api.networking.v1.PayloadTypeRegistry.configurationS2C

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/networking/v1/PayloadTypeRegistry.java:71`

```java
static PayloadTypeRegistry<class_2540> configurationS2C()
```

## net.fabricmc.fabric.api.networking.v1.PayloadTypeRegistry.playC2S

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/networking/v1/PayloadTypeRegistry.java:78`

```java
static PayloadTypeRegistry<class_9129> playC2S()
```

## net.fabricmc.fabric.api.networking.v1.PayloadTypeRegistry.playS2C

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/networking/v1/PayloadTypeRegistry.java:85`

```java
static PayloadTypeRegistry<class_9129> playS2C()
```

## net.fabricmc.fabric.api.networking.v1.PlayerLookup

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/networking/v1/PlayerLookup.java:46`

```java
public final class PlayerLookup
```

## net.fabricmc.fabric.api.networking.v1.PlayerLookup.all

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/networking/v1/PlayerLookup.java:55`

```java
public static Collection<class_3222> all(MinecraftServer server)
```

## net.fabricmc.fabric.api.networking.v1.PlayerLookup.world

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/networking/v1/PlayerLookup.java:74`

```java
public static Collection<class_3222> world(class_3218 world)
```

## net.fabricmc.fabric.api.networking.v1.PlayerLookup.tracking

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/networking/v1/PlayerLookup.java:88`

```java
public static Collection<class_3222> tracking(class_3218 world, class_1923 pos)
```

## net.fabricmc.fabric.api.networking.v1.PlayerLookup.tracking

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/networking/v1/PlayerLookup.java:108`

```java
public static Collection<class_3222> tracking(class_1297 entity)
```

## net.fabricmc.fabric.api.networking.v1.PlayerLookup.tracking

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/networking/v1/PlayerLookup.java:135`

```java
public static Collection<class_3222> tracking(class_2586 blockEntity)
```

## net.fabricmc.fabric.api.networking.v1.PlayerLookup.tracking

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/networking/v1/PlayerLookup.java:153`

```java
public static Collection<class_3222> tracking(class_3218 world, class_2338 pos)
```

## net.fabricmc.fabric.api.networking.v1.PlayerLookup.around

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/networking/v1/PlayerLookup.java:169`

```java
public static Collection<class_3222> around(class_3218 world, class_243 pos, double radius)
```

## net.fabricmc.fabric.api.networking.v1.PlayerLookup.around

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/networking/v1/PlayerLookup.java:188`

```java
public static Collection<class_3222> around(class_3218 world, class_2382 pos, double radius)
```

## net.fabricmc.fabric.api.networking.v1.S2CConfigurationChannelEvents

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/networking/v1/S2CConfigurationChannelEvents.java:29`

```java
public final class S2CConfigurationChannelEvents
```

## net.fabricmc.fabric.api.networking.v1.S2CConfigurationChannelEvents.REGISTER

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/networking/v1/S2CConfigurationChannelEvents.java:34`

```java
public static final Event<Register> REGISTER = EventFactory.createArrayBacked(Register.class, callbacks -> (handler, sender, server, channels) -> { for (Register callback : callbacks) { callback.onChannelRegister(handler, sender, server, channels); } })
```

## net.fabricmc.fabric.api.networking.v1.S2CConfigurationChannelEvents.UNREGISTER

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/networking/v1/S2CConfigurationChannelEvents.java:44`

```java
public static final Event<Unregister> UNREGISTER = EventFactory.createArrayBacked(Unregister.class, callbacks -> (handler, sender, server, channels) -> { for (Unregister callback : callbacks) { callback.onChannelUnregister(handler, sender, server, channels); } })
```

## net.fabricmc.fabric.api.networking.v1.S2CConfigurationChannelEvents.Register

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/networking/v1/S2CConfigurationChannelEvents.java:56`

```java
@FunctionalInterface public interface Register
```

## net.fabricmc.fabric.api.networking.v1.S2CConfigurationChannelEvents.Register.onChannelRegister

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/networking/v1/S2CConfigurationChannelEvents.java:58`

```java
void onChannelRegister(class_8610 handler, PacketSender sender, MinecraftServer server, List<class_2960> channels)
```

## net.fabricmc.fabric.api.networking.v1.S2CConfigurationChannelEvents.Unregister

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/networking/v1/S2CConfigurationChannelEvents.java:64`

```java
@FunctionalInterface public interface Unregister
```

## net.fabricmc.fabric.api.networking.v1.S2CConfigurationChannelEvents.Unregister.onChannelUnregister

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/networking/v1/S2CConfigurationChannelEvents.java:66`

```java
void onChannelUnregister(class_8610 handler, PacketSender sender, MinecraftServer server, List<class_2960> channels)
```

## net.fabricmc.fabric.api.networking.v1.S2CPlayChannelEvents

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/networking/v1/S2CPlayChannelEvents.java:29`

```java
public final class S2CPlayChannelEvents
```

## net.fabricmc.fabric.api.networking.v1.S2CPlayChannelEvents.REGISTER

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/networking/v1/S2CPlayChannelEvents.java:34`

```java
public static final Event<Register> REGISTER = EventFactory.createArrayBacked(Register.class, callbacks -> (handler, sender, server, channels) -> { for (Register callback : callbacks) { callback.onChannelRegister(handler, sender, server, channels); } })
```

## net.fabricmc.fabric.api.networking.v1.S2CPlayChannelEvents.UNREGISTER

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/networking/v1/S2CPlayChannelEvents.java:44`

```java
public static final Event<Unregister> UNREGISTER = EventFactory.createArrayBacked(Unregister.class, callbacks -> (handler, sender, server, channels) -> { for (Unregister callback : callbacks) { callback.onChannelUnregister(handler, sender, server, channels); } })
```

## net.fabricmc.fabric.api.networking.v1.S2CPlayChannelEvents.Register

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/networking/v1/S2CPlayChannelEvents.java:56`

```java
@FunctionalInterface public interface Register
```

## net.fabricmc.fabric.api.networking.v1.S2CPlayChannelEvents.Register.onChannelRegister

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/networking/v1/S2CPlayChannelEvents.java:58`

```java
void onChannelRegister(class_3244 handler, PacketSender sender, MinecraftServer server, List<class_2960> channels)
```

## net.fabricmc.fabric.api.networking.v1.S2CPlayChannelEvents.Unregister

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/networking/v1/S2CPlayChannelEvents.java:64`

```java
@FunctionalInterface public interface Unregister
```

## net.fabricmc.fabric.api.networking.v1.S2CPlayChannelEvents.Unregister.onChannelUnregister

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/networking/v1/S2CPlayChannelEvents.java:66`

```java
void onChannelUnregister(class_3244 handler, PacketSender sender, MinecraftServer server, List<class_2960> channels)
```

## net.fabricmc.fabric.api.networking.v1.ServerConfigurationConnectionEvents

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/networking/v1/ServerConfigurationConnectionEvents.java:27`

```java
public final class ServerConfigurationConnectionEvents
```

## net.fabricmc.fabric.api.networking.v1.ServerConfigurationConnectionEvents.BEFORE_CONFIGURE

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/networking/v1/ServerConfigurationConnectionEvents.java:35`

```java
public static final Event<Configure> BEFORE_CONFIGURE = EventFactory.createArrayBacked(Configure.class, callbacks -> (handler, server) -> { for (Configure callback : callbacks) { callback.onSendConfiguration(handler, server); } })
```

## net.fabricmc.fabric.api.networking.v1.ServerConfigurationConnectionEvents.CONFIGURE

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/networking/v1/ServerConfigurationConnectionEvents.java:58`

```java
public static final Event<Configure> CONFIGURE = EventFactory.createArrayBacked(Configure.class, callbacks -> (handler, server) -> { for (Configure callback : callbacks) { callback.onSendConfiguration(handler, server); } })
```

## net.fabricmc.fabric.api.networking.v1.ServerConfigurationConnectionEvents.DISCONNECT

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/networking/v1/ServerConfigurationConnectionEvents.java:69`

```java
public static final Event<ServerConfigurationConnectionEvents.Disconnect> DISCONNECT = EventFactory.createArrayBacked(ServerConfigurationConnectionEvents.Disconnect.class, callbacks -> (handler, server) -> { for (ServerConfigurationConnectionEvents.Disconnect callback : callbacks) { callback.onConfigureDisconnect(handler, server); } })
```

## net.fabricmc.fabric.api.networking.v1.ServerConfigurationConnectionEvents.Configure

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/networking/v1/ServerConfigurationConnectionEvents.java:78`

```java
@FunctionalInterface public interface Configure
```

## net.fabricmc.fabric.api.networking.v1.ServerConfigurationConnectionEvents.Configure.onSendConfiguration

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/networking/v1/ServerConfigurationConnectionEvents.java:80`

```java
void onSendConfiguration(class_8610 handler, MinecraftServer server)
```

## net.fabricmc.fabric.api.networking.v1.ServerConfigurationConnectionEvents.Disconnect

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/networking/v1/ServerConfigurationConnectionEvents.java:83`

```java
@FunctionalInterface public interface Disconnect
```

## net.fabricmc.fabric.api.networking.v1.ServerConfigurationConnectionEvents.Disconnect.onConfigureDisconnect

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/networking/v1/ServerConfigurationConnectionEvents.java:85`

```java
void onConfigureDisconnect(class_8610 handler, MinecraftServer server)
```

## net.fabricmc.fabric.api.networking.v1.ServerConfigurationNetworking

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/networking/v1/ServerConfigurationNetworking.java:51`

```java
public final class ServerConfigurationNetworking
```

## net.fabricmc.fabric.api.networking.v1.ServerConfigurationNetworking.registerGlobalReceiver

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/networking/v1/ServerConfigurationNetworking.java:66`

```java
public static <T extends class_8710> boolean registerGlobalReceiver(class_8710.class_9154<T> type, ConfigurationPacketHandler<T> handler)
```

## net.fabricmc.fabric.api.networking.v1.ServerConfigurationNetworking.unregisterGlobalReceiver

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/networking/v1/ServerConfigurationNetworking.java:82`

```java
public static ServerConfigurationNetworking.@Nullable ConfigurationPacketHandler<?> unregisterGlobalReceiver(class_2960 id)
```

## net.fabricmc.fabric.api.networking.v1.ServerConfigurationNetworking.getGlobalReceivers

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/networking/v1/ServerConfigurationNetworking.java:92`

```java
public static Set<class_2960> getGlobalReceivers()
```

## net.fabricmc.fabric.api.networking.v1.ServerConfigurationNetworking.registerReceiver

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/networking/v1/ServerConfigurationNetworking.java:111`

```java
public static <T extends class_8710> boolean registerReceiver(class_8610 networkHandler, class_8710.class_9154<T> type, ConfigurationPacketHandler<T> handler)
```

## net.fabricmc.fabric.api.networking.v1.ServerConfigurationNetworking.unregisterReceiver

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/networking/v1/ServerConfigurationNetworking.java:124`

```java
public static ServerConfigurationNetworking.@Nullable ConfigurationPacketHandler<?> unregisterReceiver(class_8610 networkHandler, class_2960 id)
```

## net.fabricmc.fabric.api.networking.v1.ServerConfigurationNetworking.getReceived

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/networking/v1/ServerConfigurationNetworking.java:134`

```java
public static Set<class_2960> getReceived(class_8610 handler)
```

## net.fabricmc.fabric.api.networking.v1.ServerConfigurationNetworking.getSendable

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/networking/v1/ServerConfigurationNetworking.java:146`

```java
public static Set<class_2960> getSendable(class_8610 handler)
```

## net.fabricmc.fabric.api.networking.v1.ServerConfigurationNetworking.canSend

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/networking/v1/ServerConfigurationNetworking.java:159`

```java
public static boolean canSend(class_8610 handler, class_2960 channelName)
```

## net.fabricmc.fabric.api.networking.v1.ServerConfigurationNetworking.canSend

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/networking/v1/ServerConfigurationNetworking.java:173`

```java
public static boolean canSend(class_8610 handler, class_8710.class_9154<?> id)
```

## net.fabricmc.fabric.api.networking.v1.ServerConfigurationNetworking.createS2CPacket

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/networking/v1/ServerConfigurationNetworking.java:186`

```java
public static class_2596<class_8705> createS2CPacket(class_8710 payload)
```

## net.fabricmc.fabric.api.networking.v1.ServerConfigurationNetworking.getSender

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/networking/v1/ServerConfigurationNetworking.java:199`

```java
public static PacketSender getSender(class_8610 handler)
```

## net.fabricmc.fabric.api.networking.v1.ServerConfigurationNetworking.send

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/networking/v1/ServerConfigurationNetworking.java:213`

```java
public static void send(class_8610 handler, class_8710 payload)
```

## net.fabricmc.fabric.api.networking.v1.ServerConfigurationNetworking.getServer

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/networking/v1/ServerConfigurationNetworking.java:228`

```java
public static MinecraftServer getServer(class_8610 handler)
```

## net.fabricmc.fabric.api.networking.v1.ServerConfigurationNetworking.isReconfiguring

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/networking/v1/ServerConfigurationNetworking.java:240`

```java
public static boolean isReconfiguring(class_8610 handler)
```

## net.fabricmc.fabric.api.networking.v1.ServerConfigurationNetworking.ConfigurationPacketHandler

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/networking/v1/ServerConfigurationNetworking.java:253`

```java
@FunctionalInterface public interface ConfigurationPacketHandler<T extends class_8710>
```

## net.fabricmc.fabric.api.networking.v1.ServerConfigurationNetworking.ConfigurationPacketHandler.receive

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/networking/v1/ServerConfigurationNetworking.java:274`

```java
void receive(T payload, Context context)
```

## net.fabricmc.fabric.api.networking.v1.ServerConfigurationNetworking.Context

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/networking/v1/ServerConfigurationNetworking.java:277`

```java
@ApiStatus.NonExtendable public interface Context
```

## net.fabricmc.fabric.api.networking.v1.ServerConfigurationNetworking.Context.server

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/networking/v1/ServerConfigurationNetworking.java:282`

```java
MinecraftServer server()
```

## net.fabricmc.fabric.api.networking.v1.ServerConfigurationNetworking.Context.networkHandler

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/networking/v1/ServerConfigurationNetworking.java:287`

```java
class_8610 networkHandler()
```

## net.fabricmc.fabric.api.networking.v1.ServerConfigurationNetworking.Context.responseSender

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/networking/v1/ServerConfigurationNetworking.java:292`

```java
PacketSender responseSender()
```

## net.fabricmc.fabric.api.networking.v1.ServerLoginConnectionEvents

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/networking/v1/ServerLoginConnectionEvents.java:28`

```java
public final class ServerLoginConnectionEvents
```

## net.fabricmc.fabric.api.networking.v1.ServerLoginConnectionEvents.INIT

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/networking/v1/ServerLoginConnectionEvents.java:34`

```java
public static final Event<Init> INIT = EventFactory.createArrayBacked(Init.class, callbacks -> (handler, server) -> { for (Init callback : callbacks) { callback.onLoginInit(handler, server); } })
```

## net.fabricmc.fabric.api.networking.v1.ServerLoginConnectionEvents.QUERY_START

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/networking/v1/ServerLoginConnectionEvents.java:48`

```java
public static final Event<QueryStart> QUERY_START = EventFactory.createArrayBacked(QueryStart.class, callbacks -> (handler, server, sender, synchronizer) -> { for (QueryStart callback : callbacks) { callback.onLoginStart(handler, server, sender, synchronizer); } })
```

## net.fabricmc.fabric.api.networking.v1.ServerLoginConnectionEvents.DISCONNECT

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/networking/v1/ServerLoginConnectionEvents.java:59`

```java
public static final Event<Disconnect> DISCONNECT = EventFactory.createArrayBacked(Disconnect.class, callbacks -> (handler, server) -> { for (Disconnect callback : callbacks) { callback.onLoginDisconnect(handler, server); } })
```

## net.fabricmc.fabric.api.networking.v1.ServerLoginConnectionEvents.Init

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/networking/v1/ServerLoginConnectionEvents.java:71`

```java
@FunctionalInterface public interface Init
```

## net.fabricmc.fabric.api.networking.v1.ServerLoginConnectionEvents.Init.onLoginInit

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/networking/v1/ServerLoginConnectionEvents.java:73`

```java
void onLoginInit(class_3248 handler, MinecraftServer server)
```

## net.fabricmc.fabric.api.networking.v1.ServerLoginConnectionEvents.QueryStart

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/networking/v1/ServerLoginConnectionEvents.java:79`

```java
@FunctionalInterface public interface QueryStart
```

## net.fabricmc.fabric.api.networking.v1.ServerLoginConnectionEvents.QueryStart.onLoginStart

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/networking/v1/ServerLoginConnectionEvents.java:81`

```java
void onLoginStart(class_3248 handler, MinecraftServer server, LoginPacketSender sender, ServerLoginNetworking.LoginSynchronizer synchronizer)
```

## net.fabricmc.fabric.api.networking.v1.ServerLoginConnectionEvents.Disconnect

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/networking/v1/ServerLoginConnectionEvents.java:87`

```java
@FunctionalInterface public interface Disconnect
```

## net.fabricmc.fabric.api.networking.v1.ServerLoginConnectionEvents.Disconnect.onLoginDisconnect

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/networking/v1/ServerLoginConnectionEvents.java:89`

```java
void onLoginDisconnect(class_3248 handler, MinecraftServer server)
```

## net.fabricmc.fabric.api.networking.v1.ServerLoginNetworking

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/networking/v1/ServerLoginNetworking.java:40`

```java
public final class ServerLoginNetworking
```

## net.fabricmc.fabric.api.networking.v1.ServerLoginNetworking.registerGlobalReceiver

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/networking/v1/ServerLoginNetworking.java:54`

```java
public static boolean registerGlobalReceiver(class_2960 channelName, LoginQueryResponseHandler channelHandler)
```

## net.fabricmc.fabric.api.networking.v1.ServerLoginNetworking.unregisterGlobalReceiver

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/networking/v1/ServerLoginNetworking.java:69`

```java
public static ServerLoginNetworking.@Nullable LoginQueryResponseHandler unregisterGlobalReceiver(class_2960 channelName)
```

## net.fabricmc.fabric.api.networking.v1.ServerLoginNetworking.getGlobalReceivers

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/networking/v1/ServerLoginNetworking.java:79`

```java
public static Set<class_2960> getGlobalReceivers()
```

## net.fabricmc.fabric.api.networking.v1.ServerLoginNetworking.registerReceiver

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/networking/v1/ServerLoginNetworking.java:94`

```java
public static boolean registerReceiver(class_3248 networkHandler, class_2960 channelName, LoginQueryResponseHandler responseHandler)
```

## net.fabricmc.fabric.api.networking.v1.ServerLoginNetworking.unregisterReceiver

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/networking/v1/ServerLoginNetworking.java:108`

```java
public static ServerLoginNetworking.@Nullable LoginQueryResponseHandler unregisterReceiver(class_3248 networkHandler, class_2960 channelName)
```

## net.fabricmc.fabric.api.networking.v1.ServerLoginNetworking.getServer

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/networking/v1/ServerLoginNetworking.java:121`

```java
public static MinecraftServer getServer(class_3248 handler)
```

## net.fabricmc.fabric.api.networking.v1.ServerLoginNetworking.getSender

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/networking/v1/ServerLoginNetworking.java:133`

```java
public static LoginPacketSender getSender(class_3248 handler)
```

## net.fabricmc.fabric.api.networking.v1.ServerLoginNetworking.LoginQueryResponseHandler

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/networking/v1/ServerLoginNetworking.java:141`

```java
@FunctionalInterface public interface LoginQueryResponseHandler
```

## net.fabricmc.fabric.api.networking.v1.ServerLoginNetworking.LoginQueryResponseHandler.receive

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/networking/v1/ServerLoginNetworking.java:157`

```java
void receive(MinecraftServer server, class_3248 handler, boolean understood, class_2540 buf, LoginSynchronizer synchronizer, PacketSender responseSender)
```

## net.fabricmc.fabric.api.networking.v1.ServerLoginNetworking.LoginSynchronizer

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/networking/v1/ServerLoginNetworking.java:163`

```java
@FunctionalInterface @ApiStatus.NonExtendable public interface LoginSynchronizer
```

## net.fabricmc.fabric.api.networking.v1.ServerLoginNetworking.LoginSynchronizer.waitFor

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/networking/v1/ServerLoginNetworking.java:202`

```java
void waitFor(Future<?> future)
```

## net.fabricmc.fabric.api.networking.v1.ServerPlayConnectionEvents

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/networking/v1/ServerPlayConnectionEvents.java:28`

```java
public final class ServerPlayConnectionEvents
```

## net.fabricmc.fabric.api.networking.v1.ServerPlayConnectionEvents.INIT

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/networking/v1/ServerPlayConnectionEvents.java:34`

```java
public static final Event<Init> INIT = EventFactory.createArrayBacked(Init.class, callbacks -> (handler, server) -> { for (Init callback : callbacks) { callback.onPlayInit(handler, server); } })
```

## net.fabricmc.fabric.api.networking.v1.ServerPlayConnectionEvents.JOIN

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/networking/v1/ServerPlayConnectionEvents.java:45`

```java
public static final Event<Join> JOIN = EventFactory.createArrayBacked(Join.class, callbacks -> (handler, sender, server) -> { for (Join callback : callbacks) { callback.onPlayReady(handler, sender, server); } })
```

## net.fabricmc.fabric.api.networking.v1.ServerPlayConnectionEvents.DISCONNECT

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/networking/v1/ServerPlayConnectionEvents.java:56`

```java
public static final Event<Disconnect> DISCONNECT = EventFactory.createArrayBacked(Disconnect.class, callbacks -> (handler, server) -> { for (Disconnect callback : callbacks) { callback.onPlayDisconnect(handler, server); } })
```

## net.fabricmc.fabric.api.networking.v1.ServerPlayConnectionEvents.Init

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/networking/v1/ServerPlayConnectionEvents.java:65`

```java
@FunctionalInterface public interface Init
```

## net.fabricmc.fabric.api.networking.v1.ServerPlayConnectionEvents.Init.onPlayInit

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/networking/v1/ServerPlayConnectionEvents.java:67`

```java
void onPlayInit(class_3244 handler, MinecraftServer server)
```

## net.fabricmc.fabric.api.networking.v1.ServerPlayConnectionEvents.Join

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/networking/v1/ServerPlayConnectionEvents.java:70`

```java
@FunctionalInterface public interface Join
```

## net.fabricmc.fabric.api.networking.v1.ServerPlayConnectionEvents.Join.onPlayReady

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/networking/v1/ServerPlayConnectionEvents.java:72`

```java
void onPlayReady(class_3244 handler, PacketSender sender, MinecraftServer server)
```

## net.fabricmc.fabric.api.networking.v1.ServerPlayConnectionEvents.Disconnect

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/networking/v1/ServerPlayConnectionEvents.java:75`

```java
@FunctionalInterface public interface Disconnect
```

## net.fabricmc.fabric.api.networking.v1.ServerPlayConnectionEvents.Disconnect.onPlayDisconnect

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/networking/v1/ServerPlayConnectionEvents.java:77`

```java
void onPlayDisconnect(class_3244 handler, MinecraftServer server)
```

## net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/networking/v1/ServerPlayNetworking.java:61`

```java
public final class ServerPlayNetworking
```

## net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking.registerGlobalReceiver

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/networking/v1/ServerPlayNetworking.java:75`

```java
public static <T extends class_8710> boolean registerGlobalReceiver(class_8710.class_9154<T> type, PlayPayloadHandler<T> handler)
```

## net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking.unregisterGlobalReceiver

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/networking/v1/ServerPlayNetworking.java:91`

```java
public static ServerPlayNetworking.@Nullable PlayPayloadHandler<?> unregisterGlobalReceiver(class_2960 id)
```

## net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking.getGlobalReceivers

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/networking/v1/ServerPlayNetworking.java:101`

```java
public static Set<class_2960> getGlobalReceivers()
```

## net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking.registerReceiver

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/networking/v1/ServerPlayNetworking.java:123`

```java
public static <T extends class_8710> boolean registerReceiver(class_3244 networkHandler, class_8710.class_9154<T> type, PlayPayloadHandler<T> handler)
```

## net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking.unregisterReceiver

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/networking/v1/ServerPlayNetworking.java:136`

```java
public static ServerPlayNetworking.@Nullable PlayPayloadHandler<?> unregisterReceiver(class_3244 networkHandler, class_2960 id)
```

## net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking.getReceived

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/networking/v1/ServerPlayNetworking.java:146`

```java
public static Set<class_2960> getReceived(class_3222 player)
```

## net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking.getReceived

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/networking/v1/ServerPlayNetworking.java:158`

```java
public static Set<class_2960> getReceived(class_3244 handler)
```

## net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking.getSendable

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/networking/v1/ServerPlayNetworking.java:170`

```java
public static Set<class_2960> getSendable(class_3222 player)
```

## net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking.getSendable

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/networking/v1/ServerPlayNetworking.java:182`

```java
public static Set<class_2960> getSendable(class_3244 handler)
```

## net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking.canSend

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/networking/v1/ServerPlayNetworking.java:195`

```java
public static boolean canSend(class_3222 player, class_2960 channelName)
```

## net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking.canSend

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/networking/v1/ServerPlayNetworking.java:208`

```java
public static boolean canSend(class_3222 player, class_8710.class_9154<?> type)
```

## net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking.canSend

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/networking/v1/ServerPlayNetworking.java:221`

```java
public static boolean canSend(class_3244 handler, class_2960 channelName)
```

## net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking.canSend

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/networking/v1/ServerPlayNetworking.java:235`

```java
public static boolean canSend(class_3244 handler, class_8710.class_9154<?> type)
```

## net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking.createS2CPacket

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/networking/v1/ServerPlayNetworking.java:248`

```java
public static <T extends class_8710> class_2596<class_8705> createS2CPacket(T packet)
```

## net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking.getSender

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/networking/v1/ServerPlayNetworking.java:258`

```java
public static PacketSender getSender(class_3222 player)
```

## net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking.getSender

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/networking/v1/ServerPlayNetworking.java:270`

```java
public static PacketSender getSender(class_3244 handler)
```

## net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking.send

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/networking/v1/ServerPlayNetworking.java:284`

```java
public static void send(class_3222 player, class_8710 payload)
```

## net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking.reconfigure

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/networking/v1/ServerPlayNetworking.java:297`

```java
public static void reconfigure(class_3222 player)
```

## net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking.reconfigure

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/networking/v1/ServerPlayNetworking.java:308`

```java
public static void reconfigure(class_3244 handler)
```

## net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking.PlayPayloadHandler

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/networking/v1/ServerPlayNetworking.java:321`

```java
@FunctionalInterface public interface PlayPayloadHandler<T extends class_8710>
```

## net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking.PlayPayloadHandler.receive

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/networking/v1/ServerPlayNetworking.java:341`

```java
void receive(T payload, Context context)
```

## net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking.Context

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/networking/v1/ServerPlayNetworking.java:344`

```java
@ApiStatus.NonExtendable public interface Context
```

## net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking.Context.server

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/networking/v1/ServerPlayNetworking.java:349`

```java
MinecraftServer server()
```

## net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking.Context.player

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/networking/v1/ServerPlayNetworking.java:354`

```java
class_3222 player()
```

## net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking.Context.responseSender

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/networking/v1/ServerPlayNetworking.java:359`

```java
PacketSender responseSender()
```

## net.fabricmc.fabric.impl.networking.AbstractChanneledNetworkAddon

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/AbstractChanneledNetworkAddon.java:43`

```java
public abstract class AbstractChanneledNetworkAddon<H> extends AbstractNetworkAddon<H> implements PacketSender, CommonPacketHandler
```

## net.fabricmc.fabric.impl.networking.AbstractChanneledNetworkAddon.connection

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/AbstractChanneledNetworkAddon.java:49`

```java
protected final class_2535 connection
```

## net.fabricmc.fabric.impl.networking.AbstractChanneledNetworkAddon.receiver

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/AbstractChanneledNetworkAddon.java:50`

```java
protected final GlobalReceiverRegistry<H> receiver
```

## net.fabricmc.fabric.impl.networking.AbstractChanneledNetworkAddon.sendableChannels

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/AbstractChanneledNetworkAddon.java:51`

```java
protected final Set<class_2960> sendableChannels
```

## net.fabricmc.fabric.impl.networking.AbstractChanneledNetworkAddon.commonVersion

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/AbstractChanneledNetworkAddon.java:53`

```java
protected int commonVersion = -1
```

## net.fabricmc.fabric.impl.networking.AbstractChanneledNetworkAddon.AbstractChanneledNetworkAddon

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/AbstractChanneledNetworkAddon.java:55`

```java
protected AbstractChanneledNetworkAddon(GlobalReceiverRegistry<H> receiver, class_2535 connection, String description)
```

## net.fabricmc.fabric.impl.networking.AbstractChanneledNetworkAddon.registerPendingChannels

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/AbstractChanneledNetworkAddon.java:62`

```java
protected void registerPendingChannels(ChannelInfoHolder holder, class_2539 state)
```

## net.fabricmc.fabric.impl.networking.AbstractChanneledNetworkAddon.handle

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/AbstractChanneledNetworkAddon.java:72`

```java
public boolean handle(class_8710 payload)
```

## net.fabricmc.fabric.impl.networking.AbstractChanneledNetworkAddon.isOnReceiveThread

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/AbstractChanneledNetworkAddon.java:109`

```java
protected abstract boolean isOnReceiveThread()
```

## net.fabricmc.fabric.impl.networking.AbstractChanneledNetworkAddon.receive

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/AbstractChanneledNetworkAddon.java:111`

```java
protected abstract void receive(H handler, class_8710 payload)
```

## net.fabricmc.fabric.impl.networking.AbstractChanneledNetworkAddon.sendInitialChannelRegistrationPacket

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/AbstractChanneledNetworkAddon.java:113`

```java
protected void sendInitialChannelRegistrationPacket()
```

## net.fabricmc.fabric.impl.networking.AbstractChanneledNetworkAddon.createRegistrationPayload

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/AbstractChanneledNetworkAddon.java:121`

```java
@Nullable protected RegistrationPayload createRegistrationPayload(class_8710.class_9154<RegistrationPayload> id, Collection<class_2960> channels)
```

## net.fabricmc.fabric.impl.networking.AbstractChanneledNetworkAddon.receiveRegistration

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/AbstractChanneledNetworkAddon.java:131`

```java
protected void receiveRegistration(boolean register, RegistrationPayload payload)
```

## net.fabricmc.fabric.impl.networking.AbstractChanneledNetworkAddon.sendPacket

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/AbstractChanneledNetworkAddon.java:161`

```java
@Override public void sendPacket(class_2596<?> packet, ChannelFutureListener callback)
```

## net.fabricmc.fabric.impl.networking.AbstractChanneledNetworkAddon.disconnect

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/AbstractChanneledNetworkAddon.java:168`

```java
@Override public void disconnect(class_2561 disconnectReason)
```

## net.fabricmc.fabric.impl.networking.AbstractChanneledNetworkAddon.schedule

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/AbstractChanneledNetworkAddon.java:178`

```java
protected abstract void schedule(Runnable task)
```

## net.fabricmc.fabric.impl.networking.AbstractChanneledNetworkAddon.invokeRegisterEvent

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/AbstractChanneledNetworkAddon.java:180`

```java
protected abstract void invokeRegisterEvent(List<class_2960> ids)
```

## net.fabricmc.fabric.impl.networking.AbstractChanneledNetworkAddon.invokeUnregisterEvent

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/AbstractChanneledNetworkAddon.java:182`

```java
protected abstract void invokeUnregisterEvent(List<class_2960> ids)
```

## net.fabricmc.fabric.impl.networking.AbstractChanneledNetworkAddon.getSendableChannels

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/AbstractChanneledNetworkAddon.java:184`

```java
public Set<class_2960> getSendableChannels()
```

## net.fabricmc.fabric.impl.networking.AbstractChanneledNetworkAddon.onCommonVersionPacket

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/AbstractChanneledNetworkAddon.java:190`

```java
@Override public void onCommonVersionPacket(int negotiatedVersion)
```

## net.fabricmc.fabric.impl.networking.AbstractChanneledNetworkAddon.onCommonRegisterPacket

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/AbstractChanneledNetworkAddon.java:201`

```java
@Override public void onCommonRegisterPacket(CommonRegisterPayload payload)
```

## net.fabricmc.fabric.impl.networking.AbstractChanneledNetworkAddon.createRegisterPayload

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/AbstractChanneledNetworkAddon.java:224`

```java
@Override public CommonRegisterPayload createRegisterPayload()
```

## net.fabricmc.fabric.impl.networking.AbstractChanneledNetworkAddon.getNegotiatedVersion

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/AbstractChanneledNetworkAddon.java:229`

```java
@Override public int getNegotiatedVersion()
```

## net.fabricmc.fabric.impl.networking.AbstractNetworkAddon

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/AbstractNetworkAddon.java:38`

```java
public abstract class AbstractNetworkAddon<H>
```

## net.fabricmc.fabric.impl.networking.AbstractNetworkAddon.receiver

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/AbstractNetworkAddon.java:39`

```java
protected final GlobalReceiverRegistry<H> receiver
```

## net.fabricmc.fabric.impl.networking.AbstractNetworkAddon.logger

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/AbstractNetworkAddon.java:40`

```java
protected final Logger logger
```

## net.fabricmc.fabric.impl.networking.AbstractNetworkAddon.AbstractNetworkAddon

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/AbstractNetworkAddon.java:48`

```java
protected AbstractNetworkAddon(GlobalReceiverRegistry<H> receiver, String description)
```

## net.fabricmc.fabric.impl.networking.AbstractNetworkAddon.lateInit

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/AbstractNetworkAddon.java:53`

```java
public final void lateInit()
```

## net.fabricmc.fabric.impl.networking.AbstractNetworkAddon.invokeInitEvent

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/AbstractNetworkAddon.java:58`

```java
protected abstract void invokeInitEvent()
```

## net.fabricmc.fabric.impl.networking.AbstractNetworkAddon.endSession

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/AbstractNetworkAddon.java:60`

```java
public final void endSession()
```

## net.fabricmc.fabric.impl.networking.AbstractNetworkAddon.getHandler

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/AbstractNetworkAddon.java:64`

```java
@Nullable public H getHandler(class_2960 channel)
```

## net.fabricmc.fabric.impl.networking.AbstractNetworkAddon.registerChannels

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/AbstractNetworkAddon.java:82`

```java
public void registerChannels(Map<class_2960, H> map)
```

## net.fabricmc.fabric.impl.networking.AbstractNetworkAddon.registerChannel

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/AbstractNetworkAddon.java:98`

```java
public boolean registerChannel(class_2960 channelName, H handler)
```

## net.fabricmc.fabric.impl.networking.AbstractNetworkAddon.unregisterChannel

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/AbstractNetworkAddon.java:121`

```java
public H unregisterChannel(class_2960 channelName)
```

## net.fabricmc.fabric.impl.networking.AbstractNetworkAddon.getReceivableChannels

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/AbstractNetworkAddon.java:141`

```java
public Set<class_2960> getReceivableChannels()
```

## net.fabricmc.fabric.impl.networking.AbstractNetworkAddon.handleRegistration

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/AbstractNetworkAddon.java:152`

```java
protected abstract void handleRegistration(class_2960 channelName)
```

## net.fabricmc.fabric.impl.networking.AbstractNetworkAddon.handleUnregistration

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/AbstractNetworkAddon.java:154`

```java
protected abstract void handleUnregistration(class_2960 channelName)
```

## net.fabricmc.fabric.impl.networking.AbstractNetworkAddon.handleDisconnect

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/AbstractNetworkAddon.java:156`

```java
public final void handleDisconnect()
```

## net.fabricmc.fabric.impl.networking.AbstractNetworkAddon.invokeDisconnectEvent

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/AbstractNetworkAddon.java:163`

```java
protected abstract void invokeDisconnectEvent()
```

## net.fabricmc.fabric.impl.networking.AbstractNetworkAddon.isReservedChannel

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/AbstractNetworkAddon.java:172`

```java
protected abstract boolean isReservedChannel(class_2960 channelName)
```

## net.fabricmc.fabric.impl.networking.ChannelInfoHolder

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/ChannelInfoHolder.java:23`

```java
public interface ChannelInfoHolder
```

## net.fabricmc.fabric.impl.networking.ChannelInfoHolder.fabric_getPendingChannelsNames

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/ChannelInfoHolder.java:27`

```java
Collection<class_2960> fabric_getPendingChannelsNames(class_2539 state)
```

## net.fabricmc.fabric.impl.networking.CommonPacketHandler

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/CommonPacketHandler.java:19`

```java
public interface CommonPacketHandler
```

## net.fabricmc.fabric.impl.networking.CommonPacketHandler.onCommonVersionPacket

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/CommonPacketHandler.java:20`

```java
void onCommonVersionPacket(int negotiatedVersion)
```

## net.fabricmc.fabric.impl.networking.CommonPacketHandler.onCommonRegisterPacket

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/CommonPacketHandler.java:22`

```java
void onCommonRegisterPacket(CommonRegisterPayload payload)
```

## net.fabricmc.fabric.impl.networking.CommonPacketHandler.createRegisterPayload

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/CommonPacketHandler.java:24`

```java
CommonRegisterPayload createRegisterPayload()
```

## net.fabricmc.fabric.impl.networking.CommonPacketHandler.getNegotiatedVersion

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/CommonPacketHandler.java:26`

```java
int getNegotiatedVersion()
```

## net.fabricmc.fabric.impl.networking.CommonPacketsImpl

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/CommonPacketsImpl.java:31`

```java
public class CommonPacketsImpl
```

## net.fabricmc.fabric.impl.networking.CommonPacketsImpl.PACKET_VERSION_1

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/CommonPacketsImpl.java:32`

```java
public static final int PACKET_VERSION_1 = 1
```

## net.fabricmc.fabric.impl.networking.CommonPacketsImpl.SUPPORTED_COMMON_PACKET_VERSIONS

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/CommonPacketsImpl.java:33`

```java
public static final int[] SUPPORTED_COMMON_PACKET_VERSIONS = new int[]{ PACKET_VERSION_1 }
```

## net.fabricmc.fabric.impl.networking.CommonPacketsImpl.init

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/CommonPacketsImpl.java:35`

```java
public static void init()
```

## net.fabricmc.fabric.impl.networking.CommonPacketsImpl.getHighestCommonVersion

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/CommonPacketsImpl.java:124`

```java
public static int getHighestCommonVersion(int[] a, int[] b)
```

## net.fabricmc.fabric.impl.networking.CommonRegisterPayload

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/CommonRegisterPayload.java:26`

```java
public record CommonRegisterPayload(int version, String phase, Set<class_2960> channels) implements class_8710
```

## net.fabricmc.fabric.impl.networking.CommonRegisterPayload.ID

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/CommonRegisterPayload.java:27`

```java
public static final class_8710.class_9154<CommonRegisterPayload> ID = new class_9154<>(class_2960.method_60654("c:register"))
```

## net.fabricmc.fabric.impl.networking.CommonRegisterPayload.CODEC

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/CommonRegisterPayload.java:28`

```java
public static final class_9139<class_2540, CommonRegisterPayload> CODEC = class_8710.method_56484(CommonRegisterPayload::write, CommonRegisterPayload::new)
```

## net.fabricmc.fabric.impl.networking.CommonRegisterPayload.PLAY_PHASE

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/CommonRegisterPayload.java:30`

```java
public static final String PLAY_PHASE = "play"
```

## net.fabricmc.fabric.impl.networking.CommonRegisterPayload.CONFIGURATION_PHASE

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/CommonRegisterPayload.java:31`

```java
public static final String CONFIGURATION_PHASE = "configuration"
```

## net.fabricmc.fabric.impl.networking.CommonRegisterPayload.write

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/CommonRegisterPayload.java:41`

```java
public void write(class_2540 buf)
```

## net.fabricmc.fabric.impl.networking.CommonRegisterPayload.method_56479

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/CommonRegisterPayload.java:47`

```java
@Override public class_9154<CommonRegisterPayload> method_56479()
```

## net.fabricmc.fabric.impl.networking.CommonVersionPayload

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/CommonVersionPayload.java:24`

```java
public record CommonVersionPayload(int[] versions) implements class_8710
```

## net.fabricmc.fabric.impl.networking.CommonVersionPayload.CODEC

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/CommonVersionPayload.java:25`

```java
public static final class_9139<class_2540, CommonVersionPayload> CODEC = class_8710.method_56484(CommonVersionPayload::write, CommonVersionPayload::new)
```

## net.fabricmc.fabric.impl.networking.CommonVersionPayload.ID

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/CommonVersionPayload.java:26`

```java
public static final class_8710.class_9154<CommonVersionPayload> ID = new class_9154<>(class_2960.method_60654("c:version"))
```

## net.fabricmc.fabric.impl.networking.CommonVersionPayload.write

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/CommonVersionPayload.java:32`

```java
public void write(class_2540 buf)
```

## net.fabricmc.fabric.impl.networking.CommonVersionPayload.method_56479

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/CommonVersionPayload.java:36`

```java
@Override public class_9154<? extends class_8710> method_56479()
```

## net.fabricmc.fabric.impl.networking.CustomPayloadTypeProvider

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/CustomPayloadTypeProvider.java:23`

```java
public interface CustomPayloadTypeProvider<B extends class_2540>
```

## net.fabricmc.fabric.impl.networking.CustomPayloadTypeProvider.get

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/CustomPayloadTypeProvider.java:24`

```java
class_8710.class_9155<B, ? extends class_8710> get(B packetByteBuf, class_2960 identifier)
```

## net.fabricmc.fabric.impl.networking.FabricCustomPayloadPacketCodec

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/FabricCustomPayloadPacketCodec.java:21`

```java
public interface FabricCustomPayloadPacketCodec<B extends class_2540>
```

## net.fabricmc.fabric.impl.networking.FabricCustomPayloadPacketCodec.fabric_setPacketCodecProvider

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/FabricCustomPayloadPacketCodec.java:22`

```java
void fabric_setPacketCodecProvider(CustomPayloadTypeProvider<B> customPayloadTypeProvider)
```

## net.fabricmc.fabric.impl.networking.FabricRegistryByteBuf

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/FabricRegistryByteBuf.java:23`

```java
public interface FabricRegistryByteBuf
```

## net.fabricmc.fabric.impl.networking.FabricRegistryByteBuf.fabric_setSendableConfigurationChannels

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/FabricRegistryByteBuf.java:24`

```java
void fabric_setSendableConfigurationChannels(Set<class_2960> globalChannels)
```

## net.fabricmc.fabric.impl.networking.FabricRegistryByteBuf.fabric_getSendableConfigurationChannels

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/FabricRegistryByteBuf.java:26`

```java
@Nullable Set<class_2960> fabric_getSendableConfigurationChannels()
```

## net.fabricmc.fabric.impl.networking.GenericPayloadAccessor

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/GenericPayloadAccessor.java:21`

```java
public interface GenericPayloadAccessor
```

## net.fabricmc.fabric.impl.networking.GenericPayloadAccessor.fabric_payload

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/GenericPayloadAccessor.java:22`

```java
class_8710 fabric_payload()
```

## net.fabricmc.fabric.impl.networking.GlobalReceiverRegistry

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/GlobalReceiverRegistry.java:34`

```java
public final class GlobalReceiverRegistry<H>
```

## net.fabricmc.fabric.impl.networking.GlobalReceiverRegistry.DEFAULT_CHANNEL_NAME_MAX_LENGTH

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/GlobalReceiverRegistry.java:35`

```java
public static final int DEFAULT_CHANNEL_NAME_MAX_LENGTH = 128
```

## net.fabricmc.fabric.impl.networking.GlobalReceiverRegistry.GlobalReceiverRegistry

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/GlobalReceiverRegistry.java:47`

```java
public GlobalReceiverRegistry(class_2598 side, class_2539 phase, @Nullable PayloadTypeRegistryImpl<?> payloadTypeRegistry)
```

## net.fabricmc.fabric.impl.networking.GlobalReceiverRegistry.getHandler

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/GlobalReceiverRegistry.java:63`

```java
@Nullable public H getHandler(class_2960 channelName)
```

## net.fabricmc.fabric.impl.networking.GlobalReceiverRegistry.registerGlobalReceiver

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/GlobalReceiverRegistry.java:75`

```java
public boolean registerGlobalReceiver(class_2960 channelName, H handler)
```

## net.fabricmc.fabric.impl.networking.GlobalReceiverRegistry.unregisterGlobalReceiver

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/GlobalReceiverRegistry.java:101`

```java
@Nullable public H unregisterGlobalReceiver(class_2960 channelName)
```

## net.fabricmc.fabric.impl.networking.GlobalReceiverRegistry.getHandlers

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/GlobalReceiverRegistry.java:125`

```java
public Map<class_2960, H> getHandlers()
```

## net.fabricmc.fabric.impl.networking.GlobalReceiverRegistry.getChannels

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/GlobalReceiverRegistry.java:136`

```java
public Set<class_2960> getChannels()
```

## net.fabricmc.fabric.impl.networking.GlobalReceiverRegistry.startSession

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/GlobalReceiverRegistry.java:149`

```java
public void startSession(AbstractNetworkAddon<H> addon)
```

## net.fabricmc.fabric.impl.networking.GlobalReceiverRegistry.endSession

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/GlobalReceiverRegistry.java:164`

```java
public void endSession(AbstractNetworkAddon<H> addon)
```

## net.fabricmc.fabric.impl.networking.GlobalReceiverRegistry.assertPayloadType

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/GlobalReceiverRegistry.java:215`

```java
public void assertPayloadType(class_2960 channelName)
```

## net.fabricmc.fabric.impl.networking.GlobalReceiverRegistry.getPhase

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/GlobalReceiverRegistry.java:229`

```java
public class_2539 getPhase()
```

## net.fabricmc.fabric.impl.networking.NetworkHandlerExtensions

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/NetworkHandlerExtensions.java:19`

```java
public interface NetworkHandlerExtensions
```

## net.fabricmc.fabric.impl.networking.NetworkHandlerExtensions.getAddon

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/NetworkHandlerExtensions.java:20`

```java
AbstractNetworkAddon<?> getAddon()
```

## net.fabricmc.fabric.impl.networking.NetworkingImpl

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/NetworkingImpl.java:28`

```java
public final class NetworkingImpl
```

## net.fabricmc.fabric.impl.networking.NetworkingImpl.MOD_ID

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/NetworkingImpl.java:29`

```java
public static final String MOD_ID = "fabric-networking-api-v1"
```

## net.fabricmc.fabric.impl.networking.NetworkingImpl.LOGGER

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/NetworkingImpl.java:30`

```java
public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID)
```

## net.fabricmc.fabric.impl.networking.NetworkingImpl.REGISTER_CHANNEL

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/NetworkingImpl.java:35`

```java
public static final class_2960 REGISTER_CHANNEL = class_2960.method_60656("register")
```

## net.fabricmc.fabric.impl.networking.NetworkingImpl.UNREGISTER_CHANNEL

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/NetworkingImpl.java:40`

```java
public static final class_2960 UNREGISTER_CHANNEL = class_2960.method_60656("unregister")
```

## net.fabricmc.fabric.impl.networking.NetworkingImpl.isReservedCommonChannel

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/NetworkingImpl.java:42`

```java
public static boolean isReservedCommonChannel(class_2960 channelName)
```

## net.fabricmc.fabric.impl.networking.NetworkingImpl.init

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/NetworkingImpl.java:46`

```java
public static void init()
```

## net.fabricmc.fabric.impl.networking.PacketCallbackListener

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/PacketCallbackListener.java:21`

```java
public interface PacketCallbackListener
```

## net.fabricmc.fabric.impl.networking.PacketCallbackListener.sent

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/PacketCallbackListener.java:27`

```java
void sent(class_2596<?> packet)
```

## net.fabricmc.fabric.impl.networking.PayloadTypeRegistryImpl

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/PayloadTypeRegistryImpl.java:39`

```java
public class PayloadTypeRegistryImpl<B extends class_2540> implements PayloadTypeRegistry<B>
```

## net.fabricmc.fabric.impl.networking.PayloadTypeRegistryImpl.CONFIGURATION_C2S

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/PayloadTypeRegistryImpl.java:40`

```java
public static final PayloadTypeRegistryImpl<class_2540> CONFIGURATION_C2S = new PayloadTypeRegistryImpl<>(class_2539.field_45671, class_2598.field_11941)
```

## net.fabricmc.fabric.impl.networking.PayloadTypeRegistryImpl.CONFIGURATION_S2C

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/PayloadTypeRegistryImpl.java:41`

```java
public static final PayloadTypeRegistryImpl<class_2540> CONFIGURATION_S2C = new PayloadTypeRegistryImpl<>(class_2539.field_45671, class_2598.field_11942)
```

## net.fabricmc.fabric.impl.networking.PayloadTypeRegistryImpl.PLAY_C2S

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/PayloadTypeRegistryImpl.java:42`

```java
public static final PayloadTypeRegistryImpl<class_9129> PLAY_C2S = new PayloadTypeRegistryImpl<>(class_2539.field_20591, class_2598.field_11941)
```

## net.fabricmc.fabric.impl.networking.PayloadTypeRegistryImpl.PLAY_S2C

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/PayloadTypeRegistryImpl.java:43`

```java
public static final PayloadTypeRegistryImpl<class_9129> PLAY_S2C = new PayloadTypeRegistryImpl<>(class_2539.field_20591, class_2598.field_11942)
```

## net.fabricmc.fabric.impl.networking.PayloadTypeRegistryImpl.get

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/PayloadTypeRegistryImpl.java:56`

```java
@Nullable public static PayloadTypeRegistryImpl<?> get(class_9127<?> state)
```

## net.fabricmc.fabric.impl.networking.PayloadTypeRegistryImpl.register

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/PayloadTypeRegistryImpl.java:65`

```java
@Override public <T extends class_8710> class_8710.class_9155<? super B, T> register(class_8710.class_9154<T> id, class_9139<? super B, T> codec)
```

## net.fabricmc.fabric.impl.networking.PayloadTypeRegistryImpl.registerLarge

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/PayloadTypeRegistryImpl.java:80`

```java
@Override public <T extends class_8710> class_8710.class_9155<? super B, T> registerLarge(class_8710.class_9154<T> id, class_9139<? super B, T> codec, int maxPayloadSize)
```

## net.fabricmc.fabric.impl.networking.PayloadTypeRegistryImpl.get

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/PayloadTypeRegistryImpl.java:104`

```java
public class_8710.@Nullable class_9155<B, ? extends class_8710> get(class_2960 id)
```

## net.fabricmc.fabric.impl.networking.PayloadTypeRegistryImpl.get

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/PayloadTypeRegistryImpl.java:108`

```java
public <T extends class_8710> class_8710.@Nullable class_9155<B, T> get(class_8710.class_9154<T> id)
```

## net.fabricmc.fabric.impl.networking.PayloadTypeRegistryImpl.getMaxPacketSize

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/PayloadTypeRegistryImpl.java:113`

```java
public int getMaxPacketSize(class_2960 id)
```

## net.fabricmc.fabric.impl.networking.PayloadTypeRegistryImpl.getPhase

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/PayloadTypeRegistryImpl.java:117`

```java
public class_2539 getPhase()
```

## net.fabricmc.fabric.impl.networking.PayloadTypeRegistryImpl.getSide

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/PayloadTypeRegistryImpl.java:121`

```java
public class_2598 getSide()
```

## net.fabricmc.fabric.impl.networking.RegistrationPayload

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/RegistrationPayload.java:30`

```java
public record RegistrationPayload(class_9154<RegistrationPayload> id, List<class_2960> channels) implements class_8710
```

## net.fabricmc.fabric.impl.networking.RegistrationPayload.REGISTER

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/RegistrationPayload.java:31`

```java
public static final class_8710.class_9154<RegistrationPayload> REGISTER = new class_8710.class_9154<>(NetworkingImpl.REGISTER_CHANNEL)
```

## net.fabricmc.fabric.impl.networking.RegistrationPayload.UNREGISTER

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/RegistrationPayload.java:32`

```java
public static final class_8710.class_9154<RegistrationPayload> UNREGISTER = new class_8710.class_9154<>(NetworkingImpl.UNREGISTER_CHANNEL)
```

## net.fabricmc.fabric.impl.networking.RegistrationPayload.REGISTER_CODEC

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/RegistrationPayload.java:33`

```java
public static final class_9139<class_2540, RegistrationPayload> REGISTER_CODEC = codec(REGISTER)
```

## net.fabricmc.fabric.impl.networking.RegistrationPayload.UNREGISTER_CODEC

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/RegistrationPayload.java:34`

```java
public static final class_9139<class_2540, RegistrationPayload> UNREGISTER_CODEC = codec(UNREGISTER)
```

## net.fabricmc.fabric.impl.networking.RegistrationPayload.method_56479

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/RegistrationPayload.java:84`

```java
@Override public class_9154<? extends class_8710> method_56479()
```

## net.fabricmc.fabric.impl.networking.UntrackedNetworkHandler

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/UntrackedNetworkHandler.java:20`

```java
public interface UntrackedNetworkHandler
```

## net.fabricmc.fabric.impl.networking.VanillaPacketTypes

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/VanillaPacketTypes.java:27`

```java
public record VanillaPacketTypes(class_9145<?>[] ids)
```

## net.fabricmc.fabric.impl.networking.VanillaPacketTypes.PLAY_S2C

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/VanillaPacketTypes.java:28`

```java
public static final VanillaPacketTypes PLAY_S2C = of(class_9095.field_48173)
```

## net.fabricmc.fabric.impl.networking.VanillaPacketTypes.PLAY_C2S

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/VanillaPacketTypes.java:29`

```java
public static final VanillaPacketTypes PLAY_C2S = of(class_9095.field_48172)
```

## net.fabricmc.fabric.impl.networking.VanillaPacketTypes.CONFIGURATION_S2C

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/VanillaPacketTypes.java:30`

```java
public static final VanillaPacketTypes CONFIGURATION_S2C = of(class_9157.field_52195)
```

## net.fabricmc.fabric.impl.networking.VanillaPacketTypes.CONFIGURATION_C2S

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/VanillaPacketTypes.java:31`

```java
public static final VanillaPacketTypes CONFIGURATION_C2S = of(class_9157.field_52194)
```

## net.fabricmc.fabric.impl.networking.VanillaPacketTypes.get

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/VanillaPacketTypes.java:33`

```java
@Nullable public class_9145<?> get(int id)
```

## net.fabricmc.fabric.impl.networking.VanillaPacketTypes.get

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/VanillaPacketTypes.java:47`

```java
public static VanillaPacketTypes get(class_9127<?> state)
```

## net.fabricmc.fabric.impl.networking.client.ClientCommonNetworkAddon.handler

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/client/ClientCommonNetworkAddon.java:30`

```java
protected final T handler
```

## net.fabricmc.fabric.impl.networking.client.ClientCommonNetworkAddon.client

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/client/ClientCommonNetworkAddon.java:31`

```java
protected final class_310 client
```

## net.fabricmc.fabric.impl.networking.client.ClientCommonNetworkAddon.isServerReady

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/client/ClientCommonNetworkAddon.java:33`

```java
protected boolean isServerReady = false
```

## net.fabricmc.fabric.impl.networking.client.ClientCommonNetworkAddon.ClientCommonNetworkAddon

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/client/ClientCommonNetworkAddon.java:35`

```java
protected ClientCommonNetworkAddon(GlobalReceiverRegistry<H> receiver, class_2535 connection, String description, T handler, class_310 client)
```

## net.fabricmc.fabric.impl.networking.client.ClientCommonNetworkAddon.onServerReady

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/client/ClientCommonNetworkAddon.java:41`

```java
public void onServerReady()
```

## net.fabricmc.fabric.impl.networking.client.ClientCommonNetworkAddon.handleRegistration

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/client/ClientCommonNetworkAddon.java:45`

```java
@Override protected void handleRegistration(class_2960 channelName)
```

## net.fabricmc.fabric.impl.networking.client.ClientCommonNetworkAddon.handleUnregistration

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/client/ClientCommonNetworkAddon.java:57`

```java
@Override protected void handleUnregistration(class_2960 channelName)
```

## net.fabricmc.fabric.impl.networking.client.ClientCommonNetworkAddon.isReservedChannel

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/client/ClientCommonNetworkAddon.java:69`

```java
@Override protected boolean isReservedChannel(class_2960 channelName)
```

## net.fabricmc.fabric.impl.networking.client.ClientCommonNetworkAddon.schedule

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/client/ClientCommonNetworkAddon.java:74`

```java
@Override protected void schedule(Runnable task)
```

## net.fabricmc.fabric.impl.networking.client.ClientConfigurationNetworkAddon

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/client/ClientConfigurationNetworkAddon.java:38`

```java
public final class ClientConfigurationNetworkAddon extends ClientCommonNetworkAddon<ClientConfigurationNetworking.ConfigurationPayloadHandler<?>, class_8674>
```

## net.fabricmc.fabric.impl.networking.client.ClientConfigurationNetworkAddon.ClientConfigurationNetworkAddon

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/client/ClientConfigurationNetworkAddon.java:43`

```java
public ClientConfigurationNetworkAddon(class_8674 handler, class_310 client)
```

## net.fabricmc.fabric.impl.networking.client.ClientConfigurationNetworkAddon.invokeInitEvent

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/client/ClientConfigurationNetworkAddon.java:51`

```java
@Override protected void invokeInitEvent()
```

## net.fabricmc.fabric.impl.networking.client.ClientConfigurationNetworkAddon.onServerReady

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/client/ClientConfigurationNetworkAddon.java:56`

```java
@Override public void onServerReady()
```

## net.fabricmc.fabric.impl.networking.client.ClientConfigurationNetworkAddon.receiveRegistration

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/client/ClientConfigurationNetworkAddon.java:62`

```java
@Override protected void receiveRegistration(boolean register, RegistrationPayload payload)
```

## net.fabricmc.fabric.impl.networking.client.ClientConfigurationNetworkAddon.handle

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/client/ClientConfigurationNetworkAddon.java:74`

```java
@Override public boolean handle(class_8710 payload)
```

## net.fabricmc.fabric.impl.networking.client.ClientConfigurationNetworkAddon.isOnReceiveThread

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/client/ClientConfigurationNetworkAddon.java:86`

```java
@Override protected boolean isOnReceiveThread()
```

## net.fabricmc.fabric.impl.networking.client.ClientConfigurationNetworkAddon.receive

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/client/ClientConfigurationNetworkAddon.java:99`

```java
@Override protected void receive(ClientConfigurationNetworking.ConfigurationPayloadHandler<?> handler, class_8710 payload)
```

## net.fabricmc.fabric.impl.networking.client.ClientConfigurationNetworkAddon.createPacket

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/client/ClientConfigurationNetworkAddon.java:105`

```java
@Override public class_2596<?> createPacket(class_8710 packet)
```

## net.fabricmc.fabric.impl.networking.client.ClientConfigurationNetworkAddon.invokeRegisterEvent

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/client/ClientConfigurationNetworkAddon.java:110`

```java
@Override protected void invokeRegisterEvent(List<class_2960> ids)
```

## net.fabricmc.fabric.impl.networking.client.ClientConfigurationNetworkAddon.invokeUnregisterEvent

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/client/ClientConfigurationNetworkAddon.java:115`

```java
@Override protected void invokeUnregisterEvent(List<class_2960> ids)
```

## net.fabricmc.fabric.impl.networking.client.ClientConfigurationNetworkAddon.handleComplete

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/client/ClientConfigurationNetworkAddon.java:120`

```java
public void handleComplete()
```

## net.fabricmc.fabric.impl.networking.client.ClientConfigurationNetworkAddon.invokeDisconnectEvent

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/client/ClientConfigurationNetworkAddon.java:126`

```java
@Override protected void invokeDisconnectEvent()
```

## net.fabricmc.fabric.impl.networking.client.ClientConfigurationNetworkAddon.getChannelInfoHolder

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/client/ClientConfigurationNetworkAddon.java:131`

```java
public ChannelInfoHolder getChannelInfoHolder()
```

## net.fabricmc.fabric.impl.networking.client.ClientLoginNetworkAddon

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/client/ClientLoginNetworkAddon.java:39`

```java
public final class ClientLoginNetworkAddon extends AbstractNetworkAddon<ClientLoginNetworking.LoginQueryRequestHandler>
```

## net.fabricmc.fabric.impl.networking.client.ClientLoginNetworkAddon.ClientLoginNetworkAddon

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/client/ClientLoginNetworkAddon.java:44`

```java
public ClientLoginNetworkAddon(class_635 handler, class_310 client)
```

## net.fabricmc.fabric.impl.networking.client.ClientLoginNetworkAddon.invokeInitEvent

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/client/ClientLoginNetworkAddon.java:50`

```java
@Override protected void invokeInitEvent()
```

## net.fabricmc.fabric.impl.networking.client.ClientLoginNetworkAddon.handlePacket

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/client/ClientLoginNetworkAddon.java:55`

```java
public boolean handlePacket(class_2899 packet)
```

## net.fabricmc.fabric.impl.networking.client.ClientLoginNetworkAddon.handleRegistration

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/client/ClientLoginNetworkAddon.java:95`

```java
@Override protected void handleRegistration(class_2960 channelName)
```

## net.fabricmc.fabric.impl.networking.client.ClientLoginNetworkAddon.handleUnregistration

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/client/ClientLoginNetworkAddon.java:99`

```java
@Override protected void handleUnregistration(class_2960 channelName)
```

## net.fabricmc.fabric.impl.networking.client.ClientLoginNetworkAddon.invokeDisconnectEvent

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/client/ClientLoginNetworkAddon.java:103`

```java
@Override protected void invokeDisconnectEvent()
```

## net.fabricmc.fabric.impl.networking.client.ClientLoginNetworkAddon.isReservedChannel

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/client/ClientLoginNetworkAddon.java:108`

```java
@Override protected boolean isReservedChannel(class_2960 channelName)
```

## net.fabricmc.fabric.impl.networking.client.ClientNetworkingImpl

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/client/ClientNetworkingImpl.java:50`

```java
public final class ClientNetworkingImpl
```

## net.fabricmc.fabric.impl.networking.client.ClientNetworkingImpl.LOGIN

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/client/ClientNetworkingImpl.java:51`

```java
public static final GlobalReceiverRegistry<ClientLoginNetworking.LoginQueryRequestHandler> LOGIN = new GlobalReceiverRegistry<>(class_2598.field_11942, class_2539.field_20593, null)
```

## net.fabricmc.fabric.impl.networking.client.ClientNetworkingImpl.CONFIGURATION

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/client/ClientNetworkingImpl.java:52`

```java
public static final GlobalReceiverRegistry<ClientConfigurationNetworking.ConfigurationPayloadHandler<?>> CONFIGURATION = new GlobalReceiverRegistry<>(class_2598.field_11942, class_2539.field_45671, PayloadTypeRegistryImpl.CONFIGURATION_S2C)
```

## net.fabricmc.fabric.impl.networking.client.ClientNetworkingImpl.PLAY

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/client/ClientNetworkingImpl.java:53`

```java
public static final GlobalReceiverRegistry<ClientPlayNetworking.PlayPayloadHandler<?>> PLAY = new GlobalReceiverRegistry<>(class_2598.field_11942, class_2539.field_20591, PayloadTypeRegistryImpl.PLAY_S2C)
```

## net.fabricmc.fabric.impl.networking.client.ClientNetworkingImpl.getAddon

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/client/ClientNetworkingImpl.java:58`

```java
public static ClientPlayNetworkAddon getAddon(class_634 handler)
```

## net.fabricmc.fabric.impl.networking.client.ClientNetworkingImpl.getAddon

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/client/ClientNetworkingImpl.java:62`

```java
public static ClientConfigurationNetworkAddon getAddon(class_8674 handler)
```

## net.fabricmc.fabric.impl.networking.client.ClientNetworkingImpl.getAddon

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/client/ClientNetworkingImpl.java:66`

```java
public static ClientLoginNetworkAddon getAddon(class_635 handler)
```

## net.fabricmc.fabric.impl.networking.client.ClientNetworkingImpl.createC2SPacket

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/client/ClientNetworkingImpl.java:70`

```java
public static class_2596<class_8706> createC2SPacket(class_8710 payload)
```

## net.fabricmc.fabric.impl.networking.client.ClientNetworkingImpl.getLoginConnection

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/client/ClientNetworkingImpl.java:80`

```java
@Nullable public static class_2535 getLoginConnection()
```

## net.fabricmc.fabric.impl.networking.client.ClientNetworkingImpl.getClientConfigurationAddon

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/client/ClientNetworkingImpl.java:99`

```java
@Nullable public static ClientConfigurationNetworkAddon getClientConfigurationAddon()
```

## net.fabricmc.fabric.impl.networking.client.ClientNetworkingImpl.getClientPlayAddon

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/client/ClientNetworkingImpl.java:104`

```java
@Nullable public static ClientPlayNetworkAddon getClientPlayAddon()
```

## net.fabricmc.fabric.impl.networking.client.ClientNetworkingImpl.setClientPlayAddon

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/client/ClientNetworkingImpl.java:122`

```java
public static void setClientPlayAddon(ClientPlayNetworkAddon addon)
```

## net.fabricmc.fabric.impl.networking.client.ClientNetworkingImpl.setClientConfigurationAddon

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/client/ClientNetworkingImpl.java:130`

```java
public static void setClientConfigurationAddon(ClientConfigurationNetworkAddon addon)
```

## net.fabricmc.fabric.impl.networking.client.ClientNetworkingImpl.clientInit

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/client/ClientNetworkingImpl.java:134`

```java
public static void clientInit()
```

## net.fabricmc.fabric.impl.networking.client.ClientPlayNetworkAddon

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/client/ClientPlayNetworkAddon.java:37`

```java
public final class ClientPlayNetworkAddon extends ClientCommonNetworkAddon<ClientPlayNetworking.PlayPayloadHandler<?>, class_634>
```

## net.fabricmc.fabric.impl.networking.client.ClientPlayNetworkAddon.ClientPlayNetworkAddon

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/client/ClientPlayNetworkAddon.java:42`

```java
public ClientPlayNetworkAddon(class_634 handler, class_310 client)
```

## net.fabricmc.fabric.impl.networking.client.ClientPlayNetworkAddon.invokeInitEvent

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/client/ClientPlayNetworkAddon.java:50`

```java
@Override protected void invokeInitEvent()
```

## net.fabricmc.fabric.impl.networking.client.ClientPlayNetworkAddon.onServerReady

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/client/ClientPlayNetworkAddon.java:55`

```java
@Override public void onServerReady()
```

## net.fabricmc.fabric.impl.networking.client.ClientPlayNetworkAddon.isOnReceiveThread

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/client/ClientPlayNetworkAddon.java:68`

```java
@Override protected boolean isOnReceiveThread()
```

## net.fabricmc.fabric.impl.networking.client.ClientPlayNetworkAddon.receive

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/client/ClientPlayNetworkAddon.java:73`

```java
@Override protected void receive(ClientPlayNetworking.PlayPayloadHandler<?> handler, class_8710 payload)
```

## net.fabricmc.fabric.impl.networking.client.ClientPlayNetworkAddon.createPacket

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/client/ClientPlayNetworkAddon.java:79`

```java
@Override public class_2596<?> createPacket(class_8710 packet)
```

## net.fabricmc.fabric.impl.networking.client.ClientPlayNetworkAddon.invokeRegisterEvent

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/client/ClientPlayNetworkAddon.java:84`

```java
@Override protected void invokeRegisterEvent(List<class_2960> ids)
```

## net.fabricmc.fabric.impl.networking.client.ClientPlayNetworkAddon.invokeUnregisterEvent

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/client/ClientPlayNetworkAddon.java:89`

```java
@Override protected void invokeUnregisterEvent(List<class_2960> ids)
```

## net.fabricmc.fabric.impl.networking.client.ClientPlayNetworkAddon.invokeDisconnectEvent

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/client/ClientPlayNetworkAddon.java:94`

```java
@Override protected void invokeDisconnectEvent()
```

## net.fabricmc.fabric.impl.networking.payload.PacketByteBufLoginQueryRequestPayload

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/payload/PacketByteBufLoginQueryRequestPayload.java:23`

```java
public record PacketByteBufLoginQueryRequestPayload(class_2960 id, class_2540 data) implements class_8595
```

## net.fabricmc.fabric.impl.networking.payload.PacketByteBufLoginQueryRequestPayload.method_52296

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/payload/PacketByteBufLoginQueryRequestPayload.java:24`

```java
@Override public void method_52296(class_2540 buf)
```

## net.fabricmc.fabric.impl.networking.payload.PacketByteBufLoginQueryResponse

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/payload/PacketByteBufLoginQueryResponse.java:22`

```java
public record PacketByteBufLoginQueryResponse(class_2540 data) implements class_8594
```

## net.fabricmc.fabric.impl.networking.payload.PacketByteBufLoginQueryResponse.method_52295

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/payload/PacketByteBufLoginQueryResponse.java:23`

```java
@Override public void method_52295(class_2540 buf)
```

## net.fabricmc.fabric.impl.networking.payload.PayloadHelper

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/payload/PayloadHelper.java:22`

```java
public class PayloadHelper
```

## net.fabricmc.fabric.impl.networking.payload.PayloadHelper.write

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/payload/PayloadHelper.java:23`

```java
public static void write(class_2540 byteBuf, class_2540 data)
```

## net.fabricmc.fabric.impl.networking.payload.PayloadHelper.read

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/payload/PayloadHelper.java:27`

```java
public static class_2540 read(class_2540 byteBuf, int maxSize)
```

## net.fabricmc.fabric.impl.networking.server.QueryIdFactory.create

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/server/QueryIdFactory.java:25`

```java
static QueryIdFactory create()
```

## net.fabricmc.fabric.impl.networking.server.QueryIdFactory.nextId

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/server/QueryIdFactory.java:37`

```java
int nextId()
```

## net.fabricmc.fabric.impl.networking.server.ServerConfigurationNetworkAddon

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/server/ServerConfigurationNetworkAddon.java:43`

```java
public final class ServerConfigurationNetworkAddon extends AbstractChanneledNetworkAddon<ServerConfigurationNetworking.ConfigurationPacketHandler<?>>
```

## net.fabricmc.fabric.impl.networking.server.ServerConfigurationNetworkAddon.ServerConfigurationNetworkAddon

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/server/ServerConfigurationNetworkAddon.java:52`

```java
public ServerConfigurationNetworkAddon(class_8610 handler, MinecraftServer server)
```

## net.fabricmc.fabric.impl.networking.server.ServerConfigurationNetworkAddon.handle

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/server/ServerConfigurationNetworkAddon.java:62`

```java
@Override public boolean handle(class_8710 payload)
```

## net.fabricmc.fabric.impl.networking.server.ServerConfigurationNetworkAddon.isOnReceiveThread

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/server/ServerConfigurationNetworkAddon.java:72`

```java
@Override protected boolean isOnReceiveThread()
```

## net.fabricmc.fabric.impl.networking.server.ServerConfigurationNetworkAddon.invokeInitEvent

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/server/ServerConfigurationNetworkAddon.java:78`

```java
@Override protected void invokeInitEvent()
```

## net.fabricmc.fabric.impl.networking.server.ServerConfigurationNetworkAddon.preConfiguration

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/server/ServerConfigurationNetworkAddon.java:82`

```java
public void preConfiguration()
```

## net.fabricmc.fabric.impl.networking.server.ServerConfigurationNetworkAddon.configuration

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/server/ServerConfigurationNetworkAddon.java:86`

```java
public void configuration()
```

## net.fabricmc.fabric.impl.networking.server.ServerConfigurationNetworkAddon.startConfiguration

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/server/ServerConfigurationNetworkAddon.java:90`

```java
public boolean startConfiguration()
```

## net.fabricmc.fabric.impl.networking.server.ServerConfigurationNetworkAddon.receiveRegistration

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/server/ServerConfigurationNetworkAddon.java:110`

```java
@Override protected void receiveRegistration(boolean register, RegistrationPayload resolvable)
```

## net.fabricmc.fabric.impl.networking.server.ServerConfigurationNetworkAddon.onPong

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/server/ServerConfigurationNetworkAddon.java:121`

```java
public void onPong(int parameter)
```

## net.fabricmc.fabric.impl.networking.server.ServerConfigurationNetworkAddon.receive

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/server/ServerConfigurationNetworkAddon.java:129`

```java
@Override protected void receive(ServerConfigurationNetworking.ConfigurationPacketHandler<?> handler, class_8710 payload)
```

## net.fabricmc.fabric.impl.networking.server.ServerConfigurationNetworkAddon.schedule

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/server/ServerConfigurationNetworkAddon.java:136`

```java
@Override protected void schedule(Runnable task)
```

## net.fabricmc.fabric.impl.networking.server.ServerConfigurationNetworkAddon.createPacket

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/server/ServerConfigurationNetworkAddon.java:141`

```java
@Override public class_2596<?> createPacket(class_8710 packet)
```

## net.fabricmc.fabric.impl.networking.server.ServerConfigurationNetworkAddon.invokeRegisterEvent

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/server/ServerConfigurationNetworkAddon.java:146`

```java
@Override protected void invokeRegisterEvent(List<class_2960> ids)
```

## net.fabricmc.fabric.impl.networking.server.ServerConfigurationNetworkAddon.invokeUnregisterEvent

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/server/ServerConfigurationNetworkAddon.java:151`

```java
@Override protected void invokeUnregisterEvent(List<class_2960> ids)
```

## net.fabricmc.fabric.impl.networking.server.ServerConfigurationNetworkAddon.handleRegistration

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/server/ServerConfigurationNetworkAddon.java:156`

```java
@Override protected void handleRegistration(class_2960 channelName)
```

## net.fabricmc.fabric.impl.networking.server.ServerConfigurationNetworkAddon.handleUnregistration

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/server/ServerConfigurationNetworkAddon.java:168`

```java
@Override protected void handleUnregistration(class_2960 channelName)
```

## net.fabricmc.fabric.impl.networking.server.ServerConfigurationNetworkAddon.invokeDisconnectEvent

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/server/ServerConfigurationNetworkAddon.java:180`

```java
@Override protected void invokeDisconnectEvent()
```

## net.fabricmc.fabric.impl.networking.server.ServerConfigurationNetworkAddon.isReservedChannel

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/server/ServerConfigurationNetworkAddon.java:185`

```java
@Override protected boolean isReservedChannel(class_2960 channelName)
```

## net.fabricmc.fabric.impl.networking.server.ServerConfigurationNetworkAddon.sendPacket

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/server/ServerConfigurationNetworkAddon.java:190`

```java
@Override public void sendPacket(class_2596<?> packet, ChannelFutureListener callback)
```

## net.fabricmc.fabric.impl.networking.server.ServerConfigurationNetworkAddon.getClientBrand

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/server/ServerConfigurationNetworkAddon.java:195`

```java
public @Nullable String getClientBrand()
```

## net.fabricmc.fabric.impl.networking.server.ServerConfigurationNetworkAddon.isReconfiguring

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/server/ServerConfigurationNetworkAddon.java:199`

```java
public boolean isReconfiguring()
```

## net.fabricmc.fabric.impl.networking.server.ServerConfigurationNetworkAddon.setReconfiguring

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/server/ServerConfigurationNetworkAddon.java:203`

```java
public void setReconfiguring()
```

## net.fabricmc.fabric.impl.networking.server.ServerConfigurationNetworkAddon.getChannelInfoHolder

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/server/ServerConfigurationNetworkAddon.java:214`

```java
public ChannelInfoHolder getChannelInfoHolder()
```

## net.fabricmc.fabric.impl.networking.server.ServerLoginNetworkAddon

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/server/ServerLoginNetworkAddon.java:52`

```java
public final class ServerLoginNetworkAddon extends AbstractNetworkAddon<ServerLoginNetworking.LoginQueryResponseHandler> implements LoginPacketSender
```

## net.fabricmc.fabric.impl.networking.server.ServerLoginNetworkAddon.ServerLoginNetworkAddon

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/server/ServerLoginNetworkAddon.java:61`

```java
public ServerLoginNetworkAddon(class_3248 handler)
```

## net.fabricmc.fabric.impl.networking.server.ServerLoginNetworkAddon.invokeInitEvent

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/server/ServerLoginNetworkAddon.java:69`

```java
@Override protected void invokeInitEvent()
```

## net.fabricmc.fabric.impl.networking.server.ServerLoginNetworkAddon.queryTick

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/server/ServerLoginNetworkAddon.java:75`

```java
public boolean queryTick()
```

## net.fabricmc.fabric.impl.networking.server.ServerLoginNetworkAddon.handle

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/server/ServerLoginNetworkAddon.java:127`

```java
public boolean handle(class_2913 packet)
```

## net.fabricmc.fabric.impl.networking.server.ServerLoginNetworkAddon.createPacket

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/server/ServerLoginNetworkAddon.java:160`

```java
@Override public class_2596<?> createPacket(class_8710 packet)
```

## net.fabricmc.fabric.impl.networking.server.ServerLoginNetworkAddon.createPacket

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/server/ServerLoginNetworkAddon.java:165`

```java
@Override public class_2596<?> createPacket(class_2960 channelName, class_2540 buf)
```

## net.fabricmc.fabric.impl.networking.server.ServerLoginNetworkAddon.sendPacket

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/server/ServerLoginNetworkAddon.java:171`

```java
@Override public void sendPacket(class_2596<?> packet, ChannelFutureListener callback)
```

## net.fabricmc.fabric.impl.networking.server.ServerLoginNetworkAddon.disconnect

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/server/ServerLoginNetworkAddon.java:178`

```java
@Override public void disconnect(class_2561 disconnectReason)
```

## net.fabricmc.fabric.impl.networking.server.ServerLoginNetworkAddon.registerOutgoingPacket

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/server/ServerLoginNetworkAddon.java:185`

```java
public void registerOutgoingPacket(class_2899 packet)
```

## net.fabricmc.fabric.impl.networking.server.ServerLoginNetworkAddon.handleRegistration

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/server/ServerLoginNetworkAddon.java:189`

```java
@Override protected void handleRegistration(class_2960 channelName)
```

## net.fabricmc.fabric.impl.networking.server.ServerLoginNetworkAddon.handleUnregistration

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/server/ServerLoginNetworkAddon.java:193`

```java
@Override protected void handleUnregistration(class_2960 channelName)
```

## net.fabricmc.fabric.impl.networking.server.ServerLoginNetworkAddon.invokeDisconnectEvent

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/server/ServerLoginNetworkAddon.java:197`

```java
@Override protected void invokeDisconnectEvent()
```

## net.fabricmc.fabric.impl.networking.server.ServerLoginNetworkAddon.isReservedChannel

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/server/ServerLoginNetworkAddon.java:202`

```java
@Override protected boolean isReservedChannel(class_2960 channelName)
```

## net.fabricmc.fabric.impl.networking.server.ServerNetworkingImpl

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/server/ServerNetworkingImpl.java:36`

```java
public final class ServerNetworkingImpl
```

## net.fabricmc.fabric.impl.networking.server.ServerNetworkingImpl.LOGIN

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/server/ServerNetworkingImpl.java:37`

```java
public static final GlobalReceiverRegistry<ServerLoginNetworking.LoginQueryResponseHandler> LOGIN = new GlobalReceiverRegistry<>(class_2598.field_11941, class_2539.field_20593, null)
```

## net.fabricmc.fabric.impl.networking.server.ServerNetworkingImpl.CONFIGURATION

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/server/ServerNetworkingImpl.java:38`

```java
public static final GlobalReceiverRegistry<ServerConfigurationNetworking.ConfigurationPacketHandler<?>> CONFIGURATION = new GlobalReceiverRegistry<>(class_2598.field_11941, class_2539.field_45671, PayloadTypeRegistryImpl.CONFIGURATION_C2S)
```

## net.fabricmc.fabric.impl.networking.server.ServerNetworkingImpl.PLAY

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/server/ServerNetworkingImpl.java:39`

```java
public static final GlobalReceiverRegistry<ServerPlayNetworking.PlayPayloadHandler<?>> PLAY = new GlobalReceiverRegistry<>(class_2598.field_11941, class_2539.field_20591, PayloadTypeRegistryImpl.PLAY_C2S)
```

## net.fabricmc.fabric.impl.networking.server.ServerNetworkingImpl.getAddon

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/server/ServerNetworkingImpl.java:41`

```java
public static ServerPlayNetworkAddon getAddon(class_3244 handler)
```

## net.fabricmc.fabric.impl.networking.server.ServerNetworkingImpl.getAddon

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/server/ServerNetworkingImpl.java:45`

```java
public static ServerLoginNetworkAddon getAddon(class_3248 handler)
```

## net.fabricmc.fabric.impl.networking.server.ServerNetworkingImpl.getAddon

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/server/ServerNetworkingImpl.java:49`

```java
public static ServerConfigurationNetworkAddon getAddon(class_8610 handler)
```

## net.fabricmc.fabric.impl.networking.server.ServerNetworkingImpl.createS2CPacket

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/server/ServerNetworkingImpl.java:53`

```java
public static class_2596<class_8705> createS2CPacket(class_8710 payload)
```

## net.fabricmc.fabric.impl.networking.server.ServerPlayNetworkAddon

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/server/ServerPlayNetworkAddon.java:39`

```java
public final class ServerPlayNetworkAddon extends AbstractChanneledNetworkAddon<ServerPlayNetworking.PlayPayloadHandler<?>>
```

## net.fabricmc.fabric.impl.networking.server.ServerPlayNetworkAddon.ServerPlayNetworkAddon

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/server/ServerPlayNetworkAddon.java:47`

```java
public ServerPlayNetworkAddon(class_3244 handler, class_2535 connection, MinecraftServer server)
```

## net.fabricmc.fabric.impl.networking.server.ServerPlayNetworkAddon.invokeInitEvent

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/server/ServerPlayNetworkAddon.java:57`

```java
@Override protected void invokeInitEvent()
```

## net.fabricmc.fabric.impl.networking.server.ServerPlayNetworkAddon.onClientReady

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/server/ServerPlayNetworkAddon.java:62`

```java
public void onClientReady()
```

## net.fabricmc.fabric.impl.networking.server.ServerPlayNetworkAddon.isOnReceiveThread

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/server/ServerPlayNetworkAddon.java:69`

```java
@Override protected boolean isOnReceiveThread()
```

## net.fabricmc.fabric.impl.networking.server.ServerPlayNetworkAddon.receive

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/server/ServerPlayNetworkAddon.java:74`

```java
@Override protected void receive(ServerPlayNetworking.PlayPayloadHandler<?> payloadHandler, class_8710 payload)
```

## net.fabricmc.fabric.impl.networking.server.ServerPlayNetworkAddon.schedule

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/server/ServerPlayNetworkAddon.java:81`

```java
@Override protected void schedule(Runnable task)
```

## net.fabricmc.fabric.impl.networking.server.ServerPlayNetworkAddon.createPacket

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/server/ServerPlayNetworkAddon.java:86`

```java
@Override public class_2596<?> createPacket(class_8710 packet)
```

## net.fabricmc.fabric.impl.networking.server.ServerPlayNetworkAddon.invokeRegisterEvent

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/server/ServerPlayNetworkAddon.java:91`

```java
@Override protected void invokeRegisterEvent(List<class_2960> ids)
```

## net.fabricmc.fabric.impl.networking.server.ServerPlayNetworkAddon.invokeUnregisterEvent

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/server/ServerPlayNetworkAddon.java:96`

```java
@Override protected void invokeUnregisterEvent(List<class_2960> ids)
```

## net.fabricmc.fabric.impl.networking.server.ServerPlayNetworkAddon.handleRegistration

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/server/ServerPlayNetworkAddon.java:101`

```java
@Override protected void handleRegistration(class_2960 channelName)
```

## net.fabricmc.fabric.impl.networking.server.ServerPlayNetworkAddon.handleUnregistration

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/server/ServerPlayNetworkAddon.java:113`

```java
@Override protected void handleUnregistration(class_2960 channelName)
```

## net.fabricmc.fabric.impl.networking.server.ServerPlayNetworkAddon.invokeDisconnectEvent

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/server/ServerPlayNetworkAddon.java:125`

```java
@Override protected void invokeDisconnectEvent()
```

## net.fabricmc.fabric.impl.networking.server.ServerPlayNetworkAddon.isReservedChannel

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/server/ServerPlayNetworkAddon.java:130`

```java
@Override protected boolean isReservedChannel(class_2960 channelName)
```

## net.fabricmc.fabric.impl.networking.server.ServerPlayNetworkAddon.reconfigure

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/server/ServerPlayNetworkAddon.java:135`

```java
public void reconfigure()
```

## net.fabricmc.fabric.impl.networking.server.ServerPlayNetworkAddon.requestedReconfigure

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/server/ServerPlayNetworkAddon.java:144`

```java
public boolean requestedReconfigure()
```

## net.fabricmc.fabric.impl.networking.splitter.FabricPacketMerger

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/splitter/FabricPacketMerger.java:38`

```java
public class FabricPacketMerger extends MessageToMessageDecoder<class_2596<?>>
```

## net.fabricmc.fabric.impl.networking.splitter.FabricPacketMerger.FabricPacketMerger

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/splitter/FabricPacketMerger.java:45`

```java
public FabricPacketMerger(class_2543<?> decoderHandler, PayloadTypeRegistryImpl<?> payloadTypeRegistry, VanillaPacketTypes vanillaPacketTypes)
```

## net.fabricmc.fabric.impl.networking.splitter.FabricPacketMerger.decode

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/splitter/FabricPacketMerger.java:51`

```java
protected void decode(ChannelHandlerContext channelHandlerContext, class_2596<?> packet, List<Object> list) throws Exception
```

## net.fabricmc.fabric.impl.networking.splitter.FabricPacketSplitter

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/splitter/FabricPacketSplitter.java:38`

```java
public class FabricPacketSplitter extends MessageToMessageEncoder<class_2596<?>>
```

## net.fabricmc.fabric.impl.networking.splitter.FabricPacketSplitter.SAFE_S2C_SPLIT_SIZE

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/splitter/FabricPacketSplitter.java:39`

```java
public static final int SAFE_S2C_SPLIT_SIZE = class_2658.field_33326
```

## net.fabricmc.fabric.impl.networking.splitter.FabricPacketSplitter.SAFE_C2S_SPLIT_SIZE

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/splitter/FabricPacketSplitter.java:40`

```java
public static final int SAFE_C2S_SPLIT_SIZE = class_2817.field_33361
```

## net.fabricmc.fabric.impl.networking.splitter.FabricPacketSplitter.FabricPacketSplitter

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/splitter/FabricPacketSplitter.java:44`

```java
public FabricPacketSplitter(class_2545<?> encoderHandler, PayloadTypeRegistryImpl<?> payloadTypeRegistry)
```

## net.fabricmc.fabric.impl.networking.splitter.FabricPacketSplitter.encode

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/splitter/FabricPacketSplitter.java:49`

```java
protected void encode(ChannelHandlerContext channelHandlerContext, class_2596<?> packet, List<Object> list) throws Exception
```

## net.fabricmc.fabric.impl.networking.splitter.FabricPacketSplitter.genericPacketSplitter

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/splitter/FabricPacketSplitter.java:61`

```java
public static void genericPacketSplitter(class_2960 packetId, ChannelHandlerContext channelHandlerContext, class_2545<?> encoder, class_2596<?> packet, Function<class_8710, class_2596<?>> packetConstructor, Consumer<class_2596<?>> consumer, int maxChunkSize, int maxPacketSize) throws Exception
```

## net.fabricmc.fabric.impl.networking.splitter.FabricSplitPacketPayload

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/splitter/FabricSplitPacketPayload.java:24`

```java
public record FabricSplitPacketPayload(ByteBuf byteBuf) implements class_8710
```

## net.fabricmc.fabric.impl.networking.splitter.FabricSplitPacketPayload.ID

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/splitter/FabricSplitPacketPayload.java:25`

```java
public static final class_9154<FabricSplitPacketPayload> ID = new class_9154<>(class_2960.method_60655("fabric", "split"))
```

## net.fabricmc.fabric.impl.networking.splitter.FabricSplitPacketPayload.CODEC

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/splitter/FabricSplitPacketPayload.java:26`

```java
public static final class_9139<ByteBuf, FabricSplitPacketPayload> CODEC = class_9139.method_56437(FabricSplitPacketPayload::write, FabricSplitPacketPayload::read)
```

## net.fabricmc.fabric.impl.networking.splitter.FabricSplitPacketPayload.method_56479

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/splitter/FabricSplitPacketPayload.java:36`

```java
@Override public class_9154<? extends class_8710> method_56479()
```

## net.fabricmc.fabric.impl.networking.splitter.PassthroughPacket

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/splitter/PassthroughPacket.java:32`

```java
public record PassthroughPacket(ByteBuf buf) implements class_2596<class_2547>
```

## net.fabricmc.fabric.impl.networking.splitter.PassthroughPacket.method_65080

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/splitter/PassthroughPacket.java:35`

```java
@Override public class_9145<? extends class_2596<class_2547>> method_65080()
```

## net.fabricmc.fabric.impl.networking.splitter.PassthroughPacket.method_65081

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/splitter/PassthroughPacket.java:40`

```java
@Override public void method_65081(class_2547 listener)
```

## net.fabricmc.fabric.impl.networking.splitter.SplittablePacket

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/splitter/SplittablePacket.java:26`

```java
public interface SplittablePacket
```

## net.fabricmc.fabric.impl.networking.splitter.SplittablePacket.fabric_split

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/impl/networking/splitter/SplittablePacket.java:27`

```java
void fabric_split(PayloadTypeRegistryImpl<?> payloadTypeRegistry, ChannelHandlerContext channelHandlerContext, class_2545<?> encoder, class_2596<?> packet, Consumer<class_2596<?>> consumer) throws Exception
```

## net.fabricmc.fabric.mixin.networking.BundlePacketMixin

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/mixin/networking/BundlePacketMixin.java:28`

```java
@Mixin(class_8038.class) public class BundlePacketMixin
```

## net.fabricmc.fabric.mixin.networking.ClientboundCustomPayloadPacketMixin

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/mixin/networking/ClientboundCustomPayloadPacketMixin.java:42`

```java
@Mixin(class_2658.class) public class ClientboundCustomPayloadPacketMixin implements SplittablePacket, GenericPayloadAccessor
```

## net.fabricmc.fabric.mixin.networking.ClientboundCustomPayloadPacketMixin.fabric_split

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/mixin/networking/ClientboundCustomPayloadPacketMixin.java:78`

```java
@Override public void fabric_split(PayloadTypeRegistryImpl<?> payloadTypeRegistry, ChannelHandlerContext channelHandlerContext, class_2545<?> encoder, class_2596<?> packet, Consumer<class_2596<?>> consumer) throws Exception
```

## net.fabricmc.fabric.mixin.networking.ClientboundCustomPayloadPacketMixin.fabric_payload

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/mixin/networking/ClientboundCustomPayloadPacketMixin.java:90`

```java
@Override public class_8710 fabric_payload()
```

## net.fabricmc.fabric.mixin.networking.ClientboundCustomQueryPacketMixin

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/mixin/networking/ClientboundCustomQueryPacketMixin.java:32`

```java
@Mixin(class_2899.class) public class ClientboundCustomQueryPacketMixin
```

## net.fabricmc.fabric.mixin.networking.CommandsMixin

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/mixin/networking/CommandsMixin.java:33`

```java
@Mixin(class_2170.class) public class CommandsMixin
```

## net.fabricmc.fabric.mixin.networking.ConnectionMixin.fabric_getPendingChannelsNames

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/mixin/networking/ConnectionMixin.java:121`

```java
@Override public Collection<class_2960> fabric_getPendingChannelsNames(class_2539 state)
```

## net.fabricmc.fabric.mixin.networking.CustomPayloadPacketCodecMixin

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/mixin/networking/CustomPayloadPacketCodecMixin.java:32`

```java
@Mixin(targets = "net.minecraft.network.protocol.common.custom.CustomPacketPayload$1") public abstract class CustomPayloadPacketCodecMixin<B extends class_2540> implements class_9139<B, class_8710>, FabricCustomPayloadPacketCodec<B>
```

## net.fabricmc.fabric.mixin.networking.CustomPayloadPacketCodecMixin.fabric_setPacketCodecProvider

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/mixin/networking/CustomPayloadPacketCodecMixin.java:37`

```java
@Override public void fabric_setPacketCodecProvider(CustomPayloadTypeProvider<B> customPayloadTypeProvider)
```

## net.fabricmc.fabric.mixin.networking.DebugConfigCommandMixin

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/mixin/networking/DebugConfigCommandMixin.java:25`

```java
@Mixin(class_8600.class) public class DebugConfigCommandMixin
```

## net.fabricmc.fabric.mixin.networking.IdDispatchCodecMixin

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/mixin/networking/IdDispatchCodecMixin.java:32`

```java
@Mixin(class_9136.class) public abstract class IdDispatchCodecMixin<B extends ByteBuf, V, T> implements class_9139<B, V>
```

## net.fabricmc.fabric.mixin.networking.IdDispatchCodecMixin.encode

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/mixin/networking/IdDispatchCodecMixin.java:35`

```java
@Inject(method = "encode(Lio/netty/buffer/ByteBuf;Ljava/lang/Object;)V", at = @At(value = "NEW", target = "(Ljava/lang/String;Ljava/lang/Throwable;)Lio/netty/handler/codec/EncoderException;")) public void encode(B byteBuf, V packet, CallbackInfo ci, @Local(ordinal = 1) T packetId, @Local Exception e)
```

## net.fabricmc.fabric.mixin.networking.PacketEncoderMixin

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/mixin/networking/PacketEncoderMixin.java:30`

```java
@Mixin(value = class_2545.class, priority = 500) public class PacketEncoderMixin
```

## net.fabricmc.fabric.mixin.networking.RegistryFriendlyByteBufMixin

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/mixin/networking/RegistryFriendlyByteBufMixin.java:29`

```java
@Mixin(class_9129.class) public class RegistryFriendlyByteBufMixin implements FabricRegistryByteBuf
```

## net.fabricmc.fabric.mixin.networking.RegistryFriendlyByteBufMixin.fabric_setSendableConfigurationChannels

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/mixin/networking/RegistryFriendlyByteBufMixin.java:34`

```java
@Override public void fabric_setSendableConfigurationChannels(Set<class_2960> globalChannels)
```

## net.fabricmc.fabric.mixin.networking.RegistryFriendlyByteBufMixin.fabric_getSendableConfigurationChannels

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/mixin/networking/RegistryFriendlyByteBufMixin.java:39`

```java
@Override public @Nullable Set<class_2960> fabric_getSendableConfigurationChannels()
```

## net.fabricmc.fabric.mixin.networking.ServerCommonPacketListenerImplMixin

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/mixin/networking/ServerCommonPacketListenerImplMixin.java:34`

```java
@Mixin(class_8609.class) public abstract class ServerCommonPacketListenerImplMixin implements NetworkHandlerExtensions
```

## net.fabricmc.fabric.mixin.networking.ServerCommonPacketListenerImplMixin.server

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/mixin/networking/ServerCommonPacketListenerImplMixin.java:36`

```java
@Shadow @Final protected MinecraftServer server
```

## net.fabricmc.fabric.mixin.networking.ServerConfigurationPacketListenerImplMixin

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/mixin/networking/ServerConfigurationPacketListenerImplMixin.java:48`

```java
@Mixin(value = class_8610.class, priority = 900) public abstract class ServerConfigurationPacketListenerImplMixin extends class_8609 implements NetworkHandlerExtensions, FabricServerConfigurationNetworkHandler
```

## net.fabricmc.fabric.mixin.networking.ServerConfigurationPacketListenerImplMixin.finishCurrentTask

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/mixin/networking/ServerConfigurationPacketListenerImplMixin.java:54`

```java
@Shadow protected abstract void finishCurrentTask(class_8605.class_8606 key)
```

## net.fabricmc.fabric.mixin.networking.ServerConfigurationPacketListenerImplMixin.method_48106

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/mixin/networking/ServerConfigurationPacketListenerImplMixin.java:61`

```java
@Shadow public abstract boolean method_48106()
```

## net.fabricmc.fabric.mixin.networking.ServerConfigurationPacketListenerImplMixin.startConfiguration

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/mixin/networking/ServerConfigurationPacketListenerImplMixin.java:64`

```java
@Shadow public abstract void startConfiguration()
```

## net.fabricmc.fabric.mixin.networking.ServerConfigurationPacketListenerImplMixin.ServerConfigurationPacketListenerImplMixin

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/mixin/networking/ServerConfigurationPacketListenerImplMixin.java:76`

```java
public ServerConfigurationPacketListenerImplMixin(MinecraftServer server, class_2535 connection, class_8792 arg)
```

## net.fabricmc.fabric.mixin.networking.ServerConfigurationPacketListenerImplMixin.getAddon

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/mixin/networking/ServerConfigurationPacketListenerImplMixin.java:150`

```java
@Override public ServerConfigurationNetworkAddon getAddon()
```

## net.fabricmc.fabric.mixin.networking.ServerConfigurationPacketListenerImplMixin.addTask

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/mixin/networking/ServerConfigurationPacketListenerImplMixin.java:155`

```java
@Override public void addTask(class_8605 task)
```

## net.fabricmc.fabric.mixin.networking.ServerConfigurationPacketListenerImplMixin.completeTask

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/mixin/networking/ServerConfigurationPacketListenerImplMixin.java:160`

```java
@Override public void completeTask(class_8605.class_8606 key)
```

## net.fabricmc.fabric.mixin.networking.ServerGamePacketListenerImplMixin.getAddon

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/mixin/networking/ServerGamePacketListenerImplMixin.java:85`

```java
@Override public ServerPlayNetworkAddon getAddon()
```

## net.fabricmc.fabric.mixin.networking.ServerLoginPacketListenerImplMixin.verifyLoginAndFinishConnectionSetup

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/mixin/networking/ServerLoginPacketListenerImplMixin.java:39`

```java
@Shadow protected abstract void verifyLoginAndFinishConnectionSetup(GameProfile gameProfile)
```

## net.fabricmc.fabric.mixin.networking.ServerLoginPacketListenerImplMixin.sent

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/mixin/networking/ServerLoginPacketListenerImplMixin.java:77`

```java
@Override public void sent(class_2596<?> packet)
```

## net.fabricmc.fabric.mixin.networking.ServerLoginPacketListenerImplMixin.getAddon

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/mixin/networking/ServerLoginPacketListenerImplMixin.java:84`

```java
@Override public ServerLoginNetworkAddon getAddon()
```

## net.fabricmc.fabric.mixin.networking.ServerboundCustomPayloadPacketMixin

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/mixin/networking/ServerboundCustomPayloadPacketMixin.java:42`

```java
@Mixin(class_2817.class) public class ServerboundCustomPayloadPacketMixin implements SplittablePacket, GenericPayloadAccessor
```

## net.fabricmc.fabric.mixin.networking.ServerboundCustomPayloadPacketMixin.fabric_split

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/mixin/networking/ServerboundCustomPayloadPacketMixin.java:69`

```java
@Override public void fabric_split(PayloadTypeRegistryImpl<?> payloadTypeRegistry, ChannelHandlerContext channelHandlerContext, class_2545<?> encoder, class_2596<?> packet, Consumer<class_2596<?>> consumer) throws Exception
```

## net.fabricmc.fabric.mixin.networking.ServerboundCustomPayloadPacketMixin.fabric_payload

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/mixin/networking/ServerboundCustomPayloadPacketMixin.java:81`

```java
@Override public class_8710 fabric_payload()
```

## net.fabricmc.fabric.mixin.networking.ServerboundCustomQueryAnswerPacketMixin

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/mixin/networking/ServerboundCustomQueryAnswerPacketMixin.java:31`

```java
@Mixin(class_2913.class) public class ServerboundCustomQueryAnswerPacketMixin
```

## net.fabricmc.fabric.mixin.networking.accessor.ChunkMapAccessor

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/mixin/networking/accessor/ChunkMapAccessor.java:24`

```java
@Mixin(class_3898.class) public interface ChunkMapAccessor
```

## net.fabricmc.fabric.mixin.networking.accessor.ChunkMapAccessor.getEntityTrackers

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/mixin/networking/accessor/ChunkMapAccessor.java:26`

```java
@Accessor("entityMap") Int2ObjectMap<EntityTrackerAccessor> getEntityTrackers()
```

## net.fabricmc.fabric.mixin.networking.accessor.EntityTrackerAccessor

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/mixin/networking/accessor/EntityTrackerAccessor.java:24`

```java
@Mixin(targets = "net.minecraft.server.level.ChunkMap$TrackedEntity") public interface EntityTrackerAccessor
```

## net.fabricmc.fabric.mixin.networking.accessor.EntityTrackerAccessor.getPlayersTracking

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/mixin/networking/accessor/EntityTrackerAccessor.java:26`

```java
@Accessor("seenBy") Set<class_5629> getPlayersTracking()
```

## net.fabricmc.fabric.mixin.networking.accessor.PacketDecoderAccessor

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/mixin/networking/accessor/PacketDecoderAccessor.java:26`

```java
@Mixin(class_2543.class) public interface PacketDecoderAccessor
```

## net.fabricmc.fabric.mixin.networking.accessor.PacketDecoderAccessor.fabric_decode

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/mixin/networking/accessor/PacketDecoderAccessor.java:28`

```java
@Invoker("decode") void fabric_decode(ChannelHandlerContext var1, ByteBuf var2, List<Object> var3) throws Exception
```

## net.fabricmc.fabric.mixin.networking.accessor.PacketEncoderAccessor

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/mixin/networking/accessor/PacketEncoderAccessor.java:26`

```java
@Mixin(class_2545.class) public interface PacketEncoderAccessor
```

## net.fabricmc.fabric.mixin.networking.accessor.PacketEncoderAccessor.fabric_encode

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/mixin/networking/accessor/PacketEncoderAccessor.java:28`

```java
@Invoker("encode") void fabric_encode(ChannelHandlerContext channelHandlerContext, class_2596<?> packet, ByteBuf byteBuf) throws Exception
```

## net.fabricmc.fabric.mixin.networking.accessor.ServerCommonPacketListenerImplAccessor

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/mixin/networking/accessor/ServerCommonPacketListenerImplAccessor.java:25`

```java
@Mixin(class_8609.class) public interface ServerCommonPacketListenerImplAccessor
```

## net.fabricmc.fabric.mixin.networking.accessor.ServerCommonPacketListenerImplAccessor.getConnection

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/mixin/networking/accessor/ServerCommonPacketListenerImplAccessor.java:27`

```java
@Accessor class_2535 getConnection()
```

## net.fabricmc.fabric.mixin.networking.accessor.ServerCommonPacketListenerImplAccessor.getServer

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/mixin/networking/accessor/ServerCommonPacketListenerImplAccessor.java:30`

```java
@Accessor MinecraftServer getServer()
```

## net.fabricmc.fabric.mixin.networking.accessor.ServerLoginPacketListenerImplAccessor

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/mixin/networking/accessor/ServerLoginPacketListenerImplAccessor.java:25`

```java
@Mixin(class_3248.class) public interface ServerLoginPacketListenerImplAccessor
```

## net.fabricmc.fabric.mixin.networking.accessor.ServerLoginPacketListenerImplAccessor.getServer

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/mixin/networking/accessor/ServerLoginPacketListenerImplAccessor.java:27`

```java
@Accessor MinecraftServer getServer()
```

## net.fabricmc.fabric.mixin.networking.accessor.ServerLoginPacketListenerImplAccessor.getConnection

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/mixin/networking/accessor/ServerLoginPacketListenerImplAccessor.java:30`

```java
@Accessor class_2535 getConnection()
```

## net.fabricmc.fabric.mixin.networking.client.ClientCommonPacketListenerImplMixin

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/mixin/networking/client/ClientCommonPacketListenerImplMixin.java:34`

```java
@Mixin(class_8673.class) public abstract class ClientCommonPacketListenerImplMixin implements NetworkHandlerExtensions
```

## net.fabricmc.fabric.mixin.networking.client.ClientCommonPacketListenerImplMixin.minecraft

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/mixin/networking/client/ClientCommonPacketListenerImplMixin.java:36`

```java
@Shadow @Final protected class_310 minecraft
```

## net.fabricmc.fabric.mixin.networking.client.ClientCommonPacketListenerImplMixin.onCustomPayload

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/mixin/networking/client/ClientCommonPacketListenerImplMixin.java:40`

```java
@Inject(method = "handleCustomPayload(Lnet/minecraft/network/protocol/common/ClientboundCustomPayloadPacket;)V", at = @At("HEAD"), cancellable = true) public void onCustomPayload(class_2658 packet, CallbackInfo ci)
```

## net.fabricmc.fabric.mixin.networking.client.ClientConfigurationPacketListenerImplMixin

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/mixin/networking/client/ClientConfigurationPacketListenerImplMixin.java:35`

```java
@Mixin(value = class_8674.class, priority = 999) public abstract class ClientConfigurationPacketListenerImplMixin extends class_8673 implements NetworkHandlerExtensions
```

## net.fabricmc.fabric.mixin.networking.client.ClientConfigurationPacketListenerImplMixin.ClientConfigurationPacketListenerImplMixin

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/mixin/networking/client/ClientConfigurationPacketListenerImplMixin.java:40`

```java
protected ClientConfigurationPacketListenerImplMixin(class_310 client, class_2535 connection, class_8675 connectionState)
```

## net.fabricmc.fabric.mixin.networking.client.ClientConfigurationPacketListenerImplMixin.handleComplete

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/mixin/networking/client/ClientConfigurationPacketListenerImplMixin.java:52`

```java
@Inject(method = "handleConfigurationFinished", at = @At(value = "NEW", target = "(Lnet/minecraft/client/Minecraft;Lnet/minecraft/network/Connection;Lnet/minecraft/client/multiplayer/CommonListenerCookie;)Lnet/minecraft/client/multiplayer/ClientPacketListener;")) public void handleComplete(class_8733 packet, CallbackInfo ci)
```

## net.fabricmc.fabric.mixin.networking.client.ClientConfigurationPacketListenerImplMixin.getAddon

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/mixin/networking/client/ClientConfigurationPacketListenerImplMixin.java:57`

```java
@Override public ClientConfigurationNetworkAddon getAddon()
```

## net.fabricmc.fabric.mixin.networking.client.ClientHandshakePacketListenerImplMixin.getAddon

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/mixin/networking/client/ClientHandshakePacketListenerImplMixin.java:65`

```java
@Override public ClientLoginNetworkAddon getAddon()
```

## net.fabricmc.fabric.mixin.networking.client.ClientPacketListenerMixin.ClientPacketListenerMixin

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/mixin/networking/client/ClientPacketListenerMixin.java:40`

```java
protected ClientPacketListenerMixin(class_310 client, class_2535 connection, class_8675 connectionState)
```

## net.fabricmc.fabric.mixin.networking.client.ClientPacketListenerMixin.getAddon

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/mixin/networking/client/ClientPacketListenerMixin.java:57`

```java
@Override public ClientPlayNetworkAddon getAddon()
```

## net.fabricmc.fabric.mixin.networking.client.accessor.ClientCommonPacketListenerImplAccessor

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/mixin/networking/client/accessor/ClientCommonPacketListenerImplAccessor.java:24`

```java
@Mixin(class_8673.class) public interface ClientCommonPacketListenerImplAccessor
```

## net.fabricmc.fabric.mixin.networking.client.accessor.ClientCommonPacketListenerImplAccessor.getConnection

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/mixin/networking/client/accessor/ClientCommonPacketListenerImplAccessor.java:26`

```java
@Accessor class_2535 getConnection()
```

## net.fabricmc.fabric.mixin.networking.client.accessor.ClientConfigurationPacketListenerImplAccessor

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/mixin/networking/client/accessor/ClientConfigurationPacketListenerImplAccessor.java:24`

```java
@Mixin(class_8674.class) public interface ClientConfigurationPacketListenerImplAccessor
```

## net.fabricmc.fabric.mixin.networking.client.accessor.ClientConfigurationPacketListenerImplAccessor.getProfile

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/mixin/networking/client/accessor/ClientConfigurationPacketListenerImplAccessor.java:26`

```java
@Accessor("localGameProfile") GameProfile getProfile()
```

## net.fabricmc.fabric.mixin.networking.client.accessor.ClientHandshakePacketListenerImplAccessor

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/mixin/networking/client/accessor/ClientHandshakePacketListenerImplAccessor.java:24`

```java
@Mixin(class_635.class) public interface ClientHandshakePacketListenerImplAccessor
```

## net.fabricmc.fabric.mixin.networking.client.accessor.ClientHandshakePacketListenerImplAccessor.getConnection

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/mixin/networking/client/accessor/ClientHandshakePacketListenerImplAccessor.java:26`

```java
@Accessor class_2535 getConnection()
```

## net.fabricmc.fabric.mixin.networking.client.accessor.ConnectScreenAccessor

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/mixin/networking/client/accessor/ConnectScreenAccessor.java:24`

```java
@Mixin(class_412.class) public interface ConnectScreenAccessor
```

## net.fabricmc.fabric.mixin.networking.client.accessor.ConnectScreenAccessor.getConnection

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/mixin/networking/client/accessor/ConnectScreenAccessor.java:26`

```java
@Accessor class_2535 getConnection()
```

## net.fabricmc.fabric.mixin.networking.client.accessor.MinecraftAccessor

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/mixin/networking/client/accessor/MinecraftAccessor.java:25`

```java
@Mixin(class_310.class) public interface MinecraftAccessor
```

## net.fabricmc.fabric.mixin.networking.client.accessor.MinecraftAccessor.getConnection

Nguồn: `upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/mixin/networking/client/accessor/MinecraftAccessor.java:27`

```java
@Nullable @Accessor("pendingConnection") class_2535 getConnection()
```

## net.fabricmc.fabric.api.client.rendering.v1.ArmorRenderer

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/ArmorRenderer.java:44`

```java
@FunctionalInterface public interface ArmorRenderer
```

## net.fabricmc.fabric.api.client.rendering.v1.ArmorRenderer.register

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/ArmorRenderer.java:53`

```java
static void register(ArmorRenderer.Factory factory, class_1935... items)
```

## net.fabricmc.fabric.api.client.rendering.v1.ArmorRenderer.register

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/ArmorRenderer.java:64`

```java
static void register(ArmorRenderer renderer, class_1935... items)
```

## net.fabricmc.fabric.api.client.rendering.v1.ArmorRenderer.submitTransformCopyingModel

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/ArmorRenderer.java:89`

```java
static <S, D> void submitTransformCopyingModel(class_3879<? super S> sourceModel, S sourceModelState, class_3879<? super D> delegateModel, D delegateModelState, boolean setDelegateAngles, class_11785 queue, class_4587 matrices, class_1921 renderLayer, int light, int overlay, int tintedColor, @Nullable class_1058 sprite, int outlineColor, class_11683.@Nullable class_11792 crumblingOverlay)
```

## net.fabricmc.fabric.api.client.rendering.v1.ArmorRenderer.submitTransformCopyingModel

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/ArmorRenderer.java:112`

```java
static <S, D> void submitTransformCopyingModel(class_3879<? super S> sourceModel, S sourceModelState, class_3879<? super D> delegateModel, D delegateModelState, boolean setDelegateAngles, class_11785 queue, class_4587 matrices, class_1921 renderLayer, int light, int overlay, int outlineColor, class_11683.@Nullable class_11792 crumblingOverlay)
```

## net.fabricmc.fabric.api.client.rendering.v1.ArmorRenderer.render

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/ArmorRenderer.java:127`

```java
void render(class_4587 matrices, class_11659 orderedRenderCommandQueue, class_1799 stack, class_10034 bipedEntityRenderState, class_1304 slot, int light, class_572<class_10034> contextModel)
```

## net.fabricmc.fabric.api.client.rendering.v1.ArmorRenderer.shouldRenderDefaultHeadItem

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/ArmorRenderer.java:145`

```java
default boolean shouldRenderDefaultHeadItem(class_1309 entity, class_1799 stack)
```

## net.fabricmc.fabric.api.client.rendering.v1.ArmorRenderer.Factory

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/ArmorRenderer.java:152`

```java
@FunctionalInterface interface Factory
```

## net.fabricmc.fabric.api.client.rendering.v1.ArmorRenderer.Factory.createArmorRenderer

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/ArmorRenderer.java:154`

```java
ArmorRenderer createArmorRenderer(class_5617.class_5618 context)
```

## net.fabricmc.fabric.api.client.rendering.v1.AtlasSourceRegistry

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/AtlasSourceRegistry.java:27`

```java
public final class AtlasSourceRegistry
```

## net.fabricmc.fabric.api.client.rendering.v1.AtlasSourceRegistry.register

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/AtlasSourceRegistry.java:37`

```java
public static void register(class_2960 id, MapCodec<? extends class_7948> codec)
```

## net.fabricmc.fabric.api.client.rendering.v1.BlockEntityRendererRegistry

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/BlockEntityRendererRegistry.java:34`

```java
@Deprecated public final class BlockEntityRendererRegistry
```

## net.fabricmc.fabric.api.client.rendering.v1.BlockEntityRendererRegistry.register

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/BlockEntityRendererRegistry.java:45`

```java
public static <E extends class_2586, S extends class_11954> void register(class_2591<E> blockEntityType, class_5614<? super E, ? super S> blockEntityRendererFactory)
```

## net.fabricmc.fabric.api.client.rendering.v1.BlockRenderLayerMap

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/BlockRenderLayerMap.java:33`

```java
public final class BlockRenderLayerMap
```

## net.fabricmc.fabric.api.client.rendering.v1.BlockRenderLayerMap.putBlock

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/BlockRenderLayerMap.java:42`

```java
public static void putBlock(class_2248 block, class_11515 layer)
```

## net.fabricmc.fabric.api.client.rendering.v1.BlockRenderLayerMap.putBlocks

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/BlockRenderLayerMap.java:54`

```java
public static void putBlocks(class_11515 layer, class_2248... blocks)
```

## net.fabricmc.fabric.api.client.rendering.v1.BlockRenderLayerMap.putFluid

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/BlockRenderLayerMap.java:68`

```java
public static void putFluid(class_3611 fluid, class_11515 layer)
```

## net.fabricmc.fabric.api.client.rendering.v1.BlockRenderLayerMap.putFluids

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/BlockRenderLayerMap.java:80`

```java
public static void putFluids(class_11515 layer, class_3611... fluids)
```

## net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/ColorProviderRegistry.java:24`

```java
public interface ColorProviderRegistry<T, Provider>
```

## net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry.BLOCK

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/ColorProviderRegistry.java:25`

```java
ColorProviderRegistry<class_2248, class_322> BLOCK = ColorProviderRegistryImpl.BLOCK
```

## net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry.register

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/ColorProviderRegistry.java:33`

```java
@SuppressWarnings("unchecked") // @SafeVarargs is not allowed on interface methods. void register(Provider provider, T... objects)
```

## net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry.get

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/ColorProviderRegistry.java:45`

```java
@Nullable Provider get(T object)
```

## net.fabricmc.fabric.api.client.rendering.v1.ColorResolverRegistry

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/ColorResolverRegistry.java:36`

```java
public final class ColorResolverRegistry
```

## net.fabricmc.fabric.api.client.rendering.v1.ColorResolverRegistry.register

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/ColorResolverRegistry.java:46`

```java
public static void register(class_6539 resolver)
```

## net.fabricmc.fabric.api.client.rendering.v1.ColorResolverRegistry.getAllResolvers

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/ColorResolverRegistry.java:55`

```java
@UnmodifiableView public static Set<class_6539> getAllResolvers()
```

## net.fabricmc.fabric.api.client.rendering.v1.ColorResolverRegistry.getCustomResolvers

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/ColorResolverRegistry.java:65`

```java
@UnmodifiableView public static Set<class_6539> getCustomResolvers()
```

## net.fabricmc.fabric.api.client.rendering.v1.ColorResolverRegistry.isRegistered

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/ColorResolverRegistry.java:76`

```java
public static boolean isRegistered(class_6539 resolver)
```

## net.fabricmc.fabric.api.client.rendering.v1.DrawItemStackOverlayCallback

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/DrawItemStackOverlayCallback.java:25`

```java
@FunctionalInterface public interface DrawItemStackOverlayCallback
```

## net.fabricmc.fabric.api.client.rendering.v1.DrawItemStackOverlayCallback.EVENT

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/DrawItemStackOverlayCallback.java:33`

```java
Event<DrawItemStackOverlayCallback> EVENT = EventFactory.createArrayBacked(DrawItemStackOverlayCallback.class, callbacks -> (context, textRenderer, stack, x, y) -> { for (DrawItemStackOverlayCallback callback : callbacks) { callback.onDrawItemStackOverlay(context, textRenderer, stack, x, y); } })
```

## net.fabricmc.fabric.api.client.rendering.v1.DrawItemStackOverlayCallback.onDrawItemStackOverlay

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/DrawItemStackOverlayCallback.java:47`

```java
void onDrawItemStackOverlay(class_332 context, class_327 textRenderer, class_1799 stack, int x, int y)
```

## net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/EntityModelLayerRegistry.java:29`

```java
public final class EntityModelLayerRegistry
```

## net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry.registerModelLayer

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/EntityModelLayerRegistry.java:36`

```java
public static void registerModelLayer(class_5601 modelLayer, TexturedModelDataProvider provider)
```

## net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry.registerEquipmentModelLayers

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/EntityModelLayerRegistry.java:52`

```java
public static void registerEquipmentModelLayers(class_11677<class_5601> equipmentModelData, TexturedEquipmentModelDataProvider provider)
```

## net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry.TexturedModelDataProvider

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/EntityModelLayerRegistry.java:66`

```java
@FunctionalInterface public interface TexturedModelDataProvider
```

## net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry.TexturedModelDataProvider.createModelData

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/EntityModelLayerRegistry.java:73`

```java
class_5607 createModelData()
```

## net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry.TexturedEquipmentModelDataProvider

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/EntityModelLayerRegistry.java:76`

```java
@FunctionalInterface public interface TexturedEquipmentModelDataProvider
```

## net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry.TexturedEquipmentModelDataProvider.createEquipmentModelData

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/EntityModelLayerRegistry.java:83`

```java
class_11677<class_5607> createEquipmentModelData()
```

## net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/EntityRendererRegistry.java:33`

```java
@Deprecated public final class EntityRendererRegistry
```

## net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry.register

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/EntityRendererRegistry.java:44`

```java
public static <E extends class_1297> void register(class_1299<? extends E> entityType, class_5617<E> entityRendererFactory)
```

## net.fabricmc.fabric.api.client.rendering.v1.FabricModel

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/FabricModel.java:29`

```java
@ApiStatus.NonExtendable public interface FabricModel<S>
```

## net.fabricmc.fabric.api.client.rendering.v1.FabricModel.getChildPart

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/FabricModel.java:36`

```java
@Nullable default class_630 getChildPart(String name)
```

## net.fabricmc.fabric.api.client.rendering.v1.FabricModel.copyTransforms

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/FabricModel.java:45`

```java
default void copyTransforms(class_3879<?> model)
```

## net.fabricmc.fabric.api.client.rendering.v1.FabricRenderPipeline

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/FabricRenderPipeline.java:28`

```java
public interface FabricRenderPipeline
```

## net.fabricmc.fabric.api.client.rendering.v1.FabricRenderPipeline.usePipelineDrawModeForGui

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/FabricRenderPipeline.java:34`

```java
default boolean usePipelineDrawModeForGui()
```

## net.fabricmc.fabric.api.client.rendering.v1.FabricRenderPipeline.Builder

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/FabricRenderPipeline.java:43`

```java
interface Builder
```

## net.fabricmc.fabric.api.client.rendering.v1.FabricRenderPipeline.Builder.withUsePipelineDrawModeForGui

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/FabricRenderPipeline.java:50`

```java
default RenderPipeline.Builder withUsePipelineDrawModeForGui(boolean usePipelineDrawMode)
```

## net.fabricmc.fabric.api.client.rendering.v1.FabricRenderPipeline.Builder.withoutUsePipelineDrawModeForGui

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/FabricRenderPipeline.java:59`

```java
default RenderPipeline.Builder withoutUsePipelineDrawModeForGui()
```

## net.fabricmc.fabric.api.client.rendering.v1.FabricRenderPipeline.Snippet

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/FabricRenderPipeline.java:69`

```java
interface Snippet
```

## net.fabricmc.fabric.api.client.rendering.v1.FabricRenderPipeline.Snippet.usePipelineDrawModeForGui

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/FabricRenderPipeline.java:75`

```java
default Optional<Boolean> usePipelineDrawModeForGui()
```

## net.fabricmc.fabric.api.client.rendering.v1.FabricRenderPipeline.Snippet.withPipelineDrawModeForGui

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/FabricRenderPipeline.java:85`

```java
static RenderPipeline.Snippet withPipelineDrawModeForGui(RenderPipeline.Snippet base, boolean usePipelineDrawMode)
```

## net.fabricmc.fabric.api.client.rendering.v1.FabricRenderPipeline.Snippet.withoutPipelineDrawModeForGui

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/FabricRenderPipeline.java:94`

```java
static RenderPipeline.Snippet withoutPipelineDrawModeForGui(RenderPipeline.Snippet base)
```

## net.fabricmc.fabric.api.client.rendering.v1.FabricRenderState

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/FabricRenderState.java:51`

```java
@ApiStatus.NonExtendable public interface FabricRenderState
```

## net.fabricmc.fabric.api.client.rendering.v1.FabricRenderState.getData

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/FabricRenderState.java:59`

```java
@Nullable default <T> T getData(RenderStateDataKey<T> key)
```

## net.fabricmc.fabric.api.client.rendering.v1.FabricRenderState.getDataOrDefault

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/FabricRenderState.java:71`

```java
default <T> T getDataOrDefault(RenderStateDataKey<T> key, T defaultValue)
```

## net.fabricmc.fabric.api.client.rendering.v1.FabricRenderState.setData

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/FabricRenderState.java:81`

```java
default <T> void setData(RenderStateDataKey<T> key, @Nullable T value)
```

## net.fabricmc.fabric.api.client.rendering.v1.FabricRenderState.clearExtraData

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/FabricRenderState.java:88`

```java
default void clearExtraData()
```

## net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/HudRenderCallback.java:28`

```java
@Deprecated public interface HudRenderCallback
```

## net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback.EVENT

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/HudRenderCallback.java:30`

```java
Event<HudRenderCallback> EVENT = EventFactory.createArrayBacked(HudRenderCallback.class, (listeners) -> (context, tickCounter) -> { for (HudRenderCallback event : listeners) { event.onHudRender(context, tickCounter); } })
```

## net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback.onHudRender

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/HudRenderCallback.java:42`

```java
void onHudRender(class_332 drawContext, class_9779 tickCounter)
```

## net.fabricmc.fabric.api.client.rendering.v1.InvalidateRenderStateCallback

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/InvalidateRenderStateCallback.java:31`

```java
public interface InvalidateRenderStateCallback
```

## net.fabricmc.fabric.api.client.rendering.v1.InvalidateRenderStateCallback.EVENT

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/InvalidateRenderStateCallback.java:32`

```java
Event<InvalidateRenderStateCallback> EVENT = EventFactory.createArrayBacked(InvalidateRenderStateCallback.class, (listeners) -> () -> { for (InvalidateRenderStateCallback event : listeners) { event.onInvalidate(); } } )
```

## net.fabricmc.fabric.api.client.rendering.v1.InvalidateRenderStateCallback.onInvalidate

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/InvalidateRenderStateCallback.java:40`

```java
void onInvalidate()
```

## net.fabricmc.fabric.api.client.rendering.v1.LivingEntityFeatureRenderEvents

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/LivingEntityFeatureRenderEvents.java:28`

```java
public final class LivingEntityFeatureRenderEvents
```

## net.fabricmc.fabric.api.client.rendering.v1.LivingEntityFeatureRenderEvents.ALLOW_CAPE_RENDER

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/LivingEntityFeatureRenderEvents.java:32`

```java
public static final Event<AllowCapeRender> ALLOW_CAPE_RENDER = EventFactory.createArrayBacked(AllowCapeRender.class, listeners -> state -> { for (AllowCapeRender listener : listeners) { if (!listener.allowCapeRender(state)) { return false; } } return true; })
```

## net.fabricmc.fabric.api.client.rendering.v1.LivingEntityFeatureRenderEvents.AllowCapeRender

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/LivingEntityFeatureRenderEvents.java:42`

```java
@FunctionalInterface public interface AllowCapeRender
```

## net.fabricmc.fabric.api.client.rendering.v1.LivingEntityFeatureRenderEvents.AllowCapeRender.allowCapeRender

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/LivingEntityFeatureRenderEvents.java:47`

```java
boolean allowCapeRender(class_10055 state)
```

## net.fabricmc.fabric.api.client.rendering.v1.LivingEntityFeatureRendererRegistrationCallback

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/LivingEntityFeatureRendererRegistrationCallback.java:48`

```java
@FunctionalInterface public interface LivingEntityFeatureRendererRegistrationCallback
```

## net.fabricmc.fabric.api.client.rendering.v1.LivingEntityFeatureRendererRegistrationCallback.EVENT

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/LivingEntityFeatureRendererRegistrationCallback.java:50`

```java
Event<LivingEntityFeatureRendererRegistrationCallback> EVENT = EventFactory.createArrayBacked(LivingEntityFeatureRendererRegistrationCallback.class, callbacks -> (entityType, entityRenderer, registrationHelper, context) -> { for (LivingEntityFeatureRendererRegistrationCallback callback : callbacks) { callback.registerRenderers(entityType, entityRenderer, registrationHelper, context); } })
```

## net.fabricmc.fabric.api.client.rendering.v1.LivingEntityFeatureRendererRegistrationCallback.registerRenderers

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/LivingEntityFeatureRendererRegistrationCallback.java:62`

```java
void registerRenderers(class_1299<? extends class_1309> entityType, class_922<?, ?, ?> entityRenderer, RegistrationHelper registrationHelper, class_5617.class_5618 context)
```

## net.fabricmc.fabric.api.client.rendering.v1.LivingEntityFeatureRendererRegistrationCallback.RegistrationHelper

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/LivingEntityFeatureRendererRegistrationCallback.java:69`

```java
@ApiStatus.NonExtendable interface RegistrationHelper
```

## net.fabricmc.fabric.api.client.rendering.v1.LivingEntityFeatureRendererRegistrationCallback.RegistrationHelper.register

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/LivingEntityFeatureRendererRegistrationCallback.java:77`

```java
<T extends class_10017> void register(class_3887<T, ? extends class_583<T>> featureRenderer)
```

## net.fabricmc.fabric.api.client.rendering.v1.RenderStateDataKey

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/RenderStateDataKey.java:27`

```java
public final class RenderStateDataKey<T>
```

## net.fabricmc.fabric.api.client.rendering.v1.RenderStateDataKey.create

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/RenderStateDataKey.java:40`

```java
public static <T> RenderStateDataKey<T> create(Supplier<String> debugName)
```

## net.fabricmc.fabric.api.client.rendering.v1.RenderStateDataKey.create

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/RenderStateDataKey.java:49`

```java
public static <T> RenderStateDataKey<T> create()
```

## net.fabricmc.fabric.api.client.rendering.v1.RenderStateDataKey.toString

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/RenderStateDataKey.java:53`

```java
@Override public String toString()
```

## net.fabricmc.fabric.api.client.rendering.v1.SpecialBlockRendererRegistry

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/SpecialBlockRendererRegistry.java:31`

```java
public final class SpecialBlockRendererRegistry
```

## net.fabricmc.fabric.api.client.rendering.v1.SpecialBlockRendererRegistry.register

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/SpecialBlockRendererRegistry.java:39`

```java
public static void register(class_2248 block, class_10515.class_10516 unbakedRenderer)
```

## net.fabricmc.fabric.api.client.rendering.v1.SpecialGuiElementRegistry

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/SpecialGuiElementRegistry.java:35`

```java
public final class SpecialGuiElementRegistry
```

## net.fabricmc.fabric.api.client.rendering.v1.SpecialGuiElementRegistry.register

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/SpecialGuiElementRegistry.java:39`

```java
public static void register(Factory factory)
```

## net.fabricmc.fabric.api.client.rendering.v1.SpecialGuiElementRegistry.Factory

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/SpecialGuiElementRegistry.java:47`

```java
@FunctionalInterface public interface Factory
```

## net.fabricmc.fabric.api.client.rendering.v1.SpecialGuiElementRegistry.Factory.createSpecialRenderer

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/SpecialGuiElementRegistry.java:49`

```java
class_11239<?> createSpecialRenderer(Context ctx)
```

## net.fabricmc.fabric.api.client.rendering.v1.SpecialGuiElementRegistry.Context

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/SpecialGuiElementRegistry.java:52`

```java
@ApiStatus.NonExtendable public interface Context
```

## net.fabricmc.fabric.api.client.rendering.v1.SpecialGuiElementRegistry.Context.vertexConsumers

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/SpecialGuiElementRegistry.java:57`

```java
class_4597.class_4598 vertexConsumers()
```

## net.fabricmc.fabric.api.client.rendering.v1.SpecialGuiElementRegistry.Context.client

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/SpecialGuiElementRegistry.java:62`

```java
class_310 client()
```

## net.fabricmc.fabric.api.client.rendering.v1.SpecialGuiElementRegistry.Context.orderedRenderCommandQueue

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/SpecialGuiElementRegistry.java:67`

```java
class_11659 orderedRenderCommandQueue()
```

## net.fabricmc.fabric.api.client.rendering.v1.TooltipComponentCallback

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/TooltipComponentCallback.java:34`

```java
public interface TooltipComponentCallback
```

## net.fabricmc.fabric.api.client.rendering.v1.TooltipComponentCallback.EVENT

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/TooltipComponentCallback.java:35`

```java
Event<TooltipComponentCallback> EVENT = EventFactory.createArrayBacked(TooltipComponentCallback.class, listeners -> data -> { for (TooltipComponentCallback listener : listeners) { class_5684 component = listener.getComponent(data); if (component != null) { return component; } } return null; })
```

## net.fabricmc.fabric.api.client.rendering.v1.TooltipComponentCallback.getComponent

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/TooltipComponentCallback.java:50`

```java
@Nullable class_5684 getComponent(class_5632 data)
```

## net.fabricmc.fabric.api.client.rendering.v1.TransformCopyingModel

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/TransformCopyingModel.java:29`

```java
public final class TransformCopyingModel<S, D> extends class_3879<Pair<S, D>>
```

## net.fabricmc.fabric.api.client.rendering.v1.TransformCopyingModel.create

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/TransformCopyingModel.java:40`

```java
public static <S, D> TransformCopyingModel<S, D> create(class_3879<? super S> source, class_3879<? super D> delegate, boolean setDelegateAngles)
```

## net.fabricmc.fabric.api.client.rendering.v1.TransformCopyingModel.setupAnim

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/TransformCopyingModel.java:51`

```java
@Override public void setupAnim(Pair<S, D> state)
```

## net.fabricmc.fabric.api.client.rendering.v1.hud.HudElement

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/hud/HudElement.java:28`

```java
public interface HudElement
```

## net.fabricmc.fabric.api.client.rendering.v1.hud.HudElement.render

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/hud/HudElement.java:35`

```java
void render(class_332 context, class_9779 tickCounter)
```

## net.fabricmc.fabric.api.client.rendering.v1.hud.HudElementRegistry

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/hud/HudElementRegistry.java:71`

```java
public interface HudElementRegistry
```

## net.fabricmc.fabric.api.client.rendering.v1.hud.HudElementRegistry.addFirst

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/hud/HudElementRegistry.java:77`

```java
static void addFirst(class_2960 id, HudElement element)
```

## net.fabricmc.fabric.api.client.rendering.v1.hud.HudElementRegistry.addLast

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/hud/HudElementRegistry.java:88`

```java
static void addLast(class_2960 id, HudElement element)
```

## net.fabricmc.fabric.api.client.rendering.v1.hud.HudElementRegistry.attachElementBefore

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/hud/HudElementRegistry.java:103`

```java
static void attachElementBefore(class_2960 beforeThis, class_2960 identifier, HudElement element)
```

## net.fabricmc.fabric.api.client.rendering.v1.hud.HudElementRegistry.attachElementAfter

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/hud/HudElementRegistry.java:119`

```java
static void attachElementAfter(class_2960 afterThis, class_2960 identifier, HudElement element)
```

## net.fabricmc.fabric.api.client.rendering.v1.hud.HudElementRegistry.removeElement

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/hud/HudElementRegistry.java:131`

```java
static void removeElement(class_2960 identifier)
```

## net.fabricmc.fabric.api.client.rendering.v1.hud.HudElementRegistry.replaceElement

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/hud/HudElementRegistry.java:148`

```java
static void replaceElement(class_2960 identifier, Function<HudElement, HudElement> replacer)
```

## net.fabricmc.fabric.api.client.rendering.v1.hud.HudStatusBarHeightRegistry

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/hud/HudStatusBarHeightRegistry.java:51`

```java
public final class HudStatusBarHeightRegistry
```

## net.fabricmc.fabric.api.client.rendering.v1.hud.HudStatusBarHeightRegistry.addLeft

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/hud/HudStatusBarHeightRegistry.java:74`

```java
public static void addLeft(class_2960 id, StatusBarHeightProvider heightProvider)
```

## net.fabricmc.fabric.api.client.rendering.v1.hud.HudStatusBarHeightRegistry.addRight

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/hud/HudStatusBarHeightRegistry.java:102`

```java
public static void addRight(class_2960 id, StatusBarHeightProvider heightProvider)
```

## net.fabricmc.fabric.api.client.rendering.v1.hud.HudStatusBarHeightRegistry.getHeight

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/hud/HudStatusBarHeightRegistry.java:125`

```java
public static int getHeight(class_2960 id)
```

## net.fabricmc.fabric.api.client.rendering.v1.hud.StatusBarHeightProvider

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/hud/StatusBarHeightProvider.java:29`

```java
@FunctionalInterface public interface StatusBarHeightProvider extends ToIntFunction<class_1657>
```

## net.fabricmc.fabric.api.client.rendering.v1.hud.StatusBarHeightProvider.getStatusBarHeight

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/hud/StatusBarHeightProvider.java:35`

```java
int getStatusBarHeight(class_1657 player)
```

## net.fabricmc.fabric.api.client.rendering.v1.hud.StatusBarHeightProvider.applyAsInt

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/hud/StatusBarHeightProvider.java:37`

```java
@ApiStatus.NonExtendable @Override default int applyAsInt(class_1657 player)
```

## net.fabricmc.fabric.api.client.rendering.v1.hud.VanillaHudElements

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/hud/VanillaHudElements.java:32`

```java
public final class VanillaHudElements
```

## net.fabricmc.fabric.api.client.rendering.v1.hud.VanillaHudElements.MISC_OVERLAYS

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/hud/VanillaHudElements.java:36`

```java
public static final class_2960 MISC_OVERLAYS = class_2960.method_60656("misc_overlays")
```

## net.fabricmc.fabric.api.client.rendering.v1.hud.VanillaHudElements.CROSSHAIR

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/hud/VanillaHudElements.java:40`

```java
public static final class_2960 CROSSHAIR = class_2960.method_60656("crosshair")
```

## net.fabricmc.fabric.api.client.rendering.v1.hud.VanillaHudElements.SPECTATOR_MENU

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/hud/VanillaHudElements.java:44`

```java
public static final class_2960 SPECTATOR_MENU = class_2960.method_60656("spectator_menu")
```

## net.fabricmc.fabric.api.client.rendering.v1.hud.VanillaHudElements.HOTBAR

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/hud/VanillaHudElements.java:48`

```java
public static final class_2960 HOTBAR = class_2960.method_60656("hotbar")
```

## net.fabricmc.fabric.api.client.rendering.v1.hud.VanillaHudElements.ARMOR_BAR

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/hud/VanillaHudElements.java:52`

```java
public static final class_2960 ARMOR_BAR = class_2960.method_60656("armor_bar")
```

## net.fabricmc.fabric.api.client.rendering.v1.hud.VanillaHudElements.HEALTH_BAR

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/hud/VanillaHudElements.java:56`

```java
public static final class_2960 HEALTH_BAR = class_2960.method_60656("health_bar")
```

## net.fabricmc.fabric.api.client.rendering.v1.hud.VanillaHudElements.FOOD_BAR

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/hud/VanillaHudElements.java:60`

```java
public static final class_2960 FOOD_BAR = class_2960.method_60656("food_bar")
```

## net.fabricmc.fabric.api.client.rendering.v1.hud.VanillaHudElements.AIR_BAR

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/hud/VanillaHudElements.java:64`

```java
public static final class_2960 AIR_BAR = class_2960.method_60656("air_bar")
```

## net.fabricmc.fabric.api.client.rendering.v1.hud.VanillaHudElements.MOUNT_HEALTH

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/hud/VanillaHudElements.java:68`

```java
public static final class_2960 MOUNT_HEALTH = class_2960.method_60656("mount_health")
```

## net.fabricmc.fabric.api.client.rendering.v1.hud.VanillaHudElements.INFO_BAR

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/hud/VanillaHudElements.java:72`

```java
public static final class_2960 INFO_BAR = class_2960.method_60656("info_bar")
```

## net.fabricmc.fabric.api.client.rendering.v1.hud.VanillaHudElements.EXPERIENCE_LEVEL

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/hud/VanillaHudElements.java:76`

```java
public static final class_2960 EXPERIENCE_LEVEL = class_2960.method_60656("experience_level")
```

## net.fabricmc.fabric.api.client.rendering.v1.hud.VanillaHudElements.HELD_ITEM_TOOLTIP

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/hud/VanillaHudElements.java:80`

```java
public static final class_2960 HELD_ITEM_TOOLTIP = class_2960.method_60656("held_item_tooltip")
```

## net.fabricmc.fabric.api.client.rendering.v1.hud.VanillaHudElements.SPECTATOR_TOOLTIP

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/hud/VanillaHudElements.java:84`

```java
public static final class_2960 SPECTATOR_TOOLTIP = class_2960.method_60656("spectator_tooltip")
```

## net.fabricmc.fabric.api.client.rendering.v1.hud.VanillaHudElements.STATUS_EFFECTS

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/hud/VanillaHudElements.java:88`

```java
public static final class_2960 STATUS_EFFECTS = class_2960.method_60656("status_effects")
```

## net.fabricmc.fabric.api.client.rendering.v1.hud.VanillaHudElements.BOSS_BAR

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/hud/VanillaHudElements.java:92`

```java
public static final class_2960 BOSS_BAR = class_2960.method_60656("boss_bar")
```

## net.fabricmc.fabric.api.client.rendering.v1.hud.VanillaHudElements.SLEEP

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/hud/VanillaHudElements.java:96`

```java
public static final class_2960 SLEEP = class_2960.method_60656("sleep")
```

## net.fabricmc.fabric.api.client.rendering.v1.hud.VanillaHudElements.DEMO_TIMER

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/hud/VanillaHudElements.java:100`

```java
public static final class_2960 DEMO_TIMER = class_2960.method_60656("demo_timer")
```

## net.fabricmc.fabric.api.client.rendering.v1.hud.VanillaHudElements.SCOREBOARD

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/hud/VanillaHudElements.java:104`

```java
public static final class_2960 SCOREBOARD = class_2960.method_60656("scoreboard")
```

## net.fabricmc.fabric.api.client.rendering.v1.hud.VanillaHudElements.OVERLAY_MESSAGE

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/hud/VanillaHudElements.java:108`

```java
public static final class_2960 OVERLAY_MESSAGE = class_2960.method_60656("overlay_message")
```

## net.fabricmc.fabric.api.client.rendering.v1.hud.VanillaHudElements.TITLE_AND_SUBTITLE

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/hud/VanillaHudElements.java:114`

```java
public static final class_2960 TITLE_AND_SUBTITLE = class_2960.method_60656("title_and_subtitle")
```

## net.fabricmc.fabric.api.client.rendering.v1.hud.VanillaHudElements.CHAT

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/hud/VanillaHudElements.java:118`

```java
public static final class_2960 CHAT = class_2960.method_60656("chat")
```

## net.fabricmc.fabric.api.client.rendering.v1.hud.VanillaHudElements.PLAYER_LIST

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/hud/VanillaHudElements.java:122`

```java
public static final class_2960 PLAYER_LIST = class_2960.method_60656("player_list")
```

## net.fabricmc.fabric.api.client.rendering.v1.hud.VanillaHudElements.SUBTITLES

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/hud/VanillaHudElements.java:126`

```java
public static final class_2960 SUBTITLES = class_2960.method_60656("subtitles")
```

## net.fabricmc.fabric.api.client.rendering.v1.world.AbstractWorldRenderContext

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/world/AbstractWorldRenderContext.java:24`

```java
@ApiStatus.NonExtendable public interface AbstractWorldRenderContext
```

## net.fabricmc.fabric.api.client.rendering.v1.world.AbstractWorldRenderContext.gameRenderer

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/world/AbstractWorldRenderContext.java:31`

```java
class_757 gameRenderer()
```

## net.fabricmc.fabric.api.client.rendering.v1.world.AbstractWorldRenderContext.worldRenderer

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/world/AbstractWorldRenderContext.java:38`

```java
class_761 worldRenderer()
```

## net.fabricmc.fabric.api.client.rendering.v1.world.AbstractWorldRenderContext.worldState

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/world/AbstractWorldRenderContext.java:48`

```java
class_11658 worldState()
```

## net.fabricmc.fabric.api.client.rendering.v1.world.WorldExtractionContext

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/world/WorldExtractionContext.java:27`

```java
@ApiStatus.NonExtendable public interface WorldExtractionContext extends AbstractWorldRenderContext
```

## net.fabricmc.fabric.api.client.rendering.v1.world.WorldExtractionContext.world

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/world/WorldExtractionContext.java:34`

```java
@SuppressWarnings("JavadocReference") class_638 world()
```

## net.fabricmc.fabric.api.client.rendering.v1.world.WorldExtractionContext.camera

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/world/WorldExtractionContext.java:37`

```java
class_4184 camera()
```

## net.fabricmc.fabric.api.client.rendering.v1.world.WorldExtractionContext.frustum

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/world/WorldExtractionContext.java:39`

```java
class_4604 frustum()
```

## net.fabricmc.fabric.api.client.rendering.v1.world.WorldExtractionContext.tickCounter

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/world/WorldExtractionContext.java:41`

```java
class_9779 tickCounter()
```

## net.fabricmc.fabric.api.client.rendering.v1.world.WorldExtractionContext.viewMatrix

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/world/WorldExtractionContext.java:43`

```java
Matrix4fc viewMatrix()
```

## net.fabricmc.fabric.api.client.rendering.v1.world.WorldExtractionContext.cullProjectionMatrix

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/world/WorldExtractionContext.java:45`

```java
Matrix4fc cullProjectionMatrix()
```

## net.fabricmc.fabric.api.client.rendering.v1.world.WorldExtractionContext.blockOutlines

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/world/WorldExtractionContext.java:47`

```java
boolean blockOutlines()
```

## net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderContext

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/world/WorldRenderContext.java:24`

```java
@ApiStatus.NonExtendable public interface WorldRenderContext extends WorldTerrainRenderContext
```

## net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderContext.commandQueue

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/world/WorldRenderContext.java:26`

```java
class_11659 commandQueue()
```

## net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderContext.matrices

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/world/WorldRenderContext.java:28`

```java
class_4587 matrices()
```

## net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderContext.consumers

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/world/WorldRenderContext.java:42`

```java
class_4597 consumers()
```

## net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderEvents

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/world/WorldRenderEvents.java:39`

```java
public final class WorldRenderEvents
```

## net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderEvents.AFTER_BLOCK_OUTLINE_EXTRACTION

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/world/WorldRenderEvents.java:68`

```java
public static final Event<AfterBlockOutlineExtraction> AFTER_BLOCK_OUTLINE_EXTRACTION = EventFactory.createArrayBacked(AfterBlockOutlineExtraction.class, callbacks -> (context, hit) -> { for (final AfterBlockOutlineExtraction callback : callbacks) { callback.afterBlockOutlineExtraction(context, hit); } })
```

## net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderEvents.END_EXTRACTION

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/world/WorldRenderEvents.java:81`

```java
public static final Event<EndExtraction> END_EXTRACTION = EventFactory.createArrayBacked(EndExtraction.class, callbacks -> context -> { for (final EndExtraction callback : callbacks) { callback.endExtraction(context); } })
```

## net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderEvents.START_MAIN

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/world/WorldRenderEvents.java:91`

```java
public static final Event<StartMain> START_MAIN = EventFactory.createArrayBacked(StartMain.class, callbacks -> context -> { for (final StartMain callback : callbacks) { callback.startMain(context); } })
```

## net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderEvents.BEFORE_ENTITIES

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/world/WorldRenderEvents.java:119`

```java
public static final Event<BeforeEntities> BEFORE_ENTITIES = EventFactory.createArrayBacked(BeforeEntities.class, callbacks -> context -> { for (final BeforeEntities callback : callbacks) { callback.beforeEntities(context); } })
```

## net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderEvents.AFTER_ENTITIES

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/world/WorldRenderEvents.java:128`

```java
public static final Event<AfterEntities> AFTER_ENTITIES = EventFactory.createArrayBacked(AfterEntities.class, callbacks -> context -> { for (final AfterEntities callback : callbacks) { callback.afterEntities(context); } })
```

## net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderEvents.BEFORE_DEBUG_RENDER

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/world/WorldRenderEvents.java:140`

```java
public static final Event<DebugRender> BEFORE_DEBUG_RENDER = EventFactory.createArrayBacked(DebugRender.class, callbacks -> context -> { for (final DebugRender callback : callbacks) { callback.beforeDebugRender(context); } })
```

## net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderEvents.BEFORE_TRANSLUCENT

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/world/WorldRenderEvents.java:154`

```java
public static final Event<BeforeTranslucent> BEFORE_TRANSLUCENT = EventFactory.createArrayBacked(BeforeTranslucent.class, callbacks -> context -> { for (final BeforeTranslucent callback : callbacks) { callback.beforeTranslucent(context); } })
```

## net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderEvents.BEFORE_BLOCK_OUTLINE

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/world/WorldRenderEvents.java:177`

```java
public static final Event<BeforeBlockOutline> BEFORE_BLOCK_OUTLINE = EventFactory.createArrayBacked(BeforeBlockOutline.class, callbacks -> (context, outlineRenderState) -> { boolean shouldRender = true; for (final BeforeBlockOutline callback : callbacks) { if (!callback.beforeBlockOutline(context, outlineRenderState)) { shouldRender = false; } } return shouldRender; })
```

## net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderEvents.END_MAIN

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/world/WorldRenderEvents.java:196`

```java
public static final Event<EndMain> END_MAIN = EventFactory.createArrayBacked(EndMain.class, callbacks -> context -> { for (final EndMain callback : callbacks) { callback.endMain(context); } })
```

## net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderEvents.AfterBlockOutlineExtraction

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/world/WorldRenderEvents.java:202`

```java
@FunctionalInterface public interface AfterBlockOutlineExtraction
```

## net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderEvents.AfterBlockOutlineExtraction.afterBlockOutlineExtraction

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/world/WorldRenderEvents.java:204`

```java
void afterBlockOutlineExtraction(WorldExtractionContext context, @Nullable class_239 result)
```

## net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderEvents.EndExtraction

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/world/WorldRenderEvents.java:207`

```java
@FunctionalInterface public interface EndExtraction
```

## net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderEvents.EndExtraction.endExtraction

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/world/WorldRenderEvents.java:209`

```java
void endExtraction(WorldExtractionContext context)
```

## net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderEvents.StartMain

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/world/WorldRenderEvents.java:212`

```java
@FunctionalInterface public interface StartMain
```

## net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderEvents.StartMain.startMain

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/world/WorldRenderEvents.java:214`

```java
void startMain(WorldTerrainRenderContext context)
```

## net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderEvents.BeforeEntities

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/world/WorldRenderEvents.java:217`

```java
@FunctionalInterface public interface BeforeEntities
```

## net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderEvents.BeforeEntities.beforeEntities

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/world/WorldRenderEvents.java:219`

```java
void beforeEntities(WorldRenderContext context)
```

## net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderEvents.AfterEntities

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/world/WorldRenderEvents.java:222`

```java
@FunctionalInterface public interface AfterEntities
```

## net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderEvents.AfterEntities.afterEntities

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/world/WorldRenderEvents.java:224`

```java
void afterEntities(WorldRenderContext context)
```

## net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderEvents.DebugRender

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/world/WorldRenderEvents.java:227`

```java
@FunctionalInterface public interface DebugRender
```

## net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderEvents.DebugRender.beforeDebugRender

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/world/WorldRenderEvents.java:229`

```java
void beforeDebugRender(WorldRenderContext context)
```

## net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderEvents.BeforeTranslucent

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/world/WorldRenderEvents.java:232`

```java
@FunctionalInterface public interface BeforeTranslucent
```

## net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderEvents.BeforeTranslucent.beforeTranslucent

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/world/WorldRenderEvents.java:234`

```java
void beforeTranslucent(WorldRenderContext context)
```

## net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderEvents.BeforeBlockOutline

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/world/WorldRenderEvents.java:237`

```java
@FunctionalInterface public interface BeforeBlockOutline
```

## net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderEvents.BeforeBlockOutline.beforeBlockOutline

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/world/WorldRenderEvents.java:239`

```java
boolean beforeBlockOutline(WorldRenderContext context, class_12074 outlineRenderState)
```

## net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderEvents.EndMain

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/world/WorldRenderEvents.java:242`

```java
@FunctionalInterface public interface EndMain
```

## net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderEvents.EndMain.endMain

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/world/WorldRenderEvents.java:244`

```java
void endMain(WorldRenderContext context)
```

## net.fabricmc.fabric.api.client.rendering.v1.world.WorldTerrainRenderContext

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/world/WorldTerrainRenderContext.java:22`

```java
@ApiStatus.NonExtendable public interface WorldTerrainRenderContext extends AbstractWorldRenderContext
```

## net.fabricmc.fabric.api.client.rendering.v1.world.WorldTerrainRenderContext.sectionState

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/world/WorldTerrainRenderContext.java:30`

```java
class_11532 sectionState()
```

## net.fabricmc.fabric.impl.client.rendering.ArmorRendererRegistryImpl

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/impl/client/rendering/ArmorRendererRegistryImpl.java:29`

```java
public class ArmorRendererRegistryImpl
```

## net.fabricmc.fabric.impl.client.rendering.ArmorRendererRegistryImpl.register

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/impl/client/rendering/ArmorRendererRegistryImpl.java:33`

```java
public static void register(ArmorRenderer.Factory factory, class_1935... items)
```

## net.fabricmc.fabric.impl.client.rendering.ArmorRendererRegistryImpl.register

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/impl/client/rendering/ArmorRendererRegistryImpl.java:49`

```java
public static void register(ArmorRenderer renderer, class_1935... items)
```

## net.fabricmc.fabric.impl.client.rendering.ArmorRendererRegistryImpl.get

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/impl/client/rendering/ArmorRendererRegistryImpl.java:54`

```java
@Nullable public static ArmorRenderer get(class_1792 item)
```

## net.fabricmc.fabric.impl.client.rendering.ArmorRendererRegistryImpl.createArmorRenderers

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/impl/client/rendering/ArmorRendererRegistryImpl.java:59`

```java
public static void createArmorRenderers(class_5617.class_5618 context)
```

## net.fabricmc.fabric.impl.client.rendering.AtlasSourceRegistryImpl

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/impl/client/rendering/AtlasSourceRegistryImpl.java:26`

```java
public final class AtlasSourceRegistryImpl
```

## net.fabricmc.fabric.impl.client.rendering.AtlasSourceRegistryImpl.register

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/impl/client/rendering/AtlasSourceRegistryImpl.java:30`

```java
public static void register(class_2960 id, MapCodec<? extends class_7948> codec)
```

## net.fabricmc.fabric.impl.client.rendering.BlockEntityRendererRegistryImpl

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/impl/client/rendering/BlockEntityRendererRegistryImpl.java:26`

```java
public final class BlockEntityRendererRegistryImpl
```

## net.fabricmc.fabric.impl.client.rendering.BlockEntityRendererRegistryImpl.register

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/impl/client/rendering/BlockEntityRendererRegistryImpl.java:30`

```java
public static <E extends class_2586, S extends class_11954> void register(class_2591<E> blockEntityType, class_5614<? super E, ? super S> blockEntityRendererFactory)
```

## net.fabricmc.fabric.impl.client.rendering.BlockEntityRendererRegistryImpl.setup

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/impl/client/rendering/BlockEntityRendererRegistryImpl.java:34`

```java
public static void setup(BiConsumer<class_2591<?>, class_5614<?, ?>> vanillaHandler)
```

## net.fabricmc.fabric.impl.client.rendering.BlockRenderLayerMapImpl

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/impl/client/rendering/BlockRenderLayerMapImpl.java:27`

```java
public final class BlockRenderLayerMapImpl
```

## net.fabricmc.fabric.impl.client.rendering.BlockRenderLayerMapImpl.putBlock

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/impl/client/rendering/BlockRenderLayerMapImpl.java:35`

```java
public static void putBlock(class_2248 block, class_11515 layer)
```

## net.fabricmc.fabric.impl.client.rendering.BlockRenderLayerMapImpl.putFluid

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/impl/client/rendering/BlockRenderLayerMapImpl.java:42`

```java
public static void putFluid(class_3611 fluid, class_11515 layer)
```

## net.fabricmc.fabric.impl.client.rendering.BlockRenderLayerMapImpl.setup

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/impl/client/rendering/BlockRenderLayerMapImpl.java:49`

```java
public static void setup(BiConsumer<class_2248, class_11515> vanillaBlockHandler, BiConsumer<class_3611, class_11515> vanillaFluidHandler)
```

## net.fabricmc.fabric.impl.client.rendering.ColorProviderRegistryImpl

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/impl/client/rendering/ColorProviderRegistryImpl.java:26`

```java
public abstract class ColorProviderRegistryImpl<T, Provider, Underlying> implements ColorProviderRegistry<T, Provider>
```

## net.fabricmc.fabric.impl.client.rendering.ColorProviderRegistryImpl.BLOCK

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/impl/client/rendering/ColorProviderRegistryImpl.java:27`

```java
public static final ColorProviderRegistryImpl<class_2248, class_322, class_324> BLOCK = new ColorProviderRegistryImpl<class_2248, class_322, class_324>() { @Override void registerUnderlying(class_324 map, class_322 mapper, class_2248 block) { map.method_1690(mapper, block); } }
```

## net.fabricmc.fabric.impl.client.rendering.ColorProviderRegistryImpl.initialize

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/impl/client/rendering/ColorProviderRegistryImpl.java:39`

```java
public void initialize(Underlying colorMap)
```

## net.fabricmc.fabric.impl.client.rendering.ColorProviderRegistryImpl.register

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/impl/client/rendering/ColorProviderRegistryImpl.java:54`

```java
@Override @SafeVarargs public final void register(Provider provider, T... objects)
```

## net.fabricmc.fabric.impl.client.rendering.ColorProviderRegistryImpl.get

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/impl/client/rendering/ColorProviderRegistryImpl.java:64`

```java
@Override @SuppressWarnings("unchecked") public Provider get(T object)
```

## net.fabricmc.fabric.impl.client.rendering.ColorProviderRegistryImpl.ColorMapperHolder

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/impl/client/rendering/ColorProviderRegistryImpl.java:70`

```java
public interface ColorMapperHolder<T, Provider>
```

## net.fabricmc.fabric.impl.client.rendering.ColorProviderRegistryImpl.ColorMapperHolder.get

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/impl/client/rendering/ColorProviderRegistryImpl.java:71`

```java
Provider get(T item)
```

## net.fabricmc.fabric.impl.client.rendering.ColorResolverRegistryImpl

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/impl/client/rendering/ColorResolverRegistryImpl.java:30`

```java
public final class ColorResolverRegistryImpl
```

## net.fabricmc.fabric.impl.client.rendering.ColorResolverRegistryImpl.register

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/impl/client/rendering/ColorResolverRegistryImpl.java:47`

```java
public static void register(class_6539 resolver)
```

## net.fabricmc.fabric.impl.client.rendering.ColorResolverRegistryImpl.getAllResolvers

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/impl/client/rendering/ColorResolverRegistryImpl.java:52`

```java
@UnmodifiableView public static Set<class_6539> getAllResolvers()
```

## net.fabricmc.fabric.impl.client.rendering.ColorResolverRegistryImpl.getCustomResolvers

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/impl/client/rendering/ColorResolverRegistryImpl.java:57`

```java
@UnmodifiableView public static Set<class_6539> getCustomResolvers()
```

## net.fabricmc.fabric.impl.client.rendering.ColorResolverRegistryImpl.createCustomCacheMap

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/impl/client/rendering/ColorResolverRegistryImpl.java:62`

```java
public static Reference2ReferenceMap<class_6539, class_4700> createCustomCacheMap(Function<class_6539, class_4700> cacheFactory)
```

## net.fabricmc.fabric.impl.client.rendering.DebugOptionsComparator

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/impl/client/rendering/DebugOptionsComparator.java:22`

```java
public class DebugOptionsComparator implements Comparator<class_2960>
```

## net.fabricmc.fabric.impl.client.rendering.DebugOptionsComparator.INSTANCE

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/impl/client/rendering/DebugOptionsComparator.java:23`

```java
public static final DebugOptionsComparator INSTANCE = new DebugOptionsComparator()
```

## net.fabricmc.fabric.impl.client.rendering.DebugOptionsComparator.compare

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/impl/client/rendering/DebugOptionsComparator.java:25`

```java
@Override public int compare(class_2960 o1, class_2960 o2)
```

## net.fabricmc.fabric.impl.client.rendering.EntityModelLayerImpl

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/impl/client/rendering/EntityModelLayerImpl.java:25`

```java
public final class EntityModelLayerImpl
```

## net.fabricmc.fabric.impl.client.rendering.EntityModelLayerImpl.PROVIDERS

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/impl/client/rendering/EntityModelLayerImpl.java:26`

```java
public static final Map<class_5601, EntityModelLayerRegistry.TexturedModelDataProvider> PROVIDERS = new HashMap<>()
```

## net.fabricmc.fabric.impl.client.rendering.EntityModelLayerImpl.EQUIPMENT_PROVIDERS

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/impl/client/rendering/EntityModelLayerImpl.java:27`

```java
public static final Map<class_11677<class_5601>, EntityModelLayerRegistry.TexturedEquipmentModelDataProvider> EQUIPMENT_PROVIDERS = new HashMap<>()
```

## net.fabricmc.fabric.impl.client.rendering.EntityRendererRegistryImpl

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/impl/client/rendering/EntityRendererRegistryImpl.java:28`

```java
public final class EntityRendererRegistryImpl
```

## net.fabricmc.fabric.impl.client.rendering.EntityRendererRegistryImpl.register

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/impl/client/rendering/EntityRendererRegistryImpl.java:32`

```java
public static <T extends class_1297> void register(class_1299<? extends T> entityType, class_5617<T> factory)
```

## net.fabricmc.fabric.impl.client.rendering.EntityRendererRegistryImpl.setup

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/impl/client/rendering/EntityRendererRegistryImpl.java:36`

```java
public static void setup(BiConsumer<class_1299<?>, class_5617<?>> vanillaHandler)
```

## net.fabricmc.fabric.impl.client.rendering.FabricRenderPipelineImpl

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/impl/client/rendering/FabricRenderPipelineImpl.java:21`

```java
public interface FabricRenderPipelineImpl extends FabricRenderPipeline
```

## net.fabricmc.fabric.impl.client.rendering.FabricRenderPipelineImpl.fabric$setUsePipelineDrawModeForGuiSetter

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/impl/client/rendering/FabricRenderPipelineImpl.java:22`

```java
void fabric$setUsePipelineDrawModeForGuiSetter(boolean usePipelineDrawModeForGui)
```

## net.fabricmc.fabric.impl.client.rendering.FabricRenderPipelineInternals

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/impl/client/rendering/FabricRenderPipelineInternals.java:24`

```java
public final class FabricRenderPipelineInternals
```

## net.fabricmc.fabric.impl.client.rendering.FabricRenderPipelineInternals.withSnippetUsePipelineVertexFormatForGui

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/impl/client/rendering/FabricRenderPipelineInternals.java:30`

```java
public static RenderPipeline.Snippet withSnippetUsePipelineVertexFormatForGui(Supplier<RenderPipeline.Snippet> factory, Optional<Boolean> usePipelineVertexFormat)
```

## net.fabricmc.fabric.impl.client.rendering.FabricRenderPipelineInternals.getScopedUsePipelineVertexFormatForGui

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/impl/client/rendering/FabricRenderPipelineInternals.java:45`

```java
public static Optional<Boolean> getScopedUsePipelineVertexFormatForGui()
```

## net.fabricmc.fabric.impl.client.rendering.GuiRendererExtensions

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/impl/client/rendering/GuiRendererExtensions.java:21`

```java
public interface GuiRendererExtensions
```

## net.fabricmc.fabric.impl.client.rendering.GuiRendererExtensions.fabric_onReady

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/impl/client/rendering/GuiRendererExtensions.java:22`

```java
void fabric_onReady(class_11661 orderedRenderCommandQueue)
```

## net.fabricmc.fabric.impl.client.rendering.RegistrationHelperImpl

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/impl/client/rendering/RegistrationHelperImpl.java:26`

```java
public final class RegistrationHelperImpl implements LivingEntityFeatureRendererRegistrationCallback.RegistrationHelper
```

## net.fabricmc.fabric.impl.client.rendering.RegistrationHelperImpl.RegistrationHelperImpl

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/impl/client/rendering/RegistrationHelperImpl.java:29`

```java
public RegistrationHelperImpl(Function<class_3887<?, ?>, Boolean> delegate)
```

## net.fabricmc.fabric.impl.client.rendering.RegistrationHelperImpl.register

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/impl/client/rendering/RegistrationHelperImpl.java:33`

```java
@Override public <T extends class_10017> void register(class_3887<T, ? extends class_583<T>> featureRenderer)
```

## net.fabricmc.fabric.impl.client.rendering.SpecialBlockRendererRegistryImpl

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/impl/client/rendering/SpecialBlockRendererRegistryImpl.java:25`

```java
public final class SpecialBlockRendererRegistryImpl
```

## net.fabricmc.fabric.impl.client.rendering.SpecialBlockRendererRegistryImpl.setup

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/impl/client/rendering/SpecialBlockRendererRegistryImpl.java:29`

```java
public static void setup(BiConsumer<class_2248, class_10515.class_10516> vanillaHandler)
```

## net.fabricmc.fabric.impl.client.rendering.SpecialBlockRendererRegistryImpl.register

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/impl/client/rendering/SpecialBlockRendererRegistryImpl.java:34`

```java
public static void register(class_2248 block, class_10515.class_10516 unbakedRenderer)
```

## net.fabricmc.fabric.impl.client.rendering.SpecialGuiElementRegistryImpl

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/impl/client/rendering/SpecialGuiElementRegistryImpl.java:46`

```java
public final class SpecialGuiElementRegistryImpl
```

## net.fabricmc.fabric.impl.client.rendering.SpecialGuiElementRegistryImpl.register

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/impl/client/rendering/SpecialGuiElementRegistryImpl.java:54`

```java
public static void register(SpecialGuiElementRegistry.Factory factory)
```

## net.fabricmc.fabric.impl.client.rendering.SpecialGuiElementRegistryImpl.onReady

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/impl/client/rendering/SpecialGuiElementRegistryImpl.java:63`

```java
public static void onReady(class_310 client, class_4597.class_4598 immediate, class_11659 orderedRenderCommandQueue, Map<Class<? extends class_11256>, class_11239<?>> specialElementRenderers)
```

## net.fabricmc.fabric.impl.client.rendering.SpecialGuiElementRegistryImpl.createNewRenderer

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/impl/client/rendering/SpecialGuiElementRegistryImpl.java:78`

```java
@Nullable public static <S extends class_11256> class_11239<S> createNewRenderer(S state, class_310 client, class_4597.class_4598 immediate, class_11659 orderedRenderCommandQueue)
```

## net.fabricmc.fabric.impl.client.rendering.SpecialGuiElementRegistryImpl.getRegisteredFactoryStateClasses

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/impl/client/rendering/SpecialGuiElementRegistryImpl.java:94`

```java
@VisibleForTesting public static Collection<Class<? extends class_11256>> getRegisteredFactoryStateClasses()
```

## net.fabricmc.fabric.impl.client.rendering.SpecialGuiElementRendererPool

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/impl/client/rendering/SpecialGuiElementRendererPool.java:27`

```java
public final class SpecialGuiElementRendererPool<T extends class_11256> implements AutoCloseable
```

## net.fabricmc.fabric.impl.client.rendering.SpecialGuiElementRendererPool.newFrame

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/impl/client/rendering/SpecialGuiElementRendererPool.java:31`

```java
public void newFrame()
```

## net.fabricmc.fabric.impl.client.rendering.SpecialGuiElementRendererPool.substitute

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/impl/client/rendering/SpecialGuiElementRendererPool.java:35`

```java
public class_11239<T> substitute(class_11239<T> original, T elementState, class_310 client, class_4597.class_4598 immediate, class_11659 orderedRenderCommandQueue)
```

## net.fabricmc.fabric.impl.client.rendering.SpecialGuiElementRendererPool.cleanUpUnusedRenderers

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/impl/client/rendering/SpecialGuiElementRendererPool.java:56`

```java
public void cleanUpUnusedRenderers()
```

## net.fabricmc.fabric.impl.client.rendering.SpecialGuiElementRendererPool.close

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/impl/client/rendering/SpecialGuiElementRendererPool.java:70`

```java
@Override public void close()
```

## net.fabricmc.fabric.impl.client.rendering.hud.HudElementRegistryImpl

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/impl/client/rendering/hud/HudElementRegistryImpl.java:35`

```java
public class HudElementRegistryImpl
```

## net.fabricmc.fabric.impl.client.rendering.hud.HudElementRegistryImpl.ROOT_ELEMENTS

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/impl/client/rendering/hud/HudElementRegistryImpl.java:66`

```java
@VisibleForTesting public static final Map<class_2960, RootLayer> ROOT_ELEMENTS = VANILLA_ELEMENT_IDS.stream() .map(RootLayer::new) .collect(Collectors.toMap(RootLayer::id, Function.identity(), (a, b) -> a, IdentityHashMap::new))
```

## net.fabricmc.fabric.impl.client.rendering.hud.HudElementRegistryImpl.getRoot

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/impl/client/rendering/hud/HudElementRegistryImpl.java:73`

```java
public static RootLayer getRoot(class_2960 id)
```

## net.fabricmc.fabric.impl.client.rendering.hud.HudElementRegistryImpl.addFirst

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/impl/client/rendering/hud/HudElementRegistryImpl.java:77`

```java
public static void addFirst(class_2960 id, HudElement element)
```

## net.fabricmc.fabric.impl.client.rendering.hud.HudElementRegistryImpl.addLast

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/impl/client/rendering/hud/HudElementRegistryImpl.java:82`

```java
public static void addLast(class_2960 id, HudElement element)
```

## net.fabricmc.fabric.impl.client.rendering.hud.HudElementRegistryImpl.attachElementBefore

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/impl/client/rendering/hud/HudElementRegistryImpl.java:87`

```java
public static void attachElementBefore(class_2960 beforeThis, class_2960 id, HudElement element)
```

## net.fabricmc.fabric.impl.client.rendering.hud.HudElementRegistryImpl.attachElementAfter

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/impl/client/rendering/hud/HudElementRegistryImpl.java:102`

```java
public static void attachElementAfter(class_2960 afterThis, class_2960 id, HudElement element)
```

## net.fabricmc.fabric.impl.client.rendering.hud.HudElementRegistryImpl.removeElement

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/impl/client/rendering/hud/HudElementRegistryImpl.java:115`

```java
public static void removeElement(class_2960 identifier)
```

## net.fabricmc.fabric.impl.client.rendering.hud.HudElementRegistryImpl.replaceElement

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/impl/client/rendering/hud/HudElementRegistryImpl.java:126`

```java
public static void replaceElement(class_2960 identifier, Function<HudElement, HudElement> replacer)
```

## net.fabricmc.fabric.impl.client.rendering.hud.HudElementRegistryImpl.LayerVisitor.visit

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/impl/client/rendering/hud/HudElementRegistryImpl.java:199`

```java
boolean visit(HudLayer layer, ListIterator<HudLayer> iterator)
```

## net.fabricmc.fabric.impl.client.rendering.hud.HudElementRegistryImpl.RootLayer

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/impl/client/rendering/hud/HudElementRegistryImpl.java:205`

```java
public record RootLayer(class_2960 id, List<HudLayer> layers)
```

## net.fabricmc.fabric.impl.client.rendering.hud.HudElementRegistryImpl.RootLayer.render

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/impl/client/rendering/hud/HudElementRegistryImpl.java:211`

```java
public void render(class_332 context, class_9779 tickCounter, HudElement vanillaElement)
```

## net.fabricmc.fabric.impl.client.rendering.hud.HudLayer

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/impl/client/rendering/hud/HudLayer.java:23`

```java
public interface HudLayer
```

## net.fabricmc.fabric.impl.client.rendering.hud.HudLayer.id

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/impl/client/rendering/hud/HudLayer.java:24`

```java
class_2960 id()
```

## net.fabricmc.fabric.impl.client.rendering.hud.HudLayer.element

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/impl/client/rendering/hud/HudLayer.java:26`

```java
HudElement element(HudElement vanillaElement)
```

## net.fabricmc.fabric.impl.client.rendering.hud.HudLayer.isRemoved

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/impl/client/rendering/hud/HudLayer.java:28`

```java
boolean isRemoved()
```

## net.fabricmc.fabric.impl.client.rendering.hud.HudLayer.ofVanilla

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/impl/client/rendering/hud/HudLayer.java:30`

```java
static HudLayer ofVanilla(class_2960 id)
```

## net.fabricmc.fabric.impl.client.rendering.hud.HudLayer.ofElement

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/impl/client/rendering/hud/HudLayer.java:34`

```java
static HudLayer ofElement(class_2960 id, HudElement element)
```

## net.fabricmc.fabric.impl.client.rendering.hud.HudLayer.of

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/impl/client/rendering/hud/HudLayer.java:38`

```java
static HudLayer of(class_2960 id, Function<HudElement, HudElement> operator, boolean isRemoved)
```

## net.fabricmc.fabric.impl.client.rendering.hud.HudStatusBarHeightRegistryImpl

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/impl/client/rendering/hud/HudStatusBarHeightRegistryImpl.java:56`

```java
public final class HudStatusBarHeightRegistryImpl implements ClientModInitializer
```

## net.fabricmc.fabric.impl.client.rendering.hud.HudStatusBarHeightRegistryImpl.LOGGER

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/impl/client/rendering/hud/HudStatusBarHeightRegistryImpl.java:57`

```java
public static final Logger LOGGER = LoggerFactory.getLogger("fabric-rendering-v1")
```

## net.fabricmc.fabric.impl.client.rendering.hud.HudStatusBarHeightRegistryImpl.onInitializeClient

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/impl/client/rendering/hud/HudStatusBarHeightRegistryImpl.java:184`

```java
@Override public void onInitializeClient()
```

## net.fabricmc.fabric.impl.client.rendering.hud.HudStatusBarHeightRegistryImpl.addLeft

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/impl/client/rendering/hud/HudStatusBarHeightRegistryImpl.java:191`

```java
public static void addLeft(class_2960 id, StatusBarHeightProvider heightProvider)
```

## net.fabricmc.fabric.impl.client.rendering.hud.HudStatusBarHeightRegistryImpl.addRight

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/impl/client/rendering/hud/HudStatusBarHeightRegistryImpl.java:199`

```java
public static void addRight(class_2960 id, StatusBarHeightProvider heightProvider)
```

## net.fabricmc.fabric.impl.client.rendering.hud.HudStatusBarHeightRegistryImpl.getHeight

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/impl/client/rendering/hud/HudStatusBarHeightRegistryImpl.java:207`

```java
public static int getHeight(class_2960 id)
```

## net.fabricmc.fabric.impl.client.rendering.hud.HudStatusBarHeightRegistryImpl.ResolvedHeightProvider

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/impl/client/rendering/hud/HudStatusBarHeightRegistryImpl.java:393`

```java
@FunctionalInterface public interface ResolvedHeightProvider extends ToIntFunction<class_1657>
```

## net.fabricmc.fabric.impl.client.rendering.hud.HudStatusBarHeightRegistryImpl.ResolvedHeightProvider.ZERO

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/impl/client/rendering/hud/HudStatusBarHeightRegistryImpl.java:395`

```java
ResolvedHeightProvider ZERO = (class_1657 player) -> 0
```

## net.fabricmc.fabric.impl.client.rendering.hud.HudStatusBarHeightRegistryImpl.ResolvedHeightProvider.getResolvedHeight

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/impl/client/rendering/hud/HudStatusBarHeightRegistryImpl.java:401`

```java
int getResolvedHeight(class_1657 player)
```

## net.fabricmc.fabric.impl.client.rendering.hud.HudStatusBarHeightRegistryImpl.ResolvedHeightProvider.applyAsInt

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/impl/client/rendering/hud/HudStatusBarHeightRegistryImpl.java:403`

```java
@ApiStatus.NonExtendable @Override default int applyAsInt(class_1657 player)
```

## net.fabricmc.fabric.impl.client.rendering.world.WorldExtractionContextImpl

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/impl/client/rendering/world/WorldExtractionContextImpl.java:31`

```java
public class WorldExtractionContextImpl implements WorldExtractionContext
```

## net.fabricmc.fabric.impl.client.rendering.world.WorldExtractionContextImpl.prepare

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/impl/client/rendering/world/WorldExtractionContextImpl.java:44`

```java
public void prepare( class_757 gameRenderer, class_761 worldRenderer, class_11658 worldRenderState, class_638 world, class_9779 tickCounter, boolean blockOutlines, class_4184 camera, Matrix4f viewMatrix, Matrix4f cullProjectionMatrix )
```

## net.fabricmc.fabric.impl.client.rendering.world.WorldExtractionContextImpl.setFrustum

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/impl/client/rendering/world/WorldExtractionContextImpl.java:69`

```java
public void setFrustum(@Nullable class_4604 frustum)
```

## net.fabricmc.fabric.impl.client.rendering.world.WorldExtractionContextImpl.gameRenderer

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/impl/client/rendering/world/WorldExtractionContextImpl.java:73`

```java
@Override public class_757 gameRenderer()
```

## net.fabricmc.fabric.impl.client.rendering.world.WorldExtractionContextImpl.worldRenderer

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/impl/client/rendering/world/WorldExtractionContextImpl.java:78`

```java
@Override public class_761 worldRenderer()
```

## net.fabricmc.fabric.impl.client.rendering.world.WorldExtractionContextImpl.worldState

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/impl/client/rendering/world/WorldExtractionContextImpl.java:83`

```java
@Override public class_11658 worldState()
```

## net.fabricmc.fabric.impl.client.rendering.world.WorldExtractionContextImpl.world

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/impl/client/rendering/world/WorldExtractionContextImpl.java:88`

```java
@Override public class_638 world()
```

## net.fabricmc.fabric.impl.client.rendering.world.WorldExtractionContextImpl.camera

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/impl/client/rendering/world/WorldExtractionContextImpl.java:93`

```java
@Override public class_4184 camera()
```

## net.fabricmc.fabric.impl.client.rendering.world.WorldExtractionContextImpl.frustum

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/impl/client/rendering/world/WorldExtractionContextImpl.java:98`

```java
@Override @Nullable public class_4604 frustum()
```

## net.fabricmc.fabric.impl.client.rendering.world.WorldExtractionContextImpl.tickCounter

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/impl/client/rendering/world/WorldExtractionContextImpl.java:104`

```java
@Override public class_9779 tickCounter()
```

## net.fabricmc.fabric.impl.client.rendering.world.WorldExtractionContextImpl.viewMatrix

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/impl/client/rendering/world/WorldExtractionContextImpl.java:109`

```java
@Override public Matrix4fc viewMatrix()
```

## net.fabricmc.fabric.impl.client.rendering.world.WorldExtractionContextImpl.cullProjectionMatrix

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/impl/client/rendering/world/WorldExtractionContextImpl.java:114`

```java
@Override public Matrix4fc cullProjectionMatrix()
```

## net.fabricmc.fabric.impl.client.rendering.world.WorldExtractionContextImpl.blockOutlines

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/impl/client/rendering/world/WorldExtractionContextImpl.java:119`

```java
@Override public boolean blockOutlines()
```

## net.fabricmc.fabric.impl.client.rendering.world.WorldRenderContextImpl

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/impl/client/rendering/world/WorldRenderContextImpl.java:31`

```java
public final class WorldRenderContextImpl implements AbstractWorldRenderContext, WorldTerrainRenderContext, WorldRenderContext
```

## net.fabricmc.fabric.impl.client.rendering.world.WorldRenderContextImpl.prepare

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/impl/client/rendering/world/WorldRenderContextImpl.java:42`

```java
public void prepare( class_757 gameRenderer, class_761 worldRenderer, class_11658 worldRenderState, class_11532 sectionRenderState, class_11659 commandQueue, class_4597 consumers )
```

## net.fabricmc.fabric.impl.client.rendering.world.WorldRenderContextImpl.setMatrixStack

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/impl/client/rendering/world/WorldRenderContextImpl.java:61`

```java
public void setMatrixStack(@Nullable class_4587 matrixStack)
```

## net.fabricmc.fabric.impl.client.rendering.world.WorldRenderContextImpl.gameRenderer

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/impl/client/rendering/world/WorldRenderContextImpl.java:65`

```java
@Override public class_757 gameRenderer()
```

## net.fabricmc.fabric.impl.client.rendering.world.WorldRenderContextImpl.worldRenderer

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/impl/client/rendering/world/WorldRenderContextImpl.java:70`

```java
@Override public class_761 worldRenderer()
```

## net.fabricmc.fabric.impl.client.rendering.world.WorldRenderContextImpl.worldState

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/impl/client/rendering/world/WorldRenderContextImpl.java:75`

```java
@Override public class_11658 worldState()
```

## net.fabricmc.fabric.impl.client.rendering.world.WorldRenderContextImpl.sectionState

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/impl/client/rendering/world/WorldRenderContextImpl.java:80`

```java
@Override public class_11532 sectionState()
```

## net.fabricmc.fabric.impl.client.rendering.world.WorldRenderContextImpl.commandQueue

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/impl/client/rendering/world/WorldRenderContextImpl.java:85`

```java
@Override public class_11659 commandQueue()
```

## net.fabricmc.fabric.impl.client.rendering.world.WorldRenderContextImpl.matrices

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/impl/client/rendering/world/WorldRenderContextImpl.java:90`

```java
@Override @Nullable public class_4587 matrices()
```

## net.fabricmc.fabric.impl.client.rendering.world.WorldRenderContextImpl.consumers

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/impl/client/rendering/world/WorldRenderContextImpl.java:96`

```java
@Override public class_4597 consumers()
```

## net.fabricmc.fabric.mixin.client.rendering.BlockColorsMixin

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/mixin/client/rendering/BlockColorsMixin.java:32`

```java
@Mixin(class_324.class) public class BlockColorsMixin implements ColorProviderRegistryImpl.ColorMapperHolder<class_2248, class_322>
```

## net.fabricmc.fabric.mixin.client.rendering.BlockColorsMixin.get

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/mixin/client/rendering/BlockColorsMixin.java:43`

```java
@Override public class_322 get(class_2248 block)
```

## net.fabricmc.fabric.mixin.client.rendering.BlockEntityRenderersMixin

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/mixin/client/rendering/BlockEntityRenderersMixin.java:32`

```java
@Mixin(class_5616.class) public abstract class BlockEntityRenderersMixin
```

## net.fabricmc.fabric.mixin.client.rendering.CapeLayerMixin

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/mixin/client/rendering/CapeLayerMixin.java:30`

```java
@Mixin(class_972.class) public class CapeLayerMixin
```

## net.fabricmc.fabric.mixin.client.rendering.CapeLayerMixin.injectCapeRenderCheck

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/mixin/client/rendering/CapeLayerMixin.java:32`

```java
@Inject(at = @At(value = "HEAD"), method = "submit(Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;ILnet/minecraft/client/renderer/entity/state/AvatarRenderState;FF)V", cancellable = true) public void injectCapeRenderCheck(class_4587 matrixStack, class_11659 orderedRenderCommandQueue, int i, class_10055 playerEntityRenderState, float f, float g, CallbackInfo ci, @Local(argsOnly = true) class_10055 state)
```

## net.fabricmc.fabric.mixin.client.rendering.ClientLevelMixin

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/mixin/client/rendering/ClientLevelMixin.java:34`

```java
@Mixin(class_638.class) public abstract class ClientLevelMixin
```

## net.fabricmc.fabric.mixin.client.rendering.ClientLevelMixin.calculateBlockTint

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/mixin/client/rendering/ClientLevelMixin.java:42`

```java
@Shadow public abstract int calculateBlockTint(class_2338 pos, class_6539 colorResolver)
```

## net.fabricmc.fabric.mixin.client.rendering.ClientTooltipComponentMixin

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/mixin/client/rendering/ClientTooltipComponentMixin.java:27`

```java
@Mixin(class_5684.class) public interface ClientTooltipComponentMixin
```

## net.fabricmc.fabric.mixin.client.rendering.DebugOptionsScreenEntryMixin

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/mixin/client/rendering/DebugOptionsScreenEntryMixin.java:25`

```java
@Mixin(targets = "net.minecraft.client.gui.screens.debug.DebugOptionsScreen$OptionEntry") public abstract class DebugOptionsScreenEntryMixin
```

## net.fabricmc.fabric.mixin.client.rendering.DebugOptionsScreenListWidgetMixin

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/mixin/client/rendering/DebugOptionsScreenListWidgetMixin.java:31`

```java
@Mixin(targets = "net.minecraft.client.gui.screens.debug.DebugOptionsScreen$OptionList") public class DebugOptionsScreenListWidgetMixin
```

## net.fabricmc.fabric.mixin.client.rendering.DrawAccessor.fabric$pipeline

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/mixin/client/rendering/DrawAccessor.java:25`

```java
@Accessor("pipeline") RenderPipeline fabric$pipeline()
```

## net.fabricmc.fabric.mixin.client.rendering.DrawAccessor.fabric$indexCount

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/mixin/client/rendering/DrawAccessor.java:28`

```java
@Accessor("indexCount") int fabric$indexCount()
```

## net.fabricmc.fabric.mixin.client.rendering.EntityRenderersMixin

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/mixin/client/rendering/EntityRenderersMixin.java:42`

```java
@Mixin(class_5619.class) public abstract class EntityRenderersMixin
```

## net.fabricmc.fabric.mixin.client.rendering.GameRendererMixin

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/mixin/client/rendering/GameRendererMixin.java:34`

```java
@Mixin(class_757.class) public class GameRendererMixin
```

## net.fabricmc.fabric.mixin.client.rendering.GuiAccessor

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/mixin/client/rendering/GuiAccessor.java:26`

```java
@Mixin(class_329.class) public interface GuiAccessor
```

## net.fabricmc.fabric.mixin.client.rendering.GuiAccessor.fabric$getRenderHealthValue

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/mixin/client/rendering/GuiAccessor.java:28`

```java
@Accessor("displayHealth") int fabric$getRenderHealthValue()
```

## net.fabricmc.fabric.mixin.client.rendering.GuiAccessor.fabric$callGetRiddenEntity

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/mixin/client/rendering/GuiAccessor.java:31`

```java
@Invoker("getPlayerVehicleWithHealth") class_1309 fabric$callGetRiddenEntity()
```

## net.fabricmc.fabric.mixin.client.rendering.GuiAccessor.fabric$callGetHeartCount

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/mixin/client/rendering/GuiAccessor.java:34`

```java
@Invoker("getVehicleMaxHearts") int fabric$callGetHeartCount(class_1309 entity)
```

## net.fabricmc.fabric.mixin.client.rendering.GuiAccessor.fabric$callGetHeartRows

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/mixin/client/rendering/GuiAccessor.java:37`

```java
@Invoker("getVisibleVehicleHeartRows") int fabric$callGetHeartRows(int health)
```

## net.fabricmc.fabric.mixin.client.rendering.GuiAccessor.fabric$callGetCameraPlayer

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/mixin/client/rendering/GuiAccessor.java:40`

```java
@Invoker("getCameraPlayer") class_1657 fabric$callGetCameraPlayer()
```

## net.fabricmc.fabric.mixin.client.rendering.GuiGraphicsMixin.drawStackOverlay

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/mixin/client/rendering/GuiGraphicsMixin.java:31`

```java
@Inject( method = "renderItemDecorations(Lnet/minecraft/client/gui/Font;Lnet/minecraft/world/item/ItemStack;IILjava/lang/String;)V", at = @At("RETURN") ) public void drawStackOverlay(class_327 textRenderer, class_1799 stack, int x, int y, @Nullable String stackCountText, CallbackInfo callback)
```

## net.fabricmc.fabric.mixin.client.rendering.GuiMixin.render

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/mixin/client/rendering/GuiMixin.java:46`

```java
@Inject(method = "render", at = @At(value = "TAIL")) public void render(class_332 drawContext, class_9779 tickCounter, CallbackInfo callbackInfo)
```

## net.fabricmc.fabric.mixin.client.rendering.GuiRendererMixin.fabric_onReady

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/mixin/client/rendering/GuiRendererMixin.java:77`

```java
@Override public void fabric_onReady(class_11661 entityRenderDispatcher)
```

## net.fabricmc.fabric.mixin.client.rendering.HumanoidArmorLayerMixin

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/mixin/client/rendering/HumanoidArmorLayerMixin.java:36`

```java
@Mixin(class_970.class) public abstract class HumanoidArmorLayerMixin<S extends class_10034, M extends class_572<S>, A extends class_572<S>> extends class_3887<S, M>
```

## net.fabricmc.fabric.mixin.client.rendering.HumanoidArmorLayerMixin.HumanoidArmorLayerMixin

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/mixin/client/rendering/HumanoidArmorLayerMixin.java:41`

```java
public HumanoidArmorLayerMixin(class_3883<S, M> featureRendererContext)
```

## net.fabricmc.fabric.mixin.client.rendering.LevelRendererMixin

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/mixin/client/rendering/LevelRendererMixin.java:57`

```java
@Mixin(class_761.class) public abstract class LevelRendererMixin
```

## net.fabricmc.fabric.mixin.client.rendering.LivingEntityRendererAccessor

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/mixin/client/rendering/LivingEntityRendererAccessor.java:26`

```java
@Mixin(class_922.class) public interface LivingEntityRendererAccessor<S extends class_10042, M extends class_583<? super S>>
```

## net.fabricmc.fabric.mixin.client.rendering.LivingEntityRendererAccessor.callAddFeature

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/mixin/client/rendering/LivingEntityRendererAccessor.java:28`

```java
@Invoker("addLayer") boolean callAddFeature(class_3887<S, M> featureRenderer)
```

## net.fabricmc.fabric.mixin.client.rendering.ModelLayersAccessor

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/mixin/client/rendering/ModelLayersAccessor.java:25`

```java
@Mixin(class_5602.class) public interface ModelLayersAccessor
```

## net.fabricmc.fabric.mixin.client.rendering.ModelLayersAccessor.getLayers

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/mixin/client/rendering/ModelLayersAccessor.java:27`

```java
@Accessor("ALL_MODELS") static Set<class_5601> getLayers()
```

## net.fabricmc.fabric.mixin.client.rendering.ModelMixin.root

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/mixin/client/rendering/ModelMixin.java:38`

```java
@Shadow public abstract class_630 root()
```

## net.fabricmc.fabric.mixin.client.rendering.ModelMixin.getChildPart

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/mixin/client/rendering/ModelMixin.java:49`

```java
@Override @Nullable public class_630 getChildPart(String name)
```

## net.fabricmc.fabric.mixin.client.rendering.ModelMixin.copyTransforms

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/mixin/client/rendering/ModelMixin.java:55`

```java
@Override public void copyTransforms(class_3879<?> model)
```

## net.fabricmc.fabric.mixin.client.rendering.ModelPartAccessor

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/mixin/client/rendering/ModelPartAccessor.java:24`

```java
@Mixin(class_630.class) public interface ModelPartAccessor
```

## net.fabricmc.fabric.mixin.client.rendering.ModelPartAccessor.fabric$callForEachChild

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/mixin/client/rendering/ModelPartAccessor.java:26`

```java
@Invoker("addAllChildren") void fabric$callForEachChild(BiConsumer<String, class_630> partBiConsumer)
```

## net.fabricmc.fabric.mixin.client.rendering.RenderPipelineBuilderMixin.withUsePipelineDrawModeForGui

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/mixin/client/rendering/RenderPipelineBuilderMixin.java:47`

```java
@Override public RenderPipeline.Builder withUsePipelineDrawModeForGui(boolean usePipelineDrawMode)
```

## net.fabricmc.fabric.mixin.client.rendering.RenderPipelineBuilderMixin.withoutUsePipelineDrawModeForGui

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/mixin/client/rendering/RenderPipelineBuilderMixin.java:53`

```java
@Override public RenderPipeline.Builder withoutUsePipelineDrawModeForGui()
```

## net.fabricmc.fabric.mixin.client.rendering.RenderPipelineMixin.usePipelineDrawModeForGui

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/mixin/client/rendering/RenderPipelineMixin.java:30`

```java
@Override public boolean usePipelineDrawModeForGui()
```

## net.fabricmc.fabric.mixin.client.rendering.RenderPipelineMixin.fabric$setUsePipelineDrawModeForGuiSetter

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/mixin/client/rendering/RenderPipelineMixin.java:35`

```java
@Override public void fabric$setUsePipelineDrawModeForGuiSetter(boolean usePipelineDrawModeForGui)
```

## net.fabricmc.fabric.mixin.client.rendering.RenderPipelineSnippetMixin.usePipelineDrawModeForGui

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/mixin/client/rendering/RenderPipelineSnippetMixin.java:38`

```java
@Override public Optional<Boolean> usePipelineDrawModeForGui()
```

## net.fabricmc.fabric.mixin.client.rendering.RenderStateMixin

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/mixin/client/rendering/RenderStateMixin.java:39`

```java
@Mixin({ class_10017.class, class_11954.class, class_10444.class, class_10444.class_10446.class, class_10090.class, class_10090.class_10091.class, class_11791.class, class_11658.class, class_12075.class, class_12074.class, class_12077.class, class_12078.class, class_12076.class }) public abstract class RenderStateMixin implements FabricRenderState
```

## net.fabricmc.fabric.mixin.client.rendering.RenderStateMixin.getData

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/mixin/client/rendering/RenderStateMixin.java:59`

```java
@Override @SuppressWarnings("unchecked") public <T> @Nullable T getData(RenderStateDataKey<T> key)
```

## net.fabricmc.fabric.mixin.client.rendering.RenderStateMixin.getDataOrDefault

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/mixin/client/rendering/RenderStateMixin.java:65`

```java
@Override @SuppressWarnings("unchecked") public <T> T getDataOrDefault(RenderStateDataKey<T> key, T defaultValue)
```

## net.fabricmc.fabric.mixin.client.rendering.RenderStateMixin.setData

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/mixin/client/rendering/RenderStateMixin.java:71`

```java
@Override public <T> void setData(RenderStateDataKey<T> key, T value)
```

## net.fabricmc.fabric.mixin.client.rendering.RenderStateMixin.clearExtraData

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/mixin/client/rendering/RenderStateMixin.java:80`

```java
@Override public void clearExtraData()
```

## net.fabricmc.fabric.mixin.client.rendering.SpriteSourcesAccessor

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/mixin/client/rendering/SpriteSourcesAccessor.java:27`

```java
@Mixin(class_7952.class) public interface SpriteSourcesAccessor
```

## net.fabricmc.fabric.mixin.client.rendering.SpriteSourcesAccessor.getAtlasSourceCodecs

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/mixin/client/rendering/SpriteSourcesAccessor.java:29`

```java
@Accessor("ID_MAPPER") static class_5699.class_10388<class_2960, MapCodec<? extends class_7948>> getAtlasSourceCodecs()
```

## net.fabricmc.fabric.mixin.client.rendering.renderstate.ItemStackRenderStateLayerRenderStateMixin

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/mixin/client/rendering/renderstate/ItemStackRenderStateLayerRenderStateMixin.java:26`

```java
@Mixin(class_10444.class_10446.class) public class ItemStackRenderStateLayerRenderStateMixin
```

## net.fabricmc.fabric.mixin.client.rendering.renderstate.ItemStackRenderStateMixin

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/mixin/client/rendering/renderstate/ItemStackRenderStateMixin.java:26`

```java
@Mixin(class_10444.class) public class ItemStackRenderStateMixin
```

## net.fabricmc.fabric.mixin.client.rendering.renderstate.LevelRenderStateMixin

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/mixin/client/rendering/renderstate/LevelRenderStateMixin.java:26`

```java
@Mixin(class_11658.class) public class LevelRenderStateMixin
```

## net.fabricmc.fabric.mixin.client.rendering.renderstate.SkyRenderStateMixin

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/mixin/client/rendering/renderstate/SkyRenderStateMixin.java:26`

```java
@Mixin(class_12076.class) public class SkyRenderStateMixin
```

## net.fabricmc.fabric.mixin.client.rendering.renderstate.WeatherRenderStateMixin

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/mixin/client/rendering/renderstate/WeatherRenderStateMixin.java:26`

```java
@Mixin(class_12077.class) public class WeatherRenderStateMixin
```

## net.fabricmc.fabric.mixin.client.rendering.renderstate.WorldBorderRenderStateMixin

Nguồn: `upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/mixin/client/rendering/renderstate/WorldBorderRenderStateMixin.java:26`

```java
@Mixin(class_12078.class) public class WorldBorderRenderStateMixin
```
