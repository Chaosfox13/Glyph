package com.chaosfox13.glyph.setup;

import net.minecraft.world.World;

public interface IProxy {
    void init();

    World getClientWorld();
}
