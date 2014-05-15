package chainingsolid.minecraft.itemStackMover;

import java.util.HashMap;

import cpw.mods.fml.common.network.internal.FMLNetworkHandler;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;

public class PipeHolderTile extends TileEntity {
	
	public HashMap<String,Pipe> pipes = new HashMap();
	
	
	private Pipe topNorthEast = new Pipe(EnumPipePostition.TOP_NORTH_EAST),
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
	
	@Override
	public void updateEntity(){
		
		
		
	}
	
	public void onPlayerClick(int x, int y, int z, EntityPlayer player, int side, float sideX, float sideY, float sideZ){
		int roundedSideX = Math.round(sideX);
		int roundedSideY = Math.round(sideY);
		int roundedSideZ = Math.round(sideZ);
		Pipe p = pipes.get(""+roundedSideX+roundedSideY+roundedSideZ);
		
		ItemStack heldStack = player.getHeldItem();
		
		if(player.isSneaking() && p.exists){
			p.exists = false;
			ItemStack backToWorld = p.getPipeToPutBackIntoWorld();
			EntityItem e = new EntityItem(worldObj, x, y, z, backToWorld);
			worldObj.spawnEntityInWorld(e);
			System.out.println("here's your pipe back");
		}
		if(heldStack == null){
			this.openGUI(player, x, y, z);
		}else{
			if(!(heldStack.getItem() instanceof ItemPipe)){
				this.openGUI(player, x, y, z);
			}else{
				ItemPipe pipeItem = (ItemPipe) heldStack.getItem();
				
				if(!p.exists){
					p.exists = true;
					p.color = heldStack.getItemDamage();
					heldStack.stackSize--;
				}
			}
		}
	}
	
	public void openGUI(EntityPlayer player ,int x,int y,int z){
		FMLNetworkHandler.openGui(player, ItemStackMoverMod.mod, 0 , player.getEntityWorld(), x, y, z);
	}
	
	
}
