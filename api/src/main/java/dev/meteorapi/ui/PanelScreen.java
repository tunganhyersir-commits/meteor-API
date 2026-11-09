/* SPDX-License-Identifier: GPL-3.0-only */
package dev.meteorapi.ui;

import dev.meteorapi.MeteorApi;
import dev.meteorapi.ui.internal.ListViewport;
import java.util.*;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.Element;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.client.gui.widget.TextFieldWidget;
import net.minecraft.client.input.KeyInput;
import net.minecraft.text.Text;

/** Searchable native form. Visibility precedes pagination; unfinished input survives rebuilding. */
public class PanelScreen extends Screen {
  private final Screen parent;
  private final List<Panels.Row> rows;
  private final Runnable onClose;
  private final String searchHint;
  private final Map<Panels.Field, TextFieldWidget> editors = new IdentityHashMap<>();
  private final Set<Panels.Field> invalidText = Collections.newSetFromMap(new IdentityHashMap<>());
  private final Map<Panels.Row, ButtonWidget> buttons = new IdentityHashMap<>();
  private final Set<Panels.Row> reported = Collections.newSetFromMap(new IdentityHashMap<>());
  private final Set<Panels.FileField> pendingFiles =
      Collections.newSetFromMap(new IdentityHashMap<>());
  private List<Panels.Row> visible = List.of();
  private ListViewport.Page<Panels.Row> page = new ListViewport.Page<>(List.of(), 0, 0);
  private TextFieldWidget search;
  private String query = "", feedback = "";
  private int scroll;
  private long attachment;
  private boolean attached, closing;

  /** Retained for subclasses compiled against the earlier constructor. */
  protected PanelScreen(String title, Screen parent, List<Panels.Row> rows, Runnable onClose) {
    this(title, parent, rows, onClose, null);
  }

  protected PanelScreen(
      String title, Screen parent, List<Panels.Row> rows, Runnable onClose, String searchHint) {
    super(Text.literal(title));
    this.parent = parent;
    this.rows = List.copyOf(rows);
    this.onClose = Objects.requireNonNull(onClose);
    this.searchHint = searchHint;
  }

  private int top() {
    return searchHint == null ? 48 : 80;
  }

  private int pageSize() {
    return Math.max(1, (height - top() - 65) / 28);
  }

  private int contentWidth() {
    return Math.max(1, Math.min(420, width - 24));
  }

  private int left() {
    return Math.max(0, (width - contentWidth()) / 2);
  }

  @Override
  protected void init() {
    attached = true;
    closing = false;
    attachment++;
    pendingFiles.clear();
    if (searchHint != null) {
      search =
          new TextFieldWidget(
              textRenderer, left(), 43, contentWidth(), 22, Text.literal(searchHint));
      search.setMaxLength(256);
      search.setPlaceholder(Text.literal(searchHint));
      search.setText(query);
      search.setChangedListener(
          value -> {
            query = value;
            scroll = 0;
            rebuild();
          });
    }
    visible = selectVisible();
    rebuild();
  }

  private List<Panels.Row> selectVisible() {
    List<Panels.Row> result = new ArrayList<>();
    for (Panels.Row row : rows) {
      try {
        boolean show =
            row instanceof Panels.Field f
                ? f.setting().isVisible()
                : row instanceof Panels.Toggle t
                    ? t.setting().isVisible()
                    : row instanceof Panels.FileField f
                        ? f.setting().isVisible()
                        : row instanceof Panels.Choice<?> c ? c.setting().isVisible() : true;
        if (show) result.add(row);
      } catch (RuntimeException error) {
        report(row, error);
      }
    }
    return List.copyOf(result);
  }

  private String label(Panels.Row row) {
    return switch (row) {
      case Panels.Label v -> v.text();
      case Panels.Action v -> v.text();
      case Panels.ConditionalAction v -> v.text();
      case Panels.Field v -> v.text();
      case Panels.Toggle v -> v.text();
      case Panels.FileField v -> v.text();
      case Panels.Choice<?> v -> v.text();
    };
  }

