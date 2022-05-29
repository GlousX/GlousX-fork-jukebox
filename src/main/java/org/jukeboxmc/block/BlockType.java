package org.jukeboxmc.block;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import org.jukeboxmc.Server;
import org.jukeboxmc.block.type.LeafType;
import org.jukeboxmc.block.type.LeafType2;
import org.jukeboxmc.block.type.LogType;
import org.jukeboxmc.block.type.LogType2;
import org.jukeboxmc.item.Item;

/**
 * @author LucGamesYT
 * @version 1.0
 */
public enum BlockType {

    AIR( new BlockAir() ),
    GRASS( new BlockGrass() ),
    DIRT( new BlockDirt() ),
    BEDROCK( new BlockBedrock() ),
    DOUBLE_PLANT( new BlockDoublePlant() ),
    STONE( new BlockStone() ),
    COBBLESTONE( new BlockCobblestone() ),
    PLANKS( new BlockPlanks() ),
    SAPLING( new BlockSapling() ),
    FLOWING_WATER( new BlockFlowingWater() ),
    WATER( new BlockWater() ),
    FLOWING_LAVA( new BlockFlowingLava() ),
    LAVA( new BlockLava() ),
    SAND( new BlockSand() ),
    GRAVEL( new BlockGravel() ),
    GOLD_ORE( new BlockGoldOre() ),
    IRON_ORE( new BlockIronOre() ),
    COAL_ORE( new BlockCoalOre() ),

    OAK_LOG( new BlockLog().setLogType( LogType.OAK ) ),
    SPRUCE_LOG( new BlockLog().setLogType( LogType.SPRUCE ) ),
    BIRCH_LOG( new BlockLog().setLogType( LogType.BIRCH ) ),
    JUNGLE_LOG( new BlockLog().setLogType( LogType.JUNGLE ) ),
    ACACIA_LOG( new BlockLog2().setLogType( LogType2.ACACIA ) ),
    DARK_OAK_LOG( new BlockLog2().setLogType( LogType2.DARK_OAK ) ),

    OAK_LEAVES( new BlockLeaves().setLeafType( LeafType.OAK ) ),
    SPRUCE_LEAVES( new BlockLeaves().setLeafType( LeafType.SPRUCE ) ),
    BIRCH_LEAVES( new BlockLeaves().setLeafType( LeafType.BIRCH ) ),
    JUNGLE_LEAVES( new BlockLeaves().setLeafType( LeafType.JUNGLE ) ),
    ACACIA_LEAVES( new BlockLeaves2().setLeafType( LeafType2.ACACIA ) ),
    DARK_OAK_LEAVES( new BlockLeaves2().setLeafType( LeafType2.DARK_OAK ) ),

    SPONGE( new BlockSponge() ),
    GLASS( new BlockGlass() ),
    LAPIS_ORE( new BlockLapisOre() ),
    LAPIS_BLOCK( new BlockLapisBlock() ),
    DISPENSER( new BlockDispenser() ),
    SANDSTONE( new BlockSandstone() ),
    NOTEBLOCK( new BlockNoteblock() ),
    BED( new BlockBed() ),
    GOLDEN_RAIL( new BlockGoldenRail() ),
    DETECTOR_RAIL( new BlockDetectorRail() ),
    STICKY_PISTON( new BlockStickyPiston() ),
    WEB( new BlockWeb() ),
    TALLGRASS( new BlockTallGrass() ),
    DEADBUSH( new BlockDeadbush() ),
    PISTON( new BlockPiston() ),
    PISTONARMCOLLISION( new BlockPistonarmcollision() ),
    WOOL( new BlockWool() ),
    ELEMENT_0( new BlockElement0() ),
    YELLOW_FLOWER( new BlockYellowFlower() ),

