package net.cutecharm.bigstationsigns.block.entity;


import net.cutecharm.bigstationsigns.BigStationSigns;
import net.cutecharm.bigstationsigns.block.GrayBigStationSign;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalFacingBlock;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;

public class BigStationSignBlockEntity extends BlockEntity {

    public Direction facing = Direction.NORTH;

    public BigStationSignBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.BIG_STATION_SIGN_BLOCK_ENTITY, pos, state);
    }

    public Direction getDirection() {
        return facing;
    }


}
