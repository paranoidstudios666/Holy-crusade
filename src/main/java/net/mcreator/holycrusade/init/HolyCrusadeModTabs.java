/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.holycrusade.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.holycrusade.HolyCrusadeMod;

@EventBusSubscriber
public class HolyCrusadeModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, HolyCrusadeMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> HOLY_CRUSADE = REGISTRY.register("holy_crusade",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.holy_crusade.holy_crusade")).icon(() -> new ItemStack(HolyCrusadeModItems.CHALICE_OF_CHRIST.get())).displayItems((parameters, tabData) -> {
				tabData.accept(HolyCrusadeModBlocks.CRACKED_OLD_STONE_TILE.get().asItem());
				tabData.accept(HolyCrusadeModBlocks.OLD_STONE_TILE.get().asItem());
				tabData.accept(HolyCrusadeModBlocks.OLD_STONE_TILE_STAIRS.get().asItem());
				tabData.accept(HolyCrusadeModBlocks.OLD_STONE_TILE_SLAB.get().asItem());
				tabData.accept(HolyCrusadeModBlocks.OLD_STONE_TILE_WALL.get().asItem());
				tabData.accept(HolyCrusadeModBlocks.OLD_STONE_TILES.get().asItem());
				tabData.accept(HolyCrusadeModBlocks.OLD_STONE_BRICKS.get().asItem());
				tabData.accept(HolyCrusadeModBlocks.OLDSTONE_BRICK_STAIRS.get().asItem());
				tabData.accept(HolyCrusadeModBlocks.OLD_STONE_BRICKS_SLAB.get().asItem());
				tabData.accept(HolyCrusadeModBlocks.OLD_STONE_BRICK_WALL.get().asItem());
				tabData.accept(HolyCrusadeModBlocks.CHISELED_OLD_STONE.get().asItem());
				tabData.accept(HolyCrusadeModBlocks.SKULL_PILE.get().asItem());
				tabData.accept(HolyCrusadeModBlocks.IRON_WINDOW.get().asItem());
				tabData.accept(HolyCrusadeModBlocks.CANDLE.get().asItem());
				tabData.accept(HolyCrusadeModBlocks.COIN.get().asItem());
				tabData.accept(HolyCrusadeModBlocks.OLD_BOWL.get().asItem());
				tabData.accept(HolyCrusadeModBlocks.OLD_JAR.get().asItem());
				tabData.accept(HolyCrusadeModBlocks.ANPHORA.get().asItem());
				tabData.accept(HolyCrusadeModBlocks.OLD_CHEST.get().asItem());
				tabData.accept(HolyCrusadeModItems.OLD_KEY.get());
				tabData.accept(HolyCrusadeModItems.VERACRUX_FRAGMENT.get());
				tabData.accept(HolyCrusadeModItems.COMMUNION_WAFER.get());
				tabData.accept(HolyCrusadeModItems.WINE.get());
				tabData.accept(HolyCrusadeModItems.HOLY_WATER.get());
				tabData.accept(HolyCrusadeModItems.TEMPLAR_SWORD.get());
				tabData.accept(HolyCrusadeModItems.SAINT_SHIELD.get());
				tabData.accept(HolyCrusadeModItems.CHALICE_OF_CHRIST.get());
				tabData.accept(HolyCrusadeModItems.GOLD_CROSS.get());
				tabData.accept(HolyCrusadeModItems.ROSARY.get());
				tabData.accept(HolyCrusadeModItems.SACRED_BOOK_ITEM.get());
				tabData.accept(HolyCrusadeModItems.THORNS_CROWN.get());
				tabData.accept(HolyCrusadeModItems.SAINT_BLOOD.get());
				tabData.accept(HolyCrusadeModItems.RAT_SPAWN_EGG.get());
				tabData.accept(HolyCrusadeModItems.BONES_SPAWN_EGG.get());
				tabData.accept(HolyCrusadeModItems.PUTRID_PRIEST_SPAWN_EGG.get());
				tabData.accept(HolyCrusadeModItems.CORRUPTED_TEMPLAR_SPAWN_EGG.get());
				tabData.accept(HolyCrusadeModBlocks.DEMON_STONE_TILES.get().asItem());
				tabData.accept(HolyCrusadeModBlocks.DEMON_STONE_STAIRS.get().asItem());
				tabData.accept(HolyCrusadeModBlocks.DEMON_STONE_SAB.get().asItem());
				tabData.accept(HolyCrusadeModBlocks.DEMON_STONE_WALL.get().asItem());
				tabData.accept(HolyCrusadeModBlocks.DEMON_STONE_BRICKS.get().asItem());
				tabData.accept(HolyCrusadeModBlocks.CHISELED_DEMON_STONE.get().asItem());
				tabData.accept(HolyCrusadeModBlocks.DEMON_STONE_SIGIL.get().asItem());
				tabData.accept(HolyCrusadeModBlocks.DEMONIC_JAR.get().asItem());
				tabData.accept(HolyCrusadeModItems.HELL_PEPPER.get());
				tabData.accept(HolyCrusadeModItems.FIRE_EYE.get());
				tabData.accept(HolyCrusadeModItems.TRIDENT.get());
				tabData.accept(HolyCrusadeModItems.PORTABLE_PORTAL.get());
				tabData.accept(HolyCrusadeModItems.ARHAMEL_RING.get());
				tabData.accept(HolyCrusadeModItems.BIHRAIL_RING.get());
				tabData.accept(HolyCrusadeModItems.ARAMIEL_RING.get());
				tabData.accept(HolyCrusadeModItems.DEMON_0_SPAWN_EGG.get());
				tabData.accept(HolyCrusadeModItems.DEMON_2_SPAWN_EGG.get());
				tabData.accept(HolyCrusadeModItems.DEMON_3_SPAWN_EGG.get());
			}).build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(HolyCrusadeModItems.BONES_SPAWN_EGG.get());
			tabData.accept(HolyCrusadeModItems.PUTRID_PRIEST_SPAWN_EGG.get());
			tabData.accept(HolyCrusadeModItems.RAT_SPAWN_EGG.get());
			tabData.accept(HolyCrusadeModItems.CORRUPTED_TEMPLAR_SPAWN_EGG.get());
			tabData.accept(HolyCrusadeModItems.DEMON_0_SPAWN_EGG.get());
			tabData.accept(HolyCrusadeModItems.DEMON_2_SPAWN_EGG.get());
			tabData.accept(HolyCrusadeModItems.DEMON_3_SPAWN_EGG.get());
		}
	}
}