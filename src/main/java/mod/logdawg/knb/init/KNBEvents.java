package mod.logdawg.knb.init;

import java.util.Iterator;

import mod.akrivus.kagic.entity.EntityGem;
import mod.akrivus.kagic.entity.ai.EntityAIProtectionFuse;
import mod.akrivus.kagic.entity.gem.EntityHessonite;
import mod.akrivus.kagic.entity.gem.EntityPearl;
import mod.logdawg.knb.entities.gems.fusions.EntitySardonyx;
import net.minecraft.entity.ai.EntityAITasks.EntityAITaskEntry;
import net.minecraftforge.common.MinecraftForge;

public class KNBEvents {
	
	public static void register() {
        MinecraftForge.EVENT_BUS.register(new mod.logdawg.knb.init.KNBEvents());
	}
	
	public static void applyFusionTweaks(EntityGem gem) {
		if (gem instanceof EntityHessonite) {
			Iterator<EntityAITaskEntry> tasks = gem.tasks.taskEntries.iterator();
			while (tasks.hasNext()) {
			}
			if (gem instanceof EntityHessonite) {
				gem.tasks.addTask(3, new EntityAIProtectionFuse<EntityPearl, EntitySardonyx>(gem, EntityPearl.class, EntitySardonyx.class, 16));
			}
		}
	}
}
