package chainingsolid.minecraft.itemStackMover;

import net.minecraft.inventory.InventoryBasic;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

public class PipeBuffer {
	
	public boolean active = false;
	
	public InventoryBasic stacksIn = new InventoryBasic("",false,1);
	
	public InventoryBasic stacksOut = new InventoryBasic("",false,1);
	
	
	public void saveToNBT(NBTTagCompound tag){
		
	}
	
	public void readFromNBT(NBTTagCompound tag){
		
	}
	
}
