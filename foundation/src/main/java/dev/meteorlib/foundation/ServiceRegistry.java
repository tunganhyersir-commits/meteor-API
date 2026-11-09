/* SPDX-License-Identifier: GPL-3.0-only */
package dev.meteorlib.foundation;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

/** Typed services. Revoking an old registration cannot remove its replacement. */
public final class ServiceRegistry {
    private final Map<Class<?>, Object> services = new HashMap<>();

    public synchronized <T> Registration register(Class<T> type, T service) {
        Objects.requireNonNull(type, "type");
        Objects.requireNonNull(service, "service");
        if (!type.isInstance(service)) throw new IllegalArgumentException("Service has the wrong type");
        if (services.putIfAbsent(type, service) != null)
            throw new IllegalStateException("Service already registered: " + type.getName());
        return Registration.once(() -> remove(type, service));
    }

    public synchronized <T> Optional<T> find(Class<T> type) {
        return Optional.ofNullable(type.cast(services.get(Objects.requireNonNull(type, "type"))));
    }

    public <T> T require(Class<T> type) {
        return find(type).orElseThrow(() -> new IllegalStateException("Missing service: " + type.getName()));
    }

    private synchronized void remove(Class<?> type, Object service) {
        if (services.get(type) == service) services.remove(type);
    }
}
