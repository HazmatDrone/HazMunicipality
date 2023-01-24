
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.hazmunicipality.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class HazmunicipalityModTabs {
	public static CreativeModeTab TAB_MUNICIPALITY;

	public static void load() {
		TAB_MUNICIPALITY = new CreativeModeTab("tabmunicipality") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(HazmunicipalityModItems.ENVELOPE.get());
			}

			@Override
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
	}
}
