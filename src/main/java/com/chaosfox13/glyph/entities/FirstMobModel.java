package com.chaosfox13.glyph.entities;

import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.model.RendererModel;

public class FirstMobModel extends EntityModel<FirstMob> {
    public RendererModel body;
    public FirstMobModel(){
        body = new RendererModel(this, 0,0);
        body.addBox(-3,-3,-3,6,6,6);
    }
   //@Override
    public void render(FirstMob entityIn, float scale){
        body.render(scale);
    }
}
