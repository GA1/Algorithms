package blotto;

import static org.junit.Assert.*;

import org.junit.Test;

public class StrategyBuilderTest {

	private StrategyBuilder builder = new StrategyBuilder();
	Strategy result, expected;
	
	@Test
	public void test010() {
		result = builder.buildStrategy(5, 15);
		expected = new Strategy(new Integer[]{15, 15, 15, 15, 15, 6, 6, 6, 7});
		assertEquals(expected, result);
	}

	@Test
	public void test020() {
		result = builder.buildStrategy(5, 20);
		expected = new Strategy(new Integer[]{20, 20, 20, 20, 20, 0, 0, 0, 0});
		assertEquals(expected, result);
	}
	
	@Test
	public void test030() {
		result = builder.buildStrategy(6, 12);
		expected = new Strategy(new Integer[]{12, 12, 12, 12, 12, 12, 9, 9, 10});
		assertEquals(expected, result);
	}
}