    RED_FLOWER( new BlockRedFlower() ),
    BROWN_MUSHROOM( new BlockBrownMushroom() ),
    RED_MUSHROOM( new BlockRedMushroom() ),
    GOLD_BLOCK( new BlockGoldBlock() ),
    IRON_BLOCK( new BlockIronBlock() ),
    BRICK_BLOCK( new BlockBrick() ),
    TNT( new BlockTnt() ),
    BOOKSHELF( new BlockBookshelf() ),
    MOSSY_COBBLESTONE( new BlockMossyCobblestone() ),
    OBSIDIAN( new BlockObsidian() ),
    TORCH( new BlockTorch() ),
    FIRE( new BlockFire() ),
    MOB_SPAWNER( new BlockMobSpawner() ),
    OAK_STAIRS( new BlockOakStairs() ),
    CHEST( new BlockChest() ),
    REDSTONE_WIRE( new BlockRedstoneWire() ),
    DIAMOND_ORE( new BlockDiamondOre() ),
    DIAMOND_BLOCK( new BlockDiamondBlock() ),
    CRAFTING_TABLE( new BlockCraftingTable() ),
    WHEAT( new BlockWheat() ),
    FARMLAND( new BlockFarmland() ),
    FURNACE( new BlockFurnace() ),
    GLOWING_FURNACE( new BlockGlowingFurnace() ),
    STANDING_SIGN( new BlockStandingSign() ),
    OAK_DOOR( new BlockOakDoor() ),
    LADDER( new BlockLadder() ),
    RAIL( new BlockRail() ),
    STONE_STAIRS( new BlockCobblestoneStairs() ),
    WALL_SIGN( new BlockOakWallSign() ),
    LEVER( new BlockLever() ),
    STONE_PRESSURE_PLATE( new BlockStonePressurePlate() ),
    IRON_DOOR( new BlockIronDoor() ),
    WOODEN_PRESSURE_PLATE( new BlockWoodenPressurePlate() ),
    REDSTONE_ORE( new BlockRedstoneOre() ),
    GLOWING_REDSTONE_ORE( new BlockGlowingRedstoneOre() ),
    UNLIT_REDSTONE_TORCH( new BlockUnlitRedstoneTorch() ),
    REDSTONE_TORCH( new BlockRedstoneTorch() ),
    STONE_BUTTON( new BlockStoneButton() ),
    SNOW_LAYER( new BlockSnowLayer() ),
    ICE( new BlockIce() ),
    SNOW( new BlockSnow() ),
    CACTUS( new BlockCactus() ),
    CLAY( new BlockClay() ),
    SUGARCANE( new BlockSugarCane() ),
    JUKEBOX( new BlockJukebox() ),
    FENCE( new BlockFence() ),
    PUMPKIN( new BlockPumpkin() ),
    NETHERRACK( new BlockNetherrack() ),
    SOUL_SAND( new BlockSoulSand() ),
    GLOWSTONE( new BlockGlowstone() ),
    PORTAL( new BlockPortal() ),
    JACK_O_LANTERN( new BlockJackOLantern() ),
    CAKE( new BlockCake() ),
    UNPOWERED_REPEATER( new BlockRepeater() ),
    POWERED_REPEATER( new BlockPoweredRepeater() ),
    INVISIBLE_BEDROCK( new BlockInvisiblebedrock() ),
    WOODEN_TRAPDOOR( new BlockWoodenTrapdoor() ),
    INFESTED_STONE( new BlockInfestedStone() ),
    STONEBRICK( new BlockStonebrick() ),
    BROWN_MUSHROOM_BLOCK( new BlockBrownMushroomBlock() ),
    RED_MUSHROOM_BLOCK( new BlockRedMushroomBlock() ),
    IRON_BARS( new BlockIronBars() ),
    GLASS_PANE( new BlockGlassPane() ),
    MELON_BLOCK( new BlockMelonBlock() ),
    PUMPKIN_STEM( new BlockPumpkinStem() ),
    MELON_STEM( new BlockMelonStem() ),
    VINE( new BlockVine() ),
    TRIPWIRE( new BlockTripwire() ),
    FENCE_GATE( new BlockOakFenceGate() ),
    BRICK_STAIRS( new BlockBrickStairs() ),
    STONE_BRICK_STAIRS( new BlockStoneBrickStairs() ),
    MYCELIUM( new BlockMycelium() ),
    WATERLILY( new BlockWaterlily() ),
    NETHER_BRICK_BLOCK( new BlockNetherBrickBlock() ),
    NETHER_BRICK_FENCE( new BlockNetherBrickFence() ),
    NETHER_BRICK_STAIRS( new BlockNetherBrickStairs() ),
    NETHER_WART( new BlockNetherWart() ),
    ENCHANTING_TABLE( new BlockEnchantingTable() ),
    BREWING_STAND( new BlockBrewingStand() ),
    CAULDRON( new BlockCauldron() ),
    END_PORTAL( new BlockEndPortal() ),
    END_PORTAL_FRAME( new BlockEndPortalFrame() ),
    END_STONE( new BlockEndStone() ),
    DRAGON_EGG( new BlockDragonEgg() ),
    REDSTONE_LAMP( new BlockRedstoneLamp() ),
    GLOWNG_REDSTONE_LAMP( new BlockGlowningRedstoneLamp() ),
    DROPPER( new BlockDropper() ),
    ACTIVATOR_RAIL( new BlockActivatorRail() ),
    COCOA( new BlockCocoa() ),
    SANDSTONE_STAIRS( new BlockSandstoneStairs() ),
    EMERALD_ORE( new BlockEmeraldOre() ),
    ENDER_CHEST( new BlockEnderChest() ),
    TRIPWIRE_HOOK( new BlockTripwireHook() ),
    EMERALD_BLOCK( new BlockEmeraldBlock() ),
    SPRUCE_STAIRS( new BlockSpruceStairs() ),
    BIRCH_STAIRS( new BlockBirchStairs() ),
    JUNGLE_STAIRS( new BlockJungleStairs() ),
    COMMAND_BLOCK( new BlockCommandBlock() ),
    BEACON( new BlockBeacon() ),
    COBBLESTONE_WALL( new BlockCobblestoneWall() ),
    FLOWER_POT( new BlockFlowerPot() ),
    CARROTS( new BlockCarrots() ),
    POTATOES( new BlockPotatoes() ),
    WOODEN_BUTTON( new BlockWoodenButton() ),
    SKULL( new BlockSkull() ),
    ANVIL( new BlockAnvil() ),
    TRAPPED_CHEST( new BlockTrappedChest() ),
    LIGHT_WEIGHTED_PRESSURE_PLATE( new BlockLightWeightedPressurePlate() ),
    HEAVY_WEIGHTED_PRESSURE_PLATE( new BlockHeavyWeightedPressurePlate() ),
    UNPOWERED_COMPARATOR( new BlockCompartor() ),
    POWERED_COMPARATOR( new BlockPoweredComparator() ),
    DAYLIGHT_DETECTOR( new BlockDaylightDetector() ),
    REDSTONE_BLOCK( new BlockRedstoneBlock() ),
    QUARTZ_ORE( new BlockQuartzOre() ),
    HOPPER( new BlockHopper() ),
    QUARTZ_BLOCK( new BlockQuartzBlock() ),
    QUARTZ_STAIRS( new BlockQuartzStairs() ),
    WOODEN_SLAB( new BlockWoodenSlab() ),
    STAINED_HARDENED_CLAY( new BlockStainedHardenedClay() ),
    STAINED_GLASS_PANE( new BlockStainedGlassPane() ),
    ACACIA_STAIRS( new BlockAcaciaStairs() ),
    DARK_OAK_STAIRS( new BlockDarkOakStairs() ),
    SLIME( new BlockSlime() ),
    IRON_TRAPDOOR( new BlockIronTrapdoor() ),
    PRISMARINE( new BlockPrismarine() ),
    SEALANTERN( new BlockSeaLantern() ),
    HAY_BLOCK( new BlockHayBlock() ),
    CARPET( new BlockCarpet() ),
    HARDENED_CLAY( new BlockHardenedClay() ),
    COAL_BLOCK( new BlockCoal() ),
    PACKED_ICE( new BlockPackedIce() ),
    STANDING_BANNER( new BlockStandingBanner() ),
    WALL_BANNER( new BlockWallBanner() ),
    DAYLIGHT_DETECTOR_INVERTED( new BlockDaylightDetectorInverted() ),
    RED_SANDSTONE( new BlockRedSandstone() ),
    RED_SANDSTONE_STAIRS( new BlockRedSandstoneStairs() ),
    SPRUCE_FENCE_GATE( new BlockSpruceFenceGate() ),
    BIRCH_FENCE_GATE( new BlockBirchFenceGate() ),
    JUNGLE_FENCE_GATE( new BlockJungleFenceGate() ),
    DARK_OAK_FENCE_GATE( new BlockDarkOakFenceGate() ),
    ACACIA_FENCE_GATE( new BlockAcaciaFenceGate() ),
    REPEATING_COMMAND_BLOCK( new BlockRepeatingCommandBlock() ),
    CHAIN_COMMAND_BLOCK( new BlockChainCommandBlock() ),
    HARD_GLASS_PANE( new BlockHardGlassPane() ),
    HARD_STAINED_GLASS_PANE( new BlockHardStainedGlassPane() ),
    CHEMICAL_HEAT( new BlockChemicalHeat() ),
    SPRUCE_DOOR( new BlockSpruceDoor() ),
    BIRCH_DOOR( new BlockBirchDoor() ),
    JUNGLE_DOOR( new BlockJungleDoor() ),
    ACACIA_DOOR( new BlockAcaciaDoor() ),
    DARK_OAK_DOOR( new BlockDarkOakDoor() ),
    GRASS_PATH( new BlockGrassPath() ),
    FRAME( new BlockFrame() ),
    CHORUS_FLOWER( new BlockChorusFlower() ),
    PURPUR_BLOCK( new BlockPurpurBlock() ),
    COLORED_TORCH_RG( new BlockColoredTorchRG() ),
    PURPUR_STAIRS( new BlockPurpurStairs() ),
    COLORED_TORCH_BP( new BlockColoredTorchBP() ),
    UNDYED_SHULKER_BOX( new BlockUndyedShulkerBox() ),
    END_BRICKS( new BlockEndBricks() ),
    FROSTED_ICE( new BlockFrostedIce() ),
    END_ROD( new BlockEndRod() ),
    END_GATEWAY( new BlockEndGateway() ),
    ALLOW( new BlockAllow() ),
    DENY( new BlockDeny() ),
    BORDER_BLOCK( new BlockBorderBlock() ),
    MAGMA( new BlockMagma() ),
    NETHER_WART_BLOCK( new BlockNetherWartBlock() ),
    RED_NETHER_BRICK( new BlockRedNetherBrick() ),
    BONE_BLOCK( new BlockBoneBlock() ),
    STRUCTURE_VOID( new BlockStructureVoid() ),
    SHULKER_BOX( new BlockShulkerBox() ),
    PURPLE_GLAZED_TERRACOTTA( new BlockPurpleGlazedTerracotta() ),
    WHITE_GLAZED_TERRACOTTA( new BlockWhiteGlazedTerracotta() ),
    ORANGE_GLAZED_TERRACOTTA( new BlockOrangeGlazedTerracotta() ),
    MAGENTA_GLAZED_TERRACOTTA( new BlockMagentaGlazedTerracotta() ),
    LIGHT_BLUE_GLAZED_TERRACOTTA( new BlockLightBlueGlazedTerracotta() ),
    YELLOW_GLAZED_TERRACOTTA( new BlockYellowGlazedTerracotta() ),
    LIME_GLAZED_TERRACOTTA( new BlockLimeGlazedTerracotta() ),
    PINK_GLAZED_TERRACOTTA( new BlockPinkGlazedTerracotta() ),
    GRAY_GLAZED_TERRACOTTA( new BlockGrayGlazedTerracotta() ),
    SILVER_GLAZED_TERRACOTTA( new BlockSilverGlazedTerracotta() ),
    CYAN_GLAZED_TERRACOTTA( new BlockCyanGlazedTerracotta() ),
    BLUE_GLAZED_TERRACOTTA( new BlockBlueGlazedTerracotta() ),
    BROWN_GLAZED_TERRACOTTA( new BlockBrownGlazedTerracotta() ),
    GREEN_GLAZED_TERRACOTTA( new BlockGreenGlazedTerracotta() ),
    RED_GLAZED_TERRACOTTA( new BlockRedGlazedTerracotta() ),
    BLACK_GLAZED_TERRACOTTA( new BlockBlackGlazedTerracotta() ),
    CONCRETE( new BlockConcrete() ),
    CONCRETEPOWDER( new BlockConcretePowder() ),
    CHEMISTRY_TABLE( new BlockChemistryTable() ),
    UNDERWATER_TORCH( new BlockUnderwaterTorch() ),
    CHORUS_PLANT( new BlockChorusPlant() ),
    STAINED_GLASS( new BlockStainedGlass() ),
    CAMERA( new BlockCamera() ),
    PODZOL( new BlockPodzol() ),
    BEETROOT( new BlockBeetroot() ),
    STONECUTTER( new BlockStonecutter() ),
    GLOWING_OBSIDIAN( new BlockGlowingObsidian() ),
    NETHERREACTOR( new BlockNetherreactor() ),
    INFO_UPDATE( new BlockInfoUpdate() ),
    INFO_UPDATE2( new BlockInfoUpdate2() ),
    MOVING_BLOCK( new BlockMovingblock() ),
    OBSERVER( new BlockObserver() ),
    STRUCTURE_BLOCK( new BlockStructureBlock() ),
    HARD_GLASS( new BlockHardGlass() ),
    HARD_STAINED_GLASS( new BlockHardStainedGlass() ),
    RESERVED6( new BlockReserved6() ),
    PRISMARINE_STAIRS( new BlockPrismarineStairs() ),
    DARK_PRISMARINE_STAIRS( new BlockDarkPrismarineStairs() ),
    PRISMARINE_BRICKS_STAIRS( new BlockPrismarineBricksStairs() ),
    STRIPPED_SPRUCE_LOG( new BlockStrippedSpruceLog() ),
    STRIPPED_BIRCH_LOG( new BlockStrippedBirchLog() ),
    STRIPPED_JUNGLE_LOG( new BlockStrippedJungleLog() ),
    STRIPPED_ACACIA_LOG( new BlockStrippedAcaciaLog() ),
    STRIPPED_DARK_OAK_LOG( new BlockStrippedDarkOakLog() ),
    STRIPPED_OAK_LOG( new BlockStrippedOakLog() ),
    BLUE_ICE( new BlockBlueIce() ),
    ELEMENT_1( new BlockElement1() ),
    ELEMENT_2( new BlockElement2() ),
    ELEMENT_3( new BlockElement3() ),
    ELEMENT_4( new BlockElement4() ),
    ELEMENT_5( new BlockElement5() ),
    ELEMENT_6( new BlockElement6() ),
    ELEMENT_7( new BlockElement7() ),
    ELEMENT_8( new BlockElement8() ),
    ELEMENT_9( new BlockElement9() ),
    ELEMENT_10( new BlockElement10() ),
    ELEMENT_11( new BlockElement11() ),
    ELEMENT_12( new BlockElement12() ),
    ELEMENT_13( new BlockElement13() ),
    ELEMENT_14( new BlockElement14() ),
    ELEMENT_15( new BlockElement15() ),
    ELEMENT_16( new BlockElement16() ),
    ELEMENT_17( new BlockElement17() ),
    ELEMENT_18( new BlockElement18() ),
    ELEMENT_19( new BlockElement19() ),
    ELEMENT_20( new BlockElement20() ),
    ELEMENT_21( new BlockElement21() ),
    ELEMENT_22( new BlockElement22() ),
    ELEMENT_23( new BlockElement23() ),
    ELEMENT_24( new BlockElement24() ),
    ELEMENT_25( new BlockElement25() ),
    ELEMENT_26( new BlockElement26() ),
    ELEMENT_27( new BlockElement27() ),
    ELEMENT_28( new BlockElement28() ),
    ELEMENT_29( new BlockElement29() ),
    ELEMENT_30( new BlockElement30() ),
    ELEMENT_31( new BlockElement31() ),
    ELEMENT_32( new BlockElement32() ),
    ELEMENT_33( new BlockElement33() ),
    ELEMENT_34( new BlockElement34() ),
    ELEMENT_35( new BlockElement35() ),
    ELEMENT_36( new BlockElement36() ),
    ELEMENT_37( new BlockElement37() ),
    ELEMENT_38( new BlockElement38() ),
    ELEMENT_39( new BlockElement39() ),
    ELEMENT_40( new BlockElement40() ),
    ELEMENT_41( new BlockElement41() ),
    ELEMENT_42( new BlockElement42() ),
    ELEMENT_43( new BlockElement43() ),
    ELEMENT_44( new BlockElement44() ),
    ELEMENT_45( new BlockElement45() ),
    ELEMENT_46( new BlockElement46() ),
    ELEMENT_47( new BlockElement47() ),
    ELEMENT_48( new BlockElement48() ),
    ELEMENT_49( new BlockElement49() ),
    ELEMENT_50( new BlockElement50() ),
    ELEMENT_51( new BlockElement51() ),
    ELEMENT_52( new BlockElement52() ),
    ELEMENT_53( new BlockElement53() ),
    ELEMENT_54( new BlockElement54() ),
    ELEMENT_55( new BlockElement55() ),
    ELEMENT_56( new BlockElement56() ),
    ELEMENT_57( new BlockElement57() ),
    ELEMENT_58( new BlockElement58() ),
    ELEMENT_59( new BlockElement59() ),
    ELEMENT_60( new BlockElement60() ),
    ELEMENT_61( new BlockElement61() ),
    ELEMENT_62( new BlockElement62() ),
    ELEMENT_63( new BlockElement63() ),
    ELEMENT_64( new BlockElement64() ),
    ELEMENT_65( new BlockElement65() ),
    ELEMENT_66( new BlockElement66() ),
    ELEMENT_67( new BlockElement67() ),
    ELEMENT_68( new BlockElement68() ),
    ELEMENT_69( new BlockElement69() ),
    ELEMENT_70( new BlockElement70() ),
    ELEMENT_71( new BlockElement71() ),
    ELEMENT_72( new BlockElement72() ),
    ELEMENT_73( new BlockElement73() ),
    ELEMENT_74( new BlockElement74() ),
    ELEMENT_75( new BlockElement75() ),
    ELEMENT_76( new BlockElement76() ),
    ELEMENT_77( new BlockElement77() ),
    ELEMENT_78( new BlockElement78() ),
    ELEMENT_79( new BlockElement79() ),
    ELEMENT_80( new BlockElement80() ),
    ELEMENT_81( new BlockElement81() ),
    ELEMENT_82( new BlockElement82() ),
    ELEMENT_83( new BlockElement83() ),
    ELEMENT_84( new BlockElement84() ),
    ELEMENT_85( new BlockElement85() ),
    ELEMENT_86( new BlockElement86() ),
    ELEMENT_87( new BlockElement87() ),
    ELEMENT_88( new BlockElement88() ),
    ELEMENT_89( new BlockElement89() ),
    ELEMENT_90( new BlockElement90() ),
    ELEMENT_91( new BlockElement91() ),
    ELEMENT_92( new BlockElement92() ),
    ELEMENT_93( new BlockElement93() ),
    ELEMENT_94( new BlockElement94() ),
    ELEMENT_95( new BlockElement95() ),
    ELEMENT_96( new BlockElement96() ),
    ELEMENT_97( new BlockElement97() ),
    ELEMENT_98( new BlockElement98() ),
    ELEMENT_99( new BlockElement99() ),
    ELEMENT_100( new BlockElement100() ),
    ELEMENT_101( new BlockElement101() ),
    ELEMENT_102( new BlockElement102() ),
    ELEMENT_103( new BlockElement103() ),
    ELEMENT_104( new BlockElement104() ),
    ELEMENT_105( new BlockElement105() ),
    ELEMENT_106( new BlockElement106() ),
    ELEMENT_107( new BlockElement107() ),
    ELEMENT_108( new BlockElement108() ),
    ELEMENT_109( new BlockElement109() ),
    ELEMENT_110( new BlockElement110() ),
    ELEMENT_111( new BlockElement111() ),
    ELEMENT_112( new BlockElement112() ),
    ELEMENT_113( new BlockElement113() ),
    ELEMENT_114( new BlockElement114() ),
    ELEMENT_115( new BlockElement115() ),
    ELEMENT_116( new BlockElement116() ),
    ELEMENT_117( new BlockElement117() ),
    ELEMENT_118( new BlockElement118() ),
    SEAGRASS( new BlockSeagrass() ),
    CORAL( new BlockCoral() ),
    CORAL_BLOCK( new BlockCoralBlock() ),
    CORAL_FAN( new BlockCoralFan() ),
    CORAL_FAN_DEAD( new BlockCoralFanDead() ),
    CORAL_FAN_HANG( new BlockCoralFanHang() ),
    CORAL_FAN_HANG2( new BlockCoralFanHang2() ),
    CORAL_FAN_HANG3( new BlockCoralFanHang3() ),
    KELP( new BlockKelp() ),
    DRIED_KELP_BLOCK( new BlockDriedKelpBlock() ),
    ACACIA_BUTTON( new BlockAcaciaButton() ),
    BIRCH_BUTTON( new BlockBirchButton() ),
    DARK_OAK_BUTTON( new BlockDarkOakButton() ),
    JUNGLE_BUTTON( new BlockJungleButton() ),
    SPRUCE_BUTTON( new BlockSpruceButton() ),
    ACACIA_TRAPDOOR( new BlockAcaciaTrapdoor() ),
    BIRCH_TRAPDOOR( new BlockBirchTrapdoor() ),
    DARK_OAK_TRAPDOOR( new BlockDarkOakTrapdoor() ),
    JUNGLE_TRAPDOOR( new BlockJungleTrapdoor() ),
    SPRUCE_TRAPDOOR( new BlockSpruceTrapdoor() ),
    ACACIA_PRESSURE_PLATE( new BlockAcaciaPressurePlate() ),
    BIRCH_PRESSURE_PLATE( new BlockBirchPressurePlate() ),
    DARK_OAK_PRESSURE_PLATE( new BlockDarkOakPressurePlate() ),
    JUNGLE_PRESSURE_PLATE( new BlockJunglePressurePlate() ),
    SPRUCE_PRESSURE_PLATE( new BlockSprucePressurePlate() ),
    CARVED_PUMPKIN( new BlockCarvedPumpkin() ),
    SEA_PICKLE( new BlockSeaPickle() ),
    CONDUIT( new BlockConduit() ),
    TURTLE_EGG( new BlockTurtleEgg() ),
    BUBBLE_COLUMN( new BlockBubbleColumn() ),
    BARRIER( new BlockBarrier() ),
    BAMBOO( new BlockBamboo() ),
    BAMBOO_SAPLING( new BlockBambooSapling() ),
    SCAFFOLDING( new BlockScaffolding() ),

