package tuntesapi;

import java.util.ArrayList;

import net.minecraft.item.ItemStack;
import net.minecraftforge.liquids.LiquidStack;
import net.minecraftforge.oredict.OreDictionary;

public class ArcFurnaceRecipeManager
{
  ArrayList recipes = new ArrayList();
  public static ArcFurnaceRecipeManager instance = new ArcFurnaceRecipeManager();
  
  public static void addRecipe(int energy, String input, LiquidStack output)
  {
    ArrayList ores = OreDictionary.getOres(input);
    for (int a = 0; a < ores.size(); a++) {
      addRecipe(energy, new ItemStack(((ItemStack)ores.get(a)).itemID, 1, ((ItemStack)ores.get(a)).getItemDamage()), output);
    }
  }
  
  public static void addRecipe(int energy, ItemStack input, LiquidStack output)
  {
    instance.recipes.add(new ArcFurnaceRecipe(energy, input, output));
  }
  
  public static ArcFurnaceRecipe getRecipe(ItemStack item)
  {
    if (item == null) {
      return null;
    }
    for (int a = 0; a < instance.recipes.size(); a++) {
      if ((((ArcFurnaceRecipe)instance.recipes.get(a)).getInput().getItem().itemID == item.getItem().itemID) && (((ArcFurnaceRecipe)instance.recipes.get(a)).getInput().getItemDamage() == item.getItemDamage()))
      {
        int stackSize = item.stackSize;
        if (stackSize >= ((ArcFurnaceRecipe)instance.recipes.get(a)).getInput().stackSize) {
          return (ArcFurnaceRecipe)instance.recipes.get(a);
        }
      }
    }
    return null;
  }
}
