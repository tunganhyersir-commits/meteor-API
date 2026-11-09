# gui

Khai báo Java có cú pháp public/protected. Không bao gồm API kế thừa/tổng hợp bởi compiler; xem kiểm tra bytecode riêng.

## meteordevelopment.meteorclient.gui.DefaultSettingsWidgetFactory

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/DefaultSettingsWidgetFactory.java:41`

```java
public class DefaultSettingsWidgetFactory extends SettingsWidgetFactory
```

## meteordevelopment.meteorclient.gui.DefaultSettingsWidgetFactory.DefaultSettingsWidgetFactory

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/DefaultSettingsWidgetFactory.java:44`

```java
public DefaultSettingsWidgetFactory(GuiTheme theme)
```

## meteordevelopment.meteorclient.gui.DefaultSettingsWidgetFactory.create

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/DefaultSettingsWidgetFactory.java:82`

```java
@Override public WWidget create(GuiTheme theme, Settings settings, String filter)
```

## meteordevelopment.meteorclient.gui.DefaultSettingsWidgetFactory.settingTitleTopMargin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/DefaultSettingsWidgetFactory.java:106`

```java
protected double settingTitleTopMargin()
```

## meteordevelopment.meteorclient.gui.GuiKeyEvents

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/GuiKeyEvents.java:8`

```java
public class GuiKeyEvents
```

## meteordevelopment.meteorclient.gui.GuiKeyEvents.canUseKeys

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/GuiKeyEvents.java:9`

```java
public static boolean canUseKeys = true
```

## meteordevelopment.meteorclient.gui.GuiTheme

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:39`

```java
public abstract class GuiTheme implements ISerializable<GuiTheme>
```

## meteordevelopment.meteorclient.gui.GuiTheme.TITLE_TEXT_SCALE

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:40`

```java
public static final double TITLE_TEXT_SCALE = 1.25
```

## meteordevelopment.meteorclient.gui.GuiTheme.name

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:42`

```java
public final String name
```

## meteordevelopment.meteorclient.gui.GuiTheme.settings

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:43`

```java
public final Settings settings = new Settings()
```

## meteordevelopment.meteorclient.gui.GuiTheme.disableHoverColor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:45`

```java
public boolean disableHoverColor
```

## meteordevelopment.meteorclient.gui.GuiTheme.settingsFactory

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:47`

```java
protected SettingsWidgetFactory settingsFactory
```

## meteordevelopment.meteorclient.gui.GuiTheme.windowConfigs

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:49`

```java
protected final Map<String, WindowConfig> windowConfigs = new HashMap<>()
```

## meteordevelopment.meteorclient.gui.GuiTheme.GuiTheme

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:51`

```java
public GuiTheme(String name)
```

## meteordevelopment.meteorclient.gui.GuiTheme.beforeRender

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:55`

```java
public void beforeRender()
```

## meteordevelopment.meteorclient.gui.GuiTheme.window

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:61`

```java
public abstract WWindow window(WWidget icon, String title)
```

## meteordevelopment.meteorclient.gui.GuiTheme.window

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:63`

```java
public WWindow window(String title)
```

## meteordevelopment.meteorclient.gui.GuiTheme.label

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:67`

```java
public abstract WLabel label(String text, boolean title, double maxWidth)
```

## meteordevelopment.meteorclient.gui.GuiTheme.label

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:69`

```java
public WLabel label(String text, boolean title)
```

## meteordevelopment.meteorclient.gui.GuiTheme.label

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:73`

```java
public WLabel label(String text, double maxWidth)
```

## meteordevelopment.meteorclient.gui.GuiTheme.label

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:77`

```java
public WLabel label(String text)
```

## meteordevelopment.meteorclient.gui.GuiTheme.horizontalSeparator

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:81`

```java
public abstract WHorizontalSeparator horizontalSeparator(String text)
```

## meteordevelopment.meteorclient.gui.GuiTheme.horizontalSeparator

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:83`

```java
public WHorizontalSeparator horizontalSeparator()
```

## meteordevelopment.meteorclient.gui.GuiTheme.verticalSeparator

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:87`

```java
public abstract WVerticalSeparator verticalSeparator()
```

## meteordevelopment.meteorclient.gui.GuiTheme.button

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:89`

```java
protected abstract WButton button(String text, GuiTexture texture)
```

## meteordevelopment.meteorclient.gui.GuiTheme.button

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:91`

```java
public WButton button(String text)
```

## meteordevelopment.meteorclient.gui.GuiTheme.button

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:95`

```java
public WButton button(GuiTexture texture)
```

## meteordevelopment.meteorclient.gui.GuiTheme.confirmedButton

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:99`

```java
protected abstract WConfirmedButton confirmedButton(String text, String confirmText, GuiTexture texture)
```

## meteordevelopment.meteorclient.gui.GuiTheme.confirmedButton

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:101`

```java
public WConfirmedButton confirmedButton(String text, String confirmText)
```

## meteordevelopment.meteorclient.gui.GuiTheme.confirmedButton

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:105`

```java
public WConfirmedButton confirmedButton(GuiTexture texture)
```

## meteordevelopment.meteorclient.gui.GuiTheme.minus

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:109`

```java
public abstract WMinus minus()
```

## meteordevelopment.meteorclient.gui.GuiTheme.confirmedMinus

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:111`

```java
public abstract WConfirmedMinus confirmedMinus()
```

## meteordevelopment.meteorclient.gui.GuiTheme.plus

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:113`

```java
public abstract WPlus plus()
```

## meteordevelopment.meteorclient.gui.GuiTheme.checkbox

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:115`

```java
public abstract WCheckbox checkbox(boolean checked)
```

## meteordevelopment.meteorclient.gui.GuiTheme.slider

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:117`

```java
public abstract WSlider slider(double value, double min, double max)
```

## meteordevelopment.meteorclient.gui.GuiTheme.textBox

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:119`

```java
public abstract WTextBox textBox(String text, String placeholder, CharFilter filter, Class<? extends WTextBox.Renderer> renderer)
```

## meteordevelopment.meteorclient.gui.GuiTheme.textBox

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:121`

```java
public WTextBox textBox(String text, CharFilter filter, Class<? extends WTextBox.Renderer> renderer)
```

## meteordevelopment.meteorclient.gui.GuiTheme.textBox

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:125`

```java
public WTextBox textBox(String text, String placeholder, CharFilter filter)
```

## meteordevelopment.meteorclient.gui.GuiTheme.textBox

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:129`

```java
public WTextBox textBox(String text, CharFilter filter)
```

## meteordevelopment.meteorclient.gui.GuiTheme.textBox

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:133`

```java
public WTextBox textBox(String text, String placeholder)
```

## meteordevelopment.meteorclient.gui.GuiTheme.textBox

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:137`

```java
public WTextBox textBox(String text)
```

## meteordevelopment.meteorclient.gui.GuiTheme.dropdown

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:141`

```java
public abstract <T> WDropdown<T> dropdown(T[] values, T value)
```

## meteordevelopment.meteorclient.gui.GuiTheme.dropdown

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:143`

```java
@SuppressWarnings("unchecked") public <T extends Enum<?>> WDropdown<T> dropdown(T value)
```

## meteordevelopment.meteorclient.gui.GuiTheme.triangle

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:150`

```java
public abstract WTriangle triangle()
```

## meteordevelopment.meteorclient.gui.GuiTheme.tooltip

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:152`

```java
public abstract WTooltip tooltip(String text)
```

## meteordevelopment.meteorclient.gui.GuiTheme.view

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:154`

```java
public abstract WView view()
```

## meteordevelopment.meteorclient.gui.GuiTheme.verticalList

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:156`

```java
public WVerticalList verticalList()
```

## meteordevelopment.meteorclient.gui.GuiTheme.horizontalList

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:160`

```java
public WHorizontalList horizontalList()
```

## meteordevelopment.meteorclient.gui.GuiTheme.table

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:164`

```java
public WTable table()
```

## meteordevelopment.meteorclient.gui.GuiTheme.section

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:168`

```java
public abstract WSection section(String title, boolean expanded, WWidget headerWidget)
```

## meteordevelopment.meteorclient.gui.GuiTheme.section

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:170`

```java
public WSection section(String title, boolean expanded)
```

## meteordevelopment.meteorclient.gui.GuiTheme.section

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:174`

```java
public WSection section(String title)
```

## meteordevelopment.meteorclient.gui.GuiTheme.account

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:178`

```java
public abstract WAccount account(WidgetScreen screen, Account<?> account)
```

## meteordevelopment.meteorclient.gui.GuiTheme.module

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:180`

```java
public WWidget module(Module module)
```

## meteordevelopment.meteorclient.gui.GuiTheme.module

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:184`

```java
public abstract WWidget module(Module module, String title)
```

## meteordevelopment.meteorclient.gui.GuiTheme.quad

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:186`

```java
public abstract WQuad quad(Color color)
```

## meteordevelopment.meteorclient.gui.GuiTheme.topBar

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:188`

```java
public abstract WTopBar topBar()
```

## meteordevelopment.meteorclient.gui.GuiTheme.favorite

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:190`

```java
public abstract WFavorite favorite(boolean checked)
```

## meteordevelopment.meteorclient.gui.GuiTheme.item

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:192`

```java
public WItem item(ItemStack itemStack)
```

## meteordevelopment.meteorclient.gui.GuiTheme.itemWithLabel

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:196`

```java
public WItemWithLabel itemWithLabel(ItemStack stack, String name)
```

## meteordevelopment.meteorclient.gui.GuiTheme.itemWithLabel

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:200`

```java
public WItemWithLabel itemWithLabel(ItemStack stack)
```

## meteordevelopment.meteorclient.gui.GuiTheme.texture

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:204`

```java
public WTexture texture(double width, double height, double rotation, Texture texture)
```

## meteordevelopment.meteorclient.gui.GuiTheme.intEdit

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:208`

```java
public WIntEdit intEdit(int value, int min, int max, int sliderMin, int sliderMax, boolean noSlider)
```

## meteordevelopment.meteorclient.gui.GuiTheme.intEdit

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:212`

```java
public WIntEdit intEdit(int value, int min, int max, int sliderMin, int sliderMax)
```

## meteordevelopment.meteorclient.gui.GuiTheme.intEdit

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:216`

```java
public WIntEdit intEdit(int value, int min, int max, boolean noSlider)
```

## meteordevelopment.meteorclient.gui.GuiTheme.longEdit

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:220`

```java
public WLongEdit longEdit(long value, long min, long max)
```

## meteordevelopment.meteorclient.gui.GuiTheme.doubleEdit

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:224`

```java
public WDoubleEdit doubleEdit(double value, double min, double max, double sliderMin, double sliderMax, int decimalPlaces, boolean noSlider)
```

## meteordevelopment.meteorclient.gui.GuiTheme.doubleEdit

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:228`

```java
public WDoubleEdit doubleEdit(double value, double min, double max, double sliderMin, double sliderMax)
```

## meteordevelopment.meteorclient.gui.GuiTheme.doubleEdit

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:232`

```java
public WDoubleEdit doubleEdit(double value, double min, double max)
```

## meteordevelopment.meteorclient.gui.GuiTheme.blockPosEdit

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:236`

```java
public WBlockPosEdit blockPosEdit(BlockPos value)
```

## meteordevelopment.meteorclient.gui.GuiTheme.keybind

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:240`

```java
public WKeybind keybind(Keybind keybind)
```

## meteordevelopment.meteorclient.gui.GuiTheme.keybind

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:244`

```java
public WKeybind keybind(Keybind keybind, Keybind defaultValue)
```

## meteordevelopment.meteorclient.gui.GuiTheme.settings

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:248`

```java
public WWidget settings(Settings settings, String filter)
```

## meteordevelopment.meteorclient.gui.GuiTheme.settings

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:252`

```java
public WWidget settings(Settings settings)
```

## meteordevelopment.meteorclient.gui.GuiTheme.modulesScreen

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:258`

```java
public TabScreen modulesScreen()
```

## meteordevelopment.meteorclient.gui.GuiTheme.isModulesScreen

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:262`

```java
public boolean isModulesScreen(Screen screen)
```

## meteordevelopment.meteorclient.gui.GuiTheme.moduleScreen

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:266`

```java
public WidgetScreen moduleScreen(Module module)
```

## meteordevelopment.meteorclient.gui.GuiTheme.accountsScreen

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:270`

```java
public WidgetScreen accountsScreen()
```

## meteordevelopment.meteorclient.gui.GuiTheme.notebotSongs

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:274`

```java
public NotebotSongsScreen notebotSongs()
```

## meteordevelopment.meteorclient.gui.GuiTheme.proxiesScreen

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:278`

```java
public WidgetScreen proxiesScreen()
```

## meteordevelopment.meteorclient.gui.GuiTheme.textColor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:284`

```java
public abstract Color textColor()
```

## meteordevelopment.meteorclient.gui.GuiTheme.textSecondaryColor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:286`

```java
public abstract Color textSecondaryColor()
```

## meteordevelopment.meteorclient.gui.GuiTheme.starscriptTextColor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:290`

```java
public abstract Color starscriptTextColor()
```

## meteordevelopment.meteorclient.gui.GuiTheme.starscriptBraceColor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:292`

```java
public abstract Color starscriptBraceColor()
```

## meteordevelopment.meteorclient.gui.GuiTheme.starscriptParenthesisColor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:294`

```java
public abstract Color starscriptParenthesisColor()
```

## meteordevelopment.meteorclient.gui.GuiTheme.starscriptDotColor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:296`

```java
public abstract Color starscriptDotColor()
```

## meteordevelopment.meteorclient.gui.GuiTheme.starscriptCommaColor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:298`

```java
public abstract Color starscriptCommaColor()
```

## meteordevelopment.meteorclient.gui.GuiTheme.starscriptOperatorColor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:300`

```java
public abstract Color starscriptOperatorColor()
```

## meteordevelopment.meteorclient.gui.GuiTheme.starscriptStringColor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:302`

```java
public abstract Color starscriptStringColor()
```

## meteordevelopment.meteorclient.gui.GuiTheme.starscriptNumberColor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:304`

```java
public abstract Color starscriptNumberColor()
```

## meteordevelopment.meteorclient.gui.GuiTheme.starscriptKeywordColor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:306`

```java
public abstract Color starscriptKeywordColor()
```

## meteordevelopment.meteorclient.gui.GuiTheme.starscriptAccessedObjectColor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:308`

```java
public abstract Color starscriptAccessedObjectColor()
```

## meteordevelopment.meteorclient.gui.GuiTheme.textRenderer

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:312`

```java
public abstract TextRenderer textRenderer()
```

## meteordevelopment.meteorclient.gui.GuiTheme.scale

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:314`

```java
public abstract double scale(double value)
```

## meteordevelopment.meteorclient.gui.GuiTheme.categoryIcons

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:316`

```java
public abstract boolean categoryIcons()
```

## meteordevelopment.meteorclient.gui.GuiTheme.modulesHelpText

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:318`

```java
public abstract boolean modulesHelpText()
```

## meteordevelopment.meteorclient.gui.GuiTheme.hideHUD

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:320`

```java
public abstract boolean hideHUD()
```

## meteordevelopment.meteorclient.gui.GuiTheme.textWidth

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:322`

```java
public double textWidth(String text, int length, boolean title)
```

## meteordevelopment.meteorclient.gui.GuiTheme.textWidth

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:326`

```java
public double textWidth(String text)
```

## meteordevelopment.meteorclient.gui.GuiTheme.textHeight

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:330`

```java
public double textHeight(boolean title)
```

## meteordevelopment.meteorclient.gui.GuiTheme.textHeight

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:334`

```java
public double textHeight()
```

## meteordevelopment.meteorclient.gui.GuiTheme.pad

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:338`

```java
public double pad()
```

## meteordevelopment.meteorclient.gui.GuiTheme.getWindowConfig

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:342`

```java
public WindowConfig getWindowConfig(String id)
```

## meteordevelopment.meteorclient.gui.GuiTheme.clearWindowConfigs

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:351`

```java
public void clearWindowConfigs()
```

## meteordevelopment.meteorclient.gui.GuiTheme.w

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:355`

```java
protected <T extends WWidget> T w(T widget)
```

## meteordevelopment.meteorclient.gui.GuiTheme.toTag

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:362`

```java
@Override public CompoundTag toTag()
```

## meteordevelopment.meteorclient.gui.GuiTheme.fromTag

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:378`

```java
@Override public GuiTheme fromTag(CompoundTag tag)
```

## meteordevelopment.meteorclient.gui.GuiThemes

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/GuiThemes.java:21`

```java
public class GuiThemes
```

## meteordevelopment.meteorclient.gui.GuiThemes.init

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/GuiThemes.java:32`

```java
@PreInit public static void init()
```

## meteordevelopment.meteorclient.gui.GuiThemes.postInit

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/GuiThemes.java:37`

```java
@PostInit public static void postInit()
```

## meteordevelopment.meteorclient.gui.GuiThemes.add

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/GuiThemes.java:52`

```java
public static void add(GuiTheme theme)
```

## meteordevelopment.meteorclient.gui.GuiThemes.select

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/GuiThemes.java:66`

```java
public static void select(String name)
```

## meteordevelopment.meteorclient.gui.GuiThemes.get

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/GuiThemes.java:101`

```java
public static GuiTheme get()
```

## meteordevelopment.meteorclient.gui.GuiThemes.getNames

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/GuiThemes.java:105`

```java
public static String[] getNames()
```

## meteordevelopment.meteorclient.gui.GuiThemes.save

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/GuiThemes.java:142`

```java
public static void save()
```

## meteordevelopment.meteorclient.gui.WidgetScreen

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/WidgetScreen.java:42`

```java
public abstract class WidgetScreen extends Screen
```

## meteordevelopment.meteorclient.gui.WidgetScreen.taskAfterRender

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/WidgetScreen.java:46`

```java
public Runnable taskAfterRender
```

## meteordevelopment.meteorclient.gui.WidgetScreen.enterAction

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/WidgetScreen.java:47`

```java
protected Runnable enterAction
```

## meteordevelopment.meteorclient.gui.WidgetScreen.parent

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/WidgetScreen.java:49`

```java
public Screen parent
```

## meteordevelopment.meteorclient.gui.WidgetScreen.theme

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/WidgetScreen.java:52`

```java
protected final GuiTheme theme
```

## meteordevelopment.meteorclient.gui.WidgetScreen.locked

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/WidgetScreen.java:54`

```java
public boolean locked, lockedAllowClose
```

## meteordevelopment.meteorclient.gui.WidgetScreen.lockedAllowClose

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/WidgetScreen.java:54`

```java
public boolean locked, lockedAllowClose
```

## meteordevelopment.meteorclient.gui.WidgetScreen.animProgress

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/WidgetScreen.java:63`

```java
public double animProgress
```

## meteordevelopment.meteorclient.gui.WidgetScreen.firstInit

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/WidgetScreen.java:67`

```java
protected boolean firstInit = true
```

## meteordevelopment.meteorclient.gui.WidgetScreen.WidgetScreen

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/WidgetScreen.java:69`

```java
public WidgetScreen(GuiTheme theme, String title)
```

## meteordevelopment.meteorclient.gui.WidgetScreen.add

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/WidgetScreen.java:87`

```java
public <W extends WWidget> Cell<W> add(W widget)
```

## meteordevelopment.meteorclient.gui.WidgetScreen.clear

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/WidgetScreen.java:91`

```java
public void clear()
```

## meteordevelopment.meteorclient.gui.WidgetScreen.invalidate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/WidgetScreen.java:95`

```java
public void invalidate()
```

## meteordevelopment.meteorclient.gui.WidgetScreen.init

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/WidgetScreen.java:99`

```java
@Override protected void init()
```

## meteordevelopment.meteorclient.gui.WidgetScreen.initWidgets

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/WidgetScreen.java:113`

```java
public abstract void initWidgets()
```

## meteordevelopment.meteorclient.gui.WidgetScreen.reload

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/WidgetScreen.java:115`

```java
public void reload()
```

## meteordevelopment.meteorclient.gui.WidgetScreen.onClosed

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/WidgetScreen.java:120`

```java
public void onClosed(Runnable action)
```

## meteordevelopment.meteorclient.gui.WidgetScreen.mouseClicked

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/WidgetScreen.java:125`

```java
@Override public boolean mouseClicked(@NonNull MouseButtonEvent click, boolean doubled)
```

## meteordevelopment.meteorclient.gui.WidgetScreen.mouseReleased

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/WidgetScreen.java:146`

```java
@Override public boolean mouseReleased(@NonNull MouseButtonEvent click)
```

## meteordevelopment.meteorclient.gui.WidgetScreen.mouseMoved

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/WidgetScreen.java:163`

```java
@Override public void mouseMoved(double mouseX, double mouseY)
```

## meteordevelopment.meteorclient.gui.WidgetScreen.mouseScrolled

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/WidgetScreen.java:177`

```java
@Override public boolean mouseScrolled(double mouseX, double mouseY, double horizontalAmount, double verticalAmount)
```

## meteordevelopment.meteorclient.gui.WidgetScreen.keyReleased

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/WidgetScreen.java:186`

```java
@Override public boolean keyReleased(@NonNull KeyEvent event)
```

## meteordevelopment.meteorclient.gui.WidgetScreen.keyPressed

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/WidgetScreen.java:207`

```java
@Override public boolean keyPressed(@NonNull KeyEvent input)
```

## meteordevelopment.meteorclient.gui.WidgetScreen.keyRepeated

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/WidgetScreen.java:254`

```java
public void keyRepeated(KeyEvent input)
```

## meteordevelopment.meteorclient.gui.WidgetScreen.charTyped

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/WidgetScreen.java:260`

```java
@Override public boolean charTyped(@NonNull CharacterEvent input)
```

## meteordevelopment.meteorclient.gui.WidgetScreen.extractBackground

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/WidgetScreen.java:267`

```java
@Override public void extractBackground(@NonNull GuiGraphicsExtractor graphics, int mouseX, int mouseY, float deltaTicks)
```

## meteordevelopment.meteorclient.gui.WidgetScreen.renderCustom

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/WidgetScreen.java:274`

```java
public void renderCustom(GuiGraphicsExtractor graphics, int mouseX, int mouseY, float delta)
```

## meteordevelopment.meteorclient.gui.WidgetScreen.runAfterRenderTasks

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/WidgetScreen.java:314`

```java
protected void runAfterRenderTasks()
```

## meteordevelopment.meteorclient.gui.WidgetScreen.onRenderBefore

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/WidgetScreen.java:321`

```java
protected void onRenderBefore(GuiGraphicsExtractor graphics, int mouseX, int mouseY, float delta)
```

## meteordevelopment.meteorclient.gui.WidgetScreen.resize

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/WidgetScreen.java:324`

```java
@Override public void resize(int width, int height)
```

## meteordevelopment.meteorclient.gui.WidgetScreen.onClose

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/WidgetScreen.java:330`

```java
@Override public void onClose()
```

## meteordevelopment.meteorclient.gui.WidgetScreen.removed

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/WidgetScreen.java:337`

```java
@Override public void removed()
```

## meteordevelopment.meteorclient.gui.WidgetScreen.onClosed

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/WidgetScreen.java:393`

```java
protected void onClosed()
```

## meteordevelopment.meteorclient.gui.WidgetScreen.toClipboard

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/WidgetScreen.java:396`

```java
public boolean toClipboard()
```

## meteordevelopment.meteorclient.gui.WidgetScreen.fromClipboard

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/WidgetScreen.java:400`

```java
public boolean fromClipboard()
```

## meteordevelopment.meteorclient.gui.WidgetScreen.shouldCloseOnEsc

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/WidgetScreen.java:404`

```java
@Override public boolean shouldCloseOnEsc()
```

## meteordevelopment.meteorclient.gui.WidgetScreen.isPauseScreen

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/WidgetScreen.java:409`

```java
@Override public boolean isPauseScreen()
```

## meteordevelopment.meteorclient.gui.WindowScreen

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/WindowScreen.java:12`

```java
public abstract class WindowScreen extends WidgetScreen
```

## meteordevelopment.meteorclient.gui.WindowScreen.window

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/WindowScreen.java:13`

```java
protected final WWindow window
```

## meteordevelopment.meteorclient.gui.WindowScreen.WindowScreen

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/WindowScreen.java:15`

```java
public WindowScreen(GuiTheme theme, WWidget icon, String title)
```

## meteordevelopment.meteorclient.gui.WindowScreen.WindowScreen

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/WindowScreen.java:22`

```java
public WindowScreen(GuiTheme theme, String title)
```

## meteordevelopment.meteorclient.gui.WindowScreen.add

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/WindowScreen.java:26`

```java
@Override public <W extends WWidget> Cell<W> add(W widget)
```

## meteordevelopment.meteorclient.gui.WindowScreen.clear

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/WindowScreen.java:31`

```java
@Override public void clear()
```

## meteordevelopment.meteorclient.gui.renderer.GuiDebugRenderer

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/renderer/GuiDebugRenderer.java:19`

```java
public class GuiDebugRenderer
```

## meteordevelopment.meteorclient.gui.renderer.GuiDebugRenderer.render

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/renderer/GuiDebugRenderer.java:25`

```java
public void render(WWidget widget)
```

## meteordevelopment.meteorclient.gui.renderer.GuiDebugRenderer.mouseReleased

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/renderer/GuiDebugRenderer.java:39`

```java
public void mouseReleased(WWidget widget, MouseButtonEvent click, int i)
```

## meteordevelopment.meteorclient.gui.renderer.GuiRenderOperation

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/renderer/GuiRenderOperation.java:11`

```java
public abstract class GuiRenderOperation<T extends GuiRenderOperation<T>>
```

## meteordevelopment.meteorclient.gui.renderer.GuiRenderOperation.x

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/renderer/GuiRenderOperation.java:12`

```java
protected double x, y
```

## meteordevelopment.meteorclient.gui.renderer.GuiRenderOperation.y

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/renderer/GuiRenderOperation.java:12`

```java
protected double x, y
```

## meteordevelopment.meteorclient.gui.renderer.GuiRenderOperation.color

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/renderer/GuiRenderOperation.java:13`

```java
protected Color color
```

## meteordevelopment.meteorclient.gui.renderer.GuiRenderOperation.set

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/renderer/GuiRenderOperation.java:15`

```java
public void set(double x, double y, Color color)
```

## meteordevelopment.meteorclient.gui.renderer.GuiRenderOperation.run

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/renderer/GuiRenderOperation.java:21`

```java
@SuppressWarnings("unchecked") public void run(Pool<T> pool)
```

## meteordevelopment.meteorclient.gui.renderer.GuiRenderOperation.onRun

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/renderer/GuiRenderOperation.java:27`

```java
protected abstract void onRun()
```

