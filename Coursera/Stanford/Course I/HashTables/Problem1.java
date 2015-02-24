import java.io.IOException;
import java.util.ArrayList;
import java.util.List;



public class Problem1 {

	public static void main(String[] args) throws IOException {
		
		String fileName = "algo1-programming_prob-2sum.txt";
		TwoSum twoSumChecker = new TwoSum();
		List<String> lines = TxtFileProcessing.readLinesFromFile(fileName);
		System.out.println(lines.size());
		
		List<Long> numbers = convertStringToNumbers(lines);
		
		Algorithm2Sum alg = new Algorithm2Sum();
		System.out.println(alg.compute(numbers));
	}


	private static List<Long> convertStringToNumbers(List<String> lines) {
		List<Long> numbers = new ArrayList<Long>();
		for (String line : lines)
			numbers.add(Long.parseLong(line));
		return numbers;
	}
}
