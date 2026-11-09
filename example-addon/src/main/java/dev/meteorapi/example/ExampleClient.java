/* SPDX-License-Identifier: GPL-3.0-only */
package dev.meteorapi.example;

import dev.meteorapi.MeteorApi;
import dev.meteorapi.client.ClientModule;
import dev.meteorapi.client.Clients;
import dev.meteorapi.setting.Setting;
import dev.meteorapi.setting.Settings;
import dev.meteorlib.foundation.NamespacedId;
import dev.meteorlib.foundation.ResourceScope;

/** Minimal client SDK example, selected from the Meteor API F8 panel. */
public final class ExampleClient {
  private ExampleClient() {}

  public static void register() {
    Clients.create("example-client", "Example Client")
        .value()
        .ifPresent(
            client -> {
              client.category("render", "Hiển thị");
              client.module(new StatusModule());
              client.command(
                  "hello",
                  "Say hello locally",
                  context -> context.reply("Client SDK đang hoạt động."));
              client.menu(
                  "tools",
                  "Công cụ ví dụ",
                  parent ->
                      dev.meteorapi.ui.Panels.create("Công cụ ví dụ")
                          .searchable("Tìm công cụ...")
                          .label("Menu thuộc example-client; tự gỡ khi client đóng.")
                          .button(
                              "Xem thống kê packet",
                              () ->
                                  MeteorApi.LOG.info(
                                      "{}", dev.meteorapi.network.Packets.statistics()))
                          .button(
                              "Xem thế giới",
                              dev.meteorapi.game.GameAccess::inWorld,
                              () ->
                                  MeteorApi.LOG.info(
                                      "{}",
                                      dev.meteorapi.game.GameAccess.world()
                                          .orElseThrow()
                                          .getRegistryKey()))
                          .build(parent));
              client.start();
            });
  }

  private static final class StatusModule extends ClientModule {
    private enum Style {
      Compact,
      Detailed
    }

    private final Setting<Long> x =
        setting(Settings.longValue(optionId("x"), 8, 0, 10000).label("Vị trí ngang"));
    private final Setting<Long> y =
        setting(Settings.longValue(optionId("y"), 8, 0, 10000).label("Vị trí dọc"));
    private final Setting<Style> style =
        setting(
            Settings.enumeration(optionId("style"), Style.Compact, Style.class)
                .label("Kiểu hiển thị"));

    StatusModule() {
      super(
          new NamespacedId("example-client", "status"),
          new NamespacedId("example-client", "render"),
          "Status HUD",
          "HUD mẫu: vị trí tùy chỉnh và vòng đời riêng cho từng world.");
      bind(org.lwjgl.glfw.GLFW.GLFW_KEY_F10, 0);
    }

    @Override
    protected void onStart(ResourceScope scope) {
      MeteorApi.hud()
          .listen(
              optionId("draw"),
              event ->
                  event
                      .canvas()
                      .text(
                          "Example Client"
                              + (style.get() == Style.Detailed
                                  ? " | Meteor API " + MeteorApi.VERSION
                                  : ""),
                          x.get().intValue(),
                          y.get().intValue(),
                          0xFFB6E4FF))
          .value()
          .ifPresent(scope::own);
    }
  }
}
