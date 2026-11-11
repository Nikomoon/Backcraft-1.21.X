package net.nikamoon.backcraft;

import net.fabricmc.api.ModInitializer;

import net.nikamoon.backcraft.block.ModBlocks;
import net.nikamoon.backcraft.item.ModItemGroups;
import net.nikamoon.backcraft.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Backcraft implements ModInitializer {
	public static final String MOD_ID = "backcraft";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registermodblocks();
	}
}