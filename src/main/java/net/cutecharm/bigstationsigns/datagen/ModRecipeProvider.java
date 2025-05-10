package net.cutecharm.bigstationsigns.datagen;

import net.cutecharm.bigstationsigns.block.ModBlocks;
import net.cutecharm.bigstationsigns.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
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
                .input(IRON_NUGGET)
                .criterion(hasItem(Items.WHITE_DYE), conditionsFromItem(Items.WHITE_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.WHITE_SIGN)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModItems.LIGHT_GRAY_SIGN, 1)
                .input(Items.LIGHT_GRAY_DYE)
                .input(ItemTags.SIGNS)
                .input(IRON_NUGGET)
                .criterion(hasItem(Items.LIGHT_GRAY_DYE), conditionsFromItem(Items.LIGHT_GRAY_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.LIGHT_GRAY_SIGN)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModItems.GRAY_SIGN, 1)
                .input(Items.GRAY_DYE)
                .input(ItemTags.SIGNS)
                .input(IRON_NUGGET)
                .criterion(hasItem(Items.GRAY_DYE), conditionsFromItem(Items.GRAY_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.GRAY_SIGN)));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModItems.GRAY_SIGN_B, 1)
                .input(ModItems.GRAY_SIGN)
                .criterion(hasItem(ModItems.GRAY_SIGN), conditionsFromItem(ModItems.GRAY_SIGN))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.GRAY_SIGN_B)));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModItems.GRAY_SIGN_C, 1)
                .input(ModItems.GRAY_SIGN_B)
                .criterion(hasItem(ModItems.GRAY_SIGN_B), conditionsFromItem(ModItems.GRAY_SIGN_B))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.GRAY_SIGN_C)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModItems.BLACK_SIGN, 1)
                .input(Items.BLACK_DYE)
                .input(ItemTags.SIGNS)
                .input(IRON_NUGGET)
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

        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModItems.BROWN_SIGN, 1)
                .input(BROWN_DYE)
                .input(ItemTags.SIGNS)
                .input(IRON_NUGGET)
                .criterion(hasItem(BROWN_DYE), conditionsFromItem(BROWN_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.BROWN_SIGN)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModItems.RED_SIGN, 1)
                .input(RED_DYE)
                .input(ItemTags.SIGNS)
                .input(IRON_NUGGET)
                .criterion(hasItem(RED_DYE), conditionsFromItem(RED_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.RED_SIGN)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModItems.ORANGE_SIGN, 1)
                .input(ORANGE_DYE)
                .input(ItemTags.SIGNS)
                .input(IRON_NUGGET)
                .criterion(hasItem(ORANGE_DYE), conditionsFromItem(ORANGE_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.ORANGE_SIGN)));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModItems.ORANGE_SIGN_B, 1)
                .input(ModItems.ORANGE_SIGN)
                .criterion(hasItem(ModItems.ORANGE_SIGN), conditionsFromItem(ModItems.ORANGE_SIGN))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.ORANGE_SIGN_B)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModItems.YELLOW_SIGN, 1)
                .input(YELLOW_DYE)
                .input(ItemTags.SIGNS)
                .input(IRON_NUGGET)
                .criterion(hasItem(YELLOW_DYE), conditionsFromItem(YELLOW_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.YELLOW_SIGN)));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModItems.YELLOW_SIGN_B, 1)
                .input(ModItems.YELLOW_SIGN)
                .criterion(hasItem(ModItems.YELLOW_SIGN), conditionsFromItem(ModItems.YELLOW_SIGN))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.YELLOW_SIGN_B)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModItems.LIME_SIGN, 1)
                .input(LIME_DYE)
                .input(ItemTags.SIGNS)
                .input(IRON_NUGGET)
                .criterion(hasItem(LIME_DYE), conditionsFromItem(LIME_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.LIME_SIGN)));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModItems.LIME_SIGN_B, 1)
                .input(ModItems.LIME_SIGN)
                .criterion(hasItem(ModItems.LIME_SIGN), conditionsFromItem(ModItems.LIME_SIGN))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.LIME_SIGN_B)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModItems.GREEN_SIGN, 1)
                .input(GREEN_DYE)
                .input(ItemTags.SIGNS)
                .input(IRON_NUGGET)
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

        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModItems.CYAN_SIGN, 1)
                .input(CYAN_DYE)
                .input(ItemTags.SIGNS)
                .input(IRON_NUGGET)
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

        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModItems.LIGHT_BLUE_SIGN, 1)
                .input(LIGHT_BLUE_DYE)
                .input(ItemTags.SIGNS)
                .input(IRON_NUGGET)
                .criterion(hasItem(LIGHT_BLUE_DYE), conditionsFromItem(LIGHT_BLUE_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.LIGHT_BLUE_SIGN)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModItems.BLUE_SIGN, 1)
                .input(BLUE_DYE)
                .input(ItemTags.SIGNS)
                .input(IRON_NUGGET)
                .criterion(hasItem(BLUE_DYE), conditionsFromItem(BLUE_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.BLUE_SIGN)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModItems.PURPLE_SIGN, 1)
                .input(PURPLE_DYE)
                .input(ItemTags.SIGNS)
                .input(IRON_NUGGET)
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

        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModItems.MAGENTA_SIGN, 1)
                .input(MAGENTA_DYE)
                .input(ItemTags.SIGNS)
                .input(IRON_NUGGET)
                .criterion(hasItem(MAGENTA_DYE), conditionsFromItem(MAGENTA_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.MAGENTA_SIGN)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModItems.PINK_SIGN, 1)
                .input(PINK_DYE)
                .input(ItemTags.SIGNS)
                .input(IRON_NUGGET)
                .criterion(hasItem(PINK_DYE), conditionsFromItem(PINK_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.PINK_SIGN)));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModItems.PINK_SIGN_B, 1)
                .input(ModItems.PINK_SIGN)
                .criterion(hasItem(ModItems.PINK_SIGN), conditionsFromItem(ModItems.PINK_SIGN))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.PINK_SIGN_B)));


        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModItems.HANGING_WHITE_SIGN, 1)
                .input(WHITE_DYE)
                .input(ItemTags.HANGING_SIGNS)
                .input(IRON_NUGGET)
                .criterion(hasItem(Items.WHITE_DYE), conditionsFromItem(Items.WHITE_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.HANGING_WHITE_SIGN)));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModItems.HANGING_LIGHT_GRAY_SIGN, 1)
                .input(LIGHT_GRAY_DYE)
                .input(ItemTags.HANGING_SIGNS)
                .input(IRON_NUGGET)
                .criterion(hasItem(LIGHT_GRAY_DYE), conditionsFromItem(LIGHT_GRAY_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.HANGING_LIGHT_GRAY_SIGN)));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModItems.HANGING_GRAY_SIGN, 1)
                .input(GRAY_DYE)
                .input(ItemTags.HANGING_SIGNS)
                .input(IRON_NUGGET)
                .criterion(hasItem(GRAY_DYE), conditionsFromItem(GRAY_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.HANGING_GRAY_SIGN)));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModItems.HANGING_BLACK_SIGN, 1)
                .input(BLACK_DYE)
                .input(ItemTags.HANGING_SIGNS)
                .input(IRON_NUGGET)
                .criterion(hasItem(BLACK_DYE), conditionsFromItem(BLACK_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.HANGING_BLACK_SIGN)));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModItems.HANGING_BROWN_SIGN, 1)
                .input(BROWN_DYE)
                .input(ItemTags.HANGING_SIGNS)
                .input(IRON_NUGGET)
                .criterion(hasItem(BROWN_DYE), conditionsFromItem(BROWN_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.HANGING_BROWN_SIGN)));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModItems.HANGING_RED_SIGN, 1)
                .input(RED_DYE)
                .input(ItemTags.HANGING_SIGNS)
                .input(IRON_NUGGET)
                .criterion(hasItem(RED_DYE), conditionsFromItem(RED_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.HANGING_RED_SIGN)));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModItems.HANGING_ORANGE_SIGN, 1)
                .input(ORANGE_DYE)
                .input(ItemTags.HANGING_SIGNS)
                .input(IRON_NUGGET)
                .criterion(hasItem(ORANGE_DYE), conditionsFromItem(ORANGE_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.HANGING_ORANGE_SIGN)));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModItems.HANGING_YELLOW_SIGN, 1)
                .input(YELLOW_DYE)
                .input(ItemTags.HANGING_SIGNS)
                .input(IRON_NUGGET)
                .criterion(hasItem(YELLOW_DYE), conditionsFromItem(YELLOW_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.HANGING_YELLOW_SIGN)));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModItems.HANGING_LIME_SIGN, 1)
                .input(LIME_DYE)
                .input(ItemTags.HANGING_SIGNS)
                .input(IRON_NUGGET)
                .criterion(hasItem(LIME_DYE), conditionsFromItem(LIME_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.HANGING_LIME_SIGN)));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModItems.HANGING_GREEN_SIGN, 1)
                .input(GREEN_DYE)
                .input(ItemTags.HANGING_SIGNS)
                .input(IRON_NUGGET)
                .criterion(hasItem(GREEN_DYE), conditionsFromItem(GREEN_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.HANGING_GREEN_SIGN)));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModItems.HANGING_CYAN_SIGN, 1)
                .input(CYAN_DYE)
                .input(ItemTags.HANGING_SIGNS)
                .input(IRON_NUGGET)
                .criterion(hasItem(CYAN_DYE), conditionsFromItem(CYAN_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.HANGING_CYAN_SIGN)));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModItems.HANGING_LIGHT_BLUE_SIGN, 1)
                .input(LIGHT_BLUE_DYE)
                .input(ItemTags.HANGING_SIGNS)
                .input(IRON_NUGGET)
                .criterion(hasItem(LIGHT_BLUE_DYE), conditionsFromItem(LIGHT_BLUE_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.HANGING_LIGHT_BLUE_SIGN)));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModItems.HANGING_BLUE_SIGN, 1)
                .input(BLUE_DYE)
                .input(ItemTags.HANGING_SIGNS)
                .input(IRON_NUGGET)
                .criterion(hasItem(BLUE_DYE), conditionsFromItem(BLUE_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.HANGING_BLUE_SIGN)));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModItems.HANGING_PURPLE_SIGN, 1)
                .input(PURPLE_DYE)
                .input(ItemTags.HANGING_SIGNS)
                .input(IRON_NUGGET)
                .criterion(hasItem(PURPLE_DYE), conditionsFromItem(PURPLE_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.HANGING_PURPLE_SIGN)));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModItems.HANGING_MAGENTA_SIGN, 1)
                .input(MAGENTA_DYE)
                .input(ItemTags.HANGING_SIGNS)
                .input(IRON_NUGGET)
                .criterion(hasItem(MAGENTA_DYE), conditionsFromItem(MAGENTA_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.HANGING_MAGENTA_SIGN)));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModItems.HANGING_PINK_SIGN, 1)
                .input(PINK_DYE)
                .input(ItemTags.HANGING_SIGNS)
                .input(IRON_NUGGET)
                .criterion(hasItem(PINK_DYE), conditionsFromItem(PINK_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.HANGING_PINK_SIGN)));

        //conversion recipes for big signs
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.GRAY_BIG_STATION_SIGN_B, 1)
                .input(ModBlocks.GRAY_BIG_STATION_SIGN)
                .criterion(hasItem(ModBlocks.GRAY_BIG_STATION_SIGN), conditionsFromItem(ModBlocks.GRAY_BIG_STATION_SIGN))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.GRAY_BIG_STATION_SIGN_B)));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.GRAY_BIG_STATION_SIGN_C, 1)
                .input(ModBlocks.GRAY_BIG_STATION_SIGN_B)
                .criterion(hasItem(ModBlocks.GRAY_BIG_STATION_SIGN_B), conditionsFromItem(ModBlocks.GRAY_BIG_STATION_SIGN_B))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.GRAY_BIG_STATION_SIGN_C)));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.BLACK_BIG_STATION_SIGN_B, 1)
                .input(ModBlocks.BLACK_BIG_STATION_SIGN)
                .criterion(hasItem(ModBlocks.BLACK_BIG_STATION_SIGN), conditionsFromItem(ModBlocks.BLACK_BIG_STATION_SIGN))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.BLACK_BIG_STATION_SIGN_B)));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.BLACK_BIG_STATION_SIGN_C, 1)
                .input(ModBlocks.BLACK_BIG_STATION_SIGN_B)
                .criterion(hasItem(ModBlocks.BLACK_BIG_STATION_SIGN_B), conditionsFromItem(ModBlocks.BLACK_BIG_STATION_SIGN_B))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.BLACK_BIG_STATION_SIGN_C)));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.BLACK_BIG_STATION_SIGN_D, 1)
                .input(ModBlocks.BLACK_BIG_STATION_SIGN_C)
                .criterion(hasItem(ModBlocks.BLACK_BIG_STATION_SIGN_C), conditionsFromItem(ModBlocks.BLACK_BIG_STATION_SIGN_C))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.BLACK_BIG_STATION_SIGN_D)));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.ORANGE_BIG_STATION_SIGN_B, 1)
                .input(ModBlocks.ORANGE_BIG_STATION_SIGN)
                .criterion(hasItem(ModBlocks.ORANGE_BIG_STATION_SIGN), conditionsFromItem(ModBlocks.ORANGE_BIG_STATION_SIGN))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.ORANGE_BIG_STATION_SIGN_B)));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.YELLOW_BIG_STATION_SIGN_B, 1)
                .input(ModBlocks.YELLOW_BIG_STATION_SIGN)
                .criterion(hasItem(ModBlocks.YELLOW_BIG_STATION_SIGN), conditionsFromItem(ModBlocks.YELLOW_BIG_STATION_SIGN))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.YELLOW_BIG_STATION_SIGN_B)));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.LIME_BIG_STATION_SIGN_B, 1)
                .input(ModBlocks.LIME_BIG_STATION_SIGN)
                .criterion(hasItem(ModBlocks.LIME_BIG_STATION_SIGN), conditionsFromItem(ModBlocks.LIME_BIG_STATION_SIGN))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.LIME_BIG_STATION_SIGN_B)));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.GREEN_BIG_STATION_SIGN_B, 1)
                .input(ModBlocks.GREEN_BIG_STATION_SIGN)
                .criterion(hasItem(ModBlocks.GREEN_BIG_STATION_SIGN), conditionsFromItem(ModBlocks.GREEN_BIG_STATION_SIGN))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.GREEN_BIG_STATION_SIGN_B)));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.GREEN_BIG_STATION_SIGN_C, 1)
                .input(ModBlocks.GREEN_BIG_STATION_SIGN_B)
                .criterion(hasItem(ModBlocks.GREEN_BIG_STATION_SIGN_B), conditionsFromItem(ModBlocks.GREEN_BIG_STATION_SIGN_B))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.GREEN_BIG_STATION_SIGN_C)));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.GREEN_BIG_STATION_SIGN_D, 1)
                .input(ModBlocks.GREEN_BIG_STATION_SIGN_C)
                .criterion(hasItem(ModBlocks.GREEN_BIG_STATION_SIGN_C), conditionsFromItem(ModBlocks.GREEN_BIG_STATION_SIGN_C))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.GREEN_BIG_STATION_SIGN_D)));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.CYAN_BIG_STATION_SIGN_B, 1)
                .input(ModBlocks.CYAN_BIG_STATION_SIGN)
                .criterion(hasItem(ModBlocks.CYAN_BIG_STATION_SIGN), conditionsFromItem(ModBlocks.CYAN_BIG_STATION_SIGN))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CYAN_BIG_STATION_SIGN_B)));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.CYAN_BIG_STATION_SIGN_C, 1)
                .input(ModBlocks.CYAN_BIG_STATION_SIGN_B)
                .criterion(hasItem(ModBlocks.CYAN_BIG_STATION_SIGN_B), conditionsFromItem(ModBlocks.CYAN_BIG_STATION_SIGN_B))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CYAN_BIG_STATION_SIGN_C)));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.CYAN_BIG_STATION_SIGN_D, 1)
                .input(ModBlocks.CYAN_BIG_STATION_SIGN_C)
                .criterion(hasItem(ModBlocks.CYAN_BIG_STATION_SIGN_C), conditionsFromItem(ModBlocks.CYAN_BIG_STATION_SIGN_C))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CYAN_BIG_STATION_SIGN_D)));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.PURPLE_BIG_STATION_SIGN_B, 1)
                .input(ModBlocks.PURPLE_BIG_STATION_SIGN)
                .criterion(hasItem(ModBlocks.PURPLE_BIG_STATION_SIGN), conditionsFromItem(ModBlocks.PURPLE_BIG_STATION_SIGN))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.PURPLE_BIG_STATION_SIGN_B)));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.PURPLE_BIG_STATION_SIGN_C, 1)
                .input(ModBlocks.PURPLE_BIG_STATION_SIGN_B)
                .criterion(hasItem(ModBlocks.PURPLE_BIG_STATION_SIGN_B), conditionsFromItem(ModBlocks.PURPLE_BIG_STATION_SIGN_B))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.PURPLE_BIG_STATION_SIGN_C)));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.PURPLE_BIG_STATION_SIGN_D, 1)
                .input(ModBlocks.PURPLE_BIG_STATION_SIGN_C)
                .criterion(hasItem(ModBlocks.PURPLE_BIG_STATION_SIGN_C), conditionsFromItem(ModBlocks.PURPLE_BIG_STATION_SIGN_C))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.PURPLE_BIG_STATION_SIGN_D)));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.PINK_BIG_STATION_SIGN_B, 1)
                .input(ModBlocks.PINK_BIG_STATION_SIGN)
                .criterion(hasItem(ModBlocks.PINK_BIG_STATION_SIGN), conditionsFromItem(ModBlocks.PINK_BIG_STATION_SIGN))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.PINK_BIG_STATION_SIGN_B)));

        //shaped recipes for big signs
        //would like to offer a slightly cheaper create mod based recipe as well
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.WHITE_BIG_STATION_SIGN, 12)
                .pattern("idi")
                .pattern("isi")
                .pattern("iii")
                .input('i', IRON_INGOT)
                .input('d', WHITE_DYE)
                .input('s', ItemTags.SIGNS)
                .criterion(hasItem(WHITE_DYE), conditionsFromItem(WHITE_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.WHITE_BIG_STATION_SIGN)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_GRAY_BIG_STATION_SIGN, 12)
                .pattern("idi")
                .pattern("isi")
                .pattern("iii")
                .input('i', IRON_INGOT)
                .input('d', LIGHT_GRAY_DYE)
                .input('s', ItemTags.SIGNS)
                .criterion(hasItem(LIGHT_GRAY_DYE), conditionsFromItem(LIGHT_GRAY_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.LIGHT_GRAY_BIG_STATION_SIGN)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.GRAY_BIG_STATION_SIGN, 12)
                .pattern("idi")
                .pattern("isi")
                .pattern("iii")
                .input('i', IRON_INGOT)
                .input('d', GRAY_DYE)
                .input('s', ItemTags.SIGNS)
                .criterion(hasItem(GRAY_DYE), conditionsFromItem(GRAY_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.GRAY_BIG_STATION_SIGN)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.BLACK_BIG_STATION_SIGN, 12)
                .pattern("idi")
                .pattern("isi")
                .pattern("iii")
                .input('i', IRON_INGOT)
                .input('d', BLACK_DYE)
                .input('s', ItemTags.SIGNS)
                .criterion(hasItem(BLACK_DYE), conditionsFromItem(BLACK_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.BLACK_BIG_STATION_SIGN)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.BROWN_BIG_STATION_SIGN, 12)
                .pattern("idi")
                .pattern("isi")
                .pattern("iii")
                .input('i', IRON_INGOT)
                .input('d', BROWN_DYE)
                .input('s', ItemTags.SIGNS)
                .criterion(hasItem(BROWN_DYE), conditionsFromItem(BROWN_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.BROWN_BIG_STATION_SIGN)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.RED_BIG_STATION_SIGN, 12)
                .pattern("idi")
                .pattern("isi")
                .pattern("iii")
                .input('i', IRON_INGOT)
                .input('d', RED_DYE)
                .input('s', ItemTags.SIGNS)
                .criterion(hasItem(RED_DYE), conditionsFromItem(RED_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.RED_BIG_STATION_SIGN)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.ORANGE_BIG_STATION_SIGN, 12)
                .pattern("idi")
                .pattern("isi")
                .pattern("iii")
                .input('i', IRON_INGOT)
                .input('d', ORANGE_DYE)
                .input('s', ItemTags.SIGNS)
                .criterion(hasItem(ORANGE_DYE), conditionsFromItem(ORANGE_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.ORANGE_BIG_STATION_SIGN)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.YELLOW_BIG_STATION_SIGN, 12)
                .pattern("idi")
                .pattern("isi")
                .pattern("iii")
                .input('i', IRON_INGOT)
                .input('d', YELLOW_DYE)
                .input('s', ItemTags.SIGNS)
                .criterion(hasItem(YELLOW_DYE), conditionsFromItem(YELLOW_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.YELLOW_BIG_STATION_SIGN)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.LIME_BIG_STATION_SIGN, 12)
                .pattern("idi")
                .pattern("isi")
                .pattern("iii")
                .input('i', IRON_INGOT)
                .input('d', LIME_DYE)
                .input('s', ItemTags.SIGNS)
                .criterion(hasItem(LIME_DYE), conditionsFromItem(LIME_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.LIME_BIG_STATION_SIGN)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.GREEN_BIG_STATION_SIGN, 12)
                .pattern("idi")
                .pattern("isi")
                .pattern("iii")
                .input('i', IRON_INGOT)
                .input('d', GREEN_DYE)
                .input('s', ItemTags.SIGNS)
                .criterion(hasItem(GREEN_DYE), conditionsFromItem(GREEN_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.GREEN_BIG_STATION_SIGN)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.CYAN_BIG_STATION_SIGN, 12)
                .pattern("idi")
                .pattern("isi")
                .pattern("iii")
                .input('i', IRON_INGOT)
                .input('d', CYAN_DYE)
                .input('s', ItemTags.SIGNS)
                .criterion(hasItem(CYAN_DYE), conditionsFromItem(CYAN_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CYAN_BIG_STATION_SIGN)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_BLUE_BIG_STATION_SIGN, 12)
                .pattern("idi")
                .pattern("isi")
                .pattern("iii")
                .input('i', IRON_INGOT)
                .input('d', LIGHT_BLUE_DYE)
                .input('s', ItemTags.SIGNS)
                .criterion(hasItem(LIGHT_BLUE_DYE), conditionsFromItem(LIGHT_BLUE_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.LIGHT_BLUE_BIG_STATION_SIGN)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.BLUE_BIG_STATION_SIGN, 12)
                .pattern("idi")
                .pattern("isi")
                .pattern("iii")
                .input('i', IRON_INGOT)
                .input('d', BLUE_DYE)
                .input('s', ItemTags.SIGNS)
                .criterion(hasItem(BLUE_DYE), conditionsFromItem(BLUE_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.BLUE_BIG_STATION_SIGN)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.PURPLE_BIG_STATION_SIGN, 12)
                .pattern("idi")
                .pattern("isi")
                .pattern("iii")
                .input('i', IRON_INGOT)
                .input('d', PURPLE_DYE)
                .input('s', ItemTags.SIGNS)
                .criterion(hasItem(PURPLE_DYE), conditionsFromItem(PURPLE_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.PURPLE_BIG_STATION_SIGN)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.MAGENTA_BIG_STATION_SIGN, 12)
                .pattern("idi")
                .pattern("isi")
                .pattern("iii")
                .input('i', IRON_INGOT)
                .input('d', MAGENTA_DYE)
                .input('s', ItemTags.SIGNS)
                .criterion(hasItem(MAGENTA_DYE), conditionsFromItem(MAGENTA_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.MAGENTA_BIG_STATION_SIGN)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.PINK_BIG_STATION_SIGN, 12)
                .pattern("idi")
                .pattern("isi")
                .pattern("iii")
                .input('i', IRON_INGOT)
                .input('d', PINK_DYE)
                .input('s', ItemTags.SIGNS)
                .criterion(hasItem(PINK_DYE), conditionsFromItem(PINK_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.PINK_BIG_STATION_SIGN)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.OAK_BIG_STATION_SIGN, 12)
                .pattern("idi")
                .pattern("isi")
                .pattern("iii")
                .input('i', OAK_PLANKS)
                .input('d', OAK_LOG)
                .input('s', OAK_SIGN)
                .criterion(hasItem(OAK_PLANKS), conditionsFromItem(OAK_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.OAK_BIG_STATION_SIGN)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.BIRCH_BIG_STATION_SIGN, 12)
                .pattern("idi")
                .pattern("isi")
                .pattern("iii")
                .input('i', BIRCH_PLANKS)
                .input('d', BIRCH_LOG)
                .input('s', BIRCH_SIGN)
                .criterion(hasItem(BIRCH_PLANKS), conditionsFromItem(BIRCH_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.BIRCH_BIG_STATION_SIGN)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.JUNGLE_BIG_STATION_SIGN, 12)
                .pattern("idi")
                .pattern("isi")
                .pattern("iii")
                .input('i', JUNGLE_PLANKS)
                .input('d', JUNGLE_LOG)
                .input('s', JUNGLE_SIGN)
                .criterion(hasItem(JUNGLE_PLANKS), conditionsFromItem(JUNGLE_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.JUNGLE_BIG_STATION_SIGN)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.SPRUCE_BIG_STATION_SIGN, 12)
                .pattern("idi")
                .pattern("isi")
                .pattern("iii")
                .input('i', SPRUCE_PLANKS)
                .input('d', SPRUCE_LOG)
                .input('s', SPRUCE_SIGN)
                .criterion(hasItem(SPRUCE_PLANKS), conditionsFromItem(SPRUCE_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.SPRUCE_BIG_STATION_SIGN)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.ACACIA_BIG_STATION_SIGN, 12)
                .pattern("idi")
                .pattern("isi")
                .pattern("iii")
                .input('i', ACACIA_PLANKS)
                .input('d', ACACIA_LOG)
                .input('s', ACACIA_SIGN)
                .criterion(hasItem(ACACIA_PLANKS), conditionsFromItem(ACACIA_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.ACACIA_BIG_STATION_SIGN)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.DARK_OAK_BIG_STATION_SIGN, 12)
                .pattern("idi")
                .pattern("isi")
                .pattern("iii")
                .input('i', DARK_OAK_PLANKS)
                .input('d', DARK_OAK_LOG)
                .input('s', DARK_OAK_SIGN)
                .criterion(hasItem(DARK_OAK_PLANKS), conditionsFromItem(DARK_OAK_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.DARK_OAK_BIG_STATION_SIGN)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.BAMBOO_BIG_STATION_SIGN, 12)
                .pattern("idi")
                .pattern("isi")
                .pattern("iii")
                .input('i', BAMBOO_PLANKS)
                .input('d', BAMBOO_BLOCK)
                .input('s', BAMBOO_SIGN)
                .criterion(hasItem(BAMBOO_PLANKS), conditionsFromItem(BAMBOO_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.BAMBOO_BIG_STATION_SIGN)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.CRIMSON_BIG_STATION_SIGN, 12)
                .pattern("idi")
                .pattern("isi")
                .pattern("iii")
                .input('i', CRIMSON_PLANKS)
                .input('d', CRIMSON_STEM)
                .input('s', CRIMSON_SIGN)
                .criterion(hasItem(CRIMSON_PLANKS), conditionsFromItem(CRIMSON_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CRIMSON_BIG_STATION_SIGN)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.WARPED_BIG_STATION_SIGN, 12)
                .pattern("idi")
                .pattern("isi")
                .pattern("iii")
                .input('i', WARPED_PLANKS)
                .input('d', WARPED_STEM)
                .input('s', WARPED_SIGN)
                .criterion(hasItem(WARPED_PLANKS), conditionsFromItem(WARPED_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.WARPED_BIG_STATION_SIGN)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.CHERRY_BIG_STATION_SIGN, 12)
                .pattern("idi")
                .pattern("isi")
                .pattern("iii")
                .input('i', CHERRY_PLANKS)
                .input('d', CHERRY_LOG)
                .input('s', CHERRY_SIGN)
                .criterion(hasItem(CHERRY_PLANKS), conditionsFromItem(CHERRY_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CHERRY_BIG_STATION_SIGN)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.MANGROVE_BIG_STATION_SIGN, 12)
                .pattern("idi")
                .pattern("isi")
                .pattern("iii")
                .input('i', MANGROVE_PLANKS)
                .input('d', MANGROVE_LOG)
                .input('s', MANGROVE_SIGN)
                .criterion(hasItem(MANGROVE_PLANKS), conditionsFromItem(MANGROVE_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.MANGROVE_BIG_STATION_SIGN)));
    }
}
