package com.faboslav.friendsandfoes.beekeeperhut.neoforge;

import com.faboslav.friendsandfoes.beekeeperhut.BeekeeperHut;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;

@Mod(BeekeeperHut.MOD_ID)
public final class BeekeeperHutNeoForge
{
	public BeekeeperHutNeoForge(ModContainer modContainer, IEventBus modEventBus) {
		BeekeeperHut.init();
	}
}
