/* SPDX-License-Identifier: GPL-3.0-only */
package dev.meteorapi;

import dev.meteorapi.event.BoundedMailbox;
import dev.meteorapi.event.EventChannel;
import dev.meteorapi.setting.ConfigStore;
import dev.meteorapi.setting.Setting;
import dev.meteorapi.setting.Settings;
import dev.meteorlib.foundation.NamespacedId;
import dev.meteorlib.foundation.Registration;
import dev.meteorlib.foundation.RegistrationResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public final class ApiCoreTest {
    private static int checks;
    private static NamespacedId id(String name) { return new NamespacedId("tests", name); }
    public static void main(String[] args) throws Exception {
        List<String> calls = new ArrayList<>();
        List<RuntimeException> errors = new ArrayList<>();
        EventChannel<Integer> bus = new EventChannel<>(3, (id, failure) -> errors.add(failure));
        Registration low = bus.listen(id("low"), 0, value -> value > 0, value -> calls.add("low")).value().orElseThrow();
        bus.listen(id("high"), 10, value -> true, value -> calls.add("high"));
        bus.listen(id("equal"), 10, value -> true, value -> calls.add("equal"));
        bus.post(1);
        check(calls.equals(List.of("high", "equal", "low")), "priority and stable registration order");
        check(bus.listen(id("low"), value -> {}).status() == RegistrationResult.Status.CONFLICT, "duplicate listener returns conflict");
        low.close(); low.close(); calls.clear(); bus.post(1);
        check(calls.equals(List.of("high", "equal")), "unsubscription is idempotent");
        bus.listen(id("broken"), value -> { throw new IllegalStateException("listener failed"); });
        bus.post(1); bus.post(1); bus.post(1); bus.post(1);
        check(errors.size() == 3 && bus.size() == 2, "failing listener quarantined after three errors");
        EventChannel<Integer> loggingFailure = new EventChannel<>(1, (id, error) -> { throw new IllegalStateException("logger"); });
        loggingFailure.listen(id("filter"), 0, value -> { throw new IllegalArgumentException(); }, value -> {});
        loggingFailure.post(1);
        check(loggingFailure.size() == 0, "filter and logger failure cannot break dispatch");

        EventChannel<Integer> reentrant = new EventChannel<>(3, (id, error) -> {});
        AtomicInteger delayed = new AtomicInteger();
        reentrant.listen(id("first"), value -> reentrant.listen(id("later"), number -> delayed.incrementAndGet()));
        reentrant.post(1); check(delayed.get() == 0, "new listener absent from in-flight snapshot");
        reentrant.post(2); check(delayed.get() == 1, "new listener present on following event");
        EventChannel<Integer> concurrent = new EventChannel<>(3, (id, error) -> { throw new AssertionError(error); });
        AtomicInteger deliveries = new AtomicInteger();
        concurrent.listen(id("count"), value -> deliveries.incrementAndGet());
        List<Thread> threads = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            Thread thread = new Thread(() -> { for (int n = 0; n < 1000; n++) concurrent.post(n); });
            threads.add(thread); thread.start();
        }
        for (Thread thread : threads) thread.join();
        check(deliveries.get() == 4000, "concurrent packet-style publishers preserve deliveries");

        BoundedMailbox<Integer> mailbox = new BoundedMailbox<>(3);
        check(mailbox.offer(1) && mailbox.offer(2) && mailbox.offer(3), "mailbox accepts up to capacity");
        check(!mailbox.offer(4) && mailbox.dropped() == 1, "mailbox overflow counted without growing queue");
        List<Integer> drained = new ArrayList<>();
        check(mailbox.drain(2, drained::add) == 2 && drained.equals(List.of(1, 2)) && mailbox.pending() == 1, "bounded FIFO draining");
        mailbox.clear(); check(mailbox.pending() == 0, "mailbox cleanup");
        expect(IllegalArgumentException.class, () -> mailbox.drain(-1, value -> {}));

        var large = Settings.longValue(id("long"), 0, Long.MIN_VALUE, Long.MAX_VALUE);
        check(large.parse(Long.toString(Long.MAX_VALUE)) && large.get() == Long.MAX_VALUE, "long maximum preserved exactly");
        check(large.parse(Long.toString(Long.MIN_VALUE)) && large.get() == Long.MIN_VALUE, "long minimum preserved exactly");
        check(!large.parse("9223372036854775808") && large.get() == Long.MIN_VALUE, "overflow rejected without mutation");
        var bounded = Settings.longValue(id("bounded"), 5, 0, 10);
        check(!bounded.parse("11") && bounded.get() == 5, "range validation reports failure");
        AtomicInteger changes = new AtomicInteger();
        var changed = bounded.onChanged(id("changes"), event -> changes.incrementAndGet()).value().orElseThrow();
        bounded.set(6L); bounded.set(6L); check(changes.get() == 1, "no duplicate change for equal values");
        changed.close(); bounded.set(7L); check(changes.get() == 1, "change listener can be revoked");
        bounded.reset(); check(!bounded.changed() && bounded.get() == 5, "reset restores default");
        var number = Settings.doubleValue(id("double"), 0, -10, 10);
        check(!number.parse("NaN") && !number.parse("Infinity"), "non-finite double values rejected");
        var flag = Settings.bool(id("flag"), false);
        check(!flag.parse("yes") && flag.parse("TRUE") && flag.get(), "strict boolean parsing");
        var list = Settings.strings(id("list"), List.of(), 10);
        for (List<String> candidate : List.of(List.<String>of(), List.of(""), List.of("", ""), List.of("Việt Nam", "a,b", "x:y", "\\n"))) {
            check(list.set(candidate) && list.parse(list.encode()) && list.get().equals(candidate), "lossless string-list roundtrip");
        }
        List<String> mutable = new ArrayList<>(List.of("before"));
        list.set(mutable); mutable.add("after"); check(list.get().equals(List.of("before")), "list values have defensive snapshots");
        expect(UnsupportedOperationException.class, () -> list.get().add("mutation"));
        check(!list.parse("not-a-list"), "malformed list rejected");

        Path directory = Files.createTempDirectory("meteor-api-tests-");
        try {
            ConfigStore store = new ConfigStore(directory.resolve("config.properties"));
            check(store.add(bounded).success(), "setting registration");
            check(store.add(bounded).status() == RegistrationResult.Status.ALREADY_PRESENT, "same setting identity is idempotent");
            check(store.add(Settings.longValue(id("bounded"), 1, 0, 10)).status() == RegistrationResult.Status.CONFLICT, "different setting identity does not overwrite");
            store.add(flag); bounded.set(9L); flag.set(false); store.save();
            bounded.set(1L); flag.set(true); check(store.load().isEmpty() && bounded.get() == 9 && !flag.get(), "config persistence roundtrip");
            Files.writeString(store.file(), "tests\\:bounded=not-a-number\ntests\\:flag=true\nunknown\\:newer=preserved\n");
            check(store.load().size() == 1 && bounded.get() == 9 && flag.get(), "bad value preserves previous value while loading valid entries");
            store.save(); check(Files.readString(store.file()).contains("preserved"), "unknown config entries survive save");
            Path input = directory.resolve("input.txt"); Files.writeString(input, "ok");
            Setting<Path> file = Settings.file(id("file"), null);
            check(file.set(input) && !file.set(directory.resolve("missing")), "file setting validates existing files");
            file.reset(); check(file.get() == null, "file selection can be cleared");
        } finally {
            try (var paths = Files.walk(directory)) { for (Path path : paths.sorted(java.util.Comparator.reverseOrder()).toList()) Files.delete(path); }
        }
        java.lang.System.out.println("PASS: " + checks + " new API checks");
    }
    private static void check(boolean result, String message) { checks++; if (!result) throw new AssertionError(message); }
    private static void expect(Class<? extends Throwable> type, Runnable action) {
        checks++; try { action.run(); } catch (Throwable error) { if (type.isInstance(error)) return; throw new AssertionError(error); }
        throw new AssertionError("Expected " + type);
    }
}
