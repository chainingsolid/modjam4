package chainingsolid.minecraft.itemStackMover;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;

public abstract class SlotButton extends Slot {
	
	ISlotButtonUser user;
	
	public SlotButton(IInventory inv, int index, int xd, int yd,ISlotButtonUser user) {
		super(inv, index, xd, yd);
		this.user = user;
	}
	
	public boolean canTakeStack(EntityPlayer par1EntityPlayer){
		user.onButtonClicked(this);
		return false;
	}
	
	
	
	
	
}
