# Ghi chú trong toàn bộ source đầu vào

Comment có TODO/FIXME/HACK/XXX/NOTE/WARNING được giữ dưới đây; danh sách đầy đủ ở `all-input-comments.json`.

## upstream/common-networking-1.21.11/common/src/main/java/commonnetwork/networking/data/CommonPacketWrapper.java:5

```java
//TODO: Removing for mc 1.21.2 or 1.22
```

## upstream/common-networking-1.21.11/common/src/main/java/commonnetwork/networking/data/PacketContainer.java:21

```java
//TODO: Removing for mc 1.21.2 or 1.22
```

## upstream/common-networking-1.21.11/common/src/main/java/commonnetwork/networking/data/PacketContainer.java:48

```java
//TODO: Removing for mc 1.21.2 or 1.22, will also be able to remove the wrapping of the decoder.
```

## upstream/fabric-api-1.21.11/fabric-api-base/net/fabricmc/fabric/api/event/AutoInvokingEvent.java:25

```java
/**
 * Indicates that this {@link Event} is auto-invoking:
 * it calls the event callback implemented by a context parameter type automatically and without registration.
 *
 * <p>This means that this event can be listened to in two ways:
 * <ul>
 *     <li>If the consumer is the context parameter and it implements the callback, it will be automatically invoked, don't register manually.
 *     <li>Otherwise, there is no invocation and the listener needs manual registration as usual.
 * </ul>
 *
 * <p>Do note that there may be more than one context parameter.
 *
 * <p>A typical use case is feature augmentation, for example to expose raw clicks to slots.
 * The event callback has a slot parameter - the context parameter - and the event itself is carrying this annotation.
 * All the slot needs to receive slot clicks is to implement {@code SlotClickCallback} on itself.
 * It shouldn't do any explicit event registration like {@code SLOT_CLICK_EVENT.register(this::onSlotClick)},
 * otherwise it will see extraneous callback invocations.
 *
 * <p>In general, an auto-invoking event bridges the gap between the flexibility of an event with global reach,
 * and the convenience of implementing an interface that gets detected automatically.
 *
 * <p>This is a documentation-only annotation, the event factory has to implement the functionality explicitly by checking the parameter type and invoking it.
 * On top of adding this annotation, the event field or method should document which parameters are context parameters,
 * and under which circumstances they are invoked.
 */
```

## upstream/fabric-api-1.21.11/fabric-api-base/net/fabricmc/fabric/api/event/AutoInvokingEvent.java:50

```java
// TODO: explore enforcing that auto-invoked listeners don't register themselves.
```

## upstream/fabric-api-1.21.11/fabric-api-base/net/fabricmc/fabric/api/event/Event.java:76

```java
/**
	 * Request that listeners registered for one phase be executed before listeners registered for another phase.
	 * Relying on the default phases supplied to {@link EventFactory#createWithPhases} should be preferred over manually
	 * registering phase ordering dependencies.
	 *
	 * <p>Incompatible ordering constraints such as cycles will lead to inconsistent behavior:
	 * some constraints will be respected and some will be ignored. If this happens, a warning will be logged.
	 *
	 * @param firstPhase The identifier of the phase that should run before the other. It will be created if it didn't exist yet.
	 * @param secondPhase The identifier of the phase that should run after the other. It will be created if it didn't exist yet.
	 */
```

## upstream/fabric-api-1.21.11/fabric-api-base/net/fabricmc/fabric/impl/base/toposort/NodeSorting.java:127

```java
// Print cycle warning
```

## upstream/fabric-api-1.21.11/fabric-api-base/net/fabricmc/fabric/impl/base/toposort/SortableNode.java:27

```java
/**
	 * @return Description of this node, used to print the cycle warning.
	 */
```

## upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/api/event/lifecycle/v1/ServerChunkEvents.java:32

```java
/**
	 * Called when a chunk is loaded into a ServerWorld.
	 *
	 * <p>When this event is called, the chunk is already in the world.
	 *
	 * <p>Note that this event is not called for chunks that become accessible without previously being unloaded.
	 *
	 * @see ServerChunkEvents#CHUNK_LEVEL_TYPE_CHANGE
	 */
```

## upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/api/event/lifecycle/v1/ServerChunkEvents.java:58

