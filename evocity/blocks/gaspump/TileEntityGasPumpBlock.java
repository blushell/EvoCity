package evocity.blocks.gaspump;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import evocity.EvoCity;
import evocity.lib.Ids;
import evocity.lib.ModInfo;
import evocity.lib.Names;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class TileEntityGasPumpBlock extends BlockContainer {

    public TileEntityGasPumpBlock(int id) {
        super(id, Material.iron);
    	this.setUnlocalizedName(Names.GasPump_unlocalizedName);
    	this.setCreativeTab(EvoCity.EvoCityTab);
    	this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F);
    	this.setLightValue(0.5F);
    }
		public TileEntity createNewTileEntity(World world) {
			return new TileEntityGasPumpEntity();
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
			this.blockIcon = icon.registerIcon(ModInfo.ID.toLowerCase() + ":" + "Gas");
		}
		
		public boolean onBlockActivated(World world, int i, int j, int k, EntityPlayer entity, int l, float m, float n, float o){

			if(entity.inventory.hasItem(new ItemStack(Item.itemsList[Ids.FuelPrice_actual]).itemID)){
			if(entity instanceof EntityPlayer)((EntityPlayer)entity).inventory.addItemStackToInventory(new ItemStack(Item.itemsList[Ids.Fuel_actual], 1));
			}

			if(true){
			if(entity instanceof EntityPlayer)((EntityPlayer)entity).inventory.consumeInventoryItem(Item.itemsList[Ids.FuelPrice_actual].itemID);
			}

			return true;
		}
		
		@Override
		public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase entity, ItemStack stack)
		{
		if (entity == null)
		{
		return;
		}

		TileEntityGasPumpEntity tile = (TileEntityGasPumpEntity) world.getBlockTileEntity(x, y, z);
		tile.direction = MathHelper.floor_double((double)(entity.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3;
		}
}

