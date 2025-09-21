package net.cutecharm.bigstationsigns.block.entity;

import net.cutecharm.bigstationsigns.BigStationSigns;
import net.cutecharm.bigstationsigns.block.ModBlocks;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.block.entity.SignBlockEntity;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlockEntities {
    public static final BlockEntityType<SigningTableBlockEntity> SIGNING_TABLE_BLOCK_ENTITY =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(BigStationSigns.MOD_ID, "signing_table_be"),
                    FabricBlockEntityTypeBuilder.create(SigningTableBlockEntity::new,
                            ModBlocks.SIGNING_TABLE).build());
    public static final BlockEntityType<BigStationSignBlockEntity> BIG_STATION_SIGN_BLOCK_ENTITY =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(BigStationSigns.MOD_ID, "bss_be"),
                    FabricBlockEntityTypeBuilder.create(BigStationSignBlockEntity::new,
                            ModBlocks.WHITE_BIG_STATION_SIGN,
                            ModBlocks.LIGHT_GRAY_BIG_STATION_SIGN,
                            ModBlocks.GRAY_BIG_STATION_SIGN,
                            ModBlocks.GRAY_BIG_STATION_SIGN_B,
                            ModBlocks.BLACK_BIG_STATION_SIGN,
                            ModBlocks.BROWN_BIG_STATION_SIGN,
                            ModBlocks.RED_BIG_STATION_SIGN,
                            ModBlocks.ORANGE_BIG_STATION_SIGN,
                            ModBlocks.YELLOW_BIG_STATION_SIGN,
                            ModBlocks.GREEN_BIG_STATION_SIGN,
                            ModBlocks.LIME_BIG_STATION_SIGN,
                            ModBlocks.CYAN_BIG_STATION_SIGN,
                            ModBlocks.LIGHT_BLUE_BIG_STATION_SIGN,
                            ModBlocks.BLUE_BIG_STATION_SIGN,
                            ModBlocks.PURPLE_BIG_STATION_SIGN,
                            ModBlocks.MAGENTA_BIG_STATION_SIGN,
                            ModBlocks.PINK_BIG_STATION_SIGN,
                            ModBlocks.OAK_BIG_STATION_SIGN,
                            ModBlocks.BIRCH_BIG_STATION_SIGN,
                            ModBlocks.JUNGLE_BIG_STATION_SIGN,
                            ModBlocks.SPRUCE_BIG_STATION_SIGN,
                            ModBlocks.ACACIA_BIG_STATION_SIGN,
                            ModBlocks.DARK_OAK_BIG_STATION_SIGN,
                            ModBlocks.BAMBOO_BIG_STATION_SIGN,
                            ModBlocks.CRIMSON_BIG_STATION_SIGN,
                            ModBlocks.WARPED_BIG_STATION_SIGN,
                            ModBlocks.CHERRY_BIG_STATION_SIGN,
                            ModBlocks.MANGROVE_BIG_STATION_SIGN
                    ).build());

    public static void registerBlockEntities() {
        BigStationSigns.LOGGER.info("Registering Block Entities for " + BigStationSigns.MOD_ID);
    }
}


