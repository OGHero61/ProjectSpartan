package net.hero61.projectspartan.client;

import com.mojang.blaze3d.systems.RenderSystem;
import net.hero61.projectspartan.ProjectSpartan;
import net.hero61.projectspartan.item.ProjectSpartanItems;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RenderGuiOverlayEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(value= Dist.CLIENT, modid= ProjectSpartan.MOD_ID, bus= Mod.EventBusSubscriber.Bus.MOD)
public class CustomHUDOverlay {
    /*private static final ResourceLocation BUCCANEER_HUD = new ResourceLocation(ProjectSpartan.MOD_ID, "textures/gui/buccaneer_hud.png");
    private static final ResourceLocation AIRASSAULT_HUD = new ResourceLocation(ProjectSpartan.MOD_ID, "textures/gui/aassault_hud.png");
    private static final ResourceLocation OCEANIC_HUD = new ResourceLocation(ProjectSpartan.MOD_ID, "textures/gui/oceanic_hud.png");

    @SubscribeEvent
    public static void onRenderGameOverlay(RenderGuiOverlayEvent.Pre event) {
        Minecraft mc = Minecraft.getInstance();
        ItemStack helmet = mc.player.getItemBySlot(EquipmentSlot.HEAD);

        if (helmet.getItem() == ProjectSpartanItems.BUCCANEER_HELMET.get()) {
            renderCustomHUD(event.getGuiGraphics(), BUCCANEER_HUD);
        } else if (helmet.getItem() == ProjectSpartanItems.AIRASSAULT_HELMET.get()) {
            renderCustomHUD(event.getGuiGraphics(), AIRASSAULT_HUD);
        } else if (helmet.getItem() == ProjectSpartanItems.OCEANIC_HELMET.get()) {
            renderCustomHUD(event.getGuiGraphics(), OCEANIC_HUD);
        }
    }

    private static void renderCustomHUD(GuiGraphics guiGraphics, ResourceLocation hudTexture) {
        Minecraft mc = Minecraft.getInstance();
        RenderSystem.setShaderTexture(0, hudTexture);

        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc(); // Setting the default blend function for transparency

        int screenWidth = mc.getWindow().getGuiScaledWidth();
        int screenHeight = mc.getWindow().getGuiScaledHeight();

        // Render the texture with transparency
        guiGraphics.blit(hudTexture, 0, 0, 0, 0, screenWidth, screenHeight, screenWidth, screenHeight);

        RenderSystem.disableBlend();
    }*/
}
