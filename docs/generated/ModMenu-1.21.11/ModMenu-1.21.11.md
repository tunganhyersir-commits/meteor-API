# ModMenu-1.21.11

Khai báo Java có cú pháp public/protected. Không bao gồm API kế thừa/tổng hợp bởi compiler; xem kiểm tra bytecode riêng.

## com.terraformersmc.modmenu.ModMenu

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/ModMenu.java:39`

```java
public class ModMenu implements ClientModInitializer
```

## com.terraformersmc.modmenu.ModMenu.MOD_ID

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/ModMenu.java:40`

```java
public static final String MOD_ID = "modmenu"
```

## com.terraformersmc.modmenu.ModMenu.GITHUB_REF

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/ModMenu.java:41`

```java
public static final String GITHUB_REF = "TerraformersMC/ModMenu"
```

## com.terraformersmc.modmenu.ModMenu.LOGGER

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/ModMenu.java:42`

```java
public static final Logger LOGGER = LoggerFactory.getLogger("Mod Menu")
```

## com.terraformersmc.modmenu.ModMenu.GSON

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/ModMenu.java:43`

```java
public static final Gson GSON
```

## com.terraformersmc.modmenu.ModMenu.GSON_MINIFIED

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/ModMenu.java:44`

```java
public static final Gson GSON_MINIFIED
```

## com.terraformersmc.modmenu.ModMenu.MODS

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/ModMenu.java:52`

```java
public static final Map<String, Mod> MODS = new ConcurrentHashMap<>()
```

## com.terraformersmc.modmenu.ModMenu.ROOT_MODS

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/ModMenu.java:53`

```java
public static final Map<String, Mod> ROOT_MODS = new ConcurrentHashMap<>()
```

## com.terraformersmc.modmenu.ModMenu.PARENT_MAP

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/ModMenu.java:54`

```java
public static final ListMultimap<Mod, Mod> PARENT_MAP = Multimaps.synchronizedListMultimap(LinkedListMultimap.create())
```

## com.terraformersmc.modmenu.ModMenu.RUNNING_QUILT

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/ModMenu.java:60`

```java
public static final boolean RUNNING_QUILT = FabricLoader.getInstance().isModLoaded("quilt_loader")
```

## com.terraformersmc.modmenu.ModMenu.DEV_ENVIRONMENT

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/ModMenu.java:61`

```java
public static final boolean DEV_ENVIRONMENT = FabricLoader.getInstance().isDevelopmentEnvironment()
```

## com.terraformersmc.modmenu.ModMenu.TEXT_PLACEHOLDER_COMPAT

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/ModMenu.java:62`

```java
public static final boolean TEXT_PLACEHOLDER_COMPAT = FabricLoader.getInstance().isModLoaded("placeholder-api")
```

## com.terraformersmc.modmenu.ModMenu.hasConfigScreen

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/ModMenu.java:64`

```java
public static boolean hasConfigScreen(String modId)
```

## com.terraformersmc.modmenu.ModMenu.getConfigScreen

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/ModMenu.java:68`

```java
public static @Nullable Screen getConfigScreen(String modId, Screen parent)
```

## com.terraformersmc.modmenu.ModMenu.onInitializeClient

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/ModMenu.java:92`

```java
@Override public void onInitializeClient()
```

## com.terraformersmc.modmenu.ModMenu.clearModCountCache

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/ModMenu.java:190`

```java
public static void clearModCountCache()
```

## com.terraformersmc.modmenu.ModMenu.checkForUpdates

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/ModMenu.java:194`

```java
public static void checkForUpdates()
```

## com.terraformersmc.modmenu.ModMenu.areModUpdatesAvailable

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/ModMenu.java:198`

```java
public static boolean areModUpdatesAvailable()
```

## com.terraformersmc.modmenu.ModMenu.getDisplayedModCount

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/ModMenu.java:220`

```java
public static String getDisplayedModCount()
```

## com.terraformersmc.modmenu.ModMenu.createModsButtonText

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/ModMenu.java:245`

```java
public static Text createModsButtonText(boolean title)
```

## com.terraformersmc.modmenu.ModMenuModMenuCompat

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/ModMenuModMenuCompat.java:14`

```java
public class ModMenuModMenuCompat implements ModMenuApi
```

## com.terraformersmc.modmenu.ModMenuModMenuCompat.getModConfigScreenFactory

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/ModMenuModMenuCompat.java:15`

```java
@Override public ConfigScreenFactory<?> getModConfigScreenFactory()
```

## com.terraformersmc.modmenu.ModMenuModMenuCompat.getProvidedConfigScreenFactories

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/ModMenuModMenuCompat.java:20`

```java
@Override public Map<String, ConfigScreenFactory<?>> getProvidedConfigScreenFactories()
```

## com.terraformersmc.modmenu.ModMenuModMenuCompat.getProvidedUpdateCheckers

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/ModMenuModMenuCompat.java:25`

```java
@Override public Map<String, UpdateChecker> getProvidedUpdateCheckers()
```

## com.terraformersmc.modmenu.TextPlaceholderApiCompat

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/TextPlaceholderApiCompat.java:5`

```java
public class TextPlaceholderApiCompat
```

## com.terraformersmc.modmenu.TextPlaceholderApiCompat.PARSER

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/TextPlaceholderApiCompat.java:6`

```java
public static final NodeParser PARSER = NodeParser.builder().quickText().build()
```

## com.terraformersmc.modmenu.api.ConfigScreenFactory

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/api/ConfigScreenFactory.java:5`

```java
@FunctionalInterface public interface ConfigScreenFactory<S extends Screen>
```

## com.terraformersmc.modmenu.api.ConfigScreenFactory.create

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/api/ConfigScreenFactory.java:7`

```java
S create(Screen parent)
```

## com.terraformersmc.modmenu.api.ModMenuApi

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/api/ModMenuApi.java:12`

```java
@SuppressWarnings("unused") public interface ModMenuApi
```

## com.terraformersmc.modmenu.api.ModMenuApi.createModsScreen

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/api/ModMenuApi.java:21`

```java
static Screen createModsScreen(Screen previous)
```

## com.terraformersmc.modmenu.api.ModMenuApi.createModsButtonText

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/api/ModMenuApi.java:31`

```java
static Text createModsButtonText()
```

## com.terraformersmc.modmenu.api.ModMenuApi.getModConfigScreenFactory

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/api/ModMenuApi.java:42`

```java
default ConfigScreenFactory<?> getModConfigScreenFactory()
```

## com.terraformersmc.modmenu.api.ModMenuApi.getUpdateChecker

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/api/ModMenuApi.java:52`

```java
default UpdateChecker getUpdateChecker()
```

## com.terraformersmc.modmenu.api.ModMenuApi.getProvidedConfigScreenFactories

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/api/ModMenuApi.java:68`

```java
default Map<String, ConfigScreenFactory<?>> getProvidedConfigScreenFactories()
```

## com.terraformersmc.modmenu.api.ModMenuApi.getProvidedUpdateCheckers

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/api/ModMenuApi.java:78`

```java
default Map<String, UpdateChecker> getProvidedUpdateCheckers()
```

## com.terraformersmc.modmenu.api.ModMenuApi.attachModpackBadges

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/api/ModMenuApi.java:89`

```java
default void attachModpackBadges(Consumer<String> consumer)
```

## com.terraformersmc.modmenu.api.UpdateChannel

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/api/UpdateChannel.java:8`

```java
public enum UpdateChannel
```

## com.terraformersmc.modmenu.api.UpdateChannel.getUserPreference

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/api/UpdateChannel.java:16`

```java
public static UpdateChannel getUserPreference()
```

## com.terraformersmc.modmenu.api.UpdateChecker

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/api/UpdateChecker.java:5`

```java
@SuppressWarnings("unused") public interface UpdateChecker
```

## com.terraformersmc.modmenu.api.UpdateChecker.checkForUpdates

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/api/UpdateChecker.java:15`

```java
@Nullable UpdateInfo checkForUpdates()
```

## com.terraformersmc.modmenu.api.UpdateInfo

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/api/UpdateInfo.java:6`

```java
@SuppressWarnings("unused") public interface UpdateInfo
```

## com.terraformersmc.modmenu.api.UpdateInfo.isUpdateAvailable

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/api/UpdateInfo.java:11`

```java
boolean isUpdateAvailable()
```

## com.terraformersmc.modmenu.api.UpdateInfo.getUpdateMessage

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/api/UpdateInfo.java:16`

```java
@Nullable default Text getUpdateMessage()
```

## com.terraformersmc.modmenu.api.UpdateInfo.getDownloadLink

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/api/UpdateInfo.java:24`

```java
String getDownloadLink()
```

## com.terraformersmc.modmenu.api.UpdateInfo.getUpdateChannel

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/api/UpdateInfo.java:29`

```java
UpdateChannel getUpdateChannel()
```

## com.terraformersmc.modmenu.config.FileOnlyConfig

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/config/FileOnlyConfig.java:8`

```java
@Retention(RetentionPolicy.RUNTIME) @Target(ElementType.FIELD) public @interface FileOnlyConfig
```

## com.terraformersmc.modmenu.config.ModMenuConfig

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/config/ModMenuConfig.java:19`

```java
public class ModMenuConfig
```

## com.terraformersmc.modmenu.config.ModMenuConfig.SORTING

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/config/ModMenuConfig.java:20`

```java
public static final EnumConfigOption<Sorting> SORTING = new EnumConfigOption<>("sorting", Sorting.ASCENDING)
```

## com.terraformersmc.modmenu.config.ModMenuConfig.COUNT_LIBRARIES

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/config/ModMenuConfig.java:21`

```java
public static final BooleanConfigOption COUNT_LIBRARIES = new BooleanConfigOption("count_libraries", true)
```

## com.terraformersmc.modmenu.config.ModMenuConfig.COMPACT_LIST

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/config/ModMenuConfig.java:22`

```java
public static final BooleanConfigOption COMPACT_LIST = new BooleanConfigOption("compact_list", false)
```

## com.terraformersmc.modmenu.config.ModMenuConfig.COUNT_CHILDREN

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/config/ModMenuConfig.java:23`

```java
public static final BooleanConfigOption COUNT_CHILDREN = new BooleanConfigOption("count_children", true)
```

## com.terraformersmc.modmenu.config.ModMenuConfig.MODS_BUTTON_STYLE

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/config/ModMenuConfig.java:24`

```java
public static final EnumConfigOption<TitleMenuButtonStyle> MODS_BUTTON_STYLE = new EnumConfigOption<>("mods_button_style", TitleMenuButtonStyle.CLASSIC)
```

## com.terraformersmc.modmenu.config.ModMenuConfig.GAME_MENU_BUTTON_STYLE

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/config/ModMenuConfig.java:25`

```java
public static final EnumConfigOption<GameMenuButtonStyle> GAME_MENU_BUTTON_STYLE = new EnumConfigOption<>("game_menu_button_style", GameMenuButtonStyle.REPLACE)
```

## com.terraformersmc.modmenu.config.ModMenuConfig.COUNT_HIDDEN_MODS

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/config/ModMenuConfig.java:26`

```java
public static final BooleanConfigOption COUNT_HIDDEN_MODS = new BooleanConfigOption("count_hidden_mods", true)
```

## com.terraformersmc.modmenu.config.ModMenuConfig.MOD_COUNT_LOCATION

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/config/ModMenuConfig.java:27`

```java
public static final EnumConfigOption<ModCountLocation> MOD_COUNT_LOCATION = new EnumConfigOption<>("mod_count_location", ModCountLocation.TITLE_SCREEN)
```

## com.terraformersmc.modmenu.config.ModMenuConfig.HIDE_MOD_LINKS

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/config/ModMenuConfig.java:28`

```java
public static final BooleanConfigOption HIDE_MOD_LINKS = new BooleanConfigOption("hide_mod_links", false)
```

## com.terraformersmc.modmenu.config.ModMenuConfig.SHOW_LIBRARIES

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/config/ModMenuConfig.java:29`

```java
public static final BooleanConfigOption SHOW_LIBRARIES = new BooleanConfigOption("show_libraries", false)
```

## com.terraformersmc.modmenu.config.ModMenuConfig.HIDE_MOD_LICENSE

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/config/ModMenuConfig.java:30`

```java
public static final BooleanConfigOption HIDE_MOD_LICENSE = new BooleanConfigOption("hide_mod_license", false)
```

## com.terraformersmc.modmenu.config.ModMenuConfig.HIDE_BADGES

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/config/ModMenuConfig.java:31`

```java
public static final BooleanConfigOption HIDE_BADGES = new BooleanConfigOption("hide_badges", false)
```

## com.terraformersmc.modmenu.config.ModMenuConfig.HIDE_MOD_CREDITS

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/config/ModMenuConfig.java:32`

```java
public static final BooleanConfigOption HIDE_MOD_CREDITS = new BooleanConfigOption("hide_mod_credits", false)
```

## com.terraformersmc.modmenu.config.ModMenuConfig.EASTER_EGGS

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/config/ModMenuConfig.java:33`

```java
public static final BooleanConfigOption EASTER_EGGS = new BooleanConfigOption("easter_eggs", true)
```

## com.terraformersmc.modmenu.config.ModMenuConfig.RANDOM_JAVA_COLORS

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/config/ModMenuConfig.java:34`

