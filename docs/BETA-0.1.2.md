# Meteor API 0.1.2-beta — Client and Menu SDK

Open source, GPL-3.0-only. Target: Minecraft 1.21.11, Fabric Loader 0.19.5, Java 21.
Independent derivative work; Meteor-derived code retains upstream attribution.

## Release identity

This beta continues the supplied 0.2.0 source while using the requested release
label `0.1.2-beta`. It retains the `meteor-api` mod ID and existing package layout.
It is not a second mod to install beside 0.2.0. Keep one API JAR in the instance.

Fabric correctly compares `0.1.2-beta` below `0.2.0`. An addon declaring
`>=0.2.0` will therefore reject this beta even where the code it calls is retained.
Update that addon's dependency intentionally and rebuild it. For this beta:

```json
"depends": {
  "meteor-api": "0.1.2-beta",
  "minecraft": "1.21.11",
  "fabricloader": ">=0.19.5",
  "java": ">=21"
}
```

The accompanying example uses this dependency. No version comparison is spoofed.
Original Meteor Client remains optional, with supported bridge baseline
`1.21.11-86`; Mod Menu integration targets 17.0.0.

## Structure retained

| Module | Role |
|---|---|
| `foundation` | Java-only IDs, ownership, events, settings, lifecycle, menu catalog, tasks and performance |
| `api` | Minecraft client, screens, networking, rendering and optional integrations |
| `example-addon` | Compiling demonstrations of client modules, menus, settings and HUD |

Existing API packages and entry points remain. No replacement Meteor singleton,
duplicate implementation namespace, or independent cloned Mod Menu is introduced.

## What is new and why

| Addition | Problem solved |
|---|---|
| `MenuRegistry<S>` | Stable owned menu IDs and parent-aware factories, with testable Java-only bookkeeping |
| `Menus` | Minecraft screen registration, opening and discovery in the F8 menu directory |
| `Client.menu` | Client-owned child menus with automatic registration cleanup |
| `Panels.Builder.searchable` | Long client/module/settings lists become navigable |
| `Panels.Builder.choice` | Enum values have a concrete selector rather than requiring exact enum text |
| Conditional `button` overload | An action can clearly disable itself when required state is unavailable |
| `Setting.label` | UI language and readable text no longer need to be encoded into stable config IDs |
| `Client.findModule` / `categories` | Read access without exposing mutable registry maps |

`ListViewport` is an internal presentation model used by panels. It is not a new
client extension framework. No duplicate event bus, second config backend, or
collection of synonyms for existing API calls was added.

## Register a menu

```java
var registered = Menus.register(
    new NamespacedId("my-client", "tools"),
    "My Tools",
    parent -> Panels.create("My Tools")
        .searchable("Search tools...")
        .label("Client tools")
        .button("Print diagnostics", () -> MeteorApi.LOG.info("{}", Packets.statistics()))
        .build(parent));

if (!registered.success()) {
    MeteorApi.LOG.warn("Menu registration failed: {}", registered.message());
} else {
    scope.own(registered.value().orElseThrow());
}
```

This fragment assumes imports and an owner-thread `ResourceScope`.
Registration/opening through `Menus` requires the Minecraft client thread.
The returned token removes only the entry owned by that registration. A duplicate
ID reports a conflict; it does not overwrite a different addon's menu.

The factory receives the actual caller-supplied parent. Construct a fresh screen
with that parent. Factories should construct screens without calling `setScreen`
themselves or mutating a screen stack as a side effect.

```java
boolean opened = Menus.open(
    new NamespacedId("my-client", "tools"),
    MinecraftClient.getInstance().currentScreen);
```

A missing or failing factory produces false and a diagnostic for a failure.
This helper cannot roll back arbitrary side effects inside user code or a native
screen lifecycle method. It does not treat an unsuccessful open as success.

## Client-owned menu lifetimes

Register a client with `Clients.create`, add its categories/modules, then start it.
`start()` registers its main screen as `<owner>:main`. If startup cannot acquire
its key or menu registration, the registrations acquired by that attempt are closed.

Use `client.menu("tools", "Tools", factory)` for an additional menu. The client
owns that token, so closing the client removes it. You can also close the returned
token earlier; a later client cleanup remains idempotent.

The local path `main` is reserved by this helper for the client's main screen.
Choose another local path for child menus. Another addon can deliberately own an
ID first, in which case the attempted owner receives a conflict.

Clients cannot register command/HUD/menu resources after they have been closed.
Settings are collected before module registration; adding settings afterward is
rejected to avoid a GUI-only value that was never added to configuration storage.

## Generic catalog usage

`MenuRegistry<S>` contains no Minecraft class references. Its screen type is generic.
It supports `register`, `find`, `entries`, and `create` for a chosen screen type.
The Minecraft `Menus` wrapper uses the same catalog with `Screen`.

