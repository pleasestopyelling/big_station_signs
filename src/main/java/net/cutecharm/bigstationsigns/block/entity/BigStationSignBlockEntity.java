package net.cutecharm.bigstationsigns.block.entity;

import net.cutecharm.bigstationsigns.BigStationSigns;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.network.listener.ClientPlayPacketListener;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.s2c.play.BlockEntityUpdateS2CPacket;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import org.jetbrains.annotations.Nullable;

public class BigStationSignBlockEntity extends BlockEntity {

    public Direction facing = Direction.NORTH;
    public String signMessage = "Test Sign Message";

    public BigStationSignBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.BIG_STATION_SIGN_BLOCK_ENTITY, pos, state);
    }
    //direction to render the text
    public Direction getDirection() {
        return facing;
    }

    //save nbt
    @Override
    protected void writeNbt(NbtCompound nbt) {
        int writeDirection = 0;
        switch (facing) {
            case EAST -> writeDirection = 1;
            case SOUTH -> writeDirection = 2;
            case WEST -> writeDirection = 3;
            default -> writeDirection = 0;
        }
        BigStationSigns.LOGGER.info("direction to nbt is " + writeDirection);
        nbt.putInt("direction", writeDirection);
        nbt.putString("message", signMessage);
        super.writeNbt(nbt);
    }

    @Override
    public void readNbt(NbtCompound nbt) {
        signMessage = nbt.getString("message");
        int writeDirection = nbt.getInt("direction");
        BigStationSigns.LOGGER.info("direction from nbt is " + writeDirection);
        if (writeDirection == 1) {
            facing = Direction.EAST;
        } else if (writeDirection == 2) {
            facing = Direction.SOUTH;
        } else if (writeDirection == 3) {
            facing = Direction.WEST;
        } else {
            facing = Direction.NORTH;
        }
        super.readNbt(nbt);
    }

    @Override
    public NbtCompound toInitialChunkDataNbt() {
        return createNbt();
    }

    @Override
    public @Nullable Packet<ClientPlayPacketListener> toUpdatePacket() {
        return BlockEntityUpdateS2CPacket.create(this);
    }
}
