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

public class ModelMKV_G1_Helmet<T extends LivingEntity> extends HumanoidModel<T> {

	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation(ProjectSpartan.MOD_ID, "mkv_g1_helmet"), "main");
	public ModelMKV_G1_Helmet(ModelPart modelPart) {
		super(modelPart);
	}

	public static LayerDefinition createLayer() {
		MeshDefinition definition = ModelUtils.createBlankHumanoidMesh();
		PartDefinition root = definition.getRoot();
	
		PartDefinition head = root.addOrReplaceChild("head", CubeListBuilder.create().texOffs(137, 442).mirror().addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		 head.addOrReplaceChild("head1", CubeListBuilder.create().texOffs(400, 0).mirror().addBox(-2.0F, -3.2F, -4.6F, 4.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1859F, 0.0F, 0.0F));
	
	 	 head.addOrReplaceChild("head63", CubeListBuilder.create().texOffs(0, 200).mirror().addBox(-4.2F, -6.9F, -2.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));
 	
	 	 head.addOrReplaceChild("head61", CubeListBuilder.create().texOffs(50, 300).mirror().addBox(3.1F, -6.5F, -4.0F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));
 	
	 	 head.addOrReplaceChild("head60", CubeListBuilder.create().texOffs(50, 300).mirror().addBox(-4.1F, -6.5F, -4.0F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));
 	
	 	 head.addOrReplaceChild("head62", CubeListBuilder.create().texOffs(0, 200).mirror().addBox(3.2F, -6.9F, -2.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));
 	
	 	 head.addOrReplaceChild("head59", CubeListBuilder.create().texOffs(50, 300).mirror().addBox(-4.0F, -3.9F, -4.6F, 8.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));
 	
	 	 head.addOrReplaceChild("head58", CubeListBuilder.create().texOffs(50, 300).mirror().addBox(0.9F, -3.9F, -4.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));
 	
	 	 head.addOrReplaceChild("head57", CubeListBuilder.create().texOffs(50, 300).mirror().addBox(-1.9F, -3.9F, -4.8F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));
 	
	 	 head.addOrReplaceChild("head56", CubeListBuilder.create().texOffs(50, 350).mirror().addBox(-4.0F, -6.1F, -5.1F, 8.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1487F, 0.0F, 0.0F));
 	
	 	 head.addOrReplaceChild("head55", CubeListBuilder.create().texOffs(0, 350).mirror().addBox(-2.5F, -6.6F, -5.3F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1487F, 0.0F, 0.0F));
 	
	 	 head.addOrReplaceChild("head54", CubeListBuilder.create().texOffs(0, 300).mirror().addBox(-2.0F, -5.1F, -5.3F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1487F, 0.0F, 0.0F));
 	
	 	 head.addOrReplaceChild("head53", CubeListBuilder.create().texOffs(0, 200).mirror().addBox(-4.1F, -0.9F, -4.0F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));
 	
	 	 head.addOrReplaceChild("head52", CubeListBuilder.create().texOffs(0, 200).mirror().addBox(-4.1F, -3.0F, -0.8F, 2.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));
 	
	 	 head.addOrReplaceChild("head51", CubeListBuilder.create().texOffs(0, 200).mirror().addBox(-2.9F, -3.0F, -0.8F, 7.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));
 	
	 	 head.addOrReplaceChild("head50", CubeListBuilder.create().texOffs(0, 200).mirror().addBox(-2.7F, -5.6F, 0.0F, 7.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));
 	
	 	 head.addOrReplaceChild("head49", CubeListBuilder.create().texOffs(0, 200).mirror().addBox(-4.3F, -5.6F, 0.0F, 2.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));
 	
	 	 head.addOrReplaceChild("head48", CubeListBuilder.create().texOffs(450, 350).mirror().addBox(-6.3F, -6.3F, 3.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.2641F));
 	
	 	 head.addOrReplaceChild("head47", CubeListBuilder.create().texOffs(450, 350).mirror().addBox(5.3F, -6.3F, 3.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.2641F));
 	
	 	 head.addOrReplaceChild("head46", CubeListBuilder.create().texOffs(450, 200).mirror().addBox(-4.0F, -9.0F, -0.4F, 8.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3718F, 0.0F, 0.0F));
 	
	 	 head.addOrReplaceChild("head45", CubeListBuilder.create().texOffs(450, 250).mirror().addBox(-3.5F, -6.8F, 3.5F, 7.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2231F, 0.0F, 0.0F));
 	
	 	 head.addOrReplaceChild("head44", CubeListBuilder.create().texOffs(0, 150).mirror().addBox(-3.0F, -9.3F, -0.4F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3718F, 0.0F, 0.0F));
 	
	 	 head.addOrReplaceChild("head43", CubeListBuilder.create().texOffs(450, 300).mirror().addBox(-1.5F, -9.7F, -1.7F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3718F, 0.0F, 0.0F));
 	
	 	 head.addOrReplaceChild("head42", CubeListBuilder.create().texOffs(450, 150).mirror().addBox(-5.0F, -3.7F, -0.8F, 10.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1487F, 0.0F, 0.0F));
 	
	 	 head.addOrReplaceChild("head41", CubeListBuilder.create().texOffs(0, 200).mirror().addBox(-4.3F, -3.8F, -3.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));
 	
	 	 head.addOrReplaceChild("head40", CubeListBuilder.create().texOffs(0, 200).mirror().addBox(3.3F, -3.8F, -3.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));
 	
	 	 head.addOrReplaceChild("head39", CubeListBuilder.create().texOffs(0, 200).mirror().addBox(-4.2F, -6.4F, -1.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));
 	
	 	 head.addOrReplaceChild("head38", CubeListBuilder.create().texOffs(0, 200).mirror().addBox(3.2F, -6.4F, -1.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));
 	
	 	 head.addOrReplaceChild("head37", CubeListBuilder.create().texOffs(0, 200).mirror().addBox(-1.5F, -7.4F, -4.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));
 	
	 	 head.addOrReplaceChild("head36", CubeListBuilder.create().texOffs(0, 200).mirror().addBox(-3.5F, -7.7F, -4.4F, 7.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));
 	
	 	 head.addOrReplaceChild("head35", CubeListBuilder.create().texOffs(0, 200).mirror().addBox(3.2F, -7.4F, -4.4F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));
 	
	 	 head.addOrReplaceChild("head34", CubeListBuilder.create().texOffs(0, 200).mirror().addBox(-4.2F, -7.4F, -4.4F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));
 	
	 	 head.addOrReplaceChild("head33", CubeListBuilder.create().texOffs(450, 500).mirror().addBox(-5.5F, -8.0F, -4.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3346F, 0.0F));
 	
	 	 head.addOrReplaceChild("head32", CubeListBuilder.create().texOffs(450, 500).mirror().addBox(4.5F, -8.0F, -4.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3346F, 0.0F));
 	
	 	 head.addOrReplaceChild("head31", CubeListBuilder.create().texOffs(0, 150).mirror().addBox(-4.4F, -8.0F, -4.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));
 	
	 	 head.addOrReplaceChild("head30", CubeListBuilder.create().texOffs(0, 150).mirror().addBox(3.4F, -8.0F, -4.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));
 	
	 	 head.addOrReplaceChild("head29", CubeListBuilder.create().texOffs(450, 450).mirror().addBox(1.7F, -8.6F, -5.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.1487F));
 	
	 	 head.addOrReplaceChild("head28", CubeListBuilder.create().texOffs(400, 450).mirror().addBox(-2.7F, -8.6F, -5.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1487F));
 	
	 	 head.addOrReplaceChild("head27", CubeListBuilder.create().texOffs(0, 200).mirror().addBox(-3.3F, -8.1F, -5.8F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));
 	
	 	 head.addOrReplaceChild("head26", CubeListBuilder.create().texOffs(0, 200).mirror().addBox(1.3F, -8.1F, -5.8F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));
 	
	 	 head.addOrReplaceChild("head24", CubeListBuilder.create().texOffs(400, 500).mirror().addBox(1.3F, 2.2F, -9.4F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.3756F, 0.0F, 0.0F));
 	
	 	 head.addOrReplaceChild("head25", CubeListBuilder.create().texOffs(400, 500).mirror().addBox(-3.3F, 2.2F, -9.4F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.3756F, 0.0F, 0.0F));
 	
	 	 head.addOrReplaceChild("head23", CubeListBuilder.create().texOffs(350, 450).mirror().addBox(1.8F, -8.9F, -4.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.1487F));
 	
	 	 head.addOrReplaceChild("head22", CubeListBuilder.create().texOffs(350, 500).mirror().addBox(0.2F, -9.0F, -4.1F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.1487F));
 	
	 	 head.addOrReplaceChild("head21", CubeListBuilder.create().texOffs(300, 450).mirror().addBox(-2.8F, -8.9F, -4.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1487F));
 	
	 	 head.addOrReplaceChild("head20", CubeListBuilder.create().texOffs(300, 500).mirror().addBox(-2.2F, -9.0F, -4.1F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1487F));
 	
	 	 head.addOrReplaceChild("head19", CubeListBuilder.create().texOffs(0, 150).mirror().addBox(-1.5F, -9.9F, -2.2F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2974F, 0.0F, 0.0F));
 	
	 	 head.addOrReplaceChild("head18", CubeListBuilder.create().texOffs(450, 100).mirror().addBox(-5.7F, -8.0F, -2.1F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.7808F));
 	
	 	 head.addOrReplaceChild("head17", CubeListBuilder.create().texOffs(450, 100).mirror().addBox(3.7F, -8.0F, -2.1F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.7808F));
 	
	 	 head.addOrReplaceChild("head16", CubeListBuilder.create().texOffs(0, 150).mirror().addBox(-1.5F, -9.7F, -2.1F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));
 	
	 	 head.addOrReplaceChild("head15", CubeListBuilder.create().texOffs(450, 50).mirror().addBox(-0.4F, -9.2F, -2.1F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.1487F));
 	
	 	 head.addOrReplaceChild("head14", CubeListBuilder.create().texOffs(450, 0).mirror().addBox(-2.6F, -9.2F, -2.1F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1487F));
 	
	 	 head.addOrReplaceChild("head13", CubeListBuilder.create().texOffs(400, 350).mirror().addBox(-6.7F, -6.3F, -1.1F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.2641F));
 	
	 	 head.addOrReplaceChild("head12", CubeListBuilder.create().texOffs(400, 350).mirror().addBox(4.7F, -6.3F, -1.1F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.2641F));
 	
	 	 head.addOrReplaceChild("head11", CubeListBuilder.create().texOffs(400, 300).mirror().addBox(-4.5F, -6.2F, 3.6F, 9.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2231F, 0.0F, 0.0F));
 	
	 	 head.addOrReplaceChild("head10", CubeListBuilder.create().texOffs(0, 150).mirror().addBox(-4.5F, -6.5F, -1.1F, 9.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));
 	
		 head.addOrReplaceChild("head8", CubeListBuilder.create().texOffs(400, 250).mirror().addBox(3.0F, -5.2F, -1.1F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1115F));

		 head.addOrReplaceChild("head7", CubeListBuilder.create().texOffs(400, 200).mirror().addBox(-5.0F, -5.2F, -1.1F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.1115F));

		 head.addOrReplaceChild("head6", CubeListBuilder.create().texOffs(400, 100).mirror().addBox(1.4F, -3.0F, -4.4F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1115F, 0.0F, 0.0F));

		 head.addOrReplaceChild("head5", CubeListBuilder.create().texOffs(400, 150).mirror().addBox(3.2F, -2.9F, -4.0F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1115F, 0.0F, 0.0F));

		 head.addOrReplaceChild("head4", CubeListBuilder.create().texOffs(400, 100).mirror().addBox(-4.4F, -3.0F, -4.4F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1115F, 0.0F, 0.0F));

		 head.addOrReplaceChild("head3", CubeListBuilder.create().texOffs(400, 150).mirror().addBox(-4.2F, -2.9F, -4.0F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1115F, 0.0F, 0.0F));

		 head.addOrReplaceChild("head2", CubeListBuilder.create().texOffs(400, 50).mirror().addBox(-4.0F, -3.5F, -4.1F, 8.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2603F, 0.0F, 0.0F));

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