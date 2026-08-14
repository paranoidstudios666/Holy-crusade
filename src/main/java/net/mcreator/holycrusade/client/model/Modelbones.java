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
public class Modelbones extends EntityModel<LivingEntityRenderState> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(Identifier.fromNamespaceAndPath("holy_crusade", "modelbones"), "main");
	public final ModelPart bone4;
	public final ModelPart cabesa2;
	public final ModelPart cabesa;
	public final ModelPart bone6;
	public final ModelPart mandi;
	public final ModelPart bone2;
	public final ModelPart pataizq;
	public final ModelPart patader;
	public final ModelPart brzodere;
	public final ModelPart brasoo;
	public final ModelPart brasoizq;
	public final ModelPart brasoo2;
	public final ModelPart bone;
	public final ModelPart wataa;
	public final ModelPart bone3;

	public Modelbones(ModelPart root) {
		super(root);
		this.bone4 = root.getChild("bone4");
		this.cabesa2 = this.bone4.getChild("cabesa2");
		this.cabesa = this.cabesa2.getChild("cabesa");
		this.bone6 = this.cabesa2.getChild("bone6");
		this.mandi = this.cabesa2.getChild("mandi");
		this.bone2 = this.mandi.getChild("bone2");
		this.pataizq = this.bone4.getChild("pataizq");
		this.patader = this.bone4.getChild("patader");
		this.brzodere = this.bone4.getChild("brzodere");
		this.brasoo = this.brzodere.getChild("brasoo");
		this.brasoizq = this.bone4.getChild("brasoizq");
		this.brasoo2 = this.brasoizq.getChild("brasoo2");
		this.bone = this.bone4.getChild("bone");
		this.wataa = this.bone.getChild("wataa");
		this.bone3 = this.wataa.getChild("bone3");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition bone4 = partdefinition.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(0.0F, 18.0F, 1.0F));
		PartDefinition cabesa2 = bone4.addOrReplaceChild("cabesa2", CubeListBuilder.create(), PartPose.offset(0.0F, -16.0F, -1.0F));
		PartDefinition cabesa = cabesa2.addOrReplaceChild("cabesa", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition bone6 = cabesa2.addOrReplaceChild("bone6", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -6.0F, -7.0F, 8.0F, 7.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(41, 17)
				.addBox(-4.0F, 0.01F, -7.0F, 8.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(40, 16).addBox(-4.0F, 0.0F, -7.0F, 8.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -2.0F, 0.0F));
		PartDefinition mandi = cabesa2.addOrReplaceChild("mandi", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0F, 0.0F, 0.0436F, 0.0F, 0.0F));
		PartDefinition bone2 = mandi.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1745F, 0.0F, 0.0F));
		PartDefinition cube_r1 = bone2.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(32, 6).addBox(-4.0F, -1.0F, -6.9F, 8.0F, 2.0F, 8.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0873F, 0.0F, 0.0F));
		PartDefinition pataizq = bone4.addOrReplaceChild("pataizq", CubeListBuilder.create().texOffs(0, 16).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, -6.0F, 1.0F));
		PartDefinition patader = bone4.addOrReplaceChild("patader", CubeListBuilder.create().texOffs(0, 16).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -6.0F, 1.0F));
		PartDefinition brzodere = bone4.addOrReplaceChild("brzodere", CubeListBuilder.create(), PartPose.offset(-9.0F, -15.0F, -2.0F));
		PartDefinition brasoo = brzodere.addOrReplaceChild("brasoo", CubeListBuilder.create().texOffs(0, 16).addBox(3.05F, -1.0F, -1.0F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.5708F, 0.0F, 0.0F));
		PartDefinition brasoizq = bone4.addOrReplaceChild("brasoizq", CubeListBuilder.create(), PartPose.offset(2.0F, -15.0F, -2.0F));
		PartDefinition brasoo2 = brasoizq.addOrReplaceChild("brasoo2", CubeListBuilder.create().texOffs(0, 16).addBox(1.95F, -1.0F, -1.0F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.5708F, 0.0F, 0.0F));
		PartDefinition bone = bone4.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(0.0F, 8.0F, -1.0F));
		PartDefinition wataa = bone.addOrReplaceChild("wataa", CubeListBuilder.create().texOffs(40, 24).addBox(-4.0F, -17.0F, 0.0F, 8.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -1.0F, 0.0F));
		PartDefinition cube_r2 = wataa.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(16, 16).addBox(-4.0F, -4.62F, -1.07F, 8.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -19.0F, 0.0F, 0.3927F, 0.0F, 0.0F));
		PartDefinition bone3 = wataa.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 32);
	}

	public void setupAnim(LivingEntityRenderState state) {
		float limbSwing = state.walkAnimationPos;
		float limbSwingAmount = state.walkAnimationSpeed;
		float ageInTicks = state.ageInTicks;
		float netHeadYaw = state.yRot;
		float headPitch = state.xRot;

	}
}