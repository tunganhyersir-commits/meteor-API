# meteor-api/api

Khai báo Java có cú pháp public/protected. Không bao gồm API kế thừa/tổng hợp bởi compiler; xem kiểm tra bytecode riêng.

## dev.meteorapi.MeteorApi

Nguồn: `api/src/main/java/dev/meteorapi/MeteorApi.java:24`

```java
public final class MeteorApi
```

## dev.meteorapi.MeteorApi.ID

Nguồn: `api/src/main/java/dev/meteorapi/MeteorApi.java:25`

```java
public static final String ID = "meteor-api", VERSION = "0.1.2-beta"
```

## dev.meteorapi.MeteorApi.VERSION

Nguồn: `api/src/main/java/dev/meteorapi/MeteorApi.java:25`

```java
public static final String ID = "meteor-api", VERSION = "0.1.2-beta"
```

## dev.meteorapi.MeteorApi.LOG

Nguồn: `api/src/main/java/dev/meteorapi/MeteorApi.java:26`

```java
public static final Logger LOG = LoggerFactory.getLogger("Meteor API")
```

## dev.meteorapi.MeteorApi.KeyInputEvent

Nguồn: `api/src/main/java/dev/meteorapi/MeteorApi.java:28`

```java
public record KeyInputEvent(int key, int scancode, int modifiers, int action)
```

## dev.meteorapi.MeteorApi.TickEvent

Nguồn: `api/src/main/java/dev/meteorapi/MeteorApi.java:30`

```java
public record TickEvent(long tick)
```

## dev.meteorapi.MeteorApi.HudEvent

Nguồn: `api/src/main/java/dev/meteorapi/MeteorApi.java:32`

```java
public record HudEvent(net.minecraft.client.gui.DrawContext context, float tickDelta)
```

## dev.meteorapi.MeteorApi.HudEvent.canvas

Nguồn: `api/src/main/java/dev/meteorapi/MeteorApi.java:33`

```java
public dev.meteorapi.ui.Canvas canvas()
```

## dev.meteorapi.MeteorApi.OPEN_KEY

Nguồn: `api/src/main/java/dev/meteorapi/MeteorApi.java:48`

```java
public static final Setting<Long> OPEN_KEY = Settings.longValue(new NamespacedId(ID, "open-key"), 297, -1, 348).label("Phím mở menu")
```

## dev.meteorapi.MeteorApi.keys

Nguồn: `api/src/main/java/dev/meteorapi/MeteorApi.java:54`

```java
public static EventChannel<KeyInputEvent> keys()
```

## dev.meteorapi.MeteorApi.ticks

Nguồn: `api/src/main/java/dev/meteorapi/MeteorApi.java:58`

```java
public static EventChannel<TickEvent> ticks()
```

## dev.meteorapi.MeteorApi.hud

Nguồn: `api/src/main/java/dev/meteorapi/MeteorApi.java:62`

```java
public static EventChannel<HudEvent> hud()
```

## dev.meteorapi.MeteorApi.config

Nguồn: `api/src/main/java/dev/meteorapi/MeteorApi.java:66`

```java
public static ConfigStore config()
```

## dev.meteorapi.MeteorApi.services

Nguồn: `api/src/main/java/dev/meteorapi/MeteorApi.java:70`

```java
public static ServiceRegistry services()
```

## dev.meteorapi.MeteorApi.scheduler

Nguồn: `api/src/main/java/dev/meteorapi/MeteorApi.java:74`

```java
public static TickScheduler scheduler()
```

## dev.meteorapi.MeteorApi.hasMeteorClient

Nguồn: `api/src/main/java/dev/meteorapi/MeteorApi.java:82`

```java
public static boolean hasMeteorClient()
```

## dev.meteorapi.MeteorApi.requireClientThread

Nguồn: `api/src/main/java/dev/meteorapi/MeteorApi.java:86`

```java
public static void requireClientThread()
```

## dev.meteorapi.MeteorApi.execute

Nguồn: `api/src/main/java/dev/meteorapi/MeteorApi.java:91`

```java
public static CompletableFuture<Void> execute(Runnable action)
```

## dev.meteorapi.MeteorApi.onTick

Nguồn: `api/src/main/java/dev/meteorapi/MeteorApi.java:107`

```java
public static void onTick()
```

## dev.meteorapi.MeteorApi.screen

Nguồn: `api/src/main/java/dev/meteorapi/MeteorApi.java:113`

```java
public static Screen screen(Screen parent)
```

## dev.meteorapi.backport.DisplayItemUtils

Nguồn: `api/src/main/java/dev/meteorapi/backport/DisplayItemUtils.java:8`

```java
public final class DisplayItemUtils
```

## dev.meteorapi.backport.DisplayItemUtils.toStack

Nguồn: `api/src/main/java/dev/meteorapi/backport/DisplayItemUtils.java:10`

```java
public static ItemStack toStack(Item item)
```

## dev.meteorapi.backport.DisplayItemUtils.toStack

Nguồn: `api/src/main/java/dev/meteorapi/backport/DisplayItemUtils.java:11`

```java
public static ItemStack toStack(Block block)
```

## dev.meteorapi.backport.DisplayItemUtils.toStack

Nguồn: `api/src/main/java/dev/meteorapi/backport/DisplayItemUtils.java:12`

```java
public static ItemStack toStack(Item item, int count)
```

## dev.meteorapi.backport.EntityAgeTest

Nguồn: `api/src/main/java/dev/meteorapi/backport/EntityAgeTest.java:15`

```java
public enum EntityAgeTest implements Predicate<LivingEntity>
```

## dev.meteorapi.backport.EntityAgeTest.test

Nguồn: `api/src/main/java/dev/meteorapi/backport/EntityAgeTest.java:21`

```java
@Override public boolean test(LivingEntity livingEntity)
```

## dev.meteorapi.backport.EntityAgeTest.negate

Nguồn: `api/src/main/java/dev/meteorapi/backport/EntityAgeTest.java:30`

```java
@Override public Predicate<LivingEntity> negate()
```

## dev.meteorapi.backport.FluidOpacity

Nguồn: `api/src/main/java/dev/meteorapi/backport/FluidOpacity.java:4`

```java
public enum FluidOpacity
```

## dev.meteorapi.backport.FluidOpacity.water

Nguồn: `api/src/main/java/dev/meteorapi/backport/FluidOpacity.java:5`

```java
public boolean water()
```

## dev.meteorapi.backport.FluidOpacity.lava

Nguồn: `api/src/main/java/dev/meteorapi/backport/FluidOpacity.java:6`

```java
public boolean lava()
```

## dev.meteorapi.backport.Keybind

Nguồn: `api/src/main/java/dev/meteorapi/backport/Keybind.java:20`

```java
public class Keybind
```

## dev.meteorapi.backport.Keybind.Modifier

Nguồn: `api/src/main/java/dev/meteorapi/backport/Keybind.java:21`

```java
public enum Modifier
```

## dev.meteorapi.backport.Keybind.Modifier.mask

Nguồn: `api/src/main/java/dev/meteorapi/backport/Keybind.java:32`

```java
public final int mask
```

## dev.meteorapi.backport.Keybind.Modifier.isKeyPressed

Nguồn: `api/src/main/java/dev/meteorapi/backport/Keybind.java:38`

```java
public boolean isKeyPressed()
```

## dev.meteorapi.backport.Keybind.key

Nguồn: `api/src/main/java/dev/meteorapi/backport/Keybind.java:58`

```java
public InputUtil.Key key
```

## dev.meteorapi.backport.Keybind.none

Nguồn: `api/src/main/java/dev/meteorapi/backport/Keybind.java:66`

```java
public static Keybind none()
```

## dev.meteorapi.backport.Keybind.fromKey

Nguồn: `api/src/main/java/dev/meteorapi/backport/Keybind.java:70`

```java
public static Keybind fromKey(InputUtil.Key key)
```

## dev.meteorapi.backport.Keybind.fromKey

Nguồn: `api/src/main/java/dev/meteorapi/backport/Keybind.java:74`

```java
public static Keybind fromKey(int key)
```

## dev.meteorapi.backport.Keybind.fromKeys

Nguồn: `api/src/main/java/dev/meteorapi/backport/Keybind.java:78`

```java
public static Keybind fromKeys(InputUtil.Key key, Collection<Modifier> modifiers)
```

## dev.meteorapi.backport.Keybind.fromKeys

Nguồn: `api/src/main/java/dev/meteorapi/backport/Keybind.java:82`

```java
public static Keybind fromKeys(InputUtil.Key key, Modifier... modifiers)
```

## dev.meteorapi.backport.Keybind.fromKeys

Nguồn: `api/src/main/java/dev/meteorapi/backport/Keybind.java:86`

```java
public static Keybind fromKeys(int key, int modifiers)
```

## dev.meteorapi.backport.Keybind.fromButton

Nguồn: `api/src/main/java/dev/meteorapi/backport/Keybind.java:90`

```java
public static Keybind fromButton(int button)
```

## dev.meteorapi.backport.Keybind.isSet

Nguồn: `api/src/main/java/dev/meteorapi/backport/Keybind.java:94`

```java
public boolean isSet()
```

## dev.meteorapi.backport.Keybind.isKey

Nguồn: `api/src/main/java/dev/meteorapi/backport/Keybind.java:98`

```java
public boolean isKey()
```

## dev.meteorapi.backport.Keybind.hasMods

Nguồn: `api/src/main/java/dev/meteorapi/backport/Keybind.java:102`

```java
public boolean hasMods()
```

## dev.meteorapi.backport.Keybind.getValue

Nguồn: `api/src/main/java/dev/meteorapi/backport/Keybind.java:106`

```java
public int getValue()
```

## dev.meteorapi.backport.Keybind.set

Nguồn: `api/src/main/java/dev/meteorapi/backport/Keybind.java:110`

