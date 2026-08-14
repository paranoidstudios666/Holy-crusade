package net.mcreator.holycrusade.procedures;

import net.minecraft.world.entity.Entity;

public class DemonStoneSigilEntityWalksOnTheBlockProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.igniteForSeconds(30);
	}
}