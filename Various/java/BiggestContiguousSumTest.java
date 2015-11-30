import static org.junit.Assert.*;

import org.junit.Test;


public class BiggestContiguousSumTest {

	int[] A;
	
	
	@Test
	public void test001() {
		A = null;
		assertEquals(-1, BiggestContiguousSum.find0OrClosestToZero(A));
	}
	
	@Test
	public void test002() {
		A = new int[]{};
		assertEquals(-1, BiggestContiguousSum.find0OrClosestToZero(A));
	}
	
	@Test
	public void test003() {
		A = new int[]{0};
		assertEquals(0, BiggestContiguousSum.find0OrClosestToZero(A));
	}
	
	@Test
	public void test004() {
		A = new int[]{1};
		assertEquals(0, BiggestContiguousSum.find0OrClosestToZero(A));
	}
	
	@Test
	public void test005() {
		A = new int[]{-1, 2};
		assertEquals(0, BiggestContiguousSum.find0OrClosestToZero(A));
	}
	
	@Test
	public void test006() {
		A = new int[]{-3, -1, 2, 4};
		assertEquals(1, BiggestContiguousSum.find0OrClosestToZero(A));
	}
	
	@Test
	public void test007() {
		A = new int[]{-3, -2, 1, 4};
		assertEquals(2, BiggestContiguousSum.find0OrClosestToZero(A));
	}
	
	@Test
	public void test015() {
		A = null;
		assertNull(BiggestContiguousSum.of(A, 0));
	}

	@Test
	public void test020() {
		A = new int[]{0};
		assertEquals((Integer)0, BiggestContiguousSum.of(A, 0));
	}
	
	@Test
	public void test030() {
		A = new int[]{1};
		assertEquals((Integer)0, BiggestContiguousSum.of(A, 0));
	}
	
	@Test
	public void test040() {
		A = new int[]{1, -1};
		assertEquals((Integer)0, BiggestContiguousSum.of(A, 0));
	}
	
	@Test
	public void test050() {
		A = new int[]{1, 1};
		assertEquals((Integer)0, BiggestContiguousSum.of(A, 0));
	}
	
	@Test
	public void test060() {
		A = new int[]{1, 1};
		assertEquals((Integer)1, BiggestContiguousSum.of(A, 1));
	}
	
	@Test
	public void test070() {
		A = new int[]{1, 1};
		assertEquals((Integer)2, BiggestContiguousSum.of(A, 2));
	}
	
	@Test
	public void test080() {
		A = new int[]{0, 2};
		assertEquals((Integer)2, BiggestContiguousSum.of(A, 2));
	}
	
	@Test
	public void test090() {
		A = new int[]{-2, -1, 2, 3};
		assertEquals((Integer)4, BiggestContiguousSum.of(A, 4));
	}
}
