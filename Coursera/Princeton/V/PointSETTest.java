
import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.junit.Test;


public class PointSETTest {

	private PointSET pointSet = new PointSET(); 
	private Point2D p, p1, p2;
	private Set<Point2D> expected = new HashSet<Point2D>();
	
	@Test (expected = NullPointerException.class)
	public void test0010() {
		pointSet.insert(null);
	}
	
	@Test (expected = NullPointerException.class)
	public void test0020() {
		pointSet.contains(null);
	}
	
	@Test (expected = NullPointerException.class)
	public void test0030() {
		pointSet.range(null);
	}
	
	@Test (expected = NullPointerException.class)
	public void test0040() {
		pointSet.insert(new Point2D(1, 2));
		pointSet.nearest(null);
	}
	
	@Test 
	public void test0050() {
		assertNull(pointSet.nearest(new Point2D(1, 2)));
	}
	
	@Test
	public void test010() {
		assertEquals(0, pointSet.size());
	}

	@Test
	public void test015() {
		assertTrue(pointSet.isEmpty());
	}
	
	@Test
	public void test020() {
		pointSet.insert(new Point2D(1, 2));
		assertEquals(1, pointSet.size());
		assertFalse(pointSet.isEmpty());
	}
	
	@Test
	public void test022() {
		pointSet.insert(new Point2D(1, 2));
		pointSet.insert(new Point2D(1, 2));
		assertEquals(1, pointSet.size());
		assertFalse(pointSet.isEmpty());
	}
	
	@Test
	public void test030() {
		pointSet.insert(new Point2D(1, 2));
		assertFalse(pointSet.isEmpty());
	}
	
	@Test
	public void test040() {
		pointSet.insert(new Point2D(1, 1));
		pointSet.insert(new Point2D(2, 2));
		
		assertEquals(new Point2D(2, 2), pointSet.nearest(new Point2D(3, 3)));
	}
	
	@Test
	public void test045() {
		pointSet.insert(new Point2D(2, 2));
		
		assertEquals(new Point2D(2, 2), pointSet.nearest(new Point2D(3, 3)));
	}
	
	@Test
	public void test047() {
		pointSet.insert(new Point2D(2, 2));
		pointSet.insert(new Point2D(3, 1));
		pointSet.insert(new Point2D(3, 2));
		assertEquals(new Point2D(3, 2), pointSet.nearest(new Point2D(3, 3)));	
	}
	
	@Test
	public void test050() {
		pointSet.insert(new Point2D(1, 1));
		pointSet.insert(new Point2D(3, 3));
		Iterable<Point2D> iterable = pointSet.range(new RectHV(2, 2, 4, 4));
		expected.add(new Point2D(3, 3));
		assertTrue(iteratorContainsAllElementsFromTheSetAndNothingElse(iterable.iterator(), expected) );
	}
	
	@Test
	public void test052() {
		pointSet.insert(new Point2D(1, 1));
		pointSet.insert(new Point2D(3, 3));
		Iterable<Point2D> iterable = pointSet.range(new RectHV(1, 1, 4, 4));
		expected.add(new Point2D(1, 1));
		expected.add(new Point2D(3, 3));
		assertTrue(iteratorContainsAllElementsFromTheSetAndNothingElse(iterable.iterator(), expected) );
	}
	
	@Test
	public void test060() {
		pointSet.insert(new Point2D(1, 1));
		pointSet.insert(new Point2D(3, 3));
		Iterable<Point2D> iterable = pointSet.range(new RectHV(4, 4, 5, 5));
		assertTrue(iteratorContainsAllElementsFromTheSetAndNothingElse(iterable.iterator(), expected) );
	}
	
	@Test
	public void test070() {
		pointSet.insert(new Point2D(0.006, 0.006));
		pointSet.insert(new Point2D(0.0211, 0.0211));
		expected.add(new Point2D(0.0211, 0.0211));
		Iterable<Point2D> iterable = pointSet.range(new RectHV(0.0059999999000000005, 0.0060000001, 0.21099999989999998, 0.2110000001));
		assertTrue(iteratorContainsAllElementsFromTheSetAndNothingElse(iterable.iterator(), expected) );
	}
	
	
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
