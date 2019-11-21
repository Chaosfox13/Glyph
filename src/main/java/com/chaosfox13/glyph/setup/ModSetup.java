package com.chaosfox13.glyph.setup;

import com.chaosfox13.glyph.blocks.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModSetup {

    public ItemGroup itemGroup = new ItemGroup("glyph") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModBlocks.FIRSTBLOCK);
        }
    };

    public void init(){

    }

}