```java
public static final BooleanConfigOption RANDOM_JAVA_COLORS = new BooleanConfigOption("random_java_colors", false)
```

## com.terraformersmc.modmenu.config.ModMenuConfig.TRANSLATE_NAMES

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/config/ModMenuConfig.java:35`

```java
public static final BooleanConfigOption TRANSLATE_NAMES = new BooleanConfigOption("translate_names", true)
```

## com.terraformersmc.modmenu.config.ModMenuConfig.TRANSLATE_DESCRIPTIONS

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/config/ModMenuConfig.java:36`

```java
public static final BooleanConfigOption TRANSLATE_DESCRIPTIONS = new BooleanConfigOption("translate_descriptions", true)
```

## com.terraformersmc.modmenu.config.ModMenuConfig.UPDATE_CHECKER

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/config/ModMenuConfig.java:37`

```java
public static final BooleanConfigOption UPDATE_CHECKER = new BooleanConfigOption("update_checker", true)
```

## com.terraformersmc.modmenu.config.ModMenuConfig.BUTTON_UPDATE_BADGE

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/config/ModMenuConfig.java:38`

```java
public static final BooleanConfigOption BUTTON_UPDATE_BADGE = new BooleanConfigOption("button_update_badge", true)
```

## com.terraformersmc.modmenu.config.ModMenuConfig.UPDATE_CHANNEL

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/config/ModMenuConfig.java:39`

```java
public static final EnumConfigOption<UpdateChannel> UPDATE_CHANNEL = new EnumConfigOption<>("update_channel", UpdateChannel.RELEASE)
```

## com.terraformersmc.modmenu.config.ModMenuConfig.QUICK_CONFIGURE

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/config/ModMenuConfig.java:40`

```java
public static final BooleanConfigOption QUICK_CONFIGURE = new BooleanConfigOption("quick_configure", true)
```

## com.terraformersmc.modmenu.config.ModMenuConfig.MODIFY_TITLE_SCREEN

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/config/ModMenuConfig.java:42`

```java
@FileOnlyConfig public static final BooleanConfigOption MODIFY_TITLE_SCREEN = new BooleanConfigOption("modify_title_screen", true)
```

## com.terraformersmc.modmenu.config.ModMenuConfig.MODIFY_GAME_MENU

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/config/ModMenuConfig.java:44`

```java
@FileOnlyConfig public static final BooleanConfigOption MODIFY_GAME_MENU = new BooleanConfigOption("modify_game_menu", true)
```

## com.terraformersmc.modmenu.config.ModMenuConfig.HIDE_CONFIG_BUTTONS

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/config/ModMenuConfig.java:46`

```java
@FileOnlyConfig public static final BooleanConfigOption HIDE_CONFIG_BUTTONS = new BooleanConfigOption("hide_config_buttons", false)
```

## com.terraformersmc.modmenu.config.ModMenuConfig.CONFIG_MODE

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/config/ModMenuConfig.java:48`

```java
@FileOnlyConfig public static final BooleanConfigOption CONFIG_MODE = new BooleanConfigOption("config_mode", false)
```

## com.terraformersmc.modmenu.config.ModMenuConfig.DISABLE_DRAG_AND_DROP

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/config/ModMenuConfig.java:50`

```java
@FileOnlyConfig public static final BooleanConfigOption DISABLE_DRAG_AND_DROP = new BooleanConfigOption("disable_drag_and_drop", false)
```

## com.terraformersmc.modmenu.config.ModMenuConfig.HIDDEN_MODS

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/config/ModMenuConfig.java:52`

```java
@FileOnlyConfig public static final StringSetConfigOption HIDDEN_MODS = new StringSetConfigOption("hidden_mods", new HashSet<>())
```

## com.terraformersmc.modmenu.config.ModMenuConfig.HIDDEN_CONFIGS

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/config/ModMenuConfig.java:54`

```java
@FileOnlyConfig public static final StringSetConfigOption HIDDEN_CONFIGS = new StringSetConfigOption("hidden_configs", new HashSet<>())
```

## com.terraformersmc.modmenu.config.ModMenuConfig.DISABLE_UPDATE_CHECKER

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/config/ModMenuConfig.java:56`

```java
@FileOnlyConfig public static final StringSetConfigOption DISABLE_UPDATE_CHECKER = new StringSetConfigOption("disable_update_checker", new HashSet<>())
```

## com.terraformersmc.modmenu.config.ModMenuConfig.asOptions

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/config/ModMenuConfig.java:59`

```java
public static SimpleOption<?>[] asOptions()
```

## com.terraformersmc.modmenu.config.ModMenuConfig.Sorting

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/config/ModMenuConfig.java:76`

```java
public enum Sorting
```

## com.terraformersmc.modmenu.config.ModMenuConfig.Sorting.getComparator

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/config/ModMenuConfig.java:87`

```java
public Comparator<Mod> getComparator()
```

## com.terraformersmc.modmenu.config.ModMenuConfig.ModCountLocation

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/config/ModMenuConfig.java:92`

```java
public enum ModCountLocation
```

## com.terraformersmc.modmenu.config.ModMenuConfig.ModCountLocation.isOnTitleScreen

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/config/ModMenuConfig.java:105`

```java
public boolean isOnTitleScreen()
```

## com.terraformersmc.modmenu.config.ModMenuConfig.ModCountLocation.isOnModsButton

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/config/ModMenuConfig.java:109`

```java
public boolean isOnModsButton()
```

## com.terraformersmc.modmenu.config.ModMenuConfig.TitleMenuButtonStyle

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/config/ModMenuConfig.java:114`

```java
public enum TitleMenuButtonStyle
```

## com.terraformersmc.modmenu.config.ModMenuConfig.GameMenuButtonStyle

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/config/ModMenuConfig.java:121`

```java
public enum GameMenuButtonStyle
```

## com.terraformersmc.modmenu.config.ModMenuConfigManager

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/config/ModMenuConfigManager.java:24`

```java
public class ModMenuConfigManager
```

## com.terraformersmc.modmenu.config.ModMenuConfigManager.initializeConfig

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/config/ModMenuConfigManager.java:33`

```java
public static void initializeConfig()
```

## com.terraformersmc.modmenu.config.ModMenuConfigManager.save

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/config/ModMenuConfigManager.java:98`

```java
@SuppressWarnings("unchecked") public static void save()
```

## com.terraformersmc.modmenu.config.option.BooleanConfigOption

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/config/option/BooleanConfigOption.java:8`

```java
public class BooleanConfigOption implements OptionConvertible
```

## com.terraformersmc.modmenu.config.option.BooleanConfigOption.BooleanConfigOption

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/config/option/BooleanConfigOption.java:14`

```java
public BooleanConfigOption(String key, boolean defaultValue, String enabledKey, String disabledKey)
```

## com.terraformersmc.modmenu.config.option.BooleanConfigOption.BooleanConfigOption

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/config/option/BooleanConfigOption.java:23`

```java
public BooleanConfigOption(String key, boolean defaultValue)
```

## com.terraformersmc.modmenu.config.option.BooleanConfigOption.getKey

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/config/option/BooleanConfigOption.java:27`

```java
public String getKey()
```

## com.terraformersmc.modmenu.config.option.BooleanConfigOption.getValue

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/config/option/BooleanConfigOption.java:31`

```java
public boolean getValue()
```

## com.terraformersmc.modmenu.config.option.BooleanConfigOption.setValue

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/config/option/BooleanConfigOption.java:35`

```java
public void setValue(boolean value)
```

## com.terraformersmc.modmenu.config.option.BooleanConfigOption.toggleValue

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/config/option/BooleanConfigOption.java:39`

```java
public void toggleValue()
```

## com.terraformersmc.modmenu.config.option.BooleanConfigOption.getDefaultValue

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/config/option/BooleanConfigOption.java:43`

```java
public boolean getDefaultValue()
```

## com.terraformersmc.modmenu.config.option.BooleanConfigOption.getButtonText

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/config/option/BooleanConfigOption.java:47`

```java
public Text getButtonText()
```

## com.terraformersmc.modmenu.config.option.BooleanConfigOption.asOption

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/config/option/BooleanConfigOption.java:51`

```java
@Override public SimpleOption<Boolean> asOption()
```

## com.terraformersmc.modmenu.config.option.ConfigOptionStorage

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/config/option/ConfigOptionStorage.java:7`

```java
public class ConfigOptionStorage
```

## com.terraformersmc.modmenu.config.option.ConfigOptionStorage.setStringSet

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/config/option/ConfigOptionStorage.java:12`

```java
public static void setStringSet(String key, Set<String> value)
```

## com.terraformersmc.modmenu.config.option.ConfigOptionStorage.getStringSet

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/config/option/ConfigOptionStorage.java:16`

```java
public static Set<String> getStringSet(String key)
```

## com.terraformersmc.modmenu.config.option.ConfigOptionStorage.setBoolean

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/config/option/ConfigOptionStorage.java:20`

```java
public static void setBoolean(String key, boolean value)
```

## com.terraformersmc.modmenu.config.option.ConfigOptionStorage.toggleBoolean

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/config/option/ConfigOptionStorage.java:24`

```java
public static void toggleBoolean(String key)
```

## com.terraformersmc.modmenu.config.option.ConfigOptionStorage.getBoolean

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/config/option/ConfigOptionStorage.java:28`

```java
public static boolean getBoolean(String key)
```

## com.terraformersmc.modmenu.config.option.ConfigOptionStorage.getEnum

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/config/option/ConfigOptionStorage.java:32`

```java
@SuppressWarnings("unchecked") public static <E extends Enum<E>> E getEnum(String key, Class<E> typeClass)
```

## com.terraformersmc.modmenu.config.option.ConfigOptionStorage.getEnumTypeless

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/config/option/ConfigOptionStorage.java:37`

```java
public static Enum<?> getEnumTypeless(String key, Class<Enum<?>> typeClass)
```

## com.terraformersmc.modmenu.config.option.ConfigOptionStorage.setEnum

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/config/option/ConfigOptionStorage.java:41`

```java
public static <E extends Enum<E>> void setEnum(String key, E value)
```

## com.terraformersmc.modmenu.config.option.ConfigOptionStorage.setEnumTypeless

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/config/option/ConfigOptionStorage.java:45`

```java
public static void setEnumTypeless(String key, Enum<?> value)
```

## com.terraformersmc.modmenu.config.option.ConfigOptionStorage.cycleEnum

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/config/option/ConfigOptionStorage.java:49`

```java
public static <E extends Enum<E>> E cycleEnum(String key, Class<E> typeClass)
```

## com.terraformersmc.modmenu.config.option.ConfigOptionStorage.cycleEnum

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/config/option/ConfigOptionStorage.java:53`

```java
public static <E extends Enum<E>> E cycleEnum(String key, Class<E> typeClass, int amount)
```

## com.terraformersmc.modmenu.config.option.EnumConfigOption

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/config/option/EnumConfigOption.java:12`

```java
public class EnumConfigOption<E extends Enum<E>> implements OptionConvertible
```

## com.terraformersmc.modmenu.config.option.EnumConfigOption.EnumConfigOption

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/config/option/EnumConfigOption.java:17`

```java
public EnumConfigOption(String key, E defaultValue)
```

## com.terraformersmc.modmenu.config.option.EnumConfigOption.getKey

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/config/option/EnumConfigOption.java:25`

```java
public String getKey()
```

## com.terraformersmc.modmenu.config.option.EnumConfigOption.getValue

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/config/option/EnumConfigOption.java:29`

```java
public E getValue()
```

## com.terraformersmc.modmenu.config.option.EnumConfigOption.setValue

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/config/option/EnumConfigOption.java:33`

```java
public void setValue(E value)
```

## com.terraformersmc.modmenu.config.option.EnumConfigOption.cycleValue

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/config/option/EnumConfigOption.java:37`

```java
public void cycleValue()
```

## com.terraformersmc.modmenu.config.option.EnumConfigOption.cycleValue

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/config/option/EnumConfigOption.java:41`

```java
public void cycleValue(int amount)
```

## com.terraformersmc.modmenu.config.option.EnumConfigOption.getDefaultValue

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/config/option/EnumConfigOption.java:45`

```java
public E getDefaultValue()
```

## com.terraformersmc.modmenu.config.option.EnumConfigOption.getButtonText

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/config/option/EnumConfigOption.java:53`

```java
public Text getButtonText()
```

## com.terraformersmc.modmenu.config.option.EnumConfigOption.asOption

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/config/option/EnumConfigOption.java:57`

```java
@Override public SimpleOption<E> asOption()
```

## com.terraformersmc.modmenu.config.option.OptionConvertible

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/config/option/OptionConvertible.java:5`

```java
public interface OptionConvertible
```

## com.terraformersmc.modmenu.config.option.OptionConvertible.asOption

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/config/option/OptionConvertible.java:6`

```java
SimpleOption<?> asOption()
```

## com.terraformersmc.modmenu.config.option.StringSetConfigOption

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/config/option/StringSetConfigOption.java:8`

```java
public class StringSetConfigOption
```

## com.terraformersmc.modmenu.config.option.StringSetConfigOption.StringSetConfigOption

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/config/option/StringSetConfigOption.java:12`

```java
public StringSetConfigOption(String key, Set<String> defaultValue)
```

## com.terraformersmc.modmenu.config.option.StringSetConfigOption.getKey

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/config/option/StringSetConfigOption.java:20`