The catalog is owner-thread confined. Its entry snapshot is immutable. A token
checks the owner thread before consuming its one-shot close guard, so an accidental
wrong-thread close does not permanently prevent a later valid cleanup.

`create` returns empty for a missing ID. A null result, a factory returning the
identical parent, or a factory exception is surfaced as an error. Creating a view
does not unregister the menu or claim to manage its entire application lifecycle.

## Readable labels without config migration

```java
Setting<Long> x = Settings.longValue(
    new NamespacedId("my-client", "status/x"), 8, 0, 10000)
    .label("Horizontal position");
```

`x.id()` remains `my-client:status/x`; `x.label()` is the screen text.
The config key, event IDs, owner and serialized number remain unchanged.
A translated label can therefore load an existing config value under the same ID.

If no explicit label is supplied, the final ID path segment is formatted into a
simple fallback: `max-packets` becomes `Max packets`; `_key` becomes `Key`.
This formatting is not translation, identity normalization, or a registry key change.
Use an explicit label for polished UI wording and localization.

Set labels before building the relevant screen. Row text is part of that screen's
builder snapshot; changing a label later does not retroactively rewrite every
already-created row. Rebuild that view when changing its presentation language.

## Searchable panel

```java
Screen screen = Panels.create("Options")
    .searchable("Search settings...")
    .toggle("Enable overlay", enabled)
    .field("Horizontal position", x)
    .choice("Display style", style, DisplayStyle.class)
    .button("World action", GameAccess::inWorld, () -> doWorldAction())
    .build(parent);
```

The fragment assumes settings, enum, parent, imports and the action are defined.
See the complete example sources for a built demonstration.

Search is over row labels. It is case-insensitive and normalizes Unicode accents,
including Vietnamese `đ`. Query words can appear in different order in a label.
It is not a search over arbitrary private module state or packet payload contents.

Hidden rows are removed before search and pagination. They no longer reserve
empty page positions. A visibility change is checked on ticks and updates the
visible list. An empty result shows a clear message.

Text editor instances survive filtering and page changes. Invalid unfinished
input remains in the editor instead of silently resetting on the next rebuild.
Unfocused valid fields synchronize external changes from their setting; focused
edits and invalid drafts are preserved. Live rendering still needs game testing.

## Enum selectors and conditional actions

`choice(label, setting, enumClass)` uses the enum constants as a bounded choice list.
A click advances the value through that list using the setting's validation path.
The selected value remains in the ordinary setting and config pipeline.

`button(label, enabledPredicate, action)` displays a disabled native button when
its predicate is false. The predicate is checked again at action time. Predicate
exceptions disable that action and are logged rather than treated as permission
to execute. Conditions should be short and run on the client thread.

The original `Panels.Action(String, Runnable)` record keeps its two components.
`ConditionalAction` is a separate row, and `Choice` is another row type. Addons
using exhaustive source switches over the sealed `Panels.Row` type must handle
the new cases or use an appropriate default branch when recompiling.

## Native file-dialog lifetime

A panel records its screen attachment generation when a file dialog begins.
After the screen is detached, closed or resized, a completion from that older
attachment is ignored. It cannot commit a late file choice into that old view.
Pending controls avoid submitting repeated dialogs from the same attachment.

This does not forcibly terminate the operating system's native dialog. It protects
the panel's commit path. A standalone use of `FileDialogs` still owns its own
application cancellation/lifetime policy.

## Existing API facilities retained

The independent packet observers, typed custom payloads, HUD/world hooks, typed
settings, UTF-8 configuration, scheduler, bounded tasks, profiler, work budgets,
game access, input helpers and optional Meteor integrations remain present.

Packet observers remain observations. This release does not claim server-side
disconnection prevention or automatic packet rewriting. Custom payload peers must
still implement compatible schemas. Module authors must still coordinate changes
to shared game state.

No extra completed 26.3 backport coverage is claimed merely because this beta adds
its own SDK APIs. Pending/candidate/semantic-review entries remain in the ledger.

## Build and verification

```powershell
.\gradlew.bat :foundation:check :api:build :example-addon:build
py -3 tools\verify_release.py
```

Optional declared-member comparison against a local previous release:

```powershell
py -3 tools\check_api_compatibility.py --baseline C:\path\meteor-api-0.2.0.jar --candidate api\build\libs\meteor-api-0.1.2-beta.jar --output docs\verification\api-compatibility.json
```

The comparison checks declared public/protected types and members in API/foundation
bytecode. It does not prove complete semantic compatibility, exhaustive record
pattern compatibility, or satisfaction of an addon's version predicates.

See `VERIFICATION.md` for actual results and untested runtime behavior. Recorded
metadata profiles are not live game sessions. New UI/native behavior still needs
an actual Minecraft window and mod-combination validation.
