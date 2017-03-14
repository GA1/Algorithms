import static org.junit.Assert.*;

import org.junit.Test;


public class OptimalObliviousSortingNetworksTest {

	int[] A; 
	int[] A0 = new int[] {0, 0, 0, 0};
	int[] A1 = new int[] {0, 0, 0, 1};
	int[] A2 = new int[] {0, 0, 1, 0};
	int[] A3 = new int[] {0, 0, 1, 1};
	int[] A4 = new int[] {0, 1, 0, 0,};
	int[] A5 = new int[] {0, 1, 0, 1};
	int[] A6 = new int[] {0, 1, 1, 0};
	int[] A7 = new int[] {0, 1, 1, 1};
	int[] A8 = new int[] {1, 0, 0, 0};
	int[] A9 = new int[] {1, 0, 0, 1};
	int[] A10 = new int[] {1, 0, 1, 0};
	int[] A11 = new int[] {1, 0, 1, 1};
	int[] A12 = new int[] {1, 1, 0, 0,};
	int[] A13 = new int[] {1, 1, 0, 1};
	int[] A14 = new int[] {1, 1, 1, 0};
	int[] A15 = new int[] {1, 1, 1, 1};
	
	int[] B0 = new int[] {0, 0, 0, 0, 0};
	int[] B1 = new int[] {0, 0, 0, 0, 1};
	int[] B2 = new int[] {0, 0, 0, 1, 0};
	int[] B3 = new int[] {0, 0, 0, 1, 1};
	int[] B4 = new int[] {0, 0, 1, 0, 0,};
	int[] B5 = new int[] {0, 0, 1, 0, 1};
	int[] B6 = new int[] {0, 0, 1, 1, 0};
	int[] B7 = new int[] {0, 0, 1, 1, 1};
	int[] B8 = new int[] {0, 1, 0, 0, 0};
	int[] B9 = new int[] {0, 1, 0, 0, 1};
	int[] B10 = new int[] {0, 1, 0, 1, 0};
	int[] B11 = new int[] {0, 1, 0, 1, 1};
	int[] B12 = new int[] {0, 1, 1, 0, 0,};
	int[] B13 = new int[] {0, 1, 1, 0, 1};
	int[] B14 = new int[] {0, 1, 1, 1, 0};
	int[] B15 = new int[] {0, 1, 1, 1, 1};
	int[] B16 = new int[] {1, 0, 0, 0, 0};
	int[] B17 = new int[] {1, 0, 0, 0, 1};
	int[] B18 = new int[] {1, 0, 0, 1, 0};
	int[] B19 = new int[] {1, 0, 0, 1, 1};
	int[] B20 = new int[] {1, 0, 1, 0, 0,};
	int[] B21 = new int[] {1, 0, 1, 0, 1};
	int[] B22 = new int[] {1, 0, 1, 1, 0};
	int[] B23 = new int[] {1, 0, 1, 1, 1};
	int[] B24 = new int[] {1, 1, 0, 0, 0};
	int[] B25 = new int[] {1, 1, 0, 0, 1};
	int[] B26 = new int[] {1, 1, 0, 1, 0};
	int[] B27 = new int[] {1, 1, 0, 1, 1};
	int[] B28 = new int[] {1, 1, 1, 0, 0,};
	int[] B29 = new int[] {1, 1, 1, 0, 1};
	int[] B30 = new int[] {1, 1, 1, 1, 0};
	int[] B31 = new int[] {1, 1, 1, 1, 1};
	
//	@Test
	public void test010() {
		assertTrue(isSorted(OptimalObliviousSortingNetworks.of4(A0)));
		assertTrue(isSorted(OptimalObliviousSortingNetworks.of4(A1)));
		assertTrue(isSorted(OptimalObliviousSortingNetworks.of4(A2)));
		assertTrue(isSorted(OptimalObliviousSortingNetworks.of4(A3)));
		assertTrue(isSorted(OptimalObliviousSortingNetworks.of4(A4)));
		assertTrue(isSorted(OptimalObliviousSortingNetworks.of4(A5)));
		assertTrue(isSorted(OptimalObliviousSortingNetworks.of4(A6)));
		assertTrue(isSorted(OptimalObliviousSortingNetworks.of4(A7)));
		assertTrue(isSorted(OptimalObliviousSortingNetworks.of4(A8)));
		assertTrue(isSorted(OptimalObliviousSortingNetworks.of4(A9)));
		assertTrue(isSorted(OptimalObliviousSortingNetworks.of4(A10)));
		assertTrue(isSorted(OptimalObliviousSortingNetworks.of4(A11)));
		assertTrue(isSorted(OptimalObliviousSortingNetworks.of4(A12)));
		assertTrue(isSorted(OptimalObliviousSortingNetworks.of4(A13)));
		assertTrue(isSorted(OptimalObliviousSortingNetworks.of4(A14)));
		assertTrue(isSorted(OptimalObliviousSortingNetworks.of4(A15)));
		
		assertTrue(isSorted(OptimalObliviousSortingNetworks.of5(B0)));
		assertTrue(isSorted(OptimalObliviousSortingNetworks.of5(B1)));
		assertTrue(isSorted(OptimalObliviousSortingNetworks.of5(B2)));
		assertTrue(isSorted(OptimalObliviousSortingNetworks.of5(B3)));
		assertTrue(isSorted(OptimalObliviousSortingNetworks.of5(B4)));
		assertTrue(isSorted(OptimalObliviousSortingNetworks.of5(B5)));
		assertTrue(isSorted(OptimalObliviousSortingNetworks.of5(B6)));
		assertTrue(isSorted(OptimalObliviousSortingNetworks.of5(B7)));
		assertTrue(isSorted(OptimalObliviousSortingNetworks.of5(B8)));
		assertTrue(isSorted(OptimalObliviousSortingNetworks.of5(B9)));
		assertTrue(isSorted(OptimalObliviousSortingNetworks.of5(B10)));
		assertTrue(isSorted(OptimalObliviousSortingNetworks.of5(B11)));
		assertTrue(isSorted(OptimalObliviousSortingNetworks.of5(B12)));
		assertTrue(isSorted(OptimalObliviousSortingNetworks.of5(B13)));
		assertTrue(isSorted(OptimalObliviousSortingNetworks.of5(B14)));
		assertTrue(isSorted(OptimalObliviousSortingNetworks.of5(B15)));		
		assertTrue(isSorted(OptimalObliviousSortingNetworks.of5(B16)));
		assertTrue(isSorted(OptimalObliviousSortingNetworks.of5(B17)));
		assertTrue(isSorted(OptimalObliviousSortingNetworks.of5(B18)));
		assertTrue(isSorted(OptimalObliviousSortingNetworks.of5(B19)));
		assertTrue(isSorted(OptimalObliviousSortingNetworks.of5(B20)));
		assertTrue(isSorted(OptimalObliviousSortingNetworks.of5(B21)));
		assertTrue(isSorted(OptimalObliviousSortingNetworks.of5(B22)));
		assertTrue(isSorted(OptimalObliviousSortingNetworks.of5(B23)));
		assertTrue(isSorted(OptimalObliviousSortingNetworks.of5(B24)));
		assertTrue(isSorted(OptimalObliviousSortingNetworks.of5(B25)));
		assertTrue(isSorted(OptimalObliviousSortingNetworks.of5(B26)));
		assertTrue(isSorted(OptimalObliviousSortingNetworks.of5(B27)));
		assertTrue(isSorted(OptimalObliviousSortingNetworks.of5(B28)));
		assertTrue(isSorted(OptimalObliviousSortingNetworks.of5(B29)));
		assertTrue(isSorted(OptimalObliviousSortingNetworks.of5(B30)));
		assertTrue(isSorted(OptimalObliviousSortingNetworks.of5(B31)));		
	}
	
//	@Test
//	public void test010() {
//		A = new int[]{1, 1, 1, 1};
//		assertEquals(1, OptimalObliviousSortingNetworks.of44(new int[]{1, 1, 1, 1})[0]);
//		assertEquals(1, OptimalObliviousSortingNetworks.of44(new int[]{1, 1, 1, 1})[1]);
//		assertEquals(1, OptimalObliviousSortingNetworks.of44(new int[]{1, 1, 1, 1})[2]);
//		assertEquals(1, OptimalObliviousSortingNetworks.of44(new int[]{1, 1, 1, 1})[3]);
//	}
//
//	@Test
//	public void test020() {
//		assertEquals(1, OptimalObliviousSortingNetworks.of44(new int[]{1, 2, 3, 4})[0]);
//		assertEquals(2, OptimalObliviousSortingNetworks.of44(new int[]{1, 2, 3, 4})[1]);
//		assertEquals(3, OptimalObliviousSortingNetworks.of44(new int[]{1, 2, 3, 4})[2]);
//		assertEquals(4, OptimalObliviousSortingNetworks.of44(new int[]{1, 2, 3, 4})[3]);
//	}
//	
//	@Test
//	public void test030() {
//		assertEquals(1, OptimalObliviousSortingNetworks.of44(new int[]{4, 3, 2, 1})[0]);
//		assertEquals(2, OptimalObliviousSortingNetworks.of4(new int[]{4, 3, 2, 1})[1]);
//		assertEquals(3, OptimalObliviousSortingNetworks.of4(new int[]{4, 3, 2, 1})[2]);
//		assertEquals(4, OptimalObliviousSortingNetworks.of4(new int[]{4, 3, 2, 1})[3]);
//	}
//	
//	@Test
//	public void test040() {
//		assertEquals(1, OptimalObliviousSortingNetworks.of4(new int[]{1, 4, 3, 2})[0]);
//		assertEquals(2, OptimalObliviousSortingNetworks.of4(new int[]{1, 4, 3, 2})[1]);
//		assertEquals(3, OptimalObliviousSortingNetworks.of4(new int[]{1, 4, 3, 2})[2]);
//		assertEquals(4, OptimalObliviousSortingNetworks.of4(new int[]{1, 4, 3, 2})[3]);
//	}
//	
//	@Test
//	public void test050() {
//		assertEquals(1, OptimalObliviousSortingNetworks.of4(new int[]{2, 1, 4, 3})[0]);
//		assertEquals(2, OptimalObliviousSortingNetworks.of4(new int[]{2, 1, 4, 3})[1]);
//		assertEquals(3, OptimalObliviousSortingNetworks.of4(new int[]{2, 1, 4, 3})[2]);
//		assertEquals(4, OptimalObliviousSortingNetworks.of4(new int[]{2, 1, 4, 3})[3]);
//	}void 
//	
//	@Test
//	public void test060() {
//		assertEquals(1, OptimalObliviousSortingNetworks.of4(new int[]{3, 4, 1, 2})[0]);
//		assertEquals(2, OptimalObliviousSortingNetworks.of4(new int[]{3, 4, 1, 2})[1]);
//		assertEquals(3, OptimalObliviousSortingNetworks.of4(new int[]{3, 4, 1, 2})[2]);
//		assertEquals(4, OptimalObliviousSortingNetworks.of4(new int[]{3, 4, 1, 2})[3]);
//	}
//	
//	@Test
//	public void test070() {
//		assertEquals(1, OptimalObliviousSortingNetworks.of4(new int[]{4, 1, 2, 3})[0]);
//		assertEquals(2, OptimalObliviousSortingNetworks.of4(new int[]{4, 1, 2, 3})[1]);
//		assertEquals(3, OptimalObliviousSortingNetworks.of4(new int[]{4, 1, 2, 3})[2]);
//		assertEquals(4, OptimalObliviousSortingNetworks.of4(new int[]{4, 1, 2, 3})[3]);
//	}
//	
//	@Test
//	public void test080() {
//		assertEquals(1, OptimalObliviousSortingNetworks.of4(new int[]{2, 3, 4, 1})[0]);
//		assertEquals(2, OptimalObliviousSortingNetworks.of4(new int[]{2, 3, 4, 1})[1]);
//		assertEquals(3, OptimalObliviousSortingNetworks.of4(new int[]{2, 3, 4, 1})[2]);
//		assertEquals(4, OptimalObliviousSortingNetworks.of4(new int[]{2, 3, 4, 1})[3]);
//	}
//	
//	@Test
//	public void test090() {
//		assertEquals(1, OptimalObliviousSortingNetworks.of4(new int[]{1, 3, 4, 2})[0]);
//		assertEquals(2, OptimalObliviousSortingNetworks.of4(new int[]{1, 3, 4, 2})[1]);
//		assertEquals(3, OptimalObliviousSortingNetworks.of4(new int[]{1, 3, 4, 2})[2]);
//		assertEquals(4, OptimalObliviousSortingNetworks.of4(new int[]{1, 3, 4, 2})[3]);
//	}
	
	private boolean isSorted(int[] A) {		
		for (int i = 0; i < A.length - 1; i++) {
			if (A[i] > A[i+1])
				return false;
		}
		return true;
	}
}