  private void rebuild() {
    Element focused = getFocused();
    clearChildren();
    buttons.clear();
    if (search != null) addDrawableChild(search);
    page = ListViewport.select(visible, row -> true, this::label, query, scroll, pageSize());
    scroll = page.offset();
    int x = left(), w = contentWidth(), y = top();
    for (Panels.Row row : page.items()) {
      if (row instanceof Panels.Action a) {
        buttons.put(
            row,
            addDrawableChild(
                ButtonWidget.builder(Text.literal(a.text()), b -> safely(a.action()))
                    .dimensions(x, y, w, 22)
                    .build()));
      } else if (row instanceof Panels.ConditionalAction a) {
        ButtonWidget b =
            addDrawableChild(
                ButtonWidget.builder(
                        Text.literal(a.text()),
                        ignored -> {
                          if (enabled(a)) safely(a.action());
                        })
                    .dimensions(x, y, w, 22)
                    .build());
        b.active = enabled(a);
        buttons.put(row, b);
      } else if (row instanceof Panels.Toggle t) {
        buttons.put(
            row,
            addDrawableChild(
                ButtonWidget.builder(
                        toggleText(t),
                        b ->
                            safely(
                                () -> {
                                  t.setting().set(!t.setting().get());
                                  b.setMessage(toggleText(t));
                                }))
                    .dimensions(x, y, w, 22)
                    .build()));
      } else if (row instanceof Panels.Field f) {
        int labelWidth = Math.min(185, w / 2);
        TextFieldWidget editor = editors.get(f);
        if (editor == null) {
          editor =
              new TextFieldWidget(
                  textRenderer,
                  x + labelWidth,
                  y,
                  Math.max(1, w - labelWidth),
                  22,
                  Text.literal(f.text()));
          editor.setMaxLength(16_384);
          editor.setText(f.setting().encode());
          TextFieldWidget owned = editor;
          editor.setChangedListener(
              text ->
                  safely(
                      () -> {
                        boolean valid = f.setting().parse(text);
                        if (valid) invalidText.remove(f);
                        else invalidText.add(f);
                        owned.setEditableColor(valid ? 0xFFFFFFFF : 0xFFFF8585);
                        feedback = valid ? "" : "Giá trị không hợp lệ: " + f.text();
                      }));
          editors.put(f, editor);
        }
        editor.setX(x + labelWidth);
        editor.setY(y);
        editor.setWidth(Math.max(1, w - labelWidth));
        addDrawableChild(editor);
      } else if (row instanceof Panels.FileField f) {
        ButtonWidget b =
            addDrawableChild(
                ButtonWidget.builder(fileText(f), ignored -> pickFile(f))
                    .dimensions(x, y, w, 22)
                    .build());
        b.active = !pendingFiles.contains(f);
        buttons.put(row, b);
      } else if (row instanceof Panels.Choice<?> c) {
        buttons.put(
            row,
            addDrawableChild(
                ButtonWidget.builder(
                        choiceText(c),
                        b ->
                            safely(
                                () -> {
                                  cycle(c);
                                  b.setMessage(choiceText(c));
                                }))
                    .dimensions(x, y, w, 22)
                    .build()));
      }
      y += 28;
    }
    int bottom = Math.max(top() + 28, height - 36), done = Math.min(100, w);
    if (w >= 200) {
      ButtonWidget up =
          addDrawableChild(
              ButtonWidget.builder(Text.literal("↑"), b -> shift(-pageSize()))
                  .dimensions(x, bottom, 40, 22)
                  .build());
      ButtonWidget down =
          addDrawableChild(
              ButtonWidget.builder(Text.literal("↓"), b -> shift(pageSize()))
                  .dimensions(x + 46, bottom, 40, 22)
                  .build());
      up.active = scroll > 0;
      down.active = scroll + pageSize() < page.total();
    }
    addDrawableChild(
        ButtonWidget.builder(Text.literal("Xong"), b -> close())
            .dimensions(x + w - done, bottom, done, 22)
            .build());
    if (focused != null && children().contains(focused)) setFocused(focused);
  }

  private boolean enabled(Panels.ConditionalAction a) {
    try {
      return a.enabled().getAsBoolean();
    } catch (RuntimeException error) {
      report(a, error);
      return false;
    }
  }

  private Text toggleText(Panels.Toggle t) {
    return Text.literal(t.text() + ": " + (t.setting().get() ? "Bật" : "Tắt"));
  }

  private Text fileText(Panels.FileField f) {
    var path = f.setting().get();
    return Text.literal(
        f.text() + ": " + (path == null ? "Chọn tệp" : String.valueOf(path.getFileName())));
  }

  private Text choiceText(Panels.Choice<?> c) {
    return Text.literal(
        c.text() + ": " + dev.meteorlib.foundation.NameRules.displayName(c.setting().get().name()));
  }

  private static <E extends Enum<E>> void cycle(Panels.Choice<E> c) {
    c.setting()
        .set(c.values().get((c.values().indexOf(c.setting().get()) + 1) % c.values().size()));
  }

