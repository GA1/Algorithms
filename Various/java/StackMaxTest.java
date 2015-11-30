import static org.junit.Assert.*;

import java.util.NoSuchElementException;

import org.junit.Test;

public class StackMaxTest {

	StackMax stackMax = new StackMax();

	@Test(expected = NoSuchElementException.class)
	public void test010() {
		stackMax.max();
	}

    @Test
	public void test020() {
		stackMax.push(1);
		stackMax.max();
		assertEquals((Integer)1, stackMax.max());
	}
    
    @Test(expected = NoSuchElementException.class)
	public void test030() {
		stackMax.push(1);
		stackMax.pop();
		stackMax.max();
	}
    
    @Test
	public void test040() {
		stackMax.push(1);
		stackMax.push(2);
		assertEquals((Integer)2, stackMax.max());
	}
    
    @Test
	public void test050() {
    	stackMax.push(2);
		stackMax.push(1);
		assertEquals((Integer)2, stackMax.max());
	}
    
    @Test
	public void test060() {
    	stackMax.push(1);
    	stackMax.push(2);
    	stackMax.push(3);
    	stackMax.pop();
		assertEquals((Integer)2, stackMax.max());
	}

    @Test
	public void test070() {
    	stackMax.push(1);
    	stackMax.push(3);
    	stackMax.push(2);
    	stackMax.pop();
		assertEquals((Integer)3, stackMax.max());
	}

}
