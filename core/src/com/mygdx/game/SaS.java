package com.mygdx.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Screen;

import Screens.*;

public class SaS extends Game {

	@Override
	public void create() {
		System.out.println("SaS");
		this.setScreen(new GameScreen(this));
	}
	
	public void render() {
		super.render();
    }

    public void dispose() {
    	
    }
}
