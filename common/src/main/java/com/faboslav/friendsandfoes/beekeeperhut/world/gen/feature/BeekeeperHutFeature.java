package com.faboslav.friendsandfoes.beekeeperhut.world.gen.feature;

import com.faboslav.friendsandfoes.beekeeperhut.BeekeeperHut;
import com.mojang.serialization.Codec;
import net.minecraft.structure.StructureGeneratorFactory.Context;
import net.minecraft.structure.StructureSetKeys;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.JigsawFeature;
import net.minecraft.world.gen.feature.StructurePoolFeatureConfig;
import net.minecraft.world.gen.random.AtomicSimpleRandom;
import net.minecraft.world.gen.random.ChunkRandom;

public final class BeekeeperHutFeature extends JigsawFeature
{
	public BeekeeperHutFeature(Codec<StructurePoolFeatureConfig> configCodec) {
		super(configCodec, 0, true, true, BeekeeperHutFeature::canGenerate);
	}

	private static boolean canGenerate(Context<StructurePoolFeatureConfig> context) {

		return BeekeeperHut.getConfig().generateBeekeeperHutStructure
			   && isPillagerOutpostNearby(context) == false
			   && isSuitableChunk(context);
	}

	private static boolean isPillagerOutpostNearby(Context<StructurePoolFeatureConfig> context) {
		int chunkPosX = context.chunkPos().x;
		int chunkPosZ = context.chunkPos().z;

		return context.chunkGenerator().method_41053(
			StructureSetKeys.PILLAGER_OUTPOSTS,
			context.seed(),
			chunkPosX,
			chunkPosZ,
			10
		);
	}

	private static boolean isSuitableChunk(Context<StructurePoolFeatureConfig> context) {
		int i = context.chunkPos().x >> 4;
		int j = context.chunkPos().z >> 4;

		ChunkRandom chunkRandom = new ChunkRandom(new AtomicSimpleRandom(0L));
		chunkRandom.setSeed((long) (i ^ j << 4) ^ context.seed());
		chunkRandom.nextInt();

		return chunkRandom.nextInt(2) == 0;
	}

	@Override
	public GenerationStep.Feature getGenerationStep() {
		return GenerationStep.Feature.SURFACE_STRUCTURES;
	}
}