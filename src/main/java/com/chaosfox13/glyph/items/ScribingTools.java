package com.chaosfox13.glyph.items;

import com.chaosfox13.glyph.blocks.FirstBlock;
import com.chaosfox13.glyph.blocks.ModBlocks;
import com.chaosfox13.glyph.tiles.FirstBlockTile;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import com.chaosfox13.glyph.Glyph;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUseContext;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorld;

public class ScribingTools extends Item {
    BlockPos target;
    public ScribingTools() {
        super(new Item.Properties()
                .maxStackSize(1)
                .group(Glyph.setup.itemGroup));
        setRegistryName("scribingtools");
    }

    //@Override
   // public String getHighlightTip(ItemStack item, String displayName) {
   //     return target.toString();
   // }

    public ActionResultType onItemUse(ItemUseContext context){
        if(context.isPlacerSneaking()) {
            target =context.getPos();
            return ActionResultType.SUCCESS;
        }else{
            PlayerEntity player = context.getPlayer();
            IWorld iworld = context.getWorld();
            BlockPos pos = context.getPos();
            BlockPos blockpos1 = pos.offset(context.getFace());
            iworld.setBlockState(blockpos1, ModBlocks.BASICRUNE.getDefaultState(), 11);//copied from flint&steel
            FirstBlockTile tile = (FirstBlockTile)iworld.getTileEntity(blockpos1);
            tile.setTarget(target);
            return ActionResultType.SUCCESS;
        }

    }
}