```java
public void set(InputUtil.Key key, Collection<Modifier> modifiers)
```

## dev.meteorapi.backport.Keybind.set

Nguồn: `api/src/main/java/dev/meteorapi/backport/Keybind.java:116`

```java
public void set(InputUtil.Key key, Modifier... modifiers)
```

## dev.meteorapi.backport.Keybind.set

Nguồn: `api/src/main/java/dev/meteorapi/backport/Keybind.java:120`

```java
public void set(boolean isKey, int value, int modifiers)
```

## dev.meteorapi.backport.Keybind.set

Nguồn: `api/src/main/java/dev/meteorapi/backport/Keybind.java:124`

```java
public Keybind set(Keybind value)
```

## dev.meteorapi.backport.Keybind.reset

Nguồn: `api/src/main/java/dev/meteorapi/backport/Keybind.java:130`

```java
public void reset()
```

## dev.meteorapi.backport.Keybind.canBindTo

Nguồn: `api/src/main/java/dev/meteorapi/backport/Keybind.java:134`

```java
public boolean canBindTo(InputUtil.Key key, Collection<Modifier> modifiers)
```

## dev.meteorapi.backport.Keybind.canBindTo

Nguồn: `api/src/main/java/dev/meteorapi/backport/Keybind.java:143`

```java
public boolean canBindTo(boolean isKey, int value, int modifiers)
```

## dev.meteorapi.backport.Keybind.matches

Nguồn: `api/src/main/java/dev/meteorapi/backport/Keybind.java:147`

```java
public boolean matches(InputUtil.Key key, Set<Modifier> modifiers)
```

## dev.meteorapi.backport.Keybind.matches

Nguồn: `api/src/main/java/dev/meteorapi/backport/Keybind.java:155`

```java
public boolean matches(boolean isKey, int value, int modifiers)
```

## dev.meteorapi.backport.Keybind.matches

Nguồn: `api/src/main/java/dev/meteorapi/backport/Keybind.java:159`

```java
public boolean matches(KeyInput input)
```

## dev.meteorapi.backport.Keybind.matches

Nguồn: `api/src/main/java/dev/meteorapi/backport/Keybind.java:163`

```java
public boolean matches(MouseInput input)
```

## dev.meteorapi.backport.Keybind.isPressed

Nguồn: `api/src/main/java/dev/meteorapi/backport/Keybind.java:167`

```java
public boolean isPressed()
```

## dev.meteorapi.backport.Keybind.copy

Nguồn: `api/src/main/java/dev/meteorapi/backport/Keybind.java:187`

```java
public Keybind copy()
```

## dev.meteorapi.backport.Keybind.toString

Nguồn: `api/src/main/java/dev/meteorapi/backport/Keybind.java:191`

```java
@Override public String toString()
```

## dev.meteorapi.backport.Keybind.equals

Nguồn: `api/src/main/java/dev/meteorapi/backport/Keybind.java:209`

```java
@Override public boolean equals(Object o)
```

## dev.meteorapi.backport.Keybind.hashCode

Nguồn: `api/src/main/java/dev/meteorapi/backport/Keybind.java:217`

```java
@Override public int hashCode()
```

## dev.meteorapi.backport.Keybind.toTag

Nguồn: `api/src/main/java/dev/meteorapi/backport/Keybind.java:224`

```java
public NbtCompound toTag()
```

## dev.meteorapi.backport.Keybind.fromTag

Nguồn: `api/src/main/java/dev/meteorapi/backport/Keybind.java:238`

```java
public Keybind fromTag(NbtCompound tag)
```

## dev.meteorapi.backport.ListMode

Nguồn: `api/src/main/java/dev/meteorapi/backport/ListMode.java:8`

```java
public enum ListMode
```

## dev.meteorapi.backport.ListMode.allows

Nguồn: `api/src/main/java/dev/meteorapi/backport/ListMode.java:12`

```java
public boolean allows(boolean contains)
```

## dev.meteorapi.backport.MeteorMcGuiRenderer

Nguồn: `api/src/main/java/dev/meteorapi/backport/MeteorMcGuiRenderer.java:14`

```java
public class MeteorMcGuiRenderer extends GuiRenderer
```

## dev.meteorapi.backport.MeteorMcGuiRenderer.MeteorMcGuiRenderer

Nguồn: `api/src/main/java/dev/meteorapi/backport/MeteorMcGuiRenderer.java:15`

```java
public MeteorMcGuiRenderer(GuiRenderState state, VertexConsumerProvider.Immediate vertices, OrderedRenderCommandQueue commands, RenderDispatcher dispatcher, List<SpecialGuiElementRenderer<?>> renderers)
```

## dev.meteorapi.backport.SwingMode

Nguồn: `api/src/main/java/dev/meteorapi/backport/SwingMode.java:8`

```java
public enum SwingMode
```

## dev.meteorapi.backport.SwingMode.of

Nguồn: `api/src/main/java/dev/meteorapi/backport/SwingMode.java:10`

```java
public static SwingMode of(boolean client)
```

## dev.meteorapi.backport.SwingMode.client

Nguồn: `api/src/main/java/dev/meteorapi/backport/SwingMode.java:11`

```java
public boolean client()
```

## dev.meteorapi.backport.SwingMode.attackSwing

Nguồn: `api/src/main/java/dev/meteorapi/backport/SwingMode.java:12`

```java
public void attackSwing(Hand hand)
```

## dev.meteorapi.backport.SwingMode.interactSwing

Nguồn: `api/src/main/java/dev/meteorapi/backport/SwingMode.java:19`

```java
public void interactSwing(Hand hand)
```

## dev.meteorapi.backport.Utils

Nguồn: `api/src/main/java/dev/meteorapi/backport/Utils.java:9`

```java
public final class Utils
```

## dev.meteorapi.backport.Utils.isFood

Nguồn: `api/src/main/java/dev/meteorapi/backport/Utils.java:11`

```java
public static boolean isFood(ItemStack item)
```

## dev.meteorapi.backport.Utils.isFood

Nguồn: `api/src/main/java/dev/meteorapi/backport/Utils.java:12`

```java
public static boolean isFood(Item item)
```

## dev.meteorapi.backport.Utils.vec3

Nguồn: `api/src/main/java/dev/meteorapi/backport/Utils.java:13`

```java
public static Vec3d vec3(BlockPos pos)
```

## dev.meteorapi.backport.Utils.contains

Nguồn: `api/src/main/java/dev/meteorapi/backport/Utils.java:14`

```java
public static <T> boolean contains(Iterable<T> colors, T value)
```

## dev.meteorapi.backport.Utils.fileNameFilter

Nguồn: `api/src/main/java/dev/meteorapi/backport/Utils.java:15`

```java
public static boolean fileNameFilter(String text, char c)
```

## dev.meteorapi.backport.Utils.modsMatch

Nguồn: `api/src/main/java/dev/meteorapi/backport/Utils.java:18`

```java
public static boolean modsMatch(int current, int... desired)
```

## dev.meteorapi.client.Client

Nguồn: `api/src/main/java/dev/meteorapi/client/Client.java:27`

```java
public final class Client implements AutoCloseable
```

## dev.meteorapi.client.Client.Category

Nguồn: `api/src/main/java/dev/meteorapi/client/Client.java:28`

```java
public record Category(NamespacedId id, String title)
```

## dev.meteorapi.client.Client.CommandContext

Nguồn: `api/src/main/java/dev/meteorapi/client/Client.java:30`

```java
public record CommandContext(Client client, List<String> arguments)
```

## dev.meteorapi.client.Client.CommandContext.reply

Nguồn: `api/src/main/java/dev/meteorapi/client/Client.java:31`

```java
public void reply(String message)
```

## dev.meteorapi.client.Client.owner

Nguồn: `api/src/main/java/dev/meteorapi/client/Client.java:105`

```java
public String owner()
```

## dev.meteorapi.client.Client.title

Nguồn: `api/src/main/java/dev/meteorapi/client/Client.java:109`

```java
public String title()
```

## dev.meteorapi.client.Client.started

Nguồn: `api/src/main/java/dev/meteorapi/client/Client.java:113`

```java
public boolean started()
```

## dev.meteorapi.client.Client.config

Nguồn: `api/src/main/java/dev/meteorapi/client/Client.java:117`

```java
public ConfigStore config()
```

## dev.meteorapi.client.Client.modules

Nguồn: `api/src/main/java/dev/meteorapi/client/Client.java:121`

```java
public List<ClientModule> modules()
```

## dev.meteorapi.client.Client.categories

Nguồn: `api/src/main/java/dev/meteorapi/client/Client.java:126`

```java
public List<Category> categories()
```

## dev.meteorapi.client.Client.findModule

Nguồn: `api/src/main/java/dev/meteorapi/client/Client.java:131`

```java
public Optional<ClientModule> findModule(String local)
```

## dev.meteorapi.client.Client.category

Nguồn: `api/src/main/java/dev/meteorapi/client/Client.java:136`

```java
public RegistrationResult<Category> category(String local, String title)
```

## dev.meteorapi.client.Client.module

Nguồn: `api/src/main/java/dev/meteorapi/client/Client.java:153`

```java
public <T extends ClientModule> RegistrationResult<T> module(T module)
```

## dev.meteorapi.client.Client.command

Nguồn: `api/src/main/java/dev/meteorapi/client/Client.java:179`

```java
public RegistrationResult<Registration> command( String name, String description, Consumer<CommandContext> action)
```

## dev.meteorapi.client.Client.hud

Nguồn: `api/src/main/java/dev/meteorapi/client/Client.java:199`

```java
public RegistrationResult<Registration> hud(String local, Consumer<MeteorApi.HudEvent> renderer)
```

## dev.meteorapi.client.Client.menu

Nguồn: `api/src/main/java/dev/meteorapi/client/Client.java:208`

