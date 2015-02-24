import java.util.Collections;
import java.util.PriorityQueue;



public class MedianFinder {

	private static final int INITIAL_CAPACITY = 10000;
	
	PriorityQueue<Long> minQueue;
	PriorityQueue<Long> maxQueue;
	
	MedianFinder() {
		minQueue = new PriorityQueue<Long >(INITIAL_CAPACITY);
		maxQueue = new PriorityQueue<Long >(INITIAL_CAPACITY, Collections.reverseOrder());
	}
	
	
	
	public Long find() {
		return maxQueue.peek();
	}

	public int size() {
		return minQueue.size() + maxQueue.size();
	}
	
	public void insert(Long i) {
		if (size() == 0)
			maxQueue.add(i);
		else {
			if (maxQueue.size() == minQueue.size())
				if (minQueue.peek() < i) {
					Long min = minQueue.poll();
					maxQueue.add(min);
					minQueue.add(i);
				} else 
					maxQueue.add(i);
			else {
				if (maxQueue.peek() > i) {
					Long max = maxQueue.poll();
					minQueue.add(max);
					maxQueue.add(i);
				} else
					minQueue.add(i);
			}
		}
	}

}
