package tuntesapi;

import net.minecraft.world.World;

public interface IBlockComparatorUsage 
{
	public boolean hasComparatorInputOverride();
	public int getComparatorInputOverride(World par1World, int par2, int par3, int par4, int par5);
}
