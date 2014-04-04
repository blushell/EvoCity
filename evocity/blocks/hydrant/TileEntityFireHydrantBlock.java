package evocity.blocks.hydrant;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import evocity.EvoCity;
import evocity.lib.Ids;
import evocity.lib.ModInfo;
import evocity.lib.Names;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;



public class TileEntityFireHydrantBlock extends BlockContainer {

    public TileEntityFireHydrantBlock(int id) {
        super(id, Material.iron);
    	this.setUnlocalizedName(Names.Hydrant_unlocalizedName);
    	this.setCreativeTab(EvoCity.EvoCityTab);
    	this.setBlockBounds(0.375F, 0.0F, 0.375F, 0.625F, 1.0F, 0.625F);
    }
		public TileEntity createNewTileEntity(World world) {
			return new TileEntityFireHydrantEntity();
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
			this.blockIcon = icon.registerIcon(ModInfo.ID.toLowerCase() + ":" + "fire");
		}
			
		public boolean onBlockActivated(World world, int i, int j, int k, EntityPlayer entity, int l, float m, float n, float o){

			if(entity.inventory.hasItem(new ItemStack(Item.itemsList[Ids.HydrantIntake_actual]).itemID)){
			if(entity instanceof EntityPlayer)((EntityPlayer)entity).inventory.addItemStackToInventory(new ItemStack(Item.itemsList[Ids.HydrantLiquid_actual], 1));
			}

			if(true){
			if(entity instanceof EntityPlayer)((EntityPlayer)entity).inventory.consumeInventoryItem(Item.itemsList[Ids.HydrantIntake_actual].itemID);
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

		TileEntityFireHydrantEntity tile = (TileEntityFireHydrantEntity) world.getBlockTileEntity(x, y, z);
		tile.direction = MathHelper.floor_double((double)(entity.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3;
		}
}