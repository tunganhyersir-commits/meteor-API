# commands

Khai báo Java có cú pháp public/protected. Không bao gồm API kế thừa/tổng hợp bởi compiler; xem kiểm tra bytecode riêng.

## meteordevelopment.meteorclient.commands.Command

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/Command.java:25`

```java
public abstract class Command
```

## meteordevelopment.meteorclient.commands.Command.REGISTRY_ACCESS

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/Command.java:26`

```java
protected static CommandRegistryAccess REGISTRY_ACCESS = CommandManager.createRegistryAccess(BuiltinRegistries.createWrapperLookup())
```

## meteordevelopment.meteorclient.commands.Command.SINGLE_SUCCESS

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/Command.java:27`

```java
protected static final int SINGLE_SUCCESS = com.mojang.brigadier.Command.SINGLE_SUCCESS
```

## meteordevelopment.meteorclient.commands.Command.mc

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/Command.java:28`

```java
protected static final MinecraftClient mc = MeteorClient.mc
```

## meteordevelopment.meteorclient.commands.Command.Command

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/Command.java:35`

```java
public Command(String name, String description, String... aliases)
```

## meteordevelopment.meteorclient.commands.Command.argument

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/Command.java:43`

```java
protected static <T> RequiredArgumentBuilder<CommandSource, T> argument(final String name, final ArgumentType<T> type)
```

## meteordevelopment.meteorclient.commands.Command.literal

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/Command.java:47`

```java
protected static LiteralArgumentBuilder<CommandSource> literal(final String name)
```

## meteordevelopment.meteorclient.commands.Command.registerTo

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/Command.java:51`

```java
public final void registerTo(CommandDispatcher<CommandSource> dispatcher)
```

## meteordevelopment.meteorclient.commands.Command.register

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/Command.java:56`

```java
public void register(CommandDispatcher<CommandSource> dispatcher, String name)
```

## meteordevelopment.meteorclient.commands.Command.build

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/Command.java:62`

```java
public abstract void build(LiteralArgumentBuilder<CommandSource> builder)
```

## meteordevelopment.meteorclient.commands.Command.getName

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/Command.java:64`

```java
public String getName()
```

## meteordevelopment.meteorclient.commands.Command.getDescription

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/Command.java:68`

```java
public String getDescription()
```

## meteordevelopment.meteorclient.commands.Command.getAliases

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/Command.java:72`

```java
public List<String> getAliases()
```

## meteordevelopment.meteorclient.commands.Command.toString

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/Command.java:76`

```java
public String toString()
```

## meteordevelopment.meteorclient.commands.Command.toString

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/Command.java:80`

```java
public String toString(String... args)
```

## meteordevelopment.meteorclient.commands.Command.info

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/Command.java:86`

```java
public void info(Text message)
```

## meteordevelopment.meteorclient.commands.Command.info

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/Command.java:91`

```java
public void info(String message, Object... args)
```

## meteordevelopment.meteorclient.commands.Command.warning

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/Command.java:96`

```java
public void warning(String message, Object... args)
```

## meteordevelopment.meteorclient.commands.Command.error

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/Command.java:101`

```java
public void error(String message, Object... args)
```

## meteordevelopment.meteorclient.commands.Commands

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/Commands.java:26`

```java
public class Commands
```

## meteordevelopment.meteorclient.commands.Commands.COMMANDS

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/Commands.java:27`

```java
public static final List<Command> COMMANDS = new ArrayList<>()
```

## meteordevelopment.meteorclient.commands.Commands.DISPATCHER

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/Commands.java:28`

```java
public static CommandDispatcher<CommandSource> DISPATCHER = new CommandDispatcher<>()
```

## meteordevelopment.meteorclient.commands.Commands.init

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/Commands.java:30`

```java
@PostInit(dependencies = PathManagers.class) public static void init()
```

## meteordevelopment.meteorclient.commands.Commands.add

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/Commands.java:77`

```java
public static void add(Command command)
```

## meteordevelopment.meteorclient.commands.Commands.dispatch

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/Commands.java:82`

```java
public static void dispatch(String message) throws CommandSyntaxException
```

## meteordevelopment.meteorclient.commands.Commands.get

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/Commands.java:86`

```java
public static Command get(String name)
```

## meteordevelopment.meteorclient.commands.arguments.BlockPosArgumentType

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/arguments/BlockPosArgumentType.java:64`

```java
public class BlockPosArgumentType implements ArgumentType<BlockPosArgumentType.PosArgument>
```

## meteordevelopment.meteorclient.commands.arguments.BlockPosArgumentType.UNLOADED_EXCEPTION

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/arguments/BlockPosArgumentType.java:67`

```java
public static final SimpleCommandExceptionType UNLOADED_EXCEPTION = new SimpleCommandExceptionType(Text.translatable("argument.pos.unloaded"))
```

## meteordevelopment.meteorclient.commands.arguments.BlockPosArgumentType.OUT_OF_WORLD_EXCEPTION

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/arguments/BlockPosArgumentType.java:68`

```java
public static final SimpleCommandExceptionType OUT_OF_WORLD_EXCEPTION = new SimpleCommandExceptionType(Text.translatable("argument.pos.outofworld"))
```

## meteordevelopment.meteorclient.commands.arguments.BlockPosArgumentType.OUT_OF_BOUNDS_EXCEPTION

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/arguments/BlockPosArgumentType.java:69`

```java
public static final SimpleCommandExceptionType OUT_OF_BOUNDS_EXCEPTION = new SimpleCommandExceptionType(Text.translatable("argument.pos.outofbounds"))
```

## meteordevelopment.meteorclient.commands.arguments.BlockPosArgumentType.blockPos

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/arguments/BlockPosArgumentType.java:73`

```java
public static BlockPosArgumentType blockPos()
```

## meteordevelopment.meteorclient.commands.arguments.BlockPosArgumentType.getLoadedBlockPos

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/arguments/BlockPosArgumentType.java:77`

```java
public static <S> BlockPos getLoadedBlockPos(CommandContext<S> context, String name) throws CommandSyntaxException
```

## meteordevelopment.meteorclient.commands.arguments.BlockPosArgumentType.getLoadedBlockPos

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/arguments/BlockPosArgumentType.java:82`

```java
public static <S> BlockPos getLoadedBlockPos(CommandContext<S> context, ClientWorld level, String name) throws CommandSyntaxException
```

## meteordevelopment.meteorclient.commands.arguments.BlockPosArgumentType.getBlockPos

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/arguments/BlockPosArgumentType.java:94`

```java
public static <S> BlockPos getBlockPos(CommandContext<S> context, String name)
```

## meteordevelopment.meteorclient.commands.arguments.BlockPosArgumentType.getValidBlockPos

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/arguments/BlockPosArgumentType.java:98`

```java
public static <S> BlockPos getValidBlockPos(CommandContext<S> context, String name) throws CommandSyntaxException
```

## meteordevelopment.meteorclient.commands.arguments.BlockPosArgumentType.parse

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/arguments/BlockPosArgumentType.java:107`

```java
public PosArgument parse(StringReader stringReader) throws CommandSyntaxException
```

## meteordevelopment.meteorclient.commands.arguments.BlockPosArgumentType.listSuggestions

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/arguments/BlockPosArgumentType.java:111`

```java
public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> context, SuggestionsBuilder builder)
```

## meteordevelopment.meteorclient.commands.arguments.BlockPosArgumentType.getExamples

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/arguments/BlockPosArgumentType.java:127`

```java
public Collection<String> getExamples()
```

