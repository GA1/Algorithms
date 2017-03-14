import static org.junit.Assert.*;

import org.junit.Test;


public class LongestRowOf0sTest {

	
	int[][] A;
	
	@Test
	public void test010() {
		A = null;
		assertEquals(-1, LongestRowOf0s.of(A));
	}

	@Test
	public void test020() {
		A = new int[][]{{1}};
		assertEquals(0, LongestRowOf0s.of(A));
	}
	
	@Test
	public void test030() {
		A = new int[][]{{0}};
		assertEquals(0, LongestRowOf0s.of(A));
	}
	
	@Test
	public void test040() {
		A = new int[][]{{0, 0}, 
				        {1, 1}};
		assertEquals(0, LongestRowOf0s.of(A));
	}
	
	@Test
	public void test050() {
		A = new int[][]{{1, 1}, 
				        {0, 0}};
		assertEquals(1, LongestRowOf0s.of(A));
	}
	
	@Test
	public void test060() {
		A = new int[][]{{1, 0}, 
				        {0, 0}};
		assertEquals(1, LongestRowOf0s.of(A));
	}
	
	@Test
	public void test070() {
		A = new int[][]{{1, 0}, 
				        {1, 1}};
		assertEquals(0, LongestRowOf0s.of(A));
	}
	
	@Test
	public void test080() {
		A = new int[][]{{1, 1, 0}, 
				        {1, 0, 0},
						{0, 0, 0}};
		assertEquals(2, LongestRowOf0s.of(A));
	}
	
	@Test
	public void test090() {
		A = new int[][]{{1, 1, 0}, 
				        {0, 0, 0},
						{1, 0, 0}};
		assertEquals(1, LongestRowOf0s.of(A));
	}
}
