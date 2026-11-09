# settings

Khai báo Java có cú pháp public/protected. Không bao gồm API kế thừa/tổng hợp bởi compiler; xem kiểm tra bytecode riêng.

## meteordevelopment.meteorclient.settings.BlockDataSetting

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/BlockDataSetting.java:21`

```java
public class BlockDataSetting<T extends ICopyable<T> & ISerializable<T> & IChangeable & IBlockData<T>> extends Setting<Map<Block, T>>
```

## meteordevelopment.meteorclient.settings.BlockDataSetting.defaultData

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/BlockDataSetting.java:22`

```java
public final IGetter<T> defaultData
```

## meteordevelopment.meteorclient.settings.BlockDataSetting.BlockDataSetting

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/BlockDataSetting.java:24`

```java
public BlockDataSetting(String name, String description, Map<Block, T> defaultValue, Consumer<Map<Block, T>> onChanged, Consumer<Setting<Map<Block, T>>> onModuleActivated, IGetter<T> defaultData, IVisible visible)
```

## meteordevelopment.meteorclient.settings.BlockDataSetting.resetImpl

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/BlockDataSetting.java:30`

```java
@Override public void resetImpl()
```

## meteordevelopment.meteorclient.settings.BlockDataSetting.parseImpl

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/BlockDataSetting.java:35`

```java
@Override protected Map<Block, T> parseImpl(String str)
```

## meteordevelopment.meteorclient.settings.BlockDataSetting.isValueValid

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/BlockDataSetting.java:40`

```java
@Override protected boolean isValueValid(Map<Block, T> value)
```

## meteordevelopment.meteorclient.settings.BlockDataSetting.save

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/BlockDataSetting.java:45`

```java
@Override protected CompoundTag save(CompoundTag tag)
```

## meteordevelopment.meteorclient.settings.BlockDataSetting.load

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/BlockDataSetting.java:56`

```java
@Override protected Map<Block, T> load(CompoundTag tag)
```

## meteordevelopment.meteorclient.settings.BlockDataSetting.Builder

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/BlockDataSetting.java:68`

```java
public static class Builder<T extends ICopyable<T> & ISerializable<T> & IChangeable & IBlockData<T>> extends SettingBuilder<Builder<T>, Map<Block, T>, BlockDataSetting<T>>
```

## meteordevelopment.meteorclient.settings.BlockDataSetting.Builder.Builder

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/BlockDataSetting.java:71`

```java
public Builder()
```

## meteordevelopment.meteorclient.settings.BlockDataSetting.Builder.defaultData

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/BlockDataSetting.java:75`

```java
public Builder<T> defaultData(IGetter<T> defaultData)
```

## meteordevelopment.meteorclient.settings.BlockDataSetting.Builder.build

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/BlockDataSetting.java:80`

```java
@Override public BlockDataSetting<T> build()
```

## meteordevelopment.meteorclient.settings.BlockListSetting

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/BlockListSetting.java:22`

```java
public class BlockListSetting extends Setting<List<Block>>
```

## meteordevelopment.meteorclient.settings.BlockListSetting.filter

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/BlockListSetting.java:23`

```java
public final Predicate<Block> filter
```

## meteordevelopment.meteorclient.settings.BlockListSetting.BlockListSetting

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/BlockListSetting.java:25`

```java
public BlockListSetting(String name, String description, List<Block> defaultValue, Consumer<List<Block>> onChanged, Consumer<Setting<List<Block>>> onModuleActivated, Predicate<Block> filter, IVisible visible)
```

## meteordevelopment.meteorclient.settings.BlockListSetting.resetImpl

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/BlockListSetting.java:31`

```java
@Override public void resetImpl()
```

## meteordevelopment.meteorclient.settings.BlockListSetting.parseImpl

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/BlockListSetting.java:36`

```java
@Override protected List<Block> parseImpl(String str)
```

## meteordevelopment.meteorclient.settings.BlockListSetting.isValueValid

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/BlockListSetting.java:52`

```java
@Override protected boolean isValueValid(List<Block> value)
```

## meteordevelopment.meteorclient.settings.BlockListSetting.getIdentifierSuggestions

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/BlockListSetting.java:57`

```java
@Override public Iterable<Identifier> getIdentifierSuggestions()
```

## meteordevelopment.meteorclient.settings.BlockListSetting.save

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/BlockListSetting.java:62`

```java
@Override protected CompoundTag save(CompoundTag tag)
```

## meteordevelopment.meteorclient.settings.BlockListSetting.load

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/BlockListSetting.java:73`

```java
@Override protected List<Block> load(CompoundTag tag)
```

## meteordevelopment.meteorclient.settings.BlockListSetting.Builder

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/BlockListSetting.java:87`

```java
public static class Builder extends SettingBuilder<Builder, List<Block>, BlockListSetting>
```

## meteordevelopment.meteorclient.settings.BlockListSetting.Builder.Builder

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/BlockListSetting.java:90`

```java
public Builder()
```

## meteordevelopment.meteorclient.settings.BlockListSetting.Builder.defaultValue

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/BlockListSetting.java:94`

```java
public Builder defaultValue(Block... defaults)
```

## meteordevelopment.meteorclient.settings.BlockListSetting.Builder.filter

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/BlockListSetting.java:98`

```java
public Builder filter(Predicate<Block> filter)
```

## meteordevelopment.meteorclient.settings.BlockListSetting.Builder.build

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/BlockListSetting.java:103`

```java
@Override public BlockListSetting build()
```

## meteordevelopment.meteorclient.settings.BlockPosSetting

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/BlockPosSetting.java:14`

```java
public class BlockPosSetting extends Setting<BlockPos>
```

## meteordevelopment.meteorclient.settings.BlockPosSetting.BlockPosSetting

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/BlockPosSetting.java:15`

```java
public BlockPosSetting(String name, String description, BlockPos defaultValue, Consumer<BlockPos> onChanged, Consumer<Setting<BlockPos>> onModuleActivated, IVisible visible)
```

## meteordevelopment.meteorclient.settings.BlockPosSetting.parseImpl

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/BlockPosSetting.java:19`

```java
@Override protected BlockPos parseImpl(String str)
```

## meteordevelopment.meteorclient.settings.BlockPosSetting.isValueValid

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/BlockPosSetting.java:32`

```java
@Override protected boolean isValueValid(BlockPos value)
```

## meteordevelopment.meteorclient.settings.BlockPosSetting.save

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/BlockPosSetting.java:37`

```java
@Override protected CompoundTag save(CompoundTag tag)
```

## meteordevelopment.meteorclient.settings.BlockPosSetting.load

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/BlockPosSetting.java:44`

```java
@Override protected BlockPos load(CompoundTag tag)
```

## meteordevelopment.meteorclient.settings.BlockPosSetting.Builder

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/BlockPosSetting.java:54`

```java
public static class Builder extends SettingBuilder<Builder, BlockPos, BlockPosSetting>
```

## meteordevelopment.meteorclient.settings.BlockPosSetting.Builder.Builder

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/BlockPosSetting.java:55`

```java
public Builder()
```

## meteordevelopment.meteorclient.settings.BlockPosSetting.Builder.build

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/BlockPosSetting.java:59`

```java
@Override public BlockPosSetting build()
```

## meteordevelopment.meteorclient.settings.BlockSetting

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/BlockSetting.java:16`

```java
public class BlockSetting extends Setting<Block>
```

## meteordevelopment.meteorclient.settings.BlockSetting.filter

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/BlockSetting.java:17`

```java
public final Predicate<Block> filter
```

## meteordevelopment.meteorclient.settings.BlockSetting.BlockSetting

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/BlockSetting.java:19`

```java
public BlockSetting(String name, String description, Block defaultValue, Consumer<Block> onChanged, Consumer<Setting<Block>> onModuleActivated, IVisible visible, Predicate<Block> filter)
```

## meteordevelopment.meteorclient.settings.BlockSetting.parseImpl

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/BlockSetting.java:25`

```java
@Override protected Block parseImpl(String str)
```

## meteordevelopment.meteorclient.settings.BlockSetting.isValueValid

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/BlockSetting.java:30`

```java
@Override protected boolean isValueValid(Block value)
```

## meteordevelopment.meteorclient.settings.BlockSetting.getIdentifierSuggestions

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/BlockSetting.java:35`

```java
@Override public Iterable<Identifier> getIdentifierSuggestions()
```

## meteordevelopment.meteorclient.settings.BlockSetting.save

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/BlockSetting.java:40`

```java
@Override protected CompoundTag save(CompoundTag tag)
```

## meteordevelopment.meteorclient.settings.BlockSetting.load

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/BlockSetting.java:47`

```java
@Override protected Block load(CompoundTag tag)
```

## meteordevelopment.meteorclient.settings.BlockSetting.Builder

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/BlockSetting.java:63`

```java
public static class Builder extends SettingBuilder<Builder, Block, BlockSetting>
```

## meteordevelopment.meteorclient.settings.BlockSetting.Builder.Builder

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/BlockSetting.java:66`

```java
public Builder()
```

## meteordevelopment.meteorclient.settings.BlockSetting.Builder.filter

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/BlockSetting.java:70`

```java
public Builder filter(Predicate<Block> filter)
```

## meteordevelopment.meteorclient.settings.BlockSetting.Builder.build

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/BlockSetting.java:75`

```java
@Override public BlockSetting build()
```

## meteordevelopment.meteorclient.settings.BoolSetting

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/BoolSetting.java:13`

```java
public class BoolSetting extends Setting<Boolean>
```

## meteordevelopment.meteorclient.settings.BoolSetting.parseImpl

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/BoolSetting.java:20`

```java
@Override protected Boolean parseImpl(String str)
```

## meteordevelopment.meteorclient.settings.BoolSetting.isValueValid

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/BoolSetting.java:28`

```java
@Override protected boolean isValueValid(Boolean value)
```

## meteordevelopment.meteorclient.settings.BoolSetting.getSuggestions

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/BoolSetting.java:33`

```java
@Override public Iterable<String> getSuggestions()
```

## meteordevelopment.meteorclient.settings.BoolSetting.save

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/BoolSetting.java:38`

```java
@Override public CompoundTag save(CompoundTag tag)
```

## meteordevelopment.meteorclient.settings.BoolSetting.load

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/BoolSetting.java:45`

```java
@Override public Boolean load(CompoundTag tag)
```

## meteordevelopment.meteorclient.settings.BoolSetting.Builder

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/BoolSetting.java:52`

```java
public static class Builder extends SettingBuilder<Builder, Boolean, BoolSetting>
```

## meteordevelopment.meteorclient.settings.BoolSetting.Builder.Builder

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/BoolSetting.java:53`

```java
public Builder()
```

## meteordevelopment.meteorclient.settings.BoolSetting.Builder.build

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/BoolSetting.java:57`

```java
@Override public BoolSetting build()
```

## meteordevelopment.meteorclient.settings.ColorListSetting

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/ColorListSetting.java:17`

```java
public class ColorListSetting extends Setting<List<SettingColor>>
```

## meteordevelopment.meteorclient.settings.ColorListSetting.ColorListSetting

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/ColorListSetting.java:18`

```java
public ColorListSetting(String name, String description, List<SettingColor> defaultValue, Consumer<List<SettingColor>> onChanged, Consumer<Setting<List<SettingColor>>> onModuleActivated, IVisible visible)
```

## meteordevelopment.meteorclient.settings.ColorListSetting.parseImpl

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/ColorListSetting.java:22`

```java
@Override protected List<SettingColor> parseImpl(String str)
```

## meteordevelopment.meteorclient.settings.ColorListSetting.isValueValid

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/ColorListSetting.java:36`

```java
@Override protected boolean isValueValid(List<SettingColor> value)
```

## meteordevelopment.meteorclient.settings.ColorListSetting.resetImpl

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/ColorListSetting.java:41`

```java
@Override protected void resetImpl()
```

## meteordevelopment.meteorclient.settings.ColorListSetting.save

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/ColorListSetting.java:50`

```java
@Override protected CompoundTag save(CompoundTag tag)
```

