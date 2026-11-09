/* SPDX-License-Identifier: GPL-3.0-only */
package dev.meteorapi.example;

import dev.meteorapi.MeteorApi;
import dev.meteorapi.network.Packets;
import dev.meteorapi.setting.ConfigStore;
import dev.meteorapi.setting.Setting;
import dev.meteorapi.setting.Settings;
import dev.meteorapi.ui.Panels;
import dev.meteorlib.foundation.NamespacedId;
import dev.meteorlib.foundation.ResourceScope;
import java.nio.file.Path;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.client.MinecraftClient;
import org.lwjgl.glfw.GLFW;

/** Install optionally; F9 opens the example GUI. No Meteor Client dependency. */
public final class ExampleAddon implements ClientModInitializer {
  private static final String OWNER = "meteor-api-example";
  private final ConfigStore config =
      new ConfigStore(FabricLoader.getInstance().getConfigDir().resolve(OWNER + ".properties"));
  private final Setting<Boolean> capture =
      Settings.bool(id("capture"), false).label("Theo dõi packet");
  private final Setting<Long> limit =
      Settings.longValue(id("limit"), 100, 1, Long.MAX_VALUE).label("Số dòng tối đa");
  private final Setting<Path> input = Settings.file(id("input"), null).label("Tệp dữ liệu");
  private ResourceScope captureScope;
  private long observed;

  private static NamespacedId id(String name) {
    return new NamespacedId(OWNER, name);
  }

  @Override
  public void onInitializeClient() {
    ExampleClient.register();
    config.add(capture);
    config.add(limit);
    config.add(input);
    try {
      config.load();
    } catch (java.io.IOException e) {
      MeteorApi.LOG.warn("Example config", e);
    }
    MeteorApi.keys()
        .listen(
            id("open-gui"),
            event -> {
              if (event.action() == GLFW.GLFW_PRESS && event.key() == GLFW.GLFW_KEY_F9) {
                if (MinecraftClient.getInstance().currentScreen
                    instanceof dev.meteorapi.ui.PanelScreen) {
                  MinecraftClient.getInstance().currentScreen.close();
                  return;
                }
                MinecraftClient.getInstance()
                    .setScreen(
                        Panels.create("Meteor API · Ví dụ")
                            .searchable("Tìm cài đặt...")
                            .label("Chạy được khi không cài Meteor Client")
                            .toggle("Quan sát packet", capture)
                            .field("Giới hạn hiển thị", limit)
                            .file("Chọn tệp", input, "txt;json;*")
                            .button(
                                "Thống kê packet",
                                () -> MeteorApi.LOG.info("{}", Packets.statistics()))
                            .button(
                                "Nhắc sau 20 tick",
                                () ->
                                    MeteorApi.scheduler()
                                        .schedule(
                                            20,
                                            () -> MeteorApi.LOG.info("Example scheduled action")))
                            .onClose(
                                () -> {
                                  try {
                                    config.save();
                                  } catch (java.io.IOException e) {
                                    MeteorApi.LOG.warn("Example config save", e);
                                  }
                                })
                            .build(MinecraftClient.getInstance().currentScreen));
              }
            });
    capture.onChanged(id("capture-lifecycle"), change -> updateCapture());
    updateCapture();
  }

  private void updateCapture() {
    if (captureScope != null) {
      captureScope.close();
      captureScope = null;
    }
    if (!capture.get()) return;
    captureScope = new ResourceScope();
    Packets.onClient(
            id("packets"),
            snapshot -> {
              if (observed++ < limit.get())
                MeteorApi.LOG.info("{} {}", snapshot.phase(), snapshot.packetClass());
            })
        .value()
        .ifPresent(captureScope::own);
  }
}
