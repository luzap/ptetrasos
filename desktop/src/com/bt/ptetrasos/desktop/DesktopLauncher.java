package com.bt.ptetrasos.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.bt.ptetrasos.Constants;
import com.bt.ptetrasos.PTMain;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "PTetrasos";
		config.height = Constants.HEIGHT;
		config.width = Constants.WIDTH;
		new LwjglApplication(new PTMain(), config);
	}
}
