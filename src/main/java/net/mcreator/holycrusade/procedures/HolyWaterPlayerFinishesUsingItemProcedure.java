package net.mcreator.holycrusade.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;

public class HolyWaterPlayerFinishesUsingItemProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(MobEffects.WITHER)) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.WITHER) ? _livEnt.getEffect(MobEffects.WITHER).getDuration() : 0, 0, true, false));
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.WITHER);
		}
		if (entity instanceof LivingEntity _livEnt4 && _livEnt4.hasEffect(MobEffects.POISON)) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.POISON) ? _livEnt.getEffect(MobEffects.POISON).getDuration() : 0, 0, true, false));
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.POISON);
		}
		if (entity instanceof LivingEntity _livEnt8 && _livEnt8.hasEffect(MobEffects.HUNGER)) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.SATURATION, entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.HUNGER) ? _livEnt.getEffect(MobEffects.HUNGER).getDuration() : 0, 0, true, false));
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.HUNGER);
		}
		if (entity instanceof LivingEntity _livEnt12 && _livEnt12.hasEffect(MobEffects.BLINDNESS)) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.BLINDNESS) ? _livEnt.getEffect(MobEffects.BLINDNESS).getDuration() : 0, 0, true, false));
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.BLINDNESS);
		}
		if (entity instanceof LivingEntity _livEnt16 && _livEnt16.hasEffect(MobEffects.SLOWNESS)) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.SPEED, entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.SLOWNESS) ? _livEnt.getEffect(MobEffects.SLOWNESS).getDuration() : 0, 0, true, false));
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.SLOWNESS);
		}
		if (entity instanceof LivingEntity _livEnt20 && _livEnt20.hasEffect(MobEffects.WEAKNESS)) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.STRENGTH, entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.WEAKNESS) ? _livEnt.getEffect(MobEffects.WEAKNESS).getDuration() : 0, 0, true, false));
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.WEAKNESS);
		}
		if (entity instanceof LivingEntity _livEnt24 && _livEnt24.hasEffect(MobEffects.NAUSEA)) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.WATER_BREATHING, entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.NAUSEA) ? _livEnt.getEffect(MobEffects.NAUSEA).getDuration() : 0, 0, true, false));
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.NAUSEA);
		}
		if (entity instanceof LivingEntity _livEnt28 && _livEnt28.hasEffect(MobEffects.MINING_FATIGUE)) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.HASTE, entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.MINING_FATIGUE) ? _livEnt.getEffect(MobEffects.MINING_FATIGUE).getDuration() : 0, 0, true, false));
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.MINING_FATIGUE);
		}
		if (entity instanceof LivingEntity _livEnt32 && _livEnt32.hasEffect(MobEffects.MINING_FATIGUE)) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.ABSORPTION, entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.INFESTED) ? _livEnt.getEffect(MobEffects.INFESTED).getDuration() : 0, 0, true, false));
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.INFESTED);
		}
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("holy_crusade:energi")), SoundSource.VOICE, (float) 0.5, 1);
			} else {
				_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("holy_crusade:energi")), SoundSource.VOICE, (float) 0.5, 1, false);
			}
		}
	}
}