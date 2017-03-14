
public class HeapSort implements Sorting{

	@Override
	public Integer[] of(Integer[] A) {
		if (A == null)
			return null;
		PriorityQueue pq = new PriorityQueue();
		for (int i = 0; i < A.length; i++) 
			pq.insert(A[i]);
		Integer[] sorted = new Integer[A.length];
		for (int i = 0; i < A.length; i++) 
			sorted[i] = pq.delMax();
		for (int i = 0; i < A.length; i++) 
			A[i] = sorted[A.length - 1 - i];
		return A;
	}

}
