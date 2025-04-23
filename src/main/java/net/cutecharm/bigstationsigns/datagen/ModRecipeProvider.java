package net.cutecharm.bigstationsigns.datagen;

import net.cutecharm.bigstationsigns.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        //convert between the small sign types
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModItems.BLACK_SIGN_B, 1)
                .input(ModItems.BLACK_SIGN)
                .criterion(hasItem(ModItems.BLACK_SIGN), conditionsFromItem(ModItems.BLACK_SIGN))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.BLACK_SIGN_B)));


    }
}
