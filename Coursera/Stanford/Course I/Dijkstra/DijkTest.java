package dijk;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class DijkTest {

	private Dijk dijkstra = new Dijk();
	private Graph graph = new Graph();
	private Integer[] distances;
	private Integer[] expected;
	
	@Test
	public void test010() {
		addEdgeAndReversedEdge(0, 1, 5);
		distances = dijkstra.runDijkstra(graph, 0);
		expected = new Integer[]{0, 5};
		assertEquals(Arrays.asList(expected), Arrays.asList(distances));
	}
	
	@Test
	public void test020() {
		addEdgeAndReversedEdge(0, 1, 5);
		addEdgeAndReversedEdge(1, 2, 7);
		distances = dijkstra.runDijkstra(graph, 0);
		expected = new Integer[]{0, 5, 12};
		assertEquals(Arrays.asList(expected), Arrays.asList(distances));
	}
	
	@Test
	public void test030() {
		addEdgeAndReversedEdge(0, 1, 5);
		addEdgeAndReversedEdge(1, 3, 6);
		addEdgeAndReversedEdge(1, 2, 7);
		distances = dijkstra.runDijkstra(graph, 0);
		expected = new Integer[]{0, 5, 12, 11};
		assertEquals(Arrays.asList(expected), Arrays.asList(distances));
	}
	
	@Test
	public void test040() {
		addEdgeAndReversedEdge(0, 1, 10);
		addEdgeAndReversedEdge(1, 2, 5);
		addEdgeAndReversedEdge(0, 2, 20);
		distances = dijkstra.runDijkstra(graph, 0);
		expected = new Integer[]{0, 10, 15};
		assertEquals(Arrays.asList(expected), Arrays.asList(distances));
	}
	
	@Test
	public void test050() {
		addEdgeAndReversedEdge(0, 1, 10);
		addEdgeAndReversedEdge(1, 2, 5);
		addEdgeAndReversedEdge(0, 2, 20);
		addEdgeAndReversedEdge(1, 3, 20);
		addEdgeAndReversedEdge(2, 3, 20);
		distances = dijkstra.runDijkstra(graph, 0);
		expected = new Integer[]{0, 10, 15, 30};
		assertEquals(Arrays.asList(expected), Arrays.asList(distances));
	}
	
	@Test
	public void test060() {
		addEdgeAndReversedEdge(0, 1, 10);
		addEdgeAndReversedEdge(1, 2, 5);
		addEdgeAndReversedEdge(0, 2, 20);
		addEdgeAndReversedEdge(1, 3, 20);
		addEdgeAndReversedEdge(2, 3, 7);
		distances = dijkstra.runDijkstra(graph, 0);
		expected = new Integer[]{0, 10, 15, 22};
		assertEquals(Arrays.asList(expected), Arrays.asList(distances));
	}
	
	private void addEdgeAndReversedEdge(int v1, int v2, int cost) {
		graph.edges.put(v1, v2);
		graph.edges.put(v2, v1);
		graph.costs.put(new Edge(v1, v2), cost);
		graph.costs.put(new Edge(v2, v1), cost);
	}
	
}
