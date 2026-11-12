package net.nikamoon.backcraft;

import net.fabricmc.api.ModInitializer;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
import net.nikamoon.backcraft.block.ModBlocks;
import net.nikamoon.backcraft.block.entity.ModBlockEntities;
import net.nikamoon.backcraft.item.ModItemGroups;
import net.nikamoon.backcraft.item.ModItems;
import net.nikamoon.backcraft.screen.ModScreenHandlers;
import net.nikamoon.backcraft.screen.custom.StoveScreen;
import net.nikamoon.backcraft.screen.custom.TableScreen;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Backcraft implements ModInitializer {
	public static final String MOD_ID = "backcraft";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		HandledScreens.register(ModScreenHandlers.TABLE_SCREEN_HANDLER, TableScreen::new);
		HandledScreens.register(ModScreenHandlers.STOVE_SCREEN_HANDLER, StoveScreen::new);
		ModItemGroups.registerItemGroups();

		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModBlockEntities.registerBlockEntities();
		ModScreenHandlers.registerScreenHandlers();

	}
}