package evocity.blocks.speaker;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelSpeaker extends ModelBase
{
  //fields
    ModelRenderer box;
    ModelRenderer speaker1;
    ModelRenderer speaker2;
  
  public ModelSpeaker()
  {
    textureWidth = 64;
    textureHeight = 64;
    
      box = new ModelRenderer(this, 0, 0);
      box.addBox(0F, 0F, -2F, 16, 16, 16);
      box.setRotationPoint(-8F, 8F, -6F);
      box.setTextureSize(64, 64);
      box.mirror = true;
      setRotation(box, 0F, 0F, 0F);
      speaker1 = new ModelRenderer(this, 0, 32);
      speaker1.addBox(0F, 0F, 0F, 12, 4, 1);
      speaker1.setRotationPoint(-6F, 11F, -9F);
      speaker1.setTextureSize(64, 64);
      speaker1.mirror = true;
      setRotation(speaker1, 0F, 0F, 0F);
      speaker2 = new ModelRenderer(this, 0, 37);
      speaker2.addBox(0F, 0F, 0F, 10, 6, 1);
      speaker2.setRotationPoint(-5F, 10F, -9F);
      speaker2.setTextureSize(64, 64);
      speaker2.mirror = true;
      setRotation(speaker2, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    box.render(f5);
    speaker1.render(f5);
    speaker2.render(f5);
  }
  
  public void renderModel(float f) {
	    box.render(f);
	    speaker1.render(f);
	    speaker2.render(f);
	}
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
}