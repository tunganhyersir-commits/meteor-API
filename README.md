# Meteor API 0.2.0 — Complete Open Source Guide

A project introduction, installation manual, developer handbook, source-based API reference, and contribution guide.

**Minecraft 1.21.11 · Fabric Loader 0.19.5 · Java 21**

This manual describes the supplied Meteor API 0.2.0 release.
Implemented features, optional integrations, selected backports, and future ideas are identified separately.
Paths in the guide are relative to the extracted `MeteorAPI-0.2.0` source project unless another location is stated.

## 1. Project introduction

Hello everyone! This is a project I planned and built myself. The concept is inspired by Meteor's addon API, combined with additional systems for building interfaces, organizing modules, observing network traffic, and creating custom Minecraft clients.

The project is called **Meteor API**, and it is **open source**.
It is an independent library mod targeting Minecraft 1.21.11, Fabric Loader 0.19.5, and Java 21.
It provides reusable infrastructure for utility clients, gameplay clients, clients containing hack or cheat modules, performance tools, and entirely custom client projects.

My goal is to make the foundations of client development easier to understand and reuse.
Instead of rebuilding a settings system, configuration store, module manager, or packet diagnostic interface for every project, a developer can use the library's shared building blocks and concentrate on the behavior of their own client.

The project combines an independent SDK with optional integration paths.
You can create a client without installing Meteor Client, or deliberately use the supported Meteor bridge when your addon needs the original Meteor systems.
Convenience helpers preserve access to native Minecraft or Fabric objects where provided, allowing developers to go beyond the simplest examples.

Because the project is open source, its implementation can be inspected and built from the supplied source.
Contributors can propose fixes, improve examples, extend documentation, and work through the recorded backport tasks.
Meteor-derived code retains attribution to Meteor Development.
This is an independent derivative project, not an official Meteor Development release.

Version 0.2.0 includes selected adaptations from the supplied Meteor 26.3 reference.
The backport is still in progress.
The source release includes a declaration ledger that distinguishes completed adaptations, existing baseline declarations, mapping candidates, semantic-review tasks, and pending work.

## 2. Who the library is for

Meteor API is intended for developers who want to build Minecraft client mods around reusable infrastructure.
Its architecture does not assume that every feature is a combat module, a visual module, or a performance module.
Those categories describe possible applications of the infrastructure.

Examples include:

- An independent client with several configurable module categories.
- A HUD displaying player information or connection diagnostics.
- A screen for managing tools and local preferences.
- A rendering experiment using native GUI and world contexts.
- A diagnostic client observing decoded packet metadata.
- A performance tool that profiles work and spreads processing across ticks.
- A mod exchanging typed custom payloads with a compatible server component.
- A Meteor addon using scoped registration helpers and selected backported settings.

Installing the API supplies the library.
The client or addon using it supplies its actual gameplay features.
The SDK does not automatically install every feature that its infrastructure could support.

## 3. Open source identity

The project's new and adapted source declares **GPL-3.0-only**.
The complete source release includes `LICENSE` and `NOTICE.md`.
Read those files when using or redistributing the work.

The source includes Meteor-derived work and credits Meteor Development.
Preserved third-party projects retain their own licenses and notices.
Keeping a reference project in the source archive does not change its ownership or mean that all of its features are compiled into Meteor API.

Open source makes inspection and contribution possible.
It does not imply that every feature is finished or that every possible combination of mods has been tested.
The project therefore records both implemented behavior and practical verification limits.

## 4. Platform and version requirements

| Component | Version or baseline | Purpose |
|---|---|---|
| Minecraft | `1.21.11` | Exact game target declared by this release |
| Fabric Loader | `0.19.5` | Pinned build dependency and intended installation version |
| Java | `21` | Build toolchain and active bytecode target |
| Meteor API | `0.2.0` | Independent library version |
| Optional Meteor Client | `1.21.11-86` | Exact bridge baseline checked by its availability helper |
| Optional Mod Menu | `17.0.0` | Configuration-screen integration baseline |
| Gradle wrapper | `9.2.1` | Supplied build wrapper |
| Fabric Loom | `1.14.10` | Pinned build plugin |
| Yarn mappings | `1.21.11+build.3` | Mapping names used by active source |

The runtime metadata declares a Loader minimum of `>=0.19.5`.
That minimum is not a record of testing every later Loader release.
Use Loader 0.19.5 when reproducing the intended installation.

The API is a client-environment mod.
Do not treat its JAR as a dedicated-server mod.
A server participating in a custom payload protocol needs its own suitable implementation.

## 5. Meteor API versus Meteor Client

| Component | Mod ID | Main access path | Role |
|---|---|---|---|
| Meteor API | `meteor-api` | `dev.meteorapi.MeteorApi` | Independent library and client SDK |
| Meteor Client | `meteor-client` | `meteordevelopment.meteorclient.*` | Original Meteor systems and modules |
| Optional bridge | Part of Meteor API | `dev.meteorapi.compat.client.MeteorClientApi` | Access to the supported original Meteor systems |
| Foundation | Nested support library | Some types retain `dev.meteorlib.foundation.*` | IDs, ownership, services, scheduling, and Java-only support |

Use `MeteorApi` for the independent entry point.
Use `Clients` and `ClientModule` for clients built on the standalone SDK.
Use `MeteorClientApi`, `AddonRegistry`, and `ManagedModule` for code that intentionally depends on Meteor Client.

The independent API JAR does not embed a second original Meteor implementation under the same implementation class names.
It does not create a replacement copy of Meteor's `Modules` singleton.
The optional bridge returns the actual supported Meteor systems.

Separate namespaces prevent many identity collisions.
They cannot automatically coordinate arbitrary modules that both change movement, camera, input, or rendering state.

## 6. Choosing the correct file

| Download | Contains | Use |
|---|---|---|
| `meteor-api-0.2.0.jar` | Compiled independent library | Install in `mods` |
| `Meteor-API-0.2.0-INSTALL.zip` | API and optional installation components | Extract and select JARs |
| `Meteor-API-0.2.0-Fabric-1.21.11-Loader-0.19.5-SOURCE.zip` | Complete Gradle source project and reports | Read, edit, audit, and build |
| Documentation bundle | This guide, active Java source copies, and selected records | Read and learn offline |

If you want to see `.java` files, open the source distribution.
The installation ZIP is not the complete development project.
Compiled `.class` files inside a JAR are different from the supplied editable Java source.

The documentation bundle is a reading companion.
Use the complete source release for the full Gradle wrapper, dependencies, build inputs, and upstream reference trees.

## 7. Installing the API

1. Select a Minecraft 1.21.11 instance.
2. Configure it with Fabric Loader 0.19.5.
3. Select Java 21 as the instance runtime.
4. Close Minecraft before replacing mod files.
5. Open that instance's `mods` directory.
6. Place `meteor-api-0.2.0.jar` inside it.
7. Start the instance.
8. Press F8 to open the API panel.

Launchers may keep several independent instance folders.
Check the game directory used by the instance you actually launch.
A JAR placed in another instance will not appear in this one.

The API includes its foundation and four required Fabric API submodules as nested JARs.
You do not need the full Fabric API distribution solely for the included library functionality.
Other installed mods may have their own Fabric API dependencies.

## 8. Installing optional components

For the optional Meteor bridge, add the original Meteor Client 1.21.11 build 86 JAR.
Keep exactly one Meteor Client JAR in the instance.
The independent API remains installed alongside it.

For Mod Menu configuration access, add Mod Menu 17.0.0.
Meteor API is marked as a library entry.
If it is hidden in Mod Menu, enable the display of library entries and open its configuration action.

For the supplied demonstrations, add `meteor-api-example-0.2.0.jar`.
The example does not require Meteor Client.

Extract the installation ZIP before choosing JARs.
Do not put the ZIP itself in the `mods` directory and expect Fabric to load its contents as separate mods.

## 9. Migrating from version 0.1

The earlier `meteor-lib-runtime-0.1.0` design contained Meteor implementation code.
Version 0.2.0 uses an independent API design with optional integration.

Remove the previous 0.1 runtime/API artifacts before adopting the new release.
Do not keep that old bundled runtime alongside an original Meteor Client installation.
The new metadata declares a conflict with `meteor-lib-api` versions below 0.2.0.

Back up configuration files before changing an established instance.
The independent API configuration remains separate from original Meteor settings and NBT.
This guide does not claim automatic migration of every old addon or saved format.

For code migration, review dependency metadata, package imports, registration ownership, and settings persistence.
Do not assume that renaming a JAR makes an old binary target the new API.

## 10. Keyboard controls and first use

| Key | Owner | Default action |
|---|---|---|
| F8 | Meteor API | Open or close the API panel |
| F9 | Optional example addon | Open or close the example screen |
| F10 | Optional example client | Toggle its Status HUD module |

F9 and F10 depend on the optional example mod.
They are not universal shortcuts installed by every client built on the SDK.

The API panel exposes its open-key setting.
F8 is represented by GLFW code `297` in that configuration.
Setting the open key to `-1` disables the API shortcut.

The F8 handler can act while another screen exists.
Standalone module toggles are skipped while a screen is open.
These two input policies serve different purposes.

Some original interface labels are Vietnamese.
This English guide uses English tutorial labels; original source views preserve the implementation's text.

## 11. Where the Java source is located

The project uses multiple Gradle modules.
Java code is inside the module source trees instead of one root-level `src` directory.

| Path | Contents |
|---|---|
| `api/src/main/java/` | Minecraft-facing APIs, clients, GUI, networking, render hooks, integrations |
| `foundation/src/main/java/` | Java-only lifecycle, events, settings, tasks, ownership, services |
| `example-addon/src/main/java/` | Example client, initializer, and payload |
| `foundation/src/test/java/` | Core verification programs |
| `api/src/test/java/` | Platform and metadata checks |
| `api/src/main/resources/` | Mod metadata and mixin configuration |
| `upstream/` | Preserved upstream/reference material |
| `history/` | Earlier project design |
| `docs/generated/` | Source inventories and API/backport ledgers |

Start with `MeteorApi.java`, `Clients.java`, `ClientModule.java`, and `ExampleClient.java`.
The active Java inventory contains 76 files including tests and examples.
That count is separate from the much larger reference inventory.

Some foundation types intentionally retain `dev.meteorlib.foundation` packages.
Import the names declared by their source.
Do not mechanically change those imports to a guessed package prefix.

## 12. Opening the Gradle project

Extract the source ZIP before opening the project.
Open the `MeteorAPI-0.2.0` root in an IDE with Gradle support.
Select JDK 21 for both the project SDK and Gradle JVM.
Import the existing build rather than copying a few files into an unrelated empty project.

The active projects are `foundation`, `api`, and `example-addon`.
Historical and upstream source is retained for reference and is not compiled into the active API just because it appears in the archive.

Source references can contain their own Minecraft or Java versions.
Those versions identify their original context.
Do not globally replace every version string in the archive with 1.21.11.

## 13. Building and verifying

On Windows:

```powershell
.\gradlew.bat :foundation:check :api:build :example-addon:build
py -3 tools\verify_release.py
```

The supplied `BUILD-WINDOWS.bat` runs the main build-and-verify sequence.
Keep the wrapper, Gradle files, and source modules together.

On a Unix-like development system:

```bash
./gradlew :foundation:check :api:build :example-addon:build
python3 tools/verify_release.py
```

Python is used by source analysis and release-verification tools.
Players installing a built JAR do not need Python just to use that JAR.

A first build can require network access for uncached dependencies.
The included local Maven mirror supplies selected pinned Fabric components.
It does not imply that every dependency of every first build is available offline.

The project includes publishing configuration.
That alone does not establish a public Maven repository containing this release.
This guide does not invent a repository URL or a remote dependency coordinate.

## 14. Understanding build outputs

`foundation` produces Java support code nested by the API.
`api` produces the independent mod.
`example-addon` produces an optional demonstration mod.

Loom can produce development and remapped artifacts with different purposes.
Use the release artifact selected by the verifier for ordinary installation.
Do not select a random development JAR because its name looks similar.

The verifier checks metadata, bytecode level, nested components, overlap with optional mods, and packaging details.
It stages artifacts in `dist`.
Recorded details are available in `docs/verification/release-checks.json`.

For development inside this source tree, the example depends on the API's `namedElements` and on `foundation`.
Its runtime metadata requires `meteor-api` 0.2.0.
Use that working example when setting up a client rather than guessing a complete external build recipe.

## 15. API group overview

| Group | Types | Responsibility |
|---|---|---|
| Entry point | `MeteorApi` | Shared channels, config, services, execution |
| Independent clients | `Clients`, `Client`, `ClientModule` | Owners, categories, modules, commands, client screens |
| Lifecycle | `FeatureLifecycle`, `ResourceScope`, `Registration` | Activation and cleanup |
| Naming | `NamespacedId`, `NameRules` | Stable ownership and legacy scoped names |
| Results | `RegistrationResult` | Explicit supported registration outcomes |
| Events | `EventChannel`, `BoundedMailbox` | Observers and bounded handoff |
| Settings | `Setting`, `Settings`, `ValueCodec`, `ConfigStore` | Typed values and persistence |
| GUI | `Panels`, `PanelScreen`, `Canvas`, `FileDialogs` | Screens, drawing, native selection |
| Network observation | `Packets`, `PacketUtils` | Decoded traffic observations and packet catalog |
| Custom networking | `Payloads` | Typed custom schemas and handlers |
| Rendering | `WorldRendering` | Native world context hooks |
| Game access | `GameAccess`, `InputState` | Actual client objects and input |
| Tasks | `Tasks`, `TickScheduler` | Worker and tick-based work |
| Performance | `Profiler`, `WorkBudget` | Timing and cooperative work admission |
| Optional integrations | `Integrations`, `MeteorClientApi`, `AddonRegistry` | Capabilities and supported Meteor systems |
| Selected backports | `backport.*`, `compat26.*` | Adapted utilities and compatibility types |

## 16. Namespaces and IDs

A full `NamespacedId` uses `namespace:path`.
For example, `my-client:status` identifies a module, and `my-client:status/x` identifies one of its settings.

```java
NamespacedId moduleId = new NamespacedId("my-client", "status");
NamespacedId optionId = new NamespacedId("my-client", "status/x");
```

Namespace validation permits lowercase letters, digits, underscores, periods, and hyphens.
The path pattern also permits slashes.
Invalid constructor arguments are rejected.

`NameRules.scoped` has a stricter owner/local-name pattern: `[a-z][a-z0-9_-]*`.
It produces a legacy scoped name such as `my-client.status`.
That dot-scoped string and a colon-separated `NamespacedId` are related naming tools with different contracts.

Two clients can each use local name `status` under different owners.
Two modules within the same owner still need distinct full IDs.
The standalone module registry permits multiple instances of one Java class when their IDs and settings are distinct.

The original Meteor registry has class-based constraints as well.
The optional registration guard respects those constraints.
Do not assume that the independent and upstream registries have identical rules.

## 17. Handling registration results

`RegistrationResult<T>` contains `status`, `value`, and `message`.
Its statuses are `REGISTERED`, `ALREADY_PRESENT`, `CONFLICT`, `INVALID`, and `FAILED`.
Successful results contain a value; failed results do not.

```java
var result = Clients.create("my-client", "My Client");
if (!result.success()) {
    MeteorApi.LOG.warn("Cannot create client: {}", result.message());
    return;
}
Client client = result.value().orElseThrow();
```

Inspect failures rather than silently ignoring an empty optional.
The compact examples emphasize the success path, but production initialization can report each rejected category, module, command, or listener.

Not every method converts every problem to a result.
Owner-thread checks, invalid constructors, and lower-level operations can throw.
For example, a duplicate `ServiceRegistry` registration throws.
Use each method's actual contract.

## 18. Creating an independent client

The recommended initialization order is:

1. Run on the Minecraft client thread.
2. Create the client with a unique owner.
3. Register categories.
4. Construct and register modules.
5. Register application commands.
6. Start the client.

```java
Clients.create("my-client", "My Client").value().ifPresent(client -> {
    client.category("render", "Rendering");
    client.module(new StatusModule());
    client.command("hello", "Print a local greeting",
        context -> context.reply("Hello from My Client"));
    client.start();
});
```

This fragment assumes `StatusModule` and imports are defined.
It uses the same real initialization structure as the supplied example.
Check registration results explicitly when diagnosing initialization.

Register categories and modules before `start()`.
The client checks module ownership, category membership, setting ownership, and duplicate option IDs.
Starting installs input handling and loads configuration.

`Clients.all()` provides a snapshot of registered clients on the client thread.
The F8 API panel uses that list to offer client-opening buttons.
Closing a client removes it from that list.

## 19. Writing a module

Use `dev.meteorapi.client.ClientModule` for an independent SDK module.
Its constructor takes module ID, category ID, title, and description.
Use `optionId(local)` to keep settings and listeners beneath the module's path.
Use `setting(value)` to include a setting in the client's configuration and generated settings screen.

```java
final class StatusModule extends ClientModule {
    private final Setting<Long> x = setting(
        Settings.longValue(optionId("x"), 8, 0, 10000));

    StatusModule() {
        super(new NamespacedId("my-client", "status"),
              new NamespacedId("my-client", "render"),
              "Status HUD", "A configurable status overlay.");
        bind(GLFW.GLFW_KEY_F10, 0);
    }

    @Override
    protected void onStart(ResourceScope scope) {
        var result = MeteorApi.hud().listen(optionId("draw"), event ->
            event.canvas().text("My Client is active", x.get().intValue(),
                                8, 0xFFFFFFFF));
        if (!result.success()) throw new IllegalStateException(result.message());
        scope.own(result.value().orElseThrow());
    }
}
```

The complete examples later in the guide provide relevant imports.
Tutorial fragments are explanatory; the original packaged examples are the previously built source.
The tutorial does not claim every fragment was compiled as a separate standalone file.

Use `onTick()` for short runtime work.
Use `onStop()` for application-specific restoration.
Transfer listener and task ownership to the scope supplied to `onStart()`.

The SDK uses `_enabled`, `_key`, and `_modifiers` option names internally.
Avoid creating user options that collide with those reserved paths.

## 20. Active versus running

`active()` describes the module's enabled intention.
`running()` additionally means its current runtime scope exists.

An enabled module normally waits until both world and player are present.
Its `onStart(scope)` runs when a world runtime becomes available.
When that world changes or closes, its old runtime resources are stopped and cleaned up.
The enabled intention can remain so that the module starts against a new world when appropriate.

Set `runInMenus = true` only for a module designed to run without a world.
That option changes availability policy.
It does not fabricate a player, world, or network connection.

Stable activation/deactivation operations are idempotent.
Reentrant transitions are refused.
Failed activation attempts cleanup and returns to inactive.
A managed runtime exception in a module tick is logged and disables that module.

Those mechanisms are not a guarantee against every JVM error, native fault, or unrelated mod failure.

## 21. Owning resources

`ResourceScope` owns `AutoCloseable` resources on the thread that creates it.
It closes resources in reverse acquisition order and attempts every cleanup.
Additional cleanup failures are attached to the first reported cleanup failure.

```java
scope.own(listenerToken);
scope.defer(() -> restoreLocalState());
```

This fragment assumes an acquired token and application-defined restoration method.
An already closed scope rejects new ownership.
Closing it a second time does not repeat every cleanup.

`Registration.once(action)` runs its action at most once even if close is attempted concurrently.
The action can still have an owner-thread requirement.
One-shot ownership does not make thread-confined cleanup legal from a Netty or worker thread.

Do not transfer a scope to a worker for mutation.
Return to its owner thread for lifecycle operations.

## 22. Local client commands

For owner `my-client`, built-in commands are:

```text
@my-client help
@my-client modules
@my-client toggle status
@my-client save
@my-client load
```

The toggle command expects a local module path, which the client resolves inside its owner namespace.
Register additional commands with `client.command(name, description, action)`.
The action receives a `CommandContext` with the client and parsed arguments.
Use `context.reply()` for a local response.

`CommandLine.parse` handles quoted arguments and escapes according to its source.
`client.execute()` expects the command portion, such as `hello`, without repeating the `@owner` prefix.

The chat hook consumes prefixes belonging to started independent clients.
A recognized local command is not sent as ordinary server chat.
An unknown or unstarted owner does not become local merely because the message starts with `@`.

The SDK leaves Meteor's normal dot-prefixed command system separate.

## 23. Typed settings

`Setting<T>` combines ID, description, default, current value, codec, validation, visibility, snapshot policy, and change listeners.
Convenience factories live in `Settings`.

| Factory | Value | Important behavior |
|---|---|---|
| `bool` | `Boolean` | Parses true/false text |
| `longValue` | `Long` | Preserves 64-bit values within inclusive bounds |
| `doubleValue` | `Double` | Requires finite bounds and values |
| `text` | `String` | Enforces maximum length |
| `enumeration` | Enum | Encodes enum names |
| `file` | `Path` or null | Accepts no selection or an existing regular file |
| `strings` | `List<String>` | Bounded, lossless UTF-8 string-list representation |
| `codec` | `ValueCodec<T>` | Creates a custom text encoder and decoder |

```java
var enabled = Settings.bool(new NamespacedId("my-client", "overlay/enabled"), true);
var limit = Settings.longValue(new NamespacedId("my-client", "overlay/limit"), 100, 1, 10000);
var title = Settings.text(new NamespacedId("my-client", "overlay/title"), "Overlay", 80);
```

`set(value)` returns false for a rejected value.
Setting an equal accepted value succeeds without emitting a new change.
`parse(text)` decodes and validates, converting supported invalid textual values to false.
`reset()` restores the default through the normal set path.

`changed()` compares current value with the default.
`isVisible()` evaluates the supplied visibility predicate.
For mutable custom values, provide a suitable snapshot function.
Generic typing alone does not make a mutable object immutable.

Change callbacks run on the thread posting the change.
They do not automatically move to the Minecraft client thread.

## 24. Configuration persistence

`ConfigStore` registers settings by unique IDs in a properties file.
An independent client uses `config/<owner>/client.properties`.
The shared API panel uses `config/meteor-api/settings.properties`.

Register settings before loading their values.
Adding the same object again returns `ALREADY_PRESENT`.
Adding a different object under an existing ID returns a conflict.

`load()` returns invalid-value notes.
Invalid entries preserve the previous accepted values.
Unknown properties remain retained when saving, helping avoid erasing entries from another version.

The loader refuses files larger than 1 MiB.
That bound belongs to configuration loading, not network packets.

Saving writes UTF-8 through a temporary file, requests an atomic replacement, and falls back to ordinary replacement if atomic movement is unsupported.
An I/O failure remains a failure rather than a successful-save claim.

The client saves through its toggle helpers, when its generated screen closes, and during orderly stopping.
A force-killed process or native crash may not run orderly shutdown callbacks.

## 25. Building screens

`Panels.create(title)` returns a native-screen builder.
It supports labels, buttons, generic setting fields, toggles, file selection, and a close callback.

```java
Screen parent = MinecraftClient.getInstance().currentScreen;
Screen screen = Panels.create("My Tools")
    .label("Settings for my independent client")
    .toggle("Enable overlay", enabled)
    .field("Display limit", limit)
    .button("Diagnostics", () -> MeteorApi.LOG.info("{}", Packets.statistics()))
    .onClose(() -> MeteorApi.LOG.info("Tools screen closed"))
    .build(parent);
MinecraftClient.getInstance().setScreen(screen);
```

The fragment assumes settings and imports are present.
Build and open screens on the client thread.
The supplied parent gives the return path.

`PanelScreen` does not pause the game.
It supports native-widget focus, scrolling, and keyboard/page navigation.
Visual behavior across GUI scales and tiny windows remains a live-game verification task.

Rows are snapshotted by `build()`.
The builder is not an automatically reactive layout framework.
Rebuild when a state change requires a different layout.

You can use native `Screen`, widgets, or a subclass of `PanelScreen` for more specialized interfaces.

## 26. Drawing with Canvas

`Canvas` wraps the real `DrawContext`.
Helpers draw text, rectangles, items, clipped content, and transformed GUI content.

```java
event.canvas().rectangle(4, 4, 180, 24, 0xCC000000);
event.canvas().text("Meteor API example", 10, 10, 0xFFFFFFFF);
```

Use this fragment inside a HUD callback receiving `MeteorApi.HudEvent`.
Colors are ARGB integers.
Rectangle width and height are sizes; the wrapper calculates end coordinates.

`context()` exposes the original drawing context.
Use it for operations outside the convenience surface.

`clip()` balances its scissor enable/disable operations in a finally block.
`transformed()` balances its GUI matrix push/pop.
They do not restore every possible renderer state that arbitrary callback code could change.

## 27. File selection

`FileDialogs` supplies asynchronous native open/save selection using TinyFD in the 1.21.11 backend.
Future overloads return `CompletableFuture<Optional<Path>>`.
An empty optional means cancellation; an exceptional future means failure.

```java
FileDialogs.openFile("txt;json;*").whenComplete((selection, error) -> {
    if (error != null) {
        MeteorApi.LOG.warn("File selection failed", error);
        return;
    }
    selection.ifPresent(path -> MeteorApi.execute(() ->
        MeteorApi.LOG.info("Selected {}", path)));
});
```

The `Consumer<File>` overload returns a successful selection on the client thread.
Future continuations do not all automatically execute there.
Use a deliberate handoff before changing screens or game state.

Filters are validated and limited to 256 characters.
Examples are `txt`, `json`, `txt;json`, and `*`.
Selecting a save path does not write application data.

`Settings.file` requires an existing regular file when non-null.
A brand-new save destination may not satisfy that validator.
Keep that workflow separate or use a custom setting.

Native dialogs have not been opened and validated on each platform in the recorded release tests.

## 28. Packet observations

`Packets` observes decoded Minecraft connection traffic on the client side.
Choose a listener style according to the information and thread you need.

`listen` receives the raw event containing actual packet and connection references.
`typed` filters actual packet class and phase.
`onClient` receives immutable metadata through a bounded queue drained by the client tick.

```java
var result = Packets.onClient(new NamespacedId("my-client", "traffic"), snapshot ->
    MeteorApi.LOG.info("{} {}", snapshot.phase(), snapshot.packetClass()));
if (result.success()) scope.own(result.value().orElseThrow());
```

The fragment assumes an owner-thread scope.
Own the token for the intended observation lifetime.

Raw callbacks run on the originating hook thread, potentially Netty.
Avoid blocking work or direct world/GUI mutation from that callback.

Snapshots contain sequence, timestamp, phase, packet class name, and origin thread name.
They do not retain packet buffers, payload data, connection addresses, or account objects.

## 29. Packet phases

| Phase | What the hook records | What it does not prove |
|---|---|---|
| `SEND` | Entry into the observed send method | Server acceptance |
| `ENQUEUED` | Return from that send method | Delivery or processing by the server |
| `RECEIVE` | Decoded packet reaching the observed receive path | Completed vanilla application |
| `DISCONNECT` | Beginning of disconnect processing | Ability to reverse the disconnection |
| `ERROR` | Connection error callback | Suppression of the error |

An earlier mod hook may stop a packet before it reaches this send hook.
A received bundle can appear as a wrapper packet.
Inspect its contents deliberately if your diagnostic needs individual members.

The side filter avoids counting the integrated server endpoint as another client endpoint.
Counters describe these particular hook locations.
They are not a universal capture of every transport-layer action.

The observers do not cancel, merge, reorder, deliberately throttle, or rewrite game traffic.
They cannot force a remote server to maintain a connection.
Observing a disconnect is different from preventing the server from disconnecting.

## 30. Snapshot queue and failures

The mailbox capacity is 2,048 snapshots.
At most 256 snapshots are drained per client tick.
When capacity is reached, a diagnostic snapshot is declined and the drop counter increases.
The corresponding game packet is not dropped by that diagnostic policy.

`statistics()` reports send attempts, enqueued observations, received observations, errors, dropped snapshots, and observer count.
Use those terms accurately in your interface.
Do not rename the enqueued counter to server-confirmed actions.

Packet channels detach a listener after three consecutive managed runtime exceptions.
Closing a registration cannot recall a callback that already started on another thread.
Account for that in-flight possibility during shutdown.

## 31. Packet catalog

`PacketUtils` enumerates actual 1.21.11 `PacketType` constants.
The recorded platform checks found 227 types.

Use direction-specific collections and lookup methods when direction matters.
The generic identifier lookup checks the clientbound map before serverbound.
String lookup understands `clientbound/`, `serverbound/`, and selected legacy aliases.

Lookups can return null when the target-version protocol lacks an equivalent.
Check results before use.
A future packet's name does not create a valid packet on the 1.21.11 protocol.

The platform report lists known aliases without target-version equivalents.

## 32. Typed custom payloads

`Payloads` manages mod-owned custom schemas and handlers.
It serves a different task from observing all decoded packets.

| Method | Phase and direction | Buffer family |
|---|---|---|
| `playSender` | Play C2S | `RegistryByteBuf` |
| `playReceiver` | Play S2C | `RegistryByteBuf` |
| `configurationSender` | Configuration C2S | `PacketByteBuf` |
| `configurationReceiver` | Configuration S2C | `PacketByteBuf` |

Define a namespaced `CustomPayload.Id<T>` and matching codec.
Register a compatible schema on both peers before using the channel.

```java
Payloads.playSender(ExamplePayload.ID, ExamplePayload.CODEC);
var receiver = Payloads.playReceiver(ExamplePayload.ID, ExamplePayload.CODEC,
    payload -> MeteorApi.LOG.info("Received {}", payload.text()));
var outcome = Payloads.sendPlay(new ExamplePayload("Hello"));
```

The example payload is included later.
Inspect registration results and own the receiver token in production code.

Send results are `SENT`, `NOT_CONNECTED`, and `CHANNEL_UNAVAILABLE`.
`SENT` is a local send outcome, not application-level acknowledgement.
Design a response payload if your application needs confirmation.

A vanilla server does not learn your schema from a client-side registration.

## 33. Payload ownership details

Phase and direction have separate registry slots.
The current repeated-registration checks compare codec object identity.
Keep a shared codec constant instead of recreating a new equivalent codec instance every time.

Codec registration is process-lived in the underlying Fabric API.
Closing a receiver token detaches its handler.
It does not remove the globally registered codec.

A later consumer can reuse an inactive handler slot with the same codec.
That does not authorize changing the schema under the same channel ID.

Upstream codec and receiver operations do not form a fully atomic, rollbackable transaction here.
Treat failures explicitly and inspect the log before retrying in one process.

Payload delivery is marshalled through client execution and checks that the handler still matches the expected slot.
Supported handler runtime exceptions are logged.

## 34. Client-thread execution and scheduling

`MeteorApi.execute(action)` submits work through the client executor and returns a future.
It is useful for appropriate thread handoff.
It does not make a long blocking action cheap; that action still runs on the client thread.

The shared tick scheduler has capacity for 4,096 pending tasks and a limit of 256 executions per tick.

```java
Registration token = MeteorApi.scheduler().schedule(20,
    () -> MeteorApi.LOG.info("Scheduled action"));
scope.own(token);
```

The delay is measured in client ticks rather than guaranteed wall-clock seconds.
Zero delay means next tick.
Negative delay is rejected.
Exhausted queue capacity is reported instead of accepting unlimited work.

