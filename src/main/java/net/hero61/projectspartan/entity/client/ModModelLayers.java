package net.hero61.projectspartan.entity.client;

import net.hero61.projectspartan.ProjectSpartan;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.resources.ResourceLocation;

public class ModModelLayers {
    public static final ModelLayerLocation SPARTAN_AIRASSAULT_LAYER = new ModelLayerLocation(
            new ResourceLocation(ProjectSpartan.MOD_ID, "airassault_entity"), "main");
    public static final ModelLayerLocation SPARTAN_ACHILLES_LAYER = new ModelLayerLocation(
            new ResourceLocation(ProjectSpartan.MOD_ID, "achilles_entity"), "main");
    public static final ModelLayerLocation SPARTAN_BUCCANEER_LAYER = new ModelLayerLocation(
            new ResourceLocation(ProjectSpartan.MOD_ID, "buccaneer_entity"), "main");
    public static final ModelLayerLocation SPARTAN_OCEANIC_LAYER = new ModelLayerLocation(
            new ResourceLocation(ProjectSpartan.MOD_ID, "oceanic_entity"),"main");
}
