package com.faboslav.friendsandfoes.beekeeperhut.forge;

import com.faboslav.friendsandfoes.beekeeperhut.BeekeeperHut;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(BeekeeperHut.MOD_ID)
@Mod.EventBusSubscriber(modid = BeekeeperHut.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public final class BeekeeperHutForge
{
	public BeekeeperHutForge() {
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		bus.addListener(BeekeeperHutForge::init);
	}

	private static void init(final FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			BeekeeperHut.postInit();
		});
	}
}
