import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.junit.Test;


public class PointSETTest {

	private PointSET pointSET = new PointSET(); 
	private Set<Point2D> expected = new HashSet<Point2D>();
	
	@Test
	public void test0010() {
		assertEquals(0, pointSET.size());
	}
	
	@Test
	public void test0020() {
		pointSET.insert(new Point2D(1, 2));
		assertEquals(1, pointSET.size());
	}

	@Test
	public void test0030() {
		pointSET.insert(new Point2D(1, 2));
		pointSET.insert(new Point2D(1, 3));
		assertEquals(2, pointSET.size());
	}
	
	@Test
	public void test0040() {
		pointSET.insert(new Point2D(1, 2));
		pointSET.insert(new Point2D(1, 3));
		assertEquals(2, pointSET.size());
	}
	
	@Test
	public void test0050() {
		pointSET.insert(new Point2D(1, 2));
		pointSET.insert(new Point2D(1, 2));
		assertEquals(1, pointSET.size());
	}
	
	@Test
	public void test0060() {
		pointSET.insert(new Point2D(1, 2));
		pointSET.insert(new Point2D(1, 3));
		pointSET.insert(new Point2D(1, 2));
		assertEquals(2, pointSET.size());
	}
	
	@Test
	public void test0070() {
		assertTrue(pointSET.isEmpty());
	}
	
	@Test
	public void test0080() {
		pointSET.insert(new Point2D(1, 2));
		assertEquals(1, pointSET.size());
		assertFalse(pointSET.isEmpty());
	}
	
	@Test
	public void test0090() {
		pointSET.insert(new Point2D(1, 2));
		pointSET.insert(new Point2D(1, 2));
		assertEquals(1, pointSET.size());
		assertFalse(pointSET.isEmpty());
	}
	
	@Test
	public void test0100() {
		pointSET.insert(new Point2D(1, 2));
		assertFalse(pointSET.isEmpty());
	}
	
	@Test (expected = NullPointerException.class)
	public void test0110() {
		pointSET.insert(null);
	}
	
	@Test (expected = NullPointerException.class)
	public void test0120() {
		pointSET.contains(null);
	}
	
	@Test 
	public void test0130() {
		pointSET.insert(new Point2D(1, 2));
		assertTrue(pointSET.contains(new Point2D(1, 2)));
	}
	
	@Test 
	public void test0140() {
		pointSET.insert(new Point2D(3, 5));
		pointSET.insert(new Point2D(2, 5));
		assertTrue(pointSET.contains(new Point2D(2, 5)));
	}
	
	@Test 
	public void test0150() {
		pointSET.insert(new Point2D(3, 5));
		pointSET.insert(new Point2D(4, 5));
		assertTrue(pointSET.contains(new Point2D(4, 5)));
	}
	
	@Test 
	public void test0160() {
		pointSET.insert(new Point2D(3, 5));
		pointSET.insert(new Point2D(2, 5));
		pointSET.insert(new Point2D(2, 4));
		assertTrue(pointSET.contains(new Point2D(2, 4)));
	}
	
	@Test 
	public void test0170() {
		pointSET.insert(new Point2D(3, 5));
		pointSET.insert(new Point2D(2, 5));
		pointSET.insert(new Point2D(2, 6));
		assertTrue(pointSET.contains(new Point2D(2, 6)));
	}
	
	@Test 
	public void test0180() {
		pointSET.insert(new Point2D(3, 5));
		pointSET.insert(new Point2D(4, 5));
		pointSET.insert(new Point2D(2, 4));
		assertTrue(pointSET.contains(new Point2D(2, 4)));
	}
	
	@Test 
	public void test0190() {
		pointSET.insert(new Point2D(3, 5));
		pointSET.insert(new Point2D(4, 5));
		pointSET.insert(new Point2D(2, 6));
		assertTrue(pointSET.contains(new Point2D(2, 6)));
	}
	
		

