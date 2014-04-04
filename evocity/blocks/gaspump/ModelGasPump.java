package evocity.blocks.gaspump;

import net.minecraft.client.model.*;
import net.minecraft.entity.Entity;

public class ModelGasPump extends ModelBase
{
//fields
 ModelRenderer Bottom;
 ModelRenderer TopL;
 ModelRenderer TopR;
 ModelRenderer Center;
 ModelRenderer Top;

public ModelGasPump()
{
 textureWidth = 64;
 textureHeight = 128;
 
   Bottom = new ModelRenderer(this, 0, 0);
   Bottom.addBox(0F, 0F, 0F, 14, 16, 14);
   Bottom.setRotationPoint(-7F, 8F, -7F);
   Bottom.setTextureSize(64, 128);
   Bottom.mirror = true;
   setRotation(Bottom, 0F, 0F, 0F);
   TopL = new ModelRenderer(this, 0, 30);
   TopL.addBox(0F, 0F, 0F, 2, 16, 14);
   TopL.setRotationPoint(-7F, -8F, -7F);
   TopL.setTextureSize(64, 128);
   TopL.mirror = true;
   setRotation(TopL, 0F, 0F, 0F);
   TopR = new ModelRenderer(this, 0, 30);
   TopR.addBox(0F, 0F, 0F, 2, 16, 14);
   TopR.setRotationPoint(5F, -8F, -7F);
   TopR.setTextureSize(64, 128);
   TopR.mirror = true;
   setRotation(TopR, 0F, 0F, 0F);
   Center = new ModelRenderer(this, 0, 60);
   Center.addBox(0F, 0F, 0F, 10, 12, 12);
   Center.setRotationPoint(-5F, -4F, -6F);
   Center.setTextureSize(64, 128);
   Center.mirror = true;
   setRotation(Center, 0F, 0F, 0F);
   Top = new ModelRenderer(this, 0, 84);
   Top.addBox(0F, 0F, 0F, 16, 2, 16);
   Top.setRotationPoint(-8F, -10F, -8F);
   Top.setTextureSize(64, 128);
   Top.mirror = true;
   setRotation(Top, 0F, 0F, 0F);
}

public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
{
 super.render(entity, f, f1, f2, f3, f4, f5);
 Bottom.render(f5);
 TopL.render(f5);
 TopR.render(f5);
 Center.render(f5);
 Top.render(f5);
}

public void renderModel(float f){
	 Bottom.render(f);
	 TopL.render(f);
	 TopR.render(f);
	 Center.render(f);
	 Top.render(f);
}

private void setRotation(ModelRenderer model, float x, float y, float z)
{
 model.rotateAngleX = x;
 model.rotateAngleY = y;
 model.rotateAngleZ = z;
}

}
