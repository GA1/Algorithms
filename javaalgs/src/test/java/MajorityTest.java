import static org.junit.Assert.*;

import org.junit.Test;


public class MajorityTest {

	Majority majority = new Majority();
	int[] A;
	
	@Test
	public void test010() {
		A = new int[]{};
		assertEquals(-1, majority.of(A));
	}
	
	@Test
	public void test020() {
		A = new int[]{1};
		assertEquals(1, majority.of(A));
	}
	
	@Test
	public void test030() {
		A = new int[]{1, 1};
		assertEquals(1, majority.of(A));
	}
	
	@Test
	public void test040() {
		A = new int[]{1, 2};
		assertEquals(-1, majority.of(A));
	}
	
	@Test
	public void test050() {
		A = new int[]{1, 2, 1};
		assertEquals(1, majority.of(A));
	}
	
	@Test
	public void test060() {
		A = new int[]{1, 1, 2, 2, 4};
		assertEquals(-1, majority.of(A));
	}
	
	@Test
	public void test070() {
		A = new int[]{1, 1, 1, 1, 0, 2, 2};
		assertEquals(1, majority.of(A));
	}
	
	@Test
	public void test080() {
		A = new int[]{1, 1, 0, 2, 2, 2, 2};
		assertEquals(2, majority.of(A));
	}
	
	@Test
	public void test090() {
		A = new int[]{1, 1, 2, 2, 1, 1, 2, 2, 2};
		assertEquals(2, majority.of(A));
	}

	

}
