package com.faboslav.friendsandfoes.beekeeperhut;

import com.faboslav.friendsandfoes.beekeeperhut.init.BeekeeperHutStructureProcessorTypes;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class BeekeeperHut
{
	public static final String MOD_ID = "beekeeperhut";
	private static final Logger LOGGER = LoggerFactory.getLogger(BeekeeperHut.MOD_ID);

	public static Identifier makeID(String path) {
		return Identifier.of(
			MOD_ID,
			path
		);
	}

	public static void init() {
		BeekeeperHutStructureProcessorTypes.init();
	}
}
