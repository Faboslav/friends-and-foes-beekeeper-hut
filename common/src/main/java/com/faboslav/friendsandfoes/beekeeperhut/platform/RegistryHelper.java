package com.faboslav.friendsandfoes.beekeeperhut.platform;

import dev.architectury.injectables.annotations.ExpectPlatform;
import net.minecraft.structure.processor.StructureProcessor;
import net.minecraft.structure.processor.StructureProcessorType;

public final class RegistryHelper
{
	@ExpectPlatform
	public static <T extends StructureProcessor> void registerStructureProcessorType(
		String name,
		StructureProcessorType<T> structureProcessorType
	) {
		throw new AssertionError();
	}
}
