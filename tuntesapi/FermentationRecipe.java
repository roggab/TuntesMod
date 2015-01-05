package tuntesapi;

import net.minecraft.item.ItemStack;
import net.minecraftforge.liquids.LiquidStack;

public class FermentationRecipe
{
  private LiquidStack input;
  private LiquidStack input2;
  private LiquidStack output;
  private int needEu;

  public FermentationRecipe(int energy, LiquidStack input, LiquidStack input2, LiquidStack output)
  {
    this.input = input;
    this.input2 = input2;
    this.needEu = energy;
    this.output = new LiquidStack(output.itemID, 1, output.itemMeta);
  }
  
  public int getEuNeed()
  {
    return needEu;
  }
  
  
  public LiquidStack getInput()
  {
    return this.input.copy();
  }
  
  public LiquidStack getInput2()
  {
    return this.input2.copy();
  }
  
  public LiquidStack getOutput()
  {
    return this.output.copy();
  }
  
}
