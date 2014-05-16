package chainingsolid.minecraft.itemStackMover;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;

public class PipeHolderContainer extends Container {
	
	PipeHolderTile tile;
	public EntityPlayer player;
	
	public static int SLOT_SIZE = 18;
	
	public PipeHolderContainer(PipeHolderTile tile,  EntityPlayer player){
		this.tile = tile;
		this.player = player;
		this.addPlayerSlots();
	}
	
	@Override
	public boolean canInteractWith(EntityPlayer player) {
		return true;
	}
	
	public void addPlayerSlots(){
		int index = 0;
		InventoryPlayer inv = player.inventory;
		for(int x = 0; x < 9;x++){
			this.addSlotToContainer(new Slot(inv,index,x*SLOT_SIZE,SLOT_SIZE*10));
			index++;
		}
		
		for(int y = 0; y < 3;y++){
			for(int x = 0; x < 9;x++){
				this.addSlotToContainer(new Slot(inv,index,x*SLOT_SIZE,SLOT_SIZE*y+SLOT_SIZE*7));
				index++;
			}
		}
	}
	
	
	
}
