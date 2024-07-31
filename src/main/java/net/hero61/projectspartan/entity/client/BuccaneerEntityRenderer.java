package net.hero61.projectspartan.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.hero61.projectspartan.ProjectSpartan;
import net.hero61.projectspartan.entity.client.model.BuccaneerEntityModel;
import net.hero61.projectspartan.entity.custom.BuccaneerEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class BuccaneerEntityRenderer extends MobRenderer<BuccaneerEntity, BuccaneerEntityModel<BuccaneerEntity>> {
    public BuccaneerEntityRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new BuccaneerEntityModel<>(pContext.bakeLayer(ModModelLayers.SPARTAN_BUCCANEER_LAYER)), 2f);
    }

    @Override
    public ResourceLocation getTextureLocation(BuccaneerEntity pEntity) {
        return new ResourceLocation(ProjectSpartan.MOD_ID, "textures/models/armor/buccaneer/buccaneer.png");
    }

    @Override
    public void render(BuccaneerEntity pEntity, float pEntityYaw, float pPartialTicks, PoseStack pMatrixStack,
                       MultiBufferSource pBuffer, int pPackedLight) {
        if(pEntity.isBaby()) {
            pMatrixStack.scale(0.5f, 0.5f, 0.5f);
        }

        super.render(pEntity, pEntityYaw, pPartialTicks, pMatrixStack, pBuffer, pPackedLight);
    }
}