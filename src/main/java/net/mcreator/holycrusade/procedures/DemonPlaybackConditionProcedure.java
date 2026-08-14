package net.mcreator.holycrusade.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.holycrusade.entity.Demon0Entity;

public class DemonPlaybackConditionProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity instanceof Demon0Entity _datEntI ? _datEntI.getEntityData().get(Demon0Entity.DATA_er) : 0) == 0) {
			return true;
		}
		return false;
	}
}