```java
public RegistrationResult<Registration> menu( String local, String title, java.util.function.Function<Screen, Screen> factory)
```

## dev.meteorapi.client.Client.start

Nguồn: `api/src/main/java/dev/meteorapi/client/Client.java:218`

```java
public boolean start()
```

## dev.meteorapi.client.Client.save

Nguồn: `api/src/main/java/dev/meteorapi/client/Client.java:259`

```java
public void save() throws IOException
```

## dev.meteorapi.client.Client.load

Nguồn: `api/src/main/java/dev/meteorapi/client/Client.java:265`

```java
public void load() throws IOException
```

## dev.meteorapi.client.Client.execute

Nguồn: `api/src/main/java/dev/meteorapi/client/Client.java:283`

```java
public void execute(String input)
```

## dev.meteorapi.client.Client.reply

Nguồn: `api/src/main/java/dev/meteorapi/client/Client.java:301`

```java
public void reply(String message)
```

## dev.meteorapi.client.Client.screen

Nguồn: `api/src/main/java/dev/meteorapi/client/Client.java:308`

```java
public Screen screen(Screen parent)
```

## dev.meteorapi.client.Client.close

Nguồn: `api/src/main/java/dev/meteorapi/client/Client.java:350`

```java
@Override public void close()
```

## dev.meteorapi.client.ClientModule

Nguồn: `api/src/main/java/dev/meteorapi/client/ClientModule.java:13`

```java
public abstract class ClientModule extends FeatureLifecycle
```

## dev.meteorapi.client.ClientModule.runInMenus

Nguồn: `api/src/main/java/dev/meteorapi/client/ClientModule.java:21`

```java
protected boolean runInMenus
```

## dev.meteorapi.client.ClientModule.ClientModule

Nguồn: `api/src/main/java/dev/meteorapi/client/ClientModule.java:25`

```java
protected ClientModule(NamespacedId id, NamespacedId category, String title, String description)
```

## dev.meteorapi.client.ClientModule.category

Nguồn: `api/src/main/java/dev/meteorapi/client/ClientModule.java:37`

```java
public final NamespacedId category()
```

## dev.meteorapi.client.ClientModule.title

Nguồn: `api/src/main/java/dev/meteorapi/client/ClientModule.java:41`

```java
public final String title()
```

## dev.meteorapi.client.ClientModule.description

Nguồn: `api/src/main/java/dev/meteorapi/client/ClientModule.java:45`

```java
public final String description()
```

## dev.meteorapi.client.ClientModule.optionId

Nguồn: `api/src/main/java/dev/meteorapi/client/ClientModule.java:49`

```java
public final NamespacedId optionId(String local)
```

## dev.meteorapi.client.ClientModule.setting

Nguồn: `api/src/main/java/dev/meteorapi/client/ClientModule.java:53`

```java
protected final <T> Setting<T> setting(Setting<T> setting)
```

## dev.meteorapi.client.ClientModule.settings

Nguồn: `api/src/main/java/dev/meteorapi/client/ClientModule.java:64`

```java
public final List<Setting<?>> settings()
```

## dev.meteorapi.client.ClientModule.bind

Nguồn: `api/src/main/java/dev/meteorapi/client/ClientModule.java:68`

```java
public final void bind(int key, int modifiers)
```

## dev.meteorapi.client.ClientModule.onEnable

Nguồn: `api/src/main/java/dev/meteorapi/client/ClientModule.java:89`

```java
@Override protected final void onEnable(ResourceScope scope)
```

## dev.meteorapi.client.ClientModule.onDisable

Nguồn: `api/src/main/java/dev/meteorapi/client/ClientModule.java:111`

```java
@Override protected final void onDisable()
```

## dev.meteorapi.client.ClientModule.running

Nguồn: `api/src/main/java/dev/meteorapi/client/ClientModule.java:116`

```java
public final boolean running()
```

## dev.meteorapi.client.ClientModule.onStart

Nguồn: `api/src/main/java/dev/meteorapi/client/ClientModule.java:163`

```java
protected void onStart(ResourceScope scope)
```

## dev.meteorapi.client.ClientModule.onStop

Nguồn: `api/src/main/java/dev/meteorapi/client/ClientModule.java:165`

```java
protected void onStop()
```

## dev.meteorapi.client.ClientModule.onTick

Nguồn: `api/src/main/java/dev/meteorapi/client/ClientModule.java:167`

```java
protected void onTick()
```

## dev.meteorapi.client.Clients

Nguồn: `api/src/main/java/dev/meteorapi/client/Clients.java:14`

```java
public final class Clients
```

## dev.meteorapi.client.Clients.create

Nguồn: `api/src/main/java/dev/meteorapi/client/Clients.java:19`

```java
public static RegistrationResult<Client> create(String owner, String title)
```

## dev.meteorapi.client.Clients.all

Nguồn: `api/src/main/java/dev/meteorapi/client/Clients.java:41`

```java
public static List<Client> all()
```

## dev.meteorapi.client.Clients.dispatchChat

Nguồn: `api/src/main/java/dev/meteorapi/client/Clients.java:50`

```java
public static boolean dispatchChat(String message)
```

## dev.meteorapi.compat.Integrations

Nguồn: `api/src/main/java/dev/meteorapi/compat/Integrations.java:10`

```java
public final class Integrations
```

## dev.meteorapi.compat.Integrations.version

Nguồn: `api/src/main/java/dev/meteorapi/compat/Integrations.java:12`

```java
public static Optional<String> version(String modId)
```

## dev.meteorapi.compat.Integrations.installed

Nguồn: `api/src/main/java/dev/meteorapi/compat/Integrations.java:15`

```java
public static Map<String, String> installed()
```

## dev.meteorapi.compat.Integrations.packetFixerLimits

Nguồn: `api/src/main/java/dev/meteorapi/compat/Integrations.java:22`

```java
public static Map<String, String> packetFixerLimits()
```

## dev.meteorapi.compat.Integrations.commonNetworkHandler

Nguồn: `api/src/main/java/dev/meteorapi/compat/Integrations.java:38`

```java
public static Optional<Object> commonNetworkHandler()
```

## dev.meteorapi.compat.MeteorBridgeAddon

Nguồn: `api/src/main/java/dev/meteorapi/compat/MeteorBridgeAddon.java:14`

```java
public final class MeteorBridgeAddon extends MeteorAddon
```

## dev.meteorapi.compat.MeteorBridgeAddon.onInitialize

Nguồn: `api/src/main/java/dev/meteorapi/compat/MeteorBridgeAddon.java:16`

```java
@Override public void onInitialize()
```

## dev.meteorapi.compat.MeteorBridgeAddon.getPackage

Nguồn: `api/src/main/java/dev/meteorapi/compat/MeteorBridgeAddon.java:48`

```java
@Override public String getPackage()
```

## dev.meteorapi.compat.ModMenuIntegration

Nguồn: `api/src/main/java/dev/meteorapi/compat/ModMenuIntegration.java:7`

```java
public final class ModMenuIntegration implements ModMenuApi
```

## dev.meteorapi.compat.ModMenuIntegration.getModConfigScreenFactory

Nguồn: `api/src/main/java/dev/meteorapi/compat/ModMenuIntegration.java:8`

```java
@Override public ConfigScreenFactory<?> getModConfigScreenFactory()
```

## dev.meteorapi.compat.client.AddonRegistry

Nguồn: `api/src/main/java/dev/meteorapi/compat/client/AddonRegistry.java:16`

```java
public final class AddonRegistry
```

## dev.meteorapi.compat.client.AddonRegistry.AddonRegistry

Nguồn: `api/src/main/java/dev/meteorapi/compat/client/AddonRegistry.java:19`

```java
public AddonRegistry(String namespace)
```

## dev.meteorapi.compat.client.AddonRegistry.name

Nguồn: `api/src/main/java/dev/meteorapi/compat/client/AddonRegistry.java:24`

```java
public String name(String localName)
```

## dev.meteorapi.compat.client.AddonRegistry.module

Nguồn: `api/src/main/java/dev/meteorapi/compat/client/AddonRegistry.java:26`

```java
public <T extends Module> RegistrationResult<T> module(String localName, Function<String, T> factory)
```

## dev.meteorapi.compat.client.AddonRegistry.command

Nguồn: `api/src/main/java/dev/meteorapi/compat/client/AddonRegistry.java:37`

```java
public <T extends Command> RegistrationResult<T> command(String localName, Function<String, T> factory)
```

## dev.meteorapi.compat.client.AddonRegistry.hud

Nguồn: `api/src/main/java/dev/meteorapi/compat/client/AddonRegistry.java:48`

```java
public <T extends HudElementInfo<?>> RegistrationResult<T> hud(String localName, Function<String, T> factory)
```

## dev.meteorapi.compat.client.AddonRegistry.category

Nguồn: `api/src/main/java/dev/meteorapi/compat/client/AddonRegistry.java:58`

```java
public RegistrationResult<Category> category(String localName)
```

## dev.meteorapi.compat.client.Diagnostics

Nguồn: `api/src/main/java/dev/meteorapi/compat/client/Diagnostics.java:10`

```java
public final class Diagnostics
```

## dev.meteorapi.compat.client.Diagnostics.snapshot

Nguồn: `api/src/main/java/dev/meteorapi/compat/client/Diagnostics.java:13`

```java
public static Map<String, String> snapshot()
```

## dev.meteorapi.compat.client.ManagedModule

Nguồn: `api/src/main/java/dev/meteorapi/compat/client/ManagedModule.java:9`

```java
public abstract class ManagedModule extends Module
```

## dev.meteorapi.compat.client.ManagedModule.ManagedModule

Nguồn: `api/src/main/java/dev/meteorapi/compat/client/ManagedModule.java:12`

```java
protected ManagedModule(Category category, String name, String description)
```

## dev.meteorapi.compat.client.ManagedModule.onActivate

