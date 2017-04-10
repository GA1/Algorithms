import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;


public class ImprovedMergeTest {


	private Integer[] A;
	private Integer[] B;
	private Integer[] C;
	private ArrayList<Integer> result;
	private ArrayList<Integer> expected;
	private ImprovedMerge merger = new ImprovedMerge();
	
	@Test
	public void test00000() {
		A = new Integer[]{};
		assertEquals(-1, merger.binarySearch(A, 0, 0, 2));
	}
	
	@Test
	public void test0000() {
		A = new Integer[]{3};
		assertEquals(-1, merger.binarySearch(A, 0, 0, 2));
		assertEquals(0, merger.binarySearch(A, 0, 0, 3));
	}
	
	@Test
	public void test000() {
		A = new Integer[]{3, 4};
		assertEquals(-1, merger.binarySearch(A, 0, 1, 2));
		assertEquals(0, merger.binarySearch(A, 0, 1, 3));
		assertEquals(1, merger.binarySearch(A, 0, 1, 4));
		assertEquals(1, merger.binarySearch(A, 0, 1, 5));
	}
	
	@Test
	public void test001() {
		A = new Integer[]{3, 4};
		assertEquals(0, merger.binarySearch(A, 0, 1, 3));
		assertEquals(1, merger.binarySearch(A, 0, 1, 4));
	}
	
	@Test
	public void test002() {
		A = new Integer[]{3, 4, 5};
		assertEquals(0, merger.binarySearch(A, 0, 2, 3));
		assertEquals(1, merger.binarySearch(A, 0, 2, 4));
		assertEquals(2, merger.binarySearch(A, 0, 2, 5));
	}
	
	@Test
	public void test003() {
		A = new Integer[]{1, 2, 3, 4, 5, 7, 8, 9};
		assertEquals(0, merger.binarySearch(A, 0, 7, 1));
		assertEquals(1, merger.binarySearch(A, 0, 7, 2));
		assertEquals(2, merger.binarySearch(A, 0, 7, 3));
		assertEquals(3, merger.binarySearch(A, 0, 7, 4));
		assertEquals(4, merger.binarySearch(A, 0, 7, 5));
		assertEquals(4, merger.binarySearch(A, 0, 7, 6));
		assertEquals(5, merger.binarySearch(A, 0, 7, 7));
		assertEquals(6, merger.binarySearch(A, 0, 7, 8));
		assertEquals(7, merger.binarySearch(A, 0, 7, 9));
	}
	
	@Test
	public void test010() {
		A = new Integer[0];
		B = new Integer[0];
		C = new Integer[0];
		result = new ArrayList<Integer>(Arrays.asList(merger.of(A, B)));
		expected = new ArrayList<Integer>(Arrays.asList(C)); 
		assertEquals(expected, result);
	}
	
	@Test
	public void test015() {
		A = new Integer[]{};
		B = new Integer[]{1};
		C = new Integer[]{1};
		result = new ArrayList<Integer>(Arrays.asList(merger.of(A, B)));
		expected = new ArrayList<Integer>(Arrays.asList(C)); 
		assertEquals(expected, result);

	}
	
	@Test
	public void test017() {
		A = new Integer[]{1};
		B = new Integer[]{};
		C = new Integer[]{1};
		result = new ArrayList<Integer>(Arrays.asList(merger.of(A, B)));
		expected = new ArrayList<Integer>(Arrays.asList(C));
		assertEquals(expected, result);
	}
	
	@Test
	public void test020() {
		A = new Integer[]{2};
		B = new Integer[]{1};
		C = new Integer[]{1, 2};
		result = new ArrayList<Integer>(Arrays.asList(merger.of(A, B)));
		expected = new ArrayList<Integer>(Arrays.asList(C));
		assertEquals(expected, result);
	}
	
	@Test
	public void test030() {
		A = new Integer[]{1};
		B = new Integer[]{2};
		C = new Integer[]{1, 2};
		result = new ArrayList<Integer>(Arrays.asList(merger.of(A, B)));
		expected = new ArrayList<Integer>(Arrays.asList(C));
		assertEquals(expected, result);
	}
	
	@Test
	public void test040() {
		A = new Integer[]{1, 3};
		B = new Integer[]{2};
		C = new Integer[]{1, 2, 3};
		result = new ArrayList<Integer>(Arrays.asList(merger.of(A, B)));
		expected = new ArrayList<Integer>(Arrays.asList(C));
		assertEquals(expected, result);
	}
	
	@Test
	public void test050() {
		A = new Integer[]{1, 3};
		B = new Integer[]{2};
		C = new Integer[]{1, 2, 3};
		result = new ArrayList<Integer>(Arrays.asList(merger.of(A, B)));
		expected = new ArrayList<Integer>(Arrays.asList(C));
		assertEquals(expected, result);
	}
	
