package net.lomeli.equivalency.te;

import cpw.mods.fml.common.Loader;

public class AddonThermalExpansion 
{
	public static boolean checkTE()
	{
		if (Loader.isModLoaded("ThermalExpansion"))
		{
			try
			{
				return true;
			}
			catch(Exception ex)
			{
				return false;
			}
		}
		else
		{
			System.out.println("Thermal Expansion not found, ignoring");
			return false;
		}
	}
}
