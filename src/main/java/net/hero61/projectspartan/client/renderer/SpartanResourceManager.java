package net.hero61.projectspartan.client.renderer;


import net.hero61.projectspartan.client.model.item.model.armor.Oceanic.ModelOceanic;
import net.hero61.projectspartan.client.model.item.model.armor.Oceanic.ModelOceanicHelmet;
import net.hero61.projectspartan.client.model.item.model.armor.achillies.ModelAchilles;
import net.hero61.projectspartan.client.model.item.model.armor.achillies.ModelAchillesHelmet;
import net.hero61.projectspartan.client.model.item.model.armor.airassault.ModelAirAssault;
import net.hero61.projectspartan.client.model.item.model.armor.airassault.ModelAirAssaultHelmet;
import net.hero61.projectspartan.client.model.item.model.armor.argonaut.ModelArgonaut;
import net.hero61.projectspartan.client.model.item.model.armor.argonaut.ModelArgonautHelmet;
import net.hero61.projectspartan.client.model.item.model.armor.buccaneer.ModelBuccaneer;
import net.hero61.projectspartan.client.model.item.model.armor.buccaneer.ModelBuccaneerHelmet;
import net.hero61.projectspartan.client.model.item.model.armor.mkv_g1.ModelMKV_G1;
import net.hero61.projectspartan.client.model.item.model.armor.mkv_g1.ModelMKV_G1_Helmet;
import net.hero61.projectspartan.client.model.item.model.armor.mkvi_g1.ModelMKVI_G1;
import net.hero61.projectspartan.client.model.item.model.armor.mkvi_g1.ModelMKVI_G1_Helmet;
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
        setArgonautHelmetRenderer(modelSet, ProjectSpartanItems.ARGONAUT_HELMET, "textures/models/armor/argonaut/argonaut.png");
        setArgonautRenderer(modelSet, ProjectSpartanItems.ARGONAUT_BODY, "textures/models/armor/argonaut/argonaut.png");

        setMKVIG1HelmetRenderer(modelSet, ProjectSpartanItems.MKVIG1_HELMET, "textures/models/armor/mkvi/mkvimjolnir.png");
        setMKVIG1Renderer(modelSet, ProjectSpartanItems.MKVIG1_BODY, "textures/models/armor/mkvi/mkvimjolnir.png");
        setMKVG1HelmetRenderer(modelSet, ProjectSpartanItems.MKVG1_HELMET, "textures/models/armor/mkv/mjolnirmkv_green.png");
        setMKVG1Renderer(modelSet, ProjectSpartanItems.MKVG1_BODY, "textures/models/armor/mkv/mjolnirmkv_green.png");


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
    private void setArgonautHelmetRenderer(EntityModelSet modelSet, RegistryObject<Item> item, String texture) {
        ((SpartanArmorItem) item.get())
                .setArmorModel(new ModelArgonautHelmet<>(modelSet.bakeLayer(ModelArgonautHelmet.LAYER_LOCATION)))
                .setArmorTexture(texture);
    }
    private void setArgonautRenderer(EntityModelSet modelSet, RegistryObject<Item> item, String texture) {
        ((SpartanArmorItem) item.get())
                .setArmorModel(new ModelArgonaut<>(modelSet.bakeLayer(ModelArgonaut.LAYER_LOCATION)))
                .setArmorTexture(texture);
    }
    private void setMKVIG1HelmetRenderer(EntityModelSet modelSet, RegistryObject<Item> item, String texture) {
        ((SpartanArmorItem) item.get())
                .setArmorModel(new ModelMKVI_G1_Helmet<>(modelSet.bakeLayer(ModelMKVI_G1_Helmet.LAYER_LOCATION)))
                .setArmorTexture(texture);
    }
    private void setMKVIG1Renderer(EntityModelSet modelSet, RegistryObject<Item> item, String texture) {
        ((SpartanArmorItem) item.get())
                .setArmorModel(new ModelMKVI_G1<>(modelSet.bakeLayer(ModelMKVI_G1.LAYER_LOCATION)))
                .setArmorTexture(texture);
    }
    private void setMKVG1HelmetRenderer(EntityModelSet modelSet, RegistryObject<Item> item, String texture) {
        ((SpartanArmorItem) item.get())
                .setArmorModel(new ModelMKV_G1_Helmet<>(modelSet.bakeLayer(ModelMKV_G1_Helmet.LAYER_LOCATION)))
                .setArmorTexture(texture);
    }
    private void setMKVG1Renderer(EntityModelSet modelSet, RegistryObject<Item> item, String texture) {
        ((SpartanArmorItem) item.get())
                .setArmorModel(new ModelMKV_G1<>(modelSet.bakeLayer(ModelMKV_G1.LAYER_LOCATION)))
                .setArmorTexture(texture);
    }

}
