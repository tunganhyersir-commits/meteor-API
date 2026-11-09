# Meteor API notices

Meteor API is an independent derivative library, not an official Meteor Development release.
It uses source from Meteor Client: https://github.com/MeteorDevelopment/meteor-client
Copyright (c) Meteor Development. New and adapted project source is GPL-3.0-only; see LICENSE.

Minecraft 1.21.11 baseline: Meteor build 86, commit
`48030717dc0d4898a195a713fb048bf597fc5b54`.
The supplied Meteor 26.3 source is retained for comparison and selected backports.
Complete corresponding source and original notices are included under `upstream`.

The released `meteor-api` JAR does NOT bundle Meteor Client, Mod Menu, PacketFixer or
Common Networking classes. Their optional entrypoints/adapters have separate names.
Fabric API Base, Networking, Rendering and Lifecycle modules are included as separate, original nested
JARs under their Apache-2.0 notices. The foundation is included as its own nested JAR.

Optional Mod Menu 17.0.0 is distributed unchanged, with its original MIT notice and
its own original nested dependencies. Its supplied source is preserved in
`upstream/ModMenu-1.21.11`.

Third-party source archives (Mod Menu, PacketFixer, Common Networking, Networking
Projects and templates) retain their original licenses. Merely retaining them as
reference does not relicense them or mean all their features are compiled into Meteor API.

The old v0.1.0 design is retained under `history` as source/documentation only; it is
not part of the active build or the new installable API JAR.
