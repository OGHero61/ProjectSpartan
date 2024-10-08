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
    public  static final RegistryObject<Item> ACHILLES_BODY = createBody("achilles_body");
    public  static final RegistryObject<Item> ARGONAUT_BODY = createBody("argonaut_body");
    public  static final RegistryObject<Item> MKVIG1_BODY = createBody("mkvi_g1_body");
    public  static final RegistryObject<Item> MKVG1_BODY = createBody("mkv_g1_body");
    public  static final RegistryObject<Item> ODST_G1_BODY = createBody("odst_g1_body");
    public static  final RegistryObject<Item> ARGUS_BODY = createBody("argus_body");
    public static  final RegistryObject<Item> ATLAS_BODY = createBody("atlas_body");


    private static RegistryObject<Item> createHelmet(String itemName) {
        return ITEMS.register(itemName, ()
                -> new SpartanArmorItem(SpartanArmorMaterial.MJOLNIR, ArmorItem.Type.HELMET, new Item.Properties()));
    }
    public static final RegistryObject<Item> BUCCANEER_HELMET_GREEN = createHelmet("buccaneer_green_helmet");
    public static final RegistryObject<Item> BUCCANEER_HELMET = createHelmet("buccaneer_helmet");
    public static final RegistryObject<Item> AIRASSAULT_HELMET = createHelmet("airassault_helmet");
    public static final RegistryObject<Item> OCEANIC_HELMET = createHelmet("oceanic_helmet");
    public  static final RegistryObject<Item> ACHILLES_HELMET = createHelmet("achilles_helmet");
    public  static final RegistryObject<Item> ARGONAUT_HELMET = createHelmet("argonaut_helmet");
    public  static final RegistryObject<Item> MKVIG1_HELMET = createHelmet("mkvi_g1_helmet");
    public  static final RegistryObject<Item> MKVG1_HELMET = createHelmet("mkv_g1_helmet");
    public  static final RegistryObject<Item> ODST_G1_HELMET = createHelmet("odst_g1_helmet");
    public static final RegistryObject<Item> ARGUS_HELMET = createHelmet("argus_helmet");
    public static final RegistryObject<Item> ATLAS_HELMET = createHelmet("atlas_helmet");


    //Entity Spawn Eggs
    public static final RegistryObject<Item> SPARTAN_SPAWN_EGG = ITEMS.register("spartan_spawn_egg",
            () -> new ForgeSpawnEggItem(ProjectSpartanEntities.AIRASSAULT_ENTITY,0x527541,0x0f0f0f, new Item.Properties()));

    public static final RegistryObject<Item> CUSTOM_SPAWN_EGG = ITEMS.register("custom_spawn_egg",
            () -> new CustomSpawnEggItem(new Item.Properties()));


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
