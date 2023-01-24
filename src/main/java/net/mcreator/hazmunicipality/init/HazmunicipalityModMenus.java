
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.hazmunicipality.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.hazmunicipality.world.inventory.EnvelopeUIMenu;
import net.mcreator.hazmunicipality.HazmunicipalityMod;

public class HazmunicipalityModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, HazmunicipalityMod.MODID);
	public static final RegistryObject<MenuType<EnvelopeUIMenu>> ENVELOPE_UI = REGISTRY.register("envelope_ui",
			() -> IForgeMenuType.create(EnvelopeUIMenu::new));
}
