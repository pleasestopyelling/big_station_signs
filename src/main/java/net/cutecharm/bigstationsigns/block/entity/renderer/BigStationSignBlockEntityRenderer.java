package net.cutecharm.bigstationsigns.block.entity.renderer;

import net.cutecharm.bigstationsigns.BigStationSigns;
import net.cutecharm.bigstationsigns.BigStationSignsClient;
import net.cutecharm.bigstationsigns.block.entity.BigStationSignBlockEntity;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalFacingBlock;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.WorldRenderer;
import net.minecraft.client.render.block.entity.BlockEntityRenderer;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.RotationAxis;
import net.minecraft.world.World;

import static net.minecraft.state.property.Properties.*;

public class BigStationSignBlockEntityRenderer implements BlockEntityRenderer<BigStationSignBlockEntity> {

    //temporary placeholder message
    private final String testmessage = "Test Message";

    public BigStationSignBlockEntityRenderer(BlockEntityRendererFactory.Context context) {

    }

    @Override
    public void render(BigStationSignBlockEntity entity, float tickDelta, MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, int overlay) {
        matrices.push();
        Direction renderDirection = entity.getDirection();

        //rotate and position text based on direction
        //text renders 0.0005 of a block outward to avoid zfighting
        switch (renderDirection) {
            case NORTH -> {
                matrices.translate(0.5f, 1f, 0.874f);
            }
            case SOUTH -> {
                matrices.translate(0.5f, 1f, 0.126f);
                matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(180));
            }
            case EAST -> {
                matrices.translate(0.126f, 1f, 0.5f);
                matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(270));
            }
            case WEST -> {
                matrices.translate(0.874f, 1f, 0.5f);
                matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(90));
            }
            default ->
                matrices.translate(0.5f, 1f, 0.8745f);
        }

        //flip text and scale it
        matrices.multiply(RotationAxis.POSITIVE_Z.rotationDegrees(180));
        matrices.scale(1/18f, 1/18f, 1/18f);

        //set bold italic and underline
        boolean renderBold = entity.signBold;
        boolean renderItalic = entity.signItalic;
        boolean renderUnderline = entity.signUnderline;

        //get the message to display
        Text text = Text.literal(entity.signMessage)
                .setStyle(
                        Style.EMPTY
                                .withBold(renderBold)
                                .withItalic(renderItalic)
                                .withUnderline(renderUnderline));
        //pull up the text renderer
        TextRenderer textRenderer = MinecraftClient.getInstance().textRenderer;
        //get the width of the message to center it
        float width = textRenderer.getWidth(text);
        //get the lighting of the text
        int lightAbove = WorldRenderer.getLightmapCoordinates(entity.getWorld(), entity.getPos().up());
        //get the color of the text
        int renderColor = outputRenderColor(entity.signColor);
        textRenderer.draw(
                text,
                -width/2,
                4f,
                renderColor,
                false,
                matrices.peek().getPositionMatrix(),
                vertexConsumers,
                TextRenderer.TextLayerType.NORMAL,
                0,
                lightAbove
        );
        matrices.pop();
    }

    private int outputRenderColor(BigStationSigns.COLOR color) {
        int outputColor = 0;
        switch (color) {
            case WHITE -> outputColor = 0xFFFFFF;
            case LIGHT_GRAY -> outputColor = 0xAAAAAA;
            case GRAY -> outputColor = 0x555555;
            case BLACK -> outputColor = 0x000000;
            case BROWN -> outputColor = 0xAA0000;
            case RED -> outputColor = 0xFF5555;
            case ORANGE -> outputColor = 0xFFAA00;
            case YELLOW -> outputColor = 0XFFFF55;
            case LIME -> outputColor = 0x55FF55;
            case GREEN -> outputColor = 0x00AA00;
            case CYAN -> outputColor = 0x00AAAA;
            case LIGHT_BLUE -> outputColor = 0x55FFFF;
            case BLUE -> outputColor = 0x0000AA;
            case PURPLE -> outputColor = 0xAA00AA;
            case MAGENTA -> outputColor = 0xFF55FF;
            case PINK -> outputColor = 0xFFBBFF;

        }
        return outputColor;
    }
}
