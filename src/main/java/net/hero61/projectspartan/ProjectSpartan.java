package net.hero61.projectspartan;

import com.mojang.logging.LogUtils;
import net.hero61.projectspartan.client.SpartanClientSetup;
import net.hero61.projectspartan.event.ArmorDyeHandler;
import net.hero61.projectspartan.item.ProjectSpartanItems;
import net.minecraft.world.item.CreativeModeTabs;
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
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(ProjectSpartan.MOD_ID)
public class ProjectSpartan {
    public static final String MOD_ID = "mcspartan";
    public static final Logger LOGGER = LogUtils.getLogger();

    public ProjectSpartan() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        modEventBus.addListener(this::commonSetup);
        modEventBus.addListener(this::addCreative);
        modEventBus.addListener(SpartanClientSetup::onClientSetup);

        ProjectSpartanItems.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(ArmorDyeHandler.class);
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        // Common setup logic
    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.COMBAT) {
            event.accept(ProjectSpartanItems.BUCCANEER_HELMET.get());
            event.accept(ProjectSpartanItems.BUCCANEER_BODY.get());
        }
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
        // Server starting logic
    }

    @Mod.EventBusSubscriber(modid = ProjectSpartan.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            SpartanClientSetup.onClientSetup(event);
        }
    }
}
