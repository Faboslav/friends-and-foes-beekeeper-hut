package com.faboslav.friendsandfoes.beekeeperhut;

import com.faboslav.friendsandfoes.beekeeperhut.config.BeekeeperHutConfig;
import com.faboslav.friendsandfoes.beekeeperhut.config.omegaconfig.OmegaConfig;
import com.faboslav.friendsandfoes.beekeeperhut.init.ModStructureFeatures;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class BeekeeperHut
{
	private static final BeekeeperHutConfig CONFIG = OmegaConfig.register(BeekeeperHutConfig.class);
	private static final Logger LOGGER = LoggerFactory.getLogger(BeekeeperHut.MOD_ID);
	public static final String MOD_ID = "friendsandfoes";

	public static Identifier makeID(String path) {
		return new Identifier(
			MOD_ID,
			path
		);
	}

	public static String makeStringID(String name) {
		return MOD_ID + ":" + name;
	}

	public static BeekeeperHutConfig getConfig() {
		return CONFIG;
	}

	public static Logger getLogger() {
		return LOGGER;
	}

	public static void initRegisters() {
		ModStructureFeatures.initRegister();
	}

	public static void initCustomRegisters() {
		ModStructureFeatures.init();
	}
}
