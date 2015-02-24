import java.io.IOException;
import java.util.ArrayList;
import java.util.List;



public class Problem2 {

	public static void main(String[] args) throws IOException {
		
		String fileName = "Median.txt";
		MedianFinder finder = new MedianFinder();
		List<String> lines = TxtFileProcessing.readLinesFromFile(fileName);
		
		List<Long> numbers = convertStringsToNumbers(lines);
		
		AlgorithmMedian alg = new AlgorithmMedian();
		System.out.println(alg.compute(numbers));
	}


	private static List<Long> convertStringsToNumbers(List<String> lines) {
		List<Long> numbers = new ArrayList<Long>();
		for (String line : lines)
			numbers.add(Long.parseLong(line));
		return numbers;
	}
}
