package net.mcreator.holycrusade.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

public class TridentProjectileWhileProjectileFlyingTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity immediatesourceentity) {
		if (entity == null || immediatesourceentity == null)
			return;
		if (immediatesourceentity.getPersistentData().getDoubleOr("tri", 0) == 0) {
			Atakee2Procedure.execute(world, x, y, z, entity);
			immediatesourceentity.getPersistentData().putDouble("tri", 1);
		}
	}
}