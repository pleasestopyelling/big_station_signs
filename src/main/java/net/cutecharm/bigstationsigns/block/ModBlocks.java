package net.cutecharm.bigstationsigns.block;

import com.terraformersmc.terraform.sign.block.TerraformHangingSignBlock;
import com.terraformersmc.terraform.sign.block.TerraformSignBlock;
import com.terraformersmc.terraform.sign.block.TerraformWallHangingSignBlock;
import com.terraformersmc.terraform.sign.block.TerraformWallSignBlock;
import net.cutecharm.bigstationsigns.BigStationSigns;
import net.cutecharm.bigstationsigns.util.SmallSignTextureHelper;
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

    //Small signs
    public static final Block STANDING_GRAY_SIGN = Registry.register(Registries.BLOCK, new Identifier(BigStationSigns.MOD_ID, "gray_standing_sign"),
            new TerraformSignBlock(SmallSignTextureHelper.GRAY_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.CHAIN).sounds(BlockSoundGroup.CHAIN).noCollision().noBlockBreakParticles()));
    public static final Block WALL_GRAY_SIGN = Registry.register(Registries.BLOCK, new Identifier(BigStationSigns.MOD_ID, "gray_wall_sign"),
            new TerraformWallSignBlock(SmallSignTextureHelper.GRAY_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.CHAIN).sounds(BlockSoundGroup.CHAIN).dropsLike(STANDING_GRAY_SIGN).noCollision().noBlockBreakParticles()));
    public static final Block HANGING_GRAY_SIGN = Registry.register(Registries.BLOCK, new Identifier(BigStationSigns.MOD_ID, "gray_hanging_sign"),
            new TerraformHangingSignBlock(SmallSignTextureHelper.GRAY_HANGING_SIGN_TEXTURE, SmallSignTextureHelper.GRAY_HANGING_GUI_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.CHAIN).sounds(BlockSoundGroup.CHAIN).noCollision().noBlockBreakParticles()));
    public static final Block WALL_HANGING_GRAY_SIGN = Registry.register(Registries.BLOCK, new Identifier(BigStationSigns.MOD_ID, "gray_wall_hanging_sign"),
            new TerraformWallHangingSignBlock(SmallSignTextureHelper.GRAY_HANGING_SIGN_TEXTURE, SmallSignTextureHelper.GRAY_HANGING_GUI_SIGN_TEXTURE,FabricBlockSettings.copyOf(Blocks.CHAIN).sounds(BlockSoundGroup.CHAIN).dropsLike(HANGING_GRAY_SIGN).noCollision().noBlockBreakParticles()));
    public static final Block STANDING_RED_SIGN = Registry.register(Registries.BLOCK, new Identifier(BigStationSigns.MOD_ID, "red_standing_sign"),
            new TerraformSignBlock(SmallSignTextureHelper.RED_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.CHAIN).sounds(BlockSoundGroup.CHAIN).noCollision().noBlockBreakParticles()));
    public static final Block WALL_RED_SIGN = Registry.register(Registries.BLOCK, new Identifier(BigStationSigns.MOD_ID, "red_wall_sign"),
            new TerraformWallSignBlock(SmallSignTextureHelper.RED_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.CHAIN).sounds(BlockSoundGroup.CHAIN).dropsLike(STANDING_RED_SIGN).noCollision().noBlockBreakParticles()));
    public static final Block HANGING_RED_SIGN = Registry.register(Registries.BLOCK, new Identifier(BigStationSigns.MOD_ID, "red_hanging_sign"),
            new TerraformHangingSignBlock(SmallSignTextureHelper.RED_HANGING_SIGN_TEXTURE, SmallSignTextureHelper.RED_HANGING_GUI_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.CHAIN).sounds(BlockSoundGroup.CHAIN).noCollision().noBlockBreakParticles()));
    public static final Block WALL_HANGING_RED_SIGN = Registry.register(Registries.BLOCK, new Identifier(BigStationSigns.MOD_ID, "red_wall_hanging_sign"),
            new TerraformWallHangingSignBlock(SmallSignTextureHelper.RED_HANGING_SIGN_TEXTURE, SmallSignTextureHelper.RED_HANGING_GUI_SIGN_TEXTURE,FabricBlockSettings.copyOf(Blocks.CHAIN).sounds(BlockSoundGroup.CHAIN).dropsLike(HANGING_RED_SIGN).noCollision().noBlockBreakParticles()));
    public static final Block STANDING_GREEN_SIGN = Registry.register(Registries.BLOCK, new Identifier(BigStationSigns.MOD_ID, "green_standing_sign"),
            new TerraformSignBlock(SmallSignTextureHelper.GREEN_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.CHAIN).sounds(BlockSoundGroup.CHAIN).noCollision().noBlockBreakParticles()));
    public static final Block WALL_GREEN_SIGN = Registry.register(Registries.BLOCK, new Identifier(BigStationSigns.MOD_ID, "green_wall_sign"),
            new TerraformWallSignBlock(SmallSignTextureHelper.GREEN_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.CHAIN).sounds(BlockSoundGroup.CHAIN).dropsLike(STANDING_GREEN_SIGN).noCollision().noBlockBreakParticles()));
    public static final Block HANGING_GREEN_SIGN = Registry.register(Registries.BLOCK, new Identifier(BigStationSigns.MOD_ID, "green_hanging_sign"),
            new TerraformHangingSignBlock(SmallSignTextureHelper.GREEN_HANGING_SIGN_TEXTURE, SmallSignTextureHelper.GREEN_HANGING_GUI_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.CHAIN).sounds(BlockSoundGroup.CHAIN).noCollision().noBlockBreakParticles()));
    public static final Block WALL_HANGING_GREEN_SIGN = Registry.register(Registries.BLOCK, new Identifier(BigStationSigns.MOD_ID, "green_wall_hanging_sign"),
            new TerraformWallHangingSignBlock(SmallSignTextureHelper.GREEN_HANGING_SIGN_TEXTURE, SmallSignTextureHelper.GREEN_HANGING_GUI_SIGN_TEXTURE,FabricBlockSettings.copyOf(Blocks.CHAIN).sounds(BlockSoundGroup.CHAIN).dropsLike(HANGING_GREEN_SIGN).noCollision().noBlockBreakParticles()));
    public static final Block STANDING_GREEN_SIGN_B = Registry.register(Registries.BLOCK, new Identifier(BigStationSigns.MOD_ID, "green_standing_sign_b"),
            new TerraformSignBlock(SmallSignTextureHelper.GREEN_SIGN_TEXTURE_B, FabricBlockSettings.copyOf(Blocks.CHAIN).sounds(BlockSoundGroup.CHAIN).noCollision().noBlockBreakParticles()));
    public static final Block WALL_GREEN_SIGN_B = Registry.register(Registries.BLOCK, new Identifier(BigStationSigns.MOD_ID, "green_wall_sign_b"),
            new TerraformWallSignBlock(SmallSignTextureHelper.GREEN_SIGN_TEXTURE_B, FabricBlockSettings.copyOf(Blocks.CHAIN).sounds(BlockSoundGroup.CHAIN).dropsLike(STANDING_GREEN_SIGN_B).noCollision().noBlockBreakParticles()));
    public static final Block STANDING_GREEN_SIGN_C = Registry.register(Registries.BLOCK, new Identifier(BigStationSigns.MOD_ID, "green_standing_sign_c"),
            new TerraformSignBlock(SmallSignTextureHelper.GREEN_SIGN_TEXTURE_C, FabricBlockSettings.copyOf(Blocks.CHAIN).sounds(BlockSoundGroup.CHAIN).noCollision().noBlockBreakParticles()));
    public static final Block WALL_GREEN_SIGN_C = Registry.register(Registries.BLOCK, new Identifier(BigStationSigns.MOD_ID, "green_wall_sign_c"),
            new TerraformWallSignBlock(SmallSignTextureHelper.GREEN_SIGN_TEXTURE_C, FabricBlockSettings.copyOf(Blocks.CHAIN).sounds(BlockSoundGroup.CHAIN).dropsLike(STANDING_GREEN_SIGN_C).noCollision().noBlockBreakParticles()));
    public static final Block STANDING_GREEN_SIGN_D = Registry.register(Registries.BLOCK, new Identifier(BigStationSigns.MOD_ID, "green_standing_sign_d"),
            new TerraformSignBlock(SmallSignTextureHelper.GREEN_SIGN_TEXTURE_D, FabricBlockSettings.copyOf(Blocks.CHAIN).sounds(BlockSoundGroup.CHAIN).noCollision().noBlockBreakParticles()));
    public static final Block WALL_GREEN_SIGN_D = Registry.register(Registries.BLOCK, new Identifier(BigStationSigns.MOD_ID, "green_wall_sign_d"),
            new TerraformWallSignBlock(SmallSignTextureHelper.GREEN_SIGN_TEXTURE_D, FabricBlockSettings.copyOf(Blocks.CHAIN).sounds(BlockSoundGroup.CHAIN).dropsLike(STANDING_GREEN_SIGN_D).noCollision().noBlockBreakParticles()));
    public static final Block STANDING_LIME_SIGN = Registry.register(Registries.BLOCK, new Identifier(BigStationSigns.MOD_ID, "lime_standing_sign"),
            new TerraformSignBlock(SmallSignTextureHelper.LIME_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.CHAIN).sounds(BlockSoundGroup.CHAIN).noCollision().noBlockBreakParticles()));
    public static final Block WALL_LIME_SIGN = Registry.register(Registries.BLOCK, new Identifier(BigStationSigns.MOD_ID, "lime_wall_sign"),
            new TerraformWallSignBlock(SmallSignTextureHelper.LIME_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.CHAIN).sounds(BlockSoundGroup.CHAIN).dropsLike(STANDING_LIME_SIGN).noCollision().noBlockBreakParticles()));
    public static final Block STANDING_LIME_SIGN_B = Registry.register(Registries.BLOCK, new Identifier(BigStationSigns.MOD_ID, "lime_standing_sign_b"),
            new TerraformSignBlock(SmallSignTextureHelper.LIME_SIGN_TEXTURE_B, FabricBlockSettings.copyOf(Blocks.CHAIN).sounds(BlockSoundGroup.CHAIN).noCollision().noBlockBreakParticles()));
    public static final Block WALL_LIME_SIGN_B = Registry.register(Registries.BLOCK, new Identifier(BigStationSigns.MOD_ID, "lime_wall_sign_b"),
            new TerraformWallSignBlock(SmallSignTextureHelper.LIME_SIGN_TEXTURE_B, FabricBlockSettings.copyOf(Blocks.CHAIN).sounds(BlockSoundGroup.CHAIN).dropsLike(STANDING_LIME_SIGN_B).noCollision().noBlockBreakParticles()));
    public static final Block HANGING_LIME_SIGN = Registry.register(Registries.BLOCK, new Identifier(BigStationSigns.MOD_ID, "lime_hanging_sign"),
            new TerraformHangingSignBlock(SmallSignTextureHelper.LIME_HANGING_SIGN_TEXTURE, SmallSignTextureHelper.LIME_HANGING_GUI_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.CHAIN).sounds(BlockSoundGroup.CHAIN).noCollision().noBlockBreakParticles()));
    public static final Block WALL_HANGING_LIME_SIGN = Registry.register(Registries.BLOCK, new Identifier(BigStationSigns.MOD_ID, "lime_wall_hanging_sign"),
            new TerraformWallHangingSignBlock(SmallSignTextureHelper.LIME_HANGING_SIGN_TEXTURE, SmallSignTextureHelper.LIME_HANGING_GUI_SIGN_TEXTURE,FabricBlockSettings.copyOf(Blocks.CHAIN).sounds(BlockSoundGroup.CHAIN).dropsLike(HANGING_LIME_SIGN).noCollision().noBlockBreakParticles()));
    public static final Block STANDING_BLUE_SIGN = Registry.register(Registries.BLOCK, new Identifier(BigStationSigns.MOD_ID, "blue_standing_sign"),
            new TerraformSignBlock(SmallSignTextureHelper.BLUE_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.CHAIN).sounds(BlockSoundGroup.CHAIN).noCollision().noBlockBreakParticles()));
    public static final Block WALL_BLUE_SIGN = Registry.register(Registries.BLOCK, new Identifier(BigStationSigns.MOD_ID, "blue_wall_sign"),
            new TerraformWallSignBlock(SmallSignTextureHelper.BLUE_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.CHAIN).sounds(BlockSoundGroup.CHAIN).dropsLike(STANDING_BLUE_SIGN).noCollision().noBlockBreakParticles()));
    public static final Block HANGING_BLUE_SIGN = Registry.register(Registries.BLOCK, new Identifier(BigStationSigns.MOD_ID, "blue_hanging_sign"),
            new TerraformHangingSignBlock(SmallSignTextureHelper.BLUE_HANGING_SIGN_TEXTURE, SmallSignTextureHelper.BLUE_HANGING_GUI_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.CHAIN).sounds(BlockSoundGroup.CHAIN).noCollision().noBlockBreakParticles()));
    public static final Block WALL_HANGING_BLUE_SIGN = Registry.register(Registries.BLOCK, new Identifier(BigStationSigns.MOD_ID, "blue_wall_hanging_sign"),
            new TerraformWallHangingSignBlock(SmallSignTextureHelper.BLUE_HANGING_SIGN_TEXTURE, SmallSignTextureHelper.BLUE_HANGING_GUI_SIGN_TEXTURE,FabricBlockSettings.copyOf(Blocks.CHAIN).sounds(BlockSoundGroup.CHAIN).dropsLike(HANGING_BLUE_SIGN).noCollision().noBlockBreakParticles()));
    public static final Block STANDING_LIGHT_BLUE_SIGN = Registry.register(Registries.BLOCK, new Identifier(BigStationSigns.MOD_ID, "light_blue_standing_sign"),
            new TerraformSignBlock(SmallSignTextureHelper.LIGHT_BLUE_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.CHAIN).sounds(BlockSoundGroup.CHAIN).noCollision().noBlockBreakParticles()));
    public static final Block WALL_LIGHT_BLUE_SIGN = Registry.register(Registries.BLOCK, new Identifier(BigStationSigns.MOD_ID, "light_blue_wall_sign"),
            new TerraformWallSignBlock(SmallSignTextureHelper.LIGHT_BLUE_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.CHAIN).sounds(BlockSoundGroup.CHAIN).dropsLike(STANDING_LIGHT_BLUE_SIGN).noCollision().noBlockBreakParticles()));
    public static final Block HANGING_LIGHT_BLUE_SIGN = Registry.register(Registries.BLOCK, new Identifier(BigStationSigns.MOD_ID, "light_blue_hanging_sign"),
            new TerraformHangingSignBlock(SmallSignTextureHelper.LIGHT_BLUE_HANGING_SIGN_TEXTURE, SmallSignTextureHelper.LIGHT_BLUE_HANGING_GUI_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.CHAIN).sounds(BlockSoundGroup.CHAIN).noCollision().noBlockBreakParticles()));
    public static final Block WALL_HANGING_LIGHT_BLUE_SIGN = Registry.register(Registries.BLOCK, new Identifier(BigStationSigns.MOD_ID, "light_blue_wall_hanging_sign"),
            new TerraformWallHangingSignBlock(SmallSignTextureHelper.LIGHT_BLUE_HANGING_SIGN_TEXTURE, SmallSignTextureHelper.LIGHT_BLUE_HANGING_GUI_SIGN_TEXTURE,FabricBlockSettings.copyOf(Blocks.CHAIN).sounds(BlockSoundGroup.CHAIN).dropsLike(HANGING_LIGHT_BLUE_SIGN).noCollision().noBlockBreakParticles()));
    public static final Block STANDING_MAGENTA_SIGN = Registry.register(Registries.BLOCK, new Identifier(BigStationSigns.MOD_ID, "magenta_standing_sign"),
            new TerraformSignBlock(SmallSignTextureHelper.MAGENTA_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.CHAIN).sounds(BlockSoundGroup.CHAIN).noCollision().noBlockBreakParticles()));
    public static final Block WALL_MAGENTA_SIGN = Registry.register(Registries.BLOCK, new Identifier(BigStationSigns.MOD_ID, "magenta_wall_sign"),
            new TerraformWallSignBlock(SmallSignTextureHelper.MAGENTA_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.CHAIN).sounds(BlockSoundGroup.CHAIN).dropsLike(STANDING_MAGENTA_SIGN).noCollision().noBlockBreakParticles()));
    public static final Block HANGING_MAGENTA_SIGN = Registry.register(Registries.BLOCK, new Identifier(BigStationSigns.MOD_ID, "magenta_hanging_sign"),
            new TerraformHangingSignBlock(SmallSignTextureHelper.MAGENTA_HANGING_SIGN_TEXTURE, SmallSignTextureHelper.MAGENTA_HANGING_GUI_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.CHAIN).sounds(BlockSoundGroup.CHAIN).noCollision().noBlockBreakParticles()));
    public static final Block WALL_HANGING_MAGENTA_SIGN = Registry.register(Registries.BLOCK, new Identifier(BigStationSigns.MOD_ID, "magenta_wall_hanging_sign"),
            new TerraformWallHangingSignBlock(SmallSignTextureHelper.MAGENTA_HANGING_SIGN_TEXTURE, SmallSignTextureHelper.MAGENTA_HANGING_GUI_SIGN_TEXTURE,FabricBlockSettings.copyOf(Blocks.CHAIN).sounds(BlockSoundGroup.CHAIN).dropsLike(HANGING_MAGENTA_SIGN).noCollision().noBlockBreakParticles()));
    public static final Block STANDING_PURPLE_SIGN = Registry.register(Registries.BLOCK, new Identifier(BigStationSigns.MOD_ID, "purple_standing_sign"),
            new TerraformSignBlock(SmallSignTextureHelper.PURPLE_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.CHAIN).sounds(BlockSoundGroup.CHAIN).noCollision().noBlockBreakParticles()));
    public static final Block WALL_PURPLE_SIGN = Registry.register(Registries.BLOCK, new Identifier(BigStationSigns.MOD_ID, "purple_wall_sign"),
            new TerraformWallSignBlock(SmallSignTextureHelper.PURPLE_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.CHAIN).sounds(BlockSoundGroup.CHAIN).dropsLike(STANDING_PURPLE_SIGN).noCollision().noBlockBreakParticles()));
    public static final Block STANDING_PURPLE_SIGN_B = Registry.register(Registries.BLOCK, new Identifier(BigStationSigns.MOD_ID, "purple_standing_sign_b"),
            new TerraformSignBlock(SmallSignTextureHelper.PURPLE_SIGN_TEXTURE_B, FabricBlockSettings.copyOf(Blocks.CHAIN).sounds(BlockSoundGroup.CHAIN).noCollision().noBlockBreakParticles()));
    public static final Block WALL_PURPLE_SIGN_B = Registry.register(Registries.BLOCK, new Identifier(BigStationSigns.MOD_ID, "purple_wall_sign_b"),
            new TerraformWallSignBlock(SmallSignTextureHelper.PURPLE_SIGN_TEXTURE_B, FabricBlockSettings.copyOf(Blocks.CHAIN).sounds(BlockSoundGroup.CHAIN).dropsLike(STANDING_PURPLE_SIGN_B).noCollision().noBlockBreakParticles()));
    public static final Block STANDING_PURPLE_SIGN_C = Registry.register(Registries.BLOCK, new Identifier(BigStationSigns.MOD_ID, "purple_standing_sign_c"),
            new TerraformSignBlock(SmallSignTextureHelper.PURPLE_SIGN_TEXTURE_C, FabricBlockSettings.copyOf(Blocks.CHAIN).sounds(BlockSoundGroup.CHAIN).noCollision().noBlockBreakParticles()));
    public static final Block WALL_PURPLE_SIGN_C = Registry.register(Registries.BLOCK, new Identifier(BigStationSigns.MOD_ID, "purple_wall_sign_c"),
            new TerraformWallSignBlock(SmallSignTextureHelper.PURPLE_SIGN_TEXTURE_C, FabricBlockSettings.copyOf(Blocks.CHAIN).sounds(BlockSoundGroup.CHAIN).dropsLike(STANDING_PURPLE_SIGN_C).noCollision().noBlockBreakParticles()));
    public static final Block STANDING_PURPLE_SIGN_D = Registry.register(Registries.BLOCK, new Identifier(BigStationSigns.MOD_ID, "purple_standing_sign_d"),
            new TerraformSignBlock(SmallSignTextureHelper.PURPLE_SIGN_TEXTURE_D, FabricBlockSettings.copyOf(Blocks.CHAIN).sounds(BlockSoundGroup.CHAIN).noCollision().noBlockBreakParticles()));
    public static final Block WALL_PURPLE_SIGN_D = Registry.register(Registries.BLOCK, new Identifier(BigStationSigns.MOD_ID, "purple_wall_sign_d"),
            new TerraformWallSignBlock(SmallSignTextureHelper.PURPLE_SIGN_TEXTURE_D, FabricBlockSettings.copyOf(Blocks.CHAIN).sounds(BlockSoundGroup.CHAIN).dropsLike(STANDING_PURPLE_SIGN_D).noCollision().noBlockBreakParticles()));
    public static final Block HANGING_PURPLE_SIGN = Registry.register(Registries.BLOCK, new Identifier(BigStationSigns.MOD_ID, "purple_hanging_sign"),
            new TerraformHangingSignBlock(SmallSignTextureHelper.PURPLE_HANGING_SIGN_TEXTURE, SmallSignTextureHelper.PURPLE_HANGING_GUI_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.CHAIN).sounds(BlockSoundGroup.CHAIN).noCollision().noBlockBreakParticles()));
    public static final Block WALL_HANGING_PURPLE_SIGN = Registry.register(Registries.BLOCK, new Identifier(BigStationSigns.MOD_ID, "purple_wall_hanging_sign"),
            new TerraformWallHangingSignBlock(SmallSignTextureHelper.PURPLE_HANGING_SIGN_TEXTURE, SmallSignTextureHelper.PURPLE_HANGING_GUI_SIGN_TEXTURE,FabricBlockSettings.copyOf(Blocks.CHAIN).sounds(BlockSoundGroup.CHAIN).dropsLike(HANGING_PURPLE_SIGN).noCollision().noBlockBreakParticles()));
    public static final Block STANDING_PINK_SIGN = Registry.register(Registries.BLOCK, new Identifier(BigStationSigns.MOD_ID, "pink_standing_sign"),
            new TerraformSignBlock(SmallSignTextureHelper.PINK_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.CHAIN).sounds(BlockSoundGroup.CHAIN).noCollision().noBlockBreakParticles()));
    public static final Block WALL_PINK_SIGN = Registry.register(Registries.BLOCK, new Identifier(BigStationSigns.MOD_ID, "pink_wall_sign"),
            new TerraformWallSignBlock(SmallSignTextureHelper.PINK_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.CHAIN).sounds(BlockSoundGroup.CHAIN).dropsLike(STANDING_PINK_SIGN).noCollision().noBlockBreakParticles()));
    public static final Block STANDING_PINK_SIGN_B = Registry.register(Registries.BLOCK, new Identifier(BigStationSigns.MOD_ID, "pink_standing_sign_b"),
            new TerraformSignBlock(SmallSignTextureHelper.PINK_SIGN_TEXTURE_B, FabricBlockSettings.copyOf(Blocks.CHAIN).sounds(BlockSoundGroup.CHAIN).noCollision().noBlockBreakParticles()));
    public static final Block WALL_PINK_SIGN_B = Registry.register(Registries.BLOCK, new Identifier(BigStationSigns.MOD_ID, "pink_wall_sign_b"),
            new TerraformWallSignBlock(SmallSignTextureHelper.PINK_SIGN_TEXTURE_B, FabricBlockSettings.copyOf(Blocks.CHAIN).sounds(BlockSoundGroup.CHAIN).dropsLike(STANDING_PINK_SIGN_B).noCollision().noBlockBreakParticles()));
    public static final Block HANGING_PINK_SIGN = Registry.register(Registries.BLOCK, new Identifier(BigStationSigns.MOD_ID, "pink_hanging_sign"),
            new TerraformHangingSignBlock(SmallSignTextureHelper.PINK_HANGING_SIGN_TEXTURE, SmallSignTextureHelper.PINK_HANGING_GUI_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.CHAIN).sounds(BlockSoundGroup.CHAIN).noCollision().noBlockBreakParticles()));
    public static final Block WALL_HANGING_PINK_SIGN = Registry.register(Registries.BLOCK, new Identifier(BigStationSigns.MOD_ID, "pink_wall_hanging_sign"),
            new TerraformWallHangingSignBlock(SmallSignTextureHelper.PINK_HANGING_SIGN_TEXTURE, SmallSignTextureHelper.PINK_HANGING_GUI_SIGN_TEXTURE,FabricBlockSettings.copyOf(Blocks.CHAIN).sounds(BlockSoundGroup.CHAIN).dropsLike(HANGING_PINK_SIGN).noCollision().noBlockBreakParticles()));
    public static final Block STANDING_CYAN_SIGN = Registry.register(Registries.BLOCK, new Identifier(BigStationSigns.MOD_ID, "cyan_standing_sign"),
            new TerraformSignBlock(SmallSignTextureHelper.CYAN_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.CHAIN).sounds(BlockSoundGroup.CHAIN).noCollision().noBlockBreakParticles()));
    public static final Block WALL_CYAN_SIGN = Registry.register(Registries.BLOCK, new Identifier(BigStationSigns.MOD_ID, "cyan_wall_sign"),
            new TerraformWallSignBlock(SmallSignTextureHelper.CYAN_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.CHAIN).sounds(BlockSoundGroup.CHAIN).dropsLike(STANDING_CYAN_SIGN).noCollision().noBlockBreakParticles()));
    public static final Block STANDING_CYAN_SIGN_B = Registry.register(Registries.BLOCK, new Identifier(BigStationSigns.MOD_ID, "cyan_standing_sign_b"),
            new TerraformSignBlock(SmallSignTextureHelper.CYAN_SIGN_TEXTURE_B, FabricBlockSettings.copyOf(Blocks.CHAIN).sounds(BlockSoundGroup.CHAIN).noCollision().noBlockBreakParticles()));
    public static final Block WALL_CYAN_SIGN_B = Registry.register(Registries.BLOCK, new Identifier(BigStationSigns.MOD_ID, "cyan_wall_sign_b"),
            new TerraformWallSignBlock(SmallSignTextureHelper.CYAN_SIGN_TEXTURE_B, FabricBlockSettings.copyOf(Blocks.CHAIN).sounds(BlockSoundGroup.CHAIN).dropsLike(STANDING_CYAN_SIGN_B).noCollision().noBlockBreakParticles()));
    public static final Block STANDING_CYAN_SIGN_C = Registry.register(Registries.BLOCK, new Identifier(BigStationSigns.MOD_ID, "cyan_standing_sign_c"),
            new TerraformSignBlock(SmallSignTextureHelper.CYAN_SIGN_TEXTURE_C, FabricBlockSettings.copyOf(Blocks.CHAIN).sounds(BlockSoundGroup.CHAIN).noCollision().noBlockBreakParticles()));
    public static final Block WALL_CYAN_SIGN_C = Registry.register(Registries.BLOCK, new Identifier(BigStationSigns.MOD_ID, "cyan_wall_sign_c"),
            new TerraformWallSignBlock(SmallSignTextureHelper.CYAN_SIGN_TEXTURE_C, FabricBlockSettings.copyOf(Blocks.CHAIN).sounds(BlockSoundGroup.CHAIN).dropsLike(STANDING_CYAN_SIGN_C).noCollision().noBlockBreakParticles()));
    public static final Block STANDING_CYAN_SIGN_D = Registry.register(Registries.BLOCK, new Identifier(BigStationSigns.MOD_ID, "cyan_standing_sign_d"),
            new TerraformSignBlock(SmallSignTextureHelper.CYAN_SIGN_TEXTURE_D, FabricBlockSettings.copyOf(Blocks.CHAIN).sounds(BlockSoundGroup.CHAIN).noCollision().noBlockBreakParticles()));
    public static final Block WALL_CYAN_SIGN_D = Registry.register(Registries.BLOCK, new Identifier(BigStationSigns.MOD_ID, "cyan_wall_sign_d"),
            new TerraformWallSignBlock(SmallSignTextureHelper.CYAN_SIGN_TEXTURE_D, FabricBlockSettings.copyOf(Blocks.CHAIN).sounds(BlockSoundGroup.CHAIN).dropsLike(STANDING_CYAN_SIGN_D).noCollision().noBlockBreakParticles()));
    public static final Block HANGING_CYAN_SIGN = Registry.register(Registries.BLOCK, new Identifier(BigStationSigns.MOD_ID, "cyan_hanging_sign"),
            new TerraformHangingSignBlock(SmallSignTextureHelper.CYAN_HANGING_SIGN_TEXTURE, SmallSignTextureHelper.CYAN_HANGING_GUI_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.CHAIN).sounds(BlockSoundGroup.CHAIN).noCollision().noBlockBreakParticles()));
    public static final Block WALL_HANGING_CYAN_SIGN = Registry.register(Registries.BLOCK, new Identifier(BigStationSigns.MOD_ID, "cyan_wall_hanging_sign"),
            new TerraformWallHangingSignBlock(SmallSignTextureHelper.CYAN_HANGING_SIGN_TEXTURE, SmallSignTextureHelper.CYAN_HANGING_GUI_SIGN_TEXTURE,FabricBlockSettings.copyOf(Blocks.CHAIN).sounds(BlockSoundGroup.CHAIN).dropsLike(HANGING_CYAN_SIGN).noCollision().noBlockBreakParticles()));
    public static final Block STANDING_LIGHT_GRAY_SIGN = Registry.register(Registries.BLOCK, new Identifier(BigStationSigns.MOD_ID, "light_gray_standing_sign"),
            new TerraformSignBlock(SmallSignTextureHelper.LIGHT_GRAY_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.CHAIN).sounds(BlockSoundGroup.CHAIN).noCollision().noBlockBreakParticles()));
    public static final Block WALL_LIGHT_GRAY_SIGN = Registry.register(Registries.BLOCK, new Identifier(BigStationSigns.MOD_ID, "light_gray_wall_sign"),
            new TerraformWallSignBlock(SmallSignTextureHelper.LIGHT_GRAY_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.CHAIN).sounds(BlockSoundGroup.CHAIN).dropsLike(STANDING_LIGHT_GRAY_SIGN).noCollision().noBlockBreakParticles()));
    public static final Block HANGING_LIGHT_GRAY_SIGN = Registry.register(Registries.BLOCK, new Identifier(BigStationSigns.MOD_ID, "light_gray_hanging_sign"),
            new TerraformHangingSignBlock(SmallSignTextureHelper.LIGHT_GRAY_HANGING_SIGN_TEXTURE, SmallSignTextureHelper.LIGHT_GRAY_HANGING_GUI_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.CHAIN).sounds(BlockSoundGroup.CHAIN).noCollision().noBlockBreakParticles()));
    public static final Block WALL_HANGING_LIGHT_GRAY_SIGN = Registry.register(Registries.BLOCK, new Identifier(BigStationSigns.MOD_ID, "light_gray_wall_hanging_sign"),
            new TerraformWallHangingSignBlock(SmallSignTextureHelper.LIGHT_GRAY_HANGING_SIGN_TEXTURE, SmallSignTextureHelper.LIGHT_GRAY_HANGING_GUI_SIGN_TEXTURE,FabricBlockSettings.copyOf(Blocks.CHAIN).sounds(BlockSoundGroup.CHAIN).dropsLike(HANGING_LIGHT_GRAY_SIGN).noCollision().noBlockBreakParticles()));
    public static final Block STANDING_BLACK_SIGN = Registry.register(Registries.BLOCK, new Identifier(BigStationSigns.MOD_ID, "black_standing_sign"),
            new TerraformSignBlock(SmallSignTextureHelper.BLACK_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.CHAIN).sounds(BlockSoundGroup.CHAIN).noCollision().noBlockBreakParticles()));
    public static final Block WALL_BLACK_SIGN = Registry.register(Registries.BLOCK, new Identifier(BigStationSigns.MOD_ID, "black_wall_sign"),
            new TerraformWallSignBlock(SmallSignTextureHelper.BLACK_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.CHAIN).sounds(BlockSoundGroup.CHAIN).dropsLike(STANDING_BLACK_SIGN).noCollision().noBlockBreakParticles()));
    public static final Block STANDING_BLACK_SIGN_B = Registry.register(Registries.BLOCK, new Identifier(BigStationSigns.MOD_ID, "black_standing_sign_b"),
            new TerraformSignBlock(SmallSignTextureHelper.BLACK_SIGN_TEXTURE_B, FabricBlockSettings.copyOf(Blocks.CHAIN).sounds(BlockSoundGroup.CHAIN).noCollision().noBlockBreakParticles()));
    public static final Block WALL_BLACK_SIGN_B = Registry.register(Registries.BLOCK, new Identifier(BigStationSigns.MOD_ID, "black_wall_sign_b"),
            new TerraformWallSignBlock(SmallSignTextureHelper.BLACK_SIGN_TEXTURE_B, FabricBlockSettings.copyOf(Blocks.CHAIN).sounds(BlockSoundGroup.CHAIN).dropsLike(STANDING_BLACK_SIGN_B).noCollision().noBlockBreakParticles()));
    public static final Block STANDING_BLACK_SIGN_C = Registry.register(Registries.BLOCK, new Identifier(BigStationSigns.MOD_ID, "black_standing_sign_c"),
            new TerraformSignBlock(SmallSignTextureHelper.BLACK_SIGN_TEXTURE_C, FabricBlockSettings.copyOf(Blocks.CHAIN).sounds(BlockSoundGroup.CHAIN).noCollision().noBlockBreakParticles()));
    public static final Block WALL_BLACK_SIGN_C = Registry.register(Registries.BLOCK, new Identifier(BigStationSigns.MOD_ID, "black_wall_sign_c"),
            new TerraformWallSignBlock(SmallSignTextureHelper.BLACK_SIGN_TEXTURE_C, FabricBlockSettings.copyOf(Blocks.CHAIN).sounds(BlockSoundGroup.CHAIN).dropsLike(STANDING_BLACK_SIGN_C).noCollision().noBlockBreakParticles()));
    public static final Block STANDING_BLACK_SIGN_D = Registry.register(Registries.BLOCK, new Identifier(BigStationSigns.MOD_ID, "black_standing_sign_d"),
            new TerraformSignBlock(SmallSignTextureHelper.BLACK_SIGN_TEXTURE_D, FabricBlockSettings.copyOf(Blocks.CHAIN).sounds(BlockSoundGroup.CHAIN).noCollision().noBlockBreakParticles()));
    public static final Block WALL_BLACK_SIGN_D = Registry.register(Registries.BLOCK, new Identifier(BigStationSigns.MOD_ID, "black_wall_sign_d"),
            new TerraformWallSignBlock(SmallSignTextureHelper.BLACK_SIGN_TEXTURE_D, FabricBlockSettings.copyOf(Blocks.CHAIN).sounds(BlockSoundGroup.CHAIN).dropsLike(STANDING_BLACK_SIGN_D).noCollision().noBlockBreakParticles()));
    public static final Block HANGING_BLACK_SIGN = Registry.register(Registries.BLOCK, new Identifier(BigStationSigns.MOD_ID, "black_hanging_sign"),
            new TerraformHangingSignBlock(SmallSignTextureHelper.BLACK_HANGING_SIGN_TEXTURE, SmallSignTextureHelper.BLACK_HANGING_GUI_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.CHAIN).sounds(BlockSoundGroup.CHAIN).noCollision().noBlockBreakParticles()));
    public static final Block WALL_HANGING_BLACK_SIGN = Registry.register(Registries.BLOCK, new Identifier(BigStationSigns.MOD_ID, "black_wall_hanging_sign"),
            new TerraformWallHangingSignBlock(SmallSignTextureHelper.BLACK_HANGING_SIGN_TEXTURE, SmallSignTextureHelper.BLACK_HANGING_GUI_SIGN_TEXTURE,FabricBlockSettings.copyOf(Blocks.CHAIN).sounds(BlockSoundGroup.CHAIN).dropsLike(HANGING_BLACK_SIGN).noCollision().noBlockBreakParticles()));
    public static final Block STANDING_WHITE_SIGN = Registry.register(Registries.BLOCK, new Identifier(BigStationSigns.MOD_ID, "white_standing_sign"),
            new TerraformSignBlock(SmallSignTextureHelper.WHITE_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.CHAIN).sounds(BlockSoundGroup.CHAIN).noCollision().noBlockBreakParticles()));
    public static final Block WALL_WHITE_SIGN = Registry.register(Registries.BLOCK, new Identifier(BigStationSigns.MOD_ID, "white_wall_sign"),
            new TerraformWallSignBlock(SmallSignTextureHelper.WHITE_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.CHAIN).sounds(BlockSoundGroup.CHAIN).dropsLike(STANDING_WHITE_SIGN).noCollision().noBlockBreakParticles()));
    public static final Block HANGING_WHITE_SIGN = Registry.register(Registries.BLOCK, new Identifier(BigStationSigns.MOD_ID, "white_hanging_sign"),
            new TerraformHangingSignBlock(SmallSignTextureHelper.WHITE_HANGING_SIGN_TEXTURE, SmallSignTextureHelper.WHITE_HANGING_GUI_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.CHAIN).sounds(BlockSoundGroup.CHAIN).noCollision().noBlockBreakParticles()));
    public static final Block WALL_HANGING_WHITE_SIGN = Registry.register(Registries.BLOCK, new Identifier(BigStationSigns.MOD_ID, "white_wall_hanging_sign"),
            new TerraformWallHangingSignBlock(SmallSignTextureHelper.WHITE_HANGING_SIGN_TEXTURE, SmallSignTextureHelper.WHITE_HANGING_GUI_SIGN_TEXTURE,FabricBlockSettings.copyOf(Blocks.CHAIN).sounds(BlockSoundGroup.CHAIN).dropsLike(HANGING_WHITE_SIGN).noCollision().noBlockBreakParticles()));
    public static final Block STANDING_ORANGE_SIGN = Registry.register(Registries.BLOCK, new Identifier(BigStationSigns.MOD_ID, "orange_standing_sign"),
            new TerraformSignBlock(SmallSignTextureHelper.ORANGE_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.CHAIN).sounds(BlockSoundGroup.CHAIN).noCollision().noBlockBreakParticles()));
    public static final Block WALL_ORANGE_SIGN = Registry.register(Registries.BLOCK, new Identifier(BigStationSigns.MOD_ID, "orange_wall_sign"),
            new TerraformWallSignBlock(SmallSignTextureHelper.ORANGE_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.CHAIN).sounds(BlockSoundGroup.CHAIN).dropsLike(STANDING_ORANGE_SIGN).noCollision().noBlockBreakParticles()));
    public static final Block STANDING_ORANGE_SIGN_B = Registry.register(Registries.BLOCK, new Identifier(BigStationSigns.MOD_ID, "orange_standing_sign_b"),
            new TerraformSignBlock(SmallSignTextureHelper.ORANGE_SIGN_TEXTURE_B, FabricBlockSettings.copyOf(Blocks.CHAIN).sounds(BlockSoundGroup.CHAIN).noCollision().noBlockBreakParticles()));
    public static final Block WALL_ORANGE_SIGN_B = Registry.register(Registries.BLOCK, new Identifier(BigStationSigns.MOD_ID, "orange_wall_sign_b"),
            new TerraformWallSignBlock(SmallSignTextureHelper.ORANGE_SIGN_TEXTURE_B, FabricBlockSettings.copyOf(Blocks.CHAIN).sounds(BlockSoundGroup.CHAIN).dropsLike(STANDING_ORANGE_SIGN_B).noCollision().noBlockBreakParticles()));
    public static final Block HANGING_ORANGE_SIGN = Registry.register(Registries.BLOCK, new Identifier(BigStationSigns.MOD_ID, "orange_hanging_sign"),
            new TerraformHangingSignBlock(SmallSignTextureHelper.ORANGE_HANGING_SIGN_TEXTURE, SmallSignTextureHelper.ORANGE_HANGING_GUI_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.CHAIN).sounds(BlockSoundGroup.CHAIN).noCollision().noBlockBreakParticles()));
    public static final Block WALL_HANGING_ORANGE_SIGN = Registry.register(Registries.BLOCK, new Identifier(BigStationSigns.MOD_ID, "orange_wall_hanging_sign"),
            new TerraformWallHangingSignBlock(SmallSignTextureHelper.ORANGE_HANGING_SIGN_TEXTURE, SmallSignTextureHelper.ORANGE_HANGING_GUI_SIGN_TEXTURE,FabricBlockSettings.copyOf(Blocks.CHAIN).sounds(BlockSoundGroup.CHAIN).dropsLike(HANGING_ORANGE_SIGN).noCollision().noBlockBreakParticles()));
    public static final Block STANDING_BROWN_SIGN = Registry.register(Registries.BLOCK, new Identifier(BigStationSigns.MOD_ID, "brown_standing_sign"),
            new TerraformSignBlock(SmallSignTextureHelper.BROWN_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.CHAIN).sounds(BlockSoundGroup.CHAIN).noCollision().noBlockBreakParticles()));
    public static final Block WALL_BROWN_SIGN = Registry.register(Registries.BLOCK, new Identifier(BigStationSigns.MOD_ID, "brown_wall_sign"),
            new TerraformWallSignBlock(SmallSignTextureHelper.BROWN_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.CHAIN).sounds(BlockSoundGroup.CHAIN).dropsLike(STANDING_BROWN_SIGN).noCollision().noBlockBreakParticles()));
    public static final Block HANGING_BROWN_SIGN = Registry.register(Registries.BLOCK, new Identifier(BigStationSigns.MOD_ID, "brown_hanging_sign"),
            new TerraformHangingSignBlock(SmallSignTextureHelper.BROWN_HANGING_SIGN_TEXTURE, SmallSignTextureHelper.BROWN_HANGING_GUI_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.CHAIN).sounds(BlockSoundGroup.CHAIN).noCollision().noBlockBreakParticles()));
    public static final Block WALL_HANGING_BROWN_SIGN = Registry.register(Registries.BLOCK, new Identifier(BigStationSigns.MOD_ID, "brown_wall_hanging_sign"),
            new TerraformWallHangingSignBlock(SmallSignTextureHelper.BROWN_HANGING_SIGN_TEXTURE, SmallSignTextureHelper.BROWN_HANGING_GUI_SIGN_TEXTURE,FabricBlockSettings.copyOf(Blocks.CHAIN).sounds(BlockSoundGroup.CHAIN).dropsLike(HANGING_BROWN_SIGN).noCollision().noBlockBreakParticles()));
    public static final Block STANDING_YELLOW_SIGN = Registry.register(Registries.BLOCK, new Identifier(BigStationSigns.MOD_ID, "yellow_standing_sign"),
            new TerraformSignBlock(SmallSignTextureHelper.YELLOW_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.CHAIN).sounds(BlockSoundGroup.CHAIN).noCollision().noBlockBreakParticles()));
    public static final Block WALL_YELLOW_SIGN = Registry.register(Registries.BLOCK, new Identifier(BigStationSigns.MOD_ID, "yellow_wall_sign"),
            new TerraformWallSignBlock(SmallSignTextureHelper.YELLOW_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.CHAIN).sounds(BlockSoundGroup.CHAIN).dropsLike(STANDING_YELLOW_SIGN).noCollision().noBlockBreakParticles()));
    public static final Block STANDING_YELLOW_SIGN_B = Registry.register(Registries.BLOCK, new Identifier(BigStationSigns.MOD_ID, "yellow_standing_sign_b"),
            new TerraformSignBlock(SmallSignTextureHelper.YELLOW_SIGN_TEXTURE_B, FabricBlockSettings.copyOf(Blocks.CHAIN).sounds(BlockSoundGroup.CHAIN)));
    public static final Block WALL_YELLOW_SIGN_B = Registry.register(Registries.BLOCK, new Identifier(BigStationSigns.MOD_ID, "yellow_wall_sign_b"),
            new TerraformWallSignBlock(SmallSignTextureHelper.YELLOW_SIGN_TEXTURE_B, FabricBlockSettings.copyOf(Blocks.CHAIN).sounds(BlockSoundGroup.CHAIN).dropsLike(STANDING_YELLOW_SIGN_B).noCollision().noBlockBreakParticles()));
    public static final Block HANGING_YELLOW_SIGN = Registry.register(Registries.BLOCK, new Identifier(BigStationSigns.MOD_ID, "yellow_hanging_sign"),
            new TerraformHangingSignBlock(SmallSignTextureHelper.YELLOW_HANGING_SIGN_TEXTURE, SmallSignTextureHelper.YELLOW_HANGING_GUI_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.CHAIN).sounds(BlockSoundGroup.CHAIN).noCollision().noBlockBreakParticles()));
    public static final Block WALL_HANGING_YELLOW_SIGN = Registry.register(Registries.BLOCK, new Identifier(BigStationSigns.MOD_ID, "yellow_wall_hanging_sign"),
            new TerraformWallHangingSignBlock(SmallSignTextureHelper.YELLOW_HANGING_SIGN_TEXTURE, SmallSignTextureHelper.YELLOW_HANGING_GUI_SIGN_TEXTURE,FabricBlockSettings.copyOf(Blocks.CHAIN).sounds(BlockSoundGroup.CHAIN).dropsLike(HANGING_YELLOW_SIGN).noCollision().noBlockBreakParticles()));

    //big signs
    public static final Block WHITE_BIG_STATION_SIGN = registerBlock("white_big_sign",
            new GrayBigStationSign(FabricBlockSettings.copyOf(Blocks.CHAIN).sounds(BlockSoundGroup.CHAIN).noBlockBreakParticles().nonOpaque()));
    public static final Block LIGHT_GRAY_BIG_STATION_SIGN = registerBlock("light_gray_big_sign",
            new GrayBigStationSign(FabricBlockSettings.copyOf(Blocks.CHAIN).sounds(BlockSoundGroup.CHAIN).noBlockBreakParticles().nonOpaque()));
    public static final Block GRAY_BIG_STATION_SIGN = registerBlock("gray_big_sign",
            new GrayBigStationSign(FabricBlockSettings.copyOf(Blocks.CHAIN).sounds(BlockSoundGroup.CHAIN).noBlockBreakParticles().nonOpaque()));
    public static final Block BLACK_BIG_STATION_SIGN = registerBlock("black_big_sign",
            new GrayBigStationSign(FabricBlockSettings.copyOf(Blocks.CHAIN).sounds(BlockSoundGroup.CHAIN).noBlockBreakParticles().nonOpaque()));
    public static final Block BLACK_BIG_STATION_SIGN_B = registerBlock("black_big_sign_b",
            new GrayBigStationSign(FabricBlockSettings.copyOf(Blocks.CHAIN).sounds(BlockSoundGroup.CHAIN).noBlockBreakParticles().nonOpaque()));
    public static final Block BLACK_BIG_STATION_SIGN_C = registerBlock("black_big_sign_c",
            new GrayBigStationSign(FabricBlockSettings.copyOf(Blocks.CHAIN).sounds(BlockSoundGroup.CHAIN).noBlockBreakParticles().nonOpaque()));
    public static final Block BLACK_BIG_STATION_SIGN_D = registerBlock("black_big_sign_d",
            new GrayBigStationSign(FabricBlockSettings.copyOf(Blocks.CHAIN).sounds(BlockSoundGroup.CHAIN).noBlockBreakParticles().nonOpaque()));
    public static final Block BROWN_BIG_STATION_SIGN = registerBlock("brown_big_sign",
            new GrayBigStationSign(FabricBlockSettings.copyOf(Blocks.CHAIN).sounds(BlockSoundGroup.CHAIN).noBlockBreakParticles().nonOpaque()));
    public static final Block RED_BIG_STATION_SIGN = registerBlock("red_big_sign",
            new GrayBigStationSign(FabricBlockSettings.copyOf(Blocks.CHAIN).sounds(BlockSoundGroup.CHAIN).noBlockBreakParticles().nonOpaque()));
    public static final Block ORANGE_BIG_STATION_SIGN = registerBlock("orange_big_sign",
            new GrayBigStationSign(FabricBlockSettings.copyOf(Blocks.CHAIN).sounds(BlockSoundGroup.CHAIN).noBlockBreakParticles().nonOpaque()));
    public static final Block ORANGE_BIG_STATION_SIGN_B = registerBlock("orange_big_sign_b",
            new GrayBigStationSign(FabricBlockSettings.copyOf(Blocks.CHAIN).sounds(BlockSoundGroup.CHAIN).noBlockBreakParticles().nonOpaque()));
    public static final Block YELLOW_BIG_STATION_SIGN = registerBlock("yellow_big_sign",
            new GrayBigStationSign(FabricBlockSettings.copyOf(Blocks.CHAIN).sounds(BlockSoundGroup.CHAIN).noBlockBreakParticles().nonOpaque()));
    public static final Block YELLOW_BIG_STATION_SIGN_B = registerBlock("yellow_big_sign_b",
            new GrayBigStationSign(FabricBlockSettings.copyOf(Blocks.CHAIN).sounds(BlockSoundGroup.CHAIN).noBlockBreakParticles().nonOpaque()));
    public static final Block LIME_BIG_STATION_SIGN = registerBlock("lime_big_sign",
            new GrayBigStationSign(FabricBlockSettings.copyOf(Blocks.CHAIN).sounds(BlockSoundGroup.CHAIN).noBlockBreakParticles().nonOpaque()));
    public static final Block LIME_BIG_STATION_SIGN_B = registerBlock("lime_big_sign_b",
            new GrayBigStationSign(FabricBlockSettings.copyOf(Blocks.CHAIN).sounds(BlockSoundGroup.CHAIN).noBlockBreakParticles().nonOpaque()));
    public static final Block GREEN_BIG_STATION_SIGN = registerBlock("green_big_sign",
            new GrayBigStationSign(FabricBlockSettings.copyOf(Blocks.CHAIN).sounds(BlockSoundGroup.CHAIN).noBlockBreakParticles().nonOpaque()));
    public static final Block GREEN_BIG_STATION_SIGN_B = registerBlock("green_big_sign_b",
            new GrayBigStationSign(FabricBlockSettings.copyOf(Blocks.CHAIN).sounds(BlockSoundGroup.CHAIN).noBlockBreakParticles().nonOpaque()));
    public static final Block GREEN_BIG_STATION_SIGN_C = registerBlock("green_big_sign_c",
            new GrayBigStationSign(FabricBlockSettings.copyOf(Blocks.CHAIN).sounds(BlockSoundGroup.CHAIN).noBlockBreakParticles().nonOpaque()));
    public static final Block GREEN_BIG_STATION_SIGN_D = registerBlock("green_big_sign_d",
            new GrayBigStationSign(FabricBlockSettings.copyOf(Blocks.CHAIN).sounds(BlockSoundGroup.CHAIN).noBlockBreakParticles().nonOpaque()));
    public static final Block CYAN_BIG_STATION_SIGN = registerBlock("cyan_big_sign",
            new GrayBigStationSign(FabricBlockSettings.copyOf(Blocks.CHAIN).sounds(BlockSoundGroup.CHAIN).noBlockBreakParticles().nonOpaque()));
    public static final Block CYAN_BIG_STATION_SIGN_B = registerBlock("cyan_big_sign_b",
            new GrayBigStationSign(FabricBlockSettings.copyOf(Blocks.CHAIN).sounds(BlockSoundGroup.CHAIN).noBlockBreakParticles().nonOpaque()));
    public static final Block CYAN_BIG_STATION_SIGN_C = registerBlock("cyan_big_sign_c",
            new GrayBigStationSign(FabricBlockSettings.copyOf(Blocks.CHAIN).sounds(BlockSoundGroup.CHAIN).noBlockBreakParticles().nonOpaque()));
    public static final Block CYAN_BIG_STATION_SIGN_D = registerBlock("cyan_big_sign_d",
            new GrayBigStationSign(FabricBlockSettings.copyOf(Blocks.CHAIN).sounds(BlockSoundGroup.CHAIN).noBlockBreakParticles().nonOpaque()));
    public static final Block LIGHT_BLUE_BIG_STATION_SIGN = registerBlock("light_blue_big_sign",
            new GrayBigStationSign(FabricBlockSettings.copyOf(Blocks.CHAIN).sounds(BlockSoundGroup.CHAIN).noBlockBreakParticles().nonOpaque()));
    public static final Block BLUE_BIG_STATION_SIGN = registerBlock("blue_big_sign",
            new GrayBigStationSign(FabricBlockSettings.copyOf(Blocks.CHAIN).sounds(BlockSoundGroup.CHAIN).noBlockBreakParticles().nonOpaque()));
    public static final Block PURPLE_BIG_STATION_SIGN = registerBlock("purple_big_sign",
            new GrayBigStationSign(FabricBlockSettings.copyOf(Blocks.CHAIN).sounds(BlockSoundGroup.CHAIN).noBlockBreakParticles().nonOpaque()));
    public static final Block PURPLE_BIG_STATION_SIGN_B = registerBlock("purple_big_sign_b",
            new GrayBigStationSign(FabricBlockSettings.copyOf(Blocks.CHAIN).sounds(BlockSoundGroup.CHAIN).noBlockBreakParticles().nonOpaque()));
    public static final Block PURPLE_BIG_STATION_SIGN_C = registerBlock("purple_big_sign_c",
            new GrayBigStationSign(FabricBlockSettings.copyOf(Blocks.CHAIN).sounds(BlockSoundGroup.CHAIN).noBlockBreakParticles().nonOpaque()));
    public static final Block PURPLE_BIG_STATION_SIGN_D = registerBlock("purple_big_sign_d",
            new GrayBigStationSign(FabricBlockSettings.copyOf(Blocks.CHAIN).sounds(BlockSoundGroup.CHAIN).noBlockBreakParticles().nonOpaque()));
    public static final Block MAGENTA_BIG_STATION_SIGN = registerBlock("magenta_big_sign",
            new GrayBigStationSign(FabricBlockSettings.copyOf(Blocks.CHAIN).sounds(BlockSoundGroup.CHAIN).noBlockBreakParticles().nonOpaque()));
    public static final Block PINK_BIG_STATION_SIGN = registerBlock("pink_big_sign",
            new GrayBigStationSign(FabricBlockSettings.copyOf(Blocks.CHAIN).sounds(BlockSoundGroup.CHAIN).noBlockBreakParticles().nonOpaque()));
    public static final Block PINK_BIG_STATION_SIGN_B = registerBlock("pink_big_sign_b",
            new GrayBigStationSign(FabricBlockSettings.copyOf(Blocks.CHAIN).sounds(BlockSoundGroup.CHAIN).noBlockBreakParticles().nonOpaque()));

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
