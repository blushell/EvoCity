package evocity;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.*;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import evocity.blocks.Blocks;
import evocity.items.Items;
import evocity.lib.*;
import evocity.proxies.*;

@Mod( modid = ModInfo.ID, name = ModInfo.NAME, version = ModInfo.VERSION )
@NetworkMod(clientSideRequired = true, serverSideRequired = false)

public class EvoCity {
	
	@Instance(ModInfo.ID)
	public static Instance EvoCity;
		
	@SidedProxy( clientSide= "evocity.proxies.ClientProxy", serverSide= "evocity.proxies.CommonProxy")
	public static CommonProxy proxy;
	
	public static ConfigHandler config;	
	
    /** The creative tab for the mod */
    public static CreativeTabs EvoCityTab = new CreativeTabs("evocitytab")
    {

        @Override
        public ItemStack getIconItemStack()
        {
            return new ItemStack(Item.carrotOnAStick);
        }
    };
	
	@EventHandler
	public static void preInit ( FMLPreInitializationEvent event ) {
		proxy.initRenderers();
		proxy.initSounds();
		Items.init();
		Items.addNames();
		Blocks.init();
		Blocks.addNames();
		config.init(event.getSuggestedConfigurationFile());
	}
	
	@EventHandler 
	public static void init(FMLInitializationEvent event){		
        LanguageRegistry.instance().addStringLocalization("itemGroup.EvoCityTab", "en_US", "evocitytab");

	}
	
    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }
    
    @EventHandler
    public static void serverLoad(FMLServerStartingEvent event)
    {

    }
}
