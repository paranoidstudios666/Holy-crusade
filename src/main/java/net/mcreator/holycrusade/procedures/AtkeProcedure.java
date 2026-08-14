package net.mcreator.holycrusade.procedures;

import net.neoforged.neoforge.event.entity.living.LivingIncomingDamageEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;

import net.mcreator.holycrusade.entity.PutridPriestEntity;
import net.mcreator.holycrusade.entity.Demon0Entity;
import net.mcreator.holycrusade.entity.CorruptedTemplarEntity;
import net.mcreator.holycrusade.HolyCrusadeMod;

import javax.annotation.Nullable;

@EventBusSubscriber
public class AtkeProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingIncomingDamageEvent event) {
		if (event.getEntity() != null) {
			execute(event, event.getEntity().level(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getSource().getEntity());
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity sourceentity) {
		execute(null, world, x, y, z, sourceentity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity sourceentity) {
		if (sourceentity == null)
			return;
		if (sourceentity instanceof PutridPriestEntity) {
			if (Math.random() < 0.5) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("entity.blaze.shoot")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("entity.blaze.shoot")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
			} else {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("entity.blaze.shoot")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("entity.blaze.shoot")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
			}
			if ((sourceentity instanceof PutridPriestEntity _datEntI ? _datEntI.getEntityData().get(PutridPriestEntity.DATA_ter) : 0) == 0) {
				if (sourceentity instanceof PutridPriestEntity _datEntSetI)
					_datEntSetI.getEntityData().set(PutridPriestEntity.DATA_ter, 1);
				HolyCrusadeMod.queueServerWork(20, () -> {
					if (sourceentity instanceof PutridPriestEntity _datEntSetI)
						_datEntSetI.getEntityData().set(PutridPriestEntity.DATA_ter, 0);
				});
			} else {
				if (sourceentity instanceof PutridPriestEntity _datEntSetI)
					_datEntSetI.getEntityData().set(PutridPriestEntity.DATA_ter, 0);
				if (sourceentity instanceof PutridPriestEntity _datEntSetI)
					_datEntSetI.getEntityData().set(PutridPriestEntity.DATA_ter, 1);
			}
		}
		if (sourceentity instanceof CorruptedTemplarEntity) {
			if (Math.random() < 0.5) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("holy_crusade:atauqe_templari")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("holy_crusade:atauqe_templari")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
			} else {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("holy_crusade:atake_templari_1")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("holy_crusade:atake_templari_1")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
			}
			if ((sourceentity instanceof CorruptedTemplarEntity _datEntI ? _datEntI.getEntityData().get(CorruptedTemplarEntity.DATA_ter) : 0) == 0) {
				if (sourceentity instanceof CorruptedTemplarEntity _datEntSetI)
					_datEntSetI.getEntityData().set(CorruptedTemplarEntity.DATA_ter, 1);
				HolyCrusadeMod.queueServerWork(20, () -> {
					if (sourceentity instanceof CorruptedTemplarEntity _datEntSetI)
						_datEntSetI.getEntityData().set(CorruptedTemplarEntity.DATA_ter, 0);
				});
			} else {
				if (sourceentity instanceof CorruptedTemplarEntity _datEntSetI)
					_datEntSetI.getEntityData().set(CorruptedTemplarEntity.DATA_ter, 0);
				if (sourceentity instanceof CorruptedTemplarEntity _datEntSetI)
					_datEntSetI.getEntityData().set(CorruptedTemplarEntity.DATA_ter, 1);
			}
		}
		if (sourceentity instanceof CorruptedTemplarEntity) {
			if ((sourceentity instanceof Demon0Entity _datEntI ? _datEntI.getEntityData().get(Demon0Entity.DATA_er) : 0) == 0) {
				if (sourceentity instanceof Demon0Entity _datEntSetI)
					_datEntSetI.getEntityData().set(Demon0Entity.DATA_er, 1);
				HolyCrusadeMod.queueServerWork(20, () -> {
					if (sourceentity instanceof CorruptedTemplarEntity _datEntSetI)
						_datEntSetI.getEntityData().set(CorruptedTemplarEntity.DATA_ter, 0);
				});
			} else {
				if (sourceentity instanceof Demon0Entity _datEntSetI)
					_datEntSetI.getEntityData().set(Demon0Entity.DATA_er, 0);
				if (sourceentity instanceof Demon0Entity _datEntSetI)
					_datEntSetI.getEntityData().set(Demon0Entity.DATA_er, 1);
			}
		}
	}
}