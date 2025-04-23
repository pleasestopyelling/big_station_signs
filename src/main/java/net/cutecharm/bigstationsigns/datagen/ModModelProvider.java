package net.cutecharm.bigstationsigns.datagen;

import net.cutecharm.bigstationsigns.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.*;

import java.util.Optional;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }




    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

        itemModelGenerator.register(ModItems.WHITE_SIGN, Models.GENERATED);
        itemModelGenerator.register(ModItems.HANGING_WHITE_SIGN, Models.GENERATED);
        itemModelGenerator.register(ModItems.LIGHT_GRAY_SIGN, Models.GENERATED);
        itemModelGenerator.register(ModItems.HANGING_LIGHT_GRAY_SIGN, Models.GENERATED);
        itemModelGenerator.register(ModItems.GRAY_SIGN, Models.GENERATED);
        itemModelGenerator.register(ModItems.HANGING_GRAY_SIGN, Models.GENERATED);
        itemModelGenerator.register(ModItems.BLACK_SIGN, Models.GENERATED);
        itemModelGenerator.register(ModItems.BLACK_SIGN_B, Models.GENERATED);
        itemModelGenerator.register(ModItems.BLACK_SIGN_C, Models.GENERATED);
        itemModelGenerator.register(ModItems.BLACK_SIGN_D, Models.GENERATED);
        itemModelGenerator.register(ModItems.HANGING_BLACK_SIGN, Models.GENERATED);
        itemModelGenerator.register(ModItems.BROWN_SIGN, Models.GENERATED);
        itemModelGenerator.register(ModItems.HANGING_BROWN_SIGN, Models.GENERATED);
        itemModelGenerator.register(ModItems.RED_SIGN, Models.GENERATED);
        itemModelGenerator.register(ModItems.HANGING_RED_SIGN, Models.GENERATED);
        itemModelGenerator.register(ModItems.ORANGE_SIGN, Models.GENERATED);
        itemModelGenerator.register(ModItems.ORANGE_SIGN_B, Models.GENERATED);
        itemModelGenerator.register(ModItems.HANGING_ORANGE_SIGN, Models.GENERATED);
        itemModelGenerator.register(ModItems.YELLOW_SIGN, Models.GENERATED);
        itemModelGenerator.register(ModItems.YELLOW_SIGN_B, Models.GENERATED);
        itemModelGenerator.register(ModItems.HANGING_YELLOW_SIGN, Models.GENERATED);
        itemModelGenerator.register(ModItems.LIME_SIGN, Models.GENERATED);
        itemModelGenerator.register(ModItems.LIME_SIGN_B, Models.GENERATED);
        itemModelGenerator.register(ModItems.HANGING_LIME_SIGN, Models.GENERATED);
        itemModelGenerator.register(ModItems.GREEN_SIGN, Models.GENERATED);
        itemModelGenerator.register(ModItems.GREEN_SIGN_B, Models.GENERATED);
        itemModelGenerator.register(ModItems.GREEN_SIGN_C, Models.GENERATED);
        itemModelGenerator.register(ModItems.GREEN_SIGN_D, Models.GENERATED);
        itemModelGenerator.register(ModItems.HANGING_GREEN_SIGN, Models.GENERATED);
        itemModelGenerator.register(ModItems.CYAN_SIGN, Models.GENERATED);
        itemModelGenerator.register(ModItems.CYAN_SIGN_B, Models.GENERATED);
        itemModelGenerator.register(ModItems.CYAN_SIGN_C, Models.GENERATED);
        itemModelGenerator.register(ModItems.CYAN_SIGN_D, Models.GENERATED);
        itemModelGenerator.register(ModItems.HANGING_CYAN_SIGN, Models.GENERATED);
        itemModelGenerator.register(ModItems.LIGHT_BLUE_SIGN, Models.GENERATED);
        itemModelGenerator.register(ModItems.HANGING_LIGHT_BLUE_SIGN, Models.GENERATED);
        itemModelGenerator.register(ModItems.BLUE_SIGN, Models.GENERATED);
        itemModelGenerator.register(ModItems.HANGING_BLUE_SIGN, Models.GENERATED);
        itemModelGenerator.register(ModItems.PURPLE_SIGN, Models.GENERATED);
        itemModelGenerator.register(ModItems.PURPLE_SIGN_B, Models.GENERATED);
        itemModelGenerator.register(ModItems.PURPLE_SIGN_C, Models.GENERATED);
        itemModelGenerator.register(ModItems.PURPLE_SIGN_D, Models.GENERATED);
        itemModelGenerator.register(ModItems.HANGING_PURPLE_SIGN, Models.GENERATED);
        itemModelGenerator.register(ModItems.MAGENTA_SIGN, Models.GENERATED);
        itemModelGenerator.register(ModItems.HANGING_MAGENTA_SIGN, Models.GENERATED);
        itemModelGenerator.register(ModItems.PINK_SIGN, Models.GENERATED);
        itemModelGenerator.register(ModItems.PINK_SIGN_B, Models.GENERATED);
        itemModelGenerator.register(ModItems.HANGING_PINK_SIGN, Models.GENERATED);
    }
}