    STONE_SLAB( new BlockStoneSlab() ),
    STONE_SLAB2( new BlockStoneSlab2() ),
    STONE_SLAB3( new BlockStoneSlab3() ),
    STONE_SLAB4( new BlockStoneSlab4() ),

    DOUBLE_STONE_SLAB( new BlockDoubleStoneSlab() ),
    DOUBLE_STONE_SLAB2( new BlockDoubleStoneSlab2() ),
    DOUBLE_STONE_SLAB3( new BlockDoubleStoneSlab3() ),
    DOUBLE_STONE_SLAB4( new BlockDoubleStoneSlab4() ),

    GRANITE_STAIRS( new BlockGraniteStairs() ),
    DIORITE_STAIRS( new BlockDioriteStairs() ),
    ANDESITE_STAIRS( new BlockAndesiteStairs() ),
    POLISHED_GRANITE_STAIRS( new BlockPolishedGraniteStairs() ),
    POLISHED_DIORITE_STAIRS( new BlockPolishedDioriteStairs() ),
    POLISHED_ANDESITE_STAIRS( new BlockPolishedAndesiteStairs() ),
    MOSSY_STONE_BRICK_STAIRS( new BlockMossyStoneBrickStairs() ),
    SMOOTH_RED_SANDSTONE_STAIRS( new BlockSmoothRedSandstoneStairs() ),
    SMOOTH_SANDSTONE_STAIRS( new BlockSmoothSandstoneStairs() ),
    END_BRICK_STAIRS( new BlockEndBrickStairs() ),
    MOSSY_COBBLESTONE_STAIRS( new BlockMossyCobblestoneStairs() ),
    NORMAL_STONE_STAIRS( new BlockNormalStoneStairs() ),
    SPRUCE_STANDING_SIGN( new BlockSpruceStandingSign() ),
    SPRUCE_WALL_SIGN( new BlockSpruceWallSign() ),
    SMOOTH_STONE( new BlockSmoothStone() ),
    RED_NETHER_BRICK_STAIRS( new BlockRedNetherBrickStairs() ),
    SMOOTH_QUARTZ_STAIRS( new BlockSmoothQuartzStairs() ),
    BIRCH_STANDING_SIGN( new BlockBirchStandingSign() ),
    BIRCH_WALL_SIGN( new BlockBirchWallSign() ),
    JUNGLE_STANDING_SIGN( new BlockJungleStandingSign() ),
    JUNGLE_WALL_SIGN( new BlockJungleWallSign() ),
    ACACIA_STANDING_SIGN( new BlockAcaciaStandingSign() ),
    ACACIA_WALL_SIGN( new BlockAcaciaWallSign() ),
    DARK_OAK_STANDING_SIGN( new BlockDarkOakStandingSign() ),
    DARK_OAK_WALL_SIGN( new BlockDarkOakWallSign() ),
    LECTERN( new BlockLectern() ),
    GRINDSTONE( new BlockGrindstone() ),
    BLAST_FURNACE( new BlockBlastFurnace() ),
    STONECUTTER_BLOCK( new BlockStonecutterBlock() ),
    SMOKER( new BlockSmoker() ),
    LIT_SMOKER( new BlockGlowingSmoker() ),
    CARTOGRAPGHY_TABLE( new BlockCartographyTable() ),
    FLETCHING_TABLE( new BlockFletchingTable() ),
    SMITHING_TABLE( new BlockSmithingTable() ),
    BARREL( new BlockBarrel() ),
    LOOM( new BlockLoom() ),
    BELL( new BlockBell() ),
    SWEET_BERRY_BUSH( new BlockSweetBerryBush() ),
    LANTERN( new BlockLantern() ),
    CAMPFIRE( new BlockCampfire() ),
    LAVA_CAULDRON( new BlockLavaCauldron() ),
    JIGSAW( new BlockJigsaw() ),
    WOOD( new BlockWood() ),
    COMPOSTER( new BlockComposter() ),
    GLOWING_BLAST_FURNACE( new BlockGlowingBlastFurnace() ),
    LIGHT_BLOCK( new BlockLightBlock() ),
    WITHER_ROSE( new BlockWitherRose() ),
    STICKYPISTONARMCOLLISION( new BlockStickypistonarmcollision() ),
    BEE_NEST( new BlockBeeNest() ),
    HONEY_BLOCK( new BlockHoneyBlock() ),
    HONEYCOMB_BLOCK( new BlockHoneycombBlock() ),
    LODESTONE( new BlockLodestone() ),
    CRIMSON_ROOTS( new BlockCrimsonRoots() ),
    WARPED_ROOTS( new BlockWarpedRoots() ),
    CRIMSON_STEM( new BlockCrimsonStem() ),
    WARPED_STEM( new BlockWarpedStem() ),
    WARPED_WART_BLOCK( new BlockWarpedWartBlock() ),
    CRIMSON_FUNGUS( new BlockCrimsonFungus() ),
    WARPED_FUNGUS( new BlockWarpedFungus() ),
    SHROOMLIGHT( new BlockShroomlight() ),
    WEEPING_VINES( new BlockWeepingVines() ),
    CRIMSON_NYLIUM( new BlockCrimsonNylium() ),
    WARPED_NYLIUM( new BlockWarpedNylium() ),
    BASALT( new BlockBasalt() ),
    POLISHED_BASALT( new BlockPolishedBasalt() ),
    SOUL_SOIL( new BlockSoulSoil() ),
    SOUL_FIRE( new BlockSoulFire() ),
    NETHER_SPROUTS( new BlockNetherSprouts() ),
    TARGET( new BlockTarget() ),
    STRIPPED_CRIMSON_STEM( new BlockStrippedCrimsonStem() ),
    STRIPPED_WARPED_STEM( new BlockStrippedWarpedStem() ),
    CRIMSON_PLANKS( new BlockCrimsonPlanks() ),
    WARPED_PLANKS( new BlockWarpedPlanks() ),
    CRIMSON_DOOR( new BlockCrimsonDoor() ),
    WARPED_DOOR( new BlockWarpedDoor() ),
    CRIMSON_TRAPDOOR( new BlockCrimsonTrapdoor() ),
    WARPED_TRAPDOOR( new BlockWarpedTrapdoor() ),
    CRIMSON_STANDING_SIGN( new BlockCrimsonStandingSign() ),
    WARPED_STANDING_SIGN( new BlockWarpedStandingSign() ),
    CRIMSON_WALL_SIGN( new BlockCrimsonWallSign() ),
    WARPED_WALL_SIGN( new BlockWarpedWallSign() ),
    CRIMSON_STAIRS( new BlockCrimsonStairs() ),
    WARPED_STAIRS( new BlockWarpedStairs() ),
    CRIMSON_FENCE( new BlockCrimsonFence() ),
    WARPED_FENCE( new BlockWarpedFence() ),
    CRIMSON_FENCE_GATE( new BlockCrimsonFenceGate() ),
    WARPED_FENCE_GATE( new BlockWarpedFenceGate() ),
    CRIMSON_BUTTON( new BlockCrimsonButton() ),
    WARPED_BUTTON( new BlockWarpedButton() ),
    CRIMSON_PRESSURE_PLATE( new BlockCrimsonPressurePlate() ),
    WARPED_PRESSURE_PLATE( new BlockWarpedPressurePlate() ),
    CRIMSON_SLAB( new BlockCrimsonSlab() ),
    WARPED_SLAB( new BlockWarpedSlab() ),
    CRIMSON_DOUBLE_SLAB( new BlockDoubleCrimsonSlab() ),
    WARPED_DOUBLE_SLAB( new BlockDoubleWarpedSlab() ),
    SOUL_TORCH( new BlockSoulTorch() ),
    SOUL_LANTERN( new BlockSoulLantern() ),
    NETHERITE_BLOCK( new BlockNetheriteBlock() ),
    ANCIENT_DEBRIS( new BlockAncientDebris() ),
    RESPAWN_ANCHOR( new BlockRespawnAnchor() ),
    BLACKSTONE( new BlockBlackstone() ),
    POLISHED_BLACKSTONE_BRICKS( new BlockPolishedBlackstoneBricks() ),
    POLISHED_BLACKSTONE_BRICK_STAIRS( new BlockPolishedBlackstoneBrickStairs() ),
    BLACKSTONE_STAIRS( new BlockBlackstoneStairs() ),
    BLACKSTONE_WALL( new BlockBlackstoneWall() ),
    POLISHED_BLACKSTONE_BRICK_WALL( new BlockPolishedBlackstoneBrickWall() ),
    CHISELED_POLISHED_BLACKSTONE( new BlockChiseledPolishedBlackstone() ),
    CRACKED_POLISHED_BLACKSTONE_BRICKS( new BlockCrackedPolishedBlackstoneBricks() ),
    GLIDED_BLACKSTONE( new BlockGildedBlackstone() ),
    BLACKSTONE_SLAB( new BlockBlackstoneSlab() ),
    BLACKSTONE_DOUBLE_SLAB( new BlockDoubleBlackstoneSlab() ),
    POLISHED_BLACKSTONE_BRICK_SLAB( new BlockPolishedBlackstoneBrickSlab() ),
    POLISHED_BLACKSTONE_BRICK_DOUBLE_SLAB( new BlockPolishedBlackstoneBrickDoubleSlab() ),
    CHAIN( new BlockChain() ),
    TWISTING_VINES( new BlockTwistingVines() ),
    NETHER_GOLD_ORE( new BlockNetherGoldOre() ),
    CRYING_OBSIDIAN( new BlockCryingObsidian() ),
    SOUL_CAMPFIRE( new BlockSoulCampfire() ),
    POLISHED_BLACKSTONE( new BlockPolishedBlackstone() ),
    POLISHED_BLACKSTONE_STAIRS( new BlockPolishedBlackstoneStairs() ),
    POLISHED_BLACKSTONE_SLAB( new BlockPolishedBlackstoneSlab() ),
    POLISHED_BLACKSTONE_DOUBLE_SLAB( new BlockDoublePolishedBlackstoneSlab() ),
    POLISHED_BLACKSTONE_PRESSURE_PLATE( new BlockPolishedBlackstonePressurePlate() ),
    POLISHED_BLACKSTONE_BUTTON( new BlockPolishedBlackstoneButton() ),
    POLISHED_BLACKSTONE_WALL( new BlockPolishedBlackstoneWall() ),
    WARPED_HYPHAE( new BlockWarpedHyphae() ),
    CRIMSON_HYPHAE( new BlockCrimsonHyphae() ),
    STRIPPED_CRIMSON_HYPHAE( new BlockStrippedCrimsonHyphae() ),
    STRIPPED_WARPED_HYPHAE( new BlockStrippedWarpedHyphae() ),
    CHISELED_NETHER_BRICKS( new BlockChiseledNetherBricks() ),
    CRACKED_NETHER_BRICKS( new BlockCrackedNetherBricks() ),
    QUARTZ_BRICKS( new BlockQuartzBricks() ),
    BEEHIVE( new BlockBeehive() ),

