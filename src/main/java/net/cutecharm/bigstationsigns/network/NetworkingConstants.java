package net.cutecharm.bigstationsigns.network;

import net.cutecharm.bigstationsigns.BigStationSigns;
import net.minecraft.util.Identifier;

public class NetworkingConstants {
    public static final Identifier BIG_STATION_SIGN_PACKET_ID = new Identifier(BigStationSigns.MOD_ID, "big_station_sign_packet");
    public static final Identifier SIGNING_TABLE_PACKET_ID = new Identifier(BigStationSigns.MOD_ID, "signing_table_packet");
    public static final Identifier SIGNING_TABLE_R_PACKET_ID = new Identifier(BigStationSigns.MOD_ID, "signing_table_r_packet");
    public static final Identifier SIGNING_TABLE_L_PACKET_ID = new Identifier(BigStationSigns.MOD_ID, "signing_table_l_packet");
}
