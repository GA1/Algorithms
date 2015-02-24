

import static org.junit.Assert.*;

import org.junit.Test;

public class TwoSumTest {

	private TwoSum twoSumChecker = new TwoSum();
	
	
	@Test
	public void test010() {
		twoSumChecker.insert(1l);
		twoSumChecker.insert(2l);
		assertTrue(twoSumChecker.hasSum(3));
	}

	@Test
	public void test020() {
		twoSumChecker.insert(1l);
		twoSumChecker.insert(2l);
		assertFalse(twoSumChecker.hasSum(2));
	}
	
	@Test
	public void test030() {
		twoSumChecker.insert(1l);
		twoSumChecker.insert(2l);
		assertFalse(twoSumChecker.hasSum(4));
	}
	
	@Test
	public void test040() {
		twoSumChecker.insert(1l);
		twoSumChecker.insert(3l);
		twoSumChecker.insert(5l);
		assertTrue(twoSumChecker.hasSum(4));
		assertTrue(twoSumChecker.hasSum(6));
		assertTrue(twoSumChecker.hasSum(8));
	}
	
	@Test
	public void test050() {
		twoSumChecker.insert(1l);
		twoSumChecker.insert(2l);
		twoSumChecker.insert(3l);
		twoSumChecker.insert(5l);
		assertTrue(twoSumChecker.hasSum(3));
		assertTrue(twoSumChecker.hasSum(4));
		assertTrue(twoSumChecker.hasSum(5));
		assertTrue(twoSumChecker.hasSum(6));
		assertTrue(twoSumChecker.hasSum(7));
		assertTrue(twoSumChecker.hasSum(8));
	}
}
