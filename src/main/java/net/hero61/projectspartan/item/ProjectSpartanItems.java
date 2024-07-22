package net.hero61.projectspartan.item;

import net.hero61.projectspartan.ProjectSpartan;
import net.hero61.projectspartan.item.armor.SpartanArmorItem;
import net.hero61.projectspartan.item.armor.SpartanArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ProjectSpartanItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ProjectSpartan.MOD_ID);

    /*public static final RegistryObject<Item> BUCCANEER = ITEMS.register("buccaneer",
            () -> new SpartanArmorItem(SpartanArmorMaterial.MJOLNIR, ArmorItem.Type.HELMET, new Item.Properties()));*/

    private static RegistryObject<Item> createBuccaneerBody(String itemName) {
        return ITEMS.register(itemName, ()
                -> new SpartanArmorItem(SpartanArmorMaterial.MJOLNIR, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    }

    public static final RegistryObject<Item> BUCCANEER_BODY = createBuccaneerBody("buccaneer_body");
    public static final RegistryObject<Item> BUCCANEER_BODY_GREEN = createBuccaneerBody("buccaneer_green_body");

    private static RegistryObject<Item> createBuccaneerHelmet(String itemName) {
        return ITEMS.register(itemName, ()
                -> new SpartanArmorItem(SpartanArmorMaterial.MJOLNIR, ArmorItem.Type.HELMET, new Item.Properties()));
    }
    public static final RegistryObject<Item> BUCCANEER_HELMET_GREEN = createBuccaneerHelmet("buccaneer_green_helmet");
    public static final RegistryObject<Item> BUCCANEER_HELMET = createBuccaneerHelmet("buccaneer_helmet");

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
