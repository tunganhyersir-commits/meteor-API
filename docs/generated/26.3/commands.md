# commands

Khai báo Java có cú pháp public/protected. Không bao gồm API kế thừa/tổng hợp bởi compiler; xem kiểm tra bytecode riêng.

## meteordevelopment.meteorclient.commands.Command

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/Command.java:25`

```java
public abstract class Command
```

## meteordevelopment.meteorclient.commands.Command.REGISTRY_ACCESS

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/Command.java:26`

```java
protected static CommandBuildContext REGISTRY_ACCESS = Commands.createValidationContext(VanillaRegistries.createWorldLookup())
```

## meteordevelopment.meteorclient.commands.Command.SINGLE_SUCCESS

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/Command.java:27`

```java
protected static final int SINGLE_SUCCESS = com.mojang.brigadier.Command.SINGLE_SUCCESS
```

## meteordevelopment.meteorclient.commands.Command.mc

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/Command.java:28`

```java
protected static final Minecraft mc = MeteorClient.mc
```

## meteordevelopment.meteorclient.commands.Command.Command

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/Command.java:35`

```java
public Command(String name, String description, String... aliases)
```

## meteordevelopment.meteorclient.commands.Command.argument

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/Command.java:43`

```java
protected static <T> RequiredArgumentBuilder<ClientSuggestionProvider, T> argument(final String name, final ArgumentType<T> type)
```

## meteordevelopment.meteorclient.commands.Command.literal

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/Command.java:47`

```java
protected static LiteralArgumentBuilder<ClientSuggestionProvider> literal(final String name)
```

## meteordevelopment.meteorclient.commands.Command.registerTo

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/Command.java:51`

```java
public final void registerTo(CommandDispatcher<ClientSuggestionProvider> dispatcher)
```

## meteordevelopment.meteorclient.commands.Command.register

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/Command.java:56`

```java
public void register(CommandDispatcher<ClientSuggestionProvider> dispatcher, String name)
```

## meteordevelopment.meteorclient.commands.Command.build

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/Command.java:62`

```java
public abstract void build(LiteralArgumentBuilder<ClientSuggestionProvider> builder)
```

## meteordevelopment.meteorclient.commands.Command.getName

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/Command.java:64`

```java
public String getName()
```

## meteordevelopment.meteorclient.commands.Command.getDescription

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/Command.java:68`

```java
public String getDescription()
```

## meteordevelopment.meteorclient.commands.Command.getAliases

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/Command.java:72`

```java
public List<String> getAliases()
```

## meteordevelopment.meteorclient.commands.Command.toString

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/Command.java:76`

```java
public String toString()
```

## meteordevelopment.meteorclient.commands.Command.toString

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/Command.java:80`

```java
public String toString(String... args)
```

## meteordevelopment.meteorclient.commands.Command.info

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/Command.java:86`

```java
public void info(Component message)
```

## meteordevelopment.meteorclient.commands.Command.info

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/Command.java:91`

```java
public void info(String message, Object... args)
```

## meteordevelopment.meteorclient.commands.Command.warning

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/Command.java:96`

```java
public void warning(String message, Object... args)
```

## meteordevelopment.meteorclient.commands.Command.error

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/Command.java:101`

```java
public void error(String message, Object... args)
```

## meteordevelopment.meteorclient.commands.Commands

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/Commands.java:26`

```java
public class Commands
```

## meteordevelopment.meteorclient.commands.Commands.COMMANDS

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/Commands.java:27`

```java
public static final List<Command> COMMANDS = new ArrayList<>()
```

## meteordevelopment.meteorclient.commands.Commands.DISPATCHER

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/Commands.java:28`

```java
public static CommandDispatcher<ClientSuggestionProvider> DISPATCHER = new CommandDispatcher<>()
```

## meteordevelopment.meteorclient.commands.Commands.init

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/Commands.java:30`

```java
@PostInit(dependencies = PathManagers.class) public static void init()
```

## meteordevelopment.meteorclient.commands.Commands.add

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/Commands.java:77`

```java
public static void add(Command command)
```

## meteordevelopment.meteorclient.commands.Commands.dispatch

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/Commands.java:82`

```java
public static void dispatch(String message) throws CommandSyntaxException
```

## meteordevelopment.meteorclient.commands.Commands.get

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/Commands.java:86`

```java
public static Command get(String name)
```

## meteordevelopment.meteorclient.commands.arguments.BlockPosArgumentType

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/arguments/BlockPosArgumentType.java:68`

```java
public class BlockPosArgumentType implements ArgumentType<BlockPosArgumentType.PosArgument>
```

## meteordevelopment.meteorclient.commands.arguments.BlockPosArgumentType.UNLOADED_EXCEPTION

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/arguments/BlockPosArgumentType.java:71`

```java
public static final SimpleCommandExceptionType UNLOADED_EXCEPTION = new SimpleCommandExceptionType(Component.translatable("argument.pos.unloaded"))
```

## meteordevelopment.meteorclient.commands.arguments.BlockPosArgumentType.OUT_OF_WORLD_EXCEPTION

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/arguments/BlockPosArgumentType.java:72`

```java
public static final SimpleCommandExceptionType OUT_OF_WORLD_EXCEPTION = new SimpleCommandExceptionType(Component.translatable("argument.pos.outofworld"))
```

## meteordevelopment.meteorclient.commands.arguments.BlockPosArgumentType.OUT_OF_BOUNDS_EXCEPTION

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/arguments/BlockPosArgumentType.java:73`

```java
public static final SimpleCommandExceptionType OUT_OF_BOUNDS_EXCEPTION = new SimpleCommandExceptionType(Component.translatable("argument.pos.outofbounds"))
```

## meteordevelopment.meteorclient.commands.arguments.BlockPosArgumentType.blockPos

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/arguments/BlockPosArgumentType.java:78`

```java
public static BlockPosArgumentType blockPos()
```

## meteordevelopment.meteorclient.commands.arguments.BlockPosArgumentType.getLoadedBlockPos

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/arguments/BlockPosArgumentType.java:82`

```java
public static <S> BlockPos getLoadedBlockPos(CommandContext<S> context, String name) throws CommandSyntaxException
```

## meteordevelopment.meteorclient.commands.arguments.BlockPosArgumentType.getLoadedBlockPos

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/arguments/BlockPosArgumentType.java:87`

```java
public static <S> BlockPos getLoadedBlockPos(CommandContext<S> context, ClientLevel level, String name) throws CommandSyntaxException
```

## meteordevelopment.meteorclient.commands.arguments.BlockPosArgumentType.getBlockPos

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/arguments/BlockPosArgumentType.java:99`

```java
public static <S> BlockPos getBlockPos(CommandContext<S> context, String name)
```

## meteordevelopment.meteorclient.commands.arguments.BlockPosArgumentType.getValidBlockPos

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/arguments/BlockPosArgumentType.java:103`

```java
public static <S> BlockPos getValidBlockPos(CommandContext<S> context, String name) throws CommandSyntaxException
```

## meteordevelopment.meteorclient.commands.arguments.BlockPosArgumentType.parse

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/arguments/BlockPosArgumentType.java:112`

```java
public PosArgument parse(StringReader stringReader) throws CommandSyntaxException
```

## meteordevelopment.meteorclient.commands.arguments.BlockPosArgumentType.listSuggestions

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/arguments/BlockPosArgumentType.java:116`

```java
@Override public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> context, SuggestionsBuilder builder)
```

## meteordevelopment.meteorclient.commands.arguments.BlockPosArgumentType.getExamples

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/arguments/BlockPosArgumentType.java:133`

```java
@Override public Collection<String> getExamples()
```

