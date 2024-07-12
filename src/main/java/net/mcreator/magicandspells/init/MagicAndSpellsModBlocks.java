
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.magicandspells.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.magicandspells.block.SpellTableBlockBlock;
import net.mcreator.magicandspells.MagicAndSpellsMod;

public class MagicAndSpellsModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, MagicAndSpellsMod.MODID);
	public static final RegistryObject<Block> SPELL_TABLE_BLOCK = REGISTRY.register("spell_table_block", () -> new SpellTableBlockBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
