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
                    FabricBlockEntityTypeBuilder.create(BigStationSignBlockEntity::new, ModBlocks.GRAY_BIG_STATION_SIGN).build());
    public static void registerBlockEntities() {
        BigStationSigns.LOGGER.info("Registering Block Entities for" + BigStationSigns.MOD_ID);
    }
}


