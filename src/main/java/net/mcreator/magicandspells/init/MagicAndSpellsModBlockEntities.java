
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.magicandspells.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.magicandspells.block.entity.SpellTableBlockBlockEntity;
import net.mcreator.magicandspells.MagicAndSpellsMod;

public class MagicAndSpellsModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, MagicAndSpellsMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> SPELL_TABLE_BLOCK = register("spell_table_block", MagicAndSpellsModBlocks.SPELL_TABLE_BLOCK, SpellTableBlockBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