Nguồn: `api/src/main/java/dev/meteorapi/compat/client/ManagedModule.java:16`

```java
@Override public final void onActivate()
```

## dev.meteorapi.compat.client.ManagedModule.onDeactivate

Nguồn: `api/src/main/java/dev/meteorapi/compat/client/ManagedModule.java:29`

```java
@Override public final void onDeactivate()
```

## dev.meteorapi.compat.client.ManagedModule.onStart

Nguồn: `api/src/main/java/dev/meteorapi/compat/client/ManagedModule.java:47`

```java
protected abstract void onStart(ResourceScope resources)
```

## dev.meteorapi.compat.client.ManagedModule.onStop

Nguồn: `api/src/main/java/dev/meteorapi/compat/client/ManagedModule.java:48`

```java
protected void onStop()
```

## dev.meteorapi.compat.client.MeteorClientApi

Nguồn: `api/src/main/java/dev/meteorapi/compat/client/MeteorClientApi.java:23`

```java
public final class MeteorClientApi
```

## dev.meteorapi.compat.client.MeteorClientApi.VERSION

Nguồn: `api/src/main/java/dev/meteorapi/compat/client/MeteorClientApi.java:24`

```java
public static final String VERSION = "0.1.2-beta"
```

## dev.meteorapi.compat.client.MeteorClientApi.MINECRAFT

Nguồn: `api/src/main/java/dev/meteorapi/compat/client/MeteorClientApi.java:25`

```java
public static final String MINECRAFT = "1.21.11"
```

## dev.meteorapi.compat.client.MeteorClientApi.MIN_LOADER

Nguồn: `api/src/main/java/dev/meteorapi/compat/client/MeteorClientApi.java:26`

```java
public static final String MIN_LOADER = "0.19.5"
```

## dev.meteorapi.compat.client.MeteorClientApi.UPSTREAM_COMMIT

Nguồn: `api/src/main/java/dev/meteorapi/compat/client/MeteorClientApi.java:27`

```java
public static final String UPSTREAM_COMMIT = "48030717dc0d4898a195a713fb048bf597fc5b54"
```

## dev.meteorapi.compat.client.MeteorClientApi.isAvailable

Nguồn: `api/src/main/java/dev/meteorapi/compat/client/MeteorClientApi.java:29`

```java
public static boolean isAvailable()
```

## dev.meteorapi.compat.client.MeteorClientApi.isReady

Nguồn: `api/src/main/java/dev/meteorapi/compat/client/MeteorClientApi.java:36`

```java
public static boolean isReady()
```

## dev.meteorapi.compat.client.MeteorClientApi.shouldHideHud

Nguồn: `api/src/main/java/dev/meteorapi/compat/client/MeteorClientApi.java:40`

```java
public static boolean shouldHideHud()
```

## dev.meteorapi.compat.client.MeteorClientApi.requireClientThread

Nguồn: `api/src/main/java/dev/meteorapi/compat/client/MeteorClientApi.java:60`

```java
public static void requireClientThread()
```

## dev.meteorapi.compat.client.MeteorClientApi.client

Nguồn: `api/src/main/java/dev/meteorapi/compat/client/MeteorClientApi.java:65`

```java
public static MinecraftClient client()
```

## dev.meteorapi.compat.client.MeteorClientApi.events

Nguồn: `api/src/main/java/dev/meteorapi/compat/client/MeteorClientApi.java:70`

```java
public static IEventBus events()
```

## dev.meteorapi.compat.client.MeteorClientApi.modules

Nguồn: `api/src/main/java/dev/meteorapi/compat/client/MeteorClientApi.java:75`

```java
public static Modules modules()
```

## dev.meteorapi.compat.client.MeteorClientApi.hud

Nguồn: `api/src/main/java/dev/meteorapi/compat/client/MeteorClientApi.java:79`

```java
public static Hud hud()
```

## dev.meteorapi.compat.client.MeteorClientApi.system

Nguồn: `api/src/main/java/dev/meteorapi/compat/client/MeteorClientApi.java:83`

```java
public static <T extends System<?>> T system(Class<T> type)
```

## dev.meteorapi.compat.client.MeteorClientApi.theme

Nguồn: `api/src/main/java/dev/meteorapi/compat/client/MeteorClientApi.java:93`

```java
public static GuiTheme theme()
```

## dev.meteorapi.compat.client.MeteorClientApi.commands

Nguồn: `api/src/main/java/dev/meteorapi/compat/client/MeteorClientApi.java:98`

```java
public static List<Command> commands()
```

## dev.meteorapi.compat.client.MeteorClientApi.services

Nguồn: `api/src/main/java/dev/meteorapi/compat/client/MeteorClientApi.java:103`

```java
public static ServiceRegistry services()
```

## dev.meteorapi.compat.client.MeteorClientApi.scheduler

Nguồn: `api/src/main/java/dev/meteorapi/compat/client/MeteorClientApi.java:108`

```java
public static TickScheduler scheduler()
```

## dev.meteorapi.compat.client.MeteorClientApi.listen

Nguồn: `api/src/main/java/dev/meteorapi/compat/client/MeteorClientApi.java:114`

```java
public static Registration listen(Object listener)
```

## dev.meteorapi.compat.client.MeteorClientApi.requireWorld

Nguồn: `api/src/main/java/dev/meteorapi/compat/client/MeteorClientApi.java:131`

```java
public static void requireWorld()
```

## dev.meteorapi.compat.client.MeteorClientApi.execute

Nguồn: `api/src/main/java/dev/meteorapi/compat/client/MeteorClientApi.java:138`

```java
public static CompletableFuture<Void> execute(Runnable action)
```

## dev.meteorapi.compat.client.Registry

Nguồn: `api/src/main/java/dev/meteorapi/compat/client/Registry.java:14`

```java
public final class Registry
```

## dev.meteorapi.compat.client.Registry.category

Nguồn: `api/src/main/java/dev/meteorapi/compat/client/Registry.java:18`

```java
public static void category(Category category)
```

## dev.meteorapi.compat.client.Registry.module

Nguồn: `api/src/main/java/dev/meteorapi/compat/client/Registry.java:30`

```java
public static <T extends Module> T module(T module)
```

## dev.meteorapi.compat.client.Registry.command

Nguồn: `api/src/main/java/dev/meteorapi/compat/client/Registry.java:48`

```java
public static <T extends Command> T command(T command)
```

## dev.meteorapi.compat.client.Registry.hud

Nguồn: `api/src/main/java/dev/meteorapi/compat/client/Registry.java:66`

```java
public static <T extends HudElementInfo<?>> T hud(T info)
```

## dev.meteorapi.compat26.events.KeyInputEvent

Nguồn: `api/src/main/java/dev/meteorapi/compat26/events/KeyInputEvent.java:11`

```java
public class KeyInputEvent extends Cancellable
```

## dev.meteorapi.compat26.events.KeyInputEvent.input

Nguồn: `api/src/main/java/dev/meteorapi/compat26/events/KeyInputEvent.java:14`

```java
public net.minecraft.client.input.KeyInput input
```

## dev.meteorapi.compat26.events.KeyInputEvent.action

Nguồn: `api/src/main/java/dev/meteorapi/compat26/events/KeyInputEvent.java:15`

```java
public KeyAction action
```

## dev.meteorapi.compat26.events.KeyInputEvent.get

Nguồn: `api/src/main/java/dev/meteorapi/compat26/events/KeyInputEvent.java:17`

```java
public static KeyInputEvent get(net.minecraft.client.input.KeyInput input, KeyAction action)
```

## dev.meteorapi.compat26.events.KeyInputEvent.key

Nguồn: `api/src/main/java/dev/meteorapi/compat26/events/KeyInputEvent.java:24`

```java
public int key()
```

## dev.meteorapi.compat26.events.KeyInputEvent.modifiers

Nguồn: `api/src/main/java/dev/meteorapi/compat26/events/KeyInputEvent.java:28`

```java
public int modifiers()
```

## dev.meteorapi.compat26.gui.PacketBoolSettingScreen

Nguồn: `api/src/main/java/dev/meteorapi/compat26/gui/PacketBoolSettingScreen.java:21`

```java
public class PacketBoolSettingScreen extends CollectionListSettingScreen<PacketType<?>>
```

## dev.meteorapi.compat26.gui.PacketBoolSettingScreen.PacketBoolSettingScreen

Nguồn: `api/src/main/java/dev/meteorapi/compat26/gui/PacketBoolSettingScreen.java:22`

```java
public PacketBoolSettingScreen(GuiTheme theme, Setting<Set<PacketType<?>>> setting)
```

## dev.meteorapi.compat26.gui.PacketBoolSettingScreen.includeValue

Nguồn: `api/src/main/java/dev/meteorapi/compat26/gui/PacketBoolSettingScreen.java:26`

```java
@Override protected boolean includeValue(PacketType<?> value)
```

## dev.meteorapi.compat26.gui.PacketBoolSettingScreen.getValueWidget

Nguồn: `api/src/main/java/dev/meteorapi/compat26/gui/PacketBoolSettingScreen.java:34`

```java
@Override protected WWidget getValueWidget(PacketType<?> value)
```

## dev.meteorapi.compat26.gui.PacketBoolSettingScreen.getValueNames

Nguồn: `api/src/main/java/dev/meteorapi/compat26/gui/PacketBoolSettingScreen.java:39`

```java
@Override protected String[] getValueNames(PacketType<?> value)
```

## dev.meteorapi.compat26.gui.RenderApi

Nguồn: `api/src/main/java/dev/meteorapi/compat26/gui/RenderApi.java:6`

```java
public final class RenderApi
```

## dev.meteorapi.compat26.gui.RenderApi.fill

Nguồn: `api/src/main/java/dev/meteorapi/compat26/gui/RenderApi.java:8`

```java
public static void fill(DrawContext graphics, WWidget widget, Color color)
```

