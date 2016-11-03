package com.bartoszroszko.minigame;

public class GameOverBox implements Box {
	
	public GameOverBox() {
	}

	@Override
	public int getValue() {
		return 0;
	}

	@Override
	public int getLifeUpdater() {
		return -1;
	}
}
