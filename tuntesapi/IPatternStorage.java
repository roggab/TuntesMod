package tuntesapi;

import net.minecraft.item.ItemStack;

public abstract interface IPatternStorage
{
  public abstract boolean transferPattern(ItemStack paramItemStack, int paramInt1, int paramInt2);
  
  public abstract int[] getPatternvalus(ItemStack paramItemStack);
  
  public abstract short getPatternCount();
  
  public abstract ItemStack getPatternItemstack(int paramInt);
}
