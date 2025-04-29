package net.cutecharm.bigstationsigns.item;

import net.cutecharm.bigstationsigns.BigStationSigns;
import net.cutecharm.bigstationsigns.block.ModBlocks;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.HangingSignItem;
import net.minecraft.item.Item;
import net.minecraft.item.SignItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    //List of all the items to be registered
    public static final Item GRAY_SIGN = registerItem("gray_sign",
            new SignItem(new FabricItemSettings().maxCount(16), ModBlocks.STANDING_GRAY_SIGN, ModBlocks.WALL_GRAY_SIGN));
    public static final Item HANGING_GRAY_SIGN = registerItem("gray_hanging_sign",
            new HangingSignItem(ModBlocks.HANGING_GRAY_SIGN, ModBlocks.WALL_HANGING_GRAY_SIGN, new FabricItemSettings().maxCount(16) ));
    public static final Item RED_SIGN = registerItem("red_sign",
            new SignItem(new FabricItemSettings().maxCount(16), ModBlocks.STANDING_RED_SIGN, ModBlocks.WALL_RED_SIGN));
    public static final Item HANGING_RED_SIGN = registerItem("red_hanging_sign",
            new HangingSignItem(ModBlocks.HANGING_RED_SIGN, ModBlocks.WALL_HANGING_RED_SIGN, new FabricItemSettings().maxCount(16) ));
    public static final Item GREEN_SIGN = registerItem("green_sign",
            new SignItem(new FabricItemSettings().maxCount(16), ModBlocks.STANDING_GREEN_SIGN, ModBlocks.WALL_GREEN_SIGN));
    public static final Item HANGING_GREEN_SIGN = registerItem("green_hanging_sign",
            new HangingSignItem(ModBlocks.HANGING_GREEN_SIGN, ModBlocks.WALL_HANGING_GREEN_SIGN, new FabricItemSettings().maxCount(16) ));
    public static final Item GREEN_SIGN_B = registerItem("green_sign_b",
            new SignItem(new FabricItemSettings().maxCount(16), ModBlocks.STANDING_GREEN_SIGN_B, ModBlocks.WALL_GREEN_SIGN_B));
    public static final Item GREEN_SIGN_C = registerItem("green_sign_c",
            new SignItem(new FabricItemSettings().maxCount(16), ModBlocks.STANDING_GREEN_SIGN_C, ModBlocks.WALL_GREEN_SIGN_C));
    public static final Item GREEN_SIGN_D = registerItem("green_sign_d",
            new SignItem(new FabricItemSettings().maxCount(16), ModBlocks.STANDING_GREEN_SIGN_D, ModBlocks.WALL_GREEN_SIGN_D));
    public static final Item LIME_SIGN = registerItem("lime_sign",
            new SignItem(new FabricItemSettings().maxCount(16), ModBlocks.STANDING_LIME_SIGN, ModBlocks.WALL_LIME_SIGN));
    public static final Item LIME_SIGN_B = registerItem("lime_sign_b",
            new SignItem(new FabricItemSettings().maxCount(16), ModBlocks.STANDING_LIME_SIGN_B, ModBlocks.WALL_LIME_SIGN_B));
    public static final Item HANGING_LIME_SIGN = registerItem("lime_hanging_sign",
            new HangingSignItem(ModBlocks.HANGING_LIME_SIGN, ModBlocks.WALL_HANGING_LIME_SIGN, new FabricItemSettings().maxCount(16) ));
    public static final Item BLUE_SIGN = registerItem("blue_sign",
            new SignItem(new FabricItemSettings().maxCount(16), ModBlocks.STANDING_BLUE_SIGN, ModBlocks.WALL_BLUE_SIGN));
    public static final Item HANGING_BLUE_SIGN = registerItem("blue_hanging_sign",
            new HangingSignItem(ModBlocks.HANGING_BLUE_SIGN, ModBlocks.WALL_HANGING_BLUE_SIGN, new FabricItemSettings().maxCount(16) ));
    public static final Item LIGHT_BLUE_SIGN = registerItem("light_blue_sign",
            new SignItem(new FabricItemSettings().maxCount(16), ModBlocks.STANDING_LIGHT_BLUE_SIGN, ModBlocks.WALL_LIGHT_BLUE_SIGN));
    public static final Item HANGING_LIGHT_BLUE_SIGN = registerItem("light_blue_hanging_sign",
            new HangingSignItem(ModBlocks.HANGING_LIGHT_BLUE_SIGN, ModBlocks.WALL_HANGING_LIGHT_BLUE_SIGN, new FabricItemSettings().maxCount(16) ));
    public static final Item MAGENTA_SIGN = registerItem("magenta_sign",
            new SignItem(new FabricItemSettings().maxCount(16), ModBlocks.STANDING_MAGENTA_SIGN, ModBlocks.WALL_MAGENTA_SIGN));
    public static final Item HANGING_MAGENTA_SIGN = registerItem("magenta_hanging_sign",
            new HangingSignItem(ModBlocks.HANGING_MAGENTA_SIGN, ModBlocks.WALL_HANGING_MAGENTA_SIGN, new FabricItemSettings().maxCount(16) ));
    public static final Item PURPLE_SIGN = registerItem("purple_sign",
            new SignItem(new FabricItemSettings().maxCount(16), ModBlocks.STANDING_PURPLE_SIGN, ModBlocks.WALL_PURPLE_SIGN));
    public static final Item PURPLE_SIGN_B = registerItem("purple_sign_b",
            new SignItem(new FabricItemSettings().maxCount(16), ModBlocks.STANDING_PURPLE_SIGN_B, ModBlocks.WALL_PURPLE_SIGN_B));
    public static final Item PURPLE_SIGN_C = registerItem("purple_sign_c",
            new SignItem(new FabricItemSettings().maxCount(16), ModBlocks.STANDING_PURPLE_SIGN_C, ModBlocks.WALL_PURPLE_SIGN_C));
    public static final Item PURPLE_SIGN_D = registerItem("purple_sign_d",
            new SignItem(new FabricItemSettings().maxCount(16), ModBlocks.STANDING_PURPLE_SIGN_D, ModBlocks.WALL_PURPLE_SIGN_D));
    public static final Item HANGING_PURPLE_SIGN = registerItem("purple_hanging_sign",
            new HangingSignItem(ModBlocks.HANGING_PURPLE_SIGN, ModBlocks.WALL_HANGING_PURPLE_SIGN, new FabricItemSettings().maxCount(16) ));
    public static final Item PINK_SIGN = registerItem("pink_sign",
            new SignItem(new FabricItemSettings().maxCount(16), ModBlocks.STANDING_PINK_SIGN, ModBlocks.WALL_PINK_SIGN));
    public static final Item PINK_SIGN_B = registerItem("pink_sign_b",
            new SignItem(new FabricItemSettings().maxCount(16), ModBlocks.STANDING_PINK_SIGN_B, ModBlocks.WALL_PINK_SIGN_B));
    public static final Item HANGING_PINK_SIGN = registerItem("pink_hanging_sign",
            new HangingSignItem(ModBlocks.HANGING_PINK_SIGN, ModBlocks.WALL_HANGING_PINK_SIGN, new FabricItemSettings().maxCount(16) ));
    public static final Item CYAN_SIGN = registerItem("cyan_sign",
            new SignItem(new FabricItemSettings().maxCount(16), ModBlocks.STANDING_CYAN_SIGN, ModBlocks.WALL_CYAN_SIGN));
    public static final Item CYAN_SIGN_B = registerItem("cyan_sign_b",
            new SignItem(new FabricItemSettings().maxCount(16), ModBlocks.STANDING_CYAN_SIGN_B, ModBlocks.WALL_CYAN_SIGN_B));
    public static final Item CYAN_SIGN_C = registerItem("cyan_sign_c",
            new SignItem(new FabricItemSettings().maxCount(16), ModBlocks.STANDING_CYAN_SIGN_C, ModBlocks.WALL_CYAN_SIGN_C));
    public static final Item CYAN_SIGN_D = registerItem("cyan_sign_d",
            new SignItem(new FabricItemSettings().maxCount(16), ModBlocks.STANDING_CYAN_SIGN_D, ModBlocks.WALL_CYAN_SIGN_D));
    public static final Item HANGING_CYAN_SIGN = registerItem("cyan_hanging_sign",
            new HangingSignItem(ModBlocks.HANGING_CYAN_SIGN, ModBlocks.WALL_HANGING_CYAN_SIGN, new FabricItemSettings().maxCount(16) ));
    public static final Item LIGHT_GRAY_SIGN = registerItem("light_gray_sign",
            new SignItem(new FabricItemSettings().maxCount(16), ModBlocks.STANDING_LIGHT_GRAY_SIGN, ModBlocks.WALL_LIGHT_GRAY_SIGN));
    public static final Item HANGING_LIGHT_GRAY_SIGN = registerItem("light_gray_hanging_sign",
            new HangingSignItem(ModBlocks.HANGING_LIGHT_GRAY_SIGN, ModBlocks.WALL_HANGING_LIGHT_GRAY_SIGN, new FabricItemSettings().maxCount(16) ));
    public static final Item BLACK_SIGN = registerItem("black_sign",
            new SignItem(new FabricItemSettings().maxCount(16), ModBlocks.STANDING_BLACK_SIGN, ModBlocks.WALL_BLACK_SIGN));
    public static final Item BLACK_SIGN_B = registerItem("black_sign_b",
            new SignItem(new FabricItemSettings().maxCount(16), ModBlocks.STANDING_BLACK_SIGN_B, ModBlocks.WALL_BLACK_SIGN_B));
    public static final Item BLACK_SIGN_C = registerItem("black_sign_c",
            new SignItem(new FabricItemSettings().maxCount(16), ModBlocks.STANDING_BLACK_SIGN_C, ModBlocks.WALL_BLACK_SIGN_C));
    public static final Item BLACK_SIGN_D = registerItem("black_sign_d",
            new SignItem(new FabricItemSettings().maxCount(16), ModBlocks.STANDING_BLACK_SIGN_D, ModBlocks.WALL_BLACK_SIGN_D));
    public static final Item HANGING_BLACK_SIGN = registerItem("black_hanging_sign",
            new HangingSignItem(ModBlocks.HANGING_BLACK_SIGN, ModBlocks.WALL_HANGING_BLACK_SIGN, new FabricItemSettings().maxCount(16) ));
    public static final Item WHITE_SIGN = registerItem("white_sign",
            new SignItem(new FabricItemSettings().maxCount(16), ModBlocks.STANDING_WHITE_SIGN, ModBlocks.WALL_WHITE_SIGN));
    public static final Item HANGING_WHITE_SIGN = registerItem("white_hanging_sign",
            new HangingSignItem(ModBlocks.HANGING_WHITE_SIGN, ModBlocks.WALL_HANGING_WHITE_SIGN, new FabricItemSettings().maxCount(16) ));
    public static final Item ORANGE_SIGN = registerItem("orange_sign",
            new SignItem(new FabricItemSettings().maxCount(16), ModBlocks.STANDING_ORANGE_SIGN, ModBlocks.WALL_ORANGE_SIGN));
    public static final Item ORANGE_SIGN_B = registerItem("orange_sign_b",
            new SignItem(new FabricItemSettings().maxCount(16), ModBlocks.STANDING_ORANGE_SIGN_B, ModBlocks.WALL_ORANGE_SIGN_B));
    public static final Item HANGING_ORANGE_SIGN = registerItem("orange_hanging_sign",
            new HangingSignItem(ModBlocks.HANGING_ORANGE_SIGN, ModBlocks.WALL_HANGING_ORANGE_SIGN, new FabricItemSettings().maxCount(16) ));
    public static final Item BROWN_SIGN = registerItem("brown_sign",
            new SignItem(new FabricItemSettings().maxCount(16), ModBlocks.STANDING_BROWN_SIGN, ModBlocks.WALL_BROWN_SIGN));
    public static final Item HANGING_BROWN_SIGN = registerItem("brown_hanging_sign",
            new HangingSignItem(ModBlocks.HANGING_BROWN_SIGN, ModBlocks.WALL_HANGING_BROWN_SIGN, new FabricItemSettings().maxCount(16) ));
    public static final Item YELLOW_SIGN = registerItem("yellow_sign",
            new SignItem(new FabricItemSettings().maxCount(16), ModBlocks.STANDING_YELLOW_SIGN, ModBlocks.WALL_YELLOW_SIGN));
    public static final Item YELLOW_SIGN_B = registerItem("yellow_sign_b",
            new SignItem(new FabricItemSettings().maxCount(16), ModBlocks.STANDING_YELLOW_SIGN_B, ModBlocks.WALL_YELLOW_SIGN_B));
    public static final Item HANGING_YELLOW_SIGN = registerItem("yellow_hanging_sign",
            new HangingSignItem(ModBlocks.HANGING_YELLOW_SIGN, ModBlocks.WALL_HANGING_YELLOW_SIGN, new FabricItemSettings().maxCount(16) ));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(BigStationSigns.MOD_ID, name), item);
    }

    public static void registerModItems() {
        BigStationSigns.LOGGER.info("Registering Mod Items for " + BigStationSigns.MOD_ID);


    }
}
