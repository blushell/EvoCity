package evocity.blocks.speedbump;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelSpeedBump extends ModelBase
{
//fields
 ModelRenderer sbBase;
 ModelRenderer sbBase1;
 ModelRenderer sbBase2;
 ModelRenderer sbBase3;
 ModelRenderer sbBlock;

public ModelSpeedBump()
{
 textureWidth = 64;
 textureHeight = 128;
 
   sbBase = new ModelRenderer(this, 0, 28);
   sbBase.addBox(0F, 0F, 0F, 16, 1, 12);
   sbBase.setRotationPoint(-8F, 11F, -6F);
   sbBase.setTextureSize(64, 128);
   sbBase.mirror = true;
   setRotation(sbBase, 0F, 0F, 0F);
   sbBase1 = new ModelRenderer(this, 0, 28);
   sbBase1.addBox(0F, 0F, 0F, 16, 1, 8);
   sbBase1.setRotationPoint(-8F, 10F, -4F);
   sbBase1.setTextureSize(64, 128);
   sbBase1.mirror = true;
   setRotation(sbBase1, 0F, 0F, 0F);
   sbBase2 = new ModelRenderer(this, 0, 28);
   sbBase2.addBox(0F, 0F, 0F, 16, 1, 4);
   sbBase2.setRotationPoint(-8F, 9F, -2F);
   sbBase2.setTextureSize(64, 128);
   sbBase2.mirror = true;
   setRotation(sbBase2, 0F, 0F, 0F);
   sbBase3 = new ModelRenderer(this, 0, 28);
   sbBase3.addBox(0F, 0F, 0F, 16, 1, 2);
   sbBase3.setRotationPoint(-8F, 8F, -1F);
   sbBase3.setTextureSize(64, 128);
   sbBase3.mirror = true;
   setRotation(sbBase3, 0F, 0F, 0F);
   sbBlock = new ModelRenderer(this, 0, 0);
   sbBlock.addBox(0F, 0F, 0F, 16, 12, 16);
   sbBlock.setRotationPoint(-8F, 12F, -8F);
   sbBlock.setTextureSize(64, 128);
   sbBlock.mirror = true;
   setRotation(sbBlock, 0F, 0F, 0F);
}

public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
{
 super.render(entity, f, f1, f2, f3, f4, f5);
 sbBase.render(f5);
 sbBase1.render(f5);
 sbBase2.render(f5);
 sbBase2.render(f5);
 sbBlock.render(f5);
}

private void setRotation(ModelRenderer model, float x, float y, float z)
{
 model.rotateAngleX = x;
 model.rotateAngleY = y;
 model.rotateAngleZ = z;
}

public void renderModel(float f) {
	 sbBase.render(f);
	 sbBase1.render(f);
	 sbBase2.render(f);
	 sbBase2.render(f);
	 sbBlock.render(f);	
}

}

