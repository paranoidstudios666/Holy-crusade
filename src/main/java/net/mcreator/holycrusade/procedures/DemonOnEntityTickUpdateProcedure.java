package net.mcreator.holycrusade.procedures;

import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.Identifier;
import net.minecraft.core.BlockPos;

public class DemonOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (!entity.level().isClientSide())
			entity.discard();
		if (world instanceof ServerLevel _serverworld) {
			StructureTemplate template = _serverworld.getStructureManager().getOrCreate(Identifier.fromNamespaceAndPath("holy_crusade", "igleia"));
			if (template != null) {
				template.placeInWorld(_serverworld, BlockPos.containing(x - 10, y - 1, z - 10), BlockPos.containing(x - 10, y - 1, z - 10), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
						_serverworld.getRandom(), 3);
			}
		}
		if (world instanceof ServerLevel _serverworld) {
			StructureTemplate template = _serverworld.getStructureManager().getOrCreate(Identifier.fromNamespaceAndPath("holy_crusade", "catacumbs"));
			if (template != null) {
				template.placeInWorld(_serverworld, BlockPos.containing(x - 11, y - 33, z - 9), BlockPos.containing(x - 11, y - 33, z - 9), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
						_serverworld.getRandom(), 3);
			}
		}
	}
}