package com.faboslav.friendsandfoes.beekeeperhut.forge;

import com.faboslav.friendsandfoes.beekeeperhut.BeekeeperHut;
import com.faboslav.friendsandfoes.beekeeperhut.platform.forge.RegistryHelperImpl;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(BeekeeperHut.MOD_ID)
@Mod.EventBusSubscriber(modid = BeekeeperHut.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public final class BeekeeperHutForge
{
	public BeekeeperHutForge() {
		BeekeeperHut.init();

		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

		RegistryHelperImpl.STRUCTURE_PROCESSOR_TYPES.register(bus);

		MinecraftForge.EVENT_BUS.register(this);
	}
}
