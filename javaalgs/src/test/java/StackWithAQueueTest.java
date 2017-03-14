import static org.junit.Assert.*;

import org.junit.Test;


public class StackWithAQueueTest {

	StackWithAQueue<Integer> stack = new StackWithAQueue<Integer>();
	
	@Test(expected = IllegalStateException.class)
	public void test010() {
		assertEquals((Integer)0, stack.pop());
	}

	@Test
	public void test015() {
		assertEquals(0, stack.size());
	}
	
	@Test
	public void test016() {
		stack.push(1);
		assertEquals(1, stack.size());
	}
	
	@Test
	public void test020() {
		stack.push(1);
		assertEquals((Integer)1, stack.pop());
	}
	
	@Test
	public void test030() {
		stack.push(1);
		stack.push(2);
		assertEquals((Integer)2, stack.pop());
	}
	
	@Test
	public void test040() {
		stack.push(1);
		stack.push(2);
		stack.push(3);
		assertEquals((Integer)3, stack.pop());
		assertEquals((Integer)2, stack.pop());
	}
}
