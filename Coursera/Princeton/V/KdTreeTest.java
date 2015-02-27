
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.junit.Test;


public class KdTreeTest {

	private KdTree kdTree = new KdTree(); 
	private Point2D p, p1, p2;
	private Set<Point2D> expected = new HashSet<Point2D>();
	
	@Test (expected = NullPointerException.class)
	public void test0010() {
		kdTree.insert(null);
	}
	
	@Test (expected = NullPointerException.class)
	public void test0020() {
		kdTree.contains(null);
	}
	
	@Test (expected = NullPointerException.class)
	public void test0030() {
		kdTree.range(null);
	}
	
	@Test (expected = NullPointerException.class)
	public void test0040() {
		kdTree.insert(new Point2D(1, 2));
		kdTree.nearest(null);
	}
	
	@Test 
	public void test0045() {
		kdTree.insert(new Point2D(1, 2));
		assertTrue(kdTree.contains(new Point2D(1, 2)));
	}
	
	@Test 
	public void test0046() {
		kdTree.insert(new Point2D(1, 2));
		kdTree.insert(new Point2D(3, 5));
		assertTrue(kdTree.contains(new Point2D(1, 2)));
	}
	
	@Test 
	public void test0050() {
		assertNull(kdTree.nearest(new Point2D(1, 2)));
	}
	
	@Test
	public void test010() {
		assertEquals(0, kdTree.size());
	}

	@Test
	public void test015() {
		assertTrue(kdTree.isEmpty());
	}
	
	@Test
	public void test020() {
		kdTree.insert(new Point2D(1, 2));
		assertEquals(1, kdTree.size());
		assertFalse(kdTree.isEmpty());
	}
	
	@Test
	public void test022() {
		kdTree.insert(new Point2D(1, 2));
		kdTree.insert(new Point2D(1, 2));
		assertEquals(1, kdTree.size());
		assertFalse(kdTree.isEmpty());
	}
	
	@Test
	public void test030() {
		kdTree.insert(new Point2D(1, 2));
		assertFalse(kdTree.isEmpty());
	}
	
	@Test
	public void test040() {
		kdTree.insert(new Point2D(1, 1));
		kdTree.insert(new Point2D(2, 2));
		
		assertEquals(new Point2D(2, 2), kdTree.nearest(new Point2D(3, 3)));
	}
	
	@Test
	public void test045() {
		kdTree.insert(new Point2D(2, 2));
		
		assertEquals(new Point2D(2, 2), kdTree.nearest(new Point2D(3, 3)));
	}
	
	@Test
	public void test047() {
		kdTree.insert(new Point2D(2, 2));
		kdTree.insert(new Point2D(3, 1));
		kdTree.insert(new Point2D(3, 2));
		assertEquals(new Point2D(3, 2), kdTree.nearest(new Point2D(3, 3)));	
	}
	
	@Test
	public void test050() {
		kdTree.insert(new Point2D(1, 1));
		kdTree.insert(new Point2D(3, 3));
		Iterable<Point2D> iterable = kdTree.range(new RectHV(2, 2, 4, 4));
		expected.add(new Point2D(3, 3));
		assertTrue(iteratorContainsAllElementsFromTheSetAndNothingElse(iterable.iterator(), expected) );
	}
	
	@Test
	public void test052() {
		kdTree.insert(new Point2D(1, 1));
		kdTree.insert(new Point2D(3, 3));
		Iterable<Point2D> iterable = kdTree.range(new RectHV(1, 1, 4, 4));
		expected.add(new Point2D(1, 1));
		expected.add(new Point2D(3, 3));
		assertTrue(iteratorContainsAllElementsFromTheSetAndNothingElse(iterable.iterator(), expected) );
	}
	
	@Test
	public void test060() {
		kdTree.insert(new Point2D(1, 1));
		kdTree.insert(new Point2D(3, 3));
		Iterable<Point2D> iterable = kdTree.range(new RectHV(4, 4, 5, 5));
		assertTrue(iteratorContainsAllElementsFromTheSetAndNothingElse(iterable.iterator(), expected) );
	}
	
	@Test
	public void test070() {
		kdTree.insert(new Point2D(0.006, 0.006));
		kdTree.insert(new Point2D(0.0211, 0.0211));
		expected.add(new Point2D(0.0211, 0.0211));
		Iterable<Point2D> iterable = kdTree.range(new RectHV(0.0059999999000000005, 0.0060000001, 0.21099999989999998, 0.2110000001));
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
