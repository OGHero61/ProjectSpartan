package net.hero61.projectspartan.client.model.item.model.armor.Oceanic;

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

public class ModelOceanicHelmet<T extends LivingEntity> extends HumanoidModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation(ProjectSpartan.MOD_ID, "oceanic_helmet"), "main");
	public ModelOceanicHelmet(ModelPart modelPart) {
		super(modelPart);
	}

	public static LayerDefinition createLayer() {
		MeshDefinition definition = ModelUtils.createBlankHumanoidMesh();
		PartDefinition root = definition.getRoot();

		PartDefinition head = root.addOrReplaceChild("head", CubeListBuilder.create().texOffs(392, 432).mirror().addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet2", CubeListBuilder.create().texOffs(374, 369).mirror().addBox(-2.0F, -3.1F, -3.6F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.409F, 0.0F, 0.0F));

		 head.addOrReplaceChild("helmet63", CubeListBuilder.create().texOffs(1, 71).mirror().addBox(-4.0F, -0.5F, -4.25F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2618F, 0.0F, 0.0F));

		 head.addOrReplaceChild("helmet64", CubeListBuilder.create().texOffs(1, 71).mirror().addBox(1.0F, -0.5F, -4.25F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2618F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet3", CubeListBuilder.create().texOffs(347, 300).mirror().addBox(-1.0F, -1.1F, -4.7F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2603F, 0.0F, 0.0F));

		 head.addOrReplaceChild("helmet11", CubeListBuilder.create().texOffs(1, 191).mirror().addBox(1.0F, -8.8F, -2.15F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0372F, 0.0F, 0.0F));

		 head.addOrReplaceChild("helmet12", CubeListBuilder.create().texOffs(1, 211).mirror().addBox(-4.0F, -8.8F, -2.15F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0372F, 0.0F, 0.0F));

		 head.addOrReplaceChild("helmet10", CubeListBuilder.create().texOffs(1, 211).mirror().addBox(-1.0F, -9.0F, -2.15F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0372F, 0.0F, 0.0F));

		 head.addOrReplaceChild("helmet14", CubeListBuilder.create().texOffs(450, 215).addBox(0.1F, 1.0931F, -4.7466F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.0F, 0.0F, -1.4466F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet7", CubeListBuilder.create().texOffs(451, 215).mirror().addBox(-4.1F, 1.0931F, -4.7466F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -4.0F, 0.0F, -1.4466F, 0.0F, 0.0F));

		 head.addOrReplaceChild("helmet22", CubeListBuilder.create().texOffs(390, 299).mirror().addBox(-0.5F, 1.0022F, -5.004F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -4.0F, 0.0F, -1.403F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet4", CubeListBuilder.create().texOffs(453, 190).mirror().addBox(-4.11F, -0.9527F, -5.5896F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -4.0F, 0.0F, -0.5236F, 0.0F, 0.0F));

		 head.addOrReplaceChild("helmet16", CubeListBuilder.create().texOffs(379, 319).mirror().addBox(-0.5F, -0.7721F, -5.8165F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -4.0F, 0.0F, -0.5236F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet6", CubeListBuilder.create().texOffs(452, 190).mirror().addBox(0.11F, -0.9527F, -5.5896F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -4.0F, 0.0F, -0.5236F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet8", CubeListBuilder.create().texOffs(452, 190).mirror().addBox(0.12F, -0.4735F, -5.67F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -4.0F, 0.0F, -0.7854F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet9", CubeListBuilder.create().texOffs(452, 190).mirror().addBox(-4.12F, -0.4735F, -5.67F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -4.0F, 0.0F, -0.7854F, 0.0F, 0.0F));

		 head.addOrReplaceChild("helmet17", CubeListBuilder.create().texOffs(364, 351).mirror().addBox(-0.5F, -0.2403F, -5.8181F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -4.0F, 0.0F, -0.7854F, 0.0F, 0.0F));

		 head.addOrReplaceChild("helmet29", CubeListBuilder.create().texOffs(364, 351).mirror().addBox(-0.5F, -0.45F, -5.8181F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -4.0F, 0.0F, -0.7854F, 0.0F, 0.0F));

		 head.addOrReplaceChild("helmet18", CubeListBuilder.create().texOffs(236, 304).mirror().addBox(2.51F, -2.9F, -3.69F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2603F, 0.0F, 0.0F));

		 head.addOrReplaceChild("helmet65", CubeListBuilder.create().texOffs(237, 304).mirror().addBox(-4.51F, -2.9F, -3.69F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2603F, 0.0F, 0.0F));

		 head.addOrReplaceChild("helmet56", CubeListBuilder.create().texOffs(0, 310).mirror().addBox(-4.2F, -1.7F, -3.69F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.0F, 0.0F, 0.2603F, -0.0873F, 0.2618F));

		 head.addOrReplaceChild("helmet60", CubeListBuilder.create().texOffs(0, 310).mirror().addBox(5.1F, -1.1F, -3.69F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.0F, 0.0F, 0.2603F, 0.0873F, -0.2618F));

		 head.addOrReplaceChild("helmet19", CubeListBuilder.create().texOffs(0, 329).mirror().addBox(-4.5F, -6.1F, 0.0F, 9.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2974F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet20", CubeListBuilder.create().texOffs(440, 326).mirror().addBox(-5.0F, -5.9F, 0.5F, 10.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, -1.0F));

		 head.addOrReplaceChild("helmet54", CubeListBuilder.create().texOffs(440, 326).mirror().addBox(-5.0F, -4.9F, 0.5F, 10.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, -1.0F));

		head.addOrReplaceChild("helmet5", CubeListBuilder.create().texOffs(394, 331).mirror().addBox(4.01F, -5.4F, 0.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, -1.0F));

		 head.addOrReplaceChild("helmet66", CubeListBuilder.create().texOffs(394, 337).addBox(-5.01F, -5.4F, 0.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, -1.0F));

		 head.addOrReplaceChild("helmet44", CubeListBuilder.create().texOffs(441, 327).mirror().addBox(-5.0F, -4.8595F, 2.383F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, -1.0F, 0.5236F, 0.0F, 0.0F));

		 head.addOrReplaceChild("helmet45", CubeListBuilder.create().texOffs(441, 327).mirror().addBox(-5.0F, -6.3595F, -0.7849F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, -1.0F, -0.5236F, 0.0F, 0.0F));

		 head.addOrReplaceChild("helmet46", CubeListBuilder.create().texOffs(455, 356).addBox(-5.0F, -5.4F, 2.366F, 10.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, -1.0F));

		 head.addOrReplaceChild("helmet47", CubeListBuilder.create().texOffs(441, 327).mirror().addBox(-5.0F, -2.2615F, 3.6151F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, -1.0F, 0.5236F, 0.0F, 0.0F));

		 head.addOrReplaceChild("helmet50", CubeListBuilder.create().texOffs(441, 327).mirror().addBox(-5.0F, -5.4F, -0.366F, 10.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, -1.0F));

		 head.addOrReplaceChild("helmet51", CubeListBuilder.create().texOffs(441, 327).mirror().addBox(-5.0F, -3.7615F, -2.017F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, -1.0F, -0.5236F, 0.0F, 0.0F));

		 head.addOrReplaceChild("helmet21", CubeListBuilder.create().texOffs(2, 372).mirror().addBox(-4.5F, -6.27F, -3.45F, 9.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2603F, 0.0F, 0.0F));

		 head.addOrReplaceChild("helmet23", CubeListBuilder.create().texOffs(464, 117).mirror().addBox(18.5F, -6.7F, 4.8F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-20.0F, 0.0F, 0.0F, 0.1309F, 0.0F, 0.0F));

		 head.addOrReplaceChild("helmet24", CubeListBuilder.create().texOffs(0, 430).mirror().addBox(1.01F, -8.9797F, -0.4767F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2974F, 0.0F, 0.0F));

		 head.addOrReplaceChild("helmet13", CubeListBuilder.create().texOffs(1, 430).mirror().addBox(-1.0F, -9.173F, -0.5282F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2974F, 0.0F, 0.0F));

		 head.addOrReplaceChild("helmet25", CubeListBuilder.create().texOffs(0, 450).mirror().addBox(-4.01F, -8.9797F, -0.4767F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2974F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet26", CubeListBuilder.create().texOffs(1, 470).mirror().addBox(-0.98F, -8.2909F, -3.7705F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.8923F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet15", CubeListBuilder.create().texOffs(1, 470).mirror().addBox(-1.0F, -8.4221F, -3.9215F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.8923F, 0.0F, 0.0F));

		 head.addOrReplaceChild("helmet27", CubeListBuilder.create().texOffs(1, 490).mirror().addBox(-4.02F, -8.2909F, -3.7705F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.8923F, 0.0F, 0.0F));

		 head.addOrReplaceChild("helmet28", CubeListBuilder.create().texOffs(81, 51).mirror().addBox(-6.8F, -7.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.3346F));

		 head.addOrReplaceChild("helmet30", CubeListBuilder.create().texOffs(80, 90).mirror().addBox(-6.8F, -6.0F, 2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.3346F));

		 head.addOrReplaceChild("helmet31", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-4.0F, -6.682F, 4.636F, 8.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1309F, 0.0F, 0.0F));

		 head.addOrReplaceChild("helmet32", CubeListBuilder.create().texOffs(301, 131).mirror().addBox(5.5F, -7.2F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2974F));

		 head.addOrReplaceChild("helmet34", CubeListBuilder.create().texOffs(300, 170).mirror().addBox(5.5F, -6.2F, 2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2974F));

		 head.addOrReplaceChild("helmet35", CubeListBuilder.create().texOffs(80, 170).mirror().addBox(-4.51F, -6.0F, 3.5F, 9.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2231F, 0.0F, 0.0F));

		 head.addOrReplaceChild("helmet36", CubeListBuilder.create().texOffs(254, 276).mirror().addBox(-4.1564F, -7.346F, -2.0F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.0873F));

		 head.addOrReplaceChild("helmet37", CubeListBuilder.create().texOffs(254, 276).addBox(3.0735F, -7.2592F, -2.0F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0873F));

		 head.addOrReplaceChild("helmet38", CubeListBuilder.create().texOffs(83, 193).mirror().addBox(5.5427F, -5.1234F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.3054F));

		 head.addOrReplaceChild("helmet39", CubeListBuilder.create().texOffs(80, 110).mirror().addBox(-4.5F, -1.8F, 3.1F, 9.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.5949F, 0.0F, 0.0F));

		 head.addOrReplaceChild("helmet43", CubeListBuilder.create().texOffs(434, 51).addBox(0.0F, -8.5F, 3.1F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 2.0F, 2.0F, 0.1309F, 0.0F, 0.0F));

		 head.addOrReplaceChild("helmet48", CubeListBuilder.create().texOffs(334, 94).mirror().addBox(-4.5194F, -3.4F, -3.7157F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.5236F, 0.0F, 0.0F));

		 head.addOrReplaceChild("helmet49", CubeListBuilder.create().texOffs(334, 94).mirror().addBox(3.4806F, -3.4F, -3.7157F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.5236F, 0.0F, 0.0F));

		 head.addOrReplaceChild("helmet52", CubeListBuilder.create().texOffs(450, 190).mirror().addBox(-4.1F, -7.4F, -3.8F, 8.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1487F, 0.0F, 0.0F));

		 head.addOrReplaceChild("helmet53", CubeListBuilder.create().texOffs(450, 170).mirror().addBox(3.1F, -7.4F, -3.81F, 1.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1487F, 0.0F, 0.0F));

		 head.addOrReplaceChild("helmet57", CubeListBuilder.create().texOffs(367, 284).mirror().addBox(-0.5F, -7.4F, -4.1F, 1.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1487F, 0.0F, 0.0F));

		 head.addOrReplaceChild("helmet58", CubeListBuilder.create().texOffs(450, 90).mirror().addBox(-4.2F, -2.8F, -3.9F, 4.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1487F, 0.0F, 0.0F));

		 head.addOrReplaceChild("helmet59", CubeListBuilder.create().texOffs(449, 90).addBox(0.2F, -2.8F, -3.9F, 4.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1487F, 0.0F, 0.0F));

		 head.addOrReplaceChild("helmet61", CubeListBuilder.create().texOffs(400, 0).mirror().addBox(-3.2F, -3.85F, -2.5F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0F, -2.0F, -0.5236F, 0.0F, 0.0F));

		 head.addOrReplaceChild("helmet55", CubeListBuilder.create().texOffs(400, 0).mirror().addBox(4.2F, -3.85F, -2.5F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0F, -2.0F, -0.5236F, 0.0F, 0.0F));

		 head.addOrReplaceChild("helmet62", CubeListBuilder.create().texOffs(387, 348).mirror().addBox(-3.5F, -7.2F, -4.09F, 7.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1487F, 0.0F, 0.0F));

		 head.addOrReplaceChild("helmet33", CubeListBuilder.create().texOffs(393, 348).mirror().addBox(-2.2898F, -7.209F, -5.2157F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1487F, 0.4363F, 0.0436F));

		 head.addOrReplaceChild("helmet41", CubeListBuilder.create().texOffs(393, 348).mirror().addBox(1.5369F, -7.1996F, -5.1596F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1487F, -0.3927F, -0.0436F));

		 head.addOrReplaceChild("helmet40", CubeListBuilder.create().texOffs(392, 347).mirror().addBox(-4.644F, -6.2486F, -4.6779F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0258F, 0.0F, 0.0436F));

		 head.addOrReplaceChild("helmet42", CubeListBuilder.create().texOffs(392, 347).mirror().addBox(3.1626F, -6.6309F, -4.739F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0258F, 0.0F, 0.0436F));

		 head.addOrReplaceChild("helmet68", CubeListBuilder.create().texOffs(402, 2).addBox(-4.2F, -9.0F, -2.6F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, 0.0F, -0.0175F, 0.0F, 0.0F));

		 head.addOrReplaceChild("helmet69", CubeListBuilder.create().texOffs(402, 2).mirror().addBox(1.2F, -9.0F, -2.6F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.0F, 0.0F, -0.0175F, 0.0F, 0.0F));

		 head.addOrReplaceChild("helmet70", CubeListBuilder.create().texOffs(300, 0).mirror().addBox(-4.0F, -4.0F, 3.1F, 8.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		 head.addOrReplaceChild("helmet71", CubeListBuilder.create().texOffs(398, 62).mirror().addBox(-4.1F, -4.0F, -1.0F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		 head.addOrReplaceChild("helmet72", CubeListBuilder.create().texOffs(300, 0).mirror().addBox(-4.1F, -1.0F, -3.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		 head.addOrReplaceChild("helmet73", CubeListBuilder.create().texOffs(300, 0).addBox(3.1F, -1.0F, -3.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		 head.addOrReplaceChild("helmet74", CubeListBuilder.create().texOffs(398, 62).addBox(3.1F, -4.0F, -1.0F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		 head.addOrReplaceChild("helmet75", CubeListBuilder.create().texOffs(300, 0).mirror().addBox(-4.0F, -0.9F, -4.0F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		 head.addOrReplaceChild("helmet76", CubeListBuilder.create().texOffs(83, 193).mirror().addBox(-6.3567F, -5.4049F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2618F));

		head.addOrReplaceChild("helmet1", CubeListBuilder.create().texOffs(238, 106).mirror().addBox(-1.0F, -1.9F, -4.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.409F, 0.0F, 0.0F));

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