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
    public String signMessage = "";
    public boolean signBold = false;
    public boolean signItalic = false;
    public boolean signUnderline = false;
    public BigStationSigns.COLOR signColor = BigStationSigns.COLOR.BLACK;
    public int signWidth = 1;

    //getting the data from the server
    public void setSignMessage(String message) {
        signMessage = message;
    }

    public void setSignColor(int intToColor) {
        if (intToColor == 0) {
            signColor = BigStationSigns.COLOR.WHITE;
        } else if (intToColor == 1) {
            signColor = BigStationSigns.COLOR.LIGHT_GRAY;
        } else if (intToColor == 2) {
            signColor = BigStationSigns.COLOR.GRAY;
        } else if (intToColor == 3) {
            signColor = BigStationSigns.COLOR.BLACK;
        } else if (intToColor == 4) {
            signColor = BigStationSigns.COLOR.BROWN;
        } else if (intToColor == 5) {
            signColor = BigStationSigns.COLOR.RED;
        } else if (intToColor == 6) {
            signColor = BigStationSigns.COLOR.ORANGE;
        } else if (intToColor == 7) {
            signColor = BigStationSigns.COLOR.YELLOW;
        } else if (intToColor == 8) {
            signColor = BigStationSigns.COLOR.LIME;
        } else if (intToColor == 9) {
            signColor = BigStationSigns.COLOR.GREEN;
        } else if (intToColor == 10) {
            signColor = BigStationSigns.COLOR.CYAN;
        } else if (intToColor == 11) {
            signColor = BigStationSigns.COLOR.LIGHT_BLUE;
        } else if (intToColor == 12) {
            signColor = BigStationSigns.COLOR.BLUE;
        } else if (intToColor == 13) {
            signColor = BigStationSigns.COLOR.PURPLE;
        } else if (intToColor == 14) {
            signColor = BigStationSigns.COLOR.MAGENTA;
        } else {
            signColor = BigStationSigns.COLOR.PINK;
        }
    }

    public void setSignBold(boolean bold) {
        signBold = bold;
    }
    public void setSignItalic(boolean italic) {
        signItalic = italic;
    }
    public void setSignUnderline(boolean underline) {
        signUnderline = underline;
    }

    public BigStationSignBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.BIG_STATION_SIGN_BLOCK_ENTITY, pos, state);
    }

    public void setSignWidth(int width) {
        signWidth = width;
    }
    //direction to render the text
    public Direction getDirection() {
        return facing;
    }

    //save nbt
    @Override
    protected void writeNbt(NbtCompound nbt) {
        int colorToInteger = 0;
        switch (signColor) {
            case WHITE -> colorToInteger = 0;
            case LIGHT_GRAY -> colorToInteger = 1;
            case GRAY -> colorToInteger = 2;
            case BLACK -> colorToInteger = 3;
            case BROWN -> colorToInteger = 4;
            case RED -> colorToInteger = 5;
            case ORANGE -> colorToInteger = 6;
            case YELLOW -> colorToInteger = 7;
            case LIME -> colorToInteger = 8;
            case GREEN -> colorToInteger = 9;
            case CYAN -> colorToInteger = 10;
            case LIGHT_BLUE -> colorToInteger = 11;
            case BLUE -> colorToInteger = 12;
            case PURPLE -> colorToInteger = 13;
            case MAGENTA -> colorToInteger = 14;
            case PINK -> colorToInteger = 15;
        }
        int writeDirection = 0;
        switch (facing) {
            case EAST -> writeDirection = 1;
            case SOUTH -> writeDirection = 2;
            case WEST -> writeDirection = 3;
            default -> writeDirection = 0;
        }
        nbt.putInt("direction", writeDirection);
        nbt.putInt("width", signWidth);
        nbt.putString("message", signMessage);
        nbt.putInt("color_index", colorToInteger);
        nbt.putBoolean("bold", signBold);
        nbt.putBoolean("italic", signItalic);
        nbt.putBoolean("underline", signUnderline);
        super.writeNbt(nbt);
    }

    @Override
    public void readNbt(NbtCompound nbt) {
        signMessage = nbt.getString("message");
        int writeDirection = nbt.getInt("direction");
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
        setSignColor(nbt.getInt("color_index"));
        signBold = nbt.getBoolean("bold");
        signItalic = nbt.getBoolean("italic");
        signUnderline = nbt.getBoolean("underline");
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
