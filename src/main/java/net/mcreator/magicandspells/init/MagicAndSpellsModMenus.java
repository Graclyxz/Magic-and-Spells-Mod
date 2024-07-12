
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.magicandspells.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.magicandspells.world.inventory.SpellTableMenu;
import net.mcreator.magicandspells.MagicAndSpellsMod;

public class MagicAndSpellsModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, MagicAndSpellsMod.MODID);
	public static final RegistryObject<MenuType<SpellTableMenu>> SPELL_TABLE = REGISTRY.register("spell_table", () -> IForgeMenuType.create(SpellTableMenu::new));
}