## meteordevelopment.meteorclient.settings.ColorListSetting.load

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/ColorListSetting.java:57`

```java
@Override protected List<SettingColor> load(CompoundTag tag)
```

## meteordevelopment.meteorclient.settings.ColorListSetting.Builder

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/ColorListSetting.java:68`

```java
public static class Builder extends SettingBuilder<Builder, List<SettingColor>, ColorListSetting>
```

## meteordevelopment.meteorclient.settings.ColorListSetting.Builder.Builder

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/ColorListSetting.java:69`

```java
public Builder()
```

## meteordevelopment.meteorclient.settings.ColorListSetting.Builder.build

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/ColorListSetting.java:73`

```java
@Override public ColorListSetting build()
```

## meteordevelopment.meteorclient.settings.ColorSetting

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/ColorSetting.java:15`

```java
public class ColorSetting extends Setting<SettingColor>
```

## meteordevelopment.meteorclient.settings.ColorSetting.ColorSetting

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/ColorSetting.java:18`

```java
public ColorSetting(String name, String description, SettingColor defaultValue, Consumer<SettingColor> onChanged, Consumer<Setting<SettingColor>> onModuleActivated, IVisible visible)
```

## meteordevelopment.meteorclient.settings.ColorSetting.parseImpl

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/ColorSetting.java:22`

```java
@Override protected SettingColor parseImpl(String str)
```

## meteordevelopment.meteorclient.settings.ColorSetting.resetImpl

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/ColorSetting.java:32`

```java
@Override public void resetImpl()
```

## meteordevelopment.meteorclient.settings.ColorSetting.isValueValid

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/ColorSetting.java:38`

```java
@Override protected boolean isValueValid(SettingColor value)
```

## meteordevelopment.meteorclient.settings.ColorSetting.getSuggestions

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/ColorSetting.java:45`

```java
@Override public Iterable<String> getSuggestions()
```

## meteordevelopment.meteorclient.settings.ColorSetting.save

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/ColorSetting.java:50`

```java
@Override protected CompoundTag save(CompoundTag tag)
```

## meteordevelopment.meteorclient.settings.ColorSetting.load

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/ColorSetting.java:57`

```java
@Override public SettingColor load(CompoundTag tag)
```

## meteordevelopment.meteorclient.settings.ColorSetting.Builder

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/ColorSetting.java:64`

```java
public static class Builder extends SettingBuilder<Builder, SettingColor, ColorSetting>
```

## meteordevelopment.meteorclient.settings.ColorSetting.Builder.Builder

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/ColorSetting.java:65`

```java
public Builder()
```

## meteordevelopment.meteorclient.settings.ColorSetting.Builder.build

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/ColorSetting.java:69`

```java
@Override public ColorSetting build()
```

## meteordevelopment.meteorclient.settings.ColorSetting.Builder.defaultValue

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/ColorSetting.java:74`

```java
@Override public Builder defaultValue(SettingColor defaultValue)
```

## meteordevelopment.meteorclient.settings.ColorSetting.Builder.defaultValue

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/ColorSetting.java:80`

```java
public Builder defaultValue(Color defaultValue)
```

## meteordevelopment.meteorclient.settings.DoubleSetting

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/DoubleSetting.java:12`

```java
public class DoubleSetting extends Setting<Double>
```

## meteordevelopment.meteorclient.settings.DoubleSetting.min

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/DoubleSetting.java:13`

```java
public final double min, max
```

## meteordevelopment.meteorclient.settings.DoubleSetting.max

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/DoubleSetting.java:13`

```java
public final double min, max
```

## meteordevelopment.meteorclient.settings.DoubleSetting.sliderMin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/DoubleSetting.java:14`

```java
public final double sliderMin, sliderMax
```

## meteordevelopment.meteorclient.settings.DoubleSetting.sliderMax

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/DoubleSetting.java:14`

```java
public final double sliderMin, sliderMax
```

## meteordevelopment.meteorclient.settings.DoubleSetting.onSliderRelease

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/DoubleSetting.java:15`

```java
public final boolean onSliderRelease
```

## meteordevelopment.meteorclient.settings.DoubleSetting.decimalPlaces

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/DoubleSetting.java:16`

```java
public final int decimalPlaces
```

## meteordevelopment.meteorclient.settings.DoubleSetting.noSlider

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/DoubleSetting.java:17`

```java
public final boolean noSlider
```

## meteordevelopment.meteorclient.settings.DoubleSetting.parseImpl

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/DoubleSetting.java:31`

```java
@Override protected Double parseImpl(String str)
```

## meteordevelopment.meteorclient.settings.DoubleSetting.isValueValid

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/DoubleSetting.java:40`

```java
@Override protected boolean isValueValid(Double value)
```

## meteordevelopment.meteorclient.settings.DoubleSetting.save

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/DoubleSetting.java:45`

```java
@Override protected CompoundTag save(CompoundTag tag)
```

## meteordevelopment.meteorclient.settings.DoubleSetting.load

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/DoubleSetting.java:52`

```java
@Override public Double load(CompoundTag tag)
```

## meteordevelopment.meteorclient.settings.DoubleSetting.Builder

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/DoubleSetting.java:59`

```java
public static class Builder extends SettingBuilder<Builder, Double, DoubleSetting>
```

## meteordevelopment.meteorclient.settings.DoubleSetting.Builder.min

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/DoubleSetting.java:60`

```java
public double min = Double.NEGATIVE_INFINITY, max = Double.POSITIVE_INFINITY
```

## meteordevelopment.meteorclient.settings.DoubleSetting.Builder.max

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/DoubleSetting.java:60`

```java
public double min = Double.NEGATIVE_INFINITY, max = Double.POSITIVE_INFINITY
```

## meteordevelopment.meteorclient.settings.DoubleSetting.Builder.sliderMin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/DoubleSetting.java:61`

```java
public double sliderMin = 0, sliderMax = 10
```

## meteordevelopment.meteorclient.settings.DoubleSetting.Builder.sliderMax

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/DoubleSetting.java:61`

```java
public double sliderMin = 0, sliderMax = 10
```

## meteordevelopment.meteorclient.settings.DoubleSetting.Builder.onSliderRelease

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/DoubleSetting.java:62`

```java
public boolean onSliderRelease = false
```

## meteordevelopment.meteorclient.settings.DoubleSetting.Builder.decimalPlaces

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/DoubleSetting.java:63`

```java
public int decimalPlaces = 3
```

## meteordevelopment.meteorclient.settings.DoubleSetting.Builder.noSlider

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/DoubleSetting.java:64`

```java
public boolean noSlider = false
```

## meteordevelopment.meteorclient.settings.DoubleSetting.Builder.Builder

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/DoubleSetting.java:66`

```java
public Builder()
```

## meteordevelopment.meteorclient.settings.DoubleSetting.Builder.defaultValue

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/DoubleSetting.java:70`

```java
public Builder defaultValue(double defaultValue)
```

## meteordevelopment.meteorclient.settings.DoubleSetting.Builder.min

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/DoubleSetting.java:75`

```java
public Builder min(double min)
```

## meteordevelopment.meteorclient.settings.DoubleSetting.Builder.max

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/DoubleSetting.java:80`

```java
public Builder max(double max)
```

## meteordevelopment.meteorclient.settings.DoubleSetting.Builder.range

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/DoubleSetting.java:85`

```java
public Builder range(double min, double max)
```

## meteordevelopment.meteorclient.settings.DoubleSetting.Builder.sliderMin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/DoubleSetting.java:91`

```java
public Builder sliderMin(double min)
```

## meteordevelopment.meteorclient.settings.DoubleSetting.Builder.sliderMax

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/DoubleSetting.java:96`

```java
public Builder sliderMax(double max)
```

## meteordevelopment.meteorclient.settings.DoubleSetting.Builder.sliderRange

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/DoubleSetting.java:101`

```java
public Builder sliderRange(double min, double max)
```

## meteordevelopment.meteorclient.settings.DoubleSetting.Builder.onSliderRelease

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/DoubleSetting.java:107`

```java
public Builder onSliderRelease()
```

## meteordevelopment.meteorclient.settings.DoubleSetting.Builder.decimalPlaces

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/DoubleSetting.java:112`

```java
public Builder decimalPlaces(int decimalPlaces)
```

## meteordevelopment.meteorclient.settings.DoubleSetting.Builder.noSlider

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/DoubleSetting.java:117`

```java
public Builder noSlider()
```

## meteordevelopment.meteorclient.settings.DoubleSetting.Builder.build

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/DoubleSetting.java:122`

```java
public DoubleSetting build()
```

## meteordevelopment.meteorclient.settings.EnchantmentListSetting

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/EnchantmentListSetting.java:26`

```java
public class EnchantmentListSetting extends Setting<Set<ResourceKey<Enchantment>>>
```

## meteordevelopment.meteorclient.settings.EnchantmentListSetting.EnchantmentListSetting

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/EnchantmentListSetting.java:27`

```java
public EnchantmentListSetting(String name, String description, Set<ResourceKey<Enchantment>> defaultValue, Consumer<Set<ResourceKey<Enchantment>>> onChanged, Consumer<Setting<Set<ResourceKey<Enchantment>>>> onModuleActivated, IVisible visible)
```

## meteordevelopment.meteorclient.settings.EnchantmentListSetting.resetImpl

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/EnchantmentListSetting.java:31`

```java
@Override public void resetImpl()
```

## meteordevelopment.meteorclient.settings.EnchantmentListSetting.parseImpl

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/EnchantmentListSetting.java:36`

```java
@Override protected Set<ResourceKey<Enchantment>> parseImpl(String str)
```

## meteordevelopment.meteorclient.settings.EnchantmentListSetting.isValueValid

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/EnchantmentListSetting.java:54`

```java
@Override protected boolean isValueValid(Set<ResourceKey<Enchantment>> value)
```

## meteordevelopment.meteorclient.settings.EnchantmentListSetting.getIdentifierSuggestions

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/EnchantmentListSetting.java:59`

```java
@Override public Iterable<Identifier> getIdentifierSuggestions()
```

## meteordevelopment.meteorclient.settings.EnchantmentListSetting.save

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/EnchantmentListSetting.java:66`

```java
@Override public CompoundTag save(CompoundTag tag)
```

## meteordevelopment.meteorclient.settings.EnchantmentListSetting.load

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/EnchantmentListSetting.java:77`

```java
@Override public Set<ResourceKey<Enchantment>> load(CompoundTag tag)
```

## meteordevelopment.meteorclient.settings.EnchantmentListSetting.Builder

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/EnchantmentListSetting.java:88`

```java
@SuppressWarnings({"unchecked", "rawtypes"}) public static class Builder extends SettingBuilder<Builder, Set<ResourceKey<Enchantment>>, EnchantmentListSetting>
```

## meteordevelopment.meteorclient.settings.EnchantmentListSetting.Builder.Builder

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/EnchantmentListSetting.java:92`

```java
public Builder()
```

## meteordevelopment.meteorclient.settings.EnchantmentListSetting.Builder.vanillaDefaults

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/EnchantmentListSetting.java:96`

```java
public Builder vanillaDefaults()
```

## meteordevelopment.meteorclient.settings.EnchantmentListSetting.Builder.defaultValue

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/EnchantmentListSetting.java:100`

```java
@SafeVarargs public final Builder defaultValue(ResourceKey<Enchantment>... defaults)
```

## meteordevelopment.meteorclient.settings.EnchantmentListSetting.Builder.build

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/EnchantmentListSetting.java:105`

```java
@Override public EnchantmentListSetting build()
```

## meteordevelopment.meteorclient.settings.EntityTypeListSetting

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/EntityTypeListSetting.java:25`

```java
public class EntityTypeListSetting extends Setting<Set<EntityType<?>>>
```

## meteordevelopment.meteorclient.settings.EntityTypeListSetting.filter

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/EntityTypeListSetting.java:26`

```java
public final Predicate<EntityType<?>> filter
```

## meteordevelopment.meteorclient.settings.EntityTypeListSetting.EntityTypeListSetting

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/EntityTypeListSetting.java:30`

```java
public EntityTypeListSetting(String name, String description, Set<EntityType<?>> defaultValue, Consumer<Set<EntityType<?>>> onChanged, Consumer<Setting<Set<EntityType<?>>>> onModuleActivated, IVisible visible, Predicate<EntityType<?>> filter)
```

