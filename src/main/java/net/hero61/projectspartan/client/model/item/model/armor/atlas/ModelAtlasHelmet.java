package net.hero61.projectspartan.client.model.item.model.armor.atlas;// Made with Blockbench 4.10.4
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

public class ModelAtlasHelmet<T extends LivingEntity> extends HumanoidModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation(ProjectSpartan.MOD_ID, "atlas_helmet"), "main");

	public ModelAtlasHelmet(ModelPart modelPart) {
		super (modelPart);
	}

	public static LayerDefinition createLayer() {
		MeshDefinition definition = ModelUtils.createBlankHumanoidMesh();
		PartDefinition root = definition.getRoot();

		PartDefinition head = root.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet2", CubeListBuilder.create().texOffs(0, 70).mirror().addBox(-4.0F, -3.1F, -3.83F, 8.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.409F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet62", CubeListBuilder.create().texOffs(420, 355).mirror().addBox(3.0F, -3.1F, -3.83F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.9F, 1.6F, -3.6F, 0.5835F, -0.7854F, -0.4363F));

		head.addOrReplaceChild("helmet68", CubeListBuilder.create().texOffs(420, 355).mirror().addBox(3.25F, -3.1F, -3.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.9F, 1.7F, -4.0F, 0.409F, -0.7679F, -0.2967F));

		head.addOrReplaceChild("helmet69", CubeListBuilder.create().texOffs(420, 355).mirror().addBox(3.26F, -3.0F, -3.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.9F, 0.8F, -4.7F, 0.0F, -0.7679F, 0.0F));

		head.addOrReplaceChild("helmet64", CubeListBuilder.create().texOffs(420, 355).mirror().addBox(3.0F, -2.1F, -3.83F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0F, 3.4F, -4.2F, 0.1472F, -0.7854F, -1.0472F));

		head.addOrReplaceChild("helmet66", CubeListBuilder.create().texOffs(420, 355).mirror().addBox(2.8F, -2.3F, -3.62F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.8F, -4.6F, -4.5F, 0.1908F, -0.8727F, 1.0472F));

		head.addOrReplaceChild("helmet67", CubeListBuilder.create().texOffs(420, 355).mirror().addBox(2.85F, -2.24F, -3.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.1F, -4.5F, -4.5F, 0.1908F, -0.8727F, 1.0472F));

		head.addOrReplaceChild("helmet65", CubeListBuilder.create().texOffs(420, 355).mirror().addBox(3.02F, -2.1F, -3.86F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.3F, 3.2F, -4.2F, 0.1472F, -0.7854F, -1.0472F));

		head.addOrReplaceChild("helmet63", CubeListBuilder.create().texOffs(420, 355).mirror().addBox(3.0F, -3.1F, -3.83F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.8F, 1.6F, -3.6F, 0.5835F, -0.7854F, -0.4363F));

		head.addOrReplaceChild("helmet58", CubeListBuilder.create().texOffs(0, 70).mirror().addBox(-4.0F, -3.1F, -3.93F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.7F, -0.7F));

		head.addOrReplaceChild("helmet61", CubeListBuilder.create().texOffs(0, 70).mirror().addBox(-4.0F, -3.1F, -3.93F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(5.0F, 0.7F, -0.7F));

		head.addOrReplaceChild("helmet3", CubeListBuilder.create().texOffs(453, 152).mirror().addBox(-1.0F, -1.8F, -5.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2603F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet14", CubeListBuilder.create().texOffs(455, 200).addBox(0.1F, -0.91F, -4.7466F, 4.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.0F, 0.0F, -1.4466F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet10", CubeListBuilder.create().texOffs(452, 199).addBox(0.1F, -3.3119F, -4.8224F, 4.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.0F, 0.0F, -1.5708F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet13", CubeListBuilder.create().texOffs(452, 200).addBox(0.1F, -3.3119F, -4.8224F, 4.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, -4.0F, 0.0F, -1.5708F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet7", CubeListBuilder.create().texOffs(461, 195).mirror().addBox(-4.1F, -0.9069F, -4.7466F, 5.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -4.0F, 0.0F, -1.4466F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet4", CubeListBuilder.create().texOffs(453, 190).mirror().addBox(-4.11F, -0.9527F, -5.5896F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -4.0F, 0.0F, -0.5236F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet6", CubeListBuilder.create().texOffs(452, 190).mirror().addBox(0.11F, -0.9527F, -5.5896F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -4.0F, 0.0F, -0.5236F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet8", CubeListBuilder.create().texOffs(452, 190).mirror().addBox(0.12F, -0.4735F, -5.67F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -4.0F, 0.0F, -0.7854F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet9", CubeListBuilder.create().texOffs(452, 190).mirror().addBox(-4.12F, -0.4735F, -5.67F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -4.0F, 0.0F, -0.7854F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet18", CubeListBuilder.create().texOffs(0, 310).mirror().addBox(-4.51F, -2.9F, -3.69F, 9.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2603F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet19", CubeListBuilder.create().texOffs(0, 330).mirror().addBox(-4.5F, -6.1F, 1.0F, 9.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2974F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet21", CubeListBuilder.create().texOffs(450, 187).mirror().addBox(-4.8428F, -6.2134F, -2.3376F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8F, -0.9F, -0.2F, 0.1899F, -0.3838F, -0.0015F));

		head.addOrReplaceChild("helmet47", CubeListBuilder.create().texOffs(449, 186).mirror().addBox(-2.9329F, -6.7096F, -5.0386F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8F, -0.9F, 1.8F, 0.1822F, 0.2601F, 0.0828F));

		head.addOrReplaceChild("helmet23", CubeListBuilder.create().texOffs(462, 116).mirror().addBox(-3.0F, -5.0F, 3.8F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2231F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet24", CubeListBuilder.create().texOffs(0, 431).mirror().addBox(-0.9F, -9.4956F, 0.5707F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2974F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet46", CubeListBuilder.create().texOffs(0, 431).mirror().addBox(-0.8F, -9.4956F, 0.5707F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.1F, -0.4F, -0.2974F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet25", CubeListBuilder.create().texOffs(1, 451).mirror().addBox(-4.1F, -9.4956F, 0.5707F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2974F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet38", CubeListBuilder.create().texOffs(1, 451).mirror().addBox(-4.2F, -9.5956F, 0.5707F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, -0.4F, -0.2974F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet26", CubeListBuilder.create().texOffs(0, 470).mirror().addBox(0.1F, -8.7447F, -4.0204F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.8923F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet27", CubeListBuilder.create().texOffs(0, 490).mirror().addBox(-4.1F, -8.7447F, -4.0204F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.8923F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet28", CubeListBuilder.create().texOffs(81, 51).mirror().addBox(-6.8328F, -7.0945F, -1.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.3346F));

		head.addOrReplaceChild("helmet30", CubeListBuilder.create().texOffs(80, 90).mirror().addBox(-6.8F, -6.0F, 2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.3346F));

		head.addOrReplaceChild("helmet31", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-4.1F, -7.3819F, 4.5768F, 8.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0873F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet32", CubeListBuilder.create().texOffs(301, 131).mirror().addBox(5.5F, -7.4F, -1.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2974F));

		head.addOrReplaceChild("helmet34", CubeListBuilder.create().texOffs(300, 170).mirror().addBox(5.5F, -6.2F, 2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2974F));

		head.addOrReplaceChild("helmet35", CubeListBuilder.create().texOffs(80, 170).mirror().addBox(-4.51F, -6.0F, 3.5F, 9.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2231F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet36", CubeListBuilder.create().texOffs(219, 335).mirror().addBox(-4.1564F, -7.446F, -1.0F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.0873F));

		head.addOrReplaceChild("helmet37", CubeListBuilder.create().texOffs(219, 335).addBox(3.0735F, -7.4592F, -1.0F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0873F));

		head.addOrReplaceChild("helmet39", CubeListBuilder.create().texOffs(80, 110).mirror().addBox(-4.5F, -1.9F, 2.8F, 9.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.5949F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet43", CubeListBuilder.create().texOffs(398, 177).mirror().addBox(0.0F, -8.5F, 4.3F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 2.9F, 1.0F, 0.1309F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet48", CubeListBuilder.create().texOffs(331, 91).mirror().addBox(-4.52F, -4.4F, -2.8F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2603F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet49", CubeListBuilder.create().texOffs(332, 92).addBox(3.52F, -4.4F, -2.7F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2603F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet52", CubeListBuilder.create().texOffs(450, 190).mirror().addBox(-4.1F, -7.4F, -3.8F, 8.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1487F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet53", CubeListBuilder.create().texOffs(450, 170).mirror().addBox(3.1F, -7.4F, -3.81F, 1.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1487F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet57", CubeListBuilder.create().texOffs(450, 150).mirror().addBox(-4.0F, -7.55F, -3.65F, 3.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2231F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet54", CubeListBuilder.create().texOffs(450, 150).addBox(-1.0F, -7.55F, -3.65F, 3.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 0.0F, 0.0F, 0.2231F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet55", CubeListBuilder.create().texOffs(458, 186).mirror().addBox(-1.5F, -6.55F, -3.65F, 4.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2F, -0.1F, 0.2231F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet70", CubeListBuilder.create().texOffs(300, 0).mirror().addBox(-4.0F, -4.0F, 3.1F, 8.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet71", CubeListBuilder.create().texOffs(398, 62).mirror().addBox(-4.1F, -4.0F, -1.0F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet72", CubeListBuilder.create().texOffs(300, 0).mirror().addBox(-4.1F, -1.0F, -3.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet73", CubeListBuilder.create().texOffs(300, 0).addBox(3.1F, -1.0F, -3.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet74", CubeListBuilder.create().texOffs(398, 62).addBox(3.1F, -4.0F, -1.0F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet75", CubeListBuilder.create().texOffs(300, 0).mirror().addBox(-4.0F, -0.9F, -4.0F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet76", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.4F, 2.9F, -4.1F, 0.1309F, -0.2182F, 0.0F));

		head.addOrReplaceChild("helmet45", CubeListBuilder.create().texOffs(80, 190).mirror().addBox(-0.55F, -6.6068F, 0.0956F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.4F, 2.9F, -4.1F, 0.1309F, -0.2182F, 0.0F));

		head.addOrReplaceChild("helmet59", CubeListBuilder.create().texOffs(82, 193).mirror().addBox(-1.9842F, -5.2102F, 7.8682F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.8F, 1.3F, -11.9F, 0.1309F, 0.0F, -0.6545F));

		head.addOrReplaceChild("helmet15", CubeListBuilder.create().texOffs(80, 190).mirror().addBox(0.9633F, -6.6064F, 4.1992F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-7.4F, 2.9F, -4.1F, 0.1309F, 0.0873F, 0.0F));

		head.addOrReplaceChild("helmet17", CubeListBuilder.create().texOffs(82, 192).mirror().addBox(-0.3118F, -7.1888F, 4.3337F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-7.4F, 2.9F, -0.1F, 0.1309F, 0.4538F, 0.0524F));

		head.addOrReplaceChild("helmet20", CubeListBuilder.create().texOffs(314, 204).mirror().addBox(-1.5484F, -7.5931F, 3.349F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-7.4F, 2.9F, 2.9F, 0.2541F, 1.1833F, 0.2269F));

		head.addOrReplaceChild("helmet22", CubeListBuilder.create().texOffs(363, 287).mirror().addBox(4.334F, -7.7165F, 1.2149F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-7.4F, 2.9F, 2.9F, 0.0698F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet16", CubeListBuilder.create().texOffs(80, 190).mirror().addBox(5.9006F, -6.4001F, 1.2973F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-7.4F, 2.9F, -8.1F, 0.1309F, -0.7156F, -0.0436F));

		head.addOrReplaceChild("helmet1", CubeListBuilder.create().texOffs(460, 195).mirror().addBox(-1.0F, -2.945F, -4.0456F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.409F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet29", CubeListBuilder.create(), PartPose.offsetAndRotation(4.4F, 2.9F, -4.1F, 0.1309F, 0.2182F, 0.0F));

		head.addOrReplaceChild("helmet33", CubeListBuilder.create().texOffs(80, 190).addBox(-7.9006F, -6.4001F, 1.2973F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.4F, 2.9F, -8.1F, 0.1309F, 0.7156F, 0.0436F));

		head.addOrReplaceChild("helmet40", CubeListBuilder.create().texOffs(80, 190).addBox(-2.9633F, -6.6064F, 4.1992F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.4F, 2.9F, -4.1F, 0.1309F, -0.0873F, 0.0F));

		head.addOrReplaceChild("helmet41", CubeListBuilder.create().texOffs(82, 192).addBox(-1.6882F, -7.1888F, 4.3337F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.4F, 2.9F, -0.1F, 0.1309F, -0.4538F, -0.0524F));

		head.addOrReplaceChild("helmet42", CubeListBuilder.create().texOffs(314, 204).addBox(-0.4516F, -7.5931F, 3.349F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.4F, 2.9F, 2.9F, 0.2541F, -1.1833F, -0.2269F));

		head.addOrReplaceChild("helmet44", CubeListBuilder.create().texOffs(363, 287).addBox(-6.334F, -7.7165F, 1.2149F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.4F, 2.9F, 2.9F, 0.0698F, 0.0F, 0.0F));

		head.addOrReplaceChild("helmet50", CubeListBuilder.create().texOffs(450, 187).addBox(3.8428F, -6.2134F, -2.3376F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8F, -0.9F, -0.2F, 0.1899F, 0.3838F, 0.0015F));

		head.addOrReplaceChild("helmet51", CubeListBuilder.create().texOffs(449, 186).addBox(1.9329F, -6.7096F, -5.0386F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8F, -0.9F, 1.8F, 0.1822F, -0.2601F, -0.0828F));

		head.addOrReplaceChild("helmet56", CubeListBuilder.create().texOffs(80, 190).addBox(-1.45F, -6.6068F, 0.0956F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.4F, 2.9F, -4.1F, 0.1309F, 0.2182F, 0.0F));

		head.addOrReplaceChild("helmet60", CubeListBuilder.create().texOffs(82, 193).addBox(-0.0158F, -5.2102F, 7.8682F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8F, 1.3F, -11.9F, 0.1309F, 0.0F, 0.6545F));

		head.addOrReplaceChild("helmet77", CubeListBuilder.create().texOffs(420, 355).addBox(-3.8F, -2.3F, -3.62F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.8F, -4.6F, -4.5F, 0.1908F, 0.8727F, -1.0472F));

		head.addOrReplaceChild("helmet78", CubeListBuilder.create().texOffs(420, 355).addBox(-4.25F, -3.1F, -3.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.9F, 1.7F, -4.0F, 0.409F, 0.7679F, 0.2967F));

		head.addOrReplaceChild("helmet79", CubeListBuilder.create().texOffs(420, 355).addBox(-4.26F, -3.0F, -3.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.9F, 0.8F, -4.7F, 0.0F, 0.7679F, 0.0F));

		head.addOrReplaceChild("helmet80", CubeListBuilder.create().texOffs(420, 355).addBox(-4.0F, -2.1F, -3.83F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 3.4F, -4.2F, 0.1472F, 0.7854F, 1.0472F));

		head.addOrReplaceChild("helmet81", CubeListBuilder.create().texOffs(420, 355).addBox(-4.02F, -2.1F, -3.86F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.3F, 3.2F, -4.2F, 0.1472F, 0.7854F, 1.0472F));

		head.addOrReplaceChild("helmet82", CubeListBuilder.create().texOffs(420, 355).addBox(-3.85F, -2.24F, -3.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.1F, -4.5F, -4.5F, 0.1908F, 0.8727F, -1.0472F));

		return LayerDefinition.create(definition, 512, 512);
	}

	@Override
	public void setupAnim(LivingEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

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