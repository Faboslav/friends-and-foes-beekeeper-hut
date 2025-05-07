package com.faboslav.friendsandfoes.beekeeperhut.platform.fabric;

import com.faboslav.friendsandfoes.beekeeperhut.init.BeekeeperHutStructureProcessorTypes;
import com.faboslav.friendsandfoes.beekeeperhut.world.processor.fabric.BeekeeperHutArmorStandProcessor;
import com.faboslav.friendsandfoes.beekeeperhut.world.processor.fabric.BeekeeperHutItemFrameProcessor;
import com.teamresourceful.resourcefullib.common.registry.RegistryEntry;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureProcessorType;

public final class ProcessorTypes implements com.faboslav.friendsandfoes.beekeeperhut.platform.ProcessorTypes
{
	public static final RegistryEntry<StructureProcessorType<BeekeeperHutItemFrameProcessor>> BEEKEEPER_HUT_ITEM_FRAME_PROCESSOR = BeekeeperHutStructureProcessorTypes.STRUCTURE_PROCESSOR.register("beekeeper_hut_item_frame_processor", () -> () -> BeekeeperHutItemFrameProcessor.CODEC);
	public static final RegistryEntry<StructureProcessorType<BeekeeperHutArmorStandProcessor>> BEEKEEPER_HUT_ARMOR_STAND_PROCESSOR = BeekeeperHutStructureProcessorTypes.STRUCTURE_PROCESSOR.register("beekeeper_hut_armor_stand_processor", () -> () -> BeekeeperHutArmorStandProcessor.CODEC);

	@Override
	public void init() {

	}
}