## meteordevelopment.meteorclient.gui.renderer.GuiRenderer

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/renderer/GuiRenderer.java:33`

```java
public class GuiRenderer
```

## meteordevelopment.meteorclient.gui.renderer.GuiRenderer.CIRCLE

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/renderer/GuiRenderer.java:39`

```java
public static GuiTexture CIRCLE
```

## meteordevelopment.meteorclient.gui.renderer.GuiRenderer.TRIANGLE

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/renderer/GuiRenderer.java:40`

```java
public static GuiTexture TRIANGLE
```

## meteordevelopment.meteorclient.gui.renderer.GuiRenderer.EDIT

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/renderer/GuiRenderer.java:41`

```java
public static GuiTexture EDIT
```

## meteordevelopment.meteorclient.gui.renderer.GuiRenderer.RESET

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/renderer/GuiRenderer.java:42`

```java
public static GuiTexture RESET
```

## meteordevelopment.meteorclient.gui.renderer.GuiRenderer.FAVORITE_NO

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/renderer/GuiRenderer.java:43`

```java
public static GuiTexture FAVORITE_NO, FAVORITE_YES
```

## meteordevelopment.meteorclient.gui.renderer.GuiRenderer.FAVORITE_YES

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/renderer/GuiRenderer.java:43`

```java
public static GuiTexture FAVORITE_NO, FAVORITE_YES
```

## meteordevelopment.meteorclient.gui.renderer.GuiRenderer.COPY

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/renderer/GuiRenderer.java:44`

```java
public static GuiTexture COPY, PASTE
```

## meteordevelopment.meteorclient.gui.renderer.GuiRenderer.PASTE

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/renderer/GuiRenderer.java:44`

```java
public static GuiTexture COPY, PASTE
```

## meteordevelopment.meteorclient.gui.renderer.GuiRenderer.theme

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/renderer/GuiRenderer.java:46`

```java
public GuiTheme theme
```

## meteordevelopment.meteorclient.gui.renderer.GuiRenderer.tooltip

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/renderer/GuiRenderer.java:59`

```java
public String tooltip, lastTooltip
```

## meteordevelopment.meteorclient.gui.renderer.GuiRenderer.lastTooltip

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/renderer/GuiRenderer.java:59`

```java
public String tooltip, lastTooltip
```

## meteordevelopment.meteorclient.gui.renderer.GuiRenderer.tooltipWidget

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/renderer/GuiRenderer.java:60`

```java
public WWidget tooltipWidget
```

## meteordevelopment.meteorclient.gui.renderer.GuiRenderer.addTexture

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/renderer/GuiRenderer.java:65`

```java
public static GuiTexture addTexture(Identifier id)
```

## meteordevelopment.meteorclient.gui.renderer.GuiRenderer.init

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/renderer/GuiRenderer.java:69`

```java
@PostInit public static void init()
```

## meteordevelopment.meteorclient.gui.renderer.GuiRenderer.begin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/renderer/GuiRenderer.java:84`

```java
public void begin(GuiGraphicsExtractor graphics)
```

## meteordevelopment.meteorclient.gui.renderer.GuiRenderer.end

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/renderer/GuiRenderer.java:95`

```java
public void end()
```

## meteordevelopment.meteorclient.gui.renderer.GuiRenderer.beginRender

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/renderer/GuiRenderer.java:105`

```java
public void beginRender()
```

## meteordevelopment.meteorclient.gui.renderer.GuiRenderer.endRender

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/renderer/GuiRenderer.java:110`

```java
public void endRender()
```

## meteordevelopment.meteorclient.gui.renderer.GuiRenderer.endRender

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/renderer/GuiRenderer.java:114`

```java
public void endRender(Scissor scissor)
```

## meteordevelopment.meteorclient.gui.renderer.GuiRenderer.scissorStart

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/renderer/GuiRenderer.java:142`

```java
public void scissorStart(double x, double y, double width, double height)
```

## meteordevelopment.meteorclient.gui.renderer.GuiRenderer.scissorEnd

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/renderer/GuiRenderer.java:161`

```java
public void scissorEnd()
```

## meteordevelopment.meteorclient.gui.renderer.GuiRenderer.renderTooltip

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/renderer/GuiRenderer.java:176`

```java
public boolean renderTooltip(GuiGraphicsExtractor graphics, double mouseX, double mouseY, double delta)
```

## meteordevelopment.meteorclient.gui.renderer.GuiRenderer.setAlpha

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/renderer/GuiRenderer.java:214`

```java
public void setAlpha(double a)
```

## meteordevelopment.meteorclient.gui.renderer.GuiRenderer.tooltip

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/renderer/GuiRenderer.java:221`

```java
public void tooltip(String text)
```

## meteordevelopment.meteorclient.gui.renderer.GuiRenderer.quad

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/renderer/GuiRenderer.java:225`

```java
public void quad(double x, double y, double width, double height, Color cTopLeft, Color cTopRight, Color cBottomRight, Color cBottomLeft)
```

## meteordevelopment.meteorclient.gui.renderer.GuiRenderer.quad

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/renderer/GuiRenderer.java:229`

```java
public void quad(double x, double y, double width, double height, Color colorLeft, Color colorRight)
```

## meteordevelopment.meteorclient.gui.renderer.GuiRenderer.quad

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/renderer/GuiRenderer.java:233`

```java
public void quad(double x, double y, double width, double height, Color color)
```

## meteordevelopment.meteorclient.gui.renderer.GuiRenderer.quad

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/renderer/GuiRenderer.java:237`

```java
public void quad(WWidget widget, Color color)
```

## meteordevelopment.meteorclient.gui.renderer.GuiRenderer.fill

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/renderer/GuiRenderer.java:241`

```java
public void fill(WWidget widget, Color color)
```

## meteordevelopment.meteorclient.gui.renderer.GuiRenderer.quad

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/renderer/GuiRenderer.java:245`

```java
public void quad(double x, double y, double width, double height, GuiTexture texture, Color color)
```

## meteordevelopment.meteorclient.gui.renderer.GuiRenderer.rotatedQuad

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/renderer/GuiRenderer.java:249`

```java
public void rotatedQuad(double x, double y, double width, double height, double rotation, GuiTexture texture, Color color)
```

## meteordevelopment.meteorclient.gui.renderer.GuiRenderer.triangle

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/renderer/GuiRenderer.java:253`

```java
public void triangle(double x1, double y1, double x2, double y2, double x3, double y3, Color color)
```

## meteordevelopment.meteorclient.gui.renderer.GuiRenderer.text

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/renderer/GuiRenderer.java:257`

```java
public void text(String text, double x, double y, Color color, boolean title)
```

## meteordevelopment.meteorclient.gui.renderer.GuiRenderer.texture

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/renderer/GuiRenderer.java:261`

```java
public void texture(double x, double y, double width, double height, double rotation, Texture texture)
```

## meteordevelopment.meteorclient.gui.renderer.GuiRenderer.post

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/renderer/GuiRenderer.java:271`

```java
public void post(Runnable task)
```

## meteordevelopment.meteorclient.gui.renderer.GuiRenderer.item

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/renderer/GuiRenderer.java:275`

```java
public void item(ItemStack itemStack, int x, int y, float scale, boolean overlay)
```

## meteordevelopment.meteorclient.gui.renderer.GuiRenderer.absolutePost

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/renderer/GuiRenderer.java:279`

```java
public void absolutePost(Runnable task)
```

## meteordevelopment.meteorclient.gui.renderer.Scissor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/renderer/Scissor.java:16`

```java
public class Scissor
```

## meteordevelopment.meteorclient.gui.renderer.Scissor.x

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/renderer/Scissor.java:17`

```java
public int x, y
```

## meteordevelopment.meteorclient.gui.renderer.Scissor.y

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/renderer/Scissor.java:17`

```java
public int x, y
```

## meteordevelopment.meteorclient.gui.renderer.Scissor.width

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/renderer/Scissor.java:18`

```java
public int width, height
```

## meteordevelopment.meteorclient.gui.renderer.Scissor.height

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/renderer/Scissor.java:18`

```java
public int width, height
```

## meteordevelopment.meteorclient.gui.renderer.Scissor.postTasks

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/renderer/Scissor.java:20`

```java
public final List<Runnable> postTasks = new ArrayList<>()
```

## meteordevelopment.meteorclient.gui.renderer.Scissor.set

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/renderer/Scissor.java:22`

```java
public Scissor set(double x, double y, double width, double height)
```

## meteordevelopment.meteorclient.gui.renderer.Scissor.push

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/renderer/Scissor.java:36`

```java
public void push()
```

## meteordevelopment.meteorclient.gui.renderer.Scissor.pop

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/renderer/Scissor.java:40`

```java
public void pop()
```

## meteordevelopment.meteorclient.gui.renderer.operations.TextOperation

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/renderer/operations/TextOperation.java:11`

```java
public class TextOperation extends GuiRenderOperation<TextOperation>
```

## meteordevelopment.meteorclient.gui.renderer.operations.TextOperation.title

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/renderer/operations/TextOperation.java:15`

```java
public boolean title
```

## meteordevelopment.meteorclient.gui.renderer.operations.TextOperation.set

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/renderer/operations/TextOperation.java:17`

```java
public TextOperation set(String text, TextRenderer renderer, boolean title)
```

## meteordevelopment.meteorclient.gui.renderer.operations.TextOperation.onRun

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/renderer/operations/TextOperation.java:25`

```java
@Override protected void onRun()
```

## meteordevelopment.meteorclient.gui.renderer.packer.GuiTexture

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/renderer/packer/GuiTexture.java:11`

```java
public class GuiTexture
```

## meteordevelopment.meteorclient.gui.renderer.packer.GuiTexture.get

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/renderer/packer/GuiTexture.java:18`

```java
public TextureRegion get(double width, double height)
```

## meteordevelopment.meteorclient.gui.renderer.packer.TexturePacker

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/renderer/packer/TexturePacker.java:29`

```java
public class TexturePacker
```

## meteordevelopment.meteorclient.gui.renderer.packer.TexturePacker.add

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/renderer/packer/TexturePacker.java:34`

```java
public GuiTexture add(Identifier id)
```

## meteordevelopment.meteorclient.gui.renderer.packer.TexturePacker.pack

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/renderer/packer/TexturePacker.java:91`

```java
public Texture pack()
```

## meteordevelopment.meteorclient.gui.renderer.packer.TextureRegion

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/renderer/packer/TextureRegion.java:8`

```java
public class TextureRegion
```

## meteordevelopment.meteorclient.gui.renderer.packer.TextureRegion.x1

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/renderer/packer/TextureRegion.java:9`

```java
public double x1, y1
```

## meteordevelopment.meteorclient.gui.renderer.packer.TextureRegion.y1

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/renderer/packer/TextureRegion.java:9`

```java
public double x1, y1
```

## meteordevelopment.meteorclient.gui.renderer.packer.TextureRegion.x2

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/renderer/packer/TextureRegion.java:10`

```java
public double x2, y2
```

## meteordevelopment.meteorclient.gui.renderer.packer.TextureRegion.y2

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/renderer/packer/TextureRegion.java:10`

```java
public double x2, y2
```

## meteordevelopment.meteorclient.gui.renderer.packer.TextureRegion.diagonal

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/renderer/packer/TextureRegion.java:12`

```java
public double diagonal
```

## meteordevelopment.meteorclient.gui.renderer.packer.TextureRegion.TextureRegion

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/renderer/packer/TextureRegion.java:14`

```java
public TextureRegion(double width, double height)
```

## meteordevelopment.meteorclient.gui.screens.CommitsScreen

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/CommitsScreen.java:23`

```java
public class CommitsScreen extends WindowScreen
```

## meteordevelopment.meteorclient.gui.screens.CommitsScreen.CommitsScreen

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/CommitsScreen.java:28`

```java
public CommitsScreen(GuiTheme theme, MeteorAddon addon)
```

## meteordevelopment.meteorclient.gui.screens.CommitsScreen.initWidgets

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/CommitsScreen.java:59`

```java
@Override public void initWidgets()
```

## meteordevelopment.meteorclient.gui.screens.ContainerInventoryScreen

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/ContainerInventoryScreen.java:35`

```java
public class ContainerInventoryScreen extends Screen
```

## meteordevelopment.meteorclient.gui.screens.ContainerInventoryScreen.ContainerInventoryScreen

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/ContainerInventoryScreen.java:48`

```java
public ContainerInventoryScreen(ItemStack containerItem)
```

## meteordevelopment.meteorclient.gui.screens.ContainerInventoryScreen.init

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/ContainerInventoryScreen.java:69`

```java
@Override protected void init()
```

## meteordevelopment.meteorclient.gui.screens.ContainerInventoryScreen.extractRenderState

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/ContainerInventoryScreen.java:76`

```java
@Override public void extractRenderState(@NonNull GuiGraphicsExtractor graphics, int mouseX, int mouseY, float delta)
```

## meteordevelopment.meteorclient.gui.screens.ContainerInventoryScreen.mouseClicked

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/ContainerInventoryScreen.java:133`

```java
@Override public boolean mouseClicked(MouseButtonEvent click, boolean doubled)
```

## meteordevelopment.meteorclient.gui.screens.ContainerInventoryScreen.keyPressed

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/ContainerInventoryScreen.java:145`

```java
@Override public boolean keyPressed(@NonNull KeyEvent input)
```

## meteordevelopment.meteorclient.gui.screens.EditBookTitleAndAuthorScreen

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/EditBookTitleAndAuthorScreen.java:26`

```java
public class EditBookTitleAndAuthorScreen extends WindowScreen
```

## meteordevelopment.meteorclient.gui.screens.EditBookTitleAndAuthorScreen.EditBookTitleAndAuthorScreen

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/EditBookTitleAndAuthorScreen.java:30`

```java
public EditBookTitleAndAuthorScreen(GuiTheme theme, ItemStack itemStack, InteractionHand hand)
```

## meteordevelopment.meteorclient.gui.screens.EditBookTitleAndAuthorScreen.initWidgets

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/EditBookTitleAndAuthorScreen.java:36`

```java
@Override public void initWidgets()
```

## meteordevelopment.meteorclient.gui.screens.EditSystemScreen

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/EditSystemScreen.java:9`

```java
public abstract class EditSystemScreen<T> extends WindowScreen
```

## meteordevelopment.meteorclient.gui.screens.EditSystemScreen.value

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/EditSystemScreen.java:11`

```java
protected final T value
```

## meteordevelopment.meteorclient.gui.screens.EditSystemScreen.isNew

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/EditSystemScreen.java:12`

```java
protected final boolean isNew
```

## meteordevelopment.meteorclient.gui.screens.EditSystemScreen.EditSystemScreen

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/EditSystemScreen.java:15`

```java
public EditSystemScreen(GuiTheme theme, T value, Runnable reload)
```

## meteordevelopment.meteorclient.gui.screens.EditSystemScreen.initWidgets

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/EditSystemScreen.java:23`

```java
@Override public void initWidgets()
```

## meteordevelopment.meteorclient.gui.screens.EditSystemScreen.tick

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/EditSystemScreen.java:38`

```java
@Override public void tick()
```

## meteordevelopment.meteorclient.gui.screens.EditSystemScreen.onClosed

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/EditSystemScreen.java:43`

```java
@Override protected void onClosed()
```

## meteordevelopment.meteorclient.gui.screens.EditSystemScreen.create

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/EditSystemScreen.java:48`

```java
public abstract T create()
```

## meteordevelopment.meteorclient.gui.screens.EditSystemScreen.save

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/EditSystemScreen.java:50`

```java
public abstract boolean save()
```

## meteordevelopment.meteorclient.gui.screens.EditSystemScreen.getSettings

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/EditSystemScreen.java:52`

```java
public abstract Settings getSettings()
```

## meteordevelopment.meteorclient.gui.screens.MarkerScreen

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/MarkerScreen.java:15`

```java
public class MarkerScreen extends WindowScreen
```

## meteordevelopment.meteorclient.gui.screens.MarkerScreen.MarkerScreen

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/MarkerScreen.java:19`

```java
public MarkerScreen(GuiTheme theme, BaseMarker marker)
```

## meteordevelopment.meteorclient.gui.screens.MarkerScreen.initWidgets

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/MarkerScreen.java:25`

```java
@Override public void initWidgets()
```

## meteordevelopment.meteorclient.gui.screens.MarkerScreen.tick

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/MarkerScreen.java:43`

```java
@Override public void tick()
```

## meteordevelopment.meteorclient.gui.screens.MarkerScreen.getWidget

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/MarkerScreen.java:50`

```java
public WWidget getWidget(GuiTheme theme)
```

## meteordevelopment.meteorclient.gui.screens.ModuleScreen

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/ModuleScreen.java:35`

```java
public class ModuleScreen extends WindowScreen
```

## meteordevelopment.meteorclient.gui.screens.ModuleScreen.ModuleScreen

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/ModuleScreen.java:42`

```java
public ModuleScreen(GuiTheme theme, Module module)
```

## meteordevelopment.meteorclient.gui.screens.ModuleScreen.initWidgets

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/ModuleScreen.java:49`

```java
@Override public void initWidgets()
```

## meteordevelopment.meteorclient.gui.screens.ModuleScreen.shouldCloseOnEsc

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/ModuleScreen.java:136`

```java
@Override public boolean shouldCloseOnEsc()
```

## meteordevelopment.meteorclient.gui.screens.ModuleScreen.tick

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/ModuleScreen.java:141`

```java
@Override public void tick()
```

## meteordevelopment.meteorclient.gui.screens.ModuleScreen.toClipboard

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/ModuleScreen.java:158`

```java
@Override public boolean toClipboard()
```

## meteordevelopment.meteorclient.gui.screens.ModuleScreen.fromClipboard

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/ModuleScreen.java:170`

```java
@Override public boolean fromClipboard()
```

## meteordevelopment.meteorclient.gui.screens.ModulesScreen

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/ModulesScreen.java:38`

```java
public class ModulesScreen extends TabScreen
```

## meteordevelopment.meteorclient.gui.screens.ModulesScreen.ModulesScreen

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/ModulesScreen.java:43`

```java
public ModulesScreen(GuiTheme theme)
```

## meteordevelopment.meteorclient.gui.screens.ModulesScreen.initWidgets

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/ModulesScreen.java:47`

```java
@Override public void initWidgets()
```

## meteordevelopment.meteorclient.gui.screens.ModulesScreen.init

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/ModulesScreen.java:59`

```java
@Override protected void init()
```

## meteordevelopment.meteorclient.gui.screens.ModulesScreen.createCategory

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/ModulesScreen.java:67`

```java
protected WWindow createCategory(WContainer c, Category category, List<Module> moduleList)
```

## meteordevelopment.meteorclient.gui.screens.ModulesScreen.createSearchW

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/ModulesScreen.java:91`

```java
protected void createSearchW(WContainer w, String text)
```

## meteordevelopment.meteorclient.gui.screens.ModulesScreen.createSearch

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/ModulesScreen.java:125`

```java
protected WWindow createSearch(WContainer c)
```

## meteordevelopment.meteorclient.gui.screens.ModulesScreen.keyPressed

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/ModulesScreen.java:155`

```java
@Override public boolean keyPressed(@NonNull KeyEvent input)
```

## meteordevelopment.meteorclient.gui.screens.ModulesScreen.createFavorites

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/ModulesScreen.java:178`

```java
protected Cell<WWindow> createFavorites(WContainer c)
```

## meteordevelopment.meteorclient.gui.screens.ModulesScreen.createFavoritesW

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/ModulesScreen.java:200`

```java
protected boolean createFavoritesW(WWindow w)
```

## meteordevelopment.meteorclient.gui.screens.ModulesScreen.toClipboard

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/ModulesScreen.java:218`

```java
@Override public boolean toClipboard()
```

## meteordevelopment.meteorclient.gui.screens.ModulesScreen.fromClipboard

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/ModulesScreen.java:223`

```java
@Override public boolean fromClipboard()
```

## meteordevelopment.meteorclient.gui.screens.ModulesScreen.reload

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/ModulesScreen.java:228`

```java
@Override public void reload()
```

## meteordevelopment.meteorclient.gui.screens.ModulesScreen.WCategoryController

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/ModulesScreen.java:234`

```java
protected class WCategoryController extends WContainer
```

## meteordevelopment.meteorclient.gui.screens.ModulesScreen.WCategoryController.windows

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/ModulesScreen.java:235`

```java
public final List<WWindow> windows = new ArrayList<>()
```

## meteordevelopment.meteorclient.gui.screens.ModulesScreen.WCategoryController.init

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/ModulesScreen.java:238`

```java
@Override public void init()
```

## meteordevelopment.meteorclient.gui.screens.ModulesScreen.WCategoryController.refresh

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/ModulesScreen.java:260`

```java
protected void refresh()
```

## meteordevelopment.meteorclient.gui.screens.ModulesScreen.WCategoryController.onCalculateWidgetPositions

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/ModulesScreen.java:275`

```java
@Override protected void onCalculateWidgetPositions()
```

## meteordevelopment.meteorclient.gui.screens.NotebotSongsScreen

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/NotebotSongsScreen.java:25`

```java
public class NotebotSongsScreen extends WindowScreen
```

## meteordevelopment.meteorclient.gui.screens.NotebotSongsScreen.NotebotSongsScreen

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/NotebotSongsScreen.java:33`

```java
public NotebotSongsScreen(GuiTheme theme)
```

## meteordevelopment.meteorclient.gui.screens.NotebotSongsScreen.initWidgets

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/NotebotSongsScreen.java:37`

```java
@Override public void initWidgets()
```

## meteordevelopment.meteorclient.gui.screens.ProxiesImportScreen

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/ProxiesImportScreen.java:24`

```java
public class ProxiesImportScreen extends WindowScreen
```

## meteordevelopment.meteorclient.gui.screens.ProxiesImportScreen.ProxiesImportScreen

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/ProxiesImportScreen.java:28`

```java
public ProxiesImportScreen(GuiTheme theme, File file)
```

## meteordevelopment.meteorclient.gui.screens.ProxiesImportScreen.initWidgets

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/ProxiesImportScreen.java:38`

```java
@Override public void initWidgets()
```

## meteordevelopment.meteorclient.gui.screens.ProxiesScreen

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/ProxiesScreen.java:33`

```java
public class ProxiesScreen extends WindowScreen
```

## meteordevelopment.meteorclient.gui.screens.ProxiesScreen.ProxiesScreen

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/ProxiesScreen.java:40`

```java
public ProxiesScreen(GuiTheme theme)
```

## meteordevelopment.meteorclient.gui.screens.ProxiesScreen.initWidgets

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/ProxiesScreen.java:44`

```java
@Override public void initWidgets()
```

## meteordevelopment.meteorclient.gui.screens.ProxiesScreen.tick

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/ProxiesScreen.java:127`

```java
@Override public void tick()
```

## meteordevelopment.meteorclient.gui.screens.ProxiesScreen.toClipboard

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/ProxiesScreen.java:168`

```java
@Override public boolean toClipboard()
```

## meteordevelopment.meteorclient.gui.screens.ProxiesScreen.fromClipboard

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/ProxiesScreen.java:173`

```java
@Override public boolean fromClipboard()
```

## meteordevelopment.meteorclient.gui.screens.ProxiesScreen.EditProxyScreen

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/ProxiesScreen.java:178`

```java
protected static class EditProxyScreen extends EditSystemScreen<Proxy>
```

## meteordevelopment.meteorclient.gui.screens.ProxiesScreen.EditProxyScreen.EditProxyScreen

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/ProxiesScreen.java:179`

```java
public EditProxyScreen(GuiTheme theme, Proxy value, Runnable reload)
```

## meteordevelopment.meteorclient.gui.screens.ProxiesScreen.EditProxyScreen.create

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/ProxiesScreen.java:183`

```java
@Override public Proxy create()
```

## meteordevelopment.meteorclient.gui.screens.ProxiesScreen.EditProxyScreen.save

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/ProxiesScreen.java:188`

```java
@Override public boolean save()
```

## meteordevelopment.meteorclient.gui.screens.ProxiesScreen.EditProxyScreen.getSettings

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/ProxiesScreen.java:194`

```java
@Override public Settings getSettings()
```

## meteordevelopment.meteorclient.gui.screens.accounts.AccountInfoScreen

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/accounts/AccountInfoScreen.java:19`

```java
public class AccountInfoScreen extends WindowScreen
```

## meteordevelopment.meteorclient.gui.screens.accounts.AccountInfoScreen.AccountInfoScreen

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/accounts/AccountInfoScreen.java:22`

```java
public AccountInfoScreen(GuiTheme theme, Account<?> account)
```

## meteordevelopment.meteorclient.gui.screens.accounts.AccountInfoScreen.initWidgets

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/accounts/AccountInfoScreen.java:27`

```java
@Override public void initWidgets()
```

## meteordevelopment.meteorclient.gui.screens.accounts.AccountsScreen

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/accounts/AccountsScreen.java:23`

```java
public class AccountsScreen extends WindowScreen
```

## meteordevelopment.meteorclient.gui.screens.accounts.AccountsScreen.AccountsScreen

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/accounts/AccountsScreen.java:24`

```java
public AccountsScreen(GuiTheme theme)
```

## meteordevelopment.meteorclient.gui.screens.accounts.AccountsScreen.initWidgets

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/accounts/AccountsScreen.java:28`

```java
@Override public void initWidgets()
```

## meteordevelopment.meteorclient.gui.screens.accounts.AccountsScreen.addAccount

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/accounts/AccountsScreen.java:50`

```java
public static void addAccount(@Nullable AddAccountScreen screen, AccountsScreen parent, Account<?> account)
```

## meteordevelopment.meteorclient.gui.screens.accounts.AccountsScreen.toClipboard

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/accounts/AccountsScreen.java:79`

```java
@Override public boolean toClipboard()
```

## meteordevelopment.meteorclient.gui.screens.accounts.AccountsScreen.fromClipboard

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/accounts/AccountsScreen.java:84`

```java
@Override public boolean fromClipboard()
```

## meteordevelopment.meteorclient.gui.screens.accounts.AddAccountScreen

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/accounts/AddAccountScreen.java:12`

```java
public abstract class AddAccountScreen extends WindowScreen
```

## meteordevelopment.meteorclient.gui.screens.accounts.AddAccountScreen.parent

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/accounts/AddAccountScreen.java:13`

```java
public final AccountsScreen parent
```

## meteordevelopment.meteorclient.gui.screens.accounts.AddAccountScreen.add

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/accounts/AddAccountScreen.java:14`

```java
public WButton add
```

## meteordevelopment.meteorclient.gui.screens.accounts.AddAccountScreen.AddAccountScreen

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/accounts/AddAccountScreen.java:17`

```java
protected AddAccountScreen(GuiTheme theme, String title, AccountsScreen parent)
```

