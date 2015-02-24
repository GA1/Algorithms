
public class QuickSort implements Sorting{

	@Override
	public Integer[] of(Integer[] A) {
		if (A == null)
			return null;
		quickSort(A, 0, A.length-1);
		return A;
	}

		private void quickSort(Integer[] A, int start, int end) {
			if (end - start < 1)
				return;
			int pivotIndex = start + (end-start)/2;
			int pivot = pivot(A, start, pivotIndex, end);
			quickSort(A, start, pivot-1);
			quickSort(A, pivot+1, end);
		}		
			int pivot(Integer[] A, int start, int pivotIndex, int end) {
				int pivotValue = A[pivotIndex];
				swap(A, start, pivotIndex);
				int i = start + 1;
				int j = end;
				while(true) {
					while (i <= end) {
						if (A[i] <= pivotValue)
							i++;
						else break;
					}
					while (start + 1 <= j) {
						if (pivotValue <= A[j])
							j--;
						else break;
					}
					if (i >= j)
						break;
					swap(A, i, j);
				}
				swap(A, start, j);
				return j;
			}			
				private void swap(Integer[] A, int i, int j) {
					int temp = A[i];
					A[i] = A[j];
					A[j] = temp;
				}
}
