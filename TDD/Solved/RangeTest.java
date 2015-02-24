
package tdd.tdd1;
import static org.junit.Assert.*;

import org.junit.Test;


public class RangeTest {

	private Range range;
	private Range range1;
	private Range range2;
	private Range emptyRange = new Range(0,0);
	private Range intersection;
	
	@Test
	public void test10() {
		range = new Range(1, 3);
		assertFalse(range.equals(null));
	}
	
	@Test
	public void test20() {
		range = new Range(1, 3);
		assertTrue(range.equals(range));
	}
	
	@Test
	public void test30() {
		range1 = new Range(1, 3);
		range2 = new Range(1, 3);
		assertTrue(range1.equals(range2));
	}

	@Test
	public void test40() {
		range1 = new Range(1, 3);
		range2 = new Range(0, 3);
		assertFalse(range1.equals(range2));
	}
	
	@Test
	public void test50() {
		range1 = new Range(1, 3);
		range2 = new Range(1, 4);
		assertFalse(range1.equals(range2));
	}
	
	@Test
	public void test60() {
		range1 = new Range(2, 3);
		range2 = new Range(1, 4);
		assertFalse(range1.equals(range2));
	}
	
	@Test
	public void test70() {
		range1 = new Range(0, 0);
		range2 = new Range(1, 1);
		assertTrue(range1.equals(range2));
	}
	
	@Test
	public void test80() {
		range1 = new Range(6, 12);
		assertEquals("[6, 12)", range1.toString());
	}
	
	@Test
	public void test90() {
		assertEquals("emptyRange", emptyRange.toString());
	}
	
	@Test
	public void test100() {
		assertEquals(emptyRange, emptyRange.intersection(emptyRange));
	}
	
	@Test
	public void test110() {
		range = new Range(1, 4);
		assertEquals(emptyRange, emptyRange.intersection(range));
	}
	
	@Test
	public void test120() {
		range1 = new Range(1, 4);
		range2 = new Range(1, 4);
		intersection = new Range(1, 4);
		assertEquals(intersection, range1.intersection(range2));
	}
	
	@Test
	public void test130() {
		range1 = new Range(1, 5);        // {1, 2, 3, 4, 5}
		range2 = new Range(1, 4);		 // {1, 2, 3, 4}
		intersection = new Range(1, 4);  // {1, 2, 3, 4}
		assertEquals(intersection, range1.intersection(range2));
	}
	
	@Test
	public void test140() {
		range1 = new Range(1, 4);        // {1, 2, 3, 4}
		range2 = new Range(1, 5);		 // {1, 2, 3, 4, 5}
		intersection = new Range(1, 4);  // {1, 2, 3, 4}
		assertEquals(intersection, range1.intersection(range2));
	}
	
	@Test
	public void test150() {
		range1 = new Range(2, 4);        //    {2, 3, 4}
		range2 = new Range(1, 4);		 // {1, 2, 3, 4}
		intersection = new Range(2, 4);  //    {2, 3, 4}
		assertEquals(intersection, range1.intersection(range2));
	}
	
	@Test
	public void test160() {
		range1 = new Range(1, 4);        //    {2, 3, 4}
		range2 = new Range(2, 4);		 // {1, 2, 3, 4}
		intersection = new Range(2, 4);  //    {2, 3, 4}
		assertEquals(intersection, range1.intersection(range2));
	}
	
	@Test
	public void test170() {
		range1 = new Range(3, 6);        //       {3, 4, 5}
		range2 = new Range(2, 4);		 // {1, 2, 3, 4}
		intersection = new Range(3, 4);  //       {3, 4}
		assertEquals(intersection, range1.intersection(range2));
	}
	
	@Test
	public void test180() {
		range1 = new Range(3, 5);        //       {3, 4}
		range2 = new Range(6, 8);		 //                {6, 7}
		intersection = emptyRange; 		 //             { }
		assertEquals(intersection, range1.intersection(range2));
	}
	
	@Test
	public void test190() {
		range1 = new Range(6, 8);		 //                {6, 7}
		range2 = new Range(3, 5);        //       {3, 4}
		intersection = emptyRange; 		 //             { }
		assertEquals(intersection, range1.intersection(range2));
	}
	
	@Test
	public void test200() {
		range1 = new Range(4, 8);		 //               {4, 7}
		range2 = new Range(3, 5);        //       {3, 4}
		intersection = new Range(4, 5);  //             {4}
		assertEquals(intersection, range1.intersection(range2));
	}
}






