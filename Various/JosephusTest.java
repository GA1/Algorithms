import static org.junit.Assert.*;

import org.junit.Test;


public class JosephusTest {

	Josephus josephus = new Josephus();
	String[] input;
	String[] result;
	
	@Test
	public void test010() {
		assertNull(josephus.of(null, 5));
	}
	
	@Test
	public void test020() {
		input = new String[]{"A"};
		result = new String[]{"A"};
		assertEquals(result, josephus.of(input, 5));
	}

	@Test
	public void test030() {
		input = new String[]{"A", "B"};
		result = new String[]{"A", "B"};
		assertEquals(result, josephus.of(input, 3));
	}
	
	@Test
	public void test040() {
		input = new String[]{"A", "B", "C"};
		result = new String[]{"B", "A", "C"};
		assertEquals(result, josephus.of(input, 2));
	}
	
	@Test
	public void test050() {
		input = new String[]{"A", "B", "C"};
		result = new String[]{"C", "A", "B"};
		assertEquals(result, josephus.of(input, 3));
	}
}
