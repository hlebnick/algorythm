package com.hlebnick;

public class SortAlgorythmsCompare {
	
	public static void main(String[] args) {
		double[] inputArray = SortingUtil.getRandomArray(100000);
		
		long startTime = System.currentTimeMillis();
		double[] insertionSortResult = InsertionSort.sort(inputArray);
		long endTime = System.currentTimeMillis();
		System.out.println("Insertion sort time: " + (endTime - startTime));
		
		startTime = System.currentTimeMillis();
		double[] shellSortResult = ShellSort.sort(inputArray);
		endTime = System.currentTimeMillis();
		System.out.println("Shell sort time: " + (endTime - startTime));
	}
}
