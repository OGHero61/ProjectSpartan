package net.hero61.projectspartan.client.model.item.model.armor.argus;// Made with Blockbench 4.10.4
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

public class ModelArgusHelmet<T extends LivingEntity> extends HumanoidModel<T> {
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation(ProjectSpartan.MOD_ID, "argus_helmet"), "main");

	public ModelArgusHelmet(ModelPart modelPart) {
		super (modelPart);
	}

	public static LayerDefinition createLayer() {
		MeshDefinition definition = ModelUtils.createBlankHumanoidMesh();
		PartDefinition root = definition.getRoot();

		PartDefinition head = root.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet2", CubeListBuilder.create().texOffs(0, 70).mirror().addBox(-4.0F, -3.1F, -3.73F, 8.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.409F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet3", CubeListBuilder.create().texOffs(401, 104).mirror().addBox(-1.0F, -0.8F, -4.9F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2603F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet4", CubeListBuilder.create().texOffs(401, 124).mirror().addBox(-1.0F, -1.3F, -4.9F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2603F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet66", CubeListBuilder.create().texOffs(464, 194).mirror().addBox(-0.1F, -3.3F, -5.1F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6F, -2.5F, 0.4F, -0.0159F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet62", CubeListBuilder.create().texOffs(453, 148).mirror().addBox(-1.3F, -3.0726F, -1.2318F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, -1.6F, -2.9F, 0.1487F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet89", CubeListBuilder.create().texOffs(453, 148).mirror().addBox(-2.3F, -2.1601F, 0.1563F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.6F, -4.9F, -0.1487F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet85", CubeListBuilder.create().texOffs(453, 148).mirror().addBox(-2.6235F, -1.4033F, -1.4819F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, -1.6F, -2.9F, 0.1487F, 0.0F, 1.0472F));

		head.addOrReplaceChild("helmet91", CubeListBuilder.create().texOffs(453, 148).mirror().addBox(-2.6235F, -0.1945F, -1.5715F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, -1.6F, -2.9F, -0.1487F, 0.0F, 1.0472F));

		head.addOrReplaceChild("helmet87", CubeListBuilder.create().texOffs(453, 148).mirror().addBox(-1.8235F, 0.5648F, -1.7768F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, -1.6F, -2.9F, 0.1487F, 0.0F, 2.0944F));

		head.addOrReplaceChild("helmet93", CubeListBuilder.create().texOffs(453, 148).mirror().addBox(-1.8235F, 1.7737F, -1.2766F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, -1.6F, -2.9F, -0.1487F, 0.0F, 2.0944F));

		head.addOrReplaceChild("helmet57", CubeListBuilder.create().texOffs(464, 194).mirror().addBox(0.1F, -3.3F, -5.1F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -2.5F, 0.4F, -0.0159F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet5", CubeListBuilder.create().texOffs(0, 130).mirror().addBox(-4.0F, 0.1F, -4.7F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.5205F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet6", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-4.05F, -7.0974F, -5.2436F, 5.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet7", CubeListBuilder.create().texOffs(99, 0).mirror().addBox(0.05F, -7.0974F, -5.2436F, 4.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet8", CubeListBuilder.create().texOffs(1, 151).mirror().addBox(1.05F, -8.7264F, 1.3108F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.7854F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet9", CubeListBuilder.create().texOffs(1, 171).mirror().addBox(-4.05F, -8.7264F, 1.3108F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.7854F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet15", CubeListBuilder.create().texOffs(195, 313).mirror().addBox(-2.4F, -8.8827F, 0.0064F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.9F, -0.2F, 0.0F, 0.6545F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet42", CubeListBuilder.create().texOffs(93, 275).mirror().addBox(-2.4F, -8.0345F, -1.1873F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.9F, -1.2F, 0.0F, -0.3927F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet41", CubeListBuilder.create().texOffs(3, 171).mirror().addBox(-2.4F, -7.051F, 2.5977F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.9F, -0.2F, -8.0F));

		head.addOrReplaceChild("helmet16", CubeListBuilder.create().texOffs(117, 219).mirror().addBox(-2.4F, -8.8773F, -3.0223F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.9F, -0.2F, 0.0F));

		head.addOrReplaceChild("helmet10", CubeListBuilder.create().texOffs(1, 171).mirror().addBox(-4.05F, -8.7264F, 1.3108F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.7854F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet11", CubeListBuilder.create().texOffs(0, 190).mirror().addBox(-1.0F, -8.8F, -3.15F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0372F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet12", CubeListBuilder.create().texOffs(0, 210).mirror().addBox(-4.0F, -8.8F, -3.15F, 4.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0372F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet13", CubeListBuilder.create().texOffs(0, 230).mirror().addBox(0.05F, -2.7F, -9.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.9666F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet14", CubeListBuilder.create().texOffs(0, 250).mirror().addBox(-4.05F, -2.7F, -9.0F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.9666F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet17", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-4.5F, -7.0F, -4.0F, 9.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet18", CubeListBuilder.create().texOffs(0, 310).mirror().addBox(-4.5F, -2.9F, -3.7F, 9.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2603F, 0.0F, 0.0F));

		 head.addOrReplaceChild("helmet102", CubeListBuilder.create().texOffs(3, 313).mirror().addBox(-4.6F, -3.3F, -3.7F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 0.0F, 0.3F, 0.2603F, 0.0F, 0.0F));

		 head.addOrReplaceChild("helmet103", CubeListBuilder.create().texOffs(3, 313).mirror().addBox(-4.5F, -3.3F, -3.7F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(5.2F, 0.0F, 0.3F, 0.2603F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet19", CubeListBuilder.create().texOffs(5, 327).mirror().addBox(-4.5F, -6.1F, -2.0F, 9.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2974F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet20", CubeListBuilder.create().texOffs(0, 350).mirror().addBox(-6.0F, -2.9F, -1.6F, 10.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, -0.3F, 0.0F));

		head.addOrReplaceChild("helmet84", CubeListBuilder.create().texOffs(0, 350).mirror().addBox(-6.0F, -2.9F, -1.6F, 10.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.1F, 0.0F));

		head.addOrReplaceChild("helmet80", CubeListBuilder.create().texOffs(1, 351).mirror().addBox(-5.2F, -1.9F, -1.6F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-0.3F, -2.3F, 0.0F));

		head.addOrReplaceChild("helmet21", CubeListBuilder.create().texOffs(0, 370).mirror().addBox(-4.5F, -5.8F, -5.3F, 9.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2603F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet22", CubeListBuilder.create().texOffs(454, 138).mirror().addBox(-2.0F, -5.0F, 4.6F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, -1.8F, -1.3F, 0.0485F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet23", CubeListBuilder.create().texOffs(0, 410).mirror().addBox(-3.0F, -4.0F, 4.0F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2231F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet24", CubeListBuilder.create().texOffs(0, 430).mirror().addBox(-0.9F, -8.9707F, -0.4956F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2974F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet25", CubeListBuilder.create().texOffs(0, 450).mirror().addBox(-4.1F, -8.9707F, -0.4956F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2974F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet26", CubeListBuilder.create().texOffs(0, 470).mirror().addBox(-0.9F, -8.3221F, -3.7628F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.8923F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet78", CubeListBuilder.create().texOffs(1, 470).mirror().addBox(2.1F, -8.3221F, -3.0628F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.2F, -1.1F, 0.0F, -0.8923F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet27", CubeListBuilder.create().texOffs(1, 490).mirror().addBox(-4.1F, -8.3221F, -3.7628F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.8923F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet28", CubeListBuilder.create().texOffs(80, 50).mirror().addBox(-6.8F, -7.0F, -3.0F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.3346F));

		head.addOrReplaceChild("helmet29", CubeListBuilder.create().texOffs(80, 70).mirror().addBox(-6.8F, -6.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.3346F));

		head.addOrReplaceChild("helmet30", CubeListBuilder.create().texOffs(80, 90).mirror().addBox(-6.8F, -6.0F, 2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.3346F));

		head.addOrReplaceChild("helmet31", CubeListBuilder.create().texOffs(100, 1).mirror().addBox(-3.9F, -7.3741F, 3.7449F, 8.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet32", CubeListBuilder.create().texOffs(300, 130).mirror().addBox(5.5F, -7.2F, -3.0F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2974F));

		head.addOrReplaceChild("helmet33", CubeListBuilder.create().texOffs(300, 150).mirror().addBox(5.5F, -6.2F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2974F));

		head.addOrReplaceChild("helmet34", CubeListBuilder.create().texOffs(300, 170).mirror().addBox(5.5F, -6.2F, 2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2974F));

		head.addOrReplaceChild("helmet35", CubeListBuilder.create().texOffs(80, 170).mirror().addBox(-4.5F, -6.0F, 3.5F, 9.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2231F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet36", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-4.8F, -7.0F, -4.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet37", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(3.7F, -7.0F, -4.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet38", CubeListBuilder.create().texOffs(79, 190).mirror().addBox(-1.7F, -7.6F, 1.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(5.7F, 0.0F, -3.7F));

		head.addOrReplaceChild("helmet83", CubeListBuilder.create().texOffs(79, 190).mirror().addBox(-1.7F, -7.6F, 1.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(6.0F, -0.5F, -3.7F));

		 head.addOrReplaceChild("helmet101", CubeListBuilder.create().texOffs(80, 191).mirror().addBox(-1.7F, -7.6F, 2.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(6.0F, 0.8F, -4.0F));

		head.addOrReplaceChild("helmet82", CubeListBuilder.create().texOffs(79, 190).mirror().addBox(-1.7F, -7.6F, 1.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(5.7F, 0.4F, -3.7F));

		head.addOrReplaceChild("helmet81", CubeListBuilder.create().texOffs(400, 177).mirror().addBox(-1.7F, -7.6F, 0.8F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(5.9F, 0.4F, -3.7F));

		head.addOrReplaceChild("helmet55", CubeListBuilder.create().texOffs(81, 192).mirror().addBox(-1.2402F, -7.6F, 0.716F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(5.3F, 0.0F, 1.3F, 0.0F, -0.5236F, 0.0F));

		head.addOrReplaceChild("helmet56", CubeListBuilder.create().texOffs(82, 193).mirror().addBox(-1.7F, -7.6F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(5.3F, 0.0F, 1.3F));

		head.addOrReplaceChild("helmet54", CubeListBuilder.create().texOffs(81, 192).mirror().addBox(-1.7F, -7.4833F, -3.348F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(5.7F, 0.0F, -6.8F, -0.8727F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet77", CubeListBuilder.create().texOffs(462, 197).mirror().addBox(-1.7F, -6.6F, 1.99F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(6.3F, 0.0F, -6.0F));

		head.addOrReplaceChild("helmet39", CubeListBuilder.create().texOffs(80, 110).mirror().addBox(-4.5F, -1.9F, 2.8F, 9.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.5949F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet40", CubeListBuilder.create().texOffs(80, 130).mirror().addBox(-1.5F, -8.83F, 0.2F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.632F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet43", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-1.5F, -8.1F, 3.1F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet44", CubeListBuilder.create().texOffs(464, 196).mirror().addBox(-5.0F, -6.4195F, -13.0656F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-0.8F, 3.4F, 11.3F));

		head.addOrReplaceChild("helmet45", CubeListBuilder.create().texOffs(463, 196).mirror().addBox(-5.1F, -5.3195F, -13.0656F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 1.3F, 11.4F));

		head.addOrReplaceChild("helmet46", CubeListBuilder.create().texOffs(296, 200).mirror().addBox(4.0F, -7.6F, -9.7F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 5.0F));

		head.addOrReplaceChild("helmet47", CubeListBuilder.create().texOffs(304, 127).mirror().addBox(4.4F, -3.3195F, -0.7656F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, -0.7F, -1.7F));

		head.addOrReplaceChild("helmet49", CubeListBuilder.create().texOffs(338, 112).mirror().addBox(4.4F, -2.3195F, -0.2656F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, -1.0F, -1.5F));

		head.addOrReplaceChild("helmet51", CubeListBuilder.create().texOffs(446, 80).mirror().addBox(4.0F, -2.6F, -2.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, -1.3F, -1.0F));

		head.addOrReplaceChild("helmet52", CubeListBuilder.create().texOffs(450, 190).mirror().addBox(-4.1F, -7.4F, -3.8F, 8.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1487F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet53", CubeListBuilder.create().texOffs(450, 170).mirror().addBox(3.1F, -7.4F, -3.8F, 1.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1487F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet58", CubeListBuilder.create().texOffs(450, 90).mirror().addBox(-4.2F, -2.9F, -3.9F, 5.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2F, -0.2F, 0.0F, 0.1487F, 0.0F, 0.0873F));

		head.addOrReplaceChild("helmet59", CubeListBuilder.create().texOffs(447, 70).mirror().addBox(0.3F, -2.9F, -3.9F, 4.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1F, -0.2F, 0.0F, 0.1487F, 0.0F, -0.0873F));

		head.addOrReplaceChild("helmet60", CubeListBuilder.create().texOffs(450, 50).mirror().addBox(-1.0F, -3.5F, -4.1F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1487F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet95", CubeListBuilder.create().texOffs(450, 50).mirror().addBox(-3.4423F, -3.2925F, -2.7148F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.0F, 0.0F, 0.0F, 0.1487F, -0.6109F, 0.0F));

		head.addOrReplaceChild("helmet96", CubeListBuilder.create().texOffs(450, 50).mirror().addBox(3.8998F, -3.0375F, -1.0131F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.0F, 0.0F, 0.0F, 0.1487F, 0.6109F, 0.0F));

		head.addOrReplaceChild("helmet61", CubeListBuilder.create().texOffs(429, 18).mirror().addBox(-4.51F, -5.3517F, -1.9F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, -1.9F, 0.1487F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet98", CubeListBuilder.create().texOffs(429, 18).mirror().addBox(3.51F, -5.3517F, -1.9F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, -1.9F, 0.1487F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet65", CubeListBuilder.create().texOffs(430, 19).mirror().addBox(-4.51F, -6.8517F, -1.8473F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.7F, -1.4F, 0.1487F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet99", CubeListBuilder.create().texOffs(430, 19).mirror().addBox(3.51F, -6.8517F, -1.8473F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.7F, -1.4F, 0.1487F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet97", CubeListBuilder.create().texOffs(444, 66).mirror().addBox(-4.4F, -6.8517F, -1.8473F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1F, 2.4F, -1.5F, 0.1487F, 0.0F, 0.0F));

		 head.addOrReplaceChild("helmet100", CubeListBuilder.create().texOffs(444, 66).mirror().addBox(3.2F, -6.8517F, -1.8473F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1F, 2.4F, -1.5F, 0.1487F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet63", CubeListBuilder.create().texOffs(206, 66).mirror().addBox(-4.5F, -7.0F, -5.25F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet64", CubeListBuilder.create().texOffs(226, 118).mirror().addBox(3.5F, -7.0F, -5.25F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet68", CubeListBuilder.create().texOffs(402, 62).mirror().addBox(-4.2F, -4.7912F, -5.3596F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2603F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet69", CubeListBuilder.create().texOffs(402, 2).mirror().addBox(1.2F, -4.7912F, -5.3596F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2603F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet70", CubeListBuilder.create().texOffs(300, 0).mirror().addBox(-4.0F, -4.0F, 3.1F, 8.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet71", CubeListBuilder.create().texOffs(300, 0).mirror().addBox(-4.1F, -4.0F, -1.0F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet72", CubeListBuilder.create().texOffs(300, 0).mirror().addBox(-4.1F, -1.0F, -3.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet73", CubeListBuilder.create().texOffs(300, 0).mirror().addBox(3.1F, -1.0F, -3.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet74", CubeListBuilder.create().texOffs(300, 0).mirror().addBox(3.1F, -4.0F, -1.0F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet75", CubeListBuilder.create().texOffs(300, 0).mirror().addBox(-4.0F, -0.9F, -4.0F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet76", CubeListBuilder.create().texOffs(456, 58).mirror().addBox(-1.35F, -7.9553F, -0.0233F, 2.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.5F, 0.6F, -4.6F, -0.0873F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet48", CubeListBuilder.create().texOffs(401, 64).mirror().addBox(-0.3025F, -3.2397F, -3.8549F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.2F, -0.3F, 0.5F, 0.5926F, 0.2962F));

		head.addOrReplaceChild("helmet50", CubeListBuilder.create().texOffs(401, 64).mirror().addBox(1.0953F, -1.2514F, -0.2153F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.2F, -5.3F, 0.5F, -0.5926F, -0.2962F));

		head.addOrReplaceChild("helmet79", CubeListBuilder.create().texOffs(456, 58).mirror().addBox(-1.35F, -7.9553F, -0.0233F, 2.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.5F, 1.2F, -4.6F, -0.0873F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet1", CubeListBuilder.create().texOffs(401, 64).mirror().addBox(-1.0F, -3.2397F, -4.0917F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.2F, -0.3F, 0.409F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet67", CubeListBuilder.create().texOffs(453, 148).addBox(0.8235F, 1.7737F, -1.2766F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, -1.6F, -2.9F, -0.1487F, 0.0F, -2.0944F));

		head.addOrReplaceChild("helmet86", CubeListBuilder.create().texOffs(453, 148).addBox(1.3F, -2.1601F, 0.1563F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.6F, -4.9F, -0.1487F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet88", CubeListBuilder.create().texOffs(453, 148).addBox(1.6235F, -0.1945F, -1.5715F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, -1.6F, -2.9F, -0.1487F, 0.0F, -1.0472F));

		head.addOrReplaceChild("helmet90", CubeListBuilder.create().texOffs(453, 148).addBox(0.3F, -3.0726F, -1.2318F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, -1.6F, -2.9F, 0.1487F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet92", CubeListBuilder.create().texOffs(453, 148).addBox(1.6235F, -1.4033F, -1.4819F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, -1.6F, -2.9F, 0.1487F, 0.0F, -1.0472F));

		head.addOrReplaceChild("helmet94", CubeListBuilder.create().texOffs(453, 148).addBox(0.8235F, 0.5648F, -1.7768F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, -1.6F, -2.9F, 0.1487F, 0.0F, -2.0944F));

		 head.addOrReplaceChild("helmet104", CubeListBuilder.create().texOffs(464, 194).addBox(-0.9F, -3.3F, -5.1F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -2.5F, 0.4F, -0.0159F, 0.0F, 0.0F));

		 head.addOrReplaceChild("helmet105", CubeListBuilder.create().texOffs(464, 194).addBox(-1.1F, -3.3F, -5.1F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -2.5F, 0.4F, -0.0159F, 0.0F, 0.0F));

		 return LayerDefinition.create(definition, 512, 512);
}
@Override
public void renderToBuffer(PoseStack matrixStack, VertexConsumer vertexConsumer, int p_225598_3_, int p_225598_4_, float p_225598_5_, float p_225598_6_, float p_225598_7_, float p_225598_8_) {
	this.leftArm.visible = true;
	this.rightArm.visible = true;
	this.leftLeg.visible = true;
	this.rightLeg.visible =true;
	this.head.visible = true;
	this.body.visible = true;
	super.renderToBuffer(matrixStack, vertexConsumer, p_225598_3_, p_225598_4_, p_225598_5_, p_225598_6_, p_225598_7_, p_225598_8_);
}
}