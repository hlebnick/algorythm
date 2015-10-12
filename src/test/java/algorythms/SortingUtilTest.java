package algorythms;


import org.junit.Assert;
import org.junit.Test;

import com.hlebnick.SortingUtil;

public class SortingUtilTest {
	
	@Test
	public void isSortedTest() {
		double[] inputArray = new double[] {0, 1, 2};
		Assert.assertTrue(SortingUtil.isSorted(inputArray));
		
		inputArray = new double[] {3, 0, 1, 2};
		Assert.assertFalse(SortingUtil.isSorted(inputArray));
		
		inputArray = new double[] {3, 3, 3, 3, 3};
		Assert.assertFalse(SortingUtil.isSorted(inputArray));
	}
}
