package net.hero61.projectspartan.entity.client.model;
// Made with Blockbench 4.10.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.hero61.projectspartan.util.ModelUtils;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.world.entity.LivingEntity;

public class AirAssaultEntityModel<T extends LivingEntity> extends HumanoidModel<T> {
    // This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
    public AirAssaultEntityModel(ModelPart modelPart) {
        super(modelPart);
    }

    public static LayerDefinition createLayer() {
        MeshDefinition definition = ModelUtils.createBlankHumanoidMesh();
        PartDefinition root = definition.getRoot();

        PartDefinition head = root.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

        head.addOrReplaceChild("helmet2", CubeListBuilder.create().texOffs(0, 70).mirror().addBox(-4.0F, -3.1F, -3.73F, 8.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.409F, 0.0F, 0.0F));

        head.addOrReplaceChild("helmet3", CubeListBuilder.create().texOffs(0, 90).mirror().addBox(-1.0F, -0.8F, -4.9F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2603F, 0.0F, 0.0F));

        head.addOrReplaceChild("helmet4", CubeListBuilder.create().texOffs(1, 110).mirror().addBox(-0.5F, -1.0F, -5.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2603F, 0.0F, 0.0F));

        head.addOrReplaceChild("helmet5", CubeListBuilder.create().texOffs(0, 130).mirror().addBox(-3.99F, 0.1F, -4.7F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.5205F, 0.0F, 0.0F));

        head.addOrReplaceChild("helmet6", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-4.05F, -7.0F, -6.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

        head.addOrReplaceChild("helmet7", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(1.05F, -7.0F, -6.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

        head.addOrReplaceChild("helmet8", CubeListBuilder.create().texOffs(0, 150).mirror().addBox(1.05F, -8.7F, -3.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3718F, 0.0F, 0.0F));

        head.addOrReplaceChild("helmet9", CubeListBuilder.create().texOffs(0, 170).mirror().addBox(-4.05F, -8.7F, -3.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3718F, 0.0F, 0.0F));

        head.addOrReplaceChild("helmet10", CubeListBuilder.create().texOffs(100, -1).mirror().addBox(-3.1056F, -7.0F, -6.2334F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

        head.addOrReplaceChild("helmet11", CubeListBuilder.create().texOffs(0, 190).mirror().addBox(1.0F, -8.8F, -3.15F, 3.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0372F, 0.0F, 0.0F));

        head.addOrReplaceChild("helmet12", CubeListBuilder.create().texOffs(0, 210).mirror().addBox(-4.0F, -8.8F, -3.15F, 3.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0372F, 0.0F, 0.0F));

        head.addOrReplaceChild("helmet13", CubeListBuilder.create().texOffs(0, 230).mirror().addBox(1.05F, -2.7F, -9.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.9666F, 0.0F, 0.0F));

        head.addOrReplaceChild("helmet14", CubeListBuilder.create().texOffs(0, 250).mirror().addBox(-4.05F, -2.7F, -9.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.9666F, 0.0F, 0.0F));

        head.addOrReplaceChild("helmet15", CubeListBuilder.create().texOffs(0, 270).mirror().addBox(-2.9F, -7.0F, -6.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.1859F, 0.0F));

        head.addOrReplaceChild("helmet16", CubeListBuilder.create().texOffs(2, 290).mirror().addBox(1.7F, -7.0F, -6.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.2231F, 0.0F));

        head.addOrReplaceChild("helmet17", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-4.5F, -7.0F, -4.0F, 9.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

        head.addOrReplaceChild("helmet18", CubeListBuilder.create().texOffs(39, 306).mirror().addBox(-0.2F, -2.7F, -2.6F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2603F, 0.2356F, 0.0F));

        head.addOrReplaceChild("helmet19", CubeListBuilder.create().texOffs(0, 330).mirror().addBox(-4.5F, -6.1F, 1.0F, 9.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2974F, 0.0F, 0.0F));

        head.addOrReplaceChild("helmet20", CubeListBuilder.create().texOffs(-2, 348).mirror().addBox(-4.9F, -2.7F, -2.6F, 7.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2603F, -0.2356F, 0.0F));

        head.addOrReplaceChild("helmet21", CubeListBuilder.create().texOffs(0, 370).mirror().addBox(-4.5F, -5.8F, -5.3F, 9.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2603F, 0.0F, 0.0F));

        head.addOrReplaceChild("helmet22", CubeListBuilder.create().texOffs(470, 116).mirror().addBox(-1.0F, -6.0F, 4.3F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2231F, 0.0F, 0.0F));

        head.addOrReplaceChild("helmet23", CubeListBuilder.create().texOffs(468, 116).mirror().addBox(-2.0F, -5.0F, 4.3F, 4.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2231F, 0.0F, 0.0F));

        head.addOrReplaceChild("helmet24", CubeListBuilder.create().texOffs(0, 430).mirror().addBox(1.0F, -8.9797F, -0.4767F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2974F, 0.0F, 0.0F));

        head.addOrReplaceChild("helmet25", CubeListBuilder.create().texOffs(0, 450).mirror().addBox(-4.0F, -8.9797F, -0.4767F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2974F, 0.0F, 0.0F));

        head.addOrReplaceChild("helmet26", CubeListBuilder.create().texOffs(-1, 470).mirror().addBox(0.1F, -8.4F, -3.7F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.8923F, 0.0367F, 0.0F));

        head.addOrReplaceChild("helmet27", CubeListBuilder.create().texOffs(0, 490).mirror().addBox(-4.1F, -8.4F, -3.7F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.8923F, 0.0F, 0.0F));

        head.addOrReplaceChild("helmet28", CubeListBuilder.create().texOffs(80, 50).mirror().addBox(-6.8F, -7.0F, -3.0F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.3346F));

        head.addOrReplaceChild("helmet29", CubeListBuilder.create().texOffs(80, 70).mirror().addBox(-6.8F, -6.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.3346F));

        head.addOrReplaceChild("helmet30", CubeListBuilder.create().texOffs(80, 90).mirror().addBox(-6.8F, -6.0F, 2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.3346F));

        head.addOrReplaceChild("helmet31", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-4.0F, -7.1F, 3.5F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

        head.addOrReplaceChild("helmet32", CubeListBuilder.create().texOffs(300, 130).mirror().addBox(5.5F, -7.2F, -3.0F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2974F));

        head.addOrReplaceChild("helmet33", CubeListBuilder.create().texOffs(300, 150).mirror().addBox(5.5F, -6.2F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2974F));

        head.addOrReplaceChild("helmet34", CubeListBuilder.create().texOffs(300, 170).mirror().addBox(5.5F, -6.2F, 2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2974F));

        head.addOrReplaceChild("helmet35", CubeListBuilder.create().texOffs(80, 170).mirror().addBox(-4.5F, -6.0F, 3.5F, 9.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2231F, 0.0F, 0.0F));

        head.addOrReplaceChild("helmet36", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-4.8F, -7.0F, -4.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

        head.addOrReplaceChild("helmet37", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(3.7F, -7.0F, -4.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

        head.addOrReplaceChild("helmet38", CubeListBuilder.create().texOffs(80, 190).mirror().addBox(-0.7F, -7.6F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.632F));

        head.addOrReplaceChild("helmet39", CubeListBuilder.create().texOffs(80, 110).mirror().addBox(-4.5F, -1.8F, 3.1F, 9.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.5949F, 0.0F, 0.0F));

        head.addOrReplaceChild("helmet40", CubeListBuilder.create().texOffs(79, 129).mirror().addBox(-1.5F, -8.8134F, -0.1409F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.632F, 0.0F, 0.0F));

        head.addOrReplaceChild("helmet41", CubeListBuilder.create().texOffs(80, 150).mirror().addBox(-1.5F, -8.6861F, -3.2251F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0372F, 0.0F, 0.0F));

        head.addOrReplaceChild("helmet42", CubeListBuilder.create().texOffs(300, 189).mirror().addBox(-1.5F, -8.8503F, -0.4F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2974F, 0.0F, 0.0F));

        head.addOrReplaceChild("helmet43", CubeListBuilder.create().texOffs(110, 96).mirror().addBox(-0.8599F, -7.0F, -6.1579F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

        head.addOrReplaceChild("helmet48", CubeListBuilder.create().texOffs(399, 110).mirror().addBox(-5.1636F, -5.9868F, -4.2218F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1487F, 0.0F, 0.3491F));

        head.addOrReplaceChild("helmet49", CubeListBuilder.create().texOffs(400, 91).mirror().addBox(3.1636F, -5.9868F, -4.2218F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1487F, 0.0F, -0.3491F));

        head.addOrReplaceChild("helmet50", CubeListBuilder.create().texOffs(401, 71).mirror().addBox(-4.35F, -2.3F, -3.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2603F, 0.0F, 0.0436F));

        head.addOrReplaceChild("helmet51", CubeListBuilder.create().texOffs(401, 51).mirror().addBox(4.22F, -2.3F, -3.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0F, 0.0F, 0.2603F, 0.0F, -0.0436F));

        head.addOrReplaceChild("helmet52", CubeListBuilder.create().texOffs(450, 190).mirror().addBox(-4.02F, -7.4F, -3.8F, 8.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1487F, 0.0F, 0.0F));

        head.addOrReplaceChild("helmet53", CubeListBuilder.create().texOffs(450, 170).mirror().addBox(3.01F, -7.4F, -3.7F, 1.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1487F, 0.0F, 0.0F));

        head.addOrReplaceChild("helmet57", CubeListBuilder.create().texOffs(450, 150).mirror().addBox(-2.0F, -5.65F, -3.55F, 4.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2231F, 0.0F, 0.0F));

        head.addOrReplaceChild("helmet58", CubeListBuilder.create().texOffs(454, 94).mirror().addBox(-4.15F, -3.8221F, -1.0609F, 8.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.7159F, 0.0F, 0.0F));

        head.addOrReplaceChild("helmet59", CubeListBuilder.create().texOffs(454, 74).mirror().addBox(3.15F, -3.8221F, -1.0609F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.7159F, 0.0F, 0.0F));

        head.addOrReplaceChild("helmet60", CubeListBuilder.create().texOffs(444, 84).mirror().addBox(-1.5F, -6.8F, -4.1F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1487F, 0.0F, 0.0F));

        head.addOrReplaceChild("helmet61", CubeListBuilder.create().texOffs(431, 51).mirror().addBox(-4.2F, -6.1F, -0.3F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2974F, 0.0F, 0.0F));

        head.addOrReplaceChild("helmet62", CubeListBuilder.create().texOffs(450, 110).mirror().addBox(-2.0F, -5.15F, 4.3F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.4871F, 0.0F, 0.0F));

        head.addOrReplaceChild("helmet63", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-4.5F, -7.0F, -5.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

        head.addOrReplaceChild("helmet64", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(3.5F, -7.0F, -5.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

        head.addOrReplaceChild("helmet65", CubeListBuilder.create().texOffs(431, 51).mirror().addBox(3.2F, -6.1F, -0.3F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2974F, 0.0F, 0.0F));

        head.addOrReplaceChild("helmet66", CubeListBuilder.create().texOffs(435, 67).mirror().addBox(-4.2F, -3.5F, -1.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

        head.addOrReplaceChild("helmet67", CubeListBuilder.create().texOffs(435, 67).mirror().addBox(3.2F, -3.5F, -1.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

        head.addOrReplaceChild("helmet68", CubeListBuilder.create().texOffs(400, 60).mirror().addBox(-4.2F, -6.3F, -5.0F, 5.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0436F, 0.0F, 0.0F));

        head.addOrReplaceChild("helmet69", CubeListBuilder.create().texOffs(433, 100).mirror().addBox(0.2F, -6.3F, -5.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0436F, 0.0F, 0.0F));

        head.addOrReplaceChild("helmet70", CubeListBuilder.create().texOffs(300, 0).mirror().addBox(-4.0F, -4.0F, 3.1F, 8.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

        head.addOrReplaceChild("helmet71", CubeListBuilder.create().texOffs(300, 0).mirror().addBox(-4.1F, -4.0F, -1.0F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

        head.addOrReplaceChild("helmet72", CubeListBuilder.create().texOffs(300, 0).mirror().addBox(-4.1F, -1.0F, -3.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

        head.addOrReplaceChild("helmet73", CubeListBuilder.create().texOffs(300, 0).mirror().addBox(3.1F, -1.0F, -3.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

        head.addOrReplaceChild("helmet74", CubeListBuilder.create().texOffs(300, 0).mirror().addBox(3.1F, -4.0F, -1.0F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

        head.addOrReplaceChild("helmet75", CubeListBuilder.create().texOffs(300, 0).mirror().addBox(-4.0F, -0.9F, -4.0F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

        head.addOrReplaceChild("helmet76", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        head.addOrReplaceChild("helmet76_r1", CubeListBuilder.create().texOffs(74, 193).mirror().addBox(0.0F, -31.7F, 0.0F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.0F, 21.253F, 15.984F, 0.5236F, 0.0F, 0.0F));

        head.addOrReplaceChild("helmet77", CubeListBuilder.create().texOffs(73, 192).mirror().addBox(-5.0F, -6.7F, 1.0F, 10.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

        head.addOrReplaceChild("helmet78", CubeListBuilder.create().texOffs(83, 193).mirror().addBox(-5.0F, -7.3024F, -0.7519F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.5236F, 0.0F, 0.0F));

        head.addOrReplaceChild("helmet79", CubeListBuilder.create().texOffs(81, 191).mirror().addBox(-5.0F, -6.2F, 0.866F, 10.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

        head.addOrReplaceChild("helmet80", CubeListBuilder.create().texOffs(83, 193).mirror().addBox(-5.0F, -6.2F, 0.134F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

        head.addOrReplaceChild("helmet81", CubeListBuilder.create().texOffs(83, 193).mirror().addBox(-5.0F, -6.2F, 0.134F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 2.0F, 0.0F));

        head.addOrReplaceChild("helmet82", CubeListBuilder.create().texOffs(100, 180).mirror().addBox(-4.01F, -4.2F, 0.866F, 9.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

        head.addOrReplaceChild("helmet83", CubeListBuilder.create().texOffs(83, 193).mirror().addBox(-5.0F, -1.8383F, 3.9481F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.5236F, 0.0F, 0.0F));

        head.addOrReplaceChild("head84", CubeListBuilder.create().texOffs(83, 193).mirror().addBox(-5.0F, -3.8383F, -1.484F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.5236F, 0.0F, 0.0F));

        head.addOrReplaceChild("head85", CubeListBuilder.create().texOffs(82, 192).mirror().addBox(-5.0F, -3.7F, 1.0F, 10.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

        head.addOrReplaceChild("helmet86", CubeListBuilder.create().texOffs(109, 180).mirror().addBox(-4.99F, -4.2F, 0.866F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

        head.addOrReplaceChild("helmet1", CubeListBuilder.create().texOffs(0, 50).mirror().addBox(-1.0F, -2.9F, -4.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.409F, 0.0F, 0.0F));

        PartDefinition body = root.addOrReplaceChild("body", CubeListBuilder.create().texOffs(16, 16).mirror().addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

        body.addOrReplaceChild("chest1", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-3.5F, 0.0F, -3.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

        body.addOrReplaceChild("chest2", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(1.5F, 0.0F, -3.0F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

        body.addOrReplaceChild("chest3", CubeListBuilder.create().texOffs(80, 210).mirror().addBox(-2.5F, 3.0F, -4.81F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2974F, 0.0F, 0.0F));

        body.addOrReplaceChild("chest4", CubeListBuilder.create().texOffs(80, 230).mirror().addBox(-3.5F, 2.5F, -3.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0744F, 0.0F, 0.0F));

        body.addOrReplaceChild("chest5", CubeListBuilder.create().texOffs(80, 250).mirror().addBox(2.5F, 2.5F, -3.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0744F, 0.0F, 0.0F));

        body.addOrReplaceChild("chest6", CubeListBuilder.create().texOffs(80, 270).mirror().addBox(-1.5F, 1.8F, -2.8F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1487F, 0.0F, 0.0F));

        body.addOrReplaceChild("chest7", CubeListBuilder.create().texOffs(80, 290).mirror().addBox(-1.5F, 2.8F, -3.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1487F, 0.0F, 0.0F));

        body.addOrReplaceChild("chest8", CubeListBuilder.create().texOffs(80, 310).mirror().addBox(1.5F, 3.0F, -4.81F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2974F, 0.0F, 0.0F));

        body.addOrReplaceChild("chest9", CubeListBuilder.create().texOffs(80, 330).mirror().addBox(-1.5F, 3.0F, -4.8F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2974F, 0.0F, 0.0F));

        body.addOrReplaceChild("chest10", CubeListBuilder.create().texOffs(80, 350).mirror().addBox(-2.0F, 4.0F, -4.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2974F, 0.0F, 0.0F));

        body.addOrReplaceChild("chest11", CubeListBuilder.create().texOffs(80, 370).mirror().addBox(1.0F, 4.0F, -4.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2974F, 0.0F, 0.0F));

        body.addOrReplaceChild("chest12", CubeListBuilder.create().texOffs(80, 390).mirror().addBox(-1.5F, 2.5F, -5.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2974F, 0.0F, 0.0F));

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

        body.addOrReplaceChild("chest26", CubeListBuilder.create().texOffs(479, 59).mirror().addBox(-0.5F, 1.7F, -2.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1487F, 0.0F, 0.0F));

        body.addOrReplaceChild("chest27", CubeListBuilder.create().texOffs(150, 210).mirror().addBox(-4.0F, 4.0F, -4.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2974F, 0.0F, 0.0F));

        body.addOrReplaceChild("chest28", CubeListBuilder.create().texOffs(150, 230).mirror().addBox(2.0F, 4.0F, -4.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2974F, 0.0F, 0.0F));

        body.addOrReplaceChild("chest29", CubeListBuilder.create().texOffs(150, 230).mirror().addBox(-4.5F, 4.5F, -4.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2974F, 0.0F, 0.0F));

        body.addOrReplaceChild("chest30", CubeListBuilder.create().texOffs(150, 250).mirror().addBox(2.5F, 4.5F, -4.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2974F, 0.0F, 0.0F));

        body.addOrReplaceChild("chest31", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-2.0F, 6.5F, -3.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

        body.addOrReplaceChild("chest32", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-1.0F, 7.0F, -3.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

        body.addOrReplaceChild("chest33", CubeListBuilder.create().texOffs(164, 153).mirror().addBox(-2.5F, 7.2F, -2.8F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

        body.addOrReplaceChild("chest34", CubeListBuilder.create().texOffs(295, 102).mirror().addBox(-1.5F, 7.8F, -2.8F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

        body.addOrReplaceChild("chest35", CubeListBuilder.create().texOffs(150, 270).mirror().addBox(-3.0F, 3.0F, -4.8F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2974F, 0.0F, 0.0F));

        body.addOrReplaceChild("chest36", CubeListBuilder.create().texOffs(150, 290).mirror().addBox(-3.5F, 4.5F, -4.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2974F, 0.0F, 0.0F));

        body.addOrReplaceChild("chest37", CubeListBuilder.create().texOffs(150, 310).mirror().addBox(2.0F, 3.0F, -4.8F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2974F, 0.0F, 0.0F));

        body.addOrReplaceChild("chest38", CubeListBuilder.create().texOffs(150, 330).mirror().addBox(2.5F, 4.5F, -4.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2974F, 0.0F, 0.0F));

        body.addOrReplaceChild("chest39", CubeListBuilder.create().texOffs(151, 350).mirror().addBox(-1.6F, 10.25F, -2.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.1487F));

        body.addOrReplaceChild("chest40", CubeListBuilder.create().texOffs(260, 230).mirror().addBox(-1.5F, 11.0F, -2.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

        body.addOrReplaceChild("chest41", CubeListBuilder.create().texOffs(150, 370).mirror().addBox(1.6F, 10.6F, -2.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.7015F));

        body.addOrReplaceChild("chest42", CubeListBuilder.create().texOffs(150, 390).mirror().addBox(-4.6F, 10.6F, -2.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0F, 1.0F, 0.0F, 0.0F, 0.0F, -0.7015F));

        body.addOrReplaceChild("chest43", CubeListBuilder.create().texOffs(291, 180).mirror().addBox(-1.4F, 10.6F, -2.51F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

        body.addOrReplaceChild("chest44", CubeListBuilder.create().texOffs(150, 410).mirror().addBox(-2.0F, 10.0F, -0.2F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2603F, 0.0F, 0.0F));

        body.addOrReplaceChild("chest45", CubeListBuilder.create().texOffs(150, 430).mirror().addBox(-0.4F, 10.25F, -2.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1487F));

        body.addOrReplaceChild("chest46", CubeListBuilder.create().texOffs(150, 450).mirror().addBox(-1.0F, 10.6F, -4.8F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1487F, 0.0F, 0.0F));

        body.addOrReplaceChild("chest47", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        body.addOrReplaceChild("chest48", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        body.addOrReplaceChild("chest50", CubeListBuilder.create().texOffs(449, 50).mirror().addBox(-3.0F, 0.0F, -2.4F, 6.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

        body.addOrReplaceChild("chest51", CubeListBuilder.create().texOffs(150, 470).mirror().addBox(2.5F, 0.0F, -0.5F, 3.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1859F, 0.0F, 0.0F));

        body.addOrReplaceChild("chest52", CubeListBuilder.create().texOffs(150, 490).mirror().addBox(-5.5F, 0.0F, -0.5F, 3.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1859F, 0.0F, 0.0F));

        body.addOrReplaceChild("chest53", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.409F, 0.0F, 0.0F));

        body.addOrReplaceChild("chest54", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.409F, 0.0F, 0.0F));

        body.addOrReplaceChild("chest55", CubeListBuilder.create().texOffs(200, 90).mirror().addBox(3.5F, -0.3F, -2.3F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1115F, 0.0F, 0.0F));

        body.addOrReplaceChild("chest56", CubeListBuilder.create().texOffs(300, 210).mirror().addBox(4.5F, -0.3F, -1.3F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1115F, 0.0F, 0.0F));

        body.addOrReplaceChild("chest57", CubeListBuilder.create().texOffs(200, 110).mirror().addBox(-5.5F, -0.3F, -1.3F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1115F, 0.0F, 0.0F));

        body.addOrReplaceChild("chest58", CubeListBuilder.create().texOffs(200, 130).mirror().addBox(-4.5F, -0.3F, -2.3F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1115F, 0.0F, 0.0F));

        body.addOrReplaceChild("chest59", CubeListBuilder.create().texOffs(200, 150).mirror().addBox(2.5F, 0.5F, 0.7F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.7854F, 0.0F, 0.0F));

        body.addOrReplaceChild("chest60", CubeListBuilder.create().texOffs(209, 193).mirror().addBox(-5.5F, 0.5F, 0.7F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.7854F, 0.0F, 0.0F));

        body.addOrReplaceChild("chest61", CubeListBuilder.create().texOffs(200, 190).mirror().addBox(0.9794F, -0.1275F, 0.524F, 1.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1859F, 0.0F, 0.1309F));

        body.addOrReplaceChild("chest62", CubeListBuilder.create().texOffs(200, 210).mirror().addBox(1.1241F, 0.24F, 0.5F, 1.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0F, 0.0F, 0.0F, 0.1859F, 0.0F, -0.1309F));

        body.addOrReplaceChild("chest63", CubeListBuilder.create().texOffs(200, 230).mirror().addBox(2.0F, 1.0F, 0.5F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1859F, 0.0F, 0.0F));

        body.addOrReplaceChild("chest64", CubeListBuilder.create().texOffs(200, 250).mirror().addBox(-3.0F, 1.0F, 0.5F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1859F, 0.0F, 0.0F));

        body.addOrReplaceChild("chest65", CubeListBuilder.create().texOffs(200, 270).mirror().addBox(-1.0F, 0.0F, 0.5F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1859F, 0.0F, 0.0F));

        body.addOrReplaceChild("chest67", CubeListBuilder.create().texOffs(199, 310).mirror().addBox(-1.0F, 3.7F, 2.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1487F, 0.0F, 0.0F));

        body.addOrReplaceChild("chest68", CubeListBuilder.create().texOffs(457, 81).mirror().addBox(-0.5F, 1.6F, 0.7F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1859F, 0.0F, 0.0F));

        body.addOrReplaceChild("chest69", CubeListBuilder.create().texOffs(204, 108).mirror().addBox(-4.5F, 5.3F, -1.5F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

        body.addOrReplaceChild("chest70", CubeListBuilder.create().texOffs(231, 224).mirror().addBox(1.5F, 5.3F, -1.5F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

        body.addOrReplaceChild("chest71", CubeListBuilder.create().texOffs(476, 46).mirror().addBox(-1.0F, 2.0F, 0.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1859F, 0.0F, 0.0F));

        body.addOrReplaceChild("chest73", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.409F, 0.0F, 0.0F));

        body.addOrReplaceChild("chest74", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.409F, 0.0F, 0.0F));

        body.addOrReplaceChild("chest75", CubeListBuilder.create().texOffs(473, 107).mirror().addBox(-4.5F, 1.5F, 3.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1859F, 0.0F, 0.0F));

        body.addOrReplaceChild("chest76", CubeListBuilder.create().texOffs(469, 68).mirror().addBox(3.5F, 1.5F, 3.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1859F, 0.0F, 0.0F));

        body.addOrReplaceChild("chest72", CubeListBuilder.create().texOffs(435, 118).mirror().addBox(-1.0F, 3.0F, 1.1F, 2.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1487F, 0.0F, 0.0F));

        body.addOrReplaceChild("chest77", CubeListBuilder.create().texOffs(313, 230).mirror().addBox(-3.5F, 10.6F, 1.5F, 7.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

        body.addOrReplaceChild("chest78", CubeListBuilder.create().texOffs(201, 350).mirror().addBox(-1.0F, 10.1F, 2.7F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1859F, 0.0F, 0.0F));

        body.addOrReplaceChild("chest79", CubeListBuilder.create().texOffs(201, 370).mirror().addBox(-1.5F, 9.6F, 1.8F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

        body.addOrReplaceChild("chest80", CubeListBuilder.create().texOffs(300, 0).mirror().addBox(-3.0F, 0.0F, 1.4F, 6.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

        body.addOrReplaceChild("chest81", CubeListBuilder.create().texOffs(200, 390).mirror().addBox(-3.5F, 2.6F, 0.9F, 7.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.409F, 0.0F, 0.0F));

        body.addOrReplaceChild("chest82", CubeListBuilder.create().texOffs(200, 410).mirror().addBox(-3.5F, 0.9F, -2.3F, 7.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1859F, 0.0F, 0.0F));

        body.addOrReplaceChild("body83", CubeListBuilder.create().texOffs(201, 71).mirror().addBox(-5.5F, 1.6194F, 3.529F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.409F, 0.0F, 0.0F));

        body.addOrReplaceChild("body67", CubeListBuilder.create().texOffs(201, 71).mirror().addBox(2.5F, 1.6194F, 3.529F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.409F, 0.0F, 0.0F));

        PartDefinition right_arm = root.addOrReplaceChild("right_arm", CubeListBuilder.create().texOffs(40, 16).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F));

        right_arm.addOrReplaceChild("right_arm31", CubeListBuilder.create().texOffs(341, 70).addBox(-8.0F, -24.0F, -2.1F, 4.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, 22.0F, 0.0F));

        right_arm.addOrReplaceChild("right_arm35", CubeListBuilder.create().texOffs(400, 0).addBox(-8.0F, -24.0F, 1.1F, 4.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, 22.0F, 0.0F));

        right_arm.addOrReplaceChild("right_arm36", CubeListBuilder.create().texOffs(343, 98).addBox(-8.1F, -24.0F, -2.0F, 1.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, 22.0F, 0.0F));

        right_arm.addOrReplaceChild("right_arm37", CubeListBuilder.create().texOffs(359, 48).addBox(0.1F, 0.0F, -2.0F, 1.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -2.0F, 0.0F));

        right_arm.addOrReplaceChild("right_arm38", CubeListBuilder.create().texOffs(333, 203).addBox(-3.0F, -24.1F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 22.0F, 0.0F));

        right_arm.addOrReplaceChild("right_arm39", CubeListBuilder.create().texOffs(339, 158).addBox(-8.0F, -12.9F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, 22.0F, 0.0F));

        right_arm.addOrReplaceChild("right_arm40", CubeListBuilder.create().texOffs(100, 0).addBox(-8.0F, -21.5F, -2.3F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, 22.0F, 0.0F));

        right_arm.addOrReplaceChild("right_arm41", CubeListBuilder.create().texOffs(100, 0).addBox(-3.0F, -21.5F, 1.3F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 22.0F, 0.0F));

        right_arm.addOrReplaceChild("right_arm42", CubeListBuilder.create().texOffs(100, 0).addBox(-3.3F, 0.5F, -2.1F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        right_arm.addOrReplaceChild("right_arm43", CubeListBuilder.create().texOffs(100, 0).addBox(-3.3F, 0.5F, 1.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        right_arm.addOrReplaceChild("right_arm44", CubeListBuilder.create().texOffs(100, 0).addBox(0.3F, 1.0F, -2.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        right_arm.addOrReplaceChild("right_arm45", CubeListBuilder.create().texOffs(300, 0).addBox(0.3F, 1.0F, 1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        right_arm.addOrReplaceChild("right_arm46", CubeListBuilder.create().texOffs(200, 430).addBox(-2.0F, -0.2F, -2.9F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1859F, 0.0F, 0.0F));

        right_arm.addOrReplaceChild("right_arm47", CubeListBuilder.create().texOffs(300, 230).addBox(-3.9F, -0.8F, -1.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2603F));

        right_arm.addOrReplaceChild("right_arm48", CubeListBuilder.create().texOffs(199, 448).addBox(-3.8251F, -1.8959F, -1.99F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2231F));

        right_arm.addOrReplaceChild("right_arm49", CubeListBuilder.create().texOffs(200, 470).addBox(-9.2463F, -0.154F, 0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, -2.0F, 0.0F, 0.0F, 0.0F, -0.2603F));

        right_arm.addOrReplaceChild("right_arm50", CubeListBuilder.create().texOffs(200, 490).addBox(-8.9F, -0.154F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, -2.0F, 0.0F, 0.0F, 0.0F, -0.2603F));

        right_arm.addOrReplaceChild("right_arm51", CubeListBuilder.create().texOffs(250, 50).addBox(-3.5F, 1.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.2231F));

        right_arm.addOrReplaceChild("right_arm52", CubeListBuilder.create().texOffs(248, 68).addBox(-3.95F, -22.2F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, 22.0F, 0.0F, 0.0F, 0.0F, -0.2231F));

        right_arm.addOrReplaceChild("right_arm53", CubeListBuilder.create().texOffs(250, 90).addBox(-7.0F, 1.8F, 2.4F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, -2.0F, 0.0F, -0.2603F, 0.0F, 0.0F));

        right_arm.addOrReplaceChild("right_arm54", CubeListBuilder.create().texOffs(100, 0).addBox(-5.0F, 7.0F, -2.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, -2.0F, 0.0F));

        right_arm.addOrReplaceChild("right_arm55", CubeListBuilder.create().texOffs(59, 55).addBox(-8.0F, 7.0F, -2.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, -2.0F, 0.0F));

        right_arm.addOrReplaceChild("right_arm56", CubeListBuilder.create().texOffs(43, 91).addBox(-7.0F, 8.0F, -2.4F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, -2.0F, 0.0F));

        right_arm.addOrReplaceChild("right_arm57", CubeListBuilder.create().texOffs(297, 75).addBox(-8.3F, 7.0F, -2.1F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, -2.0F, 0.0F));

        right_arm.addOrReplaceChild("right_arm58", CubeListBuilder.create().texOffs(317, 76).addBox(-8.3F, 7.0F, 1.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, -2.0F, 0.0F));

        right_arm.addOrReplaceChild("right_arm59", CubeListBuilder.create().texOffs(57, 89).addBox(-8.0F, 7.0F, 1.3F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, -2.0F, 0.0F));

        right_arm.addOrReplaceChild("right_arm60", CubeListBuilder.create().texOffs(100, 0).addBox(-4.7F, 7.0F, -2.1F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, -2.0F, 0.0F));

        right_arm.addOrReplaceChild("right_arm61", CubeListBuilder.create().texOffs(100, 0).addBox(-4.7F, 7.0F, 1.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, -2.0F, 0.0F));

        right_arm.addOrReplaceChild("right_arm62", CubeListBuilder.create().texOffs(250, 110).addBox(-7.5F, 6.0F, 2.1F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, -2.0F, 0.0F, -0.0744F, 0.0F, 0.0F));

        right_arm.addOrReplaceChild("right_arm63", CubeListBuilder.create().texOffs(250, 130).addBox(-9.1F, 6.2F, -2.2F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, -2.0F, 0.0F, 0.0F, 0.0F, -0.1115F));

        right_arm.addOrReplaceChild("right_arm64", CubeListBuilder.create().texOffs(250, 150).addBox(-9.3F, 6.6F, -1.1F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, -2.0F, 0.0F, 0.0F, 0.0F, -0.1115F));

        right_arm.addOrReplaceChild("right_arm65", CubeListBuilder.create().texOffs(100, 0).addBox(-6.5F, 9.0F, -2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, -2.0F, 0.0F));

        right_arm.addOrReplaceChild("right_arm66", CubeListBuilder.create().texOffs(100, 0).addBox(-6.5F, 8.0F, 1.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, -2.0F, 0.0F));

        right_arm.addOrReplaceChild("right_arm67", CubeListBuilder.create().texOffs(100, 0).addBox(-8.4F, 10.3F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, -2.0F, 0.0F));

        PartDefinition left_arm = root.addOrReplaceChild("left_arm", CubeListBuilder.create().texOffs(40, 16).mirror().addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(5.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F));

        left_arm.addOrReplaceChild("left_arm1", CubeListBuilder.create().texOffs(341, 70).mirror().addBox(4.0F, -24.0F, -2.1F, 4.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-5.0F, 22.0F, 0.0F));

        left_arm.addOrReplaceChild("left_arm2", CubeListBuilder.create().texOffs(400, 0).mirror().addBox(4.0F, -24.0F, 1.1F, 4.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-5.0F, 22.0F, 0.0F));

        left_arm.addOrReplaceChild("left_arm3", CubeListBuilder.create().texOffs(343, 98).mirror().addBox(7.1F, -24.0F, -2.0F, 1.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-5.0F, 22.0F, 0.0F));

        left_arm.addOrReplaceChild("left_arm4", CubeListBuilder.create().texOffs(359, 48).mirror().addBox(-1.1F, 0.0F, -2.0F, 1.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, -2.0F, 0.0F));

        left_arm.addOrReplaceChild("left_arm5", CubeListBuilder.create().texOffs(333, 203).mirror().addBox(-1.0F, -24.1F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 22.0F, 0.0F));

        left_arm.addOrReplaceChild("left_arm6", CubeListBuilder.create().texOffs(339, 158).mirror().addBox(4.0F, -12.9F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-5.0F, 22.0F, 0.0F));

        left_arm.addOrReplaceChild("left_arm7", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(4.0F, -21.5F, -2.3F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-5.0F, 22.0F, 0.0F));

        left_arm.addOrReplaceChild("left_arm8", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-1.0F, -21.5F, 1.3F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 22.0F, 0.0F));

        left_arm.addOrReplaceChild("left_arm9", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(2.3F, 0.5F, -2.1F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

        left_arm.addOrReplaceChild("left_arm10", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(2.3F, 0.5F, 1.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

        left_arm.addOrReplaceChild("left_arm11", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-1.3F, 1.0F, -2.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

        left_arm.addOrReplaceChild("left_arm12", CubeListBuilder.create().texOffs(300, 0).mirror().addBox(-1.3F, 1.0F, 1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

        left_arm.addOrReplaceChild("left_arm13", CubeListBuilder.create().texOffs(200, 430).mirror().addBox(0.0F, -0.2F, -2.9F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1859F, 0.0F, 0.0F));

        left_arm.addOrReplaceChild("left_arm14", CubeListBuilder.create().texOffs(300, 230).mirror().addBox(2.9F, -0.8F, -1.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2603F));

        left_arm.addOrReplaceChild("left_arm15", CubeListBuilder.create().texOffs(199, 448).mirror().addBox(2.8251F, -1.8959F, -1.99F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2231F));

        left_arm.addOrReplaceChild("left_arm16", CubeListBuilder.create().texOffs(200, 470).mirror().addBox(8.2463F, -0.154F, 0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.2603F));

        left_arm.addOrReplaceChild("left_arm17", CubeListBuilder.create().texOffs(200, 490).mirror().addBox(7.9F, -0.154F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.2603F));

        left_arm.addOrReplaceChild("left_arm18", CubeListBuilder.create().texOffs(250, 50).mirror().addBox(2.5F, 1.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.0F, 0.0F, 0.0F, 0.0F, -0.2231F));

        left_arm.addOrReplaceChild("left_arm19", CubeListBuilder.create().texOffs(248, 68).mirror().addBox(11.9F, -19.2F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-13.0F, 17.0F, 0.0F, 0.0F, 0.0F, 0.2231F));

        left_arm.addOrReplaceChild("left_arm20", CubeListBuilder.create().texOffs(250, 90).mirror().addBox(5.0F, 1.8F, 2.4F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.0F, -2.0F, 0.0F, -0.2603F, 0.0F, 0.0F));

        left_arm.addOrReplaceChild("left_arm21", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(4.0F, 7.0F, -2.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-5.0F, -2.0F, 0.0F));

        left_arm.addOrReplaceChild("left_arm22", CubeListBuilder.create().texOffs(48, 67).mirror().addBox(7.0F, 7.0F, -2.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-5.0F, -2.0F, 0.0F));

        left_arm.addOrReplaceChild("left_arm23", CubeListBuilder.create().texOffs(46, 78).mirror().addBox(5.0F, 8.0F, -2.4F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-5.0F, -2.0F, 0.0F));

        left_arm.addOrReplaceChild("left_arm24", CubeListBuilder.create().texOffs(297, 75).mirror().addBox(7.3F, 7.0F, -2.1F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-5.0F, -2.0F, 0.0F));

        left_arm.addOrReplaceChild("left_arm25", CubeListBuilder.create().texOffs(317, 76).mirror().addBox(7.3F, 7.0F, 1.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-5.0F, -2.0F, 0.0F));

        left_arm.addOrReplaceChild("left_arm26", CubeListBuilder.create().texOffs(40, 53).mirror().addBox(4.0F, 7.0F, 1.3F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-5.0F, -2.0F, 0.0F));

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

        right_leg.addOrReplaceChild("right_leg2", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-4.0F, 13.0F, 1.21F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

        right_leg.addOrReplaceChild("right_leg3", CubeListBuilder.create().texOffs(250, 390).mirror().addBox(-14.3438F, 1.0166F, -2.3F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.0F, -12.0F, 0.0F, 0.0F, 0.0F, -1.2641F));

        right_leg.addOrReplaceChild("right_leg4", CubeListBuilder.create().texOffs(250, 410).mirror().addBox(-14.3438F, 1.0166F, 1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.0F, -12.0F, 0.0F, 0.0F, 0.0F, -1.2641F));

        right_leg.addOrReplaceChild("right_leg5", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-3.1F, 13.5F, 1.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

        right_leg.addOrReplaceChild("right_leg6", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-3.1F, 13.5F, -2.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

        right_leg.addOrReplaceChild("right_leg7", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-4.1F, 13.0F, -2.2F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

        right_leg.addOrReplaceChild("right_leg8", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-3.1F, 15.0F, -2.2F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

        right_leg.addOrReplaceChild("right_leg9", CubeListBuilder.create().texOffs(106, 64).mirror().addBox(-0.8F, 15.2F, -2.21F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

        right_leg.addOrReplaceChild("right_leg10", CubeListBuilder.create().texOffs(242, 276).mirror().addBox(-0.8F, 15.8F, -2.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

        right_leg.addOrReplaceChild("right_leg11", CubeListBuilder.create().texOffs(178, 81).mirror().addBox(-3.0F, 19.0F, -2.3F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

        right_leg.addOrReplaceChild("right_leg12", CubeListBuilder.create().texOffs(181, 59).mirror().addBox(-4.0F, 19.0F, -2.2F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

        right_leg.addOrReplaceChild("left_leg133", CubeListBuilder.create().texOffs(177, 95).mirror().addBox(-4.0F, 19.0F, 1.2F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

        right_leg.addOrReplaceChild("right_leg14", CubeListBuilder.create().texOffs(132, 55).mirror().addBox(-4.2F, 19.0F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

        right_leg.addOrReplaceChild("right_leg15", CubeListBuilder.create().texOffs(250, 430).mirror().addBox(-6.6559F, 12.1712F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.0F, -12.0F, 0.0F, 0.0F, 0.0F, -0.1487F));

        right_leg.addOrReplaceChild("right_leg16", CubeListBuilder.create().texOffs(129, 1).mirror().addBox(-4.4F, 13.0F, -1.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

        right_leg.addOrReplaceChild("right_leg17", CubeListBuilder.create().texOffs(250, 450).mirror().addBox(-7.3559F, 17.3712F, -1.5F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.0F, -12.0F, 0.0F, 0.0F, 0.0F, -0.1487F));

        right_leg.addOrReplaceChild("right_leg18", CubeListBuilder.create().texOffs(41, 172).mirror().addBox(-4.4F, 19.0F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

        right_leg.addOrReplaceChild("right_leg19", CubeListBuilder.create().texOffs(185, 125).mirror().addBox(-4.5F, 21.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

        right_leg.addOrReplaceChild("right_leg20", CubeListBuilder.create().texOffs(250, 470).mirror().addBox(-3.0F, 17.5254F, -4.6357F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.0F, -12.0F, 0.0F, 0.1115F, 0.0F, 0.0F));

        right_leg.addOrReplaceChild("right_leg21", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-4.2F, 18.3F, -2.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

        right_leg.addOrReplaceChild("right_leg22", CubeListBuilder.create().texOffs(239, 200).mirror().addBox(-0.8F, 18.3F, -2.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

        right_leg.addOrReplaceChild("right_leg23", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-3.9F, 15.2F, 1.2F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

        right_leg.addOrReplaceChild("right_leg24", CubeListBuilder.create().texOffs(129, 79).mirror().addBox(-0.9F, 15.8F, 1.18F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

        right_leg.addOrReplaceChild("right_leg25", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-3.5F, 22.0F, -2.7F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

        right_leg.addOrReplaceChild("right_leg26", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-0.8F, 18.3F, 1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

        right_leg.addOrReplaceChild("right_leg27", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-4.2F, 18.3F, 1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

        right_leg.addOrReplaceChild("right_leg28", CubeListBuilder.create().texOffs(245, 291).mirror().addBox(-0.8F, 19.0F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

        right_leg.addOrReplaceChild("right_leg29", CubeListBuilder.create().texOffs(209, 121).mirror().addBox(-0.8F, 23.0F, -2.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

        right_leg.addOrReplaceChild("right_leg30", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-4.2F, 23.0F, -2.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

        right_leg.addOrReplaceChild("right_leg31", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-4.3F, 22.0F, 0.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

        right_leg.addOrReplaceChild("right_leg32", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-0.7F, 22.0F, 0.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

        right_leg.addOrReplaceChild("right_leg33", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-3.5F, 23.0F, 1.3F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

        PartDefinition left_leg = root.addOrReplaceChild("left_leg", CubeListBuilder.create().texOffs(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, 12.0F, 0.0F));

        left_leg.addOrReplaceChild("left_leg1", CubeListBuilder.create().texOffs(100, 236).addBox(-0.2F, 18.3F, -2.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

        left_leg.addOrReplaceChild("left_leg2", CubeListBuilder.create().texOffs(100, 0).addBox(-0.2F, 18.3F, 1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

        left_leg.addOrReplaceChild("left_leg3", CubeListBuilder.create().texOffs(148, 79).addBox(-0.21F, 15.2F, -2.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

        left_leg.addOrReplaceChild("left_leg4", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-0.2F, 15.2F, 1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-2.0F, -12.0F, 0.0F));

        left_leg.addOrReplaceChild("left_leg5", CubeListBuilder.create().texOffs(111, 51).mirror().addBox(-0.2F, 15.8F, 1.19F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-2.0F, -12.0F, 0.0F));

        left_leg.addOrReplaceChild("left_leg6", CubeListBuilder.create().texOffs(242, 276).addBox(-0.2F, 15.8F, -2.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

        left_leg.addOrReplaceChild("left_leg7", CubeListBuilder.create().texOffs(100, 0).addBox(-0.3F, 22.0F, 0.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

        left_leg.addOrReplaceChild("left_leg8", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-0.2F, 23.0F, -2.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-2.0F, -12.0F, 0.0F));

        left_leg.addOrReplaceChild("left_leg9", CubeListBuilder.create().texOffs(154, 50).addBox(-0.2F, 19.0F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

        left_leg.addOrReplaceChild("left_leg10", CubeListBuilder.create().texOffs(100, 0).addBox(0.1F, 15.0F, -2.2F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

        left_leg.addOrReplaceChild("left_leg11", CubeListBuilder.create().texOffs(100, 0).addBox(2.1F, 13.5F, -2.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

        left_leg.addOrReplaceChild("left_leg12", CubeListBuilder.create().texOffs(250, 390).addBox(13.3438F, 1.0166F, -2.3F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -12.0F, 0.0F, 0.0F, 0.0F, 1.2641F));

        left_leg.addOrReplaceChild("left_leg13", CubeListBuilder.create().texOffs(100, 0).addBox(3.1F, 13.0F, -2.2F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

        left_leg.addOrReplaceChild("left_leg14", CubeListBuilder.create().texOffs(100, 0).addBox(3.2F, 13.0F, -2.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

        left_leg.addOrReplaceChild("left_leg15", CubeListBuilder.create().texOffs(216, 57).addBox(3.4F, 13.0F, -1.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

        left_leg.addOrReplaceChild("left_leg16", CubeListBuilder.create().texOffs(250, 430).addBox(5.6559F, 12.1712F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -12.0F, 0.0F, 0.0F, 0.0F, 0.1487F));

        left_leg.addOrReplaceChild("left_leg17", CubeListBuilder.create().texOffs(100, 0).addBox(-0.1F, 15.2F, 1.2F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

        left_leg.addOrReplaceChild("left_leg18", CubeListBuilder.create().texOffs(100, 0).addBox(3.0F, 13.0F, 1.21F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

        left_leg.addOrReplaceChild("left_leg19", CubeListBuilder.create().texOffs(100, 0).addBox(2.1F, 13.5F, 1.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

        left_leg.addOrReplaceChild("left_leg20", CubeListBuilder.create().texOffs(250, 410).addBox(13.3438F, 1.0166F, 1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -12.0F, 0.0F, 0.0F, 0.0F, 1.2641F));

        left_leg.addOrReplaceChild("left_leg21", CubeListBuilder.create().texOffs(181, 59).addBox(0.0F, 19.0F, -2.2F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

        left_leg.addOrReplaceChild("left_leg22", CubeListBuilder.create().texOffs(178, 81).addBox(1.0F, 19.0F, -2.3F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

        left_leg.addOrReplaceChild("left_leg23", CubeListBuilder.create().texOffs(250, 470).addBox(1.0F, 17.5254F, -4.6357F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -12.0F, 0.0F, 0.1115F, 0.0F, 0.0F));

        left_leg.addOrReplaceChild("left_leg24", CubeListBuilder.create().texOffs(100, 0).addBox(3.2F, 23.0F, -2.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

        left_leg.addOrReplaceChild("left_leg25", CubeListBuilder.create().texOffs(100, 0).addBox(0.5F, 22.0F, -2.7F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

        left_leg.addOrReplaceChild("left_leg26", CubeListBuilder.create().texOffs(100, 0).addBox(0.5F, 23.0F, 1.3F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

        left_leg.addOrReplaceChild("left_leg27", CubeListBuilder.create().texOffs(100, 0).addBox(3.3F, 22.0F, 0.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

        left_leg.addOrReplaceChild("left_leg28", CubeListBuilder.create().texOffs(100, 0).addBox(3.2F, 18.3F, -2.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

        left_leg.addOrReplaceChild("left_leg29", CubeListBuilder.create().texOffs(100, 0).addBox(3.2F, 18.3F, 1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

        left_leg.addOrReplaceChild("left_leg30", CubeListBuilder.create().texOffs(132, 55).addBox(3.2F, 19.0F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

        left_leg.addOrReplaceChild("left_leg31", CubeListBuilder.create().texOffs(181, 113).addBox(3.4F, 19.0F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

        left_leg.addOrReplaceChild("left_leg32", CubeListBuilder.create().texOffs(250, 450).addBox(6.3559F, 17.3712F, -1.5F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -12.0F, 0.0F, 0.0F, 0.0F, 0.1487F));

        left_leg.addOrReplaceChild("left_leg33", CubeListBuilder.create().texOffs(184, 138).addBox(3.5F, 21.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

        left_leg.addOrReplaceChild("left_leg34", CubeListBuilder.create().texOffs(177, 95).addBox(0.0F, 19.0F, 1.2F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

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