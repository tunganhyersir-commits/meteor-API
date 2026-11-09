/* SPDX-License-Identifier: GPL-3.0-only */
package dev.meteorapi;

import dev.meteorapi.setting.ConfigStore;
import dev.meteorapi.setting.Settings;
import dev.meteorapi.ui.MenuRegistry;
import dev.meteorapi.ui.internal.ListViewport;
import dev.meteorlib.foundation.NameRules;
import dev.meteorlib.foundation.NamespacedId;
import dev.meteorlib.foundation.Registration;
import dev.meteorlib.foundation.RegistrationResult;
import java.nio.file.Files;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/** Behavioral checks for menu ownership, labels/persistence, and filtered pagination. */
public final class BetaApiTest {
  private static int checks;

  private static NamespacedId id(String path) {
    return new NamespacedId("beta-tests", path);
  }

  public static void main(String[] args) throws Exception {
    check(
        NameRules.displayName("status/max-packets").equals("Max packets"),
        "last path component and separators become a label");
    check(NameRules.displayName("maxPackets").equals("Max Packets"), "camel-case fallback");
    check(
        NameRules.displayName("_key").equals("Key"),
        "internal option prefix does not show as an underscore");
    check(NameRules.displayName("___").equals("Option"), "empty fallback remains usable");
    var x = Settings.longValue(id("overlay/x-offset"), 8, 0, 1000);
    check(x.label().equals("X offset"), "setting default label");
    check(
        x.label("Vị trí ngang") == x && x.label().equals("Vị trí ngang"),
        "explicit Unicode label is fluent");
    check(
        x.id().equals(id("overlay/x-offset")) && x.encode().equals("8"),
        "label does not mutate identity or value");
    expect(IllegalArgumentException.class, () -> x.label("  "));
    check(x.label().equals("Vị trí ngang"), "failed label edit preserves accepted label");
    var dir = Files.createTempDirectory("meteor-api-beta-");
    try {
      var config = new ConfigStore(dir.resolve("client.properties"));
      config.add(x);
      x.set(99L);
      config.save();
      var other =
          Settings.longValue(id("overlay/x-offset"), 8, 0, 1000).label("Horizontal position");
      var replacement = new ConfigStore(config.file());
      replacement.add(other);
      replacement.load();
      check(
          other.get() == 99 && other.label().equals("Horizontal position"),
          "translated labels preserve existing config keys");
    } finally {
      Files.deleteIfExists(dir.resolve("client.properties"));
      Files.delete(dir);
    }

    MenuRegistry<String> registry = new MenuRegistry<>();
    var first = registry.register(id("settings"), "Settings", parent -> parent + "/settings");
    check(first.success() && registry.entries().size() == 1, "menu registration");
    check(
        registry.create(id("settings"), "root").orElseThrow().equals("root/settings"),
        "factory receives its actual parent");
    check(
        registry.register(id("settings"), "Duplicate", parent -> "other").status()
            == RegistrationResult.Status.CONFLICT,
        "duplicate menu ID cannot replace owner");
    check(registry.create(id("missing"), "root").isEmpty(), "missing menu is explicit");
    expect(UnsupportedOperationException.class, () -> registry.entries().clear());
    check(
        registry.register(id("blank"), " ", parent -> "child").status()
            == RegistrationResult.Status.INVALID,
        "blank menu title rejected without a partial entry");
    check(registry.find(id("blank")).isEmpty(), "failed registration leaves catalog untouched");
    Registration token = first.value().orElseThrow();
    AtomicReference<Throwable> wrongThread = new AtomicReference<>();
    Thread worker =
        new Thread(
            () -> {
              try {
                token.close();
              } catch (Throwable error) {
                wrongThread.set(error);
              }
            });
    worker.start();
    worker.join();
    check(
        wrongThread.get() instanceof IllegalStateException
            && registry.find(id("settings")).isPresent(),
        "wrong-thread close leaves ownership intact");
    token.close();
    check(
        registry.find(id("settings")).isEmpty(),
        "owner can still close after wrong-thread attempt");
    var second = registry.register(id("settings"), "New Settings", parent -> "new");
    token.close();
    check(
        registry.find(id("settings")).orElseThrow().title().equals("New Settings"),
        "old token cannot remove replacement");
    second.value().orElseThrow().close();
    registry.register(id("null"), "Null", parent -> null);
    expect(NullPointerException.class, () -> registry.create(id("null"), "root"));
    registry.register(id("parent"), "Parent", parent -> parent);
    expect(IllegalArgumentException.class, () -> registry.create(id("parent"), "root"));
    registry.register(
        id("throws"),
        "Failure",
        parent -> {
          throw new IllegalArgumentException("factory");
        });
    expect(IllegalArgumentException.class, () -> registry.create(id("throws"), "root"));
    check(registry.entries().size() == 3, "failed factory does not mutate registration ownership");

    List<String> rows = List.of("Hidden", "Vị trí ngang", "Tốc độ", "Đường dẫn", "Menu Settings");
    var page = ListViewport.select(rows, s -> !s.equals("Hidden"), s -> s, "", 0, 2);
    check(
        page.items().equals(List.of("Vị trí ngang", "Tốc độ")) && page.total() == 4,
        "hidden rows removed before pagination");
    check(
        ListViewport.select(rows, s -> true, s -> s, "VI TRI", 0, 2)
            .items()
            .equals(List.of("Vị trí ngang")),
        "accent-insensitive and case-insensitive search");
    check(
        ListViewport.select(rows, s -> true, s -> s, "duong dan", 0, 2)
            .items()
            .equals(List.of("Đường dẫn")),
        "Vietnamese crossed d normalizes");
    check(
        ListViewport.select(rows, s -> true, s -> s, "settings menu", 0, 2)
            .items()
            .equals(List.of("Menu Settings")),
        "multiword search does not require the same word order");
    check(
        ListViewport.select(rows, s -> true, s -> s, "missing", 200, 2).total() == 0,
        "no-results page clamps safely");
    var end = ListViewport.select(rows, s -> true, s -> s, "", 100, 2);
    check(
        end.offset() == 3 && end.items().equals(List.of("Đường dẫn", "Menu Settings")),
        "offset clamps after filtering");
    check(
        ListViewport.select(rows, s -> true, s -> s, "", -10, 2).offset() == 0,
        "negative offset clamps");
    expect(UnsupportedOperationException.class, () -> page.items().add("mutation"));
    expect(
        IllegalArgumentException.class,
        () -> ListViewport.select(rows, s -> true, s -> s, "", 0, 0));
    check(
        ListViewport.select(List.<String>of(), s -> true, s -> s, "", 0, 5).items().isEmpty(),
        "empty data does not fabricate rows");
    java.lang.System.out.println("PASS: " + checks + " beta API checks");
  }

  private static void check(boolean value, String message) {
    checks++;
    if (!value) throw new AssertionError(message);
  }

  private static void expect(Class<? extends Throwable> type, Runnable action) {
    checks++;
    try {
      action.run();
    } catch (Throwable error) {
      if (type.isInstance(error)) return;
      throw new AssertionError(error);
    }
    throw new AssertionError("Expected " + type);
  }
}
