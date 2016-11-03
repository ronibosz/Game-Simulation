package com.bartoszroszko.minigame;

import java.util.List;

public class BoxContentSumator {

	private double totalValue = 0;
	private double permutationCounter = 0;
	private int numberOfLives;
	
	public BoxContentSumator(int initialNumberOfLives) {
		numberOfLives = initialNumberOfLives;
	}
	
	public double getTotalValue() {	
		return totalValue;
	}
	
	public double getPermutationCounter() {
		return permutationCounter;
	}
	
	public void updateValues(List<Box> currentPermutation) {
		
		permutationCounter++;
        int life = numberOfLives;
        int i = 0;
        
        while (i<currentPermutation.size() && life>0) {
        	
        	totalValue += currentPermutation.get(i).getValue();
        	life += currentPermutation.get(i).getLifeUpdater();
        	i++;
        }
	}
	
	public double getAverageReward() {
		return totalValue/permutationCounter;
	}
}
