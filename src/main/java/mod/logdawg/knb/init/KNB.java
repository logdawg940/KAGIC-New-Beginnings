package mod.logdawg.knb.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = KNB.MODID, version = KNB.VERSION, acceptedMinecraftVersions = KNB.MCVERSION, dependencies = "after:kagic")
public class KNB {
    public static final String MODID = "knb";
    public static final String VERSION = "@version";
    public static final String MCVERSION = "1.12.2";

    @Mod.Instance
    public static KNB instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        KNBEvents.register();
        KNBEntities.register();
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
    }
}