## meteordevelopment.meteorclient.commands.arguments.BlockPosArgumentType.PosArgument

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/arguments/BlockPosArgumentType.java:138`

```java
public interface PosArgument
```

## meteordevelopment.meteorclient.commands.arguments.BlockPosArgumentType.PosArgument.getPosition

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/arguments/BlockPosArgumentType.java:139`

```java
<S> Vec3 getPosition(S var1)
```

## meteordevelopment.meteorclient.commands.arguments.BlockPosArgumentType.PosArgument.getRotation

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/arguments/BlockPosArgumentType.java:141`

```java
<S> Vec2 getRotation(S var1)
```

## meteordevelopment.meteorclient.commands.arguments.BlockPosArgumentType.PosArgument.getBlockPos

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/arguments/BlockPosArgumentType.java:143`

```java
default <S> BlockPos getBlockPos(S source)
```

## meteordevelopment.meteorclient.commands.arguments.BlockPosArgumentType.PosArgument.isXRelative

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/arguments/BlockPosArgumentType.java:147`

```java
boolean isXRelative()
```

## meteordevelopment.meteorclient.commands.arguments.BlockPosArgumentType.PosArgument.isYRelative

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/arguments/BlockPosArgumentType.java:149`

```java
boolean isYRelative()
```

## meteordevelopment.meteorclient.commands.arguments.BlockPosArgumentType.PosArgument.isZRelative

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/arguments/BlockPosArgumentType.java:151`

```java
boolean isZRelative()
```

## meteordevelopment.meteorclient.commands.arguments.BlockPosArgumentType.DefaultPosArgument

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/arguments/BlockPosArgumentType.java:154`

```java
public static class DefaultPosArgument implements PosArgument
```

## meteordevelopment.meteorclient.commands.arguments.BlockPosArgumentType.DefaultPosArgument.DefaultPosArgument

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/arguments/BlockPosArgumentType.java:159`

```java
public DefaultPosArgument(WorldCoordinate x, WorldCoordinate y, WorldCoordinate z)
```

## meteordevelopment.meteorclient.commands.arguments.BlockPosArgumentType.DefaultPosArgument.getPosition

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/arguments/BlockPosArgumentType.java:165`

```java
@Override public <S> Vec3 getPosition(S source)
```

## meteordevelopment.meteorclient.commands.arguments.BlockPosArgumentType.DefaultPosArgument.getRotation

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/arguments/BlockPosArgumentType.java:171`

```java
@Override public <S> Vec2 getRotation(S source)
```

## meteordevelopment.meteorclient.commands.arguments.BlockPosArgumentType.DefaultPosArgument.isXRelative

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/arguments/BlockPosArgumentType.java:177`

```java
@Override public boolean isXRelative()
```

## meteordevelopment.meteorclient.commands.arguments.BlockPosArgumentType.DefaultPosArgument.isYRelative

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/arguments/BlockPosArgumentType.java:182`

```java
@Override public boolean isYRelative()
```

## meteordevelopment.meteorclient.commands.arguments.BlockPosArgumentType.DefaultPosArgument.isZRelative

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/arguments/BlockPosArgumentType.java:187`

```java
@Override public boolean isZRelative()
```

## meteordevelopment.meteorclient.commands.arguments.BlockPosArgumentType.DefaultPosArgument.equals

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/arguments/BlockPosArgumentType.java:192`

```java
public boolean equals(Object o)
```

## meteordevelopment.meteorclient.commands.arguments.BlockPosArgumentType.DefaultPosArgument.parse

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/arguments/BlockPosArgumentType.java:202`

```java
public static DefaultPosArgument parse(StringReader reader) throws CommandSyntaxException
```

## meteordevelopment.meteorclient.commands.arguments.BlockPosArgumentType.DefaultPosArgument.parse

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/arguments/BlockPosArgumentType.java:218`

```java
public static DefaultPosArgument parse(StringReader reader, boolean centerIntegers) throws CommandSyntaxException
```

## meteordevelopment.meteorclient.commands.arguments.BlockPosArgumentType.DefaultPosArgument.absolute

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/arguments/BlockPosArgumentType.java:234`

```java
public static DefaultPosArgument absolute(double x, double y, double z)
```

## meteordevelopment.meteorclient.commands.arguments.BlockPosArgumentType.DefaultPosArgument.absolute

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/arguments/BlockPosArgumentType.java:238`

```java
public static DefaultPosArgument absolute(Vec2 vec)
```

## meteordevelopment.meteorclient.commands.arguments.BlockPosArgumentType.DefaultPosArgument.current

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/arguments/BlockPosArgumentType.java:242`

```java
public static DefaultPosArgument current()
```

## meteordevelopment.meteorclient.commands.arguments.BlockPosArgumentType.DefaultPosArgument.hashCode

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/arguments/BlockPosArgumentType.java:246`

```java
@Override public int hashCode()
```

## meteordevelopment.meteorclient.commands.arguments.BlockPosArgumentType.LookingPosArgument

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/arguments/BlockPosArgumentType.java:254`

```java
public static class LookingPosArgument implements PosArgument
```

## meteordevelopment.meteorclient.commands.arguments.BlockPosArgumentType.LookingPosArgument.LookingPosArgument

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/arguments/BlockPosArgumentType.java:259`

```java
public LookingPosArgument(double x, double y, double z)
```

## meteordevelopment.meteorclient.commands.arguments.BlockPosArgumentType.LookingPosArgument.getPosition

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/arguments/BlockPosArgumentType.java:265`

```java
@Override public <S> Vec3 getPosition(S source)
```

## meteordevelopment.meteorclient.commands.arguments.BlockPosArgumentType.LookingPosArgument.getRotation

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/arguments/BlockPosArgumentType.java:284`

```java
@Override public <S> Vec2 getRotation(S source)
```

## meteordevelopment.meteorclient.commands.arguments.BlockPosArgumentType.LookingPosArgument.isXRelative

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/arguments/BlockPosArgumentType.java:289`

```java
@Override public boolean isXRelative()
```

## meteordevelopment.meteorclient.commands.arguments.BlockPosArgumentType.LookingPosArgument.isYRelative

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/arguments/BlockPosArgumentType.java:294`

```java
@Override public boolean isYRelative()
```

## meteordevelopment.meteorclient.commands.arguments.BlockPosArgumentType.LookingPosArgument.isZRelative

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/arguments/BlockPosArgumentType.java:299`

```java
@Override public boolean isZRelative()
```

## meteordevelopment.meteorclient.commands.arguments.BlockPosArgumentType.LookingPosArgument.parse

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/arguments/BlockPosArgumentType.java:304`

```java
public static LookingPosArgument parse(StringReader reader) throws CommandSyntaxException
```

## meteordevelopment.meteorclient.commands.arguments.BlockPosArgumentType.LookingPosArgument.equals

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/arguments/BlockPosArgumentType.java:334`

```java
public boolean equals(Object o)
```

## meteordevelopment.meteorclient.commands.arguments.BlockPosArgumentType.LookingPosArgument.hashCode

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/arguments/BlockPosArgumentType.java:344`

```java
public int hashCode()
```

## meteordevelopment.meteorclient.commands.arguments.CommandArgumentType

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/arguments/CommandArgumentType.java:25`

```java
public class CommandArgumentType implements ArgumentType<Command>
```

## meteordevelopment.meteorclient.commands.arguments.CommandArgumentType.create

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/arguments/CommandArgumentType.java:33`

```java
public static CommandArgumentType create()
```

## meteordevelopment.meteorclient.commands.arguments.CommandArgumentType.get

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/arguments/CommandArgumentType.java:37`

```java
public static Command get(CommandContext<?> context)
```

