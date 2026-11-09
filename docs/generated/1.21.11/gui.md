# gui

Khai báo Java có cú pháp public/protected. Không bao gồm API kế thừa/tổng hợp bởi compiler; xem kiểm tra bytecode riêng.

## meteordevelopment.meteorclient.gui.DefaultSettingsWidgetFactory

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/DefaultSettingsWidgetFactory.java:39`

```java
public class DefaultSettingsWidgetFactory extends SettingsWidgetFactory
```

## meteordevelopment.meteorclient.gui.DefaultSettingsWidgetFactory.DefaultSettingsWidgetFactory

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/DefaultSettingsWidgetFactory.java:42`

```java
public DefaultSettingsWidgetFactory(GuiTheme theme)
```

## meteordevelopment.meteorclient.gui.DefaultSettingsWidgetFactory.create

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/DefaultSettingsWidgetFactory.java:78`

```java
@Override public WWidget create(GuiTheme theme, Settings settings, String filter)
```

## meteordevelopment.meteorclient.gui.DefaultSettingsWidgetFactory.settingTitleTopMargin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/DefaultSettingsWidgetFactory.java:102`

```java
protected double settingTitleTopMargin()
```

## meteordevelopment.meteorclient.gui.GuiKeyEvents

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/GuiKeyEvents.java:8`

```java
public class GuiKeyEvents
```

## meteordevelopment.meteorclient.gui.GuiKeyEvents.canUseKeys

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/GuiKeyEvents.java:9`

```java
public static boolean canUseKeys = true
```

## meteordevelopment.meteorclient.gui.GuiTheme

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:39`

```java
public abstract class GuiTheme implements ISerializable<GuiTheme>
```

## meteordevelopment.meteorclient.gui.GuiTheme.TITLE_TEXT_SCALE

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:40`

```java
public static final double TITLE_TEXT_SCALE = 1.25
```

## meteordevelopment.meteorclient.gui.GuiTheme.name

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:42`

```java
public final String name
```

## meteordevelopment.meteorclient.gui.GuiTheme.settings

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:43`

```java
public final Settings settings = new Settings()
```

## meteordevelopment.meteorclient.gui.GuiTheme.disableHoverColor

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:45`

```java
public boolean disableHoverColor
```

## meteordevelopment.meteorclient.gui.GuiTheme.settingsFactory

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:47`

```java
protected SettingsWidgetFactory settingsFactory
```

## meteordevelopment.meteorclient.gui.GuiTheme.windowConfigs

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:49`

```java
protected final Map<String, WindowConfig> windowConfigs = new HashMap<>()
```

## meteordevelopment.meteorclient.gui.GuiTheme.GuiTheme

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:51`

```java
public GuiTheme(String name)
```

## meteordevelopment.meteorclient.gui.GuiTheme.beforeRender

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:55`

```java
public void beforeRender()
```

## meteordevelopment.meteorclient.gui.GuiTheme.window

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:61`

```java
public abstract WWindow window(WWidget icon, String title)
```

## meteordevelopment.meteorclient.gui.GuiTheme.window

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:62`

```java
public WWindow window(String title)
```

## meteordevelopment.meteorclient.gui.GuiTheme.label

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:66`

```java
public abstract WLabel label(String text, boolean title, double maxWidth)
```

## meteordevelopment.meteorclient.gui.GuiTheme.label

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:67`

```java
public WLabel label(String text, boolean title)
```

## meteordevelopment.meteorclient.gui.GuiTheme.label

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:70`

```java
public WLabel label(String text, double maxWidth)
```

## meteordevelopment.meteorclient.gui.GuiTheme.label

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:73`

```java
public WLabel label(String text)
```

## meteordevelopment.meteorclient.gui.GuiTheme.horizontalSeparator

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:77`

```java
public abstract WHorizontalSeparator horizontalSeparator(String text)
```

## meteordevelopment.meteorclient.gui.GuiTheme.horizontalSeparator

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:78`

```java
public WHorizontalSeparator horizontalSeparator()
```

## meteordevelopment.meteorclient.gui.GuiTheme.verticalSeparator

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:81`

```java
public abstract WVerticalSeparator verticalSeparator()
```

## meteordevelopment.meteorclient.gui.GuiTheme.button

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:83`

```java
protected abstract WButton button(String text, GuiTexture texture)
```

## meteordevelopment.meteorclient.gui.GuiTheme.button

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:84`

```java
public WButton button(String text)
```

## meteordevelopment.meteorclient.gui.GuiTheme.button

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:87`

```java
public WButton button(GuiTexture texture)
```

## meteordevelopment.meteorclient.gui.GuiTheme.confirmedButton

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:91`

```java
protected abstract WConfirmedButton confirmedButton(String text, String confirmText, GuiTexture texture)
```

## meteordevelopment.meteorclient.gui.GuiTheme.confirmedButton

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:92`

```java
public WConfirmedButton confirmedButton(String text, String confirmText)
```

## meteordevelopment.meteorclient.gui.GuiTheme.confirmedButton

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:95`

```java
public WConfirmedButton confirmedButton(GuiTexture texture)
```

## meteordevelopment.meteorclient.gui.GuiTheme.minus

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:99`

```java
public abstract WMinus minus()
```

## meteordevelopment.meteorclient.gui.GuiTheme.confirmedMinus

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:100`

```java
public abstract WConfirmedMinus confirmedMinus()
```

## meteordevelopment.meteorclient.gui.GuiTheme.plus

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:101`

```java
public abstract WPlus plus()
```

## meteordevelopment.meteorclient.gui.GuiTheme.checkbox

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:103`

```java
public abstract WCheckbox checkbox(boolean checked)
```

## meteordevelopment.meteorclient.gui.GuiTheme.slider

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:105`

```java
public abstract WSlider slider(double value, double min, double max)
```

## meteordevelopment.meteorclient.gui.GuiTheme.textBox

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:107`

```java
public abstract WTextBox textBox(String text, String placeholder, CharFilter filter, Class<? extends WTextBox.Renderer> renderer)
```

## meteordevelopment.meteorclient.gui.GuiTheme.textBox

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:108`

```java
public WTextBox textBox(String text, CharFilter filter, Class<? extends WTextBox.Renderer> renderer)
```

## meteordevelopment.meteorclient.gui.GuiTheme.textBox

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:111`

```java
public WTextBox textBox(String text, String placeholder, CharFilter filter)
```

## meteordevelopment.meteorclient.gui.GuiTheme.textBox

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:114`

```java
public WTextBox textBox(String text, CharFilter filter)
```

## meteordevelopment.meteorclient.gui.GuiTheme.textBox

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:117`

```java
public WTextBox textBox(String text, String placeholder)
```

## meteordevelopment.meteorclient.gui.GuiTheme.textBox

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:120`

```java
public WTextBox textBox(String text)
```

## meteordevelopment.meteorclient.gui.GuiTheme.dropdown

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:124`

```java
public abstract <T> WDropdown<T> dropdown(T[] values, T value)
```

## meteordevelopment.meteorclient.gui.GuiTheme.dropdown

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:125`

```java
@SuppressWarnings("unchecked") public <T extends Enum<?>> WDropdown<T> dropdown(T value)
```

## meteordevelopment.meteorclient.gui.GuiTheme.triangle

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:132`

```java
public abstract WTriangle triangle()
```

## meteordevelopment.meteorclient.gui.GuiTheme.tooltip

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:134`

```java
public abstract WTooltip tooltip(String text)
```

## meteordevelopment.meteorclient.gui.GuiTheme.view

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:136`

```java
public abstract WView view()
```

## meteordevelopment.meteorclient.gui.GuiTheme.verticalList

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:138`

```java
public WVerticalList verticalList()
```

## meteordevelopment.meteorclient.gui.GuiTheme.horizontalList

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:141`

```java
public WHorizontalList horizontalList()
```

## meteordevelopment.meteorclient.gui.GuiTheme.table

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:144`

```java
public WTable table()
```

## meteordevelopment.meteorclient.gui.GuiTheme.section

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:148`

```java
public abstract WSection section(String title, boolean expanded, WWidget headerWidget)
```

## meteordevelopment.meteorclient.gui.GuiTheme.section

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:149`

```java
public WSection section(String title, boolean expanded)
```

## meteordevelopment.meteorclient.gui.GuiTheme.section

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:152`

```java
public WSection section(String title)
```

## meteordevelopment.meteorclient.gui.GuiTheme.account

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:156`

```java
public abstract WAccount account(WidgetScreen screen, Account<?> account)
```

## meteordevelopment.meteorclient.gui.GuiTheme.module

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:158`

```java
public WWidget module(Module module)
```

## meteordevelopment.meteorclient.gui.GuiTheme.module

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:161`

```java
public abstract WWidget module(Module module, String title)
```

## meteordevelopment.meteorclient.gui.GuiTheme.quad

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:163`

```java
public abstract WQuad quad(Color color)
```

## meteordevelopment.meteorclient.gui.GuiTheme.topBar

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:165`

```java
public abstract WTopBar topBar()
```

## meteordevelopment.meteorclient.gui.GuiTheme.favorite

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:167`

```java
public abstract WFavorite favorite(boolean checked)
```

## meteordevelopment.meteorclient.gui.GuiTheme.item

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:169`

```java
public WItem item(ItemStack itemStack)
```

## meteordevelopment.meteorclient.gui.GuiTheme.itemWithLabel

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:172`

```java
public WItemWithLabel itemWithLabel(ItemStack stack, String name)
```

## meteordevelopment.meteorclient.gui.GuiTheme.itemWithLabel

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:175`

```java
public WItemWithLabel itemWithLabel(ItemStack stack)
```

## meteordevelopment.meteorclient.gui.GuiTheme.texture

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:179`

```java
public WTexture texture(double width, double height, double rotation, Texture texture)
```

## meteordevelopment.meteorclient.gui.GuiTheme.intEdit

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:183`

```java
public WIntEdit intEdit(int value, int min, int max, int sliderMin, int sliderMax, boolean noSlider)
```

## meteordevelopment.meteorclient.gui.GuiTheme.intEdit

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:186`

```java
public WIntEdit intEdit(int value, int min, int max, int sliderMin, int sliderMax)
```

## meteordevelopment.meteorclient.gui.GuiTheme.intEdit

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:189`

```java
public WIntEdit intEdit(int value, int min, int max, boolean noSlider)
```

## meteordevelopment.meteorclient.gui.GuiTheme.doubleEdit

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:193`

```java
public WDoubleEdit doubleEdit(double value, double min, double max, double sliderMin, double sliderMax, int decimalPlaces, boolean noSlider)
```

## meteordevelopment.meteorclient.gui.GuiTheme.doubleEdit

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:196`

```java
public WDoubleEdit doubleEdit(double value, double min, double max, double sliderMin, double sliderMax)
```

## meteordevelopment.meteorclient.gui.GuiTheme.doubleEdit

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:199`

```java
public WDoubleEdit doubleEdit(double value, double min, double max)
```

## meteordevelopment.meteorclient.gui.GuiTheme.blockPosEdit

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:203`

```java
public WBlockPosEdit blockPosEdit(BlockPos value)
```

## meteordevelopment.meteorclient.gui.GuiTheme.keybind

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:207`

```java
public WKeybind keybind(Keybind keybind)
```

## meteordevelopment.meteorclient.gui.GuiTheme.keybind

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:211`

```java
public WKeybind keybind(Keybind keybind, Keybind defaultValue)
```

## meteordevelopment.meteorclient.gui.GuiTheme.settings

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:215`

```java
public WWidget settings(Settings settings, String filter)
```

## meteordevelopment.meteorclient.gui.GuiTheme.settings

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:218`

```java
public WWidget settings(Settings settings)
```

## meteordevelopment.meteorclient.gui.GuiTheme.modulesScreen

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:224`

```java
public TabScreen modulesScreen()
```

## meteordevelopment.meteorclient.gui.GuiTheme.isModulesScreen

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:227`

```java
public boolean isModulesScreen(Screen screen)
```

## meteordevelopment.meteorclient.gui.GuiTheme.moduleScreen

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:231`

```java
public WidgetScreen moduleScreen(Module module)
```

## meteordevelopment.meteorclient.gui.GuiTheme.accountsScreen

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:235`

```java
public WidgetScreen accountsScreen()
```

## meteordevelopment.meteorclient.gui.GuiTheme.notebotSongs

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:239`

```java
public NotebotSongsScreen notebotSongs()
```

## meteordevelopment.meteorclient.gui.GuiTheme.proxiesScreen

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:243`

```java
public WidgetScreen proxiesScreen()
```

## meteordevelopment.meteorclient.gui.GuiTheme.textColor

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:249`

```java
public abstract Color textColor()
```

## meteordevelopment.meteorclient.gui.GuiTheme.textSecondaryColor

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:251`

```java
public abstract Color textSecondaryColor()
```

## meteordevelopment.meteorclient.gui.GuiTheme.starscriptTextColor

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:255`

```java
public abstract Color starscriptTextColor()
```

## meteordevelopment.meteorclient.gui.GuiTheme.starscriptBraceColor

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:257`

```java
public abstract Color starscriptBraceColor()
```

## meteordevelopment.meteorclient.gui.GuiTheme.starscriptParenthesisColor

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:259`

```java
public abstract Color starscriptParenthesisColor()
```

## meteordevelopment.meteorclient.gui.GuiTheme.starscriptDotColor

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:261`

```java
public abstract Color starscriptDotColor()
```

## meteordevelopment.meteorclient.gui.GuiTheme.starscriptCommaColor

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:263`

```java
public abstract Color starscriptCommaColor()
```

## meteordevelopment.meteorclient.gui.GuiTheme.starscriptOperatorColor

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:265`

```java
public abstract Color starscriptOperatorColor()
```

## meteordevelopment.meteorclient.gui.GuiTheme.starscriptStringColor

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:267`

```java
public abstract Color starscriptStringColor()
```

## meteordevelopment.meteorclient.gui.GuiTheme.starscriptNumberColor

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:269`

```java
public abstract Color starscriptNumberColor()
```

## meteordevelopment.meteorclient.gui.GuiTheme.starscriptKeywordColor

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:271`

```java
public abstract Color starscriptKeywordColor()
```

## meteordevelopment.meteorclient.gui.GuiTheme.starscriptAccessedObjectColor

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:273`

```java
public abstract Color starscriptAccessedObjectColor()
```

## meteordevelopment.meteorclient.gui.GuiTheme.textRenderer

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:277`

```java
public abstract TextRenderer textRenderer()
```

## meteordevelopment.meteorclient.gui.GuiTheme.scale

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:279`

```java
public abstract double scale(double value)
```

## meteordevelopment.meteorclient.gui.GuiTheme.categoryIcons

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:281`

```java
public abstract boolean categoryIcons()
```

## meteordevelopment.meteorclient.gui.GuiTheme.hideHUD

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:283`

```java
public abstract boolean hideHUD()
```

## meteordevelopment.meteorclient.gui.GuiTheme.textWidth

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:285`

```java
public double textWidth(String text, int length, boolean title)
```

## meteordevelopment.meteorclient.gui.GuiTheme.textWidth

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:288`

```java
public double textWidth(String text)
```

## meteordevelopment.meteorclient.gui.GuiTheme.textHeight

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:292`

```java
public double textHeight(boolean title)
```

## meteordevelopment.meteorclient.gui.GuiTheme.textHeight

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:295`

```java
public double textHeight()
```

## meteordevelopment.meteorclient.gui.GuiTheme.pad

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:299`

```java
public double pad()
```

## meteordevelopment.meteorclient.gui.GuiTheme.getWindowConfig

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:303`

```java
public WindowConfig getWindowConfig(String id)
```

## meteordevelopment.meteorclient.gui.GuiTheme.clearWindowConfigs

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:312`

```java
public void clearWindowConfigs()
```

## meteordevelopment.meteorclient.gui.GuiTheme.w

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:316`

```java
protected <T extends WWidget> T w(T widget)
```

## meteordevelopment.meteorclient.gui.GuiTheme.toTag

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:323`

```java
@Override public NbtCompound toTag()
```

## meteordevelopment.meteorclient.gui.GuiTheme.fromTag

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/GuiTheme.java:339`

```java
@Override public GuiTheme fromTag(NbtCompound tag)
```

## meteordevelopment.meteorclient.gui.GuiThemes

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/GuiThemes.java:21`

```java
public class GuiThemes
```

## meteordevelopment.meteorclient.gui.GuiThemes.init

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/GuiThemes.java:32`

```java
@PreInit public static void init()
```

## meteordevelopment.meteorclient.gui.GuiThemes.postInit

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/GuiThemes.java:37`

```java
@PostInit public static void postInit()
```

## meteordevelopment.meteorclient.gui.GuiThemes.add

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/GuiThemes.java:52`

```java
public static void add(GuiTheme theme)
```

## meteordevelopment.meteorclient.gui.GuiThemes.select

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/GuiThemes.java:66`

```java
public static void select(String name)
```

## meteordevelopment.meteorclient.gui.GuiThemes.get

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/GuiThemes.java:101`

```java
public static GuiTheme get()
```

## meteordevelopment.meteorclient.gui.GuiThemes.getNames

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/GuiThemes.java:105`

```java
public static String[] getNames()
```

## meteordevelopment.meteorclient.gui.GuiThemes.save

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/GuiThemes.java:142`

```java
public static void save()
```

## meteordevelopment.meteorclient.gui.WidgetScreen

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/WidgetScreen.java:40`

```java
public abstract class WidgetScreen extends Screen
```

## meteordevelopment.meteorclient.gui.WidgetScreen.taskAfterRender

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/WidgetScreen.java:44`

```java
public Runnable taskAfterRender
```

## meteordevelopment.meteorclient.gui.WidgetScreen.enterAction

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/WidgetScreen.java:45`

```java
protected Runnable enterAction
```

## meteordevelopment.meteorclient.gui.WidgetScreen.parent

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/WidgetScreen.java:47`

```java
public Screen parent
```

## meteordevelopment.meteorclient.gui.WidgetScreen.theme

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/WidgetScreen.java:50`

```java
protected final GuiTheme theme
```

## meteordevelopment.meteorclient.gui.WidgetScreen.locked

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/WidgetScreen.java:52`

```java
public boolean locked, lockedAllowClose
```

## meteordevelopment.meteorclient.gui.WidgetScreen.lockedAllowClose

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/WidgetScreen.java:52`

```java
public boolean locked, lockedAllowClose
```

## meteordevelopment.meteorclient.gui.WidgetScreen.animProgress

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/WidgetScreen.java:61`

```java
public double animProgress
```

## meteordevelopment.meteorclient.gui.WidgetScreen.firstInit

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/WidgetScreen.java:65`

```java
protected boolean firstInit = true
```

## meteordevelopment.meteorclient.gui.WidgetScreen.WidgetScreen

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/WidgetScreen.java:67`

```java
public WidgetScreen(GuiTheme theme, String title)
```

## meteordevelopment.meteorclient.gui.WidgetScreen.add

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/WidgetScreen.java:85`

```java
public <W extends WWidget> Cell<W> add(W widget)
```

## meteordevelopment.meteorclient.gui.WidgetScreen.clear

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/WidgetScreen.java:89`

```java
public void clear()
```

## meteordevelopment.meteorclient.gui.WidgetScreen.invalidate

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/WidgetScreen.java:93`

```java
public void invalidate()
```

## meteordevelopment.meteorclient.gui.WidgetScreen.init

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/WidgetScreen.java:97`

```java
@Override protected void init()
```

## meteordevelopment.meteorclient.gui.WidgetScreen.initWidgets

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/WidgetScreen.java:109`

```java
public abstract void initWidgets()
```

## meteordevelopment.meteorclient.gui.WidgetScreen.reload

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/WidgetScreen.java:111`

```java
public void reload()
```

## meteordevelopment.meteorclient.gui.WidgetScreen.onClosed

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/WidgetScreen.java:116`

```java
public void onClosed(Runnable action)
```

## meteordevelopment.meteorclient.gui.WidgetScreen.mouseClicked

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/WidgetScreen.java:121`

```java
@Override public boolean mouseClicked(Click click, boolean doubled)
```

## meteordevelopment.meteorclient.gui.WidgetScreen.mouseReleased

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/WidgetScreen.java:135`

```java
@Override public boolean mouseReleased(Click click)
```

## meteordevelopment.meteorclient.gui.WidgetScreen.mouseMoved

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/WidgetScreen.java:151`

```java
@Override public void mouseMoved(double mouseX, double mouseY)
```

## meteordevelopment.meteorclient.gui.WidgetScreen.mouseScrolled

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/WidgetScreen.java:165`

```java
@Override public boolean mouseScrolled(double mouseX, double mouseY, double horizontalAmount, double verticalAmount)
```

## meteordevelopment.meteorclient.gui.WidgetScreen.keyReleased

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/WidgetScreen.java:174`

```java
@Override public boolean keyReleased(KeyInput input)
```

## meteordevelopment.meteorclient.gui.WidgetScreen.keyPressed

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/WidgetScreen.java:191`

```java
@Override public boolean keyPressed(KeyInput input)
```

## meteordevelopment.meteorclient.gui.WidgetScreen.keyRepeated

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/WidgetScreen.java:236`

```java
public void keyRepeated(KeyInput input)
```

## meteordevelopment.meteorclient.gui.WidgetScreen.charTyped

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/WidgetScreen.java:242`

```java
@Override public boolean charTyped(CharInput input)
```

## meteordevelopment.meteorclient.gui.WidgetScreen.renderBackground

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/WidgetScreen.java:249`

```java
@Override public void renderBackground(DrawContext context, int mouseX, int mouseY, float deltaTicks)
```

## meteordevelopment.meteorclient.gui.WidgetScreen.renderCustom

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/WidgetScreen.java:256`

```java
public void renderCustom(DrawContext context, int mouseX, int mouseY, float delta)
```

## meteordevelopment.meteorclient.gui.WidgetScreen.runAfterRenderTasks

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/WidgetScreen.java:296`

```java
protected void runAfterRenderTasks()
```

## meteordevelopment.meteorclient.gui.WidgetScreen.onRenderBefore

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/WidgetScreen.java:303`

```java
protected void onRenderBefore(DrawContext drawContext, float delta)
```

## meteordevelopment.meteorclient.gui.WidgetScreen.resize

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/WidgetScreen.java:305`

```java
@Override public void resize(int width, int height)
```

## meteordevelopment.meteorclient.gui.WidgetScreen.close

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/WidgetScreen.java:311`

```java
@Override public void close()
```

## meteordevelopment.meteorclient.gui.WidgetScreen.removed

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/WidgetScreen.java:318`

```java
@Override public void removed()
```

## meteordevelopment.meteorclient.gui.WidgetScreen.onClosed

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/WidgetScreen.java:364`

```java
protected void onClosed()
```

## meteordevelopment.meteorclient.gui.WidgetScreen.toClipboard

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/WidgetScreen.java:366`

```java
public boolean toClipboard()
```

## meteordevelopment.meteorclient.gui.WidgetScreen.fromClipboard

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/WidgetScreen.java:370`

```java
public boolean fromClipboard()
```

## meteordevelopment.meteorclient.gui.WidgetScreen.shouldCloseOnEsc

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/WidgetScreen.java:374`

```java
@Override public boolean shouldCloseOnEsc()
```

## meteordevelopment.meteorclient.gui.WidgetScreen.shouldPause

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/WidgetScreen.java:379`

```java
@Override public boolean shouldPause()
```

## meteordevelopment.meteorclient.gui.WindowScreen

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/WindowScreen.java:12`

```java
public abstract class WindowScreen extends WidgetScreen
```

## meteordevelopment.meteorclient.gui.WindowScreen.window

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/WindowScreen.java:13`

```java
protected final WWindow window
```

## meteordevelopment.meteorclient.gui.WindowScreen.WindowScreen

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/WindowScreen.java:15`

```java
public WindowScreen(GuiTheme theme, WWidget icon, String title)
```

## meteordevelopment.meteorclient.gui.WindowScreen.WindowScreen

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/WindowScreen.java:22`

```java
public WindowScreen(GuiTheme theme, String title)
```

## meteordevelopment.meteorclient.gui.WindowScreen.add

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/WindowScreen.java:26`

```java
@Override public <W extends WWidget> Cell<W> add(W widget)
```

## meteordevelopment.meteorclient.gui.WindowScreen.clear

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/WindowScreen.java:31`

```java
@Override public void clear()
```

## meteordevelopment.meteorclient.gui.renderer.GuiDebugRenderer

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/renderer/GuiDebugRenderer.java:19`

```java
public class GuiDebugRenderer
```

## meteordevelopment.meteorclient.gui.renderer.GuiDebugRenderer.render

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/renderer/GuiDebugRenderer.java:25`

```java
public void render(WWidget widget)
```

## meteordevelopment.meteorclient.gui.renderer.GuiDebugRenderer.mouseReleased

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/renderer/GuiDebugRenderer.java:39`

```java
public void mouseReleased(WWidget widget, Click click, int i)
```

## meteordevelopment.meteorclient.gui.renderer.GuiRenderOperation

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/renderer/GuiRenderOperation.java:11`

```java
public abstract class GuiRenderOperation<T extends GuiRenderOperation<T>>
```

## meteordevelopment.meteorclient.gui.renderer.GuiRenderOperation.x

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/renderer/GuiRenderOperation.java:12`

```java
protected double x, y
```

## meteordevelopment.meteorclient.gui.renderer.GuiRenderOperation.y

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/renderer/GuiRenderOperation.java:12`

```java
protected double x, y
```

## meteordevelopment.meteorclient.gui.renderer.GuiRenderOperation.color

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/renderer/GuiRenderOperation.java:13`

```java
protected Color color
```

## meteordevelopment.meteorclient.gui.renderer.GuiRenderOperation.set

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/renderer/GuiRenderOperation.java:15`

```java
public void set(double x, double y, Color color)
```

## meteordevelopment.meteorclient.gui.renderer.GuiRenderOperation.run

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/renderer/GuiRenderOperation.java:21`

```java
@SuppressWarnings("unchecked") public void run(Pool<T> pool)
```

## meteordevelopment.meteorclient.gui.renderer.GuiRenderOperation.onRun

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/renderer/GuiRenderOperation.java:27`

```java
protected abstract void onRun()
```

## meteordevelopment.meteorclient.gui.renderer.GuiRenderer

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/renderer/GuiRenderer.java:33`

```java
public class GuiRenderer
```

## meteordevelopment.meteorclient.gui.renderer.GuiRenderer.CIRCLE

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/renderer/GuiRenderer.java:39`

