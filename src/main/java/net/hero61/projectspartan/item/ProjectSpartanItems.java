package net.hero61.projectspartan.item;

import net.hero61.projectspartan.ProjectSpartan;
import net.hero61.projectspartan.entity.ProjectSpartanEntities;
import net.hero61.projectspartan.item.armor.SpartanArmorItem;
import net.hero61.projectspartan.item.armor.SpartanArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ProjectSpartanItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ProjectSpartan.MOD_ID);

    /*public static final RegistryObject<Item> BUCCANEER = ITEMS.register("buccaneer",
            () -> new SpartanArmorItem(SpartanArmorMaterial.MJOLNIR, ArmorItem.Type.HELMET, new Item.Properties()));*/

    private static RegistryObject<Item> createBody(String itemName) {
        return ITEMS.register(itemName, ()
                -> new SpartanArmorItem(SpartanArmorMaterial.MJOLNIR, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    }
    public static final RegistryObject<Item> BUCCANEER_BODY = createBody("buccaneer_body");
    public static final RegistryObject<Item> BUCCANEER_BODY_GREEN = createBody("buccaneer_green_body");
    public static final RegistryObject<Item> AIRASSAULT_BODY = createBody("airassault_body");
    public static final RegistryObject<Item> OCEANIC_BODY = createBody("oceanic_body");


    private static RegistryObject<Item> createHelmet(String itemName) {
        return ITEMS.register(itemName, ()
                -> new SpartanArmorItem(SpartanArmorMaterial.MJOLNIR, ArmorItem.Type.HELMET, new Item.Properties()));
    }
    public static final RegistryObject<Item> BUCCANEER_HELMET_GREEN = createHelmet("buccaneer_green_helmet");
    public static final RegistryObject<Item> BUCCANEER_HELMET = createHelmet("buccaneer_helmet");
    public static final RegistryObject<Item> AIRASSAULT_HELMET = createHelmet("airassault_helmet");
    public static final RegistryObject<Item> OCEANIC_HELMET = createHelmet("oceanic_helmet");


    //Entity Spawn Eggs
    public static final RegistryObject<Item> SPARTAN_SPAWN_EGG = ITEMS.register("spartan_spawn_egg",
            () -> new ForgeSpawnEggItem(ProjectSpartanEntities.AIRASSAULT_ENTITY,0x527541,0x0f0f0f, new Item.Properties()));

    public static final RegistryObject<Item> CUSTOM_SPAWN_EGG = ITEMS.register("custom_spawn_egg",
            () -> new CustomSpawnEggItem(new Item.Properties()));


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
