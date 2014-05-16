package chainingsolid.minecraft.itemStackMover;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class SlotButtonItem extends Item {
	
	public SlotButtonItem(){
		this.setMaxStackSize(1);
	}
	
	public static void setDisplayName(ItemStack stack, String name){
		stack.setStackDisplayName(name);
	}
	
	
}
