package net.cutecharm.bigstationsigns.tags;

import net.cutecharm.bigstationsigns.BigStationSigns;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModBlockTags {
    public static final TagKey<Block> BIG_STATION_SIGNS = TagKey.of(RegistryKeys.BLOCK, new Identifier(BigStationSigns.MOD_ID, "big_station_signs"));
}
