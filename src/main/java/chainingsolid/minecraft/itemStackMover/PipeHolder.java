package chainingsolid.minecraft.itemStackMover;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class PipeHolder extends BlockContainer {
	
	protected PipeHolder(Material material) {
		super(material);
		this.setHardness(5);
	}
	
	
	
	@Override
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float sideX, float sideY, float sideZ){
		if(world.isRemote){
			return false;
		}
		TileEntity tile = world.getTileEntity(x, y, z);
		if(tile instanceof PipeHolderTile){
			PipeHolderTile pipeHolderTile = (PipeHolderTile) tile;
			pipeHolderTile.onPlayerClick(x, y, z, player, side, sideX, sideY, sideZ);
			return true;
		}
		return false;
	}
	
	
	
	
	
	
	@Override
	public TileEntity createNewTileEntity(World var1, int var2) {
		return new PipeHolderTile();
	}
	
}
