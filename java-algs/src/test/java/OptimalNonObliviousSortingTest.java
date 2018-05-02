import org.junit.Test;

import static org.junit.Assert.assertTrue;


public class OptimalNonObliviousSortingTest {

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
	
	@Test
	public void test010() {
		assertTrue(isSorted(OptimalNonObliviousSorting.of5(B0)));
		assertTrue(isSorted(OptimalNonObliviousSorting.of5(B1)));
		assertTrue(isSorted(OptimalNonObliviousSorting.of5(B1)));
		assertTrue(isSorted(OptimalNonObliviousSorting.of5(B1)));
		assertTrue(isSorted(OptimalNonObliviousSorting.of5(B1)));
		
		
	}

	private boolean isSorted(int[] A) {		
		for (int i = 0; i < A.length - 1; i++) {
			if (A[i] > A[i+1])
				return false;
		}
		return true;
	}
}
