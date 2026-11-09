# systems/config

Khai báo Java có cú pháp public/protected. Không bao gồm API kế thừa/tổng hợp bởi compiler; xem kiểm tra bytecode riêng.

## meteordevelopment.meteorclient.systems.config.Config

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/config/Config.java:26`

```java
public class Config extends System<Config>
```

## meteordevelopment.meteorclient.systems.config.Config.settings

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/config/Config.java:27`

```java
public final Settings settings = new Settings()
```

## meteordevelopment.meteorclient.systems.config.Config.customFont

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/config/Config.java:36`

```java
public final Setting<Boolean> customFont = sgVisual.add(new BoolSetting.Builder() .name("custom-font") .description("Use a custom font.") .defaultValue(true) .build() )
```

## meteordevelopment.meteorclient.systems.config.Config.font

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/config/Config.java:43`

```java
public final Setting<FontFace> font = sgVisual.add(new FontFaceSetting.Builder() .name("font") .description("Custom font to use.") .visible(customFont::get) .onChanged(Fonts::load) .build() )
```

## meteordevelopment.meteorclient.systems.config.Config.rainbowSpeed

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/config/Config.java:51`

```java
public final Setting<Double> rainbowSpeed = sgVisual.add(new DoubleSetting.Builder() .name("rainbow-speed") .description("The global rainbow speed.") .defaultValue(0.5) .range(0, 10) .sliderMax(5) .build() )
```

## meteordevelopment.meteorclient.systems.config.Config.titleScreenCredits

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/config/Config.java:60`

```java
public final Setting<Boolean> titleScreenCredits = sgVisual.add(new BoolSetting.Builder() .name("title-screen-credits") .description("Show Meteor credits on title screen") .defaultValue(true) .build() )
```

## meteordevelopment.meteorclient.systems.config.Config.titleScreenSplashes

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/config/Config.java:67`

```java
public final Setting<Boolean> titleScreenSplashes = sgVisual.add(new BoolSetting.Builder() .name("title-screen-splashes") .description("Show Meteor splash texts on title screen") .defaultValue(true) .build() )
```

## meteordevelopment.meteorclient.systems.config.Config.customWindowTitle

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/config/Config.java:74`

```java
public final Setting<Boolean> customWindowTitle = sgVisual.add(new BoolSetting.Builder() .name("custom-window-title") .description("Show custom text in the window title.") .defaultValue(false) .onModuleActivated(setting -> mc.updateWindowTitle()) .onChanged(value -> mc.updateWindowTitle()) .build() )
```

## meteordevelopment.meteorclient.systems.config.Config.customWindowTitleText

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/config/Config.java:83`

```java
public final Setting<String> customWindowTitleText = sgVisual.add(new StringSetting.Builder() .name("window-title-text") .description("The text it displays in the window title.") .visible(customWindowTitle::get) .defaultValue("Minecraft {mc_version} - {meteor.name} {meteor.version}") .onChanged(value -> mc.updateWindowTitle()) .build() )
```

## meteordevelopment.meteorclient.systems.config.Config.friendColor

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/config/Config.java:92`

```java
public final Setting<SettingColor> friendColor = sgVisual.add(new ColorSetting.Builder() .name("friend-color") .description("The color used to show friends.") .defaultValue(new SettingColor(0, 255, 180)) .build() )
```

## meteordevelopment.meteorclient.systems.config.Config.syncListSettingWidths

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/config/Config.java:99`

```java
public final Setting<Boolean> syncListSettingWidths = sgVisual.add(new BoolSetting.Builder() .name("sync-list-setting-widths") .description("Prevents the list setting screens from moving around as you add & remove elements.") .defaultValue(false) .build() )
```

## meteordevelopment.meteorclient.systems.config.Config.accountButtonAnchor

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/config/Config.java:106`

```java
public final Setting<ButtonPosition> accountButtonAnchor = sgVisual.add(new EnumSetting.Builder<ButtonPosition>() .name("accounts-button") .description("Controls the position and visibility of the accounts button in the multiplayer screen.") .defaultValue(ButtonPosition.TopRight) .build() )
```

## meteordevelopment.meteorclient.systems.config.Config.showAccountStatus

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/config/Config.java:113`

```java
public final Setting<Boolean> showAccountStatus = sgVisual.add(new BoolSetting.Builder() .name("account-status") .description("Shows information about the current account in the multiplayer screen.") .defaultValue(true) .build() )
```

## meteordevelopment.meteorclient.systems.config.Config.proxiesButtonAnchor

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/config/Config.java:120`

