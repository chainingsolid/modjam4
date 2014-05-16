package chainingsolid.minecraft.itemStackMover;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class SlotButton extends Slot {
	
	ISlotButtonUser user;
	
	public String returnMessage;
	
	public SlotButton(IInventory inv, int index, int xd, int yd,ISlotButtonUser user,String msg) {
		super(inv, index, xd, yd);
		this.user = user;
		this.returnMessage = msg;
	}
	
	public boolean canTakeStack(EntityPlayer par1EntityPlayer){
		user.onButtonClicked(this);
		return false;
	}
	
	@Override
	public boolean isItemValid(ItemStack par1ItemStack){
		return false;
	}
	
	
	
}
