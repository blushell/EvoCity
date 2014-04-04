package evocity.blocks.vending;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import evocity.EvoCity;
import evocity.lib.*;
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
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class TileEntityVendingMachineBlock extends BlockContainer {

	public TileEntityVendingMachineBlock(int id) {
		super(id, Material.iron);
    	this.setUnlocalizedName(Names.VendingMachine_unlocalizedName);
    	this.setCreativeTab(EvoCity.EvoCityTab);
    	this.setLightValue(0.5F);
    	this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.7F, 1.0F);
	}

	public TileEntity createNewTileEntity(World world) {
		return new TileEntityVendingMachineEntity();
	}
	
    public int getRenderType() {
        return -1;
    }
    
  //This will tell minecraft not to render any side of our cube.
    public boolean shouldSideBeRendered(IBlockAccess iblockaccess, int i, int j, int k, int l)
    {
       return false;
    }
    
    public boolean isOpaqueCube() {
        return false;
    }
    
    public boolean renderAsNormalBlock() {
        return false;
    }
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister icon){
		this.blockIcon = icon.registerIcon(ModInfo.ID.toLowerCase() + ":" + "Vending");
	}
	
	public boolean onBlockActivated(World world, int i, int j, int k, EntityPlayer entity, int l, float m, float n, float o){

		if(entity.inventory.hasItem(new ItemStack(Item.itemsList[Ids.VendPrice_actual]).itemID)){
		if(entity instanceof EntityPlayer)((EntityPlayer)entity).inventory.addItemStackToInventory(new ItemStack(Item.itemsList[Ids.Drank_actual], 1));
		}

		if(true){
		if(entity instanceof EntityPlayer)((EntityPlayer)entity).inventory.consumeInventoryItem(Item.itemsList[Ids.VendPrice_actual].itemID);
		}

		return true;}
	
	@Override
	public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase entity, ItemStack stack)
	{
	if (entity == null)
	{
	return;
	}

	TileEntityVendingMachineEntity tile = (TileEntityVendingMachineEntity) world.getBlockTileEntity(x, y, z);
	tile.direction = MathHelper.floor_double((double)(entity.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3;
	}
}
	

