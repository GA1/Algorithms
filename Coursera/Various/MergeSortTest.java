import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import org.junit.Test;


public class MergeSortTest extends SortingTest{

	MergeSort mergeSort = new MergeSort();
	Integer[] A, B;
	ArrayList<Integer> result, expected; 
	
	@Override
	public Sorting getInstance() {
		return new MergeSort();
	}

	
	@Test
	public void test1000() {
		A = new Integer[]{1};
		mergeSort.merge(A, 0, 1);
		result = new ArrayList<Integer>(Arrays.asList(A));
		expected = new ArrayList<Integer>(Arrays.asList(1)); 
		assertEquals(expected, result);
	}
	
	@Test
	public void test1010() {
		A = new Integer[]{1};
		mergeSort.merge(A, 0, 1);
		result = new ArrayList<Integer>(Arrays.asList(A));
		expected = new ArrayList<Integer>(Arrays.asList(1)); 
		assertEquals(expected, result);
	}
	
	@Test
	public void test1020() {
		A = new Integer[]{1, 1};
		mergeSort.merge(A, 0, 2);
		result = new ArrayList<Integer>(Arrays.asList(A));
		expected = new ArrayList<Integer>(Arrays.asList(1, 1)); 
		assertEquals(expected, result);
	}
	
	@Test
	public void test1040() {
		A = new Integer[]{1, 2};
		mergeSort.merge(A, 0, 2);
		result = new ArrayList<Integer>(Arrays.asList(A));
		expected = new ArrayList<Integer>(Arrays.asList(1, 2)); 
		assertEquals(expected, result);
	}
	
	@Test
	public void test1045() {
		A = new Integer[]{2, 1};
		mergeSort.merge(A, 0, 2);
		result = new ArrayList<Integer>(Arrays.asList(A));
		expected = new ArrayList<Integer>(Arrays.asList(1, 2)); 
		assertEquals(expected, result);
	}
	
	@Test
	public void test1050() {
		A = new Integer[]{1, 3, 5, 2, 4, 6};
		mergeSort.merge(A, 0, 6);
		result = new ArrayList<Integer>(Arrays.asList(A));
		expected = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6)); 
		assertEquals(expected, result);
	}
		
	@Test
	public void test1055() {
		A = new Integer[]{1};
		B = new Integer[]{1};
		result = new ArrayList<Integer>(Arrays.asList(mergeSort.copyArray(A, 0, 1)));
		expected = new ArrayList<Integer>(Arrays.asList(B)); 
		assertEquals(expected, result);
	}
	
	@Test
	public void test1060() {
		A = new Integer[]{1, 2, 3, 4, 5, 6};
		B = new Integer[]{1, 2, 3};
		result = new ArrayList<Integer>(Arrays.asList(mergeSort.copyArray(A, 0, 3)));
		expected = new ArrayList<Integer>(Arrays.asList(B)); 
		assertEquals(expected, result);
	}
	

	@Test
	public void test1065() {
		A = new Integer[]{1, 2, 5, 6, 3, 4};
		mergeSort.merge(A, 2, 6);
		result = new ArrayList<Integer>(Arrays.asList(A));
		expected = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6)); 
		assertEquals(expected, result);
	}
	
	@Test
	public void test1070() {
		A = new Integer[]{1, 2, 3, 4, 5, 6};
		B = new Integer[]{4, 5, 6};
		result = new ArrayList<Integer>(Arrays.asList(mergeSort.copyArray(A, 3, 6)));
		expected = new ArrayList<Integer>(Arrays.asList(B)); 
		assertEquals(expected, result);
	}
	
	@Test
	public void test1080() {
		A = new Integer[]{1, 2, 3, 4, 5, 6, 7};
		B = new Integer[]{1, 2, 3};
		result = new ArrayList<Integer>(Arrays.asList(mergeSort.copyArray(A, 0, 3)));
		expected = new ArrayList<Integer>(Arrays.asList(B)); 
		assertEquals(expected, result);
	}
	
	@Test
	public void test1090() {
		A = new Integer[]{1, 2, 3, 4, 5, 6, 7};
		B = new Integer[]{4, 5, 6, 7};
		result = new ArrayList<Integer>(Arrays.asList(mergeSort.copyArray(A, 3, 7)));
		expected = new ArrayList<Integer>(Arrays.asList(B)); 
		assertEquals(expected, result);
	}
}
	