import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;


public class PartitionerTest {

	Integer[] A, B;
	Partitioner sorting = new Partitioner();
	private ArrayList<Integer> result;
	private ArrayList<Integer> expected;

	private boolean areLowerOrEqual(Integer[] A, int value, int start, int end) {
		for (int i = start; i <= end; i++ ) {
			if (A[i] > value)
				return false;
		}
		return true;
	}
	
	private boolean areBiggerOrEqual(Integer[] A, int value, int start, int end) {
		for (int i = start; i <= end; i++ ) {
			if (A[i] < value)
				return false;
		}
		return true;
	}
	
	@Test
	public void test0005() {
		A = new Integer[]{13};
		assertEquals(0, (int)(sorting.partitionWhenPivotAtStart(A, 0, 0)));
		System.out.println("test 0005: " + new ArrayList<Integer>(Arrays.asList(A)));
	}
	
	@Test
	public void test0006() {
		A = new Integer[]{97, 97, 97, 13};
		assertEquals(3, (int)(sorting.partitionWhenPivotAtStart(A, 3, 3)));
		System.out.println("test 0006: " + new ArrayList<Integer>(Arrays.asList(A)));
	}
	
	@Test
	public void test0007() {
		A = new Integer[]{13, 97, 97};
		assertEquals(0, (int)(sorting.partitionWhenPivotAtStart(A, 0, 0)));
		System.out.println("test 0007: " + new ArrayList<Integer>(Arrays.asList(A)));
	}
	
	@Test
	public void test0010() {
		A = new Integer[]{2, 13};
		assertEquals(0, (int)(sorting.partitionWhenPivotAtStart(A, 0, 1)));
		System.out.println("test 0010: " + new ArrayList<Integer>(Arrays.asList(A)));
		assertTrue(areBiggerOrEqual(A, 2, 1, 1));
	}
	
	@Test
	public void test0020() {
		A = new Integer[]{13, 2};
		assertEquals(1, (int)(sorting.partitionWhenPivotAtStart(A, 0, 1)));
		System.out.println("test 0020: " + new ArrayList<Integer>(Arrays.asList(A)));
		assertTrue(areLowerOrEqual(A, 13, 0, 0));
	}
	
	@Test
	public void test0030() {
		A = new Integer[]{5, 7, 11};
		assertEquals(0, (int)(sorting.partitionWhenPivotAtStart(A, 0, 2)));
		System.out.println("test 0030: " + new ArrayList<Integer>(Arrays.asList(A)));
		assertTrue(areBiggerOrEqual(A, 5, 1, 2));
	}
	
	@Test
	public void test0040() {
		A = new Integer[]{5, 11, 7};
		assertEquals(0, (int)(sorting.partitionWhenPivotAtStart(A, 0, 2)));
		System.out.println("test 0040: " + new ArrayList<Integer>(Arrays.asList(A)));
		assertTrue(areBiggerOrEqual(A, 5, 1, 2));
	}
	
	@Test
	public void test0050() {
		A = new Integer[]{7, 5, 11};
		assertEquals(1, (int)(sorting.partitionWhenPivotAtStart(A, 0, 2)));
		System.out.println("test 0050: " + new ArrayList<Integer>(Arrays.asList(A)));
		assertTrue(areLowerOrEqual(A, 7, 0, 0));
		assertTrue(areBiggerOrEqual(A, 7, 2, 2));
	}
	
	@Test
	public void test0055() {
		A = new Integer[]{97, 97, 7, 5, 11};
		assertEquals(3, (int)(sorting.partitionWhenPivotAtStart(A, 2, 4)));
		System.out.println("test 0055: " + new ArrayList<Integer>(Arrays.asList(A)));
		assertTrue(areLowerOrEqual(A, 7, 2, 2));
		assertTrue(areBiggerOrEqual(A, 7, 4, 4));
	}
	
	@Test
	public void test0057() {
		A = new Integer[]{7, 5, 11, 97, 97};
		assertEquals(1, (int)(sorting.partitionWhenPivotAtStart(A, 0, 2)));
		System.out.println("test 0057: " + new ArrayList<Integer>(Arrays.asList(A)));
		assertTrue(areLowerOrEqual(A, 7, 0, 0));
		assertTrue(areBiggerOrEqual(A, 7, 2, 2));
	}
	
	@Test
	public void test0060() {
		A = new Integer[]{7, 11, 5};
		assertEquals(1, (int)(sorting.partitionWhenPivotAtStart(A, 0, 2)));
		System.out.println("test 0040: " + new ArrayList<Integer>(Arrays.asList(A)));
		assertTrue(areLowerOrEqual(A, 7, 0, 0));
		assertTrue(areBiggerOrEqual(A, 7, 2, 2));
	}
	
	@Test
	public void test0070() {
		A = new Integer[]{11, 5, 7};
		assertEquals(2, (int)(sorting.partitionWhenPivotAtStart(A, 0, 2)));
		System.out.println("test 0040: " + new ArrayList<Integer>(Arrays.asList(A)));
		assertTrue(areLowerOrEqual(A, 11, 0, 1));
	}
	
	@Test
	public void test0080() {
		A = new Integer[]{11, 7, 5};
		assertEquals(2, (int)(sorting.partitionWhenPivotAtStart(A, 0, 2)));
		System.out.println("test 0040: " + new ArrayList<Integer>(Arrays.asList(A)));
		assertTrue(areLowerOrEqual(A, 11, 0, 1));
	}
	
	@Test
	public void test0090() {
		A = new Integer[]{11, 7, 5};
		assertEquals(2, (int)(sorting.partitionWhenPivotAtStart(A, 0, 2)));
		System.out.println("test 0040: " + new ArrayList<Integer>(Arrays.asList(A)));
		assertTrue(areLowerOrEqual(A, 11, 0, 1));
	}
	
	@Test
	public void test0100() {
		A = new Integer[]{5, 5, 7};
		assertEquals(1, (int)(sorting.partitionWhenPivotAtStart(A, 0, 2)));
		System.out.println("test 0040: " + new ArrayList<Integer>(Arrays.asList(A)));
		assertTrue(areLowerOrEqual(A, 5, 0, 0));
		assertTrue(areBiggerOrEqual(A, 5, 2, 2));
	}
	
	@Test
	public void test0200() {
		A = new Integer[]{5, 5, 5, 7,};
		assertEquals(2, (int)(sorting.partitionWhenPivotAtStart(A, 0, 3)));
		System.out.println("test 0040: " + new ArrayList<Integer>(Arrays.asList(A)));
		assertTrue(areLowerOrEqual(A, 5, 0, 2));
		assertTrue(areBiggerOrEqual(A, 5, 3, 3));
	}
	
	@Test
	public void test0210() {
		A = new Integer[]{97, 97, 5, 5, 5, 7,};
		assertEquals(4, (int)(sorting.partitionWhenPivotAtStart(A, 2, 5)));
		System.out.println("test 0210: " + new ArrayList<Integer>(Arrays.asList(A)));
		assertTrue(areLowerOrEqual(A, 5, 2, 4));
		assertTrue(areBiggerOrEqual(A, 5, 5, 5));
	}
}
