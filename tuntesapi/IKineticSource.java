package tuntesapi;

import net.minecraftforge.common.ForgeDirection;

public abstract interface IKineticSource
{
  public abstract int maxrequestkineticenergyTick(ForgeDirection paramForgeDirection);
  
  public abstract int requestkineticenergy(ForgeDirection paramForgeDirection, int paramInt);
}
