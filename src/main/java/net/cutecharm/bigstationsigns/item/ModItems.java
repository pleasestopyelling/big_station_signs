package net.cutecharm.bigstationsigns.item;

import net.cutecharm.bigstationsigns.BigStationSigns;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    //List of all the items to be registered
    private static Item registerItem(String name, Item item) {

        return Registry.register(Registries.ITEM, new Identifier(BigStationSigns.MOD_ID, name), item);
    }

    public static void registerModItems() {
        BigStationSigns.LOGGER.info("Registering Mod Items for " + BigStationSigns.MOD_ID);


    }
}
