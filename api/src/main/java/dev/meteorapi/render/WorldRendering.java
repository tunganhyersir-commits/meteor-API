/* SPDX-License-Identifier: GPL-3.0-only */
package dev.meteorapi.render;
import dev.meteorapi.MeteorApi;
import dev.meteorapi.event.EventChannel;
import dev.meteorlib.foundation.NamespacedId;
import dev.meteorlib.foundation.Registration;
import dev.meteorlib.foundation.RegistrationResult;
import net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderContext;
import net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderEvents;
import java.util.function.Consumer;
/** Scoped world-render hooks that expose the complete Fabric context rather than hiding matrices or buffers. */
public final class WorldRendering {
    public enum Stage { BEFORE_ENTITIES, AFTER_ENTITIES, BEFORE_DEBUG, BEFORE_TRANSLUCENT, END_MAIN }
    public record Event(Stage stage, WorldRenderContext context) {}
    private static final EventChannel<Event> EVENTS = new EventChannel<>(3, (id, error) -> MeteorApi.LOG.warn("World renderer {} failed", id, error));
    private static final EventChannel<net.fabricmc.fabric.api.client.rendering.v1.world.WorldExtractionContext> EXTRACTION =
        new EventChannel<>(3, (id, error) -> MeteorApi.LOG.warn("World extraction listener {} failed", id, error));
    private static final EventChannel<net.fabricmc.fabric.api.client.rendering.v1.world.WorldTerrainRenderContext> TERRAIN =
        new EventChannel<>(3, (id, error) -> MeteorApi.LOG.warn("Terrain listener {} failed", id, error));
    private static boolean initialized;
    private WorldRendering() {}
    public static EventChannel<net.fabricmc.fabric.api.client.rendering.v1.world.WorldExtractionContext> extraction() { return EXTRACTION; }
    public static EventChannel<net.fabricmc.fabric.api.client.rendering.v1.world.WorldTerrainRenderContext> terrain() { return TERRAIN; }
    public static RegistrationResult<Registration> listen(NamespacedId id, Stage stage, Consumer<WorldRenderContext> draw) {
        return EVENTS.listen(id, 0, event -> event.stage == stage, event -> {
            var matrices = event.context.matrices(); matrices.push();
            try { draw.accept(event.context); } finally { matrices.pop(); }
        });
    }
    public static void initialize() {
        if (initialized) return;
        initialized = true;
        WorldRenderEvents.END_EXTRACTION.register(EXTRACTION::post);
        WorldRenderEvents.START_MAIN.register(TERRAIN::post);
        WorldRenderEvents.BEFORE_ENTITIES.register(context -> EVENTS.post(new Event(Stage.BEFORE_ENTITIES, context)));
        WorldRenderEvents.AFTER_ENTITIES.register(context -> EVENTS.post(new Event(Stage.AFTER_ENTITIES, context)));
        WorldRenderEvents.BEFORE_DEBUG_RENDER.register(context -> EVENTS.post(new Event(Stage.BEFORE_DEBUG, context)));
        WorldRenderEvents.BEFORE_TRANSLUCENT.register(context -> EVENTS.post(new Event(Stage.BEFORE_TRANSLUCENT, context)));
        WorldRenderEvents.END_MAIN.register(context -> EVENTS.post(new Event(Stage.END_MAIN, context)));
    }
}