```java
public static GuiTexture CIRCLE
```

## meteordevelopment.meteorclient.gui.renderer.GuiRenderer.TRIANGLE

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/renderer/GuiRenderer.java:40`

```java
public static GuiTexture TRIANGLE
```

## meteordevelopment.meteorclient.gui.renderer.GuiRenderer.EDIT

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/renderer/GuiRenderer.java:41`

```java
public static GuiTexture EDIT
```

## meteordevelopment.meteorclient.gui.renderer.GuiRenderer.RESET

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/renderer/GuiRenderer.java:42`

```java
public static GuiTexture RESET
```

## meteordevelopment.meteorclient.gui.renderer.GuiRenderer.FAVORITE_NO

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/renderer/GuiRenderer.java:43`

```java
public static GuiTexture FAVORITE_NO, FAVORITE_YES
```

## meteordevelopment.meteorclient.gui.renderer.GuiRenderer.FAVORITE_YES

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/renderer/GuiRenderer.java:43`

```java
public static GuiTexture FAVORITE_NO, FAVORITE_YES
```

## meteordevelopment.meteorclient.gui.renderer.GuiRenderer.COPY

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/renderer/GuiRenderer.java:44`

```java
public static GuiTexture COPY, PASTE
```

## meteordevelopment.meteorclient.gui.renderer.GuiRenderer.PASTE

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/renderer/GuiRenderer.java:44`

```java
public static GuiTexture COPY, PASTE
```

## meteordevelopment.meteorclient.gui.renderer.GuiRenderer.theme

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/renderer/GuiRenderer.java:46`

```java
public GuiTheme theme
```

## meteordevelopment.meteorclient.gui.renderer.GuiRenderer.tooltip

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/renderer/GuiRenderer.java:59`

```java
public String tooltip, lastTooltip
```

## meteordevelopment.meteorclient.gui.renderer.GuiRenderer.lastTooltip

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/renderer/GuiRenderer.java:59`

```java
public String tooltip, lastTooltip
```

## meteordevelopment.meteorclient.gui.renderer.GuiRenderer.tooltipWidget

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/renderer/GuiRenderer.java:60`

```java
public WWidget tooltipWidget
```

## meteordevelopment.meteorclient.gui.renderer.GuiRenderer.addTexture

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/renderer/GuiRenderer.java:65`

```java
public static GuiTexture addTexture(Identifier id)
```

## meteordevelopment.meteorclient.gui.renderer.GuiRenderer.init

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/renderer/GuiRenderer.java:69`

```java
@PostInit public static void init()
```

## meteordevelopment.meteorclient.gui.renderer.GuiRenderer.begin

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/renderer/GuiRenderer.java:84`

```java
public void begin(DrawContext drawContext)
```

## meteordevelopment.meteorclient.gui.renderer.GuiRenderer.end

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/renderer/GuiRenderer.java:95`

```java
public void end()
```

## meteordevelopment.meteorclient.gui.renderer.GuiRenderer.beginRender

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/renderer/GuiRenderer.java:105`

```java
public void beginRender()
```

## meteordevelopment.meteorclient.gui.renderer.GuiRenderer.endRender

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/renderer/GuiRenderer.java:110`

```java
public void endRender()
```

## meteordevelopment.meteorclient.gui.renderer.GuiRenderer.endRender

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/renderer/GuiRenderer.java:114`

```java
public void endRender(Scissor scissor)
```

## meteordevelopment.meteorclient.gui.renderer.GuiRenderer.scissorStart

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/renderer/GuiRenderer.java:142`

```java
public void scissorStart(double x, double y, double width, double height)
```

## meteordevelopment.meteorclient.gui.renderer.GuiRenderer.scissorEnd

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/renderer/GuiRenderer.java:161`

```java
public void scissorEnd()
```

## meteordevelopment.meteorclient.gui.renderer.GuiRenderer.renderTooltip

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/renderer/GuiRenderer.java:176`

```java
public boolean renderTooltip(DrawContext drawContext, double mouseX, double mouseY, double delta)
```

## meteordevelopment.meteorclient.gui.renderer.GuiRenderer.setAlpha

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/renderer/GuiRenderer.java:212`

```java
public void setAlpha(double a)
```

## meteordevelopment.meteorclient.gui.renderer.GuiRenderer.tooltip

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/renderer/GuiRenderer.java:219`

```java
public void tooltip(String text)
```

## meteordevelopment.meteorclient.gui.renderer.GuiRenderer.quad

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/renderer/GuiRenderer.java:223`

```java
public void quad(double x, double y, double width, double height, Color cTopLeft, Color cTopRight, Color cBottomRight, Color cBottomLeft)
```

## meteordevelopment.meteorclient.gui.renderer.GuiRenderer.quad

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/renderer/GuiRenderer.java:226`

```java
public void quad(double x, double y, double width, double height, Color colorLeft, Color colorRight)
```

## meteordevelopment.meteorclient.gui.renderer.GuiRenderer.quad

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/renderer/GuiRenderer.java:229`

```java
public void quad(double x, double y, double width, double height, Color color)
```

## meteordevelopment.meteorclient.gui.renderer.GuiRenderer.quad

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/renderer/GuiRenderer.java:232`

```java
public void quad(WWidget widget, Color color)
```

## meteordevelopment.meteorclient.gui.renderer.GuiRenderer.quad

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/renderer/GuiRenderer.java:235`

```java
public void quad(double x, double y, double width, double height, GuiTexture texture, Color color)
```

## meteordevelopment.meteorclient.gui.renderer.GuiRenderer.rotatedQuad

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/renderer/GuiRenderer.java:239`

```java
public void rotatedQuad(double x, double y, double width, double height, double rotation, GuiTexture texture, Color color)
```

## meteordevelopment.meteorclient.gui.renderer.GuiRenderer.triangle

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/renderer/GuiRenderer.java:243`

```java
public void triangle(double x1, double y1, double x2, double y2, double x3, double y3, Color color)
```

## meteordevelopment.meteorclient.gui.renderer.GuiRenderer.text

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/renderer/GuiRenderer.java:247`

```java
public void text(String text, double x, double y, Color color, boolean title)
```

## meteordevelopment.meteorclient.gui.renderer.GuiRenderer.texture

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/renderer/GuiRenderer.java:251`

```java
public void texture(double x, double y, double width, double height, double rotation, Texture texture)
```

## meteordevelopment.meteorclient.gui.renderer.GuiRenderer.post

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/renderer/GuiRenderer.java:261`

```java
public void post(Runnable task)
```

## meteordevelopment.meteorclient.gui.renderer.GuiRenderer.item

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/renderer/GuiRenderer.java:265`

```java
public void item(ItemStack itemStack, int x, int y, float scale, boolean overlay)
```

## meteordevelopment.meteorclient.gui.renderer.GuiRenderer.absolutePost

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/renderer/GuiRenderer.java:269`

```java
public void absolutePost(Runnable task)
```

## meteordevelopment.meteorclient.gui.renderer.Scissor

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/renderer/Scissor.java:16`

```java
public class Scissor
```

## meteordevelopment.meteorclient.gui.renderer.Scissor.x

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/renderer/Scissor.java:17`

```java
public int x, y
```

## meteordevelopment.meteorclient.gui.renderer.Scissor.y

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/renderer/Scissor.java:17`

```java
public int x, y
```

## meteordevelopment.meteorclient.gui.renderer.Scissor.width

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/renderer/Scissor.java:18`

```java
public int width, height
```

## meteordevelopment.meteorclient.gui.renderer.Scissor.height

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/renderer/Scissor.java:18`

```java
public int width, height
```

## meteordevelopment.meteorclient.gui.renderer.Scissor.postTasks

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/renderer/Scissor.java:20`

```java
public final List<Runnable> postTasks = new ArrayList<>()
```

## meteordevelopment.meteorclient.gui.renderer.Scissor.set

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/renderer/Scissor.java:22`

```java
public Scissor set(double x, double y, double width, double height)
```

## meteordevelopment.meteorclient.gui.renderer.Scissor.push

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/renderer/Scissor.java:36`

```java
public void push()
```

## meteordevelopment.meteorclient.gui.renderer.Scissor.pop

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/renderer/Scissor.java:40`

```java
public void pop()
```

## meteordevelopment.meteorclient.gui.renderer.operations.TextOperation

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/renderer/operations/TextOperation.java:11`

```java
public class TextOperation extends GuiRenderOperation<TextOperation>
```

## meteordevelopment.meteorclient.gui.renderer.operations.TextOperation.title

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/renderer/operations/TextOperation.java:15`

```java
public boolean title
```

## meteordevelopment.meteorclient.gui.renderer.operations.TextOperation.set

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/renderer/operations/TextOperation.java:17`

```java
public TextOperation set(String text, TextRenderer renderer, boolean title)
```

## meteordevelopment.meteorclient.gui.renderer.operations.TextOperation.onRun

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/renderer/operations/TextOperation.java:25`

```java
@Override protected void onRun()
```

## meteordevelopment.meteorclient.gui.renderer.packer.GuiTexture

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/renderer/packer/GuiTexture.java:11`

```java
public class GuiTexture
```

## meteordevelopment.meteorclient.gui.renderer.packer.GuiTexture.get

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/renderer/packer/GuiTexture.java:18`

```java
public TextureRegion get(double width, double height)
```

## meteordevelopment.meteorclient.gui.renderer.packer.TexturePacker

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/renderer/packer/TexturePacker.java:29`

```java
public class TexturePacker
```

## meteordevelopment.meteorclient.gui.renderer.packer.TexturePacker.add

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/renderer/packer/TexturePacker.java:34`

```java
public GuiTexture add(Identifier id)
```

## meteordevelopment.meteorclient.gui.renderer.packer.TexturePacker.pack

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/renderer/packer/TexturePacker.java:91`

```java
public Texture pack()
```

## meteordevelopment.meteorclient.gui.renderer.packer.TextureRegion

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/renderer/packer/TextureRegion.java:8`

```java
public class TextureRegion
```

## meteordevelopment.meteorclient.gui.renderer.packer.TextureRegion.x1

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/renderer/packer/TextureRegion.java:9`

```java
public double x1, y1
```

## meteordevelopment.meteorclient.gui.renderer.packer.TextureRegion.y1

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/renderer/packer/TextureRegion.java:9`

```java
public double x1, y1
```

## meteordevelopment.meteorclient.gui.renderer.packer.TextureRegion.x2

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/renderer/packer/TextureRegion.java:10`

```java
public double x2, y2
```

## meteordevelopment.meteorclient.gui.renderer.packer.TextureRegion.y2

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/renderer/packer/TextureRegion.java:10`

```java
public double x2, y2
```

## meteordevelopment.meteorclient.gui.renderer.packer.TextureRegion.diagonal

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/renderer/packer/TextureRegion.java:12`

```java
public double diagonal
```

## meteordevelopment.meteorclient.gui.renderer.packer.TextureRegion.TextureRegion

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/renderer/packer/TextureRegion.java:14`

```java
public TextureRegion(double width, double height)
```

## meteordevelopment.meteorclient.gui.screens.CommitsScreen

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/CommitsScreen.java:22`

```java
public class CommitsScreen extends WindowScreen
```

## meteordevelopment.meteorclient.gui.screens.CommitsScreen.CommitsScreen

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/CommitsScreen.java:27`

```java
public CommitsScreen(GuiTheme theme, MeteorAddon addon)
```

## meteordevelopment.meteorclient.gui.screens.CommitsScreen.initWidgets

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/CommitsScreen.java:58`

```java
@Override public void initWidgets()
```

## meteordevelopment.meteorclient.gui.screens.ContainerInventoryScreen

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/ContainerInventoryScreen.java:34`

```java
public class ContainerInventoryScreen extends Screen
```

## meteordevelopment.meteorclient.gui.screens.ContainerInventoryScreen.ContainerInventoryScreen

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/ContainerInventoryScreen.java:47`

```java
public ContainerInventoryScreen(ItemStack containerItem)
```

## meteordevelopment.meteorclient.gui.screens.ContainerInventoryScreen.init

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/ContainerInventoryScreen.java:66`

```java
@Override protected void init()
```

## meteordevelopment.meteorclient.gui.screens.ContainerInventoryScreen.render

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/ContainerInventoryScreen.java:73`

```java
@Override public void render(DrawContext context, int mouseX, int mouseY, float delta)
```

## meteordevelopment.meteorclient.gui.screens.ContainerInventoryScreen.mouseClicked

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/ContainerInventoryScreen.java:130`

```java
@Override public boolean mouseClicked(Click click, boolean doubled)
```

## meteordevelopment.meteorclient.gui.screens.ContainerInventoryScreen.keyPressed

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/ContainerInventoryScreen.java:142`

```java
@Override public boolean keyPressed(KeyInput input)
```

## meteordevelopment.meteorclient.gui.screens.EditBookTitleAndAuthorScreen

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/EditBookTitleAndAuthorScreen.java:26`

```java
public class EditBookTitleAndAuthorScreen extends WindowScreen
```

## meteordevelopment.meteorclient.gui.screens.EditBookTitleAndAuthorScreen.EditBookTitleAndAuthorScreen

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/EditBookTitleAndAuthorScreen.java:30`

```java
public EditBookTitleAndAuthorScreen(GuiTheme theme, ItemStack itemStack, Hand hand)
```

## meteordevelopment.meteorclient.gui.screens.EditBookTitleAndAuthorScreen.initWidgets

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/EditBookTitleAndAuthorScreen.java:36`

```java
@Override public void initWidgets()
```

## meteordevelopment.meteorclient.gui.screens.EditSystemScreen

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/EditSystemScreen.java:9`

```java
public abstract class EditSystemScreen<T> extends WindowScreen
```

## meteordevelopment.meteorclient.gui.screens.EditSystemScreen.value

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/EditSystemScreen.java:11`

```java
protected final T value
```

## meteordevelopment.meteorclient.gui.screens.EditSystemScreen.isNew

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/EditSystemScreen.java:12`

```java
protected final boolean isNew
```

## meteordevelopment.meteorclient.gui.screens.EditSystemScreen.EditSystemScreen

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/EditSystemScreen.java:15`

```java
public EditSystemScreen(GuiTheme theme, T value, Runnable reload)
```

## meteordevelopment.meteorclient.gui.screens.EditSystemScreen.initWidgets

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/EditSystemScreen.java:23`

```java
@Override public void initWidgets()
```

## meteordevelopment.meteorclient.gui.screens.EditSystemScreen.tick

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/EditSystemScreen.java:38`

```java
@Override public void tick()
```

## meteordevelopment.meteorclient.gui.screens.EditSystemScreen.onClosed

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/EditSystemScreen.java:43`

```java
@Override protected void onClosed()
```

## meteordevelopment.meteorclient.gui.screens.EditSystemScreen.create

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/EditSystemScreen.java:48`

```java
public abstract T create()
```

## meteordevelopment.meteorclient.gui.screens.EditSystemScreen.save

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/EditSystemScreen.java:49`

```java
public abstract boolean save()
```

## meteordevelopment.meteorclient.gui.screens.EditSystemScreen.getSettings

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/EditSystemScreen.java:50`

```java
public abstract Settings getSettings()
```

## meteordevelopment.meteorclient.gui.screens.MarkerScreen

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/MarkerScreen.java:15`

```java
public class MarkerScreen extends WindowScreen
```

## meteordevelopment.meteorclient.gui.screens.MarkerScreen.MarkerScreen

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/MarkerScreen.java:19`

```java
public MarkerScreen(GuiTheme theme, BaseMarker marker)
```

## meteordevelopment.meteorclient.gui.screens.MarkerScreen.initWidgets

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/MarkerScreen.java:25`

```java
@Override public void initWidgets()
```

## meteordevelopment.meteorclient.gui.screens.MarkerScreen.tick

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/MarkerScreen.java:43`

```java
@Override public void tick()
```

## meteordevelopment.meteorclient.gui.screens.MarkerScreen.getWidget

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/MarkerScreen.java:50`

```java
public WWidget getWidget(GuiTheme theme)
```

## meteordevelopment.meteorclient.gui.screens.ModuleScreen

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/ModuleScreen.java:35`

```java
public class ModuleScreen extends WindowScreen
```

## meteordevelopment.meteorclient.gui.screens.ModuleScreen.ModuleScreen

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/ModuleScreen.java:42`

```java
public ModuleScreen(GuiTheme theme, Module module)
```

## meteordevelopment.meteorclient.gui.screens.ModuleScreen.initWidgets

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/ModuleScreen.java:49`

```java
@Override public void initWidgets()
```

## meteordevelopment.meteorclient.gui.screens.ModuleScreen.shouldCloseOnEsc

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/ModuleScreen.java:136`

```java
@Override public boolean shouldCloseOnEsc()
```

## meteordevelopment.meteorclient.gui.screens.ModuleScreen.tick

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/ModuleScreen.java:141`

```java
@Override public void tick()
```

## meteordevelopment.meteorclient.gui.screens.ModuleScreen.toClipboard

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/ModuleScreen.java:158`

```java
@Override public boolean toClipboard()
```

## meteordevelopment.meteorclient.gui.screens.ModuleScreen.fromClipboard

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/ModuleScreen.java:170`

```java
@Override public boolean fromClipboard()
```

## meteordevelopment.meteorclient.gui.screens.ModulesScreen

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/ModulesScreen.java:35`

```java
public class ModulesScreen extends TabScreen
```

## meteordevelopment.meteorclient.gui.screens.ModulesScreen.ModulesScreen

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/ModulesScreen.java:40`

```java
public ModulesScreen(GuiTheme theme)
```

## meteordevelopment.meteorclient.gui.screens.ModulesScreen.initWidgets

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/ModulesScreen.java:44`

```java
@Override public void initWidgets()
```

## meteordevelopment.meteorclient.gui.screens.ModulesScreen.init

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/ModulesScreen.java:54`

```java
@Override protected void init()
```

## meteordevelopment.meteorclient.gui.screens.ModulesScreen.createCategory

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/ModulesScreen.java:62`

```java
protected WWindow createCategory(WContainer c, Category category, List<Module> moduleList)
```

## meteordevelopment.meteorclient.gui.screens.ModulesScreen.createSearchW

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/ModulesScreen.java:86`

```java
protected void createSearchW(WContainer w, String text)
```

## meteordevelopment.meteorclient.gui.screens.ModulesScreen.createSearch

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/ModulesScreen.java:120`

```java
protected WWindow createSearch(WContainer c)
```

## meteordevelopment.meteorclient.gui.screens.ModulesScreen.keyPressed

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/ModulesScreen.java:150`

```java
@Override public boolean keyPressed(KeyInput value)
```

## meteordevelopment.meteorclient.gui.screens.ModulesScreen.createFavorites

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/ModulesScreen.java:171`

```java
protected Cell<WWindow> createFavorites(WContainer c)
```

## meteordevelopment.meteorclient.gui.screens.ModulesScreen.createFavoritesW

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/ModulesScreen.java:193`

```java
protected boolean createFavoritesW(WWindow w)
```

## meteordevelopment.meteorclient.gui.screens.ModulesScreen.toClipboard

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/ModulesScreen.java:211`

```java
@Override public boolean toClipboard()
```

## meteordevelopment.meteorclient.gui.screens.ModulesScreen.fromClipboard

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/ModulesScreen.java:216`

```java
@Override public boolean fromClipboard()
```

## meteordevelopment.meteorclient.gui.screens.ModulesScreen.reload

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/ModulesScreen.java:221`

```java
@Override public void reload()
```

## meteordevelopment.meteorclient.gui.screens.ModulesScreen.WCategoryController

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/ModulesScreen.java:227`

```java
protected class WCategoryController extends WContainer
```

## meteordevelopment.meteorclient.gui.screens.ModulesScreen.WCategoryController.windows

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/ModulesScreen.java:228`

```java
public final List<WWindow> windows = new ArrayList<>()
```

## meteordevelopment.meteorclient.gui.screens.ModulesScreen.WCategoryController.init

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/ModulesScreen.java:231`

```java
@Override public void init()
```

## meteordevelopment.meteorclient.gui.screens.ModulesScreen.WCategoryController.refresh

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/ModulesScreen.java:253`

```java
protected void refresh()
```

## meteordevelopment.meteorclient.gui.screens.ModulesScreen.WCategoryController.onCalculateWidgetPositions

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/ModulesScreen.java:268`

```java
@Override protected void onCalculateWidgetPositions()
```

## meteordevelopment.meteorclient.gui.screens.NotebotSongsScreen

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/NotebotSongsScreen.java:25`

```java
public class NotebotSongsScreen extends WindowScreen
```

## meteordevelopment.meteorclient.gui.screens.NotebotSongsScreen.NotebotSongsScreen

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/NotebotSongsScreen.java:33`

```java
public NotebotSongsScreen(GuiTheme theme)
```

## meteordevelopment.meteorclient.gui.screens.NotebotSongsScreen.initWidgets

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/NotebotSongsScreen.java:37`

```java
@Override public void initWidgets()
```

## meteordevelopment.meteorclient.gui.screens.ProxiesImportScreen

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/ProxiesImportScreen.java:24`

```java
public class ProxiesImportScreen extends WindowScreen
```

## meteordevelopment.meteorclient.gui.screens.ProxiesImportScreen.ProxiesImportScreen

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/ProxiesImportScreen.java:27`

```java
public ProxiesImportScreen(GuiTheme theme, File file)
```

## meteordevelopment.meteorclient.gui.screens.ProxiesImportScreen.initWidgets

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/ProxiesImportScreen.java:37`

```java
@Override public void initWidgets()
```

## meteordevelopment.meteorclient.gui.screens.ProxiesScreen

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/ProxiesScreen.java:38`

```java
public class ProxiesScreen extends WindowScreen
```

## meteordevelopment.meteorclient.gui.screens.ProxiesScreen.ProxiesScreen

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/ProxiesScreen.java:45`

```java
public ProxiesScreen(GuiTheme theme)
```

## meteordevelopment.meteorclient.gui.screens.ProxiesScreen.initWidgets

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/ProxiesScreen.java:49`

```java
@Override public void initWidgets()
```

## meteordevelopment.meteorclient.gui.screens.ProxiesScreen.tick

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/ProxiesScreen.java:145`

```java
@Override public void tick()
```

## meteordevelopment.meteorclient.gui.screens.ProxiesScreen.toClipboard

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/ProxiesScreen.java:188`

```java
@Override public boolean toClipboard()
```

## meteordevelopment.meteorclient.gui.screens.ProxiesScreen.fromClipboard

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/ProxiesScreen.java:193`

```java
@Override public boolean fromClipboard()
```

## meteordevelopment.meteorclient.gui.screens.ProxiesScreen.EditProxyScreen

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/ProxiesScreen.java:198`

```java
protected static class EditProxyScreen extends EditSystemScreen<Proxy>
```

## meteordevelopment.meteorclient.gui.screens.ProxiesScreen.EditProxyScreen.EditProxyScreen

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/ProxiesScreen.java:199`

```java
public EditProxyScreen(GuiTheme theme, Proxy value, Runnable reload)
```

## meteordevelopment.meteorclient.gui.screens.ProxiesScreen.EditProxyScreen.create

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/ProxiesScreen.java:203`

```java
@Override public Proxy create()
```

## meteordevelopment.meteorclient.gui.screens.ProxiesScreen.EditProxyScreen.save

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/ProxiesScreen.java:208`

```java
@Override public boolean save()
```

## meteordevelopment.meteorclient.gui.screens.ProxiesScreen.EditProxyScreen.getSettings

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/ProxiesScreen.java:214`

```java
@Override public Settings getSettings()
```

## meteordevelopment.meteorclient.gui.screens.accounts.AccountInfoScreen

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/accounts/AccountInfoScreen.java:19`

```java
public class AccountInfoScreen extends WindowScreen
```

## meteordevelopment.meteorclient.gui.screens.accounts.AccountInfoScreen.AccountInfoScreen

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/accounts/AccountInfoScreen.java:22`

```java
public AccountInfoScreen(GuiTheme theme, Account<?> account)
```

## meteordevelopment.meteorclient.gui.screens.accounts.AccountInfoScreen.initWidgets

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/accounts/AccountInfoScreen.java:27`

```java
@Override public void initWidgets()
```

## meteordevelopment.meteorclient.gui.screens.accounts.AccountsScreen

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/accounts/AccountsScreen.java:23`

```java
public class AccountsScreen extends WindowScreen
```

## meteordevelopment.meteorclient.gui.screens.accounts.AccountsScreen.AccountsScreen

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/accounts/AccountsScreen.java:24`

```java
public AccountsScreen(GuiTheme theme)
```

## meteordevelopment.meteorclient.gui.screens.accounts.AccountsScreen.initWidgets

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/accounts/AccountsScreen.java:28`

```java
@Override public void initWidgets()
```

## meteordevelopment.meteorclient.gui.screens.accounts.AccountsScreen.addAccount

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/accounts/AccountsScreen.java:50`

```java
public static void addAccount(@Nullable AddAccountScreen screen, AccountsScreen parent, Account<?> account)
```

## meteordevelopment.meteorclient.gui.screens.accounts.AccountsScreen.toClipboard

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/accounts/AccountsScreen.java:79`

```java
@Override public boolean toClipboard()
```

## meteordevelopment.meteorclient.gui.screens.accounts.AccountsScreen.fromClipboard

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/accounts/AccountsScreen.java:84`

```java
@Override public boolean fromClipboard()
```

## meteordevelopment.meteorclient.gui.screens.accounts.AddAccountScreen

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/accounts/AddAccountScreen.java:12`

```java
public abstract class AddAccountScreen extends WindowScreen
```

## meteordevelopment.meteorclient.gui.screens.accounts.AddAccountScreen.parent

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/accounts/AddAccountScreen.java:13`

```java
public final AccountsScreen parent
```

## meteordevelopment.meteorclient.gui.screens.accounts.AddAccountScreen.add

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/accounts/AddAccountScreen.java:14`

```java
public WButton add
```

## meteordevelopment.meteorclient.gui.screens.accounts.AddAccountScreen.AddAccountScreen

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/accounts/AddAccountScreen.java:17`

```java
protected AddAccountScreen(GuiTheme theme, String title, AccountsScreen parent)
```

## meteordevelopment.meteorclient.gui.screens.accounts.AddAccountScreen.tick

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/accounts/AddAccountScreen.java:22`

```java
@Override public void tick()
```

## meteordevelopment.meteorclient.gui.screens.accounts.AddAlteningAccountScreen

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/accounts/AddAlteningAccountScreen.java:13`

