package com.faboslav.friendsandfoes.beekeeperhut.platform;

import java.util.ServiceLoader;

public final class PlatformHooks
{
	public static final ProcessorTypes PROCESSOR_TYPES = load(ProcessorTypes.class);

	public static <T> T load(Class<T> service) {
		T loadedService = ServiceLoader.load(service)
			.findFirst()
			.orElseThrow(() -> new NullPointerException("No implementation found for " + service.getName()));
		return loadedService;
	}
}
