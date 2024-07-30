package net.hero61.projectspartan.item;

import net.hero61.projectspartan.ProjectSpartan;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class SpartanTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ProjectSpartan.MOD_ID);

    public static final RegistryObject<CreativeModeTab> MJOLNIR_ARMOR_TAB = CREATIVE_MODE_TABS.register("mjolnir_armor_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ProjectSpartanItems.AIRASSAULT_HELMET.get()))
                    .title(Component.translatable("mjolnir_armor_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ProjectSpartanItems.AIRASSAULT_HELMET.get());
                        pOutput.accept(ProjectSpartanItems.AIRASSAULT_HELMET.get());
                        pOutput.accept(ProjectSpartanItems.BUCCANEER_HELMET.get());
                        pOutput.accept(ProjectSpartanItems.BUCCANEER_BODY.get());
                        pOutput.accept(ProjectSpartanItems.BUCCANEER_HELMET_GREEN.get());
                        pOutput.accept(ProjectSpartanItems.BUCCANEER_BODY_GREEN.get());
                        pOutput.accept(ProjectSpartanItems.OCEANIC_HELMET.get());
                        pOutput.accept(ProjectSpartanItems.OCEANIC_BODY.get());

                    })
                    .build());


    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