## meteordevelopment.meteorclient.commands.arguments.BlockPosArgumentType.PosArgument

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/arguments/BlockPosArgumentType.java:131`

```java
public interface PosArgument
```

## meteordevelopment.meteorclient.commands.arguments.BlockPosArgumentType.PosArgument.getPosition

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/arguments/BlockPosArgumentType.java:132`

```java
<S> Vec3d getPosition(S var1)
```

## meteordevelopment.meteorclient.commands.arguments.BlockPosArgumentType.PosArgument.getRotation

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/arguments/BlockPosArgumentType.java:134`

```java
<S> Vec2f getRotation(S var1)
```

## meteordevelopment.meteorclient.commands.arguments.BlockPosArgumentType.PosArgument.getBlockPos

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/arguments/BlockPosArgumentType.java:136`

```java
default <S> BlockPos getBlockPos(S source)
```

## meteordevelopment.meteorclient.commands.arguments.BlockPosArgumentType.PosArgument.isXRelative

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/arguments/BlockPosArgumentType.java:140`

```java
boolean isXRelative()
```

## meteordevelopment.meteorclient.commands.arguments.BlockPosArgumentType.PosArgument.isYRelative

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/arguments/BlockPosArgumentType.java:142`

```java
boolean isYRelative()
```

## meteordevelopment.meteorclient.commands.arguments.BlockPosArgumentType.PosArgument.isZRelative

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/arguments/BlockPosArgumentType.java:144`

```java
boolean isZRelative()
```

## meteordevelopment.meteorclient.commands.arguments.BlockPosArgumentType.DefaultPosArgument

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/arguments/BlockPosArgumentType.java:147`

```java
public static class DefaultPosArgument implements PosArgument
```

## meteordevelopment.meteorclient.commands.arguments.BlockPosArgumentType.DefaultPosArgument.DefaultPosArgument

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/arguments/BlockPosArgumentType.java:152`

```java
public DefaultPosArgument(CoordinateArgument x, CoordinateArgument y, CoordinateArgument z)
```

## meteordevelopment.meteorclient.commands.arguments.BlockPosArgumentType.DefaultPosArgument.getPosition

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/arguments/BlockPosArgumentType.java:158`

```java
@Override public <S> Vec3d getPosition(S source)
```

## meteordevelopment.meteorclient.commands.arguments.BlockPosArgumentType.DefaultPosArgument.getRotation

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/arguments/BlockPosArgumentType.java:164`

```java
@Override public <S> Vec2f getRotation(S source)
```

## meteordevelopment.meteorclient.commands.arguments.BlockPosArgumentType.DefaultPosArgument.isXRelative

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/arguments/BlockPosArgumentType.java:170`

```java
@Override public boolean isXRelative()
```

## meteordevelopment.meteorclient.commands.arguments.BlockPosArgumentType.DefaultPosArgument.isYRelative

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/arguments/BlockPosArgumentType.java:175`

```java
@Override public boolean isYRelative()
```

## meteordevelopment.meteorclient.commands.arguments.BlockPosArgumentType.DefaultPosArgument.isZRelative

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/arguments/BlockPosArgumentType.java:180`

```java
@Override public boolean isZRelative()
```

## meteordevelopment.meteorclient.commands.arguments.BlockPosArgumentType.DefaultPosArgument.equals

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/arguments/BlockPosArgumentType.java:185`

```java
public boolean equals(Object o)
```

## meteordevelopment.meteorclient.commands.arguments.BlockPosArgumentType.DefaultPosArgument.parse

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/arguments/BlockPosArgumentType.java:195`

```java
public static DefaultPosArgument parse(StringReader reader) throws CommandSyntaxException
```

## meteordevelopment.meteorclient.commands.arguments.BlockPosArgumentType.DefaultPosArgument.parse

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/arguments/BlockPosArgumentType.java:211`

```java
public static DefaultPosArgument parse(StringReader reader, boolean centerIntegers) throws CommandSyntaxException
```

## meteordevelopment.meteorclient.commands.arguments.BlockPosArgumentType.DefaultPosArgument.absolute

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/arguments/BlockPosArgumentType.java:227`

```java
public static DefaultPosArgument absolute(double x, double y, double z)
```

## meteordevelopment.meteorclient.commands.arguments.BlockPosArgumentType.DefaultPosArgument.absolute

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/arguments/BlockPosArgumentType.java:231`

```java
public static DefaultPosArgument absolute(Vec2f vec)
```

## meteordevelopment.meteorclient.commands.arguments.BlockPosArgumentType.DefaultPosArgument.current

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/arguments/BlockPosArgumentType.java:235`

```java
public static DefaultPosArgument current()
```

## meteordevelopment.meteorclient.commands.arguments.BlockPosArgumentType.DefaultPosArgument.hashCode

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/arguments/BlockPosArgumentType.java:239`

```java
@Override public int hashCode()
```

## meteordevelopment.meteorclient.commands.arguments.BlockPosArgumentType.LookingPosArgument

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/arguments/BlockPosArgumentType.java:247`

```java
public static class LookingPosArgument implements PosArgument
```

## meteordevelopment.meteorclient.commands.arguments.BlockPosArgumentType.LookingPosArgument.LookingPosArgument

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/arguments/BlockPosArgumentType.java:252`

```java
public LookingPosArgument(double x, double y, double z)
```

## meteordevelopment.meteorclient.commands.arguments.BlockPosArgumentType.LookingPosArgument.getPosition

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/arguments/BlockPosArgumentType.java:258`

```java
@Override public <S> Vec3d getPosition(S source)
```

## meteordevelopment.meteorclient.commands.arguments.BlockPosArgumentType.LookingPosArgument.getRotation

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/arguments/BlockPosArgumentType.java:277`

```java
@Override public <S> Vec2f getRotation(S source)
```

## meteordevelopment.meteorclient.commands.arguments.BlockPosArgumentType.LookingPosArgument.isXRelative

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/arguments/BlockPosArgumentType.java:282`

```java
@Override public boolean isXRelative()
```

## meteordevelopment.meteorclient.commands.arguments.BlockPosArgumentType.LookingPosArgument.isYRelative

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/arguments/BlockPosArgumentType.java:287`

```java
@Override public boolean isYRelative()
```

## meteordevelopment.meteorclient.commands.arguments.BlockPosArgumentType.LookingPosArgument.isZRelative

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/arguments/BlockPosArgumentType.java:292`

```java
@Override public boolean isZRelative()
```

## meteordevelopment.meteorclient.commands.arguments.BlockPosArgumentType.LookingPosArgument.parse

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/arguments/BlockPosArgumentType.java:297`

```java
public static LookingPosArgument parse(StringReader reader) throws CommandSyntaxException
```

## meteordevelopment.meteorclient.commands.arguments.BlockPosArgumentType.LookingPosArgument.equals

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/arguments/BlockPosArgumentType.java:327`

```java
public boolean equals(Object o)
```

## meteordevelopment.meteorclient.commands.arguments.BlockPosArgumentType.LookingPosArgument.hashCode

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/arguments/BlockPosArgumentType.java:337`

```java
public int hashCode()
```

## meteordevelopment.meteorclient.commands.arguments.CommandArgumentType

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/arguments/CommandArgumentType.java:26`

```java
public class CommandArgumentType implements ArgumentType<Command>
```

## meteordevelopment.meteorclient.commands.arguments.CommandArgumentType.create

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/arguments/CommandArgumentType.java:34`

```java
public static CommandArgumentType create()
```

## meteordevelopment.meteorclient.commands.arguments.CommandArgumentType.get

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/arguments/CommandArgumentType.java:38`

```java
public static Command get(CommandContext<?> context)
```

