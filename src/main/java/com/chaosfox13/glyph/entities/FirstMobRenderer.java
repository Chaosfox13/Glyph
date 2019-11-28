package com.chaosfox13.glyph.entities;

import com.chaosfox13.glyph.Glyph;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.data.RecipeProvider;
import net.minecraft.util.ResourceLocation;

import javax.annotation.Nullable;

public class FirstMobRenderer extends MobRenderer<FirstMob, FirstMobModel> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(Glyph.MOD_ID, "textures/entity/firstmob.png");

    public FirstMobRenderer(EntityRendererManager manager) {
        super(manager, new FirstMobModel(), 0.5f);
    }


    @Nullable
    @Override
    protected ResourceLocation getEntityTexture(FirstMob entity) {
        return TEXTURE;
    }
}
