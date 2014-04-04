package evocity.blocks.hydrant;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelFireHydrant extends ModelBase
{
  //fields
    ModelRenderer base1;
    ModelRenderer base2;
    ModelRenderer stem1;
    ModelRenderer stem2;
    ModelRenderer stem3;
    ModelRenderer stem4;
    ModelRenderer tbase1;
    ModelRenderer tbase2;
    ModelRenderer tbase3;
    ModelRenderer tbase4;
    ModelRenderer tbase5;
    ModelRenderer tbase6;
    ModelRenderer tbase7;
    ModelRenderer tbase8;
    ModelRenderer tbase9;
    ModelRenderer knob1;
    ModelRenderer knob2;
    ModelRenderer knob3;
  
  public ModelFireHydrant()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      base1 = new ModelRenderer(this, 0, 0);
      base1.addBox(0F, 0F, 0F, 8, 2, 10);
      base1.setRotationPoint(-4F, 22F, -5F);
      base1.setTextureSize(64, 32);
      base1.mirror = true;
      setRotation(base1, 0F, 0F, 0F);
      base2 = new ModelRenderer(this, 0, 0);
      base2.addBox(0F, 0F, 0F, 10, 2, 8);
      base2.setRotationPoint(-5F, 22F, -4F);
      base2.setTextureSize(64, 32);
      base2.mirror = true;
      setRotation(base2, 0F, 0F, 0F);
      stem1 = new ModelRenderer(this, 0, 0);
      stem1.addBox(0F, 0F, 0F, 8, 12, 2);
      stem1.setRotationPoint(-4F, 10F, -1F);
      stem1.setTextureSize(64, 32);
      stem1.mirror = true;
      setRotation(stem1, 0F, 0F, 0F);
      stem2 = new ModelRenderer(this, 0, 0);
      stem2.addBox(0F, 0F, 0F, 2, 12, 8);
      stem2.setRotationPoint(-1F, 10F, -4F);
      stem2.setTextureSize(64, 32);
      stem2.mirror = true;
      setRotation(stem2, 0F, 0F, 0F);
      stem3 = new ModelRenderer(this, 0, 0);
      stem3.addBox(0F, 0F, 0F, 6, 12, 4);
      stem3.setRotationPoint(-3F, 10F, -2F);
      stem3.setTextureSize(64, 32);
      stem3.mirror = true;
      setRotation(stem3, 0F, 0F, 0F);
      stem4 = new ModelRenderer(this, 0, 0);
      stem4.addBox(0F, 0F, 0F, 4, 12, 6);
      stem4.setRotationPoint(-2F, 10F, -3F);
      stem4.setTextureSize(64, 32);
      stem4.mirror = true;
      setRotation(stem4, 0F, 0F, 0F);
      tbase1 = new ModelRenderer(this, 0, 0);
      tbase1.addBox(0F, 0F, 0F, 8, 2, 10);
      tbase1.setRotationPoint(-4F, 10F, -5F);
      tbase1.setTextureSize(64, 32);
      tbase1.mirror = true;
      setRotation(tbase1, 0F, 0F, 0F);
      tbase2 = new ModelRenderer(this, 0, 0);
      tbase2.addBox(0F, 0F, 0F, 10, 2, 8);
      tbase2.setRotationPoint(-5F, 10F, -4F);
      tbase2.setTextureSize(64, 32);
      tbase2.mirror = true;
      setRotation(tbase2, 0F, 0F, 0F);
      tbase3 = new ModelRenderer(this, 0, 0);
      tbase3.addBox(0F, 0F, 0F, 8, 1, 6);
      tbase3.setRotationPoint(-4F, 9F, -3F);
      tbase3.setTextureSize(64, 32);
      tbase3.mirror = true;
      setRotation(tbase3, 0F, 0F, 0F);
      tbase4 = new ModelRenderer(this, 0, 0);
      tbase4.addBox(0F, 0F, 0F, 6, 1, 8);
      tbase4.setRotationPoint(-3F, 9F, -4F);
      tbase4.setTextureSize(64, 32);
      tbase4.mirror = true;
      setRotation(tbase4, 0F, 0F, 0F);
      tbase5 = new ModelRenderer(this, 0, 0);
      tbase5.addBox(0F, 0F, 0F, 4, 1, 6);
      tbase5.setRotationPoint(-2F, 8F, -3F);
      tbase5.setTextureSize(64, 32);
      tbase5.mirror = true;
      setRotation(tbase5, 0F, 0F, 0F);
      tbase6 = new ModelRenderer(this, 0, 0);
      tbase6.addBox(0F, 0F, 0F, 6, 1, 4);
      tbase6.setRotationPoint(-3F, 8F, -2F);
      tbase6.setTextureSize(64, 32);
      tbase6.mirror = true;
      setRotation(tbase6, 0F, 0F, 0F);
      tbase7 = new ModelRenderer(this, 6, 23);
      tbase7.addBox(0F, 0F, 0F, 4, 1, 2);
      tbase7.setRotationPoint(-2F, 7F, -1F);
      tbase7.setTextureSize(64, 32);
      tbase7.mirror = true;
      setRotation(tbase7, 0F, 0F, 0F);
      tbase8 = new ModelRenderer(this, 6, 26);
      tbase8.addBox(0F, 0F, 0F, 2, 1, 4);
      tbase8.setRotationPoint(-1F, 7F, -2F);
      tbase8.setTextureSize(64, 32);
      tbase8.mirror = true;
      setRotation(tbase8, 0F, 0F, 0F);
      tbase9 = new ModelRenderer(this, 10, 20);
      tbase9.addBox(0F, 0F, 0F, 2, 1, 2);
      tbase9.setRotationPoint(-1F, 6F, -1F);
      tbase9.setTextureSize(64, 32);
      tbase9.mirror = true;
      setRotation(tbase9, 0F, 0F, 0F);
      knob1 = new ModelRenderer(this, 0, 20);
      knob1.addBox(0F, 0F, 0F, 4, 2, 1);
      knob1.setRotationPoint(-2F, 14F, -5F);
      knob1.setTextureSize(64, 32);
      knob1.mirror = true;
      setRotation(knob1, 0F, 0F, 0F);
      knob2 = new ModelRenderer(this, 0, 23);
      knob2.addBox(0F, 0F, 0F, 2, 4, 1);
      knob2.setRotationPoint(-1F, 13F, -5F);
      knob2.setTextureSize(64, 32);
      knob2.mirror = true;
      setRotation(knob2, 0F, 0F, 0F);
      knob3 = new ModelRenderer(this, 0, 28);
      knob3.addBox(0F, 0F, 0F, 2, 2, 1);
      knob3.setRotationPoint(-1F, 14F, -6F);
      knob3.setTextureSize(64, 32);
      knob3.mirror = true;
      setRotation(knob3, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    base1.render(f5);
    base2.render(f5);
    stem1.render(f5);
    stem2.render(f5);
    stem3.render(f5);
    stem4.render(f5);
    tbase1.render(f5);
    tbase2.render(f5);
    tbase3.render(f5);
    tbase4.render(f5);
    tbase5.render(f5);
    tbase6.render(f5);
    tbase7.render(f5);
    tbase8.render(f5);
    tbase9.render(f5);
    knob1.render(f5);
    knob2.render(f5);
    knob3.render(f5);
  }
  
  public void renderModel(float f) {
	    base1.render(f);
	    base2.render(f);
	    stem1.render(f);
	    stem2.render(f);
	    stem3.render(f);
	    stem4.render(f);
	    tbase1.render(f);
	    tbase2.render(f);
	    tbase3.render(f);
	    tbase4.render(f);
	    tbase5.render(f);
	    tbase6.render(f);
	    tbase7.render(f);
	    tbase8.render(f);
	    tbase9.render(f);
	    knob1.render(f);
	    knob2.render(f);
	    knob3.render(f);	
	}
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
}