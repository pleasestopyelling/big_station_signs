package net.cutecharm.bigstationsigns.datagen;

import net.cutecharm.bigstationsigns.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.SIGNING_TABLE);
        addDrop(ModBlocks.WHITE_BIG_STATION_SIGN);
        addDrop(ModBlocks.LIGHT_GRAY_BIG_STATION_SIGN);
        addDrop(ModBlocks.GRAY_BIG_STATION_SIGN);
        addDrop(ModBlocks.GRAY_BIG_STATION_SIGN_B);
        addDrop(ModBlocks.BLACK_BIG_STATION_SIGN);
        addDrop(ModBlocks.BROWN_BIG_STATION_SIGN);
        addDrop(ModBlocks.RED_BIG_STATION_SIGN);
        addDrop(ModBlocks.ORANGE_BIG_STATION_SIGN);
        addDrop(ModBlocks.YELLOW_BIG_STATION_SIGN);
        addDrop(ModBlocks.LIME_BIG_STATION_SIGN);
        addDrop(ModBlocks.GREEN_BIG_STATION_SIGN);
        addDrop(ModBlocks.CYAN_BIG_STATION_SIGN);
        addDrop(ModBlocks.LIGHT_BLUE_BIG_STATION_SIGN);
        addDrop(ModBlocks.BLUE_BIG_STATION_SIGN);
        addDrop(ModBlocks.PURPLE_BIG_STATION_SIGN);
        addDrop(ModBlocks.MAGENTA_BIG_STATION_SIGN);
        addDrop(ModBlocks.PINK_BIG_STATION_SIGN);
        addDrop(ModBlocks.OAK_BIG_STATION_SIGN);
        addDrop(ModBlocks.BIRCH_BIG_STATION_SIGN);
        addDrop(ModBlocks.JUNGLE_BIG_STATION_SIGN);
        addDrop(ModBlocks.SPRUCE_BIG_STATION_SIGN);
        addDrop(ModBlocks.ACACIA_BIG_STATION_SIGN);
        addDrop(ModBlocks.DARK_OAK_BIG_STATION_SIGN);
        addDrop(ModBlocks.BAMBOO_BIG_STATION_SIGN);
        addDrop(ModBlocks.CRIMSON_BIG_STATION_SIGN);
        addDrop(ModBlocks.WARPED_BIG_STATION_SIGN);
        addDrop(ModBlocks.CHERRY_BIG_STATION_SIGN);
        addDrop(ModBlocks.MANGROVE_BIG_STATION_SIGN);

    }
}