```java
public String getKey()
```

## com.terraformersmc.modmenu.config.option.StringSetConfigOption.getValue

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/config/option/StringSetConfigOption.java:24`

```java
public Set<String> getValue()
```

## com.terraformersmc.modmenu.config.option.StringSetConfigOption.setValue

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/config/option/StringSetConfigOption.java:28`

```java
public void setValue(Set<String> value)
```

## com.terraformersmc.modmenu.config.option.StringSetConfigOption.getMessage

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/config/option/StringSetConfigOption.java:32`

```java
public Text getMessage()
```

## com.terraformersmc.modmenu.config.option.StringSetConfigOption.getDefaultValue

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/config/option/StringSetConfigOption.java:36`

```java
public Set<String> getDefaultValue()
```

## com.terraformersmc.modmenu.event.ModMenuEventHandler

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/event/ModMenuEventHandler.java:32`

```java
public class ModMenuEventHandler
```

## com.terraformersmc.modmenu.event.ModMenuEventHandler.MODS_BUTTON_TEXTURE

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/event/ModMenuEventHandler.java:33`

```java
public static final Identifier MODS_BUTTON_TEXTURE = Identifier.of(ModMenu.MOD_ID, "textures/gui/mods_button.png")
```

## com.terraformersmc.modmenu.event.ModMenuEventHandler.register

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/event/ModMenuEventHandler.java:36`

```java
public static void register()
```

## com.terraformersmc.modmenu.event.ModMenuEventHandler.afterScreenInit

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/event/ModMenuEventHandler.java:47`

```java
public static void afterScreenInit(MinecraftClient client, Screen screen, int scaledWidth, int scaledHeight)
```

## com.terraformersmc.modmenu.event.ModMenuEventHandler.buttonHasText

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/event/ModMenuEventHandler.java:143`

```java
public static boolean buttonHasText(Widget widget, String... translationKeys)
```

## com.terraformersmc.modmenu.event.ModMenuEventHandler.buttonHasTooltip

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/event/ModMenuEventHandler.java:153`

```java
public static boolean buttonHasTooltip(Widget widget, Tooltip tooltip)
```

## com.terraformersmc.modmenu.event.ModMenuEventHandler.shiftButtons

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/event/ModMenuEventHandler.java:161`

```java
public static void shiftButtons(Widget widget, boolean shiftUp, int spacing)
```

## com.terraformersmc.modmenu.gui.ModMenuOptionsScreen

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/gui/ModMenuOptionsScreen.java:11`

```java
public class ModMenuOptionsScreen extends GameOptionsScreen
```

## com.terraformersmc.modmenu.gui.ModMenuOptionsScreen.ModMenuOptionsScreen

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/gui/ModMenuOptionsScreen.java:12`

```java
public ModMenuOptionsScreen(Screen previous)
```

## com.terraformersmc.modmenu.gui.ModMenuOptionsScreen.addOptions

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/gui/ModMenuOptionsScreen.java:16`

```java
@Override protected void addOptions()
```

## com.terraformersmc.modmenu.gui.ModMenuOptionsScreen.removed

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/gui/ModMenuOptionsScreen.java:23`

```java
@Override public void removed()
```

## com.terraformersmc.modmenu.gui.ModsScreen

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/gui/ModsScreen.java:51`

```java
public class ModsScreen extends Screen
```

## com.terraformersmc.modmenu.gui.ModsScreen.showModChildren

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/gui/ModsScreen.java:70`

```java
public final Set<String> showModChildren = new HashSet<>()
```

## com.terraformersmc.modmenu.gui.ModsScreen.modHasConfigScreen

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/gui/ModsScreen.java:82`

```java
public final Map<String, Boolean> modHasConfigScreen = new HashMap<>()
```

## com.terraformersmc.modmenu.gui.ModsScreen.modScreenErrors

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/gui/ModsScreen.java:83`

```java
public final Map<String, Throwable> modScreenErrors = new HashMap<>()
```

## com.terraformersmc.modmenu.gui.ModsScreen.ModsScreen

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/gui/ModsScreen.java:88`

```java
public ModsScreen(Screen previousScreen)
```

## com.terraformersmc.modmenu.gui.ModsScreen.init

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/gui/ModsScreen.java:93`

```java
@Override protected void init()
```

## com.terraformersmc.modmenu.gui.ModsScreen.keyPressed

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/gui/ModsScreen.java:271`

```java
@Override public boolean keyPressed(KeyInput input)
```

## com.terraformersmc.modmenu.gui.ModsScreen.charTyped

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/gui/ModsScreen.java:276`

```java
@Override public boolean charTyped(CharInput input)
```

## com.terraformersmc.modmenu.gui.ModsScreen.render

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/gui/ModsScreen.java:281`

```java
@Override public void render(DrawContext drawContext, int mouseX, int mouseY, float delta)
```

## com.terraformersmc.modmenu.gui.ModsScreen.close

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/gui/ModsScreen.java:497`

```java
@Override public void close()
```

## com.terraformersmc.modmenu.gui.ModsScreen.getSelectedEntry

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/gui/ModsScreen.java:509`

```java
public ModListEntry getSelectedEntry()
```

## com.terraformersmc.modmenu.gui.ModsScreen.updateSelectedEntry

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/gui/ModsScreen.java:513`

```java
public void updateSelectedEntry(ModListEntry entry)
```

## com.terraformersmc.modmenu.gui.ModsScreen.updateScrollPercent

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/gui/ModsScreen.java:547`

```java
public void updateScrollPercent(double scrollPercent)
```

## com.terraformersmc.modmenu.gui.ModsScreen.getSearchInput

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/gui/ModsScreen.java:551`

```java
public String getSearchInput()
```

## com.terraformersmc.modmenu.gui.ModsScreen.onFilesDropped

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/gui/ModsScreen.java:568`

```java
@Override public void onFilesDropped(List<Path> paths)
```

## com.terraformersmc.modmenu.gui.ModsScreen.getModHasConfigScreen

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/gui/ModsScreen.java:630`

```java
public boolean getModHasConfigScreen(String modId)
```

## com.terraformersmc.modmenu.gui.ModsScreen.safelyOpenConfigScreen

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/gui/ModsScreen.java:638`

```java
public void safelyOpenConfigScreen(String modId)
```

## com.terraformersmc.modmenu.gui.widget.DescriptionListWidget

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/gui/widget/DescriptionListWidget.java:27`

```java
public class DescriptionListWidget extends EntryListWidget<DescriptionListWidget.DescriptionEntry>
```

## com.terraformersmc.modmenu.gui.widget.DescriptionListWidget.DescriptionListWidget

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/gui/widget/DescriptionListWidget.java:42`

```java
public DescriptionListWidget( MinecraftClient client, int width, int height, int y, int itemHeight, DescriptionListWidget copyFrom, ModsScreen parent )
```

## com.terraformersmc.modmenu.gui.widget.DescriptionListWidget.getSelectedOrNull

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/gui/widget/DescriptionListWidget.java:65`

```java
@Override public DescriptionEntry getSelectedOrNull()
```

## com.terraformersmc.modmenu.gui.widget.DescriptionListWidget.getRowWidth

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/gui/widget/DescriptionListWidget.java:70`

```java
@Override public int getRowWidth()
```

## com.terraformersmc.modmenu.gui.widget.DescriptionListWidget.getScrollbarX

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/gui/widget/DescriptionListWidget.java:75`

```java
@Override protected int getScrollbarX()
```

## com.terraformersmc.modmenu.gui.widget.DescriptionListWidget.appendClickableNarrations

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/gui/widget/DescriptionListWidget.java:80`

```java
@Override public void appendClickableNarrations(NarrationMessageBuilder builder)
```

## com.terraformersmc.modmenu.gui.widget.DescriptionListWidget.updateSelectedMod

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/gui/widget/DescriptionListWidget.java:265`

```java
public void updateSelectedMod(Mod mod)
```

## com.terraformersmc.modmenu.gui.widget.DescriptionListWidget.renderList

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/gui/widget/DescriptionListWidget.java:272`

```java
@Override public void renderList(DrawContext drawContext, int mouseX, int mouseY, float delta)
```

## com.terraformersmc.modmenu.gui.widget.DescriptionListWidget.DescriptionEntry

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/gui/widget/DescriptionListWidget.java:289`

```java
protected class DescriptionEntry extends ElementListWidget.Entry<DescriptionEntry>
```

## com.terraformersmc.modmenu.gui.widget.DescriptionListWidget.DescriptionEntry.text

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/gui/widget/DescriptionListWidget.java:290`

```java
protected OrderedText text
```

## com.terraformersmc.modmenu.gui.widget.DescriptionListWidget.DescriptionEntry.indent

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/gui/widget/DescriptionListWidget.java:291`

```java
protected int indent
```

## com.terraformersmc.modmenu.gui.widget.DescriptionListWidget.DescriptionEntry.updateTextEntry

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/gui/widget/DescriptionListWidget.java:292`

```java
public boolean updateTextEntry = false
```

## com.terraformersmc.modmenu.gui.widget.DescriptionListWidget.DescriptionEntry.DescriptionEntry

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/gui/widget/DescriptionListWidget.java:294`

```java
public DescriptionEntry(OrderedText text, int indent)
```

## com.terraformersmc.modmenu.gui.widget.DescriptionListWidget.DescriptionEntry.DescriptionEntry

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/gui/widget/DescriptionListWidget.java:299`

```java
public DescriptionEntry(OrderedText text)
```

## com.terraformersmc.modmenu.gui.widget.DescriptionListWidget.DescriptionEntry.setUpdateTextEntry

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/gui/widget/DescriptionListWidget.java:303`

```java
public DescriptionEntry setUpdateTextEntry()
```

## com.terraformersmc.modmenu.gui.widget.DescriptionListWidget.DescriptionEntry.render

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/gui/widget/DescriptionListWidget.java:308`

```java
@Override public void render( DrawContext drawContext, int mouseX, int mouseY, boolean isSelected, float delta )
```

## com.terraformersmc.modmenu.gui.widget.DescriptionListWidget.DescriptionEntry.isMouseOver

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/gui/widget/DescriptionListWidget.java:326`

```java
@Override public boolean isMouseOver(double mouseX, double mouseY)
```

## com.terraformersmc.modmenu.gui.widget.DescriptionListWidget.DescriptionEntry.children

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/gui/widget/DescriptionListWidget.java:343`

```java
@Override public List<? extends Element> children()
```

## com.terraformersmc.modmenu.gui.widget.DescriptionListWidget.DescriptionEntry.selectableChildren

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/gui/widget/DescriptionListWidget.java:348`

```java
@Override public List<? extends Selectable> selectableChildren()
```

## com.terraformersmc.modmenu.gui.widget.DescriptionListWidget.MojangCreditsEntry

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/gui/widget/DescriptionListWidget.java:354`

```java
protected class MojangCreditsEntry extends DescriptionEntry
```

## com.terraformersmc.modmenu.gui.widget.DescriptionListWidget.MojangCreditsEntry.MojangCreditsEntry

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/gui/widget/DescriptionListWidget.java:355`

```java
public MojangCreditsEntry(OrderedText text)
```

## com.terraformersmc.modmenu.gui.widget.DescriptionListWidget.MojangCreditsEntry.mouseClicked

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/gui/widget/DescriptionListWidget.java:359`

```java
@Override public boolean mouseClicked(Click click, boolean doubleClick)
```

## com.terraformersmc.modmenu.gui.widget.DescriptionListWidget.MojangCreditsEntry.MinecraftCredits.MinecraftCredits

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/gui/widget/DescriptionListWidget.java:369`

```java
public MinecraftCredits()
```

## com.terraformersmc.modmenu.gui.widget.DescriptionListWidget.LinkEntry

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/gui/widget/DescriptionListWidget.java:375`

```java
protected class LinkEntry extends DescriptionEntry
```

## com.terraformersmc.modmenu.gui.widget.DescriptionListWidget.LinkEntry.LinkEntry

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/gui/widget/DescriptionListWidget.java:378`

```java
public LinkEntry(OrderedText text, String link, int indent)
```

## com.terraformersmc.modmenu.gui.widget.DescriptionListWidget.LinkEntry.LinkEntry

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/gui/widget/DescriptionListWidget.java:383`

```java
public LinkEntry(OrderedText text, String link)
```

## com.terraformersmc.modmenu.gui.widget.DescriptionListWidget.LinkEntry.mouseClicked

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/gui/widget/DescriptionListWidget.java:387`

```java
@Override public boolean mouseClicked(Click click, boolean doubleClick)
```

## com.terraformersmc.modmenu.gui.widget.DescriptionListWidget.MailableContactEntry

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/gui/widget/DescriptionListWidget.java:402`

```java
protected class MailableContactEntry extends DescriptionEntry
```

## com.terraformersmc.modmenu.gui.widget.DescriptionListWidget.MailableContactEntry.MailableContactEntry

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/gui/widget/DescriptionListWidget.java:405`

```java
public MailableContactEntry(OrderedText text, String email, int indent)
```

## com.terraformersmc.modmenu.gui.widget.DescriptionListWidget.MailableContactEntry.MailableContactEntry

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/gui/widget/DescriptionListWidget.java:410`

```java
public MailableContactEntry(OrderedText text, String link)
```

