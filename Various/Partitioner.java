public class Partitioner {

	public int partitionWhenPivotAtStart(Integer[] A, int start, int end) {
		if (end - start == 0)
			return start;
		int pivot = A[start];
		int i = start + 1;
		int j = start + 1;
		while (j <= end) {
			if (A[j] <= pivot)
				swap(A, i++, j++);
			else
				j++;
		}
		swap(A, i-1, start);
		return i-1;
	}

	private void swap(Integer[] A, int i, int j) {
		int temp = A[i];
		A[i] = A[j];
		A[j] = temp;
	}

}
