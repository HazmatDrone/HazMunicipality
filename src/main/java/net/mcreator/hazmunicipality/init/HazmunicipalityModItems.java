
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.hazmunicipality.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.hazmunicipality.item.EnvelopeItem;
import net.mcreator.hazmunicipality.HazmunicipalityMod;

public class HazmunicipalityModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, HazmunicipalityMod.MODID);
	public static final RegistryObject<Item> ENVELOPE = REGISTRY.register("envelope", () -> new EnvelopeItem());
}
