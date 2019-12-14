package com.chaosfox13.glyph.blocks.runes;

import com.chaosfox13.glyph.tiles.FirstBlockTile;
import com.chaosfox13.glyph.tiles.runes.TriggerRuneTile;
import net.minecraft.block.BlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockReader;

import javax.annotation.Nullable;

public class TriggerRune  extends BasicRune{



    @Override
    public boolean hasTileEntity(BlockState state){
        return true;
    }

    @Nullable
    @Override
    public TileEntity createTileEntity(BlockState state, IBlockReader world) {
        return new TriggerRuneTile();
    }

}
