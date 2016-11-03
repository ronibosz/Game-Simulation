package com.bartoszroszko.minigame;

import java.util.Collections;
import java.util.List;

public class Permutations {

	 public static void calculateAllPermutations(List<Box> list, int numberOfboxes, BoxContentSumator sumator) {
	    	
	    	if (numberOfboxes == 1) {

	    		sumator.updateValues(list);
	            return;
	        }
	    	
	        for (int i = 0; i < numberOfboxes; i++) {
	        	
	            Collections.swap(list, i, numberOfboxes-1);
	            calculateAllPermutations(list, numberOfboxes-1, sumator);
	            Collections.swap(list, i, numberOfboxes-1);
	        }
	 }  
}
