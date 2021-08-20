package mint.hud.mod.impl;

import java.awt.Color;

import mint.hud.mod.HudMod;
import net.minecraft.client.gui.Gui;

public class FPSMod extends HudMod {
	
	public FPSMod() {
		super("FPS", 100, 100);
	}
	
	@Override
	public void draw() {
		//Gui.drawRect(getX() - 2, getY() - 2, getX() + getWidth(), getY() + getHeight(), new Color(0, 0, 0, 170).getRGB());
		fr.drawStringWithShadow("§8§l[§fFPS§f:§a " + mc.getDebugFPS() + "§8§l]", getX(), getY(), -1);
		super.draw();
	}
	
	@Override
	public void renderDummy(int mouseX, int mouseY) {
		fr.drawStringWithShadow("§8§l[§fFPS§f:§a " + mc.getDebugFPS() + "§8§l]", getX(), getY(), -1);
		
		
		super.renderDummy(mouseX, mouseY);
	}
	
	@Override
	public int getWidth() {
		return fr.getStringWidth("§8§l[§fFPS§f:§a " + mc.getDebugFPS() + "§8§l]");
	}
	
	@Override
	public int getHeight() {
		return fr.FONT_HEIGHT;
	}

}