## com.terraformersmc.modmenu.gui.widget.DescriptionListWidget.MailableContactEntry.render

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/gui/widget/DescriptionListWidget.java:414`

```java
@Override public void render(DrawContext drawContext, int mouseX, int mouseY, boolean isSelected, float delta)
```

## com.terraformersmc.modmenu.gui.widget.DescriptionListWidget.MailableContactEntry.mouseClicked

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/gui/widget/DescriptionListWidget.java:420`

```java
@Override public boolean mouseClicked(Click click, boolean doubled)
```

## com.terraformersmc.modmenu.gui.widget.LegacyTexturedButtonWidget

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/gui/widget/LegacyTexturedButtonWidget.java:9`

```java
public class LegacyTexturedButtonWidget extends TexturedButtonWidget
```

## com.terraformersmc.modmenu.gui.widget.LegacyTexturedButtonWidget.LegacyTexturedButtonWidget

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/gui/widget/LegacyTexturedButtonWidget.java:19`

```java
public LegacyTexturedButtonWidget( int x, int y, int width, int height, int u, int v, int hoveredVOffset, Identifier texture, int textureWidth, int textureHeight, ButtonWidget.PressAction pressAction, net.minecraft.text.Text message )
```

## com.terraformersmc.modmenu.gui.widget.LegacyTexturedButtonWidget.drawIcon

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/gui/widget/LegacyTexturedButtonWidget.java:45`

```java
@Override public void drawIcon(DrawContext context, int mouseX, int mouseY, float deltaTicks)
```

## com.terraformersmc.modmenu.gui.widget.LegacyTexturedButtonWidget.legacyTexturedBuilder

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/gui/widget/LegacyTexturedButtonWidget.java:68`

```java
public static Builder legacyTexturedBuilder(net.minecraft.text.Text message, ButtonWidget.PressAction onPress)
```

## com.terraformersmc.modmenu.gui.widget.LegacyTexturedButtonWidget.Builder

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/gui/widget/LegacyTexturedButtonWidget.java:72`

```java
public static class Builder
```

## com.terraformersmc.modmenu.gui.widget.LegacyTexturedButtonWidget.Builder.Builder

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/gui/widget/LegacyTexturedButtonWidget.java:91`

```java
public Builder(net.minecraft.text.Text message, PressAction onPress)
```

## com.terraformersmc.modmenu.gui.widget.LegacyTexturedButtonWidget.Builder.position

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/gui/widget/LegacyTexturedButtonWidget.java:96`

```java
public Builder position(int x, int y)
```

## com.terraformersmc.modmenu.gui.widget.LegacyTexturedButtonWidget.Builder.size

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/gui/widget/LegacyTexturedButtonWidget.java:102`

```java
public Builder size(int width, int height)
```

## com.terraformersmc.modmenu.gui.widget.LegacyTexturedButtonWidget.Builder.uv

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/gui/widget/LegacyTexturedButtonWidget.java:108`

```java
public Builder uv(int u, int v, int hoveredVOffset)
```

## com.terraformersmc.modmenu.gui.widget.LegacyTexturedButtonWidget.Builder.texture

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/gui/widget/LegacyTexturedButtonWidget.java:115`

```java
public Builder texture(Identifier texture, int textureWidth, int textureHeight)
```

## com.terraformersmc.modmenu.gui.widget.LegacyTexturedButtonWidget.Builder.build

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/gui/widget/LegacyTexturedButtonWidget.java:122`

```java
public LegacyTexturedButtonWidget build()
```

## com.terraformersmc.modmenu.gui.widget.ModListWidget

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/gui/widget/ModListWidget.java:26`

```java
public class ModListWidget extends AlwaysSelectedEntryListWidget<ModListEntry> implements AutoCloseable
```

## com.terraformersmc.modmenu.gui.widget.ModListWidget.DEBUG

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/gui/widget/ModListWidget.java:27`

```java
public static final boolean DEBUG = Boolean.getBoolean("modmenu.debug")
```

## com.terraformersmc.modmenu.gui.widget.ModListWidget.ModListWidget

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/gui/widget/ModListWidget.java:36`

```java
public ModListWidget( MinecraftClient client, int width, int height, int y, int itemHeight, ModListWidget list, ModsScreen parent )
```

## com.terraformersmc.modmenu.gui.widget.ModListWidget.setScrollY

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/gui/widget/ModListWidget.java:53`

```java
@Override public void setScrollY(double amount)
```

## com.terraformersmc.modmenu.gui.widget.ModListWidget.isFocused

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/gui/widget/ModListWidget.java:64`

```java
@Override public boolean isFocused()
```

## com.terraformersmc.modmenu.gui.widget.ModListWidget.select

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/gui/widget/ModListWidget.java:69`

```java
public void select(ModListEntry entry)
```

## com.terraformersmc.modmenu.gui.widget.ModListWidget.setSelected

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/gui/widget/ModListWidget.java:77`

```java
@Override public void setSelected(@Nullable ModListEntry entry)
```

## com.terraformersmc.modmenu.gui.widget.ModListWidget.isSelectedEntry

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/gui/widget/ModListWidget.java:89`

```java
protected boolean isSelectedEntry(int index)
```

## com.terraformersmc.modmenu.gui.widget.ModListWidget.addEntry

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/gui/widget/ModListWidget.java:95`

```java
@Override public int addEntry(ModListEntry entry)
```

## com.terraformersmc.modmenu.gui.widget.ModListWidget.getEntry

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/gui/widget/ModListWidget.java:110`

```java
@Nullable public ModListEntry getEntry(int index)
```

## com.terraformersmc.modmenu.gui.widget.ModListWidget.removeEntry

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/gui/widget/ModListWidget.java:119`

```java
@Override protected void removeEntry(ModListEntry entry)
```

## com.terraformersmc.modmenu.gui.widget.ModListWidget.clearEntries

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/gui/widget/ModListWidget.java:125`

```java
@Override protected void clearEntries()
```

## com.terraformersmc.modmenu.gui.widget.ModListWidget.remove

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/gui/widget/ModListWidget.java:133`

```java
protected void remove(int index)
```

## com.terraformersmc.modmenu.gui.widget.ModListWidget.finalizeInit

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/gui/widget/ModListWidget.java:139`

```java
public void finalizeInit()
```

## com.terraformersmc.modmenu.gui.widget.ModListWidget.reloadFilters

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/gui/widget/ModListWidget.java:147`

```java
public void reloadFilters()
```

## com.terraformersmc.modmenu.gui.widget.ModListWidget.filter

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/gui/widget/ModListWidget.java:151`

```java
public void filter(String searchTerm, boolean refresh)
```

## com.terraformersmc.modmenu.gui.widget.ModListWidget.filter

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/gui/widget/ModListWidget.java:161`

```java
public void filter(String searchTerm, boolean refresh, boolean reposition)
```

## com.terraformersmc.modmenu.gui.widget.ModListWidget.renderList

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/gui/widget/ModListWidget.java:255`

```java
@Override protected void renderList(DrawContext drawContext, int mouseX, int mouseY, float delta)
```

## com.terraformersmc.modmenu.gui.widget.ModListWidget.drawSelectionHighlight

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/gui/widget/ModListWidget.java:298`

```java
protected void drawSelectionHighlight(DrawContext context, int x, int y, int width, int height, int borderColor, int fillColor)
```

## com.terraformersmc.modmenu.gui.widget.ModListWidget.ensureVisible

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/gui/widget/ModListWidget.java:303`

```java
public void ensureVisible(ModListEntry entry)
```

## com.terraformersmc.modmenu.gui.widget.ModListWidget.keyPressed

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/gui/widget/ModListWidget.java:317`

```java
public boolean keyPressed(KeyInput input)
```

## com.terraformersmc.modmenu.gui.widget.ModListWidget.getEntryAtPos

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/gui/widget/ModListWidget.java:329`

```java
public final ModListEntry getEntryAtPos(double x, double y)
```

## com.terraformersmc.modmenu.gui.widget.ModListWidget.getScrollbarX

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/gui/widget/ModListWidget.java:335`

```java
@Override protected int getScrollbarX()
```

## com.terraformersmc.modmenu.gui.widget.ModListWidget.getRowWidth

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/gui/widget/ModListWidget.java:340`

```java
@Override public int getRowWidth()
```

## com.terraformersmc.modmenu.gui.widget.ModListWidget.getRowLeft

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/gui/widget/ModListWidget.java:345`

```java
@Override public int getRowLeft()
```

## com.terraformersmc.modmenu.gui.widget.ModListWidget.getParent

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/gui/widget/ModListWidget.java:350`

```java
public ModsScreen getParent()
```

## com.terraformersmc.modmenu.gui.widget.ModListWidget.getContentsHeightWithPadding

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/gui/widget/ModListWidget.java:354`

```java
@Override protected int getContentsHeightWithPadding()
```

## com.terraformersmc.modmenu.gui.widget.ModListWidget.getDisplayedCountFor

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/gui/widget/ModListWidget.java:359`

```java
public int getDisplayedCountFor(Set<String> set)
```

## com.terraformersmc.modmenu.gui.widget.ModListWidget.close

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/gui/widget/ModListWidget.java:370`

```java
@Override public void close()
```

## com.terraformersmc.modmenu.gui.widget.ModListWidget.getFabricIconHandler

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/gui/widget/ModListWidget.java:375`

```java
public FabricIconHandler getFabricIconHandler()
```

## com.terraformersmc.modmenu.gui.widget.ModMenuButtonWidget

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/gui/widget/ModMenuButtonWidget.java:11`

```java
public class ModMenuButtonWidget extends ButtonWidget.Text
```

## com.terraformersmc.modmenu.gui.widget.ModMenuButtonWidget.ModMenuButtonWidget

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/gui/widget/ModMenuButtonWidget.java:12`

```java
public ModMenuButtonWidget(int x, int y, int width, int height, net.minecraft.text.Text text, Screen screen)
```

## com.terraformersmc.modmenu.gui.widget.ModMenuButtonWidget.drawIcon

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/gui/widget/ModMenuButtonWidget.java:24`

```java
@Override public void drawIcon(DrawContext drawContext, int mouseX, int mouseY, float delta)
```

## com.terraformersmc.modmenu.gui.widget.UpdateAvailableBadge

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/gui/widget/UpdateAvailableBadge.java:7`

```java
public class UpdateAvailableBadge
```

## com.terraformersmc.modmenu.gui.widget.UpdateAvailableBadge.renderBadge

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/gui/widget/UpdateAvailableBadge.java:10`

```java
public static void renderBadge(DrawContext drawContext, int x, int y)
```

## com.terraformersmc.modmenu.gui.widget.UpdateCheckerTexturedButtonWidget

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/gui/widget/UpdateCheckerTexturedButtonWidget.java:9`

```java
public class UpdateCheckerTexturedButtonWidget extends LegacyTexturedButtonWidget
```

## com.terraformersmc.modmenu.gui.widget.UpdateCheckerTexturedButtonWidget.UpdateCheckerTexturedButtonWidget

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/gui/widget/UpdateCheckerTexturedButtonWidget.java:10`

```java
public UpdateCheckerTexturedButtonWidget( int x, int y, int width, int height, int u, int v, int hoveredVOffset, Identifier texture, int textureWidth, int textureHeight, ButtonWidget.PressAction pressAction, net.minecraft.text.Text message )
```

## com.terraformersmc.modmenu.gui.widget.UpdateCheckerTexturedButtonWidget.drawIcon

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/gui/widget/UpdateCheckerTexturedButtonWidget.java:27`

```java
@Override public void drawIcon(DrawContext drawContext, int mouseX, int mouseY, float delta)
```

## com.terraformersmc.modmenu.gui.widget.entries.ChildEntry

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/gui/widget/entries/ChildEntry.java:8`

```java
public class ChildEntry extends ModListEntry
```

## com.terraformersmc.modmenu.gui.widget.entries.ChildEntry.ChildEntry

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/gui/widget/entries/ChildEntry.java:12`

```java
public ChildEntry(Mod mod, ParentEntry parent, ModListWidget list, boolean bottomChild)
```

## com.terraformersmc.modmenu.gui.widget.entries.ChildEntry.render

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/gui/widget/entries/ChildEntry.java:18`

```java
@Override public void render( DrawContext drawContext, int mouseX, int mouseY, boolean isSelected, float delta )
```

## com.terraformersmc.modmenu.gui.widget.entries.ChildEntry.keyPressed

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/gui/widget/entries/ChildEntry.java:36`

```java
@Override public boolean keyPressed(KeyInput input)
```

## com.terraformersmc.modmenu.gui.widget.entries.ChildEntry.getXOffset

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/gui/widget/entries/ChildEntry.java:47`

```java
@Override public int getXOffset()
```

## com.terraformersmc.modmenu.gui.widget.entries.IndependentEntry

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/gui/widget/entries/IndependentEntry.java:6`

```java
public class IndependentEntry extends ModListEntry
```

## com.terraformersmc.modmenu.gui.widget.entries.IndependentEntry.IndependentEntry

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/gui/widget/entries/IndependentEntry.java:7`

```java
public IndependentEntry(Mod mod, ModListWidget list)
```

## com.terraformersmc.modmenu.gui.widget.entries.ModListEntry

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/gui/widget/entries/ModListEntry.java:25`

```java
public class ModListEntry extends AlwaysSelectedEntryListWidget.Entry<ModListEntry>
```

## com.terraformersmc.modmenu.gui.widget.entries.ModListEntry.UNKNOWN_ICON

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/gui/widget/entries/ModListEntry.java:26`

