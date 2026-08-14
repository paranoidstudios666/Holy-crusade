package net.mcreator.holycrusade.client.model;

import net.minecraft.resources.Identifier;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

// Made with Blockbench 5.1.6
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelratalien_Converted extends EntityModel<LivingEntityRenderState> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(Identifier.fromNamespaceAndPath("holy_crusade", "modelratalien_converted"), "main");
	public final ModelPart cuerpo;
	public final ModelPart bone6;
	public final ModelPart bone5;
	public final ModelPart bone4;
	public final ModelPart bone7;
	public final ModelPart bone;
	public final ModelPart bone3;
	public final ModelPart bone2;

	public Modelratalien_Converted(ModelPart root) {
		super(root);
		this.cuerpo = root.getChild("cuerpo");
		this.bone6 = this.cuerpo.getChild("bone6");
		this.bone5 = this.cuerpo.getChild("bone5");
		this.bone4 = this.cuerpo.getChild("bone4");
		this.bone7 = this.cuerpo.getChild("bone7");
		this.bone = this.cuerpo.getChild("bone");
		this.bone3 = this.cuerpo.getChild("bone3");
		this.bone2 = this.cuerpo.getChild("bone2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition cuerpo = partdefinition.addOrReplaceChild("cuerpo", CubeListBuilder.create().texOffs(5, 17).addBox(-8.5F, -5.0F, -1.0F, 5.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(6.0F, 24.0F, -3.0F));
		PartDefinition cube_r1 = cuerpo.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 3).mirror().addBox(-4.5F, -3.0F, -0.35F, 3.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-5.0F, -2.0F, -1.0F, 0.0F, -3.0107F, 0.0F));
		PartDefinition cube_r2 = cuerpo.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 3).mirror().addBox(-4.5F, -3.0F, -0.75F, 3.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-7.0F, -2.0F, 0.0F, 0.0F, -0.1309F, 0.0F));
		PartDefinition bone6 = cuerpo.addOrReplaceChild("bone6", CubeListBuilder.create(), PartPose.offset(-3.0F, -5.0F, 0.0F));
		PartDefinition cube_r3 = bone6.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(8, -2).mirror().addBox(-0.1088F, -4.5F, 0.0F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.6545F));
		PartDefinition bone5 = cuerpo.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offset(-8.0F, -5.0F, 0.0F));
		PartDefinition cube_r4 = bone5.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(8, -2).addBox(-8.5F, -8.5F, 0.0F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(10.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.6545F));
		PartDefinition bone4 = cuerpo.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-8.0F, 0.0F, 7.0F, 0.0F, 1.9199F, 0.0F));
		PartDefinition cube_r5 = bone4.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(4, 11).addBox(-2.46F, 0.9F, -1.0098F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.96F, -1.0F, 0.0098F, 0.0F, -0.6981F, 0.0F));
		PartDefinition bone7 = cuerpo.addOrReplaceChild("bone7", CubeListBuilder.create().texOffs(10, 2).addBox(0.0F, 0.0F, 1.0F, 0.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(-6.0F, -2.0F, 6.0F));
		PartDefinition bone = cuerpo.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.0F, 0.0F, 0.0F, 0.0F, -0.2182F, 0.0F));
		PartDefinition cube_r6 = bone.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(4, 11).addBox(0.0F, -3.1F, -1.0F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 3.0F, -2.0F, 0.0F, -0.6109F, 0.0F));
		PartDefinition bone3 = cuerpo.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.0F, 0.0F, 7.0F, 0.0F, -0.2182F, 0.0F));
		PartDefinition cube_r7 = bone3.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(4, 11).addBox(-1.1861F, -0.1F, -1.8F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -1.0F, 0.0F, -1.0908F, 0.0F));
		PartDefinition bone2 = cuerpo.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(-8.0F, 0.0F, 0.0F, 0.0F, 1.0908F, 0.0F));
		PartDefinition cube_r8 = bone2.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(4, 11).addBox(0.153F, -3.1F, -0.048F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.153F, 3.0F, -2.452F, 0.0F, -0.3927F, 0.0F));
		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	public void setupAnim(LivingEntityRenderState state) {
		float limbSwing = state.walkAnimationPos;
		float limbSwingAmount = state.walkAnimationSpeed;
		float ageInTicks = state.ageInTicks;
		float netHeadYaw = state.yRot;
		float headPitch = state.xRot;

	}
}