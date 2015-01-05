package tuntesapi;

import java.util.ArrayList;

import net.minecraft.item.ItemStack;
import net.minecraftforge.liquids.LiquidStack;
import net.minecraftforge.oredict.OreDictionary;

public class FillerRecipeManager
{
  ArrayList recipes = new ArrayList();
  public static FillerRecipeManager instance = new FillerRecipeManager();
  
  /**
   * @param energy - Energy need to form
   * @param time - Time need
   * @param input - Liquid input
   * @param need - need itemStack to work
   * @param output - ItemStack Output
   */
  public static void addRecipe(int energy, LiquidStack input, ItemStack need, ItemStack output)
  {
    instance.recipes.add(new FillerRecipe(energy, input, need, output));
  }
  
  public static void addRecipe(int energy,LiquidStack input, ItemStack need, String output)
  {
    ArrayList ores = OreDictionary.getOres(output);
    if (ores.size() == 0) {
      return;
    }
    instance.recipes.add(new FillerRecipe(energy, input, need, (ItemStack)ores.get(0)));
  }
  
  public static FillerRecipe getRecipe(LiquidStack item)
  {
    if (item == null) {
      return null;
    }
    for (int a = 0; a < instance.recipes.size(); a++) {
      if ((((FillerRecipe)instance.recipes.get(a)).getInput().itemID == item.itemID) && (((FillerRecipe)instance.recipes.get(a)).getInput().itemMeta == item.itemMeta))
      {
        int stackSize = item.amount;
        if (stackSize >= ((FillerRecipe)instance.recipes.get(a)).getInput().amount) {
          return (FillerRecipe)instance.recipes.get(a);
        }
      }
    }
    return null;
  }
}