```java
public static final Identifier UNKNOWN_ICON = Identifier.ofVanilla("textures/misc/unknown_pack.png")
```

## com.terraformersmc.modmenu.gui.widget.entries.ModListEntry.client

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/gui/widget/entries/ModListEntry.java:31`

```java
protected final MinecraftClient client
```

## com.terraformersmc.modmenu.gui.widget.entries.ModListEntry.mod

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/gui/widget/entries/ModListEntry.java:32`

```java
public final Mod mod
```

## com.terraformersmc.modmenu.gui.widget.entries.ModListEntry.list

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/gui/widget/entries/ModListEntry.java:33`

```java
protected final ModListWidget list
```

## com.terraformersmc.modmenu.gui.widget.entries.ModListEntry.iconLocation

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/gui/widget/entries/ModListEntry.java:34`

```java
protected Identifier iconLocation
```

## com.terraformersmc.modmenu.gui.widget.entries.ModListEntry.FULL_ICON_SIZE

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/gui/widget/entries/ModListEntry.java:35`

```java
protected static final int FULL_ICON_SIZE = 32
```

## com.terraformersmc.modmenu.gui.widget.entries.ModListEntry.COMPACT_ICON_SIZE

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/gui/widget/entries/ModListEntry.java:36`

```java
protected static final int COMPACT_ICON_SIZE = 19
```

## com.terraformersmc.modmenu.gui.widget.entries.ModListEntry.sinceLastClick

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/gui/widget/entries/ModListEntry.java:37`

```java
protected long sinceLastClick
```

## com.terraformersmc.modmenu.gui.widget.entries.ModListEntry.yOffset

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/gui/widget/entries/ModListEntry.java:38`

```java
protected int yOffset = 0
```

## com.terraformersmc.modmenu.gui.widget.entries.ModListEntry.ModListEntry

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/gui/widget/entries/ModListEntry.java:40`

```java
public ModListEntry(Mod mod, ModListWidget list)
```

## com.terraformersmc.modmenu.gui.widget.entries.ModListEntry.getNarration

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/gui/widget/entries/ModListEntry.java:46`

```java
@Override public Text getNarration()
```

## com.terraformersmc.modmenu.gui.widget.entries.ModListEntry.render

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/gui/widget/entries/ModListEntry.java:51`

```java
@Override public void render( DrawContext drawContext, int mouseX, int mouseY, boolean hovered, float delta )
```

## com.terraformersmc.modmenu.gui.widget.entries.ModListEntry.mouseClicked

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/gui/widget/entries/ModListEntry.java:180`

```java
@Override public boolean mouseClicked(Click click, boolean doubleClick)
```

## com.terraformersmc.modmenu.gui.widget.entries.ModListEntry.openConfig

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/gui/widget/entries/ModListEntry.java:196`

```java
public void openConfig()
```

## com.terraformersmc.modmenu.gui.widget.entries.ModListEntry.getMod

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/gui/widget/entries/ModListEntry.java:200`

```java
public Mod getMod()
```

## com.terraformersmc.modmenu.gui.widget.entries.ModListEntry.getIconTexture

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/gui/widget/entries/ModListEntry.java:204`

```java
public Identifier getIconTexture()
```

## com.terraformersmc.modmenu.gui.widget.entries.ModListEntry.updatePlacement

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/gui/widget/entries/ModListEntry.java:214`

```java
public void updatePlacement(int leftX, int width, int y)
```

## com.terraformersmc.modmenu.gui.widget.entries.ModListEntry.getXOffset

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/gui/widget/entries/ModListEntry.java:220`

```java
public int getXOffset()
```

## com.terraformersmc.modmenu.gui.widget.entries.ModListEntry.setYOffset

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/gui/widget/entries/ModListEntry.java:224`

```java
public void setYOffset(int offset)
```

## com.terraformersmc.modmenu.gui.widget.entries.ModListEntry.getYOffset

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/gui/widget/entries/ModListEntry.java:228`

```java
public int getYOffset()
```

## com.terraformersmc.modmenu.gui.widget.entries.ParentEntry

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/gui/widget/entries/ParentEntry.java:22`

```java
public class ParentEntry extends ModListEntry
```

## com.terraformersmc.modmenu.gui.widget.entries.ParentEntry.children

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/gui/widget/entries/ParentEntry.java:24`

```java
protected List<Mod> children
```

## com.terraformersmc.modmenu.gui.widget.entries.ParentEntry.list

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/gui/widget/entries/ParentEntry.java:25`

```java
protected ModListWidget list
```

## com.terraformersmc.modmenu.gui.widget.entries.ParentEntry.hoveringIcon

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/gui/widget/entries/ParentEntry.java:26`

```java
protected boolean hoveringIcon = false
```

## com.terraformersmc.modmenu.gui.widget.entries.ParentEntry.ParentEntry

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/gui/widget/entries/ParentEntry.java:28`

```java
public ParentEntry(Mod parent, List<Mod> children, ModListWidget list)
```

## com.terraformersmc.modmenu.gui.widget.entries.ParentEntry.render

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/gui/widget/entries/ParentEntry.java:34`

```java
@Override public void render( DrawContext drawContext, int mouseX, int mouseY, boolean isSelected, float delta )
```

## com.terraformersmc.modmenu.gui.widget.entries.ParentEntry.mouseClicked

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/gui/widget/entries/ParentEntry.java:126`

```java
@Override public boolean mouseClicked(Click click, boolean doubleClick)
```

## com.terraformersmc.modmenu.gui.widget.entries.ParentEntry.keyPressed

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/gui/widget/entries/ParentEntry.java:152`

```java
@Override public boolean keyPressed(KeyInput input)
```

## com.terraformersmc.modmenu.gui.widget.entries.ParentEntry.setChildren

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/gui/widget/entries/ParentEntry.java:184`

```java
public void setChildren(List<Mod> children)
```

## com.terraformersmc.modmenu.gui.widget.entries.ParentEntry.addChildren

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/gui/widget/entries/ParentEntry.java:188`

```java
public void addChildren(List<Mod> children)
```

## com.terraformersmc.modmenu.gui.widget.entries.ParentEntry.addChildren

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/gui/widget/entries/ParentEntry.java:192`

```java
public void addChildren(Mod... children)
```

## com.terraformersmc.modmenu.gui.widget.entries.ParentEntry.getChildren

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/gui/widget/entries/ParentEntry.java:196`

```java
public List<Mod> getChildren()
```

## com.terraformersmc.modmenu.gui.widget.entries.ParentEntry.isMouseOver

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/gui/widget/entries/ParentEntry.java:200`

```java
@Override public boolean isMouseOver(double double_1, double double_2)
```

## com.terraformersmc.modmenu.mixin.AccessorClickableWidget

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/mixin/AccessorClickableWidget.java:8`

```java
@Mixin(ClickableWidget.class) public interface AccessorClickableWidget
```

## com.terraformersmc.modmenu.mixin.AccessorClickableWidget.getTooltip

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/mixin/AccessorClickableWidget.java:10`

```java
@Accessor TooltipState getTooltip()
```

## com.terraformersmc.modmenu.mixin.AccessorGridWidget

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/mixin/AccessorGridWidget.java:10`

```java
@Mixin(GridWidget.class) public interface AccessorGridWidget
```

## com.terraformersmc.modmenu.mixin.AccessorGridWidget.getChildren

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/mixin/AccessorGridWidget.java:12`

```java
@Accessor List<Widget> getChildren()
```

## com.terraformersmc.modmenu.mixin.MixinGameMenu

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/mixin/MixinGameMenu.java:26`

```java
@Mixin(GameMenuScreen.class) public abstract class MixinGameMenu extends Screen
```

## com.terraformersmc.modmenu.mixin.MixinGameMenu.MixinGameMenu

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/mixin/MixinGameMenu.java:28`

```java
protected MixinGameMenu(Text title)
```

## com.terraformersmc.modmenu.mixin.MixinTitleScreen

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/mixin/MixinTitleScreen.java:11`

```java
@Mixin(TitleScreen.class) public class MixinTitleScreen
```

## com.terraformersmc.modmenu.util.DrawingUtil

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/DrawingUtil.java:19`

```java
@Environment(EnvType.CLIENT) public class DrawingUtil
```

## com.terraformersmc.modmenu.util.DrawingUtil.drawRandomVersionBackground

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/DrawingUtil.java:23`

```java
public static void drawRandomVersionBackground( Mod mod, DrawContext drawContext, int x, int y, int width, int height )
```

## com.terraformersmc.modmenu.util.DrawingUtil.drawWrappedString

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/DrawingUtil.java:42`

```java
public static void drawWrappedString( DrawContext drawContext, String string, int x, int y, int wrapWidth, int lines, int color )
```

## com.terraformersmc.modmenu.util.DrawingUtil.drawBadge

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/DrawingUtil.java:76`

```java
public static void drawBadge( DrawContext drawContext, int x, int y, int tagWidth, OrderedText text, int outlineColor, int fillColor, int textColor )
```

## com.terraformersmc.modmenu.util.EnumToLowerCaseJsonConverter

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/EnumToLowerCaseJsonConverter.java:9`

```java
public final class EnumToLowerCaseJsonConverter implements JsonSerializer<Enum<?>>, JsonDeserializer<Enum<?>>
```

## com.terraformersmc.modmenu.util.EnumToLowerCaseJsonConverter.serialize

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/EnumToLowerCaseJsonConverter.java:12`

```java
@Override public JsonElement serialize(final Enum<?> src, final Type typeOfSrc, final JsonSerializationContext context)
```

## com.terraformersmc.modmenu.util.EnumToLowerCaseJsonConverter.deserialize

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/EnumToLowerCaseJsonConverter.java:21`

```java
@SuppressWarnings("unchecked") @Override public Enum<?> deserialize( final JsonElement json, final Type type, final JsonDeserializationContext context ) throws JsonParseException
```

## com.terraformersmc.modmenu.util.HttpUtil

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/HttpUtil.java:14`

```java
public class HttpUtil
```

## com.terraformersmc.modmenu.util.HttpUtil.request

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/HttpUtil.java:25`

```java
public static <T> HttpResponse<T> request( HttpRequest.Builder builder, HttpResponse.BodyHandler<T> handler ) throws IOException, InterruptedException
```

## com.terraformersmc.modmenu.util.JsonUtil

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/JsonUtil.java:8`

```java
public class JsonUtil
```

## com.terraformersmc.modmenu.util.JsonUtil.getString

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/JsonUtil.java:12`

```java
public static Optional<String> getString(JsonObject parent, String field)
```

## com.terraformersmc.modmenu.util.JsonUtil.getBoolean

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/JsonUtil.java:25`

```java
public static Optional<Boolean> getBoolean(JsonObject parent, String field)
```

## com.terraformersmc.modmenu.util.ModMenuScreenTexts

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/ModMenuScreenTexts.java:7`

```java
public final class ModMenuScreenTexts
```

## com.terraformersmc.modmenu.util.ModMenuScreenTexts.CONFIGURE

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/ModMenuScreenTexts.java:8`

```java
public static final Text CONFIGURE = Text.translatable("modmenu.configure")
```

## com.terraformersmc.modmenu.util.ModMenuScreenTexts.DROP_CONFIRM

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/ModMenuScreenTexts.java:9`

```java
public static final Text DROP_CONFIRM = Text.translatable("modmenu.dropConfirm")
```

## com.terraformersmc.modmenu.util.ModMenuScreenTexts.DROP_INFO_LINE_1

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/ModMenuScreenTexts.java:10`

```java
public static final Text DROP_INFO_LINE_1 = Text.translatable("modmenu.dropInfo.line1")
```

## com.terraformersmc.modmenu.util.ModMenuScreenTexts.DROP_INFO_LINE_2

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/ModMenuScreenTexts.java:11`

```java
public static final Text DROP_INFO_LINE_2 = Text.translatable("modmenu.dropInfo.line2")
```

## com.terraformersmc.modmenu.util.ModMenuScreenTexts.DROP_SUCCESSFUL_LINE_1

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/ModMenuScreenTexts.java:12`

```java
public static final Text DROP_SUCCESSFUL_LINE_1 = Text.translatable("modmenu.dropSuccessful.line1")
```

## com.terraformersmc.modmenu.util.ModMenuScreenTexts.DROP_SUCCESSFUL_LINE_2

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/ModMenuScreenTexts.java:13`

```java
public static final Text DROP_SUCCESSFUL_LINE_2 = Text.translatable("modmenu.dropSuccessful.line2")
```

## com.terraformersmc.modmenu.util.ModMenuScreenTexts.ISSUES

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/ModMenuScreenTexts.java:14`

```java
public static final Text ISSUES = Text.translatable("modmenu.issues")
```

## com.terraformersmc.modmenu.util.ModMenuScreenTexts.MODS_FOLDER

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/ModMenuScreenTexts.java:15`

```java
public static final Text MODS_FOLDER = Text.translatable("modmenu.modsFolder")
```

## com.terraformersmc.modmenu.util.ModMenuScreenTexts.SEARCH

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/ModMenuScreenTexts.java:16`

```java
public static final Text SEARCH = Text.translatable("modmenu.search")
```

## com.terraformersmc.modmenu.util.ModMenuScreenTexts.TITLE

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/ModMenuScreenTexts.java:17`

