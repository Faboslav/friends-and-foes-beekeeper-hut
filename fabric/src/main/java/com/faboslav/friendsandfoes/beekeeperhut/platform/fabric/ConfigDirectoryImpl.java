package com.faboslav.friendsandfoes.beekeeperhut.platform.fabric;

import com.faboslav.friendsandfoes.beekeeperhut.platform.ConfigDirectory;
import net.fabricmc.loader.api.FabricLoader;

import java.nio.file.Path;

public final class ConfigDirectoryImpl
{
	/**
	 * @see ConfigDirectory#getConfigDirectory()
	 */
	public static Path getConfigDirectory() {
		return FabricLoader.getInstance().getConfigDir();
	}
}
