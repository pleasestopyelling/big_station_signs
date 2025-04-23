package net.cutecharm.bigstationsigns.block.entity;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;

public class BigStationSignBlockEntity extends BlockEntity {

    public BigStationSignBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.BIG_STATION_SIGN_BLOCK_ENTITY, pos, state);
    }


}
