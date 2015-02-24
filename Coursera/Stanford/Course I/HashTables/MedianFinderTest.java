

import static org.junit.Assert.*;

import org.junit.Test;

public class MedianFinderTest {

	private static final double delta = 0.00000001; 
	private MedianFinder finder = new MedianFinder();
	
	@Test
	public void test010() {
		finder.insert(5l);
		assertEquals(5, finder.find(), delta);
	}

	@Test
	public void test015() {
		finder.insert(5l);
		assertEquals(1, finder.size());
	}
	
	@Test
	public void test020() {
		finder.insert(3l);
		assertEquals(3, finder.find(), delta);
	}
	
	@Test
	public void test030() {
		finder.insert(3l);
		finder.insert(3l);
		assertEquals(3, finder.find(), delta);
	}
	
	@Test
	public void test031() {
		finder.insert(3l);
		finder.insert(4l);
		assertEquals(3, finder.find(), delta);
	}
	
	@Test
	public void test033() {
		insert(3l, 2l, 3l);
		assertEquals(3, finder.find(), delta);
	}
	
	@Test
	public void test035() {
		insert(1l, 2l, 3l);
		assertEquals(2, finder.find(), delta);
	}
	
	@Test
	public void test040() {
		insert(1l, 2l, 3l, 4l);
		assertEquals(2, finder.find(), delta);
	}

	@Test
	public void test050() {
		insert(1l, 2l, 3l, 4l, 5l);
		assertEquals(3, finder.find(), delta);
	}
	
	@Test
	public void test055() {
		insert(4l, 3l, 2l, 1l);
		assertEquals(2, finder.find(), delta);
	}
	
	private void insert(Long... toInsert) {
		for (Long i : toInsert)
			finder.insert(i);
	}
	
	
}
