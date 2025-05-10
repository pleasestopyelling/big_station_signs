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

    public static final ItemGroup SMALL_STATION_SIGNS = Registry.register(Registries.ITEM_GROUP,
            new Identifier(BigStationSigns.MOD_ID, "smallstationsigns"),
    FabricItemGroup.builder()
            .displayName(Text.translatable("itemgroup.smallstationsigns"))
            .icon(() -> new ItemStack(ModItems.GRAY_SIGN))
            .entries((displayContext, entries) -> {
        //Small station signs go here (basically all the terraform signs)
        entries.add(ModItems.GRAY_SIGN);
        entries.add(ModItems.GRAY_SIGN_B);
        entries.add(ModItems.GRAY_SIGN_C);
        entries.add(ModItems.HANGING_GRAY_SIGN);
        entries.add(ModItems.RED_SIGN);
        entries.add(ModItems.HANGING_RED_SIGN);
        entries.add(ModItems.GREEN_SIGN);
        entries.add(ModItems.GREEN_SIGN_B);
        entries.add(ModItems.GREEN_SIGN_C);
        entries.add(ModItems.GREEN_SIGN_D);
        entries.add(ModItems.HANGING_GREEN_SIGN);
        entries.add(ModItems.LIME_SIGN);
        entries.add(ModItems.LIME_SIGN_B);
        entries.add(ModItems.HANGING_LIME_SIGN);
        entries.add(ModItems.BLUE_SIGN);
        entries.add(ModItems.HANGING_BLUE_SIGN);
        entries.add(ModItems.LIGHT_BLUE_SIGN);
        entries.add(ModItems.HANGING_LIGHT_BLUE_SIGN);
        entries.add(ModItems.MAGENTA_SIGN);
        entries.add(ModItems.HANGING_MAGENTA_SIGN);
        entries.add(ModItems.PURPLE_SIGN);
        entries.add(ModItems.PURPLE_SIGN_B);
        entries.add(ModItems.PURPLE_SIGN_C);
        entries.add(ModItems.PURPLE_SIGN_D);
        entries.add(ModItems.HANGING_PURPLE_SIGN);
        entries.add(ModItems.PINK_SIGN);
        entries.add(ModItems.PINK_SIGN_B);
        entries.add(ModItems.HANGING_PINK_SIGN);
        entries.add(ModItems.CYAN_SIGN);
        entries.add(ModItems.CYAN_SIGN_B);
        entries.add(ModItems.CYAN_SIGN_C);
        entries.add(ModItems.CYAN_SIGN_D);
        entries.add(ModItems.HANGING_CYAN_SIGN);
        entries.add(ModItems.LIGHT_GRAY_SIGN);
        entries.add(ModItems.HANGING_LIGHT_GRAY_SIGN);
        entries.add(ModItems.BLACK_SIGN);
        entries.add(ModItems.BLACK_SIGN_B);
        entries.add(ModItems.BLACK_SIGN_C);
        entries.add(ModItems.BLACK_SIGN_D);
        entries.add(ModItems.HANGING_BLACK_SIGN);
        entries.add(ModItems.WHITE_SIGN);
        entries.add(ModItems.HANGING_WHITE_SIGN);
        entries.add(ModItems.ORANGE_SIGN);
        entries.add(ModItems.ORANGE_SIGN_B);
        entries.add(ModItems.HANGING_ORANGE_SIGN);
        entries.add(ModItems.BROWN_SIGN);
        entries.add(ModItems.HANGING_BROWN_SIGN);
        entries.add(ModItems.YELLOW_SIGN);
        entries.add(ModItems.YELLOW_SIGN_B);
        entries.add(ModItems.HANGING_YELLOW_SIGN);
    }).build());

    public static final ItemGroup BIG_STATION_SIGNS = Registry.register(Registries.ITEM_GROUP,
            new Identifier(BigStationSigns.MOD_ID, "bigstationsigns"),
            FabricItemGroup.builder()
                    .displayName(Text.translatable("itemgroup.bigstationsigns"))
                    .icon(() -> new ItemStack(ModBlocks.RED_BIG_STATION_SIGN))
                    .entries((displayContext, entries) -> {

                        entries.add(ModBlocks.WHITE_BIG_STATION_SIGN);
                        entries.add(ModBlocks.LIGHT_GRAY_BIG_STATION_SIGN);
                        entries.add(ModBlocks.GRAY_BIG_STATION_SIGN);
                        entries.add(ModBlocks.GRAY_BIG_STATION_SIGN_B);
                        entries.add(ModBlocks.GRAY_BIG_STATION_SIGN_C);
                        entries.add(ModBlocks.BLACK_BIG_STATION_SIGN);
                        entries.add(ModBlocks.BLACK_BIG_STATION_SIGN_B);
                        entries.add(ModBlocks.BLACK_BIG_STATION_SIGN_C);
                        entries.add(ModBlocks.BLACK_BIG_STATION_SIGN_D);
                        entries.add(ModBlocks.BROWN_BIG_STATION_SIGN);
                        entries.add(ModBlocks.RED_BIG_STATION_SIGN);
                        entries.add(ModBlocks.ORANGE_BIG_STATION_SIGN);
                        entries.add(ModBlocks.ORANGE_BIG_STATION_SIGN_B);
                        entries.add(ModBlocks.YELLOW_BIG_STATION_SIGN);
                        entries.add(ModBlocks.YELLOW_BIG_STATION_SIGN_B);
                        entries.add(ModBlocks.LIME_BIG_STATION_SIGN);
                        entries.add(ModBlocks.LIME_BIG_STATION_SIGN_B);
                        entries.add(ModBlocks.GREEN_BIG_STATION_SIGN);
                        entries.add(ModBlocks.GREEN_BIG_STATION_SIGN_B);
                        entries.add(ModBlocks.GREEN_BIG_STATION_SIGN_C);
                        entries.add(ModBlocks.GREEN_BIG_STATION_SIGN_D);
                        entries.add(ModBlocks.CYAN_BIG_STATION_SIGN);
                        entries.add(ModBlocks.CYAN_BIG_STATION_SIGN_B);
                        entries.add(ModBlocks.CYAN_BIG_STATION_SIGN_C);
                        entries.add(ModBlocks.CYAN_BIG_STATION_SIGN_D);
                        entries.add(ModBlocks.LIGHT_BLUE_BIG_STATION_SIGN);
                        entries.add(ModBlocks.BLUE_BIG_STATION_SIGN);
                        entries.add(ModBlocks.PURPLE_BIG_STATION_SIGN);
                        entries.add(ModBlocks.PURPLE_BIG_STATION_SIGN_B);
                        entries.add(ModBlocks.PURPLE_BIG_STATION_SIGN_C);
                        entries.add(ModBlocks.PURPLE_BIG_STATION_SIGN_D);
                        entries.add(ModBlocks.MAGENTA_BIG_STATION_SIGN);
                        entries.add(ModBlocks.PINK_BIG_STATION_SIGN);
                        entries.add(ModBlocks.PINK_BIG_STATION_SIGN_B);
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
