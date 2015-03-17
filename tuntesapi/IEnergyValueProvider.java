package tuntesapi;

import net.minecraft.item.ItemStack;

public abstract interface IEnergyValueProvider
{
  public abstract int getEnergyValue(ItemStack paramItemStack);
}
