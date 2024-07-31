package net.hero61.projectspartan.entity.client;


import com.mojang.blaze3d.vertex.PoseStack;
import net.hero61.projectspartan.ProjectSpartan;
import net.hero61.projectspartan.entity.client.model.AirAssaultEntity;
import net.hero61.projectspartan.entity.custom.SpartanEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class SpartanEntityRenderer extends MobRenderer<SpartanEntity, AirAssaultEntity<SpartanEntity>> {
    public SpartanEntityRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new AirAssaultEntity<>(pContext.bakeLayer(ModModelLayers.SPARTAN_LAYER)), 2f);
    }

    @Override
    public ResourceLocation getTextureLocation(SpartanEntity pEntity) {
        return new ResourceLocation(ProjectSpartan.MOD_ID, "textures/models/armor/airassault/airassault.png");
    }

    @Override
    public void render(SpartanEntity pEntity, float pEntityYaw, float pPartialTicks, PoseStack pMatrixStack,
                       MultiBufferSource pBuffer, int pPackedLight) {
        if(pEntity.isBaby()) {
            pMatrixStack.scale(0.5f, 0.5f, 0.5f);
        }

        super.render(pEntity, pEntityYaw, pPartialTicks, pMatrixStack, pBuffer, pPackedLight);
    }
}
