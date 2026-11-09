# Changelog

## 0.1.2-beta

Requested beta label, developed from the supplied 0.2.0 source baseline.

- Add owned, namespaced native menu registration and discovery.
- Add client-owned child menu factories and read-only registry access.
- Add searchable panel rows, enum choices and conditionally disabled actions.
- Remove hidden rows before pagination and retain unfinished editor text.
- Separate readable setting labels from persisted machine IDs.
- Reject resources registered after client closure and settings added after module registration.
- Ignore stale native file-dialog completion after screen detach/resize/close.
- Retain the previous Action record shape and PanelScreen subclass constructor.
- Add menu/label/search regression checks, six metadata profiles, and a declared-member comparison tool.
- Keep three Gradle modules, target platform, independent mod identity and optional original Meteor bridge.

The requested numeric label is lower than 0.2.0 under SemVer. Addon dependency
metadata needs deliberate adjustment for this beta. See docs/BETA-0.1.2.md.

This entry does not claim a completed 26.3 backport or successful live-game testing.
