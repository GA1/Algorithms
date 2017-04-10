import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class DequeTest {

	Deque<Integer> deque = new Deque<Integer>();
	
	@Test
	public void test010() {
		assertEquals(0, deque.size());
	}

	@Test
	public void test020() {
		deque.addFirst(1);
		assertEquals(1, deque.size());
	}
	
	@Test
	public void test030() {
		deque.addLast(1);
		assertEquals(1, deque.size());
	}
	
	@Test
	public void test040() {
		deque.addFirst(1);
		deque.addFirst(1);
		deque.removeFirst();
		assertEquals(1, deque.size());
	}
	
	@Test
	public void test050() {
		deque.addLast(1);
		deque.addLast(1);
		deque.removeLast();
		assertEquals(1, deque.size());
	}
}
