package com.faboslav.friendsandfoes.beekeeperhut.init;

import com.faboslav.friendsandfoes.beekeeperhut.BeekeeperHut;
import com.faboslav.friendsandfoes.beekeeperhut.mixin.StructureFeatureAccessor;
import com.faboslav.friendsandfoes.beekeeperhut.world.gen.feature.BeekeeperHutFeature;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.StructureFeature;
import net.minecraft.world.gen.feature.StructurePoolFeatureConfig;

public final class ModStructureFeatures
{
	private static final DeferredRegister<StructureFeature<?>> STRUCTURE_FEATURES = DeferredRegister.create(BeekeeperHut.MOD_ID, Registry.STRUCTURE_FEATURE_KEY);

	public static final RegistrySupplier<StructureFeature<StructurePoolFeatureConfig>> BEEKEEPER_HUT;

	static {
		BEEKEEPER_HUT = STRUCTURE_FEATURES.register("beekeeper_hut", () -> new BeekeeperHutFeature(StructurePoolFeatureConfig.CODEC));
	}

	public static void initRegister() {
		STRUCTURE_FEATURES.register();
	}

	public static void init() {
		initFeatureSteps();
	}

	private static void initFeatureSteps() {
		StructureFeatureAccessor.getStructureToGenerationStep().put(BEEKEEPER_HUT.get(), GenerationStep.Feature.SURFACE_STRUCTURES);
	}

	private ModStructureFeatures() {
	}
}
