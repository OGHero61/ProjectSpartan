package net.hero61.projectspartan.client;

import net.hero61.projectspartan.ProjectSpartan;
import net.hero61.projectspartan.item.armor.SpartanArmorMaterial;
import net.minecraft.client.renderer.entity.player.PlayerRenderer;
import net.minecraft.client.model.PlayerModel;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RenderPlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;;

@Mod.EventBusSubscriber(value= Dist.CLIENT, modid= ProjectSpartan.MOD_ID, bus= Mod.EventBusSubscriber.Bus.FORGE)
public class PlayerRenderHandler {

    @SubscribeEvent
    public static void onRenderPlayer(RenderPlayerEvent.Pre event) {
        Player player = event.getEntity();
        boolean wearingSpecialArmor = false;

        // Check if the player is wearing diamond armor
        for (ItemStack stack : player.getArmorSlots()) {
            if (stack.getItem() instanceof ArmorItem) {
                ArmorItem armor = (ArmorItem) stack.getItem();
                if (armor.getMaterial() == SpartanArmorMaterial.MJOLNIR) {
                    wearingSpecialArmor = true;
                    break;
                }
            }
        }

        PlayerRenderer renderer = (PlayerRenderer) event.getRenderer();
        PlayerModel<?> model = renderer.getModel();

        if (wearingSpecialArmor) {
            model.jacket.visible = false;
            model.leftPants.visible = false;
            model.leftSleeve.visible = false;
            model.rightPants.visible = false;
            model.rightSleeve.visible = false;
            model.hat.visible = false;
        } else {
            model.jacket.visible = true;
            model.leftPants.visible = true;
            model.leftSleeve.visible = true;
            model.rightPants.visible = true;
            model.rightSleeve.visible = true;
            model.hat.visible = true;
        }
    }
}
