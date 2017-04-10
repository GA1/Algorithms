import org.junit.Test;

import static org.junit.Assert.assertEquals;


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