    DEEPSLATE_BRICK_WALL( new BlockDeepslateBrickWall() ),
    WEATHERED_CUT_COPPER_SLAB( new BlockWeatheredCutCopperSlab() ),
    GLOW_FRAME( new BlockGlowFrame() ),
    HANGING_ROOTS( new BlockHangingRoots() ),
    WAXED_EXPOSED_CUT_COPPER_STAIRS( new BlockWaxedExposedCutCopperStairs() ),
    POLISHED_DEEPSLATE_SLAB( new BlockPolishedDeepslateSlab() ),
    COBBLED_DEEPSLATE( new BlockCobbledDeepslate() ),
    DEEPSLATE_BRICK_DOUBLE_SLAB( new BlockDeepslateBrickDoubleSlab() ),
    DRIPSTONE_BLOCK( new BlockDripstoneBlock() ),
    CALCITE( new BlockCalcite() ),
    RAW_GOLD_BLOCK( new BlockRawGoldBlock() ),
    WAXED_CUT_COPPER_SLAB( new BlockWaxedCutCopperSlab() ),
    LIT_DEEPSLATE_REDSTONE_ORE( new BlockLitDeepslateRedstoneOre() ),
    CUT_COPPER_SLAB( new BlockCutCopperSlab() ),
    MOSS_BLOCK( new BlockMossBlock() ),
    DEEPSLATE_TILES( new BlockDeepslateTiles() ),
    DEEPSLATE_TILE_STAIRS( new BlockDeepslateTileStairs() ),
    WAXED_EXPOSED_CUT_COPPER( new BlockWaxedExposedCutCopper() ),
    WAXED_CUT_COPPER( new BlockWaxedCutCopper() ),
    EXPOSED_CUT_COPPER( new BlockExposedCutCopper() ),
    CAVE_VINES( new BlockCaveVines() ),
    WAXED_WEATHERED_DOUBLE_CUT_COPPER_SLAB( new BlockWaxedWeatheredDoubleCutCopperSlab() ),
    CUT_COPPER( new BlockCutCopper() ),
    AMETHYST_BLOCK( new BlockAmethystBlock() ),
    SCULK_SENSOR( new BlockSculkSensor() ),
    BIG_DRIPLEAF( new BlockBigDripleaf() ),
    WAXED_WEATHERED_CUT_COPPER( new BlockWaxedWeatheredCutCopper() ),
    COBBLED_DEEPSLATE_WALL( new BlockCobbledDeepslateWall() ),
    SMALL_DRIPLEAF_BLOCK( new BlockSmallDripleafBlock() ),
    AZALEA_LEAVES_FLOWERED( new BlockAzaleaLeavesFlowered() ),
    OXIDIZED_CUT_COPPER_STAIRS( new BlockOxidizedCutCopperStairs() ),
    WAXED_WEATHERED_COPPER( new BlockWaxedWeatheredCopper() ),
    CAVE_VINES_HEAD_WITH_BERRIES( new BlockCaveVinesHeadWithBerries() ),
    CAVE_VINES_BODY_WITH_BERRIES( new BlockCaveVinesBodyWithBerries() ),
    DEEPSLATE_GOLD_ORE( new BlockDeepslateGoldOre() ),
    FLOWERING_AZALEA( new BlockFloweringAzalea() ),
    DEEPSLATE_TILE_WALL( new BlockDeepslateTileWall() ),
    GLOW_LICHEN( new BlockGlowLichen() ),
    OXIDIZED_CUT_COPPER_SLAB( new BlockOxidizedCutCopperSlab() ),
    WAXED_DOUBLE_CUT_COPPER_SLAB( new BlockWaxedDoubleCutCopperSlab() ),
    CRACKED_DEEPSLATE_TILES( new BlockCrackedDeepslateTiles() ),
    WEATHERED_CUT_COPPER( new BlockWeatheredCutCopper() ),
    DEEPSLATE_EMERALD_ORE( new BlockDeepslateEmeraldOre() ),
    SMALL_AMETHYST_BUD( new BlockSmallAmethystBud() ),
    WAXED_EXPOSED_COPPER( new BlockWaxedExposedCopper() ),
    SPORE_BLOSSOM( new BlockSporeBlossom() ),
    DEEPSLATE_BRICK_SLAB( new BlockDeepslateBrickSlab() ),
    BUDDING_AMETHYST( new BlockBuddingAmethyst() ),
    OXIDIZED_COPPER( new BlockOxidizedCopper() ),
    SMOOTH_BASALT( new BlockSmoothBasalt() ),
    TINTED_GLASS( new BlockTintedGlass() ),
    WAXED_OXIDIZED_CUT_COPPER_SLAB( new BlockWaxedOxidizedCutCopperSlab() ),
    POWDER_SNOW( new BlockPowderSnow() ),
    AZALEA( new BlockAzalea() ),
    EXPOSED_CUT_COPPER_SLAB( new BlockExposedCutCopperSlab() ),
    DEEPSLATE_BRICKS( new BlockDeepslateBricks() ),
    WEATHERED_DOUBLE_CUT_COPPER_SLAB( new BlockWeatheredDoubleCutCopperSlab() ),
    OXIDIZED_CUT_COPPER( new BlockOxidizedCutCopper() ),
    OXIDIZED_DOUBLE_CUT_COPPER_SLAB( new BlockOxidizedDoubleCutCopperSlab() ),
    POLISHED_DEEPSLATE_DOUBLE_SLAB( new BlockPolishedDeepslateDoubleSlab() ),
    DEEPSLATE_TILE_DOUBLE_SLAB( new BlockDeepslateTileDoubleSlab() ),
    CUT_COPPER_STAIRS( new BlockCutCopperStairs() ),
    LIGHTNING_ROD( new BlockLightningRod() ),
    WAXED_OXIDIZED_CUT_COPPER( new BlockWaxedOxidizedCutCopper() ),
    POLISHED_DEEPSLATE( new BlockPolishedDeepslate() ),
    DOUBLE_CUT_COPPER_SLAB( new BlockDoubleCutCopperSlab() ),
    DEEPSLATE_REDSTONE_ORE( new BlockDeepslateRedstoneOre() ),
    WAXED_COPPER( new BlockWaxedCopper() ),
    POLISHED_DEEPSLATE_WALL( new BlockPolishedDeepslateWall() ),
    COBBLED_DEEPSLATE_DOUBLE_SLAB( new BlockCobbledDeepslateDoubleSlab() ),
    DEEPSLATE_IRON_ORE( new BlockDeepslateIronOre() ),
    DEEPSLATE_DIAMOND_ORE( new BlockDeepslateDiamondOre() ),
    WAXED_EXPOSED_CUT_COPPER_SLAB( new BlockWaxedExposedCutCopperSlab() ),
    WAXED_OXIDIZED_CUT_COPPER_STAIRS( new BlockWaxedOxidizedCutCopperStairs() ),
    DEEPSLATE_COPPER_ORE( new BlockDeepslateCopperOre() ),
    AZALEA_LEAVES( new BlockAzaleaLeaves() ),
    POLISHED_DEEPSLATE_STAIRS( new BlockPolishedDeepslateStairs() ),
    TUFF( new BlockTuff() ),
    WAXED_WEATHERED_CUT_COPPER_SLAB( new BlockWaxedWeatheredCutCopperSlab() ),
    WAXED_OXIDIZED_COPPER( new BlockWaxedOxidizedCopper() ),
    EXPOSED_CUT_COPPER_STAIRS( new BlockExposedCutCopperStairs() ),
    WAXED_CUT_COPPER_STAIRS( new BlockWaxedCutCopperStairs() ),
    DEEPSLATE_BRICK_STAIRS( new BlockDeepslateBrickStairs() ),
    WAXED_OXIDIZED_DOUBLE_CUT_COPPER_SLAB( new BlockWaxedOxidizedDoubleCutCopperSlab() ),
    CRACKED_DEEPSLATE_BRICKS( new BlockCrackedDeepslateBricks() ),
    POINTED_DRIPSTONE( new BlockPointedDripstone() ),
    DEEPSLATE_LAPIS_ORE( new BlockDeepslateLapisOre() ),
    DEEPSLATE_COAL_ORE( new BlockDeepslateCoalOre() ),
    LARGE_AMETHYST_BUD( new BlockLargeAmethystBud() ),
    COPPER_BLOCK( new BlockCopperBlock() ),
    RAW_COPPER_BLOCK( new BlockRawCopperBlock() ),
    WEATHERED_COPPER( new BlockWeatheredCopper() ),
    MOSS_CARPET( new BlockMossCarpet() ),
    WAXED_EXPOSED_DOUBLE_CUT_COPPER_SLAB( new BlockWaxedExposedDoubleCutCopperSlab() ),
    INFESTED_DEEPSLATE( new BlockInfestedDeepslate() ),
    MEDIUM_AMETHYST_BUD( new BlockMediumAmethystBud() ),
    AMETHYST_CLUSTER( new BlockAmethystCluster() ),
    WAXED_WEATHERED_CUT_COPPER_STAIRS( new BlockWaxedWeatheredCutCopperStairs() ),
    COBBLED_DEEPSLATE_STAIRS( new BlockCobbledDeepslateStairs() ),
    DEEPSLATE( new BlockDeepslate() ),
    EXPOSED_DOUBLE_CUT_COPPER_SLAB( new BlockExposedDoubleCutCopperSlab() ),
    COPPER_ORE( new BlockCopperOre() ),
    CHISELED_DEEPSLATE( new BlockChiseledDeepslate() ),
    DEEPSLATE_TILE_SLAB( new BlockDeepslateTileSlab() ),
    DIRT_WITH_ROOTS( new BlockDirtWithRoots() ),
    RAW_IRON_BLOCK( new BlockRawIronBlock() ),
    WEATHERED_CUT_COPPER_STAIRS( new BlockWeatheredCutCopperStairs() ),
    EXPOSED_COPPER( new BlockExposedCopper() ),
    COBBLED_DEEPSLATE_SLAB( new BlockCobbledDeepslateSlab() ),

