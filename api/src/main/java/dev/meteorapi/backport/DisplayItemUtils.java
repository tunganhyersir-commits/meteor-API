/* SPDX-License-Identifier: GPL-3.0-only */
package dev.meteorapi.backport;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.block.Block;
/** The 1.21.11 registry model already supports display stacks before joining a world. */
public final class DisplayItemUtils {
    private DisplayItemUtils() {}
    public static ItemStack toStack(Item item) { return toStack(item, 1); }
    public static ItemStack toStack(Block block) { return toStack(block.asItem()); }
    public static ItemStack toStack(Item item, int count) {
        if (item == Items.AIR || count <= 0) return ItemStack.EMPTY;
        return new ItemStack(item, count);
    }
}
