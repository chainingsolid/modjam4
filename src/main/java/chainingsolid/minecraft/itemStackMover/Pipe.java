package chainingsolid.minecraft.itemStackMover;

import net.minecraft.block.BlockColored;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

public class Pipe {
	
	public static final String COLOR_NAME = "color";
	
	public boolean exists = false;
	
	public int color = 0;
	public final EnumPipePostition POSITION;
	
	public Pipe(EnumPipePostition pipePos){
		this.POSITION = pipePos;
		
		
		
		
		
	}
	
	public ItemStack getPipeToPutBackIntoWorld(){
		ItemStack stack = new ItemStack(ItemStackMoverMod.pipe,1,this.color);
		return stack;
	}
	
	
	public void writeToNBT(NBTTagCompound tag){
		
	}
	
	
	public void readFromNBT(NBTTagCompound tag){
		
	}
	
	public Packet makeSyncPacket(){
		Packet packet = new Packet();
		
		
		
		
		
		return packet;
	}
	
	
	public void syncFromPacket(Packet p){
		
	}
	
}
