package com.faboslav.friendsandfoes.beekeeperhut.world.processor.neoforge;

import com.faboslav.friendsandfoes.beekeeperhut.platform.neoforge.ProcessorTypes;
import com.faboslav.friendsandfoes.beekeeperhut.util.world.processor.BeekeeperHutArmorStandProcessorHelper;
import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureProcessor;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import org.jetbrains.annotations.Nullable;

//? if <26.2 {
/*import net.minecraft.world.level.levelgen.structure.templatesystem.StructureProcessorType;
 *///?}

//? if >=26.2 {
public final class BeekeeperHutArmorStandProcessor implements StructureProcessor
//?} else {
/*public final class BeekeeperHutArmorStandProcessor extends StructureProcessor
*///?}
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