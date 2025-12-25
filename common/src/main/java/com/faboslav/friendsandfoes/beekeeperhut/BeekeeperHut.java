package com.faboslav.friendsandfoes.beekeeperhut;

import com.faboslav.friendsandfoes.beekeeperhut.init.BeekeeperHutStructureProcessorTypes;
import net.minecraft.resources.Identifier;

public final class BeekeeperHut
{
	public static final String MOD_ID = "beekeeperhut";

	public static Identifier makeID(String path) {
		return Identifier.fromNamespaceAndPath(
			MOD_ID,
			path
		);
	}

	public static void init() {
		BeekeeperHutStructureProcessorTypes.STRUCTURE_PROCESSOR.init();
		BeekeeperHutStructureProcessorTypes.init();
	}
}
