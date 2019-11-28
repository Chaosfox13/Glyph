package com.chaosfox13.glyph.datagen;

import com.chaosfox13.glyph.blocks.ModBlocks;
import net.minecraft.advancements.criterion.InventoryChangeTrigger;
import net.minecraft.block.Blocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.data.RecipeProvider;
import net.minecraft.data.ShapedRecipeBuilder;

import java.util.function.Consumer;

public class Recipes extends RecipeProvider {
    public Recipes(DataGenerator dataGenIn){super(dataGenIn);}

    @Override
    protected void registerRecipes(Consumer<IFinishedRecipe> consumer){
        ShapedRecipeBuilder.shapedRecipe(ModBlocks.FIRSTBLOCK)
                .patternLine("###")
                .patternLine("# #")
                .patternLine("###")
                .key('#', Blocks.COBBLESTONE)
                .setGroup("glyph")
                .addCriterion("cobblestone", InventoryChangeTrigger.Instance.forItems(Blocks.COBBLESTONE))
                .build(consumer);
    }
}
