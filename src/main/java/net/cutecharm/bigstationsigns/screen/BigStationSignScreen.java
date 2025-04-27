package net.cutecharm.bigstationsigns.screen;

import com.mojang.blaze3d.systems.RenderSystem;
import net.cutecharm.bigstationsigns.BigStationSigns;
import net.cutecharm.bigstationsigns.block.entity.BigStationSignBlockEntity;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.client.gui.widget.CheckboxWidget;
import net.minecraft.client.gui.widget.TextFieldWidget;
import net.minecraft.client.render.GameRenderer;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class BigStationSignScreen extends Screen {

    public enum COLOR {
        WHITE,
        LIGHT_GRAY,
        GRAY,
        BLACK,
        BROWN,
        RED,
        ORANGE,
        YELLOW,
        LIME,
        GREEN,
        CYAN,
        LIGHT_BLUE,
        BLUE,
        PURPLE,
        MAGENTA,
        PINK
    }

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

    public COLOR currentColor = COLOR.BLACK;

    private CheckboxWidget checkBold;
    private CheckboxWidget checkItalic;
    private CheckboxWidget checkUnderline;
    public Boolean signMessageBold = false;
    public Boolean signMessageItalic = false;
    public Boolean signMessageUnderline = false;
    private String signMessage = "";

    private int x;
    private int y;

    private final int referenceWidth = 176;
    private final int referenceHeight = 166;
    private final int bgWidth = 360;
    private final int bgHeight = 216;

    private static final Identifier TEXTURE = new Identifier(BigStationSigns.MOD_ID, "textures/gui/big_sign.png");

    public BigStationSignScreen(BigStationSignBlockEntity entity) {
        super(Text.translatable("screentext.screen_title"));

    }
    
    protected void init() {
        super.init();

        this.x = (this.width - this.referenceWidth)/2;
        this.y = (this.height - this.referenceHeight)/2;


        textFieldWidget = new TextFieldWidget(this.textRenderer, this.x, this.y+15, 176, 20,
                Text.empty());
        textFieldWidget.setMaxLength(32);
        buttonWhite = ButtonWidget.builder(Text.literal(""),
                button -> {
            currentColor = COLOR.WHITE;
                }).dimensions(this.x-25, this.y-10, 20, 20)
                .build();
        buttonLightGray = ButtonWidget.builder(Text.literal(""),
                button -> {
            currentColor = COLOR.LIGHT_GRAY;
                }).dimensions(this.x-25, this.y+15, 20, 20)
                .build();
        buttonGray = ButtonWidget.builder(Text.literal(""),
                button -> {
            currentColor = COLOR.GRAY;
                }).dimensions(this.x-25, this.y+40, 20, 20)
                .build();
        buttonBlack = ButtonWidget.builder(Text.literal(""),
                button -> {
            currentColor = COLOR.BLACK;
                }).dimensions(this.x-25, this.y+65, 20, 20)
                .build();
        buttonBrown = ButtonWidget.builder(Text.literal(""),
                button -> {
            currentColor = COLOR.BROWN;
                }).dimensions(this.x-25, this.y+90, 20, 20)
                .build();
        buttonRed = ButtonWidget.builder(Text.literal(""),
                button -> {
            currentColor = COLOR.RED;
                }).dimensions(this.x-25, this.y+115, 20, 20)
                .build();
        buttonOrange = ButtonWidget.builder(Text.literal(""),
                button -> {
            currentColor = COLOR.ORANGE;
                }).dimensions(this.x-25, this.y+140, 20, 20)
                .build();
        buttonYellow = ButtonWidget.builder(Text.literal(""),
                button -> {
            currentColor = COLOR.YELLOW;
                }).dimensions(this.x-25, this.y+165, 20, 20)
                .build();
        buttonLime = ButtonWidget.builder(Text.literal(""),
                button -> {
            currentColor = COLOR.LIME;
                }).dimensions(this.x+181, this.y-10, 20, 20)
                .build();
        buttonGreen = ButtonWidget.builder(Text.literal(""),
                button -> {
            currentColor = COLOR.GREEN;
                }).dimensions(this.x+181, this.y+15, 20, 20)
                .build();
        buttonCyan = ButtonWidget.builder(Text.literal(""),
                button -> {
            currentColor = COLOR.CYAN;
                }).dimensions(this.x+181, this.y+40, 20, 20)
                .build();
        buttonLightBlue = ButtonWidget.builder(Text.literal(""),
                button -> {
            currentColor = COLOR.LIGHT_BLUE;
                }).dimensions(this.x+181, this.y+65, 20, 20)
                .build();
        buttonBlue = ButtonWidget.builder(Text.literal(""),
                button -> {
            currentColor = COLOR.BLUE;
                }).dimensions(this.x+181, this.y+90, 20, 20)
                .build();
        buttonPurple = ButtonWidget.builder(Text.literal(""),
                button -> {
            currentColor = COLOR.PURPLE;
                }).dimensions(this.x+181, this.y+115, 20, 20)
                .build();
        buttonMagenta = ButtonWidget.builder(Text.literal(""),
                button -> {
            currentColor = COLOR.MAGENTA;
                }).dimensions(this.x+181, this.y+140, 20, 20)
                .build();
        buttonPink = ButtonWidget.builder(Text.literal(""),
                button -> {
            currentColor = COLOR.PINK;
                }).dimensions(this.x+181, this.y+165, 20, 20)
                .build();
        doneButton = ButtonWidget.builder(Text.translatable("screentext.done_button"),
                button -> {
            //send the data to server
                    signMessage = this.textFieldWidget.getText();
                    BigStationSigns.LOGGER.info("The sign message is " + signMessage);

                    //in the block entity, write something that gets all the data (text, color, bold italic & underline)

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






}
