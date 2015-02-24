import static org.junit.Assert.*;

import org.junit.Test;


public class StequeTest {

	Steque<Integer> steque = new Steque<Integer>();
	
	@Test(expected = IllegalStateException.class)
	public void test005() {
		steque.pop();
	}
	
	@Test
	public void test010() {
		assertEquals(0, steque.size());
	}
	
	@Test
	public void test020() {
		steque.push(1);
		assertEquals(1, steque.size());
	}
	
	@Test
	public void test030() {
		steque.enqueue(1);
		assertEquals(1, steque.size());
	}

	@Test
	public void test040() {
		steque.enqueue(1);
		steque.pop();
		assertEquals(0, steque.size());
	}
	
	@Test
	public void test050() {
		steque.enqueue(1);
		steque.enqueue(2);
		steque.pop();
		assertEquals(1, steque.size());
	}
	
	@Test
	public void test060() {
		steque.push(1);
		steque.push(1);
		steque.pop();
		assertEquals(1, steque.size());
	}
	
	@Test
	public void test070() {
		steque.enqueue(1);
		steque.enqueue(2);
		assertEquals((Integer)1, steque.pop());
	}
	
	@Test
	public void test080() {
		steque.enqueue(1);
		steque.enqueue(2);
		steque.pop();
		assertEquals((Integer)2, steque.pop());
	}
	
	@Test
	public void test090() {
		steque.push(1);
		steque.push(2);
		assertEquals((Integer)2, steque.pop());
	}
	
	@Test
	public void test100() {
		steque.push(1);
		steque.push(2);
		steque.pop();
		assertEquals((Integer)1, steque.pop());
	}
	
	@Test
	public void test110() {
		steque.push(1);
		steque.enqueue(2);
		steque.push(3);
		steque.enqueue(4);		
		assertEquals((Integer)3, steque.pop());
		assertEquals((Integer)1, steque.pop());
		assertEquals((Integer)2, steque.pop());
		assertEquals((Integer)4, steque.pop());
	}
}
