package algorythms;

import org.junit.Test;

import com.hlebnick.SelectionSort;
import com.hlebnick.SortingUtil;

public class SortingAlgorythmsTest {

	@Test
	public void selectionSortTest() {
		double[] inputArray = SortingUtil.getRandomArray(100);
		double[] resultArray = SelectionSort.sort(inputArray);
		System.out.println("Is sorted: " + SortingUtil.isSorted(resultArray));
	}
}
