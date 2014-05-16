package chainingsolid.minecraft.itemStackMover;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class PipeHolderContainer extends Container implements ISlotButtonUser{
	
	PipeHolderTile tile;
	public EntityPlayer player;
	
	
	
	public static int SLOT_SIZE = 18;
	
	public PipeHolderContainer(PipeHolderTile tile,  EntityPlayer player){
		this.tile = tile;
		this.player = player;
		this.addPlayerSlots();
		
	}
	
	@Override
	public ItemStack transferStackInSlot(EntityPlayer player, int slot){
		return null; 
	}
	
	@Override
	public boolean canInteractWith(EntityPlayer player) {
		return true;
	}
	
	public void addPlayerSlots(){
		int index = 0;
		InventoryPlayer inv = player.inventory;
		for(int x = 0; x < 9;x++){
			this.addSlotToContainer(new Slot(inv,index,x*SLOT_SIZE,SLOT_SIZE*12));
			index++;
		}
		
		for(int y = 0; y < 3;y++){
			for(int x = 0; x < 9;x++){
				this.addSlotToContainer(new Slot(inv,index,x*SLOT_SIZE,SLOT_SIZE*y+SLOT_SIZE*9));
				index++;
			}
		}
	}
	
	public void addSelectorSlots(){
		
	}
	
	@Override
	public void onButtonClicked(SlotButton button) {
		
		
		
		
	}
	
	
	
}
