package net.cutecharm.bigstationsigns.block;

import net.cutecharm.bigstationsigns.block.entity.SigningTableBlockEntity;
import net.minecraft.block.Block;
import net.minecraft.block.BlockEntityProvider;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;
import org.jetbrains.annotations.Nullable;

public class SigningTable extends Block implements BlockEntityProvider {


    public SigningTable(Settings settings) {
        super(settings);
    }

    @Override
    public @Nullable BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new SigningTableBlockEntity(pos,state);
    }
}
