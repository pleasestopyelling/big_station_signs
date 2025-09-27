package net.cutecharm.bigstationsigns.block;

import net.cutecharm.bigstationsigns.BigStationSigns;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block SIGNING_TABLE = registerBlock("signing_table",
            new SigningTable(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    //big signs
    public static final Block WHITE_BIG_STATION_SIGN = registerBlock("white_big_sign",
            new GrayBigStationSign(FabricBlockSettings.copyOf(Blocks.CHAIN).sounds(BlockSoundGroup.CHAIN).noBlockBreakParticles().nonOpaque()));
    public static final Block LIGHT_GRAY_BIG_STATION_SIGN = registerBlock("light_gray_big_sign",
            new GrayBigStationSign(FabricBlockSettings.copyOf(Blocks.CHAIN).sounds(BlockSoundGroup.CHAIN).noBlockBreakParticles().nonOpaque()));
    public static final Block GRAY_BIG_STATION_SIGN = registerBlock("gray_big_sign",
            new GrayBigStationSign(FabricBlockSettings.copyOf(Blocks.CHAIN).sounds(BlockSoundGroup.CHAIN).noBlockBreakParticles().nonOpaque()));
    public static final Block GRAY_BIG_STATION_SIGN_B = registerBlock("gray_big_sign_b",
            new GrayBigStationSign(FabricBlockSettings.copyOf(Blocks.CHAIN).sounds(BlockSoundGroup.CHAIN).dropsLike(GRAY_BIG_STATION_SIGN).noBlockBreakParticles().nonOpaque()));
    public static final Block BLACK_BIG_STATION_SIGN = registerBlock("black_big_sign",
            new GrayBigStationSign(FabricBlockSettings.copyOf(Blocks.CHAIN).sounds(BlockSoundGroup.CHAIN).noBlockBreakParticles().nonOpaque()));
    public static final Block BROWN_BIG_STATION_SIGN = registerBlock("brown_big_sign",
            new GrayBigStationSign(FabricBlockSettings.copyOf(Blocks.CHAIN).sounds(BlockSoundGroup.CHAIN).noBlockBreakParticles().nonOpaque()));
    public static final Block RED_BIG_STATION_SIGN = registerBlock("red_big_sign",
            new GrayBigStationSign(FabricBlockSettings.copyOf(Blocks.CHAIN).sounds(BlockSoundGroup.CHAIN).noBlockBreakParticles().nonOpaque()));
    public static final Block ORANGE_BIG_STATION_SIGN = registerBlock("orange_big_sign",
            new GrayBigStationSign(FabricBlockSettings.copyOf(Blocks.CHAIN).sounds(BlockSoundGroup.CHAIN).noBlockBreakParticles().nonOpaque()));
    public static final Block YELLOW_BIG_STATION_SIGN = registerBlock("yellow_big_sign",
            new GrayBigStationSign(FabricBlockSettings.copyOf(Blocks.CHAIN).sounds(BlockSoundGroup.CHAIN).noBlockBreakParticles().nonOpaque()));
    public static final Block LIME_BIG_STATION_SIGN = registerBlock("lime_big_sign",
            new GrayBigStationSign(FabricBlockSettings.copyOf(Blocks.CHAIN).sounds(BlockSoundGroup.CHAIN).noBlockBreakParticles().nonOpaque()));
    public static final Block GREEN_BIG_STATION_SIGN = registerBlock("green_big_sign",
            new GrayBigStationSign(FabricBlockSettings.copyOf(Blocks.CHAIN).sounds(BlockSoundGroup.CHAIN).noBlockBreakParticles().nonOpaque()));
    public static final Block CYAN_BIG_STATION_SIGN = registerBlock("cyan_big_sign",
            new GrayBigStationSign(FabricBlockSettings.copyOf(Blocks.CHAIN).sounds(BlockSoundGroup.CHAIN).noBlockBreakParticles().nonOpaque()));
    public static final Block LIGHT_BLUE_BIG_STATION_SIGN = registerBlock("light_blue_big_sign",
            new GrayBigStationSign(FabricBlockSettings.copyOf(Blocks.CHAIN).sounds(BlockSoundGroup.CHAIN).noBlockBreakParticles().nonOpaque()));
    public static final Block BLUE_BIG_STATION_SIGN = registerBlock("blue_big_sign",
            new GrayBigStationSign(FabricBlockSettings.copyOf(Blocks.CHAIN).sounds(BlockSoundGroup.CHAIN).noBlockBreakParticles().nonOpaque()));
    public static final Block PURPLE_BIG_STATION_SIGN = registerBlock("purple_big_sign",
            new GrayBigStationSign(FabricBlockSettings.copyOf(Blocks.CHAIN).sounds(BlockSoundGroup.CHAIN).noBlockBreakParticles().nonOpaque()));
    public static final Block PURPLE_BIG_STATION_SIGN_B = registerBlock("purple_big_sign_b",
            new GrayBigStationSign(FabricBlockSettings.copyOf(Blocks.CHAIN).sounds(BlockSoundGroup.CHAIN).noBlockBreakParticles().nonOpaque()));
    public static final Block MAGENTA_BIG_STATION_SIGN = registerBlock("magenta_big_sign",
            new GrayBigStationSign(FabricBlockSettings.copyOf(Blocks.CHAIN).sounds(BlockSoundGroup.CHAIN).noBlockBreakParticles().nonOpaque()));
    public static final Block PINK_BIG_STATION_SIGN = registerBlock("pink_big_sign",
            new GrayBigStationSign(FabricBlockSettings.copyOf(Blocks.CHAIN).sounds(BlockSoundGroup.CHAIN).noBlockBreakParticles().nonOpaque()));
    public static final Block CERULEAN_BIG_STATION_SIGN = registerBlock("cerulean_big_sign",
            new GrayBigStationSign(FabricBlockSettings.copyOf(Blocks.CHAIN).sounds(BlockSoundGroup.CHAIN).noBlockBreakParticles().nonOpaque()));

    public static final Block OAK_BIG_STATION_SIGN = registerBlock("oak_big_sign",
            new GrayBigStationSign(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).noBlockBreakParticles().nonOpaque()));
    public static final Block BIRCH_BIG_STATION_SIGN = registerBlock("birch_big_sign",
            new GrayBigStationSign(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).noBlockBreakParticles().nonOpaque()));
    public static final Block JUNGLE_BIG_STATION_SIGN = registerBlock("jungle_big_sign",
            new GrayBigStationSign(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).noBlockBreakParticles().nonOpaque()));
    public static final Block SPRUCE_BIG_STATION_SIGN = registerBlock("spruce_big_sign",
            new GrayBigStationSign(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).noBlockBreakParticles().nonOpaque()));
    public static final Block ACACIA_BIG_STATION_SIGN = registerBlock("acacia_big_sign",
            new GrayBigStationSign(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).noBlockBreakParticles().nonOpaque()));
    public static final Block DARK_OAK_BIG_STATION_SIGN = registerBlock("dark_oak_big_sign",
            new GrayBigStationSign(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).noBlockBreakParticles().nonOpaque()));
    public static final Block BAMBOO_BIG_STATION_SIGN = registerBlock("bamboo_big_sign",
            new GrayBigStationSign(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).noBlockBreakParticles().nonOpaque()));
    public static final Block CRIMSON_BIG_STATION_SIGN = registerBlock("crimson_big_sign",
            new GrayBigStationSign(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).noBlockBreakParticles().nonOpaque()));
    public static final Block WARPED_BIG_STATION_SIGN = registerBlock("warped_big_sign",
            new GrayBigStationSign(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).noBlockBreakParticles().nonOpaque()));
    public static final Block CHERRY_BIG_STATION_SIGN = registerBlock("cherry_big_sign",
            new GrayBigStationSign(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).noBlockBreakParticles().nonOpaque()));
    public static final Block MANGROVE_BIG_STATION_SIGN = registerBlock("mangrove_big_sign",
            new GrayBigStationSign(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).noBlockBreakParticles().nonOpaque()));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(BigStationSigns.MOD_ID, name), block);

    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(BigStationSigns.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        BigStationSigns.LOGGER.info("Registering Mod Blocks for " + BigStationSigns.MOD_ID);

    }
}
