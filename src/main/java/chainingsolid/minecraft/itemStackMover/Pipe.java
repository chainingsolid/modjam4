package chainingsolid.minecraft.itemStackMover;

import java.util.HashMap;

import net.minecraft.block.BlockColored;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.common.util.ForgeDirection;

public class Pipe {
	
	public static final String COLOR_NAME = "color";
	
	public boolean exists = false;
	
	public int color = 0;
	public final EnumPipePostition POSITION;
	
	public final HashMap<ForgeDirection,PipeBuffer> connections = new HashMap();
	
	public ForgeDirection[] directions = new ForgeDirection[]{
			ForgeDirection.UP,
			ForgeDirection.DOWN,
			ForgeDirection.EAST,
			ForgeDirection.WEST,
			ForgeDirection.NORTH,
			ForgeDirection.SOUTH
			};
	
	public Pipe(EnumPipePostition pipePos){
		this.POSITION = pipePos;
		
		for(ForgeDirection direction : directions){
			connections.put(direction, new PipeBuffer());
		}
		
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
	
	public void tick(){
		
		
		
	}
	
	
}
