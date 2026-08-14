package net.mcreator.holycrusade.procedures;

import net.minecraft.world.level.LevelAccessor;

public class AnphoraBlockDestroyedByPlayerProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		Loots2Procedure.execute(world, x, y, z);
	}
}