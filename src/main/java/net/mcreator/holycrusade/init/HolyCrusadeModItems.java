/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.holycrusade.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.holycrusade.item.*;
import net.mcreator.holycrusade.HolyCrusadeMod;

import java.util.function.Function;

public class HolyCrusadeModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(HolyCrusadeMod.MODID);
	public static final DeferredItem<Item> VERACRUX_FRAGMENT;
	public static final DeferredItem<Item> WINE;
	public static final DeferredItem<Item> COMMUNION_WAFER;
	public static final DeferredItem<Item> TEMPLAR_SWORD;
	public static final DeferredItem<Item> HELL_PEPPER;
	public static final DeferredItem<Item> CHALICE_OF_CHRIST;
	public static final DeferredItem<Item> GOLD_CROSS;
	public static final DeferredItem<Item> HOLY_WATER;
	public static final DeferredItem<Item> SACRED_BOOK_ITEM;
	public static final DeferredItem<Item> ROSARY;
	public static final DeferredItem<Item> THORNS_CROWN;
	public static final DeferredItem<Item> SAINT_BLOOD;
	public static final DeferredItem<Item> CANDLE;
	public static final DeferredItem<Item> OLD_JAR;
	public static final DeferredItem<Item> ANPHORA;
	public static final DeferredItem<Item> OLD_CHEST;
	public static final DeferredItem<Item> OLD_KEY;
	public static final DeferredItem<Item> PORTABLE_PORTAL;
	public static final DeferredItem<Item> TRIDENT;
	public static final DeferredItem<Item> SAINT_SHIELD;
	public static final DeferredItem<Item> OLD_STONE_TILE;
	public static final DeferredItem<Item> OLD_STONE_BRICKS;
	public static final DeferredItem<Item> OLD_STONE_TILES;
	public static final DeferredItem<Item> CHISELED_OLD_STONE;
	public static final DeferredItem<Item> OLDSTONE_BRICK_STAIRS;
	public static final DeferredItem<Item> OLD_STONE_BRICKS_SLAB;
	public static final DeferredItem<Item> OLD_STONE_BRICK_WALL;
	public static final DeferredItem<Item> OLD_STONE_TILE_STAIRS;
	public static final DeferredItem<Item> OLD_STONE_TILE_SLAB;
	public static final DeferredItem<Item> OLD_STONE_TILE_WALL;
	public static final DeferredItem<Item> CRACKED_OLD_STONE_TILE;
	public static final DeferredItem<Item> OLD_BOWL;
	public static final DeferredItem<Item> IRON_WINDOW;
	public static final DeferredItem<Item> SKULL_PILE;
	public static final DeferredItem<Item> BONES_SPAWN_EGG;
	public static final DeferredItem<Item> PUTRID_PRIEST_SPAWN_EGG;
	public static final DeferredItem<Item> RAT_SPAWN_EGG;
	public static final DeferredItem<Item> CORRUPTED_TEMPLAR_SPAWN_EGG;
	public static final DeferredItem<Item> ARHAMEL_RING;
	public static final DeferredItem<Item> BIHRAIL_RING;
	public static final DeferredItem<Item> ARAMIEL_RING;
	public static final DeferredItem<Item> DEMON_STONE_BRICKS;
	public static final DeferredItem<Item> DEMON_STONE_TILES;
	public static final DeferredItem<Item> CHISELED_DEMON_STONE;
	public static final DeferredItem<Item> DEMON_STONE_SIGIL;
	public static final DeferredItem<Item> DEMONIC_JAR;
	public static final DeferredItem<Item> DEMON_SPAWN_EGG;
	public static final DeferredItem<Item> DEMON_STONE_STAIRS;
	public static final DeferredItem<Item> DEMON_STONE_SAB;
	public static final DeferredItem<Item> DEMON_STONE_WALL;
	public static final DeferredItem<Item> DEMON_0_SPAWN_EGG;
	public static final DeferredItem<Item> COIN;
	public static final DeferredItem<Item> DEMON_2_SPAWN_EGG;
	public static final DeferredItem<Item> DEMON_3_SPAWN_EGG;
	public static final DeferredItem<Item> FIRE_EYE;
	public static final DeferredItem<Item> TEMPLEMAN_SPAWN_EGG;
	static {
		VERACRUX_FRAGMENT = register("veracrux_fragment", VeracruxFragmentItem::new);
		WINE = register("wine", WineItem::new);
		COMMUNION_WAFER = register("communion_wafer", CommunionWaferItem::new);
		TEMPLAR_SWORD = register("templar_sword", TemplarSwordItem::new);
		HELL_PEPPER = register("hell_pepper", HellPepperItem::new);
		CHALICE_OF_CHRIST = register("chalice_of_christ", ChaliceOfChristItem::new);
		GOLD_CROSS = register("gold_cross", GoldCrossItem::new);
		HOLY_WATER = register("holy_water", HolyWaterItem::new);
		SACRED_BOOK_ITEM = register("sacred_book_item", SacredBookItemItem::new);
		ROSARY = register("rosary", RosaryItem::new);
		THORNS_CROWN = register("thorns_crown", ThornsCrownItem::new);
		SAINT_BLOOD = register("saint_blood", SaintBloodItem::new);
		CANDLE = block(HolyCrusadeModBlocks.CANDLE);
		OLD_JAR = block(HolyCrusadeModBlocks.OLD_JAR);
		ANPHORA = block(HolyCrusadeModBlocks.ANPHORA);
		OLD_CHEST = block(HolyCrusadeModBlocks.OLD_CHEST);
		OLD_KEY = register("old_key", OldKeyItem::new);
		PORTABLE_PORTAL = register("portable_portal", PortablePortalItem::new);
		TRIDENT = register("trident", TridentItem::new);
		SAINT_SHIELD = register("saint_shield", SaintShieldItem::new);
		OLD_STONE_TILE = block(HolyCrusadeModBlocks.OLD_STONE_TILE);
		OLD_STONE_BRICKS = block(HolyCrusadeModBlocks.OLD_STONE_BRICKS);
		OLD_STONE_TILES = block(HolyCrusadeModBlocks.OLD_STONE_TILES);
		CHISELED_OLD_STONE = block(HolyCrusadeModBlocks.CHISELED_OLD_STONE);
		OLDSTONE_BRICK_STAIRS = block(HolyCrusadeModBlocks.OLDSTONE_BRICK_STAIRS);
		OLD_STONE_BRICKS_SLAB = block(HolyCrusadeModBlocks.OLD_STONE_BRICKS_SLAB);
		OLD_STONE_BRICK_WALL = block(HolyCrusadeModBlocks.OLD_STONE_BRICK_WALL);
		OLD_STONE_TILE_STAIRS = block(HolyCrusadeModBlocks.OLD_STONE_TILE_STAIRS);
		OLD_STONE_TILE_SLAB = block(HolyCrusadeModBlocks.OLD_STONE_TILE_SLAB);
		OLD_STONE_TILE_WALL = block(HolyCrusadeModBlocks.OLD_STONE_TILE_WALL);
		CRACKED_OLD_STONE_TILE = block(HolyCrusadeModBlocks.CRACKED_OLD_STONE_TILE);
		OLD_BOWL = block(HolyCrusadeModBlocks.OLD_BOWL);
		IRON_WINDOW = block(HolyCrusadeModBlocks.IRON_WINDOW);
		SKULL_PILE = block(HolyCrusadeModBlocks.SKULL_PILE);
		BONES_SPAWN_EGG = register("bones_spawn_egg", properties -> new SpawnEggItem(properties.spawnEgg(HolyCrusadeModEntities.BONES.get())));
		PUTRID_PRIEST_SPAWN_EGG = register("putrid_priest_spawn_egg", properties -> new SpawnEggItem(properties.spawnEgg(HolyCrusadeModEntities.PUTRID_PRIEST.get())));
		RAT_SPAWN_EGG = register("rat_spawn_egg", properties -> new SpawnEggItem(properties.spawnEgg(HolyCrusadeModEntities.RAT.get())));
		CORRUPTED_TEMPLAR_SPAWN_EGG = register("corrupted_templar_spawn_egg", properties -> new SpawnEggItem(properties.spawnEgg(HolyCrusadeModEntities.CORRUPTED_TEMPLAR.get())));
		ARHAMEL_RING = register("arhamel_ring", ArhamelRingItem::new);
		BIHRAIL_RING = register("bihrail_ring", BihrailRingItem::new);
		ARAMIEL_RING = register("aramiel_ring", AramielRingItem::new);
		DEMON_STONE_BRICKS = block(HolyCrusadeModBlocks.DEMON_STONE_BRICKS);
		DEMON_STONE_TILES = block(HolyCrusadeModBlocks.DEMON_STONE_TILES);
		CHISELED_DEMON_STONE = block(HolyCrusadeModBlocks.CHISELED_DEMON_STONE);
		DEMON_STONE_SIGIL = block(HolyCrusadeModBlocks.DEMON_STONE_SIGIL);
		DEMONIC_JAR = block(HolyCrusadeModBlocks.DEMONIC_JAR);
		DEMON_SPAWN_EGG = register("demon_spawn_egg", properties -> new SpawnEggItem(properties.spawnEgg(HolyCrusadeModEntities.DEMON.get())));
		DEMON_STONE_STAIRS = block(HolyCrusadeModBlocks.DEMON_STONE_STAIRS);
		DEMON_STONE_SAB = block(HolyCrusadeModBlocks.DEMON_STONE_SAB);
		DEMON_STONE_WALL = block(HolyCrusadeModBlocks.DEMON_STONE_WALL);
		DEMON_0_SPAWN_EGG = register("demon_0_spawn_egg", properties -> new SpawnEggItem(properties.spawnEgg(HolyCrusadeModEntities.DEMON_0.get())));
		COIN = block(HolyCrusadeModBlocks.COIN);
		DEMON_2_SPAWN_EGG = register("demon_2_spawn_egg", properties -> new SpawnEggItem(properties.spawnEgg(HolyCrusadeModEntities.DEMON_2.get())));
		DEMON_3_SPAWN_EGG = register("demon_3_spawn_egg", properties -> new SpawnEggItem(properties.spawnEgg(HolyCrusadeModEntities.DEMON_3.get())));
		FIRE_EYE = register("fire_eye", FireEyeItem::new);
		TEMPLEMAN_SPAWN_EGG = register("templeman_spawn_egg", properties -> new SpawnEggItem(properties.spawnEgg(HolyCrusadeModEntities.TEMPLEMAN.get())));
	}

	// Start of user code block custom items
	// End of user code block custom items
	private static <I extends Item> DeferredItem<I> register(String name, Function<Item.Properties, ? extends I> supplier) {
		return REGISTRY.registerItem(name, supplier, Item.Properties::new);
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return block(block, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block, Item.Properties properties) {
		return REGISTRY.registerItem(block.getId().getPath(), prop -> new BlockItem(block.get(), prop), () -> properties);
	}
}