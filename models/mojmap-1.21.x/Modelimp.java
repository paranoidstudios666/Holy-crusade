// Made with Blockbench 5.1.6
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelimp<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "imp"),
			"main");
	private final ModelPart bone3;
	private final ModelPart bone6;
	private final ModelPart bone5;
	private final ModelPart bone4;
	private final ModelPart bone2;
	private final ModelPart rigleg;
	private final ModelPart bone;
	private final ModelPart lefleg;

	public Modelimp(ModelPart root) {
		this.bone3 = root.getChild("bone3");
		this.bone6 = this.bone3.getChild("bone6");
		this.bone5 = this.bone3.getChild("bone5");
		this.bone4 = this.bone3.getChild("bone4");
		this.bone2 = this.bone3.getChild("bone2");
		this.rigleg = this.bone3.getChild("rigleg");
		this.bone = this.rigleg.getChild("bone");
		this.lefleg = this.bone3.getChild("lefleg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bone3 = partdefinition.addOrReplaceChild("bone3",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-5.0F, -8.0F, -1.0F, 10.0F, 11.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(37, 26)
						.mirror().addBox(2.0F, -12.0F, 2.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(37, 26).addBox(-4.0F, -12.0F, 2.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 18.0F, -3.0F));

		PartDefinition bone6 = bone3.addOrReplaceChild("bone6",
				CubeListBuilder.create().texOffs(44, 4).mirror()
						.addBox(0.0F, -9.5F, 0.0F, 0.0F, 11.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 1.5F, 7.0F));

		PartDefinition bone5 = bone3.addOrReplaceChild("bone5", CubeListBuilder.create(),
				PartPose.offset(6.0F, 0.0F, -1.0F));

		PartDefinition cube_r1 = bone5.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(0, 22).addBox(5.0F, -5.0F, -9.0F, 3.0F, 5.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.0F, 6.0F, 4.0F, -0.6545F, 0.0F, 0.0F));

		PartDefinition bone4 = bone3.addOrReplaceChild("bone4", CubeListBuilder.create(),
				PartPose.offset(-7.0F, 0.0F, 1.0F));

		PartDefinition cube_r2 = bone4
				.addOrReplaceChild("cube_r2",
						CubeListBuilder.create().texOffs(0, 22).addBox(-8.0F, -5.0F, -9.0F, 3.0F, 5.0F, 5.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(7.0F, 6.0F, 2.0F, -0.6545F, 0.0F, 0.0F));

		PartDefinition bone2 = bone3.addOrReplaceChild("bone2", CubeListBuilder.create(),
				PartPose.offset(-6.0F, 0.0F, 1.0F));

		PartDefinition rigleg = bone3.addOrReplaceChild("rigleg", CubeListBuilder.create(),
				PartPose.offset(0.0F, 3.0F, 4.0F));

		PartDefinition bone = rigleg.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(19, 24).addBox(-4.0F,
				0.0F, -1.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, -1.0F));

		PartDefinition lefleg = bone3.addOrReplaceChild("lefleg", CubeListBuilder.create().texOffs(19, 24).addBox(-1.5F,
				0.0F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(2.5F, 3.0F, 3.5F));

		return LayerDefinition.create(meshdefinition, 64, 32);
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