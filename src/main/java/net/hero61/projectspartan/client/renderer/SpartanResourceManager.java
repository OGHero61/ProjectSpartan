package net.hero61.projectspartan.client.renderer;

import net.hero61.projectspartan.client.model.item.model.armor.Oceanic.ModelOceanic;
import net.hero61.projectspartan.client.model.item.model.armor.Oceanic.ModelOceanicHelmet;
import net.hero61.projectspartan.client.model.item.model.armor.achillies.ModelAchilles;
import net.hero61.projectspartan.client.model.item.model.armor.achillies.ModelAchillesHelmet;
import net.hero61.projectspartan.client.model.item.model.armor.airassault.ModelAirAssault;
import net.hero61.projectspartan.client.model.item.model.armor.airassault.ModelAirAssaultHelmet;
import net.hero61.projectspartan.client.model.item.model.armor.argonaut.ModelArgonaut;
import net.hero61.projectspartan.client.model.item.model.armor.argonaut.ModelArgonautHelmet;
import net.hero61.projectspartan.client.model.item.model.armor.argus.ModelArgus;
import net.hero61.projectspartan.client.model.item.model.armor.argus.ModelArgusHelmet;
import net.hero61.projectspartan.client.model.item.model.armor.atlas.ModelAtlas;
import net.hero61.projectspartan.client.model.item.model.armor.atlas.ModelAtlasHelmet;
import net.hero61.projectspartan.client.model.item.model.armor.buccaneer.ModelBuccaneer;
import net.hero61.projectspartan.client.model.item.model.armor.buccaneer.ModelBuccaneerHelmet;
import net.hero61.projectspartan.client.model.item.model.armor.mkv_g1.ModelMKV_G1;
import net.hero61.projectspartan.client.model.item.model.armor.mkv_g1.ModelMKV_G1_Helmet;
import net.hero61.projectspartan.client.model.item.model.armor.mkvi_g1.ModelMKVI_G1;
import net.hero61.projectspartan.client.model.item.model.armor.mkvi_g1.ModelMKVI_G1_Helmet;
import net.hero61.projectspartan.client.model.item.model.armor.odst.ModelOdstG1;
import net.hero61.projectspartan.client.model.item.model.armor.odst.ModelOdstG1Helmet;
import net.hero61.projectspartan.item.ProjectSpartanItems;
import net.hero61.projectspartan.item.armor.SpartanArmorItem;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.EntityModelSet;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.renderer.BlockEntityWithoutLevelRenderer;
import net.minecraft.server.packs.resources.ResourceManager;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.RegistryObject;

public class SpartanResourceManager extends BlockEntityWithoutLevelRenderer {
    public SpartanResourceManager() {
        super(null, null);
    }

