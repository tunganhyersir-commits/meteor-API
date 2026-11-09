/* SPDX-License-Identifier: GPL-3.0-only */
package dev.meteorapi.compat.client;

import meteordevelopment.meteorclient.commands.Command;
import meteordevelopment.meteorclient.commands.Commands;
import meteordevelopment.meteorclient.systems.hud.HudElementInfo;
import meteordevelopment.meteorclient.systems.modules.Category;
import meteordevelopment.meteorclient.systems.modules.Module;
import meteordevelopment.meteorclient.systems.modules.Modules;

import java.util.Objects;

/** Rejects accidental replacement. Legacy registration methods remain available for intentional replacement. */
public final class Registry {
    private Registry() {}

    /** Only legal inside MeteorAddon.onRegisterCategories(), as required by upstream. */
    public static void category(Category category) {
        MeteorClientApi.requireClientThread();
        Objects.requireNonNull(category, "category");
        java.util.List<String> names = new java.util.ArrayList<>();
        for (Category existing : Modules.loopCategories()) {
            if (existing == category) return;
            names.add(existing.name);
        }
        dev.meteorlib.foundation.NameRules.requireCategoryDistinct(category.name, names);
        Modules.registerCategory(category);
    }

    public static <T extends Module> T module(T module) {
        Objects.requireNonNull(module, "module");
        Modules modules = MeteorClientApi.modules();
        if (modules.get(module.getClass()) == module) return module;
        if (modules.get(module.getClass()) != null || modules.get(module.name) != null)
            throw new dev.meteorlib.foundation.RegistrationConflictException("Duplicate module class or name: " + module.name);
        java.util.List<String> newNames = new java.util.ArrayList<>(java.util.List.of(module.aliases));
        newNames.add(module.name);
        dev.meteorlib.foundation.NameRules.requireDistinct(newNames);
        for (Module existing : modules.getAll()) {
            java.util.List<String> oldNames = new java.util.ArrayList<>(java.util.List.of(existing.aliases));
            oldNames.add(existing.name);
            dev.meteorlib.foundation.NameRules.rejectOverlap(newNames, oldNames, "module");
        }
        modules.add(module);
        return module;
    }

    public static <T extends Command> T command(T command) {
        MeteorClientApi.requireClientThread();
        Objects.requireNonNull(command, "command");
        dev.meteorlib.foundation.NameRules.requireDistinct(names(command));
        for (Command existing : Commands.COMMANDS) {
            if (existing == command) return command;
            dev.meteorlib.foundation.NameRules.rejectOverlap(names(command), names(existing), "command");
        }
        Commands.add(command);
        return command;
    }

    private static java.util.List<String> names(Command command) {
        java.util.List<String> names = new java.util.ArrayList<>(command.getAliases());
        names.add(command.getName());
        return names;
    }

    public static <T extends HudElementInfo<?>> T hud(T info) {
        Objects.requireNonNull(info, "info");
        if (MeteorClientApi.hud().infos.get(info.name) == info) return info;
        for (String name : MeteorClientApi.hud().infos.keySet()) {
            if (name.equalsIgnoreCase(info.name)) throw new dev.meteorlib.foundation.RegistrationConflictException("HUD already registered: " + info.name);
        }
        MeteorClientApi.hud().register(info);
        return info;
    }
}
