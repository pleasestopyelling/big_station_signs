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
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SIGNING_TABLE, 1)
                .pattern("si")
                .pattern("ic")
                .input('i', IRON_INGOT)
                .input('c', CRAFTING_TABLE)
                .input('s', INK_SAC)
                .criterion(hasItem(CRAFTING_TABLE), conditionsFromItem(CRAFTING_TABLE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.SIGNING_TABLE)));

        //shaped recipes for big signs
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.BROWN_BIG_STATION_SIGN, 12)
                .pattern("ici")
                .pattern("isi")
                .pattern("iii")
                .input('i', IRON_INGOT)
                .input('c', CHAIN)
                .input('s', ItemTags.SIGNS)
                .criterion(hasItem(IRON_INGOT), conditionsFromItem(IRON_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.BROWN_BIG_STATION_SIGN)));

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
