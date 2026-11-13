package net.nikamoon.backcraft.block;

import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.block.*;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registry;
import net.minecraft.registry.Registries;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.nikamoon.backcraft.Backcraft;
import net.nikamoon.backcraft.block.custom.*;

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
            new PillarBlock(AbstractBlock.Settings.create().strength(2.0F).sounds(BlockSoundGroup.WOOD).burnable()));

    public static final Block UNDERGROWTH = registerBlock("back_growth",
            new Block(AbstractBlock.Settings.create().strength(0.6F).sounds(BlockSoundGroup.GRASS)));

    public static final Block COBBLE = registerBlock("back_cobble",
            new Block(AbstractBlock.Settings.create().requiresTool().strength(2.0F, 6.0F)));

    public static final Block BACK_FURNACE = registerBlock("back_furnace",
            new FurnaceBlock(AbstractBlock.Settings.create().requiresTool().strength(2.0F, 6.0F)));

    public static final Block TILE = registerBlock("back_tile",
            new Block(AbstractBlock.Settings.create().strength(0.15F).sounds(BlockSoundGroup.WOOD).burnable()));

    public static final Block STONE_TILE = registerBlock("back_stone_tile",
            new Block(AbstractBlock.Settings.create().requiresTool().strength(0.20F).sounds(BlockSoundGroup.STONE)));

    public static final Block SKIRTING = registerBlock("back_skirting",
            new Block(AbstractBlock.Settings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD).burnable()));

    public static final Block SKIRTING_CORNER_RIGHT = registerBlock("back_skirting_corner_right",
            new Block(AbstractBlock.Settings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD).burnable()));

    public static final Block SKIRTING_CORNER_LEFT = registerBlock("back_skirting_corner_left",
            new Block(AbstractBlock.Settings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD).burnable()));

    public static final Block SKIRTING_CORNER_U = registerBlock("back_skirting_corner_u",
            new Block(AbstractBlock.Settings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD).burnable()));

    public static final Block SKIRTING_CIRCLE = registerBlock("back_skirting_circle",
            new Block(AbstractBlock.Settings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD).burnable()));

    public static final Block SKIRTING_LEFT = registerBlock("back_skirting_left_side",
            new Block(AbstractBlock.Settings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD).burnable()));

    public static final Block SKIRTING_RIGHT = registerBlock("back_skirting_right_side",
            new Block(AbstractBlock.Settings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD).burnable()));

    public static final Block SKIRTING_UP = registerBlock("back_skirting_up_side",
            new Block(AbstractBlock.Settings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD).burnable()));

    public static final Block SKIRTING_CORNER_UP_LEFT = registerBlock("back_skirting_corner_up_left",
            new Block(AbstractBlock.Settings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD).burnable()));

    public static final Block SKIRTING_CORNER_UP_RIGHT = registerBlock("back_skirting_corner_up_right",
            new Block(AbstractBlock.Settings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD).burnable()));

    public static final Block SKIRTING_CORNER_DOWN_LEFT = registerBlock("back_skirting_corner_down_left",
            new Block(AbstractBlock.Settings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD).burnable()));

    public static final Block SKIRTING_CORNER_DOWN_RIGHT = registerBlock("back_skirting_corner_down_right",
            new Block(AbstractBlock.Settings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD).burnable()));

    public static final Block FLOWER = registerBlock(
            "back_flower",
            new FlowerBlock(
                    StatusEffects.SATURATION,
                    0.35F,
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DARK_GREEN)
                            .noCollision()
                            .breakInstantly()
                            .sounds(BlockSoundGroup.GRASS)
                            .offset(AbstractBlock.OffsetType.XZ)
                            .pistonBehavior(PistonBehavior.DESTROY)
            )
    );

    public static final Block STOVE_ON = registerBlock("back_stove_on",
            new StoveBlockOn(AbstractBlock.Settings.create()
                    .requiresTool()
                    .strength(3.5F)
            ));


    public static final Block BACK_CRAFTING_TABLE = registerBlock("back_crafting_table",
            new BackCraftingTableBlock(AbstractBlock.Settings.create().strength(2.5F).sounds(BlockSoundGroup.WOOD).burnable()));

    public static final Block BACK_DOOR = registerBlock("back_door",
            new DoorBlock(BlockSetType.OAK,
                    AbstractBlock.Settings.create()
                            .instrument(NoteBlockInstrument.BASS)
                            .strength(3.0F)
                            .burnable()
                            .pistonBehavior(PistonBehavior.DESTROY)
            )
    );

    public static final Block TABLE = registerBlock("back_table",
            new TableBlock(AbstractBlock.Settings.create().strength(2.5F).sounds(BlockSoundGroup.WOOD).burnable()));

    public static final Block HALF_DOOR = registerBlock("back_half_door",
            new HalfDoor(BlockSetType.OAK,
                    AbstractBlock.Settings.create()
                            .instrument(NoteBlockInstrument.BASS)
                            .strength(3.0F)
                            .burnable()
                            .pistonBehavior(PistonBehavior.DESTROY)
            )
    );

    public static final Block STOVE = registerBlock("back_stove",
            new StoveBlock(			AbstractBlock.Settings.create()
                    .requiresTool()
                    .strength(3.5F)
            )
    );



    private static Block registerBlockWithoutBlockItem(String name, Block block) {
        return Registry.register(Registries.BLOCK, Identifier.of(Backcraft.MOD_ID, name), block);
    }

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(Backcraft.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(Backcraft.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        Backcraft.LOGGER.info("Registering Mod Blocks for " + Backcraft.MOD_ID);

    }
}
