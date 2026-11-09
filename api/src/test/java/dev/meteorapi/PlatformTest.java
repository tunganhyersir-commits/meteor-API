/* SPDX-License-Identifier: GPL-3.0-only */
package dev.meteorapi;

import dev.meteorapi.backport.FluidOpacity;
import dev.meteorapi.backport.Keybind;
import dev.meteorapi.backport.ListMode;
import dev.meteorapi.backport.SwingMode;
import net.minecraft.client.input.KeyInput;
import net.minecraft.nbt.NbtCompound;
import org.lwjgl.glfw.GLFW;

/**
 * Executes against actual 1.21.11 classes, without launching the renderer or connecting to a
 * server.
 */
public final class PlatformTest {
  private static int checks;

  public static void main(String[] args) throws Exception {
    Keybind bind = Keybind.fromKeys(GLFW.GLFW_KEY_A, GLFW.GLFW_MOD_CONTROL | GLFW.GLFW_MOD_SHIFT);
    check(
        bind.matches(new KeyInput(GLFW.GLFW_KEY_A, 0, GLFW.GLFW_MOD_CONTROL | GLFW.GLFW_MOD_SHIFT)),
        "modifier-aware key binding");
    check(
        !bind.matches(new KeyInput(GLFW.GLFW_KEY_A, 0, GLFW.GLFW_MOD_CONTROL)),
        "required modifier cannot be omitted");
    check(
        !bind.matches(
            new KeyInput(GLFW.GLFW_KEY_B, 0, GLFW.GLFW_MOD_CONTROL | GLFW.GLFW_MOD_SHIFT)),
        "different key rejected");
    check(Keybind.none().fromTag(bind.toTag()).equals(bind), "new NBT keybind format roundtrips");
    Keybind copy = bind.copy();
    bind.reset();
    check(copy.isSet() && !bind.isSet(), "copy and reset isolated");
    check(
        Keybind.fromKey(GLFW.GLFW_KEY_A)
            .matches(new KeyInput(GLFW.GLFW_KEY_A, 0, GLFW.GLFW_MOD_SHIFT)),
        "plain binds tolerate unrelated modifiers");
    NbtCompound legacy = new NbtCompound();
    legacy.putBoolean("isKey", true);
    legacy.putInt("value", GLFW.GLFW_KEY_C);
    legacy.putInt("modifiers", GLFW.GLFW_MOD_ALT);
    check(
        Keybind.none().fromTag(legacy).matches(new KeyInput(GLFW.GLFW_KEY_C, 0, GLFW.GLFW_MOD_ALT)),
        "legacy NBT format preserved");
    check(
        !copy.canBindTo(false, GLFW.GLFW_MOUSE_BUTTON_LEFT, 0),
        "reserved left click cannot be bound");
    check(!copy.canBindTo(true, GLFW.GLFW_KEY_ESCAPE, 0), "escape cannot be rebound");
    check(ListMode.Whitelist.allows(true) && !ListMode.Whitelist.allows(false), "whitelist policy");
    check(!ListMode.Blacklist.allows(true) && ListMode.Blacklist.allows(false), "blacklist policy");
    check(
        SwingMode.of(true) == SwingMode.Client && SwingMode.of(false) == SwingMode.Packet,
        "swing policy selection");
    check(
        FluidOpacity.Both.water() && FluidOpacity.Both.lava() && !FluidOpacity.None.water(),
        "fluid policy");
    check(
        dev.meteorapi.network.PacketUtils.getPackets().size() > 200,
        "all 1.21.11 packet constants enumerated");
    var type = dev.meteorapi.network.PacketUtils.getClientboundPackets().iterator().next();
    check(
        dev.meteorapi.network.PacketUtils.getPacket("clientbound/" + type.id()) == type,
        "direction-qualified packet lookup");
    check(
        dev.meteorapi.network.PacketUtils.getPacket("ClientboundAddEntityPacket") != null,
        "legacy Mojang packet alias preserved");
    check(
        dev.meteorapi.network.PacketUtils.getPacket("unknown.invalid.name") == null,
        "unknown packet identifier is explicit");
    check(
        dev.meteorapi.backport.Utils.modsMatch(
            GLFW.GLFW_MOD_CONTROL | GLFW.GLFW_MOD_CAPS_LOCK, GLFW.GLFW_MOD_CONTROL),
        "caps lock ignored in modifier matching");
    check(
        !dev.meteorapi.backport.Utils.modsMatch(
            GLFW.GLFW_MOD_CONTROL | GLFW.GLFW_MOD_SHIFT, GLFW.GLFW_MOD_CONTROL),
        "unexpected active modifier rejected");
    check(
        dev.meteorapi.ui.FileDialogs.openFile("bad/filter").isCompletedExceptionally(),
        "invalid dialog filter returns exceptional future instead of crashing a button callback");

    // These core types must link even when Meteor Client and Mod Menu are blocked entirely.
    java.net.URL[] urls =
        java.util.Arrays.stream(
                java.lang.System.getProperty("java.class.path").split(java.io.File.pathSeparator))
            .map(
                path -> {
                  try {
                    return java.nio.file.Path.of(path).toUri().toURL();
                  } catch (java.net.MalformedURLException e) {
                    throw new IllegalArgumentException(e);
                  }
                })
            .toArray(java.net.URL[]::new);
    try (java.net.URLClassLoader filter =
        new java.net.URLClassLoader(urls, ClassLoader.getPlatformClassLoader()) {
          @Override
          protected Class<?> loadClass(String name, boolean resolve) throws ClassNotFoundException {
            if (name.startsWith("meteordevelopment.") || name.startsWith("com.terraformersmc."))
              throw new ClassNotFoundException("Optional dependency blocked: " + name);
            return super.loadClass(name, resolve);
          }
        }) {
      for (String name :
          new String[] {
            "dev.meteorapi.MeteorApi",
            "dev.meteorapi.network.Packets",
            "dev.meteorapi.network.Payloads",
            "dev.meteorapi.ui.Panels",
            "dev.meteorapi.ui.PanelScreen",
            "dev.meteorapi.ui.Canvas",
            "dev.meteorapi.ui.FileDialogs",
            "dev.meteorapi.client.Clients",
            "dev.meteorapi.client.Client",
            "dev.meteorapi.client.ClientModule",
            "dev.meteorapi.game.GameAccess",
            "dev.meteorapi.game.InputState",
            "dev.meteorapi.render.WorldRendering",
            "dev.meteorapi.ui.Menus",
            "dev.meteorapi.ui.MenuRegistry",
            "dev.meteorapi.ui.Panels$Choice"
          }) {
        Class.forName(name, false, filter).getDeclaredMethods();
        checks++;
      }
    }
    check(
        dev.meteorapi.ui.Panels.Action.class.getConstructor(String.class, Runnable.class) != null,
        "previous action constructor remains present");
    check(
        dev.meteorapi.ui.Panels.Action.class.getRecordComponents().length == 2,
        "previous Action record shape remains unchanged");
    var action = new dev.meteorapi.ui.Panels.ConditionalAction("Disabled", () -> false, () -> {});
    check(!action.enabled().getAsBoolean(), "conditional action preserves enable predicate");
    if (args.length > 0) {
      var data = new java.util.LinkedHashMap<String, Object>();
      data.put("platformChecks", checks);
      data.put("minecraft", "1.21.11");
      data.put("packetTypes", dev.meteorapi.network.PacketUtils.getPackets().size());
      data.put("legacyPacketAliases", dev.meteorapi.network.PacketUtils.getLegacyMappings().size());
      data.put(
          "aliasesAbsentFrom12111",
          dev.meteorapi.network.PacketUtils.getLegacyMappings().keySet().stream()
              .filter(name -> dev.meteorapi.network.PacketUtils.getPacket(name) == null)
              .sorted()
              .toList());
      data.put("optionalDependenciesBlockedDuringCoreClassLinkCheck", true);
      data.put("gameLaunched", false);
      java.nio.file.Path report = java.nio.file.Path.of(args[0]);
      java.nio.file.Files.createDirectories(report.getParent());
      java.nio.file.Files.writeString(
          report,
          new com.google.gson.GsonBuilder().setPrettyPrinting().create().toJson(data) + "\n");
    }
    java.lang.System.out.println("PASS: " + checks + " Minecraft 1.21.11 platform checks");
  }

  private static void check(boolean result, String label) {
    checks++;
    if (!result) throw new AssertionError(label);
  }
}
