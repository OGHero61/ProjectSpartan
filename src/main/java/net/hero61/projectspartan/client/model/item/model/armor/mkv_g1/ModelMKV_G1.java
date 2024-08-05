package net.hero61.projectspartan.client.model.item.model.armor.mkv_g1;
// Made with Blockbench 4.10.4
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

public class ModelMKV_G1<T extends LivingEntity> extends HumanoidModel<T> {
	
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation(ProjectSpartan.MOD_ID, "mkv_g1_body"), "main");
	public ModelMKV_G1(ModelPart modelPart) {
		super(modelPart);
	}

	public static LayerDefinition createLayer() {
		MeshDefinition definition = ModelUtils.createBlankHumanoidMesh();
		PartDefinition root = definition.getRoot();
	
		PartDefinition body = root.addOrReplaceChild("body", CubeListBuilder.create().texOffs(16, 16).mirror().addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		 body.addOrReplaceChild("body62", CubeListBuilder.create().texOffs(350, 250).mirror().addBox(-3.5F, 2.5F, -1.9F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.4128F, 0.0F, 0.0F));

		 body.addOrReplaceChild("body61", CubeListBuilder.create().texOffs(350, 250).mirror().addBox(1.5F, 2.5F, -1.9F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.4128F, 0.0F, 0.0F));

		 body.addOrReplaceChild("body60", CubeListBuilder.create().texOffs(350, 350).mirror().addBox(1.5F, -1.0F, 3.15F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2231F, 0.0F, 0.0F));

		 body.addOrReplaceChild("body59", CubeListBuilder.create().texOffs(350, 350).mirror().addBox(-4.5F, -1.0F, 3.15F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2231F, 0.0F, 0.0F));

		 body.addOrReplaceChild("body58", CubeListBuilder.create().texOffs(350, 200).mirror().addBox(-4.5F, -3.3F, 2.1F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2603F, 0.0F, 0.0F));

		 body.addOrReplaceChild("body57", CubeListBuilder.create().texOffs(350, 200).mirror().addBox(1.5F, -3.3F, 2.1F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2603F, 0.0F, 0.0F));

		 body.addOrReplaceChild("body56", CubeListBuilder.create().texOffs(350, 150).mirror().addBox(-4.5F, -2.3F, -1.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.3384F, 0.0F, 0.0F));

		 body.addOrReplaceChild("body55", CubeListBuilder.create().texOffs(350, 150).mirror().addBox(3.5F, -2.3F, -1.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.3384F, 0.0F, 0.0F));

		 body.addOrReplaceChild("body54", CubeListBuilder.create().texOffs(350, 100).mirror().addBox(2.5F, -1.3F, -1.9F, 2.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1859F, 0.0F, 0.0F));

		 body.addOrReplaceChild("body53", CubeListBuilder.create().texOffs(350, 100).mirror().addBox(-4.5F, -1.3F, -1.9F, 2.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1859F, 0.0F, 0.0F));

		 body.addOrReplaceChild("body52", CubeListBuilder.create().texOffs(350, 50).mirror().addBox(-3.7F, 3.5F, 2.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2231F));

		 body.addOrReplaceChild("body51", CubeListBuilder.create().texOffs(350, 50).mirror().addBox(1.7F, 3.5F, 2.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2231F));

		 body.addOrReplaceChild("body50", CubeListBuilder.create().texOffs(350, 0).mirror().addBox(-3.0F, 1.0F, -5.0F, 6.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.4871F, 0.0F, 0.0F));

		 body.addOrReplaceChild("body49", CubeListBuilder.create().texOffs(300, 0).mirror().addBox(-2.0F, 10.5F, 3.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1115F, 0.0F, 0.0F));

		 body.addOrReplaceChild("body48", CubeListBuilder.create().texOffs(0, 150).mirror().addBox(0.5F, 11.0F, -2.7F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		 body.addOrReplaceChild("body47", CubeListBuilder.create().texOffs(300, 50).mirror().addBox(-1.0F, 11.0F, -2.5F, 3.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2602F));

		 body.addOrReplaceChild("body46", CubeListBuilder.create().texOffs(300, 100).mirror().addBox(-2.0F, 11.0F, -2.5F, 3.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2603F));

		 body.addOrReplaceChild("body45", CubeListBuilder.create().texOffs(300, 150).mirror().addBox(-1.0F, 11.0F, -5.3F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1859F, 0.0F, 0.0F));

		 body.addOrReplaceChild("body44", CubeListBuilder.create().texOffs(0, 150).mirror().addBox(-1.5F, 11.0F, -2.7F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		 body.addOrReplaceChild("body43", CubeListBuilder.create().texOffs(300, 200).mirror().addBox(-2.5F, 2.0F, -4.7F, 5.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.4128F, 0.0F, 0.0F));

		 body.addOrReplaceChild("body42", CubeListBuilder.create().texOffs(300, 250).mirror().addBox(-2.0F, 8.0F, 3.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1487F, 0.0F, 0.0F));

		 body.addOrReplaceChild("body41", CubeListBuilder.create().texOffs(0, 100).mirror().addBox(-4.5F, 8.5F, 1.3F, 9.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		 body.addOrReplaceChild("body40", CubeListBuilder.create().texOffs(0, 100).mirror().addBox(-4.5F, 8.5F, -2.4F, 9.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		 body.addOrReplaceChild("body39", CubeListBuilder.create().texOffs(0, 100).mirror().addBox(-4.2F, 8.4F, -2.9F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		 body.addOrReplaceChild("body38", CubeListBuilder.create().texOffs(0, 100).mirror().addBox(2.2F, 8.4F, -2.9F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		 body.addOrReplaceChild("body36", CubeListBuilder.create().texOffs(0, 100).mirror().addBox(-2.1F, 8.4F, -3.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		 body.addOrReplaceChild("body37", CubeListBuilder.create().texOffs(0, 100).mirror().addBox(0.1F, 8.4F, -3.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		 body.addOrReplaceChild("body35", CubeListBuilder.create().texOffs(0, 100).mirror().addBox(-4.2F, 8.6F, -2.7F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		 body.addOrReplaceChild("body34", CubeListBuilder.create().texOffs(0, 100).mirror().addBox(2.2F, 8.6F, -2.7F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		 body.addOrReplaceChild("body33", CubeListBuilder.create().texOffs(0, 100).mirror().addBox(0.1F, 8.6F, -3.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		 body.addOrReplaceChild("body32", CubeListBuilder.create().texOffs(0, 100).mirror().addBox(-2.1F, 8.6F, -3.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		 body.addOrReplaceChild("body31", CubeListBuilder.create().texOffs(250, 500).mirror().addBox(0.1F, 6.7F, -4.7F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2231F, 0.0F, 0.0F));

		 body.addOrReplaceChild("body30", CubeListBuilder.create().texOffs(250, 450).mirror().addBox(-1.1F, 6.7F, -4.7F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2231F, 0.0F, 0.0F));

		 body.addOrReplaceChild("body29", CubeListBuilder.create().texOffs(300, 300).mirror().addBox(6.3F, 2.6F, -2.9F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.041F));

		 body.addOrReplaceChild("body28", CubeListBuilder.create().texOffs(300, 350).mirror().addBox(-8.3F, 2.6F, -2.9F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.041F));

		 body.addOrReplaceChild("body27", CubeListBuilder.create().texOffs(250, 350).mirror().addBox(-1.0F, 6.0F, -4.6F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2231F, 0.0F, 0.0F));

		 body.addOrReplaceChild("body26", CubeListBuilder.create().texOffs(250, 300).mirror().addBox(1.0F, 4.0F, -2.65F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.8726F));

		 body.addOrReplaceChild("body25", CubeListBuilder.create().texOffs(250, 250).mirror().addBox(-2.0F, 4.0F, -2.65F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.8726F));

		 body.addOrReplaceChild("body24", CubeListBuilder.create().texOffs(0, 500).mirror().addBox(-3.1F, 2.0F, -3.1F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.2231F, 0.0F));

		 body.addOrReplaceChild("body23", CubeListBuilder.create().texOffs(0, 450).mirror().addBox(1.1F, 2.0F, -3.1F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.2231F, 0.0F));

		 body.addOrReplaceChild("body22", CubeListBuilder.create().texOffs(250, 200).mirror().addBox(-2.5F, 4.0F, -2.6F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.6495F));

		 body.addOrReplaceChild("body21", CubeListBuilder.create().texOffs(250, 150).mirror().addBox(0.5F, 4.0F, -2.6F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.6495F));

		 body.addOrReplaceChild("body19", CubeListBuilder.create().texOffs(250, 100).mirror().addBox(-2.0F, 3.2F, -4.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3346F, 0.0F, 0.0F));

		 body.addOrReplaceChild("body20", CubeListBuilder.create().texOffs(250, 50).mirror().addBox(1.0F, 3.2F, -4.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3346F, 0.0F, 0.0F));

		 body.addOrReplaceChild("body18", CubeListBuilder.create().texOffs(250, 0).mirror().addBox(-1.5F, 3.2F, -4.45F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3346F, 0.0F, 0.0F));

		 body.addOrReplaceChild("body17", CubeListBuilder.create().texOffs(130, 350).mirror().addBox(-3.5F, 2.5F, -1.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -2.0077F, 0.0F));

		 body.addOrReplaceChild("body16", CubeListBuilder.create().texOffs(130, 350).mirror().addBox(2.5F, 2.5F, -1.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 2.0076F, 0.0F));

		 body.addOrReplaceChild("body15", CubeListBuilder.create().texOffs(200, 350).mirror().addBox(3.7F, 4.3F, -2.5F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2231F));

		 body.addOrReplaceChild("body14", CubeListBuilder.create().texOffs(200, 300).mirror().addBox(-5.7F, 4.3F, -2.5F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2231F));

		 body.addOrReplaceChild("body13", CubeListBuilder.create().texOffs(130, 300).mirror().addBox(-2.0F, -2.3F, -2.6F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.3384F, 0.0F, 0.0F));

		 body.addOrReplaceChild("body12", CubeListBuilder.create().texOffs(200, 250).mirror().addBox(-3.9F, -2.3F, -2.6F, 2.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.3384F, 0.0F, 0.0F));

		 body.addOrReplaceChild("body11", CubeListBuilder.create().texOffs(130, 300).mirror().addBox(1.0F, -2.3F, -2.6F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.3384F, 0.0F, 0.0F));

		 body.addOrReplaceChild("body10", CubeListBuilder.create().texOffs(200, 250).mirror().addBox(1.9F, -2.3F, -2.6F, 2.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.3384F, 0.0F, 0.0F));

		 body.addOrReplaceChild("body9", CubeListBuilder.create().texOffs(0, 150).mirror().addBox(0.5F, 2.0F, -2.8F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		 body.addOrReplaceChild("body8", CubeListBuilder.create().texOffs(0, 150).mirror().addBox(-2.5F, 2.0F, -2.8F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		 body.addOrReplaceChild("body7", CubeListBuilder.create().texOffs(0, 150).mirror().addBox(-1.5F, 2.5F, -3.2F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		 body.addOrReplaceChild("body6", CubeListBuilder.create().texOffs(0, 100).mirror().addBox(3.1F, 0.0F, -2.0F, 1.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		 body.addOrReplaceChild("body5", CubeListBuilder.create().texOffs(0, 100).mirror().addBox(-4.1F, 0.0F, -2.0F, 1.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		 body.addOrReplaceChild("body3", CubeListBuilder.create().texOffs(0, 100).mirror().addBox(-4.0F, 0.0F, 1.1F, 8.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		 body.addOrReplaceChild("body1", CubeListBuilder.create().texOffs(0, 100).mirror().addBox(-4.0F, 0.0F, -2.1F, 8.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition right_arm = root.addOrReplaceChild("right_arm", CubeListBuilder.create().texOffs(40, 16).mirror().addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-5.0F, 2.0F, 0.0F));

		right_arm.addOrReplaceChild("right_arm1", CubeListBuilder.create().texOffs(0, 100).mirror().addBox(-8.0F, 0.0F, -2.1F, 4.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(5.0F, -2.0F, 0.0F));

		right_arm.addOrReplaceChild("right_arm2", CubeListBuilder.create().texOffs(0, 100).mirror().addBox(-8.0F, -0.1F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(5.0F, -2.0F, 0.0F));

		right_arm.addOrReplaceChild("right_arm3", CubeListBuilder.create().texOffs(0, 100).mirror().addBox(-8.0F, 0.0F, 1.1F, 4.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(5.0F, -2.0F, 0.0F));

		right_arm.addOrReplaceChild("right_arm4", CubeListBuilder.create().texOffs(0, 100).mirror().addBox(-8.1F, 3.0F, -2.0F, 1.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(5.0F, -2.0F, 0.0F));

		right_arm.addOrReplaceChild("right_arm5", CubeListBuilder.create().texOffs(0, 100).mirror().addBox(-4.9F, 0.0F, -2.0F, 1.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(5.0F, -2.0F, 0.0F));

		right_arm.addOrReplaceChild("right_arm6", CubeListBuilder.create().texOffs(0, 100).mirror().addBox(-8.0F, 10.1F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(5.0F, -2.0F, 0.0F));

		right_arm.addOrReplaceChild("right_arm7", CubeListBuilder.create().texOffs(0, 150).mirror().addBox(-8.4F, 1.0F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(5.0F, -2.0F, 0.0F));

		right_arm.addOrReplaceChild("right_arm8", CubeListBuilder.create().texOffs(0, 150).mirror().addBox(-8.2F, 1.0F, -2.3F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(5.0F, -2.0F, 0.0F));

		right_arm.addOrReplaceChild("right_arm9", CubeListBuilder.create().texOffs(0, 150).mirror().addBox(-8.2F, 2.0F, 1.3F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(5.0F, -2.0F, 0.0F));

		 right_arm.addOrReplaceChild("right_arm10", CubeListBuilder.create().texOffs(0, 150).mirror().addBox(-8.2F, 0.0F, 1.3F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(5.0F, -2.0F, 0.0F));

		 right_arm.addOrReplaceChild("right_arm11", CubeListBuilder.create().texOffs(0, 200).mirror().addBox(-4.8F, 2.1F, -2.2F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(5.0F, -2.0F, 0.0F));

		 right_arm.addOrReplaceChild("right_arm12", CubeListBuilder.create().texOffs(0, 200).mirror().addBox(-4.8F, 2.1F, 1.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(5.0F, -2.0F, 0.0F));

		 right_arm.addOrReplaceChild("right_arm13", CubeListBuilder.create().texOffs(130, 0).mirror().addBox(-3.8F, -8.11F, -2.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(5.0F, -2.0F, 0.0F, 0.0F, 0.0F, -1.2641F));

		 right_arm.addOrReplaceChild("right_arm14", CubeListBuilder.create().texOffs(200, 0).mirror().addBox(-8.6909F, -2.1255F, -2.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(5.0F, -2.0F, 0.0F, 0.0F, 0.0F, -0.3718F));

		 right_arm.addOrReplaceChild("right_arm15", CubeListBuilder.create().texOffs(200, 0).mirror().addBox(-8.6987F, -2.1318F, 1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(5.0F, -2.0F, 0.0F, 0.0F, 0.0F, -0.3718F));

		 right_arm.addOrReplaceChild("right_arm16", CubeListBuilder.create().texOffs(0, 150).mirror().addBox(-8.6F, 0.3F, -1.5F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(5.0F, -2.0F, 0.0F));

		 right_arm.addOrReplaceChild("right_arm17", CubeListBuilder.create().texOffs(130, 50).mirror().addBox(-7.5F, 0.6F, -2.8F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(5.0F, -2.0F, 0.0F, 0.1487F, 0.0F, 0.0F));

		 right_arm.addOrReplaceChild("right_arm18", CubeListBuilder.create().texOffs(0, 150).mirror().addBox(-8.2F, 5.0F, -2.3F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(5.0F, -2.0F, 0.0F));

		 right_arm.addOrReplaceChild("right_arm19", CubeListBuilder.create().texOffs(0, 150).mirror().addBox(-4.8F, 5.0F, -2.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(5.0F, -2.0F, 0.0F));

		 right_arm.addOrReplaceChild("right_arm20", CubeListBuilder.create().texOffs(0, 150).mirror().addBox(-7.8F, 5.0F, 1.2F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(5.0F, -2.0F, 0.0F));

		 right_arm.addOrReplaceChild("right_arm21", CubeListBuilder.create().texOffs(130, 100).mirror().addBox(-8.3F, 4.05F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(4.0F, -2.0F, 0.0F, 0.0F, 0.0F, -0.1222F));

		 right_arm.addOrReplaceChild("right_arm22", CubeListBuilder.create().texOffs(130, 500).mirror().addBox(-5.45F, 6.65F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -5.0F, 0.0F, 0.0F, 0.0F, -0.192F));

		 right_arm.addOrReplaceChild("right_arm23", CubeListBuilder.create().texOffs(0, 200).mirror().addBox(-8.2F, 8.0F, -2.2F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(5.0F, -2.0F, 0.0F));

		 right_arm.addOrReplaceChild("right_arm24", CubeListBuilder.create().texOffs(0, 200).mirror().addBox(-4.85F, 8.0F, -2.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(5.0F, -2.0F, 0.0F));

		 right_arm.addOrReplaceChild("right_arm25", CubeListBuilder.create().texOffs(0, 200).mirror().addBox(-4.7F, 6.1F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(5.0F, -2.0F, 0.0F));

		 right_arm.addOrReplaceChild("right_arm26", CubeListBuilder.create().texOffs(0, 200).mirror().addBox(-7.85F, 8.0F, 1.15F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(5.0F, -2.0F, 0.0F));

		 right_arm.addOrReplaceChild("right_arm27", CubeListBuilder.create().texOffs(0, 200).mirror().addBox(-8.2F, 8.0F, 1.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(5.0F, -2.0F, 0.0F));

		 right_arm.addOrReplaceChild("right_arm28", CubeListBuilder.create().texOffs(130, 150).mirror().addBox(-8.6F, 8.5F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(4.0F, -2.0F, 0.0F, 0.0F, 0.0F, -0.1115F));

		 right_arm.addOrReplaceChild("right_arm29", CubeListBuilder.create().texOffs(200, 500).mirror().addBox(-8.4F, 10.3F, -1.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(4.0F, -2.0F, 0.0F, 0.0F, 0.0F, -0.1115F));

		 right_arm.addOrReplaceChild("right_arm30", CubeListBuilder.create().texOffs(0, 200).mirror().addBox(-5.5F, 10.2F, -2.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(5.0F, -2.0F, 0.0F));

		 right_arm.addOrReplaceChild("right_arm32", CubeListBuilder.create().texOffs(0, 200).mirror().addBox(-4.7F, 5.2F, 0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(5.0F, -2.0F, 0.0F));

		 right_arm.addOrReplaceChild("right_arm33", CubeListBuilder.create().texOffs(0, 200).mirror().addBox(-4.7F, 5.2F, -1.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(5.0F, -2.0F, 0.0F));

		 right_arm.addOrReplaceChild("right_arm34", CubeListBuilder.create().texOffs(50, 500).mirror().addBox(-4.1F, 6.2F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(5.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0744F));

		 right_arm.addOrReplaceChild("right_arm35", CubeListBuilder.create().texOffs(0, 150).mirror().addBox(-4.8F, 5.1F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(5.0F, -2.0F, 0.0F));

		 right_arm.addOrReplaceChild("right_arm36", CubeListBuilder.create().texOffs(0, 200).mirror().addBox(-7.75F, 5.2F, -2.4F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(5.0F, -2.0F, 0.0F));

		 right_arm.addOrReplaceChild("right_arm37", CubeListBuilder.create().texOffs(0, 200).mirror().addBox(-7.75F, 5.2F, 1.3F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(5.0F, -2.0F, 0.0F));

		 right_arm.addOrReplaceChild("right_arm38", CubeListBuilder.create().texOffs(0, 150).mirror().addBox(-8.2F, 5.0F, 1.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(5.0F, -2.0F, 0.0F));

		 right_arm.addOrReplaceChild("right_arm31", CubeListBuilder.create().texOffs(130, 200).mirror().addBox(-4.4F, -2.0F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.0F, -2.0F, 0.0F, 0.0F, 0.0F, -1.2641F));

		PartDefinition left_arm = root.addOrReplaceChild("left_arm", CubeListBuilder.create().texOffs(40, 16).mirror().addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(5.0F, 2.0F, 0.0F));

		left_arm.addOrReplaceChild("left_arm1", CubeListBuilder.create().texOffs(0, 100).mirror().addBox(4.0F, -0.1F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-5.0F, -2.0F, 0.0F));

		left_arm.addOrReplaceChild("left_arm2", CubeListBuilder.create().texOffs(0, 100).mirror().addBox(4.0F, 0.0F, -2.1F, 4.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-5.0F, -2.0F, 0.0F));

		left_arm.addOrReplaceChild("left_arm3", CubeListBuilder.create().texOffs(0, 100).mirror().addBox(3.9F, 0.0F, -2.0F, 1.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-5.0F, -2.0F, 0.0F));

		left_arm.addOrReplaceChild("left_arm4", CubeListBuilder.create().texOffs(0, 100).mirror().addBox(7.1F, 3.0F, -2.0F, 1.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-5.0F, -2.0F, 0.0F));

		left_arm.addOrReplaceChild("left_arm5", CubeListBuilder.create().texOffs(0, 150).mirror().addBox(4.2F, 2.0F, -2.3F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-5.0F, -2.0F, 0.0F));

		left_arm.addOrReplaceChild("left_arm6", CubeListBuilder.create().texOffs(0, 150).mirror().addBox(7.4F, 2.0F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-5.0F, -2.0F, 0.0F));

		left_arm.addOrReplaceChild("left_arm7", CubeListBuilder.create().texOffs(0, 150).mirror().addBox(6.2F, 1.0F, 1.3F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-5.0F, -2.0F, 0.0F));

		left_arm.addOrReplaceChild("left_arm8", CubeListBuilder.create().texOffs(0, 150).mirror().addBox(4.2F, 3.0F, 1.3F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-5.0F, -2.0F, 0.0F));

		left_arm.addOrReplaceChild("left_arm9", CubeListBuilder.create().texOffs(0, 200).mirror().addBox(3.8F, 3.1F, -2.2F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-5.0F, -2.0F, 0.0F));

		 left_arm.addOrReplaceChild("left_arm10", CubeListBuilder.create().texOffs(0, 200).mirror().addBox(3.8F, 3.1F, 1.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-5.0F, -2.0F, 0.0F));

		 left_arm.addOrReplaceChild("left_arm11", CubeListBuilder.create().texOffs(130, 50).mirror().addBox(5.5F, 1.5779F, -3.0963F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.0F, -2.0F, 0.0F, 0.1487F, 0.0F, 0.0F));

		 left_arm.addOrReplaceChild("left_arm12", CubeListBuilder.create().texOffs(0, 150).mirror().addBox(7.6F, 1.3F, -1.5F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-5.0F, -2.0F, 0.0F));

		 left_arm.addOrReplaceChild("left_arm13", CubeListBuilder.create().texOffs(200, 50).mirror().addBox(7.785F, -1.8531F, 1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.3718F));

		 left_arm.addOrReplaceChild("left_arm14", CubeListBuilder.create().texOffs(200, 50).mirror().addBox(7.785F, -1.8531F, -2.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.3718F));

		 left_arm.addOrReplaceChild("left_arm15", CubeListBuilder.create().texOffs(200, 100).mirror().addBox(2.1163F, -7.9628F, -2.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.0F, -2.0F, 0.0F, 0.0F, 0.0F, 1.2641F));

		 left_arm.addOrReplaceChild("left_arm16", CubeListBuilder.create().texOffs(200, 150).mirror().addBox(1.7163F, -7.9628F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.0F, -2.0F, 0.0F, 0.0F, 0.0F, 1.2641F));

		 left_arm.addOrReplaceChild("left_arm17", CubeListBuilder.create().texOffs(0, 150).mirror().addBox(4.2F, 6.0F, -2.3F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-5.0F, -2.0F, 0.0F));

		 left_arm.addOrReplaceChild("left_arm18", CubeListBuilder.create().texOffs(0, 150).mirror().addBox(3.8F, 6.0F, 1.2F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-5.0F, -2.0F, 0.0F));

		 left_arm.addOrReplaceChild("left_arm19", CubeListBuilder.create().texOffs(0, 150).mirror().addBox(3.8F, 6.0F, -2.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-5.0F, -2.0F, 0.0F));

		 left_arm.addOrReplaceChild("left_arm20", CubeListBuilder.create().texOffs(0, 150).mirror().addBox(3.8F, 6.1F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-5.0F, -2.0F, 0.0F));

		 left_arm.addOrReplaceChild("left_arm21", CubeListBuilder.create().texOffs(0, 200).mirror().addBox(3.7F, 7.1F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-5.0F, -2.0F, 0.0F));

		 left_arm.addOrReplaceChild("left_arm22", CubeListBuilder.create().texOffs(0, 200).mirror().addBox(3.7F, 6.2F, -1.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-5.0F, -2.0F, 0.0F));

		 left_arm.addOrReplaceChild("left_arm23", CubeListBuilder.create().texOffs(0, 200).mirror().addBox(3.7F, 6.2F, 0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-5.0F, -2.0F, 0.0F));

		 left_arm.addOrReplaceChild("left_arm24", CubeListBuilder.create().texOffs(50, 450).mirror().addBox(2.8876F, 7.5659F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.0F, -2.0F, 0.0F, 0.0F, 0.0F, -0.0744F));

		 left_arm.addOrReplaceChild("left_arm25", CubeListBuilder.create().texOffs(0, 100).mirror().addBox(4.0F, 11.1F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-5.0F, -2.0F, 0.0F));

		 left_arm.addOrReplaceChild("left_arm26", CubeListBuilder.create().texOffs(0, 200).mirror().addBox(4.2F, 9.0F, -2.2F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-5.0F, -2.0F, 0.0F));

		 left_arm.addOrReplaceChild("left_arm27", CubeListBuilder.create().texOffs(0, 200).mirror().addBox(3.85F, 9.0F, -2.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-5.0F, -2.0F, 0.0F));

		 left_arm.addOrReplaceChild("left_arm28", CubeListBuilder.create().texOffs(0, 200).mirror().addBox(3.85F, 9.0F, 1.15F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-5.0F, -2.0F, 0.0F));

		 left_arm.addOrReplaceChild("left_arm29", CubeListBuilder.create().texOffs(0, 200).mirror().addBox(7.2F, 9.0F, 1.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-5.0F, -2.0F, 0.0F));

		 left_arm.addOrReplaceChild("left_arm30", CubeListBuilder.create().texOffs(0, 150).mirror().addBox(7.2F, 6.0F, 1.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-5.0F, -2.0F, 0.0F));

		 left_arm.addOrReplaceChild("left_arm31", CubeListBuilder.create().texOffs(130, 250).mirror().addBox(8.4065F, 4.8757F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.1222F));

		 left_arm.addOrReplaceChild("left_arm32", CubeListBuilder.create().texOffs(130, 450).mirror().addBox(8.9898F, 3.7092F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.192F));

		 left_arm.addOrReplaceChild("left_arm33", CubeListBuilder.create().texOffs(0, 200).mirror().addBox(3.75F, 6.2F, -2.4F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-5.0F, -2.0F, 0.0F));

		 left_arm.addOrReplaceChild("left_arm34", CubeListBuilder.create().texOffs(0, 200).mirror().addBox(3.75F, 6.2F, 1.3F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-5.0F, -2.0F, 0.0F));

		 left_arm.addOrReplaceChild("left_arm35", CubeListBuilder.create().texOffs(200, 200).mirror().addBox(8.5916F, 8.531F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.1115F));

		 left_arm.addOrReplaceChild("left_arm36", CubeListBuilder.create().texOffs(200, 450).mirror().addBox(7.4416F, 10.331F, -1.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.1115F));

		 left_arm.addOrReplaceChild("left_arm37", CubeListBuilder.create().texOffs(0, 200).mirror().addBox(4.5F, 11.2F, -2.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-5.0F, -2.0F, 0.0F));

		 left_arm.addOrReplaceChild("left_arm38", CubeListBuilder.create().texOffs(0, 100).mirror().addBox(4.0F, 0.0F, 1.1F, 4.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-5.0F, -2.0F, 0.0F));

		PartDefinition right_leg = root.addOrReplaceChild("right_leg", CubeListBuilder.create().texOffs(0, 16).mirror().addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-2.0F, 12.0F, 0.0F));

		right_leg.addOrReplaceChild("right_leg1", CubeListBuilder.create().texOffs(0, 100).mirror().addBox(-4.0F, 12.0F, -2.1F, 4.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		right_leg.addOrReplaceChild("right_leg2", CubeListBuilder.create().texOffs(0, 100).mirror().addBox(-4.0F, 12.0F, 1.1F, 4.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		right_leg.addOrReplaceChild("right_leg3", CubeListBuilder.create().texOffs(0, 100).mirror().addBox(-4.1F, 12.0F, -2.0F, 1.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		right_leg.addOrReplaceChild("right_leg4", CubeListBuilder.create().texOffs(0, 100).mirror().addBox(-0.9F, 12.0F, -2.0F, 1.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		right_leg.addOrReplaceChild("right_leg5", CubeListBuilder.create().texOffs(0, 150).mirror().addBox(-3.3F, 14.0F, -2.3F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		right_leg.addOrReplaceChild("right_leg6", CubeListBuilder.create().texOffs(0, 150).mirror().addBox(-3.3F, 14.0F, 0.3F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		right_leg.addOrReplaceChild("right_leg7", CubeListBuilder.create().texOffs(0, 150).mirror().addBox(-4.3F, 12.7F, -2.3F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		right_leg.addOrReplaceChild("right_leg8", CubeListBuilder.create().texOffs(0, 150).mirror().addBox(-4.3F, 12.7F, 0.3F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		right_leg.addOrReplaceChild("right_leg9", CubeListBuilder.create().texOffs(350, 300).mirror().addBox(-3.0F, 16.9254F, -4.5357F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.0F, -12.0F, 0.0F, 0.1115F, 0.0F, 0.0F));

		 right_leg.addOrReplaceChild("right_leg10", CubeListBuilder.create().texOffs(0, 200).mirror().addBox(-2.3F, 13.5F, -2.2F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		 right_leg.addOrReplaceChild("right_leg11", CubeListBuilder.create().texOffs(0, 200).mirror().addBox(-2.3F, 13.5F, 1.2F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		 right_leg.addOrReplaceChild("right_leg12", CubeListBuilder.create().texOffs(0, 200).mirror().addBox(-0.8F, 13.8F, -2.2F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		 right_leg.addOrReplaceChild("right_leg13", CubeListBuilder.create().texOffs(0, 200).mirror().addBox(-0.8F, 13.8F, 0.2F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		 right_leg.addOrReplaceChild("right_leg14", CubeListBuilder.create().texOffs(0, 150).mirror().addBox(-4.2F, 14.7F, -2.2F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		 right_leg.addOrReplaceChild("right_leg15", CubeListBuilder.create().texOffs(0, 150).mirror().addBox(-4.2F, 14.7F, 0.2F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		 right_leg.addOrReplaceChild("right_leg16", CubeListBuilder.create().texOffs(0, 150).mirror().addBox(-3.0F, 19.5F, -2.5F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		 right_leg.addOrReplaceChild("right_leg17", CubeListBuilder.create().texOffs(0, 150).mirror().addBox(-4.4F, 19.5F, -2.4F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		 right_leg.addOrReplaceChild("right_leg18", CubeListBuilder.create().texOffs(0, 150).mirror().addBox(-1.6F, 19.5F, -2.4F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		 right_leg.addOrReplaceChild("right_leg19", CubeListBuilder.create().texOffs(0, 150).mirror().addBox(-1.6F, 19.5F, 0.4F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		 right_leg.addOrReplaceChild("right_leg20", CubeListBuilder.create().texOffs(0, 150).mirror().addBox(-4.4F, 19.5F, 0.4F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		 right_leg.addOrReplaceChild("right_leg21", CubeListBuilder.create().texOffs(0, 150).mirror().addBox(-0.7F, 18.5F, -1.9F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		 right_leg.addOrReplaceChild("right_leg22", CubeListBuilder.create().texOffs(0, 150).mirror().addBox(-4.3F, 18.5F, -1.9F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		 right_leg.addOrReplaceChild("right_leg23", CubeListBuilder.create().texOffs(0, 200).mirror().addBox(-1.7F, 19.7F, -2.3F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		 right_leg.addOrReplaceChild("right_leg24", CubeListBuilder.create().texOffs(0, 200).mirror().addBox(-1.7F, 20.0F, 0.3F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		 right_leg.addOrReplaceChild("right_leg25", CubeListBuilder.create().texOffs(0, 200).mirror().addBox(-4.2F, 20.0F, 0.3F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		 right_leg.addOrReplaceChild("right_leg26", CubeListBuilder.create().texOffs(0, 200).mirror().addBox(-1.8F, 20.6F, 0.2F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		 right_leg.addOrReplaceChild("right_leg27", CubeListBuilder.create().texOffs(0, 200).mirror().addBox(-4.2F, 20.6F, 0.2F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		 right_leg.addOrReplaceChild("right_leg28", CubeListBuilder.create().texOffs(0, 200).mirror().addBox(-4.3F, 19.7F, -2.3F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		 right_leg.addOrReplaceChild("right_leg29", CubeListBuilder.create().texOffs(0, 150).mirror().addBox(-4.4F, 12.7F, -1.0F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		 right_leg.addOrReplaceChild("right_leg30", CubeListBuilder.create().texOffs(0, 150).mirror().addBox(-3.5F, 23.0F, -2.8F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		 right_leg.addOrReplaceChild("right_leg31", CubeListBuilder.create().texOffs(0, 150).mirror().addBox(-3.5F, 22.8F, -2.8F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		 right_leg.addOrReplaceChild("right_leg32", CubeListBuilder.create().texOffs(0, 150).mirror().addBox(-4.2F, 23.0F, -2.3F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		 right_leg.addOrReplaceChild("right_leg33", CubeListBuilder.create().texOffs(0, 150).mirror().addBox(-0.8F, 23.0F, -2.3F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		 right_leg.addOrReplaceChild("right_leg34", CubeListBuilder.create().texOffs(0, 150).mirror().addBox(-1.8F, 23.0F, 1.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		 right_leg.addOrReplaceChild("right_leg35", CubeListBuilder.create().texOffs(0, 150).mirror().addBox(-4.2F, 23.0F, 1.2F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		 right_leg.addOrReplaceChild("right_leg36", CubeListBuilder.create().texOffs(0, 150).mirror().addBox(-0.7F, 16.0F, -2.3F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		 right_leg.addOrReplaceChild("right_leg37", CubeListBuilder.create().texOffs(0, 150).mirror().addBox(-0.7F, 16.0F, 0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		PartDefinition left_leg = root.addOrReplaceChild("left_leg", CubeListBuilder.create().texOffs(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, 12.0F, 0.0F));

		left_leg.addOrReplaceChild("left_leg1", CubeListBuilder.create().texOffs(0, 100).mirror().addBox(0.0F, 12.0F, -2.1F, 4.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-2.0F, -12.0F, 0.0F));

		left_leg.addOrReplaceChild("left_leg2", CubeListBuilder.create().texOffs(0, 100).mirror().addBox(0.0F, 12.0F, 1.1F, 4.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-2.0F, -12.0F, 0.0F));

		left_leg.addOrReplaceChild("left_leg3", CubeListBuilder.create().texOffs(0, 100).mirror().addBox(-0.1F, 12.0F, -2.0F, 1.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-2.0F, -12.0F, 0.0F));

		left_leg.addOrReplaceChild("left_leg4", CubeListBuilder.create().texOffs(0, 100).mirror().addBox(3.1F, 12.0F, -2.0F, 1.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-2.0F, -12.0F, 0.0F));

		left_leg.addOrReplaceChild("left_leg5", CubeListBuilder.create().texOffs(0, 150).mirror().addBox(0.3F, 14.0F, -2.3F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-2.0F, -12.0F, 0.0F));

		left_leg.addOrReplaceChild("left_leg6", CubeListBuilder.create().texOffs(0, 150).mirror().addBox(0.3F, 14.0F, 0.3F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-2.0F, -12.0F, 0.0F));

		left_leg.addOrReplaceChild("left_leg7", CubeListBuilder.create().texOffs(0, 150).mirror().addBox(2.3F, 12.7F, -2.3F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-2.0F, -12.0F, 0.0F));

		left_leg.addOrReplaceChild("left_leg8", CubeListBuilder.create().texOffs(0, 150).mirror().addBox(2.3F, 12.7F, 0.3F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-2.0F, -12.0F, 0.0F));

		left_leg.addOrReplaceChild("left_leg9", CubeListBuilder.create().texOffs(350, 300).mirror().addBox(1.0F, 16.9254F, -4.5357F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -12.0F, 0.0F, 0.1115F, 0.0F, 0.0F));

		 left_leg.addOrReplaceChild("left_leg10", CubeListBuilder.create().texOffs(0, 200).mirror().addBox(0.3F, 13.5F, -2.2F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-2.0F, -12.0F, 0.0F));

		 left_leg.addOrReplaceChild("left_leg11", CubeListBuilder.create().texOffs(0, 200).mirror().addBox(0.3F, 13.5F, 1.2F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-2.0F, -12.0F, 0.0F));

		 left_leg.addOrReplaceChild("left_leg12", CubeListBuilder.create().texOffs(0, 200).mirror().addBox(-0.2F, 13.8F, -2.2F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-2.0F, -12.0F, 0.0F));

		 left_leg.addOrReplaceChild("left_leg13", CubeListBuilder.create().texOffs(0, 200).mirror().addBox(-0.2F, 13.8F, 0.2F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-2.0F, -12.0F, 0.0F));

		 left_leg.addOrReplaceChild("left_leg14", CubeListBuilder.create().texOffs(0, 150).mirror().addBox(3.2F, 14.7F, -2.2F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-2.0F, -12.0F, 0.0F));

		 left_leg.addOrReplaceChild("left_leg15", CubeListBuilder.create().texOffs(0, 150).mirror().addBox(3.2F, 14.7F, 0.2F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-2.0F, -12.0F, 0.0F));

		 left_leg.addOrReplaceChild("left_leg16", CubeListBuilder.create().texOffs(0, 150).mirror().addBox(1.0F, 19.5F, -2.5F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-2.0F, -12.0F, 0.0F));

		 left_leg.addOrReplaceChild("left_leg17", CubeListBuilder.create().texOffs(0, 150).mirror().addBox(-0.4F, 19.5F, -2.4F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-2.0F, -12.0F, 0.0F));

		 left_leg.addOrReplaceChild("left_leg18", CubeListBuilder.create().texOffs(0, 150).mirror().addBox(2.4F, 19.5F, -2.4F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-2.0F, -12.0F, 0.0F));

		 left_leg.addOrReplaceChild("left_leg19", CubeListBuilder.create().texOffs(0, 150).mirror().addBox(2.4F, 19.5F, 0.4F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-2.0F, -12.0F, 0.0F));

		 left_leg.addOrReplaceChild("left_leg20", CubeListBuilder.create().texOffs(0, 150).mirror().addBox(-0.4F, 19.5F, 0.4F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-2.0F, -12.0F, 0.0F));

		 left_leg.addOrReplaceChild("left_leg21", CubeListBuilder.create().texOffs(0, 150).mirror().addBox(3.3F, 18.5F, -1.9F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-2.0F, -12.0F, 0.0F));

		 left_leg.addOrReplaceChild("left_leg22", CubeListBuilder.create().texOffs(0, 150).mirror().addBox(-0.3F, 18.5F, -1.9F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-2.0F, -12.0F, 0.0F));

		 left_leg.addOrReplaceChild("left_leg23", CubeListBuilder.create().texOffs(0, 200).mirror().addBox(2.3F, 19.7F, -2.3F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-2.0F, -12.0F, 0.0F));

		 left_leg.addOrReplaceChild("left_leg24", CubeListBuilder.create().texOffs(0, 200).mirror().addBox(2.3F, 20.0F, 0.3F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-2.0F, -12.0F, 0.0F));

		 left_leg.addOrReplaceChild("left_leg25", CubeListBuilder.create().texOffs(0, 200).mirror().addBox(-0.2F, 20.0F, 0.3F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-2.0F, -12.0F, 0.0F));

		 left_leg.addOrReplaceChild("left_leg26", CubeListBuilder.create().texOffs(0, 200).mirror().addBox(2.2F, 20.6F, 0.2F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-2.0F, -12.0F, 0.0F));

		 left_leg.addOrReplaceChild("left_leg27", CubeListBuilder.create().texOffs(0, 200).mirror().addBox(-0.2F, 20.6F, 0.2F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-2.0F, -12.0F, 0.0F));

		 left_leg.addOrReplaceChild("left_leg28", CubeListBuilder.create().texOffs(0, 200).mirror().addBox(-0.3F, 19.7F, -2.3F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-2.0F, -12.0F, 0.0F));

		 left_leg.addOrReplaceChild("left_leg29", CubeListBuilder.create().texOffs(0, 150).mirror().addBox(3.4F, 12.7F, -1.0F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-2.0F, -12.0F, 0.0F));

		 left_leg.addOrReplaceChild("left_leg30", CubeListBuilder.create().texOffs(0, 150).mirror().addBox(0.5F, 23.0F, -2.8F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-2.0F, -12.0F, 0.0F));

		 left_leg.addOrReplaceChild("left_leg31", CubeListBuilder.create().texOffs(0, 150).mirror().addBox(0.5F, 22.8F, -2.8F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-2.0F, -12.0F, 0.0F));

		 left_leg.addOrReplaceChild("left_leg32", CubeListBuilder.create().texOffs(0, 150).mirror().addBox(-0.2F, 23.0F, -2.3F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-2.0F, -12.0F, 0.0F));

		 left_leg.addOrReplaceChild("left_leg33", CubeListBuilder.create().texOffs(0, 150).mirror().addBox(3.2F, 23.0F, -2.3F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-2.0F, -12.0F, 0.0F));

		 left_leg.addOrReplaceChild("left_leg34", CubeListBuilder.create().texOffs(0, 150).mirror().addBox(2.2F, 23.0F, 1.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-2.0F, -12.0F, 0.0F));

		 left_leg.addOrReplaceChild("left_leg35", CubeListBuilder.create().texOffs(0, 150).mirror().addBox(-0.2F, 23.0F, 1.2F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-2.0F, -12.0F, 0.0F));

		 left_leg.addOrReplaceChild("left_leg36", CubeListBuilder.create().texOffs(0, 150).mirror().addBox(-0.3F, 16.0F, -2.3F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-2.0F, -12.0F, 0.0F));

		 left_leg.addOrReplaceChild("left_leg37", CubeListBuilder.create().texOffs(0, 150).mirror().addBox(-0.3F, 16.0F, 0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-2.0F, -12.0F, 0.0F));

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