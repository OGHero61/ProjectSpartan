package net.hero61.projectspartan.entity;

import net.hero61.projectspartan.ProjectSpartan;
import net.hero61.projectspartan.entity.custom.SpartanEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


@Mod.EventBusSubscriber(modid = ProjectSpartan.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ProjectSpartanEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, ProjectSpartan.MOD_ID);

    public static final RegistryObject<EntityType<SpartanEntity>> SPARTAN =
            ENTITY_TYPES.register("spartan", () -> EntityType.Builder.of(SpartanEntity::new, MobCategory.CREATURE)
                    .sized(1, 2).build("spartan"));


    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}

