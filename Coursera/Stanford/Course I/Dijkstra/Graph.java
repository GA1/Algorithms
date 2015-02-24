package dijk;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import com.google.common.collect.LinkedListMultimap;

public class Graph {

	LinkedListMultimap<Integer, Integer> edges;
	HashMap<Edge, Integer> costs;

	public Graph() {
		edges = LinkedListMultimap.create();
		costs = new HashMap<Edge, Integer>();
	}
	
	public Graph(String fileName) throws IOException {
		this();
		loadInputForGraph(fileName);
	}
	
	private void loadInputForGraph(String fileName) {
		
		List<String> stringsFromFile = null;
		try {
			stringsFromFile = TxtFileProcessing.readLinesFromFile(fileName);
		} catch (IOException e) {
			e.printStackTrace();
		}
		for (String line : stringsFromFile) {
			String[] splittedBySpace = line.split("\\s+");
			Integer v1 = Integer.parseInt(splittedBySpace[0]) - 1;
			for (int i = 1; i < splittedBySpace.length; i++) {
				String[] splittedByColon = splittedBySpace[i].split(",");
				Integer v2 = Integer.parseInt(splittedByColon[0]) - 1;
				Integer cost = Integer.parseInt(splittedByColon[1]);
				edges.put(v1, v2);
				costs.put(new Edge(v1, v2), cost);
			}
		}
	}

	public Integer getCost(int v1, int v2) {
		return costs.get(new Edge(v1, v2));
	}
}