## meteordevelopment.meteorclient.settings.EntityTypeListSetting.resetImpl

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/EntityTypeListSetting.java:36`

```java
@Override public void resetImpl()
```

## meteordevelopment.meteorclient.settings.EntityTypeListSetting.parseImpl

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/EntityTypeListSetting.java:41`

```java
@Override protected Set<EntityType<?>> parseImpl(String str)
```

## meteordevelopment.meteorclient.settings.EntityTypeListSetting.isValueValid

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/EntityTypeListSetting.java:86`

```java
@Override protected boolean isValueValid(Set<EntityType<?>> value)
```

## meteordevelopment.meteorclient.settings.EntityTypeListSetting.getSuggestions

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/EntityTypeListSetting.java:91`

```java
@Override public Iterable<String> getSuggestions()
```

## meteordevelopment.meteorclient.settings.EntityTypeListSetting.save

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/EntityTypeListSetting.java:104`

```java
@Override public CompoundTag save(CompoundTag tag)
```

## meteordevelopment.meteorclient.settings.EntityTypeListSetting.load

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/EntityTypeListSetting.java:115`

```java
@Override public Set<EntityType<?>> load(CompoundTag tag)
```

## meteordevelopment.meteorclient.settings.EntityTypeListSetting.Builder

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/EntityTypeListSetting.java:128`

```java
public static class Builder extends SettingBuilder<Builder, Set<EntityType<?>>, EntityTypeListSetting>
```

## meteordevelopment.meteorclient.settings.EntityTypeListSetting.Builder.Builder

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/EntityTypeListSetting.java:131`

```java
public Builder()
```

## meteordevelopment.meteorclient.settings.EntityTypeListSetting.Builder.defaultValue

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/EntityTypeListSetting.java:135`

```java
public Builder defaultValue(EntityType<?>... defaults)
```

## meteordevelopment.meteorclient.settings.EntityTypeListSetting.Builder.onlyAttackable

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/EntityTypeListSetting.java:139`

```java
public Builder onlyAttackable()
```

## meteordevelopment.meteorclient.settings.EntityTypeListSetting.Builder.filter

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/EntityTypeListSetting.java:144`

```java
public Builder filter(Predicate<EntityType<?>> filter)
```

## meteordevelopment.meteorclient.settings.EntityTypeListSetting.Builder.build

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/EntityTypeListSetting.java:149`

```java
@Override public EntityTypeListSetting build()
```

## meteordevelopment.meteorclient.settings.EnumSetting

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/EnumSetting.java:14`

```java
public class EnumSetting<T extends Enum<?>> extends Setting<T>
```

## meteordevelopment.meteorclient.settings.EnumSetting.EnumSetting

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/EnumSetting.java:19`

```java
@SuppressWarnings("unchecked") public EnumSetting(String name, String description, T defaultValue, Consumer<T> onChanged, Consumer<Setting<T>> onModuleActivated, IVisible visible)
```

## meteordevelopment.meteorclient.settings.EnumSetting.parseImpl

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/EnumSetting.java:28`

```java
@Override protected T parseImpl(String str)
```

## meteordevelopment.meteorclient.settings.EnumSetting.isValueValid

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/EnumSetting.java:37`

```java
@Override protected boolean isValueValid(T value)
```

## meteordevelopment.meteorclient.settings.EnumSetting.getSuggestions

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/EnumSetting.java:42`

```java
@Override public Iterable<String> getSuggestions()
```

## meteordevelopment.meteorclient.settings.EnumSetting.save

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/EnumSetting.java:47`

```java
@Override public CompoundTag save(CompoundTag tag)
```

## meteordevelopment.meteorclient.settings.EnumSetting.load

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/EnumSetting.java:54`

```java
@Override public T load(CompoundTag tag)
```

## meteordevelopment.meteorclient.settings.EnumSetting.Builder

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/EnumSetting.java:61`

```java
public static class Builder<T extends Enum<?>> extends SettingBuilder<Builder<T>, T, EnumSetting<T>>
```

## meteordevelopment.meteorclient.settings.EnumSetting.Builder.Builder

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/EnumSetting.java:62`

```java
public Builder()
```

## meteordevelopment.meteorclient.settings.EnumSetting.Builder.build

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/EnumSetting.java:66`

```java
@Override public EnumSetting<T> build()
```

## meteordevelopment.meteorclient.settings.FileSetting

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/FileSetting.java:13`

```java
public class FileSetting extends Setting<File>
```

## meteordevelopment.meteorclient.settings.FileSetting.filter

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/FileSetting.java:15`

```java
public final String filter
```

## meteordevelopment.meteorclient.settings.FileSetting.FileSetting

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/FileSetting.java:17`

```java
public FileSetting(String name, String description, File defaultValue, Consumer<File> onChanged, Consumer<Setting<File>> onModuleActivated, IVisible visible, String filter)
```

## meteordevelopment.meteorclient.settings.FileSetting.parseImpl

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/FileSetting.java:23`

```java
@Override protected File parseImpl(String str)
```

## meteordevelopment.meteorclient.settings.FileSetting.isValueValid

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/FileSetting.java:29`

```java
@Override protected boolean isValueValid(File value)
```

## meteordevelopment.meteorclient.settings.FileSetting.save

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/FileSetting.java:34`

```java
@Override protected CompoundTag save(CompoundTag tag)
```

## meteordevelopment.meteorclient.settings.FileSetting.load

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/FileSetting.java:43`

```java
@Override protected File load(CompoundTag tag)
```

## meteordevelopment.meteorclient.settings.FileSetting.Builder

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/FileSetting.java:52`

```java
public static class Builder extends SettingBuilder<FileSetting.Builder, File, FileSetting>
```

## meteordevelopment.meteorclient.settings.FileSetting.Builder.Builder

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/FileSetting.java:55`

```java
public Builder()
```

## meteordevelopment.meteorclient.settings.FileSetting.Builder.filter

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/FileSetting.java:59`

```java
public FileSetting.Builder filter(String filter)
```

## meteordevelopment.meteorclient.settings.FileSetting.Builder.build

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/FileSetting.java:64`

```java
@Override public FileSetting build()
```

## meteordevelopment.meteorclient.settings.FontFaceSetting

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/FontFaceSetting.java:17`

```java
public class FontFaceSetting extends Setting<FontFace>
```

## meteordevelopment.meteorclient.settings.FontFaceSetting.FontFaceSetting

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/FontFaceSetting.java:20`

```java
public FontFaceSetting(String name, String description, FontFace defaultValue, Consumer<FontFace> onChanged, Consumer<Setting<FontFace>> onModuleActivated, IVisible visible)
```

## meteordevelopment.meteorclient.settings.FontFaceSetting.parseImpl

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/FontFaceSetting.java:24`

```java
@Override protected FontFace parseImpl(String str)
```

## meteordevelopment.meteorclient.settings.FontFaceSetting.getSuggestions

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/FontFaceSetting.java:42`

```java
@Override public Iterable<String> getSuggestions()
```

## meteordevelopment.meteorclient.settings.FontFaceSetting.isValueValid

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/FontFaceSetting.java:47`

```java
@Override protected boolean isValueValid(FontFace value)
```

## meteordevelopment.meteorclient.settings.FontFaceSetting.save

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/FontFaceSetting.java:59`

```java
@Override protected CompoundTag save(CompoundTag tag)
```

## meteordevelopment.meteorclient.settings.FontFaceSetting.load

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/FontFaceSetting.java:66`

```java
@Override protected FontFace load(CompoundTag tag)
```

## meteordevelopment.meteorclient.settings.FontFaceSetting.Builder

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/FontFaceSetting.java:90`

```java
public static class Builder extends SettingBuilder<Builder, FontFace, FontFaceSetting>
```

## meteordevelopment.meteorclient.settings.FontFaceSetting.Builder.Builder

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/FontFaceSetting.java:91`

```java
public Builder()
```

## meteordevelopment.meteorclient.settings.FontFaceSetting.Builder.build

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/FontFaceSetting.java:95`

```java
@Override public FontFaceSetting build()
```

## meteordevelopment.meteorclient.settings.GenericSetting

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/GenericSetting.java:14`

```java
public class GenericSetting<T extends IGeneric<T>> extends Setting<T>
```

## meteordevelopment.meteorclient.settings.GenericSetting.GenericSetting

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/GenericSetting.java:15`

```java
public GenericSetting(String name, String description, T defaultValue, Consumer<T> onChanged, Consumer<Setting<T>> onModuleActivated, IVisible visible)
```

## meteordevelopment.meteorclient.settings.GenericSetting.createScreen

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/GenericSetting.java:19`

```java
public WidgetScreen createScreen(GuiTheme theme)
```

## meteordevelopment.meteorclient.settings.GenericSetting.resetImpl

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/GenericSetting.java:23`

```java
@Override public void resetImpl()
```

## meteordevelopment.meteorclient.settings.GenericSetting.parseImpl

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/GenericSetting.java:29`

```java
@Override protected T parseImpl(String str)
```

## meteordevelopment.meteorclient.settings.GenericSetting.isValueValid

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/GenericSetting.java:34`

```java
@Override protected boolean isValueValid(T value)
```

## meteordevelopment.meteorclient.settings.GenericSetting.save

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/GenericSetting.java:39`

```java
@Override public CompoundTag save(CompoundTag tag)
```

## meteordevelopment.meteorclient.settings.GenericSetting.load

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/GenericSetting.java:46`

```java
@Override public T load(CompoundTag tag)
```

## meteordevelopment.meteorclient.settings.GenericSetting.Builder

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/GenericSetting.java:53`

```java
public static class Builder<T extends IGeneric<T>> extends SettingBuilder<Builder<T>, T, GenericSetting<T>>
```

## meteordevelopment.meteorclient.settings.GenericSetting.Builder.Builder

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/GenericSetting.java:54`

```java
public Builder()
```

## meteordevelopment.meteorclient.settings.GenericSetting.Builder.build

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/GenericSetting.java:58`

```java
@Override public GenericSetting<T> build()
```

## meteordevelopment.meteorclient.settings.IBlockData

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/IBlockData.java:15`

```java
public interface IBlockData<T extends ICopyable<T> & ISerializable<T> & IChangeable & IBlockData<T>>
```

## meteordevelopment.meteorclient.settings.IBlockData.createScreen

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/IBlockData.java:16`

```java
WidgetScreen createScreen(GuiTheme theme, Block block, BlockDataSetting<T> setting)
```

## meteordevelopment.meteorclient.settings.IGeneric

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/IGeneric.java:13`

```java
public interface IGeneric<T extends IGeneric<T>> extends ICopyable<T>, ISerializable<T>
```

## meteordevelopment.meteorclient.settings.IGeneric.createScreen

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/IGeneric.java:14`

```java
WidgetScreen createScreen(GuiTheme theme, GenericSetting<T> setting)
```

## meteordevelopment.meteorclient.settings.IVisible

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/IVisible.java:8`

```java
public interface IVisible
```

## meteordevelopment.meteorclient.settings.IVisible.isVisible

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/IVisible.java:9`

```java
boolean isVisible()
```

## meteordevelopment.meteorclient.settings.IntSetting

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/IntSetting.java:12`

```java
public class IntSetting extends Setting<Integer>
```

## meteordevelopment.meteorclient.settings.IntSetting.min

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/IntSetting.java:13`

```java
public final int min, max
```

## meteordevelopment.meteorclient.settings.IntSetting.max

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/IntSetting.java:13`

```java
public final int min, max
```

## meteordevelopment.meteorclient.settings.IntSetting.sliderMin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/IntSetting.java:14`

```java
public final int sliderMin, sliderMax
```

## meteordevelopment.meteorclient.settings.IntSetting.sliderMax

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/IntSetting.java:14`

```java
public final int sliderMin, sliderMax
```

## meteordevelopment.meteorclient.settings.IntSetting.noSlider

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/IntSetting.java:15`

```java
public final boolean noSlider
```

