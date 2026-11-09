/*
 * This file is part of the Meteor Client distribution (https://github.com/MeteorDevelopment/meteor-client).
 * Copyright (c) Meteor Development.
 */

package dev.meteorapi.compat26.gui;

import meteordevelopment.meteorclient.gui.widgets.input.WTextBox;

import meteordevelopment.meteorclient.gui.widgets.containers.WHorizontalList;

public class WLongEdit extends WHorizontalList {
    private long value;

    public final long min, max;

    public Runnable action;
    public Runnable actionOnRelease;

    private WTextBox textBox;

    public WLongEdit(long value, long min, long max) {
        this.value = value;
        this.min = min;
        this.max = max;
    }

    @Override
    public void init() {
        textBox = add(theme.textBox(Long.toString(value), this::filter)).minWidth(75).expandX().widget();

        textBox.actionOnUnfocused = () -> {
            long lastValue = value;

            if (textBox.get().isEmpty() || textBox.get().equals("-")) {
                value = Math.clamp(0L, min, max);
            } else {
                try {
                    long parsed = Long.parseLong(textBox.get().trim());
                    value = Math.clamp(parsed, min, max);
                } catch (NumberFormatException ignored) {
                    // Retain current value if input cannot be parsed as a long
                }
            }

            textBox.set(Long.toString(value));

            if (value != lastValue) {
                if (action != null) action.run();
                if (actionOnRelease != null) actionOnRelease.run();
            }
        };
    }

    private boolean filter(String text, char c) {
        // 1.21.11 keeps WTextBox.cursor protected. Validate the complete value on commit,
        // allowing negative numbers and cursor edits without reflection or invasive accessors.
        return (c == '-' && !text.contains("-")) || (c >= '0' && c <= '9');
    }

    public long get() {
        return value;
    }

    public void set(long value) {
        this.value = Math.clamp(value, min, max);
        if (textBox != null) textBox.set(Long.toString(this.value));
    }
}
