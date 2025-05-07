package com.faboslav.friendsandfoes.beekeeperhut.world.processor.fabric;

import com.faboslav.friendsandfoes.beekeeperhut.platform.fabric.ProcessorTypes;
import com.faboslav.friendsandfoes.beekeeperhut.util.world.processor.BeekeeperHutItemFrameProcessorHelper;
import com.faboslav.friendsandfoes.common.world.processor.StructureEntityProcessor;
import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureProcessorType;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import org.jetbrains.annotations.Nullable;

public final class BeekeeperHutItemFrameProcessor extends StructureEntityProcessor
{
	public static final MapCodec<BeekeeperHutItemFrameProcessor> CODEC = MapCodec.unit(BeekeeperHutItemFrameProcessor::new);

	private BeekeeperHutItemFrameProcessor() {
	}

	public StructureTemplate.StructureEntityInfo processEntity(ServerLevelAccessor serverWorldAccess, BlockPos structurePiecePos, BlockPos structurePieceBottomCenterPos, StructureTemplate.StructureEntityInfo localEntityInfo, StructureTemplate.StructureEntityInfo globalEntityInfo, StructurePlaceSettings structurePlacementData) {
		return BeekeeperHutItemFrameProcessorHelper.processEntity(globalEntityInfo, structurePlacementData);
	}

	@Nullable
	public StructureTemplate.@Nullable StructureBlockInfo processBlock(LevelReader world, BlockPos pos, BlockPos pivot, StructureTemplate.StructureBlockInfo localEntityInfo, StructureTemplate.StructureBlockInfo globalEntityInfo, StructurePlaceSettings data) {
		return globalEntityInfo;
	}

	protected StructureProcessorType<?> getType() {
		return ProcessorTypes.BEEKEEPER_HUT_ITEM_FRAME_PROCESSOR.get();
	}
}