```java
public static final Text TITLE = Text.translatable("modmenu.title")
```

## com.terraformersmc.modmenu.util.ModMenuScreenTexts.TOGGLE_FILTER_OPTIONS

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/ModMenuScreenTexts.java:18`

```java
public static final Text TOGGLE_FILTER_OPTIONS = Text.translatable("modmenu.toggleFilterOptions")
```

## com.terraformersmc.modmenu.util.ModMenuScreenTexts.WEBSITE

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/ModMenuScreenTexts.java:19`

```java
public static final Text WEBSITE = Text.translatable("modmenu.website")
```

## com.terraformersmc.modmenu.util.ModMenuScreenTexts.modIdTooltip

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/ModMenuScreenTexts.java:24`

```java
public static Text modIdTooltip(String modId)
```

## com.terraformersmc.modmenu.util.ModMenuScreenTexts.configureError

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/ModMenuScreenTexts.java:28`

```java
public static Text configureError(String modId, Throwable e)
```

## com.terraformersmc.modmenu.util.NullScreenFactory

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/NullScreenFactory.java:10`

```java
public class NullScreenFactory<S extends Screen> implements ConfigScreenFactory<S>
```

## com.terraformersmc.modmenu.util.NullScreenFactory.create

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/NullScreenFactory.java:11`

```java
@Override public S create(Screen parent)
```

## com.terraformersmc.modmenu.util.OptionalUtil

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/OptionalUtil.java:5`

```java
public class OptionalUtil
```

## com.terraformersmc.modmenu.util.OptionalUtil.isPresentAndTrue

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/OptionalUtil.java:6`

```java
public static boolean isPresentAndTrue(Optional<Boolean> optional)
```

## com.terraformersmc.modmenu.util.TranslationUtil

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/TranslationUtil.java:10`

```java
public class TranslationUtil
```

## com.terraformersmc.modmenu.util.TranslationUtil.translateNumeric

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/TranslationUtil.java:11`

```java
public static Text translateNumeric(String key, int[]... args)
```

## com.terraformersmc.modmenu.util.TranslationUtil.translationKeyOf

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/TranslationUtil.java:54`

```java
public static String translationKeyOf(String type, String id)
```

## com.terraformersmc.modmenu.util.UpdateCheckerThreadFactory

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/UpdateCheckerThreadFactory.java:8`

```java
public class UpdateCheckerThreadFactory implements ThreadFactory
```

## com.terraformersmc.modmenu.util.UpdateCheckerThreadFactory.newThread

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/UpdateCheckerThreadFactory.java:11`

```java
@Override public Thread newThread(@NotNull Runnable r)
```

## com.terraformersmc.modmenu.util.UpdateCheckerUtil

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/UpdateCheckerUtil.java:35`

```java
public class UpdateCheckerUtil
```

## com.terraformersmc.modmenu.util.UpdateCheckerUtil.LOGGER

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/UpdateCheckerUtil.java:36`

```java
public static final Logger LOGGER = LoggerFactory.getLogger("Mod Menu/Update Checker")
```

## com.terraformersmc.modmenu.util.UpdateCheckerUtil.checkForUpdates

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/UpdateCheckerUtil.java:44`

```java
public static void checkForUpdates()
```

## com.terraformersmc.modmenu.util.UpdateCheckerUtil.triggerV2RemovedToast

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/UpdateCheckerUtil.java:169`

```java
public static void triggerV2RemovedToast()
```

## com.terraformersmc.modmenu.util.UpdateCheckerUtil.CurrentVersionsFromHashes

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/UpdateCheckerUtil.java:224`

```java
public static class CurrentVersionsFromHashes
```

## com.terraformersmc.modmenu.util.UpdateCheckerUtil.CurrentVersionsFromHashes.hashes

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/UpdateCheckerUtil.java:225`

```java
public Collection<String> hashes
```

## com.terraformersmc.modmenu.util.UpdateCheckerUtil.CurrentVersionsFromHashes.algorithm

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/UpdateCheckerUtil.java:226`

```java
public String algorithm = "sha512"
```

## com.terraformersmc.modmenu.util.UpdateCheckerUtil.CurrentVersionsFromHashes.CurrentVersionsFromHashes

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/UpdateCheckerUtil.java:228`

```java
public CurrentVersionsFromHashes(Collection<String> hashes)
```

## com.terraformersmc.modmenu.util.UpdateCheckerUtil.LatestVersionsFromHashesBody

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/UpdateCheckerUtil.java:341`

```java
public static class LatestVersionsFromHashesBody
```

## com.terraformersmc.modmenu.util.UpdateCheckerUtil.LatestVersionsFromHashesBody.hashes

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/UpdateCheckerUtil.java:342`

```java
public Collection<String> hashes
```

## com.terraformersmc.modmenu.util.UpdateCheckerUtil.LatestVersionsFromHashesBody.algorithm

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/UpdateCheckerUtil.java:343`

```java
public String algorithm = "sha512"
```

## com.terraformersmc.modmenu.util.UpdateCheckerUtil.LatestVersionsFromHashesBody.loaders

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/UpdateCheckerUtil.java:344`

```java
public Collection<String> loaders
```

## com.terraformersmc.modmenu.util.UpdateCheckerUtil.LatestVersionsFromHashesBody.gameVersions

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/UpdateCheckerUtil.java:345`

```java
@SerializedName("game_versions") public Collection<String> gameVersions
```

## com.terraformersmc.modmenu.util.UpdateCheckerUtil.LatestVersionsFromHashesBody.versionTypes

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/UpdateCheckerUtil.java:347`

```java
@SerializedName("version_types") public Collection<String> versionTypes
```

## com.terraformersmc.modmenu.util.UpdateCheckerUtil.LatestVersionsFromHashesBody.LatestVersionsFromHashesBody

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/UpdateCheckerUtil.java:350`

```java
public LatestVersionsFromHashesBody( Collection<String> hashes, Collection<String> loaders, String mcVersion, Collection<UpdateChannel> updateChannels )
```

## com.terraformersmc.modmenu.util.VersionUtil

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/VersionUtil.java:5`

```java
public final class VersionUtil
```

## com.terraformersmc.modmenu.util.VersionUtil.stripPrefix

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/VersionUtil.java:10`

```java
public static String stripPrefix(String version)
```

## com.terraformersmc.modmenu.util.VersionUtil.getPrefixedVersion

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/VersionUtil.java:22`

```java
public static String getPrefixedVersion(String version)
```

## com.terraformersmc.modmenu.util.VersionUtil.removeBuildMetadata

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/VersionUtil.java:26`

```java
public static String removeBuildMetadata(String version)
```

## com.terraformersmc.modmenu.util.mod.Mod

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/Mod.java:21`

```java
public interface Mod
```

## com.terraformersmc.modmenu.util.mod.Mod.getId

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/Mod.java:22`

```java
@NotNull String getId()
```

## com.terraformersmc.modmenu.util.mod.Mod.getName

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/Mod.java:24`

```java
@NotNull String getName()
```

## com.terraformersmc.modmenu.util.mod.Mod.getTranslatedName

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/Mod.java:26`

```java
@NotNull default String getTranslatedName()
```

## com.terraformersmc.modmenu.util.mod.Mod.getIcon

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/Mod.java:37`

```java
@NotNull NativeImageBackedTexture getIcon(FabricIconHandler iconHandler, int i)
```

## com.terraformersmc.modmenu.util.mod.Mod.getSummary

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/Mod.java:39`

```java
@NotNull default String getSummary()
```

## com.terraformersmc.modmenu.util.mod.Mod.getTranslatedSummary

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/Mod.java:47`

```java
@NotNull default String getTranslatedSummary()
```

## com.terraformersmc.modmenu.util.mod.Mod.getDescription

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/Mod.java:58`

```java
@NotNull String getDescription()
```

## com.terraformersmc.modmenu.util.mod.Mod.getTranslatedDescription

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/Mod.java:60`

```java
@NotNull default String getTranslatedDescription()
```

## com.terraformersmc.modmenu.util.mod.Mod.getFormattedDescription

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/Mod.java:71`

```java
default Text getFormattedDescription()
```

## com.terraformersmc.modmenu.util.mod.Mod.getVersion

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/Mod.java:78`

```java
@NotNull String getVersion()
```

## com.terraformersmc.modmenu.util.mod.Mod.getPrefixedVersion

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/Mod.java:80`

```java
@NotNull String getPrefixedVersion()
```

## com.terraformersmc.modmenu.util.mod.Mod.getAuthors

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/Mod.java:82`

```java
@NotNull List<String> getAuthors()
```

## com.terraformersmc.modmenu.util.mod.Mod.getContact

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/Mod.java:84`

```java
ContactInformation getContact(String author)
```

## com.terraformersmc.modmenu.util.mod.Mod.getContributors

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/Mod.java:89`

```java
@NotNull Map<String, Collection<String>> getContributors()
```

## com.terraformersmc.modmenu.util.mod.Mod.getCredits

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/Mod.java:94`

```java
@NotNull SortedMap<String, Set<String>> getCredits()
```

## com.terraformersmc.modmenu.util.mod.Mod.getBadges

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/Mod.java:96`

```java
@NotNull Set<Badge> getBadges()
```

## com.terraformersmc.modmenu.util.mod.Mod.getWebsite

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/Mod.java:98`

```java
@Nullable String getWebsite()
```

## com.terraformersmc.modmenu.util.mod.Mod.getIssueTracker

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/Mod.java:100`

```java
@Nullable String getIssueTracker()
```

## com.terraformersmc.modmenu.util.mod.Mod.getSource

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/Mod.java:102`

```java
@Nullable String getSource()
```

## com.terraformersmc.modmenu.util.mod.Mod.getParent

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/Mod.java:104`

```java
@Nullable String getParent()
```

## com.terraformersmc.modmenu.util.mod.Mod.getLicense

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/Mod.java:106`

```java
@NotNull Set<String> getLicense()
```

## com.terraformersmc.modmenu.util.mod.Mod.getLinks

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/Mod.java:108`

```java
@NotNull Map<String, String> getLinks()
```

## com.terraformersmc.modmenu.util.mod.Mod.isReal

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/Mod.java:110`

```java
boolean isReal()
```

## com.terraformersmc.modmenu.util.mod.Mod.allowsUpdateChecks

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/Mod.java:112`

```java
boolean allowsUpdateChecks()
```

## com.terraformersmc.modmenu.util.mod.Mod.getUpdateChecker

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/Mod.java:114`

```java
@Nullable UpdateChecker getUpdateChecker()
```

## com.terraformersmc.modmenu.util.mod.Mod.setUpdateChecker

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/Mod.java:116`

```java
void setUpdateChecker(@Nullable UpdateChecker updateChecker)
```

## com.terraformersmc.modmenu.util.mod.Mod.getUpdateInfo

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/Mod.java:118`

```java
@Nullable UpdateInfo getUpdateInfo()
```

## com.terraformersmc.modmenu.util.mod.Mod.setUpdateInfo

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/Mod.java:120`

```java
void setUpdateInfo(@Nullable UpdateInfo updateInfo)
```

## com.terraformersmc.modmenu.util.mod.Mod.hasUpdate

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/Mod.java:122`

```java
default boolean hasUpdate()
```

## com.terraformersmc.modmenu.util.mod.Mod.getSha512Hash

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/Mod.java:131`

```java
default @Nullable String getSha512Hash() throws IOException
```

## com.terraformersmc.modmenu.util.mod.Mod.setChildHasUpdate

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/Mod.java:135`

```java
void setChildHasUpdate()
```

## com.terraformersmc.modmenu.util.mod.Mod.getChildHasUpdate

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/Mod.java:137`

```java
boolean getChildHasUpdate()
```

## com.terraformersmc.modmenu.util.mod.Mod.isHidden

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/Mod.java:139`

```java
boolean isHidden()
```

## com.terraformersmc.modmenu.util.mod.Mod.Badge

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/Mod.java:141`

```java
enum Badge
```

## com.terraformersmc.modmenu.util.mod.Mod.Badge.getText

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/Mod.java:191`

```java
public Text getText()
```

## com.terraformersmc.modmenu.util.mod.Mod.Badge.getOutlineColor

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/Mod.java:195`

```java
public int getOutlineColor()
```

## com.terraformersmc.modmenu.util.mod.Mod.Badge.getFillColor

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/Mod.java:199`

```java
public int getFillColor()
```

## com.terraformersmc.modmenu.util.mod.Mod.Badge.convert

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/Mod.java:203`

```java
public static Set<Badge> convert(Set<String> badgeKeys, String modId)
```

## com.terraformersmc.modmenu.util.mod.ModBadgeRenderer

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/ModBadgeRenderer.java:11`

```java
public class ModBadgeRenderer
```

## com.terraformersmc.modmenu.util.mod.ModBadgeRenderer.startX

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/ModBadgeRenderer.java:12`

```java
protected int startX, startY, badgeX, badgeY, badgeMax
```

## com.terraformersmc.modmenu.util.mod.ModBadgeRenderer.startY

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/ModBadgeRenderer.java:12`

```java
protected int startX, startY, badgeX, badgeY, badgeMax
```

