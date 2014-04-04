package evocity.lib;

import java.io.File;

import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import evocity.blocks.Blocks;
import evocity.items.Items;

public class ConfigHandler {
	
	
	public static void init(File configFile) {
		Configuration config = new Configuration(new File("config/EvoCity.cfg"));

		config.load();
//Ids
		Ids.VendingMachine_actual = config.getBlock(Names.VendingMachine_name, Ids.VendingMachine_default).getInt();
		Ids.GasPump_actual = config.getBlock(Names.GasPump_name, Ids.GasPump_default).getInt();
		Ids.SpeedBump_actual = config.getBlock(Names.SpeedBump_name, Ids.SpeedBump_default).getInt();
		Ids.Hydrant_actual = config.getBlock(Names.Hydrant_name, Ids.Hydrant_default).getInt();
		Ids.CitySign_actual = config.getBlock(Names.CitySign_name, Ids.CitySign_default).getInt();
		Ids.CitySignDT_actual = config.getBlock(Names.CitySignDT_name, Ids.CitySignDT_default).getInt();
		Ids.Speaker_actual = config.getBlock(Names.Speaker_name, Ids.Speaker_default).getInt();
		Ids.Register_actual = config.getBlock(Names.Register_name, Ids.Register_default).getInt();
		Ids.KFCT_actual = config.getBlock(Names.KFCT_name, Ids.KFCT_default).getInt();
		
//Item Config		
		Ids.FuelPrice_actual = config.get("economy", "Pump Econ", Ids.FuelPrice_default).getInt();
		Ids.Fuel_actual = config.get("economy", "Fuel", Ids.Fuel_default).getInt();
		Ids.VendPrice_actual = config.get("economy", "Vending Econ", Ids.VendPrice_default).getInt();
		Ids.Drank_actual = config.get("economy", "Drink", Ids.Drank_default).getInt();
		Ids.HydrantLiquid_actual = config.get("economy", "Hydrant Liquid", Ids.HydrantLiquid_default).getInt();
		Ids.HydrantIntake_actual = config.get("economy", "Hydrant Intake", Ids.HydrantIntake_default).getInt();
		config.save();	
	}

}
