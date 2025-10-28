plugins {
	id("multiloader-common")
	id("fabric-loom")
	id("dev.kikugie.fletching-table.fabric") version "0.1.0-alpha.22"
}

fletchingTable {
	j52j.register("main") {
		extension("json", "**/*.json5")
	}
}

dependencies {
	minecraft(group = "com.mojang", name = "minecraft", version = commonMod.mc)
	mappings(loom.layered {
		officialMojangMappings()
		commonMod.depOrNull("parchment")?.let { parchmentVersion ->
			parchment("org.parchmentmc.data:parchment-${commonMod.mc}:$parchmentVersion@zip")
		}
	})

	modCompileOnly("net.fabricmc:fabric-loader:${commonMod.dep("fabric_loader")}")
	modCompileOnly("com.teamresourceful.resourcefullib:resourcefullib-common-${commonMod.dep("resourceful_lib.mc")}:${commonMod.dep("resourceful_lib.lib")}")
	modCompileOnly(commonMod.modrinth("friends-and-foes", "fabric-${commonMod.dep("friendsandfoes")}+mc${commonMod.mc}"))
}

val commonJava: Configuration by configurations.creating {
	isCanBeResolved = false
	isCanBeConsumed = true
}

val commonResources: Configuration by configurations.creating {
	isCanBeResolved = false
	isCanBeConsumed = true
}

artifacts {
	afterEvaluate {
		val mainSourceSet = sourceSets.main.get()
		mainSourceSet.java.sourceDirectories.files.forEach {
			add(commonJava.name, it)
		}
		mainSourceSet.resources.sourceDirectories.files.forEach {
			add(commonResources.name, it)
		}
	}
}
