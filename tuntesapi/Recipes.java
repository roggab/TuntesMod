package tuntesapi;

import net.minecraft.item.ItemStack;
import tuntesapi.BigCrafting.CraftingManagerBig;


public class Recipes
{
  public static IMachineRecipeManager centrifuge;
  public static ICannerBottleRecipeManager cannerBottle;
  public static IMTRecipeManager MolecularTransformer;
  public static IMachineRecipeManager metalformerExtruding;
  public static IMachineRecipeManager metalformerCutting;
  public static IMachineRecipeManager metalformerRolling;
  public static IMachineRecipeManager matterAmplifier;
  public static IMachineRecipeManager Scanner;
  public static IMachineRecipeManager blastfurance;
  
  	/**
  	 * Example: Recipes.addBigCraftingRecipe(new ItemStack(Item.diamond, 1), new Object[]{ "#########", "#########", "#########", "#########", "#########", "#########", "#########", "#########", "#########",   Character.valueOf('#'), Block.dirt});

  	 */
	public static void addBigCraftingRecipe(ItemStack par1ItemStack, Object ... par2ArrayOfObj)
	{
		CraftingManagerBig.getInstance().addRecipe(par1ItemStack, par2ArrayOfObj);
	}
}

