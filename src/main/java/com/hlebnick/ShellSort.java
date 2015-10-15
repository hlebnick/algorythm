package com.hlebnick;

public class ShellSort {

	public static double[] sort(double[] inputArray) {
		int width = 1;
		while (width < inputArray.length / 3) {
			width = width * 3 + 1;	//1, 4, 13, 40, 121, 364, 1093...
		}
		while (width >= 1) {
			for (int i = width; i < inputArray.length; i++) {
				for (int j = i; j >= width && inputArray[j] < inputArray[j - width]; j -= width) {
					double temp = inputArray[j];
					inputArray[j] = inputArray[j - width];
					inputArray[j - width] = temp;
				}
			}
			width = width / 3;
		}
		return inputArray;
	}
}
