package dijk;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		Graph graph = new Graph("dijkstraData.txt");
		System.out.println(graph.edges);
		Dijk algorithms = new Dijk();
		Integer[] results = algorithms.runDijkstra(graph, 0);
		System.out.println(getResultNeededForTheAssignment(results));		
	}

	private static List<Integer> getResultNeededForTheAssignment(Integer[] results) {
		ArrayList<Integer> resultsForTheAssignment = new ArrayList<Integer>();
		resultsForTheAssignment.add(results[6]);
		resultsForTheAssignment.add(results[36]);
		resultsForTheAssignment.add(results[58]);
		resultsForTheAssignment.add(results[81]);
		resultsForTheAssignment.add(results[98]);
		resultsForTheAssignment.add(results[114]);
		resultsForTheAssignment.add(results[132]);
		resultsForTheAssignment.add(results[164]);
		resultsForTheAssignment.add(results[187]);
		resultsForTheAssignment.add(results[196]);
		return resultsForTheAssignment;
	}

	private static List<Integer> getResultNeededForTheAssignment1(Integer[] results) {
		ArrayList<Integer> resultsForTheAssignment = new ArrayList<Integer>();
		resultsForTheAssignment.add(results[9]);
		resultsForTheAssignment.add(results[29]);
		resultsForTheAssignment.add(results[49]);
		resultsForTheAssignment.add(results[79]);
		resultsForTheAssignment.add(results[79]);
		resultsForTheAssignment.add(results[89]);
		resultsForTheAssignment.add(results[109]);
		resultsForTheAssignment.add(results[129]);
		resultsForTheAssignment.add(results[159]);
		resultsForTheAssignment.add(results[179]);
		resultsForTheAssignment.add(results[189]);
		return resultsForTheAssignment;
	}

}
