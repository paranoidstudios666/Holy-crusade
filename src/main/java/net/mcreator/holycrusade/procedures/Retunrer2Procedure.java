package net.mcreator.holycrusade.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.holycrusade.entity.CorruptedTemplarEntity;

public class Retunrer2Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity instanceof CorruptedTemplarEntity _datEntI ? _datEntI.getEntityData().get(CorruptedTemplarEntity.DATA_ter) : 0) == 1) {
			return true;
		}
		return false;
	}
}