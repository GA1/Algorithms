import static org.junit.Assert.*;

import org.junit.Test;


public class MatrixTest {

	private	Matrix A, B;
	private Matrix AT;
	private Matrix result;
	private Matrix expected;
	
	@Test(expected = IllegalArgumentException.class)
	public void test002() {
		A = new Matrix(null);
		assertEquals(A, B);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void test003() {
		A = new Matrix(new Integer[][]{});
		assertEquals(A, B);
	}
	
	@Test
	public void test005() {
		A = new Matrix(new Integer[][]{
								   {1, 2}
								   });
		B = new Matrix(new Integer[][]{
				   {1, 2}
				   });		
		assertEquals(A, B);
	}
	
	@Test
	public void test010() {
		A = new Matrix(new Integer[][]{
								   {1, 2},
								   {3, 4}
								   });
		B = new Matrix(new Integer[][]{
				   {1, 2},
				   {3, 4}
				   });		
		assertEquals(A, B);
	}

	@Test
	public void test020() {
		A = new Matrix(new Integer[][]{
								   {1, 2},
								   {3, 4}
								   });
		B = new Matrix(new Integer[][]{
				   {-1, 2},
				   {3, 4}
				   });		
		assertFalse(A.equals(B));
	}

	@Test
	public void test025() {
		A = new Matrix(new Integer[][]{
								   {1}
								   });
		String result = "[[1]]"; 
		assertEquals(result, A.toString());
	}
	
	@Test
	public void test030() {
		A = new Matrix(new Integer[][]{
								   {1, 2}
								   });
		String result = "[[1, 2]]"; 
		assertEquals(result, A.toString());
	}
	
	@Test
	public void test040() {
		A = new Matrix(new Integer[][]{
								   {1, 2}, 
								   {3, 4}
								   });
		String result = "[[1, 2], [3, 4]]"; 
		assertEquals(result, A.toString());
	}
	
	@Test
	public void test050() {
		A = new Matrix(new Integer[][]{
								   {1, 2, 3}, 
								   {4, 5, 6},
								   {7, 8, 9}
								   });
		String result = "[[1, 2, 3], [4, 5, 6], [7, 8, 9]]"; 
		assertEquals(result, A.toString());
	}
	
	@Test
	public void test055() {
		A = new Matrix(new Integer[][]{
				   {1}
				   });
		AT = new Matrix(new Integer[][]{
				   {1}
				   });
		assertEquals(AT, A.transpose());
	}
	
	@Test
	public void test060() {
		A = new Matrix(new Integer[][]{
				   {1, 2}
				   });
		AT = new Matrix(new Integer[][]{
				   {1},
				   {2}
				   });
		assertEquals(AT, A.transpose());
	}
	
	@Test
	public void test070() {
		A = new Matrix(new Integer[][]{
				   {1, 2},
				   {3, 4}
				   });
		AT = new Matrix(new Integer[][]{
				   {1, 3},
				   {2, 4}
				   });
		assertEquals(AT, A.transpose());
	}
	
	@Test
	public void test080() {
		A = new Matrix(new Integer[][]{
				   {1, 2, 3},
				   {4, 5, 6}
				   });
		AT = new Matrix(new Integer[][]{
				   {1, 4},
				   {2, 5},
				   {3, 6},
				   });
		assertEquals(AT, A.transpose());
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void test090() {
		A = new Matrix(new Integer[][]{
				   {1, 2}
				   });				  
		B = new Matrix(new Integer[][]{
				   {1, 2}
				   });
		A.multiply(B);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void test100() {
		A = new Matrix(new Integer[][]{
				   {1},
				   {2}
				   });			  
		B = new Matrix(new Integer[][]{
				   {1},
				   {2}
				   });
		A.multiply(B);
	}
	
	@Test
	public void test110() {
		A = new Matrix(new Integer[][]{
				   {1},
				   {2}
				   });			  
		B = new Matrix(new Integer[][]{
				   {1, 2}
				   });
		expected = new Matrix(new Integer[][]{
				   {1, 2},
				   {2, 4}
				   });
		result = A.multiply(B);
		assertEquals(expected, result);
	}
	
	@Test
	public void test120() {
		A = new Matrix(new Integer[][]{
				   {1, 2}
				   });
		B = new Matrix(new Integer[][]{
				{1},
				{2}
		});			  
		expected = new Matrix(new Integer[][]{
				   {5}				   
				   });
		result = A.multiply(B);
		assertEquals(expected, result);
	}
}












