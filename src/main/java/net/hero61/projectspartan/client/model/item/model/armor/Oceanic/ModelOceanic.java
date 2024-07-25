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

public class ModelOceanic<T extends LivingEntity> extends HumanoidModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation(ProjectSpartan.MOD_ID, "oceanic_body"), "main");
	public ModelOceanic(ModelPart modelPart) {
		super(modelPart);
	}

	public static LayerDefinition createLayer() {
		MeshDefinition definition = ModelUtils.createBlankHumanoidMesh();
		PartDefinition root = definition.getRoot();

		PartDefinition body = root.addOrReplaceChild("body", CubeListBuilder.create().texOffs(16, 16).mirror().addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		body.addOrReplaceChild("chest1", CubeListBuilder.create().texOffs(110, 9).mirror().addBox(-3.5F, 0.0F, -3.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		body.addOrReplaceChild("chest2", CubeListBuilder.create().texOffs(33, 169).mirror().addBox(1.5F, 0.0F, -3.0F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		body.addOrReplaceChild("chest3", CubeListBuilder.create().texOffs(80, 210).mirror().addBox(-2.5F, 3.0F, -4.8F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2974F, 0.0F, 0.0F));

		body.addOrReplaceChild("chest4", CubeListBuilder.create().texOffs(47, 263).addBox(-2.2F, 2.8F, -4.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1438F, 0.0F, 0.2182F));

		body.addOrReplaceChild("chest6", CubeListBuilder.create().texOffs(260, 220).mirror().addBox(-2.9F, 0.7F, -2.9F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, -1.0F, 0.3316F, -0.7854F, -0.2182F));

		body.addOrReplaceChild("chest5", CubeListBuilder.create().texOffs(80, 250).mirror().addBox(1.3F, 2.8F, -4.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1438F, 0.0F, -0.2182F));

		body.addOrReplaceChild("chest8", CubeListBuilder.create().texOffs(80, 310).mirror().addBox(1.5F, 3.0F, -4.8F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2974F, 0.0F, 0.0F));

		body.addOrReplaceChild("chest9", CubeListBuilder.create().texOffs(80, 330).mirror().addBox(-1.5F, 3.0F, -4.8F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2974F, 0.0F, 0.0F));

		body.addOrReplaceChild("chest10", CubeListBuilder.create().texOffs(80, 350).mirror().addBox(-2.0F, 4.0F, -4.81F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2974F, 0.0F, 0.0F));

		body.addOrReplaceChild("chest11", CubeListBuilder.create().texOffs(80, 370).mirror().addBox(1.0F, 4.0F, -4.81F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2974F, 0.0F, 0.0F));

		body.addOrReplaceChild("chest12", CubeListBuilder.create().texOffs(80, 390).mirror().addBox(-1.0F, 3.5F, -4.8F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2974F, 0.0F, 0.0F));

		body.addOrReplaceChild("chest13", CubeListBuilder.create().texOffs(80, 410).mirror().addBox(-1.5F, 4.0F, -4.8F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2974F, 0.0F, 0.0F));

		body.addOrReplaceChild("chest14", CubeListBuilder.create().texOffs(80, 430).mirror().addBox(0.5F, 4.0F, -4.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2974F, 0.0F, 0.0F));

		body.addOrReplaceChild("chest16", CubeListBuilder.create().texOffs(80, 470).mirror().addBox(-1.5F, 3.5F, -3.41F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0744F, 0.0F, 0.0F));

		body.addOrReplaceChild("chest17", CubeListBuilder.create().texOffs(79, 490).mirror().addBox(0.5F, 2.5F, -3.4F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0744F, 0.0F, 0.0F));

		body.addOrReplaceChild("chest18", CubeListBuilder.create().texOffs(149, 50).mirror().addBox(-3.5F, 2.5F, -3.4F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0744F, 0.0F, 0.0F));

		body.addOrReplaceChild("chest19", CubeListBuilder.create().texOffs(150, 70).mirror().addBox(1.5F, 1.0F, -3.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2231F, 0.0F, 0.0F));

		body.addOrReplaceChild("chest15", CubeListBuilder.create().texOffs(151, 70).mirror().addBox(0.5F, 2.0F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2231F, 0.0F, 0.0F));

		body.addOrReplaceChild("chest20", CubeListBuilder.create().texOffs(254, 237).mirror().addBox(-3.5F, 1.0F, -3.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2231F, 0.0F, 0.0F));

		body.addOrReplaceChild("chest7", CubeListBuilder.create().texOffs(254, 237).mirror().addBox(-1.5F, 2.0F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2231F, 0.0F, 0.0F));

		body.addOrReplaceChild("chest21", CubeListBuilder.create().texOffs(150, 110).mirror().addBox(1.5F, 2.5F, -3.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0744F, 0.0F, 0.0F));

		body.addOrReplaceChild("chest22", CubeListBuilder.create().texOffs(150, 130).mirror().addBox(-2.5F, 2.5F, -3.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0744F, 0.0F, 0.0F));

		body.addOrReplaceChild("chest23", CubeListBuilder.create().texOffs(150, 150).mirror().addBox(-1.5F, 3.0F, -3.4F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0744F, 0.0F, 0.0F));

		body.addOrReplaceChild("chest24", CubeListBuilder.create().texOffs(263, 249).mirror().addBox(-4.0F, 0.0F, -3.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2231F, 0.0F, 0.0F));

		body.addOrReplaceChild("chest25", CubeListBuilder.create().texOffs(259, 202).mirror().addBox(3.0F, 0.0F, -3.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2231F, 0.0F, 0.0F));

		body.addOrReplaceChild("chest26", CubeListBuilder.create().texOffs(340, 147).mirror().addBox(-1.0F, 9.3F, -2.9F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		body.addOrReplaceChild("chest29", CubeListBuilder.create().texOffs(147, 227).mirror().addBox(-4.5F, 5.5F, -4.5F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2974F, 0.0F, 0.0F));

		body.addOrReplaceChild("chest30", CubeListBuilder.create().texOffs(147, 247).mirror().addBox(2.5F, 5.5F, -4.5F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2974F, 0.0F, 0.0F));

		body.addOrReplaceChild("chest31", CubeListBuilder.create().texOffs(286, 115).mirror().addBox(-2.0F, 6.5F, -3.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		body.addOrReplaceChild("chest32", CubeListBuilder.create().texOffs(286, 117).mirror().addBox(-1.0F, 7.0F, -3.1F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		body.addOrReplaceChild("chest34", CubeListBuilder.create().texOffs(110, 9).mirror().addBox(-1.5F, 9.0F, -2.8F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		body.addOrReplaceChild("chest35", CubeListBuilder.create().texOffs(150, 270).mirror().addBox(-3.0F, 3.0F, -4.79F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2974F, 0.0F, 0.0F));

		body.addOrReplaceChild("chest36", CubeListBuilder.create().texOffs(150, 290).mirror().addBox(-3.5F, 4.5F, -4.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2974F, 0.0F, 0.0F));

		body.addOrReplaceChild("chest37", CubeListBuilder.create().texOffs(150, 310).mirror().addBox(2.0F, 3.0F, -4.79F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2974F, 0.0F, 0.0F));

		body.addOrReplaceChild("chest38", CubeListBuilder.create().texOffs(150, 330).mirror().addBox(2.5F, 4.5F, -4.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2974F, 0.0F, 0.0F));

		body.addOrReplaceChild("chest46", CubeListBuilder.create().texOffs(260, 184).mirror().addBox(-1.0F, 10.4F, -4.2F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1487F, 0.0F, 0.0F));

		body.addOrReplaceChild("chest50", CubeListBuilder.create().texOffs(443, 13).mirror().addBox(-3.0F, 0.0F, -2.4F, 6.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		body.addOrReplaceChild("chest51", CubeListBuilder.create().texOffs(151, 471).addBox(2.5F, -0.5879F, 1.5F, 3.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1859F, 0.0F, 0.0F));

		body.addOrReplaceChild("chest49", CubeListBuilder.create().texOffs(152, 472).addBox(2.5F, -0.5879F, -1.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1859F, 0.0F, 0.0F));

		body.addOrReplaceChild("chest62", CubeListBuilder.create().texOffs(152, 472).addBox(-5.5F, -0.5879F, -1.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1859F, 0.0F, 0.0F));

		body.addOrReplaceChild("chest52", CubeListBuilder.create().texOffs(151, 471).mirror().addBox(-5.5F, -0.5879F, 1.5F, 3.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1859F, 0.0F, 0.0F));

		body.addOrReplaceChild("chest53", CubeListBuilder.create().texOffs(201, 51).mirror().addBox(2.5F, 0.2381F, 3.2913F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3491F, 0.0F, 0.0F));

		body.addOrReplaceChild("chest54", CubeListBuilder.create().texOffs(201, 51).addBox(-5.5F, 0.2381F, 3.2913F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3491F, 0.0F, 0.0F));

		body.addOrReplaceChild("chest55", CubeListBuilder.create().texOffs(200, 90).mirror().addBox(3.5F, -0.3F, -2.3F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1115F, 0.0F, 0.0F));

		body.addOrReplaceChild("chest56", CubeListBuilder.create().texOffs(300, 210).mirror().addBox(4.5F, -0.3F, -1.3F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1115F, 0.0F, 0.0F));

		body.addOrReplaceChild("chest57", CubeListBuilder.create().texOffs(200, 110).mirror().addBox(-5.5F, -0.3F, -1.3F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1115F, 0.0F, 0.0F));

		body.addOrReplaceChild("chest58", CubeListBuilder.create().texOffs(200, 130).mirror().addBox(-4.5F, -0.3F, -2.3F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1115F, 0.0F, 0.0F));

		body.addOrReplaceChild("chest59", CubeListBuilder.create().texOffs(218, 181).mirror().addBox(3.5F, 0.5F, 1.7F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.7854F, 0.0F, 0.0F));

		body.addOrReplaceChild("chest60", CubeListBuilder.create().texOffs(215, 194).mirror().addBox(-5.5F, 0.5F, 1.7F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.7854F, 0.0F, 0.0F));

		body.addOrReplaceChild("chest33", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.6581F, 0.0F, 0.0F));

		body.addOrReplaceChild("chest39", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.6581F, 0.0F, 0.0F));

		body.addOrReplaceChild("chest40", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 2.0071F, 0.0F, 0.0F));

		body.addOrReplaceChild("chest41", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 2.0071F, 0.0F, 0.0F));

		body.addOrReplaceChild("chest63", CubeListBuilder.create().texOffs(193, 230).mirror().addBox(-4.0F, 1.0F, 0.5F, 8.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1859F, 0.0F, 0.0F));

		body.addOrReplaceChild("chest64", CubeListBuilder.create().texOffs(481, 166).mirror().addBox(-0.5F, 1.0F, 1.5F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1859F, 0.0F, 0.0F));

		body.addOrReplaceChild("chest65", CubeListBuilder.create().texOffs(197, 269).mirror().addBox(-4.0F, 0.2F, 1.3F, 8.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1859F, 0.0F, 0.0F));

		body.addOrReplaceChild("chest43", CubeListBuilder.create().texOffs(198, 268).mirror().addBox(-2.0F, 3.7F, 0.3F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1859F, 0.0F, 0.0F));

		body.addOrReplaceChild("chest27", CubeListBuilder.create().texOffs(199, 269).mirror().addBox(-2.0F, -0.5F, 1.3F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1859F, 0.0F, 0.0F));

		body.addOrReplaceChild("chest28", CubeListBuilder.create().texOffs(202, 269).mirror().addBox(0.5048F, 4.0398F, 0.4462F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -4.0F, 0.0F, 0.1859F, 0.0F, 0.7854F));

		body.addOrReplaceChild("chest47", CubeListBuilder.create().texOffs(202, 269).mirror().addBox(5.9468F, 2.989F, 1.2456F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -4.0F, 0.0F, 0.1859F, 0.0F, 0.7854F));

		body.addOrReplaceChild("chest42", CubeListBuilder.create().texOffs(202, 269).mirror().addBox(-1.5048F, 4.0398F, 0.4462F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -4.0F, 0.0F, 0.1859F, 0.0F, -0.7854F));

		body.addOrReplaceChild("chest45", CubeListBuilder.create().texOffs(202, 269).mirror().addBox(-6.9468F, 2.989F, 1.2456F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -4.0F, 0.0F, 0.1859F, 0.0F, -0.7854F));

		body.addOrReplaceChild("chest44", CubeListBuilder.create().texOffs(201, 269).mirror().addBox(-1.0F, 8.1F, 0.5607F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -4.0F, 0.0F, 0.1859F, 0.0F, 0.0F));

		body.addOrReplaceChild("chest67", CubeListBuilder.create().texOffs(364, 300).mirror().addBox(-1.5F, 3.6F, 1.4F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1487F, 0.0F, 0.0F));

		body.addOrReplaceChild("chest71", CubeListBuilder.create().texOffs(400, 0).mirror().addBox(-1.0F, 2.0F, 0.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1859F, 0.0F, 0.0F));

		body.addOrReplaceChild("chest72", CubeListBuilder.create().texOffs(429, 24).mirror().addBox(-1.0F, 6.0F, 1.1F, 2.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1487F, 0.0F, 0.0F));

		body.addOrReplaceChild("chest78", CubeListBuilder.create().texOffs(201, 350).mirror().addBox(-1.0F, 10.1F, 2.8F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1859F, 0.0F, 0.0F));

		body.addOrReplaceChild("chest48", CubeListBuilder.create().texOffs(201, 350).mirror().addBox(6.3288F, 7.1166F, 2.2389F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1859F, 0.0F, 0.7854F));

		body.addOrReplaceChild("chest61", CubeListBuilder.create().texOffs(201, 350).mirror().addBox(-8.3288F, 7.1166F, 2.2389F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1859F, 0.0F, -0.7854F));

		body.addOrReplaceChild("chest79", CubeListBuilder.create().texOffs(200, 370).mirror().addBox(-2.5F, 9.0F, 3.81F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1859F, 0.0F, 0.0F));

		body.addOrReplaceChild("chest80", CubeListBuilder.create().texOffs(464, 16).mirror().addBox(-3.0F, -1.0F, 1.4F, 6.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		body.addOrReplaceChild("chest81", CubeListBuilder.create().texOffs(200, 390).mirror().addBox(-3.5F, 1.3515F, 1.1404F, 7.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.409F, 0.0F, 0.0F));

		PartDefinition right_arm = root.addOrReplaceChild("right_arm", CubeListBuilder.create().texOffs(40, 16).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F));

		 right_arm.addOrReplaceChild("right_arm31", CubeListBuilder.create().texOffs(434, 285).addBox(-8.0F, -24.0F, -2.1F, 4.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, 22.0F, 0.0F));

		 right_arm.addOrReplaceChild("right_arm35", CubeListBuilder.create().texOffs(432, 319).addBox(-8.0F, -24.0F, 1.1F, 4.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, 22.0F, 0.0F));

		 right_arm.addOrReplaceChild("right_arm36", CubeListBuilder.create().texOffs(465, 289).addBox(-8.1F, -24.0F, -2.0F, 1.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, 22.0F, 0.0F));

		 right_arm.addOrReplaceChild("right_arm37", CubeListBuilder.create().texOffs(444, 296).addBox(0.1F, 0.0F, -2.0F, 1.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -2.0F, 0.0F));

		 right_arm.addOrReplaceChild("right_arm38", CubeListBuilder.create().texOffs(455, 326).addBox(-3.0F, -24.1F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 22.0F, 0.0F));

		 right_arm.addOrReplaceChild("right_arm39", CubeListBuilder.create().texOffs(388, 331).addBox(-8.0F, -12.9F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, 22.0F, 0.0F));

		 right_arm.addOrReplaceChild("right_arm40", CubeListBuilder.create().texOffs(109, 8).addBox(-0.7789F, -24.3008F, -2.4142F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.0F, 22.0F, 0.0F));

		right_arm.addOrReplaceChild("right_arm3", CubeListBuilder.create().texOffs(107, 6).addBox(-0.7687F, -24.4361F, -1.6321F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.0F, 22.0F, 0.0F));

		 right_arm.addOrReplaceChild("right_arm46", CubeListBuilder.create().texOffs(199, 430).addBox(-2.5F, 0.5172F, -2.7152F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1859F, 0.0F, 0.0F));

		 right_arm.addOrReplaceChild("right_arm47", CubeListBuilder.create().texOffs(95, 174).addBox(-3.7614F, -0.8676F, -2.3794F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.7854F, -0.0436F, 0.1358F));

		right_arm.addOrReplaceChild("right_arm4", CubeListBuilder.create().texOffs(95, 174).addBox(-3.7676F, -0.9304F, -0.7493F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.7854F, 0.0436F, 0.1358F));

		 right_arm.addOrReplaceChild("right_arm48", CubeListBuilder.create().texOffs(77, 225).addBox(-3.2428F, -4.2412F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2133F));

		 right_arm.addOrReplaceChild("right_arm49", CubeListBuilder.create().texOffs(400, 285).addBox(-8.4025F, 3.1417F, -1.045F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.1358F));

		 right_arm.addOrReplaceChild("right_arm51", CubeListBuilder.create().texOffs(88, 61).addBox(-3.6435F, -0.935F, -2.3492F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0F, 0.0F, -0.7854F, 0.0F, -0.2231F));

		right_arm.addOrReplaceChild("right_arm2", CubeListBuilder.create().texOffs(88, 61).addBox(2.2078F, 0.0105F, 0.4037F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.0F, -2.0F, 0.0F, 0.7854F, 0.0F, -0.2231F));

		 right_arm.addOrReplaceChild("right_arm53", CubeListBuilder.create().texOffs(250, 90).addBox(-7.0F, 2.8F, 2.7F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, -2.0F, 0.0F, -0.2603F, 0.0F, 0.0F));

		 right_arm.addOrReplaceChild("right_arm54", CubeListBuilder.create().texOffs(110, 9).addBox(-5.0F, 7.0F, -2.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, -2.0F, 0.0F));

		 right_arm.addOrReplaceChild("right_arm55", CubeListBuilder.create().texOffs(110, 9).addBox(-8.0F, 7.0F, -2.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, -2.0F, 0.0F));

		 right_arm.addOrReplaceChild("right_arm56", CubeListBuilder.create().texOffs(92, 60).addBox(-7.0F, 7.0F, -2.4F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, -2.0F, 0.0F));

		 right_arm.addOrReplaceChild("right_arm57", CubeListBuilder.create().texOffs(30, 69).addBox(-8.31F, 7.0F, -2.1F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, -2.0F, 0.0F));

		 right_arm.addOrReplaceChild("right_arm58", CubeListBuilder.create().texOffs(179, 77).addBox(-8.3F, 7.0F, 1.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, -2.0F, 0.0F));

		 right_arm.addOrReplaceChild("right_arm59", CubeListBuilder.create().texOffs(121, 79).addBox(-8.0F, 7.0F, 1.3F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, -2.0F, 0.0F));

		 right_arm.addOrReplaceChild("right_arm60", CubeListBuilder.create().texOffs(110, 9).addBox(-4.7F, 7.0F, -2.1F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, -2.0F, 0.0F));

		 right_arm.addOrReplaceChild("right_arm61", CubeListBuilder.create().texOffs(110, 9).addBox(-4.7F, 7.0F, 1.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, -2.0F, 0.0F));

		 right_arm.addOrReplaceChild("right_arm62", CubeListBuilder.create().texOffs(288, 235).addBox(-7.5F, 6.0F, 2.1F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, -2.0F, 0.0F, -0.0744F, 0.0F, 0.0F));

		 right_arm.addOrReplaceChild("right_arm63", CubeListBuilder.create().texOffs(250, 130).addBox(-9.1F, 6.2F, -2.2F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, -2.0F, 0.0F, 0.0F, 0.0F, -0.1115F));

		 right_arm.addOrReplaceChild("right_arm64", CubeListBuilder.create().texOffs(355, 279).addBox(-8.9F, 6.2F, -1.1F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, -2.0F, 0.0F, 0.0F, 0.0F, -0.0524F));

		right_arm.addOrReplaceChild("right_arm5", CubeListBuilder.create().texOffs(354, 323).addBox(-9.0F, 5.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, -7.0F, 0.0F));

		 right_arm.addOrReplaceChild("right_arm65", CubeListBuilder.create().texOffs(324, 141).addBox(-6.5F, 9.0F, -2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, -2.0F, 0.0F));

		 right_arm.addOrReplaceChild("right_arm66", CubeListBuilder.create().texOffs(110, 9).addBox(-6.5F, 6.0F, 1.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, -2.0F, 0.0F));

		 right_arm.addOrReplaceChild("right_arm67", CubeListBuilder.create().texOffs(141, 378).addBox(-8.4F, 10.3F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, -2.0F, 0.0F));

		PartDefinition left_arm = root.addOrReplaceChild("left_arm", CubeListBuilder.create().texOffs(40, 16).mirror().addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(5.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F));

		left_arm.addOrReplaceChild("left_arm1", CubeListBuilder.create().texOffs(434, 285).mirror().addBox(4.0F, -24.0F, -2.1F, 4.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-5.0F, 22.0F, 0.0F));

		left_arm.addOrReplaceChild("left_arm2", CubeListBuilder.create().texOffs(432, 319).mirror().addBox(4.0F, -24.0F, 1.1F, 4.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-5.0F, 22.0F, 0.0F));

		left_arm.addOrReplaceChild("left_arm3", CubeListBuilder.create().texOffs(465, 289).mirror().addBox(7.1F, -24.0F, -2.0F, 1.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-5.0F, 22.0F, 0.0F));

		left_arm.addOrReplaceChild("left_arm4", CubeListBuilder.create().texOffs(444, 296).mirror().addBox(-1.1F, 0.0F, -2.0F, 1.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, -2.0F, 0.0F));

		left_arm.addOrReplaceChild("left_arm5", CubeListBuilder.create().texOffs(455, 326).mirror().addBox(-1.0F, -24.1F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 22.0F, 0.0F));

		left_arm.addOrReplaceChild("left_arm6", CubeListBuilder.create().texOffs(388, 331).mirror().addBox(4.0F, -12.9F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-5.0F, 22.0F, 0.0F));

		 left_arm.addOrReplaceChild("left_arm13", CubeListBuilder.create().texOffs(199, 430).mirror().addBox(-0.5F, 0.5172F, -2.7152F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1859F, 0.0F, 0.0F));

		 left_arm.addOrReplaceChild("left_arm18", CubeListBuilder.create().texOffs(372, 282).mirror().addBox(0.7583F, -43.3302F, -1.0013F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(8.0F, 44.0F, 0.0F, 0.0F, 0.0F, -0.1358F));

		 left_arm.addOrReplaceChild("left_arm20", CubeListBuilder.create().texOffs(250, 90).mirror().addBox(5.0F, 2.8F, 2.7F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.0F, -2.0F, 0.0F, -0.2603F, 0.0F, 0.0F));

		 left_arm.addOrReplaceChild("left_arm21", CubeListBuilder.create().texOffs(110, 9).mirror().addBox(4.0F, 7.0F, -2.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-5.0F, -2.0F, 0.0F));

		 left_arm.addOrReplaceChild("left_arm22", CubeListBuilder.create().texOffs(110, 9).mirror().addBox(7.0F, 7.0F, -2.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-5.0F, -2.0F, 0.0F));

		 left_arm.addOrReplaceChild("left_arm23", CubeListBuilder.create().texOffs(92, 60).mirror().addBox(5.0F, 7.0F, -2.4F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-5.0F, -2.0F, 0.0F));

		 left_arm.addOrReplaceChild("left_arm24", CubeListBuilder.create().texOffs(30, 69).mirror().addBox(7.31F, 7.0F, -2.1F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-5.0F, -2.0F, 0.0F));

		 left_arm.addOrReplaceChild("left_arm25", CubeListBuilder.create().texOffs(179, 77).mirror().addBox(7.3F, 7.0F, 1.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-5.0F, -2.0F, 0.0F));

		 left_arm.addOrReplaceChild("left_arm26", CubeListBuilder.create().texOffs(121, 79).mirror().addBox(4.0F, 7.0F, 1.3F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-5.0F, -2.0F, 0.0F));

		 left_arm.addOrReplaceChild("left_arm27", CubeListBuilder.create().texOffs(110, 9).mirror().addBox(3.7F, 7.0F, -2.1F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-5.0F, -2.0F, 0.0F));

		 left_arm.addOrReplaceChild("left_arm28", CubeListBuilder.create().texOffs(110, 9).mirror().addBox(3.7F, 7.0F, 1.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-5.0F, -2.0F, 0.0F));

		 left_arm.addOrReplaceChild("left_arm29", CubeListBuilder.create().texOffs(288, 235).mirror().addBox(4.5F, 6.0F, 2.1F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.0F, -2.0F, 0.0F, -0.0744F, 0.0F, 0.0F));

		 left_arm.addOrReplaceChild("left_arm30", CubeListBuilder.create().texOffs(250, 130).mirror().addBox(8.1F, 6.2F, -2.2F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.1115F));

		 left_arm.addOrReplaceChild("left_arm31", CubeListBuilder.create().texOffs(355, 279).mirror().addBox(7.9F, 6.2F, -1.1F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0524F));

		left_arm.addOrReplaceChild("left_arm7", CubeListBuilder.create().texOffs(356, 330).mirror().addBox(8.0F, 0.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-5.0F, -2.0F, 0.0F));

		 left_arm.addOrReplaceChild("left_arm33", CubeListBuilder.create().texOffs(324, 141).mirror().addBox(5.5F, 9.0F, -2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-5.0F, -2.0F, 0.0F));

		 left_arm.addOrReplaceChild("left_arm34", CubeListBuilder.create().texOffs(110, 9).mirror().addBox(5.5F, 6.0F, 1.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-5.0F, -2.0F, 0.0F));

		 left_arm.addOrReplaceChild("left_arm35", CubeListBuilder.create().texOffs(141, 378).mirror().addBox(6.4F, 10.3F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-5.0F, -2.0F, 0.0F));

		 left_arm.addOrReplaceChild("left_arm40", CubeListBuilder.create().texOffs(109, 8).mirror().addBox(-1.2211F, -24.3008F, -2.4142F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(3.0F, 22.0F, 0.0F));

		left_arm.addOrReplaceChild("left_arm8", CubeListBuilder.create().texOffs(107, 6).mirror().addBox(-1.2313F, -24.4361F, -1.6321F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(3.0F, 22.0F, 0.0F));

		 left_arm.addOrReplaceChild("left_arm47", CubeListBuilder.create().texOffs(95, 174).mirror().addBox(1.7716F, -0.9939F, -2.3142F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.7854F, 0.0436F, -0.1358F));

		left_arm.addOrReplaceChild("left_arm9", CubeListBuilder.create().texOffs(95, 174).mirror().addBox(1.7676F, -0.9304F, -0.7493F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.7854F, -0.0436F, -0.1358F));

		 left_arm.addOrReplaceChild("left_arm48", CubeListBuilder.create().texOffs(77, 225).mirror().addBox(2.2428F, -4.2412F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2133F));

		 left_arm.addOrReplaceChild("left_arm51", CubeListBuilder.create().texOffs(88, 61).mirror().addBox(2.6435F, -0.935F, -2.3492F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.0F, 0.0F, -0.7854F, 0.0F, 0.2231F));

		 left_arm.addOrReplaceChild("left_arm10", CubeListBuilder.create().texOffs(88, 61).mirror().addBox(-3.2078F, 0.0105F, 0.4037F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(6.0F, -2.0F, 0.0F, 0.7854F, 0.0F, 0.2231F));

		PartDefinition right_leg = root.addOrReplaceChild("right_leg", CubeListBuilder.create().texOffs(0, 16).mirror().addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-2.0F, 12.0F, 0.0F));

		right_leg.addOrReplaceChild("right_leg1", CubeListBuilder.create().texOffs(110, 9).mirror().addBox(-4.2F, 13.0F, -2.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		right_leg.addOrReplaceChild("right_leg2", CubeListBuilder.create().texOffs(110, 9).mirror().addBox(-4.0F, 13.0F, 1.2F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		right_leg.addOrReplaceChild("right_leg3", CubeListBuilder.create().texOffs(250, 390).mirror().addBox(-14.3438F, 1.0166F, -2.3F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.0F, -12.0F, 0.0F, 0.0F, 0.0F, -1.2641F));

		right_leg.addOrReplaceChild("right_leg4", CubeListBuilder.create().texOffs(250, 410).mirror().addBox(-14.3438F, 1.0166F, 1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.0F, -12.0F, 0.0F, 0.0F, 0.0F, -1.2641F));

		right_leg.addOrReplaceChild("right_leg5", CubeListBuilder.create().texOffs(110, 9).mirror().addBox(-3.1F, 13.5F, 1.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		right_leg.addOrReplaceChild("right_leg6", CubeListBuilder.create().texOffs(45, 104).mirror().addBox(-3.1F, 13.5F, -2.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		right_leg.addOrReplaceChild("right_leg7", CubeListBuilder.create().texOffs(144, 179).mirror().addBox(-4.1F, 13.0F, -2.2F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		right_leg.addOrReplaceChild("right_leg8", CubeListBuilder.create().texOffs(166, 120).mirror().addBox(-3.1F, 15.0F, -2.2F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		right_leg.addOrReplaceChild("right_leg9", CubeListBuilder.create().texOffs(110, 9).mirror().addBox(-0.8F, 15.2F, -2.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		 right_leg.addOrReplaceChild("right_leg10", CubeListBuilder.create().texOffs(110, 9).mirror().addBox(-0.8F, 15.8F, -2.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		 right_leg.addOrReplaceChild("right_leg11", CubeListBuilder.create().texOffs(256, 333).mirror().addBox(-3.0F, 20.0F, -2.3F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		 right_leg.addOrReplaceChild("right_leg12", CubeListBuilder.create().texOffs(254, 277).mirror().addBox(-4.0F, 20.0F, -2.21F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		 right_leg.addOrReplaceChild("right_leg13", CubeListBuilder.create().texOffs(252, 177).mirror().addBox(-4.0F, 19.0F, 1.2F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		 right_leg.addOrReplaceChild("right_leg14", CubeListBuilder.create().texOffs(110, 9).mirror().addBox(-4.2F, 19.0F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		 right_leg.addOrReplaceChild("right_leg15", CubeListBuilder.create().texOffs(252, 432).mirror().addBox(-6.6559F, 12.1712F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.0F, -12.0F, 0.0F, 0.0F, 0.0F, -0.1487F));

		 right_leg.addOrReplaceChild("right_leg35", CubeListBuilder.create().texOffs(253, 433).mirror().addBox(-6.6559F, 10.0406F, 6.9516F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.0F, -12.0F, 0.0F, -0.5236F, 0.0F, -0.1487F));

		 right_leg.addOrReplaceChild("right_leg36", CubeListBuilder.create().texOffs(253, 433).mirror().addBox(-6.6559F, 10.0406F, -7.9516F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.0F, -12.0F, 0.0F, 0.5236F, 0.0F, -0.1487F));

		 right_leg.addOrReplaceChild("right_leg37", CubeListBuilder.create().texOffs(253, 433).mirror().addBox(-6.6559F, 12.6712F, 0.866F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.0F, -12.0F, 0.0F, 0.0F, 0.0F, -0.1487F));

		 right_leg.addOrReplaceChild("right_leg38", CubeListBuilder.create().texOffs(253, 433).mirror().addBox(-6.6559F, 12.6712F, -1.866F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.0F, -12.0F, 0.0F, 0.0F, 0.0F, -0.1487F));

		 right_leg.addOrReplaceChild("right_leg16", CubeListBuilder.create().texOffs(110, 9).mirror().addBox(-5.1F, 14.5F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.0F, -12.0F, 0.0F, 0.0F, 0.0F, -0.0436F));

		 right_leg.addOrReplaceChild("right_leg17", CubeListBuilder.create().texOffs(250, 450).mirror().addBox(-7.3559F, 17.3712F, -1.5F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.0F, -12.0F, 0.0F, 0.0F, 0.0F, -0.1487F));

		 right_leg.addOrReplaceChild("right_leg18", CubeListBuilder.create().texOffs(110, 9).mirror().addBox(-4.4F, 19.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		 right_leg.addOrReplaceChild("right_leg19", CubeListBuilder.create().texOffs(112, 10).mirror().addBox(-3.0F, 19.0F, 1.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		 right_leg.addOrReplaceChild("right_leg20", CubeListBuilder.create().texOffs(250, 470).mirror().addBox(-3.0F, 18.5254F, -4.6357F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.0F, -12.0F, 0.0F, 0.1115F, 0.0F, 0.0F));

		 right_leg.addOrReplaceChild("right_leg34", CubeListBuilder.create().texOffs(449, 368).mirror().addBox(-2.5F, 17.7F, -4.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.0F, -12.0F, 0.0F, 0.1115F, 0.0F, 0.0F));

		 right_leg.addOrReplaceChild("right_leg21", CubeListBuilder.create().texOffs(110, 9).mirror().addBox(-4.2F, 18.3F, -2.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		 right_leg.addOrReplaceChild("right_leg22", CubeListBuilder.create().texOffs(110, 9).mirror().addBox(-0.8F, 18.3F, -2.2F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		 right_leg.addOrReplaceChild("right_leg23", CubeListBuilder.create().texOffs(102, 143).mirror().addBox(-4.0F, 15.0F, 1.21F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		 right_leg.addOrReplaceChild("right_leg24", CubeListBuilder.create().texOffs(110, 9).mirror().addBox(-0.9F, 15.8F, 1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(110, 9).addBox(-0.1F, 15.8F, 1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, -12.0F, 0.0F));

		 right_leg.addOrReplaceChild("right_leg25", CubeListBuilder.create().texOffs(113, 243).mirror().addBox(-3.5F, 22.0F, -2.7F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		 right_leg.addOrReplaceChild("right_leg26", CubeListBuilder.create().texOffs(108, 9).mirror().addBox(-2.8F, 18.3F, 1.2F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		 right_leg.addOrReplaceChild("right_leg27", CubeListBuilder.create().texOffs(110, 9).mirror().addBox(-4.2F, 18.3F, 1.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		 right_leg.addOrReplaceChild("right_leg28", CubeListBuilder.create().texOffs(110, 9).mirror().addBox(-0.8F, 19.0F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		 right_leg.addOrReplaceChild("right_leg29", CubeListBuilder.create().texOffs(110, 9).mirror().addBox(-0.8F, 23.0F, -2.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(110, 9).addBox(-0.2F, 23.0F, -2.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, -12.0F, 0.0F));

		 right_leg.addOrReplaceChild("right_leg30", CubeListBuilder.create().texOffs(110, 9).mirror().addBox(-4.2F, 23.0F, -2.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		 right_leg.addOrReplaceChild("right_leg31", CubeListBuilder.create().texOffs(110, 9).mirror().addBox(-4.3F, 22.0F, 0.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		 right_leg.addOrReplaceChild("right_leg32", CubeListBuilder.create().texOffs(110, 9).mirror().addBox(-0.7F, 22.0F, 0.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		 right_leg.addOrReplaceChild("right_leg33", CubeListBuilder.create().texOffs(110, 9).mirror().addBox(-3.5F, 23.0F, 1.3F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		PartDefinition left_leg = root.addOrReplaceChild("left_leg", CubeListBuilder.create().texOffs(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, 12.0F, 0.0F));

		left_leg.addOrReplaceChild("left_leg1", CubeListBuilder.create().texOffs(110, 9).addBox(-0.2F, 18.3F, -2.2F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

		left_leg.addOrReplaceChild("left_leg2", CubeListBuilder.create().texOffs(108, 9).addBox(-0.2F, 18.3F, 1.2F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

		left_leg.addOrReplaceChild("left_leg3", CubeListBuilder.create().texOffs(110, 9).addBox(-0.2F, 15.2F, -2.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

		left_leg.addOrReplaceChild("left_leg4", CubeListBuilder.create().texOffs(110, 9).mirror().addBox(-0.2F, 15.2F, 1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-2.0F, -12.0F, 0.0F));

		left_leg.addOrReplaceChild("left_leg5", CubeListBuilder.create().texOffs(110, 9).mirror().addBox(-0.2F, 15.8F, 1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-2.0F, -12.0F, 0.0F));

		left_leg.addOrReplaceChild("left_leg6", CubeListBuilder.create().texOffs(110, 9).addBox(-0.2F, 15.8F, -2.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

		left_leg.addOrReplaceChild("left_leg7", CubeListBuilder.create().texOffs(110, 9).addBox(-0.3F, 22.0F, 0.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

		left_leg.addOrReplaceChild("left_leg8", CubeListBuilder.create().texOffs(110, 9).mirror().addBox(-0.2F, 23.0F, -2.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-2.0F, -12.0F, 0.0F));

		left_leg.addOrReplaceChild("left_leg9", CubeListBuilder.create().texOffs(110, 9).addBox(-0.2F, 19.0F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

		 left_leg.addOrReplaceChild("left_leg10", CubeListBuilder.create().texOffs(166, 120).addBox(0.1F, 15.0F, -2.2F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

		 left_leg.addOrReplaceChild("left_leg11", CubeListBuilder.create().texOffs(110, 9).addBox(2.1F, 13.5F, -2.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

		 left_leg.addOrReplaceChild("left_leg12", CubeListBuilder.create().texOffs(250, 390).addBox(13.3438F, 1.0166F, -2.3F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -12.0F, 0.0F, 0.0F, 0.0F, 1.2641F));

		 left_leg.addOrReplaceChild("left_leg13", CubeListBuilder.create().texOffs(144, 179).addBox(3.1F, 13.0F, -2.2F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

		 left_leg.addOrReplaceChild("left_leg14", CubeListBuilder.create().texOffs(110, 9).addBox(3.2F, 13.0F, -2.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

		 left_leg.addOrReplaceChild("left_leg16", CubeListBuilder.create().texOffs(252, 432).addBox(5.6559F, 12.1712F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -12.0F, 0.0F, 0.0F, 0.0F, 0.1487F));

		 left_leg.addOrReplaceChild("left_leg36", CubeListBuilder.create().texOffs(253, 433).addBox(5.6559F, 10.0406F, 6.9516F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -12.0F, 0.0F, -0.5236F, 0.0F, 0.1487F));

		 left_leg.addOrReplaceChild("left_leg37", CubeListBuilder.create().texOffs(253, 433).addBox(5.6559F, 10.0406F, -7.9516F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -12.0F, 0.0F, 0.5236F, 0.0F, 0.1487F));

		 left_leg.addOrReplaceChild("left_leg38", CubeListBuilder.create().texOffs(253, 433).addBox(5.6559F, 12.6712F, -1.866F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -12.0F, 0.0F, 0.0F, 0.0F, 0.1487F));

		 left_leg.addOrReplaceChild("left_leg39", CubeListBuilder.create().texOffs(253, 433).addBox(5.6559F, 12.6712F, 0.866F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -12.0F, 0.0F, 0.0F, 0.0F, 0.1487F));

		 left_leg.addOrReplaceChild("left_leg17", CubeListBuilder.create().texOffs(102, 143).addBox(0.0F, 15.0F, 1.21F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

		 left_leg.addOrReplaceChild("left_leg18", CubeListBuilder.create().texOffs(110, 9).addBox(3.0F, 13.0F, 1.2F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

		 left_leg.addOrReplaceChild("left_leg19", CubeListBuilder.create().texOffs(110, 9).addBox(2.1F, 13.5F, 1.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

		 left_leg.addOrReplaceChild("left_leg20", CubeListBuilder.create().texOffs(250, 410).addBox(13.3438F, 1.0166F, 1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -12.0F, 0.0F, 0.0F, 0.0F, 1.2641F));

		 left_leg.addOrReplaceChild("left_leg21", CubeListBuilder.create().texOffs(254, 277).addBox(0.0F, 20.0F, -2.21F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

		 left_leg.addOrReplaceChild("left_leg22", CubeListBuilder.create().texOffs(256, 333).addBox(1.0F, 20.0F, -2.3F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

		 left_leg.addOrReplaceChild("left_leg23", CubeListBuilder.create().texOffs(250, 470).addBox(1.0F, 18.5254F, -4.6357F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -12.0F, 0.0F, 0.1115F, 0.0F, 0.0F));

		 left_leg.addOrReplaceChild("left_leg35", CubeListBuilder.create().texOffs(449, 368).addBox(1.5F, 17.7F, -4.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -12.0F, 0.0F, 0.1115F, 0.0F, 0.0F));

		 left_leg.addOrReplaceChild("left_leg24", CubeListBuilder.create().texOffs(110, 9).addBox(3.2F, 23.0F, -2.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

		 left_leg.addOrReplaceChild("left_leg25", CubeListBuilder.create().texOffs(113, 243).addBox(0.5F, 22.0F, -2.7F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

		 left_leg.addOrReplaceChild("left_leg26", CubeListBuilder.create().texOffs(110, 9).addBox(0.5F, 23.0F, 1.3F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

		 left_leg.addOrReplaceChild("left_leg27", CubeListBuilder.create().texOffs(110, 9).addBox(3.3F, 22.0F, 0.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

		 left_leg.addOrReplaceChild("left_leg28", CubeListBuilder.create().texOffs(110, 9).addBox(3.2F, 18.3F, -2.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

		 left_leg.addOrReplaceChild("left_leg29", CubeListBuilder.create().texOffs(110, 9).addBox(2.2F, 18.3F, 1.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

		 left_leg.addOrReplaceChild("left_leg30", CubeListBuilder.create().texOffs(110, 9).addBox(3.2F, 19.0F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

		 left_leg.addOrReplaceChild("left_leg31", CubeListBuilder.create().texOffs(110, 9).addBox(3.4F, 19.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

		 left_leg.addOrReplaceChild("left_leg32", CubeListBuilder.create().texOffs(250, 450).addBox(6.3559F, 17.3712F, -1.5F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -12.0F, 0.0F, 0.0F, 0.0F, 0.1487F));

		 left_leg.addOrReplaceChild("left_leg33", CubeListBuilder.create().texOffs(112, 10).addBox(1.0F, 19.0F, 1.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

		 left_leg.addOrReplaceChild("left_leg34", CubeListBuilder.create().texOffs(245, 192).addBox(0.0F, 19.0F, 1.2F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

		 left_leg.addOrReplaceChild("left_leg43", CubeListBuilder.create().texOffs(112, 8).addBox(4.1F, 12.5F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -10.0F, 0.0F, 0.0F, 0.0F, 0.0436F));

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