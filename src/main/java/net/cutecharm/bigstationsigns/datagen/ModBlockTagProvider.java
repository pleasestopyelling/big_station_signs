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
