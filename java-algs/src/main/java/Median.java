import externalhelpers.MaxPQ;
import externalhelpers.MinPQ;

public class Median {

	private MinPQ<Integer> minPq;
	private MaxPQ<Integer> maxPq;
	Integer leftValue;
	Integer rightValue;

	public Median() {
		minPq = new MinPQ<Integer>();
		maxPq = new MaxPQ<Integer>();
	}

	private boolean isEmpty() {
		return minPq.isEmpty() && maxPq.isEmpty();
	}
	
	public Double of() {
		if (isEmpty())
			return null;
		if (maxPq.size() == minPq.size())
			return getAverageValue();
		else
			return (double) leftValue;
	}

	public void insert(Integer v) {
		if (maxPq.size() == minPq.size())
			maxPq.insert(v);
		else
			minPq.insert(v);
		balance();
	}
	
	private void balance() {
		if (!minPq.isEmpty()) {
			if (maxPq.max() > minPq.min()) {
				Integer min = minPq.delMin();
				Integer max = maxPq.delMax();
				minPq.insert(max);
				maxPq.insert(min);
			}
			rightValue = minPq.min();
		}
		leftValue = maxPq.max();
	}
		private Double getAverageValue() {
			return (double) (leftValue + rightValue) / 2.0;
		}
}