## dev.meteorapi.compat26.gui.ThemeApi

Nguồn: `api/src/main/java/dev/meteorapi/compat26/gui/ThemeApi.java:5`

```java
public final class ThemeApi
```

## dev.meteorapi.compat26.gui.ThemeApi.longEdit

Nguồn: `api/src/main/java/dev/meteorapi/compat26/gui/ThemeApi.java:7`

```java
public static WLongEdit longEdit(GuiTheme theme, long value, long min, long max)
```

## dev.meteorapi.compat26.gui.WLongEdit

Nguồn: `api/src/main/java/dev/meteorapi/compat26/gui/WLongEdit.java:12`

```java
public class WLongEdit extends WHorizontalList
```

## dev.meteorapi.compat26.gui.WLongEdit.min

Nguồn: `api/src/main/java/dev/meteorapi/compat26/gui/WLongEdit.java:15`

```java
public final long min, max
```

## dev.meteorapi.compat26.gui.WLongEdit.max

Nguồn: `api/src/main/java/dev/meteorapi/compat26/gui/WLongEdit.java:15`

```java
public final long min, max
```

## dev.meteorapi.compat26.gui.WLongEdit.action

Nguồn: `api/src/main/java/dev/meteorapi/compat26/gui/WLongEdit.java:17`

```java
public Runnable action
```

## dev.meteorapi.compat26.gui.WLongEdit.actionOnRelease

Nguồn: `api/src/main/java/dev/meteorapi/compat26/gui/WLongEdit.java:18`

```java
public Runnable actionOnRelease
```

## dev.meteorapi.compat26.gui.WLongEdit.WLongEdit

Nguồn: `api/src/main/java/dev/meteorapi/compat26/gui/WLongEdit.java:22`

```java
public WLongEdit(long value, long min, long max)
```

## dev.meteorapi.compat26.gui.WLongEdit.init

Nguồn: `api/src/main/java/dev/meteorapi/compat26/gui/WLongEdit.java:28`

```java
@Override public void init()
```

## dev.meteorapi.compat26.gui.WLongEdit.get

Nguồn: `api/src/main/java/dev/meteorapi/compat26/gui/WLongEdit.java:61`

```java
public long get()
```

## dev.meteorapi.compat26.gui.WLongEdit.set

Nguồn: `api/src/main/java/dev/meteorapi/compat26/gui/WLongEdit.java:65`

```java
public void set(long value)
```

## dev.meteorapi.compat26.modules.WeatherChanger

Nguồn: `api/src/main/java/dev/meteorapi/compat26/modules/WeatherChanger.java:18`

```java
public class WeatherChanger extends Module
```

## dev.meteorapi.compat26.modules.WeatherChanger.WeatherChanger

Nguồn: `api/src/main/java/dev/meteorapi/compat26/modules/WeatherChanger.java:40`

```java
public WeatherChanger()
```

## dev.meteorapi.compat26.modules.WeatherChanger.onActivate

Nguồn: `api/src/main/java/dev/meteorapi/compat26/modules/WeatherChanger.java:44`

```java
@Override public void onActivate()
```

## dev.meteorapi.compat26.modules.WeatherChanger.onDeactivate

Nguồn: `api/src/main/java/dev/meteorapi/compat26/modules/WeatherChanger.java:52`

```java
@Override public void onDeactivate()
```

## dev.meteorapi.compat26.render.IVertexConsumerProvider

Nguồn: `api/src/main/java/dev/meteorapi/compat26/render/IVertexConsumerProvider.java:4`

```java
public interface IVertexConsumerProvider extends meteordevelopment.meteorclient.utils.render.IVertexConsumerProvider
```

## dev.meteorapi.compat26.render.OutlineRenderCommandQueue

Nguồn: `api/src/main/java/dev/meteorapi/compat26/render/OutlineRenderCommandQueue.java:5`

```java
public class OutlineRenderCommandQueue extends meteordevelopment.meteorclient.utils.OutlineRenderCommandQueue
```

## dev.meteorapi.compat26.render.OutlineRenderCommandQueue.order

Nguồn: `api/src/main/java/dev/meteorapi/compat26/render/OutlineRenderCommandQueue.java:6`

```java
public BatchingRenderCommandQueue order(int order)
```

## dev.meteorapi.compat26.render.VertexConsumerAdapter

Nguồn: `api/src/main/java/dev/meteorapi/compat26/render/VertexConsumerAdapter.java:6`

```java
public class VertexConsumerAdapter extends MeshBuilderVertexConsumerProvider.MeshBuilderVertexConsumer
```

## dev.meteorapi.compat26.render.VertexConsumerAdapter.VertexConsumerAdapter

Nguồn: `api/src/main/java/dev/meteorapi/compat26/render/VertexConsumerAdapter.java:7`

```java
public VertexConsumerAdapter(MeshBuilder mesh)
```

## dev.meteorapi.compat26.render.VertexConsumerAdapter.addVertex

Nguồn: `api/src/main/java/dev/meteorapi/compat26/render/VertexConsumerAdapter.java:8`

```java
public VertexConsumerAdapter addVertex(float x, float y, float z)
```

## dev.meteorapi.compat26.render.VertexConsumerAdapter.setColor

Nguồn: `api/src/main/java/dev/meteorapi/compat26/render/VertexConsumerAdapter.java:9`

```java
public VertexConsumerAdapter setColor(int r, int g, int b, int a)
```

## dev.meteorapi.compat26.render.VertexConsumerAdapter.setColor

Nguồn: `api/src/main/java/dev/meteorapi/compat26/render/VertexConsumerAdapter.java:10`

```java
public VertexConsumerAdapter setColor(int color)
```

## dev.meteorapi.compat26.render.VertexConsumerAdapter.setUv

Nguồn: `api/src/main/java/dev/meteorapi/compat26/render/VertexConsumerAdapter.java:11`

```java
public VertexConsumerAdapter setUv(float u, float v)
```

## dev.meteorapi.compat26.render.VertexConsumerAdapter.setUv1

Nguồn: `api/src/main/java/dev/meteorapi/compat26/render/VertexConsumerAdapter.java:12`

```java
public VertexConsumerAdapter setUv1(int u, int v)
```

## dev.meteorapi.compat26.render.VertexConsumerAdapter.setUv2

Nguồn: `api/src/main/java/dev/meteorapi/compat26/render/VertexConsumerAdapter.java:13`

```java
public VertexConsumerAdapter setUv2(int u, int v)
```

## dev.meteorapi.compat26.render.VertexConsumerAdapter.setUv3

Nguồn: `api/src/main/java/dev/meteorapi/compat26/render/VertexConsumerAdapter.java:15`

```java
public VertexConsumerAdapter setUv3(float u, float v)
```

## dev.meteorapi.compat26.render.VertexConsumerAdapter.setNormal

Nguồn: `api/src/main/java/dev/meteorapi/compat26/render/VertexConsumerAdapter.java:16`

```java
public VertexConsumerAdapter setNormal(float x, float y, float z)
```

## dev.meteorapi.compat26.render.VertexConsumerAdapter.setLineWidth

Nguồn: `api/src/main/java/dev/meteorapi/compat26/render/VertexConsumerAdapter.java:17`

```java
public VertexConsumerAdapter setLineWidth(float width)
```

## dev.meteorapi.compat26.settings.FileSetting

Nguồn: `api/src/main/java/dev/meteorapi/compat26/settings/FileSetting.java:15`

```java
public class FileSetting extends Setting<File>
```

## dev.meteorapi.compat26.settings.FileSetting.filter

Nguồn: `api/src/main/java/dev/meteorapi/compat26/settings/FileSetting.java:17`

```java
public final String filter
```

## dev.meteorapi.compat26.settings.FileSetting.FileSetting

Nguồn: `api/src/main/java/dev/meteorapi/compat26/settings/FileSetting.java:19`

```java
public FileSetting(String name, String description, File defaultValue, Consumer<File> onChanged, Consumer<Setting<File>> onModuleActivated, IVisible visible, String filter)
```

## dev.meteorapi.compat26.settings.FileSetting.parseImpl

Nguồn: `api/src/main/java/dev/meteorapi/compat26/settings/FileSetting.java:25`

```java
@Override protected File parseImpl(String str)
```

## dev.meteorapi.compat26.settings.FileSetting.isValueValid

Nguồn: `api/src/main/java/dev/meteorapi/compat26/settings/FileSetting.java:31`

```java
@Override protected boolean isValueValid(File value)
```

## dev.meteorapi.compat26.settings.FileSetting.save

Nguồn: `api/src/main/java/dev/meteorapi/compat26/settings/FileSetting.java:36`

```java
@Override protected NbtCompound save(NbtCompound tag)
```

## dev.meteorapi.compat26.settings.FileSetting.load

Nguồn: `api/src/main/java/dev/meteorapi/compat26/settings/FileSetting.java:45`

```java
@Override protected File load(NbtCompound tag)
```

## dev.meteorapi.compat26.settings.FileSetting.Builder

Nguồn: `api/src/main/java/dev/meteorapi/compat26/settings/FileSetting.java:54`

```java
public static class Builder extends SettingBuilder<FileSetting.Builder, File, FileSetting>
```

## dev.meteorapi.compat26.settings.FileSetting.Builder.Builder

Nguồn: `api/src/main/java/dev/meteorapi/compat26/settings/FileSetting.java:57`

```java
public Builder()
```

## dev.meteorapi.compat26.settings.FileSetting.Builder.filter

Nguồn: `api/src/main/java/dev/meteorapi/compat26/settings/FileSetting.java:61`

```java
public FileSetting.Builder filter(String filter)
```

## dev.meteorapi.compat26.settings.FileSetting.Builder.build

Nguồn: `api/src/main/java/dev/meteorapi/compat26/settings/FileSetting.java:66`

```java
@Override public FileSetting build()
```

## dev.meteorapi.compat26.settings.LongSetting