```java
/**
	 * Called when a chunk is unloaded from a ServerWorld.
	 *
	 * <p>When this event is called, the chunk is still present in the world.
	 *
	 * <p>Note that the server typically unloads chunks when the chunk's level goes above 45 (and not immediately when the chunk becomes inaccessible).
	 * To know when a chunk first becomes inaccessible, see {@link ServerChunkEvents#CHUNK_LEVEL_TYPE_CHANGE}.
	 */
```

## upstream/fabric-api-1.21.11/fabric-lifecycle-events-v1/net/fabricmc/fabric/impl/event/lifecycle/LifecycleEventsImpl.java:41

```java
// This handles the edge case where going through a portal will cause block entities to unload without warning.
```

## upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/client/networking/v1/package-info.java:17

```java
/**
 * The Networking API (client side), version 1.
 *
 * <p>There are three stages of Minecraft networking, all of which are supported in this API:
 * <dl>
 *     <dt>LOGIN</dt>
 *     <dd>This is the initial stage, before the player logs into the world. If using a proxy server,
 *     the packets in this stage may be intercepted and discarded by the proxy. <strong>Most of the pre-1.20.2
 *     uses of this event should be replaced with the CONFIGURATION stage.</strong>
 *     Related events are found at {@link net.fabricmc.fabric.api.client.networking.v1.ClientLoginConnectionEvents},
 *     and related methods are found at {@link net.fabricmc.fabric.api.client.networking.v1.ClientLoginNetworking}.
 *     </dd>
 *     <dt>CONFIGURATION</dt>
 *     <dd>This is the stage after LOGIN. The player is authenticated, but still hasn't joined the
 *     world at this point. Clients can use this phase to send configurations or verify their mod
 *     versions. Note that some server mods allow players in the PLAY stage to re-enter this stage,
 *     for example when a player chooses a minigame server in a lobby.
 *     Related events are found at {@link net.fabricmc.fabric.api.client.networking.v1.C2SConfigurationChannelEvents}
 *     and {@link net.fabricmc.fabric.api.client.networking.v1.ClientConfigurationConnectionEvents}, and related methods are found at
 *     {@link net.fabricmc.fabric.api.client.networking.v1.ClientConfigurationNetworking}.
 *     </dd>
 *     <dt>PLAY</dt>
 *     <dd>This is the stage after CONFIGURATION, where gameplay-related packets are sent and received.
 *     The player has joined the world and is playing the game. Related events are found at
 *     {@link net.fabricmc.fabric.api.client.networking.v1.C2SPlayChannelEvents}
 *     and {@link net.fabricmc.fabric.api.client.networking.v1.ClientPlayConnectionEvents}, and related methods are found at
 *     {@link net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking}.</dd>
 * </dl>
 */
```

## upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/networking/v1/PlayerLookup.java:95

```java
/**
	 * Gets all players tracking an entity in a server world.
	 *
	 * <p>The returned collection is immutable.
	 *
	 * <p><b>Warning</b>: If the provided entity is a player, it is not
	 * guaranteed by the contract that said player is included in the
	 * resulting stream.
	 *
	 * @param entity the entity being tracked
	 * @return the players tracking the entity
	 * @throws IllegalArgumentException if the entity is not in a server world
	 */
```

## upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/api/networking/v1/package-info.java:17

