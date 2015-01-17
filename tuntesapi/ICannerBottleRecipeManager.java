package tuntesapi;

import java.util.Map;
import net.minecraft.item.ItemStack;

public abstract interface ICannerBottleRecipeManager
{
  public abstract void addRecipe(IRecipeInput paramIRecipeInput1, IRecipeInput paramIRecipeInput2, ItemStack paramItemStack);
  
  public abstract RecipeOutput getOutputFor(ItemStack paramItemStack1, ItemStack paramItemStack2, boolean paramBoolean1, boolean paramBoolean2);
  
  public abstract Map<Input, RecipeOutput> getRecipes();
  
  public static class Input
  {
    public final IRecipeInput container;
    public final IRecipeInput fill;
    
    public Input(IRecipeInput container1, IRecipeInput fill1)
    {
      this.container = container1;
      this.fill = fill1;
    }
    
    public boolean matches(ItemStack container1, ItemStack fill1)
    {
      return (this.container.matches(container1)) && (this.fill.matches(fill1));
    }
  }
}
