import static org.junit.Assert.*;

import java.util.Iterator;

import org.junit.Test;


public class StackWithFailFastIteratorTest {

	StackWithFailFastIterator<Integer> stack = new StackWithFailFastIterator<Integer>();
	Iterator<Integer> it;
	
	@Test(expected = java.util.ConcurrentModificationException.class)
	public void test010() {
		it = stack.iterator();
		stack.push(5);
		it.next();
	}

	@Test(expected = java.util.ConcurrentModificationException.class)
	public void test020() {
		it = stack.iterator();
		stack.push(5);
		it.hasNext();
	}
	
	@Test(expected = java.util.ConcurrentModificationException.class)
	public void test030() {
		it = stack.iterator();
		stack.push(5);
		stack.pop();
		it.next();
	}
	
	@Test(expected = java.util.ConcurrentModificationException.class)
	public void test040() {
		it = stack.iterator();
		stack.push(5);
		stack.pop();
		it.hasNext();
	}

}
