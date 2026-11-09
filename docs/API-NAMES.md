# Meteor API — curated names and purpose

Version: 0.1.2-beta. Existing package names and machine IDs are retained.
Readable presentation is supplied by labels and a concise catalog, not by cloning
an existing feature under several synonymous entry points.

| Task | Use | Notes |
|---|---|---|
| Independent entry point | `MeteorApi` | Shared keys/ticks/HUD/config/services/execution |
| Create a client | `Clients.create` | Unique owner, then categories/modules, then start |
| Define a feature | `ClientModule` | Runtime scope and hooks, independent of Meteor |
| Read registered categories | `Client.categories` | Immutable snapshot |
| Find a feature | `Client.findModule` | Optional module under the client's owner |
| Add a client-owned menu | `Client.menu` | Token owned by the client |
| Register a native menu | `Menus.register` | Namespaced ID and parent-aware factory |
| Open a registered menu | `Menus.open` | Client-thread operation with explicit boolean outcome |
| Inspect registered menus | `Menus.entries` | Immutable entry list |
| Generic menu catalog | `MenuRegistry<S>` | Java-only ownership model behind native wrapper |
| Build a screen | `Panels.create` | Native Screen, custom widgets still available |
| Search visible rows | `Panels.Builder.searchable` | Accent-insensitive label search before paging |
| Choose enum values | `Panels.Builder.choice` | Uses existing Setting validation/persistence |
| Enable/disable an action | Conditional `Panels.Builder.button` | Predicate plus normal action |
| Set presentation text | `Setting.label` | Display label only; stable ID remains |
| Construct typed settings | `Settings` | Bool, long, finite double, text, enum, file, string list |
| Save/load values | `ConfigStore` | UTF-8 properties and stable setting keys |
| Observe packets | `Packets` | Raw events or client-thread metadata snapshots |
| Query protocol types | `PacketUtils` | Real 1.21.11 catalog; missing aliases can return null |
| Mod-owned network messages | `Payloads` | Explicit phase/direction and compatible peer schemas |
| Draw HUD/GUI | `MeteorApi.hud`, `Canvas` | Native DrawContext remains exposed |
| Draw/extract world data | `WorldRendering` | Stage/context contracts still apply |
| Get real game state | `GameAccess`, `InputState` | Respect client-thread and world availability |
| Delay client work | `MeteorApi.scheduler` | Bounded tick queue |
| Background CPU/file work | `Tasks` | Bounded workers, owned cancellation |
| Measure work | `Profiler` | Aggregate timing samples |
| Admit bounded work | `WorkBudget` | Cannot preempt a running callback |
| Original Meteor systems | `MeteorClientApi` | Optional supported Meteor baseline only |
| Original Meteor registrations | `AddonRegistry` | Owner-scoped names and alias checks |

## Machine names versus visible text

| Stable ID/path | Example display label | What remains stable |
|---|---|---|
| `my-client:status/x` | Horizontal position / Vị trí ngang | Config key and registry ownership |
| `my-client:status/y` | Vertical position / Vị trí dọc | Config key and registry ownership |
| `_key` | Phím tắt (-1: tắt) | Internal binding setting path |
| `_modifiers` | Phím bổ trợ (mask) | Modifier mask representation |
| `meteor-api:open-key` | Phím mở menu | Existing API config key |
| `example-client:tools` | Công cụ ví dụ | Menu ownership ID |

Fallback label formatting uses the last path segment and readable separators.
It is not an identity rewrite. Explicit labels can be localized without duplicating
registration or losing stored values.

## Internal versus addon-facing names

`ui.internal.ListViewport` is presentation implementation code. Prefer `Panels`
when writing a native menu. `Packets.observe`, `Packets.drainClient`,
`MeteorApi.onTick`, and `WorldRendering.initialize` are installed-hook/bootstrap
boundaries. Their public syntax does not make them ordinary addon entry points.

`compat26` names selected adaptations of the supplied reference. It does not mean
every newer game API is implemented. See the backport ledger for actual status.
