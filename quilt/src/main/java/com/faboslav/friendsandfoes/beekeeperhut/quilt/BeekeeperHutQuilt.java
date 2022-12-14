package com.faboslav.friendsandfoes.beekeeperhut.quilt;

import com.faboslav.friendsandfoes.beekeeperhut.BeekeeperHut;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;

public final class BeekeeperHutQuilt implements ModInitializer
{
	@Override
	public void onInitialize(ModContainer mod) {
		BeekeeperHut.init();
	}
}
