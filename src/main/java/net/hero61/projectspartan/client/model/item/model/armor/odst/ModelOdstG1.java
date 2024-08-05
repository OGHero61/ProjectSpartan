package net.hero61.projectspartan.client.model.item.model.armor.odst;// Made with Blockbench 4.10.4
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

public class ModelOdstG1<T extends LivingEntity> extends HumanoidModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation(ProjectSpartan.MOD_ID, "odst_g1_body"), "main");
	public ModelOdstG1(ModelPart modelPart) {
		super(modelPart);
	}

	public static LayerDefinition createLayer() {
		MeshDefinition definition = ModelUtils.createBlankHumanoidMesh();
		PartDefinition root = definition.getRoot();


		PartDefinition body = root.addOrReplaceChild("body", CubeListBuilder.create().texOffs(16, 16).mirror().addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		 body.addOrReplaceChild("body49", CubeListBuilder.create().texOffs(0, 100).mirror().addBox(-3.5F, 4.0F, 1.4F, 7.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		 body.addOrReplaceChild("body48", CubeListBuilder.create().texOffs(0, 450).mirror().addBox(-2.0F, 8.8F, 3.3F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1487F, 0.0F, 0.0F));

		 body.addOrReplaceChild("body47", CubeListBuilder.create().texOffs(250, 0).mirror().addBox(-1.0F, 3.9F, 2.2F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1859F, 0.0F, 0.0F));

		 body.addOrReplaceChild("body46", CubeListBuilder.create().texOffs(250, 0).mirror().addBox(1.0F, 3.9F, 2.2F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1859F, 0.0F, 0.0F));

		 body.addOrReplaceChild("body45", CubeListBuilder.create().texOffs(250, 0).mirror().addBox(-3.0F, 3.9F, 2.2F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1859F, 0.0F, 0.0F));

		 body.addOrReplaceChild("body44", CubeListBuilder.create().texOffs(300, 0).mirror().addBox(-3.5F, 1.0F, 1.0F, 7.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1115F, 0.0F, 0.0F));

		 body.addOrReplaceChild("body43", CubeListBuilder.create().texOffs(300, 450).mirror().addBox(-3.7F, 1.8F, 2.8F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2974F, 0.0F, 0.0F));

		 body.addOrReplaceChild("body42", CubeListBuilder.create().texOffs(300, 450).mirror().addBox(0.7F, 1.8F, 2.8F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2974F, 0.0F, 0.0F));

		 body.addOrReplaceChild("body41", CubeListBuilder.create().texOffs(300, 500).mirror().addBox(-3.7F, -0.5F, -0.3F, 3.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1115F, 0.0F, 0.0F));

		 body.addOrReplaceChild("body40", CubeListBuilder.create().texOffs(300, 500).mirror().addBox(0.7F, -0.5F, -0.3F, 3.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1115F, 0.0F, 0.0F));

		 body.addOrReplaceChild("body39", CubeListBuilder.create().texOffs(50, 100).mirror().addBox(-0.5F, 7.0F, -3.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		 body.addOrReplaceChild("body38", CubeListBuilder.create().texOffs(200, 200).mirror().addBox(-1.0F, 2.0F, -2.8F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1115F, 0.0F, 0.0F));

		 body.addOrReplaceChild("body37", CubeListBuilder.create().texOffs(50, 100).mirror().addBox(0.2F, 10.1F, -2.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		 body.addOrReplaceChild("body36", CubeListBuilder.create().texOffs(50, 100).mirror().addBox(-1.2F, 10.1F, -2.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		 body.addOrReplaceChild("body35", CubeListBuilder.create().texOffs(50, 100).mirror().addBox(-3.0F, 9.3F, -2.4F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		 body.addOrReplaceChild("body34", CubeListBuilder.create().texOffs(50, 450).mirror().addBox(-1.5F, 10.2F, -3.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0744F, 0.0F, 0.0F));

		 body.addOrReplaceChild("body33", CubeListBuilder.create().texOffs(300, 50).mirror().addBox(1.7F, 9.0F, -2.5F, 2.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.0744F));

		 body.addOrReplaceChild("body32", CubeListBuilder.create().texOffs(300, 50).mirror().addBox(-3.7F, 9.0F, -2.5F, 2.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0744F));

		 body.addOrReplaceChild("body31", CubeListBuilder.create().texOffs(0, 150).mirror().addBox(-1.2F, 8.8F, -2.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		 body.addOrReplaceChild("body30", CubeListBuilder.create().texOffs(0, 150).mirror().addBox(-1.2F, 9.2F, -2.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		 body.addOrReplaceChild("body29", CubeListBuilder.create().texOffs(0, 150).mirror().addBox(-1.2F, 9.0F, -2.7F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		 body.addOrReplaceChild("body28", CubeListBuilder.create().texOffs(100, 500).mirror().addBox(2.3F, 2.1F, -3.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.2231F, 0.0F));

		 body.addOrReplaceChild("body27", CubeListBuilder.create().texOffs(250, 450).mirror().addBox(-3.3F, 2.1F, -3.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.2231F, 0.0F));

		 body.addOrReplaceChild("body26", CubeListBuilder.create().texOffs(0, 200).mirror().addBox(-4.3F, 6.0F, -2.3F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		 body.addOrReplaceChild("body24", CubeListBuilder.create().texOffs(0, 200).mirror().addBox(2.3F, 6.0F, -2.3F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		 body.addOrReplaceChild("body23", CubeListBuilder.create().texOffs(250, 300).mirror().addBox(1.0F, 7.3F, -3.1F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.1859F, 0.0F));

		 body.addOrReplaceChild("body22", CubeListBuilder.create().texOffs(250, 300).mirror().addBox(-3.0F, 7.3F, -3.1F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.1859F, 0.0F));

		 body.addOrReplaceChild("body21", CubeListBuilder.create().texOffs(250, 250).mirror().addBox(-2.9F, 5.8F, -3.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.1859F, 0.0F));

		 body.addOrReplaceChild("body20", CubeListBuilder.create().texOffs(250, 200).mirror().addBox(1.9F, 5.8F, -3.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.1859F, 0.0F));

		 body.addOrReplaceChild("body19", CubeListBuilder.create().texOffs(250, 500).mirror().addBox(0.5F, 5.9F, -3.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.1859F, 0.0F));

		 body.addOrReplaceChild("body18", CubeListBuilder.create().texOffs(200, 500).mirror().addBox(-2.5F, 5.9F, -3.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.1859F, 0.0F));

		 body.addOrReplaceChild("body17", CubeListBuilder.create().texOffs(0, 150).mirror().addBox(-1.0F, 5.9F, -3.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		 body.addOrReplaceChild("body16", CubeListBuilder.create().texOffs(250, 50).mirror().addBox(0.8F, 2.0F, -3.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.2231F, 0.0F));

		 body.addOrReplaceChild("body15", CubeListBuilder.create().texOffs(250, 50).mirror().addBox(-1.8F, 2.0F, -3.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.2231F, 0.0F));

		 body.addOrReplaceChild("body14", CubeListBuilder.create().texOffs(200, 450).mirror().addBox(-2.5F, 4.8F, -3.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.2231F, 0.0F));

		 body.addOrReplaceChild("body13", CubeListBuilder.create().texOffs(150, 500).mirror().addBox(0.5F, 4.8F, -3.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.2231F, 0.0F));

		 body.addOrReplaceChild("body12", CubeListBuilder.create().texOffs(100, 450).mirror().addBox(0.8F, 2.1F, -3.2F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.2231F, 0.0F));

		 body.addOrReplaceChild("body11", CubeListBuilder.create().texOffs(150, 450).mirror().addBox(-2.8F, 2.1F, -3.2F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.2231F, 0.0F));

		 body.addOrReplaceChild("body10", CubeListBuilder.create().texOffs(50, 500).mirror().addBox(-1.5F, 2.1F, -2.7F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1115F, 0.0F, 0.0F));

		 body.addOrReplaceChild("body9", CubeListBuilder.create().texOffs(50, 100).mirror().addBox(-3.0F, -0.4F, -2.4F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		 body.addOrReplaceChild("body8", CubeListBuilder.create().texOffs(50, 100).mirror().addBox(2.0F, -0.4F, -2.4F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		 body.addOrReplaceChild("body7", CubeListBuilder.create().texOffs(0, 150).mirror().addBox(1.5F, -0.3F, -2.3F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		 body.addOrReplaceChild("body6", CubeListBuilder.create().texOffs(0, 150).mirror().addBox(-3.5F, -0.3F, -2.3F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		 body.addOrReplaceChild("body5", CubeListBuilder.create().texOffs(0, 100).mirror().addBox(-4.0F, -0.1F, -2.0F, 8.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		 body.addOrReplaceChild("body4", CubeListBuilder.create().texOffs(0, 100).mirror().addBox(3.1F, 0.0F, -2.0F, 1.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		 body.addOrReplaceChild("body3", CubeListBuilder.create().texOffs(0, 100).mirror().addBox(-4.1F, 0.0F, -2.0F, 1.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		 body.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(0, 100).mirror().addBox(-4.0F, 0.0F, 1.1F, 8.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		 body.addOrReplaceChild("body1", CubeListBuilder.create().texOffs(0, 100).mirror().addBox(-4.0F, 0.0F, -2.1F, 8.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition left_leg = root.addOrReplaceChild("left_leg", CubeListBuilder.create().texOffs(0, 16).mirror().addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, 12.0F, 0.0F));

		 left_leg.addOrReplaceChild("leftleg27", CubeListBuilder.create().texOffs(0, 150).mirror().addBox(1.4F, 0.3F, -1.5F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));
		 left_leg.addOrReplaceChild("leftleg26", CubeListBuilder.create().texOffs(0, 100).mirror().addBox(-2.2F, 0.8F, 0.2F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));
		 left_leg.addOrReplaceChild("leftleg25", CubeListBuilder.create().texOffs(0, 100).mirror().addBox(-2.2F, 0.8F, -2.2F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));
		 left_leg.addOrReplaceChild("leftleg24", CubeListBuilder.create().texOffs(0, 150).mirror().addBox(0.3F, 0.5F, -0.7F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));
		 left_leg.addOrReplaceChild("leftleg23", CubeListBuilder.create().texOffs(0, 150).mirror().addBox(0.3F, 0.5F, -2.3F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));
		 left_leg.addOrReplaceChild("leftleg22", CubeListBuilder.create().texOffs(150, 300).mirror().addBox(-1.0F, 6.5F, -3.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1115F, 0.0F, 0.0F));
		 left_leg.addOrReplaceChild("leftleg21", CubeListBuilder.create().texOffs(150, 350).mirror().addBox(-1.0F, 5.0F, -3.4F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1115F, 0.0F, 0.0F));
		 left_leg.addOrReplaceChild("leftleg20", CubeListBuilder.create().texOffs(0, 250).mirror().addBox(-1.5F, 11.0F, -2.8F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));
		 left_leg.addOrReplaceChild("leftleg19", CubeListBuilder.create().texOffs(0, 250).mirror().addBox(-2.2F, 10.0F, -2.5F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));
		 left_leg.addOrReplaceChild("leftleg18", CubeListBuilder.create().texOffs(0, 250).mirror().addBox(-0.8F, 10.0F, -2.5F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));
		 left_leg.addOrReplaceChild("leftleg17", CubeListBuilder.create().texOffs(0, 150).mirror().addBox(1.6F, 0.5F, -1.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));
		 left_leg.addOrReplaceChild("leftleg16", CubeListBuilder.create().texOffs(0, 250).mirror().addBox(-2.3F, 5.5F, 0.3F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));
		 left_leg.addOrReplaceChild("leftleg15", CubeListBuilder.create().texOffs(0, 250).mirror().addBox(-1.7F, 5.5F, 1.3F, 4.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));
		 left_leg.addOrReplaceChild("leftleg14", CubeListBuilder.create().texOffs(0, 250).mirror().addBox(-1.5F, 7.5F, -2.4F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));
		 left_leg.addOrReplaceChild("leftleg13", CubeListBuilder.create().texOffs(0, 250).mirror().addBox(-2.3F, 5.5F, -2.3F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));
		 left_leg.addOrReplaceChild("leftleg12", CubeListBuilder.create().texOffs(0, 250).mirror().addBox(1.3F, 5.5F, -2.3F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));
		 left_leg.addOrReplaceChild("leftleg11", CubeListBuilder.create().texOffs(0, 250).mirror().addBox(1.3F, 5.5F, -1.5F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));
		 left_leg.addOrReplaceChild("leftleg10", CubeListBuilder.create().texOffs(0, 150).mirror().addBox(-2.2F, 4.5F, 0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		 left_leg.addOrReplaceChild("leftleg9", CubeListBuilder.create().texOffs(0, 150).mirror().addBox(-2.2F, 4.5F, -2.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		 left_leg.addOrReplaceChild("leftleg8", CubeListBuilder.create().texOffs(0, 150).mirror().addBox(-1.8F, 4.5F, 0.2F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		 left_leg.addOrReplaceChild("leftleg7", CubeListBuilder.create().texOffs(0, 150).mirror().addBox(-1.8F, 4.5F, -2.2F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		 left_leg.addOrReplaceChild("leftleg6", CubeListBuilder.create().texOffs(0, 150).mirror().addBox(0.2F, 0.5F, 0.2F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		 left_leg.addOrReplaceChild("leftleg5", CubeListBuilder.create().texOffs(0, 150).mirror().addBox(0.2F, 0.5F, -2.2F, 2.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		 left_leg.addOrReplaceChild("leftleg4", CubeListBuilder.create().texOffs(0, 100).mirror().addBox(1.1F, 0.0F, -2.0F, 1.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		 left_leg.addOrReplaceChild("leftleg3", CubeListBuilder.create().texOffs(0, 100).mirror().addBox(-2.1F, 0.0F, -2.0F, 1.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		 left_leg.addOrReplaceChild("leftleg2", CubeListBuilder.create().texOffs(0, 100).mirror().addBox(-2.0F, 0.0F, 1.1F, 4.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		 left_leg.addOrReplaceChild("leftleg1", CubeListBuilder.create().texOffs(0, 100).mirror().addBox(-2.0F, 0.0F, -2.1F, 4.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition right_leg = root.addOrReplaceChild("right_leg", CubeListBuilder.create().texOffs(0, 16).mirror().addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-2.0F, 12.0F, 0.0F));

		 right_leg.addOrReplaceChild("rightleg35", CubeListBuilder.create().texOffs(0, 150).mirror().addBox(-3.4F, 2.3F, -1.5F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(1.0F, -2.0F, 0.0F));

		 right_leg.addOrReplaceChild("rightleg34", CubeListBuilder.create().texOffs(0, 150).mirror().addBox(-0.6F, 10.8F, -2.5F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(1.0F, -2.0F, 0.0F));

		 right_leg.addOrReplaceChild("rightleg33", CubeListBuilder.create().texOffs(0, 100).mirror().addBox(-0.8F, 2.8F, 0.2F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(1.0F, -2.0F, 0.0F));

		 right_leg.addOrReplaceChild("rightleg32", CubeListBuilder.create().texOffs(0, 100).mirror().addBox(-0.8F, 2.8F, -2.2F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(1.0F, -2.0F, 0.0F));

		 right_leg.addOrReplaceChild("rightleg31", CubeListBuilder.create().texOffs(0, 150).mirror().addBox(-2.3F, 2.5F, -0.7F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(1.0F, -2.0F, 0.0F));

		 right_leg.addOrReplaceChild("rightleg30", CubeListBuilder.create().texOffs(0, 150).mirror().addBox(-2.3F, 2.5F, -2.3F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(1.0F, -2.0F, 0.0F));

		 right_leg.addOrReplaceChild("rightleg29", CubeListBuilder.create().texOffs(0, 150).mirror().addBox(-3.4F, 8.2F, 0.4F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(1.0F, -2.0F, 0.0F));

		 right_leg.addOrReplaceChild("rightleg28", CubeListBuilder.create().texOffs(0, 150).mirror().addBox(0.4F, 8.2F, -0.6F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(1.0F, -2.0F, 0.0F));

		 right_leg.addOrReplaceChild("rightleg27", CubeListBuilder.create().texOffs(0, 150).mirror().addBox(0.4F, 8.2F, -2.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(1.0F, -2.0F, 0.0F));

		 right_leg.addOrReplaceChild("rightleg26", CubeListBuilder.create().texOffs(0, 150).mirror().addBox(-3.4F, 10.8F, -2.5F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(1.0F, -2.0F, 0.0F));

		 right_leg.addOrReplaceChild("rightleg25", CubeListBuilder.create().texOffs(0, 150).mirror().addBox(-3.4F, 8.2F, -2.4F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(1.0F, -2.0F, 0.0F));

		 right_leg.addOrReplaceChild("rightleg24", CubeListBuilder.create().texOffs(0, 150).mirror().addBox(-3.7F, 10.3F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(1.0F, -2.0F, 0.0F));

		 right_leg.addOrReplaceChild("rightleg23", CubeListBuilder.create().texOffs(0, 150).mirror().addBox(-3.7F, 7.7F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(1.0F, -2.0F, 0.0F));

		 right_leg.addOrReplaceChild("rightleg22", CubeListBuilder.create().texOffs(150, 300).mirror().addBox(-2.0F, 8.5F, -3.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0F, -2.0F, 0.0F, 0.1115F, 0.0F, 0.0F));

		 right_leg.addOrReplaceChild("rightleg21", CubeListBuilder.create().texOffs(150, 350).mirror().addBox(-2.0F, 7.0F, -3.4F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0F, -2.0F, 0.0F, 0.1115F, 0.0F, 0.0F));

		 right_leg.addOrReplaceChild("rightleg20", CubeListBuilder.create().texOffs(0, 250).mirror().addBox(-2.5F, 13.0F, -2.8F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(1.0F, -2.0F, 0.0F));

		 right_leg.addOrReplaceChild("rightleg19", CubeListBuilder.create().texOffs(0, 250).mirror().addBox(-0.8F, 12.0F, -2.5F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(1.0F, -2.0F, 0.0F));

		 right_leg.addOrReplaceChild("rightleg18", CubeListBuilder.create().texOffs(0, 250).mirror().addBox(-3.2F, 12.0F, -2.5F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(1.0F, -2.0F, 0.0F));

		 right_leg.addOrReplaceChild("rightleg17", CubeListBuilder.create().texOffs(0, 150).mirror().addBox(-3.6F, 2.5F, -1.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(1.0F, -2.0F, 0.0F));

		 right_leg.addOrReplaceChild("rightleg16", CubeListBuilder.create().texOffs(0, 250).mirror().addBox(0.3F, 7.5F, 0.3F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(1.0F, -2.0F, 0.0F));

		 right_leg.addOrReplaceChild("rightleg15", CubeListBuilder.create().texOffs(0, 250).mirror().addBox(-3.3F, 7.5F, 1.3F, 4.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(1.0F, -2.0F, 0.0F));

		 right_leg.addOrReplaceChild("rightleg14", CubeListBuilder.create().texOffs(0, 250).mirror().addBox(-2.5F, 9.5F, -2.4F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(1.0F, -2.0F, 0.0F));

		 right_leg.addOrReplaceChild("rightleg13", CubeListBuilder.create().texOffs(0, 250).mirror().addBox(0.3F, 7.5F, -2.3F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(1.0F, -2.0F, 0.0F));

		 right_leg.addOrReplaceChild("rightleg12", CubeListBuilder.create().texOffs(0, 250).mirror().addBox(-3.3F, 7.5F, -2.3F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(1.0F, -2.0F, 0.0F));

		 right_leg.addOrReplaceChild("rightleg11", CubeListBuilder.create().texOffs(0, 250).mirror().addBox(-3.3F, 7.5F, -1.5F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(1.0F, -2.0F, 0.0F));

		 right_leg.addOrReplaceChild("rightleg10", CubeListBuilder.create().texOffs(0, 150).mirror().addBox(0.2F, 6.5F, 0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(1.0F, -2.0F, 0.0F));

		 right_leg.addOrReplaceChild("rightleg9", CubeListBuilder.create().texOffs(0, 150).mirror().addBox(0.2F, 6.5F, -2.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(1.0F, -2.0F, 0.0F));

		 right_leg.addOrReplaceChild("rightleg8", CubeListBuilder.create().texOffs(0, 150).mirror().addBox(-3.2F, 6.5F, 0.2F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(1.0F, -2.0F, 0.0F));

		 right_leg.addOrReplaceChild("rightleg7", CubeListBuilder.create().texOffs(0, 150).mirror().addBox(-3.2F, 6.5F, -2.2F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(1.0F, -2.0F, 0.0F));

		 right_leg.addOrReplaceChild("rightleg6", CubeListBuilder.create().texOffs(0, 150).mirror().addBox(-3.2F, 2.5F, 0.2F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(1.0F, -2.0F, 0.0F));

		 right_leg.addOrReplaceChild("rightleg5", CubeListBuilder.create().texOffs(0, 150).mirror().addBox(-3.2F, 2.5F, -2.2F, 2.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(1.0F, -2.0F, 0.0F));

		 right_leg.addOrReplaceChild("rightleg4", CubeListBuilder.create().texOffs(0, 100).mirror().addBox(0.1F, 2.0F, -2.0F, 1.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(1.0F, -2.0F, 0.0F));

		 right_leg.addOrReplaceChild("rightleg3", CubeListBuilder.create().texOffs(0, 100).mirror().addBox(-3.1F, 2.0F, -2.0F, 1.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(1.0F, -2.0F, 0.0F));

		 right_leg.addOrReplaceChild("rightleg2", CubeListBuilder.create().texOffs(0, 100).mirror().addBox(-3.0F, 2.0F, 1.1F, 4.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(1.0F, -2.0F, 0.0F));

		 right_leg.addOrReplaceChild("rightleg1", CubeListBuilder.create().texOffs(0, 100).mirror().addBox(-3.0F, 2.0F, -2.1F, 4.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(1.0F, -2.0F, 0.0F));

		PartDefinition left_arm = root.addOrReplaceChild("left_arm", CubeListBuilder.create().texOffs(40, 16).mirror().addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(5.0F, 2.0F, 0.0F));

		 left_arm.addOrReplaceChild("leftarm38", CubeListBuilder.create().texOffs(0, 150).mirror().addBox(-1.3F, 1.7F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		 left_arm.addOrReplaceChild("leftarm37", CubeListBuilder.create().texOffs(0, 150).mirror().addBox(-1.3F, 0.3F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		 left_arm.addOrReplaceChild("leftarm36", CubeListBuilder.create().texOffs(0, 150).mirror().addBox(-0.9F, 1.5F, 1.3F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		 left_arm.addOrReplaceChild("leftarm35", CubeListBuilder.create().texOffs(0, 150).mirror().addBox(-0.9F, 1.5F, -2.3F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		 left_arm.addOrReplaceChild("leftarm34", CubeListBuilder.create().texOffs(0, 200).mirror().addBox(-0.5F, 9.2F, -2.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		 left_arm.addOrReplaceChild("leftarm33", CubeListBuilder.create().texOffs(0, 200).mirror().addBox(1.3F, 8.3F, -1.5F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		 left_arm.addOrReplaceChild("leftarm32", CubeListBuilder.create().texOffs(30, 200).mirror().addBox(0.1F, 5.0F, -2.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		 left_arm.addOrReplaceChild("leftarm31", CubeListBuilder.create().texOffs(0, 200).mirror().addBox(-0.4F, 4.4F, -2.6F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		 left_arm.addOrReplaceChild("leftarm30", CubeListBuilder.create().texOffs(0, 200).mirror().addBox(-0.6F, 5.8F, 0.4F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		 left_arm.addOrReplaceChild("leftarm29", CubeListBuilder.create().texOffs(0, 200).mirror().addBox(0.4F, 5.8F, -2.4F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		 left_arm.addOrReplaceChild("leftarm28", CubeListBuilder.create().texOffs(0, 150).mirror().addBox(2.4F, 5.8F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		 left_arm.addOrReplaceChild("leftarm27", CubeListBuilder.create().texOffs(0, 200).mirror().addBox(2.6F, 3.5F, -1.5F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		 left_arm.addOrReplaceChild("leftarm26", CubeListBuilder.create().texOffs(50, 150).mirror().addBox(2.3F, 4.0F, 1.2F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		 left_arm.addOrReplaceChild("leftarm25", CubeListBuilder.create().texOffs(50, 150).mirror().addBox(2.3F, 4.0F, -2.2F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		 left_arm.addOrReplaceChild("leftarm24", CubeListBuilder.create().texOffs(50, 150).mirror().addBox(-1.3F, 5.0F, -1.5F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		 left_arm.addOrReplaceChild("leftarm23", CubeListBuilder.create().texOffs(50, 150).mirror().addBox(-0.9F, 4.0F, 1.3F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		 left_arm.addOrReplaceChild("leftarm22", CubeListBuilder.create().texOffs(50, 150).mirror().addBox(-1.2F, 4.0F, 1.2F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		 left_arm.addOrReplaceChild("leftarm21", CubeListBuilder.create().texOffs(50, 150).mirror().addBox(-1.2F, 4.0F, -2.2F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		 left_arm.addOrReplaceChild("leftarm20", CubeListBuilder.create().texOffs(50, 150).mirror().addBox(-0.9F, 4.0F, -2.3F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		 left_arm.addOrReplaceChild("leftarm19", CubeListBuilder.create().texOffs(200, 300).mirror().addBox(1.9F, -1.6F, -1.5F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.3718F));

		 left_arm.addOrReplaceChild("leftarm18", CubeListBuilder.create().texOffs(200, 250).mirror().addBox(2.2F, -2.2F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.3346F));

		 left_arm.addOrReplaceChild("leftarm17", CubeListBuilder.create().texOffs(0, 150).mirror().addBox(1.2F, 0.0F, 1.2F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		 left_arm.addOrReplaceChild("leftarm16", CubeListBuilder.create().texOffs(0, 150).mirror().addBox(1.2F, 0.0F, -2.2F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		 left_arm.addOrReplaceChild("leftarm15", CubeListBuilder.create().texOffs(200, 150).mirror().addBox(2.8F, -0.4F, -1.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.2974F, 0.0F));

		 left_arm.addOrReplaceChild("leftarm14", CubeListBuilder.create().texOffs(200, 100).mirror().addBox(2.8F, -0.4F, -0.9F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.2974F, 0.0F));

		 left_arm.addOrReplaceChild("leftarm13", CubeListBuilder.create().texOffs(200, 50).mirror().addBox(2.8F, -0.4F, 0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.2974F, 0.0F));

		 left_arm.addOrReplaceChild("leftarm12", CubeListBuilder.create().texOffs(200, 0).mirror().addBox(2.8F, -0.4F, -0.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.2974F, 0.0F));

		 left_arm.addOrReplaceChild("leftarm11", CubeListBuilder.create().texOffs(0, 150).mirror().addBox(2.7F, -0.2F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		 left_arm.addOrReplaceChild("leftarm10", CubeListBuilder.create().texOffs(0, 150).mirror().addBox(-1.2F, 0.2F, 1.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		left_arm.addOrReplaceChild("leftarm9", CubeListBuilder.create().texOffs(0, 150).mirror().addBox(-1.2F, 0.2F, -2.2F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		left_arm.addOrReplaceChild("leftarm8", CubeListBuilder.create().texOffs(0, 150).mirror().addBox(-0.9F, 0.0F, 1.3F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		left_arm.addOrReplaceChild("leftarm7", CubeListBuilder.create().texOffs(0, 150).mirror().addBox(-0.9F, 0.0F, -2.3F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		left_arm.addOrReplaceChild("leftarm6", CubeListBuilder.create().texOffs(0, 100).mirror().addBox(-1.0F, 9.1F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		left_arm.addOrReplaceChild("leftarm5", CubeListBuilder.create().texOffs(0, 100).mirror().addBox(-1.0F, -2.1F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		left_arm.addOrReplaceChild("leftarm4", CubeListBuilder.create().texOffs(0, 100).mirror().addBox(-1.1F, -2.0F, -2.0F, 1.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		left_arm.addOrReplaceChild("leftarm3", CubeListBuilder.create().texOffs(0, 100).mirror().addBox(2.1F, -2.0F, -2.0F, 1.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		left_arm.addOrReplaceChild("leftarm2", CubeListBuilder.create().texOffs(0, 100).mirror().addBox(-1.0F, -2.0F, 1.1F, 4.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		left_arm.addOrReplaceChild("leftarm1", CubeListBuilder.create().texOffs(0, 100).mirror().addBox(-1.0F, -2.0F, -2.1F, 4.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition right_arm = root.addOrReplaceChild("right_arm", CubeListBuilder.create().texOffs(40, 16).mirror().addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-5.0F, 2.0F, 0.0F));

		right_arm.addOrReplaceChild("rightarm1", CubeListBuilder.create().texOffs(0, 100).mirror().addBox(-3.0F, -2.0F, -2.1F, 4.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		right_arm.addOrReplaceChild("rightarm2", CubeListBuilder.create().texOffs(0, 100).mirror().addBox(-3.0F, -2.0F, 1.1F, 4.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		right_arm.addOrReplaceChild("rightarm3", CubeListBuilder.create().texOffs(0, 100).mirror().addBox(-3.1F, -2.0F, -2.0F, 1.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		right_arm.addOrReplaceChild("rightarm4", CubeListBuilder.create().texOffs(0, 100).mirror().addBox(0.1F, -2.0F, -2.0F, 1.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		right_arm.addOrReplaceChild("rightarm5", CubeListBuilder.create().texOffs(0, 100).mirror().addBox(-3.0F, -2.1F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		right_arm.addOrReplaceChild("rightarm6", CubeListBuilder.create().texOffs(0, 100).mirror().addBox(-3.0F, 9.1F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		right_arm.addOrReplaceChild("rightarm7", CubeListBuilder.create().texOffs(0, 150).mirror().addBox(-2.1F, 0.0F, -2.3F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		right_arm.addOrReplaceChild("rightarm8", CubeListBuilder.create().texOffs(0, 150).mirror().addBox(-2.1F, 0.0F, 1.3F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		right_arm.addOrReplaceChild("rightarm9", CubeListBuilder.create().texOffs(0, 150).mirror().addBox(0.2F, 0.2F, -2.2F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		right_arm.addOrReplaceChild("rightarm10", CubeListBuilder.create().texOffs(0, 150).mirror().addBox(0.2F, 0.2F, 1.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		right_arm.addOrReplaceChild("rightarm11", CubeListBuilder.create().texOffs(0, 150).mirror().addBox(-3.7F, -0.2F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		right_arm.addOrReplaceChild("rightarm12", CubeListBuilder.create().texOffs(150, 0).mirror().addBox(-3.8F, -0.4F, -0.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.2974F, 0.0F));

		right_arm.addOrReplaceChild("rightarm13", CubeListBuilder.create().texOffs(150, 50).mirror().addBox(-3.8F, -0.4F, 0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.2974F, 0.0F));

		right_arm.addOrReplaceChild("rightarm14", CubeListBuilder.create().texOffs(150, 100).mirror().addBox(-3.8F, -0.4F, -0.9F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.2974F, 0.0F));

		right_arm.addOrReplaceChild("rightarm15", CubeListBuilder.create().texOffs(150, 150).mirror().addBox(-3.8F, -0.4F, -1.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.2974F, 0.0F));

		right_arm.addOrReplaceChild("rightarm16", CubeListBuilder.create().texOffs(0, 150).mirror().addBox(-3.2F, 0.0F, -2.2F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		right_arm.addOrReplaceChild("rightarm17", CubeListBuilder.create().texOffs(0, 150).mirror().addBox(-3.2F, 0.0F, 1.2F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		right_arm.addOrReplaceChild("rightarm18", CubeListBuilder.create().texOffs(150, 200).mirror().addBox(-3.2F, -2.2F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.3346F));

		right_arm.addOrReplaceChild("rightarm19", CubeListBuilder.create().texOffs(150, 250).mirror().addBox(-3.9F, -1.6F, -1.5F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.3718F));

		right_arm.addOrReplaceChild("rightarm20", CubeListBuilder.create().texOffs(50, 150).mirror().addBox(-3.1F, 4.0F, -2.3F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		right_arm.addOrReplaceChild("rightarm21", CubeListBuilder.create().texOffs(50, 150).mirror().addBox(0.2F, 4.0F, -2.2F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		right_arm.addOrReplaceChild("rightarm22", CubeListBuilder.create().texOffs(50, 150).mirror().addBox(0.2F, 4.0F, 1.2F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		right_arm.addOrReplaceChild("rightarm23", CubeListBuilder.create().texOffs(50, 150).mirror().addBox(-3.1F, 4.0F, 1.3F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		right_arm.addOrReplaceChild("rightarm24", CubeListBuilder.create().texOffs(50, 150).mirror().addBox(0.3F, 5.0F, -1.5F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		right_arm.addOrReplaceChild("rightarm25", CubeListBuilder.create().texOffs(50, 150).mirror().addBox(-3.3F, 4.0F, -2.2F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		right_arm.addOrReplaceChild("rightarm26", CubeListBuilder.create().texOffs(50, 150).mirror().addBox(-3.3F, 4.0F, 1.2F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		right_arm.addOrReplaceChild("rightarm27", CubeListBuilder.create().texOffs(0, 200).mirror().addBox(-3.6F, 3.5F, -1.5F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		right_arm.addOrReplaceChild("rightarm28", CubeListBuilder.create().texOffs(0, 150).mirror().addBox(-3.4F, 5.8F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		right_arm.addOrReplaceChild("rightarm29", CubeListBuilder.create().texOffs(0, 200).mirror().addBox(-3.4F, 5.8F, -2.4F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		right_arm.addOrReplaceChild("rightarm30", CubeListBuilder.create().texOffs(0, 200).mirror().addBox(-3.4F, 5.8F, 0.4F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		right_arm.addOrReplaceChild("rightarm31", CubeListBuilder.create().texOffs(0, 200).mirror().addBox(-1.6F, 4.4F, -2.6F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		right_arm.addOrReplaceChild("rightarm32", CubeListBuilder.create().texOffs(30, 200).mirror().addBox(-1.1F, 5.0F, -2.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		right_arm.addOrReplaceChild("rightarm33", CubeListBuilder.create().texOffs(0, 200).mirror().addBox(-3.3F, 8.3F, -1.5F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		right_arm.addOrReplaceChild("rightarm34", CubeListBuilder.create().texOffs(0, 200).mirror().addBox(-0.5F, 9.2F, -2.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		right_arm.addOrReplaceChild("rightarm35", CubeListBuilder.create().texOffs(0, 150).mirror().addBox(-2.1F, 1.5F, -2.3F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		right_arm.addOrReplaceChild("rightarm36", CubeListBuilder.create().texOffs(0, 150).mirror().addBox(-2.1F, 1.5F, 1.3F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		right_arm.addOrReplaceChild("rightarm37", CubeListBuilder.create().texOffs(0, 150).mirror().addBox(0.3F, 0.3F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		right_arm.addOrReplaceChild("rightarm38", CubeListBuilder.create().texOffs(0, 150).mirror().addBox(0.3F, 1.7F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

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