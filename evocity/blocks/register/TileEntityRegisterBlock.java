package evocity.blocks.register;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import evocity.EvoCity;
import evocity.lib.ModInfo;
import evocity.lib.Names;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class TileEntityRegisterBlock extends BlockContainer {

    public TileEntityRegisterBlock(int id) {
        super(id, Material.iron);
    	this.setUnlocalizedName(Names.Register_unlocalizedName);
    	this.setCreativeTab(EvoCity.EvoCityTab);
    	this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
    }
	public TileEntity createNewTileEntity(World world) {
		return  new TileEntityRegisterEntity();
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
			this.blockIcon = icon.registerIcon(ModInfo.ID.toLowerCase() + ":" + "register");
		}
			
		@Override
		public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase entity, ItemStack stack)
		{
		if (entity == null)
		{
		return;
		}

		TileEntityRegisterEntity tile = (TileEntityRegisterEntity) world.getBlockTileEntity(x, y, z);
		tile.direction = MathHelper.floor_double((double)(entity.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3;
		}
}
