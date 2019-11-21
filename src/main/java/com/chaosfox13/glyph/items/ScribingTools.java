package com.chaosfox13.glyph.items;

import net.minecraft.item.Item;
import com.chaosfox13.glyph.Glyph;

public class ScribingTools extends Item {
    public ScribingTools() {
        super(new Item.Properties()
                .maxStackSize(1)
                .group(Glyph.setup.itemGroup));
        setRegistryName("scribingtools");
    }
}
