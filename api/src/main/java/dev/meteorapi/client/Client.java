/* SPDX-License-Identifier: GPL-3.0-only */
package dev.meteorapi.client;

import dev.meteorapi.MeteorApi;
import dev.meteorapi.setting.ConfigStore;
import dev.meteorapi.setting.Setting;
import dev.meteorapi.ui.Menus;
import dev.meteorapi.ui.Panels;
import dev.meteorlib.foundation.NamespacedId;
import dev.meteorlib.foundation.Registration;
import dev.meteorlib.foundation.RegistrationResult;
import dev.meteorlib.foundation.ResourceScope;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.text.Text;

/** An independent client instance with its own registries, config, commands, GUI and lifecycle. */
public final class Client implements AutoCloseable {
  public record Category(NamespacedId id, String title) {}

  public record CommandContext(Client client, List<String> arguments) {
    public void reply(String message) {
      client.reply(message);
    }
  }

  private record Command(String description, Consumer<CommandContext> action) {}

  private final String owner, title;
  private final ConfigStore config;
  private final Map<NamespacedId, Category> categories = new LinkedHashMap<>();
  private final Map<NamespacedId, ClientModule> modules = new LinkedHashMap<>();
  private final Map<String, Command> commands = new LinkedHashMap<>();
  private ResourceScope runtime;
  private final ResourceScope registrations = new ResourceScope();
  private boolean started, closed;

  Client(String owner, String title) {
    this.owner = owner;
    this.title = title;
    config =
        new ConfigStore(
            FabricLoader.getInstance().getConfigDir().resolve(owner + "/client.properties"));
    command(
        "help",
        "Show client commands",
        context ->
            commands.forEach(
                (name, value) -> reply("@" + owner + " " + name + " — " + value.description)));
    command(
        "modules",
        "Show modules",
        context ->
            modules.values().forEach(module -> reply(module.id().path() + ": " + module.active())));
    command(
        "toggle",
        "toggle <module-id>",
        context -> {
          if (context.arguments.isEmpty()) {
            reply("Usage: @" + owner + " toggle <module-id>");
            return;
          }
          ClientModule module = modules.get(new NamespacedId(owner, context.arguments.getFirst()));
          if (module == null) reply("Unknown module");
          else {
            module.toggle();
            saveSafely();
            reply(module.title() + ": " + module.active());
          }
        });
    command(
        "save",
        "Save client configuration",
        context -> {
          try {
            save();
            reply("Configuration saved");
          } catch (IOException | RuntimeException error) {
            MeteorApi.LOG.warn("Client {} config save failed", owner, error);
            reply("Cannot save configuration: " + error.getMessage());
          }
        });
    command(
        "load",
        "Load client configuration",
        context -> {
          try {
            load();
            reply("Configuration loaded");
          } catch (IOException e) {
            reply("Cannot load config: " + e.getMessage());
          }
        });
  }

  public String owner() {
    return owner;
  }

  public String title() {
    return title;
  }

  public boolean started() {
    return started;
  }

  public ConfigStore config() {
    return config;
  }

  public List<ClientModule> modules() {
    MeteorApi.requireClientThread();
    return List.copyOf(modules.values());
  }

  public List<Category> categories() {
    MeteorApi.requireClientThread();
    return List.copyOf(categories.values());
  }

  public Optional<ClientModule> findModule(String local) {
    MeteorApi.requireClientThread();
    return Optional.ofNullable(modules.get(new NamespacedId(owner, local)));
  }

  public RegistrationResult<Category> category(String local, String title) {
    MeteorApi.requireClientThread();
    NamespacedId id = new NamespacedId(owner, local);
    if (started || closed) return failure("Register categories before starting the client");
    if (categories.containsKey(id)) {
      if (!java.util.Objects.equals(categories.get(id).title(), title))
        return failure("Category ID already has a different title: " + id);
      return new RegistrationResult<>(
          RegistrationResult.Status.ALREADY_PRESENT,
          Optional.of(categories.get(id)),
          "already present");
    }
    Category category = new Category(id, title);
    categories.put(id, category);
    return registered(category);
  }

