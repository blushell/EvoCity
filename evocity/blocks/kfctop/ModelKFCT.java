package evocity.blocks.kfctop;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelKFCT extends ModelBase
{
  //fields
    ModelRenderer KFC;
  
  public ModelKFCT()
  {
	    textureWidth = 128;
	    textureHeight = 64;
	    
	      KFC = new ModelRenderer(this, 0, 0);
	      KFC.addBox(0F, 0F, 0F, 32, 16, 5);
	      KFC.setRotationPoint(-16F, 8F, -2F);
	      KFC.setTextureSize(128, 64);
	      KFC.mirror = true;
	      setRotation(KFC, 0F, 0F, 0F);
	  }
	  
	  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	  {
	    super.render(entity, f, f1, f2, f3, f4, f5);
	    KFC.render(f5);
	  }
  
  public void renderModel(float f) {
	    KFC.render(f);
	}
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
}