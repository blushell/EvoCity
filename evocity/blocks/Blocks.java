package evocity.blocks;

import evocity.blocks.citysign.*;
import evocity.blocks.citysigndt.*;
import evocity.blocks.gaspump.*;
import evocity.blocks.hydrant.*;
import evocity.blocks.kfctop.*;
import evocity.blocks.register.*;
import evocity.blocks.speaker.*;
import evocity.blocks.speedbump.*;
import evocity.blocks.vending.*;
import evocity.lib.*;
import net.minecraft.block.Block;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class Blocks {
	public static Block vending;
	public static Block gaspump;
	public static Block speedbump;
	public static Block hydrant;
	public static Block citysign;
	public static Block citysigndt;
	public static Block speakerbox;
	public static Block register;
	public static Block kfct;
	
	public static void init(){
		vending = new TileEntityVendingMachineBlock(Ids.VendingMachine_actual);
		GameRegistry.registerBlock(vending, Names.VendingMachine_name);
	    GameRegistry.registerTileEntity(TileEntityVendingMachineEntity.class, "tileEntityVendingMachine");

	    gaspump = new TileEntityGasPumpBlock(Ids.GasPump_actual);
		GameRegistry.registerBlock(gaspump, Names.GasPump_name);
	    GameRegistry.registerTileEntity(TileEntityGasPumpEntity.class, "tileEntityGasPump");
	    
	    speedbump = new TileEntitySpeedBumpBlock(Ids.SpeedBump_actual);
		GameRegistry.registerBlock(speedbump, Names.SpeedBump_name);
	    GameRegistry.registerTileEntity(TileEntitySpeedBumpEntity.class, "tileEntitySpeedBump");
	    
	    hydrant = new TileEntityFireHydrantBlock(Ids.Hydrant_actual);
		GameRegistry.registerBlock(hydrant, Names.Hydrant_name);
	    GameRegistry.registerTileEntity(TileEntityFireHydrantEntity.class, "tileEntityFireHydrent");
	    
	    citysign = new TileEntityCitySignBlock(Ids.CitySign_actual);
		GameRegistry.registerBlock(citysign, Names.CitySign_name);
	    GameRegistry.registerTileEntity(TileEntityCitySignEntity.class, "tileEntityCitySign");
	    
	    citysigndt = new TileEntityCitySignDTBlock(Ids.CitySignDT_actual);
		GameRegistry.registerBlock(citysigndt, Names.CitySignDT_name);
	    GameRegistry.registerTileEntity(TileEntityCitySignDTEntity.class, "tileEntityCitySignDT");
	    
	    speakerbox = new TileEntitySpeakerBlock(Ids.Speaker_actual);
		GameRegistry.registerBlock(speakerbox, Names.Speaker_name);
	    GameRegistry.registerTileEntity(TileEntitySpeakerEntity.class, "tileEntitySpeakerBox");
	    
	    register = new TileEntityRegisterBlock(Ids.Register_actual);
		GameRegistry.registerBlock(register, Names.Register_name);
	    GameRegistry.registerTileEntity(TileEntityRegisterEntity.class, "tileEntityRegister");
	    
	    kfct = new TileEntityKFCTBlock(Ids.KFCT_actual);
		GameRegistry.registerBlock(kfct, Names.KFCT_name);
	    GameRegistry.registerTileEntity(TileEntityKFCTEntity.class, "tileEntityKFCT");
	    
	    }

	public static void addNames(){
		LanguageRegistry.addName(vending, Names.VendingMachine_name);
		LanguageRegistry.addName(gaspump, Names.GasPump_name);
		LanguageRegistry.addName(speedbump, Names.SpeedBump_name);
		LanguageRegistry.addName(hydrant, Names.Hydrant_name);
		LanguageRegistry.addName(citysign, Names.CitySign_name);
		LanguageRegistry.addName(citysigndt, Names.CitySignDT_name);
		LanguageRegistry.addName(speakerbox, Names.Speaker_name);
		LanguageRegistry.addName(register, Names.Register_name);
		LanguageRegistry.addName(kfct, Names.KFCT_name);
	}
}
