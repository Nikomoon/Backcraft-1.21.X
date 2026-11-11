package net.nikamoon.backcraft.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registry;
import net.minecraft.registry.Registries;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.nikamoon.backcraft.Backcraft;

public class ModBlocks {

    public static final Block PLANK = registerBlock("back_planks",
            new Block(AbstractBlock.Settings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD).burnable()));

    public static final Block BACKSTONE = registerBlock("back_stone",
            new Block(AbstractBlock.Settings.create().requiresTool().strength(1.5F, 6.0F)));

    public static final Block BRICK = registerBlock("back_brick",
            new Block(AbstractBlock.Settings.create().requiresTool().strength(2.0F, 6.0F)));

    public static final Block GEM = registerBlock("back_gem",
            new Block(AbstractBlock.Settings.create().requiresTool().strength(5.0F, 6.0F).sounds(BlockSoundGroup.METAL)));

    public static final Block GROUND = registerBlock("back_ground",
            new Block(AbstractBlock.Settings.create().strength(0.5F).sounds(BlockSoundGroup.GRAVEL)));

    public static final Block LOG = registerBlock("back_log",
            new Block(AbstractBlock.Settings.create().strength(2.0F).sounds(BlockSoundGroup.WOOD).burnable()));

    public static final Block UNDERGROWTH = registerBlock("back_growth",
            new Block(AbstractBlock.Settings.create().strength(0.6F).sounds(BlockSoundGroup.GRASS)));

    public static final Block COBBLE = registerBlock("back_cobble",
            new Block(AbstractBlock.Settings.create().requiresTool().strength(2.0F, 6.0F)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(Backcraft.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(Backcraft.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }


    public static void registermodblocks() {
        Backcraft.LOGGER.info("Registering Mod Blocks for " + Backcraft.MOD_ID);

    }
}