    CANDLE( new BlockCandle() ),
    WHITE_CANDLE( new BlockWhiteCandle() ),
    ORANGE_CANDLE( new BlockOrangeCandle() ),
    MAGENTA_CANDLE( new BlockMagentaCandle() ),
    LIGHT_BLUE_CANDLE( new BlockLightBlueCandle() ),
    YELLOW_CANDLE( new BlockYellowCandle() ),
    LIME_CANDLE( new BlockLimeCandle() ),
    PINK_CANDLE( new BlockPinkCandle() ),
    LIGHT_GRAY( new BlockLightGrayCandle() ),
    GRAY_CANDLE( new BlockGrayCandle() ),
    CYAN_CANDLE( new BlockCyanCandle() ),
    PURPLE_CANDLE( new BlockPurpleCandle() ),
    BLUE_CANDLE( new BlockBlueCandle() ),
    BROWN_CANDLE( new BlockBrownCandle() ),
    GREEN_CANDLE( new BlockGreenCandle() ),
    RED_CANDLE( new BlockRedCandle() ),
    BLACK_CANDLE( new BlockBlackCandle() ),

    SCULK_SHRIEKER( new BlockSculkShrieker() ),
    SCULK( new BlockSculk() ),
    SCULK_CATALYST( new BlockSculkCatalyst() ),
    SCULK_VEIN( new BlockSculkVein() );

