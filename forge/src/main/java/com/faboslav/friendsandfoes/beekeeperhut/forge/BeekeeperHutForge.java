package com.faboslav.friendsandfoes.beekeeperhut.forge;

import com.faboslav.friendsandfoes.beekeeperhut.BeekeeperHut;
import com.faboslav.friendsandfoes.beekeeperhut.BeekeeperHutServer;
import dev.architectury.platform.Platform;
import dev.architectury.platform.forge.EventBuses;
import dev.architectury.utils.Env;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLDedicatedServerSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(BeekeeperHut.MOD_ID)
@Mod.EventBusSubscriber(modid = BeekeeperHut.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public final class BeekeeperHutForge
{
	public BeekeeperHutForge() {
		var modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
		EventBuses.registerModEventBus(BeekeeperHut.MOD_ID, modEventBus);

		BeekeeperHut.initRegisters();

		modEventBus.addListener(BeekeeperHutForge::init);
		modEventBus.addListener(BeekeeperHutForge::serverInit);
	}

	private static void init(final FMLCommonSetupEvent event) {
		BeekeeperHut.initCustomRegisters();
	}

	private static void serverInit(final FMLDedicatedServerSetupEvent event) {
		event.enqueueWork(() -> {
			if (Platform.getEnvironment() != Env.SERVER) {
				return;
			}

			BeekeeperHutServer.init();
		});
	}
}
