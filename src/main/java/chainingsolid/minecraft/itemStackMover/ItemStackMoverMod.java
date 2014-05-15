package chainingsolid.minecraft.itemStackMover;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;


@Mod(modid = "ItemStackMoverMod")
public class ItemStackMoverMod {
	
	@Instance
	public static ItemStackMoverMod mod;
	
	
	public static PipeHolder holder;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		holder = new PipeHolder(Material.wood);
		GameRegistry.registerBlock(holder, "PipeHolder");
		holder.setCreativeTab(CreativeTabs.tabTransport);
		
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event){
		GameRegistry.registerTileEntity(PipeHolderTile.class, "PipeHolderTile");
		
		
	}
	
	
}