```java
public class AddAlteningAccountScreen extends AddAccountScreen
```

## meteordevelopment.meteorclient.gui.screens.accounts.AddAlteningAccountScreen.AddAlteningAccountScreen

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/accounts/AddAlteningAccountScreen.java:14`

```java
public AddAlteningAccountScreen(GuiTheme theme, AccountsScreen parent)
```

## meteordevelopment.meteorclient.gui.screens.accounts.AddAlteningAccountScreen.initWidgets

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/accounts/AddAlteningAccountScreen.java:18`

```java
@Override public void initWidgets()
```

## meteordevelopment.meteorclient.gui.screens.accounts.AddCrackedAccountScreen

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/accounts/AddCrackedAccountScreen.java:14`

```java
public class AddCrackedAccountScreen extends AddAccountScreen
```

## meteordevelopment.meteorclient.gui.screens.accounts.AddCrackedAccountScreen.AddCrackedAccountScreen

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/accounts/AddCrackedAccountScreen.java:15`

```java
public AddCrackedAccountScreen(GuiTheme theme, AccountsScreen parent)
```

## meteordevelopment.meteorclient.gui.screens.accounts.AddCrackedAccountScreen.initWidgets

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/accounts/AddCrackedAccountScreen.java:19`

```java
@Override public void initWidgets()
```

## meteordevelopment.meteorclient.gui.screens.accounts.AddMicrosoftAccountScreen

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/accounts/AddMicrosoftAccountScreen.java:16`

```java
public class AddMicrosoftAccountScreen extends AddAccountScreen
```

## meteordevelopment.meteorclient.gui.screens.accounts.AddMicrosoftAccountScreen.AddMicrosoftAccountScreen

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/accounts/AddMicrosoftAccountScreen.java:17`

```java
public AddMicrosoftAccountScreen(GuiTheme theme, AccountsScreen parent)
```

## meteordevelopment.meteorclient.gui.screens.accounts.AddMicrosoftAccountScreen.initWidgets

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/accounts/AddMicrosoftAccountScreen.java:21`

```java
@Override public void initWidgets()
```

## meteordevelopment.meteorclient.gui.screens.accounts.AddMicrosoftAccountScreen.tick

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/accounts/AddMicrosoftAccountScreen.java:48`

```java
@Override public void tick()
```

## meteordevelopment.meteorclient.gui.screens.accounts.AddMicrosoftAccountScreen.shouldCloseOnEsc

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/accounts/AddMicrosoftAccountScreen.java:51`

```java
@Override public boolean shouldCloseOnEsc()
```

## meteordevelopment.meteorclient.gui.screens.accounts.AddSessionAccountScreen

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/accounts/AddSessionAccountScreen.java:13`

```java
public class AddSessionAccountScreen extends AddAccountScreen
```

## meteordevelopment.meteorclient.gui.screens.accounts.AddSessionAccountScreen.AddSessionAccountScreen

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/accounts/AddSessionAccountScreen.java:14`

```java
public AddSessionAccountScreen(GuiTheme theme, AccountsScreen parent)
```

## meteordevelopment.meteorclient.gui.screens.accounts.AddSessionAccountScreen.initWidgets

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/accounts/AddSessionAccountScreen.java:18`

```java
@Override public void initWidgets()
```

## meteordevelopment.meteorclient.gui.screens.settings.BlockDataSettingScreen

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/BlockDataSettingScreen.java:27`

```java
public class BlockDataSettingScreen<T extends ICopyable<T> & ISerializable<T> & IChangeable & IBlockData<T>> extends CollectionMapSettingScreen<Block, T>
```

## meteordevelopment.meteorclient.gui.screens.settings.BlockDataSettingScreen.BlockDataSettingScreen

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/BlockDataSettingScreen.java:31`

```java
public BlockDataSettingScreen(GuiTheme theme, BlockDataSetting<T> setting)
```

## meteordevelopment.meteorclient.gui.screens.settings.BlockDataSettingScreen.includeValue

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/BlockDataSettingScreen.java:37`

```java
@Override protected boolean includeValue(Block value)
```

## meteordevelopment.meteorclient.gui.screens.settings.BlockDataSettingScreen.getValueWidget

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/BlockDataSettingScreen.java:42`

```java
@Override protected WWidget getValueWidget(Block block)
```

## meteordevelopment.meteorclient.gui.screens.settings.BlockDataSettingScreen.getDataWidget

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/BlockDataSettingScreen.java:47`

```java
@Override protected WWidget getDataWidget(Block block, @Nullable T blockData)
```

## meteordevelopment.meteorclient.gui.screens.settings.BlockDataSettingScreen.onRenderBefore

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/BlockDataSettingScreen.java:60`

```java
@Override protected void onRenderBefore(DrawContext drawContext, float delta)
```

## meteordevelopment.meteorclient.gui.screens.settings.BlockDataSettingScreen.getValueNames

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/BlockDataSettingScreen.java:68`

```java
@Override protected String[] getValueNames(Block block)
```

## meteordevelopment.meteorclient.gui.screens.settings.BlockListSettingScreen

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/BlockListSettingScreen.java:20`

```java
public class BlockListSettingScreen extends CollectionListSettingScreen<Block>
```

## meteordevelopment.meteorclient.gui.screens.settings.BlockListSettingScreen.BlockListSettingScreen

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/BlockListSettingScreen.java:21`

```java
public BlockListSettingScreen(GuiTheme theme, BlockListSetting setting)
```

## meteordevelopment.meteorclient.gui.screens.settings.BlockListSettingScreen.includeValue

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/BlockListSettingScreen.java:25`

```java
@Override protected boolean includeValue(Block value)
```

## meteordevelopment.meteorclient.gui.screens.settings.BlockListSettingScreen.getValueWidget

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/BlockListSettingScreen.java:37`

```java
@Override protected WWidget getValueWidget(Block value)
```

## meteordevelopment.meteorclient.gui.screens.settings.BlockListSettingScreen.getValueNames

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/BlockListSettingScreen.java:42`

```java
@Override protected String[] getValueNames(Block value)
```

## meteordevelopment.meteorclient.gui.screens.settings.BlockListSettingScreen.getAdditionalValue

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/BlockListSettingScreen.java:50`

```java
@Override protected Block getAdditionalValue(Block value)
```

## meteordevelopment.meteorclient.gui.screens.settings.BlockSettingScreen

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/BlockSettingScreen.java:21`

```java
public class BlockSettingScreen extends WindowScreen
```

## meteordevelopment.meteorclient.gui.screens.settings.BlockSettingScreen.BlockSettingScreen

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/BlockSettingScreen.java:29`

```java
public BlockSettingScreen(GuiTheme theme, BlockSetting setting)
```

## meteordevelopment.meteorclient.gui.screens.settings.BlockSettingScreen.initWidgets

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/BlockSettingScreen.java:35`

```java
@Override public void initWidgets()
```

## meteordevelopment.meteorclient.gui.screens.settings.BlockSettingScreen.skipValue

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/BlockSettingScreen.java:70`

```java
protected boolean skipValue(Block value)
```

## meteordevelopment.meteorclient.gui.screens.settings.ColorSettingScreen

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/ColorSettingScreen.java:28`

```java
public class ColorSettingScreen extends WindowScreen
```

## meteordevelopment.meteorclient.gui.screens.settings.ColorSettingScreen.action

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/ColorSettingScreen.java:33`

```java
public Runnable action
```

## meteordevelopment.meteorclient.gui.screens.settings.ColorSettingScreen.ColorSettingScreen

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/ColorSettingScreen.java:45`

```java
public ColorSettingScreen(GuiTheme theme, Setting<SettingColor> setting)
```

## meteordevelopment.meteorclient.gui.screens.settings.ColorSettingScreen.initWidgets

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/ColorSettingScreen.java:51`

```java
@Override public void initWidgets()
```

## meteordevelopment.meteorclient.gui.screens.settings.ColorSettingScreen.tick

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/ColorSettingScreen.java:136`

```java
@Override public void tick()
```

## meteordevelopment.meteorclient.gui.screens.settings.ColorSettingScreen.toClipboard

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/ColorSettingScreen.java:361`

```java
@Override public boolean toClipboard()
```

## meteordevelopment.meteorclient.gui.screens.settings.ColorSettingScreen.fromClipboard

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/ColorSettingScreen.java:366`

```java
@Override public boolean fromClipboard()
```

## meteordevelopment.meteorclient.gui.screens.settings.EnchantmentListSettingScreen

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/EnchantmentListSettingScreen.java:19`

```java
public class EnchantmentListSettingScreen extends DynamicRegistryListSettingScreen<Enchantment>
```

## meteordevelopment.meteorclient.gui.screens.settings.EnchantmentListSettingScreen.EnchantmentListSettingScreen

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/EnchantmentListSettingScreen.java:20`

```java
public EnchantmentListSettingScreen(GuiTheme theme, Setting<Set<RegistryKey<Enchantment>>> setting)
```

## meteordevelopment.meteorclient.gui.screens.settings.EnchantmentListSettingScreen.getValueWidget

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/EnchantmentListSettingScreen.java:24`

```java
@Override protected WWidget getValueWidget(RegistryKey<Enchantment> value)
```

## meteordevelopment.meteorclient.gui.screens.settings.EnchantmentListSettingScreen.getValueNames

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/EnchantmentListSettingScreen.java:29`

```java
@Override protected String[] getValueNames(RegistryKey<Enchantment> value)
```

## meteordevelopment.meteorclient.gui.screens.settings.EntityTypeListSettingScreen

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/EntityTypeListSettingScreen.java:34`

```java
public class EntityTypeListSettingScreen extends WindowScreen
```

## meteordevelopment.meteorclient.gui.screens.settings.EntityTypeListSettingScreen.EntityTypeListSettingScreen

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/EntityTypeListSettingScreen.java:48`

```java
public EntityTypeListSettingScreen(GuiTheme theme, EntityTypeListSetting setting)
```

## meteordevelopment.meteorclient.gui.screens.settings.EntityTypeListSettingScreen.add

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/EntityTypeListSettingScreen.java:66`

```java
@Override public <W extends WWidget> Cell<W> add(W widget)
```

## meteordevelopment.meteorclient.gui.screens.settings.EntityTypeListSettingScreen.initWidgets

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/EntityTypeListSettingScreen.java:71`

```java
@Override public void initWidgets()
```

## meteordevelopment.meteorclient.gui.screens.settings.FontFaceSettingScreen

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/FontFaceSettingScreen.java:26`

```java
public class FontFaceSettingScreen extends WindowScreen
```

## meteordevelopment.meteorclient.gui.screens.settings.FontFaceSettingScreen.FontFaceSettingScreen

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/FontFaceSettingScreen.java:34`

```java
public FontFaceSettingScreen(GuiTheme theme, FontFaceSetting setting)
```

## meteordevelopment.meteorclient.gui.screens.settings.FontFaceSettingScreen.initWidgets

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/FontFaceSettingScreen.java:40`

```java
@Override public void initWidgets()
```

## meteordevelopment.meteorclient.gui.screens.settings.ItemListSettingScreen

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/ItemListSettingScreen.java:19`

```java
public class ItemListSettingScreen extends CollectionListSettingScreen<Item>
```

## meteordevelopment.meteorclient.gui.screens.settings.ItemListSettingScreen.ItemListSettingScreen

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/ItemListSettingScreen.java:20`

```java
public ItemListSettingScreen(GuiTheme theme, ItemListSetting setting)
```

## meteordevelopment.meteorclient.gui.screens.settings.ItemListSettingScreen.includeValue

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/ItemListSettingScreen.java:24`

```java
@Override protected boolean includeValue(Item value)
```

## meteordevelopment.meteorclient.gui.screens.settings.ItemListSettingScreen.getValueWidget

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/ItemListSettingScreen.java:32`

```java
@Override protected WWidget getValueWidget(Item value)
```

## meteordevelopment.meteorclient.gui.screens.settings.ItemListSettingScreen.getValueNames

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/ItemListSettingScreen.java:37`

```java
@Override protected String[] getValueNames(Item value)
```

## meteordevelopment.meteorclient.gui.screens.settings.ItemSettingScreen

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/ItemSettingScreen.java:21`

```java
public class ItemSettingScreen extends WindowScreen
```

## meteordevelopment.meteorclient.gui.screens.settings.ItemSettingScreen.ItemSettingScreen

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/ItemSettingScreen.java:29`

```java
public ItemSettingScreen(GuiTheme theme, ItemSetting setting)
```

## meteordevelopment.meteorclient.gui.screens.settings.ItemSettingScreen.initWidgets

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/ItemSettingScreen.java:35`

```java
@Override public void initWidgets()
```

## meteordevelopment.meteorclient.gui.screens.settings.ItemSettingScreen.initTable

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/ItemSettingScreen.java:50`

```java
public void initTable()
```

## meteordevelopment.meteorclient.gui.screens.settings.ModuleListSettingScreen

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/ModuleListSettingScreen.java:17`

```java
public class ModuleListSettingScreen extends CollectionListSettingScreen<Module>
```

## meteordevelopment.meteorclient.gui.screens.settings.ModuleListSettingScreen.ModuleListSettingScreen

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/ModuleListSettingScreen.java:18`

```java
public ModuleListSettingScreen(GuiTheme theme, Setting<List<Module>> setting)
```

## meteordevelopment.meteorclient.gui.screens.settings.ModuleListSettingScreen.getValueWidget

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/ModuleListSettingScreen.java:22`

```java
@Override protected WWidget getValueWidget(Module value)
```

## meteordevelopment.meteorclient.gui.screens.settings.ModuleListSettingScreen.getValueNames

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/ModuleListSettingScreen.java:27`

```java
@Override protected String[] getValueNames(Module value)
```

## meteordevelopment.meteorclient.gui.screens.settings.PacketBoolSettingScreen

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/PacketBoolSettingScreen.java:19`

```java
public class PacketBoolSettingScreen extends CollectionListSettingScreen<Class<? extends Packet<?>>>
```

## meteordevelopment.meteorclient.gui.screens.settings.PacketBoolSettingScreen.PacketBoolSettingScreen

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/PacketBoolSettingScreen.java:20`

```java
public PacketBoolSettingScreen(GuiTheme theme, Setting<Set<Class<? extends Packet<?>>>> setting)
```

## meteordevelopment.meteorclient.gui.screens.settings.PacketBoolSettingScreen.includeValue

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/PacketBoolSettingScreen.java:24`

```java
@Override protected boolean includeValue(Class<? extends Packet<?>> value)
```

## meteordevelopment.meteorclient.gui.screens.settings.PacketBoolSettingScreen.getValueWidget

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/PacketBoolSettingScreen.java:32`

```java
@Override protected WWidget getValueWidget(Class<? extends Packet<?>> value)
```

## meteordevelopment.meteorclient.gui.screens.settings.PacketBoolSettingScreen.getValueNames

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/PacketBoolSettingScreen.java:37`

```java
@Override protected String[] getValueNames(Class<? extends Packet<?>> value)
```

## meteordevelopment.meteorclient.gui.screens.settings.ParticleTypeListSettingScreen

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/ParticleTypeListSettingScreen.java:19`

```java
public class ParticleTypeListSettingScreen extends CollectionListSettingScreen<ParticleType<?>>
```

## meteordevelopment.meteorclient.gui.screens.settings.ParticleTypeListSettingScreen.ParticleTypeListSettingScreen

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/ParticleTypeListSettingScreen.java:20`

```java
public ParticleTypeListSettingScreen(GuiTheme theme, Setting<List<ParticleType<?>>> setting)
```

## meteordevelopment.meteorclient.gui.screens.settings.ParticleTypeListSettingScreen.includeValue

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/ParticleTypeListSettingScreen.java:24`

```java
@Override protected boolean includeValue(ParticleType<?> value)
```

## meteordevelopment.meteorclient.gui.screens.settings.ParticleTypeListSettingScreen.getValueWidget

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/ParticleTypeListSettingScreen.java:29`

```java
@Override protected WWidget getValueWidget(ParticleType<?> value)
```

## meteordevelopment.meteorclient.gui.screens.settings.ParticleTypeListSettingScreen.getValueNames

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/ParticleTypeListSettingScreen.java:34`

```java
@Override protected String[] getValueNames(ParticleType<?> value)
```

## meteordevelopment.meteorclient.gui.screens.settings.PotionSettingScreen

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/PotionSettingScreen.java:16`

```java
public class PotionSettingScreen extends WindowScreen
```

## meteordevelopment.meteorclient.gui.screens.settings.PotionSettingScreen.PotionSettingScreen

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/PotionSettingScreen.java:19`

```java
public PotionSettingScreen(GuiTheme theme, PotionSetting setting)
```

## meteordevelopment.meteorclient.gui.screens.settings.PotionSettingScreen.initWidgets

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/PotionSettingScreen.java:25`

```java
@Override public void initWidgets()
```

## meteordevelopment.meteorclient.gui.screens.settings.ScreenHandlerSettingScreen

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/ScreenHandlerSettingScreen.java:17`

```java
public class ScreenHandlerSettingScreen extends CollectionListSettingScreen<ScreenHandlerType<?>>
```

## meteordevelopment.meteorclient.gui.screens.settings.ScreenHandlerSettingScreen.ScreenHandlerSettingScreen

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/ScreenHandlerSettingScreen.java:18`

```java
public ScreenHandlerSettingScreen(GuiTheme theme, Setting<List<ScreenHandlerType<?>>> setting)
```

## meteordevelopment.meteorclient.gui.screens.settings.ScreenHandlerSettingScreen.getValueWidget

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/ScreenHandlerSettingScreen.java:22`

```java
@Override protected WWidget getValueWidget(ScreenHandlerType<?> value)
```

## meteordevelopment.meteorclient.gui.screens.settings.ScreenHandlerSettingScreen.getValueNames

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/ScreenHandlerSettingScreen.java:27`

```java
@Override protected String[] getValueNames(ScreenHandlerType<?> type)
```

## meteordevelopment.meteorclient.gui.screens.settings.SoundEventListSettingScreen

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/SoundEventListSettingScreen.java:18`

```java
public class SoundEventListSettingScreen extends CollectionListSettingScreen<SoundEvent>
```

## meteordevelopment.meteorclient.gui.screens.settings.SoundEventListSettingScreen.SoundEventListSettingScreen

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/SoundEventListSettingScreen.java:19`

```java
public SoundEventListSettingScreen(GuiTheme theme, Setting<List<SoundEvent>> setting)
```

## meteordevelopment.meteorclient.gui.screens.settings.SoundEventListSettingScreen.getValueWidget

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/SoundEventListSettingScreen.java:23`

```java
@Override protected WWidget getValueWidget(SoundEvent value)
```

## meteordevelopment.meteorclient.gui.screens.settings.SoundEventListSettingScreen.getValueNames

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/SoundEventListSettingScreen.java:28`

```java
@Override protected String[] getValueNames(SoundEvent value)
```

## meteordevelopment.meteorclient.gui.screens.settings.StatusEffectAmplifierMapSettingScreen

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/StatusEffectAmplifierMapSettingScreen.java:28`

```java
public class StatusEffectAmplifierMapSettingScreen extends WindowScreen
```

## meteordevelopment.meteorclient.gui.screens.settings.StatusEffectAmplifierMapSettingScreen.StatusEffectAmplifierMapSettingScreen

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/StatusEffectAmplifierMapSettingScreen.java:35`

```java
public StatusEffectAmplifierMapSettingScreen(GuiTheme theme, Setting<Reference2IntMap<StatusEffect>> setting)
```

## meteordevelopment.meteorclient.gui.screens.settings.StatusEffectAmplifierMapSettingScreen.initWidgets

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/StatusEffectAmplifierMapSettingScreen.java:41`

```java
@Override public void initWidgets()
```

## meteordevelopment.meteorclient.gui.screens.settings.StatusEffectListSettingScreen

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/StatusEffectListSettingScreen.java:23`

```java
public class StatusEffectListSettingScreen extends CollectionListSettingScreen<StatusEffect>
```

## meteordevelopment.meteorclient.gui.screens.settings.StatusEffectListSettingScreen.StatusEffectListSettingScreen

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/StatusEffectListSettingScreen.java:24`

```java
public StatusEffectListSettingScreen(GuiTheme theme, Setting<List<StatusEffect>> setting)
```

## meteordevelopment.meteorclient.gui.screens.settings.StatusEffectListSettingScreen.getValueWidget

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/StatusEffectListSettingScreen.java:28`

```java
@Override protected WWidget getValueWidget(StatusEffect value)
```

## meteordevelopment.meteorclient.gui.screens.settings.StatusEffectListSettingScreen.getValueNames

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/StatusEffectListSettingScreen.java:33`

```java
@Override protected String[] getValueNames(StatusEffect value)
```

## meteordevelopment.meteorclient.gui.screens.settings.StorageBlockListSettingScreen

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/StorageBlockListSettingScreen.java:22`

```java
public class StorageBlockListSettingScreen extends CollectionListSettingScreen<BlockEntityType<?>>
```

## meteordevelopment.meteorclient.gui.screens.settings.StorageBlockListSettingScreen.StorageBlockListSettingScreen

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/StorageBlockListSettingScreen.java:46`

```java
public StorageBlockListSettingScreen(GuiTheme theme, Setting<List<BlockEntityType<?>>> setting)
```

## meteordevelopment.meteorclient.gui.screens.settings.StorageBlockListSettingScreen.getValueWidget

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/StorageBlockListSettingScreen.java:50`

```java
@Override protected WWidget getValueWidget(BlockEntityType<?> value)
```

## meteordevelopment.meteorclient.gui.screens.settings.StorageBlockListSettingScreen.getValueNames

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/StorageBlockListSettingScreen.java:56`

```java
@Override protected String[] getValueNames(BlockEntityType<?> value)
```

## meteordevelopment.meteorclient.gui.screens.settings.base.CollectionListSettingScreen

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/base/CollectionListSettingScreen.java:22`

```java
public abstract class CollectionListSettingScreen<T> extends WindowScreen
```

## meteordevelopment.meteorclient.gui.screens.settings.base.CollectionListSettingScreen.setting

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/base/CollectionListSettingScreen.java:23`

```java
protected final Setting<?> setting
```

## meteordevelopment.meteorclient.gui.screens.settings.base.CollectionListSettingScreen.collection

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/base/CollectionListSettingScreen.java:24`

```java
protected final Collection<T> collection
```

## meteordevelopment.meteorclient.gui.screens.settings.base.CollectionListSettingScreen.CollectionListSettingScreen

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/base/CollectionListSettingScreen.java:30`

```java
public CollectionListSettingScreen(GuiTheme theme, String title, Setting<?> setting, Collection<T> collection, Iterable<T> registry)
```

## meteordevelopment.meteorclient.gui.screens.settings.base.CollectionListSettingScreen.initWidgets

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/base/CollectionListSettingScreen.java:38`

```java
@Override public void initWidgets()
```

## meteordevelopment.meteorclient.gui.screens.settings.base.CollectionListSettingScreen.invalidateTable

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/base/CollectionListSettingScreen.java:106`

```java
protected void invalidateTable()
```

## meteordevelopment.meteorclient.gui.screens.settings.base.CollectionListSettingScreen.addValue

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/base/CollectionListSettingScreen.java:111`

```java
protected void addValue(T value)
```

## meteordevelopment.meteorclient.gui.screens.settings.base.CollectionListSettingScreen.removeValue

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/base/CollectionListSettingScreen.java:119`

```java
protected void removeValue(T value)
```

## meteordevelopment.meteorclient.gui.screens.settings.base.CollectionListSettingScreen.postWidgets

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/base/CollectionListSettingScreen.java:126`

```java
protected void postWidgets(WTable left, WTable right)
```

## meteordevelopment.meteorclient.gui.screens.settings.base.CollectionListSettingScreen.includeValue

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/base/CollectionListSettingScreen.java:128`

```java
protected boolean includeValue(T value)
```

## meteordevelopment.meteorclient.gui.screens.settings.base.CollectionListSettingScreen.getValueWidget

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/base/CollectionListSettingScreen.java:132`

```java
protected abstract WWidget getValueWidget(T value)
```

## meteordevelopment.meteorclient.gui.screens.settings.base.CollectionListSettingScreen.getValueNames

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/base/CollectionListSettingScreen.java:134`

```java
protected abstract String[] getValueNames(T value)
```

## meteordevelopment.meteorclient.gui.screens.settings.base.CollectionListSettingScreen.getAdditionalValue

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/base/CollectionListSettingScreen.java:136`

```java
protected T getAdditionalValue(T value)
```

## meteordevelopment.meteorclient.gui.screens.settings.base.CollectionMapSettingScreen

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/base/CollectionMapSettingScreen.java:22`

```java
public abstract class CollectionMapSettingScreen<K, V> extends WindowScreen
```

## meteordevelopment.meteorclient.gui.screens.settings.base.CollectionMapSettingScreen.map

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/base/CollectionMapSettingScreen.java:24`

```java
protected final Map<K, V> map
```

## meteordevelopment.meteorclient.gui.screens.settings.base.CollectionMapSettingScreen.CollectionMapSettingScreen

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/base/CollectionMapSettingScreen.java:30`

```java
public CollectionMapSettingScreen(GuiTheme theme, String title, Setting<?> setting, Map<K, V> map, Iterable<K> registry)
```

## meteordevelopment.meteorclient.gui.screens.settings.base.CollectionMapSettingScreen.initWidgets

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/base/CollectionMapSettingScreen.java:38`

```java
@Override public void initWidgets()
```

## meteordevelopment.meteorclient.gui.screens.settings.base.CollectionMapSettingScreen.invalidateTable

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/base/CollectionMapSettingScreen.java:75`

```java
protected void invalidateTable()
```

## meteordevelopment.meteorclient.gui.screens.settings.base.CollectionMapSettingScreen.removeValue

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/base/CollectionMapSettingScreen.java:80`

```java
protected void removeValue(K value)
```

## meteordevelopment.meteorclient.gui.screens.settings.base.CollectionMapSettingScreen.includeValue

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/base/CollectionMapSettingScreen.java:87`

```java
protected boolean includeValue(K value)
```

## meteordevelopment.meteorclient.gui.screens.settings.base.CollectionMapSettingScreen.getValueWidget

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/base/CollectionMapSettingScreen.java:91`

```java
protected abstract WWidget getValueWidget(K value)
```

