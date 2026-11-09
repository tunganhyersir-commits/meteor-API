/*
 * This file is part of the Meteor Client distribution (https://github.com/MeteorDevelopment/meteor-client).
 * Copyright (c) Meteor Development.
 */

package dev.meteorapi.compat26.gui;

import meteordevelopment.meteorclient.gui.GuiTheme;
import meteordevelopment.meteorclient.gui.screens.settings.base.CollectionListSettingScreen;
import meteordevelopment.meteorclient.gui.widgets.WWidget;
import dev.meteorapi.compat26.settings.PacketListSetting;
import meteordevelopment.meteorclient.settings.Setting;
import dev.meteorapi.network.PacketUtils;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.PacketType;


import java.util.Set;
import java.util.function.Predicate;

public class PacketBoolSettingScreen extends CollectionListSettingScreen<PacketType<?>> {
    public PacketBoolSettingScreen(GuiTheme theme, Setting<Set<PacketType<?>>> setting) {
        super(theme, "Select Packets", setting, setting.get(), PacketUtils.getPackets());
    }

    @Override
    protected boolean includeValue(PacketType<?> value) {
        Predicate<PacketType<?>> filter = ((PacketListSetting) setting).filter;

        if (filter == null) return true;
        return filter.test(value);
    }

    @Override
    protected WWidget getValueWidget(PacketType<?> value) {
        return theme.label(value.toString());
    }

    @Override
    protected String[] getValueNames(PacketType<?> value) {
        return new String[]{
            value.toString()
        };
    }
}
