import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;


public class SumOf3Test {

	Integer[] A, B, C, result;
	
	@Test
	public void test() {
		assertFalse(SumOf3.has0SumI(A, B, C));
	}
	
	@Test
	public void test030() {
		A = new Integer[]{1};
		B = new Integer[]{2};
		result = new Integer[]{3};
		System.out.println(Arrays.asList(result));
		System.out.println(Arrays.asList(SumOf3.allPossibleSums(A, B)));
		assertTrue(Arrays.equals(result, SumOf3.allPossibleSums(A, B)));
	}
	
	@Test
	public void test040() {
		A = new Integer[]{1, 2};
		B = new Integer[]{5};
		result = new Integer[]{6, 7};
		System.out.println(Arrays.asList(result));
		System.out.println(Arrays.asList(SumOf3.allPossibleSums(A, B)));
		assertTrue(Arrays.equals(result, SumOf3.allPossibleSums(A, B)));
	}

	@Test
	public void test050() {
		A = new Integer[]{1, 2, 3};
		B = new Integer[]{5};
		result = new Integer[]{6, 7, 8};
		System.out.println(Arrays.asList(result));
		System.out.println(Arrays.asList(SumOf3.allPossibleSums(A, B)));
		assertTrue(Arrays.equals(result, SumOf3.allPossibleSums(A, B)));
	}
	
	@Test
	public void test060() {
		A = new Integer[]{1, 2, 3};
		B = new Integer[]{5, 11};
		result = new Integer[]{6, 7, 8, 12, 13, 14};
		System.out.println(Arrays.asList(result));
		System.out.println(Arrays.asList(SumOf3.allPossibleSums(A, B)));
		assertTrue(Arrays.equals(result, SumOf3.allPossibleSums(A, B)));
	}
	
	@Test
	public void test070() {
		A = new Integer[]{1, 2, 3};
		assertEquals(0, SumOf3.binarySearch(A, 1));
		assertEquals(1, SumOf3.binarySearch(A, 2));
		assertEquals(2, SumOf3.binarySearch(A, 3));
	}
	
	@Test
	public void test080() {
		A = new Integer[]{1};
		assertEquals(-1, SumOf3.binarySearch(A, 2));
		assertEquals(0, SumOf3.binarySearch(A, 1));
	}
	
	@Test
	public void test090() {
		A = new Integer[]{1, 2, 3, 4, 5, 6};
		assertEquals(0, SumOf3.binarySearch(A, 1));
		assertEquals(1, SumOf3.binarySearch(A, 2));
		assertEquals(2, SumOf3.binarySearch(A, 3));
		assertEquals(3, SumOf3.binarySearch(A, 4));
		assertEquals(4, SumOf3.binarySearch(A, 5));
		assertEquals(5, SumOf3.binarySearch(A, 6));
	}
		
	@Test
	public void test100() {
		A = new Integer[]{1};
		B = new Integer[]{2};
		C = new Integer[]{7};
		assertFalse(SumOf3.has0SumI(A, B, C));
	}
	
	@Test
	public void test110() {
		A = new Integer[]{1};
		B = new Integer[]{2};
		C = new Integer[]{-3};
		assertTrue(SumOf3.has0SumI(A, B, C));
	}
	
	@Test
	public void test120() {
		A = new Integer[]{1, 2, 3, 4, 5, 6};
		B = new Integer[]{33, 77, 100};
		C = new Integer[]{-39};
		assertTrue(SumOf3.has0SumI(A, B, C));
	}
}


















