/* SPDX-License-Identifier: GPL-3.0-only */
package dev.meteorapi.task;
import dev.meteorlib.foundation.Registration;
import dev.meteorlib.foundation.ResourceScope;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;
/** Bounded workers for CPU/file work. Minecraft state belongs on the client thread. */
public final class Tasks {
    private static final AtomicInteger THREADS = new AtomicInteger();
    private static final ThreadPoolExecutor WORKERS = new ThreadPoolExecutor(2, 2, 30, TimeUnit.SECONDS,
        new ArrayBlockingQueue<>(64), task -> {
            Thread thread = new Thread(task, "MeteorAPI-worker-" + THREADS.incrementAndGet()); thread.setDaemon(true); return thread;
        }, new ThreadPoolExecutor.AbortPolicy());
    private Tasks() {}
    public static <T> CompletableFuture<T> submit(Callable<T> action, ResourceScope scope) {
        CompletableFuture<T> result = new CompletableFuture<>();
        try {
            Future<?> running = WORKERS.submit(() -> {
                if (result.isCancelled()) return;
                try { result.complete(action.call()); }
                catch (Exception error) { result.completeExceptionally(error); }
            });
            result.whenComplete((value, error) -> { if (result.isCancelled()) running.cancel(true); });
            Registration token = Registration.once(() -> { result.cancel(true); running.cancel(true); });
            try { scope.own(token); }
            catch (RuntimeException error) { token.close(); throw error; }
        } catch (RejectedExecutionException full) { result.completeExceptionally(full); }
        return result;
    }
    public static int queued() { return WORKERS.getQueue().size(); }
}
