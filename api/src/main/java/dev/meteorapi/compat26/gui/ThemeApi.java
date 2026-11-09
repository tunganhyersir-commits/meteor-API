/* SPDX-License-Identifier: GPL-3.0-only */
package dev.meteorapi.compat26.gui;
import meteordevelopment.meteorclient.gui.GuiTheme;
/** Additive theme extensions. All original GuiTheme methods remain available on the same object. */
public final class ThemeApi {
    private ThemeApi() {}
    public static WLongEdit longEdit(GuiTheme theme, long value, long min, long max) {
        WLongEdit widget = new WLongEdit(value, min, max); widget.theme = theme; return widget;
    }
}
