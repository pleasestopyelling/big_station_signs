package net.cutecharm.bigstationsigns.screen;


import com.mojang.blaze3d.systems.RenderSystem;
import net.cutecharm.bigstationsigns.BigStationSigns;
import net.cutecharm.bigstationsigns.network.NetworkingConstants;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.fabricmc.fabric.api.networking.v1.PacketByteBufs;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.client.gui.widget.CheckboxWidget;
import net.minecraft.client.render.GameRenderer;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;


public class SigningTableScreen extends HandledScreen<SigningTableScreenHandler> {

    private static final Identifier TEXTURE = new Identifier(BigStationSigns.MOD_ID, "textures/gui/signing_table.png");
    private ButtonWidget doneButton;
    private ButtonWidget leftButton;
    private ButtonWidget rightButton;
    private boolean tab = true;
    public SigningTableScreen(SigningTableScreenHandler handler, PlayerInventory inventory, Text title) {
        super(handler, inventory, title);
    }

    @Override
    protected void init() {
        super.init();
        if (tab) {
            doneButton = ButtonWidget.builder(Text.translatable("screentext.paint"),
                            button -> {
                                handler.toggleSigningTableDone();
                                sendCraftRequest();
                                BigStationSigns.LOGGER.info("Craft button clicked");
                            }).dimensions(163, 92, 60, 20)
                    .build();
            addDrawableChild(doneButton);
            leftButton = ButtonWidget.builder(Text.literal("←"),
                            button -> {

                            }).dimensions(163, 70, 10, 10)
                    .build();
            addDrawableChild(leftButton);
            rightButton = ButtonWidget.builder(Text.literal("→"),
                            button -> {
                            }).dimensions(213, 70, 10, 10)
                    .build();
            addDrawableChild(rightButton);
        }
    }

    @Override
    protected void drawBackground(DrawContext context, float delta, int mouseX, int mouseY) {
        RenderSystem.setShader(GameRenderer::getPositionTexProgram);
        RenderSystem.setShaderColor(1f,1f,1f,1f);
        RenderSystem.setShaderTexture(0,TEXTURE);
        int x = (width - backgroundWidth)/2;
        int y = (height - backgroundHeight)/2;
        context.drawTexture(TEXTURE,x,y,0,0,backgroundWidth,backgroundHeight);

        //render the palette
        context.drawTexture(TEXTURE, x + 109, y + 11, 176, 0, 10, handler.whiteLevel()*10/1000);
        context.drawTexture(TEXTURE, x + 109, y + 26, 176, 10, 10, handler.lightGrayLevel()*10/1000);
        context.drawTexture(TEXTURE, x + 109, y + 41, 176, 20, 10, handler.grayLevel()*10/1000);
        context.drawTexture(TEXTURE, x + 109, y + 56, 176, 30, 10, handler.blackLevel()*10/1000);
        context.drawTexture(TEXTURE, x + 124, y + 11, 186, 0, 10, handler.brownLevel()*10/1000);
        context.drawTexture(TEXTURE, x + 124, y + 26, 186, 10, 10, handler.redLevel()*10/1000);
        context.drawTexture(TEXTURE, x + 124, y + 41, 186, 20, 10, handler.orangeLevel()*10/1000);
        context.drawTexture(TEXTURE, x + 124, y + 56, 186, 30, 10, handler.yellowLevel()*10/1000);
        context.drawTexture(TEXTURE, x + 139, y + 11, 196, 0, 10, handler.limeLevel()*10/1000);
        context.drawTexture(TEXTURE, x + 139, y + 26, 196, 10, 10, handler.greenLevel()*10/1000);
        context.drawTexture(TEXTURE, x + 139, y + 41, 196, 20, 10, handler.cyanLevel()*10/1000);
        context.drawTexture(TEXTURE, x + 139, y + 56, 196, 30, 10, handler.lightBlueLevel()*10/1000);
        context.drawTexture(TEXTURE, x + 154, y + 11, 206, 0, 10, handler.blueLevel()*10/1000);
        context.drawTexture(TEXTURE, x + 154, y + 26, 206, 10, 10, handler.purpleLevel()*10/1000);
        context.drawTexture(TEXTURE, x + 154, y + 41, 206, 20, 10, handler.magentaLevel()*10/1000);
        context.drawTexture(TEXTURE, x + 154, y + 56, 206, 30, 10, handler.pinkLevel()*10/1000);
    }

    @Override
    public void render(DrawContext context, int mouseX, int mouseY, float delta) {
        renderBackground(context);
        super.render(context, mouseX, mouseY, delta);
        drawMouseoverTooltip(context, mouseX, mouseY);
    }

    private void sendCraftRequest() {
        boolean sendCraft = true;
        BlockEntity blockEntity = handler.blockEntity;
        PacketByteBuf buf = PacketByteBufs.create();
        buf.writeBoolean(sendCraft);
        buf.writeBlockPos(blockEntity.getPos());
        ClientPlayNetworking.send(NetworkingConstants.SIGNING_TABLE_PACKET_ID, buf);
        BigStationSigns.LOGGER.info("packet sent!");
    }



}