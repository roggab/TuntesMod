package tuntesapi;

import net.minecraftforge.common.ForgeDirection;

public abstract interface IHeatSource
{
  public abstract int maxrequestHeatTick(ForgeDirection paramForgeDirection);
  
  public abstract int requestHeat(ForgeDirection paramForgeDirection, int paramInt);
}
