package com.bartoszroszko.minigame;

import java.util.*;

public class App {
	
    public static void main( String[] args ) {    	
    	
    	double averageReward;
    	
    	int additionalReward1 = 5;
    	int additionalReward2 = 10;
    	int additionalReward3 = 20;
    	
    	Box box1 = new CashBox(100);
    	Box box2 = new CashBox(20);
    	Box box3 = new CashBox(20);
    	Box box4 = new CashBox(5);
    	Box box5 = new CashBox(5);
    	Box box6 = new CashBox(5);
    	Box box7 = new CashBox(5);
    	Box box8 = new CashBox(5);
    	Box box9 = new ExtraLifeBox();
    	Box box10 = new GameOverBox();
    	Box box11 = new GameOverBox();
    	Box box12 = new GameOverBox();

    	List<Box> listOfBoxes = new ArrayList<>();
    	
    	listOfBoxes.add(box1);
    	listOfBoxes.add(box2);
     	listOfBoxes.add(box3);
    	listOfBoxes.add(box4);
    	listOfBoxes.add(box5);
    	listOfBoxes.add(box6);
    	listOfBoxes.add(box7);
    	listOfBoxes.add(box8);
    	listOfBoxes.add(box9);
    	listOfBoxes.add(box10);
     	listOfBoxes.add(box11);
     	listOfBoxes.add(box12);
    	
     	BoxContentSumator standardSumator = new BoxContentSumator(1);
     	BoxContentSumator secondChanceSumator = new BoxContentSumator(2);
     	
     	System.out.println("Processing, please wait...\n");
     	
    	Permutations.calculateAllPermutations(listOfBoxes, listOfBoxes.size(), standardSumator);
    	Permutations.calculateAllPermutations(listOfBoxes, listOfBoxes.size(), secondChanceSumator);
    	
    	averageReward = standardSumator.getAverageReward()*3/4 + secondChanceSumator.getAverageReward()/4
    					+ (additionalReward1 + additionalReward2 + additionalReward3)/3;
    	
    	System.out.println("Average reward: " + averageReward);
    }
}
