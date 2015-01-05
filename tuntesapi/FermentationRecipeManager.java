package tuntesapi;

import java.util.ArrayList;

import net.minecraft.item.ItemStack;
import net.minecraftforge.liquids.LiquidStack;
import net.minecraftforge.oredict.OreDictionary;

public class FermentationRecipeManager
{
  ArrayList recipes = new ArrayList();
  public static FermentationRecipeManager instance = new FermentationRecipeManager();
  
  /**
   * @param energy - Energy need to form
   * @param input - Liquid input
   * @param input2 - Liquid2
   * @param output - Liquid Output
   */
  public static void addRecipe(int energy, LiquidStack input, LiquidStack input2, LiquidStack output)
  {
    instance.recipes.add(new FermentationRecipe(energy, input, input2, output));
  }
  
  public static void addRecipe(int energy,LiquidStack input, LiquidStack input2, String output)
  {
    ArrayList ores = OreDictionary.getOres(output);
    if (ores.size() == 0) {
      return;
    }
    instance.recipes.add(new FermentationRecipe(energy, input, input2, (LiquidStack)ores.get(0)));
  }
  
  public static FermentationRecipe getRecipe(LiquidStack item)
  {
    if (item == null) {
      return null;
    }
    for (int a = 0; a < instance.recipes.size(); a++) {
      if ((((FermentationRecipe)instance.recipes.get(a)).getInput().itemID == item.itemID) && (((FermentationRecipe)instance.recipes.get(a)).getInput().itemMeta == item.itemMeta))
      {
        int stackSize = item.amount;
        if (stackSize >= ((FermentationRecipe)instance.recipes.get(a)).getInput().amount) {
          return (FermentationRecipe)instance.recipes.get(a);
        }
      }
    }
    return null;
  }
}
