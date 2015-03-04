
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
	
	@Test
	public void test0010() {
		assertEquals(0, kdTree.size());
	}
	
	@Test
	public void test0020() {
		kdTree.insert(new Point2D(1, 2));
		assertEquals(1, kdTree.size());
	}

	@Test
	public void test0030() {
		kdTree.insert(new Point2D(1, 2));
		kdTree.insert(new Point2D(1, 3));
		assertEquals(2, kdTree.size());
	}
	
	@Test
	public void test0040() {
		kdTree.insert(new Point2D(1, 2));
		kdTree.insert(new Point2D(1, 3));
		assertEquals(2, kdTree.size());
	}
	
	@Test
	public void test0050() {
		kdTree.insert(new Point2D(1, 2));
		kdTree.insert(new Point2D(1, 2));
		assertEquals(1, kdTree.size());
	}
	
	@Test
	public void test0060() {
		kdTree.insert(new Point2D(1, 2));
		kdTree.insert(new Point2D(1, 3));
		kdTree.insert(new Point2D(1, 2));
		assertEquals(2, kdTree.size());
	}
	
	@Test
	public void test0070() {
		assertTrue(kdTree.isEmpty());
	}
	
	@Test
	public void test0080() {
		kdTree.insert(new Point2D(1, 2));
		assertEquals(1, kdTree.size());
		assertFalse(kdTree.isEmpty());
	}
	
	@Test
	public void test0090() {
		kdTree.insert(new Point2D(1, 2));
		kdTree.insert(new Point2D(1, 2));
		assertEquals(1, kdTree.size());
		assertFalse(kdTree.isEmpty());
	}
	
	@Test
	public void test0100() {
		kdTree.insert(new Point2D(1, 2));
		assertFalse(kdTree.isEmpty());
	}
	
	@Test (expected = NullPointerException.class)
	public void test0110() {
		kdTree.insert(null);
	}
	
	@Test (expected = NullPointerException.class)
	public void test0120() {
		kdTree.contains(null);
	}
	
	@Test 
	public void test0130() {
		kdTree.insert(new Point2D(1, 2));
		assertTrue(kdTree.contains(new Point2D(1, 2)));
	}
	
	@Test 
	public void test0140() {
		kdTree.insert(new Point2D(3, 5));
		kdTree.insert(new Point2D(2, 5));
		assertTrue(kdTree.contains(new Point2D(2, 5)));
	}
	
	@Test 
	public void test0150() {
		kdTree.insert(new Point2D(3, 5));
		kdTree.insert(new Point2D(4, 5));
		assertTrue(kdTree.contains(new Point2D(4, 5)));
	}
	
	@Test 
	public void test0160() {
		kdTree.insert(new Point2D(3, 5));
		kdTree.insert(new Point2D(2, 5));
		kdTree.insert(new Point2D(2, 4));
		assertTrue(kdTree.contains(new Point2D(2, 4)));
	}
	
	@Test 
	public void test0170() {
		kdTree.insert(new Point2D(3, 5));
		kdTree.insert(new Point2D(2, 5));
		kdTree.insert(new Point2D(2, 6));
		assertTrue(kdTree.contains(new Point2D(2, 6)));
	}
	
	@Test 
	public void test0180() {
		kdTree.insert(new Point2D(3, 5));
		kdTree.insert(new Point2D(4, 5));
		kdTree.insert(new Point2D(2, 4));
		assertTrue(kdTree.contains(new Point2D(2, 4)));
	}
	
	@Test 
	public void test0190() {
		kdTree.insert(new Point2D(3, 5));
		kdTree.insert(new Point2D(4, 5));
		kdTree.insert(new Point2D(2, 6));
		assertTrue(kdTree.contains(new Point2D(2, 6)));
	}
	
		

	//////////////////////////////////////////////
	
	@Test (expected = NullPointerException.class)
	public void test0200() {
		kdTree.insert(new Point2D(1, 2));
		kdTree.nearest(null);
	}
	
	@Test 
	public void test0210() {
		assertNull(kdTree.nearest(new Point2D(1, 2)));
	}
	
	@Test
	public void test0220() {
		kdTree.insert(new Point2D(2, 2));
		assertEquals(new Point2D(2, 2), kdTree.nearest(new Point2D(3, 3)));
	}
	
	@Test
	public void test0225() {
		kdTree.insert(new Point2D(6, 6));
		kdTree.insert(new Point2D(2, 3));
		kdTree.insert(new Point2D(7, 3));
		assertEquals(new Point2D(2, 7), kdTree.nearest(new Point2D(2, 5)));	
	}
	
	@Test
	public void test0230() {
		kdTree.insert(new Point2D(2, 2));
		kdTree.insert(new Point2D(1, 2));
		assertEquals(new Point2D(1, 2), kdTree.nearest(new Point2D(1, 1)));	
	}
	
	@Test
	public void test0235() {
		kdTree.insert(new Point2D(2, 2));
		kdTree.insert(new Point2D(1, 2));
		assertEquals(new Point2D(1, 2), kdTree.nearest(new Point2D(1, 3)));	
	}
	
	@Test
	public void test0240() {
		kdTree.insert(new Point2D(2, 2));
		kdTree.insert(new Point2D(3, 2));
		assertEquals(new Point2D(3, 2), kdTree.nearest(new Point2D(3, 3)));	
	}
	
	@Test
	public void test0245() {
		kdTree.insert(new Point2D(2, 2));
		kdTree.insert(new Point2D(3, 2));
		assertEquals(new Point2D(3, 2), kdTree.nearest(new Point2D(3, 1)));	
	}
	
	@Test
	public void test0255() {
		kdTree.insert(new Point2D(4, 4));
		kdTree.insert(new Point2D(2, 2));
		assertEquals(new Point2D(4, 4), kdTree.nearest(new Point2D(3, 4)));	
	}
	
	@Test
	public void test0265() {
		kdTree.insert(new Point2D(4, 4));
		kdTree.insert(new Point2D(6, 2));
		assertEquals(new Point2D(4, 4), kdTree.nearest(new Point2D(5, 4)));	
	}
	
	@Test
	public void test0275() {
		kdTree.insert(new Point2D(4, 4));
		kdTree.insert(new Point2D(6, 2));
		kdTree.insert(new Point2D(10, 1));
		assertEquals(new Point2D(6, 2), kdTree.nearest(new Point2D(7, 1)));	
	}
	
	@Test
	public void test0285() {
		kdTree.insert(new Point2D(6, 6));
		kdTree.insert(new Point2D(3, 3));
		kdTree.insert(new Point2D(2, 8));
		assertEquals(new Point2D(3, 3), kdTree.nearest(new Point2D(1, 4)));	
	}
	
	@Test
	public void test0295() {
		kdTree.insert(new Point2D(6, 6));
		kdTree.insert(new Point2D(7, 1));
		assertEquals(new Point2D(7, 1), kdTree.nearest(new Point2D(5, 1)));	
	}
	
//	@Test (expected = NullPointerException.class)
//	public void test0030() {
//		kdTree.range(null);
//	}
//	@Test
//	public void test050() {
//		kdTree.insert(new Point2D(1, 1));
//		kdTree.insert(new Point2D(3, 3));
//		Iterable<Point2D> iterable = kdTree.range(new RectHV(2, 2, 4, 4));
//		expected.add(new Point2D(3, 3));
//		assertTrue(iteratorContainsAllElementsFromTheSetAndNothingElse(iterable.iterator(), expected) );
//	}
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
			if (counter != set.size())
				return false;
			while (it.hasNext()) {
				counter++;
				if (!set.contains(it.next()))
					return false;
			}
			return true;
		}
}
