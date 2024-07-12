
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.magicandspells.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.magicandspells.MagicAndSpellsMod;

public class MagicAndSpellsModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MagicAndSpellsMod.MODID);
	public static final RegistryObject<CreativeModeTab> MAGICAND_SPELLS_TAB = REGISTRY.register("magicand_spells_tab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.magic_and_spells.magicand_spells_tab")).icon(() -> new ItemStack(Items.ECHO_SHARD)).displayItems((parameters, tabData) -> {
				tabData.accept(MagicAndSpellsModItems.FIRE_BALL_SPELL.get());
				tabData.accept(MagicAndSpellsModItems.WATER_SPELL.get());
				tabData.accept(MagicAndSpellsModItems.ARCANE_SPELL.get());
				tabData.accept(MagicAndSpellsModBlocks.SPELL_TABLE_BLOCK.get().asItem());
				tabData.accept(MagicAndSpellsModItems.FIRE_GEM.get());
				tabData.accept(MagicAndSpellsModItems.RARE_ORB.get());
				tabData.accept(MagicAndSpellsModItems.BLUE_GEM.get());
				tabData.accept(MagicAndSpellsModItems.LIGHT_GEM.get());
			}).withSearchBar().build());
}
