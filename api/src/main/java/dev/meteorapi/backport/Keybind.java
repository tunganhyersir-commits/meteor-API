/*
 * This file is part of the Meteor Client distribution (https://github.com/MeteorDevelopment/meteor-client).
 * Copyright (c) Meteor Development.
 */

package dev.meteorapi.backport;

import net.minecraft.client.util.InputUtil;
import net.minecraft.client.MinecraftClient;
import org.lwjgl.glfw.GLFW;

import net.minecraft.client.input.KeyInput;
import net.minecraft.client.input.MouseInput;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.nbt.NbtList;
import net.minecraft.nbt.NbtString;

import java.util.*;

public class Keybind {
    public enum Modifier {
        SHIFT(GLFW.GLFW_MOD_SHIFT),
        CONTROL(GLFW.GLFW_MOD_CONTROL),
        ALT(GLFW.GLFW_MOD_ALT),
        SUPER(GLFW.GLFW_MOD_SUPER),
        CAPS_LOCK(GLFW.GLFW_MOD_CAPS_LOCK),
        NUM_LOCK(GLFW.GLFW_MOD_NUM_LOCK),
        ;

        private static final Modifier[] VALUES = values();

        public final int mask;

        Modifier(int mask) {
            this.mask = mask;
        }

        public boolean isKeyPressed() {
            return switch (this) {
                case CONTROL -> Keybind.isKeyPressed(GLFW.GLFW_KEY_LEFT_CONTROL) || Keybind.isKeyPressed(GLFW.GLFW_KEY_RIGHT_CONTROL);
                case SUPER -> Keybind.isKeyPressed(GLFW.GLFW_KEY_LEFT_SUPER) || Keybind.isKeyPressed(GLFW.GLFW_KEY_RIGHT_SUPER);
                case ALT -> Keybind.isKeyPressed(GLFW.GLFW_KEY_LEFT_ALT) || Keybind.isKeyPressed(GLFW.GLFW_KEY_RIGHT_ALT);
                case SHIFT -> Keybind.isKeyPressed(GLFW.GLFW_KEY_LEFT_SHIFT) || Keybind.isKeyPressed(GLFW.GLFW_KEY_RIGHT_SHIFT);
                case CAPS_LOCK -> Keybind.isKeyPressed(GLFW.GLFW_KEY_CAPS_LOCK);
                case NUM_LOCK -> Keybind.isKeyPressed(GLFW.GLFW_KEY_NUM_LOCK);
            };
        }

        private static EnumSet<Modifier> fromRawValue(int modifiers) {
            var result = EnumSet.noneOf(Modifier.class);
            for (var mod : VALUES) {
                if ((mod.mask & modifiers) != 0) result.add(mod);
            }
            return result;
        }
    }

    public InputUtil.Key key;
    private final EnumSet<Modifier> modifiers = EnumSet.noneOf(Modifier.class);

    private Keybind(InputUtil.Key key, Collection<Modifier> modifiers) {
        this.key = key;
        this.modifiers.addAll(modifiers);
    }

    public static Keybind none() {
        return new Keybind(InputUtil.UNKNOWN_KEY, Set.of());
    }

    public static Keybind fromKey(InputUtil.Key key) {
        return new Keybind(key, Set.of());
    }

    public static Keybind fromKey(int key) {
        return fromKey(keyboard(key));
    }

    public static Keybind fromKeys(InputUtil.Key key, Collection<Modifier> modifiers) {
        return new Keybind(key, modifiers);
    }

    public static Keybind fromKeys(InputUtil.Key key, Modifier... modifiers) {
        return fromKeys(key, Arrays.asList(modifiers));
    }

    public static Keybind fromKeys(int key, int modifiers) {
        return fromKeys(keyboard(key), Modifier.fromRawValue(modifiers));
    }

    public static Keybind fromButton(int button) {
        return fromKey(mouse(button));
    }

    public boolean isSet() {
        return !key.equals(InputUtil.UNKNOWN_KEY);
    }

    public boolean isKey() {
        return key.getCategory() != InputUtil.Type.MOUSE;
    }

    public boolean hasMods() {
        return !modifiers.isEmpty();
    }

    public int getValue() {
        return key.getCode();
    }

    public void set(InputUtil.Key key, Collection<Modifier> modifiers) {
        this.key = key;
        this.modifiers.clear();
        this.modifiers.addAll(modifiers);
    }

    public void set(InputUtil.Key key, Modifier... modifiers) {
        set(key, Arrays.asList(modifiers));
    }

    public void set(boolean isKey, int value, int modifiers) {
        set(isKey ? keyboard(value) : mouse(value), isKey ? Modifier.fromRawValue(modifiers) : Set.of());
    }

    public Keybind set(Keybind value) {
        set(value.key, value.modifiers);

        return this;
    }

    public void reset() {
        set(InputUtil.UNKNOWN_KEY, Set.of());
    }

    public boolean canBindTo(InputUtil.Key key, Collection<Modifier> modifiers) {
        if (key.getCategory() != InputUtil.Type.MOUSE) {
            if (!modifiers.isEmpty() && isKeyMod(key)) return false;
            return !key.equals(InputUtil.UNKNOWN_KEY) && !key.equals(keyboard(GLFW.GLFW_KEY_ESCAPE));
        }

        return !key.equals(mouse(GLFW.GLFW_MOUSE_BUTTON_LEFT)) && !key.equals(mouse(GLFW.GLFW_MOUSE_BUTTON_RIGHT));
    }

