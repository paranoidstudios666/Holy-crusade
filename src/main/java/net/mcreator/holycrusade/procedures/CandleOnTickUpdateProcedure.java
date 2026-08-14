package net.mcreator.holycrusade.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.particles.ParticleTypes;

public class CandleOnTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.addParticle(ParticleTypes.FLAME, (x + 0.5), (y + 1), (z + 0.5), 0, 0.05, 0);
	}
}