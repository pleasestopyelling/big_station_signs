package net.cutecharm.bigstationsigns.screen;


import com.mojang.blaze3d.systems.RenderSystem;
import net.cutecharm.bigstationsigns.BigStationSigns;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.render.GameRenderer;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;


public class SigningTableScreen extends HandledScreen<SigningTableScreenHandler> {

    private static final Identifier TEXTURE = new Identifier(BigStationSigns.MOD_ID, "textures/gui/signing_table.png");



    public SigningTableScreen(SigningTableScreenHandler handler, PlayerInventory inventory, Text title) {
        super(handler, inventory, title);
    }

    @Override
    protected void drawBackground(DrawContext context, float delta, int mouseX, int mouseY) {
        RenderSystem.setShader(GameRenderer::getPositionTexProgram);
        RenderSystem.setShaderColor(1f,1f,1f,1f);
        RenderSystem.setShaderTexture(0,TEXTURE);
        int x = (width - backgroundWidth)/2;
        int y = (height - backgroundHeight)/2;
        context.drawTexture(TEXTURE,x,y,0,0,backgroundWidth,backgroundHeight);
    }

    @Override
    public void render(DrawContext context, int mouseX, int mouseY, float delta) {
        renderBackground(context);
        for (int dyeId = 0; dyeId < 16; dyeId++) {
            context.drawText(this.textRenderer, Integer.toString(dyeId), x, y + (5*dyeId), 0x3F3F3F, false);
        }
        super.render(context, mouseX, mouseY, delta);
        drawMouseoverTooltip(context, mouseX, mouseY);
    }



    private void renderDyeLevel(DrawContext context, int x, int y, int dyeId) {


    }

}