Closing the token cancels a still-queued task.
Do not call the shared scheduler's tick manually or invoke the internal `MeteorApi.onTick` boundary from an addon.
The installed Minecraft hook advances it.

## 35. Background tasks

`Tasks.submit(callable, scope)` uses two bounded workers with a queue capacity of 64.
The returned future exposes success, failure, rejection, and cancellation.

Use workers for suitable CPU/file operations over independent data.
Submit and transfer ownership on the scope's owner thread.
Keep Minecraft world and rendering operations on their required game thread.

Cleanup requests cancellation and interruption.
Task code must cooperate; arbitrary blocking native work does not necessarily stop immediately.
Queue rejection exceptionally completes the future.

`Tasks.queued()` reports the background executor queue.
It is separate from the tick scheduler and packet snapshot mailbox.

## 36. Events and mailboxes

`EventChannel<E>` uses thread-safe registration bookkeeping and immutable dispatch snapshots.
Higher priority listeners run first; ties follow registration order.
Duplicate IDs conflict inside one channel.

Filters and callbacks execute on the publisher's thread.
A thread-safe registry does not make captured application state thread-safe.

The channel constructor chooses its consecutive-failure threshold.
Shared library channels normally use three.
The counter resets after a successful attempt, including a filter that rejects an event without throwing.

`BoundedMailbox<E>` is a separate queue helper.
`offer()` reports acceptance, while `drain()` runs receivers on the draining thread.
It does not choose a Minecraft thread or create an executor.

The generic mailbox drain does not itself provide the event channel's callback exception isolation.
`clear()` empties pending items; the implementation retains its historical drop count.

## 37. Typed shared services

`MeteorApi.services()` exposes a registry keyed by Java class tokens.
Registration checks the object's type and rejects duplicate ownership by throwing.

```java
Registration token = MeteorApi.services().register(MyService.class, service);
scope.own(token);
```

This fragment assumes an application-defined service type and instance.
Use `find(type)` for optional lookup and `require(type)` when absence is an error.

The removal token removes only the exact instance it registered.
An older token cannot remove an unrelated replacement instance.
Registry synchronization protects bookkeeping, not the service object's own methods.

## 38. Game objects and input

`GameAccess.client()` checks the client thread and returns the actual Minecraft client.
Player, world, inventory, and network accessors return optionals reflecting availability.
`inWorld()` requires both world and player; `requireWorld()` reports absence as an error.

Avoid retaining an obsolete world or player across disconnects and world transitions.
Module runtime scopes help align resources with those transitions.

`InputState` queries physical keyboard/mouse state through the client window.
Its pressed-state helper changes a Minecraft `KeyBinding`.
If a module changes input state, define how it restores that state when stopping.

The backported `Keybind` utility and the standalone module's toggle binding have different surfaces.
Mouse representation in the utility does not mean the module manager exposes every mouse-binding workflow.

## 39. HUD and world rendering

`MeteorApi.hud()` supplies a live GUI context and tick delta.
For a module-specific overlay, register inside `onStart` and own the token in its runtime scope.
`Client.hud()` is a convenience registration owned at the client level, which has a different lifetime.

`WorldRendering.listen()` exposes these stages:

- `BEFORE_ENTITIES`.
- `AFTER_ENTITIES`.
- `BEFORE_DEBUG`.
- `BEFORE_TRANSLUCENT`.
- `END_MAIN`.

Ordinary stage callbacks receive the full Fabric `WorldRenderContext`.
The wrapper balances its matrix push/pop.
Native consumers, command queues, pipeline timing, and buffer formats still need correct use.

`extraction()` exposes end-extraction context events.
`terrain()` exposes start-main terrain context events.
Their context types are distinct from the ordinary world-render callback context.

Balanced matrices are not complete restoration of every possible GPU/buffer state.
Live rendering and mod combinations still need actual in-game verification.

## 40. Profiling and work budgets

`Profiler.measure(id)` starts a sample and returns a one-shot token recording elapsed time on close.
Measurements aggregate count, total nanoseconds, and maximum nanoseconds by namespaced section.

```java
try (var timing = profiler.measure(new NamespacedId("my-client", "update"))) {
    updateLocalData();
}
```

The fragment assumes a profiler and application-defined operation.
Snapshots provide aggregate measurements, not a full frame history or an automatic diagnosis.

Create a fresh `WorkBudget` for the interval being managed.
`tryRun()` checks count and elapsed time before starting another unit.
It cannot preempt an action already running.

Split large operations into useful small units if you need cooperative limits.
These tools support optimization work; they do not promise an automatic FPS increase in every modpack.

## 41. Optional Meteor bridge

The independent API does not require Meteor Client.
Bridge types in `compat.client` and most `compat26` types deliberately reference Meteor classes.
Keep hard references behind optional loading paths if your addon must also work without Meteor.

`MeteorApi.hasMeteorClient()` checks installed mod identity.
`MeteorClientApi.isAvailable()` checks the exact supported friendly version, `1.21.11-86`.
`isReady()` additionally checks relevant initialization state.

Installed and ready are different conditions.
Use the proper initialization phase before requesting original Meteor systems.

The bridge exposes original modules, HUD, theme, commands, and event bus.
It does not mirror them into the independent client registry.

`MeteorClientApi.listen(object)` reference-counts subscriptions for the same object identity.
The listener still needs a package registered by the addon's Meteor entrypoint.

## 42. Guarded Meteor registration

`AddonRegistry(owner)` assigns names before forwarding to the original registries.
Factories must use the assigned scoped name.
Aliases must follow the owner policy.

Register categories in `MeteorAddon.onRegisterCategories()`.
The helper respects that upstream timing requirement rather than making category registration valid at arbitrary times.

Module checks include class ownership, names, and aliases.
Command checks include names and aliases.
HUD checks protect names from accidental replacement.

Category validation also checks equal Java string hashes because of the supported baseline's category equality behavior.
Different visible names can share a hash.

`ManagedModule` extends Meteor's original module class and supplies activation resource scopes.
`ClientModule` belongs to the independent SDK.
Choose according to the registry and lifecycle your project uses.

## 43. Other integrations

`Integrations.version(modId)` returns an installed version when present.
`installed()` reports its fixed known integration set, not every mod in the instance.

`packetFixerLimits()` reads selected supported getters from PacketFixer when available.
It does not change limits, copy decoder patches, or rewrite that mod's configuration.

`commonNetworkHandler()` returns the installed Common Networking handler through reflection.
Its optional object result avoids a hard dependency in the independent core.
Typed use requires the appropriate real dependency and API shape in your consuming project.

The preserved Python networking projects are reference material.
Their scanners, sniffers, firewall programs, and other tools are not compiled Java API features.

## 44. Selected 26.3 backports

The active runtime remains 1.21.11 with Java 21.
Newer reference source is used for comparison and selected implementation work.

Implemented groups include:

- Long, file, and packet-type settings in the optional Meteor compatibility path.
- A long editor preserving full integer width and a packet chooser.
- Theme/widget rendering helpers.
- Modifier-aware keybinds with legacy/current NBT handling.
- Asynchronous file dialogs using a target-compatible native backend.
- `ListMode` and `EntityAgeTest` helpers.
- `SwingMode` and display stack helpers adapted to target classes.
- The real 1.21.11 packet catalog and selected legacy aliases.
- Implemented outline queue, vertex naming, and renderer constructor adaptations.
- Utility and HUD-visibility helpers.

`FluidOpacity` is a policy type; it does not patch original Meteor Xray by its existence.
The optional weather module is not automatically registered into every client.

Backported types use library namespaces where necessary.
Existing 26.3 addon source may need adaptation.
The library does not make every binary for a different Minecraft release compatible.

## 45. Backport ledger interpretation

`BACKPORT-26.3-LEDGER.csv` and JSON classify extracted reference declarations.
An entry's status is essential.

An unchanged declaration also appears in the target baseline index.
A mapping-normalized candidate has an apparently corresponding normalized signature.
Neither establishes identical behavior, defaults, nullability, or native backend semantics.

Adapted/ported statuses identify implemented work in their stated group.
Pending and semantic-review statuses remain unresolved at that level.
Version-specific game hooks are distinguished from stable public SDK contracts.

The class-name analysis joins official and Yarn names through 1.21.11 obfuscated mappings.
Changing an import cannot create a renderer backend or protocol feature absent from the target game.

The parser records a limitation in the supplied 26.3 `SlotUtils` unnamed-pattern syntax.
Raw source and the parser note are retained.
The ledger is an audit aid, not a perfect behavioral proof.

## 46. Recorded verification

| Group | Result |
|---|---|
| Foundation lifecycle/registry/scheduler | 37 checks passed |
| Event/settings/config/mailbox core | 37 checks passed |
| Client lifecycle/commands/tasks/profiling | 20 checks passed |
| Minecraft 1.21.11 class/platform checks | 33 checks passed |
| Total | 127 automated checks passed |
| Installation metadata | Four profiles checked with Fabric Loader predicates |
| Build | Active foundation, API, and example compiled/remapped |
| Independent linking | Selected core types linked with Meteor/Mod Menu blocked |
| Packaging overlap | No checked top-level API implementation overlap with Meteor/Mod Menu |

The four profiles cover API alone, with Meteor, with Mod Menu, and with both.
They are metadata/dependency checks, not four live game sessions.

The recorded release has not been launched in a game window for complete runtime validation.
Actual mixin application, real server traffic, UI visuals, native dialogs, and simultaneous mod behavior remain unverified at that level.

This documentation task adds no new game test result or claim of a complete 26.3 backport.

## 47. Troubleshooting source and builds

If Java files appear missing, check that you opened the source ZIP and then the module source directories.
If the IDE cannot resolve imports, import the full Gradle root and ensure API/foundation projects are available.
One copied Java file does not include its full dependency graph.

For build failures, inspect the first useful exception and the failing task.
The final `BUILD FAILED` line alone rarely explains the cause.
Verify JDK 21 and the pinned Gradle/Loom pair before changing versions.

For a game-version conflict, check the selected instance rather than only the launcher profile name.
For the old-runtime conflict, remove the previous 0.1 design instead of combining it with the new API and original Meteor.

## 48. Troubleshooting behavior

If F8 does not open the panel, inspect the open-key setting, initialization log, and mixin errors.
If F9 or F10 is absent, confirm the optional example is installed.
For standalone module keybinds, close screens before testing the toggle.

A module can be active while waiting for a loaded world.
Inspect running state and lifecycle logs before assuming its `onStart` ran.

If a listener is absent, inspect duplicate-ID results and repeated callback exceptions.
Automatic removal after consecutive errors is intentional.

For missing packet diagnostics under load, inspect `droppedSnapshots` and the hook-layer limits.
For a failed custom send, inspect peer support, schema registration, phase, and send result.

For settings problems, inspect invalid-value messages and I/O failures.
A generic loaded message does not prove every individual property was accepted.

## 49. Reporting issues

State exact game, Loader, Java, API, and optional dependency versions.
Identify independent SDK versus Meteor bridge usage.
Provide the smallest reproducible sequence.

For registry issues, include owner, ID, result status, and message.
For lifecycle issues, identify world joins, changes, and disconnects.
For networking, identify raw/snapshot style and event phase.

Include the relevant exception chain and log excerpt.
Remove private connection/account details before publishing logs.
Distinguish a reproducible defect from an enhancement request.

## 50. Contribution workflow

Reproduce the pinned build first.
Read the architecture, SDK, GUI, networking, backport, and verification documents.
Find the appropriate ledger item before claiming new backport completion.

Explain the concrete problem and resulting behavior.
Discuss registration ownership, cleanup, thread requirements, and configuration compatibility where relevant.
For rendering, identify stage and buffer/state ownership.
For payloads, describe both peers and process-lived schema ownership.

Update documentation with honest limitations.
Add meaningful behavior checks when a change needs them.
Keep unrelated refactors separate from a focused fix.

## 51. Future development ideas

The following are future ideas, not claims of delivered functionality:

- Complete more pending 26.3 backports with semantic checks.
- Run live-game tests for each optional dependency combination.
- Improve English/Vietnamese interface localization.
- Expand independent client templates and examples.
- Document rendering state/buffer contracts more fully.
- Improve diagnostics for modules competing over shared game state.
- Add practical examples of cooperative workload processing.
- Improve GUI feedback and visual coverage across sizes/scales.
- Extend optional integrations after verifying their actual version-specific APIs.

Missing target-version capabilities should not be represented by empty stubs and counted as complete.
Convenience APIs should preserve a suitable path to underlying native capability.

## 52. Learning paths

For installation, start with chapters 4–10.
For source access and building, read chapters 11–14.
For your first client, read chapters 15–24 and the complete examples.
For UI development, read chapters 25–27 and the source contracts for `Panels`, `PanelScreen`, and `Canvas`.
For networking, read chapters 28–33 before touching raw packet callbacks.
For thread/lifecycle work, read chapters 20–21 and 34–40.
For Meteor addons, read chapters 41–45 and choose bridge-side types deliberately.
For contributing, read chapters 46–51 and inspect the recorded reports.

## 53. API reference conventions

The following reference uses the supplied source declaration inventory.
It lists public/protected declarations, including interface members that Java treats as public without a written public keyword.
The inventory flag describes syntax-based visibility analysis, not a resolved binary compatibility guarantee.

Inherited members, compiler-generated record accessors, and enum helpers are not exhaustively expanded.
An enclosing private implementation type can further restrict the usefulness of an otherwise public/protected member declaration.
Test source entries are identified as verification support rather than runtime API.

Public internal boundaries, initialization hooks, and framework overrides are not automatically recommended addon extension points.
Type-specific usage notes distinguish important internal operations.

Each declaration includes its owner, source span, and exact extracted header.
The source browser provides the original implementation.
Upstream API catalogs remain separate: their presence in the archive does not make every upstream type available in API-only mode.

## 54. Complete original examples

The following files preserve the original example source used by the recorded build.
They retain existing UI language and notices.
Tutorial fragments above use English labels for explanation.


### ExampleClient.java

Original source: `example-addon/src/main/java/dev/meteorapi/example/ExampleClient.java`.

```java
/* SPDX-License-Identifier: GPL-3.0-only */
package dev.meteorapi.example;
import dev.meteorapi.MeteorApi;
import dev.meteorapi.client.Client;
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
        Clients.create("example-client", "Example Client").value().ifPresent(client -> {
            client.category("render", "Hiển thị");
            client.module(new StatusModule());
            client.command("hello", "Say hello locally", context -> context.reply("Client SDK đang hoạt động."));
            client.start();
        });
    }
    private static final class StatusModule extends ClientModule {
        private final Setting<Long> x = setting(Settings.longValue(optionId("x"), 8, 0, 10000));
        private final Setting<Long> y = setting(Settings.longValue(optionId("y"), 8, 0, 10000));
        StatusModule() {
            super(new NamespacedId("example-client", "status"), new NamespacedId("example-client", "render"),
                "Status HUD", "HUD mẫu: vị trí tùy chỉnh và vòng đời riêng cho từng world.");
            bind(org.lwjgl.glfw.GLFW.GLFW_KEY_F10, 0);
        }
        @Override protected void onStart(ResourceScope scope) {
            MeteorApi.hud().listen(optionId("draw"), event -> event.canvas().text("Example Client | " + MeteorApi.VERSION,
                x.get().intValue(), y.get().intValue(), 0xFFB6E4FF)).value().ifPresent(scope::own);
        }
    }
}
```

### ExampleAddon.java

Original source: `example-addon/src/main/java/dev/meteorapi/example/ExampleAddon.java`.

```java
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
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.client.MinecraftClient;
import org.lwjgl.glfw.GLFW;
import java.nio.file.Path;

/** Install optionally; F9 opens the example GUI. No Meteor Client dependency. */
public final class ExampleAddon implements ClientModInitializer {
    private static final String OWNER = "meteor-api-example";
    private final ConfigStore config = new ConfigStore(FabricLoader.getInstance().getConfigDir().resolve(OWNER + ".properties"));
    private final Setting<Boolean> capture = Settings.bool(id("capture"), false);
    private final Setting<Long> limit = Settings.longValue(id("limit"), 100, 1, Long.MAX_VALUE);
    private final Setting<Path> input = Settings.file(id("input"), null);
    private ResourceScope captureScope;
    private long observed;

    private static NamespacedId id(String name) { return new NamespacedId(OWNER, name); }
    @Override public void onInitializeClient() {
        ExampleClient.register();
        config.add(capture); config.add(limit); config.add(input);
        try { config.load(); } catch (java.io.IOException e) { MeteorApi.LOG.warn("Example config", e); }
        MeteorApi.keys().listen(id("open-gui"), event -> {
            if (event.action() == GLFW.GLFW_PRESS && event.key() == GLFW.GLFW_KEY_F9) {
                if (MinecraftClient.getInstance().currentScreen instanceof dev.meteorapi.ui.PanelScreen) {
                    MinecraftClient.getInstance().currentScreen.close(); return;
                }
                MinecraftClient.getInstance().setScreen(Panels.create("Meteor API · Ví dụ")
                    .label("Chạy được khi không cài Meteor Client")
                    .toggle("Quan sát packet", capture)
                    .field("Giới hạn hiển thị", limit)
                    .file("Chọn tệp", input, "txt;json;*")
                    .button("Thống kê packet", () -> MeteorApi.LOG.info("{}", Packets.statistics()))
                    .button("Nhắc sau 20 tick", () -> MeteorApi.scheduler().schedule(20, () -> MeteorApi.LOG.info("Example scheduled action")))
                    .onClose(() -> { try { config.save(); } catch (java.io.IOException e) { MeteorApi.LOG.warn("Example config save", e); } })
                    .build(MinecraftClient.getInstance().currentScreen));
            }
        });
        capture.onChanged(id("capture-lifecycle"), change -> updateCapture());
        updateCapture();
    }
    private void updateCapture() {
        if (captureScope != null) { captureScope.close(); captureScope = null; }
        if (!capture.get()) return;
        captureScope = new ResourceScope();
        Packets.onClient(id("packets"), snapshot -> {
            if (observed++ < limit.get()) MeteorApi.LOG.info("{} {}", snapshot.phase(), snapshot.packetClass());
        }).value().ifPresent(captureScope::own);
    }
}
```

### ExamplePayload.java

Original source: `example-addon/src/main/java/dev/meteorapi/example/ExamplePayload.java`.

```java
/* SPDX-License-Identifier: GPL-3.0-only */
package dev.meteorapi.example;
import net.minecraft.network.RegistryByteBuf;
import net.minecraft.network.codec.PacketCodec;
import net.minecraft.network.packet.CustomPayload;
import net.minecraft.util.Identifier;
/** Illustrative schema: register on BOTH peers before use. Not automatically sent to arbitrary servers. */
public record ExamplePayload(String text) implements CustomPayload {
    public static final Id<ExamplePayload> ID = new Id<>(Identifier.of("meteor-api-example", "message"));
    public static final PacketCodec<RegistryByteBuf, ExamplePayload> CODEC = PacketCodec.of(
        (payload, buffer) -> buffer.writeString(payload.text(), 256),
        buffer -> new ExamplePayload(buffer.readString(256)));
    @Override public Id<? extends CustomPayload> getId() { return ID; }
}
```

## 55. Source-based API reference

The inventory below covers 465 public/protected declaration entries across 70 files.
This includes implicitly public interface members; compiler-generated accessors and inherited methods are not fully expanded.
Read the type contract and source before treating any header as a stable extension point.

### MeteorApi — Independent entry point

Source file: [api/src/main/java/dev/meteorapi/MeteorApi.java](source/api/src/main/java/dev/meteorapi/MeteorApi.java).

Usage contract: Use shared keys/ticks/HUD channels, config, services, and execution helpers. onTick() is an internal installed-hook boundary. The scheduler is client-thread confined.

Declaration entries in this file: 20.

#### dev.meteorapi.MeteorApi · class · line 22

```java
public final class MeteorApi
```

