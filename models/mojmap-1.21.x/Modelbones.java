// Made with Blockbench 5.1.6
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelbones<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "bones"), "main");
	private final ModelPart bone4;
	private final ModelPart cabesa2;
	private final ModelPart cabesa;
	private final ModelPart bone6;
	private final ModelPart mandi;
	private final ModelPart bone2;
	private final ModelPart pataizq;
	private final ModelPart patader;
	private final ModelPart brzodere;
	private final ModelPart brasoo;
	private final ModelPart brasoizq;
	private final ModelPart brasoo2;
	private final ModelPart bone;
	private final ModelPart wataa;
	private final ModelPart bone3;

	public Modelbones(ModelPart root) {
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

		PartDefinition bone4 = partdefinition.addOrReplaceChild("bone4", CubeListBuilder.create(),
				PartPose.offset(0.0F, 18.0F, 1.0F));

		PartDefinition cabesa2 = bone4.addOrReplaceChild("cabesa2", CubeListBuilder.create(),
				PartPose.offset(0.0F, -16.0F, -1.0F));

		PartDefinition cabesa = cabesa2.addOrReplaceChild("cabesa", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bone6 = cabesa2.addOrReplaceChild("bone6",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-4.0F, -6.0F, -7.0F, 8.0F, 7.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(41, 17)
						.addBox(-4.0F, 0.01F, -7.0F, 8.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(40, 16)
						.addBox(-4.0F, 0.0F, -7.0F, 8.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -2.0F, 0.0F));

		PartDefinition mandi = cabesa2.addOrReplaceChild("mandi", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -1.0F, 0.0F, 0.0436F, 0.0F, 0.0F));

		PartDefinition bone2 = mandi.addOrReplaceChild("bone2", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r1 = bone2
				.addOrReplaceChild("cube_r1",
						CubeListBuilder.create().texOffs(32, 6).addBox(-4.0F, -1.0F, -6.9F, 8.0F, 2.0F, 8.0F,
								new CubeDeformation(0.1F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition pataizq = bone4.addOrReplaceChild("pataizq", CubeListBuilder.create().texOffs(0, 16).addBox(
				-1.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, -6.0F, 1.0F));

		PartDefinition patader = bone4.addOrReplaceChild("patader", CubeListBuilder.create().texOffs(0, 16).addBox(
				-1.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -6.0F, 1.0F));

		PartDefinition brzodere = bone4.addOrReplaceChild("brzodere", CubeListBuilder.create(),
				PartPose.offset(-9.0F, -15.0F, -2.0F));

		PartDefinition brasoo = brzodere
				.addOrReplaceChild("brasoo",
						CubeListBuilder.create().texOffs(0, 16).addBox(3.05F, -1.0F, -1.0F, 2.0F, 12.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.5708F, 0.0F, 0.0F));

		PartDefinition brasoizq = bone4.addOrReplaceChild("brasoizq", CubeListBuilder.create(),
				PartPose.offset(2.0F, -15.0F, -2.0F));

		PartDefinition brasoo2 = brasoizq
				.addOrReplaceChild("brasoo2",
						CubeListBuilder.create().texOffs(0, 16).addBox(1.95F, -1.0F, -1.0F, 2.0F, 12.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.5708F, 0.0F, 0.0F));

		PartDefinition bone = bone4.addOrReplaceChild("bone", CubeListBuilder.create(),
				PartPose.offset(0.0F, 8.0F, -1.0F));

		PartDefinition wataa = bone.addOrReplaceChild("wataa", CubeListBuilder.create().texOffs(40, 24).addBox(-4.0F,
				-17.0F, 0.0F, 8.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -1.0F, 0.0F));

		PartDefinition cube_r2 = wataa.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(16, 16).addBox(-4.0F, -4.62F, -1.07F, 8.0F, 8.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -19.0F, 0.0F, 0.3927F, 0.0F, 0.0F));

		PartDefinition bone3 = wataa.addOrReplaceChild("bone3", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 32);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		bone4.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}