package tuntesapi;

import java.util.HashMap;
import java.util.Map;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.liquids.LiquidContainerRegistry;
import net.minecraftforge.liquids.LiquidStack;

public class FuelPetroleumGenerator
{
  private static Map fuels = new HashMap();
  private LiquidStack fuel;
  private int euPerBucket;
  private int euPacketSize;
  private int guiOffset;
  
  public static FuelPetroleumGenerator getFuelByItemId(int itemId)
  {
    return (FuelPetroleumGenerator)fuels.get(Integer.valueOf(itemId));
  }
  
  public static boolean isValidFuel(int itemId)
  {
    return fuels.containsKey(Integer.valueOf(itemId));
  }
  
  public FuelPetroleumGenerator(LiquidStack liquidStack, int euPerBucket, int euPacketSize, int offset)
  {
    this(liquidStack.asItemStack(), euPerBucket, euPacketSize, offset);
  }
  
  public FuelPetroleumGenerator(Item item, int euPerBucket, int euPacketSize, int offset)
  {
    this(new ItemStack(item), euPerBucket, euPacketSize, offset);
  }
  
	public FuelPetroleumGenerator(ItemStack itemStack, int euPerBucket,
			int euPacketSize, int offset) {
		if (itemStack.getItem().hasContainerItem()) {
			fuel = LiquidContainerRegistry.getLiquidForFilledItem(itemStack);
		} else {
			fuel = new LiquidStack(itemStack.getItem(),
					LiquidContainerRegistry.BUCKET_VOLUME);
		}
		this.euPerBucket = euPerBucket;
		this.euPacketSize = euPacketSize;
		this.guiOffset = offset;

		FuelPetroleumGenerator.fuels.put(fuel.itemID, this);
	}
  
  public LiquidStack getFuel()
  {
    return this.fuel;
  }
  
  public int getItemId()
  {
    return this.fuel.itemID;
  }
  
  public int getEuPerBucket()
  {
    return this.euPerBucket;
  }
  
  public int getEuPerLiquidUnit()
  {
    return this.euPerBucket / 1000;
  }
  
  public int getEuPacketSize()
  {
    return this.euPacketSize;
  }
  
  public int getTicksForLiquidUnit()
  {
    return getEuPerLiquidUnit() / this.euPacketSize;
  }
  
  public int getGuiOffset()
  {
    return this.guiOffset;
  }
}
