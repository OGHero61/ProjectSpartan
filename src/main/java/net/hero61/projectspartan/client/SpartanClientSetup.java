package net.hero61.projectspartan.client;

import net.hero61.projectspartan.ProjectSpartan;
import net.hero61.projectspartan.client.model.item.model.armor.buccaneer.ModelBuccaneer;
import net.hero61.projectspartan.item.ProjectSpartanItems;
import net.hero61.projectspartan.client.SpartanArmorColorProvider;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;



@Mod.EventBusSubscriber(modid = ProjectSpartan.MOD_ID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
public class SpartanClientSetup {
    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event) {
        // Register your color handler here
        event.enqueueWork(() -> {
            // Replace YOUR_ARMOR_ITEM with your actual item
            net.minecraft.client.Minecraft.getInstance().getItemColors().register(new SpartanArmorColorProvider(),
                    ProjectSpartanItems.BUCCANEER_BODY.get(),
                    ProjectSpartanItems.BUCCANEER_HELMET.get());
        });
    }
}