import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;


public class KNearSortingTest {

	private Integer[] A;
	private Integer[] B;
	private ArrayList<Integer> result;
	private ArrayList<Integer> expected;
	KNearSorting sorting = new KNearSorting();
	
	@Test
	public void test010() {
		A = null;
		assertNull(sorting.of(A, 2));
	}
	
	@Test
	public void test015() {
		A = new Integer[]{};
		B = new Integer[]{};
		result = new ArrayList<Integer>(Arrays.asList(sorting.of(A, 5)));
		expected = new ArrayList<Integer>(Arrays.asList(B)); 
		assertEquals(expected, result);

	}
	
	@Test
	public void test017() {
		A = new Integer[]{1};
		B = new Integer[]{1};
		result = new ArrayList<Integer>(Arrays.asList(sorting.of(A, 2)));
		expected = new ArrayList<Integer>(Arrays.asList(B)); 
		assertEquals(expected, result);
	}
	
	@Test
	public void test020() {
		A = new Integer[]{3, 1, 4, 2, 7, 8, 5, 6};
		B = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8};
		result = new ArrayList<Integer>(Arrays.asList(sorting.of(A, 2)));
		expected = new ArrayList<Integer>(Arrays.asList(B)); 
		assertEquals(expected, result);
	}
	
	

}