    private final Block block;

    BlockType( Block block ) {
        this.block = block;
        Companion.update( block.getRuntimeId(), block );
        Companion.update( block.getIdentifier(), block );
    }

    public static void init() {
        for ( BlockType blockType : BlockType.values() ) {
            blockType.getBlock();
        }
    }

    public <B extends Block> B getBlock() {
        return (B) this.block.clone();
    }

    public Item toItem() {
        return this.block.toItem();
    }

    public static Block getBlock( int runtimeId ) {
        if ( !Companion.runtimeIdToBlock.containsKey( runtimeId ) ) {
            return new BlockAir().clone();
        }
        return Companion.runtimeIdToBlock.get( runtimeId ).clone();
    }

    public static Block getBlock( String identifier ) {
        if ( !Companion.identifierToBlock.containsKey( identifier ) ) {
            return new BlockAir().clone();
        }
        return Companion.identifierToBlock.get( identifier ).clone();
    }

    public static class Companion {
        static final Int2ObjectMap<Block> runtimeIdToBlock = new Int2ObjectOpenHashMap<>();
        static final Object2ObjectMap<String, Block> identifierToBlock = new Object2ObjectOpenHashMap<>();

        public static void update( int runtimeId, Block block ) {
            if ( Server.getInstance().isInitiating() ) {
                runtimeIdToBlock.put( runtimeId, block.clone() );
            } else {
                throw new RuntimeException( "Can not update block type because server is already initiated!" );
            }
        }

        public static void update( String identifier, Block block ) {
            if ( Server.getInstance().isInitiating() ) {
                identifierToBlock.put( identifier, block.clone() );
            } else {
                throw new RuntimeException( "Can not update block type because server is already initiated!" );
            }
        }
    }
}
