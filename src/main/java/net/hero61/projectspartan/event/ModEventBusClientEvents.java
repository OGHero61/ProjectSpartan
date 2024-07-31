package net.hero61.projectspartan.event;

import net.hero61.projectspartan.ProjectSpartan;
import net.hero61.projectspartan.entity.client.ModModelLayers;
import net.hero61.projectspartan.entity.client.model.AirAssaultEntity;
import net.hero61.projectspartan.entity.client.model.BuccaneerEntity;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = ProjectSpartan.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModEventBusClientEvents {
    @SubscribeEvent
    public static void registerLayer(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(ModModelLayers.SPARTAN_LAYER, AirAssaultEntity::createLayer);
        event.registerLayerDefinition(ModModelLayers.SPARTAN_BUCCANEER_LAYER, BuccaneerEntity::createLayer);
    }
}