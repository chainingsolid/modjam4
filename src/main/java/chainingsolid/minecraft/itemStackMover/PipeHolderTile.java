package chainingsolid.minecraft.itemStackMover;

import java.util.HashMap;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class PipeHolderTile extends TileEntity {
	
	public HashMap<String,Pipe> pipes = new HashMap();
	
	
	public Pipe topNorthEast = new Pipe(EnumPipePostition.TOP_NORTH_EAST),
				topNorthWest = new Pipe(EnumPipePostition.TOP_NORTH_WEST),
				topSouthEast = new Pipe(EnumPipePostition.TOP_SOUTH_EAST),
				topSouthWest = new Pipe(EnumPipePostition.TOP_SOUTH_WEST),
				bottomNorthEast = new Pipe(EnumPipePostition.BOTTOM_NORTH_EAST),
				bottomNorthWest = new Pipe(EnumPipePostition.BOTTOM_NORTH_WEST),
				bottomSouthEast = new Pipe(EnumPipePostition.BOTTOM_SOUTH_EAST),
				bottomSouthWest = new Pipe(EnumPipePostition.BOTTOM_SOUTH_WEST)
				;
	
	public PipeHolderTile(){
		for(Pipe p : new Pipe[]{topNorthEast,
				topNorthWest,
				topSouthEast,
				topSouthWest,
				topSouthWest,
				bottomNorthEast,
				bottomNorthWest,
				bottomSouthEast,
				bottomSouthWest
				}){
			pipes.put(p.POSITION.posAsString(), p);
			
		}
	}
	
	
	public void onPlayerClick(int x, int y, int z, EntityPlayer player, int side, float sideX, float sideY, float sideZ){
		if(player.isSneaking()){
			
		}else{
			int roundedSideX = Math.round(sideX);
			int roundedSideY = Math.round(sideY);
			int roundedSideZ = Math.round(sideZ);
			try{
			System.out.println("piep got is "+pipes.get(""+roundedSideX+roundedSideY+roundedSideZ).POSITION.name());
			}catch(NullPointerException e){
				
			}
			
		}
	}
	
	
	
	
}
