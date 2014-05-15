package chainingsolid.minecraft.itemStackMover;

import net.minecraft.util.ResourceLocation;

public enum EnumPipeColor {
	
	
	
	BLACK(new ResourceLocation(null,"textures\\blocks\\hardened_clay_stained_black")),
	BLUE(new ResourceLocation(null,"textures\\blocks\\hardened_clay_stained_blue")),
	BROWN(new ResourceLocation(null,"textures\\blocks\\hardened_clay_stained_brown")),
	CYAN(new ResourceLocation(null,"textures\\blocks\\hardened_clay_stained_cyan")),
	GRAY(new ResourceLocation(null,"textures\\blocks\\hardened_clay_stained_gray")),
	GREEN(new ResourceLocation(null,"textures\\blocks\\hardened_clay_stained_green")),
	LIGHT_BLUE(new ResourceLocation(null,"textures\\blocks\\hardened_clay_stained_light_blue")),
	LIME(new ResourceLocation(null,"textures\\blocks\\hardened_clay_stained_lime")),
	MAGENTA(new ResourceLocation(null,"textures\\blocks\\hardened_clay_stained_magenta")),
	ORANGE(new ResourceLocation(null,"textures\\blocks\\hardened_clay_stained_orange")),
	GRAY(new ResourceLocation(null,"textures\\blocks\\hardened_clay_stained_gray")),
	;
	
	
	
	public final ResourceLocation texture;
	
	private EnumPipeColor(ResourceLocation texture){
		this.texture = texture;
	}
	
	
}
