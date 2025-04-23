package net.cutecharm.bigstationsigns.item;

import net.cutecharm.bigstationsigns.BigStationSigns;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup SMALL_STATION_SIGNS = Registry.register(Registries.ITEM_GROUP, new Identifier(BigStationSigns.MOD_ID, "smallstationsigns"),
    FabricItemGroup.builder().displayName(Text.translatable("itemgroup.smallstationsigns")).icon(() -> new ItemStack(ModItems.GRAY_SIGN)).entries((displayContext, entries) -> {
        //Small station signs go here (basically all the terraform signs)
        entries.add(ModItems.GRAY_SIGN);
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

    public static void registerItemGroups() {
        BigStationSigns.LOGGER.info("Registering Item Groups for" + BigStationSigns.MOD_ID);
    }

}
