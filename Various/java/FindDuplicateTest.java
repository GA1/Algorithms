import static org.junit.Assert.*;

import org.junit.Test;


public class FindDuplicateTest {

	FindDuplicate findDuplicate = new FindDuplicate();
	int[] A;
	
	@Test
	public void test020() {
		A = new int[]{};
		assertFalse(findDuplicate.of(A));
	}
	
	@Test
	public void test030() {
		A = new int[]{1};
		assertFalse(findDuplicate.of(A));
	}
	
	@Test
	public void test040() {
		A = new int[]{1, 2};
		assertFalse(findDuplicate.of(A));
	}
	
	@Test
	public void test050() {
		A = new int[]{2, 2};
		assertTrue(findDuplicate.of(A));
	}
	
	@Test
	public void test060() {
		A = new int[]{9, 1, 2, 3, 4, 5, 6, 9, 7};
		assertTrue(findDuplicate.of(A));
	}

}