Nguồn: `api/src/main/java/dev/meteorapi/compat26/settings/LongSetting.java:14`

```java
public class LongSetting extends Setting<Long>
```

## dev.meteorapi.compat26.settings.LongSetting.min

Nguồn: `api/src/main/java/dev/meteorapi/compat26/settings/LongSetting.java:15`

```java
public final long min, max
```

## dev.meteorapi.compat26.settings.LongSetting.max

Nguồn: `api/src/main/java/dev/meteorapi/compat26/settings/LongSetting.java:15`

```java
public final long min, max
```

## dev.meteorapi.compat26.settings.LongSetting.parseImpl

Nguồn: `api/src/main/java/dev/meteorapi/compat26/settings/LongSetting.java:24`

```java
@Override protected Long parseImpl(String str)
```

## dev.meteorapi.compat26.settings.LongSetting.isValueValid

Nguồn: `api/src/main/java/dev/meteorapi/compat26/settings/LongSetting.java:33`

```java
@Override protected boolean isValueValid(Long value)
```

## dev.meteorapi.compat26.settings.LongSetting.save

Nguồn: `api/src/main/java/dev/meteorapi/compat26/settings/LongSetting.java:38`

```java
@Override public NbtCompound save(NbtCompound tag)
```

## dev.meteorapi.compat26.settings.LongSetting.load

Nguồn: `api/src/main/java/dev/meteorapi/compat26/settings/LongSetting.java:45`

```java
@Override public Long load(NbtCompound tag)
```

## dev.meteorapi.compat26.settings.LongSetting.Builder

Nguồn: `api/src/main/java/dev/meteorapi/compat26/settings/LongSetting.java:52`

```java
public static class Builder extends SettingBuilder<Builder, Long, LongSetting>
```

## dev.meteorapi.compat26.settings.LongSetting.Builder.Builder

Nguồn: `api/src/main/java/dev/meteorapi/compat26/settings/LongSetting.java:55`

```java
public Builder()
```

## dev.meteorapi.compat26.settings.LongSetting.Builder.min

Nguồn: `api/src/main/java/dev/meteorapi/compat26/settings/LongSetting.java:59`

```java
public Builder min(long min)
```

## dev.meteorapi.compat26.settings.LongSetting.Builder.max

Nguồn: `api/src/main/java/dev/meteorapi/compat26/settings/LongSetting.java:64`

```java
public Builder max(long max)
```

## dev.meteorapi.compat26.settings.LongSetting.Builder.range

Nguồn: `api/src/main/java/dev/meteorapi/compat26/settings/LongSetting.java:69`

```java
public Builder range(long min, long max)
```

## dev.meteorapi.compat26.settings.LongSetting.Builder.build

Nguồn: `api/src/main/java/dev/meteorapi/compat26/settings/LongSetting.java:75`

```java
@Override public LongSetting build()
```

## dev.meteorapi.compat26.settings.PacketListSetting

Nguồn: `api/src/main/java/dev/meteorapi/compat26/settings/PacketListSetting.java:24`

```java
public class PacketListSetting extends Setting<Set<PacketType<?>>>
```

## dev.meteorapi.compat26.settings.PacketListSetting.filter

Nguồn: `api/src/main/java/dev/meteorapi/compat26/settings/PacketListSetting.java:25`

```java
public final Predicate<PacketType<?>> filter
```

## dev.meteorapi.compat26.settings.PacketListSetting.PacketListSetting

Nguồn: `api/src/main/java/dev/meteorapi/compat26/settings/PacketListSetting.java:27`

```java
public PacketListSetting(String name, String description, Set<PacketType<?>> defaultValue, Consumer<Set<PacketType<?>>> onChanged, Consumer<Setting<Set<PacketType<?>>>> onModuleActivated, Predicate<PacketType<?>> filter, IVisible visible)
```

## dev.meteorapi.compat26.settings.PacketListSetting.resetImpl

Nguồn: `api/src/main/java/dev/meteorapi/compat26/settings/PacketListSetting.java:33`

```java
@Override public void resetImpl()
```

## dev.meteorapi.compat26.settings.PacketListSetting.parseImpl

Nguồn: `api/src/main/java/dev/meteorapi/compat26/settings/PacketListSetting.java:38`

```java
@Override protected Set<PacketType<?>> parseImpl(String str)
```

## dev.meteorapi.compat26.settings.PacketListSetting.isValueValid

Nguồn: `api/src/main/java/dev/meteorapi/compat26/settings/PacketListSetting.java:54`

```java
@Override protected boolean isValueValid(Set<PacketType<?>> value)
```

## dev.meteorapi.compat26.settings.PacketListSetting.getSuggestions

Nguồn: `api/src/main/java/dev/meteorapi/compat26/settings/PacketListSetting.java:59`

```java
@Override public java.util.List<String> getSuggestions()
```

## dev.meteorapi.compat26.settings.PacketListSetting.save

Nguồn: `api/src/main/java/dev/meteorapi/compat26/settings/PacketListSetting.java:66`

```java
@Override public NbtCompound save(NbtCompound tag)
```

## dev.meteorapi.compat26.settings.PacketListSetting.load

Nguồn: `api/src/main/java/dev/meteorapi/compat26/settings/PacketListSetting.java:77`

```java
@Override public Set<PacketType<?>> load(NbtCompound tag)
```

## dev.meteorapi.compat26.settings.PacketListSetting.Builder

Nguồn: `api/src/main/java/dev/meteorapi/compat26/settings/PacketListSetting.java:92`

```java
public static class Builder extends SettingBuilder<Builder, Set<PacketType<?>>, PacketListSetting>
```

## dev.meteorapi.compat26.settings.PacketListSetting.Builder.Builder

Nguồn: `api/src/main/java/dev/meteorapi/compat26/settings/PacketListSetting.java:95`

```java
public Builder()
```

## dev.meteorapi.compat26.settings.PacketListSetting.Builder.filter

Nguồn: `api/src/main/java/dev/meteorapi/compat26/settings/PacketListSetting.java:99`

```java
public Builder filter(Predicate<PacketType<?>> filter)
```

## dev.meteorapi.compat26.settings.PacketListSetting.Builder.clientbound

Nguồn: `api/src/main/java/dev/meteorapi/compat26/settings/PacketListSetting.java:104`

```java
public Builder clientbound()
```

## dev.meteorapi.compat26.settings.PacketListSetting.Builder.serverbound

Nguồn: `api/src/main/java/dev/meteorapi/compat26/settings/PacketListSetting.java:108`

```java
public Builder serverbound()
```

## dev.meteorapi.compat26.settings.PacketListSetting.Builder.build

Nguồn: `api/src/main/java/dev/meteorapi/compat26/settings/PacketListSetting.java:112`

```java
@Override public PacketListSetting build()
```

## dev.meteorapi.game.GameAccess

Nguồn: `api/src/main/java/dev/meteorapi/game/GameAccess.java:11`

```java
public final class GameAccess
```

## dev.meteorapi.game.GameAccess.client

Nguồn: `api/src/main/java/dev/meteorapi/game/GameAccess.java:13`

```java
public static MinecraftClient client()
```

## dev.meteorapi.game.GameAccess.player

Nguồn: `api/src/main/java/dev/meteorapi/game/GameAccess.java:14`

```java
public static Optional<ClientPlayerEntity> player()
```

## dev.meteorapi.game.GameAccess.world

Nguồn: `api/src/main/java/dev/meteorapi/game/GameAccess.java:15`

```java
public static Optional<ClientWorld> world()
```

## dev.meteorapi.game.GameAccess.network

Nguồn: `api/src/main/java/dev/meteorapi/game/GameAccess.java:16`

```java
public static Optional<ClientPlayNetworkHandler> network()
```

## dev.meteorapi.game.GameAccess.inventory

Nguồn: `api/src/main/java/dev/meteorapi/game/GameAccess.java:17`

```java
public static Optional<PlayerInventory> inventory()
```

## dev.meteorapi.game.GameAccess.inWorld

Nguồn: `api/src/main/java/dev/meteorapi/game/GameAccess.java:18`

```java
public static boolean inWorld()
```

## dev.meteorapi.game.GameAccess.requireWorld

Nguồn: `api/src/main/java/dev/meteorapi/game/GameAccess.java:19`

```java
public static void requireWorld()
```

## dev.meteorapi.game.InputState

Nguồn: `api/src/main/java/dev/meteorapi/game/InputState.java:6`

```java
public final class InputState
```

## dev.meteorapi.game.InputState.keyDown

Nguồn: `api/src/main/java/dev/meteorapi/game/InputState.java:8`

```java
public static boolean keyDown(int key)
```

## dev.meteorapi.game.InputState.mouseDown

Nguồn: `api/src/main/java/dev/meteorapi/game/InputState.java:9`

```java
public static boolean mouseDown(int button)
```

## dev.meteorapi.game.InputState.pressed

Nguồn: `api/src/main/java/dev/meteorapi/game/InputState.java:10`

```java
public static void pressed(KeyBinding binding, boolean pressed)
```

## dev.meteorapi.internal.ApiInitializer

Nguồn: `api/src/main/java/dev/meteorapi/internal/ApiInitializer.java:6`

```java
public final class ApiInitializer implements ClientModInitializer
```

## dev.meteorapi.internal.ApiInitializer.onInitializeClient

Nguồn: `api/src/main/java/dev/meteorapi/internal/ApiInitializer.java:7`

```java
@Override public void onInitializeClient()
```

## dev.meteorapi.network.PacketUtils

Nguồn: `api/src/main/java/dev/meteorapi/network/PacketUtils.java:13`

```java
public final class PacketUtils
```

## dev.meteorapi.network.PacketUtils.getPackets

Nguồn: `api/src/main/java/dev/meteorapi/network/PacketUtils.java:30`

```java
public static Set<PacketType<?>> getPackets()
```

