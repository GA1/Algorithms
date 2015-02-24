package blotto;

import static org.junit.Assert.*;

import org.junit.Test;

public class StrategyTest {

	private final double delta = 0.00000001;
	
	private Strategy s;
	private Strategy s1;
	private Strategy s2;
	
	@Test
	public void correctNumberOfSoldiersTest010() {
		s = new Strategy(new Integer[]{1, 1, 1, 1, 1, 1, 1, 1, 92});
	}

	@Test(expected = IllegalArgumentException.class)
	public void incorrectNumberOfSoldiersTest020() {
		s = new Strategy(new Integer[]{1, 1, 1, 1, 1, 1, 1, 1, 91});
	}
	
	@Test
	public void test030() {
		s1 = new Strategy(new Integer[]{10, 10, 10, 10, 10, 10, 10, 10, 20});
		s2 = new Strategy(new Integer[]{1, 1, 1, 1, 1, 1, 1, 1, 92});
		assertEquals(8.0, s1.getPointsForFightWith(s2), delta);
	}
	
	@Test
	public void test040() {
		s1 = new Strategy(new Integer[]{10, 10, 10, 10, 10, 10, 10, 10, 20});
		s2 = new Strategy(new Integer[]{10, 10, 10, 10, 10, 10, 10, 10, 20});
		assertEquals(4.5, s1.getPointsForFightWith(s2), delta);
	}
	
	@Test
	public void test050() {
		s = new Strategy(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 64});
		assertEquals("[1, 2, 3, 4, 5, 6, 7, 8, 64]", s.toString());
	}
}