## meteordevelopment.meteorclient.settings.IntSetting.parseImpl

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/IntSetting.java:27`

```java
@Override protected Integer parseImpl(String str)
```

## meteordevelopment.meteorclient.settings.IntSetting.isValueValid

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/IntSetting.java:36`

```java
@Override protected boolean isValueValid(Integer value)
```

## meteordevelopment.meteorclient.settings.IntSetting.save

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/IntSetting.java:41`

```java
@Override public CompoundTag save(CompoundTag tag)
```

## meteordevelopment.meteorclient.settings.IntSetting.load

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/IntSetting.java:48`

```java
@Override public Integer load(CompoundTag tag)
```

## meteordevelopment.meteorclient.settings.IntSetting.Builder

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/IntSetting.java:55`

```java
public static class Builder extends SettingBuilder<Builder, Integer, IntSetting>
```

## meteordevelopment.meteorclient.settings.IntSetting.Builder.Builder

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/IntSetting.java:60`

```java
public Builder()
```

## meteordevelopment.meteorclient.settings.IntSetting.Builder.min

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/IntSetting.java:64`

```java
public Builder min(int min)
```

## meteordevelopment.meteorclient.settings.IntSetting.Builder.max

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/IntSetting.java:69`

```java
public Builder max(int max)
```

## meteordevelopment.meteorclient.settings.IntSetting.Builder.range

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/IntSetting.java:74`

```java
public Builder range(int min, int max)
```

## meteordevelopment.meteorclient.settings.IntSetting.Builder.sliderMin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/IntSetting.java:80`

```java
public Builder sliderMin(int min)
```

## meteordevelopment.meteorclient.settings.IntSetting.Builder.sliderMax

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/IntSetting.java:85`

```java
public Builder sliderMax(int max)
```

## meteordevelopment.meteorclient.settings.IntSetting.Builder.sliderRange

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/IntSetting.java:90`

```java
public Builder sliderRange(int min, int max)
```

## meteordevelopment.meteorclient.settings.IntSetting.Builder.noSlider

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/IntSetting.java:96`

```java
public Builder noSlider()
```

## meteordevelopment.meteorclient.settings.IntSetting.Builder.build

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/IntSetting.java:101`

```java
@Override public IntSetting build()
```

## meteordevelopment.meteorclient.settings.ItemListSetting

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/ItemListSetting.java:22`

```java
public class ItemListSetting extends Setting<List<Item>>
```

## meteordevelopment.meteorclient.settings.ItemListSetting.filter

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/ItemListSetting.java:23`

```java
public final Predicate<Item> filter
```

## meteordevelopment.meteorclient.settings.ItemListSetting.ItemListSetting

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/ItemListSetting.java:26`

```java
public ItemListSetting(String name, String description, List<Item> defaultValue, Consumer<List<Item>> onChanged, Consumer<Setting<List<Item>>> onModuleActivated, IVisible visible, Predicate<Item> filter, boolean bypassFilterWhenSavingAndLoading)
```

## meteordevelopment.meteorclient.settings.ItemListSetting.parseImpl

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/ItemListSetting.java:33`

```java
@Override protected List<Item> parseImpl(String str)
```

## meteordevelopment.meteorclient.settings.ItemListSetting.resetImpl

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/ItemListSetting.java:49`

```java
@Override public void resetImpl()
```

## meteordevelopment.meteorclient.settings.ItemListSetting.isValueValid

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/ItemListSetting.java:54`

```java
@Override protected boolean isValueValid(List<Item> value)
```

## meteordevelopment.meteorclient.settings.ItemListSetting.getIdentifierSuggestions

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/ItemListSetting.java:59`

```java
@Override public Iterable<Identifier> getIdentifierSuggestions()
```

## meteordevelopment.meteorclient.settings.ItemListSetting.save

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/ItemListSetting.java:64`

```java
@Override public CompoundTag save(CompoundTag tag)
```

## meteordevelopment.meteorclient.settings.ItemListSetting.load

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/ItemListSetting.java:76`

```java
@Override public List<Item> load(CompoundTag tag)
```

## meteordevelopment.meteorclient.settings.ItemListSetting.Builder

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/ItemListSetting.java:90`

```java
public static class Builder extends SettingBuilder<Builder, List<Item>, ItemListSetting>
```

## meteordevelopment.meteorclient.settings.ItemListSetting.Builder.Builder

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/ItemListSetting.java:94`

```java
public Builder()
```

## meteordevelopment.meteorclient.settings.ItemListSetting.Builder.defaultValue

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/ItemListSetting.java:98`

```java
public Builder defaultValue(Item... defaults)
```

## meteordevelopment.meteorclient.settings.ItemListSetting.Builder.filter

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/ItemListSetting.java:102`

```java
public Builder filter(Predicate<Item> filter)
```

## meteordevelopment.meteorclient.settings.ItemListSetting.Builder.bypassFilterWhenSavingAndLoading

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/ItemListSetting.java:107`

```java
public Builder bypassFilterWhenSavingAndLoading()
```

## meteordevelopment.meteorclient.settings.ItemListSetting.Builder.build

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/ItemListSetting.java:112`

```java
@Override public ItemListSetting build()
```

## meteordevelopment.meteorclient.settings.ItemSetting

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/ItemSetting.java:16`

```java
public class ItemSetting extends Setting<Item>
```

## meteordevelopment.meteorclient.settings.ItemSetting.filter

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/ItemSetting.java:17`

```java
public final Predicate<Item> filter
```

## meteordevelopment.meteorclient.settings.ItemSetting.ItemSetting

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/ItemSetting.java:19`

```java
public ItemSetting(String name, String description, Item defaultValue, Consumer<Item> onChanged, Consumer<Setting<Item>> onModuleActivated, IVisible visible, Predicate<Item> filter)
```

## meteordevelopment.meteorclient.settings.ItemSetting.parseImpl

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/ItemSetting.java:25`

```java
@Override protected Item parseImpl(String str)
```

## meteordevelopment.meteorclient.settings.ItemSetting.isValueValid

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/ItemSetting.java:30`

```java
@Override protected boolean isValueValid(Item value)
```

## meteordevelopment.meteorclient.settings.ItemSetting.getIdentifierSuggestions

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/ItemSetting.java:35`

```java
@Override public Iterable<Identifier> getIdentifierSuggestions()
```

## meteordevelopment.meteorclient.settings.ItemSetting.save

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/ItemSetting.java:40`

```java
@Override public CompoundTag save(CompoundTag tag)
```

## meteordevelopment.meteorclient.settings.ItemSetting.load

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/ItemSetting.java:47`

```java
@Override public Item load(CompoundTag tag)
```

## meteordevelopment.meteorclient.settings.ItemSetting.Builder

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/ItemSetting.java:63`

```java
public static class Builder extends SettingBuilder<Builder, Item, ItemSetting>
```

## meteordevelopment.meteorclient.settings.ItemSetting.Builder.Builder

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/ItemSetting.java:66`

```java
public Builder()
```

## meteordevelopment.meteorclient.settings.ItemSetting.Builder.filter

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/ItemSetting.java:70`

```java
public Builder filter(Predicate<Item> filter)
```

## meteordevelopment.meteorclient.settings.ItemSetting.Builder.build

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/ItemSetting.java:75`

```java
@Override public ItemSetting build()
```

## meteordevelopment.meteorclient.settings.KeybindSetting

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/KeybindSetting.java:21`

```java
public class KeybindSetting extends Setting<Keybind>
```

## meteordevelopment.meteorclient.settings.KeybindSetting.widget

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/KeybindSetting.java:23`

```java
public WKeybind widget
```

## meteordevelopment.meteorclient.settings.KeybindSetting.KeybindSetting

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/KeybindSetting.java:25`

```java
public KeybindSetting(String name, String description, Keybind defaultValue, Consumer<Keybind> onChanged, Consumer<Setting<Keybind>> onModuleActivated, IVisible visible, Runnable action)
```

## meteordevelopment.meteorclient.settings.KeybindSetting.resetImpl

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/KeybindSetting.java:60`

```java
@Override public void resetImpl()
```

## meteordevelopment.meteorclient.settings.KeybindSetting.parseImpl

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/KeybindSetting.java:68`

```java
@Override protected Keybind parseImpl(String str)
```

## meteordevelopment.meteorclient.settings.KeybindSetting.isValueValid

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/KeybindSetting.java:77`

```java
@Override protected boolean isValueValid(Keybind value)
```

## meteordevelopment.meteorclient.settings.KeybindSetting.save

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/KeybindSetting.java:82`

```java
@Override public CompoundTag save(CompoundTag tag)
```

## meteordevelopment.meteorclient.settings.KeybindSetting.load

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/KeybindSetting.java:89`

```java
@Override public Keybind load(CompoundTag tag)
```

## meteordevelopment.meteorclient.settings.KeybindSetting.Builder

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/KeybindSetting.java:96`

```java
public static class Builder extends SettingBuilder<Builder, Keybind, KeybindSetting>
```

## meteordevelopment.meteorclient.settings.KeybindSetting.Builder.Builder

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/KeybindSetting.java:99`

```java
public Builder()
```

## meteordevelopment.meteorclient.settings.KeybindSetting.Builder.action

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/KeybindSetting.java:103`

```java
public Builder action(Runnable action)
```

## meteordevelopment.meteorclient.settings.KeybindSetting.Builder.build

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/KeybindSetting.java:108`

```java
@Override public KeybindSetting build()
```

## meteordevelopment.meteorclient.settings.LongSetting

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/LongSetting.java:12`

```java
public class LongSetting extends Setting<Long>
```

## meteordevelopment.meteorclient.settings.LongSetting.min

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/LongSetting.java:13`

```java
public final long min, max
```

## meteordevelopment.meteorclient.settings.LongSetting.max

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/LongSetting.java:13`

```java
public final long min, max
```

## meteordevelopment.meteorclient.settings.LongSetting.parseImpl

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/LongSetting.java:22`

```java
@Override protected Long parseImpl(String str)
```

## meteordevelopment.meteorclient.settings.LongSetting.isValueValid

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/LongSetting.java:31`

```java
@Override protected boolean isValueValid(Long value)
```

## meteordevelopment.meteorclient.settings.LongSetting.save

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/LongSetting.java:36`

```java
@Override public CompoundTag save(CompoundTag tag)
```

## meteordevelopment.meteorclient.settings.LongSetting.load

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/LongSetting.java:43`

```java
@Override public Long load(CompoundTag tag)
```

## meteordevelopment.meteorclient.settings.LongSetting.Builder

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/LongSetting.java:50`

```java
public static class Builder extends SettingBuilder<Builder, Long, LongSetting>
```

## meteordevelopment.meteorclient.settings.LongSetting.Builder.Builder

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/LongSetting.java:53`

```java
public Builder()
```

## meteordevelopment.meteorclient.settings.LongSetting.Builder.min

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/LongSetting.java:57`

```java
public Builder min(long min)
```

## meteordevelopment.meteorclient.settings.LongSetting.Builder.max

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/LongSetting.java:62`

```java
public Builder max(long max)
```

## meteordevelopment.meteorclient.settings.LongSetting.Builder.range

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/LongSetting.java:67`

```java
public Builder range(long min, long max)
```

## meteordevelopment.meteorclient.settings.LongSetting.Builder.build

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/LongSetting.java:73`

```java
@Override public LongSetting build()
```

## meteordevelopment.meteorclient.settings.ModuleListSetting

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/ModuleListSetting.java:19`

```java
public class ModuleListSetting extends Setting<List<Module>>
```

## meteordevelopment.meteorclient.settings.ModuleListSetting.ModuleListSetting

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/ModuleListSetting.java:22`

```java
public ModuleListSetting(String name, String description, List<Module> defaultValue, Consumer<List<Module>> onChanged, Consumer<Setting<List<Module>>> onModuleActivated, IVisible visible)
```

## meteordevelopment.meteorclient.settings.ModuleListSetting.resetImpl

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/ModuleListSetting.java:26`

```java
@Override public void resetImpl()
```

## meteordevelopment.meteorclient.settings.ModuleListSetting.parseImpl

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/ModuleListSetting.java:31`

```java
@Override protected List<Module> parseImpl(String str)
```

