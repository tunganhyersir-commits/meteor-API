/* SPDX-License-Identifier: GPL-3.0-only */
package dev.meteorapi.performance;
import dev.meteorlib.foundation.NamespacedId;
import dev.meteorlib.foundation.Registration;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.LongAdder;
/** Lightweight aggregate measurements, namespaced per client. No per-frame history allocations. */
public final class Profiler {
    public record Sample(long count, long totalNanoseconds, long maximumNanoseconds) {
        public double averageNanoseconds() { return count == 0 ? 0 : (double) totalNanoseconds / count; }
    }
    private final Map<NamespacedId, Counter> counters = new ConcurrentHashMap<>();
    public Registration measure(NamespacedId id) {
        Counter counter = counters.computeIfAbsent(id, key -> new Counter());
        long start = java.lang.System.nanoTime();
        return Registration.once(() -> {
            long elapsed = java.lang.System.nanoTime() - start;
            counter.count.increment(); counter.total.add(elapsed); counter.max.accumulateAndGet(elapsed, Math::max);
        });
    }
    public Map<NamespacedId, Sample> snapshot() {
        Map<NamespacedId, Sample> values = new java.util.LinkedHashMap<>();
        counters.forEach((id, counter) -> values.put(id, new Sample(counter.count.sum(), counter.total.sum(), counter.max.get())));
        return Map.copyOf(values);
    }
    public void clear() { counters.clear(); }
    private static final class Counter { final LongAdder count = new LongAdder(), total = new LongAdder(); final AtomicLong max = new AtomicLong(); }
}
