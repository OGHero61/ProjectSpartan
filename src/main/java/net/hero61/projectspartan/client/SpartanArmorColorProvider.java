
package net.hero61.projectspartan.client;

import net.hero61.projectspartan.item.armor.SpartanArmorItem;
import net.minecraft.client.color.item.ItemColor;
import net.minecraft.world.item.ItemStack;

public class SpartanArmorColorProvider implements ItemColor {
    @Override
    public int getColor(ItemStack stack, int tintIndex) {
        return tintIndex > 0 ? -1 : ((SpartanArmorItem) stack.getItem()).getColor(stack);
    }
}