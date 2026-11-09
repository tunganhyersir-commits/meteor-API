/* SPDX-License-Identifier: GPL-3.0-only */
package dev.meteorapi.client;

import dev.meteorapi.MeteorApi;
import dev.meteorapi.setting.Setting;
import dev.meteorapi.setting.Settings;
import dev.meteorlib.foundation.NamespacedId;
import dev.meteorlib.foundation.ResourceScope;
import java.util.ArrayList;
import java.util.List;

/** Standalone client module; does not extend or resolve Meteor Client's Module class. */
public abstract class ClientModule extends FeatureLifecycle {
  private final NamespacedId category;
  private final String title, description;
  private final List<Setting<?>> settings = new ArrayList<>();
  private boolean settingsFrozen;
  final Setting<Boolean> persistedEnabled;
  private final Setting<Long> key;
  private final Setting<Long> modifiers;
  protected boolean runInMenus;
  private ResourceScope runningScope;
  private Object worldToken;

  protected ClientModule(NamespacedId id, NamespacedId category, String title, String description) {
    super(id, (owner, failure) -> MeteorApi.LOG.error("Client module {} failed", owner, failure));
    MeteorApi.requireClientThread();
    this.category = java.util.Objects.requireNonNull(category);
    this.title = title;
    this.description = description;
    persistedEnabled = Settings.bool(optionId("_enabled"), false);
    key = setting(Settings.longValue(optionId("_key"), -1, -1, 348).label("Phím tắt (-1: tắt)"));
    modifiers =
        setting(Settings.longValue(optionId("_modifiers"), 0, 0, 63).label("Phím bổ trợ (mask)"));
  }

  public final NamespacedId category() {
    return category;
  }

  public final String title() {
    return title;
  }

  public final String description() {
    return description;
  }

  public final NamespacedId optionId(String local) {
    return new NamespacedId(id().namespace(), id().path() + "/" + local);
  }

  protected final <T> Setting<T> setting(Setting<T> setting) {
    if (settingsFrozen)
      throw new IllegalStateException("Define module settings before registration");
    settings.add(java.util.Objects.requireNonNull(setting));
    return setting;
  }

  final void freezeSettings() {
    settingsFrozen = true;
  }

  public final List<Setting<?>> settings() {
    return List.copyOf(settings);
  }

  public final void bind(int key, int modifiers) {
    if (key < -1 || key > 348 || modifiers < 0 || modifiers > 63)
      throw new IllegalArgumentException("Invalid keyboard binding");
    this.key.set((long) key);
    this.modifiers.set((long) modifiers);
  }

  final boolean matches(MeteorApi.KeyInputEvent event) {
    return event.action() == 1
        && key.get() >= 0
        && event.key() == key.get()
        && dev.meteorapi.backport.Utils.modsMatch(event.modifiers(), modifierBits());
  }

  private int[] modifierBits() {
    int mask = modifiers.get().intValue();
    return java.util.stream.IntStream.of(1, 2, 4, 8, 16, 32)
        .filter(bit -> (mask & bit) != 0)
        .toArray();
  }

  @Override
  protected final void onEnable(ResourceScope scope) {
    MeteorApi.requireClientThread();
    var listener =
        MeteorApi.ticks()
            .listen(
                optionId("_tick"),
                tick -> {
                  try {
                    updateRuntime();
                    if (runningScope != null) onTick();
                  } catch (RuntimeException error) {
                    MeteorApi.LOG.error("Module tick {} failed", id(), error);
                    disable();
                  }
                });
    if (!listener.success()) throw new IllegalStateException(listener.message());
    scope.own(listener.value().orElseThrow());
    scope.defer(this::stopRuntime);
    updateRuntime();
  }

  @Override
  protected final void onDisable() {
    stopRuntime();
  }

  public final boolean running() {
    return active() && runningScope != null;
  }

  private void updateRuntime() {
    var game = net.minecraft.client.MinecraftClient.getInstance();
    Object next = runInMenus ? this : game.world != null && game.player != null ? game.world : null;
    if (runningScope != null && next != worldToken) stopRuntime();
    if (next != null && runningScope == null) {
      ResourceScope scope = new ResourceScope();
      runningScope = scope;
      worldToken = next;
      try {
        onStart(scope);
      } catch (RuntimeException error) {
        runningScope = null;
        worldToken = null;
        try {
          scope.close();
        } catch (RuntimeException cleanup) {
          error.addSuppressed(cleanup);
        }
        throw error;
      }
    }
  }

  private void stopRuntime() {
    ResourceScope previous = runningScope;
    runningScope = null;
    worldToken = null;
    if (previous == null) return;
    RuntimeException failure = null;
    try {
      onStop();
    } catch (RuntimeException error) {
      failure = error;
    }
    try {
      previous.close();
    } catch (RuntimeException error) {
      if (failure == null) failure = error;
      else failure.addSuppressed(error);
    }
    if (failure != null) throw failure;
  }

  protected void onStart(ResourceScope scope) {}

  protected void onStop() {}

  protected void onTick() {}
}
