import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class BinarySearchInRotatedListTest {

	
	int[] A;
	BinarySearchInRotatedList searcher = new BinarySearchInRotatedList();
	
	@Test
	public void test006() {
		A = new int[]{2, 1};
		assertEquals(1, searcher.findLeapIndexLinearly(A));
	}

	@Test
	public void test008() {
		A = new int[]{1, 1};
		assertEquals(-1, searcher.findLeapIndexLinearly(A));
	}
	
	@Test
	public void test001() {
		assertFalse(searcher.isRotated(null));
	}
	
	@Test
	public void test002() {
		A = new int[]{};
		assertFalse(searcher.isRotated(A));
	}
	
	@Test
	public void test003() {
		A = new int[]{2};
		assertFalse(searcher.isRotated(A));
	}
	
	@Test
	public void test005() {
		A = new int[]{2, 2};
		assertFalse(searcher.isRotated(A));
	}
	
	@Test
	public void test020() {
		A = new int[]{2, 1};
		assertTrue(searcher.isRotated(A));
	}
	
	@Test
	public void test030() {
		A = new int[]{4, 5, 3};
		assertTrue(searcher.isRotated(A));
	}
	
	@Test
	public void test040() {
		A = new int[]{3, 5, 4};
		assertFalse(searcher.isRotated(A));
	}
	
	@Test
	public void test050() {
		A = new int[]{2, 1};
		assertTrue(searcher.isRotated(A));
	}
	
	@Test
	public void test060() {
		A = new int[]{2, 1, 3};
		assertFalse(searcher.isRotated(A));
	}
	
	@Test
	public void test090() {
		A = new int[]{4, 1, 3};
		assertEquals(1, searcher.binarySearchForLeap(A));
	}
	
	@Test
	public void test100() {
		A = new int[]{2, 1};
		assertEquals(1, searcher.binarySearchForLeap(A));
	}
	
	@Test
	public void test110() {
		A = new int[]{6, 7, 8, 9, 1, 2, 3, 4, 5,};
		assertEquals(4, searcher.binarySearchForLeap(A));
	}

	@Test
	public void test130() {
		A = new int[]{6};
		assertEquals(0, searcher.binarySearchInSortedArray(A, 6, 0, 1));
	}
	
	@Test
	public void test140() {
		A = new int[]{};
		assertEquals(-1, searcher.binarySearchInSortedArray(A, 6, 0, A.length - 1));
	}
	
	@Test
	public void test150() {
		A = new int[]{5};
		assertEquals(-1, searcher.binarySearchInSortedArray(A, 6, 0, A.length - 1));
	}

	@Test
	public void test160() {
		A = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
		assertEquals(0, searcher.binarySearchInSortedArray(A, 1, 0, A.length - 1));
		assertEquals(1, searcher.binarySearchInSortedArray(A, 2, 0, A.length - 1));
		assertEquals(2, searcher.binarySearchInSortedArray(A, 3, 0, A.length - 1));
		assertEquals(3, searcher.binarySearchInSortedArray(A, 4, 0, A.length - 1));
		assertEquals(4, searcher.binarySearchInSortedArray(A, 5, 0, A.length - 1));
		assertEquals(5, searcher.binarySearchInSortedArray(A, 6, 0, A.length - 1));
		assertEquals(6, searcher.binarySearchInSortedArray(A, 7, 0, A.length - 1));
		assertEquals(7, searcher.binarySearchInSortedArray(A, 8, 0, A.length - 1));
		assertEquals(8, searcher.binarySearchInSortedArray(A, 9, 0, A.length - 1));
	}
	
	@Test
	public void test170() {
		A = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
		assertEquals(0, searcher.binarySearchInSortedArray(A, 1, 0, A.length - 1));
		assertEquals(1, searcher.binarySearchInSortedArray(A, 2, 0, A.length - 1));
		assertEquals(2, searcher.binarySearchInSortedArray(A, 3, 0, A.length - 1));
		assertEquals(3, searcher.binarySearchInSortedArray(A, 4, 0, A.length - 1));
		assertEquals(4, searcher.binarySearchInSortedArray(A, 5, 0, A.length - 1));
		assertEquals(5, searcher.binarySearchInSortedArray(A, 6, 0, A.length - 1));
		assertEquals(6, searcher.binarySearchInSortedArray(A, 7, 0, A.length - 1));
		assertEquals(7, searcher.binarySearchInSortedArray(A, 8, 0, A.length - 1));
	}
	
	@Test
	public void test070() {
		A = new int[]{2, 1};
		assertTrue(searcher.of(A, 2));
	}
	
	@Test
	public void test080() {
		A = new int[]{2, 1};
		assertTrue(searcher.of(A, 1));
	}
	
	@Test
	public void test200() {
		A = new int[]{4, 1, 3};
		assertTrue(searcher.of(A, 1));
		assertTrue(searcher.of(A, 3));
		assertTrue(searcher.of(A, 4));
	}
	
	@Test
	public void test210() {
		A = new int[]{4, 1, 3};
		assertFalse(searcher.of(A, 0));
	}
}
