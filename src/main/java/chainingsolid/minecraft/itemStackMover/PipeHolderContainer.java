package chainingsolid.minecraft.itemStackMover;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.InventoryBasic;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class PipeHolderContainer extends Container implements ISlotButtonUser{
	
	PipeHolderTile tile;
	public EntityPlayer player;
	
	public InventoryBasic slotButtonInv;
	
	public static int SLOT_SIZE = 18;
	
	public Pipe currentPipe;
	
	public PipeHolderContainer(PipeHolderTile tile,  EntityPlayer player){
		this.tile = tile;
		this.player = player;
		slotButtonInv = new InventoryBasic("", true, 20);
		this.build();
	}
	
	public void build(){
		this.inventorySlots.clear();
		this.inventoryItemStacks.clear();
		this.addPlayerSlots();
		this.addSelectorSlots();
		if(this.currentPipe != null){
			this.addCurrentPipe();
		}
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
		int index = 0;
		for(EnumPipePostition pos : EnumPipePostition.values()){
			ItemStack stack = new ItemStack(ItemStackMoverMod.slotButton,1);
			stack.setStackDisplayName(pos.name());
			if(tile.hasPipeAtPos(pos)){
				slotButtonInv.setInventorySlotContents(index, stack);
			}
			this.addSlotToContainer(new SlotButton(slotButtonInv,index,index*SLOT_SIZE+SLOT_SIZE*9, SLOT_SIZE*12, this,pos.name()));
			index++;
		}
	}
	
	public void addSlot(Slot s){
		this.addSlotToContainer(s);
	}
	
	public void addCurrentPipe(){
		this.currentPipe.addSelfToGuiContianer(this);
	}
	
	@Override
	public void onButtonClicked(SlotButton button) {
		EnumPipePostition pos = EnumPipePostition.valueOf(button.returnMessage);
		this.currentPipe = tile.pipes.get(pos.posAsString());
		this.build();
	}
	
	
	
	
}
