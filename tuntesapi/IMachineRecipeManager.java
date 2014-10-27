package tuntesapi;

import java.util.Map;

import tuntescore.RecipeOutput;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

public abstract interface IMachineRecipeManager
{
  public abstract void addRecipe(ItemStack paramItemStack, NBTTagCompound paramNBTTagCompound, ItemStack... paramVarArgs);
  
  public abstract RecipeOutput getOutputFor(ItemStack paramItemStack, boolean paramBoolean);
  
  public abstract Map<ItemStack, RecipeOutput> getRecipes();
}
