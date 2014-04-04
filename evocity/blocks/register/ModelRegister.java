package evocity.blocks.register;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelRegister extends ModelBase
{
	  //fields
	    ModelRenderer Base1;
	    ModelRenderer Base2;
	    ModelRenderer Button1;
	    ModelRenderer Button2;
	    ModelRenderer Button3;
	    ModelRenderer Button4;
	    ModelRenderer Button5;
	    ModelRenderer Button_6;
	    ModelRenderer Button_7;
	    ModelRenderer Button_8;
	    ModelRenderer Button_9;
	    ModelRenderer Slope;
	    ModelRenderer Tick;
	  
	  public ModelRegister()
	  {
	    textureWidth = 128;
	    textureHeight = 64;
	    
	      Base1 = new ModelRenderer(this, 0, 0);
	      Base1.addBox(0F, 0F, 0F, 16, 4, 16);
	      Base1.setRotationPoint(-8F, 20F, -8F);
	      Base1.setTextureSize(128, 64);
	      Base1.mirror = true;
	      setRotation(Base1, 0F, 0F, 0F);
	      Base2 = new ModelRenderer(this, 64, 0);
	      Base2.addBox(0F, 0F, 0F, 16, 7, 8);
	      Base2.setRotationPoint(-8F, 13F, -8F);
	      Base2.setTextureSize(128, 64);
	      Base2.mirror = true;
	      setRotation(Base2, 0F, 0F, 0F);
	      Button1 = new ModelRenderer(this, 0, 20);
	      Button1.addBox(0F, 0F, 0F, 1, 1, 1);
	      Button1.setRotationPoint(3F, 16F, 1F);
	      Button1.setTextureSize(128, 64);
	      Button1.mirror = true;
	      setRotation(Button1, 0F, 0F, 0F);
	      Button2 = new ModelRenderer(this, 0, 20);
	      Button2.addBox(0F, 0F, 0F, 1, 1, 1);
	      Button2.setRotationPoint(1F, 16F, 1F);
	      Button2.setTextureSize(128, 64);
	      Button2.mirror = true;
	      setRotation(Button2, 0F, 0F, 0F);
	      Button3 = new ModelRenderer(this, 0, 20);
	      Button3.addBox(0F, 0F, 0F, 1, 1, 1);
	      Button3.setRotationPoint(-1F, 16F, 1F);
	      Button3.setTextureSize(128, 64);
	      Button3.mirror = true;
	      setRotation(Button3, 0F, 0F, 0F);
	      Button4 = new ModelRenderer(this, 0, 20);
	      Button4.addBox(0F, 0F, 0F, 1, 1, 1);
	      Button4.setRotationPoint(-1F, 17F, 3F);
	      Button4.setTextureSize(128, 64);
	      Button4.mirror = true;
	      setRotation(Button4, 0F, 0F, 0F);
	      Button5 = new ModelRenderer(this, 0, 20);
	      Button5.addBox(0F, 0F, 0F, 1, 1, 1);
	      Button5.setRotationPoint(1F, 17F, 3F);
	      Button5.setTextureSize(128, 64);
	      Button5.mirror = true;
	      setRotation(Button5, 0F, 0F, 0F);
	      Button_6 = new ModelRenderer(this, 0, 20);
	      Button_6.addBox(0F, 0F, 0F, 1, 1, 1);
	      Button_6.setRotationPoint(3F, 17F, 3F);
	      Button_6.setTextureSize(128, 64);
	      Button_6.mirror = true;
	      setRotation(Button_6, 0F, 0F, 0F);
	      Button_7 = new ModelRenderer(this, 0, 20);
	      Button_7.addBox(0F, 0F, 0F, 1, 1, 1);
	      Button_7.setRotationPoint(3F, 18F, 5F);
	      Button_7.setTextureSize(128, 64);
	      Button_7.mirror = true;
	      setRotation(Button_7, 0F, 0F, 0F);
	      Button_8 = new ModelRenderer(this, 0, 20);
	      Button_8.addBox(0F, 0F, 0F, 1, 1, 1);
	      Button_8.setRotationPoint(1F, 18F, 5F);
	      Button_8.setTextureSize(128, 64);
	      Button_8.mirror = true;
	      setRotation(Button_8, 0F, 0F, 0F);
	      Button_9 = new ModelRenderer(this, 0, 20);
	      Button_9.addBox(0F, 0F, 0F, 1, 1, 1);
	      Button_9.setRotationPoint(-1F, 18F, 5F);
	      Button_9.setTextureSize(128, 64);
	      Button_9.mirror = true;
	      setRotation(Button_9, 0F, 0F, 0F);
	      Slope = new ModelRenderer(this, 64, 15);
	      Slope.addBox(0F, 0F, 0F, 16, 9, 4);
	      Slope.setRotationPoint(-8F, 19.2F, -2F);
	      Slope.setTextureSize(128, 64);
	      Slope.mirror = true;
	      setRotation(Slope, 1.095736F, 0F, 0F);
	      Tick = new ModelRenderer(this, 4, 20);
	      Tick.addBox(0F, 0F, 0F, 6, 3, 1);
	      Tick.setRotationPoint(-7F, 10F, -6F);
	      Tick.setTextureSize(128, 64);
	      Tick.mirror = true;
	      setRotation(Tick, 0F, 0F, 0F);
	  }
	  
	  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	  {
	    super.render(entity, f, f1, f2, f3, f4, f5);
	    Base1.render(f5);
	    Base2.render(f5);
	    Button1.render(f5);
	    Button2.render(f5);
	    Button3.render(f5);
	    Button4.render(f5);
	    Button5.render(f5);
	    Button_6.render(f5);
	    Button_7.render(f5);
	    Button_8.render(f5);
	    Button_9.render(f5);
	    Slope.render(f5);
	    Tick.render(f5);
	  }
	  
	  private void setRotation(ModelRenderer model, float x, float y, float z)
	  {
	    model.rotateAngleX = x;
	    model.rotateAngleY = y;
	    model.rotateAngleZ = z;
	  }

	public void renderModel(float f) {
	    Base1.render(f);
	    Base2.render(f);
	    Button1.render(f);
	    Button2.render(f);
	    Button3.render(f);
	    Button4.render(f);
	    Button5.render(f);
	    Button_6.render(f);
	    Button_7.render(f);
	    Button_8.render(f);
	    Button_9.render(f);
	    Slope.render(f);
	    Tick.render(f);	
	}
}