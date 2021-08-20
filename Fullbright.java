package mint.mod.impl;

import mint.event.EventTarget;
import mint.event.impl.EventUpdate;
import mint.mod.Category;
import mint.mod.Mod;

public class FullBright extends Mod {

	public FullBright() {
		super("FullBright", "Change game brightness with the push of a button!", Category.MISC);
	}
	
	@EventTarget
	public void onUpdate(EventUpdate event) {
		if (this.isEnabled()) {
			mc.gameSettings.gammaSetting = 100;
		}

	}
	
	@Override
	public void onDisable() {
		super.onDisable();
		
		mc.gameSettings.gammaSetting = 0;
	}

}
