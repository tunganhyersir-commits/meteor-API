/* SPDX-License-Identifier: GPL-3.0-only */
package dev.meteorlib.foundation;

import java.util.Comparator;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.function.Consumer;

/** Bounded, client-thread scheduler. A zero delay always means the next tick. */
public final class TickScheduler implements AutoCloseable {
    private final Thread owner = Thread.currentThread();
    private final PriorityQueue<Task> queue = new PriorityQueue<>(
        Comparator.comparingLong((Task task) -> task.due).thenComparingLong(task -> task.order));
    private final int capacity;
    private final int perTick;
    private final Consumer<RuntimeException> errors;
    private long tick;
    private long sequence;
    private boolean closed;
    private boolean ticking;

    public TickScheduler(int capacity, int perTick, Consumer<RuntimeException> errors) {
        if (capacity < 1 || perTick < 1) throw new IllegalArgumentException("Bounds must be positive");
        this.capacity = capacity;
        this.perTick = perTick;
        this.errors = Objects.requireNonNull(errors, "errors");
    }

    public Registration schedule(long delayTicks, Runnable action) {
        checkOwner();
        if (closed) throw new IllegalStateException("Scheduler is closed");
        if (delayTicks < 0) throw new IllegalArgumentException("Negative delay");
        Objects.requireNonNull(action, "action");
        if (queue.size() >= capacity) throw new IllegalStateException("Scheduler queue is full");
        Task task = new Task(Math.addExact(tick, Math.max(1, delayTicks)), sequence++, action);
        queue.add(task);
        return Registration.once(() -> { checkOwner(); queue.remove(task); });
    }

    public int pending() { checkOwner(); return queue.size(); }
    public long currentTick() { checkOwner(); return tick; }

    public void tick() {
        checkOwner();
        if (closed) return;
        if (ticking) throw new IllegalStateException("Recursive scheduler tick");
        ticking = true;
        try {
            tick = Math.incrementExact(tick);
            int remaining = perTick;
            while (!closed && remaining-- > 0 && !queue.isEmpty() && queue.peek().due <= tick) {
                Task task = queue.remove();
                try { task.action.run(); }
                catch (RuntimeException exception) { errors.accept(exception); }
            }
        } finally { ticking = false; }
    }

    @Override
    public void close() { checkOwner(); closed = true; queue.clear(); }

    private void checkOwner() {
        if (Thread.currentThread() != owner) throw new IllegalStateException("Use TickScheduler on its owning thread");
    }

    private record Task(long due, long order, Runnable action) {}
}