## meteordevelopment.meteorclient.settings.ModuleListSetting.isValueValid

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/ModuleListSetting.java:47`

```java
@Override protected boolean isValueValid(List<Module> value)
```

## meteordevelopment.meteorclient.settings.ModuleListSetting.getSuggestions

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/ModuleListSetting.java:52`

```java
@Override public Iterable<String> getSuggestions()
```

## meteordevelopment.meteorclient.settings.ModuleListSetting.save

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/ModuleListSetting.java:63`

```java
@Override public CompoundTag save(CompoundTag tag)
```

## meteordevelopment.meteorclient.settings.ModuleListSetting.load

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/ModuleListSetting.java:72`

```java
@Override public List<Module> load(CompoundTag tag)
```

## meteordevelopment.meteorclient.settings.ModuleListSetting.Builder

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/ModuleListSetting.java:85`

```java
public static class Builder extends SettingBuilder<Builder, List<Module>, ModuleListSetting>
```

## meteordevelopment.meteorclient.settings.ModuleListSetting.Builder.Builder

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/ModuleListSetting.java:86`

```java
public Builder()
```

## meteordevelopment.meteorclient.settings.ModuleListSetting.Builder.defaultValue

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/ModuleListSetting.java:90`

```java
@SafeVarargs public final Builder defaultValue(Class<? extends Module>... defaults)
```

## meteordevelopment.meteorclient.settings.ModuleListSetting.Builder.build

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/ModuleListSetting.java:101`

```java
@Override public ModuleListSetting build()
```

## meteordevelopment.meteorclient.settings.PacketListSetting

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/PacketListSetting.java:23`

```java
public class PacketListSetting extends Setting<Set<PacketType<? extends @NonNull Packet<?>>>>
```

## meteordevelopment.meteorclient.settings.PacketListSetting.filter

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/PacketListSetting.java:24`

```java
public final Predicate<PacketType<? extends @NonNull Packet<?>>> filter
```

## meteordevelopment.meteorclient.settings.PacketListSetting.PacketListSetting

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/PacketListSetting.java:26`

```java
public PacketListSetting(String name, String description, Set<PacketType<? extends @NonNull Packet<?>>> defaultValue, Consumer<Set<PacketType<? extends @NonNull Packet<?>>>> onChanged, Consumer<Setting<Set<PacketType<? extends @NonNull Packet<?>>>>> onModuleActivated, Predicate<PacketType<? extends @NonNull Packet<?>>> filter, IVisible visible)
```

## meteordevelopment.meteorclient.settings.PacketListSetting.resetImpl

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/PacketListSetting.java:32`

```java
@Override public void resetImpl()
```

## meteordevelopment.meteorclient.settings.PacketListSetting.parseImpl

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/PacketListSetting.java:37`

```java
@Override protected Set<PacketType<? extends @NonNull Packet<?>>> parseImpl(String str)
```

## meteordevelopment.meteorclient.settings.PacketListSetting.isValueValid

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/PacketListSetting.java:53`

```java
@Override protected boolean isValueValid(Set<PacketType<? extends @NonNull Packet<?>>> value)
```

## meteordevelopment.meteorclient.settings.PacketListSetting.getSuggestions

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/PacketListSetting.java:58`

```java
@Override public Iterable<String> getSuggestions()
```

## meteordevelopment.meteorclient.settings.PacketListSetting.save

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/PacketListSetting.java:65`

```java
@Override public CompoundTag save(CompoundTag tag)
```

## meteordevelopment.meteorclient.settings.PacketListSetting.load

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/PacketListSetting.java:76`

```java
@Override public Set<PacketType<? extends @NonNull Packet<?>>> load(CompoundTag tag)
```

## meteordevelopment.meteorclient.settings.PacketListSetting.Builder

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/PacketListSetting.java:91`

```java
public static class Builder extends SettingBuilder<Builder, Set<PacketType<? extends @NonNull Packet<?>>>, PacketListSetting>
```

## meteordevelopment.meteorclient.settings.PacketListSetting.Builder.Builder

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/PacketListSetting.java:94`

```java
public Builder()
```

## meteordevelopment.meteorclient.settings.PacketListSetting.Builder.filter

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/PacketListSetting.java:98`

```java
public Builder filter(Predicate<PacketType<? extends @NonNull Packet<?>>> filter)
```

## meteordevelopment.meteorclient.settings.PacketListSetting.Builder.clientbound

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/PacketListSetting.java:103`

```java
public Builder clientbound()
```

## meteordevelopment.meteorclient.settings.PacketListSetting.Builder.serverbound

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/PacketListSetting.java:107`

```java
public Builder serverbound()
```

## meteordevelopment.meteorclient.settings.PacketListSetting.Builder.build

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/PacketListSetting.java:111`

```java
@Override public PacketListSetting build()
```

## meteordevelopment.meteorclient.settings.ParticleTypeListSetting

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/ParticleTypeListSetting.java:21`

```java
public class ParticleTypeListSetting extends Setting<List<ParticleType<?>>>
```

## meteordevelopment.meteorclient.settings.ParticleTypeListSetting.ParticleTypeListSetting

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/ParticleTypeListSetting.java:22`

```java
public ParticleTypeListSetting(String name, String description, List<ParticleType<?>> defaultValue, Consumer<List<ParticleType<?>>> onChanged, Consumer<Setting<List<ParticleType<?>>>> onModuleActivated, IVisible visible)
```

## meteordevelopment.meteorclient.settings.ParticleTypeListSetting.resetImpl

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/ParticleTypeListSetting.java:26`

```java
@Override public void resetImpl()
```

## meteordevelopment.meteorclient.settings.ParticleTypeListSetting.parseImpl

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/ParticleTypeListSetting.java:31`

```java
@Override protected List<ParticleType<?>> parseImpl(String str)
```

## meteordevelopment.meteorclient.settings.ParticleTypeListSetting.isValueValid

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/ParticleTypeListSetting.java:47`

```java
@Override protected boolean isValueValid(List<ParticleType<?>> value)
```

## meteordevelopment.meteorclient.settings.ParticleTypeListSetting.getIdentifierSuggestions

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/ParticleTypeListSetting.java:52`

```java
@Override public Iterable<Identifier> getIdentifierSuggestions()
```

## meteordevelopment.meteorclient.settings.ParticleTypeListSetting.save

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/ParticleTypeListSetting.java:57`

```java
@Override public CompoundTag save(CompoundTag tag)
```

## meteordevelopment.meteorclient.settings.ParticleTypeListSetting.load

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/ParticleTypeListSetting.java:69`

```java
@Override public List<ParticleType<?>> load(CompoundTag tag)
```

## meteordevelopment.meteorclient.settings.ParticleTypeListSetting.Builder

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/ParticleTypeListSetting.java:82`

```java
public static class Builder extends SettingBuilder<Builder, List<ParticleType<?>>, ParticleTypeListSetting>
```

## meteordevelopment.meteorclient.settings.ParticleTypeListSetting.Builder.Builder

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/ParticleTypeListSetting.java:83`

```java
public Builder()
```

## meteordevelopment.meteorclient.settings.ParticleTypeListSetting.Builder.defaultValue

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/ParticleTypeListSetting.java:87`

```java
public Builder defaultValue(ParticleType<?>... defaults)
```

## meteordevelopment.meteorclient.settings.ParticleTypeListSetting.Builder.build

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/ParticleTypeListSetting.java:91`

```java
@Override public ParticleTypeListSetting build()
```

## meteordevelopment.meteorclient.settings.PotionSetting

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/PotionSetting.java:12`

```java
public class PotionSetting extends EnumSetting<MyPotion>
```

## meteordevelopment.meteorclient.settings.PotionSetting.PotionSetting

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/PotionSetting.java:13`

```java
public PotionSetting(String name, String description, MyPotion defaultValue, Consumer<MyPotion> onChanged, Consumer<Setting<MyPotion>> onModuleActivated, IVisible visible)
```

## meteordevelopment.meteorclient.settings.PotionSetting.Builder

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/PotionSetting.java:17`

```java
public static class Builder extends EnumSetting.Builder<MyPotion>
```

## meteordevelopment.meteorclient.settings.PotionSetting.Builder.build

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/PotionSetting.java:18`

```java
@Override public EnumSetting<MyPotion> build()
```

## meteordevelopment.meteorclient.settings.ProvidedStringSetting

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/ProvidedStringSetting.java:13`

```java
public class ProvidedStringSetting extends StringSetting
```

## meteordevelopment.meteorclient.settings.ProvidedStringSetting.supplier

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/ProvidedStringSetting.java:14`

```java
public final Supplier<String[]> supplier
```

## meteordevelopment.meteorclient.settings.ProvidedStringSetting.ProvidedStringSetting

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/ProvidedStringSetting.java:16`

```java
public ProvidedStringSetting(String name, String description, String defaultValue, Consumer<String> onChanged, Consumer<Setting<String>> onModuleActivated, IVisible visible, Class<? extends WTextBox.Renderer> renderer, boolean wide, Supplier<String[]> supplier)
```

## meteordevelopment.meteorclient.settings.ProvidedStringSetting.Builder

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/ProvidedStringSetting.java:22`

```java
public static class Builder extends SettingBuilder<Builder, String, ProvidedStringSetting>
```

## meteordevelopment.meteorclient.settings.ProvidedStringSetting.Builder.Builder

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/ProvidedStringSetting.java:27`

```java
public Builder()
```

## meteordevelopment.meteorclient.settings.ProvidedStringSetting.Builder.renderer

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/ProvidedStringSetting.java:31`

```java
public Builder renderer(Class<? extends WTextBox.Renderer> renderer)
```

## meteordevelopment.meteorclient.settings.ProvidedStringSetting.Builder.supplier

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/ProvidedStringSetting.java:36`

```java
public Builder supplier(Supplier<String[]> supplier)
```

## meteordevelopment.meteorclient.settings.ProvidedStringSetting.Builder.wide

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/ProvidedStringSetting.java:41`

```java
public Builder wide()
```

## meteordevelopment.meteorclient.settings.ProvidedStringSetting.Builder.build

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/ProvidedStringSetting.java:46`

```java
@Override public ProvidedStringSetting build()
```

## meteordevelopment.meteorclient.settings.ScreenHandlerListSetting

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/ScreenHandlerListSetting.java:21`

```java
public class ScreenHandlerListSetting extends Setting<List<MenuType<?>>>
```

## meteordevelopment.meteorclient.settings.ScreenHandlerListSetting.ScreenHandlerListSetting

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/ScreenHandlerListSetting.java:22`

```java
public ScreenHandlerListSetting(String name, String description, List<MenuType<?>> defaultValue, Consumer<List<MenuType<?>>> onChanged, Consumer<Setting<List<MenuType<?>>>> onModuleActivated, IVisible visible)
```

## meteordevelopment.meteorclient.settings.ScreenHandlerListSetting.resetImpl

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/ScreenHandlerListSetting.java:26`

```java
@Override public void resetImpl()
```

## meteordevelopment.meteorclient.settings.ScreenHandlerListSetting.parseImpl

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/ScreenHandlerListSetting.java:31`

```java
@Override protected List<MenuType<?>> parseImpl(String str)
```

## meteordevelopment.meteorclient.settings.ScreenHandlerListSetting.isValueValid

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/ScreenHandlerListSetting.java:47`

```java
@Override protected boolean isValueValid(List<MenuType<?>> value)
```

## meteordevelopment.meteorclient.settings.ScreenHandlerListSetting.getIdentifierSuggestions

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/ScreenHandlerListSetting.java:52`

```java
@Override public Iterable<Identifier> getIdentifierSuggestions()
```

## meteordevelopment.meteorclient.settings.ScreenHandlerListSetting.save

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/ScreenHandlerListSetting.java:57`

```java
@Override public CompoundTag save(CompoundTag tag)
```

## meteordevelopment.meteorclient.settings.ScreenHandlerListSetting.load

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/ScreenHandlerListSetting.java:69`

```java
@Override public List<MenuType<?>> load(CompoundTag tag)
```

