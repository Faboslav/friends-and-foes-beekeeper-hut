package com.faboslav.friendsandfoes.beekeeperhut.platform.forge;

import com.faboslav.friendsandfoes.beekeeperhut.platform.ConfigDirectory;
import net.minecraftforge.fml.loading.FMLPaths;

import java.nio.file.Path;

public final class ConfigDirectoryImpl
{
	/**
	 * @see ConfigDirectory#getConfigDirectory()
	 */
	public static Path getConfigDirectory() {
		return FMLPaths.CONFIGDIR.get();
	}
}
