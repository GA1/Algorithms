import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;


public abstract class SortingTest {

	private Integer[] A;
	private Integer[] B;
	private ArrayList<Integer> result;
	private ArrayList<Integer> expected;
	
	Sorting sorting = getInstance();
	
	public abstract Sorting getInstance(); 
			
	@Test
	public void test010() {
		A = null;
		assertNull(sorting.of(A));
	}
	
	@Test
	public void test015() {
		A = new Integer[]{};
		B = new Integer[]{};
		result = new ArrayList<Integer>(Arrays.asList(sorting.of(A)));
		expected = new ArrayList<Integer>(Arrays.asList(B)); 
		assertEquals(expected, result);
	}
	
	@Test
	public void test017() {
		A = new Integer[]{1};
		B = new Integer[]{1};
		result = new ArrayList<Integer>(Arrays.asList(sorting.of(A)));
		expected = new ArrayList<Integer>(Arrays.asList(B)); 
		assertEquals(expected, result);
	}
	
	@Test
	public void test020() {
		A = new Integer[]{0};
		B = new Integer[]{0};
		result = new ArrayList<Integer>(Arrays.asList(sorting.of(A)));
		expected = new ArrayList<Integer>(Arrays.asList(B));
		assertEquals(expected, result);
	}
	
	@Test
	public void test030() {
		A = new Integer[]{1};
		B = new Integer[]{1};
		result = new ArrayList<Integer>(Arrays.asList(sorting.of(A)));
		expected = new ArrayList<Integer>(Arrays.asList(B));
		assertEquals(expected, result);
	}
	
	@Test
	public void test040() {
		A = new Integer[]{1, 2};
		B = new Integer[]{1, 2};
		result = new ArrayList<Integer>(Arrays.asList(sorting.of(A)));
		expected = new ArrayList<Integer>(Arrays.asList(B));
		assertEquals(expected, result);
	}

	@Test
	public void test050() {
		A = new Integer[]{2, 1};
		B = new Integer[]{1, 2};
		result = new ArrayList<Integer>(Arrays.asList(sorting.of(A)));
		expected = new ArrayList<Integer>(Arrays.asList(B));
		assertEquals(expected, result);
	}
	
	@Test
	public void test060() {
		A = new Integer[]{3, 2, 1};
		B = new Integer[]{1, 2, 3};
		result = new ArrayList<Integer>(Arrays.asList(sorting.of(A)));
		expected = new ArrayList<Integer>(Arrays.asList(B));
		assertEquals(expected, result);
	}
	
	@Test
	public void test070() {
		A = new Integer[]{1, 2, 3};
		B = new Integer[]{1, 2, 3};
		result = new ArrayList<Integer>(Arrays.asList(sorting.of(A)));
		expected = new ArrayList<Integer>(Arrays.asList(B));
		assertEquals(expected, result);
	}
	
	@Test
	public void test075() {
		A = new Integer[]{4, 3, 2, 1};
		B = new Integer[]{1, 2, 3, 4};
		result = new ArrayList<Integer>(Arrays.asList(sorting.of(A)));
		expected = new ArrayList<Integer>(Arrays.asList(B));
		assertEquals(expected, result);
	}
	
	@Test
	public void test077() {
		A = new Integer[]{4, 2, 3, 1};
		B = new Integer[]{1, 2, 3, 4};
		result = new ArrayList<Integer>(Arrays.asList(sorting.of(A)));
		expected = new ArrayList<Integer>(Arrays.asList(B));
		assertEquals(expected, result);
	}
	
	@Test
	public void test079() {
		A = new Integer[]{4, 7, 5, 3, 2, 1};
		B = new Integer[]{1, 2, 3, 4, 5, 7};
		result = new ArrayList<Integer>(Arrays.asList(sorting.of(A)));
		expected = new ArrayList<Integer>(Arrays.asList(B));
		assertEquals(expected, result);
	}
			
	@Test
	public void test080() {
		A = new Integer[]{1, 2, 3, 8, 5, 6, 7, 4};
		B = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8};
		result = new ArrayList<Integer>(Arrays.asList(sorting.of(A)));
		expected = new ArrayList<Integer>(Arrays.asList(B));
		assertEquals(expected, result);
	}
	
	@Test
	public void test085() {
		A = new Integer[]{1, 2, 3, 4, 5, 6, 8, 7, 9};
		B = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
		result = new ArrayList<Integer>(Arrays.asList(sorting.of(A)));
		expected = new ArrayList<Integer>(Arrays.asList(B));
		assertEquals(expected, result);
	}
	
	@Test
	public void test090() {
		A = new Integer[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
		B = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		result = new ArrayList<Integer>(Arrays.asList(sorting.of(A)));
		expected = new ArrayList<Integer>(Arrays.asList(B));
		assertEquals(expected, result);
	}
	
	@Test
	public void test100() {
		A = new Integer[]{10, 9, 8, 7, 6, 5, 7, 2, 9, 4, 3, 2, 1};
		B = new Integer[]{1, 2, 2, 3, 4, 5, 6, 7, 7, 8, 9, 9, 10};
		result = new ArrayList<Integer>(Arrays.asList(sorting.of(A)));
		expected = new ArrayList<Integer>(Arrays.asList(B));
		assertEquals(expected, result);
	}
}
