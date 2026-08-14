/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.holycrusade.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

import net.mcreator.holycrusade.block.*;
import net.mcreator.holycrusade.HolyCrusadeMod;

import java.util.function.Function;

public class HolyCrusadeModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(HolyCrusadeMod.MODID);
	public static final DeferredBlock<Block> CANDLE;
	public static final DeferredBlock<Block> OLD_JAR;
	public static final DeferredBlock<Block> ANPHORA;
	public static final DeferredBlock<Block> OLD_CHEST;
	public static final DeferredBlock<Block> OLD_STONE_TILE;
	public static final DeferredBlock<Block> OLD_STONE_BRICKS;
	public static final DeferredBlock<Block> OLD_STONE_TILES;
	public static final DeferredBlock<Block> CHISELED_OLD_STONE;
	public static final DeferredBlock<Block> OLDSTONE_BRICK_STAIRS;
	public static final DeferredBlock<Block> OLD_STONE_BRICKS_SLAB;
	public static final DeferredBlock<Block> OLD_STONE_BRICK_WALL;
	public static final DeferredBlock<Block> OLD_STONE_TILE_STAIRS;
	public static final DeferredBlock<Block> OLD_STONE_TILE_SLAB;
	public static final DeferredBlock<Block> OLD_STONE_TILE_WALL;
	public static final DeferredBlock<Block> CRACKED_OLD_STONE_TILE;
	public static final DeferredBlock<Block> OLD_BOWL;
	public static final DeferredBlock<Block> IRON_WINDOW;
	public static final DeferredBlock<Block> SKULL_PILE;
	public static final DeferredBlock<Block> DEMON_STONE_BRICKS;
	public static final DeferredBlock<Block> DEMON_STONE_TILES;
	public static final DeferredBlock<Block> CHISELED_DEMON_STONE;
	public static final DeferredBlock<Block> DEMON_STONE_SIGIL;
	public static final DeferredBlock<Block> DEMONIC_JAR;
	public static final DeferredBlock<Block> DEMON_STONE_STAIRS;
	public static final DeferredBlock<Block> DEMON_STONE_SAB;
	public static final DeferredBlock<Block> DEMON_STONE_WALL;
	public static final DeferredBlock<Block> COIN;
	static {
		CANDLE = register("candle", CandleBlock::new);
		OLD_JAR = register("old_jar", OldJarBlock::new);
		ANPHORA = register("anphora", AnphoraBlock::new);
		OLD_CHEST = register("old_chest", OldChestBlock::new);
		OLD_STONE_TILE = register("old_stone_tile", OldStoneTileBlock::new);
		OLD_STONE_BRICKS = register("old_stone_bricks", OldStoneBricksBlock::new);
		OLD_STONE_TILES = register("old_stone_tiles", OldStoneTilesBlock::new);
		CHISELED_OLD_STONE = register("chiseled_old_stone", ChiseledOldStoneBlock::new);
		OLDSTONE_BRICK_STAIRS = register("oldstone_brick_stairs", OldstoneBrickStairsBlock::new);
		OLD_STONE_BRICKS_SLAB = register("old_stone_bricks_slab", OldStoneBricksSlabBlock::new);
		OLD_STONE_BRICK_WALL = register("old_stone_brick_wall", OldStoneBrickWallBlock::new);
		OLD_STONE_TILE_STAIRS = register("old_stone_tile_stairs", OldStoneTileStairsBlock::new);
		OLD_STONE_TILE_SLAB = register("old_stone_tile_slab", OldStoneTileSlabBlock::new);
		OLD_STONE_TILE_WALL = register("old_stone_tile_wall", OldStoneTileWallBlock::new);
		CRACKED_OLD_STONE_TILE = register("cracked_old_stone_tile", CrackedOldStoneTileBlock::new);
		OLD_BOWL = register("old_bowl", OldBowlBlock::new);
		IRON_WINDOW = register("iron_window", IronWindowBlock::new);
		SKULL_PILE = register("skull_pile", SkullPileBlock::new);
		DEMON_STONE_BRICKS = register("demon_stone_bricks", DemonStoneBricksBlock::new);
		DEMON_STONE_TILES = register("demon_stone_tiles", DemonStoneTilesBlock::new);
		CHISELED_DEMON_STONE = register("chiseled_demon_stone", ChiseledDemonStoneBlock::new);
		DEMON_STONE_SIGIL = register("demon_stone_sigil", DemonStoneSigilBlock::new);
		DEMONIC_JAR = register("demonic_jar", DemonicJarBlock::new);
		DEMON_STONE_STAIRS = register("demon_stone_stairs", DemonStoneStairsBlock::new);
		DEMON_STONE_SAB = register("demon_stone_sab", DemonStoneSabBlock::new);
		DEMON_STONE_WALL = register("demon_stone_wall", DemonStoneWallBlock::new);
		COIN = register("coin", CoinBlock::new);
	}

	// Start of user code block custom blocks
	// End of user code block custom blocks
	private static <B extends Block> DeferredBlock<B> register(String name, Function<BlockBehaviour.Properties, ? extends B> supplier) {
		return REGISTRY.registerBlock(name, supplier);
	}
}