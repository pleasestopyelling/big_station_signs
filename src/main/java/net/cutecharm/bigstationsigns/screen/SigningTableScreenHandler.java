package net.cutecharm.bigstationsigns.screen;

import net.cutecharm.bigstationsigns.block.entity.SigningTableBlockEntity;
import net.cutecharm.bigstationsigns.tags.ModTags;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.DyeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.screen.ArrayPropertyDelegate;
import net.minecraft.screen.PropertyDelegate;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.slot.Slot;

public class SigningTableScreenHandler extends ScreenHandler {

    private final Inventory inventory;
    private final PropertyDelegate propertyDelegate;
    public final SigningTableBlockEntity blockEntity;

    public SigningTableScreenHandler(int syncId, PlayerInventory inventory, PacketByteBuf buf) {
        this(syncId, inventory, inventory.player.getWorld().getBlockEntity(buf.readBlockPos()),
                new ArrayPropertyDelegate(17)
                );
    }

    public SigningTableScreenHandler(int syncId, PlayerInventory inventory, BlockEntity blockEntity, PropertyDelegate arrayPropertyDelegate) {
        super(ModScreenHandlers.SIGNING_TABLE_SCREEN_HANDLER, syncId);
        checkSize((Inventory) blockEntity,3);
        this.inventory = ((Inventory) blockEntity);
        inventory.onOpen(inventory.player);
        this.propertyDelegate = arrayPropertyDelegate;
        this.blockEntity = ((SigningTableBlockEntity) blockEntity);
        this.addSlot(new Slot(this.inventory, 0, 80, 11){
            @Override
            public boolean canInsert(ItemStack stack) {
                return stack.isIn(ModTags.PAINTABLE);
            }
        });
        this.addSlot(new Slot(this.inventory, 1, 80, 59){
            @Override
            public boolean canInsert(ItemStack stack)  {
                return stack.getItem() instanceof DyeItem;
            }
        });
        this.addSlot(new Slot(this.inventory, 2, 80, 35){
            @Override
            public boolean canInsert(ItemStack stack) {
                return stack.isOf(Items.WATER_BUCKET);
            }
        }

        );

        addPlayerInventory(inventory);
        addPlayerHotbar(inventory);
        addProperties(arrayPropertyDelegate);

    }

    private void addPlayerInventory(PlayerInventory playerInventory) {
        for (int i = 0; i < 3; ++i) {
            for (int l = 0; l < 9; ++l) {
                this.addSlot(new Slot(playerInventory, l + i * 9 + 9, 8 + l * 18, 84 + i * 18));
            }
        }
    }

    private void addPlayerHotbar(PlayerInventory playerInventory) {
        for (int i = 0; i < 9; ++i) {
            this.addSlot(new Slot(playerInventory, i, 8 + i * 18, 142));
        }
    }

    public ItemStack quickMove(PlayerEntity player, int invSlot) {
        ItemStack newStack = ItemStack.EMPTY;
        Slot slot = this.slots.get(invSlot);
        if (slot != null && slot.hasStack()) {
            ItemStack originalStack = slot.getStack();
            newStack = originalStack.copy();
            if (invSlot < this.inventory.size()) {
                if (!this.insertItem(originalStack, this.inventory.size(), this.slots.size(), true)) {
                    return ItemStack.EMPTY;
                }
            } else if (!this.insertItem(originalStack, 0, this.inventory.size(), false)) {
                return ItemStack.EMPTY;
            }

            if (originalStack.isEmpty()) {
                slot.setStack(ItemStack.EMPTY);
            } else {
                slot.markDirty();
            }
        }
        return newStack;
    }

    public int whiteLevel() {
        return this.propertyDelegate.get(0);
    }
    public int lightGrayLevel() {
        return this.propertyDelegate.get(1);
    }
    public int grayLevel() {
        return this.propertyDelegate.get(2);
    }
    public int blackLevel() {
        return this.propertyDelegate.get(3);
    }
    public int brownLevel() {
        return this.propertyDelegate.get(4);
    }
    public int redLevel() {
        return this.propertyDelegate.get(5);
    }
    public int orangeLevel() {
        return this.propertyDelegate.get(6);
    }
    public int yellowLevel() {
        return this.propertyDelegate.get(7);
    }
    public int limeLevel() {
        return this.propertyDelegate.get(8);
    }
    public int greenLevel() {
        return this.propertyDelegate.get(9);
    }
    public int cyanLevel() {
        return this.propertyDelegate.get(10);
    }
    public int lightBlueLevel() {
        return this.propertyDelegate.get(11);
    }
    public int blueLevel() {
        return this.propertyDelegate.get(12);
    }
    public int purpleLevel() {
        return this.propertyDelegate.get(13);
    }
    public int magentaLevel() {
        return this.propertyDelegate.get(14);
    }
    public int pinkLevel() {
        return this.propertyDelegate.get(15);
    }
    public int preset() {
        return this.propertyDelegate.get(16);
    }

    @Override
    public boolean canUse(PlayerEntity player) {
        return this.inventory.canPlayerUse(player);
    }
}
