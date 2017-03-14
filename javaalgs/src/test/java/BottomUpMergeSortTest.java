import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;


public class BottomUpMergeSortTest extends SortingTest{

	BottomUpMergeSort bottomUpMergeSort = new BottomUpMergeSort();
	Integer[] A, B;
	ArrayList<Integer> result, expected; 
	
	@Test
	public void test1000() {
		A = new Integer[]{1};
		bottomUpMergeSort.merge(A, 0, 0, 1);
		result = new ArrayList<Integer>(Arrays.asList(A));
		expected = new ArrayList<Integer>(Arrays.asList(1)); 
		assertEquals(expected, result);
	}
	
	@Test
	public void test1010() {
		A = new Integer[]{1};
		bottomUpMergeSort.merge(A, 0, 0, 1);
		result = new ArrayList<Integer>(Arrays.asList(A));
		expected = new ArrayList<Integer>(Arrays.asList(1)); 
		assertEquals(expected, result);
	}
	
	@Test
	public void test1020() {
		A = new Integer[]{1, 1};
		bottomUpMergeSort.merge(A, 0, 1,2);
		result = new ArrayList<Integer>(Arrays.asList(A));
		expected = new ArrayList<Integer>(Arrays.asList(1, 1)); 
		assertEquals(expected, result);
	}
	
	@Test
	public void test1040() {
		A = new Integer[]{1, 2};
		bottomUpMergeSort.merge(A, 0, 1, 2);
		result = new ArrayList<Integer>(Arrays.asList(A));
		expected = new ArrayList<Integer>(Arrays.asList(1, 2)); 
		assertEquals(expected, result);
	}
	
	@Test
	public void test1045() {
		A = new Integer[]{2, 1};
		bottomUpMergeSort.merge(A, 0, 1, 2);
		result = new ArrayList<Integer>(Arrays.asList(A));
		expected = new ArrayList<Integer>(Arrays.asList(1, 2)); 
		assertEquals(expected, result);
	}
	
	@Test
	public void test1050() {
		A = new Integer[]{1, 2, 3, 5, 4, 6};
		bottomUpMergeSort.merge(A, 2, 4, 6);
		result = new ArrayList<Integer>(Arrays.asList(A));
		expected = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6)); 
		assertEquals(expected, result);
	}
	
	@Test
	public void test1060() {
		A = new Integer[]{1, 2, 3, 5, 7, 4, 6, 8};
		bottomUpMergeSort.merge(A, 2, 5, 8);
		result = new ArrayList<Integer>(Arrays.asList(A));
		expected = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8)); 
		assertEquals(expected, result);
	}
	
	@Test
	public void test1070() {
		A = new Integer[]{2, 3, 1};
		bottomUpMergeSort.merge(A, 0, 2, 3);
		result = new ArrayList<Integer>(Arrays.asList(A));
		expected = new ArrayList<Integer>(Arrays.asList(1, 2, 3)); 
		assertEquals(expected, result);
	}

	@Test
	public void test1075() {
		A = new Integer[]{39, 38, 37, 36, 35, 34, 33, 32, 31, 30, 29, 28, 27, 26, 25, 24, 23, 22, 21, 20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
		System.out.println(A);
		System.out.println(A.length);
		bottomUpMergeSort.of(A);
		result = new ArrayList<Integer>(Arrays.asList(A));
		expected = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 
				21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39)); 
		assertEquals(expected, result);
	}
	
	@Override
	public Sorting getInstance() {
		return new BottomUpMergeSort();
	}

}