## meteordevelopment.meteorclient.commands.arguments.CommandArgumentType.parse

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/arguments/CommandArgumentType.java:42`

```java
@Override public Command parse(StringReader reader) throws CommandSyntaxException
```

## meteordevelopment.meteorclient.commands.arguments.CommandArgumentType.listSuggestions

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/arguments/CommandArgumentType.java:64`

```java
@Override public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> context, SuggestionsBuilder builder)
```

## meteordevelopment.meteorclient.commands.arguments.CommandArgumentType.getExamples

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/arguments/CommandArgumentType.java:74`

```java
@Override public Collection<String> getExamples()
```

## meteordevelopment.meteorclient.commands.arguments.ComponentMapArgumentType

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/arguments/ComponentMapArgumentType.java:23`

```java
public class ComponentMapArgumentType implements ArgumentType<ComponentMap>
```

## meteordevelopment.meteorclient.commands.arguments.ComponentMapArgumentType.ComponentMapArgumentType

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/arguments/ComponentMapArgumentType.java:27`

```java
public ComponentMapArgumentType(CommandRegistryAccess commandRegistryAccess)
```

## meteordevelopment.meteorclient.commands.arguments.ComponentMapArgumentType.componentMap

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/arguments/ComponentMapArgumentType.java:31`

```java
public static ComponentMapArgumentType componentMap(CommandRegistryAccess commandRegistryAccess)
```

## meteordevelopment.meteorclient.commands.arguments.ComponentMapArgumentType.getComponentMap

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/arguments/ComponentMapArgumentType.java:35`

```java
public static <S extends CommandSource> ComponentMap getComponentMap(CommandContext<S> context, String name)
```

## meteordevelopment.meteorclient.commands.arguments.ComponentMapArgumentType.parse

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/arguments/ComponentMapArgumentType.java:39`

```java
@Override public ComponentMap parse(StringReader reader) throws CommandSyntaxException
```

## meteordevelopment.meteorclient.commands.arguments.ComponentMapArgumentType.listSuggestions

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/arguments/ComponentMapArgumentType.java:44`

```java
@Override public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> context, SuggestionsBuilder builder)
```

## meteordevelopment.meteorclient.commands.arguments.ComponentMapArgumentType.getExamples

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/arguments/ComponentMapArgumentType.java:49`

```java
@Override public Collection<String> getExamples()
```

## meteordevelopment.meteorclient.commands.arguments.CompoundNbtTagArgumentType

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/arguments/CompoundNbtTagArgumentType.java:20`

```java
public class CompoundNbtTagArgumentType implements ArgumentType<NbtCompound>
```

## meteordevelopment.meteorclient.commands.arguments.CompoundNbtTagArgumentType.create

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/arguments/CompoundNbtTagArgumentType.java:24`

```java
public static CompoundNbtTagArgumentType create()
```

## meteordevelopment.meteorclient.commands.arguments.CompoundNbtTagArgumentType.get

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/arguments/CompoundNbtTagArgumentType.java:28`

```java
public static NbtCompound get(CommandContext<?> context)
```

## meteordevelopment.meteorclient.commands.arguments.CompoundNbtTagArgumentType.parse

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/arguments/CompoundNbtTagArgumentType.java:34`

```java
@Override public NbtCompound parse(StringReader reader) throws CommandSyntaxException
```

## meteordevelopment.meteorclient.commands.arguments.CompoundNbtTagArgumentType.getExamples

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/arguments/CompoundNbtTagArgumentType.java:61`

```java
@Override public Collection<String> getExamples()
```

## meteordevelopment.meteorclient.commands.arguments.DirectionArgumentType

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/arguments/DirectionArgumentType.java:11`

```java
public class DirectionArgumentType extends EnumArgumentType<Direction>
```

## meteordevelopment.meteorclient.commands.arguments.DirectionArgumentType.create

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/arguments/DirectionArgumentType.java:18`

```java
public static DirectionArgumentType create()
```

## meteordevelopment.meteorclient.commands.arguments.FakePlayerArgumentType

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/arguments/FakePlayerArgumentType.java:23`

```java
public class FakePlayerArgumentType implements ArgumentType<String>
```

## meteordevelopment.meteorclient.commands.arguments.FakePlayerArgumentType.create

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/arguments/FakePlayerArgumentType.java:27`

```java
public static FakePlayerArgumentType create()
```

## meteordevelopment.meteorclient.commands.arguments.FakePlayerArgumentType.get

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/arguments/FakePlayerArgumentType.java:31`

```java
public static FakePlayerEntity get(CommandContext<?> context)
```

## meteordevelopment.meteorclient.commands.arguments.FakePlayerArgumentType.parse

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/arguments/FakePlayerArgumentType.java:37`

```java
@Override public String parse(StringReader reader) throws CommandSyntaxException
```

## meteordevelopment.meteorclient.commands.arguments.FakePlayerArgumentType.listSuggestions

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/arguments/FakePlayerArgumentType.java:42`

```java
@Override public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> context, SuggestionsBuilder builder)
```

## meteordevelopment.meteorclient.commands.arguments.FakePlayerArgumentType.getExamples

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/arguments/FakePlayerArgumentType.java:47`

```java
@Override public Collection<String> getExamples()
```

## meteordevelopment.meteorclient.commands.arguments.FriendArgumentType

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/arguments/FriendArgumentType.java:24`

```java
public class FriendArgumentType implements ArgumentType<String>
```

## meteordevelopment.meteorclient.commands.arguments.FriendArgumentType.create

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/arguments/FriendArgumentType.java:28`

```java
public static FriendArgumentType create()
```

## meteordevelopment.meteorclient.commands.arguments.FriendArgumentType.get

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/arguments/FriendArgumentType.java:32`

```java
public static Friend get(CommandContext<?> context)
```

## meteordevelopment.meteorclient.commands.arguments.FriendArgumentType.parse

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/arguments/FriendArgumentType.java:38`

```java
@Override public String parse(StringReader reader) throws CommandSyntaxException
```

## meteordevelopment.meteorclient.commands.arguments.FriendArgumentType.listSuggestions

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/arguments/FriendArgumentType.java:43`

```java
@Override public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> context, SuggestionsBuilder builder)
```

## meteordevelopment.meteorclient.commands.arguments.FriendArgumentType.getExamples

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/arguments/FriendArgumentType.java:48`

```java
@Override public Collection<String> getExamples()
```

## meteordevelopment.meteorclient.commands.arguments.MacroArgumentType

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/arguments/MacroArgumentType.java:24`

```java
public class MacroArgumentType implements ArgumentType<Macro>
```

## meteordevelopment.meteorclient.commands.arguments.MacroArgumentType.create

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/arguments/MacroArgumentType.java:28`

```java
public static MacroArgumentType create()
```

## meteordevelopment.meteorclient.commands.arguments.MacroArgumentType.get

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/arguments/MacroArgumentType.java:32`

```java
public static Macro get(CommandContext<?> context)
```

## meteordevelopment.meteorclient.commands.arguments.MacroArgumentType.parse

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/arguments/MacroArgumentType.java:38`

```java
@Override public Macro parse(StringReader reader) throws CommandSyntaxException
```

## meteordevelopment.meteorclient.commands.arguments.MacroArgumentType.listSuggestions

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/arguments/MacroArgumentType.java:47`

```java
@Override public CompletableFuture<Suggestions> listSuggestions(CommandContext context, SuggestionsBuilder builder)
```

## meteordevelopment.meteorclient.commands.arguments.MacroArgumentType.getExamples

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/arguments/MacroArgumentType.java:59`

```java
@Override public Collection<String> getExamples()
```

## meteordevelopment.meteorclient.commands.arguments.ModuleArgumentType

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/arguments/ModuleArgumentType.java:24`

