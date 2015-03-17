package tuntesapi;

public interface ITuntesAddon 
{
	/**
	 * @return - Name of mod
	 */
	String getModName();
	
	/**
	 * @return - Disable the mod?
	 */
	boolean isDisabled();
}