## meteordevelopment.meteorclient.gui.screens.accounts.AddAccountScreen.tick

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/accounts/AddAccountScreen.java:22`

```java
@Override public void tick()
```

## meteordevelopment.meteorclient.gui.screens.accounts.AddAlteningAccountScreen

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/accounts/AddAlteningAccountScreen.java:13`

```java
public class AddAlteningAccountScreen extends AddAccountScreen
```

## meteordevelopment.meteorclient.gui.screens.accounts.AddAlteningAccountScreen.AddAlteningAccountScreen

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/accounts/AddAlteningAccountScreen.java:14`

```java
public AddAlteningAccountScreen(GuiTheme theme, AccountsScreen parent)
```

## meteordevelopment.meteorclient.gui.screens.accounts.AddAlteningAccountScreen.initWidgets

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/accounts/AddAlteningAccountScreen.java:18`

```java
@Override public void initWidgets()
```

## meteordevelopment.meteorclient.gui.screens.accounts.AddCrackedAccountScreen

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/accounts/AddCrackedAccountScreen.java:14`

```java
public class AddCrackedAccountScreen extends AddAccountScreen
```

## meteordevelopment.meteorclient.gui.screens.accounts.AddCrackedAccountScreen.AddCrackedAccountScreen

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/accounts/AddCrackedAccountScreen.java:15`

```java
public AddCrackedAccountScreen(GuiTheme theme, AccountsScreen parent)
```

## meteordevelopment.meteorclient.gui.screens.accounts.AddCrackedAccountScreen.initWidgets

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/accounts/AddCrackedAccountScreen.java:19`

```java
@Override public void initWidgets()
```

## meteordevelopment.meteorclient.gui.screens.accounts.AddMicrosoftAccountScreen

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/accounts/AddMicrosoftAccountScreen.java:16`

```java
public class AddMicrosoftAccountScreen extends AddAccountScreen
```

## meteordevelopment.meteorclient.gui.screens.accounts.AddMicrosoftAccountScreen.AddMicrosoftAccountScreen

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/accounts/AddMicrosoftAccountScreen.java:17`

```java
public AddMicrosoftAccountScreen(GuiTheme theme, AccountsScreen parent)
```

## meteordevelopment.meteorclient.gui.screens.accounts.AddMicrosoftAccountScreen.initWidgets

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/accounts/AddMicrosoftAccountScreen.java:21`

```java
@Override public void initWidgets()
```

## meteordevelopment.meteorclient.gui.screens.accounts.AddMicrosoftAccountScreen.tick

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/accounts/AddMicrosoftAccountScreen.java:48`

```java
@Override public void tick()
```

## meteordevelopment.meteorclient.gui.screens.accounts.AddMicrosoftAccountScreen.shouldCloseOnEsc

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/accounts/AddMicrosoftAccountScreen.java:52`

```java
@Override public boolean shouldCloseOnEsc()
```

## meteordevelopment.meteorclient.gui.screens.accounts.AddSessionAccountScreen

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/accounts/AddSessionAccountScreen.java:13`

```java
public class AddSessionAccountScreen extends AddAccountScreen
```

## meteordevelopment.meteorclient.gui.screens.accounts.AddSessionAccountScreen.AddSessionAccountScreen

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/accounts/AddSessionAccountScreen.java:14`

```java
public AddSessionAccountScreen(GuiTheme theme, AccountsScreen parent)
```

## meteordevelopment.meteorclient.gui.screens.accounts.AddSessionAccountScreen.initWidgets

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/accounts/AddSessionAccountScreen.java:18`

```java
@Override public void initWidgets()
```

## meteordevelopment.meteorclient.gui.screens.settings.BlockDataSettingScreen

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/BlockDataSettingScreen.java:28`

```java
public class BlockDataSettingScreen<T extends ICopyable<T> & ISerializable<T> & IChangeable & IBlockData<T>> extends CollectionMapSettingScreen<Block, T>
```

## meteordevelopment.meteorclient.gui.screens.settings.BlockDataSettingScreen.BlockDataSettingScreen

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/BlockDataSettingScreen.java:32`

```java
public BlockDataSettingScreen(GuiTheme theme, BlockDataSetting<T> setting)
```

## meteordevelopment.meteorclient.gui.screens.settings.BlockDataSettingScreen.includeValue

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/BlockDataSettingScreen.java:38`

```java
@Override protected boolean includeValue(Block value)
```

## meteordevelopment.meteorclient.gui.screens.settings.BlockDataSettingScreen.getValueWidget

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/BlockDataSettingScreen.java:43`

```java
@Override protected WWidget getValueWidget(Block block)
```

## meteordevelopment.meteorclient.gui.screens.settings.BlockDataSettingScreen.getDataWidget

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/BlockDataSettingScreen.java:48`

```java
@Override protected WWidget getDataWidget(Block block, @Nullable T blockData)
```

## meteordevelopment.meteorclient.gui.screens.settings.BlockDataSettingScreen.onRenderBefore

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/BlockDataSettingScreen.java:61`

```java
@Override protected void onRenderBefore(GuiGraphicsExtractor graphics, int mouseX, int mouseY, float delta)
```

## meteordevelopment.meteorclient.gui.screens.settings.BlockDataSettingScreen.getValueNames

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/BlockDataSettingScreen.java:69`

```java
@Override protected String[] getValueNames(Block block)
```

## meteordevelopment.meteorclient.gui.screens.settings.BlockListSettingScreen

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/BlockListSettingScreen.java:21`

```java
public class BlockListSettingScreen extends CollectionListSettingScreen<Block>
```

## meteordevelopment.meteorclient.gui.screens.settings.BlockListSettingScreen.BlockListSettingScreen

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/BlockListSettingScreen.java:22`

```java
public BlockListSettingScreen(GuiTheme theme, BlockListSetting setting)
```

## meteordevelopment.meteorclient.gui.screens.settings.BlockListSettingScreen.includeValue

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/BlockListSettingScreen.java:26`

```java
@Override protected boolean includeValue(Block value)
```

## meteordevelopment.meteorclient.gui.screens.settings.BlockListSettingScreen.getValueWidget

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/BlockListSettingScreen.java:38`

```java
@Override protected WWidget getValueWidget(Block value)
```

## meteordevelopment.meteorclient.gui.screens.settings.BlockListSettingScreen.getValueNames

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/BlockListSettingScreen.java:43`

```java
@Override protected String[] getValueNames(Block value)
```

## meteordevelopment.meteorclient.gui.screens.settings.BlockListSettingScreen.getAdditionalValue

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/BlockListSettingScreen.java:51`

```java
@Override protected Block getAdditionalValue(Block value)
```

## meteordevelopment.meteorclient.gui.screens.settings.BlockSettingScreen

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/BlockSettingScreen.java:22`

```java
public class BlockSettingScreen extends WindowScreen
```

## meteordevelopment.meteorclient.gui.screens.settings.BlockSettingScreen.BlockSettingScreen

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/BlockSettingScreen.java:30`

```java
public BlockSettingScreen(GuiTheme theme, BlockSetting setting)
```

## meteordevelopment.meteorclient.gui.screens.settings.BlockSettingScreen.initWidgets

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/BlockSettingScreen.java:36`

```java
@Override public void initWidgets()
```

## meteordevelopment.meteorclient.gui.screens.settings.BlockSettingScreen.skipValue

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/BlockSettingScreen.java:71`

```java
protected boolean skipValue(Block value)
```

## meteordevelopment.meteorclient.gui.screens.settings.ColorSettingScreen

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/ColorSettingScreen.java:28`

```java
public class ColorSettingScreen extends WindowScreen
```

## meteordevelopment.meteorclient.gui.screens.settings.ColorSettingScreen.action

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/ColorSettingScreen.java:33`

```java
public Runnable action
```

## meteordevelopment.meteorclient.gui.screens.settings.ColorSettingScreen.ColorSettingScreen

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/ColorSettingScreen.java:45`

```java
public ColorSettingScreen(GuiTheme theme, Setting<SettingColor> setting)
```

## meteordevelopment.meteorclient.gui.screens.settings.ColorSettingScreen.initWidgets

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/ColorSettingScreen.java:51`

```java
@Override public void initWidgets()
```

## meteordevelopment.meteorclient.gui.screens.settings.ColorSettingScreen.tick

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/ColorSettingScreen.java:136`

```java
@Override public void tick()
```

## meteordevelopment.meteorclient.gui.screens.settings.ColorSettingScreen.toClipboard

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/ColorSettingScreen.java:361`

```java
@Override public boolean toClipboard()
```

## meteordevelopment.meteorclient.gui.screens.settings.ColorSettingScreen.fromClipboard

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/ColorSettingScreen.java:366`

```java
@Override public boolean fromClipboard()
```

## meteordevelopment.meteorclient.gui.screens.settings.EnchantmentListSettingScreen

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/EnchantmentListSettingScreen.java:19`

```java
public class EnchantmentListSettingScreen extends DynamicRegistryListSettingScreen<Enchantment>
```

## meteordevelopment.meteorclient.gui.screens.settings.EnchantmentListSettingScreen.EnchantmentListSettingScreen

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/EnchantmentListSettingScreen.java:20`

```java
public EnchantmentListSettingScreen(GuiTheme theme, Setting<Set<ResourceKey<Enchantment>>> setting)
```

## meteordevelopment.meteorclient.gui.screens.settings.EnchantmentListSettingScreen.getValueWidget

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/EnchantmentListSettingScreen.java:24`

```java
@Override protected WWidget getValueWidget(ResourceKey<Enchantment> value)
```

## meteordevelopment.meteorclient.gui.screens.settings.EnchantmentListSettingScreen.getValueNames

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/EnchantmentListSettingScreen.java:29`

```java
@Override protected String[] getValueNames(ResourceKey<Enchantment> value)
```

## meteordevelopment.meteorclient.gui.screens.settings.EntityTypeListSettingScreen

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/EntityTypeListSettingScreen.java:34`

```java
public class EntityTypeListSettingScreen extends WindowScreen
```

## meteordevelopment.meteorclient.gui.screens.settings.EntityTypeListSettingScreen.EntityTypeListSettingScreen

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/EntityTypeListSettingScreen.java:48`

```java
public EntityTypeListSettingScreen(GuiTheme theme, EntityTypeListSetting setting)
```

## meteordevelopment.meteorclient.gui.screens.settings.EntityTypeListSettingScreen.add

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/EntityTypeListSettingScreen.java:66`

```java
@Override public <W extends WWidget> Cell<W> add(W widget)
```

## meteordevelopment.meteorclient.gui.screens.settings.EntityTypeListSettingScreen.initWidgets

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/EntityTypeListSettingScreen.java:71`

```java
@Override public void initWidgets()
```

## meteordevelopment.meteorclient.gui.screens.settings.FontFaceSettingScreen

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/FontFaceSettingScreen.java:26`

```java
public class FontFaceSettingScreen extends WindowScreen
```

## meteordevelopment.meteorclient.gui.screens.settings.FontFaceSettingScreen.FontFaceSettingScreen

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/FontFaceSettingScreen.java:34`

```java
public FontFaceSettingScreen(GuiTheme theme, FontFaceSetting setting)
```

## meteordevelopment.meteorclient.gui.screens.settings.FontFaceSettingScreen.initWidgets

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/FontFaceSettingScreen.java:40`

```java
@Override public void initWidgets()
```

## meteordevelopment.meteorclient.gui.screens.settings.ItemListSettingScreen

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/ItemListSettingScreen.java:20`

```java
public class ItemListSettingScreen extends CollectionListSettingScreen<Item>
```

## meteordevelopment.meteorclient.gui.screens.settings.ItemListSettingScreen.ItemListSettingScreen

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/ItemListSettingScreen.java:21`

```java
public ItemListSettingScreen(GuiTheme theme, ItemListSetting setting)
```

## meteordevelopment.meteorclient.gui.screens.settings.ItemListSettingScreen.includeValue

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/ItemListSettingScreen.java:25`

```java
@Override protected boolean includeValue(Item value)
```

## meteordevelopment.meteorclient.gui.screens.settings.ItemListSettingScreen.getValueWidget

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/ItemListSettingScreen.java:33`

```java
@Override protected WWidget getValueWidget(Item value)
```

## meteordevelopment.meteorclient.gui.screens.settings.ItemListSettingScreen.getValueNames

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/ItemListSettingScreen.java:38`

```java
@Override protected String[] getValueNames(Item value)
```

## meteordevelopment.meteorclient.gui.screens.settings.ItemSettingScreen

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/ItemSettingScreen.java:22`

```java
public class ItemSettingScreen extends WindowScreen
```

## meteordevelopment.meteorclient.gui.screens.settings.ItemSettingScreen.ItemSettingScreen

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/ItemSettingScreen.java:30`

```java
public ItemSettingScreen(GuiTheme theme, ItemSetting setting)
```

## meteordevelopment.meteorclient.gui.screens.settings.ItemSettingScreen.initWidgets

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/ItemSettingScreen.java:36`

```java
@Override public void initWidgets()
```

## meteordevelopment.meteorclient.gui.screens.settings.ItemSettingScreen.initTable

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/ItemSettingScreen.java:51`

```java
public void initTable()
```

## meteordevelopment.meteorclient.gui.screens.settings.ModuleListSettingScreen

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/ModuleListSettingScreen.java:17`

```java
public class ModuleListSettingScreen extends CollectionListSettingScreen<Module>
```

## meteordevelopment.meteorclient.gui.screens.settings.ModuleListSettingScreen.ModuleListSettingScreen

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/ModuleListSettingScreen.java:18`

```java
public ModuleListSettingScreen(GuiTheme theme, Setting<List<Module>> setting)
```

## meteordevelopment.meteorclient.gui.screens.settings.ModuleListSettingScreen.getValueWidget

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/ModuleListSettingScreen.java:22`

```java
@Override protected WWidget getValueWidget(Module value)
```

## meteordevelopment.meteorclient.gui.screens.settings.ModuleListSettingScreen.getValueNames

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/ModuleListSettingScreen.java:27`

```java
@Override protected String[] getValueNames(Module value)
```

## meteordevelopment.meteorclient.gui.screens.settings.PacketBoolSettingScreen

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/PacketBoolSettingScreen.java:21`

```java
public class PacketBoolSettingScreen extends CollectionListSettingScreen<PacketType<? extends @NonNull Packet<?>>>
```

## meteordevelopment.meteorclient.gui.screens.settings.PacketBoolSettingScreen.PacketBoolSettingScreen

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/PacketBoolSettingScreen.java:22`

```java
public PacketBoolSettingScreen(GuiTheme theme, Setting<Set<PacketType<? extends @NonNull Packet<?>>>> setting)
```

## meteordevelopment.meteorclient.gui.screens.settings.PacketBoolSettingScreen.includeValue

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/PacketBoolSettingScreen.java:26`

```java
@Override protected boolean includeValue(PacketType<? extends @NonNull Packet<?>> value)
```

## meteordevelopment.meteorclient.gui.screens.settings.PacketBoolSettingScreen.getValueWidget

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/PacketBoolSettingScreen.java:34`

```java
@Override protected WWidget getValueWidget(PacketType<? extends @NonNull Packet<?>> value)
```

## meteordevelopment.meteorclient.gui.screens.settings.PacketBoolSettingScreen.getValueNames

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/PacketBoolSettingScreen.java:39`

```java
@Override protected String[] getValueNames(PacketType<? extends @NonNull Packet<?>> value)
```

## meteordevelopment.meteorclient.gui.screens.settings.ParticleTypeListSettingScreen

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/ParticleTypeListSettingScreen.java:18`

```java
public class ParticleTypeListSettingScreen extends CollectionListSettingScreen<ParticleType<?>>
```

## meteordevelopment.meteorclient.gui.screens.settings.ParticleTypeListSettingScreen.ParticleTypeListSettingScreen

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/ParticleTypeListSettingScreen.java:19`

```java
public ParticleTypeListSettingScreen(GuiTheme theme, Setting<List<ParticleType<?>>> setting)
```

## meteordevelopment.meteorclient.gui.screens.settings.ParticleTypeListSettingScreen.getValueWidget

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/ParticleTypeListSettingScreen.java:23`

```java
@Override protected WWidget getValueWidget(ParticleType<?> value)
```

## meteordevelopment.meteorclient.gui.screens.settings.ParticleTypeListSettingScreen.getValueNames

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/ParticleTypeListSettingScreen.java:28`

```java
@Override protected String[] getValueNames(ParticleType<?> value)
```

## meteordevelopment.meteorclient.gui.screens.settings.PotionSettingScreen

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/PotionSettingScreen.java:16`

```java
public class PotionSettingScreen extends WindowScreen
```

## meteordevelopment.meteorclient.gui.screens.settings.PotionSettingScreen.PotionSettingScreen

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/PotionSettingScreen.java:19`

```java
public PotionSettingScreen(GuiTheme theme, PotionSetting setting)
```

## meteordevelopment.meteorclient.gui.screens.settings.PotionSettingScreen.initWidgets

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/PotionSettingScreen.java:25`

```java
@Override public void initWidgets()
```

## meteordevelopment.meteorclient.gui.screens.settings.ScreenHandlerSettingScreen

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/ScreenHandlerSettingScreen.java:17`

```java
public class ScreenHandlerSettingScreen extends CollectionListSettingScreen<MenuType<?>>
```

## meteordevelopment.meteorclient.gui.screens.settings.ScreenHandlerSettingScreen.ScreenHandlerSettingScreen

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/ScreenHandlerSettingScreen.java:18`

```java
public ScreenHandlerSettingScreen(GuiTheme theme, Setting<List<MenuType<?>>> setting)
```

## meteordevelopment.meteorclient.gui.screens.settings.ScreenHandlerSettingScreen.getValueWidget

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/ScreenHandlerSettingScreen.java:22`

```java
@Override protected WWidget getValueWidget(MenuType<?> value)
```

## meteordevelopment.meteorclient.gui.screens.settings.ScreenHandlerSettingScreen.getValueNames

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/ScreenHandlerSettingScreen.java:27`

```java
@Override protected String[] getValueNames(MenuType<?> type)
```

## meteordevelopment.meteorclient.gui.screens.settings.SoundEventListSettingScreen

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/SoundEventListSettingScreen.java:18`

```java
public class SoundEventListSettingScreen extends CollectionListSettingScreen<SoundEvent>
```

## meteordevelopment.meteorclient.gui.screens.settings.SoundEventListSettingScreen.SoundEventListSettingScreen

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/SoundEventListSettingScreen.java:19`

```java
public SoundEventListSettingScreen(GuiTheme theme, Setting<List<SoundEvent>> setting)
```

## meteordevelopment.meteorclient.gui.screens.settings.SoundEventListSettingScreen.getValueWidget

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/SoundEventListSettingScreen.java:23`

```java
@Override protected WWidget getValueWidget(SoundEvent value)
```

## meteordevelopment.meteorclient.gui.screens.settings.SoundEventListSettingScreen.getValueNames

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/SoundEventListSettingScreen.java:28`

```java
@Override protected String[] getValueNames(SoundEvent value)
```

## meteordevelopment.meteorclient.gui.screens.settings.StatusEffectAmplifierMapSettingScreen

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/StatusEffectAmplifierMapSettingScreen.java:29`

```java
public class StatusEffectAmplifierMapSettingScreen extends WindowScreen
```

## meteordevelopment.meteorclient.gui.screens.settings.StatusEffectAmplifierMapSettingScreen.StatusEffectAmplifierMapSettingScreen

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/StatusEffectAmplifierMapSettingScreen.java:36`

```java
public StatusEffectAmplifierMapSettingScreen(GuiTheme theme, Setting<Reference2IntMap<MobEffect>> setting)
```

## meteordevelopment.meteorclient.gui.screens.settings.StatusEffectAmplifierMapSettingScreen.initWidgets

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/StatusEffectAmplifierMapSettingScreen.java:42`

```java
@Override public void initWidgets()
```

## meteordevelopment.meteorclient.gui.screens.settings.StatusEffectListSettingScreen

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/StatusEffectListSettingScreen.java:24`

```java
public class StatusEffectListSettingScreen extends CollectionListSettingScreen<MobEffect>
```

## meteordevelopment.meteorclient.gui.screens.settings.StatusEffectListSettingScreen.StatusEffectListSettingScreen

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/StatusEffectListSettingScreen.java:25`

```java
public StatusEffectListSettingScreen(GuiTheme theme, Setting<List<MobEffect>> setting)
```

## meteordevelopment.meteorclient.gui.screens.settings.StatusEffectListSettingScreen.getValueWidget

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/StatusEffectListSettingScreen.java:29`

```java
@Override protected WWidget getValueWidget(MobEffect value)
```

## meteordevelopment.meteorclient.gui.screens.settings.StatusEffectListSettingScreen.getValueNames

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/StatusEffectListSettingScreen.java:34`

```java
@Override protected String[] getValueNames(MobEffect value)
```

## meteordevelopment.meteorclient.gui.screens.settings.StorageBlockListSettingScreen

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/StorageBlockListSettingScreen.java:24`

```java
public class StorageBlockListSettingScreen extends CollectionListSettingScreen<BlockEntityType<?>>
```

## meteordevelopment.meteorclient.gui.screens.settings.StorageBlockListSettingScreen.StorageBlockListSettingScreen

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/StorageBlockListSettingScreen.java:48`

```java
public StorageBlockListSettingScreen(GuiTheme theme, Setting<List<BlockEntityType<?>>> setting)
```

## meteordevelopment.meteorclient.gui.screens.settings.StorageBlockListSettingScreen.getValueWidget

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/StorageBlockListSettingScreen.java:52`

```java
@Override protected WWidget getValueWidget(BlockEntityType<?> value)
```

## meteordevelopment.meteorclient.gui.screens.settings.StorageBlockListSettingScreen.getValueNames

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/StorageBlockListSettingScreen.java:58`

```java
@Override protected String[] getValueNames(BlockEntityType<?> value)
```

## meteordevelopment.meteorclient.gui.screens.settings.base.CollectionListSettingScreen

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/base/CollectionListSettingScreen.java:22`

```java
public abstract class CollectionListSettingScreen<T> extends WindowScreen
```

## meteordevelopment.meteorclient.gui.screens.settings.base.CollectionListSettingScreen.setting

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/base/CollectionListSettingScreen.java:23`

```java
protected final Setting<?> setting
```

## meteordevelopment.meteorclient.gui.screens.settings.base.CollectionListSettingScreen.collection

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/base/CollectionListSettingScreen.java:24`

```java
protected final Collection<T> collection
```

## meteordevelopment.meteorclient.gui.screens.settings.base.CollectionListSettingScreen.CollectionListSettingScreen

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/base/CollectionListSettingScreen.java:30`

```java
public CollectionListSettingScreen(GuiTheme theme, String title, Setting<?> setting, Collection<T> collection, Iterable<T> registry)
```

## meteordevelopment.meteorclient.gui.screens.settings.base.CollectionListSettingScreen.initWidgets

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/base/CollectionListSettingScreen.java:38`

```java
@Override public void initWidgets()
```

## meteordevelopment.meteorclient.gui.screens.settings.base.CollectionListSettingScreen.invalidateTable

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/base/CollectionListSettingScreen.java:106`

```java
protected void invalidateTable()
```

## meteordevelopment.meteorclient.gui.screens.settings.base.CollectionListSettingScreen.addValue

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/base/CollectionListSettingScreen.java:111`

```java
protected void addValue(T value)
```

## meteordevelopment.meteorclient.gui.screens.settings.base.CollectionListSettingScreen.removeValue

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/base/CollectionListSettingScreen.java:119`

```java
protected void removeValue(T value)
```

## meteordevelopment.meteorclient.gui.screens.settings.base.CollectionListSettingScreen.postWidgets

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/base/CollectionListSettingScreen.java:126`

```java
protected void postWidgets(WTable left, WTable right)
```

## meteordevelopment.meteorclient.gui.screens.settings.base.CollectionListSettingScreen.includeValue

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/base/CollectionListSettingScreen.java:128`

```java
protected boolean includeValue(T value)
```

## meteordevelopment.meteorclient.gui.screens.settings.base.CollectionListSettingScreen.getValueWidget

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/base/CollectionListSettingScreen.java:132`

```java
protected abstract WWidget getValueWidget(T value)
```

## meteordevelopment.meteorclient.gui.screens.settings.base.CollectionListSettingScreen.getValueNames

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/base/CollectionListSettingScreen.java:134`

```java
protected abstract String[] getValueNames(T value)
```

## meteordevelopment.meteorclient.gui.screens.settings.base.CollectionListSettingScreen.getAdditionalValue

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/base/CollectionListSettingScreen.java:136`

```java
protected T getAdditionalValue(T value)
```

## meteordevelopment.meteorclient.gui.screens.settings.base.CollectionMapSettingScreen

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/base/CollectionMapSettingScreen.java:22`

```java
public abstract class CollectionMapSettingScreen<K, V> extends WindowScreen
```

## meteordevelopment.meteorclient.gui.screens.settings.base.CollectionMapSettingScreen.map

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/base/CollectionMapSettingScreen.java:24`

```java
protected final Map<K, V> map
```

## meteordevelopment.meteorclient.gui.screens.settings.base.CollectionMapSettingScreen.CollectionMapSettingScreen

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/base/CollectionMapSettingScreen.java:30`

```java
public CollectionMapSettingScreen(GuiTheme theme, String title, Setting<?> setting, Map<K, V> map, Iterable<K> registry)
```

## meteordevelopment.meteorclient.gui.screens.settings.base.CollectionMapSettingScreen.initWidgets

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/base/CollectionMapSettingScreen.java:38`

```java
@Override public void initWidgets()
```

## meteordevelopment.meteorclient.gui.screens.settings.base.CollectionMapSettingScreen.invalidateTable

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/base/CollectionMapSettingScreen.java:75`

```java
protected void invalidateTable()
```

## meteordevelopment.meteorclient.gui.screens.settings.base.CollectionMapSettingScreen.removeValue

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/base/CollectionMapSettingScreen.java:80`

```java
protected void removeValue(K value)
```

## meteordevelopment.meteorclient.gui.screens.settings.base.CollectionMapSettingScreen.includeValue

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/base/CollectionMapSettingScreen.java:87`

```java
protected boolean includeValue(K value)
```

## meteordevelopment.meteorclient.gui.screens.settings.base.CollectionMapSettingScreen.getValueWidget

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/base/CollectionMapSettingScreen.java:91`

```java
protected abstract WWidget getValueWidget(K value)
```

## meteordevelopment.meteorclient.gui.screens.settings.base.CollectionMapSettingScreen.getDataWidget

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/base/CollectionMapSettingScreen.java:93`

```java
protected abstract WWidget getDataWidget(K value, @Nullable V data)
```

