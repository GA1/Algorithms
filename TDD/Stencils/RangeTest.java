package tdd;
import static org.junit.Assert.*;

import org.junit.Test;


public class RangeTest {

	Range range;
	
	@Test
	public void test10() {
		range = new Range(1, 3);
		assertFalse(range.equals(null));
	}
	
	@Test
	public void test20() {
		range = new Range(1, 3);
		assertTrue(range.equals(range));
	}

}
