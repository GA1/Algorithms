import static org.junit.Assert.*;

import org.junit.Test;


public class MedianTest {

	Integer[] A; 
	
	Median median = new Median();
	
	
	
	@Test
	public void test010() {
		A = null;
		insert(A, median);
		assertNull(median.of());
	}
	
	private void insert(Integer[] A, Median median) {
		if (A != null) 
			for (int i = 0; i < A.length; i++)
				median.insert(A[i]);
	}

	@Test
	public void test020() {
		A = new Integer[]{};
		insert(A, median);
		assertNull(median.of());
	}

	@Test
	public void test030() {
		A = new Integer[]{1};
		insert(A, median);
		assertEquals((Double)1.0, median.of());
	}
	
	@Test
	public void test035() {
		A = new Integer[]{1, 3};
		insert(A, median);
		assertEquals((Double)2.0, median.of());
	}
	
	@Test
	public void test037() {
		A = new Integer[]{3, 1};
		insert(A, median);
		assertEquals((Double)2.0, median.of());
	}
	
	@Test
	public void test040() {
		A = new Integer[]{1, 2, 3};
		insert(A, median);
		assertEquals((Double)2.0, median.of());
	}
	
	@Test
	public void test050() {
		A = new Integer[]{1, 3, 2};
		insert(A, median);
		assertEquals((Double)2.0, median.of());
	}
	
	@Test
	public void test060() {
		A = new Integer[]{3, 2, 1};
		insert(A, median);
		assertEquals((Double)2.0, median.of());
	}
	
	
	@Test
	public void test070() {
		A = new Integer[]{3, 1, 2};
		insert(A, median);
		assertEquals((Double)2.0, median.of());
	}
	
	@Test
	public void test080() {
		A = new Integer[]{2, 1, 3};
		insert(A, median);
		assertEquals((Double)2.0, median.of());
	}
	
	@Test
	public void test090() {
		A = new Integer[]{2, 3, 1};
		insert(A, median);
		assertEquals((Double)2.0, median.of());
	}
	
	@Test
	public void test100() {
		A = new Integer[]{1, 2, 3, 4};
		insert(A, median);
		assertEquals((Double)2.5, median.of());
	}
	
	@Test
	public void test110() {
		A = new Integer[]{1, 2, 3, 4, 5};
		insert(A, median);
		assertEquals((Double)3.0, median.of());
	}
	
	@Test
	public void test120() {
		A = new Integer[]{1, 1, 1};
		insert(A, median);
		assertEquals((Double)1.0, median.of());
	}
	
	@Test
	public void test130() {
		A = new Integer[]{1, 1};
		insert(A, median);
		assertEquals((Double)1.0, median.of());
	}
	
	@Test
	public void test140() {
		A = new Integer[]{1, 1, 1, 1};
		insert(A, median);
		assertEquals((Double)1.0, median.of());
	}
}
