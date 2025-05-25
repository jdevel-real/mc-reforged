package jdevel.reforged;

import jdevel.reforged.Tabs.TabReforged;
import jdevel.reforged.init.ModRecipes;
import jdevel.reforged.proxy.CommonProxy;
import jdevel.reforged.util.Reference;
import jdevel.reforged.world.ModWorldGen;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class Main {
    public static final CreativeTabs reforgedTab = new TabReforged("reforged");

    @Mod.Instance
    public static Main instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public static void preInit(FMLPreInitializationEvent event) {
        GameRegistry.registerWorldGenerator(new ModWorldGen(), 3);
    }
    @Mod.EventHandler
    public static void Init(FMLInitializationEvent event) {
        ModRecipes.init();
    }
    @Mod.EventHandler
    public static void postInit(FMLPostInitializationEvent event) {

    }
}
