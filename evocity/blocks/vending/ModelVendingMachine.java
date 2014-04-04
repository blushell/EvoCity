package evocity.blocks.vending;

import net.minecraft.client.model.*;
import net.minecraft.entity.Entity;


public class ModelVendingMachine extends ModelBase
{
//fields
 ModelRenderer Base;
 ModelRenderer Base2;
 ModelRenderer FrameB;
 ModelRenderer FrameT;
 ModelRenderer FrameR;
 ModelRenderer FrameL;
 ModelRenderer Insert;
 ModelRenderer Button1;
 ModelRenderer Button2;
 ModelRenderer Button3;
 ModelRenderer Button4;
 ModelRenderer Button5;
 ModelRenderer Button6;
 ModelRenderer CoinSlot;

public ModelVendingMachine()
{
 textureWidth = 64;
 textureHeight = 128;
 
   Base = new ModelRenderer(this, 0, 0);
   Base.addBox(0F, 0F, 0F, 12, 28, 16);
   Base.setRotationPoint(-8F, -4F, -8F);
   Base.setTextureSize(64, 128);
   Base.mirror = true;
   setRotation(Base, 0F, 0F, 0F);
   Base2 = new ModelRenderer(this, 0, 44);
   Base2.addBox(0F, 0F, 0F, 4, 28, 14);
   Base2.setRotationPoint(4F, -4F, -6F);
   Base2.setTextureSize(64, 128);
   Base2.mirror = true;
   setRotation(Base2, 0F, 0F, 0F);
   FrameB = new ModelRenderer(this, 0, 94);
   FrameB.addBox(0F, 0F, 0F, 8, 1, 1);
   FrameB.setRotationPoint(-6F, 19F, -9F);
   FrameB.setTextureSize(64, 128);
   FrameB.mirror = true;
   setRotation(FrameB, 0F, 0F, 0F);
   FrameT = new ModelRenderer(this, 0, 86);
   FrameT.addBox(0F, 0F, 0F, 8, 1, 1);
   FrameT.setRotationPoint(-6F, 16F, -9F);
   FrameT.setTextureSize(64, 128);
   FrameT.mirror = true;
   setRotation(FrameT, 0F, 0F, 0F);
   FrameR = new ModelRenderer(this, 0, 88);
   FrameR.addBox(0F, 0F, 0F, 1, 2, 1);
   FrameR.setRotationPoint(1F, 17F, -9F);
   FrameR.setTextureSize(64, 128);
   FrameR.mirror = true;
   setRotation(FrameR, 0F, 0F, 0F);
   FrameL = new ModelRenderer(this, 0, 88);
   FrameL.addBox(0F, 0F, 0F, 1, 2, 1);
   FrameL.setRotationPoint(-6F, 17F, -9F);
   FrameL.setTextureSize(64, 128);
   FrameL.mirror = true;
   setRotation(FrameL, 0F, 0F, 0F);
   Insert = new ModelRenderer(this, 0, 96);
   Insert.addBox(0F, 0F, 0F, 6, 2, 1);
   Insert.setRotationPoint(-5F, 17F, -8.5F);
   Insert.setTextureSize(64, 128);
   Insert.mirror = true;
   setRotation(Insert, 0F, 0F, 0F);
   Button1 = new ModelRenderer(this, 36, 44);
   Button1.addBox(0F, 0F, 0F, 2, 1, 1);
   Button1.setRotationPoint(5F, 0F, -6.5F);
   Button1.setTextureSize(64, 128);
   Button1.mirror = true;
   setRotation(Button1, 0F, 0F, 0F);
   Button2 = new ModelRenderer(this, 36, 46);
   Button2.addBox(0F, 0F, 0F, 2, 1, 1);
   Button2.setRotationPoint(5F, 2F, -6.5F);
   Button2.setTextureSize(64, 128);
   Button2.mirror = true;
   setRotation(Button2, 0F, 0F, 0F);
   Button3 = new ModelRenderer(this, 36, 48);
   Button3.addBox(0F, 0F, 0F, 2, 1, 1);
   Button3.setRotationPoint(5F, 4F, -6.5F);
   Button3.setTextureSize(64, 128);
   Button3.mirror = true;
   setRotation(Button3, 0F, 0F, 0F);
   Button4 = new ModelRenderer(this, 36, 50);
   Button4.addBox(0F, 0F, 0F, 2, 1, 1);
   Button4.setRotationPoint(5F, 6F, -6.5F);
   Button4.setTextureSize(64, 128);
   Button4.mirror = true;
   setRotation(Button4, 0F, 0F, 0F);
   Button5 = new ModelRenderer(this, 36, 52);
   Button5.addBox(0F, 0F, 0F, 2, 1, 1);
   Button5.setRotationPoint(5F, 8F, -6.5F);
   Button5.setTextureSize(64, 128);
   Button5.mirror = true;
   setRotation(Button5, 0F, 0F, 0F);
   Button6 = new ModelRenderer(this, 36, 54);
   Button6.addBox(0F, 0F, 0F, 2, 1, 1);
   Button6.setRotationPoint(5F, 10F, -6.5F);
   Button6.setTextureSize(64, 128);
   Button6.mirror = true;
   setRotation(Button6, 0F, 0F, 0F);
   CoinSlot = new ModelRenderer(this, 36, 56);
   CoinSlot.addBox(0F, 0F, 0F, 2, 2, 1);
   CoinSlot.setRotationPoint(5F, 16F, -6.5F);
   CoinSlot.setTextureSize(64, 128);
   CoinSlot.mirror = true;
   setRotation(CoinSlot, 0F, 0F, 0F);
}

public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
{
 super.render(entity, f, f1, f2, f3, f4, f5);
 setRotationAngles(f, f1, f2, f3, f4, f5, entity);
 Base.render(f5);
 Base2.render(f5);
 FrameB.render(f5);
 FrameT.render(f5);
 FrameR.render(f5);
 FrameL.render(f5);
 Insert.render(f5);
 Button1.render(f5);
 Button2.render(f5);
 Button3.render(f5);
 Button4.render(f5);
 Button5.render(f5);
 Button6.render(f5);
 CoinSlot.render(f5);
}

public void renderModel(float f){
	 Base.render(f);
	 Base2.render(f);
	 FrameB.render(f);
	 FrameT.render(f);
	 FrameR.render(f);
	 FrameL.render(f);
	 Insert.render(f);
	 Button1.render(f);
	 Button2.render(f);
	 Button3.render(f);
	 Button4.render(f);
	 Button5.render(f);
	 Button6.render(f);
	 CoinSlot.render(f);
}

private void setRotation(ModelRenderer model, float x, float y, float z)
{
 model.rotateAngleX = x;
 model.rotateAngleY = y;
 model.rotateAngleZ = z;
}

public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
{
 super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
}

}