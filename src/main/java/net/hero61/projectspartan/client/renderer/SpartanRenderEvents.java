package net.hero61.projectspartan.client.renderer;

import net.hero61.projectspartan.ProjectSpartan;
import net.hero61.projectspartan.client.model.item.model.armor.ModelBuccaneer;
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

        event.registerLayerDefinition(ModelBuccaneer.LAYER_LOCATION, ModelBuccaneer::createLayer);

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
