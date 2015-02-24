import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

import com.google.common.collect.LinkedListMultimap;

public class AlgorithmTest {

	private Graph graph;
	private Integer[] result, expected;
	private LinkedListMultimap<Integer, Integer> graphInput = LinkedListMultimap
			.create();

	@Test
	public void test100() {
		Integer[] order = new Integer[] { 0 };
		Integer[] expected = new Integer[] { 0 };
		Integer[] result = Algorithm.indicesToValues(order);
		assertEquals(Arrays.asList(expected), Arrays.asList(result));
	}

	@Test
	public void test110() {
		Integer[] order = new Integer[] { 1, 0 };
		Integer[] expected = new Integer[] { 1, 0 };
		Integer[] result = Algorithm.indicesToValues(order);
		assertEquals(Arrays.asList(expected), Arrays.asList(result));
	}

	@Test
	public void test120() {
		Integer[] order = new Integer[] { 1, 2, 0 };
		Integer[] expected = new Integer[] { 2, 0, 1 };
		Integer[] result = Algorithm.indicesToValues(order);
		assertEquals(Arrays.asList(expected), Arrays.asList(result));
	}

	@Test
	public void test130() {
		graphInput.put(0, 1);
		graph = new Graph(graphInput);
		result = Algorithm.findStrongComponents(graph);
		expected = new Integer[] { 1, 1, 0, 0, 0 };
		assertEquals(Arrays.asList(expected), Arrays.asList(result));
	}

	@Test
	public void test140() {
		graphInput.put(1, 0);
		graph = new Graph(graphInput);
		result = Algorithm.findStrongComponents(graph);
		expected = new Integer[] { 1, 1, 0, 0, 0 };
		assertEquals(Arrays.asList(expected), Arrays.asList(result));
	}

	@Test
	public void test150() {
		graphInput.put(1, 0);
		graphInput.put(0, 1);
		graph = new Graph(graphInput);
		result = Algorithm.findStrongComponents(graph);
		expected = new Integer[] { 2, 0, 0, 0, 0 };
		assertEquals(Arrays.asList(expected), Arrays.asList(result));
	}

	@Test
	public void test160() {
		graphInput.put(1, 0);
		graphInput.put(0, 1);
		graph = new Graph(graphInput);
		result = Algorithm.findStrongComponents(graph);
		expected = new Integer[] { 2, 0, 0, 0, 0 };
		assertEquals(Arrays.asList(expected), Arrays.asList(result));
	}

	@Test
	public void test170() {
		graphInput.put(1, 0);
		graphInput.put(0, 1);
		graphInput.put(1, 2);
		graph = new Graph(graphInput);
		result = Algorithm.findStrongComponents(graph);
		expected = new Integer[] { 2, 1, 0, 0, 0 };
		assertEquals(Arrays.asList(expected), Arrays.asList(result));
	}

	@Test
	public void test180() {
		graphInput.put(1, 0);
		graphInput.put(0, 1);
		graphInput.put(1, 2);
		graphInput.put(2, 1);
		graph = new Graph(graphInput);
		result = Algorithm.findStrongComponents(graph);
		expected = new Integer[] { 3, 0, 0, 0, 0 };
		assertEquals(Arrays.asList(expected), Arrays.asList(result));
	}

	@Test
	public void test190() {
		graphInput.put(1, 4);
		graphInput.put(2, 8);
		graphInput.put(3, 6);
		graphInput.put(4, 7);
		graphInput.put(5, 2);
		graphInput.put(6, 9);
		graphInput.put(7, 1);
		graphInput.put(8, 5);
		graphInput.put(8, 6);
		graphInput.put(9, 7);
		graphInput.put(9, 3);
		graph = new Graph(graphInput);
		result = Algorithm.findStrongComponents(graph);
		expected = new Integer[] { 3, 3, 3, 0, 0 };
		assertEquals(Arrays.asList(expected), Arrays.asList(result));
	}

	@Test
	public void test200() {
		graphInput.put(1, 9);
		graphInput.put(1, 7);
		graphInput.put(2, 6);
		graphInput.put(3, 6);
		graphInput.put(4, 1);
		graphInput.put(4, 6);
		graphInput.put(14, 2);
		graphInput.put(6, 3);
		graphInput.put(7, 9);
		graphInput.put(9, 4);
		graphInput.put(3, 1);
		graph = new Graph(graphInput);
		result = Algorithm.findStrongComponents(graph);
		expected = new Integer[] { 6, 1, 1, 0, 0 };
		assertEquals(Arrays.asList(expected), Arrays.asList(result));
	}

	@Test
	public void test205() {
		graphInput.put(1, 9);
		graphInput.put(1, 7);
		graphInput.put(2, 6);
		graphInput.put(3, 6);
		graphInput.put(4, 1);
		graphInput.put(4, 6);
		graphInput.put(14, 2);
		graphInput.put(6, 3);
		graphInput.put(7, 9);
		graphInput.put(9, 4);
		graphInput.put(3, 1);
		graph = new Graph(graphInput);
		result = Algorithm.findStrongComponents(graph);
		expected = new Integer[] { 6, 1, 1, 0, 0 };
		assertEquals(Arrays.asList(expected), Arrays.asList(result));
	}

	@Test
	public void test210() {
		graphInput.put(1, 4);
		graphInput.put(4, 3);
		graphInput.put(3, 1);
		graphInput.put(4, 6);
		graphInput.put(6, 7);
		graphInput.put(6, 10);
		graphInput.put(10, 11);
		graphInput.put(11, 10);
		graphInput.put(7, 6);
		graphInput.put(2, 5);
		graphInput.put(5, 2);
		graphInput.put(5, 7);
		graphInput.put(5, 8);
		graphInput.put(8, 9);
		graphInput.put(7, 11);
		graph = new Graph(graphInput);
		result = Algorithm.findStrongComponents(graph);
		expected = new Integer[] { 3, 2, 2, 2, 1 };
		assertEquals(Arrays.asList(expected), Arrays.asList(result));
	}

}