```java
public final Setting<ButtonPosition> proxiesButtonAnchor = sgVisual.add(new EnumSetting.Builder<ButtonPosition>() .name("proxies-button") .description("Controls the position and visibility of the proxies button in the multiplayer screen.") .defaultValue(ButtonPosition.TopRight) .build() )
```

## meteordevelopment.meteorclient.systems.config.Config.showProxiesStatus

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/config/Config.java:127`

```java
public final Setting<Boolean> showProxiesStatus = sgVisual.add(new BoolSetting.Builder() .name("proxy-status") .description("Shows information about the current proxy in the multiplayer screen.") .defaultValue(true) .build() )
```

## meteordevelopment.meteorclient.systems.config.Config.hiddenModules

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/config/Config.java:136`

```java
public final Setting<List<Module>> hiddenModules = sgModules.add(new ModuleListSetting.Builder() .name("hidden-modules") .description("Prevent these modules from being rendered as options in the clickgui.") .build() )
```

## meteordevelopment.meteorclient.systems.config.Config.moduleSearchCount

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/config/Config.java:142`

```java
public final Setting<Integer> moduleSearchCount = sgModules.add(new IntSetting.Builder() .name("module-search-count") .description("Amount of modules and settings to be shown in the module search bar.") .defaultValue(8) .min(1).sliderMax(12) .build() )
```

## meteordevelopment.meteorclient.systems.config.Config.moduleAliases

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/config/Config.java:150`

```java
public final Setting<Boolean> moduleAliases = sgModules.add(new BoolSetting.Builder() .name("search-module-aliases") .description("Whether or not module aliases will be used in the module search bar.") .defaultValue(true) .build() )
```

## meteordevelopment.meteorclient.systems.config.Config.prefix

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/config/Config.java:159`

```java
public final Setting<String> prefix = sgChat.add(new StringSetting.Builder() .name("prefix") .description("Prefix.") .defaultValue(".") .build() )
```

## meteordevelopment.meteorclient.systems.config.Config.chatFeedback

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/config/Config.java:166`

```java
public final Setting<Boolean> chatFeedback = sgChat.add(new BoolSetting.Builder() .name("chat-feedback") .description("Sends chat feedback when meteor performs certain actions.") .defaultValue(true) .build() )
```

## meteordevelopment.meteorclient.systems.config.Config.deleteChatFeedback

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/config/Config.java:173`

```java
public final Setting<Boolean> deleteChatFeedback = sgChat.add(new BoolSetting.Builder() .name("delete-chat-feedback") .description("Delete previous matching chat feedback to keep chat clear.") .visible(chatFeedback::get) .defaultValue(true) .build() )
```

## meteordevelopment.meteorclient.systems.config.Config.rotationHoldTicks

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/config/Config.java:183`

```java
public final Setting<Integer> rotationHoldTicks = sgMisc.add(new IntSetting.Builder() .name("rotation-hold") .description("Hold long to hold server side rotation when not sending any packets.") .defaultValue(4) .build() )
```

## meteordevelopment.meteorclient.systems.config.Config.useTeamColor

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/config/Config.java:190`

```java
public final Setting<Boolean> useTeamColor = sgMisc.add(new BoolSetting.Builder() .name("use-team-color") .description("Uses player's team color for rendering things like esp and tracers.") .defaultValue(true) .build() )
```

## meteordevelopment.meteorclient.systems.config.Config.dontShowAgainPrompts

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/config/Config.java:197`

```java
public List<String> dontShowAgainPrompts = new ArrayList<>()
```

## meteordevelopment.meteorclient.systems.config.Config.Config

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/config/Config.java:199`

```java
public Config()
```

## meteordevelopment.meteorclient.systems.config.Config.get

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/config/Config.java:203`

```java
public static Config get()
```

## meteordevelopment.meteorclient.systems.config.Config.toTag

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/config/Config.java:207`

```java
@Override public NbtCompound toTag()
```

## meteordevelopment.meteorclient.systems.config.Config.fromTag

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/config/Config.java:218`

```java
@Override public Config fromTag(NbtCompound tag)
```

## meteordevelopment.meteorclient.systems.config.Config.ButtonPosition

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/systems/config/Config.java:238`

```java
public enum ButtonPosition
```
