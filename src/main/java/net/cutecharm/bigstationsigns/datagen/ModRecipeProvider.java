package net.cutecharm.bigstationsigns.datagen;

import net.cutecharm.bigstationsigns.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.util.Identifier;

import java.util.function.Consumer;

import static net.minecraft.item.Items.*;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        //convert between the small sign types
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModItems.WHITE_SIGN, 1)
                .input(WHITE_DYE)
                .input(ItemTags.SIGNS)
                .criterion(hasItem(Items.WHITE_DYE), conditionsFromItem(Items.WHITE_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.WHITE_SIGN)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModItems.LIGHT_GRAY_SIGN, 1)
                .input(Items.LIGHT_GRAY_DYE)
                .input(ItemTags.SIGNS)
                .criterion(hasItem(Items.LIGHT_GRAY_DYE), conditionsFromItem(Items.LIGHT_GRAY_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.LIGHT_GRAY_SIGN)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModItems.GRAY_SIGN, 1)
                .input(Items.GRAY_DYE)
                .input(ItemTags.SIGNS)
                .criterion(hasItem(Items.GRAY_DYE), conditionsFromItem(Items.GRAY_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.GRAY_SIGN)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModItems.BLACK_SIGN, 1)
                .input(Items.BLACK_DYE)
                .input(ItemTags.SIGNS)
                .criterion(hasItem(ModItems.BLACK_SIGN), conditionsFromItem(ModItems.BLACK_SIGN))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.BLACK_SIGN)));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModItems.BLACK_SIGN, 1)
                .input(Items.BLACK_DYE)
                .input(ItemTags.SIGNS)
                .criterion(hasItem(ModItems.BLACK_SIGN), conditionsFromItem(ModItems.BLACK_SIGN))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.BLACK_SIGN)));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModItems.BLACK_SIGN_B, 1)
                .input(ModItems.BLACK_SIGN)
                .criterion(hasItem(ModItems.BLACK_SIGN), conditionsFromItem(ModItems.BLACK_SIGN))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.BLACK_SIGN_B)));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModItems.BLACK_SIGN_C, 1)
                .input(ModItems.BLACK_SIGN_B)
                .criterion(hasItem(ModItems.BLACK_SIGN_B), conditionsFromItem(ModItems.BLACK_SIGN_B))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.BLACK_SIGN_C)));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModItems.BLACK_SIGN_D, 1)
                .input(ModItems.BLACK_SIGN_C)
                .criterion(hasItem(ModItems.BLACK_SIGN_C), conditionsFromItem(ModItems.BLACK_SIGN_C))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.BLACK_SIGN_D)));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModItems.BLACK_SIGN, 1)
                .input(ModItems.BLACK_SIGN_D)
                .criterion(hasItem(ModItems.BLACK_SIGN_C), conditionsFromItem(ModItems.BLACK_SIGN_C))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.BLACK_SIGN)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModItems.BROWN_SIGN, 1)
                .input(BROWN_DYE)
                .input(ItemTags.SIGNS)
                .criterion(hasItem(BROWN_DYE), conditionsFromItem(BROWN_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.BROWN_SIGN)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModItems.RED_SIGN, 1)
                .input(RED_DYE)
                .input(ItemTags.SIGNS)
                .criterion(hasItem(RED_DYE), conditionsFromItem(RED_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.RED_SIGN)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModItems.ORANGE_SIGN, 1)
                .input(ORANGE_DYE)
                .input(ItemTags.SIGNS)
                .criterion(hasItem(ORANGE_DYE), conditionsFromItem(ORANGE_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.ORANGE_SIGN)));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModItems.ORANGE_SIGN_B, 1)
                .input(ModItems.ORANGE_SIGN)
                .criterion(hasItem(ModItems.ORANGE_SIGN), conditionsFromItem(ModItems.ORANGE_SIGN))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.ORANGE_SIGN)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModItems.YELLOW_SIGN, 1)
                .input(YELLOW_DYE)
                .input(ItemTags.SIGNS)
                .criterion(hasItem(YELLOW_DYE), conditionsFromItem(YELLOW_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.YELLOW_SIGN)));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModItems.YELLOW_SIGN_B, 1)
                .input(ModItems.YELLOW_SIGN)
                .criterion(hasItem(ModItems.YELLOW_SIGN), conditionsFromItem(ModItems.YELLOW_SIGN))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.YELLOW_SIGN)));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModItems.YELLOW_SIGN, 1)
                .input(ModItems.YELLOW_SIGN_B)
                .criterion(hasItem(ModItems.YELLOW_SIGN_B), conditionsFromItem(ModItems.YELLOW_SIGN_B))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.YELLOW_SIGN)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModItems.LIME_SIGN, 1)
                .input(LIME_DYE)
                .input(ItemTags.SIGNS)
                .criterion(hasItem(LIME_DYE), conditionsFromItem(LIME_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.LIME_SIGN)));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModItems.LIME_SIGN_B, 1)
                .input(ModItems.LIME_SIGN)
                .criterion(hasItem(ModItems.LIME_SIGN), conditionsFromItem(ModItems.LIME_SIGN))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.LIME_SIGN_B)));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModItems.LIME_SIGN, 1)
                .input(ModItems.LIME_SIGN_B)
                .criterion(hasItem(ModItems.LIME_SIGN_B), conditionsFromItem(ModItems.LIME_SIGN_B))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.LIME_SIGN)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModItems.GREEN_SIGN, 1)
                .input(GREEN_DYE)
                .input(ItemTags.SIGNS)
                .criterion(hasItem(GREEN_DYE), conditionsFromItem(GREEN_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.GREEN_SIGN)));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModItems.GREEN_SIGN_B, 1)
                .input(ModItems.GREEN_SIGN)
                .criterion(hasItem(ModItems.GREEN_SIGN), conditionsFromItem(ModItems.GREEN_SIGN))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.GREEN_SIGN_B)));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModItems.GREEN_SIGN_C, 1)
                .input(ModItems.GREEN_SIGN_B)
                .criterion(hasItem(ModItems.GREEN_SIGN_B), conditionsFromItem(ModItems.GREEN_SIGN_B))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.GREEN_SIGN_C)));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModItems.GREEN_SIGN_D, 1)
                .input(ModItems.GREEN_SIGN_C)
                .criterion(hasItem(ModItems.GREEN_SIGN_C), conditionsFromItem(ModItems.GREEN_SIGN_C))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.GREEN_SIGN_D)));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModItems.GREEN_SIGN, 1)
                .input(ModItems.GREEN_SIGN_D)
                .criterion(hasItem(ModItems.GREEN_SIGN_D), conditionsFromItem(ModItems.GREEN_SIGN_D))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.GREEN_SIGN)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModItems.CYAN_SIGN, 1)
                .input(CYAN_DYE)
                .input(ItemTags.SIGNS)
                .criterion(hasItem(CYAN_DYE), conditionsFromItem(CYAN_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.CYAN_SIGN)));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModItems.CYAN_SIGN_B, 1)
                .input(ModItems.CYAN_SIGN)
                .criterion(hasItem(ModItems.CYAN_SIGN), conditionsFromItem(ModItems.CYAN_SIGN))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.CYAN_SIGN_B)));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModItems.CYAN_SIGN_C, 1)
                .input(ModItems.CYAN_SIGN_B)
                .criterion(hasItem(ModItems.CYAN_SIGN_B), conditionsFromItem(ModItems.CYAN_SIGN_B))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.CYAN_SIGN_C)));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModItems.CYAN_SIGN_D, 1)
                .input(ModItems.CYAN_SIGN_C)
                .criterion(hasItem(ModItems.CYAN_SIGN_C), conditionsFromItem(ModItems.CYAN_SIGN_C))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.CYAN_SIGN_D)));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModItems.CYAN_SIGN, 1)
                .input(ModItems.CYAN_SIGN_D)
                .criterion(hasItem(ModItems.CYAN_SIGN_D), conditionsFromItem(ModItems.CYAN_SIGN_D))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.CYAN_SIGN)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModItems.LIGHT_BLUE_SIGN, 1)
                .input(LIGHT_BLUE_DYE)
                .input(ItemTags.SIGNS)
                .criterion(hasItem(LIGHT_BLUE_DYE), conditionsFromItem(LIGHT_BLUE_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.LIGHT_BLUE_SIGN)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModItems.BLUE_SIGN, 1)
                .input(BLUE_DYE)
                .input(ItemTags.SIGNS)
                .criterion(hasItem(BLUE_DYE), conditionsFromItem(BLUE_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.BLUE_SIGN)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModItems.PURPLE_SIGN, 1)
                .input(PURPLE_DYE)
                .input(ItemTags.SIGNS)
                .criterion(hasItem(PURPLE_DYE), conditionsFromItem(PURPLE_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.PURPLE_SIGN)));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModItems.PURPLE_SIGN_B, 1)
                .input(ModItems.PURPLE_SIGN)
                .criterion(hasItem(ModItems.PURPLE_SIGN), conditionsFromItem(ModItems.PURPLE_SIGN))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.PURPLE_SIGN_B)));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModItems.PURPLE_SIGN_C, 1)
                .input(ModItems.PURPLE_SIGN_B)
                .criterion(hasItem(ModItems.PURPLE_SIGN_B), conditionsFromItem(ModItems.PURPLE_SIGN_B))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.PURPLE_SIGN_C)));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModItems.PURPLE_SIGN_D, 1)
                .input(ModItems.PURPLE_SIGN_C)
                .criterion(hasItem(ModItems.PURPLE_SIGN_C), conditionsFromItem(ModItems.PURPLE_SIGN_C))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.PURPLE_SIGN_D)));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModItems.PURPLE_SIGN, 1)
                .input(ModItems.PURPLE_SIGN_D)
                .criterion(hasItem(ModItems.PURPLE_SIGN_D), conditionsFromItem(ModItems.PURPLE_SIGN_D))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.PURPLE_SIGN_D)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModItems.MAGENTA_SIGN, 1)
                .input(MAGENTA_DYE)
                .input(ItemTags.SIGNS)
                .criterion(hasItem(MAGENTA_DYE), conditionsFromItem(MAGENTA_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.MAGENTA_SIGN)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModItems.PINK_SIGN, 1)
                .input(PINK_DYE)
                .input(ItemTags.SIGNS)
                .criterion(hasItem(PINK_DYE), conditionsFromItem(PINK_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.PINK_SIGN)));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModItems.PINK_SIGN_B, 1)
                .input(ModItems.PINK_SIGN)
                .criterion(hasItem(ModItems.PINK_SIGN), conditionsFromItem(ModItems.PINK_SIGN))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.PINK_SIGN_B)));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModItems.PINK_SIGN, 1)
                .input(ModItems.PINK_SIGN_B)
                .criterion(hasItem(ModItems.PINK_SIGN_B), conditionsFromItem(ModItems.PINK_SIGN_B))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.PINK_SIGN)));


        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModItems.HANGING_WHITE_SIGN, 1)
                .input(WHITE_DYE)
                .input(ItemTags.HANGING_SIGNS)
                .criterion(hasItem(Items.WHITE_DYE), conditionsFromItem(Items.WHITE_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.HANGING_WHITE_SIGN)));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModItems.HANGING_LIGHT_GRAY_SIGN, 1)
                .input(LIGHT_GRAY_DYE)
                .input(ItemTags.HANGING_SIGNS)
                .criterion(hasItem(LIGHT_GRAY_DYE), conditionsFromItem(LIGHT_GRAY_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.HANGING_WHITE_SIGN)));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModItems.HANGING_GRAY_SIGN, 1)
                .input(GRAY_DYE)
                .input(ItemTags.HANGING_SIGNS)
                .criterion(hasItem(GRAY_DYE), conditionsFromItem(GRAY_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.HANGING_GREEN_SIGN)));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModItems.HANGING_BLACK_SIGN, 1)
                .input(BLACK_DYE)
                .input(ItemTags.HANGING_SIGNS)
                .criterion(hasItem(BLACK_DYE), conditionsFromItem(BLACK_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.HANGING_BLACK_SIGN)));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModItems.HANGING_BROWN_SIGN, 1)
                .input(BROWN_DYE)
                .input(ItemTags.HANGING_SIGNS)
                .criterion(hasItem(BROWN_DYE), conditionsFromItem(BROWN_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.HANGING_BROWN_SIGN)));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModItems.HANGING_RED_SIGN, 1)
                .input(RED_DYE)
                .input(ItemTags.HANGING_SIGNS)
                .criterion(hasItem(RED_DYE), conditionsFromItem(RED_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.HANGING_RED_SIGN)));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModItems.HANGING_ORANGE_SIGN, 1)
                .input(ORANGE_DYE)
                .input(ItemTags.HANGING_SIGNS)
                .criterion(hasItem(ORANGE_DYE), conditionsFromItem(ORANGE_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.HANGING_ORANGE_SIGN)));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModItems.HANGING_YELLOW_SIGN, 1)
                .input(YELLOW_DYE)
                .input(ItemTags.HANGING_SIGNS)
                .criterion(hasItem(YELLOW_DYE), conditionsFromItem(YELLOW_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.HANGING_YELLOW_SIGN)));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModItems.HANGING_LIME_SIGN, 1)
                .input(LIME_DYE)
                .input(ItemTags.HANGING_SIGNS)
                .criterion(hasItem(LIME_DYE), conditionsFromItem(LIME_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.HANGING_LIME_SIGN)));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModItems.HANGING_GREEN_SIGN, 1)
                .input(GREEN_DYE)
                .input(ItemTags.HANGING_SIGNS)
                .criterion(hasItem(GREEN_DYE), conditionsFromItem(GREEN_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.HANGING_GREEN_SIGN)));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModItems.HANGING_CYAN_SIGN, 1)
                .input(CYAN_DYE)
                .input(ItemTags.HANGING_SIGNS)
                .criterion(hasItem(CYAN_DYE), conditionsFromItem(CYAN_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.HANGING_CYAN_SIGN)));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModItems.HANGING_LIGHT_BLUE_SIGN, 1)
                .input(LIGHT_BLUE_DYE)
                .input(ItemTags.HANGING_SIGNS)
                .criterion(hasItem(LIGHT_BLUE_DYE), conditionsFromItem(LIGHT_BLUE_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.HANGING_LIGHT_BLUE_SIGN)));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModItems.HANGING_BLUE_SIGN, 1)
                .input(BLUE_DYE)
                .input(ItemTags.HANGING_SIGNS)
                .criterion(hasItem(BLUE_DYE), conditionsFromItem(BLUE_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.HANGING_BLUE_SIGN)));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModItems.HANGING_PURPLE_SIGN, 1)
                .input(PURPLE_DYE)
                .input(ItemTags.HANGING_SIGNS)
                .criterion(hasItem(PURPLE_DYE), conditionsFromItem(PURPLE_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.HANGING_PURPLE_SIGN)));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModItems.HANGING_MAGENTA_SIGN, 1)
                .input(MAGENTA_DYE)
                .input(ItemTags.HANGING_SIGNS)
                .criterion(hasItem(MAGENTA_DYE), conditionsFromItem(MAGENTA_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.HANGING_MAGENTA_SIGN)));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModItems.HANGING_PINK_SIGN, 1)
                .input(PINK_DYE)
                .input(ItemTags.HANGING_SIGNS)
                .criterion(hasItem(PINK_DYE), conditionsFromItem(PINK_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.HANGING_PINK_SIGN)));

    }
}
