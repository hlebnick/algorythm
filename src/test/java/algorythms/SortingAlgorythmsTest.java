package algorythms;

import org.junit.Assert;
import org.junit.Test;

import com.hlebnick.InsertionSort;
import com.hlebnick.SelectionSort;
import com.hlebnick.SortingUtil;

public class SortingAlgorythmsTest {

	@Test
	public void selectionSortTest() {
		double[] inputArray = SortingUtil.getRandomArray(100);
		double[] resultArray = SelectionSort.sort(inputArray);
		Assert.assertTrue(SortingUtil.isSorted(resultArray));
	}
	
	@Test
	public void insertionSortTest() {
		double[] inputArray = SortingUtil.getRandomArray(100);
		double[] resultArray = InsertionSort.sort(inputArray);
		Assert.assertTrue(SortingUtil.isSorted(resultArray));
	}
	
	private void printArray(double[] array) {
		StringBuilder sb = new StringBuilder("");
		for (int i = 0; i < array.length; i++) {
			sb.append(" ").append(array[i]);
		}
		System.out.println(sb);
	}
}
