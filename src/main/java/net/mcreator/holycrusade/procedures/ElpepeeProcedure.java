package net.mcreator.holycrusade.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.network.chat.Component;

public class ElpepeeProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getDoubleOr("car", 0) > 0) {
			if (entity.getPersistentData().getDoubleOr("car", 0) < 70) {
				entity.getPersistentData().putDouble("car", (entity.getPersistentData().getDoubleOr("car", 0) + 1));
			}
		}
		if (entity instanceof ServerPlayer _player)
			_player.sendSystemMessage(Component.literal(("Charge:" + entity.getPersistentData().getDoubleOr("car", 0) + "/70")), true);
	}
}