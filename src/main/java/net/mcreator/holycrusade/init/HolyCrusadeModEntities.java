/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.holycrusade.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.entity.RegisterSpawnPlacementsEvent;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;

import net.mcreator.holycrusade.entity.*;
import net.mcreator.holycrusade.HolyCrusadeMod;

@EventBusSubscriber
public class HolyCrusadeModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(Registries.ENTITY_TYPE, HolyCrusadeMod.MODID);
	public static final DeferredHolder<EntityType<?>, EntityType<TridentProjectileEntity>> TRIDENT_PROJECTILE = register("trident_projectile",
			EntityType.Builder.<TridentProjectileEntity>of(TridentProjectileEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<BonesEntity>> BONES = register("bones",
			EntityType.Builder.<BonesEntity>of(BonesEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.notInPeaceful().sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<PutridPriestEntity>> PUTRID_PRIEST = register("putrid_priest",
			EntityType.Builder.<PutridPriestEntity>of(PutridPriestEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.notInPeaceful().sized(0.8f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<RatEntity>> RAT = register("rat", EntityType.Builder.<RatEntity>of(RatEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

			.sized(0.3f, 0.2f));
	public static final DeferredHolder<EntityType<?>, EntityType<CorruptedTemplarEntity>> CORRUPTED_TEMPLAR = register("corrupted_templar",
			EntityType.Builder.<CorruptedTemplarEntity>of(CorruptedTemplarEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.notInPeaceful().sized(0.8f, 1.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<SmokePutridEntity>> SMOKE_PUTRID = register("smoke_putrid",
			EntityType.Builder.<SmokePutridEntity>of(SmokePutridEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.3f, 0.4f));
	public static final DeferredHolder<EntityType<?>, EntityType<DemonEntity>> DEMON = register("demon",
			EntityType.Builder.<DemonEntity>of(DemonEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune()

					.notInPeaceful().sized(0.7f, 1.2f));
	public static final DeferredHolder<EntityType<?>, EntityType<UseEntity>> USE = register("use",
			EntityType.Builder.<UseEntity>of(UseEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.3f, 0.4f));
	public static final DeferredHolder<EntityType<?>, EntityType<Demon0Entity>> DEMON_0 = register("demon_0",
			EntityType.Builder.<Demon0Entity>of(Demon0Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune()

					.notInPeaceful().sized(0.8f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<RayEntity>> RAY = register("ray",
			EntityType.Builder.<RayEntity>of(RayEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.3f, 0.4f));
	public static final DeferredHolder<EntityType<?>, EntityType<Demon2Entity>> DEMON_2 = register("demon_2",
			EntityType.Builder.<Demon2Entity>of(Demon2Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune()

					.notInPeaceful().sized(0.4f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<Demon3Entity>> DEMON_3 = register("demon_3",
			EntityType.Builder.<Demon3Entity>of(Demon3Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune()

					.notInPeaceful().sized(0.8f, 0.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<TemplemanEntity>> TEMPLEMAN = register("templeman",
			EntityType.Builder.<TemplemanEntity>of(TemplemanEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune()

					.notInPeaceful().sized(0.7f, 1.2f));
	public static final DeferredHolder<EntityType<?>, EntityType<FireeyeProjectileEntity>> FIREEYE_PROJECTILE = register("fireeye_projectile",
			EntityType.Builder.<FireeyeProjectileEntity>of(FireeyeProjectileEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));

	// Start of user code block custom entities
	// End of user code block custom entities
	private static <T extends Entity> DeferredHolder<EntityType<?>, EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(ResourceKey.create(Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(HolyCrusadeMod.MODID, registryname))));
	}

	@SubscribeEvent
	public static void init(RegisterSpawnPlacementsEvent event) {
		BonesEntity.init(event);
		PutridPriestEntity.init(event);
		RatEntity.init(event);
		CorruptedTemplarEntity.init(event);
		DemonEntity.init(event);
		Demon0Entity.init(event);
		Demon2Entity.init(event);
		Demon3Entity.init(event);
		TemplemanEntity.init(event);
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(BONES.get(), BonesEntity.createAttributes().build());
		event.put(PUTRID_PRIEST.get(), PutridPriestEntity.createAttributes().build());
		event.put(RAT.get(), RatEntity.createAttributes().build());
		event.put(CORRUPTED_TEMPLAR.get(), CorruptedTemplarEntity.createAttributes().build());
		event.put(DEMON.get(), DemonEntity.createAttributes().build());
		event.put(DEMON_0.get(), Demon0Entity.createAttributes().build());
		event.put(DEMON_2.get(), Demon2Entity.createAttributes().build());
		event.put(DEMON_3.get(), Demon3Entity.createAttributes().build());
		event.put(TEMPLEMAN.get(), TemplemanEntity.createAttributes().build());
	}
}