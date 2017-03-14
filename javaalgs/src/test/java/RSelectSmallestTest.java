import static org.junit.Assert.*;

import org.junit.Test;


public class RSelectSmallestTest {

	RSelectSmallest selector = new RSelectSmallest();
	Integer[] A;
	
	@Test
	public void test010() {
		A = new Integer[]{1};
		assertEquals(1, selector.select(A, 1));
	}

	@Test
	public void test020() {
		A = new Integer[]{1, 2};
		assertEquals(1, selector.select(A, 1));
		assertEquals(2, selector.select(A, 2));
	}
	
	@Test
	public void test030() {
		A = new Integer[]{2, 1};
		assertEquals(1, selector.select(A, 1));
		assertEquals(2, selector.select(A, 2));
	}
	
	@Test
	public void test040() {
		A = new Integer[]{1, 2, 3};
		assertEquals(1, selector.select(A, 1));
		assertEquals(2, selector.select(A, 2));
		assertEquals(3, selector.select(A, 3));
	}
	
	@Test
	public void test050() {
		A = new Integer[]{3, 2, 1};
		assertEquals(1, selector.select(A, 1));
		assertEquals(2, selector.select(A, 2));
		assertEquals(3, selector.select(A, 3));
	}
	
	@Test
	public void test060() {
		A = new Integer[]{1, 3, 2};
		assertEquals(1, selector.select(A, 1));
		assertEquals(2, selector.select(A, 2));
		assertEquals(3, selector.select(A, 3));
	}
	
	@Test
	public void test070() {
		A = new Integer[]{1, 3, 1};
		assertEquals(1, selector.select(A, 1));
		assertEquals(1, selector.select(A, 2));
		assertEquals(3, selector.select(A, 3));
	}
	
	@Test
	public void test080() {
		A = new Integer[]{1, 1, 1};
		assertEquals(1, selector.select(A, 1));
		assertEquals(1, selector.select(A, 2));
		assertEquals(1, selector.select(A, 3));
	}
}
