package chainingsolid.minecraft.itemStackMover;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import cpw.mods.fml.common.network.FMLIndexedMessageToMessageCodec;

public class PacketHandler extends FMLIndexedMessageToMessageCodec<Packet> {
	
	public PacketHandler(){
		
	}
	
	
	@Override
	public void encodeInto(ChannelHandlerContext ctx, Packet msg, ByteBuf target) throws Exception {
		
		
	}
	
	@Override
	public void decodeInto(ChannelHandlerContext ctx, ByteBuf source, Packet msg) {
		
		
	}
	
}