    @Override
    public void onResourceManagerReload(ResourceManager resourceManager) {
        EntityModelSet modelSet = Minecraft.getInstance().getEntityModels();

        registerArmorModel(modelSet, ProjectSpartanItems.AIRASSAULT_BODY, ModelAirAssault.LAYER_LOCATION, new ModelAirAssault<>(modelSet.bakeLayer(ModelAirAssault.LAYER_LOCATION)), "textures/models/armor/airassault/airassault.png");
        registerArmorModel(modelSet, ProjectSpartanItems.AIRASSAULT_HELMET, ModelAirAssaultHelmet.LAYER_LOCATION, new ModelAirAssaultHelmet<>(modelSet.bakeLayer(ModelAirAssaultHelmet.LAYER_LOCATION)), "textures/models/armor/airassault/airassault.png");
        registerArmorModel(modelSet, ProjectSpartanItems.ACHILLES_BODY, ModelAchilles.LAYER_LOCATION, new ModelAchilles<>(modelSet.bakeLayer(ModelAchilles.LAYER_LOCATION)), "textures/models/armor/achilles/achilles.png");
        registerArmorModel(modelSet, ProjectSpartanItems.ACHILLES_HELMET, ModelAchillesHelmet.LAYER_LOCATION, new ModelAchillesHelmet<>(modelSet.bakeLayer(ModelAchillesHelmet.LAYER_LOCATION)), "textures/models/armor/achilles/achilles.png");
        registerArmorModel(modelSet, ProjectSpartanItems.ARGONAUT_BODY, ModelArgonaut.LAYER_LOCATION, new ModelArgonaut<>(modelSet.bakeLayer(ModelArgonaut.LAYER_LOCATION)), "textures/models/armor/argonaut/argonaut.png");
        registerArmorModel(modelSet, ProjectSpartanItems.ARGONAUT_HELMET, ModelArgonautHelmet.LAYER_LOCATION, new ModelArgonautHelmet<>(modelSet.bakeLayer(ModelArgonautHelmet.LAYER_LOCATION)), "textures/models/armor/argonaut/argonaut.png");
        registerArmorModel(modelSet, ProjectSpartanItems.ARGUS_BODY, ModelArgus.LAYER_LOCATION, new ModelArgus<>(modelSet.bakeLayer(ModelArgus.LAYER_LOCATION)),"textures/models/armor/argus/argus.png");
        registerArmorModel(modelSet, ProjectSpartanItems.ARGUS_HELMET, ModelArgusHelmet.LAYER_LOCATION, new ModelArgusHelmet<>(modelSet.bakeLayer(ModelArgusHelmet.LAYER_LOCATION)),"textures/models/armor/argus/argus.png");
        registerArmorModel(modelSet, ProjectSpartanItems.ATLAS_BODY, ModelAtlas.LAYER_LOCATION, new ModelAtlas<>(modelSet.bakeLayer(ModelAtlas.LAYER_LOCATION)), "textures/models/armor/atlas/atlas.png");
        registerArmorModel(modelSet, ProjectSpartanItems.ATLAS_HELMET, ModelAtlasHelmet.LAYER_LOCATION, new ModelAtlasHelmet<>(modelSet.bakeLayer(ModelAtlasHelmet.LAYER_LOCATION)), "textures/models/armor/atlas/atlas.png");
        registerArmorModel(modelSet, ProjectSpartanItems.MKVIG1_BODY, ModelMKVI_G1.LAYER_LOCATION, new ModelMKVI_G1<>(modelSet.bakeLayer(ModelMKVI_G1.LAYER_LOCATION)), "textures/models/armor/mkvi/mkvimjolnir.png");
        registerArmorModel(modelSet, ProjectSpartanItems.MKVIG1_HELMET, ModelMKVI_G1_Helmet.LAYER_LOCATION, new ModelMKVI_G1_Helmet<>(modelSet.bakeLayer(ModelMKVI_G1_Helmet.LAYER_LOCATION)), "textures/models/armor/mkvi/mkvimjolnir.png");
        registerArmorModel(modelSet, ProjectSpartanItems.MKVG1_BODY, ModelMKV_G1.LAYER_LOCATION, new ModelMKV_G1<>(modelSet.bakeLayer(ModelMKV_G1.LAYER_LOCATION)), "textures/models/armor/mkv/mjolnirmkv_green.png");
        registerArmorModel(modelSet, ProjectSpartanItems.MKVG1_HELMET, ModelMKV_G1_Helmet.LAYER_LOCATION, new ModelMKV_G1_Helmet<>(modelSet.bakeLayer(ModelMKV_G1_Helmet.LAYER_LOCATION)), "textures/models/armor/mkv/mjolnirmkv_green.png");
        registerArmorModel(modelSet, ProjectSpartanItems.BUCCANEER_BODY, ModelBuccaneer.LAYER_LOCATION, new ModelBuccaneer<>(modelSet.bakeLayer(ModelBuccaneer.LAYER_LOCATION)), "textures/models/armor/buccaneer/buccaneer.png");
        registerArmorModel(modelSet, ProjectSpartanItems.BUCCANEER_HELMET, ModelBuccaneerHelmet.LAYER_LOCATION, new ModelBuccaneerHelmet<>(modelSet.bakeLayer(ModelBuccaneerHelmet.LAYER_LOCATION)), "textures/models/armor/buccaneer/buccaneer.png");
        registerArmorModel(modelSet, ProjectSpartanItems.BUCCANEER_BODY_GREEN, ModelBuccaneer.LAYER_LOCATION, new ModelBuccaneer<>(modelSet.bakeLayer(ModelBuccaneer.LAYER_LOCATION)), "textures/models/armor/buccaneer/buccaneer_green.png");
        registerArmorModel(modelSet, ProjectSpartanItems.BUCCANEER_HELMET_GREEN, ModelBuccaneerHelmet.LAYER_LOCATION, new ModelBuccaneerHelmet<>(modelSet.bakeLayer(ModelBuccaneerHelmet.LAYER_LOCATION)), "textures/models/armor/buccaneer/buccaneer_green.png");
        registerArmorModel(modelSet, ProjectSpartanItems.OCEANIC_BODY, ModelOceanic.LAYER_LOCATION, new ModelOceanic<>(modelSet.bakeLayer(ModelOceanic.LAYER_LOCATION)), "textures/models/armor/oceanic/oceanic.png");
        registerArmorModel(modelSet, ProjectSpartanItems.OCEANIC_HELMET, ModelOceanicHelmet.LAYER_LOCATION, new ModelOceanicHelmet<>(modelSet.bakeLayer(ModelOceanicHelmet.LAYER_LOCATION)), "textures/models/armor/oceanic/oceanic.png");
        registerArmorModel(modelSet, ProjectSpartanItems.ODST_G1_BODY, ModelOdstG1.LAYER_LOCATION, new ModelOdstG1<>(modelSet.bakeLayer(ModelOdstG1.LAYER_LOCATION)), "textures/models/armor/odst/odstgreen.png");
        registerArmorModel(modelSet, ProjectSpartanItems.ODST_G1_HELMET, ModelOdstG1Helmet.LAYER_LOCATION, new ModelOdstG1Helmet<>(modelSet.bakeLayer(ModelOdstG1Helmet.LAYER_LOCATION)), "textures/models/armor/odst/odstgreen.png");
    }

    private <T extends LivingEntity> void registerArmorModel(EntityModelSet modelSet, RegistryObject<Item> item, ModelLayerLocation layer, HumanoidModel<T> model, String texture) {
        ((SpartanArmorItem) item.get())
                .setArmorModel(model)
                .setArmorTexture(texture);
    }
}
