package com.chaosfox13.glyph.blocks;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IWorldPosCallable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.SlotItemHandler;
import net.minecraftforge.items.wrapper.InvWrapper;

import static com.chaosfox13.glyph.blocks.ModBlocks.FIRSTBLOCK_CONTAINER;

public class FirstBlockContainer extends Container {
    private TileEntity tile;
    private PlayerEntity playerEntity;
    private IItemHandler playerInv;

    public FirstBlockContainer(int windowID, World world, BlockPos pos, PlayerInventory playerInv, PlayerEntity playerEntity) {
        super(FIRSTBLOCK_CONTAINER, windowID);
        tile= world.getTileEntity(pos);
        this.playerEntity = playerEntity;
        this.playerInv = new InvWrapper(playerInv);
        tile.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY).ifPresent(h ->{
            addSlot(new SlotItemHandler(h, 0,62, 24));
        });
        layoutPlayerInventory(10,70);

    }

    @Override
    public boolean canInteractWith(PlayerEntity playerIn) {
        return isWithinUsableDistance(IWorldPosCallable.of(tile.getWorld(),tile.getPos()), playerEntity, ModBlocks.FIRSTBLOCK);
    }
    @Override
    public ItemStack transferStackInSlot(PlayerEntity playerIn, int index) {
        ItemStack itemstack = ItemStack.EMPTY;
        Slot slot = this.inventorySlots.get(index);
        if (slot != null && slot.getHasStack()) {
            ItemStack stack = slot.getStack();
            itemstack = stack.copy();
            if (index == 0) {
                if (!this.mergeItemStack(stack, 1, 37, true)) {
                    return ItemStack.EMPTY;
                }
                slot.onSlotChange(stack, itemstack);
            } else {
                if (stack.getItem() == Items.DIAMOND) {
                    if (!this.mergeItemStack(stack, 0, 1, false)) {
                        return ItemStack.EMPTY;
                    }
                } else if (index < 28) {
                    if (!this.mergeItemStack(stack, 28, 37, false)) {
                        return ItemStack.EMPTY;
                    }
                } else if (index < 37 && !this.mergeItemStack(stack, 1, 28, false)) {
                    return ItemStack.EMPTY;
                }
            }

            if (stack.isEmpty()) {
                slot.putStack(ItemStack.EMPTY);
            } else {
                slot.onSlotChanged();
            }

            if (stack.getCount() == itemstack.getCount()) {
                return ItemStack.EMPTY;
            }

            slot.onTake(playerIn, stack);
        }

        return itemstack;
    }



    private void addSlot(IItemHandler handler, int index, int x, int y){
        addSlot(new SlotItemHandler(handler,index, x, y));
    }
    private int addSlotRange(IItemHandler handler, int index, int x, int y, int dx, int amount){
        for(int i = 0; i < amount; i++){
            addSlot(handler, index, x,y);
            x+=dx;
            index++;
        }
        return index;
    }
    private void addSlotBox(IItemHandler handler, int index, int x, int y, int dx,int dy, int width,  int height){
        for(int i = 0; i < height; i++){
            index = addSlotRange(handler, index, x,y,dx,width);
            y+=dy;
        }
    }
    private void layoutPlayerInventory(int x,int y){
        addSlotBox(playerInv, 9, x,y,18,18,9,3);
        y+=58;
        addSlotRange(playerInv, 0, x,y,18,9);
    }
}