```java
/**
 * The Networking API, version 1.
 *
 * <p>There are three stages of Minecraft networking, all of which are supported in this API:
 * <dl>
 *     <dt>LOGIN</dt>
 *     <dd>This is the initial stage, before the player logs into the world. If using a proxy server,
 *     the packets in this stage may be intercepted and discarded by the proxy. <strong>Most of the pre-1.20.2
 *     uses of this event should be replaced with the CONFIGURATION stage.</strong>
 *     Related events are found at {@link net.fabricmc.fabric.api.networking.v1.ServerLoginConnectionEvents},
 *     and related methods are found at {@link net.fabricmc.fabric.api.networking.v1.ServerLoginNetworking}.
 *     </dd>
 *     <dt>CONFIGURATION</dt>
 *     <dd>This is the stage after LOGIN. The player is authenticated, but still hasn't joined the
 *     world at this point. Servers can use this phase to send configurations or verify client's mod
 *     versions. Note that some server mods allow players in the PLAY stage to re-enter this stage,
 *     for example when a player chooses a minigame server in a lobby.
 *     Related events are found at {@link net.fabricmc.fabric.api.networking.v1.S2CConfigurationChannelEvents}
 *     {@link net.fabricmc.fabric.api.networking.v1.ServerConfigurationConnectionEvents}, and related methods are found at
 *     {@link net.fabricmc.fabric.api.networking.v1.ServerConfigurationNetworking}.
 *     </dd>
 *     <dt>PLAY</dt>
 *     <dd>This is the stage after CONFIGURATION, where gameplay-related packets are sent and received.
 *     The player has joined the world and is playing the game. Related events are found at
 *     {@link net.fabricmc.fabric.api.networking.v1.S2CPlayChannelEvents}
 *     and {@link net.fabricmc.fabric.api.networking.v1.ServerPlayConnectionEvents}, and related methods are found at
 *     {@link net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking}.</dd>
 * </dl>
 *
 * <p>In addition, this API includes helpers for {@linkplain
 * net.fabricmc.fabric.api.networking.v1.PayloadTypeRegistry registering custom packet payloads} and {@linkplain
 * net.fabricmc.fabric.api.networking.v1.PlayerLookup player lookups}.
 */
```

## upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/mixin/networking/ServerConfigurationPacketListenerImplMixin.java:83

```java
// A bit of a hack but it allows the field above to be set in case someone registers handlers during INIT event which refers to said field
```

## upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/mixin/networking/ServerGamePacketListenerImplMixin.java:56

```java
// A bit of a hack but it allows the field above to be set in case someone registers handlers during INIT event which refers to said field
```

## upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/mixin/networking/ServerLoginPacketListenerImplMixin.java:48

```java
// A bit of a hack but it allows the field above to be set in case someone registers handlers during INIT event which refers to said field
```

## upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/mixin/networking/client/ClientConfigurationPacketListenerImplMixin.java:47

```java
// A bit of a hack but it allows the field above to be set in case someone registers handlers during INIT event which refers to said field
```

## upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/mixin/networking/client/ClientHandshakePacketListenerImplMixin.java:50

```java
// A bit of a hack but it allows the field above to be set in case someone registers handlers during INIT event which refers to said field
```

## upstream/fabric-api-1.21.11/fabric-networking-api-v1/net/fabricmc/fabric/mixin/networking/client/ClientPacketListenerMixin.java:47

```java
// A bit of a hack but it allows the field above to be set in case someone registers handlers during INIT event which refers to said field
```

## upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/ArmorRenderer.java:129

```java
/**
	 * Checks whether an item stack equipped on the head should also be
	 * rendered as an item. By default, vanilla renders most items with their models (or special item renderers)
	 * around or on top of the entity's head, but this is often unwanted for custom equipment.
	 *
	 * <p>This method only applies to items registered with this renderer.
	 *
	 * <p>Note that the item will never be rendered by vanilla code if it has an armor model defined
	 * by the {@link net.minecraft.class_9334#field_54196 minecraft:equippable} component.
	 * This method cannot be used to overwrite that check to re-enable also rendering the item model.
	 * See {@link net.minecraft.class_970#method_64081(class_1799, class_1304)}.
	 *
	 * @param entity the equipping entity
	 * @param stack  the item stack equipped on the head
	 * @return {@code true} if the head item should be rendered, {@code false} otherwise
	 */
```

## upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/ColorProviderRegistry.java:36

```java
/**
	 * Get a color provider for the given object.
	 *
	 * <p>Please note that the underlying registry may not be fully populated or stable until the game has started,
	 * as other mods may overwrite the registry.
	 *
	 * @param object The object to acquire the provider for.
	 * @return The registered mapper for this provider, or {@code null} if none is registered or available.
	 */
```

## upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/FabricModel.java:24

```java
/**
 * General purpose Fabric extensions to the {@link class_3879} class.
 *
 * <p>Note: This interface is automatically implemented on all {@link class_3879} instances via Mixin and interface injection.
 */
```

## upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/FabricRenderPipeline.java:23

```java
/**
 * General purpose Fabric extensions to the {@link RenderPipeline} class.
 *
 * <p>Note: This interface is automatically implemented on all render pipelines via Mixin and interface injection.
 */
```

## upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/FabricRenderPipeline.java:38

