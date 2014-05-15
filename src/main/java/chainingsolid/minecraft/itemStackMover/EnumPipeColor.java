package chainingsolid.minecraft.itemStackMover;

import net.minecraft.util.ResourceLocation;

public enum EnumPipeColor {
	
	RED(new ResourceLocation(null,""));
	
	
	
	public final ResourceLocation texture;
	
	private EnumPipeColor(ResourceLocation texture){
		this.texture = texture;
	}
	
	
}
