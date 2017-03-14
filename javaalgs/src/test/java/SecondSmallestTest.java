import static org.junit.Assert.*;

import org.junit.Test;


public class SecondSmallestTest {

	SecondSmallest secondSmallest = new SecondSmallest();
	int[] A;
	
	@Test
	public void test010() {
		A = new int[]{};
		assertEquals(-1, secondSmallest.of(A));
	}

	@Test
	public void test020() {
		A = new int[]{1};
		assertEquals(-1, secondSmallest.of(A));
	}

}