## meteordevelopment.meteorclient.commands.arguments.CommandArgumentType.parse

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/arguments/CommandArgumentType.java:41`

```java
@Override public Command parse(StringReader reader) throws CommandSyntaxException
```

## meteordevelopment.meteorclient.commands.arguments.CommandArgumentType.listSuggestions

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/arguments/CommandArgumentType.java:63`

```java
@Override public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> context, SuggestionsBuilder builder)
```

## meteordevelopment.meteorclient.commands.arguments.CommandArgumentType.getExamples

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/arguments/CommandArgumentType.java:73`

```java
@Override public Collection<String> getExamples()
```

## meteordevelopment.meteorclient.commands.arguments.ComponentMapArgumentType

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/arguments/ComponentMapArgumentType.java:23`

```java
public class ComponentMapArgumentType implements ArgumentType<DataComponentMap>
```

## meteordevelopment.meteorclient.commands.arguments.ComponentMapArgumentType.ComponentMapArgumentType

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/arguments/ComponentMapArgumentType.java:27`

```java
public ComponentMapArgumentType(CommandBuildContext commandRegistryAccess)
```

## meteordevelopment.meteorclient.commands.arguments.ComponentMapArgumentType.componentMap

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/arguments/ComponentMapArgumentType.java:31`

```java
public static ComponentMapArgumentType componentMap(CommandBuildContext commandRegistryAccess)
```

## meteordevelopment.meteorclient.commands.arguments.ComponentMapArgumentType.getComponentMap

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/arguments/ComponentMapArgumentType.java:35`

```java
public static <S extends SharedSuggestionProvider> DataComponentMap getComponentMap(CommandContext<S> context, String name)
```

## meteordevelopment.meteorclient.commands.arguments.ComponentMapArgumentType.parse

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/arguments/ComponentMapArgumentType.java:39`

```java
@Override public DataComponentMap parse(StringReader reader) throws CommandSyntaxException
```

## meteordevelopment.meteorclient.commands.arguments.ComponentMapArgumentType.listSuggestions

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/arguments/ComponentMapArgumentType.java:44`

```java
@Override public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> context, SuggestionsBuilder builder)
```

## meteordevelopment.meteorclient.commands.arguments.ComponentMapArgumentType.getExamples

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/arguments/ComponentMapArgumentType.java:49`

```java
@Override public Collection<String> getExamples()
```

## meteordevelopment.meteorclient.commands.arguments.CompoundNbtTagArgumentType

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/arguments/CompoundNbtTagArgumentType.java:20`

```java
public class CompoundNbtTagArgumentType implements ArgumentType<CompoundTag>
```

## meteordevelopment.meteorclient.commands.arguments.CompoundNbtTagArgumentType.create

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/arguments/CompoundNbtTagArgumentType.java:24`

```java
public static CompoundNbtTagArgumentType create()
```

## meteordevelopment.meteorclient.commands.arguments.CompoundNbtTagArgumentType.get

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/arguments/CompoundNbtTagArgumentType.java:28`

```java
public static CompoundTag get(CommandContext<?> context)
```

## meteordevelopment.meteorclient.commands.arguments.CompoundNbtTagArgumentType.parse

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/arguments/CompoundNbtTagArgumentType.java:35`

```java
@Override public CompoundTag parse(StringReader reader) throws CommandSyntaxException
```

## meteordevelopment.meteorclient.commands.arguments.CompoundNbtTagArgumentType.getExamples

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/arguments/CompoundNbtTagArgumentType.java:61`

```java
@Override public Collection<String> getExamples()
```

## meteordevelopment.meteorclient.commands.arguments.DirectionArgumentType

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/arguments/DirectionArgumentType.java:11`

```java
public class DirectionArgumentType extends StringRepresentableArgument<Direction>
```

## meteordevelopment.meteorclient.commands.arguments.DirectionArgumentType.create

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/arguments/DirectionArgumentType.java:18`

```java
public static DirectionArgumentType create()
```

## meteordevelopment.meteorclient.commands.arguments.FakePlayerArgumentType

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/arguments/FakePlayerArgumentType.java:23`

```java
public class FakePlayerArgumentType implements ArgumentType<String>
```

## meteordevelopment.meteorclient.commands.arguments.FakePlayerArgumentType.create

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/arguments/FakePlayerArgumentType.java:27`

```java
public static FakePlayerArgumentType create()
```

## meteordevelopment.meteorclient.commands.arguments.FakePlayerArgumentType.get

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/arguments/FakePlayerArgumentType.java:31`

```java
public static FakePlayerEntity get(CommandContext<?> context)
```

## meteordevelopment.meteorclient.commands.arguments.FakePlayerArgumentType.parse

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/arguments/FakePlayerArgumentType.java:38`

```java
@Override public String parse(StringReader reader) throws CommandSyntaxException
```

## meteordevelopment.meteorclient.commands.arguments.FakePlayerArgumentType.listSuggestions

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/arguments/FakePlayerArgumentType.java:43`

```java
@Override public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> context, SuggestionsBuilder builder)
```

## meteordevelopment.meteorclient.commands.arguments.FakePlayerArgumentType.getExamples

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/arguments/FakePlayerArgumentType.java:48`

```java
@Override public Collection<String> getExamples()
```

## meteordevelopment.meteorclient.commands.arguments.FriendArgumentType

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/arguments/FriendArgumentType.java:24`

```java
public class FriendArgumentType implements ArgumentType<String>
```

## meteordevelopment.meteorclient.commands.arguments.FriendArgumentType.create

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/arguments/FriendArgumentType.java:28`

```java
public static FriendArgumentType create()
```

## meteordevelopment.meteorclient.commands.arguments.FriendArgumentType.get

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/arguments/FriendArgumentType.java:32`

```java
public static Friend get(CommandContext<?> context)
```

## meteordevelopment.meteorclient.commands.arguments.FriendArgumentType.parse

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/arguments/FriendArgumentType.java:39`

```java
@Override public String parse(StringReader reader) throws CommandSyntaxException
```

## meteordevelopment.meteorclient.commands.arguments.FriendArgumentType.listSuggestions

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/arguments/FriendArgumentType.java:44`

```java
@Override public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> context, SuggestionsBuilder builder)
```

## meteordevelopment.meteorclient.commands.arguments.FriendArgumentType.getExamples

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/arguments/FriendArgumentType.java:49`

```java
@Override public Collection<String> getExamples()
```

## meteordevelopment.meteorclient.commands.arguments.MacroArgumentType

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/arguments/MacroArgumentType.java:23`

```java
public class MacroArgumentType implements ArgumentType<Macro>
```

## meteordevelopment.meteorclient.commands.arguments.MacroArgumentType.create

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/arguments/MacroArgumentType.java:27`

```java
public static MacroArgumentType create()
```

## meteordevelopment.meteorclient.commands.arguments.MacroArgumentType.get

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/arguments/MacroArgumentType.java:31`

```java
public static Macro get(CommandContext<?> context)
```

## meteordevelopment.meteorclient.commands.arguments.MacroArgumentType.parse

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/arguments/MacroArgumentType.java:38`

```java
@Override public Macro parse(StringReader reader) throws CommandSyntaxException
```

## meteordevelopment.meteorclient.commands.arguments.MacroArgumentType.listSuggestions

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/arguments/MacroArgumentType.java:47`

```java
@Override public CompletableFuture<Suggestions> listSuggestions(CommandContext context, SuggestionsBuilder builder)
```

## meteordevelopment.meteorclient.commands.arguments.MacroArgumentType.getExamples

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/arguments/MacroArgumentType.java:59`

```java
@Override public Collection<String> getExamples()
```

## meteordevelopment.meteorclient.commands.arguments.ModuleArgumentType

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/arguments/ModuleArgumentType.java:23`

