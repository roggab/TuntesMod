package tuntesapi;

import net.minecraft.item.ItemStack;

public abstract interface IFuelValueProvider
{
  public abstract int getFuelValue(ItemStack paramItemStack, boolean paramBoolean);
}
