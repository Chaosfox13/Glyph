package com.chaosfox13.glyph.setup;

import net.minecraft.client.Minecraft;
import net.minecraft.world.World;

public class ClientProxy implements IProxy{

    @Override
    public void init() {

    }
    //random comment
    @Override
    public World getClientWorld() {
        return Minecraft.getInstance().world;
    }
}
