
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.hazmunicipality.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.hazmunicipality.client.gui.MailboxUIScreen;
import net.mcreator.hazmunicipality.client.gui.EnvelopeUIScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class HazmunicipalityModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(HazmunicipalityModMenus.ENVELOPE_UI.get(), EnvelopeUIScreen::new);
			MenuScreens.register(HazmunicipalityModMenus.MAILBOX_UI.get(), MailboxUIScreen::new);
		});
	}
}
