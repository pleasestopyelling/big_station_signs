package net.cutecharm.bigstationsigns;

import net.cutecharm.bigstationsigns.block.entity.BigStationSignBlockEntity;
import net.cutecharm.bigstationsigns.block.entity.ModBlockEntities;
import net.cutecharm.bigstationsigns.block.entity.renderer.BigStationSignBlockEntityRenderer;
import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactories;

public class BigStationSignsClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        BlockEntityRendererFactories.register(ModBlockEntities.BIG_STATION_SIGN_BLOCK_ENTITY, BigStationSignBlockEntityRenderer::new);
    }
}
