package com.faboslav.friendsandfoes.beekeeperhut.world.processor.neoforge;

import com.faboslav.friendsandfoes.beekeeperhut.platform.neoforge.StructureEntityProcessorTypesImpl;
import com.faboslav.friendsandfoes.beekeeperhut.util.world.processor.BeekeeperHutArmorStandProcessorHelper;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import net.minecraft.structure.StructurePlacementData;
import net.minecraft.structure.StructureTemplate;
import net.minecraft.structure.processor.StructureProcessor;
import net.minecraft.structure.processor.StructureProcessorType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.WorldView;
import org.jetbrains.annotations.Nullable;

public final class BeekeeperHutArmorStandProcessor extends StructureProcessor
{
	public static final MapCodec<BeekeeperHutArmorStandProcessor> CODEC = MapCodec.unit(BeekeeperHutArmorStandProcessor::new);

	@Override
	public StructureTemplate.StructureEntityInfo processEntity(
		WorldView world,
		BlockPos seedPos,
		StructureTemplate.StructureEntityInfo rawEntityInfo,
		StructureTemplate.StructureEntityInfo entityInfo,
		StructurePlacementData placementSettings,
		StructureTemplate template
	) {
		return BeekeeperHutArmorStandProcessorHelper.processEntity(
			entityInfo,
			placementSettings
		);
	}

	@Nullable
	@Override
	public StructureTemplate.StructureBlockInfo process(
		WorldView world,
		BlockPos pos,
		BlockPos pivot,
		StructureTemplate.StructureBlockInfo localEntityInfo,
		StructureTemplate.StructureBlockInfo globalEntityInfo,
		StructurePlacementData data
	) {
		return globalEntityInfo;
	}

	@Override
	protected StructureProcessorType<?> getType() {
		return StructureEntityProcessorTypesImpl.BEEKEEPER_HUT_ARMOR_STAND_PROCESSOR;
	}
}
