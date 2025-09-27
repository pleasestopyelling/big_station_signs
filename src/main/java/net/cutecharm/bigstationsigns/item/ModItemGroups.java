package net.cutecharm.bigstationsigns.item;

import net.cutecharm.bigstationsigns.BigStationSigns;
import net.cutecharm.bigstationsigns.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup BIG_STATION_SIGNS = Registry.register(Registries.ITEM_GROUP,
            new Identifier(BigStationSigns.MOD_ID, "bigstationsigns"),
            FabricItemGroup.builder()
                    .displayName(Text.translatable("itemgroup.bigstationsigns"))
                    .icon(() -> new ItemStack(ModBlocks.RED_BIG_STATION_SIGN))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.SIGNING_TABLE);
                        entries.add(ModBlocks.WHITE_BIG_STATION_SIGN);
                        entries.add(ModBlocks.LIGHT_GRAY_BIG_STATION_SIGN);
                        entries.add(ModBlocks.GRAY_BIG_STATION_SIGN);
                        entries.add(ModBlocks.GRAY_BIG_STATION_SIGN_B);
                        entries.add(ModBlocks.BLACK_BIG_STATION_SIGN);
                        entries.add(ModBlocks.BROWN_BIG_STATION_SIGN);
                        entries.add(ModBlocks.RED_BIG_STATION_SIGN);
                        entries.add(ModBlocks.ORANGE_BIG_STATION_SIGN);
                        entries.add(ModBlocks.YELLOW_BIG_STATION_SIGN);
                        entries.add(ModBlocks.LIME_BIG_STATION_SIGN);
                        entries.add(ModBlocks.GREEN_BIG_STATION_SIGN);
                        entries.add(ModBlocks.CYAN_BIG_STATION_SIGN);
                        entries.add(ModBlocks.LIGHT_BLUE_BIG_STATION_SIGN);
                        entries.add(ModBlocks.BLUE_BIG_STATION_SIGN);
                        entries.add(ModBlocks.PURPLE_BIG_STATION_SIGN);
                        entries.add(ModBlocks.MAGENTA_BIG_STATION_SIGN);
                        entries.add(ModBlocks.PINK_BIG_STATION_SIGN);
                        entries.add(ModBlocks.CERULEAN_BIG_STATION_SIGN);
                        entries.add(ModBlocks.OAK_BIG_STATION_SIGN);
                        entries.add(ModBlocks.BIRCH_BIG_STATION_SIGN);
                        entries.add(ModBlocks.JUNGLE_BIG_STATION_SIGN);
                        entries.add(ModBlocks.SPRUCE_BIG_STATION_SIGN);
                        entries.add(ModBlocks.ACACIA_BIG_STATION_SIGN);
                        entries.add(ModBlocks.DARK_OAK_BIG_STATION_SIGN);
                        entries.add(ModBlocks.CRIMSON_BIG_STATION_SIGN);
                        entries.add(ModBlocks.WARPED_BIG_STATION_SIGN);
                        entries.add(ModBlocks.BAMBOO_BIG_STATION_SIGN);
                        entries.add(ModBlocks.CHERRY_BIG_STATION_SIGN);
                        entries.add(ModBlocks.MANGROVE_BIG_STATION_SIGN);

                    }).build());

    public static void registerItemGroups() {
        BigStationSigns.LOGGER.info("Registering Item Groups for " + BigStationSigns.MOD_ID);
    }

}
