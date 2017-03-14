import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TreeTest {

	Tree br;
	
	@Before
	public void init() { 
		br = new Tree();
	}
	
	@Test
	public void test010() {
		assertTrue(br.isEmpty());
	}
	
	@Test
	public void test015() {
		br.insert(1);
		assertEquals(1, br.size());
	}

	@Test
	public void test020() {
		assertTrue(br.insert(1));
		assertFalse(br.isEmpty());
	}
	
	@Test
	public void test035() {
		assertTrue(br.insert(5));
		assertTrue(br.insert(6));
	}
	
	@Test
	public void test030() {
		br.insert(5);
		br.insert(6);
		assertFalse(br.isEmpty());
	}
	
	@Test
	public void test040() {
		br.insert(5);
		br.insert(6);
		assertEquals(2, br.size());
	}
	
	@Test
	public void test050() {
		br.insert(5);
		br.insert(6);
		assertEquals(2, br.size());
	}
	
	@Test
	public void test060() {
		assertTrue(br.insert(5));
		assertFalse(br.insert(5));
	}
	
	@Test
	public void test070() {
		assertTrue(br.insert(5));
		assertTrue(br.insert(6));
		assertTrue(br.insert(7));
	}
	
	@Test
	public void test080() {
		assertFalse(br.exists(1));
	}
	
	@Test
	public void test090() {
		br.insert(1);
		assertTrue(br.exists(1));
	}
	
	@Test
	public void test100() {
		br.insert(5);
		br.insert(6);
		br.insert(7);
		assertTrue(br.exists(5));
		assertTrue(br.exists(6));
		assertTrue(br.exists(7));
	}
	
	@Test
	public void test105() {
		br.insert(5);
		br.insert(6);
		br.insert(3);
		br.insert(1);
		br.insert(7);
		assertTrue(br.exists(1));
		assertTrue(br.exists(3));
		assertTrue(br.exists(5));
		assertTrue(br.exists(6));
		assertTrue(br.exists(7));
	}
	
	@Test
	public void test110() {
		assertEquals("()", br.toString());
	}
	
	@Test
	public void test120() {
		br.insert(5);
		assertEquals("(5)", br.toString());
	}
	
	@Test
	public void test130() {
		br.insert(1);
		br.insert(3);
		br.insert(5);
		assertEquals("(1 3 5)", br.toString());
	}
	
	@Test
	public void test140() {
		br.insert(1);
		br.insert(5);
		br.insert(3);
		assertEquals("(1 3 5)", br.toString());
	}

	@Test
	public void test150() {
		br.insert(1);
		br.insert(5);
		br.insert(13);
		br.insert(7);
		br.insert(8);
		assertEquals("(1 5 7 8 13)", br.toString());
	}
	
	@Test
	public void test160() {
		br.ceiling(5);
		assertEquals("()", br.toString());
	}
	
	@Test
	public void test190() {		
		br.insert(1);
		br.insert(5);
//		assertEquals("(1 ,5)", br.floor(5));
	}
	
	@Test
	public void test220() {
		br.min(5);
		assertEquals("(1 5 7 8 13)", br.toString());
	}
	
	@Test
	public void test250() {
		br.max(5);
		assertEquals("(1 5 7 8 13)", br.toString());
	}
	
	@Test
	public void test290() {
		br.height(5);
		assertEquals("(1 5 7 8 13)", br.toString());
	}
	
	@Test
	public void test320() {
		br.breadthTraversal(5);
		assertEquals("(1 5 7 8 13)", br.toString());
	}
}
