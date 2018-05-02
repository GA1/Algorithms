import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class QueueOnArrayTest {

	
	QueueOnArray<Integer> queue = new QueueOnArray<Integer>(10);
	
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
	public void test040() {
		queue.enqueue(1);
		queue.dequeue();
		assertEquals(0, queue.size());
	}
	
	@Test
	public void test045() {
		queue = new QueueOnArray<Integer>(2);
		queue.enqueue(1);
		queue.enqueue(1);
		queue.dequeue();
		assertEquals(1, queue.size());
	}
	
	@Test
	public void test047() {
		queue = new QueueOnArray<Integer>(2);
		queue.enqueue(1);
		queue.enqueue(1);
		queue.dequeue();
		queue.enqueue(1);
		
		assertEquals(2, queue.size());
	}
	
	@Test(expected = IllegalStateException.class)
	public void test050() {
		queue = new QueueOnArray<Integer>(0);
		queue.enqueue(1);
	}
	
	@Test(expected = IllegalStateException.class)
	public void test060() {
		queue = new QueueOnArray<Integer>(2);
		queue.enqueue(1);
		queue.enqueue(1);
		queue.enqueue(1);
	}
	
	@Test(expected = IllegalStateException.class)
	public void test065() {
		queue = new QueueOnArray<Integer>(2);
		queue.dequeue();
	}
	
	@Test
	public void test070() {
		queue.enqueue(1);		
		assertEquals((Integer)1, queue.dequeue());
	}
	
	@Test
	public void test080() {
		queue.enqueue(1);
		queue.enqueue(2);
		queue.dequeue();
		assertEquals((Integer)2, queue.dequeue());
	}
	
	@Test
	public void test090() {
		queue = new QueueOnArray<Integer>(2);
		queue.enqueue(1);
		queue.dequeue();
		queue.enqueue(2);
		queue.dequeue();
		queue.enqueue(3);
		assertEquals((Integer)3, queue.dequeue());
	}	

}
