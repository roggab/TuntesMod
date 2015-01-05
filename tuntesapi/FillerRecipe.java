package tuntesapi;

import net.minecraft.item.ItemStack;
import net.minecraftforge.liquids.LiquidStack;

public class FillerRecipe
{
  private LiquidStack input;
  private ItemStack needed;
  private ItemStack output;
  private int needEu;

  public FillerRecipe(int energy, LiquidStack input, ItemStack need, ItemStack output)
  {
    this.input = input;
    this.needEu = energy;
    this.needed = need;
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
  
  public ItemStack getNeed()
  {
    return this.needed.copy();
  }
}