## meteordevelopment.meteorclient.gui.screens.settings.base.CollectionMapSettingScreen.getDataWidget

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/base/CollectionMapSettingScreen.java:93`

```java
protected abstract WWidget getDataWidget(K value, @Nullable V data)
```

## meteordevelopment.meteorclient.gui.screens.settings.base.CollectionMapSettingScreen.getValueNames

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/base/CollectionMapSettingScreen.java:95`

```java
protected abstract String[] getValueNames(K value)
```

## meteordevelopment.meteorclient.gui.screens.settings.base.DynamicRegistryListSettingScreen

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/base/DynamicRegistryListSettingScreen.java:23`

```java
public abstract class DynamicRegistryListSettingScreen<T> extends CollectionListSettingScreen<RegistryKey<T>>
```

## meteordevelopment.meteorclient.gui.screens.settings.base.DynamicRegistryListSettingScreen.registryKey

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/base/DynamicRegistryListSettingScreen.java:24`

```java
protected final RegistryKey<Registry<T>> registryKey
```

## meteordevelopment.meteorclient.gui.screens.settings.base.DynamicRegistryListSettingScreen.DynamicRegistryListSettingScreen

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/base/DynamicRegistryListSettingScreen.java:26`

```java
public DynamicRegistryListSettingScreen(GuiTheme theme, String title, Setting<?> setting, Collection<RegistryKey<T>> collection, RegistryKey<Registry<T>> registryKey)
```

## meteordevelopment.meteorclient.gui.screens.settings.base.DynamicRegistryListSettingScreen.postWidgets

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/base/DynamicRegistryListSettingScreen.java:44`

```java
@Override protected void postWidgets(WTable left, WTable right)
```

## meteordevelopment.meteorclient.gui.screens.settings.base.SortingHelper

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/base/SortingHelper.java:22`

```java
public final class SortingHelper
```

## meteordevelopment.meteorclient.gui.screens.settings.base.SortingHelper.sort

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/base/SortingHelper.java:27`

```java
public static <T> Iterable<T> sort(Iterable<T> registry, Predicate<T> filter, Function<T, String[]> nameFunction, String filterText)
```

## meteordevelopment.meteorclient.gui.screens.settings.base.SortingHelper.sortWithPriority

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/base/SortingHelper.java:31`

```java
public static <T> Iterable<T> sortWithPriority(Iterable<T> registry, Predicate<T> filter, Function<T, String[]> nameFunction, String filterText, Comparator<T> comparator)
```

## meteordevelopment.meteorclient.gui.screens.settings.base.SortingHelper.Entry

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/screens/settings/base/SortingHelper.java:143`

```java
public record Entry<T>(T value, int distance)
```

## meteordevelopment.meteorclient.gui.tabs.Tab

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/tabs/Tab.java:13`

```java
public abstract class Tab
```

## meteordevelopment.meteorclient.gui.tabs.Tab.name

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/tabs/Tab.java:14`

```java
public final String name
```

## meteordevelopment.meteorclient.gui.tabs.Tab.Tab

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/tabs/Tab.java:16`

```java
public Tab(String name)
```

## meteordevelopment.meteorclient.gui.tabs.Tab.openScreen

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/tabs/Tab.java:20`

```java
public void openScreen(GuiTheme theme)
```

## meteordevelopment.meteorclient.gui.tabs.Tab.createScreen

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/tabs/Tab.java:26`

```java
public abstract TabScreen createScreen(GuiTheme theme)
```

## meteordevelopment.meteorclient.gui.tabs.Tab.isScreen

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/tabs/Tab.java:28`

```java
public abstract boolean isScreen(Screen screen)
```

## meteordevelopment.meteorclient.gui.tabs.TabScreen

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/tabs/TabScreen.java:13`

```java
public abstract class TabScreen extends WidgetScreen
```

## meteordevelopment.meteorclient.gui.tabs.TabScreen.tab

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/tabs/TabScreen.java:14`

```java
public final Tab tab
```

## meteordevelopment.meteorclient.gui.tabs.TabScreen.TabScreen

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/tabs/TabScreen.java:16`

```java
public TabScreen(GuiTheme theme, Tab tab)
```

## meteordevelopment.meteorclient.gui.tabs.TabScreen.addDirect

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/tabs/TabScreen.java:22`

```java
public <T extends WWidget> Cell<T> addDirect(T widget)
```

## meteordevelopment.meteorclient.gui.tabs.Tabs

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/tabs/Tabs.java:16`

```java
public class Tabs
```

## meteordevelopment.meteorclient.gui.tabs.Tabs.init

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/tabs/Tabs.java:23`

```java
@PreInit(dependencies = PathManagers.class) public static void init()
```

## meteordevelopment.meteorclient.gui.tabs.Tabs.add

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/tabs/Tabs.java:38`

```java
public static void add(Tab tab)
```

## meteordevelopment.meteorclient.gui.tabs.Tabs.get

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/tabs/Tabs.java:43`

```java
public static List<Tab> get()
```

## meteordevelopment.meteorclient.gui.tabs.Tabs.get

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/tabs/Tabs.java:47`

```java
public static Tab get(Class<? extends Tab> klass)
```

## meteordevelopment.meteorclient.gui.tabs.WindowTabScreen

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/tabs/WindowTabScreen.java:13`

```java
public abstract class WindowTabScreen extends TabScreen
```

## meteordevelopment.meteorclient.gui.tabs.WindowTabScreen.window

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/tabs/WindowTabScreen.java:14`

```java
protected final WWindow window
```

## meteordevelopment.meteorclient.gui.tabs.WindowTabScreen.WindowTabScreen

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/tabs/WindowTabScreen.java:16`

```java
public WindowTabScreen(GuiTheme theme, Tab tab)
```

## meteordevelopment.meteorclient.gui.tabs.WindowTabScreen.add

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/tabs/WindowTabScreen.java:22`

```java
@Override public <W extends WWidget> Cell<W> add(W widget)
```

## meteordevelopment.meteorclient.gui.tabs.WindowTabScreen.clear

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/tabs/WindowTabScreen.java:27`

```java
@Override public void clear()
```

## meteordevelopment.meteorclient.gui.tabs.builtin.ConfigTab

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/tabs/builtin/ConfigTab.java:18`

```java
public class ConfigTab extends Tab
```

## meteordevelopment.meteorclient.gui.tabs.builtin.ConfigTab.ConfigTab

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/tabs/builtin/ConfigTab.java:19`

```java
public ConfigTab()
```

## meteordevelopment.meteorclient.gui.tabs.builtin.ConfigTab.createScreen

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/tabs/builtin/ConfigTab.java:23`

```java
@Override public TabScreen createScreen(GuiTheme theme)
```

## meteordevelopment.meteorclient.gui.tabs.builtin.ConfigTab.isScreen

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/tabs/builtin/ConfigTab.java:28`

```java
@Override public boolean isScreen(Screen screen)
```

## meteordevelopment.meteorclient.gui.tabs.builtin.ConfigTab.ConfigScreen

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/tabs/builtin/ConfigTab.java:33`

```java
public static class ConfigScreen extends WindowTabScreen
```

## meteordevelopment.meteorclient.gui.tabs.builtin.ConfigTab.ConfigScreen.ConfigScreen

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/tabs/builtin/ConfigTab.java:36`

```java
public ConfigScreen(GuiTheme theme, Tab tab)
```

## meteordevelopment.meteorclient.gui.tabs.builtin.ConfigTab.ConfigScreen.initWidgets

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/tabs/builtin/ConfigTab.java:78`

```java
@Override public void initWidgets()
```

## meteordevelopment.meteorclient.gui.tabs.builtin.ConfigTab.ConfigScreen.tick

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/tabs/builtin/ConfigTab.java:83`

```java
@Override public void tick()
```

## meteordevelopment.meteorclient.gui.tabs.builtin.ConfigTab.ConfigScreen.toClipboard

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/tabs/builtin/ConfigTab.java:90`

```java
@Override public boolean toClipboard()
```

## meteordevelopment.meteorclient.gui.tabs.builtin.ConfigTab.ConfigScreen.fromClipboard

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/tabs/builtin/ConfigTab.java:95`

```java
@Override public boolean fromClipboard()
```

## meteordevelopment.meteorclient.gui.tabs.builtin.FriendsTab

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/tabs/builtin/FriendsTab.java:25`

```java
public class FriendsTab extends Tab
```

## meteordevelopment.meteorclient.gui.tabs.builtin.FriendsTab.FriendsTab

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/tabs/builtin/FriendsTab.java:26`

```java
public FriendsTab()
```

## meteordevelopment.meteorclient.gui.tabs.builtin.FriendsTab.createScreen

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/tabs/builtin/FriendsTab.java:30`

```java
@Override public TabScreen createScreen(GuiTheme theme)
```

## meteordevelopment.meteorclient.gui.tabs.builtin.FriendsTab.isScreen

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/tabs/builtin/FriendsTab.java:35`

```java
@Override public boolean isScreen(Screen screen)
```

## meteordevelopment.meteorclient.gui.tabs.builtin.GuiTab

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/tabs/builtin/GuiTab.java:22`

```java
public class GuiTab extends Tab
```

## meteordevelopment.meteorclient.gui.tabs.builtin.GuiTab.GuiTab

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/tabs/builtin/GuiTab.java:23`

```java
public GuiTab()
```

## meteordevelopment.meteorclient.gui.tabs.builtin.GuiTab.createScreen

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/tabs/builtin/GuiTab.java:27`

```java
@Override public TabScreen createScreen(GuiTheme theme)
```

## meteordevelopment.meteorclient.gui.tabs.builtin.GuiTab.isScreen

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/tabs/builtin/GuiTab.java:32`

```java
@Override public boolean isScreen(Screen screen)
```

## meteordevelopment.meteorclient.gui.tabs.builtin.HudTab

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/tabs/builtin/HudTab.java:25`

```java
public class HudTab extends Tab
```

## meteordevelopment.meteorclient.gui.tabs.builtin.HudTab.HudTab

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/tabs/builtin/HudTab.java:26`

```java
public HudTab()
```

## meteordevelopment.meteorclient.gui.tabs.builtin.HudTab.createScreen

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/tabs/builtin/HudTab.java:30`

```java
@Override public TabScreen createScreen(GuiTheme theme)
```

## meteordevelopment.meteorclient.gui.tabs.builtin.HudTab.isScreen

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/tabs/builtin/HudTab.java:35`

```java
@Override public boolean isScreen(Screen screen)
```

## meteordevelopment.meteorclient.gui.tabs.builtin.HudTab.HudScreen

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/tabs/builtin/HudTab.java:40`

```java
public static class HudScreen extends WindowTabScreen
```

## meteordevelopment.meteorclient.gui.tabs.builtin.HudTab.HudScreen.HudScreen

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/tabs/builtin/HudTab.java:44`

```java
public HudScreen(GuiTheme theme, Tab tab)
```

## meteordevelopment.meteorclient.gui.tabs.builtin.HudTab.HudScreen.initWidgets

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/tabs/builtin/HudTab.java:51`

```java
@Override public void initWidgets()
```

## meteordevelopment.meteorclient.gui.tabs.builtin.HudTab.HudScreen.onRenderBefore

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/tabs/builtin/HudTab.java:78`

```java
@Override protected void onRenderBefore(DrawContext drawContext, float delta)
```

## meteordevelopment.meteorclient.gui.tabs.builtin.HudTab.HudScreen.tick

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/tabs/builtin/HudTab.java:83`

```java
@Override public void tick()
```

## meteordevelopment.meteorclient.gui.tabs.builtin.HudTab.HudScreen.toClipboard

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/tabs/builtin/HudTab.java:90`

```java
@Override public boolean toClipboard()
```

## meteordevelopment.meteorclient.gui.tabs.builtin.HudTab.HudScreen.fromClipboard

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/tabs/builtin/HudTab.java:95`

```java
@Override public boolean fromClipboard()
```

## meteordevelopment.meteorclient.gui.tabs.builtin.MacrosTab

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/tabs/builtin/MacrosTab.java:25`

```java
public class MacrosTab extends Tab
```

## meteordevelopment.meteorclient.gui.tabs.builtin.MacrosTab.MacrosTab

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/tabs/builtin/MacrosTab.java:26`

```java
public MacrosTab()
```

## meteordevelopment.meteorclient.gui.tabs.builtin.MacrosTab.createScreen

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/tabs/builtin/MacrosTab.java:30`

```java
@Override public TabScreen createScreen(GuiTheme theme)
```

## meteordevelopment.meteorclient.gui.tabs.builtin.MacrosTab.isScreen

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/tabs/builtin/MacrosTab.java:35`

```java
@Override public boolean isScreen(Screen screen)
```

## meteordevelopment.meteorclient.gui.tabs.builtin.ModulesTab

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/tabs/builtin/ModulesTab.java:14`

```java
public class ModulesTab extends Tab
```

## meteordevelopment.meteorclient.gui.tabs.builtin.ModulesTab.ModulesTab

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/tabs/builtin/ModulesTab.java:15`

```java
public ModulesTab()
```

## meteordevelopment.meteorclient.gui.tabs.builtin.ModulesTab.createScreen

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/tabs/builtin/ModulesTab.java:19`

```java
@Override public TabScreen createScreen(GuiTheme theme)
```

## meteordevelopment.meteorclient.gui.tabs.builtin.ModulesTab.isScreen

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/tabs/builtin/ModulesTab.java:24`

```java
@Override public boolean isScreen(Screen screen)
```

## meteordevelopment.meteorclient.gui.tabs.builtin.PathManagerTab

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/tabs/builtin/PathManagerTab.java:16`

```java
public class PathManagerTab extends Tab
```

## meteordevelopment.meteorclient.gui.tabs.builtin.PathManagerTab.PathManagerTab

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/tabs/builtin/PathManagerTab.java:17`

```java
public PathManagerTab()
```

## meteordevelopment.meteorclient.gui.tabs.builtin.PathManagerTab.createScreen

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/tabs/builtin/PathManagerTab.java:21`

```java
@Override public TabScreen createScreen(GuiTheme theme)
```

## meteordevelopment.meteorclient.gui.tabs.builtin.PathManagerTab.isScreen

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/tabs/builtin/PathManagerTab.java:26`

```java
@Override public boolean isScreen(Screen screen)
```

## meteordevelopment.meteorclient.gui.tabs.builtin.ProfilesTab

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/tabs/builtin/ProfilesTab.java:49`

```java
public class ProfilesTab extends Tab
```

## meteordevelopment.meteorclient.gui.tabs.builtin.ProfilesTab.ProfilesTab

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/tabs/builtin/ProfilesTab.java:61`

```java
public ProfilesTab()
```

## meteordevelopment.meteorclient.gui.tabs.builtin.ProfilesTab.createScreen

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/tabs/builtin/ProfilesTab.java:65`

```java
@Override public TabScreen createScreen(GuiTheme theme)
```

## meteordevelopment.meteorclient.gui.tabs.builtin.ProfilesTab.isScreen

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/tabs/builtin/ProfilesTab.java:70`

```java
@Override public boolean isScreen(Screen screen)
```

## meteordevelopment.meteorclient.gui.themes.meteor.MeteorGuiTheme

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/MeteorGuiTheme.java:37`

```java
public class MeteorGuiTheme extends GuiTheme
```

## meteordevelopment.meteorclient.gui.themes.meteor.MeteorGuiTheme.scale

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/MeteorGuiTheme.java:50`

```java
public final Setting<Double> scale = sgGeneral.add(new DoubleSetting.Builder() .name("scale") .description("Scale of the GUI.") .defaultValue(1) .min(0.75) .sliderRange(0.75, 4) .onSliderRelease() .onChanged(aDouble -> { if (mc.currentScreen instanceof WidgetScreen) ((WidgetScreen) mc.currentScreen).invalidate(); }) .build() )
```

## meteordevelopment.meteorclient.gui.themes.meteor.MeteorGuiTheme.moduleAlignment

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/MeteorGuiTheme.java:63`

```java
public final Setting<AlignmentX> moduleAlignment = sgGeneral.add(new EnumSetting.Builder<AlignmentX>() .name("module-alignment") .description("How module titles are aligned.") .defaultValue(AlignmentX.Center) .build() )
```

## meteordevelopment.meteorclient.gui.themes.meteor.MeteorGuiTheme.categoryIcons

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/MeteorGuiTheme.java:70`

```java
public final Setting<Boolean> categoryIcons = sgGeneral.add(new BoolSetting.Builder() .name("category-icons") .description("Adds item icons to module categories.") .defaultValue(false) .build() )
```

## meteordevelopment.meteorclient.gui.themes.meteor.MeteorGuiTheme.hideHUD

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/MeteorGuiTheme.java:77`

```java
public final Setting<Boolean> hideHUD = sgGeneral.add(new BoolSetting.Builder() .name("hide-HUD") .description("Hide HUD when in GUI.") .defaultValue(false) .onChanged(v -> { if (mc.currentScreen instanceof WidgetScreen) mc.options.hudHidden = v; }) .build() )
```

## meteordevelopment.meteorclient.gui.themes.meteor.MeteorGuiTheme.accentColor

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/MeteorGuiTheme.java:89`

```java
public final Setting<SettingColor> accentColor = color("accent", "Main color of the GUI.", new SettingColor(145, 61, 226))
```

## meteordevelopment.meteorclient.gui.themes.meteor.MeteorGuiTheme.checkboxColor

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/MeteorGuiTheme.java:90`

```java
public final Setting<SettingColor> checkboxColor = color("checkbox", "Color of checkbox.", new SettingColor(145, 61, 226))
```

## meteordevelopment.meteorclient.gui.themes.meteor.MeteorGuiTheme.plusColor

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/MeteorGuiTheme.java:91`

```java
public final Setting<SettingColor> plusColor = color("plus", "Color of plus button.", new SettingColor(50, 255, 50))
```

## meteordevelopment.meteorclient.gui.themes.meteor.MeteorGuiTheme.minusColor

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/MeteorGuiTheme.java:92`

```java
public final Setting<SettingColor> minusColor = color("minus", "Color of minus button.", new SettingColor(255, 50, 50))
```

## meteordevelopment.meteorclient.gui.themes.meteor.MeteorGuiTheme.favoriteColor

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/MeteorGuiTheme.java:93`

```java
public final Setting<SettingColor> favoriteColor = color("favorite", "Color of checked favorite button.", new SettingColor(250, 215, 0))
```

## meteordevelopment.meteorclient.gui.themes.meteor.MeteorGuiTheme.textColor

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/MeteorGuiTheme.java:97`

```java
public final Setting<SettingColor> textColor = color(sgTextColors, "text", "Color of text.", new SettingColor(255, 255, 255))
```

## meteordevelopment.meteorclient.gui.themes.meteor.MeteorGuiTheme.textSecondaryColor

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/MeteorGuiTheme.java:98`

```java
public final Setting<SettingColor> textSecondaryColor = color(sgTextColors, "text-secondary-text", "Color of secondary text.", new SettingColor(150, 150, 150))
```

## meteordevelopment.meteorclient.gui.themes.meteor.MeteorGuiTheme.textHighlightColor

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/MeteorGuiTheme.java:99`

```java
public final Setting<SettingColor> textHighlightColor = color(sgTextColors, "text-highlight", "Color of text highlighting.", new SettingColor(45, 125, 245, 100))
```

## meteordevelopment.meteorclient.gui.themes.meteor.MeteorGuiTheme.titleTextColor

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/MeteorGuiTheme.java:100`

```java
public final Setting<SettingColor> titleTextColor = color(sgTextColors, "title-text", "Color of title text.", new SettingColor(255, 255, 255))
```

## meteordevelopment.meteorclient.gui.themes.meteor.MeteorGuiTheme.loggedInColor

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/MeteorGuiTheme.java:101`

```java
public final Setting<SettingColor> loggedInColor = color(sgTextColors, "logged-in-text", "Color of logged in account name.", new SettingColor(45, 225, 45))
```

## meteordevelopment.meteorclient.gui.themes.meteor.MeteorGuiTheme.placeholderColor

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/MeteorGuiTheme.java:102`

```java
public final Setting<SettingColor> placeholderColor = color(sgTextColors, "placeholder", "Color of placeholder text.", new SettingColor(255, 255, 255, 20))
```

## meteordevelopment.meteorclient.gui.themes.meteor.MeteorGuiTheme.backgroundColor

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/MeteorGuiTheme.java:106`

```java
public final ThreeStateColorSetting backgroundColor = new ThreeStateColorSetting( sgBackgroundColors, "background", new SettingColor(20, 20, 20, 200), new SettingColor(30, 30, 30, 200), new SettingColor(40, 40, 40, 200) )
```

## meteordevelopment.meteorclient.gui.themes.meteor.MeteorGuiTheme.moduleBackground

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/MeteorGuiTheme.java:114`

```java
public final Setting<SettingColor> moduleBackground = color(sgBackgroundColors, "module-background", "Color of module background when active.", new SettingColor(50, 50, 50))
```

## meteordevelopment.meteorclient.gui.themes.meteor.MeteorGuiTheme.outlineColor

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/MeteorGuiTheme.java:118`

```java
public final ThreeStateColorSetting outlineColor = new ThreeStateColorSetting( sgOutline, "outline", new SettingColor(0, 0, 0), new SettingColor(10, 10, 10), new SettingColor(20, 20, 20) )
```

## meteordevelopment.meteorclient.gui.themes.meteor.MeteorGuiTheme.separatorText

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/MeteorGuiTheme.java:128`

```java
public final Setting<SettingColor> separatorText = color(sgSeparator, "separator-text", "Color of separator text", new SettingColor(255, 255, 255))
```

## meteordevelopment.meteorclient.gui.themes.meteor.MeteorGuiTheme.separatorCenter

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/MeteorGuiTheme.java:129`

```java
public final Setting<SettingColor> separatorCenter = color(sgSeparator, "separator-center", "Center color of separators.", new SettingColor(255, 255, 255))
```

## meteordevelopment.meteorclient.gui.themes.meteor.MeteorGuiTheme.separatorEdges

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/MeteorGuiTheme.java:130`

```java
public final Setting<SettingColor> separatorEdges = color(sgSeparator, "separator-edges", "Color of separator edges.", new SettingColor(225, 225, 225, 150))
```

## meteordevelopment.meteorclient.gui.themes.meteor.MeteorGuiTheme.scrollbarColor

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/MeteorGuiTheme.java:134`

```java
public final ThreeStateColorSetting scrollbarColor = new ThreeStateColorSetting( sgScrollbar, "Scrollbar", new SettingColor(30, 30, 30, 200), new SettingColor(40, 40, 40, 200), new SettingColor(50, 50, 50, 200) )
```

## meteordevelopment.meteorclient.gui.themes.meteor.MeteorGuiTheme.sliderHandle

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/MeteorGuiTheme.java:144`

```java
public final ThreeStateColorSetting sliderHandle = new ThreeStateColorSetting( sgSlider, "slider-handle", new SettingColor(130, 0, 255), new SettingColor(140, 30, 255), new SettingColor(150, 60, 255) )
```

## meteordevelopment.meteorclient.gui.themes.meteor.MeteorGuiTheme.sliderLeft

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/MeteorGuiTheme.java:152`

```java
public final Setting<SettingColor> sliderLeft = color(sgSlider, "slider-left", "Color of slider left part.", new SettingColor(100,35,170))
```

## meteordevelopment.meteorclient.gui.themes.meteor.MeteorGuiTheme.sliderRight

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/MeteorGuiTheme.java:153`

```java
public final Setting<SettingColor> sliderRight = color(sgSlider, "slider-right", "Color of slider right part.", new SettingColor(50, 50, 50))
```

## meteordevelopment.meteorclient.gui.themes.meteor.MeteorGuiTheme.MeteorGuiTheme

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/MeteorGuiTheme.java:168`

```java
public MeteorGuiTheme()
```

## meteordevelopment.meteorclient.gui.themes.meteor.MeteorGuiTheme.window

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/MeteorGuiTheme.java:187`

```java
@Override public WWindow window(WWidget icon, String title)
```

## meteordevelopment.meteorclient.gui.themes.meteor.MeteorGuiTheme.label

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/MeteorGuiTheme.java:192`

```java
@Override public WLabel label(String text, boolean title, double maxWidth)
```

## meteordevelopment.meteorclient.gui.themes.meteor.MeteorGuiTheme.horizontalSeparator

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/MeteorGuiTheme.java:198`

```java
@Override public WHorizontalSeparator horizontalSeparator(String text)
```

## meteordevelopment.meteorclient.gui.themes.meteor.MeteorGuiTheme.verticalSeparator

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/MeteorGuiTheme.java:203`

```java
@Override public WVerticalSeparator verticalSeparator()
```

## meteordevelopment.meteorclient.gui.themes.meteor.MeteorGuiTheme.button

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/MeteorGuiTheme.java:208`

```java
@Override protected WButton button(String text, GuiTexture texture)
```

## meteordevelopment.meteorclient.gui.themes.meteor.MeteorGuiTheme.confirmedButton

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/MeteorGuiTheme.java:213`

```java
@Override protected WConfirmedButton confirmedButton(String text, String confirmText, GuiTexture texture)
```

## meteordevelopment.meteorclient.gui.themes.meteor.MeteorGuiTheme.minus

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/MeteorGuiTheme.java:218`

```java
@Override public WMinus minus()
```

## meteordevelopment.meteorclient.gui.themes.meteor.MeteorGuiTheme.confirmedMinus

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/MeteorGuiTheme.java:223`

```java
@Override public WConfirmedMinus confirmedMinus()
```

## meteordevelopment.meteorclient.gui.themes.meteor.MeteorGuiTheme.plus

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/MeteorGuiTheme.java:228`

```java
@Override public WPlus plus()
```

## meteordevelopment.meteorclient.gui.themes.meteor.MeteorGuiTheme.checkbox

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/MeteorGuiTheme.java:233`

```java
@Override public WCheckbox checkbox(boolean checked)
```

## meteordevelopment.meteorclient.gui.themes.meteor.MeteorGuiTheme.slider

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/MeteorGuiTheme.java:238`

```java
@Override public WSlider slider(double value, double min, double max)
```

## meteordevelopment.meteorclient.gui.themes.meteor.MeteorGuiTheme.textBox

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/MeteorGuiTheme.java:243`

```java
@Override public WTextBox textBox(String text, String placeholder, CharFilter filter, Class<? extends WTextBox.Renderer> renderer)
```