  public <T extends ClientModule> RegistrationResult<T> module(T module) {
    MeteorApi.requireClientThread();
    if (started || closed) return failure("Register modules before starting the client");
    if (!module.id().namespace().equals(owner) || !categories.containsKey(module.category()))
      return failure("Module owner/category is not registered on this client");
    if (modules.get(module.id()) == module)
      return new RegistrationResult<>(
          RegistrationResult.Status.ALREADY_PRESENT, Optional.of(module), "already present");
    if (modules.containsKey(module.id()))
      return failure("Module ID already exists: " + module.id());
    List<Setting<?>> all = new ArrayList<>(module.settings());
    all.add(module.persistedEnabled);
    var ids = new HashSet<NamespacedId>();
    config.settings().forEach(setting -> ids.add(setting.id()));
    for (Setting<?> setting : all) {
      if (!setting.id().namespace().equals(owner)
          || !setting.id().path().startsWith(module.id().path() + "/"))
        return failure("Setting must belong to its module: " + setting.id());
      if (!ids.add(setting.id())) return failure("Duplicate setting ID: " + setting.id());
    }
    all.forEach(config::add);
    module.freezeSettings();
    modules.put(module.id(), module);
    return registered(module);
  }

  public RegistrationResult<Registration> command(
      String name, String description, Consumer<CommandContext> action) {
    MeteorApi.requireClientThread();
    if (closed) return failure("Client is closed");
    dev.meteorlib.foundation.NameRules.scoped(owner, name);
    java.util.Objects.requireNonNull(description);
    java.util.Objects.requireNonNull(action);
    if (commands.containsKey(name)) return failure("Command already exists: " + name);
    Command command = new Command(description, action);
    commands.put(name, command);
    Registration once = Registration.once(() -> commands.remove(name, command));
    Registration token =
        () -> {
          MeteorApi.requireClientThread();
          once.close();
        };
    registrations.own(token);
    return registered(token);
  }

  public RegistrationResult<Registration> hud(String local, Consumer<MeteorApi.HudEvent> renderer) {
    MeteorApi.requireClientThread();
    if (closed) return failure("Client is closed");
    var result = MeteorApi.hud().listen(new NamespacedId(owner, "hud/" + local), renderer);
    result.value().ifPresent(registrations::own);
    return result;
  }

  /** Own an additional native menu for this client; the main menu is installed by start(). */
  public RegistrationResult<Registration> menu(
      String local, String title, java.util.function.Function<Screen, Screen> factory) {
    MeteorApi.requireClientThread();
    if (closed) return failure("Client is closed");
    if (local.equals("main")) return failure("Menu path main is reserved for the client screen");
    var result = Menus.register(new NamespacedId(owner, local), title, factory);
    result.value().ifPresent(registrations::own);
    return result;
  }

  public boolean start() {
    MeteorApi.requireClientThread();
    if (closed) return false;
    if (started) return true;
    runtime = new ResourceScope();
    var menu = Menus.register(new NamespacedId(owner, "main"), title, this::screen);
    if (!menu.success()) {
      runtime.close();
      runtime = null;
      MeteorApi.LOG.warn(menu.message());
      return false;
    }
    runtime.own(menu.value().orElseThrow());
    var keys =
        MeteorApi.keys()
            .listen(
                new NamespacedId(owner, "_client-keys"),
                event -> {
                  if (MinecraftClient.getInstance().currentScreen != null) return;
                  for (ClientModule module : modules.values())
                    if (module.matches(event)) {
                      module.toggle();
                      saveSafely();
                    }
                });
    if (!keys.success()) {
      runtime.close();
      runtime = null;
      MeteorApi.LOG.warn(keys.message());
      return false;
    }
    runtime.own(keys.value().orElseThrow());
    started = true;
    try {
      load();
    } catch (IOException | RuntimeException e) {
      MeteorApi.LOG.warn("Client {} config load failed", owner, e);
    }
    return true;
  }

