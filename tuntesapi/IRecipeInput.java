package tuntesapi;

import java.util.List;
import net.minecraft.item.ItemStack;

public abstract interface IRecipeInput
{
  public abstract boolean matches(ItemStack paramItemStack);
  
  public abstract int getAmount();
  
  public abstract List<ItemStack> getInputs();
}
