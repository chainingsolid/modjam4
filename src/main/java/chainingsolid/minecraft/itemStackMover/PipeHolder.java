package chainingsolid.minecraft.itemStackMover;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class PipeHolder extends BlockContainer {
	
	protected PipeHolder(Material material) {
		super(material);
		
	}
	
	@Override
	public TileEntity createNewTileEntity(World var1, int var2) {
		return null;
	}
	
}