## meteordevelopment.meteorclient.gui.screens.settings.base.CollectionMapSettingScreen.getValueNames

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/base/CollectionMapSettingScreen.java:95`

```java
protected abstract String[] getValueNames(K value)
```

## meteordevelopment.meteorclient.gui.screens.settings.base.DynamicRegistryListSettingScreen

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/base/DynamicRegistryListSettingScreen.java:26`

```java
public abstract class DynamicRegistryListSettingScreen<T> extends CollectionListSettingScreen<ResourceKey<T>>
```

## meteordevelopment.meteorclient.gui.screens.settings.base.DynamicRegistryListSettingScreen.registryKey

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/base/DynamicRegistryListSettingScreen.java:27`

```java
protected final ResourceKey<Registry<T>> registryKey
```

## meteordevelopment.meteorclient.gui.screens.settings.base.DynamicRegistryListSettingScreen.DynamicRegistryListSettingScreen

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/base/DynamicRegistryListSettingScreen.java:29`

```java
public DynamicRegistryListSettingScreen(GuiTheme theme, String title, Setting<?> setting, Collection<ResourceKey<T>> collection, ResourceKey<Registry<T>> registryKey)
```

## meteordevelopment.meteorclient.gui.screens.settings.base.DynamicRegistryListSettingScreen.postWidgets

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/base/DynamicRegistryListSettingScreen.java:47`

```java
@Override protected void postWidgets(WTable left, WTable right)
```

## meteordevelopment.meteorclient.gui.screens.settings.base.SortingHelper

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/base/SortingHelper.java:22`

```java
public final class SortingHelper
```

## meteordevelopment.meteorclient.gui.screens.settings.base.SortingHelper.sort

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/base/SortingHelper.java:28`

```java
public static <T> Iterable<T> sort(Iterable<T> registry, Predicate<T> filter, Function<T, String[]> nameFunction, String filterText)
```

## meteordevelopment.meteorclient.gui.screens.settings.base.SortingHelper.sortWithPriority

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/base/SortingHelper.java:32`

```java
public static <T> Iterable<T> sortWithPriority(Iterable<T> registry, Predicate<T> filter, Function<T, String[]> nameFunction, String filterText, Comparator<T> comparator)
```

## meteordevelopment.meteorclient.gui.screens.settings.base.SortingHelper.Entry

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/base/SortingHelper.java:142`

```java
public record Entry<T>(T value, int distance)
```

## meteordevelopment.meteorclient.gui.tabs.Tab

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/tabs/Tab.java:13`

```java
public abstract class Tab
```

## meteordevelopment.meteorclient.gui.tabs.Tab.name

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/tabs/Tab.java:14`

```java
public final String name
```

## meteordevelopment.meteorclient.gui.tabs.Tab.Tab

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/tabs/Tab.java:16`

```java
public Tab(String name)
```

## meteordevelopment.meteorclient.gui.tabs.Tab.openScreen

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/tabs/Tab.java:20`

```java
public void openScreen(GuiTheme theme)
```

## meteordevelopment.meteorclient.gui.tabs.Tab.createScreen

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/tabs/Tab.java:26`

```java
public abstract TabScreen createScreen(GuiTheme theme)
```

## meteordevelopment.meteorclient.gui.tabs.Tab.isScreen

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/tabs/Tab.java:28`

```java
public abstract boolean isScreen(Screen screen)
```

## meteordevelopment.meteorclient.gui.tabs.TabScreen

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/tabs/TabScreen.java:13`

```java
public abstract class TabScreen extends WidgetScreen
```

## meteordevelopment.meteorclient.gui.tabs.TabScreen.tab

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/tabs/TabScreen.java:14`

```java
public final Tab tab
```

## meteordevelopment.meteorclient.gui.tabs.TabScreen.TabScreen

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/tabs/TabScreen.java:16`

```java
public TabScreen(GuiTheme theme, Tab tab)
```

## meteordevelopment.meteorclient.gui.tabs.TabScreen.addDirect

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/tabs/TabScreen.java:22`

```java
public <T extends WWidget> Cell<T> addDirect(T widget)
```

## meteordevelopment.meteorclient.gui.tabs.Tabs

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/tabs/Tabs.java:16`

```java
public class Tabs
```

## meteordevelopment.meteorclient.gui.tabs.Tabs.init

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/tabs/Tabs.java:23`

```java
@PreInit(dependencies = PathManagers.class) public static void init()
```

## meteordevelopment.meteorclient.gui.tabs.Tabs.add

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/tabs/Tabs.java:38`

```java
public static void add(Tab tab)
```

## meteordevelopment.meteorclient.gui.tabs.Tabs.get

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/tabs/Tabs.java:43`

```java
public static List<Tab> get()
```

## meteordevelopment.meteorclient.gui.tabs.Tabs.get

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/tabs/Tabs.java:47`

```java
public static Tab get(Class<? extends Tab> klass)
```

## meteordevelopment.meteorclient.gui.tabs.WindowTabScreen

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/tabs/WindowTabScreen.java:13`

```java
public abstract class WindowTabScreen extends TabScreen
```

## meteordevelopment.meteorclient.gui.tabs.WindowTabScreen.window

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/tabs/WindowTabScreen.java:14`

```java
protected final WWindow window
```

## meteordevelopment.meteorclient.gui.tabs.WindowTabScreen.WindowTabScreen

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/tabs/WindowTabScreen.java:16`

```java
public WindowTabScreen(GuiTheme theme, Tab tab)
```

## meteordevelopment.meteorclient.gui.tabs.WindowTabScreen.add

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/tabs/WindowTabScreen.java:22`

```java
@Override public <W extends WWidget> Cell<W> add(W widget)
```

## meteordevelopment.meteorclient.gui.tabs.WindowTabScreen.clear

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/tabs/WindowTabScreen.java:27`

```java
@Override public void clear()
```

## meteordevelopment.meteorclient.gui.tabs.builtin.ConfigTab

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/tabs/builtin/ConfigTab.java:18`

```java
public class ConfigTab extends Tab
```

## meteordevelopment.meteorclient.gui.tabs.builtin.ConfigTab.ConfigTab

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/tabs/builtin/ConfigTab.java:19`

```java
public ConfigTab()
```

## meteordevelopment.meteorclient.gui.tabs.builtin.ConfigTab.createScreen

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/tabs/builtin/ConfigTab.java:23`

```java
@Override public TabScreen createScreen(GuiTheme theme)
```

## meteordevelopment.meteorclient.gui.tabs.builtin.ConfigTab.isScreen

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/tabs/builtin/ConfigTab.java:28`

```java
@Override public boolean isScreen(Screen screen)
```

## meteordevelopment.meteorclient.gui.tabs.builtin.ConfigTab.ConfigScreen

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/tabs/builtin/ConfigTab.java:33`

```java
public static class ConfigScreen extends WindowTabScreen
```

## meteordevelopment.meteorclient.gui.tabs.builtin.ConfigTab.ConfigScreen.ConfigScreen

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/tabs/builtin/ConfigTab.java:36`

```java
public ConfigScreen(GuiTheme theme, Tab tab)
```

## meteordevelopment.meteorclient.gui.tabs.builtin.ConfigTab.ConfigScreen.initWidgets

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/tabs/builtin/ConfigTab.java:76`

```java
@Override public void initWidgets()
```

## meteordevelopment.meteorclient.gui.tabs.builtin.ConfigTab.ConfigScreen.tick

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/tabs/builtin/ConfigTab.java:81`

```java
@Override public void tick()
```

## meteordevelopment.meteorclient.gui.tabs.builtin.ConfigTab.ConfigScreen.toClipboard

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/tabs/builtin/ConfigTab.java:88`

```java
@Override public boolean toClipboard()
```

## meteordevelopment.meteorclient.gui.tabs.builtin.ConfigTab.ConfigScreen.fromClipboard

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/tabs/builtin/ConfigTab.java:93`

```java
@Override public boolean fromClipboard()
```

## meteordevelopment.meteorclient.gui.tabs.builtin.FriendsTab

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/tabs/builtin/FriendsTab.java:25`

```java
public class FriendsTab extends Tab
```

## meteordevelopment.meteorclient.gui.tabs.builtin.FriendsTab.FriendsTab

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/tabs/builtin/FriendsTab.java:26`

```java
public FriendsTab()
```

## meteordevelopment.meteorclient.gui.tabs.builtin.FriendsTab.createScreen

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/tabs/builtin/FriendsTab.java:30`

```java
@Override public TabScreen createScreen(GuiTheme theme)
```

## meteordevelopment.meteorclient.gui.tabs.builtin.FriendsTab.isScreen

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/tabs/builtin/FriendsTab.java:35`

```java
@Override public boolean isScreen(Screen screen)
```

## meteordevelopment.meteorclient.gui.tabs.builtin.GuiTab

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/tabs/builtin/GuiTab.java:22`

```java
public class GuiTab extends Tab
```

## meteordevelopment.meteorclient.gui.tabs.builtin.GuiTab.GuiTab

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/tabs/builtin/GuiTab.java:23`

```java
public GuiTab()
```

## meteordevelopment.meteorclient.gui.tabs.builtin.GuiTab.createScreen

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/tabs/builtin/GuiTab.java:27`

```java
@Override public TabScreen createScreen(GuiTheme theme)
```

## meteordevelopment.meteorclient.gui.tabs.builtin.GuiTab.isScreen

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/tabs/builtin/GuiTab.java:32`

```java
@Override public boolean isScreen(Screen screen)
```

## meteordevelopment.meteorclient.gui.tabs.builtin.HudTab

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/tabs/builtin/HudTab.java:24`

```java
public class HudTab extends Tab
```

## meteordevelopment.meteorclient.gui.tabs.builtin.HudTab.HudTab

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/tabs/builtin/HudTab.java:25`

```java
public HudTab()
```

## meteordevelopment.meteorclient.gui.tabs.builtin.HudTab.createScreen

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/tabs/builtin/HudTab.java:29`

```java
@Override public TabScreen createScreen(GuiTheme theme)
```

## meteordevelopment.meteorclient.gui.tabs.builtin.HudTab.isScreen

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/tabs/builtin/HudTab.java:34`

```java
@Override public boolean isScreen(Screen screen)
```

## meteordevelopment.meteorclient.gui.tabs.builtin.HudTab.HudScreen

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/tabs/builtin/HudTab.java:39`

```java
public static class HudScreen extends WindowTabScreen
```

## meteordevelopment.meteorclient.gui.tabs.builtin.HudTab.HudScreen.HudScreen

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/tabs/builtin/HudTab.java:43`

```java
public HudScreen(GuiTheme theme, Tab tab)
```

## meteordevelopment.meteorclient.gui.tabs.builtin.HudTab.HudScreen.initWidgets

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/tabs/builtin/HudTab.java:50`

```java
@Override public void initWidgets()
```

## meteordevelopment.meteorclient.gui.tabs.builtin.HudTab.HudScreen.tick

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/tabs/builtin/HudTab.java:77`

```java
@Override public void tick()
```

## meteordevelopment.meteorclient.gui.tabs.builtin.HudTab.HudScreen.toClipboard

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/tabs/builtin/HudTab.java:84`

```java
@Override public boolean toClipboard()
```

## meteordevelopment.meteorclient.gui.tabs.builtin.HudTab.HudScreen.fromClipboard

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/tabs/builtin/HudTab.java:89`

```java
@Override public boolean fromClipboard()
```

## meteordevelopment.meteorclient.gui.tabs.builtin.MacrosTab

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/tabs/builtin/MacrosTab.java:25`

```java
public class MacrosTab extends Tab
```

## meteordevelopment.meteorclient.gui.tabs.builtin.MacrosTab.MacrosTab

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/tabs/builtin/MacrosTab.java:26`

```java
public MacrosTab()
```

## meteordevelopment.meteorclient.gui.tabs.builtin.MacrosTab.createScreen

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/tabs/builtin/MacrosTab.java:30`

```java
@Override public TabScreen createScreen(GuiTheme theme)
```

## meteordevelopment.meteorclient.gui.tabs.builtin.MacrosTab.isScreen

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/tabs/builtin/MacrosTab.java:35`

```java
@Override public boolean isScreen(Screen screen)
```

## meteordevelopment.meteorclient.gui.tabs.builtin.ModulesTab

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/tabs/builtin/ModulesTab.java:14`

```java
public class ModulesTab extends Tab
```

## meteordevelopment.meteorclient.gui.tabs.builtin.ModulesTab.ModulesTab

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/tabs/builtin/ModulesTab.java:15`

```java
public ModulesTab()
```

## meteordevelopment.meteorclient.gui.tabs.builtin.ModulesTab.createScreen

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/tabs/builtin/ModulesTab.java:19`

```java
@Override public TabScreen createScreen(GuiTheme theme)
```

## meteordevelopment.meteorclient.gui.tabs.builtin.ModulesTab.isScreen

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/tabs/builtin/ModulesTab.java:24`

```java
@Override public boolean isScreen(Screen screen)
```

## meteordevelopment.meteorclient.gui.tabs.builtin.PathManagerTab

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/tabs/builtin/PathManagerTab.java:16`

```java
public class PathManagerTab extends Tab
```

## meteordevelopment.meteorclient.gui.tabs.builtin.PathManagerTab.PathManagerTab

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/tabs/builtin/PathManagerTab.java:17`

```java
public PathManagerTab()
```

## meteordevelopment.meteorclient.gui.tabs.builtin.PathManagerTab.createScreen

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/tabs/builtin/PathManagerTab.java:21`

```java
@Override public TabScreen createScreen(GuiTheme theme)
```

## meteordevelopment.meteorclient.gui.tabs.builtin.PathManagerTab.isScreen

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/tabs/builtin/PathManagerTab.java:26`

```java
@Override public boolean isScreen(Screen screen)
```

## meteordevelopment.meteorclient.gui.tabs.builtin.ProfilesTab

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/tabs/builtin/ProfilesTab.java:45`

```java
public class ProfilesTab extends Tab
```

## meteordevelopment.meteorclient.gui.tabs.builtin.ProfilesTab.ProfilesTab

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/tabs/builtin/ProfilesTab.java:46`

```java
public ProfilesTab()
```

## meteordevelopment.meteorclient.gui.tabs.builtin.ProfilesTab.createScreen

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/tabs/builtin/ProfilesTab.java:50`

```java
@Override public TabScreen createScreen(GuiTheme theme)
```

## meteordevelopment.meteorclient.gui.tabs.builtin.ProfilesTab.isScreen

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/tabs/builtin/ProfilesTab.java:55`

```java
@Override public boolean isScreen(Screen screen)
```

## meteordevelopment.meteorclient.gui.themes.meteor.MeteorGuiTheme

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/MeteorGuiTheme.java:37`

```java
public class MeteorGuiTheme extends GuiTheme
```

## meteordevelopment.meteorclient.gui.themes.meteor.MeteorGuiTheme.scale

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/MeteorGuiTheme.java:50`

```java
public final Setting<Double> scale = sgGeneral.add(new DoubleSetting.Builder() .name("scale") .description("Scale of the GUI.") .defaultValue(1) .min(0.75) .sliderRange(0.75, 4) .onSliderRelease() .onChanged(_ -> { if (mc.gui.screen() instanceof WidgetScreen widgetScreen) widgetScreen.invalidate(); }) .build() )
```

## meteordevelopment.meteorclient.gui.themes.meteor.MeteorGuiTheme.moduleAlignment

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/MeteorGuiTheme.java:63`

```java
public final Setting<AlignmentX> moduleAlignment = sgGeneral.add(new EnumSetting.Builder<AlignmentX>() .name("module-alignment") .description("How module titles are aligned.") .defaultValue(AlignmentX.Center) .build() )
```

## meteordevelopment.meteorclient.gui.themes.meteor.MeteorGuiTheme.categoryIcons

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/MeteorGuiTheme.java:70`

```java
public final Setting<Boolean> categoryIcons = sgGeneral.add(new BoolSetting.Builder() .name("category-icons") .description("Adds item icons to module categories.") .defaultValue(false) .build() )
```

## meteordevelopment.meteorclient.gui.themes.meteor.MeteorGuiTheme.modulesHelpText

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/MeteorGuiTheme.java:77`

```java
public final Setting<Boolean> modulesHelpText = sgGeneral.add(new BoolSetting.Builder() .name("modules-help-text") .description("Toggle help text in the modules screen.") .defaultValue(true) .build() )
```

## meteordevelopment.meteorclient.gui.themes.meteor.MeteorGuiTheme.hideHUD

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/MeteorGuiTheme.java:84`

```java
public final Setting<Boolean> hideHUD = sgGeneral.add(new BoolSetting.Builder() .name("hide-HUD") .description("Hide HUD when in GUI.") .defaultValue(false) .build() )
```

## meteordevelopment.meteorclient.gui.themes.meteor.MeteorGuiTheme.accentColor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/MeteorGuiTheme.java:93`

```java
public final Setting<SettingColor> accentColor = color("accent", "Main color of the GUI.", new SettingColor(145, 61, 226))
```

## meteordevelopment.meteorclient.gui.themes.meteor.MeteorGuiTheme.checkboxColor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/MeteorGuiTheme.java:94`

```java
public final Setting<SettingColor> checkboxColor = color("checkbox", "Color of checkbox.", new SettingColor(145, 61, 226))
```

## meteordevelopment.meteorclient.gui.themes.meteor.MeteorGuiTheme.plusColor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/MeteorGuiTheme.java:95`

```java
public final Setting<SettingColor> plusColor = color("plus", "Color of plus button.", new SettingColor(50, 255, 50))
```

## meteordevelopment.meteorclient.gui.themes.meteor.MeteorGuiTheme.minusColor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/MeteorGuiTheme.java:96`

```java
public final Setting<SettingColor> minusColor = color("minus", "Color of minus button.", new SettingColor(255, 50, 50))
```

## meteordevelopment.meteorclient.gui.themes.meteor.MeteorGuiTheme.favoriteColor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/MeteorGuiTheme.java:97`

```java
public final Setting<SettingColor> favoriteColor = color("favorite", "Color of checked favorite button.", new SettingColor(250, 215, 0))
```

## meteordevelopment.meteorclient.gui.themes.meteor.MeteorGuiTheme.textColor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/MeteorGuiTheme.java:101`

```java
public final Setting<SettingColor> textColor = color(sgTextColors, "text", "Color of text.", new SettingColor(255, 255, 255))
```

## meteordevelopment.meteorclient.gui.themes.meteor.MeteorGuiTheme.textSecondaryColor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/MeteorGuiTheme.java:102`

```java
public final Setting<SettingColor> textSecondaryColor = color(sgTextColors, "text-secondary-text", "Color of secondary text.", new SettingColor(150, 150, 150))
```

## meteordevelopment.meteorclient.gui.themes.meteor.MeteorGuiTheme.textHighlightColor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/MeteorGuiTheme.java:103`

```java
public final Setting<SettingColor> textHighlightColor = color(sgTextColors, "text-highlight", "Color of text highlighting.", new SettingColor(45, 125, 245, 100))
```

## meteordevelopment.meteorclient.gui.themes.meteor.MeteorGuiTheme.titleTextColor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/MeteorGuiTheme.java:104`

```java
public final Setting<SettingColor> titleTextColor = color(sgTextColors, "title-text", "Color of title text.", new SettingColor(255, 255, 255))
```

## meteordevelopment.meteorclient.gui.themes.meteor.MeteorGuiTheme.loggedInColor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/MeteorGuiTheme.java:105`

```java
public final Setting<SettingColor> loggedInColor = color(sgTextColors, "logged-in-text", "Color of logged in account name.", new SettingColor(45, 225, 45))
```

## meteordevelopment.meteorclient.gui.themes.meteor.MeteorGuiTheme.placeholderColor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/MeteorGuiTheme.java:106`

```java
public final Setting<SettingColor> placeholderColor = color(sgTextColors, "placeholder", "Color of placeholder text.", new SettingColor(255, 255, 255, 20))
```

## meteordevelopment.meteorclient.gui.themes.meteor.MeteorGuiTheme.backgroundColor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/MeteorGuiTheme.java:110`

```java
public final ThreeStateColorSetting backgroundColor = new ThreeStateColorSetting( sgBackgroundColors, "background", new SettingColor(20, 20, 20, 200), new SettingColor(30, 30, 30, 200), new SettingColor(40, 40, 40, 200) )
```

## meteordevelopment.meteorclient.gui.themes.meteor.MeteorGuiTheme.moduleBackground

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/MeteorGuiTheme.java:118`

```java
public final Setting<SettingColor> moduleBackground = color(sgBackgroundColors, "module-background", "Color of module background when active.", new SettingColor(50, 50, 50))
```

## meteordevelopment.meteorclient.gui.themes.meteor.MeteorGuiTheme.outlineColor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/MeteorGuiTheme.java:122`

```java
public final ThreeStateColorSetting outlineColor = new ThreeStateColorSetting( sgOutline, "outline", new SettingColor(0, 0, 0), new SettingColor(10, 10, 10), new SettingColor(20, 20, 20) )
```

## meteordevelopment.meteorclient.gui.themes.meteor.MeteorGuiTheme.separatorText

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/MeteorGuiTheme.java:132`

```java
public final Setting<SettingColor> separatorText = color(sgSeparator, "separator-text", "Color of separator text", new SettingColor(255, 255, 255))
```

## meteordevelopment.meteorclient.gui.themes.meteor.MeteorGuiTheme.separatorCenter

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/MeteorGuiTheme.java:133`

```java
public final Setting<SettingColor> separatorCenter = color(sgSeparator, "separator-center", "Center color of separators.", new SettingColor(255, 255, 255))
```

## meteordevelopment.meteorclient.gui.themes.meteor.MeteorGuiTheme.separatorEdges

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/MeteorGuiTheme.java:134`

```java
public final Setting<SettingColor> separatorEdges = color(sgSeparator, "separator-edges", "Color of separator edges.", new SettingColor(225, 225, 225, 150))
```

## meteordevelopment.meteorclient.gui.themes.meteor.MeteorGuiTheme.scrollbarColor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/MeteorGuiTheme.java:138`

```java
public final ThreeStateColorSetting scrollbarColor = new ThreeStateColorSetting( sgScrollbar, "Scrollbar", new SettingColor(30, 30, 30, 200), new SettingColor(40, 40, 40, 200), new SettingColor(50, 50, 50, 200) )
```

## meteordevelopment.meteorclient.gui.themes.meteor.MeteorGuiTheme.sliderHandle

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/MeteorGuiTheme.java:148`

```java
public final ThreeStateColorSetting sliderHandle = new ThreeStateColorSetting( sgSlider, "slider-handle", new SettingColor(130, 0, 255), new SettingColor(140, 30, 255), new SettingColor(150, 60, 255) )
```

## meteordevelopment.meteorclient.gui.themes.meteor.MeteorGuiTheme.sliderLeft

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/MeteorGuiTheme.java:156`

```java
public final Setting<SettingColor> sliderLeft = color(sgSlider, "slider-left", "Color of slider left part.", new SettingColor(100, 35, 170))
```

## meteordevelopment.meteorclient.gui.themes.meteor.MeteorGuiTheme.sliderRight

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/MeteorGuiTheme.java:157`

```java
public final Setting<SettingColor> sliderRight = color(sgSlider, "slider-right", "Color of slider right part.", new SettingColor(50, 50, 50))
```

## meteordevelopment.meteorclient.gui.themes.meteor.MeteorGuiTheme.MeteorGuiTheme

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/MeteorGuiTheme.java:172`

```java
public MeteorGuiTheme()
```

## meteordevelopment.meteorclient.gui.themes.meteor.MeteorGuiTheme.window

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/MeteorGuiTheme.java:192`

```java
@Override public WWindow window(WWidget icon, String title)
```

## meteordevelopment.meteorclient.gui.themes.meteor.MeteorGuiTheme.label

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/MeteorGuiTheme.java:197`

```java
@Override public WLabel label(String text, boolean title, double maxWidth)
```

## meteordevelopment.meteorclient.gui.themes.meteor.MeteorGuiTheme.horizontalSeparator

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/MeteorGuiTheme.java:203`

```java
@Override public WHorizontalSeparator horizontalSeparator(String text)
```

## meteordevelopment.meteorclient.gui.themes.meteor.MeteorGuiTheme.verticalSeparator

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/MeteorGuiTheme.java:208`

```java
@Override public WVerticalSeparator verticalSeparator()
```

## meteordevelopment.meteorclient.gui.themes.meteor.MeteorGuiTheme.button

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/MeteorGuiTheme.java:213`

```java
@Override protected WButton button(String text, GuiTexture texture)
```

## meteordevelopment.meteorclient.gui.themes.meteor.MeteorGuiTheme.confirmedButton

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/MeteorGuiTheme.java:218`

```java
@Override protected WConfirmedButton confirmedButton(String text, String confirmText, GuiTexture texture)
```

## meteordevelopment.meteorclient.gui.themes.meteor.MeteorGuiTheme.minus

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/MeteorGuiTheme.java:223`

```java
@Override public WMinus minus()
```

## meteordevelopment.meteorclient.gui.themes.meteor.MeteorGuiTheme.confirmedMinus

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/MeteorGuiTheme.java:228`

```java
@Override public WConfirmedMinus confirmedMinus()
```

## meteordevelopment.meteorclient.gui.themes.meteor.MeteorGuiTheme.plus

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/MeteorGuiTheme.java:233`

```java
@Override public WPlus plus()
```

## meteordevelopment.meteorclient.gui.themes.meteor.MeteorGuiTheme.checkbox

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/MeteorGuiTheme.java:238`

```java
@Override public WCheckbox checkbox(boolean checked)
```

## meteordevelopment.meteorclient.gui.themes.meteor.MeteorGuiTheme.slider

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/MeteorGuiTheme.java:243`

```java
@Override public WSlider slider(double value, double min, double max)
```

## meteordevelopment.meteorclient.gui.themes.meteor.MeteorGuiTheme.textBox

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/MeteorGuiTheme.java:248`

```java
@Override public WTextBox textBox(String text, String placeholder, CharFilter filter, Class<? extends WTextBox.Renderer> renderer)
```

## meteordevelopment.meteorclient.gui.themes.meteor.MeteorGuiTheme.dropdown

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/MeteorGuiTheme.java:253`

```java
@Override public <T> WDropdown<T> dropdown(T[] values, T value)
```

## meteordevelopment.meteorclient.gui.themes.meteor.MeteorGuiTheme.triangle

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/MeteorGuiTheme.java:258`

```java
@Override public WTriangle triangle()
```

## meteordevelopment.meteorclient.gui.themes.meteor.MeteorGuiTheme.tooltip

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/MeteorGuiTheme.java:263`

```java
@Override public WTooltip tooltip(String text)
```

## meteordevelopment.meteorclient.gui.themes.meteor.MeteorGuiTheme.view

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/MeteorGuiTheme.java:268`

