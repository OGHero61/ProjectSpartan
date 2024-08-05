package net.hero61.projectspartan.client.model.item.model.armor.mkvi_g1;// Made with Blockbench 4.10.4
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

public class ModelMKVI_G1<T extends LivingEntity> extends HumanoidModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation(ProjectSpartan.MOD_ID, "mkvi_g1_body"), "main");
	public ModelMKVI_G1(ModelPart modelPart) {
		super(modelPart);
	}

	public static LayerDefinition createLayer() {
		MeshDefinition definition = ModelUtils.createBlankHumanoidMesh();
		PartDefinition root = definition.getRoot();
		

		PartDefinition body = root.addOrReplaceChild("body", CubeListBuilder.create().texOffs(16, 16).mirror().addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		body.addOrReplaceChild("chest1", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-3.5F, 0.0F, -3.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		body.addOrReplaceChild("chest2", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(1.5F, 0.0F, -3.0F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		body.addOrReplaceChild("chest3", CubeListBuilder.create().texOffs(80, 210).mirror().addBox(-2.5F, 3.0F, -4.8F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2974F, 0.0F, 0.0F));

		body.addOrReplaceChild("chest4", CubeListBuilder.create().texOffs(80, 230).mirror().addBox(-3.5F, 2.5F, -3.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0744F, 0.0F, 0.0F));

		body.addOrReplaceChild("chest5", CubeListBuilder.create().texOffs(80, 250).mirror().addBox(2.5F, 2.5F, -3.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0744F, 0.0F, 0.0F));

		body.addOrReplaceChild("chest6", CubeListBuilder.create().texOffs(80, 270).mirror().addBox(-1.5F, 1.8F, -2.8F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1487F, 0.0F, 0.0F));

		body.addOrReplaceChild("chest7", CubeListBuilder.create().texOffs(80, 290).mirror().addBox(-1.5F, 2.8F, -3.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1487F, 0.0F, 0.0F));

		body.addOrReplaceChild("chest8", CubeListBuilder.create().texOffs(80, 310).mirror().addBox(1.5F, 3.0F, -4.8F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2974F, 0.0F, 0.0F));

		body.addOrReplaceChild("chest9", CubeListBuilder.create().texOffs(80, 330).mirror().addBox(-1.5F, 3.0F, -4.8F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2974F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest10", CubeListBuilder.create().texOffs(80, 350).mirror().addBox(-2.0F, 4.0F, -4.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2974F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest11", CubeListBuilder.create().texOffs(80, 370).mirror().addBox(1.0F, 4.0F, -4.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2974F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest12", CubeListBuilder.create().texOffs(80, 390).mirror().addBox(-1.0F, 3.5F, -4.8F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2974F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest13", CubeListBuilder.create().texOffs(80, 410).mirror().addBox(-1.5F, 4.0F, -4.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2974F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest14", CubeListBuilder.create().texOffs(80, 430).mirror().addBox(0.5F, 4.0F, -4.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2974F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest15", CubeListBuilder.create().texOffs(80, 450).mirror().addBox(-1.0F, 3.8F, -4.7F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2974F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest16", CubeListBuilder.create().texOffs(80, 470).mirror().addBox(-1.5F, 3.5F, -3.4F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0744F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest17", CubeListBuilder.create().texOffs(80, 490).mirror().addBox(1.5F, 2.5F, -3.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0744F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest18", CubeListBuilder.create().texOffs(150, 50).mirror().addBox(-2.5F, 2.5F, -3.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0744F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest19", CubeListBuilder.create().texOffs(150, 70).mirror().addBox(1.5F, 1.0F, -3.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2231F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest20", CubeListBuilder.create().texOffs(150, 90).mirror().addBox(-3.5F, 1.0F, -3.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2231F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest21", CubeListBuilder.create().texOffs(150, 110).mirror().addBox(1.5F, 2.5F, -3.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0744F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest22", CubeListBuilder.create().texOffs(150, 130).mirror().addBox(-2.5F, 2.5F, -3.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0744F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest23", CubeListBuilder.create().texOffs(150, 150).mirror().addBox(-1.5F, 3.0F, -3.4F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0744F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest24", CubeListBuilder.create().texOffs(150, 170).mirror().addBox(-4.0F, 0.0F, -3.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2231F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest25", CubeListBuilder.create().texOffs(150, 190).mirror().addBox(3.0F, 0.0F, -3.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2231F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest26", CubeListBuilder.create().texOffs(400, 0).mirror().addBox(-0.5F, 1.7F, -2.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1487F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest27", CubeListBuilder.create().texOffs(150, 210).mirror().addBox(-4.0F, 5.0F, -4.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2974F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest28", CubeListBuilder.create().texOffs(150, 230).mirror().addBox(2.0F, 5.0F, -4.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2974F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest29", CubeListBuilder.create().texOffs(150, 230).mirror().addBox(-4.5F, 5.5F, -4.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2974F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest30", CubeListBuilder.create().texOffs(150, 250).mirror().addBox(2.5F, 5.5F, -4.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2974F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest31", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-2.0F, 6.5F, -3.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest32", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-1.0F, 7.0F, -3.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest33", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-2.5F, 7.2F, -2.8F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest34", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-1.5F, 7.8F, -2.8F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest35", CubeListBuilder.create().texOffs(150, 270).mirror().addBox(-3.0F, 3.0F, -4.8F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2974F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest36", CubeListBuilder.create().texOffs(150, 290).mirror().addBox(-3.5F, 4.5F, -4.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2974F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest37", CubeListBuilder.create().texOffs(150, 310).mirror().addBox(2.0F, 3.0F, -4.8F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2974F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest38", CubeListBuilder.create().texOffs(150, 330).mirror().addBox(2.5F, 4.5F, -4.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2974F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest39", CubeListBuilder.create().texOffs(150, 350).mirror().addBox(-2.3F, 10.4F, -2.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.1487F));

		 body.addOrReplaceChild("chest40", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-1.5F, 11.0F, -2.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest41", CubeListBuilder.create().texOffs(150, 370).mirror().addBox(1.6F, 10.6F, -2.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.4833F));

		 body.addOrReplaceChild("chest42", CubeListBuilder.create().texOffs(150, 390).mirror().addBox(-4.6F, 10.6F, -2.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.4833F));

		 body.addOrReplaceChild("chest43", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-2.4F, 10.6F, -2.5F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest44", CubeListBuilder.create().texOffs(150, 410).mirror().addBox(-2.0F, 10.0F, -0.2F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2603F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest45", CubeListBuilder.create().texOffs(150, 430).mirror().addBox(-0.7F, 10.4F, -2.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1487F));

		 body.addOrReplaceChild("chest46", CubeListBuilder.create().texOffs(150, 450).mirror().addBox(-1.0F, 10.6F, -4.8F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1487F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest47", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(3.5F, 10.1F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest48", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-4.5F, 10.1F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest49", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-5.0F, 9.5F, -1.0F, 10.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest50", CubeListBuilder.create().texOffs(300, 0).mirror().addBox(-3.0F, 0.0F, -2.4F, 6.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest51", CubeListBuilder.create().texOffs(150, 470).mirror().addBox(2.5F, 0.0F, -0.5F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1859F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest52", CubeListBuilder.create().texOffs(150, 490).mirror().addBox(-5.5F, 0.0F, -0.5F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1859F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest53", CubeListBuilder.create().texOffs(200, 50).mirror().addBox(2.5F, 0.6F, 1.9F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.409F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest54", CubeListBuilder.create().texOffs(200, 70).mirror().addBox(-5.5F, 0.6F, 1.9F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.409F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest55", CubeListBuilder.create().texOffs(200, 90).mirror().addBox(3.5F, -0.3F, -2.3F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1115F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest56", CubeListBuilder.create().texOffs(300, 210).mirror().addBox(4.5F, -0.3F, -1.3F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1115F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest57", CubeListBuilder.create().texOffs(200, 110).mirror().addBox(-5.5F, -0.3F, -1.3F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1115F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest58", CubeListBuilder.create().texOffs(200, 130).mirror().addBox(-4.5F, -0.3F, -2.3F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1115F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest59", CubeListBuilder.create().texOffs(200, 150).mirror().addBox(2.5F, 1.5F, 0.7F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.7854F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest60", CubeListBuilder.create().texOffs(200, 170).mirror().addBox(-5.5F, 1.5F, 0.7F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.7854F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest61", CubeListBuilder.create().texOffs(200, 190).mirror().addBox(1.0F, 0.0F, 0.5F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1859F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest62", CubeListBuilder.create().texOffs(200, 210).mirror().addBox(-2.0F, 0.0F, 0.5F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1859F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest63", CubeListBuilder.create().texOffs(200, 230).mirror().addBox(2.0F, 1.0F, 0.5F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1859F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest64", CubeListBuilder.create().texOffs(200, 250).mirror().addBox(-3.0F, 1.0F, 0.5F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1859F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest65", CubeListBuilder.create().texOffs(200, 270).mirror().addBox(-1.0F, 0.0F, 0.5F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1859F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest66", CubeListBuilder.create().texOffs(200, 290).mirror().addBox(-2.0F, 2.6F, 1.4F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1487F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest67", CubeListBuilder.create().texOffs(200, 310).mirror().addBox(1.0F, 2.6F, 1.4F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1487F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest68", CubeListBuilder.create().texOffs(200, 330).mirror().addBox(-1.0F, 2.6F, 1.4F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1487F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest69", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-4.5F, 6.3F, -1.5F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest70", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(1.5F, 6.3F, -1.5F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest71", CubeListBuilder.create().texOffs(400, 0).mirror().addBox(-1.0F, 2.0F, 0.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1859F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest73", CubeListBuilder.create().texOffs(400, 0).mirror().addBox(-5.0F, 1.0F, 5.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.409F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest74", CubeListBuilder.create().texOffs(400, 0).mirror().addBox(3.0F, 1.0F, 5.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.409F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest75", CubeListBuilder.create().texOffs(400, 0).mirror().addBox(-4.5F, 1.5F, 3.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1859F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest76", CubeListBuilder.create().texOffs(400, 0).mirror().addBox(3.5F, 1.5F, 3.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1859F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest72", CubeListBuilder.create().texOffs(400, 0).mirror().addBox(-1.0F, 3.0F, 1.1F, 2.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1487F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest77", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-3.5F, 10.6F, 1.5F, 7.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest78", CubeListBuilder.create().texOffs(200, 350).mirror().addBox(-2.0F, 9.1F, 2.8F, 4.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1859F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest79", CubeListBuilder.create().texOffs(200, 370).mirror().addBox(-2.5F, 9.6F, 3.8F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1859F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest80", CubeListBuilder.create().texOffs(300, 0).mirror().addBox(-3.0F, 0.0F, 1.4F, 6.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest81", CubeListBuilder.create().texOffs(200, 390).mirror().addBox(-3.5F, 2.6F, 0.9F, 7.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.409F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest82", CubeListBuilder.create().texOffs(200, 410).mirror().addBox(-3.5F, 0.9F, -2.3F, 7.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1859F, 0.0F, 0.0F));

		PartDefinition right_arm = root.addOrReplaceChild("right_arm", CubeListBuilder.create().texOffs(40, 16).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F));

		 right_arm.addOrReplaceChild("right_arm31", CubeListBuilder.create().texOffs(400, 0).addBox(-8.0F, -24.0F, -2.1F, 4.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, 22.0F, 0.0F));

		 right_arm.addOrReplaceChild("right_arm35", CubeListBuilder.create().texOffs(400, 0).addBox(-8.0F, -24.0F, 1.1F, 4.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, 22.0F, 0.0F));

		 right_arm.addOrReplaceChild("right_arm36", CubeListBuilder.create().texOffs(400, 0).addBox(-8.1F, -24.0F, -2.0F, 1.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, 22.0F, 0.0F));

		 right_arm.addOrReplaceChild("right_arm37", CubeListBuilder.create().texOffs(400, 0).addBox(0.1F, 0.0F, -2.0F, 1.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -2.0F, 0.0F));

		 right_arm.addOrReplaceChild("right_arm38", CubeListBuilder.create().texOffs(400, 0).addBox(-3.0F, -24.1F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 22.0F, 0.0F));

		 right_arm.addOrReplaceChild("right_arm39", CubeListBuilder.create().texOffs(400, 0).addBox(-8.0F, -12.9F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, 22.0F, 0.0F));

		 right_arm.addOrReplaceChild("right_arm40", CubeListBuilder.create().texOffs(100, 0).addBox(-8.0F, -21.5F, -2.3F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, 22.0F, 0.0F));

		 right_arm.addOrReplaceChild("right_arm41", CubeListBuilder.create().texOffs(100, 0).addBox(-3.0F, -21.5F, 1.3F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 22.0F, 0.0F));

		 right_arm.addOrReplaceChild("right_arm42", CubeListBuilder.create().texOffs(100, 0).addBox(-3.3F, 0.5F, -2.1F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		 right_arm.addOrReplaceChild("right_arm43", CubeListBuilder.create().texOffs(100, 0).addBox(-3.3F, 0.5F, 1.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		 right_arm.addOrReplaceChild("right_arm44", CubeListBuilder.create().texOffs(100, 0).addBox(0.3F, 1.0F, -2.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		 right_arm.addOrReplaceChild("right_arm45", CubeListBuilder.create().texOffs(300, 0).addBox(0.3F, 1.0F, 1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		 right_arm.addOrReplaceChild("right_arm46", CubeListBuilder.create().texOffs(200, 430).addBox(-2.0F, -0.2F, -2.9F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1859F, 0.0F, 0.0F));

		 right_arm.addOrReplaceChild("right_arm47", CubeListBuilder.create().texOffs(300, 230).addBox(-3.9F, -0.8F, -1.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2603F));

		 right_arm.addOrReplaceChild("right_arm48", CubeListBuilder.create().texOffs(200, 450).addBox(-3.8251F, -0.8959F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2231F));

		 right_arm.addOrReplaceChild("right_arm49", CubeListBuilder.create().texOffs(200, 470).addBox(-9.2463F, -0.154F, 0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, -2.0F, 0.0F, 0.0F, 0.0F, -0.2603F));

		 right_arm.addOrReplaceChild("right_arm50", CubeListBuilder.create().texOffs(200, 490).addBox(-8.9F, -0.154F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, -2.0F, 0.0F, 0.0F, 0.0F, -0.2603F));

		 right_arm.addOrReplaceChild("right_arm51", CubeListBuilder.create().texOffs(250, 50).addBox(-3.5F, 1.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.2231F));

		 right_arm.addOrReplaceChild("right_arm52", CubeListBuilder.create().texOffs(250, 70).addBox(-8.3F, -22.2F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, 22.0F, 0.0F, 0.0F, 0.0F, 0.2231F));

		 right_arm.addOrReplaceChild("right_arm53", CubeListBuilder.create().texOffs(250, 90).addBox(-7.0F, 1.8F, 2.4F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, -2.0F, 0.0F, -0.2603F, 0.0F, 0.0F));

		 right_arm.addOrReplaceChild("right_arm54", CubeListBuilder.create().texOffs(100, 0).addBox(-5.0F, 7.0F, -2.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, -2.0F, 0.0F));

		 right_arm.addOrReplaceChild("right_arm55", CubeListBuilder.create().texOffs(100, 0).addBox(-8.0F, 7.0F, -2.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, -2.0F, 0.0F));

		 right_arm.addOrReplaceChild("right_arm56", CubeListBuilder.create().texOffs(100, 0).addBox(-7.0F, 8.0F, -2.4F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, -2.0F, 0.0F));

		 right_arm.addOrReplaceChild("right_arm57", CubeListBuilder.create().texOffs(100, 0).addBox(-8.3F, 7.0F, -2.1F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, -2.0F, 0.0F));

		 right_arm.addOrReplaceChild("right_arm58", CubeListBuilder.create().texOffs(100, 0).addBox(-8.3F, 7.0F, 1.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, -2.0F, 0.0F));

		 right_arm.addOrReplaceChild("right_arm59", CubeListBuilder.create().texOffs(100, 0).addBox(-8.0F, 7.0F, 1.3F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, -2.0F, 0.0F));

		 right_arm.addOrReplaceChild("right_arm60", CubeListBuilder.create().texOffs(100, 0).addBox(-4.7F, 7.0F, -2.1F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, -2.0F, 0.0F));

		 right_arm.addOrReplaceChild("right_arm61", CubeListBuilder.create().texOffs(100, 0).addBox(-4.7F, 7.0F, 1.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, -2.0F, 0.0F));

		 right_arm.addOrReplaceChild("right_arm62", CubeListBuilder.create().texOffs(250, 110).addBox(-7.5F, 6.0F, 2.1F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, -2.0F, 0.0F, -0.0744F, 0.0F, 0.0F));

		 right_arm.addOrReplaceChild("right_arm63", CubeListBuilder.create().texOffs(250, 130).addBox(-9.1F, 6.2F, -2.2F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, -2.0F, 0.0F, 0.0F, 0.0F, -0.1115F));

		 right_arm.addOrReplaceChild("right_arm64", CubeListBuilder.create().texOffs(250, 150).addBox(-9.3F, 6.6F, -1.1F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, -2.0F, 0.0F, 0.0F, 0.0F, -0.1115F));

		 right_arm.addOrReplaceChild("right_arm65", CubeListBuilder.create().texOffs(100, 0).addBox(-6.5F, 9.0F, -2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, -2.0F, 0.0F));

		 right_arm.addOrReplaceChild("right_arm66", CubeListBuilder.create().texOffs(100, 0).addBox(-6.5F, 8.0F, 1.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, -2.0F, 0.0F));

		 right_arm.addOrReplaceChild("right_arm67", CubeListBuilder.create().texOffs(100, 0).addBox(-8.4F, 10.3F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, -2.0F, 0.0F));

		PartDefinition left_arm = root.addOrReplaceChild("left_arm", CubeListBuilder.create().texOffs(40, 16).mirror().addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(5.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F));

	left_arm.addOrReplaceChild("left_arm1", CubeListBuilder.create().texOffs(400, 0).mirror().addBox(4.0F, -24.0F, -2.1F, 4.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-5.0F, 22.0F, 0.0F));

	left_arm.addOrReplaceChild("left_arm2", CubeListBuilder.create().texOffs(400, 0).mirror().addBox(4.0F, -24.0F, 1.1F, 4.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-5.0F, 22.0F, 0.0F));

	left_arm.addOrReplaceChild("left_arm3", CubeListBuilder.create().texOffs(400, 0).mirror().addBox(7.1F, -24.0F, -2.0F, 1.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-5.0F, 22.0F, 0.0F));

	left_arm.addOrReplaceChild("left_arm4", CubeListBuilder.create().texOffs(400, 0).mirror().addBox(-1.1F, 0.0F, -2.0F, 1.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, -2.0F, 0.0F));

	left_arm.addOrReplaceChild("left_arm5", CubeListBuilder.create().texOffs(400, 0).mirror().addBox(-1.0F, -24.1F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 22.0F, 0.0F));

	left_arm.addOrReplaceChild("left_arm6", CubeListBuilder.create().texOffs(400, 0).mirror().addBox(4.0F, -12.9F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-5.0F, 22.0F, 0.0F));

	left_arm.addOrReplaceChild("left_arm7", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(4.0F, -21.5F, -2.3F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-5.0F, 22.0F, 0.0F));

	left_arm.addOrReplaceChild("left_arm8", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-1.0F, -21.5F, 1.3F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 22.0F, 0.0F));

	left_arm.addOrReplaceChild("left_arm9", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(2.3F, 0.5F, -2.1F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

	 left_arm.addOrReplaceChild("left_arm10", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(2.3F, 0.5F, 1.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

	 left_arm.addOrReplaceChild("left_arm11", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-1.3F, 1.0F, -2.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

	 left_arm.addOrReplaceChild("left_arm12", CubeListBuilder.create().texOffs(300, 0).mirror().addBox(-1.3F, 1.0F, 1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

	 left_arm.addOrReplaceChild("left_arm13", CubeListBuilder.create().texOffs(200, 430).mirror().addBox(0.0F, -0.2F, -2.9F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1859F, 0.0F, 0.0F));

	 left_arm.addOrReplaceChild("left_arm14", CubeListBuilder.create().texOffs(300, 230).mirror().addBox(2.9F, -0.8F, -1.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2603F));

	 left_arm.addOrReplaceChild("left_arm15", CubeListBuilder.create().texOffs(200, 450).mirror().addBox(2.8251F, -0.8959F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2231F));

	 left_arm.addOrReplaceChild("left_arm16", CubeListBuilder.create().texOffs(200, 470).mirror().addBox(8.2463F, -0.154F, 0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.2603F));

	 left_arm.addOrReplaceChild("left_arm17", CubeListBuilder.create().texOffs(200, 490).mirror().addBox(7.9F, -0.154F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.2603F));

	 left_arm.addOrReplaceChild("left_arm18", CubeListBuilder.create().texOffs(250, 50).mirror().addBox(2.5F, 1.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.0F, 0.0F, 0.0F, 0.0F, -0.2231F));

	 left_arm.addOrReplaceChild("left_arm19", CubeListBuilder.create().texOffs(250, 70).mirror().addBox(7.3F, -22.2F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.0F, 22.0F, 0.0F, 0.0F, 0.0F, -0.2231F));

	 left_arm.addOrReplaceChild("left_arm20", CubeListBuilder.create().texOffs(250, 90).mirror().addBox(5.0F, 1.8F, 2.4F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.0F, -2.0F, 0.0F, -0.2603F, 0.0F, 0.0F));

	 left_arm.addOrReplaceChild("left_arm21", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(4.0F, 7.0F, -2.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-5.0F, -2.0F, 0.0F));

	 left_arm.addOrReplaceChild("left_arm22", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(7.0F, 7.0F, -2.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-5.0F, -2.0F, 0.0F));

	 left_arm.addOrReplaceChild("left_arm23", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(5.0F, 8.0F, -2.4F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-5.0F, -2.0F, 0.0F));

	 left_arm.addOrReplaceChild("left_arm24", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(7.3F, 7.0F, -2.1F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-5.0F, -2.0F, 0.0F));

	 left_arm.addOrReplaceChild("left_arm25", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(7.3F, 7.0F, 1.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-5.0F, -2.0F, 0.0F));

	 left_arm.addOrReplaceChild("left_arm26", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(4.0F, 7.0F, 1.3F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-5.0F, -2.0F, 0.0F));

	 left_arm.addOrReplaceChild("left_arm27", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(3.7F, 7.0F, -2.1F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-5.0F, -2.0F, 0.0F));

	 left_arm.addOrReplaceChild("left_arm28", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(3.7F, 7.0F, 1.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-5.0F, -2.0F, 0.0F));

	 left_arm.addOrReplaceChild("left_arm29", CubeListBuilder.create().texOffs(250, 110).mirror().addBox(4.5F, 6.0F, 2.1F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.0F, -2.0F, 0.0F, -0.0744F, 0.0F, 0.0F));

	 left_arm.addOrReplaceChild("left_arm30", CubeListBuilder.create().texOffs(250, 130).mirror().addBox(8.1F, 6.2F, -2.2F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.1115F));

	 left_arm.addOrReplaceChild("left_arm31", CubeListBuilder.create().texOffs(250, 150).mirror().addBox(8.3F, 6.6F, -1.1F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.1115F));

	 left_arm.addOrReplaceChild("left_arm33", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(5.5F, 9.0F, -2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-5.0F, -2.0F, 0.0F));

	 left_arm.addOrReplaceChild("left_arm34", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(5.5F, 8.0F, 1.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-5.0F, -2.0F, 0.0F));

	 left_arm.addOrReplaceChild("left_arm35", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(6.4F, 10.3F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-5.0F, -2.0F, 0.0F));

		PartDefinition right_leg = root.addOrReplaceChild("right_leg", CubeListBuilder.create().texOffs(0, 16).mirror().addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-2.0F, 12.0F, 0.0F));

		right_leg.addOrReplaceChild("right_leg1", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-4.2F, 13.0F, -2.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		right_leg.addOrReplaceChild("right_leg2", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-4.0F, 13.0F, 1.2F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		right_leg.addOrReplaceChild("right_leg3", CubeListBuilder.create().texOffs(250, 390).mirror().addBox(-14.3438F, 1.0166F, -2.3F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.0F, -12.0F, 0.0F, 0.0F, 0.0F, -1.2641F));

		right_leg.addOrReplaceChild("right_leg4", CubeListBuilder.create().texOffs(250, 410).mirror().addBox(-14.3438F, 1.0166F, 1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.0F, -12.0F, 0.0F, 0.0F, 0.0F, -1.2641F));

		right_leg.addOrReplaceChild("right_leg5", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-3.1F, 13.5F, 1.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		right_leg.addOrReplaceChild("right_leg6", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-3.1F, 13.5F, -2.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		right_leg.addOrReplaceChild("right_leg7", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-4.1F, 13.0F, -2.2F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		right_leg.addOrReplaceChild("right_leg8", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-3.1F, 15.0F, -2.2F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		right_leg.addOrReplaceChild("right_leg9", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-0.8F, 15.2F, -2.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		 right_leg.addOrReplaceChild("right_leg10", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-0.8F, 15.8F, -2.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		 right_leg.addOrReplaceChild("right_leg11", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-3.0F, 19.0F, -2.3F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		 right_leg.addOrReplaceChild("right_leg12", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-4.0F, 19.0F, -2.2F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		 right_leg.addOrReplaceChild("right_leg13", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-4.0F, 19.0F, 1.2F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		 right_leg.addOrReplaceChild("left_leg133", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-4.0F, 19.0F, 1.2F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		 right_leg.addOrReplaceChild("right_leg14", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-4.2F, 19.0F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		 right_leg.addOrReplaceChild("right_leg15", CubeListBuilder.create().texOffs(250, 430).mirror().addBox(-6.6559F, 12.1712F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.0F, -12.0F, 0.0F, 0.0F, 0.0F, -0.1487F));

		 right_leg.addOrReplaceChild("right_leg16", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-4.4F, 13.0F, -1.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		 right_leg.addOrReplaceChild("right_leg17", CubeListBuilder.create().texOffs(250, 450).mirror().addBox(-7.3559F, 17.3712F, -1.5F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.0F, -12.0F, 0.0F, 0.0F, 0.0F, -0.1487F));

		 right_leg.addOrReplaceChild("right_leg18", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-4.4F, 19.0F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		 right_leg.addOrReplaceChild("right_leg19", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-4.5F, 21.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		 right_leg.addOrReplaceChild("right_leg20", CubeListBuilder.create().texOffs(250, 470).mirror().addBox(-3.0F, 16.5254F, -4.6357F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.0F, -12.0F, 0.0F, 0.1115F, 0.0F, 0.0F));

		 right_leg.addOrReplaceChild("right_leg21", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-4.2F, 18.3F, -2.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		 right_leg.addOrReplaceChild("right_leg22", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-0.8F, 18.3F, -2.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		 right_leg.addOrReplaceChild("right_leg23", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-3.9F, 15.2F, 1.2F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		 right_leg.addOrReplaceChild("right_leg24", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-0.9F, 15.8F, 1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		 right_leg.addOrReplaceChild("right_leg25", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-3.5F, 22.0F, -2.7F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		 right_leg.addOrReplaceChild("right_leg26", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-0.8F, 18.3F, 1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		 right_leg.addOrReplaceChild("right_leg27", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-4.2F, 18.3F, 1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		 right_leg.addOrReplaceChild("right_leg28", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-0.8F, 19.0F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		 right_leg.addOrReplaceChild("right_leg29", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-0.8F, 23.0F, -2.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		 right_leg.addOrReplaceChild("right_leg30", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-4.2F, 23.0F, -2.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		 right_leg.addOrReplaceChild("right_leg31", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-4.3F, 22.0F, 0.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		 right_leg.addOrReplaceChild("right_leg32", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-0.7F, 22.0F, 0.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		 right_leg.addOrReplaceChild("right_leg33", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-3.5F, 23.0F, 1.3F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		PartDefinition left_leg = root.addOrReplaceChild("left_leg", CubeListBuilder.create().texOffs(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, 12.0F, 0.0F));

		left_leg.addOrReplaceChild("left_leg1", CubeListBuilder.create().texOffs(100, 0).addBox(-0.2F, 18.3F, -2.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

		left_leg.addOrReplaceChild("left_leg2", CubeListBuilder.create().texOffs(100, 0).addBox(-0.2F, 18.3F, 1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

		left_leg.addOrReplaceChild("left_leg3", CubeListBuilder.create().texOffs(100, 0).addBox(-0.2F, 15.2F, -2.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

		left_leg.addOrReplaceChild("left_leg4", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-0.2F, 15.2F, 1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-2.0F, -12.0F, 0.0F));

		left_leg.addOrReplaceChild("left_leg5", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-0.2F, 15.8F, 1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-2.0F, -12.0F, 0.0F));

		left_leg.addOrReplaceChild("left_leg6", CubeListBuilder.create().texOffs(100, 0).addBox(-0.2F, 15.8F, -2.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

		left_leg.addOrReplaceChild("left_leg7", CubeListBuilder.create().texOffs(100, 0).addBox(-0.3F, 22.0F, 0.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

		left_leg.addOrReplaceChild("left_leg8", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-0.2F, 23.0F, -2.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-2.0F, -12.0F, 0.0F));

		left_leg.addOrReplaceChild("left_leg9", CubeListBuilder.create().texOffs(100, 0).addBox(-0.2F, 19.0F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

		 left_leg.addOrReplaceChild("left_leg10", CubeListBuilder.create().texOffs(100, 0).addBox(0.1F, 15.0F, -2.2F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

		 left_leg.addOrReplaceChild("left_leg11", CubeListBuilder.create().texOffs(100, 0).addBox(2.1F, 13.5F, -2.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

		 left_leg.addOrReplaceChild("left_leg12", CubeListBuilder.create().texOffs(250, 390).addBox(13.3438F, 1.0166F, -2.3F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -12.0F, 0.0F, 0.0F, 0.0F, 1.2641F));

		 left_leg.addOrReplaceChild("left_leg13", CubeListBuilder.create().texOffs(100, 0).addBox(3.1F, 13.0F, -2.2F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

		 left_leg.addOrReplaceChild("left_leg14", CubeListBuilder.create().texOffs(100, 0).addBox(3.2F, 13.0F, -2.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

		 left_leg.addOrReplaceChild("left_leg15", CubeListBuilder.create().texOffs(100, 0).addBox(3.4F, 13.0F, -1.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

		 left_leg.addOrReplaceChild("left_leg16", CubeListBuilder.create().texOffs(250, 430).addBox(5.6559F, 12.1712F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -12.0F, 0.0F, 0.0F, 0.0F, 0.1487F));

		 left_leg.addOrReplaceChild("left_leg17", CubeListBuilder.create().texOffs(100, 0).addBox(-0.1F, 15.2F, 1.2F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

		 left_leg.addOrReplaceChild("left_leg18", CubeListBuilder.create().texOffs(100, 0).addBox(3.0F, 13.0F, 1.2F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

		 left_leg.addOrReplaceChild("left_leg19", CubeListBuilder.create().texOffs(100, 0).addBox(2.1F, 13.5F, 1.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

		 left_leg.addOrReplaceChild("left_leg20", CubeListBuilder.create().texOffs(250, 410).addBox(13.3438F, 1.0166F, 1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -12.0F, 0.0F, 0.0F, 0.0F, 1.2641F));

		 left_leg.addOrReplaceChild("left_leg21", CubeListBuilder.create().texOffs(100, 0).addBox(0.0F, 19.0F, -2.2F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

		 left_leg.addOrReplaceChild("left_leg22", CubeListBuilder.create().texOffs(100, 0).addBox(1.0F, 19.0F, -2.3F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

		 left_leg.addOrReplaceChild("left_leg23", CubeListBuilder.create().texOffs(250, 470).addBox(1.0F, 16.5254F, -4.6357F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -12.0F, 0.0F, 0.1115F, 0.0F, 0.0F));

		 left_leg.addOrReplaceChild("left_leg24", CubeListBuilder.create().texOffs(100, 0).addBox(3.2F, 23.0F, -2.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

		 left_leg.addOrReplaceChild("left_leg25", CubeListBuilder.create().texOffs(100, 0).addBox(0.5F, 22.0F, -2.7F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

		 left_leg.addOrReplaceChild("left_leg26", CubeListBuilder.create().texOffs(100, 0).addBox(0.5F, 23.0F, 1.3F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

		 left_leg.addOrReplaceChild("left_leg27", CubeListBuilder.create().texOffs(100, 0).addBox(3.3F, 22.0F, 0.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

		 left_leg.addOrReplaceChild("left_leg28", CubeListBuilder.create().texOffs(100, 0).addBox(3.2F, 18.3F, -2.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

		 left_leg.addOrReplaceChild("left_leg29", CubeListBuilder.create().texOffs(100, 0).addBox(3.2F, 18.3F, 1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

		 left_leg.addOrReplaceChild("left_leg30", CubeListBuilder.create().texOffs(100, 0).addBox(3.2F, 19.0F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

		 left_leg.addOrReplaceChild("left_leg31", CubeListBuilder.create().texOffs(100, 0).addBox(3.4F, 19.0F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

		 left_leg.addOrReplaceChild("left_leg32", CubeListBuilder.create().texOffs(250, 450).addBox(6.3559F, 17.3712F, -1.5F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -12.0F, 0.0F, 0.0F, 0.0F, 0.1487F));

		 left_leg.addOrReplaceChild("left_leg33", CubeListBuilder.create().texOffs(100, 0).addBox(3.5F, 21.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

		 left_leg.addOrReplaceChild("left_leg34", CubeListBuilder.create().texOffs(100, 0).addBox(0.0F, 19.0F, 1.2F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

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

	

