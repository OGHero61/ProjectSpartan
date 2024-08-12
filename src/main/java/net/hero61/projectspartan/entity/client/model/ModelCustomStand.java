package net.hero61.projectspartan.entity.client.model;// Made with Blockbench 4.10.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

import net.hero61.projectspartan.ProjectSpartan;
import net.minecraft.client.model.ArmorStandArmorModel;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.decoration.ArmorStand;

public class ModelCustomStand extends ArmorStandArmorModel {
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation(ProjectSpartan.MOD_ID, "custom_armor_stand"), "main");
	private final ModelPart stand;
	private final ModelPart capsule;
	private final ModelPart cube1;
	private final ModelPart cube24;
	private final ModelPart cube25;
	private final ModelPart cube2;
	private final ModelPart cube36;
	private final ModelPart cube13;
	private final ModelPart cube14;
	private final ModelPart cube15;
	private final ModelPart cube16;
	private final ModelPart cube17;
	private final ModelPart cube18;
	private final ModelPart cube19;
	private final ModelPart cube20;
	private final ModelPart cube21;
	private final ModelPart cube22;
	private final ModelPart cube23;
	private final ModelPart cube3;
	private final ModelPart cube35;
	private final ModelPart cube4;
	private final ModelPart cube34;
	private final ModelPart cube5;
	private final ModelPart cube33;
	private final ModelPart cube6;
	private final ModelPart cube32;
	private final ModelPart cube7;
	private final ModelPart cube31;
	private final ModelPart cube8;
	private final ModelPart cube26;
	private final ModelPart cube9;
	private final ModelPart cube27;
	private final ModelPart cube10;
	private final ModelPart cube28;
	private final ModelPart cube11;
	private final ModelPart cube29;
	private final ModelPart cube12;
	private final ModelPart cube30;

	public ModelCustomStand(ModelPart root) {
        super(root);
        this.stand = root.getChild("stand");
		this.capsule = root.getChild("capsule");
		this.cube1 = root.getChild("cube1");
		this.cube24 = root.getChild("cube24");
		this.cube25 = root.getChild("cube25");
		this.cube2 = root.getChild("cube2");
		this.cube36 = root.getChild("cube36");
		this.cube13 = root.getChild("cube13");
		this.cube14 = root.getChild("cube14");
		this.cube15 = root.getChild("cube15");
		this.cube16 = root.getChild("cube16");
		this.cube17 = root.getChild("cube17");
		this.cube18 = root.getChild("cube18");
		this.cube19 = root.getChild("cube19");
		this.cube20 = root.getChild("cube20");
		this.cube21 = root.getChild("cube21");
		this.cube22 = root.getChild("cube22");
		this.cube23 = root.getChild("cube23");
		this.cube3 = root.getChild("cube3");
		this.cube35 = root.getChild("cube35");
		this.cube4 = root.getChild("cube4");
		this.cube34 = root.getChild("cube34");
		this.cube5 = root.getChild("cube5");
		this.cube33 = root.getChild("cube33");
		this.cube6 = root.getChild("cube6");
		this.cube32 = root.getChild("cube32");
		this.cube7 = root.getChild("cube7");
		this.cube31 = root.getChild("cube31");
		this.cube8 = root.getChild("cube8");
		this.cube26 = root.getChild("cube26");
		this.cube9 = root.getChild("cube9");
		this.cube27 = root.getChild("cube27");
		this.cube10 = root.getChild("cube10");
		this.cube28 = root.getChild("cube28");
		this.cube11 = root.getChild("cube11");
		this.cube29 = root.getChild("cube29");
		this.cube12 = root.getChild("cube12");
		this.cube30 = root.getChild("cube30");
	}

	public static LayerDefinition createLayer() {
		MeshDefinition definition = new MeshDefinition();
		PartDefinition partdefinition = definition.getRoot();

		PartDefinition stand = partdefinition.addOrReplaceChild("stand", CubeListBuilder.create().texOffs(70, 0).addBox(-4.0F, -33.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(70, 16).addBox(-4.0F, -25.0F, -2.0F, 8.0F, 11.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(94, 16).addBox(-8.0F, -25.0F, -2.0F, 4.0F, 11.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(88, 66).addBox(4.0F, -25.0F, -2.0F, 4.0F, 11.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(82, 82).addBox(-4.0F, -14.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(70, 70).addBox(0.0F, -14.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition capsule = stand.addOrReplaceChild("capsule", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube1 = capsule.addOrReplaceChild("cube1", CubeListBuilder.create().texOffs(56, 68).addBox(-3.0F, -36.02F, -1.0F, 5.0F, 32.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.5F, 2.0F, -8.2321F));

		PartDefinition cube24 = capsule.addOrReplaceChild("cube24", CubeListBuilder.create().texOffs(0, 15).addBox(-3.0F, -4.02F, -1.0F, 5.0F, 2.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offset(0.5F, 2.0F, -8.2321F));

		PartDefinition cube25 = capsule.addOrReplaceChild("cube25", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -4.02F, -1.0F, 5.0F, 2.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offset(0.5F, -32.0F, -8.2321F));

		PartDefinition cube2 = capsule.addOrReplaceChild("cube2", CubeListBuilder.create().texOffs(98, 83).addBox(-6.049F, -4.0F, -3.183F, 5.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0F, -7.0F, 0.0F, 0.5236F, 0.0F));

		PartDefinition cube36 = capsule.addOrReplaceChild("cube36", CubeListBuilder.create().texOffs(85, 58).addBox(-6.049F, -4.0F, -3.183F, 5.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -32.0F, -7.0F, 0.0F, 0.5236F, 0.0F));

		PartDefinition cube13 = capsule.addOrReplaceChild("cube13", CubeListBuilder.create().texOffs(42, 68).addBox(-6.049F, -34.0F, -3.183F, 5.0F, 32.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -7.0F, 0.0F, 0.5236F, 0.0F));

		PartDefinition cube14 = capsule.addOrReplaceChild("cube14", CubeListBuilder.create().texOffs(28, 64).addBox(-8.6471F, -34.0F, -5.7811F, 5.0F, 32.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -7.0F, 0.0F, 1.0472F, 0.0F));

		PartDefinition cube15 = capsule.addOrReplaceChild("cube15", CubeListBuilder.create().texOffs(0, 30).addBox(-9.5981F, -34.0F, -9.3301F, 5.0F, 32.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -7.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition cube16 = capsule.addOrReplaceChild("cube16", CubeListBuilder.create().texOffs(14, 64).addBox(-8.6471F, -34.0F, -12.8792F, 5.0F, 32.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -7.0F, 0.0F, 2.0944F, 0.0F));

		PartDefinition cube17 = capsule.addOrReplaceChild("cube17", CubeListBuilder.create().texOffs(0, 64).addBox(-6.049F, -34.0F, -15.4772F, 5.0F, 32.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -7.0F, 0.0F, 2.618F, 0.0F));

		PartDefinition cube18 = capsule.addOrReplaceChild("cube18", CubeListBuilder.create().texOffs(56, 34).addBox(-2.5F, -34.0F, -16.4282F, 5.0F, 32.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -7.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition cube19 = capsule.addOrReplaceChild("cube19", CubeListBuilder.create().texOffs(56, 0).addBox(1.049F, -34.0F, -15.4772F, 5.0F, 32.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -7.0F, 0.0F, -2.618F, 0.0F));

		PartDefinition cube20 = capsule.addOrReplaceChild("cube20", CubeListBuilder.create().texOffs(42, 34).addBox(3.6471F, -34.0F, -12.8792F, 5.0F, 32.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -7.0F, 0.0F, -2.0944F, 0.0F));

		PartDefinition cube21 = capsule.addOrReplaceChild("cube21", CubeListBuilder.create().texOffs(42, 0).addBox(4.5981F, -34.0F, -9.3301F, 5.0F, 32.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -7.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube22 = capsule.addOrReplaceChild("cube22", CubeListBuilder.create().texOffs(28, 30).addBox(3.6471F, -34.0F, -5.7811F, 5.0F, 32.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -7.0F, 0.0F, -1.0472F, 0.0F));

		PartDefinition cube23 = capsule.addOrReplaceChild("cube23", CubeListBuilder.create().texOffs(14, 30).addBox(1.049F, -34.0F, -3.183F, 5.0F, 32.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -7.0F, 0.0F, -0.5236F, 0.0F));

		PartDefinition cube3 = capsule.addOrReplaceChild("cube3", CubeListBuilder.create().texOffs(104, 42).addBox(-8.6471F, -4.01F, -5.7811F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0F, -7.0F, 0.0F, 1.0472F, 0.0F));

		PartDefinition cube35 = capsule.addOrReplaceChild("cube35", CubeListBuilder.create().texOffs(101, 100).addBox(-8.6471F, -4.01F, -5.7811F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -32.0F, -7.0F, 0.0F, 1.0472F, 0.0F));

		PartDefinition cube4 = capsule.addOrReplaceChild("cube4", CubeListBuilder.create().texOffs(70, 49).addBox(-9.5981F, -4.02F, -9.3301F, 5.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0F, -7.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition cube34 = capsule.addOrReplaceChild("cube34", CubeListBuilder.create().texOffs(68, 61).addBox(-9.5981F, -4.02F, -9.3301F, 5.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -32.0F, -7.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition cube5 = capsule.addOrReplaceChild("cube5", CubeListBuilder.create().texOffs(81, 100).addBox(3.6471F, -4.01F, 7.8792F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0F, -7.0F, 0.0F, -1.0472F, 0.0F));

		PartDefinition cube33 = capsule.addOrReplaceChild("cube33", CubeListBuilder.create().texOffs(94, 51).addBox(3.6471F, -4.01F, 7.8792F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -32.0F, -7.0F, 0.0F, -1.0472F, 0.0F));

		PartDefinition cube6 = capsule.addOrReplaceChild("cube6", CubeListBuilder.create().texOffs(98, 75).addBox(1.049F, -4.0F, 9.4772F, 5.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0F, -7.0F, 0.0F, -0.5236F, 0.0F));

		PartDefinition cube32 = capsule.addOrReplaceChild("cube32", CubeListBuilder.create().texOffs(88, 34).addBox(1.049F, -4.0F, 9.4772F, 5.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -32.0F, -7.0F, 0.0F, -0.5236F, 0.0F));

		PartDefinition cube7 = capsule.addOrReplaceChild("cube7", CubeListBuilder.create().texOffs(22, 98).addBox(-2.5F, -4.02F, 10.4282F, 5.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 2.0F, -7.0F));

		PartDefinition cube31 = capsule.addOrReplaceChild("cube31", CubeListBuilder.create().texOffs(88, 43).addBox(-2.5F, -4.02F, 10.4282F, 5.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -32.0F, -7.0F));

		PartDefinition cube8 = capsule.addOrReplaceChild("cube8", CubeListBuilder.create().texOffs(104, 31).addBox(1.049F, -4.0F, -3.183F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0F, -7.0F, 0.0F, -0.5236F, 0.0F));

		PartDefinition cube26 = capsule.addOrReplaceChild("cube26", CubeListBuilder.create().texOffs(39, 102).addBox(1.049F, -4.0F, -3.183F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -32.0F, -7.0F, 0.0F, -0.5236F, 0.0F));

		PartDefinition cube9 = capsule.addOrReplaceChild("cube9", CubeListBuilder.create().texOffs(0, 98).addBox(3.6471F, -4.01F, -5.7811F, 5.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0F, -7.0F, 0.0F, -1.0472F, 0.0F));

		PartDefinition cube27 = capsule.addOrReplaceChild("cube27", CubeListBuilder.create().texOffs(94, 0).addBox(3.6471F, -4.01F, -5.7811F, 5.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -32.0F, -7.0F, 0.0F, -1.0472F, 0.0F));

		PartDefinition cube10 = capsule.addOrReplaceChild("cube10", CubeListBuilder.create().texOffs(70, 40).addBox(-9.5981F, -4.02F, 2.3301F, 5.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0F, -7.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition cube28 = capsule.addOrReplaceChild("cube28", CubeListBuilder.create().texOffs(70, 31).addBox(-9.5981F, -4.02F, 2.3301F, 5.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -32.0F, -7.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition cube11 = capsule.addOrReplaceChild("cube11", CubeListBuilder.create().texOffs(102, 61).addBox(-8.6471F, -4.01F, 7.8792F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0F, -7.0F, 0.0F, 1.0472F, 0.0F));

		PartDefinition cube29 = capsule.addOrReplaceChild("cube29", CubeListBuilder.create().texOffs(102, 8).addBox(-8.6471F, -4.01F, 7.8792F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -32.0F, -7.0F, 0.0F, 1.0472F, 0.0F));

		PartDefinition cube12 = capsule.addOrReplaceChild("cube12", CubeListBuilder.create().texOffs(64, 96).addBox(-6.049F, -4.0F, 9.4772F, 5.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0F, -7.0F, 0.0F, 0.5236F, 0.0F));

		PartDefinition cube30 = capsule.addOrReplaceChild("cube30", CubeListBuilder.create().texOffs(92, 92).addBox(-6.049F, -4.0F, 9.4772F, 5.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -32.0F, -7.0F, 0.0F, 0.5236F, 0.0F));

		return LayerDefinition.create(definition, 128, 128);
	}


	@Override
	public void setupAnim(ArmorStand entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		// Set animations or transformations for the model parts
	}
}
