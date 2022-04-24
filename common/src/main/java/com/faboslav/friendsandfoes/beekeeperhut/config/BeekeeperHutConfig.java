package com.faboslav.friendsandfoes.beekeeperhut.config;


import com.faboslav.friendsandfoes.beekeeperhut.BeekeeperHut;
import com.faboslav.friendsandfoes.beekeeperhut.config.omegaconfig.api.Config;

public final class BeekeeperHutConfig implements Config
{
	public boolean generateBeekeeperHutStructure = true;

	@Override
	public String getName() {
		return BeekeeperHut.MOD_ID;
	}
}
