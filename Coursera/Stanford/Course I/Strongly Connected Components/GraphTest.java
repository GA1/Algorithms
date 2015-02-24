import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.Arrays;
import org.junit.Test;
import com.google.common.collect.LinkedListMultimap;

public class GraphTest {

	
	private Graph graph;
	private LinkedListMultimap<Integer, Integer> graphInput = LinkedListMultimap.create();
	
	@Test
	public void test005() {
		graphInput.put(0, 1);
		graph = new Graph(graphInput);
		assertTrue(graph.contains(0, 1));
		assertEquals(1, graph.size());
	}
	
	@Test
	public void test007() {
		graphInput.put(0, 1);
		graphInput.put(0, 2);
		graph = new Graph(graphInput);
		assertTrue(graph.contains(0, 1));
		assertTrue(graph.contains(0, 2));
		assertEquals(2, graph.size());
	}
	
	@Test
	public void test008() {
		graphInput.put(0, 1);
		graphInput.put(0, 2);
		graphInput.put(3, 4);
		graph = new Graph(graphInput);
		assertTrue(graph.contains(0, 1));
		assertTrue(graph.contains(0, 2));
		assertEquals(3, graph.size());
	}
	
	@Test
	public void test009() {
		graphInput.put(4, 3);
		graph = new Graph(graphInput);
		assertTrue(graph.contains(1, 0));
		assertEquals(1, graph.size());
	}
	
	@Test
	public void test010() {
		graphInput.put(4, 3);
		graphInput.put(3, 4);
		graph = new Graph(graphInput);
		assertTrue(graph.contains(0, 1));
		assertTrue(graph.contains(1, 0));
		assertEquals(2, graph.size());
	}
	
	@Test
	public void test011() {
		graphInput.put(4, 3);
		graphInput.put(3, 4);
		graphInput.put(3, 5);
		graph = new Graph(graphInput);
		assertTrue(graph.contains(1, 0));
		assertTrue(graph.contains(0, 1));
		assertTrue(graph.contains(0, 2));
		assertEquals(3, graph.size());
	}
	
	@Test
	public void test015() {
		graphInput.put(1, 2);
		graph = new Graph(graphInput);
		assertTrue(graph.contains(0, 1));
		assertEquals(1, graph.size());
	}
	
	@Test
	public void test017() {
		graphInput.put(1, 2);
		graph = new Graph(graphInput);
		graph.reversEdges();
		assertTrue(graph.contains(1, 0));
		assertEquals(1, graph.size());
	}
	
	@Test
	public void test020() {
		graphInput.put(0, 1);
		graphInput.put(1, 0);
		graph = new Graph(graphInput);
		graph.reversEdges();
		assertTrue(graph.contains(0, 1));
		assertTrue(graph.contains(1, 0));
		assertEquals(2, graph.size());
	}
	
	@Test
	public void test030() {
		graphInput.put(1, 2);
		graphInput.put(1, 3);
		graphInput.put(2, 4);
		graph = new Graph(graphInput);
		graph.reversEdges();
		assertTrue(graph.contains(1, 0));
		assertTrue(graph.contains(2, 0));
		assertTrue(graph.contains(3, 1));
		assertEquals(3, graph.size());
	}
	
	@Test
	public void test040() {
		graphInput.put(0, 1);
		graph = new Graph(graphInput);
		Integer[] order = graph.firstDFS();
		assertEquals(new ArrayList<Integer>(Arrays.asList(new Integer[]{1, 0})), Arrays.asList(order));
	}
	
	@Test
	public void test050() {
		graphInput.put(0, 1);
		graphInput.put(1, 0);
		graph = new Graph(graphInput);
		Integer[] order = graph.firstDFS();
		assertEquals(new ArrayList<Integer>(Arrays.asList(new Integer[]{1, 0})), Arrays.asList(order));
	}
	
	@Test
	public void test060() {
		graphInput.put(0, 1);
		graphInput.put(1, 2);
		graph = new Graph(graphInput);
		Integer[] order = graph.firstDFS();
		assertEquals(new ArrayList<Integer>(Arrays.asList(new Integer[]{2, 1, 0})), Arrays.asList(order));
	}
	
	@Test
	public void test070() {
		graphInput.put(0, 1);
		graphInput.put(1, 2);
		graphInput.put(2, 3);
		graphInput.put(3, 1);
		graph = new Graph(graphInput);
		Integer[] order = graph.firstDFS();
		assertEquals(new ArrayList<Integer>(Arrays.asList(new Integer[]{3, 2, 1, 0})), Arrays.asList(order));
	}
	
	@Test
	public void test080() {
		graphInput.put(0, 1);
		graphInput.put(2, 3);
		graph = new Graph(graphInput);
		Integer[] order = graph.firstDFS();
		assertEquals(new ArrayList<Integer>(Arrays.asList(new Integer[]{1, 0, 3, 2})), Arrays.asList(order));
	}
	
	@Test
	public void test090() {
		graphInput.put(1, 0);
		graph = new Graph(graphInput);
		Integer[] order = graph.firstDFS();
		assertEquals(new ArrayList<Integer>(Arrays.asList(new Integer[]{0, 1})), Arrays.asList(order));
	}
	
}
