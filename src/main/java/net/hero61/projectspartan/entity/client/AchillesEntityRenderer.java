package net.hero61.projectspartan.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.hero61.projectspartan.ProjectSpartan;
import net.hero61.projectspartan.entity.client.model.AchillesEntityModel;
import net.hero61.projectspartan.entity.custom.AchillesEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class AchillesEntityRenderer extends MobRenderer<AchillesEntity, AchillesEntityModel<AchillesEntity>> {
        public AchillesEntityRenderer(EntityRendererProvider.Context pContext) {
            super(pContext, new AchillesEntityModel<>(pContext.bakeLayer(ModModelLayers.SPARTAN_ACHILLES_LAYER)), 2f);
        }

        @Override
        public ResourceLocation getTextureLocation(AchillesEntity pEntity) {
            return new ResourceLocation(ProjectSpartan.MOD_ID, "textures/models/armor/achilles/achilles.png");
        }

        @Override
        public void render(AchillesEntity pEntity, float pEntityYaw, float pPartialTicks, PoseStack pMatrixStack,
                           MultiBufferSource pBuffer, int pPackedLight) {
            if(pEntity.isBaby()) {
                pMatrixStack.scale(0.5f, 0.5f, 0.5f);
            }

            super.render(pEntity, pEntityYaw, pPartialTicks, pMatrixStack, pBuffer, pPackedLight);
        }
}

