package com.chaosfox13.glyph.items;

import com.chaosfox13.glyph.blocks.ModBlocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import com.chaosfox13.glyph.Glyph;
import net.minecraft.item.ItemUseContext;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorld;

public class ScribingTools extends Item {
    public ScribingTools() {
        super(new Item.Properties()
                .maxStackSize(1)
                .group(Glyph.setup.itemGroup));
        setRegistryName("scribingtools");
    }
    public ActionResultType onItemUse(ItemUseContext context){
        PlayerEntity player = context.getPlayer();
        IWorld iworld = context.getWorld();
        BlockPos pos = context.getPos();
        BlockPos blockpos1 = pos.offset(context.getFace());
        iworld.setBlockState(blockpos1, ModBlocks.FIRSTBLOCK.getDefaultState(), 11);//copied from flint&steel
        return ActionResultType.SUCCESS;
    }
}
