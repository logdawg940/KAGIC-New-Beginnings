package mod.logdawg.knb.client.render;

import mod.akrivus.kagic.client.render.RenderGemBase;
import mod.akrivus.kagic.client.render.layers.LayerCrossFusionGemPlacement;
import mod.akrivus.kagic.client.render.layers.LayerHair;
import mod.akrivus.kagic.client.render.layers.LayerInsignia;
import mod.akrivus.kagic.client.render.layers.LayerNoDyeOverlay;
import mod.akrivus.kagic.client.render.layers.LayerSkin;
import mod.logdawg.knb.client.model.ModelSardonyx;
import mod.logdawg.knb.entities.gems.fusions.EntitySardonyx;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.ResourceLocation;

public class RenderSardonyx extends RenderGemBase<EntitySardonyx> {
	
	public RenderSardonyx() {
		super(Minecraft.getMinecraft().getRenderManager(), new ModelSardonyx(), 0.75F);
		
		this.addLayer(new LayerSkin(this));
		this.addLayer(new LayerNoDyeOverlay(this));
		this.addLayer(new LayerHair(this));
		this.addLayer(new LayerInsignia(this));
		this.addLayer(new LayerCrossFusionGemPlacement(this));
	}
	
	@Override
	protected void preRenderCallback(EntitySardonyx sardonyx, float partialTickTime) {
		GlStateManager.scale(1.75F * sardonyx.getSizeFactor(), 1.75F * sardonyx.getSizeFactor(), 1.75F * sardonyx.getSizeFactor());
	}
	
	@Override
	protected ResourceLocation getEntityTexture(EntitySardonyx sardonyx) {
		return new ResourceLocation("knb:textures/entities/sardonyx/sardonyx.png");
	}
}