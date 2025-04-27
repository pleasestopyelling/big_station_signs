package net.cutecharm.bigstationsigns.screen;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.Screen;

public class ScreenSetter {
    public static void openScreen(Screen screen) {
        MinecraftClient client = MinecraftClient.getInstance();
        client.execute(() -> client.setScreen(screen));

    }
}
