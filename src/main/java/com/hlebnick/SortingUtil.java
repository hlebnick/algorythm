package com.hlebnick;

import java.util.Random;

public class SortingUtil {
	
	public static double[] getRandomArray(int size) {
		double randomArray[] = new double[size];
		Random random = new Random();
		
		for (int i = 0; i < size; i++) {
			randomArray[i] = random.nextDouble();
		}
		return randomArray;
	}
	
	public static boolean isSorted(double[] array) {
		for (int i = 0; i < array.length; i++) {
			if (i != array.length - 1 && array[i] >= array[i+1]) {
				return false;
			}
		}
		return true;
	}
}
