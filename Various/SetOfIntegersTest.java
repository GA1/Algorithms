import static org.junit.Assert.*;

import java.util.Iterator;

import org.junit.Test;


public class SetOfIntegersTest {

	
	SetOfIntegers set = new SetOfIntegers();
	SetOfIntegers set1 = new SetOfIntegers();
	SetOfIntegers set2 = new SetOfIntegers();
	SetOfIntegers result = new SetOfIntegers();;
	SetOfIntegers emptySet = new SetOfIntegers();;
	SetOfIntegers union = new SetOfIntegers();;
	Iterator<Integer> it;
	
	// EXISTS TEST
	
	@Test
	public void test010() {
		assertFalse(set.exists(1));
	}
	
	@Test
	public void test020() {
		set.add(1);
		assertTrue(set.exists(1));
	}
	
	@Test
	public void test030() {
		set.add(1);
		assertFalse(set.exists(2));
	}
	
	@Test
	public void test040() {
		set.add(1);
		set.remove(1);
		assertFalse(set.exists(1));
	}


	// SET TESTS
	
	@Test
	public void test050() {
		assertEquals((Integer)0, set.size());
	}
	
	@Test
	public void test060() {
		set.add(1);
		assertEquals((Integer)1, set.size());
	}
	
	@Test
	public void test070() {
		set.add(1);
		set.remove(1);
		assertEquals((Integer)0, set.size());
	}
	
	@Test
	public void test080() {
		set.add(1);
		set.add(2);
		assertEquals((Integer)2, set.size());
	}
	
	
	// ITERATOR TESTS
	
	@Test
	public void test090() {
		it = set.iterator();
		assertFalse(it.hasNext());
	}
	
	@Test
	public void test100() {
		set.add(1);
		set.add(2);
		it = set.iterator();
		assertEquals((Integer)1, it.next());
		assertEquals((Integer)2, it.next());
	}
	
	// ADD TEST
	@Test
	public void test110() {
		set.add(1);
		set.add(2);
		set.add(3);
		it = set.iterator();
		assertEquals((Integer)1, it.next());
		assertEquals((Integer)2, it.next());
		assertEquals((Integer)3, it.next());
	}
	
	@Test
	public void test115() {
		set.add(1);
		set.add(1);
		it = set.iterator();
		assertEquals((Integer)1, it.next());
		assertFalse(it.hasNext());
		assertEquals((Integer)1, set.size());
	}
	
	@Test
	public void test117() {
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		it = set.iterator();
		assertEquals((Integer)1, it.next());
		assertEquals((Integer)2, it.next());
		assertEquals((Integer)3, it.next());
		assertEquals((Integer)4, it.next());
		assertEquals((Integer)4, set.size());
	}
	
		// BINARY SEARCH TEST	
		@Test
		public void test120() {
			assertEquals(-1, set.indexOfCellWithBiggestNumberSmallerThanN(1));
		}
		
		@Test
		public void test130() {
			set.add(1);
			assertEquals(0, set.indexOfCellWithBiggestNumberSmallerThanN(2));
		}
		
		@Test
		public void test140() {
			set.add(5);
			set.add(10);
			assertEquals(-1, set.indexOfCellWithBiggestNumberSmallerThanN(4));
			assertEquals(0, set.indexOfCellWithBiggestNumberSmallerThanN(6));
			assertEquals(-2, set.indexOfCellWithBiggestNumberSmallerThanN(5));
			assertEquals(-2, set.indexOfCellWithBiggestNumberSmallerThanN(10));
		}
		
		@Test
		public void test150() {
			set.add(5);
			set.add(10);
			set.add(15);
			set.add(20);
			set.add(25);
			assertEquals(-1, set.indexOfCellWithBiggestNumberSmallerThanN(4));
			assertEquals(0, set.indexOfCellWithBiggestNumberSmallerThanN(6));
			assertEquals(1, set.indexOfCellWithBiggestNumberSmallerThanN(11));
			assertEquals(2, set.indexOfCellWithBiggestNumberSmallerThanN(16));
			assertEquals(3, set.indexOfCellWithBiggestNumberSmallerThanN(21));
			
			assertEquals(-2, set.indexOfCellWithBiggestNumberSmallerThanN(5));
			assertEquals(-2, set.indexOfCellWithBiggestNumberSmallerThanN(10));
			assertEquals(-2, set.indexOfCellWithBiggestNumberSmallerThanN(15));
			assertEquals(-2, set.indexOfCellWithBiggestNumberSmallerThanN(20));
			assertEquals(-2, set.indexOfCellWithBiggestNumberSmallerThanN(25));
		}
		
