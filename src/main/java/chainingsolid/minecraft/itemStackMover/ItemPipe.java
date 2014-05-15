package chainingsolid.minecraft.itemStackMover;

import java.util.List;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemDye;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

public class ItemPipe extends Item {
	
	public static final String NAME_TAG = "name";
	
	public ItemPipe(){
		this.setMaxDamage(0);
	}
	
	
	
	@Override
	public void getSubItems(Item item, CreativeTabs tab, List list){
		
		for(int meta = 0; meta < 16; meta++){
			ItemStack stack = new ItemStack(item);
			stack.setTagCompound(new NBTTagCompound());
			stack.getTagCompound().setString(NAME_TAG, "Item stack mover pipe : "+ ItemDye.field_150921_b[meta]);
			list.add(stack);
		}
		
	}
	
	@Override
	public String getItemStackDisplayName(ItemStack stack){
		return stack.getTagCompound().getString(NAME_TAG);
	}
	
	
}
