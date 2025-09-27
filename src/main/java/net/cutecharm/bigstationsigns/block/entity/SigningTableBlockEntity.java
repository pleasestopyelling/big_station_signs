package net.cutecharm.bigstationsigns.block.entity;

import net.cutecharm.bigstationsigns.BigStationSigns;
import net.cutecharm.bigstationsigns.block.ModBlocks;
import net.cutecharm.bigstationsigns.item.ModItems;
import net.cutecharm.bigstationsigns.screen.SigningTableScreenHandler;
import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerFactory;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.screen.PropertyDelegate;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class SigningTableBlockEntity extends BlockEntity implements ExtendedScreenHandlerFactory, ImplementedInventory {

    private int whiteDyeLevel = 0;
    private int lightGrayDyeLevel = 0;
    private int grayDyeLevel = 0;
    private int blackDyeLevel = 0;
    private int brownDyeLevel = 0;
    private int redDyeLevel = 0;
    private int orangeDyeLevel = 0;
    private int yellowDyeLevel = 0;
    private int limeDyeLevel = 0;
    private int greenDyeLevel = 0;
    private int cyanDyeLevel = 0;
    private int lightBlueDyeLevel = 0;
    private int blueDyeLevel = 0;
    private int purpleDyeLevel = 0;
    private int magentaDyeLevel = 0;
    private int pinkDyeLevel = 0;
    private int signingTablePreset = 0;
    private boolean signingCraftTask = false;

    private boolean dyeLevelCheck = false;
    protected final PropertyDelegate propertyDelegate;

    public SigningTableBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.SIGNING_TABLE_BLOCK_ENTITY, pos, state);
        this.propertyDelegate = new PropertyDelegate() {
            @Override
            public int get(int index) {
                return switch (index) {
                    case 0 -> SigningTableBlockEntity.this.whiteDyeLevel;
                    case 1 -> SigningTableBlockEntity.this.lightGrayDyeLevel;
                    case 2 -> SigningTableBlockEntity.this.grayDyeLevel;
                    case 3 -> SigningTableBlockEntity.this.blackDyeLevel;
                    case 4 -> SigningTableBlockEntity.this.brownDyeLevel;
                    case 5 -> SigningTableBlockEntity.this.redDyeLevel;
                    case 6 -> SigningTableBlockEntity.this.orangeDyeLevel;
                    case 7 -> SigningTableBlockEntity.this.yellowDyeLevel;
                    case 8 -> SigningTableBlockEntity.this.limeDyeLevel;
                    case 9 -> SigningTableBlockEntity.this.greenDyeLevel;
                    case 10 -> SigningTableBlockEntity.this.cyanDyeLevel;
                    case 11 -> SigningTableBlockEntity.this.lightBlueDyeLevel;
                    case 12 -> SigningTableBlockEntity.this.blueDyeLevel;
                    case 13 -> SigningTableBlockEntity.this.purpleDyeLevel;
                    case 14 -> SigningTableBlockEntity.this.magentaDyeLevel;
                    case 15 -> SigningTableBlockEntity.this.pinkDyeLevel;
                    default -> 0;
                };
            }

            @Override
            public void set(int index, int value) {
                switch (index) {
                    case 0 -> SigningTableBlockEntity.this.whiteDyeLevel = value;
                    case 1 -> SigningTableBlockEntity.this.lightGrayDyeLevel = value;
                    case 2 -> SigningTableBlockEntity.this.grayDyeLevel = value;
                    case 3 -> SigningTableBlockEntity.this.blackDyeLevel = value;
                    case 4 -> SigningTableBlockEntity.this.brownDyeLevel = value;
                    case 5 -> SigningTableBlockEntity.this.redDyeLevel = value;
                    case 6 -> SigningTableBlockEntity.this.orangeDyeLevel = value;
                    case 7 -> SigningTableBlockEntity.this.yellowDyeLevel = value;
                    case 8 -> SigningTableBlockEntity.this.limeDyeLevel = value;
                    case 9 -> SigningTableBlockEntity.this.greenDyeLevel = value;
                    case 10 -> SigningTableBlockEntity.this.cyanDyeLevel = value;
                    case 11 -> SigningTableBlockEntity.this.lightBlueDyeLevel = value;
                    case 12 -> SigningTableBlockEntity.this.blueDyeLevel = value;
                    case 13 -> SigningTableBlockEntity.this.purpleDyeLevel = value;
                    case 14 -> SigningTableBlockEntity.this.magentaDyeLevel = value;
                    case 15 -> SigningTableBlockEntity.this.pinkDyeLevel = value;
                }

            }

            @Override
            public int size() {
                return 16;
            }
        };

    }




    //ENN BEE TEE
    @Override
    protected void writeNbt(NbtCompound nbt) {
        nbt.putInt("white",whiteDyeLevel);
        nbt.putInt("light_gray",lightGrayDyeLevel);
        nbt.putInt("gray",grayDyeLevel);
        nbt.putInt("black",blackDyeLevel);
        nbt.putInt("brown",brownDyeLevel);
        nbt.putInt("red",redDyeLevel);
        nbt.putInt("orange",orangeDyeLevel);
        nbt.putInt("yellow",yellowDyeLevel);
        nbt.putInt("lime",limeDyeLevel);
        nbt.putInt("green",greenDyeLevel);
        nbt.putInt("cyan",cyanDyeLevel);
        nbt.putInt("light_blue",lightBlueDyeLevel);
        nbt.putInt("blue",blueDyeLevel);
        nbt.putInt("purple",purpleDyeLevel);
        nbt.putInt("magenta",magentaDyeLevel);
        nbt.putInt("pink",pinkDyeLevel);
        super.writeNbt(nbt);
    }

    @Override
    public void readNbt(NbtCompound nbt) {
        whiteDyeLevel = nbt.getInt("white");
        lightGrayDyeLevel = nbt.getInt("light_gray");
        grayDyeLevel = nbt.getInt("gray");
        blackDyeLevel = nbt.getInt("black");
        brownDyeLevel = nbt.getInt("brown");
        redDyeLevel = nbt.getInt("red");
        orangeDyeLevel = nbt.getInt("orange");
        yellowDyeLevel = nbt.getInt("yellow");
        limeDyeLevel = nbt.getInt("lime");
        greenDyeLevel = nbt.getInt("green");
        cyanDyeLevel = nbt.getInt("cyan");
        lightBlueDyeLevel = nbt.getInt("light_blue");
        blueDyeLevel = nbt.getInt("blue");
        purpleDyeLevel = nbt.getInt("purple");
        magentaDyeLevel = nbt.getInt("magenta");
        pinkDyeLevel = nbt.getInt("pink");
        super.readNbt(nbt);
    }


    private final DefaultedList<ItemStack> inventory = DefaultedList.ofSize(3, ItemStack.EMPTY);
    private static final int SIGN_SLOT = 0;
    private static final int DYE_SLOT = 1;
    private static final int WATER_SLOT = 2;



    @Override
    public NbtCompound toInitialChunkDataNbt() {
        return createNbt();
    }

    @Override
    public void writeScreenOpeningData(ServerPlayerEntity serverPlayerEntity, PacketByteBuf packetByteBuf) {
        packetByteBuf.writeBlockPos(this.pos);
    }

    @Override
    public Text getDisplayName() {
        return Text.translatable("screentext.signing_table_screen_title");
    }

    @Override
    public @Nullable ScreenHandler createMenu(int syncId, PlayerInventory playerInventory, PlayerEntity player) {
        return new SigningTableScreenHandler(syncId, playerInventory, this, this.propertyDelegate);
    }

    @Override
    public DefaultedList<ItemStack> getItems() {

        return inventory;
    }

    public void tick(World world, BlockPos pos, BlockState state) {
        if(world.isClient) {
            return;
        }

        Item dyeItem = this.getStack(DYE_SLOT).getItem();
        int inputAmount = this.getStack(SIGN_SLOT).getCount();
        if(itemIsDye(dyeItem)) {
            if(dyeNotFull(dyeItem)) {
                this.increaseDyeLevel(dyeItem);
                markDirty(world,pos,state);
                BigStationSigns.LOGGER.info("youre experiencing le buggg");

                }
            }
        if(signingCraftTask == true) {
            if(ingredientsPresent(inputAmount)) {
                this.decreaseDyeLevel(inputAmount);
                this.outputItem(inputAmount);
                markDirty(world,pos,state);
            }
            else {
                signingCraftTask = false;
            }
        }
        //leaving the water slot clear for now, will add that later
    }

    private void outputItem(int count) {
        this.getStack(SIGN_SLOT).setCount(0);
        if (signingTablePreset == 1) {
            this.setStack(SIGN_SLOT, new ItemStack(ModBlocks.LIGHT_GRAY_BIG_STATION_SIGN.asItem(), count));
        } else if (signingTablePreset == 2) {
            this.setStack(SIGN_SLOT, new ItemStack(ModBlocks.GRAY_BIG_STATION_SIGN.asItem(), count));
        } else if (signingTablePreset == 3) {
            this.setStack(SIGN_SLOT, new ItemStack(ModBlocks.GRAY_BIG_STATION_SIGN_B.asItem(), count));
        } else if (signingTablePreset == 4) {
            this.setStack(SIGN_SLOT, new ItemStack(ModBlocks.BLACK_BIG_STATION_SIGN.asItem(), count));
        } else if (signingTablePreset == 5) {
            this.setStack(SIGN_SLOT, new ItemStack(ModBlocks.RED_BIG_STATION_SIGN.asItem(), count));
        } else if (signingTablePreset == 6) {
            this.setStack(SIGN_SLOT, new ItemStack(ModBlocks.ORANGE_BIG_STATION_SIGN.asItem(), count));
        } else if (signingTablePreset == 7) {
            this.setStack(SIGN_SLOT, new ItemStack(ModBlocks.YELLOW_BIG_STATION_SIGN.asItem(), count));
        } else if (signingTablePreset == 8) {
            this.setStack(SIGN_SLOT, new ItemStack(ModBlocks.LIME_BIG_STATION_SIGN.asItem(), count));
        } else if (signingTablePreset == 9) {
            this.setStack(SIGN_SLOT, new ItemStack(ModBlocks.GREEN_BIG_STATION_SIGN.asItem(), count));
        } else if (signingTablePreset == 10) {
            this.setStack(SIGN_SLOT, new ItemStack(ModBlocks.CYAN_BIG_STATION_SIGN.asItem(), count));
        } else if (signingTablePreset == 11) {
            this.setStack(SIGN_SLOT, new ItemStack(ModBlocks.LIGHT_BLUE_BIG_STATION_SIGN.asItem(), count));
        } else if (signingTablePreset == 12) {
            this.setStack(SIGN_SLOT, new ItemStack(ModBlocks.PURPLE_BIG_STATION_SIGN.asItem(), count));
        } else if (signingTablePreset == 13) {
            this.setStack(SIGN_SLOT, new ItemStack(ModBlocks.PURPLE_BIG_STATION_SIGN_B.asItem(), count));
        } else if (signingTablePreset == 14) {
            this.setStack(SIGN_SLOT, new ItemStack(ModBlocks.MAGENTA_BIG_STATION_SIGN.asItem(), count));
        } else if (signingTablePreset == 15) {
            this.setStack(SIGN_SLOT, new ItemStack(ModBlocks.PINK_BIG_STATION_SIGN.asItem(), count));
        } else if (signingTablePreset == 16) {
            this.setStack(SIGN_SLOT, new ItemStack(ModBlocks.CERULEAN_BIG_STATION_SIGN.asItem(), count));
        } else if (signingTablePreset == 17) {
            this.setStack(SIGN_SLOT, new ItemStack(ModBlocks.BLUE_BIG_STATION_SIGN.asItem(), count));
        } else {
            this.setStack(SIGN_SLOT, new ItemStack(ModBlocks.WHITE_BIG_STATION_SIGN.asItem(), count));
        }
    }

    private void decreaseDyeLevel(int count) {
        if (signingTablePreset == 1) {
            blueDyeLevel -= (5*count);
            blackDyeLevel -= (5*count);
            //scotrail
        } else if (signingTablePreset == 2) {
            redDyeLevel -= (5*count);
            grayDyeLevel -= (10*count);
            //avanti
        } else if (signingTablePreset == 3) {
            grayDyeLevel -= (10*count);
            orangeDyeLevel -= (5*count);
            //avanti b
        } else if (signingTablePreset == 4) {
            blueDyeLevel -= (10*count);
            whiteDyeLevel -= (5*count);
            //southeastern
        } else if (signingTablePreset == 5) {
            redDyeLevel -= (10*count);
            //greater anglia
        } else if (signingTablePreset == 6) {
            orangeDyeLevel -= (10*count);
            //west midlands
        } else if (signingTablePreset == 7) {
            yellowDyeLevel -= (5*count);
            lightGrayDyeLevel -= (10*count);
            //merseyrail
        } else if (signingTablePreset == 8) {
            limeDyeLevel -= (5*count);
            greenDyeLevel -= (5*count);
            //lnwr
        } else if (signingTablePreset == 9) {
            greenDyeLevel -= (10*count);
            whiteDyeLevel -= (5*count);
            //southern
        } else if (signingTablePreset == 10) {
            blueDyeLevel -= (10*count);
            whiteDyeLevel -= (5*count);
            //swr
        } else if (signingTablePreset == 11) {
            blueDyeLevel -= (10*count);
            //tpe
        } else if (signingTablePreset == 12) {
            purpleDyeLevel -= (10*count);
            //emr
        } else if (signingTablePreset == 13) {
            purpleDyeLevel -= (10*count);
            //emr b
        } else if (signingTablePreset == 14) {
            greenDyeLevel -= (10*count);
            //gwr
        } else if (signingTablePreset == 15) {
            blueDyeLevel -= (10*count);
            pinkDyeLevel -= (5*count);
            //c2c
        } else if (signingTablePreset == 16) {
            blueDyeLevel -= (10 * count);
            lightBlueDyeLevel -= (5 * count);
            //chiltern
        } else if (signingTablePreset == 17) {
            blueDyeLevel -= (10*count);
            lightBlueDyeLevel -= (5* count);
        } else {
            redDyeLevel -= (10*count);
            //national rail
        }
    }

    private boolean ingredientsPresent(int count) {
        if ((signingTablePreset == 1) && (blueDyeLevel >= (5*count)) && (blackDyeLevel >= (5*count))) {
            dyeLevelCheck = true;
            //scotrail
        } else if ((signingTablePreset == 2) && (redDyeLevel >= (5*count)) && (grayDyeLevel >= (10*count))) {
            dyeLevelCheck = true;
            //avanti
        } else if ((signingTablePreset == 3) && (grayDyeLevel >= (10*count)) && (orangeDyeLevel >= (5*count))) {
            dyeLevelCheck = true;
            //avanti b
        } else if ((signingTablePreset == 4) && (blueDyeLevel >= (10*count)) && (whiteDyeLevel >= (5*count))) {
            dyeLevelCheck = true;
            //southeastern
        } else if ((signingTablePreset == 5) && (redDyeLevel >= (10*count))) {
           dyeLevelCheck = true;
            //greater anglia
        } else if ((signingTablePreset == 6) && (orangeDyeLevel >= (10*count))) {
            dyeLevelCheck = true;
            //west midlands
        } else if ((signingTablePreset == 7) && (yellowDyeLevel >= (5*count)) && (lightGrayDyeLevel >= (10*count))) {
            dyeLevelCheck = true;
            //merseyrail
        } else if ((signingTablePreset == 8) && (limeDyeLevel >= (5*count)) && (greenDyeLevel >= (5*count))) {
            dyeLevelCheck = true;
            //lnwr
        } else if ((signingTablePreset == 9) && (greenDyeLevel >= (10*count)) && (whiteDyeLevel >= (5*count))) {
            dyeLevelCheck = true;
            //southern
        } else if ((signingTablePreset == 10) && (blueDyeLevel >= (10*count)) && (whiteDyeLevel >= (5*count))) {
            dyeLevelCheck = true;
            //swr
        } else if ((signingTablePreset == 11) && (blueDyeLevel >= (10*count))) {
            dyeLevelCheck = true;
            //tpe
        } else if ((signingTablePreset == 12) && (purpleDyeLevel >= (10*count))) {
            dyeLevelCheck = true;
            //emr
        } else if ((signingTablePreset == 13) && (purpleDyeLevel >= (10*count))) {
            dyeLevelCheck = true;
            //emr b
        } else if ((signingTablePreset == 14) && (greenDyeLevel >= (10*count))) {
            dyeLevelCheck = true;
            //gwr
        } else if ((signingTablePreset == 15) & (blueDyeLevel >= (10*count)) && (pinkDyeLevel >= (5*count))) {
            dyeLevelCheck = true;
            //c2c
        } else if ((signingTablePreset == 16) && (blueDyeLevel >= (10*count)) && (lightBlueDyeLevel >= (5*count))) {
            dyeLevelCheck = true;
            //chiltern
        } else if ((signingTablePreset == 17) && (blueDyeLevel >= (10*count) && (whiteDyeLevel >= (5*count)))) {
            dyeLevelCheck = true;
            //northern
        } else if (redDyeLevel >= (10*count)) {
            dyeLevelCheck = true;
            //national rail
        } else {
            dyeLevelCheck = false;
        }
        return ((this.getStack(SIGN_SLOT).getItem() == ModBlocks.BROWN_BIG_STATION_SIGN.asItem()) && (dyeLevelCheck));
    }


    private boolean itemIsDye(Item dyeItem) {
        return (dyeItem == Items.WHITE_DYE) ||
                (dyeItem == Items.LIGHT_GRAY_DYE) ||
                (dyeItem == Items.GRAY_DYE) ||
                (dyeItem == Items.BLACK_DYE) ||
                (dyeItem == Items.BROWN_DYE) ||
                (dyeItem == Items.RED_DYE) ||
                (dyeItem == Items.ORANGE_DYE) ||
                (dyeItem == Items.YELLOW_DYE) ||
                (dyeItem == Items.LIME_DYE) ||
                (dyeItem == Items.GREEN_DYE) ||
                (dyeItem == Items.CYAN_DYE) ||
                (dyeItem == Items.BLUE_DYE) ||
                (dyeItem == Items.LIGHT_BLUE_DYE) ||
                (dyeItem == Items.PURPLE_DYE) ||
                (dyeItem == Items.MAGENTA_DYE) ||
                (dyeItem == Items.PINK_DYE);
    }

    private boolean dyeNotFull(Item dyeItem) {
        if (dyeItem == Items.WHITE_DYE)  {
            return whiteDyeLevel<=500;
        }
        if (dyeItem == Items.LIGHT_GRAY_DYE) {
            return lightGrayDyeLevel<=500;
        }
        if (dyeItem == Items.GRAY_DYE) {
            return grayDyeLevel<=500;
        }
        if (dyeItem == Items.BLACK_DYE) {
            return blackDyeLevel<=500;
        }
        if (dyeItem == Items.BROWN_DYE) {
            return brownDyeLevel<=500;
        }
        if (dyeItem == Items.RED_DYE) {
            return redDyeLevel<=500;
        }
        if (dyeItem == Items.ORANGE_DYE) {
            return orangeDyeLevel<=500;
        }
        if (dyeItem == Items.YELLOW_DYE) {
            return yellowDyeLevel<=500;
        }
        if (dyeItem == Items.LIME_DYE) {
            return limeDyeLevel<=500;
        }
        if (dyeItem == Items.GREEN_DYE) {
            return greenDyeLevel<=500;
        }
        if (dyeItem == Items.CYAN_DYE) {
            return cyanDyeLevel<=500;
        }
        if (dyeItem == Items.LIGHT_BLUE_DYE) {
            return lightBlueDyeLevel<=500;
        }
        if (dyeItem == Items.BLUE_DYE) {
            return blueDyeLevel<=500;
        }
        if (dyeItem == Items.PURPLE_DYE) {
            return purpleDyeLevel<=500;
        }
        if (dyeItem == Items.MAGENTA_DYE) {
            return magentaDyeLevel<=500;
        }
        if (dyeItem == Items.PINK_DYE) {
            return pinkDyeLevel<=500;
        }
        else return false;
    }

    private void increaseDyeLevel(Item dyeItem) {
        if (dyeItem == Items.WHITE_DYE)  {
            whiteDyeLevel+=500;
        }
        if (dyeItem == Items.LIGHT_GRAY_DYE) {
            lightGrayDyeLevel+=500;
        }
        if (dyeItem == Items.GRAY_DYE) {
             grayDyeLevel+=500;
        }
        if (dyeItem == Items.BLACK_DYE) {
             blackDyeLevel+=500;
        }
        if (dyeItem == Items.BROWN_DYE) {
             brownDyeLevel+=500;
        }
        if (dyeItem == Items.RED_DYE) {
             redDyeLevel+=500;
        }
        if (dyeItem == Items.ORANGE_DYE) {
             orangeDyeLevel+=500;
        }
        if (dyeItem == Items.YELLOW_DYE) {
             yellowDyeLevel+=500;
        }
        if (dyeItem == Items.LIME_DYE) {
             limeDyeLevel+=500;
        }
        if (dyeItem == Items.GREEN_DYE) {
             greenDyeLevel+=500;
        }
        if (dyeItem == Items.CYAN_DYE) {
             cyanDyeLevel+=500;
        }
        if (dyeItem == Items.LIGHT_BLUE_DYE) {
             lightBlueDyeLevel+=500;
        }
        if (dyeItem == Items.BLUE_DYE) {
             blueDyeLevel+=500;
        }
        if (dyeItem == Items.PURPLE_DYE) {
             purpleDyeLevel+=500;
        }
        if (dyeItem == Items.MAGENTA_DYE) {
             magentaDyeLevel+=500;
        }
        if (dyeItem == Items.PINK_DYE) {
             pinkDyeLevel+=500;
        }

        int dyeCount = this.getStack(DYE_SLOT).getCount();
        this.getStack(DYE_SLOT).setCount(dyeCount-1);

    }



}
//things i want this block to do:
//when dye is put in, it fills up 500mb of dye
//stores up to 1 bucket of each dye colour
//when a pattern is applied to the sign, 10mb of the relevant dye colours is taken out
//preset patterns use the amount of dye that would be relevant
//full colour backgrounds use 20mb instead
//water bucket will clear the sign (return to full white)
//block would not need to store an inventory, however would need to accept the sign, dye and water bucket
//stonecutter esque gui for selecting the preset, item input on the left, and 16 dye colours on the right hand side
//dye colours fill a square from bottom to top as they get increased
//hovering over the square will tooltip how much dye is left?
//dont forget a confirm button lol
//when the confirm button is pressed, the table will