package evocity.blocks.speedbump;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import evocity.EvoCity;
import evocity.blocks.gaspump.TileEntityGasPumpEntity;
import evocity.lib.ModInfo;
import evocity.lib.Names;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class TileEntitySpeedBumpBlock extends BlockContainer {

    public TileEntitySpeedBumpBlock(int id) {
        super(id, Material.iron);
    	this.setUnlocalizedName(Names.SpeedBump_unlocalizedName);
    	this.setCreativeTab(EvoCity.EvoCityTab);
    }
		public TileEntity createNewTileEntity(World world) {
			return new TileEntitySpeedBumpEntity();
		}
		
	    public int getRenderType() {
	        return -1;
	    }
	    
	    public boolean isOpaqueCube() {
	        return false;
	    }
	    
	    public boolean renderAsNormalBlock() {
	        return false;
	    }
		
		@SideOnly(Side.CLIENT)
		public void registerIcons(IconRegister icon){
			this.blockIcon = icon.registerIcon(ModInfo.ID.toLowerCase() + ":" + "bump");
		}
		
		@Override
		public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase entity, ItemStack stack)
		{
		if (entity == null)
		{
		return;
		}

		TileEntitySpeedBumpEntity tile = (TileEntitySpeedBumpEntity) world.getBlockTileEntity(x, y, z);
		tile.direction = MathHelper.floor_double((double)(entity.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3;
		}
		
	}

