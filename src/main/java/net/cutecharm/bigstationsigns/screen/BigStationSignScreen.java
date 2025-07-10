package net.cutecharm.bigstationsigns.screen;

import com.mojang.blaze3d.systems.RenderSystem;
import net.cutecharm.bigstationsigns.BigStationSigns;
import net.cutecharm.bigstationsigns.block.entity.BigStationSignBlockEntity;
import net.cutecharm.bigstationsigns.network.NetworkingConstants;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.fabricmc.fabric.api.networking.v1.PacketByteBufs;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.client.gui.widget.CheckboxWidget;
import net.minecraft.client.gui.widget.TextFieldWidget;
import net.minecraft.client.render.GameRenderer;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class BigStationSignScreen extends Screen {

    private final BigStationSignBlockEntity blockEntity;

    private TextFieldWidget textFieldWidget;
    private ButtonWidget buttonWhite;
    private ButtonWidget buttonLightGray;
    private ButtonWidget buttonGray;
    private ButtonWidget buttonBlack;
    private ButtonWidget buttonBrown;
    private ButtonWidget buttonRed;
    private ButtonWidget buttonOrange;
    private ButtonWidget buttonYellow;
    private ButtonWidget buttonLime;
    private ButtonWidget buttonGreen;
    private ButtonWidget buttonCyan;
    private ButtonWidget buttonLightBlue;
    private ButtonWidget buttonBlue;
    private ButtonWidget buttonPurple;
    private ButtonWidget buttonMagenta;
    private ButtonWidget buttonPink;
    private ButtonWidget doneButton;

    private BigStationSigns.COLOR currentColor = BigStationSigns.COLOR.BLACK;

    private CheckboxWidget checkBold;
    private CheckboxWidget checkItalic;
    private CheckboxWidget checkUnderline;
    private Boolean signMessageBold = false;
    private Boolean signMessageItalic = false;
    private Boolean signMessageUnderline = false;
    private String signMessage = "";
    private int signWidth = 1;

    private int x;
    private int y;

    private final int referenceWidth = 176;
    private final int referenceHeight = 166;
    private final int bgWidth = 360;
    private final int bgHeight = 216;

    private static final Identifier TEXTURE = new Identifier(BigStationSigns.MOD_ID, "textures/gui/big_sign.png");

    public BigStationSignScreen(BigStationSignBlockEntity entity) {
        super(Text.translatable("screentext.screen_title"));
        blockEntity = entity;
    }
    
    protected void init() {
        super.init();

        signMessage = blockEntity.signMessage;
        currentColor = blockEntity.signColor;
        signMessageBold = blockEntity.signBold;
        signMessageItalic = blockEntity.signItalic;
        signMessageUnderline = blockEntity.signUnderline;
        signWidth = blockEntity.signWidth;

        this.x = (this.width - this.referenceWidth)/2;
        this.y = (this.height - this.referenceHeight)/2;


        textFieldWidget = new TextFieldWidget(this.textRenderer, this.x, this.y+15, 176, 20,
                Text.literal(signMessage));
        textFieldWidget.setText(signMessage);
        textFieldWidget.setMaxLength(signWidth*3);

        buttonWhite = ButtonWidget.builder(Text.literal(""),
                button -> {
            currentColor = BigStationSigns.COLOR.WHITE;
                }).dimensions(this.x-25, this.y-10, 20, 20)
                .build();
        buttonLightGray = ButtonWidget.builder(Text.literal(""),
                button -> {
            currentColor = BigStationSigns.COLOR.LIGHT_GRAY;
                }).dimensions(this.x-25, this.y+15, 20, 20)
                .build();
        buttonGray = ButtonWidget.builder(Text.literal(""),
                button -> {
            currentColor = BigStationSigns.COLOR.GRAY;
                }).dimensions(this.x-25, this.y+40, 20, 20)
                .build();
        buttonBlack = ButtonWidget.builder(Text.literal(""),
                button -> {
            currentColor = BigStationSigns.COLOR.BLACK;
                }).dimensions(this.x-25, this.y+65, 20, 20)
                .build();
        buttonBrown = ButtonWidget.builder(Text.literal(""),
                button -> {
            currentColor = BigStationSigns.COLOR.BROWN;
                }).dimensions(this.x-25, this.y+90, 20, 20)
                .build();
        buttonRed = ButtonWidget.builder(Text.literal(""),
                button -> {
            currentColor = BigStationSigns.COLOR.RED;
                }).dimensions(this.x-25, this.y+115, 20, 20)
                .build();
        buttonOrange = ButtonWidget.builder(Text.literal(""),
                button -> {
            currentColor = BigStationSigns.COLOR.ORANGE;
                }).dimensions(this.x-25, this.y+140, 20, 20)
                .build();
        buttonYellow = ButtonWidget.builder(Text.literal(""),
                button -> {
            currentColor = BigStationSigns.COLOR.YELLOW;
                }).dimensions(this.x-25, this.y+165, 20, 20)
                .build();
        buttonLime = ButtonWidget.builder(Text.literal(""),
                button -> {
            currentColor = BigStationSigns.COLOR.LIME;
                }).dimensions(this.x+181, this.y-10, 20, 20)
                .build();
        buttonGreen = ButtonWidget.builder(Text.literal(""),
                button -> {
            currentColor = BigStationSigns.COLOR.GREEN;
                }).dimensions(this.x+181, this.y+15, 20, 20)
                .build();
        buttonCyan = ButtonWidget.builder(Text.literal(""),
                button -> {
            currentColor = BigStationSigns.COLOR.CYAN;
                }).dimensions(this.x+181, this.y+40, 20, 20)
                .build();
        buttonLightBlue = ButtonWidget.builder(Text.literal(""),
                button -> {
            currentColor = BigStationSigns.COLOR.LIGHT_BLUE;
                }).dimensions(this.x+181, this.y+65, 20, 20)
                .build();
        buttonBlue = ButtonWidget.builder(Text.literal(""),
                button -> {
            currentColor = BigStationSigns.COLOR.BLUE;
                }).dimensions(this.x+181, this.y+90, 20, 20)
                .build();
        buttonPurple = ButtonWidget.builder(Text.literal(""),
                button -> {
            currentColor = BigStationSigns.COLOR.PURPLE;
                }).dimensions(this.x+181, this.y+115, 20, 20)
                .build();
        buttonMagenta = ButtonWidget.builder(Text.literal(""),
                button -> {
            currentColor = BigStationSigns.COLOR.MAGENTA;
                }).dimensions(this.x+181, this.y+140, 20, 20)
                .build();
        buttonPink = ButtonWidget.builder(Text.literal(""),
                button -> {
            currentColor = BigStationSigns.COLOR.PINK;
                }).dimensions(this.x+181, this.y+165, 20, 20)
                .build();
        doneButton = ButtonWidget.builder(Text.translatable("screentext.done_button"),
                button -> {
            //send the data to server
                    signMessage = this.textFieldWidget.getText();
                    signMessageBold = checkBold.isChecked();
                    signMessageItalic = checkItalic.isChecked();
                    signMessageUnderline = checkUnderline.isChecked();

                    //in the block entity, write something that gets all the data (text, color, bold italic & underline)
                    sendSignData();
                    this.close();
                }).dimensions(this.x, this.y+165, 176, 20).build();

        checkBold = new CheckboxWidget(this.x, this.y + 65, 20, 20, Text.literal(""), signMessageBold);
        checkItalic = new CheckboxWidget(this.x, this.y + 90, 20, 20, Text.literal(""), signMessageItalic);
        checkUnderline = new CheckboxWidget(this.x, this.y + 115, 20, 20, Text.literal(""), signMessageUnderline);

        addDrawableChild(textFieldWidget);
        addDrawableChild(buttonWhite);
        addDrawableChild(buttonLightGray);
        addDrawableChild(buttonGray);
        addDrawableChild(buttonBlack);
        addDrawableChild(buttonBrown);
        addDrawableChild(buttonRed);
        addDrawableChild(buttonOrange);
        addDrawableChild(buttonYellow);
        addDrawableChild(buttonLime);
        addDrawableChild(buttonGreen);
        addDrawableChild(buttonCyan);
        addDrawableChild(buttonLightBlue);
        addDrawableChild(buttonBlue);
        addDrawableChild(buttonPurple);
        addDrawableChild(buttonMagenta);
        addDrawableChild(buttonPink);
        addDrawableChild(checkBold);
        addDrawableChild(checkItalic);
        addDrawableChild(checkUnderline);
        addDrawableChild(doneButton);
    }

    @Override
    public void render(DrawContext context, int mouseX, int mouseY, float delta) {

        RenderSystem.setShader(GameRenderer::getPositionTexProgram);
        RenderSystem.setShaderColor(1.0f, 1.0f, 1.0f, 1.0f);
        RenderSystem.setShaderTexture(0, TEXTURE);
        int x1 = (width - bgWidth)/2;
        int y1 = (height - bgHeight)/2;
        //theres probably a better way to do this lmao
        context.drawTexture(TEXTURE, x1, y1, 0, 0, bgWidth, bgHeight, bgWidth, bgHeight);

        super.render(context, mouseX, mouseY, delta);
        String displayColor = currentColor.name();
        Text displayText = Text.translatable("screentext.current_color");
        context.drawText(this.textRenderer, displayText, this.x, this.y + 45, 0x3F3F3F, false);
        context.drawText(this.textRenderer, displayColor, this.x+76, this.y + 45, 0x3F3F3F, false);
        context.drawText(this.textRenderer, Text.translatable("screentext.check_bold").setStyle(Style.EMPTY.withBold(true)), this.x+25, this.y+70, 0x3F3F3F, false);
        context.drawText(this.textRenderer, Text.translatable("screentext.check_italic").setStyle(Style.EMPTY.withItalic(true)), this.x+25, this.y+95, 0x3F3F3F, false);
        context.drawText(this.textRenderer, Text.translatable("screentext.check_underline").setStyle(Style.EMPTY.withUnderline(true)), this.x+25, this.y+120, 0x3F3F3F, false);
        context.drawText(this.textRenderer, Text.translatable("screentext.screen_title"), this.x+15, this.y-15, 0x3F3F3F, false);
        context.drawText(this.textRenderer, Text.translatable("screentext.button_white"), this.x-53, this.y-5, 0x3F3F3F, false);
        context.drawText(this.textRenderer, Text.translatable("screentext.button_light_gray"), this.x-82, this.y+20, 0x3F3F3F, false);
        context.drawText(this.textRenderer, Text.translatable("screentext.button_gray"), this.x-53, this.y+45, 0x3F3F3F, false);
        context.drawText(this.textRenderer, Text.translatable("screentext.button_black"), this.x-55, this.y+70, 0x3F3F3F, false);
        context.drawText(this.textRenderer, Text.translatable("screentext.button_brown"), this.x-59, this.y+95, 0x3F3F3F, false);
        context.drawText(this.textRenderer, Text.translatable("screentext.button_red"), this.x-47, this.y+120, 0x3F3F3F, false);
        context.drawText(this.textRenderer, Text.translatable("screentext.button_orange"), this.x-69, this.y+145, 0x3F3F3F, false);
        context.drawText(this.textRenderer, Text.translatable("screentext.button_yellow"), this.x-62, this.y+170, 0x3F3F3F, false);
        context.drawText(this.textRenderer, Text.translatable("screentext.button_lime"), this.x+206, this.y-5, 0x3F3F3F, false);
        context.drawText(this.textRenderer, Text.translatable("screentext.button_green"), this.x+206, this.y+20, 0x3F3F3F, false);
        context.drawText(this.textRenderer, Text.translatable("screentext.button_cyan"), this.x+206, this.y+45, 0x3F3F3F, false);
        context.drawText(this.textRenderer, Text.translatable("screentext.button_light_blue"), this.x+206, this.y+70, 0x3F3F3F, false);
        context.drawText(this.textRenderer, Text.translatable("screentext.button_blue"), this.x+206, this.y+95, 0x3F3F3F, false);
        context.drawText(this.textRenderer, Text.translatable("screentext.button_purple"), this.x+206, this.y+120, 0x3F3F3F, false);
        context.drawText(this.textRenderer, Text.translatable("screentext.button_magenta"), this.x+206, this.y+145, 0x3F3F3F, false);
        context.drawText(this.textRenderer, Text.translatable("screentext.button_pink"), this.x+206, this.y+170, 0x3F3F3F, false);

    }

    public static void openEditScreen(BigStationSignBlockEntity entity) {
        ScreenSetter.openScreen(new BigStationSignScreen(entity));
    }

    private void sendSignData() {
        PacketByteBuf buf = PacketByteBufs.create();
        int colorToInteger = 3;
        switch (currentColor) {
            case WHITE -> colorToInteger = 0;
            case LIGHT_GRAY -> colorToInteger = 1;
            case GRAY -> colorToInteger = 2;
            case BLACK -> colorToInteger = 3;
            case BROWN -> colorToInteger = 4;
            case RED -> colorToInteger = 5;
            case ORANGE -> colorToInteger = 6;
            case YELLOW -> colorToInteger = 7;
            case LIME -> colorToInteger = 8;
            case GREEN -> colorToInteger = 9;
            case CYAN -> colorToInteger = 10;
            case LIGHT_BLUE -> colorToInteger = 11;
            case BLUE -> colorToInteger = 12;
            case PURPLE -> colorToInteger = 13;
            case MAGENTA -> colorToInteger = 14;
            case PINK -> colorToInteger = 15;
        }
        buf.writeString(signMessage);
        buf.writeBoolean(signMessageBold);
        buf.writeBoolean(signMessageItalic);
        buf.writeBoolean(signMessageUnderline);
        buf.writeInt(colorToInteger);
        buf.writeBlockPos(this.blockEntity.getPos());
        ClientPlayNetworking.send(NetworkingConstants.BIG_STATION_SIGN_PACKET_ID, buf);
    }








}