```java
/**
	 * General purpose Fabric extensions to the {@link RenderPipeline.Builder} class.
	 *
	 * <p>Note: This interface is automatically implemented on all render pipeline builders via Mixin and interface injection.
	 */
```

## upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/FabricRenderPipeline.java:64

```java
/**
	 * General purpose Fabric extensions to the {@link RenderPipeline.Snippet} class.
	 *
	 * <p>Note: This interface is automatically implemented on all render pipeline snippets via Mixin and interface injection.
	 */
```

## upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/FabricRenderState.java:33

```java
/**
 * Fabric-provided extensions for render states, allowing for the addition of extra render data.
 *
 * <p>Note: This interface is automatically implemented on the following classes via Mixin and interface injection:
 * <ul>
 *     <li>{@link class_10017},
 *     <li>{@link class_11954}
 *     <li>{@link class_10444} and {@link class_10444.class_10446}
 *     <li>{@link class_10090} and {@link class_10090.class_10091}
 *     <li>{@link class_11791}
 *     <li>{@link class_11658}
 *     <li>{@link class_12075}
 *     <li>{@link class_12074}
 *     <li>{@link class_12077}
 *     <li>{@link class_12078}
 *     <li>{@link class_12076}
 * </ul>
 */
```

## upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/TooltipComponentCallback.java:26

```java
/**
 * Allows registering a mapping from {@link class_5632} to {@link class_5684}.
 * This allows custom tooltips for items: first, override {@link class_1792#method_32346} and return a custom {@code TooltipData}.
 * Second, register a listener to this event and convert the data to your component implementation if it's an instance of your data class.
 *
 * <p>Note that failure to map some data to a component will throw an exception,
 * so make sure that any data you return in {@link class_1792#method_32346} will be handled by one of the callbacks.
 */
```

## upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/hud/HudStatusBarHeightRegistry.java:108

```java
/**
	 * Gets the total calculated height offset for a given HUD element ID. Usage:
	 * {@snippet :
	 * - net.minecraft.client.gui.DrawContext.getScaledWindowHeight() - (39 + renderHeight)
	 * + net.minecraft.client.gui.DrawContext.getScaledWindowHeight() - HudStatusBarHeightRegistry.getHeight(id)
	 * }
	 *
	 * <p>This method is typically used by the rendering system to determine how much
	 * to shift a HUD element. It returns the default HUD height which is {@code 39} plus the sum of all registered
	 * provider heights that are considered "below" the position of the element associated with the given {@code id}.
	 *
	 * <p>Note: The registry must be initialized (frozen) before this method returns
	 * values without throwing an exception. This initialization happens during the Minecraft client setup.
	 *
	 * @param id the {@link class_2960} of the HUD element.
	 * @return the total height offset.
	 */
```

## upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/hud/VanillaHudElements.java:109

```java
/**
	 * The identifier for the vanilla title and subtitle element.
	 *
	 * <p>Note that this is not the sound subtitles.
	 */
```

## upstream/fabric-api-1.21.11/fabric-rendering-v1/net/fabricmc/fabric/api/client/rendering/v1/world/WorldRenderEvents.java:97

```java
/**
	 * Called after the {@link net.minecraft.class_11515#field_60923 SOLID}, {@link net.minecraft.class_11515#field_60925 CUTOUT},
	 * and {@link net.minecraft.class_11515#field_60925 CUTOUT_MIPPED} terrain layers are drawn to the framebuffer,
	 * before entity and block entities are submitted and drawn to the framebuffer.
	 *
	 * <p>Use to render non-translucent terrain to the framebuffer.
	 *
	 * <p>Note that 3rd-party renderers may combine these passes or otherwise alter the
	 * rendering pipeline for sake of performance or features. This can break direct writes to the
	 * framebuffer.  Use this event for cases that cannot be satisfied by FabricBakedModel,
	 * BlockEntityRenderer or other existing abstraction. If at all possible, use an existing terrain
	 * RenderLayer instead of outputting to the framebuffer directly with GL calls.
	 *
	 * <p>The consumer is responsible for setup and tear down of GL state appropriate for the intended output.
	 *
	 * <p>Because solid and cutout quads are depth-tested, order of output does not matter except to improve
	 * culling performance, which should not be significant after primary terrain rendering. This means
	 * mods that currently hook calls to individual render layers can simply execute them all at once when
	 * the event is called.
	 * However, you should not access any data outside the provided render states. If more data is needed,
	 * extract them during {@link #END_EXTRACTION}.
	 */
```

## upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/commands/NotebotCommand.java:190

```java
// Bruteforce note level
```

## upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/ColorSettingScreen.java:460

```java
// NOTE: if Max is == 0, this divide would cause a crash
```

## upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/MeshRenderer.java:136

```java
// todo hope this is alright @minegame take a look please (lossy conversion from long to int)
```

## upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/CombatHud.java:49

```java
// TODO: Rewrite this to use the hud renderer system
```

## upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/CombatHud.java:235

```java
// TODO: These should probably be settings
```

## upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/Notebot.java:475

```java
// A map with noteblocks that have incorrect note level
```

## upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/Notebot.java:490

```java
// Add excess noteblocks for mapping process [note -> block pos]
```

## upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/Notebot.java:500

```java
// Map [note -> block pos]
```

## upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/Notebot.java:539

```java
/**
     * Set up a tune hits map which tells how many times player needs to
     * hit noteblock to obtain desired note level
     */
```

## upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/Notebot.java:940

```java
/**
     * Gets an NoteBlockInstrument from Note Map
     *
     * @param inst An instrument
     * @return A new instrument mapped by instrument given in parameters
     */
```

## upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/modules/render/Blur.java:219

```java
// todo ???
```

## upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/modules/render/marker/CuboidMarker.java:14

```java
// TODO: Add outline and more modes
```

## upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/modules/world/HighwayBuilder.java:471

```java
/* todo
        - separate digging and paving more effectively
        - separate walking forwards from the current state to speed up actions
        - scan one block behind you to ensure the highway is still valid
        - do something about god damn lava flowing in
     */
```

## upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/modules/world/HighwayBuilder.java:883

```java
// todo add a better raytrace check
```

## upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/modules/world/HighwayBuilder.java:1409

```java
// todo handle pulling ecs from shulker boxes so we can search through them
```

## upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/modules/world/HighwayBuilder.java:1464

```java
// todo when we add a digging only mode, make pickaxes fill all empty slots
```

## upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/modules/world/HighwayBuilder.java:1873

```java
// todo hold the best mining tool before performing the double mining checks so we dont double mine blocks unnecessarily
```

## upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/proxies/Proxy.java:88

```java
// todo
```

## upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/notebot/decoder/NBSSongDecoder.java:19

```java
/**
 * Utils for reading Note Block Studio data
 *
 */
```

## upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/notebot/decoder/NBSSongDecoder.java:27

```java
/**
     * Parses a Song from a Note Block Studio project file (.nbs)
     * @see Song
     * @param songFile .nbs file
     * @return Song object representing a Note Block Studio project
     */
```

## upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/notebot/decoder/NBSSongDecoder.java:39

```java
/**
     * Parses a Song from an InputStream and a Note Block Studio project file (.nbs)
     * @see Song
     * @param inputStream of a .nbs file
     * @return Song object representing the given .nbs file
     */
```

## upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/notebot/decoder/NBSSongDecoder.java:96

```java
// note block velocity
```

## upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/notebot/decoder/NBSSongDecoder.java:97

```java
// note panning, 0 is right in nbs format
```

## upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/notebot/decoder/NBSSongDecoder.java:98

```java
// note block pitch
```

## upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/notebot/decoder/NBSSongDecoder.java:103

```java
// Probably a custom instrument. Ignore this note
```

## upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/notebot/decoder/NBSSongDecoder.java:106

```java
/* note */
```

## upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/notebot/decoder/NBSSongDecoder.java:114

```java
/**
     * Sets a note at a tick in a song
     */
```

## upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/notebot/decoder/SongDecoders.java:28

```java
// TODO Maybe a midi decoder in the future
```

## upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/ChatUtils.java:105

```java
// Warning
```

## upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/FontUtils.java:69

```java
/**
     * Core logic: interpret font data from a ByteBuffer.
     * NOTE: This preserves your original 5-byte header check exactly.
     */
```

## upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/commands/NotebotCommand.java:190

```java
// Bruteforce note level
```

## upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/ColorSettingScreen.java:463

```java
// NOTE: if Max is == 0, this divide would cause a crash
```

## upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/sodium/MeshVertexConsumerMixin.java:7

```java
// fixme this class will probably work when sodium updates
```

## upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/MeshBuilder.java:41

```java
// TODO: maybe dynamically choose index type
```

## upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/text/VanillaTextRenderer.java:18

```java
//todo remove in 26.3 update
```

## upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/accounts/types/TheAlteningAccount.java:26

```java
// todo figure this out
```

## upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/accounts/types/TheAlteningAccount.java:72

```java
// todo i will eat my sock if this actually works
```

## upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/CombatHud.java:49

```java
// TODO: Rewrite this to use the hud renderer system
```

## upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/CombatHud.java:235

```java
// TODO: These should probably be settings
```

## upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/keyboard/KeyboardHud.java:455

```java
//keys.add(l.key(Keybind.fromKey(KEY_WORLD_2), lShiftEnd, row4)); TODO: wtf is WORLD_2
```

## upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/Notebot.java:475

```java
// A map with noteblocks that have incorrect note level
```

## upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/Notebot.java:490

```java
// Add excess noteblocks for mapping process [note -> block pos]
```

## upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/Notebot.java:500

```java
// Map [note -> block pos]
```

## upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/Notebot.java:539

```java
/**
     * Set up a tune hits map which tells how many times player needs to
     * hit noteblock to obtain desired note level
     */
```

## upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/Notebot.java:942

```java
/**
     * Gets an NoteBlockInstrument from Note Map
     *
     * @param inst An instrument
     * @return A new instrument mapped by instrument given in parameters
     */
```

## upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/marker/CuboidMarker.java:14

```java
// TODO: Add outline and more modes
```

## upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/HighwayBuilder.java:472

```java
/* todo
        - separate digging and paving more effectively
        - separate walking forwards from the current state to speed up actions
        - scan one block behind you to ensure the highway is still valid
        - do something about god damn lava flowing in
     */
```

## upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/HighwayBuilder.java:896

```java
// todo add a better raytrace check
```

## upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/HighwayBuilder.java:1420

```java
// todo handle pulling ecs from shulker boxes so we can search through them
```

## upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/HighwayBuilder.java:1475

```java
// todo when we add a digging only mode, make pickaxes fill all empty slots
```

## upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/HighwayBuilder.java:1886

```java
// todo hold the best mining tool before performing the double mining checks so we dont double mine blocks unnecessarily
```

## upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/proxies/Proxy.java:88

```java
// todo
```

## upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/entity/EntityUtils.java:116

```java
// todo is there a better way to replace BlockBehaviour.BlockStateBase#blocksMotion than just copy-pasting the method body?
```

## upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/notebot/decoder/NBSSongDecoder.java:19

```java
/**
 * Utils for reading Note Block Studio data
 *
 */
```

## upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/notebot/decoder/NBSSongDecoder.java:27

```java
/**
     * Parses a Song from a Note Block Studio project file (.nbs)
     *
     * @param songFile .nbs file
     * @return Song object representing a Note Block Studio project
     * @see Song
     */
```

## upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/notebot/decoder/NBSSongDecoder.java:40

```java
/**
     * Parses a Song from an InputStream and a Note Block Studio project file (.nbs)
     *
     * @param inputStream of a .nbs file
     * @return Song object representing the given .nbs file
     * @see Song
     */
```

## upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/notebot/decoder/NBSSongDecoder.java:98

```java
// note block velocity
```

## upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/notebot/decoder/NBSSongDecoder.java:99

```java
// note panning, 0 is right in nbs format
```

## upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/notebot/decoder/NBSSongDecoder.java:100

```java
// note block pitch
```

## upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/notebot/decoder/NBSSongDecoder.java:105

```java
// Probably a custom instrument. Ignore this note
```

## upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/notebot/decoder/NBSSongDecoder.java:108

```java
/* note */
```

## upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/notebot/decoder/NBSSongDecoder.java:116

```java
/**
     * Sets a note at a tick in a song
     */
```

## upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/notebot/decoder/SongDecoders.java:28

```java
// TODO Maybe a midi decoder in the future
```

## upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/ChatUtils.java:96

```java
// Warning
```

## upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/FontUtils.java:70

```java
/**
     * Core logic: interpret font data from a ByteBuffer.
     * NOTE: This preserves your original 5-byte header check exactly.
     */
```

## upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/postprocess/PostProcessShader.java:89

```java
// todo what should usage be? not just here but everywhere else also
```
