package com.chaosfox13.glyph.tiles.runes;

import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;

import static com.chaosfox13.glyph.blocks.ModBlocks.TRIGGERRUNE;

public class TriggerRuneTile extends TileEntity implements ITriggerable{
    ITriggerable target;
    public TriggerRuneTile() {
        super(TRIGGERRUNE);
    }

    @Override
    public void execute(int heat) {
        target.execute(heat+1);

    }
}
