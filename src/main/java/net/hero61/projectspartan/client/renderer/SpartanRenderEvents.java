package net.hero61.projectspartan.client.renderer;

import net.hero61.projectspartan.ProjectSpartan;
import net.hero61.projectspartan.client.model.item.model.armor.Oceanic.ModelOceanic;
import net.hero61.projectspartan.client.model.item.model.armor.Oceanic.ModelOceanicHelmet;
import net.hero61.projectspartan.client.model.item.model.armor.airassault.ModelAirAssault;
import net.hero61.projectspartan.client.model.item.model.armor.airassault.ModelAirAssaultHelmet;
import net.hero61.projectspartan.client.model.item.model.armor.achillies.ModelAchilles;
import net.hero61.projectspartan.client.model.item.model.armor.achillies.ModelAchillesHelmet;
import net.hero61.projectspartan.client.model.item.model.armor.argonaut.ModelArgonaut;
import net.hero61.projectspartan.client.model.item.model.armor.argonaut.ModelArgonautHelmet;
import net.hero61.projectspartan.client.model.item.model.armor.argus.ModelArgus;
import net.hero61.projectspartan.client.model.item.model.armor.argus.ModelArgusHelmet;
import net.hero61.projectspartan.client.model.item.model.armor.buccaneer.ModelBuccaneer;
import net.hero61.projectspartan.client.model.item.model.armor.buccaneer.ModelBuccaneerHelmet;
import net.hero61.projectspartan.client.model.item.model.armor.mkv_g1.ModelMKV_G1;
import net.hero61.projectspartan.client.model.item.model.armor.mkv_g1.ModelMKV_G1_Helmet;
import net.hero61.projectspartan.client.model.item.model.armor.mkvi_g1.ModelMKVI_G1;
import net.hero61.projectspartan.client.model.item.model.armor.mkvi_g1.ModelMKVI_G1_Helmet;
import net.hero61.projectspartan.client.model.item.model.armor.odst.ModelOdstG1;
import net.hero61.projectspartan.client.model.item.model.armor.odst.ModelOdstG1Helmet;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.renderer.BlockEntityWithoutLevelRenderer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.client.event.RegisterClientReloadListenersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(value= Dist.CLIENT, modid= ProjectSpartan.MOD_ID, bus= Mod.EventBusSubscriber.Bus.MOD)
public class SpartanRenderEvents {
    public static final BlockEntityWithoutLevelRenderer SPARTAN_RENDERER = new SpartanResourceManager();

    @SubscribeEvent
    public static void reloadListener(RegisterClientReloadListenersEvent event) {
        event.registerReloadListener(new SpartanResourceManager());
    }
    @SubscribeEvent
    public static void layerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(ModelAirAssault.LAYER_LOCATION, ModelAirAssault::createLayer);
        event.registerLayerDefinition(ModelAirAssaultHelmet.LAYER_LOCATION, ModelAirAssaultHelmet::createLayer);

        event.registerLayerDefinition(ModelAchilles.LAYER_LOCATION, ModelAchilles::createLayer);
        event.registerLayerDefinition(ModelAchillesHelmet.LAYER_LOCATION, ModelAchillesHelmet::createLayer);

        event.registerLayerDefinition(ModelArgonaut.LAYER_LOCATION, ModelArgonaut::createLayer);
        event.registerLayerDefinition(ModelArgonautHelmet.LAYER_LOCATION, ModelArgonautHelmet::createLayer);

        event.registerLayerDefinition(ModelArgus.LAYER_LOCATION, ModelArgus::createLayer);
        event.registerLayerDefinition(ModelArgusHelmet.LAYER_LOCATION, ModelArgusHelmet::createLayer);

        event.registerLayerDefinition(ModelBuccaneer.LAYER_LOCATION, ModelBuccaneer::createLayer);
        event.registerLayerDefinition(ModelBuccaneerHelmet.LAYER_LOCATION, ModelBuccaneerHelmet::createLayer);

        event.registerLayerDefinition(ModelMKV_G1.LAYER_LOCATION, ModelMKV_G1::createLayer);
        event.registerLayerDefinition(ModelMKV_G1_Helmet.LAYER_LOCATION, ModelMKV_G1_Helmet::createLayer);

        event.registerLayerDefinition(ModelMKVI_G1.LAYER_LOCATION, ModelMKVI_G1::createLayer);
        event.registerLayerDefinition(ModelMKVI_G1_Helmet.LAYER_LOCATION, ModelMKVI_G1_Helmet::createLayer);

        event.registerLayerDefinition(ModelOceanic.LAYER_LOCATION, ModelOceanic::createLayer);
        event.registerLayerDefinition(ModelOceanicHelmet.LAYER_LOCATION, ModelOceanicHelmet::createLayer);

        event.registerLayerDefinition(ModelOdstG1.LAYER_LOCATION, ModelOdstG1::createLayer);
        event.registerLayerDefinition(ModelOdstG1Helmet.LAYER_LOCATION, ModelOdstG1Helmet::createLayer);

    }
    @SubscribeEvent
    public static void entityRenderers(EntityRenderersEvent.RegisterRenderers event) {
    }
    @SubscribeEvent
    public static void blockentityRenderes(EntityRenderersEvent.RegisterRenderers event) {
    }
    @SubscribeEvent
    public static void entityLayers(EntityRenderersEvent.AddLayers event) {
        LivingEntityRenderer<Player, ? extends EntityModel<Player>> renderer = event.getRenderer(EntityType.PLAYER);
    }
}