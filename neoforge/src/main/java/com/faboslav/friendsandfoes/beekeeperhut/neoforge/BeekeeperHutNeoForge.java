package com.faboslav.friendsandfoes.beekeeperhut.neoforge;

import com.faboslav.friendsandfoes.beekeeperhut.BeekeeperHut;
import com.faboslav.friendsandfoes.beekeeperhut.platform.neoforge.RegistryHelperImpl;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(BeekeeperHut.MOD_ID)
public final class BeekeeperHutNeoForge
{
	public BeekeeperHutNeoForge() {
		BeekeeperHut.init();

		IEventBus modEventBus = net.neoforged.fml.javafmlmod.FMLJavaModLoadingContext.get().getModEventBus();
		RegistryHelperImpl.STRUCTURE_PROCESSOR_TYPES.register(modEventBus);
	}
}
