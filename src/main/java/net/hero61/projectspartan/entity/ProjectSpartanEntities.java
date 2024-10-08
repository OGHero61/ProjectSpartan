package net.hero61.projectspartan.entity;

import net.hero61.projectspartan.ProjectSpartan;
import net.hero61.projectspartan.entity.custom.AchillesEntity;
import net.hero61.projectspartan.entity.custom.AirAssaultEntity;
import net.hero61.projectspartan.entity.custom.BuccaneerEntity;
import net.hero61.projectspartan.entity.custom.OceanicEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

@Mod.EventBusSubscriber(modid = ProjectSpartan.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ProjectSpartanEntities {

    // Create a DeferredRegister for entity types
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, ProjectSpartan.MOD_ID);

    // Register the AirAssaultEntity
    public static final RegistryObject<EntityType<AirAssaultEntity>> AIRASSAULT_ENTITY =
            ENTITY_TYPES.register("airassault_entity",
                    () -> EntityType.Builder.of(AirAssaultEntity::new, MobCategory.CREATURE)
                            .sized(0.6f, 1.8f)  // specify size: width and height
                            .build("airassault_entity"));

    public static final RegistryObject<EntityType<AchillesEntity>> ACHILLES_ENTITY =
            ENTITY_TYPES.register("achilles_entity",
                    () -> EntityType.Builder.of(AchillesEntity::new, MobCategory.CREATURE)
                            .sized(0.6f, 1.8f)  // specify size: width and height
                            .build("achilles_entity"));

    // Register the BuccaneerEntity
    public static final RegistryObject<EntityType<BuccaneerEntity>> BUCCANEER_ENTITY =
            ENTITY_TYPES.register("buccaneer_entity",
                    () -> EntityType.Builder.of(BuccaneerEntity::new, MobCategory.CREATURE)
                            .sized(0.6f, 1.8f)  // specify size: width and height
                            .build("buccaneer_entity"));

    public static final RegistryObject<EntityType<OceanicEntity>> OCEANIN_ENTITY =
            ENTITY_TYPES.register("oceanic_entity",
                    () -> EntityType.Builder.of(OceanicEntity::new, MobCategory.CREATURE)
                            .sized(0.6f, 1.8f)  // specify size: width and height
                            .build("oceanic_entity"));



    // Method to register the entity types with the event bus
    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}


