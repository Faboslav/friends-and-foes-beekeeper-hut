package com.faboslav.friendsandfoes.beekeeperhut.init;

import com.faboslav.friendsandfoes.beekeeperhut.BeekeeperHut;
import com.faboslav.friendsandfoes.beekeeperhut.platform.PlatformHooks;
import com.mojang.serialization.MapCodec;
import com.teamresourceful.resourcefullib.common.registry.ResourcefulRegistries;
import com.teamresourceful.resourcefullib.common.registry.ResourcefulRegistry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureProcessor;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureProcessorType;

/**
 * @see StructureProcessorType
 */
public final class BeekeeperHutStructureProcessorTypes
{
	//? if >=26.2 {
	public static final ResourcefulRegistry<MapCodec<? extends StructureProcessor>> STRUCTURE_PROCESSOR = ResourcefulRegistries.create(BuiltInRegistries.STRUCTURE_PROCESSOR, BeekeeperHut.MOD_ID);
	//?} else {
	/*public static final ResourcefulRegistry<StructureProcessorType<?>> STRUCTURE_PROCESSOR = ResourcefulRegistries.create(BuiltInRegistries.STRUCTURE_PROCESSOR, BeekeeperHut.MOD_ID);
	*///?}

	private BeekeeperHutStructureProcessorTypes() {
	}

	public static void init() {
		PlatformHooks.PROCESSOR_TYPES.init();
	}
}