```java
public class ModuleArgumentType implements ArgumentType<Module>
```

## meteordevelopment.meteorclient.commands.arguments.ModuleArgumentType.create

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/arguments/ModuleArgumentType.java:34`

```java
public static ModuleArgumentType create()
```

## meteordevelopment.meteorclient.commands.arguments.ModuleArgumentType.get

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/arguments/ModuleArgumentType.java:38`

```java
public static Module get(CommandContext<?> context)
```

## meteordevelopment.meteorclient.commands.arguments.ModuleArgumentType.parse

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/arguments/ModuleArgumentType.java:44`

```java
@Override public Module parse(StringReader reader) throws CommandSyntaxException
```

## meteordevelopment.meteorclient.commands.arguments.ModuleArgumentType.listSuggestions

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/arguments/ModuleArgumentType.java:53`

```java
@Override public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> context, SuggestionsBuilder builder)
```

## meteordevelopment.meteorclient.commands.arguments.ModuleArgumentType.getExamples

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/arguments/ModuleArgumentType.java:58`

```java
@Override public Collection<String> getExamples()
```

## meteordevelopment.meteorclient.commands.arguments.NotebotSongArgumentType

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/arguments/NotebotSongArgumentType.java:23`

```java
public class NotebotSongArgumentType implements ArgumentType<Path>
```

## meteordevelopment.meteorclient.commands.arguments.NotebotSongArgumentType.create

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/arguments/NotebotSongArgumentType.java:26`

```java
public static NotebotSongArgumentType create()
```

## meteordevelopment.meteorclient.commands.arguments.NotebotSongArgumentType.parse

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/arguments/NotebotSongArgumentType.java:32`

```java
@Override public Path parse(StringReader reader) throws CommandSyntaxException
```

## meteordevelopment.meteorclient.commands.arguments.NotebotSongArgumentType.listSuggestions

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/arguments/NotebotSongArgumentType.java:39`

```java
@Override public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> context, SuggestionsBuilder builder)
```

## meteordevelopment.meteorclient.commands.arguments.PlayerArgumentType

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/arguments/PlayerArgumentType.java:25`

```java
public class PlayerArgumentType implements ArgumentType<PlayerEntity>
```

## meteordevelopment.meteorclient.commands.arguments.PlayerArgumentType.create

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/arguments/PlayerArgumentType.java:31`

```java
public static PlayerArgumentType create()
```

## meteordevelopment.meteorclient.commands.arguments.PlayerArgumentType.get

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/arguments/PlayerArgumentType.java:35`

```java
public static PlayerEntity get(CommandContext<?> context)
```

## meteordevelopment.meteorclient.commands.arguments.PlayerArgumentType.parse

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/arguments/PlayerArgumentType.java:41`

```java
@Override public PlayerEntity parse(StringReader reader) throws CommandSyntaxException
```

## meteordevelopment.meteorclient.commands.arguments.PlayerArgumentType.listSuggestions

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/arguments/PlayerArgumentType.java:57`

```java
@Override public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> context, SuggestionsBuilder builder)
```

## meteordevelopment.meteorclient.commands.arguments.PlayerArgumentType.getExamples

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/arguments/PlayerArgumentType.java:62`

```java
@Override public Collection<String> getExamples()
```

## meteordevelopment.meteorclient.commands.arguments.PlayerListEntryArgumentType

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/arguments/PlayerListEntryArgumentType.java:25`

```java
public class PlayerListEntryArgumentType implements ArgumentType<PlayerListEntry>
```

## meteordevelopment.meteorclient.commands.arguments.PlayerListEntryArgumentType.create

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/arguments/PlayerListEntryArgumentType.java:31`

```java
public static PlayerListEntryArgumentType create()
```

## meteordevelopment.meteorclient.commands.arguments.PlayerListEntryArgumentType.get

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/arguments/PlayerListEntryArgumentType.java:35`

```java
public static PlayerListEntry get(CommandContext<?> context)
```

## meteordevelopment.meteorclient.commands.arguments.PlayerListEntryArgumentType.parse

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/arguments/PlayerListEntryArgumentType.java:41`

```java
@Override public PlayerListEntry parse(StringReader reader) throws CommandSyntaxException
```

## meteordevelopment.meteorclient.commands.arguments.PlayerListEntryArgumentType.listSuggestions

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/arguments/PlayerListEntryArgumentType.java:57`

```java
@Override public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> context, SuggestionsBuilder builder)
```

## meteordevelopment.meteorclient.commands.arguments.PlayerListEntryArgumentType.getExamples

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/arguments/PlayerListEntryArgumentType.java:62`

```java
@Override public Collection<String> getExamples()
```

## meteordevelopment.meteorclient.commands.arguments.ProfileArgumentType

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/arguments/ProfileArgumentType.java:26`

```java
public class ProfileArgumentType implements ArgumentType<String>
```

## meteordevelopment.meteorclient.commands.arguments.ProfileArgumentType.create

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/arguments/ProfileArgumentType.java:32`

```java
public static ProfileArgumentType create()
```

## meteordevelopment.meteorclient.commands.arguments.ProfileArgumentType.get

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/arguments/ProfileArgumentType.java:36`

```java
public static Profile get(CommandContext<?> context)
```

## meteordevelopment.meteorclient.commands.arguments.ProfileArgumentType.parse

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/arguments/ProfileArgumentType.java:42`

```java
@Override public String parse(StringReader reader) throws CommandSyntaxException
```

## meteordevelopment.meteorclient.commands.arguments.ProfileArgumentType.listSuggestions

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/arguments/ProfileArgumentType.java:51`

```java
@Override public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> context, SuggestionsBuilder builder)
```

## meteordevelopment.meteorclient.commands.arguments.ProfileArgumentType.getExamples

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/arguments/ProfileArgumentType.java:56`

```java
@Override public Collection<String> getExamples()
```

## meteordevelopment.meteorclient.commands.arguments.RegistryEntryReferenceArgumentType

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/arguments/RegistryEntryReferenceArgumentType.java:34`

```java
public class RegistryEntryReferenceArgumentType<T> implements ArgumentType<RegistryEntry.Reference<T>>
```

## meteordevelopment.meteorclient.commands.arguments.RegistryEntryReferenceArgumentType.NOT_FOUND_EXCEPTION

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/arguments/RegistryEntryReferenceArgumentType.java:42`

```java
public static final Dynamic2CommandExceptionType NOT_FOUND_EXCEPTION = new Dynamic2CommandExceptionType( (element, type) -> Text.stringifiedTranslatable("argument.resource.not_found", element, type) )
```

## meteordevelopment.meteorclient.commands.arguments.RegistryEntryReferenceArgumentType.INVALID_TYPE_EXCEPTION

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/arguments/RegistryEntryReferenceArgumentType.java:45`

```java
public static final Dynamic3CommandExceptionType INVALID_TYPE_EXCEPTION = new Dynamic3CommandExceptionType( (element, type, expectedType) -> Text.stringifiedTranslatable("argument.resource.invalid_type", element, type, expectedType) )
```

## meteordevelopment.meteorclient.commands.arguments.RegistryEntryReferenceArgumentType.enchantment

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/arguments/RegistryEntryReferenceArgumentType.java:54`

```java
public static RegistryEntryReferenceArgumentType<Enchantment> enchantment()
```

## meteordevelopment.meteorclient.commands.arguments.RegistryEntryReferenceArgumentType.entityAttribute

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/arguments/RegistryEntryReferenceArgumentType.java:58`

```java
public static RegistryEntryReferenceArgumentType<EntityAttribute> entityAttribute()
```

