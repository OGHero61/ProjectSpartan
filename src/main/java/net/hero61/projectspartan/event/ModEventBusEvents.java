package net.hero61.projectspartan.event;

import net.hero61.projectspartan.ProjectSpartan;
import net.hero61.projectspartan.entity.ProjectSpartanEntities;
import net.hero61.projectspartan.entity.custom.SpartanEntity;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = ProjectSpartan.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(ProjectSpartanEntities.SPARTAN.get(), SpartanEntity.createAttributes().build());
    }
}