```java
@Override public WView view()
```

## meteordevelopment.meteorclient.gui.themes.meteor.MeteorGuiTheme.section

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/MeteorGuiTheme.java:273`

```java
@Override public WSection section(String title, boolean expanded, WWidget headerWidget)
```

## meteordevelopment.meteorclient.gui.themes.meteor.MeteorGuiTheme.account

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/MeteorGuiTheme.java:278`

```java
@Override public WAccount account(WidgetScreen screen, Account<?> account)
```

## meteordevelopment.meteorclient.gui.themes.meteor.MeteorGuiTheme.module

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/MeteorGuiTheme.java:283`

```java
@Override public WWidget module(Module module, String title)
```

## meteordevelopment.meteorclient.gui.themes.meteor.MeteorGuiTheme.quad

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/MeteorGuiTheme.java:288`

```java
@Override public WQuad quad(Color color)
```

## meteordevelopment.meteorclient.gui.themes.meteor.MeteorGuiTheme.topBar

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/MeteorGuiTheme.java:293`

```java
@Override public WTopBar topBar()
```

## meteordevelopment.meteorclient.gui.themes.meteor.MeteorGuiTheme.favorite

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/MeteorGuiTheme.java:298`

```java
@Override public WFavorite favorite(boolean checked)
```

## meteordevelopment.meteorclient.gui.themes.meteor.MeteorGuiTheme.textColor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/MeteorGuiTheme.java:305`

```java
@Override public Color textColor()
```

## meteordevelopment.meteorclient.gui.themes.meteor.MeteorGuiTheme.textSecondaryColor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/MeteorGuiTheme.java:310`

```java
@Override public Color textSecondaryColor()
```

## meteordevelopment.meteorclient.gui.themes.meteor.MeteorGuiTheme.starscriptTextColor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/MeteorGuiTheme.java:317`

```java
@Override public Color starscriptTextColor()
```

## meteordevelopment.meteorclient.gui.themes.meteor.MeteorGuiTheme.starscriptBraceColor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/MeteorGuiTheme.java:322`

```java
@Override public Color starscriptBraceColor()
```

## meteordevelopment.meteorclient.gui.themes.meteor.MeteorGuiTheme.starscriptParenthesisColor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/MeteorGuiTheme.java:327`

```java
@Override public Color starscriptParenthesisColor()
```

## meteordevelopment.meteorclient.gui.themes.meteor.MeteorGuiTheme.starscriptDotColor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/MeteorGuiTheme.java:332`

```java
@Override public Color starscriptDotColor()
```

## meteordevelopment.meteorclient.gui.themes.meteor.MeteorGuiTheme.starscriptCommaColor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/MeteorGuiTheme.java:337`

```java
@Override public Color starscriptCommaColor()
```

## meteordevelopment.meteorclient.gui.themes.meteor.MeteorGuiTheme.starscriptOperatorColor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/MeteorGuiTheme.java:342`

```java
@Override public Color starscriptOperatorColor()
```

## meteordevelopment.meteorclient.gui.themes.meteor.MeteorGuiTheme.starscriptStringColor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/MeteorGuiTheme.java:347`

```java
@Override public Color starscriptStringColor()
```

## meteordevelopment.meteorclient.gui.themes.meteor.MeteorGuiTheme.starscriptNumberColor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/MeteorGuiTheme.java:352`

```java
@Override public Color starscriptNumberColor()
```

## meteordevelopment.meteorclient.gui.themes.meteor.MeteorGuiTheme.starscriptKeywordColor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/MeteorGuiTheme.java:357`

```java
@Override public Color starscriptKeywordColor()
```

## meteordevelopment.meteorclient.gui.themes.meteor.MeteorGuiTheme.starscriptAccessedObjectColor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/MeteorGuiTheme.java:362`

```java
@Override public Color starscriptAccessedObjectColor()
```

## meteordevelopment.meteorclient.gui.themes.meteor.MeteorGuiTheme.textRenderer

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/MeteorGuiTheme.java:369`

```java
@Override public TextRenderer textRenderer()
```

## meteordevelopment.meteorclient.gui.themes.meteor.MeteorGuiTheme.scale

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/MeteorGuiTheme.java:374`

```java
@Override public double scale(double value)
```

## meteordevelopment.meteorclient.gui.themes.meteor.MeteorGuiTheme.categoryIcons

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/MeteorGuiTheme.java:385`

```java
@Override public boolean categoryIcons()
```

## meteordevelopment.meteorclient.gui.themes.meteor.MeteorGuiTheme.modulesHelpText

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/MeteorGuiTheme.java:390`

```java
@Override public boolean modulesHelpText()
```

## meteordevelopment.meteorclient.gui.themes.meteor.MeteorGuiTheme.hideHUD

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/MeteorGuiTheme.java:395`

```java
@Override public boolean hideHUD()
```

## meteordevelopment.meteorclient.gui.themes.meteor.MeteorGuiTheme.ThreeStateColorSetting

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/MeteorGuiTheme.java:400`

```java
public class ThreeStateColorSetting
```

## meteordevelopment.meteorclient.gui.themes.meteor.MeteorGuiTheme.ThreeStateColorSetting.ThreeStateColorSetting

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/MeteorGuiTheme.java:403`

```java
public ThreeStateColorSetting(SettingGroup group, String name, SettingColor c1, SettingColor c2, SettingColor c3)
```

## meteordevelopment.meteorclient.gui.themes.meteor.MeteorGuiTheme.ThreeStateColorSetting.get

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/MeteorGuiTheme.java:409`

```java
public SettingColor get()
```

## meteordevelopment.meteorclient.gui.themes.meteor.MeteorGuiTheme.ThreeStateColorSetting.get

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/MeteorGuiTheme.java:413`

```java
public SettingColor get(boolean pressed, boolean hovered, boolean bypassDisableHoverColor)
```

## meteordevelopment.meteorclient.gui.themes.meteor.MeteorGuiTheme.ThreeStateColorSetting.get

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/MeteorGuiTheme.java:418`

```java
public SettingColor get(boolean pressed, boolean hovered)
```

## meteordevelopment.meteorclient.gui.themes.meteor.MeteorWidget

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/MeteorWidget.java:13`

```java
public interface MeteorWidget extends BaseWidget
```

## meteordevelopment.meteorclient.gui.themes.meteor.MeteorWidget.theme

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/MeteorWidget.java:14`

```java
default MeteorGuiTheme theme()
```

## meteordevelopment.meteorclient.gui.themes.meteor.MeteorWidget.renderBackground

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/MeteorWidget.java:18`

```java
default void renderBackground(GuiRenderer renderer, WWidget widget, Color outlineColor, Color backgroundColor)
```

## meteordevelopment.meteorclient.gui.themes.meteor.MeteorWidget.renderBackground

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/MeteorWidget.java:30`

```java
default void renderBackground(GuiRenderer renderer, WWidget widget, boolean pressed, boolean mouseOver)
```

## meteordevelopment.meteorclient.gui.themes.meteor.widgets.WMeteorAccount

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/widgets/WMeteorAccount.java:14`

```java
public class WMeteorAccount extends WAccount implements MeteorWidget
```

## meteordevelopment.meteorclient.gui.themes.meteor.widgets.WMeteorAccount.WMeteorAccount

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/widgets/WMeteorAccount.java:15`

```java
public WMeteorAccount(WidgetScreen screen, Account<?> account)
```

## meteordevelopment.meteorclient.gui.themes.meteor.widgets.WMeteorAccount.loggedInColor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/widgets/WMeteorAccount.java:19`

```java
@Override protected Color loggedInColor()
```

## meteordevelopment.meteorclient.gui.themes.meteor.widgets.WMeteorAccount.accountTypeColor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/widgets/WMeteorAccount.java:24`

```java
@Override protected Color accountTypeColor()
```

## meteordevelopment.meteorclient.gui.themes.meteor.widgets.WMeteorHorizontalSeparator

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/widgets/WMeteorHorizontalSeparator.java:13`

```java
public class WMeteorHorizontalSeparator extends WHorizontalSeparator implements MeteorWidget
```

## meteordevelopment.meteorclient.gui.themes.meteor.widgets.WMeteorHorizontalSeparator.WMeteorHorizontalSeparator

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/widgets/WMeteorHorizontalSeparator.java:14`

```java
public WMeteorHorizontalSeparator(String text)
```

## meteordevelopment.meteorclient.gui.themes.meteor.widgets.WMeteorHorizontalSeparator.onRender

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/widgets/WMeteorHorizontalSeparator.java:18`

```java
@Override protected void onRender(GuiRenderer renderer, double mouseX, double mouseY, double delta)
```

## meteordevelopment.meteorclient.gui.themes.meteor.widgets.WMeteorLabel

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/widgets/WMeteorLabel.java:12`

```java
public class WMeteorLabel extends WLabel implements MeteorWidget
```

## meteordevelopment.meteorclient.gui.themes.meteor.widgets.WMeteorLabel.WMeteorLabel

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/widgets/WMeteorLabel.java:13`

```java
public WMeteorLabel(String text, boolean title)
```

## meteordevelopment.meteorclient.gui.themes.meteor.widgets.WMeteorLabel.onRender

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/widgets/WMeteorLabel.java:17`

```java
@Override protected void onRender(GuiRenderer renderer, double mouseX, double mouseY, double delta)
```

## meteordevelopment.meteorclient.gui.themes.meteor.widgets.WMeteorModule

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/widgets/WMeteorModule.java:20`

```java
public class WMeteorModule extends WPressable implements MeteorWidget
```

## meteordevelopment.meteorclient.gui.themes.meteor.widgets.WMeteorModule.WMeteorModule

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/widgets/WMeteorModule.java:30`

```java
public WMeteorModule(Module module, String title)
```

## meteordevelopment.meteorclient.gui.themes.meteor.widgets.WMeteorModule.pad

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/widgets/WMeteorModule.java:44`

```java
@Override public double pad()
```

## meteordevelopment.meteorclient.gui.themes.meteor.widgets.WMeteorModule.onCalculateSize

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/widgets/WMeteorModule.java:49`

```java
@Override protected void onCalculateSize()
```

## meteordevelopment.meteorclient.gui.themes.meteor.widgets.WMeteorModule.onPressed

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/widgets/WMeteorModule.java:59`

```java
@Override protected void onPressed(int button)
```

## meteordevelopment.meteorclient.gui.themes.meteor.widgets.WMeteorModule.onRender

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/widgets/WMeteorModule.java:65`

```java
@Override protected void onRender(GuiRenderer renderer, double mouseX, double mouseY, double delta)
```

## meteordevelopment.meteorclient.gui.themes.meteor.widgets.WMeteorMultiLabel

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/widgets/WMeteorMultiLabel.java:13`

```java
public class WMeteorMultiLabel extends WMultiLabel implements MeteorWidget
```

## meteordevelopment.meteorclient.gui.themes.meteor.widgets.WMeteorMultiLabel.WMeteorMultiLabel

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/widgets/WMeteorMultiLabel.java:14`

```java
public WMeteorMultiLabel(String text, boolean title, double maxWidth)
```

## meteordevelopment.meteorclient.gui.themes.meteor.widgets.WMeteorMultiLabel.onRender

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/widgets/WMeteorMultiLabel.java:18`

```java
@Override protected void onRender(GuiRenderer renderer, double mouseX, double mouseY, double delta)
```

## meteordevelopment.meteorclient.gui.themes.meteor.widgets.WMeteorQuad

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/widgets/WMeteorQuad.java:12`

```java
public class WMeteorQuad extends WQuad
```

## meteordevelopment.meteorclient.gui.themes.meteor.widgets.WMeteorQuad.WMeteorQuad

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/widgets/WMeteorQuad.java:13`

```java
public WMeteorQuad(Color color)
```

## meteordevelopment.meteorclient.gui.themes.meteor.widgets.WMeteorQuad.onRender

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/widgets/WMeteorQuad.java:17`

```java
@Override protected void onRender(GuiRenderer renderer, double mouseX, double mouseY, double delta)
```

## meteordevelopment.meteorclient.gui.themes.meteor.widgets.WMeteorSection

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/widgets/WMeteorSection.java:14`

```java
public class WMeteorSection extends WSection
```

## meteordevelopment.meteorclient.gui.themes.meteor.widgets.WMeteorSection.WMeteorSection

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/widgets/WMeteorSection.java:15`

```java
public WMeteorSection(String title, boolean expanded, WWidget headerWidget)
```

## meteordevelopment.meteorclient.gui.themes.meteor.widgets.WMeteorSection.createHeader

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/widgets/WMeteorSection.java:19`

```java
@Override protected WHeader createHeader()
```

## meteordevelopment.meteorclient.gui.themes.meteor.widgets.WMeteorSection.WMeteorHeader

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/widgets/WMeteorSection.java:24`

```java
protected class WMeteorHeader extends WHeader
```

## meteordevelopment.meteorclient.gui.themes.meteor.widgets.WMeteorSection.WMeteorHeader.WMeteorHeader

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/widgets/WMeteorSection.java:27`

```java
public WMeteorHeader(String title)
```

## meteordevelopment.meteorclient.gui.themes.meteor.widgets.WMeteorSection.WMeteorHeader.init

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/widgets/WMeteorSection.java:31`

```java
@Override public void init()
```

## meteordevelopment.meteorclient.gui.themes.meteor.widgets.WMeteorSection.WMeteorHeader.onRender

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/widgets/WMeteorSection.java:44`

```java
@Override protected void onRender(GuiRenderer renderer, double mouseX, double mouseY, double delta)
```

## meteordevelopment.meteorclient.gui.themes.meteor.widgets.WMeteorSection.WHeaderTriangle

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/widgets/WMeteorSection.java:50`

```java
protected static class WHeaderTriangle extends WTriangle implements MeteorWidget
```

## meteordevelopment.meteorclient.gui.themes.meteor.widgets.WMeteorSection.WHeaderTriangle.onRender

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/widgets/WMeteorSection.java:51`

```java
@Override protected void onRender(GuiRenderer renderer, double mouseX, double mouseY, double delta)
```

## meteordevelopment.meteorclient.gui.themes.meteor.widgets.WMeteorTooltip

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/widgets/WMeteorTooltip.java:14`

```java
public class WMeteorTooltip extends WTooltip implements MeteorWidget
```

## meteordevelopment.meteorclient.gui.themes.meteor.widgets.WMeteorTooltip.WMeteorTooltip

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/widgets/WMeteorTooltip.java:15`

```java
public WMeteorTooltip(String text)
```

## meteordevelopment.meteorclient.gui.themes.meteor.widgets.WMeteorTooltip.onRender

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/widgets/WMeteorTooltip.java:19`

```java
@Override protected void onRender(GuiRenderer renderer, double mouseX, double mouseY, double delta)
```

## meteordevelopment.meteorclient.gui.themes.meteor.widgets.WMeteorTopBar

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/widgets/WMeteorTopBar.java:12`

```java
public class WMeteorTopBar extends WTopBar implements MeteorWidget
```

## meteordevelopment.meteorclient.gui.themes.meteor.widgets.WMeteorTopBar.getButtonColor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/widgets/WMeteorTopBar.java:13`

```java
@Override protected Color getButtonColor(boolean pressed, boolean hovered)
```

## meteordevelopment.meteorclient.gui.themes.meteor.widgets.WMeteorTopBar.getNameColor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/widgets/WMeteorTopBar.java:18`

```java
@Override protected Color getNameColor()
```

## meteordevelopment.meteorclient.gui.themes.meteor.widgets.WMeteorVerticalSeparator

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/widgets/WMeteorVerticalSeparator.java:14`

```java
public class WMeteorVerticalSeparator extends WVerticalSeparator implements MeteorWidget
```

## meteordevelopment.meteorclient.gui.themes.meteor.widgets.WMeteorVerticalSeparator.onRender

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/widgets/WMeteorVerticalSeparator.java:15`

```java
@Override protected void onRender(GuiRenderer renderer, double mouseX, double mouseY, double delta)
```

## meteordevelopment.meteorclient.gui.themes.meteor.widgets.WMeteorView

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/widgets/WMeteorView.java:12`

```java
public class WMeteorView extends WView implements MeteorWidget
```

## meteordevelopment.meteorclient.gui.themes.meteor.widgets.WMeteorView.onRender

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/widgets/WMeteorView.java:13`

```java
@Override protected void onRender(GuiRenderer renderer, double mouseX, double mouseY, double delta)
```

## meteordevelopment.meteorclient.gui.themes.meteor.widgets.WMeteorWindow

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/widgets/WMeteorWindow.java:13`

```java
public class WMeteorWindow extends WWindow implements MeteorWidget
```

## meteordevelopment.meteorclient.gui.themes.meteor.widgets.WMeteorWindow.WMeteorWindow

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/widgets/WMeteorWindow.java:14`

```java
public WMeteorWindow(WWidget icon, String title)
```

## meteordevelopment.meteorclient.gui.themes.meteor.widgets.WMeteorWindow.header

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/widgets/WMeteorWindow.java:18`

```java
@Override protected WHeader header(WWidget icon)
```

## meteordevelopment.meteorclient.gui.themes.meteor.widgets.WMeteorWindow.onRender

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/widgets/WMeteorWindow.java:23`

```java
@Override protected void onRender(GuiRenderer renderer, double mouseX, double mouseY, double delta)
```

## meteordevelopment.meteorclient.gui.themes.meteor.widgets.input.WMeteorDropdown

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/widgets/input/WMeteorDropdown.java:14`

```java
public class WMeteorDropdown<T> extends WDropdown<T> implements MeteorWidget
```

## meteordevelopment.meteorclient.gui.themes.meteor.widgets.input.WMeteorDropdown.WMeteorDropdown

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/widgets/input/WMeteorDropdown.java:15`

```java
public WMeteorDropdown(T[] values, T value)
```

## meteordevelopment.meteorclient.gui.themes.meteor.widgets.input.WMeteorDropdown.createRootWidget

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/widgets/input/WMeteorDropdown.java:19`

```java
@Override protected WDropdownRoot createRootWidget()
```

## meteordevelopment.meteorclient.gui.themes.meteor.widgets.input.WMeteorDropdown.createValueWidget

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/widgets/input/WMeteorDropdown.java:24`

```java
@Override protected WDropdownValue createValueWidget()
```

## meteordevelopment.meteorclient.gui.themes.meteor.widgets.input.WMeteorDropdown.onRender

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/widgets/input/WMeteorDropdown.java:29`

```java
@Override protected void onRender(GuiRenderer renderer, double mouseX, double mouseY, double delta)
```

## meteordevelopment.meteorclient.gui.themes.meteor.widgets.input.WMeteorSlider

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/widgets/input/WMeteorSlider.java:13`

```java
public class WMeteorSlider extends WSlider implements MeteorWidget
```

## meteordevelopment.meteorclient.gui.themes.meteor.widgets.input.WMeteorSlider.WMeteorSlider

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/widgets/input/WMeteorSlider.java:14`

```java
public WMeteorSlider(double value, double min, double max)
```

## meteordevelopment.meteorclient.gui.themes.meteor.widgets.input.WMeteorSlider.onRender

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/widgets/input/WMeteorSlider.java:18`

```java
@Override protected void onRender(GuiRenderer renderer, double mouseX, double mouseY, double delta)
```

## meteordevelopment.meteorclient.gui.themes.meteor.widgets.input.WMeteorTextBox

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/widgets/input/WMeteorTextBox.java:20`

```java
public class WMeteorTextBox extends WTextBox implements MeteorWidget
```

## meteordevelopment.meteorclient.gui.themes.meteor.widgets.input.WMeteorTextBox.WMeteorTextBox

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/widgets/input/WMeteorTextBox.java:26`

```java
public WMeteorTextBox(String text, String placeholder, CharFilter filter, Class<? extends Renderer> renderer)
```

## meteordevelopment.meteorclient.gui.themes.meteor.widgets.input.WMeteorTextBox.createCompletionsRootWidget

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/widgets/input/WMeteorTextBox.java:30`

```java
@Override protected WContainer createCompletionsRootWidget()
```

## meteordevelopment.meteorclient.gui.themes.meteor.widgets.input.WMeteorTextBox.createCompletionsValueWidth

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/widgets/input/WMeteorTextBox.java:53`

```java
@SuppressWarnings("unchecked") @Override protected <T extends WWidget & ICompletionItem> T createCompletionsValueWidth(String completion, boolean selected)
```

## meteordevelopment.meteorclient.gui.themes.meteor.widgets.input.WMeteorTextBox.onCursorChanged

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/widgets/input/WMeteorTextBox.java:92`

```java
@Override protected void onCursorChanged()
```

## meteordevelopment.meteorclient.gui.themes.meteor.widgets.input.WMeteorTextBox.onRender

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/widgets/input/WMeteorTextBox.java:99`

```java
@Override protected void onRender(GuiRenderer renderer, double mouseX, double mouseY, double delta)
```

## meteordevelopment.meteorclient.gui.themes.meteor.widgets.pressable.WMeteorButton

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/widgets/pressable/WMeteorButton.java:14`

```java
public class WMeteorButton extends WButton implements MeteorWidget
```

## meteordevelopment.meteorclient.gui.themes.meteor.widgets.pressable.WMeteorButton.WMeteorButton

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/widgets/pressable/WMeteorButton.java:15`

```java
public WMeteorButton(String text, GuiTexture texture)
```

## meteordevelopment.meteorclient.gui.themes.meteor.widgets.pressable.WMeteorButton.onRender

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/widgets/pressable/WMeteorButton.java:19`

```java
@Override protected void onRender(GuiRenderer renderer, double mouseX, double mouseY, double delta)
```

## meteordevelopment.meteorclient.gui.themes.meteor.widgets.pressable.WMeteorCheckbox

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/widgets/pressable/WMeteorCheckbox.java:14`

```java
public class WMeteorCheckbox extends WCheckbox implements MeteorWidget
```

## meteordevelopment.meteorclient.gui.themes.meteor.widgets.pressable.WMeteorCheckbox.WMeteorCheckbox

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/widgets/pressable/WMeteorCheckbox.java:17`

```java
public WMeteorCheckbox(boolean checked)
```

## meteordevelopment.meteorclient.gui.themes.meteor.widgets.pressable.WMeteorCheckbox.onRender

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/widgets/pressable/WMeteorCheckbox.java:22`

```java
@Override protected void onRender(GuiRenderer renderer, double mouseX, double mouseY, double delta)
```

## meteordevelopment.meteorclient.gui.themes.meteor.widgets.pressable.WMeteorConfirmedButton

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/widgets/pressable/WMeteorConfirmedButton.java:15`

```java
public class WMeteorConfirmedButton extends WConfirmedButton implements MeteorWidget
```

## meteordevelopment.meteorclient.gui.themes.meteor.widgets.pressable.WMeteorConfirmedButton.WMeteorConfirmedButton

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/widgets/pressable/WMeteorConfirmedButton.java:16`

```java
public WMeteorConfirmedButton(String text, String confirmText, GuiTexture texture)
```

## meteordevelopment.meteorclient.gui.themes.meteor.widgets.pressable.WMeteorConfirmedButton.onRender

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/widgets/pressable/WMeteorConfirmedButton.java:20`

```java
@Override protected void onRender(GuiRenderer renderer, double mouseX, double mouseY, double delta)
```

## meteordevelopment.meteorclient.gui.themes.meteor.widgets.pressable.WMeteorConfirmedMinus

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/widgets/pressable/WMeteorConfirmedMinus.java:14`

```java
public class WMeteorConfirmedMinus extends WConfirmedMinus implements MeteorWidget
```

## meteordevelopment.meteorclient.gui.themes.meteor.widgets.pressable.WMeteorConfirmedMinus.onRender

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/widgets/pressable/WMeteorConfirmedMinus.java:15`

```java
@Override protected void onRender(GuiRenderer renderer, double mouseX, double mouseY, double delta)
```

## meteordevelopment.meteorclient.gui.themes.meteor.widgets.pressable.WMeteorFavorite

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/widgets/pressable/WMeteorFavorite.java:12`

```java
public class WMeteorFavorite extends WFavorite implements MeteorWidget
```

## meteordevelopment.meteorclient.gui.themes.meteor.widgets.pressable.WMeteorFavorite.WMeteorFavorite

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/widgets/pressable/WMeteorFavorite.java:13`

```java
public WMeteorFavorite(boolean checked)
```

## meteordevelopment.meteorclient.gui.themes.meteor.widgets.pressable.WMeteorFavorite.getColor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/widgets/pressable/WMeteorFavorite.java:17`

```java
@Override protected Color getColor()
```

## meteordevelopment.meteorclient.gui.themes.meteor.widgets.pressable.WMeteorMinus

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/widgets/pressable/WMeteorMinus.java:12`

```java
public class WMeteorMinus extends WMinus implements MeteorWidget
```

## meteordevelopment.meteorclient.gui.themes.meteor.widgets.pressable.WMeteorMinus.onRender

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/widgets/pressable/WMeteorMinus.java:13`

```java
@Override protected void onRender(GuiRenderer renderer, double mouseX, double mouseY, double delta)
```

## meteordevelopment.meteorclient.gui.themes.meteor.widgets.pressable.WMeteorPlus

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/widgets/pressable/WMeteorPlus.java:13`

```java
public class WMeteorPlus extends WPlus implements MeteorWidget
```

## meteordevelopment.meteorclient.gui.themes.meteor.widgets.pressable.WMeteorPlus.onRender

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/widgets/pressable/WMeteorPlus.java:14`

```java
@Override protected void onRender(GuiRenderer renderer, double mouseX, double mouseY, double delta)
```

## meteordevelopment.meteorclient.gui.themes.meteor.widgets.pressable.WMeteorTriangle

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/widgets/pressable/WMeteorTriangle.java:12`

```java
public class WMeteorTriangle extends WTriangle implements MeteorWidget
```

## meteordevelopment.meteorclient.gui.themes.meteor.widgets.pressable.WMeteorTriangle.onRender

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/widgets/pressable/WMeteorTriangle.java:13`

```java
@Override protected void onRender(GuiRenderer renderer, double mouseX, double mouseY, double delta)
```

## meteordevelopment.meteorclient.gui.utils.AlignmentX

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/utils/AlignmentX.java:8`

```java
public enum AlignmentX
```

## meteordevelopment.meteorclient.gui.utils.AlignmentY

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/utils/AlignmentY.java:8`

```java
public enum AlignmentY
```

## meteordevelopment.meteorclient.gui.utils.BaseWidget

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/utils/BaseWidget.java:10`

```java
public interface BaseWidget
```

## meteordevelopment.meteorclient.gui.utils.BaseWidget.getTheme

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/utils/BaseWidget.java:11`

```java
GuiTheme getTheme()
```

