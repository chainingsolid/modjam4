package chainingsolid.minecraft.itemStackMover;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;

public class PipeHolderContainer extends Container {
	
	PipeHolderTile tile;
	
	public PipeHolderContainer(PipeHolderTile tile){
		this.tile = tile;
		
	}
	
	@Override
	public boolean canInteractWith(EntityPlayer player) {
		return true;
	}
	
}
