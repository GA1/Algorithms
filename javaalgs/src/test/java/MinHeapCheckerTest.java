import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;


public class MinHeapCheckerTest {

	
	private Integer[] MinHeap;

	MinHeapChecker checker = new MinHeapChecker();
	
	@Test
	public void test015() {
		MinHeap = new Integer[]{};
		assertTrue(checker.check(MinHeap, 0));
	}

	@Test
	public void test016() {
		MinHeap = new Integer[]{1};
		assertTrue(checker.check(MinHeap, 1));
	}
	
	@Test
	public void test020() {
		MinHeap = new Integer[]{2, 1};
		assertTrue(checker.check(MinHeap, 1));
	}
	
	@Test
	public void test03() {
		MinHeap = new Integer[]{2, 1};
		assertFalse(checker.check(MinHeap, 2));
	}
	
	@Test
	public void test040() {
		MinHeap = new Integer[]{2, 3, 1};
		assertTrue(checker.check(MinHeap, 2));
	}
	
	@Test
	public void test050() {
		MinHeap = new Integer[]{2, 3, 1};
		assertFalse(checker.check(MinHeap, 3));
	}
	
	@Test
	public void test060() {
		MinHeap = new Integer[]{1, 2, 3};
		assertTrue(checker.check(MinHeap, 3));
	}
	
	@Test
	public void test070() {
		MinHeap = new Integer[]{1, 2, 3, 2};
		assertTrue(checker.check(MinHeap, 3));
	}
	
	@Test
	public void test080() {
		MinHeap = new Integer[]{1, 2, 3, 1};
		assertFalse(checker.check(MinHeap, 4));
	}
	
	@Test
	public void test090() {
		MinHeap = new Integer[]{1, 2, 3, 2};
		assertTrue(checker.check(MinHeap, 4));
	}
	
	@Test
	public void test100() {
		MinHeap = new Integer[]{1, 2, 3, 3, 4, 6, 7};
		assertTrue(checker.check(MinHeap, 7));
	}
	
	@Test
	public void test110() {
		MinHeap = new Integer[]{1, 2, 3, 3, 4, 6, 2};
		assertFalse(checker.check(MinHeap, 7));
	}
}
