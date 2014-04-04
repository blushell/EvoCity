package evocity.blocks.vending;

import org.lwjgl.opengl.GL11;

import evocity.lib.ModInfo;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class TileEntityVendingMachineRenderer extends TileEntitySpecialRenderer {
	
	private static final ResourceLocation texture = new ResourceLocation(ModInfo.ID.toLowerCase(), "textures/entities/ModelVendingMachine.png");

	private ModelVendingMachine model;
	
	public TileEntityVendingMachineRenderer(){
		this.model = new ModelVendingMachine();
	}
	
    private void adjustRotatePivotViaMeta(World world, int x, int y, int z) {
        int meta = world.getBlockMetadata(x, y, z);
        GL11.glPushMatrix();
        GL11.glRotatef(meta * (-90), 0.0F, 0.0F, 1.0F);
        GL11.glPopMatrix();
}
	
	public void renderTileEntityAt(TileEntity tileentity, double x, double y, double z, float f) {
		GL11.glPushMatrix();
		GL11.glTranslatef((float)x + 0.5F, (float)y + 1.5F, (float)z + 0.5F);
		TileEntityVendingMachineEntity myTile = (TileEntityVendingMachineEntity) tileentity;
		int direction = myTile.direction;
		GL11.glRotatef(direction * 90F, 0F, 1F, 0F);
		GL11.glRotatef(180F, 0F, 0F, 1F);
		this.bindTexture(texture);
		GL11.glPushMatrix();
		this.model.renderModel(0.0625F);
		GL11.glPopMatrix();
		GL11.glPopMatrix();
	}
	
    //Set the lighting stuff, so it changes it's brightness properly.         
    private void adjustLightFixture(World world, int i, int j, int k, Block block) {
                    Tessellator tess = Tessellator.instance;
                    float brightness = block.getBlockBrightness(world, i, j, k);
                    int skyLight = world.getLightBrightnessForSkyBlocks(i, j, k, 0);
                    int modulousModifier = skyLight % 65536;
                    int divModifier = skyLight / 65536;
                    tess.setColorOpaque_F(brightness, brightness, brightness);
                    OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit,  (float) modulousModifier,  divModifier);
    }

}
