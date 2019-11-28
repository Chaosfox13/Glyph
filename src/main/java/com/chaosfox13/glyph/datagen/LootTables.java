package com.chaosfox13.glyph.datagen;

import com.chaosfox13.glyph.blocks.FirstBlock;
import com.chaosfox13.glyph.blocks.ModBlocks;
import net.minecraft.data.DataGenerator;

public class LootTables extends BaseLootTableProvider {
    public LootTables(DataGenerator dataGenIn){super(dataGenIn);}

    @Override
    protected void addTables() {
        lootTables.put(ModBlocks.FIRSTBLOCK, createStandardTable("firstblock",ModBlocks.FIRSTBLOCK));
    }
}