## meteordevelopment.meteorclient.settings.ScreenHandlerListSetting.Builder

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/ScreenHandlerListSetting.java:82`

```java
public static class Builder extends SettingBuilder<Builder, List<MenuType<?>>, ScreenHandlerListSetting>
```

## meteordevelopment.meteorclient.settings.ScreenHandlerListSetting.Builder.Builder

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/ScreenHandlerListSetting.java:83`

```java
public Builder()
```

## meteordevelopment.meteorclient.settings.ScreenHandlerListSetting.Builder.defaultValue

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/ScreenHandlerListSetting.java:87`

```java
public Builder defaultValue(MenuType<?>... defaults)
```

## meteordevelopment.meteorclient.settings.ScreenHandlerListSetting.Builder.build

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/ScreenHandlerListSetting.java:91`

```java
@Override public ScreenHandlerListSetting build()
```

## meteordevelopment.meteorclient.settings.Setting

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/Setting.java:21`

```java
public abstract class Setting<T> implements IGetter<T>, ISerializable<T>
```

## meteordevelopment.meteorclient.settings.Setting.name

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/Setting.java:24`

```java
public final String name, title, description
```

## meteordevelopment.meteorclient.settings.Setting.title

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/Setting.java:24`

```java
public final String name, title, description
```

## meteordevelopment.meteorclient.settings.Setting.description

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/Setting.java:24`

```java
public final String name, title, description
```

## meteordevelopment.meteorclient.settings.Setting.defaultValue

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/Setting.java:27`

```java
protected final T defaultValue
```

## meteordevelopment.meteorclient.settings.Setting.value

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/Setting.java:28`

```java
protected T value
```

## meteordevelopment.meteorclient.settings.Setting.onModuleActivated

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/Setting.java:30`

```java
public final Consumer<Setting<T>> onModuleActivated
```

## meteordevelopment.meteorclient.settings.Setting.module

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/Setting.java:33`

```java
public Module module
```

## meteordevelopment.meteorclient.settings.Setting.lastWasVisible

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/Setting.java:34`

```java
public boolean lastWasVisible
```

## meteordevelopment.meteorclient.settings.Setting.Setting

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/Setting.java:36`

```java
public Setting(String name, String description, T defaultValue, Consumer<T> onChanged, Consumer<Setting<T>> onModuleActivated, IVisible visible)
```

## meteordevelopment.meteorclient.settings.Setting.get

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/Setting.java:48`

```java
@Override public T get()
```

## meteordevelopment.meteorclient.settings.Setting.set

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/Setting.java:53`

```java
public boolean set(T value)
```

## meteordevelopment.meteorclient.settings.Setting.resetImpl

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/Setting.java:60`

```java
protected void resetImpl()
```

## meteordevelopment.meteorclient.settings.Setting.reset

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/Setting.java:64`

```java
public void reset()
```

## meteordevelopment.meteorclient.settings.Setting.getDefaultValue

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/Setting.java:69`

```java
public T getDefaultValue()
```

## meteordevelopment.meteorclient.settings.Setting.parse

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/Setting.java:73`

```java
public boolean parse(String str)
```

## meteordevelopment.meteorclient.settings.Setting.wasChanged

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/Setting.java:86`

```java
public boolean wasChanged()
```

## meteordevelopment.meteorclient.settings.Setting.onChanged

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/Setting.java:90`

```java
public void onChanged()
```

## meteordevelopment.meteorclient.settings.Setting.onActivated

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/Setting.java:94`

```java
public void onActivated()
```

## meteordevelopment.meteorclient.settings.Setting.isVisible

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/Setting.java:98`

```java
public boolean isVisible()
```

## meteordevelopment.meteorclient.settings.Setting.parseImpl

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/Setting.java:102`

```java
protected abstract T parseImpl(String str)
```

## meteordevelopment.meteorclient.settings.Setting.isValueValid

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/Setting.java:104`

```java
protected abstract boolean isValueValid(T value)
```

## meteordevelopment.meteorclient.settings.Setting.getIdentifierSuggestions

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/Setting.java:106`

```java
public Iterable<Identifier> getIdentifierSuggestions()
```

## meteordevelopment.meteorclient.settings.Setting.getSuggestions

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/Setting.java:110`

```java
public Iterable<String> getSuggestions()
```

## meteordevelopment.meteorclient.settings.Setting.save

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/Setting.java:114`

```java
protected abstract CompoundTag save(CompoundTag tag)
```

## meteordevelopment.meteorclient.settings.Setting.toTag

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/Setting.java:116`

```java
@Override public CompoundTag toTag()
```

## meteordevelopment.meteorclient.settings.Setting.load

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/Setting.java:126`

```java
protected abstract T load(CompoundTag tag)
```

## meteordevelopment.meteorclient.settings.Setting.fromTag

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/Setting.java:128`

```java
@Override public T fromTag(CompoundTag tag)
```

## meteordevelopment.meteorclient.settings.Setting.toString

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/Setting.java:136`

```java
@Override public String toString()
```

## meteordevelopment.meteorclient.settings.Setting.equals

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/Setting.java:141`

```java
@Override public boolean equals(Object o)
```

## meteordevelopment.meteorclient.settings.Setting.hashCode

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/Setting.java:149`

```java
@Override public int hashCode()
```

## meteordevelopment.meteorclient.settings.Setting.parseId

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/Setting.java:154`

```java
@Nullable public static <T> T parseId(Registry<T> registry, String name)
```

## meteordevelopment.meteorclient.settings.Setting.SettingBuilder

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/Setting.java:166`

```java
@SuppressWarnings("unchecked") public abstract static class SettingBuilder<B, V, S>
```

## meteordevelopment.meteorclient.settings.Setting.SettingBuilder.name

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/Setting.java:168`

```java
protected String name = "undefined", description = ""
```

## meteordevelopment.meteorclient.settings.Setting.SettingBuilder.description

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/Setting.java:168`

```java
protected String name = "undefined", description = ""
```

## meteordevelopment.meteorclient.settings.Setting.SettingBuilder.defaultValue

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/Setting.java:169`

```java
protected V defaultValue
```

## meteordevelopment.meteorclient.settings.Setting.SettingBuilder.visible

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/Setting.java:170`

```java
protected IVisible visible
```

## meteordevelopment.meteorclient.settings.Setting.SettingBuilder.onChanged

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/Setting.java:171`

```java
protected Consumer<V> onChanged
```

## meteordevelopment.meteorclient.settings.Setting.SettingBuilder.onModuleActivated

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/Setting.java:172`

```java
protected Consumer<Setting<V>> onModuleActivated
```

## meteordevelopment.meteorclient.settings.Setting.SettingBuilder.SettingBuilder

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/Setting.java:174`

```java
protected SettingBuilder(V defaultValue)
```

## meteordevelopment.meteorclient.settings.Setting.SettingBuilder.name

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/Setting.java:178`

```java
public B name(String name)
```

## meteordevelopment.meteorclient.settings.Setting.SettingBuilder.description

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/Setting.java:183`

```java
public B description(String description)
```

## meteordevelopment.meteorclient.settings.Setting.SettingBuilder.defaultValue

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/Setting.java:188`

```java
public B defaultValue(V defaultValue)
```

## meteordevelopment.meteorclient.settings.Setting.SettingBuilder.visible

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/Setting.java:193`

```java
public B visible(IVisible visible)
```

## meteordevelopment.meteorclient.settings.Setting.SettingBuilder.onChanged

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/Setting.java:198`

```java
public B onChanged(Consumer<V> onChanged)
```

## meteordevelopment.meteorclient.settings.Setting.SettingBuilder.onModuleActivated

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/Setting.java:203`

```java
public B onModuleActivated(Consumer<Setting<V>> onModuleActivated)
```

## meteordevelopment.meteorclient.settings.Setting.SettingBuilder.build

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/Setting.java:208`

```java
public abstract S build()
```

## meteordevelopment.meteorclient.settings.SettingGroup

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/SettingGroup.java:18`

```java
public class SettingGroup implements ISerializable<SettingGroup>, Iterable<Setting<?>>
```

## meteordevelopment.meteorclient.settings.SettingGroup.name

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/SettingGroup.java:19`

```java
public final String name
```

## meteordevelopment.meteorclient.settings.SettingGroup.sectionExpanded

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/SettingGroup.java:20`

```java
public boolean sectionExpanded
```

## meteordevelopment.meteorclient.settings.SettingGroup.get

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/SettingGroup.java:29`

```java
public Setting<?> get(String name)
```

## meteordevelopment.meteorclient.settings.SettingGroup.add

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/SettingGroup.java:37`

```java
public <T extends Setting<?>> T add(T setting)
```

## meteordevelopment.meteorclient.settings.SettingGroup.getByIndex

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/SettingGroup.java:43`

```java
public Setting<?> getByIndex(int index)
```

## meteordevelopment.meteorclient.settings.SettingGroup.wasChanged

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/SettingGroup.java:47`

```java
public boolean wasChanged()
```

## meteordevelopment.meteorclient.settings.SettingGroup.iterator

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/SettingGroup.java:54`

```java
@Override public @NonNull Iterator<Setting<?>> iterator()
```

## meteordevelopment.meteorclient.settings.SettingGroup.toTag

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/SettingGroup.java:59`

```java
@Override public CompoundTag toTag()
```

## meteordevelopment.meteorclient.settings.SettingGroup.fromTag

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/SettingGroup.java:75`

```java
@Override public SettingGroup fromTag(CompoundTag tag)
```

## meteordevelopment.meteorclient.settings.Settings

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/Settings.java:23`

```java
public class Settings implements ISerializable<Settings>, Iterable<SettingGroup>
```

## meteordevelopment.meteorclient.settings.Settings.groups

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/Settings.java:27`

```java
public final List<SettingGroup> groups = new ArrayList<>(1)
```

## meteordevelopment.meteorclient.settings.Settings.onActivated

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/Settings.java:29`

```java
public void onActivated()
```

## meteordevelopment.meteorclient.settings.Settings.get

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/Settings.java:37`

```java
public Setting<?> get(String name)
```

## meteordevelopment.meteorclient.settings.Settings.get

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/Settings.java:47`

```java
@SuppressWarnings("unchecked") public <T> Setting<T> get(String name, Class<T> tClass)
```

## meteordevelopment.meteorclient.settings.Settings.reset

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/Settings.java:60`

```java
public void reset()
```

## meteordevelopment.meteorclient.settings.Settings.invalidate

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/Settings.java:70`

```java
public void invalidate()
```

## meteordevelopment.meteorclient.settings.Settings.getGroup

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/Settings.java:74`

```java
public SettingGroup getGroup(String name)
```

## meteordevelopment.meteorclient.settings.Settings.sizeGroups

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/Settings.java:82`

```java
public int sizeGroups()
```

## meteordevelopment.meteorclient.settings.Settings.getDefaultGroup

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/Settings.java:86`

```java
public SettingGroup getDefaultGroup()
```

## meteordevelopment.meteorclient.settings.Settings.createGroup

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/Settings.java:91`

```java
public SettingGroup createGroup(String name, boolean expanded)
```

## meteordevelopment.meteorclient.settings.Settings.createGroup

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/Settings.java:97`

```java
public SettingGroup createGroup(String name)
```

## meteordevelopment.meteorclient.settings.Settings.registerColorSettings

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/Settings.java:101`

```java
@SuppressWarnings("unchecked") public void registerColorSettings(Module module)
```

## meteordevelopment.meteorclient.settings.Settings.unregisterColorSettings

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/Settings.java:116`

```java
@SuppressWarnings("unchecked") public void unregisterColorSettings()
```

## meteordevelopment.meteorclient.settings.Settings.tick

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/Settings.java:129`

```java
public void tick(WContainer settings, GuiTheme theme)
```

## meteordevelopment.meteorclient.settings.Settings.iterator

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/Settings.java:151`

```java
@Override public @NonNull Iterator<SettingGroup> iterator()
```

## meteordevelopment.meteorclient.settings.Settings.toTag

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/Settings.java:156`

```java
@Override public CompoundTag toTag()
```

## meteordevelopment.meteorclient.settings.Settings.fromTag

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/Settings.java:169`

```java
@Override public Settings fromTag(CompoundTag tag)
```

## meteordevelopment.meteorclient.settings.SoundEventListSetting

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/SoundEventListSetting.java:21`

