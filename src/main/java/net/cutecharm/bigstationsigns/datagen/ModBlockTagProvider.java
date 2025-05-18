package net.cutecharm.bigstationsigns.datagen;

import net.cutecharm.bigstationsigns.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    //blocks to be mined with pickaxe
    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.STANDING_ORANGE_SIGN)
                .add(ModBlocks.STANDING_ORANGE_SIGN_B)
                .add(ModBlocks.WALL_ORANGE_SIGN)
                .add(ModBlocks.WALL_ORANGE_SIGN_B)
                .add(ModBlocks.HANGING_ORANGE_SIGN)
                .add(ModBlocks.WALL_HANGING_ORANGE_SIGN)

                .add(ModBlocks.STANDING_RED_SIGN)
                .add(ModBlocks.WALL_RED_SIGN)
                .add(ModBlocks.HANGING_RED_SIGN)
                .add(ModBlocks.WALL_HANGING_RED_SIGN)

                .add(ModBlocks.STANDING_BLACK_SIGN)
                .add(ModBlocks.STANDING_BLACK_SIGN_B)
                .add(ModBlocks.STANDING_BLACK_SIGN_C)
                .add(ModBlocks.STANDING_BLACK_SIGN_D)
                .add(ModBlocks.WALL_BLACK_SIGN)
                .add(ModBlocks.WALL_BLACK_SIGN_B)
                .add(ModBlocks.WALL_BLACK_SIGN_C)
                .add(ModBlocks.WALL_BLACK_SIGN_D)
                .add(ModBlocks.HANGING_BLACK_SIGN)
                .add(ModBlocks.WALL_HANGING_BLACK_SIGN)

                .add(ModBlocks.STANDING_PINK_SIGN)
                .add(ModBlocks.STANDING_PINK_SIGN_B)
                .add(ModBlocks.WALL_PINK_SIGN)
                .add(ModBlocks.WALL_PINK_SIGN_B)
                .add(ModBlocks.HANGING_PINK_SIGN)
                .add(ModBlocks.WALL_HANGING_PINK_SIGN)

                .add(ModBlocks.STANDING_GRAY_SIGN)
                .add(ModBlocks.WALL_GRAY_SIGN)
                .add(ModBlocks.STANDING_GRAY_SIGN_B)
                .add(ModBlocks.WALL_GRAY_SIGN_B)
                .add(ModBlocks.STANDING_GRAY_SIGN_C)
                .add(ModBlocks.WALL_GRAY_SIGN_C)
                .add(ModBlocks.HANGING_GRAY_SIGN)
                .add(ModBlocks.WALL_HANGING_GRAY_SIGN)

                .add(ModBlocks.STANDING_LIME_SIGN)
                .add(ModBlocks.STANDING_LIME_SIGN_B)
                .add(ModBlocks.WALL_LIME_SIGN)
                .add(ModBlocks.WALL_LIME_SIGN_B)
                .add(ModBlocks.HANGING_LIME_SIGN)
                .add(ModBlocks.WALL_HANGING_LIME_SIGN)

                .add(ModBlocks.STANDING_PURPLE_SIGN)
                .add(ModBlocks.STANDING_PURPLE_SIGN_B)
                .add(ModBlocks.STANDING_PURPLE_SIGN_C)
                .add(ModBlocks.STANDING_PURPLE_SIGN_D)
                .add(ModBlocks.WALL_PURPLE_SIGN)
                .add(ModBlocks.WALL_PURPLE_SIGN_B)
                .add(ModBlocks.WALL_PURPLE_SIGN_C)
                .add(ModBlocks.WALL_PURPLE_SIGN_D)
                .add(ModBlocks.HANGING_PURPLE_SIGN)
                .add(ModBlocks.WALL_HANGING_PURPLE_SIGN)

                .add(ModBlocks.STANDING_BLUE_SIGN)
                .add(ModBlocks.WALL_BLUE_SIGN)
                .add(ModBlocks.HANGING_BLUE_SIGN)
                .add(ModBlocks.WALL_HANGING_BLUE_SIGN)

                .add(ModBlocks.STANDING_MAGENTA_SIGN)
                .add(ModBlocks.WALL_MAGENTA_SIGN)
                .add(ModBlocks.HANGING_MAGENTA_SIGN)
                .add(ModBlocks.WALL_HANGING_MAGENTA_SIGN)

                .add(ModBlocks.STANDING_LIGHT_GRAY_SIGN)
                .add(ModBlocks.WALL_LIGHT_GRAY_SIGN)
                .add(ModBlocks.HANGING_LIGHT_GRAY_SIGN)
                .add(ModBlocks.WALL_HANGING_LIGHT_GRAY_SIGN)

                .add(ModBlocks.STANDING_GREEN_SIGN)
                .add(ModBlocks.STANDING_GREEN_SIGN_B)
                .add(ModBlocks.STANDING_GREEN_SIGN_C)
                .add(ModBlocks.STANDING_GREEN_SIGN_D)
                .add(ModBlocks.WALL_GREEN_SIGN)
                .add(ModBlocks.WALL_GREEN_SIGN_B)
                .add(ModBlocks.WALL_GREEN_SIGN_C)
                .add(ModBlocks.WALL_GREEN_SIGN_D)
                .add(ModBlocks.HANGING_GREEN_SIGN)
                .add(ModBlocks.WALL_HANGING_GREEN_SIGN)

                .add(ModBlocks.STANDING_YELLOW_SIGN)
                .add(ModBlocks.STANDING_YELLOW_SIGN_B)
                .add(ModBlocks.WALL_YELLOW_SIGN)
                .add(ModBlocks.WALL_YELLOW_SIGN_B)
                .add(ModBlocks.HANGING_YELLOW_SIGN)
                .add(ModBlocks.WALL_HANGING_YELLOW_SIGN)

                .add(ModBlocks.STANDING_LIGHT_BLUE_SIGN)
                .add(ModBlocks.WALL_LIGHT_BLUE_SIGN)
                .add(ModBlocks.HANGING_LIGHT_BLUE_SIGN)
                .add(ModBlocks.WALL_HANGING_LIGHT_BLUE_SIGN)

                .add(ModBlocks.STANDING_BROWN_SIGN)
                .add(ModBlocks.WALL_BROWN_SIGN)
                .add(ModBlocks.HANGING_BROWN_SIGN)
                .add(ModBlocks.WALL_HANGING_BROWN_SIGN)

                .add(ModBlocks.STANDING_WHITE_SIGN)
                .add(ModBlocks.WALL_WHITE_SIGN)
                .add(ModBlocks.HANGING_WHITE_SIGN)
                .add(ModBlocks.WALL_HANGING_WHITE_SIGN)

                .add(ModBlocks.STANDING_CYAN_SIGN)
                .add(ModBlocks.STANDING_CYAN_SIGN_B)
                .add(ModBlocks.STANDING_CYAN_SIGN_C)
                .add(ModBlocks.STANDING_CYAN_SIGN_D)
                .add(ModBlocks.WALL_CYAN_SIGN)
                .add(ModBlocks.WALL_CYAN_SIGN_B)
                .add(ModBlocks.WALL_CYAN_SIGN_C)
                .add(ModBlocks.WALL_CYAN_SIGN_D)
                .add(ModBlocks.WALL_HANGING_CYAN_SIGN)

                .add(ModBlocks.WHITE_BIG_STATION_SIGN)
                .add(ModBlocks.LIGHT_GRAY_BIG_STATION_SIGN)
                .add(ModBlocks.GRAY_BIG_STATION_SIGN)
                .add(ModBlocks.GRAY_BIG_STATION_SIGN_B)
                .add(ModBlocks.BLACK_BIG_STATION_SIGN)
                .add(ModBlocks.BROWN_BIG_STATION_SIGN)
                .add(ModBlocks.RED_BIG_STATION_SIGN)
                .add(ModBlocks.ORANGE_BIG_STATION_SIGN)
                .add(ModBlocks.YELLOW_BIG_STATION_SIGN)
                .add(ModBlocks.LIME_BIG_STATION_SIGN)
                .add(ModBlocks.GREEN_BIG_STATION_SIGN)
                .add(ModBlocks.CYAN_BIG_STATION_SIGN)
                .add(ModBlocks.LIGHT_BLUE_BIG_STATION_SIGN)
                .add(ModBlocks.BLUE_BIG_STATION_SIGN)
                .add(ModBlocks.PURPLE_BIG_STATION_SIGN)
                .add(ModBlocks.MAGENTA_BIG_STATION_SIGN)
                .add(ModBlocks.PINK_BIG_STATION_SIGN);

        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
                .add(ModBlocks.OAK_BIG_STATION_SIGN)
                .add(ModBlocks.BIRCH_BIG_STATION_SIGN)
                .add(ModBlocks.JUNGLE_BIG_STATION_SIGN)
                .add(ModBlocks.SPRUCE_BIG_STATION_SIGN)
                .add(ModBlocks.ACACIA_BIG_STATION_SIGN)
                .add(ModBlocks.DARK_OAK_BIG_STATION_SIGN)
                .add(ModBlocks.BAMBOO_BIG_STATION_SIGN)
                .add(ModBlocks.CRIMSON_BIG_STATION_SIGN)
                .add(ModBlocks.WARPED_BIG_STATION_SIGN)
                .add(ModBlocks.CHERRY_BIG_STATION_SIGN)
                .add(ModBlocks.MANGROVE_BIG_STATION_SIGN);

    }
}
