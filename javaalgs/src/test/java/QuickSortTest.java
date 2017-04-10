import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class QuickSortTest extends SortingTest {

	
	Integer[] A, B;
	QuickSort sorting = new QuickSort();
	private ArrayList<Integer> result;
	private ArrayList<Integer> expected;

	@Override
	public Sorting getInstance() {
		return new QuickSort();
	}

	private boolean areLower(Integer[] A, int value, int start, int end) {
		for (int i = start; i <= end; i++ ) {
			if (A[i] > value)
				return false;
		}
		return true;
	}
	
	private boolean areBigger(Integer[] A, int value, int start, int end) {
		for (int i = start; i <= end; i++ ) {
			if (A[i] < value)
				return false;
		}
		return true;
	}
	
	@Test
	public void test0010() {
		A = new Integer[]{2, 13};
		assertEquals(0, (int)(sorting.pivot(A, 0, 0, 1)));
	}
	
	@Test
	public void test0020() {
		A = new Integer[]{2, 13};
		assertEquals(1, (int)(sorting.pivot(A, 0, 1, 1)));
	}
	
	@Test
	public void test0030() {
		A = new Integer[]{2, 7, 13};
		assertEquals(1, (int)(sorting.pivot(A, 0, 1, 2)));
		assertTrue(areLower(A, 7, 0, 0));
		assertTrue(areBigger(A, 7, 2, 2));
	}

	@Test
	public void test0040() {
		A = new Integer[]{2, 7, 13};
		assertEquals(2, (int)(sorting.pivot(A, 0, 2, 2)));
		assertTrue(areLower(A, 13, 0, 1));
	}
	
	@Test
	public void test0050() {
		A = new Integer[]{2, 7, 13};
		assertEquals(0, (int)(sorting.pivot(A, 0, 0, 2)));
		assertTrue(areBigger(A, 2, 1, 2));
	}

	
	@Test
	public void test0060() {
		A = new Integer[]{13, 7, 2};
		assertEquals(2, (int)(sorting.pivot(A, 0, 0, 2)));
		assertTrue(areLower(A, 13, 0, 1));
	}
	
	@Test
	public void test0070() {
		A = new Integer[]{13, 7, 2};
		assertEquals(1, (int)(sorting.pivot(A, 0, 1, 2)));
		assertTrue(areLower(A, 7, 0, 0));
		assertTrue(areBigger(A, 7, 2, 2));
	}
	
	@Test
	public void test0080() {
		A = new Integer[]{13, 7, 2};
		assertEquals(0, (int)(sorting.pivot(A, 0, 2, 2)));
		assertTrue(areBigger(A, 2, 1, 2));
	}
	
	@Test
	public void test0090() {
		A = new Integer[]{13, 49, 7, 2};
		assertEquals(2, (int)(sorting.pivot(A, 0, 0, 3)));
		assertTrue(areLower(A, 13, 0, 1));
		assertTrue(areBigger(A, 13, 3, 3));
	}
	
	@Test
	public void test0100() {
		A = new Integer[]{13, 49, 7, 2};
		assertEquals(3, (int)(sorting.pivot(A, 0, 1, 3)));
		assertTrue(areLower(A, 49, 0, 2));
	}
	
	@Test
	public void test0110() {
		A = new Integer[]{13, 49, 7, 2};
		assertEquals(1, (int)(sorting.pivot(A, 0, 2, 3)));
		assertTrue(areLower(A, 7, 0, 0));
		assertTrue(areBigger(A, 7, 2, 3));
	}
	
	@Test
	public void test0120() {
		A = new Integer[]{4, 7, 6, 5, 3, 2, 1};	
		assertEquals(3, (int)(sorting.pivot(A, 0, 0, 6)));
		assertTrue(areLower(A, 4, 0, 2));
		assertTrue(areBigger(A, 4, 4, 6));
	}
	
	@Test
	public void test0130() {
		A = new Integer[]{4, 7, 5, 3, 2, 1};	
		assertEquals(3, (int)(sorting.pivot(A, 0, 0, 5)));
		assertTrue(areLower(A, 4, 0, 2));
		assertTrue(areBigger(A, 4, 4, 5));
	}
	
	@Test
	public void test0140() {
		A = new Integer[]{10, 9, 8, 7, 6, 5, 7, 2, 9, 4, 3, 2, 1};	
		assertEquals(8, (int)(sorting.pivot(A, 0, 6, 12)));
		assertTrue(areLower(A, 7, 0, 7));
		assertTrue(areBigger(A, 7, 9, 12));
	}
	
}
