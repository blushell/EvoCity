package evocity.blocks.citysign;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelCitySign extends ModelBase
{
	  //fields
	    ModelRenderer Sign1;
	    ModelRenderer Sign2;
	  
	  public ModelCitySign()
	  {
	    textureWidth = 256;
	    textureHeight = 128;
	    
	      Sign1 = new ModelRenderer(this, 0, 32);
	      Sign1.addBox(0F, 0F, -0.3F, 78, 32, 1);
	      Sign1.setRotationPoint(-39F, -8F, 0F);
	      Sign1.setTextureSize(256, 128);
	      Sign1.mirror = true;
	      setRotation(Sign1, 0F, 0F, 0F);
	      Sign2 = new ModelRenderer(this, 0, 0);
	      Sign2.addBox(0F, 0F, -0.3F, 80, 30, 1);
	      Sign2.setRotationPoint(-40F, -7F, 0F);
	      Sign2.setTextureSize(256, 128);
	      Sign2.mirror = true;
	      setRotation(Sign2, 0F, 0F, 0F);
	  }
	  
	  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	  {
	    super.render(entity, f, f1, f2, f3, f4, f5);
	    Sign1.render(f5);
	    Sign2.render(f5);
	  }
	   
		public void renderModel(float f) {
		    
			Sign1.render(f);
		    Sign2.render(f);
		}
		
	  private void setRotation(ModelRenderer model, float x, float y, float z)
	  {
	    model.rotateAngleX = x;
	    model.rotateAngleY = y;
	    model.rotateAngleZ = z;
	  }
	}