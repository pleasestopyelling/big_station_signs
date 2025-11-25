package net.cutecharm.bigstationsigns.datagen;

import net.cutecharm.bigstationsigns.block.ModBlocks;
import net.cutecharm.bigstationsigns.tags.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {

        getOrCreateTagBuilder(ModTags.PAINTABLE)
                .add(ModBlocks.WHITE_BIG_STATION_SIGN.asItem())
                .add(ModBlocks.LIGHT_GRAY_BIG_STATION_SIGN.asItem())
                .add(ModBlocks.GRAY_BIG_STATION_SIGN.asItem())
                .add(ModBlocks.GRAY_BIG_STATION_SIGN_B.asItem())
                .add(ModBlocks.BLACK_BIG_STATION_SIGN.asItem())
                .add(ModBlocks.BROWN_BIG_STATION_SIGN.asItem())
                .add(ModBlocks.RED_BIG_STATION_SIGN.asItem())
                .add(ModBlocks.ORANGE_BIG_STATION_SIGN.asItem())
                .add(ModBlocks.YELLOW_BIG_STATION_SIGN.asItem())
                .add(ModBlocks.LIME_BIG_STATION_SIGN.asItem())
                .add(ModBlocks.GREEN_BIG_STATION_SIGN.asItem())
                .add(ModBlocks.CYAN_BIG_STATION_SIGN.asItem())
                .add(ModBlocks.LIGHT_BLUE_BIG_STATION_SIGN.asItem())
                .add(ModBlocks.BLUE_BIG_STATION_SIGN.asItem())
                .add(ModBlocks.PURPLE_BIG_STATION_SIGN.asItem())
                .add(ModBlocks.PURPLE_BIG_STATION_SIGN_B.asItem())
                .add(ModBlocks.MAGENTA_BIG_STATION_SIGN.asItem())
                .add(ModBlocks.PINK_BIG_STATION_SIGN.asItem())
                .add(ModBlocks.CERULEAN_BIG_STATION_SIGN.asItem());

    }
}
