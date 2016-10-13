package com.mygdx.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.mygdx.game.SaS;

public class DesktopLauncher {
	public static void main (String[] arg) {
		//TODO Read the properties file
		
		//Set the application configuration
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width = 800;
		config.height = 600;
		
		//Star the Desktop game
		new LwjglApplication(new SaS(), config);
	}
}
