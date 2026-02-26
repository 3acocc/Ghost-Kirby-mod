package com.zacowoc.ghostkirby;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.model.ArmedModel;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.world.entity.HumanoidArm;

public class kirby extends EntityModel<KirbyRenderState> implements ArmedModel {
	private final ModelPart body;
	private final ModelPart right_arm;
	private final ModelPart left_arm;

	public kirby(ModelPart root) {
		super(root);
		this.body = root.getChild("body");
		this.right_arm = this.body.getChild("right_arm");
		this.left_arm = this.body.getChild("left_arm");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(30, 43).addBox(1.0F, 1.0F, -4.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(18, 44).addBox(1.0F, 2.0F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(18, 46).addBox(1.0F, 2.0F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-3.0F, -8.0F, -4.0F, 6.0F, 9.0F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(12, 30).addBox(4.0F, -7.0F, -2.0F, 1.0F, 6.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(24, 17).addBox(-2.0F, -9.0F, -3.0F, 4.0F, 9.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(22, 32).addBox(-2.0F, -6.0F, 3.0F, 4.0F, 5.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(34, 32).addBox(-2.0F, -6.0F, -5.0F, 4.0F, 5.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(44, 17).addBox(-1.0F, -7.0F, -5.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(44, 23).addBox(-1.0F, -1.0F, 4.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 17).addBox(-4.0F, -7.0F, -3.0F, 6.0F, 7.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(0, 30).addBox(-6.0F, -3.0F, -1.0F, 4.0F, 5.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 39).addBox(-5.0F, -6.0F, -1.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(28, 0).addBox(3.0F, -7.0F, -3.0F, 1.0F, 6.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(38, 43).addBox(-5.0F, -5.0F, 1.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 42).addBox(-7.0F, -1.0F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(6, 42).addBox(-6.0F, 2.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(28, 12).addBox(-5.0F, 0.0F, -2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(42, 43).addBox(-5.0F, -5.0F, -2.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(44, 21).addBox(-3.0F, 1.0F, 3.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(46, 31).addBox(-2.0F, 1.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(46, 35).addBox(-3.0F, 1.0F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(44, 25).addBox(-1.0F, -7.0F, 4.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(46, 39).addBox(-3.0F, 1.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(46, 37).addBox(-3.0F, 1.0F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(46, 41).addBox(-3.0F, 2.0F, 3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(46, 43).addBox(-3.0F, 2.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(46, 33).addBox(-5.0F, 2.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(44, 27).addBox(-1.0F, -1.0F, -5.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(42, 14).addBox(1.0F, 1.0F, 2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 30).addBox(-5.0F, -5.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(46, 43).addBox(2.0F, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(46, 43).addBox(-6.0F, 3.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		body.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(44, 19).addBox(0.0F, -1.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(42, 6).addBox(-1.0F, 0.0F, 0.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, -9.0F, -1.0F, 0.0F, -1.5708F, 0.0F));
		body.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(44, 19).addBox(0.0F, -1.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -9.0F, -1.0F, 0.0F, -1.5708F, 0.0F));
		body.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(44, 19).addBox(0.0F, -1.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(42, 2).addBox(-1.0F, 0.0F, 0.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(42, 0).addBox(-1.0F, 7.0F, 0.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, -8.0F, -1.0F, 0.0F, -1.5708F, 0.0F));
		body.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(42, 4).addBox(-1.0F, -1.0F, 0.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -8.0F, -1.0F, 0.0F, -1.5708F, 0.0F));
		body.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(22, 39).addBox(-1.0F, -1.0F, -1.0F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -9.0F, -1.0F, 0.0F, -1.5708F, 0.0F));
		body.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(42, 8).addBox(-1.0F, -1.0F, 0.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, -7.0F, -1.0F, 0.0F, -1.5708F, 0.0F));
		body.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(12, 44).addBox(0.0F, -1.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, -7.0F, -1.0F, 0.0F, -1.5708F, 0.0F));

		body.addOrReplaceChild("right_arm", CubeListBuilder.create().texOffs(37, 39).addBox(4.0F, -4.0F, 3.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(22, 43).addBox(3.0F, -4.0F, 2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(6, 46).addBox(3.0F, -2.0F, 3.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(30, 46).addBox(3.0F, -5.0F, 3.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		body.addOrReplaceChild("left_arm", CubeListBuilder.create().texOffs(42, 10).addBox(3.0F, -5.0F, -14.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(13, 40).addBox(4.0F, -5.0F, -15.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(44, 29).addBox(3.0F, -3.0F, -14.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(12, 46).addBox(3.0F, -6.0F, -14.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 1.0F, 10.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void translateToHand(HumanoidArm arm, PoseStack poseStack) {
		this.body.translateAndRotate(poseStack);
		poseStack.scale(0.7f, 0.7f, 0.7f);

		if (arm == HumanoidArm.RIGHT) {
			this.right_arm.translateAndRotate(poseStack);
			poseStack.translate(0.7F, -1.0F, 0.31F);
		} else {
			this.left_arm.translateAndRotate(poseStack);
			poseStack.translate(0.7F, -1.0F, 0.31F);
		}
	}

	@Override
	public void setupAnim(KirbyRenderState state) {
		float time = state.ageInTicks;

		this.body.yRot = state.yRot * ((float) Math.PI / 180F) + (float) Math.PI / 2.0F;
		this.body.zRot = state.xRot * ((float) Math.PI / 180F) * 0.3f;
		this.body.xRot = 0.0F;

		float bobbing = (float) Math.sin(time * 0.08f) * 0.5f;
		this.body.y = 24.0f + bobbing;
		this.body.xRot += (float) Math.sin(time * 0.05f) * 0.05f;

		this.right_arm.setPos(0.0F, 0.0F, 0.0F);
		this.left_arm.setPos(0.0F, 1.0F, 10.0F);

		if (state.isHoldingItem) {
			float forwardX = 6.0F;

			this.right_arm.setPos(-2.5F + forwardX, 1.0F, -0.5F);
			this.left_arm.setPos(-2.5F + forwardX, 1.0F, 10.0F);

			this.right_arm.xRot = 0.0F;
			this.left_arm.xRot = 0.0F;
			this.right_arm.yRot = 0.0F;
			this.left_arm.yRot = 0.0F;
			this.right_arm.zRot = 0.0F;
			this.left_arm.zRot = 0.0F;
		} else {
			this.right_arm.yRot = 0.0F;
			this.left_arm.yRot = 0.0F;
			this.right_arm.xRot = 0.0F;
			this.left_arm.xRot = 0.0F;

			float armSwing = (float) Math.sin(time * 0.15f) * 0.2f;
			this.right_arm.zRot = armSwing;
			this.left_arm.zRot = -armSwing;
		}

		float flyTilt = state.walkAnimationSpeed * 0.2f;
		this.body.zRot += flyTilt;
	}
}