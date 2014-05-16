package chainingsolid.minecraft.itemStackMover;

public class SorterPipe extends Pipe {
	
	public SorterPipe(EnumPipePostition pipePos) {
		super(pipePos);
		
	}
	
	@Override
	public boolean canConnectToPipe(Pipe p){
		return true;
	}
	
	
	
	
}
