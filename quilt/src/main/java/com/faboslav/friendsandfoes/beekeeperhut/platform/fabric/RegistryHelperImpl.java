package com.faboslav.friendsandfoes.beekeeperhut.platform.fabric;

import com.faboslav.friendsandfoes.beekeeperhut.BeekeeperHut;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.structure.processor.StructureProcessor;
import net.minecraft.structure.processor.StructureProcessorType;

public final class RegistryHelperImpl
{
	public static <T extends StructureProcessor> void registerStructureProcessorType(
		String name,
		StructureProcessorType<T> structureProcessorType
	) {
		Registry.register(Registries.STRUCTURE_PROCESSOR, BeekeeperHut.makeID(name), structureProcessorType);
	}
}
