/* Uses Meteor Client source. Copyright (c) Meteor Development. GPL-3.0-only. */
package dev.meteorapi.backport;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
/** Newly exposed utility functions independent of Meteor Client initialization. */
public final class Utils {
    private Utils() {}
    public static boolean isFood(ItemStack item) { return item.contains(DataComponentTypes.FOOD) && item.contains(DataComponentTypes.CONSUMABLE); }
    public static boolean isFood(Item item) { return isFood(item.getDefaultStack()); }
    public static Vec3d vec3(BlockPos pos) { return new Vec3d(pos.getX(), pos.getY(), pos.getZ()); }
    public static <T> boolean contains(Iterable<T> colors, T value) { for (T entry : colors) if (entry == value) return true; return false; }
    public static boolean fileNameFilter(String text, char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9') || c == '_' || c == '-' || c == ' ';
    }
    public static boolean modsMatch(int current, int... desired) {
        int mask = 0;
        for (int mod : desired) { if ((current & mod) == 0) return false; mask |= mod; }
        int actualMods = org.lwjgl.glfw.GLFW.GLFW_MOD_SHIFT | org.lwjgl.glfw.GLFW.GLFW_MOD_CONTROL
            | org.lwjgl.glfw.GLFW.GLFW_MOD_ALT | org.lwjgl.glfw.GLFW.GLFW_MOD_SUPER;
        return (current & actualMods & ~mask) == 0;
    }
}
