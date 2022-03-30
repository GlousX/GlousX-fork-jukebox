package org.jukeboxmc.world.generator.terra.handles;

import com.dfsek.terra.api.block.state.BlockState;
import com.dfsek.terra.api.entity.EntityType;
import com.dfsek.terra.api.handle.WorldHandle;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import org.jukeboxmc.block.Block;
import org.jukeboxmc.block.BlockAir;
import org.jukeboxmc.block.BlockType;
import org.jukeboxmc.config.Config;
import org.jukeboxmc.config.ConfigType;
import org.jukeboxmc.world.generator.terra.delegate.BlockStateDelegate;
import org.jukeboxmc.world.generator.terra.delegate.TerraAdapter;

import java.util.HashMap;
import java.util.Map;

public class TerraWorldHandle implements WorldHandle {
    public static Map<State, Map<String, Object>> jeBlockMapping = new HashMap<>();

    static {
        final var jeBlockMappingConfig = new Config( TerraWorldHandle.class.getClassLoader().getResourceAsStream( "jeBlocksMapping.json" ), ConfigType.JSON );
        jeBlockMappingConfig.getMap().forEach( ( k, v ) -> jeBlockMapping.put( new State( k ), (Map<String, Object>) v ) );
    }

    public static final BlockStateDelegate AIR = new BlockStateDelegate( new BlockAir() );
    public static int err = 0;

    @Override
    public BlockState createBlockState( String s ) {
        if ( s.equals( "minecraft:water" ) )
            s = "minecraft:water[level=0]";//special case
        if ( s.equals( "minecraft:lava" ) )
            s = "minecraft:lava[level=0]";//special case
        if ( s.equals( "minecraft:deepslate" ) )
            s = "minecraft:deepslate[axis=y]";//special case
        if ( s.equals( "minecraft:grass_block" ) )
            s = "minecraft:grass_block[snowy=false]";//special case
        if ( s.equals( "minecraft:podzol" ) )
            s = "minecraft:podzol[snowy=false]";//special case
        if ( s.equals( "minecraft:mycelium" ) )
            s = "minecraft:mycelium[snowy=false]";//special case
        if ( s.equals( "minecraft:sugar_cane" ) )
            s = "minecraft:sugar_cane[age=0]";//special case
        if ( s.equals( "minecraft:oak_log" ) )
            s = "minecraft:oak_log[axis=y]";//special case
        if ( s.equals( "minecraft:brown_mushroom_block[down=false]" ) )
            s = "minecraft:brown_mushroom_block[down=false,east=true,north=true,south=true,up=true,west=true]";//special case
        if ( s.equals( "minecraft:cactus" ) )
            s = "minecraft:cactus[age=0]";//special case
        if ( s.equals( "minecraft:spruce_log" ) )
            s = "minecraft:spruce_log[axis=y]";//special case
        if ( s.equals( "minecraft:mushroom_stem" ) )
            s = "minecraft:mushroom_stem[down=true,east=true,north=true,south=true,up=true,west=true]";//special case
        if ( s.equals( "minecraft:jungle_wood" ) )
            s = "minecraft:jungle_wood[axis=y]";//special case
        if ( s.equals( "minecraft:redstone_ore" ) )
            s = "minecraft:redstone_ore[lit=false]";//special case
        if ( s.equals( "minecraft:deepslate_redstone_ore" ) )
            s = "minecraft:deepslate_redstone_ore[lit=false]";//special case
        if ( s.equals( "minecraft:basalt" ) )
            s = "minecraft:basalt[axis=y]";//special case
        State jeBlockStateData = new State( s );
        if ( jeBlockStateData.identifier.equals( "minecraft:jungle_leaves" ) )
            jeBlockStateData.attributes.putIfAbsent( "distance", "7" );//special case
        if ( jeBlockStateData.identifier.equals( "minecraft:oak_leaves" ) )
            jeBlockStateData.attributes.putIfAbsent( "distance", "7" );//special case
        if ( jeBlockStateData.identifier.equals( "minecraft:bee_nest" ) )
            jeBlockStateData.attributes.putIfAbsent( "honey_level", "0" );//special case
        if ( jeBlockStateData.identifier.equals( "minecraft:vine" ) ) {
            jeBlockStateData.attributes.putIfAbsent( "east", "false" );
            jeBlockStateData.attributes.putIfAbsent( "north", "false" );
            jeBlockStateData.attributes.putIfAbsent( "south", "false" );
            jeBlockStateData.attributes.putIfAbsent( "up", "false" );
            jeBlockStateData.attributes.putIfAbsent( "west", "false" );
        }
        Map<String, Object> mappedData = jeBlockMapping.get( jeBlockStateData );
        var toDefaultState = false;
        if ( mappedData == null ) {
            jeBlockStateData.equalsIgnoreWaterlogged = true;
            mappedData = jeBlockMapping.get( jeBlockStateData );
        }
        if ( mappedData == null ) {
            jeBlockStateData.equalsIgnoreAttributes = true;
            mappedData = jeBlockMapping.get( jeBlockStateData );
            toDefaultState = true;
        }
        if ( mappedData == null ) {
            return AIR;
        }
        boolean hasStates = false;
        Map<String, Object> states = (Map<String, Object>) mappedData.get( "bedrock_states" );
        Map<String, Object> statesConverted = new HashMap<>();
        if ( states != null && !toDefaultState ) {
            hasStates = true;
            states.forEach( ( k, v ) -> {
                if ( v instanceof Boolean ) {
                    if ( (Boolean) v ) {
                        statesConverted.put( k, (byte) 1 );
                    } else {
                        statesConverted.put( k, (byte) 0 );
                    }
                    return;
                }
                if ( v instanceof Number ) {
                    statesConverted.put( k, ( (Number) v ).intValue() );
                    return;
                }
                statesConverted.put( k, v );
            } );
        }
        var identifier = (String) mappedData.get( "bedrock_identifier" );
        if ( identifier.equals( "minecraft:concretePowder" ) )//specific case
            identifier = "minecraft:concretepowder";

        Block block = BlockType.getBlock( identifier );
        if ( hasStates ) {
            statesConverted.forEach( block::setState );
        }

        try {
            return TerraAdapter.adapt(block);
        } catch ( Exception e ) {
            err++;
            return AIR;
        }
    }