	//////////////////////////////////////////////
	
	@Test (expected = NullPointerException.class)
	public void test0200() {
		pointSET.insert(new Point2D(1, 2));
		pointSET.nearest(null);
	}
	
	@Test 
	public void test0210() {
		assertNull(pointSET.nearest(new Point2D(1, 2)));
	}
	
	@Test
	public void test0220() {
		pointSET.insert(new Point2D(2, 2));
		assertEquals(new Point2D(2, 2), pointSET.nearest(new Point2D(3, 3)));
	}
	
	@Test
	public void test025() {
		pointSET.insert(new Point2D(6, 6));
		pointSET.insert(new Point2D(3, 3));
		assertEquals(new Point2D(3, 3), pointSET.nearest(new Point2D(4, 4)));	
	}
	
	@Test
	public void test026() {
		pointSET.insert(new Point2D(3, 3));
		pointSET.insert(new Point2D(6, 6));
		assertEquals(new Point2D(6, 6), pointSET.nearest(new Point2D(5, 5)));	
	}
	
	@Test
	public void test027() {
		pointSET.insert(new Point2D(6, 6));
		pointSET.insert(new Point2D(3, 3));
		assertEquals(new Point2D(6, 6), pointSET.nearest(new Point2D(5, 5)));	
	}
	
	@Test
	public void test028() {
		pointSET.insert(new Point2D(3, 3));
		pointSET.insert(new Point2D(6, 6));
		assertEquals(new Point2D(3, 3), pointSET.nearest(new Point2D(4, 4)));	
	}
	
	@Test
	public void test030() {
		pointSET.insert(new Point2D(6, 6));
		pointSET.insert(new Point2D(2, 3));
		pointSET.insert(new Point2D(7, 3));
		assertEquals(new Point2D(7, 3), pointSET.nearest(new Point2D(5, 3)));	
	}
	
	@Test
	public void test040() {
		pointSET.insert(new Point2D(4, 4));
		pointSET.insert(new Point2D(6, 2));
		pointSET.insert(new Point2D(10, 1));
		assertEquals(new Point2D(6, 2), pointSET.nearest(new Point2D(7, 1)));	
	}
	
	@Test
	public void test050() {
		pointSET.insert(new Point2D(6, 6));
		pointSET.insert(new Point2D(3, 3));
		pointSET.insert(new Point2D(2, 8));
		assertEquals(new Point2D(3, 3), pointSET.nearest(new Point2D(1, 4)));	
	}
	
	@Test
	public void test060() {
		pointSET.insert(new Point2D(6, 6));
		pointSET.insert(new Point2D(7, 1));
		assertEquals(new Point2D(7, 1), pointSET.nearest(new Point2D(5, 1)));	
	}
	
	@Test
	public void test070() {
		pointSET.insert(new Point2D(6, 6));
		pointSET.insert(new Point2D(5, 1));
		assertEquals(new Point2D(5, 1), pointSET.nearest(new Point2D(7, 1)));	
	}
	
	
	
	
	@Test (expected = NullPointerException.class)
	public void test080() {
		pointSET.range(null);
	}
	
	@Test
	public void test090() {
		pointSET.insert(new Point2D(3, 3));
		Iterable<Point2D> iterable = pointSET.range(new RectHV(2, 2, 4, 4));
		expected.add(new Point2D(3, 3));
		assertTrue(iteratorContainsAllElementsFromTheSetAndNothingElse(iterable.iterator(), expected) );
	}
	
	@Test
	public void test100() {
		pointSET.insert(new Point2D(3, 3));
		pointSET.insert(new Point2D(1, 1));
		Iterable<Point2D> iterable = pointSET.range(new RectHV(2, 2, 4, 4));
		expected.add(new Point2D(3, 3));
		assertTrue(iteratorContainsAllElementsFromTheSetAndNothingElse(iterable.iterator(), expected) );
	}
	