```java
public class SoundEventListSetting extends Setting<List<SoundEvent>>
```

## meteordevelopment.meteorclient.settings.SoundEventListSetting.SoundEventListSetting

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/SoundEventListSetting.java:22`

```java
public SoundEventListSetting(String name, String description, List<SoundEvent> defaultValue, Consumer<List<SoundEvent>> onChanged, Consumer<Setting<List<SoundEvent>>> onModuleActivated, IVisible visible)
```

## meteordevelopment.meteorclient.settings.SoundEventListSetting.resetImpl

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/SoundEventListSetting.java:26`

```java
@Override public void resetImpl()
```

## meteordevelopment.meteorclient.settings.SoundEventListSetting.parseImpl

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/SoundEventListSetting.java:31`

```java
@Override protected List<SoundEvent> parseImpl(String str)
```

## meteordevelopment.meteorclient.settings.SoundEventListSetting.isValueValid

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/SoundEventListSetting.java:47`

```java
@Override protected boolean isValueValid(List<SoundEvent> value)
```

## meteordevelopment.meteorclient.settings.SoundEventListSetting.getIdentifierSuggestions

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/SoundEventListSetting.java:52`

```java
@Override public Iterable<Identifier> getIdentifierSuggestions()
```

## meteordevelopment.meteorclient.settings.SoundEventListSetting.save

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/SoundEventListSetting.java:57`

```java
@Override public CompoundTag save(CompoundTag tag)
```

## meteordevelopment.meteorclient.settings.SoundEventListSetting.load

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/SoundEventListSetting.java:69`

```java
@Override public List<SoundEvent> load(CompoundTag tag)
```

## meteordevelopment.meteorclient.settings.SoundEventListSetting.Builder

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/SoundEventListSetting.java:81`

```java
public static class Builder extends SettingBuilder<Builder, List<SoundEvent>, SoundEventListSetting>
```

## meteordevelopment.meteorclient.settings.SoundEventListSetting.Builder.Builder

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/SoundEventListSetting.java:82`

```java
public Builder()
```

## meteordevelopment.meteorclient.settings.SoundEventListSetting.Builder.defaultValue

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/SoundEventListSetting.java:86`

```java
public Builder defaultValue(SoundEvent... defaults)
```

## meteordevelopment.meteorclient.settings.SoundEventListSetting.Builder.build

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/SoundEventListSetting.java:90`

```java
@Override public SoundEventListSetting build()
```

## meteordevelopment.meteorclient.settings.StatusEffectAmplifierMapSetting

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/StatusEffectAmplifierMapSetting.java:18`

```java
public class StatusEffectAmplifierMapSetting extends Setting<Reference2IntMap<MobEffect>>
```

## meteordevelopment.meteorclient.settings.StatusEffectAmplifierMapSetting.EMPTY_STATUS_EFFECT_MAP

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/StatusEffectAmplifierMapSetting.java:19`

```java
public static final Reference2IntMap<MobEffect> EMPTY_STATUS_EFFECT_MAP = createStatusEffectMap()
```

## meteordevelopment.meteorclient.settings.StatusEffectAmplifierMapSetting.StatusEffectAmplifierMapSetting

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/StatusEffectAmplifierMapSetting.java:21`

```java
public StatusEffectAmplifierMapSetting(String name, String description, Reference2IntMap<MobEffect> defaultValue, Consumer<Reference2IntMap<MobEffect>> onChanged, Consumer<Setting<Reference2IntMap<MobEffect>>> onModuleActivated, IVisible visible)
```

## meteordevelopment.meteorclient.settings.StatusEffectAmplifierMapSetting.resetImpl

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/StatusEffectAmplifierMapSetting.java:25`

```java
@Override public void resetImpl()
```

## meteordevelopment.meteorclient.settings.StatusEffectAmplifierMapSetting.parseImpl

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/StatusEffectAmplifierMapSetting.java:30`

```java
@Override protected Reference2IntMap<MobEffect> parseImpl(String str)
```

## meteordevelopment.meteorclient.settings.StatusEffectAmplifierMapSetting.isValueValid

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/StatusEffectAmplifierMapSetting.java:50`

```java
@Override protected boolean isValueValid(Reference2IntMap<MobEffect> value)
```

## meteordevelopment.meteorclient.settings.StatusEffectAmplifierMapSetting.save

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/StatusEffectAmplifierMapSetting.java:55`

```java
@Override public CompoundTag save(CompoundTag tag)
```

## meteordevelopment.meteorclient.settings.StatusEffectAmplifierMapSetting.load

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/StatusEffectAmplifierMapSetting.java:75`

```java
@Override public Reference2IntMap<MobEffect> load(CompoundTag tag)
```

## meteordevelopment.meteorclient.settings.StatusEffectAmplifierMapSetting.Builder

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/StatusEffectAmplifierMapSetting.java:88`

```java
public static class Builder extends SettingBuilder<Builder, Reference2IntMap<MobEffect>, StatusEffectAmplifierMapSetting>
```

## meteordevelopment.meteorclient.settings.StatusEffectAmplifierMapSetting.Builder.Builder

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/StatusEffectAmplifierMapSetting.java:89`

```java
public Builder()
```

## meteordevelopment.meteorclient.settings.StatusEffectAmplifierMapSetting.Builder.build

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/StatusEffectAmplifierMapSetting.java:93`

```java
@Override public StatusEffectAmplifierMapSetting build()
```

## meteordevelopment.meteorclient.settings.StatusEffectListSetting

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/StatusEffectListSetting.java:21`

```java
public class StatusEffectListSetting extends Setting<List<MobEffect>>
```

## meteordevelopment.meteorclient.settings.StatusEffectListSetting.StatusEffectListSetting

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/StatusEffectListSetting.java:22`

```java
public StatusEffectListSetting(String name, String description, List<MobEffect> defaultValue, Consumer<List<MobEffect>> onChanged, Consumer<Setting<List<MobEffect>>> onModuleActivated, IVisible visible)
```

## meteordevelopment.meteorclient.settings.StatusEffectListSetting.resetImpl

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/StatusEffectListSetting.java:26`

```java
@Override public void resetImpl()
```

## meteordevelopment.meteorclient.settings.StatusEffectListSetting.parseImpl

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/StatusEffectListSetting.java:31`

```java
@Override protected List<MobEffect> parseImpl(String str)
```

## meteordevelopment.meteorclient.settings.StatusEffectListSetting.isValueValid

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/StatusEffectListSetting.java:47`

```java
@Override protected boolean isValueValid(List<MobEffect> value)
```

## meteordevelopment.meteorclient.settings.StatusEffectListSetting.getIdentifierSuggestions

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/StatusEffectListSetting.java:52`

```java
@Override public Iterable<Identifier> getIdentifierSuggestions()
```

## meteordevelopment.meteorclient.settings.StatusEffectListSetting.save

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/StatusEffectListSetting.java:57`

```java
@Override public CompoundTag save(CompoundTag tag)
```

## meteordevelopment.meteorclient.settings.StatusEffectListSetting.load

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/StatusEffectListSetting.java:70`

```java
@Override public List<MobEffect> load(CompoundTag tag)
```

## meteordevelopment.meteorclient.settings.StatusEffectListSetting.Builder

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/StatusEffectListSetting.java:82`

```java
public static class Builder extends SettingBuilder<Builder, List<MobEffect>, StatusEffectListSetting>
```

## meteordevelopment.meteorclient.settings.StatusEffectListSetting.Builder.Builder

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/StatusEffectListSetting.java:83`

```java
public Builder()
```

## meteordevelopment.meteorclient.settings.StatusEffectListSetting.Builder.defaultValue

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/StatusEffectListSetting.java:87`

```java
public Builder defaultValue(MobEffect... defaults)
```

## meteordevelopment.meteorclient.settings.StatusEffectListSetting.Builder.build

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/StatusEffectListSetting.java:91`

```java
@Override public StatusEffectListSetting build()
```

## meteordevelopment.meteorclient.settings.StorageBlockListSetting

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/StorageBlockListSetting.java:32`

```java
public class StorageBlockListSetting extends Setting<List<BlockEntityType<?>>>
```

## meteordevelopment.meteorclient.settings.StorageBlockListSetting.STORAGE_BLOCKS

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/StorageBlockListSetting.java:33`

```java
public static final BlockEntityType<?>[] STORAGE_BLOCKS = new BlockEntityType[]{ BlockEntityTypes.BARREL, BlockEntityTypes.BLAST_FURNACE, BlockEntityTypes.BREWING_STAND, BlockEntityTypes.CAMPFIRE, BlockEntityTypes.CHEST, BlockEntityTypes.CHISELED_BOOKSHELF, BlockEntityTypes.CRAFTER, BlockEntityTypes.DISPENSER, BlockEntityTypes.DECORATED_POT, BlockEntityTypes.DROPPER, BlockEntityTypes.ENDER_CHEST, BlockEntityTypes.FURNACE, BlockEntityTypes.HOPPER, BlockEntityTypes.SHULKER_BOX, BlockEntityTypes.SMOKER, BlockEntityTypes.TRAPPED_CHEST, }
```

## meteordevelopment.meteorclient.settings.StorageBlockListSetting.REGISTRY

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/StorageBlockListSetting.java:52`

```java
public static final Registry<BlockEntityType<?>> REGISTRY = new SRegistry()
```

## meteordevelopment.meteorclient.settings.StorageBlockListSetting.StorageBlockListSetting

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/StorageBlockListSetting.java:54`

```java
public StorageBlockListSetting(String name, String description, List<BlockEntityType<?>> defaultValue, Consumer<List<BlockEntityType<?>>> onChanged, Consumer<Setting<List<BlockEntityType<?>>>> onModuleActivated, IVisible visible)
```

## meteordevelopment.meteorclient.settings.StorageBlockListSetting.resetImpl

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/StorageBlockListSetting.java:58`

```java
@Override public void resetImpl()
```

## meteordevelopment.meteorclient.settings.StorageBlockListSetting.parseImpl

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/StorageBlockListSetting.java:63`

```java
@Override protected List<BlockEntityType<?>> parseImpl(String str)
```

## meteordevelopment.meteorclient.settings.StorageBlockListSetting.isValueValid

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/StorageBlockListSetting.java:79`

```java
@Override protected boolean isValueValid(List<BlockEntityType<?>> value)
```

## meteordevelopment.meteorclient.settings.StorageBlockListSetting.getIdentifierSuggestions

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/StorageBlockListSetting.java:84`

```java
@Override public Iterable<Identifier> getIdentifierSuggestions()
```

## meteordevelopment.meteorclient.settings.StorageBlockListSetting.save

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/StorageBlockListSetting.java:89`

```java
@Override public CompoundTag save(CompoundTag tag)
```

## meteordevelopment.meteorclient.settings.StorageBlockListSetting.load

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/StorageBlockListSetting.java:101`

```java
@Override public List<BlockEntityType<?>> load(CompoundTag tag)
```

## meteordevelopment.meteorclient.settings.StorageBlockListSetting.Builder

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/StorageBlockListSetting.java:114`

```java
public static class Builder extends SettingBuilder<Builder, List<BlockEntityType<?>>, StorageBlockListSetting>
```

## meteordevelopment.meteorclient.settings.StorageBlockListSetting.Builder.Builder

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/StorageBlockListSetting.java:115`

```java
public Builder()
```

## meteordevelopment.meteorclient.settings.StorageBlockListSetting.Builder.defaultValue

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/StorageBlockListSetting.java:119`

```java
public Builder defaultValue(BlockEntityType<?>... defaults)
```

## meteordevelopment.meteorclient.settings.StorageBlockListSetting.Builder.build

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/StorageBlockListSetting.java:123`

```java
@Override public StorageBlockListSetting build()
```

## meteordevelopment.meteorclient.settings.StringListSetting

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/StringListSetting.java:25`

```java
public class StringListSetting extends Setting<List<String>>
```

## meteordevelopment.meteorclient.settings.StringListSetting.renderer

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/StringListSetting.java:26`

```java
public final Class<? extends WTextBox.Renderer> renderer
```

