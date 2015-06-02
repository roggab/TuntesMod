package tuntesapi.BigCrafting;

import java.util.Comparator;


import net.minecraft.item.crafting.IRecipe;

class RecipeSorter implements Comparator
{
    final CraftingManagerBig craftingManager;

    RecipeSorter(CraftingManagerBig par1CraftingManager)
    {
        this.craftingManager = par1CraftingManager;
    }

    public int compareRecipes(IRecipe par1IRecipe, IRecipe par2IRecipe)
    {
        return par1IRecipe instanceof ShapelessBigRecipes && par2IRecipe instanceof ShapedBigRecipes ? 1 : (par2IRecipe instanceof ShapelessBigRecipes && par1IRecipe instanceof ShapedBigRecipes ? -1 : (par2IRecipe.getRecipeSize() < par1IRecipe.getRecipeSize() ? -1 : (par2IRecipe.getRecipeSize() > par1IRecipe.getRecipeSize() ? 1 : 0)));
    }

    public int compare(Object par1Obj, Object par2Obj)
    {
        return this.compareRecipes((IRecipe)par1Obj, (IRecipe)par2Obj);
    }
}
