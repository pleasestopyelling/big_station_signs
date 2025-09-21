package net.cutecharm.bigstationsigns.datagen;

import net.cutecharm.bigstationsigns.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
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
        //conversion recipes for big signs
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.GRAY_BIG_STATION_SIGN_B, 1)
                .input(ModBlocks.GRAY_BIG_STATION_SIGN)
                .criterion(hasItem(ModBlocks.GRAY_BIG_STATION_SIGN), conditionsFromItem(ModBlocks.GRAY_BIG_STATION_SIGN))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.GRAY_BIG_STATION_SIGN_B)));

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
