import org.junit.Test;

import java.util.NoSuchElementException;

import static org.junit.Assert.assertEquals;


public class QueueWithTwoStacksTest {

	QueueWithTwoStacks<Integer> queue = new QueueWithTwoStacks<Integer>(); 
	
	@Test
	public void test010() {
		assertEquals(0, queue.size());
	}

	@Test
	public void test020() {
		queue.enqueue(1);
		assertEquals(1, queue.size());
	}
	
	@Test
	public void test030() {
		queue.enqueue(1);
		queue.enqueue(2);
		assertEquals(2, queue.size());
	}
	
	@Test
	public void test035() {
		queue.enqueue(1);
		queue.dequeue();
		assertEquals(0, queue.size());
	}
	
	@Test(expected = NoSuchElementException.class)
	public void test040() {
		queue.dequeue();
	}
	
	@Test(expected = NoSuchElementException.class)
	public void test045() {
		queue.enqueue(1);
		queue.enqueue(2);
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
	}
	
	@Test
	public void test050() {
		queue.enqueue(1);
		assertEquals((Integer)1, queue.dequeue());		
	}
	
	@Test
	public void test060() {
		queue.enqueue(1);
		queue.enqueue(2);
		assertEquals((Integer)1, queue.dequeue());		
	}
	
	@Test
	public void test070() {
		queue.enqueue(1);
		queue.enqueue(2);
		queue.dequeue();
		assertEquals((Integer)2, queue.dequeue());		
	}
	
	@Test
	public void test080() {
		queue.enqueue(1);
		queue.enqueue(2);
		assertEquals((Integer)1, queue.dequeue());		
	}
}
