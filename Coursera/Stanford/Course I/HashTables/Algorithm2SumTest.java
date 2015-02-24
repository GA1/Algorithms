import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class Algorithm2SumTest {

	Algorithm2Sum a = new Algorithm2Sum();
	Long[] numbers;

	@Test
	public void test010() {
		numbers = new Long[] { -10001l, 1l, 2l, -10001l };
		assertEquals(3, a.compute(Arrays.asList(numbers)));
	}

	@Test
	public void test040() {
		numbers = new Long[] { -10001l, 1l, 2l, -10001l };
		assertEquals(3, a.compute(Arrays.asList(numbers)));
	}
}
