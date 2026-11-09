/* SPDX-License-Identifier: GPL-3.0-only */
package dev.meteorapi.ui;

import dev.meteorapi.MeteorApi;
import dev.meteorlib.foundation.NamespacedId;
import dev.meteorlib.foundation.Registration;
import dev.meteorlib.foundation.RegistrationResult;
import java.util.List;
import java.util.function.Function;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.Screen;

/** Namespaced native-screen entry points, available without Meteor Client or Mod Menu. */
public final class Menus {
  private Menus() {}

  private static final class State {
    private static final MenuRegistry<Screen> REGISTRY = new MenuRegistry<>();
  }

  private static MenuRegistry<Screen> registry() {
    MeteorApi.requireClientThread();
    return State.REGISTRY;
  }

  public static RegistrationResult<Registration> register(
      NamespacedId id, String title, Function<Screen, Screen> factory) {
    return registry().register(id, title, factory);
  }

  public static List<MenuRegistry.Entry<Screen>> entries() {
    return registry().entries();
  }

  /**
   * Missing or failing factories are not opened by this helper. Factories should only construct
   * screens.
   */
  public static boolean open(NamespacedId id, Screen parent) {
    MenuRegistry<Screen> registry = registry();
    try {
      var screen = registry.create(id, parent);
      if (screen.isEmpty()) return false;
      MinecraftClient.getInstance().setScreen(screen.get());
      return true;
    } catch (RuntimeException error) {
      MeteorApi.LOG.warn("Cannot open menu {}", id, error);
      return false;
    }
  }

  public static Screen screen(Screen parent) {
    var panel = Panels.create("Menu đã đăng ký").searchable("Tìm menu...");
    for (var entry : entries())
      panel.button(
          entry.title(), () -> open(entry.id(), MinecraftClient.getInstance().currentScreen));
    return panel.build(parent);
  }
}
