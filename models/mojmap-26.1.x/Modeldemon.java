// Made with Blockbench 5.1.6
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modeldemon<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "demon"), "main");
	private final ModelPart bone3;
	private final ModelPart piernaderecha;
	private final ModelPart brazoddreco;
	private final ModelPart bone;
	private final ModelPart bone2;
	private final ModelPart brasoiskierdo;
	private final ModelPart patasikierda;

	public Modeldemon(ModelPart root) {
		this.bone3 = root.getChild("bone3");
		this.piernaderecha = this.bone3.getChild("piernaderecha");
		this.brazoddreco = this.bone3.getChild("brazoddreco");
		this.bone = this.brazoddreco.getChild("bone");
		this.bone2 = this.bone3.getChild("bone2");
		this.brasoiskierdo = this.bone3.getChild("brasoiskierdo");
		this.patasikierda = this.bone3.getChild("patasikierda");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bone3 = partdefinition.addOrReplaceChild("bone3", CubeListBuilder.create(),
				PartPose.offset(0.0F, 16.0F, 1.0F));

		PartDefinition piernaderecha = bone3.addOrReplaceChild("piernaderecha", CubeListBuilder.create().texOffs(15, 28)
				.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-3.0F, 4.0F, 0.0F));

		PartDefinition brazoddreco = bone3.addOrReplaceChild("brazoddreco",
				CubeListBuilder.create().texOffs(29, 10).mirror()
						.addBox(-2.5F, -2.0F, -1.5F, 3.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(-6.5F, -2.0F, -0.5F));

		PartDefinition bone = brazoddreco.addOrReplaceChild("bone",
				CubeListBuilder.create().texOffs(51, 51)
						.addBox(0.0F, -12.0F, -1.0F, 1.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(50, 45)
						.addBox(-0.5F, -13.0F, -1.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(36, 31)
						.addBox(-5.0F, -21.0F, -0.5F, 11.0F, 9.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 5.0F, 3.0F, 1.5708F, 0.0F, -1.5708F));

		PartDefinition bone2 = bone3.addOrReplaceChild("bone2", CubeListBuilder.create().texOffs(0, 41)
				.addBox(1.5F, -15.0F, -6.5F, 12.0F, 16.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(47, 14)
				.addBox(2.5F, -21.0F, -4.5F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(47, 14).mirror()
				.addBox(9.5F, -21.0F, -4.5F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(-7.5F, 3.0F, 2.5F));

		PartDefinition brasoiskierdo = bone3.addOrReplaceChild("brasoiskierdo",
				CubeListBuilder.create().texOffs(29, 10).addBox(-1.5F, -1.5F, -1.5F, 3.0F, 8.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.5F, -2.5F, -0.5F, -0.0436F, 0.0F, 0.0F));

		PartDefinition patasikierda = bone3.addOrReplaceChild("patasikierda",
				CubeListBuilder.create().texOffs(15, 28).mirror()
						.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(3.0F, 4.0F, 0.0F));

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