package net.mcreator.magicandspells.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.magicandspells.world.inventory.SpellTableMenu;
import net.mcreator.magicandspells.network.SpellTableButtonMessage;
import net.mcreator.magicandspells.MagicAndSpellsMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class SpellTableScreen extends AbstractContainerScreen<SpellTableMenu> {
	private final static HashMap<String, Object> guistate = SpellTableMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_create;

	public SpellTableScreen(SpellTableMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("magic_and_spells:textures/screens/spell_table.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(new ResourceLocation("magic_and_spells:textures/screens/crosstexture.png"), this.leftPos + 48, this.topPos + 32, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("magic_and_spells:textures/screens/arrowtexture.png"), this.leftPos + 101, this.topPos + 32, 0, 0, 16, 16, 16, 16);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.magic_and_spells.spell_table.label_spell_table"), 53, 10, -10092544, false);
	}

	@Override
	public void init() {
		super.init();
		button_create = Button.builder(Component.translatable("gui.magic_and_spells.spell_table.button_create"), e -> {
			if (true) {
				MagicAndSpellsMod.PACKET_HANDLER.sendToServer(new SpellTableButtonMessage(0, x, y, z));
				SpellTableButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 82, this.topPos + 55, 56, 20).build();
		guistate.put("button:button_create", button_create);
		this.addRenderableWidget(button_create);
	}
}
