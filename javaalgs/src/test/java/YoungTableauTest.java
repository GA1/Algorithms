import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;


public class YoungTableauTest {

	YoungTableau youngTableau = new YoungTableau();
	Integer[][] A;
	Integer[][] result;
	Integer[][] expected;
	
	@Test
	public void test010() {
		A = null;
		assertNull(youngTableau.of(A, 1, 1));
	}
	
	@Test
	public void test020() {
		A = new Integer[][]{
				 {1, 2},
				 {4, 5}
			   };
		expected = new Integer[][]{
				 {1, 5},
				 {4, -1}
			   };
		result = youngTableau.of(A, 0, 1);				
		assertEquals(expected, result);
	}
	
	@Test
	public void test030() {
		A = new Integer[][]{
				 {1, 2},
				 {4, 5},
				 {6, 7}
			   };
		expected = new Integer[][]{
				 {1, 2},
				 {4, 7},
				 {6, -1}
			   };
		result = youngTableau.of(A, 1, 1);		
		assertEquals(expected, result);
	}
	
	@Test
	public void test040() {
		A = new Integer[][]{
				 {1, 2, 3},
				 {4, 5, 6}
			   };
		expected = new Integer[][]{
				 {1, 2, 6},
				 {4, 5, -1}
			   };
		result = youngTableau.of(A, 0, 2);				
		assertEquals(expected, result);
	}
	
	@Test
	public void test050() {
		A = new Integer[][]{
				 {1, 2, 3},
				 {4, 5, 6},
				 {7, 8, 9}
			   };
		expected = new Integer[][]{
				 {1, 2, 3},
				 {4, 5, 9},
				 {7, 8, -1}
			   };
		result = youngTableau.of(A, 1, 2);		
		assertEquals(expected, result);
	}

	@Test
	public void test060() {
		A = new Integer[][]{
				 {1, 2},
				 {4, 5}
			   };
		expected = new Integer[][]{
				 {1, 2},
				 {5, -1}
			   };
		result = youngTableau.of(A, 1, 0);				
		assertEquals(expected, result);
	}
	
	@Test
	public void test070() {
		A = new Integer[][]{
				 {0, 3, 6},
				 {9, 12, 15},
				 {10, 11, 24}
			   };
		expected = new Integer[][]{
				 {0, 3, 6},
				 {9, 12, 15},
				 {10, 11, 24}
			   };
		result = youngTableau.of(A, 1, 0);				
		assertEquals(expected, result);
	}
}
