package net.cutecharm.bigstationsigns.block;

import net.cutecharm.bigstationsigns.block.entity.BigStationSignBlockEntity;
import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import org.jetbrains.annotations.Nullable;

public class GrayBigStationSign extends HorizontalFacingBlock implements BlockEntityProvider {

    protected GrayBigStationSign(Settings settings) {
        super(settings);
        setDefaultState(getDefaultState().with(Properties.HORIZONTAL_FACING, Direction.NORTH));
    }

    //directional block placement settings(from HorizontalFacingBlock)
    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(Properties.HORIZONTAL_FACING);
    }

    @Override
    public BlockRenderType getRenderType(BlockState state) {
        return BlockRenderType.MODEL;
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        Direction direction = state.get(FACING);
        return switch(direction) {
            case NORTH -> Block.createCuboidShape(0,1,15,16,15,16);
            case EAST -> Block.createCuboidShape(0,1,0,1,15,16);
            case SOUTH -> Block.createCuboidShape(0,1,0,16,15,1);
            case WEST -> Block.createCuboidShape(15,1,0,16,15,16);
            default -> VoxelShapes.fullCube();
        };
    }

    @Override
    public @Nullable BlockState getPlacementState(ItemPlacementContext ctx) {
        return super.getPlacementState(ctx).with(Properties.HORIZONTAL_FACING, ctx.getHorizontalPlayerFacing().getOpposite());
    }

    //Puts the block entity at the block
    @Override
    public @Nullable BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new BigStationSignBlockEntity(pos, state);
    }

    //Opens gui



}
