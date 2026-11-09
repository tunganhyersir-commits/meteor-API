/* SPDX-License-Identifier: GPL-3.0-only */
package dev.meteorapi.compat.client;

import dev.meteorlib.foundation.NameRules;
import dev.meteorlib.foundation.RegistrationResult;
import meteordevelopment.meteorclient.MeteorClient;
import meteordevelopment.meteorclient.systems.modules.Category;
import meteordevelopment.meteorclient.commands.Command;
import meteordevelopment.meteorclient.systems.hud.HudElementInfo;
import meteordevelopment.meteorclient.systems.modules.Module;

import java.util.Objects;
import java.util.function.Function;

/** Preferred API: provide the canonical Fabric addon id as owner, and names are scoped automatically. */
public final class AddonRegistry {
    private final String namespace;

    public AddonRegistry(String namespace) {
        NameRules.scoped(namespace, "validation");
        this.namespace = namespace;
    }

    public String name(String localName) { return NameRules.scoped(namespace, localName); }

    public <T extends Module> RegistrationResult<T> module(String localName, Function<String, T> factory) {
        return attempt(() -> {
        MeteorClientApi.requireClientThread();
        String name = name(localName);
        T module = Objects.requireNonNull(factory.apply(name), "module factory result");
        if (!module.name.equals(name)) throw new IllegalArgumentException("Module factory must use assigned name: " + name);
        for (String alias : module.aliases) requireOwned(alias);
        return Registry.module(module);
        });
    }

    public <T extends Command> RegistrationResult<T> command(String localName, Function<String, T> factory) {
        return attempt(() -> {
        MeteorClientApi.requireClientThread();
        String name = name(localName);
        T command = Objects.requireNonNull(factory.apply(name), "command factory result");
        if (!command.getName().equals(name)) throw new IllegalArgumentException("Command factory must use assigned name: " + name);
        for (String alias : command.getAliases()) requireOwned(alias);
        return Registry.command(command);
        });
    }

    public <T extends HudElementInfo<?>> RegistrationResult<T> hud(String localName, Function<String, T> factory) {
        return attempt(() -> {
        MeteorClientApi.requireClientThread();
        String name = name(localName);
        T info = Objects.requireNonNull(factory.apply(name), "HUD factory result");
        if (!info.name.equals(name)) throw new IllegalArgumentException("HUD factory must use assigned name: " + name);
        return Registry.hud(info);
        });
    }

    public RegistrationResult<Category> category(String localName) {
        return attempt(() -> {
            Category category = new Category(name(localName));
            Registry.category(category);
            return category;
        });
    }

    private <T> RegistrationResult<T> attempt(java.util.function.Supplier<T> action) {
        RegistrationResult<T> result = RegistrationResult.attempt(action);
        if (!result.success()) MeteorClient.LOG.warn("MeteorClientApi registration [{}] {}: {}", namespace, result.status(), result.message());
        return result;
    }

    private void requireOwned(String alias) {
        if (!alias.startsWith(namespace + ".")) throw new IllegalArgumentException("Alias must belong to " + namespace + ": " + alias);
        String local = alias.substring(namespace.length() + 1);
        NameRules.scoped(namespace, local);
    }
}
