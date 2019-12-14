package com.chaosfox13.glyph.items;

import com.chaosfox13.glyph.Glyph;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUseContext;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.math.BlockPos;

public class DebugBinder extends Item {
    BlockPos target;
    public DebugBinder() {
        super(new Item.Properties()
                .maxStackSize(1)
                .group(Glyph.setup.itemGroup));
        setRegistryName("debugbinder");
    }


    public ActionResultType onItemUse(ItemStack stack, ItemUseContext context) {
        return null;
    }
}
