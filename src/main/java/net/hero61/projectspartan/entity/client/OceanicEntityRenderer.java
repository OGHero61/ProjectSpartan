package net.hero61.projectspartan.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.hero61.projectspartan.ProjectSpartan;
import net.hero61.projectspartan.entity.client.model.OceanicEntityModel;
import net.hero61.projectspartan.entity.custom.OceanicEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class OceanicEntityRenderer extends MobRenderer<OceanicEntity, OceanicEntityModel<OceanicEntity>> {
    public OceanicEntityRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new OceanicEntityModel<>(pContext.bakeLayer(ModModelLayers.SPARTAN_OCEANIC_LAYER)), 2f);
    }

    @Override
    public ResourceLocation getTextureLocation(OceanicEntity pEntity) {
        return new ResourceLocation(ProjectSpartan.MOD_ID, "textures/models/armor/oceanic/oceanic.png");
    }

    @Override
    public void render(OceanicEntity pEntity, float pEntityYaw, float pPartialTicks, PoseStack pMatrixStack,
                       MultiBufferSource pBuffer, int pPackedLight) {
        if(pEntity.isBaby()) {
            pMatrixStack.scale(0.5f, 0.5f, 0.5f);
        }

        super.render(pEntity, pEntityYaw, pPartialTicks, pMatrixStack, pBuffer, pPackedLight);
    }
}