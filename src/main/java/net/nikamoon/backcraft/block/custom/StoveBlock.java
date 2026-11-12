package net.nikamoon.backcraft.block.custom;

import com.mojang.serialization.MapCodec;
import net.minecraft.block.*;
import net.nikamoon.backcraft.block.entity.ModBlockEntities;
import net.nikamoon.backcraft.block.entity.custom.StoveBlockEntity;
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

public class StoveBlock extends FurnaceBlock implements BlockEntityProvider {
    public static final MapCodec<StoveBlock> CODEC = StoveBlock.createCodec(StoveBlock::new);

    public StoveBlock(Settings settings) {
        super(settings);
    }



    @Override
    protected void openScreen(World world, BlockPos pos, PlayerEntity player) {

    }


    @Nullable
    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new StoveBlockEntity(pos, state);
    }

    @Override
    protected BlockRenderType getRenderType(BlockState state) {
        return BlockRenderType.MODEL;
    }

    @Override
    protected void onStateReplaced(BlockState state, World world, BlockPos pos, BlockState newState, boolean moved) {
        if(state.getBlock() != newState.getBlock()) {
            BlockEntity blockEntity = world.getBlockEntity(pos);
            if(blockEntity instanceof StoveBlockEntity) {
                ItemScatterer.spawn(world, pos, ((StoveBlockEntity) blockEntity));
                world.updateComparators(pos, this);
            }
            super.onStateReplaced(state, world, pos, newState, moved);
        }
    }

    @Override
    protected ItemActionResult onUseWithItem(ItemStack stack, BlockState state, World world, BlockPos pos,
                                             PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (!world.isClient) {
            NamedScreenHandlerFactory screenHandlerFactory = ((StoveBlockEntity) world.getBlockEntity(pos));
            if (screenHandlerFactory != null) {
                player.openHandledScreen(screenHandlerFactory);
            }
        }
        return ItemActionResult.SUCCESS;
    }

    @Nullable
    @Override
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
        if(world.isClient()) {
            return null;
        }

        return validateTicker(type, ModBlockEntities.STOVE_BE,
                (world1, pos, state1, blockEntity) -> blockEntity.tick(world1, pos, state1));

    }
}
