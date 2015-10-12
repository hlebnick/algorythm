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
		
		System.out.println("Is sorted: " + isSorted(inputArray));
	}
	
	public static boolean isSorted(Double[] array) {
		return false;
	}
}
