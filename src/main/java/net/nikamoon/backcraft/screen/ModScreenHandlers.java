package net.nikamoon.backcraft.screen;

import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerType;
import net.nikamoon.backcraft.Backcraft;
import net.nikamoon.backcraft.screen.custom.StoveScreenHandler;
import net.nikamoon.backcraft.screen.custom.TableScreenHandler;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;

public class ModScreenHandlers {


    public static final ScreenHandlerType<TableScreenHandler> TABLE_SCREEN_HANDLER =
            Registry.register(Registries.SCREEN_HANDLER, Identifier.of(Backcraft.MOD_ID, "table_screen_handler"),
                    new ExtendedScreenHandlerType<>(TableScreenHandler::new, BlockPos.PACKET_CODEC));
    public static final ScreenHandlerType<StoveScreenHandler> STOVE_SCREEN_HANDLER =
            Registry.register(Registries.SCREEN_HANDLER, Identifier.of(Backcraft.MOD_ID, "stove_screen_handler"),
                    new ExtendedScreenHandlerType<>(StoveScreenHandler::new, BlockPos.PACKET_CODEC));


    public static void registerScreenHandlers() {
        Backcraft.LOGGER.info("Registering Screen Handlers for " + Backcraft.MOD_ID);
    }
}