	@Test
	public void test110() {
		pointSET.insert(new Point2D(3, 3));
		pointSET.insert(new Point2D(5, 5));
		Iterable<Point2D> iterable = pointSET.range(new RectHV(2, 2, 4, 4));
		expected.add(new Point2D(3, 3));
		assertTrue(iteratorContainsAllElementsFromTheSetAndNothingElse(iterable.iterator(), expected) );
	}
	
	@Test
	public void test120() {
		pointSET.insert(new Point2D(4, 4));
		pointSET.insert(new Point2D(3, 3));
		Iterable<Point2D> iterable = pointSET.range(new RectHV(2, 2, 6, 6));
		expected.add(new Point2D(4, 4));
		expected.add(new Point2D(3, 3));
		assertTrue(iteratorContainsAllElementsFromTheSetAndNothingElse(iterable.iterator(), expected) );
	}
	
	@Test
	public void test130() {
		pointSET.insert(new Point2D(4, 4));
		pointSET.insert(new Point2D(5, 5));
		Iterable<Point2D> iterable = pointSET.range(new RectHV(2, 2, 6, 6));
		expected.add(new Point2D(4, 4));
		expected.add(new Point2D(5, 5));
		assertTrue(iteratorContainsAllElementsFromTheSetAndNothingElse(iterable.iterator(), expected) );
	}
	
	@Test
	public void test140() {
		pointSET.insert(new Point2D(8, 8));
		pointSET.insert(new Point2D(5, 5));
		Iterable<Point2D> iterable = pointSET.range(new RectHV(2, 2, 6, 6));
		expected.add(new Point2D(5, 5));
		assertTrue(iteratorContainsAllElementsFromTheSetAndNothingElse(iterable.iterator(), expected) );
	}
	
	@Test
	public void test150 () {
		pointSET.insert(new Point2D(1, 1));
		pointSET.insert(new Point2D(5, 5));
		Iterable<Point2D> iterable = pointSET.range(new RectHV(2, 2, 6, 6));
		expected.add(new Point2D(5, 5));
		assertTrue(iteratorContainsAllElementsFromTheSetAndNothingElse(iterable.iterator(), expected) );
	}
//	
//	@Test
//	public void test052() {
//		kdTree.insert(new Point2D(1, 1));
//		kdTree.insert(new Point2D(3, 3));
//		Iterable<Point2D> iterable = kdTree.range(new RectHV(1, 1, 4, 4));
//		expected.add(new Point2D(1, 1));
//		expected.add(new Point2D(3, 3));
//		assertTrue(iteratorContainsAllElementsFromTheSetAndNothingElse(iterable.iterator(), expected) );
//	}
//	
//	@Test
//	public void test060() {
//		kdTree.insert(new Point2D(1, 1));
//		kdTree.insert(new Point2D(3, 3));
//		Iterable<Point2D> iterable = kdTree.range(new RectHV(4, 4, 5, 5));
//		assertTrue(iteratorContainsAllElementsFromTheSetAndNothingElse(iterable.iterator(), expected) );
//	}
//	
//	@Test
//	public void test070() {
//		kdTree.insert(new Point2D(0.006, 0.006));
//		kdTree.insert(new Point2D(0.0211, 0.0211));
//		expected.add(new Point2D(0.0211, 0.0211));
//		Iterable<Point2D> iterable = kdTree.range(new RectHV(0.0059999999000000005, 0.0060000001, 0.21099999989999998, 0.2110000001));
//		assertTrue(iteratorContainsAllElementsFromTheSetAndNothingElse(iterable.iterator(), expected) );
//	}
	
	
	
	


	
		private boolean iteratorContainsAllElementsFromTheSetAndNothingElse(Iterator<Point2D> it, Set<Point2D> set) {
			int counter = 0;
			while (it.hasNext()) {
				counter++;
				if (!set.contains(it.next()))
					return false;
			}
			if (counter != set.size())
				return false;
			return true;
		}
}
