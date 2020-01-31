package mod.logdawg.knb.client.model;

import mod.akrivus.kagic.client.model.ModelGem;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * ModelSardonyx - Undefined
 * Created using Tabula 7.1.0
 */
public class ModelSardonyx extends ModelGem {
    public ModelRenderer Neccy;
    public ModelRenderer Pad;
    public ModelRenderer Pad2;
    public ModelRenderer bipedTorso;
    public ModelRenderer bipedLeftThigh;
    public ModelRenderer bipedRightThigh;
    public ModelRenderer ThighGapFiller;
    public ModelRenderer bipedLeftArm_1;
    public ModelRenderer bipedRightArm_1;
    public ModelRenderer Snozle;

    public ModelSardonyx() {
		super(0.0F, 0.0F, 128, 128, false, -1F);
        this.bipedRightArm_1 = new ModelRenderer(this, 47, 69);
        this.bipedRightArm_1.setRotationPoint(-26.0F, -22.0F, 1.5F);
        this.bipedRightArm_1.addBox(0.0F, -3.0F, 0.0F, 22, 3, 3, 0.0F);
        this.bipedRightArm = new ModelRenderer(this, 0, 54);
        this.bipedRightArm.setRotationPoint(-9.0F, -35.0F, 1.5F);
        this.bipedRightArm.addBox(0.0F, 0.0F, 0.0F, 22, 3, 3, 0.0F);
        this.setRotateAngle(bipedRightArm, 0.0F, 0.0F, 2.7234117648119516F);
        this.Snozle = new ModelRenderer(this, 88, 0);
        this.Snozle.setRotationPoint(-1.5F, -52.0F, -7.0F);
        this.Snozle.addBox(0.0F, 0.0F, 0.0F, 2, 2, 4, 0.0F);
        this.Pad2 = new ModelRenderer(this, 100, 13);
        this.Pad2.setRotationPoint(-6.5F, -42.0F, 0.0F);
        this.Pad2.addBox(0.0F, -7.0F, 0.0F, 6, 7, 6, 0.0F);
        this.setRotateAngle(Pad2, 0.0F, 0.0F, 2.7234117648119516F);
        this.Neccy = new ModelRenderer(this, 42, 0);
        this.Neccy.setRotationPoint(-2.0F, -43.0F, 1.0F);
        this.Neccy.addBox(0.0F, 0.0F, 0.0F, 3, 3, 3, 0.0F);
        this.bipedLeftLeg = new ModelRenderer(this, 103, 47);
        this.bipedLeftLeg.setRotationPoint(-7.5F, 1.0F, 0.0F);
        this.bipedLeftLeg.addBox(0.0F, 0.0F, 0.0F, 5, 23, 5, 0.0F);
        this.bipedHead = new ModelRenderer(this, 0, 0);
        this.bipedHead.setRotationPoint(-0.5F, -64.0F, -3.0F);
        this.bipedHead.addBox(0.0F, 0.0F, 0.0F, 16, 16, 10, 0.0F);
        this.setRotateAngle(bipedHead, 0.0F, 0.0F, 0.7853981633974483F);
        this.bipedTorso = new ModelRenderer(this, 44, 24);
        this.bipedTorso.setRotationPoint(-4.0F, -28.0F, -1.5F);
        this.bipedTorso.addBox(0.0F, 0.0F, 0.0F, 8, 9, 8, 0.0F);
        this.bipedLeftArm_1 = new ModelRenderer(this, 0, 66);
        this.bipedLeftArm_1.setRotationPoint(4.0F, -22.0F, 1.5F);
        this.bipedLeftArm_1.addBox(0.0F, -3.0F, 0.0F, 22, 3, 3, 0.0F);
        this.bipedBody = new ModelRenderer(this, 52, 0);
        this.bipedBody.setRotationPoint(-6.5F, -40.0F, -3.5F);
        this.bipedBody.addBox(0.0F, 0.0F, 0.0F, 12, 12, 12, 0.0F);
        this.Pad = new ModelRenderer(this, 100, 0);
        this.Pad.setRotationPoint(5.5F, -42.0F, 0.0F);
        this.Pad.addBox(0.0F, 0.0F, 0.0F, 6, 7, 6, 0.0F);
        this.setRotateAngle(Pad, 0.0F, 0.0F, 0.4181808887778414F);
        this.ThighGapFiller = new ModelRenderer(this, 32, 33);
        this.ThighGapFiller.setRotationPoint(-1.0F, -19.0F, -1.5F);
        this.ThighGapFiller.addBox(0.0F, 0.0F, 0.0F, 2, 7, 8, 0.0F);
        this.bipedLeftThigh = new ModelRenderer(this, 76, 24);
        this.bipedLeftThigh.setRotationPoint(1.0F, -19.0F, -1.5F);
        this.bipedLeftThigh.addBox(0.0F, 0.0F, 0.0F, 8, 20, 8, 0.0F);
        this.bipedLeftArm = new ModelRenderer(this, 0, 60);
        this.bipedLeftArm.setRotationPoint(8.0F, -35.0F, 1.5F);
        this.bipedLeftArm.addBox(0.0F, -3.0F, 0.0F, 22, 3, 3, 0.0F);
        this.setRotateAngle(bipedLeftArm, 0.0F, 0.0F, 0.4181808887778414F);
        this.bipedRightThigh = new ModelRenderer(this, 0, 26);
        this.bipedRightThigh.setRotationPoint(-9.0F, -19.0F, -1.5F);
        this.bipedRightThigh.addBox(0.0F, 0.0F, 0.0F, 8, 20, 8, 0.0F);
        this.bipedRightLeg = new ModelRenderer(this, 52, 41);
        this.bipedRightLeg.setRotationPoint(2.5F, 1.0F, 0.0F);
        this.bipedRightLeg.addBox(0.0F, 0.0F, 0.0F, 5, 23, 5, 0.0F);
        
        this.bipedLeftThigh.addChild(bipedLeftLeg);
        this.bipedRightThigh.addChild(bipedRightLeg);
		this.bipedLeftArm.addChild(this.Pad);
		this.bipedRightArm.addChild(this.Pad2);
		this.bipedBody.addChild(this.Neccy);
		this.bipedBody.addChild(this.bipedTorso);
    }

	@Override
	public void render(Entity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
		this.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, entityIn);
		this.bipedHead.render(scale);
		this.Neccy.render(scale);
		this.bipedHeadwear.render(scale);
		this.Snozle.render(scale);
		this.Pad.render(scale);
		this.Pad2.render(scale);
		this.bipedBody.render(scale);
		this.bipedTorso.render(scale);
		this.bipedRightArm.render(scale);
		this.bipedLeftArm.render(scale);
		this.bipedRightArm_1.render(scale);
		this.bipedLeftArm_1.render(scale);
		this.bipedRightThigh.render(scale);
		this.bipedLeftThigh.render(scale);
		this.bipedRightLeg.render(scale);
		this.bipedLeftLeg.render(scale);
		this.ThighGapFiller.render(scale);
	}
	@Override
	public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn) {
		super.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor, entityIn);
		super.copyModelAngles(this.bipedHead, this.Snozle);
	}
	public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
