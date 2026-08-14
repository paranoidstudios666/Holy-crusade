package net.mcreator.holycrusade.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;

public class Demon0OnEntityTickUpdateProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (!(entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(MobEffects.UNLUCK))) {
			if (Math.random() < 0.1) {
				if (!entity.level().isClientSide())
					entity.discard();
			}
		}
	}
}