package com.hlebnick;

import java.util.Random;

public class TestClass {
	
	private static final int SIZE = 100;
	
	public static void main(String[] args) {
		Double inputArray[] = new Double[SIZE];
		Random random = new Random();
		
		for (int i = 0; i < SIZE; i++) {
			inputArray[i] = random.nextDouble();
		}
		System.out.println(inputArray.length);
		
		Double[] resultArray = SelectionSort.sort(inputArray);
		
		System.out.println("Is sorted: " + isSorted(resultArray));
	}
	
	public static boolean isSorted(Double[] array) {
		for (int i = 0; i < array.length; i++) {
			if (i != array.length - 1 && array[i] > array[i+1]) {
				return false;
			}
		}
		return true;
	}
}