    @Override
    public BlockState air() {
        return AIR;
    }

    @Override
    public EntityType getEntity( String s ) {
        if ( s.startsWith( "minecraft:" ) ) s = s.substring( 10 );
        return Object::new;
    }

    private static class State {

        public boolean equalsIgnoreAttributes = false;
        public boolean equalsIgnoreWaterlogged = false;
        private final String identifier;
        private final Map<String, Object> attributes = new Object2ObjectArrayMap<>( 1 );

        public State( String str ) {
            var strings = str.replaceAll( "\\[", "," ).replaceAll( "]", "," ).replaceAll( " ", "" ).split( "," );
            identifier = strings[0];
            if ( strings.length > 1 ) {
                for ( int i = 1; i < strings.length; i++ ) {
                    final var tmp = strings[i];
                    final var index = tmp.indexOf( "=" );
                    attributes.put( tmp.substring( 0, index ), tmp.substring( index + 1 ) );
                }
            }
        }

        @Override
        public boolean equals( Object obj ) {
            if ( obj instanceof State state ) {
                if ( equalsIgnoreAttributes || state.equalsIgnoreAttributes ) {
                    if ( state.identifier.equals( identifier ) ) return true;
                }
                if ( equalsIgnoreWaterlogged || state.equalsIgnoreWaterlogged ) {
                    Map m1 = new Object2ObjectArrayMap( attributes );
                    Map m2 = new Object2ObjectArrayMap( state.attributes );
                    if ( m1.containsKey( "waterlogged" ) )
                        m1.remove( "waterlogged" );
                    if ( m2.containsKey( "waterlogged" ) )
                        m2.remove( "waterlogged" );
                    if ( state.identifier.equals( identifier ) && m1.equals( m2 ) ) return true;
                }
                return state.identifier.equals( identifier ) && attributes.equals( state.attributes );
            }
            return false;
        }

        @Override
        public int hashCode() {
            // TODO: 2022/2/26 确认hashcode与对应方块的联系，避免空中矿石
            return identifier.hashCode();
        }

        @Override
        public String toString() {
            StringBuilder ret = new StringBuilder( identifier ).append( ";" );
            attributes.forEach( ( k, v ) -> ret.append( k ).append( "=" ).append( v ).append( ";" ) );
            return ret.toString();
        }
    }
}