	@Test
	public void test054() {
		A = new Integer[]{1, 3};
		B = new Integer[]{4};
		C = new Integer[]{1, 3, 4};
		result = new ArrayList<Integer>(Arrays.asList(merger.of(A, B)));
		expected = new ArrayList<Integer>(Arrays.asList(C));
		assertEquals(expected, result);
	}
	
	@Test
	public void test056() {
		A = new Integer[]{4};
		B = new Integer[]{1, 3};
		C = new Integer[]{1, 3, 4};
		result = new ArrayList<Integer>(Arrays.asList(merger.of(A, B)));
		expected = new ArrayList<Integer>(Arrays.asList(C));
		assertEquals(expected, result);
	}
	
	@Test
	public void test060() {
		A = new Integer[]{1, 2, 3};
		B = new Integer[]{3};
		C = new Integer[]{1, 2, 3, 3};
		result = new ArrayList<Integer>(Arrays.asList(merger.of(A, B)));
		expected = new ArrayList<Integer>(Arrays.asList(C));
		assertEquals(expected, result);
	}
	
	@Test
	public void test065() {
		A = new Integer[]{3};
		B = new Integer[]{1, 2, 3};
		C = new Integer[]{1, 2, 3, 3};
		result = new ArrayList<Integer>(Arrays.asList(merger.of(A, B)));
		expected = new ArrayList<Integer>(Arrays.asList(C));
		assertEquals(expected, result);
	}
	
	@Test
	public void test070() {
		A = new Integer[]{1, 2, 3, 4};
		B = new Integer[]{3};
		C = new Integer[]{1, 2, 3, 3, 4};
		result = new ArrayList<Integer>(Arrays.asList(merger.of(A, B)));
		expected = new ArrayList<Integer>(Arrays.asList(C));
		assertEquals(expected, result);
	}
	
	@Test
	public void test075() {
		A = new Integer[]{3};
		B = new Integer[]{1, 2, 3, 4};
		C = new Integer[]{1, 2, 3, 3, 4};
		result = new ArrayList<Integer>(Arrays.asList(merger.of(A, B)));
		expected = new ArrayList<Integer>(Arrays.asList(C));
		assertEquals(expected, result);
	}
	
	@Test
	public void test080() {
		A = new Integer[]{1, 2, 4};
		B = new Integer[]{3};
		C = new Integer[]{1, 2, 3, 4};
		result = new ArrayList<Integer>(Arrays.asList(merger.of(A, B)));
		expected = new ArrayList<Integer>(Arrays.asList(C));
		assertEquals(expected, result);
	}
	
	@Test
	public void test085() {
		A = new Integer[]{3};
		B = new Integer[]{1, 2, 4};
		C = new Integer[]{1, 2, 3, 4};
		result = new ArrayList<Integer>(Arrays.asList(merger.of(A, B)));
		expected = new ArrayList<Integer>(Arrays.asList(C));
		assertEquals(expected, result);
	}
	
	@Test
	public void test090() {
		B = new Integer[]{4, 9};
		A = new Integer[]{4, 8};
		C = new Integer[]{4, 4, 8, 9};
		result = new ArrayList<Integer>(Arrays.asList(merger.of(A, B)));
		expected = new ArrayList<Integer>(Arrays.asList(C));
		assertEquals(expected, result);
	}
	
	@Test
	public void test095() {
		A = new Integer[]{4, 8};
		B = new Integer[]{4, 9};
		C = new Integer[]{4, 4, 8, 9};
		result = new ArrayList<Integer>(Arrays.asList(merger.of(A, B)));
		expected = new ArrayList<Integer>(Arrays.asList(C));
		assertEquals(expected, result);
	}
	
	@Test
	public void test100() {
		A = new Integer[] { 1, 2, 3, 4, 5, 6, 7, 9, 10, 11, 12 };
		B = new Integer[] { 4, 8, 11 };
		C = new Integer[] { 1, 2, 3, 4, 4, 5, 6, 7, 8, 9, 10, 11, 11, 12 };
		result = new ArrayList<Integer>(Arrays.asList(merger.of(A, B)));
		expected = new ArrayList<Integer>(Arrays.asList(C));
		assertEquals(expected, result);
	}
	
	@Test
	public void test105() {
		A = new Integer[] { 4, 8, 11 };
		B = new Integer[] { 1, 2, 3, 4, 5, 6, 7, 9, 10, 11, 12 };
		C = new Integer[] { 1, 2, 3, 4, 4, 5, 6, 7, 8, 9, 10, 11, 11, 12 };
		result = new ArrayList<Integer>(Arrays.asList(merger.of(A, B)));
		expected = new ArrayList<Integer>(Arrays.asList(C));
		assertEquals(expected, result);
	}
}
