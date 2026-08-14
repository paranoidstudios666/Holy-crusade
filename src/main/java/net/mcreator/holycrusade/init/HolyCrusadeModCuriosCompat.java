package net.mcreator.holycrusade.init;

import top.theillusivec4.curios.api.type.capability.ICurio;
import top.theillusivec4.curios.api.SlotContext;
import top.theillusivec4.curios.api.CuriosCapability;

import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.capabilities.RegisterCapabilitiesEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;

import net.mcreator.holycrusade.procedures.SaintBloodBaubleWhileBaubleIsEquippedTickProcedure;
import net.mcreator.holycrusade.procedures.SacredBookWhileBaubleIsEquippedTickProcedure;

public class HolyCrusadeModCuriosCompat {
	public static void registerCapabilities(RegisterCapabilitiesEvent event) {
		event.registerItem(CuriosCapability.ITEM, (stack, context) -> new ICurio() {
			@Override
			public ItemStack getStack() {
				return stack;
			}

			@Override
			public SoundInfo getEquipSound(SlotContext slotContext) {
				return new SoundInfo(DeferredHolder.create(Registries.SOUND_EVENT, Identifier.parse("item.armor.equip_leather")).value(), 1, 1);
			}

			@Override
			public void curioTick(SlotContext slotContext) {
				SacredBookWhileBaubleIsEquippedTickProcedure.execute(slotContext.entity());
			}
		}, HolyCrusadeModItems.SACRED_BOOK_ITEM.get());
		event.registerItem(CuriosCapability.ITEM, (stack, context) -> new ICurio() {
			@Override
			public ItemStack getStack() {
				return stack;
			}
		}, HolyCrusadeModItems.THORNS_CROWN.get());
		event.registerItem(CuriosCapability.ITEM, (stack, context) -> new ICurio() {
			@Override
			public ItemStack getStack() {
				return stack;
			}

			@Override
			public void curioTick(SlotContext slotContext) {
				SaintBloodBaubleWhileBaubleIsEquippedTickProcedure.execute(slotContext.entity());
			}
		}, HolyCrusadeModItems.SAINT_BLOOD.get());
	}
}