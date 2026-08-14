package net.mcreator.holycrusade.procedures;

import net.minecraft.world.level.LevelAccessor;

public class OldJarBlockDestroyedByPlayerProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		LootsProcedure.execute(world, x, y, z);
	}
}