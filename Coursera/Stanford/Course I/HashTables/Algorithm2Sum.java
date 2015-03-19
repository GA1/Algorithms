import java.util.List;


public class Algorithm2Sum {
	
	public int compute(List<Long> numbers) {
		TwoSum twoSumChecker = new TwoSum();
		for (Long number : numbers)
			twoSumChecker.insert(number);

		int counter = 0;
		for (int i = -10000; i <= 10000; i++)
			if (twoSumChecker.hasSum(i))
				counter++;
		return counter;
	}
}
