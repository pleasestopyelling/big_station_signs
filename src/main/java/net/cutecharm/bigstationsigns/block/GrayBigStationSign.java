package net.cutecharm.bigstationsigns.block;

import net.cutecharm.bigstationsigns.BigStationSigns;
import net.cutecharm.bigstationsigns.block.entity.BigStationSignBlockEntity;
import net.cutecharm.bigstationsigns.screen.BigStationSignScreen;
import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.Properties;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import org.jetbrains.annotations.Nullable;

import static java.lang.Math.min;

public class GrayBigStationSign extends HorizontalFacingBlock implements BlockEntityProvider {

    protected GrayBigStationSign(Settings settings) {
        super(settings);
        setDefaultState(getDefaultState()
                .with(Properties.HORIZONTAL_FACING, Direction.NORTH)
                .with(Properties.NORTH, false)
                .with(Properties.EAST, false)
                .with(Properties.SOUTH, false)
                .with(Properties.WEST, false)
        );
    }


    //directional block placement settings(from HorizontalFacingBlock)
    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(Properties.HORIZONTAL_FACING, Properties.NORTH, Properties.EAST, Properties.SOUTH, Properties.WEST);
    }

    @Override
    public BlockRenderType getRenderType(BlockState state) {
        return BlockRenderType.MODEL;
    }

    //selection outline of the block (it is non collidable)
    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        Direction direction = state.get(FACING);
        return switch(direction) {
            case NORTH -> Block.createCuboidShape(0,1,14,16,15,16);
            case EAST -> Block.createCuboidShape(0,1,0,2,15,16);
            case SOUTH -> Block.createCuboidShape(0,1,0,16,15,2);
            case WEST -> Block.createCuboidShape(14,1,0,16,15,16);
            default -> VoxelShapes.fullCube();
        };
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        Direction facing = state.get(FACING);
        BlockPos checkPos = pos;
        BigStationSignBlockEntity blockEntity = (BigStationSignBlockEntity) world.getBlockEntity(pos);
        int width1 = 0;
        int width2 = 0;
        switch (facing) {
            case NORTH, SOUTH -> {
                while (world.getBlockEntity(checkPos) instanceof BigStationSignBlockEntity) {
                    checkPos = checkPos.add(1,0,0);
                    width1 += 1;
                }
                checkPos = pos;
                while (world.getBlockEntity(checkPos) instanceof BigStationSignBlockEntity) {
                    checkPos = checkPos.add(-1,0,0);
                    width2 += 1;
                }
                blockEntity.signWidth = min(width2,width1);
            }
            case EAST, WEST -> {
            while (world.getBlockEntity(checkPos) instanceof BigStationSignBlockEntity) {
                checkPos = checkPos.add(0,0,1);
                width1 += 1;
            }
            checkPos = pos;
            while (world.getBlockEntity(checkPos) instanceof BigStationSignBlockEntity) {
                checkPos = checkPos.add(0,0,-1);
                width2 += 1;
            }
            blockEntity.signWidth = min(width2,width1);
        }

        }
        if (!world.isClient) {
            return ActionResult.SUCCESS;
        }
        if (world.getBlockEntity(pos) instanceof BigStationSignBlockEntity entity) {
            BigStationSignScreen.openEditScreen(entity);

        }
        return ActionResult.SUCCESS;
    }

    @Override
    public void onPlaced(World world, BlockPos pos, BlockState state, @Nullable LivingEntity placer, ItemStack itemStack) {
        super.onPlaced(world, pos, state, placer, itemStack);
        BigStationSignBlockEntity blockEntity = (BigStationSignBlockEntity) world.getBlockEntity(pos);
        //blockEntity.facing = placer.getHorizontalFacing().getOpposite();
        blockEntity.facing = state.get(FACING);
        blockEntity.markDirty();

    }


    @Override
    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        Direction facing = state.get(FACING);
        boolean placeConnectionNorth = false;
        boolean placeConnectionEast = false;
        boolean placeConnectionSouth = false;
        boolean placeConnectionWest = false;
        Block neighboringBlock = Blocks.AIR;
        Block neighboringBlock2 = Blocks.AIR;
        //slightly nicer way of writing the getPlacementState because yes


        switch(facing) {
            case NORTH, SOUTH -> {
                BlockPos neighboringBlockPos = pos.add(1,0,0);
                BlockPos neighboringBlockPos2 = pos.add(-1,0,0);
                neighboringBlock = world.getBlockState(neighboringBlockPos).getBlock();
                neighboringBlock2 = world.getBlockState(neighboringBlockPos2).getBlock();
                if (neighboringBlock instanceof GrayBigStationSign) {
                    placeConnectionEast = true;
                }
                if (neighboringBlock2 instanceof GrayBigStationSign) {
                    placeConnectionWest = true;
                }
            }
            case EAST, WEST -> {
                BlockPos neighboringBlockPos = pos.add(0,0,1);
                BlockPos neighboringBlockPos2 = pos.add(0,0,-1);
                neighboringBlock = world.getBlockState(neighboringBlockPos).getBlock();
                neighboringBlock2 = world.getBlockState(neighboringBlockPos2).getBlock();
                if (neighboringBlock instanceof GrayBigStationSign) {
                    placeConnectionSouth = true;
                }
                if (neighboringBlock2 instanceof GrayBigStationSign) {
                    placeConnectionNorth = true;
                }
            }
        }


        return super.getStateForNeighborUpdate(state, direction, neighborState, world, pos, neighborPos)
                .with(Properties.NORTH,placeConnectionNorth)
                .with(Properties.EAST,placeConnectionEast)
                .with(Properties.SOUTH,placeConnectionSouth)
                .with(Properties.WEST,placeConnectionWest);
    }

    @Override
    public @Nullable BlockState getPlacementState(ItemPlacementContext ctx) {
        Direction playerFacing = ctx.getHorizontalPlayerFacing().getOpposite();
        return super.getPlacementState(ctx)
                  .with(Properties.HORIZONTAL_FACING, playerFacing);
    }

    //Puts the block entity at the block
    @Override
    public @Nullable BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new BigStationSignBlockEntity(pos, state);
    }


}
