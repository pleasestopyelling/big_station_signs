package net.cutecharm.bigstationsigns.screen;

import net.cutecharm.bigstationsigns.BigStationSigns;
import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;

public class ModScreenHandlers {
    public static final ScreenHandlerType<SigningTableScreenHandler> SIGNING_TABLE_SCREEN_HANDLER =
            Registry.register(Registries.SCREEN_HANDLER, new Identifier(BigStationSigns.MOD_ID, "signing_table"),
                    new ExtendedScreenHandlerType<>(SigningTableScreenHandler::new));

    public static void registerScreenHandlers() {
        BigStationSigns.LOGGER.info("Registering screen handlers for " + BigStationSigns.MOD_ID);

    }
}
