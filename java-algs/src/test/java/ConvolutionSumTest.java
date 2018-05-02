import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class ConvolutionSumTest {

	
	int[] A;
	
	@Test
	public void test010() {
		assertFalse(ConvolutionSum.of(null));
	}
	
	@Test
	public void test020() {
		A = new int[]{};
		assertFalse(ConvolutionSum.of(A));
	}

	@Test
	public void test030() {
		A = new int[]{1};
		assertFalse(ConvolutionSum.of(A));
	}
	
	@Test
	public void test040() {
		A = new int[]{1, 1, 2};
		assertTrue(ConvolutionSum.of(A));
	}
	
	@Test
	public void test050() {
		A = new int[]{2, 1, 1};
		assertTrue(ConvolutionSum.of(A));
	}
	
	@Test
	public void test060() {
		A = new int[]{1, 2, 1};
		assertTrue(ConvolutionSum.of(A));
	}
}
