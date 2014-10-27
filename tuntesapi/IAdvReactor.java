package tuntesapi;

import net.minecraft.item.ItemStack;
import net.minecraft.util.ChunkCoordinates;
import net.minecraft.world.World;

public abstract interface IAdvReactor
{
  public abstract ChunkCoordinates getPosition();
  
  public abstract World getWorld();
  
  public abstract int getHeat();
  
  public abstract void setHeat(int paramInt);
  
  public abstract int addHeat(int paramInt);
  
  public abstract int getMaxHeat();
  
  public abstract void setMaxHeat(int paramInt);
  
  public abstract float getHeatEffectModifier();
  
  public abstract void setHeatEffectModifier(float paramFloat);
  
  public abstract int getOutput();
  
  public abstract float addOutput(float paramFloat);
  
  @Deprecated
  public abstract int addOutput(int paramInt);
  
  @Deprecated
  public abstract int getPulsePower();
  
  public abstract ItemStack getItemAt(int paramInt1, int paramInt2);
  
  public abstract void setItemAt(int paramInt1, int paramInt2, ItemStack paramItemStack);
  
  public abstract void explode();
  
  public abstract int getTickRate();
  
  public abstract boolean produceEnergy();
}