## meteordevelopment.meteorclient.gui.themes.meteor.MeteorGuiTheme.dropdown

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/MeteorGuiTheme.java:248`

```java
@Override public <T> WDropdown<T> dropdown(T[] values, T value)
```

## meteordevelopment.meteorclient.gui.themes.meteor.MeteorGuiTheme.triangle

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/MeteorGuiTheme.java:253`

```java
@Override public WTriangle triangle()
```

## meteordevelopment.meteorclient.gui.themes.meteor.MeteorGuiTheme.tooltip

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/MeteorGuiTheme.java:258`

```java
@Override public WTooltip tooltip(String text)
```

## meteordevelopment.meteorclient.gui.themes.meteor.MeteorGuiTheme.view

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/MeteorGuiTheme.java:263`

```java
@Override public WView view()
```

## meteordevelopment.meteorclient.gui.themes.meteor.MeteorGuiTheme.section

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/MeteorGuiTheme.java:268`

```java
@Override public WSection section(String title, boolean expanded, WWidget headerWidget)
```

## meteordevelopment.meteorclient.gui.themes.meteor.MeteorGuiTheme.account

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/MeteorGuiTheme.java:273`

```java
@Override public WAccount account(WidgetScreen screen, Account<?> account)
```

## meteordevelopment.meteorclient.gui.themes.meteor.MeteorGuiTheme.module

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/MeteorGuiTheme.java:278`

```java
@Override public WWidget module(Module module, String title)
```

## meteordevelopment.meteorclient.gui.themes.meteor.MeteorGuiTheme.quad

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/MeteorGuiTheme.java:283`

```java
@Override public WQuad quad(Color color)
```

## meteordevelopment.meteorclient.gui.themes.meteor.MeteorGuiTheme.topBar

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/MeteorGuiTheme.java:288`

```java
@Override public WTopBar topBar()
```

## meteordevelopment.meteorclient.gui.themes.meteor.MeteorGuiTheme.favorite

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/MeteorGuiTheme.java:293`

```java
@Override public WFavorite favorite(boolean checked)
```

## meteordevelopment.meteorclient.gui.themes.meteor.MeteorGuiTheme.textColor

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/MeteorGuiTheme.java:300`

```java
@Override public Color textColor()
```

## meteordevelopment.meteorclient.gui.themes.meteor.MeteorGuiTheme.textSecondaryColor

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/MeteorGuiTheme.java:305`

```java
@Override public Color textSecondaryColor()
```

## meteordevelopment.meteorclient.gui.themes.meteor.MeteorGuiTheme.starscriptTextColor

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/MeteorGuiTheme.java:312`

```java
@Override public Color starscriptTextColor()
```

## meteordevelopment.meteorclient.gui.themes.meteor.MeteorGuiTheme.starscriptBraceColor

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/MeteorGuiTheme.java:317`

```java
@Override public Color starscriptBraceColor()
```

## meteordevelopment.meteorclient.gui.themes.meteor.MeteorGuiTheme.starscriptParenthesisColor

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/MeteorGuiTheme.java:322`

```java
@Override public Color starscriptParenthesisColor()
```

## meteordevelopment.meteorclient.gui.themes.meteor.MeteorGuiTheme.starscriptDotColor

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/MeteorGuiTheme.java:327`

```java
@Override public Color starscriptDotColor()
```

## meteordevelopment.meteorclient.gui.themes.meteor.MeteorGuiTheme.starscriptCommaColor

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/MeteorGuiTheme.java:332`

```java
@Override public Color starscriptCommaColor()
```

## meteordevelopment.meteorclient.gui.themes.meteor.MeteorGuiTheme.starscriptOperatorColor

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/MeteorGuiTheme.java:337`

```java
@Override public Color starscriptOperatorColor()
```

## meteordevelopment.meteorclient.gui.themes.meteor.MeteorGuiTheme.starscriptStringColor

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/MeteorGuiTheme.java:342`

```java
@Override public Color starscriptStringColor()
```

## meteordevelopment.meteorclient.gui.themes.meteor.MeteorGuiTheme.starscriptNumberColor

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/MeteorGuiTheme.java:347`

```java
@Override public Color starscriptNumberColor()
```

## meteordevelopment.meteorclient.gui.themes.meteor.MeteorGuiTheme.starscriptKeywordColor

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/MeteorGuiTheme.java:352`

```java
@Override public Color starscriptKeywordColor()
```

## meteordevelopment.meteorclient.gui.themes.meteor.MeteorGuiTheme.starscriptAccessedObjectColor

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/MeteorGuiTheme.java:357`

```java
@Override public Color starscriptAccessedObjectColor()
```

## meteordevelopment.meteorclient.gui.themes.meteor.MeteorGuiTheme.textRenderer

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/MeteorGuiTheme.java:364`

```java
@Override public TextRenderer textRenderer()
```

## meteordevelopment.meteorclient.gui.themes.meteor.MeteorGuiTheme.scale

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/MeteorGuiTheme.java:369`

```java
@Override public double scale(double value)
```

## meteordevelopment.meteorclient.gui.themes.meteor.MeteorGuiTheme.categoryIcons

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/MeteorGuiTheme.java:380`

```java
@Override public boolean categoryIcons()
```

## meteordevelopment.meteorclient.gui.themes.meteor.MeteorGuiTheme.hideHUD

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/MeteorGuiTheme.java:385`

```java
@Override public boolean hideHUD()
```

## meteordevelopment.meteorclient.gui.themes.meteor.MeteorGuiTheme.ThreeStateColorSetting

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/MeteorGuiTheme.java:390`

```java
public class ThreeStateColorSetting
```

## meteordevelopment.meteorclient.gui.themes.meteor.MeteorGuiTheme.ThreeStateColorSetting.ThreeStateColorSetting

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/MeteorGuiTheme.java:393`

```java
public ThreeStateColorSetting(SettingGroup group, String name, SettingColor c1, SettingColor c2, SettingColor c3)
```

## meteordevelopment.meteorclient.gui.themes.meteor.MeteorGuiTheme.ThreeStateColorSetting.get

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/MeteorGuiTheme.java:399`

```java
public SettingColor get()
```

## meteordevelopment.meteorclient.gui.themes.meteor.MeteorGuiTheme.ThreeStateColorSetting.get

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/MeteorGuiTheme.java:403`

```java
public SettingColor get(boolean pressed, boolean hovered, boolean bypassDisableHoverColor)
```

## meteordevelopment.meteorclient.gui.themes.meteor.MeteorGuiTheme.ThreeStateColorSetting.get

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/MeteorGuiTheme.java:408`

```java
public SettingColor get(boolean pressed, boolean hovered)
```

## meteordevelopment.meteorclient.gui.themes.meteor.MeteorWidget

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/MeteorWidget.java:13`

```java
public interface MeteorWidget extends BaseWidget
```

## meteordevelopment.meteorclient.gui.themes.meteor.MeteorWidget.theme

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/MeteorWidget.java:14`

```java
default MeteorGuiTheme theme()
```

## meteordevelopment.meteorclient.gui.themes.meteor.MeteorWidget.renderBackground

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/MeteorWidget.java:18`

```java
default void renderBackground(GuiRenderer renderer, WWidget widget, Color outlineColor, Color backgroundColor)
```

## meteordevelopment.meteorclient.gui.themes.meteor.MeteorWidget.renderBackground

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/MeteorWidget.java:30`

```java
default void renderBackground(GuiRenderer renderer, WWidget widget, boolean pressed, boolean mouseOver)
```

## meteordevelopment.meteorclient.gui.themes.meteor.widgets.WMeteorAccount

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/widgets/WMeteorAccount.java:14`

```java
public class WMeteorAccount extends WAccount implements MeteorWidget
```

## meteordevelopment.meteorclient.gui.themes.meteor.widgets.WMeteorAccount.WMeteorAccount

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/widgets/WMeteorAccount.java:15`

```java
public WMeteorAccount(WidgetScreen screen, Account<?> account)
```

## meteordevelopment.meteorclient.gui.themes.meteor.widgets.WMeteorAccount.loggedInColor

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/widgets/WMeteorAccount.java:19`

```java
@Override protected Color loggedInColor()
```

## meteordevelopment.meteorclient.gui.themes.meteor.widgets.WMeteorAccount.accountTypeColor

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/widgets/WMeteorAccount.java:24`

```java
@Override protected Color accountTypeColor()
```

## meteordevelopment.meteorclient.gui.themes.meteor.widgets.WMeteorHorizontalSeparator

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/widgets/WMeteorHorizontalSeparator.java:13`

```java
public class WMeteorHorizontalSeparator extends WHorizontalSeparator implements MeteorWidget
```

## meteordevelopment.meteorclient.gui.themes.meteor.widgets.WMeteorHorizontalSeparator.WMeteorHorizontalSeparator

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/widgets/WMeteorHorizontalSeparator.java:14`

```java
public WMeteorHorizontalSeparator(String text)
```

## meteordevelopment.meteorclient.gui.themes.meteor.widgets.WMeteorHorizontalSeparator.onRender

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/widgets/WMeteorHorizontalSeparator.java:18`

```java
@Override protected void onRender(GuiRenderer renderer, double mouseX, double mouseY, double delta)
```

## meteordevelopment.meteorclient.gui.themes.meteor.widgets.WMeteorLabel

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/widgets/WMeteorLabel.java:12`

```java
public class WMeteorLabel extends WLabel implements MeteorWidget
```

## meteordevelopment.meteorclient.gui.themes.meteor.widgets.WMeteorLabel.WMeteorLabel

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/widgets/WMeteorLabel.java:13`

```java
public WMeteorLabel(String text, boolean title)
```

## meteordevelopment.meteorclient.gui.themes.meteor.widgets.WMeteorLabel.onRender

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/widgets/WMeteorLabel.java:17`

```java
@Override protected void onRender(GuiRenderer renderer, double mouseX, double mouseY, double delta)
```

## meteordevelopment.meteorclient.gui.themes.meteor.widgets.WMeteorModule

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/widgets/WMeteorModule.java:20`

```java
public class WMeteorModule extends WPressable implements MeteorWidget
```

## meteordevelopment.meteorclient.gui.themes.meteor.widgets.WMeteorModule.WMeteorModule

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/widgets/WMeteorModule.java:30`

```java
public WMeteorModule(Module module, String title)
```

## meteordevelopment.meteorclient.gui.themes.meteor.widgets.WMeteorModule.pad

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/widgets/WMeteorModule.java:44`

```java
@Override public double pad()
```

## meteordevelopment.meteorclient.gui.themes.meteor.widgets.WMeteorModule.onCalculateSize

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/widgets/WMeteorModule.java:49`

```java
@Override protected void onCalculateSize()
```

## meteordevelopment.meteorclient.gui.themes.meteor.widgets.WMeteorModule.onPressed

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/widgets/WMeteorModule.java:59`

```java
@Override protected void onPressed(int button)
```

## meteordevelopment.meteorclient.gui.themes.meteor.widgets.WMeteorModule.onRender

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/widgets/WMeteorModule.java:65`

```java
@Override protected void onRender(GuiRenderer renderer, double mouseX, double mouseY, double delta)
```

## meteordevelopment.meteorclient.gui.themes.meteor.widgets.WMeteorMultiLabel

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/widgets/WMeteorMultiLabel.java:13`

```java
public class WMeteorMultiLabel extends WMultiLabel implements MeteorWidget
```

## meteordevelopment.meteorclient.gui.themes.meteor.widgets.WMeteorMultiLabel.WMeteorMultiLabel

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/widgets/WMeteorMultiLabel.java:14`

```java
public WMeteorMultiLabel(String text, boolean title, double maxWidth)
```

## meteordevelopment.meteorclient.gui.themes.meteor.widgets.WMeteorMultiLabel.onRender

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/widgets/WMeteorMultiLabel.java:18`

```java
@Override protected void onRender(GuiRenderer renderer, double mouseX, double mouseY, double delta)
```

## meteordevelopment.meteorclient.gui.themes.meteor.widgets.WMeteorQuad

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/widgets/WMeteorQuad.java:12`

```java
public class WMeteorQuad extends WQuad
```

## meteordevelopment.meteorclient.gui.themes.meteor.widgets.WMeteorQuad.WMeteorQuad

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/widgets/WMeteorQuad.java:13`

```java
public WMeteorQuad(Color color)
```

## meteordevelopment.meteorclient.gui.themes.meteor.widgets.WMeteorQuad.onRender

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/widgets/WMeteorQuad.java:17`

```java
@Override protected void onRender(GuiRenderer renderer, double mouseX, double mouseY, double delta)
```

## meteordevelopment.meteorclient.gui.themes.meteor.widgets.WMeteorSection

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/widgets/WMeteorSection.java:14`

```java
public class WMeteorSection extends WSection
```

## meteordevelopment.meteorclient.gui.themes.meteor.widgets.WMeteorSection.WMeteorSection

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/widgets/WMeteorSection.java:15`

```java
public WMeteorSection(String title, boolean expanded, WWidget headerWidget)
```

## meteordevelopment.meteorclient.gui.themes.meteor.widgets.WMeteorSection.createHeader

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/widgets/WMeteorSection.java:19`

```java
@Override protected WHeader createHeader()
```

## meteordevelopment.meteorclient.gui.themes.meteor.widgets.WMeteorSection.WMeteorHeader

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/widgets/WMeteorSection.java:24`

```java
protected class WMeteorHeader extends WHeader
```

## meteordevelopment.meteorclient.gui.themes.meteor.widgets.WMeteorSection.WMeteorHeader.WMeteorHeader

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/widgets/WMeteorSection.java:27`

```java
public WMeteorHeader(String title)
```

## meteordevelopment.meteorclient.gui.themes.meteor.widgets.WMeteorSection.WMeteorHeader.init

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/widgets/WMeteorSection.java:31`

```java
@Override public void init()
```

## meteordevelopment.meteorclient.gui.themes.meteor.widgets.WMeteorSection.WMeteorHeader.onRender

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/widgets/WMeteorSection.java:44`

```java
@Override protected void onRender(GuiRenderer renderer, double mouseX, double mouseY, double delta)
```

## meteordevelopment.meteorclient.gui.themes.meteor.widgets.WMeteorSection.WHeaderTriangle

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/widgets/WMeteorSection.java:50`

```java
protected static class WHeaderTriangle extends WTriangle implements MeteorWidget
```

## meteordevelopment.meteorclient.gui.themes.meteor.widgets.WMeteorSection.WHeaderTriangle.onRender

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/widgets/WMeteorSection.java:51`

```java
@Override protected void onRender(GuiRenderer renderer, double mouseX, double mouseY, double delta)
```

## meteordevelopment.meteorclient.gui.themes.meteor.widgets.WMeteorTooltip

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/widgets/WMeteorTooltip.java:12`

```java
public class WMeteorTooltip extends WTooltip implements MeteorWidget
```

## meteordevelopment.meteorclient.gui.themes.meteor.widgets.WMeteorTooltip.WMeteorTooltip

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/widgets/WMeteorTooltip.java:13`

```java
public WMeteorTooltip(String text)
```

## meteordevelopment.meteorclient.gui.themes.meteor.widgets.WMeteorTooltip.onRender

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/widgets/WMeteorTooltip.java:17`

```java
@Override protected void onRender(GuiRenderer renderer, double mouseX, double mouseY, double delta)
```

## meteordevelopment.meteorclient.gui.themes.meteor.widgets.WMeteorTopBar

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/widgets/WMeteorTopBar.java:12`

```java
public class WMeteorTopBar extends WTopBar implements MeteorWidget
```

## meteordevelopment.meteorclient.gui.themes.meteor.widgets.WMeteorTopBar.getButtonColor

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/widgets/WMeteorTopBar.java:13`

```java
@Override protected Color getButtonColor(boolean pressed, boolean hovered)
```

## meteordevelopment.meteorclient.gui.themes.meteor.widgets.WMeteorTopBar.getNameColor

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/widgets/WMeteorTopBar.java:18`

```java
@Override protected Color getNameColor()
```

## meteordevelopment.meteorclient.gui.themes.meteor.widgets.WMeteorVerticalSeparator

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/widgets/WMeteorVerticalSeparator.java:14`

```java
public class WMeteorVerticalSeparator extends WVerticalSeparator implements MeteorWidget
```

## meteordevelopment.meteorclient.gui.themes.meteor.widgets.WMeteorVerticalSeparator.onRender

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/widgets/WMeteorVerticalSeparator.java:15`

```java
@Override protected void onRender(GuiRenderer renderer, double mouseX, double mouseY, double delta)
```

## meteordevelopment.meteorclient.gui.themes.meteor.widgets.WMeteorView

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/widgets/WMeteorView.java:12`

```java
public class WMeteorView extends WView implements MeteorWidget
```

## meteordevelopment.meteorclient.gui.themes.meteor.widgets.WMeteorView.onRender

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/widgets/WMeteorView.java:13`

```java
@Override protected void onRender(GuiRenderer renderer, double mouseX, double mouseY, double delta)
```

## meteordevelopment.meteorclient.gui.themes.meteor.widgets.WMeteorWindow

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/widgets/WMeteorWindow.java:13`

```java
public class WMeteorWindow extends WWindow implements MeteorWidget
```

## meteordevelopment.meteorclient.gui.themes.meteor.widgets.WMeteorWindow.WMeteorWindow

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/widgets/WMeteorWindow.java:14`

```java
public WMeteorWindow(WWidget icon, String title)
```

## meteordevelopment.meteorclient.gui.themes.meteor.widgets.WMeteorWindow.header

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/widgets/WMeteorWindow.java:18`

```java
@Override protected WHeader header(WWidget icon)
```

## meteordevelopment.meteorclient.gui.themes.meteor.widgets.WMeteorWindow.onRender

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/widgets/WMeteorWindow.java:23`

```java
@Override protected void onRender(GuiRenderer renderer, double mouseX, double mouseY, double delta)
```

## meteordevelopment.meteorclient.gui.themes.meteor.widgets.input.WMeteorDropdown

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/widgets/input/WMeteorDropdown.java:14`

```java
public class WMeteorDropdown<T> extends WDropdown<T> implements MeteorWidget
```

## meteordevelopment.meteorclient.gui.themes.meteor.widgets.input.WMeteorDropdown.WMeteorDropdown

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/widgets/input/WMeteorDropdown.java:15`

```java
public WMeteorDropdown(T[] values, T value)
```

## meteordevelopment.meteorclient.gui.themes.meteor.widgets.input.WMeteorDropdown.createRootWidget

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/widgets/input/WMeteorDropdown.java:19`

```java
@Override protected WDropdownRoot createRootWidget()
```

## meteordevelopment.meteorclient.gui.themes.meteor.widgets.input.WMeteorDropdown.createValueWidget

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/widgets/input/WMeteorDropdown.java:24`

```java
@Override protected WDropdownValue createValueWidget()
```

## meteordevelopment.meteorclient.gui.themes.meteor.widgets.input.WMeteorDropdown.onRender

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/widgets/input/WMeteorDropdown.java:29`

```java
@Override protected void onRender(GuiRenderer renderer, double mouseX, double mouseY, double delta)
```

## meteordevelopment.meteorclient.gui.themes.meteor.widgets.input.WMeteorSlider

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/widgets/input/WMeteorSlider.java:13`

```java
public class WMeteorSlider extends WSlider implements MeteorWidget
```

## meteordevelopment.meteorclient.gui.themes.meteor.widgets.input.WMeteorSlider.WMeteorSlider

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/widgets/input/WMeteorSlider.java:14`

```java
public WMeteorSlider(double value, double min, double max)
```

## meteordevelopment.meteorclient.gui.themes.meteor.widgets.input.WMeteorSlider.onRender

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/widgets/input/WMeteorSlider.java:18`

```java
@Override protected void onRender(GuiRenderer renderer, double mouseX, double mouseY, double delta)
```

## meteordevelopment.meteorclient.gui.themes.meteor.widgets.input.WMeteorTextBox

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/widgets/input/WMeteorTextBox.java:20`

```java
public class WMeteorTextBox extends WTextBox implements MeteorWidget
```

## meteordevelopment.meteorclient.gui.themes.meteor.widgets.input.WMeteorTextBox.WMeteorTextBox

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/widgets/input/WMeteorTextBox.java:26`

```java
public WMeteorTextBox(String text, String placeholder, CharFilter filter, Class<? extends Renderer> renderer)
```

## meteordevelopment.meteorclient.gui.themes.meteor.widgets.input.WMeteorTextBox.createCompletionsRootWidget

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/widgets/input/WMeteorTextBox.java:30`

```java
@Override protected WContainer createCompletionsRootWidget()
```

## meteordevelopment.meteorclient.gui.themes.meteor.widgets.input.WMeteorTextBox.createCompletionsValueWidth

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/widgets/input/WMeteorTextBox.java:53`

```java
@SuppressWarnings("unchecked") @Override protected <T extends WWidget & ICompletionItem> T createCompletionsValueWidth(String completion, boolean selected)
```

## meteordevelopment.meteorclient.gui.themes.meteor.widgets.input.WMeteorTextBox.onCursorChanged

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/widgets/input/WMeteorTextBox.java:92`

```java
@Override protected void onCursorChanged()
```

## meteordevelopment.meteorclient.gui.themes.meteor.widgets.input.WMeteorTextBox.onRender

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/widgets/input/WMeteorTextBox.java:98`

```java
@Override protected void onRender(GuiRenderer renderer, double mouseX, double mouseY, double delta)
```

## meteordevelopment.meteorclient.gui.themes.meteor.widgets.pressable.WMeteorButton

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/widgets/pressable/WMeteorButton.java:14`

```java
public class WMeteorButton extends WButton implements MeteorWidget
```

## meteordevelopment.meteorclient.gui.themes.meteor.widgets.pressable.WMeteorButton.WMeteorButton

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/widgets/pressable/WMeteorButton.java:15`

```java
public WMeteorButton(String text, GuiTexture texture)
```

## meteordevelopment.meteorclient.gui.themes.meteor.widgets.pressable.WMeteorButton.onRender

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/widgets/pressable/WMeteorButton.java:19`

```java
@Override protected void onRender(GuiRenderer renderer, double mouseX, double mouseY, double delta)
```

## meteordevelopment.meteorclient.gui.themes.meteor.widgets.pressable.WMeteorCheckbox

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/widgets/pressable/WMeteorCheckbox.java:14`

```java
public class WMeteorCheckbox extends WCheckbox implements MeteorWidget
```

## meteordevelopment.meteorclient.gui.themes.meteor.widgets.pressable.WMeteorCheckbox.WMeteorCheckbox

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/widgets/pressable/WMeteorCheckbox.java:17`

```java
public WMeteorCheckbox(boolean checked)
```

## meteordevelopment.meteorclient.gui.themes.meteor.widgets.pressable.WMeteorCheckbox.onRender

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/widgets/pressable/WMeteorCheckbox.java:22`

```java
@Override protected void onRender(GuiRenderer renderer, double mouseX, double mouseY, double delta)
```

## meteordevelopment.meteorclient.gui.themes.meteor.widgets.pressable.WMeteorConfirmedButton

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/widgets/pressable/WMeteorConfirmedButton.java:16`

```java
public class WMeteorConfirmedButton extends WConfirmedButton implements MeteorWidget
```

## meteordevelopment.meteorclient.gui.themes.meteor.widgets.pressable.WMeteorConfirmedButton.WMeteorConfirmedButton

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/widgets/pressable/WMeteorConfirmedButton.java:17`

```java
public WMeteorConfirmedButton(String text, String confirmText, GuiTexture texture)
```

## meteordevelopment.meteorclient.gui.themes.meteor.widgets.pressable.WMeteorConfirmedButton.onRender

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/widgets/pressable/WMeteorConfirmedButton.java:21`

```java
@Override protected void onRender(GuiRenderer renderer, double mouseX, double mouseY, double delta)
```

## meteordevelopment.meteorclient.gui.themes.meteor.widgets.pressable.WMeteorConfirmedMinus

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/widgets/pressable/WMeteorConfirmedMinus.java:14`

```java
public class WMeteorConfirmedMinus extends WConfirmedMinus implements MeteorWidget
```

## meteordevelopment.meteorclient.gui.themes.meteor.widgets.pressable.WMeteorConfirmedMinus.onRender

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/widgets/pressable/WMeteorConfirmedMinus.java:15`

```java
@Override protected void onRender(GuiRenderer renderer, double mouseX, double mouseY, double delta)
```

## meteordevelopment.meteorclient.gui.themes.meteor.widgets.pressable.WMeteorFavorite

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/widgets/pressable/WMeteorFavorite.java:12`

```java
public class WMeteorFavorite extends WFavorite implements MeteorWidget
```

## meteordevelopment.meteorclient.gui.themes.meteor.widgets.pressable.WMeteorFavorite.WMeteorFavorite

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/widgets/pressable/WMeteorFavorite.java:13`

```java
public WMeteorFavorite(boolean checked)
```

## meteordevelopment.meteorclient.gui.themes.meteor.widgets.pressable.WMeteorFavorite.getColor

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/widgets/pressable/WMeteorFavorite.java:17`

```java
@Override protected Color getColor()
```

## meteordevelopment.meteorclient.gui.themes.meteor.widgets.pressable.WMeteorMinus

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/widgets/pressable/WMeteorMinus.java:12`

```java
public class WMeteorMinus extends WMinus implements MeteorWidget
```

## meteordevelopment.meteorclient.gui.themes.meteor.widgets.pressable.WMeteorMinus.onRender

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/widgets/pressable/WMeteorMinus.java:13`

```java
@Override protected void onRender(GuiRenderer renderer, double mouseX, double mouseY, double delta)
```

## meteordevelopment.meteorclient.gui.themes.meteor.widgets.pressable.WMeteorPlus

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/widgets/pressable/WMeteorPlus.java:13`

```java
public class WMeteorPlus extends WPlus implements MeteorWidget
```

## meteordevelopment.meteorclient.gui.themes.meteor.widgets.pressable.WMeteorPlus.onRender

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/widgets/pressable/WMeteorPlus.java:14`

```java
@Override protected void onRender(GuiRenderer renderer, double mouseX, double mouseY, double delta)
```

## meteordevelopment.meteorclient.gui.themes.meteor.widgets.pressable.WMeteorTriangle

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/widgets/pressable/WMeteorTriangle.java:12`

```java
public class WMeteorTriangle extends WTriangle implements MeteorWidget
```

## meteordevelopment.meteorclient.gui.themes.meteor.widgets.pressable.WMeteorTriangle.onRender

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/themes/meteor/widgets/pressable/WMeteorTriangle.java:13`

