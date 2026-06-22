package com.faboslav.friendsandfoes.beekeeperhut.world.processor.fabric;

import com.faboslav.friendsandfoes.beekeeperhut.platform.fabric.ProcessorTypes;
import com.faboslav.friendsandfoes.beekeeperhut.util.world.processor.BeekeeperHutArmorStandProcessorHelper;
import com.faboslav.friendsandfoes.common.world.processor.StructureEntityProcessor;
import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import org.jetbrains.annotations.Nullable;

//? if >= 26.2 {
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureProcessor;
//?} else {
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureProcessorType;
//?}

public final class BeekeeperHutArmorStandProcessor extends StructureEntityProcessor
{
	public static final MapCodec<BeekeeperHutArmorStandProcessor> CODEC = MapCodec.unit(BeekeeperHutArmorStandProcessor::new);

	private BeekeeperHutArmorStandProcessor() {
	}

	@Override
	public StructureTemplate.StructureEntityInfo processEntity(
		ServerLevelAccessor serverWorldAccess,
		BlockPos structurePiecePos,
		BlockPos structurePieceBottomCenterPos,
		StructureTemplate.StructureEntityInfo localEntityInfo,
		StructureTemplate.StructureEntityInfo globalEntityInfo,
		StructurePlaceSettings structurePlacementData
	) {
		return BeekeeperHutArmorStandProcessorHelper.processEntity(
			globalEntityInfo,
			structurePlacementData
		);
	}

	@Nullable
	@Override
	//? if >=26.2 {
	public StructureTemplate.StructureBlockInfo processBlock(
		LevelReader world,
		BlockPos pos,
		BlockPos pivot,
		BlockPos templateRelativePos,
		StructureTemplate.StructureBlockInfo globalEntityInfo,
		StructurePlaceSettings data
	)
	//?} else {
	/*public StructureTemplate.StructureBlockInfo processBlock(
		LevelReader world,
		BlockPos pos,
		BlockPos pivot,
		StructureTemplate.StructureBlockInfo localEntityInfo,
		StructureTemplate.StructureBlockInfo globalEntityInfo,
		StructurePlaceSettings data
	)
	*///?}
	{
		return globalEntityInfo;
	}

	@Override
	//? if >=26.2 {
	public MapCodec<? extends StructureProcessor> codec() {
		return ProcessorTypes.BEEKEEPER_HUT_ARMOR_STAND_PROCESSOR.get();
	}
	//?} else {
	/*protected StructureProcessorType<?> getType() {
		return ProcessorTypes.BEEKEEPER_HUT_ARMOR_STAND_PROCESSOR.get();
	}
	*///?}
}