		@Test
		public void test160() {
			set.add(5);
			set.add(10);
			set.add(15);
			set.add(20);
			set.add(25);
			set.add(30);
			set.add(35);
			set.add(40);
			set.add(45);
			set.add(50);
			
			assertEquals(-1, set.indexOfCellWithBiggestNumberSmallerThanN(4));
			assertEquals(0, set.indexOfCellWithBiggestNumberSmallerThanN(6));
			assertEquals(1, set.indexOfCellWithBiggestNumberSmallerThanN(11));
			assertEquals(2, set.indexOfCellWithBiggestNumberSmallerThanN(16));
			assertEquals(3, set.indexOfCellWithBiggestNumberSmallerThanN(21));
			assertEquals(4, set.indexOfCellWithBiggestNumberSmallerThanN(26));
			assertEquals(5, set.indexOfCellWithBiggestNumberSmallerThanN(31));
			assertEquals(6, set.indexOfCellWithBiggestNumberSmallerThanN(36));
			assertEquals(7, set.indexOfCellWithBiggestNumberSmallerThanN(41));
			assertEquals(8, set.indexOfCellWithBiggestNumberSmallerThanN(46));
			assertEquals(9, set.indexOfCellWithBiggestNumberSmallerThanN(51));
			
			assertEquals(-2, set.indexOfCellWithBiggestNumberSmallerThanN(5));
			assertEquals(-2, set.indexOfCellWithBiggestNumberSmallerThanN(10));
			assertEquals(-2, set.indexOfCellWithBiggestNumberSmallerThanN(15));
			assertEquals(-2, set.indexOfCellWithBiggestNumberSmallerThanN(20));
			assertEquals(-2, set.indexOfCellWithBiggestNumberSmallerThanN(25));
			assertEquals(-2, set.indexOfCellWithBiggestNumberSmallerThanN(30));
			assertEquals(-2, set.indexOfCellWithBiggestNumberSmallerThanN(35));
			assertEquals(-2, set.indexOfCellWithBiggestNumberSmallerThanN(40));
			assertEquals(-2, set.indexOfCellWithBiggestNumberSmallerThanN(35));
			assertEquals(-2, set.indexOfCellWithBiggestNumberSmallerThanN(50));
		}
		
	// EQUALS TESTS
	@Test
	public void test170() {		
		
		assertTrue(set1.equals(set2));
	}
	
	@Test
	public void test180() {		
		set1.add(1);
		set2.add(1);		
		assertTrue(set1.equals(set2));
	}
	
	@Test
	public void test190() {		
		set1.add(1);
		set1.add(2);
		set2.add(1);
		set2.add(2);
		assertTrue(set1.equals(set2));
	}
	
	@Test
	public void test200() {		
		set1.add(1);
		assertFalse(set1.equals(set2));
	}
	
	@Test
	public void test210() {		
		set1.add(1);
		set2.add(2);		
		assertFalse(set1.equals(set2));
	}
	
	@Test
	public void test220() {		
		set1.add(1);
		set1.add(2);
		set2.add(1);
		set2.add(3);
		assertFalse(set1.equals(set2));
	}
	
	
	// INTERSECT TESTS
	
	@Test
	public void test230() {		
		assertTrue(emptySet.equals(set1.intersect(set2)));
	}
	
	@Test
	public void test235() {
		set1.add(1);
		assertEquals(emptySet, set1.intersect(set2));
		assertEquals(emptySet, set2.intersect(set1));
	}
	
	@Test
	public void test240() {
		set1.add(1);
		set2.add(1);
		result.add(1);
		assertEquals(result, set1.intersect(set2));
	}
	
	@Test
	public void test250() {
		set1.add(1);
		set2.add(2);
		assertTrue(emptySet.equals(set1.intersect(set2)));
	}
	
	@Test
	public void test260() {
		set1.add(1);
		set1.add(2);
		set2.add(1);
		set2.add(2);
		result.add(1);
		result.add(2);
		assertTrue(result.equals(set1.intersect(set2)));
	}
	
	@Test
	public void test270() {
		set1.add(1);
		set1.add(2);
		set2.add(1);
		set2.add(3);
		result.add(1);
		assertTrue(result.equals(set1.intersect(set2)));
	}
	
	@Test
	public void test280() {
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		
		set2.add(2);
		set2.add(4);
		
		result.add(2);
		result.add(4);
		assertTrue(result.equals(set1.intersect(set2)));
	}
	

	// DIFFERENCE TESTS
	
	@Test
	public void test290() {
		assertTrue(emptySet.equals(set1.difference(set2)));
	}
	
	@Test
	public void test300() {
		set1.add(1);
		set2.add(1);
		assertEquals(emptySet, set1.difference(set2));
	}
	
	@Test
	public void test310() {
		set1.add(1);
		set2.add(2);
		result.add(1);
		assertTrue(result.equals(set1.difference(set2)));
	}
	
