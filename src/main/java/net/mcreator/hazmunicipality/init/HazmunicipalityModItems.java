
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.hazmunicipality.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.hazmunicipality.item.StampItem;
import net.mcreator.hazmunicipality.item.EnvelopeItem;
import net.mcreator.hazmunicipality.HazmunicipalityMod;

public class HazmunicipalityModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, HazmunicipalityMod.MODID);
	public static final RegistryObject<Item> ENVELOPE = REGISTRY.register("envelope", () -> new EnvelopeItem());
	public static final RegistryObject<Item> STAMP = REGISTRY.register("stamp", () -> new StampItem());
	public static final RegistryObject<Item> MAIL_BOX = block(HazmunicipalityModBlocks.MAIL_BOX, CreativeModeTab.TAB_BUILDING_BLOCKS);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
