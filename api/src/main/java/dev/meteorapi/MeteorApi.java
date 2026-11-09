/* SPDX-License-Identifier: GPL-3.0-only */
package dev.meteorapi;

import dev.meteorapi.event.EventChannel;
import dev.meteorapi.network.Packets;
import dev.meteorapi.setting.ConfigStore;
import dev.meteorapi.setting.Setting;
import dev.meteorapi.setting.Settings;
import dev.meteorapi.ui.Panels;
import dev.meteorlib.foundation.NamespacedId;
import dev.meteorlib.foundation.ServiceRegistry;
import dev.meteorlib.foundation.TickScheduler;
import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.Screen;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Independent entry point. Loading this class does not resolve Meteor Client or Mod Menu classes.
 */
public final class MeteorApi {
  public static final String ID = "meteor-api", VERSION = "0.1.2-beta";
  public static final Logger LOG = LoggerFactory.getLogger("Meteor API");

  public record KeyInputEvent(int key, int scancode, int modifiers, int action) {}

  public record TickEvent(long tick) {}

  public record HudEvent(net.minecraft.client.gui.DrawContext context, float tickDelta) {
    public dev.meteorapi.ui.Canvas canvas() {
      return new dev.meteorapi.ui.Canvas(context);
    }
  }

  private static final EventChannel<HudEvent> HUD =
      new EventChannel<>(3, (id, e) -> LOG.warn("HUD listener {}", id, e));
  private static final EventChannel<KeyInputEvent> KEYS =
      new EventChannel<>(3, (id, e) -> LOG.warn("Key listener {}", id, e));
  private static final EventChannel<TickEvent> TICKS =
      new EventChannel<>(3, (id, e) -> LOG.warn("Tick listener {}", id, e));
  private static final ServiceRegistry SERVICES = new ServiceRegistry();
  private static final ConfigStore CONFIG =
      new ConfigStore(
          FabricLoader.getInstance().getConfigDir().resolve("meteor-api/settings.properties"));
  public static final Setting<Long> OPEN_KEY =
      Settings.longValue(new NamespacedId(ID, "open-key"), 297, -1, 348).label("Phím mở menu");
  private static TickScheduler scheduler;

  private MeteorApi() {}

  public static EventChannel<KeyInputEvent> keys() {
    return KEYS;
  }

  public static EventChannel<TickEvent> ticks() {
    return TICKS;
  }

  public static EventChannel<HudEvent> hud() {
    return HUD;
  }

  public static ConfigStore config() {
    return CONFIG;
  }

  public static ServiceRegistry services() {
    return SERVICES;
  }

  public static TickScheduler scheduler() {
    requireClientThread();
    if (scheduler == null)
      scheduler =
          new TickScheduler(4096, 256, error -> LOG.error("Scheduled action failed", error));
    return scheduler;
  }

  public static boolean hasMeteorClient() {
    return FabricLoader.getInstance().isModLoaded("meteor-client");
  }

  public static void requireClientThread() {
    if (!MinecraftClient.getInstance().isOnThread())
      throw new IllegalStateException("Minecraft client thread required");
  }

  public static CompletableFuture<Void> execute(Runnable action) {
    CompletableFuture<Void> future = new CompletableFuture<>();
    MinecraftClient.getInstance()
        .execute(
            () -> {
              if (future.isCancelled()) return;
              try {
                action.run();
                future.complete(null);
              } catch (RuntimeException error) {
                future.completeExceptionally(error);
              }
            });
    return future;
  }

  public static void onTick() {
    scheduler().tick();
    Packets.drainClient();
    TICKS.post(new TickEvent(scheduler().currentTick()));
  }

  public static Screen screen(Screen parent) {
    requireClientThread();
    var stats = Packets.statistics();
    var panel =
        Panels.create("Meteor API · " + VERSION)
            .searchable("Tìm chức năng...")
            .label("API độc lập · Fabric Loader 0.19.5")
            .label("Meteor Client: " + (hasMeteorClient() ? "đã cài" : "chưa cài"))
            .label("Packet gửi/nhận: " + stats.sendAttempts() + " / " + stats.received())
            .field("Phím mở (F8 = 297; -1 để tắt)", OPEN_KEY)
            .button(
                "Lưu cấu hình",
                () -> {
                  try {
                    CONFIG.save();
                  } catch (IOException e) {
                    LOG.error("Cannot save settings", e);
                  }
                });
    panel.button(
        "Danh sách menu",
        () ->
            MinecraftClient.getInstance()
                .setScreen(
                    dev.meteorapi.ui.Menus.screen(MinecraftClient.getInstance().currentScreen)));
    for (var client : dev.meteorapi.client.Clients.all())
      panel.button(
          "Mở client: " + client.title(),
          () ->
              MinecraftClient.getInstance()
                  .setScreen(client.screen(MinecraftClient.getInstance().currentScreen)));
    return panel.build(parent);
  }
}
