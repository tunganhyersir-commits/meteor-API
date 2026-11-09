# Ghi chú từ toàn bộ source Java đầu vào

Trích nguyên comment có từ khóa TODO/FIXME/HACK/XXX/NOTE/WARNING. Từ khóa NOTE có thể chỉ là tên nốt nhạc, không tự động là lỗi. Toàn bộ comment, kể cả không có từ khóa, được lưu trong `all-input-comments.json`.

## upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/commands/NotebotCommand.java:190

```java
// Bruteforce note level
```

## upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/ColorSettingScreen.java:460

```java
// NOTE: if Max is == 0, this divide would cause a crash
```

## upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/renderer/MeshRenderer.java:136

```java
// todo hope this is alright @minegame take a look please (lossy conversion from long to int)
```

## upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/CombatHud.java:49

```java
// TODO: Rewrite this to use the hud renderer system
```

## upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/CombatHud.java:235

```java
// TODO: These should probably be settings
```

## upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/Notebot.java:475

```java
// A map with noteblocks that have incorrect note level
```

## upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/Notebot.java:490

```java
// Add excess noteblocks for mapping process [note -> block pos]
```

## upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/Notebot.java:500

```java
// Map [note -> block pos]
```

## upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/Notebot.java:539

```java
/**
     * Set up a tune hits map which tells how many times player needs to
     * hit noteblock to obtain desired note level
     */
```

## upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/Notebot.java:940

```java
/**
     * Gets an NoteBlockInstrument from Note Map
     *
     * @param inst An instrument
     * @return A new instrument mapped by instrument given in parameters
     */
```

## upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/modules/render/Blur.java:219

```java
// todo ???
```

## upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/modules/render/marker/CuboidMarker.java:14

```java
// TODO: Add outline and more modes
```

## upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/modules/world/HighwayBuilder.java:471

```java
/* todo
        - separate digging and paving more effectively
        - separate walking forwards from the current state to speed up actions
        - scan one block behind you to ensure the highway is still valid
        - do something about god damn lava flowing in
     */
```

## upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/modules/world/HighwayBuilder.java:883

```java
// todo add a better raytrace check
```

## upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/modules/world/HighwayBuilder.java:1409

```java
// todo handle pulling ecs from shulker boxes so we can search through them
```

## upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/modules/world/HighwayBuilder.java:1464

```java
// todo when we add a digging only mode, make pickaxes fill all empty slots
```

## upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/modules/world/HighwayBuilder.java:1873

```java
// todo hold the best mining tool before performing the double mining checks so we dont double mine blocks unnecessarily
```

## upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/proxies/Proxy.java:88

```java
// todo
```

## upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/notebot/decoder/NBSSongDecoder.java:19

```java
/**
 * Utils for reading Note Block Studio data
 *
 */
```

## upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/notebot/decoder/NBSSongDecoder.java:27

```java
/**
     * Parses a Song from a Note Block Studio project file (.nbs)
     * @see Song
     * @param songFile .nbs file
     * @return Song object representing a Note Block Studio project
     */
```

## upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/notebot/decoder/NBSSongDecoder.java:39

```java
/**
     * Parses a Song from an InputStream and a Note Block Studio project file (.nbs)
     * @see Song
     * @param inputStream of a .nbs file
     * @return Song object representing the given .nbs file
     */
```

## upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/notebot/decoder/NBSSongDecoder.java:96

```java
// note block velocity
```

## upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/notebot/decoder/NBSSongDecoder.java:97

```java
// note panning, 0 is right in nbs format
```

## upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/notebot/decoder/NBSSongDecoder.java:98

```java
// note block pitch
```

## upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/notebot/decoder/NBSSongDecoder.java:103

```java
// Probably a custom instrument. Ignore this note
```

## upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/notebot/decoder/NBSSongDecoder.java:106

```java
/* note */
```

## upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/notebot/decoder/NBSSongDecoder.java:114

```java
/**
     * Sets a note at a tick in a song
     */
```

## upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/notebot/decoder/SongDecoders.java:28

```java
// TODO Maybe a midi decoder in the future
```

## upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/player/ChatUtils.java:105

```java
// Warning
```

## upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/utils/render/FontUtils.java:69

```java
/**
     * Core logic: interpret font data from a ByteBuffer.
     * NOTE: This preserves your original 5-byte header check exactly.
     */
```

## upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/commands/NotebotCommand.java:190

```java
// Bruteforce note level
```

## upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/ColorSettingScreen.java:463

```java
// NOTE: if Max is == 0, this divide would cause a crash
```

## upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/mixin/sodium/MeshVertexConsumerMixin.java:7

```java
// fixme this class will probably work when sodium updates
```

## upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/MeshBuilder.java:41

```java
// TODO: maybe dynamically choose index type
```

## upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/renderer/text/VanillaTextRenderer.java:18

```java
//todo remove in 26.3 update
```

## upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/accounts/types/TheAlteningAccount.java:26

```java
// todo figure this out
```

## upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/accounts/types/TheAlteningAccount.java:72

```java
// todo i will eat my sock if this actually works
```

## upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/CombatHud.java:49

```java
// TODO: Rewrite this to use the hud renderer system
```

## upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/CombatHud.java:235

```java
// TODO: These should probably be settings
```

## upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/hud/elements/keyboard/KeyboardHud.java:455

```java
//keys.add(l.key(Keybind.fromKey(KEY_WORLD_2), lShiftEnd, row4)); TODO: wtf is WORLD_2
```

## upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/Notebot.java:475

```java
// A map with noteblocks that have incorrect note level
```

## upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/Notebot.java:490

```java
// Add excess noteblocks for mapping process [note -> block pos]
```

## upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/Notebot.java:500

```java
// Map [note -> block pos]
```

## upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/Notebot.java:539

```java
/**
     * Set up a tune hits map which tells how many times player needs to
     * hit noteblock to obtain desired note level
     */
```

## upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/misc/Notebot.java:942

```java
/**
     * Gets an NoteBlockInstrument from Note Map
     *
     * @param inst An instrument
     * @return A new instrument mapped by instrument given in parameters
     */
```

## upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/render/marker/CuboidMarker.java:14

```java
// TODO: Add outline and more modes
```

## upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/HighwayBuilder.java:472

```java
/* todo
        - separate digging and paving more effectively
        - separate walking forwards from the current state to speed up actions
        - scan one block behind you to ensure the highway is still valid
        - do something about god damn lava flowing in
     */
```

## upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/HighwayBuilder.java:896

```java
// todo add a better raytrace check
```

## upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/HighwayBuilder.java:1420

```java
// todo handle pulling ecs from shulker boxes so we can search through them
```

## upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/HighwayBuilder.java:1475

```java
// todo when we add a digging only mode, make pickaxes fill all empty slots
```

## upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/modules/world/HighwayBuilder.java:1886

```java
// todo hold the best mining tool before performing the double mining checks so we dont double mine blocks unnecessarily
```

## upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/systems/proxies/Proxy.java:88

```java
// todo
```

## upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/entity/EntityUtils.java:116

```java
// todo is there a better way to replace BlockBehaviour.BlockStateBase#blocksMotion than just copy-pasting the method body?
```

## upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/notebot/decoder/NBSSongDecoder.java:19

```java
/**
 * Utils for reading Note Block Studio data
 *
 */
```

## upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/notebot/decoder/NBSSongDecoder.java:27

```java
/**
     * Parses a Song from a Note Block Studio project file (.nbs)
     *
     * @param songFile .nbs file
     * @return Song object representing a Note Block Studio project
     * @see Song
     */
```

## upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/notebot/decoder/NBSSongDecoder.java:40

```java
/**
     * Parses a Song from an InputStream and a Note Block Studio project file (.nbs)
     *
     * @param inputStream of a .nbs file
     * @return Song object representing the given .nbs file
     * @see Song
     */
```

## upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/notebot/decoder/NBSSongDecoder.java:98

```java
// note block velocity
```

## upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/notebot/decoder/NBSSongDecoder.java:99

```java
// note panning, 0 is right in nbs format
```

## upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/notebot/decoder/NBSSongDecoder.java:100

```java
// note block pitch
```

## upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/notebot/decoder/NBSSongDecoder.java:105

```java
// Probably a custom instrument. Ignore this note
```

## upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/notebot/decoder/NBSSongDecoder.java:108

```java
/* note */
```

## upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/notebot/decoder/NBSSongDecoder.java:116

```java
/**
     * Sets a note at a tick in a song
     */
```

## upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/notebot/decoder/SongDecoders.java:28

```java
// TODO Maybe a midi decoder in the future
```

## upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/player/ChatUtils.java:96

```java
// Warning
```

## upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/FontUtils.java:70

```java
/**
     * Core logic: interpret font data from a ByteBuffer.
     * NOTE: This preserves your original 5-byte header check exactly.
     */
```

## upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/utils/render/postprocess/PostProcessShader.java:89

```java
// todo what should usage be? not just here but everywhere else also
```
