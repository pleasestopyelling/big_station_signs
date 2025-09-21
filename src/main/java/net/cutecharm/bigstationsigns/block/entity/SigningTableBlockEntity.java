package net.cutecharm.bigstationsigns.block.entity;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;

public class SigningTableBlockEntity extends BlockEntity {
    public SigningTableBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.SIGNING_TABLE_BLOCK_ENTITY, pos, state);
    }
}
