package chainingsolid.minecraft.itemStackMover;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;

public class PipeHolderGUI extends GuiContainer {
	
	PipeHolderContainer contianer;
	
	public PipeHolderGUI(PipeHolderContainer container) {
		super(container);
		this.contianer = container;
		this.xSize = 256;
		this.ySize = 256;
	}
	
	@Override
	public void initGui(){
		super.initGui();
		
		
		
		
		
	}
	
	
	@Override
	protected void drawGuiContainerBackgroundLayer(float var1, int var2, int var3) {
		for(Object o : contianer.inventorySlots){
			if(o instanceof Slot){
				Slot s = (Slot)o;
				this.drawTexturedModalRect(s.xDisplayPosition-1, s.yDisplayPosition-1, 0, 0, 20, 20);//TODO finish
				
			}
		}//x, y, u, v, width, height
		
	}
	
}
