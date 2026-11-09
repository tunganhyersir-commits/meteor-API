/* SPDX-License-Identifier: GPL-3.0-only */
package dev.meteorapi.event;

import java.util.ArrayDeque;
import java.util.Objects;
import java.util.function.Consumer;

/** Cross-thread handoff with explicit drop accounting and a fixed memory bound. */
public final class BoundedMailbox<E> {
    private final ArrayDeque<E> queue = new ArrayDeque<>();
    private final int capacity;
    private long dropped;
    public BoundedMailbox(int capacity) {
        if (capacity < 1) throw new IllegalArgumentException("capacity must be positive");
        this.capacity = capacity;
    }
    public synchronized boolean offer(E event) {
        Objects.requireNonNull(event);
        if (queue.size() == capacity) { dropped++; return false; }
        queue.addLast(event); return true;
    }
    public int drain(int limit, Consumer<? super E> receiver) {
        if (limit < 0) throw new IllegalArgumentException("negative drain limit");
        int count = 0;
        while (count < limit) {
            E event;
            synchronized (this) { event = queue.pollFirst(); }
            if (event == null) break;
            receiver.accept(event); count++;
        }
        return count;
    }
    public synchronized int pending() { return queue.size(); }
    public synchronized long dropped() { return dropped; }
    public synchronized void clear() { queue.clear(); }
}
