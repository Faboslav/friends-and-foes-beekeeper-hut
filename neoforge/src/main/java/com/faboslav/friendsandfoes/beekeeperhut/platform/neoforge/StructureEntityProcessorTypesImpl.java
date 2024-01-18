package com.faboslav.friendsandfoes.beekeeperhut.platform.neoforge;

import com.faboslav.friendsandfoes.beekeeperhut.platform.RegistryHelper;
import com.faboslav.friendsandfoes.beekeeperhut.world.processor.neoforge.BeekeeperHutArmorStandProcessor;
import com.faboslav.friendsandfoes.beekeeperhut.world.processor.neoforge.BeekeeperHutItemFrameProcessor;
import net.minecraft.structure.processor.StructureProcessorType;

public final class StructureEntityProcessorTypesImpl
{
	public static StructureProcessorType<BeekeeperHutArmorStandProcessor> BEEKEEPER_HUT_ARMOR_STAND_PROCESSOR = () -> BeekeeperHutArmorStandProcessor.CODEC;
	public static StructureProcessorType<BeekeeperHutItemFrameProcessor> BEEKEEPER_HUT_ITEM_FRAME_PROCESSOR = () -> BeekeeperHutItemFrameProcessor.CODEC;

	public static void init() {
		RegistryHelper.registerStructureProcessorType("beekeeper_hut_armor_stand_processor", BEEKEEPER_HUT_ARMOR_STAND_PROCESSOR);
		RegistryHelper.registerStructureProcessorType("beekeeper_hut_item_frame_processor", BEEKEEPER_HUT_ITEM_FRAME_PROCESSOR);
	}
}