```java
public class ModuleArgumentType implements ArgumentType<Module>
```

## meteordevelopment.meteorclient.commands.arguments.ModuleArgumentType.create

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/arguments/ModuleArgumentType.java:33`

```java
public static ModuleArgumentType create()
```

## meteordevelopment.meteorclient.commands.arguments.ModuleArgumentType.get

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/arguments/ModuleArgumentType.java:37`

```java
public static Module get(CommandContext<?> context)
```

## meteordevelopment.meteorclient.commands.arguments.ModuleArgumentType.parse

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/arguments/ModuleArgumentType.java:44`

```java
@Override public Module parse(StringReader reader) throws CommandSyntaxException
```

## meteordevelopment.meteorclient.commands.arguments.ModuleArgumentType.listSuggestions

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/arguments/ModuleArgumentType.java:53`

```java
@Override public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> context, SuggestionsBuilder builder)
```

## meteordevelopment.meteorclient.commands.arguments.ModuleArgumentType.getExamples

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/arguments/ModuleArgumentType.java:58`

```java
@Override public Collection<String> getExamples()
```

## meteordevelopment.meteorclient.commands.arguments.NotebotSongArgumentType

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/arguments/NotebotSongArgumentType.java:23`

```java
public class NotebotSongArgumentType implements ArgumentType<Path>
```

## meteordevelopment.meteorclient.commands.arguments.NotebotSongArgumentType.create

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/arguments/NotebotSongArgumentType.java:26`

```java
public static NotebotSongArgumentType create()
```

## meteordevelopment.meteorclient.commands.arguments.NotebotSongArgumentType.parse

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/arguments/NotebotSongArgumentType.java:33`

```java
@Override public Path parse(StringReader reader) throws CommandSyntaxException
```

## meteordevelopment.meteorclient.commands.arguments.NotebotSongArgumentType.listSuggestions

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/arguments/NotebotSongArgumentType.java:40`

```java
@Override public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> context, SuggestionsBuilder builder)
```

## meteordevelopment.meteorclient.commands.arguments.PlayerArgumentType

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/arguments/PlayerArgumentType.java:25`

```java
public class PlayerArgumentType implements ArgumentType<Player>
```

## meteordevelopment.meteorclient.commands.arguments.PlayerArgumentType.create

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/arguments/PlayerArgumentType.java:31`

```java
public static PlayerArgumentType create()
```

## meteordevelopment.meteorclient.commands.arguments.PlayerArgumentType.get

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/arguments/PlayerArgumentType.java:35`

```java
public static Player get(CommandContext<?> context)
```

## meteordevelopment.meteorclient.commands.arguments.PlayerArgumentType.parse

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/arguments/PlayerArgumentType.java:42`

```java
@Override public Player parse(StringReader reader) throws CommandSyntaxException
```

## meteordevelopment.meteorclient.commands.arguments.PlayerArgumentType.listSuggestions

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/arguments/PlayerArgumentType.java:58`

```java
@Override public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> context, SuggestionsBuilder builder)
```

## meteordevelopment.meteorclient.commands.arguments.PlayerArgumentType.getExamples

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/arguments/PlayerArgumentType.java:63`

```java
@Override public Collection<String> getExamples()
```

## meteordevelopment.meteorclient.commands.arguments.PlayerListEntryArgumentType

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/arguments/PlayerListEntryArgumentType.java:25`

```java
public class PlayerListEntryArgumentType implements ArgumentType<PlayerInfo>
```

## meteordevelopment.meteorclient.commands.arguments.PlayerListEntryArgumentType.create

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/arguments/PlayerListEntryArgumentType.java:31`

```java
public static PlayerListEntryArgumentType create()
```

## meteordevelopment.meteorclient.commands.arguments.PlayerListEntryArgumentType.get

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/arguments/PlayerListEntryArgumentType.java:35`

```java
public static PlayerInfo get(CommandContext<?> context)
```

## meteordevelopment.meteorclient.commands.arguments.PlayerListEntryArgumentType.parse

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/arguments/PlayerListEntryArgumentType.java:42`

```java
@Override public PlayerInfo parse(StringReader reader) throws CommandSyntaxException
```

## meteordevelopment.meteorclient.commands.arguments.PlayerListEntryArgumentType.listSuggestions

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/arguments/PlayerListEntryArgumentType.java:58`

```java
@Override public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> context, SuggestionsBuilder builder)
```

## meteordevelopment.meteorclient.commands.arguments.PlayerListEntryArgumentType.getExamples

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/arguments/PlayerListEntryArgumentType.java:63`

```java
@Override public Collection<String> getExamples()
```

## meteordevelopment.meteorclient.commands.arguments.ProfileArgumentType

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/arguments/ProfileArgumentType.java:26`

```java
public class ProfileArgumentType implements ArgumentType<String>
```

## meteordevelopment.meteorclient.commands.arguments.ProfileArgumentType.create

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/arguments/ProfileArgumentType.java:32`

```java
public static ProfileArgumentType create()
```

## meteordevelopment.meteorclient.commands.arguments.ProfileArgumentType.get

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/arguments/ProfileArgumentType.java:36`

```java
public static Profile get(CommandContext<?> context)
```

## meteordevelopment.meteorclient.commands.arguments.ProfileArgumentType.parse

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/arguments/ProfileArgumentType.java:43`

```java
@Override public String parse(StringReader reader) throws CommandSyntaxException
```

## meteordevelopment.meteorclient.commands.arguments.ProfileArgumentType.listSuggestions

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/arguments/ProfileArgumentType.java:52`

```java
@Override public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> context, SuggestionsBuilder builder)
```

## meteordevelopment.meteorclient.commands.arguments.ProfileArgumentType.getExamples

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/arguments/ProfileArgumentType.java:57`

```java
@Override public Collection<String> getExamples()
```

## meteordevelopment.meteorclient.commands.arguments.RegistryEntryReferenceArgumentType

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/arguments/RegistryEntryReferenceArgumentType.java:34`

```java
public class RegistryEntryReferenceArgumentType<T> implements ArgumentType<Holder.Reference<T>>
```

## meteordevelopment.meteorclient.commands.arguments.RegistryEntryReferenceArgumentType.NOT_FOUND_EXCEPTION

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/arguments/RegistryEntryReferenceArgumentType.java:42`

```java
public static final Dynamic2CommandExceptionType NOT_FOUND_EXCEPTION = new Dynamic2CommandExceptionType( (element, type) -> Component.translatableEscape("argument.resource.not_found", element, type) )
```

## meteordevelopment.meteorclient.commands.arguments.RegistryEntryReferenceArgumentType.INVALID_TYPE_EXCEPTION

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/arguments/RegistryEntryReferenceArgumentType.java:45`

```java
public static final Dynamic3CommandExceptionType INVALID_TYPE_EXCEPTION = new Dynamic3CommandExceptionType( (element, type, expectedType) -> Component.translatableEscape("argument.resource.invalid_type", element, type, expectedType) )
```

## meteordevelopment.meteorclient.commands.arguments.RegistryEntryReferenceArgumentType.enchantment

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/arguments/RegistryEntryReferenceArgumentType.java:54`

```java
public static RegistryEntryReferenceArgumentType<Enchantment> enchantment()
```

## meteordevelopment.meteorclient.commands.arguments.RegistryEntryReferenceArgumentType.entityAttribute

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/arguments/RegistryEntryReferenceArgumentType.java:58`

```java
public static RegistryEntryReferenceArgumentType<Attribute> entityAttribute()
```

