package net.hero61.projectspartan.client.model.item.model.armor.argonaut;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.hero61.projectspartan.ProjectSpartan;
import net.hero61.projectspartan.util.ModelUtils;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.LivingEntity;

public class ModelArgonautHelmet<T extends LivingEntity> extends HumanoidModel<T> {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
            new ResourceLocation(ProjectSpartan.MOD_ID, "argonaut_helmet"), "main");
    public ModelArgonautHelmet(ModelPart modelPart) {
        super(modelPart);
    }

    public static LayerDefinition createLayer() {
        MeshDefinition definition = ModelUtils.createBlankHumanoidMesh();
        PartDefinition root = definition.getRoot();

        PartDefinition head = root.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

        head.addOrReplaceChild("helmet2", CubeListBuilder.create().texOffs(2, 70).mirror().addBox(-4.0F, -3.1F, -3.73F, 8.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.409F, 0.0F, 0.0F));

        head.addOrReplaceChild("helmet3", CubeListBuilder.create().texOffs(460, 133).mirror().addBox(-1.0F, -1.2F, -4.9F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2603F, 0.0F, 0.0F));

        head.addOrReplaceChild("helmet5", CubeListBuilder.create().texOffs(6, 148).mirror().addBox(-4.0F, 0.1F, -4.7F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.5205F, 0.0F, 0.0F));

        head.addOrReplaceChild("helmet11", CubeListBuilder.create().texOffs(2, 190).mirror().addBox(-1.0F, -8.8F, -3.15F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0372F, 0.0F, 0.0F));

        head.addOrReplaceChild("helmet12", CubeListBuilder.create().texOffs(2, 210).mirror().addBox(-4.0F, -8.8F, -3.15F, 3.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0372F, 0.0F, 0.0F));

        head.addOrReplaceChild("helmet14", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -4.0F, 0.0F, -1.4466F, 0.0F, 0.0F));

        head.addOrReplaceChild("helmet7", CubeListBuilder.create().texOffs(317, 224).mirror().addBox(-4.0F, 2.1907F, -5.2226F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -4.0F, 0.0F, -1.4466F, 0.0F, 0.0F));

        head.addOrReplaceChild("helmet4", CubeListBuilder.create().texOffs(263, 240).mirror().addBox(-3.0F, -2.2106F, -6.8818F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -4.0F, 0.0F, -0.5236F, 0.0F, 0.0F));

        head.addOrReplaceChild("helmet41", CubeListBuilder.create().texOffs(444, 59).mirror().addBox(-2.6317F, -3.3721F, -6.7023F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.7F, -4.6F, 0.7F));

        head.addOrReplaceChild("helmet47", CubeListBuilder.create().texOffs(443, 59).mirror().addBox(-0.7683F, -3.3721F, -6.7023F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.7F, -4.6F, 0.7F));

        head.addOrReplaceChild("helmet46", CubeListBuilder.create().texOffs(444, 59).mirror().addBox(-1.7F, -3.7112F, -6.5717F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.7F, -4.6F, 0.7F));

        head.addOrReplaceChild("helmet44", CubeListBuilder.create().texOffs(444, 59).mirror().addBox(-0.1212F, -3.59F, -6.6444F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.7F, -4.6F, 0.7F, 0.0F, 0.1309F, 0.3491F));

        head.addOrReplaceChild("helmet45", CubeListBuilder.create().texOffs(444, 59).mirror().addBox(-2.1831F, -4.0688F, -6.4727F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.7F, -4.6F, 0.7F, 0.0F, -0.1309F, -0.3491F));

        head.addOrReplaceChild("helmet42", CubeListBuilder.create().texOffs(339, 126).mirror().addBox(-1.2F, -2.1874F, -6.022F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.7F, -5.7F, -0.1F));

        head.addOrReplaceChild("helmet15", CubeListBuilder.create().texOffs(266, 219).mirror().addBox(-0.1781F, -2.1747F, -6.7122F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -4.0F, 0.0F, -0.5672F, 0.3491F, -0.2182F));

        head.addOrReplaceChild("helmet16", CubeListBuilder.create().texOffs(266, 219).addBox(1.8478F, -2.1873F, -8.3038F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -4.0F, 0.0F, -0.5672F, -0.3491F, 0.2182F));

        head.addOrReplaceChild("helmet10", CubeListBuilder.create().texOffs(263, 239).mirror().addBox(-2.8167F, -3.6233F, -6.5275F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -4.0F, 0.0F, 0.0F, 0.3491F, 0.0F));

        head.addOrReplaceChild("helmet17", CubeListBuilder.create().texOffs(263, 240).mirror().addBox(-2.3197F, -4.2341F, -5.9614F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -4.0F, 0.0F, 0.0F, 0.0436F, -0.2182F));

        head.addOrReplaceChild("helmet29", CubeListBuilder.create().texOffs(262, 240).mirror().addBox(-2.0474F, -4.0561F, -5.8545F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, -4.0F, 0.0F));

        head.addOrReplaceChild("helmet13", CubeListBuilder.create().texOffs(264, 240).mirror().addBox(0.5775F, -4.2341F, -5.8545F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.2182F));

        head.addOrReplaceChild("helmet22", CubeListBuilder.create().texOffs(262, 239).mirror().addBox(0.8167F, 1.3767F, -6.5275F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -9.0F, 0.0F, 0.0F, -0.3491F, 0.0F));

        head.addOrReplaceChild("helmet6", CubeListBuilder.create().texOffs(261, 240).mirror().addBox(0.0F, -2.2106F, -6.8818F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -4.0F, 0.0F, -0.5236F, 0.0F, 0.0F));

        head.addOrReplaceChild("helmet8", CubeListBuilder.create().texOffs(462, 364).mirror().addBox(0.0F, -1.3541F, -7.2194F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -4.0F, 0.0F, -0.7854F, 0.0F, 0.0F));

        head.addOrReplaceChild("helmet9", CubeListBuilder.create().texOffs(484, 321).mirror().addBox(-3.0F, -1.3541F, -7.2194F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -4.0F, 0.0F, -0.7854F, 0.0F, 0.0F));

        head.addOrReplaceChild("helmet33", CubeListBuilder.create().texOffs(486, 321).mirror().addBox(1.7029F, -1.7011F, -6.2484F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.0F, -4.0F, 0.0F, -0.7854F, 0.3054F, -0.2618F));

        head.addOrReplaceChild("helmet40", CubeListBuilder.create().texOffs(486, 321).mirror().addBox(-4.6241F, -1.7234F, -5.86F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(5.0F, -4.0F, 0.0F, -0.7854F, -0.3054F, 0.2618F));

        head.addOrReplaceChild("helmet18", CubeListBuilder.create().texOffs(0, 309).mirror().addBox(-4.6F, -3.1F, -4.59F, 3.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.0F, 1.2F, 0.2614F, -0.0928F, -0.0248F));

        head.addOrReplaceChild("helmet38", CubeListBuilder.create().texOffs(0, 309).mirror().addBox(-4.6F, -3.0F, -4.79F, 3.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(6.5F, 0.0F, 0.8F, 0.2614F, 0.0928F, 0.0248F));

        head.addOrReplaceChild("helmet19", CubeListBuilder.create().texOffs(456, 48).mirror().addBox(-4.5F, -6.1F, 0.0F, 9.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2974F, 0.0F, 0.0F));

        head.addOrReplaceChild("helmet20", CubeListBuilder.create().texOffs(440, 327).mirror().addBox(-4.8F, -4.9F, 1.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2603F, 0.0F, 0.0F));

        head.addOrReplaceChild("helmet51", CubeListBuilder.create().texOffs(440, 327).mirror().addBox(-5.4F, -4.9F, 1.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(8.2F, 0.0F, 0.0F, 0.2603F, 0.0F, 0.0F));

        head.addOrReplaceChild("helmet21", CubeListBuilder.create().texOffs(5, 372).mirror().addBox(-4.5F, -6.27F, -3.45F, 9.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2603F, 0.0F, 0.0F));

        head.addOrReplaceChild("helmet23", CubeListBuilder.create().texOffs(393, 287).mirror().addBox(-3.0F, -5.0F, 3.8F, 6.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2231F, 0.0F, 0.0F));

        head.addOrReplaceChild("helmet24", CubeListBuilder.create().texOffs(2, 430).mirror().addBox(-1.0F, -8.9797F, -0.4767F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2974F, 0.0F, 0.0F));

        head.addOrReplaceChild("helmet25", CubeListBuilder.create().texOffs(3, 450).mirror().addBox(-4.0F, -8.9797F, -0.4767F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2974F, 0.0F, 0.0F));

        head.addOrReplaceChild("helmet26", CubeListBuilder.create().texOffs(2, 470).mirror().addBox(0.0F, -8.2909F, -3.7705F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.8923F, 0.0F, 0.0F));

        head.addOrReplaceChild("helmet27", CubeListBuilder.create().texOffs(3, 490).mirror().addBox(-4.0F, -8.2909F, -3.7705F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.8923F, 0.0F, 0.0F));

        head.addOrReplaceChild("helmet28", CubeListBuilder.create().texOffs(78, 48).mirror().addBox(-6.8F, -6.9F, -4.0F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 0.5F, 0.0F, -0.1745F, 0.0F, 0.3346F));

        head.addOrReplaceChild("helmet55", CubeListBuilder.create().texOffs(80, 50).mirror().addBox(-7.0F, -7.0F, -4.4F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1F, 0.1F, 1.4F, 0.0F, 0.0F, 0.3346F));

        head.addOrReplaceChild("helmet30", CubeListBuilder.create().texOffs(80, 90).mirror().addBox(-6.8F, -6.3F, 2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.3346F));

        head.addOrReplaceChild("helmet31", CubeListBuilder.create().texOffs(119, 3).mirror().addBox(-4.0F, -7.5592F, 3.3901F, 8.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0436F, 0.0F, 0.0F));

        head.addOrReplaceChild("helmet32", CubeListBuilder.create().texOffs(298, 128).mirror().addBox(5.5F, -7.2F, -4.0F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3F, 0.6F, 0.0F, -0.1745F, 0.0F, -0.2974F));

        head.addOrReplaceChild("helmet54", CubeListBuilder.create().texOffs(300, 130).mirror().addBox(5.6F, -7.3F, -4.1F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1F, 0.0F, 1.1F, 0.0F, 0.0F, -0.2974F));

        head.addOrReplaceChild("helmet34", CubeListBuilder.create().texOffs(300, 170).mirror().addBox(5.5F, -6.6F, 2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2974F));

        head.addOrReplaceChild("helmet35", CubeListBuilder.create().texOffs(80, 170).mirror().addBox(-4.51F, -6.0F, 3.5F, 9.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2231F, 0.0F, 0.0F));

        head.addOrReplaceChild("helmet36", CubeListBuilder.create().texOffs(436, 71).mirror().addBox(-4.1564F, -7.346F, -3.0F, 2.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.0873F));

        head.addOrReplaceChild("helmet37", CubeListBuilder.create().texOffs(463, 115).addBox(2.1F, -7.2592F, -3.0F, 2.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0873F));

        head.addOrReplaceChild("helmet39", CubeListBuilder.create().texOffs(81, 110).mirror().addBox(-3.45F, -1.8F, 3.1F, 8.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.5949F, 0.0F, 0.0F));

        head.addOrReplaceChild("helmet63", CubeListBuilder.create().texOffs(81, 110).addBox(-3.6F, -1.8F, 3.1F, 8.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.0F, 0.0F, 0.5949F, 0.0F, 0.0F));

        head.addOrReplaceChild("helmet43", CubeListBuilder.create().texOffs(400, 246).mirror().addBox(0.0F, -8.5F, 4.3F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 2.0F, 0.8F, 0.1309F, 0.0F, 0.0F));

        head.addOrReplaceChild("helmet48", CubeListBuilder.create().texOffs(403, 80).mirror().addBox(-4.5194F, -4.6056F, -1.8781F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2603F, 0.0F, 0.0F));

        head.addOrReplaceChild("helmet49", CubeListBuilder.create().texOffs(399, 130).addBox(3.4292F, -4.5291F, -1.8985F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2603F, 0.0F, 0.0F));

        head.addOrReplaceChild("helmet52", CubeListBuilder.create().texOffs(450, 190).mirror().addBox(-4.1F, -7.4F, -3.8F, 8.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1487F, 0.0F, 0.0F));

        head.addOrReplaceChild("helmet53", CubeListBuilder.create().texOffs(450, 170).mirror().addBox(3.1F, -7.4F, -3.81F, 1.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1487F, 0.0F, 0.0F));

        head.addOrReplaceChild("helmet57", CubeListBuilder.create().texOffs(450, 150).mirror().addBox(-2.0F, -5.65F, -3.55F, 4.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2231F, 0.0F, 0.0F));

        head.addOrReplaceChild("helmet58", CubeListBuilder.create().texOffs(450, 90).mirror().addBox(-4.2521F, -2.8922F, -3.8562F, 5.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.1F, -0.1F, 0.1487F, 0.0F, 0.1745F));

        head.addOrReplaceChild("helmet59", CubeListBuilder.create().texOffs(448, 90).addBox(-0.7479F, -2.8922F, -3.8562F, 5.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.1F, -0.1F, 0.1487F, 0.0F, -0.1745F));

        head.addOrReplaceChild("helmet61", CubeListBuilder.create().texOffs(400, 0).mirror().addBox(-3.2F, -3.55F, -3.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.0F, 0.0F, 0.2602F, 0.0F, 0.0F));

        head.addOrReplaceChild("helmet62", CubeListBuilder.create().texOffs(399, 255).mirror().addBox(-3.526F, -5.4499F, 5.0017F, 8.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, -0.1F, 0.0F, 1.4879F, 0.0F, 0.0F));

        head.addOrReplaceChild("helmet50", CubeListBuilder.create().texOffs(399, 255).mirror().addBox(-4.474F, -5.4499F, 5.0017F, 8.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.7F, -0.1F, 0.0F, 1.4879F, 0.0F, 0.0F));

        head.addOrReplaceChild("helmet65", CubeListBuilder.create().texOffs(399, -1).addBox(2.2F, -3.55F, -3.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.0F, 0.0F, 0.2602F, 0.0F, 0.0F));

        head.addOrReplaceChild("helmet68", CubeListBuilder.create().texOffs(396, 108).addBox(-4.2F, -6.3F, -3.6F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, 0.0F, -0.0175F, 0.0F, 0.0F));

        head.addOrReplaceChild("helmet69", CubeListBuilder.create().texOffs(401, 52).mirror().addBox(1.2F, -6.6F, -3.6F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.0F, 0.0F, -0.0175F, 0.0F, 0.0F));

        head.addOrReplaceChild("helmet70", CubeListBuilder.create().texOffs(300, 0).mirror().addBox(-4.0F, -4.0F, 3.1F, 8.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

        head.addOrReplaceChild("helmet71", CubeListBuilder.create().texOffs(398, 62).mirror().addBox(-4.1F, -4.0F, -1.0F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

        head.addOrReplaceChild("helmet72", CubeListBuilder.create().texOffs(300, 0).mirror().addBox(-4.1F, -1.0F, -3.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

        head.addOrReplaceChild("helmet73", CubeListBuilder.create().texOffs(300, 0).addBox(3.1F, -1.0F, -3.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        head.addOrReplaceChild("helmet74", CubeListBuilder.create().texOffs(398, 62).addBox(3.1F, -4.0F, -1.0F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        head.addOrReplaceChild("helmet75", CubeListBuilder.create().texOffs(300, 0).mirror().addBox(-4.0F, -0.9F, -4.0F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

        head.addOrReplaceChild("helmet1", CubeListBuilder.create().texOffs(372, 345).mirror().addBox(-1.0F, -3.1602F, -3.9082F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.2F, -0.3F, 0.409F, 0.0F, 0.0F));

        head.addOrReplaceChild("helmet60", CubeListBuilder.create().texOffs(382, 344).mirror().addBox(2.7937F, -1.1719F, -1.2873F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.2F, -5.3F, 0.5F, -0.5926F, -0.2962F));

        head.addOrReplaceChild("helmet56", CubeListBuilder.create().texOffs(382, 344).mirror().addBox(1.1725F, -3.1602F, -2.4919F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.2F, -0.3F, 0.5F, 0.5926F, 0.2962F));

        return LayerDefinition.create(definition, 512, 512);
    }

    @Override
    public void renderToBuffer(PoseStack matrixStack, VertexConsumer vertexConsumer, int p_225598_3_, int p_225598_4_, float p_225598_5_, float p_225598_6_, float p_225598_7_, float p_225598_8_) {
        this.leftLeg.visible = true;
        this.rightArm.visible = true;
        this.rightLeg.visible = true;
        this.leftArm.visible =true;
        this.head.visible = true;
        this.body.visible = true;
        super.renderToBuffer(matrixStack, vertexConsumer, p_225598_3_, p_225598_4_, p_225598_5_, p_225598_6_, p_225598_7_, p_225598_8_);
    }
}