```java
@Override protected void onRender(GuiRenderer renderer, double mouseX, double mouseY, double delta)
```

## meteordevelopment.meteorclient.gui.utils.AlignmentX

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/utils/AlignmentX.java:8`

```java
public enum AlignmentX
```

## meteordevelopment.meteorclient.gui.utils.AlignmentY

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/utils/AlignmentY.java:8`

```java
public enum AlignmentY
```

## meteordevelopment.meteorclient.gui.utils.BaseWidget

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/utils/BaseWidget.java:10`

```java
public interface BaseWidget
```

## meteordevelopment.meteorclient.gui.utils.BaseWidget.getTheme

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/utils/BaseWidget.java:11`

```java
GuiTheme getTheme()
```

## meteordevelopment.meteorclient.gui.utils.Cell

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/utils/Cell.java:11`

```java
public class Cell<T extends WWidget>
```

## meteordevelopment.meteorclient.gui.utils.Cell.x

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/utils/Cell.java:14`

```java
public double x, y
```

## meteordevelopment.meteorclient.gui.utils.Cell.y

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/utils/Cell.java:14`

```java
public double x, y
```

## meteordevelopment.meteorclient.gui.utils.Cell.width

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/utils/Cell.java:15`

```java
public double width, height
```

## meteordevelopment.meteorclient.gui.utils.Cell.height

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/utils/Cell.java:15`

```java
public double width, height
```

## meteordevelopment.meteorclient.gui.utils.Cell.expandCellX

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/utils/Cell.java:26`

```java
public boolean expandCellX
```

## meteordevelopment.meteorclient.gui.utils.Cell.group

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/utils/Cell.java:28`

```java
public @Nullable String group
```

## meteordevelopment.meteorclient.gui.utils.Cell.Cell

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/utils/Cell.java:30`

```java
public Cell(T widget)
```

## meteordevelopment.meteorclient.gui.utils.Cell.widget

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/utils/Cell.java:34`

```java
public T widget()
```

## meteordevelopment.meteorclient.gui.utils.Cell.move

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/utils/Cell.java:38`

```java
public void move(double deltaX, double deltaY)
```

## meteordevelopment.meteorclient.gui.utils.Cell.minWidth

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/utils/Cell.java:45`

```java
public Cell<T> minWidth(double width)
```

## meteordevelopment.meteorclient.gui.utils.Cell.centerX

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/utils/Cell.java:52`

```java
public Cell<T> centerX()
```

## meteordevelopment.meteorclient.gui.utils.Cell.right

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/utils/Cell.java:57`

```java
public Cell<T> right()
```

## meteordevelopment.meteorclient.gui.utils.Cell.centerY

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/utils/Cell.java:62`

```java
public Cell<T> centerY()
```

## meteordevelopment.meteorclient.gui.utils.Cell.bottom

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/utils/Cell.java:67`

```java
public Cell<T> bottom()
```

## meteordevelopment.meteorclient.gui.utils.Cell.center

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/utils/Cell.java:72`

```java
public Cell<T> center()
```

## meteordevelopment.meteorclient.gui.utils.Cell.top

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/utils/Cell.java:78`

```java
public Cell<T> top()
```

## meteordevelopment.meteorclient.gui.utils.Cell.padTop

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/utils/Cell.java:85`

```java
public Cell<T> padTop(double pad)
```

## meteordevelopment.meteorclient.gui.utils.Cell.padRight

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/utils/Cell.java:89`

```java
public Cell<T> padRight(double pad)
```

## meteordevelopment.meteorclient.gui.utils.Cell.padBottom

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/utils/Cell.java:93`

```java
public Cell<T> padBottom(double pad)
```

## meteordevelopment.meteorclient.gui.utils.Cell.padLeft

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/utils/Cell.java:97`

```java
public Cell<T> padLeft(double pad)
```

## meteordevelopment.meteorclient.gui.utils.Cell.padHorizontal

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/utils/Cell.java:102`

```java
public Cell<T> padHorizontal(double pad)
```

## meteordevelopment.meteorclient.gui.utils.Cell.padVertical

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/utils/Cell.java:106`

```java
public Cell<T> padVertical(double pad)
```

## meteordevelopment.meteorclient.gui.utils.Cell.pad

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/utils/Cell.java:110`

```java
public Cell<T> pad(double pad)
```

## meteordevelopment.meteorclient.gui.utils.Cell.padTop

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/utils/Cell.java:115`

```java
public double padTop()
```

## meteordevelopment.meteorclient.gui.utils.Cell.padRight

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/utils/Cell.java:118`

```java
public double padRight()
```

## meteordevelopment.meteorclient.gui.utils.Cell.padBottom

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/utils/Cell.java:121`

```java
public double padBottom()
```

## meteordevelopment.meteorclient.gui.utils.Cell.padLeft

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/utils/Cell.java:124`

```java
public double padLeft()
```

## meteordevelopment.meteorclient.gui.utils.Cell.marginTop

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/utils/Cell.java:130`

```java
public Cell<T> marginTop(double m)
```

## meteordevelopment.meteorclient.gui.utils.Cell.expandWidgetX

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/utils/Cell.java:137`

```java
public Cell<T> expandWidgetX()
```

## meteordevelopment.meteorclient.gui.utils.Cell.expandWidgetY

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/utils/Cell.java:142`

```java
public Cell<T> expandWidgetY()
```

## meteordevelopment.meteorclient.gui.utils.Cell.expandCellX

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/utils/Cell.java:147`

```java
public Cell<T> expandCellX()
```

## meteordevelopment.meteorclient.gui.utils.Cell.expandX

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/utils/Cell.java:152`

```java
public Cell<T> expandX()
```

## meteordevelopment.meteorclient.gui.utils.Cell.group

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/utils/Cell.java:161`

```java
public Cell<T> group(String group)
```

## meteordevelopment.meteorclient.gui.utils.Cell.alignWidget

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/utils/Cell.java:166`

```java
public void alignWidget()
```

## meteordevelopment.meteorclient.gui.utils.CharFilter

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/utils/CharFilter.java:8`

```java
public interface CharFilter
```

## meteordevelopment.meteorclient.gui.utils.CharFilter.filter

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/utils/CharFilter.java:9`

```java
boolean filter(String text, char c)
```

## meteordevelopment.meteorclient.gui.utils.CharFilter.filter

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/utils/CharFilter.java:11`

```java
default boolean filter(String text, int i)
```

## meteordevelopment.meteorclient.gui.utils.SettingsWidgetFactory

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/utils/SettingsWidgetFactory.java:18`

```java
public abstract class SettingsWidgetFactory
```

## meteordevelopment.meteorclient.gui.utils.SettingsWidgetFactory.theme

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/utils/SettingsWidgetFactory.java:21`

```java
protected final GuiTheme theme
```

## meteordevelopment.meteorclient.gui.utils.SettingsWidgetFactory.factories

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/utils/SettingsWidgetFactory.java:22`

```java
protected final Map<Class<?>, Factory> factories = new HashMap<>()
```

## meteordevelopment.meteorclient.gui.utils.SettingsWidgetFactory.SettingsWidgetFactory

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/utils/SettingsWidgetFactory.java:24`

```java
public SettingsWidgetFactory(GuiTheme theme)
```

## meteordevelopment.meteorclient.gui.utils.SettingsWidgetFactory.registerCustomFactory

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/utils/SettingsWidgetFactory.java:29`

```java
public static void registerCustomFactory(Class<?> settingClass, Function<GuiTheme, Factory> factoryFunction)
```

## meteordevelopment.meteorclient.gui.utils.SettingsWidgetFactory.unregisterCustomFactory

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/utils/SettingsWidgetFactory.java:33`

```java
public static void unregisterCustomFactory(Class<?> settingClass)
```

## meteordevelopment.meteorclient.gui.utils.SettingsWidgetFactory.create

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/utils/SettingsWidgetFactory.java:37`

```java
public abstract WWidget create(GuiTheme theme, Settings settings, String filter)
```

## meteordevelopment.meteorclient.gui.utils.SettingsWidgetFactory.getFactory

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/utils/SettingsWidgetFactory.java:39`

```java
protected Factory getFactory(Class<?> settingClass)
```

## meteordevelopment.meteorclient.gui.utils.SettingsWidgetFactory.Factory

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/utils/SettingsWidgetFactory.java:44`

```java
@FunctionalInterface public interface Factory
```

## meteordevelopment.meteorclient.gui.utils.SettingsWidgetFactory.Factory.create

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/utils/SettingsWidgetFactory.java:46`

```java
void create(WTable table, Setting<?> setting)
```

## meteordevelopment.meteorclient.gui.utils.StarscriptTextBoxRenderer

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/utils/StarscriptTextBoxRenderer.java:21`

```java
public class StarscriptTextBoxRenderer implements WTextBox.Renderer
```

## meteordevelopment.meteorclient.gui.utils.StarscriptTextBoxRenderer.render

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/utils/StarscriptTextBoxRenderer.java:29`

```java
@Override public void render(GuiRenderer renderer, double x, double y, String text, Color color)
```

## meteordevelopment.meteorclient.gui.utils.StarscriptTextBoxRenderer.getCompletions

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/utils/StarscriptTextBoxRenderer.java:46`

```java
@Override public List<String> getCompletions(String text, int position)
```

## meteordevelopment.meteorclient.gui.utils.WindowConfig

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/utils/WindowConfig.java:11`

```java
public class WindowConfig implements ISerializable<WindowConfig>
```

## meteordevelopment.meteorclient.gui.utils.WindowConfig.expanded

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/utils/WindowConfig.java:12`

```java
public boolean expanded = true
```

## meteordevelopment.meteorclient.gui.utils.WindowConfig.x

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/utils/WindowConfig.java:13`

```java
public double x = -1
```

## meteordevelopment.meteorclient.gui.utils.WindowConfig.y

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/utils/WindowConfig.java:14`

```java
public double y = -1
```

## meteordevelopment.meteorclient.gui.utils.WindowConfig.toTag

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/utils/WindowConfig.java:18`

```java
@Override public NbtCompound toTag()
```

## meteordevelopment.meteorclient.gui.utils.WindowConfig.fromTag

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/utils/WindowConfig.java:29`

```java
@Override public WindowConfig fromTag(NbtCompound tag)
```

## meteordevelopment.meteorclient.gui.widgets.WAccount

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/WAccount.java:21`

```java
public abstract class WAccount extends WHorizontalList
```

## meteordevelopment.meteorclient.gui.widgets.WAccount.refreshScreenAction

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/WAccount.java:22`

```java
public Runnable refreshScreenAction
```

## meteordevelopment.meteorclient.gui.widgets.WAccount.WAccount

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/WAccount.java:26`

```java
public WAccount(WidgetScreen screen, Account<?> account)
```

## meteordevelopment.meteorclient.gui.widgets.WAccount.loggedInColor

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/WAccount.java:31`

```java
protected abstract Color loggedInColor()
```

## meteordevelopment.meteorclient.gui.widgets.WAccount.accountTypeColor

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/WAccount.java:32`

```java
protected abstract Color accountTypeColor()
```

## meteordevelopment.meteorclient.gui.widgets.WAccount.init

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/WAccount.java:34`

```java
@Override public void init()
```

## meteordevelopment.meteorclient.gui.widgets.WHorizontalSeparator

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/WHorizontalSeparator.java:8`

```java
public abstract class WHorizontalSeparator extends WWidget
```

## meteordevelopment.meteorclient.gui.widgets.WHorizontalSeparator.text

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/WHorizontalSeparator.java:9`

```java
protected String text
```

## meteordevelopment.meteorclient.gui.widgets.WHorizontalSeparator.textWidth

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/WHorizontalSeparator.java:10`

```java
protected double textWidth
```

## meteordevelopment.meteorclient.gui.widgets.WHorizontalSeparator.WHorizontalSeparator

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/WHorizontalSeparator.java:12`

```java
public WHorizontalSeparator(String text)
```

## meteordevelopment.meteorclient.gui.widgets.WHorizontalSeparator.onCalculateSize

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/WHorizontalSeparator.java:16`

```java
@Override protected void onCalculateSize()
```

## meteordevelopment.meteorclient.gui.widgets.WItem

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/WItem.java:11`

```java
public class WItem extends WWidget
```

## meteordevelopment.meteorclient.gui.widgets.WItem.itemStack

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/WItem.java:12`

```java
protected ItemStack itemStack
```

## meteordevelopment.meteorclient.gui.widgets.WItem.WItem

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/WItem.java:14`

```java
public WItem(ItemStack itemStack)
```

## meteordevelopment.meteorclient.gui.widgets.WItem.onCalculateSize

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/WItem.java:18`

```java
@Override protected void onCalculateSize()
```

## meteordevelopment.meteorclient.gui.widgets.WItem.onRender

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/WItem.java:26`

```java
@Override protected void onRender(GuiRenderer renderer, double mouseX, double mouseY, double delta)
```

## meteordevelopment.meteorclient.gui.widgets.WItem.set

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/WItem.java:36`

```java
public void set(ItemStack itemStack)
```

## meteordevelopment.meteorclient.gui.widgets.WItemWithLabel

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/WItemWithLabel.java:20`

```java
public class WItemWithLabel extends WHorizontalList
```

## meteordevelopment.meteorclient.gui.widgets.WItemWithLabel.WItemWithLabel

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/WItemWithLabel.java:27`

```java
public WItemWithLabel(ItemStack itemStack, String name)
```

## meteordevelopment.meteorclient.gui.widgets.WItemWithLabel.init

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/WItemWithLabel.java:32`

```java
@Override public void init()
```

## meteordevelopment.meteorclient.gui.widgets.WItemWithLabel.set

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/WItemWithLabel.java:56`

```java
public void set(ItemStack itemStack)
```

## meteordevelopment.meteorclient.gui.widgets.WItemWithLabel.getLabelText

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/WItemWithLabel.java:64`

```java
public String getLabelText()
```

## meteordevelopment.meteorclient.gui.widgets.WKeybind

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/WKeybind.java:13`

```java
public class WKeybind extends WHorizontalList
```

## meteordevelopment.meteorclient.gui.widgets.WKeybind.action

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/WKeybind.java:14`

```java
public Runnable action
```

## meteordevelopment.meteorclient.gui.widgets.WKeybind.actionOnSet

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/WKeybind.java:15`

```java
public Runnable actionOnSet
```

## meteordevelopment.meteorclient.gui.widgets.WKeybind.WKeybind

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/WKeybind.java:23`

```java
public WKeybind(Keybind keybind, Keybind defaultValue)
```

## meteordevelopment.meteorclient.gui.widgets.WKeybind.init

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/WKeybind.java:28`

```java
@Override public void init()
```

## meteordevelopment.meteorclient.gui.widgets.WKeybind.onClear

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/WKeybind.java:41`

```java
public boolean onClear()
```

## meteordevelopment.meteorclient.gui.widgets.WKeybind.onAction

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/WKeybind.java:52`

```java
public boolean onAction(boolean isKey, int value, int modifiers)
```

## meteordevelopment.meteorclient.gui.widgets.WKeybind.resetBind

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/WKeybind.java:63`

```java
public void resetBind()
```

## meteordevelopment.meteorclient.gui.widgets.WKeybind.reset

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/WKeybind.java:68`

```java
public void reset()
```

## meteordevelopment.meteorclient.gui.widgets.WLabel

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/WLabel.java:12`

```java
public abstract class WLabel extends WPressable
```

## meteordevelopment.meteorclient.gui.widgets.WLabel.color

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/WLabel.java:13`

```java
public Color color
```

## meteordevelopment.meteorclient.gui.widgets.WLabel.text

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/WLabel.java:15`

```java
protected String text
```

## meteordevelopment.meteorclient.gui.widgets.WLabel.title

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/WLabel.java:16`

```java
protected boolean title
```

## meteordevelopment.meteorclient.gui.widgets.WLabel.WLabel

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/WLabel.java:18`

```java
public WLabel(String text, boolean title)
```

## meteordevelopment.meteorclient.gui.widgets.WLabel.onCalculateSize

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/WLabel.java:23`

```java
@Override protected void onCalculateSize()
```

## meteordevelopment.meteorclient.gui.widgets.WLabel.onMouseClicked

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/WLabel.java:29`

```java
@Override public boolean onMouseClicked(Click click, boolean doubled)
```

## meteordevelopment.meteorclient.gui.widgets.WLabel.onMouseReleased

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/WLabel.java:35`

```java
@Override public boolean onMouseReleased(Click click)
```

## meteordevelopment.meteorclient.gui.widgets.WLabel.set

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/WLabel.java:41`

```java
public void set(String text)
```

## meteordevelopment.meteorclient.gui.widgets.WLabel.get

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/WLabel.java:47`

```java
public String get()
```

## meteordevelopment.meteorclient.gui.widgets.WLabel.color

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/WLabel.java:51`

```java
public WLabel color(Color color)
```

## meteordevelopment.meteorclient.gui.widgets.WMultiLabel

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/WMultiLabel.java:11`

```java
public abstract class WMultiLabel extends WLabel
```

## meteordevelopment.meteorclient.gui.widgets.WMultiLabel.lines

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/WMultiLabel.java:12`

```java
protected List<String> lines = new ArrayList<>(2)
```

## meteordevelopment.meteorclient.gui.widgets.WMultiLabel.maxWidth

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/WMultiLabel.java:14`

```java
protected double maxWidth
```

## meteordevelopment.meteorclient.gui.widgets.WMultiLabel.WMultiLabel

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/WMultiLabel.java:16`

```java
public WMultiLabel(String text, boolean title, double maxWidth)
```

## meteordevelopment.meteorclient.gui.widgets.WMultiLabel.onCalculateSize

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/WMultiLabel.java:22`

```java
@Override protected void onCalculateSize()
```

## meteordevelopment.meteorclient.gui.widgets.WMultiLabel.set

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/WMultiLabel.java:85`

```java
@Override public void set(String text)
```

## meteordevelopment.meteorclient.gui.widgets.WQuad

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/WQuad.java:10`

```java
public abstract class WQuad extends WWidget
```

## meteordevelopment.meteorclient.gui.widgets.WQuad.color

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/WQuad.java:11`

```java
public Color color
```

## meteordevelopment.meteorclient.gui.widgets.WQuad.WQuad

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/WQuad.java:13`

```java
public WQuad(Color color)
```

## meteordevelopment.meteorclient.gui.widgets.WQuad.onCalculateSize

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/WQuad.java:17`

```java
@Override protected void onCalculateSize()
```

## meteordevelopment.meteorclient.gui.widgets.WRoot

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/WRoot.java:8`

```java
public interface WRoot
```

## meteordevelopment.meteorclient.gui.widgets.WTexture

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/WTexture.java:11`

```java
public class WTexture extends WWidget
```

## meteordevelopment.meteorclient.gui.widgets.WTexture.WTexture

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/WTexture.java:16`

```java
public WTexture(double width, double height, double rotation, Texture texture)
```

## meteordevelopment.meteorclient.gui.widgets.WTexture.onCalculateSize

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/WTexture.java:23`

```java
@Override protected void onCalculateSize()
```

## meteordevelopment.meteorclient.gui.widgets.WTexture.onRender

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/WTexture.java:29`

```java
@Override protected void onRender(GuiRenderer renderer, double mouseX, double mouseY, double delta)
```

## meteordevelopment.meteorclient.gui.widgets.WTooltip

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/WTooltip.java:11`

```java
public abstract class WTooltip extends WContainer implements WRoot
```

## meteordevelopment.meteorclient.gui.widgets.WTooltip.text

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/WTooltip.java:14`

```java
protected String text
```

## meteordevelopment.meteorclient.gui.widgets.WTooltip.WTooltip

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/WTooltip.java:16`

```java
public WTooltip(String text)
```

## meteordevelopment.meteorclient.gui.widgets.WTooltip.init

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/WTooltip.java:20`

```java
@Override public void init()
```

## meteordevelopment.meteorclient.gui.widgets.WTooltip.invalidate

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/WTooltip.java:25`

```java
@Override public void invalidate()
```

## meteordevelopment.meteorclient.gui.widgets.WTooltip.render

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/WTooltip.java:30`

```java
@Override public boolean render(GuiRenderer renderer, double mouseX, double mouseY, double delta)
```

## meteordevelopment.meteorclient.gui.widgets.WTopBar

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/WTopBar.java:20`

```java
public abstract class WTopBar extends WHorizontalList
```

## meteordevelopment.meteorclient.gui.widgets.WTopBar.getButtonColor

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/WTopBar.java:21`

```java
protected abstract Color getButtonColor(boolean pressed, boolean hovered)
```

## meteordevelopment.meteorclient.gui.widgets.WTopBar.getNameColor

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/WTopBar.java:23`

```java
protected abstract Color getNameColor()
```

## meteordevelopment.meteorclient.gui.widgets.WTopBar.WTopBar

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/WTopBar.java:25`

```java
public WTopBar()
```

## meteordevelopment.meteorclient.gui.widgets.WTopBar.init

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/WTopBar.java:29`

```java
@Override public void init()
```

## meteordevelopment.meteorclient.gui.widgets.WTopBar.WTopBarButton

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/WTopBar.java:36`

```java
protected class WTopBarButton extends WPressable
```

## meteordevelopment.meteorclient.gui.widgets.WTopBar.WTopBarButton.WTopBarButton

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/WTopBar.java:39`

```java
public WTopBarButton(Tab tab)
```

## meteordevelopment.meteorclient.gui.widgets.WTopBar.WTopBarButton.onCalculateSize

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/WTopBar.java:43`

```java
@Override protected void onCalculateSize()
```

## meteordevelopment.meteorclient.gui.widgets.WTopBar.WTopBarButton.onPressed

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/WTopBar.java:51`

```java
@Override protected void onPressed(int button)
```

## meteordevelopment.meteorclient.gui.widgets.WTopBar.WTopBarButton.onRender

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/WTopBar.java:64`

```java
@Override protected void onRender(GuiRenderer renderer, double mouseX, double mouseY, double delta)
```

## meteordevelopment.meteorclient.gui.widgets.WVerticalSeparator

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/WVerticalSeparator.java:8`

```java
public class WVerticalSeparator extends WWidget
```

## meteordevelopment.meteorclient.gui.widgets.WVerticalSeparator.onCalculateSize

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/WVerticalSeparator.java:9`

```java
@Override protected void onCalculateSize()
```

## meteordevelopment.meteorclient.gui.widgets.WWidget

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/WWidget.java:16`

```java
public abstract class WWidget implements BaseWidget
```

## meteordevelopment.meteorclient.gui.widgets.WWidget.visible

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/WWidget.java:17`

```java
public boolean visible = true
```

## meteordevelopment.meteorclient.gui.widgets.WWidget.theme

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/WWidget.java:18`

```java
public GuiTheme theme
```

## meteordevelopment.meteorclient.gui.widgets.WWidget.x

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/WWidget.java:20`

```java
public double x, y
```

## meteordevelopment.meteorclient.gui.widgets.WWidget.y

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/WWidget.java:20`

```java
public double x, y
```

## meteordevelopment.meteorclient.gui.widgets.WWidget.width

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/WWidget.java:21`

```java
public double width, height
```

## meteordevelopment.meteorclient.gui.widgets.WWidget.height

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/WWidget.java:21`

```java
public double width, height
```

## meteordevelopment.meteorclient.gui.widgets.WWidget.minWidth

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/WWidget.java:22`

```java
public double minWidth
```

## meteordevelopment.meteorclient.gui.widgets.WWidget.parent

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/WWidget.java:24`

```java
public WWidget parent
```

## meteordevelopment.meteorclient.gui.widgets.WWidget.tooltip

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/WWidget.java:25`

```java
public String tooltip
```

## meteordevelopment.meteorclient.gui.widgets.WWidget.mouseOver

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/WWidget.java:27`

```java
public boolean mouseOver
```

## meteordevelopment.meteorclient.gui.widgets.WWidget.focused

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/WWidget.java:28`

```java
public boolean focused
```

## meteordevelopment.meteorclient.gui.widgets.WWidget.instantTooltips

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/WWidget.java:29`

```java
protected boolean instantTooltips
```

## meteordevelopment.meteorclient.gui.widgets.WWidget.mouseOverTimer

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/WWidget.java:30`

```java
protected double mouseOverTimer
```

## meteordevelopment.meteorclient.gui.widgets.WWidget.init

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/WWidget.java:32`

```java
public void init()
```

## meteordevelopment.meteorclient.gui.widgets.WWidget.move

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/WWidget.java:34`

```java
public void move(double deltaX, double deltaY)
```

## meteordevelopment.meteorclient.gui.widgets.WWidget.getTheme

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/WWidget.java:39`

```java
@Override public GuiTheme getTheme()
```

## meteordevelopment.meteorclient.gui.widgets.WWidget.pad

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/WWidget.java:44`

```java
public double pad()
```

## meteordevelopment.meteorclient.gui.widgets.WWidget.calculateSize

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/WWidget.java:50`

```java
public void calculateSize()
```

## meteordevelopment.meteorclient.gui.widgets.WWidget.onCalculateSize

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/WWidget.java:60`

```java
protected void onCalculateSize()
```

## meteordevelopment.meteorclient.gui.widgets.WWidget.calculateWidgetPositions

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/WWidget.java:64`

```java
public void calculateWidgetPositions()
```

## meteordevelopment.meteorclient.gui.widgets.WWidget.onCalculateWidgetPositions

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/WWidget.java:71`

```java
protected void onCalculateWidgetPositions()
```

## meteordevelopment.meteorclient.gui.widgets.WWidget.render

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/WWidget.java:77`

```java
public boolean render(GuiRenderer renderer, double mouseX, double mouseY, double delta)
```

## meteordevelopment.meteorclient.gui.widgets.WWidget.onRender

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/WWidget.java:96`

```java
protected void onRender(GuiRenderer renderer, double mouseX, double mouseY, double delta)
```

## meteordevelopment.meteorclient.gui.widgets.WWidget.mouseClicked

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/WWidget.java:100`

```java
public boolean mouseClicked(Click click, boolean doubled)
```

## meteordevelopment.meteorclient.gui.widgets.WWidget.onMouseClicked

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/WWidget.java:103`

```java
public boolean onMouseClicked(Click click, boolean doubled)
```

## meteordevelopment.meteorclient.gui.widgets.WWidget.mouseReleased

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/WWidget.java:105`

```java
public boolean mouseReleased(Click click)
```

## meteordevelopment.meteorclient.gui.widgets.WWidget.onMouseReleased

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/WWidget.java:108`

