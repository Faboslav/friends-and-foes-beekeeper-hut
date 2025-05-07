package com.faboslav.friendsandfoes.beekeeperhut.world.processor.neoforge;

import com.faboslav.friendsandfoes.beekeeperhut.platform.neoforge.ProcessorTypes;
import com.faboslav.friendsandfoes.beekeeperhut.util.world.processor.BeekeeperHutArmorStandProcessorHelper;
import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureProcessor;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureProcessorType;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import org.jetbrains.annotations.Nullable;

/**
 * Inspired by use in Better Strongholds mod
 *
 * @author YUNGNICKYOUNG
 * <a href="https://github.com/YUNG-GANG/YUNGs-Better-Strongholds">https://github.com/YUNG-GANG/YUNGs-Better-Strongholds</a>
 */
public final class BeekeeperHutArmorStandProcessor extends StructureProcessor
{
	public static final MapCodec<BeekeeperHutArmorStandProcessor> CODEC = MapCodec.unit(BeekeeperHutArmorStandProcessor::new);

	private BeekeeperHutArmorStandProcessor() {
	}

	@Override
	public StructureTemplate.StructureEntityInfo processEntity(
		LevelReader world,
		BlockPos seedPos,
		StructureTemplate.StructureEntityInfo rawEntityInfo,
		StructureTemplate.StructureEntityInfo entityInfo,
		StructurePlaceSettings placementSettings,
		StructureTemplate template
	) {
		return BeekeeperHutArmorStandProcessorHelper.processEntity(
			entityInfo,
			placementSettings
		);
	}

	@Nullable
	@Override
	public StructureTemplate.StructureBlockInfo processBlock(
		LevelReader world,
		BlockPos pos,
		BlockPos pivot,
		StructureTemplate.StructureBlockInfo localEntityInfo,
		StructureTemplate.StructureBlockInfo globalEntityInfo,
		StructurePlaceSettings data
	) {
		return globalEntityInfo;
	}

	@Override
	protected StructureProcessorType<?> getType() {
		return ProcessorTypes.BEEKEEPER_HUT_ARMOR_STAND_PROCESSOR.get();
	}
}