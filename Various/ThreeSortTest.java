import static org.junit.Assert.*;

import org.junit.Test;


public class ThreeSortTest {

	@Test
	public void test010() {
		assertEquals(1, ThreeSort.of(1, 1, 1)[0]);
		assertEquals(1, ThreeSort.of(1, 1, 1)[1]);
		assertEquals(1, ThreeSort.of(1, 1, 1)[2]);
	}
	
	@Test
	public void test020() {
		assertEquals(1, ThreeSort.of(1, 2, 3)[0]);
		assertEquals(2, ThreeSort.of(1, 2, 3)[1]);
		assertEquals(3, ThreeSort.of(1, 2, 3)[2]);
	}

	@Test
	public void test030() {
		assertEquals(1, ThreeSort.of(3, 2, 1)[0]);
		assertEquals(2, ThreeSort.of(3, 2, 1)[1]);
		assertEquals(3, ThreeSort.of(3, 2, 1)[2]);
	}
}