```java
public boolean onMouseReleased(Click click)
```

## meteordevelopment.meteorclient.gui.widgets.WWidget.mouseMoved

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/WWidget.java:110`

```java
public void mouseMoved(double mouseX, double mouseY, double lastMouseX, double lastMouseY)
```

## meteordevelopment.meteorclient.gui.widgets.WWidget.onMouseMoved

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/WWidget.java:114`

```java
public void onMouseMoved(double mouseX, double mouseY, double lastMouseX, double lastMouseY)
```

## meteordevelopment.meteorclient.gui.widgets.WWidget.mouseScrolled

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/WWidget.java:116`

```java
public boolean mouseScrolled(double amount)
```

## meteordevelopment.meteorclient.gui.widgets.WWidget.onMouseScrolled

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/WWidget.java:119`

```java
public boolean onMouseScrolled(double amount)
```

## meteordevelopment.meteorclient.gui.widgets.WWidget.keyPressed

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/WWidget.java:121`

```java
public boolean keyPressed(KeyInput input)
```

## meteordevelopment.meteorclient.gui.widgets.WWidget.onKeyPressed

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/WWidget.java:124`

```java
public boolean onKeyPressed(KeyInput input)
```

## meteordevelopment.meteorclient.gui.widgets.WWidget.keyRepeated

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/WWidget.java:126`

```java
public boolean keyRepeated(KeyInput input)
```

## meteordevelopment.meteorclient.gui.widgets.WWidget.onKeyRepeated

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/WWidget.java:129`

```java
public boolean onKeyRepeated(KeyInput input)
```

## meteordevelopment.meteorclient.gui.widgets.WWidget.charTyped

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/WWidget.java:131`

```java
public boolean charTyped(CharInput input)
```

## meteordevelopment.meteorclient.gui.widgets.WWidget.onCharTyped

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/WWidget.java:134`

```java
public boolean onCharTyped(CharInput input)
```

## meteordevelopment.meteorclient.gui.widgets.WWidget.invalidate

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/WWidget.java:138`

```java
public void invalidate()
```

## meteordevelopment.meteorclient.gui.widgets.WWidget.getRoot

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/WWidget.java:143`

```java
protected WWidget getRoot()
```

## meteordevelopment.meteorclient.gui.widgets.WWidget.getView

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/WWidget.java:147`

```java
public WView getView()
```

## meteordevelopment.meteorclient.gui.widgets.WWidget.isOver

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/WWidget.java:151`

```java
public boolean isOver(double x, double y)
```

## meteordevelopment.meteorclient.gui.widgets.WWidget.isFocused

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/WWidget.java:155`

```java
public boolean isFocused()
```

## meteordevelopment.meteorclient.gui.widgets.WWidget.setFocused

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/WWidget.java:159`

```java
public void setFocused(boolean focused)
```

## meteordevelopment.meteorclient.gui.widgets.containers.WContainer

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WContainer.java:23`

```java
public abstract class WContainer extends WWidget
```

## meteordevelopment.meteorclient.gui.widgets.containers.WContainer.cells

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WContainer.java:24`

```java
public final List<Cell<?>> cells = new ArrayList<>()
```

## meteordevelopment.meteorclient.gui.widgets.containers.WContainer.add

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WContainer.java:26`

```java
public <T extends WWidget> Cell<T> add(T widget)
```

## meteordevelopment.meteorclient.gui.widgets.containers.WContainer.clear

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WContainer.java:39`

```java
public void clear()
```

## meteordevelopment.meteorclient.gui.widgets.containers.WContainer.remove

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WContainer.java:46`

```java
public void remove(Cell<?> cell)
```

## meteordevelopment.meteorclient.gui.widgets.containers.WContainer.move

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WContainer.java:50`

```java
@Override public void move(double deltaX, double deltaY)
```

## meteordevelopment.meteorclient.gui.widgets.containers.WContainer.moveCells

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WContainer.java:56`

```java
public void moveCells(double deltaX, double deltaY)
```

## meteordevelopment.meteorclient.gui.widgets.containers.WContainer.isFocused

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WContainer.java:65`

```java
@Override public boolean isFocused()
```

## meteordevelopment.meteorclient.gui.widgets.containers.WContainer.calculateSize

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WContainer.java:79`

```java
@Override public void calculateSize()
```

## meteordevelopment.meteorclient.gui.widgets.containers.WContainer.onCalculateSize

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WContainer.java:85`

```java
@Override protected void onCalculateSize()
```

## meteordevelopment.meteorclient.gui.widgets.containers.WContainer.calculateWidgetPositions

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WContainer.java:96`

```java
@Override public void calculateWidgetPositions()
```

## meteordevelopment.meteorclient.gui.widgets.containers.WContainer.onCalculateWidgetPositions

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WContainer.java:102`

```java
@Override protected void onCalculateWidgetPositions()
```

## meteordevelopment.meteorclient.gui.widgets.containers.WContainer.render

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WContainer.java:117`

```java
@Override public boolean render(GuiRenderer renderer, double mouseX, double mouseY, double delta)
```

## meteordevelopment.meteorclient.gui.widgets.containers.WContainer.renderWidget

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WContainer.java:136`

```java
protected void renderWidget(WWidget widget, GuiRenderer renderer, double mouseX, double mouseY, double delta)
```

## meteordevelopment.meteorclient.gui.widgets.containers.WContainer.propagateEvents

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WContainer.java:153`

```java
protected boolean propagateEvents(WWidget widget)
```

## meteordevelopment.meteorclient.gui.widgets.containers.WContainer.mouseClicked

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WContainer.java:157`

```java
@Override public boolean mouseClicked(Click click, boolean doubled)
```

## meteordevelopment.meteorclient.gui.widgets.containers.WContainer.mouseReleased

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WContainer.java:168`

```java
@Override public boolean mouseReleased(Click click)
```

## meteordevelopment.meteorclient.gui.widgets.containers.WContainer.mouseMoved

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WContainer.java:179`

```java
@Override public void mouseMoved(double mouseX, double mouseY, double lastMouseX, double lastMouseY)
```

## meteordevelopment.meteorclient.gui.widgets.containers.WContainer.mouseScrolled

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WContainer.java:190`

```java
@Override public boolean mouseScrolled(double amount)
```

## meteordevelopment.meteorclient.gui.widgets.containers.WContainer.keyPressed

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WContainer.java:201`

```java
@Override public boolean keyPressed(KeyInput input)
```

## meteordevelopment.meteorclient.gui.widgets.containers.WContainer.keyRepeated

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WContainer.java:212`

```java
@Override public boolean keyRepeated(KeyInput input)
```

## meteordevelopment.meteorclient.gui.widgets.containers.WContainer.charTyped

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WContainer.java:223`

```java
@Override public boolean charTyped(CharInput input)
```

## meteordevelopment.meteorclient.gui.widgets.containers.WHorizontalList

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WHorizontalList.java:10`

```java
public class WHorizontalList extends WContainer
```

## meteordevelopment.meteorclient.gui.widgets.containers.WHorizontalList.spacing

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WHorizontalList.java:11`

```java
public double spacing = 3
```

## meteordevelopment.meteorclient.gui.widgets.containers.WHorizontalList.calculatedWidth

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WHorizontalList.java:13`

```java
protected double calculatedWidth
```

## meteordevelopment.meteorclient.gui.widgets.containers.WHorizontalList.fillXCount

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WHorizontalList.java:14`

```java
protected int fillXCount
```

## meteordevelopment.meteorclient.gui.widgets.containers.WHorizontalList.spacing

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WHorizontalList.java:16`

```java
protected double spacing()
```

## meteordevelopment.meteorclient.gui.widgets.containers.WHorizontalList.onCalculateSize

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WHorizontalList.java:20`

```java
@Override protected void onCalculateSize()
```

## meteordevelopment.meteorclient.gui.widgets.containers.WHorizontalList.onCalculateWidgetPositions

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WHorizontalList.java:41`

```java
@Override protected void onCalculateWidgetPositions()
```

## meteordevelopment.meteorclient.gui.widgets.containers.WSection

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WSection.java:16`

```java
public abstract class WSection extends WVerticalList
```

## meteordevelopment.meteorclient.gui.widgets.containers.WSection.action

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WSection.java:17`

```java
public Runnable action
```

## meteordevelopment.meteorclient.gui.widgets.containers.WSection.title

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WSection.java:19`

```java
protected String title
```

## meteordevelopment.meteorclient.gui.widgets.containers.WSection.expanded

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WSection.java:21`

```java
protected boolean expanded
```

## meteordevelopment.meteorclient.gui.widgets.containers.WSection.animProgress

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WSection.java:22`

```java
protected double animProgress
```

## meteordevelopment.meteorclient.gui.widgets.containers.WSection.headerWidget

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WSection.java:25`

```java
protected final WWidget headerWidget
```

## meteordevelopment.meteorclient.gui.widgets.containers.WSection.WSection

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WSection.java:31`

```java
public WSection(String title, boolean expanded, WWidget headerWidget)
```

## meteordevelopment.meteorclient.gui.widgets.containers.WSection.init

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WSection.java:39`

```java
@Override public void init()
```

## meteordevelopment.meteorclient.gui.widgets.containers.WSection.add

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WSection.java:47`

```java
@Override public <T extends WWidget> Cell<T> add(T widget)
```

## meteordevelopment.meteorclient.gui.widgets.containers.WSection.createHeader

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WSection.java:52`

```java
protected abstract WHeader createHeader()
```

## meteordevelopment.meteorclient.gui.widgets.containers.WSection.setExpanded

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WSection.java:54`

```java
public void setExpanded(boolean expanded)
```

## meteordevelopment.meteorclient.gui.widgets.containers.WSection.isExpanded

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WSection.java:58`

```java
public boolean isExpanded()
```

## meteordevelopment.meteorclient.gui.widgets.containers.WSection.onCalculateSize

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WSection.java:62`

```java
@Override protected void onCalculateSize()
```

## meteordevelopment.meteorclient.gui.widgets.containers.WSection.render

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WSection.java:85`

```java
@Override public boolean render(GuiRenderer renderer, double mouseX, double mouseY, double delta)
```

## meteordevelopment.meteorclient.gui.widgets.containers.WSection.renderWidget

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WSection.java:107`

```java
@Override protected void renderWidget(WWidget widget, GuiRenderer renderer, double mouseX, double mouseY, double delta)
```

## meteordevelopment.meteorclient.gui.widgets.containers.WSection.propagateEvents

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WSection.java:114`

```java
@Override protected boolean propagateEvents(WWidget widget)
```

## meteordevelopment.meteorclient.gui.widgets.containers.WSection.WHeader

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WSection.java:119`

```java
protected abstract class WHeader extends WHorizontalList
```

## meteordevelopment.meteorclient.gui.widgets.containers.WSection.WHeader.title

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WSection.java:120`

```java
protected String title
```

## meteordevelopment.meteorclient.gui.widgets.containers.WSection.WHeader.WHeader

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WSection.java:122`

```java
public WHeader(String title)
```

## meteordevelopment.meteorclient.gui.widgets.containers.WSection.WHeader.onMouseClicked

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WSection.java:126`

```java
@Override public boolean onMouseClicked(Click click, boolean doubled)
```

## meteordevelopment.meteorclient.gui.widgets.containers.WSection.WHeader.onClick

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WSection.java:136`

```java
protected void onClick()
```

## meteordevelopment.meteorclient.gui.widgets.containers.WTable

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WTable.java:17`

```java
public class WTable extends WContainer
```

## meteordevelopment.meteorclient.gui.widgets.containers.WTable.horizontalSpacing

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WTable.java:18`

```java
public double horizontalSpacing = 3
```

## meteordevelopment.meteorclient.gui.widgets.containers.WTable.verticalSpacing

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WTable.java:19`

```java
public double verticalSpacing = 3
```

## meteordevelopment.meteorclient.gui.widgets.containers.WTable.add

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WTable.java:30`

```java
@Override public <T extends WWidget> Cell<T> add(T widget)
```

## meteordevelopment.meteorclient.gui.widgets.containers.WTable.row

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WTable.java:44`

```java
public void row()
```

## meteordevelopment.meteorclient.gui.widgets.containers.WTable.rowI

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WTable.java:48`

```java
public int rowI()
```

## meteordevelopment.meteorclient.gui.widgets.containers.WTable.removeRow

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WTable.java:52`

```java
public void removeRow(int i)
```

## meteordevelopment.meteorclient.gui.widgets.containers.WTable.getRow

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WTable.java:65`

```java
public List<Cell<?>> getRow(int i)
```

## meteordevelopment.meteorclient.gui.widgets.containers.WTable.clear

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WTable.java:70`

```java
@Override public void clear()
```

## meteordevelopment.meteorclient.gui.widgets.containers.WTable.horizontalSpacing

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WTable.java:77`

```java
protected double horizontalSpacing()
```

## meteordevelopment.meteorclient.gui.widgets.containers.WTable.verticalSpacing

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WTable.java:81`

```java
protected double verticalSpacing()
```

## meteordevelopment.meteorclient.gui.widgets.containers.WTable.onCalculateSize

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WTable.java:85`

```java
@Override protected void onCalculateSize()
```

## meteordevelopment.meteorclient.gui.widgets.containers.WTable.onCalculateWidgetPositions

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WTable.java:118`

```java
@Override protected void onCalculateWidgetPositions()
```

## meteordevelopment.meteorclient.gui.widgets.containers.WVerticalList

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WVerticalList.java:10`

```java
public class WVerticalList extends WContainer
```

## meteordevelopment.meteorclient.gui.widgets.containers.WVerticalList.spacing

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WVerticalList.java:11`

```java
public double spacing = 3
```

## meteordevelopment.meteorclient.gui.widgets.containers.WVerticalList.widthRemove

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WVerticalList.java:13`

```java
protected double widthRemove
```

## meteordevelopment.meteorclient.gui.widgets.containers.WVerticalList.spacing

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WVerticalList.java:15`

```java
protected double spacing()
```

## meteordevelopment.meteorclient.gui.widgets.containers.WVerticalList.onCalculateSize

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WVerticalList.java:19`

```java
@Override protected void onCalculateSize()
```

## meteordevelopment.meteorclient.gui.widgets.containers.WVerticalList.onCalculateWidgetPositions

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WVerticalList.java:34`

```java
@Override protected void onCalculateWidgetPositions()
```

## meteordevelopment.meteorclient.gui.widgets.containers.WView

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WView.java:16`

```java
public abstract class WView extends WVerticalList
```

## meteordevelopment.meteorclient.gui.widgets.containers.WView.maxHeight

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WView.java:17`

```java
public double maxHeight = Double.MAX_VALUE
```

## meteordevelopment.meteorclient.gui.widgets.containers.WView.scrollOnlyWhenMouseOver

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WView.java:18`

```java
public boolean scrollOnlyWhenMouseOver = true
```

## meteordevelopment.meteorclient.gui.widgets.containers.WView.hasScrollBar

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WView.java:19`

```java
public boolean hasScrollBar = true
```

## meteordevelopment.meteorclient.gui.widgets.containers.WView.canScroll

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WView.java:21`

```java
protected boolean canScroll
```

## meteordevelopment.meteorclient.gui.widgets.containers.WView.handleMouseOver

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WView.java:28`

```java
protected boolean handleMouseOver
```

## meteordevelopment.meteorclient.gui.widgets.containers.WView.init

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WView.java:30`

```java
@Override public void init()
```

## meteordevelopment.meteorclient.gui.widgets.containers.WView.onCalculateSize

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WView.java:35`

```java
@Override protected void onCalculateSize()
```

## meteordevelopment.meteorclient.gui.widgets.containers.WView.onCalculateWidgetPositions

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WView.java:62`

```java
@Override protected void onCalculateWidgetPositions()
```

## meteordevelopment.meteorclient.gui.widgets.containers.WView.onMouseClicked

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WView.java:76`

```java
@Override public boolean onMouseClicked(Click click, boolean doubled)
```

## meteordevelopment.meteorclient.gui.widgets.containers.WView.onMouseReleased

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WView.java:86`

```java
@Override public boolean onMouseReleased(Click click)
```

## meteordevelopment.meteorclient.gui.widgets.containers.WView.onMouseMoved

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WView.java:93`

```java
@Override public void onMouseMoved(double mouseX, double mouseY, double lastMouseX, double lastMouseY)
```

## meteordevelopment.meteorclient.gui.widgets.containers.WView.onMouseScrolled

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WView.java:122`

```java
@Override public boolean onMouseScrolled(double amount)
```

## meteordevelopment.meteorclient.gui.widgets.containers.WView.render

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WView.java:137`

```java
@Override public boolean render(GuiRenderer renderer, double mouseX, double mouseY, double delta)
```

## meteordevelopment.meteorclient.gui.widgets.containers.WView.propagateEvents

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WView.java:168`

```java
@Override protected boolean propagateEvents(WWidget widget)
```

## meteordevelopment.meteorclient.gui.widgets.containers.WView.handleWidth

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WView.java:179`

```java
protected double handleWidth()
```

## meteordevelopment.meteorclient.gui.widgets.containers.WView.handleHeight

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WView.java:183`

```java
protected double handleHeight()
```

## meteordevelopment.meteorclient.gui.widgets.containers.WView.handleX

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WView.java:187`

```java
protected double handleX()
```

## meteordevelopment.meteorclient.gui.widgets.containers.WView.handleY

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WView.java:191`

```java
protected double handleY()
```

## meteordevelopment.meteorclient.gui.widgets.containers.WView.isWidgetInView

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WView.java:195`

```java
public boolean isWidgetInView(WWidget widget)
```

## meteordevelopment.meteorclient.gui.widgets.containers.WWindow

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WWindow.java:22`

```java
public abstract class WWindow extends WVerticalList
```

## meteordevelopment.meteorclient.gui.widgets.containers.WWindow.padding

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WWindow.java:23`

```java
public double padding = 8
```

## meteordevelopment.meteorclient.gui.widgets.containers.WWindow.beforeHeaderInit

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WWindow.java:24`

```java
public Consumer<WContainer> beforeHeaderInit
```

## meteordevelopment.meteorclient.gui.widgets.containers.WWindow.id

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WWindow.java:25`

```java
public String id
```

## meteordevelopment.meteorclient.gui.widgets.containers.WWindow.icon

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WWindow.java:27`

```java
public final WWidget icon
```

## meteordevelopment.meteorclient.gui.widgets.containers.WWindow.title

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WWindow.java:28`

```java
protected final String title
```

## meteordevelopment.meteorclient.gui.widgets.containers.WWindow.header

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WWindow.java:30`

```java
protected WHeader header
```

## meteordevelopment.meteorclient.gui.widgets.containers.WWindow.view

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WWindow.java:31`

```java
public WView view
```

## meteordevelopment.meteorclient.gui.widgets.containers.WWindow.dragging

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WWindow.java:33`

```java
protected boolean dragging
```

## meteordevelopment.meteorclient.gui.widgets.containers.WWindow.expanded

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WWindow.java:34`

```java
protected boolean expanded = true
```

## meteordevelopment.meteorclient.gui.widgets.containers.WWindow.dragged

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WWindow.java:35`

```java
protected boolean dragged
```

## meteordevelopment.meteorclient.gui.widgets.containers.WWindow.animProgress

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WWindow.java:37`

```java
protected double animProgress = 1
```

## meteordevelopment.meteorclient.gui.widgets.containers.WWindow.moved

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WWindow.java:39`

```java
protected boolean moved = false
```

## meteordevelopment.meteorclient.gui.widgets.containers.WWindow.movedX

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WWindow.java:40`

```java
protected double movedX, movedY
```

## meteordevelopment.meteorclient.gui.widgets.containers.WWindow.movedY

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WWindow.java:40`

```java
protected double movedX, movedY
```

## meteordevelopment.meteorclient.gui.widgets.containers.WWindow.WWindow

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WWindow.java:44`

```java
public WWindow(WWidget icon, String title)
```

## meteordevelopment.meteorclient.gui.widgets.containers.WWindow.init

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WWindow.java:49`

```java
@Override public void init()
```

## meteordevelopment.meteorclient.gui.widgets.containers.WWindow.header

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WWindow.java:63`

```java
protected abstract WHeader header(WWidget icon)
```

## meteordevelopment.meteorclient.gui.widgets.containers.WWindow.add

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WWindow.java:65`

```java
@Override public <T extends WWidget> Cell<T> add(T widget)
```

## meteordevelopment.meteorclient.gui.widgets.containers.WWindow.clear

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WWindow.java:70`

```java
@Override public void clear()
```

## meteordevelopment.meteorclient.gui.widgets.containers.WWindow.setExpanded

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WWindow.java:75`

```java
public void setExpanded(boolean expanded)
```

## meteordevelopment.meteorclient.gui.widgets.containers.WWindow.onCalculateWidgetPositions

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WWindow.java:84`

```java
@Override protected void onCalculateWidgetPositions()
```

## meteordevelopment.meteorclient.gui.widgets.containers.WWindow.render

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WWindow.java:113`

```java
@Override public boolean render(GuiRenderer renderer, double mouseX, double mouseY, double delta)
```

## meteordevelopment.meteorclient.gui.widgets.containers.WWindow.renderWidget

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WWindow.java:125`

```java
@Override protected void renderWidget(WWidget widget, GuiRenderer renderer, double mouseX, double mouseY, double delta)
```

## meteordevelopment.meteorclient.gui.widgets.containers.WWindow.propagateEvents

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WWindow.java:134`

```java
@Override protected boolean propagateEvents(WWidget widget)
```

## meteordevelopment.meteorclient.gui.widgets.containers.WWindow.WHeader

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WWindow.java:139`

```java
protected abstract class WHeader extends WContainer
```

## meteordevelopment.meteorclient.gui.widgets.containers.WWindow.WHeader.WHeader

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WWindow.java:144`

```java
public WHeader(WWidget icon)
```

## meteordevelopment.meteorclient.gui.widgets.containers.WWindow.WHeader.init

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WWindow.java:148`

```java
@Override public void init()
```

## meteordevelopment.meteorclient.gui.widgets.containers.WWindow.WHeader.add

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WWindow.java:171`

```java
@Override public <T extends WWidget> Cell<T> add(T widget)
```

## meteordevelopment.meteorclient.gui.widgets.containers.WWindow.WHeader.onCalculateSize

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WWindow.java:177`

```java
@Override protected void onCalculateSize()
```

## meteordevelopment.meteorclient.gui.widgets.containers.WWindow.WHeader.onMouseClicked

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WWindow.java:191`

```java
@Override public boolean onMouseClicked(Click click, boolean doubled)
```

## meteordevelopment.meteorclient.gui.widgets.containers.WWindow.WHeader.onMouseReleased

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WWindow.java:206`

```java
@Override public boolean onMouseReleased(Click click)
```

## meteordevelopment.meteorclient.gui.widgets.containers.WWindow.WHeader.onMouseMoved

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WWindow.java:217`

```java
@Override public void onMouseMoved(double mouseX, double mouseY, double lastMouseX, double lastMouseY)
```

## meteordevelopment.meteorclient.gui.widgets.containers.WWindow.WHeader.render

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/containers/WWindow.java:237`

```java
@Override public boolean render(GuiRenderer renderer, double mouseX, double mouseY, double delta)
```

## meteordevelopment.meteorclient.gui.widgets.input.WBlockPosEdit

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WBlockPosEdit.java:23`

```java
public class WBlockPosEdit extends WHorizontalList
```

## meteordevelopment.meteorclient.gui.widgets.input.WBlockPosEdit.action

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WBlockPosEdit.java:24`

```java
public Runnable action
```

## meteordevelopment.meteorclient.gui.widgets.input.WBlockPosEdit.actionOnRelease

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WBlockPosEdit.java:25`

```java
public Runnable actionOnRelease
```

## meteordevelopment.meteorclient.gui.widgets.input.WBlockPosEdit.WBlockPosEdit

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WBlockPosEdit.java:36`

```java
public WBlockPosEdit(BlockPos value)
```

## meteordevelopment.meteorclient.gui.widgets.input.WBlockPosEdit.init

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WBlockPosEdit.java:40`

```java
@Override public void init()
```

## meteordevelopment.meteorclient.gui.widgets.input.WBlockPosEdit.get

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WBlockPosEdit.java:117`

```java
public BlockPos get()
```

## meteordevelopment.meteorclient.gui.widgets.input.WBlockPosEdit.set

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WBlockPosEdit.java:121`

```java
public void set(BlockPos value)
```

## meteordevelopment.meteorclient.gui.widgets.input.WDoubleEdit

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WDoubleEdit.java:12`

```java
public class WDoubleEdit extends WHorizontalList
```

## meteordevelopment.meteorclient.gui.widgets.input.WDoubleEdit.decimalPlaces

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WDoubleEdit.java:18`

```java
public int decimalPlaces
```

## meteordevelopment.meteorclient.gui.widgets.input.WDoubleEdit.noSlider

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WDoubleEdit.java:19`

```java
public boolean noSlider = false
```

## meteordevelopment.meteorclient.gui.widgets.input.WDoubleEdit.small

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WDoubleEdit.java:20`

```java
public boolean small = false
```

## meteordevelopment.meteorclient.gui.widgets.input.WDoubleEdit.action

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WDoubleEdit.java:22`

```java
public Runnable action
```

## meteordevelopment.meteorclient.gui.widgets.input.WDoubleEdit.actionOnRelease

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WDoubleEdit.java:23`

```java
public Runnable actionOnRelease
```

## meteordevelopment.meteorclient.gui.widgets.input.WDoubleEdit.WDoubleEdit

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WDoubleEdit.java:28`

```java
public WDoubleEdit(double value, double min, double max, double sliderMin, double sliderMax, int decimalPlaces, boolean noSlider)
```

## meteordevelopment.meteorclient.gui.widgets.input.WDoubleEdit.init

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WDoubleEdit.java:39`

```java
@Override public void init()
```

## meteordevelopment.meteorclient.gui.widgets.input.WDoubleEdit.get

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WDoubleEdit.java:132`

```java
public double get()
```

## meteordevelopment.meteorclient.gui.widgets.input.WDoubleEdit.set

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WDoubleEdit.java:136`

```java
public void set(double value)
```

## meteordevelopment.meteorclient.gui.widgets.input.WDropdown

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WDropdown.java:19`

```java
public abstract class WDropdown<T> extends WPressable
```

## meteordevelopment.meteorclient.gui.widgets.input.WDropdown.action

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WDropdown.java:20`

