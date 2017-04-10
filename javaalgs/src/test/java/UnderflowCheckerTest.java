import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class UnderflowCheckerTest {

	String[] pushAndPops;
	
	@Test
	public void test010() {
		pushAndPops = new String[]{};
		assertFalse(UnderflowChecker.check(pushAndPops));
	}
	
	@Test
	public void test020() {
		pushAndPops = new String[]{"+"};
		assertFalse(UnderflowChecker.check(pushAndPops));
	}
	
	@Test
	public void test030() {
		pushAndPops = new String[]{"-"};
		assertTrue(UnderflowChecker.check(pushAndPops));
	}
	
	@Test
	public void test040() {
		pushAndPops = new String[]{"+", "-"};
		assertFalse(UnderflowChecker.check(pushAndPops));
	}

	@Test
	public void test050() {
		pushAndPops = new String[]{"-", "+"};
		assertTrue(UnderflowChecker.check(pushAndPops));
	}
}
