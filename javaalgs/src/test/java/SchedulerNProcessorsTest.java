import static org.junit.Assert.*;

import org.junit.Test;


public class SchedulerNProcessorsTest {

	
	SchedulerNProcessors testSubject = new SchedulerNProcessors();
	
	@Test
	public void test010() {
		assertEquals((Integer)3, testSubject.schedule(new Integer[]{3}, 1));
	}

	@Test
	public void test020() {
		assertEquals((Integer)4, testSubject.schedule(new Integer[]{4}, 2));
	}
	
	@Test
	public void test025() {
		assertEquals((Integer)11, testSubject.schedule(new Integer[]{3, 5, 3}, 1));
	}
	
	@Test
	public void test030() {
		assertEquals((Integer)6, testSubject.schedule(new Integer[]{3, 5, 3}, 2));
	}
	
	@Test
	public void test040() {
		assertEquals((Integer)11, testSubject.schedule(new Integer[]{3, 5, 3, 5, 3}, 2));
	}
}
