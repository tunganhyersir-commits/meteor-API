# MeteorLib API notices

This distribution uses Meteor Client code and binaries from Meteor Development:
https://github.com/MeteorDevelopment/meteor-client

Active runtime: Minecraft 1.21.11, upstream build 86, commit
`48030717dc0d4898a195a713fb048bf597fc5b54`.
Original runtime SHA-256:
`93390cfdb1030e47f116357ba421c90a9b1ca4832b6551c2dec1ade5eeb42e71`.

The full matching source is in `upstream/meteor-1.21.11`. Its original notices,
copyright headers, license and build configuration have been retained.
MeteorLib changes and additional source are provided under GPL-3.0-only; see LICENSE.
This is an independent derivative project, not an official Meteor Development release.

The binary compatibility runtime intentionally retains the `meteor-client` mod id,
upstream version, original Java packages, mixins, assets, access widener, initialization
sequence and included third-party dependencies. Metadata declares the required
Fabric Loader minimum as 0.19.5 and identifies this derivative distribution.
The standalone JAR contains the MeteorLib adapter and foundation as nested JARs.

Third-party libraries, fonts, assets and nested JARs retain the upstream notices and
licenses shipped in their original artifacts. Inclusion here does not relabel their
licenses. See `docs/THIRD-PARTY.md` and the original nested JAR metadata.

The user-supplied addon template and Fabric template are retained under their
original CC0 license notices. The user-supplied 26.3 source is reference material,
excluded from all active Minecraft 1.21.11 compilation and packaging tasks.
