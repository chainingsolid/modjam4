package chainingsolid.minecraft.itemStackMover;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler {
	
	
	
	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		TileEntity tile = world.getTileEntity(x, y, z);
		if(tile instanceof PipeHolderTile){
			return new PipeHolderContainer((PipeHolderTile) tile);
		}
		return null;
	}
	
	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		TileEntity tile = world.getTileEntity(x, y, z);
		if(tile instanceof PipeHolderTile){
			return new PipeHolderGUI(new PipeHolderContainer((PipeHolderTile) tile));
		}
		return null;
	}
	
}
