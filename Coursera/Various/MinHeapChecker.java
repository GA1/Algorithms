public class MinHeapChecker {

	public boolean check(Integer[] minHeap, int size) {

		return check(minHeap, size, 0);
	}

	private boolean check(Integer[] minHeap, int size, int curr) {
//		if (curr >= size) 
//			return true;
		int left = curr*2 + 1;
		int right = curr*2 + 2;
		if (left < size)
			if (minHeap[curr] > minHeap[left] || !check(minHeap, size, left))
				return false;
		if (right < size)
			if (minHeap[curr] > minHeap[right] || !check(minHeap, size, right))
				return false;
		return true;
	}
}
