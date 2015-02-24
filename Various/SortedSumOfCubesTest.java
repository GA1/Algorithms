import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;


public class SortedSumOfCubesTest {

	SortedSumOfCubes sortedSumOfCubes = new SortedSumOfCubes();
	SortedSumOfCubes.Pair pair;
	SortedSumOfCubes.Pair pair1;
	SortedSumOfCubes.Pair pair2;
	
	SortedSumOfCubes.Pair[] expected;
	SortedSumOfCubes.Pair[] result;
	SortedSumOfCubes.Pair[] sorted;
	
	@Test
	public void test010() {
		pair1 = sortedSumOfCubes.new Pair(0, 0);
		pair2 = sortedSumOfCubes.new Pair(1, 1);
		assertEquals(-1, pair1.compareTo(pair2));
		assertEquals(1, pair2.compareTo(pair1));
	}

	@Test
	public void test020() {
		pair1 = sortedSumOfCubes.new Pair(1, 0);
		pair2 = sortedSumOfCubes.new Pair(0, 1);
		assertEquals(0, pair1.compareTo(pair2));
		assertEquals(0, pair2.compareTo(pair1));
	}
	
	@Test
	public void test025() {
		pair = sortedSumOfCubes.new Pair(0, 0);
		assertEquals("(0, 0, 0)", pair.toString());
	}
	
	@Test
	public void test027() {
		pair = sortedSumOfCubes.new Pair(2, 3);
		assertEquals("(35, 2, 3)", pair.toString());
	}
	
	@Test
	public void test029() {
		expected = new SortedSumOfCubes.Pair[]{p(0, 0)};
		result = sortedSumOfCubes.of(1);
		assertEquals(new ArrayList<SortedSumOfCubes.Pair>(Arrays.asList(expected)), new ArrayList<SortedSumOfCubes.Pair>(Arrays.asList(result)));
	}
	
	@Test
	public void test030() {
		expected = new SortedSumOfCubes.Pair[]{p(0, 0), p(0, 1), p(1, 1)};
		result = sortedSumOfCubes.of(2);
		assertEquals(new ArrayList<SortedSumOfCubes.Pair>(Arrays.asList(expected)), new ArrayList<SortedSumOfCubes.Pair>(Arrays.asList(result)));
	}
	
	@Test
	public void test040() {
		expected = new SortedSumOfCubes.Pair[]{p(0, 0), p(0, 1), p(1, 1), p(0, 2), p(1, 2), p(2, 2)};
		result = sortedSumOfCubes.of(3);
		assertEquals(new ArrayList<SortedSumOfCubes.Pair>(Arrays.asList(expected)), new ArrayList<SortedSumOfCubes.Pair>(Arrays.asList(result)));
	}
	
	@Test
	public void test044() {
		expected = new SortedSumOfCubes.Pair[]{p(0, 0), p(0, 1), p(1, 1), p(0, 2), p(1, 2), p(2, 2), p(0, 3), p(1, 3), p(2, 3), p(3, 3)};
		result = sortedSumOfCubes.of(4);
		assertEquals(new ArrayList<SortedSumOfCubes.Pair>(Arrays.asList(expected)), new ArrayList<SortedSumOfCubes.Pair>(Arrays.asList(result)));
	}
	
	@Test
	public void test050() {
		SortedSumOfCubes sumOfCubes = new SortedSumOfCubes();
		sumOfCubes.equalCubes(50);
	}
	
		private SortedSumOfCubes.Pair p(int a, int b) {
			return sortedSumOfCubes.new Pair(a, b);
		}
}
