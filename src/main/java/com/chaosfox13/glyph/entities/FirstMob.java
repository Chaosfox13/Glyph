package com.chaosfox13.glyph.entities;

import com.chaosfox13.glyph.blocks.FirstBlock;
import net.minecraft.entity.AgeableEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class FirstMob extends AnimalEntity {

    public FirstMob(EntityType<? extends AnimalEntity> type, World worldIn) {super(type, worldIn);}
    @Nullable
    @Override
    public AgeableEntity createChild(AgeableEntity ageable) {
        return null;
    }
}
