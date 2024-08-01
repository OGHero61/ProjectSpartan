package net.hero61.projectspartan.client.renderer;


import net.hero61.projectspartan.client.model.item.model.armor.Oceanic.ModelOceanic;
import net.hero61.projectspartan.client.model.item.model.armor.Oceanic.ModelOceanicHelmet;
import net.hero61.projectspartan.client.model.item.model.armor.achillies.ModelAchilles;
import net.hero61.projectspartan.client.model.item.model.armor.achillies.ModelAchillesHelmet;
import net.hero61.projectspartan.client.model.item.model.armor.airassault.ModelAirAssault;
import net.hero61.projectspartan.client.model.item.model.armor.airassault.ModelAirAssaultHelmet;
import net.hero61.projectspartan.client.model.item.model.armor.buccaneer.ModelBuccaneer;
import net.hero61.projectspartan.client.model.item.model.armor.buccaneer.ModelBuccaneerHelmet;
import net.hero61.projectspartan.item.ProjectSpartanItems;
import net.hero61.projectspartan.item.armor.SpartanArmorItem;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.geom.EntityModelSet;
import net.minecraft.client.renderer.BlockEntityWithoutLevelRenderer;
import net.minecraft.server.packs.resources.ResourceManager;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.RegistryObject;

public class SpartanResourceManager extends BlockEntityWithoutLevelRenderer {
    public SpartanResourceManager() {
        super(null, null);
    }

    public void onResourceManagerReload(ResourceManager resourceManager) {
        EntityModelSet modelSet = Minecraft.getInstance().getEntityModels();

        /*((SpartanArmorItem) ProjectSpartanItems.BUCCANEER.get())
                .setArmorModel(new ModelBuccaneer<>(modelSet.bakeLayer(ModelBuccaneer.LAYER_LOCATION)))
                .setArmorTexture("textures/models/armor/buccaneer.png");*/

        setAAssaultRenderer(modelSet, ProjectSpartanItems.AIRASSAULT_BODY, "textures/models/armor/airassault/airassault.png");
        setAAssaultHelmetRenderer(modelSet, ProjectSpartanItems.AIRASSAULT_HELMET, "textures/models/armor/airassault/airassault.png");
        setAchillesHelmetRenderer(modelSet, ProjectSpartanItems.ACHILLES_HELMET, "textures/models/armor/achilles/achilles.png");
        setAchillesRenderer(modelSet, ProjectSpartanItems.ACHILLES_BODY, "textures/models/armor/achilles/achilles.png");
        setBuccaneerRenderer(modelSet, ProjectSpartanItems.BUCCANEER_BODY, "textures/models/armor/buccaneer/buccaneer.png");
        setBuccaneerHelmetRenderer(modelSet, ProjectSpartanItems.BUCCANEER_HELMET, "textures/models/armor/buccaneer/buccaneer.png");
        setBuccaneerRenderer(modelSet, ProjectSpartanItems.BUCCANEER_BODY_GREEN, "textures/models/armor/buccaneer/buccaneer_green.png");
        setBuccaneerHelmetRenderer(modelSet, ProjectSpartanItems.BUCCANEER_HELMET_GREEN, "textures/models/armor/buccaneer/buccaneer_green.png");



        setOceanicRenderer(modelSet, ProjectSpartanItems.OCEANIC_BODY, "textures/models/armor/oceanic/oceanic.png");
        setOceanicHelmetRenderer(modelSet, ProjectSpartanItems.OCEANIC_HELMET, "textures/models/armor/oceanic/oceanic.png");

}
        private void setBuccaneerRenderer(EntityModelSet modelSet, RegistryObject<Item> item, String texture) {
            ((SpartanArmorItem) item.get())
                    .setArmorModel(new ModelBuccaneer<>(modelSet.bakeLayer(ModelBuccaneer.LAYER_LOCATION)))
                    .setArmorTexture(texture);
    }
        private void setBuccaneerHelmetRenderer(EntityModelSet modelSet, RegistryObject<Item> item, String texture) {
            ((SpartanArmorItem) item.get())
                    .setArmorModel(new ModelBuccaneerHelmet<>(modelSet.bakeLayer(ModelBuccaneerHelmet.LAYER_LOCATION)))
                    .setArmorTexture(texture);
    }
    private void setAAssaultRenderer(EntityModelSet modelSet, RegistryObject<Item> item, String texture) {
        ((SpartanArmorItem) item.get())
                .setArmorModel(new ModelAirAssault<>(modelSet.bakeLayer(ModelAirAssault.LAYER_LOCATION)))
                .setArmorTexture(texture);
    }
    private void setAAssaultHelmetRenderer(EntityModelSet modelSet, RegistryObject<Item> item, String texture) {
        ((SpartanArmorItem) item.get())
                .setArmorModel(new ModelAirAssaultHelmet<>(modelSet.bakeLayer(ModelAirAssaultHelmet.LAYER_LOCATION)))
                .setArmorTexture(texture);
    }
    private void setOceanicRenderer(EntityModelSet modelSet, RegistryObject<Item> item, String texture) {
        ((SpartanArmorItem) item.get())
                .setArmorModel(new ModelOceanic<>(modelSet.bakeLayer(ModelOceanic.LAYER_LOCATION)))
                .setArmorTexture(texture);
    }
    private void setOceanicHelmetRenderer(EntityModelSet modelSet, RegistryObject<Item> item, String texture) {
        ((SpartanArmorItem) item.get())
                .setArmorModel(new ModelOceanicHelmet<>(modelSet.bakeLayer(ModelOceanicHelmet.LAYER_LOCATION)))
                .setArmorTexture(texture);
    }
    private void setAchillesHelmetRenderer(EntityModelSet modelSet, RegistryObject<Item> item, String texture) {
        ((SpartanArmorItem) item.get())
                .setArmorModel(new ModelAchillesHelmet<>(modelSet.bakeLayer(ModelAchillesHelmet.LAYER_LOCATION)))
                .setArmorTexture(texture);
    }
    private void setAchillesRenderer(EntityModelSet modelSet, RegistryObject<Item> item, String texture) {
        ((SpartanArmorItem) item.get())
                .setArmorModel(new ModelAchilles<>(modelSet.bakeLayer(ModelAchilles.LAYER_LOCATION)))
                .setArmorTexture(texture);
    }

}