## meteordevelopment.meteorclient.commands.arguments.RegistryEntryReferenceArgumentType.structure

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/arguments/RegistryEntryReferenceArgumentType.java:62`

```java
public static RegistryEntryReferenceArgumentType<Structure> structure()
```

## meteordevelopment.meteorclient.commands.arguments.RegistryEntryReferenceArgumentType.entityType

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/arguments/RegistryEntryReferenceArgumentType.java:66`

```java
public static RegistryEntryReferenceArgumentType<EntityType<?>> entityType()
```

## meteordevelopment.meteorclient.commands.arguments.RegistryEntryReferenceArgumentType.statusEffect

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/arguments/RegistryEntryReferenceArgumentType.java:70`

```java
public static RegistryEntryReferenceArgumentType<StatusEffect> statusEffect()
```

## meteordevelopment.meteorclient.commands.arguments.RegistryEntryReferenceArgumentType.getEnchantment

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/arguments/RegistryEntryReferenceArgumentType.java:74`

```java
public static RegistryEntry.Reference<Enchantment> getEnchantment(CommandContext<?> context, String name) throws CommandSyntaxException
```

## meteordevelopment.meteorclient.commands.arguments.RegistryEntryReferenceArgumentType.getEntityAttribute

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/arguments/RegistryEntryReferenceArgumentType.java:78`

```java
public static RegistryEntry.Reference<EntityAttribute> getEntityAttribute(CommandContext<?> context, String name) throws CommandSyntaxException
```

## meteordevelopment.meteorclient.commands.arguments.RegistryEntryReferenceArgumentType.getStructure

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/arguments/RegistryEntryReferenceArgumentType.java:82`

```java
public static RegistryEntry.Reference<Structure> getStructure(CommandContext<?> context, String name) throws CommandSyntaxException
```

## meteordevelopment.meteorclient.commands.arguments.RegistryEntryReferenceArgumentType.getEntityType

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/arguments/RegistryEntryReferenceArgumentType.java:86`

```java
public static RegistryEntry.Reference<EntityType<?>> getEntityType(CommandContext<?> context, String name) throws CommandSyntaxException
```

## meteordevelopment.meteorclient.commands.arguments.RegistryEntryReferenceArgumentType.getStatusEffect

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/arguments/RegistryEntryReferenceArgumentType.java:90`

```java
public static RegistryEntry.Reference<StatusEffect> getStatusEffect(CommandContext<?> context, String name) throws CommandSyntaxException
```

## meteordevelopment.meteorclient.commands.arguments.RegistryEntryReferenceArgumentType.parse

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/arguments/RegistryEntryReferenceArgumentType.java:105`

```java
@Override public RegistryEntry.Reference<T> parse(StringReader reader) throws CommandSyntaxException
```

## meteordevelopment.meteorclient.commands.arguments.RegistryEntryReferenceArgumentType.listSuggestions

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/arguments/RegistryEntryReferenceArgumentType.java:115`

```java
@Override public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> context, SuggestionsBuilder builder)
```

## meteordevelopment.meteorclient.commands.arguments.RegistryEntryReferenceArgumentType.getExamples

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/arguments/RegistryEntryReferenceArgumentType.java:120`

```java
@Override public Collection<String> getExamples()
```

## meteordevelopment.meteorclient.commands.arguments.SettingArgumentType

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/arguments/SettingArgumentType.java:25`

```java
public class SettingArgumentType implements ArgumentType<String>
```

## meteordevelopment.meteorclient.commands.arguments.SettingArgumentType.create

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/arguments/SettingArgumentType.java:29`

```java
public static SettingArgumentType create()
```

## meteordevelopment.meteorclient.commands.arguments.SettingArgumentType.get

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/arguments/SettingArgumentType.java:33`

```java
public static Setting<?> get(CommandContext<?> context) throws CommandSyntaxException
```

## meteordevelopment.meteorclient.commands.arguments.SettingArgumentType.get

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/arguments/SettingArgumentType.java:39`

```java
public static Setting<?> get(CommandContext<?> context, Settings settings) throws CommandSyntaxException
```

## meteordevelopment.meteorclient.commands.arguments.SettingArgumentType.parse

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/arguments/SettingArgumentType.java:50`

```java
@Override public String parse(StringReader reader) throws CommandSyntaxException
```

## meteordevelopment.meteorclient.commands.arguments.SettingArgumentType.listSuggestions

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/arguments/SettingArgumentType.java:55`

```java
@Override public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> context, SuggestionsBuilder builder)
```

## meteordevelopment.meteorclient.commands.arguments.SettingArgumentType.listSuggestions

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/arguments/SettingArgumentType.java:60`

```java
public static CompletableFuture<Suggestions> listSuggestions(SuggestionsBuilder builder, Settings settings)
```

## meteordevelopment.meteorclient.commands.arguments.SettingValueArgumentType

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/arguments/SettingValueArgumentType.java:22`

```java
public class SettingValueArgumentType implements ArgumentType<String>
```

## meteordevelopment.meteorclient.commands.arguments.SettingValueArgumentType.create

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/arguments/SettingValueArgumentType.java:25`

```java
public static SettingValueArgumentType create()
```

## meteordevelopment.meteorclient.commands.arguments.SettingValueArgumentType.get

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/arguments/SettingValueArgumentType.java:29`

```java
public static String get(CommandContext<?> context)
```

## meteordevelopment.meteorclient.commands.arguments.SettingValueArgumentType.parse

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/arguments/SettingValueArgumentType.java:35`

```java
@Override public String parse(StringReader reader) throws CommandSyntaxException
```

## meteordevelopment.meteorclient.commands.arguments.SettingValueArgumentType.listSuggestions

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/arguments/SettingValueArgumentType.java:42`

```java
@Override public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> context, SuggestionsBuilder builder)
```

## meteordevelopment.meteorclient.commands.arguments.SettingValueArgumentType.listSuggestions

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/arguments/SettingValueArgumentType.java:55`

```java
public static <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> context, SuggestionsBuilder builder, Settings settings)
```

## meteordevelopment.meteorclient.commands.arguments.SettingValueArgumentType.suggest

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/arguments/SettingValueArgumentType.java:67`

```java
public static CompletableFuture<Suggestions> suggest(SuggestionsBuilder builder, @NotNull Setting<?> setting)
```

## meteordevelopment.meteorclient.commands.arguments.WaypointArgumentType

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/arguments/WaypointArgumentType.java:25`

```java
public class WaypointArgumentType implements ArgumentType<String>
```

## meteordevelopment.meteorclient.commands.arguments.WaypointArgumentType.create

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/arguments/WaypointArgumentType.java:35`

```java
public static WaypointArgumentType create()
```

## meteordevelopment.meteorclient.commands.arguments.WaypointArgumentType.create

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/arguments/WaypointArgumentType.java:39`

```java
public static WaypointArgumentType create(boolean greedy)
```

## meteordevelopment.meteorclient.commands.arguments.WaypointArgumentType.get

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/arguments/WaypointArgumentType.java:43`

```java
public static Waypoint get(CommandContext<?> context)
```

## meteordevelopment.meteorclient.commands.arguments.WaypointArgumentType.get

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/arguments/WaypointArgumentType.java:47`

```java
public static Waypoint get(CommandContext<?> context, String name)
```

## meteordevelopment.meteorclient.commands.arguments.WaypointArgumentType.parse

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/arguments/WaypointArgumentType.java:51`

```java
@Override public String parse(StringReader reader) throws CommandSyntaxException
```

## meteordevelopment.meteorclient.commands.arguments.WaypointArgumentType.listSuggestions

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/arguments/WaypointArgumentType.java:63`

