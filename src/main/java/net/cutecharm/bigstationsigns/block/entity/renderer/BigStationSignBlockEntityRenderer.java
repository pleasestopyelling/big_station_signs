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
        //put the text in place
        matrices.translate(0.5f, 1f, 0.937f);
        matrices.multiply(RotationAxis.POSITIVE_Z.rotationDegrees(180));
        Direction renderDirection = entity.getDirection();
        if (renderDirection == Direction.EAST) {
            matrices.translate(0.437f, 0f, -0.437f);
            matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(90));
        } else if (renderDirection == Direction.WEST) {
            matrices.translate(-0.437f, 0f, -0.437f);
            matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(270));
        } else if (renderDirection == Direction.SOUTH) {
            matrices.translate(0f, 0f, -0.874f);
            matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(180));
        }
        matrices.scale(1/18f, 1/18f, 1/18f);

        //switch (renderDirection) {
        //    case EAST -> {
        //        matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(90));
        //    }
        //    case SOUTH -> {
        //        matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(180));
        //    }
        //    case WEST -> {
        //       matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(270));
        //    }
        //    default -> {
        //        matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(0));
        //    }
        //}

        //get the message to display
        String text = testmessage;
        //pull up the text renderer
        TextRenderer textRenderer = MinecraftClient.getInstance().textRenderer;
        //get the width of the message to center it
        float width = textRenderer.getWidth(text);
        //get the lighting of the text
        int lightAbove = WorldRenderer.getLightmapCoordinates(entity.getWorld(), entity.getPos().up());
        //get the rotation state of the text (to do)
        textRenderer.draw(
                text,
                -width/2,
                4f,
                0xffffff,
                false,
                matrices.peek().getPositionMatrix(),
                vertexConsumers,
                TextRenderer.TextLayerType.NORMAL,
                0,
                lightAbove
        );
        matrices.pop();
    }
}
