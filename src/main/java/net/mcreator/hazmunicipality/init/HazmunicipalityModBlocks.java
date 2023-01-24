
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.hazmunicipality.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.hazmunicipality.block.MailBoxBlock;
import net.mcreator.hazmunicipality.HazmunicipalityMod;

public class HazmunicipalityModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, HazmunicipalityMod.MODID);
	public static final RegistryObject<Block> MAIL_BOX = REGISTRY.register("mail_box", () -> new MailBoxBlock());
}
