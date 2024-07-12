
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.magicandspells.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.magicandspells.item.WaterSpellItem;
import net.mcreator.magicandspells.item.RareOrbItem;
import net.mcreator.magicandspells.item.LightGemItem;
import net.mcreator.magicandspells.item.FireGemItem;
import net.mcreator.magicandspells.item.FireBallSpellItem;
import net.mcreator.magicandspells.item.BlueGemItem;
import net.mcreator.magicandspells.item.ArcaneSpellItem;
import net.mcreator.magicandspells.MagicAndSpellsMod;

public class MagicAndSpellsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MagicAndSpellsMod.MODID);
	public static final RegistryObject<Item> FIRE_BALL_SPELL = REGISTRY.register("fire_ball_spell", () -> new FireBallSpellItem());
	public static final RegistryObject<Item> WATER_SPELL = REGISTRY.register("water_spell", () -> new WaterSpellItem());
	public static final RegistryObject<Item> ARCANE_SPELL = REGISTRY.register("arcane_spell", () -> new ArcaneSpellItem());
	public static final RegistryObject<Item> SPELL_TABLE_BLOCK = block(MagicAndSpellsModBlocks.SPELL_TABLE_BLOCK);
	public static final RegistryObject<Item> FIRE_GEM = REGISTRY.register("fire_gem", () -> new FireGemItem());
	public static final RegistryObject<Item> RARE_ORB = REGISTRY.register("rare_orb", () -> new RareOrbItem());
	public static final RegistryObject<Item> BLUE_GEM = REGISTRY.register("blue_gem", () -> new BlueGemItem());
	public static final RegistryObject<Item> LIGHT_GEM = REGISTRY.register("light_gem", () -> new LightGemItem());

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