  private void pickFile(Panels.FileField f) {
    if (!pendingFiles.add(f)) return;
    long generation = attachment;
    buttons.get(f).active = false;
    FileDialogs.openFile(f.extensions())
        .whenComplete(
            (selected, error) ->
                MeteorApi.execute(
                    () -> {
                      if (!attached || generation != attachment || client.currentScreen != this)
                        return;
                      pendingFiles.remove(f);
                      if (error != null) {
                        feedback = "Không mở được hộp chọn tệp";
                        MeteorApi.LOG.warn(feedback, error);
                      } else
                        selected.ifPresent(
                            path -> {
                              if (!f.setting().set(path)) feedback = "Tệp không hợp lệ";
                            });
                      rebuild();
                    }));
  }

  private void safely(Runnable action) {
    try {
      action.run();
    } catch (RuntimeException error) {
      feedback = "Thao tác thất bại; xem log";
      MeteorApi.LOG.warn("Panel action failed", error);
    }
  }

  private void report(Panels.Row row, RuntimeException error) {
    feedback = "Không đọc được trạng thái cài đặt; xem log";
    if (reported.add(row)) MeteorApi.LOG.warn("Panel condition failed: {}", label(row), error);
  }

  private void shift(int amount) {
    scroll = Math.max(0, scroll + amount);
    rebuild();
  }

  @Override
  public void tick() {
    super.tick();
    List<Panels.Row> next = selectVisible();
    if (!next.equals(visible)) {
      visible = next;
      rebuild();
    }
    editors.forEach(
        (field, editor) -> {
          if (editor.isFocused() || invalidText.contains(field) || !children().contains(editor))
            return;
          try {
            String current = field.setting().encode();
            if (!current.equals(editor.getText())) editor.setText(current);
          } catch (RuntimeException error) {
            report(field, error);
          }
        });
    buttons.forEach(
        (row, b) -> {
          if (row instanceof Panels.ConditionalAction a) b.active = enabled(a);
          else if (row instanceof Panels.Toggle t) b.setMessage(toggleText(t));
          else if (row instanceof Panels.Choice<?> c) b.setMessage(choiceText(c));
        });
  }

  @Override
  public boolean mouseScrolled(double x, double y, double horizontal, double vertical) {
    if (vertical == 0) return super.mouseScrolled(x, y, horizontal, vertical);
    shift(vertical > 0 ? -1 : 1);
    return true;
  }

  @Override
  public boolean keyPressed(KeyInput key) {
    if (key.key() == 266 || key.key() == 267) {
      shift(key.key() == 266 ? -pageSize() : pageSize());
      return true;
    }
    return super.keyPressed(key);
  }

  @Override
  public void render(DrawContext context, int mouseX, int mouseY, float delta) {
    context.fill(0, 0, width, height, 0xED101010);
    context.drawCenteredTextWithShadow(textRenderer, title, width / 2, 18, 0xFFF1F1F1);
    int y = top() + 7;
    for (Panels.Row row : page.items()) {
      if (row instanceof Panels.Label v)
        context.drawTextWithShadow(
            textRenderer,
            textRenderer.trimToWidth(v.text(), contentWidth()),
            left(),
            y,
            0xFFBEBEBE);
      else if (row instanceof Panels.Field v)
        context.drawTextWithShadow(
            textRenderer,
            textRenderer.trimToWidth(v.text(), Math.max(1, Math.min(175, contentWidth() / 2 - 5))),
            left(),
            y,
            0xFFE2E2E2);
      y += 28;
    }
    if (page.total() == 0)
      context.drawCenteredTextWithShadow(
          textRenderer, Text.literal("Không có mục phù hợp"), width / 2, top() + 8, 0xFFBEBEBE);
    if (!feedback.isEmpty())
      context.drawTextWithShadow(
          textRenderer,
          textRenderer.trimToWidth(feedback, contentWidth()),
          left(),
          height - 52,
          0xFFFFB18A);
    super.render(context, mouseX, mouseY, delta);
  }

  @Override
  public boolean shouldPause() {
    return false;
  }

  @Override
  public void removed() {
    attached = false;
    attachment++;
    pendingFiles.clear();
    super.removed();
  }

  @Override
  public void close() {
    if (closing) return;
    closing = true;
    attached = false;
    attachment++;
    safely(onClose);
    if (client != null && client.currentScreen == this) client.setScreen(parent);
  }
}
