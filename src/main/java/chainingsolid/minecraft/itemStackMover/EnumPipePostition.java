package chainingsolid.minecraft.itemStackMover;

public enum EnumPipePostition {
	//x , y, z
	//east = 1 wesat = 0, top = 1 bottom = 0, nortyh = 1 south = 0
	TOP_NORTH_EAST(DirectionValue.EAST,DirectionValue.TOP,DirectionValue.NORTH),
	TOP_NORTH_WEST(DirectionValue.WEST,DirectionValue.TOP,DirectionValue.NORTH),
	TOP_SOUTH_EAST(DirectionValue.EAST,DirectionValue.TOP,DirectionValue.SOUTH),
	TOP_SOUTH_WEST(DirectionValue.WEST,DirectionValue.TOP,DirectionValue.SOUTH),
	BOTTOM_NORTH_EAST(DirectionValue.EAST,DirectionValue.BOTTOM,DirectionValue.NORTH),
	BOTTOM_NORTH_WEST(DirectionValue.WEST,DirectionValue.BOTTOM,DirectionValue.NORTH),
	BOTTOM_SOUTH_EAST(DirectionValue.EAST,DirectionValue.BOTTOM,DirectionValue.SOUTH),
	BOTTOM_SOUTH_WEST(DirectionValue.WEST,DirectionValue.BOTTOM,DirectionValue.SOUTH)
	;
	
	
	
	public final int POS_X,POS_Y,POS_Z;
	
	
	private EnumPipePostition(int posX,int posY,int posZ){
		this.POS_X = posX;
		this.POS_Y = posY;
		this.POS_Z = posZ;
	}
	
	public String posAsString(){
		return ""+POS_X+POS_Y+POS_Z;
	}
	
	
	public static class DirectionValue{
		
		public static final int TOP = 1,
				BOTTOM = 0,
				EAST = 1,
				WEST = 0,
				NORTH = 1,
				SOUTH = 0;
		
		
	}
	
}