## meteordevelopment.meteorclient.gui.utils.Cell

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/utils/Cell.java:11`

```java
public class Cell<T extends WWidget>
```

## meteordevelopment.meteorclient.gui.utils.Cell.x

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/utils/Cell.java:14`

```java
public double x, y
```

## meteordevelopment.meteorclient.gui.utils.Cell.y

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/utils/Cell.java:14`

```java
public double x, y
```

## meteordevelopment.meteorclient.gui.utils.Cell.width

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/utils/Cell.java:15`

```java
public double width, height
```

## meteordevelopment.meteorclient.gui.utils.Cell.height

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/utils/Cell.java:15`

```java
public double width, height
```

## meteordevelopment.meteorclient.gui.utils.Cell.expandCellX

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/utils/Cell.java:26`

```java
public boolean expandCellX
```

## meteordevelopment.meteorclient.gui.utils.Cell.group

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/utils/Cell.java:28`

```java
public @Nullable String group
```

## meteordevelopment.meteorclient.gui.utils.Cell.Cell

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/utils/Cell.java:30`

```java
public Cell(T widget)
```

## meteordevelopment.meteorclient.gui.utils.Cell.widget

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/utils/Cell.java:34`

```java
public T widget()
```

## meteordevelopment.meteorclient.gui.utils.Cell.move

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/utils/Cell.java:38`

```java
public void move(double deltaX, double deltaY)
```

## meteordevelopment.meteorclient.gui.utils.Cell.minWidth

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/utils/Cell.java:45`

```java
public Cell<T> minWidth(double width)
```

## meteordevelopment.meteorclient.gui.utils.Cell.centerX

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/utils/Cell.java:52`

```java
public Cell<T> centerX()
```

## meteordevelopment.meteorclient.gui.utils.Cell.right

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/utils/Cell.java:57`

```java
public Cell<T> right()
```

## meteordevelopment.meteorclient.gui.utils.Cell.centerY

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/utils/Cell.java:62`

```java
public Cell<T> centerY()
```

## meteordevelopment.meteorclient.gui.utils.Cell.bottom

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/utils/Cell.java:67`

```java
public Cell<T> bottom()
```

## meteordevelopment.meteorclient.gui.utils.Cell.center

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/utils/Cell.java:72`

```java
public Cell<T> center()
```

## meteordevelopment.meteorclient.gui.utils.Cell.top

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/utils/Cell.java:78`

```java
public Cell<T> top()
```

## meteordevelopment.meteorclient.gui.utils.Cell.padTop

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/utils/Cell.java:85`

```java
public Cell<T> padTop(double pad)
```

## meteordevelopment.meteorclient.gui.utils.Cell.padRight

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/utils/Cell.java:89`

```java
public Cell<T> padRight(double pad)
```

## meteordevelopment.meteorclient.gui.utils.Cell.padBottom

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/utils/Cell.java:93`

```java
public Cell<T> padBottom(double pad)
```

## meteordevelopment.meteorclient.gui.utils.Cell.padLeft

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/utils/Cell.java:97`

```java
public Cell<T> padLeft(double pad)
```

## meteordevelopment.meteorclient.gui.utils.Cell.padHorizontal

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/utils/Cell.java:102`

```java
public Cell<T> padHorizontal(double pad)
```

## meteordevelopment.meteorclient.gui.utils.Cell.padVertical

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/utils/Cell.java:106`

```java
public Cell<T> padVertical(double pad)
```

## meteordevelopment.meteorclient.gui.utils.Cell.pad

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/utils/Cell.java:110`

```java
public Cell<T> pad(double pad)
```

## meteordevelopment.meteorclient.gui.utils.Cell.padTop

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/utils/Cell.java:115`

```java
public double padTop()
```

## meteordevelopment.meteorclient.gui.utils.Cell.padRight

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/utils/Cell.java:118`

```java
public double padRight()
```

## meteordevelopment.meteorclient.gui.utils.Cell.padBottom

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/utils/Cell.java:121`

```java
public double padBottom()
```

## meteordevelopment.meteorclient.gui.utils.Cell.padLeft

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/utils/Cell.java:124`

```java
public double padLeft()
```

## meteordevelopment.meteorclient.gui.utils.Cell.marginTop

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/utils/Cell.java:130`

```java
public Cell<T> marginTop(double m)
```

## meteordevelopment.meteorclient.gui.utils.Cell.expandWidgetX

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/utils/Cell.java:137`

```java
public Cell<T> expandWidgetX()
```

## meteordevelopment.meteorclient.gui.utils.Cell.expandWidgetY

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/utils/Cell.java:142`

```java
public Cell<T> expandWidgetY()
```

## meteordevelopment.meteorclient.gui.utils.Cell.expandCellX

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/utils/Cell.java:147`

```java
public Cell<T> expandCellX()
```

## meteordevelopment.meteorclient.gui.utils.Cell.expandX

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/utils/Cell.java:152`

```java
public Cell<T> expandX()
```

## meteordevelopment.meteorclient.gui.utils.Cell.group

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/utils/Cell.java:161`

```java
public Cell<T> group(String group)
```

## meteordevelopment.meteorclient.gui.utils.Cell.alignWidget

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/utils/Cell.java:166`

```java
public void alignWidget()
```

## meteordevelopment.meteorclient.gui.utils.CharFilter

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/utils/CharFilter.java:8`

```java
public interface CharFilter
```

## meteordevelopment.meteorclient.gui.utils.CharFilter.filter

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/utils/CharFilter.java:9`

```java
boolean filter(String text, char c)
```

## meteordevelopment.meteorclient.gui.utils.CharFilter.filter

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/utils/CharFilter.java:11`

```java
default boolean filter(String text, int i)
```

## meteordevelopment.meteorclient.gui.utils.SettingsWidgetFactory

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/utils/SettingsWidgetFactory.java:18`

```java
public abstract class SettingsWidgetFactory
```

## meteordevelopment.meteorclient.gui.utils.SettingsWidgetFactory.theme

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/utils/SettingsWidgetFactory.java:21`

```java
protected final GuiTheme theme
```

## meteordevelopment.meteorclient.gui.utils.SettingsWidgetFactory.factories

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/utils/SettingsWidgetFactory.java:22`

```java
protected final Map<Class<?>, Factory> factories = new HashMap<>()
```

## meteordevelopment.meteorclient.gui.utils.SettingsWidgetFactory.SettingsWidgetFactory

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/utils/SettingsWidgetFactory.java:24`

```java
public SettingsWidgetFactory(GuiTheme theme)
```

## meteordevelopment.meteorclient.gui.utils.SettingsWidgetFactory.registerCustomFactory

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/utils/SettingsWidgetFactory.java:29`

```java
public static void registerCustomFactory(Class<?> settingClass, Function<GuiTheme, Factory> factoryFunction)
```

## meteordevelopment.meteorclient.gui.utils.SettingsWidgetFactory.unregisterCustomFactory

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/utils/SettingsWidgetFactory.java:33`

```java
public static void unregisterCustomFactory(Class<?> settingClass)
```

## meteordevelopment.meteorclient.gui.utils.SettingsWidgetFactory.create

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/utils/SettingsWidgetFactory.java:37`

```java
public abstract WWidget create(GuiTheme theme, Settings settings, String filter)
```

## meteordevelopment.meteorclient.gui.utils.SettingsWidgetFactory.getFactory

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/utils/SettingsWidgetFactory.java:39`

```java
protected Factory getFactory(Class<?> settingClass)
```

## meteordevelopment.meteorclient.gui.utils.SettingsWidgetFactory.Factory

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/utils/SettingsWidgetFactory.java:44`

```java
@FunctionalInterface public interface Factory
```

## meteordevelopment.meteorclient.gui.utils.SettingsWidgetFactory.Factory.create

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/utils/SettingsWidgetFactory.java:46`

```java
void create(WTable table, Setting<?> setting)
```

## meteordevelopment.meteorclient.gui.utils.StarscriptTextBoxRenderer

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/utils/StarscriptTextBoxRenderer.java:21`

```java
public class StarscriptTextBoxRenderer implements WTextBox.Renderer
```

## meteordevelopment.meteorclient.gui.utils.StarscriptTextBoxRenderer.render

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/utils/StarscriptTextBoxRenderer.java:29`

```java
@Override public void render(GuiRenderer renderer, double x, double y, String text, Color color)
```

## meteordevelopment.meteorclient.gui.utils.StarscriptTextBoxRenderer.getCompletions

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/utils/StarscriptTextBoxRenderer.java:46`

```java
@Override public List<String> getCompletions(String text, int position)
```

## meteordevelopment.meteorclient.gui.utils.WindowConfig

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/utils/WindowConfig.java:11`

```java
public class WindowConfig implements ISerializable<WindowConfig>
```

## meteordevelopment.meteorclient.gui.utils.WindowConfig.expanded

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/utils/WindowConfig.java:12`

```java
public boolean expanded = true
```

## meteordevelopment.meteorclient.gui.utils.WindowConfig.x

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/utils/WindowConfig.java:13`

```java
public double x = -1
```

## meteordevelopment.meteorclient.gui.utils.WindowConfig.y

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/utils/WindowConfig.java:14`

```java
public double y = -1
```

## meteordevelopment.meteorclient.gui.utils.WindowConfig.toTag

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/utils/WindowConfig.java:18`

```java
@Override public CompoundTag toTag()
```

## meteordevelopment.meteorclient.gui.utils.WindowConfig.fromTag

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/utils/WindowConfig.java:29`

```java
@Override public WindowConfig fromTag(CompoundTag tag)
```

## meteordevelopment.meteorclient.gui.widgets.WAccount

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/WAccount.java:21`

```java
public abstract class WAccount extends WHorizontalList
```

## meteordevelopment.meteorclient.gui.widgets.WAccount.refreshScreenAction

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/WAccount.java:22`

```java
public Runnable refreshScreenAction
```

## meteordevelopment.meteorclient.gui.widgets.WAccount.WAccount

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/WAccount.java:26`

```java
public WAccount(WidgetScreen screen, Account<?> account)
```

## meteordevelopment.meteorclient.gui.widgets.WAccount.loggedInColor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/WAccount.java:31`

```java
protected abstract Color loggedInColor()
```

## meteordevelopment.meteorclient.gui.widgets.WAccount.accountTypeColor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/WAccount.java:33`

```java
protected abstract Color accountTypeColor()
```

## meteordevelopment.meteorclient.gui.widgets.WAccount.init

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/WAccount.java:35`

```java
@Override public void init()
```

## meteordevelopment.meteorclient.gui.widgets.WHorizontalSeparator

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/WHorizontalSeparator.java:8`

```java
public abstract class WHorizontalSeparator extends WWidget
```

## meteordevelopment.meteorclient.gui.widgets.WHorizontalSeparator.text

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/WHorizontalSeparator.java:9`

```java
protected String text
```

## meteordevelopment.meteorclient.gui.widgets.WHorizontalSeparator.textWidth

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/WHorizontalSeparator.java:10`

```java
protected double textWidth
```

## meteordevelopment.meteorclient.gui.widgets.WHorizontalSeparator.WHorizontalSeparator

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/WHorizontalSeparator.java:12`

```java
public WHorizontalSeparator(String text)
```

## meteordevelopment.meteorclient.gui.widgets.WHorizontalSeparator.onCalculateSize

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/WHorizontalSeparator.java:16`

```java
@Override protected void onCalculateSize()
```

## meteordevelopment.meteorclient.gui.widgets.WItem

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/WItem.java:11`

```java
public class WItem extends WWidget
```

## meteordevelopment.meteorclient.gui.widgets.WItem.itemStack

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/WItem.java:12`

```java
protected ItemStack itemStack
```

## meteordevelopment.meteorclient.gui.widgets.WItem.WItem

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/WItem.java:14`

```java
public WItem(ItemStack itemStack)
```

## meteordevelopment.meteorclient.gui.widgets.WItem.onCalculateSize

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/WItem.java:18`

```java
@Override protected void onCalculateSize()
```

## meteordevelopment.meteorclient.gui.widgets.WItem.onRender

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/WItem.java:26`

```java
@Override protected void onRender(GuiRenderer renderer, double mouseX, double mouseY, double delta)
```

## meteordevelopment.meteorclient.gui.widgets.WItem.set

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/WItem.java:36`

```java
public void set(ItemStack itemStack)
```

## meteordevelopment.meteorclient.gui.widgets.WItemWithLabel

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/WItemWithLabel.java:21`

```java
public class WItemWithLabel extends WHorizontalList
```

## meteordevelopment.meteorclient.gui.widgets.WItemWithLabel.WItemWithLabel

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/WItemWithLabel.java:28`

```java
public WItemWithLabel(ItemStack itemStack, String name)
```

## meteordevelopment.meteorclient.gui.widgets.WItemWithLabel.init

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/WItemWithLabel.java:33`

```java
@Override public void init()
```

## meteordevelopment.meteorclient.gui.widgets.WItemWithLabel.set

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/WItemWithLabel.java:60`

```java
public void set(ItemStack itemStack)
```

## meteordevelopment.meteorclient.gui.widgets.WItemWithLabel.getLabelText

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/WItemWithLabel.java:68`

```java
public String getLabelText()
```

## meteordevelopment.meteorclient.gui.widgets.WKeybind

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/WKeybind.java:13`

```java
public class WKeybind extends WHorizontalList
```

## meteordevelopment.meteorclient.gui.widgets.WKeybind.action

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/WKeybind.java:14`

```java
public Runnable action
```

## meteordevelopment.meteorclient.gui.widgets.WKeybind.actionOnSet

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/WKeybind.java:15`

```java
public Runnable actionOnSet
```

## meteordevelopment.meteorclient.gui.widgets.WKeybind.WKeybind

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/WKeybind.java:23`

```java
public WKeybind(Keybind keybind, Keybind defaultValue)
```

## meteordevelopment.meteorclient.gui.widgets.WKeybind.init

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/WKeybind.java:28`

```java
@Override public void init()
```

## meteordevelopment.meteorclient.gui.widgets.WKeybind.onClear

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/WKeybind.java:41`

```java
public boolean onClear()
```

## meteordevelopment.meteorclient.gui.widgets.WKeybind.onAction

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/WKeybind.java:52`

```java
public boolean onAction(boolean isKey, int value, int modifiers)
```

## meteordevelopment.meteorclient.gui.widgets.WKeybind.resetBind

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/WKeybind.java:63`

```java
public void resetBind()
```

## meteordevelopment.meteorclient.gui.widgets.WKeybind.reset

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/WKeybind.java:68`

```java
public void reset()
```

## meteordevelopment.meteorclient.gui.widgets.WLabel

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/WLabel.java:12`

```java
public abstract class WLabel extends WPressable
```

## meteordevelopment.meteorclient.gui.widgets.WLabel.color

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/WLabel.java:13`

```java
public Color color
```

## meteordevelopment.meteorclient.gui.widgets.WLabel.text

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/WLabel.java:15`

```java
protected String text
```

## meteordevelopment.meteorclient.gui.widgets.WLabel.title

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/WLabel.java:16`

```java
protected boolean title
```

## meteordevelopment.meteorclient.gui.widgets.WLabel.WLabel

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/WLabel.java:18`

```java
public WLabel(String text, boolean title)
```

## meteordevelopment.meteorclient.gui.widgets.WLabel.onCalculateSize

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/WLabel.java:23`

```java
@Override protected void onCalculateSize()
```

## meteordevelopment.meteorclient.gui.widgets.WLabel.onMouseClicked

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/WLabel.java:29`

```java
@Override public boolean onMouseClicked(MouseButtonEvent click, boolean doubled)
```

## meteordevelopment.meteorclient.gui.widgets.WLabel.onMouseReleased

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/WLabel.java:35`

```java
@Override public boolean onMouseReleased(MouseButtonEvent click)
```

## meteordevelopment.meteorclient.gui.widgets.WLabel.set

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/WLabel.java:41`

```java
public void set(String text)
```

## meteordevelopment.meteorclient.gui.widgets.WLabel.get

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/WLabel.java:47`

```java
public String get()
```

## meteordevelopment.meteorclient.gui.widgets.WLabel.color

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/WLabel.java:51`

```java
public WLabel color(Color color)
```

## meteordevelopment.meteorclient.gui.widgets.WMultiLabel

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/WMultiLabel.java:11`

```java
public abstract class WMultiLabel extends WLabel
```

## meteordevelopment.meteorclient.gui.widgets.WMultiLabel.lines

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/WMultiLabel.java:12`

```java
protected List<String> lines = new ArrayList<>(2)
```

## meteordevelopment.meteorclient.gui.widgets.WMultiLabel.maxWidth

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/WMultiLabel.java:14`

```java
protected double maxWidth
```

## meteordevelopment.meteorclient.gui.widgets.WMultiLabel.WMultiLabel

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/WMultiLabel.java:16`

```java
public WMultiLabel(String text, boolean title, double maxWidth)
```

## meteordevelopment.meteorclient.gui.widgets.WMultiLabel.onCalculateSize

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/WMultiLabel.java:22`

```java
@Override protected void onCalculateSize()
```

## meteordevelopment.meteorclient.gui.widgets.WMultiLabel.set

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/WMultiLabel.java:85`

```java
@Override public void set(String text)
```

## meteordevelopment.meteorclient.gui.widgets.WQuad

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/WQuad.java:10`

```java
public abstract class WQuad extends WWidget
```

## meteordevelopment.meteorclient.gui.widgets.WQuad.color

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/WQuad.java:11`

```java
public Color color
```

## meteordevelopment.meteorclient.gui.widgets.WQuad.WQuad

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/WQuad.java:13`

```java
public WQuad(Color color)
```

## meteordevelopment.meteorclient.gui.widgets.WQuad.onCalculateSize

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/WQuad.java:17`

```java
@Override protected void onCalculateSize()
```

## meteordevelopment.meteorclient.gui.widgets.WRoot

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/WRoot.java:8`

```java
public interface WRoot
```

## meteordevelopment.meteorclient.gui.widgets.WTexture

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/WTexture.java:11`

```java
public class WTexture extends WWidget
```

## meteordevelopment.meteorclient.gui.widgets.WTexture.WTexture

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/WTexture.java:16`

```java
public WTexture(double width, double height, double rotation, Texture texture)
```

## meteordevelopment.meteorclient.gui.widgets.WTexture.onCalculateSize

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/WTexture.java:23`

```java
@Override protected void onCalculateSize()
```

## meteordevelopment.meteorclient.gui.widgets.WTexture.onRender

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/WTexture.java:29`

```java
@Override protected void onRender(GuiRenderer renderer, double mouseX, double mouseY, double delta)
```

## meteordevelopment.meteorclient.gui.widgets.WTooltip

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/WTooltip.java:11`

```java
public abstract class WTooltip extends WContainer implements WRoot
```

## meteordevelopment.meteorclient.gui.widgets.WTooltip.text

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/WTooltip.java:14`

```java
protected String text
```

## meteordevelopment.meteorclient.gui.widgets.WTooltip.WTooltip

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/WTooltip.java:16`

```java
public WTooltip(String text)
```

## meteordevelopment.meteorclient.gui.widgets.WTooltip.init

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/WTooltip.java:20`

```java
@Override public void init()
```

## meteordevelopment.meteorclient.gui.widgets.WTooltip.invalidate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/WTooltip.java:25`

```java
@Override public void invalidate()
```

## meteordevelopment.meteorclient.gui.widgets.WTooltip.render

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/WTooltip.java:30`

```java
@Override public boolean render(GuiRenderer renderer, double mouseX, double mouseY, double delta)
```

## meteordevelopment.meteorclient.gui.widgets.WTopBar

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/WTopBar.java:20`

```java
public abstract class WTopBar extends WHorizontalList
```

## meteordevelopment.meteorclient.gui.widgets.WTopBar.getButtonColor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/WTopBar.java:21`

```java
protected abstract Color getButtonColor(boolean pressed, boolean hovered)
```

## meteordevelopment.meteorclient.gui.widgets.WTopBar.getNameColor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/WTopBar.java:23`

```java
protected abstract Color getNameColor()
```

## meteordevelopment.meteorclient.gui.widgets.WTopBar.WTopBar

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/WTopBar.java:25`

```java
public WTopBar()
```

## meteordevelopment.meteorclient.gui.widgets.WTopBar.init

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/WTopBar.java:29`

```java
@Override public void init()
```

## meteordevelopment.meteorclient.gui.widgets.WTopBar.WTopBarButton

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/WTopBar.java:36`

```java
protected class WTopBarButton extends WPressable
```

## meteordevelopment.meteorclient.gui.widgets.WTopBar.WTopBarButton.WTopBarButton

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/WTopBar.java:39`

```java
public WTopBarButton(Tab tab)
```

## meteordevelopment.meteorclient.gui.widgets.WTopBar.WTopBarButton.onCalculateSize

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/WTopBar.java:43`

```java
@Override protected void onCalculateSize()
```

## meteordevelopment.meteorclient.gui.widgets.WTopBar.WTopBarButton.onPressed

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/WTopBar.java:51`

```java
@Override protected void onPressed(int button)
```

## meteordevelopment.meteorclient.gui.widgets.WTopBar.WTopBarButton.onRender

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/WTopBar.java:64`

```java
@Override protected void onRender(GuiRenderer renderer, double mouseX, double mouseY, double delta)
```

## meteordevelopment.meteorclient.gui.widgets.WVerticalSeparator

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/WVerticalSeparator.java:8`

```java
public class WVerticalSeparator extends WWidget
```

## meteordevelopment.meteorclient.gui.widgets.WVerticalSeparator.onCalculateSize

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/WVerticalSeparator.java:9`

```java
@Override protected void onCalculateSize()
```

## meteordevelopment.meteorclient.gui.widgets.WWidget

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/WWidget.java:16`

```java
public abstract class WWidget implements BaseWidget
```

## meteordevelopment.meteorclient.gui.widgets.WWidget.visible

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/WWidget.java:17`

```java
public boolean visible = true
```

## meteordevelopment.meteorclient.gui.widgets.WWidget.theme

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/WWidget.java:18`

```java
public GuiTheme theme
```

## meteordevelopment.meteorclient.gui.widgets.WWidget.x

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/WWidget.java:20`

```java
public double x, y
```

## meteordevelopment.meteorclient.gui.widgets.WWidget.y

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/WWidget.java:20`

```java
public double x, y
```

## meteordevelopment.meteorclient.gui.widgets.WWidget.width

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/WWidget.java:21`

```java
public double width, height
```

## meteordevelopment.meteorclient.gui.widgets.WWidget.height

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/WWidget.java:21`

```java
public double width, height
```

## meteordevelopment.meteorclient.gui.widgets.WWidget.minWidth

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/WWidget.java:22`

```java
public double minWidth
```

## meteordevelopment.meteorclient.gui.widgets.WWidget.parent

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/WWidget.java:24`

```java
public WWidget parent
```

## meteordevelopment.meteorclient.gui.widgets.WWidget.tooltip

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/WWidget.java:25`

```java
public String tooltip
```

## meteordevelopment.meteorclient.gui.widgets.WWidget.mouseOver

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/WWidget.java:27`

```java
public boolean mouseOver
```

## meteordevelopment.meteorclient.gui.widgets.WWidget.focused

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/WWidget.java:28`

```java
public boolean focused
```

## meteordevelopment.meteorclient.gui.widgets.WWidget.instantTooltips

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/WWidget.java:29`

```java
protected boolean instantTooltips
```

## meteordevelopment.meteorclient.gui.widgets.WWidget.mouseOverTimer

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/WWidget.java:30`

```java
protected double mouseOverTimer
```

## meteordevelopment.meteorclient.gui.widgets.WWidget.init

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/WWidget.java:32`

```java
public void init()
```

## meteordevelopment.meteorclient.gui.widgets.WWidget.move

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/WWidget.java:35`

```java
public void move(double deltaX, double deltaY)
```

## meteordevelopment.meteorclient.gui.widgets.WWidget.getTheme

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/WWidget.java:40`

```java
@Override public GuiTheme getTheme()
```

## meteordevelopment.meteorclient.gui.widgets.WWidget.pad

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/WWidget.java:45`

```java
public double pad()
```

## meteordevelopment.meteorclient.gui.widgets.WWidget.calculateSize

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/WWidget.java:51`

```java
public void calculateSize()
```

## meteordevelopment.meteorclient.gui.widgets.WWidget.onCalculateSize

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/WWidget.java:61`

```java
protected void onCalculateSize()
```

## meteordevelopment.meteorclient.gui.widgets.WWidget.calculateWidgetPositions

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/WWidget.java:65`

```java
public void calculateWidgetPositions()
```

## meteordevelopment.meteorclient.gui.widgets.WWidget.onCalculateWidgetPositions

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/WWidget.java:72`

```java
protected void onCalculateWidgetPositions()
```

## meteordevelopment.meteorclient.gui.widgets.WWidget.render

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/WWidget.java:78`

```java
public boolean render(GuiRenderer renderer, double mouseX, double mouseY, double delta)
```

## meteordevelopment.meteorclient.gui.widgets.WWidget.onRender

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/WWidget.java:96`

```java
protected void onRender(GuiRenderer renderer, double mouseX, double mouseY, double delta)
```

## meteordevelopment.meteorclient.gui.widgets.WWidget.mouseClicked

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/WWidget.java:101`

```java
public boolean mouseClicked(MouseButtonEvent click, boolean doubled)
```

## meteordevelopment.meteorclient.gui.widgets.WWidget.onMouseClicked

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/WWidget.java:105`

```java
public boolean onMouseClicked(MouseButtonEvent click, boolean doubled)
```

## meteordevelopment.meteorclient.gui.widgets.WWidget.mouseReleased

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/WWidget.java:109`

```java
public boolean mouseReleased(MouseButtonEvent click)
```

## meteordevelopment.meteorclient.gui.widgets.WWidget.onMouseReleased

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/WWidget.java:113`

```java
public boolean onMouseReleased(MouseButtonEvent click)
```

## meteordevelopment.meteorclient.gui.widgets.WWidget.mouseMoved

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/WWidget.java:117`

```java
public void mouseMoved(double mouseX, double mouseY, double lastMouseX, double lastMouseY)
```

## meteordevelopment.meteorclient.gui.widgets.WWidget.onMouseMoved

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/WWidget.java:122`

```java
public void onMouseMoved(double mouseX, double mouseY, double lastMouseX, double lastMouseY)
```

## meteordevelopment.meteorclient.gui.widgets.WWidget.mouseScrolled

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/WWidget.java:125`

```java
public boolean mouseScrolled(double amount)
```

## meteordevelopment.meteorclient.gui.widgets.WWidget.onMouseScrolled

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/WWidget.java:129`

```java
public boolean onMouseScrolled(double amount)
```

## meteordevelopment.meteorclient.gui.widgets.WWidget.keyPressed

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/WWidget.java:133`

