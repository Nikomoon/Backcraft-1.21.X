package net.nikamoon.backcraft.block.custom;

import com.mojang.serialization.MapCodec;
import net.minecraft.block.*;
import net.nikamoon.backcraft.block.entity.custom.StoveBlockOnEntity;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class StoveBlockOn extends FurnaceBlock implements BlockEntityProvider {
    public static final MapCodec<StoveBlockOn> CODEC = StoveBlockOn.createCodec(StoveBlockOn::new);

    public StoveBlockOn(Settings settings) {
        super(settings);
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
