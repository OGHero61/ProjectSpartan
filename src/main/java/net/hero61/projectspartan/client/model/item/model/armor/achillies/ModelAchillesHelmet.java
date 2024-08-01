package net.hero61.projectspartan.client.model.item.model.armor.achillies;// Made with Blockbench 4.10.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


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

public class ModelAchillesHelmet<T extends LivingEntity> extends HumanoidModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation(ProjectSpartan.MOD_ID, "achilles_helmet"), "main");

	public ModelAchillesHelmet(ModelPart modelPart) {
		super (modelPart);
	}

	public static LayerDefinition createLayer() {
		MeshDefinition definition = ModelUtils.createBlankHumanoidMesh();
		PartDefinition root = definition.getRoot();

		PartDefinition head = root.addOrReplaceChild("head", CubeListBuilder.create().texOffs(33, 106).mirror().addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet2", CubeListBuilder.create().texOffs(0, 70).mirror().addBox(-4.0F, -3.1F, -3.73F, 8.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.409F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet3", CubeListBuilder.create().texOffs(0, 90).mirror().addBox(-1.0F, -0.8F, -4.9F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2603F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet4", CubeListBuilder.create().texOffs(0, 110).mirror().addBox(-3.4664F, -0.6F, -4.6F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2603F, 0.0F, 0.3054F));

		head.addOrReplaceChild("helmet5", CubeListBuilder.create().texOffs(0, 130).mirror().addBox(-4.0F, 0.1F, -4.7F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.5205F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet6", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-4.05F, -7.0F, -6.0F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet7", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(1.05F, -7.0F, -6.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet8", CubeListBuilder.create().texOffs(0, 150).mirror().addBox(1.05F, -8.7F, -3.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3718F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet9", CubeListBuilder.create().texOffs(0, 170).mirror().addBox(-4.05F, -8.7F, -3.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3718F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet10", CubeListBuilder.create().texOffs(99, 0).mirror().addBox(-2.5F, -8.1F, -6.2F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet11", CubeListBuilder.create().texOffs(0, 190).mirror().addBox(0.0F, -8.8F, -3.15F, 4.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0372F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet12", CubeListBuilder.create().texOffs(0, 210).mirror().addBox(-4.0F, -8.8F, -3.15F, 4.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0372F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet13", CubeListBuilder.create().texOffs(0, 230).mirror().addBox(1.05F, -2.7F, -9.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.9666F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet14", CubeListBuilder.create().texOffs(0, 250).mirror().addBox(-4.05F, -2.7F, -9.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.9666F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet15", CubeListBuilder.create().texOffs(0, 269).mirror().addBox(-8.3344F, -17.9401F, -12.4258F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(10.7025F, 0.0F, 9.9114F, 0.3491F, 0.1423F, -0.4363F));

		head.addOrReplaceChild("helmet16", CubeListBuilder.create().texOffs(0, 269).mirror().addBox(-15.701F, -8.5814F, -12.9307F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(10.7025F, 0.0F, 9.9114F, 0.3491F, -0.1423F, 0.4363F));

		head.addOrReplaceChild("helmet17", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-4.5F, -7.0F, -4.0F, 9.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet18", CubeListBuilder.create().texOffs(2, 312).mirror().addBox(-4.7F, -2.9F, 7.3F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.0F, -9.0F, 0.522F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet19", CubeListBuilder.create().texOffs(-1, 329).mirror().addBox(-4.5F, -7.1F, -2.0F, 9.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2276F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet20", CubeListBuilder.create().texOffs(-2, 349).mirror().addBox(-5.5F, -2.9F, -0.5F, 11.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2603F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet21", CubeListBuilder.create().texOffs(0, 370).mirror().addBox(-4.5F, -5.8F, -5.3F, 9.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2603F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet22", CubeListBuilder.create().texOffs(-1, 389).mirror().addBox(-1.0F, -12.1121F, -0.4876F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.5187F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet23", CubeListBuilder.create().texOffs(0, 410).mirror().addBox(-1.0F, -5.0F, 4.3F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2231F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet24", CubeListBuilder.create().texOffs(0, 430).mirror().addBox(0.1F, -9.0F, -0.4F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2974F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet25", CubeListBuilder.create().texOffs(0, 450).mirror().addBox(-4.1F, -9.0F, -0.4F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2974F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet26", CubeListBuilder.create().texOffs(0, 470).mirror().addBox(-0.9F, -8.4F, -3.7F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.8923F, 0.0367F, 0.0F));

		head.addOrReplaceChild("helmet27", CubeListBuilder.create().texOffs(0, 490).mirror().addBox(-4.1F, -8.4F, -3.7F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.8923F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet28", CubeListBuilder.create().texOffs(80, 50).mirror().addBox(-6.8F, -7.0F, -3.0F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.3346F));

		head.addOrReplaceChild("helmet29", CubeListBuilder.create().texOffs(80, 70).mirror().addBox(-6.8F, -6.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.3346F));

		head.addOrReplaceChild("helmet30", CubeListBuilder.create().texOffs(80, 90).mirror().addBox(-6.8F, -6.0F, 2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.3346F));

		head.addOrReplaceChild("helmet31", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-4.0F, -7.1F, 3.5F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet32", CubeListBuilder.create().texOffs(300, 130).mirror().addBox(5.5F, -7.2F, -3.0F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2974F));

		head.addOrReplaceChild("helmet33", CubeListBuilder.create().texOffs(300, 150).mirror().addBox(5.5F, -6.2F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2974F));

		head.addOrReplaceChild("helmet34", CubeListBuilder.create().texOffs(300, 170).mirror().addBox(5.5F, -6.2F, 2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2974F));

		head.addOrReplaceChild("helmet35", CubeListBuilder.create().texOffs(80, 170).mirror().addBox(-4.5F, -6.0F, 3.5F, 9.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2231F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet36", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-4.8F, -7.0F, -4.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet37", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(3.7F, -7.0F, -4.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet38", CubeListBuilder.create().texOffs(80, 190).mirror().addBox(-0.8F, -6.6F, 0.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(5.0F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet39", CubeListBuilder.create().texOffs(80, 110).mirror().addBox(-4.5F, -1.8F, 3.1F, 9.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.5949F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet40", CubeListBuilder.create().texOffs(79, 129).mirror().addBox(-1.5F, -8.83F, 0.2F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.632F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet41", CubeListBuilder.create().texOffs(80, 150).mirror().addBox(-1.0F, -11.5F, -3.35F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet42", CubeListBuilder.create().texOffs(298, 187).mirror().addBox(-1.0F, -11.6068F, -0.5039F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1859F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet43", CubeListBuilder.create().texOffs(162, 100).mirror().addBox(-1.0F, -10.1F, -0.9F, 2.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet44", CubeListBuilder.create().texOffs(400, 190).mirror().addBox(-5.4F, -2.8F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2603F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet45", CubeListBuilder.create().texOffs(400, 170).mirror().addBox(-5.4F, -2.0F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2603F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet46", CubeListBuilder.create().texOffs(400, 150).mirror().addBox(4.4F, -2.8F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2603F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet47", CubeListBuilder.create().texOffs(400, 130).mirror().addBox(4.4F, -2.0F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2603F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet48", CubeListBuilder.create().texOffs(277, 155).mirror().addBox(-4.5F, -4.9632F, -2.2047F, 2.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.2202F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet49", CubeListBuilder.create().texOffs(308, 116).mirror().addBox(3.7F, -2.9F, 7.3F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.0F, -8.0F, 0.522F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet1", CubeListBuilder.create().texOffs(0, 50).mirror().addBox(-1.0F, -2.9F, -4.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.409F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet50", CubeListBuilder.create().texOffs(326, 142).mirror().addBox(-4.6F, -3.0F, 2.2F, 9.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2603F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet51", CubeListBuilder.create().texOffs(289, 132).mirror().addBox(2.5F, -4.98F, -2.2654F, 2.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.2202F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet52", CubeListBuilder.create().texOffs(450, 190).mirror().addBox(-4.1F, -7.4F, -3.8F, 8.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1487F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet53", CubeListBuilder.create().texOffs(450, 170).mirror().addBox(3.1F, -7.4F, -3.8F, 1.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1487F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet57", CubeListBuilder.create().texOffs(450, 150).mirror().addBox(-2.0F, -5.65F, -3.55F, 4.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2231F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet58", CubeListBuilder.create().texOffs(449, 193).mirror().addBox(-4.2F, -2.9F, -3.9F, 8.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1487F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet59", CubeListBuilder.create().texOffs(450, 70).mirror().addBox(3.2F, -2.9F, -3.9F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1487F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet60", CubeListBuilder.create().texOffs(338, 172).mirror().addBox(7.8F, -2.3F, -1.95F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.0F, 3.0F, -3.0F, -0.2602F, 0.0F, -0.3054F));

		head.addOrReplaceChild("helmet61", CubeListBuilder.create().texOffs(400, 0).mirror().addBox(-4.2F, -6.1F, 0.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2974F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet62", CubeListBuilder.create().texOffs(450, 110).mirror().addBox(-2.0F, -5.15F, 4.3F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.4871F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet63", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-4.5F, -7.0F, -5.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet64", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(3.5F, -7.0F, -5.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet65", CubeListBuilder.create().texOffs(400, 0).mirror().addBox(3.2F, -6.1F, 0.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2974F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet66", CubeListBuilder.create().texOffs(400, 0).mirror().addBox(-4.2F, -3.5F, -1.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet67", CubeListBuilder.create().texOffs(400, 0).mirror().addBox(3.2F, -3.5F, -1.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet68", CubeListBuilder.create().texOffs(454, 62).mirror().addBox(-4.2F, -5.1F, -6.2F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2603F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet69", CubeListBuilder.create().texOffs(450, 58).mirror().addBox(-0.8F, -5.1F, -6.2F, 5.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2603F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet70", CubeListBuilder.create().texOffs(300, 0).mirror().addBox(-4.0F, -4.0F, 3.1F, 8.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet71", CubeListBuilder.create().texOffs(277, 195).mirror().addBox(-4.1F, -4.0F, -1.0F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet72", CubeListBuilder.create().texOffs(300, 0).mirror().addBox(-4.1F, -2.0F, -3.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet73", CubeListBuilder.create().texOffs(306, 120).mirror().addBox(3.1F, -1.0F, -3.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet74", CubeListBuilder.create().texOffs(277, 195).mirror().addBox(3.1F, -4.0F, -1.0F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet75", CubeListBuilder.create().texOffs(238, 139).mirror().addBox(-4.0F, -0.9F, -4.0F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet76", CubeListBuilder.create().texOffs(80, 190).mirror().addBox(-0.2F, -8.7F, 0.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-5.0F, 2.0F, 0.0F));

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