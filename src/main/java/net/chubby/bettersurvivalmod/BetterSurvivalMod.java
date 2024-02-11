package net.chubby.bettersurvivalmod;

import net.chubby.bettersurvivalmod.com.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(modid = BetterSurvivalMod.MOD_ID, name = BetterSurvivalMod.NAME, version = BetterSurvivalMod.VERSION)
public class BetterSurvivalMod {
    public static final String MOD_ID = "bettersurvivalmod";
    public static final String NAME = "BetterSurvivalMod";
    public static final String VERSION = "0.0.1";
    public static final String DEPENDENCIES = "";
    @SidedProxy(serverSide = "net.chubby.bettersurvivalmod.com.proxy.CommonProxy",clientSide = "net.chubby.bettersurvivalmod.com.proxy.ClientProxy" )
    public static CommonProxy proxy;
    public static Logger LOGGER = LogManager.getLogger(MOD_ID);

    public BetterSurvivalMod() {

    }

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {

    }

    @EventHandler
    public void init(FMLInitializationEvent e) {

    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent e) {

    }
}