Declaring owner: `dev.meteorapi`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/MeteorApi.java:22–77](source/api/src/main/java/dev/meteorapi/MeteorApi.java#L22).

#### dev.meteorapi.MeteorApi.ID · field · line 23

```java
public static final String ID = "meteor-api", VERSION = "0.2.0"
```

Declaring owner: `dev.meteorapi.MeteorApi`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/MeteorApi.java:23–23](source/api/src/main/java/dev/meteorapi/MeteorApi.java#L23).

#### dev.meteorapi.MeteorApi.VERSION · field · line 23

```java
public static final String ID = "meteor-api", VERSION = "0.2.0"
```

Declaring owner: `dev.meteorapi.MeteorApi`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/MeteorApi.java:23–23](source/api/src/main/java/dev/meteorapi/MeteorApi.java#L23).

#### dev.meteorapi.MeteorApi.LOG · field · line 24

```java
public static final Logger LOG = LoggerFactory.getLogger("Meteor API")
```

Declaring owner: `dev.meteorapi.MeteorApi`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/MeteorApi.java:24–24](source/api/src/main/java/dev/meteorapi/MeteorApi.java#L24).

#### dev.meteorapi.MeteorApi.KeyInputEvent · record · line 25

```java
public record KeyInputEvent(int key, int scancode, int modifiers, int action)
```

Declaring owner: `dev.meteorapi.MeteorApi`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/MeteorApi.java:25–25](source/api/src/main/java/dev/meteorapi/MeteorApi.java#L25).

#### dev.meteorapi.MeteorApi.TickEvent · record · line 26

```java
public record TickEvent(long tick)
```

Declaring owner: `dev.meteorapi.MeteorApi`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/MeteorApi.java:26–26](source/api/src/main/java/dev/meteorapi/MeteorApi.java#L26).

#### dev.meteorapi.MeteorApi.HudEvent · record · line 27

```java
public record HudEvent(net.minecraft.client.gui.DrawContext context, float tickDelta)
```

Declaring owner: `dev.meteorapi.MeteorApi`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/MeteorApi.java:27–29](source/api/src/main/java/dev/meteorapi/MeteorApi.java#L27).

#### dev.meteorapi.MeteorApi.HudEvent.canvas · method · line 28

```java
public dev.meteorapi.ui.Canvas canvas()
```

Declaring owner: `dev.meteorapi.MeteorApi.HudEvent`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/MeteorApi.java:28–28](source/api/src/main/java/dev/meteorapi/MeteorApi.java#L28).

#### dev.meteorapi.MeteorApi.OPEN_KEY · field · line 35

```java
public static final Setting<Long> OPEN_KEY = Settings.longValue(new NamespacedId(ID, "open-key"), 297, -1, 348)
```

Declaring owner: `dev.meteorapi.MeteorApi`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/MeteorApi.java:35–35](source/api/src/main/java/dev/meteorapi/MeteorApi.java#L35).

#### dev.meteorapi.MeteorApi.keys · method · line 38

```java
public static EventChannel<KeyInputEvent> keys()
```

Declaring owner: `dev.meteorapi.MeteorApi`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/MeteorApi.java:38–38](source/api/src/main/java/dev/meteorapi/MeteorApi.java#L38).

#### dev.meteorapi.MeteorApi.ticks · method · line 39

```java
public static EventChannel<TickEvent> ticks()
```

Declaring owner: `dev.meteorapi.MeteorApi`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/MeteorApi.java:39–39](source/api/src/main/java/dev/meteorapi/MeteorApi.java#L39).

#### dev.meteorapi.MeteorApi.hud · method · line 40

```java
public static EventChannel<HudEvent> hud()
```

Declaring owner: `dev.meteorapi.MeteorApi`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/MeteorApi.java:40–40](source/api/src/main/java/dev/meteorapi/MeteorApi.java#L40).

#### dev.meteorapi.MeteorApi.config · method · line 41

```java
public static ConfigStore config()
```

Declaring owner: `dev.meteorapi.MeteorApi`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/MeteorApi.java:41–41](source/api/src/main/java/dev/meteorapi/MeteorApi.java#L41).

#### dev.meteorapi.MeteorApi.services · method · line 42

```java
public static ServiceRegistry services()
```

Declaring owner: `dev.meteorapi.MeteorApi`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/MeteorApi.java:42–42](source/api/src/main/java/dev/meteorapi/MeteorApi.java#L42).

#### dev.meteorapi.MeteorApi.scheduler · method · line 43

```java
public static TickScheduler scheduler()
```

Declaring owner: `dev.meteorapi.MeteorApi`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/MeteorApi.java:43–47](source/api/src/main/java/dev/meteorapi/MeteorApi.java#L43).

#### dev.meteorapi.MeteorApi.hasMeteorClient · method · line 48

```java
public static boolean hasMeteorClient()
```

Declaring owner: `dev.meteorapi.MeteorApi`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/MeteorApi.java:48–48](source/api/src/main/java/dev/meteorapi/MeteorApi.java#L48).

#### dev.meteorapi.MeteorApi.requireClientThread · method · line 49

```java
public static void requireClientThread()
```

Declaring owner: `dev.meteorapi.MeteorApi`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/MeteorApi.java:49–51](source/api/src/main/java/dev/meteorapi/MeteorApi.java#L49).

#### dev.meteorapi.MeteorApi.execute · method · line 52

```java
public static CompletableFuture<Void> execute(Runnable action)
```

Declaring owner: `dev.meteorapi.MeteorApi`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/MeteorApi.java:52–60](source/api/src/main/java/dev/meteorapi/MeteorApi.java#L52).

#### dev.meteorapi.MeteorApi.onTick · method · line 61

```java
public static void onTick()
```

Declaring owner: `dev.meteorapi.MeteorApi`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/MeteorApi.java:61–63](source/api/src/main/java/dev/meteorapi/MeteorApi.java#L61).

#### dev.meteorapi.MeteorApi.screen · method · line 64

```java
public static Screen screen(Screen parent)
```

Declaring owner: `dev.meteorapi.MeteorApi`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/MeteorApi.java:64–76](source/api/src/main/java/dev/meteorapi/MeteorApi.java#L64).

### DisplayItemUtils — Display stack helpers

Source file: [api/src/main/java/dev/meteorapi/backport/DisplayItemUtils.java](source/api/src/main/java/dev/meteorapi/backport/DisplayItemUtils.java).

Usage contract: Uses target-version items/blocks. AIR or non-positive count produces ItemStack.EMPTY in the count overload.

Declaration entries in this file: 4.

#### dev.meteorapi.backport.DisplayItemUtils · class · line 8

```java
public final class DisplayItemUtils
```

Declaring owner: `dev.meteorapi.backport`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/backport/DisplayItemUtils.java:8–16](source/api/src/main/java/dev/meteorapi/backport/DisplayItemUtils.java#L8).

#### dev.meteorapi.backport.DisplayItemUtils.toStack · method · line 10

```java
public static ItemStack toStack(Item item)
```

Declaring owner: `dev.meteorapi.backport.DisplayItemUtils`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/backport/DisplayItemUtils.java:10–10](source/api/src/main/java/dev/meteorapi/backport/DisplayItemUtils.java#L10).

#### dev.meteorapi.backport.DisplayItemUtils.toStack · method · line 11

```java
public static ItemStack toStack(Block block)
```

Declaring owner: `dev.meteorapi.backport.DisplayItemUtils`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/backport/DisplayItemUtils.java:11–11](source/api/src/main/java/dev/meteorapi/backport/DisplayItemUtils.java#L11).

#### dev.meteorapi.backport.DisplayItemUtils.toStack · method · line 12

```java
public static ItemStack toStack(Item item, int count)
```

Declaring owner: `dev.meteorapi.backport.DisplayItemUtils`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/backport/DisplayItemUtils.java:12–15](source/api/src/main/java/dev/meteorapi/backport/DisplayItemUtils.java#L12).

### EntityAgeTest — Entity-age predicate

Source file: [api/src/main/java/dev/meteorapi/backport/EntityAgeTest.java](source/api/src/main/java/dev/meteorapi/backport/EntityAgeTest.java).

Usage contract: Tests target-version LivingEntity values according to its enum policy. It does not itself acquire entities or register gameplay behavior.

Declaration entries in this file: 3.

#### dev.meteorapi.backport.EntityAgeTest · enum · line 15

```java
public enum EntityAgeTest implements Predicate<LivingEntity>
```

Declaring owner: `dev.meteorapi.backport`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/backport/EntityAgeTest.java:15–39](source/api/src/main/java/dev/meteorapi/backport/EntityAgeTest.java#L15).

#### dev.meteorapi.backport.EntityAgeTest.test · method · line 21

```java
@Override public boolean test(LivingEntity livingEntity)
```

Declaring owner: `dev.meteorapi.backport.EntityAgeTest`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/backport/EntityAgeTest.java:21–28](source/api/src/main/java/dev/meteorapi/backport/EntityAgeTest.java#L21).

#### dev.meteorapi.backport.EntityAgeTest.negate · method · line 30

```java
@Override public Predicate<LivingEntity> negate()
```

Declaring owner: `dev.meteorapi.backport.EntityAgeTest`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/backport/EntityAgeTest.java:30–37](source/api/src/main/java/dev/meteorapi/backport/EntityAgeTest.java#L30).

### FluidOpacity — Fluid policy enum

Source file: [api/src/main/java/dev/meteorapi/backport/FluidOpacity.java](source/api/src/main/java/dev/meteorapi/backport/FluidOpacity.java).

Usage contract: None, Water, Lava, and Both expose water/lava flags. This type does not patch original Meteor Xray simply by being present.

Declaration entries in this file: 3.

#### dev.meteorapi.backport.FluidOpacity · enum · line 4

```java
public enum FluidOpacity
```

Declaring owner: `dev.meteorapi.backport`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/backport/FluidOpacity.java:4–7](source/api/src/main/java/dev/meteorapi/backport/FluidOpacity.java#L4).

#### dev.meteorapi.backport.FluidOpacity.water · method · line 5

```java
public boolean water()
```

Declaring owner: `dev.meteorapi.backport.FluidOpacity`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/backport/FluidOpacity.java:5–5](source/api/src/main/java/dev/meteorapi/backport/FluidOpacity.java#L5).

#### dev.meteorapi.backport.FluidOpacity.lava · method · line 6

```java
public boolean lava()
```

Declaring owner: `dev.meteorapi.backport.FluidOpacity`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/backport/FluidOpacity.java:6–6](source/api/src/main/java/dev/meteorapi/backport/FluidOpacity.java#L6).

### Keybind — Backported input representation

Source file: [api/src/main/java/dev/meteorapi/backport/Keybind.java](source/api/src/main/java/dev/meteorapi/backport/Keybind.java).

Usage contract: Represents keyboard/mouse bindings and modifiers, copies, display labels, and old/current NBT forms. Physical input polling requires the client thread.

Declaration entries in this file: 34.

#### dev.meteorapi.backport.Keybind · class · line 20

```java
public class Keybind
```

Declaring owner: `dev.meteorapi.backport`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/backport/Keybind.java:20–283](source/api/src/main/java/dev/meteorapi/backport/Keybind.java#L20).

#### dev.meteorapi.backport.Keybind.Modifier · enum · line 21

```java
public enum Modifier
```

Declaring owner: `dev.meteorapi.backport.Keybind`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/backport/Keybind.java:21–56](source/api/src/main/java/dev/meteorapi/backport/Keybind.java#L21).

#### dev.meteorapi.backport.Keybind.Modifier.mask · field · line 32

```java
public final int mask
```

Declaring owner: `dev.meteorapi.backport.Keybind.Modifier`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/backport/Keybind.java:32–32](source/api/src/main/java/dev/meteorapi/backport/Keybind.java#L32).

#### dev.meteorapi.backport.Keybind.Modifier.isKeyPressed · method · line 38

```java
public boolean isKeyPressed()
```

Declaring owner: `dev.meteorapi.backport.Keybind.Modifier`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/backport/Keybind.java:38–47](source/api/src/main/java/dev/meteorapi/backport/Keybind.java#L38).

#### dev.meteorapi.backport.Keybind.key · field · line 58

```java
public InputUtil.Key key
```

Declaring owner: `dev.meteorapi.backport.Keybind`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/backport/Keybind.java:58–58](source/api/src/main/java/dev/meteorapi/backport/Keybind.java#L58).

#### dev.meteorapi.backport.Keybind.none · method · line 66

```java
public static Keybind none()
```

Declaring owner: `dev.meteorapi.backport.Keybind`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/backport/Keybind.java:66–68](source/api/src/main/java/dev/meteorapi/backport/Keybind.java#L66).

#### dev.meteorapi.backport.Keybind.fromKey · method · line 70

```java
public static Keybind fromKey(InputUtil.Key key)
```

Declaring owner: `dev.meteorapi.backport.Keybind`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/backport/Keybind.java:70–72](source/api/src/main/java/dev/meteorapi/backport/Keybind.java#L70).

#### dev.meteorapi.backport.Keybind.fromKey · method · line 74

```java
public static Keybind fromKey(int key)
```

Declaring owner: `dev.meteorapi.backport.Keybind`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/backport/Keybind.java:74–76](source/api/src/main/java/dev/meteorapi/backport/Keybind.java#L74).

#### dev.meteorapi.backport.Keybind.fromKeys · method · line 78

```java
public static Keybind fromKeys(InputUtil.Key key, Collection<Modifier> modifiers)
```

Declaring owner: `dev.meteorapi.backport.Keybind`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/backport/Keybind.java:78–80](source/api/src/main/java/dev/meteorapi/backport/Keybind.java#L78).

#### dev.meteorapi.backport.Keybind.fromKeys · method · line 82

```java
public static Keybind fromKeys(InputUtil.Key key, Modifier... modifiers)
```

Declaring owner: `dev.meteorapi.backport.Keybind`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/backport/Keybind.java:82–84](source/api/src/main/java/dev/meteorapi/backport/Keybind.java#L82).

#### dev.meteorapi.backport.Keybind.fromKeys · method · line 86

```java
public static Keybind fromKeys(int key, int modifiers)
```

Declaring owner: `dev.meteorapi.backport.Keybind`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/backport/Keybind.java:86–88](source/api/src/main/java/dev/meteorapi/backport/Keybind.java#L86).

#### dev.meteorapi.backport.Keybind.fromButton · method · line 90

```java
public static Keybind fromButton(int button)
```

Declaring owner: `dev.meteorapi.backport.Keybind`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/backport/Keybind.java:90–92](source/api/src/main/java/dev/meteorapi/backport/Keybind.java#L90).

#### dev.meteorapi.backport.Keybind.isSet · method · line 94

```java
public boolean isSet()
```

Declaring owner: `dev.meteorapi.backport.Keybind`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/backport/Keybind.java:94–96](source/api/src/main/java/dev/meteorapi/backport/Keybind.java#L94).

#### dev.meteorapi.backport.Keybind.isKey · method · line 98

```java
public boolean isKey()
```

Declaring owner: `dev.meteorapi.backport.Keybind`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/backport/Keybind.java:98–100](source/api/src/main/java/dev/meteorapi/backport/Keybind.java#L98).

#### dev.meteorapi.backport.Keybind.hasMods · method · line 102

```java
public boolean hasMods()
```

Declaring owner: `dev.meteorapi.backport.Keybind`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/backport/Keybind.java:102–104](source/api/src/main/java/dev/meteorapi/backport/Keybind.java#L102).

#### dev.meteorapi.backport.Keybind.getValue · method · line 106

```java
public int getValue()
```

Declaring owner: `dev.meteorapi.backport.Keybind`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/backport/Keybind.java:106–108](source/api/src/main/java/dev/meteorapi/backport/Keybind.java#L106).

#### dev.meteorapi.backport.Keybind.set · method · line 110

```java
public void set(InputUtil.Key key, Collection<Modifier> modifiers)
```

Declaring owner: `dev.meteorapi.backport.Keybind`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/backport/Keybind.java:110–114](source/api/src/main/java/dev/meteorapi/backport/Keybind.java#L110).

#### dev.meteorapi.backport.Keybind.set · method · line 116

```java
public void set(InputUtil.Key key, Modifier... modifiers)
```

Declaring owner: `dev.meteorapi.backport.Keybind`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/backport/Keybind.java:116–118](source/api/src/main/java/dev/meteorapi/backport/Keybind.java#L116).

#### dev.meteorapi.backport.Keybind.set · method · line 120

```java
public void set(boolean isKey, int value, int modifiers)
```

Declaring owner: `dev.meteorapi.backport.Keybind`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/backport/Keybind.java:120–122](source/api/src/main/java/dev/meteorapi/backport/Keybind.java#L120).

#### dev.meteorapi.backport.Keybind.set · method · line 124

```java
public Keybind set(Keybind value)
```

Declaring owner: `dev.meteorapi.backport.Keybind`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/backport/Keybind.java:124–128](source/api/src/main/java/dev/meteorapi/backport/Keybind.java#L124).

#### dev.meteorapi.backport.Keybind.reset · method · line 130

```java
public void reset()
```

Declaring owner: `dev.meteorapi.backport.Keybind`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/backport/Keybind.java:130–132](source/api/src/main/java/dev/meteorapi/backport/Keybind.java#L130).

#### dev.meteorapi.backport.Keybind.canBindTo · method · line 134

```java
public boolean canBindTo(InputUtil.Key key, Collection<Modifier> modifiers)
```

Declaring owner: `dev.meteorapi.backport.Keybind`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/backport/Keybind.java:134–141](source/api/src/main/java/dev/meteorapi/backport/Keybind.java#L134).

#### dev.meteorapi.backport.Keybind.canBindTo · method · line 143

```java
public boolean canBindTo(boolean isKey, int value, int modifiers)
```

Declaring owner: `dev.meteorapi.backport.Keybind`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/backport/Keybind.java:143–145](source/api/src/main/java/dev/meteorapi/backport/Keybind.java#L143).

#### dev.meteorapi.backport.Keybind.matches · method · line 147

```java
public boolean matches(InputUtil.Key key, Set<Modifier> modifiers)
```

Declaring owner: `dev.meteorapi.backport.Keybind`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/backport/Keybind.java:147–153](source/api/src/main/java/dev/meteorapi/backport/Keybind.java#L147).

#### dev.meteorapi.backport.Keybind.matches · method · line 155

```java
public boolean matches(boolean isKey, int value, int modifiers)
```

Declaring owner: `dev.meteorapi.backport.Keybind`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/backport/Keybind.java:155–157](source/api/src/main/java/dev/meteorapi/backport/Keybind.java#L155).

#### dev.meteorapi.backport.Keybind.matches · method · line 159

```java
public boolean matches(KeyInput input)
```

Declaring owner: `dev.meteorapi.backport.Keybind`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/backport/Keybind.java:159–161](source/api/src/main/java/dev/meteorapi/backport/Keybind.java#L159).

#### dev.meteorapi.backport.Keybind.matches · method · line 163

```java
public boolean matches(MouseInput input)
```

Declaring owner: `dev.meteorapi.backport.Keybind`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/backport/Keybind.java:163–165](source/api/src/main/java/dev/meteorapi/backport/Keybind.java#L163).

#### dev.meteorapi.backport.Keybind.isPressed · method · line 167

```java
public boolean isPressed()
```

Declaring owner: `dev.meteorapi.backport.Keybind`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/backport/Keybind.java:167–171](source/api/src/main/java/dev/meteorapi/backport/Keybind.java#L167).

#### dev.meteorapi.backport.Keybind.copy · method · line 187

```java
public Keybind copy()
```

Declaring owner: `dev.meteorapi.backport.Keybind`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/backport/Keybind.java:187–189](source/api/src/main/java/dev/meteorapi/backport/Keybind.java#L187).

#### dev.meteorapi.backport.Keybind.toString · method · line 191

```java
@Override public String toString()
```

Declaring owner: `dev.meteorapi.backport.Keybind`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/backport/Keybind.java:191–207](source/api/src/main/java/dev/meteorapi/backport/Keybind.java#L191).

#### dev.meteorapi.backport.Keybind.equals · method · line 209

```java
@Override public boolean equals(Object o)
```

Declaring owner: `dev.meteorapi.backport.Keybind`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/backport/Keybind.java:209–215](source/api/src/main/java/dev/meteorapi/backport/Keybind.java#L209).

#### dev.meteorapi.backport.Keybind.hashCode · method · line 217

```java
@Override public int hashCode()
```

Declaring owner: `dev.meteorapi.backport.Keybind`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/backport/Keybind.java:217–220](source/api/src/main/java/dev/meteorapi/backport/Keybind.java#L217).

#### dev.meteorapi.backport.Keybind.toTag · method · line 224

```java
public NbtCompound toTag()
```

Declaring owner: `dev.meteorapi.backport.Keybind`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/backport/Keybind.java:224–236](source/api/src/main/java/dev/meteorapi/backport/Keybind.java#L224).

#### dev.meteorapi.backport.Keybind.fromTag · method · line 238

```java
public Keybind fromTag(NbtCompound tag)
```

Declaring owner: `dev.meteorapi.backport.Keybind`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/backport/Keybind.java:238–265](source/api/src/main/java/dev/meteorapi/backport/Keybind.java#L238).

### ListMode — Backported list policy

Source file: [api/src/main/java/dev/meteorapi/backport/ListMode.java](source/api/src/main/java/dev/meteorapi/backport/ListMode.java).

Usage contract: Use its concrete enum/test behavior for whitelist/blacklist selection. The policy itself does not install a module or change another mod's filters.

Declaration entries in this file: 2.

#### dev.meteorapi.backport.ListMode · enum · line 8

```java
public enum ListMode
```

Declaring owner: `dev.meteorapi.backport`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/backport/ListMode.java:8–18](source/api/src/main/java/dev/meteorapi/backport/ListMode.java#L8).

#### dev.meteorapi.backport.ListMode.allows · method · line 12

```java
public boolean allows(boolean contains)
```

Declaring owner: `dev.meteorapi.backport.ListMode`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/backport/ListMode.java:12–17](source/api/src/main/java/dev/meteorapi/backport/ListMode.java#L12).

### MeteorMcGuiRenderer — Adapted renderer subclass

Source file: [api/src/main/java/dev/meteorapi/backport/MeteorMcGuiRenderer.java](source/api/src/main/java/dev/meteorapi/backport/MeteorMcGuiRenderer.java).

Usage contract: Constructor targets the actual 1.21.11 renderer. It does not supply every newer transient/GPU backend capability.

Declaration entries in this file: 2.

#### dev.meteorapi.backport.MeteorMcGuiRenderer · class · line 14

```java
public class MeteorMcGuiRenderer extends GuiRenderer
```

Declaring owner: `dev.meteorapi.backport`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/backport/MeteorMcGuiRenderer.java:14–19](source/api/src/main/java/dev/meteorapi/backport/MeteorMcGuiRenderer.java#L14).

#### dev.meteorapi.backport.MeteorMcGuiRenderer.MeteorMcGuiRenderer · constructor · line 15

```java
public MeteorMcGuiRenderer(GuiRenderState state, VertexConsumerProvider.Immediate vertices, OrderedRenderCommandQueue commands, RenderDispatcher dispatcher, List<SpecialGuiElementRenderer<?>> renderers)
```

Declaring owner: `dev.meteorapi.backport.MeteorMcGuiRenderer`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/backport/MeteorMcGuiRenderer.java:15–18](source/api/src/main/java/dev/meteorapi/backport/MeteorMcGuiRenderer.java#L15).

### SwingMode — Client/protocol swing policy

Source file: [api/src/main/java/dev/meteorapi/backport/SwingMode.java](source/api/src/main/java/dev/meteorapi/backport/SwingMode.java).

Usage contract: Both, Packet, Client, and None select the implemented 1.21.11 animation/packet actions. World/network availability is checked where needed.

Declaration entries in this file: 5.

#### dev.meteorapi.backport.SwingMode · enum · line 8

```java
public enum SwingMode
```

Declaring owner: `dev.meteorapi.backport`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/backport/SwingMode.java:8–24](source/api/src/main/java/dev/meteorapi/backport/SwingMode.java#L8).

#### dev.meteorapi.backport.SwingMode.of · method · line 10

```java
public static SwingMode of(boolean client)
```

Declaring owner: `dev.meteorapi.backport.SwingMode`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/backport/SwingMode.java:10–10](source/api/src/main/java/dev/meteorapi/backport/SwingMode.java#L10).

#### dev.meteorapi.backport.SwingMode.client · method · line 11

```java
public boolean client()
```

Declaring owner: `dev.meteorapi.backport.SwingMode`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/backport/SwingMode.java:11–11](source/api/src/main/java/dev/meteorapi/backport/SwingMode.java#L11).

#### dev.meteorapi.backport.SwingMode.attackSwing · method · line 12

```java
public void attackSwing(Hand hand)
```

Declaring owner: `dev.meteorapi.backport.SwingMode`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/backport/SwingMode.java:12–18](source/api/src/main/java/dev/meteorapi/backport/SwingMode.java#L12).

#### dev.meteorapi.backport.SwingMode.interactSwing · method · line 19

```java
public void interactSwing(Hand hand)
```

Declaring owner: `dev.meteorapi.backport.SwingMode`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/backport/SwingMode.java:19–23](source/api/src/main/java/dev/meteorapi/backport/SwingMode.java#L19).

### Utils — Additional utility helpers

Source file: [api/src/main/java/dev/meteorapi/backport/Utils.java](source/api/src/main/java/dev/meteorapi/backport/Utils.java).

Usage contract: Includes food tests, vector conversion, iterable containment, filename filtering, and modifier matching. Check overload types and implementation semantics.

Declaration entries in this file: 7.

#### dev.meteorapi.backport.Utils · class · line 9

```java
public final class Utils
```

Declaring owner: `dev.meteorapi.backport`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/backport/Utils.java:9–25](source/api/src/main/java/dev/meteorapi/backport/Utils.java#L9).

#### dev.meteorapi.backport.Utils.isFood · method · line 11

```java
public static boolean isFood(ItemStack item)
```

Declaring owner: `dev.meteorapi.backport.Utils`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/backport/Utils.java:11–11](source/api/src/main/java/dev/meteorapi/backport/Utils.java#L11).

#### dev.meteorapi.backport.Utils.isFood · method · line 12

```java
public static boolean isFood(Item item)
```

Declaring owner: `dev.meteorapi.backport.Utils`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/backport/Utils.java:12–12](source/api/src/main/java/dev/meteorapi/backport/Utils.java#L12).

#### dev.meteorapi.backport.Utils.vec3 · method · line 13

```java
public static Vec3d vec3(BlockPos pos)
```

Declaring owner: `dev.meteorapi.backport.Utils`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/backport/Utils.java:13–13](source/api/src/main/java/dev/meteorapi/backport/Utils.java#L13).

#### dev.meteorapi.backport.Utils.contains · method · line 14

```java
public static <T> boolean contains(Iterable<T> colors, T value)
```

Declaring owner: `dev.meteorapi.backport.Utils`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/backport/Utils.java:14–14](source/api/src/main/java/dev/meteorapi/backport/Utils.java#L14).

#### dev.meteorapi.backport.Utils.fileNameFilter · method · line 15

```java
public static boolean fileNameFilter(String text, char c)
```

Declaring owner: `dev.meteorapi.backport.Utils`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/backport/Utils.java:15–17](source/api/src/main/java/dev/meteorapi/backport/Utils.java#L15).

#### dev.meteorapi.backport.Utils.modsMatch · method · line 18

```java
public static boolean modsMatch(int current, int... desired)
```

Declaring owner: `dev.meteorapi.backport.Utils`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/backport/Utils.java:18–24](source/api/src/main/java/dev/meteorapi/backport/Utils.java#L18).

### Client — Independent client instance

Source file: [api/src/main/java/dev/meteorapi/client/Client.java](source/api/src/main/java/dev/meteorapi/client/Client.java).

Usage contract: Owns categories, modules, commands, configuration, GUI, and client-level resources. Configuration is config/<owner>/client.properties. hud() owns a client-level listener, not a module-runtime listener.

Declaration entries in this file: 20.

#### dev.meteorapi.client.Client · class · line 26

```java
public final class Client implements AutoCloseable
```

Declaring owner: `dev.meteorapi.client`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/client/Client.java:26–173](source/api/src/main/java/dev/meteorapi/client/Client.java#L26).

#### dev.meteorapi.client.Client.Category · record · line 27

```java
public record Category(NamespacedId id, String title)
```

Declaring owner: `dev.meteorapi.client.Client`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/client/Client.java:27–27](source/api/src/main/java/dev/meteorapi/client/Client.java#L27).

#### dev.meteorapi.client.Client.CommandContext · record · line 28

```java
public record CommandContext(Client client, List<String> arguments)
```

Declaring owner: `dev.meteorapi.client.Client`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/client/Client.java:28–30](source/api/src/main/java/dev/meteorapi/client/Client.java#L28).

#### dev.meteorapi.client.Client.CommandContext.reply · method · line 29

```java
public void reply(String message)
```

Declaring owner: `dev.meteorapi.client.Client.CommandContext`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/client/Client.java:29–29](source/api/src/main/java/dev/meteorapi/client/Client.java#L29).

#### dev.meteorapi.client.Client.owner · method · line 57

```java
public String owner()
```

Declaring owner: `dev.meteorapi.client.Client`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/client/Client.java:57–57](source/api/src/main/java/dev/meteorapi/client/Client.java#L57).

#### dev.meteorapi.client.Client.title · method · line 58

```java
public String title()
```

Declaring owner: `dev.meteorapi.client.Client`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/client/Client.java:58–58](source/api/src/main/java/dev/meteorapi/client/Client.java#L58).

#### dev.meteorapi.client.Client.started · method · line 59

```java
public boolean started()
```

Declaring owner: `dev.meteorapi.client.Client`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/client/Client.java:59–59](source/api/src/main/java/dev/meteorapi/client/Client.java#L59).

#### dev.meteorapi.client.Client.config · method · line 60

```java
public ConfigStore config()
```

Declaring owner: `dev.meteorapi.client.Client`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/client/Client.java:60–60](source/api/src/main/java/dev/meteorapi/client/Client.java#L60).

#### dev.meteorapi.client.Client.modules · method · line 61

```java
public List<ClientModule> modules()
```

Declaring owner: `dev.meteorapi.client.Client`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/client/Client.java:61–61](source/api/src/main/java/dev/meteorapi/client/Client.java#L61).

#### dev.meteorapi.client.Client.category · method · line 62

```java
public RegistrationResult<Category> category(String local, String title)
```

Declaring owner: `dev.meteorapi.client.Client`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/client/Client.java:62–69](source/api/src/main/java/dev/meteorapi/client/Client.java#L62).

#### dev.meteorapi.client.Client.module · method · line 70

```java
public <T extends ClientModule> RegistrationResult<T> module(T module)
```

Declaring owner: `dev.meteorapi.client.Client`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/client/Client.java:70–83](source/api/src/main/java/dev/meteorapi/client/Client.java#L70).

#### dev.meteorapi.client.Client.command · method · line 84

```java
public RegistrationResult<Registration> command(String name, String description, Consumer<CommandContext> action)
```

Declaring owner: `dev.meteorapi.client.Client`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/client/Client.java:84–91](source/api/src/main/java/dev/meteorapi/client/Client.java#L84).

#### dev.meteorapi.client.Client.hud · method · line 92

```java
public RegistrationResult<Registration> hud(String local, Consumer<MeteorApi.HudEvent> renderer)
```

Declaring owner: `dev.meteorapi.client.Client`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/client/Client.java:92–96](source/api/src/main/java/dev/meteorapi/client/Client.java#L92).

#### dev.meteorapi.client.Client.start · method · line 97

```java
public boolean start()
```

Declaring owner: `dev.meteorapi.client.Client`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/client/Client.java:97–110](source/api/src/main/java/dev/meteorapi/client/Client.java#L97).

#### dev.meteorapi.client.Client.save · method · line 111

```java
public void save() throws IOException
```

Declaring owner: `dev.meteorapi.client.Client`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/client/Client.java:111–115](source/api/src/main/java/dev/meteorapi/client/Client.java#L111).

#### dev.meteorapi.client.Client.load · method · line 116

```java
public void load() throws IOException
```

Declaring owner: `dev.meteorapi.client.Client`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/client/Client.java:116–122](source/api/src/main/java/dev/meteorapi/client/Client.java#L116).

#### dev.meteorapi.client.Client.execute · method · line 124

```java
public void execute(String input)
```

Declaring owner: `dev.meteorapi.client.Client`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/client/Client.java:124–132](source/api/src/main/java/dev/meteorapi/client/Client.java#L124).

#### dev.meteorapi.client.Client.reply · method · line 133

```java
public void reply(String message)
```

Declaring owner: `dev.meteorapi.client.Client`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/client/Client.java:133–138](source/api/src/main/java/dev/meteorapi/client/Client.java#L133).

#### dev.meteorapi.client.Client.screen · method · line 139

```java
public Screen screen(Screen parent)
```

Declaring owner: `dev.meteorapi.client.Client`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/client/Client.java:139–152](source/api/src/main/java/dev/meteorapi/client/Client.java#L139).

#### dev.meteorapi.client.Client.close · method · line 162

```java
@Override public void close()
```

Declaring owner: `dev.meteorapi.client.Client`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/client/Client.java:162–170](source/api/src/main/java/dev/meteorapi/client/Client.java#L162).

### ClientModule — Independent module base

Source file: [api/src/main/java/dev/meteorapi/client/ClientModule.java](source/api/src/main/java/dev/meteorapi/client/ClientModule.java).

Usage contract: Subclass onStart(scope), onStop(), and onTick(). Collect settings through setting(). The runtime waits for a world/player unless runInMenus is selected. _enabled, _key, and _modifiers are reserved option paths.

Declaration entries in this file: 16.

#### dev.meteorapi.client.ClientModule · class · line 13

```java
public abstract class ClientModule extends FeatureLifecycle
```

Declaring owner: `dev.meteorapi.client`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/client/ClientModule.java:13–86](source/api/src/main/java/dev/meteorapi/client/ClientModule.java#L13).

#### dev.meteorapi.client.ClientModule.runInMenus · field · line 20

```java
protected boolean runInMenus
```

Declaring owner: `dev.meteorapi.client.ClientModule`.

Exposure: protected subclass/framework member.

Source span: [api/src/main/java/dev/meteorapi/client/ClientModule.java:20–20](source/api/src/main/java/dev/meteorapi/client/ClientModule.java#L20).

#### dev.meteorapi.client.ClientModule.ClientModule · constructor · line 23

```java
protected ClientModule(NamespacedId id, NamespacedId category, String title, String description)
```

Declaring owner: `dev.meteorapi.client.ClientModule`.

Exposure: protected subclass/framework member.

Source span: [api/src/main/java/dev/meteorapi/client/ClientModule.java:23–29](source/api/src/main/java/dev/meteorapi/client/ClientModule.java#L23).

#### dev.meteorapi.client.ClientModule.category · method · line 30

```java
public final NamespacedId category()
```

Declaring owner: `dev.meteorapi.client.ClientModule`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/client/ClientModule.java:30–30](source/api/src/main/java/dev/meteorapi/client/ClientModule.java#L30).

#### dev.meteorapi.client.ClientModule.title · method · line 31

```java
public final String title()
```

Declaring owner: `dev.meteorapi.client.ClientModule`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/client/ClientModule.java:31–31](source/api/src/main/java/dev/meteorapi/client/ClientModule.java#L31).

#### dev.meteorapi.client.ClientModule.description · method · line 32

```java
public final String description()
```

Declaring owner: `dev.meteorapi.client.ClientModule`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/client/ClientModule.java:32–32](source/api/src/main/java/dev/meteorapi/client/ClientModule.java#L32).

#### dev.meteorapi.client.ClientModule.optionId · method · line 33

```java
public final NamespacedId optionId(String local)
```

Declaring owner: `dev.meteorapi.client.ClientModule`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/client/ClientModule.java:33–33](source/api/src/main/java/dev/meteorapi/client/ClientModule.java#L33).

#### dev.meteorapi.client.ClientModule.setting · method · line 34

```java
protected final <T> Setting<T> setting(Setting<T> setting)
```

Declaring owner: `dev.meteorapi.client.ClientModule`.

Exposure: protected subclass/framework member.

Source span: [api/src/main/java/dev/meteorapi/client/ClientModule.java:34–34](source/api/src/main/java/dev/meteorapi/client/ClientModule.java#L34).

#### dev.meteorapi.client.ClientModule.settings · method · line 35

```java
public final List<Setting<?>> settings()
```

Declaring owner: `dev.meteorapi.client.ClientModule`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/client/ClientModule.java:35–35](source/api/src/main/java/dev/meteorapi/client/ClientModule.java#L35).

#### dev.meteorapi.client.ClientModule.bind · method · line 36

```java
public final void bind(int key, int modifiers)
```

Declaring owner: `dev.meteorapi.client.ClientModule`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/client/ClientModule.java:36–39](source/api/src/main/java/dev/meteorapi/client/ClientModule.java#L36).

#### dev.meteorapi.client.ClientModule.onEnable · method · line 48

```java
@Override protected final void onEnable(ResourceScope scope)
```

Declaring owner: `dev.meteorapi.client.ClientModule`.

Exposure: protected subclass/framework member.

Source span: [api/src/main/java/dev/meteorapi/client/ClientModule.java:48–56](source/api/src/main/java/dev/meteorapi/client/ClientModule.java#L48).

#### dev.meteorapi.client.ClientModule.onDisable · method · line 57

```java
@Override protected final void onDisable()
```

Declaring owner: `dev.meteorapi.client.ClientModule`.

Exposure: protected subclass/framework member.

Source span: [api/src/main/java/dev/meteorapi/client/ClientModule.java:57–57](source/api/src/main/java/dev/meteorapi/client/ClientModule.java#L57).

#### dev.meteorapi.client.ClientModule.running · method · line 58

```java
public final boolean running()
```

Declaring owner: `dev.meteorapi.client.ClientModule`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/client/ClientModule.java:58–58](source/api/src/main/java/dev/meteorapi/client/ClientModule.java#L58).

#### dev.meteorapi.client.ClientModule.onStart · method · line 83

```java
protected void onStart(ResourceScope scope)
```

Declaring owner: `dev.meteorapi.client.ClientModule`.

Exposure: protected subclass/framework member.

Source span: [api/src/main/java/dev/meteorapi/client/ClientModule.java:83–83](source/api/src/main/java/dev/meteorapi/client/ClientModule.java#L83).

#### dev.meteorapi.client.ClientModule.onStop · method · line 84

```java
protected void onStop()
```

Declaring owner: `dev.meteorapi.client.ClientModule`.

Exposure: protected subclass/framework member.

Source span: [api/src/main/java/dev/meteorapi/client/ClientModule.java:84–84](source/api/src/main/java/dev/meteorapi/client/ClientModule.java#L84).

#### dev.meteorapi.client.ClientModule.onTick · method · line 85

```java
protected void onTick()
```

Declaring owner: `dev.meteorapi.client.ClientModule`.

Exposure: protected subclass/framework member.

Source span: [api/src/main/java/dev/meteorapi/client/ClientModule.java:85–85](source/api/src/main/java/dev/meteorapi/client/ClientModule.java#L85).

### Clients — Independent client registry

Source file: [api/src/main/java/dev/meteorapi/client/Clients.java](source/api/src/main/java/dev/meteorapi/client/Clients.java).

Usage contract: Create each owner once on the client thread. Register categories and modules before starting. dispatchChat() belongs to the installed local-chat integration.

Declaration entries in this file: 4.

#### dev.meteorapi.client.Clients · class · line 12

```java
public final class Clients
```

Declaring owner: `dev.meteorapi.client`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/client/Clients.java:12–34](source/api/src/main/java/dev/meteorapi/client/Clients.java#L12).

#### dev.meteorapi.client.Clients.create · method · line 15

```java
public static RegistrationResult<Client> create(String owner, String title)
```

Declaring owner: `dev.meteorapi.client.Clients`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/client/Clients.java:15–22](source/api/src/main/java/dev/meteorapi/client/Clients.java#L15).

#### dev.meteorapi.client.Clients.all · method · line 23

```java
public static List<Client> all()
```

Declaring owner: `dev.meteorapi.client.Clients`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/client/Clients.java:23–23](source/api/src/main/java/dev/meteorapi/client/Clients.java#L23).

#### dev.meteorapi.client.Clients.dispatchChat · method · line 25

```java
public static boolean dispatchChat(String message)
```

Declaring owner: `dev.meteorapi.client.Clients`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/client/Clients.java:25–33](source/api/src/main/java/dev/meteorapi/client/Clients.java#L25).

### Integrations — Optional capability discovery

Source file: [api/src/main/java/dev/meteorapi/compat/Integrations.java](source/api/src/main/java/dev/meteorapi/compat/Integrations.java).

Usage contract: Reads known mod versions and supported optional adapter shapes. PacketFixer access is read-only. Common Networking returns its installed handler object rather than a copied implementation.

Declaration entries in this file: 5.

#### dev.meteorapi.compat.Integrations · class · line 10

```java
public final class Integrations
```

Declaring owner: `dev.meteorapi.compat`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/compat/Integrations.java:10–46](source/api/src/main/java/dev/meteorapi/compat/Integrations.java#L10).

#### dev.meteorapi.compat.Integrations.version · method · line 12

```java
public static Optional<String> version(String modId)
```

Declaring owner: `dev.meteorapi.compat.Integrations`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/compat/Integrations.java:12–14](source/api/src/main/java/dev/meteorapi/compat/Integrations.java#L12).

#### dev.meteorapi.compat.Integrations.installed · method · line 15

```java
public static Map<String, String> installed()
```

Declaring owner: `dev.meteorapi.compat.Integrations`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/compat/Integrations.java:15–20](source/api/src/main/java/dev/meteorapi/compat/Integrations.java#L15).

#### dev.meteorapi.compat.Integrations.packetFixerLimits · method · line 22

```java
public static Map<String, String> packetFixerLimits()
```

Declaring owner: `dev.meteorapi.compat.Integrations`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/compat/Integrations.java:22–36](source/api/src/main/java/dev/meteorapi/compat/Integrations.java#L22).

#### dev.meteorapi.compat.Integrations.commonNetworkHandler · method · line 38

```java
public static Optional<Object> commonNetworkHandler()
```

Declaring owner: `dev.meteorapi.compat.Integrations`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/compat/Integrations.java:38–45](source/api/src/main/java/dev/meteorapi/compat/Integrations.java#L38).

### MeteorBridgeAddon — Optional Meteor entrypoint

Source file: [api/src/main/java/dev/meteorapi/compat/MeteorBridgeAddon.java](source/api/src/main/java/dev/meteorapi/compat/MeteorBridgeAddon.java).

Usage contract: Discovered through the meteor entrypoint. Registers factories for the library's compatibility setting classes. Does not auto-register every optional demo module.

Declaration entries in this file: 3.

#### dev.meteorapi.compat.MeteorBridgeAddon · class · line 14

```java
public final class MeteorBridgeAddon extends MeteorAddon
```

Declaring owner: `dev.meteorapi.compat`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/compat/MeteorBridgeAddon.java:14–56](source/api/src/main/java/dev/meteorapi/compat/MeteorBridgeAddon.java#L14).

#### dev.meteorapi.compat.MeteorBridgeAddon.onInitialize · method · line 16

```java
@Override public void onInitialize()
```

Declaring owner: `dev.meteorapi.compat.MeteorBridgeAddon`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/compat/MeteorBridgeAddon.java:16–47](source/api/src/main/java/dev/meteorapi/compat/MeteorBridgeAddon.java#L16).

#### dev.meteorapi.compat.MeteorBridgeAddon.getPackage · method · line 48

```java
@Override public String getPackage()
```

Declaring owner: `dev.meteorapi.compat.MeteorBridgeAddon`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/compat/MeteorBridgeAddon.java:48–48](source/api/src/main/java/dev/meteorapi/compat/MeteorBridgeAddon.java#L48).

### ModMenuIntegration — Optional Mod Menu entrypoint

Source file: [api/src/main/java/dev/meteorapi/compat/ModMenuIntegration.java](source/api/src/main/java/dev/meteorapi/compat/ModMenuIntegration.java).

Usage contract: Supplies the API configuration screen factory when Mod Menu is installed. The core does not need to resolve this optional type in API-only mode.

Declaration entries in this file: 2.

#### dev.meteorapi.compat.ModMenuIntegration · class · line 7

```java
public final class ModMenuIntegration implements ModMenuApi
```

Declaring owner: `dev.meteorapi.compat`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/compat/ModMenuIntegration.java:7–9](source/api/src/main/java/dev/meteorapi/compat/ModMenuIntegration.java#L7).

#### dev.meteorapi.compat.ModMenuIntegration.getModConfigScreenFactory · method · line 8

```java
@Override public ConfigScreenFactory<?> getModConfigScreenFactory()
```

Declaring owner: `dev.meteorapi.compat.ModMenuIntegration`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/compat/ModMenuIntegration.java:8–8](source/api/src/main/java/dev/meteorapi/compat/ModMenuIntegration.java#L8).

### AddonRegistry — Owned original-Meteor registration

Source file: [api/src/main/java/dev/meteorapi/compat/client/AddonRegistry.java](source/api/src/main/java/dev/meteorapi/compat/client/AddonRegistry.java).

Usage contract: Assigns names before factories run and validates aliases. Categories must be registered during MeteorAddon.onRegisterCategories(). Returns results around guarded registry operations.

Declaration entries in this file: 7.

#### dev.meteorapi.compat.client.AddonRegistry · class · line 16

```java
public final class AddonRegistry
```

Declaring owner: `dev.meteorapi.compat.client`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/compat/client/AddonRegistry.java:16–77](source/api/src/main/java/dev/meteorapi/compat/client/AddonRegistry.java#L16).

#### dev.meteorapi.compat.client.AddonRegistry.AddonRegistry · constructor · line 19

```java
public AddonRegistry(String namespace)
```

Declaring owner: `dev.meteorapi.compat.client.AddonRegistry`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/compat/client/AddonRegistry.java:19–22](source/api/src/main/java/dev/meteorapi/compat/client/AddonRegistry.java#L19).

#### dev.meteorapi.compat.client.AddonRegistry.name · method · line 24

```java
public String name(String localName)
```

Declaring owner: `dev.meteorapi.compat.client.AddonRegistry`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/compat/client/AddonRegistry.java:24–24](source/api/src/main/java/dev/meteorapi/compat/client/AddonRegistry.java#L24).

#### dev.meteorapi.compat.client.AddonRegistry.module · method · line 26

```java
public <T extends Module> RegistrationResult<T> module(String localName, Function<String, T> factory)
```

Declaring owner: `dev.meteorapi.compat.client.AddonRegistry`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/compat/client/AddonRegistry.java:26–35](source/api/src/main/java/dev/meteorapi/compat/client/AddonRegistry.java#L26).

#### dev.meteorapi.compat.client.AddonRegistry.command · method · line 37

```java
public <T extends Command> RegistrationResult<T> command(String localName, Function<String, T> factory)
```

Declaring owner: `dev.meteorapi.compat.client.AddonRegistry`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/compat/client/AddonRegistry.java:37–46](source/api/src/main/java/dev/meteorapi/compat/client/AddonRegistry.java#L37).

#### dev.meteorapi.compat.client.AddonRegistry.hud · method · line 48

```java
public <T extends HudElementInfo<?>> RegistrationResult<T> hud(String localName, Function<String, T> factory)
```

Declaring owner: `dev.meteorapi.compat.client.AddonRegistry`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/compat/client/AddonRegistry.java:48–56](source/api/src/main/java/dev/meteorapi/compat/client/AddonRegistry.java#L48).

#### dev.meteorapi.compat.client.AddonRegistry.category · method · line 58

```java
public RegistrationResult<Category> category(String localName)
```

Declaring owner: `dev.meteorapi.compat.client.AddonRegistry`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/compat/client/AddonRegistry.java:58–64](source/api/src/main/java/dev/meteorapi/compat/client/AddonRegistry.java#L58).

### Diagnostics — Meteor-side diagnostics

Source file: [api/src/main/java/dev/meteorapi/compat/client/Diagnostics.java](source/api/src/main/java/dev/meteorapi/compat/client/Diagnostics.java).

Usage contract: Uses supported original-Meteor systems. Read the implementation for each reported field. Standalone packet counts are exposed separately by Packets.statistics().

Declaration entries in this file: 2.

#### dev.meteorapi.compat.client.Diagnostics · class · line 10

```java
public final class Diagnostics
```

Declaring owner: `dev.meteorapi.compat.client`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/compat/client/Diagnostics.java:10–29](source/api/src/main/java/dev/meteorapi/compat/client/Diagnostics.java#L10).

#### dev.meteorapi.compat.client.Diagnostics.snapshot · method · line 13

```java
public static Map<String, String> snapshot()
```

Declaring owner: `dev.meteorapi.compat.client.Diagnostics`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/compat/client/Diagnostics.java:13–28](source/api/src/main/java/dev/meteorapi/compat/client/Diagnostics.java#L13).

### ManagedModule — Scoped original-Meteor module

Source file: [api/src/main/java/dev/meteorapi/compat/client/ManagedModule.java](source/api/src/main/java/dev/meteorapi/compat/client/ManagedModule.java).

Usage contract: Extends upstream Module, unlike standalone ClientModule. Each activation creates a fresh scope. Cleanup failures are logged so upstream deactivation can reach its final state update.

Declaration entries in this file: 6.

#### dev.meteorapi.compat.client.ManagedModule · class · line 9

```java
public abstract class ManagedModule extends Module
```

Declaring owner: `dev.meteorapi.compat.client`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/compat/client/ManagedModule.java:9–49](source/api/src/main/java/dev/meteorapi/compat/client/ManagedModule.java#L9).

#### dev.meteorapi.compat.client.ManagedModule.ManagedModule · constructor · line 12

```java
protected ManagedModule(Category category, String name, String description)
```

Declaring owner: `dev.meteorapi.compat.client.ManagedModule`.

Exposure: protected subclass/framework member.

Source span: [api/src/main/java/dev/meteorapi/compat/client/ManagedModule.java:12–14](source/api/src/main/java/dev/meteorapi/compat/client/ManagedModule.java#L12).

#### dev.meteorapi.compat.client.ManagedModule.onActivate · method · line 16

```java
@Override public final void onActivate()
```

Declaring owner: `dev.meteorapi.compat.client.ManagedModule`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/compat/client/ManagedModule.java:16–27](source/api/src/main/java/dev/meteorapi/compat/client/ManagedModule.java#L16).

#### dev.meteorapi.compat.client.ManagedModule.onDeactivate · method · line 29

```java
@Override public final void onDeactivate()
```

Declaring owner: `dev.meteorapi.compat.client.ManagedModule`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/compat/client/ManagedModule.java:29–45](source/api/src/main/java/dev/meteorapi/compat/client/ManagedModule.java#L29).

#### dev.meteorapi.compat.client.ManagedModule.onStart · method · line 47

```java
protected abstract void onStart(ResourceScope resources)
```

Declaring owner: `dev.meteorapi.compat.client.ManagedModule`.

Exposure: protected subclass/framework member.

Source span: [api/src/main/java/dev/meteorapi/compat/client/ManagedModule.java:47–47](source/api/src/main/java/dev/meteorapi/compat/client/ManagedModule.java#L47).

#### dev.meteorapi.compat.client.ManagedModule.onStop · method · line 48

```java
protected void onStop()
```

Declaring owner: `dev.meteorapi.compat.client.ManagedModule`.

Exposure: protected subclass/framework member.

Source span: [api/src/main/java/dev/meteorapi/compat/client/ManagedModule.java:48–48](source/api/src/main/java/dev/meteorapi/compat/client/ManagedModule.java#L48).

### MeteorClientApi — Original Meteor bridge

Source file: [api/src/main/java/dev/meteorapi/compat/client/MeteorClientApi.java](source/api/src/main/java/dev/meteorapi/compat/client/MeteorClientApi.java).

Usage contract: Hard Meteor types require an optional loading boundary. isAvailable() checks exact 1.21.11-86; isReady() checks initialization too. Accessors return original systems. Listener ownership is identity-reference-counted.

Declaration entries in this file: 21.

#### dev.meteorapi.compat.client.MeteorClientApi · class · line 24

```java
public final class MeteorClientApi
```

Declaring owner: `dev.meteorapi.compat.client`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/compat/client/MeteorClientApi.java:24–116](source/api/src/main/java/dev/meteorapi/compat/client/MeteorClientApi.java#L24).

#### dev.meteorapi.compat.client.MeteorClientApi.VERSION · field · line 25

```java
public static final String VERSION = "0.2.0"
```

Declaring owner: `dev.meteorapi.compat.client.MeteorClientApi`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/compat/client/MeteorClientApi.java:25–25](source/api/src/main/java/dev/meteorapi/compat/client/MeteorClientApi.java#L25).

#### dev.meteorapi.compat.client.MeteorClientApi.MINECRAFT · field · line 26

```java
public static final String MINECRAFT = "1.21.11"
```

Declaring owner: `dev.meteorapi.compat.client.MeteorClientApi`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/compat/client/MeteorClientApi.java:26–26](source/api/src/main/java/dev/meteorapi/compat/client/MeteorClientApi.java#L26).

#### dev.meteorapi.compat.client.MeteorClientApi.MIN_LOADER · field · line 27

```java
public static final String MIN_LOADER = "0.19.5"
```

Declaring owner: `dev.meteorapi.compat.client.MeteorClientApi`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/compat/client/MeteorClientApi.java:27–27](source/api/src/main/java/dev/meteorapi/compat/client/MeteorClientApi.java#L27).

#### dev.meteorapi.compat.client.MeteorClientApi.UPSTREAM_COMMIT · field · line 28

```java
public static final String UPSTREAM_COMMIT = "48030717dc0d4898a195a713fb048bf597fc5b54"
```

Declaring owner: `dev.meteorapi.compat.client.MeteorClientApi`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/compat/client/MeteorClientApi.java:28–28](source/api/src/main/java/dev/meteorapi/compat/client/MeteorClientApi.java#L28).

#### dev.meteorapi.compat.client.MeteorClientApi.isAvailable · method · line 29

```java
public static boolean isAvailable()
```

Declaring owner: `dev.meteorapi.compat.client.MeteorClientApi`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/compat/client/MeteorClientApi.java:29–32](source/api/src/main/java/dev/meteorapi/compat/client/MeteorClientApi.java#L29).

#### dev.meteorapi.compat.client.MeteorClientApi.isReady · method · line 33

```java
public static boolean isReady()
```

Declaring owner: `dev.meteorapi.compat.client.MeteorClientApi`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/compat/client/MeteorClientApi.java:33–35](source/api/src/main/java/dev/meteorapi/compat/client/MeteorClientApi.java#L33).

#### dev.meteorapi.compat.client.MeteorClientApi.shouldHideHud · method · line 36

```java
public static boolean shouldHideHud()
```

Declaring owner: `dev.meteorapi.compat.client.MeteorClientApi`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/compat/client/MeteorClientApi.java:36–45](source/api/src/main/java/dev/meteorapi/compat/client/MeteorClientApi.java#L36).

#### dev.meteorapi.compat.client.MeteorClientApi.requireClientThread · method · line 53

```java
public static void requireClientThread()
```

Declaring owner: `dev.meteorapi.compat.client.MeteorClientApi`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/compat/client/MeteorClientApi.java:53–56](source/api/src/main/java/dev/meteorapi/compat/client/MeteorClientApi.java#L53).

#### dev.meteorapi.compat.client.MeteorClientApi.client · method · line 58

```java
public static MinecraftClient client()
```

Declaring owner: `dev.meteorapi.compat.client.MeteorClientApi`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/compat/client/MeteorClientApi.java:58–58](source/api/src/main/java/dev/meteorapi/compat/client/MeteorClientApi.java#L58).

#### dev.meteorapi.compat.client.MeteorClientApi.events · method · line 59

```java
public static IEventBus events()
```

Declaring owner: `dev.meteorapi.compat.client.MeteorClientApi`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/compat/client/MeteorClientApi.java:59–59](source/api/src/main/java/dev/meteorapi/compat/client/MeteorClientApi.java#L59).

#### dev.meteorapi.compat.client.MeteorClientApi.modules · method · line 60

```java
public static Modules modules()
```

Declaring owner: `dev.meteorapi.compat.client.MeteorClientApi`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/compat/client/MeteorClientApi.java:60–60](source/api/src/main/java/dev/meteorapi/compat/client/MeteorClientApi.java#L60).

#### dev.meteorapi.compat.client.MeteorClientApi.hud · method · line 61

```java
public static Hud hud()
```

Declaring owner: `dev.meteorapi.compat.client.MeteorClientApi`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/compat/client/MeteorClientApi.java:61–61](source/api/src/main/java/dev/meteorapi/compat/client/MeteorClientApi.java#L61).

#### dev.meteorapi.compat.client.MeteorClientApi.system · method · line 63

```java
public static <T extends System<?>> T system(Class<T> type)
```

Declaring owner: `dev.meteorapi.compat.client.MeteorClientApi`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/compat/client/MeteorClientApi.java:63–69](source/api/src/main/java/dev/meteorapi/compat/client/MeteorClientApi.java#L63).

#### dev.meteorapi.compat.client.MeteorClientApi.theme · method · line 71

```java
public static GuiTheme theme()
```

Declaring owner: `dev.meteorapi.compat.client.MeteorClientApi`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/compat/client/MeteorClientApi.java:71–74](source/api/src/main/java/dev/meteorapi/compat/client/MeteorClientApi.java#L71).

#### dev.meteorapi.compat.client.MeteorClientApi.commands · method · line 76

```java
public static List<Command> commands()
```

Declaring owner: `dev.meteorapi.compat.client.MeteorClientApi`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/compat/client/MeteorClientApi.java:76–76](source/api/src/main/java/dev/meteorapi/compat/client/MeteorClientApi.java#L76).

#### dev.meteorapi.compat.client.MeteorClientApi.services · method · line 77

```java
public static ServiceRegistry services()
```

Declaring owner: `dev.meteorapi.compat.client.MeteorClientApi`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/compat/client/MeteorClientApi.java:77–77](source/api/src/main/java/dev/meteorapi/compat/client/MeteorClientApi.java#L77).

#### dev.meteorapi.compat.client.MeteorClientApi.scheduler · method · line 78

```java
public static TickScheduler scheduler()
```

Declaring owner: `dev.meteorapi.compat.client.MeteorClientApi`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/compat/client/MeteorClientApi.java:78–78](source/api/src/main/java/dev/meteorapi/compat/client/MeteorClientApi.java#L78).

#### dev.meteorapi.compat.client.MeteorClientApi.listen · method · line 81

```java
public static Registration listen(Object listener)
```

Declaring owner: `dev.meteorapi.compat.client.MeteorClientApi`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/compat/client/MeteorClientApi.java:81–95](source/api/src/main/java/dev/meteorapi/compat/client/MeteorClientApi.java#L81).

#### dev.meteorapi.compat.client.MeteorClientApi.requireWorld · method · line 97

```java
public static void requireWorld()
```

Declaring owner: `dev.meteorapi.compat.client.MeteorClientApi`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/compat/client/MeteorClientApi.java:97–101](source/api/src/main/java/dev/meteorapi/compat/client/MeteorClientApi.java#L97).

#### dev.meteorapi.compat.client.MeteorClientApi.execute · method · line 104

```java
public static CompletableFuture<Void> execute(Runnable action)
```

Declaring owner: `dev.meteorapi.compat.client.MeteorClientApi`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/compat/client/MeteorClientApi.java:104–115](source/api/src/main/java/dev/meteorapi/compat/client/MeteorClientApi.java#L104).

### Registry — Guarded Meteor mutation

Source file: [api/src/main/java/dev/meteorapi/compat/client/Registry.java](source/api/src/main/java/dev/meteorapi/compat/client/Registry.java).

Usage contract: Rejects accidental class/name/alias ownership conflicts and category hash collisions. Legacy methods called elsewhere can bypass these guards.

Declaration entries in this file: 5.

#### dev.meteorapi.compat.client.Registry · class · line 14

```java
public final class Registry
```

Declaring owner: `dev.meteorapi.compat.client`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/compat/client/Registry.java:14–75](source/api/src/main/java/dev/meteorapi/compat/client/Registry.java#L14).

#### dev.meteorapi.compat.client.Registry.category · method · line 18

```java
public static void category(Category category)
```

Declaring owner: `dev.meteorapi.compat.client.Registry`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/compat/client/Registry.java:18–28](source/api/src/main/java/dev/meteorapi/compat/client/Registry.java#L18).

#### dev.meteorapi.compat.client.Registry.module · method · line 30

```java
public static <T extends Module> T module(T module)
```

Declaring owner: `dev.meteorapi.compat.client.Registry`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/compat/client/Registry.java:30–46](source/api/src/main/java/dev/meteorapi/compat/client/Registry.java#L30).

#### dev.meteorapi.compat.client.Registry.command · method · line 48

```java
public static <T extends Command> T command(T command)
```

Declaring owner: `dev.meteorapi.compat.client.Registry`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/compat/client/Registry.java:48–58](source/api/src/main/java/dev/meteorapi/compat/client/Registry.java#L48).

#### dev.meteorapi.compat.client.Registry.hud · method · line 66

```java
public static <T extends HudElementInfo<?>> T hud(T info)
```

Declaring owner: `dev.meteorapi.compat.client.Registry`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/compat/client/Registry.java:66–74](source/api/src/main/java/dev/meteorapi/compat/client/Registry.java#L66).

### KeyInputEvent — Meteor-compatible key event

Source file: [api/src/main/java/dev/meteorapi/compat26/events/KeyInputEvent.java](source/api/src/main/java/dev/meteorapi/compat26/events/KeyInputEvent.java).

Usage contract: Optional compat26 class, separate from independent MeteorApi.KeyInputEvent. Uses original Meteor event types and target-version KeyInput.

Declaration entries in this file: 6.

#### dev.meteorapi.compat26.events.KeyInputEvent · class · line 11

```java
public class KeyInputEvent extends Cancellable
```

Declaring owner: `dev.meteorapi.compat26.events`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/compat26/events/KeyInputEvent.java:11–31](source/api/src/main/java/dev/meteorapi/compat26/events/KeyInputEvent.java#L11).

#### dev.meteorapi.compat26.events.KeyInputEvent.input · field · line 14

```java
public net.minecraft.client.input.KeyInput input
```

Declaring owner: `dev.meteorapi.compat26.events.KeyInputEvent`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/compat26/events/KeyInputEvent.java:14–14](source/api/src/main/java/dev/meteorapi/compat26/events/KeyInputEvent.java#L14).

#### dev.meteorapi.compat26.events.KeyInputEvent.action · field · line 15

```java
public KeyAction action
```

Declaring owner: `dev.meteorapi.compat26.events.KeyInputEvent`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/compat26/events/KeyInputEvent.java:15–15](source/api/src/main/java/dev/meteorapi/compat26/events/KeyInputEvent.java#L15).

#### dev.meteorapi.compat26.events.KeyInputEvent.get · method · line 17

```java
public static KeyInputEvent get(net.minecraft.client.input.KeyInput input, KeyAction action)
```

Declaring owner: `dev.meteorapi.compat26.events.KeyInputEvent`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/compat26/events/KeyInputEvent.java:17–22](source/api/src/main/java/dev/meteorapi/compat26/events/KeyInputEvent.java#L17).

#### dev.meteorapi.compat26.events.KeyInputEvent.key · method · line 24

```java
public int key()
```

Declaring owner: `dev.meteorapi.compat26.events.KeyInputEvent`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/compat26/events/KeyInputEvent.java:24–26](source/api/src/main/java/dev/meteorapi/compat26/events/KeyInputEvent.java#L24).

#### dev.meteorapi.compat26.events.KeyInputEvent.modifiers · method · line 28

```java
public int modifiers()
```

Declaring owner: `dev.meteorapi.compat26.events.KeyInputEvent`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/compat26/events/KeyInputEvent.java:28–30](source/api/src/main/java/dev/meteorapi/compat26/events/KeyInputEvent.java#L28).

### PacketBoolSettingScreen — Meteor packet chooser

Source file: [api/src/main/java/dev/meteorapi/compat26/gui/PacketBoolSettingScreen.java](source/api/src/main/java/dev/meteorapi/compat26/gui/PacketBoolSettingScreen.java).

Usage contract: Collection-list setting screen for PacketType values. Protected overrides provide value inclusion, display widget, and name behavior.

Declaration entries in this file: 5.

#### dev.meteorapi.compat26.gui.PacketBoolSettingScreen · class · line 21

```java
public class PacketBoolSettingScreen extends CollectionListSettingScreen<PacketType<?>>
```

Declaring owner: `dev.meteorapi.compat26.gui`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/compat26/gui/PacketBoolSettingScreen.java:21–45](source/api/src/main/java/dev/meteorapi/compat26/gui/PacketBoolSettingScreen.java#L21).

#### dev.meteorapi.compat26.gui.PacketBoolSettingScreen.PacketBoolSettingScreen · constructor · line 22

```java
public PacketBoolSettingScreen(GuiTheme theme, Setting<Set<PacketType<?>>> setting)
```

Declaring owner: `dev.meteorapi.compat26.gui.PacketBoolSettingScreen`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/compat26/gui/PacketBoolSettingScreen.java:22–24](source/api/src/main/java/dev/meteorapi/compat26/gui/PacketBoolSettingScreen.java#L22).

#### dev.meteorapi.compat26.gui.PacketBoolSettingScreen.includeValue · method · line 26

```java
@Override protected boolean includeValue(PacketType<?> value)
```

Declaring owner: `dev.meteorapi.compat26.gui.PacketBoolSettingScreen`.

Exposure: protected subclass/framework member.

Source span: [api/src/main/java/dev/meteorapi/compat26/gui/PacketBoolSettingScreen.java:26–32](source/api/src/main/java/dev/meteorapi/compat26/gui/PacketBoolSettingScreen.java#L26).

#### dev.meteorapi.compat26.gui.PacketBoolSettingScreen.getValueWidget · method · line 34

```java
@Override protected WWidget getValueWidget(PacketType<?> value)
```

Declaring owner: `dev.meteorapi.compat26.gui.PacketBoolSettingScreen`.

Exposure: protected subclass/framework member.

Source span: [api/src/main/java/dev/meteorapi/compat26/gui/PacketBoolSettingScreen.java:34–37](source/api/src/main/java/dev/meteorapi/compat26/gui/PacketBoolSettingScreen.java#L34).

#### dev.meteorapi.compat26.gui.PacketBoolSettingScreen.getValueNames · method · line 39

```java
@Override protected String[] getValueNames(PacketType<?> value)
```

Declaring owner: `dev.meteorapi.compat26.gui.PacketBoolSettingScreen`.

Exposure: protected subclass/framework member.

Source span: [api/src/main/java/dev/meteorapi/compat26/gui/PacketBoolSettingScreen.java:39–44](source/api/src/main/java/dev/meteorapi/compat26/gui/PacketBoolSettingScreen.java#L39).

### RenderApi — Additive widget drawing helper

Source file: [api/src/main/java/dev/meteorapi/compat26/gui/RenderApi.java](source/api/src/main/java/dev/meteorapi/compat26/gui/RenderApi.java).

Usage contract: Fills target widget bounds using target DrawContext and Meteor color. Does not replace native rendering access.

Declaration entries in this file: 2.

#### dev.meteorapi.compat26.gui.RenderApi · class · line 6

```java
public final class RenderApi
```

Declaring owner: `dev.meteorapi.compat26.gui`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/compat26/gui/RenderApi.java:6–11](source/api/src/main/java/dev/meteorapi/compat26/gui/RenderApi.java#L6).

#### dev.meteorapi.compat26.gui.RenderApi.fill · method · line 8

```java
public static void fill(DrawContext graphics, WWidget widget, Color color)
```

Declaring owner: `dev.meteorapi.compat26.gui.RenderApi`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/compat26/gui/RenderApi.java:8–10](source/api/src/main/java/dev/meteorapi/compat26/gui/RenderApi.java#L8).

### ThemeApi — Additive Meteor theme helper

Source file: [api/src/main/java/dev/meteorapi/compat26/gui/ThemeApi.java](source/api/src/main/java/dev/meteorapi/compat26/gui/ThemeApi.java).

Usage contract: Creates the compatibility long editor without replacing original GuiTheme class definitions.

Declaration entries in this file: 2.

#### dev.meteorapi.compat26.gui.ThemeApi · class · line 5

```java
public final class ThemeApi
```

Declaring owner: `dev.meteorapi.compat26.gui`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/compat26/gui/ThemeApi.java:5–10](source/api/src/main/java/dev/meteorapi/compat26/gui/ThemeApi.java#L5).

#### dev.meteorapi.compat26.gui.ThemeApi.longEdit · method · line 7

```java
public static WLongEdit longEdit(GuiTheme theme, long value, long min, long max)
```

Declaring owner: `dev.meteorapi.compat26.gui.ThemeApi`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/compat26/gui/ThemeApi.java:7–9](source/api/src/main/java/dev/meteorapi/compat26/gui/ThemeApi.java#L7).

### WLongEdit — Meteor long editor

Source file: [api/src/main/java/dev/meteorapi/compat26/gui/WLongEdit.java](source/api/src/main/java/dev/meteorapi/compat26/gui/WLongEdit.java).

Usage contract: Full-width long bounds and commit behavior. Original widget lifecycle applies. Exposed actions connect to the setting/theme bridge.

Declaration entries in this file: 9.

#### dev.meteorapi.compat26.gui.WLongEdit · class · line 12

```java
public class WLongEdit extends WHorizontalList
```

Declaring owner: `dev.meteorapi.compat26.gui`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/compat26/gui/WLongEdit.java:12–69](source/api/src/main/java/dev/meteorapi/compat26/gui/WLongEdit.java#L12).

#### dev.meteorapi.compat26.gui.WLongEdit.max · field · line 15

```java
public final long min, max
```

Declaring owner: `dev.meteorapi.compat26.gui.WLongEdit`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/compat26/gui/WLongEdit.java:15–15](source/api/src/main/java/dev/meteorapi/compat26/gui/WLongEdit.java#L15).

#### dev.meteorapi.compat26.gui.WLongEdit.min · field · line 15

```java
public final long min, max
```

Declaring owner: `dev.meteorapi.compat26.gui.WLongEdit`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/compat26/gui/WLongEdit.java:15–15](source/api/src/main/java/dev/meteorapi/compat26/gui/WLongEdit.java#L15).

#### dev.meteorapi.compat26.gui.WLongEdit.action · field · line 17

```java
public Runnable action
```

Declaring owner: `dev.meteorapi.compat26.gui.WLongEdit`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/compat26/gui/WLongEdit.java:17–17](source/api/src/main/java/dev/meteorapi/compat26/gui/WLongEdit.java#L17).

#### dev.meteorapi.compat26.gui.WLongEdit.actionOnRelease · field · line 18

```java
public Runnable actionOnRelease
```

Declaring owner: `dev.meteorapi.compat26.gui.WLongEdit`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/compat26/gui/WLongEdit.java:18–18](source/api/src/main/java/dev/meteorapi/compat26/gui/WLongEdit.java#L18).

#### dev.meteorapi.compat26.gui.WLongEdit.WLongEdit · constructor · line 22

```java
public WLongEdit(long value, long min, long max)
```

Declaring owner: `dev.meteorapi.compat26.gui.WLongEdit`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/compat26/gui/WLongEdit.java:22–26](source/api/src/main/java/dev/meteorapi/compat26/gui/WLongEdit.java#L22).

#### dev.meteorapi.compat26.gui.WLongEdit.init · method · line 28

```java
@Override public void init()
```

Declaring owner: `dev.meteorapi.compat26.gui.WLongEdit`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/compat26/gui/WLongEdit.java:28–53](source/api/src/main/java/dev/meteorapi/compat26/gui/WLongEdit.java#L28).

#### dev.meteorapi.compat26.gui.WLongEdit.get · method · line 61

```java
public long get()
```

Declaring owner: `dev.meteorapi.compat26.gui.WLongEdit`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/compat26/gui/WLongEdit.java:61–63](source/api/src/main/java/dev/meteorapi/compat26/gui/WLongEdit.java#L61).

#### dev.meteorapi.compat26.gui.WLongEdit.set · method · line 65

```java
public void set(long value)
```

Declaring owner: `dev.meteorapi.compat26.gui.WLongEdit`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/compat26/gui/WLongEdit.java:65–68](source/api/src/main/java/dev/meteorapi/compat26/gui/WLongEdit.java#L65).

### WeatherChanger — Optional adapted Meteor module

Source file: [api/src/main/java/dev/meteorapi/compat26/modules/WeatherChanger.java](source/api/src/main/java/dev/meteorapi/compat26/modules/WeatherChanger.java).

Usage contract: Requires explicit module registration and original Meteor dependencies. It is not automatically installed in every API client.

Declaration entries in this file: 4.

#### dev.meteorapi.compat26.modules.WeatherChanger · class · line 18

```java
public class WeatherChanger extends Module
```

Declaring owner: `dev.meteorapi.compat26.modules`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/compat26/modules/WeatherChanger.java:18–90](source/api/src/main/java/dev/meteorapi/compat26/modules/WeatherChanger.java#L18).

#### dev.meteorapi.compat26.modules.WeatherChanger.WeatherChanger · constructor · line 40

```java
public WeatherChanger()
```

Declaring owner: `dev.meteorapi.compat26.modules.WeatherChanger`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/compat26/modules/WeatherChanger.java:40–42](source/api/src/main/java/dev/meteorapi/compat26/modules/WeatherChanger.java#L40).

#### dev.meteorapi.compat26.modules.WeatherChanger.onActivate · method · line 44

```java
@Override public void onActivate()
```

Declaring owner: `dev.meteorapi.compat26.modules.WeatherChanger`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/compat26/modules/WeatherChanger.java:44–50](source/api/src/main/java/dev/meteorapi/compat26/modules/WeatherChanger.java#L44).

#### dev.meteorapi.compat26.modules.WeatherChanger.onDeactivate · method · line 52

```java
@Override public void onDeactivate()
```

Declaring owner: `dev.meteorapi.compat26.modules.WeatherChanger`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/compat26/modules/WeatherChanger.java:52–58](source/api/src/main/java/dev/meteorapi/compat26/modules/WeatherChanger.java#L52).

### IVertexConsumerProvider — Optional provider interface

Source file: [api/src/main/java/dev/meteorapi/compat26/render/IVertexConsumerProvider.java](source/api/src/main/java/dev/meteorapi/compat26/render/IVertexConsumerProvider.java).

Usage contract: Extends original Meteor provider interface. Inherited methods are not exhaustively expanded by this source declaration inventory.

Declaration entries in this file: 1.

#### dev.meteorapi.compat26.render.IVertexConsumerProvider · interface · line 4

```java
public interface IVertexConsumerProvider extends meteordevelopment.meteorclient.utils.render.IVertexConsumerProvider
```

Declaring owner: `dev.meteorapi.compat26.render`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/compat26/render/IVertexConsumerProvider.java:4–4](source/api/src/main/java/dev/meteorapi/compat26/render/IVertexConsumerProvider.java#L4).

### OutlineRenderCommandQueue — Optional outline queue adapter

Source file: [api/src/main/java/dev/meteorapi/compat26/render/OutlineRenderCommandQueue.java](source/api/src/main/java/dev/meteorapi/compat26/render/OutlineRenderCommandQueue.java).

Usage contract: Extends original Meteor outline queue and adapts the implemented ordering API. Actual render timing/context requirements remain.

Declaration entries in this file: 2.

#### dev.meteorapi.compat26.render.OutlineRenderCommandQueue · class · line 5

```java
public class OutlineRenderCommandQueue extends meteordevelopment.meteorclient.utils.OutlineRenderCommandQueue
```

Declaring owner: `dev.meteorapi.compat26.render`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/compat26/render/OutlineRenderCommandQueue.java:5–7](source/api/src/main/java/dev/meteorapi/compat26/render/OutlineRenderCommandQueue.java#L5).

#### dev.meteorapi.compat26.render.OutlineRenderCommandQueue.order · method · line 6

```java
public BatchingRenderCommandQueue order(int order)
```

Declaring owner: `dev.meteorapi.compat26.render.OutlineRenderCommandQueue`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/compat26/render/OutlineRenderCommandQueue.java:6–6](source/api/src/main/java/dev/meteorapi/compat26/render/OutlineRenderCommandQueue.java#L6).

### VertexConsumerAdapter — Optional vertex naming adapter

Source file: [api/src/main/java/dev/meteorapi/compat26/render/VertexConsumerAdapter.java](source/api/src/main/java/dev/meteorapi/compat26/render/VertexConsumerAdapter.java).

Usage contract: Fluent vertex/color/UV/normal/width adapters use original mesh infrastructure. Buffer format and draw timing remain native obligations.

Declaration entries in this file: 11.

#### dev.meteorapi.compat26.render.VertexConsumerAdapter · class · line 6

```java
public class VertexConsumerAdapter extends MeshBuilderVertexConsumerProvider.MeshBuilderVertexConsumer
```

Declaring owner: `dev.meteorapi.compat26.render`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/compat26/render/VertexConsumerAdapter.java:6–18](source/api/src/main/java/dev/meteorapi/compat26/render/VertexConsumerAdapter.java#L6).

#### dev.meteorapi.compat26.render.VertexConsumerAdapter.VertexConsumerAdapter · constructor · line 7

```java
public VertexConsumerAdapter(MeshBuilder mesh)
```

Declaring owner: `dev.meteorapi.compat26.render.VertexConsumerAdapter`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/compat26/render/VertexConsumerAdapter.java:7–7](source/api/src/main/java/dev/meteorapi/compat26/render/VertexConsumerAdapter.java#L7).

#### dev.meteorapi.compat26.render.VertexConsumerAdapter.addVertex · method · line 8

```java
public VertexConsumerAdapter addVertex(float x, float y, float z)
```

Declaring owner: `dev.meteorapi.compat26.render.VertexConsumerAdapter`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/compat26/render/VertexConsumerAdapter.java:8–8](source/api/src/main/java/dev/meteorapi/compat26/render/VertexConsumerAdapter.java#L8).

#### dev.meteorapi.compat26.render.VertexConsumerAdapter.setColor · method · line 9

```java
public VertexConsumerAdapter setColor(int r, int g, int b, int a)
```

Declaring owner: `dev.meteorapi.compat26.render.VertexConsumerAdapter`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/compat26/render/VertexConsumerAdapter.java:9–9](source/api/src/main/java/dev/meteorapi/compat26/render/VertexConsumerAdapter.java#L9).

#### dev.meteorapi.compat26.render.VertexConsumerAdapter.setColor · method · line 10

```java
public VertexConsumerAdapter setColor(int color)
```

Declaring owner: `dev.meteorapi.compat26.render.VertexConsumerAdapter`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/compat26/render/VertexConsumerAdapter.java:10–10](source/api/src/main/java/dev/meteorapi/compat26/render/VertexConsumerAdapter.java#L10).

#### dev.meteorapi.compat26.render.VertexConsumerAdapter.setUv · method · line 11

```java
public VertexConsumerAdapter setUv(float u, float v)
```

Declaring owner: `dev.meteorapi.compat26.render.VertexConsumerAdapter`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/compat26/render/VertexConsumerAdapter.java:11–11](source/api/src/main/java/dev/meteorapi/compat26/render/VertexConsumerAdapter.java#L11).

#### dev.meteorapi.compat26.render.VertexConsumerAdapter.setUv1 · method · line 12

```java
public VertexConsumerAdapter setUv1(int u, int v)
```

Declaring owner: `dev.meteorapi.compat26.render.VertexConsumerAdapter`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/compat26/render/VertexConsumerAdapter.java:12–12](source/api/src/main/java/dev/meteorapi/compat26/render/VertexConsumerAdapter.java#L12).

#### dev.meteorapi.compat26.render.VertexConsumerAdapter.setUv2 · method · line 13

```java
public VertexConsumerAdapter setUv2(int u, int v)
```

Declaring owner: `dev.meteorapi.compat26.render.VertexConsumerAdapter`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/compat26/render/VertexConsumerAdapter.java:13–13](source/api/src/main/java/dev/meteorapi/compat26/render/VertexConsumerAdapter.java#L13).

#### dev.meteorapi.compat26.render.VertexConsumerAdapter.setUv3 · method · line 15

```java
public VertexConsumerAdapter setUv3(float u, float v)
```

Declaring owner: `dev.meteorapi.compat26.render.VertexConsumerAdapter`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/compat26/render/VertexConsumerAdapter.java:15–15](source/api/src/main/java/dev/meteorapi/compat26/render/VertexConsumerAdapter.java#L15).

#### dev.meteorapi.compat26.render.VertexConsumerAdapter.setNormal · method · line 16

```java
public VertexConsumerAdapter setNormal(float x, float y, float z)
```

Declaring owner: `dev.meteorapi.compat26.render.VertexConsumerAdapter`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/compat26/render/VertexConsumerAdapter.java:16–16](source/api/src/main/java/dev/meteorapi/compat26/render/VertexConsumerAdapter.java#L16).

#### dev.meteorapi.compat26.render.VertexConsumerAdapter.setLineWidth · method · line 17

```java
public VertexConsumerAdapter setLineWidth(float width)
```

Declaring owner: `dev.meteorapi.compat26.render.VertexConsumerAdapter`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/compat26/render/VertexConsumerAdapter.java:17–17](source/api/src/main/java/dev/meteorapi/compat26/render/VertexConsumerAdapter.java#L17).

### FileSetting — Meteor file setting

Source file: [api/src/main/java/dev/meteorapi/compat26/settings/FileSetting.java](source/api/src/main/java/dev/meteorapi/compat26/settings/FileSetting.java).

Usage contract: Uses File and original Meteor setting infrastructure. It is distinct from independent Settings.file(), which stores Path. Filter and NBT behavior are in the source.

Declaration entries in this file: 11.

#### dev.meteorapi.compat26.settings.FileSetting · class · line 15

```java
public class FileSetting extends Setting<File>
```

Declaring owner: `dev.meteorapi.compat26.settings`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/compat26/settings/FileSetting.java:15–71](source/api/src/main/java/dev/meteorapi/compat26/settings/FileSetting.java#L15).

#### dev.meteorapi.compat26.settings.FileSetting.filter · field · line 17

```java
public final String filter
```

Declaring owner: `dev.meteorapi.compat26.settings.FileSetting`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/compat26/settings/FileSetting.java:17–17](source/api/src/main/java/dev/meteorapi/compat26/settings/FileSetting.java#L17).

#### dev.meteorapi.compat26.settings.FileSetting.FileSetting · constructor · line 19

```java
public FileSetting(String name, String description, File defaultValue, Consumer<File> onChanged, Consumer<Setting<File>> onModuleActivated, IVisible visible, String filter)
```

Declaring owner: `dev.meteorapi.compat26.settings.FileSetting`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/compat26/settings/FileSetting.java:19–23](source/api/src/main/java/dev/meteorapi/compat26/settings/FileSetting.java#L19).

#### dev.meteorapi.compat26.settings.FileSetting.parseImpl · method · line 25

```java
@Override protected File parseImpl(String str)
```

Declaring owner: `dev.meteorapi.compat26.settings.FileSetting`.

Exposure: protected subclass/framework member.

Source span: [api/src/main/java/dev/meteorapi/compat26/settings/FileSetting.java:25–29](source/api/src/main/java/dev/meteorapi/compat26/settings/FileSetting.java#L25).

#### dev.meteorapi.compat26.settings.FileSetting.isValueValid · method · line 31

```java
@Override protected boolean isValueValid(File value)
```

Declaring owner: `dev.meteorapi.compat26.settings.FileSetting`.

Exposure: protected subclass/framework member.

Source span: [api/src/main/java/dev/meteorapi/compat26/settings/FileSetting.java:31–34](source/api/src/main/java/dev/meteorapi/compat26/settings/FileSetting.java#L31).

#### dev.meteorapi.compat26.settings.FileSetting.save · method · line 36

```java
@Override protected NbtCompound save(NbtCompound tag)
```

Declaring owner: `dev.meteorapi.compat26.settings.FileSetting`.

Exposure: protected subclass/framework member.

Source span: [api/src/main/java/dev/meteorapi/compat26/settings/FileSetting.java:36–43](source/api/src/main/java/dev/meteorapi/compat26/settings/FileSetting.java#L36).

#### dev.meteorapi.compat26.settings.FileSetting.load · method · line 45

```java
@Override protected File load(NbtCompound tag)
```

Declaring owner: `dev.meteorapi.compat26.settings.FileSetting`.

Exposure: protected subclass/framework member.

Source span: [api/src/main/java/dev/meteorapi/compat26/settings/FileSetting.java:45–52](source/api/src/main/java/dev/meteorapi/compat26/settings/FileSetting.java#L45).

#### dev.meteorapi.compat26.settings.FileSetting.Builder · class · line 54

```java
public static class Builder extends SettingBuilder<FileSetting.Builder, File, FileSetting>
```

Declaring owner: `dev.meteorapi.compat26.settings.FileSetting`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/compat26/settings/FileSetting.java:54–70](source/api/src/main/java/dev/meteorapi/compat26/settings/FileSetting.java#L54).

#### dev.meteorapi.compat26.settings.FileSetting.Builder.Builder · constructor · line 57

```java
public Builder()
```

Declaring owner: `dev.meteorapi.compat26.settings.FileSetting.Builder`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/compat26/settings/FileSetting.java:57–59](source/api/src/main/java/dev/meteorapi/compat26/settings/FileSetting.java#L57).

#### dev.meteorapi.compat26.settings.FileSetting.Builder.filter · method · line 61

```java
public FileSetting.Builder filter(String filter)
```

Declaring owner: `dev.meteorapi.compat26.settings.FileSetting.Builder`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/compat26/settings/FileSetting.java:61–64](source/api/src/main/java/dev/meteorapi/compat26/settings/FileSetting.java#L61).

#### dev.meteorapi.compat26.settings.FileSetting.Builder.build · method · line 66

```java
@Override public FileSetting build()
```

Declaring owner: `dev.meteorapi.compat26.settings.FileSetting.Builder`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/compat26/settings/FileSetting.java:66–69](source/api/src/main/java/dev/meteorapi/compat26/settings/FileSetting.java#L66).

### LongSetting — Meteor long setting

Source file: [api/src/main/java/dev/meteorapi/compat26/settings/LongSetting.java](source/api/src/main/java/dev/meteorapi/compat26/settings/LongSetting.java).

Usage contract: Extends original Setting<Long>. Preserves long width, bounds, parsing, and NBT. Use builder methods and inherited upstream options deliberately.

Declaration entries in this file: 13.

#### dev.meteorapi.compat26.settings.LongSetting · class · line 14

```java
public class LongSetting extends Setting<Long>
```

Declaring owner: `dev.meteorapi.compat26.settings`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/compat26/settings/LongSetting.java:14–80](source/api/src/main/java/dev/meteorapi/compat26/settings/LongSetting.java#L14).

#### dev.meteorapi.compat26.settings.LongSetting.max · field · line 15

```java
public final long min, max
```

Declaring owner: `dev.meteorapi.compat26.settings.LongSetting`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/compat26/settings/LongSetting.java:15–15](source/api/src/main/java/dev/meteorapi/compat26/settings/LongSetting.java#L15).

#### dev.meteorapi.compat26.settings.LongSetting.min · field · line 15

```java
public final long min, max
```

Declaring owner: `dev.meteorapi.compat26.settings.LongSetting`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/compat26/settings/LongSetting.java:15–15](source/api/src/main/java/dev/meteorapi/compat26/settings/LongSetting.java#L15).

#### dev.meteorapi.compat26.settings.LongSetting.parseImpl · method · line 24

```java
@Override protected Long parseImpl(String str)
```

Declaring owner: `dev.meteorapi.compat26.settings.LongSetting`.

Exposure: protected subclass/framework member.

Source span: [api/src/main/java/dev/meteorapi/compat26/settings/LongSetting.java:24–31](source/api/src/main/java/dev/meteorapi/compat26/settings/LongSetting.java#L24).

#### dev.meteorapi.compat26.settings.LongSetting.isValueValid · method · line 33

```java
@Override protected boolean isValueValid(Long value)
```

Declaring owner: `dev.meteorapi.compat26.settings.LongSetting`.

Exposure: protected subclass/framework member.

Source span: [api/src/main/java/dev/meteorapi/compat26/settings/LongSetting.java:33–36](source/api/src/main/java/dev/meteorapi/compat26/settings/LongSetting.java#L33).

#### dev.meteorapi.compat26.settings.LongSetting.save · method · line 38

```java
@Override public NbtCompound save(NbtCompound tag)
```

Declaring owner: `dev.meteorapi.compat26.settings.LongSetting`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/compat26/settings/LongSetting.java:38–43](source/api/src/main/java/dev/meteorapi/compat26/settings/LongSetting.java#L38).

#### dev.meteorapi.compat26.settings.LongSetting.load · method · line 45

```java
@Override public Long load(NbtCompound tag)
```

Declaring owner: `dev.meteorapi.compat26.settings.LongSetting`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/compat26/settings/LongSetting.java:45–50](source/api/src/main/java/dev/meteorapi/compat26/settings/LongSetting.java#L45).

#### dev.meteorapi.compat26.settings.LongSetting.Builder · class · line 52

```java
public static class Builder extends SettingBuilder<Builder, Long, LongSetting>
```

Declaring owner: `dev.meteorapi.compat26.settings.LongSetting`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/compat26/settings/LongSetting.java:52–79](source/api/src/main/java/dev/meteorapi/compat26/settings/LongSetting.java#L52).

#### dev.meteorapi.compat26.settings.LongSetting.Builder.Builder · constructor · line 55

```java
public Builder()
```

Declaring owner: `dev.meteorapi.compat26.settings.LongSetting.Builder`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/compat26/settings/LongSetting.java:55–57](source/api/src/main/java/dev/meteorapi/compat26/settings/LongSetting.java#L55).

#### dev.meteorapi.compat26.settings.LongSetting.Builder.min · method · line 59

```java
public Builder min(long min)
```

Declaring owner: `dev.meteorapi.compat26.settings.LongSetting.Builder`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/compat26/settings/LongSetting.java:59–62](source/api/src/main/java/dev/meteorapi/compat26/settings/LongSetting.java#L59).

#### dev.meteorapi.compat26.settings.LongSetting.Builder.max · method · line 64

```java
public Builder max(long max)
```

Declaring owner: `dev.meteorapi.compat26.settings.LongSetting.Builder`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/compat26/settings/LongSetting.java:64–67](source/api/src/main/java/dev/meteorapi/compat26/settings/LongSetting.java#L64).

#### dev.meteorapi.compat26.settings.LongSetting.Builder.range · method · line 69

```java
public Builder range(long min, long max)
```

Declaring owner: `dev.meteorapi.compat26.settings.LongSetting.Builder`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/compat26/settings/LongSetting.java:69–73](source/api/src/main/java/dev/meteorapi/compat26/settings/LongSetting.java#L69).

#### dev.meteorapi.compat26.settings.LongSetting.Builder.build · method · line 75

```java
@Override public LongSetting build()
```

Declaring owner: `dev.meteorapi.compat26.settings.LongSetting.Builder`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/compat26/settings/LongSetting.java:75–78](source/api/src/main/java/dev/meteorapi/compat26/settings/LongSetting.java#L75).

### PacketListSetting — Meteor packet-type set setting

Source file: [api/src/main/java/dev/meteorapi/compat26/settings/PacketListSetting.java](source/api/src/main/java/dev/meteorapi/compat26/settings/PacketListSetting.java).

Usage contract: Supports direction/filter selection, parse, suggestions, reset, and NBT over the actual target packet catalog.

Declaration entries in this file: 15.

#### dev.meteorapi.compat26.settings.PacketListSetting · class · line 24

```java
public class PacketListSetting extends Setting<Set<PacketType<?>>>
```

Declaring owner: `dev.meteorapi.compat26.settings`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/compat26/settings/PacketListSetting.java:24–117](source/api/src/main/java/dev/meteorapi/compat26/settings/PacketListSetting.java#L24).

#### dev.meteorapi.compat26.settings.PacketListSetting.filter · field · line 25

```java
public final Predicate<PacketType<?>> filter
```

Declaring owner: `dev.meteorapi.compat26.settings.PacketListSetting`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/compat26/settings/PacketListSetting.java:25–25](source/api/src/main/java/dev/meteorapi/compat26/settings/PacketListSetting.java#L25).

#### dev.meteorapi.compat26.settings.PacketListSetting.PacketListSetting · constructor · line 27

```java
public PacketListSetting(String name, String description, Set<PacketType<?>> defaultValue, Consumer<Set<PacketType<?>>> onChanged, Consumer<Setting<Set<PacketType<?>>>> onModuleActivated, Predicate<PacketType<?>> filter, IVisible visible)
```

Declaring owner: `dev.meteorapi.compat26.settings.PacketListSetting`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/compat26/settings/PacketListSetting.java:27–31](source/api/src/main/java/dev/meteorapi/compat26/settings/PacketListSetting.java#L27).

#### dev.meteorapi.compat26.settings.PacketListSetting.resetImpl · method · line 33

```java
@Override public void resetImpl()
```

Declaring owner: `dev.meteorapi.compat26.settings.PacketListSetting`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/compat26/settings/PacketListSetting.java:33–36](source/api/src/main/java/dev/meteorapi/compat26/settings/PacketListSetting.java#L33).

#### dev.meteorapi.compat26.settings.PacketListSetting.parseImpl · method · line 38

```java
@Override protected Set<PacketType<?>> parseImpl(String str)
```

Declaring owner: `dev.meteorapi.compat26.settings.PacketListSetting`.

Exposure: protected subclass/framework member.

Source span: [api/src/main/java/dev/meteorapi/compat26/settings/PacketListSetting.java:38–52](source/api/src/main/java/dev/meteorapi/compat26/settings/PacketListSetting.java#L38).

#### dev.meteorapi.compat26.settings.PacketListSetting.isValueValid · method · line 54

```java
@Override protected boolean isValueValid(Set<PacketType<?>> value)
```

Declaring owner: `dev.meteorapi.compat26.settings.PacketListSetting`.

Exposure: protected subclass/framework member.

Source span: [api/src/main/java/dev/meteorapi/compat26/settings/PacketListSetting.java:54–57](source/api/src/main/java/dev/meteorapi/compat26/settings/PacketListSetting.java#L54).

#### dev.meteorapi.compat26.settings.PacketListSetting.getSuggestions · method · line 59

```java
@Override public java.util.List<String> getSuggestions()
```

Declaring owner: `dev.meteorapi.compat26.settings.PacketListSetting`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/compat26/settings/PacketListSetting.java:59–64](source/api/src/main/java/dev/meteorapi/compat26/settings/PacketListSetting.java#L59).

#### dev.meteorapi.compat26.settings.PacketListSetting.save · method · line 66

```java
@Override public NbtCompound save(NbtCompound tag)
```

Declaring owner: `dev.meteorapi.compat26.settings.PacketListSetting`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/compat26/settings/PacketListSetting.java:66–75](source/api/src/main/java/dev/meteorapi/compat26/settings/PacketListSetting.java#L66).

#### dev.meteorapi.compat26.settings.PacketListSetting.load · method · line 77

```java
@Override public Set<PacketType<?>> load(NbtCompound tag)
```

Declaring owner: `dev.meteorapi.compat26.settings.PacketListSetting`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/compat26/settings/PacketListSetting.java:77–90](source/api/src/main/java/dev/meteorapi/compat26/settings/PacketListSetting.java#L77).

#### dev.meteorapi.compat26.settings.PacketListSetting.Builder · class · line 92

```java
public static class Builder extends SettingBuilder<Builder, Set<PacketType<?>>, PacketListSetting>
```

Declaring owner: `dev.meteorapi.compat26.settings.PacketListSetting`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/compat26/settings/PacketListSetting.java:92–116](source/api/src/main/java/dev/meteorapi/compat26/settings/PacketListSetting.java#L92).

#### dev.meteorapi.compat26.settings.PacketListSetting.Builder.Builder · constructor · line 95

```java
public Builder()
```

Declaring owner: `dev.meteorapi.compat26.settings.PacketListSetting.Builder`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/compat26/settings/PacketListSetting.java:95–97](source/api/src/main/java/dev/meteorapi/compat26/settings/PacketListSetting.java#L95).

#### dev.meteorapi.compat26.settings.PacketListSetting.Builder.filter · method · line 99

```java
public Builder filter(Predicate<PacketType<?>> filter)
```

Declaring owner: `dev.meteorapi.compat26.settings.PacketListSetting.Builder`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/compat26/settings/PacketListSetting.java:99–102](source/api/src/main/java/dev/meteorapi/compat26/settings/PacketListSetting.java#L99).

#### dev.meteorapi.compat26.settings.PacketListSetting.Builder.clientbound · method · line 104

```java
public Builder clientbound()
```

Declaring owner: `dev.meteorapi.compat26.settings.PacketListSetting.Builder`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/compat26/settings/PacketListSetting.java:104–106](source/api/src/main/java/dev/meteorapi/compat26/settings/PacketListSetting.java#L104).

#### dev.meteorapi.compat26.settings.PacketListSetting.Builder.serverbound · method · line 108

```java
public Builder serverbound()
```

Declaring owner: `dev.meteorapi.compat26.settings.PacketListSetting.Builder`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/compat26/settings/PacketListSetting.java:108–110](source/api/src/main/java/dev/meteorapi/compat26/settings/PacketListSetting.java#L108).

#### dev.meteorapi.compat26.settings.PacketListSetting.Builder.build · method · line 112

```java
@Override public PacketListSetting build()
```

Declaring owner: `dev.meteorapi.compat26.settings.PacketListSetting.Builder`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/compat26/settings/PacketListSetting.java:112–115](source/api/src/main/java/dev/meteorapi/compat26/settings/PacketListSetting.java#L112).

### GameAccess — Actual Minecraft objects

Source file: [api/src/main/java/dev/meteorapi/game/GameAccess.java](source/api/src/main/java/dev/meteorapi/game/GameAccess.java).

Usage contract: Client-thread checks and Optional access reflect actual player/world/network/inventory availability. Do not retain stale world objects across session changes.

Declaration entries in this file: 8.

#### dev.meteorapi.game.GameAccess · class · line 11

```java
public final class GameAccess
```

Declaring owner: `dev.meteorapi.game`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/game/GameAccess.java:11–20](source/api/src/main/java/dev/meteorapi/game/GameAccess.java#L11).

#### dev.meteorapi.game.GameAccess.client · method · line 13

```java
public static MinecraftClient client()
```

Declaring owner: `dev.meteorapi.game.GameAccess`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/game/GameAccess.java:13–13](source/api/src/main/java/dev/meteorapi/game/GameAccess.java#L13).

#### dev.meteorapi.game.GameAccess.player · method · line 14

```java
public static Optional<ClientPlayerEntity> player()
```

Declaring owner: `dev.meteorapi.game.GameAccess`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/game/GameAccess.java:14–14](source/api/src/main/java/dev/meteorapi/game/GameAccess.java#L14).

#### dev.meteorapi.game.GameAccess.world · method · line 15

```java
public static Optional<ClientWorld> world()
```

Declaring owner: `dev.meteorapi.game.GameAccess`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/game/GameAccess.java:15–15](source/api/src/main/java/dev/meteorapi/game/GameAccess.java#L15).

#### dev.meteorapi.game.GameAccess.network · method · line 16

```java
public static Optional<ClientPlayNetworkHandler> network()
```

Declaring owner: `dev.meteorapi.game.GameAccess`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/game/GameAccess.java:16–16](source/api/src/main/java/dev/meteorapi/game/GameAccess.java#L16).

#### dev.meteorapi.game.GameAccess.inventory · method · line 17

```java
public static Optional<PlayerInventory> inventory()
```

Declaring owner: `dev.meteorapi.game.GameAccess`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/game/GameAccess.java:17–17](source/api/src/main/java/dev/meteorapi/game/GameAccess.java#L17).

#### dev.meteorapi.game.GameAccess.inWorld · method · line 18

```java
public static boolean inWorld()
```

Declaring owner: `dev.meteorapi.game.GameAccess`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/game/GameAccess.java:18–18](source/api/src/main/java/dev/meteorapi/game/GameAccess.java#L18).

#### dev.meteorapi.game.GameAccess.requireWorld · method · line 19

```java
public static void requireWorld()
```

Declaring owner: `dev.meteorapi.game.GameAccess`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/game/GameAccess.java:19–19](source/api/src/main/java/dev/meteorapi/game/GameAccess.java#L19).

### InputState — Physical and bound input

Source file: [api/src/main/java/dev/meteorapi/game/InputState.java](source/api/src/main/java/dev/meteorapi/game/InputState.java).

Usage contract: Queries client-window state or sets a Minecraft KeyBinding. Callers that change pressed state must define restoration. This is different from ClientModule keyboard-toggle configuration.

Declaration entries in this file: 4.

#### dev.meteorapi.game.InputState · class · line 6

```java
public final class InputState
```

Declaring owner: `dev.meteorapi.game`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/game/InputState.java:6–11](source/api/src/main/java/dev/meteorapi/game/InputState.java#L6).

#### dev.meteorapi.game.InputState.keyDown · method · line 8

```java
public static boolean keyDown(int key)
```

Declaring owner: `dev.meteorapi.game.InputState`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/game/InputState.java:8–8](source/api/src/main/java/dev/meteorapi/game/InputState.java#L8).

#### dev.meteorapi.game.InputState.mouseDown · method · line 9

```java
public static boolean mouseDown(int button)
```

Declaring owner: `dev.meteorapi.game.InputState`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/game/InputState.java:9–9](source/api/src/main/java/dev/meteorapi/game/InputState.java#L9).

#### dev.meteorapi.game.InputState.pressed · method · line 10

```java
public static void pressed(KeyBinding binding, boolean pressed)
```

Declaring owner: `dev.meteorapi.game.InputState`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/game/InputState.java:10–10](source/api/src/main/java/dev/meteorapi/game/InputState.java#L10).

### ApiInitializer — Internal Fabric bootstrap

Source file: [api/src/main/java/dev/meteorapi/internal/ApiInitializer.java](source/api/src/main/java/dev/meteorapi/internal/ApiInitializer.java).

Usage contract: Initializes render forwarding, config loading, and client-stopping cleanup. Addons should not repeatedly invoke the library initializer.

Declaration entries in this file: 2.

#### dev.meteorapi.internal.ApiInitializer · class · line 6

```java
public final class ApiInitializer implements ClientModInitializer
```

Declaring owner: `dev.meteorapi.internal`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/internal/ApiInitializer.java:6–17](source/api/src/main/java/dev/meteorapi/internal/ApiInitializer.java#L6).

#### dev.meteorapi.internal.ApiInitializer.onInitializeClient · method · line 7

```java
@Override public void onInitializeClient()
```

Declaring owner: `dev.meteorapi.internal.ApiInitializer`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/internal/ApiInitializer.java:7–16](source/api/src/main/java/dev/meteorapi/internal/ApiInitializer.java#L7).

### PacketUtils — Target-version packet catalog

Source file: [api/src/main/java/dev/meteorapi/network/PacketUtils.java](source/api/src/main/java/dev/meteorapi/network/PacketUtils.java).

Usage contract: Enumerates actual 1.21.11 PacketTypes and selected legacy aliases. Direction-specific lookup avoids ambiguity. Unsupported future aliases return null.

Declaration entries in this file: 9.

#### dev.meteorapi.network.PacketUtils · class · line 13

```java
public final class PacketUtils
```

Declaring owner: `dev.meteorapi.network`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/network/PacketUtils.java:13–50](source/api/src/main/java/dev/meteorapi/network/PacketUtils.java#L13).

#### dev.meteorapi.network.PacketUtils.getPackets · method · line 30

```java
public static Set<PacketType<?>> getPackets()
```

Declaring owner: `dev.meteorapi.network.PacketUtils`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/network/PacketUtils.java:30–33](source/api/src/main/java/dev/meteorapi/network/PacketUtils.java#L30).

#### dev.meteorapi.network.PacketUtils.getClientboundPackets · method · line 34

```java
public static Set<PacketType<?>> getClientboundPackets()
```

Declaring owner: `dev.meteorapi.network.PacketUtils`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/network/PacketUtils.java:34–34](source/api/src/main/java/dev/meteorapi/network/PacketUtils.java#L34).

#### dev.meteorapi.network.PacketUtils.getServerboundPackets · method · line 35

```java
public static Set<PacketType<?>> getServerboundPackets()
```

Declaring owner: `dev.meteorapi.network.PacketUtils`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/network/PacketUtils.java:35–35](source/api/src/main/java/dev/meteorapi/network/PacketUtils.java#L35).

#### dev.meteorapi.network.PacketUtils.getLegacyMappings · method · line 36

```java
public static Map<String, String> getLegacyMappings()
```

Declaring owner: `dev.meteorapi.network.PacketUtils`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/network/PacketUtils.java:36–36](source/api/src/main/java/dev/meteorapi/network/PacketUtils.java#L36).

#### dev.meteorapi.network.PacketUtils.getClientboundPacket · method · line 37

```java
public static PacketType<?> getClientboundPacket(Identifier id)
```

Declaring owner: `dev.meteorapi.network.PacketUtils`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/network/PacketUtils.java:37–37](source/api/src/main/java/dev/meteorapi/network/PacketUtils.java#L37).

#### dev.meteorapi.network.PacketUtils.getServerboundPacket · method · line 38

```java
public static PacketType<?> getServerboundPacket(Identifier id)
```

Declaring owner: `dev.meteorapi.network.PacketUtils`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/network/PacketUtils.java:38–38](source/api/src/main/java/dev/meteorapi/network/PacketUtils.java#L38).

#### dev.meteorapi.network.PacketUtils.getPacket · method · line 39

```java
public static PacketType<?> getPacket(Identifier id)
```

Declaring owner: `dev.meteorapi.network.PacketUtils`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/network/PacketUtils.java:39–41](source/api/src/main/java/dev/meteorapi/network/PacketUtils.java#L39).

#### dev.meteorapi.network.PacketUtils.getPacket · method · line 42

```java
public static PacketType<?> getPacket(String name)
```

Declaring owner: `dev.meteorapi.network.PacketUtils`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/network/PacketUtils.java:42–49](source/api/src/main/java/dev/meteorapi/network/PacketUtils.java#L42).

### Packets — Decoded client traffic observers

Source file: [api/src/main/java/dev/meteorapi/network/Packets.java](source/api/src/main/java/dev/meteorapi/network/Packets.java).

Usage contract: Raw callbacks run on origin threads. onClient uses immutable metadata, a 2,048-item queue, and a 256-item tick drain. observe()/drainClient() are internal integration boundaries. No traffic cancellation or rewriting is implied.

Declaration entries in this file: 11.

#### dev.meteorapi.network.Packets · class · line 16

```java
public final class Packets
```

Declaring owner: `dev.meteorapi.network`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/network/Packets.java:16–63](source/api/src/main/java/dev/meteorapi/network/Packets.java#L16).

#### dev.meteorapi.network.Packets.Phase · enum · line 17

```java
public enum Phase
```

Declaring owner: `dev.meteorapi.network.Packets`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/network/Packets.java:17–17](source/api/src/main/java/dev/meteorapi/network/Packets.java#L17).

#### dev.meteorapi.network.Packets.Event · record · line 19

```java
public record Event(Phase phase, Packet<?> packet, ClientConnection connection, Throwable error, Snapshot snapshot)
```

Declaring owner: `dev.meteorapi.network.Packets`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/network/Packets.java:19–19](source/api/src/main/java/dev/meteorapi/network/Packets.java#L19).

#### dev.meteorapi.network.Packets.Snapshot · record · line 21

```java
public record Snapshot(long sequence, long nanoTime, Phase phase, String packetClass, String thread)
```

Declaring owner: `dev.meteorapi.network.Packets`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/network/Packets.java:21–21](source/api/src/main/java/dev/meteorapi/network/Packets.java#L21).

#### dev.meteorapi.network.Packets.Statistics · record · line 22

```java
public record Statistics(long sendAttempts, long enqueued, long received, long errors, long droppedSnapshots, int observers)
```

Declaring owner: `dev.meteorapi.network.Packets`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/network/Packets.java:22–22](source/api/src/main/java/dev/meteorapi/network/Packets.java#L22).

#### dev.meteorapi.network.Packets.listen · method · line 34

```java
public static RegistrationResult<Registration> listen(NamespacedId id, Predicate<Event> filter, Consumer<Event> listener)
```

Declaring owner: `dev.meteorapi.network.Packets`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/network/Packets.java:34–36](source/api/src/main/java/dev/meteorapi/network/Packets.java#L34).

#### dev.meteorapi.network.Packets.onClient · method · line 37

```java
public static RegistrationResult<Registration> onClient(NamespacedId id, Consumer<Snapshot> listener)
```

Declaring owner: `dev.meteorapi.network.Packets`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/network/Packets.java:37–39](source/api/src/main/java/dev/meteorapi/network/Packets.java#L37).

#### dev.meteorapi.network.Packets.typed · method · line 40

```java
public static <P extends Packet<?>> RegistrationResult<Registration> typed(NamespacedId id, Phase phase, Class<P> type, Consumer<P> listener)
```

Declaring owner: `dev.meteorapi.network.Packets`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/network/Packets.java:40–42](source/api/src/main/java/dev/meteorapi/network/Packets.java#L40).

#### dev.meteorapi.network.Packets.statistics · method · line 43

```java
public static Statistics statistics()
```

Declaring owner: `dev.meteorapi.network.Packets`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/network/Packets.java:43–45](source/api/src/main/java/dev/meteorapi/network/Packets.java#L43).

#### dev.meteorapi.network.Packets.observe · method · line 47

```java
public static void observe(Phase phase, Packet<?> packet, ClientConnection connection, Throwable error)
```

Declaring owner: `dev.meteorapi.network.Packets`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/network/Packets.java:47–61](source/api/src/main/java/dev/meteorapi/network/Packets.java#L47).

#### dev.meteorapi.network.Packets.drainClient · method · line 62

```java
public static void drainClient()
```

Declaring owner: `dev.meteorapi.network.Packets`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/network/Packets.java:62–62](source/api/src/main/java/dev/meteorapi/network/Packets.java#L62).

### Payloads — Typed custom channels

Source file: [api/src/main/java/dev/meteorapi/network/Payloads.java](source/api/src/main/java/dev/meteorapi/network/Payloads.java).

Usage contract: Registration and sending require the client thread. Peers must agree on phase, direction, ID, and schema. Token closure detaches a receiver handler; codec registration remains process-lived. Codec identity matters.

Declaration entries in this file: 8.

#### dev.meteorapi.network.Payloads · class · line 21

```java
public final class Payloads
```

Declaring owner: `dev.meteorapi.network`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/network/Payloads.java:21–116](source/api/src/main/java/dev/meteorapi/network/Payloads.java#L21).

#### dev.meteorapi.network.Payloads.SendResult · enum · line 22

```java
public enum SendResult
```

Declaring owner: `dev.meteorapi.network.Payloads`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/network/Payloads.java:22–22](source/api/src/main/java/dev/meteorapi/network/Payloads.java#L22).

#### dev.meteorapi.network.Payloads.playReceiver · method · line 27

```java
public static <T extends CustomPayload> RegistrationResult<Registration> playReceiver( CustomPayload.Id<T> type, PacketCodec<? super RegistryByteBuf, T> codec, Consumer<T> handler)
```

Declaring owner: `dev.meteorapi.network.Payloads`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/network/Payloads.java:27–37](source/api/src/main/java/dev/meteorapi/network/Payloads.java#L27).

#### dev.meteorapi.network.Payloads.configurationReceiver · method · line 39

```java
public static <T extends CustomPayload> RegistrationResult<Registration> configurationReceiver( CustomPayload.Id<T> type, PacketCodec<? super PacketByteBuf, T> codec, Consumer<T> handler)
```

Declaring owner: `dev.meteorapi.network.Payloads`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/network/Payloads.java:39–49](source/api/src/main/java/dev/meteorapi/network/Payloads.java#L39).

#### dev.meteorapi.network.Payloads.playSender · method · line 51

```java
public static <T extends CustomPayload> RegistrationResult<CustomPayload.Id<T>> playSender( CustomPayload.Id<T> type, PacketCodec<? super RegistryByteBuf, T> codec)
```

Declaring owner: `dev.meteorapi.network.Payloads`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/network/Payloads.java:51–54](source/api/src/main/java/dev/meteorapi/network/Payloads.java#L51).

#### dev.meteorapi.network.Payloads.configurationSender · method · line 55

```java
public static <T extends CustomPayload> RegistrationResult<CustomPayload.Id<T>> configurationSender( CustomPayload.Id<T> type, PacketCodec<? super PacketByteBuf, T> codec)
```

Declaring owner: `dev.meteorapi.network.Payloads`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/network/Payloads.java:55–58](source/api/src/main/java/dev/meteorapi/network/Payloads.java#L55).

#### dev.meteorapi.network.Payloads.sendPlay · method · line 103

```java
public static SendResult sendPlay(CustomPayload payload)
```

Declaring owner: `dev.meteorapi.network.Payloads`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/network/Payloads.java:103–108](source/api/src/main/java/dev/meteorapi/network/Payloads.java#L103).

#### dev.meteorapi.network.Payloads.sendConfiguration · method · line 109

```java
public static SendResult sendConfiguration(CustomPayload payload)
```

Declaring owner: `dev.meteorapi.network.Payloads`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/network/Payloads.java:109–115](source/api/src/main/java/dev/meteorapi/network/Payloads.java#L109).

### WorldRendering — Native Fabric render contexts

Source file: [api/src/main/java/dev/meteorapi/render/WorldRendering.java](source/api/src/main/java/dev/meteorapi/render/WorldRendering.java).

Usage contract: Ordinary stages wrap matrix push/pop. Extraction and terrain channels use distinct contexts. initialize() is bootstrap work. User code remains responsible for native buffer and render-state contracts.

Declaration entries in this file: 7.

#### dev.meteorapi.render.WorldRendering · class · line 12

```java
public final class WorldRendering
```

Declaring owner: `dev.meteorapi.render`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/render/WorldRendering.java:12–41](source/api/src/main/java/dev/meteorapi/render/WorldRendering.java#L12).

#### dev.meteorapi.render.WorldRendering.Stage · enum · line 13

```java
public enum Stage
```

Declaring owner: `dev.meteorapi.render.WorldRendering`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/render/WorldRendering.java:13–13](source/api/src/main/java/dev/meteorapi/render/WorldRendering.java#L13).

#### dev.meteorapi.render.WorldRendering.Event · record · line 14

```java
public record Event(Stage stage, WorldRenderContext context)
```

Declaring owner: `dev.meteorapi.render.WorldRendering`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/render/WorldRendering.java:14–14](source/api/src/main/java/dev/meteorapi/render/WorldRendering.java#L14).

#### dev.meteorapi.render.WorldRendering.extraction · method · line 22

```java
public static EventChannel<net.fabricmc.fabric.api.client.rendering.v1.world.WorldExtractionContext> extraction()
```

Declaring owner: `dev.meteorapi.render.WorldRendering`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/render/WorldRendering.java:22–22](source/api/src/main/java/dev/meteorapi/render/WorldRendering.java#L22).

#### dev.meteorapi.render.WorldRendering.terrain · method · line 23

```java
public static EventChannel<net.fabricmc.fabric.api.client.rendering.v1.world.WorldTerrainRenderContext> terrain()
```

Declaring owner: `dev.meteorapi.render.WorldRendering`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/render/WorldRendering.java:23–23](source/api/src/main/java/dev/meteorapi/render/WorldRendering.java#L23).

#### dev.meteorapi.render.WorldRendering.listen · method · line 24

```java
public static RegistrationResult<Registration> listen(NamespacedId id, Stage stage, Consumer<WorldRenderContext> draw)
```

Declaring owner: `dev.meteorapi.render.WorldRendering`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/render/WorldRendering.java:24–29](source/api/src/main/java/dev/meteorapi/render/WorldRendering.java#L24).

#### dev.meteorapi.render.WorldRendering.initialize · method · line 30

```java
public static void initialize()
```

Declaring owner: `dev.meteorapi.render.WorldRendering`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/render/WorldRendering.java:30–40](source/api/src/main/java/dev/meteorapi/render/WorldRendering.java#L30).

### Canvas — DrawContext helpers

Source file: [api/src/main/java/dev/meteorapi/ui/Canvas.java](source/api/src/main/java/dev/meteorapi/ui/Canvas.java).

Usage contract: Supports text, sizes-based rectangles, items, scissors, and GUI transforms. context() is an implicit record accessor returning the original context. Wrappers balance their own immediate state only.

Declaration entries in this file: 7.

#### dev.meteorapi.ui.Canvas · record · line 8

```java
public record Canvas(DrawContext context)
```

Declaring owner: `dev.meteorapi.ui`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/ui/Canvas.java:8–25](source/api/src/main/java/dev/meteorapi/ui/Canvas.java#L8).

#### dev.meteorapi.ui.Canvas.rectangle · method · line 9

```java
public void rectangle(int x, int y, int width, int height, int argb)
```

Declaring owner: `dev.meteorapi.ui.Canvas`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/ui/Canvas.java:9–9](source/api/src/main/java/dev/meteorapi/ui/Canvas.java#L9).

#### dev.meteorapi.ui.Canvas.text · method · line 10

```java
public void text(String text, int x, int y, int argb)
```

Declaring owner: `dev.meteorapi.ui.Canvas`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/ui/Canvas.java:10–10](source/api/src/main/java/dev/meteorapi/ui/Canvas.java#L10).

#### dev.meteorapi.ui.Canvas.text · method · line 11

```java
public void text(Text text, int x, int y, int argb)
```

Declaring owner: `dev.meteorapi.ui.Canvas`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/ui/Canvas.java:11–11](source/api/src/main/java/dev/meteorapi/ui/Canvas.java#L11).

#### dev.meteorapi.ui.Canvas.item · method · line 12

```java
public void item(ItemStack item, int x, int y, boolean overlay)
```

Declaring owner: `dev.meteorapi.ui.Canvas`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/ui/Canvas.java:12–15](source/api/src/main/java/dev/meteorapi/ui/Canvas.java#L12).

#### dev.meteorapi.ui.Canvas.clip · method · line 16

```java
public void clip(int x, int y, int width, int height, Runnable draw)
```

Declaring owner: `dev.meteorapi.ui.Canvas`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/ui/Canvas.java:16–19](source/api/src/main/java/dev/meteorapi/ui/Canvas.java#L16).

#### dev.meteorapi.ui.Canvas.transformed · method · line 20

```java
public void transformed(float x, float y, float scale, Runnable draw)
```

Declaring owner: `dev.meteorapi.ui.Canvas`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/ui/Canvas.java:20–24](source/api/src/main/java/dev/meteorapi/ui/Canvas.java#L20).

### FileDialogs — Asynchronous native selection

Source file: [api/src/main/java/dev/meteorapi/ui/FileDialogs.java](source/api/src/main/java/dev/meteorapi/ui/FileDialogs.java).

Usage contract: TinyFD worker backend. Future cancellation is Optional.empty(); errors complete exceptionally. Consumer<File> callbacks return successful selections to the client thread. Save selection does not write a file.

Declaration entries in this file: 5.

#### dev.meteorapi.ui.FileDialogs · class · line 14

```java
public final class FileDialogs
```

Declaring owner: `dev.meteorapi.ui`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/ui/FileDialogs.java:14–49](source/api/src/main/java/dev/meteorapi/ui/FileDialogs.java#L14).

#### dev.meteorapi.ui.FileDialogs.openFile · method · line 19

```java
public static CompletableFuture<Optional<Path>> openFile(String extensions)
```

Declaring owner: `dev.meteorapi.ui.FileDialogs`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/ui/FileDialogs.java:19–19](source/api/src/main/java/dev/meteorapi/ui/FileDialogs.java#L19).

#### dev.meteorapi.ui.FileDialogs.saveFile · method · line 20

```java
public static CompletableFuture<Optional<Path>> saveFile(String extensions)
```

Declaring owner: `dev.meteorapi.ui.FileDialogs`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/ui/FileDialogs.java:20–20](source/api/src/main/java/dev/meteorapi/ui/FileDialogs.java#L20).

#### dev.meteorapi.ui.FileDialogs.openFile · method · line 21

```java
public static void openFile(String extensions, java.util.function.Consumer<? super java.io.File> onSelected)
```

Declaring owner: `dev.meteorapi.ui.FileDialogs`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/ui/FileDialogs.java:21–23](source/api/src/main/java/dev/meteorapi/ui/FileDialogs.java#L21).

#### dev.meteorapi.ui.FileDialogs.saveFile · method · line 24

```java
public static void saveFile(String extensions, java.util.function.Consumer<? super java.io.File> onSelected)
```

Declaring owner: `dev.meteorapi.ui.FileDialogs`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/ui/FileDialogs.java:24–26](source/api/src/main/java/dev/meteorapi/ui/FileDialogs.java#L24).

### PanelScreen — Native screen implementation

Source file: [api/src/main/java/dev/meteorapi/ui/PanelScreen.java](source/api/src/main/java/dev/meteorapi/ui/PanelScreen.java).

Usage contract: Protected framework overrides implement layout/input/rendering. Supports scrolling and return to parent and does not pause. Visual scale/window-size validation remains pending.

Declaration entries in this file: 8.

#### dev.meteorapi.ui.PanelScreen · class · line 14

```java
public class PanelScreen extends Screen
```

Declaring owner: `dev.meteorapi.ui`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/ui/PanelScreen.java:14–102](source/api/src/main/java/dev/meteorapi/ui/PanelScreen.java#L14).

#### dev.meteorapi.ui.PanelScreen.PanelScreen · constructor · line 21

```java
protected PanelScreen(String title, Screen parent, List<Panels.Row> rows, Runnable onClose)
```

Declaring owner: `dev.meteorapi.ui.PanelScreen`.

Exposure: protected subclass/framework member.

Source span: [api/src/main/java/dev/meteorapi/ui/PanelScreen.java:21–23](source/api/src/main/java/dev/meteorapi/ui/PanelScreen.java#L21).

#### dev.meteorapi.ui.PanelScreen.init · method · line 27

```java
@Override protected void init()
```

Declaring owner: `dev.meteorapi.ui.PanelScreen`.

Exposure: protected subclass/framework member.

Source span: [api/src/main/java/dev/meteorapi/ui/PanelScreen.java:27–67](source/api/src/main/java/dev/meteorapi/ui/PanelScreen.java#L27).

#### dev.meteorapi.ui.PanelScreen.mouseScrolled · method · line 76

```java
@Override public boolean mouseScrolled(double x, double y, double horizontal, double vertical)
```

Declaring owner: `dev.meteorapi.ui.PanelScreen`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/ui/PanelScreen.java:76–79](source/api/src/main/java/dev/meteorapi/ui/PanelScreen.java#L76).

#### dev.meteorapi.ui.PanelScreen.keyPressed · method · line 80

```java
@Override public boolean keyPressed(KeyInput key)
```

Declaring owner: `dev.meteorapi.ui.PanelScreen`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/ui/PanelScreen.java:80–83](source/api/src/main/java/dev/meteorapi/ui/PanelScreen.java#L80).

#### dev.meteorapi.ui.PanelScreen.render · method · line 84

```java
@Override public void render(DrawContext context, int mouseX, int mouseY, float delta)
```

Declaring owner: `dev.meteorapi.ui.PanelScreen`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/ui/PanelScreen.java:84–96](source/api/src/main/java/dev/meteorapi/ui/PanelScreen.java#L84).

#### dev.meteorapi.ui.PanelScreen.shouldPause · method · line 97

```java
@Override public boolean shouldPause()
```

Declaring owner: `dev.meteorapi.ui.PanelScreen`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/ui/PanelScreen.java:97–97](source/api/src/main/java/dev/meteorapi/ui/PanelScreen.java#L97).

#### dev.meteorapi.ui.PanelScreen.close · method · line 98

```java
@Override public void close()
```

Declaring owner: `dev.meteorapi.ui.PanelScreen`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/ui/PanelScreen.java:98–101](source/api/src/main/java/dev/meteorapi/ui/PanelScreen.java#L98).

### Panels — Native screen builder

Source file: [api/src/main/java/dev/meteorapi/ui/Panels.java](source/api/src/main/java/dev/meteorapi/ui/Panels.java).

Usage contract: Creates labels, actions, fields, toggles, and file rows. build() snapshots rows and returns a native Screen. It is not a continuously reactive UI engine.

Declaration entries in this file: 16.

#### dev.meteorapi.ui.Panels · class · line 12

```java
public final class Panels
```

Declaring owner: `dev.meteorapi.ui`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/ui/Panels.java:12–37](source/api/src/main/java/dev/meteorapi/ui/Panels.java#L12).

#### dev.meteorapi.ui.Panels.create · method · line 14

```java
public static Builder create(String title)
```

Declaring owner: `dev.meteorapi.ui.Panels`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/ui/Panels.java:14–14](source/api/src/main/java/dev/meteorapi/ui/Panels.java#L14).

#### dev.meteorapi.ui.Panels.Row · interface · line 15

```java
public sealed interface Row permits Label, Action, Field, Toggle, FileField
```

Declaring owner: `dev.meteorapi.ui.Panels`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/ui/Panels.java:15–15](source/api/src/main/java/dev/meteorapi/ui/Panels.java#L15).

#### dev.meteorapi.ui.Panels.Label · record · line 16

```java
public record Label(String text) implements Row
```

Declaring owner: `dev.meteorapi.ui.Panels`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/ui/Panels.java:16–16](source/api/src/main/java/dev/meteorapi/ui/Panels.java#L16).

#### dev.meteorapi.ui.Panels.Action · record · line 17

```java
public record Action(String text, Runnable action) implements Row
```

Declaring owner: `dev.meteorapi.ui.Panels`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/ui/Panels.java:17–17](source/api/src/main/java/dev/meteorapi/ui/Panels.java#L17).

#### dev.meteorapi.ui.Panels.Field · record · line 18

```java
public record Field(String text, Setting<?> setting) implements Row
```

Declaring owner: `dev.meteorapi.ui.Panels`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/ui/Panels.java:18–18](source/api/src/main/java/dev/meteorapi/ui/Panels.java#L18).

#### dev.meteorapi.ui.Panels.Toggle · record · line 19

```java
public record Toggle(String text, Setting<Boolean> setting) implements Row
```

Declaring owner: `dev.meteorapi.ui.Panels`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/ui/Panels.java:19–19](source/api/src/main/java/dev/meteorapi/ui/Panels.java#L19).

#### dev.meteorapi.ui.Panels.FileField · record · line 20

```java
public record FileField(String text, Setting<Path> setting, String extensions) implements Row
```

Declaring owner: `dev.meteorapi.ui.Panels`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/ui/Panels.java:20–20](source/api/src/main/java/dev/meteorapi/ui/Panels.java#L20).

#### dev.meteorapi.ui.Panels.Builder · class · line 21

```java
public static final class Builder
```

Declaring owner: `dev.meteorapi.ui.Panels`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/ui/Panels.java:21–36](source/api/src/main/java/dev/meteorapi/ui/Panels.java#L21).

#### dev.meteorapi.ui.Panels.Builder.label · method · line 26

```java
public Builder label(String text)
```

Declaring owner: `dev.meteorapi.ui.Panels.Builder`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/ui/Panels.java:26–26](source/api/src/main/java/dev/meteorapi/ui/Panels.java#L26).

#### dev.meteorapi.ui.Panels.Builder.button · method · line 27

```java
public Builder button(String text, Runnable action)
```

Declaring owner: `dev.meteorapi.ui.Panels.Builder`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/ui/Panels.java:27–27](source/api/src/main/java/dev/meteorapi/ui/Panels.java#L27).

#### dev.meteorapi.ui.Panels.Builder.field · method · line 28

```java
public Builder field(String text, Setting<?> setting)
```

Declaring owner: `dev.meteorapi.ui.Panels.Builder`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/ui/Panels.java:28–28](source/api/src/main/java/dev/meteorapi/ui/Panels.java#L28).

#### dev.meteorapi.ui.Panels.Builder.toggle · method · line 29

```java
public Builder toggle(String text, Setting<Boolean> setting)
```

Declaring owner: `dev.meteorapi.ui.Panels.Builder`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/ui/Panels.java:29–29](source/api/src/main/java/dev/meteorapi/ui/Panels.java#L29).

#### dev.meteorapi.ui.Panels.Builder.file · method · line 30

```java
public Builder file(String text, Setting<Path> setting, String extensions)
```

Declaring owner: `dev.meteorapi.ui.Panels.Builder`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/ui/Panels.java:30–30](source/api/src/main/java/dev/meteorapi/ui/Panels.java#L30).

#### dev.meteorapi.ui.Panels.Builder.onClose · method · line 31

```java
public Builder onClose(Runnable action)
```

Declaring owner: `dev.meteorapi.ui.Panels.Builder`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/ui/Panels.java:31–31](source/api/src/main/java/dev/meteorapi/ui/Panels.java#L31).

#### dev.meteorapi.ui.Panels.Builder.build · method · line 32

```java
public Screen build(Screen parent)
```

Declaring owner: `dev.meteorapi.ui.Panels.Builder`.

Exposure: public declaration.

Source span: [api/src/main/java/dev/meteorapi/ui/Panels.java:32–35](source/api/src/main/java/dev/meteorapi/ui/Panels.java#L32).

### ExampleAddon — Optional example initializer

Source file: [example-addon/src/main/java/dev/meteorapi/example/ExampleAddon.java](source/example-addon/src/main/java/dev/meteorapi/example/ExampleAddon.java).

Usage contract: F9 opens the sample screen. Registers the independent example client and demonstrates settings, scheduling, and scoped packet diagnostics.

Declaration entries in this file: 2.

#### dev.meteorapi.example.ExampleAddon · class · line 19

```java
public final class ExampleAddon implements ClientModInitializer
```

Declaring owner: `dev.meteorapi.example`.

Exposure: public declaration.

Source span: [example-addon/src/main/java/dev/meteorapi/example/ExampleAddon.java:19–60](source/example-addon/src/main/java/dev/meteorapi/example/ExampleAddon.java#L19).

#### dev.meteorapi.example.ExampleAddon.onInitializeClient · method · line 29

```java
@Override public void onInitializeClient()
```

Declaring owner: `dev.meteorapi.example.ExampleAddon`.

Exposure: public declaration.

Source span: [example-addon/src/main/java/dev/meteorapi/example/ExampleAddon.java:29–51](source/example-addon/src/main/java/dev/meteorapi/example/ExampleAddon.java#L29).

### ExampleClient — Optional client example

Source file: [example-addon/src/main/java/dev/meteorapi/example/ExampleClient.java](source/example-addon/src/main/java/dev/meteorapi/example/ExampleClient.java).

Usage contract: Registers example-client with its render category and Status HUD. The module uses F10 and owns its HUD token in runtime scope.

Declaration entries in this file: 2.

#### dev.meteorapi.example.ExampleClient · class · line 12

```java
public final class ExampleClient
```

Declaring owner: `dev.meteorapi.example`.

Exposure: public declaration.

Source span: [example-addon/src/main/java/dev/meteorapi/example/ExampleClient.java:12–35](source/example-addon/src/main/java/dev/meteorapi/example/ExampleClient.java#L12).

#### dev.meteorapi.example.ExampleClient.register · method · line 14

```java
public static void register()
```

Declaring owner: `dev.meteorapi.example.ExampleClient`.

Exposure: public declaration.

Source span: [example-addon/src/main/java/dev/meteorapi/example/ExampleClient.java:14–21](source/example-addon/src/main/java/dev/meteorapi/example/ExampleClient.java#L14).

### ExamplePayload — Illustrative payload record

Source file: [example-addon/src/main/java/dev/meteorapi/example/ExamplePayload.java](source/example-addon/src/main/java/dev/meteorapi/example/ExamplePayload.java).

Usage contract: Uses a bounded 256-character string codec. Both peers need compatible registration; the record definition alone does not register or send a channel.

Declaration entries in this file: 4.

#### dev.meteorapi.example.ExamplePayload · record · line 8

```java
public record ExamplePayload(String text) implements CustomPayload
```

Declaring owner: `dev.meteorapi.example`.

Exposure: public declaration.

Source span: [example-addon/src/main/java/dev/meteorapi/example/ExamplePayload.java:8–14](source/example-addon/src/main/java/dev/meteorapi/example/ExamplePayload.java#L8).

#### dev.meteorapi.example.ExamplePayload.ID · field · line 9

```java
public static final Id<ExamplePayload> ID = new Id<>(Identifier.of("meteor-api-example", "message"))
```

Declaring owner: `dev.meteorapi.example.ExamplePayload`.

Exposure: public declaration.

Source span: [example-addon/src/main/java/dev/meteorapi/example/ExamplePayload.java:9–9](source/example-addon/src/main/java/dev/meteorapi/example/ExamplePayload.java#L9).

#### dev.meteorapi.example.ExamplePayload.CODEC · field · line 10

```java
public static final PacketCodec<RegistryByteBuf, ExamplePayload> CODEC = PacketCodec.of( (payload, buffer) -> buffer.writeString(payload.text(), 256), buffer -> new ExamplePayload(buffer.readString(256)))
```

Declaring owner: `dev.meteorapi.example.ExamplePayload`.

Exposure: public declaration.

Source span: [example-addon/src/main/java/dev/meteorapi/example/ExamplePayload.java:10–12](source/example-addon/src/main/java/dev/meteorapi/example/ExamplePayload.java#L10).

#### dev.meteorapi.example.ExamplePayload.getId · method · line 13

```java
@Override public Id<? extends CustomPayload> getId()
```

Declaring owner: `dev.meteorapi.example.ExamplePayload`.

Exposure: public declaration.

Source span: [example-addon/src/main/java/dev/meteorapi/example/ExamplePayload.java:13–13](source/example-addon/src/main/java/dev/meteorapi/example/ExamplePayload.java#L13).

### CommandLine — Local command parser

Source file: [foundation/src/main/java/dev/meteorapi/client/CommandLine.java](source/foundation/src/main/java/dev/meteorapi/client/CommandLine.java).

Usage contract: Parses a command string into argument tokens according to its quote/escape rules. It does not register a chat prefix or send network traffic.

Declaration entries in this file: 2.

#### dev.meteorapi.client.CommandLine · class · line 6

```java
public final class CommandLine
```

Declaring owner: `dev.meteorapi.client`.

Exposure: public declaration.

Source span: [foundation/src/main/java/dev/meteorapi/client/CommandLine.java:6–25](source/foundation/src/main/java/dev/meteorapi/client/CommandLine.java#L6).

#### dev.meteorapi.client.CommandLine.parse · method · line 8

```java
public static List<String> parse(String input)
```

Declaring owner: `dev.meteorapi.client.CommandLine`.

Exposure: public declaration.

Source span: [foundation/src/main/java/dev/meteorapi/client/CommandLine.java:8–24](source/foundation/src/main/java/dev/meteorapi/client/CommandLine.java#L8).

### FeatureLifecycle — Activation state machine

Source file: [foundation/src/main/java/dev/meteorapi/client/FeatureLifecycle.java](source/foundation/src/main/java/dev/meteorapi/client/FeatureLifecycle.java).

Usage contract: Confined to its constructing thread. Guards reentrant transitions, cleans failed activation, and attempts stop plus resource cleanup. close() disables; it does not permanently prohibit a later enable on this base.

Declaration entries in this file: 12.

#### dev.meteorapi.client.FeatureLifecycle · class · line 8

```java
public abstract class FeatureLifecycle implements AutoCloseable
```

Declaring owner: `dev.meteorapi.client`.

Exposure: public declaration.

Source span: [foundation/src/main/java/dev/meteorapi/client/FeatureLifecycle.java:8–50](source/foundation/src/main/java/dev/meteorapi/client/FeatureLifecycle.java#L8).

#### dev.meteorapi.client.FeatureLifecycle.State · enum · line 9

```java
public enum State
```

Declaring owner: `dev.meteorapi.client.FeatureLifecycle`.

Exposure: public declaration.

Source span: [foundation/src/main/java/dev/meteorapi/client/FeatureLifecycle.java:9–9](source/foundation/src/main/java/dev/meteorapi/client/FeatureLifecycle.java#L9).

#### dev.meteorapi.client.FeatureLifecycle.FeatureLifecycle · constructor · line 15

```java
protected FeatureLifecycle(NamespacedId id, BiConsumer<NamespacedId, RuntimeException> errors)
```

Declaring owner: `dev.meteorapi.client.FeatureLifecycle`.

Exposure: protected subclass/framework member.

Source span: [foundation/src/main/java/dev/meteorapi/client/FeatureLifecycle.java:15–17](source/foundation/src/main/java/dev/meteorapi/client/FeatureLifecycle.java#L15).

#### dev.meteorapi.client.FeatureLifecycle.id · method · line 18

```java
public final NamespacedId id()
```

Declaring owner: `dev.meteorapi.client.FeatureLifecycle`.

Exposure: public declaration.

Source span: [foundation/src/main/java/dev/meteorapi/client/FeatureLifecycle.java:18–18](source/foundation/src/main/java/dev/meteorapi/client/FeatureLifecycle.java#L18).

#### dev.meteorapi.client.FeatureLifecycle.state · method · line 19

```java
public final State state()
```

Declaring owner: `dev.meteorapi.client.FeatureLifecycle`.

Exposure: public declaration.

Source span: [foundation/src/main/java/dev/meteorapi/client/FeatureLifecycle.java:19–19](source/foundation/src/main/java/dev/meteorapi/client/FeatureLifecycle.java#L19).

#### dev.meteorapi.client.FeatureLifecycle.active · method · line 20

```java
public final boolean active()
```

Declaring owner: `dev.meteorapi.client.FeatureLifecycle`.

Exposure: public declaration.

Source span: [foundation/src/main/java/dev/meteorapi/client/FeatureLifecycle.java:20–20](source/foundation/src/main/java/dev/meteorapi/client/FeatureLifecycle.java#L20).

#### dev.meteorapi.client.FeatureLifecycle.enable · method · line 21

```java
public final boolean enable()
```

Declaring owner: `dev.meteorapi.client.FeatureLifecycle`.

Exposure: public declaration.

Source span: [foundation/src/main/java/dev/meteorapi/client/FeatureLifecycle.java:21–32](source/foundation/src/main/java/dev/meteorapi/client/FeatureLifecycle.java#L21).

#### dev.meteorapi.client.FeatureLifecycle.disable · method · line 33

```java
public final boolean disable()
```

Declaring owner: `dev.meteorapi.client.FeatureLifecycle`.

Exposure: public declaration.

Source span: [foundation/src/main/java/dev/meteorapi/client/FeatureLifecycle.java:33–43](source/foundation/src/main/java/dev/meteorapi/client/FeatureLifecycle.java#L33).

#### dev.meteorapi.client.FeatureLifecycle.toggle · method · line 44

```java
public final boolean toggle()
```

Declaring owner: `dev.meteorapi.client.FeatureLifecycle`.

Exposure: public declaration.

Source span: [foundation/src/main/java/dev/meteorapi/client/FeatureLifecycle.java:44–44](source/foundation/src/main/java/dev/meteorapi/client/FeatureLifecycle.java#L44).

#### dev.meteorapi.client.FeatureLifecycle.close · method · line 45

```java
@Override public final void close()
```

Declaring owner: `dev.meteorapi.client.FeatureLifecycle`.

Exposure: public declaration.

Source span: [foundation/src/main/java/dev/meteorapi/client/FeatureLifecycle.java:45–45](source/foundation/src/main/java/dev/meteorapi/client/FeatureLifecycle.java#L45).

#### dev.meteorapi.client.FeatureLifecycle.onEnable · method · line 46

```java
protected abstract void onEnable(ResourceScope scope)
```

Declaring owner: `dev.meteorapi.client.FeatureLifecycle`.

Exposure: protected subclass/framework member.

Source span: [foundation/src/main/java/dev/meteorapi/client/FeatureLifecycle.java:46–46](source/foundation/src/main/java/dev/meteorapi/client/FeatureLifecycle.java#L46).

#### dev.meteorapi.client.FeatureLifecycle.onDisable · method · line 47

```java
protected void onDisable()
```

Declaring owner: `dev.meteorapi.client.FeatureLifecycle`.

Exposure: protected subclass/framework member.

Source span: [foundation/src/main/java/dev/meteorapi/client/FeatureLifecycle.java:47–47](source/foundation/src/main/java/dev/meteorapi/client/FeatureLifecycle.java#L47).

### BoundedMailbox — Bounded handoff queue

Source file: [foundation/src/main/java/dev/meteorapi/event/BoundedMailbox.java](source/foundation/src/main/java/dev/meteorapi/event/BoundedMailbox.java).

Usage contract: offer() reports acceptance and increments dropped() when full. drain() runs the receiver on the draining thread. clear() empties pending items without resetting historical dropped count.

Declaration entries in this file: 7.

#### dev.meteorapi.event.BoundedMailbox · class · line 9

```java
public final class BoundedMailbox<E>
```

Declaring owner: `dev.meteorapi.event`.

Exposure: public declaration.

Source span: [foundation/src/main/java/dev/meteorapi/event/BoundedMailbox.java:9–36](source/foundation/src/main/java/dev/meteorapi/event/BoundedMailbox.java#L9).

#### dev.meteorapi.event.BoundedMailbox.BoundedMailbox · constructor · line 13

```java
public BoundedMailbox(int capacity)
```

Declaring owner: `dev.meteorapi.event.BoundedMailbox`.

Exposure: public declaration.

Source span: [foundation/src/main/java/dev/meteorapi/event/BoundedMailbox.java:13–16](source/foundation/src/main/java/dev/meteorapi/event/BoundedMailbox.java#L13).

#### dev.meteorapi.event.BoundedMailbox.offer · method · line 17

```java
public synchronized boolean offer(E event)
```

Declaring owner: `dev.meteorapi.event.BoundedMailbox`.

Exposure: public declaration.

Source span: [foundation/src/main/java/dev/meteorapi/event/BoundedMailbox.java:17–21](source/foundation/src/main/java/dev/meteorapi/event/BoundedMailbox.java#L17).

#### dev.meteorapi.event.BoundedMailbox.drain · method · line 22

```java
public int drain(int limit, Consumer<? super E> receiver)
```

Declaring owner: `dev.meteorapi.event.BoundedMailbox`.

Exposure: public declaration.

Source span: [foundation/src/main/java/dev/meteorapi/event/BoundedMailbox.java:22–32](source/foundation/src/main/java/dev/meteorapi/event/BoundedMailbox.java#L22).

#### dev.meteorapi.event.BoundedMailbox.pending · method · line 33

```java
public synchronized int pending()
```

Declaring owner: `dev.meteorapi.event.BoundedMailbox`.

Exposure: public declaration.

Source span: [foundation/src/main/java/dev/meteorapi/event/BoundedMailbox.java:33–33](source/foundation/src/main/java/dev/meteorapi/event/BoundedMailbox.java#L33).

#### dev.meteorapi.event.BoundedMailbox.dropped · method · line 34

```java
public synchronized long dropped()
```

Declaring owner: `dev.meteorapi.event.BoundedMailbox`.

Exposure: public declaration.

Source span: [foundation/src/main/java/dev/meteorapi/event/BoundedMailbox.java:34–34](source/foundation/src/main/java/dev/meteorapi/event/BoundedMailbox.java#L34).

#### dev.meteorapi.event.BoundedMailbox.clear · method · line 35

```java
public synchronized void clear()
```

Declaring owner: `dev.meteorapi.event.BoundedMailbox`.

Exposure: public declaration.

Source span: [foundation/src/main/java/dev/meteorapi/event/BoundedMailbox.java:35–35](source/foundation/src/main/java/dev/meteorapi/event/BoundedMailbox.java#L35).

### EventChannel — Observer registry

Source file: [foundation/src/main/java/dev/meteorapi/event/EventChannel.java](source/foundation/src/main/java/dev/meteorapi/event/EventChannel.java).

Usage contract: Thread-safe registry; callbacks run on the publisher thread. Higher priority dispatches first. A repeated ID conflicts. Consecutive runtime failures can detach a listener.

Declaration entries in this file: 6.

#### dev.meteorapi.event.EventChannel · class · line 21

```java
public final class EventChannel<E>
```

Declaring owner: `dev.meteorapi.event`.

Exposure: public declaration.

Source span: [foundation/src/main/java/dev/meteorapi/event/EventChannel.java:21–93](source/foundation/src/main/java/dev/meteorapi/event/EventChannel.java#L21).

#### dev.meteorapi.event.EventChannel.EventChannel · constructor · line 28

```java
public EventChannel(int failureLimit, BiConsumer<NamespacedId, RuntimeException> errors)
```

Declaring owner: `dev.meteorapi.event.EventChannel`.

Exposure: public declaration.

Source span: [foundation/src/main/java/dev/meteorapi/event/EventChannel.java:28–32](source/foundation/src/main/java/dev/meteorapi/event/EventChannel.java#L28).

#### dev.meteorapi.event.EventChannel.listen · method · line 34

```java
public RegistrationResult<Registration> listen(NamespacedId id, Consumer<? super E> listener)
```

Declaring owner: `dev.meteorapi.event.EventChannel`.

Exposure: public declaration.

Source span: [foundation/src/main/java/dev/meteorapi/event/EventChannel.java:34–36](source/foundation/src/main/java/dev/meteorapi/event/EventChannel.java#L34).

#### dev.meteorapi.event.EventChannel.listen · method · line 38

```java
public synchronized RegistrationResult<Registration> listen(NamespacedId id, int priority, Predicate<? super E> filter, Consumer<? super E> listener)
```

Declaring owner: `dev.meteorapi.event.EventChannel`.

Exposure: public declaration.

Source span: [foundation/src/main/java/dev/meteorapi/event/EventChannel.java:38–48](source/foundation/src/main/java/dev/meteorapi/event/EventChannel.java#L38).

#### dev.meteorapi.event.EventChannel.post · method · line 50

```java
public void post(E event)
```

Declaring owner: `dev.meteorapi.event.EventChannel`.

Exposure: public declaration.

Source span: [foundation/src/main/java/dev/meteorapi/event/EventChannel.java:50–64](source/foundation/src/main/java/dev/meteorapi/event/EventChannel.java#L50).

#### dev.meteorapi.event.EventChannel.size · method · line 66

```java
public int size()
```

Declaring owner: `dev.meteorapi.event.EventChannel`.

Exposure: public declaration.

Source span: [foundation/src/main/java/dev/meteorapi/event/EventChannel.java:66–66](source/foundation/src/main/java/dev/meteorapi/event/EventChannel.java#L66).

### Profiler — Aggregate timings

Source file: [foundation/src/main/java/dev/meteorapi/performance/Profiler.java](source/foundation/src/main/java/dev/meteorapi/performance/Profiler.java).

Usage contract: measure() returns a one-shot close token. Snapshots contain counts, total and maximum nanoseconds, with average helpers. Aggregates are not frame histories.

Declaration entries in this file: 6.

#### dev.meteorapi.performance.Profiler · class · line 10

```java
public final class Profiler
```

Declaring owner: `dev.meteorapi.performance`.

Exposure: public declaration.

Source span: [foundation/src/main/java/dev/meteorapi/performance/Profiler.java:10–30](source/foundation/src/main/java/dev/meteorapi/performance/Profiler.java#L10).

#### dev.meteorapi.performance.Profiler.Sample · record · line 11

```java
public record Sample(long count, long totalNanoseconds, long maximumNanoseconds)
```

Declaring owner: `dev.meteorapi.performance.Profiler`.

Exposure: public declaration.

Source span: [foundation/src/main/java/dev/meteorapi/performance/Profiler.java:11–13](source/foundation/src/main/java/dev/meteorapi/performance/Profiler.java#L11).

#### dev.meteorapi.performance.Profiler.Sample.averageNanoseconds · method · line 12

```java
public double averageNanoseconds()
```

Declaring owner: `dev.meteorapi.performance.Profiler.Sample`.

Exposure: public declaration.

Source span: [foundation/src/main/java/dev/meteorapi/performance/Profiler.java:12–12](source/foundation/src/main/java/dev/meteorapi/performance/Profiler.java#L12).

#### dev.meteorapi.performance.Profiler.measure · method · line 15

```java
public Registration measure(NamespacedId id)
```

Declaring owner: `dev.meteorapi.performance.Profiler`.

Exposure: public declaration.

Source span: [foundation/src/main/java/dev/meteorapi/performance/Profiler.java:15–22](source/foundation/src/main/java/dev/meteorapi/performance/Profiler.java#L15).

#### dev.meteorapi.performance.Profiler.snapshot · method · line 23

```java
public Map<NamespacedId, Sample> snapshot()
```

Declaring owner: `dev.meteorapi.performance.Profiler`.

Exposure: public declaration.

Source span: [foundation/src/main/java/dev/meteorapi/performance/Profiler.java:23–27](source/foundation/src/main/java/dev/meteorapi/performance/Profiler.java#L23).

#### dev.meteorapi.performance.Profiler.clear · method · line 28

```java
public void clear()
```

Declaring owner: `dev.meteorapi.performance.Profiler`.

Exposure: public declaration.

Source span: [foundation/src/main/java/dev/meteorapi/performance/Profiler.java:28–28](source/foundation/src/main/java/dev/meteorapi/performance/Profiler.java#L28).

### WorkBudget — Cooperative work admission

Source file: [foundation/src/main/java/dev/meteorapi/performance/WorkBudget.java](source/foundation/src/main/java/dev/meteorapi/performance/WorkBudget.java).

Usage contract: Elapsed time begins at construction. tryRun() checks bounds before starting the next action. It cannot interrupt a slow action already running.

Declaration entries in this file: 4.

#### dev.meteorapi.performance.WorkBudget · class · line 4

```java
public final class WorkBudget
```

Declaring owner: `dev.meteorapi.performance`.

Exposure: public declaration.

Source span: [foundation/src/main/java/dev/meteorapi/performance/WorkBudget.java:4–18](source/foundation/src/main/java/dev/meteorapi/performance/WorkBudget.java#L4).

#### dev.meteorapi.performance.WorkBudget.WorkBudget · constructor · line 9

```java
public WorkBudget(long nanoseconds, int maximum)
```

Declaring owner: `dev.meteorapi.performance.WorkBudget`.

Exposure: public declaration.

Source span: [foundation/src/main/java/dev/meteorapi/performance/WorkBudget.java:9–12](source/foundation/src/main/java/dev/meteorapi/performance/WorkBudget.java#L9).

#### dev.meteorapi.performance.WorkBudget.tryRun · method · line 13

```java
public boolean tryRun(Runnable action)
```

Declaring owner: `dev.meteorapi.performance.WorkBudget`.

Exposure: public declaration.

Source span: [foundation/src/main/java/dev/meteorapi/performance/WorkBudget.java:13–16](source/foundation/src/main/java/dev/meteorapi/performance/WorkBudget.java#L13).

#### dev.meteorapi.performance.WorkBudget.spent · method · line 17

```java
public int spent()
```

Declaring owner: `dev.meteorapi.performance.WorkBudget`.

Exposure: public declaration.

Source span: [foundation/src/main/java/dev/meteorapi/performance/WorkBudget.java:17–17](source/foundation/src/main/java/dev/meteorapi/performance/WorkBudget.java#L17).

### ConfigStore — Settings persistence

Source file: [foundation/src/main/java/dev/meteorapi/setting/ConfigStore.java](source/foundation/src/main/java/dev/meteorapi/setting/ConfigStore.java).

Usage contract: Registers unique setting IDs, retains unknown loaded entries, and returns invalid-value notes. I/O can throw. Save uses a temporary file and atomic replacement request with a non-atomic fallback.

Declaration entries in this file: 7.

#### dev.meteorapi.setting.ConfigStore · class · line 22

```java
public final class ConfigStore
```

Declaring owner: `dev.meteorapi.setting`.

Exposure: public declaration.

Source span: [foundation/src/main/java/dev/meteorapi/setting/ConfigStore.java:22–61](source/foundation/src/main/java/dev/meteorapi/setting/ConfigStore.java#L22).

#### dev.meteorapi.setting.ConfigStore.ConfigStore · constructor · line 26

```java
public ConfigStore(Path file)
```

Declaring owner: `dev.meteorapi.setting.ConfigStore`.

Exposure: public declaration.

Source span: [foundation/src/main/java/dev/meteorapi/setting/ConfigStore.java:26–26](source/foundation/src/main/java/dev/meteorapi/setting/ConfigStore.java#L26).

#### dev.meteorapi.setting.ConfigStore.add · method · line 27

```java
public synchronized <T> RegistrationResult<Setting<T>> add(Setting<T> setting)
```

Declaring owner: `dev.meteorapi.setting.ConfigStore`.

Exposure: public declaration.

Source span: [foundation/src/main/java/dev/meteorapi/setting/ConfigStore.java:27–33](source/foundation/src/main/java/dev/meteorapi/setting/ConfigStore.java#L27).

#### dev.meteorapi.setting.ConfigStore.settings · method · line 34

```java
public synchronized List<Setting<?>> settings()
```

Declaring owner: `dev.meteorapi.setting.ConfigStore`.

Exposure: public declaration.

Source span: [foundation/src/main/java/dev/meteorapi/setting/ConfigStore.java:34–34](source/foundation/src/main/java/dev/meteorapi/setting/ConfigStore.java#L34).

#### dev.meteorapi.setting.ConfigStore.load · method · line 35

```java
public synchronized List<String> load() throws IOException
```

Declaring owner: `dev.meteorapi.setting.ConfigStore`.

Exposure: public declaration.

Source span: [foundation/src/main/java/dev/meteorapi/setting/ConfigStore.java:35–47](source/foundation/src/main/java/dev/meteorapi/setting/ConfigStore.java#L35).

#### dev.meteorapi.setting.ConfigStore.save · method · line 48

```java
public synchronized void save() throws IOException
```

Declaring owner: `dev.meteorapi.setting.ConfigStore`.

Exposure: public declaration.

Source span: [foundation/src/main/java/dev/meteorapi/setting/ConfigStore.java:48–59](source/foundation/src/main/java/dev/meteorapi/setting/ConfigStore.java#L48).

#### dev.meteorapi.setting.ConfigStore.file · method · line 60

```java
public Path file()
```

Declaring owner: `dev.meteorapi.setting.ConfigStore`.

Exposure: public declaration.

Source span: [foundation/src/main/java/dev/meteorapi/setting/ConfigStore.java:60–60](source/foundation/src/main/java/dev/meteorapi/setting/ConfigStore.java#L60).

### Setting — Typed independent value

Source file: [foundation/src/main/java/dev/meteorapi/setting/Setting.java](source/foundation/src/main/java/dev/meteorapi/setting/Setting.java).

Usage contract: Validates defaults and updates, exposes visibility/reset/codec/change behavior, and supports snapshots for mutable custom values. Change observers run on the changing thread.

Declaration entries in this file: 16.

#### dev.meteorapi.setting.Setting · class · line 16

```java
public final class Setting<T>
```

Declaring owner: `dev.meteorapi.setting`.

Exposure: public declaration.

Source span: [foundation/src/main/java/dev/meteorapi/setting/Setting.java:16–75](source/foundation/src/main/java/dev/meteorapi/setting/Setting.java#L16).

#### dev.meteorapi.setting.Setting.Change · record · line 17

```java
public record Change<T>(T previous, T value)
```

Declaring owner: `dev.meteorapi.setting.Setting`.

Exposure: public declaration.

Source span: [foundation/src/main/java/dev/meteorapi/setting/Setting.java:17–17](source/foundation/src/main/java/dev/meteorapi/setting/Setting.java#L17).

#### dev.meteorapi.setting.Setting.Setting · constructor · line 28

```java
public Setting(NamespacedId id, String description, T defaultValue, ValueCodec<T> codec, Predicate<T> validator, BooleanSupplier visible)
```

Declaring owner: `dev.meteorapi.setting.Setting`.

Exposure: public declaration.

Source span: [foundation/src/main/java/dev/meteorapi/setting/Setting.java:28–31](source/foundation/src/main/java/dev/meteorapi/setting/Setting.java#L28).

#### dev.meteorapi.setting.Setting.Setting · constructor · line 32

```java
public Setting(NamespacedId id, String description, T defaultValue, ValueCodec<T> codec, Predicate<T> validator, BooleanSupplier visible, UnaryOperator<T> snapshot)
```

Declaring owner: `dev.meteorapi.setting.Setting`.

Exposure: public declaration.

Source span: [foundation/src/main/java/dev/meteorapi/setting/Setting.java:32–42](source/foundation/src/main/java/dev/meteorapi/setting/Setting.java#L32).

#### dev.meteorapi.setting.Setting.id · method · line 44

```java
public NamespacedId id()
```

Declaring owner: `dev.meteorapi.setting.Setting`.

Exposure: public declaration.

Source span: [foundation/src/main/java/dev/meteorapi/setting/Setting.java:44–44](source/foundation/src/main/java/dev/meteorapi/setting/Setting.java#L44).

#### dev.meteorapi.setting.Setting.description · method · line 45

```java
public String description()
```

Declaring owner: `dev.meteorapi.setting.Setting`.

Exposure: public declaration.

Source span: [foundation/src/main/java/dev/meteorapi/setting/Setting.java:45–45](source/foundation/src/main/java/dev/meteorapi/setting/Setting.java#L45).

#### dev.meteorapi.setting.Setting.get · method · line 46

```java
public T get()
```

Declaring owner: `dev.meteorapi.setting.Setting`.

Exposure: public declaration.

Source span: [foundation/src/main/java/dev/meteorapi/setting/Setting.java:46–46](source/foundation/src/main/java/dev/meteorapi/setting/Setting.java#L46).

#### dev.meteorapi.setting.Setting.defaultValue · method · line 47

```java
public T defaultValue()
```

Declaring owner: `dev.meteorapi.setting.Setting`.

Exposure: public declaration.

Source span: [foundation/src/main/java/dev/meteorapi/setting/Setting.java:47–47](source/foundation/src/main/java/dev/meteorapi/setting/Setting.java#L47).

#### dev.meteorapi.setting.Setting.isVisible · method · line 48

```java
public boolean isVisible()
```

Declaring owner: `dev.meteorapi.setting.Setting`.

Exposure: public declaration.

Source span: [foundation/src/main/java/dev/meteorapi/setting/Setting.java:48–48](source/foundation/src/main/java/dev/meteorapi/setting/Setting.java#L48).

#### dev.meteorapi.setting.Setting.changed · method · line 49

```java
public boolean changed()
```

Declaring owner: `dev.meteorapi.setting.Setting`.

Exposure: public declaration.

Source span: [foundation/src/main/java/dev/meteorapi/setting/Setting.java:49–49](source/foundation/src/main/java/dev/meteorapi/setting/Setting.java#L49).

#### dev.meteorapi.setting.Setting.codec · method · line 50

```java
public ValueCodec<T> codec()
```

Declaring owner: `dev.meteorapi.setting.Setting`.

Exposure: public declaration.

Source span: [foundation/src/main/java/dev/meteorapi/setting/Setting.java:50–50](source/foundation/src/main/java/dev/meteorapi/setting/Setting.java#L50).

#### dev.meteorapi.setting.Setting.set · method · line 52

```java
public boolean set(T next)
```

Declaring owner: `dev.meteorapi.setting.Setting`.

Exposure: public declaration.

Source span: [foundation/src/main/java/dev/meteorapi/setting/Setting.java:52–63](source/foundation/src/main/java/dev/meteorapi/setting/Setting.java#L52).

#### dev.meteorapi.setting.Setting.parse · method · line 65

```java
public boolean parse(String text)
```

Declaring owner: `dev.meteorapi.setting.Setting`.

Exposure: public declaration.

Source span: [foundation/src/main/java/dev/meteorapi/setting/Setting.java:65–68](source/foundation/src/main/java/dev/meteorapi/setting/Setting.java#L65).

#### dev.meteorapi.setting.Setting.reset · method · line 70

```java
public void reset()
```

Declaring owner: `dev.meteorapi.setting.Setting`.

Exposure: public declaration.

Source span: [foundation/src/main/java/dev/meteorapi/setting/Setting.java:70–70](source/foundation/src/main/java/dev/meteorapi/setting/Setting.java#L70).

#### dev.meteorapi.setting.Setting.encode · method · line 71

```java
public String encode()
```

Declaring owner: `dev.meteorapi.setting.Setting`.

Exposure: public declaration.

Source span: [foundation/src/main/java/dev/meteorapi/setting/Setting.java:71–71](source/foundation/src/main/java/dev/meteorapi/setting/Setting.java#L71).

#### dev.meteorapi.setting.Setting.onChanged · method · line 72

```java
public RegistrationResult<Registration> onChanged(NamespacedId listener, Consumer<Change<T>> callback)
```

Declaring owner: `dev.meteorapi.setting.Setting`.

Exposure: public declaration.

Source span: [foundation/src/main/java/dev/meteorapi/setting/Setting.java:72–74](source/foundation/src/main/java/dev/meteorapi/setting/Setting.java#L72).

### Settings — Typed setting factories

Source file: [foundation/src/main/java/dev/meteorapi/setting/Settings.java](source/foundation/src/main/java/dev/meteorapi/setting/Settings.java).

Usage contract: Factories cover long, finite double, boolean, string, enum, file, and string-list values. file() accepts null or an existing regular file. strings() preserves empty lists, empty elements, Unicode, and delimiter-containing strings.

Declaration entries in this file: 9.

#### dev.meteorapi.setting.Settings · class · line 13

```java
public final class Settings
```

Declaring owner: `dev.meteorapi.setting`.

Exposure: public declaration.

Source span: [foundation/src/main/java/dev/meteorapi/setting/Settings.java:13–69](source/foundation/src/main/java/dev/meteorapi/setting/Settings.java#L13).

#### dev.meteorapi.setting.Settings.codec · method · line 15

```java
public static <T> ValueCodec<T> codec(Function<String, T> decode, Function<T, String> encode)
```

Declaring owner: `dev.meteorapi.setting.Settings`.

Exposure: public declaration.

Source span: [foundation/src/main/java/dev/meteorapi/setting/Settings.java:15–20](source/foundation/src/main/java/dev/meteorapi/setting/Settings.java#L15).

#### dev.meteorapi.setting.Settings.longValue · method · line 21

```java
public static Setting<Long> longValue(NamespacedId id, long initial, long min, long max)
```

Declaring owner: `dev.meteorapi.setting.Settings`.

Exposure: public declaration.

Source span: [foundation/src/main/java/dev/meteorapi/setting/Settings.java:21–25](source/foundation/src/main/java/dev/meteorapi/setting/Settings.java#L21).

#### dev.meteorapi.setting.Settings.doubleValue · method · line 26

```java
public static Setting<Double> doubleValue(NamespacedId id, double initial, double min, double max)
```

Declaring owner: `dev.meteorapi.setting.Settings`.

Exposure: public declaration.

Source span: [foundation/src/main/java/dev/meteorapi/setting/Settings.java:26–30](source/foundation/src/main/java/dev/meteorapi/setting/Settings.java#L26).

#### dev.meteorapi.setting.Settings.bool · method · line 31

```java
public static Setting<Boolean> bool(NamespacedId id, boolean initial)
```

Declaring owner: `dev.meteorapi.setting.Settings`.

Exposure: public declaration.

Source span: [foundation/src/main/java/dev/meteorapi/setting/Settings.java:31–36](source/foundation/src/main/java/dev/meteorapi/setting/Settings.java#L31).

#### dev.meteorapi.setting.Settings.text · method · line 37

```java
public static Setting<String> text(NamespacedId id, String initial, int maxLength)
```

Declaring owner: `dev.meteorapi.setting.Settings`.

Exposure: public declaration.

Source span: [foundation/src/main/java/dev/meteorapi/setting/Settings.java:37–40](source/foundation/src/main/java/dev/meteorapi/setting/Settings.java#L37).

#### dev.meteorapi.setting.Settings.enumeration · method · line 41

```java
public static <E extends Enum<E>> Setting<E> enumeration(NamespacedId id, E initial, Class<E> type)
```

Declaring owner: `dev.meteorapi.setting.Settings`.

Exposure: public declaration.

Source span: [foundation/src/main/java/dev/meteorapi/setting/Settings.java:41–44](source/foundation/src/main/java/dev/meteorapi/setting/Settings.java#L41).

#### dev.meteorapi.setting.Settings.file · method · line 46

```java
public static Setting<Path> file(NamespacedId id, Path initial)
```

Declaring owner: `dev.meteorapi.setting.Settings`.

Exposure: public declaration.

Source span: [foundation/src/main/java/dev/meteorapi/setting/Settings.java:46–50](source/foundation/src/main/java/dev/meteorapi/setting/Settings.java#L46).

#### dev.meteorapi.setting.Settings.strings · method · line 51

```java
public static Setting<List<String>> strings(NamespacedId id, List<String> initial, int maxEntries)
```

Declaring owner: `dev.meteorapi.setting.Settings`.

Exposure: public declaration.

Source span: [foundation/src/main/java/dev/meteorapi/setting/Settings.java:51–68](source/foundation/src/main/java/dev/meteorapi/setting/Settings.java#L51).

### ValueCodec — Text representation contract

Source file: [foundation/src/main/java/dev/meteorapi/setting/ValueCodec.java](source/foundation/src/main/java/dev/meteorapi/setting/ValueCodec.java).

Usage contract: encode() and decode() define a value representation. Interface methods can be implicitly public without a written public keyword. Decoder exceptions follow the calling setting contract.

Declaration entries in this file: 3.

#### dev.meteorapi.setting.ValueCodec · interface · line 4

```java
public interface ValueCodec<T>
```

Declaring owner: `dev.meteorapi.setting`.

Exposure: public declaration.

Source span: [foundation/src/main/java/dev/meteorapi/setting/ValueCodec.java:4–7](source/foundation/src/main/java/dev/meteorapi/setting/ValueCodec.java#L4).

#### dev.meteorapi.setting.ValueCodec.decode · method · line 5

```java
T decode(String text)
```

Declaring owner: `dev.meteorapi.setting.ValueCodec`.

Exposure: implicitly public interface member.

Source span: [foundation/src/main/java/dev/meteorapi/setting/ValueCodec.java:5–5](source/foundation/src/main/java/dev/meteorapi/setting/ValueCodec.java#L5).

#### dev.meteorapi.setting.ValueCodec.encode · method · line 6

```java
String encode(T value)
```

Declaring owner: `dev.meteorapi.setting.ValueCodec`.

Exposure: implicitly public interface member.

Source span: [foundation/src/main/java/dev/meteorapi/setting/ValueCodec.java:6–6](source/foundation/src/main/java/dev/meteorapi/setting/ValueCodec.java#L6).

### Tasks — Bounded background work

Source file: [foundation/src/main/java/dev/meteorapi/task/Tasks.java](source/foundation/src/main/java/dev/meteorapi/task/Tasks.java).

Usage contract: Two daemon workers and a 64-item queue. Scope ownership is transferred on the owner thread. Cancellation requests interruption; task code must cooperate. Minecraft world/render state does not belong on workers.

Declaration entries in this file: 3.

#### dev.meteorapi.task.Tasks · class · line 8

```java
public final class Tasks
```

Declaring owner: `dev.meteorapi.task`.

Exposure: public declaration.

Source span: [foundation/src/main/java/dev/meteorapi/task/Tasks.java:8–31](source/foundation/src/main/java/dev/meteorapi/task/Tasks.java#L8).

#### dev.meteorapi.task.Tasks.submit · method · line 15

```java
public static <T> CompletableFuture<T> submit(Callable<T> action, ResourceScope scope)
```

Declaring owner: `dev.meteorapi.task.Tasks`.

Exposure: public declaration.

Source span: [foundation/src/main/java/dev/meteorapi/task/Tasks.java:15–29](source/foundation/src/main/java/dev/meteorapi/task/Tasks.java#L15).

#### dev.meteorapi.task.Tasks.queued · method · line 30

```java
public static int queued()
```

Declaring owner: `dev.meteorapi.task.Tasks`.

Exposure: public declaration.

Source span: [foundation/src/main/java/dev/meteorapi/task/Tasks.java:30–30](source/foundation/src/main/java/dev/meteorapi/task/Tasks.java#L30).

### NameRules — Scoped naming policy

Source file: [foundation/src/main/java/dev/meteorlib/foundation/NameRules.java](source/foundation/src/main/java/dev/meteorlib/foundation/NameRules.java).

Usage contract: scoped() creates owner.local using stricter name rules. Other methods reject case-insensitive overlap and the supported Meteor category string-hash collision.

Declaration entries in this file: 5.

#### dev.meteorlib.foundation.NameRules · class · line 11

```java
public final class NameRules
```

Declaring owner: `dev.meteorlib.foundation`.

Exposure: public declaration.

Source span: [foundation/src/main/java/dev/meteorlib/foundation/NameRules.java:11–50](source/foundation/src/main/java/dev/meteorlib/foundation/NameRules.java#L11).

#### dev.meteorlib.foundation.NameRules.scoped · method · line 14

```java
public static String scoped(String namespace, String localName)
```

Declaring owner: `dev.meteorlib.foundation.NameRules`.

Exposure: public declaration.

Source span: [foundation/src/main/java/dev/meteorlib/foundation/NameRules.java:14–20](source/foundation/src/main/java/dev/meteorlib/foundation/NameRules.java#L14).

#### dev.meteorlib.foundation.NameRules.requireDistinct · method · line 22

```java
public static void requireDistinct(Collection<String> names)
```

Declaring owner: `dev.meteorlib.foundation.NameRules`.

Exposure: public declaration.

Source span: [foundation/src/main/java/dev/meteorlib/foundation/NameRules.java:22–31](source/foundation/src/main/java/dev/meteorlib/foundation/NameRules.java#L22).

#### dev.meteorlib.foundation.NameRules.rejectOverlap · method · line 33

```java
public static void rejectOverlap(Collection<String> proposed, Collection<String> existing, String kind)
```

Declaring owner: `dev.meteorlib.foundation.NameRules`.

Exposure: public declaration.

Source span: [foundation/src/main/java/dev/meteorlib/foundation/NameRules.java:33–40](source/foundation/src/main/java/dev/meteorlib/foundation/NameRules.java#L33).

#### dev.meteorlib.foundation.NameRules.requireCategoryDistinct · method · line 43

```java
public static void requireCategoryDistinct(String proposed, Collection<String> existing)
```

Declaring owner: `dev.meteorlib.foundation.NameRules`.

Exposure: public declaration.

Source span: [foundation/src/main/java/dev/meteorlib/foundation/NameRules.java:43–49](source/foundation/src/main/java/dev/meteorlib/foundation/NameRules.java#L43).

### NamespacedId — Validated ID record

Source file: [foundation/src/main/java/dev/meteorlib/foundation/NamespacedId.java](source/foundation/src/main/java/dev/meteorlib/foundation/NamespacedId.java).

Usage contract: Uses namespace:path with lowercase validated components. Record-generated namespace()/path() accessors are available even though they are not explicit methods in the inventory.

Declaration entries in this file: 4.

#### dev.meteorlib.foundation.NamespacedId · record · line 8

```java
public record NamespacedId(String namespace, String path)
```

Declaring owner: `dev.meteorlib.foundation`.

Exposure: public declaration.

Source span: [foundation/src/main/java/dev/meteorlib/foundation/NamespacedId.java:8–29](source/foundation/src/main/java/dev/meteorlib/foundation/NamespacedId.java#L8).

#### dev.meteorlib.foundation.NamespacedId.NamespacedId · compact constructor · line 12

```java
public NamespacedId
```

Declaring owner: `dev.meteorlib.foundation.NamespacedId`.

Exposure: public declaration.

Source span: [foundation/src/main/java/dev/meteorlib/foundation/NamespacedId.java:12–17](source/foundation/src/main/java/dev/meteorlib/foundation/NamespacedId.java#L12).

#### dev.meteorlib.foundation.NamespacedId.parse · method · line 19

```java
public static NamespacedId parse(String input)
```

Declaring owner: `dev.meteorlib.foundation.NamespacedId`.

Exposure: public declaration.

Source span: [foundation/src/main/java/dev/meteorlib/foundation/NamespacedId.java:19–25](source/foundation/src/main/java/dev/meteorlib/foundation/NamespacedId.java#L19).

#### dev.meteorlib.foundation.NamespacedId.toString · method · line 27

```java
@Override public String toString()
```

Declaring owner: `dev.meteorlib.foundation.NamespacedId`.

Exposure: public declaration.

Source span: [foundation/src/main/java/dev/meteorlib/foundation/NamespacedId.java:27–28](source/foundation/src/main/java/dev/meteorlib/foundation/NamespacedId.java#L27).

### Registration — Revocable cleanup token

Source file: [foundation/src/main/java/dev/meteorlib/foundation/Registration.java](source/foundation/src/main/java/dev/meteorlib/foundation/Registration.java).

Usage contract: once() supplies atomic one-shot cleanup. The underlying cleanup may still be thread confined. Interface methods are public according to Java rules even without an explicit public keyword.

Declaration entries in this file: 3.

#### dev.meteorlib.foundation.Registration · interface · line 8

```java
@FunctionalInterface public interface Registration extends AutoCloseable
```

Declaring owner: `dev.meteorlib.foundation`.

Exposure: public declaration.

Source span: [foundation/src/main/java/dev/meteorlib/foundation/Registration.java:8–20](source/foundation/src/main/java/dev/meteorlib/foundation/Registration.java#L8).

#### dev.meteorlib.foundation.Registration.close · method · line 10

```java
@Override void close()
```

Declaring owner: `dev.meteorlib.foundation.Registration`.

Exposure: implicitly public interface member.

Source span: [foundation/src/main/java/dev/meteorlib/foundation/Registration.java:10–11](source/foundation/src/main/java/dev/meteorlib/foundation/Registration.java#L10).

#### dev.meteorlib.foundation.Registration.once · method · line 13

```java
static Registration once(Runnable action)
```

Declaring owner: `dev.meteorlib.foundation.Registration`.

Exposure: implicitly public interface member.

Source span: [foundation/src/main/java/dev/meteorlib/foundation/Registration.java:13–19](source/foundation/src/main/java/dev/meteorlib/foundation/Registration.java#L13).

### RegistrationConflictException — Low-level conflict diagnostic

Source file: [foundation/src/main/java/dev/meteorlib/foundation/RegistrationConflictException.java](source/foundation/src/main/java/dev/meteorlib/foundation/RegistrationConflictException.java).

Usage contract: Extends IllegalStateException. Guard wrappers can convert it into RegistrationResult.CONFLICT. A reported conflict does not authorize silently replacing the existing owner.

Declaration entries in this file: 2.

#### dev.meteorlib.foundation.RegistrationConflictException · class · line 5

```java
public final class RegistrationConflictException extends IllegalStateException
```

Declaring owner: `dev.meteorlib.foundation`.

Exposure: public declaration.

Source span: [foundation/src/main/java/dev/meteorlib/foundation/RegistrationConflictException.java:5–7](source/foundation/src/main/java/dev/meteorlib/foundation/RegistrationConflictException.java#L5).

#### dev.meteorlib.foundation.RegistrationConflictException.RegistrationConflictException · constructor · line 6

```java
public RegistrationConflictException(String message)
```

Declaring owner: `dev.meteorlib.foundation.RegistrationConflictException`.

Exposure: public declaration.

Source span: [foundation/src/main/java/dev/meteorlib/foundation/RegistrationConflictException.java:6–6](source/foundation/src/main/java/dev/meteorlib/foundation/RegistrationConflictException.java#L6).

### RegistrationResult — Explicit registration outcome

Source file: [foundation/src/main/java/dev/meteorlib/foundation/RegistrationResult.java](source/foundation/src/main/java/dev/meteorlib/foundation/RegistrationResult.java).

Usage contract: Success statuses have an Optional value; failures do not. attempt() classifies supported runtime failures. It does not swallow JVM fatal errors or make every other API non-throwing.

Declaration entries in this file: 5.

#### dev.meteorlib.foundation.RegistrationResult · record · line 9

```java
public record RegistrationResult<T>(Status status, Optional<T> value, String message)
```

Declaring owner: `dev.meteorlib.foundation`.

Exposure: public declaration.

Source span: [foundation/src/main/java/dev/meteorlib/foundation/RegistrationResult.java:9–31](source/foundation/src/main/java/dev/meteorlib/foundation/RegistrationResult.java#L9).

#### dev.meteorlib.foundation.RegistrationResult.Status · enum · line 10

```java
public enum Status
```

Declaring owner: `dev.meteorlib.foundation.RegistrationResult`.

Exposure: public declaration.

Source span: [foundation/src/main/java/dev/meteorlib/foundation/RegistrationResult.java:10–10](source/foundation/src/main/java/dev/meteorlib/foundation/RegistrationResult.java#L10).

#### dev.meteorlib.foundation.RegistrationResult.RegistrationResult · compact constructor · line 12

```java
public RegistrationResult
```

Declaring owner: `dev.meteorlib.foundation.RegistrationResult`.

Exposure: public declaration.

Source span: [foundation/src/main/java/dev/meteorlib/foundation/RegistrationResult.java:12–16](source/foundation/src/main/java/dev/meteorlib/foundation/RegistrationResult.java#L12).

#### dev.meteorlib.foundation.RegistrationResult.success · method · line 18

```java
public boolean success()
```

Declaring owner: `dev.meteorlib.foundation.RegistrationResult`.

Exposure: public declaration.

Source span: [foundation/src/main/java/dev/meteorlib/foundation/RegistrationResult.java:18–18](source/foundation/src/main/java/dev/meteorlib/foundation/RegistrationResult.java#L18).

#### dev.meteorlib.foundation.RegistrationResult.attempt · method · line 20

```java
public static <T> RegistrationResult<T> attempt(Supplier<T> action)
```

Declaring owner: `dev.meteorlib.foundation.RegistrationResult`.

Exposure: public declaration.

Source span: [foundation/src/main/java/dev/meteorlib/foundation/RegistrationResult.java:20–30](source/foundation/src/main/java/dev/meteorlib/foundation/RegistrationResult.java#L20).

### ResourceScope — Owner-thread resource lifetime

Source file: [foundation/src/main/java/dev/meteorlib/foundation/ResourceScope.java](source/foundation/src/main/java/dev/meteorlib/foundation/ResourceScope.java).

Usage contract: Own and close on the creating thread. Cleanup is reverse-order and attempts every resource. A closed scope rejects new ownership.

Declaration entries in this file: 5.

#### dev.meteorlib.foundation.ResourceScope · class · line 9

```java
public final class ResourceScope implements AutoCloseable
```

Declaring owner: `dev.meteorlib.foundation`.

Exposure: public declaration.

Source span: [foundation/src/main/java/dev/meteorlib/foundation/ResourceScope.java:9–50](source/foundation/src/main/java/dev/meteorlib/foundation/ResourceScope.java#L9).

#### dev.meteorlib.foundation.ResourceScope.own · method · line 14

```java
public <T extends AutoCloseable> T own(T resource)
```

Declaring owner: `dev.meteorlib.foundation.ResourceScope`.

Exposure: public declaration.

Source span: [foundation/src/main/java/dev/meteorlib/foundation/ResourceScope.java:14–19](source/foundation/src/main/java/dev/meteorlib/foundation/ResourceScope.java#L14).

#### dev.meteorlib.foundation.ResourceScope.defer · method · line 21

```java
public Registration defer(Runnable cleanup)
```

Declaring owner: `dev.meteorlib.foundation.ResourceScope`.

Exposure: public declaration.

Source span: [foundation/src/main/java/dev/meteorlib/foundation/ResourceScope.java:21–23](source/foundation/src/main/java/dev/meteorlib/foundation/ResourceScope.java#L21).

#### dev.meteorlib.foundation.ResourceScope.isClosed · method · line 25

```java
public boolean isClosed()
```

Declaring owner: `dev.meteorlib.foundation.ResourceScope`.

Exposure: public declaration.

Source span: [foundation/src/main/java/dev/meteorlib/foundation/ResourceScope.java:25–28](source/foundation/src/main/java/dev/meteorlib/foundation/ResourceScope.java#L25).

#### dev.meteorlib.foundation.ResourceScope.close · method · line 30

```java
@Override public void close()
```

Declaring owner: `dev.meteorlib.foundation.ResourceScope`.

Exposure: public declaration.

Source span: [foundation/src/main/java/dev/meteorlib/foundation/ResourceScope.java:30–45](source/foundation/src/main/java/dev/meteorlib/foundation/ResourceScope.java#L30).

### ServiceRegistry — Typed shared services

Source file: [foundation/src/main/java/dev/meteorlib/foundation/ServiceRegistry.java](source/foundation/src/main/java/dev/meteorlib/foundation/ServiceRegistry.java).

Usage contract: Keys are Java class tokens. Duplicate service ownership throws. A removal token only removes its exact registered instance. Service methods retain their own threading rules.

Declaration entries in this file: 4.

#### dev.meteorlib.foundation.ServiceRegistry · class · line 10

```java
public final class ServiceRegistry
```

Declaring owner: `dev.meteorlib.foundation`.

Exposure: public declaration.

Source span: [foundation/src/main/java/dev/meteorlib/foundation/ServiceRegistry.java:10–33](source/foundation/src/main/java/dev/meteorlib/foundation/ServiceRegistry.java#L10).

#### dev.meteorlib.foundation.ServiceRegistry.register · method · line 13

```java
public synchronized <T> Registration register(Class<T> type, T service)
```

Declaring owner: `dev.meteorlib.foundation.ServiceRegistry`.

Exposure: public declaration.

Source span: [foundation/src/main/java/dev/meteorlib/foundation/ServiceRegistry.java:13–20](source/foundation/src/main/java/dev/meteorlib/foundation/ServiceRegistry.java#L13).

#### dev.meteorlib.foundation.ServiceRegistry.find · method · line 22

```java
public synchronized <T> Optional<T> find(Class<T> type)
```

Declaring owner: `dev.meteorlib.foundation.ServiceRegistry`.

Exposure: public declaration.

Source span: [foundation/src/main/java/dev/meteorlib/foundation/ServiceRegistry.java:22–24](source/foundation/src/main/java/dev/meteorlib/foundation/ServiceRegistry.java#L22).

#### dev.meteorlib.foundation.ServiceRegistry.require · method · line 26

```java
public <T> T require(Class<T> type)
```

Declaring owner: `dev.meteorlib.foundation.ServiceRegistry`.

Exposure: public declaration.

Source span: [foundation/src/main/java/dev/meteorlib/foundation/ServiceRegistry.java:26–28](source/foundation/src/main/java/dev/meteorlib/foundation/ServiceRegistry.java#L26).

### TickScheduler — Bounded tick tasks

Source file: [foundation/src/main/java/dev/meteorlib/foundation/TickScheduler.java](source/foundation/src/main/java/dev/meteorlib/foundation/TickScheduler.java).

Usage contract: Owner-thread confined. Zero delay means next tick. Due-tick order is stable by insertion sequence. Capacity and per-tick bounds do not preempt a running action.

Declaration entries in this file: 7.

#### dev.meteorlib.foundation.TickScheduler · class · line 10

```java
public final class TickScheduler implements AutoCloseable
```

Declaring owner: `dev.meteorlib.foundation`.

Exposure: public declaration.

Source span: [foundation/src/main/java/dev/meteorlib/foundation/TickScheduler.java:10–67](source/foundation/src/main/java/dev/meteorlib/foundation/TickScheduler.java#L10).

#### dev.meteorlib.foundation.TickScheduler.TickScheduler · constructor · line 22

```java
public TickScheduler(int capacity, int perTick, Consumer<RuntimeException> errors)
```

Declaring owner: `dev.meteorlib.foundation.TickScheduler`.

Exposure: public declaration.

Source span: [foundation/src/main/java/dev/meteorlib/foundation/TickScheduler.java:22–27](source/foundation/src/main/java/dev/meteorlib/foundation/TickScheduler.java#L22).

#### dev.meteorlib.foundation.TickScheduler.schedule · method · line 29

```java
public Registration schedule(long delayTicks, Runnable action)
```

Declaring owner: `dev.meteorlib.foundation.TickScheduler`.

Exposure: public declaration.

Source span: [foundation/src/main/java/dev/meteorlib/foundation/TickScheduler.java:29–38](source/foundation/src/main/java/dev/meteorlib/foundation/TickScheduler.java#L29).

#### dev.meteorlib.foundation.TickScheduler.pending · method · line 40

```java
public int pending()
```

Declaring owner: `dev.meteorlib.foundation.TickScheduler`.

Exposure: public declaration.

Source span: [foundation/src/main/java/dev/meteorlib/foundation/TickScheduler.java:40–40](source/foundation/src/main/java/dev/meteorlib/foundation/TickScheduler.java#L40).

#### dev.meteorlib.foundation.TickScheduler.currentTick · method · line 41

```java
public long currentTick()
```

Declaring owner: `dev.meteorlib.foundation.TickScheduler`.

Exposure: public declaration.

Source span: [foundation/src/main/java/dev/meteorlib/foundation/TickScheduler.java:41–41](source/foundation/src/main/java/dev/meteorlib/foundation/TickScheduler.java#L41).

#### dev.meteorlib.foundation.TickScheduler.tick · method · line 43

```java
public void tick()
```

Declaring owner: `dev.meteorlib.foundation.TickScheduler`.

Exposure: public declaration.

Source span: [foundation/src/main/java/dev/meteorlib/foundation/TickScheduler.java:43–57](source/foundation/src/main/java/dev/meteorlib/foundation/TickScheduler.java#L43).

#### dev.meteorlib.foundation.TickScheduler.close · method · line 59

```java
@Override public void close()
```

Declaring owner: `dev.meteorlib.foundation.TickScheduler`.

Exposure: public declaration.

Source span: [foundation/src/main/java/dev/meteorlib/foundation/TickScheduler.java:59–60](source/foundation/src/main/java/dev/meteorlib/foundation/TickScheduler.java#L59).

### MetadataProfileTest — Verification support

Source file: [api/src/test/java/dev/meteorapi/MetadataProfileTest.java](source/api/src/test/java/dev/meteorapi/MetadataProfileTest.java).

Usage contract: This belongs to a test source set. Its public test entrypoints are not a runtime addon API. Recorded release checks are explained in chapter 46.

Declaration entries in this file: 2.

#### dev.meteorapi.MetadataProfileTest · class · line 13

```java
public final class MetadataProfileTest
```

Declaring owner: `dev.meteorapi`.

Exposure: public declaration.

Source span: [api/src/test/java/dev/meteorapi/MetadataProfileTest.java:13–73](source/api/src/test/java/dev/meteorapi/MetadataProfileTest.java#L13).

#### dev.meteorapi.MetadataProfileTest.main · method · line 15

```java
public static void main(String[] args) throws Exception
```

Declaring owner: `dev.meteorapi.MetadataProfileTest`.

Exposure: public declaration.

Source span: [api/src/test/java/dev/meteorapi/MetadataProfileTest.java:15–51](source/api/src/test/java/dev/meteorapi/MetadataProfileTest.java#L15).

### PlatformTest — Verification support

Source file: [api/src/test/java/dev/meteorapi/PlatformTest.java](source/api/src/test/java/dev/meteorapi/PlatformTest.java).

Usage contract: This belongs to a test source set. Its public test entrypoints are not a runtime addon API. Recorded release checks are explained in chapter 46.

Declaration entries in this file: 2.

#### dev.meteorapi.PlatformTest · class · line 13

```java
public final class PlatformTest
```

Declaring owner: `dev.meteorapi`.

Exposure: public declaration.

Source span: [api/src/test/java/dev/meteorapi/PlatformTest.java:13–73](source/api/src/test/java/dev/meteorapi/PlatformTest.java#L13).

#### dev.meteorapi.PlatformTest.main · method · line 15

```java
public static void main(String[] args) throws Exception
```

Declaring owner: `dev.meteorapi.PlatformTest`.

Exposure: public declaration.

Source span: [api/src/test/java/dev/meteorapi/PlatformTest.java:15–71](source/api/src/test/java/dev/meteorapi/PlatformTest.java#L15).

### ApiCoreTest — Verification support

Source file: [foundation/src/test/java/dev/meteorapi/ApiCoreTest.java](source/foundation/src/test/java/dev/meteorapi/ApiCoreTest.java).

Usage contract: This belongs to a test source set. Its public test entrypoints are not a runtime addon API. Recorded release checks are explained in chapter 46.

Declaration entries in this file: 2.

#### dev.meteorapi.ApiCoreTest · class · line 18

```java
public final class ApiCoreTest
```

Declaring owner: `dev.meteorapi`.

Exposure: public declaration.

Source span: [foundation/src/test/java/dev/meteorapi/ApiCoreTest.java:18–114](source/foundation/src/test/java/dev/meteorapi/ApiCoreTest.java#L18).

#### dev.meteorapi.ApiCoreTest.main · method · line 21

```java
public static void main(String[] args) throws Exception
```

Declaring owner: `dev.meteorapi.ApiCoreTest`.

Exposure: public declaration.

Source span: [foundation/src/test/java/dev/meteorapi/ApiCoreTest.java:21–108](source/foundation/src/test/java/dev/meteorapi/ApiCoreTest.java#L21).

### ClientCoreTest — Verification support

Source file: [foundation/src/test/java/dev/meteorapi/ClientCoreTest.java](source/foundation/src/test/java/dev/meteorapi/ClientCoreTest.java).

Usage contract: This belongs to a test source set. Its public test entrypoints are not a runtime addon API. Recorded release checks are explained in chapter 46.

Declaration entries in this file: 2.

#### dev.meteorapi.ClientCoreTest · class · line 16

```java
public final class ClientCoreTest
```

Declaring owner: `dev.meteorapi`.

Exposure: public declaration.

Source span: [foundation/src/test/java/dev/meteorapi/ClientCoreTest.java:16–73](source/foundation/src/test/java/dev/meteorapi/ClientCoreTest.java#L16).

#### dev.meteorapi.ClientCoreTest.main · method · line 18

```java
public static void main(String[] args) throws Exception
```

Declaring owner: `dev.meteorapi.ClientCoreTest`.

Exposure: public declaration.

Source span: [foundation/src/test/java/dev/meteorapi/ClientCoreTest.java:18–67](source/foundation/src/test/java/dev/meteorapi/ClientCoreTest.java#L18).

### FoundationTest — Verification support

Source file: [foundation/src/test/java/dev/meteorlib/foundation/FoundationTest.java](source/foundation/src/test/java/dev/meteorlib/foundation/FoundationTest.java).

Usage contract: This belongs to a test source set. Its public test entrypoints are not a runtime addon API. Recorded release checks are explained in chapter 46.

Declaration entries in this file: 2.

#### dev.meteorlib.foundation.FoundationTest · class · line 10

```java
public final class FoundationTest
```

Declaring owner: `dev.meteorlib.foundation`.

Exposure: public declaration.

Source span: [foundation/src/test/java/dev/meteorlib/foundation/FoundationTest.java:10–129](source/foundation/src/test/java/dev/meteorlib/foundation/FoundationTest.java#L10).

#### dev.meteorlib.foundation.FoundationTest.main · method · line 13

```java
public static void main(String[] args) throws Exception
```

Declaring owner: `dev.meteorlib.foundation.FoundationTest`.

Exposure: public declaration.

Source span: [foundation/src/test/java/dev/meteorlib/foundation/FoundationTest.java:13–113](source/foundation/src/test/java/dev/meteorlib/foundation/FoundationTest.java#L13).


## 56. Recorded backport classifications

These numbers classify declarations. They are not percentages of equivalent or runtime-tested behavior.

| Status | Declarations |
|---|---|
| `unchanged_declaration_in_1.21.11` | 4883 |
| `mapping_normalized_signature_candidate` | 582 |
| `adapted_additive_helper` | 9 |
| `existing_symbol_needs_semantic_review` | 190 |
| `ported_optional_meteor` | 63 |
| `pending_backport_review` | 39 |
| `version_specific_game_hook_not_public_sdk` | 384 |
| `adapted_policy_type` | 1 |
| `adapted_render_queue` | 3 |
| `ported_independent` | 39 |
| `adapted_native_backend` | 3 |
| `adapted_packet_catalog` | 8 |
| `adapted_game_protocol` | 5 |
| `adapted_game_registry` | 4 |
| `adapted_vertex_interface` | 16 |
| `adapted_constructor` | 2 |

Pending, candidate, and semantic-review entries remain unresolved at their stated level.
Do not report the sum of all rows as a count of fully ported APIs.

## 57. Included Fabric components

The following original components are nested with the foundation. Optional Meteor and Mod Menu remain separate.

| Component | Version |
|---|---|
| `fabric-api-base` | `1.0.5+4ebb5c083e` |
| `fabric-networking-api-v1` | `5.1.5+ae1e07683e` |
| `fabric-rendering-v1` | `16.2.7+f4ffd2e53e` |
| `fabric-lifecycle-events-v1` | `2.6.15+4ebb5c083e` |

## 58. Glossary

### API

Types and operations exposed for use by another program.

### SDK

A collection of development APIs and infrastructure for a particular kind of project.

### Addon

A mod extending another client or library through its interfaces.

### Artifact

A generated build output such as a JAR, source ZIP, or documentation bundle.

### Backport

Code adapted from a newer source baseline to an older target environment.

### Baseline

An exact source or binary revision used for comparison and compatibility.

### Bytecode

Compiled JVM instructions held in class files.

### Callback

An application-provided function invoked by a framework or event source.

### Client thread

Minecraft's client execution thread for the operations described here.

### Codec

A representation conversion contract for values or payloads.

### Configuration phase

The connection phase with payload registrations separate from play.

### Context

Actual native state/services supplied to a callback at its lifecycle stage.

### Custom payload

A mod-defined network value with an agreed ID and schema.

### Dependency

A component required by a code path or runtime capability.

### Diagnostic snapshot

Captured immutable metadata delivered independently of the original packet object.

### Dispatch

Delivery of an event to current observers.

### Entrypoint

A class discovered under a declared loader/integration metadata key.

### Foundation

The mapping-independent Java support module.

### Future

A representation of eventual completion, failure, or cancellation.

### HUD

The game heads-up display and its overlays.

### Idempotent

Repeat completion does not repeat the intended side effect.

### Immutable

Relevant contents do not change after creation.

### Integration bridge

An adapter to actual systems of an installed optional component.

### JAR

A Java archive distributing compiled code and resources.

### JDK

The Java development kit used for compilation and tooling.

### Ledger

A report tracking individual declarations and their backport classification.

### Lifecycle

Construction, activation, use, shutdown, and cleanup stages.

### Listener

An observer registered for events or value changes.

### Local command

A client-processed command rather than ordinary server chat.

### Mailbox

A queue handing items to a chosen draining thread.

### Mappings

Development names for Minecraft classes and members.

### Metadata profile

A version/dependency combination checked without a live game session.

### Mixin

A declared transformation connecting code to target game methods.

### Module

A managed client feature with its own ID, settings, and lifecycle.

### Namespace

An ownership prefix separating identifiers across projects.

### Observer

A listener whose observation contract does not imply traffic mutation.

### Owner thread

The thread on which confined resources must be managed.

### Packet

A structured Minecraft protocol message.

### Play phase

Normal in-world connection communication phase.

### Priority

A value determining observer order within a channel.

### Profiler

A tool aggregating selected timing measurements.

### Registration token

A revocable handle to one acquired registration.

### Registry

A mapping from IDs, names, or types to current owners.

### Remapping

Build adaptation of class/member references to runtime naming.

### Resource scope

An owner closing acquired resources in reverse order.

### Runtime scope

Resources attached to a module's current available runtime/world.

### Schema

The agreed representation and interpretation of custom payload data.

### Semantic review

Review of actual behavior rather than just signature similarity.

### Source set

A build grouping determining which source compiles into an output.

### Thread confinement

A requirement to manage selected operations on one thread.

### Tick

A client update step, distinct from an exact wall-clock duration or rendered frame.

### Upstream

The original project/reference from which work is adapted.

### Validation

Checking whether a value or operation meets its contract.

### Work budget

A cooperative bound on admitting more work in an interval.


## 59. Reports and original records

- `README.md`
- `NOTICE.md`
- `LICENSE`
- `docs/ARCHITECTURE.md`
- `docs/CLIENT-SDK.md`
- `docs/GUI.md`
- `docs/NETWORKING.md`
- `docs/DEPENDENCIES.md`
- `docs/BACKPORT.md`
- `docs/BUILD.md`
- `docs/RESEARCH.md`
- `docs/VERIFICATION.md`
- `docs/generated/meteor-api-api.json`
- `docs/generated/BACKPORT-26.3-LEDGER.csv`
- `docs/generated/BACKPORT-26.3-LEDGER.json`
- `docs/verification/build.log`
- `docs/verification/platform-checks.json`
- `docs/verification/metadata-profiles.json`
- `docs/verification/release-checks.json`

External addresses retained from the release's research notes:

- [Meteor Client](https://github.com/MeteorDevelopment/meteor-client)
- [Mod Menu API](https://github.com/TerraformersMC/ModMenu#java-api)
- [Fabric 1.21.11 networking](https://docs.fabricmc.net/1.21.11/develop/networking)
- [Common Networking](https://github.com/mysticdrew/common-networking)
- [PacketFixer](https://github.com/TonimatasDEV/PacketFixer)

These identify external projects; this documentation task did not revalidate current online pages or change the pinned baseline.

## 60. Documentation provenance

Written specifically for the Meteor API 0.2.0 project discussed in this conversation.
The English guide follows the active source, build files, metadata, examples, source inventory, and recorded verification reports.
The declaration appendix is a syntax-based inventory, not a claim that every public symbol is a stable SDK promise.
The HTML edition embeds the active source for offline reading and preserves original source notices/UI text.
No new runtime feature, live-game result, official affiliation, or complete 26.3 compatibility claim is introduced by this manual.
