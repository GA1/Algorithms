import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class Sort2distinctTest {

	private Integer[] A;
	private Integer[] B;
	private ArrayList<Integer> result;
	private ArrayList<Integer> expected;
	private Sort2distinct sorting = new Sort2distinct();
	
	
	
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
		A = new Integer[]{3, 1, 3};
		B = new Integer[]{1, 3, 3};
		result = new ArrayList<Integer>(Arrays.asList(sorting.of(A)));
		expected = new ArrayList<Integer>(Arrays.asList(B));
		assertEquals(expected, result);
	}
	
	@Test
	public void test055() {
		A = new Integer[]{3, 3, 1};
		B = new Integer[]{1, 3, 3};
		result = new ArrayList<Integer>(Arrays.asList(sorting.of(A)));
		expected = new ArrayList<Integer>(Arrays.asList(B));
		assertEquals(expected, result);
	}
	
	@Test
	public void test058() {
		A = new Integer[]{3, 3, 1, 3};
		B = new Integer[]{1, 3, 3, 3};
		result = new ArrayList<Integer>(Arrays.asList(sorting.of(A)));
		expected = new ArrayList<Integer>(Arrays.asList(B));
		assertEquals(expected, result);
	}
	
	@Test
	public void test059() {
		A = new Integer[]{3, 3, 1, 1};
		B = new Integer[]{1, 1, 3, 3};
		result = new ArrayList<Integer>(Arrays.asList(sorting.of(A)));
		expected = new ArrayList<Integer>(Arrays.asList(B));
		assertEquals(expected, result);
	}
	
	@Test
	public void test060() {
		A = new Integer[]{3, 3, 1, 2};
		B = new Integer[]{1, 3, 2, 3};
		result = new ArrayList<Integer>(Arrays.asList(sorting.of(A)));
		expected = new ArrayList<Integer>(Arrays.asList(B));
		assertEquals(expected, result);
	}
	
	@Test
	public void test065() {
		A = new Integer[]{3, 3, 1};
		B = new Integer[]{1, 3, 3};
		result = new ArrayList<Integer>(Arrays.asList(sorting.of(A)));
		expected = new ArrayList<Integer>(Arrays.asList(B));
		assertEquals(expected, result);
	}
	
	@Test
	public void test067() {
		A = new Integer[]{1, 1, 3, 3, 3, 3};
		B = new Integer[]{1, 1, 3, 3, 3, 3};
		result = new ArrayList<Integer>(Arrays.asList(sorting.of(A)));
		expected = new ArrayList<Integer>(Arrays.asList(B));
		assertEquals(expected, result);
	}
	
	@Test
	public void test070() {
		A = new Integer[]{3, 3, 3, 3, 1, 1};
		B = new Integer[]{1, 1, 3, 3, 3, 3};
		result = new ArrayList<Integer>(Arrays.asList(sorting.of(A)));
		expected = new ArrayList<Integer>(Arrays.asList(B));
		assertEquals(expected, result);
	}
	
	@Test
	public void test080() {
		A = new Integer[]{1, 3, 3, 1, 3, 3};
		B = new Integer[]{1, 1, 3, 3, 3, 3};
		result = new ArrayList<Integer>(Arrays.asList(sorting.of(A)));
		expected = new ArrayList<Integer>(Arrays.asList(B));
		assertEquals(expected, result);
	}
}