// Made with Blockbench 5.1.6
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modeltemokarr<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "temokarr"), "main");
	private final ModelPart bone3;
	private final ModelPart bone8;
	private final ModelPart bone5;
	private final ModelPart bone6;
	private final ModelPart bone9;
	private final ModelPart bone4;
	private final ModelPart bone7;
	private final ModelPart bone;
	private final ModelPart bone2;

	public Modeltemokarr(ModelPart root) {
		this.bone3 = root.getChild("bone3");
		this.bone8 = this.bone3.getChild("bone8");
		this.bone5 = this.bone8.getChild("bone5");
		this.bone6 = this.bone8.getChild("bone6");
		this.bone9 = this.bone6.getChild("bone9");
		this.bone4 = this.bone8.getChild("bone4");
		this.bone7 = this.bone8.getChild("bone7");
		this.bone = this.bone3.getChild("bone");
		this.bone2 = this.bone3.getChild("bone2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bone3 = partdefinition.addOrReplaceChild("bone3", CubeListBuilder.create(),
				PartPose.offset(2.0F, 12.0F, 1.0F));

		PartDefinition bone8 = bone3.addOrReplaceChild("bone8", CubeListBuilder.create(),
				PartPose.offsetAndRotation(1.0F, 0.0F, -1.0F, 0.2618F, 0.0F, 0.0F));

		PartDefinition bone5 = bone8.addOrReplaceChild("bone5", CubeListBuilder.create().texOffs(48, 37).mirror()
				.addBox(0.0F, -2.0F, -2.0F, 4.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 33)
				.mirror().addBox(-0.25F, -2.5F, -2.5F, 5.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.0F, -9.0F, 2.0F, -0.3054F, 0.0F, 0.0F));

		PartDefinition bone6 = bone8.addOrReplaceChild("bone6",
				CubeListBuilder.create().texOffs(0, 33)
						.addBox(-4.75F, -2.5F, -2.5F, 5.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(48, 37)
						.addBox(-4.0F, -2.0F, -2.0F, 4.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0F, -9.0F, 2.0F, -0.2618F, 0.0F, 0.0F));

		PartDefinition bone9 = bone6.addOrReplaceChild("bone9", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-1.0F, 10.0F, -2.0F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r1 = bone9.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(0, 32)
						.addBox(1.1F, -16.0F, -9.0F, 0.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 32)
						.addBox(1.2F, -16.0F, -9.0F, 0.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 32)
						.addBox(1.3F, -16.0F, -9.0F, 0.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 32)
						.addBox(1.4F, -16.0F, -9.0F, 0.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 32)
						.addBox(0.65F, -16.0F, -9.0F, 0.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 32)
						.addBox(0.75F, -16.0F, -9.0F, 0.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 32)
						.addBox(0.9F, -16.0F, -9.0F, 0.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 32)
						.addBox(1.0F, -16.0F, -9.0F, 0.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 32)
						.addBox(1.5F, -16.0F, -9.0F, 0.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 32)
						.addBox(0.5F, -16.0F, -9.0F, 0.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 5.0F, 1.0F, 0.7446F, -0.0115F, -0.0182F));

		PartDefinition bone4 = bone8.addOrReplaceChild("bone4", CubeListBuilder.create().texOffs(32, 11).addBox(-2.0F,
				-12.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-5.0F, 0.0F, 1.0F));

		PartDefinition cube_r2 = bone4.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(32, 0).addBox(-8.0F, -2.0F, -1.0F, 10.0F, 6.0F, 5.0F,
						new CubeDeformation(0.3F)),
				PartPose.offsetAndRotation(5.0F, -10.0F, -1.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r3 = bone4.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(32, 27).addBox(-7.0F, -2.0F, -2.0F, 8.0F, 5.0F, 5.0F,
						new CubeDeformation(0.3F)),
				PartPose.offsetAndRotation(5.0F, 0.0F, -1.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition bone7 = bone8.addOrReplaceChild("bone7",
				CubeListBuilder.create().texOffs(0, 17)
						.addBox(-4.0F, -5.2291F, -5.0394F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-4.0F, -6.2291F, -5.0394F, 8.0F, 9.0F, 8.0F, new CubeDeformation(0.3F)),
				PartPose.offsetAndRotation(-3.0F, -14.0F, 3.0F, -0.2182F, 0.0F, 0.0F));

		PartDefinition bone = bone3.addOrReplaceChild("bone",
				CubeListBuilder.create().texOffs(32, 38)
						.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(48, 54)
						.mirror().addBox(-2.0F, 6.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.3F)).mirror(false),
				PartPose.offset(-4.0F, 0.0F, 0.0F));

		PartDefinition bone2 = bone3.addOrReplaceChild("bone2", CubeListBuilder.create().texOffs(48, 54)
				.addBox(-2.0F, 6.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.31F)).texOffs(32, 38).mirror()
				.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		bone3.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}