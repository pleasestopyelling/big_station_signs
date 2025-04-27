package net.cutecharm.bigstationsigns;

import net.cutecharm.bigstationsigns.block.ModBlocks;
import net.cutecharm.bigstationsigns.block.entity.BigStationSignBlockEntity;
import net.cutecharm.bigstationsigns.block.entity.ModBlockEntities;
import net.cutecharm.bigstationsigns.item.ModItemGroups;
import net.cutecharm.bigstationsigns.item.ModItems;
import net.cutecharm.bigstationsigns.network.NetworkingConstants;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BigStationSigns implements ModInitializer {
	public static final String MOD_ID = "big-station-signs";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

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


	@Override
	public void onInitialize() {
		//register mod stuff
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModBlockEntities.registerBlockEntities();




		//networking
		ServerPlayNetworking.registerGlobalReceiver(NetworkingConstants.BIG_STATION_SIGN_PACKET_ID,
				(server, player, handler, buf, responseSender) -> {
			String signMessage = buf.readString();
			Boolean signMessageBold = buf.readBoolean();
			Boolean signMessageItalic = buf.readBoolean();
			Boolean signMessageUnderline = buf.readBoolean();
			int colorNumber = buf.readInt();
			BlockPos pos = buf.readBlockPos();
			server.execute(() -> {
				ServerWorld world = player.getServerWorld();
				BlockEntity blockEntity = world.getBlockEntity(pos);
				BlockState state = world.getBlockState(pos);
				if (!(blockEntity instanceof BigStationSignBlockEntity)) return;
				((BigStationSignBlockEntity) blockEntity).setSignMessage(signMessage);
				((BigStationSignBlockEntity) blockEntity).setSignBold(signMessageBold);
				((BigStationSignBlockEntity) blockEntity).setSignItalic(signMessageItalic);
				((BigStationSignBlockEntity) blockEntity).setSignUnderline(signMessageUnderline);
				((BigStationSignBlockEntity) blockEntity).setSignColor(colorNumber);
				blockEntity.markDirty();
				world.updateListeners(pos, state, state, Block.NOTIFY_ALL);
			});

		});




	}
}