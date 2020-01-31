package mod.logdawg.knb.init;

import java.util.ArrayList;
import java.util.HashMap;

import mod.akrivus.kagic.entity.EntityGem;
import mod.akrivus.kagic.init.ModEntities;
import mod.logdawg.knb.entities.gems.fusions.EntitySardonyx;

public class KNBEntities {
	public static final HashMap<String, Class<? extends EntityGem>> GEMS = new HashMap<String, Class<? extends EntityGem>>();
	public static final ArrayList<Class<? extends EntityGem>> MINERALS = new ArrayList<Class<? extends EntityGem>>();
	public static final boolean GENERATE_FACTORIES_INSTEAD_OF_INSTANCES = false;
	
	public static void register() {
		ModEntities.registerExternalGem("knb", "sardonyx", EntitySardonyx.class, "mod/logdawg/knb/client/render/RenderSardonyx", 16775930, 16121850, false);
	}
}