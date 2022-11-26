package com.faboslav.friendsandfoes.beekeeperhut.fabric;

import com.faboslav.friendsandfoes.beekeeperhut.BeekeeperHut;
import net.fabricmc.api.ModInitializer;

public final class BeekeeperHutFabric implements ModInitializer
{
	@Override
	public void onInitialize() {
		BeekeeperHut.postInit();
	}
}