```java
public boolean keyPressed(KeyEvent input)
```

## meteordevelopment.meteorclient.gui.widgets.WWidget.onKeyPressed

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/WWidget.java:137`

```java
public boolean onKeyPressed(KeyEvent input)
```

## meteordevelopment.meteorclient.gui.widgets.WWidget.keyRepeated

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/WWidget.java:141`

```java
public boolean keyRepeated(KeyEvent input)
```

## meteordevelopment.meteorclient.gui.widgets.WWidget.onKeyRepeated

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/WWidget.java:145`

```java
public boolean onKeyRepeated(KeyEvent input)
```

## meteordevelopment.meteorclient.gui.widgets.WWidget.charTyped

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/WWidget.java:149`

```java
public boolean charTyped(CharacterEvent input)
```

## meteordevelopment.meteorclient.gui.widgets.WWidget.onCharTyped

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/WWidget.java:153`

```java
public boolean onCharTyped(CharacterEvent input)
```

## meteordevelopment.meteorclient.gui.widgets.WWidget.invalidate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/WWidget.java:159`

```java
public void invalidate()
```

## meteordevelopment.meteorclient.gui.widgets.WWidget.getRoot

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/WWidget.java:164`

```java
protected WWidget getRoot()
```

## meteordevelopment.meteorclient.gui.widgets.WWidget.getView

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/WWidget.java:168`

```java
public WView getView()
```

## meteordevelopment.meteorclient.gui.widgets.WWidget.isOver

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/WWidget.java:173`

```java
public boolean isOver(double x, double y)
```

## meteordevelopment.meteorclient.gui.widgets.WWidget.isFocused

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/WWidget.java:177`

```java
public boolean isFocused()
```

## meteordevelopment.meteorclient.gui.widgets.WWidget.setFocused

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/WWidget.java:181`

```java
public void setFocused(boolean focused)
```

## meteordevelopment.meteorclient.gui.widgets.containers.WContainer

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WContainer.java:23`

```java
public abstract class WContainer extends WWidget
```

## meteordevelopment.meteorclient.gui.widgets.containers.WContainer.cells

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WContainer.java:24`

```java
public final List<Cell<?>> cells = new ArrayList<>()
```

## meteordevelopment.meteorclient.gui.widgets.containers.WContainer.add

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WContainer.java:26`

```java
public <T extends WWidget> Cell<T> add(T widget)
```

## meteordevelopment.meteorclient.gui.widgets.containers.WContainer.clear

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WContainer.java:39`

```java
public void clear()
```

## meteordevelopment.meteorclient.gui.widgets.containers.WContainer.remove

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WContainer.java:46`

```java
public void remove(Cell<?> cell)
```

## meteordevelopment.meteorclient.gui.widgets.containers.WContainer.move

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WContainer.java:50`

```java
@Override public void move(double deltaX, double deltaY)
```

## meteordevelopment.meteorclient.gui.widgets.containers.WContainer.moveCells

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WContainer.java:56`

```java
public void moveCells(double deltaX, double deltaY)
```

## meteordevelopment.meteorclient.gui.widgets.containers.WContainer.isFocused

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WContainer.java:65`

```java
@Override public boolean isFocused()
```

## meteordevelopment.meteorclient.gui.widgets.containers.WContainer.calculateSize

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WContainer.java:79`

```java
@Override public void calculateSize()
```

## meteordevelopment.meteorclient.gui.widgets.containers.WContainer.onCalculateSize

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WContainer.java:85`

```java
@Override protected void onCalculateSize()
```

## meteordevelopment.meteorclient.gui.widgets.containers.WContainer.calculateWidgetPositions

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WContainer.java:96`

```java
@Override public void calculateWidgetPositions()
```

## meteordevelopment.meteorclient.gui.widgets.containers.WContainer.onCalculateWidgetPositions

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WContainer.java:102`

```java
@Override protected void onCalculateWidgetPositions()
```

## meteordevelopment.meteorclient.gui.widgets.containers.WContainer.render

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WContainer.java:117`

```java
@Override public boolean render(GuiRenderer renderer, double mouseX, double mouseY, double delta)
```

## meteordevelopment.meteorclient.gui.widgets.containers.WContainer.renderWidget

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WContainer.java:136`

```java
protected void renderWidget(WWidget widget, GuiRenderer renderer, double mouseX, double mouseY, double delta)
```

## meteordevelopment.meteorclient.gui.widgets.containers.WContainer.propagateEvents

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WContainer.java:153`

```java
protected boolean propagateEvents(WWidget widget)
```

## meteordevelopment.meteorclient.gui.widgets.containers.WContainer.mouseClicked

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WContainer.java:157`

```java
@Override public boolean mouseClicked(MouseButtonEvent click, boolean doubled)
```

## meteordevelopment.meteorclient.gui.widgets.containers.WContainer.mouseReleased

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WContainer.java:169`

```java
@Override public boolean mouseReleased(MouseButtonEvent click)
```

## meteordevelopment.meteorclient.gui.widgets.containers.WContainer.mouseMoved

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WContainer.java:181`

```java
@Override public void mouseMoved(double mouseX, double mouseY, double lastMouseX, double lastMouseY)
```

## meteordevelopment.meteorclient.gui.widgets.containers.WContainer.mouseScrolled

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WContainer.java:193`

```java
@Override public boolean mouseScrolled(double amount)
```

## meteordevelopment.meteorclient.gui.widgets.containers.WContainer.keyPressed

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WContainer.java:205`

```java
@Override public boolean keyPressed(KeyEvent input)
```

## meteordevelopment.meteorclient.gui.widgets.containers.WContainer.keyRepeated

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WContainer.java:217`

```java
@Override public boolean keyRepeated(KeyEvent input)
```

## meteordevelopment.meteorclient.gui.widgets.containers.WContainer.charTyped

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WContainer.java:229`

```java
@Override public boolean charTyped(CharacterEvent input)
```

## meteordevelopment.meteorclient.gui.widgets.containers.WHorizontalList

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WHorizontalList.java:10`

```java
public class WHorizontalList extends WContainer
```

## meteordevelopment.meteorclient.gui.widgets.containers.WHorizontalList.spacing

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WHorizontalList.java:11`

```java
public double spacing = 3
```

## meteordevelopment.meteorclient.gui.widgets.containers.WHorizontalList.calculatedWidth

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WHorizontalList.java:13`

```java
protected double calculatedWidth
```

## meteordevelopment.meteorclient.gui.widgets.containers.WHorizontalList.fillXCount

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WHorizontalList.java:14`

```java
protected int fillXCount
```

## meteordevelopment.meteorclient.gui.widgets.containers.WHorizontalList.spacing

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WHorizontalList.java:16`

```java
protected double spacing()
```

## meteordevelopment.meteorclient.gui.widgets.containers.WHorizontalList.onCalculateSize

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WHorizontalList.java:20`

```java
@Override protected void onCalculateSize()
```

## meteordevelopment.meteorclient.gui.widgets.containers.WHorizontalList.onCalculateWidgetPositions

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WHorizontalList.java:41`

```java
@Override protected void onCalculateWidgetPositions()
```

## meteordevelopment.meteorclient.gui.widgets.containers.WSection

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WSection.java:16`

```java
public abstract class WSection extends WVerticalList
```

## meteordevelopment.meteorclient.gui.widgets.containers.WSection.action

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WSection.java:17`

```java
public Runnable action
```

## meteordevelopment.meteorclient.gui.widgets.containers.WSection.title

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WSection.java:19`

```java
protected String title
```

## meteordevelopment.meteorclient.gui.widgets.containers.WSection.expanded

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WSection.java:21`

```java
protected boolean expanded
```

## meteordevelopment.meteorclient.gui.widgets.containers.WSection.animProgress

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WSection.java:22`

```java
protected double animProgress
```

## meteordevelopment.meteorclient.gui.widgets.containers.WSection.headerWidget

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WSection.java:25`

```java
protected final WWidget headerWidget
```

## meteordevelopment.meteorclient.gui.widgets.containers.WSection.WSection

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WSection.java:31`

```java
public WSection(String title, boolean expanded, WWidget headerWidget)
```

## meteordevelopment.meteorclient.gui.widgets.containers.WSection.init

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WSection.java:39`

```java
@Override public void init()
```

## meteordevelopment.meteorclient.gui.widgets.containers.WSection.add

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WSection.java:47`

```java
@Override public <T extends WWidget> Cell<T> add(T widget)
```

## meteordevelopment.meteorclient.gui.widgets.containers.WSection.createHeader

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WSection.java:52`

```java
protected abstract WHeader createHeader()
```

## meteordevelopment.meteorclient.gui.widgets.containers.WSection.setExpanded

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WSection.java:54`

```java
public void setExpanded(boolean expanded)
```

## meteordevelopment.meteorclient.gui.widgets.containers.WSection.isExpanded

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WSection.java:58`

```java
public boolean isExpanded()
```

## meteordevelopment.meteorclient.gui.widgets.containers.WSection.onCalculateSize

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WSection.java:62`

```java
@Override protected void onCalculateSize()
```

## meteordevelopment.meteorclient.gui.widgets.containers.WSection.render

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WSection.java:84`

```java
@Override public boolean render(GuiRenderer renderer, double mouseX, double mouseY, double delta)
```

## meteordevelopment.meteorclient.gui.widgets.containers.WSection.renderWidget

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WSection.java:106`

```java
@Override protected void renderWidget(WWidget widget, GuiRenderer renderer, double mouseX, double mouseY, double delta)
```

## meteordevelopment.meteorclient.gui.widgets.containers.WSection.propagateEvents

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WSection.java:113`

```java
@Override protected boolean propagateEvents(WWidget widget)
```

## meteordevelopment.meteorclient.gui.widgets.containers.WSection.WHeader

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WSection.java:118`

```java
protected abstract class WHeader extends WHorizontalList
```

## meteordevelopment.meteorclient.gui.widgets.containers.WSection.WHeader.title

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WSection.java:119`

```java
protected String title
```

## meteordevelopment.meteorclient.gui.widgets.containers.WSection.WHeader.WHeader

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WSection.java:121`

```java
public WHeader(String title)
```

## meteordevelopment.meteorclient.gui.widgets.containers.WSection.WHeader.onMouseClicked

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WSection.java:125`

```java
@Override public boolean onMouseClicked(MouseButtonEvent click, boolean doubled)
```

## meteordevelopment.meteorclient.gui.widgets.containers.WSection.WHeader.onClick

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WSection.java:135`

```java
protected void onClick()
```

## meteordevelopment.meteorclient.gui.widgets.containers.WTable

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WTable.java:17`

```java
public class WTable extends WContainer
```

## meteordevelopment.meteorclient.gui.widgets.containers.WTable.horizontalSpacing

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WTable.java:18`

```java
public double horizontalSpacing = 3
```

## meteordevelopment.meteorclient.gui.widgets.containers.WTable.verticalSpacing

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WTable.java:19`

```java
public double verticalSpacing = 3
```

## meteordevelopment.meteorclient.gui.widgets.containers.WTable.add

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WTable.java:30`

```java
@Override public <T extends WWidget> Cell<T> add(T widget)
```

## meteordevelopment.meteorclient.gui.widgets.containers.WTable.row

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WTable.java:43`

```java
public void row()
```

## meteordevelopment.meteorclient.gui.widgets.containers.WTable.rowI

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WTable.java:47`

```java
public int rowI()
```

## meteordevelopment.meteorclient.gui.widgets.containers.WTable.removeRow

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WTable.java:51`

```java
public void removeRow(int i)
```

## meteordevelopment.meteorclient.gui.widgets.containers.WTable.getRow

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WTable.java:64`

```java
public List<Cell<?>> getRow(int i)
```

## meteordevelopment.meteorclient.gui.widgets.containers.WTable.clear

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WTable.java:69`

```java
@Override public void clear()
```

## meteordevelopment.meteorclient.gui.widgets.containers.WTable.horizontalSpacing

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WTable.java:76`

```java
protected double horizontalSpacing()
```

## meteordevelopment.meteorclient.gui.widgets.containers.WTable.verticalSpacing

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WTable.java:80`

```java
protected double verticalSpacing()
```

## meteordevelopment.meteorclient.gui.widgets.containers.WTable.onCalculateSize

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WTable.java:84`

```java
@Override protected void onCalculateSize()
```

## meteordevelopment.meteorclient.gui.widgets.containers.WTable.onCalculateWidgetPositions

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WTable.java:117`

```java
@Override protected void onCalculateWidgetPositions()
```

## meteordevelopment.meteorclient.gui.widgets.containers.WVerticalList

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WVerticalList.java:10`

```java
public class WVerticalList extends WContainer
```

## meteordevelopment.meteorclient.gui.widgets.containers.WVerticalList.spacing

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WVerticalList.java:11`

```java
public double spacing = 3
```

## meteordevelopment.meteorclient.gui.widgets.containers.WVerticalList.widthRemove

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WVerticalList.java:13`

```java
protected double widthRemove
```

## meteordevelopment.meteorclient.gui.widgets.containers.WVerticalList.spacing

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WVerticalList.java:15`

```java
protected double spacing()
```

## meteordevelopment.meteorclient.gui.widgets.containers.WVerticalList.onCalculateSize

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WVerticalList.java:19`

```java
@Override protected void onCalculateSize()
```

## meteordevelopment.meteorclient.gui.widgets.containers.WVerticalList.onCalculateWidgetPositions

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WVerticalList.java:34`

```java
@Override protected void onCalculateWidgetPositions()
```

## meteordevelopment.meteorclient.gui.widgets.containers.WView

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WView.java:16`

```java
public abstract class WView extends WVerticalList
```

## meteordevelopment.meteorclient.gui.widgets.containers.WView.maxHeight

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WView.java:17`

```java
public double maxHeight = Double.MAX_VALUE
```

## meteordevelopment.meteorclient.gui.widgets.containers.WView.scrollOnlyWhenMouseOver

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WView.java:18`

```java
public boolean scrollOnlyWhenMouseOver = true
```

## meteordevelopment.meteorclient.gui.widgets.containers.WView.hasScrollBar

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WView.java:19`

```java
public boolean hasScrollBar = true
```

## meteordevelopment.meteorclient.gui.widgets.containers.WView.canScroll

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WView.java:21`

```java
protected boolean canScroll
```

## meteordevelopment.meteorclient.gui.widgets.containers.WView.handleMouseOver

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WView.java:28`

```java
protected boolean handleMouseOver
```

## meteordevelopment.meteorclient.gui.widgets.containers.WView.init

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WView.java:30`

```java
@Override public void init()
```

## meteordevelopment.meteorclient.gui.widgets.containers.WView.onCalculateSize

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WView.java:35`

```java
@Override protected void onCalculateSize()
```

## meteordevelopment.meteorclient.gui.widgets.containers.WView.onCalculateWidgetPositions

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WView.java:61`

```java
@Override protected void onCalculateWidgetPositions()
```

## meteordevelopment.meteorclient.gui.widgets.containers.WView.onMouseClicked

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WView.java:75`

```java
@Override public boolean onMouseClicked(MouseButtonEvent click, boolean doubled)
```

## meteordevelopment.meteorclient.gui.widgets.containers.WView.onMouseReleased

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WView.java:85`

```java
@Override public boolean onMouseReleased(MouseButtonEvent click)
```

## meteordevelopment.meteorclient.gui.widgets.containers.WView.onMouseMoved

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WView.java:92`

```java
@Override public void onMouseMoved(double mouseX, double mouseY, double lastMouseX, double lastMouseY)
```

## meteordevelopment.meteorclient.gui.widgets.containers.WView.onMouseScrolled

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WView.java:121`

```java
@Override public boolean onMouseScrolled(double amount)
```

## meteordevelopment.meteorclient.gui.widgets.containers.WView.render

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WView.java:136`

```java
@Override public boolean render(GuiRenderer renderer, double mouseX, double mouseY, double delta)
```

## meteordevelopment.meteorclient.gui.widgets.containers.WView.propagateEvents

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WView.java:166`

```java
@Override protected boolean propagateEvents(WWidget widget)
```

## meteordevelopment.meteorclient.gui.widgets.containers.WView.handleWidth

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WView.java:177`

```java
protected double handleWidth()
```

## meteordevelopment.meteorclient.gui.widgets.containers.WView.handleHeight

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WView.java:181`

```java
protected double handleHeight()
```

## meteordevelopment.meteorclient.gui.widgets.containers.WView.handleX

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WView.java:185`

```java
protected double handleX()
```

## meteordevelopment.meteorclient.gui.widgets.containers.WView.handleY

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WView.java:189`

```java
protected double handleY()
```

## meteordevelopment.meteorclient.gui.widgets.containers.WView.isWidgetInView

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WView.java:193`

```java
public boolean isWidgetInView(WWidget widget)
```

## meteordevelopment.meteorclient.gui.widgets.containers.WWindow

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WWindow.java:22`

```java
public abstract class WWindow extends WVerticalList
```

## meteordevelopment.meteorclient.gui.widgets.containers.WWindow.padding

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WWindow.java:23`

```java
public double padding = 8
```

## meteordevelopment.meteorclient.gui.widgets.containers.WWindow.beforeHeaderInit

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WWindow.java:24`

```java
public Consumer<WContainer> beforeHeaderInit
```

## meteordevelopment.meteorclient.gui.widgets.containers.WWindow.id

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WWindow.java:25`

```java
public String id
```

## meteordevelopment.meteorclient.gui.widgets.containers.WWindow.icon

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WWindow.java:27`

```java
public final WWidget icon
```

## meteordevelopment.meteorclient.gui.widgets.containers.WWindow.title

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WWindow.java:28`

```java
protected final String title
```

## meteordevelopment.meteorclient.gui.widgets.containers.WWindow.header

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WWindow.java:30`

```java
protected WHeader header
```

## meteordevelopment.meteorclient.gui.widgets.containers.WWindow.view

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WWindow.java:31`

```java
public WView view
```

## meteordevelopment.meteorclient.gui.widgets.containers.WWindow.dragging

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WWindow.java:33`

```java
protected boolean dragging
```

## meteordevelopment.meteorclient.gui.widgets.containers.WWindow.expanded

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WWindow.java:34`

```java
protected boolean expanded = true
```

## meteordevelopment.meteorclient.gui.widgets.containers.WWindow.dragged

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WWindow.java:35`

```java
protected boolean dragged
```

## meteordevelopment.meteorclient.gui.widgets.containers.WWindow.animProgress

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WWindow.java:37`

```java
protected double animProgress = 1
```

## meteordevelopment.meteorclient.gui.widgets.containers.WWindow.moved

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WWindow.java:39`

```java
protected boolean moved = false
```

## meteordevelopment.meteorclient.gui.widgets.containers.WWindow.movedX

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WWindow.java:40`

```java
protected double movedX, movedY
```

## meteordevelopment.meteorclient.gui.widgets.containers.WWindow.movedY

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WWindow.java:40`

```java
protected double movedX, movedY
```

## meteordevelopment.meteorclient.gui.widgets.containers.WWindow.WWindow

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WWindow.java:44`

```java
public WWindow(WWidget icon, String title)
```

## meteordevelopment.meteorclient.gui.widgets.containers.WWindow.init

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WWindow.java:49`

```java
@Override public void init()
```

## meteordevelopment.meteorclient.gui.widgets.containers.WWindow.header

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WWindow.java:63`

```java
protected abstract WHeader header(WWidget icon)
```

## meteordevelopment.meteorclient.gui.widgets.containers.WWindow.add

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WWindow.java:65`

```java
@Override public <T extends WWidget> Cell<T> add(T widget)
```

## meteordevelopment.meteorclient.gui.widgets.containers.WWindow.clear

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WWindow.java:70`

```java
@Override public void clear()
```

## meteordevelopment.meteorclient.gui.widgets.containers.WWindow.setExpanded

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WWindow.java:75`

```java
public void setExpanded(boolean expanded)
```

## meteordevelopment.meteorclient.gui.widgets.containers.WWindow.onCalculateWidgetPositions

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WWindow.java:84`

```java
@Override protected void onCalculateWidgetPositions()
```

## meteordevelopment.meteorclient.gui.widgets.containers.WWindow.render

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WWindow.java:113`

```java
@Override public boolean render(GuiRenderer renderer, double mouseX, double mouseY, double delta)
```

## meteordevelopment.meteorclient.gui.widgets.containers.WWindow.renderWidget

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WWindow.java:125`

```java
@Override protected void renderWidget(WWidget widget, GuiRenderer renderer, double mouseX, double mouseY, double delta)
```

## meteordevelopment.meteorclient.gui.widgets.containers.WWindow.propagateEvents

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WWindow.java:134`

```java
@Override protected boolean propagateEvents(WWidget widget)
```

## meteordevelopment.meteorclient.gui.widgets.containers.WWindow.WHeader

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WWindow.java:139`

```java
protected abstract class WHeader extends WContainer
```

## meteordevelopment.meteorclient.gui.widgets.containers.WWindow.WHeader.WHeader

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WWindow.java:144`

```java
public WHeader(WWidget icon)
```

## meteordevelopment.meteorclient.gui.widgets.containers.WWindow.WHeader.init

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WWindow.java:148`

```java
@Override public void init()
```

## meteordevelopment.meteorclient.gui.widgets.containers.WWindow.WHeader.add

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WWindow.java:171`

```java
@Override public <T extends WWidget> Cell<T> add(T widget)
```

## meteordevelopment.meteorclient.gui.widgets.containers.WWindow.WHeader.onCalculateSize

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WWindow.java:177`

```java
@Override protected void onCalculateSize()
```

## meteordevelopment.meteorclient.gui.widgets.containers.WWindow.WHeader.onMouseClicked

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WWindow.java:191`

```java
@Override public boolean onMouseClicked(MouseButtonEvent click, boolean doubled)
```

## meteordevelopment.meteorclient.gui.widgets.containers.WWindow.WHeader.onMouseReleased

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WWindow.java:206`

```java
@Override public boolean onMouseReleased(MouseButtonEvent click)
```

## meteordevelopment.meteorclient.gui.widgets.containers.WWindow.WHeader.onMouseMoved

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WWindow.java:217`

```java
@Override public void onMouseMoved(double mouseX, double mouseY, double lastMouseX, double lastMouseY)
```

## meteordevelopment.meteorclient.gui.widgets.containers.WWindow.WHeader.render

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WWindow.java:237`

```java
@Override public boolean render(GuiRenderer renderer, double mouseX, double mouseY, double delta)
```

## meteordevelopment.meteorclient.gui.widgets.input.WBlockPosEdit

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WBlockPosEdit.java:23`

```java
public class WBlockPosEdit extends WHorizontalList
```

## meteordevelopment.meteorclient.gui.widgets.input.WBlockPosEdit.action

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WBlockPosEdit.java:24`

```java
public Runnable action
```

## meteordevelopment.meteorclient.gui.widgets.input.WBlockPosEdit.actionOnRelease

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WBlockPosEdit.java:25`

```java
public Runnable actionOnRelease
```

## meteordevelopment.meteorclient.gui.widgets.input.WBlockPosEdit.WBlockPosEdit

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WBlockPosEdit.java:36`

```java
public WBlockPosEdit(BlockPos value)
```

## meteordevelopment.meteorclient.gui.widgets.input.WBlockPosEdit.init

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WBlockPosEdit.java:40`

```java
@Override public void init()
```

## meteordevelopment.meteorclient.gui.widgets.input.WBlockPosEdit.get

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WBlockPosEdit.java:116`

```java
public BlockPos get()
```

## meteordevelopment.meteorclient.gui.widgets.input.WBlockPosEdit.set

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WBlockPosEdit.java:120`

```java
public void set(BlockPos value)
```

## meteordevelopment.meteorclient.gui.widgets.input.WDoubleEdit

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WDoubleEdit.java:12`

```java
public class WDoubleEdit extends WHorizontalList
```

## meteordevelopment.meteorclient.gui.widgets.input.WDoubleEdit.decimalPlaces

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WDoubleEdit.java:18`

```java
public int decimalPlaces
```

## meteordevelopment.meteorclient.gui.widgets.input.WDoubleEdit.noSlider

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WDoubleEdit.java:19`

```java
public boolean noSlider = false
```

## meteordevelopment.meteorclient.gui.widgets.input.WDoubleEdit.small

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WDoubleEdit.java:20`

```java
public boolean small = false
```

## meteordevelopment.meteorclient.gui.widgets.input.WDoubleEdit.action

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WDoubleEdit.java:22`

```java
public Runnable action
```

## meteordevelopment.meteorclient.gui.widgets.input.WDoubleEdit.actionOnRelease

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WDoubleEdit.java:23`

```java
public Runnable actionOnRelease
```

## meteordevelopment.meteorclient.gui.widgets.input.WDoubleEdit.WDoubleEdit

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WDoubleEdit.java:28`

```java
public WDoubleEdit(double value, double min, double max, double sliderMin, double sliderMax, int decimalPlaces, boolean noSlider)
```

## meteordevelopment.meteorclient.gui.widgets.input.WDoubleEdit.init

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WDoubleEdit.java:39`

```java
@Override public void init()
```

## meteordevelopment.meteorclient.gui.widgets.input.WDoubleEdit.get

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WDoubleEdit.java:132`

```java
public double get()
```

## meteordevelopment.meteorclient.gui.widgets.input.WDoubleEdit.set

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WDoubleEdit.java:136`

```java
public void set(double value)
```

## meteordevelopment.meteorclient.gui.widgets.input.WDropdown

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WDropdown.java:21`

```java
public abstract class WDropdown<T> extends WPressable
```

## meteordevelopment.meteorclient.gui.widgets.input.WDropdown.action

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WDropdown.java:22`

```java
public Runnable action
```

## meteordevelopment.meteorclient.gui.widgets.input.WDropdown.values

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WDropdown.java:24`

```java
protected T[] values
```

## meteordevelopment.meteorclient.gui.widgets.input.WDropdown.value

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WDropdown.java:25`

```java
protected T value
```

## meteordevelopment.meteorclient.gui.widgets.input.WDropdown.maxValueWidth

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WDropdown.java:27`

```java
protected double maxValueWidth
```

## meteordevelopment.meteorclient.gui.widgets.input.WDropdown.root

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WDropdown.java:29`

```java
protected WDropdownRoot root
```

## meteordevelopment.meteorclient.gui.widgets.input.WDropdown.expanded

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WDropdown.java:30`

```java
protected boolean expanded
```

## meteordevelopment.meteorclient.gui.widgets.input.WDropdown.animProgress

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WDropdown.java:31`

```java
protected double animProgress
```

## meteordevelopment.meteorclient.gui.widgets.input.WDropdown.WDropdown

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WDropdown.java:33`

```java
public WDropdown(T[] values, T value)
```

