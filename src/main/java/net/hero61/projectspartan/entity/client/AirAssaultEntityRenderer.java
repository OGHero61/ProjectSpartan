package net.hero61.projectspartan.entity.client;


import com.mojang.blaze3d.vertex.PoseStack;
import net.hero61.projectspartan.ProjectSpartan;
import net.hero61.projectspartan.entity.client.model.AirAssaultEntityModel;
import net.hero61.projectspartan.entity.custom.AirAssaultEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class AirAssaultEntityRenderer extends MobRenderer<AirAssaultEntity, AirAssaultEntityModel<AirAssaultEntity>> {
    public AirAssaultEntityRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new AirAssaultEntityModel<>(pContext.bakeLayer(ModModelLayers.SPARTAN_AIRASSAULT_LAYER)), 2f);
    }

    @Override
    public ResourceLocation getTextureLocation(AirAssaultEntity pEntity) {
        return new ResourceLocation(ProjectSpartan.MOD_ID, "textures/models/armor/airassault/airassault.png");
    }

    @Override
    public void render(AirAssaultEntity pEntity, float pEntityYaw, float pPartialTicks, PoseStack pMatrixStack,
                       MultiBufferSource pBuffer, int pPackedLight) {
        if(pEntity.isBaby()) {
            pMatrixStack.scale(0.5f, 0.5f, 0.5f);
        }

        super.render(pEntity, pEntityYaw, pPartialTicks, pMatrixStack, pBuffer, pPackedLight);
    }
}
