package net.nikamoon.backcraft.block.custom;

import com.mojang.serialization.MapCodec;
import net.minecraft.block.*;
import net.nikamoon.backcraft.block.entity.ModBlockEntities;
import net.nikamoon.backcraft.block.entity.custom.StoveBlockOnEntity;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityTicker;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.util.Hand;
import net.minecraft.util.ItemActionResult;
import net.minecraft.util.ItemScatterer;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class StoveBlockOn extends FurnaceBlock implements BlockEntityProvider {
    public static final MapCodec<StoveBlockOn> CODEC = StoveBlockOn.createCodec(StoveBlockOn::new);

    public StoveBlockOn(Settings settings) {
        super(settings);
    }


    @Override
    protected void openScreen(World world, BlockPos pos, PlayerEntity player) {

    }


    @Nullable
    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new StoveBlockOnEntity(pos, state);
    }

    @Override
    protected BlockRenderType getRenderType(BlockState state) {
        return BlockRenderType.MODEL;
    }


}
