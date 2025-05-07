package com.faboslav.friendsandfoes.beekeeperhut.util.world.processor;

import com.faboslav.friendsandfoes.common.versions.VersionedNbt;
import net.minecraft.Util;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate.StructureEntityInfo;

/**
 * Inspired by use in Better Strongholds mod
 *
 * @author YUNGNICKYOUNG
 * <a href="https://github.com/YUNG-GANG/YUNGs-Better-Strongholds">https://github.com/YUNG-GANG/YUNGs-Better-Strongholds</a>
 */
public final class BeekeeperHutItemFrameProcessorHelper
{
	public static StructureEntityInfo processEntity(
		StructureEntityInfo globalEntityInfo,
		StructurePlaceSettings structurePlacementData
	) {
		if (!globalEntityInfo.nbt.getString("id").equals("minecraft:item_frame")) {
			return globalEntityInfo;
		}

		RandomSource random = structurePlacementData.getRandom(globalEntityInfo.blockPos);
		CompoundTag newNbt = globalEntityInfo.nbt.copy();
		int randomRotation = random.nextInt(8);
		newNbt.putByte("ItemRotation", (byte) randomRotation);

		globalEntityInfo = new StructureEntityInfo(globalEntityInfo.pos, globalEntityInfo.blockPos, newNbt);

		return globalEntityInfo;
	}
}
