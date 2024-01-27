package net.ys1219.minecraftcontrib;

import net.fabricmc.api.ModInitializer;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.ys1219.minecraftcontrib.items.Wooper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ContribMod implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("minecraftcontrib");

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");

		Registry.register(Registries.ITEM, "minecraftcontrib:wooper", Wooper.INSTANCE);
	}
}