```java
public Runnable action
```

## meteordevelopment.meteorclient.gui.widgets.input.WDropdown.values

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WDropdown.java:22`

```java
protected T[] values
```

## meteordevelopment.meteorclient.gui.widgets.input.WDropdown.value

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WDropdown.java:23`

```java
protected T value
```

## meteordevelopment.meteorclient.gui.widgets.input.WDropdown.maxValueWidth

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WDropdown.java:25`

```java
protected double maxValueWidth
```

## meteordevelopment.meteorclient.gui.widgets.input.WDropdown.root

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WDropdown.java:27`

```java
protected WDropdownRoot root
```

## meteordevelopment.meteorclient.gui.widgets.input.WDropdown.expanded

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WDropdown.java:28`

```java
protected boolean expanded
```

## meteordevelopment.meteorclient.gui.widgets.input.WDropdown.animProgress

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WDropdown.java:29`

```java
protected double animProgress
```

## meteordevelopment.meteorclient.gui.widgets.input.WDropdown.WDropdown

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WDropdown.java:31`

```java
public WDropdown(T[] values, T value)
```

## meteordevelopment.meteorclient.gui.widgets.input.WDropdown.init

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WDropdown.java:37`

```java
@Override public void init()
```

## meteordevelopment.meteorclient.gui.widgets.input.WDropdown.createRootWidget

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WDropdown.java:53`

```java
protected abstract WDropdownRoot createRootWidget()
```

## meteordevelopment.meteorclient.gui.widgets.input.WDropdown.createValueWidget

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WDropdown.java:55`

```java
protected abstract WDropdownValue createValueWidget()
```

## meteordevelopment.meteorclient.gui.widgets.input.WDropdown.onCalculateSize

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WDropdown.java:57`

```java
@Override protected void onCalculateSize()
```

## meteordevelopment.meteorclient.gui.widgets.input.WDropdown.onCalculateWidgetPositions

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WDropdown.java:75`

```java
@Override protected void onCalculateWidgetPositions()
```

## meteordevelopment.meteorclient.gui.widgets.input.WDropdown.onPressed

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WDropdown.java:85`

```java
@Override protected void onPressed(int button)
```

## meteordevelopment.meteorclient.gui.widgets.input.WDropdown.get

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WDropdown.java:92`

```java
public T get()
```

## meteordevelopment.meteorclient.gui.widgets.input.WDropdown.set

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WDropdown.java:96`

```java
public void set(T value)
```

## meteordevelopment.meteorclient.gui.widgets.input.WDropdown.move

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WDropdown.java:100`

```java
@Override public void move(double deltaX, double deltaY)
```

## meteordevelopment.meteorclient.gui.widgets.input.WDropdown.render

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WDropdown.java:107`

```java
@Override public boolean render(GuiRenderer renderer, double mouseX, double mouseY, double delta)
```

## meteordevelopment.meteorclient.gui.widgets.input.WDropdown.onMouseClicked

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WDropdown.java:132`

```java
@Override public boolean onMouseClicked(Click click, boolean doubled)
```

## meteordevelopment.meteorclient.gui.widgets.input.WDropdown.onMouseReleased

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WDropdown.java:143`

```java
@Override public boolean onMouseReleased(Click click)
```

## meteordevelopment.meteorclient.gui.widgets.input.WDropdown.onMouseMoved

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WDropdown.java:150`

```java
@Override public void onMouseMoved(double mouseX, double mouseY, double lastMouseX, double lastMouseY)
```

## meteordevelopment.meteorclient.gui.widgets.input.WDropdown.onMouseScrolled

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WDropdown.java:157`

```java
@Override public boolean onMouseScrolled(double amount)
```

## meteordevelopment.meteorclient.gui.widgets.input.WDropdown.onKeyPressed

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WDropdown.java:168`

```java
@Override public boolean onKeyPressed(KeyInput input)
```

## meteordevelopment.meteorclient.gui.widgets.input.WDropdown.onKeyRepeated

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WDropdown.java:175`

```java
@Override public boolean onKeyRepeated(KeyInput input)
```

## meteordevelopment.meteorclient.gui.widgets.input.WDropdown.onCharTyped

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WDropdown.java:182`

```java
@Override public boolean onCharTyped(CharInput input)
```

## meteordevelopment.meteorclient.gui.widgets.input.WDropdown.WDropdownRoot

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WDropdown.java:191`

```java
protected abstract static class WDropdownRoot extends WVerticalList implements WRoot
```

## meteordevelopment.meteorclient.gui.widgets.input.WDropdown.WDropdownRoot.invalidate

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WDropdown.java:192`

```java
@Override public void invalidate()
```

## meteordevelopment.meteorclient.gui.widgets.input.WDropdown.WDropdownValue

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WDropdown.java:196`

```java
protected abstract class WDropdownValue extends WPressable
```

## meteordevelopment.meteorclient.gui.widgets.input.WDropdown.WDropdownValue.value

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WDropdown.java:197`

```java
protected T value
```

## meteordevelopment.meteorclient.gui.widgets.input.WDropdown.WDropdownValue.onPressed

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WDropdown.java:199`

```java
@Override protected void onPressed(int button)
```

## meteordevelopment.meteorclient.gui.widgets.input.WIntEdit

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WIntEdit.java:10`

```java
public class WIntEdit extends WHorizontalList
```

## meteordevelopment.meteorclient.gui.widgets.input.WIntEdit.min

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WIntEdit.java:13`

```java
public final int min, max
```

## meteordevelopment.meteorclient.gui.widgets.input.WIntEdit.max

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WIntEdit.java:13`

```java
public final int min, max
```

## meteordevelopment.meteorclient.gui.widgets.input.WIntEdit.noSlider

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WIntEdit.java:15`

```java
public boolean noSlider = false
```

## meteordevelopment.meteorclient.gui.widgets.input.WIntEdit.small

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WIntEdit.java:16`

```java
public boolean small = false
```

## meteordevelopment.meteorclient.gui.widgets.input.WIntEdit.action

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WIntEdit.java:18`

```java
public Runnable action
```

## meteordevelopment.meteorclient.gui.widgets.input.WIntEdit.actionOnRelease

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WIntEdit.java:19`

```java
public Runnable actionOnRelease
```

## meteordevelopment.meteorclient.gui.widgets.input.WIntEdit.WIntEdit

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WIntEdit.java:24`

```java
public WIntEdit(int value, int min, int max, int sliderMin, int sliderMax, boolean noSlider)
```

## meteordevelopment.meteorclient.gui.widgets.input.WIntEdit.init

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WIntEdit.java:34`

```java
@Override public void init()
```

## meteordevelopment.meteorclient.gui.widgets.input.WIntEdit.get

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WIntEdit.java:117`

```java
public int get()
```

## meteordevelopment.meteorclient.gui.widgets.input.WIntEdit.set

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WIntEdit.java:121`

```java
public void set(int value)
```

## meteordevelopment.meteorclient.gui.widgets.input.WSlider

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WSlider.java:12`

```java
public abstract class WSlider extends WWidget
```

## meteordevelopment.meteorclient.gui.widgets.input.WSlider.action

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WSlider.java:13`

```java
public Runnable action
```

## meteordevelopment.meteorclient.gui.widgets.input.WSlider.actionOnRelease

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WSlider.java:14`

```java
public Runnable actionOnRelease
```

## meteordevelopment.meteorclient.gui.widgets.input.WSlider.value

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WSlider.java:16`

```java
protected double value
```

## meteordevelopment.meteorclient.gui.widgets.input.WSlider.min

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WSlider.java:17`

```java
protected double min, max
```

## meteordevelopment.meteorclient.gui.widgets.input.WSlider.max

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WSlider.java:17`

```java
protected double min, max
```

## meteordevelopment.meteorclient.gui.widgets.input.WSlider.scrollHandleX

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WSlider.java:20`

```java
protected double scrollHandleX, scrollHandleY, scrollHandleH
```

## meteordevelopment.meteorclient.gui.widgets.input.WSlider.scrollHandleY

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WSlider.java:20`

```java
protected double scrollHandleX, scrollHandleY, scrollHandleH
```

## meteordevelopment.meteorclient.gui.widgets.input.WSlider.scrollHandleH

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WSlider.java:20`

```java
protected double scrollHandleX, scrollHandleY, scrollHandleH
```

## meteordevelopment.meteorclient.gui.widgets.input.WSlider.scrollHandleMouseOver

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WSlider.java:21`

```java
protected boolean scrollHandleMouseOver
```

## meteordevelopment.meteorclient.gui.widgets.input.WSlider.handleMouseOver

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WSlider.java:23`

```java
protected boolean handleMouseOver
```

## meteordevelopment.meteorclient.gui.widgets.input.WSlider.dragging

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WSlider.java:24`

```java
protected boolean dragging
```

## meteordevelopment.meteorclient.gui.widgets.input.WSlider.valueAtDragStart

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WSlider.java:25`

```java
protected double valueAtDragStart
```

## meteordevelopment.meteorclient.gui.widgets.input.WSlider.WSlider

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WSlider.java:27`

```java
public WSlider(double value, double min, double max)
```

## meteordevelopment.meteorclient.gui.widgets.input.WSlider.handleSize

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WSlider.java:33`

```java
protected double handleSize()
```

## meteordevelopment.meteorclient.gui.widgets.input.WSlider.onCalculateSize

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WSlider.java:37`

```java
@Override protected void onCalculateSize()
```

## meteordevelopment.meteorclient.gui.widgets.input.WSlider.onMouseClicked

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WSlider.java:45`

```java
@Override public boolean onMouseClicked(Click click, boolean doubled)
```

## meteordevelopment.meteorclient.gui.widgets.input.WSlider.onMouseMoved

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WSlider.java:63`

```java
@Override public void onMouseMoved(double mouseX, double mouseY, double lastMouseX, double lastMouseY)
```

## meteordevelopment.meteorclient.gui.widgets.input.WSlider.onMouseReleased

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WSlider.java:108`

```java
@Override public boolean onMouseReleased(Click click)
```

## meteordevelopment.meteorclient.gui.widgets.input.WSlider.onMouseScrolled

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WSlider.java:123`

```java
@Override public boolean onMouseScrolled(double amount)
```

## meteordevelopment.meteorclient.gui.widgets.input.WSlider.set

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WSlider.java:150`

```java
public void set(double value)
```

## meteordevelopment.meteorclient.gui.widgets.input.WSlider.get

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WSlider.java:154`

```java
public double get()
```

## meteordevelopment.meteorclient.gui.widgets.input.WSlider.valueWidth

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WSlider.java:158`

```java
protected double valueWidth()
```

## meteordevelopment.meteorclient.gui.widgets.input.WTextBox

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WTextBox.java:30`

```java
public abstract class WTextBox extends WWidget
```

## meteordevelopment.meteorclient.gui.widgets.input.WTextBox.action

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WTextBox.java:33`

```java
public Runnable action
```

## meteordevelopment.meteorclient.gui.widgets.input.WTextBox.actionOnUnfocused

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WTextBox.java:34`

```java
public Runnable actionOnUnfocused
```

## meteordevelopment.meteorclient.gui.widgets.input.WTextBox.text

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WTextBox.java:36`

```java
protected String text
```

## meteordevelopment.meteorclient.gui.widgets.input.WTextBox.placeholder

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WTextBox.java:37`

```java
protected String placeholder
```

## meteordevelopment.meteorclient.gui.widgets.input.WTextBox.filter

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WTextBox.java:38`

```java
protected CharFilter filter
```

## meteordevelopment.meteorclient.gui.widgets.input.WTextBox.renderer

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WTextBox.java:40`

```java
protected final Renderer renderer
```

## meteordevelopment.meteorclient.gui.widgets.input.WTextBox.textWidths

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WTextBox.java:42`

```java
protected DoubleList textWidths = new DoubleArrayList()
```

## meteordevelopment.meteorclient.gui.widgets.input.WTextBox.cursor

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WTextBox.java:44`

```java
protected int cursor
```

## meteordevelopment.meteorclient.gui.widgets.input.WTextBox.textStart

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WTextBox.java:45`

```java
protected double textStart
```

## meteordevelopment.meteorclient.gui.widgets.input.WTextBox.selecting

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WTextBox.java:47`

```java
protected boolean selecting, doubleClick
```

## meteordevelopment.meteorclient.gui.widgets.input.WTextBox.doubleClick

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WTextBox.java:47`

```java
protected boolean selecting, doubleClick
```

## meteordevelopment.meteorclient.gui.widgets.input.WTextBox.selectionStart

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WTextBox.java:48`

```java
protected int selectionStart, selectionEnd
```

## meteordevelopment.meteorclient.gui.widgets.input.WTextBox.selectionEnd

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WTextBox.java:48`

```java
protected int selectionStart, selectionEnd
```

## meteordevelopment.meteorclient.gui.widgets.input.WTextBox.WTextBox

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WTextBox.java:55`

```java
public WTextBox(String text, CharFilter filter, Class<? extends Renderer> renderer)
```

## meteordevelopment.meteorclient.gui.widgets.input.WTextBox.WTextBox

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WTextBox.java:59`

```java
public WTextBox(String text, String placeholder, CharFilter filter, Class<? extends Renderer> renderer)
```

## meteordevelopment.meteorclient.gui.widgets.input.WTextBox.createCompletionsRootWidget

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WTextBox.java:71`

```java
protected abstract WContainer createCompletionsRootWidget()
```

## meteordevelopment.meteorclient.gui.widgets.input.WTextBox.createCompletionsValueWidth

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WTextBox.java:73`

```java
protected abstract <T extends WWidget & ICompletionItem> T createCompletionsValueWidth(String completion, boolean selected)
```

## meteordevelopment.meteorclient.gui.widgets.input.WTextBox.onCalculateSize

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WTextBox.java:75`

```java
@Override protected void onCalculateSize()
```

## meteordevelopment.meteorclient.gui.widgets.input.WTextBox.calculateWidgetPositions

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WTextBox.java:88`

```java
@Override public void calculateWidgetPositions()
```

## meteordevelopment.meteorclient.gui.widgets.input.WTextBox.move

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WTextBox.java:99`

```java
@Override public void move(double deltaX, double deltaY)
```

## meteordevelopment.meteorclient.gui.widgets.input.WTextBox.maxTextWidth

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WTextBox.java:105`

```java
protected double maxTextWidth()
```

## meteordevelopment.meteorclient.gui.widgets.input.WTextBox.onMouseClicked

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WTextBox.java:109`

```java
@Override public boolean onMouseClicked(Click click, boolean doubled)
```

## meteordevelopment.meteorclient.gui.widgets.input.WTextBox.onMouseMoved

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WTextBox.java:166`

```java
@Override public void onMouseMoved(double mouseX, double mouseY, double lastMouseX, double lastMouseY)
```

## meteordevelopment.meteorclient.gui.widgets.input.WTextBox.onMouseReleased

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WTextBox.java:228`

```java
@Override public boolean onMouseReleased(Click click)
```

## meteordevelopment.meteorclient.gui.widgets.input.WTextBox.onKeyPressed

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WTextBox.java:243`

```java
@Override public boolean onKeyPressed(KeyInput input)
```

## meteordevelopment.meteorclient.gui.widgets.input.WTextBox.onKeyRepeated

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WTextBox.java:307`

```java
@Override public boolean onKeyRepeated(KeyInput input)
```

## meteordevelopment.meteorclient.gui.widgets.input.WTextBox.onCharTyped

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WTextBox.java:568`

```java
@Override public boolean onCharTyped(CharInput input)
```

## meteordevelopment.meteorclient.gui.widgets.input.WTextBox.render

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WTextBox.java:587`

```java
@Override public boolean render(GuiRenderer renderer, double mouseX, double mouseY, double delta)
```

## meteordevelopment.meteorclient.gui.widgets.input.WTextBox.onCursorChanged

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WTextBox.java:684`

```java
protected void onCursorChanged()
```

## meteordevelopment.meteorclient.gui.widgets.input.WTextBox.getTextWidth

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WTextBox.java:705`

```java
protected double getTextWidth(int pos)
```

## meteordevelopment.meteorclient.gui.widgets.input.WTextBox.getCursorTextWidth

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WTextBox.java:714`

```java
protected double getCursorTextWidth(int offset)
```

## meteordevelopment.meteorclient.gui.widgets.input.WTextBox.getOverflowWidthForRender

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WTextBox.java:718`

```java
protected double getOverflowWidthForRender()
```

## meteordevelopment.meteorclient.gui.widgets.input.WTextBox.get

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WTextBox.java:722`

```java
public String get()
```

## meteordevelopment.meteorclient.gui.widgets.input.WTextBox.set

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WTextBox.java:726`

```java
public void set(String text)
```

## meteordevelopment.meteorclient.gui.widgets.input.WTextBox.setFocused

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WTextBox.java:737`

```java
@Override public void setFocused(boolean focused)
```

## meteordevelopment.meteorclient.gui.widgets.input.WTextBox.setCursorMax

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WTextBox.java:750`

```java
public void setCursorMax()
```

## meteordevelopment.meteorclient.gui.widgets.input.WTextBox.Renderer

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WTextBox.java:754`

```java
public interface Renderer
```

## meteordevelopment.meteorclient.gui.widgets.input.WTextBox.Renderer.render

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WTextBox.java:755`

```java
void render(GuiRenderer renderer, double x, double y, String text, Color color)
```

## meteordevelopment.meteorclient.gui.widgets.input.WTextBox.Renderer.getCompletions

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WTextBox.java:757`

```java
default List<String> getCompletions(String text, int position)
```

## meteordevelopment.meteorclient.gui.widgets.input.WTextBox.ICompletionItem

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WTextBox.java:762`

```java
public interface ICompletionItem
```

## meteordevelopment.meteorclient.gui.widgets.input.WTextBox.ICompletionItem.isSelected

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WTextBox.java:763`

```java
boolean isSelected()
```

## meteordevelopment.meteorclient.gui.widgets.input.WTextBox.ICompletionItem.setSelected

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WTextBox.java:765`

```java
void setSelected(boolean selected)
```

## meteordevelopment.meteorclient.gui.widgets.input.WTextBox.ICompletionItem.getCompletion

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/input/WTextBox.java:767`

```java
String getCompletion()
```

## meteordevelopment.meteorclient.gui.widgets.pressable.WButton

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/pressable/WButton.java:10`

```java
public abstract class WButton extends WPressable
```

## meteordevelopment.meteorclient.gui.widgets.pressable.WButton.text

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/pressable/WButton.java:11`

```java
protected String text
```

## meteordevelopment.meteorclient.gui.widgets.pressable.WButton.textWidth

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/pressable/WButton.java:12`

```java
protected double textWidth
```

## meteordevelopment.meteorclient.gui.widgets.pressable.WButton.texture

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/pressable/WButton.java:14`

```java
protected GuiTexture texture
```

## meteordevelopment.meteorclient.gui.widgets.pressable.WButton.WButton

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/pressable/WButton.java:16`

```java
public WButton(String text, GuiTexture texture)
```

## meteordevelopment.meteorclient.gui.widgets.pressable.WButton.onCalculateSize

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/pressable/WButton.java:23`

```java
@Override protected void onCalculateSize()
```

## meteordevelopment.meteorclient.gui.widgets.pressable.WButton.set

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/pressable/WButton.java:43`

```java
public void set(String text)
```

## meteordevelopment.meteorclient.gui.widgets.pressable.WButton.getText

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/pressable/WButton.java:49`

```java
public String getText()
```

## meteordevelopment.meteorclient.gui.widgets.pressable.WCheckbox

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/pressable/WCheckbox.java:8`

```java
public abstract class WCheckbox extends WPressable
```

## meteordevelopment.meteorclient.gui.widgets.pressable.WCheckbox.checked

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/pressable/WCheckbox.java:9`

```java
public boolean checked
```

## meteordevelopment.meteorclient.gui.widgets.pressable.WCheckbox.WCheckbox

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/pressable/WCheckbox.java:11`

```java
public WCheckbox(boolean checked)
```

## meteordevelopment.meteorclient.gui.widgets.pressable.WCheckbox.onCalculateSize

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/pressable/WCheckbox.java:15`

```java
@Override protected void onCalculateSize()
```

## meteordevelopment.meteorclient.gui.widgets.pressable.WCheckbox.onPressed

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/pressable/WCheckbox.java:24`

```java
@Override protected void onPressed(int button)
```

## meteordevelopment.meteorclient.gui.widgets.pressable.WConfirmedButton

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/pressable/WConfirmedButton.java:11`

```java
public abstract class WConfirmedButton extends WButton
```

## meteordevelopment.meteorclient.gui.widgets.pressable.WConfirmedButton.pressedOnce

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/pressable/WConfirmedButton.java:13`

```java
protected boolean pressedOnce = false
```

## meteordevelopment.meteorclient.gui.widgets.pressable.WConfirmedButton.confirmText

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/pressable/WConfirmedButton.java:14`

```java
protected String confirmText
```

## meteordevelopment.meteorclient.gui.widgets.pressable.WConfirmedButton.WConfirmedButton

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/pressable/WConfirmedButton.java:16`

```java
public WConfirmedButton(String text, String confirmText, GuiTexture texture)
```

## meteordevelopment.meteorclient.gui.widgets.pressable.WConfirmedButton.onMouseClicked

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/pressable/WConfirmedButton.java:21`

```java
@Override public boolean onMouseClicked(Click click, boolean doubled)
```

## meteordevelopment.meteorclient.gui.widgets.pressable.WConfirmedButton.onMouseReleased

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/pressable/WConfirmedButton.java:31`

```java
@Override public boolean onMouseReleased(Click click)
```

## meteordevelopment.meteorclient.gui.widgets.pressable.WConfirmedButton.getText

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/pressable/WConfirmedButton.java:39`

```java
@Override public String getText()
```

## meteordevelopment.meteorclient.gui.widgets.pressable.WConfirmedButton.set

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/pressable/WConfirmedButton.java:44`

```java
public void set(String text, String confirmText)
```

## meteordevelopment.meteorclient.gui.widgets.pressable.WConfirmedMinus

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/pressable/WConfirmedMinus.java:10`

```java
public class WConfirmedMinus extends WMinus
```

## meteordevelopment.meteorclient.gui.widgets.pressable.WConfirmedMinus.pressedOnce

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/pressable/WConfirmedMinus.java:11`

```java
protected boolean pressedOnce = false
```

## meteordevelopment.meteorclient.gui.widgets.pressable.WConfirmedMinus.onMouseClicked

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/pressable/WConfirmedMinus.java:13`

```java
@Override public boolean onMouseClicked(Click click, boolean doubled)
```

## meteordevelopment.meteorclient.gui.widgets.pressable.WConfirmedMinus.onMouseReleased

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/pressable/WConfirmedMinus.java:22`

```java
@Override public boolean onMouseReleased(Click click)
```

## meteordevelopment.meteorclient.gui.widgets.pressable.WFavorite

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/pressable/WFavorite.java:11`

```java
public abstract class WFavorite extends WPressable
```

## meteordevelopment.meteorclient.gui.widgets.pressable.WFavorite.checked

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/pressable/WFavorite.java:12`

```java
public boolean checked
```

## meteordevelopment.meteorclient.gui.widgets.pressable.WFavorite.WFavorite

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/pressable/WFavorite.java:14`

```java
public WFavorite(boolean checked)
```

## meteordevelopment.meteorclient.gui.widgets.pressable.WFavorite.onCalculateSize

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/pressable/WFavorite.java:18`

```java
@Override protected void onCalculateSize()
```

## meteordevelopment.meteorclient.gui.widgets.pressable.WFavorite.onPressed

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/pressable/WFavorite.java:27`

```java
@Override protected void onPressed(int button)
```

## meteordevelopment.meteorclient.gui.widgets.pressable.WFavorite.onRender

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/pressable/WFavorite.java:32`

```java
@Override protected void onRender(GuiRenderer renderer, double mouseX, double mouseY, double delta)
```

## meteordevelopment.meteorclient.gui.widgets.pressable.WFavorite.getColor

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/pressable/WFavorite.java:40`

```java
protected abstract Color getColor()
```

## meteordevelopment.meteorclient.gui.widgets.pressable.WMinus

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/pressable/WMinus.java:8`

```java
public abstract class WMinus extends WPressable
```

## meteordevelopment.meteorclient.gui.widgets.pressable.WMinus.onCalculateSize

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/pressable/WMinus.java:9`

```java
@Override protected void onCalculateSize()
```

## meteordevelopment.meteorclient.gui.widgets.pressable.WPlus

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/pressable/WPlus.java:8`

```java
public abstract class WPlus extends WPressable
```

## meteordevelopment.meteorclient.gui.widgets.pressable.WPlus.onCalculateSize

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/pressable/WPlus.java:9`

```java
@Override protected void onCalculateSize()
```

## meteordevelopment.meteorclient.gui.widgets.pressable.WPressable

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/pressable/WPressable.java:14`

```java
public abstract class WPressable extends WWidget
```

## meteordevelopment.meteorclient.gui.widgets.pressable.WPressable.action

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/pressable/WPressable.java:15`

```java
public Runnable action
```

## meteordevelopment.meteorclient.gui.widgets.pressable.WPressable.pressed

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/pressable/WPressable.java:17`

```java
protected boolean pressed
```

## meteordevelopment.meteorclient.gui.widgets.pressable.WPressable.onMouseClicked

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/pressable/WPressable.java:19`

```java
@Override public boolean onMouseClicked(Click click, boolean doubled)
```

## meteordevelopment.meteorclient.gui.widgets.pressable.WPressable.onMouseReleased

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/pressable/WPressable.java:25`

```java
@Override public boolean onMouseReleased(Click click)
```

## meteordevelopment.meteorclient.gui.widgets.pressable.WPressable.onPressed

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/pressable/WPressable.java:37`

```java
protected void onPressed(int button)
```

## meteordevelopment.meteorclient.gui.widgets.pressable.WTriangle

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/pressable/WTriangle.java:8`

```java
public abstract class WTriangle extends WPressable
```

## meteordevelopment.meteorclient.gui.widgets.pressable.WTriangle.rotation

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/pressable/WTriangle.java:9`

```java
public double rotation
```

## meteordevelopment.meteorclient.gui.widgets.pressable.WTriangle.onCalculateSize

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/gui/widgets/pressable/WTriangle.java:11`

```java
@Override protected void onCalculateSize()
```
