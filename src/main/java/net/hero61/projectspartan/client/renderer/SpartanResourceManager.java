package net.hero61.projectspartan.client.renderer;

import net.hero61.projectspartan.client.model.item.model.armor.ModelBuccaneer;
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

        setBuccaneerRenderer(modelSet, ProjectSpartanItems.BUCCANEER, "textures/models/armor/buccaneer/buccaneer.png");
        setBuccaneerRenderer(modelSet, ProjectSpartanItems.BUCCANEER_GREEN, "textures/models/armor/buccaneer/buccaneer_green.json.png");
}
        private void setBuccaneerRenderer(EntityModelSet modelSet, RegistryObject<Item> item, String texture) {
            ((SpartanArmorItem) item.get())
                    .setArmorModel(new ModelBuccaneer<>(modelSet.bakeLayer(ModelBuccaneer.LAYER_LOCATION)))
                    .setArmorTexture(texture);

    }
}
