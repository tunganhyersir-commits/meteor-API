/* SPDX-License-Identifier: GPL-3.0-only */
package dev.meteorapi.ui;

import dev.meteorapi.MeteorApi;
import dev.meteorapi.setting.Setting;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.BooleanSupplier;
import net.minecraft.client.gui.screen.Screen;

/**
 * Declarative vanilla screens. Returned Screens remain extensible through ordinary Minecraft APIs.
 */
public final class Panels {
  private Panels() {}

  public static Builder create(String title) {
    return new Builder(title);
  }

  public sealed interface Row
      permits Label, Action, ConditionalAction, Field, Toggle, FileField, Choice {}

  public record Label(String text) implements Row {}

  public record Action(String text, Runnable action) implements Row {
    public Action {
      Objects.requireNonNull(text);
      Objects.requireNonNull(action);
    }
  }

  public record ConditionalAction(String text, BooleanSupplier enabled, Runnable action)
      implements Row {
    public ConditionalAction {
      Objects.requireNonNull(text);
      Objects.requireNonNull(enabled);
      Objects.requireNonNull(action);
    }
  }

  public record Field(String text, Setting<?> setting) implements Row {}

  public record Toggle(String text, Setting<Boolean> setting) implements Row {}

  public record FileField(String text, Setting<Path> setting, String extensions) implements Row {}

  public record Choice<E extends Enum<E>>(String text, Setting<E> setting, List<E> values)
      implements Row {
    public Choice {
      Objects.requireNonNull(text);
      Objects.requireNonNull(setting);
      values = List.copyOf(values);
      if (values.isEmpty() || !values.contains(setting.get()))
        throw new IllegalArgumentException("Invalid enum choices");
    }
  }

  public static final class Builder {
    private final String title;
    private final List<Row> rows = new ArrayList<>();
    private Runnable onClose = () -> {};
    private String searchHint;

    private Builder(String title) {
      this.title = java.util.Objects.requireNonNull(title);
    }

    public Builder label(String text) {
      rows.add(new Label(text));
      return this;
    }

    public Builder button(String text, Runnable action) {
      rows.add(new Action(text, action));
      return this;
    }

    public Builder button(String text, BooleanSupplier enabled, Runnable action) {
      rows.add(new ConditionalAction(text, enabled, action));
      return this;
    }

    public Builder field(String text, Setting<?> setting) {
      rows.add(new Field(text, setting));
      return this;
    }

    public Builder toggle(String text, Setting<Boolean> setting) {
      rows.add(new Toggle(text, setting));
      return this;
    }

    public Builder file(String text, Setting<Path> setting, String extensions) {
      rows.add(new FileField(text, setting, extensions));
      return this;
    }

    public <E extends Enum<E>> Builder choice(String text, Setting<E> setting, Class<E> type) {
      rows.add(new Choice<>(text, setting, java.util.Arrays.asList(type.getEnumConstants())));
      return this;
    }

    public Builder searchable(String hint) {
      searchHint = Objects.requireNonNull(hint);
      return this;
    }

    public Builder onClose(Runnable action) {
      onClose = action;
      return this;
    }

    public Screen build(Screen parent) {
      MeteorApi.requireClientThread();
      return new PanelScreen(title, parent, List.copyOf(rows), onClose, searchHint);
    }
  }
}
