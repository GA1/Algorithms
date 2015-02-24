package dijk;

import java.util.ArrayList;
import java.util.List;

public class Dijk {

	public Integer[]  runDijkstra(Graph graph, Integer startVertex) {
		int N = graph.edges.keySet().size();
		Integer[] distances = new Integer[N];
		boolean[] visited = new boolean[N];
		for (int i = 0; i < distances.length; i++) {
			distances[i] = Integer.MAX_VALUE;
			visited[i] = false;
		}
		distances[startVertex] = 0;
		while (thereIsUnvisitedNode(visited)) {
			Integer tempVertex = getUnvisitedVertexWithSmallestDistance(distances, visited);
			Integer distanceToTemp = distances[tempVertex];
			List<Integer> neighbors = graph.edges.get(tempVertex);
			List<Integer> unvistedNeighbors = extractUnvisitedNeigbors(neighbors, visited);
			for (Integer neighbor : unvistedNeighbors) {
				Integer newDistance = distanceToTemp + graph.getCost(tempVertex, neighbor);
				if (newDistance < distances[neighbor])
					distances[neighbor] = newDistance;
			}
			visited[tempVertex] = true;
		}
		return distances;
	}

	private List<Integer> extractUnvisitedNeigbors(List<Integer> neighbors, boolean[] visited) {
		ArrayList<Integer> unvisitedNeighbors = new ArrayList<Integer>();
		for (Integer n: neighbors)
			if (!visited[n])
				unvisitedNeighbors.add(n);
		return unvisitedNeighbors;
	}

	private Integer getUnvisitedVertexWithSmallestDistance(Integer[] distances, boolean[] visited) {
		int bestDistance = Integer.MAX_VALUE;
		int bestVertex = -1;
		for (int i = 0; i < distances.length; i++)
			if (!visited[i]) {
				if (distances[i] < bestDistance) {
					bestDistance = distances[i];
					bestVertex = i;
				}
			}
		return bestVertex;
	}

	private boolean thereIsUnvisitedNode(boolean[] visited) {
		for (int i = 0; i < visited.length; i++)
			if (!visited[i])
				return true;
		return false;
	}
}
