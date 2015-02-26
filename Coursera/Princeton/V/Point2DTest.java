import static org.junit.Assert.*;

import org.junit.Test;


public class Point2DTest {

	private double delta = 0.0000000001; 
	private Point2D p, p1, p2;
	
	@Test
	public void test010() {
		p = new Point2D(1.3, 0.8);
		assertEquals(1.3, p.x(), delta);
		assertEquals(0.8, p.y(), delta);
	}

	@Test
	public void test020() {
		p1 = new Point2D(1.0, 1.0);
		p2 = new Point2D(4.0, 5.0);
		assertEquals(25, p1.distanceSquaredTo(p2), delta);
		assertEquals(25, p2.distanceSquaredTo(p1), delta);
	}
	
	@Test
	public void test030() {
		p1 = new Point2D(1.0, 1.0);
		p2 = new Point2D(4.0, 5.0);
		assertEquals(5, p1.distanceTo(p2), delta);
		assertEquals(5, p2.distanceTo(p1), delta);
	}
	
	@Test
	public void test040() {
		p = new Point2D(1.3, 0.8);
		assertEquals("(1.3, 0.8)", p.toString());
	}
	
	@Test
	public void test050() {
		p1 = new Point2D(1.0, 1.0);
		p2 = new Point2D(1.0, 2.0);
		assertTrue(p1.compareTo(p2) < 0);
		assertTrue(p2.compareTo(p1) > 0);
	}
	
	@Test
	public void test060() {
		p1 = new Point2D(1.0, 1.0);
		p2 = new Point2D(2.0, 1.0);
		assertTrue(p1.compareTo(p2) < 0);
		assertTrue(p2.compareTo(p1) > 0);
	}
	
	@Test
	public void test070() {
		p1 = new Point2D(1.0, 1.0);
		p2 = new Point2D(2.0, 2.0);
		assertTrue(p1.compareTo(p2) < 0);
		assertTrue(p2.compareTo(p1) > 0);
	}
	
	@Test
	public void test080() {
		p1 = new Point2D(1.0, 1.0);
		p2 = new Point2D(2.0, 0.0);
		assertTrue(p1.compareTo(p2) < 0);
		assertTrue(p2.compareTo(p1) > 0);
	}
	
	@Test
	public void test090() {
		p1 = new Point2D(2.0, 2.0);
		p2 = new Point2D(2.0, 2.0);
		assertTrue(p1.compareTo(p2) == 0);
		assertTrue(p2.compareTo(p1) == 0);
	}
}
