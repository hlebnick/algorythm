package com.hlebnick;

public class SelectionSort {
	
	public static double[] sort(double[] inputArray) {
		for (int i = 0; i < inputArray.length; i++) {
			int min = i;
			for (int j = i + 1; j < inputArray.length; j++) {
				if (inputArray[j] < inputArray[min]) {
					min = j;
				}
			}
			Double temp = inputArray[i];
			inputArray[i] = inputArray[min];
			inputArray[min] = temp;
		}
		
		return inputArray;
	}
}
