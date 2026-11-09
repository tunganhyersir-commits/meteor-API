/* SPDX-License-Identifier: GPL-3.0-only */
package dev.meteorapi.event;

import dev.meteorlib.foundation.NamespacedId;
import dev.meteorlib.foundation.Registration;
import dev.meteorlib.foundation.RegistrationResult;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

/** Thread-safe, deterministic observer registry. One failing addon cannot stop event dispatch. */
public final class EventChannel<E> {
    private final Map<NamespacedId, Entry<E>> entries = new HashMap<>();
    private volatile List<Entry<E>> snapshot = List.of();
    private final BiConsumer<NamespacedId, RuntimeException> errors;
    private final int failureLimit;
    private long sequence;

    public EventChannel(int failureLimit, BiConsumer<NamespacedId, RuntimeException> errors) {
        if (failureLimit < 1) throw new IllegalArgumentException("failureLimit must be positive");
        this.failureLimit = failureLimit;
        this.errors = Objects.requireNonNull(errors);
    }

    public RegistrationResult<Registration> listen(NamespacedId id, Consumer<? super E> listener) {
        return listen(id, 0, event -> true, listener);
    }

    public synchronized RegistrationResult<Registration> listen(NamespacedId id, int priority,
            Predicate<? super E> filter, Consumer<? super E> listener) {
        Objects.requireNonNull(id); Objects.requireNonNull(filter); Objects.requireNonNull(listener);
        if (entries.containsKey(id)) return new RegistrationResult<>(RegistrationResult.Status.CONFLICT,
            Optional.empty(), "Listener ID is already in use: " + id);
        Entry<E> entry = new Entry<>(id, priority, sequence++, filter, listener);
        entries.put(id, entry);
        refresh();
        return new RegistrationResult<>(RegistrationResult.Status.REGISTERED,
            Optional.of(Registration.once(() -> remove(entry))), "registered");
    }

    public void post(E event) {
        Objects.requireNonNull(event);
        for (Entry<E> entry : snapshot) {
            if (!entry.active) continue;
            try {
                if (entry.filter.test(event)) entry.listener.accept(event);
                entry.failures.set(0);
            } catch (RuntimeException failure) {
                int failures = entry.failures.incrementAndGet();
                // A logging callback is not allowed to turn a listener exception into a connection failure.
                try { errors.accept(entry.id, failure); } catch (RuntimeException ignored) {}
                if (failures >= failureLimit) remove(entry);
            }
        }
    }

    public int size() { return snapshot.size(); }

    private synchronized void remove(Entry<E> entry) {
        entry.active = false;
        if (entries.get(entry.id) == entry) { entries.remove(entry.id); refresh(); }
    }

    private void refresh() {
        List<Entry<E>> next = new ArrayList<>(entries.values());
        next.sort(Comparator.comparingInt((Entry<E> entry) -> entry.priority).reversed()
            .thenComparingLong(entry -> entry.sequence));
        snapshot = List.copyOf(next);
    }

    private static final class Entry<E> {
        final NamespacedId id;
        final int priority;
        final long sequence;
        final Predicate<? super E> filter;
        final Consumer<? super E> listener;
        final AtomicInteger failures = new AtomicInteger();
        volatile boolean active = true;
        Entry(NamespacedId id, int priority, long sequence, Predicate<? super E> filter, Consumer<? super E> listener) {
            this.id = id; this.priority = priority; this.sequence = sequence;
            this.filter = filter; this.listener = listener;
        }
    }
}