```java
@Override public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> context, SuggestionsBuilder builder)
```

## meteordevelopment.meteorclient.commands.arguments.WaypointArgumentType.getExamples

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/arguments/WaypointArgumentType.java:68`

```java
@Override public Collection<String> getExamples()
```

## meteordevelopment.meteorclient.commands.commands.BindCommand

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/commands/BindCommand.java:15`

```java
public class BindCommand extends Command
```

## meteordevelopment.meteorclient.commands.commands.BindCommand.BindCommand

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/commands/BindCommand.java:16`

```java
public BindCommand()
```

## meteordevelopment.meteorclient.commands.commands.BindCommand.build

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/commands/BindCommand.java:20`

```java
@Override public void build(LiteralArgumentBuilder<CommandSource> builder)
```

## meteordevelopment.meteorclient.commands.commands.BindsCommand

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/commands/BindsCommand.java:22`

```java
public class BindsCommand extends Command
```

## meteordevelopment.meteorclient.commands.commands.BindsCommand.BindsCommand

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/commands/BindsCommand.java:23`

```java
public BindsCommand()
```

## meteordevelopment.meteorclient.commands.commands.BindsCommand.build

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/commands/BindsCommand.java:27`

```java
@Override public void build(LiteralArgumentBuilder<CommandSource> builder)
```

## meteordevelopment.meteorclient.commands.commands.CommandsCommand

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/commands/CommandsCommand.java:21`

```java
public class CommandsCommand extends Command
```

## meteordevelopment.meteorclient.commands.commands.CommandsCommand.CommandsCommand

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/commands/CommandsCommand.java:22`

```java
public CommandsCommand()
```

## meteordevelopment.meteorclient.commands.commands.CommandsCommand.build

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/commands/CommandsCommand.java:26`

```java
@Override public void build(LiteralArgumentBuilder<CommandSource> builder)
```

## meteordevelopment.meteorclient.commands.commands.DamageCommand

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/commands/DamageCommand.java:20`

```java
public class DamageCommand extends Command
```

## meteordevelopment.meteorclient.commands.commands.DamageCommand.DamageCommand

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/commands/DamageCommand.java:23`

```java
public DamageCommand()
```

## meteordevelopment.meteorclient.commands.commands.DamageCommand.build

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/commands/DamageCommand.java:27`

```java
@Override public void build(LiteralArgumentBuilder<CommandSource> builder)
```

## meteordevelopment.meteorclient.commands.commands.DisconnectCommand

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/commands/DisconnectCommand.java:16`

```java
public class DisconnectCommand extends Command
```

## meteordevelopment.meteorclient.commands.commands.DisconnectCommand.DisconnectCommand

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/commands/DisconnectCommand.java:17`

```java
public DisconnectCommand()
```

## meteordevelopment.meteorclient.commands.commands.DisconnectCommand.build

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/commands/DisconnectCommand.java:21`

```java
@Override public void build(LiteralArgumentBuilder<CommandSource> builder)
```

## meteordevelopment.meteorclient.commands.commands.DismountCommand

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/commands/DismountCommand.java:14`

```java
public class DismountCommand extends Command
```

## meteordevelopment.meteorclient.commands.commands.DismountCommand.DismountCommand

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/commands/DismountCommand.java:15`

```java
public DismountCommand()
```

## meteordevelopment.meteorclient.commands.commands.DismountCommand.build

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/commands/DismountCommand.java:19`

```java
@Override public void build(LiteralArgumentBuilder<CommandSource> builder)
```

## meteordevelopment.meteorclient.commands.commands.DropCommand

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/commands/DropCommand.java:24`

```java
public class DropCommand extends Command
```

## meteordevelopment.meteorclient.commands.commands.DropCommand.DropCommand

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/commands/DropCommand.java:28`

```java
public DropCommand()
```

## meteordevelopment.meteorclient.commands.commands.DropCommand.build

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/commands/DropCommand.java:32`

```java
@Override public void build(LiteralArgumentBuilder<CommandSource> builder)
```

## meteordevelopment.meteorclient.commands.commands.EnchantCommand

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/commands/EnchantCommand.java:26`

```java
public class EnchantCommand extends Command
```

## meteordevelopment.meteorclient.commands.commands.EnchantCommand.EnchantCommand

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/commands/EnchantCommand.java:30`

```java
public EnchantCommand()
```

## meteordevelopment.meteorclient.commands.commands.EnchantCommand.build

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/commands/EnchantCommand.java:34`

```java
@Override public void build(LiteralArgumentBuilder<CommandSource> builder)
```

## meteordevelopment.meteorclient.commands.commands.EnderChestCommand

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/commands/EnderChestCommand.java:15`

```java
public class EnderChestCommand extends Command
```

## meteordevelopment.meteorclient.commands.commands.EnderChestCommand.EnderChestCommand

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/commands/EnderChestCommand.java:16`

```java
public EnderChestCommand()
```

## meteordevelopment.meteorclient.commands.commands.EnderChestCommand.build

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/commands/EnderChestCommand.java:20`

```java
@Override public void build(LiteralArgumentBuilder<CommandSource> builder)
```

## meteordevelopment.meteorclient.commands.commands.FakePlayerCommand

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/commands/FakePlayerCommand.java:19`

```java
public class FakePlayerCommand extends Command
```

## meteordevelopment.meteorclient.commands.commands.FakePlayerCommand.FakePlayerCommand

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/commands/FakePlayerCommand.java:20`

```java
public FakePlayerCommand()
```

## meteordevelopment.meteorclient.commands.commands.FakePlayerCommand.build

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/commands/FakePlayerCommand.java:24`

```java
@Override public void build(LiteralArgumentBuilder<CommandSource> builder)
```

## meteordevelopment.meteorclient.commands.commands.FovCommand

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/commands/FovCommand.java:14`

```java
public class FovCommand extends Command
```

## meteordevelopment.meteorclient.commands.commands.FovCommand.FovCommand

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/commands/FovCommand.java:15`

```java
public FovCommand()
```

## meteordevelopment.meteorclient.commands.commands.FovCommand.build

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/commands/FovCommand.java:19`

```java
@Override public void build(LiteralArgumentBuilder<CommandSource> builder)
```

## meteordevelopment.meteorclient.commands.commands.FriendsCommand

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/commands/FriendsCommand.java:19`

```java
public class FriendsCommand extends Command
```

## meteordevelopment.meteorclient.commands.commands.FriendsCommand.FriendsCommand

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/commands/FriendsCommand.java:20`

```java
public FriendsCommand()
```

## meteordevelopment.meteorclient.commands.commands.FriendsCommand.build

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/commands/FriendsCommand.java:24`

```java
@Override public void build(LiteralArgumentBuilder<CommandSource> builder)
```

## meteordevelopment.meteorclient.commands.commands.GamemodeCommand

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/commands/GamemodeCommand.java:13`

```java
public class GamemodeCommand extends Command
```

## meteordevelopment.meteorclient.commands.commands.GamemodeCommand.GamemodeCommand

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/commands/GamemodeCommand.java:14`

```java
public GamemodeCommand()
```

## meteordevelopment.meteorclient.commands.commands.GamemodeCommand.build

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/commands/GamemodeCommand.java:18`

```java
@Override public void build(LiteralArgumentBuilder<CommandSource> builder)
```

## meteordevelopment.meteorclient.commands.commands.GiveCommand

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/commands/GiveCommand.java:21`

```java
public class GiveCommand extends Command
```

## meteordevelopment.meteorclient.commands.commands.GiveCommand.GiveCommand

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/commands/GiveCommand.java:25`

