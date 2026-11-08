Hello everyone! This is a project I planned and built myself. The concept comes from Meteor’s addon API, combined with additional systems for creating interfaces, managing modules, observing network traffic, and developing custom Minecraft clients.

**Meteor API** is an independent library targeting **Minecraft 1.21.11, Fabric Loader 0.19.5, and Java 21**. My goal is to provide reusable infrastructure for many kinds of clients, including utility clients, gameplay clients, clients with hack or cheat modules, performance tools, and entirely custom client projects.

The idea is to make common development tasks easier while preserving access to Minecraft’s underlying objects and rendering systems.

Meteor API and Meteor Client have separate identities:

| Component | Purpose | Main access point |
|---|---|---|
| **Meteor API** — `meteor-api` | Independent library and client development SDK | `dev.meteorapi.MeteorApi` |
| **Meteor Client** — `meteor-client` | Meteor’s existing client, modules, HUD, and GUI systems | `meteordevelopment.meteorclient.*` |
| **Optional integration bridge** | Access Meteor’s systems when Meteor Client is installed | `dev.meteorapi.compat.client.MeteorClientApi` |

The library can operate independently. It also includes an optional bridge targeting **Meteor Client 1.21.11 build 86**. Its own mod ID, packages, and registries help avoid duplicate classes and registrations when both are installed.

The current API includes:

- **Client development:** `Clients`, `Client`, and `ClientModule` provide client ownership, categories, module registration, activation, configuration, and lifecycle management.
- **Registration and cleanup:** `NamespacedId`, `RegistrationResult`, and `ResourceScope` help identify conflicts and release listeners, tasks, and other resources.
- **Events:** `EventChannel` supports listener priorities, registration tokens, and isolation of callback errors.
- **Settings and configuration:** `Settings`, `Setting`, and `ConfigStore` support typed values, validation, defaults, reset behavior, visibility rules, change listeners, and UTF-8 configuration files.
- **GUI development:** `Panels`, `PanelScreen`, `Canvas`, and `FileDialogs` provide screens, buttons, toggles, input fields, scrolling, drawing helpers, and asynchronous file selection.
- **HUD and world rendering:** `MeteorApi.hud()` and `WorldRendering` expose overlay and 3D rendering hooks, with access to native rendering contexts.
- **Networking:** `Packets` provides send, receive, enqueue, disconnect, and error observations. `Payloads` supports typed custom payload registration and communication during play and configuration phases.
- **Input and commands:** Keybinds support modifiers, while each client can register local commands such as `@my-client toggle status`.
- **Game access:** `GameAccess` and `InputState` provide convenient access to client state and input.
- **Tasks and performance tools:** `Tasks`, `Profiler`, and `WorkBudget` support background work, timing measurements, and controlled task processing.
- **Compatibility and backports:** Selected Meteor 26.3 settings, widgets, keybind behavior, packet utilities, rendering helpers, and other utilities have been adapted to 1.21.11.

Internally, each client uses its own namespace. Modules with the same local name can belong to different clients without overwriting one another. Modules normally wait until a world is available, release their resources when that world closes, and recreate their runtime resources when appropriate.

Packet callbacks can observe the original packet on its originating thread or receive immutable diagnostic snapshots on the client thread. These observers do not automatically modify traffic or prevent server disconnections. Custom payload communication requires a compatible receiving endpoint.

To get started:

1. Install Minecraft **1.21.11** with Fabric Loader **0.19.5** and Java **21**.
2. Place `meteor-api-0.2.0.jar` in the `mods` folder, replacing the previous 0.1 runtime if installed.
3. Optionally install Meteor Client build 86, Mod Menu 17.0.0, or the example addon. Keep only one Meteor Client JAR.
4. Press **F8** to open the API interface. With the example addon installed, **F9** opens its GUI and **F10** toggles its HUD.
5. For development, create a client with `Clients.create(...)`, register your categories and modules, attach settings and callbacks, and start the client.

The broader plan is to expand the backports, improve documentation and examples, and make client development more consistent without removing advanced capabilities.

Version **0.2.0** has passed **127 automated checks and four installation-metadata profiles**. Live Minecraft testing is still pending, and the Meteor 26.3 backport is not yet complete. The source package includes API inventories and a ledger identifying completed, adapted, and pending work.

This is an independent derivative project, not an official Meteor Development release. Meteor-derived code retains its attribution and GPL-3.0-only licensing.
