package tuntesapi;

import net.minecraft.block.StepSound;
import net.minecraft.item.Item;

public class TuntesSounds {
	/**
	 * @param name - name of stepSound
	 */
	public static StepSound getStepSound(String name) {
		try {
			if (mod_tuntescore == null) mod_tuntescore = Class.forName(getPackage() + ".mod_tuntescore");
			
			Object ret = mod_tuntescore.getField(name).get(null);
			
			if (ret instanceof StepSound) {
				return (StepSound) ret;
			} else {
				return null;
			}
		} catch (Exception e) {
			System.out.println("Tuntes API: Call getStepSound failed for "+name);
			
			return null;
		}
	}
	private static String getPackage() {
		Package pkg = TuntesItems.class.getPackage();
		if (pkg != null) return pkg.getName().substring(0, pkg.getName().lastIndexOf('.'));
		else return "tuntescore";
	}
	
	private static Class mod_tuntescore;
}
