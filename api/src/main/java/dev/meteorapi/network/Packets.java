/* SPDX-License-Identifier: GPL-3.0-only */
package dev.meteorapi.network;

import dev.meteorapi.event.BoundedMailbox;
import dev.meteorapi.event.EventChannel;
import dev.meteorlib.foundation.NamespacedId;
import dev.meteorlib.foundation.Registration;
import dev.meteorlib.foundation.RegistrationResult;
import net.minecraft.network.ClientConnection;
import net.minecraft.network.packet.Packet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Consumer;
import java.util.function.Predicate;

/** Observes this client's decoded Minecraft packets, without canceling or rewriting protocol traffic. */
public final class Packets {
    public enum Phase { SEND, ENQUEUED, RECEIVE, DISCONNECT, ERROR }
    /** Raw callbacks run on the original calling thread; do not retain or modify packet/connection objects. */
    public record Event(Phase phase, Packet<?> packet, ClientConnection connection, Throwable error, Snapshot snapshot) {}
    /** Immutable metadata for delayed client-thread listeners; contains no packet buffer, payload or address. */
    public record Snapshot(long sequence, long nanoTime, Phase phase, String packetClass, String thread) {}
    public record Statistics(long sendAttempts, long enqueued, long received, long errors, long droppedSnapshots, int observers) {}

    private static final AtomicLong SEQUENCE = new AtomicLong();
    private static final AtomicLong SEND = new AtomicLong(), ENQUEUED = new AtomicLong(), RECEIVE = new AtomicLong(), ERRORS = new AtomicLong();
    private static final EventChannel<Event> RAW = channel();
    private static final EventChannel<Snapshot> CLIENT = channel();
    private static final BoundedMailbox<Snapshot> MAILBOX = new BoundedMailbox<>(2048);
    private Packets() {}

    private static <T> EventChannel<T> channel() {
        return new EventChannel<>(3, (id, failure) -> dev.meteorapi.MeteorApi.LOG.warn("Packet observer {} failed", id, failure));
    }
    public static RegistrationResult<Registration> listen(NamespacedId id, Predicate<Event> filter, Consumer<Event> listener) {
        return RAW.listen(id, 0, filter, listener);
    }
    public static RegistrationResult<Registration> onClient(NamespacedId id, Consumer<Snapshot> listener) {
        return CLIENT.listen(id, listener);
    }
    public static <P extends Packet<?>> RegistrationResult<Registration> typed(NamespacedId id, Phase phase, Class<P> type, Consumer<P> listener) {
        return listen(id, event -> event.phase == phase && type.isInstance(event.packet), event -> listener.accept(type.cast(event.packet)));
    }
    public static Statistics statistics() {
        return new Statistics(SEND.get(), ENQUEUED.get(), RECEIVE.get(), ERRORS.get(), MAILBOX.dropped(), RAW.size() + CLIENT.size());
    }
    /** Internal mixin boundary. Only client-side connections are visible, even in an integrated server. */
    public static void observe(Phase phase, Packet<?> packet, ClientConnection connection, Throwable error) {
        if (connection.getSide() != net.minecraft.network.NetworkSide.CLIENTBOUND) return;
        switch (phase) {
            case SEND -> SEND.incrementAndGet();
            case ENQUEUED -> ENQUEUED.incrementAndGet();
            case RECEIVE -> RECEIVE.incrementAndGet();
            case ERROR -> ERRORS.incrementAndGet();
            default -> { }
        }
        if (RAW.size() == 0 && CLIENT.size() == 0) return;
        Snapshot snapshot = new Snapshot(SEQUENCE.incrementAndGet(), java.lang.System.nanoTime(), phase,
            packet == null ? "" : packet.getClass().getName(), Thread.currentThread().getName());
        RAW.post(new Event(phase, packet, connection, error, snapshot));
        if (CLIENT.size() > 0) MAILBOX.offer(snapshot);
    }
    public static void drainClient() { MAILBOX.drain(256, CLIENT::post); }
}
