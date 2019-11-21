package com.chaosfox13.glyph.setup;

import net.minecraft.world.World;

public class ServerProxy implements IProxy {
    @Override
    public void init() {

    }

    @Override
    public World getClientWorld() {
        throw new IllegalStateException("Only Run this on the client");
    }
}
