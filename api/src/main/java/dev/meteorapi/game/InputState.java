/* SPDX-License-Identifier: GPL-3.0-only */
package dev.meteorapi.game;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import org.lwjgl.glfw.GLFW;
public final class InputState {
    private InputState() {}
    public static boolean keyDown(int key) { return key >= 0 && key <= GLFW.GLFW_KEY_LAST && InputUtil.isKeyPressed(GameAccess.client().getWindow(), key); }
    public static boolean mouseDown(int button) { return button >= 0 && button <= GLFW.GLFW_MOUSE_BUTTON_LAST && GLFW.glfwGetMouseButton(GameAccess.client().getWindow().getHandle(), button) == GLFW.GLFW_PRESS; }
    public static void pressed(KeyBinding binding, boolean pressed) { GameAccess.client(); binding.setPressed(pressed); }
}
