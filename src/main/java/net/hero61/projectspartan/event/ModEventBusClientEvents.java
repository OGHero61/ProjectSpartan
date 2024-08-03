package net.hero61.projectspartan.event;

import net.hero61.projectspartan.ProjectSpartan;
import net.hero61.projectspartan.entity.client.ModModelLayers;
import net.hero61.projectspartan.entity.client.model.AchillesEntityModel;
import net.hero61.projectspartan.entity.client.model.AirAssaultEntityModel;
import net.hero61.projectspartan.entity.client.model.BuccaneerEntityModel;
import net.hero61.projectspartan.entity.client.model.OceanicEntityModel;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = ProjectSpartan.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModEventBusClientEvents {
    @SubscribeEvent
    public static void registerLayer(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(ModModelLayers.SPARTAN_AIRASSAULT_LAYER, AirAssaultEntityModel::createLayer);
        event.registerLayerDefinition(ModModelLayers.SPARTAN_ACHILLES_LAYER, AchillesEntityModel::createLayer);
        event.registerLayerDefinition(ModModelLayers.SPARTAN_BUCCANEER_LAYER, BuccaneerEntityModel::createLayer);
        event.registerLayerDefinition(ModModelLayers.SPARTAN_OCEANIC_LAYER, OceanicEntityModel::createLayer);
    }
}