/* SPDX-License-Identifier: GPL-3.0-only */
package dev.meteorlib.foundation;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/** No game or test framework required. Run with -ea. */
public final class FoundationTest {
    private static int checks;

    public static void main(String[] args) throws Exception {
        List<Integer> order = new ArrayList<>();
        ResourceScope scope = new ResourceScope();
        scope.defer(() -> order.add(1));
        scope.defer(() -> order.add(2));
        scope.close(); scope.close();
        check(order.equals(List.of(2, 1)), "reverse cleanup, once");
        expect(IllegalStateException.class, () -> scope.defer(() -> {}));

        ResourceScope broken = new ResourceScope();
        broken.defer(() -> order.add(3));
        broken.defer(() -> { throw new IllegalArgumentException("a"); });
        broken.defer(() -> { throw new IllegalStateException("b"); });
        try { broken.close(); throw new AssertionError("expected cleanup failure"); }
        catch (IllegalStateException failure) {
            check(failure.getSuppressed().length == 1, "cleanup errors aggregated");
            check(order.getLast() == 3, "remaining resources still closed");
        }
        broken.close();

        ServiceRegistry services = new ServiceRegistry();
        Registration old = services.register(CharSequence.class, "hello");
        check(services.require(CharSequence.class).equals("hello"), "typed service");
        expect(IllegalStateException.class, () -> services.register(CharSequence.class, "other"));
        old.close();
        Registration newer = services.register(CharSequence.class, "new");
        old.close();
        check(services.require(CharSequence.class).equals("new"), "stale registration cannot revoke replacement");
        newer.close();
        expect(IllegalStateException.class, () -> services.require(CharSequence.class));

        List<RuntimeException> errors = new ArrayList<>();
        TickScheduler scheduler = new TickScheduler(4, 2, errors::add);
        List<Integer> tasks = new ArrayList<>();
        Registration cancelled = scheduler.schedule(0, () -> tasks.add(99));
        cancelled.close();
        scheduler.schedule(0, () -> { tasks.add(1); scheduler.schedule(0, () -> tasks.add(4)); });
        scheduler.schedule(0, () -> tasks.add(2));
        scheduler.schedule(0, () -> tasks.add(3));
        scheduler.tick();
        check(tasks.equals(List.of(1, 2)), "FIFO, bounded tick and no same-tick recursive enqueue");
        scheduler.tick();
        check(tasks.equals(List.of(1, 2, 3, 4)), "overdue task runs before later task");
        scheduler.schedule(0, () -> { throw new IllegalStateException("action"); });
        scheduler.schedule(0, () -> tasks.add(5));
        scheduler.tick();
        check(errors.size() == 1 && tasks.getLast() == 5, "failure does not starve remaining tasks");
        expect(IllegalArgumentException.class, () -> scheduler.schedule(-1, () -> {}));
        expect(ArithmeticException.class, () -> scheduler.schedule(Long.MAX_VALUE, () -> {}));
        for (int i = 0; i < 4; i++) scheduler.schedule(100, () -> {});
        expect(IllegalStateException.class, () -> scheduler.schedule(100, () -> {}));
        scheduler.close(); scheduler.close();
        check(scheduler.pending() == 0, "shutdown clears queue");
        expect(IllegalStateException.class, () -> scheduler.schedule(1, () -> {}));

        TickScheduler recursive = new TickScheduler(2, 2, errors::add);
        recursive.schedule(0, recursive::tick);
        recursive.tick();
        check(errors.size() == 2, "recursive tick rejected");
        recursive.close();

        check(NamespacedId.parse("example:settings/main").toString().equals("example:settings/main"), "id roundtrip");
        expect(IllegalArgumentException.class, () -> NamespacedId.parse("Bad:Name"));
        expect(IllegalArgumentException.class, () -> NamespacedId.parse("x:y:z"));
        expect(IllegalArgumentException.class, () -> NamespacedId.parse("x:"));

        AtomicInteger calls = new AtomicInteger();
        Registration concurrent = Registration.once(calls::incrementAndGet);
        List<Thread> threads = new ArrayList<>();
        for (int i = 0; i < 12; i++) {
            Thread thread = new Thread(concurrent::close); threads.add(thread); thread.start();
        }
        for (Thread thread : threads) thread.join();
        check(calls.get() == 1, "concurrent cleanup once");

        ResourceScope confined = new ResourceScope();
        AtomicReference<Throwable> rejection = new AtomicReference<>();
        Thread wrong = new Thread(() -> { try { confined.close(); } catch (Throwable e) { rejection.set(e); } });
        wrong.start(); wrong.join();
        check(rejection.get() instanceof IllegalStateException, "scope rejects wrong thread");
        confined.close();
        check(NameRules.scoped("alpha", "status").equals("alpha.status"), "scoped registration name");
        check(!NameRules.scoped("alpha", "beta-status").equals(NameRules.scoped("alpha_beta", "status")), "unambiguous scoping");
        expect(IllegalArgumentException.class, () -> NameRules.scoped("Alpha", "status"));
        expect(IllegalArgumentException.class, () -> NameRules.scoped("a.b", "status"));
        expect(IllegalStateException.class, () -> NameRules.requireDistinct(List.of("one", "ONE")));
        expect(IllegalStateException.class, () -> NameRules.rejectOverlap(List.of("owner.test"), List.of("OWNER.TEST"), "command"));
        NameRules.rejectOverlap(List.of("alpha.test"), List.of("beta.test"), "command");
        check(true, "different owners coexist");
        check("Aa".hashCode() == "BB".hashCode(), "real Java category hash collision fixture");
        expect(RegistrationConflictException.class, () -> NameRules.requireCategoryDistinct("Aa", List.of("BB")));
        expect(RegistrationConflictException.class, () -> NameRules.requireCategoryDistinct("Tools", List.of("tools")));
        check(RegistrationResult.attempt(() -> "ok").success(), "registration success returned");
        check(RegistrationResult.attempt(() -> { throw new RegistrationConflictException("duplicate"); }).status()
            == RegistrationResult.Status.CONFLICT, "duplicate returned without crash");
        check(RegistrationResult.attempt(() -> { throw new IllegalArgumentException("invalid"); }).status()
            == RegistrationResult.Status.INVALID, "invalid registration returned");
        check(RegistrationResult.attempt(() -> { throw new IllegalStateException("factory failure"); }).status()
            == RegistrationResult.Status.FAILED, "factory failure returned");
        java.lang.System.out.println("PASS: " + checks + " foundation checks");
    }

    private static void check(boolean ok, String label) {
        checks++;
        if (!ok) throw new AssertionError(label);
    }

    private static void expect(Class<? extends Throwable> type, Runnable action) {
        checks++;
        try { action.run(); }
        catch (Throwable error) {
            if (type.isInstance(error)) return;
            throw new AssertionError("Expected " + type.getName(), error);
        }
        throw new AssertionError("Expected " + type.getName());
    }
}
