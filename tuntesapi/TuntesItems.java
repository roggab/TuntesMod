package tuntesapi;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public final class TuntesItems {
	
	/**
	 * @param name - name of item
	 */
	public static Item getItem(String name) {
		try {
			if (mod_tuntescore == null) mod_tuntescore = Class.forName(getPackage() + ".mod_tuntescore");
			
			Object ret = mod_tuntescore.getField(name).get(null);
			
			if (ret instanceof Item) {
				return (Item) ret;
			} else {
				return null;
			}
		} catch (Exception e) {
			System.out.println("Tuntes API: Call getItem failed for "+name);
			
			return null;
		}
	}
	
	/**
	 * @param name - name of item
	 */
	public static Item getItemFromGravi(String name) {
		try {
			if (mod_tuntesGravi == null) mod_tuntesGravi = Class.forName(getPackage() + ".mod_tuntesGravi");
			
			Object ret = mod_tuntesGravi.getField(name).get(null);
			
			if (ret instanceof Item) {
				return (Item) ret;
			} else {
				return null;
			}
		} catch (Exception e) {
			System.out.println("Tuntes API: Call getItemFromGravi failed for "+name);
			
			return null;
		}
	}
	/**
	 * @param name - name of Block
	 */
	public static Block getBlock(String name) {
		try {
			if (mod_tuntescore == null) mod_tuntescore = Class.forName(getPackage() + ".mod_tuntescore");
			
			Object ret = mod_tuntescore.getField(name).get(null);
			
			if (ret instanceof Block) {
				return (Block) ret;
			} else {
				return null;
			}
		} catch (Exception e) {
			System.out.println("Tuntes API: Call getItem failed for "+name);
			
			return null;
		}
	}
	
	
	private static String getPackage() {
		Package pkg = TuntesItems.class.getPackage();
		if (pkg != null) return pkg.getName().substring(0, pkg.getName().lastIndexOf('.'));
		else return "tuntescore";
	}
	
	private static Class mod_tuntescore;
	private static Class mod_tuntesGravi;
}