## dev.meteorapi.network.PacketUtils.getClientboundPackets

Nguồn: `api/src/main/java/dev/meteorapi/network/PacketUtils.java:34`

```java
public static Set<PacketType<?>> getClientboundPackets()
```

## dev.meteorapi.network.PacketUtils.getServerboundPackets

Nguồn: `api/src/main/java/dev/meteorapi/network/PacketUtils.java:35`

```java
public static Set<PacketType<?>> getServerboundPackets()
```

## dev.meteorapi.network.PacketUtils.getLegacyMappings

Nguồn: `api/src/main/java/dev/meteorapi/network/PacketUtils.java:36`

```java
public static Map<String, String> getLegacyMappings()
```

## dev.meteorapi.network.PacketUtils.getClientboundPacket

Nguồn: `api/src/main/java/dev/meteorapi/network/PacketUtils.java:37`

```java
public static PacketType<?> getClientboundPacket(Identifier id)
```

## dev.meteorapi.network.PacketUtils.getServerboundPacket

Nguồn: `api/src/main/java/dev/meteorapi/network/PacketUtils.java:38`

```java
public static PacketType<?> getServerboundPacket(Identifier id)
```

## dev.meteorapi.network.PacketUtils.getPacket

Nguồn: `api/src/main/java/dev/meteorapi/network/PacketUtils.java:39`

```java
public static PacketType<?> getPacket(Identifier id)
```

## dev.meteorapi.network.PacketUtils.getPacket

Nguồn: `api/src/main/java/dev/meteorapi/network/PacketUtils.java:42`

```java
public static PacketType<?> getPacket(String name)
```

## dev.meteorapi.network.Packets

Nguồn: `api/src/main/java/dev/meteorapi/network/Packets.java:16`

```java
public final class Packets
```

## dev.meteorapi.network.Packets.Phase

Nguồn: `api/src/main/java/dev/meteorapi/network/Packets.java:17`

```java
public enum Phase
```

## dev.meteorapi.network.Packets.Event

Nguồn: `api/src/main/java/dev/meteorapi/network/Packets.java:19`

```java
public record Event(Phase phase, Packet<?> packet, ClientConnection connection, Throwable error, Snapshot snapshot)
```

## dev.meteorapi.network.Packets.Snapshot

Nguồn: `api/src/main/java/dev/meteorapi/network/Packets.java:21`

```java
public record Snapshot(long sequence, long nanoTime, Phase phase, String packetClass, String thread)
```

## dev.meteorapi.network.Packets.Statistics

Nguồn: `api/src/main/java/dev/meteorapi/network/Packets.java:22`

```java
public record Statistics(long sendAttempts, long enqueued, long received, long errors, long droppedSnapshots, int observers)
```

## dev.meteorapi.network.Packets.listen

Nguồn: `api/src/main/java/dev/meteorapi/network/Packets.java:34`

```java
public static RegistrationResult<Registration> listen(NamespacedId id, Predicate<Event> filter, Consumer<Event> listener)
```

## dev.meteorapi.network.Packets.onClient

Nguồn: `api/src/main/java/dev/meteorapi/network/Packets.java:37`

```java
public static RegistrationResult<Registration> onClient(NamespacedId id, Consumer<Snapshot> listener)
```

## dev.meteorapi.network.Packets.typed

Nguồn: `api/src/main/java/dev/meteorapi/network/Packets.java:40`

```java
public static <P extends Packet<?>> RegistrationResult<Registration> typed(NamespacedId id, Phase phase, Class<P> type, Consumer<P> listener)
```

## dev.meteorapi.network.Packets.statistics

Nguồn: `api/src/main/java/dev/meteorapi/network/Packets.java:43`

```java
public static Statistics statistics()
```

## dev.meteorapi.network.Packets.observe

Nguồn: `api/src/main/java/dev/meteorapi/network/Packets.java:47`

```java
public static void observe(Phase phase, Packet<?> packet, ClientConnection connection, Throwable error)
```

## dev.meteorapi.network.Packets.drainClient

Nguồn: `api/src/main/java/dev/meteorapi/network/Packets.java:62`

```java
public static void drainClient()
```

## dev.meteorapi.network.Payloads

Nguồn: `api/src/main/java/dev/meteorapi/network/Payloads.java:21`

```java
public final class Payloads
```

## dev.meteorapi.network.Payloads.SendResult

Nguồn: `api/src/main/java/dev/meteorapi/network/Payloads.java:22`

```java
public enum SendResult
```

## dev.meteorapi.network.Payloads.playReceiver

Nguồn: `api/src/main/java/dev/meteorapi/network/Payloads.java:27`

```java
public static <T extends CustomPayload> RegistrationResult<Registration> playReceiver( CustomPayload.Id<T> type, PacketCodec<? super RegistryByteBuf, T> codec, Consumer<T> handler)
```

## dev.meteorapi.network.Payloads.configurationReceiver

Nguồn: `api/src/main/java/dev/meteorapi/network/Payloads.java:39`

```java
public static <T extends CustomPayload> RegistrationResult<Registration> configurationReceiver( CustomPayload.Id<T> type, PacketCodec<? super PacketByteBuf, T> codec, Consumer<T> handler)
```

## dev.meteorapi.network.Payloads.playSender

Nguồn: `api/src/main/java/dev/meteorapi/network/Payloads.java:51`

```java
public static <T extends CustomPayload> RegistrationResult<CustomPayload.Id<T>> playSender( CustomPayload.Id<T> type, PacketCodec<? super RegistryByteBuf, T> codec)
```

## dev.meteorapi.network.Payloads.configurationSender

Nguồn: `api/src/main/java/dev/meteorapi/network/Payloads.java:55`

```java
public static <T extends CustomPayload> RegistrationResult<CustomPayload.Id<T>> configurationSender( CustomPayload.Id<T> type, PacketCodec<? super PacketByteBuf, T> codec)
```

## dev.meteorapi.network.Payloads.sendPlay

Nguồn: `api/src/main/java/dev/meteorapi/network/Payloads.java:103`

```java
public static SendResult sendPlay(CustomPayload payload)
```

## dev.meteorapi.network.Payloads.sendConfiguration

Nguồn: `api/src/main/java/dev/meteorapi/network/Payloads.java:109`

```java
public static SendResult sendConfiguration(CustomPayload payload)
```

## dev.meteorapi.render.WorldRendering

Nguồn: `api/src/main/java/dev/meteorapi/render/WorldRendering.java:12`

```java
public final class WorldRendering
```

## dev.meteorapi.render.WorldRendering.Stage

Nguồn: `api/src/main/java/dev/meteorapi/render/WorldRendering.java:13`

```java
public enum Stage
```

## dev.meteorapi.render.WorldRendering.Event

Nguồn: `api/src/main/java/dev/meteorapi/render/WorldRendering.java:14`

```java
public record Event(Stage stage, WorldRenderContext context)
```

## dev.meteorapi.render.WorldRendering.extraction

Nguồn: `api/src/main/java/dev/meteorapi/render/WorldRendering.java:22`

```java
public static EventChannel<net.fabricmc.fabric.api.client.rendering.v1.world.WorldExtractionContext> extraction()
```

## dev.meteorapi.render.WorldRendering.terrain

Nguồn: `api/src/main/java/dev/meteorapi/render/WorldRendering.java:23`

```java
public static EventChannel<net.fabricmc.fabric.api.client.rendering.v1.world.WorldTerrainRenderContext> terrain()
```

## dev.meteorapi.render.WorldRendering.listen

Nguồn: `api/src/main/java/dev/meteorapi/render/WorldRendering.java:24`

```java
public static RegistrationResult<Registration> listen(NamespacedId id, Stage stage, Consumer<WorldRenderContext> draw)
```

## dev.meteorapi.render.WorldRendering.initialize

Nguồn: `api/src/main/java/dev/meteorapi/render/WorldRendering.java:30`

```java
public static void initialize()
```

## dev.meteorapi.ui.Canvas

Nguồn: `api/src/main/java/dev/meteorapi/ui/Canvas.java:8`

```java
public record Canvas(DrawContext context)
```

## dev.meteorapi.ui.Canvas.rectangle

Nguồn: `api/src/main/java/dev/meteorapi/ui/Canvas.java:9`

```java
public void rectangle(int x, int y, int width, int height, int argb)
```

## dev.meteorapi.ui.Canvas.text

Nguồn: `api/src/main/java/dev/meteorapi/ui/Canvas.java:10`

```java
public void text(String text, int x, int y, int argb)
```

## dev.meteorapi.ui.Canvas.text

Nguồn: `api/src/main/java/dev/meteorapi/ui/Canvas.java:11`

```java
public void text(Text text, int x, int y, int argb)
```

## dev.meteorapi.ui.Canvas.item

Nguồn: `api/src/main/java/dev/meteorapi/ui/Canvas.java:12`

```java
public void item(ItemStack item, int x, int y, boolean overlay)
```

## dev.meteorapi.ui.Canvas.clip

Nguồn: `api/src/main/java/dev/meteorapi/ui/Canvas.java:16`

```java
public void clip(int x, int y, int width, int height, Runnable draw)
```

## dev.meteorapi.ui.Canvas.transformed

Nguồn: `api/src/main/java/dev/meteorapi/ui/Canvas.java:20`

```java
public void transformed(float x, float y, float scale, Runnable draw)
```

## dev.meteorapi.ui.FileDialogs

Nguồn: `api/src/main/java/dev/meteorapi/ui/FileDialogs.java:14`

```java
public final class FileDialogs
```

## dev.meteorapi.ui.FileDialogs.openFile

Nguồn: `api/src/main/java/dev/meteorapi/ui/FileDialogs.java:19`

```java
public static CompletableFuture<Optional<Path>> openFile(String extensions)
```

## dev.meteorapi.ui.FileDialogs.saveFile

