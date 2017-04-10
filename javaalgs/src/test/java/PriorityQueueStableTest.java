import org.junit.Test;

import static org.junit.Assert.*;

public class PriorityQueueStableTest {

	private class A implements Comparable<A>{

		Integer number;
		String string;
		
		public A(Integer number, String string) {
			this.number = number;
			this.string = string;
		}
		
		@Override
		public int compareTo(A that) {
			return this.number.compareTo(that.number);			
		}
		

		@Override
		public String toString() {
			return string;
		}
		
	}
	
	PriorityQueueStable<Integer> pq1 = new PriorityQueueStable<Integer>();
	PriorityQueueStable<A> pq2 = new PriorityQueueStable<A>();
		
	
	@Test
	public void test010() {
		assertTrue(pq1.isEmpty());
		assertEquals((Integer)0, pq1.size());
	}

	@Test
	public void test020() {
		pq1.insert(1);
		assertFalse(pq1.isEmpty());
		assertEquals((Integer)1, pq1.size());
	}
	
	@Test
	public void test030() {
		pq1.insert(1);
		pq1.insert(2);
		assertFalse(pq1.isEmpty());
		assertEquals((Integer)2, pq1.size());
	}
	
	@Test
	public void test040() {
		pq1.insert(1);
		pq1.delMax();
		assertTrue(pq1.isEmpty());
		assertEquals((Integer)0, pq1.size());
	}

	@Test
	public void test050() {
		assertNull(pq1.delMax());
	}
	
	@Test
	public void test060() {
		pq1.insert(1);
		pq1.insert(2);
		pq1.delMax();
		assertFalse(pq1.isEmpty());
		assertEquals((Integer)1, pq1.size());
	}
	
	@Test
	public void test070() {
		pq1.insert(1);
		pq1.insert(2);
		pq1.delMax();
		assertFalse(pq1.isEmpty());
		assertEquals((Integer)1, pq1.size());
	}
	
	@Test
	public void test080() {
		pq1.insert(1);
		pq1.insert(2);
		pq1.insert(3);
		pq1.delMax();
		pq1.delMax();
		assertFalse(pq1.isEmpty());
		assertEquals((Integer)1, pq1.size());
	}
	
	
	@Test
	public void test100() {
		pq1.insert(2);
		pq1.insert(1);
		assertEquals((Integer)2, pq1.delMax());
	}
	
	@Test
	public void test110() {
		pq1.insert(1);
		pq1.insert(2);
		assertEquals((Integer)2, pq1.max());
		assertEquals((Integer)2, pq1.delMax());
		assertEquals((Integer)1, pq1.delMax());
	}
	
	@Test
	public void test120() {
		pq1.insert(1);
		pq1.insert(2);
		pq1.insert(3);
		assertEquals((Integer)3, pq1.max());
		assertEquals((Integer)3, pq1.delMax());
		assertEquals((Integer)2, pq1.delMax());
		assertEquals((Integer)1, pq1.delMax());
	}
	
	@Test
	public void test130() {
		pq1.insert(3);
		pq1.insert(2);
		pq1.insert(1);
		assertEquals((Integer)3, pq1.max());
		assertEquals((Integer)3, pq1.delMax());
		assertEquals((Integer)2, pq1.delMax());
		assertEquals((Integer)1, pq1.delMax());
	}
	
	@Test
	public void test135() {
		pq1.insert(1);
		pq1.insert(3);
		pq1.insert(2);
		assertEquals((Integer)3, pq1.delMax());
		assertEquals((Integer)2, pq1.delMax());
		assertEquals((Integer)1, pq1.delMax());
	}
	
	@Test
	public void test140() {
		pq1.insert(1);
		pq1.insert(3);
		pq1.insert(2);
		pq1.insert(4);
		assertEquals((Integer)4, pq1.max());
		assertEquals((Integer)4, pq1.delMax());
		assertEquals((Integer)3, pq1.delMax());
		assertEquals((Integer)2, pq1.delMax());
		assertEquals((Integer)1, pq1.delMax());
	}
	
	@Test
	public void test142() {
		pq1.insert(4);
		pq1.insert(3);
		pq1.insert(2);
		pq1.insert(1);
		assertEquals((Integer)4, pq1.max());
		assertEquals((Integer)4, pq1.delMax());
		assertEquals((Integer)3, pq1.delMax());
		assertEquals((Integer)2, pq1.delMax());
		assertEquals((Integer)1, pq1.delMax());
	}
	
	@Test
	public void test145() {
		pq1.insert(1);
		pq1.insert(3);
		pq1.insert(2);
		pq1.insert(4);
		pq1.insert(5);
		assertEquals((Integer)5, pq1.delMax());
		assertEquals((Integer)4, pq1.delMax());
		assertEquals((Integer)3, pq1.delMax());
		assertEquals((Integer)2, pq1.delMax());
		assertEquals((Integer)1, pq1.delMax());
	}
	
	@Test
	public void test147() {
		pq1.insert(1);
		pq1.insert(3);
		pq1.insert(2);
		pq1.insert(4);
		pq1.insert(5);
		pq1.insert(6);
		pq1.insert(7);
		pq1.insert(8);
		pq1.insert(9);
		assertEquals((Integer)9, pq1.delMax());
		assertEquals((Integer)8, pq1.delMax());
		assertEquals((Integer)7, pq1.delMax());
		assertEquals((Integer)6, pq1.delMax());
		assertEquals((Integer)5, pq1.delMax());
		assertEquals((Integer)4, pq1.delMax());
		assertEquals((Integer)3, pq1.delMax());
		assertEquals((Integer)2, pq1.delMax());
		assertEquals((Integer)1, pq1.delMax());
	}
	
	@Test
	public void test148() {
		pq1.insert(3);
		pq1.insert(6);
		pq1.insert(1);
		pq1.insert(4);
		pq1.insert(7);
		pq1.insert(9);
		pq1.insert(2);
		pq1.insert(5);
		pq1.insert(8);
		assertEquals((Integer)9, pq1.delMax());
		assertEquals((Integer)8, pq1.delMax());
		assertEquals((Integer)7, pq1.delMax());
		assertEquals((Integer)6, pq1.delMax());
		assertEquals((Integer)5, pq1.delMax());
		assertEquals((Integer)4, pq1.delMax());
		assertEquals((Integer)3, pq1.delMax());
		assertEquals((Integer)2, pq1.delMax());
		assertEquals((Integer)1, pq1.delMax());
	}

	
	// STABILITY TESTS
	
	@Test
	public void test150() {
		pq2.insert(new A((Integer)1, "a"));
		pq2.insert(new A((Integer)1, "b"));
		
		assertEquals("a", pq2.delMax().string);
		assertEquals("b", pq2.delMax().string);
	}
	
	@Test
	public void test160() {
		pq2.insert(new A((Integer)1, "a"));
		pq2.insert(new A((Integer)1, "b"));
		pq2.insert(new A((Integer)1, "c"));
		
		assertEquals("a", pq2.delMax().string);
		assertEquals("b", pq2.delMax().string);
		assertEquals("c", pq2.delMax().string);
	}
	
	@Test
	public void test170() {
		pq2.insert(new A((Integer)1, "a"));
		pq2.insert(new A((Integer)1, "b"));
		pq2.insert(new A((Integer)1, "c"));
		pq2.insert(new A((Integer)1, "d"));
		
		assertEquals("a", pq2.delMax().string);
		assertEquals("b", pq2.delMax().string);
		assertEquals("c", pq2.delMax().string);
		assertEquals("d", pq2.delMax().string);
	}
}