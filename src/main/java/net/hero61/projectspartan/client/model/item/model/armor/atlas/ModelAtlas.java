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

public class ModelAtlas<T extends LivingEntity> extends HumanoidModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation(ProjectSpartan.MOD_ID, "atlas_body"), "main");

	public ModelAtlas(ModelPart modelPart) {
		super (modelPart);
	}

	public static LayerDefinition createLayer() {
		MeshDefinition definition = ModelUtils.createBlankHumanoidMesh();
		PartDefinition root = definition.getRoot();

		PartDefinition body = root.addOrReplaceChild("body", CubeListBuilder.create().texOffs(16, 16).mirror().addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		body.addOrReplaceChild("chest1", CubeListBuilder.create().texOffs(183, 73).mirror().addBox(-3.5F, 1.4F, -3.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		body.addOrReplaceChild("chest2", CubeListBuilder.create().texOffs(152, 76).mirror().addBox(1.5F, 1.4F, -3.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		body.addOrReplaceChild("chest3", CubeListBuilder.create().texOffs(80, 210).mirror().addBox(-2.5F, 3.0F, -4.8F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2974F, 0.0F, 0.0F));

		body.addOrReplaceChild("chest4", CubeListBuilder.create().texOffs(47, 263).addBox(-2.5F, 2.9F, -4.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1438F, 0.0F, 0.2182F));

		body.addOrReplaceChild("chest5", CubeListBuilder.create().texOffs(80, 250).mirror().addBox(1.5F, 2.9F, -4.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1438F, 0.0F, -0.2182F));

		body.addOrReplaceChild("chest7", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		body.addOrReplaceChild("chest8", CubeListBuilder.create().texOffs(80, 310).mirror().addBox(1.5F, 3.0F, -4.8F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2974F, 0.0F, 0.0F));

		body.addOrReplaceChild("chest9", CubeListBuilder.create().texOffs(80, 330).mirror().addBox(-1.5F, 3.0F, -4.8F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2974F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest10", CubeListBuilder.create().texOffs(80, 350).mirror().addBox(-2.0F, 4.0F, -4.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2974F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest11", CubeListBuilder.create().texOffs(80, 370).mirror().addBox(1.0F, 4.0F, -4.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2974F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest12", CubeListBuilder.create().texOffs(80, 390).mirror().addBox(-1.0F, 3.5F, -4.8F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2974F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest13", CubeListBuilder.create().texOffs(80, 410).mirror().addBox(-1.5F, 4.0F, -4.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2974F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest14", CubeListBuilder.create().texOffs(80, 430).mirror().addBox(0.5F, 4.0F, -4.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2974F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest15", CubeListBuilder.create().texOffs(80, 450).mirror().addBox(-1.0F, 3.8F, -4.7F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2974F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest16", CubeListBuilder.create().texOffs(80, 470).mirror().addBox(-1.5F, 3.5F, -3.4F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0744F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest17", CubeListBuilder.create().texOffs(80, 490).mirror().addBox(1.5F, 2.5F, -3.4F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0744F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest18", CubeListBuilder.create().texOffs(149, 50).mirror().addBox(-3.5F, 2.5F, -3.4F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0744F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest19", CubeListBuilder.create().texOffs(151, 70).mirror().addBox(2.5F, 1.0F, -3.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2231F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest20", CubeListBuilder.create().texOffs(178, 350).mirror().addBox(-3.5F, 1.0F, -3.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2231F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest21", CubeListBuilder.create().texOffs(150, 110).mirror().addBox(1.5F, 2.5F, -3.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0744F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest22", CubeListBuilder.create().texOffs(150, 130).mirror().addBox(-2.5F, 2.5F, -3.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0744F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest23", CubeListBuilder.create().texOffs(184, 143).mirror().addBox(-1.5F, 2.2F, -3.55F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0744F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest83", CubeListBuilder.create().texOffs(184, 143).mirror().addBox(-1.5F, 2.2F, -3.55F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.3F, 0.0F, -0.0744F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest53", CubeListBuilder.create().texOffs(170, 153).mirror().addBox(-1.5F, 5.6331F, -0.59F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, -5.0F, 0.2967F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest82", CubeListBuilder.create().texOffs(170, 153).mirror().addBox(-1.5F, 5.6331F, -0.59F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.2F, -5.0F, 0.2967F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest28", CubeListBuilder.create().texOffs(246, 159).mirror().addBox(0.2321F, 2.9972F, -3.4257F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0744F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest62", CubeListBuilder.create().texOffs(236, 163).mirror().addBox(-3.2321F, 2.9972F, -3.4257F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0744F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest68", CubeListBuilder.create().texOffs(212, 156).mirror().addBox(-3.2321F, 3.415F, -5.0046F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2967F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest69", CubeListBuilder.create().texOffs(181, 163).mirror().addBox(1.2321F, 3.415F, -5.0005F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2967F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest27", CubeListBuilder.create().texOffs(193, 134).mirror().addBox(-2.5217F, 6.4484F, 2.4335F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, -8.0F, 0.2967F, 0.0F, -0.5236F));

		 body.addOrReplaceChild("chest64", CubeListBuilder.create().texOffs(154, 166).mirror().addBox(-4.1663F, 1.0203F, -3.573F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0744F, 0.0F, -0.5236F));

		 body.addOrReplaceChild("chest54", CubeListBuilder.create().texOffs(137, 166).mirror().addBox(2.1663F, 1.0203F, -3.573F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0744F, 0.0F, 0.5236F));

		 body.addOrReplaceChild("chest61", CubeListBuilder.create().texOffs(169, 134).mirror().addBox(-20.2629F, 15.5851F, -8.7254F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(24.0F, 0.0F, 0.0F, 0.2967F, 0.0F, 0.5236F));

		 body.addOrReplaceChild("chest24", CubeListBuilder.create().texOffs(373, 286).mirror().addBox(-4.3F, 0.0221F, -3.0975F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2231F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest25", CubeListBuilder.create().texOffs(437, 293).mirror().addBox(3.3F, 0.0221F, -3.0975F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2231F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest26", CubeListBuilder.create().texOffs(405, 88).mirror().addBox(-1.0F, 9.6F, -2.7F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest29", CubeListBuilder.create().texOffs(147, 227).mirror().addBox(-4.5F, 5.5F, -4.5F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2974F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest30", CubeListBuilder.create().texOffs(147, 247).mirror().addBox(2.5F, 5.5F, -4.5F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2974F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest31", CubeListBuilder.create().texOffs(286, 115).mirror().addBox(-2.0F, 6.5F, -2.81F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest32", CubeListBuilder.create().texOffs(285, 116).mirror().addBox(-1.0F, 7.5F, -3.01F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest65", CubeListBuilder.create().texOffs(284, 116).mirror().addBox(-0.3141F, 7.1262F, -3.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.4363F));

		 body.addOrReplaceChild("chest66", CubeListBuilder.create().texOffs(285, 116).mirror().addBox(-2.6859F, 7.1262F, -3.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.4363F));

		 body.addOrReplaceChild("chest34", CubeListBuilder.create().texOffs(399, 103).mirror().addBox(-1.5F, 9.0F, -2.6F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest35", CubeListBuilder.create().texOffs(150, 270).mirror().addBox(-3.0F, 3.0F, -4.79F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2974F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest36", CubeListBuilder.create().texOffs(150, 290).mirror().addBox(-3.8F, 4.5F, -4.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2974F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest37", CubeListBuilder.create().texOffs(150, 310).mirror().addBox(2.0F, 3.0F, -4.8F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2974F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest38", CubeListBuilder.create().texOffs(150, 330).mirror().addBox(2.8F, 4.5F, -4.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2974F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest46", CubeListBuilder.create().texOffs(403, 72).mirror().addBox(-1.0F, 10.6F, -4.2F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1487F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest49", CubeListBuilder.create().texOffs(439, 81).mirror().addBox(-5.0F, 9.5F, -1.0F, 10.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest50", CubeListBuilder.create().texOffs(461, 63).mirror().addBox(-3.0F, 0.0F, -2.4F, 6.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest51", CubeListBuilder.create().texOffs(256, 483).mirror().addBox(2.5F, 0.1453F, 1.4954F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest44", CubeListBuilder.create().texOffs(396, 226).addBox(2.49F, 0.1453F, 2.4954F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.3F, 0.0F, 0.5672F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest45", CubeListBuilder.create().texOffs(396, 226).addBox(2.51F, 0.1453F, 2.4954F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.0F, 6.3F, 0.0F, 0.5672F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest52", CubeListBuilder.create().texOffs(256, 483).mirror().addBox(-5.5F, 0.1453F, 1.4954F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest55", CubeListBuilder.create().texOffs(429, 291).mirror().addBox(3.5F, -0.3F, -2.3F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1115F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest56", CubeListBuilder.create().texOffs(297, 209).mirror().addBox(2.5F, -0.3553F, -1.5487F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1115F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest57", CubeListBuilder.create().texOffs(199, 109).mirror().addBox(-5.5F, -0.3553F, -1.5487F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1115F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest58", CubeListBuilder.create().texOffs(429, 331).mirror().addBox(-4.5F, -0.3F, -2.3F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1115F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest59", CubeListBuilder.create().texOffs(205, 343).mirror().addBox(2.5F, 1.5F, 2.7F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.7854F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest60", CubeListBuilder.create().texOffs(205, 363).mirror().addBox(-5.5F, 1.5F, 2.7F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.7854F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest33", CubeListBuilder.create().texOffs(200, 319).mirror().addBox(2.5F, 0.7985F, 0.2292F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.6581F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest39", CubeListBuilder.create().texOffs(200, 319).addBox(-5.5F, 0.7985F, 0.2292F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.6581F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest40", CubeListBuilder.create().texOffs(435, 309).mirror().addBox(-5.51F, -1.8292F, -0.118F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 2.0071F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest41", CubeListBuilder.create().texOffs(416, 310).mirror().addBox(2.51F, -1.8292F, -0.118F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 2.0071F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest63", CubeListBuilder.create().texOffs(401, 297).mirror().addBox(-3.0F, 0.7F, 1.1F, 6.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, -0.5F, 0.0F));

		 body.addOrReplaceChild("chest67", CubeListBuilder.create().texOffs(441, 63).mirror().addBox(2.5F, 4.8985F, 2.7331F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1487F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest47", CubeListBuilder.create().texOffs(441, 63).addBox(-5.5F, 4.8985F, 2.7331F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1487F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest72", CubeListBuilder.create().texOffs(447, 78).mirror().addBox(-1.0F, 5.0F, 1.1F, 2.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1487F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest78", CubeListBuilder.create().texOffs(199, 350).mirror().addBox(-2.5F, 9.8554F, 2.5052F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1859F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest73", CubeListBuilder.create().texOffs(203, 350).mirror().addBox(-8.4691F, 5.9472F, 1.9118F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1859F, 0.0F, -0.6981F));

		 body.addOrReplaceChild("chest75", CubeListBuilder.create().texOffs(202, 350).mirror().addBox(-7.018F, 9.9104F, -1.5882F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1859F, 0.0F, -0.6545F));

		 body.addOrReplaceChild("chest76", CubeListBuilder.create().texOffs(202, 350).mirror().addBox(5.018F, 9.9104F, -1.5882F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1859F, 0.0F, 0.6545F));

		 body.addOrReplaceChild("chest74", CubeListBuilder.create().texOffs(203, 350).mirror().addBox(7.4691F, 5.9472F, 1.9118F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1859F, 0.0F, 0.6981F));

		 body.addOrReplaceChild("chest79", CubeListBuilder.create().texOffs(200, 370).mirror().addBox(-1.5F, 9.1554F, 3.5152F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1859F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest77", CubeListBuilder.create().texOffs(201, 370).mirror().addBox(-0.5F, 10.1554F, 3.5152F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 0.5F, 0.0F, -0.1859F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest42", CubeListBuilder.create().texOffs(406, 342).mirror().addBox(-11.7F, 5.3386F, 0.6786F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(10.2F, -1.2F, 0.0F));

		 body.addOrReplaceChild("chest43", CubeListBuilder.create().texOffs(449, 281).mirror().addBox(-10.9F, 1.964F, 0.2403F, 2.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(10.2F, 1.8F, 3.0F, -0.9076F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest48", CubeListBuilder.create().texOffs(469, 292).mirror().addBox(-10.9F, 1.964F, 0.2403F, 2.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(9.6F, 1.8F, 3.0F, -0.9076F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest80", CubeListBuilder.create().texOffs(427, 253).mirror().addBox(-3.0F, -1.0F, 1.4F, 6.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest81", CubeListBuilder.create().texOffs(391, 316).mirror().addBox(-11.7F, 1.3515F, 1.1404F, 3.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(10.2F, -1.2F, 0.0F));

		body.addOrReplaceChild("chest6", CubeListBuilder.create().texOffs(406, 327).mirror().addBox(-11.7F, 3.941F, -10.8093F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(10.2F, 3.8F, 13.0F, -0.48F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest70", CubeListBuilder.create().texOffs(338, 112).mirror().addBox(-3.3F, 4.478F, -6.4465F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 0.0F, 1.5F, 0.2974F, 0.0F, 0.0F));

		 body.addOrReplaceChild("chest71", CubeListBuilder.create().texOffs(338, 112).mirror().addBox(-3.3F, 4.478F, -6.4465F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(5.3F, 0.0F, 1.5F, 0.2974F, 0.0F, 0.0F));

		PartDefinition right_arm = root.addOrReplaceChild("right_arm", CubeListBuilder.create().texOffs(40, 16).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F));

		 right_arm.addOrReplaceChild("rightarm31", CubeListBuilder.create().texOffs(391, 252).addBox(-8.0F, -24.0F, -2.1F, 4.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, 22.0F, 0.0F));

		 right_arm.addOrReplaceChild("rightarm35", CubeListBuilder.create().texOffs(409, 245).addBox(-8.0F, -24.0F, 1.1F, 4.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, 22.0F, 0.0F));

		 right_arm.addOrReplaceChild("rightarm36", CubeListBuilder.create().texOffs(409, 245).addBox(-8.1F, -24.0F, -2.0F, 1.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, 22.0F, 0.0F));

		 right_arm.addOrReplaceChild("rightarm37", CubeListBuilder.create().texOffs(400, 0).addBox(0.1F, 0.0F, -2.0F, 1.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -2.0F, 0.0F));

		 right_arm.addOrReplaceChild("rightarm38", CubeListBuilder.create().texOffs(409, 245).addBox(-3.0F, -24.1F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 22.0F, 0.0F));

		 right_arm.addOrReplaceChild("rightarm39", CubeListBuilder.create().texOffs(400, 0).addBox(-8.0F, -12.9F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, 22.0F, 0.0F));

		 right_arm.addOrReplaceChild("rightarm46", CubeListBuilder.create().texOffs(404, 113).addBox(-2.0F, 1.5F, -2.9F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1859F, 0.0F, 0.0F));

		 right_arm.addOrReplaceChild("rightarm47", CubeListBuilder.create().texOffs(249, 330).addBox(-3.9958F, -0.7806F, -2.49F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.4348F));

		 right_arm.addOrReplaceChild("rightarm48", CubeListBuilder.create().texOffs(167, 373).addBox(-3.7303F, -0.1024F, -2.51F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, 0.0F, 0.0F, 0.0F, 0.1358F));

		right_arm.addOrReplaceChild("rightarm2", CubeListBuilder.create().texOffs(167, 373).addBox(-3.69F, 0.1958F, -2.5F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -1.2F, 0.0F, 0.0F, 0.0F, 0.1358F));

		right_arm.addOrReplaceChild("rightarm3", CubeListBuilder.create().texOffs(180, 400).addBox(-3.446F, 1.0632F, -1.1759F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -3.1F, 0.0F, -0.5236F, 0.0F, 0.1358F));

		right_arm.addOrReplaceChild("rightarm4", CubeListBuilder.create().texOffs(201, 419).addBox(-3.446F, 1.0632F, -0.8241F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -3.1F, 0.0F, 0.5236F, 0.0F, 0.1358F));

		right_arm.addOrReplaceChild("rightarm5", CubeListBuilder.create().texOffs(200, 407).addBox(-3.4529F, 0.3462F, -1.5F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -3.1F, 0.0F, 0.0F, 0.0F, 0.1358F));

		 right_arm.addOrReplaceChild("rightarm49", CubeListBuilder.create().texOffs(164, 319).addBox(-9.373F, -1.0728F, 0.48F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, -2.0F, 0.0F, 0.0F, 0.0F, -0.4348F));

		 right_arm.addOrReplaceChild("rightarm51", CubeListBuilder.create().texOffs(250, 50).addBox(-3.5F, -0.7F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, -2.0F, 0.0F, 0.0F, 0.0F, 0.1358F));

		 right_arm.addOrReplaceChild("rightarm53", CubeListBuilder.create().texOffs(404, 100).addBox(-7.8F, 3.4827F, 2.4679F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, -2.0F, 0.0F, -0.2603F, 0.0F, 0.0F));

		 right_arm.addOrReplaceChild("rightarm55", CubeListBuilder.create().texOffs(100, 2).addBox(-8.0F, 6.0F, -2.3F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, -2.0F, 0.0F));

		 right_arm.addOrReplaceChild("rightarm56", CubeListBuilder.create().texOffs(92, 60).addBox(-7.0F, 6.0F, -2.4F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, -2.0F, 0.0F));

		 right_arm.addOrReplaceChild("rightarm57", CubeListBuilder.create().texOffs(126, 112).addBox(-8.31F, 6.0F, -2.1F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, -2.0F, 0.0F));

		 right_arm.addOrReplaceChild("rightarm58", CubeListBuilder.create().texOffs(297, 111).addBox(-8.3F, 6.0F, 1.1F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, -2.0F, 0.0F));

		 right_arm.addOrReplaceChild("rightarm59", CubeListBuilder.create().texOffs(121, 79).addBox(-8.01F, 6.0F, 1.3F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, -2.0F, 0.0F));

		 right_arm.addOrReplaceChild("rightarm60", CubeListBuilder.create(), PartPose.offset(5.0F, -2.0F, 0.0F));

		 right_arm.addOrReplaceChild("rightarm61", CubeListBuilder.create(), PartPose.offset(5.0F, -2.0F, 0.0F));

		 right_arm.addOrReplaceChild("rightarm62", CubeListBuilder.create().texOffs(305, 231).addBox(-8.0F, 6.0F, 2.1F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, -2.0F, 0.0F, -0.0744F, 0.0F, 0.0F));

		 right_arm.addOrReplaceChild("rightarm63", CubeListBuilder.create().texOffs(250, 130).addBox(-9.1F, 5.2F, -2.2F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, -2.0F, 0.0F, 0.0F, 0.0F, -0.1115F));

		 right_arm.addOrReplaceChild("rightarm64", CubeListBuilder.create().texOffs(402, 126).addBox(-8.8183F, 6.4998F, -1.1F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, -2.0F, 0.0F, 0.0F, 0.0F, -0.0262F));

		 right_arm.addOrReplaceChild("rightarm66", CubeListBuilder.create().texOffs(100, 2).addBox(-7.6F, 8.0F, 1.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, -2.0F, 0.0F));

		 right_arm.addOrReplaceChild("rightarm67", CubeListBuilder.create().texOffs(141, 378).addBox(-8.4F, 10.3F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, -2.0F, 0.0F));

		PartDefinition left_arm = root.addOrReplaceChild("left_arm", CubeListBuilder.create().texOffs(40, 16).mirror().addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(5.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F));

		left_arm.addOrReplaceChild("leftarm1", CubeListBuilder.create().texOffs(391, 252).mirror().addBox(4.0F, -24.0F, -2.1F, 4.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-5.0F, 22.0F, 0.0F));

		left_arm.addOrReplaceChild("leftarm2", CubeListBuilder.create().texOffs(409, 245).mirror().addBox(4.0F, -24.0F, 1.1F, 4.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-5.0F, 22.0F, 0.0F));

		left_arm.addOrReplaceChild("leftarm3", CubeListBuilder.create().texOffs(409, 245).mirror().addBox(7.1F, -24.0F, -2.0F, 1.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-5.0F, 22.0F, 0.0F));

		left_arm.addOrReplaceChild("leftarm4", CubeListBuilder.create().texOffs(400, 0).mirror().addBox(-1.1F, 0.0F, -2.0F, 1.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, -2.0F, 0.0F));

		left_arm.addOrReplaceChild("leftarm5", CubeListBuilder.create().texOffs(409, 245).mirror().addBox(-1.0F, -24.1F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 22.0F, 0.0F));

		left_arm.addOrReplaceChild("leftarm6", CubeListBuilder.create().texOffs(400, 0).mirror().addBox(4.0F, -12.9F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-5.0F, 22.0F, 0.0F));

		 left_arm.addOrReplaceChild("leftarm13", CubeListBuilder.create().texOffs(404, 113).mirror().addBox(0.0F, 1.5F, -2.9F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1859F, 0.0F, 0.0F));

		 left_arm.addOrReplaceChild("leftarm20", CubeListBuilder.create().texOffs(404, 100).mirror().addBox(5.6F, 3.4827F, 2.5679F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.0F, -2.0F, 0.0F, -0.2603F, 0.0F, 0.0F));

		 left_arm.addOrReplaceChild("leftarm22", CubeListBuilder.create().texOffs(100, 2).mirror().addBox(7.0F, 6.0F, -2.3F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-5.0F, -2.0F, 0.0F));

		 left_arm.addOrReplaceChild("leftarm23", CubeListBuilder.create().texOffs(93, 60).mirror().addBox(6.0F, 6.0F, -2.4F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-5.0F, -2.0F, 0.0F));

		 left_arm.addOrReplaceChild("leftarm24", CubeListBuilder.create().texOffs(126, 112).mirror().addBox(7.3F, 6.0F, -2.1F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-5.0F, -2.0F, 0.0F));

		 left_arm.addOrReplaceChild("leftarm25", CubeListBuilder.create().texOffs(297, 111).mirror().addBox(7.31F, 6.0F, 1.1F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-5.0F, -2.0F, 0.0F));

		 left_arm.addOrReplaceChild("leftarm26", CubeListBuilder.create().texOffs(123, 79).mirror().addBox(6.0F, 6.0F, 1.3F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-5.0F, -2.0F, 0.0F));

		 left_arm.addOrReplaceChild("leftarm28", CubeListBuilder.create(), PartPose.offset(-5.0F, -2.0F, 0.0F));

		 left_arm.addOrReplaceChild("leftarm29", CubeListBuilder.create().texOffs(289, 235).mirror().addBox(5.9F, 6.0F, 2.1F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.0F, -2.0F, 0.0F, -0.0744F, 0.0F, 0.0F));

		 left_arm.addOrReplaceChild("leftarm30", CubeListBuilder.create().texOffs(250, 130).mirror().addBox(8.1F, 5.2F, -2.2F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.1115F));

		 left_arm.addOrReplaceChild("leftarm31", CubeListBuilder.create().texOffs(402, 126).mirror().addBox(7.7183F, 6.4998F, -1.2F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0262F));

		 left_arm.addOrReplaceChild("leftarm34", CubeListBuilder.create().texOffs(100, 2).mirror().addBox(5.4F, 8.0F, 1.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-3.9F, -2.0F, 0.0F));

		 left_arm.addOrReplaceChild("leftarm35", CubeListBuilder.create().texOffs(141, 378).mirror().addBox(6.4F, 10.3F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-5.0F, -2.0F, 0.0F));

		left_arm.addOrReplaceChild("leftarm7", CubeListBuilder.create().texOffs(180, 400).mirror().addBox(1.446F, 1.0632F, -1.1759F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -3.1F, 0.0F, -0.5236F, 0.0F, -0.1358F));

		 left_arm.addOrReplaceChild("leftarm48", CubeListBuilder.create().texOffs(167, 373).mirror().addBox(1.7303F, -0.1024F, -2.51F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.4F, 0.0F, 0.0F, 0.0F, -0.1358F));

		left_arm.addOrReplaceChild("leftarm8", CubeListBuilder.create().texOffs(167, 373).mirror().addBox(1.69F, 0.1958F, -2.5F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -1.2F, 0.0F, 0.0F, 0.0F, -0.1358F));

		left_arm.addOrReplaceChild("leftarm9", CubeListBuilder.create().texOffs(200, 407).mirror().addBox(1.4529F, 0.3462F, -1.5F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -3.1F, 0.0F, 0.0F, 0.0F, -0.1358F));

		 left_arm.addOrReplaceChild("leftarm10", CubeListBuilder.create().texOffs(201, 419).mirror().addBox(1.446F, 1.0632F, -0.8241F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -3.1F, 0.0F, 0.5236F, 0.0F, -0.1358F));

		 left_arm.addOrReplaceChild("leftarm47", CubeListBuilder.create().texOffs(249, 330).mirror().addBox(1.9958F, -0.7806F, -2.49F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.4348F));

		 left_arm.addOrReplaceChild("leftarm11", CubeListBuilder.create().texOffs(250, 329).mirror().addBox(1.9958F, -0.7806F, -2.52F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.4348F));

		 left_arm.addOrReplaceChild("leftarm51", CubeListBuilder.create().texOffs(250, 50).mirror().addBox(2.5F, -0.7F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1F, -2.0F, 0.0F, 0.0F, 0.0F, -0.1358F));

		PartDefinition right_leg = root.addOrReplaceChild("right_leg", CubeListBuilder.create().texOffs(0, 16).mirror().addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-2.0F, 12.0F, 0.0F));

		right_leg.addOrReplaceChild("rightleg1", CubeListBuilder.create().texOffs(226, 63).mirror().addBox(-4.2F, 13.0F, -2.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		right_leg.addOrReplaceChild("rightleg2", CubeListBuilder.create().texOffs(102, 2).mirror().addBox(-4.0F, 13.0F, 1.2F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		right_leg.addOrReplaceChild("rightleg3", CubeListBuilder.create().texOffs(250, 390).mirror().addBox(-14.2743F, 1.5503F, -2.2F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.0F, -12.0F, 0.0F, 0.0F, 0.0F, -1.2204F));

		right_leg.addOrReplaceChild("rightleg4", CubeListBuilder.create().texOffs(250, 410).mirror().addBox(-14.24F, 1.6443F, 1.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.0F, -12.0F, 0.0F, 0.0F, 0.0F, -1.2204F));

		right_leg.addOrReplaceChild("rightleg5", CubeListBuilder.create().texOffs(102, 2).mirror().addBox(-3.1F, 13.5F, 1.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		right_leg.addOrReplaceChild("rightleg6", CubeListBuilder.create().texOffs(268, 230).mirror().addBox(-3.6F, 14.4F, -2.3F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		right_leg.addOrReplaceChild("rightleg7", CubeListBuilder.create().texOffs(144, 179).mirror().addBox(-4.1F, 13.0F, -2.2F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		right_leg.addOrReplaceChild("rightleg8", CubeListBuilder.create().texOffs(166, 120).mirror().addBox(-3.1F, 14.0F, -2.2F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		right_leg.addOrReplaceChild("rightleg9", CubeListBuilder.create().texOffs(207, 98).mirror().addBox(-0.8F, 15.2F, -2.11F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		 right_leg.addOrReplaceChild("rightleg10", CubeListBuilder.create().texOffs(334, 59).mirror().addBox(-0.8F, 15.8F, -2.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		 right_leg.addOrReplaceChild("rightleg11", CubeListBuilder.create().texOffs(256, 333).mirror().addBox(-3.0F, 20.0F, -2.3F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		 right_leg.addOrReplaceChild("rightleg12", CubeListBuilder.create().texOffs(254, 277).mirror().addBox(-4.0F, 19.0F, -2.21F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		 right_leg.addOrReplaceChild("rightleg13", CubeListBuilder.create().texOffs(403, 296).mirror().addBox(-4.0F, 19.0F, 1.3F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		 right_leg.addOrReplaceChild("rightleg14", CubeListBuilder.create().texOffs(122, 3).mirror().addBox(-4.21F, 19.0F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		 right_leg.addOrReplaceChild("rightleg15", CubeListBuilder.create().texOffs(270, 412).mirror().addBox(-6.19F, 11.736F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.0F, -12.0F, 0.0F, 0.0F, 0.0F, -0.1487F));

		 right_leg.addOrReplaceChild("rightleg35", CubeListBuilder.create().texOffs(253, 433).mirror().addBox(-6.1863F, 9.6637F, 6.734F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.0F, -12.0F, 0.0F, -0.5236F, 0.0F, -0.1487F));

		 right_leg.addOrReplaceChild("rightleg36", CubeListBuilder.create().texOffs(253, 433).mirror().addBox(-6.1863F, 9.6637F, -7.734F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.0F, -12.0F, 0.0F, 0.5236F, 0.0F, -0.1487F));

		 right_leg.addOrReplaceChild("rightleg37", CubeListBuilder.create().texOffs(253, 433).mirror().addBox(-6.1863F, 12.236F, 0.866F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.0F, -12.0F, 0.0F, 0.0F, 0.0F, -0.1487F));

		 right_leg.addOrReplaceChild("rightleg38", CubeListBuilder.create().texOffs(253, 433).mirror().addBox(-6.1863F, 12.236F, -1.866F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.0F, -12.0F, 0.0F, 0.0F, 0.0F, -0.1487F));

		 right_leg.addOrReplaceChild("rightleg16", CubeListBuilder.create().texOffs(104, 53).mirror().addBox(-5.204F, 13.3021F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.0F, -12.0F, 0.0F, 0.0F, 0.0F, -0.0436F));

		 right_leg.addOrReplaceChild("rightleg17", CubeListBuilder.create().texOffs(250, 450).mirror().addBox(-7.3559F, 17.3712F, -1.5F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.0F, -12.0F, 0.0F, 0.0F, 0.0F, -0.1487F));

		 right_leg.addOrReplaceChild("rightleg18", CubeListBuilder.create().texOffs(201, 57).mirror().addBox(-4.4F, 19.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		 right_leg.addOrReplaceChild("rightleg19", CubeListBuilder.create().texOffs(141, 52).mirror().addBox(-3.0F, 21.2F, 1.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		 right_leg.addOrReplaceChild("rightleg20", CubeListBuilder.create().texOffs(374, 293).mirror().addBox(-3.0F, 17.0477F, -4.4369F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.0F, -12.0F, 0.0F, 0.1115F, 0.0F, 0.0F));

		 right_leg.addOrReplaceChild("rightleg34", CubeListBuilder.create().texOffs(400, 312).mirror().addBox(-15.1529F, 10.5753F, -3.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.0F, -12.0F, 0.0F, 0.1115F, 0.0F, -0.7854F));

		 right_leg.addOrReplaceChild("rightleg40", CubeListBuilder.create().texOffs(419, 330).mirror().addBox(-15.1529F, 10.6823F, -3.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.2F, -11.8F, 0.0F, 0.1115F, 0.0F, -0.7854F));

		 right_leg.addOrReplaceChild("rightleg39", CubeListBuilder.create().texOffs(419, 330).mirror().addBox(11.3244F, 13.3861F, -3.9148F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.0F, -12.0F, 0.0F, 0.1115F, 0.0F, 0.7854F));

		 right_leg.addOrReplaceChild("rightleg21", CubeListBuilder.create().texOffs(115, 2).mirror().addBox(-4.2F, 18.3F, -2.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		 right_leg.addOrReplaceChild("rightleg22", CubeListBuilder.create().texOffs(288, 61).mirror().addBox(-0.8F, 18.3F, -2.2F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		 right_leg.addOrReplaceChild("rightleg23", CubeListBuilder.create().texOffs(102, 143).mirror().addBox(-4.0F, 14.0F, 1.21F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		 right_leg.addOrReplaceChild("rightleg24", CubeListBuilder.create().texOffs(102, 2).mirror().addBox(-0.9F, 14.0F, 1.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		 right_leg.addOrReplaceChild("rightleg25", CubeListBuilder.create().texOffs(159, 256).mirror().addBox(-3.5F, 22.0F, -2.7F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		 right_leg.addOrReplaceChild("rightleg26", CubeListBuilder.create().texOffs(160, 64).mirror().addBox(-3.0F, 18.3F, 1.4F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		 right_leg.addOrReplaceChild("rightleg27", CubeListBuilder.create().texOffs(160, 64).mirror().addBox(-4.3F, 18.3F, 1.2F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		 right_leg.addOrReplaceChild("rightleg28", CubeListBuilder.create().texOffs(218, 76).mirror().addBox(-0.7F, 19.0F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		 right_leg.addOrReplaceChild("rightleg29", CubeListBuilder.create().texOffs(102, 2).mirror().addBox(-0.8F, 23.0F, -2.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(102, 2).addBox(-0.2F, 23.0F, -2.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, -12.0F, 0.0F));

		 right_leg.addOrReplaceChild("rightleg30", CubeListBuilder.create().texOffs(102, 2).mirror().addBox(-4.2F, 23.0F, -2.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		 right_leg.addOrReplaceChild("rightleg31", CubeListBuilder.create().texOffs(163, 70).mirror().addBox(-4.3F, 22.0F, 0.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		 right_leg.addOrReplaceChild("rightleg32", CubeListBuilder.create().texOffs(102, 2).mirror().addBox(-0.7F, 22.0F, 0.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		 right_leg.addOrReplaceChild("rightleg33", CubeListBuilder.create().texOffs(102, 2).mirror().addBox(-3.5F, 23.0F, 1.3F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		PartDefinition left_leg = root.addOrReplaceChild("left_leg", CubeListBuilder.create().texOffs(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(102, 2).addBox(1.0F, 1.0F, 1.2F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, 12.0F, 0.0F));

		left_leg.addOrReplaceChild("leftleg1", CubeListBuilder.create().texOffs(128, 88).addBox(-0.2F, 18.3F, -2.2F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

		left_leg.addOrReplaceChild("leftleg2", CubeListBuilder.create().texOffs(160, 64).addBox(0.0F, 18.3F, 1.4F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

		left_leg.addOrReplaceChild("leftleg3", CubeListBuilder.create().texOffs(266, 74).addBox(-0.2F, 15.2F, -2.12F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

		left_leg.addOrReplaceChild("leftleg4", CubeListBuilder.create().texOffs(102, 2).mirror().addBox(-0.19F, 14.0F, 1.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-2.0F, -12.0F, 0.0F));

		left_leg.addOrReplaceChild("leftleg5", CubeListBuilder.create().texOffs(102, 2).mirror().addBox(-0.2F, 16.0F, 1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-2.0F, -12.0F, 0.0F));

		left_leg.addOrReplaceChild("leftleg6", CubeListBuilder.create().texOffs(266, 74).addBox(-0.2F, 15.8F, -2.19F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

		left_leg.addOrReplaceChild("leftleg7", CubeListBuilder.create().texOffs(102, 2).addBox(-0.3F, 22.0F, 0.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

		left_leg.addOrReplaceChild("leftleg8", CubeListBuilder.create().texOffs(102, 2).mirror().addBox(-0.2F, 23.0F, -2.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-2.0F, -12.0F, 0.0F));

		left_leg.addOrReplaceChild("leftleg9", CubeListBuilder.create().texOffs(218, 76).addBox(-0.3F, 19.0F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

		 left_leg.addOrReplaceChild("leftleg10", CubeListBuilder.create().texOffs(166, 120).addBox(0.1F, 14.0F, -2.2F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

		 left_leg.addOrReplaceChild("leftleg11", CubeListBuilder.create().texOffs(321, 126).addBox(0.6F, 14.5F, -2.3F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

		 left_leg.addOrReplaceChild("leftleg12", CubeListBuilder.create().texOffs(250, 390).addBox(13.2743F, 1.5503F, -2.2F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -12.0F, 0.0F, 0.0F, 0.0F, 1.2204F));

		 left_leg.addOrReplaceChild("leftleg13", CubeListBuilder.create().texOffs(144, 179).addBox(3.1F, 13.0F, -2.2F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

		 left_leg.addOrReplaceChild("leftleg14", CubeListBuilder.create().texOffs(226, 63).addBox(3.2F, 13.0F, -2.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

		 left_leg.addOrReplaceChild("leftleg16", CubeListBuilder.create().texOffs(270, 412).addBox(5.21F, 11.8349F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -12.0F, 0.0F, 0.0F, 0.0F, 0.1487F));

		 left_leg.addOrReplaceChild("leftleg36", CubeListBuilder.create().texOffs(253, 433).addBox(5.2011F, 9.7493F, 6.7835F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -12.0F, 0.0F, -0.5236F, 0.0F, 0.1487F));

		 left_leg.addOrReplaceChild("leftleg37", CubeListBuilder.create().texOffs(253, 433).addBox(5.2011F, 9.7493F, -7.7835F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -12.0F, 0.0F, 0.5236F, 0.0F, 0.1487F));

		 left_leg.addOrReplaceChild("leftleg38", CubeListBuilder.create().texOffs(253, 433).addBox(5.2011F, 12.3349F, -1.866F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -12.0F, 0.0F, 0.0F, 0.0F, 0.1487F));

		 left_leg.addOrReplaceChild("leftleg39", CubeListBuilder.create().texOffs(253, 433).addBox(5.2011F, 12.3349F, 0.866F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -12.0F, 0.0F, 0.0F, 0.0F, 0.1487F));

		 left_leg.addOrReplaceChild("leftleg17", CubeListBuilder.create().texOffs(102, 143).addBox(0.0F, 14.0F, 1.21F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

		 left_leg.addOrReplaceChild("leftleg18", CubeListBuilder.create(), PartPose.offset(-2.0F, -12.0F, 0.0F));

		 left_leg.addOrReplaceChild("leftleg19", CubeListBuilder.create().texOffs(102, 2).addBox(2.1F, 13.5F, 1.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

		 left_leg.addOrReplaceChild("leftleg20", CubeListBuilder.create().texOffs(250, 410).addBox(13.24F, 1.6443F, 1.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -12.0F, 0.0F, 0.0F, 0.0F, 1.2204F));

		 left_leg.addOrReplaceChild("leftleg21", CubeListBuilder.create().texOffs(254, 277).addBox(0.0F, 19.0F, -2.21F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

		 left_leg.addOrReplaceChild("leftleg22", CubeListBuilder.create().texOffs(256, 333).addBox(1.0F, 20.0F, -2.3F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

		 left_leg.addOrReplaceChild("leftleg23", CubeListBuilder.create().texOffs(418, 330).addBox(1.0F, 17.0477F, -4.4369F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -12.0F, 0.0F, 0.1115F, 0.0F, 0.0F));

		 left_leg.addOrReplaceChild("leftleg35", CubeListBuilder.create().texOffs(479, 289).addBox(14.1529F, 10.5753F, -3.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -12.0F, 0.0F, 0.1115F, 0.0F, 0.7854F));

		 left_leg.addOrReplaceChild("leftleg41", CubeListBuilder.create().texOffs(479, 289).addBox(-12.3244F, 13.3861F, -3.9148F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -12.0F, 0.0F, 0.1115F, 0.0F, -0.7854F));

		 left_leg.addOrReplaceChild("leftleg42", CubeListBuilder.create().texOffs(479, 289).addBox(-12.3244F, 13.3861F, -3.9148F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.7F, -11.7F, 0.0F, 0.1115F, 0.0F, -0.7854F));

		 left_leg.addOrReplaceChild("leftleg24", CubeListBuilder.create().texOffs(102, 2).addBox(3.2F, 23.0F, -2.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

		 left_leg.addOrReplaceChild("leftleg40", CubeListBuilder.create().texOffs(479, 289).addBox(14.1529F, 10.553F, -3.5987F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -12.0F, 0.0F, 0.1115F, 0.0F, 0.7854F));

		left_leg.addOrReplaceChild("leftleg25", CubeListBuilder.create().texOffs(159, 256).addBox(0.5F, 22.0F, -2.7F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

		 left_leg.addOrReplaceChild("leftleg26", CubeListBuilder.create().texOffs(102, 2).addBox(0.5F, 23.0F, 1.3F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

		 left_leg.addOrReplaceChild("leftleg27", CubeListBuilder.create().texOffs(163, 70).addBox(3.3F, 22.0F, 0.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

		 left_leg.addOrReplaceChild("leftleg28", CubeListBuilder.create().texOffs(115, 2).addBox(3.2F, 18.3F, -2.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

		 left_leg.addOrReplaceChild("leftleg29", CubeListBuilder.create().texOffs(160, 64).addBox(2.3F, 18.3F, 1.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

		 left_leg.addOrReplaceChild("leftleg30", CubeListBuilder.create().texOffs(122, 3).addBox(3.21F, 19.0F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

		 left_leg.addOrReplaceChild("leftleg31", CubeListBuilder.create().texOffs(201, 57).addBox(3.4F, 19.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

		 left_leg.addOrReplaceChild("leftleg32", CubeListBuilder.create().texOffs(250, 450).addBox(6.3559F, 17.3712F, -1.5F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -12.0F, 0.0F, 0.0F, 0.0F, 0.1487F));

		 left_leg.addOrReplaceChild("leftleg33", CubeListBuilder.create().texOffs(141, 52).addBox(1.0F, 21.2F, 1.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

		 left_leg.addOrReplaceChild("leftleg34", CubeListBuilder.create().texOffs(403, 296).addBox(0.0F, 19.0F, 1.3F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

		 left_leg.addOrReplaceChild("leftleg43", CubeListBuilder.create().texOffs(117, 72).addBox(4.204F, 13.3021F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -12.0F, 0.0F, 0.0F, 0.0F, 0.0436F));

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