import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class Monotone2dArrayTest {

	int[][] A;
	
	@Test
	public void test010() {
		A = null;
		assertFalse(Monotone2dArray.of(A, 0));
	}
	
	@Test
	public void test020() {
		A = new int[][]{{1}};
		assertTrue(Monotone2dArray.of(A, 1));
	}
	
	@Test
	public void test030() {
		A = new int[][]{{1}};
		assertFalse(Monotone2dArray.of(A, 2));
	}

	@Test
	public void test040() {
		A = new int[][]{
						 {1, 2, 3},
						 {4, 5, 6},
						 {7, 8, 9},				
					   };
		assertFalse(Monotone2dArray.of(A, 10));
	}
	
	@Test
	public void test050() {
		A = new int[][]{
						 {1, 2, 3},
						 {4, 5, 6},
						 {7, 8, 9},				
					   };
		assertFalse(Monotone2dArray.of(A, 0));
		
		assertTrue(Monotone2dArray.of(A, 1));
		assertTrue(Monotone2dArray.of(A, 5));
		assertTrue(Monotone2dArray.of(A, 9));
		assertTrue(Monotone2dArray.of(A, 2));
		assertTrue(Monotone2dArray.of(A, 3));
		assertTrue(Monotone2dArray.of(A, 4));
		assertTrue(Monotone2dArray.of(A, 7));
		assertTrue(Monotone2dArray.of(A, 6));
		assertTrue(Monotone2dArray.of(A, 8));
	}
	
	@Test
	public void test060() {
		A = new int[][]{
						 {1, 3, 5},
						 {4, 6, 8},
						 {5, 7, 9},				
					   };
		assertTrue(Monotone2dArray.of(A, 1));
		assertTrue(Monotone2dArray.of(A, 3));
		assertTrue(Monotone2dArray.of(A, 5));
		assertTrue(Monotone2dArray.of(A, 4));
		assertTrue(Monotone2dArray.of(A, 6));
		assertTrue(Monotone2dArray.of(A, 8));
		assertTrue(Monotone2dArray.of(A, 5));
		assertTrue(Monotone2dArray.of(A, 7));
		assertTrue(Monotone2dArray.of(A, 9));
	}
	
}
