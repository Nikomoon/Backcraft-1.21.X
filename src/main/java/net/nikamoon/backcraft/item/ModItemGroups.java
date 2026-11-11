package net.nikamoon.backcraft.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.nikamoon.backcraft.Backcraft;
import net.nikamoon.backcraft.block.ModBlocks;

public class ModItemGroups {
    public static final ItemGroup BACKCRAFT_ITEMS = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Backcraft.MOD_ID, "backcraft_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.PLANK))
                    .displayName(Text.translatable("itemgroup.backcraft.back_craft_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.PLANK);
                        entries.add(ModBlocks.BRICK);
                        entries.add(ModBlocks.GEM);
                        entries.add(ModBlocks.LOG);
                        entries.add(ModBlocks.GROUND);
                        entries.add(ModBlocks.UNDERGROWTH);
                        entries.add(ModBlocks.BACKSTONE);
                        entries.add(ModBlocks.COBBLE);

                    }).build());



    public static void registerItemGroups() {
        Backcraft.LOGGER.info("Registering Item Groups for " + Backcraft.MOD_ID);
    }

}
