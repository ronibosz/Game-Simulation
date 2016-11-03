package com.bartoszroszko.minigame;

public class CashBox implements Box {
	
	private int value;
	
	public CashBox(int value) {
		this.value = value;
	}

	@Override
	public int getValue() {
		return value;
	}

	@Override
	public int getLifeUpdater() {		
		return 0;
	}
}