## meteordevelopment.meteorclient.settings.StringListSetting.filter

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/StringListSetting.java:27`

```java
public final CharFilter filter
```

## meteordevelopment.meteorclient.settings.StringListSetting.StringListSetting

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/StringListSetting.java:29`

```java
public StringListSetting(String name, String description, List<String> defaultValue, Consumer<List<String>> onChanged, Consumer<Setting<List<String>>> onModuleActivated, IVisible visible, Class<? extends WTextBox.Renderer> renderer, CharFilter filter)
```

## meteordevelopment.meteorclient.settings.StringListSetting.parseImpl

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/StringListSetting.java:36`

```java
@Override protected List<String> parseImpl(String str)
```

## meteordevelopment.meteorclient.settings.StringListSetting.isValueValid

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/StringListSetting.java:41`

```java
@Override protected boolean isValueValid(List<String> value)
```

## meteordevelopment.meteorclient.settings.StringListSetting.save

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/StringListSetting.java:46`

```java
@Override public CompoundTag save(CompoundTag tag)
```

## meteordevelopment.meteorclient.settings.StringListSetting.load

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/StringListSetting.java:57`

```java
@Override public List<String> load(CompoundTag tag)
```

## meteordevelopment.meteorclient.settings.StringListSetting.resetImpl

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/StringListSetting.java:69`

```java
@Override public void resetImpl()
```

## meteordevelopment.meteorclient.settings.StringListSetting.fillTable

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/StringListSetting.java:74`

```java
public static void fillTable(GuiTheme theme, WTable table, StringListSetting setting)
```

## meteordevelopment.meteorclient.settings.StringListSetting.Builder

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/StringListSetting.java:121`

```java
public static class Builder extends SettingBuilder<Builder, List<String>, StringListSetting>
```

## meteordevelopment.meteorclient.settings.StringListSetting.Builder.Builder

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/StringListSetting.java:125`

```java
public Builder()
```

## meteordevelopment.meteorclient.settings.StringListSetting.Builder.defaultValue

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/StringListSetting.java:129`

```java
public Builder defaultValue(String... defaults)
```

## meteordevelopment.meteorclient.settings.StringListSetting.Builder.renderer

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/StringListSetting.java:133`

```java
public Builder renderer(Class<? extends WTextBox.Renderer> renderer)
```

## meteordevelopment.meteorclient.settings.StringListSetting.Builder.filter

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/StringListSetting.java:138`

```java
public Builder filter(CharFilter filter)
```

## meteordevelopment.meteorclient.settings.StringListSetting.Builder.build

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/StringListSetting.java:143`

```java
@Override public StringListSetting build()
```

## meteordevelopment.meteorclient.settings.StringSetting

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/StringSetting.java:14`

```java
public class StringSetting extends Setting<String>
```

## meteordevelopment.meteorclient.settings.StringSetting.placeholder

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/StringSetting.java:15`

```java
public final String placeholder
```

## meteordevelopment.meteorclient.settings.StringSetting.renderer

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/StringSetting.java:16`

```java
public final Class<? extends WTextBox.Renderer> renderer
```

## meteordevelopment.meteorclient.settings.StringSetting.filter

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/StringSetting.java:17`

```java
public final CharFilter filter
```

## meteordevelopment.meteorclient.settings.StringSetting.wide

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/StringSetting.java:18`

```java
public final boolean wide
```

## meteordevelopment.meteorclient.settings.StringSetting.StringSetting

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/StringSetting.java:20`

```java
public StringSetting(String name, String description, String defaultValue, Consumer<String> onChanged, Consumer<Setting<String>> onModuleActivated, IVisible visible, String placeholder, Class<? extends WTextBox.Renderer> renderer, CharFilter filter, boolean wide)
```

## meteordevelopment.meteorclient.settings.StringSetting.parseImpl

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/StringSetting.java:29`

```java
@Override protected String parseImpl(String str)
```

## meteordevelopment.meteorclient.settings.StringSetting.isValueValid

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/StringSetting.java:34`

```java
@Override protected boolean isValueValid(String value)
```

## meteordevelopment.meteorclient.settings.StringSetting.save

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/StringSetting.java:43`

```java
@Override public CompoundTag save(CompoundTag tag)
```

## meteordevelopment.meteorclient.settings.StringSetting.load

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/StringSetting.java:50`

```java
@Override public String load(CompoundTag tag)
```

## meteordevelopment.meteorclient.settings.StringSetting.Builder

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/StringSetting.java:57`

```java
public static class Builder extends SettingBuilder<Builder, String, StringSetting>
```

## meteordevelopment.meteorclient.settings.StringSetting.Builder.Builder

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/StringSetting.java:63`

```java
public Builder()
```

## meteordevelopment.meteorclient.settings.StringSetting.Builder.placeholder

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/StringSetting.java:67`

```java
public Builder placeholder(String placeholder)
```

## meteordevelopment.meteorclient.settings.StringSetting.Builder.renderer

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/StringSetting.java:72`

```java
public Builder renderer(Class<? extends WTextBox.Renderer> renderer)
```

## meteordevelopment.meteorclient.settings.StringSetting.Builder.filter

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/StringSetting.java:77`

```java
public Builder filter(CharFilter filter)
```

## meteordevelopment.meteorclient.settings.StringSetting.Builder.wide

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/StringSetting.java:82`

```java
public Builder wide()
```

## meteordevelopment.meteorclient.settings.StringSetting.Builder.build

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/StringSetting.java:87`

```java
@Override public StringSetting build()
```

## meteordevelopment.meteorclient.settings.Vector3dSetting

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/Vector3dSetting.java:13`

```java
public class Vector3dSetting extends Setting<Vector3d>
```

## meteordevelopment.meteorclient.settings.Vector3dSetting.min

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/Vector3dSetting.java:14`

```java
public final double min, max
```

## meteordevelopment.meteorclient.settings.Vector3dSetting.max

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/Vector3dSetting.java:14`

```java
public final double min, max
```

## meteordevelopment.meteorclient.settings.Vector3dSetting.sliderMin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/Vector3dSetting.java:15`

```java
public final double sliderMin, sliderMax
```

## meteordevelopment.meteorclient.settings.Vector3dSetting.sliderMax

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/Vector3dSetting.java:15`

```java
public final double sliderMin, sliderMax
```

## meteordevelopment.meteorclient.settings.Vector3dSetting.onSliderRelease

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/Vector3dSetting.java:16`

```java
public final boolean onSliderRelease
```

## meteordevelopment.meteorclient.settings.Vector3dSetting.decimalPlaces

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/Vector3dSetting.java:17`

```java
public final int decimalPlaces
```

## meteordevelopment.meteorclient.settings.Vector3dSetting.noSlider

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/Vector3dSetting.java:18`

```java
public final boolean noSlider
```

## meteordevelopment.meteorclient.settings.Vector3dSetting.Vector3dSetting

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/Vector3dSetting.java:20`

```java
public Vector3dSetting(String name, String description, Vector3d defaultValue, Consumer<Vector3d> onChanged, Consumer<Setting<Vector3d>> onModuleActivated, IVisible visible, double min, double max, double sliderMin, double sliderMax, boolean onSliderRelease, int decimalPlaces, boolean noSlider)
```

## meteordevelopment.meteorclient.settings.Vector3dSetting.set

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/Vector3dSetting.java:32`

```java
public boolean set(double x, double y, double z)
```

## meteordevelopment.meteorclient.settings.Vector3dSetting.resetImpl

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/Vector3dSetting.java:37`

```java
@Override protected void resetImpl()
```

## meteordevelopment.meteorclient.settings.Vector3dSetting.parseImpl

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/Vector3dSetting.java:43`

```java
@Override protected Vector3d parseImpl(String str)
```

## meteordevelopment.meteorclient.settings.Vector3dSetting.isValueValid

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/Vector3dSetting.java:53`

```java
@Override protected boolean isValueValid(Vector3d value)
```

## meteordevelopment.meteorclient.settings.Vector3dSetting.save

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/Vector3dSetting.java:58`

```java
@Override protected CompoundTag save(CompoundTag tag)
```

## meteordevelopment.meteorclient.settings.Vector3dSetting.load

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/Vector3dSetting.java:70`

```java
@Override protected Vector3d load(CompoundTag tag)
```

## meteordevelopment.meteorclient.settings.Vector3dSetting.Builder

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/Vector3dSetting.java:81`

```java
public static class Builder extends SettingBuilder<Builder, Vector3d, Vector3dSetting>
```

## meteordevelopment.meteorclient.settings.Vector3dSetting.Builder.min

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/Vector3dSetting.java:82`

```java
public double min = Double.NEGATIVE_INFINITY, max = Double.POSITIVE_INFINITY
```

## meteordevelopment.meteorclient.settings.Vector3dSetting.Builder.max

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/Vector3dSetting.java:82`

```java
public double min = Double.NEGATIVE_INFINITY, max = Double.POSITIVE_INFINITY
```

## meteordevelopment.meteorclient.settings.Vector3dSetting.Builder.sliderMin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/Vector3dSetting.java:83`

```java
public double sliderMin = 0, sliderMax = 10
```

## meteordevelopment.meteorclient.settings.Vector3dSetting.Builder.sliderMax

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/Vector3dSetting.java:83`

```java
public double sliderMin = 0, sliderMax = 10
```

## meteordevelopment.meteorclient.settings.Vector3dSetting.Builder.onSliderRelease

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/Vector3dSetting.java:84`

```java
public boolean onSliderRelease = false
```

## meteordevelopment.meteorclient.settings.Vector3dSetting.Builder.decimalPlaces

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/Vector3dSetting.java:85`

```java
public int decimalPlaces = 3
```

## meteordevelopment.meteorclient.settings.Vector3dSetting.Builder.noSlider

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/Vector3dSetting.java:86`

```java
public boolean noSlider = false
```

## meteordevelopment.meteorclient.settings.Vector3dSetting.Builder.Builder

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/Vector3dSetting.java:88`

```java
public Builder()
```

## meteordevelopment.meteorclient.settings.Vector3dSetting.Builder.defaultValue

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/Vector3dSetting.java:92`

```java
@Override public Builder defaultValue(Vector3d defaultValue)
```

## meteordevelopment.meteorclient.settings.Vector3dSetting.Builder.defaultValue

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/Vector3dSetting.java:98`

```java
public Builder defaultValue(double x, double y, double z)
```

## meteordevelopment.meteorclient.settings.Vector3dSetting.Builder.min

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/Vector3dSetting.java:103`

```java
public Builder min(double min)
```

## meteordevelopment.meteorclient.settings.Vector3dSetting.Builder.max

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/Vector3dSetting.java:108`

```java
public Builder max(double max)
```

## meteordevelopment.meteorclient.settings.Vector3dSetting.Builder.range

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/Vector3dSetting.java:113`

```java
public Builder range(double min, double max)
```

## meteordevelopment.meteorclient.settings.Vector3dSetting.Builder.sliderMin

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/Vector3dSetting.java:119`

```java
public Builder sliderMin(double min)
```

## meteordevelopment.meteorclient.settings.Vector3dSetting.Builder.sliderMax

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/Vector3dSetting.java:124`

```java
public Builder sliderMax(double max)
```

## meteordevelopment.meteorclient.settings.Vector3dSetting.Builder.sliderRange

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/Vector3dSetting.java:129`

```java
public Builder sliderRange(double min, double max)
```

## meteordevelopment.meteorclient.settings.Vector3dSetting.Builder.onSliderRelease

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/Vector3dSetting.java:135`

```java
public Builder onSliderRelease()
```

## meteordevelopment.meteorclient.settings.Vector3dSetting.Builder.decimalPlaces

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/Vector3dSetting.java:140`

```java
public Builder decimalPlaces(int decimalPlaces)
```

## meteordevelopment.meteorclient.settings.Vector3dSetting.Builder.noSlider

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/Vector3dSetting.java:145`

```java
public Builder noSlider()
```

## meteordevelopment.meteorclient.settings.Vector3dSetting.Builder.build

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/settings/Vector3dSetting.java:150`

```java
@Override public Vector3dSetting build()
```
