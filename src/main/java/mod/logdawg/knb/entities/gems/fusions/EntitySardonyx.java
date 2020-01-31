package mod.logdawg.knb.entities.gems.fusions;

import java.util.ArrayList;

import mod.akrivus.kagic.entity.EntityFusionGem;
import mod.akrivus.kagic.entity.EntityGem;
import mod.heimrarnadalr.kagic.util.Colors;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;

public class EntitySardonyx extends EntityFusionGem {
	private static final int SARDONYX_SKIN_COLOR = 0xD3D9EE;
	private static final int SARDONYX_HAIR_COLOR = 0xF9FEEE;
	private static final int NUM_HAIRSTYLES = 1;

	public EntitySardonyx(World world) {
		super(world);
		this.setSize(.9F, 4.75F);
		
		// Apply entity attributes.
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(300.0D);
		this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(15.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.5D);
		this.getEntityAttribute(SharedMonsterAttributes.KNOCKBACK_RESISTANCE).setBaseValue(2.0D);
	}
	
	// =========================================================================
	// === Methods for managing
	// fusion==========================================
	// =========================================================================

	@Override
	public boolean addGem(EntityGem gem) {
		if (this.getFusionCount() >= 2) {
			return false;
		}
			return super.addGem(gem);
	}
	
	/*********************************************************
	 * Methods related to rendering. *
	 *********************************************************/

	@Override
	protected int generateHairStyle() {
		return this.rand.nextInt(EntitySardonyx.NUM_HAIRSTYLES);
	}

	@Override
	protected int generateHairColor() {
		ArrayList<Integer> hairColors = new ArrayList<Integer>();
		hairColors.add(EntitySardonyx.SARDONYX_HAIR_COLOR);
		return Colors.arbiLerp(hairColors);
	}
	
	@Override
	protected int generateSkinColor() {
		ArrayList<Integer> skinColors = new ArrayList<Integer>();
		skinColors.add(EntitySardonyx.SARDONYX_SKIN_COLOR);
		return Colors.arbiLerp(skinColors);
	}

	@Override
	public float getSizeFactor() {
		return super.getSizeFactor() + (1F - super.getSizeFactor()) / 2;
	}

	@Override
	public void setAdjustedSize() {
		float sizeModifier = this.getPrimeCount() - this.getDefectiveCount();
		this.setSize(.9F, 4.75F + sizeModifier);
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(300.0D + sizeModifier * 50D);
		this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(15D + sizeModifier * 2.5D);
	}
}