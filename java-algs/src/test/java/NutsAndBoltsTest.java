import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class NutsAndBoltsTest {

	Integer[] A, B;
	
	Integer[] nuts;
	Integer[] bolts;
		
	NutsAndBolts solver = new NutsAndBolts();
	ArrayList<Integer> afterPivot;
	ArrayList<Integer> expectedAfterPivot;
	ArrayList<Integer> nutsAfter, boltsAfter; 
	
	int center; 
	
	
	@Test
	public void test0010() {
		A = new Integer[]{1};
		B = new Integer[]{1};
		center = solver.pivot(A, 0, 0, 1);
		afterPivot = new ArrayList<Integer>(Arrays.asList(A));
		assertEquals(0, center);
		expectedAfterPivot = new ArrayList<Integer>(Arrays.asList(B));
		assertEquals(expectedAfterPivot, afterPivot);
	}
	
	@Test
	public void test010() {
		nuts = new Integer[]{1};
		bolts = new Integer[]{1};
		solver.of(nuts, bolts);
		nutsAfter = new ArrayList<Integer>(Arrays.asList(nuts));
		boltsAfter = new ArrayList<Integer>(Arrays.asList(bolts)); 
		assertEquals(boltsAfter, nutsAfter);
	}
	
	@Test
	public void test020() {
		nuts = new Integer[]{1, 2};
		bolts = new Integer[]{1, 2};
		solver.of(nuts, bolts);
		nutsAfter = new ArrayList<Integer>(Arrays.asList(nuts));
		boltsAfter = new ArrayList<Integer>(Arrays.asList(bolts));
		assertTrue(isSorted(nuts));
		assertEquals(boltsAfter, nutsAfter);
	}
	
	@Test
	public void test030() {
		nuts = new Integer[]{1, 2};
		bolts = new Integer[]{2, 1};
		solver.of(nuts, bolts);
		nutsAfter = new ArrayList<Integer>(Arrays.asList(nuts));
		boltsAfter = new ArrayList<Integer>(Arrays.asList(bolts));
		assertTrue(isSorted(nuts));
		assertEquals(boltsAfter, nutsAfter);
	}
	
	
	
	private boolean isSorted(Integer[] A) { 
		for (int i = 0; i < A.length-1; i++)
			if (A[i] > A[i+1])
				return false;
		return true;
	}
}
