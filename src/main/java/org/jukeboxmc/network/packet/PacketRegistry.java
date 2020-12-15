package org.jukeboxmc.network.packet;

import org.jukeboxmc.network.Protocol;
import org.jukeboxmc.network.handler.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @author LucGamesYT
 * @version 1.0
 */
public class PacketRegistry {

    private static Map<Class, PacketHandler> handler = new HashMap<>();

    static {
        handler.put( LoginPacket.class, new LoginHandler() );
        handler.put( ResourcePackResponsePacket.class, new ResourcePackResponseHandler() );
        handler.put( RequestChunkRadiusPacket.class, new RequestChunkRadiusHandler() );
    }

    public static PacketHandler getHandler( Class<? extends Packet> clazz ) {
        return PacketRegistry.handler.get( clazz );
    }

    public static Packet getPacket( int packetId ) {
        switch ( packetId ) {
            case Protocol.LOGIN_PACKET:
                return new LoginPacket();
            case Protocol.PLAY_STATUS_PACKET:
                return new PlayStatusPacket();
            case Protocol.RESOURCE_PACKS_INFO_PACKET:
                return new ResourcePacksInfoPacket();
            case Protocol.RESOURCE_PACK_RESPONSE_PACKET:
                return new ResourcePackResponsePacket();
            case Protocol.START_GAME_PACKET:
                return new StartGamePacket();
            case Protocol.BIOME_DEFINITION_LIST_PACKET:
                return new BiomeDefinitionListPacket();
            case Protocol.CREATIVE_CONTENT_PACKET:
                return new CreativeContentPacket();
            case Protocol.REQUEST_CHUNK_RADIUS_PACKET:
                return new RequestChunkRadiusPacket();
            case Protocol.CHUNK_RADIUS_UPDATE_PACKET:
                return new ChunkRadiusUpdatedPacket();
            case Protocol.NETWORK_CHUNK_PUBLISHER_UPDATE_PACKET:
                return new NetworkChunkPublisherUpdatePacket();
            case Protocol.DISCONNECT_PACKET:
                return new DisconnectPacket();
            default:
                return null;
        }
    }

}