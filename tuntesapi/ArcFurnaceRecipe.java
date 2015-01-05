package tuntesapi;

import net.minecraft.item.ItemStack;
import net.minecraftforge.liquids.LiquidStack;

public class ArcFurnaceRecipe
{
  private ItemStack input;
  private LiquidStack output;
  private int needEu;

  public ArcFurnaceRecipe(int energy,ItemStack input, LiquidStack output)
  {
    this.input = input;
    this.output = output;
    this.needEu = energy;
  }
  
  public int getEuNeed()
  {
    return needEu;
  }
  
  public ItemStack getInput()
  {
    return this.input.copy();
  }
  
  public LiquidStack getOutput()
  {
    return this.output.copy();
  }
}
