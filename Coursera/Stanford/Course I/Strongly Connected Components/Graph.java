import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

import com.google.common.collect.LinkedListMultimap;

public class Graph {

	LinkedListMultimap<Integer, Integer> edges;
	final int numberOfVertices;

	public Graph(LinkedListMultimap<Integer, Integer> edgesFromFile) {
		HashMap<Integer, Integer> mapping = getMapping(edgesFromFile);
		edges = mapEdgesToNumbersFrom0ToNMinus1(edgesFromFile, mapping);
		numberOfVertices = mapping.size();
	}

	private HashMap<Integer, Integer> getMapping(LinkedListMultimap<Integer, Integer> edgesFromFile) {
		HashMap<Integer, Boolean> vertices = new HashMap<Integer, Boolean>();
		for (Entry<Integer, Integer> e : edgesFromFile.entries()) {
			vertices.put(e.getKey(), true);
			vertices.put(e.getValue(), true);
		}
		Integer[] sortedVertices = sortVertices(vertices);
		HashMap<Integer, Integer> mapping = new HashMap<Integer, Integer>();
		for (int i = 0; i < sortedVertices.length; i++)
			mapping.put(sortedVertices[i], i);
		return mapping;
	}

	private Integer[] sortVertices(HashMap<Integer, Boolean> vertices) {
		Integer[] sortedVertices = copyHashMapToArray(vertices);
		Arrays.sort(sortedVertices);
		return sortedVertices;
	}

	private Integer[] copyHashMapToArray(HashMap<Integer, Boolean> vertices) {
		Integer[] result = new Integer[vertices.size()];
		int counter = 0;
		for (Integer v : vertices.keySet())
			result[counter++] = v;
		return result;
	}

	private LinkedListMultimap<Integer, Integer> mapEdgesToNumbersFrom0ToNMinus1(LinkedListMultimap<Integer, Integer> edgesFromFile, HashMap<Integer, Integer> mapping) {
		Integer v1, v2, mappedV1, mappedV2;
		LinkedListMultimap<Integer, Integer> mappedEdges = LinkedListMultimap.create();
		for (Entry<Integer, Integer> e : edgesFromFile.entries()) {
			v1 = e.getKey();
			v2 = e.getValue();
			mappedV1 = mapping.get(v1);
			mappedV2 = mapping.get(v2);
			mappedEdges.put(mappedV1, mappedV2);
		}
		return mappedEdges;
	}

	public boolean contains(Integer v1, Integer v2) {
		return edges.containsEntry(v1, v2);
	}

	public int size() {
		return edges.values().size();
	}

	public void reversEdges() {
		LinkedListMultimap<Integer, Integer> reversedEdges = LinkedListMultimap
				.create();
		for (Entry<Integer, Integer> e : edges.entries())
			reversedEdges.put(e.getValue(), e.getKey());
		edges = reversedEdges;
	}

	public Integer[] firstDFS() {
		Integer[] order = new Integer[numberOfVertices];
		boolean[] visited = new boolean[numberOfVertices];
		int alreadyOrdered = 0;
		for (int i = 0; i < visited.length; i++) 
			if (!visited[i])
				alreadyOrdered = firstDFS(i, order, visited, alreadyOrdered);
		return order;
	}

		private int firstDFS(int start, Integer[] order, boolean[] visited, int alreadyOrdered) {
			visited[start] = true;
			for (Integer neighbor : edges.get(start))
				if (isNotVisited(visited, neighbor))
					alreadyOrdered = firstDFS(neighbor, order, visited, alreadyOrdered);
			order[start] = alreadyOrdered;
			return alreadyOrdered + 1;
		}
	
			private boolean isNotVisited(boolean[] visited, int neighbor) {
				return visited[neighbor] == false;
			}

	public Integer[] secondDFS(Integer[] priority) {
		List<Integer> sizesOfComponents = new ArrayList<Integer>();
		boolean[] visited = new boolean[numberOfVertices];
		for (int i = visited.length-1; i >= 0; i--) { 
			if (!visited[priority[i]]) {
				int sizeOfComponent = 0;
				sizeOfComponent = secondDFS(priority[i], visited, sizeOfComponent);
				sizesOfComponents.add(sizeOfComponent);
			}
		}
		Integer[] sizesOfComponentsInArray = copyArraylistToArray(sizesOfComponents); 
		Arrays.sort(sizesOfComponentsInArray, Collections.reverseOrder());
		return sizesOfComponentsInArray;
	}
		private Integer[] copyArraylistToArray(List<Integer> components) {
			Integer[] array = new Integer[components.size()];
			for (int i = 0; i < array.length; i++) 
				array[i] = components.get(i);
			return array;
		}
	
		private int secondDFS(int start, boolean[] visited, int alreadyOrdered) {
			visited[start] = true;
			for (Integer neighbor : edges.get(start))
				if (isNotVisited(visited, neighbor))
					alreadyOrdered = secondDFS(neighbor, visited, alreadyOrdered);
			return alreadyOrdered + 1;
		}

}
