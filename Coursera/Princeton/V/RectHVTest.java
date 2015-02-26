import static org.junit.Assert.*;

import org.junit.Test;


public class RectHVTest {

	private double delta = 0.0000000001;
	private RectHV r, r1, r2;
	private Point2D p;
	
	@Test (expected = IllegalArgumentException.class)
	public void test010() {
		r = new RectHV(10000, 4, 0, 5);
	}

	@Test (expected = IllegalArgumentException.class)
	public void test020() {
		r = new RectHV(4, 10000, 5, 0);
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void test030() {
		r = new RectHV(300, 100, 200, 0);
	}
	
	@Test
	public void test040() {
		r = new RectHV(1, 2, 3, 4);
		assertEquals(1, r.xmin(), delta);
		assertEquals(2, r.ymin(), delta);
		assertEquals(3, r.xmax(), delta);
		assertEquals(4, r.ymax(), delta);
	}
	
	@Test
	public void test050() {
		r = new RectHV(1, 1, 4, 4);
		p = new Point2D(1, 1);
		assertTrue(r.contains(p));
	}
	
	@Test
	public void test060() {
		r = new RectHV(1, 1, 4, 4);
		p = new Point2D(4, 4);
		assertTrue(r.contains(p));
	}
	
	@Test
	public void test070() {
		r = new RectHV(1, 1, 4, 4);
		p = new Point2D(1, 4);
		assertTrue(r.contains(p));
	}
	
	@Test
	public void test080() {
		r = new RectHV(1, 1, 4, 4);
		p = new Point2D(4, 1);
		assertTrue(r.contains(p));
	}
	
	@Test
	public void test100() {
		r = new RectHV(1, 1, 4, 4);
		p = new Point2D(3, 3);
		assertTrue(r.contains(p));
	}
	
	@Test
	public void test110() {
		r = new RectHV(1, 1, 4, 4);
		p = new Point2D(0, 0);
		assertFalse(r.contains(p));
	}
	
	@Test
	public void test120() {
		r = new RectHV(1, 1, 4, 4);
		p = new Point2D(5, 5);
		assertFalse(r.contains(p));
	}
	
	@Test
	public void test130() {
		r = new RectHV(1, 1, 4, 4);
		p = new Point2D(0, 5);
		assertFalse(r.contains(p));
	}
	
	@Test
	public void test140() {
		r = new RectHV(1, 1, 4, 4);
		p = new Point2D(5, 0);
		assertFalse(r.contains(p));
	}
	
	@Test
	public void test135() {
		r = new RectHV(1, 1, 4, 4);
		p = new Point2D(5, 3);
		assertFalse(r.contains(p));
	}
	
	@Test
	public void test150() {
		r = new RectHV(1, 1, 4, 4);
		p = new Point2D(0, 3);
		assertFalse(r.contains(p));
	}
	
	@Test
	public void test160() {
		r = new RectHV(1, 1, 4, 4);
		p = new Point2D(3, 0);
		assertFalse(r.contains(p));
	}
	
	@Test
	public void test170() {
		r = new RectHV(1, 1, 4, 4);
		p = new Point2D(3, 5);
		assertFalse(r.contains(p));
	}
	
	@Test
	public void test180() {
		r1 = new RectHV(1, 1, 4, 4);
		r2 = new RectHV(4, 4, 8, 8);
		assertTrue(r1.intersects(r2));
	}
	
	@Test
	public void test190() {
		r1 = new RectHV(1, 1, 4, 4);
		r2 = new RectHV(5, 5, 8, 8);
		assertFalse(r1.intersects(r2));
	}
	
	@Test
	public void test200() {
		r1 = new RectHV(1, 1, 4, 4);
		r2 = new RectHV(3, 5, 8, 8);
		assertFalse(r1.intersects(r2));
	}
	
	@Test
	public void test210() {
		r1 = new RectHV(1, 1, 5, 5);
		r2 = new RectHV(2, 6, 4, 7);
		assertFalse(r1.intersects(r2));
	}
	
	@Test
	public void test220() {
		r1 = new RectHV(1, 1, 5, 5);
		r2 = new RectHV(2, 6, 4, 7);
		assertFalse(r1.intersects(r2));
	}
	
	@Test
	public void test230() {
		r1 = new RectHV(1, 1, 5, 5);
		r2 = new RectHV(0, 6, 4, 7);
		assertFalse(r1.intersects(r2));
	}
	
	@Test
	public void test240() {
		r1 = new RectHV(1, 1, 5, 5);
		r2 = new RectHV(0, 5, 1, 7);
		assertTrue(r1.intersects(r2));
	}
	
	@Test
	public void test250() {
		r1 = new RectHV(3, 3, 7, 7);
		r2 = new RectHV(0, 8, 2, 10);
		assertFalse(r1.intersects(r2));
	}
	
	@Test
	public void test260() {
		r1 = new RectHV(3, 3, 7, 7);
		r2 = new RectHV(4, 7, 6, 10);
		assertTrue(r1.intersects(r2));
	}
	
	@Test
	public void test270() {
		r1 = new RectHV(3, 3, 7, 7);
		r2 = new RectHV(0, 4, 2, 10);
		assertFalse(r1.intersects(r2));
	}
	
	@Test
	public void test280() {
		r1 = new RectHV(3, 3, 7, 7);
		r2 = new RectHV(0, 4, 2, 6);
		assertFalse(r1.intersects(r2));
	}
	
	@Test
	public void test290() {
		r1 = new RectHV(3, 3, 7, 7);
		r2 = new RectHV(0, 4, 3, 6);
		assertTrue(r1.intersects(r2));
	}
	
	@Test
	public void test300() {
		r1 = new RectHV(3, 3, 7, 7);
		r2 = new RectHV(0, 2, 2, 4);
		assertFalse(r1.intersects(r2));
	}
	
	@Test
	public void test310() {
		r1 = new RectHV(3, 3, 7, 7);
		r2 = new RectHV(0, 0, 2, 2);
		assertFalse(r1.intersects(r2));
	}
	
	@Test
	public void test320() {
		r1 = new RectHV(3, 3, 7, 7);
		r2 = new RectHV(0, 0, 3, 3);
		assertTrue(r1.intersects(r2));
	}
	
	@Test
	public void test330() {
		r1 = new RectHV(3, 3, 7, 7);
		r2 = new RectHV(4, 0, 6, 3);
		assertTrue(r1.intersects(r2));
	}
	
	@Test
	public void test340() {
		r1 = new RectHV(3, 3, 7, 7);
		r2 = new RectHV(4, 0, 6, 2);
		assertFalse(r1.intersects(r2));
	}
	
	@Test
	public void test350() {
		r1 = new RectHV(3, 3, 7, 7);
		r2 = new RectHV(8, 4, 10, 6);
		assertFalse(r1.intersects(r2));
	}
	
	@Test
	public void test360() {
		r = new RectHV(4, 4, 9, 9);
		p = new Point2D(4, 4);
		assertEquals(0.0, r.distanceSquaredTo(p), delta);
	}
	
	@Test
	public void test380() {
		r = new RectHV(4, 4, 9, 9);
		p = new Point2D(2, 3);
		assertEquals(5.0, r.distanceSquaredTo(p), delta);
	}
	
	@Test
	public void test385() {
		r = new RectHV(4, 4, 9, 9);
		p = new Point2D(8, 2);
		assertEquals(4.0, r.distanceSquaredTo(p), delta);
	}
	
	@Test
	public void test387() {
		r = new RectHV(4, 4, 9, 9);
		p = new Point2D(8, 11);
		assertEquals(4.0, r.distanceSquaredTo(p), delta);
	}
	
	@Test
	public void test390() {
		r = new RectHV(4, 4, 9, 9);
		p = new Point2D(11, 3);
		assertEquals(5.0, r.distanceSquaredTo(p), delta);
	}
	
	@Test
	public void test400() {
		r = new RectHV(4, 4, 9, 9);
		p = new Point2D(11, 10);
		assertEquals(5.0, r.distanceSquaredTo(p), delta);
	}
	
	@Test
	public void test410() {
		r = new RectHV(4, 4, 9, 9);
		p = new Point2D(2, 10);
		assertEquals(5.0, r.distanceSquaredTo(p), delta);
	}
	
	@Test
	public void test420() {
		r = new RectHV(4, 4, 9, 9);
		p = new Point2D(2, 5);
		assertEquals(4.0, r.distanceSquaredTo(p), delta);
	}
	
	@Test
	public void test430() {
		r = new RectHV(4, 4, 9, 9);
		p = new Point2D(2, 10);
		assertEquals(Math.sqrt(5.0), r.distanceTo(p), delta);
	}
	
	@Test
	public void test440() {
		r = new RectHV(4, 4, 9, 9);
		p = new Point2D(2, 5);
		assertEquals(2.0, r.distanceTo(p), delta);
	}
	
	@Test
	public void test450() {
		r = new RectHV(1.0, 3.0, 8.0, 9.0);
		assertEquals("(1.0, 3.0, 8.0, 9.0)", r.toString());
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
