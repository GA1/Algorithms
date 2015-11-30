import static org.junit.Assert.*;

import org.junit.Test;


public class PriorityQueueTest {

	
	PriorityQueue pq = new PriorityQueue();
		
	
	@Test
	public void test010() {
		assertTrue(pq.isEmpty());
		assertEquals((Integer)0, pq.size());
	}

	@Test
	public void test020() {
		pq.insert(1);
		assertFalse(pq.isEmpty());
		assertEquals((Integer)1, pq.size());
	}
	
	@Test
	public void test030() {
		pq.insert(1);
		pq.insert(2);
		assertFalse(pq.isEmpty());
		assertEquals((Integer)2, pq.size());
	}
	
	@Test
	public void test040() {
		pq.insert(1);
		pq.delMax();
		assertTrue(pq.isEmpty());
		assertEquals((Integer)0, pq.size());
	}

	@Test
	public void test050() {
		assertNull(pq.delMax());
	}
	
	@Test
	public void test060() {
		pq.insert(1);
		pq.insert(2);
		pq.delMax();
		assertFalse(pq.isEmpty());
		assertEquals((Integer)1, pq.size());
	}
	
	@Test
	public void test070() {
		pq.insert(1);
		pq.insert(2);
		pq.delMax();
		assertFalse(pq.isEmpty());
		assertEquals((Integer)1, pq.size());
	}
	
	@Test
	public void test080() {
		pq.insert(1);
		pq.insert(2);
		pq.insert(3);
		pq.delMax();
		pq.delMax();
		assertFalse(pq.isEmpty());
		assertEquals((Integer)1, pq.size());
	}
	
	
	@Test
	public void test100() {
		pq.insert(2);
		pq.insert(1);
		assertEquals((Integer)2, pq.delMax());
	}
	
	@Test
	public void test110() {
		pq.insert(1);
		pq.insert(2);
		assertEquals((Integer)2, pq.max());
		assertEquals((Integer)2, pq.delMax());
		assertEquals((Integer)1, pq.delMax());
	}
	
	@Test
	public void test120() {
		pq.insert(1);
		pq.insert(2);
		pq.insert(3);
		assertEquals((Integer)3, pq.max());
		assertEquals((Integer)3, pq.delMax());
		assertEquals((Integer)2, pq.delMax());
		assertEquals((Integer)1, pq.delMax());
	}
	
	@Test
	public void test130() {
		pq.insert(3);
		pq.insert(2);
		pq.insert(1);
		assertEquals((Integer)3, pq.max());
		assertEquals((Integer)3, pq.delMax());
		assertEquals((Integer)2, pq.delMax());
		assertEquals((Integer)1, pq.delMax());
	}
	
	@Test
	public void test135() {
		pq.insert(1);
		pq.insert(3);
		pq.insert(2);
		assertEquals((Integer)3, pq.delMax());
		assertEquals((Integer)2, pq.delMax());
		assertEquals((Integer)1, pq.delMax());
	}
	
	@Test
	public void test140() {
		pq.insert(1);
		pq.insert(3);
		pq.insert(2);
		pq.insert(4);
		assertEquals((Integer)4, pq.max());
		assertEquals((Integer)4, pq.delMax());
		assertEquals((Integer)3, pq.delMax());
		assertEquals((Integer)2, pq.delMax());
		assertEquals((Integer)1, pq.delMax());
	}
	
	@Test
	public void test142() {
		pq.insert(4);
		pq.insert(3);
		pq.insert(2);
		pq.insert(1);
		assertEquals((Integer)4, pq.max());
		assertEquals((Integer)4, pq.delMax());
		assertEquals((Integer)3, pq.delMax());
		assertEquals((Integer)2, pq.delMax());
		assertEquals((Integer)1, pq.delMax());
	}
	
	@Test
	public void test145() {
		pq.insert(1);
		pq.insert(3);
		pq.insert(2);
		pq.insert(4);
		pq.insert(5);
		assertEquals((Integer)5, pq.delMax());
		assertEquals((Integer)4, pq.delMax());
		assertEquals((Integer)3, pq.delMax());
		assertEquals((Integer)2, pq.delMax());
		assertEquals((Integer)1, pq.delMax());
	}
	
	@Test
	public void test147() {
		pq.insert(1);
		pq.insert(3);
		pq.insert(2);
		pq.insert(4);
		pq.insert(5);
		pq.insert(6);
		pq.insert(7);
		pq.insert(8);
		pq.insert(9);
		assertEquals((Integer)9, pq.delMax());
		assertEquals((Integer)8, pq.delMax());
		assertEquals((Integer)7, pq.delMax());
		assertEquals((Integer)6, pq.delMax());
		assertEquals((Integer)5, pq.delMax());
		assertEquals((Integer)4, pq.delMax());
		assertEquals((Integer)3, pq.delMax());
		assertEquals((Integer)2, pq.delMax());
		assertEquals((Integer)1, pq.delMax());
	}
	
	@Test
	public void test148() {
		pq.insert(3);
		pq.insert(6);
		pq.insert(1);
		pq.insert(4);
		pq.insert(7);
		pq.insert(9);
		pq.insert(2);
		pq.insert(5);
		pq.insert(8);
		assertEquals((Integer)9, pq.delMax());
		assertEquals((Integer)8, pq.delMax());
		assertEquals((Integer)7, pq.delMax());
		assertEquals((Integer)6, pq.delMax());
		assertEquals((Integer)5, pq.delMax());
		assertEquals((Integer)4, pq.delMax());
		assertEquals((Integer)3, pq.delMax());
		assertEquals((Integer)2, pq.delMax());
		assertEquals((Integer)1, pq.delMax());
	}
	
}
