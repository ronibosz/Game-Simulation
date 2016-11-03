package com.bartoszroszko.minigame;

public class ExtraLifeBox implements Box {
	
	public ExtraLifeBox() {
	}

	@Override
	public int getValue() {
		return 0;
	}

	@Override
	public int getLifeUpdater() {
		return 1;
	}
}
