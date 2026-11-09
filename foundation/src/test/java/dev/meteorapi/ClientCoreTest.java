/* SPDX-License-Identifier: GPL-3.0-only */
package dev.meteorapi;
import dev.meteorapi.client.CommandLine;
import dev.meteorapi.client.FeatureLifecycle;
import dev.meteorapi.performance.Profiler;
import dev.meteorapi.performance.WorkBudget;
import dev.meteorapi.task.Tasks;
import dev.meteorlib.foundation.NamespacedId;
import dev.meteorlib.foundation.ResourceScope;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public final class ClientCoreTest {
    private static int checks;
    public static void main(String[] args) throws Exception {
        List<RuntimeException> errors = new ArrayList<>();
        class Feature extends FeatureLifecycle {
            int starts, stops, cleanups;
            boolean failStart, failStop, reentrantRejected;
            Feature() { super(new NamespacedId("test-client", "feature"), (id, error) -> errors.add(error)); }
            @Override protected void onEnable(ResourceScope resources) {
                starts++; reentrantRejected = !enable() && !disable();
                resources.defer(() -> cleanups++);
                if (failStart) throw new IllegalArgumentException("activation failure");
            }
            @Override protected void onDisable() { stops++; if (failStop) throw new IllegalStateException("deactivation failure"); }
        }
        Feature feature = new Feature();
        check(feature.enable() && feature.enable() && feature.starts == 1, "enable is idempotent");
        check(feature.reentrantRejected, "reentrant lifecycle transitions refused");
        check(feature.active(), "active state after successful start");
        check(feature.disable() && feature.disable() && feature.stops == 1 && feature.cleanups == 1, "disable and cleanup run once");
        feature.failStart = true;
        check(!feature.enable() && feature.state() == FeatureLifecycle.State.INACTIVE && feature.cleanups == 2, "failed activation rolls back resources and state");
        check(errors.size() == 1, "activation failure reported");
        feature.failStart = false; feature.enable(); feature.failStop = true;
        check(!feature.disable() && feature.state() == FeatureLifecycle.State.INACTIVE && feature.cleanups == 3, "failed stop still releases resources and turns off");
        feature.failStop = false; check(feature.toggle() && feature.active() && feature.toggle() && !feature.active(), "toggle follows lifecycle");
        AtomicReference<Throwable> wrongThread = new AtomicReference<>();
        Thread thread = new Thread(() -> { try { feature.enable(); } catch (Throwable error) { wrongThread.set(error); } });
        thread.start(); thread.join(); check(wrongThread.get() instanceof IllegalStateException, "module lifecycle rejects wrong thread");
        check(CommandLine.parse("one \"two words\" '' a\\ b").equals(List.of("one", "two words", "", "a b")), "quoted and escaped command arguments");
        check(CommandLine.parse(" \t ").isEmpty(), "empty command");
        expect(IllegalArgumentException.class, () -> CommandLine.parse("\"unclosed"));
        expect(IllegalArgumentException.class, () -> CommandLine.parse("trailing\\"));

        Profiler profiler = new Profiler();
        var timer = profiler.measure(new NamespacedId("test-client", "tick")); timer.close(); timer.close();
        var sample = profiler.snapshot().values().iterator().next();
        check(sample.count() == 1 && sample.totalNanoseconds() >= 0 && sample.maximumNanoseconds() <= sample.totalNanoseconds(), "profiler closes once and reports consistent timing bounds");
        profiler.clear(); check(profiler.snapshot().isEmpty(), "profiling data can be cleared");
        WorkBudget noTime = new WorkBudget(0, 100); check(!noTime.tryRun(() -> {}), "zero time budget starts no work");
        WorkBudget bounded = new WorkBudget(Long.MAX_VALUE, 2);
        check(bounded.tryRun(() -> {}) && bounded.tryRun(() -> {}) && !bounded.tryRun(() -> {}) && bounded.spent() == 2, "work count budget enforced");
        ResourceScope tasks = new ResourceScope();
        check(Tasks.submit(() -> 42, tasks).get(2, TimeUnit.SECONDS) == 42, "background task returns result");
        tasks.close();
        ResourceScope cancelledScope = new ResourceScope();
        CountDownLatch began = new CountDownLatch(1), finish = new CountDownLatch(1);
        var future = Tasks.submit(() -> { began.countDown(); finish.await(); return 1; }, cancelledScope);
        check(began.await(2, TimeUnit.SECONDS), "background task started");
        cancelledScope.close(); check(future.isCancelled(), "closing scope cancels owned task"); finish.countDown();
        java.lang.System.out.println("PASS: " + checks + " client SDK checks");
    }
    private static void check(boolean ok, String name) { checks++; if (!ok) throw new AssertionError(name); }
    private static void expect(Class<? extends Throwable> type, Runnable action) {
        checks++; try { action.run(); } catch (Throwable error) { if (type.isInstance(error)) return; throw new AssertionError(error); }
        throw new AssertionError("Expected " + type);
    }
}