    public boolean canBindTo(boolean isKey, int value, int modifiers) {
        return canBindTo(isKey ? keyboard(value) : mouse(value), isKey ? Modifier.fromRawValue(modifiers) : Set.of());
    }

    public boolean matches(InputUtil.Key key, Set<Modifier> modifiers) {
        if (!isSet() || !this.key.equals(key)) return false;
        // Modifiers held for other reasons (sneaking, sprinting, or the bound key being a modifier
        // itself, which sets its own bit on press) must not stop a bind without modifiers from
        // matching. Binds that do have modifiers take precedence, see Modules#onAction.
        return !hasMods() || this.modifiers.equals(modifiers);
    }

    public boolean matches(boolean isKey, int value, int modifiers) {
        return matches(isKey ? keyboard(value) : mouse(value), isKey ? Modifier.fromRawValue(modifiers) : Set.of());
    }

    public boolean matches(KeyInput input) {
        return matches(InputUtil.fromKeyCode(input), Modifier.fromRawValue(input.modifiers()));
    }

    public boolean matches(MouseInput input) {
        return matches(mouse(input.button()), Set.of());
    }

    public boolean isPressed() {
        if (key.getCategory() == InputUtil.Type.MOUSE) return isButtonPressed(key.getCode());

        return modifiersPressed() && isKeyPressed(key.getCode());
    }

    private boolean modifiersPressed() {
        if (!hasMods()) return true;

        for (Modifier modifier : modifiers) {
            if (!modifier.isKeyPressed()) return false;
        }

        return true;
    }

    private boolean isKeyMod(InputUtil.Key key) {
        return key.getCode() >= GLFW.GLFW_KEY_LEFT_ALT && key.getCode() <= GLFW.GLFW_KEY_RIGHT_SUPER;
    }

    public Keybind copy() {
        return new Keybind(key, modifiers);
    }

    @Override
    public String toString() {
        if (!isSet()) return "None";
        if (key.getCategory() == InputUtil.Type.MOUSE) return key.getLocalizedText().getString();
        if (modifiers.isEmpty()) return key.getLocalizedText().getString();

        StringBuilder label = new StringBuilder();
        if (modifiers.contains(Modifier.CONTROL)) label.append("Ctrl + ");
        if (modifiers.contains(Modifier.SUPER)) label.append("Cmd + ");
        if (modifiers.contains(Modifier.ALT)) label.append("Alt + ");
        if (modifiers.contains(Modifier.SHIFT)) label.append("Shift + ");
        if (modifiers.contains(Modifier.CAPS_LOCK)) label.append("Caps Lock + ");
        if (modifiers.contains(Modifier.NUM_LOCK)) label.append("Num Lock + ");
        label.append(key.getLocalizedText().getString());

        return label.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Keybind keybind = (Keybind) o;
        return key.equals(keybind.key) && modifiers.equals(keybind.modifiers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, modifiers);
    }

    // Serialization

    public NbtCompound toTag() {
        NbtCompound tag = new NbtCompound();

        tag.putString("key", key.getTranslationKey());

        NbtList modifiersTag = new NbtList();
        for (Modifier modifier : modifiers) {
            modifiersTag.add(NbtString.of(modifier.name()));
        }
        tag.put("modifiers", modifiersTag);

        return tag;
    }

    public Keybind fromTag(NbtCompound tag) {
        if (tag.contains("key")) {
            // New format: key name + modifier enum names
            try {
                key = InputUtil.fromTranslationKey(tag.getString("key", ""));
            } catch (IllegalArgumentException e) {
                key = InputUtil.UNKNOWN_KEY;
            }

            modifiers.clear();
            NbtList modifiersTag = tag.getListOrEmpty("modifiers");
            for (int i = 0; i < modifiersTag.size(); i++) {
                try {
                    modifiers.add(Modifier.valueOf(modifiersTag.getString(i, "")));
                } catch (IllegalArgumentException ignored) {
                }
            }
        } else {
            // Legacy format: raw ints (GLFW)
            boolean isKey = tag.getBoolean("isKey", true);
            int value = tag.getInt("value", InputUtil.UNKNOWN_KEY.getCode());
            int mods = tag.getInt("modifiers", 0);

            set(isKey ? keyboard(value) : mouse(value), isKey ? Modifier.fromRawValue(mods) : Set.of());
        }

        return this;
    }

    private static boolean isKeyPressed(int key) {
        dev.meteorapi.MeteorApi.requireClientThread();
        return InputUtil.isKeyPressed(MinecraftClient.getInstance().getWindow(), key);
    }
    private static boolean isButtonPressed(int button) {
        dev.meteorapi.MeteorApi.requireClientThread();
        return GLFW.glfwGetMouseButton(MinecraftClient.getInstance().getWindow().getHandle(), button) == GLFW.GLFW_PRESS;
    }
    private static InputUtil.Key keyboard(int key) {
        return InputUtil.Type.KEYSYM.createFromCode(key);
    }

    private static InputUtil.Key mouse(int button) {
        return InputUtil.Type.MOUSE.createFromCode(button);
    }

}
