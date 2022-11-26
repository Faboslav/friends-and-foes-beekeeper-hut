package com.faboslav.friendsandfoes.beekeeperhut.platform.fabric;

import com.faboslav.friendsandfoes.beekeeperhut.BeekeeperHut;
import com.faboslav.friendsandfoes.beekeeperhut.platform.RegistryHelper;
import com.faboslav.friendsandfoes.beekeeperhut.world.processor.fabric.BeekeeperHutArmorStandProcessor;
import com.faboslav.friendsandfoes.beekeeperhut.world.processor.fabric.BeekeeperHutItemFrameProcessor;
import net.minecraft.structure.processor.StructureProcessorType;

public final class StructureEntityProcessorTypesImpl
{
	public static StructureProcessorType<BeekeeperHutArmorStandProcessor> BEEKEEPER_HUT_ARMOR_STAND_PROCESSOR = () -> BeekeeperHutArmorStandProcessor.CODEC;
	public static StructureProcessorType<BeekeeperHutItemFrameProcessor> BEEKEEPER_HUT_ITEM_FRAME_PROCESSOR = () -> BeekeeperHutItemFrameProcessor.CODEC;

	public static void postInit() {
		RegistryHelper.registerStructureProcessorType(BeekeeperHut.makeID("beekeeper_hut_armor_stand_processor"), BEEKEEPER_HUT_ARMOR_STAND_PROCESSOR);
		RegistryHelper.registerStructureProcessorType(BeekeeperHut.makeID("beekeeper_hut_item_frame_processor"), BEEKEEPER_HUT_ITEM_FRAME_PROCESSOR);
	}
}
