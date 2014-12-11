package tuntesapi;

import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public interface IItemWaterRotor {

	boolean canPlaceIntoMill();
	int getEfficiency();
	boolean isInfinite();
}
