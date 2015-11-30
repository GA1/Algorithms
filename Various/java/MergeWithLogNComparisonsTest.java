import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;


public class MergeWithLogNComparisonsTest {

	
	private MergeWithLogNComparisons merger = new MergeWithLogNComparisons();
	private Integer[] A, B, C;
	private ArrayList<Integer> result;
	private ArrayList<Integer> expected;
	
	@Test
	public void test010() {
		A = new Integer[0];
		B = new Integer[0];		
		C = merger.merge(A, B); 
		result = new ArrayList<Integer>(Arrays.asList(C));
		expected = new ArrayList<Integer>(); 
		assertEquals(expected, result);
	}
	
	@Test
	public void test020() {
		A = new Integer[0];
		B = new Integer[]{1};		
		C = merger.merge(A, B); 
		result = new ArrayList<Integer>(Arrays.asList(C));
		expected = new ArrayList<Integer>(Arrays.asList(1)); 
		assertEquals(expected, result);
	}
	
	@Test
	public void test030() {
		A = new Integer[]{1};		
		B = new Integer[0];
		C = merger.merge(A, B); 
		result = new ArrayList<Integer>(Arrays.asList(C));
		expected = new ArrayList<Integer>(Arrays.asList(1)); 
		assertEquals(expected, result);
	}

	@Test
	public void test040() {
		A = new Integer[]{1};		
		B = new Integer[]{2};
		C = merger.merge(A, B); 
		result = new ArrayList<Integer>(Arrays.asList(C));
		expected = new ArrayList<Integer>(Arrays.asList(1, 2)); 
		assertEquals(expected, result);
	}
	
	@Test
	public void test050() {
		A = new Integer[]{2};
		B = new Integer[]{1};		
		C = merger.merge(A, B); 
		result = new ArrayList<Integer>(Arrays.asList(C));
		expected = new ArrayList<Integer>(Arrays.asList(1, 2)); 
		assertEquals(expected, result);
	}
	
	@Test
	public void test060() {
		A = new Integer[]{0};
		B = new Integer[]{1, 2, 3};		
		C = merger.merge(A, B); 
		result = new ArrayList<Integer>(Arrays.asList(C));
		expected = new ArrayList<Integer>(Arrays.asList(0, 1, 2, 3)); 
		assertEquals(expected, result);
	}
	
	@Test
	public void test070() {
		A = new Integer[]{1, 2, 3};		
		B = new Integer[]{0};
		C = merger.merge(A, B); 
		result = new ArrayList<Integer>(Arrays.asList(C));
		expected = new ArrayList<Integer>(Arrays.asList(0, 1, 2, 3)); 
		assertEquals(expected, result);
	}
	
	@Test
	public void test080() {
		A = new Integer[]{-1, 0};
		B = new Integer[]{1, 2, 3};		
		C = merger.merge(A, B); 
		result = new ArrayList<Integer>(Arrays.asList(C));
		expected = new ArrayList<Integer>(Arrays.asList(-1, 0, 1, 2, 3)); 
		assertEquals(expected, result);
	}
	
	@Test
	public void test090() {
		A = new Integer[]{1, 2, 3};		
		B = new Integer[]{-1, 0};
		C = merger.merge(A, B); 
		result = new ArrayList<Integer>(Arrays.asList(C));
		expected = new ArrayList<Integer>(Arrays.asList(-1, 0, 1, 2, 3)); 
		assertEquals(expected, result);
	}
	
	@Test
	public void test100() {
		A = new Integer[]{1, 3, 5, 7, 9, 11};		
		B = new Integer[]{0, 2, 4, 6, 8, 10, 12};
		C = merger.merge(A, B); 
		result = new ArrayList<Integer>(Arrays.asList(C));
		expected = new ArrayList<Integer>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12)); 
		assertEquals(expected, result);
	}
}
