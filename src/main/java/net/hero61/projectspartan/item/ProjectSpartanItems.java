package net.hero61.projectspartan.item;

import net.hero61.projectspartan.ProjectSpartan;
import net.hero61.projectspartan.item.armor.SpartanArmorItem;
import net.hero61.projectspartan.item.armor.SpartanArmorMaterial;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ProjectSpartanItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ProjectSpartan.MOD_ID);

    public static final RegistryObject<Item> MODEL_TEST = ITEMS.register("model_test", ()
            -> new Item(new Item.Properties()));

    /*public static final RegistryObject<Item> BUCCANEER = ITEMS.register("buccaneer",
            () -> new SpartanArmorItem(SpartanArmorMaterial.MJOLNIR, ArmorItem.Type.HELMET, new Item.Properties()));*/

    private static RegistryObject<Item> createHeadband(String itemName) {
        return ITEMS.register(itemName, ()
                -> new SpartanArmorItem(SpartanArmorMaterial.MJOLNIR, ArmorItem.Type.HELMET, new Item.Properties()));
    }

    public static final RegistryObject<Item> BUCCANEER = createHeadband("buccaneer");
    public static final RegistryObject<Item> BUCCANEER_GREEN= createHeadband("buccaneer_green");


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
