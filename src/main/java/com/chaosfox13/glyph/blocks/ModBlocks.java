package com.chaosfox13.glyph.blocks;

import com.chaosfox13.glyph.tiles.FirstBlockTile;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.registries.ObjectHolder;

public class ModBlocks {
    @ObjectHolder("glyph:firstblock")
    public static FirstBlock FIRSTBLOCK;

    @ObjectHolder("glyph:firstblock")
    public static TileEntityType<FirstBlockTile> FIRSTBLOCK_TILE;


}
