/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.holycrusade.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.holycrusade.client.renderer.*;

@EventBusSubscriber(Dist.CLIENT)
public class HolyCrusadeModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(HolyCrusadeModEntities.TRIDENT_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(HolyCrusadeModEntities.BONES.get(), BonesRenderer::new);
		event.registerEntityRenderer(HolyCrusadeModEntities.PUTRID_PRIEST.get(), PutridPriestRenderer::new);
		event.registerEntityRenderer(HolyCrusadeModEntities.RAT.get(), RatRenderer::new);
		event.registerEntityRenderer(HolyCrusadeModEntities.CORRUPTED_TEMPLAR.get(), CorruptedTemplarRenderer::new);
		event.registerEntityRenderer(HolyCrusadeModEntities.SMOKE_PUTRID.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(HolyCrusadeModEntities.DEMON.get(), DemonRenderer::new);
		event.registerEntityRenderer(HolyCrusadeModEntities.USE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(HolyCrusadeModEntities.DEMON_0.get(), Demon0Renderer::new);
		event.registerEntityRenderer(HolyCrusadeModEntities.RAY.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(HolyCrusadeModEntities.DEMON_2.get(), Demon2Renderer::new);
		event.registerEntityRenderer(HolyCrusadeModEntities.DEMON_3.get(), Demon3Renderer::new);
		event.registerEntityRenderer(HolyCrusadeModEntities.TEMPLEMAN.get(), TemplemanRenderer::new);
		event.registerEntityRenderer(HolyCrusadeModEntities.FIREEYE_PROJECTILE.get(), FireeyeProjectileRenderer::new);
	}
}