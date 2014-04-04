package evocity.proxies;

import cpw.mods.fml.client.registry.ClientRegistry;
import evocity.blocks.citysign.*;
import evocity.blocks.citysigndt.*;
import evocity.blocks.gaspump.*;
import evocity.blocks.hydrant.*;
import evocity.blocks.kfctop.*;
import evocity.blocks.register.*;
import evocity.blocks.speaker.*;
import evocity.blocks.speedbump.*;
import evocity.blocks.vending.*;


public class ClientProxy extends CommonProxy {
	
    @Override
    public void initSounds()
    {
        // Nothing to do here
    }

    @Override
	public void initRenderers() {
	    ClientRegistry.bindTileEntitySpecialRenderer(TileEntityVendingMachineEntity.class, new TileEntityVendingMachineRenderer());
	    ClientRegistry.bindTileEntitySpecialRenderer(TileEntityGasPumpEntity.class, new TileEntityGasPumpRenderer());
	    ClientRegistry.bindTileEntitySpecialRenderer(TileEntitySpeedBumpEntity.class, new TileEntitySpeedBumpRenderer());
	    ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFireHydrantEntity.class, new TileEntityFireHydrantRenderer());
	    ClientRegistry.bindTileEntitySpecialRenderer(TileEntityCitySignEntity.class, new TileEntityCitySignRenderer());
	    ClientRegistry.bindTileEntitySpecialRenderer(TileEntityCitySignDTEntity.class, new TileEntityCitySignDTRenderer());
	    ClientRegistry.bindTileEntitySpecialRenderer(TileEntitySpeakerEntity.class, new TileEntitySpeakerRenderer());
	    ClientRegistry.bindTileEntitySpecialRenderer(TileEntityRegisterEntity.class, new TileEntityRegisterRenderer());
	    ClientRegistry.bindTileEntitySpecialRenderer(TileEntityKFCTEntity.class, new TileEntityKFCTRenderer());
	}
}

