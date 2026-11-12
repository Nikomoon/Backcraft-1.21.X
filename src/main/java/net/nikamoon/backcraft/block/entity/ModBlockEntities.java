package net.nikamoon.backcraft.block.entity;

import net.nikamoon.backcraft.Backcraft;
import net.nikamoon.backcraft.block.ModBlocks;
import net.nikamoon.backcraft.block.entity.custom.StoveBlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.nikamoon.backcraft.block.entity.custom.TableBlockEntity;

public class ModBlockEntities {

    public static final BlockEntityType<TableBlockEntity> TABLE_BE =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(Backcraft.MOD_ID, "table_be"),
                    BlockEntityType.Builder.create(TableBlockEntity::new, ModBlocks.TABLE).build(null));
    public static final BlockEntityType<StoveBlockEntity> STOVE_BE =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(Backcraft.MOD_ID, "stove_be"),
                    BlockEntityType.Builder.create(StoveBlockEntity::new, ModBlocks.STOVE).build(null));


    public static void registerBlockEntities() {
        Backcraft.LOGGER.info("Registering Block Entities for " + Backcraft.MOD_ID);
    }
}
