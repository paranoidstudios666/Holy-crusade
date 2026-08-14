package net.mcreator.holycrusade.procedures;

import net.neoforged.neoforge.transfer.item.ItemUtil;
import net.neoforged.neoforge.transfer.item.ItemResource;
import net.neoforged.neoforge.transfer.ResourceHandler;
import net.neoforged.neoforge.event.entity.living.LivingIncomingDamageEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.ICancellableEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.holycrusade.init.HolyCrusadeModItems;
import net.mcreator.holycrusade.HolyCrusadeMod;

import javax.annotation.Nullable;

@EventBusSubscriber
public class TornscrowmuseProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingIncomingDamageEvent event) {
		if (event.getEntity() != null) {
			execute(event, event.getEntity().level(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity(), event.getAmount());
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, double amount) {
		execute(null, world, x, y, z, entity, amount);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity, double amount) {
		if (entity == null)
			return;
		double cantid = 0;
		if (entity instanceof Player player13) {
			ResourceHandler<ItemResource> inventory13 = HolyCrusadeMod.CuriosApiHelper.getCuriosInventory(player13);
			if (inventory13 != null) {
				for (int i = 0; i < inventory13.size(); i++) {
					ItemStack itemstackiterator = ItemUtil.getStack(inventory13, i);
					if (itemstackiterator.getItem() == HolyCrusadeModItems.THORNS_CROWN.get()) {
						if (!(entity instanceof Player _plrCldCheck2 && _plrCldCheck2.getCooldowns().isOnCooldown(new ItemStack(HolyCrusadeModItems.THORNS_CROWN.get())))) {
							for (Entity entityiterator : world.getEntities(entity, new AABB((x - 5), (y - 3), (z - 5), (x + 5), (y + 3), (z + 5)))) {
								if (!(entityiterator instanceof TamableAnimal _tamIsTamedBy3 && entity instanceof LivingEntity _livEnt3 && _tamIsTamedBy3.isOwnedBy(_livEnt3))) {
									cantid = cantid + 1;
								}
							}
							for (Entity entityiterator : world.getEntities(entity, new AABB((x - 5), (y - 3), (z - 5), (x + 5), (y + 3), (z + 5)))) {
								if (!(entityiterator instanceof TamableAnimal _tamIsTamedBy5 && entity instanceof LivingEntity _livEnt5 && _tamIsTamedBy5.isOwnedBy(_livEnt5))) {
									if (amount / cantid < 1) {
										{
											Entity _ent = entityiterator;
											if (_ent.level() instanceof ServerLevel _serverLevel) {
												_ent.hurtServer(_serverLevel, new DamageSource(world.holderOrThrow(DamageTypes.MAGIC)), 1);
											}
										}
									} else {
										{
											Entity _ent = entityiterator;
											if (_ent.level() instanceof ServerLevel _serverLevel) {
												_ent.hurtServer(_serverLevel, new DamageSource(world.holderOrThrow(DamageTypes.MAGIC)), (float) amount);
											}
										}
									}
								}
							}
							if (event instanceof ICancellableEvent _cancellable) {
								_cancellable.setCanceled(true);
							}
							if (entity instanceof Player _player)
								_player.getCooldowns().addCooldown(itemstackiterator, 400);
						}
					}
				}
			}
		}
	}
}