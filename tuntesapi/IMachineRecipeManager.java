package tuntesapi;

import java.util.Map;

import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

public abstract interface IMachineRecipeManager
{
  public abstract void addRecipe(IRecipeInput paramIRecipeInput, NBTTagCompound paramNBTTagCompound, ItemStack... paramVarArgs);
  
  public abstract RecipeOutput getOutputFor(ItemStack paramItemStack, boolean paramBoolean);
  
  public abstract Map<IRecipeInput, RecipeOutput> getRecipes();
}