## meteordevelopment.meteorclient.gui.widgets.input.WDropdown.init

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WDropdown.java:39`

```java
@Override public void init()
```

## meteordevelopment.meteorclient.gui.widgets.input.WDropdown.createRootWidget

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WDropdown.java:55`

```java
protected abstract WDropdownRoot createRootWidget()
```

## meteordevelopment.meteorclient.gui.widgets.input.WDropdown.createValueWidget

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WDropdown.java:57`

```java
protected abstract WDropdownValue createValueWidget()
```

## meteordevelopment.meteorclient.gui.widgets.input.WDropdown.onCalculateSize

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WDropdown.java:59`

```java
@Override protected void onCalculateSize()
```

## meteordevelopment.meteorclient.gui.widgets.input.WDropdown.onCalculateWidgetPositions

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WDropdown.java:77`

```java
@Override protected void onCalculateWidgetPositions()
```

## meteordevelopment.meteorclient.gui.widgets.input.WDropdown.onPressed

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WDropdown.java:87`

```java
@Override protected void onPressed(int button)
```

## meteordevelopment.meteorclient.gui.widgets.input.WDropdown.get

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WDropdown.java:94`

```java
public T get()
```

## meteordevelopment.meteorclient.gui.widgets.input.WDropdown.set

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WDropdown.java:98`

```java
public void set(T value)
```

## meteordevelopment.meteorclient.gui.widgets.input.WDropdown.move

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WDropdown.java:102`

```java
@Override public void move(double deltaX, double deltaY)
```

## meteordevelopment.meteorclient.gui.widgets.input.WDropdown.render

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WDropdown.java:109`

```java
@Override public boolean render(GuiRenderer renderer, double mouseX, double mouseY, double delta)
```

## meteordevelopment.meteorclient.gui.widgets.input.WDropdown.onMouseClicked

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WDropdown.java:137`

```java
@Override public boolean onMouseClicked(MouseButtonEvent click, boolean doubled)
```

## meteordevelopment.meteorclient.gui.widgets.input.WDropdown.onMouseReleased

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WDropdown.java:148`

```java
@Override public boolean onMouseReleased(MouseButtonEvent click)
```

## meteordevelopment.meteorclient.gui.widgets.input.WDropdown.onMouseMoved

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WDropdown.java:155`

```java
@Override public void onMouseMoved(double mouseX, double mouseY, double lastMouseX, double lastMouseY)
```

## meteordevelopment.meteorclient.gui.widgets.input.WDropdown.onMouseScrolled

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WDropdown.java:162`

```java
@Override public boolean onMouseScrolled(double amount)
```

## meteordevelopment.meteorclient.gui.widgets.input.WDropdown.onKeyPressed

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WDropdown.java:173`

```java
@Override public boolean onKeyPressed(KeyEvent input)
```

## meteordevelopment.meteorclient.gui.widgets.input.WDropdown.onKeyRepeated

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WDropdown.java:180`

```java
@Override public boolean onKeyRepeated(KeyEvent input)
```

## meteordevelopment.meteorclient.gui.widgets.input.WDropdown.onCharTyped

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WDropdown.java:187`

```java
@Override public boolean onCharTyped(CharacterEvent input)
```

## meteordevelopment.meteorclient.gui.widgets.input.WDropdown.WDropdownRoot

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WDropdown.java:196`

```java
protected abstract static class WDropdownRoot extends WVerticalList implements WRoot
```

## meteordevelopment.meteorclient.gui.widgets.input.WDropdown.WDropdownRoot.invalidate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WDropdown.java:197`

```java
@Override public void invalidate()
```

## meteordevelopment.meteorclient.gui.widgets.input.WDropdown.WDropdownValue

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WDropdown.java:202`

```java
protected abstract class WDropdownValue extends WPressable
```

## meteordevelopment.meteorclient.gui.widgets.input.WDropdown.WDropdownValue.value

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WDropdown.java:203`

```java
protected T value
```

## meteordevelopment.meteorclient.gui.widgets.input.WDropdown.WDropdownValue.onPressed

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WDropdown.java:205`

```java
@Override protected void onPressed(int button)
```

## meteordevelopment.meteorclient.gui.widgets.input.WIntEdit

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WIntEdit.java:10`

```java
public class WIntEdit extends WHorizontalList
```

## meteordevelopment.meteorclient.gui.widgets.input.WIntEdit.min

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WIntEdit.java:13`

```java
public final int min, max
```

## meteordevelopment.meteorclient.gui.widgets.input.WIntEdit.max

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WIntEdit.java:13`

```java
public final int min, max
```

## meteordevelopment.meteorclient.gui.widgets.input.WIntEdit.noSlider

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WIntEdit.java:15`

```java
public boolean noSlider = false
```

## meteordevelopment.meteorclient.gui.widgets.input.WIntEdit.small

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WIntEdit.java:16`

```java
public boolean small = false
```

## meteordevelopment.meteorclient.gui.widgets.input.WIntEdit.action

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WIntEdit.java:18`

```java
public Runnable action
```

## meteordevelopment.meteorclient.gui.widgets.input.WIntEdit.actionOnRelease

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WIntEdit.java:19`

```java
public Runnable actionOnRelease
```

## meteordevelopment.meteorclient.gui.widgets.input.WIntEdit.WIntEdit

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WIntEdit.java:24`

```java
public WIntEdit(int value, int min, int max, int sliderMin, int sliderMax, boolean noSlider)
```

## meteordevelopment.meteorclient.gui.widgets.input.WIntEdit.init

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WIntEdit.java:34`

```java
@Override public void init()
```

## meteordevelopment.meteorclient.gui.widgets.input.WIntEdit.get

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WIntEdit.java:117`

```java
public int get()
```

## meteordevelopment.meteorclient.gui.widgets.input.WIntEdit.set

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WIntEdit.java:121`

```java
public void set(int value)
```

## meteordevelopment.meteorclient.gui.widgets.input.WLongEdit

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WLongEdit.java:10`

```java
public class WLongEdit extends WHorizontalList
```

## meteordevelopment.meteorclient.gui.widgets.input.WLongEdit.min

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WLongEdit.java:13`

```java
public final long min, max
```

## meteordevelopment.meteorclient.gui.widgets.input.WLongEdit.max

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WLongEdit.java:13`

```java
public final long min, max
```

## meteordevelopment.meteorclient.gui.widgets.input.WLongEdit.action

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WLongEdit.java:15`

```java
public Runnable action
```

## meteordevelopment.meteorclient.gui.widgets.input.WLongEdit.actionOnRelease

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WLongEdit.java:16`

```java
public Runnable actionOnRelease
```

## meteordevelopment.meteorclient.gui.widgets.input.WLongEdit.WLongEdit

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WLongEdit.java:20`

```java
public WLongEdit(long value, long min, long max)
```

## meteordevelopment.meteorclient.gui.widgets.input.WLongEdit.init

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WLongEdit.java:26`

```java
@Override public void init()
```

## meteordevelopment.meteorclient.gui.widgets.input.WLongEdit.get

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WLongEdit.java:75`

```java
public long get()
```

## meteordevelopment.meteorclient.gui.widgets.input.WLongEdit.set

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WLongEdit.java:79`

```java
public void set(long value)
```

## meteordevelopment.meteorclient.gui.widgets.input.WSlider

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WSlider.java:12`

```java
public abstract class WSlider extends WWidget
```

## meteordevelopment.meteorclient.gui.widgets.input.WSlider.action

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WSlider.java:13`

```java
public Runnable action
```

## meteordevelopment.meteorclient.gui.widgets.input.WSlider.actionOnRelease

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WSlider.java:14`

```java
public Runnable actionOnRelease
```

## meteordevelopment.meteorclient.gui.widgets.input.WSlider.value

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WSlider.java:16`

```java
protected double value
```

## meteordevelopment.meteorclient.gui.widgets.input.WSlider.min

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WSlider.java:17`

```java
protected double min, max
```

## meteordevelopment.meteorclient.gui.widgets.input.WSlider.max

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WSlider.java:17`

```java
protected double min, max
```

## meteordevelopment.meteorclient.gui.widgets.input.WSlider.scrollHandleX

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WSlider.java:20`

```java
protected double scrollHandleX, scrollHandleY, scrollHandleH
```

## meteordevelopment.meteorclient.gui.widgets.input.WSlider.scrollHandleY

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WSlider.java:20`

```java
protected double scrollHandleX, scrollHandleY, scrollHandleH
```

## meteordevelopment.meteorclient.gui.widgets.input.WSlider.scrollHandleH

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WSlider.java:20`

```java
protected double scrollHandleX, scrollHandleY, scrollHandleH
```

## meteordevelopment.meteorclient.gui.widgets.input.WSlider.scrollHandleMouseOver

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WSlider.java:21`

```java
protected boolean scrollHandleMouseOver
```

## meteordevelopment.meteorclient.gui.widgets.input.WSlider.handleMouseOver

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WSlider.java:23`

```java
protected boolean handleMouseOver
```

## meteordevelopment.meteorclient.gui.widgets.input.WSlider.dragging

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WSlider.java:24`

```java
protected boolean dragging
```

## meteordevelopment.meteorclient.gui.widgets.input.WSlider.valueAtDragStart

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WSlider.java:25`

```java
protected double valueAtDragStart
```

## meteordevelopment.meteorclient.gui.widgets.input.WSlider.WSlider

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WSlider.java:27`

```java
public WSlider(double value, double min, double max)
```

## meteordevelopment.meteorclient.gui.widgets.input.WSlider.handleSize

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WSlider.java:33`

```java
protected double handleSize()
```

## meteordevelopment.meteorclient.gui.widgets.input.WSlider.onCalculateSize

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WSlider.java:37`

```java
@Override protected void onCalculateSize()
```

## meteordevelopment.meteorclient.gui.widgets.input.WSlider.onMouseClicked

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WSlider.java:45`

```java
@Override public boolean onMouseClicked(MouseButtonEvent click, boolean doubled)
```

## meteordevelopment.meteorclient.gui.widgets.input.WSlider.onMouseMoved

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WSlider.java:63`

```java
@Override public void onMouseMoved(double mouseX, double mouseY, double lastMouseX, double lastMouseY)
```

## meteordevelopment.meteorclient.gui.widgets.input.WSlider.onMouseReleased

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WSlider.java:108`

```java
@Override public boolean onMouseReleased(MouseButtonEvent click)
```

## meteordevelopment.meteorclient.gui.widgets.input.WSlider.onMouseScrolled

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WSlider.java:123`

```java
@Override public boolean onMouseScrolled(double amount)
```

## meteordevelopment.meteorclient.gui.widgets.input.WSlider.set

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WSlider.java:149`

```java
public void set(double value)
```

## meteordevelopment.meteorclient.gui.widgets.input.WSlider.get

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WSlider.java:153`

```java
public double get()
```

## meteordevelopment.meteorclient.gui.widgets.input.WSlider.valueWidth

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WSlider.java:157`

```java
protected double valueWidth()
```

## meteordevelopment.meteorclient.gui.widgets.input.WTextBox

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WTextBox.java:30`

```java
public abstract class WTextBox extends WWidget
```

## meteordevelopment.meteorclient.gui.widgets.input.WTextBox.action

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WTextBox.java:33`

```java
public Runnable action
```

## meteordevelopment.meteorclient.gui.widgets.input.WTextBox.actionOnUnfocused

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WTextBox.java:34`

```java
public Runnable actionOnUnfocused
```

## meteordevelopment.meteorclient.gui.widgets.input.WTextBox.text

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WTextBox.java:36`

```java
protected String text
```

## meteordevelopment.meteorclient.gui.widgets.input.WTextBox.placeholder

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WTextBox.java:37`

```java
protected String placeholder
```

## meteordevelopment.meteorclient.gui.widgets.input.WTextBox.filter

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WTextBox.java:38`

```java
protected CharFilter filter
```

## meteordevelopment.meteorclient.gui.widgets.input.WTextBox.renderer

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WTextBox.java:40`

```java
protected final Renderer renderer
```

## meteordevelopment.meteorclient.gui.widgets.input.WTextBox.textWidths

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WTextBox.java:42`

```java
protected DoubleList textWidths = new DoubleArrayList()
```

## meteordevelopment.meteorclient.gui.widgets.input.WTextBox.cursor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WTextBox.java:44`

```java
protected int cursor
```

## meteordevelopment.meteorclient.gui.widgets.input.WTextBox.textStart

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WTextBox.java:45`

```java
protected double textStart
```

## meteordevelopment.meteorclient.gui.widgets.input.WTextBox.selecting

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WTextBox.java:47`

```java
protected boolean selecting, doubleClick
```

## meteordevelopment.meteorclient.gui.widgets.input.WTextBox.doubleClick

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WTextBox.java:47`

```java
protected boolean selecting, doubleClick
```

## meteordevelopment.meteorclient.gui.widgets.input.WTextBox.selectionStart

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WTextBox.java:48`

```java
protected int selectionStart, selectionEnd
```

## meteordevelopment.meteorclient.gui.widgets.input.WTextBox.selectionEnd

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WTextBox.java:48`

```java
protected int selectionStart, selectionEnd
```

## meteordevelopment.meteorclient.gui.widgets.input.WTextBox.WTextBox

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WTextBox.java:55`

```java
public WTextBox(String text, CharFilter filter, Class<? extends Renderer> renderer)
```

## meteordevelopment.meteorclient.gui.widgets.input.WTextBox.WTextBox

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WTextBox.java:59`

```java
public WTextBox(String text, String placeholder, CharFilter filter, Class<? extends Renderer> renderer)
```

## meteordevelopment.meteorclient.gui.widgets.input.WTextBox.createCompletionsRootWidget

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WTextBox.java:72`

```java
protected abstract WContainer createCompletionsRootWidget()
```

## meteordevelopment.meteorclient.gui.widgets.input.WTextBox.createCompletionsValueWidth

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WTextBox.java:74`

```java
protected abstract <T extends WWidget & ICompletionItem> T createCompletionsValueWidth(String completion, boolean selected)
```

## meteordevelopment.meteorclient.gui.widgets.input.WTextBox.onCalculateSize

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WTextBox.java:76`

```java
@Override protected void onCalculateSize()
```

## meteordevelopment.meteorclient.gui.widgets.input.WTextBox.calculateWidgetPositions

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WTextBox.java:89`

```java
@Override public void calculateWidgetPositions()
```

## meteordevelopment.meteorclient.gui.widgets.input.WTextBox.move

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WTextBox.java:100`

```java
@Override public void move(double deltaX, double deltaY)
```

## meteordevelopment.meteorclient.gui.widgets.input.WTextBox.maxTextWidth

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WTextBox.java:106`

```java
protected double maxTextWidth()
```

## meteordevelopment.meteorclient.gui.widgets.input.WTextBox.onMouseClicked

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WTextBox.java:110`

```java
@Override public boolean onMouseClicked(MouseButtonEvent click, boolean doubled)
```

## meteordevelopment.meteorclient.gui.widgets.input.WTextBox.onMouseMoved

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WTextBox.java:166`

```java
@Override public void onMouseMoved(double mouseX, double mouseY, double lastMouseX, double lastMouseY)
```

## meteordevelopment.meteorclient.gui.widgets.input.WTextBox.onMouseReleased

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WTextBox.java:225`

```java
@Override public boolean onMouseReleased(MouseButtonEvent click)
```

## meteordevelopment.meteorclient.gui.widgets.input.WTextBox.onKeyPressed

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WTextBox.java:239`

```java
@Override public boolean onKeyPressed(KeyEvent input)
```

## meteordevelopment.meteorclient.gui.widgets.input.WTextBox.onKeyRepeated

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WTextBox.java:304`

```java
@Override public boolean onKeyRepeated(KeyEvent input)
```

## meteordevelopment.meteorclient.gui.widgets.input.WTextBox.onCharTyped

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WTextBox.java:558`

```java
@Override public boolean onCharTyped(CharacterEvent input)
```

## meteordevelopment.meteorclient.gui.widgets.input.WTextBox.render

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WTextBox.java:577`

```java
@Override public boolean render(GuiRenderer renderer, double mouseX, double mouseY, double delta)
```

## meteordevelopment.meteorclient.gui.widgets.input.WTextBox.onCursorChanged

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WTextBox.java:675`

```java
protected void onCursorChanged()
```

## meteordevelopment.meteorclient.gui.widgets.input.WTextBox.getTextWidth

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WTextBox.java:697`

```java
protected double getTextWidth(int pos)
```

## meteordevelopment.meteorclient.gui.widgets.input.WTextBox.getCursorTextWidth

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WTextBox.java:706`

```java
protected double getCursorTextWidth(int offset)
```

## meteordevelopment.meteorclient.gui.widgets.input.WTextBox.getOverflowWidthForRender

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WTextBox.java:710`

```java
protected double getOverflowWidthForRender()
```

## meteordevelopment.meteorclient.gui.widgets.input.WTextBox.get

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WTextBox.java:714`

```java
public String get()
```

## meteordevelopment.meteorclient.gui.widgets.input.WTextBox.set

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WTextBox.java:718`

```java
public void set(String text)
```

## meteordevelopment.meteorclient.gui.widgets.input.WTextBox.setFocused

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WTextBox.java:729`

```java
@Override public void setFocused(boolean focused)
```

## meteordevelopment.meteorclient.gui.widgets.input.WTextBox.setCursorMax

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WTextBox.java:742`

```java
public void setCursorMax()
```

## meteordevelopment.meteorclient.gui.widgets.input.WTextBox.Renderer

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WTextBox.java:746`

```java
public interface Renderer
```

## meteordevelopment.meteorclient.gui.widgets.input.WTextBox.Renderer.render

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WTextBox.java:747`

```java
void render(GuiRenderer renderer, double x, double y, String text, Color color)
```

## meteordevelopment.meteorclient.gui.widgets.input.WTextBox.Renderer.getCompletions

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WTextBox.java:749`

```java
default List<String> getCompletions(String text, int position)
```

## meteordevelopment.meteorclient.gui.widgets.input.WTextBox.ICompletionItem

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WTextBox.java:754`

```java
public interface ICompletionItem
```

## meteordevelopment.meteorclient.gui.widgets.input.WTextBox.ICompletionItem.isSelected

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WTextBox.java:755`

```java
boolean isSelected()
```

## meteordevelopment.meteorclient.gui.widgets.input.WTextBox.ICompletionItem.setSelected

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WTextBox.java:757`

```java
void setSelected(boolean selected)
```

## meteordevelopment.meteorclient.gui.widgets.input.WTextBox.ICompletionItem.getCompletion

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WTextBox.java:759`

```java
String getCompletion()
```

## meteordevelopment.meteorclient.gui.widgets.pressable.WButton

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/pressable/WButton.java:10`

```java
public abstract class WButton extends WPressable
```

## meteordevelopment.meteorclient.gui.widgets.pressable.WButton.text

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/pressable/WButton.java:11`

```java
protected String text
```

## meteordevelopment.meteorclient.gui.widgets.pressable.WButton.textWidth

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/pressable/WButton.java:12`

```java
protected double textWidth
```

## meteordevelopment.meteorclient.gui.widgets.pressable.WButton.texture

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/pressable/WButton.java:14`

```java
protected GuiTexture texture
```

## meteordevelopment.meteorclient.gui.widgets.pressable.WButton.WButton

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/pressable/WButton.java:16`

```java
public WButton(String text, GuiTexture texture)
```

## meteordevelopment.meteorclient.gui.widgets.pressable.WButton.onCalculateSize

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/pressable/WButton.java:23`

```java
@Override protected void onCalculateSize()
```

## meteordevelopment.meteorclient.gui.widgets.pressable.WButton.set

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/pressable/WButton.java:43`

```java
public void set(String text)
```

## meteordevelopment.meteorclient.gui.widgets.pressable.WButton.getText

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/pressable/WButton.java:49`

```java
public String getText()
```

## meteordevelopment.meteorclient.gui.widgets.pressable.WCheckbox

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/pressable/WCheckbox.java:8`

```java
public abstract class WCheckbox extends WPressable
```

## meteordevelopment.meteorclient.gui.widgets.pressable.WCheckbox.checked

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/pressable/WCheckbox.java:9`

```java
public boolean checked
```

## meteordevelopment.meteorclient.gui.widgets.pressable.WCheckbox.WCheckbox

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/pressable/WCheckbox.java:11`

```java
public WCheckbox(boolean checked)
```

## meteordevelopment.meteorclient.gui.widgets.pressable.WCheckbox.onCalculateSize

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/pressable/WCheckbox.java:15`

```java
@Override protected void onCalculateSize()
```

## meteordevelopment.meteorclient.gui.widgets.pressable.WCheckbox.onPressed

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/pressable/WCheckbox.java:24`

```java
@Override protected void onPressed(int button)
```

## meteordevelopment.meteorclient.gui.widgets.pressable.WConfirmedButton

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/pressable/WConfirmedButton.java:11`

```java
public abstract class WConfirmedButton extends WButton
```

## meteordevelopment.meteorclient.gui.widgets.pressable.WConfirmedButton.pressedOnce

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/pressable/WConfirmedButton.java:13`

```java
protected boolean pressedOnce = false
```

## meteordevelopment.meteorclient.gui.widgets.pressable.WConfirmedButton.confirmText

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/pressable/WConfirmedButton.java:14`

```java
protected String confirmText
```

## meteordevelopment.meteorclient.gui.widgets.pressable.WConfirmedButton.WConfirmedButton

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/pressable/WConfirmedButton.java:16`

```java
public WConfirmedButton(String text, String confirmText, GuiTexture texture)
```

## meteordevelopment.meteorclient.gui.widgets.pressable.WConfirmedButton.onMouseClicked

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/pressable/WConfirmedButton.java:21`

```java
@Override public boolean onMouseClicked(MouseButtonEvent click, boolean doubled)
```

## meteordevelopment.meteorclient.gui.widgets.pressable.WConfirmedButton.onMouseReleased

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/pressable/WConfirmedButton.java:31`

```java
@Override public boolean onMouseReleased(MouseButtonEvent click)
```

## meteordevelopment.meteorclient.gui.widgets.pressable.WConfirmedButton.getText

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/pressable/WConfirmedButton.java:39`

```java
@Override public String getText()
```

## meteordevelopment.meteorclient.gui.widgets.pressable.WConfirmedButton.set

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/pressable/WConfirmedButton.java:44`

```java
public void set(String text, String confirmText)
```

## meteordevelopment.meteorclient.gui.widgets.pressable.WConfirmedMinus

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/pressable/WConfirmedMinus.java:10`

```java
public class WConfirmedMinus extends WMinus
```

## meteordevelopment.meteorclient.gui.widgets.pressable.WConfirmedMinus.pressedOnce

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/pressable/WConfirmedMinus.java:11`

```java
protected boolean pressedOnce = false
```

## meteordevelopment.meteorclient.gui.widgets.pressable.WConfirmedMinus.onMouseClicked

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/pressable/WConfirmedMinus.java:13`

```java
@Override public boolean onMouseClicked(MouseButtonEvent click, boolean doubled)
```

## meteordevelopment.meteorclient.gui.widgets.pressable.WConfirmedMinus.onMouseReleased

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/pressable/WConfirmedMinus.java:22`

```java
@Override public boolean onMouseReleased(MouseButtonEvent click)
```

## meteordevelopment.meteorclient.gui.widgets.pressable.WFavorite

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/pressable/WFavorite.java:11`

```java
public abstract class WFavorite extends WPressable
```

## meteordevelopment.meteorclient.gui.widgets.pressable.WFavorite.checked

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/pressable/WFavorite.java:12`

```java
public boolean checked
```

## meteordevelopment.meteorclient.gui.widgets.pressable.WFavorite.WFavorite

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/pressable/WFavorite.java:14`

```java
public WFavorite(boolean checked)
```

## meteordevelopment.meteorclient.gui.widgets.pressable.WFavorite.onCalculateSize

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/pressable/WFavorite.java:18`

```java
@Override protected void onCalculateSize()
```

## meteordevelopment.meteorclient.gui.widgets.pressable.WFavorite.onPressed

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/pressable/WFavorite.java:27`

```java
@Override protected void onPressed(int button)
```

## meteordevelopment.meteorclient.gui.widgets.pressable.WFavorite.onRender

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/pressable/WFavorite.java:32`

```java
@Override protected void onRender(GuiRenderer renderer, double mouseX, double mouseY, double delta)
```

## meteordevelopment.meteorclient.gui.widgets.pressable.WFavorite.getColor

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/pressable/WFavorite.java:40`

```java
protected abstract Color getColor()
```

## meteordevelopment.meteorclient.gui.widgets.pressable.WMinus

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/pressable/WMinus.java:8`

```java
public abstract class WMinus extends WPressable
```

## meteordevelopment.meteorclient.gui.widgets.pressable.WMinus.onCalculateSize

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/pressable/WMinus.java:9`

```java
@Override protected void onCalculateSize()
```

## meteordevelopment.meteorclient.gui.widgets.pressable.WPlus

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/pressable/WPlus.java:8`

```java
public abstract class WPlus extends WPressable
```

## meteordevelopment.meteorclient.gui.widgets.pressable.WPlus.onCalculateSize

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/pressable/WPlus.java:9`

```java
@Override protected void onCalculateSize()
```

## meteordevelopment.meteorclient.gui.widgets.pressable.WPressable

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/pressable/WPressable.java:14`

```java
public abstract class WPressable extends WWidget
```

## meteordevelopment.meteorclient.gui.widgets.pressable.WPressable.action

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/pressable/WPressable.java:15`

```java
public Runnable action
```

## meteordevelopment.meteorclient.gui.widgets.pressable.WPressable.pressed

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/pressable/WPressable.java:17`

```java
protected boolean pressed
```

## meteordevelopment.meteorclient.gui.widgets.pressable.WPressable.onMouseClicked

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/pressable/WPressable.java:19`

```java
@Override public boolean onMouseClicked(MouseButtonEvent click, boolean doubled)
```

## meteordevelopment.meteorclient.gui.widgets.pressable.WPressable.onMouseReleased

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/pressable/WPressable.java:26`

```java
@Override public boolean onMouseReleased(MouseButtonEvent click)
```

## meteordevelopment.meteorclient.gui.widgets.pressable.WPressable.onPressed

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/pressable/WPressable.java:38`

```java
protected void onPressed(int button)
```

## meteordevelopment.meteorclient.gui.widgets.pressable.WTriangle

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/pressable/WTriangle.java:8`

```java
public abstract class WTriangle extends WPressable
```

## meteordevelopment.meteorclient.gui.widgets.pressable.WTriangle.rotation

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/pressable/WTriangle.java:9`

```java
public double rotation
```

## meteordevelopment.meteorclient.gui.widgets.pressable.WTriangle.onCalculateSize

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/gui/widgets/pressable/WTriangle.java:11`

```java
@Override protected void onCalculateSize()
```
