package tuntesapi;

import net.minecraft.item.ItemStack;

public class TuntesDrops {
	

	/**
	 * Add an item stack to the New Year drops.
	 *
	 * @param dropItem item stack to add
	 * @param chance chance for the item to drop, see the code comments for reference values
	 */
	public static void addNewYearDrop(ItemStack dropItem, float chance) {
		try {
			Class.forName(getPackage() + ".ItemNewYear").getMethod("addDrop", ItemStack.class, float.class).invoke(null, dropItem, chance);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	/**
	 * Add an item stack to the Advanced Scrapbox drops.
	 *
	 * @param dropItem item stack to add
	 * @param chance chance for the item to drop, see the code comments for reference values
	 */
	public static void addScDrop(ItemStack dropItem, float chance) {
		try {
			Class.forName(getPackage() + ".ItemScUnBox").getMethod("addDrop", ItemStack.class, float.class).invoke(null, dropItem, chance);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	private static String getPackage() {
		Package pkg = TuntesItems.class.getPackage();
		if (pkg != null) return pkg.getName().substring(0, pkg.getName().lastIndexOf('.'));
		else return "tuntescore";
	}
	
	private static Class mod_tuntescore;
}
