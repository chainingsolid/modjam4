package chainingsolid.minecraft.itemStackMover;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.inventory.Container;

public class PipeHolderGUI extends GuiContainer {
	
	PipeHolderContainer contianer;
	
	public PipeHolderGUI(PipeHolderContainer container) {
		super(container);
		this.contianer = container;
		this.xSize = 256;
		this.ySize = 256;
	}
	
	@Override
	protected void drawGuiContainerBackgroundLayer(float var1, int var2, int var3) {
		
		
	}
	
}
