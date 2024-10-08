package net.hero61.projectspartan.client.model.item.model.armor.argonaut;// Made with Blockbench 4.10.4
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

public class ModelArgonaut<T extends LivingEntity> extends HumanoidModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation(ProjectSpartan.MOD_ID, "argonaut_body"), "main");
	public ModelArgonaut(ModelPart modelPart) {
		super(modelPart);
	}

	public static LayerDefinition createLayer() {
		MeshDefinition definition = ModelUtils.createBlankHumanoidMesh();
		PartDefinition root = definition.getRoot();

		PartDefinition body = root.addOrReplaceChild("body", CubeListBuilder.create().texOffs(16, 16).mirror().addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		body.addOrReplaceChild("chest1", CubeListBuilder.create().texOffs(119, 3).mirror().addBox(-3.5F, 0.0F, -3.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		body.addOrReplaceChild("chest2", CubeListBuilder.create().texOffs(101, 10).mirror().addBox(1.5F, 0.0F, -3.0F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		body.addOrReplaceChild("chest3", CubeListBuilder.create().texOffs(80, 210).mirror().addBox(-2.5F, 3.0F, -4.8F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2974F, 0.0F, 0.0F));

		body.addOrReplaceChild("chest6", CubeListBuilder.create().texOffs(403, 297).mirror().addBox(-2.0F, -0.3F, -4.2F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 2.1F, 0.7F));

		body.addOrReplaceChild("chest8", CubeListBuilder.create().texOffs(80, 310).mirror().addBox(1.5F, 3.0F, -4.81F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2974F, 0.0F, 0.0F));

		body.addOrReplaceChild("chest9", CubeListBuilder.create().texOffs(80, 330).mirror().addBox(-1.5F, 3.0F, -4.8F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2974F, 0.0F, 0.0F));

		body.addOrReplaceChild("chest10", CubeListBuilder.create().texOffs(80, 350).mirror().addBox(-2.0F, 4.0F, -4.79F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2974F, 0.0F, 0.0F));

		body.addOrReplaceChild("chest11", CubeListBuilder.create().texOffs(80, 370).mirror().addBox(1.0F, 4.0F, -4.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2974F, 0.0F, 0.0F));

		body.addOrReplaceChild("chest12", CubeListBuilder.create().texOffs(80, 390).mirror().addBox(-1.0F, 3.5F, -4.81F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2974F, 0.0F, 0.0F));

		body.addOrReplaceChild("chest14", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2974F, 0.0F, 0.0F));

		body.addOrReplaceChild("chest15", CubeListBuilder.create().texOffs(80, 450).mirror().addBox(-1.0F, 3.8F, -4.7F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2974F, 0.0F, 0.0F));

		body.addOrReplaceChild("chest16", CubeListBuilder.create().texOffs(80, 470).mirror().addBox(-1.5F, 3.5F, -3.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0744F, 0.0F, 0.0F));

		body.addOrReplaceChild("chest18", CubeListBuilder.create().texOffs(148, 49).mirror().addBox(-3.5057F, 2.4863F, -3.4F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.8F, 1.0F, 0.0F, -0.0687F, 0.0284F, 0.3917F));

		body.addOrReplaceChild("chest4", CubeListBuilder.create().texOffs(148, 49).addBox(-3.3057F, 2.3863F, -3.65F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.8F, -0.8F, 0.3F, -0.0687F, 0.0284F, -0.3917F));

		body.addOrReplaceChild("chest19", CubeListBuilder.create().texOffs(150, 70).mirror().addBox(1.5F, 1.0F, -3.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2231F, 0.0F, 0.0F));

		body.addOrReplaceChild("chest20", CubeListBuilder.create().texOffs(397, 312).mirror().addBox(-3.5F, 1.0F, -3.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2231F, 0.0F, 0.0F));

		body.addOrReplaceChild("chest21", CubeListBuilder.create().texOffs(150, 110).mirror().addBox(1.5F, 2.5F, -3.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0744F, 0.0F, 0.0F));

		body.addOrReplaceChild("chest22", CubeListBuilder.create().texOffs(150, 130).mirror().addBox(-2.5F, 2.5F, -3.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0744F, 0.0F, 0.0F));

		body.addOrReplaceChild("chest23", CubeListBuilder.create().texOffs(150, 150).mirror().addBox(-1.5F, 3.0F, -3.4F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0744F, 0.0F, 0.0F));

		body.addOrReplaceChild("chest24", CubeListBuilder.create().texOffs(406, 324).mirror().addBox(-4.0F, 0.0F, -3.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2231F, 0.0F, 0.0F));

		body.addOrReplaceChild("chest25", CubeListBuilder.create().texOffs(470, 331).mirror().addBox(3.0F, 0.0F, -3.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2231F, 0.0F, 0.0F));

		body.addOrReplaceChild("chest26", CubeListBuilder.create().texOffs(340, 147).mirror().addBox(-1.0F, 9.5F, -2.9F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		body.addOrReplaceChild("chest27", CubeListBuilder.create().texOffs(470, 307).mirror().addBox(-4.1F, 3.7F, -3.5F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1F, -0.7F, -1.2F, 0.2187F, 0.0682F, 0.0151F));

		body.addOrReplaceChild("chest5", CubeListBuilder.create().texOffs(470, 307).addBox(-4.4F, 3.7F, -3.5F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.3F, -0.8F, -0.7F, 0.2187F, -0.0682F, -0.0151F));

		body.addOrReplaceChild("chest29", CubeListBuilder.create().texOffs(146, 226).mirror().addBox(-4.5F, 4.5F, -4.5F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2974F, 0.0F, 0.0F));

		body.addOrReplaceChild("chest30", CubeListBuilder.create().texOffs(145, 245).mirror().addBox(2.5F, 4.5F, -4.5F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2974F, 0.0F, 0.0F));

		body.addOrReplaceChild("chest31", CubeListBuilder.create().texOffs(286, 115).mirror().addBox(-2.0F, 6.5F, -3.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		body.addOrReplaceChild("chest32", CubeListBuilder.create().texOffs(286, 117).mirror().addBox(-1.0F, 7.0F, -3.1F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		body.addOrReplaceChild("chest34", CubeListBuilder.create().texOffs(115, 11).mirror().addBox(-1.5F, 9.0F, -2.8F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		body.addOrReplaceChild("chest35", CubeListBuilder.create().texOffs(150, 270).mirror().addBox(-2.5F, 3.0F, -4.79F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2974F, 0.0F, 0.0F));

		body.addOrReplaceChild("chest36", CubeListBuilder.create().texOffs(150, 290).mirror().addBox(-3.0F, 4.5F, -4.791F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2974F, 0.0F, 0.0F));

		body.addOrReplaceChild("chest37", CubeListBuilder.create().texOffs(150, 310).mirror().addBox(1.5F, 3.0F, -4.82F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2974F, 0.0F, 0.0F));

		body.addOrReplaceChild("chest38", CubeListBuilder.create().texOffs(150, 330).mirror().addBox(2.0F, 4.5F, -4.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2974F, 0.0F, 0.0F));

		body.addOrReplaceChild("chest46", CubeListBuilder.create().texOffs(150, 450).mirror().addBox(-1.0F, 10.6F, -4.2F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1487F, 0.0F, 0.0F));

		body.addOrReplaceChild("chest49", CubeListBuilder.create().texOffs(439, 81).mirror().addBox(-5.0F, 9.5F, -1.0F, 10.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		body.addOrReplaceChild("chest50", CubeListBuilder.create().texOffs(461, 63).mirror().addBox(-3.0F, 0.0F, -2.4F, 6.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		body.addOrReplaceChild("chest51", CubeListBuilder.create().texOffs(448, 19).addBox(2.51F, 0.0F, 1.5F, 3.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1859F, 0.0F, 0.0F));

		body.addOrReplaceChild("chest52", CubeListBuilder.create().texOffs(448, 19).mirror().addBox(-5.51F, 0.0F, 1.5F, 3.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1859F, 0.0F, 0.0F));

		body.addOrReplaceChild("chest55", CubeListBuilder.create().texOffs(200, 90).mirror().addBox(3.5F, -0.3F, -2.3F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1115F, 0.0F, 0.0F));

		body.addOrReplaceChild("chest56", CubeListBuilder.create().texOffs(328, 194).mirror().addBox(4.52F, -0.3F, -1.3F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1115F, 0.0F, 0.0F));

		body.addOrReplaceChild("chest57", CubeListBuilder.create().texOffs(228, 94).mirror().addBox(-5.52F, -0.3F, -1.3F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1115F, 0.0F, 0.0F));

		body.addOrReplaceChild("chest58", CubeListBuilder.create().texOffs(200, 130).mirror().addBox(-4.5F, -0.3F, -2.3F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1115F, 0.0F, 0.0F));

		body.addOrReplaceChild("chest59", CubeListBuilder.create().texOffs(463, 31).mirror().addBox(2.5F, 1.5F, 2.7F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.7854F, 0.0F, 0.0F));

		body.addOrReplaceChild("chest60", CubeListBuilder.create().texOffs(463, 31).mirror().addBox(-5.5F, 1.5F, 2.7F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.7854F, 0.0F, 0.0F));

		body.addOrReplaceChild("chest33", CubeListBuilder.create().texOffs(437, 20).mirror().addBox(2.49F, 0.7985F, 0.2292F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.6581F, 0.0F, 0.0F));

		body.addOrReplaceChild("chest39", CubeListBuilder.create().texOffs(437, 20).addBox(-5.49F, 0.7985F, 0.2292F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.6581F, 0.0F, 0.0F));

		body.addOrReplaceChild("chest40", CubeListBuilder.create().texOffs(437, 18).mirror().addBox(-5.5F, -1.8292F, -0.118F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 2.0071F, 0.0F, 0.0F));

		body.addOrReplaceChild("chest41", CubeListBuilder.create().texOffs(437, 20).mirror().addBox(2.5F, -1.8292F, -0.118F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 2.0071F, 0.0F, 0.0F));

		body.addOrReplaceChild("chest63", CubeListBuilder.create().texOffs(195, 230).mirror().addBox(-3.0F, 1.0F, 0.5F, 6.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1859F, 0.0F, 0.0F));

		body.addOrReplaceChild("chest64", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1859F, 0.0F, 0.0F));

		body.addOrReplaceChild("chest65", CubeListBuilder.create().texOffs(198, 269).mirror().addBox(-3.0F, 0.2F, 1.3F, 6.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1859F, 0.0F, 0.0F));

		body.addOrReplaceChild("chest17", CubeListBuilder.create().texOffs(397, 123).mirror().addBox(-3.0F, 0.2F, 1.3F, 6.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.3F, 0.0F, 0.1859F, 0.0F, 0.0F));

		body.addOrReplaceChild("chest43", CubeListBuilder.create().texOffs(398, 123).mirror().addBox(-1.4347F, 0.5117F, 1.2414F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 1.2F, 0.0F, 0.1859F, 0.0F, 0.0F));

		body.addOrReplaceChild("chest28", CubeListBuilder.create().texOffs(398, 123).mirror().addBox(-2.0F, 0.2F, 1.3F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.3F, 0.8F, 0.0F, 0.1859F, 0.0F, -0.4363F));

		body.addOrReplaceChild("chest42", CubeListBuilder.create().texOffs(398, 123).mirror().addBox(-2.2351F, 0.5491F, 1.2343F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 1.0F, 0.0F, 0.1859F, 0.0F, 0.4363F));

		body.addOrReplaceChild("chest7", CubeListBuilder.create().texOffs(203, 269).mirror().addBox(2.0F, 1.2F, 1.3F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.9F, 0.0F, 0.1859F, 0.0F, -0.48F));

		body.addOrReplaceChild("chest13", CubeListBuilder.create().texOffs(203, 269).mirror().addBox(2.0F, 1.2F, 1.3F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.9F, -1.9F, 0.0F, 0.1859F, 0.0F, 0.48F));

		body.addOrReplaceChild("chest67", CubeListBuilder.create().texOffs(196, 310).mirror().addBox(-1.9F, 2.0F, 1.5F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1487F, 0.0F, 0.0F));

		body.addOrReplaceChild("chest45", CubeListBuilder.create().texOffs(437, 52).mirror().addBox(-1.9F, 3.4F, 1.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, -0.8F, 0.2F, -0.1487F, 0.0F, 0.0F));

		body.addOrReplaceChild("chest47", CubeListBuilder.create().texOffs(437, 52).mirror().addBox(-1.9F, 3.5F, 1.4F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.9F, 1.0F, -0.1F, -0.1487F, 0.0F, 0.0F));

		body.addOrReplaceChild("chest44", CubeListBuilder.create().texOffs(196, 310).mirror().addBox(-1.9F, 2.0F, 1.1F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4F, 2.3F, 0.0F, -0.1487F, 0.0F, 0.0F));

		body.addOrReplaceChild("chest71", CubeListBuilder.create().texOffs(400, 0).mirror().addBox(-1.0F, 2.0F, 0.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1859F, 0.0F, 0.0F));

		body.addOrReplaceChild("chest73", CubeListBuilder.create().texOffs(399, -1).mirror().addBox(-5.0F, 4.9F, 5.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.3F, -2.4F, 0.1859F, 0.0F, 0.0F));

		body.addOrReplaceChild("chest74", CubeListBuilder.create().texOffs(399, -1).mirror().addBox(3.0F, 4.9F, 4.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, -1.3F, 0.1859F, 0.0F, 0.0F));

		body.addOrReplaceChild("chest75", CubeListBuilder.create().texOffs(400, 0).mirror().addBox(-6.0174F, 0.5632F, 4.1042F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.0F, 0.0F, 0.0F, 0.1859F, -0.0873F, 0.0F));

		body.addOrReplaceChild("chest76", CubeListBuilder.create().texOffs(400, 0).mirror().addBox(0.9826F, -0.5368F, 3.7042F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.0F, 1.0F, 0.0F, 0.1859F, -0.0873F, 0.0F));

		body.addOrReplaceChild("chest72", CubeListBuilder.create().texOffs(434, 238).mirror().addBox(-1.0F, 5.0F, 1.1F, 2.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1487F, 0.0F, 0.0F));

		body.addOrReplaceChild("chest78", CubeListBuilder.create().texOffs(200, 350).mirror().addBox(-2.0F, 11.1F, 2.8F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1859F, 0.0F, 0.0F));

		body.addOrReplaceChild("chest48", CubeListBuilder.create().texOffs(200, 350).mirror().addBox(-1.5F, 10.7F, 2.8F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.0F, 0.2F, -0.1859F, 0.0F, 0.0F));

		body.addOrReplaceChild("chest79", CubeListBuilder.create().texOffs(200, 370).mirror().addBox(-2.5F, 9.3F, 3.51F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.5F, -3.7F, 0.1859F, 0.0F, 0.0F));

		body.addOrReplaceChild("chest80", CubeListBuilder.create().texOffs(427, 253).mirror().addBox(-3.0F, -1.0F, 1.4F, 6.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		body.addOrReplaceChild("chest81", CubeListBuilder.create().texOffs(200, 390).mirror().addBox(-3.5F, 1.3515F, 1.1404F, 7.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.409F, 0.0F, 0.0F));

		PartDefinition right_arm = root.addOrReplaceChild("right_arm", CubeListBuilder.create().texOffs(40, 16).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F));

		 right_arm.addOrReplaceChild("right_arm31", CubeListBuilder.create().texOffs(375, 373).addBox(-8.0F, -24.0F, -2.1F, 4.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, 22.0F, 0.0F));

		 right_arm.addOrReplaceChild("right_arm35", CubeListBuilder.create().texOffs(393, 366).addBox(-8.0F, -24.0F, 1.1F, 4.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, 22.0F, 0.0F));

		 right_arm.addOrReplaceChild("right_arm36", CubeListBuilder.create().texOffs(393, 366).addBox(-8.1F, -24.0F, -2.0F, 1.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, 22.0F, 0.0F));

		 right_arm.addOrReplaceChild("right_arm37", CubeListBuilder.create().texOffs(406, 366).addBox(0.1F, 0.0F, -2.0F, 1.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -2.0F, 0.0F));

		 right_arm.addOrReplaceChild("right_arm38", CubeListBuilder.create().texOffs(362, 294).addBox(-3.0F, -24.1F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 22.0F, 0.0F));

		 right_arm.addOrReplaceChild("right_arm39", CubeListBuilder.create().texOffs(431, 141).addBox(-8.0F, -12.9F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, 22.0F, 0.0F));

		 right_arm.addOrReplaceChild("right_arm40", CubeListBuilder.create(), PartPose.offset(5.0F, 22.0F, 0.0F));

		 right_arm.addOrReplaceChild("right_arm46", CubeListBuilder.create().texOffs(200, 430).addBox(-2.0F, 1.5F, -2.9F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1859F, 0.0F, 0.0F));

		 right_arm.addOrReplaceChild("right_arm47", CubeListBuilder.create().texOffs(469, 293).addBox(-3.83F, -0.3591F, -2.6014F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.4484F, 0.0F, 0.0F));

		 right_arm.addOrReplaceChild("right_arm48", CubeListBuilder.create().texOffs(386, 335).addBox(-3.84F, -0.1959F, -2.5F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -1.0F, 0.0F));

		 right_arm.addOrReplaceChild("right_arm49", CubeListBuilder.create().texOffs(382, 280).addBox(-8.82F, 1.4432F, 0.4684F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, -2.0F, 0.0F, -0.4484F, 0.0F, 0.0F));

		 right_arm.addOrReplaceChild("right_arm51", CubeListBuilder.create().texOffs(249, 49).addBox(-2.8251F, 3.6064F, -0.367F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.0F, -2.0F, 0.0F));

		right_arm.addOrReplaceChild("right_arm3", CubeListBuilder.create().texOffs(249, 49).addBox(-2.8251F, 3.6064F, -1.633F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.0F, -2.0F, 0.0F));

		 right_arm.addOrReplaceChild("right_arm53", CubeListBuilder.create().texOffs(250, 90).addBox(-7.0F, 2.8F, 2.7F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, -2.0F, 0.0F, -0.2603F, 0.0F, 0.0F));

		 right_arm.addOrReplaceChild("right_arm54", CubeListBuilder.create().texOffs(229, 11).addBox(-5.0F, 7.0F, -2.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, -2.0F, 0.0F));

		 right_arm.addOrReplaceChild("right_arm55", CubeListBuilder.create().texOffs(139, 7).addBox(-8.0F, 7.0F, -2.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, -2.0F, 0.0F));

		 right_arm.addOrReplaceChild("right_arm56", CubeListBuilder.create().texOffs(92, 60).addBox(-7.0F, 7.0F, -2.4F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, -2.0F, 0.0F));

		 right_arm.addOrReplaceChild("right_arm57", CubeListBuilder.create().texOffs(190, 4).addBox(-8.31F, 7.0F, -2.1F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, -2.0F, 0.0F));

		 right_arm.addOrReplaceChild("right_arm58", CubeListBuilder.create().texOffs(269, 81).addBox(-8.3F, 7.0F, 1.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, -2.0F, 0.0F));

		 right_arm.addOrReplaceChild("right_arm59", CubeListBuilder.create().texOffs(211, 83).addBox(-8.0F, 7.0F, 1.3F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, -2.0F, 0.0F));

		 right_arm.addOrReplaceChild("right_arm60", CubeListBuilder.create().texOffs(101, 10).addBox(-4.7F, 7.0F, -2.1F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, -2.0F, 0.0F));

		 right_arm.addOrReplaceChild("right_arm61", CubeListBuilder.create().texOffs(119, 3).addBox(-4.7F, 7.0F, 1.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, -2.0F, 0.0F));

		 right_arm.addOrReplaceChild("right_arm62", CubeListBuilder.create().texOffs(288, 235).addBox(-7.5F, 6.0F, 2.1F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, -2.0F, 0.0F, -0.0744F, 0.0F, 0.0F));

		 right_arm.addOrReplaceChild("right_arm63", CubeListBuilder.create().texOffs(340, 134).addBox(-9.1F, 6.2F, -2.2F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, -2.0F, 0.0F, 0.0F, 0.0F, -0.1115F));

		 right_arm.addOrReplaceChild("right_arm64", CubeListBuilder.create().texOffs(338, 121).addBox(-9.0F, 5.8F, -1.5F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, -2.0F, 0.0F, 0.0F, 0.0F, -0.0436F));

		 right_arm.addOrReplaceChild("right_arm65", CubeListBuilder.create().texOffs(324, 141).addBox(-6.5F, 9.0F, -2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, -2.0F, 0.0F));

		 right_arm.addOrReplaceChild("right_arm66", CubeListBuilder.create().texOffs(119, 3).addBox(-6.5F, 8.0F, 1.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, -2.0F, 0.0F));

		 right_arm.addOrReplaceChild("right_arm67", CubeListBuilder.create().texOffs(141, 378).addBox(-8.4F, 10.3F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, -2.0F, 0.0F));

		right_arm.addOrReplaceChild("right_arm2", CubeListBuilder.create().texOffs(401, 158).addBox(-8.3F, 10.3F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(4.8F, -1.6F, -0.5F));

		PartDefinition left_arm = root.addOrReplaceChild("left_arm", CubeListBuilder.create().texOffs(40, 16).mirror().addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(5.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F));

		left_arm.addOrReplaceChild("left_arm1", CubeListBuilder.create().texOffs(375, 373).mirror().addBox(4.0F, -24.0F, -2.1F, 4.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-5.0F, 22.0F, 0.0F));

		left_arm.addOrReplaceChild("left_arm2", CubeListBuilder.create().texOffs(393, 366).mirror().addBox(4.0F, -24.0F, 1.1F, 4.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-5.0F, 22.0F, 0.0F));

		left_arm.addOrReplaceChild("left_arm3", CubeListBuilder.create().texOffs(393, 366).mirror().addBox(7.1F, -24.0F, -2.0F, 1.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-5.0F, 22.0F, 0.0F));

		left_arm.addOrReplaceChild("left_arm4", CubeListBuilder.create().texOffs(406, 366).mirror().addBox(-1.1F, 0.0F, -2.0F, 1.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, -2.0F, 0.0F));

		left_arm.addOrReplaceChild("left_arm5", CubeListBuilder.create().texOffs(362, 294).mirror().addBox(-1.0F, -24.1F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 22.0F, 0.0F));

		left_arm.addOrReplaceChild("left_arm6", CubeListBuilder.create().texOffs(431, 141).mirror().addBox(4.0F, -12.9F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-5.0F, 22.0F, 0.0F));

		 left_arm.addOrReplaceChild("left_arm13", CubeListBuilder.create().texOffs(200, 430).mirror().addBox(0.0F, 1.5F, -2.9F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1859F, 0.0F, 0.0F));

		 left_arm.addOrReplaceChild("left_arm14", CubeListBuilder.create().texOffs(469, 292).mirror().addBox(2.8F, -0.2372F, -2.6478F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.4363F, 0.0F, 0.0F));

		 left_arm.addOrReplaceChild("left_arm15", CubeListBuilder.create().texOffs(386, 335).mirror().addBox(1.84F, -0.0959F, -2.5F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, -1.0F, 0.0F));

		 left_arm.addOrReplaceChild("left_arm16", CubeListBuilder.create().texOffs(383, 281).mirror().addBox(6.83F, 1.5754F, 1.4931F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.0F, -2.0F, 0.0F, -0.4363F, 0.0F, 0.0F));

		 left_arm.addOrReplaceChild("left_arm18", CubeListBuilder.create().texOffs(249, 49).mirror().addBox(0.81F, 3.7167F, -1.6548F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -2.0F, 0.0F));

		left_arm.addOrReplaceChild("left_arm8", CubeListBuilder.create().texOffs(249, 49).mirror().addBox(0.83F, 3.7167F, -0.3452F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -2.0F, 0.0F));

		 left_arm.addOrReplaceChild("left_arm20", CubeListBuilder.create().texOffs(250, 90).mirror().addBox(5.0F, 2.8F, 2.7F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.0F, -2.0F, 0.0F, -0.2603F, 0.0F, 0.0F));

		 left_arm.addOrReplaceChild("left_arm21", CubeListBuilder.create().texOffs(139, 7).mirror().addBox(4.0F, 7.0F, -2.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-5.0F, -2.0F, 0.0F));

		 left_arm.addOrReplaceChild("left_arm22", CubeListBuilder.create().texOffs(139, 7).mirror().addBox(7.0F, 7.0F, -2.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-5.0F, -2.0F, 0.0F));

		 left_arm.addOrReplaceChild("left_arm23", CubeListBuilder.create().texOffs(92, 60).mirror().addBox(5.0F, 7.0F, -2.4F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-5.0F, -2.0F, 0.0F));

		 left_arm.addOrReplaceChild("left_arm24", CubeListBuilder.create().texOffs(190, 4).mirror().addBox(7.3F, 7.0F, -2.1F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-5.0F, -2.0F, 0.0F));

		 left_arm.addOrReplaceChild("left_arm25", CubeListBuilder.create().texOffs(269, 81).mirror().addBox(7.31F, 7.0F, 1.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-5.0F, -2.0F, 0.0F));

		 left_arm.addOrReplaceChild("left_arm26", CubeListBuilder.create().texOffs(211, 83).mirror().addBox(4.0F, 7.0F, 1.3F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-5.0F, -2.0F, 0.0F));

		 left_arm.addOrReplaceChild("left_arm27", CubeListBuilder.create().texOffs(101, 10).mirror().addBox(3.7F, 7.0F, -2.1F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-5.0F, -2.0F, 0.0F));

		 left_arm.addOrReplaceChild("left_arm28", CubeListBuilder.create().texOffs(119, 3).mirror().addBox(3.7F, 7.0F, 1.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-5.0F, -2.0F, 0.0F));

		 left_arm.addOrReplaceChild("left_arm29", CubeListBuilder.create().texOffs(288, 235).mirror().addBox(4.5F, 6.0F, 2.1F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.0F, -2.0F, 0.0F, -0.0744F, 0.0F, 0.0F));

		 left_arm.addOrReplaceChild("left_arm30", CubeListBuilder.create().texOffs(340, 134).mirror().addBox(8.1F, 6.2F, -2.2F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.1115F));

		 left_arm.addOrReplaceChild("left_arm31", CubeListBuilder.create().texOffs(338, 121).mirror().addBox(8.0F, 5.8F, -1.5F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0436F));

		 left_arm.addOrReplaceChild("left_arm33", CubeListBuilder.create().texOffs(324, 141).mirror().addBox(5.5F, 9.0F, -2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-5.0F, -2.0F, 0.0F));

		 left_arm.addOrReplaceChild("left_arm34", CubeListBuilder.create().texOffs(119, 3).mirror().addBox(5.5F, 8.0F, 1.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-5.0F, -2.0F, 0.0F));

		 left_arm.addOrReplaceChild("left_arm35", CubeListBuilder.create().texOffs(141, 378).mirror().addBox(6.4F, 10.3F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-5.0F, -2.0F, 0.0F));

		left_arm.addOrReplaceChild("left_arm7", CubeListBuilder.create().texOffs(401, 158).mirror().addBox(6.3F, 10.3F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-4.8F, -1.5F, 0.5F));

		PartDefinition right_leg = root.addOrReplaceChild("right_leg", CubeListBuilder.create().texOffs(0, 16).mirror().addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-2.0F, 12.0F, 0.0F));

		right_leg.addOrReplaceChild("right_leg1", CubeListBuilder.create().texOffs(101, 10).mirror().addBox(-4.2F, 13.0F, -2.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		right_leg.addOrReplaceChild("right_leg2", CubeListBuilder.create().texOffs(119, 3).mirror().addBox(-4.0F, 13.0F, 1.2F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		right_leg.addOrReplaceChild("right_leg3", CubeListBuilder.create().texOffs(250, 390).mirror().addBox(-14.3438F, 1.0166F, -2.3F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.0F, -12.0F, 0.0F, 0.0F, 0.0F, -1.2641F));

		right_leg.addOrReplaceChild("right_leg4", CubeListBuilder.create().texOffs(250, 410).mirror().addBox(-14.3438F, 1.0166F, 1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.0F, -12.0F, 0.0F, 0.0F, 0.0F, -1.2641F));

		right_leg.addOrReplaceChild("right_leg5", CubeListBuilder.create().texOffs(103, 19).mirror().addBox(-3.1F, 13.5F, 1.21F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		right_leg.addOrReplaceChild("right_leg6", CubeListBuilder.create().texOffs(45, 104).mirror().addBox(-3.1F, 13.5F, -2.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		right_leg.addOrReplaceChild("right_leg7", CubeListBuilder.create().texOffs(144, 179).mirror().addBox(-4.1F, 13.0F, -2.2F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		right_leg.addOrReplaceChild("right_leg8", CubeListBuilder.create().texOffs(166, 120).mirror().addBox(-3.1F, 15.0F, -2.21F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		right_leg.addOrReplaceChild("right_leg9", CubeListBuilder.create().texOffs(119, 3).mirror().addBox(-0.8F, 15.2F, -2.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		 right_leg.addOrReplaceChild("right_leg10", CubeListBuilder.create().texOffs(119, 3).mirror().addBox(-0.8F, 15.8F, -2.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		 right_leg.addOrReplaceChild("right_leg11", CubeListBuilder.create().texOffs(256, 333).mirror().addBox(-3.0F, 20.0F, -2.3F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		 right_leg.addOrReplaceChild("right_leg12", CubeListBuilder.create().texOffs(254, 277).mirror().addBox(-4.0F, 20.0F, -2.21F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		 right_leg.addOrReplaceChild("right_leg13", CubeListBuilder.create().texOffs(252, 177).mirror().addBox(-4.0F, 19.0F, 1.2F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		 right_leg.addOrReplaceChild("right_leg14", CubeListBuilder.create().texOffs(101, 10).mirror().addBox(-4.2F, 19.0F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		 right_leg.addOrReplaceChild("right_leg15", CubeListBuilder.create().texOffs(252, 432).mirror().addBox(-6.6559F, 13.8712F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.4F, -12.5F, 0.0F, 0.0F, 0.0F, -0.0436F));

		 right_leg.addOrReplaceChild("right_leg16", CubeListBuilder.create().texOffs(119, 3).mirror().addBox(-5.3F, 14.6F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.0F, -12.0F, 0.0F, 0.0F, 0.0F, -0.0436F));

		 right_leg.addOrReplaceChild("right_leg17", CubeListBuilder.create().texOffs(250, 450).mirror().addBox(-7.3559F, 17.3712F, -1.5F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.0F, -12.0F, 0.0F, 0.0F, 0.0F, -0.1487F));

		 right_leg.addOrReplaceChild("right_leg18", CubeListBuilder.create().texOffs(119, 3).mirror().addBox(-4.4F, 19.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		 right_leg.addOrReplaceChild("right_leg19", CubeListBuilder.create().texOffs(121, 4).mirror().addBox(-3.0F, 19.0F, 1.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		 right_leg.addOrReplaceChild("right_leg20", CubeListBuilder.create().texOffs(250, 470).mirror().addBox(-3.5F, 17.5254F, -4.6357F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.0F, -12.0F, 0.0F, 0.1115F, 0.0F, 0.0F));

		 right_leg.addOrReplaceChild("right_leg34", CubeListBuilder.create().texOffs(261, 444).mirror().addBox(-2.5F, 17.5672F, -4.687F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.0F, -12.0F, 0.0F, 0.1115F, 0.0F, 0.0F));

		 right_leg.addOrReplaceChild("right_leg21", CubeListBuilder.create().texOffs(119, 3).mirror().addBox(-4.2F, 18.3F, -2.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		 right_leg.addOrReplaceChild("right_leg22", CubeListBuilder.create().texOffs(101, 10).mirror().addBox(-0.8F, 18.3F, -2.2F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		 right_leg.addOrReplaceChild("right_leg23", CubeListBuilder.create().texOffs(102, 143).mirror().addBox(-4.0F, 15.0F, 1.21F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		 right_leg.addOrReplaceChild("right_leg24", CubeListBuilder.create().texOffs(119, 3).mirror().addBox(-0.9F, 16.0F, 1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		 right_leg.addOrReplaceChild("right_leg35", CubeListBuilder.create().texOffs(116, 3).mirror().addBox(-3.9F, 15.8F, 1.2F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.6F, 0.0F));

		 right_leg.addOrReplaceChild("right_leg25", CubeListBuilder.create().texOffs(113, 243).mirror().addBox(-3.5F, 22.0F, -2.7F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		 right_leg.addOrReplaceChild("right_leg26", CubeListBuilder.create().texOffs(117, 3).mirror().addBox(-2.8F, 18.3F, 1.2F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		 right_leg.addOrReplaceChild("right_leg27", CubeListBuilder.create().texOffs(119, 3).mirror().addBox(-4.2F, 18.3F, 1.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		 right_leg.addOrReplaceChild("right_leg28", CubeListBuilder.create().texOffs(101, 10).mirror().addBox(-0.8F, 19.0F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		 right_leg.addOrReplaceChild("right_leg29", CubeListBuilder.create().texOffs(119, 3).mirror().addBox(-0.8F, 23.0F, -2.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		 right_leg.addOrReplaceChild("right_leg30", CubeListBuilder.create().texOffs(119, 3).mirror().addBox(-4.2F, 23.0F, -2.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		 right_leg.addOrReplaceChild("right_leg31", CubeListBuilder.create().texOffs(119, 3).mirror().addBox(-4.3F, 22.0F, 0.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		 right_leg.addOrReplaceChild("right_leg32", CubeListBuilder.create().texOffs(119, 3).mirror().addBox(-0.7F, 22.0F, 0.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		 right_leg.addOrReplaceChild("right_leg33", CubeListBuilder.create().texOffs(119, 3).mirror().addBox(-3.5F, 23.0F, 1.3F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		PartDefinition left_leg = root.addOrReplaceChild("left_leg", CubeListBuilder.create().texOffs(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, 12.0F, 0.0F));

		left_leg.addOrReplaceChild("left_leg1", CubeListBuilder.create().texOffs(101, 10).addBox(-0.2F, 18.3F, -2.2F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

		left_leg.addOrReplaceChild("left_leg2", CubeListBuilder.create().texOffs(117, 3).addBox(-0.2F, 18.3F, 1.2F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

		left_leg.addOrReplaceChild("left_leg3", CubeListBuilder.create().texOffs(119, 3).addBox(-0.2F, 15.2F, -2.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

		left_leg.addOrReplaceChild("left_leg4", CubeListBuilder.create().texOffs(119, 3).mirror().addBox(-0.2F, 15.2F, 1.2F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-2.0F, -12.0F, 0.0F));

		left_leg.addOrReplaceChild("left_leg5", CubeListBuilder.create().texOffs(119, 3).mirror().addBox(-0.2F, 16.0F, 1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-2.0F, -12.0F, 0.0F));

		left_leg.addOrReplaceChild("left_leg6", CubeListBuilder.create().texOffs(119, 3).addBox(-0.2F, 15.8F, -2.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

		left_leg.addOrReplaceChild("left_leg7", CubeListBuilder.create().texOffs(119, 3).addBox(-0.3F, 22.0F, 0.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

		left_leg.addOrReplaceChild("left_leg8", CubeListBuilder.create().texOffs(119, 3).mirror().addBox(-0.2F, 23.0F, -2.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-2.0F, -12.0F, 0.0F));

		left_leg.addOrReplaceChild("left_leg9", CubeListBuilder.create().texOffs(101, 10).addBox(-0.2F, 19.0F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

		 left_leg.addOrReplaceChild("left_leg10", CubeListBuilder.create().texOffs(166, 120).addBox(0.1F, 15.0F, -2.21F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

		 left_leg.addOrReplaceChild("left_leg11", CubeListBuilder.create().texOffs(119, 3).addBox(2.1F, 13.5F, -2.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

		 left_leg.addOrReplaceChild("left_leg12", CubeListBuilder.create().texOffs(250, 390).addBox(13.3438F, 1.0166F, -2.3F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -12.0F, 0.0F, 0.0F, 0.0F, 1.2641F));

		 left_leg.addOrReplaceChild("left_leg13", CubeListBuilder.create().texOffs(144, 179).addBox(3.1F, 13.0F, -2.2F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

		 left_leg.addOrReplaceChild("left_leg14", CubeListBuilder.create().texOffs(101, 10).addBox(3.2F, 13.0F, -2.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

		 left_leg.addOrReplaceChild("left_leg15", CubeListBuilder.create().texOffs(119, 3).addBox(4.4F, 14.5F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -12.0F, 0.0F, 0.0F, 0.0F, 0.0436F));

		 left_leg.addOrReplaceChild("left_leg36", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.0F, -12.0F, 0.0F, -0.5236F, 0.0F, 0.1487F));

		 left_leg.addOrReplaceChild("left_leg17", CubeListBuilder.create().texOffs(105, 143).addBox(3.0F, 15.0F, 1.21F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

		 left_leg.addOrReplaceChild("left_leg18", CubeListBuilder.create().texOffs(119, 3).addBox(3.0F, 13.0F, 1.2F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

		 left_leg.addOrReplaceChild("left_leg19", CubeListBuilder.create().texOffs(103, 19).addBox(2.1F, 13.5F, 1.21F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

		 left_leg.addOrReplaceChild("left_leg20", CubeListBuilder.create().texOffs(250, 410).addBox(13.3438F, 1.0166F, 1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -12.0F, 0.0F, 0.0F, 0.0F, 1.2641F));

		 left_leg.addOrReplaceChild("left_leg21", CubeListBuilder.create().texOffs(254, 277).addBox(0.0F, 20.0F, -2.21F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

		 left_leg.addOrReplaceChild("left_leg22", CubeListBuilder.create().texOffs(256, 333).addBox(1.0F, 20.0F, -2.3F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

		 left_leg.addOrReplaceChild("left_leg23", CubeListBuilder.create().texOffs(250, 470).addBox(0.5F, 17.5254F, -4.6357F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -12.0F, 0.0F, 0.1115F, 0.0F, 0.0F));

		 left_leg.addOrReplaceChild("left_leg35", CubeListBuilder.create().texOffs(261, 444).addBox(1.5F, 17.5672F, -4.687F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -12.0F, 0.0F, 0.1115F, 0.0F, 0.0F));

		 left_leg.addOrReplaceChild("left_leg24", CubeListBuilder.create().texOffs(119, 3).addBox(3.2F, 23.0F, -2.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

		 left_leg.addOrReplaceChild("left_leg25", CubeListBuilder.create().texOffs(113, 243).addBox(0.5F, 22.0F, -2.7F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

		 left_leg.addOrReplaceChild("left_leg26", CubeListBuilder.create().texOffs(119, 3).addBox(0.5F, 23.0F, 1.3F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

		 left_leg.addOrReplaceChild("left_leg27", CubeListBuilder.create().texOffs(119, 3).addBox(3.3F, 22.0F, 0.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

		 left_leg.addOrReplaceChild("left_leg28", CubeListBuilder.create().texOffs(119, 3).addBox(3.2F, 18.3F, -2.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

		 left_leg.addOrReplaceChild("left_leg29", CubeListBuilder.create().texOffs(119, 3).addBox(2.2F, 18.3F, 1.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

		 left_leg.addOrReplaceChild("left_leg30", CubeListBuilder.create().texOffs(101, 10).addBox(3.2F, 19.0F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

		 left_leg.addOrReplaceChild("left_leg31", CubeListBuilder.create().texOffs(119, 3).addBox(3.4F, 19.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

		 left_leg.addOrReplaceChild("left_leg32", CubeListBuilder.create().texOffs(250, 450).addBox(6.3559F, 17.3712F, -1.5F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -12.0F, 0.0F, 0.0F, 0.0F, 0.1487F));

		 left_leg.addOrReplaceChild("left_leg33", CubeListBuilder.create().texOffs(121, 4).addBox(1.0F, 19.0F, 1.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

		 left_leg.addOrReplaceChild("left_leg34", CubeListBuilder.create().texOffs(252, 177).mirror().addBox(0.0F, 19.0F, 1.2F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-2.0F, -12.0F, 0.0F));

		 left_leg.addOrReplaceChild("left_leg43", CubeListBuilder.create().texOffs(121, 2).addBox(4.3F, 13.5F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -12.0F, 0.0F, 0.0F, 0.0F, 0.0436F));

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