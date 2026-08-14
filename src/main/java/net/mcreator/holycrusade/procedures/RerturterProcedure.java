package net.mcreator.holycrusade.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.holycrusade.entity.PutridPriestEntity;

public class RerturterProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity instanceof PutridPriestEntity _datEntI ? _datEntI.getEntityData().get(PutridPriestEntity.DATA_ter) : 0) == 1) {
			return true;
		}
		return false;
	}
}