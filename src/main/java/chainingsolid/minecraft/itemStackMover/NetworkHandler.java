package chainingsolid.minecraft.itemStackMover;

import java.util.EnumMap;

import cpw.mods.fml.common.network.FMLEmbeddedChannel;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.relauncher.Side;

public class NetworkHandler {
	
	
	public static final String CHANNEL_NAME = "ItemStackMover";
	
	public static EnumMap<Side,FMLEmbeddedChannel> channel;
	
	public static void buildHandler(){
		channel = NetworkRegistry.INSTANCE.newChannel(CHANNEL_NAME, new PacketHandler());
	}
	
	
	
	
	
}
