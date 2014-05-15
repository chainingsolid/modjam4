package chainingsolid.minecraft.itemStackMover;

import java.util.List;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemDye;
import net.minecraft.item.ItemStack;

public class ItemPipe extends Item {
	
	
	
	@Override
	public void getSubItems(Item item, CreativeTabs tab, List list){
		
		for(int meta = 0; meta < 16; meta++){
			ItemStack stack = new ItemStack(item);
			list.add(stack);
		}
		
	}
	
	
}
