package mint.mod.impl;

import mint.event.EventTarget;
import mint.event.impl.EventUpdate;
import mint.mod.Category;
import mint.mod.Mod;

public class ToggleSprint extends Mod {

	public ToggleSprint() {
		super("ToggleSprint", "Toggle your sprinting status!", Category.MISC);
	}
	
	@EventTarget
	public void onUpdate(EventUpdate event) {
		if (this.isEnabled() && mc.thePlayer.moveForward > 0 && !mc.thePlayer.isUsingItem() && !mc.thePlayer.isSneaking() && !mc.thePlayer.isCollidedHorizontally) {
			mc.thePlayer.setSprinting(true);
		}

	}
	
	@Override
	public void onDisable() {
		super.onDisable();
		
		mc.thePlayer.setSprinting(false);
	}

}
