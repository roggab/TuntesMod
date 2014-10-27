package tuntesapi;

import net.minecraft.item.ItemStack;

public abstract interface IAdvReactorComponent
{
  public abstract void processChamber(IAdvReactor paramIReactor, ItemStack paramItemStack, int paramInt1, int paramInt2);
  
  public abstract boolean acceptUraniumPulse(IAdvReactor paramIReactor, ItemStack paramItemStack1, ItemStack paramItemStack2, int paramInt1, int paramInt2, int paramInt3, int paramInt4);
  
  public abstract boolean canStoreHeat(IAdvReactor paramIReactor, ItemStack paramItemStack, int paramInt1, int paramInt2);
  
  public abstract int getMaxHeat(IAdvReactor paramIReactor, ItemStack paramItemStack, int paramInt1, int paramInt2);
  
  public abstract int getCurrentHeat(IAdvReactor paramIReactor, ItemStack paramItemStack, int paramInt1, int paramInt2);
  
  public abstract int alterHeat(IAdvReactor paramIReactor, ItemStack paramItemStack, int paramInt1, int paramInt2, int paramInt3);
  
  public abstract float influenceExplosion(IAdvReactor paramIReactor, ItemStack paramItemStack);
}