## meteordevelopment.meteorclient.commands.arguments.RegistryEntryReferenceArgumentType.structure

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/arguments/RegistryEntryReferenceArgumentType.java:62`

```java
public static RegistryEntryReferenceArgumentType<Structure> structure()
```

## meteordevelopment.meteorclient.commands.arguments.RegistryEntryReferenceArgumentType.entityType

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/arguments/RegistryEntryReferenceArgumentType.java:66`

```java
public static RegistryEntryReferenceArgumentType<EntityType<?>> entityType()
```

## meteordevelopment.meteorclient.commands.arguments.RegistryEntryReferenceArgumentType.statusEffect

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/arguments/RegistryEntryReferenceArgumentType.java:70`

```java
public static RegistryEntryReferenceArgumentType<MobEffect> statusEffect()
```

## meteordevelopment.meteorclient.commands.arguments.RegistryEntryReferenceArgumentType.getEnchantment

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/arguments/RegistryEntryReferenceArgumentType.java:74`

```java
public static Holder.Reference<Enchantment> getEnchantment(CommandContext<?> context, String name) throws CommandSyntaxException
```

## meteordevelopment.meteorclient.commands.arguments.RegistryEntryReferenceArgumentType.getEntityAttribute

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/arguments/RegistryEntryReferenceArgumentType.java:78`

```java
public static Holder.Reference<Attribute> getEntityAttribute(CommandContext<?> context, String name) throws CommandSyntaxException
```

## meteordevelopment.meteorclient.commands.arguments.RegistryEntryReferenceArgumentType.getStructure

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/arguments/RegistryEntryReferenceArgumentType.java:82`

```java
public static Holder.Reference<Structure> getStructure(CommandContext<?> context, String name) throws CommandSyntaxException
```

## meteordevelopment.meteorclient.commands.arguments.RegistryEntryReferenceArgumentType.getEntityType

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/arguments/RegistryEntryReferenceArgumentType.java:86`

```java
public static Holder.Reference<EntityType<?>> getEntityType(CommandContext<?> context, String name) throws CommandSyntaxException
```

## meteordevelopment.meteorclient.commands.arguments.RegistryEntryReferenceArgumentType.getStatusEffect

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/arguments/RegistryEntryReferenceArgumentType.java:90`

```java
public static Holder.Reference<MobEffect> getStatusEffect(CommandContext<?> context, String name) throws CommandSyntaxException
```

## meteordevelopment.meteorclient.commands.arguments.RegistryEntryReferenceArgumentType.parse

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/arguments/RegistryEntryReferenceArgumentType.java:105`

```java
@Override public Holder.Reference<T> parse(StringReader reader) throws CommandSyntaxException
```

## meteordevelopment.meteorclient.commands.arguments.RegistryEntryReferenceArgumentType.listSuggestions

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/arguments/RegistryEntryReferenceArgumentType.java:115`

```java
@Override public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> context, SuggestionsBuilder builder)
```

## meteordevelopment.meteorclient.commands.arguments.RegistryEntryReferenceArgumentType.getExamples

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/arguments/RegistryEntryReferenceArgumentType.java:120`

```java
@Override public Collection<String> getExamples()
```

## meteordevelopment.meteorclient.commands.arguments.SettingArgumentType

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/arguments/SettingArgumentType.java:25`

```java
public class SettingArgumentType implements ArgumentType<String>
```

## meteordevelopment.meteorclient.commands.arguments.SettingArgumentType.create

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/arguments/SettingArgumentType.java:29`

```java
public static SettingArgumentType create()
```

## meteordevelopment.meteorclient.commands.arguments.SettingArgumentType.get

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/arguments/SettingArgumentType.java:33`

```java
public static Setting<?> get(CommandContext<?> context) throws CommandSyntaxException
```

## meteordevelopment.meteorclient.commands.arguments.SettingArgumentType.get

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/arguments/SettingArgumentType.java:39`

```java
public static Setting<?> get(CommandContext<?> context, Settings settings) throws CommandSyntaxException
```

## meteordevelopment.meteorclient.commands.arguments.SettingArgumentType.parse

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/arguments/SettingArgumentType.java:51`

```java
@Override public String parse(StringReader reader) throws CommandSyntaxException
```

## meteordevelopment.meteorclient.commands.arguments.SettingArgumentType.listSuggestions

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/arguments/SettingArgumentType.java:56`

```java
@Override public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> context, SuggestionsBuilder builder)
```

## meteordevelopment.meteorclient.commands.arguments.SettingArgumentType.listSuggestions

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/arguments/SettingArgumentType.java:61`

```java
public static CompletableFuture<Suggestions> listSuggestions(SuggestionsBuilder builder, Settings settings)
```

## meteordevelopment.meteorclient.commands.arguments.SettingValueArgumentType

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/arguments/SettingValueArgumentType.java:22`

```java
public class SettingValueArgumentType implements ArgumentType<String>
```

## meteordevelopment.meteorclient.commands.arguments.SettingValueArgumentType.create

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/arguments/SettingValueArgumentType.java:25`

```java
public static SettingValueArgumentType create()
```

## meteordevelopment.meteorclient.commands.arguments.SettingValueArgumentType.get

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/arguments/SettingValueArgumentType.java:29`

```java
public static String get(CommandContext<?> context)
```

## meteordevelopment.meteorclient.commands.arguments.SettingValueArgumentType.parse

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/arguments/SettingValueArgumentType.java:36`

```java
@Override public String parse(StringReader reader) throws CommandSyntaxException
```

## meteordevelopment.meteorclient.commands.arguments.SettingValueArgumentType.listSuggestions

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/arguments/SettingValueArgumentType.java:43`

```java
@Override public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> context, SuggestionsBuilder builder)
```

## meteordevelopment.meteorclient.commands.arguments.SettingValueArgumentType.listSuggestions

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/arguments/SettingValueArgumentType.java:56`

```java
public static <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> context, SuggestionsBuilder builder, Settings settings)
```

## meteordevelopment.meteorclient.commands.arguments.SettingValueArgumentType.suggest

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/arguments/SettingValueArgumentType.java:68`

```java
public static CompletableFuture<Suggestions> suggest(SuggestionsBuilder builder, @NonNull Setting<?> setting)
```

## meteordevelopment.meteorclient.commands.arguments.WaypointArgumentType

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/arguments/WaypointArgumentType.java:25`

```java
public class WaypointArgumentType implements ArgumentType<String>
```

## meteordevelopment.meteorclient.commands.arguments.WaypointArgumentType.create

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/arguments/WaypointArgumentType.java:35`

```java
public static WaypointArgumentType create()
```

## meteordevelopment.meteorclient.commands.arguments.WaypointArgumentType.create

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/arguments/WaypointArgumentType.java:39`

```java
public static WaypointArgumentType create(boolean greedy)
```

## meteordevelopment.meteorclient.commands.arguments.WaypointArgumentType.get

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/arguments/WaypointArgumentType.java:43`

```java
public static Waypoint get(CommandContext<?> context)
```

## meteordevelopment.meteorclient.commands.arguments.WaypointArgumentType.get

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/arguments/WaypointArgumentType.java:47`

```java
public static Waypoint get(CommandContext<?> context, String name)
```

## meteordevelopment.meteorclient.commands.arguments.WaypointArgumentType.parse

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/arguments/WaypointArgumentType.java:51`

```java
@Override public String parse(StringReader reader) throws CommandSyntaxException
```

## meteordevelopment.meteorclient.commands.arguments.WaypointArgumentType.listSuggestions

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/arguments/WaypointArgumentType.java:63`

```java
@Override public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> context, SuggestionsBuilder builder)
```

## meteordevelopment.meteorclient.commands.arguments.WaypointArgumentType.getExamples

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/arguments/WaypointArgumentType.java:68`

```java
@Override public Collection<String> getExamples()
```

## meteordevelopment.meteorclient.commands.commands.BindCommand

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/commands/BindCommand.java:15`

