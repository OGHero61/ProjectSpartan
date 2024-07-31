package net.hero61.projectspartan;

import com.mojang.logging.LogUtils;
import net.hero61.projectspartan.client.CustomHUDOverlay;
import net.hero61.projectspartan.client.PlayerRenderHandler;
import net.hero61.projectspartan.entity.ProjectSpartanEntities;
import net.hero61.projectspartan.entity.client.AirAssaultEntityRenderer;
import net.hero61.projectspartan.entity.client.BuccaneerEntityRenderer;
import net.hero61.projectspartan.entity.custom.BuccaneerEntity;
import net.hero61.projectspartan.item.ProjectSpartanItems;
import net.hero61.projectspartan.item.SpartanTabs;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.network.NetworkRegistry;
import net.minecraftforge.network.simple.SimpleChannel;
import org.slf4j.Logger;

@Mod(ProjectSpartan.MOD_ID)
public class ProjectSpartan {
    public static final String MOD_ID = "mcspartan";
    public static final Logger LOGGER = LogUtils.getLogger();
    public static final String PROTOCOL_VERSION = "1";
    public static final SimpleChannel CHANNEL = NetworkRegistry.newSimpleChannel(
            new ResourceLocation(MOD_ID, "main"),
            () -> PROTOCOL_VERSION,
            PROTOCOL_VERSION::equals,
            PROTOCOL_VERSION::equals
    );

    public ProjectSpartan() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        SpartanTabs.register(modEventBus);

        ProjectSpartanItems.register(modEventBus);
        ProjectSpartanEntities.register(modEventBus);

        modEventBus.addListener(this::commonSetup);


        MinecraftForge.EVENT_BUS.register(PlayerRenderHandler.class);
        modEventBus.addListener(this::addCreative);


    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        // Common setup logic
    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {

    }
    public static void clientSetup(final FMLClientSetupEvent event) {
        MinecraftForge.EVENT_BUS.register(CustomHUDOverlay.class);
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
        // Server starting logic
    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            EntityRenderers.register(ProjectSpartanEntities.AIRASSAULT_ENTITY.get(), AirAssaultEntityRenderer::new);
            EntityRenderers.register(ProjectSpartanEntities.BUCCANEER_ENTITY.get(), BuccaneerEntityRenderer::new);
        }
    }
}