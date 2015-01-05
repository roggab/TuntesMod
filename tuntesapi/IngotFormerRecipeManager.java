package tuntesapi;

import java.util.ArrayList;

import net.minecraft.item.ItemStack;
import net.minecraftforge.liquids.LiquidStack;
import net.minecraftforge.oredict.OreDictionary;

public class IngotFormerRecipeManager
{
  ArrayList recipes = new ArrayList();
  public static IngotFormerRecipeManager instance = new IngotFormerRecipeManager();
  
  /**
   * @param energy - Energy need to form
   * @param time - Time need
   * @param input - Liquid input
   * @param output - ItemStack Output
   */
  public static void addRecipe(int energy, LiquidStack input, ItemStack output)
  {
    instance.recipes.add(new IngotFormerRecipe(energy, input, output));
  }
  
  public static void addRecipe(int energy,LiquidStack input, String output)
  {
    ArrayList ores = OreDictionary.getOres(output);
    if (ores.size() == 0) {
      return;
    }
    instance.recipes.add(new IngotFormerRecipe(energy, input, (ItemStack)ores.get(0)));
  }
  
  public static IngotFormerRecipe getRecipe(LiquidStack item)
  {
    if (item == null) {
      return null;
    }
    for (int a = 0; a < instance.recipes.size(); a++) {
      if ((((IngotFormerRecipe)instance.recipes.get(a)).getInput().itemID == item.itemID) && (((IngotFormerRecipe)instance.recipes.get(a)).getInput().itemMeta == item.itemMeta))
      {
        int stackSize = item.amount;
        if (stackSize >= ((IngotFormerRecipe)instance.recipes.get(a)).getInput().amount) {
          return (IngotFormerRecipe)instance.recipes.get(a);
        }
      }
    }
    return null;
  }
}
