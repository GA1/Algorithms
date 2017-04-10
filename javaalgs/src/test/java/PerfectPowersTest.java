import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;


public class PerfectPowersTest {

	PerfectPowers PerfectPowers = new PerfectPowers();
	PerfectPowers.Pair pair;
	PerfectPowers.Pair pair1;
	PerfectPowers.Pair pair2;
	
	PerfectPowers.Pair[] expected;
	PerfectPowers.Pair[] result;
	PerfectPowers.Pair[] sorted;
	
	@Test
	public void test010() {
		pair1 = PerfectPowers.new Pair(1, 2);
		pair2 = PerfectPowers.new Pair(1, 1);
		assertEquals(0, pair1.compareTo(pair2));
		assertEquals(0, pair2.compareTo(pair1));
	}

	@Test
	public void test020() {
		pair1 = PerfectPowers.new Pair(1, 2);
		pair2 = PerfectPowers.new Pair(2, 1);
		assertEquals(-1, pair1.compareTo(pair2));
		assertEquals(1, pair2.compareTo(pair1));
	}
	
	@Test
	public void test025() {
		pair = PerfectPowers.new Pair(2, 1);
		assertEquals("(2, 2, 1)", pair.toString());
	}
	
	@Test
	public void test026() {
		pair = PerfectPowers.new Pair(2, 3);
		assertEquals("(8, 2, 3)", pair.toString());
	}
	
	@Test
	public void test027() {
		pair = PerfectPowers.new Pair(3, 4);
		assertEquals("(81, 3, 4)", pair.toString());
	}
	
	@Test
	public void test029() {
		expected = new PerfectPowers.Pair[]{};
		result = PerfectPowers.of(1);
		assertEquals(new ArrayList<PerfectPowers.Pair>(Arrays.asList(expected)), new ArrayList<PerfectPowers.Pair>(Arrays.asList(result)));
	}
	
	@Test
	public void test030() {
		expected = new PerfectPowers.Pair[]{p(1, 1)};
		result = PerfectPowers.of(2);
		assertEquals(new ArrayList<PerfectPowers.Pair>(Arrays.asList(expected)), new ArrayList<PerfectPowers.Pair>(Arrays.asList(result)));
	}
	
	@Test
	public void test040() {
		expected = new PerfectPowers.Pair[]{p(1, 1), p(1, 2), p(2, 2)};
		result = PerfectPowers.of(3);
		assertEquals(new ArrayList<PerfectPowers.Pair>(Arrays.asList(expected)), new ArrayList<PerfectPowers.Pair>(Arrays.asList(result)));
	}
	
	@Test
	public void test044() {
		expected = new PerfectPowers.Pair[]{p(1, 1), p(1, 2), p(1, 3), p(2, 2), p(2, 3), p(3, 3)};
		result = PerfectPowers.of(4);
		assertEquals(new ArrayList<PerfectPowers.Pair>(Arrays.asList(expected)), new ArrayList<PerfectPowers.Pair>(Arrays.asList(result)));
	}
	
	@Test
	public void test050() {
		PerfectPowers sumOfCubes = new PerfectPowers();
		sumOfCubes.equalCubes(50);
	}
	
		private PerfectPowers.Pair p(int a, int b) {
			return PerfectPowers.new Pair(a, b);
		}

}
