package tuntesapi;

import net.minecraft.item.ItemStack;

public interface IHerobrineRegistry 
{
	/**
	 * @param message1 - Text 1
	 * @param message2 - Text 2
	 * @param message3 - Text 3
	 * @param message4 - Text 4
	 * Max symbols is 15!
	 * First argument need a letter!
	 */
	public void addMessage(String message1, String message2, String message3, String message4);
}
