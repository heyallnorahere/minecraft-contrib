package net.ys1219;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ContribMod implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("minecraftcontrib");

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
	}
}