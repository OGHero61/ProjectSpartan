package net.hero61.projectspartan.event;

import net.hero61.projectspartan.item.armor.SpartanArmorItem;
import net.minecraft.world.item.DyeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class ArmorDyeHandler {

    @SubscribeEvent
    public static void onArmorDyed(PlayerInteractEvent.RightClickItem event) {
        ItemStack itemStack = event.getItemStack();
        ItemStack heldItem = event.getEntity().getMainHandItem();

        if (itemStack.getItem() instanceof SpartanArmorItem && heldItem.getItem() instanceof DyeItem) {
            int color = ((DyeItem) heldItem.getItem()).getDyeColor().getFireworkColor();
            SpartanArmorItem.setColor(itemStack, color);
            heldItem.shrink(1);
            event.setCanceled(true);
        }
    }
}