## com.terraformersmc.modmenu.util.mod.ModBadgeRenderer.badgeX

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/ModBadgeRenderer.java:12`

```java
protected int startX, startY, badgeX, badgeY, badgeMax
```

## com.terraformersmc.modmenu.util.mod.ModBadgeRenderer.badgeY

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/ModBadgeRenderer.java:12`

```java
protected int startX, startY, badgeX, badgeY, badgeMax
```

## com.terraformersmc.modmenu.util.mod.ModBadgeRenderer.badgeMax

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/ModBadgeRenderer.java:12`

```java
protected int startX, startY, badgeX, badgeY, badgeMax
```

## com.terraformersmc.modmenu.util.mod.ModBadgeRenderer.mod

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/ModBadgeRenderer.java:13`

```java
protected Mod mod
```

## com.terraformersmc.modmenu.util.mod.ModBadgeRenderer.client

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/ModBadgeRenderer.java:14`

```java
protected MinecraftClient client
```

## com.terraformersmc.modmenu.util.mod.ModBadgeRenderer.screen

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/ModBadgeRenderer.java:15`

```java
protected final ModsScreen screen
```

## com.terraformersmc.modmenu.util.mod.ModBadgeRenderer.ModBadgeRenderer

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/ModBadgeRenderer.java:17`

```java
public ModBadgeRenderer(int startX, int startY, int endX, Mod mod, ModsScreen screen)
```

## com.terraformersmc.modmenu.util.mod.ModBadgeRenderer.draw

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/ModBadgeRenderer.java:26`

```java
public void draw(DrawContext drawContext, int mouseX, int mouseY)
```

## com.terraformersmc.modmenu.util.mod.ModBadgeRenderer.drawBadge

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/ModBadgeRenderer.java:33`

```java
public void drawBadge(DrawContext drawContext, Mod.Badge badge, int mouseX, int mouseY)
```

## com.terraformersmc.modmenu.util.mod.ModBadgeRenderer.drawBadge

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/ModBadgeRenderer.java:44`

```java
public void drawBadge( DrawContext drawContext, OrderedText text, int outlineColor, int fillColor, int mouseX, int mouseY )
```

## com.terraformersmc.modmenu.util.mod.ModBadgeRenderer.getMod

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/ModBadgeRenderer.java:59`

```java
public Mod getMod()
```

## com.terraformersmc.modmenu.util.mod.ModSearch

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/ModSearch.java:13`

```java
public class ModSearch
```

## com.terraformersmc.modmenu.util.mod.ModSearch.validSearchQuery

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/ModSearch.java:14`

```java
public static boolean validSearchQuery(String query)
```

## com.terraformersmc.modmenu.util.mod.ModSearch.search

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/ModSearch.java:18`

```java
public static List<Mod> search(ModsScreen screen, String query, List<Mod> candidates)
```

## com.terraformersmc.modmenu.util.mod.ModrinthUpdateInfo

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/ModrinthUpdateInfo.java:9`

```java
public record ModrinthUpdateInfo(String projectId, String versionId, String versionNumber, UpdateChannel getUpdateChannel) implements UpdateInfo
```

## com.terraformersmc.modmenu.util.mod.ModrinthUpdateInfo.isUpdateAvailable

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/ModrinthUpdateInfo.java:13`

```java
@Override public boolean isUpdateAvailable()
```

## com.terraformersmc.modmenu.util.mod.ModrinthUpdateInfo.getUpdateMessage

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/ModrinthUpdateInfo.java:18`

```java
@Override public @NotNull Text getUpdateMessage()
```

## com.terraformersmc.modmenu.util.mod.ModrinthUpdateInfo.getDownloadLink

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/ModrinthUpdateInfo.java:28`

```java
@Override public String getDownloadLink()
```

## com.terraformersmc.modmenu.util.mod.fabric.CustomValueUtil

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/fabric/CustomValueUtil.java:8`

```java
public class CustomValueUtil
```

## com.terraformersmc.modmenu.util.mod.fabric.CustomValueUtil.getBoolean

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/fabric/CustomValueUtil.java:9`

```java
public static Optional<Boolean> getBoolean(String key, ModMetadata metadata)
```

## com.terraformersmc.modmenu.util.mod.fabric.CustomValueUtil.getString

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/fabric/CustomValueUtil.java:16`

```java
public static Optional<String> getString(String key, ModMetadata metadata)
```

## com.terraformersmc.modmenu.util.mod.fabric.CustomValueUtil.getStringSet

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/fabric/CustomValueUtil.java:23`

```java
public static Optional<Set<String>> getStringSet(String key, ModMetadata metadata)
```

## com.terraformersmc.modmenu.util.mod.fabric.CustomValueUtil.getBoolean

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/fabric/CustomValueUtil.java:30`

```java
public static Optional<Boolean> getBoolean(String key, CustomValue.CvObject object)
```

## com.terraformersmc.modmenu.util.mod.fabric.CustomValueUtil.getString

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/fabric/CustomValueUtil.java:37`

```java
public static Optional<String> getString(String key, CustomValue.CvObject object)
```

## com.terraformersmc.modmenu.util.mod.fabric.CustomValueUtil.getStringArray

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/fabric/CustomValueUtil.java:44`

```java
public static Optional<String[]> getStringArray(String key, CustomValue.CvObject object)
```

## com.terraformersmc.modmenu.util.mod.fabric.CustomValueUtil.getStringSet

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/fabric/CustomValueUtil.java:56`

```java
public static Optional<Set<String>> getStringSet(String key, CustomValue.CvObject object)
```

## com.terraformersmc.modmenu.util.mod.fabric.CustomValueUtil.getStringMap

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/fabric/CustomValueUtil.java:67`

```java
public static Optional<Map<String, String>> getStringMap(String key, CustomValue.CvObject object)
```

## com.terraformersmc.modmenu.util.mod.fabric.FabricDummyParentMod

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/fabric/FabricDummyParentMod.java:17`

```java
public class FabricDummyParentMod implements Mod
```

## com.terraformersmc.modmenu.util.mod.fabric.FabricDummyParentMod.FabricDummyParentMod

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/fabric/FabricDummyParentMod.java:22`

```java
public FabricDummyParentMod(FabricMod host, String id)
```

## com.terraformersmc.modmenu.util.mod.fabric.FabricDummyParentMod.getId

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/fabric/FabricDummyParentMod.java:27`

```java
@Override public @NotNull String getId()
```

## com.terraformersmc.modmenu.util.mod.fabric.FabricDummyParentMod.getName

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/fabric/FabricDummyParentMod.java:32`

```java
@Override public @NotNull String getName()
```

## com.terraformersmc.modmenu.util.mod.fabric.FabricDummyParentMod.getIcon

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/fabric/FabricDummyParentMod.java:44`

```java
@Override public @NotNull NativeImageBackedTexture getIcon(FabricIconHandler iconHandler, int i)
```

## com.terraformersmc.modmenu.util.mod.fabric.FabricDummyParentMod.getDescription

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/fabric/FabricDummyParentMod.java:73`

```java
@Override public @NotNull String getDescription()
```

## com.terraformersmc.modmenu.util.mod.fabric.FabricDummyParentMod.getVersion

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/fabric/FabricDummyParentMod.java:82`

```java
@Override public @NotNull String getVersion()
```

## com.terraformersmc.modmenu.util.mod.fabric.FabricDummyParentMod.getPrefixedVersion

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/fabric/FabricDummyParentMod.java:87`

```java
@Override public @NotNull String getPrefixedVersion()
```

## com.terraformersmc.modmenu.util.mod.fabric.FabricDummyParentMod.getAuthors

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/fabric/FabricDummyParentMod.java:92`

```java
@Override public @NotNull List<String> getAuthors()
```

## com.terraformersmc.modmenu.util.mod.fabric.FabricDummyParentMod.getContact

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/fabric/FabricDummyParentMod.java:97`

```java
@Override public ContactInformation getContact(String author)
```

## com.terraformersmc.modmenu.util.mod.fabric.FabricDummyParentMod.getContributors

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/fabric/FabricDummyParentMod.java:102`

```java
@Override public @NotNull Map<String, Collection<String>> getContributors()
```

## com.terraformersmc.modmenu.util.mod.fabric.FabricDummyParentMod.getCredits

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/fabric/FabricDummyParentMod.java:107`

```java
@Override public @NotNull SortedMap<String, Set<String>> getCredits()
```

## com.terraformersmc.modmenu.util.mod.fabric.FabricDummyParentMod.getBadges

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/fabric/FabricDummyParentMod.java:112`

```java
@Override public @NotNull Set<Badge> getBadges()
```

## com.terraformersmc.modmenu.util.mod.fabric.FabricDummyParentMod.getWebsite

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/fabric/FabricDummyParentMod.java:136`

```java
@Override public @Nullable String getWebsite()
```

## com.terraformersmc.modmenu.util.mod.fabric.FabricDummyParentMod.getIssueTracker

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/fabric/FabricDummyParentMod.java:141`

```java
@Override public @Nullable String getIssueTracker()
```

## com.terraformersmc.modmenu.util.mod.fabric.FabricDummyParentMod.getSource

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/fabric/FabricDummyParentMod.java:146`

```java
@Override public @Nullable String getSource()
```

## com.terraformersmc.modmenu.util.mod.fabric.FabricDummyParentMod.getParent

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/fabric/FabricDummyParentMod.java:151`

```java
@Override public @Nullable String getParent()
```

## com.terraformersmc.modmenu.util.mod.fabric.FabricDummyParentMod.getLicense

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/fabric/FabricDummyParentMod.java:156`

```java
@Override public @NotNull Set<String> getLicense()
```

## com.terraformersmc.modmenu.util.mod.fabric.FabricDummyParentMod.getLinks

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/fabric/FabricDummyParentMod.java:161`

```java
@Override public @NotNull Map<String, String> getLinks()
```

## com.terraformersmc.modmenu.util.mod.fabric.FabricDummyParentMod.isReal

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/fabric/FabricDummyParentMod.java:166`

```java
@Override public boolean isReal()
```

## com.terraformersmc.modmenu.util.mod.fabric.FabricDummyParentMod.allowsUpdateChecks

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/fabric/FabricDummyParentMod.java:171`

```java
@Override public boolean allowsUpdateChecks()
```

## com.terraformersmc.modmenu.util.mod.fabric.FabricDummyParentMod.getUpdateChecker

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/fabric/FabricDummyParentMod.java:176`

```java
@Override public @Nullable UpdateChecker getUpdateChecker()
```

## com.terraformersmc.modmenu.util.mod.fabric.FabricDummyParentMod.setUpdateChecker

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/fabric/FabricDummyParentMod.java:181`

```java
@Override public void setUpdateChecker(@Nullable UpdateChecker updateChecker)
```

## com.terraformersmc.modmenu.util.mod.fabric.FabricDummyParentMod.getUpdateInfo

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/fabric/FabricDummyParentMod.java:186`

```java
@Override public @Nullable UpdateInfo getUpdateInfo()
```

## com.terraformersmc.modmenu.util.mod.fabric.FabricDummyParentMod.setUpdateInfo

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/fabric/FabricDummyParentMod.java:191`

```java
@Override public void setUpdateInfo(@Nullable UpdateInfo updateInfo)
```

## com.terraformersmc.modmenu.util.mod.fabric.FabricDummyParentMod.getChildHasUpdate

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/fabric/FabricDummyParentMod.java:196`

```java
@Override public boolean getChildHasUpdate()
```

## com.terraformersmc.modmenu.util.mod.fabric.FabricDummyParentMod.setChildHasUpdate

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/fabric/FabricDummyParentMod.java:201`

```java
@Override public void setChildHasUpdate()
```

## com.terraformersmc.modmenu.util.mod.fabric.FabricDummyParentMod.isHidden

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/fabric/FabricDummyParentMod.java:206`

```java
@Override public boolean isHidden()
```

## com.terraformersmc.modmenu.util.mod.fabric.FabricIconHandler

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/fabric/FabricIconHandler.java:20`

```java
public class FabricIconHandler implements Closeable
```

## com.terraformersmc.modmenu.util.mod.fabric.FabricIconHandler.createIcon

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/fabric/FabricIconHandler.java:25`

```java
public NativeImageBackedTexture createIcon(ModContainer iconSource, String iconPath)
```

## com.terraformersmc.modmenu.util.mod.fabric.FabricIconHandler.close

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/fabric/FabricIconHandler.java:60`

```java
@Override public void close()
```

## com.terraformersmc.modmenu.util.mod.fabric.FabricLoaderUpdateChecker

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/fabric/FabricLoaderUpdateChecker.java:24`

```java
public class FabricLoaderUpdateChecker implements UpdateChecker
```

## com.terraformersmc.modmenu.util.mod.fabric.FabricLoaderUpdateChecker.LOGGER

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/fabric/FabricLoaderUpdateChecker.java:25`

```java
public static final Logger LOGGER = LoggerFactory.getLogger("Mod Menu/Fabric Update Checker")
```

## com.terraformersmc.modmenu.util.mod.fabric.FabricLoaderUpdateChecker.checkForUpdates

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/fabric/FabricLoaderUpdateChecker.java:28`

```java
@Override public UpdateInfo checkForUpdates()
```

## com.terraformersmc.modmenu.util.mod.fabric.FabricMod

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/fabric/FabricMod.java:28`

```java
public class FabricMod implements Mod
```

