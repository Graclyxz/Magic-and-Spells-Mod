
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.magicandspells.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class MagicAndSpellsModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(MagicAndSpellsModEntities.FIRE_BALL_PROJECTIL.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(MagicAndSpellsModEntities.WATER_PROJECTIL.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(MagicAndSpellsModEntities.ARCANE_PROJECTIL.get(), ThrownItemRenderer::new);
	}
}
