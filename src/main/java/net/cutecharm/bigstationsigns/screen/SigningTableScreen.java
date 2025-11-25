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
import net.minecraft.client.render.GameRenderer;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;


public class SigningTableScreen extends HandledScreen<SigningTableScreenHandler> {

    private static final Identifier TEXTURE = new Identifier(BigStationSigns.MOD_ID, "textures/gui/signing_table.png");
    private static final Identifier PRESETS = new Identifier(BigStationSigns.MOD_ID, "textures/gui/presets.png");


    public SigningTableScreen(SigningTableScreenHandler handler, PlayerInventory inventory, Text title) {
        super(handler, inventory, title);
    }


    @Override
    protected void init() {
        super.init();
        ButtonWidget doneButton;
        ButtonWidget leftButton;
        ButtonWidget rightButton;
        boolean tab = true;
        if (tab) {
            doneButton = ButtonWidget.builder(Text.translatable("screentext.paint"),
                            button -> {
                                sendRequest(NetworkingConstants.SIGNING_TABLE_PACKET_ID);
                            }).dimensions(x+10, y+50, 60, 20)
                    .build();
            addDrawableChild(doneButton);
            leftButton = ButtonWidget.builder(Text.literal("←"),
                            button -> {
                            sendRequest(NetworkingConstants.SIGNING_TABLE_L_PACKET_ID);
                            }).dimensions(x+10, y+28, 10, 10)
                    .build();
            addDrawableChild(leftButton);
            rightButton = ButtonWidget.builder(Text.literal("→"),
                            button -> {
                            sendRequest(NetworkingConstants.SIGNING_TABLE_R_PACKET_ID);
                            }).dimensions(x+60, y+28, 10, 10)
                    .build();
            addDrawableChild(rightButton);
        }
    }

    @Override
    protected void drawBackground(DrawContext context, float delta, int mouseX, int mouseY) {
        RenderSystem.setShader(GameRenderer::getPositionTexProgram);
        RenderSystem.setShaderColor(1f,1f,1f,1f);
        RenderSystem.setShaderTexture(0,TEXTURE);
        context.drawTexture(TEXTURE,x,y,0,0,backgroundWidth,backgroundHeight);
        int x = (width - backgroundWidth)/2;
        int y = (height - backgroundHeight)/2;
        //render the preset

        context.drawTexture(PRESETS, x+23, y+20, presetX(handler.preset()), presetY(handler.preset()), 34, 26);

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

    private void sendRequest(Identifier identifier) {
        BlockEntity blockEntity = handler.blockEntity;
        PacketByteBuf buf = PacketByteBufs.create();
        buf.writeBlockPos(blockEntity.getPos());
        ClientPlayNetworking.send(identifier, buf);
    }

    private int presetX(int preset) {
        if (preset > 8) {
            return 34;
        } else {
            return 0;
        }
    }
    private int presetY(int preset) {
        switch (preset) {
            case 1 -> {return 24;}
            case 2 -> {return 50;}
            case 3 -> {return 76;}
            case 4 -> {return 102;}
            case 5 -> {return 128;}
            case 6 -> {return 154;}
            case 7 -> {return 180;}
            case 8 -> {return 206;}
            case 9 -> {return 0;}
            case 10 -> {return 26;}
            case 11 -> {return 52;}
            case 12 -> {return 78;}
            case 13 -> {return 104;}
            case 14 -> {return 130;}
            case 15 -> {return 156;}
            case 16 -> {return 182;}
            case 0 -> {return 0;}
            default -> {return 0;}
        }
    }

}