```java
public class BindCommand extends Command
```

## meteordevelopment.meteorclient.commands.commands.BindCommand.BindCommand

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/commands/BindCommand.java:16`

```java
public BindCommand()
```

## meteordevelopment.meteorclient.commands.commands.BindCommand.build

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/commands/BindCommand.java:20`

```java
@Override public void build(LiteralArgumentBuilder<ClientSuggestionProvider> builder)
```

## meteordevelopment.meteorclient.commands.commands.BindsCommand

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/commands/BindsCommand.java:22`

```java
public class BindsCommand extends Command
```

## meteordevelopment.meteorclient.commands.commands.BindsCommand.BindsCommand

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/commands/BindsCommand.java:23`

```java
public BindsCommand()
```

## meteordevelopment.meteorclient.commands.commands.BindsCommand.build

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/commands/BindsCommand.java:27`

```java
@Override public void build(LiteralArgumentBuilder<ClientSuggestionProvider> builder)
```

## meteordevelopment.meteorclient.commands.commands.CommandsCommand

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/commands/CommandsCommand.java:21`

```java
public class CommandsCommand extends Command
```

## meteordevelopment.meteorclient.commands.commands.CommandsCommand.CommandsCommand

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/commands/CommandsCommand.java:22`

```java
public CommandsCommand()
```

## meteordevelopment.meteorclient.commands.commands.CommandsCommand.build

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/commands/CommandsCommand.java:26`

```java
@Override public void build(LiteralArgumentBuilder<ClientSuggestionProvider> builder)
```

## meteordevelopment.meteorclient.commands.commands.DamageCommand

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/commands/DamageCommand.java:20`

```java
public class DamageCommand extends Command
```

## meteordevelopment.meteorclient.commands.commands.DamageCommand.DamageCommand

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/commands/DamageCommand.java:23`

```java
public DamageCommand()
```

## meteordevelopment.meteorclient.commands.commands.DamageCommand.build

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/commands/DamageCommand.java:27`

```java
@Override public void build(LiteralArgumentBuilder<ClientSuggestionProvider> builder)
```

## meteordevelopment.meteorclient.commands.commands.DisconnectCommand

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/commands/DisconnectCommand.java:16`

```java
public class DisconnectCommand extends Command
```

## meteordevelopment.meteorclient.commands.commands.DisconnectCommand.DisconnectCommand

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/commands/DisconnectCommand.java:17`

```java
public DisconnectCommand()
```

## meteordevelopment.meteorclient.commands.commands.DisconnectCommand.build

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/commands/DisconnectCommand.java:21`

```java
@Override public void build(LiteralArgumentBuilder<ClientSuggestionProvider> builder)
```

## meteordevelopment.meteorclient.commands.commands.DismountCommand

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/commands/DismountCommand.java:14`

```java
public class DismountCommand extends Command
```

## meteordevelopment.meteorclient.commands.commands.DismountCommand.DismountCommand

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/commands/DismountCommand.java:15`

```java
public DismountCommand()
```

## meteordevelopment.meteorclient.commands.commands.DismountCommand.build

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/commands/DismountCommand.java:19`

```java
@Override public void build(LiteralArgumentBuilder<ClientSuggestionProvider> builder)
```

## meteordevelopment.meteorclient.commands.commands.DropCommand

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/commands/DropCommand.java:24`

```java
public class DropCommand extends Command
```

## meteordevelopment.meteorclient.commands.commands.DropCommand.DropCommand

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/commands/DropCommand.java:28`

```java
public DropCommand()
```

## meteordevelopment.meteorclient.commands.commands.DropCommand.build

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/commands/DropCommand.java:32`

```java
@Override public void build(LiteralArgumentBuilder<ClientSuggestionProvider> builder)
```

## meteordevelopment.meteorclient.commands.commands.EnchantCommand

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/commands/EnchantCommand.java:26`

```java
public class EnchantCommand extends Command
```

## meteordevelopment.meteorclient.commands.commands.EnchantCommand.EnchantCommand

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/commands/EnchantCommand.java:30`

```java
public EnchantCommand()
```

## meteordevelopment.meteorclient.commands.commands.EnchantCommand.build

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/commands/EnchantCommand.java:34`

```java
@Override public void build(LiteralArgumentBuilder<ClientSuggestionProvider> builder)
```

## meteordevelopment.meteorclient.commands.commands.EnderChestCommand

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/commands/EnderChestCommand.java:15`

```java
public class EnderChestCommand extends Command
```

## meteordevelopment.meteorclient.commands.commands.EnderChestCommand.EnderChestCommand

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/commands/EnderChestCommand.java:16`

```java
public EnderChestCommand()
```

## meteordevelopment.meteorclient.commands.commands.EnderChestCommand.build

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/commands/EnderChestCommand.java:20`

```java
@Override public void build(LiteralArgumentBuilder<ClientSuggestionProvider> builder)
```

## meteordevelopment.meteorclient.commands.commands.FakePlayerCommand

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/commands/FakePlayerCommand.java:19`

```java
public class FakePlayerCommand extends Command
```

## meteordevelopment.meteorclient.commands.commands.FakePlayerCommand.FakePlayerCommand

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/commands/FakePlayerCommand.java:20`

```java
public FakePlayerCommand()
```

## meteordevelopment.meteorclient.commands.commands.FakePlayerCommand.build

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/commands/FakePlayerCommand.java:24`

```java
@Override public void build(LiteralArgumentBuilder<ClientSuggestionProvider> builder)
```

## meteordevelopment.meteorclient.commands.commands.FovCommand

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/commands/FovCommand.java:14`

```java
public class FovCommand extends Command
```

## meteordevelopment.meteorclient.commands.commands.FovCommand.FovCommand

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/commands/FovCommand.java:15`

```java
public FovCommand()
```

## meteordevelopment.meteorclient.commands.commands.FovCommand.build

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/commands/FovCommand.java:19`

```java
@Override public void build(LiteralArgumentBuilder<ClientSuggestionProvider> builder)
```

## meteordevelopment.meteorclient.commands.commands.FriendsCommand

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/commands/FriendsCommand.java:19`

```java
public class FriendsCommand extends Command
```

## meteordevelopment.meteorclient.commands.commands.FriendsCommand.FriendsCommand

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/commands/FriendsCommand.java:20`

```java
public FriendsCommand()
```

## meteordevelopment.meteorclient.commands.commands.FriendsCommand.build

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/commands/FriendsCommand.java:24`

```java
@Override public void build(LiteralArgumentBuilder<ClientSuggestionProvider> builder)
```

## meteordevelopment.meteorclient.commands.commands.GamemodeCommand

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/commands/GamemodeCommand.java:13`

```java
public class GamemodeCommand extends Command
```

## meteordevelopment.meteorclient.commands.commands.GamemodeCommand.GamemodeCommand

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/commands/GamemodeCommand.java:14`

```java
public GamemodeCommand()
```

## meteordevelopment.meteorclient.commands.commands.GamemodeCommand.build

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/commands/GamemodeCommand.java:18`

```java
@Override public void build(LiteralArgumentBuilder<ClientSuggestionProvider> builder)
```

## meteordevelopment.meteorclient.commands.commands.GiveCommand

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/commands/GiveCommand.java:21`

```java
public class GiveCommand extends Command
```

## meteordevelopment.meteorclient.commands.commands.GiveCommand.GiveCommand

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/commands/GiveCommand.java:25`

```java
public GiveCommand()
```

## meteordevelopment.meteorclient.commands.commands.GiveCommand.build

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/commands/GiveCommand.java:29`

```java
@Override public void build(LiteralArgumentBuilder<ClientSuggestionProvider> builder)
```

## meteordevelopment.meteorclient.commands.commands.HClipCommand

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/commands/HClipCommand.java:15`

