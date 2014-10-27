package tuntesapi;

import net.minecraft.item.ItemStack;

public abstract interface IMTRecipeManager
{
	/**
	 * Adds a Molecular Transformer recipe 
	 * @param input - Input stack
	 * @param output - Output stack
	 * @param energy - Need energy
	 */
  public abstract void addMTRecipe(ItemStack input, ItemStack output, int energy);
}
