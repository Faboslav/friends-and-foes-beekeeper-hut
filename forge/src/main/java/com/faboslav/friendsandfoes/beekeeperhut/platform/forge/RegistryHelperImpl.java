package com.faboslav.friendsandfoes.beekeeperhut.platform.forge;

import com.faboslav.friendsandfoes.beekeeperhut.BeekeeperHut;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.structure.processor.StructureProcessor;
import net.minecraft.structure.processor.StructureProcessorType;
import net.minecraftforge.registries.DeferredRegister;

public final class RegistryHelperImpl
{
	public static final DeferredRegister<StructureProcessorType<?>> STRUCTURE_PROCESSOR_TYPES = DeferredRegister.create(RegistryKeys.STRUCTURE_PROCESSOR, BeekeeperHut.MOD_ID);

	public static <T extends StructureProcessor> void registerStructureProcessorType(
		String name,
		StructureProcessorType<T> structureProcessorType
	) {
		STRUCTURE_PROCESSOR_TYPES.register(name, () -> structureProcessorType);
	}
}
