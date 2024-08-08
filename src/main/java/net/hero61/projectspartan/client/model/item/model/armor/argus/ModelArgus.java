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

public class ModelArgus<T extends LivingEntity> extends HumanoidModel<T> {
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation(ProjectSpartan.MOD_ID, "argus_body"), "main");

	public ModelArgus(ModelPart modelPart) {
		super (modelPart);
	}

	public static LayerDefinition createLayer() {
		MeshDefinition definition = ModelUtils.createBlankHumanoidMesh();
		PartDefinition root = definition.getRoot();

		PartDefinition body = root.addOrReplaceChild("body", CubeListBuilder.create().texOffs(16, 16).mirror().addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		body.addOrReplaceChild("chest1", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-3.5F, 0.0F, -3.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(100, 0).addBox(1.5F, 0.0F, -3.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		body.addOrReplaceChild("chest2", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(1.5F, 0.0F, -3.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(100, 0).addBox(-3.5F, 0.0F, -3.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		body.addOrReplaceChild("chest3", CubeListBuilder.create().texOffs(80, 210).mirror().addBox(-2.5F, 2.9707F, -4.8956F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2974F, 0.0F, 0.0F));

		body.addOrReplaceChild("chest4", CubeListBuilder.create().texOffs(80, 230).mirror().addBox(-3.5F, 2.5F, -3.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0744F, 0.0F, 0.0F));

		body.addOrReplaceChild("chest5", CubeListBuilder.create().texOffs(80, 230).addBox(2.5F, 2.4926F, -3.2003F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0744F, 0.0F, 0.0F));

		body.addOrReplaceChild("chest6", CubeListBuilder.create().texOffs(80, 270).mirror().addBox(-1.5F, 1.8F, -2.8F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1487F, 0.0F, 0.0F));

		body.addOrReplaceChild("chest7", CubeListBuilder.create().texOffs(266, 147).mirror().addBox(-1.5F, 2.8F, -3.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1487F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest33", CubeListBuilder.create().texOffs(266, 147).mirror().addBox(-1.5F, 2.4409F, -3.0327F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.9F, -2.9F, 0.4971F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest34", CubeListBuilder.create().texOffs(266, 147).mirror().addBox(-2.1209F, 2.4409F, -2.6362F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.0F, -1.9F, -2.9F, 0.5072F, -0.1914F, -0.1053F));

		 body.addOrReplaceChild("chest40", CubeListBuilder.create().texOffs(266, 147).mirror().addBox(-3.4763F, 1.5956F, 0.694F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(5.0F, -1.9F, -2.9F, 1.1989F, -0.7564F, -1.16F));

		 body.addOrReplaceChild("chest15", CubeListBuilder.create().texOffs(447, 75).mirror().addBox(-1.0F, 1.5F, -2.8F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2F, 2.8F, -1.2F, -0.0265F, -0.7854F, 0.0262F));

		 body.addOrReplaceChild("chest32", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.4F, 3.8F, -2.8F, 0.8898F, -0.5411F, -0.6109F));

		body.addOrReplaceChild("chest8", CubeListBuilder.create().texOffs(80, 210).addBox(1.5F, 2.9414F, -4.9912F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2974F, 0.0F, 0.0F));

		body.addOrReplaceChild("chest9", CubeListBuilder.create().texOffs(80, 330).mirror().addBox(-1.5F, 2.9707F, -4.8956F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2974F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest10", CubeListBuilder.create().texOffs(80, 350).mirror().addBox(-2.0F, 3.0F, -5.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2974F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest11", CubeListBuilder.create().texOffs(80, 350).addBox(1.0F, 3.0293F, -5.0044F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2974F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest12", CubeListBuilder.create().texOffs(81, 390).mirror().addBox(0.5F, 2.9414F, -4.9912F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2974F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest13", CubeListBuilder.create().texOffs(80, 410).mirror().addBox(-1.5F, 4.0F, -4.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2974F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest14", CubeListBuilder.create().texOffs(80, 410).addBox(0.5F, 4.0F, -4.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2974F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest16", CubeListBuilder.create().texOffs(80, 470).mirror().addBox(-1.5F, 3.5F, -3.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0744F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest31", CubeListBuilder.create().texOffs(80, 470).mirror().addBox(-1.5F, 3.5F, -3.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.0F, 0.0F, 0.0F, -0.0744F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest17", CubeListBuilder.create().texOffs(81, 491).mirror().addBox(1.5F, 2.4926F, -3.2003F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0744F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest18", CubeListBuilder.create().texOffs(80, 490).addBox(-2.5F, 2.5F, -3.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0744F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest19", CubeListBuilder.create().texOffs(150, 70).mirror().addBox(1.5F, 1.0F, -3.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2231F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest20", CubeListBuilder.create().texOffs(150, 70).addBox(-3.5F, 1.0F, -3.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2231F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest21", CubeListBuilder.create().texOffs(150, 110).mirror().addBox(1.5F, 2.5F, -3.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0744F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest22", CubeListBuilder.create().texOffs(150, 110).addBox(-2.5F, 2.5F, -3.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0744F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest23", CubeListBuilder.create().texOffs(150, 150).mirror().addBox(-1.5F, 3.0F, -3.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0744F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest24", CubeListBuilder.create().texOffs(150, 170).mirror().addBox(-4.0F, 0.0F, -3.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2231F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest25", CubeListBuilder.create().texOffs(150, 170).addBox(3.0F, 0.0F, -3.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2231F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest26", CubeListBuilder.create().texOffs(400, 0).mirror().addBox(-0.5F, 1.7F, -2.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1487F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest27", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2974F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest28", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2974F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest29", CubeListBuilder.create().texOffs(150, 230).mirror().addBox(-4.5F, 4.3527F, -4.1483F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2974F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest30", CubeListBuilder.create().texOffs(150, 230).addBox(2.5F, 4.3527F, -4.1483F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2974F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest35", CubeListBuilder.create().texOffs(150, 270).mirror().addBox(-3.0F, 3.0F, -4.8F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2974F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest36", CubeListBuilder.create().texOffs(150, 290).mirror().addBox(-3.5F, 3.9263F, -4.6242F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2974F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest37", CubeListBuilder.create().texOffs(150, 270).addBox(2.0F, 3.0F, -4.8F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2974F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest38", CubeListBuilder.create().texOffs(150, 290).addBox(2.5F, 3.9263F, -4.6242F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2974F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest39", CubeListBuilder.create().texOffs(383, 345).mirror().addBox(-2.3F, 10.4F, -2.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.1487F));

		 body.addOrReplaceChild("chest41", CubeListBuilder.create().texOffs(374, 335).mirror().addBox(1.6F, 10.6F, -2.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.4833F));

		 body.addOrReplaceChild("chest42", CubeListBuilder.create().texOffs(377, 336).addBox(-5.6F, 10.6F, -2.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.4833F));

		 body.addOrReplaceChild("chest43", CubeListBuilder.create().texOffs(357, 328).mirror().addBox(-2.4F, 10.6F, -2.5F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(384, 64).addBox(-2.6F, 10.6F, -2.5F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest44", CubeListBuilder.create().texOffs(151, 410).mirror().addBox(-1.4F, 9.0F, -0.2F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2603F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest45", CubeListBuilder.create().texOffs(372, 331).addBox(-0.7F, 10.4F, -2.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1487F));

		 body.addOrReplaceChild("chest46", CubeListBuilder.create().texOffs(382, 326).mirror().addBox(-1.0F, 10.6F, -4.3F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1487F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest47", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest48", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest49", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-5.0F, 9.5F, -1.0F, 10.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest50", CubeListBuilder.create().texOffs(300, 0).mirror().addBox(-3.0F, 0.0F, -2.4F, 6.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest51", CubeListBuilder.create().texOffs(152, 472).mirror().addBox(2.5F, -0.8485F, 1.3841F, 2.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest89", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest88", CubeListBuilder.create().texOffs(154, 474).mirror().addBox(3.4F, -1.8485F, 2.0841F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(1.0F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest91", CubeListBuilder.create().texOffs(152, 472).mirror().addBox(3.5F, -0.8485F, 1.7841F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(1.0F, -2.0F, 0.0F));

		 body.addOrReplaceChild("chest93", CubeListBuilder.create().texOffs(155, 474).mirror().addBox(4.5F, 0.1515F, 3.7841F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-1.0F, -2.0F, -0.3F));

		 body.addOrReplaceChild("chest92", CubeListBuilder.create().texOffs(455, 201).mirror().addBox(3.2F, -0.6485F, 1.7841F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(1.7F, -1.7F, -0.2F));

		 body.addOrReplaceChild("chest90", CubeListBuilder.create().texOffs(154, 474).mirror().addBox(3.5F, -0.8485F, 2.0841F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-9.6F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest54", CubeListBuilder.create().texOffs(153, 473).mirror().addBox(2.5F, -0.8485F, 2.3841F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 4.0F, -0.5F));

		 body.addOrReplaceChild("chest87", CubeListBuilder.create().texOffs(154, 473).mirror().addBox(3.5F, -0.8485F, 2.6841F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-8.0F, 4.0F, -0.5F));

		 body.addOrReplaceChild("chest52", CubeListBuilder.create().texOffs(153, 472).addBox(-4.5F, -0.8485F, 1.3841F, 2.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest53", CubeListBuilder.create().texOffs(154, 474).addBox(-4.5F, -0.8485F, 3.0841F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.0F, 0.0F, -0.5F));

		 body.addOrReplaceChild("chest55", CubeListBuilder.create().texOffs(200, 90).mirror().addBox(3.5F, -0.3F, -2.3F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1115F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest56", CubeListBuilder.create().texOffs(301, 211).mirror().addBox(4.5F, -0.3F, -1.3F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1115F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest57", CubeListBuilder.create().texOffs(300, 210).addBox(-5.5F, -0.3F, -1.3F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1115F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest58", CubeListBuilder.create().texOffs(198, 88).addBox(-4.5F, -0.4F, -4.3F, 2.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1115F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest59", CubeListBuilder.create().texOffs(200, 150).mirror().addBox(2.5F, 1.5F, 0.7F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.7854F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest77", CubeListBuilder.create().texOffs(201, 151).mirror().addBox(2.5F, 1.4444F, 0.677F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, -3.0F, 0.0F));

		 body.addOrReplaceChild("chest83", CubeListBuilder.create().texOffs(201, 151).mirror().addBox(2.5F, 1.5222F, -2.4767F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -3.0F, 0.0F, 0.7418F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest85", CubeListBuilder.create().texOffs(201, 151).mirror().addBox(2.5F, 1.5222F, -2.4767F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -3.0F, 0.0F, 0.7418F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest86", CubeListBuilder.create().texOffs(201, 151).mirror().addBox(2.5F, 1.5222F, -2.4767F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-8.0F, -3.0F, 0.0F, 0.7418F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest60", CubeListBuilder.create().texOffs(201, 150).addBox(-4.5F, 1.5F, 0.7F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.7854F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest61", CubeListBuilder.create().texOffs(198, 190).mirror().addBox(-1.0F, 0.0F, 0.5F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1859F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest62", CubeListBuilder.create().texOffs(200, 190).addBox(-2.0F, 0.0F, 0.5F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1859F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest63", CubeListBuilder.create().texOffs(200, 230).mirror().addBox(2.0F, 1.0F, 0.5F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1859F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest64", CubeListBuilder.create().texOffs(200, 230).addBox(-3.0F, 1.0F, 0.5F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1859F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest65", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1859F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest66", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1487F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest67", CubeListBuilder.create().texOffs(197, 290).addBox(-2.0F, 2.5555F, 1.6967F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1487F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest68", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1487F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest69", CubeListBuilder.create().texOffs(99, -2).mirror().addBox(-4.5F, 6.1F, -1.5F, 3.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.1F, -2.6F, 0.3665F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest70", CubeListBuilder.create().texOffs(99, -2).addBox(1.5F, 6.1F, -1.5F, 3.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1F, -2.6F, 0.3665F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest71", CubeListBuilder.create().texOffs(311, 133).mirror().addBox(0.0F, 2.0F, -2.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 3.0F, 4.1F, -0.2853F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest73", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.409F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest74", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.409F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest75", CubeListBuilder.create().texOffs(400, 0).mirror().addBox(-4.0F, 1.5F, 3.8F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.2F, -0.1457F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest76", CubeListBuilder.create().texOffs(400, 0).addBox(3.1F, 1.5F, 3.6F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.3F, -0.1457F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest72", CubeListBuilder.create().texOffs(400, 0).mirror().addBox(-1.0F, 3.0F, 1.1F, 2.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1487F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest78", CubeListBuilder.create().texOffs(200, 350).mirror().addBox(-2.0F, 8.7688F, 2.4623F, 4.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1859F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest79", CubeListBuilder.create().texOffs(200, 370).mirror().addBox(-2.5F, 8.7688F, 3.4623F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1859F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest80", CubeListBuilder.create().texOffs(300, 0).mirror().addBox(-3.0F, 0.0F, 1.4F, 6.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest81", CubeListBuilder.create().texOffs(452, 63).mirror().addBox(-2.0F, 3.6F, 2.1F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.409F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest82", CubeListBuilder.create().texOffs(200, 410).mirror().addBox(-3.5F, 0.9F, -2.3F, 7.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1859F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest84", CubeListBuilder.create().texOffs(200, 150).addBox(-5.5F, 1.4444F, 0.677F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -3.0F, 0.0F));

		 body.addOrReplaceChild("chest94", CubeListBuilder.create().texOffs(199, 150).addBox(-6.0F, 0.8444F, 1.477F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9F, -4.1F, 1.8F, -0.6109F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest95", CubeListBuilder.create().texOffs(463, 194).addBox(-4.7F, 1.8444F, 1.577F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.7F, -4.6F, 1.8F, -0.6109F, 0.0F, 0.0F));

		PartDefinition right_arm = root.addOrReplaceChild("right_arm", CubeListBuilder.create().texOffs(40, 16).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F));

		 right_arm.addOrReplaceChild("rightarm31", CubeListBuilder.create().texOffs(318, 317).addBox(-8.0F, -24.0F, -2.1F, 4.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, 22.0F, 0.0F));

		 right_arm.addOrReplaceChild("rightarm35", CubeListBuilder.create().texOffs(318, 317).addBox(-8.0F, -24.0F, 1.1F, 4.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, 22.0F, 0.0F));

		 right_arm.addOrReplaceChild("rightarm36", CubeListBuilder.create().texOffs(426, 330).addBox(-8.1F, -24.0F, -2.0F, 1.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, 22.0F, 0.0F));

		 right_arm.addOrReplaceChild("rightarm37", CubeListBuilder.create().texOffs(366, 362).addBox(0.1F, 0.0F, -2.0F, 1.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -2.0F, 0.0F));

		 right_arm.addOrReplaceChild("rightarm38", CubeListBuilder.create().texOffs(435, 316).addBox(-3.0F, -24.1F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 22.0F, 0.0F));

		 right_arm.addOrReplaceChild("rightarm39", CubeListBuilder.create().texOffs(400, 0).addBox(-8.0F, -12.9F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, 22.0F, 0.0F));

		 right_arm.addOrReplaceChild("rightarm40", CubeListBuilder.create().texOffs(100, 0).addBox(-8.0F, -21.0F, -2.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, 22.0F, 0.0F));

		 right_arm.addOrReplaceChild("rightarm41", CubeListBuilder.create().texOffs(100, 0).addBox(-3.0F, -21.0F, 1.3F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 22.0F, 0.0F));

		 right_arm.addOrReplaceChild("rightarm42", CubeListBuilder.create().texOffs(100, 0).addBox(-3.3F, 1.0F, -2.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		 right_arm.addOrReplaceChild("rightarm43", CubeListBuilder.create().texOffs(100, 0).addBox(-3.3F, 1.0F, 1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		 right_arm.addOrReplaceChild("rightarm44", CubeListBuilder.create().texOffs(100, 0).addBox(0.3F, 1.0F, -2.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		 right_arm.addOrReplaceChild("rightarm45", CubeListBuilder.create().texOffs(300, 0).addBox(0.3F, 1.0F, 1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		 right_arm.addOrReplaceChild("rightarm46", CubeListBuilder.create().texOffs(200, 430).addBox(-2.0F, 0.5966F, -2.937F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1859F, 0.0F, 0.0F));

		 right_arm.addOrReplaceChild("rightarm47", CubeListBuilder.create().texOffs(300, 230).addBox(-3.9F, -0.8F, -1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2603F));

		 right_arm.addOrReplaceChild("rightarm48", CubeListBuilder.create().texOffs(200, 450).addBox(-3.8251F, -0.8959F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3F, 0.7F, 0.0F, 0.0F, 0.0F, 0.4325F));

		 right_arm.addOrReplaceChild("rightarm49", CubeListBuilder.create().texOffs(199, 469).addBox(-9.2463F, -0.154F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, -2.0F, 0.0F, 0.0F, 0.0F, -0.2603F));

		 right_arm.addOrReplaceChild("rightarm50", CubeListBuilder.create().texOffs(200, 490).addBox(-8.9F, -0.154F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, -2.0F, 0.0F, 0.0F, 0.0F, -0.2603F));

		 right_arm.addOrReplaceChild("rightarm51", CubeListBuilder.create().texOffs(250, 50).addBox(-3.5F, 1.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.2231F));

		 right_arm.addOrReplaceChild("rightarm52", CubeListBuilder.create(), PartPose.offsetAndRotation(5.0F, 22.0F, 0.0F, 0.0F, 0.0F, 0.2231F));

		 right_arm.addOrReplaceChild("rightarm53", CubeListBuilder.create().texOffs(250, 90).addBox(-7.6F, 1.8F, 2.4F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, -2.0F, 0.0F, -0.2603F, 0.0F, 0.0F));

		 right_arm.addOrReplaceChild("rightarm54", CubeListBuilder.create().texOffs(100, 0).addBox(-5.0F, 7.0F, -2.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, -2.0F, 0.0F));

		 right_arm.addOrReplaceChild("rightarm55", CubeListBuilder.create().texOffs(100, 0).addBox(-8.0F, 7.0F, -2.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, -2.0F, 0.0F));

		 right_arm.addOrReplaceChild("rightarm56", CubeListBuilder.create().texOffs(100, 0).addBox(-7.0F, 8.0F, -2.4F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, -2.0F, 0.0F));

		 right_arm.addOrReplaceChild("rightarm57", CubeListBuilder.create().texOffs(100, 0).addBox(-8.3F, 7.0F, -2.1F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, -2.0F, 0.0F));

		 right_arm.addOrReplaceChild("rightarm58", CubeListBuilder.create().texOffs(100, 0).addBox(-8.3F, 7.0F, 1.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, -2.0F, 0.0F));

		 right_arm.addOrReplaceChild("rightarm59", CubeListBuilder.create().texOffs(100, 0).addBox(-8.0F, 7.0F, 1.3F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, -2.0F, 0.0F));

		 right_arm.addOrReplaceChild("rightarm60", CubeListBuilder.create().texOffs(100, 0).addBox(-4.7F, 7.0F, -2.1F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, -2.0F, 0.0F));

		 right_arm.addOrReplaceChild("rightarm61", CubeListBuilder.create().texOffs(100, 0).addBox(-4.7F, 7.0F, 1.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, -2.0F, 0.0F));

		 right_arm.addOrReplaceChild("rightarm62", CubeListBuilder.create().texOffs(250, 110).addBox(-7.5F, 5.9777F, 2.3992F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, -2.0F, 0.0F, -0.0744F, 0.0F, 0.0F));

		 right_arm.addOrReplaceChild("rightarm63", CubeListBuilder.create().texOffs(250, 130).addBox(-9.1F, 6.2F, -2.2F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, -2.0F, 0.0F, 0.0F, 0.0F, -0.1115F));

		 right_arm.addOrReplaceChild("rightarm64", CubeListBuilder.create().texOffs(250, 150).addBox(-9.4F, 5.6F, -1.1F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, -2.0F, 0.0F, 0.0F, 0.0F, -0.1115F));

		 right_arm.addOrReplaceChild("rightarm65", CubeListBuilder.create().texOffs(100, 0).addBox(-6.5F, 9.0F, -2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, -2.0F, 0.0F));

		 right_arm.addOrReplaceChild("rightarm66", CubeListBuilder.create().texOffs(100, 0).addBox(-6.5F, 7.0F, 1.9F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, -2.0F, 0.0F));

		 right_arm.addOrReplaceChild("rightarm67", CubeListBuilder.create().texOffs(100, 0).addBox(-8.4F, 10.3F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, -2.0F, 0.0F));

		PartDefinition left_arm = root.addOrReplaceChild("left_arm", CubeListBuilder.create().texOffs(40, 16).mirror().addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(5.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F));

		left_arm.addOrReplaceChild("leftarm1", CubeListBuilder.create().texOffs(318, 317).mirror().addBox(4.0F, -24.0F, -2.1F, 4.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-5.0F, 22.0F, 0.0F));

		left_arm.addOrReplaceChild("leftarm2", CubeListBuilder.create().texOffs(318, 317).mirror().addBox(4.0F, -24.0F, 1.1F, 4.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-5.0F, 22.0F, 0.0F));

		left_arm.addOrReplaceChild("leftarm3", CubeListBuilder.create().texOffs(426, 330).mirror().addBox(7.1F, -24.0F, -2.0F, 1.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-5.0F, 22.0F, 0.0F));

		left_arm.addOrReplaceChild("leftarm4", CubeListBuilder.create().texOffs(366, 362).mirror().addBox(-1.1F, 0.0F, -2.0F, 1.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, -2.0F, 0.0F));

		left_arm.addOrReplaceChild("leftarm5", CubeListBuilder.create().texOffs(435, 316).mirror().addBox(-1.0F, -24.1F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 22.0F, 0.0F));

		left_arm.addOrReplaceChild("leftarm6", CubeListBuilder.create().texOffs(400, 0).mirror().addBox(4.0F, -12.9F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-5.0F, 22.0F, 0.0F));

		left_arm.addOrReplaceChild("leftarm7", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(4.0F, -21.0F, -2.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-5.0F, 22.0F, 0.0F));

		left_arm.addOrReplaceChild("leftarm8", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-1.0F, -21.0F, 1.3F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 22.0F, 0.0F));

		left_arm.addOrReplaceChild("leftarm9", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(2.3F, 1.0F, -2.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		 left_arm.addOrReplaceChild("leftarm10", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(2.3F, 1.0F, 1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		 left_arm.addOrReplaceChild("leftarm11", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-1.3F, 1.0F, -2.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		 left_arm.addOrReplaceChild("leftarm12", CubeListBuilder.create().texOffs(300, 0).mirror().addBox(-1.3F, 1.0F, 1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		 left_arm.addOrReplaceChild("leftarm13", CubeListBuilder.create().texOffs(200, 430).mirror().addBox(0.0F, 0.5966F, -2.937F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1859F, 0.0F, 0.0F));

		 left_arm.addOrReplaceChild("leftarm14", CubeListBuilder.create().texOffs(300, 230).mirror().addBox(2.9F, -0.8F, -1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2603F));

		 left_arm.addOrReplaceChild("leftarm15", CubeListBuilder.create().texOffs(199, 450).mirror().addBox(1.5251F, -0.8959F, -1.5F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 0.6F, 0.0F, 0.0F, 0.0F, -0.4325F));

		 left_arm.addOrReplaceChild("leftarm16", CubeListBuilder.create().texOffs(199, 469).mirror().addBox(8.2463F, -0.154F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.2603F));

		 left_arm.addOrReplaceChild("leftarm17", CubeListBuilder.create().texOffs(200, 490).mirror().addBox(7.9F, -0.154F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.2603F));

		 left_arm.addOrReplaceChild("leftarm18", CubeListBuilder.create().texOffs(250, 50).mirror().addBox(2.5F, 1.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.0F, 0.0F, 0.0F, 0.0F, -0.2231F));

		 left_arm.addOrReplaceChild("leftarm19", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.0F, 22.0F, 0.0F, 0.0F, 0.0F, -0.2231F));

		 left_arm.addOrReplaceChild("leftarm20", CubeListBuilder.create().texOffs(250, 90).mirror().addBox(5.5F, 1.8F, 2.4F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.0F, -2.0F, 0.0F, -0.2603F, 0.0F, 0.0F));

		 left_arm.addOrReplaceChild("leftarm21", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(4.0F, 7.0F, -2.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-5.0F, -2.0F, 0.0F));

		 left_arm.addOrReplaceChild("leftarm22", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(7.0F, 7.0F, -2.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-5.0F, -2.0F, 0.0F));

		 left_arm.addOrReplaceChild("leftarm23", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(5.0F, 8.0F, -2.4F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-5.0F, -2.0F, 0.0F));

		 left_arm.addOrReplaceChild("leftarm24", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(7.3F, 7.0F, -2.1F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-5.0F, -2.0F, 0.0F));

		 left_arm.addOrReplaceChild("leftarm25", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(7.3F, 7.0F, 1.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-5.0F, -2.0F, 0.0F));

		 left_arm.addOrReplaceChild("leftarm26", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(4.0F, 7.0F, 1.3F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-5.0F, -2.0F, 0.0F));

		 left_arm.addOrReplaceChild("leftarm27", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(3.7F, 7.0F, -2.1F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-5.0F, -2.0F, 0.0F));

		 left_arm.addOrReplaceChild("leftarm28", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(3.7F, 7.0F, 1.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-5.0F, -2.0F, 0.0F));

		 left_arm.addOrReplaceChild("leftarm29", CubeListBuilder.create().texOffs(250, 110).mirror().addBox(4.5F, 5.9777F, 2.3992F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.0F, -2.0F, 0.0F, -0.0744F, 0.0F, 0.0F));

		 left_arm.addOrReplaceChild("leftarm30", CubeListBuilder.create().texOffs(250, 130).mirror().addBox(8.1F, 6.2F, -2.2F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.1115F));

		 left_arm.addOrReplaceChild("leftarm31", CubeListBuilder.create().texOffs(250, 150).mirror().addBox(8.4F, 5.6F, -1.1F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.1115F));

		 left_arm.addOrReplaceChild("leftarm33", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(5.5F, 9.0F, -2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-5.0F, -2.0F, 0.0F));

		 left_arm.addOrReplaceChild("leftarm34", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(5.5F, 7.0F, 1.9F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-5.0F, -2.0F, 0.0F));

		 left_arm.addOrReplaceChild("leftarm35", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(6.4F, 10.3F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-5.0F, -2.0F, 0.0F));

		PartDefinition right_leg = root.addOrReplaceChild("right_leg", CubeListBuilder.create().texOffs(0, 16).mirror().addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-2.0F, 12.0F, 0.0F));

		right_leg.addOrReplaceChild("rightleg1", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-4.2F, 13.0F, -2.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		right_leg.addOrReplaceChild("rightleg2", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-4.0F, 13.0F, 1.2F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		right_leg.addOrReplaceChild("rightleg3", CubeListBuilder.create().texOffs(250, 390).mirror().addBox(-14.3438F, 1.0166F, -2.3F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.0F, -12.0F, 0.0F, 0.0F, 0.0F, -1.2641F));

		right_leg.addOrReplaceChild("rightleg4", CubeListBuilder.create().texOffs(250, 410).mirror().addBox(-14.3438F, 1.0166F, 1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.0F, -12.0F, 0.0F, 0.0F, 0.0F, -1.2641F));

		right_leg.addOrReplaceChild("rightleg5", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-3.1F, 13.5F, 1.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		right_leg.addOrReplaceChild("rightleg6", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-3.1F, 13.5F, -2.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		right_leg.addOrReplaceChild("rightleg7", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-4.1F, 13.0F, -2.2F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		right_leg.addOrReplaceChild("rightleg8", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-3.1F, 14.9F, -2.2F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		right_leg.addOrReplaceChild("rightleg9", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-0.8F, 15.2F, -2.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		 right_leg.addOrReplaceChild("rightleg10", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-0.8F, 15.8F, -2.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		 right_leg.addOrReplaceChild("rightleg11", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-3.0F, 19.0F, -2.3F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		 right_leg.addOrReplaceChild("rightleg12", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-4.0F, 19.0F, -2.2F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		 right_leg.addOrReplaceChild("rightleg13", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-4.0F, 19.0F, 1.2F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		 right_leg.addOrReplaceChild("leftleg133", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-4.0F, 19.0F, 1.2F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		 right_leg.addOrReplaceChild("rightleg14", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-4.2F, 19.0F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		 right_leg.addOrReplaceChild("rightleg15", CubeListBuilder.create().texOffs(250, 430).mirror().addBox(-6.6559F, 12.1712F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.0F, -12.0F, 0.0F, 0.0F, 0.0F, -0.1487F));

		 right_leg.addOrReplaceChild("rightleg16", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-4.7F, 14.0F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		 right_leg.addOrReplaceChild("rightleg17", CubeListBuilder.create().texOffs(250, 450).mirror().addBox(-7.3559F, 17.3712F, -1.5F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.0F, -12.0F, 0.0F, 0.0F, 0.0F, -0.1487F));

		 right_leg.addOrReplaceChild("rightleg18", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-4.4F, 19.0F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		 right_leg.addOrReplaceChild("rightleg19", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-4.5F, 21.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		 right_leg.addOrReplaceChild("rightleg20", CubeListBuilder.create().texOffs(250, 470).mirror().addBox(-3.0F, 16.923F, -4.6802F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.0F, -12.0F, 0.0F, 0.1115F, 0.0F, 0.0F));

		 right_leg.addOrReplaceChild("rightleg21", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-4.2F, 18.3F, -2.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		 right_leg.addOrReplaceChild("rightleg22", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-0.8F, 18.3F, -2.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		 right_leg.addOrReplaceChild("rightleg23", CubeListBuilder.create().texOffs(101, 0).mirror().addBox(-3.0F, 15.0F, 1.4F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		 right_leg.addOrReplaceChild("rightleg24", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-0.9F, 15.8F, 1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		 right_leg.addOrReplaceChild("rightleg25", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-3.5F, 22.0F, -2.7F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		 right_leg.addOrReplaceChild("rightleg26", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-0.8F, 18.3F, 1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		 right_leg.addOrReplaceChild("rightleg27", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-4.2F, 18.3F, 1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		 right_leg.addOrReplaceChild("rightleg28", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-0.8F, 19.0F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		 right_leg.addOrReplaceChild("rightleg29", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-0.8F, 23.0F, -2.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		 right_leg.addOrReplaceChild("rightleg30", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-4.2F, 23.0F, -2.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		 right_leg.addOrReplaceChild("rightleg31", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-4.3F, 22.0F, 0.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		 right_leg.addOrReplaceChild("rightleg32", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-0.7F, 22.0F, 0.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		 right_leg.addOrReplaceChild("rightleg33", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-3.5F, 23.0F, 1.3F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		PartDefinition left_leg = root.addOrReplaceChild("left_leg", CubeListBuilder.create().texOffs(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, 12.0F, 0.0F));

		left_leg.addOrReplaceChild("leftleg1", CubeListBuilder.create().texOffs(100, 0).addBox(-0.2F, 18.3F, -2.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

		left_leg.addOrReplaceChild("leftleg2", CubeListBuilder.create().texOffs(100, 0).addBox(-0.2F, 18.3F, 1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

		left_leg.addOrReplaceChild("leftleg3", CubeListBuilder.create().texOffs(100, 0).addBox(-0.2F, 15.2F, -2.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

		left_leg.addOrReplaceChild("leftleg4", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-0.2F, 15.2F, 1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-2.0F, -12.0F, 0.0F));

		left_leg.addOrReplaceChild("leftleg5", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-0.2F, 15.8F, 1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-2.0F, -12.0F, 0.0F));

		left_leg.addOrReplaceChild("leftleg6", CubeListBuilder.create().texOffs(100, 0).addBox(-0.2F, 15.8F, -2.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

		left_leg.addOrReplaceChild("leftleg7", CubeListBuilder.create().texOffs(100, 0).addBox(-0.3F, 22.0F, 0.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

		left_leg.addOrReplaceChild("leftleg8", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-0.2F, 23.0F, -2.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-2.0F, -12.0F, 0.0F));

		left_leg.addOrReplaceChild("leftleg9", CubeListBuilder.create().texOffs(100, 0).addBox(-0.2F, 19.0F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

		 left_leg.addOrReplaceChild("leftleg10", CubeListBuilder.create().texOffs(100, 0).addBox(0.1F, 14.9F, -2.2F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

		 left_leg.addOrReplaceChild("leftleg11", CubeListBuilder.create().texOffs(100, 0).addBox(2.1F, 13.5F, -2.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

		 left_leg.addOrReplaceChild("leftleg12", CubeListBuilder.create().texOffs(250, 390).addBox(13.3438F, 1.0166F, -2.3F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -12.0F, 0.0F, 0.0F, 0.0F, 1.2641F));

		 left_leg.addOrReplaceChild("leftleg13", CubeListBuilder.create().texOffs(100, 0).addBox(3.1F, 13.0F, -2.2F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

		 left_leg.addOrReplaceChild("leftleg14", CubeListBuilder.create().texOffs(100, 0).addBox(3.2F, 13.0F, -2.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

		 left_leg.addOrReplaceChild("leftleg15", CubeListBuilder.create().texOffs(100, 0).addBox(3.7F, 14.0F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

		 left_leg.addOrReplaceChild("leftleg16", CubeListBuilder.create().texOffs(250, 430).addBox(5.6559F, 12.1712F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -12.0F, 0.0F, 0.0F, 0.0F, 0.1487F));

		 left_leg.addOrReplaceChild("leftleg17", CubeListBuilder.create().texOffs(100, 0).addBox(0.1F, 15.0F, 1.4F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

		 left_leg.addOrReplaceChild("leftleg18", CubeListBuilder.create().texOffs(100, 0).addBox(3.0F, 13.0F, 1.2F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

		 left_leg.addOrReplaceChild("leftleg19", CubeListBuilder.create().texOffs(100, 0).addBox(2.1F, 13.5F, 1.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

		 left_leg.addOrReplaceChild("leftleg20", CubeListBuilder.create().texOffs(250, 410).addBox(13.3438F, 1.0166F, 1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -12.0F, 0.0F, 0.0F, 0.0F, 1.2641F));

		 left_leg.addOrReplaceChild("leftleg21", CubeListBuilder.create().texOffs(100, 0).addBox(0.0F, 19.0F, -2.2F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

		 left_leg.addOrReplaceChild("leftleg22", CubeListBuilder.create().texOffs(100, 0).addBox(1.0F, 19.0F, -2.3F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

		 left_leg.addOrReplaceChild("leftleg23", CubeListBuilder.create().texOffs(250, 470).addBox(1.0F, 16.923F, -4.6802F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -12.0F, 0.0F, 0.1115F, 0.0F, 0.0F));

		 left_leg.addOrReplaceChild("leftleg24", CubeListBuilder.create().texOffs(100, 0).addBox(3.2F, 23.0F, -2.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

		 left_leg.addOrReplaceChild("leftleg25", CubeListBuilder.create().texOffs(100, 0).addBox(0.5F, 22.0F, -2.7F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

		 left_leg.addOrReplaceChild("leftleg26", CubeListBuilder.create().texOffs(100, 0).addBox(0.5F, 23.0F, 1.3F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

		 left_leg.addOrReplaceChild("leftleg27", CubeListBuilder.create().texOffs(100, 0).addBox(3.3F, 22.0F, 0.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

		 left_leg.addOrReplaceChild("leftleg28", CubeListBuilder.create().texOffs(100, 0).addBox(3.2F, 18.3F, -2.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

		 left_leg.addOrReplaceChild("leftleg29", CubeListBuilder.create().texOffs(100, 0).addBox(3.2F, 18.3F, 1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

		 left_leg.addOrReplaceChild("leftleg30", CubeListBuilder.create().texOffs(100, 0).addBox(3.2F, 19.0F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

		 left_leg.addOrReplaceChild("leftleg31", CubeListBuilder.create().texOffs(100, 0).addBox(3.4F, 19.0F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

		 left_leg.addOrReplaceChild("leftleg32", CubeListBuilder.create().texOffs(250, 450).addBox(6.3559F, 17.3712F, -1.5F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -12.0F, 0.0F, 0.0F, 0.0F, 0.1487F));

		 left_leg.addOrReplaceChild("leftleg33", CubeListBuilder.create().texOffs(100, 0).addBox(3.5F, 21.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

		 left_leg.addOrReplaceChild("leftleg34", CubeListBuilder.create().texOffs(100, 0).addBox(0.0F, 19.0F, 1.2F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

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