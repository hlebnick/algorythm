package com.hlebnick;

public class InsertionSort {
	
	public static double[] sort(double[] inputArray) {
		for (int i = 1; i < inputArray.length; i++) {
			for (int j = i; 
					j > 0 && inputArray[j] < inputArray[j - 1];
					j--) {
				double temp = inputArray[i];
				inputArray[i] = inputArray[j];
				inputArray[j - 1] = temp;
			}
		}
		return inputArray;
	}
}
