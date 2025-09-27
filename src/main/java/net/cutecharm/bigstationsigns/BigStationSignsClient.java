package net.cutecharm.bigstationsigns;

import net.cutecharm.bigstationsigns.block.entity.BigStationSignBlockEntity;
import net.cutecharm.bigstationsigns.block.entity.ModBlockEntities;
import net.cutecharm.bigstationsigns.block.entity.renderer.BigStationSignBlockEntityRenderer;
import net.cutecharm.bigstationsigns.screen.ModScreenHandlers;
import net.cutecharm.bigstationsigns.screen.SigningTableScreen;
import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactories;

public class BigStationSignsClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        HandledScreens.register(ModScreenHandlers.SIGNING_TABLE_SCREEN_HANDLER, SigningTableScreen::new);
        BlockEntityRendererFactories.register(ModBlockEntities.BIG_STATION_SIGN_BLOCK_ENTITY, BigStationSignBlockEntityRenderer::new);
    }

}
