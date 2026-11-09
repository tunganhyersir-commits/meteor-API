/* SPDX-License-Identifier: GPL-3.0-only */
package dev.meteorapi.performance;
/** Controls when another unit of work may start; it cannot preempt a slow user action. */
public final class WorkBudget {
    private final long started = java.lang.System.nanoTime();
    private final long nanoseconds;
    private final int maximum;
    private int spent;
    public WorkBudget(long nanoseconds, int maximum) {
        if (nanoseconds < 0 || maximum < 0) throw new IllegalArgumentException("Negative work budget");
        this.nanoseconds = nanoseconds; this.maximum = maximum;
    }
    public boolean tryRun(Runnable action) {
        if (spent >= maximum || java.lang.System.nanoTime() - started >= nanoseconds) return false;
        spent++; action.run(); return true;
    }
    public int spent() { return spent; }
}