	@Test
	public void test315() {		
		set2.add(2);
		set2.add(4);
		
		assertEquals(emptySet, set1.difference(set2));
	}
	
	@Test
	public void test320() {
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		
		set2.add(2);
		set2.add(4);
		
		result.add(1);
		result.add(3);
		assertTrue(result.equals(set1.difference(set2)));
	}

	
	// UNION TESTS
	
	@Test
	public void test322() {
		assertTrue(emptySet.equals(set1.union(set2)));
	}
	
	@Test
	public void test324() {
		set1.add(1);
		result.add(1);
		
		union = set1.union(set2);
		assertEquals(result.size(), union.size());
		assertTrue(result.equals(union));
	}
	
	@Test
	public void test326() {
		set1.add(1);
		set2.add(1);
		result.add(1);
		
		union = set1.union(set2);
		assertEquals(result.size(), union.size());
		assertTrue(result.equals(union));
	}
	
	@Test
	public void test328() {
		set1.add(1);
		
		set2.add(1);
		set2.add(2);
		
		result.add(1);
		result.add(2);
		
		union = set1.union(set2);
		assertEquals(result.size(), union.size());
		assertTrue(result.equals(union));
	}
	
	@Test
	public void test330() {
		set1.add(1);
		set1.add(3);
		
		set2.add(1);
		set2.add(2);
		
		result.add(1);
		result.add(2);
		result.add(3);
		
		union = set1.union(set2);
		assertEquals(result.size(), union.size());
		assertTrue(result.equals(union));
	}
	
	@Test
	public void test332() {
		set1.add(2);
		set1.add(4);
		set1.add(6);
		set1.add(8);
		set1.add(10);
		set1.add(12);
		
		set2.add(3);
		set2.add(6);
		set2.add(9);
		set2.add(12);
		set2.add(14);
		
		result.add(2);
		result.add(3);
		result.add(4);
		result.add(6);
		result.add(8);
		result.add(9);
		result.add(10);
		result.add(12);
		result.add(14);		
		
		union = set1.union(set2);
		assertEquals(result.size(), union.size());
		assertTrue(result.equals(union));
	}
	
	// SYMMETRIC DIFFERENCE TESTS
	
	@Test
	public void test338() {
		assertTrue(emptySet.equals(set1.symmetricDifference(set2)));
	}
	
	@Test
	public void test340() {
		set1.add(1);
		result.add(1);
		assertEquals(result, set1.symmetricDifference(set2));
	}
	
	@Test
	public void test350() {
		set1.add(1);
		
		set2.add(2);
		
		result.add(1);
		result.add(2);
		assertTrue(result.equals(set1.symmetricDifference(set2)));
	}
	
	
	// ISSUBSET TESTS
	
	@Test 
	public void test360() {
		assertTrue(set1.isSubset(set2));
		assertTrue(set2.isSubset(set1));
	}
	
	@Test 
	public void test370() {
		set1.add(1);
		assertFalse(set1.isSubset(set2));
		assertTrue(set2.isSubset(set1));
	}
	
	@Test 
	public void test380() {
		set1.add(1);
		set2.add(1);
		assertTrue(set1.isSubset(set2));
		assertTrue(set2.isSubset(set1));
	}
	
	@Test 
	public void test390() {
		set1.add(1);
		set1.add(2);
		set2.add(1);
		assertFalse(set1.isSubset(set2));
		assertTrue(set2.isSubset(set1));
	}
	
	@Test 
	public void test400() {
		set1.add(1);
		set1.add(2);
		set2.add(2);
		set2.add(3);
		assertFalse(set1.isSubset(set2));
		assertFalse(set2.isSubset(set1));
	}
	
	
	//	ISDISJOINTFROM
	
	@Test
	public void test410() {
		assertTrue(set1.isDisjointFrom(set2));
	}
	
	@Test
	public void test420() {
		set1.add(1);
		assertTrue(set1.isDisjointFrom(set2));
		assertTrue(set2.isDisjointFrom(set1));
	}
	
	@Test
	public void test430() {
		set1.add(1);
		set2.add(1);
		assertFalse(set1.isDisjointFrom(set2));
		assertFalse(set2.isDisjointFrom(set1));
	}
	
	@Test
	public void test440() {
		set1.add(1);
		set1.add(2);
		set2.add(1);
		assertFalse(set1.isDisjointFrom(set2));
		assertFalse(set2.isDisjointFrom(set1));
	}
	
	@Test
	public void test450() {
		set1.add(1);
		set1.add(2);
		set2.add(3);
		assertTrue(set1.isDisjointFrom(set2));
		assertTrue(set2.isDisjointFrom(set1));
	}
}











