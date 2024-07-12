
package net.mcreator.magicandspells.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class LightGemItem extends Item {
	public LightGemItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