Nguồn: `api/src/main/java/dev/meteorapi/ui/FileDialogs.java:20`

```java
public static CompletableFuture<Optional<Path>> saveFile(String extensions)
```

## dev.meteorapi.ui.FileDialogs.openFile

Nguồn: `api/src/main/java/dev/meteorapi/ui/FileDialogs.java:21`

```java
public static void openFile(String extensions, java.util.function.Consumer<? super java.io.File> onSelected)
```

## dev.meteorapi.ui.FileDialogs.saveFile

Nguồn: `api/src/main/java/dev/meteorapi/ui/FileDialogs.java:24`

```java
public static void saveFile(String extensions, java.util.function.Consumer<? super java.io.File> onSelected)
```

## dev.meteorapi.ui.Menus

Nguồn: `api/src/main/java/dev/meteorapi/ui/Menus.java:14`

```java
public final class Menus
```

## dev.meteorapi.ui.Menus.register

Nguồn: `api/src/main/java/dev/meteorapi/ui/Menus.java:26`

```java
public static RegistrationResult<Registration> register( NamespacedId id, String title, Function<Screen, Screen> factory)
```

## dev.meteorapi.ui.Menus.entries

Nguồn: `api/src/main/java/dev/meteorapi/ui/Menus.java:31`

```java
public static List<MenuRegistry.Entry<Screen>> entries()
```

## dev.meteorapi.ui.Menus.open

Nguồn: `api/src/main/java/dev/meteorapi/ui/Menus.java:39`

```java
public static boolean open(NamespacedId id, Screen parent)
```

## dev.meteorapi.ui.Menus.screen

Nguồn: `api/src/main/java/dev/meteorapi/ui/Menus.java:52`

```java
public static Screen screen(Screen parent)
```

## dev.meteorapi.ui.PanelScreen

Nguồn: `api/src/main/java/dev/meteorapi/ui/PanelScreen.java:16`

```java
public class PanelScreen extends Screen
```

## dev.meteorapi.ui.PanelScreen.PanelScreen

Nguồn: `api/src/main/java/dev/meteorapi/ui/PanelScreen.java:36`

```java
protected PanelScreen(String title, Screen parent, List<Panels.Row> rows, Runnable onClose)
```

## dev.meteorapi.ui.PanelScreen.PanelScreen

Nguồn: `api/src/main/java/dev/meteorapi/ui/PanelScreen.java:40`

```java
protected PanelScreen( String title, Screen parent, List<Panels.Row> rows, Runnable onClose, String searchHint)
```

## dev.meteorapi.ui.PanelScreen.init

Nguồn: `api/src/main/java/dev/meteorapi/ui/PanelScreen.java:65`

```java
@Override protected void init()
```

## dev.meteorapi.ui.PanelScreen.tick

Nguồn: `api/src/main/java/dev/meteorapi/ui/PanelScreen.java:313`

```java
@Override public void tick()
```

## dev.meteorapi.ui.PanelScreen.mouseScrolled

Nguồn: `api/src/main/java/dev/meteorapi/ui/PanelScreen.java:340`

```java
@Override public boolean mouseScrolled(double x, double y, double horizontal, double vertical)
```

## dev.meteorapi.ui.PanelScreen.keyPressed

Nguồn: `api/src/main/java/dev/meteorapi/ui/PanelScreen.java:347`

```java
@Override public boolean keyPressed(KeyInput key)
```

## dev.meteorapi.ui.PanelScreen.render

Nguồn: `api/src/main/java/dev/meteorapi/ui/PanelScreen.java:356`

```java
@Override public void render(DrawContext context, int mouseX, int mouseY, float delta)
```

## dev.meteorapi.ui.PanelScreen.shouldPause

Nguồn: `api/src/main/java/dev/meteorapi/ui/PanelScreen.java:391`

```java
@Override public boolean shouldPause()
```

## dev.meteorapi.ui.PanelScreen.removed

Nguồn: `api/src/main/java/dev/meteorapi/ui/PanelScreen.java:396`

```java
@Override public void removed()
```

## dev.meteorapi.ui.PanelScreen.close

Nguồn: `api/src/main/java/dev/meteorapi/ui/PanelScreen.java:404`

```java
@Override public void close()
```

## dev.meteorapi.ui.Panels

Nguồn: `api/src/main/java/dev/meteorapi/ui/Panels.java:16`

```java
public final class Panels
```

## dev.meteorapi.ui.Panels.create

Nguồn: `api/src/main/java/dev/meteorapi/ui/Panels.java:19`

```java
public static Builder create(String title)
```

## dev.meteorapi.ui.Panels.Row

Nguồn: `api/src/main/java/dev/meteorapi/ui/Panels.java:23`

```java
public sealed interface Row permits Label, Action, ConditionalAction, Field, Toggle, FileField, Choice
```

## dev.meteorapi.ui.Panels.Label

Nguồn: `api/src/main/java/dev/meteorapi/ui/Panels.java:26`

```java
public record Label(String text) implements Row
```

## dev.meteorapi.ui.Panels.Action

Nguồn: `api/src/main/java/dev/meteorapi/ui/Panels.java:28`

```java
public record Action(String text, Runnable action) implements Row
```

## dev.meteorapi.ui.Panels.Action.Action

Nguồn: `api/src/main/java/dev/meteorapi/ui/Panels.java:29`

```java
public Action
```

## dev.meteorapi.ui.Panels.ConditionalAction

Nguồn: `api/src/main/java/dev/meteorapi/ui/Panels.java:35`

```java
public record ConditionalAction(String text, BooleanSupplier enabled, Runnable action) implements Row
```

## dev.meteorapi.ui.Panels.ConditionalAction.ConditionalAction

Nguồn: `api/src/main/java/dev/meteorapi/ui/Panels.java:37`

```java
public ConditionalAction
```

## dev.meteorapi.ui.Panels.Field

Nguồn: `api/src/main/java/dev/meteorapi/ui/Panels.java:44`

```java
public record Field(String text, Setting<?> setting) implements Row
```

## dev.meteorapi.ui.Panels.Toggle

Nguồn: `api/src/main/java/dev/meteorapi/ui/Panels.java:46`

```java
public record Toggle(String text, Setting<Boolean> setting) implements Row
```

## dev.meteorapi.ui.Panels.FileField

Nguồn: `api/src/main/java/dev/meteorapi/ui/Panels.java:48`

```java
public record FileField(String text, Setting<Path> setting, String extensions) implements Row
```

## dev.meteorapi.ui.Panels.Choice

Nguồn: `api/src/main/java/dev/meteorapi/ui/Panels.java:50`

```java
public record Choice<E extends Enum<E>>(String text, Setting<E> setting, List<E> values) implements Row
```

## dev.meteorapi.ui.Panels.Choice.Choice

Nguồn: `api/src/main/java/dev/meteorapi/ui/Panels.java:52`

```java
public Choice
```

## dev.meteorapi.ui.Panels.Builder

Nguồn: `api/src/main/java/dev/meteorapi/ui/Panels.java:61`

```java
public static final class Builder
```

## dev.meteorapi.ui.Panels.Builder.label

Nguồn: `api/src/main/java/dev/meteorapi/ui/Panels.java:71`

```java
public Builder label(String text)
```

## dev.meteorapi.ui.Panels.Builder.button

Nguồn: `api/src/main/java/dev/meteorapi/ui/Panels.java:76`

```java
public Builder button(String text, Runnable action)
```

## dev.meteorapi.ui.Panels.Builder.button

Nguồn: `api/src/main/java/dev/meteorapi/ui/Panels.java:81`

```java
public Builder button(String text, BooleanSupplier enabled, Runnable action)
```

## dev.meteorapi.ui.Panels.Builder.field

Nguồn: `api/src/main/java/dev/meteorapi/ui/Panels.java:86`

```java
public Builder field(String text, Setting<?> setting)
```

## dev.meteorapi.ui.Panels.Builder.toggle

Nguồn: `api/src/main/java/dev/meteorapi/ui/Panels.java:91`

```java
public Builder toggle(String text, Setting<Boolean> setting)
```

## dev.meteorapi.ui.Panels.Builder.file

Nguồn: `api/src/main/java/dev/meteorapi/ui/Panels.java:96`

```java
public Builder file(String text, Setting<Path> setting, String extensions)
```

## dev.meteorapi.ui.Panels.Builder.choice

Nguồn: `api/src/main/java/dev/meteorapi/ui/Panels.java:101`

```java
public <E extends Enum<E>> Builder choice(String text, Setting<E> setting, Class<E> type)
```

## dev.meteorapi.ui.Panels.Builder.searchable

Nguồn: `api/src/main/java/dev/meteorapi/ui/Panels.java:106`

```java
public Builder searchable(String hint)
```

## dev.meteorapi.ui.Panels.Builder.onClose

Nguồn: `api/src/main/java/dev/meteorapi/ui/Panels.java:111`

```java
public Builder onClose(Runnable action)
```

## dev.meteorapi.ui.Panels.Builder.build

Nguồn: `api/src/main/java/dev/meteorapi/ui/Panels.java:116`

```java
public Screen build(Screen parent)
```

## dev.meteorapi.MetadataProfileTest

Nguồn: `api/src/test/java/dev/meteorapi/MetadataProfileTest.java:17`

```java
public final class MetadataProfileTest
```

## dev.meteorapi.MetadataProfileTest.main

Nguồn: `api/src/test/java/dev/meteorapi/MetadataProfileTest.java:20`

```java
public static void main(String[] args) throws Exception
```

## dev.meteorapi.PlatformTest

Nguồn: `api/src/test/java/dev/meteorapi/PlatformTest.java:16`

```java
public final class PlatformTest
```

## dev.meteorapi.PlatformTest.main

Nguồn: `api/src/test/java/dev/meteorapi/PlatformTest.java:19`

```java
public static void main(String[] args) throws Exception
```