```java
public class HClipCommand extends Command
```

## meteordevelopment.meteorclient.commands.commands.HClipCommand.HClipCommand

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/commands/HClipCommand.java:16`

```java
public HClipCommand()
```

## meteordevelopment.meteorclient.commands.commands.HClipCommand.build

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/commands/HClipCommand.java:20`

```java
@Override public void build(LiteralArgumentBuilder<ClientSuggestionProvider> builder)
```

## meteordevelopment.meteorclient.commands.commands.HelpCommand

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/commands/HelpCommand.java:21`

```java
public class HelpCommand extends Command
```

## meteordevelopment.meteorclient.commands.commands.HelpCommand.HelpCommand

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/commands/HelpCommand.java:22`

```java
public HelpCommand()
```

## meteordevelopment.meteorclient.commands.commands.HelpCommand.build

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/commands/HelpCommand.java:26`

```java
@Override public void build(LiteralArgumentBuilder<ClientSuggestionProvider> builder)
```

## meteordevelopment.meteorclient.commands.commands.InputCommand

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/commands/InputCommand.java:23`

```java
public class InputCommand extends Command
```

## meteordevelopment.meteorclient.commands.commands.InputCommand.InputCommand

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/commands/InputCommand.java:43`

```java
public InputCommand()
```

## meteordevelopment.meteorclient.commands.commands.InputCommand.build

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/commands/InputCommand.java:47`

```java
@Override public void build(LiteralArgumentBuilder<ClientSuggestionProvider> builder)
```

## meteordevelopment.meteorclient.commands.commands.InventoryCommand

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/commands/InventoryCommand.java:15`

```java
public class InventoryCommand extends Command
```

## meteordevelopment.meteorclient.commands.commands.InventoryCommand.InventoryCommand

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/commands/InventoryCommand.java:16`

```java
public InventoryCommand()
```

## meteordevelopment.meteorclient.commands.commands.InventoryCommand.build

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/commands/InventoryCommand.java:20`

```java
@Override public void build(LiteralArgumentBuilder<ClientSuggestionProvider> builder)
```

## meteordevelopment.meteorclient.commands.commands.LocateCommand

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/commands/LocateCommand.java:40`

```java
public class LocateCommand extends Command
```

## meteordevelopment.meteorclient.commands.commands.LocateCommand.LocateCommand

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/commands/LocateCommand.java:69`

```java
public LocateCommand()
```

## meteordevelopment.meteorclient.commands.commands.LocateCommand.build

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/commands/LocateCommand.java:73`

```java
@Override public void build(LiteralArgumentBuilder<ClientSuggestionProvider> builder)
```

## meteordevelopment.meteorclient.commands.commands.MacroCommand

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/commands/MacroCommand.java:22`

```java
public class MacroCommand extends Command
```

## meteordevelopment.meteorclient.commands.commands.MacroCommand.MacroCommand

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/commands/MacroCommand.java:23`

```java
public MacroCommand()
```

## meteordevelopment.meteorclient.commands.commands.MacroCommand.build

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/commands/MacroCommand.java:32`

```java
@Override public void build(LiteralArgumentBuilder<ClientSuggestionProvider> builder)
```

## meteordevelopment.meteorclient.commands.commands.MacroCommand.clearAll

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/commands/MacroCommand.java:81`

```java
public void clearAll()
```

## meteordevelopment.meteorclient.commands.commands.MacroCommand.isScheduled

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/commands/MacroCommand.java:86`

```java
public boolean isScheduled(Macro macro)
```

## meteordevelopment.meteorclient.commands.commands.MacroCommand.clear

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/commands/MacroCommand.java:91`

```java
public void clear(Macro macro)
```

## meteordevelopment.meteorclient.commands.commands.ScheduledMacro.delay

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/commands/MacroCommand.java:116`

```java
public int delay
```

## meteordevelopment.meteorclient.commands.commands.ScheduledMacro.macro

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/commands/MacroCommand.java:117`

```java
public Macro macro
```

## meteordevelopment.meteorclient.commands.commands.ScheduledMacro.ScheduledMacro

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/commands/MacroCommand.java:119`

```java
public ScheduledMacro(int tickDelay, Macro scheduledMacro)
```

## meteordevelopment.meteorclient.commands.commands.ScheduledMacro.tick

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/commands/MacroCommand.java:124`

```java
public void tick()
```

## meteordevelopment.meteorclient.commands.commands.ScheduledMacro.run

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/commands/MacroCommand.java:128`

```java
public boolean run()
```

## meteordevelopment.meteorclient.commands.commands.ModulesCommand

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/commands/ModulesCommand.java:19`

```java
public class ModulesCommand extends Command
```

## meteordevelopment.meteorclient.commands.commands.ModulesCommand.ModulesCommand

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/commands/ModulesCommand.java:20`

```java
public ModulesCommand()
```

## meteordevelopment.meteorclient.commands.commands.ModulesCommand.build

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/commands/ModulesCommand.java:24`

```java
@Override public void build(LiteralArgumentBuilder<ClientSuggestionProvider> builder)
```

## meteordevelopment.meteorclient.commands.commands.NameHistoryCommand

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/commands/NameHistoryCommand.java:28`

```java
public class NameHistoryCommand extends Command
```

## meteordevelopment.meteorclient.commands.commands.NameHistoryCommand.NameHistoryCommand

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/commands/NameHistoryCommand.java:29`

```java
public NameHistoryCommand()
```

## meteordevelopment.meteorclient.commands.commands.NameHistoryCommand.build

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/commands/NameHistoryCommand.java:33`

```java
@Override public void build(LiteralArgumentBuilder<ClientSuggestionProvider> builder)
```

## meteordevelopment.meteorclient.commands.commands.NbtCommand

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/commands/NbtCommand.java:41`

```java
public class NbtCommand extends Command
```

## meteordevelopment.meteorclient.commands.commands.NbtCommand.NbtCommand

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/commands/NbtCommand.java:54`

```java
public NbtCommand()
```

## meteordevelopment.meteorclient.commands.commands.NbtCommand.build

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/commands/NbtCommand.java:58`

```java
@Override public void build(LiteralArgumentBuilder<ClientSuggestionProvider> builder)
```

## meteordevelopment.meteorclient.commands.commands.NotebotCommand

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/commands/NotebotCommand.java:38`

```java
public class NotebotCommand extends Command
```

## meteordevelopment.meteorclient.commands.commands.NotebotCommand.NotebotCommand

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/commands/NotebotCommand.java:45`

```java
public NotebotCommand()
```

## meteordevelopment.meteorclient.commands.commands.NotebotCommand.build

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/commands/NotebotCommand.java:49`

```java
@Override public void build(LiteralArgumentBuilder<ClientSuggestionProvider> builder)
```

## meteordevelopment.meteorclient.commands.commands.PeekCommand

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/commands/PeekCommand.java:17`

```java
public class PeekCommand extends Command
```

## meteordevelopment.meteorclient.commands.commands.PeekCommand.PeekCommand

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/commands/PeekCommand.java:21`

```java
public PeekCommand()
```

## meteordevelopment.meteorclient.commands.commands.PeekCommand.build

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/commands/PeekCommand.java:25`

```java
@Override public void build(LiteralArgumentBuilder<ClientSuggestionProvider> builder)
```

## meteordevelopment.meteorclient.commands.commands.ProfilesCommand

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/commands/ProfilesCommand.java:15`

```java
public class ProfilesCommand extends Command
```

## meteordevelopment.meteorclient.commands.commands.ProfilesCommand.ProfilesCommand

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/commands/ProfilesCommand.java:17`