```java
public GiveCommand()
```

## meteordevelopment.meteorclient.commands.commands.GiveCommand.build

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/commands/GiveCommand.java:29`

```java
@Override public void build(LiteralArgumentBuilder<CommandSource> builder)
```

## meteordevelopment.meteorclient.commands.commands.HClipCommand

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/commands/HClipCommand.java:15`

```java
public class HClipCommand extends Command
```

## meteordevelopment.meteorclient.commands.commands.HClipCommand.HClipCommand

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/commands/HClipCommand.java:16`

```java
public HClipCommand()
```

## meteordevelopment.meteorclient.commands.commands.HClipCommand.build

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/commands/HClipCommand.java:20`

```java
@Override public void build(LiteralArgumentBuilder<CommandSource> builder)
```

## meteordevelopment.meteorclient.commands.commands.HelpCommand

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/commands/HelpCommand.java:21`

```java
public class HelpCommand extends Command
```

## meteordevelopment.meteorclient.commands.commands.HelpCommand.HelpCommand

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/commands/HelpCommand.java:22`

```java
public HelpCommand()
```

## meteordevelopment.meteorclient.commands.commands.HelpCommand.build

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/commands/HelpCommand.java:26`

```java
@Override public void build(LiteralArgumentBuilder<CommandSource> builder)
```

## meteordevelopment.meteorclient.commands.commands.InputCommand

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/commands/InputCommand.java:23`

```java
public class InputCommand extends Command
```

## meteordevelopment.meteorclient.commands.commands.InputCommand.InputCommand

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/commands/InputCommand.java:43`

```java
public InputCommand()
```

## meteordevelopment.meteorclient.commands.commands.InputCommand.build

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/commands/InputCommand.java:47`

```java
@Override public void build(LiteralArgumentBuilder<CommandSource> builder)
```

## meteordevelopment.meteorclient.commands.commands.InventoryCommand

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/commands/InventoryCommand.java:15`

```java
public class InventoryCommand extends Command
```

## meteordevelopment.meteorclient.commands.commands.InventoryCommand.InventoryCommand

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/commands/InventoryCommand.java:16`

```java
public InventoryCommand()
```

## meteordevelopment.meteorclient.commands.commands.InventoryCommand.build

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/commands/InventoryCommand.java:20`

```java
@Override public void build(LiteralArgumentBuilder<CommandSource> builder)
```

## meteordevelopment.meteorclient.commands.commands.LocateCommand

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/commands/LocateCommand.java:40`

```java
public class LocateCommand extends Command
```

## meteordevelopment.meteorclient.commands.commands.LocateCommand.LocateCommand

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/commands/LocateCommand.java:69`

```java
public LocateCommand()
```

## meteordevelopment.meteorclient.commands.commands.LocateCommand.build

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/commands/LocateCommand.java:73`

```java
@Override public void build(LiteralArgumentBuilder<CommandSource> builder)
```

## meteordevelopment.meteorclient.commands.commands.MacroCommand

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/commands/MacroCommand.java:22`

```java
public class MacroCommand extends Command
```

## meteordevelopment.meteorclient.commands.commands.MacroCommand.MacroCommand

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/commands/MacroCommand.java:23`

```java
public MacroCommand()
```

## meteordevelopment.meteorclient.commands.commands.MacroCommand.build

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/commands/MacroCommand.java:32`

```java
@Override public void build(LiteralArgumentBuilder<CommandSource> builder)
```

## meteordevelopment.meteorclient.commands.commands.MacroCommand.clearAll

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/commands/MacroCommand.java:81`

```java
public void clearAll()
```

## meteordevelopment.meteorclient.commands.commands.MacroCommand.isScheduled

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/commands/MacroCommand.java:86`

```java
public boolean isScheduled(Macro macro)
```

## meteordevelopment.meteorclient.commands.commands.MacroCommand.clear

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/commands/MacroCommand.java:91`

```java
public void clear(Macro macro)
```

## meteordevelopment.meteorclient.commands.commands.ScheduledMacro.delay

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/commands/MacroCommand.java:116`

```java
public int delay
```

## meteordevelopment.meteorclient.commands.commands.ScheduledMacro.macro

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/commands/MacroCommand.java:117`

```java
public Macro macro
```

## meteordevelopment.meteorclient.commands.commands.ScheduledMacro.ScheduledMacro

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/commands/MacroCommand.java:119`

```java
public ScheduledMacro(int tickDelay, Macro scheduledMacro)
```

## meteordevelopment.meteorclient.commands.commands.ScheduledMacro.tick

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/commands/MacroCommand.java:124`

```java
public void tick()
```

## meteordevelopment.meteorclient.commands.commands.ScheduledMacro.run

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/commands/MacroCommand.java:128`

```java
public boolean run()
```

## meteordevelopment.meteorclient.commands.commands.ModulesCommand

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/commands/ModulesCommand.java:19`

```java
public class ModulesCommand extends Command
```

## meteordevelopment.meteorclient.commands.commands.ModulesCommand.ModulesCommand

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/commands/ModulesCommand.java:20`

```java
public ModulesCommand()
```

## meteordevelopment.meteorclient.commands.commands.ModulesCommand.build

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/commands/ModulesCommand.java:24`

```java
@Override public void build(LiteralArgumentBuilder<CommandSource> builder)
```

## meteordevelopment.meteorclient.commands.commands.NameHistoryCommand

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/commands/NameHistoryCommand.java:28`

```java
public class NameHistoryCommand extends Command
```

## meteordevelopment.meteorclient.commands.commands.NameHistoryCommand.NameHistoryCommand

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/commands/NameHistoryCommand.java:29`

```java
public NameHistoryCommand()
```

## meteordevelopment.meteorclient.commands.commands.NameHistoryCommand.build

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/commands/NameHistoryCommand.java:33`

```java
@Override public void build(LiteralArgumentBuilder<CommandSource> builder)
```

## meteordevelopment.meteorclient.commands.commands.NbtCommand

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/commands/NbtCommand.java:40`

```java
public class NbtCommand extends Command
```

## meteordevelopment.meteorclient.commands.commands.NbtCommand.NbtCommand

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/commands/NbtCommand.java:53`

```java
public NbtCommand()
```

## meteordevelopment.meteorclient.commands.commands.NbtCommand.build

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/commands/NbtCommand.java:57`

```java
@Override public void build(LiteralArgumentBuilder<CommandSource> builder)
```

## meteordevelopment.meteorclient.commands.commands.NotebotCommand

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/commands/NotebotCommand.java:36`

```java
public class NotebotCommand extends Command
```

## meteordevelopment.meteorclient.commands.commands.NotebotCommand.NotebotCommand

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/commands/NotebotCommand.java:43`

```java
public NotebotCommand()
```

## meteordevelopment.meteorclient.commands.commands.NotebotCommand.build

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/commands/NotebotCommand.java:47`

```java
@Override public void build(LiteralArgumentBuilder<CommandSource> builder)
```

## meteordevelopment.meteorclient.commands.commands.PeekCommand

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/commands/PeekCommand.java:17`

```java
public class PeekCommand extends Command
```

## meteordevelopment.meteorclient.commands.commands.PeekCommand.PeekCommand

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/commands/PeekCommand.java:21`

```java
public PeekCommand()
```

## meteordevelopment.meteorclient.commands.commands.PeekCommand.build

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/commands/PeekCommand.java:25`

```java
@Override public void build(LiteralArgumentBuilder<CommandSource> builder)
```

## meteordevelopment.meteorclient.commands.commands.ProfilesCommand

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/commands/ProfilesCommand.java:15`

```java
public class ProfilesCommand extends Command
```

## meteordevelopment.meteorclient.commands.commands.ProfilesCommand.ProfilesCommand

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/commands/ProfilesCommand.java:17`

