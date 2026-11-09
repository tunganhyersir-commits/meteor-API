/*
 * This file is part of the Meteor Client distribution (https://github.com/MeteorDevelopment/meteor-client).
 * Copyright (c) Meteor Development.
 */

package dev.meteorapi.compat26.settings;
import meteordevelopment.meteorclient.settings.*;

import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import dev.meteorapi.network.PacketUtils;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.nbt.NbtList;
import net.minecraft.nbt.NbtString;
import net.minecraft.nbt.NbtElement;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.NetworkSide;
import net.minecraft.network.packet.PacketType;


import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PacketListSetting extends Setting<Set<PacketType<?>>> {
    public final Predicate<PacketType<?>> filter;

    public PacketListSetting(String name, String description, Set<PacketType<?>> defaultValue, Consumer<Set<PacketType<?>>> onChanged, Consumer<Setting<Set<PacketType<?>>>> onModuleActivated, Predicate<PacketType<?>> filter, IVisible visible) {
        super(name, description, defaultValue, onChanged, onModuleActivated, visible);

        this.filter = filter;
    }

    @Override
    public void resetImpl() {
        value = new ObjectOpenHashSet<>(defaultValue);
    }

    @Override
    protected Set<PacketType<?>> parseImpl(String str) {
        String[] values = str.split(",");
        Set<PacketType<?>> packets = new ObjectOpenHashSet<>(values.length);

        try {
            for (String value : values) {
                PacketType<?> packet = PacketUtils.getPacket(value.trim());
                if (packet != null && (filter == null || filter.test(packet))) packets.add(packet);
            }
        } catch (Exception ignored) {
        }

        return packets;
    }

    @Override
    protected boolean isValueValid(Set<PacketType<?>> value) {
        return true;
    }

    @Override
    public java.util.List<String> getSuggestions() {
        return filter == null
            ? PacketUtils.getPackets().stream().map(PacketType::toString).toList()
            : PacketUtils.getPackets().stream().filter(filter).map(PacketType::toString).toList();
    }

    @Override
    public NbtCompound save(NbtCompound tag) {
        NbtList valueTag = new NbtList();
        for (PacketType<?> packet : get()) {
            valueTag.add(NbtString.of(packet.toString()));
        }
        tag.put("value", valueTag);

        return tag;
    }

    @Override
    public Set<PacketType<?>> load(NbtCompound tag) {
        get().clear();

        NbtElement valueTag = tag.get("value");
        if (valueTag instanceof NbtList listTag) {
            for (NbtElement t : listTag) {
                PacketType<?> packet = PacketUtils.getPacket(t.asString().orElse(""));
                if (packet != null && (filter == null || filter.test(packet))) get().add(packet);
            }
        }

        return get();
    }

    public static class Builder extends SettingBuilder<Builder, Set<PacketType<?>>, PacketListSetting> {
        private Predicate<PacketType<?>> filter;

        public Builder() {
            super(new ObjectOpenHashSet<>(0));
        }

        public Builder filter(Predicate<PacketType<?>> filter) {
            this.filter = filter;
            return this;
        }

        public Builder clientbound() {
            return filter(type -> type.side() == NetworkSide.CLIENTBOUND);
        }

        public Builder serverbound() {
            return filter(type -> type.side() == NetworkSide.SERVERBOUND);
        }

        @Override
        public PacketListSetting build() {
            return new PacketListSetting(name, description, defaultValue, onChanged, onModuleActivated, filter, visible);
        }
    }
}
