package mint.hud.mod.impl;

import java.awt.Color;

import mint.hud.mod.HudMod;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.inventory.GuiInventory;
import net.minecraft.entity.EntityLivingBase;

public class TargetHUD extends HudMod {
	
	EntityLivingBase target = (EntityLivingBase) mc.pointedEntity;
	
	public TargetHUD() {
		super("TargetHUD", 150, 150);
	}
	
	@Override
	public void draw() {
		renderTargetHud();
	  
		super.draw();
	}
	
	@Override
	public void renderDummy(int mouseX, int mouseY) {
		
		fr.drawStringWithShadow(mc.thePlayer.getName(), getX() + 2, getY() + 2, -1);
		fr.drawStringWithShadow((int) mc.thePlayer.getHealth() + "§a20 §c\u2764§r", getX() + 2, getY() + 2 + fr.FONT_HEIGHT, -1);
		GuiInventory.drawEntityOnScreen(getX() + fr.getStringWidth(mc.thePlayer.getName()) + 25, getY() + 30, 20, 50, 0, mc.thePlayer);
		
		
		super.renderDummy(mouseX, mouseY);
	}
	
	@Override
	public int getWidth() {
		return 75;
	}
	
	@Override
	public int getHeight() {
		return fr.FONT_HEIGHT * 4 + 4;
	}
	
	private void renderTargetHud() {
		target = (EntityLivingBase) mc.pointedEntity;
		
		if (target == null) {
			fr.drawStringWithShadow(mc.thePlayer.getName(), getX() + 2, getY() + 2, -1);
			fr.drawStringWithShadow("§a20 §c\u2764§r", getX() + 2, getY() + 2 + fr.FONT_HEIGHT, -1);
			GuiInventory.drawEntityOnScreen(getX() + fr.getStringWidth(mc.thePlayer.getName()) + 25, getY() + 30, 20, 50, 0, mc.thePlayer);
			
		} else {
			fr.drawStringWithShadow("§a["+"§f" + target.getName() + "§a]", getX() + 2, getY() + 2, -1);
			fr.drawStringWithShadow("§a" + (int) target.getHealth() + " §c\u2764§r", getX() + 2, getY() + 2 + fr.FONT_HEIGHT, -1);
			GuiInventory.drawEntityOnScreen(getX() + fr.getStringWidth(target.getName()) + 30, getY() + 30, 20, 50, 0, target);
		
		}
		
	}

}
