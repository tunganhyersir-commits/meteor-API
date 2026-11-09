/* SPDX-License-Identifier: GPL-3.0-only */
package dev.meteorapi;

import com.google.gson.*;
import java.io.ByteArrayInputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.zip.ZipInputStream;
import net.fabricmc.loader.api.Version;
import net.fabricmc.loader.api.metadata.version.VersionPredicate;

/**
 * Uses Fabric Loader's actual version-predicate parser for selected install profiles. No game
 * launch.
 */
public final class MetadataProfileTest {
  private record Mod(JsonObject metadata, Version version) {}

  public static void main(String[] args) throws Exception {
    Path root = Path.of(args[0]);
    Path api = root.resolve("api/build/libs/meteor-api-0.1.2-beta.jar");
    Path meteor = root.resolve("libs/meteor-client-1.21.11-86.jar");
    Path menu = root.resolve("libs/modmenu-17.0.0.jar");
    Path example = root.resolve("example-addon/build/libs/meteor-api-example-0.1.2-beta.jar");
    if (VersionPredicate.parse(">=0.2.0").test(Version.parse("0.1.2-beta")))
      throw new AssertionError(
          "The requested beta label must retain real semantic-version ordering");
    List<Map<String, Object>> reports = new ArrayList<>();
    for (List<Path> profile :
        List.of(
            List.of(api),
            List.of(api, meteor),
            List.of(api, menu),
            List.of(api, meteor, menu),
            List.of(api, example),
            List.of(api, meteor, menu, example))) {
      Map<String, Mod> mods = new LinkedHashMap<>();
      for (Path artifact : profile) add(Files.readAllBytes(artifact), mods);
      for (String[] builtin :
          new String[][] {{"minecraft", "1.21.11"}, {"fabricloader", "0.19.5"}, {"java", "21"}}) {
        JsonObject metadata = new JsonObject();
        metadata.addProperty("id", builtin[0]);
        metadata.addProperty("version", builtin[1]);
        mods.put(builtin[0], new Mod(metadata, Version.parse(builtin[1])));
      }
      int checked = 0;
      for (Mod mod : mods.values()) {
        JsonObject depends = mod.metadata.getAsJsonObject("depends");
        if (depends != null)
          for (var entry : depends.entrySet()) {
            Mod dependency = mods.get(entry.getKey());
            if (dependency == null || !matches(entry.getValue(), dependency.version))
              throw new AssertionError(
                  mod.metadata.get("id")
                      + " requires "
                      + entry
                      + "; selected="
                      + (dependency == null ? "absent" : dependency.version));
            checked++;
          }
        JsonObject breaks = mod.metadata.getAsJsonObject("breaks");
        if (breaks != null)
          for (var entry : breaks.entrySet()) {
            Mod target = mods.get(entry.getKey());
            if (target != null && matches(entry.getValue(), target.version))
              throw new AssertionError(
                  "Incompatible pair: " + mod.metadata.get("id") + " breaks " + entry);
          }
      }
      reports.add(
          Map.of(
              "artifacts",
              profile.stream().map(path -> path.getFileName().toString()).toList(),
              "selectedModVersions",
              mods.entrySet().stream()
                  .collect(
                      java.util.stream.Collectors.toMap(
                          Map.Entry::getKey,
                          entry -> entry.getValue().version.getFriendlyString())),
              "dependencyPredicatesChecked",
              checked));
    }
    Path report = root.resolve("docs/verification/metadata-profiles.json");
    Files.createDirectories(report.getParent());
    Files.writeString(
        report,
        new GsonBuilder()
                .setPrettyPrinting()
                .create()
                .toJson(
                    Map.of(
                        "profiles",
                        reports,
                        "versionParser",
                        "Fabric Loader 0.19.5 VersionPredicate",
                        "gameLaunched",
                        false))
            + "\n");
    java.lang.System.out.println(
        "PASS: 6 install-profile metadata checks; prerelease ordering preserved");
  }

  private static boolean matches(JsonElement predicate, Version version) throws Exception {
    if (predicate.isJsonArray()) {
      for (JsonElement alternative : predicate.getAsJsonArray())
        if (matches(alternative, version)) return true;
      return false;
    }
    return VersionPredicate.parse(predicate.getAsString()).test(version);
  }

  private static void add(byte[] bytes, Map<String, Mod> mods) throws Exception {
    Map<String, byte[]> entries = new HashMap<>();
    try (ZipInputStream zip = new ZipInputStream(new ByteArrayInputStream(bytes))) {
      for (var entry = zip.getNextEntry(); entry != null; entry = zip.getNextEntry()) {
        if (!entry.isDirectory()) entries.put(entry.getName(), zip.readAllBytes());
      }
    }
    JsonObject metadata =
        JsonParser.parseString(
                new String(entries.get("fabric.mod.json"), java.nio.charset.StandardCharsets.UTF_8))
            .getAsJsonObject();
    String id = metadata.get("id").getAsString();
    Version version = Version.parse(metadata.get("version").getAsString());
    Mod existing = mods.get(id);
    if (existing == null || existing.version.compareTo(version) < 0)
      mods.put(id, new Mod(metadata, version));
    JsonArray nested = metadata.getAsJsonArray("jars");
    if (nested != null)
      for (JsonElement entry : nested)
        add(entries.get(entry.getAsJsonObject().get("file").getAsString()), mods);
  }
}
