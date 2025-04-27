package net.cutecharm.bigstationsigns.block.entity;

import net.cutecharm.bigstationsigns.BigStationSigns;
import net.cutecharm.bigstationsigns.block.ModBlocks;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlockEntities {
    public static final BlockEntityType<BigStationSignBlockEntity> BIG_STATION_SIGN_BLOCK_ENTITY =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(BigStationSigns.MOD_ID, "bss_be"),
                    FabricBlockEntityTypeBuilder.create(BigStationSignBlockEntity::new,
                            ModBlocks.WHITE_BIG_STATION_SIGN,
                            ModBlocks.LIGHT_GRAY_BIG_STATION_SIGN,
                            ModBlocks.GRAY_BIG_STATION_SIGN,
                            ModBlocks.BLACK_BIG_STATION_SIGN,
                            ModBlocks.BLACK_BIG_STATION_SIGN_B,
                            ModBlocks.BLACK_BIG_STATION_SIGN_C,
                            ModBlocks.BLACK_BIG_STATION_SIGN_D,
                            ModBlocks.BROWN_BIG_STATION_SIGN,
                            ModBlocks.RED_BIG_STATION_SIGN,
                            ModBlocks.ORANGE_BIG_STATION_SIGN,
                            ModBlocks.ORANGE_BIG_STATION_SIGN_B,
                            ModBlocks.YELLOW_BIG_STATION_SIGN,
                            ModBlocks.YELLOW_BIG_STATION_SIGN_B,
                            ModBlocks.GREEN_BIG_STATION_SIGN,
                            ModBlocks.GREEN_BIG_STATION_SIGN_B,
                            ModBlocks.GREEN_BIG_STATION_SIGN_C,
                            ModBlocks.GREEN_BIG_STATION_SIGN_D,
                            ModBlocks.LIME_BIG_STATION_SIGN_B,
                            ModBlocks.CYAN_BIG_STATION_SIGN,
                            ModBlocks.CYAN_BIG_STATION_SIGN_B,
                            ModBlocks.CYAN_BIG_STATION_SIGN_C,
                            ModBlocks.CYAN_BIG_STATION_SIGN_D,
                            ModBlocks.LIGHT_BLUE_BIG_STATION_SIGN,
                            ModBlocks.BLUE_BIG_STATION_SIGN,
                            ModBlocks.PURPLE_BIG_STATION_SIGN,
                            ModBlocks.PURPLE_BIG_STATION_SIGN_B,
                            ModBlocks.PURPLE_BIG_STATION_SIGN_C,
                            ModBlocks.PURPLE_BIG_STATION_SIGN_D,
                            ModBlocks.MAGENTA_BIG_STATION_SIGN,
                            ModBlocks.PINK_BIG_STATION_SIGN,
                            ModBlocks.PINK_BIG_STATION_SIGN_B
                    ).build());

    public static void registerBlockEntities() {
        BigStationSigns.LOGGER.info("Registering Block Entities for " + BigStationSigns.MOD_ID);
    }
}


