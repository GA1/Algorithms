import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;


public class DutchFlagSortingTest {

	private Integer[] A;
	private Integer[] B;
	private ArrayList<Integer> result;
	private ArrayList<Integer> expected;
	private DutchFlagSorting sorting = new DutchFlagSorting();
	
	
	
	@Test
	public void test010() {
		A = new Integer[]{};
		B = new Integer[]{};
		result = new ArrayList<Integer>(Arrays.asList(sorting.of(A)));
		expected = new ArrayList<Integer>(Arrays.asList(B));
		assertEquals(expected, result);
	}

	@Test
	public void test020() {
		A = new Integer[]{1};
		B = new Integer[]{1};
		result = new ArrayList<Integer>(Arrays.asList(sorting.of(A)));
		expected = new ArrayList<Integer>(Arrays.asList(B));
		assertEquals(expected, result);
	}
	
	@Test
	public void test030() {
		A = new Integer[]{1, 2};
		B = new Integer[]{1, 2};
		result = new ArrayList<Integer>(Arrays.asList(sorting.of(A)));
		expected = new ArrayList<Integer>(Arrays.asList(B));
		assertEquals(expected, result);
	}
	
	@Test
	public void test040() {
		A = new Integer[]{2, 1};
		B = new Integer[]{1, 2};
		result = new ArrayList<Integer>(Arrays.asList(sorting.of(A)));
		expected = new ArrayList<Integer>(Arrays.asList(B));
		assertEquals(expected, result);
	}
	
	@Test
	public void test050() {
		A = new Integer[]{2, 1, 3};
		B = new Integer[]{1, 2, 3};
		result = new ArrayList<Integer>(Arrays.asList(sorting.of(A)));
		expected = new ArrayList<Integer>(Arrays.asList(B));
		assertEquals(expected, result);
	}
	
	@Test
	public void test055() {
		A = new Integer[]{3, 2, 1};
		B = new Integer[]{1, 2, 3};
		result = new ArrayList<Integer>(Arrays.asList(sorting.of(A)));
		expected = new ArrayList<Integer>(Arrays.asList(B));
		assertEquals(expected, result);
	}
	
	@Test
	public void test058() {
		A = new Integer[]{2, 3, 1, 3};
		B = new Integer[]{1, 2, 3, 3};
		result = new ArrayList<Integer>(Arrays.asList(sorting.of(A)));
		expected = new ArrayList<Integer>(Arrays.asList(B));
		assertEquals(expected, result);
	}
	
	@Test
	public void test059() {
		A = new Integer[]{2, 3, 1, 1};
		B = new Integer[]{1, 1, 2, 3};
		result = new ArrayList<Integer>(Arrays.asList(sorting.of(A)));
		expected = new ArrayList<Integer>(Arrays.asList(B));
		assertEquals(expected, result);
	}
	
	@Test
	public void test060() {
		A = new Integer[]{2, 3, 1, 2};
		B = new Integer[]{1, 2, 2, 3};
		result = new ArrayList<Integer>(Arrays.asList(sorting.of(A)));
		expected = new ArrayList<Integer>(Arrays.asList(B));
		assertEquals(expected, result);
	}
	
	@Test
	public void test065() {
		A = new Integer[]{2, 3, 1};
		B = new Integer[]{1, 2, 3};
		result = new ArrayList<Integer>(Arrays.asList(sorting.of(A)));
		expected = new ArrayList<Integer>(Arrays.asList(B));
		assertEquals(expected, result);
	}
	
	@Test
	public void test067() {
		A = new Integer[]{1, 1, 2, 2, 3, 3};
		B = new Integer[]{1, 1, 2, 2, 3, 3};
		result = new ArrayList<Integer>(Arrays.asList(sorting.of(A)));
		expected = new ArrayList<Integer>(Arrays.asList(B));
		assertEquals(expected, result);
	}
	
	@Test
	public void test070() {
		A = new Integer[]{3, 3, 2, 2, 1, 1};
		B = new Integer[]{1, 1, 2, 2, 3, 3};
		result = new ArrayList<Integer>(Arrays.asList(sorting.of(A)));
		expected = new ArrayList<Integer>(Arrays.asList(B));
		assertEquals(expected, result);
	}
	
	@Test
	public void test080() {
		A = new Integer[]{1, 2, 3, 1, 2, 3};
		B = new Integer[]{1, 1, 2, 2, 3, 3};
		result = new ArrayList<Integer>(Arrays.asList(sorting.of(A)));
		expected = new ArrayList<Integer>(Arrays.asList(B));
		assertEquals(expected, result);
	}
}
