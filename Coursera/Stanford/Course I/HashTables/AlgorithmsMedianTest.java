import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class AlgorithmsMedianTest {

	AlgorithmMedian a = new AlgorithmMedian();
	Long[] numbers;

	@Test
	public void test010() {
		numbers = new Long[] { 3l, 7l, 4l, 1l, 2l, 6l, 5l };
		assertEquals(23, a.compute(Arrays.asList(numbers)));
	}

	@Test
	public void test020() {
		numbers = new Long[] { 10l, 1l, 9l, 2l, 8l, 3l, 7l, 4l, 6l, 5l };
		assertEquals(55, a.compute(Arrays.asList(numbers)));
	}
	
	@Test
	public void test030() {
		numbers = new Long[] {4l, 5l, 6l, 7l, 8l, 9l, 10l, 1l, 2l, 3l};
		assertEquals(54, a.compute(Arrays.asList(numbers)));
	}
}
