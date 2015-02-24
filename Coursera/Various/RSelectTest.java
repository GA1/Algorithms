package algs;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class RSelectTest {
	
	private RSelect selector = new RSelect();
	private Integer[] A;
	private Integer[] expected;
	
	@Test
	public void test010() {
		A = new Integer[]{0};
		assertEquals((Integer)0, selector.rSelect(A, 1));
	}

	@Test
	public void test020() {
		A = new Integer[]{1};
		assertEquals((Integer)1, selector.rSelect(A, 1));
	}
	
	@Test
	public void test030() {
		A = new Integer[]{0, 1};
		assertEquals((Integer)1, selector.rSelect(A, 1));
	}
	
	@Test
	public void test040() {
		A = new Integer[]{0, 1};
		assertEquals((Integer)0, selector.rSelect(A, 2));
	}
	
	@Test
	public void test050() {
		A = new Integer[]{2, 2, 2, 2, 2, 6, 5, 7, 4, 1};
		selector.sort(A, 5, 10);
		expected = new Integer[]{2, 2, 2, 2, 2, 1, 4, 5, 6, 7};
		assertEquals(Arrays.asList(expected), Arrays.asList(A));
	}
	
	@Test
	public void test060() {
		A = new Integer[]{6, 1, 7, 4, 5};
		selector.sort(A, 0, 5);
		expected = new Integer[]{1, 4, 5, 6, 7};
		assertEquals(Arrays.asList(expected), Arrays.asList(A));
	}
}
