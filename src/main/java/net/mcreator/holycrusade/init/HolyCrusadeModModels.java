/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.holycrusade.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.holycrusade.client.model.*;

@EventBusSubscriber(Dist.CLIENT)
public class HolyCrusadeModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelpriests.LAYER_LOCATION, Modelpriests::createBodyLayer);
		event.registerLayerDefinition(Modelimp.LAYER_LOCATION, Modelimp::createBodyLayer);
		event.registerLayerDefinition(Modelojito.LAYER_LOCATION, Modelojito::createBodyLayer);
		event.registerLayerDefinition(Modelratalien_Converted.LAYER_LOCATION, Modelratalien_Converted::createBodyLayer);
		event.registerLayerDefinition(Modeldemon.LAYER_LOCATION, Modeldemon::createBodyLayer);
		event.registerLayerDefinition(Modelojaso.LAYER_LOCATION, Modelojaso::createBodyLayer);
		event.registerLayerDefinition(Modelbones.LAYER_LOCATION, Modelbones::createBodyLayer);
		event.registerLayerDefinition(Modeltemokarr.LAYER_LOCATION, Modeltemokarr::createBodyLayer);
	}
}