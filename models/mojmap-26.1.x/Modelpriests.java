// Made with Blockbench 5.1.6
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelpriests<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "priests"), "main");
	private final ModelPart bone;
	private final ModelPart bone5;
	private final ModelPart bone6;
	private final ModelPart bone2;
	private final ModelPart bone3;
	private final ModelPart bone4;

	public Modelpriests(ModelPart root) {
		this.bone = root.getChild("bone");
		this.bone5 = this.bone.getChild("bone5");
		this.bone6 = this.bone5.getChild("bone6");
		this.bone2 = this.bone.getChild("bone2");
		this.bone3 = this.bone2.getChild("bone3");
		this.bone4 = this.bone.getChild("bone4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bone = partdefinition.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-6.0F, -26.0F, -5.0F, 12.0F, 26.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition bone5 = bone.addOrReplaceChild("bone5", CubeListBuilder.create().texOffs(44, 55)
				.addBox(-17.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(44, 47)
				.addBox(-13.0F, 6.0F, -2.0F, 10.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(44, 55).mirror()
				.addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(8.0F, -21.0F, 0.0F, -0.829F, 0.0F, 0.0F));

		PartDefinition bone6 = bone5.addOrReplaceChild("bone6", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-6.0F, 11.0F, 2.0F, -0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r1 = bone6.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(6, 63).addBox(-5.0F, -6.0F, -3.0F, 6.0F, 6.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.0F, -8.0F, -2.8862F, 0.0058F, 0.0068F));

		PartDefinition bone2 = bone.addOrReplaceChild("bone2",
				CubeListBuilder.create().texOffs(44, 0).addBox(-4.5F, -2.0F, -7.0F, 9.0F, 5.0F, 10.0F,
						new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(0.0F, -27.0F, 0.0F, 0.3491F, 0.0F, 0.0F));

		PartDefinition bone3 = bone2.addOrReplaceChild("bone3", CubeListBuilder.create(),
				PartPose.offset(0.0F, 1.0F, 0.0F));

		PartDefinition cube_r2 = bone3.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(44, 31)
						.addBox(-4.0F, -32.0F, -7.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.5F)).texOffs(44, 15)
						.addBox(-4.0F, -32.0F, -7.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 25.0F, -8.0F, -0.2618F, 0.0F, 0.0F));

		PartDefinition bone4 = bone.addOrReplaceChild("bone4", CubeListBuilder.create().texOffs(0, 36).addBox(-6.0F,
				-12.5F, -5.0F, 12.0F, 12.0F, 10.0F, new CubeDeformation(0.5F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}