  public void save() throws IOException {
    MeteorApi.requireClientThread();
    for (ClientModule module : modules.values()) module.persistedEnabled.set(module.active());
    config.save();
  }

  public void load() throws IOException {
    MeteorApi.requireClientThread();
    config.load().forEach(MeteorApi.LOG::warn);
    if (started)
      for (ClientModule module : modules.values()) {
        if (module.persistedEnabled.get()) module.enable();
        else module.disable();
      }
  }

  private void saveSafely() {
    try {
      save();
    } catch (IOException | RuntimeException e) {
      MeteorApi.LOG.warn("Client {} config save failed", owner, e);
    }
  }

  public void execute(String input) {
    MeteorApi.requireClientThread();
    try {
      List<String> args = CommandLine.parse(input);
      String name = args.isEmpty() ? "help" : args.getFirst();
      Command command = commands.get(name);
      if (command == null) {
        reply("Unknown local command: " + name);
        return;
      }
      command.action.accept(
          new CommandContext(this, args.isEmpty() ? List.of() : args.subList(1, args.size())));
    } catch (RuntimeException e) {
      MeteorApi.LOG.warn("Client {} command failed", owner, e);
      reply("Command failed: " + e.getMessage());
    }
  }

  public void reply(String message) {
    MeteorApi.requireClientThread();
    var hud = MinecraftClient.getInstance().inGameHud;
    if (hud == null) MeteorApi.LOG.info("[{}] {}", title, message);
    else hud.getChatHud().addMessage(Text.literal("[" + title + "] " + message));
  }

  public Screen screen(Screen parent) {
    MeteorApi.requireClientThread();
    var panel =
        Panels.create(title)
            .searchable("Tìm mô-đun...")
            .label("Client: " + owner + " · @" + owner + " help");
    for (Category category : categories.values()) {
      panel.label(category.title());
      for (ClientModule module : modules.values())
        if (module.category().equals(category.id())) {
          panel.button(
              module.title() + " · " + (module.active() ? "Bật" : "Tắt"),
              () -> {
                module.toggle();
                saveSafely();
                MinecraftClient.getInstance().setScreen(screen(parent));
              });
          panel.button(
              "Cấu hình: " + module.title(),
              () ->
                  MinecraftClient.getInstance()
                      .setScreen(
                          settingsScreen(module, MinecraftClient.getInstance().currentScreen)));
        }
    }
    return panel.onClose(this::saveSafely).build(parent);
  }

  @SuppressWarnings({"unchecked", "rawtypes"})
  private Screen settingsScreen(ClientModule module, Screen parent) {
    var panel =
        Panels.create(module.title()).searchable("Tìm cài đặt...").label(module.description());
    for (Setting<?> setting : module.settings()) {
      if (setting.get() instanceof Boolean)
        panel.toggle(setting.label(), (Setting<Boolean>) setting);
      else if (setting.get() instanceof Enum value)
        panel.choice(setting.label(), (Setting) setting, value.getDeclaringClass());
      else panel.field(setting.label(), setting);
    }
    return panel.onClose(this::saveSafely).build(parent);
  }

  @Override
  public void close() {
    MeteorApi.requireClientThread();
    if (closed) return;
    saveSafely();
    for (ClientModule module : modules.values()) module.disable();
    try {
      if (runtime != null) runtime.close();
    } catch (RuntimeException e) {
      MeteorApi.LOG.warn("Client {} runtime cleanup failed", owner, e);
    }
    try {
      registrations.close();
    } catch (RuntimeException e) {
      MeteorApi.LOG.warn("Client {} registration cleanup failed", owner, e);
    } finally {
      started = false;
      closed = true;
      Clients.remove(this);
    }
  }

  private static <T> RegistrationResult<T> registered(T value) {
    return new RegistrationResult<>(
        RegistrationResult.Status.REGISTERED, Optional.of(value), "registered");
  }

  private static <T> RegistrationResult<T> failure(String message) {
    return new RegistrationResult<>(RegistrationResult.Status.CONFLICT, Optional.empty(), message);
  }
}
