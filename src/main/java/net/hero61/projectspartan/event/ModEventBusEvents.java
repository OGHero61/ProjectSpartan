package net.hero61.projectspartan.event;

import net.hero61.projectspartan.ProjectSpartan;
import net.hero61.projectspartan.entity.ProjectSpartanEntities;
import net.hero61.projectspartan.entity.custom.AchillesEntity;
import net.hero61.projectspartan.entity.custom.AirAssaultEntity;
import net.hero61.projectspartan.entity.custom.BuccaneerEntity;
import net.hero61.projectspartan.entity.custom.OceanicEntity;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = ProjectSpartan.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(ProjectSpartanEntities.AIRASSAULT_ENTITY.get(), AirAssaultEntity.createAttributes().build());
        event.put(ProjectSpartanEntities.ACHILLES_ENTITY.get(), AchillesEntity.createAttributes().build());
        event.put(ProjectSpartanEntities.BUCCANEER_ENTITY.get(), BuccaneerEntity.createAttributes().build());
        event.put(ProjectSpartanEntities.OCEANIN_ENTITY.get(), OceanicEntity.createAttributes().build());
    }
}