```java
public ProfilesCommand()
```

## meteordevelopment.meteorclient.commands.commands.ProfilesCommand.build

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/commands/ProfilesCommand.java:21`

```java
@Override public void build(LiteralArgumentBuilder<CommandSource> builder)
```

## meteordevelopment.meteorclient.commands.commands.ReloadCommand

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/commands/ReloadCommand.java:18`

```java
public class ReloadCommand extends Command
```

## meteordevelopment.meteorclient.commands.commands.ReloadCommand.ReloadCommand

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/commands/ReloadCommand.java:19`

```java
public ReloadCommand()
```

## meteordevelopment.meteorclient.commands.commands.ReloadCommand.build

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/commands/ReloadCommand.java:23`

```java
@Override public void build(LiteralArgumentBuilder<CommandSource> builder)
```

## meteordevelopment.meteorclient.commands.commands.ResetCommand

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/commands/ResetCommand.java:19`

```java
public class ResetCommand extends Command
```

## meteordevelopment.meteorclient.commands.commands.ResetCommand.ResetCommand

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/commands/ResetCommand.java:21`

```java
public ResetCommand()
```

## meteordevelopment.meteorclient.commands.commands.ResetCommand.build

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/commands/ResetCommand.java:25`

```java
@Override public void build(LiteralArgumentBuilder<CommandSource> builder)
```

## meteordevelopment.meteorclient.commands.commands.RotationCommand

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/commands/RotationCommand.java:16`

```java
public class RotationCommand extends Command
```

## meteordevelopment.meteorclient.commands.commands.RotationCommand.RotationCommand

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/commands/RotationCommand.java:17`

```java
public RotationCommand()
```

## meteordevelopment.meteorclient.commands.commands.RotationCommand.build

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/commands/RotationCommand.java:21`

```java
@Override public void build(LiteralArgumentBuilder<CommandSource> builder)
```

## meteordevelopment.meteorclient.commands.commands.SaveMapCommand

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/commands/SaveMapCommand.java:35`

```java
public class SaveMapCommand extends Command
```

## meteordevelopment.meteorclient.commands.commands.SaveMapCommand.SaveMapCommand

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/commands/SaveMapCommand.java:41`

```java
public SaveMapCommand()
```

## meteordevelopment.meteorclient.commands.commands.SaveMapCommand.build

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/commands/SaveMapCommand.java:52`

```java
@Override public void build(LiteralArgumentBuilder<CommandSource> builder)
```

## meteordevelopment.meteorclient.commands.commands.SayCommand

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/commands/SayCommand.java:24`

```java
public class SayCommand extends Command
```

## meteordevelopment.meteorclient.commands.commands.SayCommand.SayCommand

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/commands/SayCommand.java:25`

```java
public SayCommand()
```

## meteordevelopment.meteorclient.commands.commands.SayCommand.build

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/commands/SayCommand.java:29`

```java
@Override public void build(LiteralArgumentBuilder<CommandSource> builder)
```

## meteordevelopment.meteorclient.commands.commands.ServerCommand

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/commands/ServerCommand.java:45`

```java
public class ServerCommand extends Command
```

## meteordevelopment.meteorclient.commands.commands.ServerCommand.ServerCommand

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/commands/ServerCommand.java:56`

```java
public ServerCommand()
```

## meteordevelopment.meteorclient.commands.commands.ServerCommand.build

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/commands/ServerCommand.java:62`

```java
@Override public void build(LiteralArgumentBuilder<CommandSource> builder)
```

## meteordevelopment.meteorclient.commands.commands.ServerCommand.formatPerms

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/commands/ServerCommand.java:163`

```java
public String formatPerms()
```

## meteordevelopment.meteorclient.commands.commands.SettingCommand

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/commands/SettingCommand.java:26`

```java
public class SettingCommand extends Command
```

## meteordevelopment.meteorclient.commands.commands.SettingCommand.SettingCommand

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/commands/SettingCommand.java:27`

```java
public SettingCommand()
```

## meteordevelopment.meteorclient.commands.commands.SettingCommand.build

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/commands/SettingCommand.java:31`

```java
@Override public void build(LiteralArgumentBuilder<CommandSource> builder)
```

## meteordevelopment.meteorclient.commands.commands.SpectateCommand

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/commands/SpectateCommand.java:19`

```java
public class SpectateCommand extends Command
```

## meteordevelopment.meteorclient.commands.commands.SpectateCommand.SpectateCommand

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/commands/SpectateCommand.java:23`

```java
public SpectateCommand()
```

## meteordevelopment.meteorclient.commands.commands.SpectateCommand.build

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/commands/SpectateCommand.java:27`

```java
@Override public void build(LiteralArgumentBuilder<CommandSource> builder)
```

## meteordevelopment.meteorclient.commands.commands.SwarmCommand

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/commands/SwarmCommand.java:40`

```java
public class SwarmCommand extends Command
```

## meteordevelopment.meteorclient.commands.commands.SwarmCommand.SwarmCommand

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/commands/SwarmCommand.java:45`

```java
public SwarmCommand()
```

## meteordevelopment.meteorclient.commands.commands.SwarmCommand.build

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/commands/SwarmCommand.java:49`

```java
@Override public void build(LiteralArgumentBuilder<CommandSource> builder)
```

## meteordevelopment.meteorclient.commands.commands.ToggleCommand

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/commands/ToggleCommand.java:18`

```java
public class ToggleCommand extends Command
```

## meteordevelopment.meteorclient.commands.commands.ToggleCommand.ToggleCommand

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/commands/ToggleCommand.java:19`

```java
public ToggleCommand()
```

## meteordevelopment.meteorclient.commands.commands.ToggleCommand.build

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/commands/ToggleCommand.java:23`

```java
@Override public void build(LiteralArgumentBuilder<CommandSource> builder)
```

## meteordevelopment.meteorclient.commands.commands.VClipCommand

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/commands/VClipCommand.java:15`

```java
public class VClipCommand extends Command
```

## meteordevelopment.meteorclient.commands.commands.VClipCommand.VClipCommand

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/commands/VClipCommand.java:16`

```java
public VClipCommand()
```

## meteordevelopment.meteorclient.commands.commands.VClipCommand.build

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/commands/VClipCommand.java:20`

```java
@Override public void build(LiteralArgumentBuilder<CommandSource> builder)
```

## meteordevelopment.meteorclient.commands.commands.WaspCommand

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/commands/WaspCommand.java:18`

```java
public class WaspCommand extends Command
```

## meteordevelopment.meteorclient.commands.commands.WaspCommand.WaspCommand

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/commands/WaspCommand.java:21`

```java
public WaspCommand()
```

## meteordevelopment.meteorclient.commands.commands.WaspCommand.build

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/commands/WaspCommand.java:25`

```java
@Override public void build(LiteralArgumentBuilder<CommandSource> builder)
```

## meteordevelopment.meteorclient.commands.commands.WaypointCommand

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/commands/WaypointCommand.java:21`

```java
public class WaypointCommand extends Command
```

## meteordevelopment.meteorclient.commands.commands.WaypointCommand.WaypointCommand

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/commands/WaypointCommand.java:22`

```java
public WaypointCommand()
```

## meteordevelopment.meteorclient.commands.commands.WaypointCommand.build

Nguồn: `upstream/meteor-1.21.11/src/main/java/meteordevelopment/meteorclient/commands/commands/WaypointCommand.java:26`

```java
@Override public void build(LiteralArgumentBuilder<CommandSource> builder)
```
