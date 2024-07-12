package net.mcreator.magicandspells.procedures;

import net.minecraft.world.entity.Entity;

public class FireBallSpellAlEntidadSerGolpeadaConElObjetoProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.setSecondsOnFire(2);
	}
}
