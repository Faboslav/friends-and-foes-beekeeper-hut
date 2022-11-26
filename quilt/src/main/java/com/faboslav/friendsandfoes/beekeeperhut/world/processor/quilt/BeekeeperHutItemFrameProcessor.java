package com.faboslav.friendsandfoes.beekeeperhut.world.processor.quilt;

import com.faboslav.friendsandfoes.beekeeperhut.platform.fabric.StructureEntityProcessorTypesImpl;
import com.faboslav.friendsandfoes.beekeeperhut.util.world.processor.BeekeeperHutItemFrameProcessorHelper;
import com.faboslav.friendsandfoes.beekeeperhut.world.processor.StructureEntityProcessor;
import com.mojang.serialization.Codec;
import net.minecraft.structure.StructurePlacementData;
import net.minecraft.structure.StructureTemplate;
import net.minecraft.structure.StructureTemplate.StructureEntityInfo;
import net.minecraft.structure.processor.StructureProcessorType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.ServerWorldAccess;
import net.minecraft.world.WorldView;
import org.jetbrains.annotations.Nullable;

/**
 * Inspired by use in Better Strongholds by
 * YUNGNICKYOUNG (https://github.com/YUNG-GANG/YUNGs-Better-Strongholds)
 */
public final class BeekeeperHutItemFrameProcessor extends StructureEntityProcessor
{
	public static final BeekeeperHutItemFrameProcessor INSTANCE = new BeekeeperHutItemFrameProcessor();
	public static final Codec<BeekeeperHutItemFrameProcessor> CODEC = Codec.unit(() -> INSTANCE);

	@Override
	public StructureEntityInfo processEntity(
		ServerWorldAccess serverWorldAccess,
		BlockPos structurePiecePos,
		BlockPos structurePieceBottomCenterPos,
		StructureEntityInfo localEntityInfo,
		StructureEntityInfo globalEntityInfo,
		StructurePlacementData structurePlacementData
	) {
		return BeekeeperHutItemFrameProcessorHelper.processEntity(
			globalEntityInfo,
			structurePlacementData
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
		return StructureEntityProcessorTypesImpl.BEEKEEPER_HUT_ITEM_FRAME_PROCESSOR;
	}
}