## com.terraformersmc.modmenu.util.mod.fabric.FabricMod.container

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/fabric/FabricMod.java:31`

```java
protected final ModContainer container
```

## com.terraformersmc.modmenu.util.mod.fabric.FabricMod.metadata

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/fabric/FabricMod.java:32`

```java
protected final ModMetadata metadata
```

## com.terraformersmc.modmenu.util.mod.fabric.FabricMod.modMenuData

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/fabric/FabricMod.java:34`

```java
protected final ModMenuData modMenuData
```

## com.terraformersmc.modmenu.util.mod.fabric.FabricMod.badges

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/fabric/FabricMod.java:36`

```java
protected final Set<Badge> badges
```

## com.terraformersmc.modmenu.util.mod.fabric.FabricMod.links

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/fabric/FabricMod.java:38`

```java
protected final Map<String, String> links = new HashMap<>()
```

## com.terraformersmc.modmenu.util.mod.fabric.FabricMod.updateChecker

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/fabric/FabricMod.java:40`

```java
protected @Nullable UpdateChecker updateChecker = null
```

## com.terraformersmc.modmenu.util.mod.fabric.FabricMod.updateInfo

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/fabric/FabricMod.java:41`

```java
protected @Nullable UpdateInfo updateInfo = null
```

## com.terraformersmc.modmenu.util.mod.fabric.FabricMod.defaultIconWarning

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/fabric/FabricMod.java:43`

```java
protected boolean defaultIconWarning = true
```

## com.terraformersmc.modmenu.util.mod.fabric.FabricMod.allowsUpdateChecks

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/fabric/FabricMod.java:45`

```java
protected boolean allowsUpdateChecks = true
```

## com.terraformersmc.modmenu.util.mod.fabric.FabricMod.childHasUpdate

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/fabric/FabricMod.java:47`

```java
protected boolean childHasUpdate = false
```

## com.terraformersmc.modmenu.util.mod.fabric.FabricMod.FabricMod

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/fabric/FabricMod.java:49`

```java
public FabricMod(ModContainer modContainer, Set<String> modpackMods)
```

## com.terraformersmc.modmenu.util.mod.fabric.FabricMod.getContainer

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/fabric/FabricMod.java:149`

```java
public @NotNull ModContainer getContainer()
```

## com.terraformersmc.modmenu.util.mod.fabric.FabricMod.getId

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/fabric/FabricMod.java:153`

```java
@Override public @NotNull String getId()
```

## com.terraformersmc.modmenu.util.mod.fabric.FabricMod.getName

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/fabric/FabricMod.java:158`

```java
@Override public @NotNull String getName()
```

## com.terraformersmc.modmenu.util.mod.fabric.FabricMod.getIcon

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/fabric/FabricMod.java:163`

```java
@Override public @NotNull NativeImageBackedTexture getIcon(FabricIconHandler iconHandler, int i)
```

## com.terraformersmc.modmenu.util.mod.fabric.FabricMod.getDescription

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/fabric/FabricMod.java:197`

```java
@Override public @NotNull String getDescription()
```

## com.terraformersmc.modmenu.util.mod.fabric.FabricMod.getTranslatedDescription

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/fabric/FabricMod.java:202`

```java
@Override public @NotNull String getTranslatedDescription()
```

## com.terraformersmc.modmenu.util.mod.fabric.FabricMod.getVersion

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/fabric/FabricMod.java:212`

```java
@Override public @NotNull String getVersion()
```

## com.terraformersmc.modmenu.util.mod.fabric.FabricMod.getPrefixedVersion

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/fabric/FabricMod.java:221`

```java
public @NotNull String getPrefixedVersion()
```

## com.terraformersmc.modmenu.util.mod.fabric.FabricMod.getAuthors

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/fabric/FabricMod.java:225`

```java
@Override public @NotNull List<String> getAuthors()
```

## com.terraformersmc.modmenu.util.mod.fabric.FabricMod.getContact

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/fabric/FabricMod.java:239`

```java
@Override public ContactInformation getContact(String author)
```

## com.terraformersmc.modmenu.util.mod.fabric.FabricMod.getContributors

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/fabric/FabricMod.java:254`

```java
@Override public @NotNull Map<String, Collection<String>> getContributors()
```

## com.terraformersmc.modmenu.util.mod.fabric.FabricMod.getCredits

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/fabric/FabricMod.java:264`

```java
@Override public @NotNull SortedMap<String, Set<String>> getCredits()
```

## com.terraformersmc.modmenu.util.mod.fabric.FabricMod.getBadges

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/fabric/FabricMod.java:284`

```java
@Override public @NotNull Set<Badge> getBadges()
```

## com.terraformersmc.modmenu.util.mod.fabric.FabricMod.getWebsite

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/fabric/FabricMod.java:289`

```java
@Override public @Nullable String getWebsite()
```

## com.terraformersmc.modmenu.util.mod.fabric.FabricMod.getIssueTracker

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/fabric/FabricMod.java:300`

```java
@Override public @Nullable String getIssueTracker()
```

## com.terraformersmc.modmenu.util.mod.fabric.FabricMod.getSource

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/fabric/FabricMod.java:309`

```java
@Override public @Nullable String getSource()
```

## com.terraformersmc.modmenu.util.mod.fabric.FabricMod.getParent

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/fabric/FabricMod.java:314`

```java
@Override public @Nullable String getParent()
```

## com.terraformersmc.modmenu.util.mod.fabric.FabricMod.getLicense

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/fabric/FabricMod.java:319`

```java
@Override public @NotNull Set<String> getLicense()
```

## com.terraformersmc.modmenu.util.mod.fabric.FabricMod.getLinks

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/fabric/FabricMod.java:328`

```java
@Override public @NotNull Map<String, String> getLinks()
```

## com.terraformersmc.modmenu.util.mod.fabric.FabricMod.isReal

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/fabric/FabricMod.java:333`

```java
@Override public boolean isReal()
```

## com.terraformersmc.modmenu.util.mod.fabric.FabricMod.allowsUpdateChecks

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/fabric/FabricMod.java:338`

```java
@Override public boolean allowsUpdateChecks()
```

## com.terraformersmc.modmenu.util.mod.fabric.FabricMod.getUpdateChecker

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/fabric/FabricMod.java:347`

```java
@Override public @Nullable UpdateChecker getUpdateChecker()
```

## com.terraformersmc.modmenu.util.mod.fabric.FabricMod.setUpdateChecker

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/fabric/FabricMod.java:352`

```java
@Override public void setUpdateChecker(@Nullable UpdateChecker updateChecker)
```

## com.terraformersmc.modmenu.util.mod.fabric.FabricMod.getUpdateInfo

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/fabric/FabricMod.java:357`

```java
@Override public @Nullable UpdateInfo getUpdateInfo()
```

## com.terraformersmc.modmenu.util.mod.fabric.FabricMod.setUpdateInfo

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/fabric/FabricMod.java:362`

```java
@Override public void setUpdateInfo(@Nullable UpdateInfo updateInfo)
```

## com.terraformersmc.modmenu.util.mod.fabric.FabricMod.getModMenuData

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/fabric/FabricMod.java:371`

```java
public ModMenuData getModMenuData()
```

## com.terraformersmc.modmenu.util.mod.fabric.FabricMod.getSha512Hash

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/fabric/FabricMod.java:375`

```java
public @Nullable String getSha512Hash() throws IOException
```

## com.terraformersmc.modmenu.util.mod.fabric.FabricMod.getChildHasUpdate

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/fabric/FabricMod.java:392`

```java
@Override public boolean getChildHasUpdate()
```

## com.terraformersmc.modmenu.util.mod.fabric.FabricMod.setChildHasUpdate

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/fabric/FabricMod.java:397`

```java
@Override public void setChildHasUpdate()
```

## com.terraformersmc.modmenu.util.mod.fabric.FabricMod.isHidden

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/fabric/FabricMod.java:402`

```java
@Override public boolean isHidden()
```

## com.terraformersmc.modmenu.util.mod.fabric.FabricMod.ModMenuData.ModMenuData

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/fabric/FabricMod.java:413`

```java
public ModMenuData(Set<String> badges, Optional<String> parent, DummyParentData dummyParentData, String id)
```

## com.terraformersmc.modmenu.util.mod.fabric.FabricMod.ModMenuData.getBadges

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/fabric/FabricMod.java:419`

```java
public Set<Badge> getBadges()
```

## com.terraformersmc.modmenu.util.mod.fabric.FabricMod.ModMenuData.getParent

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/fabric/FabricMod.java:423`

```java
public Optional<String> getParent()
```

## com.terraformersmc.modmenu.util.mod.fabric.FabricMod.ModMenuData.getDummyParentData

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/fabric/FabricMod.java:427`

```java
public @Nullable DummyParentData getDummyParentData()
```

## com.terraformersmc.modmenu.util.mod.fabric.FabricMod.ModMenuData.addClientBadge

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/fabric/FabricMod.java:431`

```java
public void addClientBadge(boolean add)
```

## com.terraformersmc.modmenu.util.mod.fabric.FabricMod.ModMenuData.addLibraryBadge

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/fabric/FabricMod.java:437`

```java
public void addLibraryBadge(boolean add)
```

## com.terraformersmc.modmenu.util.mod.fabric.FabricMod.ModMenuData.fillParentIfEmpty

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/fabric/FabricMod.java:443`

```java
public void fillParentIfEmpty(String parent)
```

## com.terraformersmc.modmenu.util.mod.fabric.FabricMod.ModMenuData.DummyParentData

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/fabric/FabricMod.java:449`

```java
public static class DummyParentData
```

## com.terraformersmc.modmenu.util.mod.fabric.FabricMod.ModMenuData.DummyParentData.DummyParentData

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/fabric/FabricMod.java:456`

```java
public DummyParentData( String id, Optional<String> name, Optional<String> description, Optional<String> icon, Set<String> badges )
```

## com.terraformersmc.modmenu.util.mod.fabric.FabricMod.ModMenuData.DummyParentData.getId

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/fabric/FabricMod.java:470`

```java
public String getId()
```

## com.terraformersmc.modmenu.util.mod.fabric.FabricMod.ModMenuData.DummyParentData.getName

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/fabric/FabricMod.java:474`

```java
public Optional<String> getName()
```

## com.terraformersmc.modmenu.util.mod.fabric.FabricMod.ModMenuData.DummyParentData.getDescription

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/fabric/FabricMod.java:478`

```java
public Optional<String> getDescription()
```

## com.terraformersmc.modmenu.util.mod.fabric.FabricMod.ModMenuData.DummyParentData.getIcon

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/fabric/FabricMod.java:482`

```java
public Optional<String> getIcon()
```

## com.terraformersmc.modmenu.util.mod.fabric.FabricMod.ModMenuData.DummyParentData.getBadges

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/fabric/FabricMod.java:486`

```java
public Set<Badge> getBadges()
```

## com.terraformersmc.modmenu.util.mod.quilt.QuiltLoaderUpdateChecker

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/quilt/QuiltLoaderUpdateChecker.java:22`

```java
public class QuiltLoaderUpdateChecker implements UpdateChecker
```

## com.terraformersmc.modmenu.util.mod.quilt.QuiltLoaderUpdateChecker.LOGGER

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/quilt/QuiltLoaderUpdateChecker.java:23`

```java
public static final Logger LOGGER = LoggerFactory.getLogger("Mod Menu/Quilt Update Checker")
```

## com.terraformersmc.modmenu.util.mod.quilt.QuiltLoaderUpdateChecker.checkForUpdates

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/quilt/QuiltLoaderUpdateChecker.java:26`

```java
@Override public UpdateInfo checkForUpdates()
```

## com.terraformersmc.modmenu.util.mod.quilt.QuiltMod

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/quilt/QuiltMod.java:21`

```java
public class QuiltMod extends FabricMod
```

## com.terraformersmc.modmenu.util.mod.quilt.QuiltMod.container

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/quilt/QuiltMod.java:22`

```java
protected final ModContainer container
```

## com.terraformersmc.modmenu.util.mod.quilt.QuiltMod.metadata

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/quilt/QuiltMod.java:23`

```java
protected final ModMetadata metadata
```

## com.terraformersmc.modmenu.util.mod.quilt.QuiltMod.QuiltMod

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/quilt/QuiltMod.java:25`

```java
public QuiltMod(net.fabricmc.loader.api.ModContainer fabricModContainer, Set<String> modpackMods)
```

## com.terraformersmc.modmenu.util.mod.quilt.QuiltMod.getAuthors

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/quilt/QuiltMod.java:34`

```java
@Override public @NotNull List<String> getAuthors()
```

## com.terraformersmc.modmenu.util.mod.quilt.QuiltMod.getContributors

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/quilt/QuiltMod.java:59`

```java
@Override public @NotNull Map<String, Collection<String>> getContributors()
```

## com.terraformersmc.modmenu.util.mod.quilt.QuiltMod.getCredits

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/quilt/QuiltMod.java:70`

```java
@Override public @NotNull SortedMap<String, Set<String>> getCredits()
```

## com.terraformersmc.modmenu.util.mod.quilt.QuiltMod.getSha512Hash

Nguồn: `upstream/ModMenu-1.21.11/src/main/java/com/terraformersmc/modmenu/util/mod/quilt/QuiltMod.java:87`

```java
public @Nullable String getSha512Hash() throws IOException
```
