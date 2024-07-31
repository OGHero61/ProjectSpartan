package net.hero61.projectspartan.entity.client.model;

// Made with Blockbench 4.10.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import net.hero61.projectspartan.util.ModelUtils;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.world.entity.LivingEntity;

public class BuccaneerEntityModel<T extends LivingEntity> extends HumanoidModel<T> {
    public BuccaneerEntityModel(ModelPart modelPart) {
        super(modelPart);
    }

    public static LayerDefinition createLayer() {
        MeshDefinition definition = ModelUtils.createBlankHumanoidMesh();
        PartDefinition root = definition.getRoot();

        PartDefinition head = root.addOrReplaceChild("head", CubeListBuilder.create().texOffs(396, 310).mirror().addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

        head.addOrReplaceChild("helmet2", CubeListBuilder.create().texOffs(0, 70).mirror().addBox(-4.0F, -3.1F, -3.73F, 8.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.409F, 0.0F, 0.0F));

        head.addOrReplaceChild("helmet3", CubeListBuilder.create().texOffs(460, 133).mirror().addBox(-1.0F, -0.8F, -4.9F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2603F, 0.0F, 0.0F));

        head.addOrReplaceChild("helmet5", CubeListBuilder.create().texOffs(0, 130).mirror().addBox(-4.0F, 0.1F, -4.7F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.5205F, 0.0F, 0.0F));

        head.addOrReplaceChild("helmet11", CubeListBuilder.create().texOffs(-1, 191).mirror().addBox(-1.0F, -8.8F, -2.15F, 5.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0372F, 0.0F, 0.0F));

        head.addOrReplaceChild("helmet12", CubeListBuilder.create().texOffs(1, 211).mirror().addBox(-4.0F, -8.8F, -2.15F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0372F, 0.0F, 0.0F));

        head.addOrReplaceChild("helmet14", CubeListBuilder.create().texOffs(450, 215).addBox(0.1F, 1.0931F, -4.7466F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.0F, 0.0F, -1.4466F, 0.0F, 0.0F));

        head.addOrReplaceChild("helmet7", CubeListBuilder.create().texOffs(451, 215).mirror().addBox(-4.1F, 1.0931F, -4.7466F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -4.0F, 0.0F, -1.4466F, 0.0F, 0.0F));

        head.addOrReplaceChild("helmet4", CubeListBuilder.create().texOffs(453, 190).mirror().addBox(-4.11F, -0.9527F, -5.5896F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -4.0F, 0.0F, -0.5236F, 0.0F, 0.0F));

        head.addOrReplaceChild("helmet6", CubeListBuilder.create().texOffs(452, 190).mirror().addBox(0.1F, -0.9527F, -5.5896F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -4.0F, 0.0F, -0.5236F, 0.0F, 0.0F));

        head.addOrReplaceChild("helmet8", CubeListBuilder.create().texOffs(452, 190).mirror().addBox(0.1F, -0.4735F, -5.67F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -4.0F, 0.0F, -0.7854F, 0.0F, 0.0F));

        head.addOrReplaceChild("helmet9", CubeListBuilder.create().texOffs(452, 190).mirror().addBox(-4.11F, -0.4735F, -5.67F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -4.0F, 0.0F, -0.7854F, 0.0F, 0.0F));

        head.addOrReplaceChild("helmet18", CubeListBuilder.create().texOffs(0, 310).mirror().addBox(-4.51F, -2.9F, -3.69F, 9.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2603F, 0.0F, 0.0F));

        head.addOrReplaceChild("helmet19", CubeListBuilder.create().texOffs(-1, 329).mirror().addBox(-4.5F, -6.1F, 0.0F, 9.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2974F, 0.0F, 0.0F));

        head.addOrReplaceChild("helmet20", CubeListBuilder.create().texOffs(439, 326).mirror().addBox(-5.5F, -5.9F, 0.5F, 11.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2603F, 0.0F, 0.0F));

        head.addOrReplaceChild("helmet21", CubeListBuilder.create().texOffs(2, 372).mirror().addBox(-4.5F, -6.27F, -3.45F, 9.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2603F, 0.0F, 0.0F));

        head.addOrReplaceChild("helmet23", CubeListBuilder.create().texOffs(462, 116).mirror().addBox(-3.0F, -5.0F, 3.8F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2231F, 0.0F, 0.0F));

        head.addOrReplaceChild("helmet24", CubeListBuilder.create().texOffs(-2, 430).mirror().addBox(-0.9F, -9.0F, -0.4F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2974F, 0.0F, 0.0F));

        head.addOrReplaceChild("helmet25", CubeListBuilder.create().texOffs(0, 450).mirror().addBox(-4.1F, -9.0F, -0.4F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2974F, 0.0F, 0.0F));

        head.addOrReplaceChild("helmet26", CubeListBuilder.create().texOffs(-1, 470).mirror().addBox(0.1F, -8.4F, -3.7F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.8923F, 0.0F, 0.0F));

        head.addOrReplaceChild("helmet27", CubeListBuilder.create().texOffs(0, 490).mirror().addBox(-4.1F, -8.4F, -3.7F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.8923F, 0.0F, 0.0F));

        head.addOrReplaceChild("helmet28", CubeListBuilder.create().texOffs(81, 51).mirror().addBox(-6.8F, -7.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.3346F));

        head.addOrReplaceChild("helmet30", CubeListBuilder.create().texOffs(80, 90).mirror().addBox(-6.8F, -6.0F, 2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.3346F));

        head.addOrReplaceChild("helmet31", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-4.0F, -7.1F, 3.5F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

        head.addOrReplaceChild("helmet32", CubeListBuilder.create().texOffs(301, 131).mirror().addBox(5.5F, -7.2F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2974F));

        head.addOrReplaceChild("helmet34", CubeListBuilder.create().texOffs(300, 170).mirror().addBox(5.5F, -6.2F, 2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2974F));

        head.addOrReplaceChild("helmet35", CubeListBuilder.create().texOffs(80, 170).mirror().addBox(-4.51F, -6.0F, 3.5F, 9.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2231F, 0.0F, 0.0F));

        head.addOrReplaceChild("helmet36", CubeListBuilder.create().texOffs(437, 296).mirror().addBox(-4.1564F, -7.346F, -2.0F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.0873F));

        head.addOrReplaceChild("helmet37", CubeListBuilder.create().texOffs(437, 296).addBox(3.0735F, -7.2592F, -2.0F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0873F));

        head.addOrReplaceChild("helmet38", CubeListBuilder.create().texOffs(80, 190).mirror().addBox(-0.7F, -7.6F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.632F));

        head.addOrReplaceChild("helmet39", CubeListBuilder.create().texOffs(80, 110).mirror().addBox(-4.5F, -1.8F, 3.1F, 9.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.5949F, 0.0F, 0.0F));

        head.addOrReplaceChild("helmet43", CubeListBuilder.create().texOffs(398, 315).mirror().addBox(0.0F, -8.5F, 4.3F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 2.0F, 2.0F, 0.2618F, 0.0F, 0.0F));

        head.addOrReplaceChild("helmet48", CubeListBuilder.create().texOffs(332, 92).mirror().addBox(-4.52F, -4.4F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2603F, 0.0F, 0.0F));

        head.addOrReplaceChild("helmet49", CubeListBuilder.create().texOffs(332, 92).addBox(3.52F, -4.4F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2603F, 0.0F, 0.0F));

        head.addOrReplaceChild("helmet52", CubeListBuilder.create().texOffs(450, 190).mirror().addBox(-4.1F, -7.4F, -3.8F, 8.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1487F, 0.0F, 0.0F));

        head.addOrReplaceChild("helmet53", CubeListBuilder.create().texOffs(450, 170).mirror().addBox(3.1F, -7.4F, -3.81F, 1.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1487F, 0.0F, 0.0F));

        head.addOrReplaceChild("helmet57", CubeListBuilder.create().texOffs(450, 150).mirror().addBox(-2.0F, -5.65F, -3.55F, 4.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2231F, 0.0F, 0.0F));

        head.addOrReplaceChild("helmet58", CubeListBuilder.create().texOffs(450, 90).mirror().addBox(-4.2F, -2.9F, -3.9F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1487F, 0.0F, 0.0F));

        head.addOrReplaceChild("helmet59", CubeListBuilder.create().texOffs(450, 90).addBox(1.2F, -2.9F, -3.9F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1487F, 0.0F, 0.0F));

        head.addOrReplaceChild("helmet61", CubeListBuilder.create().texOffs(400, 0).mirror().addBox(-3.2F, -3.85F, -3.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.0F, 0.0F, 0.2602F, 0.0F, 0.0F));

        head.addOrReplaceChild("helmet62", CubeListBuilder.create().texOffs(450, 110).mirror().addBox(-2.0F, -5.15F, 4.3F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.4871F, 0.0F, 0.0F));

        head.addOrReplaceChild("helmet65", CubeListBuilder.create().texOffs(400, 0).addBox(2.2F, -3.85F, -3.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.0F, 0.0F, 0.2602F, 0.0F, 0.0F));

        head.addOrReplaceChild("helmet68", CubeListBuilder.create().texOffs(402, 2).addBox(-4.2F, -9.0F, -2.6F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, 0.0F, -0.0175F, 0.0F, 0.0F));

        head.addOrReplaceChild("helmet69", CubeListBuilder.create().texOffs(402, 2).mirror().addBox(1.2F, -9.0F, -2.6F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.0F, 0.0F, -0.0175F, 0.0F, 0.0F));

        head.addOrReplaceChild("helmet70", CubeListBuilder.create().texOffs(300, 0).mirror().addBox(-4.0F, -4.0F, 3.1F, 8.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

        head.addOrReplaceChild("helmet71", CubeListBuilder.create().texOffs(398, 62).mirror().addBox(-4.1F, -4.0F, -1.0F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

        head.addOrReplaceChild("helmet72", CubeListBuilder.create().texOffs(300, 0).mirror().addBox(-4.1F, -1.0F, -3.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

        head.addOrReplaceChild("helmet73", CubeListBuilder.create().texOffs(300, 0).addBox(3.1F, -1.0F, -3.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        head.addOrReplaceChild("helmet74", CubeListBuilder.create().texOffs(398, 62).addBox(3.1F, -4.0F, -1.0F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        head.addOrReplaceChild("helmet75", CubeListBuilder.create().texOffs(300, 0).mirror().addBox(-4.0F, -0.9F, -4.0F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

        head.addOrReplaceChild("helmet76", CubeListBuilder.create().texOffs(80, 190).mirror().addBox(-0.35F, -7.7F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.632F));

        head.addOrReplaceChild("helmet1", CubeListBuilder.create().texOffs(474, 63).mirror().addBox(-1.0F, -2.9F, -4.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.409F, 0.0F, 0.0F));

        PartDefinition body = root.addOrReplaceChild("body", CubeListBuilder.create().texOffs(16, 16).mirror().addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

        body.addOrReplaceChild("chest1", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-3.5F, 0.0F, -3.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

        body.addOrReplaceChild("chest2", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(1.5F, 0.0F, -3.0F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

        body.addOrReplaceChild("chest3", CubeListBuilder.create().texOffs(80, 210).mirror().addBox(-2.5F, 3.0F, -4.8F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2974F, 0.0F, 0.0F));

        body.addOrReplaceChild("chest4", CubeListBuilder.create().texOffs(47, 263).addBox(-2.2F, 2.8F, -4.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1438F, 0.0F, 0.2182F));

        body.addOrReplaceChild("chest6", CubeListBuilder.create().texOffs(403, 297).mirror().addBox(-2.0F, -0.3F, -4.2F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2876F, 0.0F, 0.0F));

        body.addOrReplaceChild("chest5", CubeListBuilder.create().texOffs(80, 250).mirror().addBox(1.3F, 2.8F, -4.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1438F, 0.0F, -0.2182F));

        body.addOrReplaceChild("chest7", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        body.addOrReplaceChild("chest7_r1", CubeListBuilder.create().texOffs(479, 281).mirror().addBox(-2.5F, -21.2F, -3.0F, 5.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 0.0436F, 0.0F, 0.0F));

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

        body.addOrReplaceChild("chest19", CubeListBuilder.create().texOffs(150, 70).mirror().addBox(1.5F, 1.0F, -3.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2231F, 0.0F, 0.0F));

        body.addOrReplaceChild("chest20", CubeListBuilder.create().texOffs(397, 312).mirror().addBox(-3.5F, 1.0F, -3.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2231F, 0.0F, 0.0F));

        body.addOrReplaceChild("chest21", CubeListBuilder.create().texOffs(150, 110).mirror().addBox(1.5F, 2.5F, -3.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0744F, 0.0F, 0.0F));

        body.addOrReplaceChild("chest22", CubeListBuilder.create().texOffs(150, 130).mirror().addBox(-2.5F, 2.5F, -3.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0744F, 0.0F, 0.0F));

        body.addOrReplaceChild("chest23", CubeListBuilder.create().texOffs(150, 150).mirror().addBox(-1.5F, 3.0F, -3.4F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0744F, 0.0F, 0.0F));

        body.addOrReplaceChild("chest24", CubeListBuilder.create().texOffs(406, 324).mirror().addBox(-4.0F, 0.0F, -3.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2231F, 0.0F, 0.0F));

        body.addOrReplaceChild("chest25", CubeListBuilder.create().texOffs(470, 331).mirror().addBox(3.0F, 0.0F, -3.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2231F, 0.0F, 0.0F));

        body.addOrReplaceChild("chest26", CubeListBuilder.create().texOffs(340, 147).mirror().addBox(-1.0F, 9.3F, -2.9F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

        body.addOrReplaceChild("chest27", CubeListBuilder.create().texOffs(470, 307).mirror().addBox(-3.3F, 4.0F, -6.3F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2974F, 0.48F, -0.1309F));

        body.addOrReplaceChild("chest28", CubeListBuilder.create().texOffs(470, 307).addBox(1.3F, 4.0F, -6.3F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2974F, -0.48F, 0.1309F));

        body.addOrReplaceChild("chest29", CubeListBuilder.create().texOffs(147, 227).mirror().addBox(-4.5F, 5.5F, -4.5F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2974F, 0.0F, 0.0F));

        body.addOrReplaceChild("chest30", CubeListBuilder.create().texOffs(147, 247).mirror().addBox(2.5F, 5.5F, -4.5F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2974F, 0.0F, 0.0F));

        body.addOrReplaceChild("chest31", CubeListBuilder.create().texOffs(286, 115).mirror().addBox(-2.0F, 6.5F, -3.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

        body.addOrReplaceChild("chest32", CubeListBuilder.create().texOffs(286, 117).mirror().addBox(-1.0F, 7.0F, -3.1F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

        body.addOrReplaceChild("chest34", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-1.5F, 9.0F, -2.8F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

        body.addOrReplaceChild("chest35", CubeListBuilder.create().texOffs(150, 270).mirror().addBox(-3.0F, 3.0F, -4.79F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2974F, 0.0F, 0.0F));

        body.addOrReplaceChild("chest36", CubeListBuilder.create().texOffs(150, 290).mirror().addBox(-3.5F, 4.5F, -4.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2974F, 0.0F, 0.0F));

        body.addOrReplaceChild("chest37", CubeListBuilder.create().texOffs(150, 310).mirror().addBox(2.0F, 3.0F, -4.8F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2974F, 0.0F, 0.0F));

        body.addOrReplaceChild("chest38", CubeListBuilder.create().texOffs(150, 330).mirror().addBox(2.5F, 4.5F, -4.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2974F, 0.0F, 0.0F));

        body.addOrReplaceChild("chest46", CubeListBuilder.create().texOffs(150, 450).mirror().addBox(-1.0F, 10.6F, -4.2F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1487F, 0.0F, 0.0F));

        body.addOrReplaceChild("chest49", CubeListBuilder.create().texOffs(439, 81).mirror().addBox(-5.0F, 9.5F, -1.0F, 10.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

        body.addOrReplaceChild("chest50", CubeListBuilder.create().texOffs(461, 63).mirror().addBox(-3.0F, 0.0F, -2.4F, 6.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

        body.addOrReplaceChild("chest51", CubeListBuilder.create().texOffs(150, 470).addBox(2.5F, 0.0F, -0.5F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1859F, 0.0F, 0.0F));

        body.addOrReplaceChild("chest52", CubeListBuilder.create().texOffs(150, 470).mirror().addBox(-5.5F, 0.0F, -0.5F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1859F, 0.0F, 0.0F));

        body.addOrReplaceChild("chest53", CubeListBuilder.create().texOffs(201, 51).mirror().addBox(2.5F, 3.7903F, 0.6275F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.409F, 0.0F, 0.0F));

        body.addOrReplaceChild("chest54", CubeListBuilder.create().texOffs(201, 51).addBox(-5.5F, 3.7903F, 0.6275F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.409F, 0.0F, 0.0F));

        body.addOrReplaceChild("chest55", CubeListBuilder.create().texOffs(200, 90).mirror().addBox(3.5F, -0.3F, -2.3F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1115F, 0.0F, 0.0F));

        body.addOrReplaceChild("chest56", CubeListBuilder.create().texOffs(300, 210).mirror().addBox(4.5F, -0.3F, -1.3F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1115F, 0.0F, 0.0F));

        body.addOrReplaceChild("chest57", CubeListBuilder.create().texOffs(200, 110).mirror().addBox(-5.5F, -0.3F, -1.3F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1115F, 0.0F, 0.0F));

        body.addOrReplaceChild("chest58", CubeListBuilder.create().texOffs(200, 130).mirror().addBox(-4.5F, -0.3F, -2.3F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1115F, 0.0F, 0.0F));

        body.addOrReplaceChild("chest59", CubeListBuilder.create().texOffs(424, 305).mirror().addBox(2.5F, 1.5F, 2.7F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.7854F, 0.0F, 0.0F));

        body.addOrReplaceChild("chest60", CubeListBuilder.create().texOffs(424, 325).mirror().addBox(-5.5F, 1.5F, 2.7F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.7854F, 0.0F, 0.0F));

        body.addOrReplaceChild("chest33", CubeListBuilder.create().texOffs(419, 281).mirror().addBox(2.5F, 0.7985F, 0.2292F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.6581F, 0.0F, 0.0F));

        body.addOrReplaceChild("chest39", CubeListBuilder.create().texOffs(419, 281).addBox(-5.5F, 0.7985F, 0.2292F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.6581F, 0.0F, 0.0F));

        body.addOrReplaceChild("chest40", CubeListBuilder.create().texOffs(419, 281).mirror().addBox(-5.5F, -1.8292F, -0.118F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 2.0071F, 0.0F, 0.0F));

        body.addOrReplaceChild("chest41", CubeListBuilder.create().texOffs(419, 281).mirror().addBox(2.5F, -1.8292F, -0.118F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 2.0071F, 0.0F, 0.0F));

        body.addOrReplaceChild("chest63", CubeListBuilder.create().texOffs(195, 230).mirror().addBox(-3.0F, 1.0F, 0.5F, 6.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1859F, 0.0F, 0.0F));

        body.addOrReplaceChild("chest64", CubeListBuilder.create().texOffs(481, 166).mirror().addBox(1.0F, 1.2F, 1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1859F, 0.0F, 0.0F));

        body.addOrReplaceChild("chest65", CubeListBuilder.create().texOffs(198, 269).mirror().addBox(-3.0F, 0.2F, 1.3F, 6.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1859F, 0.0F, 0.0F));

        body.addOrReplaceChild("chest67", CubeListBuilder.create().texOffs(196, 310).mirror().addBox(-2.5F, 4.6F, 1.4F, 5.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1487F, 0.0F, 0.0F));

        body.addOrReplaceChild("chest68", CubeListBuilder.create().texOffs(202, 332).mirror().addBox(-13.0F, -7.7F, 0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(5.0F, 14.0F, 6.0F, 0.1859F, -0.1309F, 0.7854F));

        body.addOrReplaceChild("chest42", CubeListBuilder.create().texOffs(202, 332).mirror().addBox(5.9583F, -11.7891F, 0.6735F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(5.0F, 14.0F, 6.0F, 0.1859F, 0.1309F, -0.7854F));

        body.addOrReplaceChild("chest71", CubeListBuilder.create().texOffs(400, 0).mirror().addBox(-1.0F, 2.0F, 0.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1859F, 0.0F, 0.0F));

        body.addOrReplaceChild("chest73", CubeListBuilder.create().texOffs(399, -1).mirror().addBox(-5.0F, 5.9F, 1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.409F, 0.0F, 0.0F));

        body.addOrReplaceChild("chest74", CubeListBuilder.create().texOffs(399, -1).mirror().addBox(3.0F, 5.9F, 1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.409F, 0.0F, 0.0F));

        body.addOrReplaceChild("chest75", CubeListBuilder.create().texOffs(400, 0).mirror().addBox(-4.8F, 1.0F, 3.6F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.0F, 5.0F, 0.0F, 0.4913F, -0.0873F, 0.48F));

        body.addOrReplaceChild("chest76", CubeListBuilder.create().texOffs(400, 0).mirror().addBox(1.14F, -0.5F, 3.9F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.0F, 5.0F, 0.0F, 0.4913F, -0.0873F, -0.48F));

        body.addOrReplaceChild("chest72", CubeListBuilder.create().texOffs(434, 238).mirror().addBox(-1.0F, 5.0F, 1.1F, 2.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1487F, 0.0F, 0.0F));

        body.addOrReplaceChild("chest78", CubeListBuilder.create().texOffs(200, 350).mirror().addBox(-2.0F, 10.1F, 2.8F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1859F, 0.0F, 0.0F));

        body.addOrReplaceChild("chest79", CubeListBuilder.create().texOffs(200, 370).mirror().addBox(-2.5F, 9.1F, 3.81F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1859F, 0.0F, 0.0F));

        body.addOrReplaceChild("chest80", CubeListBuilder.create().texOffs(427, 253).mirror().addBox(-3.0F, -1.0F, 1.4F, 6.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

        body.addOrReplaceChild("chest81", CubeListBuilder.create().texOffs(200, 390).mirror().addBox(-3.5F, 1.3515F, 1.1404F, 7.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.409F, 0.0F, 0.0F));

        PartDefinition right_arm = root.addOrReplaceChild("right_arm", CubeListBuilder.create().texOffs(40, 16).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F));

        right_arm.addOrReplaceChild("right_arm31", CubeListBuilder.create().texOffs(391, 252).addBox(-8.0F, -24.0F, -2.1F, 4.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, 22.0F, 0.0F));

        right_arm.addOrReplaceChild("right_arm35", CubeListBuilder.create().texOffs(409, 245).addBox(-8.0F, -24.0F, 1.1F, 4.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, 22.0F, 0.0F));

        right_arm.addOrReplaceChild("right_arm36", CubeListBuilder.create().texOffs(409, 245).addBox(-8.1F, -24.0F, -2.0F, 1.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, 22.0F, 0.0F));

        right_arm.addOrReplaceChild("right_arm37", CubeListBuilder.create().texOffs(400, 0).addBox(0.1F, 0.0F, -2.0F, 1.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -2.0F, 0.0F));

        right_arm.addOrReplaceChild("right_arm38", CubeListBuilder.create().texOffs(409, 245).addBox(-3.0F, -24.1F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 22.0F, 0.0F));

        right_arm.addOrReplaceChild("right_arm39", CubeListBuilder.create().texOffs(400, 0).addBox(-8.0F, -12.9F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, 22.0F, 0.0F));

        right_arm.addOrReplaceChild("right_arm40", CubeListBuilder.create().texOffs(100, 0).addBox(-7.5F, -20.0F, -2.3F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, 22.0F, 0.0F));

        right_arm.addOrReplaceChild("right_arm46", CubeListBuilder.create().texOffs(200, 430).addBox(-2.0F, 1.5F, -2.9F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1859F, 0.0F, 0.0F));

        right_arm.addOrReplaceChild("right_arm47", CubeListBuilder.create().texOffs(468, 292).addBox(-3.9F, -0.8F, -2.5F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2603F));

        right_arm.addOrReplaceChild("right_arm48", CubeListBuilder.create().texOffs(386, 335).addBox(-3.8251F, -0.8959F, -2.5F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2231F));

        right_arm.addOrReplaceChild("right_arm49", CubeListBuilder.create().texOffs(383, 281).addBox(-9.2463F, -0.154F, 0.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, -2.0F, 0.0F, 0.0F, 0.0F, -0.2603F));

        right_arm.addOrReplaceChild("right_arm51", CubeListBuilder.create().texOffs(250, 50).addBox(-3.5F, 1.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.2231F));

        right_arm.addOrReplaceChild("right_arm53", CubeListBuilder.create().texOffs(250, 90).addBox(-7.0F, 2.8F, 2.7F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, -2.0F, 0.0F, -0.2603F, 0.0F, 0.0F));

        right_arm.addOrReplaceChild("right_arm54", CubeListBuilder.create().texOffs(100, 0).addBox(-5.0F, 7.0F, -2.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, -2.0F, 0.0F));

        right_arm.addOrReplaceChild("right_arm55", CubeListBuilder.create().texOffs(100, 0).addBox(-8.0F, 7.0F, -2.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, -2.0F, 0.0F));

        right_arm.addOrReplaceChild("right_arm56", CubeListBuilder.create().texOffs(92, 60).addBox(-7.0F, 7.0F, -2.4F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, -2.0F, 0.0F));

        right_arm.addOrReplaceChild("right_arm57", CubeListBuilder.create().texOffs(100, 0).addBox(-8.31F, 7.0F, -2.1F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, -2.0F, 0.0F));

        right_arm.addOrReplaceChild("right_arm58", CubeListBuilder.create().texOffs(179, 77).addBox(-8.3F, 7.0F, 1.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, -2.0F, 0.0F));

        right_arm.addOrReplaceChild("right_arm59", CubeListBuilder.create().texOffs(121, 79).addBox(-8.0F, 7.0F, 1.3F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, -2.0F, 0.0F));

        right_arm.addOrReplaceChild("right_arm60", CubeListBuilder.create().texOffs(100, 0).addBox(-4.7F, 7.0F, -2.1F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, -2.0F, 0.0F));

        right_arm.addOrReplaceChild("right_arm61", CubeListBuilder.create().texOffs(100, 0).addBox(-4.7F, 7.0F, 1.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, -2.0F, 0.0F));

        right_arm.addOrReplaceChild("right_arm62", CubeListBuilder.create().texOffs(288, 235).addBox(-7.5F, 6.0F, 2.1F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, -2.0F, 0.0F, -0.0744F, 0.0F, 0.0F));

        right_arm.addOrReplaceChild("right_arm63", CubeListBuilder.create().texOffs(250, 130).addBox(-9.1F, 6.2F, -2.2F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, -2.0F, 0.0F, 0.0F, 0.0F, -0.1115F));

        right_arm.addOrReplaceChild("right_arm64", CubeListBuilder.create().texOffs(339, 122).addBox(-8.9F, 6.8F, -1.1F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, -2.0F, 0.0F, 0.0F, 0.0F, -0.0262F));

        right_arm.addOrReplaceChild("right_arm65", CubeListBuilder.create().texOffs(324, 141).addBox(-6.5F, 9.0F, -2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, -2.0F, 0.0F));

        right_arm.addOrReplaceChild("right_arm66", CubeListBuilder.create().texOffs(100, 0).addBox(-6.5F, 8.0F, 1.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, -2.0F, 0.0F));

        right_arm.addOrReplaceChild("right_arm67", CubeListBuilder.create().texOffs(141, 378).addBox(-8.4F, 10.3F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, -2.0F, 0.0F));

        PartDefinition left_arm = root.addOrReplaceChild("left_arm", CubeListBuilder.create().texOffs(40, 16).mirror().addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(5.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F));

        left_arm.addOrReplaceChild("left_arm1", CubeListBuilder.create().texOffs(391, 252).mirror().addBox(4.0F, -24.0F, -2.1F, 4.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-5.0F, 22.0F, 0.0F));

        left_arm.addOrReplaceChild("left_arm2", CubeListBuilder.create().texOffs(409, 245).mirror().addBox(4.0F, -24.0F, 1.1F, 4.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-5.0F, 22.0F, 0.0F));

        left_arm.addOrReplaceChild("left_arm3", CubeListBuilder.create().texOffs(409, 245).mirror().addBox(7.1F, -24.0F, -2.0F, 1.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-5.0F, 22.0F, 0.0F));

        left_arm.addOrReplaceChild("left_arm4", CubeListBuilder.create().texOffs(400, 0).mirror().addBox(-1.1F, 0.0F, -2.0F, 1.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, -2.0F, 0.0F));

        left_arm.addOrReplaceChild("left_arm5", CubeListBuilder.create().texOffs(409, 245).mirror().addBox(-1.0F, -24.1F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 22.0F, 0.0F));

        left_arm.addOrReplaceChild("left_arm6", CubeListBuilder.create().texOffs(400, 0).mirror().addBox(4.0F, -12.9F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-5.0F, 22.0F, 0.0F));

        left_arm.addOrReplaceChild("left_arm7", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(4.5F, -20.0F, -2.3F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-5.0F, 22.0F, 0.0F));

        left_arm.addOrReplaceChild("left_arm13", CubeListBuilder.create().texOffs(200, 430).mirror().addBox(0.0F, 1.5F, -2.9F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1859F, 0.0F, 0.0F));

        left_arm.addOrReplaceChild("left_arm14", CubeListBuilder.create().texOffs(468, 292).mirror().addBox(1.9F, -0.8F, -2.5F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2603F));

        left_arm.addOrReplaceChild("left_arm15", CubeListBuilder.create().texOffs(386, 335).mirror().addBox(1.8251F, -0.8959F, -2.5F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2231F));

        left_arm.addOrReplaceChild("left_arm16", CubeListBuilder.create().texOffs(383, 281).mirror().addBox(7.2463F, -0.154F, 0.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.2603F));

        left_arm.addOrReplaceChild("left_arm18", CubeListBuilder.create().texOffs(250, 50).mirror().addBox(2.5F, 1.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.0F, 0.0F, 0.0F, 0.0F, -0.2231F));

        left_arm.addOrReplaceChild("left_arm20", CubeListBuilder.create().texOffs(250, 90).mirror().addBox(5.0F, 2.8F, 2.7F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.0F, -2.0F, 0.0F, -0.2603F, 0.0F, 0.0F));

        left_arm.addOrReplaceChild("left_arm21", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(4.0F, 7.0F, -2.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-5.0F, -2.0F, 0.0F));

        left_arm.addOrReplaceChild("left_arm22", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(7.0F, 7.0F, -2.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-5.0F, -2.0F, 0.0F));

        left_arm.addOrReplaceChild("left_arm23", CubeListBuilder.create().texOffs(92, 60).mirror().addBox(5.0F, 7.0F, -2.4F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-5.0F, -2.0F, 0.0F));

        left_arm.addOrReplaceChild("left_arm24", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(7.3F, 7.0F, -2.1F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-5.0F, -2.0F, 0.0F));

        left_arm.addOrReplaceChild("left_arm25", CubeListBuilder.create().texOffs(179, 77).mirror().addBox(7.31F, 7.0F, 1.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-5.0F, -2.0F, 0.0F));

        left_arm.addOrReplaceChild("left_arm26", CubeListBuilder.create().texOffs(121, 79).mirror().addBox(4.0F, 7.0F, 1.3F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-5.0F, -2.0F, 0.0F));

        left_arm.addOrReplaceChild("left_arm27", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(3.7F, 7.0F, -2.1F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-5.0F, -2.0F, 0.0F));

        left_arm.addOrReplaceChild("left_arm28", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(3.7F, 7.0F, 1.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-5.0F, -2.0F, 0.0F));

        left_arm.addOrReplaceChild("left_arm29", CubeListBuilder.create().texOffs(288, 235).mirror().addBox(4.5F, 6.0F, 2.1F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.0F, -2.0F, 0.0F, -0.0744F, 0.0F, 0.0F));

        left_arm.addOrReplaceChild("left_arm30", CubeListBuilder.create().texOffs(250, 130).mirror().addBox(8.1F, 6.2F, -2.2F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.1115F));

        left_arm.addOrReplaceChild("left_arm31", CubeListBuilder.create().texOffs(339, 122).mirror().addBox(7.9F, 6.8F, -1.1F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0262F));

        left_arm.addOrReplaceChild("left_arm33", CubeListBuilder.create().texOffs(324, 141).mirror().addBox(5.5F, 9.0F, -2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-5.0F, -2.0F, 0.0F));

        left_arm.addOrReplaceChild("left_arm34", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(5.5F, 8.0F, 1.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-5.0F, -2.0F, 0.0F));

        left_arm.addOrReplaceChild("left_arm35", CubeListBuilder.create().texOffs(141, 378).mirror().addBox(6.4F, 10.3F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-5.0F, -2.0F, 0.0F));

        PartDefinition right_leg = root.addOrReplaceChild("right_leg", CubeListBuilder.create().texOffs(0, 16).mirror().addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-2.0F, 12.0F, 0.0F));

        right_leg.addOrReplaceChild("right_leg1", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-4.2F, 13.0F, -2.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

        right_leg.addOrReplaceChild("right_leg2", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-4.0F, 13.0F, 1.2F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

        right_leg.addOrReplaceChild("right_leg3", CubeListBuilder.create().texOffs(250, 390).mirror().addBox(-14.3438F, 1.0166F, -2.3F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.0F, -12.0F, 0.0F, 0.0F, 0.0F, -1.2641F));

        right_leg.addOrReplaceChild("right_leg4", CubeListBuilder.create().texOffs(250, 410).mirror().addBox(-14.3438F, 1.0166F, 1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.0F, -12.0F, 0.0F, 0.0F, 0.0F, -1.2641F));

        right_leg.addOrReplaceChild("right_leg5", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-3.1F, 13.5F, 1.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

        right_leg.addOrReplaceChild("right_leg6", CubeListBuilder.create().texOffs(45, 104).mirror().addBox(-3.1F, 13.5F, -2.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

        right_leg.addOrReplaceChild("right_leg7", CubeListBuilder.create().texOffs(144, 179).mirror().addBox(-4.1F, 13.0F, -2.2F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

        right_leg.addOrReplaceChild("right_leg8", CubeListBuilder.create().texOffs(166, 120).mirror().addBox(-3.1F, 15.0F, -2.2F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

        right_leg.addOrReplaceChild("right_leg9", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-0.8F, 15.2F, -2.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

        right_leg.addOrReplaceChild("right_leg10", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-0.8F, 15.8F, -2.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

        right_leg.addOrReplaceChild("right_leg11", CubeListBuilder.create().texOffs(256, 333).mirror().addBox(-3.0F, 20.0F, -2.3F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

        right_leg.addOrReplaceChild("right_leg12", CubeListBuilder.create().texOffs(254, 277).mirror().addBox(-4.0F, 20.0F, -2.21F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

        right_leg.addOrReplaceChild("right_leg13", CubeListBuilder.create().texOffs(252, 177).mirror().addBox(-4.0F, 19.0F, 1.2F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

        right_leg.addOrReplaceChild("right_leg14", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-4.2F, 19.0F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

        right_leg.addOrReplaceChild("right_leg15", CubeListBuilder.create().texOffs(252, 432).mirror().addBox(-6.6559F, 12.1712F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.0F, -12.0F, 0.0F, 0.0F, 0.0F, -0.1487F));

        right_leg.addOrReplaceChild("right_leg35", CubeListBuilder.create().texOffs(253, 433).mirror().addBox(-6.6559F, 10.0406F, 6.9516F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.0F, -12.0F, 0.0F, -0.5236F, 0.0F, -0.1487F));

        right_leg.addOrReplaceChild("right_leg36", CubeListBuilder.create().texOffs(253, 433).mirror().addBox(-6.6559F, 10.0406F, -7.9516F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.0F, -12.0F, 0.0F, 0.5236F, 0.0F, -0.1487F));

        right_leg.addOrReplaceChild("right_leg39", CubeListBuilder.create().texOffs(250, 430).mirror().addBox(-6.8F, 14.0406F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.0F, -12.0F, 0.0F, 0.0F, 0.0F, -0.1487F));

        right_leg.addOrReplaceChild("right_leg40", CubeListBuilder.create().texOffs(252, 432).mirror().addBox(-6.8F, 13.0255F, -7.7882F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.0F, -12.0F, 0.0F, 0.5236F, 0.0F, -0.1487F));

        right_leg.addOrReplaceChild("right_leg41", CubeListBuilder.create().texOffs(252, 432).mirror().addBox(-6.8F, 13.0255F, 5.7882F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.0F, -12.0F, 0.0F, -0.5236F, 0.0F, -0.1487F));

        right_leg.addOrReplaceChild("right_leg37", CubeListBuilder.create().texOffs(253, 433).mirror().addBox(-6.6559F, 12.6712F, 0.866F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.0F, -12.0F, 0.0F, 0.0F, 0.0F, -0.1487F));

        right_leg.addOrReplaceChild("right_leg38", CubeListBuilder.create().texOffs(253, 433).mirror().addBox(-6.6559F, 12.6712F, -1.866F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.0F, -12.0F, 0.0F, 0.0F, 0.0F, -0.1487F));

        right_leg.addOrReplaceChild("right_leg16", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-5.5F, 15.5F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.0F, -12.0F, 0.0F, 0.0F, 0.0F, -0.0436F));

        right_leg.addOrReplaceChild("right_leg17", CubeListBuilder.create().texOffs(250, 450).mirror().addBox(-7.3559F, 17.3712F, -1.5F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.0F, -12.0F, 0.0F, 0.0F, 0.0F, -0.1487F));

        right_leg.addOrReplaceChild("right_leg18", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-4.4F, 19.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

        right_leg.addOrReplaceChild("right_leg19", CubeListBuilder.create().texOffs(102, 1).mirror().addBox(-3.0F, 19.0F, 1.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

        right_leg.addOrReplaceChild("right_leg20", CubeListBuilder.create().texOffs(250, 470).mirror().addBox(-3.0F, 18.5254F, -4.6357F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.0F, -12.0F, 0.0F, 0.1115F, 0.0F, 0.0F));

        right_leg.addOrReplaceChild("right_leg34", CubeListBuilder.create().texOffs(251, 470).mirror().addBox(-2.5F, 17.7F, -4.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.0F, -12.0F, 0.0F, 0.1115F, 0.0F, 0.0F));

        right_leg.addOrReplaceChild("right_leg21", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-4.2F, 18.3F, -2.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

        right_leg.addOrReplaceChild("right_leg22", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-0.8F, 18.3F, -2.2F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

        right_leg.addOrReplaceChild("right_leg23", CubeListBuilder.create().texOffs(102, 143).mirror().addBox(-4.0F, 15.0F, 1.21F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

        right_leg.addOrReplaceChild("right_leg24", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-0.9F, 15.8F, 1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(100, 0).addBox(-0.1F, 15.8F, 1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, -12.0F, 0.0F));

        right_leg.addOrReplaceChild("right_leg25", CubeListBuilder.create().texOffs(113, 243).mirror().addBox(-3.5F, 22.0F, -2.7F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

        right_leg.addOrReplaceChild("right_leg26", CubeListBuilder.create().texOffs(98, 0).mirror().addBox(-2.8F, 18.3F, 1.2F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

        right_leg.addOrReplaceChild("right_leg27", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-4.2F, 18.3F, 1.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

        right_leg.addOrReplaceChild("right_leg28", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-0.8F, 19.0F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

        right_leg.addOrReplaceChild("right_leg29", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-0.8F, 23.0F, -2.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(100, 0).addBox(-0.2F, 23.0F, -2.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, -12.0F, 0.0F));

        right_leg.addOrReplaceChild("right_leg30", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-4.2F, 23.0F, -2.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

        right_leg.addOrReplaceChild("right_leg31", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-4.3F, 22.0F, 0.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

        right_leg.addOrReplaceChild("right_leg32", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-0.7F, 22.0F, 0.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

        right_leg.addOrReplaceChild("right_leg33", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-3.5F, 23.0F, 1.3F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

        PartDefinition left_leg = root.addOrReplaceChild("left_leg", CubeListBuilder.create().texOffs(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, 12.0F, 0.0F));

        left_leg.addOrReplaceChild("left_leg1", CubeListBuilder.create().texOffs(100, 0).addBox(-0.2F, 18.3F, -2.2F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

        left_leg.addOrReplaceChild("left_leg2", CubeListBuilder.create().texOffs(98, 0).addBox(-0.2F, 18.3F, 1.2F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

        left_leg.addOrReplaceChild("left_leg3", CubeListBuilder.create().texOffs(100, 0).addBox(-0.2F, 15.2F, -2.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

        left_leg.addOrReplaceChild("left_leg4", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-0.2F, 15.2F, 1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-2.0F, -12.0F, 0.0F));

        left_leg.addOrReplaceChild("left_leg5", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-0.2F, 15.8F, 1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-2.0F, -12.0F, 0.0F));

        left_leg.addOrReplaceChild("left_leg6", CubeListBuilder.create().texOffs(100, 0).addBox(-0.2F, 15.8F, -2.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

        left_leg.addOrReplaceChild("left_leg7", CubeListBuilder.create().texOffs(100, 0).addBox(-0.3F, 22.0F, 0.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

        left_leg.addOrReplaceChild("left_leg8", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-0.2F, 23.0F, -2.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-2.0F, -12.0F, 0.0F));

        left_leg.addOrReplaceChild("left_leg9", CubeListBuilder.create().texOffs(100, 0).addBox(-0.2F, 19.0F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

        left_leg.addOrReplaceChild("left_leg10", CubeListBuilder.create().texOffs(166, 120).addBox(0.1F, 15.0F, -2.2F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

        left_leg.addOrReplaceChild("left_leg11", CubeListBuilder.create().texOffs(100, 0).addBox(2.1F, 13.5F, -2.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

        left_leg.addOrReplaceChild("left_leg12", CubeListBuilder.create().texOffs(250, 390).addBox(13.3438F, 1.0166F, -2.3F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -12.0F, 0.0F, 0.0F, 0.0F, 1.2641F));

        left_leg.addOrReplaceChild("left_leg13", CubeListBuilder.create().texOffs(144, 179).addBox(3.1F, 13.0F, -2.2F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

        left_leg.addOrReplaceChild("left_leg14", CubeListBuilder.create().texOffs(100, 0).addBox(3.2F, 13.0F, -2.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

        left_leg.addOrReplaceChild("left_leg15", CubeListBuilder.create().texOffs(100, 0).addBox(4.3F, 15.5F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -12.0F, 0.0F, 0.0F, 0.0F, 0.0436F));

        left_leg.addOrReplaceChild("left_leg16", CubeListBuilder.create().texOffs(252, 432).addBox(5.6559F, 12.1712F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -12.0F, 0.0F, 0.0F, 0.0F, 0.1487F));

        left_leg.addOrReplaceChild("left_leg36", CubeListBuilder.create().texOffs(253, 433).addBox(5.6559F, 10.0406F, 6.9516F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -12.0F, 0.0F, -0.5236F, 0.0F, 0.1487F));

        left_leg.addOrReplaceChild("left_leg37", CubeListBuilder.create().texOffs(253, 433).addBox(5.6559F, 10.0406F, -7.9516F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -12.0F, 0.0F, 0.5236F, 0.0F, 0.1487F));

        left_leg.addOrReplaceChild("left_leg38", CubeListBuilder.create().texOffs(253, 433).addBox(5.6559F, 12.6712F, -1.866F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -12.0F, 0.0F, 0.0F, 0.0F, 0.1487F));

        left_leg.addOrReplaceChild("left_leg39", CubeListBuilder.create().texOffs(253, 433).addBox(5.6559F, 12.6712F, 0.866F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -12.0F, 0.0F, 0.0F, 0.0F, 0.1487F));

        left_leg.addOrReplaceChild("left_leg40", CubeListBuilder.create().texOffs(250, 430).addBox(5.8F, 14.0406F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -12.0F, 0.0F, 0.0F, 0.0F, 0.1487F));

        left_leg.addOrReplaceChild("left_leg41", CubeListBuilder.create().texOffs(252, 432).addBox(5.8F, 13.0255F, 5.7882F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -12.0F, 0.0F, -0.5236F, 0.0F, 0.1487F));

        left_leg.addOrReplaceChild("left_leg42", CubeListBuilder.create().texOffs(252, 432).addBox(5.8F, 13.0255F, -7.7882F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -12.0F, 0.0F, 0.5236F, 0.0F, 0.1487F));

        left_leg.addOrReplaceChild("left_leg17", CubeListBuilder.create().texOffs(102, 143).addBox(0.0F, 15.0F, 1.21F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

        left_leg.addOrReplaceChild("left_leg18", CubeListBuilder.create().texOffs(100, 0).addBox(3.0F, 13.0F, 1.2F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

        left_leg.addOrReplaceChild("left_leg19", CubeListBuilder.create().texOffs(100, 0).addBox(2.1F, 13.5F, 1.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

        left_leg.addOrReplaceChild("left_leg20", CubeListBuilder.create().texOffs(250, 410).addBox(13.3438F, 1.0166F, 1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -12.0F, 0.0F, 0.0F, 0.0F, 1.2641F));

        left_leg.addOrReplaceChild("left_leg21", CubeListBuilder.create().texOffs(254, 277).addBox(0.0F, 20.0F, -2.21F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

        left_leg.addOrReplaceChild("left_leg22", CubeListBuilder.create().texOffs(256, 333).addBox(1.0F, 20.0F, -2.3F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

        left_leg.addOrReplaceChild("left_leg23", CubeListBuilder.create().texOffs(250, 470).addBox(1.0F, 18.5254F, -4.6357F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -12.0F, 0.0F, 0.1115F, 0.0F, 0.0F));

        left_leg.addOrReplaceChild("left_leg35", CubeListBuilder.create().texOffs(251, 470).addBox(1.5F, 17.7F, -4.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -12.0F, 0.0F, 0.1115F, 0.0F, 0.0F));

        left_leg.addOrReplaceChild("left_leg24", CubeListBuilder.create().texOffs(100, 0).addBox(3.2F, 23.0F, -2.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

        left_leg.addOrReplaceChild("left_leg25", CubeListBuilder.create().texOffs(113, 243).addBox(0.5F, 22.0F, -2.7F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

        left_leg.addOrReplaceChild("left_leg26", CubeListBuilder.create().texOffs(100, 0).addBox(0.5F, 23.0F, 1.3F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

        left_leg.addOrReplaceChild("left_leg27", CubeListBuilder.create().texOffs(100, 0).addBox(3.3F, 22.0F, 0.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

        left_leg.addOrReplaceChild("left_leg28", CubeListBuilder.create().texOffs(100, 0).addBox(3.2F, 18.3F, -2.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

        left_leg.addOrReplaceChild("left_leg29", CubeListBuilder.create().texOffs(100, 0).addBox(2.2F, 18.3F, 1.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

        left_leg.addOrReplaceChild("left_leg30", CubeListBuilder.create().texOffs(100, 0).addBox(3.2F, 19.0F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

        left_leg.addOrReplaceChild("left_leg31", CubeListBuilder.create().texOffs(100, 0).addBox(3.4F, 19.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

        left_leg.addOrReplaceChild("left_leg32", CubeListBuilder.create().texOffs(250, 450).addBox(6.3559F, 17.3712F, -1.5F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -12.0F, 0.0F, 0.0F, 0.0F, 0.1487F));

        left_leg.addOrReplaceChild("left_leg33", CubeListBuilder.create().texOffs(102, 1).addBox(1.0F, 19.0F, 1.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

        left_leg.addOrReplaceChild("left_leg34", CubeListBuilder.create().texOffs(245, 192).addBox(0.0F, 19.0F, 1.2F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

        left_leg.addOrReplaceChild("left_leg43", CubeListBuilder.create().texOffs(102, -1).addBox(4.5F, 15.5F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -12.0F, 0.0F, 0.0F, 0.0F, 0.0436F));

        return LayerDefinition.create(definition, 512, 512);
    }

    @Override
    public void renderToBuffer(PoseStack matrixStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        // Ensure all parts of the model are visible
        this.leftLeg.visible = true;
        this.rightArm.visible = true;
        this.rightLeg.visible = true;
        this.leftArm.visible = true;
        this.head.visible = true;
        this.body.visible = true;

        // Call the superclass method to handle actual rendering
        super.renderToBuffer(matrixStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }


}