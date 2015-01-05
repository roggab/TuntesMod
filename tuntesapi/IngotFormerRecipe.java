package tuntesapi;

import net.minecraft.item.ItemStack;
import net.minecraftforge.liquids.LiquidStack;

public class IngotFormerRecipe
{
  private LiquidStack input;
  private ItemStack output;
  private int needEu;

  public IngotFormerRecipe(int energy, LiquidStack input, ItemStack output)
  {
    this.input = input;
    this.needEu = energy;
    this.output = new ItemStack(output.itemID, 1, output.getItemDamage());
  }
  
  public int getEuNeed()
  {
    return needEu;
  }
  
  
  public LiquidStack getInput()
  {
    return this.input.copy();
  }
  
  public ItemStack getOutput()
  {
    return this.output.copy();
  }
}
