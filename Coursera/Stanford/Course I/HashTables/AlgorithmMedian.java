import java.util.List;


public class AlgorithmMedian {

	
	public int compute(List<Long> numbers) {
		MedianFinder finder = new MedianFinder();

		Long sumOfMedians = 0l;
		for (Long i : numbers) {
			finder.insert(i);
			sumOfMedians += finder.find();
		}
		return (int)(sumOfMedians % 10000);
		
	}
	
	
}
