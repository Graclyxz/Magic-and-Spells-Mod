
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.magicandspells.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.magicandspells.entity.WaterProjectilEntity;
import net.mcreator.magicandspells.entity.FireBallProjectilEntity;
import net.mcreator.magicandspells.entity.ArcaneProjectilEntity;
import net.mcreator.magicandspells.MagicAndSpellsMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MagicAndSpellsModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, MagicAndSpellsMod.MODID);
	public static final RegistryObject<EntityType<FireBallProjectilEntity>> FIRE_BALL_PROJECTIL = register("fire_ball_projectil", EntityType.Builder.<FireBallProjectilEntity>of(FireBallProjectilEntity::new, MobCategory.MISC)
			.setCustomClientFactory(FireBallProjectilEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<WaterProjectilEntity>> WATER_PROJECTIL = register("water_projectil",
			EntityType.Builder.<WaterProjectilEntity>of(WaterProjectilEntity::new, MobCategory.MISC).setCustomClientFactory(WaterProjectilEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<ArcaneProjectilEntity>> ARCANE_PROJECTIL = register("arcane_projectil", EntityType.Builder.<ArcaneProjectilEntity>of(ArcaneProjectilEntity::new, MobCategory.MISC)
			.setCustomClientFactory(ArcaneProjectilEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}
}
