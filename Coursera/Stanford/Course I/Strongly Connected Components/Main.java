
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import com.google.common.collect.LinkedListMultimap;

public class Main {

	public static void main(String[] args) throws IOException {
		System.out.println("poczatek wgrywania pliku");
		LinkedListMultimap<Integer, Integer> edgesFromFile = loadInputForGraph("SCC.txt");
		System.out.println("poczatek konwertowania");
		Graph graph = new Graph(edgesFromFile);
		System.out.println("poczatek liczenia algorytmu");
		System.out.println(new ArrayList<Integer>(Arrays.asList(Algorithm.findStrongComponents(graph))));
	}

	private static LinkedListMultimap<Integer, Integer> loadInputForGraph(String fileName) throws IOException {
		
		LinkedListMultimap<Integer, Integer> edgesFromFile = LinkedListMultimap.create();;
		List<String> stringsFromFile = TxtFileProcessing.readLinesFromFile(fileName);
		int counter = 0;
		for (String line : stringsFromFile) {
			String[] splitted = line.split("\\s+");
			edgesFromFile.put(Integer.parseInt(splitted[0]), Integer.parseInt(splitted[1]));
			if (counter%1000000 == 0)
				System.out.println(counter);
			counter++;
		}
		return edgesFromFile;
	}

}