```java
public ProfilesCommand()
```

## meteordevelopment.meteorclient.commands.commands.ProfilesCommand.build

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/commands/ProfilesCommand.java:21`

```java
@Override public void build(LiteralArgumentBuilder<ClientSuggestionProvider> builder)
```

## meteordevelopment.meteorclient.commands.commands.ReloadCommand

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/commands/ReloadCommand.java:18`

```java
public class ReloadCommand extends Command
```

## meteordevelopment.meteorclient.commands.commands.ReloadCommand.ReloadCommand

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/commands/ReloadCommand.java:19`

```java
public ReloadCommand()
```

## meteordevelopment.meteorclient.commands.commands.ReloadCommand.build

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/commands/ReloadCommand.java:23`

```java
@Override public void build(LiteralArgumentBuilder<ClientSuggestionProvider> builder)
```

## meteordevelopment.meteorclient.commands.commands.ResetCommand

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/commands/ResetCommand.java:19`

```java
public class ResetCommand extends Command
```

## meteordevelopment.meteorclient.commands.commands.ResetCommand.ResetCommand

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/commands/ResetCommand.java:21`

```java
public ResetCommand()
```

## meteordevelopment.meteorclient.commands.commands.ResetCommand.build

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/commands/ResetCommand.java:25`

```java
@Override public void build(LiteralArgumentBuilder<ClientSuggestionProvider> builder)
```

## meteordevelopment.meteorclient.commands.commands.RotationCommand

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/commands/RotationCommand.java:16`

```java
public class RotationCommand extends Command
```

## meteordevelopment.meteorclient.commands.commands.RotationCommand.RotationCommand

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/commands/RotationCommand.java:17`

```java
public RotationCommand()
```

## meteordevelopment.meteorclient.commands.commands.RotationCommand.build

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/commands/RotationCommand.java:21`

```java
@Override public void build(LiteralArgumentBuilder<ClientSuggestionProvider> builder)
```

## meteordevelopment.meteorclient.commands.commands.SaveMapCommand

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/commands/SaveMapCommand.java:31`

```java
public class SaveMapCommand extends Command
```

## meteordevelopment.meteorclient.commands.commands.SaveMapCommand.SaveMapCommand

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/commands/SaveMapCommand.java:35`

```java
public SaveMapCommand()
```

## meteordevelopment.meteorclient.commands.commands.SaveMapCommand.build

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/commands/SaveMapCommand.java:39`

```java
@Override public void build(LiteralArgumentBuilder<ClientSuggestionProvider> builder)
```

## meteordevelopment.meteorclient.commands.commands.SayCommand

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/commands/SayCommand.java:25`

```java
public class SayCommand extends Command
```

## meteordevelopment.meteorclient.commands.commands.SayCommand.SayCommand

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/commands/SayCommand.java:26`

```java
public SayCommand()
```

## meteordevelopment.meteorclient.commands.commands.SayCommand.build

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/commands/SayCommand.java:30`

```java
@Override public void build(LiteralArgumentBuilder<ClientSuggestionProvider> builder)
```

## meteordevelopment.meteorclient.commands.commands.ServerCommand

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/commands/ServerCommand.java:45`

```java
public class ServerCommand extends Command
```

## meteordevelopment.meteorclient.commands.commands.ServerCommand.ServerCommand

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/commands/ServerCommand.java:56`

```java
public ServerCommand()
```

## meteordevelopment.meteorclient.commands.commands.ServerCommand.build

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/commands/ServerCommand.java:62`

```java
@Override public void build(LiteralArgumentBuilder<ClientSuggestionProvider> builder)
```

## meteordevelopment.meteorclient.commands.commands.ServerCommand.formatPerms

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/commands/ServerCommand.java:163`

```java
public String formatPerms()
```

## meteordevelopment.meteorclient.commands.commands.SettingCommand

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/commands/SettingCommand.java:26`

```java
public class SettingCommand extends Command
```

## meteordevelopment.meteorclient.commands.commands.SettingCommand.SettingCommand

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/commands/SettingCommand.java:27`

```java
public SettingCommand()
```

## meteordevelopment.meteorclient.commands.commands.SettingCommand.build

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/commands/SettingCommand.java:31`

```java
@Override public void build(LiteralArgumentBuilder<ClientSuggestionProvider> builder)
```

## meteordevelopment.meteorclient.commands.commands.SpectateCommand

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/commands/SpectateCommand.java:19`

```java
public class SpectateCommand extends Command
```

## meteordevelopment.meteorclient.commands.commands.SpectateCommand.SpectateCommand

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/commands/SpectateCommand.java:23`

```java
public SpectateCommand()
```

## meteordevelopment.meteorclient.commands.commands.SpectateCommand.build

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/commands/SpectateCommand.java:27`

```java
@Override public void build(LiteralArgumentBuilder<ClientSuggestionProvider> builder)
```

## meteordevelopment.meteorclient.commands.commands.SwarmCommand

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/commands/SwarmCommand.java:40`

```java
public class SwarmCommand extends Command
```

## meteordevelopment.meteorclient.commands.commands.SwarmCommand.SwarmCommand

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/commands/SwarmCommand.java:45`

```java
public SwarmCommand()
```

## meteordevelopment.meteorclient.commands.commands.SwarmCommand.build

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/commands/SwarmCommand.java:49`

```java
@Override public void build(LiteralArgumentBuilder<ClientSuggestionProvider> builder)
```

## meteordevelopment.meteorclient.commands.commands.ToggleCommand

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/commands/ToggleCommand.java:16`

```java
public class ToggleCommand extends Command
```

## meteordevelopment.meteorclient.commands.commands.ToggleCommand.ToggleCommand

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/commands/ToggleCommand.java:17`

```java
public ToggleCommand()
```

## meteordevelopment.meteorclient.commands.commands.ToggleCommand.build

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/commands/ToggleCommand.java:21`

```java
@Override public void build(LiteralArgumentBuilder<ClientSuggestionProvider> builder)
```

## meteordevelopment.meteorclient.commands.commands.VClipCommand

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/commands/VClipCommand.java:15`

```java
public class VClipCommand extends Command
```

## meteordevelopment.meteorclient.commands.commands.VClipCommand.VClipCommand

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/commands/VClipCommand.java:16`

```java
public VClipCommand()
```

## meteordevelopment.meteorclient.commands.commands.VClipCommand.build

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/commands/VClipCommand.java:20`

```java
@Override public void build(LiteralArgumentBuilder<ClientSuggestionProvider> builder)
```

## meteordevelopment.meteorclient.commands.commands.WaspCommand

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/commands/WaspCommand.java:18`

```java
public class WaspCommand extends Command
```

## meteordevelopment.meteorclient.commands.commands.WaspCommand.WaspCommand

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/commands/WaspCommand.java:21`

```java
public WaspCommand()
```

## meteordevelopment.meteorclient.commands.commands.WaspCommand.build

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/commands/WaspCommand.java:25`

```java
@Override public void build(LiteralArgumentBuilder<ClientSuggestionProvider> builder)
```

## meteordevelopment.meteorclient.commands.commands.WaypointCommand

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/commands/WaypointCommand.java:21`

```java
public class WaypointCommand extends Command
```

## meteordevelopment.meteorclient.commands.commands.WaypointCommand.WaypointCommand

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/commands/WaypointCommand.java:22`

```java
public WaypointCommand()
```

## meteordevelopment.meteorclient.commands.commands.WaypointCommand.build

Nguồn: `upstream/reference-26.3/src/main/java/meteordevelopment/meteorclient/commands/commands/WaypointCommand.java:26`

```java
@Override public void build(LiteralArgumentBuilder<ClientSuggestionProvider> builder)
```
